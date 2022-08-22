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
	public boolean isAppropriate_FWD(Match match, LineComment mComment, MDefinition mMember) {

		Object[] result1_black = TextAnnotationsImpl.pattern_TextAnnotations_0_1_initialbindings_blackBBBB(this, match,
				mComment, mMember);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mComment] = " + mComment + ", " + "[mMember] = " + mMember + ".");
		}

		Object[] result2_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mComment, mMember);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mComment] = " + mComment + ", " + "[mMember] = " + mMember + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TextAnnotationsImpl.pattern_TextAnnotations_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TextAnnotationsImpl
					.pattern_TextAnnotations_0_4_collectelementstobetranslated_blackBBB(match, mComment, mMember);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mComment] = " + mComment + ", " + "[mMember] = " + mMember + ".");
			}
			TextAnnotationsImpl.pattern_TextAnnotations_0_4_collectelementstobetranslated_greenBBBF(match, mComment,
					mMember);
			//nothing EMoflonEdge mMember__mComment____comments = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TextAnnotationsImpl
					.pattern_TextAnnotations_0_5_collectcontextelements_blackBBB(match, mComment, mMember);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mComment] = " + mComment + ", " + "[mMember] = " + mMember + ".");
			}
			TextAnnotationsImpl.pattern_TextAnnotations_0_5_collectcontextelements_greenBB(match, mMember);

			// 
			TextAnnotationsImpl.pattern_TextAnnotations_0_6_registerobjectstomatch_expressionBBBB(this, match, mComment,
					mMember);
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
		TMember tMember = (TMember) result1_bindingAndBlack[0];
		LineComment mComment = (LineComment) result1_bindingAndBlack[1];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[2];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TextAnnotationsImpl
				.pattern_TextAnnotations_1_1_performtransformation_greenBBFFB(tMember, mComment, csp);
		TTextAnnotation tText = (TTextAnnotation) result1_green[2];
		LineCommentToTTextAnnotation mCommentToTText = (LineCommentToTTextAnnotation) result1_green[3];

		Object[] result2_black = TextAnnotationsImpl
				.pattern_TextAnnotations_1_2_collecttranslatedelements_blackBBB(mComment, tText, mCommentToTText);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mComment] = " + mComment + ", "
					+ "[tText] = " + tText + ", " + "[mCommentToTText] = " + mCommentToTText + ".");
		}
		Object[] result2_green = TextAnnotationsImpl
				.pattern_TextAnnotations_1_2_collecttranslatedelements_greenFBBB(mComment, tText, mCommentToTText);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TextAnnotationsImpl.pattern_TextAnnotations_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, tMember, mComment, mMember, mMemberToTMember, tText, mCommentToTText);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tMember] = " + tMember + ", " + "[mComment] = " + mComment + ", " + "[mMember] = "
					+ mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tText] = " + tText + ", "
					+ "[mCommentToTText] = " + mCommentToTText + ".");
		}
		TextAnnotationsImpl.pattern_TextAnnotations_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, tMember,
				mComment, mMember, tText, mCommentToTText);
		//nothing EMoflonEdge mMember__mComment____comments = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tText__tMember____tAnnotated = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tMember__tText____tAnnotation = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mCommentToTText__tText____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mCommentToTText__mComment____source = (EMoflonEdge) result3_green[10];

		// 
		// 
		TextAnnotationsImpl.pattern_TextAnnotations_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, tMember,
				mComment, mMember, mMemberToTMember, tText, mCommentToTText);
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
		LineComment mComment = (LineComment) result2_binding[0];
		MDefinition mMember = (MDefinition) result2_binding[1];
		for (Object[] result2_black : TextAnnotationsImpl.pattern_TextAnnotations_2_2_corematch_blackFBBFB(mComment,
				mMember, match)) {
			TMember tMember = (TMember) result2_black[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[3];
			// ForEach 
			for (Object[] result3_black : TextAnnotationsImpl.pattern_TextAnnotations_2_3_findcontext_blackBBBB(tMember,
					mComment, mMember, mMemberToTMember)) {
				Object[] result3_green = TextAnnotationsImpl.pattern_TextAnnotations_2_3_findcontext_greenBBBBFFFF(
						tMember, mComment, mMember, mMemberToTMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mMember__mComment____comments = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = TextAnnotationsImpl
						.pattern_TextAnnotations_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, tMember,
								mComment, mMember, mMemberToTMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tMember] = " + tMember + ", "
							+ "[mComment] = " + mComment + ", " + "[mMember] = " + mMember + ", "
							+ "[mMemberToTMember] = " + mMemberToTMember + ".");
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
	public void registerObjectsToMatch_FWD(Match match, LineComment mComment, MDefinition mMember) {
		match.registerObject("mComment", mComment);
		match.registerObject("mMember", mMember);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, LineComment mComment, MDefinition mMember) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TMember tMember, LineComment mComment,
			MDefinition mMember, MDefinitionToTMember mMemberToTMember) {// Create CSP
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
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mComment", mComment);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tMember, EObject mComment, EObject mMember,
			EObject mMemberToTMember, EObject tText, EObject mCommentToTText) {
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("mComment", mComment);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("tText", tText);
		ruleresult.registerObject("mCommentToTText", mCommentToTText);

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
	public boolean isAppropriate_BWD(Match match, TMember tMember, TTextAnnotation tText) {

		Object[] result1_black = TextAnnotationsImpl.pattern_TextAnnotations_10_1_initialbindings_blackBBBB(this, match,
				tMember, tText);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tText] = " + tText + ".");
		}

		Object[] result2_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tMember, tText);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tText] = " + tText + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TextAnnotationsImpl.pattern_TextAnnotations_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TextAnnotationsImpl
					.pattern_TextAnnotations_10_4_collectelementstobetranslated_blackBBB(match, tMember, tText);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMember] = " + tMember + ", " + "[tText] = " + tText + ".");
			}
			TextAnnotationsImpl.pattern_TextAnnotations_10_4_collectelementstobetranslated_greenBBBFF(match, tMember,
					tText);
			//nothing EMoflonEdge tText__tMember____tAnnotated = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tMember__tText____tAnnotation = (EMoflonEdge) result4_green[4];

			Object[] result5_black = TextAnnotationsImpl
					.pattern_TextAnnotations_10_5_collectcontextelements_blackBBB(match, tMember, tText);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMember] = " + tMember + ", " + "[tText] = " + tText + ".");
			}
			TextAnnotationsImpl.pattern_TextAnnotations_10_5_collectcontextelements_greenBB(match, tMember);

			// 
			TextAnnotationsImpl.pattern_TextAnnotations_10_6_registerobjectstomatch_expressionBBBB(this, match, tMember,
					tText);
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
		TMember tMember = (TMember) result1_bindingAndBlack[0];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[1];
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[2];
		TTextAnnotation tText = (TTextAnnotation) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TextAnnotationsImpl
				.pattern_TextAnnotations_11_1_performtransformation_greenFBBFB(mMember, tText, csp);
		LineComment mComment = (LineComment) result1_green[0];
		LineCommentToTTextAnnotation mCommentToTText = (LineCommentToTTextAnnotation) result1_green[3];

		Object[] result2_black = TextAnnotationsImpl
				.pattern_TextAnnotations_11_2_collecttranslatedelements_blackBBB(mComment, tText, mCommentToTText);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mComment] = " + mComment + ", "
					+ "[tText] = " + tText + ", " + "[mCommentToTText] = " + mCommentToTText + ".");
		}
		Object[] result2_green = TextAnnotationsImpl
				.pattern_TextAnnotations_11_2_collecttranslatedelements_greenFBBB(mComment, tText, mCommentToTText);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TextAnnotationsImpl.pattern_TextAnnotations_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, tMember, mComment, mMember, mMemberToTMember, tText, mCommentToTText);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tMember] = " + tMember + ", " + "[mComment] = " + mComment + ", " + "[mMember] = "
					+ mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", " + "[tText] = " + tText + ", "
					+ "[mCommentToTText] = " + mCommentToTText + ".");
		}
		TextAnnotationsImpl.pattern_TextAnnotations_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, tMember,
				mComment, mMember, tText, mCommentToTText);
		//nothing EMoflonEdge mMember__mComment____comments = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tText__tMember____tAnnotated = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tMember__tText____tAnnotation = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mCommentToTText__tText____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mCommentToTText__mComment____source = (EMoflonEdge) result3_green[10];

		// 
		// 
		TextAnnotationsImpl.pattern_TextAnnotations_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, tMember,
				mComment, mMember, mMemberToTMember, tText, mCommentToTText);
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
		TMember tMember = (TMember) result2_binding[0];
		TTextAnnotation tText = (TTextAnnotation) result2_binding[1];
		for (Object[] result2_black : TextAnnotationsImpl.pattern_TextAnnotations_12_2_corematch_blackBFFBB(tMember,
				tText, match)) {
			MDefinition mMember = (MDefinition) result2_black[1];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[2];
			// ForEach 
			for (Object[] result3_black : TextAnnotationsImpl
					.pattern_TextAnnotations_12_3_findcontext_blackBBBB(tMember, mMember, mMemberToTMember, tText)) {
				Object[] result3_green = TextAnnotationsImpl.pattern_TextAnnotations_12_3_findcontext_greenBBBBFFFFF(
						tMember, mMember, mMemberToTMember, tText);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tText__tMember____tAnnotated = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tMember__tText____tAnnotation = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = TextAnnotationsImpl
						.pattern_TextAnnotations_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, tMember,
								mMember, mMemberToTMember, tText);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tMember] = " + tMember + ", "
							+ "[mMember] = " + mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
							+ "[tText] = " + tText + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TMember tMember, TTextAnnotation tText) {
		match.registerObject("tMember", tMember);
		match.registerObject("tText", tText);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tMember, TTextAnnotation tText) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TTextAnnotation tText) {// Create CSP
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
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("tText", tText);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tMember, EObject mComment, EObject mMember,
			EObject mMemberToTMember, EObject tText, EObject mCommentToTText) {
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("mComment", mComment);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("tText", tText);
		ruleresult.registerObject("mCommentToTText", mCommentToTText);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_145(EMoflonEdge _edge_tAnnotated) {

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
			TMember tMember = (TMember) result2_black[0];
			TTextAnnotation tText = (TTextAnnotation) result2_black[1];
			Object[] result2_green = TextAnnotationsImpl
					.pattern_TextAnnotations_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TextAnnotationsImpl
					.pattern_TextAnnotations_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							tMember, tText)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_156(EMoflonEdge _edge_comments) {

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
			LineComment mComment = (LineComment) result2_black[0];
			MDefinition mMember = (MDefinition) result2_black[1];
			Object[] result2_green = TextAnnotationsImpl
					.pattern_TextAnnotations_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TextAnnotationsImpl
					.pattern_TextAnnotations_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							mComment, mMember)) {
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

		Variable var_mComment_content = CSPFactoryHelper.eINSTANCE.createVariable("mComment", true, csp);
		var_mComment_content.setValue(__helper.getValue("mComment", "content"));
		var_mComment_content.setType("String");

		Variable var_tText_text = CSPFactoryHelper.eINSTANCE.createVariable("tText", true, csp);
		var_tText_text.setValue(__helper.getValue("tText", "text"));
		var_tText_text.setType("String");

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

		Variable var_mComment_content = CSPFactoryHelper.eINSTANCE.createVariable("mComment", true, csp);
		var_mComment_content.setValue(__helper.getValue("mComment", "content"));
		var_mComment_content.setType("String");

		Variable var_tText_text = CSPFactoryHelper.eINSTANCE.createVariable("tText", true, csp);
		var_tText_text.setValue(__helper.getValue("tText", "text"));
		var_tText_text.setType("String");

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
		TMember tMember = (TMember) result2_bindingAndBlack[0];
		LineComment mComment = (LineComment) result2_bindingAndBlack[1];
		MDefinition mMember = (MDefinition) result2_bindingAndBlack[2];
		TTextAnnotation tText = (TTextAnnotation) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = TextAnnotationsImpl
				.pattern_TextAnnotations_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, tMember, mComment, mMember, tText,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tMember] = " + tMember + ", " + "[mComment] = " + mComment + ", " + "[mMember] = " + mMember
					+ ", " + "[tText] = " + tText + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TextAnnotationsImpl.pattern_TextAnnotations_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TextAnnotationsImpl.pattern_TextAnnotations_24_5_matchcorrcontext_blackBBFBB(
					tMember, mMember, sourceMatch, targetMatch)) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result5_black[2];
				Object[] result5_green = TextAnnotationsImpl.pattern_TextAnnotations_24_5_matchcorrcontext_greenBBBF(
						mMemberToTMember, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = TextAnnotationsImpl
						.pattern_TextAnnotations_24_6_createcorrespondence_blackBBBBB(tMember, mComment, mMember, tText,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMember] = " + tMember
							+ ", " + "[mComment] = " + mComment + ", " + "[mMember] = " + mMember + ", " + "[tText] = "
							+ tText + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TextAnnotationsImpl.pattern_TextAnnotations_24_6_createcorrespondence_greenBBFB(mComment, tText,
						ccMatch);
				//nothing LineCommentToTTextAnnotation mCommentToTText = (LineCommentToTTextAnnotation) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(TMember tMember, LineComment mComment, MDefinition mMember,
			TTextAnnotation tText, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(LineComment mComment, MDefinition mMember) {// 
		Object[] result1_black = TextAnnotationsImpl.pattern_TextAnnotations_27_1_matchtggpattern_blackBB(mComment,
				mMember);
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
	public boolean checkDEC_BWD(TMember tMember, TTextAnnotation tText) {// 
		Object[] result1_black = TextAnnotationsImpl.pattern_TextAnnotations_28_1_matchtggpattern_blackBB(tMember,
				tText);
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
			TMember tMember = (TMember) result2_black[1];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[2];
			MDefinition mMember = (MDefinition) result2_black[3];

			Object[] result3_bindingAndBlack = TextAnnotationsImpl
					.pattern_TextAnnotations_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, tMember,
							mMember, mMemberToTMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tMember] = " + tMember + ", "
						+ "[mMember] = " + mMember + ", " + "[mMemberToTMember] = " + mMemberToTMember + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TextAnnotationsImpl.pattern_TextAnnotations_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TextAnnotationsImpl.pattern_TextAnnotations_29_5_checknacs_blackBBB(tMember,
						mMember, mMemberToTMember);
				if (result5_black != null) {

					Object[] result6_black = TextAnnotationsImpl.pattern_TextAnnotations_29_6_perform_blackBBBB(tMember,
							mMember, mMemberToTMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMember] = "
								+ tMember + ", " + "[mMember] = " + mMember + ", " + "[mMemberToTMember] = "
								+ mMemberToTMember + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					TextAnnotationsImpl.pattern_TextAnnotations_29_6_perform_greenBFBFFBB(tMember, mMember, ruleResult,
							csp);
					//nothing LineComment mComment = (LineComment) result6_green[1];
					//nothing TTextAnnotation tText = (TTextAnnotation) result6_green[3];
					//nothing LineCommentToTTextAnnotation mCommentToTText = (LineCommentToTTextAnnotation) result6_green[4];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
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
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_FWD__MATCH_LINECOMMENT_MDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (LineComment) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.TEXT_ANNOTATIONS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_LINECOMMENT_MDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (LineComment) arguments.get(1),
					(MDefinition) arguments.get(2));
			return null;
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_LINECOMMENT_MDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (LineComment) arguments.get(1),
					(MDefinition) arguments.get(2));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TMEMBER_LINECOMMENT_MDEFINITION_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TMember) arguments.get(1),
					(LineComment) arguments.get(2), (MDefinition) arguments.get(3),
					(MDefinitionToTMember) arguments.get(4));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TTEXTANNOTATION:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TTextAnnotation) arguments.get(2));
		case RulesPackage.TEXT_ANNOTATIONS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TTEXTANNOTATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TTextAnnotation) arguments.get(2));
			return null;
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TTEXTANNOTATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TTextAnnotation) arguments.get(2));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMEMBER_MDEFINITION_MDEFINITIONTOTMEMBER_TTEXTANNOTATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMember) arguments.get(1),
					(MDefinition) arguments.get(2), (MDefinitionToTMember) arguments.get(3),
					(TTextAnnotation) arguments.get(4));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_145__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_145((EMoflonEdge) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_156__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_156((EMoflonEdge) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_SOLVE_CSP_CC__TMEMBER_LINECOMMENT_MDEFINITION_TTEXTANNOTATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMember) arguments.get(0), (LineComment) arguments.get(1),
					(MDefinition) arguments.get(2), (TTextAnnotation) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.TEXT_ANNOTATIONS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_DEC_FWD__LINECOMMENT_MDEFINITION:
			return checkDEC_FWD((LineComment) arguments.get(0), (MDefinition) arguments.get(1));
		case RulesPackage.TEXT_ANNOTATIONS___CHECK_DEC_BWD__TMEMBER_TTEXTANNOTATION:
			return checkDEC_BWD((TMember) arguments.get(0), (TTextAnnotation) arguments.get(1));
		case RulesPackage.TEXT_ANNOTATIONS___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.TEXT_ANNOTATIONS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMEMBER_MDEFINITION_MDEFINITIONTOTMEMBER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TMember) arguments.get(1),
					(MDefinition) arguments.get(2), (MDefinitionToTMember) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.TEXT_ANNOTATIONS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TextAnnotations_0_1_initialbindings_blackBBBB(TextAnnotations _this,
			Match match, LineComment mComment, MDefinition mMember) {
		return new Object[] { _this, match, mComment, mMember };
	}

	public static final Object[] pattern_TextAnnotations_0_2_SolveCSP_bindingFBBBB(TextAnnotations _this, Match match,
			LineComment mComment, MDefinition mMember) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mComment, mMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mComment, mMember };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_0_2_SolveCSP_bindingAndBlackFBBBB(TextAnnotations _this,
			Match match, LineComment mComment, MDefinition mMember) {
		Object[] result_pattern_TextAnnotations_0_2_SolveCSP_binding = pattern_TextAnnotations_0_2_SolveCSP_bindingFBBBB(
				_this, match, mComment, mMember);
		if (result_pattern_TextAnnotations_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TextAnnotations_0_2_SolveCSP_black = pattern_TextAnnotations_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TextAnnotations_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mComment, mMember };
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
			LineComment mComment, MDefinition mMember) {
		return new Object[] { match, mComment, mMember };
	}

	public static final Object[] pattern_TextAnnotations_0_4_collectelementstobetranslated_greenBBBF(Match match,
			LineComment mComment, MDefinition mMember) {
		EMoflonEdge mMember__mComment____comments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mComment);
		String mMember__mComment____comments_name_prime = "comments";
		mMember__mComment____comments.setSrc(mMember);
		mMember__mComment____comments.setTrg(mComment);
		match.getToBeTranslatedEdges().add(mMember__mComment____comments);
		mMember__mComment____comments.setName(mMember__mComment____comments_name_prime);
		return new Object[] { match, mComment, mMember, mMember__mComment____comments };
	}

	public static final Object[] pattern_TextAnnotations_0_5_collectcontextelements_blackBBB(Match match,
			LineComment mComment, MDefinition mMember) {
		return new Object[] { match, mComment, mMember };
	}

	public static final Object[] pattern_TextAnnotations_0_5_collectcontextelements_greenBB(Match match,
			MDefinition mMember) {
		match.getContextNodes().add(mMember);
		return new Object[] { match, mMember };
	}

	public static final void pattern_TextAnnotations_0_6_registerobjectstomatch_expressionBBBB(TextAnnotations _this,
			Match match, LineComment mComment, MDefinition mMember) {
		_this.registerObjectsToMatch_FWD(match, mComment, mMember);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("mComment");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMemberToTMember");
		EObject tmpTMember = _localVariable_0;
		EObject tmpMComment = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		EObject tmpMMemberToTMember = _localVariable_3;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpMComment instanceof LineComment) {
				LineComment mComment = (LineComment) tmpMComment;
				if (tmpMMember instanceof MDefinition) {
					MDefinition mMember = (MDefinition) tmpMMember;
					if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
						MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
						return new Object[] { tMember, mComment, mMember, mMemberToTMember, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_1_1_performtransformation_blackBBBBFBB(TMember tMember,
			LineComment mComment, MDefinition mMember, MDefinitionToTMember mMemberToTMember, TextAnnotations _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMember, mComment, mMember, mMemberToTMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_1_1_performtransformation_bindingAndBlackFFFFFBB(
			TextAnnotations _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TextAnnotations_1_1_performtransformation_binding = pattern_TextAnnotations_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TextAnnotations_1_1_performtransformation_binding != null) {
			TMember tMember = (TMember) result_pattern_TextAnnotations_1_1_performtransformation_binding[0];
			LineComment mComment = (LineComment) result_pattern_TextAnnotations_1_1_performtransformation_binding[1];
			MDefinition mMember = (MDefinition) result_pattern_TextAnnotations_1_1_performtransformation_binding[2];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_TextAnnotations_1_1_performtransformation_binding[3];

			Object[] result_pattern_TextAnnotations_1_1_performtransformation_black = pattern_TextAnnotations_1_1_performtransformation_blackBBBBFBB(
					tMember, mComment, mMember, mMemberToTMember, _this, isApplicableMatch);
			if (result_pattern_TextAnnotations_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TextAnnotations_1_1_performtransformation_black[4];

				return new Object[] { tMember, mComment, mMember, mMemberToTMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_1_1_performtransformation_greenBBFFB(TMember tMember,
			LineComment mComment, CSP csp) {
		TTextAnnotation tText = AnnotationsFactory.eINSTANCE.createTTextAnnotation();
		LineCommentToTTextAnnotation mCommentToTText = PmFactory.eINSTANCE.createLineCommentToTTextAnnotation();
		Object _localVariable_0 = csp.getValue("tText", "text");
		tText.setTAnnotated(tMember);
		mCommentToTText.setTarget(tText);
		mCommentToTText.setSource(mComment);
		String tText_text_prime = (String) _localVariable_0;
		tText.setText(tText_text_prime);
		return new Object[] { tMember, mComment, tText, mCommentToTText, csp };
	}

	public static final Object[] pattern_TextAnnotations_1_2_collecttranslatedelements_blackBBB(LineComment mComment,
			TTextAnnotation tText, LineCommentToTTextAnnotation mCommentToTText) {
		return new Object[] { mComment, tText, mCommentToTText };
	}

	public static final Object[] pattern_TextAnnotations_1_2_collecttranslatedelements_greenFBBB(LineComment mComment,
			TTextAnnotation tText, LineCommentToTTextAnnotation mCommentToTText) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mComment);
		ruleresult.getCreatedElements().add(tText);
		ruleresult.getCreatedLinkElements().add(mCommentToTText);
		return new Object[] { ruleresult, mComment, tText, mCommentToTText };
	}

	public static final Object[] pattern_TextAnnotations_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject tMember, EObject mComment, EObject mMember, EObject mMemberToTMember,
			EObject tText, EObject mCommentToTText) {
		if (!tMember.equals(tText)) {
			if (!mComment.equals(tMember)) {
				if (!mComment.equals(mMember)) {
					if (!mComment.equals(mMemberToTMember)) {
						if (!mComment.equals(tText)) {
							if (!mComment.equals(mCommentToTText)) {
								if (!mMember.equals(tMember)) {
									if (!mMember.equals(mMemberToTMember)) {
										if (!mMember.equals(tText)) {
											if (!mMemberToTMember.equals(tMember)) {
												if (!mMemberToTMember.equals(tText)) {
													if (!mCommentToTText.equals(tMember)) {
														if (!mCommentToTText.equals(mMember)) {
															if (!mCommentToTText.equals(mMemberToTMember)) {
																if (!mCommentToTText.equals(tText)) {
																	return new Object[] { ruleresult, tMember, mComment,
																			mMember, mMemberToTMember, tText,
																			mCommentToTText };
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject tMember, EObject mComment, EObject mMember, EObject tText,
			EObject mCommentToTText) {
		EMoflonEdge mMember__mComment____comments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tText__tMember____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tText____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCommentToTText__tText____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCommentToTText__mComment____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TextAnnotations";
		String mMember__mComment____comments_name_prime = "comments";
		String tText__tMember____tAnnotated_name_prime = "tAnnotated";
		String tMember__tText____tAnnotation_name_prime = "tAnnotation";
		String mCommentToTText__tText____target_name_prime = "target";
		String mCommentToTText__mComment____source_name_prime = "source";
		mMember__mComment____comments.setSrc(mMember);
		mMember__mComment____comments.setTrg(mComment);
		ruleresult.getTranslatedEdges().add(mMember__mComment____comments);
		tText__tMember____tAnnotated.setSrc(tText);
		tText__tMember____tAnnotated.setTrg(tMember);
		ruleresult.getCreatedEdges().add(tText__tMember____tAnnotated);
		tMember__tText____tAnnotation.setSrc(tMember);
		tMember__tText____tAnnotation.setTrg(tText);
		ruleresult.getCreatedEdges().add(tMember__tText____tAnnotation);
		mCommentToTText__tText____target.setSrc(mCommentToTText);
		mCommentToTText__tText____target.setTrg(tText);
		ruleresult.getCreatedEdges().add(mCommentToTText__tText____target);
		mCommentToTText__mComment____source.setSrc(mCommentToTText);
		mCommentToTText__mComment____source.setTrg(mComment);
		ruleresult.getCreatedEdges().add(mCommentToTText__mComment____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mMember__mComment____comments.setName(mMember__mComment____comments_name_prime);
		tText__tMember____tAnnotated.setName(tText__tMember____tAnnotated_name_prime);
		tMember__tText____tAnnotation.setName(tMember__tText____tAnnotation_name_prime);
		mCommentToTText__tText____target.setName(mCommentToTText__tText____target_name_prime);
		mCommentToTText__mComment____source.setName(mCommentToTText__mComment____source_name_prime);
		return new Object[] { ruleresult, tMember, mComment, mMember, tText, mCommentToTText,
				mMember__mComment____comments, tText__tMember____tAnnotated, tMember__tText____tAnnotation,
				mCommentToTText__tText____target, mCommentToTText__mComment____source };
	}

	public static final void pattern_TextAnnotations_1_5_registerobjects_expressionBBBBBBBB(TextAnnotations _this,
			PerformRuleResult ruleresult, EObject tMember, EObject mComment, EObject mMember, EObject mMemberToTMember,
			EObject tText, EObject mCommentToTText) {
		_this.registerObjects_FWD(ruleresult, tMember, mComment, mMember, mMemberToTMember, tText, mCommentToTText);

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
		EObject _localVariable_0 = match.getObject("mComment");
		EObject _localVariable_1 = match.getObject("mMember");
		EObject tmpMComment = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		if (tmpMComment instanceof LineComment) {
			LineComment mComment = (LineComment) tmpMComment;
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				return new Object[] { mComment, mMember, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_2_2_corematch_blackFBBFB(LineComment mComment,
			MDefinition mMember, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean mComment_prefixOfParent = mComment.isPrefixOfParent();
		if (Boolean.valueOf(mComment_prefixOfParent).equals(Boolean.valueOf(true))) {
			for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
				TMember tMember = mMemberToTMember.getTarget();
				if (tMember != null) {
					_result.add(new Object[] { tMember, mComment, mMember, mMemberToTMember, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_2_3_findcontext_blackBBBB(TMember tMember,
			LineComment mComment, MDefinition mMember, MDefinitionToTMember mMemberToTMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mMember.getComments().contains(mComment)) {
			if (tMember.equals(mMemberToTMember.getTarget())) {
				if (mMember.equals(mMemberToTMember.getSource())) {
					boolean mComment_prefixOfParent = mComment.isPrefixOfParent();
					if (Boolean.valueOf(mComment_prefixOfParent).equals(Boolean.valueOf(true))) {
						_result.add(new Object[] { tMember, mComment, mMember, mMemberToTMember });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_2_3_findcontext_greenBBBBFFFF(TMember tMember,
			LineComment mComment, MDefinition mMember, MDefinitionToTMember mMemberToTMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMember__mComment____comments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMember__mComment____comments_name_prime = "comments";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mMemberToTMember__mMember____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mComment);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		mMember__mComment____comments.setSrc(mMember);
		mMember__mComment____comments.setTrg(mComment);
		isApplicableMatch.getAllContextElements().add(mMember__mComment____comments);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMember__mComment____comments.setName(mMember__mComment____comments_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		return new Object[] { tMember, mComment, mMember, mMemberToTMember, isApplicableMatch,
				mMember__mComment____comments, mMemberToTMember__tMember____target,
				mMemberToTMember__mMember____source };
	}

	public static final Object[] pattern_TextAnnotations_2_4_solveCSP_bindingFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, TMember tMember, LineComment mComment, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tMember, mComment, mMember,
				mMemberToTMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMember, mComment, mMember, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_2_4_solveCSP_bindingAndBlackFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, TMember tMember, LineComment mComment, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember) {
		Object[] result_pattern_TextAnnotations_2_4_solveCSP_binding = pattern_TextAnnotations_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, tMember, mComment, mMember, mMemberToTMember);
		if (result_pattern_TextAnnotations_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_2_4_solveCSP_binding[0];

			Object[] result_pattern_TextAnnotations_2_4_solveCSP_black = pattern_TextAnnotations_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TextAnnotations_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMember, mComment, mMember, mMemberToTMember };
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
			Match match, TMember tMember, TTextAnnotation tText) {
		return new Object[] { _this, match, tMember, tText };
	}

	public static final Object[] pattern_TextAnnotations_10_2_SolveCSP_bindingFBBBB(TextAnnotations _this, Match match,
			TMember tMember, TTextAnnotation tText) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMember, tText);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMember, tText };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_10_2_SolveCSP_bindingAndBlackFBBBB(TextAnnotations _this,
			Match match, TMember tMember, TTextAnnotation tText) {
		Object[] result_pattern_TextAnnotations_10_2_SolveCSP_binding = pattern_TextAnnotations_10_2_SolveCSP_bindingFBBBB(
				_this, match, tMember, tText);
		if (result_pattern_TextAnnotations_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TextAnnotations_10_2_SolveCSP_black = pattern_TextAnnotations_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TextAnnotations_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMember, tText };
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
			TMember tMember, TTextAnnotation tText) {
		return new Object[] { match, tMember, tText };
	}

	public static final Object[] pattern_TextAnnotations_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TMember tMember, TTextAnnotation tText) {
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
		return new Object[] { match, tMember, tText, tText__tMember____tAnnotated, tMember__tText____tAnnotation };
	}

	public static final Object[] pattern_TextAnnotations_10_5_collectcontextelements_blackBBB(Match match,
			TMember tMember, TTextAnnotation tText) {
		return new Object[] { match, tMember, tText };
	}

	public static final Object[] pattern_TextAnnotations_10_5_collectcontextelements_greenBB(Match match,
			TMember tMember) {
		match.getContextNodes().add(tMember);
		return new Object[] { match, tMember };
	}

	public static final void pattern_TextAnnotations_10_6_registerobjectstomatch_expressionBBBB(TextAnnotations _this,
			Match match, TMember tMember, TTextAnnotation tText) {
		_this.registerObjectsToMatch_BWD(match, tMember, tText);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("tText");
		EObject tmpTMember = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		EObject tmpMMemberToTMember = _localVariable_2;
		EObject tmpTText = _localVariable_3;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
					if (tmpTText instanceof TTextAnnotation) {
						TTextAnnotation tText = (TTextAnnotation) tmpTText;
						return new Object[] { tMember, mMember, mMemberToTMember, tText, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_11_1_performtransformation_blackBBBBFBB(TMember tMember,
			MDefinition mMember, MDefinitionToTMember mMemberToTMember, TTextAnnotation tText, TextAnnotations _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tMember, mMember, mMemberToTMember, tText, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_11_1_performtransformation_bindingAndBlackFFFFFBB(
			TextAnnotations _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TextAnnotations_11_1_performtransformation_binding = pattern_TextAnnotations_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TextAnnotations_11_1_performtransformation_binding != null) {
			TMember tMember = (TMember) result_pattern_TextAnnotations_11_1_performtransformation_binding[0];
			MDefinition mMember = (MDefinition) result_pattern_TextAnnotations_11_1_performtransformation_binding[1];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_TextAnnotations_11_1_performtransformation_binding[2];
			TTextAnnotation tText = (TTextAnnotation) result_pattern_TextAnnotations_11_1_performtransformation_binding[3];

			Object[] result_pattern_TextAnnotations_11_1_performtransformation_black = pattern_TextAnnotations_11_1_performtransformation_blackBBBBFBB(
					tMember, mMember, mMemberToTMember, tText, _this, isApplicableMatch);
			if (result_pattern_TextAnnotations_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TextAnnotations_11_1_performtransformation_black[4];

				return new Object[] { tMember, mMember, mMemberToTMember, tText, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_11_1_performtransformation_greenFBBFB(MDefinition mMember,
			TTextAnnotation tText, CSP csp) {
		LineComment mComment = JavaFactory.eINSTANCE.createLineComment();
		LineCommentToTTextAnnotation mCommentToTText = PmFactory.eINSTANCE.createLineCommentToTTextAnnotation();
		boolean mComment_prefixOfParent_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("mComment", "content");
		mMember.getComments().add(mComment);
		mCommentToTText.setTarget(tText);
		mCommentToTText.setSource(mComment);
		mComment.setPrefixOfParent(Boolean.valueOf(mComment_prefixOfParent_prime));
		String mComment_content_prime = (String) _localVariable_0;
		mComment.setContent(mComment_content_prime);
		return new Object[] { mComment, mMember, tText, mCommentToTText, csp };
	}

	public static final Object[] pattern_TextAnnotations_11_2_collecttranslatedelements_blackBBB(LineComment mComment,
			TTextAnnotation tText, LineCommentToTTextAnnotation mCommentToTText) {
		return new Object[] { mComment, tText, mCommentToTText };
	}

	public static final Object[] pattern_TextAnnotations_11_2_collecttranslatedelements_greenFBBB(LineComment mComment,
			TTextAnnotation tText, LineCommentToTTextAnnotation mCommentToTText) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mComment);
		ruleresult.getTranslatedElements().add(tText);
		ruleresult.getCreatedLinkElements().add(mCommentToTText);
		return new Object[] { ruleresult, mComment, tText, mCommentToTText };
	}

	public static final Object[] pattern_TextAnnotations_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject tMember, EObject mComment, EObject mMember, EObject mMemberToTMember,
			EObject tText, EObject mCommentToTText) {
		if (!tMember.equals(tText)) {
			if (!mComment.equals(tMember)) {
				if (!mComment.equals(mMember)) {
					if (!mComment.equals(mMemberToTMember)) {
						if (!mComment.equals(tText)) {
							if (!mComment.equals(mCommentToTText)) {
								if (!mMember.equals(tMember)) {
									if (!mMember.equals(mMemberToTMember)) {
										if (!mMember.equals(tText)) {
											if (!mMemberToTMember.equals(tMember)) {
												if (!mMemberToTMember.equals(tText)) {
													if (!mCommentToTText.equals(tMember)) {
														if (!mCommentToTText.equals(mMember)) {
															if (!mCommentToTText.equals(mMemberToTMember)) {
																if (!mCommentToTText.equals(tText)) {
																	return new Object[] { ruleresult, tMember, mComment,
																			mMember, mMemberToTMember, tText,
																			mCommentToTText };
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject tMember, EObject mComment, EObject mMember, EObject tText,
			EObject mCommentToTText) {
		EMoflonEdge mMember__mComment____comments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tText__tMember____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tText____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCommentToTText__tText____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCommentToTText__mComment____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TextAnnotations";
		String mMember__mComment____comments_name_prime = "comments";
		String tText__tMember____tAnnotated_name_prime = "tAnnotated";
		String tMember__tText____tAnnotation_name_prime = "tAnnotation";
		String mCommentToTText__tText____target_name_prime = "target";
		String mCommentToTText__mComment____source_name_prime = "source";
		mMember__mComment____comments.setSrc(mMember);
		mMember__mComment____comments.setTrg(mComment);
		ruleresult.getCreatedEdges().add(mMember__mComment____comments);
		tText__tMember____tAnnotated.setSrc(tText);
		tText__tMember____tAnnotated.setTrg(tMember);
		ruleresult.getTranslatedEdges().add(tText__tMember____tAnnotated);
		tMember__tText____tAnnotation.setSrc(tMember);
		tMember__tText____tAnnotation.setTrg(tText);
		ruleresult.getTranslatedEdges().add(tMember__tText____tAnnotation);
		mCommentToTText__tText____target.setSrc(mCommentToTText);
		mCommentToTText__tText____target.setTrg(tText);
		ruleresult.getCreatedEdges().add(mCommentToTText__tText____target);
		mCommentToTText__mComment____source.setSrc(mCommentToTText);
		mCommentToTText__mComment____source.setTrg(mComment);
		ruleresult.getCreatedEdges().add(mCommentToTText__mComment____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mMember__mComment____comments.setName(mMember__mComment____comments_name_prime);
		tText__tMember____tAnnotated.setName(tText__tMember____tAnnotated_name_prime);
		tMember__tText____tAnnotation.setName(tMember__tText____tAnnotation_name_prime);
		mCommentToTText__tText____target.setName(mCommentToTText__tText____target_name_prime);
		mCommentToTText__mComment____source.setName(mCommentToTText__mComment____source_name_prime);
		return new Object[] { ruleresult, tMember, mComment, mMember, tText, mCommentToTText,
				mMember__mComment____comments, tText__tMember____tAnnotated, tMember__tText____tAnnotation,
				mCommentToTText__tText____target, mCommentToTText__mComment____source };
	}

	public static final void pattern_TextAnnotations_11_5_registerobjects_expressionBBBBBBBB(TextAnnotations _this,
			PerformRuleResult ruleresult, EObject tMember, EObject mComment, EObject mMember, EObject mMemberToTMember,
			EObject tText, EObject mCommentToTText) {
		_this.registerObjects_BWD(ruleresult, tMember, mComment, mMember, mMemberToTMember, tText, mCommentToTText);

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
		EObject _localVariable_0 = match.getObject("tMember");
		EObject _localVariable_1 = match.getObject("tText");
		EObject tmpTMember = _localVariable_0;
		EObject tmpTText = _localVariable_1;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpTText instanceof TTextAnnotation) {
				TTextAnnotation tText = (TTextAnnotation) tmpTText;
				return new Object[] { tMember, tText, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_12_2_corematch_blackBFFBB(TMember tMember,
			TTextAnnotation tText, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
			BodyDeclaration tmpMMember = mMemberToTMember.getSource();
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				_result.add(new Object[] { tMember, mMember, mMemberToTMember, tText, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_12_3_findcontext_blackBBBB(TMember tMember,
			MDefinition mMember, MDefinitionToTMember mMemberToTMember, TTextAnnotation tText) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tMember.equals(mMemberToTMember.getTarget())) {
			if (mMember.equals(mMemberToTMember.getSource())) {
				if (tMember.equals(tText.getTAnnotated())) {
					_result.add(new Object[] { tMember, mMember, mMemberToTMember, tText });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_12_3_findcontext_greenBBBBFFFFF(TMember tMember,
			MDefinition mMember, MDefinitionToTMember mMemberToTMember, TTextAnnotation tText) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tText__tMember____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tText____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String tText__tMember____tAnnotated_name_prime = "tAnnotated";
		String tMember__tText____tAnnotation_name_prime = "tAnnotation";
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(tText);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		tText__tMember____tAnnotated.setSrc(tText);
		tText__tMember____tAnnotated.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tText__tMember____tAnnotated);
		tMember__tText____tAnnotation.setSrc(tMember);
		tMember__tText____tAnnotation.setTrg(tText);
		isApplicableMatch.getAllContextElements().add(tMember__tText____tAnnotation);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		tText__tMember____tAnnotated.setName(tText__tMember____tAnnotated_name_prime);
		tMember__tText____tAnnotation.setName(tMember__tText____tAnnotation_name_prime);
		return new Object[] { tMember, mMember, mMemberToTMember, tText, isApplicableMatch,
				mMemberToTMember__tMember____target, mMemberToTMember__mMember____source, tText__tMember____tAnnotated,
				tMember__tText____tAnnotation };
	}

	public static final Object[] pattern_TextAnnotations_12_4_solveCSP_bindingFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TTextAnnotation tText) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tMember, mMember, mMemberToTMember,
				tText);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMember, mMember, mMemberToTMember, tText };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_12_4_solveCSP_bindingAndBlackFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, TTextAnnotation tText) {
		Object[] result_pattern_TextAnnotations_12_4_solveCSP_binding = pattern_TextAnnotations_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, tMember, mMember, mMemberToTMember, tText);
		if (result_pattern_TextAnnotations_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_12_4_solveCSP_binding[0];

			Object[] result_pattern_TextAnnotations_12_4_solveCSP_black = pattern_TextAnnotations_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TextAnnotations_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMember, mMember, mMemberToTMember, tText };
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
		TAnnotatable __DEC_tText_tAnnotation_608674 = tText.getTAnnotated();
		if (__DEC_tText_tAnnotation_608674 != null) {
			if (!tMember.equals(__DEC_tText_tAnnotation_608674)) {
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
						_result.add(new Object[] { tMember, tText, _edge_tAnnotated });
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
			TextAnnotations _this, Match match, TMember tMember, TTextAnnotation tText) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMember, tText);
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
						_result.add(new Object[] { mComment, mMember, _edge_comments });
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
			TextAnnotations _this, Match match, LineComment mComment, MDefinition mMember) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mComment, mMember);
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
		EObject _localVariable_0 = targetMatch.getObject("tMember");
		EObject _localVariable_1 = sourceMatch.getObject("mComment");
		EObject _localVariable_2 = sourceMatch.getObject("mMember");
		EObject _localVariable_3 = targetMatch.getObject("tText");
		EObject tmpTMember = _localVariable_0;
		EObject tmpMComment = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		EObject tmpTText = _localVariable_3;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpMComment instanceof LineComment) {
				LineComment mComment = (LineComment) tmpMComment;
				if (tmpMMember instanceof MDefinition) {
					MDefinition mMember = (MDefinition) tmpMMember;
					if (tmpTText instanceof TTextAnnotation) {
						TTextAnnotation tText = (TTextAnnotation) tmpTText;
						return new Object[] { tMember, mComment, mMember, tText, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_24_2_matchsrctrgcontext_blackBBBBBB(TMember tMember,
			LineComment mComment, MDefinition mMember, TTextAnnotation tText, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			boolean mComment_prefixOfParent = mComment.isPrefixOfParent();
			if (Boolean.valueOf(mComment_prefixOfParent).equals(Boolean.valueOf(true))) {
				return new Object[] { tMember, mComment, mMember, tText, sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding = pattern_TextAnnotations_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding != null) {
			TMember tMember = (TMember) result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding[0];
			LineComment mComment = (LineComment) result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding[1];
			MDefinition mMember = (MDefinition) result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding[2];
			TTextAnnotation tText = (TTextAnnotation) result_pattern_TextAnnotations_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_TextAnnotations_24_2_matchsrctrgcontext_black = pattern_TextAnnotations_24_2_matchsrctrgcontext_blackBBBBBB(
					tMember, mComment, mMember, tText, sourceMatch, targetMatch);
			if (result_pattern_TextAnnotations_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tMember, mComment, mMember, tText, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_24_3_solvecsp_bindingFBBBBBBB(TextAnnotations _this,
			TMember tMember, LineComment mComment, MDefinition mMember, TTextAnnotation tText, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(tMember, mComment, mMember, tText, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, tMember, mComment, mMember, tText, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_24_3_solvecsp_bindingAndBlackFBBBBBBB(TextAnnotations _this,
			TMember tMember, LineComment mComment, MDefinition mMember, TTextAnnotation tText, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_TextAnnotations_24_3_solvecsp_binding = pattern_TextAnnotations_24_3_solvecsp_bindingFBBBBBBB(
				_this, tMember, mComment, mMember, tText, sourceMatch, targetMatch);
		if (result_pattern_TextAnnotations_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_24_3_solvecsp_binding[0];

			Object[] result_pattern_TextAnnotations_24_3_solvecsp_black = pattern_TextAnnotations_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TextAnnotations_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tMember, mComment, mMember, tText, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TextAnnotations_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TextAnnotations_24_5_matchcorrcontext_blackBBFBB(TMember tMember,
			MDefinition mMember, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
				if (mMember.equals(mMemberToTMember.getSource())) {
					_result.add(new Object[] { tMember, mMember, mMemberToTMember, sourceMatch, targetMatch });
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

	public static final Object[] pattern_TextAnnotations_24_6_createcorrespondence_blackBBBBB(TMember tMember,
			LineComment mComment, MDefinition mMember, TTextAnnotation tText, CCMatch ccMatch) {
		return new Object[] { tMember, mComment, mMember, tText, ccMatch };
	}

	public static final Object[] pattern_TextAnnotations_24_6_createcorrespondence_greenBBFB(LineComment mComment,
			TTextAnnotation tText, CCMatch ccMatch) {
		LineCommentToTTextAnnotation mCommentToTText = PmFactory.eINSTANCE.createLineCommentToTTextAnnotation();
		mCommentToTText.setTarget(tText);
		mCommentToTText.setSource(mComment);
		ccMatch.getCreateCorr().add(mCommentToTText);
		return new Object[] { mComment, tText, mCommentToTText, ccMatch };
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

	public static final Object[] pattern_TextAnnotations_27_1_matchtggpattern_blackBB(LineComment mComment,
			MDefinition mMember) {
		if (mMember.getComments().contains(mComment)) {
			return new Object[] { mComment, mMember };
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
		TAnnotatable __DEC_tText_tAnnotation_269342 = tText.getTAnnotated();
		if (__DEC_tText_tAnnotation_269342 != null) {
			if (!tMember.equals(__DEC_tText_tAnnotation_269342)) {
				return new Object[] { tText, tMember };
			}
		}

		return null;
	}

	public static final Object[] pattern_TextAnnotations_28_1_matchtggpattern_blackBB(TMember tMember,
			TTextAnnotation tText) {
		if (tMember.equals(tText.getTAnnotated())) {
			if (pattern_TextAnnotations_28_1_matchtggpattern_black_nac_0BB(tText, tMember) == null) {
				return new Object[] { tMember, tText };
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
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
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
					TMember tMember = mMemberToTMember.getTarget();
					if (tMember != null) {
						BodyDeclaration tmpMMember = mMemberToTMember.getSource();
						if (tmpMMember instanceof MDefinition) {
							MDefinition mMember = (MDefinition) tmpMMember;
							if (pattern_TextAnnotations_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									mMemberToTMember) == null) {
								if (pattern_TextAnnotations_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										tMember) == null) {
									if (pattern_TextAnnotations_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											mMember) == null) {
										_result.add(new Object[] { mMemberToTMemberList, tMember, mMemberToTMember,
												mMember, ruleEntryContainer, ruleResult });
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
			IsApplicableMatch isApplicableMatch, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tMember, mMember, mMemberToTMember,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tMember, mMember, mMemberToTMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TextAnnotations_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TextAnnotations_29_3_solveCSP_bindingAndBlackFBBBBBB(TextAnnotations _this,
			IsApplicableMatch isApplicableMatch, TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TextAnnotations_29_3_solveCSP_binding = pattern_TextAnnotations_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, tMember, mMember, mMemberToTMember, ruleResult);
		if (result_pattern_TextAnnotations_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TextAnnotations_29_3_solveCSP_binding[0];

			Object[] result_pattern_TextAnnotations_29_3_solveCSP_black = pattern_TextAnnotations_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TextAnnotations_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tMember, mMember, mMemberToTMember, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TextAnnotations_29_4_checkCSP_expressionFBB(TextAnnotations _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TextAnnotations_29_5_checknacs_blackBBB(TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember) {
		return new Object[] { tMember, mMember, mMemberToTMember };
	}

	public static final Object[] pattern_TextAnnotations_29_6_perform_blackBBBB(TMember tMember, MDefinition mMember,
			MDefinitionToTMember mMemberToTMember, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tMember, mMember, mMemberToTMember, ruleResult };
	}

	public static final Object[] pattern_TextAnnotations_29_6_perform_greenBFBFFBB(TMember tMember, MDefinition mMember,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		LineComment mComment = JavaFactory.eINSTANCE.createLineComment();
		TTextAnnotation tText = AnnotationsFactory.eINSTANCE.createTTextAnnotation();
		LineCommentToTTextAnnotation mCommentToTText = PmFactory.eINSTANCE.createLineCommentToTTextAnnotation();
		boolean mComment_prefixOfParent_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("mComment", "content");
		Object _localVariable_1 = csp.getValue("tText", "text");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		mMember.getComments().add(mComment);
		ruleResult.getSourceObjects().add(mComment);
		tText.setTAnnotated(tMember);
		ruleResult.getTargetObjects().add(tText);
		mCommentToTText.setTarget(tText);
		mCommentToTText.setSource(mComment);
		ruleResult.getCorrObjects().add(mCommentToTText);
		mComment.setPrefixOfParent(Boolean.valueOf(mComment_prefixOfParent_prime));
		String mComment_content_prime = (String) _localVariable_0;
		String tText_text_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		mComment.setContent(mComment_content_prime);
		tText.setText(tText_text_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tMember, mComment, mMember, tText, mCommentToTText, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_TextAnnotations_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TextAnnotationsImpl
