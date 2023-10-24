/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.BodyDeclaration;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.AnnotationToTAnnotation;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.Annotation;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.annotations.AnnotationsFactory;
import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;

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
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationImpl extends AbstractRuleImpl implements Annotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Annotation Annotation,
			BodyDeclaration astNode) {

		Object[] result1_black = AnnotationImpl.pattern_Annotation_0_1_initialbindings_blackBBBB(this, match,
				Annotation, astNode);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[Annotation] = " + Annotation + ", " + "[astNode] = " + astNode + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationImpl.pattern_Annotation_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, Annotation, astNode);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[Annotation] = " + Annotation + ", " + "[astNode] = " + astNode + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationImpl.pattern_Annotation_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationImpl.pattern_Annotation_0_4_collectelementstobetranslated_blackBBB(match,
					Annotation, astNode);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[Annotation] = " + Annotation + ", " + "[astNode] = " + astNode + ".");
			}
			AnnotationImpl.pattern_Annotation_0_4_collectelementstobetranslated_greenBBBF(match, Annotation, astNode);
			//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationImpl.pattern_Annotation_0_5_collectcontextelements_blackBBB(match,
					Annotation, astNode);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[Annotation] = " + Annotation + ", " + "[astNode] = " + astNode + ".");
			}
			AnnotationImpl.pattern_Annotation_0_5_collectcontextelements_greenBB(match, astNode);

			// 
			AnnotationImpl.pattern_Annotation_0_6_registerobjectstomatch_expressionBBBB(this, match, Annotation,
					astNode);
			return AnnotationImpl.pattern_Annotation_0_7_expressionF();
		} else {
			return AnnotationImpl.pattern_Annotation_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationImpl
				.pattern_Annotation_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.Annotation Annotation = (org.eclipse.modisco.java.Annotation) result1_bindingAndBlack[0];
		TAnnotatable tAnnotable = (TAnnotatable) result1_bindingAndBlack[1];
		ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result1_bindingAndBlack[2];
		BodyDeclaration astNode = (BodyDeclaration) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = AnnotationImpl.pattern_Annotation_1_1_performtransformation_greenBBFF(Annotation,
				tAnnotable);
		AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result1_green[2];
		TAnnotation tAnnotation = (TAnnotation) result1_green[3];

		Object[] result2_black = AnnotationImpl.pattern_Annotation_1_2_collecttranslatedelements_blackBBB(Annotation,
				AnnotationToTAnnotation, tAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[Annotation] = " + Annotation
					+ ", " + "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", " + "[tAnnotation] = "
					+ tAnnotation + ".");
		}
		Object[] result2_green = AnnotationImpl.pattern_Annotation_1_2_collecttranslatedelements_greenFBBB(Annotation,
				AnnotationToTAnnotation, tAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationImpl.pattern_Annotation_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				Annotation, tAnnotable, AnnotationToTAnnotation, aSTNodeToTAnnotable, tAnnotation, astNode);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[Annotation] = " + Annotation + ", " + "[tAnnotable] = " + tAnnotable + ", "
					+ "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", " + "[aSTNodeToTAnnotable] = "
					+ aSTNodeToTAnnotable + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[astNode] = " + astNode
					+ ".");
		}
		AnnotationImpl.pattern_Annotation_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, Annotation, tAnnotable,
				AnnotationToTAnnotation, tAnnotation, astNode);
		//nothing EMoflonEdge AnnotationToTAnnotation__Annotation____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge AnnotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[10];

		// 
		// 
		AnnotationImpl.pattern_Annotation_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, Annotation,
				tAnnotable, AnnotationToTAnnotation, aSTNodeToTAnnotable, tAnnotation, astNode);
		return AnnotationImpl.pattern_Annotation_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationImpl
				.pattern_Annotation_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationImpl.pattern_Annotation_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationImpl.pattern_Annotation_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Annotation Annotation = (org.eclipse.modisco.java.Annotation) result2_binding[0];
		BodyDeclaration astNode = (BodyDeclaration) result2_binding[1];
		for (Object[] result2_black : AnnotationImpl.pattern_Annotation_2_2_corematch_blackBFFBB(Annotation, astNode,
				match)) {
			TAnnotatable tAnnotable = (TAnnotatable) result2_black[1];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result2_black[2];
			// ForEach 
			for (Object[] result3_black : AnnotationImpl.pattern_Annotation_2_3_findcontext_blackBBBB(Annotation,
					tAnnotable, aSTNodeToTAnnotable, astNode)) {
				Object[] result3_green = AnnotationImpl.pattern_Annotation_2_3_findcontext_greenBBBBFFFF(Annotation,
						tAnnotable, aSTNodeToTAnnotable, astNode);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge aSTNodeToTAnnotable__astNode____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge aSTNodeToTAnnotable__tAnnotable____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = AnnotationImpl
						.pattern_Annotation_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, Annotation,
								tAnnotable, aSTNodeToTAnnotable, astNode);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[Annotation] = " + Annotation
							+ ", " + "[tAnnotable] = " + tAnnotable + ", " + "[aSTNodeToTAnnotable] = "
							+ aSTNodeToTAnnotable + ", " + "[astNode] = " + astNode + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationImpl.pattern_Annotation_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationImpl
							.pattern_Annotation_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationImpl.pattern_Annotation_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationImpl.pattern_Annotation_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Annotation Annotation,
			BodyDeclaration astNode) {
		match.registerObject("Annotation", Annotation);
		match.registerObject("astNode", astNode);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Annotation Annotation,
			BodyDeclaration astNode) {// Create CSP
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
			org.eclipse.modisco.java.Annotation Annotation, TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, BodyDeclaration astNode) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("Annotation", Annotation);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		isApplicableMatch.registerObject("astNode", astNode);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject Annotation, EObject tAnnotable,
			EObject AnnotationToTAnnotation, EObject aSTNodeToTAnnotable, EObject tAnnotation, EObject astNode) {
		ruleresult.registerObject("Annotation", Annotation);
		ruleresult.registerObject("tAnnotable", tAnnotable);
		ruleresult.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
		ruleresult.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("astNode", astNode);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("Annotation").eClass())
				.equals("java.Annotation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TAnnotatable tAnnotable, TAnnotation tAnnotation) {

		Object[] result1_black = AnnotationImpl.pattern_Annotation_10_1_initialbindings_blackBBBB(this, match,
				tAnnotable, tAnnotation);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tAnnotable] = " + tAnnotable + ", " + "[tAnnotation] = " + tAnnotation + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationImpl.pattern_Annotation_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, tAnnotable, tAnnotation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tAnnotable] = " + tAnnotable + ", " + "[tAnnotation] = " + tAnnotation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationImpl.pattern_Annotation_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationImpl
					.pattern_Annotation_10_4_collectelementstobetranslated_blackBBB(match, tAnnotable, tAnnotation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotable] = " + tAnnotable + ", " + "[tAnnotation] = " + tAnnotation + ".");
			}
			AnnotationImpl.pattern_Annotation_10_4_collectelementstobetranslated_greenBBBFF(match, tAnnotable,
					tAnnotation);
			//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result4_green[4];

			Object[] result5_black = AnnotationImpl.pattern_Annotation_10_5_collectcontextelements_blackBBB(match,
					tAnnotable, tAnnotation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotable] = " + tAnnotable + ", " + "[tAnnotation] = " + tAnnotation + ".");
			}
			AnnotationImpl.pattern_Annotation_10_5_collectcontextelements_greenBB(match, tAnnotable);

			// 
			AnnotationImpl.pattern_Annotation_10_6_registerobjectstomatch_expressionBBBB(this, match, tAnnotable,
					tAnnotation);
			return AnnotationImpl.pattern_Annotation_10_7_expressionF();
		} else {
			return AnnotationImpl.pattern_Annotation_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationImpl
				.pattern_Annotation_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAnnotatable tAnnotable = (TAnnotatable) result1_bindingAndBlack[0];
		ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result1_bindingAndBlack[1];
		TAnnotation tAnnotation = (TAnnotation) result1_bindingAndBlack[2];
		BodyDeclaration astNode = (BodyDeclaration) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = AnnotationImpl.pattern_Annotation_11_1_performtransformation_greenFFBB(tAnnotation,
				astNode);
		org.eclipse.modisco.java.Annotation Annotation = (org.eclipse.modisco.java.Annotation) result1_green[0];
		AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result1_green[1];

		Object[] result2_black = AnnotationImpl.pattern_Annotation_11_2_collecttranslatedelements_blackBBB(Annotation,
				AnnotationToTAnnotation, tAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[Annotation] = " + Annotation
					+ ", " + "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", " + "[tAnnotation] = "
					+ tAnnotation + ".");
		}
		Object[] result2_green = AnnotationImpl.pattern_Annotation_11_2_collecttranslatedelements_greenFBBB(Annotation,
				AnnotationToTAnnotation, tAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationImpl.pattern_Annotation_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				Annotation, tAnnotable, AnnotationToTAnnotation, aSTNodeToTAnnotable, tAnnotation, astNode);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[Annotation] = " + Annotation + ", " + "[tAnnotable] = " + tAnnotable + ", "
					+ "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", " + "[aSTNodeToTAnnotable] = "
					+ aSTNodeToTAnnotable + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[astNode] = " + astNode
					+ ".");
		}
		AnnotationImpl.pattern_Annotation_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, Annotation, tAnnotable,
				AnnotationToTAnnotation, tAnnotation, astNode);
		//nothing EMoflonEdge AnnotationToTAnnotation__Annotation____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge AnnotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[10];

		// 
		// 
		AnnotationImpl.pattern_Annotation_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, Annotation,
				tAnnotable, AnnotationToTAnnotation, aSTNodeToTAnnotable, tAnnotation, astNode);
		return AnnotationImpl.pattern_Annotation_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationImpl
				.pattern_Annotation_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationImpl.pattern_Annotation_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationImpl.pattern_Annotation_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAnnotatable tAnnotable = (TAnnotatable) result2_binding[0];
		TAnnotation tAnnotation = (TAnnotation) result2_binding[1];
		for (Object[] result2_black : AnnotationImpl.pattern_Annotation_12_2_corematch_blackBFBFB(tAnnotable,
				tAnnotation, match)) {
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result2_black[1];
			BodyDeclaration astNode = (BodyDeclaration) result2_black[3];
			// ForEach 
			for (Object[] result3_black : AnnotationImpl.pattern_Annotation_12_3_findcontext_blackBBBB(tAnnotable,
					aSTNodeToTAnnotable, tAnnotation, astNode)) {
				Object[] result3_green = AnnotationImpl.pattern_Annotation_12_3_findcontext_greenBBBBFFFFF(tAnnotable,
						aSTNodeToTAnnotable, tAnnotation, astNode);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge aSTNodeToTAnnotable__astNode____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge aSTNodeToTAnnotable__tAnnotable____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = AnnotationImpl
						.pattern_Annotation_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, tAnnotable,
								aSTNodeToTAnnotable, tAnnotation, astNode);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAnnotable] = " + tAnnotable
							+ ", " + "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable + ", " + "[tAnnotation] = "
							+ tAnnotation + ", " + "[astNode] = " + astNode + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationImpl.pattern_Annotation_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationImpl
							.pattern_Annotation_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationImpl.pattern_Annotation_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationImpl.pattern_Annotation_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		match.registerObject("tAnnotable", tAnnotable);
		match.registerObject("tAnnotation", tAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAnnotatable tAnnotable, TAnnotation tAnnotation) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, TAnnotation tAnnotation, BodyDeclaration astNode) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("astNode", astNode);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject Annotation, EObject tAnnotable,
			EObject AnnotationToTAnnotation, EObject aSTNodeToTAnnotable, EObject tAnnotation, EObject astNode) {
		ruleresult.registerObject("Annotation", Annotation);
		ruleresult.registerObject("tAnnotable", tAnnotable);
		ruleresult.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
		ruleresult.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("astNode", astNode);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAnnotation").eClass())
				.equals("basic.annotations.TAnnotation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_13(EMoflonEdge _edge_tAnnotated) {

		Object[] result1_bindingAndBlack = AnnotationImpl
				.pattern_Annotation_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationImpl.pattern_Annotation_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationImpl
				.pattern_Annotation_20_2_testcorematchandDECs_blackFFB(_edge_tAnnotated)) {
			TAnnotatable tAnnotable = (TAnnotatable) result2_black[0];
			TAnnotation tAnnotation = (TAnnotation) result2_black[1];
			Object[] result2_green = AnnotationImpl.pattern_Annotation_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationImpl.pattern_Annotation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, tAnnotable, tAnnotation)) {
				// 
				if (AnnotationImpl.pattern_Annotation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = AnnotationImpl.pattern_Annotation_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationImpl.pattern_Annotation_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationImpl.pattern_Annotation_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_15(EMoflonEdge _edge_annotations) {

		Object[] result1_bindingAndBlack = AnnotationImpl
				.pattern_Annotation_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationImpl.pattern_Annotation_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationImpl
				.pattern_Annotation_21_2_testcorematchandDECs_blackFFB(_edge_annotations)) {
			org.eclipse.modisco.java.Annotation Annotation = (org.eclipse.modisco.java.Annotation) result2_black[0];
			BodyDeclaration astNode = (BodyDeclaration) result2_black[1];
			Object[] result2_green = AnnotationImpl.pattern_Annotation_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationImpl.pattern_Annotation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, Annotation, astNode)) {
				// 
				if (AnnotationImpl.pattern_Annotation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = AnnotationImpl.pattern_Annotation_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationImpl.pattern_Annotation_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationImpl.pattern_Annotation_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("Annotation");
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
		ruleResult.setRule("Annotation");
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

		Object[] result1_black = AnnotationImpl.pattern_Annotation_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationImpl.pattern_Annotation_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationImpl
				.pattern_Annotation_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.modisco.java.Annotation Annotation = (org.eclipse.modisco.java.Annotation) result2_bindingAndBlack[0];
		TAnnotatable tAnnotable = (TAnnotatable) result2_bindingAndBlack[1];
		TAnnotation tAnnotation = (TAnnotation) result2_bindingAndBlack[2];
		BodyDeclaration astNode = (BodyDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = AnnotationImpl.pattern_Annotation_24_3_solvecsp_bindingAndBlackFBBBBBBB(this,
				Annotation, tAnnotable, tAnnotation, astNode, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[Annotation] = " + Annotation + ", " + "[tAnnotable] = " + tAnnotable + ", " + "[tAnnotation] = "
					+ tAnnotation + ", " + "[astNode] = " + astNode + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationImpl.pattern_Annotation_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationImpl.pattern_Annotation_24_5_matchcorrcontext_blackBFBBB(tAnnotable,
					astNode, sourceMatch, targetMatch)) {
				ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result5_black[1];
				Object[] result5_green = AnnotationImpl.pattern_Annotation_24_5_matchcorrcontext_greenBBBF(
						aSTNodeToTAnnotable, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = AnnotationImpl.pattern_Annotation_24_6_createcorrespondence_blackBBBBB(
						Annotation, tAnnotable, tAnnotation, astNode, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[Annotation] = "
							+ Annotation + ", " + "[tAnnotable] = " + tAnnotable + ", " + "[tAnnotation] = "
							+ tAnnotation + ", " + "[astNode] = " + astNode + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationImpl.pattern_Annotation_24_6_createcorrespondence_greenBFBB(Annotation, tAnnotation, ccMatch);
				//nothing AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result6_green[1];

				Object[] result7_black = AnnotationImpl.pattern_Annotation_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationImpl.pattern_Annotation_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationImpl.pattern_Annotation_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.modisco.java.Annotation Annotation, TAnnotatable tAnnotable,
			TAnnotation tAnnotation, BodyDeclaration astNode, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Annotation Annotation, BodyDeclaration astNode) {// 
		Object[] result1_black = AnnotationImpl.pattern_Annotation_27_1_matchtggpattern_blackBB(Annotation, astNode);
		if (result1_black != null) {
			return AnnotationImpl.pattern_Annotation_27_2_expressionF();
		} else {
			return AnnotationImpl.pattern_Annotation_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAnnotatable tAnnotable, TAnnotation tAnnotation) {// 
		Object[] result1_black = AnnotationImpl.pattern_Annotation_28_1_matchtggpattern_blackBB(tAnnotable,
				tAnnotation);
		if (result1_black != null) {
			return AnnotationImpl.pattern_Annotation_28_2_expressionF();
		} else {
			return AnnotationImpl.pattern_Annotation_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNodeToTAnnotatable aSTNodeToTAnnotableParameter) {

		Object[] result1_black = AnnotationImpl.pattern_Annotation_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationImpl.pattern_Annotation_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationImpl
				.pattern_Annotation_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList aSTNodeToTAnnotableList = (RuleEntryList) result2_black[0];
			TAnnotatable tAnnotable = (TAnnotatable) result2_black[1];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result2_black[2];
			BodyDeclaration astNode = (BodyDeclaration) result2_black[3];

			Object[] result3_bindingAndBlack = AnnotationImpl.pattern_Annotation_29_3_solveCSP_bindingAndBlackFBBBBBB(
					this, isApplicableMatch, tAnnotable, aSTNodeToTAnnotable, astNode, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAnnotable] = " + tAnnotable + ", "
						+ "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable + ", " + "[astNode] = " + astNode + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationImpl.pattern_Annotation_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnnotationImpl.pattern_Annotation_29_5_checknacs_blackBBB(tAnnotable,
						aSTNodeToTAnnotable, astNode);
				if (result5_black != null) {

					Object[] result6_black = AnnotationImpl.pattern_Annotation_29_6_perform_blackBBBB(tAnnotable,
							aSTNodeToTAnnotable, astNode, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotable] = "
								+ tAnnotable + ", " + "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable + ", "
								+ "[astNode] = " + astNode + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationImpl.pattern_Annotation_29_6_perform_greenFBFFBB(tAnnotable, astNode, ruleResult);
					//nothing org.eclipse.modisco.java.Annotation Annotation = (org.eclipse.modisco.java.Annotation) result6_green[0];
					//nothing AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result6_green[2];
					//nothing TAnnotation tAnnotation = (TAnnotation) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return AnnotationImpl.pattern_Annotation_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, BodyDeclaration astNode, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		isApplicableMatch.registerObject("astNode", astNode);
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
		case RulesPackage.ANNOTATION___IS_APPROPRIATE_FWD__MATCH_ANNOTATION_BODYDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Annotation) arguments.get(1),
					(BodyDeclaration) arguments.get(2));
		case RulesPackage.ANNOTATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANNOTATION_BODYDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Annotation) arguments.get(1),
					(BodyDeclaration) arguments.get(2));
			return null;
		case RulesPackage.ANNOTATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANNOTATION_BODYDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Annotation) arguments.get(1), (BodyDeclaration) arguments.get(2));
		case RulesPackage.ANNOTATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANNOTATION_TANNOTATABLE_ASTNODETOTANNOTATABLE_BODYDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Annotation) arguments.get(1), (TAnnotatable) arguments.get(2),
					(ASTNodeToTAnnotatable) arguments.get(3), (BodyDeclaration) arguments.get(4));
		case RulesPackage.ANNOTATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ANNOTATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION___IS_APPROPRIATE_BWD__MATCH_TANNOTATABLE_TANNOTATION:
			return isAppropriate_BWD((Match) arguments.get(0), (TAnnotatable) arguments.get(1),
					(TAnnotation) arguments.get(2));
		case RulesPackage.ANNOTATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TANNOTATABLE_TANNOTATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAnnotatable) arguments.get(1),
					(TAnnotation) arguments.get(2));
			return null;
		case RulesPackage.ANNOTATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TANNOTATABLE_TANNOTATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAnnotatable) arguments.get(1),
					(TAnnotation) arguments.get(2));
		case RulesPackage.ANNOTATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TANNOTATABLE_ASTNODETOTANNOTATABLE_TANNOTATION_BODYDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAnnotatable) arguments.get(1),
					(ASTNodeToTAnnotatable) arguments.get(2), (TAnnotation) arguments.get(3),
					(BodyDeclaration) arguments.get(4));
		case RulesPackage.ANNOTATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ANNOTATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_13__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_13((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_15__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_15((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION___IS_APPLICABLE_SOLVE_CSP_CC__ANNOTATION_TANNOTATABLE_TANNOTATION_BODYDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.modisco.java.Annotation) arguments.get(0),
					(TAnnotatable) arguments.get(1), (TAnnotation) arguments.get(2), (BodyDeclaration) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.ANNOTATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION___CHECK_DEC_FWD__ANNOTATION_BODYDECLARATION:
			return checkDEC_FWD((org.eclipse.modisco.java.Annotation) arguments.get(0),
					(BodyDeclaration) arguments.get(1));
		case RulesPackage.ANNOTATION___CHECK_DEC_BWD__TANNOTATABLE_TANNOTATION:
			return checkDEC_BWD((TAnnotatable) arguments.get(0), (TAnnotation) arguments.get(1));
		case RulesPackage.ANNOTATION___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODETOTANNOTATABLE:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNodeToTAnnotatable) arguments.get(1));
		case RulesPackage.ANNOTATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TANNOTATABLE_ASTNODETOTANNOTATABLE_BODYDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAnnotatable) arguments.get(1),
					(ASTNodeToTAnnotatable) arguments.get(2), (BodyDeclaration) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.ANNOTATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_Annotation_0_1_initialbindings_blackBBBB(Annotation _this, Match match,
			org.eclipse.modisco.java.Annotation annotation, BodyDeclaration astNode) {
		return new Object[] { _this, match, annotation, astNode };
	}

	public static final Object[] pattern_Annotation_0_2_SolveCSP_bindingFBBBB(Annotation _this, Match match,
			org.eclipse.modisco.java.Annotation annotation, BodyDeclaration astNode) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, annotation, astNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, annotation, astNode };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotation_0_2_SolveCSP_bindingAndBlackFBBBB(Annotation _this, Match match,
			org.eclipse.modisco.java.Annotation annotation, BodyDeclaration astNode) {
		Object[] result_pattern_Annotation_0_2_SolveCSP_binding = pattern_Annotation_0_2_SolveCSP_bindingFBBBB(_this,
				match, annotation, astNode);
		if (result_pattern_Annotation_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Annotation_0_2_SolveCSP_binding[0];

			Object[] result_pattern_Annotation_0_2_SolveCSP_black = pattern_Annotation_0_2_SolveCSP_blackB(csp);
			if (result_pattern_Annotation_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, annotation, astNode };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotation_0_3_CheckCSP_expressionFBB(Annotation _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotation_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.modisco.java.Annotation annotation, BodyDeclaration astNode) {
		return new Object[] { match, annotation, astNode };
	}

	public static final Object[] pattern_Annotation_0_4_collectelementstobetranslated_greenBBBF(Match match,
			org.eclipse.modisco.java.Annotation annotation, BodyDeclaration astNode) {
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(annotation);
		String astNode__Annotation____annotations_name_prime = "annotations";
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		match.getToBeTranslatedEdges().add(astNode__Annotation____annotations);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		return new Object[] { match, annotation, astNode, astNode__Annotation____annotations };
	}

	public static final Object[] pattern_Annotation_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.Annotation annotation, BodyDeclaration astNode) {
		return new Object[] { match, annotation, astNode };
	}

	public static final Object[] pattern_Annotation_0_5_collectcontextelements_greenBB(Match match,
			BodyDeclaration astNode) {
		match.getContextNodes().add(astNode);
		return new Object[] { match, astNode };
	}

	public static final void pattern_Annotation_0_6_registerobjectstomatch_expressionBBBB(Annotation _this, Match match,
			org.eclipse.modisco.java.Annotation annotation, BodyDeclaration astNode) {
		_this.registerObjectsToMatch_FWD(match, annotation, astNode);

	}

	public static final boolean pattern_Annotation_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Annotation_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Annotation_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("Annotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAnnotable");
		EObject _localVariable_2 = isApplicableMatch.getObject("aSTNodeToTAnnotable");
		EObject _localVariable_3 = isApplicableMatch.getObject("astNode");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpTAnnotable = _localVariable_1;
		EObject tmpASTNodeToTAnnotable = _localVariable_2;
		EObject tmpAstNode = _localVariable_3;
		if (tmpAnnotation instanceof org.eclipse.modisco.java.Annotation) {
			org.eclipse.modisco.java.Annotation annotation = (org.eclipse.modisco.java.Annotation) tmpAnnotation;
			if (tmpTAnnotable instanceof TAnnotatable) {
				TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
				if (tmpASTNodeToTAnnotable instanceof ASTNodeToTAnnotatable) {
					ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) tmpASTNodeToTAnnotable;
					if (tmpAstNode instanceof BodyDeclaration) {
						BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
						return new Object[] { annotation, tAnnotable, aSTNodeToTAnnotable, astNode, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_1_1_performtransformation_blackBBBBFBB(
			org.eclipse.modisco.java.Annotation annotation, TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, BodyDeclaration astNode, Annotation _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { annotation, tAnnotable, aSTNodeToTAnnotable, astNode, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_1_1_performtransformation_bindingAndBlackFFFFFBB(Annotation _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Annotation_1_1_performtransformation_binding = pattern_Annotation_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_Annotation_1_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.Annotation annotation = (org.eclipse.modisco.java.Annotation) result_pattern_Annotation_1_1_performtransformation_binding[0];
			TAnnotatable tAnnotable = (TAnnotatable) result_pattern_Annotation_1_1_performtransformation_binding[1];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result_pattern_Annotation_1_1_performtransformation_binding[2];
			BodyDeclaration astNode = (BodyDeclaration) result_pattern_Annotation_1_1_performtransformation_binding[3];

			Object[] result_pattern_Annotation_1_1_performtransformation_black = pattern_Annotation_1_1_performtransformation_blackBBBBFBB(
					annotation, tAnnotable, aSTNodeToTAnnotable, astNode, _this, isApplicableMatch);
			if (result_pattern_Annotation_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Annotation_1_1_performtransformation_black[4];

				return new Object[] { annotation, tAnnotable, aSTNodeToTAnnotable, astNode, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_1_1_performtransformation_greenBBFF(
			org.eclipse.modisco.java.Annotation annotation, TAnnotatable tAnnotable) {
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		TAnnotation tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
		annotationToTAnnotation.setSource(annotation);
		annotationToTAnnotation.setTarget(tAnnotation);
		tAnnotation.setTAnnotated(tAnnotable);
		return new Object[] { annotation, tAnnotable, annotationToTAnnotation, tAnnotation };
	}

	public static final Object[] pattern_Annotation_1_2_collecttranslatedelements_blackBBB(
			org.eclipse.modisco.java.Annotation annotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotation tAnnotation) {
		return new Object[] { annotation, annotationToTAnnotation, tAnnotation };
	}

	public static final Object[] pattern_Annotation_1_2_collecttranslatedelements_greenFBBB(
			org.eclipse.modisco.java.Annotation annotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotation tAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(annotation);
		ruleresult.getCreatedLinkElements().add(annotationToTAnnotation);
		ruleresult.getCreatedElements().add(tAnnotation);
		return new Object[] { ruleresult, annotation, annotationToTAnnotation, tAnnotation };
	}

	public static final Object[] pattern_Annotation_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject annotation, EObject tAnnotable, EObject annotationToTAnnotation, EObject aSTNodeToTAnnotable,
			EObject tAnnotation, EObject astNode) {
		if (!annotation.equals(tAnnotable)) {
			if (!annotation.equals(annotationToTAnnotation)) {
				if (!annotation.equals(aSTNodeToTAnnotable)) {
					if (!annotation.equals(tAnnotation)) {
						if (!annotation.equals(astNode)) {
							if (!tAnnotable.equals(tAnnotation)) {
								if (!annotationToTAnnotation.equals(tAnnotable)) {
									if (!annotationToTAnnotation.equals(aSTNodeToTAnnotable)) {
										if (!annotationToTAnnotation.equals(tAnnotation)) {
											if (!annotationToTAnnotation.equals(astNode)) {
												if (!aSTNodeToTAnnotable.equals(tAnnotable)) {
													if (!aSTNodeToTAnnotable.equals(tAnnotation)) {
														if (!aSTNodeToTAnnotable.equals(astNode)) {
															if (!astNode.equals(tAnnotable)) {
																if (!astNode.equals(tAnnotation)) {
																	return new Object[] { ruleresult, annotation,
																			tAnnotable, annotationToTAnnotation,
																			aSTNodeToTAnnotable, tAnnotation, astNode };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Annotation_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject annotation, EObject tAnnotable, EObject annotationToTAnnotation,
			EObject tAnnotation, EObject astNode) {
		EMoflonEdge annotationToTAnnotation__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Annotation";
		String annotationToTAnnotation__Annotation____source_name_prime = "source";
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String astNode__Annotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		annotationToTAnnotation__Annotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__Annotation____source.setTrg(annotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__Annotation____source);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__tAnnotation____target);
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		ruleresult.getTranslatedEdges().add(astNode__Annotation____annotations);
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		ruleresult.getCreatedEdges().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tAnnotable__tAnnotation____tAnnotation);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		annotationToTAnnotation__Annotation____source.setName(annotationToTAnnotation__Annotation____source_name_prime);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		return new Object[] { ruleresult, annotation, tAnnotable, annotationToTAnnotation, tAnnotation, astNode,
				annotationToTAnnotation__Annotation____source, annotationToTAnnotation__tAnnotation____target,
				astNode__Annotation____annotations, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation };
	}

	public static final void pattern_Annotation_1_5_registerobjects_expressionBBBBBBBB(Annotation _this,
			PerformRuleResult ruleresult, EObject annotation, EObject tAnnotable, EObject annotationToTAnnotation,
			EObject aSTNodeToTAnnotable, EObject tAnnotation, EObject astNode) {
		_this.registerObjects_FWD(ruleresult, annotation, tAnnotable, annotationToTAnnotation, aSTNodeToTAnnotable,
				tAnnotation, astNode);

	}

	public static final PerformRuleResult pattern_Annotation_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Annotation_2_1_preparereturnvalue_bindingFB(Annotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_2_1_preparereturnvalue_blackFBB(EClass eClass, Annotation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Annotation_2_1_preparereturnvalue_bindingAndBlackFFB(Annotation _this) {
		Object[] result_pattern_Annotation_2_1_preparereturnvalue_binding = pattern_Annotation_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Annotation_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Annotation_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Annotation_2_1_preparereturnvalue_black = pattern_Annotation_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Annotation_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Annotation_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Annotation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Annotation_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("Annotation");
		EObject _localVariable_1 = match.getObject("astNode");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpAstNode = _localVariable_1;
		if (tmpAnnotation instanceof org.eclipse.modisco.java.Annotation) {
			org.eclipse.modisco.java.Annotation annotation = (org.eclipse.modisco.java.Annotation) tmpAnnotation;
			if (tmpAstNode instanceof BodyDeclaration) {
				BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
				return new Object[] { annotation, astNode, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Annotation_2_2_corematch_blackBFFBB(
			org.eclipse.modisco.java.Annotation annotation, BodyDeclaration astNode, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNodeToTAnnotatable aSTNodeToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(astNode, ASTNodeToTAnnotatable.class, "source")) {
			TAnnotatable tAnnotable = aSTNodeToTAnnotable.getTarget();
			if (tAnnotable != null) {
				_result.add(new Object[] { annotation, tAnnotable, aSTNodeToTAnnotable, astNode, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Annotation_2_3_findcontext_blackBBBB(
			org.eclipse.modisco.java.Annotation annotation, TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, BodyDeclaration astNode) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (astNode.equals(aSTNodeToTAnnotable.getSource())) {
			if (astNode.getAnnotations().contains(annotation)) {
				if (tAnnotable.equals(aSTNodeToTAnnotable.getTarget())) {
					_result.add(new Object[] { annotation, tAnnotable, aSTNodeToTAnnotable, astNode });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Annotation_2_3_findcontext_greenBBBBFFFF(
			org.eclipse.modisco.java.Annotation annotation, TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, BodyDeclaration astNode) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge aSTNodeToTAnnotable__astNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge aSTNodeToTAnnotable__tAnnotable____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String aSTNodeToTAnnotable__astNode____source_name_prime = "source";
		String astNode__Annotation____annotations_name_prime = "annotations";
		String aSTNodeToTAnnotable__tAnnotable____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(annotation);
		isApplicableMatch.getAllContextElements().add(tAnnotable);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable);
		isApplicableMatch.getAllContextElements().add(astNode);
		aSTNodeToTAnnotable__astNode____source.setSrc(aSTNodeToTAnnotable);
		aSTNodeToTAnnotable__astNode____source.setTrg(astNode);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable__astNode____source);
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(astNode__Annotation____annotations);
		aSTNodeToTAnnotable__tAnnotable____target.setSrc(aSTNodeToTAnnotable);
		aSTNodeToTAnnotable__tAnnotable____target.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable__tAnnotable____target);
		aSTNodeToTAnnotable__astNode____source.setName(aSTNodeToTAnnotable__astNode____source_name_prime);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		aSTNodeToTAnnotable__tAnnotable____target.setName(aSTNodeToTAnnotable__tAnnotable____target_name_prime);
		return new Object[] { annotation, tAnnotable, aSTNodeToTAnnotable, astNode, isApplicableMatch,
				aSTNodeToTAnnotable__astNode____source, astNode__Annotation____annotations,
				aSTNodeToTAnnotable__tAnnotable____target };
	}

	public static final Object[] pattern_Annotation_2_4_solveCSP_bindingFBBBBBB(Annotation _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Annotation annotation,
			TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable, BodyDeclaration astNode) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, annotation, tAnnotable,
				aSTNodeToTAnnotable, astNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, annotation, tAnnotable, aSTNodeToTAnnotable, astNode };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotation_2_4_solveCSP_bindingAndBlackFBBBBBB(Annotation _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Annotation annotation,
			TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable, BodyDeclaration astNode) {
		Object[] result_pattern_Annotation_2_4_solveCSP_binding = pattern_Annotation_2_4_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, annotation, tAnnotable, aSTNodeToTAnnotable, astNode);
		if (result_pattern_Annotation_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Annotation_2_4_solveCSP_binding[0];

			Object[] result_pattern_Annotation_2_4_solveCSP_black = pattern_Annotation_2_4_solveCSP_blackB(csp);
			if (result_pattern_Annotation_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, annotation, tAnnotable, aSTNodeToTAnnotable,
						astNode };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotation_2_5_checkCSP_expressionFBB(Annotation _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotation_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Annotation_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Annotation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Annotation_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Annotation_10_1_initialbindings_blackBBBB(Annotation _this, Match match,
			TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		return new Object[] { _this, match, tAnnotable, tAnnotation };
	}

	public static final Object[] pattern_Annotation_10_2_SolveCSP_bindingFBBBB(Annotation _this, Match match,
			TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnnotable, tAnnotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnnotable, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotation_10_2_SolveCSP_bindingAndBlackFBBBB(Annotation _this, Match match,
			TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		Object[] result_pattern_Annotation_10_2_SolveCSP_binding = pattern_Annotation_10_2_SolveCSP_bindingFBBBB(_this,
				match, tAnnotable, tAnnotation);
		if (result_pattern_Annotation_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Annotation_10_2_SolveCSP_binding[0];

			Object[] result_pattern_Annotation_10_2_SolveCSP_black = pattern_Annotation_10_2_SolveCSP_blackB(csp);
			if (result_pattern_Annotation_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnnotable, tAnnotation };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotation_10_3_CheckCSP_expressionFBB(Annotation _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotation_10_4_collectelementstobetranslated_blackBBB(Match match,
			TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		return new Object[] { match, tAnnotable, tAnnotation };
	}

	public static final Object[] pattern_Annotation_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAnnotation);
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		match.getToBeTranslatedEdges().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		match.getToBeTranslatedEdges().add(tAnnotable__tAnnotation____tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		return new Object[] { match, tAnnotable, tAnnotation, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation };
	}

	public static final Object[] pattern_Annotation_10_5_collectcontextelements_blackBBB(Match match,
			TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		return new Object[] { match, tAnnotable, tAnnotation };
	}

	public static final Object[] pattern_Annotation_10_5_collectcontextelements_greenBB(Match match,
			TAnnotatable tAnnotable) {
		match.getContextNodes().add(tAnnotable);
		return new Object[] { match, tAnnotable };
	}

	public static final void pattern_Annotation_10_6_registerobjectstomatch_expressionBBBB(Annotation _this,
			Match match, TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		_this.registerObjectsToMatch_BWD(match, tAnnotable, tAnnotation);

	}

	public static final boolean pattern_Annotation_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Annotation_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Annotation_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAnnotable");
		EObject _localVariable_1 = isApplicableMatch.getObject("aSTNodeToTAnnotable");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_3 = isApplicableMatch.getObject("astNode");
		EObject tmpTAnnotable = _localVariable_0;
		EObject tmpASTNodeToTAnnotable = _localVariable_1;
		EObject tmpTAnnotation = _localVariable_2;
		EObject tmpAstNode = _localVariable_3;
		if (tmpTAnnotable instanceof TAnnotatable) {
			TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
			if (tmpASTNodeToTAnnotable instanceof ASTNodeToTAnnotatable) {
				ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) tmpASTNodeToTAnnotable;
				if (tmpTAnnotation instanceof TAnnotation) {
					TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
					if (tmpAstNode instanceof BodyDeclaration) {
						BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
						return new Object[] { tAnnotable, aSTNodeToTAnnotable, tAnnotation, astNode,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_11_1_performtransformation_blackBBBBFBB(TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, TAnnotation tAnnotation, BodyDeclaration astNode,
			Annotation _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tAnnotable, aSTNodeToTAnnotable, tAnnotation, astNode, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_11_1_performtransformation_bindingAndBlackFFFFFBB(Annotation _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_Annotation_11_1_performtransformation_binding = pattern_Annotation_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_Annotation_11_1_performtransformation_binding != null) {
			TAnnotatable tAnnotable = (TAnnotatable) result_pattern_Annotation_11_1_performtransformation_binding[0];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result_pattern_Annotation_11_1_performtransformation_binding[1];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_Annotation_11_1_performtransformation_binding[2];
			BodyDeclaration astNode = (BodyDeclaration) result_pattern_Annotation_11_1_performtransformation_binding[3];

			Object[] result_pattern_Annotation_11_1_performtransformation_black = pattern_Annotation_11_1_performtransformation_blackBBBBFBB(
					tAnnotable, aSTNodeToTAnnotable, tAnnotation, astNode, _this, isApplicableMatch);
			if (result_pattern_Annotation_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_Annotation_11_1_performtransformation_black[4];

				return new Object[] { tAnnotable, aSTNodeToTAnnotable, tAnnotation, astNode, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_11_1_performtransformation_greenFFBB(TAnnotation tAnnotation,
			BodyDeclaration astNode) {
		org.eclipse.modisco.java.Annotation annotation = JavaFactory.eINSTANCE.createAnnotation();
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		astNode.getAnnotations().add(annotation);
		annotationToTAnnotation.setSource(annotation);
		annotationToTAnnotation.setTarget(tAnnotation);
		return new Object[] { annotation, annotationToTAnnotation, tAnnotation, astNode };
	}

	public static final Object[] pattern_Annotation_11_2_collecttranslatedelements_blackBBB(
			org.eclipse.modisco.java.Annotation annotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotation tAnnotation) {
		return new Object[] { annotation, annotationToTAnnotation, tAnnotation };
	}

	public static final Object[] pattern_Annotation_11_2_collecttranslatedelements_greenFBBB(
			org.eclipse.modisco.java.Annotation annotation, AnnotationToTAnnotation annotationToTAnnotation,
			TAnnotation tAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(annotation);
		ruleresult.getCreatedLinkElements().add(annotationToTAnnotation);
		ruleresult.getTranslatedElements().add(tAnnotation);
		return new Object[] { ruleresult, annotation, annotationToTAnnotation, tAnnotation };
	}

	public static final Object[] pattern_Annotation_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject annotation, EObject tAnnotable, EObject annotationToTAnnotation, EObject aSTNodeToTAnnotable,
			EObject tAnnotation, EObject astNode) {
		if (!annotation.equals(tAnnotable)) {
			if (!annotation.equals(annotationToTAnnotation)) {
				if (!annotation.equals(aSTNodeToTAnnotable)) {
					if (!annotation.equals(tAnnotation)) {
						if (!annotation.equals(astNode)) {
							if (!tAnnotable.equals(tAnnotation)) {
								if (!annotationToTAnnotation.equals(tAnnotable)) {
									if (!annotationToTAnnotation.equals(aSTNodeToTAnnotable)) {
										if (!annotationToTAnnotation.equals(tAnnotation)) {
											if (!annotationToTAnnotation.equals(astNode)) {
												if (!aSTNodeToTAnnotable.equals(tAnnotable)) {
													if (!aSTNodeToTAnnotable.equals(tAnnotation)) {
														if (!aSTNodeToTAnnotable.equals(astNode)) {
															if (!astNode.equals(tAnnotable)) {
																if (!astNode.equals(tAnnotation)) {
																	return new Object[] { ruleresult, annotation,
																			tAnnotable, annotationToTAnnotation,
																			aSTNodeToTAnnotable, tAnnotation, astNode };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_Annotation_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject annotation, EObject tAnnotable, EObject annotationToTAnnotation,
			EObject tAnnotation, EObject astNode) {
		EMoflonEdge annotationToTAnnotation__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "Annotation";
		String annotationToTAnnotation__Annotation____source_name_prime = "source";
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String astNode__Annotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		annotationToTAnnotation__Annotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__Annotation____source.setTrg(annotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__Annotation____source);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__tAnnotation____target);
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		ruleresult.getCreatedEdges().add(astNode__Annotation____annotations);
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		ruleresult.getTranslatedEdges().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tAnnotable__tAnnotation____tAnnotation);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		annotationToTAnnotation__Annotation____source.setName(annotationToTAnnotation__Annotation____source_name_prime);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		return new Object[] { ruleresult, annotation, tAnnotable, annotationToTAnnotation, tAnnotation, astNode,
				annotationToTAnnotation__Annotation____source, annotationToTAnnotation__tAnnotation____target,
				astNode__Annotation____annotations, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation };
	}

	public static final void pattern_Annotation_11_5_registerobjects_expressionBBBBBBBB(Annotation _this,
			PerformRuleResult ruleresult, EObject annotation, EObject tAnnotable, EObject annotationToTAnnotation,
			EObject aSTNodeToTAnnotable, EObject tAnnotation, EObject astNode) {
		_this.registerObjects_BWD(ruleresult, annotation, tAnnotable, annotationToTAnnotation, aSTNodeToTAnnotable,
				tAnnotation, astNode);

	}

	public static final PerformRuleResult pattern_Annotation_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Annotation_12_1_preparereturnvalue_bindingFB(Annotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_12_1_preparereturnvalue_blackFBB(EClass eClass, Annotation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_Annotation_12_1_preparereturnvalue_bindingAndBlackFFB(Annotation _this) {
		Object[] result_pattern_Annotation_12_1_preparereturnvalue_binding = pattern_Annotation_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Annotation_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_Annotation_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Annotation_12_1_preparereturnvalue_black = pattern_Annotation_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_Annotation_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_Annotation_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "Annotation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_Annotation_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAnnotable");
		EObject _localVariable_1 = match.getObject("tAnnotation");
		EObject tmpTAnnotable = _localVariable_0;
		EObject tmpTAnnotation = _localVariable_1;
		if (tmpTAnnotable instanceof TAnnotatable) {
			TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
			if (tmpTAnnotation instanceof TAnnotation) {
				TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
				return new Object[] { tAnnotable, tAnnotation, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Annotation_12_2_corematch_blackBFBFB(TAnnotatable tAnnotable,
			TAnnotation tAnnotation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNodeToTAnnotatable aSTNodeToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnnotable, ASTNodeToTAnnotatable.class, "target")) {
			ASTNode tmpAstNode = aSTNodeToTAnnotable.getSource();
			if (tmpAstNode instanceof BodyDeclaration) {
				BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
				_result.add(new Object[] { tAnnotable, aSTNodeToTAnnotable, tAnnotation, astNode, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_Annotation_12_3_findcontext_blackBBBB(TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, TAnnotation tAnnotation, BodyDeclaration astNode) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (astNode.equals(aSTNodeToTAnnotable.getSource())) {
			if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
				if (tAnnotable.equals(aSTNodeToTAnnotable.getTarget())) {
					_result.add(new Object[] { tAnnotable, aSTNodeToTAnnotable, tAnnotation, astNode });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Annotation_12_3_findcontext_greenBBBBFFFFF(TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, TAnnotation tAnnotation, BodyDeclaration astNode) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge aSTNodeToTAnnotable__astNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge aSTNodeToTAnnotable__tAnnotable____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String aSTNodeToTAnnotable__astNode____source_name_prime = "source";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String aSTNodeToTAnnotable__tAnnotable____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tAnnotable);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(astNode);
		aSTNodeToTAnnotable__astNode____source.setSrc(aSTNodeToTAnnotable);
		aSTNodeToTAnnotable__astNode____source.setTrg(astNode);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable__astNode____source);
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tAnnotable__tAnnotation____tAnnotation);
		aSTNodeToTAnnotable__tAnnotable____target.setSrc(aSTNodeToTAnnotable);
		aSTNodeToTAnnotable__tAnnotable____target.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable__tAnnotable____target);
		aSTNodeToTAnnotable__astNode____source.setName(aSTNodeToTAnnotable__astNode____source_name_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		aSTNodeToTAnnotable__tAnnotable____target.setName(aSTNodeToTAnnotable__tAnnotable____target_name_prime);
		return new Object[] { tAnnotable, aSTNodeToTAnnotable, tAnnotation, astNode, isApplicableMatch,
				aSTNodeToTAnnotable__astNode____source, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation, aSTNodeToTAnnotable__tAnnotable____target };
	}

	public static final Object[] pattern_Annotation_12_4_solveCSP_bindingFBBBBBB(Annotation _this,
			IsApplicableMatch isApplicableMatch, TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable,
			TAnnotation tAnnotation, BodyDeclaration astNode) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tAnnotable, aSTNodeToTAnnotable,
				tAnnotation, astNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAnnotable, aSTNodeToTAnnotable, tAnnotation,
					astNode };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotation_12_4_solveCSP_bindingAndBlackFBBBBBB(Annotation _this,
			IsApplicableMatch isApplicableMatch, TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable,
			TAnnotation tAnnotation, BodyDeclaration astNode) {
		Object[] result_pattern_Annotation_12_4_solveCSP_binding = pattern_Annotation_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, tAnnotable, aSTNodeToTAnnotable, tAnnotation, astNode);
		if (result_pattern_Annotation_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Annotation_12_4_solveCSP_binding[0];

			Object[] result_pattern_Annotation_12_4_solveCSP_black = pattern_Annotation_12_4_solveCSP_blackB(csp);
			if (result_pattern_Annotation_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAnnotable, aSTNodeToTAnnotable, tAnnotation,
						astNode };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotation_12_5_checkCSP_expressionFBB(Annotation _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotation_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_Annotation_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "Annotation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_Annotation_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_Annotation_20_1_preparereturnvalue_bindingFB(Annotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			Annotation _this) {
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

	public static final Object[] pattern_Annotation_20_1_preparereturnvalue_bindingAndBlackFFBF(Annotation _this) {
		Object[] result_pattern_Annotation_20_1_preparereturnvalue_binding = pattern_Annotation_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Annotation_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Annotation_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Annotation_20_1_preparereturnvalue_black = pattern_Annotation_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Annotation_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Annotation_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Annotation_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Annotation_20_2_testcorematchandDECs_black_nac_0BB(TAnnotation tAnnotation,
			TAnnotatable tAnnotable) {
		TAnnotatable __DEC_tAnnotation_tAnnotation_691744 = tAnnotation.getTAnnotated();
		if (__DEC_tAnnotation_tAnnotation_691744 != null) {
			if (!tAnnotable.equals(__DEC_tAnnotation_tAnnotation_691744)) {
				return new Object[] { tAnnotation, tAnnotable };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_Annotation_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_tAnnotated) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnnotation = _edge_tAnnotated.getSrc();
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			EObject tmpTAnnotable = _edge_tAnnotated.getTrg();
			if (tmpTAnnotable instanceof TAnnotatable) {
				TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
				if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
					if (pattern_Annotation_20_2_testcorematchandDECs_black_nac_0BB(tAnnotation, tAnnotable) == null) {
						_result.add(new Object[] { tAnnotable, tAnnotation, _edge_tAnnotated });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Annotation_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Annotation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			Annotation _this, Match match, TAnnotatable tAnnotable, TAnnotation tAnnotation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnnotable, tAnnotation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Annotation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Annotation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotation_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Annotation_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Annotation_21_1_preparereturnvalue_bindingFB(Annotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			Annotation _this) {
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

	public static final Object[] pattern_Annotation_21_1_preparereturnvalue_bindingAndBlackFFBF(Annotation _this) {
		Object[] result_pattern_Annotation_21_1_preparereturnvalue_binding = pattern_Annotation_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_Annotation_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_Annotation_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_Annotation_21_1_preparereturnvalue_black = pattern_Annotation_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_Annotation_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_Annotation_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_Annotation_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_Annotation_21_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.modisco.java.Annotation annotation) {
		for (AnnotationMemberValuePair __DEC_Annotation_value_359824 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { annotation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Annotation_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_annotations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAstNode = _edge_annotations.getSrc();
		if (tmpAstNode instanceof BodyDeclaration) {
			BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
			EObject tmpAnnotation = _edge_annotations.getTrg();
			if (tmpAnnotation instanceof org.eclipse.modisco.java.Annotation) {
				org.eclipse.modisco.java.Annotation annotation = (org.eclipse.modisco.java.Annotation) tmpAnnotation;
				if (astNode.getAnnotations().contains(annotation)) {
					if (pattern_Annotation_21_2_testcorematchandDECs_black_nac_0B(annotation) == null) {
						_result.add(new Object[] { annotation, astNode, _edge_annotations });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_Annotation_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_Annotation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			Annotation _this, Match match, org.eclipse.modisco.java.Annotation annotation, BodyDeclaration astNode) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, annotation, astNode);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_Annotation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			Annotation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotation_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_Annotation_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_Annotation_24_1_prepare_blackB(Annotation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Annotation_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_Annotation_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("Annotation");
		EObject _localVariable_1 = targetMatch.getObject("tAnnotable");
		EObject _localVariable_2 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_3 = sourceMatch.getObject("astNode");
		EObject tmpAnnotation = _localVariable_0;
		EObject tmpTAnnotable = _localVariable_1;
		EObject tmpTAnnotation = _localVariable_2;
		EObject tmpAstNode = _localVariable_3;
		if (tmpAnnotation instanceof org.eclipse.modisco.java.Annotation) {
			org.eclipse.modisco.java.Annotation annotation = (org.eclipse.modisco.java.Annotation) tmpAnnotation;
			if (tmpTAnnotable instanceof TAnnotatable) {
				TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
				if (tmpTAnnotation instanceof TAnnotation) {
					TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
					if (tmpAstNode instanceof BodyDeclaration) {
						BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
						return new Object[] { annotation, tAnnotable, tAnnotation, astNode, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.modisco.java.Annotation annotation, TAnnotatable tAnnotable, TAnnotation tAnnotation,
			BodyDeclaration astNode, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { annotation, tAnnotable, tAnnotation, astNode, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_Annotation_24_2_matchsrctrgcontext_binding = pattern_Annotation_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_Annotation_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.modisco.java.Annotation annotation = (org.eclipse.modisco.java.Annotation) result_pattern_Annotation_24_2_matchsrctrgcontext_binding[0];
			TAnnotatable tAnnotable = (TAnnotatable) result_pattern_Annotation_24_2_matchsrctrgcontext_binding[1];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_Annotation_24_2_matchsrctrgcontext_binding[2];
			BodyDeclaration astNode = (BodyDeclaration) result_pattern_Annotation_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_Annotation_24_2_matchsrctrgcontext_black = pattern_Annotation_24_2_matchsrctrgcontext_blackBBBBBB(
					annotation, tAnnotable, tAnnotation, astNode, sourceMatch, targetMatch);
			if (result_pattern_Annotation_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { annotation, tAnnotable, tAnnotation, astNode, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_Annotation_24_3_solvecsp_bindingFBBBBBBB(Annotation _this,
			org.eclipse.modisco.java.Annotation annotation, TAnnotatable tAnnotable, TAnnotation tAnnotation,
			BodyDeclaration astNode, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(annotation, tAnnotable, tAnnotation, astNode, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, annotation, tAnnotable, tAnnotation, astNode, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotation_24_3_solvecsp_bindingAndBlackFBBBBBBB(Annotation _this,
			org.eclipse.modisco.java.Annotation annotation, TAnnotatable tAnnotable, TAnnotation tAnnotation,
			BodyDeclaration astNode, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_Annotation_24_3_solvecsp_binding = pattern_Annotation_24_3_solvecsp_bindingFBBBBBBB(
				_this, annotation, tAnnotable, tAnnotation, astNode, sourceMatch, targetMatch);
		if (result_pattern_Annotation_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_Annotation_24_3_solvecsp_binding[0];

			Object[] result_pattern_Annotation_24_3_solvecsp_black = pattern_Annotation_24_3_solvecsp_blackB(csp);
			if (result_pattern_Annotation_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, annotation, tAnnotable, tAnnotation, astNode, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotation_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_Annotation_24_5_matchcorrcontext_blackBFBBB(TAnnotatable tAnnotable,
			BodyDeclaration astNode, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNodeToTAnnotatable aSTNodeToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(astNode, ASTNodeToTAnnotatable.class, "source")) {
				if (tAnnotable.equals(aSTNodeToTAnnotable.getTarget())) {
					_result.add(new Object[] { tAnnotable, aSTNodeToTAnnotable, astNode, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_Annotation_24_5_matchcorrcontext_greenBBBF(
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "Annotation";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(aSTNodeToTAnnotable);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { aSTNodeToTAnnotable, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_Annotation_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.modisco.java.Annotation annotation, TAnnotatable tAnnotable, TAnnotation tAnnotation,
			BodyDeclaration astNode, CCMatch ccMatch) {
		return new Object[] { annotation, tAnnotable, tAnnotation, astNode, ccMatch };
	}

	public static final Object[] pattern_Annotation_24_6_createcorrespondence_greenBFBB(
			org.eclipse.modisco.java.Annotation annotation, TAnnotation tAnnotation, CCMatch ccMatch) {
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		annotationToTAnnotation.setSource(annotation);
		annotationToTAnnotation.setTarget(tAnnotation);
		ccMatch.getCreateCorr().add(annotationToTAnnotation);
		return new Object[] { annotation, annotationToTAnnotation, tAnnotation, ccMatch };
	}

	public static final Object[] pattern_Annotation_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_Annotation_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "Annotation";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_Annotation_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_Annotation_27_1_matchtggpattern_black_nac_0B(
			org.eclipse.modisco.java.Annotation annotation) {
		for (AnnotationMemberValuePair __DEC_Annotation_value_744508 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { annotation };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Annotation annotation, BodyDeclaration astNode) {
		if (astNode.getAnnotations().contains(annotation)) {
			if (pattern_Annotation_27_1_matchtggpattern_black_nac_0B(annotation) == null) {
				return new Object[] { annotation, astNode };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotation_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Annotation_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Annotation_28_1_matchtggpattern_black_nac_0BB(TAnnotation tAnnotation,
			TAnnotatable tAnnotable) {
		TAnnotatable __DEC_tAnnotation_tAnnotation_350931 = tAnnotation.getTAnnotated();
		if (__DEC_tAnnotation_tAnnotation_350931 != null) {
			if (!tAnnotable.equals(__DEC_tAnnotation_tAnnotation_350931)) {
				return new Object[] { tAnnotation, tAnnotable };
			}
		}

		return null;
	}

	public static final Object[] pattern_Annotation_28_1_matchtggpattern_blackBB(TAnnotatable tAnnotable,
			TAnnotation tAnnotation) {
		if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
			if (pattern_Annotation_28_1_matchtggpattern_black_nac_0BB(tAnnotation, tAnnotable) == null) {
				return new Object[] { tAnnotable, tAnnotation };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotation_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_Annotation_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_Annotation_29_1_createresult_blackB(Annotation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_Annotation_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_Annotation_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TAnnotatable tAnnotable) {
		if (ruleResult.getTargetObjects().contains(tAnnotable)) {
			return new Object[] { ruleResult, tAnnotable };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNodeToTAnnotatable aSTNodeToTAnnotable) {
		if (ruleResult.getCorrObjects().contains(aSTNodeToTAnnotable)) {
			return new Object[] { ruleResult, aSTNodeToTAnnotable };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, BodyDeclaration astNode) {
		if (ruleResult.getSourceObjects().contains(astNode)) {
			return new Object[] { ruleResult, astNode };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_Annotation_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList aSTNodeToTAnnotableList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpASTNodeToTAnnotable : aSTNodeToTAnnotableList.getEntryObjects()) {
				if (tmpASTNodeToTAnnotable instanceof ASTNodeToTAnnotatable) {
					ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) tmpASTNodeToTAnnotable;
					TAnnotatable tAnnotable = aSTNodeToTAnnotable.getTarget();
					if (tAnnotable != null) {
						ASTNode tmpAstNode = aSTNodeToTAnnotable.getSource();
						if (tmpAstNode instanceof BodyDeclaration) {
							BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
							if (pattern_Annotation_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									aSTNodeToTAnnotable) == null) {
								if (pattern_Annotation_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										tAnnotable) == null) {
									if (pattern_Annotation_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											astNode) == null) {
										_result.add(new Object[] { aSTNodeToTAnnotableList, tAnnotable,
												aSTNodeToTAnnotable, astNode, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_Annotation_29_3_solveCSP_bindingFBBBBBB(Annotation _this,
			IsApplicableMatch isApplicableMatch, TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable,
			BodyDeclaration astNode, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tAnnotable, aSTNodeToTAnnotable,
				astNode, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAnnotable, aSTNodeToTAnnotable, astNode, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_Annotation_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_Annotation_29_3_solveCSP_bindingAndBlackFBBBBBB(Annotation _this,
			IsApplicableMatch isApplicableMatch, TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable,
			BodyDeclaration astNode, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_Annotation_29_3_solveCSP_binding = pattern_Annotation_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, tAnnotable, aSTNodeToTAnnotable, astNode, ruleResult);
		if (result_pattern_Annotation_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_Annotation_29_3_solveCSP_binding[0];

			Object[] result_pattern_Annotation_29_3_solveCSP_black = pattern_Annotation_29_3_solveCSP_blackB(csp);
			if (result_pattern_Annotation_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAnnotable, aSTNodeToTAnnotable, astNode,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_Annotation_29_4_checkCSP_expressionFBB(Annotation _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_Annotation_29_5_checknacs_blackBBB(TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, BodyDeclaration astNode) {
		return new Object[] { tAnnotable, aSTNodeToTAnnotable, astNode };
	}

	public static final Object[] pattern_Annotation_29_6_perform_blackBBBB(TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, BodyDeclaration astNode, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tAnnotable, aSTNodeToTAnnotable, astNode, ruleResult };
	}

	public static final Object[] pattern_Annotation_29_6_perform_greenFBFFBB(TAnnotatable tAnnotable,
			BodyDeclaration astNode, ModelgeneratorRuleResult ruleResult) {
		org.eclipse.modisco.java.Annotation annotation = JavaFactory.eINSTANCE.createAnnotation();
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		TAnnotation tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		astNode.getAnnotations().add(annotation);
		ruleResult.getSourceObjects().add(annotation);
		annotationToTAnnotation.setSource(annotation);
		ruleResult.getCorrObjects().add(annotationToTAnnotation);
		annotationToTAnnotation.setTarget(tAnnotation);
		tAnnotation.setTAnnotated(tAnnotable);
		ruleResult.getTargetObjects().add(tAnnotation);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { annotation, tAnnotable, annotationToTAnnotation, tAnnotation, astNode, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_Annotation_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationImpl
