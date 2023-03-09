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
	public boolean isAppropriate_FWD(Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition,
			MSignature mSignature) {

		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_0_1_initialbindings_blackBBBBB(this, match, mAnonymous, mDefinition,
						mSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mSignature] = " + mSignature + ".");
		}

		Object[] result2_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mAnonymous,
						mDefinition, mSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mSignature] = " + mSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_blackBBBB(match, mAnonymous,
							mDefinition, mSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnonymous] = " + mAnonymous + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mSignature] = " + mSignature + ".");
			}
			LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_greenBBBFF(match, mAnonymous,
							mDefinition);
			//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result4_green[4];

			Object[] result5_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_blackBBBB(match, mAnonymous,
							mDefinition, mSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnonymous] = " + mAnonymous + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mSignature] = " + mSignature + ".");
			}
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_greenBBBBFF(
					match, mAnonymous, mDefinition, mSignature);
			//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result5_green[5];

			// 
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, mAnonymous, mDefinition, mSignature);
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
				.pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[0];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[1];
		TMember tDefinition = (TMember) result1_bindingAndBlack[2];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[3];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[4];
		TClass tAnonymous = (TClass) result1_bindingAndBlack[5];
		TSignature tSignature = (TSignature) result1_bindingAndBlack[6];
		MSignature mSignature = (MSignature) result1_bindingAndBlack[7];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_1_performtransformation_greenBBB(tDefinition,
				tAnonymous, tSignature);

		Object[] result2_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
						tAnonymous, tSignature, mSignature, mDefinitionToTMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mAnonymousToTAnonymous] = " + mAnonymousToTAnonymous + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[tDefinition] = " + tDefinition
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[tAnonymous] = " + tAnonymous + ", " + "[tSignature] = " + tSignature + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ".");
		}
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature);
		//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result3_green[10];

		// 
		// 
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
				tAnonymous, tSignature, mSignature, mDefinitionToTMember);
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
				.pattern_LinkDefinitionToAnonymous_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_binding[0];
		MDefinition mDefinition = (MDefinition) result2_binding[1];
		MSignature mSignature = (MSignature) result2_binding[2];
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_2_2_corematch_blackFFFBBFFBFB(mAnonymous, mDefinition, mSignature,
						match)) {
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result2_black[0];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[1];
			TMember tDefinition = (TMember) result2_black[2];
			TClass tAnonymous = (TClass) result2_black[5];
			TSignature tSignature = (TSignature) result2_black[6];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[8];
			// ForEach 
			for (Object[] result3_black : LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_2_3_findcontext_blackBBBBBBBBB(mAnonymousToTAnonymous,
							mSignatureToTSignature, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature,
							mSignature, mDefinitionToTMember)) {
				Object[] result3_green = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFF(
								mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
								tAnonymous, tSignature, mSignature, mDefinitionToTMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition,
								mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mAnonymousToTAnonymous] = "
							+ mAnonymousToTAnonymous + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature
							+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mAnonymous] = " + mAnonymous + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tAnonymous] = " + tAnonymous + ", "
							+ "[tSignature] = " + tSignature + ", " + "[mSignature] = " + mSignature + ", "
							+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ".");
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
	public void registerObjectsToMatch_FWD(Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition,
			MSignature mSignature) {
		match.registerObject("mAnonymous", mAnonymous);
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mSignature", mSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition,
			MSignature mSignature) {// Create CSP
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
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mAnonymousToTAnonymous,
			EObject mSignatureToTSignature, EObject tDefinition, EObject mAnonymous, EObject mDefinition,
			EObject tAnonymous, EObject tSignature, EObject mSignature, EObject mDefinitionToTMember) {
		ruleresult.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);

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
	public boolean isAppropriate_BWD(Match match, TMember tDefinition, TClass tAnonymous, TSignature tSignature) {

		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_10_1_initialbindings_blackBBBBB(this, match, tDefinition, tAnonymous,
						tSignature);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tDefinition] = " + tDefinition + ", " + "[tAnonymous] = "
					+ tAnonymous + ", " + "[tSignature] = " + tSignature + ".");
		}

		Object[] result2_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tDefinition,
						tAnonymous, tSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tDefinition] = " + tDefinition + ", " + "[tAnonymous] = "
					+ tAnonymous + ", " + "[tSignature] = " + tSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_blackBBBB(match, tDefinition,
							tAnonymous, tSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tDefinition] = " + tDefinition + ", " + "[tAnonymous] = " + tAnonymous + ", "
						+ "[tSignature] = " + tSignature + ".");
			}
			LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_greenBBBBFFF(match,
							tDefinition, tAnonymous, tSignature);
			//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result4_green[6];

			Object[] result5_black = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_blackBBBB(match, tDefinition,
							tAnonymous, tSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tDefinition] = " + tDefinition + ", " + "[tAnonymous] = " + tAnonymous + ", "
						+ "[tSignature] = " + tSignature + ".");
			}
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_greenBBBBFF(
					match, tDefinition, tAnonymous, tSignature);
			//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result5_green[5];

			// 
			LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, tDefinition, tAnonymous, tSignature);
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
				.pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[0];
		MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result1_bindingAndBlack[1];
		TMember tDefinition = (TMember) result1_bindingAndBlack[2];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result1_bindingAndBlack[3];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[4];
		TClass tAnonymous = (TClass) result1_bindingAndBlack[5];
		TSignature tSignature = (TSignature) result1_bindingAndBlack[6];
		MSignature mSignature = (MSignature) result1_bindingAndBlack[7];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_1_performtransformation_greenBB(mAnonymous,
				mDefinition);

		Object[] result2_green = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
						tAnonymous, tSignature, mSignature, mDefinitionToTMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mAnonymousToTAnonymous] = " + mAnonymousToTAnonymous + ", "
					+ "[mSignatureToTSignature] = " + mSignatureToTSignature + ", " + "[tDefinition] = " + tDefinition
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[tAnonymous] = " + tAnonymous + ", " + "[tSignature] = " + tSignature + ", " + "[mSignature] = "
					+ mSignature + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ".");
		}
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature);
		//nothing EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result3_green[10];

		// 
		// 
		LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
				tAnonymous, tSignature, mSignature, mDefinitionToTMember);
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
		TMember tDefinition = (TMember) result2_binding[0];
		TClass tAnonymous = (TClass) result2_binding[1];
		TSignature tSignature = (TSignature) result2_binding[2];
		for (Object[] result2_black : LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_12_2_corematch_blackFFBFFBBFFB(tDefinition, tAnonymous, tSignature,
						match)) {
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result2_black[0];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[1];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[3];
			MDefinition mDefinition = (MDefinition) result2_black[4];
			MSignature mSignature = (MSignature) result2_black[7];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[8];
			// ForEach 
			for (Object[] result3_black : LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_12_3_findcontext_blackBBBBBBBBB(mAnonymousToTAnonymous,
							mSignatureToTSignature, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature,
							mSignature, mDefinitionToTMember)) {
				Object[] result3_green = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFF(
								mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
								tAnonymous, tSignature, mSignature, mDefinitionToTMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge tAnonymous__tDefinition____defines = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tDefinition__tAnonymous____definedBy = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mSignatureToTSignature__tSignature____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mSignatureToTSignature__mSignature____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge mSignature__mDefinition____mDefinitions = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mDefinition__mSignature____mSignature = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tAnonymous__tSignature____signature = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[22];

				Object[] result4_bindingAndBlack = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition,
								mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mAnonymousToTAnonymous] = "
							+ mAnonymousToTAnonymous + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature
							+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mAnonymous] = " + mAnonymous + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tAnonymous] = " + tAnonymous + ", "
							+ "[tSignature] = " + tSignature + ", " + "[mSignature] = " + mSignature + ", "
							+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TMember tDefinition, TClass tAnonymous, TSignature tSignature) {
		match.registerObject("tDefinition", tDefinition);
		match.registerObject("tAnonymous", tAnonymous);
		match.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tDefinition, TClass tAnonymous, TSignature tSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mAnonymousToTAnonymous,
			EObject mSignatureToTSignature, EObject tDefinition, EObject mAnonymous, EObject mDefinition,
			EObject tAnonymous, EObject tSignature, EObject mSignature, EObject mDefinitionToTMember) {
		ruleresult.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		ruleresult.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("mSignature", mSignature);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_82(EMoflonEdge _edge_defines) {

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
			TMember tDefinition = (TMember) result2_black[0];
			TClass tAnonymous = (TClass) result2_black[1];
			TSignature tSignature = (TSignature) result2_black[2];
			Object[] result2_green = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tDefinition, tAnonymous, tSignature)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_85(EMoflonEdge _edge_bodyDeclarations) {

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
				.pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_blackFFFB(_edge_bodyDeclarations)) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			MSignature mSignature = (MSignature) result2_black[2];
			Object[] result2_green = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, mAnonymous, mDefinition, mSignature)) {
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
				.pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMember tDefinition = (TMember) result2_bindingAndBlack[0];
		AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[2];
		TClass tAnonymous = (TClass) result2_bindingAndBlack[3];
		TSignature tSignature = (TSignature) result2_bindingAndBlack[4];
		MSignature mSignature = (MSignature) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tDefinition,
						mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[mAnonymous] = " + mAnonymous + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[tAnonymous] = " + tAnonymous + ", "
					+ "[tSignature] = " + tSignature + ", " + "[mSignature] = " + mSignature + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_blackFFBBBBBBFBB(tDefinition, mAnonymous,
							mDefinition, tAnonymous, tSignature, mSignature, sourceMatch, targetMatch)) {
				AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result5_black[0];
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result5_black[1];
				MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result5_black[8];
				Object[] result5_green = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_greenBBBBBF(mAnonymousToTAnonymous,
								mSignatureToTSignature, mDefinitionToTMember, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_24_6_createcorrespondence_blackBBBBBBB(tDefinition,
								mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[tDefinition] = " + tDefinition + ", "
									+ "[mAnonymous] = " + mAnonymous + ", " + "[mDefinition] = " + mDefinition + ", "
									+ "[tAnonymous] = " + tAnonymous + ", " + "[tSignature] = " + tSignature + ", "
									+ "[mSignature] = " + mSignature + ", " + "[ccMatch] = " + ccMatch + ".");
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
	public CSP isApplicable_solveCsp_CC(TMember tDefinition, AnonymousClassDeclaration mAnonymous,
			MDefinition mDefinition, TClass tAnonymous, TSignature tSignature, MSignature mSignature, Match sourceMatch,
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
	public boolean checkDEC_FWD(AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, MSignature mSignature) {// 
		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_27_1_matchtggpattern_blackBBB(mAnonymous, mDefinition, mSignature);
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
	public boolean checkDEC_BWD(TMember tDefinition, TClass tAnonymous, TSignature tSignature) {// 
		Object[] result1_black = LinkDefinitionToAnonymousImpl
				.pattern_LinkDefinitionToAnonymous_28_1_matchtggpattern_blackBBB(tDefinition, tAnonymous, tSignature);
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
				.pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_blackFFFFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList mAnonymousToTAnonymousList = (RuleEntryList) result2_black[0];
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result2_black[1];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result2_black[2];
			TClass tAnonymous = (TClass) result2_black[3];
			//nothing RuleEntryList mSignatureToTSignatureList = (RuleEntryList) result2_black[4];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result2_black[5];
			TSignature tSignature = (TSignature) result2_black[6];
			TMember tDefinition = (TMember) result2_black[7];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result2_black[8];
			MDefinition mDefinition = (MDefinition) result2_black[9];
			MSignature mSignature = (MSignature) result2_black[10];

			Object[] result3_bindingAndBlack = LinkDefinitionToAnonymousImpl
					.pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
							isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous,
							mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mAnonymousToTAnonymous] = "
						+ mAnonymousToTAnonymous + ", " + "[mSignatureToTSignature] = " + mSignatureToTSignature + ", "
						+ "[tDefinition] = " + tDefinition + ", " + "[mAnonymous] = " + mAnonymous + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[tAnonymous] = " + tAnonymous + ", "
						+ "[tSignature] = " + tSignature + ", " + "[mSignature] = " + mSignature + ", "
						+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = LinkDefinitionToAnonymousImpl
						.pattern_LinkDefinitionToAnonymous_29_5_checknacs_blackBBBBBBBBB(mAnonymousToTAnonymous,
								mSignatureToTSignature, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature,
								mSignature, mDefinitionToTMember);
				if (result5_black != null) {

					Object[] result6_black = LinkDefinitionToAnonymousImpl
							.pattern_LinkDefinitionToAnonymous_29_6_perform_blackBBBBBBBBBB(mAnonymousToTAnonymous,
									mSignatureToTSignature, tDefinition, mAnonymous, mDefinition, tAnonymous,
									tSignature, mSignature, mDefinitionToTMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[mAnonymousToTAnonymous] = "
										+ mAnonymousToTAnonymous + ", " + "[mSignatureToTSignature] = "
										+ mSignatureToTSignature + ", " + "[tDefinition] = " + tDefinition + ", "
										+ "[mAnonymous] = " + mAnonymous + ", " + "[mDefinition] = " + mDefinition
										+ ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tSignature] = " + tSignature
										+ ", " + "[mSignature] = " + mSignature + ", " + "[mDefinitionToTMember] = "
										+ mDefinitionToTMember + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					LinkDefinitionToAnonymousImpl.pattern_LinkDefinitionToAnonymous_29_6_perform_greenBBBBBB(
							tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, ruleResult);

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAnonymousToTAnonymous", mAnonymousToTAnonymous);
		isApplicableMatch.registerObject("mSignatureToTSignature", mSignatureToTSignature);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("mSignature", mSignature);
		isApplicableMatch.registerObject("mDefinitionToTMember", mDefinitionToTMember);
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
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MDEFINITION_MSIGNATURE:
			return isAppropriate_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (MSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MDEFINITION_MSIGNATURE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (MSignature) arguments.get(3));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MDEFINITION_MSIGNATURE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (MSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATIONTOTCLASS_MSIGNATURETOTSIGNATURE_TMEMBER_ANONYMOUSCLASSDECLARATION_MDEFINITION_TCLASS_TSIGNATURE_MSIGNATURE_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclarationToTClass) arguments.get(1), (MSignatureToTSignature) arguments.get(2),
					(TMember) arguments.get(3), (AnonymousClassDeclaration) arguments.get(4),
					(MDefinition) arguments.get(5), (TClass) arguments.get(6), (TSignature) arguments.get(7),
					(MSignature) arguments.get(8), (MDefinitionToTMember) arguments.get(9));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TCLASS_TSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TClass) arguments.get(2),
					(TSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TCLASS_TSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1), (TClass) arguments.get(2),
					(TSignature) arguments.get(3));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TCLASS_TSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TClass) arguments.get(2), (TSignature) arguments.get(3));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATIONTOTCLASS_MSIGNATURETOTSIGNATURE_TMEMBER_ANONYMOUSCLASSDECLARATION_MDEFINITION_TCLASS_TSIGNATURE_MSIGNATURE_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclarationToTClass) arguments.get(1), (MSignatureToTSignature) arguments.get(2),
					(TMember) arguments.get(3), (AnonymousClassDeclaration) arguments.get(4),
					(MDefinition) arguments.get(5), (TClass) arguments.get(6), (TSignature) arguments.get(7),
					(MSignature) arguments.get(8), (MDefinitionToTMember) arguments.get(9));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_82__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_82((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_85__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_85((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_CC__TMEMBER_ANONYMOUSCLASSDECLARATION_MDEFINITION_TCLASS_TSIGNATURE_MSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMember) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (TClass) arguments.get(3), (TSignature) arguments.get(4),
					(MSignature) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_DEC_FWD__ANONYMOUSCLASSDECLARATION_MDEFINITION_MSIGNATURE:
			return checkDEC_FWD((AnonymousClassDeclaration) arguments.get(0), (MDefinition) arguments.get(1),
					(MSignature) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___CHECK_DEC_BWD__TMEMBER_TCLASS_TSIGNATURE:
			return checkDEC_BWD((TMember) arguments.get(0), (TClass) arguments.get(1), (TSignature) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___GENERATE_MODEL__RULEENTRYCONTAINER_ANONYMOUSCLASSDECLARATIONTOTCLASS_MSIGNATURETOTSIGNATURE:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(AnonymousClassDeclarationToTClass) arguments.get(1), (MSignatureToTSignature) arguments.get(2));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATIONTOTCLASS_MSIGNATURETOTSIGNATURE_TMEMBER_ANONYMOUSCLASSDECLARATION_MDEFINITION_TCLASS_TSIGNATURE_MSIGNATURE_MDEFINITIONTOTMEMBER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclarationToTClass) arguments.get(1), (MSignatureToTSignature) arguments.get(2),
					(TMember) arguments.get(3), (AnonymousClassDeclaration) arguments.get(4),
					(MDefinition) arguments.get(5), (TClass) arguments.get(6), (TSignature) arguments.get(7),
					(MSignature) arguments.get(8), (MDefinitionToTMember) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.LINK_DEFINITION_TO_ANONYMOUS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_1_initialbindings_blackBBBBB(
			LinkDefinitionToAnonymous _this, Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition,
			MSignature mSignature) {
		return new Object[] { _this, match, mAnonymous, mDefinition, mSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition,
			MSignature mSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mAnonymous, mDefinition, mSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mAnonymous, mDefinition, mSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingAndBlackFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition,
			MSignature mSignature) {
		Object[] result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_binding = pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mAnonymous, mDefinition, mSignature);
		if (result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_black = pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mAnonymous, mDefinition, mSignature };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_4_collectelementstobetranslated_blackBBBB(
			Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, MSignature mSignature) {
		return new Object[] { match, mAnonymous, mDefinition, mSignature };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_blackBBBB(Match match,
			AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, MSignature mSignature) {
		return new Object[] { match, mAnonymous, mDefinition, mSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_0_5_collectcontextelements_greenBBBBFF(Match match,
			AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, MSignature mSignature) {
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mAnonymous);
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(mSignature);
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		match.getContextEdges().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		match.getContextEdges().add(mDefinition__mSignature____mSignature);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		return new Object[] { match, mAnonymous, mDefinition, mSignature, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature };
	}

	public static final void pattern_LinkDefinitionToAnonymous_0_6_registerobjectstomatch_expressionBBBBB(
			LinkDefinitionToAnonymous _this, Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition,
			MSignature mSignature) {
		_this.registerObjectsToMatch_FWD(match, mAnonymous, mDefinition, mSignature);

	}

	public static final boolean pattern_LinkDefinitionToAnonymous_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mAnonymousToTAnonymous");
		EObject _localVariable_1 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("tAnonymous");
		EObject _localVariable_6 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_7 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_8 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject tmpMAnonymousToTAnonymous = _localVariable_0;
		EObject tmpMSignatureToTSignature = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		EObject tmpMAnonymous = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpTAnonymous = _localVariable_5;
		EObject tmpTSignature = _localVariable_6;
		EObject tmpMSignature = _localVariable_7;
		EObject tmpMDefinitionToTMember = _localVariable_8;
		if (tmpMAnonymousToTAnonymous instanceof AnonymousClassDeclarationToTClass) {
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) tmpMAnonymousToTAnonymous;
			if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
				if (tmpTDefinition instanceof TMember) {
					TMember tDefinition = (TMember) tmpTDefinition;
					if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							if (tmpTAnonymous instanceof TClass) {
								TClass tAnonymous = (TClass) tmpTAnonymous;
								if (tmpTSignature instanceof TSignature) {
									TSignature tSignature = (TSignature) tmpTSignature;
									if (tmpMSignature instanceof MSignature) {
										MSignature mSignature = (MSignature) tmpMSignature;
										if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
											MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
											return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature,
													tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature,
													mSignature, mDefinitionToTMember, isApplicableMatch };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_blackBBBBBBBBBFBB(
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember,
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous,
						mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding = pattern_LinkDefinitionToAnonymous_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding != null) {
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[0];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[1];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[2];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[3];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[4];
			TClass tAnonymous = (TClass) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[5];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[6];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[7];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_binding[8];

			Object[] result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_black = pattern_LinkDefinitionToAnonymous_1_1_performtransformation_blackBBBBBBBBBFBB(
					mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition, tAnonymous,
					tSignature, mSignature, mDefinitionToTMember, _this, isApplicableMatch);
			if (result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_1_1_performtransformation_black[9];

				return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous,
						mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_1_performtransformation_greenBBB(
			TMember tDefinition, TClass tAnonymous, TSignature tSignature) {
		tAnonymous.getDefines().add(tDefinition);
		tAnonymous.getSignature().add(tSignature);
		return new Object[] { tDefinition, tAnonymous, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mAnonymousToTAnonymous, EObject mSignatureToTSignature,
			EObject tDefinition, EObject mAnonymous, EObject mDefinition, EObject tAnonymous, EObject tSignature,
			EObject mSignature, EObject mDefinitionToTMember) {
		if (!mAnonymousToTAnonymous.equals(mSignatureToTSignature)) {
			if (!mAnonymousToTAnonymous.equals(tDefinition)) {
				if (!mAnonymousToTAnonymous.equals(mDefinition)) {
					if (!mAnonymousToTAnonymous.equals(tAnonymous)) {
						if (!mAnonymousToTAnonymous.equals(tSignature)) {
							if (!mAnonymousToTAnonymous.equals(mSignature)) {
								if (!mAnonymousToTAnonymous.equals(mDefinitionToTMember)) {
									if (!mSignatureToTSignature.equals(tDefinition)) {
										if (!mSignatureToTSignature.equals(tAnonymous)) {
											if (!mSignatureToTSignature.equals(tSignature)) {
												if (!tDefinition.equals(tSignature)) {
													if (!mAnonymous.equals(mAnonymousToTAnonymous)) {
														if (!mAnonymous.equals(mSignatureToTSignature)) {
															if (!mAnonymous.equals(tDefinition)) {
																if (!mAnonymous.equals(mDefinition)) {
																	if (!mAnonymous.equals(tAnonymous)) {
																		if (!mAnonymous.equals(tSignature)) {
																			if (!mAnonymous.equals(mSignature)) {
																				if (!mAnonymous
																						.equals(mDefinitionToTMember)) {
																					if (!mDefinition.equals(
																							mSignatureToTSignature)) {
																						if (!mDefinition
																								.equals(tDefinition)) {
																							if (!mDefinition.equals(
																									tAnonymous)) {
																								if (!mDefinition.equals(
																										tSignature)) {
																									if (!mDefinition
																											.equals(mSignature)) {
																										if (!mDefinition
																												.equals(mDefinitionToTMember)) {
																											if (!tAnonymous
																													.equals(tDefinition)) {
																												if (!tAnonymous
																														.equals(tSignature)) {
																													if (!mSignature
																															.equals(mSignatureToTSignature)) {
																														if (!mSignature
																																.equals(tDefinition)) {
																															if (!mSignature
																																	.equals(tAnonymous)) {
																																if (!mSignature
																																		.equals(tSignature)) {
																																	if (!mDefinitionToTMember
																																			.equals(mSignatureToTSignature)) {
																																		if (!mDefinitionToTMember
																																				.equals(tDefinition)) {
																																			if (!mDefinitionToTMember
																																					.equals(tAnonymous)) {
																																				if (!mDefinitionToTMember
																																						.equals(tSignature)) {
																																					if (!mDefinitionToTMember
																																							.equals(mSignature)) {
																																						return new Object[] {
																																								ruleresult,
																																								mAnonymousToTAnonymous,
																																								mSignatureToTSignature,
																																								tDefinition,
																																								mAnonymous,
																																								mDefinition,
																																								tAnonymous,
																																								tSignature,
																																								mSignature,
																																								mDefinitionToTMember };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject tDefinition, EObject mAnonymous, EObject mDefinition,
			EObject tAnonymous, EObject tSignature) {
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
		return new Object[] { ruleresult, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature,
				mAnonymous__mDefinition____bodyDeclarations, mDefinition__mAnonymous____anonymousClassDeclarationOwner,
				tAnonymous__tDefinition____defines, tDefinition__tAnonymous____definedBy,
				tAnonymous__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToAnonymous_1_5_registerobjects_expressionBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, PerformRuleResult ruleresult, EObject mAnonymousToTAnonymous,
			EObject mSignatureToTSignature, EObject tDefinition, EObject mAnonymous, EObject mDefinition,
			EObject tAnonymous, EObject tSignature, EObject mSignature, EObject mDefinitionToTMember) {
		_this.registerObjects_FWD(ruleresult, mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous,
				mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember);

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

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mAnonymous");
		EObject _localVariable_1 = match.getObject("mDefinition");
		EObject _localVariable_2 = match.getObject("mSignature");
		EObject tmpMAnonymous = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMSignature = _localVariable_2;
		if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (tmpMSignature instanceof MSignature) {
					MSignature mSignature = (MSignature) tmpMSignature;
					return new Object[] { mAnonymous, mDefinition, mSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_2_2_corematch_blackFFFBBFFBFB(
			AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, MSignature mSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mSignature, MSignatureToTSignature.class, "source")) {
			TSignature tSignature = mSignatureToTSignature.getTarget();
			if (tSignature != null) {
				for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
					TMember tDefinition = mDefinitionToTMember.getTarget();
					if (tDefinition != null) {
						for (AnonymousClassDeclarationToTClass mAnonymousToTAnonymous : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mAnonymous, AnonymousClassDeclarationToTClass.class,
										"source")) {
							TClass tAnonymous = mAnonymousToTAnonymous.getTarget();
							if (tAnonymous != null) {
								_result.add(new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition,
										mAnonymous, mDefinition, tAnonymous, tSignature, mSignature,
										mDefinitionToTMember, match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_2_3_findcontext_blackBBBBBBBBB(
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnonymous.getBodyDeclarations().contains(mDefinition)) {
			if (tSignature.equals(mSignatureToTSignature.getTarget())) {
				if (mSignature.equals(mSignatureToTSignature.getSource())) {
					if (mDefinition.equals(mDefinitionToTMember.getSource())) {
						if (mAnonymous.equals(mAnonymousToTAnonymous.getSource())) {
							if (tAnonymous.equals(mAnonymousToTAnonymous.getTarget())) {
								if (mSignature.getMDefinitions().contains(mDefinition)) {
									if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
										if (tSignature.getDefinitions().contains(tDefinition)) {
											_result.add(new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature,
													tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature,
													mSignature, mDefinitionToTMember });
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFF(
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mAnonymous__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mAnonymous____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mAnonymous__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mAnonymousToTAnonymous__mAnonymous____source_name_prime = "source";
		String mAnonymousToTAnonymous__tAnonymous____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		mAnonymous__mDefinition____bodyDeclarations.setSrc(mAnonymous);
		mAnonymous__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mDefinition____bodyDeclarations);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mDefinition__mAnonymous____anonymousClassDeclarationOwner);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDefinition____source);
		mAnonymousToTAnonymous__mAnonymous____source.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__mAnonymous____source.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__mAnonymous____source);
		mAnonymousToTAnonymous__tAnonymous____target.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__tAnonymous____target.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__tAnonymous____target);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDefinition____target);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		mAnonymous__mDefinition____bodyDeclarations.setName(mAnonymous__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mAnonymous____anonymousClassDeclarationOwner
				.setName(mDefinition__mAnonymous____anonymousClassDeclarationOwner_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mAnonymousToTAnonymous__mAnonymous____source.setName(mAnonymousToTAnonymous__mAnonymous____source_name_prime);
		mAnonymousToTAnonymous__tAnonymous____target.setName(mAnonymousToTAnonymous__tAnonymous____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
				tAnonymous, tSignature, mSignature, mDefinitionToTMember, isApplicableMatch,
				mAnonymous__mDefinition____bodyDeclarations, mDefinition__mAnonymous____anonymousClassDeclarationOwner,
				mSignatureToTSignature__tSignature____target, mSignatureToTSignature__mSignature____source,
				mDefinitionToTMember__mDefinition____source, mAnonymousToTAnonymous__mAnonymous____source,
				mAnonymousToTAnonymous__tAnonymous____target, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature, mDefinitionToTMember__tDefinition____target,
				tSignature__tDefinition____definitions, tDefinition__tSignature____signature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingFBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mAnonymousToTAnonymous,
				mSignatureToTSignature, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature,
				mDefinitionToTMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature,
					tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {
		Object[] result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_binding = pattern_LinkDefinitionToAnonymous_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous,
				mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember);
		if (result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_black = pattern_LinkDefinitionToAnonymous_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature,
						tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature,
						mDefinitionToTMember };
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
			LinkDefinitionToAnonymous _this, Match match, TMember tDefinition, TClass tAnonymous,
			TSignature tSignature) {
		return new Object[] { _this, match, tDefinition, tAnonymous, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TMember tDefinition, TClass tAnonymous,
			TSignature tSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tDefinition, tAnonymous, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tDefinition, tAnonymous, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingAndBlackFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TMember tDefinition, TClass tAnonymous,
			TSignature tSignature) {
		Object[] result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_binding = pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tDefinition, tAnonymous, tSignature);
		if (result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_black = pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tDefinition, tAnonymous, tSignature };
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
			Match match, TMember tDefinition, TClass tAnonymous, TSignature tSignature) {
		return new Object[] { match, tDefinition, tAnonymous, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TMember tDefinition, TClass tAnonymous, TSignature tSignature) {
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
		return new Object[] { match, tDefinition, tAnonymous, tSignature, tAnonymous__tDefinition____defines,
				tDefinition__tAnonymous____definedBy, tAnonymous__tSignature____signature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_blackBBBB(Match match,
			TMember tDefinition, TClass tAnonymous, TSignature tSignature) {
		return new Object[] { match, tDefinition, tAnonymous, tSignature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_10_5_collectcontextelements_greenBBBBFF(Match match,
			TMember tDefinition, TClass tAnonymous, TSignature tSignature) {
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tDefinition);
		match.getContextNodes().add(tAnonymous);
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
		return new Object[] { match, tDefinition, tAnonymous, tSignature, tSignature__tDefinition____definitions,
				tDefinition__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToAnonymous_10_6_registerobjectstomatch_expressionBBBBB(
			LinkDefinitionToAnonymous _this, Match match, TMember tDefinition, TClass tAnonymous,
			TSignature tSignature) {
		_this.registerObjectsToMatch_BWD(match, tDefinition, tAnonymous, tSignature);

	}

	public static final boolean pattern_LinkDefinitionToAnonymous_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mAnonymousToTAnonymous");
		EObject _localVariable_1 = isApplicableMatch.getObject("mSignatureToTSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("tAnonymous");
		EObject _localVariable_6 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_7 = isApplicableMatch.getObject("mSignature");
		EObject _localVariable_8 = isApplicableMatch.getObject("mDefinitionToTMember");
		EObject tmpMAnonymousToTAnonymous = _localVariable_0;
		EObject tmpMSignatureToTSignature = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		EObject tmpMAnonymous = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpTAnonymous = _localVariable_5;
		EObject tmpTSignature = _localVariable_6;
		EObject tmpMSignature = _localVariable_7;
		EObject tmpMDefinitionToTMember = _localVariable_8;
		if (tmpMAnonymousToTAnonymous instanceof AnonymousClassDeclarationToTClass) {
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) tmpMAnonymousToTAnonymous;
			if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
				MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
				if (tmpTDefinition instanceof TMember) {
					TMember tDefinition = (TMember) tmpTDefinition;
					if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							if (tmpTAnonymous instanceof TClass) {
								TClass tAnonymous = (TClass) tmpTAnonymous;
								if (tmpTSignature instanceof TSignature) {
									TSignature tSignature = (TSignature) tmpTSignature;
									if (tmpMSignature instanceof MSignature) {
										MSignature mSignature = (MSignature) tmpMSignature;
										if (tmpMDefinitionToTMember instanceof MDefinitionToTMember) {
											MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) tmpMDefinitionToTMember;
											return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature,
													tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature,
													mSignature, mDefinitionToTMember, isApplicableMatch };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_blackBBBBBBBBBFBB(
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember,
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous,
						mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding = pattern_LinkDefinitionToAnonymous_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding != null) {
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous = (AnonymousClassDeclarationToTClass) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[0];
			MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[1];
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[2];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[3];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[4];
			TClass tAnonymous = (TClass) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[5];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[6];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[7];
			MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_binding[8];

			Object[] result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_black = pattern_LinkDefinitionToAnonymous_11_1_performtransformation_blackBBBBBBBBBFBB(
					mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition, tAnonymous,
					tSignature, mSignature, mDefinitionToTMember, _this, isApplicableMatch);
			if (result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_11_1_performtransformation_black[9];

				return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous,
						mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember, csp, _this,
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mAnonymousToTAnonymous, EObject mSignatureToTSignature,
			EObject tDefinition, EObject mAnonymous, EObject mDefinition, EObject tAnonymous, EObject tSignature,
			EObject mSignature, EObject mDefinitionToTMember) {
		if (!mAnonymousToTAnonymous.equals(mSignatureToTSignature)) {
			if (!mAnonymousToTAnonymous.equals(tDefinition)) {
				if (!mAnonymousToTAnonymous.equals(mDefinition)) {
					if (!mAnonymousToTAnonymous.equals(tAnonymous)) {
						if (!mAnonymousToTAnonymous.equals(tSignature)) {
							if (!mAnonymousToTAnonymous.equals(mSignature)) {
								if (!mAnonymousToTAnonymous.equals(mDefinitionToTMember)) {
									if (!mSignatureToTSignature.equals(tDefinition)) {
										if (!mSignatureToTSignature.equals(tAnonymous)) {
											if (!mSignatureToTSignature.equals(tSignature)) {
												if (!tDefinition.equals(tSignature)) {
													if (!mAnonymous.equals(mAnonymousToTAnonymous)) {
														if (!mAnonymous.equals(mSignatureToTSignature)) {
															if (!mAnonymous.equals(tDefinition)) {
																if (!mAnonymous.equals(mDefinition)) {
																	if (!mAnonymous.equals(tAnonymous)) {
																		if (!mAnonymous.equals(tSignature)) {
																			if (!mAnonymous.equals(mSignature)) {
																				if (!mAnonymous
																						.equals(mDefinitionToTMember)) {
																					if (!mDefinition.equals(
																							mSignatureToTSignature)) {
																						if (!mDefinition
																								.equals(tDefinition)) {
																							if (!mDefinition.equals(
																									tAnonymous)) {
																								if (!mDefinition.equals(
																										tSignature)) {
																									if (!mDefinition
																											.equals(mSignature)) {
																										if (!mDefinition
																												.equals(mDefinitionToTMember)) {
																											if (!tAnonymous
																													.equals(tDefinition)) {
																												if (!tAnonymous
																														.equals(tSignature)) {
																													if (!mSignature
																															.equals(mSignatureToTSignature)) {
																														if (!mSignature
																																.equals(tDefinition)) {
																															if (!mSignature
																																	.equals(tAnonymous)) {
																																if (!mSignature
																																		.equals(tSignature)) {
																																	if (!mDefinitionToTMember
																																			.equals(mSignatureToTSignature)) {
																																		if (!mDefinitionToTMember
																																				.equals(tDefinition)) {
																																			if (!mDefinitionToTMember
																																					.equals(tAnonymous)) {
																																				if (!mDefinitionToTMember
																																						.equals(tSignature)) {
																																					if (!mDefinitionToTMember
																																							.equals(mSignature)) {
																																						return new Object[] {
																																								ruleresult,
																																								mAnonymousToTAnonymous,
																																								mSignatureToTSignature,
																																								tDefinition,
																																								mAnonymous,
																																								mDefinition,
																																								tAnonymous,
																																								tSignature,
																																								mSignature,
																																								mDefinitionToTMember };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject tDefinition, EObject mAnonymous, EObject mDefinition,
			EObject tAnonymous, EObject tSignature) {
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
		return new Object[] { ruleresult, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature,
				mAnonymous__mDefinition____bodyDeclarations, mDefinition__mAnonymous____anonymousClassDeclarationOwner,
				tAnonymous__tDefinition____defines, tDefinition__tAnonymous____definedBy,
				tAnonymous__tSignature____signature };
	}

	public static final void pattern_LinkDefinitionToAnonymous_11_5_registerobjects_expressionBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, PerformRuleResult ruleresult, EObject mAnonymousToTAnonymous,
			EObject mSignatureToTSignature, EObject tDefinition, EObject mAnonymous, EObject mDefinition,
			EObject tAnonymous, EObject tSignature, EObject mSignature, EObject mDefinitionToTMember) {
		_this.registerObjects_BWD(ruleresult, mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous,
				mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember);

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
		EObject _localVariable_0 = match.getObject("tDefinition");
		EObject _localVariable_1 = match.getObject("tAnonymous");
		EObject _localVariable_2 = match.getObject("tSignature");
		EObject tmpTDefinition = _localVariable_0;
		EObject tmpTAnonymous = _localVariable_1;
		EObject tmpTSignature = _localVariable_2;
		if (tmpTDefinition instanceof TMember) {
			TMember tDefinition = (TMember) tmpTDefinition;
			if (tmpTAnonymous instanceof TClass) {
				TClass tAnonymous = (TClass) tmpTAnonymous;
				if (tmpTSignature instanceof TSignature) {
					TSignature tSignature = (TSignature) tmpTSignature;
					return new Object[] { tDefinition, tAnonymous, tSignature, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_12_2_corematch_blackFFBFFBBFFB(
			TMember tDefinition, TClass tAnonymous, TSignature tSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tSignature, MSignatureToTSignature.class, "target")) {
			MSignature mSignature = mSignatureToTSignature.getSource();
			if (mSignature != null) {
				for (AnonymousClassDeclarationToTClass mAnonymousToTAnonymous : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tAnonymous, AnonymousClassDeclarationToTClass.class, "target")) {
					AnonymousClassDeclaration mAnonymous = mAnonymousToTAnonymous.getSource();
					if (mAnonymous != null) {
						for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(tDefinition, MDefinitionToTMember.class, "target")) {
							BodyDeclaration tmpMDefinition = mDefinitionToTMember.getSource();
							if (tmpMDefinition instanceof MDefinition) {
								MDefinition mDefinition = (MDefinition) tmpMDefinition;
								_result.add(new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition,
										mAnonymous, mDefinition, tAnonymous, tSignature, mSignature,
										mDefinitionToTMember, match });
							}

						}
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_12_3_findcontext_blackBBBBBBBBB(
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tAnonymous.getDefines().contains(tDefinition)) {
			if (tSignature.equals(mSignatureToTSignature.getTarget())) {
				if (mSignature.equals(mSignatureToTSignature.getSource())) {
					if (mDefinition.equals(mDefinitionToTMember.getSource())) {
						if (mAnonymous.equals(mAnonymousToTAnonymous.getSource())) {
							if (tAnonymous.equals(mAnonymousToTAnonymous.getTarget())) {
								if (mSignature.getMDefinitions().contains(mDefinition)) {
									if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
										if (tAnonymous.getSignature().contains(tSignature)) {
											if (tSignature.getDefinitions().contains(tDefinition)) {
												_result.add(new Object[] { mAnonymousToTAnonymous,
														mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
														tAnonymous, tSignature, mSignature, mDefinitionToTMember });
											}
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFFF(
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tAnonymous__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tAnonymous____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__tSignature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignatureToTSignature__mSignature____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__mAnonymous____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymousToTAnonymous__tAnonymous____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mSignature__mDefinition____mDefinitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mSignature____mSignature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tAnonymous__tDefinition____defines_name_prime = "defines";
		String tDefinition__tAnonymous____definedBy_name_prime = "definedBy";
		String mSignatureToTSignature__tSignature____target_name_prime = "target";
		String mSignatureToTSignature__mSignature____source_name_prime = "source";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mAnonymousToTAnonymous__mAnonymous____source_name_prime = "source";
		String mAnonymousToTAnonymous__tAnonymous____target_name_prime = "target";
		String mSignature__mDefinition____mDefinitions_name_prime = "mDefinitions";
		String mDefinition__mSignature____mSignature_name_prime = "mSignature";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String tAnonymous__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tDefinition__tSignature____signature_name_prime = "signature";
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember);
		tAnonymous__tDefinition____defines.setSrc(tAnonymous);
		tAnonymous__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tDefinition____defines);
		tDefinition__tAnonymous____definedBy.setSrc(tDefinition);
		tDefinition__tAnonymous____definedBy.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tDefinition__tAnonymous____definedBy);
		mSignatureToTSignature__tSignature____target.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__tSignature____target.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__tSignature____target);
		mSignatureToTSignature__mSignature____source.setSrc(mSignatureToTSignature);
		mSignatureToTSignature__mSignature____source.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mSignatureToTSignature__mSignature____source);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__mDefinition____source);
		mAnonymousToTAnonymous__mAnonymous____source.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__mAnonymous____source.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__mAnonymous____source);
		mAnonymousToTAnonymous__tAnonymous____target.setSrc(mAnonymousToTAnonymous);
		mAnonymousToTAnonymous__tAnonymous____target.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mAnonymousToTAnonymous__tAnonymous____target);
		mSignature__mDefinition____mDefinitions.setSrc(mSignature);
		mSignature__mDefinition____mDefinitions.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mSignature__mDefinition____mDefinitions);
		mDefinition__mSignature____mSignature.setSrc(mDefinition);
		mDefinition__mSignature____mSignature.setTrg(mSignature);
		isApplicableMatch.getAllContextElements().add(mDefinition__mSignature____mSignature);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(mDefinitionToTMember__tDefinition____target);
		tAnonymous__tSignature____signature.setSrc(tAnonymous);
		tAnonymous__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		tAnonymous__tDefinition____defines.setName(tAnonymous__tDefinition____defines_name_prime);
		tDefinition__tAnonymous____definedBy.setName(tDefinition__tAnonymous____definedBy_name_prime);
		mSignatureToTSignature__tSignature____target.setName(mSignatureToTSignature__tSignature____target_name_prime);
		mSignatureToTSignature__mSignature____source.setName(mSignatureToTSignature__mSignature____source_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mAnonymousToTAnonymous__mAnonymous____source.setName(mAnonymousToTAnonymous__mAnonymous____source_name_prime);
		mAnonymousToTAnonymous__tAnonymous____target.setName(mAnonymousToTAnonymous__tAnonymous____target_name_prime);
		mSignature__mDefinition____mDefinitions.setName(mSignature__mDefinition____mDefinitions_name_prime);
		mDefinition__mSignature____mSignature.setName(mDefinition__mSignature____mSignature_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		tAnonymous__tSignature____signature.setName(tAnonymous__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
				tAnonymous, tSignature, mSignature, mDefinitionToTMember, isApplicableMatch,
				tAnonymous__tDefinition____defines, tDefinition__tAnonymous____definedBy,
				mSignatureToTSignature__tSignature____target, mSignatureToTSignature__mSignature____source,
				mDefinitionToTMember__mDefinition____source, mAnonymousToTAnonymous__mAnonymous____source,
				mAnonymousToTAnonymous__tAnonymous____target, mSignature__mDefinition____mDefinitions,
				mDefinition__mSignature____mSignature, mDefinitionToTMember__tDefinition____target,
				tAnonymous__tSignature____signature, tSignature__tDefinition____definitions,
				tDefinition__tSignature____signature };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingFBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mAnonymousToTAnonymous,
				mSignatureToTSignature, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature,
				mDefinitionToTMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature,
					tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {
		Object[] result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_binding = pattern_LinkDefinitionToAnonymous_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous,
				mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember);
		if (result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_black = pattern_LinkDefinitionToAnonymous_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature,
						tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature,
						mDefinitionToTMember };
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
							_result.add(new Object[] { tDefinition, tAnonymous, tSignature, _edge_defines });
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
			LinkDefinitionToAnonymous _this, Match match, TMember tDefinition, TClass tAnonymous,
			TSignature tSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tDefinition, tAnonymous, tSignature);
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

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMAnonymous = _edge_bodyDeclarations.getSrc();
		if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
			EObject tmpMDefinition = _edge_bodyDeclarations.getTrg();
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (mAnonymous.getBodyDeclarations().contains(mDefinition)) {
					MSignature mSignature = mDefinition.getMSignature();
					if (mSignature != null) {
						_result.add(new Object[] { mAnonymous, mDefinition, mSignature, _edge_bodyDeclarations });
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

	public static final boolean pattern_LinkDefinitionToAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			LinkDefinitionToAnonymous _this, Match match, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition,
			MSignature mSignature) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mAnonymous, mDefinition, mSignature);
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tDefinition");
		EObject _localVariable_1 = sourceMatch.getObject("mAnonymous");
		EObject _localVariable_2 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_3 = targetMatch.getObject("tAnonymous");
		EObject _localVariable_4 = targetMatch.getObject("tSignature");
		EObject _localVariable_5 = sourceMatch.getObject("mSignature");
		EObject tmpTDefinition = _localVariable_0;
		EObject tmpMAnonymous = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpTAnonymous = _localVariable_3;
		EObject tmpTSignature = _localVariable_4;
		EObject tmpMSignature = _localVariable_5;
		if (tmpTDefinition instanceof TMember) {
			TMember tDefinition = (TMember) tmpTDefinition;
			if (tmpMAnonymous instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) tmpMAnonymous;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpTAnonymous instanceof TClass) {
						TClass tAnonymous = (TClass) tmpTAnonymous;
						if (tmpTSignature instanceof TSignature) {
							TSignature tSignature = (TSignature) tmpTSignature;
							if (tmpMSignature instanceof MSignature) {
								MSignature mSignature = (MSignature) tmpMSignature;
								return new Object[] { tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature,
										mSignature, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_blackBBBBBBBB(
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding = pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding != null) {
			TMember tDefinition = (TMember) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[0];
			AnonymousClassDeclaration mAnonymous = (AnonymousClassDeclaration) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[2];
			TClass tAnonymous = (TClass) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[3];
			TSignature tSignature = (TSignature) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[4];
			MSignature mSignature = (MSignature) result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_black = pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, sourceMatch, targetMatch);
			if (result_pattern_LinkDefinitionToAnonymous_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingFBBBBBBBBB(
			LinkDefinitionToAnonymous _this, TMember tDefinition, AnonymousClassDeclaration mAnonymous,
			MDefinition mDefinition, TClass tAnonymous, TSignature tSignature, MSignature mSignature, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tDefinition, mAnonymous, mDefinition, tAnonymous,
				tSignature, mSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			LinkDefinitionToAnonymous _this, TMember tDefinition, AnonymousClassDeclaration mAnonymous,
			MDefinition mDefinition, TClass tAnonymous, TSignature tSignature, MSignature mSignature, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_binding = pattern_LinkDefinitionToAnonymous_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, sourceMatch,
				targetMatch);
		if (result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_black = pattern_LinkDefinitionToAnonymous_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature,
						mSignature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkDefinitionToAnonymous_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_24_5_matchcorrcontext_blackFFBBBBBBFBB(
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MSignatureToTSignature mSignatureToTSignature : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tSignature, MSignatureToTSignature.class, "target")) {
				if (mSignature.equals(mSignatureToTSignature.getSource())) {
					for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
						if (tDefinition.equals(mDefinitionToTMember.getTarget())) {
							for (AnonymousClassDeclarationToTClass mAnonymousToTAnonymous : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mAnonymous, AnonymousClassDeclarationToTClass.class,
											"source")) {
								if (tAnonymous.equals(mAnonymousToTAnonymous.getTarget())) {
									_result.add(new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature,
											tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature,
											mDefinitionToTMember, sourceMatch, targetMatch });
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
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			MDefinitionToTMember mDefinitionToTMember, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "LinkDefinitionToAnonymous";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mAnonymousToTAnonymous);
		ccMatch.getAllContextElements().add(mSignatureToTSignature);
		ccMatch.getAllContextElements().add(mDefinitionToTMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, mDefinitionToTMember, sourceMatch,
				targetMatch, ccMatch };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_24_6_createcorrespondence_blackBBBBBBB(
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, CCMatch ccMatch) {
		return new Object[] { tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, ccMatch };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_27_1_matchtggpattern_blackBBB(
			AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, MSignature mSignature) {
		if (mAnonymous.getBodyDeclarations().contains(mDefinition)) {
			if (mSignature.getMDefinitions().contains(mDefinition)) {
				return new Object[] { mAnonymous, mDefinition, mSignature };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_28_1_matchtggpattern_blackBBB(TMember tDefinition,
			TClass tAnonymous, TSignature tSignature) {
		if (tAnonymous.getDefines().contains(tDefinition)) {
			if (tAnonymous.getSignature().contains(tSignature)) {
				if (tSignature.getDefinitions().contains(tDefinition)) {
					return new Object[] { tDefinition, tAnonymous, tSignature };
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
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclarationToTClass mAnonymousToTAnonymous) {
		if (ruleResult.getCorrObjects().contains(mAnonymousToTAnonymous)) {
			return new Object[] { ruleResult, mAnonymousToTAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration mAnonymous) {
		if (ruleResult.getSourceObjects().contains(mAnonymous)) {
			return new Object[] { ruleResult, mAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TClass tAnonymous) {
		if (ruleResult.getTargetObjects().contains(tAnonymous)) {
			return new Object[] { ruleResult, tAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MSignatureToTSignature mSignatureToTSignature) {
		if (ruleResult.getCorrObjects().contains(mSignatureToTSignature)) {
			return new Object[] { ruleResult, mSignatureToTSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TSignature tSignature) {
		if (ruleResult.getTargetObjects().contains(tSignature)) {
			return new Object[] { ruleResult, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TMember tDefinition) {
		if (ruleResult.getTargetObjects().contains(tDefinition)) {
			return new Object[] { ruleResult, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mDefinitionToTMember) {
		if (ruleResult.getCorrObjects().contains(mDefinitionToTMember)) {
			return new Object[] { ruleResult, mDefinitionToTMember };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, MSignature mSignature) {
		if (ruleResult.getSourceObjects().contains(mSignature)) {
			return new Object[] { ruleResult, mSignature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_blackFFFFFFFFFFFBB(
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
									if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, mAnonymousToTAnonymous) == null) {
										if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, mAnonymous) == null) {
											if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tAnonymous) == null) {
												for (EObject tmpMSignatureToTSignature : mSignatureToTSignatureList
														.getEntryObjects()) {
													if (tmpMSignatureToTSignature instanceof MSignatureToTSignature) {
														MSignatureToTSignature mSignatureToTSignature = (MSignatureToTSignature) tmpMSignatureToTSignature;
														TSignature tSignature = mSignatureToTSignature.getTarget();
														if (tSignature != null) {
															MSignature mSignature = mSignatureToTSignature.getSource();
															if (mSignature != null) {
																if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult, mSignatureToTSignature) == null) {
																	if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, tSignature) == null) {
																		if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_8BB(
																				ruleResult, mSignature) == null) {
																			for (TMember tDefinition : tSignature
																					.getDefinitions()) {
																				if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_5BB(
																						ruleResult,
																						tDefinition) == null) {
																					for (MDefinition mDefinition : mSignature
																							.getMDefinitions()) {
																						if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_7BB(
																								ruleResult,
																								mDefinition) == null) {
																							for (MDefinitionToTMember mDefinitionToTMember : org.moflon.core.utilities.eMoflonEMFUtil
																									.getOppositeReferenceTyped(
																											tDefinition,
																											MDefinitionToTMember.class,
																											"target")) {
																								if (mDefinition.equals(
																										mDefinitionToTMember
																												.getSource())) {
																									if (pattern_LinkDefinitionToAnonymous_29_2_isapplicablecore_black_nac_6BB(
																											ruleResult,
																											mDefinitionToTMember) == null) {
																										_result.add(
																												new Object[] {
																														mAnonymousToTAnonymousList,
																														mAnonymousToTAnonymous,
																														mAnonymous,
																														tAnonymous,
																														mSignatureToTSignatureList,
																														mSignatureToTSignature,
																														tSignature,
																														tDefinition,
																														mDefinitionToTMember,
																														mDefinition,
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
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mAnonymousToTAnonymous,
				mSignatureToTSignature, tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature,
				mDefinitionToTMember, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature,
					tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			LinkDefinitionToAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_binding = pattern_LinkDefinitionToAnonymous_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous,
				mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember, ruleResult);
		if (result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_binding[0];

			Object[] result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_black = pattern_LinkDefinitionToAnonymous_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_LinkDefinitionToAnonymous_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAnonymousToTAnonymous, mSignatureToTSignature,
						tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, mSignature, mDefinitionToTMember,
						ruleResult };
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

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_5_checknacs_blackBBBBBBBBB(
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember) {
		return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
				tAnonymous, tSignature, mSignature, mDefinitionToTMember };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_6_perform_blackBBBBBBBBBB(
			AnonymousClassDeclarationToTClass mAnonymousToTAnonymous, MSignatureToTSignature mSignatureToTSignature,
			TMember tDefinition, AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous,
			TSignature tSignature, MSignature mSignature, MDefinitionToTMember mDefinitionToTMember,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mAnonymousToTAnonymous, mSignatureToTSignature, tDefinition, mAnonymous, mDefinition,
				tAnonymous, tSignature, mSignature, mDefinitionToTMember, ruleResult };
	}

	public static final Object[] pattern_LinkDefinitionToAnonymous_29_6_perform_greenBBBBBB(TMember tDefinition,
			AnonymousClassDeclaration mAnonymous, MDefinition mDefinition, TClass tAnonymous, TSignature tSignature,
			ModelgeneratorRuleResult ruleResult) {
		mAnonymous.getBodyDeclarations().add(mDefinition);
		tAnonymous.getDefines().add(tDefinition);
		tAnonymous.getSignature().add(tSignature);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tDefinition, mAnonymous, mDefinition, tAnonymous, tSignature, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LinkDefinitionToAnonymous_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LinkDefinitionToAnonymousImpl
