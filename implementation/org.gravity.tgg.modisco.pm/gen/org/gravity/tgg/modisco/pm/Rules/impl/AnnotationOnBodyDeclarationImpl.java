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
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.BodyDeclaration;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.AnnotationToTAnnotation;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnnotationOnBodyDeclaration;
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
 * An implementation of the model object '<em><b>Annotation On Body Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnnotationOnBodyDeclarationImpl extends AbstractRuleImpl implements AnnotationOnBodyDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationOnBodyDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnnotationOnBodyDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, BodyDeclaration astNode, Annotation Annotation) {

		Object[] result1_black = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_0_1_initialbindings_blackBBBB(this, match, astNode, Annotation);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[astNode] = " + astNode + ", " + "[Annotation] = " + Annotation + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, astNode,
						Annotation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[astNode] = " + astNode + ", " + "[Annotation] = " + Annotation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_0_4_collectelementstobetranslated_blackBBB(match, astNode,
							Annotation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[astNode] = " + astNode + ", " + "[Annotation] = " + Annotation + ".");
			}
			AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_0_4_collectelementstobetranslated_greenBBBF(match, astNode,
							Annotation);
			//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_0_5_collectcontextelements_blackBBB(match, astNode,
							Annotation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[astNode] = " + astNode + ", " + "[Annotation] = " + Annotation + ".");
			}
			AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_0_5_collectcontextelements_greenBB(match, astNode);

			// 
			AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_0_6_registerobjectstomatch_expressionBBBB(this, match, astNode,
							Annotation);
			return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_0_7_expressionF();
		} else {
			return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		BodyDeclaration astNode = (BodyDeclaration) result1_bindingAndBlack[0];
		TAnnotatable tAnnotable = (TAnnotatable) result1_bindingAndBlack[1];
		ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result1_bindingAndBlack[2];
		Annotation Annotation = (Annotation) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_greenFFBB(tAnnotable, Annotation);
		TAnnotation tAnnotation = (TAnnotation) result1_green[0];
		AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result1_green[1];

		Object[] result2_black = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_1_2_collecttranslatedelements_blackBBB(tAnnotation,
						AnnotationToTAnnotation, Annotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", " + "[Annotation] = "
					+ Annotation + ".");
		}
		Object[] result2_green = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_1_2_collecttranslatedelements_greenFBBB(tAnnotation,
						AnnotationToTAnnotation, Annotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, tAnnotation,
						astNode, AnnotationToTAnnotation, tAnnotable, aSTNodeToTAnnotable, Annotation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[astNode] = " + astNode + ", "
					+ "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", " + "[tAnnotable] = " + tAnnotable
					+ ", " + "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable + ", " + "[Annotation] = " + Annotation
					+ ".");
		}
		AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, tAnnotation, astNode, AnnotationToTAnnotation, tAnnotable, Annotation);
		//nothing EMoflonEdge AnnotationToTAnnotation__Annotation____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge AnnotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, tAnnotation, astNode, AnnotationToTAnnotation, tAnnotable, aSTNodeToTAnnotable, Annotation);
		return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		BodyDeclaration astNode = (BodyDeclaration) result2_binding[0];
		Annotation Annotation = (Annotation) result2_binding[1];
		for (Object[] result2_black : AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_2_2_corematch_blackBFFBB(astNode, Annotation, match)) {
			TAnnotatable tAnnotable = (TAnnotatable) result2_black[1];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result2_black[2];
			// ForEach 
			for (Object[] result3_black : AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_2_3_findcontext_blackBBBB(astNode, tAnnotable,
							aSTNodeToTAnnotable, Annotation)) {
				Object[] result3_green = AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_2_3_findcontext_greenBBBBFFFF(astNode, tAnnotable,
								aSTNodeToTAnnotable, Annotation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge aSTNodeToTAnnotable__astNode____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge aSTNodeToTAnnotable__tAnnotable____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, astNode, tAnnotable, aSTNodeToTAnnotable, Annotation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[astNode] = " + astNode + ", "
							+ "[tAnnotable] = " + tAnnotable + ", " + "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable
							+ ", " + "[Annotation] = " + Annotation + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = AnnotationOnBodyDeclarationImpl
							.pattern_AnnotationOnBodyDeclaration_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationOnBodyDeclarationImpl
							.pattern_AnnotationOnBodyDeclaration_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, BodyDeclaration astNode, Annotation Annotation) {
		match.registerObject("astNode", astNode);
		match.registerObject("Annotation", Annotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, BodyDeclaration astNode, Annotation Annotation) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, BodyDeclaration astNode,
			TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable, Annotation Annotation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("astNode", astNode);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		isApplicableMatch.registerObject("Annotation", Annotation);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tAnnotation, EObject astNode,
			EObject AnnotationToTAnnotation, EObject tAnnotable, EObject aSTNodeToTAnnotable, EObject Annotation) {
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("astNode", astNode);
		ruleresult.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
		ruleresult.registerObject("tAnnotable", tAnnotable);
		ruleresult.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		ruleresult.registerObject("Annotation", Annotation);

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
	public boolean isAppropriate_BWD(Match match, TAnnotation tAnnotation, TAnnotatable tAnnotable) {

		Object[] result1_black = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_10_1_initialbindings_blackBBBB(this, match, tAnnotation,
						tAnnotable);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tAnnotable] = " + tAnnotable + ".");
		}

		Object[] result2_bindingAndBlack = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tAnnotation,
						tAnnotable);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tAnnotable] = " + tAnnotable + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_10_4_collectelementstobetranslated_blackBBB(match, tAnnotation,
							tAnnotable);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[tAnnotable] = " + tAnnotable + ".");
			}
			AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_10_4_collectelementstobetranslated_greenBBBFF(match,
							tAnnotation, tAnnotable);
			//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result4_green[4];

			Object[] result5_black = AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_10_5_collectcontextelements_blackBBB(match, tAnnotation,
							tAnnotable);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[tAnnotable] = " + tAnnotable + ".");
			}
			AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_10_5_collectcontextelements_greenBB(match, tAnnotable);

			// 
			AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_10_6_registerobjectstomatch_expressionBBBB(this, match,
							tAnnotation, tAnnotable);
			return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_10_7_expressionF();
		} else {
			return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TAnnotation tAnnotation = (TAnnotation) result1_bindingAndBlack[0];
		BodyDeclaration astNode = (BodyDeclaration) result1_bindingAndBlack[1];
		TAnnotatable tAnnotable = (TAnnotatable) result1_bindingAndBlack[2];
		ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_greenBBFF(tAnnotation, astNode);
		AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result1_green[2];
		Annotation Annotation = (Annotation) result1_green[3];

		Object[] result2_black = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_11_2_collecttranslatedelements_blackBBB(tAnnotation,
						AnnotationToTAnnotation, Annotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", " + "[Annotation] = "
					+ Annotation + ".");
		}
		Object[] result2_green = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_11_2_collecttranslatedelements_greenFBBB(tAnnotation,
						AnnotationToTAnnotation, Annotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, tAnnotation,
						astNode, AnnotationToTAnnotation, tAnnotable, aSTNodeToTAnnotable, Annotation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[astNode] = " + astNode + ", "
					+ "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", " + "[tAnnotable] = " + tAnnotable
					+ ", " + "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable + ", " + "[Annotation] = " + Annotation
					+ ".");
		}
		AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, tAnnotation, astNode, AnnotationToTAnnotation, tAnnotable, Annotation);
		//nothing EMoflonEdge AnnotationToTAnnotation__Annotation____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge AnnotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_11_5_registerobjects_expressionBBBBBBBB(
				this, ruleresult, tAnnotation, astNode, AnnotationToTAnnotation, tAnnotable, aSTNodeToTAnnotable,
				Annotation);
		return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TAnnotation tAnnotation = (TAnnotation) result2_binding[0];
		TAnnotatable tAnnotable = (TAnnotatable) result2_binding[1];
		for (Object[] result2_black : AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_12_2_corematch_blackBFBFB(tAnnotation, tAnnotable, match)) {
			BodyDeclaration astNode = (BodyDeclaration) result2_black[1];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result2_black[3];
			// ForEach 
			for (Object[] result3_black : AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_12_3_findcontext_blackBBBB(tAnnotation, astNode, tAnnotable,
							aSTNodeToTAnnotable)) {
				Object[] result3_green = AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_12_3_findcontext_greenBBBBFFFFF(tAnnotation, astNode,
								tAnnotable, aSTNodeToTAnnotable);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge aSTNodeToTAnnotable__astNode____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge aSTNodeToTAnnotable__tAnnotable____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, tAnnotation, astNode, tAnnotable, aSTNodeToTAnnotable);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAnnotation] = " + tAnnotation
							+ ", " + "[astNode] = " + astNode + ", " + "[tAnnotable] = " + tAnnotable + ", "
							+ "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnnotationOnBodyDeclarationImpl
							.pattern_AnnotationOnBodyDeclaration_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnnotationOnBodyDeclarationImpl
							.pattern_AnnotationOnBodyDeclaration_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tAnnotable", tAnnotable);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TAnnotation tAnnotation, TAnnotatable tAnnotable) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			BodyDeclaration astNode, TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("astNode", astNode);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tAnnotation, EObject astNode,
			EObject AnnotationToTAnnotation, EObject tAnnotable, EObject aSTNodeToTAnnotable, EObject Annotation) {
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("astNode", astNode);
		ruleresult.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
		ruleresult.registerObject("tAnnotable", tAnnotable);
		ruleresult.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		ruleresult.registerObject("Annotation", Annotation);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_37(EMoflonEdge _edge_tAnnotated) {

		Object[] result1_bindingAndBlack = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_20_2_testcorematchandDECs_blackFFB(_edge_tAnnotated)) {
			TAnnotation tAnnotation = (TAnnotation) result2_black[0];
			TAnnotatable tAnnotable = (TAnnotatable) result2_black[1];
			Object[] result2_green = AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tAnnotation, tAnnotable)) {
				// 
				if (AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationOnBodyDeclarationImpl
							.pattern_AnnotationOnBodyDeclaration_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationOnBodyDeclarationImpl
							.pattern_AnnotationOnBodyDeclaration_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_39(EMoflonEdge _edge_annotations) {

		Object[] result1_bindingAndBlack = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_21_2_testcorematchandDECs_blackFFB(_edge_annotations)) {
			BodyDeclaration astNode = (BodyDeclaration) result2_black[0];
			Annotation Annotation = (Annotation) result2_black[1];
			Object[] result2_green = AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, astNode, Annotation)) {
				// 
				if (AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnnotationOnBodyDeclarationImpl
							.pattern_AnnotationOnBodyDeclaration_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnnotationOnBodyDeclarationImpl
							.pattern_AnnotationOnBodyDeclaration_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnnotationOnBodyDeclaration");
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
		ruleResult.setRule("AnnotationOnBodyDeclaration");
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

		Object[] result1_black = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TAnnotation tAnnotation = (TAnnotation) result2_bindingAndBlack[0];
		BodyDeclaration astNode = (BodyDeclaration) result2_bindingAndBlack[1];
		TAnnotatable tAnnotable = (TAnnotatable) result2_bindingAndBlack[2];
		Annotation Annotation = (Annotation) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, tAnnotation, astNode,
						tAnnotable, Annotation, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tAnnotation] = " + tAnnotation + ", " + "[astNode] = " + astNode + ", " + "[tAnnotable] = "
					+ tAnnotable + ", " + "[Annotation] = " + Annotation + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_24_5_matchcorrcontext_blackBBFBB(astNode, tAnnotable,
							sourceMatch, targetMatch)) {
				ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result5_black[2];
				Object[] result5_green = AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_24_5_matchcorrcontext_greenBBBF(aSTNodeToTAnnotable,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_24_6_createcorrespondence_blackBBBBB(tAnnotation, astNode,
								tAnnotable, Annotation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = "
							+ tAnnotation + ", " + "[astNode] = " + astNode + ", " + "[tAnnotable] = " + tAnnotable
							+ ", " + "[Annotation] = " + Annotation + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_24_6_createcorrespondence_greenBFBB(
						tAnnotation, Annotation, ccMatch);
				//nothing AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result6_green[1];

				Object[] result7_black = AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TAnnotation tAnnotation, BodyDeclaration astNode, TAnnotatable tAnnotable,
			Annotation Annotation, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(BodyDeclaration astNode, Annotation Annotation) {// 
		Object[] result1_black = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_27_1_matchtggpattern_blackBB(astNode, Annotation);
		if (result1_black != null) {
			return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_27_2_expressionF();
		} else {
			return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TAnnotation tAnnotation, TAnnotatable tAnnotable) {// 
		Object[] result1_black = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_28_1_matchtggpattern_blackBB(tAnnotation, tAnnotable);
		if (result1_black != null) {
			return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_28_2_expressionF();
		} else {
			return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNodeToTAnnotatable aSTNodeToTAnnotableParameter) {

		Object[] result1_black = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnnotationOnBodyDeclarationImpl
				.pattern_AnnotationOnBodyDeclaration_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList aSTNodeToTAnnotableList = (RuleEntryList) result2_black[0];
			BodyDeclaration astNode = (BodyDeclaration) result2_black[1];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result2_black[2];
			TAnnotatable tAnnotable = (TAnnotatable) result2_black[3];

			Object[] result3_bindingAndBlack = AnnotationOnBodyDeclarationImpl
					.pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							astNode, tAnnotable, aSTNodeToTAnnotable, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[astNode] = " + astNode + ", "
						+ "[tAnnotable] = " + tAnnotable + ", " + "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = AnnotationOnBodyDeclarationImpl
						.pattern_AnnotationOnBodyDeclaration_29_5_checknacs_blackBBB(astNode, tAnnotable,
								aSTNodeToTAnnotable);
				if (result5_black != null) {

					Object[] result6_black = AnnotationOnBodyDeclarationImpl
							.pattern_AnnotationOnBodyDeclaration_29_6_perform_blackBBBB(astNode, tAnnotable,
									aSTNodeToTAnnotable, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[astNode] = "
								+ astNode + ", " + "[tAnnotable] = " + tAnnotable + ", " + "[aSTNodeToTAnnotable] = "
								+ aSTNodeToTAnnotable + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_29_6_perform_greenFBFBFB(
							astNode, tAnnotable, ruleResult);
					//nothing TAnnotation tAnnotation = (TAnnotation) result6_green[0];
					//nothing AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result6_green[2];
					//nothing Annotation Annotation = (Annotation) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return AnnotationOnBodyDeclarationImpl.pattern_AnnotationOnBodyDeclaration_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, BodyDeclaration astNode,
			TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("astNode", astNode);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
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
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPROPRIATE_FWD__MATCH_BODYDECLARATION_ANNOTATION:
			return isAppropriate_FWD((Match) arguments.get(0), (BodyDeclaration) arguments.get(1),
					(Annotation) arguments.get(2));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BODYDECLARATION_ANNOTATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (BodyDeclaration) arguments.get(1),
					(Annotation) arguments.get(2));
			return null;
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BODYDECLARATION_ANNOTATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (BodyDeclaration) arguments.get(1),
					(Annotation) arguments.get(2));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_BODYDECLARATION_TANNOTATABLE_ASTNODETOTANNOTATABLE_ANNOTATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (BodyDeclaration) arguments.get(1),
					(TAnnotatable) arguments.get(2), (ASTNodeToTAnnotatable) arguments.get(3),
					(Annotation) arguments.get(4));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPROPRIATE_BWD__MATCH_TANNOTATION_TANNOTATABLE:
			return isAppropriate_BWD((Match) arguments.get(0), (TAnnotation) arguments.get(1),
					(TAnnotatable) arguments.get(2));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TANNOTATION_TANNOTATABLE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TAnnotation) arguments.get(1),
					(TAnnotatable) arguments.get(2));
			return null;
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TANNOTATION_TANNOTATABLE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TAnnotation) arguments.get(1),
					(TAnnotatable) arguments.get(2));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TANNOTATION_BODYDECLARATION_TANNOTATABLE_ASTNODETOTANNOTATABLE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TAnnotation) arguments.get(1),
					(BodyDeclaration) arguments.get(2), (TAnnotatable) arguments.get(3),
					(ASTNodeToTAnnotatable) arguments.get(4));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_37__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_37((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_39__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_39((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPLICABLE_SOLVE_CSP_CC__TANNOTATION_BODYDECLARATION_TANNOTATABLE_ANNOTATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TAnnotation) arguments.get(0), (BodyDeclaration) arguments.get(1),
					(TAnnotatable) arguments.get(2), (Annotation) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___CHECK_DEC_FWD__BODYDECLARATION_ANNOTATION:
			return checkDEC_FWD((BodyDeclaration) arguments.get(0), (Annotation) arguments.get(1));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___CHECK_DEC_BWD__TANNOTATION_TANNOTATABLE:
			return checkDEC_BWD((TAnnotation) arguments.get(0), (TAnnotatable) arguments.get(1));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODETOTANNOTATABLE:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNodeToTAnnotatable) arguments.get(1));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_BODYDECLARATION_TANNOTATABLE_ASTNODETOTANNOTATABLE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (BodyDeclaration) arguments.get(1),
					(TAnnotatable) arguments.get(2), (ASTNodeToTAnnotatable) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.ANNOTATION_ON_BODY_DECLARATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_0_1_initialbindings_blackBBBB(
			AnnotationOnBodyDeclaration _this, Match match, BodyDeclaration astNode, Annotation annotation) {
		return new Object[] { _this, match, astNode, annotation };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_bindingFBBBB(
			AnnotationOnBodyDeclaration _this, Match match, BodyDeclaration astNode, Annotation annotation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, astNode, annotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, astNode, annotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_bindingAndBlackFBBBB(
			AnnotationOnBodyDeclaration _this, Match match, BodyDeclaration astNode, Annotation annotation) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_binding = pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_bindingFBBBB(
				_this, match, astNode, annotation);
		if (result_pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_black = pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationOnBodyDeclaration_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, astNode, annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_0_3_CheckCSP_expressionFBB(
			AnnotationOnBodyDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_0_4_collectelementstobetranslated_blackBBB(
			Match match, BodyDeclaration astNode, Annotation annotation) {
		return new Object[] { match, astNode, annotation };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_0_4_collectelementstobetranslated_greenBBBF(
			Match match, BodyDeclaration astNode, Annotation annotation) {
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(annotation);
		String astNode__Annotation____annotations_name_prime = "annotations";
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		match.getToBeTranslatedEdges().add(astNode__Annotation____annotations);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		return new Object[] { match, astNode, annotation, astNode__Annotation____annotations };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_0_5_collectcontextelements_blackBBB(Match match,
			BodyDeclaration astNode, Annotation annotation) {
		return new Object[] { match, astNode, annotation };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_0_5_collectcontextelements_greenBB(Match match,
			BodyDeclaration astNode) {
		match.getContextNodes().add(astNode);
		return new Object[] { match, astNode };
	}

	public static final void pattern_AnnotationOnBodyDeclaration_0_6_registerobjectstomatch_expressionBBBB(
			AnnotationOnBodyDeclaration _this, Match match, BodyDeclaration astNode, Annotation annotation) {
		_this.registerObjectsToMatch_FWD(match, astNode, annotation);

	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("astNode");
		EObject _localVariable_1 = isApplicableMatch.getObject("tAnnotable");
		EObject _localVariable_2 = isApplicableMatch.getObject("aSTNodeToTAnnotable");
		EObject _localVariable_3 = isApplicableMatch.getObject("Annotation");
		EObject tmpAstNode = _localVariable_0;
		EObject tmpTAnnotable = _localVariable_1;
		EObject tmpASTNodeToTAnnotable = _localVariable_2;
		EObject tmpAnnotation = _localVariable_3;
		if (tmpAstNode instanceof BodyDeclaration) {
			BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
			if (tmpTAnnotable instanceof TAnnotatable) {
				TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
				if (tmpASTNodeToTAnnotable instanceof ASTNodeToTAnnotatable) {
					ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) tmpASTNodeToTAnnotable;
					if (tmpAnnotation instanceof Annotation) {
						Annotation annotation = (Annotation) tmpAnnotation;
						return new Object[] { astNode, tAnnotable, aSTNodeToTAnnotable, annotation, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_blackBBBBFBB(
			BodyDeclaration astNode, TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable,
			Annotation annotation, AnnotationOnBodyDeclaration _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { astNode, tAnnotable, aSTNodeToTAnnotable, annotation, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_bindingAndBlackFFFFFBB(
			AnnotationOnBodyDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_binding = pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_binding != null) {
			BodyDeclaration astNode = (BodyDeclaration) result_pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_binding[0];
			TAnnotatable tAnnotable = (TAnnotatable) result_pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_binding[1];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result_pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_binding[2];
			Annotation annotation = (Annotation) result_pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_binding[3];

			Object[] result_pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_black = pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_blackBBBBFBB(
					astNode, tAnnotable, aSTNodeToTAnnotable, annotation, _this, isApplicableMatch);
			if (result_pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_black[4];

				return new Object[] { astNode, tAnnotable, aSTNodeToTAnnotable, annotation, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_1_1_performtransformation_greenFFBB(
			TAnnotatable tAnnotable, Annotation annotation) {
		TAnnotation tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		tAnnotation.setTAnnotated(tAnnotable);
		annotationToTAnnotation.setSource(annotation);
		annotationToTAnnotation.setTarget(tAnnotation);
		return new Object[] { tAnnotation, annotationToTAnnotation, tAnnotable, annotation };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_1_2_collecttranslatedelements_blackBBB(
			TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation, Annotation annotation) {
		return new Object[] { tAnnotation, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_1_2_collecttranslatedelements_greenFBBB(
			TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation, Annotation annotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tAnnotation);
		ruleresult.getCreatedLinkElements().add(annotationToTAnnotation);
		ruleresult.getTranslatedElements().add(annotation);
		return new Object[] { ruleresult, tAnnotation, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject astNode, EObject annotationToTAnnotation,
			EObject tAnnotable, EObject aSTNodeToTAnnotable, EObject annotation) {
		if (!astNode.equals(tAnnotation)) {
			if (!astNode.equals(tAnnotable)) {
				if (!annotationToTAnnotation.equals(tAnnotation)) {
					if (!annotationToTAnnotation.equals(astNode)) {
						if (!annotationToTAnnotation.equals(tAnnotable)) {
							if (!annotationToTAnnotation.equals(aSTNodeToTAnnotable)) {
								if (!tAnnotable.equals(tAnnotation)) {
									if (!aSTNodeToTAnnotable.equals(tAnnotation)) {
										if (!aSTNodeToTAnnotable.equals(astNode)) {
											if (!aSTNodeToTAnnotable.equals(tAnnotable)) {
												if (!annotation.equals(tAnnotation)) {
													if (!annotation.equals(astNode)) {
														if (!annotation.equals(annotationToTAnnotation)) {
															if (!annotation.equals(tAnnotable)) {
																if (!annotation.equals(aSTNodeToTAnnotable)) {
																	return new Object[] { ruleresult, tAnnotation,
																			astNode, annotationToTAnnotation,
																			tAnnotable, aSTNodeToTAnnotable,
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
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject astNode, EObject annotationToTAnnotation,
			EObject tAnnotable, EObject annotation) {
		EMoflonEdge annotationToTAnnotation__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationOnBodyDeclaration";
		String annotationToTAnnotation__Annotation____source_name_prime = "source";
		String astNode__Annotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		annotationToTAnnotation__Annotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__Annotation____source.setTrg(annotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__Annotation____source);
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		ruleresult.getTranslatedEdges().add(astNode__Annotation____annotations);
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		ruleresult.getCreatedEdges().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tAnnotable__tAnnotation____tAnnotation);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__tAnnotation____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		annotationToTAnnotation__Annotation____source.setName(annotationToTAnnotation__Annotation____source_name_prime);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		return new Object[] { ruleresult, tAnnotation, astNode, annotationToTAnnotation, tAnnotable, annotation,
				annotationToTAnnotation__Annotation____source, astNode__Annotation____annotations,
				tAnnotation__tAnnotable____tAnnotated, tAnnotable__tAnnotation____tAnnotation,
				annotationToTAnnotation__tAnnotation____target };
	}

	public static final void pattern_AnnotationOnBodyDeclaration_1_5_registerobjects_expressionBBBBBBBB(
			AnnotationOnBodyDeclaration _this, PerformRuleResult ruleresult, EObject tAnnotation, EObject astNode,
			EObject annotationToTAnnotation, EObject tAnnotable, EObject aSTNodeToTAnnotable, EObject annotation) {
		_this.registerObjects_FWD(ruleresult, tAnnotation, astNode, annotationToTAnnotation, tAnnotable,
				aSTNodeToTAnnotable, annotation);

	}

	public static final PerformRuleResult pattern_AnnotationOnBodyDeclaration_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_bindingFB(
			AnnotationOnBodyDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationOnBodyDeclaration _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationOnBodyDeclaration _this) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_binding = pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_black = pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationOnBodyDeclaration";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("astNode");
		EObject _localVariable_1 = match.getObject("Annotation");
		EObject tmpAstNode = _localVariable_0;
		EObject tmpAnnotation = _localVariable_1;
		if (tmpAstNode instanceof BodyDeclaration) {
			BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
			if (tmpAnnotation instanceof Annotation) {
				Annotation annotation = (Annotation) tmpAnnotation;
				return new Object[] { astNode, annotation, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationOnBodyDeclaration_2_2_corematch_blackBFFBB(
			BodyDeclaration astNode, Annotation annotation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNodeToTAnnotatable aSTNodeToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(astNode, ASTNodeToTAnnotatable.class, "source")) {
			TAnnotatable tAnnotable = aSTNodeToTAnnotable.getTarget();
			if (tAnnotable != null) {
				_result.add(new Object[] { astNode, tAnnotable, aSTNodeToTAnnotable, annotation, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationOnBodyDeclaration_2_3_findcontext_blackBBBB(
			BodyDeclaration astNode, TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable,
			Annotation annotation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (astNode.equals(aSTNodeToTAnnotable.getSource())) {
			if (astNode.getAnnotations().contains(annotation)) {
				if (tAnnotable.equals(aSTNodeToTAnnotable.getTarget())) {
					_result.add(new Object[] { astNode, tAnnotable, aSTNodeToTAnnotable, annotation });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_3_findcontext_greenBBBBFFFF(
			BodyDeclaration astNode, TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable,
			Annotation annotation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge aSTNodeToTAnnotable__astNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge aSTNodeToTAnnotable__tAnnotable____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String aSTNodeToTAnnotable__astNode____source_name_prime = "source";
		String astNode__Annotation____annotations_name_prime = "annotations";
		String aSTNodeToTAnnotable__tAnnotable____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(astNode);
		isApplicableMatch.getAllContextElements().add(tAnnotable);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable);
		isApplicableMatch.getAllContextElements().add(annotation);
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
		return new Object[] { astNode, tAnnotable, aSTNodeToTAnnotable, annotation, isApplicableMatch,
				aSTNodeToTAnnotable__astNode____source, astNode__Annotation____annotations,
				aSTNodeToTAnnotable__tAnnotable____target };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_bindingFBBBBBB(
			AnnotationOnBodyDeclaration _this, IsApplicableMatch isApplicableMatch, BodyDeclaration astNode,
			TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable, Annotation annotation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, astNode, tAnnotable,
				aSTNodeToTAnnotable, annotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, astNode, tAnnotable, aSTNodeToTAnnotable, annotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBB(
			AnnotationOnBodyDeclaration _this, IsApplicableMatch isApplicableMatch, BodyDeclaration astNode,
			TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable, Annotation annotation) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_binding = pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, astNode, tAnnotable, aSTNodeToTAnnotable, annotation);
		if (result_pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_black = pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationOnBodyDeclaration_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, astNode, tAnnotable, aSTNodeToTAnnotable,
						annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_2_5_checkCSP_expressionFBB(
			AnnotationOnBodyDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationOnBodyDeclaration";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationOnBodyDeclaration_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_10_1_initialbindings_blackBBBB(
			AnnotationOnBodyDeclaration _this, Match match, TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		return new Object[] { _this, match, tAnnotation, tAnnotable };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_bindingFBBBB(
			AnnotationOnBodyDeclaration _this, Match match, TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnnotation, tAnnotable);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnnotation, tAnnotable };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_bindingAndBlackFBBBB(
			AnnotationOnBodyDeclaration _this, Match match, TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_binding = pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_bindingFBBBB(
				_this, match, tAnnotation, tAnnotable);
		if (result_pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_black = pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnnotationOnBodyDeclaration_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnnotation, tAnnotable };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_10_3_CheckCSP_expressionFBB(
			AnnotationOnBodyDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_10_4_collectelementstobetranslated_blackBBB(
			Match match, TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		return new Object[] { match, tAnnotation, tAnnotable };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TAnnotation tAnnotation, TAnnotatable tAnnotable) {
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
		return new Object[] { match, tAnnotation, tAnnotable, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_10_5_collectcontextelements_blackBBB(Match match,
			TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		return new Object[] { match, tAnnotation, tAnnotable };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_10_5_collectcontextelements_greenBB(Match match,
			TAnnotatable tAnnotable) {
		match.getContextNodes().add(tAnnotable);
		return new Object[] { match, tAnnotable };
	}

	public static final void pattern_AnnotationOnBodyDeclaration_10_6_registerobjectstomatch_expressionBBBB(
			AnnotationOnBodyDeclaration _this, Match match, TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		_this.registerObjectsToMatch_BWD(match, tAnnotation, tAnnotable);

	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("astNode");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAnnotable");
		EObject _localVariable_3 = isApplicableMatch.getObject("aSTNodeToTAnnotable");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpAstNode = _localVariable_1;
		EObject tmpTAnnotable = _localVariable_2;
		EObject tmpASTNodeToTAnnotable = _localVariable_3;
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			if (tmpAstNode instanceof BodyDeclaration) {
				BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
				if (tmpTAnnotable instanceof TAnnotatable) {
					TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
					if (tmpASTNodeToTAnnotable instanceof ASTNodeToTAnnotatable) {
						ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) tmpASTNodeToTAnnotable;
						return new Object[] { tAnnotation, astNode, tAnnotable, aSTNodeToTAnnotable,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_blackBBBBFBB(
			TAnnotation tAnnotation, BodyDeclaration astNode, TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, AnnotationOnBodyDeclaration _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tAnnotation, astNode, tAnnotable, aSTNodeToTAnnotable, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_bindingAndBlackFFFFFBB(
			AnnotationOnBodyDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_binding = pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_binding != null) {
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_binding[0];
			BodyDeclaration astNode = (BodyDeclaration) result_pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_binding[1];
			TAnnotatable tAnnotable = (TAnnotatable) result_pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_binding[2];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result_pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_binding[3];

			Object[] result_pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_black = pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_blackBBBBFBB(
					tAnnotation, astNode, tAnnotable, aSTNodeToTAnnotable, _this, isApplicableMatch);
			if (result_pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_black[4];

				return new Object[] { tAnnotation, astNode, tAnnotable, aSTNodeToTAnnotable, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_11_1_performtransformation_greenBBFF(
			TAnnotation tAnnotation, BodyDeclaration astNode) {
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		Annotation annotation = JavaFactory.eINSTANCE.createAnnotation();
		annotationToTAnnotation.setTarget(tAnnotation);
		annotationToTAnnotation.setSource(annotation);
		astNode.getAnnotations().add(annotation);
		return new Object[] { tAnnotation, astNode, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_11_2_collecttranslatedelements_blackBBB(
			TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation, Annotation annotation) {
		return new Object[] { tAnnotation, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_11_2_collecttranslatedelements_greenFBBB(
			TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation, Annotation annotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tAnnotation);
		ruleresult.getCreatedLinkElements().add(annotationToTAnnotation);
		ruleresult.getCreatedElements().add(annotation);
		return new Object[] { ruleresult, tAnnotation, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject astNode, EObject annotationToTAnnotation,
			EObject tAnnotable, EObject aSTNodeToTAnnotable, EObject annotation) {
		if (!astNode.equals(tAnnotation)) {
			if (!astNode.equals(tAnnotable)) {
				if (!annotationToTAnnotation.equals(tAnnotation)) {
					if (!annotationToTAnnotation.equals(astNode)) {
						if (!annotationToTAnnotation.equals(tAnnotable)) {
							if (!annotationToTAnnotation.equals(aSTNodeToTAnnotable)) {
								if (!tAnnotable.equals(tAnnotation)) {
									if (!aSTNodeToTAnnotable.equals(tAnnotation)) {
										if (!aSTNodeToTAnnotable.equals(astNode)) {
											if (!aSTNodeToTAnnotable.equals(tAnnotable)) {
												if (!annotation.equals(tAnnotation)) {
													if (!annotation.equals(astNode)) {
														if (!annotation.equals(annotationToTAnnotation)) {
															if (!annotation.equals(tAnnotable)) {
																if (!annotation.equals(aSTNodeToTAnnotable)) {
																	return new Object[] { ruleresult, tAnnotation,
																			astNode, annotationToTAnnotation,
																			tAnnotable, aSTNodeToTAnnotable,
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
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject astNode, EObject annotationToTAnnotation,
			EObject tAnnotable, EObject annotation) {
		EMoflonEdge annotationToTAnnotation__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnnotationOnBodyDeclaration";
		String annotationToTAnnotation__Annotation____source_name_prime = "source";
		String astNode__Annotation____annotations_name_prime = "annotations";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		annotationToTAnnotation__Annotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__Annotation____source.setTrg(annotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__Annotation____source);
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		ruleresult.getCreatedEdges().add(astNode__Annotation____annotations);
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		ruleresult.getTranslatedEdges().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tAnnotable__tAnnotation____tAnnotation);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__tAnnotation____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		annotationToTAnnotation__Annotation____source.setName(annotationToTAnnotation__Annotation____source_name_prime);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		return new Object[] { ruleresult, tAnnotation, astNode, annotationToTAnnotation, tAnnotable, annotation,
				annotationToTAnnotation__Annotation____source, astNode__Annotation____annotations,
				tAnnotation__tAnnotable____tAnnotated, tAnnotable__tAnnotation____tAnnotation,
				annotationToTAnnotation__tAnnotation____target };
	}

	public static final void pattern_AnnotationOnBodyDeclaration_11_5_registerobjects_expressionBBBBBBBB(
			AnnotationOnBodyDeclaration _this, PerformRuleResult ruleresult, EObject tAnnotation, EObject astNode,
			EObject annotationToTAnnotation, EObject tAnnotable, EObject aSTNodeToTAnnotable, EObject annotation) {
		_this.registerObjects_BWD(ruleresult, tAnnotation, astNode, annotationToTAnnotation, tAnnotable,
				aSTNodeToTAnnotable, annotation);

	}

	public static final PerformRuleResult pattern_AnnotationOnBodyDeclaration_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_bindingFB(
			AnnotationOnBodyDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnnotationOnBodyDeclaration _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnnotationOnBodyDeclaration _this) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_binding = pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_black = pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnnotationOnBodyDeclaration";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAnnotation");
		EObject _localVariable_1 = match.getObject("tAnnotable");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpTAnnotable = _localVariable_1;
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			if (tmpTAnnotable instanceof TAnnotatable) {
				TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
				return new Object[] { tAnnotation, tAnnotable, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationOnBodyDeclaration_12_2_corematch_blackBFBFB(
			TAnnotation tAnnotation, TAnnotatable tAnnotable, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNodeToTAnnotatable aSTNodeToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnnotable, ASTNodeToTAnnotatable.class, "target")) {
			ASTNode tmpAstNode = aSTNodeToTAnnotable.getSource();
			if (tmpAstNode instanceof BodyDeclaration) {
				BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
				_result.add(new Object[] { tAnnotation, astNode, tAnnotable, aSTNodeToTAnnotable, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationOnBodyDeclaration_12_3_findcontext_blackBBBB(
			TAnnotation tAnnotation, BodyDeclaration astNode, TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (astNode.equals(aSTNodeToTAnnotable.getSource())) {
			if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
				if (tAnnotable.equals(aSTNodeToTAnnotable.getTarget())) {
					_result.add(new Object[] { tAnnotation, astNode, tAnnotable, aSTNodeToTAnnotable });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_3_findcontext_greenBBBBFFFFF(
			TAnnotation tAnnotation, BodyDeclaration astNode, TAnnotatable tAnnotable,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge aSTNodeToTAnnotable__astNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge aSTNodeToTAnnotable__tAnnotable____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String aSTNodeToTAnnotable__astNode____source_name_prime = "source";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String aSTNodeToTAnnotable__tAnnotable____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(astNode);
		isApplicableMatch.getAllContextElements().add(tAnnotable);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable);
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
		return new Object[] { tAnnotation, astNode, tAnnotable, aSTNodeToTAnnotable, isApplicableMatch,
				aSTNodeToTAnnotable__astNode____source, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation, aSTNodeToTAnnotable__tAnnotable____target };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_bindingFBBBBBB(
			AnnotationOnBodyDeclaration _this, IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			BodyDeclaration astNode, TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tAnnotation, astNode, tAnnotable,
				aSTNodeToTAnnotable);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAnnotation, astNode, tAnnotable,
					aSTNodeToTAnnotable };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBB(
			AnnotationOnBodyDeclaration _this, IsApplicableMatch isApplicableMatch, TAnnotation tAnnotation,
			BodyDeclaration astNode, TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_binding = pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, tAnnotation, astNode, tAnnotable, aSTNodeToTAnnotable);
		if (result_pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_black = pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationOnBodyDeclaration_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAnnotation, astNode, tAnnotable,
						aSTNodeToTAnnotable };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_12_5_checkCSP_expressionFBB(
			AnnotationOnBodyDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnnotationOnBodyDeclaration";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationOnBodyDeclaration_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_bindingFB(
			AnnotationOnBodyDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationOnBodyDeclaration _this) {
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

	public static final Object[] pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationOnBodyDeclaration _this) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_binding = pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_black = pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_20_2_testcorematchandDECs_black_nac_0BB(
			TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		TAnnotatable __DEC_tAnnotation_tAnnotation_571512 = tAnnotation.getTAnnotated();
		if (__DEC_tAnnotation_tAnnotation_571512 != null) {
			if (!tAnnotable.equals(__DEC_tAnnotation_tAnnotation_571512)) {
				return new Object[] { tAnnotation, tAnnotable };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationOnBodyDeclaration_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_tAnnotated) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnnotation = _edge_tAnnotated.getSrc();
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			EObject tmpTAnnotable = _edge_tAnnotated.getTrg();
			if (tmpTAnnotable instanceof TAnnotatable) {
				TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
				if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
					if (pattern_AnnotationOnBodyDeclaration_20_2_testcorematchandDECs_black_nac_0BB(tAnnotation,
							tAnnotable) == null) {
						_result.add(new Object[] { tAnnotation, tAnnotable, _edge_tAnnotated });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnnotationOnBodyDeclaration _this, Match match, TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnnotation, tAnnotable);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationOnBodyDeclaration _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationOnBodyDeclaration_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_bindingFB(
			AnnotationOnBodyDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnnotationOnBodyDeclaration _this) {
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

	public static final Object[] pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnnotationOnBodyDeclaration _this) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_binding = pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_black = pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_21_2_testcorematchandDECs_black_nac_0B(
			Annotation annotation) {
		for (AnnotationMemberValuePair __DEC_Annotation_value_282504 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { annotation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationOnBodyDeclaration_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_annotations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAstNode = _edge_annotations.getSrc();
		if (tmpAstNode instanceof BodyDeclaration) {
			BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
			EObject tmpAnnotation = _edge_annotations.getTrg();
			if (tmpAnnotation instanceof Annotation) {
				Annotation annotation = (Annotation) tmpAnnotation;
				if (astNode.getAnnotations().contains(annotation)) {
					if (pattern_AnnotationOnBodyDeclaration_21_2_testcorematchandDECs_black_nac_0B(
							annotation) == null) {
						_result.add(new Object[] { astNode, annotation, _edge_annotations });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnnotationOnBodyDeclaration _this, Match match, BodyDeclaration astNode, Annotation annotation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, astNode, annotation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnnotationOnBodyDeclaration _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnnotationOnBodyDeclaration_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_1_prepare_blackB(
			AnnotationOnBodyDeclaration _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_1 = sourceMatch.getObject("astNode");
		EObject _localVariable_2 = targetMatch.getObject("tAnnotable");
		EObject _localVariable_3 = sourceMatch.getObject("Annotation");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpAstNode = _localVariable_1;
		EObject tmpTAnnotable = _localVariable_2;
		EObject tmpAnnotation = _localVariable_3;
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			if (tmpAstNode instanceof BodyDeclaration) {
				BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
				if (tmpTAnnotable instanceof TAnnotatable) {
					TAnnotatable tAnnotable = (TAnnotatable) tmpTAnnotable;
					if (tmpAnnotation instanceof Annotation) {
						Annotation annotation = (Annotation) tmpAnnotation;
						return new Object[] { tAnnotation, astNode, tAnnotable, annotation, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_blackBBBBBB(
			TAnnotation tAnnotation, BodyDeclaration astNode, TAnnotatable tAnnotable, Annotation annotation,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tAnnotation, astNode, tAnnotable, annotation, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_binding = pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_binding != null) {
			TAnnotation tAnnotation = (TAnnotation) result_pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_binding[0];
			BodyDeclaration astNode = (BodyDeclaration) result_pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_binding[1];
			TAnnotatable tAnnotable = (TAnnotatable) result_pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_binding[2];
			Annotation annotation = (Annotation) result_pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_black = pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_blackBBBBBB(
					tAnnotation, astNode, tAnnotable, annotation, sourceMatch, targetMatch);
			if (result_pattern_AnnotationOnBodyDeclaration_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tAnnotation, astNode, tAnnotable, annotation, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_bindingFBBBBBBB(
			AnnotationOnBodyDeclaration _this, TAnnotation tAnnotation, BodyDeclaration astNode,
			TAnnotatable tAnnotable, Annotation annotation, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(tAnnotation, astNode, tAnnotable, annotation, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, tAnnotation, astNode, tAnnotable, annotation, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			AnnotationOnBodyDeclaration _this, TAnnotation tAnnotation, BodyDeclaration astNode,
			TAnnotatable tAnnotable, Annotation annotation, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_binding = pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_bindingFBBBBBBB(
				_this, tAnnotation, astNode, tAnnotable, annotation, sourceMatch, targetMatch);
		if (result_pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_black = pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnnotationOnBodyDeclaration_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tAnnotation, astNode, tAnnotable, annotation, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnnotationOnBodyDeclaration_24_5_matchcorrcontext_blackBBFBB(
			BodyDeclaration astNode, TAnnotatable tAnnotable, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNodeToTAnnotatable aSTNodeToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(astNode, ASTNodeToTAnnotatable.class, "source")) {
				if (tAnnotable.equals(aSTNodeToTAnnotable.getTarget())) {
					_result.add(new Object[] { astNode, tAnnotable, aSTNodeToTAnnotable, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_5_matchcorrcontext_greenBBBF(
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnnotationOnBodyDeclaration";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(aSTNodeToTAnnotable);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { aSTNodeToTAnnotable, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_6_createcorrespondence_blackBBBBB(
			TAnnotation tAnnotation, BodyDeclaration astNode, TAnnotatable tAnnotable, Annotation annotation,
			CCMatch ccMatch) {
		return new Object[] { tAnnotation, astNode, tAnnotable, annotation, ccMatch };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_6_createcorrespondence_greenBFBB(
			TAnnotation tAnnotation, Annotation annotation, CCMatch ccMatch) {
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		annotationToTAnnotation.setSource(annotation);
		annotationToTAnnotation.setTarget(tAnnotation);
		ccMatch.getCreateCorr().add(annotationToTAnnotation);
		return new Object[] { tAnnotation, annotationToTAnnotation, annotation, ccMatch };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnnotationOnBodyDeclaration";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnnotationOnBodyDeclaration_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_27_1_matchtggpattern_black_nac_0B(
			Annotation annotation) {
		for (AnnotationMemberValuePair __DEC_Annotation_value_535052 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { annotation };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_27_1_matchtggpattern_blackBB(
			BodyDeclaration astNode, Annotation annotation) {
		if (astNode.getAnnotations().contains(annotation)) {
			if (pattern_AnnotationOnBodyDeclaration_27_1_matchtggpattern_black_nac_0B(annotation) == null) {
				return new Object[] { astNode, annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_28_1_matchtggpattern_black_nac_0BB(
			TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		TAnnotatable __DEC_tAnnotation_tAnnotation_241767 = tAnnotation.getTAnnotated();
		if (__DEC_tAnnotation_tAnnotation_241767 != null) {
			if (!tAnnotable.equals(__DEC_tAnnotation_tAnnotation_241767)) {
				return new Object[] { tAnnotation, tAnnotable };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_28_1_matchtggpattern_blackBB(
			TAnnotation tAnnotation, TAnnotatable tAnnotable) {
		if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
			if (pattern_AnnotationOnBodyDeclaration_28_1_matchtggpattern_black_nac_0BB(tAnnotation,
					tAnnotable) == null) {
				return new Object[] { tAnnotation, tAnnotable };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_1_createresult_blackB(
			AnnotationOnBodyDeclaration _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, BodyDeclaration astNode) {
		if (ruleResult.getSourceObjects().contains(astNode)) {
			return new Object[] { ruleResult, astNode };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNodeToTAnnotatable aSTNodeToTAnnotable) {
		if (ruleResult.getCorrObjects().contains(aSTNodeToTAnnotable)) {
			return new Object[] { ruleResult, aSTNodeToTAnnotable };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAnnotatable tAnnotable) {
		if (ruleResult.getTargetObjects().contains(tAnnotable)) {
			return new Object[] { ruleResult, tAnnotable };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnnotationOnBodyDeclaration_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList aSTNodeToTAnnotableList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpASTNodeToTAnnotable : aSTNodeToTAnnotableList.getEntryObjects()) {
				if (tmpASTNodeToTAnnotable instanceof ASTNodeToTAnnotatable) {
					ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) tmpASTNodeToTAnnotable;
					ASTNode tmpAstNode = aSTNodeToTAnnotable.getSource();
					if (tmpAstNode instanceof BodyDeclaration) {
						BodyDeclaration astNode = (BodyDeclaration) tmpAstNode;
						TAnnotatable tAnnotable = aSTNodeToTAnnotable.getTarget();
						if (tAnnotable != null) {
							if (pattern_AnnotationOnBodyDeclaration_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									aSTNodeToTAnnotable) == null) {
								if (pattern_AnnotationOnBodyDeclaration_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										astNode) == null) {
									if (pattern_AnnotationOnBodyDeclaration_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, tAnnotable) == null) {
										_result.add(new Object[] { aSTNodeToTAnnotableList, astNode,
												aSTNodeToTAnnotable, tAnnotable, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_bindingFBBBBBB(
			AnnotationOnBodyDeclaration _this, IsApplicableMatch isApplicableMatch, BodyDeclaration astNode,
			TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, astNode, tAnnotable,
				aSTNodeToTAnnotable, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, astNode, tAnnotable, aSTNodeToTAnnotable, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBB(
			AnnotationOnBodyDeclaration _this, IsApplicableMatch isApplicableMatch, BodyDeclaration astNode,
			TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_binding = pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, astNode, tAnnotable, aSTNodeToTAnnotable, ruleResult);
		if (result_pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_black = pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnnotationOnBodyDeclaration_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, astNode, tAnnotable, aSTNodeToTAnnotable,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnnotationOnBodyDeclaration_29_4_checkCSP_expressionFBB(
			AnnotationOnBodyDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_5_checknacs_blackBBB(BodyDeclaration astNode,
			TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable) {
		return new Object[] { astNode, tAnnotable, aSTNodeToTAnnotable };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_6_perform_blackBBBB(BodyDeclaration astNode,
			TAnnotatable tAnnotable, ASTNodeToTAnnotatable aSTNodeToTAnnotable, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { astNode, tAnnotable, aSTNodeToTAnnotable, ruleResult };
	}

	public static final Object[] pattern_AnnotationOnBodyDeclaration_29_6_perform_greenFBFBFB(BodyDeclaration astNode,
			TAnnotatable tAnnotable, ModelgeneratorRuleResult ruleResult) {
		TAnnotation tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		Annotation annotation = JavaFactory.eINSTANCE.createAnnotation();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		tAnnotation.setTAnnotated(tAnnotable);
		ruleResult.getTargetObjects().add(tAnnotation);
		annotationToTAnnotation.setTarget(tAnnotation);
		ruleResult.getCorrObjects().add(annotationToTAnnotation);
		annotationToTAnnotation.setSource(annotation);
		astNode.getAnnotations().add(annotation);
		ruleResult.getSourceObjects().add(annotation);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAnnotation, astNode, annotationToTAnnotation, tAnnotable, annotation, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_AnnotationOnBodyDeclaration_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnnotationOnBodyDeclarationImpl
