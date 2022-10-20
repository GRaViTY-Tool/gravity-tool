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
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.JavaAnnotation2Comment4SingleVariableDeclaration;
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
 * An implementation of the model object '<em><b>Java Annotation2 Comment4 Single Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JavaAnnotation2Comment4SingleVariableDeclarationImpl extends AbstractRuleImpl
		implements JavaAnnotation2Comment4SingleVariableDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaAnnotation2Comment4SingleVariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getJavaAnnotation2Comment4SingleVariableDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Annotation annotation, TypeAccess access,
			SingleVariableDeclaration variable, AnnotationTypeDeclaration type) {

		Object[] result1_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_1_initialbindings_blackBBBBBB(this, match,
						annotation, access, variable, type);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[access] = " + access
					+ ", " + "[variable] = " + variable + ", " + "[type] = " + type + ".");
		}

		Object[] result2_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_bindingAndBlackFBBBBBB(this,
						match, annotation, access, variable, type);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[annotation] = " + annotation + ", " + "[access] = " + access
					+ ", " + "[variable] = " + variable + ", " + "[type] = " + type + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_4_collectelementstobetranslated_blackBBBBB(
							match, annotation, access, variable, type);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[access] = " + access + ", " + "[variable] = "
						+ variable + ", " + "[type] = " + type + ".");
			}
			JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_4_collectelementstobetranslated_greenBBBBBFFFF(
							match, annotation, access, variable, type);
			//nothing EMoflonEdge access__type____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge type__access____usagesInTypeAccess = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge variable__annotation____annotations = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge annotation__access____type = (EMoflonEdge) result4_green[8];

			Object[] result5_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_5_collectcontextelements_blackBBBBB(
							match, annotation, access, variable, type);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[annotation] = " + annotation + ", " + "[access] = " + access + ", " + "[variable] = "
						+ variable + ", " + "[type] = " + type + ".");
			}
			JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_5_collectcontextelements_greenBBB(match,
							variable, type);

			// 
			JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_6_registerobjectstomatch_expressionBBBBBB(
							this, match, annotation, access, variable, type);
			return JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_7_expressionF();
		} else {
			return JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Annotation annotation = (Annotation) result1_bindingAndBlack[0];
		TypeAccess access = (TypeAccess) result1_bindingAndBlack[1];
		ASTNode2Element v2p = (ASTNode2Element) result1_bindingAndBlack[2];
		SingleVariableDeclaration variable = (SingleVariableDeclaration) result1_bindingAndBlack[3];
		Interface interf = (Interface) result1_bindingAndBlack[4];
		AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) result1_bindingAndBlack[5];
		ASTNode2Element type2Interface = (ASTNode2Element) result1_bindingAndBlack[6];
		Parameter element = (Parameter) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_greenBFFBBB(
						annotation, interf, element, csp);
		ASTNode2Element a2c = (ASTNode2Element) result1_green[1];
		Comment comment = (Comment) result1_green[2];

		Object[] result2_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_2_collecttranslatedelements_blackBBBB(
						annotation, access, a2c, comment);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = " + annotation
					+ ", " + "[access] = " + access + ", " + "[a2c] = " + a2c + ", " + "[comment] = " + comment + ".");
		}
		Object[] result2_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_2_collecttranslatedelements_greenFBBBB(
						annotation, access, a2c, comment);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
						ruleresult, annotation, access, a2c, v2p, variable, comment, interf, type, type2Interface,
						element);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[access] = " + access + ", " + "[a2c] = " + a2c
					+ ", " + "[v2p] = " + v2p + ", " + "[variable] = " + variable + ", " + "[comment] = " + comment
					+ ", " + "[interf] = " + interf + ", " + "[type] = " + type + ", " + "[type2Interface] = "
					+ type2Interface + ", " + "[element] = " + element + ".");
		}
		JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
						ruleresult, annotation, access, a2c, variable, comment, interf, type, element);
		//nothing EMoflonEdge element__comment____ownedComment = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge access__type____type = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge type__access____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge variable__annotation____annotations = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge comment__element____annotatedElement = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2c__annotation____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2c__comment____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge annotation__access____type = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge comment__interf____annotatedElement = (EMoflonEdge) result3_green[17];

		// 
		// 
		JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_5_registerobjects_expressionBBBBBBBBBBBB(
						this, ruleresult, annotation, access, a2c, v2p, variable, comment, interf, type, type2Interface,
						element);
		return JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_bindingAndBlackFFB(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_greenBF(
						performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Annotation annotation = (Annotation) result2_binding[0];
		TypeAccess access = (TypeAccess) result2_binding[1];
		SingleVariableDeclaration variable = (SingleVariableDeclaration) result2_binding[2];
		AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) result2_binding[3];
		for (Object[] result2_black : JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_2_corematch_blackBBFBFBFFB(annotation,
						access, variable, type, match)) {
			ASTNode2Element v2p = (ASTNode2Element) result2_black[2];
			Interface interf = (Interface) result2_black[4];
			ASTNode2Element type2Interface = (ASTNode2Element) result2_black[6];
			Parameter element = (Parameter) result2_black[7];
			// ForEach 
			for (Object[] result3_black : JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_3_findcontext_blackBBBBBBBB(annotation,
							access, v2p, variable, interf, type, type2Interface, element)) {
				Object[] result3_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(
								annotation, access, v2p, variable, interf, type, type2Interface, element);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge access__type____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge type__access____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge variable__annotation____annotations = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge v2p__variable____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge v2p__element____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge type2Interface__type____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge annotation__access____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge type2Interface__interf____target = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, annotation, access, v2p, variable, interf, type,
								type2Interface, element);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[annotation] = " + annotation
							+ ", " + "[access] = " + access + ", " + "[v2p] = " + v2p + ", " + "[variable] = "
							+ variable + ", " + "[interf] = " + interf + ", " + "[type] = " + type + ", "
							+ "[type2Interface] = " + type2Interface + ", " + "[element] = " + element + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_5_checkCSP_expressionFBB(this,
								csp)) {

					Object[] result6_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
							.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaAnnotation2Comment4SingleVariableDeclarationImpl
							.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Annotation annotation, TypeAccess access,
			SingleVariableDeclaration variable, AnnotationTypeDeclaration type) {
		match.registerObject("annotation", annotation);
		match.registerObject("access", access);
		match.registerObject("variable", variable);
		match.registerObject("type", type);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Annotation annotation, TypeAccess access,
			SingleVariableDeclaration variable, AnnotationTypeDeclaration type) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Annotation annotation, TypeAccess access,
			ASTNode2Element v2p, SingleVariableDeclaration variable, Interface interf, AnnotationTypeDeclaration type,
			ASTNode2Element type2Interface, Parameter element) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_type_name = CSPFactoryHelper.eINSTANCE.createVariable("type.name", true, csp);
		var_type_name.setValue(type.getName());
		var_type_name.setType("String");

		// Create unbound variables
		Variable var_comment_body = CSPFactoryHelper.eINSTANCE.createVariable("comment.body", csp);
		var_comment_body.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_comment_body, var_type_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("annotation", annotation);
		isApplicableMatch.registerObject("access", access);
		isApplicableMatch.registerObject("v2p", v2p);
		isApplicableMatch.registerObject("variable", variable);
		isApplicableMatch.registerObject("interf", interf);
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("type2Interface", type2Interface);
		isApplicableMatch.registerObject("element", element);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject annotation, EObject access, EObject a2c,
			EObject v2p, EObject variable, EObject comment, EObject interf, EObject type, EObject type2Interface,
			EObject element) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("access", access);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("v2p", v2p);
		ruleresult.registerObject("variable", variable);
		ruleresult.registerObject("comment", comment);
		ruleresult.registerObject("interf", interf);
		ruleresult.registerObject("type", type);
		ruleresult.registerObject("type2Interface", type2Interface);
		ruleresult.registerObject("element", element);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("annotation").eClass())
						.equals("java.Annotation.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("access").eClass()).equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Comment comment, Interface interf, Parameter element) {

		Object[] result1_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_1_initialbindings_blackBBBBB(this, match,
						comment, interf, element);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[comment] = " + comment + ", " + "[interf] = " + interf + ", "
					+ "[element] = " + element + ".");
		}

		Object[] result2_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_bindingAndBlackFBBBBB(this,
						match, comment, interf, element);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[comment] = " + comment + ", " + "[interf] = " + interf + ", "
					+ "[element] = " + element + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_4_collectelementstobetranslated_blackBBBB(
							match, comment, interf, element);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[comment] = "
								+ comment + ", " + "[interf] = " + interf + ", " + "[element] = " + element + ".");
			}
			JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_4_collectelementstobetranslated_greenBBBBFFF(
							match, comment, interf, element);
			//nothing EMoflonEdge element__comment____ownedComment = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge comment__element____annotatedElement = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge comment__interf____annotatedElement = (EMoflonEdge) result4_green[6];

			Object[] result5_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_5_collectcontextelements_blackBBBB(
							match, comment, interf, element);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[comment] = "
								+ comment + ", " + "[interf] = " + interf + ", " + "[element] = " + element + ".");
			}
			JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_5_collectcontextelements_greenBBB(
							match, interf, element);

			// 
			JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_6_registerobjectstomatch_expressionBBBBB(
							this, match, comment, interf, element);
			return JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_7_expressionF();
		} else {
			return JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ASTNode2Element v2p = (ASTNode2Element) result1_bindingAndBlack[0];
		SingleVariableDeclaration variable = (SingleVariableDeclaration) result1_bindingAndBlack[1];
		Comment comment = (Comment) result1_bindingAndBlack[2];
		Interface interf = (Interface) result1_bindingAndBlack[3];
		AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) result1_bindingAndBlack[4];
		ASTNode2Element type2Interface = (ASTNode2Element) result1_bindingAndBlack[5];
		Parameter element = (Parameter) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_greenFFFBBB(
						variable, comment, type);
		Annotation annotation = (Annotation) result1_green[0];
		TypeAccess access = (TypeAccess) result1_green[1];
		ASTNode2Element a2c = (ASTNode2Element) result1_green[2];

		Object[] result2_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_2_collecttranslatedelements_blackBBBB(
						annotation, access, a2c, comment);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = " + annotation
					+ ", " + "[access] = " + access + ", " + "[a2c] = " + a2c + ", " + "[comment] = " + comment + ".");
		}
		Object[] result2_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_2_collecttranslatedelements_greenFBBBB(
						annotation, access, a2c, comment);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
						ruleresult, annotation, access, a2c, v2p, variable, comment, interf, type, type2Interface,
						element);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[annotation] = " + annotation + ", " + "[access] = " + access + ", " + "[a2c] = " + a2c
					+ ", " + "[v2p] = " + v2p + ", " + "[variable] = " + variable + ", " + "[comment] = " + comment
					+ ", " + "[interf] = " + interf + ", " + "[type] = " + type + ", " + "[type2Interface] = "
					+ type2Interface + ", " + "[element] = " + element + ".");
		}
		JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
						ruleresult, annotation, access, a2c, variable, comment, interf, type, element);
		//nothing EMoflonEdge element__comment____ownedComment = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge access__type____type = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge type__access____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge variable__annotation____annotations = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge comment__element____annotatedElement = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge a2c__annotation____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge a2c__comment____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge annotation__access____type = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge comment__interf____annotatedElement = (EMoflonEdge) result3_green[17];

		// 
		// 
		JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_5_registerobjects_expressionBBBBBBBBBBBB(
						this, ruleresult, annotation, access, a2c, v2p, variable, comment, interf, type, type2Interface,
						element);
		return JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_bindingAndBlackFFB(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_greenBF(
						performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Comment comment = (Comment) result2_binding[0];
		Interface interf = (Interface) result2_binding[1];
		Parameter element = (Parameter) result2_binding[2];
		for (Object[] result2_black : JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_2_corematch_blackFFBBFFBB(comment, interf,
						element, match)) {
			ASTNode2Element v2p = (ASTNode2Element) result2_black[0];
			SingleVariableDeclaration variable = (SingleVariableDeclaration) result2_black[1];
			AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) result2_black[4];
			ASTNode2Element type2Interface = (ASTNode2Element) result2_black[5];
			// ForEach 
			for (Object[] result3_black : JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_3_findcontext_blackBBBBBBB(v2p,
							variable, comment, interf, type, type2Interface, element)) {
				Object[] result3_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_3_findcontext_greenBBBBBBBFFFFFFFF(
								v2p, variable, comment, interf, type, type2Interface, element);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge element__comment____ownedComment = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge v2p__variable____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge comment__element____annotatedElement = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge v2p__element____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge type2Interface__type____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge type2Interface__interf____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge comment__interf____annotatedElement = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, v2p, variable, comment, interf, type, type2Interface, element);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[v2p] = " + v2p + ", "
							+ "[variable] = " + variable + ", " + "[comment] = " + comment + ", " + "[interf] = "
							+ interf + ", " + "[type] = " + type + ", " + "[type2Interface] = " + type2Interface + ", "
							+ "[element] = " + element + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_5_checkCSP_expressionFBB(this,
								csp)) {

					Object[] result6_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
							.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaAnnotation2Comment4SingleVariableDeclarationImpl
							.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Comment comment, Interface interf, Parameter element) {
		match.registerObject("comment", comment);
		match.registerObject("interf", interf);
		match.registerObject("element", element);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Comment comment, Interface interf, Parameter element) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element v2p,
			SingleVariableDeclaration variable, Comment comment, Interface interf, AnnotationTypeDeclaration type,
			ASTNode2Element type2Interface, Parameter element) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_comment_body = CSPFactoryHelper.eINSTANCE.createVariable("comment.body", true, csp);
		var_comment_body.setValue(comment.getBody());
		var_comment_body.setType("String");
		Variable var_type_name = CSPFactoryHelper.eINSTANCE.createVariable("type.name", true, csp);
		var_type_name.setValue(type.getName());
		var_type_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_comment_body, var_type_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("v2p", v2p);
		isApplicableMatch.registerObject("variable", variable);
		isApplicableMatch.registerObject("comment", comment);
		isApplicableMatch.registerObject("interf", interf);
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("type2Interface", type2Interface);
		isApplicableMatch.registerObject("element", element);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject annotation, EObject access, EObject a2c,
			EObject v2p, EObject variable, EObject comment, EObject interf, EObject type, EObject type2Interface,
			EObject element) {
		ruleresult.registerObject("annotation", annotation);
		ruleresult.registerObject("access", access);
		ruleresult.registerObject("a2c", a2c);
		ruleresult.registerObject("v2p", v2p);
		ruleresult.registerObject("variable", variable);
		ruleresult.registerObject("comment", comment);
		ruleresult.registerObject("interf", interf);
		ruleresult.registerObject("type", type);
		ruleresult.registerObject("type2Interface", type2Interface);
		ruleresult.registerObject("element", element);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("comment").eClass()).equals("uml.Comment.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_128(EMoflonEdge _edge_ownedComment) {

		Object[] result1_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_bindingAndBlackFFBF(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_2_testcorematchandDECs_blackFFFB(
						_edge_ownedComment)) {
			Comment comment = (Comment) result2_black[0];
			Interface interf = (Interface) result2_black[1];
			Parameter element = (Parameter) result2_black[2];
			Object[] result2_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, comment, interf, element)) {
				// 
				if (JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
							.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaAnnotation2Comment4SingleVariableDeclarationImpl
							.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_136(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_bindingAndBlackFFBF(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_blackFFFFB(
						_edge_type)) {
			Annotation annotation = (Annotation) result2_black[0];
			TypeAccess access = (TypeAccess) result2_black[1];
			SingleVariableDeclaration variable = (SingleVariableDeclaration) result2_black[2];
			AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) result2_black[3];
			Object[] result2_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, annotation, access, variable, type)) {
				// 
				if (JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
							.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaAnnotation2Comment4SingleVariableDeclarationImpl
							.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("JavaAnnotation2Comment4SingleVariableDeclaration");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_comment_body = CSPFactoryHelper.eINSTANCE.createVariable("comment", true, csp);
		var_comment_body.setValue(__helper.getValue("comment", "body"));
		var_comment_body.setType("String");

		Variable var_type_name = CSPFactoryHelper.eINSTANCE.createVariable("type", true, csp);
		var_type_name.setValue(__helper.getValue("type", "name"));
		var_type_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("JavaAnnotation2Comment4SingleVariableDeclaration");
		eq0.solve(var_comment_body, var_type_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_comment_body.setBound(false);
			eq0.solve(var_comment_body, var_type_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("comment", "body", var_comment_body.getValue());
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
		ruleResult.setRule("JavaAnnotation2Comment4SingleVariableDeclaration");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_comment_body = CSPFactoryHelper.eINSTANCE.createVariable("comment", true, csp);
		var_comment_body.setValue(__helper.getValue("comment", "body"));
		var_comment_body.setType("String");

		Variable var_type_name = CSPFactoryHelper.eINSTANCE.createVariable("type", true, csp);
		var_type_name.setValue(__helper.getValue("type", "name"));
		var_type_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("JavaAnnotation2Comment4SingleVariableDeclaration");
		eq0.solve(var_comment_body, var_type_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			eq0.solve(var_comment_body, var_type_name);
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

		Object[] result1_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Annotation annotation = (Annotation) result2_bindingAndBlack[0];
		TypeAccess access = (TypeAccess) result2_bindingAndBlack[1];
		SingleVariableDeclaration variable = (SingleVariableDeclaration) result2_bindingAndBlack[2];
		Comment comment = (Comment) result2_bindingAndBlack[3];
		Interface interf = (Interface) result2_bindingAndBlack[4];
		AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) result2_bindingAndBlack[5];
		Parameter element = (Parameter) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this,
						annotation, access, variable, comment, interf, type, element, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[annotation] = " + annotation + ", " + "[access] = " + access + ", " + "[variable] = " + variable
					+ ", " + "[comment] = " + comment + ", " + "[interf] = " + interf + ", " + "[type] = " + type + ", "
					+ "[element] = " + element + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_5_matchcorrcontext_blackFBBBFBBB(
							variable, interf, type, element, sourceMatch, targetMatch)) {
				ASTNode2Element v2p = (ASTNode2Element) result5_black[0];
				ASTNode2Element type2Interface = (ASTNode2Element) result5_black[4];
				Object[] result5_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_5_matchcorrcontext_greenBBBBF(v2p,
								type2Interface, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_6_createcorrespondence_blackBBBBBBBB(
								annotation, access, variable, comment, interf, type, element, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[annotation] = "
							+ annotation + ", " + "[access] = " + access + ", " + "[variable] = " + variable + ", "
							+ "[comment] = " + comment + ", " + "[interf] = " + interf + ", " + "[type] = " + type
							+ ", " + "[element] = " + element + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_6_createcorrespondence_greenBFBB(
								annotation, comment, ccMatch);
				//nothing ASTNode2Element a2c = (ASTNode2Element) result6_green[1];

				Object[] result7_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_7_addtoreturnedresult_blackBB(
								result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_7_addtoreturnedresult_greenBB(
								result, ccMatch);

			}

		} else {
		}
		return JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Annotation annotation, TypeAccess access, SingleVariableDeclaration variable,
			Comment comment, Interface interf, AnnotationTypeDeclaration type, Parameter element, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_comment_body = CSPFactoryHelper.eINSTANCE.createVariable("comment.body", true, csp);
		var_comment_body.setValue(comment.getBody());
		var_comment_body.setType("String");
		Variable var_type_name = CSPFactoryHelper.eINSTANCE.createVariable("type.name", true, csp);
		var_type_name.setValue(type.getName());
		var_type_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_comment_body, var_type_name);
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
	public boolean checkDEC_FWD(Annotation annotation, TypeAccess access, SingleVariableDeclaration variable,
			AnnotationTypeDeclaration type) {// 
		Object[] result1_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_blackBBBB(annotation,
						access, variable, type);
		if (result1_black != null) {
			return JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_2_expressionF();
		} else {
			return JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Comment comment, Interface interf, Parameter element) {// 
		Object[] result1_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_28_1_matchtggpattern_blackBBB(comment, interf,
						element);
		if (result1_black != null) {
			return JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_28_2_expressionF();
		} else {
			return JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element v2pParameter,
			ASTNode2Element type2InterfaceParameter) {

		Object[] result1_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_blackFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList v2pList = (RuleEntryList) result2_black[0];
			ASTNode2Element v2p = (ASTNode2Element) result2_black[1];
			SingleVariableDeclaration variable = (SingleVariableDeclaration) result2_black[2];
			Parameter element = (Parameter) result2_black[3];
			//nothing RuleEntryList type2InterfaceList = (RuleEntryList) result2_black[4];
			Interface interf = (Interface) result2_black[5];
			ASTNode2Element type2Interface = (ASTNode2Element) result2_black[6];
			AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
							this, isApplicableMatch, v2p, variable, interf, type, type2Interface, element, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[v2p] = " + v2p + ", "
						+ "[variable] = " + variable + ", " + "[interf] = " + interf + ", " + "[type] = " + type + ", "
						+ "[type2Interface] = " + type2Interface + ", " + "[element] = " + element + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (JavaAnnotation2Comment4SingleVariableDeclarationImpl
					.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
						.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_5_checknacs_blackBBBBBB(v2p,
								variable, interf, type, type2Interface, element);
				if (result5_black != null) {

					Object[] result6_black = JavaAnnotation2Comment4SingleVariableDeclarationImpl
							.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_6_perform_blackBBBBBBB(v2p,
									variable, interf, type, type2Interface, element, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[v2p] = " + v2p + ", "
								+ "[variable] = " + variable + ", " + "[interf] = " + interf + ", " + "[type] = " + type
								+ ", " + "[type2Interface] = " + type2Interface + ", " + "[element] = " + element + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					JavaAnnotation2Comment4SingleVariableDeclarationImpl
							.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_6_perform_greenFFFBFBBBBB(
									variable, interf, type, element, ruleResult, csp);
					//nothing Annotation annotation = (Annotation) result6_green[0];
					//nothing TypeAccess access = (TypeAccess) result6_green[1];
					//nothing ASTNode2Element a2c = (ASTNode2Element) result6_green[2];
					//nothing Comment comment = (Comment) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return JavaAnnotation2Comment4SingleVariableDeclarationImpl
				.pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element v2p,
			SingleVariableDeclaration variable, Interface interf, AnnotationTypeDeclaration type,
			ASTNode2Element type2Interface, Parameter element, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_type_name = CSPFactoryHelper.eINSTANCE.createVariable("type.name", true, csp);
		var_type_name.setValue(type.getName());
		var_type_name.setType("String");

		// Create unbound variables
		Variable var_comment_body = CSPFactoryHelper.eINSTANCE.createVariable("comment.body", csp);
		var_comment_body.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_comment_body, var_type_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("v2p", v2p);
		isApplicableMatch.registerObject("variable", variable);
		isApplicableMatch.registerObject("interf", interf);
		isApplicableMatch.registerObject("type", type);
		isApplicableMatch.registerObject("type2Interface", type2Interface);
		isApplicableMatch.registerObject("element", element);
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
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPROPRIATE_FWD__MATCH_ANNOTATION_TYPEACCESS_SINGLEVARIABLEDECLARATION_ANNOTATIONTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (SingleVariableDeclaration) arguments.get(3),
					(AnnotationTypeDeclaration) arguments.get(4));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATION_TYPEACCESS_SINGLEVARIABLEDECLARATION_ANNOTATIONTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (SingleVariableDeclaration) arguments.get(3),
					(AnnotationTypeDeclaration) arguments.get(4));
			return null;
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATION_TYPEACCESS_SINGLEVARIABLEDECLARATION_ANNOTATIONTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (SingleVariableDeclaration) arguments.get(3),
					(AnnotationTypeDeclaration) arguments.get(4));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANNOTATION_TYPEACCESS_ASTNODE2ELEMENT_SINGLEVARIABLEDECLARATION_INTERFACE_ANNOTATIONTYPEDECLARATION_ASTNODE2ELEMENT_PARAMETER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Annotation) arguments.get(1),
					(TypeAccess) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(SingleVariableDeclaration) arguments.get(4), (Interface) arguments.get(5),
					(AnnotationTypeDeclaration) arguments.get(6), (ASTNode2Element) arguments.get(7),
					(Parameter) arguments.get(8));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPROPRIATE_BWD__MATCH_COMMENT_INTERFACE_PARAMETER:
			return isAppropriate_BWD((Match) arguments.get(0), (Comment) arguments.get(1), (Interface) arguments.get(2),
					(Parameter) arguments.get(3));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_COMMENT_INTERFACE_PARAMETER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Comment) arguments.get(1),
					(Interface) arguments.get(2), (Parameter) arguments.get(3));
			return null;
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_COMMENT_INTERFACE_PARAMETER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Comment) arguments.get(1),
					(Interface) arguments.get(2), (Parameter) arguments.get(3));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_SINGLEVARIABLEDECLARATION_COMMENT_INTERFACE_ANNOTATIONTYPEDECLARATION_ASTNODE2ELEMENT_PARAMETER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(SingleVariableDeclaration) arguments.get(2), (Comment) arguments.get(3),
					(Interface) arguments.get(4), (AnnotationTypeDeclaration) arguments.get(5),
					(ASTNode2Element) arguments.get(6), (Parameter) arguments.get(7));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_128__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_128((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_136__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_136((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATION_TYPEACCESS_SINGLEVARIABLEDECLARATION_COMMENT_INTERFACE_ANNOTATIONTYPEDECLARATION_PARAMETER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Annotation) arguments.get(0), (TypeAccess) arguments.get(1),
					(SingleVariableDeclaration) arguments.get(2), (Comment) arguments.get(3),
					(Interface) arguments.get(4), (AnnotationTypeDeclaration) arguments.get(5),
					(Parameter) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___CHECK_DEC_FWD__ANNOTATION_TYPEACCESS_SINGLEVARIABLEDECLARATION_ANNOTATIONTYPEDECLARATION:
			return checkDEC_FWD((Annotation) arguments.get(0), (TypeAccess) arguments.get(1),
					(SingleVariableDeclaration) arguments.get(2), (AnnotationTypeDeclaration) arguments.get(3));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___CHECK_DEC_BWD__COMMENT_INTERFACE_PARAMETER:
			return checkDEC_BWD((Comment) arguments.get(0), (Interface) arguments.get(1), (Parameter) arguments.get(2));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_SINGLEVARIABLEDECLARATION_INTERFACE_ANNOTATIONTYPEDECLARATION_ASTNODE2ELEMENT_PARAMETER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(SingleVariableDeclaration) arguments.get(2), (Interface) arguments.get(3),
					(AnnotationTypeDeclaration) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(Parameter) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.JAVA_ANNOTATION2_COMMENT4_SINGLE_VARIABLE_DECLARATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_1_initialbindings_blackBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match, Annotation annotation,
			TypeAccess access, SingleVariableDeclaration variable, AnnotationTypeDeclaration type) {
		return new Object[] { _this, match, annotation, access, variable, type };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_bindingFBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match, Annotation annotation,
			TypeAccess access, SingleVariableDeclaration variable, AnnotationTypeDeclaration type) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, annotation, access, variable, type);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, annotation, access, variable, type };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match, Annotation annotation,
			TypeAccess access, SingleVariableDeclaration variable, AnnotationTypeDeclaration type) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, annotation, access, variable, type);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, annotation, access, variable, type };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_3_CheckCSP_expressionFBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, Annotation annotation, TypeAccess access, SingleVariableDeclaration variable,
			AnnotationTypeDeclaration type) {
		return new Object[] { match, annotation, access, variable, type };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Annotation annotation, TypeAccess access, SingleVariableDeclaration variable,
			AnnotationTypeDeclaration type) {
		EMoflonEdge access__type____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variable__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(annotation);
		match.getToBeTranslatedNodes().add(access);
		String access__type____type_name_prime = "type";
		String type__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String variable__annotation____annotations_name_prime = "annotations";
		String annotation__access____type_name_prime = "type";
		access__type____type.setSrc(access);
		access__type____type.setTrg(type);
		match.getToBeTranslatedEdges().add(access__type____type);
		type__access____usagesInTypeAccess.setSrc(type);
		type__access____usagesInTypeAccess.setTrg(access);
		match.getToBeTranslatedEdges().add(type__access____usagesInTypeAccess);
		variable__annotation____annotations.setSrc(variable);
		variable__annotation____annotations.setTrg(annotation);
		match.getToBeTranslatedEdges().add(variable__annotation____annotations);
		annotation__access____type.setSrc(annotation);
		annotation__access____type.setTrg(access);
		match.getToBeTranslatedEdges().add(annotation__access____type);
		access__type____type.setName(access__type____type_name_prime);
		type__access____usagesInTypeAccess.setName(type__access____usagesInTypeAccess_name_prime);
		variable__annotation____annotations.setName(variable__annotation____annotations_name_prime);
		annotation__access____type.setName(annotation__access____type_name_prime);
		return new Object[] { match, annotation, access, variable, type, access__type____type,
				type__access____usagesInTypeAccess, variable__annotation____annotations, annotation__access____type };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_5_collectcontextelements_blackBBBBB(
			Match match, Annotation annotation, TypeAccess access, SingleVariableDeclaration variable,
			AnnotationTypeDeclaration type) {
		return new Object[] { match, annotation, access, variable, type };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_5_collectcontextelements_greenBBB(
			Match match, SingleVariableDeclaration variable, AnnotationTypeDeclaration type) {
		match.getContextNodes().add(variable);
		match.getContextNodes().add(type);
		return new Object[] { match, variable, type };
	}

	public static final void pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_6_registerobjectstomatch_expressionBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match, Annotation annotation,
			TypeAccess access, SingleVariableDeclaration variable, AnnotationTypeDeclaration type) {
		_this.registerObjectsToMatch_FWD(match, annotation, access, variable, type);

	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("access");
		EObject _localVariable_2 = isApplicableMatch.getObject("v2p");
		EObject _localVariable_3 = isApplicableMatch.getObject("variable");
		EObject _localVariable_4 = isApplicableMatch.getObject("interf");
		EObject _localVariable_5 = isApplicableMatch.getObject("type");
		EObject _localVariable_6 = isApplicableMatch.getObject("type2Interface");
		EObject _localVariable_7 = isApplicableMatch.getObject("element");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpAccess = _localVariable_1;
		EObject tmpV2p = _localVariable_2;
		EObject tmpVariable = _localVariable_3;
		EObject tmpInterf = _localVariable_4;
		EObject tmpType = _localVariable_5;
		EObject tmpType2Interface = _localVariable_6;
		EObject tmpElement = _localVariable_7;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpAccess instanceof TypeAccess) {
				TypeAccess access = (TypeAccess) tmpAccess;
				if (tmpV2p instanceof ASTNode2Element) {
					ASTNode2Element v2p = (ASTNode2Element) tmpV2p;
					if (tmpVariable instanceof SingleVariableDeclaration) {
						SingleVariableDeclaration variable = (SingleVariableDeclaration) tmpVariable;
						if (tmpInterf instanceof Interface) {
							Interface interf = (Interface) tmpInterf;
							if (tmpType instanceof AnnotationTypeDeclaration) {
								AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) tmpType;
								if (tmpType2Interface instanceof ASTNode2Element) {
									ASTNode2Element type2Interface = (ASTNode2Element) tmpType2Interface;
									if (tmpElement instanceof Parameter) {
										Parameter element = (Parameter) tmpElement;
										return new Object[] { annotation, access, v2p, variable, interf, type,
												type2Interface, element, isApplicableMatch };
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

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_blackBBBBBBBBFBB(
			Annotation annotation, TypeAccess access, ASTNode2Element v2p, SingleVariableDeclaration variable,
			Interface interf, AnnotationTypeDeclaration type, ASTNode2Element type2Interface, Parameter element,
			JavaAnnotation2Comment4SingleVariableDeclaration _this, IsApplicableMatch isApplicableMatch) {
		if (!type2Interface.equals(v2p)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { annotation, access, v2p, variable, interf, type, type2Interface, element, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_binding != null) {
			Annotation annotation = (Annotation) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_binding[0];
			TypeAccess access = (TypeAccess) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_binding[1];
			ASTNode2Element v2p = (ASTNode2Element) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_binding[2];
			SingleVariableDeclaration variable = (SingleVariableDeclaration) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_binding[3];
			Interface interf = (Interface) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_binding[4];
			AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_binding[5];
			ASTNode2Element type2Interface = (ASTNode2Element) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_binding[6];
			Parameter element = (Parameter) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_binding[7];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_blackBBBBBBBBFBB(
					annotation, access, v2p, variable, interf, type, type2Interface, element, _this, isApplicableMatch);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_black[8];

				return new Object[] { annotation, access, v2p, variable, interf, type, type2Interface, element, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_1_performtransformation_greenBFFBBB(
			Annotation annotation, Interface interf, Parameter element, CSP csp) {
		ASTNode2Element a2c = UmlFactory.eINSTANCE.createASTNode2Element();
		Comment comment = UMLFactory.eINSTANCE.createComment();
		Object _localVariable_0 = csp.getValue("comment", "body");
		a2c.setSource(annotation);
		element.getOwnedComments().add(comment);
		comment.getAnnotatedElements().add(element);
		a2c.setTarget(comment);
		comment.getAnnotatedElements().add(interf);
		String comment_body_prime = (String) _localVariable_0;
		comment.setBody(comment_body_prime);
		return new Object[] { annotation, a2c, comment, interf, element, csp };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_2_collecttranslatedelements_blackBBBB(
			Annotation annotation, TypeAccess access, ASTNode2Element a2c, Comment comment) {
		return new Object[] { annotation, access, a2c, comment };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_2_collecttranslatedelements_greenFBBBB(
			Annotation annotation, TypeAccess access, ASTNode2Element a2c, Comment comment) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(annotation);
		ruleresult.getTranslatedElements().add(access);
		ruleresult.getCreatedLinkElements().add(a2c);
		ruleresult.getCreatedElements().add(comment);
		return new Object[] { ruleresult, annotation, access, a2c, comment };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject access, EObject a2c, EObject v2p,
			EObject variable, EObject comment, EObject interf, EObject type, EObject type2Interface, EObject element) {
		if (!annotation.equals(v2p)) {
			if (!annotation.equals(variable)) {
				if (!annotation.equals(comment)) {
					if (!annotation.equals(interf)) {
						if (!annotation.equals(type)) {
							if (!annotation.equals(type2Interface)) {
								if (!annotation.equals(element)) {
									if (!access.equals(annotation)) {
										if (!access.equals(v2p)) {
											if (!access.equals(variable)) {
												if (!access.equals(comment)) {
													if (!access.equals(interf)) {
														if (!access.equals(type)) {
															if (!access.equals(type2Interface)) {
																if (!access.equals(element)) {
																	if (!a2c.equals(annotation)) {
																		if (!a2c.equals(access)) {
																			if (!a2c.equals(v2p)) {
																				if (!a2c.equals(variable)) {
																					if (!a2c.equals(comment)) {
																						if (!a2c.equals(interf)) {
																							if (!a2c.equals(type)) {
																								if (!a2c.equals(
																										type2Interface)) {
																									if (!a2c.equals(
																											element)) {
																										if (!v2p.equals(
																												variable)) {
																											if (!comment
																													.equals(v2p)) {
																												if (!comment
																														.equals(variable)) {
																													if (!comment
																															.equals(interf)) {
																														if (!comment
																																.equals(type)) {
																															if (!comment
																																	.equals(type2Interface)) {
																																if (!comment
																																		.equals(element)) {
																																	if (!interf
																																			.equals(v2p)) {
																																		if (!interf
																																				.equals(variable)) {
																																			if (!interf
																																					.equals(type)) {
																																				if (!interf
																																						.equals(type2Interface)) {
																																					if (!type
																																							.equals(v2p)) {
																																						if (!type
																																								.equals(variable)) {
																																							if (!type
																																									.equals(type2Interface)) {
																																								if (!type2Interface
																																										.equals(v2p)) {
																																									if (!type2Interface
																																											.equals(variable)) {
																																										if (!element
																																												.equals(v2p)) {
																																											if (!element
																																													.equals(variable)) {
																																												if (!element
																																														.equals(interf)) {
																																													if (!element
																																															.equals(type)) {
																																														if (!element
																																																.equals(type2Interface)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	annotation,
																																																	access,
																																																	a2c,
																																																	v2p,
																																																	variable,
																																																	comment,
																																																	interf,
																																																	type,
																																																	type2Interface,
																																																	element };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject annotation, EObject access, EObject a2c, EObject variable,
			EObject comment, EObject interf, EObject type, EObject element) {
		EMoflonEdge element__comment____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__type____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variable__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__element____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__comment____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__interf____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaAnnotation2Comment4SingleVariableDeclaration";
		String element__comment____ownedComment_name_prime = "ownedComment";
		String access__type____type_name_prime = "type";
		String type__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String variable__annotation____annotations_name_prime = "annotations";
		String comment__element____annotatedElement_name_prime = "annotatedElement";
		String a2c__annotation____source_name_prime = "source";
		String a2c__comment____target_name_prime = "target";
		String annotation__access____type_name_prime = "type";
		String comment__interf____annotatedElement_name_prime = "annotatedElement";
		element__comment____ownedComment.setSrc(element);
		element__comment____ownedComment.setTrg(comment);
		ruleresult.getCreatedEdges().add(element__comment____ownedComment);
		access__type____type.setSrc(access);
		access__type____type.setTrg(type);
		ruleresult.getTranslatedEdges().add(access__type____type);
		type__access____usagesInTypeAccess.setSrc(type);
		type__access____usagesInTypeAccess.setTrg(access);
		ruleresult.getTranslatedEdges().add(type__access____usagesInTypeAccess);
		variable__annotation____annotations.setSrc(variable);
		variable__annotation____annotations.setTrg(annotation);
		ruleresult.getTranslatedEdges().add(variable__annotation____annotations);
		comment__element____annotatedElement.setSrc(comment);
		comment__element____annotatedElement.setTrg(element);
		ruleresult.getCreatedEdges().add(comment__element____annotatedElement);
		a2c__annotation____source.setSrc(a2c);
		a2c__annotation____source.setTrg(annotation);
		ruleresult.getCreatedEdges().add(a2c__annotation____source);
		a2c__comment____target.setSrc(a2c);
		a2c__comment____target.setTrg(comment);
		ruleresult.getCreatedEdges().add(a2c__comment____target);
		annotation__access____type.setSrc(annotation);
		annotation__access____type.setTrg(access);
		ruleresult.getTranslatedEdges().add(annotation__access____type);
		comment__interf____annotatedElement.setSrc(comment);
		comment__interf____annotatedElement.setTrg(interf);
		ruleresult.getCreatedEdges().add(comment__interf____annotatedElement);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		element__comment____ownedComment.setName(element__comment____ownedComment_name_prime);
		access__type____type.setName(access__type____type_name_prime);
		type__access____usagesInTypeAccess.setName(type__access____usagesInTypeAccess_name_prime);
		variable__annotation____annotations.setName(variable__annotation____annotations_name_prime);
		comment__element____annotatedElement.setName(comment__element____annotatedElement_name_prime);
		a2c__annotation____source.setName(a2c__annotation____source_name_prime);
		a2c__comment____target.setName(a2c__comment____target_name_prime);
		annotation__access____type.setName(annotation__access____type_name_prime);
		comment__interf____annotatedElement.setName(comment__interf____annotatedElement_name_prime);
		return new Object[] { ruleresult, annotation, access, a2c, variable, comment, interf, type, element,
				element__comment____ownedComment, access__type____type, type__access____usagesInTypeAccess,
				variable__annotation____annotations, comment__element____annotatedElement, a2c__annotation____source,
				a2c__comment____target, annotation__access____type, comment__interf____annotatedElement };
	}

	public static final void pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_5_registerobjects_expressionBBBBBBBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, PerformRuleResult ruleresult, EObject annotation,
			EObject access, EObject a2c, EObject v2p, EObject variable, EObject comment, EObject interf, EObject type,
			EObject type2Interface, EObject element) {
		_this.registerObjects_FWD(ruleresult, annotation, access, a2c, v2p, variable, comment, interf, type,
				type2Interface, element);

	}

	public static final PerformRuleResult pattern_JavaAnnotation2Comment4SingleVariableDeclaration_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_bindingFB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_blackFBB(
			EClass eClass, JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_bindingAndBlackFFB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaAnnotation2Comment4SingleVariableDeclaration";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_2_corematch_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("annotation");
		EObject _localVariable_1 = match.getObject("access");
		EObject _localVariable_2 = match.getObject("variable");
		EObject _localVariable_3 = match.getObject("type");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpAccess = _localVariable_1;
		EObject tmpVariable = _localVariable_2;
		EObject tmpType = _localVariable_3;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpAccess instanceof TypeAccess) {
				TypeAccess access = (TypeAccess) tmpAccess;
				if (tmpVariable instanceof SingleVariableDeclaration) {
					SingleVariableDeclaration variable = (SingleVariableDeclaration) tmpVariable;
					if (tmpType instanceof AnnotationTypeDeclaration) {
						AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) tmpType;
						return new Object[] { annotation, access, variable, type, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_2_corematch_blackBBFBFBFFB(
			Annotation annotation, TypeAccess access, SingleVariableDeclaration variable,
			AnnotationTypeDeclaration type, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element v2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(variable,
				ASTNode2Element.class, "source")) {
			Element tmpElement = v2p.getTarget();
			if (tmpElement instanceof Parameter) {
				Parameter element = (Parameter) tmpElement;
				for (ASTNode2Element type2Interface : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(type, ASTNode2Element.class, "source")) {
					if (!type2Interface.equals(v2p)) {
						Element tmpInterf = type2Interface.getTarget();
						if (tmpInterf instanceof Interface) {
							Interface interf = (Interface) tmpInterf;
							_result.add(new Object[] { annotation, access, v2p, variable, interf, type, type2Interface,
									element, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_3_findcontext_blackBBBBBBBB(
			Annotation annotation, TypeAccess access, ASTNode2Element v2p, SingleVariableDeclaration variable,
			Interface interf, AnnotationTypeDeclaration type, ASTNode2Element type2Interface, Parameter element) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!type2Interface.equals(v2p)) {
			if (type.equals(access.getType())) {
				if (variable.getAnnotations().contains(annotation)) {
					if (variable.equals(v2p.getSource())) {
						if (element.equals(v2p.getTarget())) {
							if (type.equals(type2Interface.getSource())) {
								if (access.equals(annotation.getType())) {
									if (interf.equals(type2Interface.getTarget())) {
										_result.add(new Object[] { annotation, access, v2p, variable, interf, type,
												type2Interface, element });
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

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_3_findcontext_greenBBBBBBBBFFFFFFFFF(
			Annotation annotation, TypeAccess access, ASTNode2Element v2p, SingleVariableDeclaration variable,
			Interface interf, AnnotationTypeDeclaration type, ASTNode2Element type2Interface, Parameter element) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge access__type____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variable__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v2p__variable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v2p__element____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Interface__type____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Interface__interf____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String access__type____type_name_prime = "type";
		String type__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String variable__annotation____annotations_name_prime = "annotations";
		String v2p__variable____source_name_prime = "source";
		String v2p__element____target_name_prime = "target";
		String type2Interface__type____source_name_prime = "source";
		String annotation__access____type_name_prime = "type";
		String type2Interface__interf____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(access);
		isApplicableMatch.getAllContextElements().add(v2p);
		isApplicableMatch.getAllContextElements().add(variable);
		isApplicableMatch.getAllContextElements().add(interf);
		isApplicableMatch.getAllContextElements().add(type);
		isApplicableMatch.getAllContextElements().add(type2Interface);
		isApplicableMatch.getAllContextElements().add(element);
		access__type____type.setSrc(access);
		access__type____type.setTrg(type);
		isApplicableMatch.getAllContextElements().add(access__type____type);
		type__access____usagesInTypeAccess.setSrc(type);
		type__access____usagesInTypeAccess.setTrg(access);
		isApplicableMatch.getAllContextElements().add(type__access____usagesInTypeAccess);
		variable__annotation____annotations.setSrc(variable);
		variable__annotation____annotations.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(variable__annotation____annotations);
		v2p__variable____source.setSrc(v2p);
		v2p__variable____source.setTrg(variable);
		isApplicableMatch.getAllContextElements().add(v2p__variable____source);
		v2p__element____target.setSrc(v2p);
		v2p__element____target.setTrg(element);
		isApplicableMatch.getAllContextElements().add(v2p__element____target);
		type2Interface__type____source.setSrc(type2Interface);
		type2Interface__type____source.setTrg(type);
		isApplicableMatch.getAllContextElements().add(type2Interface__type____source);
		annotation__access____type.setSrc(annotation);
		annotation__access____type.setTrg(access);
		isApplicableMatch.getAllContextElements().add(annotation__access____type);
		type2Interface__interf____target.setSrc(type2Interface);
		type2Interface__interf____target.setTrg(interf);
		isApplicableMatch.getAllContextElements().add(type2Interface__interf____target);
		access__type____type.setName(access__type____type_name_prime);
		type__access____usagesInTypeAccess.setName(type__access____usagesInTypeAccess_name_prime);
		variable__annotation____annotations.setName(variable__annotation____annotations_name_prime);
		v2p__variable____source.setName(v2p__variable____source_name_prime);
		v2p__element____target.setName(v2p__element____target_name_prime);
		type2Interface__type____source.setName(type2Interface__type____source_name_prime);
		annotation__access____type.setName(annotation__access____type_name_prime);
		type2Interface__interf____target.setName(type2Interface__interf____target_name_prime);
		return new Object[] { annotation, access, v2p, variable, interf, type, type2Interface, element,
				isApplicableMatch, access__type____type, type__access____usagesInTypeAccess,
				variable__annotation____annotations, v2p__variable____source, v2p__element____target,
				type2Interface__type____source, annotation__access____type, type2Interface__interf____target };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_bindingFBBBBBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, IsApplicableMatch isApplicableMatch,
			Annotation annotation, TypeAccess access, ASTNode2Element v2p, SingleVariableDeclaration variable,
			Interface interf, AnnotationTypeDeclaration type, ASTNode2Element type2Interface, Parameter element) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, annotation, access, v2p, variable,
				interf, type, type2Interface, element);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, access, v2p, variable, interf, type,
					type2Interface, element };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, IsApplicableMatch isApplicableMatch,
			Annotation annotation, TypeAccess access, ASTNode2Element v2p, SingleVariableDeclaration variable,
			Interface interf, AnnotationTypeDeclaration type, ASTNode2Element type2Interface, Parameter element) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, annotation, access, v2p, variable, interf, type, type2Interface, element);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, access, v2p, variable, interf, type,
						type2Interface, element };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_5_checkCSP_expressionFBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaAnnotation2Comment4SingleVariableDeclaration";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaAnnotation2Comment4SingleVariableDeclaration_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_1_initialbindings_blackBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match, Comment comment, Interface interf,
			Parameter element) {
		return new Object[] { _this, match, comment, interf, element };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_bindingFBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match, Comment comment, Interface interf,
			Parameter element) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, comment, interf, element);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, comment, interf, element };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_bindingAndBlackFBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match, Comment comment, Interface interf,
			Parameter element) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_bindingFBBBBB(
				_this, match, comment, interf, element);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, comment, interf, element };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_3_CheckCSP_expressionFBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Comment comment, Interface interf, Parameter element) {
		return new Object[] { match, comment, interf, element };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, Comment comment, Interface interf, Parameter element) {
		EMoflonEdge element__comment____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__element____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__interf____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(comment);
		String element__comment____ownedComment_name_prime = "ownedComment";
		String comment__element____annotatedElement_name_prime = "annotatedElement";
		String comment__interf____annotatedElement_name_prime = "annotatedElement";
		element__comment____ownedComment.setSrc(element);
		element__comment____ownedComment.setTrg(comment);
		match.getToBeTranslatedEdges().add(element__comment____ownedComment);
		comment__element____annotatedElement.setSrc(comment);
		comment__element____annotatedElement.setTrg(element);
		match.getToBeTranslatedEdges().add(comment__element____annotatedElement);
		comment__interf____annotatedElement.setSrc(comment);
		comment__interf____annotatedElement.setTrg(interf);
		match.getToBeTranslatedEdges().add(comment__interf____annotatedElement);
		element__comment____ownedComment.setName(element__comment____ownedComment_name_prime);
		comment__element____annotatedElement.setName(comment__element____annotatedElement_name_prime);
		comment__interf____annotatedElement.setName(comment__interf____annotatedElement_name_prime);
		return new Object[] { match, comment, interf, element, element__comment____ownedComment,
				comment__element____annotatedElement, comment__interf____annotatedElement };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_5_collectcontextelements_blackBBBB(
			Match match, Comment comment, Interface interf, Parameter element) {
		return new Object[] { match, comment, interf, element };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_5_collectcontextelements_greenBBB(
			Match match, Interface interf, Parameter element) {
		match.getContextNodes().add(interf);
		match.getContextNodes().add(element);
		return new Object[] { match, interf, element };
	}

	public static final void pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_6_registerobjectstomatch_expressionBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match, Comment comment, Interface interf,
			Parameter element) {
		_this.registerObjectsToMatch_BWD(match, comment, interf, element);

	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("v2p");
		EObject _localVariable_1 = isApplicableMatch.getObject("variable");
		EObject _localVariable_2 = isApplicableMatch.getObject("comment");
		EObject _localVariable_3 = isApplicableMatch.getObject("interf");
		EObject _localVariable_4 = isApplicableMatch.getObject("type");
		EObject _localVariable_5 = isApplicableMatch.getObject("type2Interface");
		EObject _localVariable_6 = isApplicableMatch.getObject("element");
		EObject tmpV2p = _localVariable_0;
		EObject tmpVariable = _localVariable_1;
		EObject tmpComment = _localVariable_2;
		EObject tmpInterf = _localVariable_3;
		EObject tmpType = _localVariable_4;
		EObject tmpType2Interface = _localVariable_5;
		EObject tmpElement = _localVariable_6;
		if (tmpV2p instanceof ASTNode2Element) {
			ASTNode2Element v2p = (ASTNode2Element) tmpV2p;
			if (tmpVariable instanceof SingleVariableDeclaration) {
				SingleVariableDeclaration variable = (SingleVariableDeclaration) tmpVariable;
				if (tmpComment instanceof Comment) {
					Comment comment = (Comment) tmpComment;
					if (tmpInterf instanceof Interface) {
						Interface interf = (Interface) tmpInterf;
						if (tmpType instanceof AnnotationTypeDeclaration) {
							AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) tmpType;
							if (tmpType2Interface instanceof ASTNode2Element) {
								ASTNode2Element type2Interface = (ASTNode2Element) tmpType2Interface;
								if (tmpElement instanceof Parameter) {
									Parameter element = (Parameter) tmpElement;
									return new Object[] { v2p, variable, comment, interf, type, type2Interface, element,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_blackBBBBBBBFBB(
			ASTNode2Element v2p, SingleVariableDeclaration variable, Comment comment, Interface interf,
			AnnotationTypeDeclaration type, ASTNode2Element type2Interface, Parameter element,
			JavaAnnotation2Comment4SingleVariableDeclaration _this, IsApplicableMatch isApplicableMatch) {
		if (!type2Interface.equals(v2p)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { v2p, variable, comment, interf, type, type2Interface, element, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_binding != null) {
			ASTNode2Element v2p = (ASTNode2Element) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_binding[0];
			SingleVariableDeclaration variable = (SingleVariableDeclaration) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_binding[1];
			Comment comment = (Comment) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_binding[2];
			Interface interf = (Interface) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_binding[3];
			AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_binding[4];
			ASTNode2Element type2Interface = (ASTNode2Element) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_binding[5];
			Parameter element = (Parameter) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_binding[6];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_blackBBBBBBBFBB(
					v2p, variable, comment, interf, type, type2Interface, element, _this, isApplicableMatch);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_black[7];

				return new Object[] { v2p, variable, comment, interf, type, type2Interface, element, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_1_performtransformation_greenFFFBBB(
			SingleVariableDeclaration variable, Comment comment, AnnotationTypeDeclaration type) {
		Annotation annotation = JavaFactory.eINSTANCE.createAnnotation();
		TypeAccess access = JavaFactory.eINSTANCE.createTypeAccess();
		ASTNode2Element a2c = UmlFactory.eINSTANCE.createASTNode2Element();
		variable.getAnnotations().add(annotation);
		access.setType(type);
		annotation.setType(access);
		a2c.setSource(annotation);
		a2c.setTarget(comment);
		return new Object[] { annotation, access, a2c, variable, comment, type };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_2_collecttranslatedelements_blackBBBB(
			Annotation annotation, TypeAccess access, ASTNode2Element a2c, Comment comment) {
		return new Object[] { annotation, access, a2c, comment };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_2_collecttranslatedelements_greenFBBBB(
			Annotation annotation, TypeAccess access, ASTNode2Element a2c, Comment comment) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(annotation);
		ruleresult.getCreatedElements().add(access);
		ruleresult.getCreatedLinkElements().add(a2c);
		ruleresult.getTranslatedElements().add(comment);
		return new Object[] { ruleresult, annotation, access, a2c, comment };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject annotation, EObject access, EObject a2c, EObject v2p,
			EObject variable, EObject comment, EObject interf, EObject type, EObject type2Interface, EObject element) {
		if (!annotation.equals(v2p)) {
			if (!annotation.equals(variable)) {
				if (!annotation.equals(comment)) {
					if (!annotation.equals(interf)) {
						if (!annotation.equals(type)) {
							if (!annotation.equals(type2Interface)) {
								if (!annotation.equals(element)) {
									if (!access.equals(annotation)) {
										if (!access.equals(v2p)) {
											if (!access.equals(variable)) {
												if (!access.equals(comment)) {
													if (!access.equals(interf)) {
														if (!access.equals(type)) {
															if (!access.equals(type2Interface)) {
																if (!access.equals(element)) {
																	if (!a2c.equals(annotation)) {
																		if (!a2c.equals(access)) {
																			if (!a2c.equals(v2p)) {
																				if (!a2c.equals(variable)) {
																					if (!a2c.equals(comment)) {
																						if (!a2c.equals(interf)) {
																							if (!a2c.equals(type)) {
																								if (!a2c.equals(
																										type2Interface)) {
																									if (!a2c.equals(
																											element)) {
																										if (!v2p.equals(
																												variable)) {
																											if (!comment
																													.equals(v2p)) {
																												if (!comment
																														.equals(variable)) {
																													if (!comment
																															.equals(interf)) {
																														if (!comment
																																.equals(type)) {
																															if (!comment
																																	.equals(type2Interface)) {
																																if (!comment
																																		.equals(element)) {
																																	if (!interf
																																			.equals(v2p)) {
																																		if (!interf
																																				.equals(variable)) {
																																			if (!interf
																																					.equals(type)) {
																																				if (!interf
																																						.equals(type2Interface)) {
																																					if (!type
																																							.equals(v2p)) {
																																						if (!type
																																								.equals(variable)) {
																																							if (!type
																																									.equals(type2Interface)) {
																																								if (!type2Interface
																																										.equals(v2p)) {
																																									if (!type2Interface
																																											.equals(variable)) {
																																										if (!element
																																												.equals(v2p)) {
																																											if (!element
																																													.equals(variable)) {
																																												if (!element
																																														.equals(interf)) {
																																													if (!element
																																															.equals(type)) {
																																														if (!element
																																																.equals(type2Interface)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	annotation,
																																																	access,
																																																	a2c,
																																																	v2p,
																																																	variable,
																																																	comment,
																																																	interf,
																																																	type,
																																																	type2Interface,
																																																	element };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject annotation, EObject access, EObject a2c, EObject variable,
			EObject comment, EObject interf, EObject type, EObject element) {
		EMoflonEdge element__comment____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge access__type____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type__access____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variable__annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__element____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2c__comment____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotation__access____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__interf____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaAnnotation2Comment4SingleVariableDeclaration";
		String element__comment____ownedComment_name_prime = "ownedComment";
		String access__type____type_name_prime = "type";
		String type__access____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String variable__annotation____annotations_name_prime = "annotations";
		String comment__element____annotatedElement_name_prime = "annotatedElement";
		String a2c__annotation____source_name_prime = "source";
		String a2c__comment____target_name_prime = "target";
		String annotation__access____type_name_prime = "type";
		String comment__interf____annotatedElement_name_prime = "annotatedElement";
		element__comment____ownedComment.setSrc(element);
		element__comment____ownedComment.setTrg(comment);
		ruleresult.getTranslatedEdges().add(element__comment____ownedComment);
		access__type____type.setSrc(access);
		access__type____type.setTrg(type);
		ruleresult.getCreatedEdges().add(access__type____type);
		type__access____usagesInTypeAccess.setSrc(type);
		type__access____usagesInTypeAccess.setTrg(access);
		ruleresult.getCreatedEdges().add(type__access____usagesInTypeAccess);
		variable__annotation____annotations.setSrc(variable);
		variable__annotation____annotations.setTrg(annotation);
		ruleresult.getCreatedEdges().add(variable__annotation____annotations);
		comment__element____annotatedElement.setSrc(comment);
		comment__element____annotatedElement.setTrg(element);
		ruleresult.getTranslatedEdges().add(comment__element____annotatedElement);
		a2c__annotation____source.setSrc(a2c);
		a2c__annotation____source.setTrg(annotation);
		ruleresult.getCreatedEdges().add(a2c__annotation____source);
		a2c__comment____target.setSrc(a2c);
		a2c__comment____target.setTrg(comment);
		ruleresult.getCreatedEdges().add(a2c__comment____target);
		annotation__access____type.setSrc(annotation);
		annotation__access____type.setTrg(access);
		ruleresult.getCreatedEdges().add(annotation__access____type);
		comment__interf____annotatedElement.setSrc(comment);
		comment__interf____annotatedElement.setTrg(interf);
		ruleresult.getTranslatedEdges().add(comment__interf____annotatedElement);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		element__comment____ownedComment.setName(element__comment____ownedComment_name_prime);
		access__type____type.setName(access__type____type_name_prime);
		type__access____usagesInTypeAccess.setName(type__access____usagesInTypeAccess_name_prime);
		variable__annotation____annotations.setName(variable__annotation____annotations_name_prime);
		comment__element____annotatedElement.setName(comment__element____annotatedElement_name_prime);
		a2c__annotation____source.setName(a2c__annotation____source_name_prime);
		a2c__comment____target.setName(a2c__comment____target_name_prime);
		annotation__access____type.setName(annotation__access____type_name_prime);
		comment__interf____annotatedElement.setName(comment__interf____annotatedElement_name_prime);
		return new Object[] { ruleresult, annotation, access, a2c, variable, comment, interf, type, element,
				element__comment____ownedComment, access__type____type, type__access____usagesInTypeAccess,
				variable__annotation____annotations, comment__element____annotatedElement, a2c__annotation____source,
				a2c__comment____target, annotation__access____type, comment__interf____annotatedElement };
	}

	public static final void pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_5_registerobjects_expressionBBBBBBBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, PerformRuleResult ruleresult, EObject annotation,
			EObject access, EObject a2c, EObject v2p, EObject variable, EObject comment, EObject interf, EObject type,
			EObject type2Interface, EObject element) {
		_this.registerObjects_BWD(ruleresult, annotation, access, a2c, v2p, variable, comment, interf, type,
				type2Interface, element);

	}

	public static final PerformRuleResult pattern_JavaAnnotation2Comment4SingleVariableDeclaration_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_bindingFB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_blackFBB(
			EClass eClass, JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_bindingAndBlackFFB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaAnnotation2Comment4SingleVariableDeclaration";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_2_corematch_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("comment");
		EObject _localVariable_1 = match.getObject("interf");
		EObject _localVariable_2 = match.getObject("element");
		EObject tmpComment = _localVariable_0;
		EObject tmpInterf = _localVariable_1;
		EObject tmpElement = _localVariable_2;
		if (tmpComment instanceof Comment) {
			Comment comment = (Comment) tmpComment;
			if (tmpInterf instanceof Interface) {
				Interface interf = (Interface) tmpInterf;
				if (tmpElement instanceof Parameter) {
					Parameter element = (Parameter) tmpElement;
					return new Object[] { comment, interf, element, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_2_corematch_blackFFBBFFBB(
			Comment comment, Interface interf, Parameter element, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element v2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(element,
				ASTNode2Element.class, "target")) {
			ASTNode tmpVariable = v2p.getSource();
			if (tmpVariable instanceof SingleVariableDeclaration) {
				SingleVariableDeclaration variable = (SingleVariableDeclaration) tmpVariable;
				for (ASTNode2Element type2Interface : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(interf, ASTNode2Element.class, "target")) {
					if (!type2Interface.equals(v2p)) {
						ASTNode tmpType = type2Interface.getSource();
						if (tmpType instanceof AnnotationTypeDeclaration) {
							AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) tmpType;
							_result.add(new Object[] { v2p, variable, comment, interf, type, type2Interface, element,
									match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_3_findcontext_blackBBBBBBB(
			ASTNode2Element v2p, SingleVariableDeclaration variable, Comment comment, Interface interf,
			AnnotationTypeDeclaration type, ASTNode2Element type2Interface, Parameter element) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!type2Interface.equals(v2p)) {
			if (element.getOwnedComments().contains(comment)) {
				if (variable.equals(v2p.getSource())) {
					if (comment.getAnnotatedElements().contains(element)) {
						if (element.equals(v2p.getTarget())) {
							if (type.equals(type2Interface.getSource())) {
								if (interf.equals(type2Interface.getTarget())) {
									if (comment.getAnnotatedElements().contains(interf)) {
										_result.add(new Object[] { v2p, variable, comment, interf, type, type2Interface,
												element });
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

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_3_findcontext_greenBBBBBBBFFFFFFFF(
			ASTNode2Element v2p, SingleVariableDeclaration variable, Comment comment, Interface interf,
			AnnotationTypeDeclaration type, ASTNode2Element type2Interface, Parameter element) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge element__comment____ownedComment = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v2p__variable____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__element____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge v2p__element____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Interface__type____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge type2Interface__interf____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge comment__interf____annotatedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String element__comment____ownedComment_name_prime = "ownedComment";
		String v2p__variable____source_name_prime = "source";
		String comment__element____annotatedElement_name_prime = "annotatedElement";
		String v2p__element____target_name_prime = "target";
		String type2Interface__type____source_name_prime = "source";
		String type2Interface__interf____target_name_prime = "target";
		String comment__interf____annotatedElement_name_prime = "annotatedElement";
		isApplicableMatch.getAllContextElements().add(v2p);
		isApplicableMatch.getAllContextElements().add(variable);
		isApplicableMatch.getAllContextElements().add(comment);
		isApplicableMatch.getAllContextElements().add(interf);
		isApplicableMatch.getAllContextElements().add(type);
		isApplicableMatch.getAllContextElements().add(type2Interface);
		isApplicableMatch.getAllContextElements().add(element);
		element__comment____ownedComment.setSrc(element);
		element__comment____ownedComment.setTrg(comment);
		isApplicableMatch.getAllContextElements().add(element__comment____ownedComment);
		v2p__variable____source.setSrc(v2p);
		v2p__variable____source.setTrg(variable);
		isApplicableMatch.getAllContextElements().add(v2p__variable____source);
		comment__element____annotatedElement.setSrc(comment);
		comment__element____annotatedElement.setTrg(element);
		isApplicableMatch.getAllContextElements().add(comment__element____annotatedElement);
		v2p__element____target.setSrc(v2p);
		v2p__element____target.setTrg(element);
		isApplicableMatch.getAllContextElements().add(v2p__element____target);
		type2Interface__type____source.setSrc(type2Interface);
		type2Interface__type____source.setTrg(type);
		isApplicableMatch.getAllContextElements().add(type2Interface__type____source);
		type2Interface__interf____target.setSrc(type2Interface);
		type2Interface__interf____target.setTrg(interf);
		isApplicableMatch.getAllContextElements().add(type2Interface__interf____target);
		comment__interf____annotatedElement.setSrc(comment);
		comment__interf____annotatedElement.setTrg(interf);
		isApplicableMatch.getAllContextElements().add(comment__interf____annotatedElement);
		element__comment____ownedComment.setName(element__comment____ownedComment_name_prime);
		v2p__variable____source.setName(v2p__variable____source_name_prime);
		comment__element____annotatedElement.setName(comment__element____annotatedElement_name_prime);
		v2p__element____target.setName(v2p__element____target_name_prime);
		type2Interface__type____source.setName(type2Interface__type____source_name_prime);
		type2Interface__interf____target.setName(type2Interface__interf____target_name_prime);
		comment__interf____annotatedElement.setName(comment__interf____annotatedElement_name_prime);
		return new Object[] { v2p, variable, comment, interf, type, type2Interface, element, isApplicableMatch,
				element__comment____ownedComment, v2p__variable____source, comment__element____annotatedElement,
				v2p__element____target, type2Interface__type____source, type2Interface__interf____target,
				comment__interf____annotatedElement };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_bindingFBBBBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, IsApplicableMatch isApplicableMatch,
			ASTNode2Element v2p, SingleVariableDeclaration variable, Comment comment, Interface interf,
			AnnotationTypeDeclaration type, ASTNode2Element type2Interface, Parameter element) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, v2p, variable, comment, interf, type,
				type2Interface, element);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, v2p, variable, comment, interf, type, type2Interface,
					element };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, IsApplicableMatch isApplicableMatch,
			ASTNode2Element v2p, SingleVariableDeclaration variable, Comment comment, Interface interf,
			AnnotationTypeDeclaration type, ASTNode2Element type2Interface, Parameter element) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, v2p, variable, comment, interf, type, type2Interface, element);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, v2p, variable, comment, interf, type,
						type2Interface, element };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_5_checkCSP_expressionFBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaAnnotation2Comment4SingleVariableDeclaration";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaAnnotation2Comment4SingleVariableDeclaration_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_bindingFB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, JavaAnnotation2Comment4SingleVariableDeclaration _this) {
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

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_2_testcorematchandDECs_black_nac_0BBB(
			Comment comment, Interface interf, Parameter element) {
		for (Element __DEC_comment_annotatedElement_879866 : comment.getAnnotatedElements()) {
			if (!comment.equals(__DEC_comment_annotatedElement_879866)) {
				if (!interf.equals(__DEC_comment_annotatedElement_879866)) {
					if (!element.equals(__DEC_comment_annotatedElement_879866)) {
						return new Object[] { comment, interf, element };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_ownedComment) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpElement = _edge_ownedComment.getSrc();
		if (tmpElement instanceof Parameter) {
			Parameter element = (Parameter) tmpElement;
			EObject tmpComment = _edge_ownedComment.getTrg();
			if (tmpComment instanceof Comment) {
				Comment comment = (Comment) tmpComment;
				if (element.getOwnedComments().contains(comment)) {
					if (comment.getAnnotatedElements().contains(element)) {
						for (Element tmpInterf : comment.getAnnotatedElements()) {
							if (tmpInterf instanceof Interface) {
								Interface interf = (Interface) tmpInterf;
								if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_2_testcorematchandDECs_black_nac_0BBB(
										comment, interf, element) == null) {
									_result.add(new Object[] { comment, interf, element, _edge_ownedComment });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match, Comment comment, Interface interf,
			Parameter element) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, comment, interf, element);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaAnnotation2Comment4SingleVariableDeclaration_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_bindingFB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, JavaAnnotation2Comment4SingleVariableDeclaration _this) {
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

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_0BB(
			Annotation annotation, AnnotationTypeDeclaration type) {
		for (BodyDeclaration __DEC_annotation_annotations_219595 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, BodyDeclaration.class, "annotations")) {
			if (!type.equals(__DEC_annotation_annotations_219595)) {
				return new Object[] { annotation, type };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_1B(
			Annotation annotation) {
		for (AnnotationMemberValuePair __DEC_annotation_value_855870 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { annotation };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess access, AnnotationTypeDeclaration type) {
		for (AbstractTypeDeclaration __DEC_access_superInterfaces_539938 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!type.equals(__DEC_access_superInterfaces_539938)) {
				return new Object[] { access, type };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess access) {
		for (ArrayType __DEC_access_elementType_568208 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ArrayType.class, "elementType")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess access) {
		for (ClassDeclaration __DEC_access_superClass_657892 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassDeclaration.class, "superClass")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess access) {
		for (MethodDeclaration __DEC_access_returnType_841010 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, MethodDeclaration.class, "returnType")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess access) {
		for (ParameterizedType __DEC_access_type_684226 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ParameterizedType.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_7BB(
			TypeAccess access, SingleVariableDeclaration variable) {
		for (SingleVariableDeclaration __DEC_access_type_210838 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, SingleVariableDeclaration.class, "type")) {
			if (!variable.equals(__DEC_access_type_210838)) {
				return new Object[] { access, variable };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_8B(
			TypeAccess access) {
		for (AnnotationMemberValuePair __DEC_access_value_396526 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_9BB(
			AnnotationTypeDeclaration type, Annotation annotation) {
		if (type.getAnnotations().contains(annotation)) {
			return new Object[] { type, annotation };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_10BB(
			AnnotationTypeDeclaration type, TypeAccess access) {
		if (type.getSuperInterfaces().contains(access)) {
			return new Object[] { type, access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_11BB(
			SingleVariableDeclaration variable, TypeAccess access) {
		if (access.equals(variable.getType())) {
			return new Object[] { variable, access };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAccess = _edge_type.getSrc();
		if (tmpAccess instanceof TypeAccess) {
			TypeAccess access = (TypeAccess) tmpAccess;
			EObject tmpType = _edge_type.getTrg();
			if (tmpType instanceof AnnotationTypeDeclaration) {
				AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) tmpType;
				if (type.equals(access.getType())) {
					if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_3B(
							access) == null) {
						if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_4B(
								access) == null) {
							if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_5B(
									access) == null) {
								if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_6B(
										access) == null) {
									if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_8B(
											access) == null) {
										if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_2BB(
												access, type) == null) {
											if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_10BB(
													type, access) == null) {
												for (Annotation annotation : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(access, Annotation.class, "type")) {
													if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_0BB(
															annotation, type) == null) {
														if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_1B(
																annotation) == null) {
															if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_9BB(
																	type, annotation) == null) {
																for (SingleVariableDeclaration variable : org.moflon.core.utilities.eMoflonEMFUtil
																		.getOppositeReferenceTyped(annotation,
																				SingleVariableDeclaration.class,
																				"annotations")) {
																	if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_7BB(
																			access, variable) == null) {
																		if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_black_nac_11BB(
																				variable, access) == null) {
																			_result.add(new Object[] { annotation,
																					access, variable, type,
																					_edge_type });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match, Annotation annotation,
			TypeAccess access, SingleVariableDeclaration variable, AnnotationTypeDeclaration type) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, annotation, access, variable, type);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaAnnotation2Comment4SingleVariableDeclaration_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_1_prepare_blackB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("annotation");
		EObject _localVariable_1 = sourceMatch.getObject("access");
		EObject _localVariable_2 = sourceMatch.getObject("variable");
		EObject _localVariable_3 = targetMatch.getObject("comment");
		EObject _localVariable_4 = targetMatch.getObject("interf");
		EObject _localVariable_5 = sourceMatch.getObject("type");
		EObject _localVariable_6 = targetMatch.getObject("element");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpAccess = _localVariable_1;
		EObject tmpVariable = _localVariable_2;
		EObject tmpComment = _localVariable_3;
		EObject tmpInterf = _localVariable_4;
		EObject tmpType = _localVariable_5;
		EObject tmpElement = _localVariable_6;
		if (tmpAnnotation instanceof Annotation) {
			Annotation annotation = (Annotation) tmpAnnotation;
			if (tmpAccess instanceof TypeAccess) {
				TypeAccess access = (TypeAccess) tmpAccess;
				if (tmpVariable instanceof SingleVariableDeclaration) {
					SingleVariableDeclaration variable = (SingleVariableDeclaration) tmpVariable;
					if (tmpComment instanceof Comment) {
						Comment comment = (Comment) tmpComment;
						if (tmpInterf instanceof Interface) {
							Interface interf = (Interface) tmpInterf;
							if (tmpType instanceof AnnotationTypeDeclaration) {
								AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) tmpType;
								if (tmpElement instanceof Parameter) {
									Parameter element = (Parameter) tmpElement;
									return new Object[] { annotation, access, variable, comment, interf, type, element,
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

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			Annotation annotation, TypeAccess access, SingleVariableDeclaration variable, Comment comment,
			Interface interf, AnnotationTypeDeclaration type, Parameter element, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { annotation, access, variable, comment, interf, type, element, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_binding != null) {
			Annotation annotation = (Annotation) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_binding[0];
			TypeAccess access = (TypeAccess) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_binding[1];
			SingleVariableDeclaration variable = (SingleVariableDeclaration) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_binding[2];
			Comment comment = (Comment) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_binding[3];
			Interface interf = (Interface) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_binding[4];
			AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_binding[5];
			Parameter element = (Parameter) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					annotation, access, variable, comment, interf, type, element, sourceMatch, targetMatch);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { annotation, access, variable, comment, interf, type, element, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_bindingFBBBBBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Annotation annotation, TypeAccess access,
			SingleVariableDeclaration variable, Comment comment, Interface interf, AnnotationTypeDeclaration type,
			Parameter element, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(annotation, access, variable, comment, interf, type,
				element, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, annotation, access, variable, comment, interf, type, element, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, Annotation annotation, TypeAccess access,
			SingleVariableDeclaration variable, Comment comment, Interface interf, AnnotationTypeDeclaration type,
			Parameter element, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, annotation, access, variable, comment, interf, type, element, sourceMatch, targetMatch);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_binding[0];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, annotation, access, variable, comment, interf, type, element,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_4_checkCSP_expressionFB(
			CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_5_matchcorrcontext_blackFBBBFBBB(
			SingleVariableDeclaration variable, Interface interf, AnnotationTypeDeclaration type, Parameter element,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element v2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(variable,
					ASTNode2Element.class, "source")) {
				if (element.equals(v2p.getTarget())) {
					for (ASTNode2Element type2Interface : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(type, ASTNode2Element.class, "source")) {
						if (!type2Interface.equals(v2p)) {
							if (interf.equals(type2Interface.getTarget())) {
								_result.add(new Object[] { v2p, variable, interf, type, type2Interface, element,
										sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element v2p, ASTNode2Element type2Interface, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "JavaAnnotation2Comment4SingleVariableDeclaration";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(v2p);
		ccMatch.getAllContextElements().add(type2Interface);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { v2p, type2Interface, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_6_createcorrespondence_blackBBBBBBBB(
			Annotation annotation, TypeAccess access, SingleVariableDeclaration variable, Comment comment,
			Interface interf, AnnotationTypeDeclaration type, Parameter element, CCMatch ccMatch) {
		return new Object[] { annotation, access, variable, comment, interf, type, element, ccMatch };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_6_createcorrespondence_greenBFBB(
			Annotation annotation, Comment comment, CCMatch ccMatch) {
		ASTNode2Element a2c = UmlFactory.eINSTANCE.createASTNode2Element();
		a2c.setSource(annotation);
		a2c.setTarget(comment);
		ccMatch.getCreateCorr().add(a2c);
		return new Object[] { annotation, a2c, comment, ccMatch };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "JavaAnnotation2Comment4SingleVariableDeclaration";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaAnnotation2Comment4SingleVariableDeclaration_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_0BB(
			Annotation annotation, AnnotationTypeDeclaration type) {
		for (BodyDeclaration __DEC_annotation_annotations_82875 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, BodyDeclaration.class, "annotations")) {
			if (!type.equals(__DEC_annotation_annotations_82875)) {
				return new Object[] { annotation, type };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_1B(
			Annotation annotation) {
		for (AnnotationMemberValuePair __DEC_annotation_value_501570 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { annotation };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess access, AnnotationTypeDeclaration type) {
		for (AbstractTypeDeclaration __DEC_access_superInterfaces_332230 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!type.equals(__DEC_access_superInterfaces_332230)) {
				return new Object[] { access, type };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_3B(
			TypeAccess access) {
		for (ArrayType __DEC_access_elementType_677617 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ArrayType.class, "elementType")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_4B(
			TypeAccess access) {
		for (ClassDeclaration __DEC_access_superClass_190659 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ClassDeclaration.class, "superClass")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_5B(
			TypeAccess access) {
		for (MethodDeclaration __DEC_access_returnType_280280 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, MethodDeclaration.class, "returnType")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_6B(
			TypeAccess access) {
		for (ParameterizedType __DEC_access_type_75513 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, ParameterizedType.class, "type")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_7BB(
			TypeAccess access, SingleVariableDeclaration variable) {
		for (SingleVariableDeclaration __DEC_access_type_873370 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, SingleVariableDeclaration.class, "type")) {
			if (!variable.equals(__DEC_access_type_873370)) {
				return new Object[] { access, variable };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_8B(
			TypeAccess access) {
		for (AnnotationMemberValuePair __DEC_access_value_212922 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(access, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_9BB(
			AnnotationTypeDeclaration type, Annotation annotation) {
		if (type.getAnnotations().contains(annotation)) {
			return new Object[] { type, annotation };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_10BB(
			AnnotationTypeDeclaration type, TypeAccess access) {
		if (type.getSuperInterfaces().contains(access)) {
			return new Object[] { type, access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_11BB(
			SingleVariableDeclaration variable, TypeAccess access) {
		if (access.equals(variable.getType())) {
			return new Object[] { variable, access };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_blackBBBB(
			Annotation annotation, TypeAccess access, SingleVariableDeclaration variable,
			AnnotationTypeDeclaration type) {
		if (type.equals(access.getType())) {
			if (variable.getAnnotations().contains(annotation)) {
				if (access.equals(annotation.getType())) {
					if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_0BB(
							annotation, type) == null) {
						if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_1B(
								annotation) == null) {
							if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_2BB(
									access, type) == null) {
								if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_3B(
										access) == null) {
									if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_4B(
											access) == null) {
										if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_5B(
												access) == null) {
											if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_6B(
													access) == null) {
												if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_7BB(
														access, variable) == null) {
													if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_8B(
															access) == null) {
														if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_9BB(
																type, annotation) == null) {
															if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_10BB(
																	type, access) == null) {
																if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_1_matchtggpattern_black_nac_11BB(
																		variable, access) == null) {
																	return new Object[] { annotation, access, variable,
																			type };
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_28_1_matchtggpattern_black_nac_0BBB(
			Comment comment, Interface interf, Parameter element) {
		for (Element __DEC_comment_annotatedElement_232963 : comment.getAnnotatedElements()) {
			if (!comment.equals(__DEC_comment_annotatedElement_232963)) {
				if (!interf.equals(__DEC_comment_annotatedElement_232963)) {
					if (!element.equals(__DEC_comment_annotatedElement_232963)) {
						return new Object[] { comment, interf, element };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_28_1_matchtggpattern_blackBBB(
			Comment comment, Interface interf, Parameter element) {
		if (element.getOwnedComments().contains(comment)) {
			if (comment.getAnnotatedElements().contains(element)) {
				if (comment.getAnnotatedElements().contains(interf)) {
					if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_28_1_matchtggpattern_black_nac_0BBB(
							comment, interf, element) == null) {
						return new Object[] { comment, interf, element };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_1_createresult_blackB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element v2p) {
		if (ruleResult.getCorrObjects().contains(v2p)) {
			return new Object[] { ruleResult, v2p };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SingleVariableDeclaration variable) {
		if (ruleResult.getSourceObjects().contains(variable)) {
			return new Object[] { ruleResult, variable };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Parameter element) {
		if (ruleResult.getTargetObjects().contains(element)) {
			return new Object[] { ruleResult, element };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Interface interf) {
		if (ruleResult.getTargetObjects().contains(interf)) {
			return new Object[] { ruleResult, interf };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element type2Interface) {
		if (ruleResult.getCorrObjects().contains(type2Interface)) {
			return new Object[] { ruleResult, type2Interface };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AnnotationTypeDeclaration type) {
		if (ruleResult.getSourceObjects().contains(type)) {
			return new Object[] { ruleResult, type };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList v2pList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList type2InterfaceList : ruleEntryContainer.getRuleEntryList()) {
				if (!type2InterfaceList.equals(v2pList)) {
					for (EObject tmpV2p : v2pList.getEntryObjects()) {
						if (tmpV2p instanceof ASTNode2Element) {
							ASTNode2Element v2p = (ASTNode2Element) tmpV2p;
							ASTNode tmpVariable = v2p.getSource();
							if (tmpVariable instanceof SingleVariableDeclaration) {
								SingleVariableDeclaration variable = (SingleVariableDeclaration) tmpVariable;
								Element tmpElement = v2p.getTarget();
								if (tmpElement instanceof Parameter) {
									Parameter element = (Parameter) tmpElement;
									if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, v2p) == null) {
										if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, variable) == null) {
											if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, element) == null) {
												for (EObject tmpType2Interface : type2InterfaceList.getEntryObjects()) {
													if (tmpType2Interface instanceof ASTNode2Element) {
														ASTNode2Element type2Interface = (ASTNode2Element) tmpType2Interface;
														if (!type2Interface.equals(v2p)) {
															Element tmpInterf = type2Interface.getTarget();
															if (tmpInterf instanceof Interface) {
																Interface interf = (Interface) tmpInterf;
																ASTNode tmpType = type2Interface.getSource();
																if (tmpType instanceof AnnotationTypeDeclaration) {
																	AnnotationTypeDeclaration type = (AnnotationTypeDeclaration) tmpType;
																	if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, type2Interface) == null) {
																		if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, interf) == null) {
																			if (pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, type) == null) {
																				_result.add(new Object[] { v2pList, v2p,
																						variable, element,
																						type2InterfaceList, interf,
																						type2Interface, type,
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
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_bindingFBBBBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, IsApplicableMatch isApplicableMatch,
			ASTNode2Element v2p, SingleVariableDeclaration variable, Interface interf, AnnotationTypeDeclaration type,
			ASTNode2Element type2Interface, Parameter element, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, v2p, variable, interf, type,
				type2Interface, element, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, v2p, variable, interf, type, type2Interface, element,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, IsApplicableMatch isApplicableMatch,
			ASTNode2Element v2p, SingleVariableDeclaration variable, Interface interf, AnnotationTypeDeclaration type,
			ASTNode2Element type2Interface, Parameter element, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_binding = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, v2p, variable, interf, type, type2Interface, element, ruleResult);
		if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_binding[0];

			Object[] result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_black = pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, v2p, variable, interf, type, type2Interface,
						element, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_4_checkCSP_expressionFBB(
			JavaAnnotation2Comment4SingleVariableDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_5_checknacs_blackBBBBBB(
			ASTNode2Element v2p, SingleVariableDeclaration variable, Interface interf, AnnotationTypeDeclaration type,
			ASTNode2Element type2Interface, Parameter element) {
		if (!type2Interface.equals(v2p)) {
			return new Object[] { v2p, variable, interf, type, type2Interface, element };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_6_perform_blackBBBBBBB(
			ASTNode2Element v2p, SingleVariableDeclaration variable, Interface interf, AnnotationTypeDeclaration type,
			ASTNode2Element type2Interface, Parameter element, ModelgeneratorRuleResult ruleResult) {
		if (!type2Interface.equals(v2p)) {
			return new Object[] { v2p, variable, interf, type, type2Interface, element, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_6_perform_greenFFFBFBBBBB(
			SingleVariableDeclaration variable, Interface interf, AnnotationTypeDeclaration type, Parameter element,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Annotation annotation = JavaFactory.eINSTANCE.createAnnotation();
		TypeAccess access = JavaFactory.eINSTANCE.createTypeAccess();
		ASTNode2Element a2c = UmlFactory.eINSTANCE.createASTNode2Element();
		Comment comment = UMLFactory.eINSTANCE.createComment();
		Object _localVariable_0 = csp.getValue("comment", "body");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		variable.getAnnotations().add(annotation);
		ruleResult.getSourceObjects().add(annotation);
		access.setType(type);
		annotation.setType(access);
		ruleResult.getSourceObjects().add(access);
		a2c.setSource(annotation);
		ruleResult.getCorrObjects().add(a2c);
		element.getOwnedComments().add(comment);
		comment.getAnnotatedElements().add(element);
		a2c.setTarget(comment);
		comment.getAnnotatedElements().add(interf);
		ruleResult.getTargetObjects().add(comment);
		String comment_body_prime = (String) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		comment.setBody(comment_body_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { annotation, access, a2c, variable, comment, interf, type, element, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_JavaAnnotation2Comment4SingleVariableDeclaration_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //JavaAnnotation2Comment4SingleVariableDeclarationImpl
