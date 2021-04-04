/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.LineComment;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.pm.LineCommentToTTextAnnotation;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.TextAnnotations;

import org.gravity.typegraph.basic.TMember;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TTextAnnotation;

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
 * An implementation of the model object '<em><b>Text Annotations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TextAnnotationsImpl extends AbstractRuleImpl implements TextAnnotations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextAnnotationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTextAnnotations();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MDefinition mMember, LineComment mComment) {

		Object[] result1_black = TextAnnotationsImpl.pattern_TextAnnotations_0_1_initialbindings_blackBBBB(this, match,
				mMember, mComment);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mMember] = " + mMember + ", " + "[mComment] = " + mComment + ".");
		}

		Object[] result2_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mMember, mComment);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mMember] = " + mMember + ", " + "[mComment] = " + mComment + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TextAnnotationsImpl.pattern_TextAnnotations_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TextAnnotationsImpl
					.pattern_TextAnnotations_0_4_collectelementstobetranslated_blackBBB(match, mMember, mComment);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mMember] = " + mMember + ", " + "[mComment] = " + mComment + ".");
			}
			TextAnnotationsImpl.pattern_TextAnnotations_0_4_collectelementstobetranslated_greenBBBF(match, mMember,
					mComment);
			//nothing EMoflonEdge mMember__mComment____comments = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TextAnnotationsImpl
					.pattern_TextAnnotations_0_5_collectcontextelements_blackBBB(match, mMember, mComment);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mMember] = " + mMember + ", " + "[mComment] = " + mComment + ".");
			}
			TextAnnotationsImpl.pattern_TextAnnotations_0_5_collectcontextelements_greenBB(match, mMember);

			// 
			TextAnnotationsImpl.pattern_TextAnnotations_0_6_registerobjectstomatch_expressionBBBB(this, match, mMember,
					mComment);
			return TextAnnotationsImpl.pattern_TextAnnotations_0_7_expressionF();
		} else {
			return TextAnnotationsImpl.pattern_TextAnnotations_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[1];
		LineComment mComment = (LineComment) result1_bindingAndBlack[2];
		TMember tMember = (TMember) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TextAnnotationsImpl
				.pattern_TextAnnotations_1_1_performtransformation_greenFFBBB(mComment, tMember, csp);
		TTextAnnotation tText = (TTextAnnotation) result1_green[0];
		LineCommentToTTextAnnotation mCommentToTText = (LineCommentToTTextAnnotation) result1_green[1];

		Object[] result2_black = TextAnnotationsImpl
				.pattern_TextAnnotations_1_2_collecttranslatedelements_blackBBB(tText, mCommentToTText, mComment);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tText] = " + tText + ", "
					+ "[mCommentToTText] = " + mCommentToTText + ", " + "[mComment] = " + mComment + ".");
		}
		Object[] result2_green = TextAnnotationsImpl
				.pattern_TextAnnotations_1_2_collecttranslatedelements_greenFBBB(tText, mCommentToTText, mComment);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TextAnnotationsImpl.pattern_TextAnnotations_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, tText, mMemberToTMember, mCommentToTText, mMember, mComment, tMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tText] = " + tText + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
					+ "[mCommentToTText] = " + mCommentToTText + ", " + "[mMember] = " + mMember + ", "
					+ "[mComment] = " + mComment + ", " + "[tMember] = " + tMember + ".");
		}
		TextAnnotationsImpl.pattern_TextAnnotations_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, tText,
				mCommentToTText, mMember, mComment, tMember);
		//nothing EMoflonEdge mCommentToTText__tText____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mMember__mComment____comments = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mCommentToTText__mComment____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tText__tMember____tAnnotated = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tMember__tText____tAnnotation = (EMoflonEdge) result3_green[10];

		// 
		// 
		TextAnnotationsImpl.pattern_TextAnnotations_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, tText,
				mMemberToTMember, mCommentToTText, mMember, mComment, tMember);
		return TextAnnotationsImpl.pattern_TextAnnotations_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TextAnnotationsImpl
				.pattern_TextAnnotations_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TextAnnotationsImpl.pattern_TextAnnotations_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MDefinition mMember = (MDefinition) result2_binding[0];
		LineComment mComment = (LineComment) result2_binding[1];
		for (Object[] result2_black : TextAnnotationsImpl.pattern_TextAnnotations_2_2_corematch_blackFBBFB(mMember,
				mComment, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[0];
			TMember tMember = (TMember) result2_black[3];
			// ForEach 
			for (Object[] result3_black : TextAnnotationsImpl
					.pattern_TextAnnotations_2_3_findcontext_blackBBBB(mMemberToTMember, mMember, mComment, tMember)) {
				Object[] result3_green = TextAnnotationsImpl.pattern_TextAnnotations_2_3_findcontext_greenBBBBFFFF(
						mMemberToTMember, mMember, mComment, tMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mMember__mComment____comments = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = TextAnnotationsImpl
						.pattern_TextAnnotations_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mMemberToTMember, mMember, mComment, tMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
							+ mMemberToTMember + ", " + "[mMember] = " + mMember + ", " + "[mComment] = " + mComment
							+ ", " + "[tMember] = " + tMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TextAnnotationsImpl.pattern_TextAnnotations_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TextAnnotationsImpl
							.pattern_TextAnnotations_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TextAnnotationsImpl.pattern_TextAnnotations_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TextAnnotationsImpl.pattern_TextAnnotations_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MDefinition mMember, LineComment mComment) {
		match.registerObject("mMember", mMember);
		match.registerObject("mComment", mComment);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MDefinition mMember, LineComment mComment) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MDefinition mMember, LineComment mComment, TMember tMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mComment_content = CSPFactoryHelper.eINSTANCE.createVariable("mComment.content", true, csp);
		var_mComment_content.setValue(mComment.getContent());
		var_mComment_content.setType("String");

		// Create unbound variables
		Variable var_tText_text = CSPFactoryHelper.eINSTANCE.createVariable("tText.text", csp);
		var_tText_text.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mComment_content, var_tText_text);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mComment", mComment);
		isApplicableMatch.registerObject("tMember", tMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tText, EObject mMemberToTMember,
			EObject mCommentToTText, EObject mMember, EObject mComment, EObject tMember) {
		ruleresult.registerObject("tText", tText);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("mCommentToTText", mCommentToTText);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mComment", mComment);
		ruleresult.registerObject("tMember", tMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mComment").eClass())
				.equals("java.LineComment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TTextAnnotation tText, TMember tMember) {

		Object[] result1_black = TextAnnotationsImpl.pattern_TextAnnotations_10_1_initialbindings_blackBBBB(this, match,
				tText, tMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tText] = " + tText + ", " + "[tMember] = " + tMember + ".");
		}

		Object[] result2_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tText, tMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tText] = " + tText + ", " + "[tMember] = " + tMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TextAnnotationsImpl.pattern_TextAnnotations_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TextAnnotationsImpl
					.pattern_TextAnnotations_10_4_collectelementstobetranslated_blackBBB(match, tText, tMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tText] = " + tText + ", " + "[tMember] = " + tMember + ".");
			}
			TextAnnotationsImpl.pattern_TextAnnotations_10_4_collectelementstobetranslated_greenBBBFF(match, tText,
					tMember);
			//nothing EMoflonEdge tText__tMember____tAnnotated = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tMember__tText____tAnnotation = (EMoflonEdge) result4_green[4];

			Object[] result5_black = TextAnnotationsImpl
					.pattern_TextAnnotations_10_5_collectcontextelements_blackBBB(match, tText, tMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tText] = " + tText + ", " + "[tMember] = " + tMember + ".");
			}
			TextAnnotationsImpl.pattern_TextAnnotations_10_5_collectcontextelements_greenBB(match, tMember);

			// 
			TextAnnotationsImpl.pattern_TextAnnotations_10_6_registerobjectstomatch_expressionBBBB(this, match, tText,
					tMember);
			return TextAnnotationsImpl.pattern_TextAnnotations_10_7_expressionF();
		} else {
			return TextAnnotationsImpl.pattern_TextAnnotations_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TTextAnnotation tText = (TTextAnnotation) result1_bindingAndBlack[0];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[1];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[2];
		TMember tMember = (TMember) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TextAnnotationsImpl
				.pattern_TextAnnotations_11_1_performtransformation_greenBFBFB(tText, mMember, csp);
		LineCommentToTTextAnnotation mCommentToTText = (LineCommentToTTextAnnotation) result1_green[1];
		LineComment mComment = (LineComment) result1_green[3];

		Object[] result2_black = TextAnnotationsImpl
				.pattern_TextAnnotations_11_2_collecttranslatedelements_blackBBB(tText, mCommentToTText, mComment);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tText] = " + tText + ", "
					+ "[mCommentToTText] = " + mCommentToTText + ", " + "[mComment] = " + mComment + ".");
		}
		Object[] result2_green = TextAnnotationsImpl
				.pattern_TextAnnotations_11_2_collecttranslatedelements_greenFBBB(tText, mCommentToTText, mComment);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TextAnnotationsImpl.pattern_TextAnnotations_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, tText, mMemberToTMember, mCommentToTText, mMember, mComment, tMember);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tText] = " + tText + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
					+ "[mCommentToTText] = " + mCommentToTText + ", " + "[mMember] = " + mMember + ", "
					+ "[mComment] = " + mComment + ", " + "[tMember] = " + tMember + ".");
		}
		TextAnnotationsImpl.pattern_TextAnnotations_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, tText,
				mCommentToTText, mMember, mComment, tMember);
		//nothing EMoflonEdge mCommentToTText__tText____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mMember__mComment____comments = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mCommentToTText__mComment____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tText__tMember____tAnnotated = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tMember__tText____tAnnotation = (EMoflonEdge) result3_green[10];

		// 
		// 
		TextAnnotationsImpl.pattern_TextAnnotations_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, tText,
				mMemberToTMember, mCommentToTText, mMember, mComment, tMember);
		return TextAnnotationsImpl.pattern_TextAnnotations_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TextAnnotationsImpl
				.pattern_TextAnnotations_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TextAnnotationsImpl.pattern_TextAnnotations_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TTextAnnotation tText = (TTextAnnotation) result2_binding[0];
		TMember tMember = (TMember) result2_binding[1];
		for (Object[] result2_black : TextAnnotationsImpl.pattern_TextAnnotations_12_2_corematch_blackBFFBB(tText,
				tMember, match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			MDefinition mMember = (MDefinition) result2_black[2];
			// ForEach 
			for (Object[] result3_black : TextAnnotationsImpl.pattern_TextAnnotations_12_3_findcontext_blackBBBB(tText,
					mMemberToTMember, mMember, tMember)) {
				Object[] result3_green = TextAnnotationsImpl.pattern_TextAnnotations_12_3_findcontext_greenBBBBFFFFF(
						tText, mMemberToTMember, mMember, tMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tText__tMember____tAnnotated = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tMember__tText____tAnnotation = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = TextAnnotationsImpl
						.pattern_TextAnnotations_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, tText,
								mMemberToTMember, mMember, tMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tText] = " + tText + ", "
							+ "[mMemberToTMember] = " + mMemberToTMember + ", " + "[mMember] = " + mMember + ", "
							+ "[tMember] = " + tMember + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TextAnnotationsImpl.pattern_TextAnnotations_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TextAnnotationsImpl
							.pattern_TextAnnotations_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TextAnnotationsImpl.pattern_TextAnnotations_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TextAnnotationsImpl.pattern_TextAnnotations_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TTextAnnotation tText, TMember tMember) {
		match.registerObject("tText", tText);
		match.registerObject("tMember", tMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TTextAnnotation tText, TMember tMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TTextAnnotation tText,
			MDefinitionToTMember mMemberToTMember, MDefinition mMember, TMember tMember) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tText_text = CSPFactoryHelper.eINSTANCE.createVariable("tText.text", true, csp);
		var_tText_text.setValue(tText.getText());
		var_tText_text.setType("String");

		// Create unbound variables
		Variable var_mComment_content = CSPFactoryHelper.eINSTANCE.createVariable("mComment.content", csp);
		var_mComment_content.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mComment_content, var_tText_text);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tText", tText);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("tMember", tMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tText, EObject mMemberToTMember,
			EObject mCommentToTText, EObject mMember, EObject mComment, EObject tMember) {
		ruleresult.registerObject("tText", tText);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("mCommentToTText", mCommentToTText);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mComment", mComment);
		ruleresult.registerObject("tMember", tMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tText").eClass())
				.equals("basic.annotations.TTextAnnotation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_44(EMoflonEdge _edge_tAnnotated) {

		Object[] result1_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TextAnnotationsImpl.pattern_TextAnnotations_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TextAnnotationsImpl
				.pattern_TextAnnotations_20_2_testcorematchandDECs_blackFFB(_edge_tAnnotated)) {
			TTextAnnotation tText = (TTextAnnotation) result2_black[0];
			TMember tMember = (TMember) result2_black[1];
			Object[] result2_green = TextAnnotationsImpl
					.pattern_TextAnnotations_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TextAnnotationsImpl
					.pattern_TextAnnotations_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							tText, tMember)) {
				// 
				if (TextAnnotationsImpl
						.pattern_TextAnnotations_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TextAnnotationsImpl
							.pattern_TextAnnotations_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TextAnnotationsImpl.pattern_TextAnnotations_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TextAnnotationsImpl.pattern_TextAnnotations_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_46(EMoflonEdge _edge_comments) {

		Object[] result1_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TextAnnotationsImpl.pattern_TextAnnotations_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TextAnnotationsImpl
				.pattern_TextAnnotations_21_2_testcorematchandDECs_blackFFB(_edge_comments)) {
			MDefinition mMember = (MDefinition) result2_black[0];
			LineComment mComment = (LineComment) result2_black[1];
			Object[] result2_green = TextAnnotationsImpl
					.pattern_TextAnnotations_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TextAnnotationsImpl
					.pattern_TextAnnotations_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							mMember, mComment)) {
				// 
				if (TextAnnotationsImpl
						.pattern_TextAnnotations_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TextAnnotationsImpl
							.pattern_TextAnnotations_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TextAnnotationsImpl.pattern_TextAnnotations_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TextAnnotationsImpl.pattern_TextAnnotations_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TextAnnotations");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("mComment", "prefixOfParent", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tText_text = CSPFactoryHelper.eINSTANCE.createVariable("tText", true, csp);
		var_tText_text.setValue(__helper.getValue("tText", "text"));
		var_tText_text.setType("String");

		Variable var_mComment_content = CSPFactoryHelper.eINSTANCE.createVariable("mComment", true, csp);
		var_mComment_content.setValue(__helper.getValue("mComment", "content"));
		var_mComment_content.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("TextAnnotations");
		eq0.solve(var_mComment_content, var_tText_text);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tText_text.setBound(false);
			eq0.solve(var_mComment_content, var_tText_text);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tText", "text", var_tText_text.getValue());
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
		ruleResult.setRule("TextAnnotations");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("mComment", "prefixOfParent", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tText_text = CSPFactoryHelper.eINSTANCE.createVariable("tText", true, csp);
		var_tText_text.setValue(__helper.getValue("tText", "text"));
		var_tText_text.setType("String");

		Variable var_mComment_content = CSPFactoryHelper.eINSTANCE.createVariable("mComment", true, csp);
		var_mComment_content.setValue(__helper.getValue("mComment", "content"));
		var_mComment_content.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("TextAnnotations");
		eq0.solve(var_mComment_content, var_tText_text);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mComment_content.setBound(false);
			eq0.solve(var_mComment_content, var_tText_text);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mComment", "content", var_mComment_content.getValue());
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

		Object[] result1_black = TextAnnotationsImpl.pattern_TextAnnotations_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TextAnnotationsImpl.pattern_TextAnnotations_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TTextAnnotation tText = (TTextAnnotation) result2_bindingAndBlack[0];
		MDefinition mMember = (MDefinition) result2_bindingAndBlack[1];
		LineComment mComment = (LineComment) result2_bindingAndBlack[2];
		TMember tMember = (TMember) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, tText, mMember, mComment, tMember,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tText] = " + tText + ", " + "[mMember] = " + mMember + ", " + "[mComment] = " + mComment + ", "
					+ "[tMember] = " + tMember + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TextAnnotationsImpl.pattern_TextAnnotations_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TextAnnotationsImpl.pattern_TextAnnotations_24_5_matchcorrcontext_blackFBBBB(
					mMember, tMember, sourceMatch, targetMatch)) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result5_black[0];
				Object[] result5_green = TextAnnotationsImpl.pattern_TextAnnotations_24_5_matchcorrcontext_greenBBBF(
						mMemberToTMember, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = TextAnnotationsImpl
						.pattern_TextAnnotations_24_6_createcorrespondence_blackBBBBB(tText, mMember, mComment, tMember,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tText] = " + tText + ", "
							+ "[mMember] = " + mMember + ", " + "[mComment] = " + mComment + ", " + "[tMember] = "
							+ tMember + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TextAnnotationsImpl.pattern_TextAnnotations_24_6_createcorrespondence_greenBFBB(tText, mComment,
						ccMatch);
				//nothing LineCommentToTTextAnnotation mCommentToTText = (LineCommentToTTextAnnotation) result6_green[1];

				Object[] result7_black = TextAnnotationsImpl
						.pattern_TextAnnotations_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TextAnnotationsImpl.pattern_TextAnnotations_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return TextAnnotationsImpl.pattern_TextAnnotations_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TTextAnnotation tText, MDefinition mMember, LineComment mComment,
			TMember tMember, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mComment_content = CSPFactoryHelper.eINSTANCE.createVariable("mComment.content", true, csp);
		var_mComment_content.setValue(mComment.getContent());
		var_mComment_content.setType("String");
		Variable var_tText_text = CSPFactoryHelper.eINSTANCE.createVariable("tText.text", true, csp);
		var_tText_text.setValue(tText.getText());
		var_tText_text.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mComment_content, var_tText_text);
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
	public boolean checkDEC_FWD(MDefinition mMember, LineComment mComment) {// 
		Object[] result1_black = TextAnnotationsImpl.pattern_TextAnnotations_27_1_matchtggpattern_blackBB(mMember,
				mComment);
		if (result1_black != null) {
			TextAnnotationsImpl.pattern_TextAnnotations_27_1_matchtggpattern_greenB(mComment);

			return TextAnnotationsImpl.pattern_TextAnnotations_27_2_expressionF();
		} else {
			return TextAnnotationsImpl.pattern_TextAnnotations_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TTextAnnotation tText, TMember tMember) {// 
		Object[] result1_black = TextAnnotationsImpl.pattern_TextAnnotations_28_1_matchtggpattern_blackBB(tText,
				tMember);
		if (result1_black != null) {
			return TextAnnotationsImpl.pattern_TextAnnotations_28_2_expressionF();
		} else {
			return TextAnnotationsImpl.pattern_TextAnnotations_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMemberToTMemberParameter) {

		Object[] result1_black = TextAnnotationsImpl.pattern_TextAnnotations_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TextAnnotationsImpl.pattern_TextAnnotations_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TextAnnotationsImpl
				.pattern_TextAnnotations_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			MDefinition mMember = (MDefinition) result2_black[2];
			TMember tMember = (TMember) result2_black[3];

			Object[] result3_bindingAndBlack = TextAnnotationsImpl
					.pattern_TextAnnotations_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							mMemberToTMember, mMember, tMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
						+ mMemberToTMember + ", " + "[mMember] = " + mMember + ", " + "[tMember] = " + tMember + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TextAnnotationsImpl.pattern_TextAnnotations_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TextAnnotationsImpl
						.pattern_TextAnnotations_29_5_checknacs_blackBBB(mMemberToTMember, mMember, tMember);
				if (result5_black != null) {

					Object[] result6_black = TextAnnotationsImpl.pattern_TextAnnotations_29_6_perform_blackBBBB(
							mMemberToTMember, mMember, tMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mMemberToTMember] = "
								+ mMemberToTMember + ", " + "[mMember] = " + mMember + ", " + "[tMember] = " + tMember
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					TextAnnotationsImpl.pattern_TextAnnotations_29_6_perform_greenFFBFBBB(mMember, tMember, ruleResult,
							csp);
					//nothing TTextAnnotation tText = (TTextAnnotation) result6_green[0];
					//nothing LineCommentToTTextAnnotation mCommentToTText = (LineCommentToTTextAnnotation) result6_green[1];
					//nothing LineComment mComment = (LineComment) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return TextAnnotationsImpl.pattern_TextAnnotations_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MDefinition mMember, TMember tMember, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mComment_content = CSPFactoryHelper.eINSTANCE.createVariable("mComment.content", csp);
		var_mComment_content.setType("String");
		Variable var_tText_text = CSPFactoryHelper.eINSTANCE.createVariable("tText.text", csp);
		var_tText_text.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mComment_content, var_tText_text);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("tMember", tMember);
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
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_FWD__MATCH_MDEFINITION_LINECOMMENT:
			return isAppropriate_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(LineComment) arguments.get(2));
		case RulesPackage.TEXT_ANNOTATIONS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MDEFINITION_LINECOMMENT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(LineComment) arguments.get(2));
			return null;
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MDEFINITION_LINECOMMENT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MDefinition) arguments.get(1),
					(LineComment) arguments.get(2));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_MDEFINITION_LINECOMMENT_TMEMBER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (MDefinition) arguments.get(2),
					(LineComment) arguments.get(3), (TMember) arguments.get(4));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_BWD__MATCH_TTEXTANNOTATION_TMEMBER:
			return isAppropriate_BWD((Match) arguments.get(0), (TTextAnnotation) arguments.get(1),
					(TMember) arguments.get(2));
		case RulesPackage.TEXT_ANNOTATIONS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TTEXTANNOTATION_TMEMBER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TTextAnnotation) arguments.get(1),
					(TMember) arguments.get(2));
			return null;
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TTEXTANNOTATION_TMEMBER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TTextAnnotation) arguments.get(1),
					(TMember) arguments.get(2));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TTEXTANNOTATION_MDEFINITIONTOTMEMBER_MDEFINITION_TMEMBER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TTextAnnotation) arguments.get(1),
					(MDefinitionToTMember) arguments.get(2), (MDefinition) arguments.get(3),
					(TMember) arguments.get(4));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_44__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_44((EMoflonEdge) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_46__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_46((EMoflonEdge) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_SOLVE_CSP_CC__TTEXTANNOTATION_MDEFINITION_LINECOMMENT_TMEMBER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TTextAnnotation) arguments.get(0), (MDefinition) arguments.get(1),
					(LineComment) arguments.get(2), (TMember) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_DEC_FWD__MDEFINITION_LINECOMMENT:
			return checkDEC_FWD((MDefinition) arguments.get(0), (LineComment) arguments.get(1));
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_DEC_BWD__TTEXTANNOTATION_TMEMBER:
			return checkDEC_BWD((TTextAnnotation) arguments.get(0), (TMember) arguments.get(1));
		case RulesPackage.TEXT_ANNOTATIONS___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.TEXT_ANNOTATIONS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_MDEFINITION_TMEMBER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MDefinitionToTMember) arguments.get(1), (MDefinition) arguments.get(2), (TMember) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.TEXT_ANNOTATIONS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TextAnnotations_0_1_initialbindings_blackBBBB(TextAnnotations _this,
			Match match, MDefinition mMember, LineComment mComment) {
		return new Object[] { _this, match, mMember, mComment };
	}

	public static final Object[] pattern_TextAnnotations_0_2_SolveCSP_bindingFBBBB(TextAnnotations _this, Match match,
			MDefinition mMember, LineComment mComment) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mMember, mComment);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mMember, mComment };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_0_2_SolveCSP_bindingAndBlackFBBBB(TextAnnotations _this,
			Match match, MDefinition mMember, LineComment mComment) {
		Object[] result_pattern_TextAnnotations_0_2_SolveCSP_binding = pattern_TextAnnotations_0_2_SolveCSP_bindingFBBBB(
				_this, match, mMember, mComment);
		if (result_pattern_TextAnnotations_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TextAnnotations_0_2_SolveCSP_black = pattern_TextAnnotations_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TextAnnotations_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mMember, mComment };
			}
		}
		return null;
	}

	public static final boolean pattern_TextAnnotations_0_3_CheckCSP_expressionFBB(TextAnnotations _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_0_4_collectelementstobetranslated_blackBBB(Match match,
			MDefinition mMember, LineComment mComment) {
		return new Object[] { match, mMember, mComment };
	}

	public static final Object[] pattern_TextAnnotations_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MDefinition mMember, LineComment mComment) {
		EMoflonEdge mMember__mComment____comments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mComment);
		String mMember__mComment____comments_name_prime = "comments";
		mMember__mComment____comments.setSrc(mMember);
		mMember__mComment____comments.setTrg(mComment);
		match.getToBeTranslatedEdges().add(mMember__mComment____comments);
		mMember__mComment____comments.setName(mMember__mComment____comments_name_prime);
		return new Object[] { match, mMember, mComment, mMember__mComment____comments };
	}

	public static final Object[] pattern_TextAnnotations_0_5_collectcontextelements_blackBBB(Match match,
			MDefinition mMember, LineComment mComment) {
		return new Object[] { match, mMember, mComment };
	}

	public static final Object[] pattern_TextAnnotations_0_5_collectcontextelements_greenBB(Match match,
			MDefinition mMember) {
		match.getContextNodes().add(mMember);
		return new Object[] { match, mMember };
	}

	public static final void pattern_TextAnnotations_0_6_registerobjectstomatch_expressionBBBB(TextAnnotations _this,
			Match match, MDefinition mMember, LineComment mComment) {
		_this.registerObjectsToMatch_FWD(match, mMember, mComment);

	}

	public static final boolean pattern_TextAnnotations_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TextAnnotations_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("mComment");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject tmpMMemberToTMember = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		EObject tmpMComment = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				if (tmpMComment instanceof LineComment) {
					LineComment mComment = (LineComment) tmpMComment;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						return new Object[] { mMemberToTMember, mMember, mComment, tMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_1_1_performtransformation_blackBBBBFBB(
			MDefinitionToTMember mMemberToTMember, MDefinition mMember, LineComment mComment, TMember tMember,
			TextAnnotations _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMemberToTMember, mMember, mComment, tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_1_1_performtransformation_bindingAndBlackFFFFFBB(
			TextAnnotations _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TextAnnotations_1_1_performtransformation_binding = pattern_TextAnnotations_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TextAnnotations_1_1_performtransformation_binding != null) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_TextAnnotations_1_1_performtransformation_binding[0];
			MDefinition mMember = (MDefinition) result_pattern_TextAnnotations_1_1_performtransformation_binding[1];
			LineComment mComment = (LineComment) result_pattern_TextAnnotations_1_1_performtransformation_binding[2];
			TMember tMember = (TMember) result_pattern_TextAnnotations_1_1_performtransformation_binding[3];

			Object[] result_pattern_TextAnnotations_1_1_performtransformation_black = pattern_TextAnnotations_1_1_performtransformation_blackBBBBFBB(
					mMemberToTMember, mMember, mComment, tMember, _this, isApplicableMatch);
			if (result_pattern_TextAnnotations_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TextAnnotations_1_1_performtransformation_black[4];

				return new Object[] { mMemberToTMember, mMember, mComment, tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_1_1_performtransformation_greenFFBBB(LineComment mComment,
			TMember tMember, CSP csp) {
		TTextAnnotation tText = AnnotationsFactory.eINSTANCE.createTTextAnnotation();
		LineCommentToTTextAnnotation mCommentToTText = PmFactory.eINSTANCE.createLineCommentToTTextAnnotation();
		Object _localVariable_0 = csp.getValue("tText", "text");
		tText.setTAnnotated(tMember);
		mCommentToTText.setTarget(tText);
		mCommentToTText.setSource(mComment);
		String tText_text_prime = (String) _localVariable_0;
		tText.setText(tText_text_prime);
		return new Object[] { tText, mCommentToTText, mComment, tMember, csp };
	}

	public static final Object[] pattern_TextAnnotations_1_2_collecttranslatedelements_blackBBB(TTextAnnotation tText,
			LineCommentToTTextAnnotation mCommentToTText, LineComment mComment) {
		return new Object[] { tText, mCommentToTText, mComment };
	}

	public static final Object[] pattern_TextAnnotations_1_2_collecttranslatedelements_greenFBBB(TTextAnnotation tText,
			LineCommentToTTextAnnotation mCommentToTText, LineComment mComment) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tText);
		ruleresult.getCreatedLinkElements().add(mCommentToTText);
		ruleresult.getTranslatedElements().add(mComment);
		return new Object[] { ruleresult, tText, mCommentToTText, mComment };
	}

	public static final Object[] pattern_TextAnnotations_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject tText, EObject mMemberToTMember, EObject mCommentToTText,
			EObject mMember, EObject mComment, EObject tMember) {
		if (!mMemberToTMember.equals(tText)) {
			if (!mMemberToTMember.equals(tMember)) {
				if (!mCommentToTText.equals(tText)) {
					if (!mCommentToTText.equals(mMemberToTMember)) {
						if (!mCommentToTText.equals(mMember)) {
							if (!mCommentToTText.equals(tMember)) {
								if (!mMember.equals(tText)) {
									if (!mMember.equals(mMemberToTMember)) {
										if (!mMember.equals(tMember)) {
											if (!mComment.equals(tText)) {
												if (!mComment.equals(mMemberToTMember)) {
													if (!mComment.equals(mCommentToTText)) {
														if (!mComment.equals(mMember)) {
															if (!mComment.equals(tMember)) {
																if (!tMember.equals(tText)) {
																	return new Object[] { ruleresult, tText,
																			mMemberToTMember, mCommentToTText, mMember,
																			mComment, tMember };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TextAnnotations_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tText, EObject mCommentToTText, EObject mMember, EObject mComment,
			EObject tMember) {
		EMoflonEdge mCommentToTText__tText____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mComment____comments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCommentToTText__mComment____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tText__tMember____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tText____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TextAnnotations";
		String mCommentToTText__tText____target_name_prime = "target";
		String mMember__mComment____comments_name_prime = "comments";
		String mCommentToTText__mComment____source_name_prime = "source";
		String tText__tMember____tAnnotated_name_prime = "tAnnotated";
		String tMember__tText____tAnnotation_name_prime = "tAnnotation";
		mCommentToTText__tText____target.setSrc(mCommentToTText);
		mCommentToTText__tText____target.setTrg(tText);
		ruleresult.getCreatedEdges().add(mCommentToTText__tText____target);
		mMember__mComment____comments.setSrc(mMember);
		mMember__mComment____comments.setTrg(mComment);
		ruleresult.getTranslatedEdges().add(mMember__mComment____comments);
		mCommentToTText__mComment____source.setSrc(mCommentToTText);
		mCommentToTText__mComment____source.setTrg(mComment);
		ruleresult.getCreatedEdges().add(mCommentToTText__mComment____source);
		tText__tMember____tAnnotated.setSrc(tText);
		tText__tMember____tAnnotated.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tText__tMember____tAnnotated);
		tMember__tText____tAnnotation.setSrc(tMember);
		tMember__tText____tAnnotation.setTrg(tText);
		ruleresult.getCreatedEdges().add(tMember__tText____tAnnotation);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mCommentToTText__tText____target.setName(mCommentToTText__tText____target_name_prime);
		mMember__mComment____comments.setName(mMember__mComment____comments_name_prime);
		mCommentToTText__mComment____source.setName(mCommentToTText__mComment____source_name_prime);
		tText__tMember____tAnnotated.setName(tText__tMember____tAnnotated_name_prime);
		tMember__tText____tAnnotation.setName(tMember__tText____tAnnotation_name_prime);
		return new Object[] { ruleresult, tText, mCommentToTText, mMember, mComment, tMember,
				mCommentToTText__tText____target, mMember__mComment____comments, mCommentToTText__mComment____source,
				tText__tMember____tAnnotated, tMember__tText____tAnnotation };
	}

	public static final void pattern_TextAnnotations_1_5_registerobjects_expressionBBBBBBBB(TextAnnotations _this,
			PerformRuleResult ruleresult, EObject tText, EObject mMemberToTMember, EObject mCommentToTText,
			EObject mMember, EObject mComment, EObject tMember) {
		_this.registerObjects_FWD(ruleresult, tText, mMemberToTMember, mCommentToTText, mMember, mComment, tMember);

	}

	public static final PerformRuleResult pattern_TextAnnotations_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_2_1_preparereturnvalue_bindingFB(TextAnnotations _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TextAnnotations _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_2_1_preparereturnvalue_bindingAndBlackFFB(
			TextAnnotations _this) {
		Object[] result_pattern_TextAnnotations_2_1_preparereturnvalue_binding = pattern_TextAnnotations_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TextAnnotations_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TextAnnotations_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TextAnnotations_2_1_preparereturnvalue_black = pattern_TextAnnotations_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TextAnnotations_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TextAnnotations_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TextAnnotations";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TextAnnotations_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mMember");
		EObject _localVariable_1 = match.getObject("mComment");
		EObject tmpMMember = _localVariable_0;
		EObject tmpMComment = _localVariable_1;
		if (tmpMMember instanceof MDefinition) {
			MDefinition mMember = (MDefinition) tmpMMember;
			if (tmpMComment instanceof LineComment) {
				LineComment mComment = (LineComment) tmpMComment;
				return new Object[] { mMember, mComment, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_2_2_corematch_blackFBBFB(MDefinition mMember,
			LineComment mComment, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean mComment_prefixOfParent = mComment.isPrefixOfParent();
		if (Boolean.valueOf(mComment_prefixOfParent).equals(Boolean.valueOf(true))) {
			for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
				TMember tMember = mMemberToTMember.getTarget();
				if (tMember != null) {
					_result.add(new Object[] { mMemberToTMember, mMember, mComment, tMember, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_2_3_findcontext_blackBBBB(
			MDefinitionToTMember mMemberToTMember, MDefinition mMember, LineComment mComment, TMember tMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMember.equals(mMemberToTMember.getSource())) {
			if (mMember.getComments().contains(mComment)) {
				if (tMember.equals(mMemberToTMember.getTarget())) {
					boolean mComment_prefixOfParent = mComment.isPrefixOfParent();
					if (Boolean.valueOf(mComment_prefixOfParent).equals(Boolean.valueOf(true))) {
						_result.add(new Object[] { mMemberToTMember, mMember, mComment, tMember });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_2_3_findcontext_greenBBBBFFFF(
			MDefinitionToTMember mMemberToTMember, MDefinition mMember, LineComment mComment, TMember tMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mComment____comments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMember__mComment____comments_name_prime = "comments";
		String mMemberToTMember__tMember____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mComment);
		isApplicableMatch.getAllContextElements().add(tMember);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMember__mComment____comments.setSrc(mMember);
		mMember__mComment____comments.setTrg(mComment);
		isApplicableMatch.getAllContextElements().add(mMember__mComment____comments);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMember__mComment____comments.setName(mMember__mComment____comments_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		return new Object[] { mMemberToTMember, mMember, mComment, tMember, isApplicableMatch,
				mMemberToTMember__mMember____source, mMember__mComment____comments,
				mMemberToTMember__tMember____target };
	}

	public static final Object[] pattern_TextAnnotations_2_4_solveCSP_bindingFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember, MDefinition mMember,
			LineComment mComment, TMember tMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mMemberToTMember, mMember, mComment,
				tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, mMember, mComment, tMember };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_2_4_solveCSP_bindingAndBlackFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember, MDefinition mMember,
			LineComment mComment, TMember tMember) {
		Object[] result_pattern_TextAnnotations_2_4_solveCSP_binding = pattern_TextAnnotations_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, mMember, mComment, tMember);
		if (result_pattern_TextAnnotations_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_2_4_solveCSP_binding[0];

			Object[] result_pattern_TextAnnotations_2_4_solveCSP_black = pattern_TextAnnotations_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TextAnnotations_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, mMember, mComment, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_TextAnnotations_2_5_checkCSP_expressionFBB(TextAnnotations _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TextAnnotations_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TextAnnotations";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TextAnnotations_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_10_1_initialbindings_blackBBBB(TextAnnotations _this,
			Match match, TTextAnnotation tText, TMember tMember) {
		return new Object[] { _this, match, tText, tMember };
	}

	public static final Object[] pattern_TextAnnotations_10_2_SolveCSP_bindingFBBBB(TextAnnotations _this, Match match,
			TTextAnnotation tText, TMember tMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tText, tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tText, tMember };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_10_2_SolveCSP_bindingAndBlackFBBBB(TextAnnotations _this,
			Match match, TTextAnnotation tText, TMember tMember) {
		Object[] result_pattern_TextAnnotations_10_2_SolveCSP_binding = pattern_TextAnnotations_10_2_SolveCSP_bindingFBBBB(
				_this, match, tText, tMember);
		if (result_pattern_TextAnnotations_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TextAnnotations_10_2_SolveCSP_black = pattern_TextAnnotations_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TextAnnotations_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tText, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_TextAnnotations_10_3_CheckCSP_expressionFBB(TextAnnotations _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_10_4_collectelementstobetranslated_blackBBB(Match match,
			TTextAnnotation tText, TMember tMember) {
		return new Object[] { match, tText, tMember };
	}

	public static final Object[] pattern_TextAnnotations_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TTextAnnotation tText, TMember tMember) {
		EMoflonEdge tText__tMember____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tText____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tText);
		String tText__tMember____tAnnotated_name_prime = "tAnnotated";
		String tMember__tText____tAnnotation_name_prime = "tAnnotation";
		tText__tMember____tAnnotated.setSrc(tText);
		tText__tMember____tAnnotated.setTrg(tMember);
		match.getToBeTranslatedEdges().add(tText__tMember____tAnnotated);
		tMember__tText____tAnnotation.setSrc(tMember);
		tMember__tText____tAnnotation.setTrg(tText);
		match.getToBeTranslatedEdges().add(tMember__tText____tAnnotation);
		tText__tMember____tAnnotated.setName(tText__tMember____tAnnotated_name_prime);
		tMember__tText____tAnnotation.setName(tMember__tText____tAnnotation_name_prime);
		return new Object[] { match, tText, tMember, tText__tMember____tAnnotated, tMember__tText____tAnnotation };
	}

	public static final Object[] pattern_TextAnnotations_10_5_collectcontextelements_blackBBB(Match match,
			TTextAnnotation tText, TMember tMember) {
		return new Object[] { match, tText, tMember };
	}

	public static final Object[] pattern_TextAnnotations_10_5_collectcontextelements_greenBB(Match match,
			TMember tMember) {
		match.getContextNodes().add(tMember);
		return new Object[] { match, tMember };
	}

	public static final void pattern_TextAnnotations_10_6_registerobjectstomatch_expressionBBBB(TextAnnotations _this,
			Match match, TTextAnnotation tText, TMember tMember) {
		_this.registerObjectsToMatch_BWD(match, tText, tMember);

	}

	public static final boolean pattern_TextAnnotations_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TextAnnotations_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tText");
		EObject _localVariable_1 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("tMember");
		EObject tmpTText = _localVariable_0;
		EObject tmpMMemberToTMember = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		if (tmpTText instanceof TTextAnnotation) {
			TTextAnnotation tText = (TTextAnnotation) tmpTText;
			if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
				if (tmpMMember instanceof MDefinition) {
					MDefinition mMember = (MDefinition) tmpMMember;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						return new Object[] { tText, mMemberToTMember, mMember, tMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_11_1_performtransformation_blackBBBBFBB(TTextAnnotation tText,
			MDefinitionToTMember mMemberToTMember, MDefinition mMember, TMember tMember, TextAnnotations _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tText, mMemberToTMember, mMember, tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_11_1_performtransformation_bindingAndBlackFFFFFBB(
			TextAnnotations _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TextAnnotations_11_1_performtransformation_binding = pattern_TextAnnotations_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TextAnnotations_11_1_performtransformation_binding != null) {
			TTextAnnotation tText = (TTextAnnotation) result_pattern_TextAnnotations_11_1_performtransformation_binding[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_TextAnnotations_11_1_performtransformation_binding[1];
			MDefinition mMember = (MDefinition) result_pattern_TextAnnotations_11_1_performtransformation_binding[2];
			TMember tMember = (TMember) result_pattern_TextAnnotations_11_1_performtransformation_binding[3];

			Object[] result_pattern_TextAnnotations_11_1_performtransformation_black = pattern_TextAnnotations_11_1_performtransformation_blackBBBBFBB(
					tText, mMemberToTMember, mMember, tMember, _this, isApplicableMatch);
			if (result_pattern_TextAnnotations_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TextAnnotations_11_1_performtransformation_black[4];

				return new Object[] { tText, mMemberToTMember, mMember, tMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_11_1_performtransformation_greenBFBFB(TTextAnnotation tText,
			MDefinition mMember, CSP csp) {
		LineCommentToTTextAnnotation mCommentToTText = PmFactory.eINSTANCE.createLineCommentToTTextAnnotation();
		LineComment mComment = JavaFactory.eINSTANCE.createLineComment();
		boolean mComment_prefixOfParent_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("mComment", "content");
		mCommentToTText.setTarget(tText);
		mMember.getComments().add(mComment);
		mCommentToTText.setSource(mComment);
		mComment.setPrefixOfParent(Boolean.valueOf(mComment_prefixOfParent_prime));
		String mComment_content_prime = (String) _localVariable_0;
		mComment.setContent(mComment_content_prime);
		return new Object[] { tText, mCommentToTText, mMember, mComment, csp };
	}

	public static final Object[] pattern_TextAnnotations_11_2_collecttranslatedelements_blackBBB(TTextAnnotation tText,
			LineCommentToTTextAnnotation mCommentToTText, LineComment mComment) {
		return new Object[] { tText, mCommentToTText, mComment };
	}

	public static final Object[] pattern_TextAnnotations_11_2_collecttranslatedelements_greenFBBB(TTextAnnotation tText,
			LineCommentToTTextAnnotation mCommentToTText, LineComment mComment) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tText);
		ruleresult.getCreatedLinkElements().add(mCommentToTText);
		ruleresult.getCreatedElements().add(mComment);
		return new Object[] { ruleresult, tText, mCommentToTText, mComment };
	}

	public static final Object[] pattern_TextAnnotations_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject tText, EObject mMemberToTMember, EObject mCommentToTText,
			EObject mMember, EObject mComment, EObject tMember) {
		if (!mMemberToTMember.equals(tText)) {
			if (!mMemberToTMember.equals(tMember)) {
				if (!mCommentToTText.equals(tText)) {
					if (!mCommentToTText.equals(mMemberToTMember)) {
						if (!mCommentToTText.equals(mMember)) {
							if (!mCommentToTText.equals(tMember)) {
								if (!mMember.equals(tText)) {
									if (!mMember.equals(mMemberToTMember)) {
										if (!mMember.equals(tMember)) {
											if (!mComment.equals(tText)) {
												if (!mComment.equals(mMemberToTMember)) {
													if (!mComment.equals(mCommentToTText)) {
														if (!mComment.equals(mMember)) {
															if (!mComment.equals(tMember)) {
																if (!tMember.equals(tText)) {
																	return new Object[] { ruleresult, tText,
																			mMemberToTMember, mCommentToTText, mMember,
																			mComment, tMember };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TextAnnotations_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tText, EObject mCommentToTText, EObject mMember, EObject mComment,
			EObject tMember) {
		EMoflonEdge mCommentToTText__tText____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mComment____comments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCommentToTText__mComment____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tText__tMember____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tText____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TextAnnotations";
		String mCommentToTText__tText____target_name_prime = "target";
		String mMember__mComment____comments_name_prime = "comments";
		String mCommentToTText__mComment____source_name_prime = "source";
		String tText__tMember____tAnnotated_name_prime = "tAnnotated";
		String tMember__tText____tAnnotation_name_prime = "tAnnotation";
		mCommentToTText__tText____target.setSrc(mCommentToTText);
		mCommentToTText__tText____target.setTrg(tText);
		ruleresult.getCreatedEdges().add(mCommentToTText__tText____target);
		mMember__mComment____comments.setSrc(mMember);
		mMember__mComment____comments.setTrg(mComment);
		ruleresult.getCreatedEdges().add(mMember__mComment____comments);
		mCommentToTText__mComment____source.setSrc(mCommentToTText);
		mCommentToTText__mComment____source.setTrg(mComment);
		ruleresult.getCreatedEdges().add(mCommentToTText__mComment____source);
		tText__tMember____tAnnotated.setSrc(tText);
		tText__tMember____tAnnotated.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tText__tMember____tAnnotated);
		tMember__tText____tAnnotation.setSrc(tMember);
		tMember__tText____tAnnotation.setTrg(tText);
		ruleresult.getTranslatedEdges().add(tMember__tText____tAnnotation);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mCommentToTText__tText____target.setName(mCommentToTText__tText____target_name_prime);
		mMember__mComment____comments.setName(mMember__mComment____comments_name_prime);
		mCommentToTText__mComment____source.setName(mCommentToTText__mComment____source_name_prime);
		tText__tMember____tAnnotated.setName(tText__tMember____tAnnotated_name_prime);
		tMember__tText____tAnnotation.setName(tMember__tText____tAnnotation_name_prime);
		return new Object[] { ruleresult, tText, mCommentToTText, mMember, mComment, tMember,
				mCommentToTText__tText____target, mMember__mComment____comments, mCommentToTText__mComment____source,
				tText__tMember____tAnnotated, tMember__tText____tAnnotation };
	}

	public static final void pattern_TextAnnotations_11_5_registerobjects_expressionBBBBBBBB(TextAnnotations _this,
			PerformRuleResult ruleresult, EObject tText, EObject mMemberToTMember, EObject mCommentToTText,
			EObject mMember, EObject mComment, EObject tMember) {
		_this.registerObjects_BWD(ruleresult, tText, mMemberToTMember, mCommentToTText, mMember, mComment, tMember);

	}

	public static final PerformRuleResult pattern_TextAnnotations_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_12_1_preparereturnvalue_bindingFB(TextAnnotations _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TextAnnotations _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_12_1_preparereturnvalue_bindingAndBlackFFB(
			TextAnnotations _this) {
		Object[] result_pattern_TextAnnotations_12_1_preparereturnvalue_binding = pattern_TextAnnotations_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TextAnnotations_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TextAnnotations_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TextAnnotations_12_1_preparereturnvalue_black = pattern_TextAnnotations_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TextAnnotations_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TextAnnotations_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TextAnnotations";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TextAnnotations_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tText");
		EObject _localVariable_1 = match.getObject("tMember");
		EObject tmpTText = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		if (tmpTText instanceof TTextAnnotation) {
			TTextAnnotation tText = (TTextAnnotation) tmpTText;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				return new Object[] { tText, tMember, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_12_2_corematch_blackBFFBB(TTextAnnotation tText,
			TMember tMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
			BodyDeclaration tmpMMember = mMemberToTMember.getSource();
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				_result.add(new Object[] { tText, mMemberToTMember, mMember, tMember, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_12_3_findcontext_blackBBBB(TTextAnnotation tText,
			MDefinitionToTMember mMemberToTMember, MDefinition mMember, TMember tMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMember.equals(mMemberToTMember.getSource())) {
			if (tMember.equals(mMemberToTMember.getTarget())) {
				if (tMember.equals(tText.getTAnnotated())) {
					_result.add(new Object[] { tText, mMemberToTMember, mMember, tMember });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_12_3_findcontext_greenBBBBFFFFF(TTextAnnotation tText,
			MDefinitionToTMember mMemberToTMember, MDefinition mMember, TMember tMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tText__tMember____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tText____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String tText__tMember____tAnnotated_name_prime = "tAnnotated";
		String tMember__tText____tAnnotation_name_prime = "tAnnotation";
		isApplicableMatch.getAllContextElements().add(tText);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(tMember);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		tText__tMember____tAnnotated.setSrc(tText);
		tText__tMember____tAnnotated.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tText__tMember____tAnnotated);
		tMember__tText____tAnnotation.setSrc(tMember);
		tMember__tText____tAnnotation.setTrg(tText);
		isApplicableMatch.getAllContextElements().add(tMember__tText____tAnnotation);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		tText__tMember____tAnnotated.setName(tText__tMember____tAnnotated_name_prime);
		tMember__tText____tAnnotation.setName(tMember__tText____tAnnotation_name_prime);
		return new Object[] { tText, mMemberToTMember, mMember, tMember, isApplicableMatch,
				mMemberToTMember__mMember____source, mMemberToTMember__tMember____target, tText__tMember____tAnnotated,
				tMember__tText____tAnnotation };
	}

	public static final Object[] pattern_TextAnnotations_12_4_solveCSP_bindingFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, TTextAnnotation tText, MDefinitionToTMember mMemberToTMember,
			MDefinition mMember, TMember tMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tText, mMemberToTMember, mMember,
				tMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tText, mMemberToTMember, mMember, tMember };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_12_4_solveCSP_bindingAndBlackFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, TTextAnnotation tText, MDefinitionToTMember mMemberToTMember,
			MDefinition mMember, TMember tMember) {
		Object[] result_pattern_TextAnnotations_12_4_solveCSP_binding = pattern_TextAnnotations_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, tText, mMemberToTMember, mMember, tMember);
		if (result_pattern_TextAnnotations_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_12_4_solveCSP_binding[0];

			Object[] result_pattern_TextAnnotations_12_4_solveCSP_black = pattern_TextAnnotations_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TextAnnotations_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tText, mMemberToTMember, mMember, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_TextAnnotations_12_5_checkCSP_expressionFBB(TextAnnotations _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TextAnnotations_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TextAnnotations";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TextAnnotations_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_20_1_preparereturnvalue_bindingFB(TextAnnotations _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TextAnnotations _this) {
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

	public static final Object[] pattern_TextAnnotations_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TextAnnotations _this) {
		Object[] result_pattern_TextAnnotations_20_1_preparereturnvalue_binding = pattern_TextAnnotations_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TextAnnotations_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TextAnnotations_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TextAnnotations_20_1_preparereturnvalue_black = pattern_TextAnnotations_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TextAnnotations_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TextAnnotations_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TextAnnotations_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TextAnnotations_20_2_testcorematchandDECs_black_nac_0BB(TTextAnnotation tText,
			TMember tMember) {
		TAnnotatable __DEC_tText_tAnnotation_904733 = tText.getTAnnotated();
		if (__DEC_tText_tAnnotation_904733 != null) {
			if (!tMember.equals(__DEC_tText_tAnnotation_904733)) {
				return new Object[] { tText, tMember };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_tAnnotated) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTText = _edge_tAnnotated.getSrc();
		if (tmpTText instanceof TTextAnnotation) {
			TTextAnnotation tText = (TTextAnnotation) tmpTText;
			EObject tmpTMember = _edge_tAnnotated.getTrg();
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tMember.equals(tText.getTAnnotated())) {
					if (pattern_TextAnnotations_20_2_testcorematchandDECs_black_nac_0BB(tText, tMember) == null) {
						_result.add(new Object[] { tText, tMember, _edge_tAnnotated });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TextAnnotations_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TextAnnotations_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TextAnnotations _this, Match match, TTextAnnotation tText, TMember tMember) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tText, tMember);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TextAnnotations_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TextAnnotations _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TextAnnotations_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_21_1_preparereturnvalue_bindingFB(TextAnnotations _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TextAnnotations _this) {
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

	public static final Object[] pattern_TextAnnotations_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TextAnnotations _this) {
		Object[] result_pattern_TextAnnotations_21_1_preparereturnvalue_binding = pattern_TextAnnotations_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TextAnnotations_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TextAnnotations_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TextAnnotations_21_1_preparereturnvalue_black = pattern_TextAnnotations_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TextAnnotations_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TextAnnotations_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TextAnnotations_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_comments) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMember = _edge_comments.getSrc();
		if (tmpMMember instanceof MDefinition) {
			MDefinition mMember = (MDefinition) tmpMMember;
			EObject tmpMComment = _edge_comments.getTrg();
			if (tmpMComment instanceof LineComment) {
				LineComment mComment = (LineComment) tmpMComment;
				if (mMember.getComments().contains(mComment)) {
					boolean mComment_prefixOfParent = mComment.isPrefixOfParent();
					if (Boolean.valueOf(mComment_prefixOfParent).equals(Boolean.valueOf(true))) {
						_result.add(new Object[] { mMember, mComment, _edge_comments });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TextAnnotations_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TextAnnotations_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TextAnnotations _this, Match match, MDefinition mMember, LineComment mComment) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mMember, mComment);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TextAnnotations_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TextAnnotations _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TextAnnotations_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_24_1_prepare_blackB(TextAnnotations _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TextAnnotations_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TextAnnotations_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tText");
		EObject _localVariable_1 = sourceMatch.getObject("mMember");
		EObject _localVariable_2 = sourceMatch.getObject("mComment");
		EObject _localVariable_3 = targetMatch.getObject("tMember");
		EObject tmpTText = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		EObject tmpMComment = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		if (tmpTText instanceof TTextAnnotation) {
			TTextAnnotation tText = (TTextAnnotation) tmpTText;
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				if (tmpMComment instanceof LineComment) {
					LineComment mComment = (LineComment) tmpMComment;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						return new Object[] { tText, mMember, mComment, tMember, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_24_2_matchsrctrgcontext_blackBBBBBB(TTextAnnotation tText,
			MDefinition mMember, LineComment mComment, TMember tMember, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			boolean mComment_prefixOfParent = mComment.isPrefixOfParent();
			if (Boolean.valueOf(mComment_prefixOfParent).equals(Boolean.valueOf(true))) {
				return new Object[] { tText, mMember, mComment, tMember, sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding = pattern_TextAnnotations_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding != null) {
			TTextAnnotation tText = (TTextAnnotation) result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding[0];
			MDefinition mMember = (MDefinition) result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding[1];
			LineComment mComment = (LineComment) result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding[2];
			TMember tMember = (TMember) result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_TextAnnotations_24_2_matchsrctrgcontext_black = pattern_TextAnnotations_24_2_matchsrctrgcontext_blackBBBBBB(
					tText, mMember, mComment, tMember, sourceMatch, targetMatch);
			if (result_pattern_TextAnnotations_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tText, mMember, mComment, tMember, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_24_3_solvecsp_bindingFBBBBBBB(TextAnnotations _this,
			TTextAnnotation tText, MDefinition mMember, LineComment mComment, TMember tMember, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(tText, mMember, mComment, tMember, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, tText, mMember, mComment, tMember, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_24_3_solvecsp_bindingAndBlackFBBBBBBB(TextAnnotations _this,
			TTextAnnotation tText, MDefinition mMember, LineComment mComment, TMember tMember, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_TextAnnotations_24_3_solvecsp_binding = pattern_TextAnnotations_24_3_solvecsp_bindingFBBBBBBB(
				_this, tText, mMember, mComment, tMember, sourceMatch, targetMatch);
		if (result_pattern_TextAnnotations_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_24_3_solvecsp_binding[0];

			Object[] result_pattern_TextAnnotations_24_3_solvecsp_black = pattern_TextAnnotations_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TextAnnotations_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tText, mMember, mComment, tMember, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TextAnnotations_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_24_5_matchcorrcontext_blackFBBBB(MDefinition mMember,
			TMember tMember, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
				if (tMember.equals(mMemberToTMember.getTarget())) {
					_result.add(new Object[] { mMemberToTMember, mMember, tMember, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_24_5_matchcorrcontext_greenBBBF(
			MDefinitionToTMember mMemberToTMember, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TextAnnotations";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mMemberToTMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mMemberToTMember, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TextAnnotations_24_6_createcorrespondence_blackBBBBB(TTextAnnotation tText,
			MDefinition mMember, LineComment mComment, TMember tMember, CCMatch ccMatch) {
		return new Object[] { tText, mMember, mComment, tMember, ccMatch };
	}

	public static final Object[] pattern_TextAnnotations_24_6_createcorrespondence_greenBFBB(TTextAnnotation tText,
			LineComment mComment, CCMatch ccMatch) {
		LineCommentToTTextAnnotation mCommentToTText = PmFactory.eINSTANCE.createLineCommentToTTextAnnotation();
		mCommentToTText.setTarget(tText);
		mCommentToTText.setSource(mComment);
		ccMatch.getCreateCorr().add(mCommentToTText);
		return new Object[] { tText, mCommentToTText, mComment, ccMatch };
	}

	public static final Object[] pattern_TextAnnotations_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TextAnnotations_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TextAnnotations";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TextAnnotations_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_27_1_matchtggpattern_blackBB(MDefinition mMember,
			LineComment mComment) {
		if (mMember.getComments().contains(mComment)) {
			return new Object[] { mMember, mComment };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_27_1_matchtggpattern_greenB(LineComment mComment) {
		boolean mComment_prefixOfParent_prime = Boolean.valueOf(true);
		mComment.setPrefixOfParent(Boolean.valueOf(mComment_prefixOfParent_prime));
		return new Object[] { mComment };
	}

	public static final boolean pattern_TextAnnotations_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TextAnnotations_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_28_1_matchtggpattern_black_nac_0BB(TTextAnnotation tText,
			TMember tMember) {
		TAnnotatable __DEC_tText_tAnnotation_179217 = tText.getTAnnotated();
		if (__DEC_tText_tAnnotation_179217 != null) {
			if (!tMember.equals(__DEC_tText_tAnnotation_179217)) {
				return new Object[] { tText, tMember };
			}
		}

		return null;
	}

	public static final Object[] pattern_TextAnnotations_28_1_matchtggpattern_blackBB(TTextAnnotation tText,
			TMember tMember) {
		if (tMember.equals(tText.getTAnnotated())) {
			if (pattern_TextAnnotations_28_1_matchtggpattern_black_nac_0BB(tText, tMember) == null) {
				return new Object[] { tText, tMember };
			}
		}
		return null;
	}

	public static final boolean pattern_TextAnnotations_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TextAnnotations_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_29_1_createresult_blackB(TextAnnotations _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TextAnnotations_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TextAnnotations_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
				if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
					BodyDeclaration tmpMMember = mMemberToTMember.getSource();
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						TMember tMember = mMemberToTMember.getTarget();
						if (tMember != null) {
							if (pattern_TextAnnotations_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									mMemberToTMember) == null) {
								if (pattern_TextAnnotations_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mMember) == null) {
									if (pattern_TextAnnotations_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											tMember) == null) {
										_result.add(new Object[] { mMemberToTMemberList, mMemberToTMember, mMember,
												tMember, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_TextAnnotations_29_3_solveCSP_bindingFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember, MDefinition mMember,
			TMember tMember, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMemberToTMember, mMember, tMember,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, mMember, tMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_29_3_solveCSP_bindingAndBlackFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember, MDefinition mMember,
			TMember tMember, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TextAnnotations_29_3_solveCSP_binding = pattern_TextAnnotations_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, mMember, tMember, ruleResult);
		if (result_pattern_TextAnnotations_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_29_3_solveCSP_binding[0];

			Object[] result_pattern_TextAnnotations_29_3_solveCSP_black = pattern_TextAnnotations_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TextAnnotations_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, mMember, tMember, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TextAnnotations_29_4_checkCSP_expressionFBB(TextAnnotations _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_29_5_checknacs_blackBBB(MDefinitionToTMember mMemberToTMember,
			MDefinition mMember, TMember tMember) {
		return new Object[] { mMemberToTMember, mMember, tMember };
	}

	public static final Object[] pattern_TextAnnotations_29_6_perform_blackBBBB(MDefinitionToTMember mMemberToTMember,
			MDefinition mMember, TMember tMember, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mMemberToTMember, mMember, tMember, ruleResult };
	}

	public static final Object[] pattern_TextAnnotations_29_6_perform_greenFFBFBBB(MDefinition mMember, TMember tMember,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TTextAnnotation tText = AnnotationsFactory.eINSTANCE.createTTextAnnotation();
		LineCommentToTTextAnnotation mCommentToTText = PmFactory.eINSTANCE.createLineCommentToTTextAnnotation();
		LineComment mComment = JavaFactory.eINSTANCE.createLineComment();
		Object _localVariable_0 = csp.getValue("tText", "text");
		boolean mComment_prefixOfParent_prime = Boolean.valueOf(true);
		Object _localVariable_1 = csp.getValue("mComment", "content");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		tText.setTAnnotated(tMember);
		ruleResult.getTargetObjects().add(tText);
		mCommentToTText.setTarget(tText);
		ruleResult.getCorrObjects().add(mCommentToTText);
		mMember.getComments().add(mComment);
		mCommentToTText.setSource(mComment);
		ruleResult.getSourceObjects().add(mComment);
		String tText_text_prime = (String) _localVariable_0;
		mComment.setPrefixOfParent(Boolean.valueOf(mComment_prefixOfParent_prime));
		String mComment_content_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tText.setText(tText_text_prime);
		mComment.setContent(mComment_content_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tText, mCommentToTText, mMember, mComment, tMember, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_TextAnnotations_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TextAnnotationsImpl
