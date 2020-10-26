/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.Expression;
import org.eclipse.modisco.java.StringLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.Expression2Comment;

import org.gravity.tgg.modisco.uml.Rules.JavaAnnotationValueEntry2Comment;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

import org.gravity.tgg.modisco.uml.UmlFactory;

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
import org.gravity.tgg.modisco.uml.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Java Annotation Value Entry2 Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JavaAnnotationValueEntry2CommentImpl extends AbstractRuleImpl implements JavaAnnotationValueEntry2Comment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaAnnotationValueEntry2CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getJavaAnnotationValueEntry2Comment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ArrayInitializer array, StringLiteral expr, Annotation annotation,
			AnnotationMemberValuePair value) {

		Object[] result1_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_0_1_initialbindings_blackBBBBBB(this, match, array, expr,
						annotation, value);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[array] = " + array + ", " + "[expr] = " + expr + ", "
					+ "[annotation] = " + annotation + ", " + "[value] = " + value + ".");
		}

		Object[] result2_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, array, expr,
						annotation, value);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[array] = " + array + ", " + "[expr] = " + expr + ", "
					+ "[annotation] = " + annotation + ", " + "[value] = " + value + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_0_4_collectelementstobetranslated_blackBBBBB(match, array,
							expr, annotation, value);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[array] = " + array + ", " + "[expr] = " + expr + ", " + "[annotation] = " + annotation
						+ ", " + "[value] = " + value + ".");
			}
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_0_4_collectelementstobetranslated_greenBBBF(match, array,
							expr);
			//nothing EMoflonEdge array__expr____expressions = (EMoflonEdge) result4_green[3];

			Object[] result5_black = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_0_5_collectcontextelements_blackBBBBB(match, array, expr,
							annotation, value);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[array] = " + array + ", " + "[expr] = " + expr + ", " + "[annotation] = " + annotation
						+ ", " + "[value] = " + value + ".");
			}
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_0_5_collectcontextelements_greenBBBBFF(match, array,
							annotation, value);
			//nothing EMoflonEdge value__array____value = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge annotation__value____values = (EMoflonEdge) result5_green[5];

			// 
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
							array, expr, annotation, value);
			return JavaAnnotationValueEntry2CommentImpl.pattern_JavaAnnotationValueEntry2Comment_0_7_expressionF();
		} else {
			return JavaAnnotationValueEntry2CommentImpl.pattern_JavaAnnotationValueEntry2Comment_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Comment comment = (Comment) result1_bindingAndBlack[0];
		ArrayInitializer array = (ArrayInitializer) result1_bindingAndBlack[1];
		ASTNode2Element t2c = (ASTNode2Element) result1_bindingAndBlack[2];
		StringLiteral expr = (StringLiteral) result1_bindingAndBlack[3];
		Annotation annotation = (Annotation) result1_bindingAndBlack[4];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result1_bindingAndBlack[5];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[6];
		Comment tag = (Comment) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_greenBFFBB(expr, tag, csp);
		Expression2Comment e2e = (Expression2Comment) result1_green[1];
		Comment entry = (Comment) result1_green[2];

		Object[] result2_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_2_collecttranslatedelements_blackBBB(expr, e2e, entry);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[expr] = " + expr + ", "
					+ "[e2e] = " + e2e + ", " + "[entry] = " + entry + ".");
		}
		Object[] result2_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_2_collecttranslatedelements_greenFBBB(expr, e2e, entry);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, comment,
						array, t2c, expr, e2e, annotation, entry, value, c2c, tag);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[comment] = " + comment + ", " + "[array] = " + array + ", " + "[t2c] = " + t2c + ", "
					+ "[expr] = " + expr + ", " + "[e2e] = " + e2e + ", " + "[annotation] = " + annotation + ", "
					+ "[entry] = " + entry + ", " + "[value] = " + value + ", " + "[c2c] = " + c2c + ", " + "[tag] = "
					+ tag + ".");
		}
		JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, array,
						expr, e2e, entry, tag);
		//nothing EMoflonEdge array__expr____expressions = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge e2e__expr____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge e2e__entry____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge entry__tag____annotatedElement = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tag__entry____ownedComment = (EMoflonEdge) result3_green[10];

		// 
		// 
		JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
						comment, array, t2c, expr, e2e, annotation, entry, value, c2c, tag);
		return JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ArrayInitializer array = (ArrayInitializer) result2_binding[0];
		StringLiteral expr = (StringLiteral) result2_binding[1];
		Annotation annotation = (Annotation) result2_binding[2];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_binding[3];
		for (Object[] result2_black : JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_2_2_corematch_blackFBFBBBFFB(array, expr, annotation, value,
						match)) {
			Comment comment = (Comment) result2_black[0];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[2];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[6];
			Comment tag = (Comment) result2_black[7];
			// ForEach 
			for (Object[] result3_black : JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_2_3_findcontext_blackBBBBBBBB(comment, array, t2c, expr,
							annotation, value, c2c, tag)) {
				Object[] result3_green = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(comment, array,
								t2c, expr, annotation, value, c2c, tag);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge array__expr____expressions = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge comment__tag____ownedComment = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge t2c__value____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge value__array____value = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge c2c__comment____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge c2c__annotation____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge t2c__tag____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge annotation__value____values = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, comment, array, t2c, expr, annotation, value, c2c, tag);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[comment] = " + comment + ", "
							+ "[array] = " + array + ", " + "[t2c] = " + t2c + ", " + "[expr] = " + expr + ", "
							+ "[annotation] = " + annotation + ", " + "[value] = " + value + ", " + "[c2c] = " + c2c
							+ ", " + "[tag] = " + tag + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ArrayInitializer array, StringLiteral expr,
			Annotation annotation, AnnotationMemberValuePair value) {
		match.registerObject("array", array);
		match.registerObject("expr", expr);
		match.registerObject("annotation", annotation);
		match.registerObject("value", value);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ArrayInitializer array, StringLiteral expr,
			Annotation annotation, AnnotationMemberValuePair value) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Comment comment, ArrayInitializer array,
			ASTNode2Element t2c, StringLiteral expr, Annotation annotation, AnnotationMemberValuePair value,
			ASTNode2Element c2c, Comment tag) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_expr_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("expr.escapedValue", true, csp);
		var_expr_escapedValue.setValue(expr.getEscapedValue());
		var_expr_escapedValue.setType("String");

		// Create unbound variables
		Variable var_entry_body = CSPFactoryHelper.eINSTANCE.createVariable("entry.body", csp);
		var_entry_body.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_entry_body, var_expr_escapedValue);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("comment", comment);
		isApplicableMatch.registerObject("array", array);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("expr", expr);
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("value", value);
		isApplicableMatch.registerObject("c2c", c2c);
		isApplicableMatch.registerObject("tag", tag);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject comment, EObject array, EObject t2c,
			EObject expr, EObject e2e, EObject annotation, EObject entry, EObject value, EObject c2c, EObject tag) {
		ruleresult.registerObject("comment", comment);
		ruleresult.registerObject("array", array);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("expr", expr);
		ruleresult.registerObject("e2e", e2e);
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("entry", entry);
		ruleresult.registerObject("value", value);
		ruleresult.registerObject("c2c", c2c);
		ruleresult.registerObject("tag", tag);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("expr").eClass())
				.equals("java.StringLiteral.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Comment comment, Comment entry, Comment tag) {

		Object[] result1_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_10_1_initialbindings_blackBBBBB(this, match, comment, entry,
						tag);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[comment] = " + comment + ", " + "[entry] = " + entry + ", "
					+ "[tag] = " + tag + ".");
		}

		Object[] result2_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, comment,
						entry, tag);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[comment] = " + comment + ", " + "[entry] = " + entry + ", "
					+ "[tag] = " + tag + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_10_4_collectelementstobetranslated_blackBBBB(match,
							comment, entry, tag);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[comment] = " + comment + ", " + "[entry] = " + entry + ", " + "[tag] = " + tag + ".");
			}
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_10_4_collectelementstobetranslated_greenBBBFF(match,
							entry, tag);
			//nothing EMoflonEdge entry__tag____annotatedElement = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tag__entry____ownedComment = (EMoflonEdge) result4_green[4];

			Object[] result5_black = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_10_5_collectcontextelements_blackBBBB(match, comment,
							entry, tag);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[comment] = " + comment + ", " + "[entry] = " + entry + ", " + "[tag] = " + tag + ".");
			}
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_10_5_collectcontextelements_greenBBBF(match, comment,
							tag);
			//nothing EMoflonEdge comment__tag____ownedComment = (EMoflonEdge) result5_green[3];

			// 
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							comment, entry, tag);
			return JavaAnnotationValueEntry2CommentImpl.pattern_JavaAnnotationValueEntry2Comment_10_7_expressionF();
		} else {
			return JavaAnnotationValueEntry2CommentImpl.pattern_JavaAnnotationValueEntry2Comment_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Comment comment = (Comment) result1_bindingAndBlack[0];
		ArrayInitializer array = (ArrayInitializer) result1_bindingAndBlack[1];
		ASTNode2Element t2c = (ASTNode2Element) result1_bindingAndBlack[2];
		Annotation annotation = (Annotation) result1_bindingAndBlack[3];
		Comment entry = (Comment) result1_bindingAndBlack[4];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result1_bindingAndBlack[5];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[6];
		Comment tag = (Comment) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_greenBFFBB(array, entry, csp);
		StringLiteral expr = (StringLiteral) result1_green[1];
		Expression2Comment e2e = (Expression2Comment) result1_green[2];

		Object[] result2_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_2_collecttranslatedelements_blackBBB(expr, e2e, entry);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[expr] = " + expr + ", "
					+ "[e2e] = " + e2e + ", " + "[entry] = " + entry + ".");
		}
		Object[] result2_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_2_collecttranslatedelements_greenFBBB(expr, e2e, entry);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, comment,
						array, t2c, expr, e2e, annotation, entry, value, c2c, tag);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[comment] = " + comment + ", " + "[array] = " + array + ", " + "[t2c] = " + t2c + ", "
					+ "[expr] = " + expr + ", " + "[e2e] = " + e2e + ", " + "[annotation] = " + annotation + ", "
					+ "[entry] = " + entry + ", " + "[value] = " + value + ", " + "[c2c] = " + c2c + ", " + "[tag] = "
					+ tag + ".");
		}
		JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, array,
						expr, e2e, entry, tag);
		//nothing EMoflonEdge array__expr____expressions = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge e2e__expr____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge e2e__entry____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge entry__tag____annotatedElement = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tag__entry____ownedComment = (EMoflonEdge) result3_green[10];

		// 
		// 
		JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
						comment, array, t2c, expr, e2e, annotation, entry, value, c2c, tag);
		return JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Comment comment = (Comment) result2_binding[0];
		Comment entry = (Comment) result2_binding[1];
		Comment tag = (Comment) result2_binding[2];
		for (Object[] result2_black : JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_12_2_corematch_blackBFFBFFBB(comment, entry, tag, match)) {
			ASTNode2Element t2c = (ASTNode2Element) result2_black[1];
			Annotation annotation = (Annotation) result2_black[2];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_black[4];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[5];
			// ForEach 
			for (Object[] result3_black : JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_12_3_findcontext_blackBFBBBBBB(comment, t2c, annotation,
							entry, value, c2c, tag)) {
				ArrayInitializer array = (ArrayInitializer) result3_black[1];
				Object[] result3_green = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_12_3_findcontext_greenBBBBBBBBFFFFFFFFFF(comment,
								array, t2c, annotation, entry, value, c2c, tag);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge comment__tag____ownedComment = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge t2c__value____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge value__array____value = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge c2c__comment____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge c2c__annotation____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge entry__tag____annotatedElement = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge t2c__tag____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tag__entry____ownedComment = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge annotation__value____values = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, comment, array, t2c, annotation, entry, value, c2c, tag);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[comment] = " + comment + ", "
							+ "[array] = " + array + ", " + "[t2c] = " + t2c + ", " + "[annotation] = " + annotation
							+ ", " + "[entry] = " + entry + ", " + "[value] = " + value + ", " + "[c2c] = " + c2c + ", "
							+ "[tag] = " + tag + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Comment comment, Comment entry, Comment tag) {
		match.registerObject("comment", comment);
		match.registerObject("entry", entry);
		match.registerObject("tag", tag);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Comment comment, Comment entry, Comment tag) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Comment comment, ArrayInitializer array,
			ASTNode2Element t2c, Annotation annotation, Comment entry, AnnotationMemberValuePair value,
			ASTNode2Element c2c, Comment tag) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_entry_body = CSPFactoryHelper.eINSTANCE.createVariable("entry.body", true, csp);
		var_entry_body.setValue(entry.getBody());
		var_entry_body.setType("String");

		// Create unbound variables
		Variable var_expr_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("expr.escapedValue", csp);
		var_expr_escapedValue.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_entry_body, var_expr_escapedValue);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("comment", comment);
		isApplicableMatch.registerObject("array", array);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("entry", entry);
		isApplicableMatch.registerObject("value", value);
		isApplicableMatch.registerObject("c2c", c2c);
		isApplicableMatch.registerObject("tag", tag);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject comment, EObject array, EObject t2c,
			EObject expr, EObject e2e, EObject annotation, EObject entry, EObject value, EObject c2c, EObject tag) {
		ruleresult.registerObject("comment", comment);
		ruleresult.registerObject("array", array);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("expr", expr);
		ruleresult.registerObject("e2e", e2e);
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("entry", entry);
		ruleresult.registerObject("value", value);
		ruleresult.registerObject("c2c", c2c);
		ruleresult.registerObject("tag", tag);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("entry").eClass()).equals("uml.Comment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_40(EMoflonEdge _edge_annotatedElement) {

		Object[] result1_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_blackFFFB(_edge_annotatedElement)) {
			Comment comment = (Comment) result2_black[0];
			Comment entry = (Comment) result2_black[1];
			Comment tag = (Comment) result2_black[2];
			Object[] result2_green = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, comment, entry, tag)) {
				// 
				if (JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_41(EMoflonEdge _edge_expressions) {

		Object[] result1_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_21_2_testcorematchandDECs_blackFFFFB(_edge_expressions)) {
			ArrayInitializer array = (ArrayInitializer) result2_black[0];
			StringLiteral expr = (StringLiteral) result2_black[1];
			Annotation annotation = (Annotation) result2_black[2];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_black[3];
			Object[] result2_green = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, array, expr, annotation, value)) {
				// 
				if (JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("JavaAnnotationValueEntry2Comment");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_entry_body = CSPFactoryHelper.eINSTANCE.createVariable("entry", true, csp);
		var_entry_body.setValue(__helper.getValue("entry", "body"));
		var_entry_body.setType("String");

		Variable var_expr_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("expr", true, csp);
		var_expr_escapedValue.setValue(__helper.getValue("expr", "escapedValue"));
		var_expr_escapedValue.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("JavaAnnotationValueEntry2Comment");
		eq0.solve(var_entry_body, var_expr_escapedValue);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_entry_body.setBound(false);
			eq0.solve(var_entry_body, var_expr_escapedValue);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("entry", "body", var_entry_body.getValue());
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
		ruleResult.setRule("JavaAnnotationValueEntry2Comment");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_entry_body = CSPFactoryHelper.eINSTANCE.createVariable("entry", true, csp);
		var_entry_body.setValue(__helper.getValue("entry", "body"));
		var_entry_body.setType("String");

		Variable var_expr_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("expr", true, csp);
		var_expr_escapedValue.setValue(__helper.getValue("expr", "escapedValue"));
		var_expr_escapedValue.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("JavaAnnotationValueEntry2Comment");
		eq0.solve(var_entry_body, var_expr_escapedValue);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_expr_escapedValue.setBound(false);
			eq0.solve(var_entry_body, var_expr_escapedValue);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("expr", "escapedValue", var_expr_escapedValue.getValue());
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

		Object[] result1_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Comment comment = (Comment) result2_bindingAndBlack[0];
		ArrayInitializer array = (ArrayInitializer) result2_bindingAndBlack[1];
		StringLiteral expr = (StringLiteral) result2_bindingAndBlack[2];
		Annotation annotation = (Annotation) result2_bindingAndBlack[3];
		Comment entry = (Comment) result2_bindingAndBlack[4];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_bindingAndBlack[5];
		Comment tag = (Comment) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, comment, array,
						expr, annotation, entry, value, tag, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[comment] = " + comment + ", " + "[array] = " + array + ", " + "[expr] = " + expr + ", "
					+ "[annotation] = " + annotation + ", " + "[entry] = " + entry + ", " + "[value] = " + value + ", "
					+ "[tag] = " + tag + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_24_5_matchcorrcontext_blackBFBBFBBB(comment, annotation,
							value, tag, sourceMatch, targetMatch)) {
				ASTNode2Element t2c = (ASTNode2Element) result5_black[1];
				ASTNode2Element c2c = (ASTNode2Element) result5_black[4];
				Object[] result5_green = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_24_5_matchcorrcontext_greenBBBBF(t2c, c2c,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_24_6_createcorrespondence_blackBBBBBBBB(comment,
								array, expr, annotation, entry, value, tag, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[comment] = " + comment
							+ ", " + "[array] = " + array + ", " + "[expr] = " + expr + ", " + "[annotation] = "
							+ annotation + ", " + "[entry] = " + entry + ", " + "[value] = " + value + ", " + "[tag] = "
							+ tag + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_24_6_createcorrespondence_greenBFBB(expr, entry,
								ccMatch);
				//nothing Expression2Comment e2e = (Expression2Comment) result6_green[1];

				Object[] result7_black = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return JavaAnnotationValueEntry2CommentImpl.pattern_JavaAnnotationValueEntry2Comment_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Comment comment, ArrayInitializer array, StringLiteral expr,
			Annotation annotation, Comment entry, AnnotationMemberValuePair value, Comment tag, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_entry_body = CSPFactoryHelper.eINSTANCE.createVariable("entry.body", true, csp);
		var_entry_body.setValue(entry.getBody());
		var_entry_body.setType("String");
		Variable var_expr_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("expr.escapedValue", true, csp);
		var_expr_escapedValue.setValue(expr.getEscapedValue());
		var_expr_escapedValue.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_entry_body, var_expr_escapedValue);
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
	public boolean checkDEC_FWD(ArrayInitializer array, StringLiteral expr, Annotation annotation,
			AnnotationMemberValuePair value) {// 
		Object[] result1_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_27_1_matchtggpattern_blackBBBB(array, expr, annotation,
						value);
		if (result1_black != null) {
			return JavaAnnotationValueEntry2CommentImpl.pattern_JavaAnnotationValueEntry2Comment_27_2_expressionF();
		} else {
			return JavaAnnotationValueEntry2CommentImpl.pattern_JavaAnnotationValueEntry2Comment_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Comment comment, Comment entry, Comment tag) {// 
		Object[] result1_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_28_1_matchtggpattern_blackBBB(comment, entry, tag);
		if (result1_black != null) {
			return JavaAnnotationValueEntry2CommentImpl.pattern_JavaAnnotationValueEntry2Comment_28_2_expressionF();
		} else {
			return JavaAnnotationValueEntry2CommentImpl.pattern_JavaAnnotationValueEntry2Comment_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element t2cParameter) {

		Object[] result1_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList t2cList = (RuleEntryList) result2_black[0];
			Comment comment = (Comment) result2_black[1];
			Comment tag = (Comment) result2_black[2];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[3];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_black[4];
			ArrayInitializer array = (ArrayInitializer) result2_black[5];
			Annotation annotation = (Annotation) result2_black[6];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[7];

			Object[] result3_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
							isApplicableMatch, comment, array, t2c, annotation, value, c2c, tag, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[comment] = " + comment + ", "
						+ "[array] = " + array + ", " + "[t2c] = " + t2c + ", " + "[annotation] = " + annotation + ", "
						+ "[value] = " + value + ", " + "[c2c] = " + c2c + ", " + "[tag] = " + tag + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_29_5_checknacs_blackBBBBBBB(comment, array, t2c,
								annotation, value, c2c, tag);
				if (result5_black != null) {

					Object[] result6_black = JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_29_6_perform_blackBBBBBBBB(comment, array, t2c,
									annotation, value, c2c, tag, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[comment] = "
								+ comment + ", " + "[array] = " + array + ", " + "[t2c] = " + t2c + ", "
								+ "[annotation] = " + annotation + ", " + "[value] = " + value + ", " + "[c2c] = " + c2c
								+ ", " + "[tag] = " + tag + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_29_6_perform_greenBFFFBBB(array, tag, ruleResult,
									csp);
					//nothing StringLiteral expr = (StringLiteral) result6_green[1];
					//nothing Expression2Comment e2e = (Expression2Comment) result6_green[2];
					//nothing Comment entry = (Comment) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Comment comment, ArrayInitializer array,
			ASTNode2Element t2c, Annotation annotation, AnnotationMemberValuePair value, ASTNode2Element c2c,
			Comment tag, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_entry_body = CSPFactoryHelper.eINSTANCE.createVariable("entry.body", csp);
		var_entry_body.setType("String");
		Variable var_expr_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("expr.escapedValue", csp);
		var_expr_escapedValue.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_entry_body, var_expr_escapedValue);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("comment", comment);
		isApplicableMatch.registerObject("array", array);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("value", value);
		isApplicableMatch.registerObject("c2c", c2c);
		isApplicableMatch.registerObject("tag", tag);
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
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_FWD__MATCH_ARRAYINITIALIZER_STRINGLITERAL_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR:
			return isAppropriate_FWD((Match) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(StringLiteral) arguments.get(2), (Annotation) arguments.get(3),
					(AnnotationMemberValuePair) arguments.get(4));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ARRAYINITIALIZER_STRINGLITERAL_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(StringLiteral) arguments.get(2), (Annotation) arguments.get(3),
					(AnnotationMemberValuePair) arguments.get(4));
			return null;
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ARRAYINITIALIZER_STRINGLITERAL_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(StringLiteral) arguments.get(2), (Annotation) arguments.get(3),
					(AnnotationMemberValuePair) arguments.get(4));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_COMMENT_ARRAYINITIALIZER_ASTNODE2ELEMENT_STRINGLITERAL_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ASTNODE2ELEMENT_COMMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Comment) arguments.get(1),
					(ArrayInitializer) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(StringLiteral) arguments.get(4), (Annotation) arguments.get(5),
					(AnnotationMemberValuePair) arguments.get(6), (ASTNode2Element) arguments.get(7),
					(Comment) arguments.get(8));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_BWD__MATCH_COMMENT_COMMENT_COMMENT:
			return isAppropriate_BWD((Match) arguments.get(0), (Comment) arguments.get(1), (Comment) arguments.get(2),
					(Comment) arguments.get(3));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMENT_COMMENT_COMMENT:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Comment) arguments.get(1), (Comment) arguments.get(2),
					(Comment) arguments.get(3));
			return null;
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMENT_COMMENT_COMMENT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Comment) arguments.get(1),
					(Comment) arguments.get(2), (Comment) arguments.get(3));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMENT_ARRAYINITIALIZER_ASTNODE2ELEMENT_ANNOTATION_COMMENT_ANNOTATIONMEMBERVALUEPAIR_ASTNODE2ELEMENT_COMMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Comment) arguments.get(1),
					(ArrayInitializer) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(Annotation) arguments.get(4), (Comment) arguments.get(5),
					(AnnotationMemberValuePair) arguments.get(6), (ASTNode2Element) arguments.get(7),
					(Comment) arguments.get(8));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_40__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_40((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_41__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_41((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_SOLVE_CSP_CC__COMMENT_ARRAYINITIALIZER_STRINGLITERAL_ANNOTATION_COMMENT_ANNOTATIONMEMBERVALUEPAIR_COMMENT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Comment) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(StringLiteral) arguments.get(2), (Annotation) arguments.get(3), (Comment) arguments.get(4),
					(AnnotationMemberValuePair) arguments.get(5), (Comment) arguments.get(6), (Match) arguments.get(7),
					(Match) arguments.get(8));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___CHECK_DEC_FWD__ARRAYINITIALIZER_STRINGLITERAL_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR:
			return checkDEC_FWD((ArrayInitializer) arguments.get(0), (StringLiteral) arguments.get(1),
					(Annotation) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___CHECK_DEC_BWD__COMMENT_COMMENT_COMMENT:
			return checkDEC_BWD((Comment) arguments.get(0), (Comment) arguments.get(1), (Comment) arguments.get(2));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_COMMENT_ARRAYINITIALIZER_ASTNODE2ELEMENT_ANNOTATION_ANNOTATIONMEMBERVALUEPAIR_ASTNODE2ELEMENT_COMMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Comment) arguments.get(1),
					(ArrayInitializer) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(Annotation) arguments.get(4), (AnnotationMemberValuePair) arguments.get(5),
					(ASTNode2Element) arguments.get(6), (Comment) arguments.get(7),
					(ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_1_initialbindings_blackBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, ArrayInitializer array, StringLiteral expr,
			Annotation annotation, AnnotationMemberValuePair value) {
		return new Object[] { _this, match, array, expr, annotation, value };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_bindingFBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, ArrayInitializer array, StringLiteral expr,
			Annotation annotation, AnnotationMemberValuePair value) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, array, expr, annotation, value);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, array, expr, annotation, value };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, ArrayInitializer array, StringLiteral expr,
			Annotation annotation, AnnotationMemberValuePair value) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_binding = pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, array, expr, annotation, value);
		if (result_pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_black = pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, array, expr, annotation, value };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_0_3_CheckCSP_expressionFBB(
			JavaAnnotationValueEntry2Comment _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, ArrayInitializer array, StringLiteral expr, Annotation annotation,
			AnnotationMemberValuePair value) {
		return new Object[] { match, array, expr, annotation, value };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_4_collectelementstobetranslated_greenBBBF(
			Match match, ArrayInitializer array, StringLiteral expr) {
		EMoflonEdge array__expr____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(expr);
		String array__expr____expressions_name_prime = "expressions";
		array__expr____expressions.setSrc(array);
		array__expr____expressions.setTrg(expr);
		match.getToBeTranslatedEdges().add(array__expr____expressions);
		array__expr____expressions.setName(array__expr____expressions_name_prime);
		return new Object[] { match, array, expr, array__expr____expressions };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_5_collectcontextelements_blackBBBBB(
			Match match, ArrayInitializer array, StringLiteral expr, Annotation annotation,
			AnnotationMemberValuePair value) {
		return new Object[] { match, array, expr, annotation, value };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_5_collectcontextelements_greenBBBBFF(
			Match match, ArrayInitializer array, Annotation annotation, AnnotationMemberValuePair value) {
		EMoflonEdge value__array____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(array);
		match.getContextNodes().add(annotation);
		match.getContextNodes().add(value);
		String value__array____value_name_prime = "value";
		String annotation__value____values_name_prime = "values";
		value__array____value.setSrc(value);
		value__array____value.setTrg(array);
		match.getContextEdges().add(value__array____value);
		annotation__value____values.setSrc(annotation);
		annotation__value____values.setTrg(value);
		match.getContextEdges().add(annotation__value____values);
		value__array____value.setName(value__array____value_name_prime);
		annotation__value____values.setName(annotation__value____values_name_prime);
		return new Object[] { match, array, annotation, value, value__array____value, annotation__value____values };
	}

	public static final void pattern_JavaAnnotationValueEntry2Comment_0_6_registerobjectstomatch_expressionBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, ArrayInitializer array, StringLiteral expr,
			Annotation annotation, AnnotationMemberValuePair value) {
		_this.registerObjectsToMatch_FWD(match, array, expr, annotation, value);

	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("comment");
		EObject _localVariable_1 = isApplicableMatch.getObject("array");
		EObject _localVariable_2 = isApplicableMatch.getObject("t2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("expr");
		EObject _localVariable_4 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_5 = isApplicableMatch.getObject("value");
		EObject _localVariable_6 = isApplicableMatch.getObject("c2c");
		EObject _localVariable_7 = isApplicableMatch.getObject("tag");
		EObject tmpComment = _localVariable_0;
		EObject tmpArray = _localVariable_1;
		EObject tmpT2c = _localVariable_2;
		EObject tmpExpr = _localVariable_3;
		EObject tmpAnnotation = _localVariable_4;
		EObject tmpValue = _localVariable_5;
		EObject tmpC2c = _localVariable_6;
		EObject tmpTag = _localVariable_7;
		if (tmpComment instanceof Comment) {
			Comment comment = (Comment) tmpComment;
			if (tmpArray instanceof ArrayInitializer) {
				ArrayInitializer array = (ArrayInitializer) tmpArray;
				if (tmpT2c instanceof ASTNode2Element) {
					ASTNode2Element t2c = (ASTNode2Element) tmpT2c;
					if (tmpExpr instanceof StringLiteral) {
						StringLiteral expr = (StringLiteral) tmpExpr;
						if (tmpAnnotation instanceof Annotation) {
							Annotation annotation = (Annotation) tmpAnnotation;
							if (tmpValue instanceof AnnotationMemberValuePair) {
								AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
								if (tmpC2c instanceof ASTNode2Element) {
									ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
									if (tmpTag instanceof Comment) {
										Comment tag = (Comment) tmpTag;
										return new Object[] { comment, array, t2c, expr, annotation, value, c2c, tag,
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_blackBBBBBBBBFBB(
			Comment comment, ArrayInitializer array, ASTNode2Element t2c, StringLiteral expr, Annotation annotation,
			AnnotationMemberValuePair value, ASTNode2Element c2c, Comment tag, JavaAnnotationValueEntry2Comment _this,
			IsApplicableMatch isApplicableMatch) {
		if (!comment.equals(tag)) {
			if (!c2c.equals(t2c)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { comment, array, t2c, expr, annotation, value, c2c, tag, csp, _this,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding = pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding != null) {
			Comment comment = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[0];
			ArrayInitializer array = (ArrayInitializer) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[1];
			ASTNode2Element t2c = (ASTNode2Element) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[2];
			StringLiteral expr = (StringLiteral) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[3];
			Annotation annotation = (Annotation) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[4];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[5];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[6];
			Comment tag = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[7];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_black = pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_blackBBBBBBBBFBB(
					comment, array, t2c, expr, annotation, value, c2c, tag, _this, isApplicableMatch);
			if (result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_black[8];

				return new Object[] { comment, array, t2c, expr, annotation, value, c2c, tag, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_greenBFFBB(
			StringLiteral expr, Comment tag, CSP csp) {
		Expression2Comment e2e = UmlFactory.eINSTANCE.createExpression2Comment();
		Comment entry = UMLFactory.eINSTANCE.createComment();
		Object _localVariable_0 = csp.getValue("entry", "body");
		e2e.setSource(expr);
		e2e.setTarget(entry);
		entry.getAnnotatedElements().add(tag);
		tag.getOwnedComments().add(entry);
		String entry_body_prime = (String) _localVariable_0;
		entry.setBody(entry_body_prime);
		return new Object[] { expr, e2e, entry, tag, csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_2_collecttranslatedelements_blackBBB(
			StringLiteral expr, Expression2Comment e2e, Comment entry) {
		return new Object[] { expr, e2e, entry };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_2_collecttranslatedelements_greenFBBB(
			StringLiteral expr, Expression2Comment e2e, Comment entry) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(expr);
		ruleresult.getCreatedLinkElements().add(e2e);
		ruleresult.getCreatedElements().add(entry);
		return new Object[] { ruleresult, expr, e2e, entry };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject comment, EObject array, EObject t2c, EObject expr, EObject e2e,
			EObject annotation, EObject entry, EObject value, EObject c2c, EObject tag) {
		if (!comment.equals(t2c)) {
			if (!comment.equals(expr)) {
				if (!comment.equals(e2e)) {
					if (!comment.equals(entry)) {
						if (!comment.equals(value)) {
							if (!comment.equals(tag)) {
								if (!array.equals(comment)) {
									if (!array.equals(t2c)) {
										if (!array.equals(expr)) {
											if (!array.equals(e2e)) {
												if (!array.equals(entry)) {
													if (!array.equals(value)) {
														if (!array.equals(c2c)) {
															if (!array.equals(tag)) {
																if (!t2c.equals(value)) {
																	if (!t2c.equals(tag)) {
																		if (!expr.equals(t2c)) {
																			if (!expr.equals(value)) {
																				if (!expr.equals(tag)) {
																					if (!e2e.equals(t2c)) {
																						if (!e2e.equals(expr)) {
																							if (!e2e.equals(entry)) {
																								if (!e2e.equals(
																										value)) {
																									if (!e2e.equals(
																											tag)) {
																										if (!annotation
																												.equals(comment)) {
																											if (!annotation
																													.equals(array)) {
																												if (!annotation
																														.equals(t2c)) {
																													if (!annotation
																															.equals(expr)) {
																														if (!annotation
																																.equals(e2e)) {
																															if (!annotation
																																	.equals(entry)) {
																																if (!annotation
																																		.equals(value)) {
																																	if (!annotation
																																			.equals(c2c)) {
																																		if (!annotation
																																				.equals(tag)) {
																																			if (!entry
																																					.equals(t2c)) {
																																				if (!entry
																																						.equals(expr)) {
																																					if (!entry
																																							.equals(value)) {
																																						if (!entry
																																								.equals(tag)) {
																																							if (!c2c.equals(
																																									comment)) {
																																								if (!c2c.equals(
																																										t2c)) {
																																									if (!c2c.equals(
																																											expr)) {
																																										if (!c2c.equals(
																																												e2e)) {
																																											if (!c2c.equals(
																																													entry)) {
																																												if (!c2c.equals(
																																														value)) {
																																													if (!c2c.equals(
																																															tag)) {
																																														if (!tag.equals(
																																																value)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	comment,
																																																	array,
																																																	t2c,
																																																	expr,
																																																	e2e,
																																																	annotation,
																																																	entry,
																																																	value,
																																																	c2c,
																																																	tag };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject array, EObject expr, EObject e2e, EObject entry, EObject tag) {
		EMoflonEdge array__expr____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge e2e__expr____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge e2e__entry____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge entry__tag____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tag__entry____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaAnnotationValueEntry2Comment";
		String array__expr____expressions_name_prime = "expressions";
		String e2e__expr____source_name_prime = "source";
		String e2e__entry____target_name_prime = "target";
		String entry__tag____annotatedElement_name_prime = "annotatedElement";
		String tag__entry____ownedComment_name_prime = "ownedComment";
		array__expr____expressions.setSrc(array);
		array__expr____expressions.setTrg(expr);
		ruleresult.getTranslatedEdges().add(array__expr____expressions);
		e2e__expr____source.setSrc(e2e);
		e2e__expr____source.setTrg(expr);
		ruleresult.getCreatedEdges().add(e2e__expr____source);
		e2e__entry____target.setSrc(e2e);
		e2e__entry____target.setTrg(entry);
		ruleresult.getCreatedEdges().add(e2e__entry____target);
		entry__tag____annotatedElement.setSrc(entry);
		entry__tag____annotatedElement.setTrg(tag);
		ruleresult.getCreatedEdges().add(entry__tag____annotatedElement);
		tag__entry____ownedComment.setSrc(tag);
		tag__entry____ownedComment.setTrg(entry);
		ruleresult.getCreatedEdges().add(tag__entry____ownedComment);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		array__expr____expressions.setName(array__expr____expressions_name_prime);
		e2e__expr____source.setName(e2e__expr____source_name_prime);
		e2e__entry____target.setName(e2e__entry____target_name_prime);
		entry__tag____annotatedElement.setName(entry__tag____annotatedElement_name_prime);
		tag__entry____ownedComment.setName(tag__entry____ownedComment_name_prime);
		return new Object[] { ruleresult, array, expr, e2e, entry, tag, array__expr____expressions, e2e__expr____source,
				e2e__entry____target, entry__tag____annotatedElement, tag__entry____ownedComment };
	}

	public static final void pattern_JavaAnnotationValueEntry2Comment_1_5_registerobjects_expressionBBBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, PerformRuleResult ruleresult, EObject comment, EObject array,
			EObject t2c, EObject expr, EObject e2e, EObject annotation, EObject entry, EObject value, EObject c2c,
			EObject tag) {
		_this.registerObjects_FWD(ruleresult, comment, array, t2c, expr, e2e, annotation, entry, value, c2c, tag);

	}

	public static final PerformRuleResult pattern_JavaAnnotationValueEntry2Comment_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_bindingFB(
			JavaAnnotationValueEntry2Comment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_blackFBB(EClass eClass,
			JavaAnnotationValueEntry2Comment _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_bindingAndBlackFFB(
			JavaAnnotationValueEntry2Comment _this) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_binding = pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_black = pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaAnnotationValueEntry2Comment";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("array");
		EObject _localVariable_1 = match.getObject("expr");
		EObject _localVariable_2 = match.getObject("annotation");
		EObject _localVariable_3 = match.getObject("value");
		EObject tmpArray = _localVariable_0;
		EObject tmpExpr = _localVariable_1;
		EObject tmpAnnotation = _localVariable_2;
		EObject tmpValue = _localVariable_3;
		if (tmpArray instanceof ArrayInitializer) {
			ArrayInitializer array = (ArrayInitializer) tmpArray;
			if (tmpExpr instanceof StringLiteral) {
				StringLiteral expr = (StringLiteral) tmpExpr;
				if (tmpAnnotation instanceof Annotation) {
					Annotation annotation = (Annotation) tmpAnnotation;
					if (tmpValue instanceof AnnotationMemberValuePair) {
						AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
						return new Object[] { array, expr, annotation, value, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_2_2_corematch_blackFBFBBBFFB(
			ArrayInitializer array, StringLiteral expr, Annotation annotation, AnnotationMemberValuePair value,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element t2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(value,
				ASTNode2Element.class, "source")) {
			Element tmpTag = t2c.getTarget();
			if (tmpTag instanceof Comment) {
				Comment tag = (Comment) tmpTag;
				for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(annotation, ASTNode2Element.class, "source")) {
					if (!c2c.equals(t2c)) {
						Element tmpComment = c2c.getTarget();
						if (tmpComment instanceof Comment) {
							Comment comment = (Comment) tmpComment;
							if (!comment.equals(tag)) {
								_result.add(
										new Object[] { comment, array, t2c, expr, annotation, value, c2c, tag, match });
							}
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_2_3_findcontext_blackBBBBBBBB(
			Comment comment, ArrayInitializer array, ASTNode2Element t2c, StringLiteral expr, Annotation annotation,
			AnnotationMemberValuePair value, ASTNode2Element c2c, Comment tag) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!comment.equals(tag)) {
			if (!c2c.equals(t2c)) {
				if (array.getExpressions().contains(expr)) {
					if (comment.getOwnedComments().contains(tag)) {
						if (value.equals(t2c.getSource())) {
							if (array.equals(value.getValue())) {
								if (comment.equals(c2c.getTarget())) {
									if (annotation.equals(c2c.getSource())) {
										if (tag.equals(t2c.getTarget())) {
											if (annotation.getValues().contains(value)) {
												_result.add(new Object[] { comment, array, t2c, expr, annotation, value,
														c2c, tag });
											}
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(
			Comment comment, ArrayInitializer array, ASTNode2Element t2c, StringLiteral expr, Annotation annotation,
			AnnotationMemberValuePair value, ASTNode2Element c2c, Comment tag) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge array__expr____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__tag____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__value____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__array____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__comment____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__tag____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String array__expr____expressions_name_prime = "expressions";
		String comment__tag____ownedComment_name_prime = "ownedComment";
		String t2c__value____source_name_prime = "source";
		String value__array____value_name_prime = "value";
		String c2c__comment____target_name_prime = "target";
		String c2c__annotation____source_name_prime = "source";
		String t2c__tag____target_name_prime = "target";
		String annotation__value____values_name_prime = "values";
		isApplicableMatch.getAllContextElements().add(comment);
		isApplicableMatch.getAllContextElements().add(array);
		isApplicableMatch.getAllContextElements().add(t2c);
		isApplicableMatch.getAllContextElements().add(expr);
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(value);
		isApplicableMatch.getAllContextElements().add(c2c);
		isApplicableMatch.getAllContextElements().add(tag);
		array__expr____expressions.setSrc(array);
		array__expr____expressions.setTrg(expr);
		isApplicableMatch.getAllContextElements().add(array__expr____expressions);
		comment__tag____ownedComment.setSrc(comment);
		comment__tag____ownedComment.setTrg(tag);
		isApplicableMatch.getAllContextElements().add(comment__tag____ownedComment);
		t2c__value____source.setSrc(t2c);
		t2c__value____source.setTrg(value);
		isApplicableMatch.getAllContextElements().add(t2c__value____source);
		value__array____value.setSrc(value);
		value__array____value.setTrg(array);
		isApplicableMatch.getAllContextElements().add(value__array____value);
		c2c__comment____target.setSrc(c2c);
		c2c__comment____target.setTrg(comment);
		isApplicableMatch.getAllContextElements().add(c2c__comment____target);
		c2c__annotation____source.setSrc(c2c);
		c2c__annotation____source.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(c2c__annotation____source);
		t2c__tag____target.setSrc(t2c);
		t2c__tag____target.setTrg(tag);
		isApplicableMatch.getAllContextElements().add(t2c__tag____target);
		annotation__value____values.setSrc(annotation);
		annotation__value____values.setTrg(value);
		isApplicableMatch.getAllContextElements().add(annotation__value____values);
		array__expr____expressions.setName(array__expr____expressions_name_prime);
		comment__tag____ownedComment.setName(comment__tag____ownedComment_name_prime);
		t2c__value____source.setName(t2c__value____source_name_prime);
		value__array____value.setName(value__array____value_name_prime);
		c2c__comment____target.setName(c2c__comment____target_name_prime);
		c2c__annotation____source.setName(c2c__annotation____source_name_prime);
		t2c__tag____target.setName(t2c__tag____target_name_prime);
		annotation__value____values.setName(annotation__value____values_name_prime);
		return new Object[] { comment, array, t2c, expr, annotation, value, c2c, tag, isApplicableMatch,
				array__expr____expressions, comment__tag____ownedComment, t2c__value____source, value__array____value,
				c2c__comment____target, c2c__annotation____source, t2c__tag____target, annotation__value____values };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_bindingFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Comment comment,
			ArrayInitializer array, ASTNode2Element t2c, StringLiteral expr, Annotation annotation,
			AnnotationMemberValuePair value, ASTNode2Element c2c, Comment tag) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, comment, array, t2c, expr, annotation,
				value, c2c, tag);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, comment, array, t2c, expr, annotation, value, c2c,
					tag };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Comment comment,
			ArrayInitializer array, ASTNode2Element t2c, StringLiteral expr, Annotation annotation,
			AnnotationMemberValuePair value, ASTNode2Element c2c, Comment tag) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_binding = pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, comment, array, t2c, expr, annotation, value, c2c, tag);
		if (result_pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_black = pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, comment, array, t2c, expr, annotation, value, c2c,
						tag };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_2_5_checkCSP_expressionFBB(
			JavaAnnotationValueEntry2Comment _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaAnnotationValueEntry2Comment";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaAnnotationValueEntry2Comment_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_1_initialbindings_blackBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Comment comment, Comment entry, Comment tag) {
		if (!comment.equals(entry)) {
			if (!comment.equals(tag)) {
				if (!entry.equals(tag)) {
					return new Object[] { _this, match, comment, entry, tag };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_bindingFBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Comment comment, Comment entry, Comment tag) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, comment, entry, tag);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, comment, entry, tag };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_bindingAndBlackFBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Comment comment, Comment entry, Comment tag) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_binding = pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_bindingFBBBBB(
				_this, match, comment, entry, tag);
		if (result_pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_black = pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, comment, entry, tag };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_10_3_CheckCSP_expressionFBB(
			JavaAnnotationValueEntry2Comment _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Comment comment, Comment entry, Comment tag) {
		if (!comment.equals(entry)) {
			if (!comment.equals(tag)) {
				if (!entry.equals(tag)) {
					return new Object[] { match, comment, entry, tag };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Comment entry, Comment tag) {
		EMoflonEdge entry__tag____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tag__entry____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(entry);
		String entry__tag____annotatedElement_name_prime = "annotatedElement";
		String tag__entry____ownedComment_name_prime = "ownedComment";
		entry__tag____annotatedElement.setSrc(entry);
		entry__tag____annotatedElement.setTrg(tag);
		match.getToBeTranslatedEdges().add(entry__tag____annotatedElement);
		tag__entry____ownedComment.setSrc(tag);
		tag__entry____ownedComment.setTrg(entry);
		match.getToBeTranslatedEdges().add(tag__entry____ownedComment);
		entry__tag____annotatedElement.setName(entry__tag____annotatedElement_name_prime);
		tag__entry____ownedComment.setName(tag__entry____ownedComment_name_prime);
		return new Object[] { match, entry, tag, entry__tag____annotatedElement, tag__entry____ownedComment };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_5_collectcontextelements_blackBBBB(
			Match match, Comment comment, Comment entry, Comment tag) {
		if (!comment.equals(entry)) {
			if (!comment.equals(tag)) {
				if (!entry.equals(tag)) {
					return new Object[] { match, comment, entry, tag };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_5_collectcontextelements_greenBBBF(
			Match match, Comment comment, Comment tag) {
		EMoflonEdge comment__tag____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(comment);
		match.getContextNodes().add(tag);
		String comment__tag____ownedComment_name_prime = "ownedComment";
		comment__tag____ownedComment.setSrc(comment);
		comment__tag____ownedComment.setTrg(tag);
		match.getContextEdges().add(comment__tag____ownedComment);
		comment__tag____ownedComment.setName(comment__tag____ownedComment_name_prime);
		return new Object[] { match, comment, tag, comment__tag____ownedComment };
	}

	public static final void pattern_JavaAnnotationValueEntry2Comment_10_6_registerobjectstomatch_expressionBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Comment comment, Comment entry, Comment tag) {
		_this.registerObjectsToMatch_BWD(match, comment, entry, tag);

	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("comment");
		EObject _localVariable_1 = isApplicableMatch.getObject("array");
		EObject _localVariable_2 = isApplicableMatch.getObject("t2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_4 = isApplicableMatch.getObject("entry");
		EObject _localVariable_5 = isApplicableMatch.getObject("value");
		EObject _localVariable_6 = isApplicableMatch.getObject("c2c");
		EObject _localVariable_7 = isApplicableMatch.getObject("tag");
		EObject tmpComment = _localVariable_0;
		EObject tmpArray = _localVariable_1;
		EObject tmpT2c = _localVariable_2;
		EObject tmpAnnotation = _localVariable_3;
		EObject tmpEntry = _localVariable_4;
		EObject tmpValue = _localVariable_5;
		EObject tmpC2c = _localVariable_6;
		EObject tmpTag = _localVariable_7;
		if (tmpComment instanceof Comment) {
			Comment comment = (Comment) tmpComment;
			if (tmpArray instanceof ArrayInitializer) {
				ArrayInitializer array = (ArrayInitializer) tmpArray;
				if (tmpT2c instanceof ASTNode2Element) {
					ASTNode2Element t2c = (ASTNode2Element) tmpT2c;
					if (tmpAnnotation instanceof Annotation) {
						Annotation annotation = (Annotation) tmpAnnotation;
						if (tmpEntry instanceof Comment) {
							Comment entry = (Comment) tmpEntry;
							if (tmpValue instanceof AnnotationMemberValuePair) {
								AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
								if (tmpC2c instanceof ASTNode2Element) {
									ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
									if (tmpTag instanceof Comment) {
										Comment tag = (Comment) tmpTag;
										return new Object[] { comment, array, t2c, annotation, entry, value, c2c, tag,
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_blackBBBBBBBBFBB(
			Comment comment, ArrayInitializer array, ASTNode2Element t2c, Annotation annotation, Comment entry,
			AnnotationMemberValuePair value, ASTNode2Element c2c, Comment tag, JavaAnnotationValueEntry2Comment _this,
			IsApplicableMatch isApplicableMatch) {
		if (!comment.equals(entry)) {
			if (!comment.equals(tag)) {
				if (!entry.equals(tag)) {
					if (!c2c.equals(t2c)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { comment, array, t2c, annotation, entry, value, c2c, tag, csp,
										_this, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding = pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding != null) {
			Comment comment = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[0];
			ArrayInitializer array = (ArrayInitializer) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[1];
			ASTNode2Element t2c = (ASTNode2Element) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[2];
			Annotation annotation = (Annotation) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[3];
			Comment entry = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[4];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[5];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[6];
			Comment tag = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[7];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_black = pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_blackBBBBBBBBFBB(
					comment, array, t2c, annotation, entry, value, c2c, tag, _this, isApplicableMatch);
			if (result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_black[8];

				return new Object[] { comment, array, t2c, annotation, entry, value, c2c, tag, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_greenBFFBB(
			ArrayInitializer array, Comment entry, CSP csp) {
		StringLiteral expr = JavaFactory.eINSTANCE.createStringLiteral();
		Expression2Comment e2e = UmlFactory.eINSTANCE.createExpression2Comment();
		Object _localVariable_0 = csp.getValue("expr", "escapedValue");
		array.getExpressions().add(expr);
		e2e.setSource(expr);
		e2e.setTarget(entry);
		String expr_escapedValue_prime = (String) _localVariable_0;
		expr.setEscapedValue(expr_escapedValue_prime);
		return new Object[] { array, expr, e2e, entry, csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_2_collecttranslatedelements_blackBBB(
			StringLiteral expr, Expression2Comment e2e, Comment entry) {
		return new Object[] { expr, e2e, entry };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_2_collecttranslatedelements_greenFBBB(
			StringLiteral expr, Expression2Comment e2e, Comment entry) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(expr);
		ruleresult.getCreatedLinkElements().add(e2e);
		ruleresult.getTranslatedElements().add(entry);
		return new Object[] { ruleresult, expr, e2e, entry };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject comment, EObject array, EObject t2c, EObject expr, EObject e2e,
			EObject annotation, EObject entry, EObject value, EObject c2c, EObject tag) {
		if (!comment.equals(t2c)) {
			if (!comment.equals(expr)) {
				if (!comment.equals(e2e)) {
					if (!comment.equals(entry)) {
						if (!comment.equals(value)) {
							if (!comment.equals(tag)) {
								if (!array.equals(comment)) {
									if (!array.equals(t2c)) {
										if (!array.equals(expr)) {
											if (!array.equals(e2e)) {
												if (!array.equals(entry)) {
													if (!array.equals(value)) {
														if (!array.equals(c2c)) {
															if (!array.equals(tag)) {
																if (!t2c.equals(value)) {
																	if (!t2c.equals(tag)) {
																		if (!expr.equals(t2c)) {
																			if (!expr.equals(value)) {
																				if (!expr.equals(tag)) {
																					if (!e2e.equals(t2c)) {
																						if (!e2e.equals(expr)) {
																							if (!e2e.equals(entry)) {
																								if (!e2e.equals(
																										value)) {
																									if (!e2e.equals(
																											tag)) {
																										if (!annotation
																												.equals(comment)) {
																											if (!annotation
																													.equals(array)) {
																												if (!annotation
																														.equals(t2c)) {
																													if (!annotation
																															.equals(expr)) {
																														if (!annotation
																																.equals(e2e)) {
																															if (!annotation
																																	.equals(entry)) {
																																if (!annotation
																																		.equals(value)) {
																																	if (!annotation
																																			.equals(c2c)) {
																																		if (!annotation
																																				.equals(tag)) {
																																			if (!entry
																																					.equals(t2c)) {
																																				if (!entry
																																						.equals(expr)) {
																																					if (!entry
																																							.equals(value)) {
																																						if (!entry
																																								.equals(tag)) {
																																							if (!c2c.equals(
																																									comment)) {
																																								if (!c2c.equals(
																																										t2c)) {
																																									if (!c2c.equals(
																																											expr)) {
																																										if (!c2c.equals(
																																												e2e)) {
																																											if (!c2c.equals(
																																													entry)) {
																																												if (!c2c.equals(
																																														value)) {
																																													if (!c2c.equals(
																																															tag)) {
																																														if (!tag.equals(
																																																value)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	comment,
																																																	array,
																																																	t2c,
																																																	expr,
																																																	e2e,
																																																	annotation,
																																																	entry,
																																																	value,
																																																	c2c,
																																																	tag };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject array, EObject expr, EObject e2e, EObject entry, EObject tag) {
		EMoflonEdge array__expr____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge e2e__expr____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge e2e__entry____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge entry__tag____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tag__entry____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaAnnotationValueEntry2Comment";
		String array__expr____expressions_name_prime = "expressions";
		String e2e__expr____source_name_prime = "source";
		String e2e__entry____target_name_prime = "target";
		String entry__tag____annotatedElement_name_prime = "annotatedElement";
		String tag__entry____ownedComment_name_prime = "ownedComment";
		array__expr____expressions.setSrc(array);
		array__expr____expressions.setTrg(expr);
		ruleresult.getCreatedEdges().add(array__expr____expressions);
		e2e__expr____source.setSrc(e2e);
		e2e__expr____source.setTrg(expr);
		ruleresult.getCreatedEdges().add(e2e__expr____source);
		e2e__entry____target.setSrc(e2e);
		e2e__entry____target.setTrg(entry);
		ruleresult.getCreatedEdges().add(e2e__entry____target);
		entry__tag____annotatedElement.setSrc(entry);
		entry__tag____annotatedElement.setTrg(tag);
		ruleresult.getTranslatedEdges().add(entry__tag____annotatedElement);
		tag__entry____ownedComment.setSrc(tag);
		tag__entry____ownedComment.setTrg(entry);
		ruleresult.getTranslatedEdges().add(tag__entry____ownedComment);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		array__expr____expressions.setName(array__expr____expressions_name_prime);
		e2e__expr____source.setName(e2e__expr____source_name_prime);
		e2e__entry____target.setName(e2e__entry____target_name_prime);
		entry__tag____annotatedElement.setName(entry__tag____annotatedElement_name_prime);
		tag__entry____ownedComment.setName(tag__entry____ownedComment_name_prime);
		return new Object[] { ruleresult, array, expr, e2e, entry, tag, array__expr____expressions, e2e__expr____source,
				e2e__entry____target, entry__tag____annotatedElement, tag__entry____ownedComment };
	}

	public static final void pattern_JavaAnnotationValueEntry2Comment_11_5_registerobjects_expressionBBBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, PerformRuleResult ruleresult, EObject comment, EObject array,
			EObject t2c, EObject expr, EObject e2e, EObject annotation, EObject entry, EObject value, EObject c2c,
			EObject tag) {
		_this.registerObjects_BWD(ruleresult, comment, array, t2c, expr, e2e, annotation, entry, value, c2c, tag);

	}

	public static final PerformRuleResult pattern_JavaAnnotationValueEntry2Comment_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_bindingFB(
			JavaAnnotationValueEntry2Comment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_blackFBB(
			EClass eClass, JavaAnnotationValueEntry2Comment _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_bindingAndBlackFFB(
			JavaAnnotationValueEntry2Comment _this) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_binding = pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_black = pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaAnnotationValueEntry2Comment";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("comment");
		EObject _localVariable_1 = match.getObject("entry");
		EObject _localVariable_2 = match.getObject("tag");
		EObject tmpComment = _localVariable_0;
		EObject tmpEntry = _localVariable_1;
		EObject tmpTag = _localVariable_2;
		if (tmpComment instanceof Comment) {
			Comment comment = (Comment) tmpComment;
			if (tmpEntry instanceof Comment) {
				Comment entry = (Comment) tmpEntry;
				if (tmpTag instanceof Comment) {
					Comment tag = (Comment) tmpTag;
					return new Object[] { comment, entry, tag, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_12_2_corematch_blackBFFBFFBB(
			Comment comment, Comment entry, Comment tag, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!comment.equals(entry)) {
			if (!comment.equals(tag)) {
				if (!entry.equals(tag)) {
					for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(comment, ASTNode2Element.class, "target")) {
						ASTNode tmpAnnotation = c2c.getSource();
						if (tmpAnnotation instanceof Annotation) {
							Annotation annotation = (Annotation) tmpAnnotation;
							for (ASTNode2Element t2c : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tag, ASTNode2Element.class, "target")) {
								if (!c2c.equals(t2c)) {
									ASTNode tmpValue = t2c.getSource();
									if (tmpValue instanceof AnnotationMemberValuePair) {
										AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
										_result.add(new Object[] { comment, t2c, annotation, entry, value, c2c, tag,
												match });
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

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_12_3_findcontext_blackBFBBBBBB(
			Comment comment, ASTNode2Element t2c, Annotation annotation, Comment entry, AnnotationMemberValuePair value,
			ASTNode2Element c2c, Comment tag) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!comment.equals(entry)) {
			if (!comment.equals(tag)) {
				if (!entry.equals(tag)) {
					if (!c2c.equals(t2c)) {
						if (comment.getOwnedComments().contains(tag)) {
							if (value.equals(t2c.getSource())) {
								if (comment.equals(c2c.getTarget())) {
									if (annotation.equals(c2c.getSource())) {
										if (entry.getAnnotatedElements().contains(tag)) {
											if (tag.equals(t2c.getTarget())) {
												if (tag.getOwnedComments().contains(entry)) {
													if (annotation.getValues().contains(value)) {
														Expression tmpArray = value.getValue();
														if (tmpArray instanceof ArrayInitializer) {
															ArrayInitializer array = (ArrayInitializer) tmpArray;
															_result.add(new Object[] { comment, array, t2c, annotation,
																	entry, value, c2c, tag });
														}

													}
												}
											}
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_3_findcontext_greenBBBBBBBBFFFFFFFFFF(
			Comment comment, ArrayInitializer array, ASTNode2Element t2c, Annotation annotation, Comment entry,
			AnnotationMemberValuePair value, ASTNode2Element c2c, Comment tag) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge comment__tag____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__value____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__array____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__comment____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge entry__tag____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__tag____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tag__entry____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String comment__tag____ownedComment_name_prime = "ownedComment";
		String t2c__value____source_name_prime = "source";
		String value__array____value_name_prime = "value";
		String c2c__comment____target_name_prime = "target";
		String c2c__annotation____source_name_prime = "source";
		String entry__tag____annotatedElement_name_prime = "annotatedElement";
		String t2c__tag____target_name_prime = "target";
		String tag__entry____ownedComment_name_prime = "ownedComment";
		String annotation__value____values_name_prime = "values";
		isApplicableMatch.getAllContextElements().add(comment);
		isApplicableMatch.getAllContextElements().add(array);
		isApplicableMatch.getAllContextElements().add(t2c);
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(entry);
		isApplicableMatch.getAllContextElements().add(value);
		isApplicableMatch.getAllContextElements().add(c2c);
		isApplicableMatch.getAllContextElements().add(tag);
		comment__tag____ownedComment.setSrc(comment);
		comment__tag____ownedComment.setTrg(tag);
		isApplicableMatch.getAllContextElements().add(comment__tag____ownedComment);
		t2c__value____source.setSrc(t2c);
		t2c__value____source.setTrg(value);
		isApplicableMatch.getAllContextElements().add(t2c__value____source);
		value__array____value.setSrc(value);
		value__array____value.setTrg(array);
		isApplicableMatch.getAllContextElements().add(value__array____value);
		c2c__comment____target.setSrc(c2c);
		c2c__comment____target.setTrg(comment);
		isApplicableMatch.getAllContextElements().add(c2c__comment____target);
		c2c__annotation____source.setSrc(c2c);
		c2c__annotation____source.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(c2c__annotation____source);
		entry__tag____annotatedElement.setSrc(entry);
		entry__tag____annotatedElement.setTrg(tag);
		isApplicableMatch.getAllContextElements().add(entry__tag____annotatedElement);
		t2c__tag____target.setSrc(t2c);
		t2c__tag____target.setTrg(tag);
		isApplicableMatch.getAllContextElements().add(t2c__tag____target);
		tag__entry____ownedComment.setSrc(tag);
		tag__entry____ownedComment.setTrg(entry);
		isApplicableMatch.getAllContextElements().add(tag__entry____ownedComment);
		annotation__value____values.setSrc(annotation);
		annotation__value____values.setTrg(value);
		isApplicableMatch.getAllContextElements().add(annotation__value____values);
		comment__tag____ownedComment.setName(comment__tag____ownedComment_name_prime);
		t2c__value____source.setName(t2c__value____source_name_prime);
		value__array____value.setName(value__array____value_name_prime);
		c2c__comment____target.setName(c2c__comment____target_name_prime);
		c2c__annotation____source.setName(c2c__annotation____source_name_prime);
		entry__tag____annotatedElement.setName(entry__tag____annotatedElement_name_prime);
		t2c__tag____target.setName(t2c__tag____target_name_prime);
		tag__entry____ownedComment.setName(tag__entry____ownedComment_name_prime);
		annotation__value____values.setName(annotation__value____values_name_prime);
		return new Object[] { comment, array, t2c, annotation, entry, value, c2c, tag, isApplicableMatch,
				comment__tag____ownedComment, t2c__value____source, value__array____value, c2c__comment____target,
				c2c__annotation____source, entry__tag____annotatedElement, t2c__tag____target,
				tag__entry____ownedComment, annotation__value____values };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_bindingFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Comment comment,
			ArrayInitializer array, ASTNode2Element t2c, Annotation annotation, Comment entry,
			AnnotationMemberValuePair value, ASTNode2Element c2c, Comment tag) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, comment, array, t2c, annotation,
				entry, value, c2c, tag);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, comment, array, t2c, annotation, entry, value, c2c,
					tag };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Comment comment,
			ArrayInitializer array, ASTNode2Element t2c, Annotation annotation, Comment entry,
			AnnotationMemberValuePair value, ASTNode2Element c2c, Comment tag) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_binding = pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, comment, array, t2c, annotation, entry, value, c2c, tag);
		if (result_pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_black = pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, comment, array, t2c, annotation, entry, value, c2c,
						tag };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_12_5_checkCSP_expressionFBB(
			JavaAnnotationValueEntry2Comment _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaAnnotationValueEntry2Comment";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaAnnotationValueEntry2Comment_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_bindingFB(
			JavaAnnotationValueEntry2Comment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, JavaAnnotationValueEntry2Comment _this) {
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaAnnotationValueEntry2Comment _this) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_binding = pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_black = pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_black_nac_0BBB(
			Comment entry, Comment comment, Comment tag) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					for (Element __DEC_entry_annotatedElement_939296 : entry.getAnnotatedElements()) {
						if (!entry.equals(__DEC_entry_annotatedElement_939296)) {
							if (!comment.equals(__DEC_entry_annotatedElement_939296)) {
								if (!tag.equals(__DEC_entry_annotatedElement_939296)) {
									return new Object[] { entry, comment, tag };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_black_nac_1BB(
			Comment entry, Comment comment) {
		if (entry.getAnnotatedElements().contains(comment)) {
			return new Object[] { entry, comment };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_annotatedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEntry = _edge_annotatedElement.getSrc();
		if (tmpEntry instanceof Comment) {
			Comment entry = (Comment) tmpEntry;
			EObject tmpTag = _edge_annotatedElement.getTrg();
			if (tmpTag instanceof Comment) {
				Comment tag = (Comment) tmpTag;
				if (!entry.equals(tag)) {
					if (entry.getAnnotatedElements().contains(tag)) {
						if (tag.getOwnedComments().contains(entry)) {
							for (Element tmpComment : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tag, Element.class, "ownedComment")) {
								if (tmpComment instanceof Comment) {
									Comment comment = (Comment) tmpComment;
									if (!comment.equals(entry)) {
										if (!comment.equals(tag)) {
											if (pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_black_nac_0BBB(
													entry, comment, tag) == null) {
												if (pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_black_nac_1BB(
														entry, comment) == null) {
													_result.add(new Object[] { comment, entry, tag,
															_edge_annotatedElement });
												}
											}
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Comment comment, Comment entry, Comment tag) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, comment, entry, tag);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaAnnotationValueEntry2Comment _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaAnnotationValueEntry2Comment_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_bindingFB(
			JavaAnnotationValueEntry2Comment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, JavaAnnotationValueEntry2Comment _this) {
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaAnnotationValueEntry2Comment _this) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_binding = pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_black = pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_21_2_testcorematchandDECs_black_nac_0BB(
			StringLiteral expr, AnnotationMemberValuePair value) {
		for (AnnotationMemberValuePair __DEC_expr_value_382594 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(expr, AnnotationMemberValuePair.class, "value")) {
			if (!value.equals(__DEC_expr_value_382594)) {
				return new Object[] { expr, value };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_21_2_testcorematchandDECs_black_nac_1BB(
			AnnotationMemberValuePair value, StringLiteral expr) {
		if (expr.equals(value.getValue())) {
			return new Object[] { value, expr };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_expressions) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpArray = _edge_expressions.getSrc();
		if (tmpArray instanceof ArrayInitializer) {
			ArrayInitializer array = (ArrayInitializer) tmpArray;
			EObject tmpExpr = _edge_expressions.getTrg();
			if (tmpExpr instanceof StringLiteral) {
				StringLiteral expr = (StringLiteral) tmpExpr;
				if (array.getExpressions().contains(expr)) {
					for (AnnotationMemberValuePair value : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(array, AnnotationMemberValuePair.class, "value")) {
						if (pattern_JavaAnnotationValueEntry2Comment_21_2_testcorematchandDECs_black_nac_0BB(expr,
								value) == null) {
							if (pattern_JavaAnnotationValueEntry2Comment_21_2_testcorematchandDECs_black_nac_1BB(value,
									expr) == null) {
								for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(value, Annotation.class, "values")) {
									_result.add(new Object[] { array, expr, annotation, value, _edge_expressions });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, ArrayInitializer array, StringLiteral expr,
			Annotation annotation, AnnotationMemberValuePair value) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, array, expr, annotation, value);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaAnnotationValueEntry2Comment _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaAnnotationValueEntry2Comment_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_1_prepare_blackB(
			JavaAnnotationValueEntry2Comment _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("comment");
		EObject _localVariable_1 = sourceMatch.getObject("array");
		EObject _localVariable_2 = sourceMatch.getObject("expr");
		EObject _localVariable_3 = sourceMatch.getObject("annotation");
		EObject _localVariable_4 = targetMatch.getObject("entry");
		EObject _localVariable_5 = sourceMatch.getObject("value");
		EObject _localVariable_6 = targetMatch.getObject("tag");
		EObject tmpComment = _localVariable_0;
		EObject tmpArray = _localVariable_1;
		EObject tmpExpr = _localVariable_2;
		EObject tmpAnnotation = _localVariable_3;
		EObject tmpEntry = _localVariable_4;
		EObject tmpValue = _localVariable_5;
		EObject tmpTag = _localVariable_6;
		if (tmpComment instanceof Comment) {
			Comment comment = (Comment) tmpComment;
			if (tmpArray instanceof ArrayInitializer) {
				ArrayInitializer array = (ArrayInitializer) tmpArray;
				if (tmpExpr instanceof StringLiteral) {
					StringLiteral expr = (StringLiteral) tmpExpr;
					if (tmpAnnotation instanceof Annotation) {
						Annotation annotation = (Annotation) tmpAnnotation;
						if (tmpEntry instanceof Comment) {
							Comment entry = (Comment) tmpEntry;
							if (tmpValue instanceof AnnotationMemberValuePair) {
								AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
								if (tmpTag instanceof Comment) {
									Comment tag = (Comment) tmpTag;
									return new Object[] { comment, array, expr, annotation, entry, value, tag,
											targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			Comment comment, ArrayInitializer array, StringLiteral expr, Annotation annotation, Comment entry,
			AnnotationMemberValuePair value, Comment tag, Match sourceMatch, Match targetMatch) {
		if (!comment.equals(entry)) {
			if (!comment.equals(tag)) {
				if (!entry.equals(tag)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { comment, array, expr, annotation, entry, value, tag, sourceMatch,
								targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding = pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding != null) {
			Comment comment = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[0];
			ArrayInitializer array = (ArrayInitializer) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[1];
			StringLiteral expr = (StringLiteral) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[2];
			Annotation annotation = (Annotation) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[3];
			Comment entry = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[4];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[5];
			Comment tag = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_black = pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					comment, array, expr, annotation, entry, value, tag, sourceMatch, targetMatch);
			if (result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { comment, array, expr, annotation, entry, value, tag, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_bindingFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Comment comment, ArrayInitializer array, StringLiteral expr,
			Annotation annotation, Comment entry, AnnotationMemberValuePair value, Comment tag, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(comment, array, expr, annotation, entry, value, tag,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, comment, array, expr, annotation, entry, value, tag, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Comment comment, ArrayInitializer array, StringLiteral expr,
			Annotation annotation, Comment entry, AnnotationMemberValuePair value, Comment tag, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_binding = pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, comment, array, expr, annotation, entry, value, tag, sourceMatch, targetMatch);
		if (result_pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_black = pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, comment, array, expr, annotation, entry, value, tag, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_24_5_matchcorrcontext_blackBFBBFBBB(
			Comment comment, Annotation annotation, AnnotationMemberValuePair value, Comment tag, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!comment.equals(tag)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (ASTNode2Element t2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(value,
						ASTNode2Element.class, "source")) {
					if (tag.equals(t2c.getTarget())) {
						for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(comment, ASTNode2Element.class, "target")) {
							if (!c2c.equals(t2c)) {
								if (annotation.equals(c2c.getSource())) {
									_result.add(new Object[] { comment, t2c, annotation, value, c2c, tag, sourceMatch,
											targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element t2c, ASTNode2Element c2c, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "JavaAnnotationValueEntry2Comment";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(t2c);
		ccMatch.getAllContextElements().add(c2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { t2c, c2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_6_createcorrespondence_blackBBBBBBBB(
			Comment comment, ArrayInitializer array, StringLiteral expr, Annotation annotation, Comment entry,
			AnnotationMemberValuePair value, Comment tag, CCMatch ccMatch) {
		if (!comment.equals(entry)) {
			if (!comment.equals(tag)) {
				if (!entry.equals(tag)) {
					return new Object[] { comment, array, expr, annotation, entry, value, tag, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_6_createcorrespondence_greenBFBB(
			StringLiteral expr, Comment entry, CCMatch ccMatch) {
		Expression2Comment e2e = UmlFactory.eINSTANCE.createExpression2Comment();
		e2e.setSource(expr);
		e2e.setTarget(entry);
		ccMatch.getCreateCorr().add(e2e);
		return new Object[] { expr, e2e, entry, ccMatch };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "JavaAnnotationValueEntry2Comment";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaAnnotationValueEntry2Comment_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_27_1_matchtggpattern_black_nac_0BB(
			StringLiteral expr, AnnotationMemberValuePair value) {
		for (AnnotationMemberValuePair __DEC_expr_value_256974 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(expr, AnnotationMemberValuePair.class, "value")) {
			if (!value.equals(__DEC_expr_value_256974)) {
				return new Object[] { expr, value };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_27_1_matchtggpattern_black_nac_1BB(
			AnnotationMemberValuePair value, StringLiteral expr) {
		if (expr.equals(value.getValue())) {
			return new Object[] { value, expr };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_27_1_matchtggpattern_blackBBBB(
			ArrayInitializer array, StringLiteral expr, Annotation annotation, AnnotationMemberValuePair value) {
		if (array.getExpressions().contains(expr)) {
			if (array.equals(value.getValue())) {
				if (annotation.getValues().contains(value)) {
					if (pattern_JavaAnnotationValueEntry2Comment_27_1_matchtggpattern_black_nac_0BB(expr,
							value) == null) {
						if (pattern_JavaAnnotationValueEntry2Comment_27_1_matchtggpattern_black_nac_1BB(value,
								expr) == null) {
							return new Object[] { array, expr, annotation, value };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_28_1_matchtggpattern_black_nac_0BBB(
			Comment entry, Comment comment, Comment tag) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					for (Element __DEC_entry_annotatedElement_182917 : entry.getAnnotatedElements()) {
						if (!entry.equals(__DEC_entry_annotatedElement_182917)) {
							if (!comment.equals(__DEC_entry_annotatedElement_182917)) {
								if (!tag.equals(__DEC_entry_annotatedElement_182917)) {
									return new Object[] { entry, comment, tag };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_28_1_matchtggpattern_black_nac_1BB(
			Comment entry, Comment comment) {
		if (entry.getAnnotatedElements().contains(comment)) {
			return new Object[] { entry, comment };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_28_1_matchtggpattern_blackBBB(Comment comment,
			Comment entry, Comment tag) {
		if (!comment.equals(entry)) {
			if (!comment.equals(tag)) {
				if (!entry.equals(tag)) {
					if (comment.getOwnedComments().contains(tag)) {
						if (entry.getAnnotatedElements().contains(tag)) {
							if (tag.getOwnedComments().contains(entry)) {
								if (pattern_JavaAnnotationValueEntry2Comment_28_1_matchtggpattern_black_nac_0BBB(entry,
										comment, tag) == null) {
									if (pattern_JavaAnnotationValueEntry2Comment_28_1_matchtggpattern_black_nac_1BB(
											entry, comment) == null) {
										return new Object[] { comment, entry, tag };
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

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_1_createresult_blackB(
			JavaAnnotationValueEntry2Comment _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Comment comment) {
		if (ruleResult.getTargetObjects().contains(comment)) {
			return new Object[] { ruleResult, comment };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Comment tag) {
		if (ruleResult.getTargetObjects().contains(tag)) {
			return new Object[] { ruleResult, tag };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element t2c) {
		if (ruleResult.getCorrObjects().contains(t2c)) {
			return new Object[] { ruleResult, t2c };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AnnotationMemberValuePair value) {
		if (ruleResult.getSourceObjects().contains(value)) {
			return new Object[] { ruleResult, value };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ArrayInitializer array) {
		if (ruleResult.getSourceObjects().contains(array)) {
			return new Object[] { ruleResult, array };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Annotation annotation) {
		if (ruleResult.getSourceObjects().contains(annotation)) {
			return new Object[] { ruleResult, annotation };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element c2c) {
		if (ruleResult.getCorrObjects().contains(c2c)) {
			return new Object[] { ruleResult, c2c };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList t2cList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpT2c : t2cList.getEntryObjects()) {
				if (tmpT2c instanceof ASTNode2Element) {
					ASTNode2Element t2c = (ASTNode2Element) tmpT2c;
					Element tmpTag = t2c.getTarget();
					if (tmpTag instanceof Comment) {
						Comment tag = (Comment) tmpTag;
						ASTNode tmpValue = t2c.getSource();
						if (tmpValue instanceof AnnotationMemberValuePair) {
							AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
							Expression tmpArray = value.getValue();
							if (tmpArray instanceof ArrayInitializer) {
								ArrayInitializer array = (ArrayInitializer) tmpArray;
								if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_2BB(
										ruleResult, t2c) == null) {
									if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, tag) == null) {
										if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_3BB(
												ruleResult, value) == null) {
											if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_4BB(
													ruleResult, array) == null) {
												for (Element tmpComment : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(tag, Element.class,
																"ownedComment")) {
													if (tmpComment instanceof Comment) {
														Comment comment = (Comment) tmpComment;
														if (!comment.equals(tag)) {
															if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_0BB(
																	ruleResult, comment) == null) {
																for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(value,
																				Annotation.class, "values")) {
																	if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_5BB(
																			ruleResult, annotation) == null) {
																		for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(comment,
																						ASTNode2Element.class,
																						"target")) {
																			if (!c2c.equals(t2c)) {
																				if (annotation
																						.equals(c2c.getSource())) {
																					if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_6BB(
																							ruleResult, c2c) == null) {
																						_result.add(new Object[] {
																								t2cList, comment, tag,
																								t2c, value, array,
																								annotation, c2c,
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
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_bindingFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Comment comment,
			ArrayInitializer array, ASTNode2Element t2c, Annotation annotation, AnnotationMemberValuePair value,
			ASTNode2Element c2c, Comment tag, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, comment, array, t2c, annotation,
				value, c2c, tag, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, comment, array, t2c, annotation, value, c2c, tag,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Comment comment,
			ArrayInitializer array, ASTNode2Element t2c, Annotation annotation, AnnotationMemberValuePair value,
			ASTNode2Element c2c, Comment tag, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_binding = pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, comment, array, t2c, annotation, value, c2c, tag, ruleResult);
		if (result_pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_black = pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, comment, array, t2c, annotation, value, c2c, tag,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValueEntry2Comment_29_4_checkCSP_expressionFBB(
			JavaAnnotationValueEntry2Comment _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_5_checknacs_blackBBBBBBB(Comment comment,
			ArrayInitializer array, ASTNode2Element t2c, Annotation annotation, AnnotationMemberValuePair value,
			ASTNode2Element c2c, Comment tag) {
		if (!comment.equals(tag)) {
			if (!c2c.equals(t2c)) {
				return new Object[] { comment, array, t2c, annotation, value, c2c, tag };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_6_perform_blackBBBBBBBB(Comment comment,
			ArrayInitializer array, ASTNode2Element t2c, Annotation annotation, AnnotationMemberValuePair value,
			ASTNode2Element c2c, Comment tag, ModelgeneratorRuleResult ruleResult) {
		if (!comment.equals(tag)) {
			if (!c2c.equals(t2c)) {
				return new Object[] { comment, array, t2c, annotation, value, c2c, tag, ruleResult };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_6_perform_greenBFFFBBB(
			ArrayInitializer array, Comment tag, ModelgeneratorRuleResult ruleResult, CSP csp) {
		StringLiteral expr = JavaFactory.eINSTANCE.createStringLiteral();
		Expression2Comment e2e = UmlFactory.eINSTANCE.createExpression2Comment();
		Comment entry = UMLFactory.eINSTANCE.createComment();
		Object _localVariable_0 = csp.getValue("expr", "escapedValue");
		Object _localVariable_1 = csp.getValue("entry", "body");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		array.getExpressions().add(expr);
		ruleResult.getSourceObjects().add(expr);
		e2e.setSource(expr);
		ruleResult.getCorrObjects().add(e2e);
		e2e.setTarget(entry);
		entry.getAnnotatedElements().add(tag);
		tag.getOwnedComments().add(entry);
		ruleResult.getTargetObjects().add(entry);
		String expr_escapedValue_prime = (String) _localVariable_0;
		String entry_body_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		expr.setEscapedValue(expr_escapedValue_prime);
		entry.setBody(entry_body_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { array, expr, e2e, entry, tag, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_JavaAnnotationValueEntry2Comment_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //JavaAnnotationValueEntry2CommentImpl
