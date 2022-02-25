/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MSignature;

import org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MSignatureToTSignature;

import org.gravity.tgg.modisco.pm.Rules.LinkDefinitionToAnonymous;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
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
 * An implementation of the model object '<em><b>Link Definition To Anonymous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LinkDefinitionToAnonymousImpl extends AbstractRuleImpl implements LinkDefinitionToAnonymous {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkDefinitionToAnonymousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLinkDefinitionToAnonymous();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance,
			MDefinition mDefinition, MSignature mSignature) {

		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_0_1_initialbindings_blackBBBBBB(this, match, mAnonymous, mInstance,
						mDefinition, mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mInstance] = " + mInstance
					+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mAnonymous,
						mInstance, mDefinition, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mInstance] = " + mInstance
					+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_blackBBBBB(match, mAnonymous,
							mInstance, mDefinition, mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnonymous] = " + mAnonymous + ", " + "[mInstance] = " + mInstance + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
			}
			LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_greenBBBFF(match, mAnonymous,
							mDefinition);
			//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result4_green[4];

			Object[] result5_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_blackBBBBB(match, mAnonymous,
							mInstance, mDefinition, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnonymous] = " + mAnonymous + ", " + "[mInstance] = " + mInstance + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mSignature] = " + mSignature + ".");
			}
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_greenBBBBBFFFF(
					match, mAnonymous, mInstance, mDefinition, mSignature);
			//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge mAnonymous__mInstance____classInstanceCreation = (EMoflonEdge) result5_green[8];

			// 
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_6_registerobjectstomatch_expressionBBBBBB(
					this, match, mAnonymous, mInstance, mDefinition, mSignature);
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_7_expressionF();
		} else {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[0];
		ClassInstanceCreation mInstance = (ClassInstanceCreation) result1_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[2];
		TClass tAnonymous = (TClass) result1_bindingAndBlack[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[4];
		TMember tDefinition = (TMember) result1_bindingAndBlack[5];
		MSignature mSignature = (MSignature) result1_bindingAndBlack[6];
		AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[7];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[8];
		TSignature tSignature = (TSignature) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_1_performtransformation_greenBBB(tAnonymous,
				tDefinition, tSignature);

		Object[] result2_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, mAnonymous,
						mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
						mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mInstance] = " + mInstance + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[tAnonymous] = " + tAnonymous + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[tDefinition] = " + tDefinition
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mAnonymousToTAnonymous] = "
					+ mAnonymousToTAnonymous + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
					+ "[tSignature] = " + tSignature + ".");
		}
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mAnonymous, mDefinition, tAnonymous, tDefinition, tSignature);
		//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result3_green[10];

		// 
		// 
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition,
				mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_binding[0];
		ClassInstanceCreation mInstance = (ClassInstanceCreation) result2_binding[1];
		MDefinition mDefinition = (MDefinition) result2_binding[2];
		MSignature mSignature = (MSignature) result2_binding[3];
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_2_2_corematch_blackBBBFFFBFFFB(mAnonymous, mInstance, mDefinition,
						mSignature, match)) {
			TClass tAnonymous = (TClass) result2_black[3];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[4];
			TMember tDefinition = (TMember) result2_black[5];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result2_black[7];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[8];
			TSignature tSignature = (TSignature) result2_black[9];
			// ForEach 
			for (Object[] result3_black : LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_2_3_findcontext_blackBBBBBBBBBB(mAnonymous, mInstance,
							mDefinition, tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
							mAnonymousToTAnonymous, mDefinitionToTMember, tSignature)) {
				Object[] result3_green = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFF(mAnonymous,
								mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
								mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mAnonymous__mInstance____classInstanceCreation = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[24];

				Object[] result4_bindingAndBlack = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous,
								mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous,
								mDefinitionToTMember, tSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mAnonymous] = " + mAnonymous
							+ ", " + "[mInstance] = " + mInstance + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[tAnonymous] = " + tAnonymous + ", " + "[mSignatureToTSignature] = "
							+ mSignatureToTSignature + ", " + "[tDefinition] = " + tDefinition + ", "
							+ "[mSignature] = " + mSignature + ", " + "[mAnonymousToTAnonymous] = "
							+ mAnonymousToTAnonymous + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
							+ "[tSignature] = " + tSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, MSignature mSignature) {
		match.registerObject("mAnonymous", mAnonymous);
		match.registerObject("mInstance", mInstance);
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, MSignature mSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, TClass tAnonymous,
			MSignatureToTSignature mSignatureToTSignature, TMember tDefinition, MSignature mSignature,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("mInstance", mInstance);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("tSignature", tSignature);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mAnonymous, EObject mInstance,
			EObject mDefinition, EObject tAnonymous, EObject mSignatureToTSignature, EObject tDefinition,
			EObject mSignature, EObject mAnonymousToTAnonymous, EObject mDefinitionToTMember, EObject tSignature) {
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("mInstance", mInstance);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tAnonymous, TMember tDefinition, TSignature tSignature) {

		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_10_1_initialbindings_blackBBBBB(this, match, tAnonymous, tDefinition,
						tSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[tSignature] = " + tSignature + ".");
		}

		Object[] result2_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tAnonymous,
						tDefinition, tSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[tSignature] = " + tSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_blackBBBB(match, tAnonymous,
							tDefinition, tSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = " + tDefinition + ", "
						+ "[tSignature] = " + tSignature + ".");
			}
			LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_greenBBBBFFF(match,
							tAnonymous, tDefinition, tSignature);
			//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result4_green[6];

			Object[] result5_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_blackBBBB(match, tAnonymous,
							tDefinition, tSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = " + tDefinition + ", "
						+ "[tSignature] = " + tSignature + ".");
			}
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_greenBBBBFF(
					match, tAnonymous, tDefinition, tSignature);
			//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result5_green[5];

			// 
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, tAnonymous, tDefinition, tSignature);
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_7_expressionF();
		} else {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[0];
		ClassInstanceCreation mInstance = (ClassInstanceCreation) result1_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[2];
		TClass tAnonymous = (TClass) result1_bindingAndBlack[3];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[4];
		TMember tDefinition = (TMember) result1_bindingAndBlack[5];
		MSignature mSignature = (MSignature) result1_bindingAndBlack[6];
		AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[7];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[8];
		TSignature tSignature = (TSignature) result1_bindingAndBlack[9];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[10];
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_1_performtransformation_greenBB(mAnonymous,
				mDefinition);

		Object[] result2_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, mAnonymous,
						mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
						mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mInstance] = " + mInstance + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[tAnonymous] = " + tAnonymous + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[tDefinition] = " + tDefinition
					+ ", " + "[mSignature] = " + mSignature + ", " + "[mAnonymousToTAnonymous] = "
					+ mAnonymousToTAnonymous + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
					+ "[tSignature] = " + tSignature + ".");
		}
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, mAnonymous, mDefinition, tAnonymous, tDefinition, tSignature);
		//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result3_green[10];

		// 
		// 
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_5_registerobjects_expressionBBBBBBBBBBBB(
				this, ruleresult, mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition,
				mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tAnonymous = (TClass) result2_binding[0];
		TMember tDefinition = (TMember) result2_binding[1];
		TSignature tSignature = (TSignature) result2_binding[2];
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_12_2_corematch_blackFFBFBFFFBB(tAnonymous, tDefinition, tSignature,
						match)) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[3];
			MSignature mSignature = (MSignature) result2_black[5];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result2_black[6];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[7];
			// ForEach 
			for (Object[] result3_black : LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_12_3_findcontext_blackBFBBBBBBBB(mAnonymous, mDefinition,
							tAnonymous, mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous,
							mDefinitionToTMember, tSignature)) {
				ClassInstanceCreation mInstance = (ClassInstanceCreation) result3_black[1];
				Object[] result3_green = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(mAnonymous,
								mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
								mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mAnonymous__mInstance____classInstanceCreation = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[25];

				Object[] result4_bindingAndBlack = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous,
								mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous,
								mDefinitionToTMember, tSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mAnonymous] = " + mAnonymous
							+ ", " + "[mInstance] = " + mInstance + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[tAnonymous] = " + tAnonymous + ", " + "[mSignatureToTSignature] = "
							+ mSignatureToTSignature + ", " + "[tDefinition] = " + tDefinition + ", "
							+ "[mSignature] = " + mSignature + ", " + "[mAnonymousToTAnonymous] = "
							+ mAnonymousToTAnonymous + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
							+ "[tSignature] = " + tSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tAnonymous, TMember tDefinition, TSignature tSignature) {
		match.registerObject("tAnonymous", tAnonymous);
		match.registerObject("tDefinition", tDefinition);
		match.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tAnonymous, TMember tDefinition, TSignature tSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, TClass tAnonymous,
			MSignatureToTSignature mSignatureToTSignature, TMember tDefinition, MSignature mSignature,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("mInstance", mInstance);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mAnonymous, EObject mInstance,
			EObject mDefinition, EObject tAnonymous, EObject mSignatureToTSignature, EObject tDefinition,
			EObject mSignature, EObject mAnonymousToTAnonymous, EObject mDefinitionToTMember, EObject tSignature) {
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("mInstance", mInstance);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_78(EMoflonEdge _edge_defines) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_20_2_testcorematchandDECs_blackFFFB(_edge_defines)) {
			TClass tAnonymous = (TClass) result2_black[0];
			TMember tDefinition = (TMember) result2_black[1];
			TSignature tSignature = (TSignature) result2_black[2];
			Object[] result2_green = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tAnonymous, tDefinition, tSignature)) {
				// 
				if (LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_83(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_blackFFFFB(_edge_bodyDeclarations)) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[0];
			ClassInstanceCreation mInstance = (ClassInstanceCreation) result2_black[1];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			MSignature mSignature = (MSignature) result2_black[3];
			Object[] result2_green = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, mAnonymous, mInstance, mDefinition, mSignature)) {
				// 
				if (LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LinkDefinitionToAnonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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
		ruleResult.setRule("LinkDefinitionToAnonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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

		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_bindingAndBlack[0];
		ClassInstanceCreation mInstance = (ClassInstanceCreation) result2_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[2];
		TClass tAnonymous = (TClass) result2_bindingAndBlack[3];
		TMember tDefinition = (TMember) result2_bindingAndBlack[4];
		MSignature mSignature = (MSignature) result2_bindingAndBlack[5];
		TSignature tSignature = (TSignature) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, mAnonymous, mInstance,
						mDefinition, tAnonymous, tDefinition, mSignature, tSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mAnonymous] = " + mAnonymous + ", " + "[mInstance] = " + mInstance + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = " + tDefinition
					+ ", " + "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_blackBBBFBBFFBBB(mAnonymous, mDefinition,
							tAnonymous, tDefinition, mSignature, tSignature, sourceMatch, targetMatch)) {
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result5_black[3];
				AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result5_black[6];
				MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result5_black[7];
				Object[] result5_green = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_greenBBBBBF(mSignatureToTSignature,
								mAnonymousToTAnonymous, mDefinitionToTMember, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_24_6_createcorrespondence_blackBBBBBBBB(mAnonymous,
								mInstance, mDefinition, tAnonymous, tDefinition, mSignature, tSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAnonymous] = "
							+ mAnonymous + ", " + "[mInstance] = " + mInstance + ", " + "[mDefinition] = " + mDefinition
							+ ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tDefinition] = " + tDefinition + ", "
							+ "[mSignature] = " + mSignature + ", " + "[tSignature] = " + tSignature + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance,
			MDefinition mDefinition, TClass tAnonymous, TMember tDefinition, MSignature mSignature,
			TSignature tSignature, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance,
			MDefinition mDefinition, MSignature mSignature) {// 
		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_27_1_matchtggpattern_blackBBBB(mAnonymous, mInstance, mDefinition,
						mSignature);
		if (result1_black != null) {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_27_2_expressionF();
		} else {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tAnonymous, TMember tDefinition, TSignature tSignature) {// 
		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_28_1_matchtggpattern_blackBBB(tAnonymous, tDefinition, tSignature);
		if (result1_black != null) {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_28_2_expressionF();
		} else {
			return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymousParameter,
			MSignatureToTSignature mSignatureToTSignatureParameter) {

		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_blackFFFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mAnonymousToTAnonymousList = (RuleEntryList) result2_black[0];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[1];
			ClassInstanceCreation mInstance = (ClassInstanceCreation) result2_black[2];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result2_black[3];
			TClass tAnonymous = (TClass) result2_black[4];
			//nothing RuleEntryList mSignatureToTSignatureList = (RuleEntryList) result2_black[5];
			MDefinition mDefinition = (MDefinition) result2_black[6];
			MSignature mSignature = (MSignature) result2_black[7];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[8];
			TSignature tSignature = (TSignature) result2_black[9];
			TMember tDefinition = (TMember) result2_black[10];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[11];

			Object[] result3_bindingAndBlack = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(this,
							isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature,
							tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mAnonymous] = " + mAnonymous + ", "
						+ "[mInstance] = " + mInstance + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[tAnonymous] = " + tAnonymous + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature
						+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mSignature] = " + mSignature + ", "
						+ "[mAnonymousToTAnonymous] = " + mAnonymousToTAnonymous + ", " + "[mDefinitionToTMember] = "
						+ mDefinitionToTMember + ", " + "[tSignature] = " + tSignature + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_29_5_checknacs_blackBBBBBBBBBB(mAnonymous, mInstance,
								mDefinition, tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
								mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);
				if (result5_black != null) {

					Object[] result6_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_29_6_perform_blackBBBBBBBBBBB(mAnonymous, mInstance,
									mDefinition, tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
									mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAnonymous] = "
								+ mAnonymous + ", " + "[mInstance] = " + mInstance + ", " + "[mDefinition] = "
								+ mDefinition + ", " + "[tAnonymous] = " + tAnonymous + ", "
								+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[tDefinition] = "
								+ tDefinition + ", " + "[mSignature] = " + mSignature + ", "
								+ "[mAnonymousToTAnonymous] = " + mAnonymousToTAnonymous + ", "
								+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tSignature] = "
								+ tSignature + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_29_6_perform_greenBBBBBB(mAnonymous,
							mDefinition, tAnonymous, tDefinition, tSignature, ruleResult);

				} else {
				}

			} else {
			}

		}
		return LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, TClass tAnonymous,
			MSignatureToTSignature mSignatureToTSignature, TMember tDefinition, MSignature mSignature,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("mInstance", mInstance);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		isApplicableMatch.registerObject("tSignature", tSignature);
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
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_FWD__MATCH_ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION_MSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(ClassInstanceCreation) arguments.get(2), (MDefinition) arguments.get(3),
					(MSignature) arguments.get(4));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION_MSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(ClassInstanceCreation) arguments.get(2), (MDefinition) arguments.get(3),
					(MSignature) arguments.get(4));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION_MSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(ClassInstanceCreation) arguments.get(2), (MDefinition) arguments.get(3),
					(MSignature) arguments.get(4));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION_TCLASS_MSIGNATURETOTSIGNATURE_TMEMBER_MSIGNATURE_ANONYMOUSCLASSDECLARATIONTOTCLASS_MDEFINITIONTOTMEMBER_TSIGNATURE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1), (ClassInstanceCreation) arguments.get(2),
					(MDefinition) arguments.get(3), (TClass) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (TMember) arguments.get(6),
					(MSignature) arguments.get(7), (AnonymousClassDeclarationToTClass) arguments.get(8),
					(MDefinitionToTMember) arguments.get(9), (TSignature) arguments.get(10));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_BWD__MATCH_TCLASS_TMEMBER_TSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TMember) arguments.get(2),
					(TSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TMEMBER_TSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TMember) arguments.get(2),
					(TSignature) arguments.get(3));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TMEMBER_TSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TMember) arguments.get(2), (TSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION_TCLASS_MSIGNATURETOTSIGNATURE_TMEMBER_MSIGNATURE_ANONYMOUSCLASSDECLARATIONTOTCLASS_MDEFINITIONTOTMEMBER_TSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1), (ClassInstanceCreation) arguments.get(2),
					(MDefinition) arguments.get(3), (TClass) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (TMember) arguments.get(6),
					(MSignature) arguments.get(7), (AnonymousClassDeclarationToTClass) arguments.get(8),
					(MDefinitionToTMember) arguments.get(9), (TSignature) arguments.get(10));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_78__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_78((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_83__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_83((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_CC__ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION_TCLASS_TMEMBER_MSIGNATURE_TSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((AnonymousClassDeclaration) arguments.get(0),
					(ClassInstanceCreation) arguments.get(1), (MDefinition) arguments.get(2), (TClass) arguments.get(3),
					(TMember) arguments.get(4), (MSignature) arguments.get(5), (TSignature) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_DEC_FWD__ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION_MSIGNATURE:
			return checkDEC_FWD((AnonymousClassDeclaration) arguments.get(0), (ClassInstanceCreation) arguments.get(1),
					(MDefinition) arguments.get(2), (MSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_DEC_BWD__TCLASS_TMEMBER_TSIGNATURE:
			return checkDEC_BWD((TClass) arguments.get(0), (TMember) arguments.get(1), (TSignature) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___GENERATE_MODEL__RULEENTRYCONTAINER_ANONYMOUSCLASSDECLARATIONTOTCLASS_MSIGNATURETOTSIGNATURE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(AnonymousClassDeclarationToTClass) arguments.get(1), (MSignatureToTSignature) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATION_CLASSINSTANCECREATION_MDEFINITION_TCLASS_MSIGNATURETOTSIGNATURE_TMEMBER_MSIGNATURE_ANONYMOUSCLASSDECLARATIONTOTCLASS_MDEFINITIONTOTMEMBER_TSIGNATURE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1), (ClassInstanceCreation) arguments.get(2),
					(MDefinition) arguments.get(3), (TClass) arguments.get(4),
					(MSignatureToTSignature) arguments.get(5), (TMember) arguments.get(6),
					(MSignature) arguments.get(7), (AnonymousClassDeclarationToTClass) arguments.get(8),
					(MDefinitionToTMember) arguments.get(9), (TSignature) arguments.get(10),
					(ModelgeneratorRuleResult) arguments.get(11));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_1_initialbindings_blackBBBBBB(
			LinkDefinitionToAnonymous _this, Match match, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, MSignature mSignature) {
		return new Object[] { _this, match, mAnonymous, mInstance, mDefinition, mSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingFBBBBBB(
			LinkDefinitionToAnonymous _this, Match match, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, MSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mAnonymous, mInstance, mDefinition, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mAnonymous, mInstance, mDefinition, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			LinkDefinitionToAnonymous _this, Match match, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, MSignature mSignature) {
		Object[] result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_binding = pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mAnonymous, mInstance, mDefinition, mSignature);
		if (result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_black = pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mAnonymous, mInstance, mDefinition, mSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_0_3_CheckCSP_expressionFBB(
			LinkDefinitionToAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			MSignature mSignature) {
		return new Object[] { match, mAnonymous, mInstance, mDefinition, mSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition) {
		EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String mAnonymous__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		mAnonymous__mDefinition____bodyDeclarations.setSrc(mAnonymous);
		mAnonymous__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mAnonymous__mDefinition____bodyDeclarations);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setTrg(mAnonymous);
		match.getToBeTranslatedEdges().add(mDefinition__mAnonymous____anonymousClassDeclarationOwner);
		mAnonymous__mDefinition____bodyDeclarations.setName(mAnonymous__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner
				.setName(mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { match, mAnonymous, mDefinition, mAnonymous__mDefinition____bodyDeclarations,
				mDefinition__mAnonymous____anonymousClassDeclarationOwner };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_blackBBBBB(Match match,
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			MSignature mSignature) {
		return new Object[] { match, mAnonymous, mInstance, mDefinition, mSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_greenBBBBBFFFF(
			Match match, AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			MSignature mSignature) {
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mInstance____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mAnonymous);
		match.getContextNodes().add(mInstance);
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(mSignature);
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mInstance__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mInstance____classInstanceCreation_name_prime = "classInstanceCreation";
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		match.getContextEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		match.getContextEdges().add(mDefinition__mSignature____mSignature);
		mInstance__mAnonymous____anonymousClassDeclaration.setSrc(mInstance);
		mInstance__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		match.getContextEdges().add(mInstance__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mInstance____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mInstance____classInstanceCreation.setTrg(mInstance);
		match.getContextEdges().add(mAnonymous__mInstance____classInstanceCreation);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mInstance__mAnonymous____anonymousClassDeclaration
				.setName(mInstance__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mInstance____classInstanceCreation
				.setName(mAnonymous__mInstance____classInstanceCreation_name_prime);
		return new Object[] { match, mAnonymous, mInstance, mDefinition, mSignature,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature,
				mInstance__mAnonymous____anonymousClassDeclaration, mAnonymous__mInstance____classInstanceCreation };
	}

	public static final void pattern_LinkDefinitionToAnonymous_0_6_registerobjectstomatch_expressionBBBBBB(
			LinkDefinitionToAnonymous _this, Match match, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, MSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mAnonymous, mInstance, mDefinition, mSignature);

	}

	public static final boolean pattern_LinkDefinitionToAnonymous_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_1 = isApplicableMatch.getObject("mInstance");
		EObject _localVariable_2 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("tAnonymous");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_7 = isApplicableMatch.getObject("mAnonymousToTAnonymous");
		EObject _localVariable_8 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject _localVariable_9 = isApplicableMatch.getObject("tSignature");
		EObject tmpMAnonymous = _localVariable_0;
		EObject tmpMInstance = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpTAnonymous = _localVariable_3;
		EObject tmpMSignatureToTSignature = _localVariable_4;
		EObject tmpTDefinition = _localVariable_5;
		EObject tmpMSignature = _localVariable_6;
		EObject tmpMAnonymousToTAnonymous = _localVariable_7;
		EObject tmpMDefinitionToTMember = _localVariable_8;
		EObject tmpTSignature = _localVariable_9;
		if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
			if (tmpMInstance instanceof ClassInstanceCreation) {
				ClassInstanceCreation mInstance = (ClassInstanceCreation) tmpMInstance;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpTAnonymous instanceof TClass) {
						TClass tAnonymous = (TClass) tmpTAnonymous;
						if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
							if (tmpTDefinition instanceof TMember) {
								TMember tDefinition = (TMember) tmpTDefinition;
								if (tmpMSignature instanceof MSignature) {
									MSignature mSignature = (MSignature) tmpMSignature;
									if (tmpMAnonymousToTAnonymous instanceof AnonymousClassDeclarationToTClass) {
										AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) tmpMAnonymousToTAnonymous;
										if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
											MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
											if (tmpTSignature instanceof TSignature) {
												TSignature tSignature = (TSignature) tmpTSignature;
												return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous,
														mSignatureToTSignature, tDefinition, mSignature,
														mAnonymousToTAnonymous, mDefinitionToTMember, tSignature,
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
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_blackBBBBBBBBBBFBB(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			TClass tAnonymous, MSignatureToTSignature mSignatureToTSignature, TMember tDefinition,
			MSignature mSignature, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, LinkDefinitionToAnonymous _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature,
						tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding = pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding != null) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[0];
			ClassInstanceCreation mInstance = (ClassInstanceCreation) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[2];
			TClass tAnonymous = (TClass) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[3];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[4];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[5];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[6];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[7];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[8];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[9];

			Object[] result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_black = pattern_LinkDefinitionToAnonymous_1_1_performtransformation_blackBBBBBBBBBBFBB(
					mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
					mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, _this, isApplicableMatch);
			if (result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_black[10];

				return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature,
						tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_greenBBB(TClass tAnonymous,
			TMember tDefinition, TSignature tSignature) {
		tAnonymous.getDefines().add(tDefinition);
		tAnonymous.getSignature().add(tSignature);
		return new Object[] { tAnonymous, tDefinition, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mAnonymous, EObject mInstance, EObject mDefinition,
			EObject tAnonymous, EObject mSignatureToTSignature, EObject tDefinition, EObject mSignature,
			EObject mAnonymousToTAnonymous, EObject mDefinitionToTMember, EObject tSignature) {
		if (!mAnonymous.equals(mInstance)) {
			if (!mAnonymous.equals(mDefinition)) {
				if (!mAnonymous.equals(tAnonymous)) {
					if (!mAnonymous.equals(mSignatureToTSignature)) {
						if (!mAnonymous.equals(tDefinition)) {
							if (!mAnonymous.equals(mSignature)) {
								if (!mAnonymous.equals(mAnonymousToTAnonymous)) {
									if (!mAnonymous.equals(mDefinitionToTMember)) {
										if (!mAnonymous.equals(tSignature)) {
											if (!mInstance.equals(tAnonymous)) {
												if (!mInstance.equals(mSignatureToTSignature)) {
													if (!mInstance.equals(tDefinition)) {
														if (!mInstance.equals(mSignature)) {
															if (!mInstance.equals(tSignature)) {
																if (!mDefinition.equals(mInstance)) {
																	if (!mDefinition.equals(tAnonymous)) {
																		if (!mDefinition
																				.equals(mSignatureToTSignature)) {
																			if (!mDefinition.equals(tDefinition)) {
																				if (!mDefinition.equals(mSignature)) {
																					if (!mDefinition.equals(
																							mDefinitionToTMember)) {
																						if (!mDefinition
																								.equals(tSignature)) {
																							if (!tAnonymous.equals(
																									tDefinition)) {
																								if (!tAnonymous.equals(
																										tSignature)) {
																									if (!mSignatureToTSignature
																											.equals(tAnonymous)) {
																										if (!mSignatureToTSignature
																												.equals(tDefinition)) {
																											if (!mSignatureToTSignature
																													.equals(tSignature)) {
																												if (!tDefinition
																														.equals(tSignature)) {
																													if (!mSignature
																															.equals(tAnonymous)) {
																														if (!mSignature
																																.equals(mSignatureToTSignature)) {
																															if (!mSignature
																																	.equals(tDefinition)) {
																																if (!mSignature
																																		.equals(tSignature)) {
																																	if (!mAnonymousToTAnonymous
																																			.equals(mInstance)) {
																																		if (!mAnonymousToTAnonymous
																																				.equals(mDefinition)) {
																																			if (!mAnonymousToTAnonymous
																																					.equals(tAnonymous)) {
																																				if (!mAnonymousToTAnonymous
																																						.equals(mSignatureToTSignature)) {
																																					if (!mAnonymousToTAnonymous
																																							.equals(tDefinition)) {
																																						if (!mAnonymousToTAnonymous
																																								.equals(mSignature)) {
																																							if (!mAnonymousToTAnonymous
																																									.equals(mDefinitionToTMember)) {
																																								if (!mAnonymousToTAnonymous
																																										.equals(tSignature)) {
																																									if (!mDefinitionToTMember
																																											.equals(mInstance)) {
																																										if (!mDefinitionToTMember
																																												.equals(tAnonymous)) {
																																											if (!mDefinitionToTMember
																																													.equals(mSignatureToTSignature)) {
																																												if (!mDefinitionToTMember
																																														.equals(tDefinition)) {
																																													if (!mDefinitionToTMember
																																															.equals(mSignature)) {
																																														if (!mDefinitionToTMember
																																																.equals(tSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mAnonymous,
																																																	mInstance,
																																																	mDefinition,
																																																	tAnonymous,
																																																	mSignatureToTSignature,
																																																	tDefinition,
																																																	mSignature,
																																																	mAnonymousToTAnonymous,
																																																	mDefinitionToTMember,
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mAnonymous, EObject mDefinition, EObject tAnonymous,
			EObject tDefinition, EObject tSignature) {
		EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tAnonymous__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnonymous____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkDefinitionToAnonymous";
		String mAnonymous__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String tAnonymous__tDefinition____defines_name_prime = "defines";
		String tDefinition__tAnonymous____definedBy_name_prime = "definedBy";
		String tAnonymous__tSignature____signature_name_prime = "signature";
		mAnonymous__mDefinition____bodyDeclarations.setSrc(mAnonymous);
		mAnonymous__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mAnonymous__mDefinition____bodyDeclarations);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setTrg(mAnonymous);
		ruleresult.getTranslatedEdges().add(mDefinition__mAnonymous____anonymousClassDeclarationOwner);
		tAnonymous__tDefinition____defines.setSrc(tAnonymous);
		tAnonymous__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tAnonymous__tDefinition____defines);
		tDefinition__tAnonymous____definedBy.setSrc(tDefinition);
		tDefinition__tAnonymous____definedBy.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(tDefinition__tAnonymous____definedBy);
		tAnonymous__tSignature____signature.setSrc(tAnonymous);
		tAnonymous__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tAnonymous__tSignature____signature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mAnonymous__mDefinition____bodyDeclarations.setName(mAnonymous__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner
				.setName(mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime);
		tAnonymous__tDefinition____defines.setName(tAnonymous__tDefinition____defines_name_prime);
		tDefinition__tAnonymous____definedBy.setName(tDefinition__tAnonymous____definedBy_name_prime);
		tAnonymous__tSignature____signature.setName(tAnonymous__tSignature____signature_name_prime);
		return new Object[] { ruleresult, mAnonymous, mDefinition, tAnonymous, tDefinition, tSignature,
				mAnonymous__mDefinition____bodyDeclarations, mDefinition__mAnonymous____anonymousClassDeclarationOwner,
				tAnonymous__tDefinition____defines, tDefinition__tAnonymous____definedBy,
				tAnonymous__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToAnonymous_1_5_registerobjects_expressionBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, PerformRuleResult ruleresult, EObject mAnonymous, EObject mInstance,
			EObject mDefinition, EObject tAnonymous, EObject mSignatureToTSignature, EObject tDefinition,
			EObject mSignature, EObject mAnonymousToTAnonymous, EObject mDefinitionToTMember, EObject tSignature) {
		_this.registerObjects_FWD(ruleresult, mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature,
				tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);

	}

	public static final PerformRuleResult pattern_LinkDefinitionToAnonymous_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_bindingFB(
			LinkDefinitionToAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkDefinitionToAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(
			LinkDefinitionToAnonymous _this) {
		Object[] result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_binding = pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_black = pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LinkDefinitionToAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mAnonymous");
		EObject _localVariable_1 = match.getObject("mInstance");
		EObject _localVariable_2 = match.getObject("mDefinition");
		EObject _localVariable_3 = match.getObject("mSignature");
		EObject tmpMAnonymous = _localVariable_0;
		EObject tmpMInstance = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpMSignature = _localVariable_3;
		if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
			if (tmpMInstance instanceof ClassInstanceCreation) {
				ClassInstanceCreation mInstance = (ClassInstanceCreation) tmpMInstance;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpMSignature instanceof MSignature) {
						MSignature mSignature = (MSignature) tmpMSignature;
						return new Object[] { mAnonymous, mInstance, mDefinition, mSignature, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_2_2_corematch_blackBBBFFFBFFFB(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			MSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
			TMember tDefinition = mDefinitionToTMember.getTarget();
			if (tDefinition != null) {
				for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
					TSignature tSignature = mSignatureToTSignature.getTarget();
					if (tSignature != null) {
						for (AnonymousClassDeclarationToTClass mAnonymousToTAnonymous : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mAnonymous, AnonymousClassDeclarationToTClass.class,
										"source")) {
							TClass tAnonymous = mAnonymousToTAnonymous.getTarget();
							if (tAnonymous != null) {
								_result.add(new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous,
										mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous,
										mDefinitionToTMember, tSignature, match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_2_3_findcontext_blackBBBBBBBBBB(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			TClass tAnonymous, MSignatureToTSignature mSignatureToTSignature, TMember tDefinition,
			MSignature mSignature, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnonymous.getBodyDeclarations().contains(mDefinition)) {
			if (mSignature.getMDefinitions().contains(mDefinition)) {
				if (mAnonymous.equals(mInstance.getAnonymousClassDeclaration())) {
					if (mDefinition.equals(mDefinitionToTMember.getSource())) {
						if (tAnonymous.equals(mAnonymousToTAnonymous.getTarget())) {
							if (mSignature.equals(mSignatureToTSignature.getSource())) {
								if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
									if (mAnonymous.equals(mAnonymousToTAnonymous.getSource())) {
										if (tSignature.getDefinitions().contains(tDefinition)) {
											if (tSignature.equals(mSignatureToTSignature.getTarget())) {
												_result.add(new Object[] { mAnonymous, mInstance, mDefinition,
														tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
														mAnonymousToTAnonymous, mDefinitionToTMember, tSignature });
											}
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			TClass tAnonymous, MSignatureToTSignature mSignatureToTSignature, TMember tDefinition,
			MSignature mSignature, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mInstance____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mAnonymous__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mInstance__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mInstance____classInstanceCreation_name_prime = "classInstanceCreation";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mAnonymousToTAnonymous__tAnonymous____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mAnonymousToTAnonymous__mAnonymous____source_name_prime = "source";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mInstance);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		isApplicableMatch.getAllContextElements().add(tSignature);
		mAnonymous__mDefinition____bodyDeclarations.setSrc(mAnonymous);
		mAnonymous__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mDefinition____bodyDeclarations);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mDefinition__mAnonymous____anonymousClassDeclarationOwner);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mInstance__mAnonymous____anonymousClassDeclaration.setSrc(mInstance);
		mInstance__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mInstance__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mInstance____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mInstance____classInstanceCreation.setTrg(mInstance);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mInstance____classInstanceCreation);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDefinition____source);
		mAnonymousToTAnonymous__tAnonymous____target.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__tAnonymous____target.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__tAnonymous____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDefinition____target);
		mAnonymousToTAnonymous__mAnonymous____source.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__mAnonymous____source.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__mAnonymous____source);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mAnonymous__mDefinition____bodyDeclarations.setName(mAnonymous__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner
				.setName(mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mInstance__mAnonymous____anonymousClassDeclaration
				.setName(mInstance__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mInstance____classInstanceCreation
				.setName(mAnonymous__mInstance____classInstanceCreation_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mAnonymousToTAnonymous__tAnonymous____target.setName(mAnonymousToTAnonymous__tAnonymous____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mAnonymousToTAnonymous__mAnonymous____source.setName(mAnonymousToTAnonymous__mAnonymous____source_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition,
				mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, isApplicableMatch,
				mAnonymous__mDefinition____bodyDeclarations, mDefinition__mAnonymous____anonymousClassDeclarationOwner,
				mSignature__mDefinition____mDefinitions, mDefinition__mSignature____mSignature,
				mInstance__mAnonymous____anonymousClassDeclaration, mAnonymous__mInstance____classInstanceCreation,
				mDefinitionToTMember__mDefinition____source, mAnonymousToTAnonymous__tAnonymous____target,
				mSignatureToTSignature__mSignature____source, mDefinitionToTMember__tDefinition____target,
				mAnonymousToTAnonymous__mAnonymous____source, tSignature__tDefinition____definitions,
				tDefinition__tSignature____signature, mSignatureToTSignature__tSignature____target };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingFBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, TClass tAnonymous,
			MSignatureToTSignature mSignatureToTSignature, TMember tDefinition, MSignature mSignature,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mAnonymous, mInstance, mDefinition,
				tAnonymous, mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous,
				mDefinitionToTMember, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous,
					mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember,
					tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, TClass tAnonymous,
			MSignatureToTSignature mSignatureToTSignature, TMember tDefinition, MSignature mSignature,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature) {
		Object[] result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_binding = pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature,
				tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);
		if (result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_black = pattern_LinkDefinitionToAnonymous_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous,
						mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember,
						tSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_2_5_checkCSP_expressionFBB(
			LinkDefinitionToAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToAnonymous_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_1_initialbindings_blackBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature) {
		return new Object[] { _this, match, tAnonymous, tDefinition, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnonymous, tDefinition, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnonymous, tDefinition, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingAndBlackFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature) {
		Object[] result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_binding = pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tAnonymous, tDefinition, tSignature);
		if (result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_black = pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnonymous, tDefinition, tSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_10_3_CheckCSP_expressionFBB(
			LinkDefinitionToAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TClass tAnonymous, TMember tDefinition, TSignature tSignature) {
		return new Object[] { match, tAnonymous, tDefinition, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TClass tAnonymous, TMember tDefinition, TSignature tSignature) {
		EMoflonEdge tAnonymous__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnonymous____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnonymous__tDefinition____defines_name_prime = "defines";
		String tDefinition__tAnonymous____definedBy_name_prime = "definedBy";
		String tAnonymous__tSignature____signature_name_prime = "signature";
		tAnonymous__tDefinition____defines.setSrc(tAnonymous);
		tAnonymous__tDefinition____defines.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tAnonymous__tDefinition____defines);
		tDefinition__tAnonymous____definedBy.setSrc(tDefinition);
		tDefinition__tAnonymous____definedBy.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(tDefinition__tAnonymous____definedBy);
		tAnonymous__tSignature____signature.setSrc(tAnonymous);
		tAnonymous__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tAnonymous__tSignature____signature);
		tAnonymous__tDefinition____defines.setName(tAnonymous__tDefinition____defines_name_prime);
		tDefinition__tAnonymous____definedBy.setName(tDefinition__tAnonymous____definedBy_name_prime);
		tAnonymous__tSignature____signature.setName(tAnonymous__tSignature____signature_name_prime);
		return new Object[] { match, tAnonymous, tDefinition, tSignature, tAnonymous__tDefinition____defines,
				tDefinition__tAnonymous____definedBy, tAnonymous__tSignature____signature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_blackBBBB(Match match,
			TClass tAnonymous, TMember tDefinition, TSignature tSignature) {
		return new Object[] { match, tAnonymous, tDefinition, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_greenBBBBFF(Match match,
			TClass tAnonymous, TMember tDefinition, TSignature tSignature) {
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tAnonymous);
		match.getContextNodes().add(tDefinition);
		match.getContextNodes().add(tSignature);
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getContextEdges().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		match.getContextEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		return new Object[] { match, tAnonymous, tDefinition, tSignature, tSignature__tDefinition____definitions,
				tDefinition__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToAnonymous_10_6_registerobjectstomatch_expressionBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature) {
		_this.registerObjectsToMatch_BWD(match, tAnonymous, tDefinition, tSignature);

	}

	public static final boolean pattern_LinkDefinitionToAnonymous_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_1 = isApplicableMatch.getObject("mInstance");
		EObject _localVariable_2 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("tAnonymous");
		EObject _localVariable_4 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_5 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_6 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_7 = isApplicableMatch.getObject("mAnonymousToTAnonymous");
		EObject _localVariable_8 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject _localVariable_9 = isApplicableMatch.getObject("tSignature");
		EObject tmpMAnonymous = _localVariable_0;
		EObject tmpMInstance = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpTAnonymous = _localVariable_3;
		EObject tmpMSignatureToTSignature = _localVariable_4;
		EObject tmpTDefinition = _localVariable_5;
		EObject tmpMSignature = _localVariable_6;
		EObject tmpMAnonymousToTAnonymous = _localVariable_7;
		EObject tmpMDefinitionToTMember = _localVariable_8;
		EObject tmpTSignature = _localVariable_9;
		if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
			if (tmpMInstance instanceof ClassInstanceCreation) {
				ClassInstanceCreation mInstance = (ClassInstanceCreation) tmpMInstance;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpTAnonymous instanceof TClass) {
						TClass tAnonymous = (TClass) tmpTAnonymous;
						if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
							MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
							if (tmpTDefinition instanceof TMember) {
								TMember tDefinition = (TMember) tmpTDefinition;
								if (tmpMSignature instanceof MSignature) {
									MSignature mSignature = (MSignature) tmpMSignature;
									if (tmpMAnonymousToTAnonymous instanceof AnonymousClassDeclarationToTClass) {
										AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) tmpMAnonymousToTAnonymous;
										if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
											MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
											if (tmpTSignature instanceof TSignature) {
												TSignature tSignature = (TSignature) tmpTSignature;
												return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous,
														mSignatureToTSignature, tDefinition, mSignature,
														mAnonymousToTAnonymous, mDefinitionToTMember, tSignature,
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
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_blackBBBBBBBBBBFBB(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			TClass tAnonymous, MSignatureToTSignature mSignatureToTSignature, TMember tDefinition,
			MSignature mSignature, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, LinkDefinitionToAnonymous _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature,
						tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding = pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding != null) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[0];
			ClassInstanceCreation mInstance = (ClassInstanceCreation) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[2];
			TClass tAnonymous = (TClass) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[3];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[4];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[5];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[6];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[7];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[8];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[9];

			Object[] result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_black = pattern_LinkDefinitionToAnonymous_11_1_performtransformation_blackBBBBBBBBBBFBB(
					mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
					mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, _this, isApplicableMatch);
			if (result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_black[10];

				return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature,
						tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_greenBB(
			AnonymousClassDeclaration mAnonymous, MDefinition mDefinition) {
		mAnonymous.getBodyDeclarations().add(mDefinition);
		return new Object[] { mAnonymous, mDefinition };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mAnonymous, EObject mInstance, EObject mDefinition,
			EObject tAnonymous, EObject mSignatureToTSignature, EObject tDefinition, EObject mSignature,
			EObject mAnonymousToTAnonymous, EObject mDefinitionToTMember, EObject tSignature) {
		if (!mAnonymous.equals(mInstance)) {
			if (!mAnonymous.equals(mDefinition)) {
				if (!mAnonymous.equals(tAnonymous)) {
					if (!mAnonymous.equals(mSignatureToTSignature)) {
						if (!mAnonymous.equals(tDefinition)) {
							if (!mAnonymous.equals(mSignature)) {
								if (!mAnonymous.equals(mAnonymousToTAnonymous)) {
									if (!mAnonymous.equals(mDefinitionToTMember)) {
										if (!mAnonymous.equals(tSignature)) {
											if (!mInstance.equals(tAnonymous)) {
												if (!mInstance.equals(mSignatureToTSignature)) {
													if (!mInstance.equals(tDefinition)) {
														if (!mInstance.equals(mSignature)) {
															if (!mInstance.equals(tSignature)) {
																if (!mDefinition.equals(mInstance)) {
																	if (!mDefinition.equals(tAnonymous)) {
																		if (!mDefinition
																				.equals(mSignatureToTSignature)) {
																			if (!mDefinition.equals(tDefinition)) {
																				if (!mDefinition.equals(mSignature)) {
																					if (!mDefinition.equals(
																							mDefinitionToTMember)) {
																						if (!mDefinition
																								.equals(tSignature)) {
																							if (!tAnonymous.equals(
																									tDefinition)) {
																								if (!tAnonymous.equals(
																										tSignature)) {
																									if (!mSignatureToTSignature
																											.equals(tAnonymous)) {
																										if (!mSignatureToTSignature
																												.equals(tDefinition)) {
																											if (!mSignatureToTSignature
																													.equals(tSignature)) {
																												if (!tDefinition
																														.equals(tSignature)) {
																													if (!mSignature
																															.equals(tAnonymous)) {
																														if (!mSignature
																																.equals(mSignatureToTSignature)) {
																															if (!mSignature
																																	.equals(tDefinition)) {
																																if (!mSignature
																																		.equals(tSignature)) {
																																	if (!mAnonymousToTAnonymous
																																			.equals(mInstance)) {
																																		if (!mAnonymousToTAnonymous
																																				.equals(mDefinition)) {
																																			if (!mAnonymousToTAnonymous
																																					.equals(tAnonymous)) {
																																				if (!mAnonymousToTAnonymous
																																						.equals(mSignatureToTSignature)) {
																																					if (!mAnonymousToTAnonymous
																																							.equals(tDefinition)) {
																																						if (!mAnonymousToTAnonymous
																																								.equals(mSignature)) {
																																							if (!mAnonymousToTAnonymous
																																									.equals(mDefinitionToTMember)) {
																																								if (!mAnonymousToTAnonymous
																																										.equals(tSignature)) {
																																									if (!mDefinitionToTMember
																																											.equals(mInstance)) {
																																										if (!mDefinitionToTMember
																																												.equals(tAnonymous)) {
																																											if (!mDefinitionToTMember
																																													.equals(mSignatureToTSignature)) {
																																												if (!mDefinitionToTMember
																																														.equals(tDefinition)) {
																																													if (!mDefinitionToTMember
																																															.equals(mSignature)) {
																																														if (!mDefinitionToTMember
																																																.equals(tSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mAnonymous,
																																																	mInstance,
																																																	mDefinition,
																																																	tAnonymous,
																																																	mSignatureToTSignature,
																																																	tDefinition,
																																																	mSignature,
																																																	mAnonymousToTAnonymous,
																																																	mDefinitionToTMember,
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mAnonymous, EObject mDefinition, EObject tAnonymous,
			EObject tDefinition, EObject tSignature) {
		EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tAnonymous__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnonymous____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkDefinitionToAnonymous";
		String mAnonymous__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String tAnonymous__tDefinition____defines_name_prime = "defines";
		String tDefinition__tAnonymous____definedBy_name_prime = "definedBy";
		String tAnonymous__tSignature____signature_name_prime = "signature";
		mAnonymous__mDefinition____bodyDeclarations.setSrc(mAnonymous);
		mAnonymous__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mAnonymous__mDefinition____bodyDeclarations);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(mDefinition__mAnonymous____anonymousClassDeclarationOwner);
		tAnonymous__tDefinition____defines.setSrc(tAnonymous);
		tAnonymous__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tAnonymous__tDefinition____defines);
		tDefinition__tAnonymous____definedBy.setSrc(tDefinition);
		tDefinition__tAnonymous____definedBy.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(tDefinition__tAnonymous____definedBy);
		tAnonymous__tSignature____signature.setSrc(tAnonymous);
		tAnonymous__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tAnonymous__tSignature____signature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mAnonymous__mDefinition____bodyDeclarations.setName(mAnonymous__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner
				.setName(mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime);
		tAnonymous__tDefinition____defines.setName(tAnonymous__tDefinition____defines_name_prime);
		tDefinition__tAnonymous____definedBy.setName(tDefinition__tAnonymous____definedBy_name_prime);
		tAnonymous__tSignature____signature.setName(tAnonymous__tSignature____signature_name_prime);
		return new Object[] { ruleresult, mAnonymous, mDefinition, tAnonymous, tDefinition, tSignature,
				mAnonymous__mDefinition____bodyDeclarations, mDefinition__mAnonymous____anonymousClassDeclarationOwner,
				tAnonymous__tDefinition____defines, tDefinition__tAnonymous____definedBy,
				tAnonymous__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToAnonymous_11_5_registerobjects_expressionBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, PerformRuleResult ruleresult, EObject mAnonymous, EObject mInstance,
			EObject mDefinition, EObject tAnonymous, EObject mSignatureToTSignature, EObject tDefinition,
			EObject mSignature, EObject mAnonymousToTAnonymous, EObject mDefinitionToTMember, EObject tSignature) {
		_this.registerObjects_BWD(ruleresult, mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature,
				tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);

	}

	public static final PerformRuleResult pattern_LinkDefinitionToAnonymous_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_bindingFB(
			LinkDefinitionToAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkDefinitionToAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(
			LinkDefinitionToAnonymous _this) {
		Object[] result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_binding = pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_black = pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LinkDefinitionToAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAnonymous");
		EObject _localVariable_1 = match.getObject("tDefinition");
		EObject _localVariable_2 = match.getObject("tSignature");
		EObject tmpTAnonymous = _localVariable_0;
		EObject tmpTDefinition = _localVariable_1;
		EObject tmpTSignature = _localVariable_2;
		if (tmpTAnonymous instanceof TClass) {
			TClass tAnonymous = (TClass) tmpTAnonymous;
			if (tmpTDefinition instanceof TMember) {
				TMember tDefinition = (TMember) tmpTDefinition;
				if (tmpTSignature instanceof TSignature) {
					TSignature tSignature = (TSignature) tmpTSignature;
					return new Object[] { tAnonymous, tDefinition, tSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_12_2_corematch_blackFFBFBFFFBB(
			TClass tAnonymous, TMember tDefinition, TSignature tSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnonymousClassDeclarationToTClass mAnonymousToTAnonymous : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, AnonymousClassDeclarationToTClass.class, "target")) {
			AnonymousClassDeclaration mAnonymous = mAnonymousToTAnonymous.getSource();
			if (mAnonymous != null) {
				for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tDefinition, MDefinitionToTMember.class, "target")) {
					BodyDeclaration tmpMDefinition = mDefinitionToTMember.getSource();
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tSignature, MSignatureToTSignature.class, "target")) {
							MSignature mSignature = mSignatureToTSignature.getSource();
							if (mSignature != null) {
								_result.add(new Object[] { mAnonymous, mDefinition, tAnonymous, mSignatureToTSignature,
										tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember,
										tSignature, match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_12_3_findcontext_blackBFBBBBBBBB(
			AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			MSignatureToTSignature mSignatureToTSignature, TMember tDefinition, MSignature mSignature,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAnonymous.getDefines().contains(tDefinition)) {
			if (tAnonymous.getSignature().contains(tSignature)) {
				if (mSignature.getMDefinitions().contains(mDefinition)) {
					if (mDefinition.equals(mDefinitionToTMember.getSource())) {
						if (tAnonymous.equals(mAnonymousToTAnonymous.getTarget())) {
							if (mSignature.equals(mSignatureToTSignature.getSource())) {
								if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
									if (mAnonymous.equals(mAnonymousToTAnonymous.getSource())) {
										if (tSignature.getDefinitions().contains(tDefinition)) {
											if (tSignature.equals(mSignatureToTSignature.getTarget())) {
												ClassInstanceCreation mInstance = mAnonymous.getClassInstanceCreation();
												if (mInstance != null) {
													_result.add(new Object[] { mAnonymous, mInstance, mDefinition,
															tAnonymous, mSignatureToTSignature, tDefinition, mSignature,
															mAnonymousToTAnonymous, mDefinitionToTMember, tSignature });
												}

											}
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			TClass tAnonymous, MSignatureToTSignature mSignatureToTSignature, TMember tDefinition,
			MSignature mSignature, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tAnonymous__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnonymous____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInstance__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mInstance____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnonymous__tDefinition____defines_name_prime = "defines";
		String tDefinition__tAnonymous____definedBy_name_prime = "definedBy";
		String tAnonymous__tSignature____signature_name_prime = "signature";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mInstance__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mInstance____classInstanceCreation_name_prime = "classInstanceCreation";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mAnonymousToTAnonymous__tAnonymous____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mAnonymousToTAnonymous__mAnonymous____source_name_prime = "source";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mInstance);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		isApplicableMatch.getAllContextElements().add(tSignature);
		tAnonymous__tDefinition____defines.setSrc(tAnonymous);
		tAnonymous__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tDefinition____defines);
		tDefinition__tAnonymous____definedBy.setSrc(tDefinition);
		tDefinition__tAnonymous____definedBy.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tDefinition__tAnonymous____definedBy);
		tAnonymous__tSignature____signature.setSrc(tAnonymous);
		tAnonymous__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tSignature____signature);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mInstance__mAnonymous____anonymousClassDeclaration.setSrc(mInstance);
		mInstance__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mInstance__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mInstance____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mInstance____classInstanceCreation.setTrg(mInstance);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mInstance____classInstanceCreation);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDefinition____source);
		mAnonymousToTAnonymous__tAnonymous____target.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__tAnonymous____target.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__tAnonymous____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDefinition____target);
		mAnonymousToTAnonymous__mAnonymous____source.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__mAnonymous____source.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__mAnonymous____source);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		tAnonymous__tDefinition____defines.setName(tAnonymous__tDefinition____defines_name_prime);
		tDefinition__tAnonymous____definedBy.setName(tDefinition__tAnonymous____definedBy_name_prime);
		tAnonymous__tSignature____signature.setName(tAnonymous__tSignature____signature_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mInstance__mAnonymous____anonymousClassDeclaration
				.setName(mInstance__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mInstance____classInstanceCreation
				.setName(mAnonymous__mInstance____classInstanceCreation_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mAnonymousToTAnonymous__tAnonymous____target.setName(mAnonymousToTAnonymous__tAnonymous____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mAnonymousToTAnonymous__mAnonymous____source.setName(mAnonymousToTAnonymous__mAnonymous____source_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition,
				mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, isApplicableMatch,
				tAnonymous__tDefinition____defines, tDefinition__tAnonymous____definedBy,
				tAnonymous__tSignature____signature, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature, mInstance__mAnonymous____anonymousClassDeclaration,
				mAnonymous__mInstance____classInstanceCreation, mDefinitionToTMember__mDefinition____source,
				mAnonymousToTAnonymous__tAnonymous____target, mSignatureToTSignature__mSignature____source,
				mDefinitionToTMember__tDefinition____target, mAnonymousToTAnonymous__mAnonymous____source,
				tSignature__tDefinition____definitions, tDefinition__tSignature____signature,
				mSignatureToTSignature__tSignature____target };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingFBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, TClass tAnonymous,
			MSignatureToTSignature mSignatureToTSignature, TMember tDefinition, MSignature mSignature,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mAnonymous, mInstance, mDefinition,
				tAnonymous, mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous,
				mDefinitionToTMember, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous,
					mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember,
					tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, TClass tAnonymous,
			MSignatureToTSignature mSignatureToTSignature, TMember tDefinition, MSignature mSignature,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature) {
		Object[] result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_binding = pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature,
				tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature);
		if (result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_black = pattern_LinkDefinitionToAnonymous_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous,
						mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember,
						tSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_12_5_checkCSP_expressionFBB(
			LinkDefinitionToAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkDefinitionToAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToAnonymous_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_bindingFB(
			LinkDefinitionToAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkDefinitionToAnonymous _this) {
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkDefinitionToAnonymous _this) {
		Object[] result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_binding = pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_black = pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_defines) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnonymous = _edge_defines.getSrc();
		if (tmpTAnonymous instanceof TClass) {
			TClass tAnonymous = (TClass) tmpTAnonymous;
			EObject tmpTDefinition = _edge_defines.getTrg();
			if (tmpTDefinition instanceof TMember) {
				TMember tDefinition = (TMember) tmpTDefinition;
				if (tAnonymous.getDefines().contains(tDefinition)) {
					TSignature tSignature = tDefinition.getSignature();
					if (tSignature != null) {
						if (tAnonymous.getSignature().contains(tSignature)) {
							_result.add(new Object[] { tAnonymous, tDefinition, tSignature, _edge_defines });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkDefinitionToAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnonymous, tDefinition, tSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkDefinitionToAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkDefinitionToAnonymous_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_bindingFB(
			LinkDefinitionToAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkDefinitionToAnonymous _this) {
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkDefinitionToAnonymous _this) {
		Object[] result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_binding = pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_black = pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMAnonymous = _edge_bodyDeclarations.getSrc();
		if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
			EObject tmpMDefinition = _edge_bodyDeclarations.getTrg();
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (mAnonymous.getBodyDeclarations().contains(mDefinition)) {
					ClassInstanceCreation mInstance = mAnonymous.getClassInstanceCreation();
					if (mInstance != null) {
						MSignature mSignature = mDefinition.getMSignature();
						if (mSignature != null) {
							_result.add(new Object[] { mAnonymous, mInstance, mDefinition, mSignature,
									_edge_bodyDeclarations });
						}

					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkDefinitionToAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			LinkDefinitionToAnonymous _this, Match match, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, MSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mAnonymous, mInstance, mDefinition, mSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkDefinitionToAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkDefinitionToAnonymous_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_1_prepare_blackB(
			LinkDefinitionToAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mAnonymous");
		EObject _localVariable_1 = sourceMatch.getObject("mInstance");
		EObject _localVariable_2 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_3 = targetMatch.getObject("tAnonymous");
		EObject _localVariable_4 = targetMatch.getObject("tDefinition");
		EObject _localVariable_5 = sourceMatch.getObject("mSignature");
		EObject _localVariable_6 = targetMatch.getObject("tSignature");
		EObject tmpMAnonymous = _localVariable_0;
		EObject tmpMInstance = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpTAnonymous = _localVariable_3;
		EObject tmpTDefinition = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		EObject tmpTSignature = _localVariable_6;
		if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
			if (tmpMInstance instanceof ClassInstanceCreation) {
				ClassInstanceCreation mInstance = (ClassInstanceCreation) tmpMInstance;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpTAnonymous instanceof TClass) {
						TClass tAnonymous = (TClass) tmpTAnonymous;
						if (tmpTDefinition instanceof TMember) {
							TMember tDefinition = (TMember) tmpTDefinition;
							if (tmpMSignature instanceof MSignature) {
								MSignature mSignature = (MSignature) tmpMSignature;
								if (tmpTSignature instanceof TSignature) {
									TSignature tSignature = (TSignature) tmpTSignature;
									return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, tDefinition,
											mSignature, tSignature, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			TClass tAnonymous, TMember tDefinition, MSignature mSignature, TSignature tSignature, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, tDefinition, mSignature, tSignature,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding = pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding != null) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[0];
			ClassInstanceCreation mInstance = (ClassInstanceCreation) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[2];
			TClass tAnonymous = (TClass) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[3];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[4];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[5];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_black = pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					mAnonymous, mInstance, mDefinition, tAnonymous, tDefinition, mSignature, tSignature, sourceMatch,
					targetMatch);
			if (result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, tDefinition, mSignature,
						tSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingFBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance,
			MDefinition mDefinition, TClass tAnonymous, TMember tDefinition, MSignature mSignature,
			TSignature tSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(mAnonymous, mInstance, mDefinition, tAnonymous,
				tDefinition, mSignature, tSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, mAnonymous, mInstance, mDefinition, tAnonymous, tDefinition, mSignature,
					tSignature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance,
			MDefinition mDefinition, TClass tAnonymous, TMember tDefinition, MSignature mSignature,
			TSignature tSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_binding = pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, mAnonymous, mInstance, mDefinition, tAnonymous, tDefinition, mSignature, tSignature, sourceMatch,
				targetMatch);
		if (result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_black = pattern_LinkDefinitionToAnonymous_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mAnonymous, mInstance, mDefinition, tAnonymous, tDefinition,
						mSignature, tSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_blackBBBFBBFFBBB(
			AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous, TMember tDefinition,
			MSignature mSignature, TSignature tSignature, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
				if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
					for (AnonymousClassDeclarationToTClass mAnonymousToTAnonymous : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tAnonymous, AnonymousClassDeclarationToTClass.class, "target")) {
						if (mAnonymous.equals(mAnonymousToTAnonymous.getSource())) {
							for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
								if (tSignature.equals(mSignatureToTSignature.getTarget())) {
									_result.add(new Object[] { mAnonymous, mDefinition, tAnonymous,
											mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous,
											mDefinitionToTMember, tSignature, sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_greenBBBBBF(
			MSignatureToTSignature mSignatureToTSignature, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MDefinitionToTMember mDefinitionToTMember, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "LinkDefinitionToAnonymous";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mSignatureToTSignature);
		ccMatch.getAllContextElements().add(mAnonymousToTAnonymous);
		ccMatch.getAllContextElements().add(mDefinitionToTMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mSignatureToTSignature, mAnonymousToTAnonymous, mDefinitionToTMember, sourceMatch,
				targetMatch, ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_6_createcorrespondence_blackBBBBBBBB(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			TClass tAnonymous, TMember tDefinition, MSignature mSignature, TSignature tSignature, CCMatch ccMatch) {
		return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, tDefinition, mSignature, tSignature,
				ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "LinkDefinitionToAnonymous";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkDefinitionToAnonymous_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_27_1_matchtggpattern_blackBBBB(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			MSignature mSignature) {
		if (mAnonymous.getBodyDeclarations().contains(mDefinition)) {
			if (mSignature.getMDefinitions().contains(mDefinition)) {
				if (mAnonymous.equals(mInstance.getAnonymousClassDeclaration())) {
					return new Object[] { mAnonymous, mInstance, mDefinition, mSignature };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_28_1_matchtggpattern_blackBBB(TClass tAnonymous,
			TMember tDefinition, TSignature tSignature) {
		if (tAnonymous.getDefines().contains(tDefinition)) {
			if (tAnonymous.getSignature().contains(tSignature)) {
				if (tSignature.getDefinitions().contains(tDefinition)) {
					return new Object[] { tAnonymous, tDefinition, tSignature };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_1_createresult_blackB(
			LinkDefinitionToAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration mAnonymous) {
		if (ruleResult.getSourceObjects().contains(mAnonymous)) {
			return new Object[] { ruleResult, mAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ClassInstanceCreation mInstance) {
		if (ruleResult.getSourceObjects().contains(mInstance)) {
			return new Object[] { ruleResult, mInstance };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous) {
		if (ruleResult.getCorrObjects().contains(mAnonymousToTAnonymous)) {
			return new Object[] { ruleResult, mAnonymousToTAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TClass tAnonymous) {
		if (ruleResult.getTargetObjects().contains(tAnonymous)) {
			return new Object[] { ruleResult, tAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, TSignature tSignature) {
		if (ruleResult.getTargetObjects().contains(tSignature)) {
			return new Object[] { ruleResult, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, TMember tDefinition) {
		if (ruleResult.getTargetObjects().contains(tDefinition)) {
			return new Object[] { ruleResult, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_9BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mDefinitionToTMember) {
		if (ruleResult.getCorrObjects().contains(mDefinitionToTMember)) {
			return new Object[] { ruleResult, mDefinitionToTMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_blackFFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mAnonymousToTAnonymousList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mSignatureToTSignatureList : ruleEntryContainer.getRuleEntryList()) {
				if (!mAnonymousToTAnonymousList.equals(mSignatureToTSignatureList)) {
					for (EObject tmpMAnonymousToTAnonymous : mAnonymousToTAnonymousList.getEntryObjects()) {
						if (tmpMAnonymousToTAnonymous instanceof AnonymousClassDeclarationToTClass) {
							AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) tmpMAnonymousToTAnonymous;
							AnonymousClassDeclaration mAnonymous = mAnonymousToTAnonymous.getSource();
							if (mAnonymous != null) {
								TClass tAnonymous = mAnonymousToTAnonymous.getTarget();
								if (tAnonymous != null) {
									ClassInstanceCreation mInstance = mAnonymous.getClassInstanceCreation();
									if (mInstance != null) {
										if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_2BB(
												ruleResult, mAnonymousToTAnonymous) == null) {
											if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, mAnonymous) == null) {
												if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_3BB(
														ruleResult, tAnonymous) == null) {
													if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_1BB(
															ruleResult, mInstance) == null) {
														for (EObject tmpMSignatureToTSignature : mSignatureToTSignatureList
																.getEntryObjects()) {
															if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
																MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
																MSignature mSignature = mSignatureToTSignature
																		.getSource();
																if (mSignature != null) {
																	TSignature tSignature = mSignatureToTSignature
																			.getTarget();
																	if (tSignature != null) {
																		if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_6BB(
																				ruleResult,
																				mSignatureToTSignature) == null) {
																			if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, mSignature) == null) {
																				if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_7BB(
																						ruleResult,
																						tSignature) == null) {
																					for (MDefinition mDefinition : mSignature
																							.getMDefinitions()) {
																						if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_4BB(
																								ruleResult,
																								mDefinition) == null) {
																							for (TMember tDefinition : tSignature
																									.getDefinitions()) {
																								if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_8BB(
																										ruleResult,
																										tDefinition) == null) {
																									for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
																											.getOppositeReferenceTyped(
																													mDefinition,
																													MDefinitionToTMember.class,
																													"source")) {
																										if (tDefinition
																												.equals(mDefinitionToTMember
																														.getTarget())) {
																											if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_9BB(
																													ruleResult,
																													mDefinitionToTMember) == null) {
																												_result.add(
																														new Object[] {
																																mAnonymousToTAnonymousList,
																																mAnonymous,
																																mInstance,
																																mAnonymousToTAnonymous,
																																tAnonymous,
																																mSignatureToTSignatureList,
																																mDefinition,
																																mSignature,
																																mSignatureToTSignature,
																																tSignature,
																																tDefinition,
																																mDefinitionToTMember,
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
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingFBBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, TClass tAnonymous,
			MSignatureToTSignature mSignatureToTSignature, TMember tDefinition, MSignature mSignature,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mAnonymous, mInstance, mDefinition,
				tAnonymous, mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous,
				mDefinitionToTMember, tSignature, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous,
					mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember,
					tSignature, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnonymous,
			ClassInstanceCreation mInstance, MDefinition mDefinition, TClass tAnonymous,
			MSignatureToTSignature mSignatureToTSignature, TMember tDefinition, MSignature mSignature,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MDefinitionToTMember mDefinitionToTMember,
			TSignature tSignature, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_binding = pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature,
				tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, ruleResult);
		if (result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_black = pattern_LinkDefinitionToAnonymous_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAnonymous, mInstance, mDefinition, tAnonymous,
						mSignatureToTSignature, tDefinition, mSignature, mAnonymousToTAnonymous, mDefinitionToTMember,
						tSignature, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_29_4_checkCSP_expressionFBB(
			LinkDefinitionToAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_5_checknacs_blackBBBBBBBBBB(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			TClass tAnonymous, MSignatureToTSignature mSignatureToTSignature, TMember tDefinition,
			MSignature mSignature, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature) {
		return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition,
				mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_6_perform_blackBBBBBBBBBBB(
			AnonymousClassDeclaration mAnonymous, ClassInstanceCreation mInstance, MDefinition mDefinition,
			TClass tAnonymous, MSignatureToTSignature mSignatureToTSignature, TMember tDefinition,
			MSignature mSignature, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous,
			MDefinitionToTMember mDefinitionToTMember, TSignature tSignature, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mAnonymous, mInstance, mDefinition, tAnonymous, mSignatureToTSignature, tDefinition,
				mSignature, mAnonymousToTAnonymous, mDefinitionToTMember, tSignature, ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_6_perform_greenBBBBBB(
			AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous, TMember tDefinition,
			TSignature tSignature, ModelgeneratorRuleResult ruleResult) {
		mAnonymous.getBodyDeclarations().add(mDefinition);
		tAnonymous.getDefines().add(tDefinition);
		tAnonymous.getSignature().add(tSignature);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mAnonymous, mDefinition, tAnonymous, tDefinition, tSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LinkDefinitionToAnonymous_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LinkDefinitionToAnonymousImpl
