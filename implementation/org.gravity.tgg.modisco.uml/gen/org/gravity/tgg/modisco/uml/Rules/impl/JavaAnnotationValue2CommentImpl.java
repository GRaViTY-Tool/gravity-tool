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

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.JavaAnnotationValue2Comment;
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
 * An implementation of the model object '<em><b>Java Annotation Value2 Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JavaAnnotationValue2CommentImpl extends AbstractRuleImpl implements JavaAnnotationValue2Comment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaAnnotationValue2CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getJavaAnnotationValue2Comment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, ArrayInitializer array, AnnotationMemberValuePair value,
			Annotation annotation) {

		Object[] result1_black = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_0_1_initialbindings_blackBBBBB(this, match, array, value,
						annotation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[array] = " + array + ", " + "[value] = " + value + ", "
					+ "[annotation] = " + annotation + ".");
		}

		Object[] result2_bindingAndBlack = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, array, value,
						annotation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[array] = " + array + ", " + "[value] = " + value + ", "
					+ "[annotation] = " + annotation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_0_4_collectelementstobetranslated_blackBBBB(match, array,
							value, annotation);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[array] = " + array
								+ ", " + "[value] = " + value + ", " + "[annotation] = " + annotation + ".");
			}
			JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_0_4_collectelementstobetranslated_greenBBBBFF(match, array,
							value, annotation);
			//nothing EMoflonEdge value__array____value = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge annotation__value____values = (EMoflonEdge) result4_green[5];

			Object[] result5_black = JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_0_5_collectcontextelements_blackBBBB(match, array, value,
							annotation);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[array] = " + array
								+ ", " + "[value] = " + value + ", " + "[annotation] = " + annotation + ".");
			}
			JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_0_5_collectcontextelements_greenBB(match, annotation);

			// 
			JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_0_6_registerobjectstomatch_expressionBBBBB(this, match, array,
							value, annotation);
			return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_0_7_expressionF();
		} else {
			return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ASTNode2Element a2c = (ASTNode2Element) result1_bindingAndBlack[0];
		ArrayInitializer array = (ArrayInitializer) result1_bindingAndBlack[1];
		Comment comment = (Comment) result1_bindingAndBlack[2];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result1_bindingAndBlack[3];
		Annotation annotation = (Annotation) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_1_1_performtransformation_greenFBBFB(comment, value, csp);
		ASTNode2Element c2c = (ASTNode2Element) result1_green[0];
		Comment tag = (Comment) result1_green[3];

		Object[] result2_black = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_1_2_collecttranslatedelements_blackBBBB(c2c, array, value, tag);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c2c] = " + c2c + ", "
					+ "[array] = " + array + ", " + "[value] = " + value + ", " + "[tag] = " + tag + ".");
		}
		Object[] result2_green = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_1_2_collecttranslatedelements_greenFBBBB(c2c, array, value, tag);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, a2c, c2c, array,
						comment, value, tag, annotation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2c] = " + a2c + ", " + "[c2c] = " + c2c + ", " + "[array] = " + array + ", "
					+ "[comment] = " + comment + ", " + "[value] = " + value + ", " + "[tag] = " + tag + ", "
					+ "[annotation] = " + annotation + ".");
		}
		JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, c2c, array, comment, value, tag, annotation);
		//nothing EMoflonEdge c2c__value____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge c2c__tag____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tag__comment____annotatedElement = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge comment__tag____ownedComment = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge value__array____value = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge annotation__value____values = (EMoflonEdge) result3_green[12];

		// 
		// 
		JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_1_5_registerobjects_expressionBBBBBBBBB(
				this, ruleresult, a2c, c2c, array, comment, value, tag, annotation);
		return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ArrayInitializer array = (ArrayInitializer) result2_binding[0];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_binding[1];
		Annotation annotation = (Annotation) result2_binding[2];
		for (Object[] result2_black : JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_2_2_corematch_blackFBFBBB(array, value, annotation, match)) {
			ASTNode2Element a2c = (ASTNode2Element) result2_black[0];
			Comment comment = (Comment) result2_black[2];
			// ForEach 
			for (Object[] result3_black : JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_2_3_findcontext_blackBBBBB(a2c, array, comment, value,
							annotation)) {
				Object[] result3_green = JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_2_3_findcontext_greenBBBBBFFFFF(a2c, array, comment, value,
								annotation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge a2c__comment____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge value__array____value = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge annotation__value____values = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge a2c__annotation____source = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, a2c, array, comment, value, annotation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a2c] = " + a2c + ", "
							+ "[array] = " + array + ", " + "[comment] = " + comment + ", " + "[value] = " + value
							+ ", " + "[annotation] = " + annotation + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = JavaAnnotationValue2CommentImpl
							.pattern_JavaAnnotationValue2Comment_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaAnnotationValue2CommentImpl
							.pattern_JavaAnnotationValue2Comment_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, ArrayInitializer array, AnnotationMemberValuePair value,
			Annotation annotation) {
		match.registerObject("array", array);
		match.registerObject("value", value);
		match.registerObject("annotation", annotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, ArrayInitializer array, AnnotationMemberValuePair value,
			Annotation annotation) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ASTNode2Element a2c,
			ArrayInitializer array, Comment comment, AnnotationMemberValuePair value, Annotation annotation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_value_name = CSPFactoryHelper.eINSTANCE.createVariable("value.name", true, csp);
		var_value_name.setValue(value.getName());
		var_value_name.setType("String");

		// Create unbound variables
		Variable var_tag_body = CSPFactoryHelper.eINSTANCE.createVariable("tag.body", csp);
		var_tag_body.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_value_name, var_tag_body);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a2c", a2c);
		isApplicableMatch.registerObject("array", array);
		isApplicableMatch.registerObject("comment", comment);
		isApplicableMatch.registerObject("value", value);
		isApplicableMatch.registerObject("annotation", annotation);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a2c, EObject c2c, EObject array,
			EObject comment, EObject value, EObject tag, EObject annotation) {
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("c2c", c2c);
		ruleresult.registerObject("array", array);
		ruleresult.registerObject("comment", comment);
		ruleresult.registerObject("value", value);
		ruleresult.registerObject("tag", tag);
		ruleresult.registerObject("annotation", annotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("array").eClass())
						.equals("java.ArrayInitializer.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("value").eClass())
						.equals("java.AnnotationMemberValuePair.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Comment comment, Comment tag) {

		Object[] result1_black = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_10_1_initialbindings_blackBBBB(this, match, comment, tag);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[comment] = " + comment + ", " + "[tag] = " + tag + ".");
		}

		Object[] result2_bindingAndBlack = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, comment, tag);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[comment] = " + comment + ", " + "[tag] = " + tag + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_10_4_collectelementstobetranslated_blackBBB(match, comment,
							tag);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[comment] = " + comment + ", " + "[tag] = " + tag + ".");
			}
			JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_10_4_collectelementstobetranslated_greenBBBFF(match, comment,
							tag);
			//nothing EMoflonEdge tag__comment____annotatedElement = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge comment__tag____ownedComment = (EMoflonEdge) result4_green[4];

			Object[] result5_black = JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_10_5_collectcontextelements_blackBBB(match, comment, tag);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[comment] = " + comment + ", " + "[tag] = " + tag + ".");
			}
			JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_10_5_collectcontextelements_greenBB(match, comment);

			// 
			JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_10_6_registerobjectstomatch_expressionBBBB(this, match,
							comment, tag);
			return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_10_7_expressionF();
		} else {
			return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ASTNode2Element a2c = (ASTNode2Element) result1_bindingAndBlack[0];
		Comment comment = (Comment) result1_bindingAndBlack[1];
		Comment tag = (Comment) result1_bindingAndBlack[2];
		Annotation annotation = (Annotation) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_11_1_performtransformation_greenFFFBBB(tag, annotation, csp);
		ASTNode2Element c2c = (ASTNode2Element) result1_green[0];
		ArrayInitializer array = (ArrayInitializer) result1_green[1];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result1_green[2];

		Object[] result2_black = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_11_2_collecttranslatedelements_blackBBBB(c2c, array, value, tag);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[c2c] = " + c2c + ", "
					+ "[array] = " + array + ", " + "[value] = " + value + ", " + "[tag] = " + tag + ".");
		}
		Object[] result2_green = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_11_2_collecttranslatedelements_greenFBBBB(c2c, array, value, tag);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, a2c, c2c, array,
						comment, value, tag, annotation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2c] = " + a2c + ", " + "[c2c] = " + c2c + ", " + "[array] = " + array + ", "
					+ "[comment] = " + comment + ", " + "[value] = " + value + ", " + "[tag] = " + tag + ", "
					+ "[annotation] = " + annotation + ".");
		}
		JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, c2c, array, comment, value, tag, annotation);
		//nothing EMoflonEdge c2c__value____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge c2c__tag____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tag__comment____annotatedElement = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge comment__tag____ownedComment = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge value__array____value = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge annotation__value____values = (EMoflonEdge) result3_green[12];

		// 
		// 
		JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_11_5_registerobjects_expressionBBBBBBBBB(
				this, ruleresult, a2c, c2c, array, comment, value, tag, annotation);
		return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Comment comment = (Comment) result2_binding[0];
		Comment tag = (Comment) result2_binding[1];
		for (Object[] result2_black : JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_12_2_corematch_blackFBBFB(comment, tag, match)) {
			ASTNode2Element a2c = (ASTNode2Element) result2_black[0];
			Annotation annotation = (Annotation) result2_black[3];
			// ForEach 
			for (Object[] result3_black : JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_12_3_findcontext_blackBBBB(a2c, comment, tag, annotation)) {
				Object[] result3_green = JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_12_3_findcontext_greenBBBBFFFFF(a2c, comment, tag,
								annotation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge tag__comment____annotatedElement = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge comment__tag____ownedComment = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge a2c__comment____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge a2c__annotation____source = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, a2c, comment, tag, annotation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a2c] = " + a2c + ", "
							+ "[comment] = " + comment + ", " + "[tag] = " + tag + ", " + "[annotation] = " + annotation
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = JavaAnnotationValue2CommentImpl
							.pattern_JavaAnnotationValue2Comment_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaAnnotationValue2CommentImpl
							.pattern_JavaAnnotationValue2Comment_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Comment comment, Comment tag) {
		match.registerObject("comment", comment);
		match.registerObject("tag", tag);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Comment comment, Comment tag) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element a2c, Comment comment,
			Comment tag, Annotation annotation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tag_body = CSPFactoryHelper.eINSTANCE.createVariable("tag.body", true, csp);
		var_tag_body.setValue(tag.getBody());
		var_tag_body.setType("String");

		// Create unbound variables
		Variable var_value_name = CSPFactoryHelper.eINSTANCE.createVariable("value.name", csp);
		var_value_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_value_name, var_tag_body);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a2c", a2c);
		isApplicableMatch.registerObject("comment", comment);
		isApplicableMatch.registerObject("tag", tag);
		isApplicableMatch.registerObject("annotation", annotation);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a2c, EObject c2c, EObject array,
			EObject comment, EObject value, EObject tag, EObject annotation) {
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("c2c", c2c);
		ruleresult.registerObject("array", array);
		ruleresult.registerObject("comment", comment);
		ruleresult.registerObject("value", value);
		ruleresult.registerObject("tag", tag);
		ruleresult.registerObject("annotation", annotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tag").eClass()).equals("uml.Comment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_151(EMoflonEdge _edge_annotatedElement) {

		Object[] result1_bindingAndBlack = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_20_2_testcorematchandDECs_blackFFB(_edge_annotatedElement)) {
			Comment comment = (Comment) result2_black[0];
			Comment tag = (Comment) result2_black[1];
			Object[] result2_green = JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, comment, tag)) {
				// 
				if (JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaAnnotationValue2CommentImpl
							.pattern_JavaAnnotationValue2Comment_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaAnnotationValue2CommentImpl
							.pattern_JavaAnnotationValue2Comment_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_163(EMoflonEdge _edge_value) {

		Object[] result1_bindingAndBlack = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_21_2_testcorematchandDECs_blackFFFB(_edge_value)) {
			ArrayInitializer array = (ArrayInitializer) result2_black[0];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_black[1];
			Annotation annotation = (Annotation) result2_black[2];
			Object[] result2_green = JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, array, value, annotation)) {
				// 
				if (JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaAnnotationValue2CommentImpl
							.pattern_JavaAnnotationValue2Comment_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaAnnotationValue2CommentImpl
							.pattern_JavaAnnotationValue2Comment_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("JavaAnnotationValue2Comment");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tag_body = CSPFactoryHelper.eINSTANCE.createVariable("tag", true, csp);
		var_tag_body.setValue(__helper.getValue("tag", "body"));
		var_tag_body.setType("String");

		Variable var_value_name = CSPFactoryHelper.eINSTANCE.createVariable("value", true, csp);
		var_value_name.setValue(__helper.getValue("value", "name"));
		var_value_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("JavaAnnotationValue2Comment");
		eq0.solve(var_value_name, var_tag_body);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tag_body.setBound(false);
			eq0.solve(var_value_name, var_tag_body);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tag", "body", var_tag_body.getValue());
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
		ruleResult.setRule("JavaAnnotationValue2Comment");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tag_body = CSPFactoryHelper.eINSTANCE.createVariable("tag", true, csp);
		var_tag_body.setValue(__helper.getValue("tag", "body"));
		var_tag_body.setType("String");

		Variable var_value_name = CSPFactoryHelper.eINSTANCE.createVariable("value", true, csp);
		var_value_name.setValue(__helper.getValue("value", "name"));
		var_value_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("JavaAnnotationValue2Comment");
		eq0.solve(var_value_name, var_tag_body);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_value_name.setBound(false);
			eq0.solve(var_value_name, var_tag_body);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("value", "name", var_value_name.getValue());
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

		Object[] result1_black = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		ArrayInitializer array = (ArrayInitializer) result2_bindingAndBlack[0];
		Comment comment = (Comment) result2_bindingAndBlack[1];
		AnnotationMemberValuePair value = (AnnotationMemberValuePair) result2_bindingAndBlack[2];
		Comment tag = (Comment) result2_bindingAndBlack[3];
		Annotation annotation = (Annotation) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, array, comment, value,
						tag, annotation, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[array] = " + array + ", " + "[comment] = " + comment + ", " + "[value] = " + value + ", "
					+ "[tag] = " + tag + ", " + "[annotation] = " + annotation + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_24_5_matchcorrcontext_blackFBBBB(comment, annotation,
							sourceMatch, targetMatch)) {
				ASTNode2Element a2c = (ASTNode2Element) result5_black[0];
				Object[] result5_green = JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_24_5_matchcorrcontext_greenBBBF(a2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_24_6_createcorrespondence_blackBBBBBB(array, comment,
								value, tag, annotation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[array] = " + array + ", "
							+ "[comment] = " + comment + ", " + "[value] = " + value + ", " + "[tag] = " + tag + ", "
							+ "[annotation] = " + annotation + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_24_6_createcorrespondence_greenFBBB(value, tag, ccMatch);
				//nothing ASTNode2Element c2c = (ASTNode2Element) result6_green[0];

				Object[] result7_black = JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(ArrayInitializer array, Comment comment, AnnotationMemberValuePair value,
			Comment tag, Annotation annotation, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_value_name = CSPFactoryHelper.eINSTANCE.createVariable("value.name", true, csp);
		var_value_name.setValue(value.getName());
		var_value_name.setType("String");
		Variable var_tag_body = CSPFactoryHelper.eINSTANCE.createVariable("tag.body", true, csp);
		var_tag_body.setValue(tag.getBody());
		var_tag_body.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_value_name, var_tag_body);
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
	public boolean checkDEC_FWD(ArrayInitializer array, AnnotationMemberValuePair value, Annotation annotation) {// 
		Object[] result1_black = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_27_1_matchtggpattern_blackBBB(array, value, annotation);
		if (result1_black != null) {
			return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_27_2_expressionF();
		} else {
			return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Comment comment, Comment tag) {// 
		Object[] result1_black = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_28_1_matchtggpattern_blackBB(comment, tag);
		if (result1_black != null) {
			return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_28_2_expressionF();
		} else {
			return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element a2cParameter) {

		Object[] result1_black = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : JavaAnnotationValue2CommentImpl
				.pattern_JavaAnnotationValue2Comment_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList a2cList = (RuleEntryList) result2_black[0];
			ASTNode2Element a2c = (ASTNode2Element) result2_black[1];
			Comment comment = (Comment) result2_black[2];
			Annotation annotation = (Annotation) result2_black[3];

			Object[] result3_bindingAndBlack = JavaAnnotationValue2CommentImpl
					.pattern_JavaAnnotationValue2Comment_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							a2c, comment, annotation, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[a2c] = " + a2c + ", " + "[comment] = "
						+ comment + ", " + "[annotation] = " + annotation + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = JavaAnnotationValue2CommentImpl
						.pattern_JavaAnnotationValue2Comment_29_5_checknacs_blackBBB(a2c, comment, annotation);
				if (result5_black != null) {

					Object[] result6_black = JavaAnnotationValue2CommentImpl
							.pattern_JavaAnnotationValue2Comment_29_6_perform_blackBBBB(a2c, comment, annotation,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2c] = " + a2c + ", "
								+ "[comment] = " + comment + ", " + "[annotation] = " + annotation + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_29_6_perform_greenFFBFFBBB(
							comment, annotation, ruleResult, csp);
					//nothing ASTNode2Element c2c = (ASTNode2Element) result6_green[0];
					//nothing ArrayInitializer array = (ArrayInitializer) result6_green[1];
					//nothing AnnotationMemberValuePair value = (AnnotationMemberValuePair) result6_green[3];
					//nothing Comment tag = (Comment) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return JavaAnnotationValue2CommentImpl.pattern_JavaAnnotationValue2Comment_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element a2c, Comment comment,
			Annotation annotation, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_value_name = CSPFactoryHelper.eINSTANCE.createVariable("value.name", csp);
		var_value_name.setType("String");
		Variable var_tag_body = CSPFactoryHelper.eINSTANCE.createVariable("tag.body", csp);
		var_tag_body.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_value_name, var_tag_body);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("a2c", a2c);
		isApplicableMatch.registerObject("comment", comment);
		isApplicableMatch.registerObject("annotation", annotation);
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
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPROPRIATE_FWD__MATCH_ARRAYINITIALIZER_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			return isAppropriate_FWD((Match) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (Annotation) arguments.get(3));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ARRAYINITIALIZER_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (Annotation) arguments.get(3));
			return null;
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ARRAYINITIALIZER_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (ArrayInitializer) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (Annotation) arguments.get(3));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_ARRAYINITIALIZER_COMMENT_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ArrayInitializer) arguments.get(2), (Comment) arguments.get(3),
					(AnnotationMemberValuePair) arguments.get(4), (Annotation) arguments.get(5));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPROPRIATE_BWD__MATCH_COMMENT_COMMENT:
			return isAppropriate_BWD((Match) arguments.get(0), (Comment) arguments.get(1), (Comment) arguments.get(2));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMENT_COMMENT:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Comment) arguments.get(1),
					(Comment) arguments.get(2));
			return null;
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMENT_COMMENT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Comment) arguments.get(1),
					(Comment) arguments.get(2));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_COMMENT_COMMENT_ANNOTATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(Comment) arguments.get(2), (Comment) arguments.get(3), (Annotation) arguments.get(4));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_151__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_151((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_163__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_163((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPLICABLE_SOLVE_CSP_CC__ARRAYINITIALIZER_COMMENT_ANNOTATIONMEMBERVALUEPAIR_COMMENT_ANNOTATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((ArrayInitializer) arguments.get(0), (Comment) arguments.get(1),
					(AnnotationMemberValuePair) arguments.get(2), (Comment) arguments.get(3),
					(Annotation) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___CHECK_DEC_FWD__ARRAYINITIALIZER_ANNOTATIONMEMBERVALUEPAIR_ANNOTATION:
			return checkDEC_FWD((ArrayInitializer) arguments.get(0), (AnnotationMemberValuePair) arguments.get(1),
					(Annotation) arguments.get(2));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___CHECK_DEC_BWD__COMMENT_COMMENT:
			return checkDEC_BWD((Comment) arguments.get(0), (Comment) arguments.get(1));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_COMMENT_ANNOTATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(Comment) arguments.get(2), (Annotation) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.JAVA_ANNOTATION_VALUE2_COMMENT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_0_1_initialbindings_blackBBBBB(
			JavaAnnotationValue2Comment _this, Match match, ArrayInitializer array, AnnotationMemberValuePair value,
			Annotation annotation) {
		return new Object[] { _this, match, array, value, annotation };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_bindingFBBBBB(
			JavaAnnotationValue2Comment _this, Match match, ArrayInitializer array, AnnotationMemberValuePair value,
			Annotation annotation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, array, value, annotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, array, value, annotation };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_bindingAndBlackFBBBBB(
			JavaAnnotationValue2Comment _this, Match match, ArrayInitializer array, AnnotationMemberValuePair value,
			Annotation annotation) {
		Object[] result_pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_binding = pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_bindingFBBBBB(
				_this, match, array, value, annotation);
		if (result_pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_black = pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValue2Comment_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, array, value, annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_0_3_CheckCSP_expressionFBB(
			JavaAnnotationValue2Comment _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_0_4_collectelementstobetranslated_blackBBBB(
			Match match, ArrayInitializer array, AnnotationMemberValuePair value, Annotation annotation) {
		return new Object[] { match, array, value, annotation };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_0_4_collectelementstobetranslated_greenBBBBFF(
			Match match, ArrayInitializer array, AnnotationMemberValuePair value, Annotation annotation) {
		EMoflonEdge value__array____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(array);
		match.getToBeTranslatedNodes().add(value);
		String value__array____value_name_prime = "value";
		String annotation__value____values_name_prime = "values";
		value__array____value.setSrc(value);
		value__array____value.setTrg(array);
		match.getToBeTranslatedEdges().add(value__array____value);
		annotation__value____values.setSrc(annotation);
		annotation__value____values.setTrg(value);
		match.getToBeTranslatedEdges().add(annotation__value____values);
		value__array____value.setName(value__array____value_name_prime);
		annotation__value____values.setName(annotation__value____values_name_prime);
		return new Object[] { match, array, value, annotation, value__array____value, annotation__value____values };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_0_5_collectcontextelements_blackBBBB(Match match,
			ArrayInitializer array, AnnotationMemberValuePair value, Annotation annotation) {
		return new Object[] { match, array, value, annotation };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_0_5_collectcontextelements_greenBB(Match match,
			Annotation annotation) {
		match.getContextNodes().add(annotation);
		return new Object[] { match, annotation };
	}

	public static final void pattern_JavaAnnotationValue2Comment_0_6_registerobjectstomatch_expressionBBBBB(
			JavaAnnotationValue2Comment _this, Match match, ArrayInitializer array, AnnotationMemberValuePair value,
			Annotation annotation) {
		_this.registerObjectsToMatch_FWD(match, array, value, annotation);

	}

	public static final boolean pattern_JavaAnnotationValue2Comment_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("a2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("array");
		EObject _localVariable_2 = isApplicableMatch.getObject("comment");
		EObject _localVariable_3 = isApplicableMatch.getObject("value");
		EObject _localVariable_4 = isApplicableMatch.getObject("annotation");
		EObject tmpA2c = _localVariable_0;
		EObject tmpArray = _localVariable_1;
		EObject tmpComment = _localVariable_2;
		EObject tmpValue = _localVariable_3;
		EObject tmpAnnotation = _localVariable_4;
		if (tmpA2c instanceof ASTNode2Element) {
			ASTNode2Element a2c = (ASTNode2Element) tmpA2c;
			if (tmpArray instanceof ArrayInitializer) {
				ArrayInitializer array = (ArrayInitializer) tmpArray;
				if (tmpComment instanceof Comment) {
					Comment comment = (Comment) tmpComment;
					if (tmpValue instanceof AnnotationMemberValuePair) {
						AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
						if (tmpAnnotation instanceof Annotation) {
							Annotation annotation = (Annotation) tmpAnnotation;
							return new Object[] { a2c, array, comment, value, annotation, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_1_1_performtransformation_blackBBBBBFBB(
			ASTNode2Element a2c, ArrayInitializer array, Comment comment, AnnotationMemberValuePair value,
			Annotation annotation, JavaAnnotationValue2Comment _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { a2c, array, comment, value, annotation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			JavaAnnotationValue2Comment _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaAnnotationValue2Comment_1_1_performtransformation_binding = pattern_JavaAnnotationValue2Comment_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaAnnotationValue2Comment_1_1_performtransformation_binding != null) {
			ASTNode2Element a2c = (ASTNode2Element) result_pattern_JavaAnnotationValue2Comment_1_1_performtransformation_binding[0];
			ArrayInitializer array = (ArrayInitializer) result_pattern_JavaAnnotationValue2Comment_1_1_performtransformation_binding[1];
			Comment comment = (Comment) result_pattern_JavaAnnotationValue2Comment_1_1_performtransformation_binding[2];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result_pattern_JavaAnnotationValue2Comment_1_1_performtransformation_binding[3];
			Annotation annotation = (Annotation) result_pattern_JavaAnnotationValue2Comment_1_1_performtransformation_binding[4];

			Object[] result_pattern_JavaAnnotationValue2Comment_1_1_performtransformation_black = pattern_JavaAnnotationValue2Comment_1_1_performtransformation_blackBBBBBFBB(
					a2c, array, comment, value, annotation, _this, isApplicableMatch);
			if (result_pattern_JavaAnnotationValue2Comment_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaAnnotationValue2Comment_1_1_performtransformation_black[5];

				return new Object[] { a2c, array, comment, value, annotation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_1_1_performtransformation_greenFBBFB(
			Comment comment, AnnotationMemberValuePair value, CSP csp) {
		ASTNode2Element c2c = UmlFactory.eINSTANCE.createASTNode2Element();
		Comment tag = UMLFactory.eINSTANCE.createComment();
		Object _localVariable_0 = csp.getValue("tag", "body");
		c2c.setSource(value);
		c2c.setTarget(tag);
		tag.getAnnotatedElements().add(comment);
		comment.getOwnedComments().add(tag);
		String tag_body_prime = (String) _localVariable_0;
		tag.setBody(tag_body_prime);
		return new Object[] { c2c, comment, value, tag, csp };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_1_2_collecttranslatedelements_blackBBBB(
			ASTNode2Element c2c, ArrayInitializer array, AnnotationMemberValuePair value, Comment tag) {
		return new Object[] { c2c, array, value, tag };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_1_2_collecttranslatedelements_greenFBBBB(
			ASTNode2Element c2c, ArrayInitializer array, AnnotationMemberValuePair value, Comment tag) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2c);
		ruleresult.getTranslatedElements().add(array);
		ruleresult.getTranslatedElements().add(value);
		ruleresult.getCreatedElements().add(tag);
		return new Object[] { ruleresult, c2c, array, value, tag };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2c, EObject c2c, EObject array, EObject comment, EObject value,
			EObject tag, EObject annotation) {
		if (!a2c.equals(c2c)) {
			if (!a2c.equals(array)) {
				if (!a2c.equals(comment)) {
					if (!a2c.equals(value)) {
						if (!a2c.equals(tag)) {
							if (!a2c.equals(annotation)) {
								if (!c2c.equals(comment)) {
									if (!c2c.equals(value)) {
										if (!c2c.equals(tag)) {
											if (!array.equals(c2c)) {
												if (!array.equals(comment)) {
													if (!array.equals(value)) {
														if (!array.equals(tag)) {
															if (!comment.equals(value)) {
																if (!comment.equals(tag)) {
																	if (!tag.equals(value)) {
																		if (!annotation.equals(c2c)) {
																			if (!annotation.equals(array)) {
																				if (!annotation.equals(comment)) {
																					if (!annotation.equals(value)) {
																						if (!annotation.equals(tag)) {
																							return new Object[] {
																									ruleresult, a2c,
																									c2c, array, comment,
																									value, tag,
																									annotation };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaAnnotationValue2Comment_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject c2c, EObject array, EObject comment, EObject value, EObject tag,
			EObject annotation) {
		EMoflonEdge c2c__value____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__tag____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tag__comment____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__tag____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__array____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaAnnotationValue2Comment";
		String c2c__value____source_name_prime = "source";
		String c2c__tag____target_name_prime = "target";
		String tag__comment____annotatedElement_name_prime = "annotatedElement";
		String comment__tag____ownedComment_name_prime = "ownedComment";
		String value__array____value_name_prime = "value";
		String annotation__value____values_name_prime = "values";
		c2c__value____source.setSrc(c2c);
		c2c__value____source.setTrg(value);
		ruleresult.getCreatedEdges().add(c2c__value____source);
		c2c__tag____target.setSrc(c2c);
		c2c__tag____target.setTrg(tag);
		ruleresult.getCreatedEdges().add(c2c__tag____target);
		tag__comment____annotatedElement.setSrc(tag);
		tag__comment____annotatedElement.setTrg(comment);
		ruleresult.getCreatedEdges().add(tag__comment____annotatedElement);
		comment__tag____ownedComment.setSrc(comment);
		comment__tag____ownedComment.setTrg(tag);
		ruleresult.getCreatedEdges().add(comment__tag____ownedComment);
		value__array____value.setSrc(value);
		value__array____value.setTrg(array);
		ruleresult.getTranslatedEdges().add(value__array____value);
		annotation__value____values.setSrc(annotation);
		annotation__value____values.setTrg(value);
		ruleresult.getTranslatedEdges().add(annotation__value____values);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c2c__value____source.setName(c2c__value____source_name_prime);
		c2c__tag____target.setName(c2c__tag____target_name_prime);
		tag__comment____annotatedElement.setName(tag__comment____annotatedElement_name_prime);
		comment__tag____ownedComment.setName(comment__tag____ownedComment_name_prime);
		value__array____value.setName(value__array____value_name_prime);
		annotation__value____values.setName(annotation__value____values_name_prime);
		return new Object[] { ruleresult, c2c, array, comment, value, tag, annotation, c2c__value____source,
				c2c__tag____target, tag__comment____annotatedElement, comment__tag____ownedComment,
				value__array____value, annotation__value____values };
	}

	public static final void pattern_JavaAnnotationValue2Comment_1_5_registerobjects_expressionBBBBBBBBB(
			JavaAnnotationValue2Comment _this, PerformRuleResult ruleresult, EObject a2c, EObject c2c, EObject array,
			EObject comment, EObject value, EObject tag, EObject annotation) {
		_this.registerObjects_FWD(ruleresult, a2c, c2c, array, comment, value, tag, annotation);

	}

	public static final PerformRuleResult pattern_JavaAnnotationValue2Comment_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_bindingFB(
			JavaAnnotationValue2Comment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_blackFBB(EClass eClass,
			JavaAnnotationValue2Comment _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_bindingAndBlackFFB(
			JavaAnnotationValue2Comment _this) {
		Object[] result_pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_binding = pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_black = pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaAnnotationValue2Comment";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("array");
		EObject _localVariable_1 = match.getObject("value");
		EObject _localVariable_2 = match.getObject("annotation");
		EObject tmpArray = _localVariable_0;
		EObject tmpValue = _localVariable_1;
		EObject tmpAnnotation = _localVariable_2;
		if (tmpArray instanceof ArrayInitializer) {
			ArrayInitializer array = (ArrayInitializer) tmpArray;
			if (tmpValue instanceof AnnotationMemberValuePair) {
				AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
				if (tmpAnnotation instanceof Annotation) {
					Annotation annotation = (Annotation) tmpAnnotation;
					return new Object[] { array, value, annotation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValue2Comment_2_2_corematch_blackFBFBBB(
			ArrayInitializer array, AnnotationMemberValuePair value, Annotation annotation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(annotation,
				ASTNode2Element.class, "source")) {
			Element tmpComment = a2c.getTarget();
			if (tmpComment instanceof Comment) {
				Comment comment = (Comment) tmpComment;
				_result.add(new Object[] { a2c, array, comment, value, annotation, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValue2Comment_2_3_findcontext_blackBBBBB(
			ASTNode2Element a2c, ArrayInitializer array, Comment comment, AnnotationMemberValuePair value,
			Annotation annotation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (comment.equals(a2c.getTarget())) {
			if (array.equals(value.getValue())) {
				if (annotation.getValues().contains(value)) {
					if (annotation.equals(a2c.getSource())) {
						_result.add(new Object[] { a2c, array, comment, value, annotation });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_3_findcontext_greenBBBBBFFFFF(
			ASTNode2Element a2c, ArrayInitializer array, Comment comment, AnnotationMemberValuePair value,
			Annotation annotation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge a2c__comment____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__array____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String a2c__comment____target_name_prime = "target";
		String value__array____value_name_prime = "value";
		String annotation__value____values_name_prime = "values";
		String a2c__annotation____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(a2c);
		isApplicableMatch.getAllContextElements().add(array);
		isApplicableMatch.getAllContextElements().add(comment);
		isApplicableMatch.getAllContextElements().add(value);
		isApplicableMatch.getAllContextElements().add(annotation);
		a2c__comment____target.setSrc(a2c);
		a2c__comment____target.setTrg(comment);
		isApplicableMatch.getAllContextElements().add(a2c__comment____target);
		value__array____value.setSrc(value);
		value__array____value.setTrg(array);
		isApplicableMatch.getAllContextElements().add(value__array____value);
		annotation__value____values.setSrc(annotation);
		annotation__value____values.setTrg(value);
		isApplicableMatch.getAllContextElements().add(annotation__value____values);
		a2c__annotation____source.setSrc(a2c);
		a2c__annotation____source.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(a2c__annotation____source);
		a2c__comment____target.setName(a2c__comment____target_name_prime);
		value__array____value.setName(value__array____value_name_prime);
		annotation__value____values.setName(annotation__value____values_name_prime);
		a2c__annotation____source.setName(a2c__annotation____source_name_prime);
		return new Object[] { a2c, array, comment, value, annotation, isApplicableMatch, a2c__comment____target,
				value__array____value, annotation__value____values, a2c__annotation____source };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_4_solveCSP_bindingFBBBBBBB(
			JavaAnnotationValue2Comment _this, IsApplicableMatch isApplicableMatch, ASTNode2Element a2c,
			ArrayInitializer array, Comment comment, AnnotationMemberValuePair value, Annotation annotation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, a2c, array, comment, value,
				annotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a2c, array, comment, value, annotation };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			JavaAnnotationValue2Comment _this, IsApplicableMatch isApplicableMatch, ASTNode2Element a2c,
			ArrayInitializer array, Comment comment, AnnotationMemberValuePair value, Annotation annotation) {
		Object[] result_pattern_JavaAnnotationValue2Comment_2_4_solveCSP_binding = pattern_JavaAnnotationValue2Comment_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, a2c, array, comment, value, annotation);
		if (result_pattern_JavaAnnotationValue2Comment_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValue2Comment_2_4_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValue2Comment_2_4_solveCSP_black = pattern_JavaAnnotationValue2Comment_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValue2Comment_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a2c, array, comment, value, annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_2_5_checkCSP_expressionFBB(
			JavaAnnotationValue2Comment _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaAnnotationValue2Comment";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaAnnotationValue2Comment_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_10_1_initialbindings_blackBBBB(
			JavaAnnotationValue2Comment _this, Match match, Comment comment, Comment tag) {
		if (!comment.equals(tag)) {
			return new Object[] { _this, match, comment, tag };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_bindingFBBBB(
			JavaAnnotationValue2Comment _this, Match match, Comment comment, Comment tag) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, comment, tag);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, comment, tag };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_bindingAndBlackFBBBB(
			JavaAnnotationValue2Comment _this, Match match, Comment comment, Comment tag) {
		Object[] result_pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_binding = pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_bindingFBBBB(
				_this, match, comment, tag);
		if (result_pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_black = pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValue2Comment_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, comment, tag };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_10_3_CheckCSP_expressionFBB(
			JavaAnnotationValue2Comment _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_10_4_collectelementstobetranslated_blackBBB(
			Match match, Comment comment, Comment tag) {
		if (!comment.equals(tag)) {
			return new Object[] { match, comment, tag };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Comment comment, Comment tag) {
		EMoflonEdge tag__comment____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__tag____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tag);
		String tag__comment____annotatedElement_name_prime = "annotatedElement";
		String comment__tag____ownedComment_name_prime = "ownedComment";
		tag__comment____annotatedElement.setSrc(tag);
		tag__comment____annotatedElement.setTrg(comment);
		match.getToBeTranslatedEdges().add(tag__comment____annotatedElement);
		comment__tag____ownedComment.setSrc(comment);
		comment__tag____ownedComment.setTrg(tag);
		match.getToBeTranslatedEdges().add(comment__tag____ownedComment);
		tag__comment____annotatedElement.setName(tag__comment____annotatedElement_name_prime);
		comment__tag____ownedComment.setName(comment__tag____ownedComment_name_prime);
		return new Object[] { match, comment, tag, tag__comment____annotatedElement, comment__tag____ownedComment };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_10_5_collectcontextelements_blackBBB(Match match,
			Comment comment, Comment tag) {
		if (!comment.equals(tag)) {
			return new Object[] { match, comment, tag };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_10_5_collectcontextelements_greenBB(Match match,
			Comment comment) {
		match.getContextNodes().add(comment);
		return new Object[] { match, comment };
	}

	public static final void pattern_JavaAnnotationValue2Comment_10_6_registerobjectstomatch_expressionBBBB(
			JavaAnnotationValue2Comment _this, Match match, Comment comment, Comment tag) {
		_this.registerObjectsToMatch_BWD(match, comment, tag);

	}

	public static final boolean pattern_JavaAnnotationValue2Comment_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("a2c");
		EObject _localVariable_1 = isApplicableMatch.getObject("comment");
		EObject _localVariable_2 = isApplicableMatch.getObject("tag");
		EObject _localVariable_3 = isApplicableMatch.getObject("annotation");
		EObject tmpA2c = _localVariable_0;
		EObject tmpComment = _localVariable_1;
		EObject tmpTag = _localVariable_2;
		EObject tmpAnnotation = _localVariable_3;
		if (tmpA2c instanceof ASTNode2Element) {
			ASTNode2Element a2c = (ASTNode2Element) tmpA2c;
			if (tmpComment instanceof Comment) {
				Comment comment = (Comment) tmpComment;
				if (tmpTag instanceof Comment) {
					Comment tag = (Comment) tmpTag;
					if (tmpAnnotation instanceof Annotation) {
						Annotation annotation = (Annotation) tmpAnnotation;
						return new Object[] { a2c, comment, tag, annotation, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_11_1_performtransformation_blackBBBBFBB(
			ASTNode2Element a2c, Comment comment, Comment tag, Annotation annotation, JavaAnnotationValue2Comment _this,
			IsApplicableMatch isApplicableMatch) {
		if (!comment.equals(tag)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { a2c, comment, tag, annotation, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_11_1_performtransformation_bindingAndBlackFFFFFBB(
			JavaAnnotationValue2Comment _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaAnnotationValue2Comment_11_1_performtransformation_binding = pattern_JavaAnnotationValue2Comment_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaAnnotationValue2Comment_11_1_performtransformation_binding != null) {
			ASTNode2Element a2c = (ASTNode2Element) result_pattern_JavaAnnotationValue2Comment_11_1_performtransformation_binding[0];
			Comment comment = (Comment) result_pattern_JavaAnnotationValue2Comment_11_1_performtransformation_binding[1];
			Comment tag = (Comment) result_pattern_JavaAnnotationValue2Comment_11_1_performtransformation_binding[2];
			Annotation annotation = (Annotation) result_pattern_JavaAnnotationValue2Comment_11_1_performtransformation_binding[3];

			Object[] result_pattern_JavaAnnotationValue2Comment_11_1_performtransformation_black = pattern_JavaAnnotationValue2Comment_11_1_performtransformation_blackBBBBFBB(
					a2c, comment, tag, annotation, _this, isApplicableMatch);
			if (result_pattern_JavaAnnotationValue2Comment_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaAnnotationValue2Comment_11_1_performtransformation_black[4];

				return new Object[] { a2c, comment, tag, annotation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_11_1_performtransformation_greenFFFBBB(Comment tag,
			Annotation annotation, CSP csp) {
		ASTNode2Element c2c = UmlFactory.eINSTANCE.createASTNode2Element();
		ArrayInitializer array = JavaFactory.eINSTANCE.createArrayInitializer();
		AnnotationMemberValuePair value = JavaFactory.eINSTANCE.createAnnotationMemberValuePair();
		Object _localVariable_0 = csp.getValue("value", "name");
		c2c.setTarget(tag);
		c2c.setSource(value);
		value.setValue(array);
		annotation.getValues().add(value);
		String value_name_prime = (String) _localVariable_0;
		value.setName(value_name_prime);
		return new Object[] { c2c, array, value, tag, annotation, csp };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_11_2_collecttranslatedelements_blackBBBB(
			ASTNode2Element c2c, ArrayInitializer array, AnnotationMemberValuePair value, Comment tag) {
		return new Object[] { c2c, array, value, tag };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_11_2_collecttranslatedelements_greenFBBBB(
			ASTNode2Element c2c, ArrayInitializer array, AnnotationMemberValuePair value, Comment tag) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(c2c);
		ruleresult.getCreatedElements().add(array);
		ruleresult.getCreatedElements().add(value);
		ruleresult.getTranslatedElements().add(tag);
		return new Object[] { ruleresult, c2c, array, value, tag };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2c, EObject c2c, EObject array, EObject comment, EObject value,
			EObject tag, EObject annotation) {
		if (!a2c.equals(c2c)) {
			if (!a2c.equals(array)) {
				if (!a2c.equals(comment)) {
					if (!a2c.equals(value)) {
						if (!a2c.equals(tag)) {
							if (!a2c.equals(annotation)) {
								if (!c2c.equals(comment)) {
									if (!c2c.equals(value)) {
										if (!c2c.equals(tag)) {
											if (!array.equals(c2c)) {
												if (!array.equals(comment)) {
													if (!array.equals(value)) {
														if (!array.equals(tag)) {
															if (!comment.equals(value)) {
																if (!comment.equals(tag)) {
																	if (!tag.equals(value)) {
																		if (!annotation.equals(c2c)) {
																			if (!annotation.equals(array)) {
																				if (!annotation.equals(comment)) {
																					if (!annotation.equals(value)) {
																						if (!annotation.equals(tag)) {
																							return new Object[] {
																									ruleresult, a2c,
																									c2c, array, comment,
																									value, tag,
																									annotation };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaAnnotationValue2Comment_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject c2c, EObject array, EObject comment, EObject value, EObject tag,
			EObject annotation) {
		EMoflonEdge c2c__value____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge c2c__tag____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tag__comment____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__tag____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge value__array____value = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__value____values = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaAnnotationValue2Comment";
		String c2c__value____source_name_prime = "source";
		String c2c__tag____target_name_prime = "target";
		String tag__comment____annotatedElement_name_prime = "annotatedElement";
		String comment__tag____ownedComment_name_prime = "ownedComment";
		String value__array____value_name_prime = "value";
		String annotation__value____values_name_prime = "values";
		c2c__value____source.setSrc(c2c);
		c2c__value____source.setTrg(value);
		ruleresult.getCreatedEdges().add(c2c__value____source);
		c2c__tag____target.setSrc(c2c);
		c2c__tag____target.setTrg(tag);
		ruleresult.getCreatedEdges().add(c2c__tag____target);
		tag__comment____annotatedElement.setSrc(tag);
		tag__comment____annotatedElement.setTrg(comment);
		ruleresult.getTranslatedEdges().add(tag__comment____annotatedElement);
		comment__tag____ownedComment.setSrc(comment);
		comment__tag____ownedComment.setTrg(tag);
		ruleresult.getTranslatedEdges().add(comment__tag____ownedComment);
		value__array____value.setSrc(value);
		value__array____value.setTrg(array);
		ruleresult.getCreatedEdges().add(value__array____value);
		annotation__value____values.setSrc(annotation);
		annotation__value____values.setTrg(value);
		ruleresult.getCreatedEdges().add(annotation__value____values);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		c2c__value____source.setName(c2c__value____source_name_prime);
		c2c__tag____target.setName(c2c__tag____target_name_prime);
		tag__comment____annotatedElement.setName(tag__comment____annotatedElement_name_prime);
		comment__tag____ownedComment.setName(comment__tag____ownedComment_name_prime);
		value__array____value.setName(value__array____value_name_prime);
		annotation__value____values.setName(annotation__value____values_name_prime);
		return new Object[] { ruleresult, c2c, array, comment, value, tag, annotation, c2c__value____source,
				c2c__tag____target, tag__comment____annotatedElement, comment__tag____ownedComment,
				value__array____value, annotation__value____values };
	}

	public static final void pattern_JavaAnnotationValue2Comment_11_5_registerobjects_expressionBBBBBBBBB(
			JavaAnnotationValue2Comment _this, PerformRuleResult ruleresult, EObject a2c, EObject c2c, EObject array,
			EObject comment, EObject value, EObject tag, EObject annotation) {
		_this.registerObjects_BWD(ruleresult, a2c, c2c, array, comment, value, tag, annotation);

	}

	public static final PerformRuleResult pattern_JavaAnnotationValue2Comment_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_bindingFB(
			JavaAnnotationValue2Comment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_blackFBB(EClass eClass,
			JavaAnnotationValue2Comment _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_bindingAndBlackFFB(
			JavaAnnotationValue2Comment _this) {
		Object[] result_pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_binding = pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_black = pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaAnnotationValue2Comment";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("comment");
		EObject _localVariable_1 = match.getObject("tag");
		EObject tmpComment = _localVariable_0;
		EObject tmpTag = _localVariable_1;
		if (tmpComment instanceof Comment) {
			Comment comment = (Comment) tmpComment;
			if (tmpTag instanceof Comment) {
				Comment tag = (Comment) tmpTag;
				return new Object[] { comment, tag, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValue2Comment_12_2_corematch_blackFBBFB(
			Comment comment, Comment tag, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!comment.equals(tag)) {
			for (ASTNode2Element a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(comment,
					ASTNode2Element.class, "target")) {
				ASTNode tmpAnnotation = a2c.getSource();
				if (tmpAnnotation instanceof Annotation) {
					Annotation annotation = (Annotation) tmpAnnotation;
					_result.add(new Object[] { a2c, comment, tag, annotation, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValue2Comment_12_3_findcontext_blackBBBB(
			ASTNode2Element a2c, Comment comment, Comment tag, Annotation annotation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!comment.equals(tag)) {
			if (tag.getAnnotatedElements().contains(comment)) {
				if (comment.getOwnedComments().contains(tag)) {
					if (comment.equals(a2c.getTarget())) {
						if (annotation.equals(a2c.getSource())) {
							_result.add(new Object[] { a2c, comment, tag, annotation });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_3_findcontext_greenBBBBFFFFF(
			ASTNode2Element a2c, Comment comment, Comment tag, Annotation annotation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tag__comment____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__tag____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__comment____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tag__comment____annotatedElement_name_prime = "annotatedElement";
		String comment__tag____ownedComment_name_prime = "ownedComment";
		String a2c__comment____target_name_prime = "target";
		String a2c__annotation____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(a2c);
		isApplicableMatch.getAllContextElements().add(comment);
		isApplicableMatch.getAllContextElements().add(tag);
		isApplicableMatch.getAllContextElements().add(annotation);
		tag__comment____annotatedElement.setSrc(tag);
		tag__comment____annotatedElement.setTrg(comment);
		isApplicableMatch.getAllContextElements().add(tag__comment____annotatedElement);
		comment__tag____ownedComment.setSrc(comment);
		comment__tag____ownedComment.setTrg(tag);
		isApplicableMatch.getAllContextElements().add(comment__tag____ownedComment);
		a2c__comment____target.setSrc(a2c);
		a2c__comment____target.setTrg(comment);
		isApplicableMatch.getAllContextElements().add(a2c__comment____target);
		a2c__annotation____source.setSrc(a2c);
		a2c__annotation____source.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(a2c__annotation____source);
		tag__comment____annotatedElement.setName(tag__comment____annotatedElement_name_prime);
		comment__tag____ownedComment.setName(comment__tag____ownedComment_name_prime);
		a2c__comment____target.setName(a2c__comment____target_name_prime);
		a2c__annotation____source.setName(a2c__annotation____source_name_prime);
		return new Object[] { a2c, comment, tag, annotation, isApplicableMatch, tag__comment____annotatedElement,
				comment__tag____ownedComment, a2c__comment____target, a2c__annotation____source };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_4_solveCSP_bindingFBBBBBB(
			JavaAnnotationValue2Comment _this, IsApplicableMatch isApplicableMatch, ASTNode2Element a2c,
			Comment comment, Comment tag, Annotation annotation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, a2c, comment, tag, annotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a2c, comment, tag, annotation };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_4_solveCSP_bindingAndBlackFBBBBBB(
			JavaAnnotationValue2Comment _this, IsApplicableMatch isApplicableMatch, ASTNode2Element a2c,
			Comment comment, Comment tag, Annotation annotation) {
		Object[] result_pattern_JavaAnnotationValue2Comment_12_4_solveCSP_binding = pattern_JavaAnnotationValue2Comment_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, a2c, comment, tag, annotation);
		if (result_pattern_JavaAnnotationValue2Comment_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValue2Comment_12_4_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValue2Comment_12_4_solveCSP_black = pattern_JavaAnnotationValue2Comment_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValue2Comment_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a2c, comment, tag, annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_12_5_checkCSP_expressionFBB(
			JavaAnnotationValue2Comment _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaAnnotationValue2Comment";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaAnnotationValue2Comment_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_bindingFB(
			JavaAnnotationValue2Comment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			JavaAnnotationValue2Comment _this) {
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

	public static final Object[] pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaAnnotationValue2Comment _this) {
		Object[] result_pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_binding = pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_black = pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_20_2_testcorematchandDECs_black_nac_0BB(
			Comment tag, Comment comment) {
		if (!comment.equals(tag)) {
			for (Element __DEC_tag_annotatedElement_810877 : tag.getAnnotatedElements()) {
				if (!tag.equals(__DEC_tag_annotatedElement_810877)) {
					if (!comment.equals(__DEC_tag_annotatedElement_810877)) {
						return new Object[] { tag, comment };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValue2Comment_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_annotatedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTag = _edge_annotatedElement.getSrc();
		if (tmpTag instanceof Comment) {
			Comment tag = (Comment) tmpTag;
			EObject tmpComment = _edge_annotatedElement.getTrg();
			if (tmpComment instanceof Comment) {
				Comment comment = (Comment) tmpComment;
				if (!comment.equals(tag)) {
					if (tag.getAnnotatedElements().contains(comment)) {
						if (comment.getOwnedComments().contains(tag)) {
							if (pattern_JavaAnnotationValue2Comment_20_2_testcorematchandDECs_black_nac_0BB(tag,
									comment) == null) {
								_result.add(new Object[] { comment, tag, _edge_annotatedElement });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaAnnotationValue2Comment_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			JavaAnnotationValue2Comment _this, Match match, Comment comment, Comment tag) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, comment, tag);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaAnnotationValue2Comment _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaAnnotationValue2Comment_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_bindingFB(
			JavaAnnotationValue2Comment _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			JavaAnnotationValue2Comment _this) {
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

	public static final Object[] pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaAnnotationValue2Comment _this) {
		Object[] result_pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_binding = pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_black = pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValue2Comment_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_value) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpValue = _edge_value.getSrc();
		if (tmpValue instanceof AnnotationMemberValuePair) {
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
			EObject tmpArray = _edge_value.getTrg();
			if (tmpArray instanceof ArrayInitializer) {
				ArrayInitializer array = (ArrayInitializer) tmpArray;
				if (array.equals(value.getValue())) {
					for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(value, Annotation.class, "values")) {
						_result.add(new Object[] { array, value, annotation, _edge_value });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaAnnotationValue2Comment_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			JavaAnnotationValue2Comment _this, Match match, ArrayInitializer array, AnnotationMemberValuePair value,
			Annotation annotation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, array, value, annotation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaAnnotationValue2Comment _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaAnnotationValue2Comment_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_1_prepare_blackB(
			JavaAnnotationValue2Comment _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("array");
		EObject _localVariable_1 = targetMatch.getObject("comment");
		EObject _localVariable_2 = sourceMatch.getObject("value");
		EObject _localVariable_3 = targetMatch.getObject("tag");
		EObject _localVariable_4 = sourceMatch.getObject("annotation");
		EObject tmpArray = _localVariable_0;
		EObject tmpComment = _localVariable_1;
		EObject tmpValue = _localVariable_2;
		EObject tmpTag = _localVariable_3;
		EObject tmpAnnotation = _localVariable_4;
		if (tmpArray instanceof ArrayInitializer) {
			ArrayInitializer array = (ArrayInitializer) tmpArray;
			if (tmpComment instanceof Comment) {
				Comment comment = (Comment) tmpComment;
				if (tmpValue instanceof AnnotationMemberValuePair) {
					AnnotationMemberValuePair value = (AnnotationMemberValuePair) tmpValue;
					if (tmpTag instanceof Comment) {
						Comment tag = (Comment) tmpTag;
						if (tmpAnnotation instanceof Annotation) {
							Annotation annotation = (Annotation) tmpAnnotation;
							return new Object[] { array, comment, value, tag, annotation, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_blackBBBBBBB(
			ArrayInitializer array, Comment comment, AnnotationMemberValuePair value, Comment tag,
			Annotation annotation, Match sourceMatch, Match targetMatch) {
		if (!comment.equals(tag)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { array, comment, value, tag, annotation, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_binding = pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_bindingFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_binding != null) {
			ArrayInitializer array = (ArrayInitializer) result_pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_binding[0];
			Comment comment = (Comment) result_pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_binding[1];
			AnnotationMemberValuePair value = (AnnotationMemberValuePair) result_pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_binding[2];
			Comment tag = (Comment) result_pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_binding[3];
			Annotation annotation = (Annotation) result_pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_black = pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_blackBBBBBBB(
					array, comment, value, tag, annotation, sourceMatch, targetMatch);
			if (result_pattern_JavaAnnotationValue2Comment_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { array, comment, value, tag, annotation, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_3_solvecsp_bindingFBBBBBBBB(
			JavaAnnotationValue2Comment _this, ArrayInitializer array, Comment comment, AnnotationMemberValuePair value,
			Comment tag, Annotation annotation, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(array, comment, value, tag, annotation, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, array, comment, value, tag, annotation, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			JavaAnnotationValue2Comment _this, ArrayInitializer array, Comment comment, AnnotationMemberValuePair value,
			Comment tag, Annotation annotation, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_JavaAnnotationValue2Comment_24_3_solvecsp_binding = pattern_JavaAnnotationValue2Comment_24_3_solvecsp_bindingFBBBBBBBB(
				_this, array, comment, value, tag, annotation, sourceMatch, targetMatch);
		if (result_pattern_JavaAnnotationValue2Comment_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValue2Comment_24_3_solvecsp_binding[0];

			Object[] result_pattern_JavaAnnotationValue2Comment_24_3_solvecsp_black = pattern_JavaAnnotationValue2Comment_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_JavaAnnotationValue2Comment_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, array, comment, value, tag, annotation, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValue2Comment_24_5_matchcorrcontext_blackFBBBB(
			Comment comment, Annotation annotation, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element a2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(comment,
					ASTNode2Element.class, "target")) {
				if (annotation.equals(a2c.getSource())) {
					_result.add(new Object[] { a2c, comment, annotation, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_5_matchcorrcontext_greenBBBF(
			ASTNode2Element a2c, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "JavaAnnotationValue2Comment";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(a2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { a2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_6_createcorrespondence_blackBBBBBB(
			ArrayInitializer array, Comment comment, AnnotationMemberValuePair value, Comment tag,
			Annotation annotation, CCMatch ccMatch) {
		if (!comment.equals(tag)) {
			return new Object[] { array, comment, value, tag, annotation, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_6_createcorrespondence_greenFBBB(
			AnnotationMemberValuePair value, Comment tag, CCMatch ccMatch) {
		ASTNode2Element c2c = UmlFactory.eINSTANCE.createASTNode2Element();
		c2c.setSource(value);
		c2c.setTarget(tag);
		ccMatch.getCreateCorr().add(c2c);
		return new Object[] { c2c, value, tag, ccMatch };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "JavaAnnotationValue2Comment";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaAnnotationValue2Comment_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_27_1_matchtggpattern_blackBBB(
			ArrayInitializer array, AnnotationMemberValuePair value, Annotation annotation) {
		if (array.equals(value.getValue())) {
			if (annotation.getValues().contains(value)) {
				return new Object[] { array, value, annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_28_1_matchtggpattern_black_nac_0BB(Comment tag,
			Comment comment) {
		if (!comment.equals(tag)) {
			for (Element __DEC_tag_annotatedElement_515345 : tag.getAnnotatedElements()) {
				if (!tag.equals(__DEC_tag_annotatedElement_515345)) {
					if (!comment.equals(__DEC_tag_annotatedElement_515345)) {
						return new Object[] { tag, comment };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_28_1_matchtggpattern_blackBB(Comment comment,
			Comment tag) {
		if (!comment.equals(tag)) {
			if (tag.getAnnotatedElements().contains(comment)) {
				if (comment.getOwnedComments().contains(tag)) {
					if (pattern_JavaAnnotationValue2Comment_28_1_matchtggpattern_black_nac_0BB(tag, comment) == null) {
						return new Object[] { comment, tag };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_1_createresult_blackB(
			JavaAnnotationValue2Comment _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element a2c) {
		if (ruleResult.getCorrObjects().contains(a2c)) {
			return new Object[] { ruleResult, a2c };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Comment comment) {
		if (ruleResult.getTargetObjects().contains(comment)) {
			return new Object[] { ruleResult, comment };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Annotation annotation) {
		if (ruleResult.getSourceObjects().contains(annotation)) {
			return new Object[] { ruleResult, annotation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotationValue2Comment_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList a2cList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpA2c : a2cList.getEntryObjects()) {
				if (tmpA2c instanceof ASTNode2Element) {
					ASTNode2Element a2c = (ASTNode2Element) tmpA2c;
					Element tmpComment = a2c.getTarget();
					if (tmpComment instanceof Comment) {
						Comment comment = (Comment) tmpComment;
						ASTNode tmpAnnotation = a2c.getSource();
						if (tmpAnnotation instanceof Annotation) {
							Annotation annotation = (Annotation) tmpAnnotation;
							if (pattern_JavaAnnotationValue2Comment_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									a2c) == null) {
								if (pattern_JavaAnnotationValue2Comment_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										comment) == null) {
									if (pattern_JavaAnnotationValue2Comment_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, annotation) == null) {
										_result.add(new Object[] { a2cList, a2c, comment, annotation,
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

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_3_solveCSP_bindingFBBBBBB(
			JavaAnnotationValue2Comment _this, IsApplicableMatch isApplicableMatch, ASTNode2Element a2c,
			Comment comment, Annotation annotation, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, a2c, comment, annotation,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, a2c, comment, annotation, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_3_solveCSP_bindingAndBlackFBBBBBB(
			JavaAnnotationValue2Comment _this, IsApplicableMatch isApplicableMatch, ASTNode2Element a2c,
			Comment comment, Annotation annotation, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_JavaAnnotationValue2Comment_29_3_solveCSP_binding = pattern_JavaAnnotationValue2Comment_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, a2c, comment, annotation, ruleResult);
		if (result_pattern_JavaAnnotationValue2Comment_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotationValue2Comment_29_3_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotationValue2Comment_29_3_solveCSP_black = pattern_JavaAnnotationValue2Comment_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotationValue2Comment_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, a2c, comment, annotation, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotationValue2Comment_29_4_checkCSP_expressionFBB(
			JavaAnnotationValue2Comment _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_5_checknacs_blackBBB(ASTNode2Element a2c,
			Comment comment, Annotation annotation) {
		return new Object[] { a2c, comment, annotation };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_6_perform_blackBBBB(ASTNode2Element a2c,
			Comment comment, Annotation annotation, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { a2c, comment, annotation, ruleResult };
	}

	public static final Object[] pattern_JavaAnnotationValue2Comment_29_6_perform_greenFFBFFBBB(Comment comment,
			Annotation annotation, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNode2Element c2c = UmlFactory.eINSTANCE.createASTNode2Element();
		ArrayInitializer array = JavaFactory.eINSTANCE.createArrayInitializer();
		AnnotationMemberValuePair value = JavaFactory.eINSTANCE.createAnnotationMemberValuePair();
		Comment tag = UMLFactory.eINSTANCE.createComment();
		Object _localVariable_0 = csp.getValue("value", "name");
		Object _localVariable_1 = csp.getValue("tag", "body");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(c2c);
		ruleResult.getSourceObjects().add(array);
		c2c.setSource(value);
		value.setValue(array);
		annotation.getValues().add(value);
		ruleResult.getSourceObjects().add(value);
		c2c.setTarget(tag);
		tag.getAnnotatedElements().add(comment);
		comment.getOwnedComments().add(tag);
		ruleResult.getTargetObjects().add(tag);
		String value_name_prime = (String) _localVariable_0;
		String tag_body_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		value.setName(value_name_prime);
		tag.setBody(tag_body_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { c2c, array, comment, value, tag, annotation, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_JavaAnnotationValue2Comment_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //JavaAnnotationValue2CommentImpl
