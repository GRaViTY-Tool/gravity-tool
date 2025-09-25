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
	public boolean isAppropriate_FWD(Match match, Annotation annotation, ArrayInitializer array, StringLiteral expr,
			AnnotationMemberValuePair value) {

		Object[] result1_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_0_1_initialbindings_blackBBBBBB(this, match, annotation,
						array, expr, value);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[array] = " + array + ", "
					+ "[expr] = " + expr + ", " + "[value] = " + value + ".");
		}

		Object[] result2_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, annotation,
						array, expr, value);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[array] = " + array + ", "
					+ "[expr] = " + expr + ", " + "[value] = " + value + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_0_4_collectelementstobetranslated_blackBBBBB(match,
							annotation, array, expr, value);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[array] = " + array + ", " + "[expr] = " + expr
						+ ", " + "[value] = " + value + ".");
			}
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_0_4_collectelementstobetranslated_greenBBBF(match, array,
							expr);
			//nothing EMoflonEdge array__expr____expressions = (EMoflonEdge) result4_green[3];

			Object[] result5_black = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_0_5_collectcontextelements_blackBBBBB(match, annotation,
							array, expr, value);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[array] = " + array + ", " + "[expr] = " + expr
						+ ", " + "[value] = " + value + ".");
			}
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_0_5_collectcontextelements_greenBBBBFF(match, annotation,
							array, value);
			//nothing EMoflonEdge annotation__value____values = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge value__array____value = (EMoflonEdge) result5_green[5];

			// 
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
							annotation, array, expr, value);
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
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		Comment tag = (Comment) result1_bindingAndBlack[1];
		ArrayInitializer array = (ArrayInitializer) result1_bindingAndBlack[2];
		Comment comment = (Comment) result1_bindingAndBlack[3];
		ASTNode2Element t2c = (ASTNode2Element) result1_bindingAndBlack[4];
		StringLiteral expr = (StringLiteral) result1_bindingAndBlack[5];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result1_bindingAndBlack[6];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_greenFBBFB(tag, expr, csp);
		Comment entry = (Comment) result1_green[0];
		Expression2Comment e2e = (Expression2Comment) result1_green[3];

		Object[] result2_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_2_collecttranslatedelements_blackBBB(entry, expr, e2e);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[entry] = " + entry + ", "
					+ "[expr] = " + expr + ", " + "[e2e] = " + e2e + ".");
		}
		Object[] result2_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_2_collecttranslatedelements_greenFBBB(entry, expr, e2e);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult,
						annotation, entry, tag, array, comment, t2c, expr, e2e, value, c2c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[entry] = " + entry + ", " + "[tag] = " + tag
					+ ", " + "[array] = " + array + ", " + "[comment] = " + comment + ", " + "[t2c] = " + t2c + ", "
					+ "[expr] = " + expr + ", " + "[e2e] = " + e2e + ", " + "[value] = " + value + ", " + "[c2c] = "
					+ c2c + ".");
		}
		JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, entry,
						tag, array, expr, e2e);
		//nothing EMoflonEdge tag__entry____ownedComment = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge array__expr____expressions = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge e2e__entry____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge e2e__expr____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge entry__tag____annotatedElement = (EMoflonEdge) result3_green[10];

		// 
		// 
		JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
						annotation, entry, tag, array, comment, t2c, expr, e2e, value, c2c);
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
		Annotation annotation = (Annotation) result2_binding[0];
		ArrayInitializer array = (ArrayInitializer) result2_binding[1];
		StringLiteral expr = (StringLiteral) result2_binding[2];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_binding[3];
		for (Object[] result2_black : JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_2_2_corematch_blackBFBFFBBFB(annotation, array, expr, value,
						match)) {
			Comment tag = (Comment) result2_black[1];
			Comment comment = (Comment) result2_black[3];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[4];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[7];
			// ForEach 
			for (Object[] result3_black : JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_2_3_findcontext_blackBBBBBBBB(annotation, tag, array,
							comment, t2c, expr, value, c2c)) {
				Object[] result3_green = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(annotation,
								tag, array, comment, t2c, expr, value, c2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge array__expr____expressions = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge annotation__value____values = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge comment__tag____ownedComment = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge t2c__tag____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge t2c__value____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge value__array____value = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge c2c__comment____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge c2c__annotation____source = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, annotation, tag, array, comment, t2c, expr, value, c2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[tag] = " + tag + ", " + "[array] = " + array + ", " + "[comment] = " + comment
							+ ", " + "[t2c] = " + t2c + ", " + "[expr] = " + expr + ", " + "[value] = " + value + ", "
							+ "[c2c] = " + c2c + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Annotation annotation, ArrayInitializer array,
			StringLiteral expr, AnnotationMemberValuePair value) {
		match.registerObject("annotation", annotation);
		match.registerObject("array", array);
		match.registerObject("expr", expr);
		match.registerObject("value", value);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Annotation annotation, ArrayInitializer array,
			StringLiteral expr, AnnotationMemberValuePair value) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Annotation annotation, Comment tag,
			ArrayInitializer array, Comment comment, ASTNode2Element t2c, StringLiteral expr,
			AnnotationMemberValuePair value, ASTNode2Element c2c) {// Create CSP
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
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("tag", tag);
		isApplicableMatch.registerObject("array", array);
		isApplicableMatch.registerObject("comment", comment);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("expr", expr);
		isApplicableMatch.registerObject("value", value);
		isApplicableMatch.registerObject("c2c", c2c);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject annotation, EObject entry, EObject tag,
			EObject array, EObject comment, EObject t2c, EObject expr, EObject e2e, EObject value, EObject c2c) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("entry", entry);
		ruleresult.registerObject("tag", tag);
		ruleresult.registerObject("array", array);
		ruleresult.registerObject("comment", comment);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("expr", expr);
		ruleresult.registerObject("e2e", e2e);
		ruleresult.registerObject("value", value);
		ruleresult.registerObject("c2c", c2c);

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
	public boolean isAppropriate_BWD(Match match, Comment entry, Comment tag, Comment comment) {

		Object[] result1_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_10_1_initialbindings_blackBBBBB(this, match, entry, tag,
						comment);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[entry] = " + entry + ", " + "[tag] = " + tag + ", "
					+ "[comment] = " + comment + ".");
		}

		Object[] result2_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, entry, tag,
						comment);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[entry] = " + entry + ", " + "[tag] = " + tag + ", "
					+ "[comment] = " + comment + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_10_4_collectelementstobetranslated_blackBBBB(match, entry,
							tag, comment);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[entry] = " + entry + ", " + "[tag] = " + tag + ", " + "[comment] = " + comment + ".");
			}
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_10_4_collectelementstobetranslated_greenBBBFF(match,
							entry, tag);
			//nothing EMoflonEdge tag__entry____ownedComment = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge entry__tag____annotatedElement = (EMoflonEdge) result4_green[4];

			Object[] result5_black = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_10_5_collectcontextelements_blackBBBB(match, entry, tag,
							comment);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[entry] = " + entry + ", " + "[tag] = " + tag + ", " + "[comment] = " + comment + ".");
			}
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_10_5_collectcontextelements_greenBBBF(match, tag,
							comment);
			//nothing EMoflonEdge comment__tag____ownedComment = (EMoflonEdge) result5_green[3];

			// 
			JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							entry, tag, comment);
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
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		Comment entry = (Comment) result1_bindingAndBlack[1];
		Comment tag = (Comment) result1_bindingAndBlack[2];
		ArrayInitializer array = (ArrayInitializer) result1_bindingAndBlack[3];
		Comment comment = (Comment) result1_bindingAndBlack[4];
		ASTNode2Element t2c = (ASTNode2Element) result1_bindingAndBlack[5];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result1_bindingAndBlack[6];
		ASTNode2Element c2c = (ASTNode2Element) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_greenBBFFB(entry, array, csp);
		StringLiteral expr = (StringLiteral) result1_green[2];
		Expression2Comment e2e = (Expression2Comment) result1_green[3];

		Object[] result2_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_2_collecttranslatedelements_blackBBB(entry, expr, e2e);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[entry] = " + entry + ", "
					+ "[expr] = " + expr + ", " + "[e2e] = " + e2e + ".");
		}
		Object[] result2_green = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_2_collecttranslatedelements_greenFBBB(entry, expr, e2e);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult,
						annotation, entry, tag, array, comment, t2c, expr, e2e, value, c2c);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[entry] = " + entry + ", " + "[tag] = " + tag
					+ ", " + "[array] = " + array + ", " + "[comment] = " + comment + ", " + "[t2c] = " + t2c + ", "
					+ "[expr] = " + expr + ", " + "[e2e] = " + e2e + ", " + "[value] = " + value + ", " + "[c2c] = "
					+ c2c + ".");
		}
		JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, entry,
						tag, array, expr, e2e);
		//nothing EMoflonEdge tag__entry____ownedComment = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge array__expr____expressions = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge e2e__entry____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge e2e__expr____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge entry__tag____annotatedElement = (EMoflonEdge) result3_green[10];

		// 
		// 
		JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
						annotation, entry, tag, array, comment, t2c, expr, e2e, value, c2c);
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
		Comment entry = (Comment) result2_binding[0];
		Comment tag = (Comment) result2_binding[1];
		Comment comment = (Comment) result2_binding[2];
		for (Object[] result2_black : JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_12_2_corematch_blackFBBBFFFB(entry, tag, comment, match)) {
			Annotation annotation = (Annotation) result2_black[0];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[4];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_black[5];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[6];
			// ForEach 
			for (Object[] result3_black : JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_12_3_findcontext_blackBBBFBBBB(annotation, entry, tag,
							comment, t2c, value, c2c)) {
				ArrayInitializer array = (ArrayInitializer) result3_black[3];
				Object[] result3_green = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_12_3_findcontext_greenBBBBBBBBFFFFFFFFFF(annotation,
								entry, tag, array, comment, t2c, value, c2c);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge tag__entry____ownedComment = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge annotation__value____values = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge comment__tag____ownedComment = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge t2c__tag____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge t2c__value____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge value__array____value = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge c2c__comment____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge c2c__annotation____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge entry__tag____annotatedElement = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, annotation, entry, tag, array, comment, t2c, value, c2c);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[entry] = " + entry + ", " + "[tag] = " + tag + ", " + "[array] = " + array + ", "
							+ "[comment] = " + comment + ", " + "[t2c] = " + t2c + ", " + "[value] = " + value + ", "
							+ "[c2c] = " + c2c + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Comment entry, Comment tag, Comment comment) {
		match.registerObject("entry", entry);
		match.registerObject("tag", tag);
		match.registerObject("comment", comment);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Comment entry, Comment tag, Comment comment) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Annotation annotation, Comment entry,
			Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c, AnnotationMemberValuePair value,
			ASTNode2Element c2c) {// Create CSP
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
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("entry", entry);
		isApplicableMatch.registerObject("tag", tag);
		isApplicableMatch.registerObject("array", array);
		isApplicableMatch.registerObject("comment", comment);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("value", value);
		isApplicableMatch.registerObject("c2c", c2c);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject annotation, EObject entry, EObject tag,
			EObject array, EObject comment, EObject t2c, EObject expr, EObject e2e, EObject value, EObject c2c) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("entry", entry);
		ruleresult.registerObject("tag", tag);
		ruleresult.registerObject("array", array);
		ruleresult.registerObject("comment", comment);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("expr", expr);
		ruleresult.registerObject("e2e", e2e);
		ruleresult.registerObject("value", value);
		ruleresult.registerObject("c2c", c2c);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_131(EMoflonEdge _edge_ownedComment) {

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
				.pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_blackFFFB(_edge_ownedComment)) {
			Comment entry = (Comment) result2_black[0];
			Comment tag = (Comment) result2_black[1];
			Comment comment = (Comment) result2_black[2];
			Object[] result2_green = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, entry, tag, comment)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_143(EMoflonEdge _edge_expressions) {

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
			Annotation annotation = (Annotation) result2_black[0];
			ArrayInitializer array = (ArrayInitializer) result2_black[1];
			StringLiteral expr = (StringLiteral) result2_black[2];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_black[3];
			Object[] result2_green = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, annotation, array, expr, value)) {
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

		Variable var_expr_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("expr", true, csp);
		var_expr_escapedValue.setValue(__helper.getValue("expr", "escapedValue"));
		var_expr_escapedValue.setType("String");

		Variable var_entry_body = CSPFactoryHelper.eINSTANCE.createVariable("entry", true, csp);
		var_entry_body.setValue(__helper.getValue("entry", "body"));
		var_entry_body.setType("String");

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

		Variable var_expr_escapedValue = CSPFactoryHelper.eINSTANCE.createVariable("expr", true, csp);
		var_expr_escapedValue.setValue(__helper.getValue("expr", "escapedValue"));
		var_expr_escapedValue.setType("String");

		Variable var_entry_body = CSPFactoryHelper.eINSTANCE.createVariable("entry", true, csp);
		var_entry_body.setValue(__helper.getValue("entry", "body"));
		var_entry_body.setType("String");

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
		Annotation annotation = (Annotation) result2_bindingAndBlack[0];
		Comment entry = (Comment) result2_bindingAndBlack[1];
		Comment tag = (Comment) result2_bindingAndBlack[2];
		ArrayInitializer array = (ArrayInitializer) result2_bindingAndBlack[3];
		Comment comment = (Comment) result2_bindingAndBlack[4];
		StringLiteral expr = (StringLiteral) result2_bindingAndBlack[5];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, annotation,
						entry, tag, array, comment, expr, value, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[annotation] = " + annotation + ", " + "[entry] = " + entry + ", " + "[tag] = " + tag + ", "
					+ "[array] = " + array + ", " + "[comment] = " + comment + ", " + "[expr] = " + expr + ", "
					+ "[value] = " + value + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_24_5_matchcorrcontext_blackBBBFBFBB(annotation, tag,
							comment, value, sourceMatch, targetMatch)) {
				ASTNode2Element t2c = (ASTNode2Element) result5_black[3];
				ASTNode2Element c2c = (ASTNode2Element) result5_black[5];
				Object[] result5_green = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_24_5_matchcorrcontext_greenBBBBF(t2c, c2c,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_24_6_createcorrespondence_blackBBBBBBBB(annotation,
								entry, tag, array, comment, expr, value, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
							+ annotation + ", " + "[entry] = " + entry + ", " + "[tag] = " + tag + ", " + "[array] = "
							+ array + ", " + "[comment] = " + comment + ", " + "[expr] = " + expr + ", " + "[value] = "
							+ value + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_24_6_createcorrespondence_greenBBFB(entry, expr,
								ccMatch);
				//nothing Expression2Comment e2e = (Expression2Comment) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(Annotation annotation, Comment entry, Comment tag, ArrayInitializer array,
			Comment comment, StringLiteral expr, AnnotationMemberValuePair value, Match sourceMatch,
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
	public boolean checkDEC_FWD(Annotation annotation, ArrayInitializer array, StringLiteral expr,
			AnnotationMemberValuePair value) {// 
		Object[] result1_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_27_1_matchtggpattern_blackBBBB(annotation, array, expr,
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
	public boolean checkDEC_BWD(Comment entry, Comment tag, Comment comment) {// 
		Object[] result1_black = JavaAnnotationValueEntry2CommentImpl
				.pattern_JavaAnnotationValueEntry2Comment_28_1_matchtggpattern_blackBBB(entry, tag, comment);
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
			Annotation annotation = (Annotation) result2_black[1];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_black[2];
			ArrayInitializer array = (ArrayInitializer) result2_black[3];
			ASTNode2Element t2c = (ASTNode2Element) result2_black[4];
			Comment tag = (Comment) result2_black[5];
			Comment comment = (Comment) result2_black[6];
			ASTNode2Element c2c = (ASTNode2Element) result2_black[7];

			Object[] result3_bindingAndBlack = JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
							isApplicableMatch, annotation, tag, array, comment, t2c, value, c2c, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation + ", "
						+ "[tag] = " + tag + ", " + "[array] = " + array + ", " + "[comment] = " + comment + ", "
						+ "[t2c] = " + t2c + ", " + "[value] = " + value + ", " + "[c2c] = " + c2c + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (JavaAnnotationValueEntry2CommentImpl
					.pattern_JavaAnnotationValueEntry2Comment_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = JavaAnnotationValueEntry2CommentImpl
						.pattern_JavaAnnotationValueEntry2Comment_29_5_checknacs_blackBBBBBBB(annotation, tag, array,
								comment, t2c, value, c2c);
				if (result5_black != null) {

					Object[] result6_black = JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_29_6_perform_blackBBBBBBBB(annotation, tag, array,
									comment, t2c, value, c2c, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
								+ annotation + ", " + "[tag] = " + tag + ", " + "[array] = " + array + ", "
								+ "[comment] = " + comment + ", " + "[t2c] = " + t2c + ", " + "[value] = " + value
								+ ", " + "[c2c] = " + c2c + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					JavaAnnotationValueEntry2CommentImpl
							.pattern_JavaAnnotationValueEntry2Comment_29_6_perform_greenFBBFFBB(tag, array, ruleResult,
									csp);
					//nothing Comment entry = (Comment) result6_green[0];
					//nothing StringLiteral expr = (StringLiteral) result6_green[3];
					//nothing Expression2Comment e2e = (Expression2Comment) result6_green[4];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Annotation annotation, Comment tag,
			ArrayInitializer array, Comment comment, ASTNode2Element t2c, AnnotationMemberValuePair value,
			ASTNode2Element c2c, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("tag", tag);
		isApplicableMatch.registerObject("array", array);
		isApplicableMatch.registerObject("comment", comment);
		isApplicableMatch.registerObject("t2c", t2c);
		isApplicableMatch.registerObject("value", value);
		isApplicableMatch.registerObject("c2c", c2c);
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
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_FWD__MATCH_ANNOTATION_ARRAYINITIALIZER_STRINGLITERAL_ANNOTATIONMEMBERVALUEPAIR:
				return isAppropriate_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
						(ArrayInitializer) arguments.get(2), (StringLiteral) arguments.get(3),
						(AnnotationMemberValuePair) arguments.get(4));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATION_ARRAYINITIALIZER_STRINGLITERAL_ANNOTATIONMEMBERVALUEPAIR:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
						(ArrayInitializer) arguments.get(2), (StringLiteral) arguments.get(3),
						(AnnotationMemberValuePair) arguments.get(4));
				return null;
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATION_ARRAYINITIALIZER_STRINGLITERAL_ANNOTATIONMEMBERVALUEPAIR:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
						(ArrayInitializer) arguments.get(2), (StringLiteral) arguments.get(3),
						(AnnotationMemberValuePair) arguments.get(4));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANNOTATION_COMMENT_ARRAYINITIALIZER_COMMENT_ASTNODE2ELEMENT_STRINGLITERAL_ANNOTATIONMEMBERVALUEPAIR_ASTNODE2ELEMENT:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
						(Comment) arguments.get(2), (ArrayInitializer) arguments.get(3), (Comment) arguments.get(4),
						(ASTNode2Element) arguments.get(5), (StringLiteral) arguments.get(6),
						(AnnotationMemberValuePair) arguments.get(7), (ASTNode2Element) arguments.get(8));
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
				return isAppropriate_BWD((Match) arguments.get(0), (Comment) arguments.get(1),
						(Comment) arguments.get(2), (Comment) arguments.get(3));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMENT_COMMENT_COMMENT:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (Comment) arguments.get(1),
						(Comment) arguments.get(2), (Comment) arguments.get(3));
				return null;
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMENT_COMMENT_COMMENT:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Comment) arguments.get(1),
						(Comment) arguments.get(2), (Comment) arguments.get(3));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATION_COMMENT_COMMENT_ARRAYINITIALIZER_COMMENT_ASTNODE2ELEMENT_ANNOTATIONMEMBERVALUEPAIR_ASTNODE2ELEMENT:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
						(Comment) arguments.get(2), (Comment) arguments.get(3), (ArrayInitializer) arguments.get(4),
						(Comment) arguments.get(5), (ASTNode2Element) arguments.get(6),
						(AnnotationMemberValuePair) arguments.get(7), (ASTNode2Element) arguments.get(8));
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
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_131__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_131((EMoflonEdge) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_143__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_143((EMoflonEdge) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATION_COMMENT_COMMENT_ARRAYINITIALIZER_COMMENT_STRINGLITERAL_ANNOTATIONMEMBERVALUEPAIR_MATCH_MATCH:
				return isApplicable_solveCsp_CC((Annotation) arguments.get(0), (Comment) arguments.get(1),
						(Comment) arguments.get(2), (ArrayInitializer) arguments.get(3), (Comment) arguments.get(4),
						(StringLiteral) arguments.get(5), (AnnotationMemberValuePair) arguments.get(6),
						(Match) arguments.get(7), (Match) arguments.get(8));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___CHECK_DEC_FWD__ANNOTATION_ARRAYINITIALIZER_STRINGLITERAL_ANNOTATIONMEMBERVALUEPAIR:
				return checkDEC_FWD((Annotation) arguments.get(0), (ArrayInitializer) arguments.get(1),
						(StringLiteral) arguments.get(2), (AnnotationMemberValuePair) arguments.get(3));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___CHECK_DEC_BWD__COMMENT_COMMENT_COMMENT:
				return checkDEC_BWD((Comment) arguments.get(0), (Comment) arguments.get(1), (Comment) arguments.get(2));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
				return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANNOTATION_COMMENT_ARRAYINITIALIZER_COMMENT_ASTNODE2ELEMENT_ANNOTATIONMEMBERVALUEPAIR_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
						(Comment) arguments.get(2), (ArrayInitializer) arguments.get(3), (Comment) arguments.get(4),
						(ASTNode2Element) arguments.get(5), (AnnotationMemberValuePair) arguments.get(6),
						(ASTNode2Element) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
			case RulesPackage.JAVA_ANNOTATION_VALUE_ENTRY2_COMMENT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_1_initialbindings_blackBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Annotation annotation, ArrayInitializer array,
			StringLiteral expr, AnnotationMemberValuePair value) {
		return new Object[] { _this, match, annotation, array, expr, value };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_bindingFBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Annotation annotation, ArrayInitializer array,
			StringLiteral expr, AnnotationMemberValuePair value) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, annotation, array, expr, value);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, annotation, array, expr, value };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Annotation annotation, ArrayInitializer array,
			StringLiteral expr, AnnotationMemberValuePair value) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_binding = pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, annotation, array, expr, value);
		if (result_pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_black = pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, annotation, array, expr, value };
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
			Match match, Annotation annotation, ArrayInitializer array, StringLiteral expr,
			AnnotationMemberValuePair value) {
		return new Object[] { match, annotation, array, expr, value };
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
			Match match, Annotation annotation, ArrayInitializer array, StringLiteral expr,
			AnnotationMemberValuePair value) {
		return new Object[] { match, annotation, array, expr, value };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_0_5_collectcontextelements_greenBBBBFF(
			Match match, Annotation annotation, ArrayInitializer array, AnnotationMemberValuePair value) {
		EMoflonEdge annotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__array____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(annotation);
		match.getContextNodes().add(array);
		match.getContextNodes().add(value);
		String annotation__value____values_name_prime = "values";
		String value__array____value_name_prime = "value";
		annotation__value____values.setSrc(annotation);
		annotation__value____values.setTrg(value);
		match.getContextEdges().add(annotation__value____values);
		value__array____value.setSrc(value);
		value__array____value.setTrg(array);
		match.getContextEdges().add(value__array____value);
		annotation__value____values.setName(annotation__value____values_name_prime);
		value__array____value.setName(value__array____value_name_prime);
		return new Object[] { match, annotation, array, value, annotation__value____values, value__array____value };
	}

	public static final void pattern_JavaAnnotationValueEntry2Comment_0_6_registerobjectstomatch_expressionBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Annotation annotation, ArrayInitializer array,
			StringLiteral expr, AnnotationMemberValuePair value) {
		_this.registerObjectsToMatch_FWD(match, annotation, array, expr, value);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("tag");
		EObject _localVariable_2 = isApplicableMatch.getObject("array");
		EObject _localVariable_3 = isApplicableMatch.getObject("comment");
		EObject _localVariable_4 = isApplicableMatch.getObject("t2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("expr");
		EObject _localVariable_6 = isApplicableMatch.getObject("value");
		EObject _localVariable_7 = isApplicableMatch.getObject("c2c");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpTag = _localVariable_1;
		EObject tmpArray = _localVariable_2;
		EObject tmpComment = _localVariable_3;
		EObject tmpT2c = _localVariable_4;
		EObject tmpExpr = _localVariable_5;
		EObject tmpValue = _localVariable_6;
		EObject tmpC2c = _localVariable_7;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpTag instanceof Comment) {
				Comment tag = (Comment) tmpTag;
				if (tmpArray instanceof ArrayInitializer) {
					ArrayInitializer array = (ArrayInitializer) tmpArray;
					if (tmpComment instanceof Comment) {
						Comment comment = (Comment) tmpComment;
						if (tmpT2c instanceof ASTNode2Element) {
							ASTNode2Element t2c = (ASTNode2Element) tmpT2c;
							if (tmpExpr instanceof StringLiteral) {
								StringLiteral expr = (StringLiteral) tmpExpr;
								if (tmpValue instanceof AnnotationMemberValuePair) {
									AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
									if (tmpC2c instanceof ASTNode2Element) {
										ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
										return new Object[] { annotation, tag, array, comment, t2c, expr, value, c2c,
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
			Annotation annotation, Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c,
			StringLiteral expr, AnnotationMemberValuePair value, ASTNode2Element c2c,
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch) {
		if (!comment.equals(tag)) {
			if (!c2c.equals(t2c)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { annotation, tag, array, comment, t2c, expr, value, c2c, csp, _this,
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
			Annotation annotation = (Annotation) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[0];
			Comment tag = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[1];
			ArrayInitializer array = (ArrayInitializer) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[2];
			Comment comment = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[3];
			ASTNode2Element t2c = (ASTNode2Element) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[4];
			StringLiteral expr = (StringLiteral) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[5];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[6];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_binding[7];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_black = pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_blackBBBBBBBBFBB(
					annotation, tag, array, comment, t2c, expr, value, c2c, _this, isApplicableMatch);
			if (result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_black[8];

				return new Object[] { annotation, tag, array, comment, t2c, expr, value, c2c, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_1_performtransformation_greenFBBFB(
			Comment tag, StringLiteral expr, CSP csp) {
		Comment entry = UMLFactory.eINSTANCE.createComment();
		Expression2Comment e2e = UmlFactory.eINSTANCE.createExpression2Comment();
		Object _localVariable_0 = csp.getValue("entry", "body");
		tag.getOwnedComments().add(entry);
		entry.getAnnotatedElements().add(tag);
		e2e.setTarget(entry);
		e2e.setSource(expr);
		String entry_body_prime = (String) _localVariable_0;
		entry.setBody(entry_body_prime);
		return new Object[] { entry, tag, expr, e2e, csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_2_collecttranslatedelements_blackBBB(
			Comment entry, StringLiteral expr, Expression2Comment e2e) {
		return new Object[] { entry, expr, e2e };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_2_collecttranslatedelements_greenFBBB(
			Comment entry, StringLiteral expr, Expression2Comment e2e) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(entry);
		ruleresult.getTranslatedElements().add(expr);
		ruleresult.getCreatedLinkElements().add(e2e);
		return new Object[] { ruleresult, entry, expr, e2e };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject entry, EObject tag, EObject array,
			EObject comment, EObject t2c, EObject expr, EObject e2e, EObject value, EObject c2c) {
		if (!annotation.equals(entry)) {
			if (!annotation.equals(tag)) {
				if (!annotation.equals(array)) {
					if (!annotation.equals(comment)) {
						if (!annotation.equals(t2c)) {
							if (!annotation.equals(expr)) {
								if (!annotation.equals(e2e)) {
									if (!annotation.equals(value)) {
										if (!annotation.equals(c2c)) {
											if (!entry.equals(tag)) {
												if (!entry.equals(t2c)) {
													if (!entry.equals(expr)) {
														if (!entry.equals(value)) {
															if (!tag.equals(value)) {
																if (!array.equals(entry)) {
																	if (!array.equals(tag)) {
																		if (!array.equals(comment)) {
																			if (!array.equals(t2c)) {
																				if (!array.equals(expr)) {
																					if (!array.equals(e2e)) {
																						if (!array.equals(value)) {
																							if (!array.equals(c2c)) {
																								if (!comment.equals(
																										entry)) {
																									if (!comment.equals(
																											tag)) {
																										if (!comment
																												.equals(t2c)) {
																											if (!comment
																													.equals(expr)) {
																												if (!comment
																														.equals(e2e)) {
																													if (!comment
																															.equals(value)) {
																														if (!t2c.equals(
																																tag)) {
																															if (!t2c.equals(
																																	value)) {
																																if (!expr
																																		.equals(tag)) {
																																	if (!expr
																																			.equals(t2c)) {
																																		if (!expr
																																				.equals(value)) {
																																			if (!e2e.equals(
																																					entry)) {
																																				if (!e2e.equals(
																																						tag)) {
																																					if (!e2e.equals(
																																							t2c)) {
																																						if (!e2e.equals(
																																								expr)) {
																																							if (!e2e.equals(
																																									value)) {
																																								if (!c2c.equals(
																																										entry)) {
																																									if (!c2c.equals(
																																											tag)) {
																																										if (!c2c.equals(
																																												comment)) {
																																											if (!c2c.equals(
																																													t2c)) {
																																												if (!c2c.equals(
																																														expr)) {
																																													if (!c2c.equals(
																																															e2e)) {
																																														if (!c2c.equals(
																																																value)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	annotation,
																																																	entry,
																																																	tag,
																																																	array,
																																																	comment,
																																																	t2c,
																																																	expr,
																																																	e2e,
																																																	value,
																																																	c2c };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject entry, EObject tag, EObject array, EObject expr, EObject e2e) {
		EMoflonEdge tag__entry____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge array__expr____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge e2e__entry____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge e2e__expr____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge entry__tag____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaAnnotationValueEntry2Comment";
		String tag__entry____ownedComment_name_prime = "ownedComment";
		String array__expr____expressions_name_prime = "expressions";
		String e2e__entry____target_name_prime = "target";
		String e2e__expr____source_name_prime = "source";
		String entry__tag____annotatedElement_name_prime = "annotatedElement";
		tag__entry____ownedComment.setSrc(tag);
		tag__entry____ownedComment.setTrg(entry);
		ruleresult.getCreatedEdges().add(tag__entry____ownedComment);
		array__expr____expressions.setSrc(array);
		array__expr____expressions.setTrg(expr);
		ruleresult.getTranslatedEdges().add(array__expr____expressions);
		e2e__entry____target.setSrc(e2e);
		e2e__entry____target.setTrg(entry);
		ruleresult.getCreatedEdges().add(e2e__entry____target);
		e2e__expr____source.setSrc(e2e);
		e2e__expr____source.setTrg(expr);
		ruleresult.getCreatedEdges().add(e2e__expr____source);
		entry__tag____annotatedElement.setSrc(entry);
		entry__tag____annotatedElement.setTrg(tag);
		ruleresult.getCreatedEdges().add(entry__tag____annotatedElement);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tag__entry____ownedComment.setName(tag__entry____ownedComment_name_prime);
		array__expr____expressions.setName(array__expr____expressions_name_prime);
		e2e__entry____target.setName(e2e__entry____target_name_prime);
		e2e__expr____source.setName(e2e__expr____source_name_prime);
		entry__tag____annotatedElement.setName(entry__tag____annotatedElement_name_prime);
		return new Object[] { ruleresult, entry, tag, array, expr, e2e, tag__entry____ownedComment,
				array__expr____expressions, e2e__entry____target, e2e__expr____source, entry__tag____annotatedElement };
	}

	public static final void pattern_JavaAnnotationValueEntry2Comment_1_5_registerobjects_expressionBBBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, PerformRuleResult ruleresult, EObject annotation, EObject entry,
			EObject tag, EObject array, EObject comment, EObject t2c, EObject expr, EObject e2e, EObject value,
			EObject c2c) {
		_this.registerObjects_FWD(ruleresult, annotation, entry, tag, array, comment, t2c, expr, e2e, value, c2c);

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
		EObject _localVariable_0 = match.getObject("annotation");
		EObject _localVariable_1 = match.getObject("array");
		EObject _localVariable_2 = match.getObject("expr");
		EObject _localVariable_3 = match.getObject("value");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpArray = _localVariable_1;
		EObject tmpExpr = _localVariable_2;
		EObject tmpValue = _localVariable_3;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpArray instanceof ArrayInitializer) {
				ArrayInitializer array = (ArrayInitializer) tmpArray;
				if (tmpExpr instanceof StringLiteral) {
					StringLiteral expr = (StringLiteral) tmpExpr;
					if (tmpValue instanceof AnnotationMemberValuePair) {
						AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
						return new Object[] { annotation, array, expr, value, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_2_2_corematch_blackBFBFFBBFB(
			Annotation annotation, ArrayInitializer array, StringLiteral expr, AnnotationMemberValuePair value,
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
										new Object[] { annotation, tag, array, comment, t2c, expr, value, c2c, match });
							}
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_2_3_findcontext_blackBBBBBBBB(
			Annotation annotation, Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c,
			StringLiteral expr, AnnotationMemberValuePair value, ASTNode2Element c2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!comment.equals(tag)) {
			if (!c2c.equals(t2c)) {
				if (array.getExpressions().contains(expr)) {
					if (annotation.getValues().contains(value)) {
						if (comment.getOwnedComments().contains(tag)) {
							if (tag.equals(t2c.getTarget())) {
								if (value.equals(t2c.getSource())) {
									if (array.equals(value.getValue())) {
										if (comment.equals(c2c.getTarget())) {
											if (annotation.equals(c2c.getSource())) {
												_result.add(new Object[] { annotation, tag, array, comment, t2c, expr,
														value, c2c });
											}
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
			Annotation annotation, Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c,
			StringLiteral expr, AnnotationMemberValuePair value, ASTNode2Element c2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge array__expr____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__tag____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__tag____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__value____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__array____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__comment____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String array__expr____expressions_name_prime = "expressions";
		String annotation__value____values_name_prime = "values";
		String comment__tag____ownedComment_name_prime = "ownedComment";
		String t2c__tag____target_name_prime = "target";
		String t2c__value____source_name_prime = "source";
		String value__array____value_name_prime = "value";
		String c2c__comment____target_name_prime = "target";
		String c2c__annotation____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(tag);
		isApplicableMatch.getAllContextElements().add(array);
		isApplicableMatch.getAllContextElements().add(comment);
		isApplicableMatch.getAllContextElements().add(t2c);
		isApplicableMatch.getAllContextElements().add(expr);
		isApplicableMatch.getAllContextElements().add(value);
		isApplicableMatch.getAllContextElements().add(c2c);
		array__expr____expressions.setSrc(array);
		array__expr____expressions.setTrg(expr);
		isApplicableMatch.getAllContextElements().add(array__expr____expressions);
		annotation__value____values.setSrc(annotation);
		annotation__value____values.setTrg(value);
		isApplicableMatch.getAllContextElements().add(annotation__value____values);
		comment__tag____ownedComment.setSrc(comment);
		comment__tag____ownedComment.setTrg(tag);
		isApplicableMatch.getAllContextElements().add(comment__tag____ownedComment);
		t2c__tag____target.setSrc(t2c);
		t2c__tag____target.setTrg(tag);
		isApplicableMatch.getAllContextElements().add(t2c__tag____target);
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
		array__expr____expressions.setName(array__expr____expressions_name_prime);
		annotation__value____values.setName(annotation__value____values_name_prime);
		comment__tag____ownedComment.setName(comment__tag____ownedComment_name_prime);
		t2c__tag____target.setName(t2c__tag____target_name_prime);
		t2c__value____source.setName(t2c__value____source_name_prime);
		value__array____value.setName(value__array____value_name_prime);
		c2c__comment____target.setName(c2c__comment____target_name_prime);
		c2c__annotation____source.setName(c2c__annotation____source_name_prime);
		return new Object[] { annotation, tag, array, comment, t2c, expr, value, c2c, isApplicableMatch,
				array__expr____expressions, annotation__value____values, comment__tag____ownedComment,
				t2c__tag____target, t2c__value____source, value__array____value, c2c__comment____target,
				c2c__annotation____source };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_bindingFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c, StringLiteral expr,
			AnnotationMemberValuePair value, ASTNode2Element c2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, annotation, tag, array, comment, t2c,
				expr, value, c2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, tag, array, comment, t2c, expr, value,
					c2c };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c, StringLiteral expr,
			AnnotationMemberValuePair value, ASTNode2Element c2c) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_binding = pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, annotation, tag, array, comment, t2c, expr, value, c2c);
		if (result_pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_black = pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, tag, array, comment, t2c, expr, value,
						c2c };
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
			JavaAnnotationValueEntry2Comment _this, Match match, Comment entry, Comment tag, Comment comment) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					return new Object[] { _this, match, entry, tag, comment };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_bindingFBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Comment entry, Comment tag, Comment comment) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, entry, tag, comment);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, entry, tag, comment };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_bindingAndBlackFBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Comment entry, Comment tag, Comment comment) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_binding = pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_bindingFBBBBB(
				_this, match, entry, tag, comment);
		if (result_pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_black = pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, entry, tag, comment };
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
			Match match, Comment entry, Comment tag, Comment comment) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					return new Object[] { match, entry, tag, comment };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Comment entry, Comment tag) {
		EMoflonEdge tag__entry____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge entry__tag____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(entry);
		String tag__entry____ownedComment_name_prime = "ownedComment";
		String entry__tag____annotatedElement_name_prime = "annotatedElement";
		tag__entry____ownedComment.setSrc(tag);
		tag__entry____ownedComment.setTrg(entry);
		match.getToBeTranslatedEdges().add(tag__entry____ownedComment);
		entry__tag____annotatedElement.setSrc(entry);
		entry__tag____annotatedElement.setTrg(tag);
		match.getToBeTranslatedEdges().add(entry__tag____annotatedElement);
		tag__entry____ownedComment.setName(tag__entry____ownedComment_name_prime);
		entry__tag____annotatedElement.setName(entry__tag____annotatedElement_name_prime);
		return new Object[] { match, entry, tag, tag__entry____ownedComment, entry__tag____annotatedElement };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_5_collectcontextelements_blackBBBB(
			Match match, Comment entry, Comment tag, Comment comment) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					return new Object[] { match, entry, tag, comment };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_10_5_collectcontextelements_greenBBBF(
			Match match, Comment tag, Comment comment) {
		EMoflonEdge comment__tag____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tag);
		match.getContextNodes().add(comment);
		String comment__tag____ownedComment_name_prime = "ownedComment";
		comment__tag____ownedComment.setSrc(comment);
		comment__tag____ownedComment.setTrg(tag);
		match.getContextEdges().add(comment__tag____ownedComment);
		comment__tag____ownedComment.setName(comment__tag____ownedComment_name_prime);
		return new Object[] { match, tag, comment, comment__tag____ownedComment };
	}

	public static final void pattern_JavaAnnotationValueEntry2Comment_10_6_registerobjectstomatch_expressionBBBBB(
			JavaAnnotationValueEntry2Comment _this, Match match, Comment entry, Comment tag, Comment comment) {
		_this.registerObjectsToMatch_BWD(match, entry, tag, comment);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("entry");
		EObject _localVariable_2 = isApplicableMatch.getObject("tag");
		EObject _localVariable_3 = isApplicableMatch.getObject("array");
		EObject _localVariable_4 = isApplicableMatch.getObject("comment");
		EObject _localVariable_5 = isApplicableMatch.getObject("t2c");
		EObject _localVariable_6 = isApplicableMatch.getObject("value");
		EObject _localVariable_7 = isApplicableMatch.getObject("c2c");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpEntry = _localVariable_1;
		EObject tmpTag = _localVariable_2;
		EObject tmpArray = _localVariable_3;
		EObject tmpComment = _localVariable_4;
		EObject tmpT2c = _localVariable_5;
		EObject tmpValue = _localVariable_6;
		EObject tmpC2c = _localVariable_7;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpEntry instanceof Comment) {
				Comment entry = (Comment) tmpEntry;
				if (tmpTag instanceof Comment) {
					Comment tag = (Comment) tmpTag;
					if (tmpArray instanceof ArrayInitializer) {
						ArrayInitializer array = (ArrayInitializer) tmpArray;
						if (tmpComment instanceof Comment) {
							Comment comment = (Comment) tmpComment;
							if (tmpT2c instanceof ASTNode2Element) {
								ASTNode2Element t2c = (ASTNode2Element) tmpT2c;
								if (tmpValue instanceof AnnotationMemberValuePair) {
									AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
									if (tmpC2c instanceof ASTNode2Element) {
										ASTNode2Element c2c = (ASTNode2Element) tmpC2c;
										return new Object[] { annotation, entry, tag, array, comment, t2c, value, c2c,
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
			Annotation annotation, Comment entry, Comment tag, ArrayInitializer array, Comment comment,
			ASTNode2Element t2c, AnnotationMemberValuePair value, ASTNode2Element c2c,
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					if (!c2c.equals(t2c)) {
						for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
							if (tmpCsp instanceof CSP) {
								CSP csp = (CSP) tmpCsp;
								return new Object[] { annotation, entry, tag, array, comment, t2c, value, c2c, csp,
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
			Annotation annotation = (Annotation) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[0];
			Comment entry = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[1];
			Comment tag = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[2];
			ArrayInitializer array = (ArrayInitializer) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[3];
			Comment comment = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[4];
			ASTNode2Element t2c = (ASTNode2Element) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[5];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[6];
			ASTNode2Element c2c = (ASTNode2Element) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_binding[7];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_black = pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_blackBBBBBBBBFBB(
					annotation, entry, tag, array, comment, t2c, value, c2c, _this, isApplicableMatch);
			if (result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_black[8];

				return new Object[] { annotation, entry, tag, array, comment, t2c, value, c2c, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_1_performtransformation_greenBBFFB(
			Comment entry, ArrayInitializer array, CSP csp) {
		StringLiteral expr = JavaFactory.eINSTANCE.createStringLiteral();
		Expression2Comment e2e = UmlFactory.eINSTANCE.createExpression2Comment();
		Object _localVariable_0 = csp.getValue("expr", "escapedValue");
		array.getExpressions().add(expr);
		e2e.setTarget(entry);
		e2e.setSource(expr);
		String expr_escapedValue_prime = (String) _localVariable_0;
		expr.setEscapedValue(expr_escapedValue_prime);
		return new Object[] { entry, array, expr, e2e, csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_2_collecttranslatedelements_blackBBB(
			Comment entry, StringLiteral expr, Expression2Comment e2e) {
		return new Object[] { entry, expr, e2e };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_2_collecttranslatedelements_greenFBBB(
			Comment entry, StringLiteral expr, Expression2Comment e2e) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(entry);
		ruleresult.getCreatedElements().add(expr);
		ruleresult.getCreatedLinkElements().add(e2e);
		return new Object[] { ruleresult, entry, expr, e2e };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject entry, EObject tag, EObject array,
			EObject comment, EObject t2c, EObject expr, EObject e2e, EObject value, EObject c2c) {
		if (!annotation.equals(entry)) {
			if (!annotation.equals(tag)) {
				if (!annotation.equals(array)) {
					if (!annotation.equals(comment)) {
						if (!annotation.equals(t2c)) {
							if (!annotation.equals(expr)) {
								if (!annotation.equals(e2e)) {
									if (!annotation.equals(value)) {
										if (!annotation.equals(c2c)) {
											if (!entry.equals(tag)) {
												if (!entry.equals(t2c)) {
													if (!entry.equals(expr)) {
														if (!entry.equals(value)) {
															if (!tag.equals(value)) {
																if (!array.equals(entry)) {
																	if (!array.equals(tag)) {
																		if (!array.equals(comment)) {
																			if (!array.equals(t2c)) {
																				if (!array.equals(expr)) {
																					if (!array.equals(e2e)) {
																						if (!array.equals(value)) {
																							if (!array.equals(c2c)) {
																								if (!comment.equals(
																										entry)) {
																									if (!comment.equals(
																											tag)) {
																										if (!comment
																												.equals(t2c)) {
																											if (!comment
																													.equals(expr)) {
																												if (!comment
																														.equals(e2e)) {
																													if (!comment
																															.equals(value)) {
																														if (!t2c.equals(
																																tag)) {
																															if (!t2c.equals(
																																	value)) {
																																if (!expr
																																		.equals(tag)) {
																																	if (!expr
																																			.equals(t2c)) {
																																		if (!expr
																																				.equals(value)) {
																																			if (!e2e.equals(
																																					entry)) {
																																				if (!e2e.equals(
																																						tag)) {
																																					if (!e2e.equals(
																																							t2c)) {
																																						if (!e2e.equals(
																																								expr)) {
																																							if (!e2e.equals(
																																									value)) {
																																								if (!c2c.equals(
																																										entry)) {
																																									if (!c2c.equals(
																																											tag)) {
																																										if (!c2c.equals(
																																												comment)) {
																																											if (!c2c.equals(
																																													t2c)) {
																																												if (!c2c.equals(
																																														expr)) {
																																													if (!c2c.equals(
																																															e2e)) {
																																														if (!c2c.equals(
																																																value)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	annotation,
																																																	entry,
																																																	tag,
																																																	array,
																																																	comment,
																																																	t2c,
																																																	expr,
																																																	e2e,
																																																	value,
																																																	c2c };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject entry, EObject tag, EObject array, EObject expr, EObject e2e) {
		EMoflonEdge tag__entry____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge array__expr____expressions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge e2e__entry____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge e2e__expr____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge entry__tag____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaAnnotationValueEntry2Comment";
		String tag__entry____ownedComment_name_prime = "ownedComment";
		String array__expr____expressions_name_prime = "expressions";
		String e2e__entry____target_name_prime = "target";
		String e2e__expr____source_name_prime = "source";
		String entry__tag____annotatedElement_name_prime = "annotatedElement";
		tag__entry____ownedComment.setSrc(tag);
		tag__entry____ownedComment.setTrg(entry);
		ruleresult.getTranslatedEdges().add(tag__entry____ownedComment);
		array__expr____expressions.setSrc(array);
		array__expr____expressions.setTrg(expr);
		ruleresult.getCreatedEdges().add(array__expr____expressions);
		e2e__entry____target.setSrc(e2e);
		e2e__entry____target.setTrg(entry);
		ruleresult.getCreatedEdges().add(e2e__entry____target);
		e2e__expr____source.setSrc(e2e);
		e2e__expr____source.setTrg(expr);
		ruleresult.getCreatedEdges().add(e2e__expr____source);
		entry__tag____annotatedElement.setSrc(entry);
		entry__tag____annotatedElement.setTrg(tag);
		ruleresult.getTranslatedEdges().add(entry__tag____annotatedElement);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tag__entry____ownedComment.setName(tag__entry____ownedComment_name_prime);
		array__expr____expressions.setName(array__expr____expressions_name_prime);
		e2e__entry____target.setName(e2e__entry____target_name_prime);
		e2e__expr____source.setName(e2e__expr____source_name_prime);
		entry__tag____annotatedElement.setName(entry__tag____annotatedElement_name_prime);
		return new Object[] { ruleresult, entry, tag, array, expr, e2e, tag__entry____ownedComment,
				array__expr____expressions, e2e__entry____target, e2e__expr____source, entry__tag____annotatedElement };
	}

	public static final void pattern_JavaAnnotationValueEntry2Comment_11_5_registerobjects_expressionBBBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, PerformRuleResult ruleresult, EObject annotation, EObject entry,
			EObject tag, EObject array, EObject comment, EObject t2c, EObject expr, EObject e2e, EObject value,
			EObject c2c) {
		_this.registerObjects_BWD(ruleresult, annotation, entry, tag, array, comment, t2c, expr, e2e, value, c2c);

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
		EObject _localVariable_0 = match.getObject("entry");
		EObject _localVariable_1 = match.getObject("tag");
		EObject _localVariable_2 = match.getObject("comment");
		EObject tmpEntry = _localVariable_0;
		EObject tmpTag = _localVariable_1;
		EObject tmpComment = _localVariable_2;
		if (tmpEntry instanceof Comment) {
			Comment entry = (Comment) tmpEntry;
			if (tmpTag instanceof Comment) {
				Comment tag = (Comment) tmpTag;
				if (tmpComment instanceof Comment) {
					Comment comment = (Comment) tmpComment;
					return new Object[] { entry, tag, comment, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_12_2_corematch_blackFBBBFFFB(
			Comment entry, Comment tag, Comment comment, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					for (ASTNode2Element t2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(tag,
							ASTNode2Element.class, "target")) {
						ASTNode tmpValue = t2c.getSource();
						if (tmpValue instanceof AnnotationMemberValuePair) {
							AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
							for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(comment, ASTNode2Element.class, "target")) {
								if (!c2c.equals(t2c)) {
									ASTNode tmpAnnotation = c2c.getSource();
									if (tmpAnnotation instanceof Annotation) {
										Annotation annotation = (Annotation) tmpAnnotation;
										_result.add(new Object[] { annotation, entry, tag, comment, t2c, value, c2c,
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

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_12_3_findcontext_blackBBBFBBBB(
			Annotation annotation, Comment entry, Comment tag, Comment comment, ASTNode2Element t2c,
			AnnotationMemberValuePair value, ASTNode2Element c2c) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					if (!c2c.equals(t2c)) {
						if (tag.getOwnedComments().contains(entry)) {
							if (annotation.getValues().contains(value)) {
								if (comment.getOwnedComments().contains(tag)) {
									if (tag.equals(t2c.getTarget())) {
										if (value.equals(t2c.getSource())) {
											if (comment.equals(c2c.getTarget())) {
												if (annotation.equals(c2c.getSource())) {
													if (entry.getAnnotatedElements().contains(tag)) {
														Expression tmpArray = value.getValue();
														if (tmpArray instanceof ArrayInitializer) {
															ArrayInitializer array = (ArrayInitializer) tmpArray;
															_result.add(new Object[] { annotation, entry, tag, array,
																	comment, t2c, value, c2c });
														}

													}
												}
											}
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
			Annotation annotation, Comment entry, Comment tag, ArrayInitializer array, Comment comment,
			ASTNode2Element t2c, AnnotationMemberValuePair value, ASTNode2Element c2c) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tag__entry____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__tag____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__tag____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__value____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__array____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__comment____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge entry__tag____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tag__entry____ownedComment_name_prime = "ownedComment";
		String annotation__value____values_name_prime = "values";
		String comment__tag____ownedComment_name_prime = "ownedComment";
		String t2c__tag____target_name_prime = "target";
		String t2c__value____source_name_prime = "source";
		String value__array____value_name_prime = "value";
		String c2c__comment____target_name_prime = "target";
		String c2c__annotation____source_name_prime = "source";
		String entry__tag____annotatedElement_name_prime = "annotatedElement";
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(entry);
		isApplicableMatch.getAllContextElements().add(tag);
		isApplicableMatch.getAllContextElements().add(array);
		isApplicableMatch.getAllContextElements().add(comment);
		isApplicableMatch.getAllContextElements().add(t2c);
		isApplicableMatch.getAllContextElements().add(value);
		isApplicableMatch.getAllContextElements().add(c2c);
		tag__entry____ownedComment.setSrc(tag);
		tag__entry____ownedComment.setTrg(entry);
		isApplicableMatch.getAllContextElements().add(tag__entry____ownedComment);
		annotation__value____values.setSrc(annotation);
		annotation__value____values.setTrg(value);
		isApplicableMatch.getAllContextElements().add(annotation__value____values);
		comment__tag____ownedComment.setSrc(comment);
		comment__tag____ownedComment.setTrg(tag);
		isApplicableMatch.getAllContextElements().add(comment__tag____ownedComment);
		t2c__tag____target.setSrc(t2c);
		t2c__tag____target.setTrg(tag);
		isApplicableMatch.getAllContextElements().add(t2c__tag____target);
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
		tag__entry____ownedComment.setName(tag__entry____ownedComment_name_prime);
		annotation__value____values.setName(annotation__value____values_name_prime);
		comment__tag____ownedComment.setName(comment__tag____ownedComment_name_prime);
		t2c__tag____target.setName(t2c__tag____target_name_prime);
		t2c__value____source.setName(t2c__value____source_name_prime);
		value__array____value.setName(value__array____value_name_prime);
		c2c__comment____target.setName(c2c__comment____target_name_prime);
		c2c__annotation____source.setName(c2c__annotation____source_name_prime);
		entry__tag____annotatedElement.setName(entry__tag____annotatedElement_name_prime);
		return new Object[] { annotation, entry, tag, array, comment, t2c, value, c2c, isApplicableMatch,
				tag__entry____ownedComment, annotation__value____values, comment__tag____ownedComment,
				t2c__tag____target, t2c__value____source, value__array____value, c2c__comment____target,
				c2c__annotation____source, entry__tag____annotatedElement };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_bindingFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			Comment entry, Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c,
			AnnotationMemberValuePair value, ASTNode2Element c2c) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, annotation, entry, tag, array,
				comment, t2c, value, c2c);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, entry, tag, array, comment, t2c, value,
					c2c };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			Comment entry, Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c,
			AnnotationMemberValuePair value, ASTNode2Element c2c) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_binding = pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, annotation, entry, tag, array, comment, t2c, value, c2c);
		if (result_pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_black = pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, entry, tag, array, comment, t2c, value,
						c2c };
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
			Comment entry, Comment tag, Comment comment) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					for (Element __DEC_entry_annotatedElement_246678 : entry.getAnnotatedElements()) {
						if (!entry.equals(__DEC_entry_annotatedElement_246678)) {
							if (!tag.equals(__DEC_entry_annotatedElement_246678)) {
								if (!comment.equals(__DEC_entry_annotatedElement_246678)) {
									return new Object[] { entry, tag, comment };
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
			EMoflonEdge _edge_ownedComment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTag = _edge_ownedComment.getSrc();
		if (tmpTag instanceof Comment) {
			Comment tag = (Comment) tmpTag;
			EObject tmpEntry = _edge_ownedComment.getTrg();
			if (tmpEntry instanceof Comment) {
				Comment entry = (Comment) tmpEntry;
				if (!entry.equals(tag)) {
					if (tag.getOwnedComments().contains(entry)) {
						if (entry.getAnnotatedElements().contains(tag)) {
							for (Element tmpComment : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(tag, Element.class, "ownedComment")) {
								if (tmpComment instanceof Comment) {
									Comment comment = (Comment) tmpComment;
									if (!comment.equals(entry)) {
										if (!comment.equals(tag)) {
											if (pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_black_nac_0BBB(
													entry, tag, comment) == null) {
												if (pattern_JavaAnnotationValueEntry2Comment_20_2_testcorematchandDECs_black_nac_1BB(
														entry, comment) == null) {
													_result.add(
															new Object[] { entry, tag, comment, _edge_ownedComment });
												}
											}
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
			JavaAnnotationValueEntry2Comment _this, Match match, Comment entry, Comment tag, Comment comment) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, entry, tag, comment);
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
		for (AnnotationMemberValuePair __DEC_expr_value_19687 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(expr, AnnotationMemberValuePair.class, "value")) {
			if (!value.equals(__DEC_expr_value_19687)) {
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
									_result.add(new Object[] { annotation, array, expr, value, _edge_expressions });
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
			JavaAnnotationValueEntry2Comment _this, Match match, Annotation annotation, ArrayInitializer array,
			StringLiteral expr, AnnotationMemberValuePair value) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, annotation, array, expr, value);
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
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("annotation");
		EObject _localVariable_1 = targetMatch.getObject("entry");
		EObject _localVariable_2 = targetMatch.getObject("tag");
		EObject _localVariable_3 = sourceMatch.getObject("array");
		EObject _localVariable_4 = targetMatch.getObject("comment");
		EObject _localVariable_5 = sourceMatch.getObject("expr");
		EObject _localVariable_6 = sourceMatch.getObject("value");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpEntry = _localVariable_1;
		EObject tmpTag = _localVariable_2;
		EObject tmpArray = _localVariable_3;
		EObject tmpComment = _localVariable_4;
		EObject tmpExpr = _localVariable_5;
		EObject tmpValue = _localVariable_6;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpEntry instanceof Comment) {
				Comment entry = (Comment) tmpEntry;
				if (tmpTag instanceof Comment) {
					Comment tag = (Comment) tmpTag;
					if (tmpArray instanceof ArrayInitializer) {
						ArrayInitializer array = (ArrayInitializer) tmpArray;
						if (tmpComment instanceof Comment) {
							Comment comment = (Comment) tmpComment;
							if (tmpExpr instanceof StringLiteral) {
								StringLiteral expr = (StringLiteral) tmpExpr;
								if (tmpValue instanceof AnnotationMemberValuePair) {
									AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
									return new Object[] { annotation, entry, tag, array, comment, expr, value,
											sourceMatch, targetMatch };
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
			Annotation annotation, Comment entry, Comment tag, ArrayInitializer array, Comment comment,
			StringLiteral expr, AnnotationMemberValuePair value, Match sourceMatch, Match targetMatch) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { annotation, entry, tag, array, comment, expr, value, sourceMatch,
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
				sourceMatch, targetMatch);
		if (result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding != null) {
			Annotation annotation = (Annotation) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[0];
			Comment entry = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[1];
			Comment tag = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[2];
			ArrayInitializer array = (ArrayInitializer) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[3];
			Comment comment = (Comment) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[4];
			StringLiteral expr = (StringLiteral) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[5];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_black = pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					annotation, entry, tag, array, comment, expr, value, sourceMatch, targetMatch);
			if (result_pattern_JavaAnnotationValueEntry2Comment_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { annotation, entry, tag, array, comment, expr, value, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_bindingFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Annotation annotation, Comment entry, Comment tag,
			ArrayInitializer array, Comment comment, StringLiteral expr, AnnotationMemberValuePair value,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(annotation, entry, tag, array, comment, expr, value,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, annotation, entry, tag, array, comment, expr, value, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, Annotation annotation, Comment entry, Comment tag,
			ArrayInitializer array, Comment comment, StringLiteral expr, AnnotationMemberValuePair value,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_binding = pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, annotation, entry, tag, array, comment, expr, value, sourceMatch, targetMatch);
		if (result_pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_black = pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, annotation, entry, tag, array, comment, expr, value, sourceMatch,
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

	public static final Iterable<Object[]> pattern_JavaAnnotationValueEntry2Comment_24_5_matchcorrcontext_blackBBBFBFBB(
			Annotation annotation, Comment tag, Comment comment, AnnotationMemberValuePair value, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!comment.equals(tag)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (ASTNode2Element t2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(tag,
						ASTNode2Element.class, "target")) {
					if (value.equals(t2c.getSource())) {
						for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(comment, ASTNode2Element.class, "target")) {
							if (!c2c.equals(t2c)) {
								if (annotation.equals(c2c.getSource())) {
									_result.add(new Object[] { annotation, tag, comment, t2c, value, c2c, sourceMatch,
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
			Annotation annotation, Comment entry, Comment tag, ArrayInitializer array, Comment comment,
			StringLiteral expr, AnnotationMemberValuePair value, CCMatch ccMatch) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					return new Object[] { annotation, entry, tag, array, comment, expr, value, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_24_6_createcorrespondence_greenBBFB(
			Comment entry, StringLiteral expr, CCMatch ccMatch) {
		Expression2Comment e2e = UmlFactory.eINSTANCE.createExpression2Comment();
		e2e.setTarget(entry);
		e2e.setSource(expr);
		ccMatch.getCreateCorr().add(e2e);
		return new Object[] { entry, expr, e2e, ccMatch };
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
		for (AnnotationMemberValuePair __DEC_expr_value_393937 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(expr, AnnotationMemberValuePair.class, "value")) {
			if (!value.equals(__DEC_expr_value_393937)) {
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
			Annotation annotation, ArrayInitializer array, StringLiteral expr, AnnotationMemberValuePair value) {
		if (array.getExpressions().contains(expr)) {
			if (annotation.getValues().contains(value)) {
				if (array.equals(value.getValue())) {
					if (pattern_JavaAnnotationValueEntry2Comment_27_1_matchtggpattern_black_nac_0BB(expr,
							value) == null) {
						if (pattern_JavaAnnotationValueEntry2Comment_27_1_matchtggpattern_black_nac_1BB(value,
								expr) == null) {
							return new Object[] { annotation, array, expr, value };
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
			Comment entry, Comment tag, Comment comment) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					for (Element __DEC_entry_annotatedElement_582281 : entry.getAnnotatedElements()) {
						if (!entry.equals(__DEC_entry_annotatedElement_582281)) {
							if (!tag.equals(__DEC_entry_annotatedElement_582281)) {
								if (!comment.equals(__DEC_entry_annotatedElement_582281)) {
									return new Object[] { entry, tag, comment };
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_28_1_matchtggpattern_blackBBB(Comment entry,
			Comment tag, Comment comment) {
		if (!entry.equals(tag)) {
			if (!comment.equals(entry)) {
				if (!comment.equals(tag)) {
					if (tag.getOwnedComments().contains(entry)) {
						if (comment.getOwnedComments().contains(tag)) {
							if (entry.getAnnotatedElements().contains(tag)) {
								if (pattern_JavaAnnotationValueEntry2Comment_28_1_matchtggpattern_black_nac_0BBB(entry,
										tag, comment) == null) {
									if (pattern_JavaAnnotationValueEntry2Comment_28_1_matchtggpattern_black_nac_1BB(
											entry, comment) == null) {
										return new Object[] { entry, tag, comment };
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
			ModelgeneratorRuleResult ruleResult, Annotation annotation) {
		if (ruleResult.getSourceObjects().contains(annotation)) {
			return new Object[] { ruleResult, annotation };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AnnotationMemberValuePair value) {
		if (ruleResult.getSourceObjects().contains(value)) {
			return new Object[] { ruleResult, value };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ArrayInitializer array) {
		if (ruleResult.getSourceObjects().contains(array)) {
			return new Object[] { ruleResult, array };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element t2c) {
		if (ruleResult.getCorrObjects().contains(t2c)) {
			return new Object[] { ruleResult, t2c };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Comment tag) {
		if (ruleResult.getTargetObjects().contains(tag)) {
			return new Object[] { ruleResult, tag };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Comment comment) {
		if (ruleResult.getTargetObjects().contains(comment)) {
			return new Object[] { ruleResult, comment };
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
					ASTNode tmpValue = t2c.getSource();
					if (tmpValue instanceof AnnotationMemberValuePair) {
						AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
						Element tmpTag = t2c.getTarget();
						if (tmpTag instanceof Comment) {
							Comment tag = (Comment) tmpTag;
							Expression tmpArray = value.getValue();
							if (tmpArray instanceof ArrayInitializer) {
								ArrayInitializer array = (ArrayInitializer) tmpArray;
								if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_3BB(
										ruleResult, t2c) == null) {
									if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, value) == null) {
										if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_4BB(
												ruleResult, tag) == null) {
											if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, array) == null) {
												for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(value, Annotation.class, "values")) {
													if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, annotation) == null) {
														for (Element tmpComment : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(tag, Element.class,
																		"ownedComment")) {
															if (tmpComment instanceof Comment) {
																Comment comment = (Comment) tmpComment;
																if (!comment.equals(tag)) {
																	if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_5BB(
																			ruleResult, comment) == null) {
																		for (ASTNode2Element c2c : org.moflon.core.utilities.eMoflonEMFUtil
																				.getOppositeReferenceTyped(annotation,
																						ASTNode2Element.class,
																						"source")) {
																			if (!c2c.equals(t2c)) {
																				if (comment.equals(c2c.getTarget())) {
																					if (pattern_JavaAnnotationValueEntry2Comment_29_2_isapplicablecore_black_nac_6BB(
																							ruleResult, c2c) == null) {
																						_result.add(new Object[] {
																								t2cList, annotation,
																								value, array, t2c, tag,
																								comment, c2c,
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
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c, AnnotationMemberValuePair value,
			ASTNode2Element c2c, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, annotation, tag, array, comment, t2c,
				value, c2c, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, tag, array, comment, t2c, value, c2c,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			JavaAnnotationValueEntry2Comment _this, IsApplicableMatch isApplicableMatch, Annotation annotation,
			Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c, AnnotationMemberValuePair value,
			ASTNode2Element c2c, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_binding = pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, annotation, tag, array, comment, t2c, value, c2c, ruleResult);
		if (result_pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_black = pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValueEntry2Comment_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, tag, array, comment, t2c, value, c2c,
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

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_5_checknacs_blackBBBBBBB(
			Annotation annotation, Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c,
			AnnotationMemberValuePair value, ASTNode2Element c2c) {
		if (!comment.equals(tag)) {
			if (!c2c.equals(t2c)) {
				return new Object[] { annotation, tag, array, comment, t2c, value, c2c };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_6_perform_blackBBBBBBBB(
			Annotation annotation, Comment tag, ArrayInitializer array, Comment comment, ASTNode2Element t2c,
			AnnotationMemberValuePair value, ASTNode2Element c2c, ModelgeneratorRuleResult ruleResult) {
		if (!comment.equals(tag)) {
			if (!c2c.equals(t2c)) {
				return new Object[] { annotation, tag, array, comment, t2c, value, c2c, ruleResult };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValueEntry2Comment_29_6_perform_greenFBBFFBB(Comment tag,
			ArrayInitializer array, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Comment entry = UMLFactory.eINSTANCE.createComment();
		StringLiteral expr = JavaFactory.eINSTANCE.createStringLiteral();
		Expression2Comment e2e = UmlFactory.eINSTANCE.createExpression2Comment();
		Object _localVariable_0 = csp.getValue("entry", "body");
		Object _localVariable_1 = csp.getValue("expr", "escapedValue");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		tag.getOwnedComments().add(entry);
		entry.getAnnotatedElements().add(tag);
		ruleResult.getTargetObjects().add(entry);
		array.getExpressions().add(expr);
		ruleResult.getSourceObjects().add(expr);
		e2e.setTarget(entry);
		e2e.setSource(expr);
		ruleResult.getCorrObjects().add(e2e);
		String entry_body_prime = (String) _localVariable_0;
		String expr_escapedValue_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		entry.setBody(entry_body_prime);
		expr.setEscapedValue(expr_escapedValue_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { entry, tag, array, expr, e2e, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_JavaAnnotationValueEntry2Comment_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //JavaAnnotationValueEntry2CommentImpl
