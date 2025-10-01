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
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.BodyDeclaration;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MSingleVariableDeclaration;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.AnnotationToTAnnotation;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.ParameterAnnotation;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TParameter;
import org.gravity.typegraph.basic.TSignature;

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
 * An implementation of the model object '<em><b>Parameter Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterAnnotationImpl extends AbstractRuleImpl implements ParameterAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterAnnotation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodDefinition method, MSingleVariableDeclaration astNode,
			Annotation Annotation) {

		Object[] result1_black = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_0_1_initialbindings_blackBBBBB(this, match, method, astNode, Annotation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[astNode] = " + astNode + ", "
					+ "[Annotation] = " + Annotation + ".");
		}

		Object[] result2_bindingAndBlack = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, method, astNode,
						Annotation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[astNode] = " + astNode + ", "
					+ "[Annotation] = " + Annotation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterAnnotationImpl.pattern_ParameterAnnotation_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterAnnotationImpl
					.pattern_ParameterAnnotation_0_4_collectelementstobetranslated_blackBBBB(match, method, astNode,
							Annotation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[astNode] = " + astNode + ", " + "[Annotation] = "
						+ Annotation + ".");
			}
			ParameterAnnotationImpl.pattern_ParameterAnnotation_0_4_collectelementstobetranslated_greenBBBF(match,
					astNode, Annotation);
			//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result4_green[3];

			Object[] result5_black = ParameterAnnotationImpl
					.pattern_ParameterAnnotation_0_5_collectcontextelements_blackBBBB(match, method, astNode,
							Annotation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[astNode] = " + astNode + ", " + "[Annotation] = "
						+ Annotation + ".");
			}
			ParameterAnnotationImpl.pattern_ParameterAnnotation_0_5_collectcontextelements_greenBBBFF(match, method,
					astNode);
			//nothing EMoflonEdge method__astNode____parameters = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge astNode__method____methodDeclaration = (EMoflonEdge) result5_green[4];

			// 
			ParameterAnnotationImpl.pattern_ParameterAnnotation_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					method, astNode, Annotation);
			return ParameterAnnotationImpl.pattern_ParameterAnnotation_0_7_expressionF();
		} else {
			return ParameterAnnotationImpl.pattern_ParameterAnnotation_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodDefinition method = (MMethodDefinition) result1_bindingAndBlack[0];
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[1];
		TMethodDefinition tAnnotable = (TMethodDefinition) result1_bindingAndBlack[2];
		TParameter tParam = (TParameter) result1_bindingAndBlack[3];
		ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result1_bindingAndBlack[4];
		MDefinitionToTMember mMethodToTDef = (MDefinitionToTMember) result1_bindingAndBlack[5];
		MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) result1_bindingAndBlack[6];
		Annotation Annotation = (Annotation) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_1_1_performtransformation_greenBFFB(tAnnotable, Annotation);
		TAnnotation tAnnotation = (TAnnotation) result1_green[1];
		AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result1_green[2];

		Object[] result2_black = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_1_2_collecttranslatedelements_blackBBB(tAnnotation,
						AnnotationToTAnnotation, Annotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", " + "[Annotation] = "
					+ Annotation + ".");
		}
		Object[] result2_green = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_1_2_collecttranslatedelements_greenFBBB(tAnnotation,
						AnnotationToTAnnotation, Annotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, method, tSignature,
						tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode,
						AnnotationToTAnnotation, Annotation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[method] = " + method + ", " + "[tSignature] = " + tSignature + ", " + "[tAnnotable] = "
					+ tAnnotable + ", " + "[tParam] = " + tParam + ", " + "[aSTNodeToTAnnotable] = "
					+ aSTNodeToTAnnotable + ", " + "[mMethodToTDef] = " + mMethodToTDef + ", " + "[tAnnotation] = "
					+ tAnnotation + ", " + "[astNode] = " + astNode + ", " + "[AnnotationToTAnnotation] = "
					+ AnnotationToTAnnotation + ", " + "[Annotation] = " + Annotation + ".");
		}
		ParameterAnnotationImpl.pattern_ParameterAnnotation_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				tAnnotable, tAnnotation, astNode, AnnotationToTAnnotation, Annotation);
		//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge AnnotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge AnnotationToTAnnotation__Annotation____source = (EMoflonEdge) result3_green[10];

		// 
		// 
		ParameterAnnotationImpl.pattern_ParameterAnnotation_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode,
				AnnotationToTAnnotation, Annotation);
		return ParameterAnnotationImpl.pattern_ParameterAnnotation_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ParameterAnnotationImpl.pattern_ParameterAnnotation_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodDefinition method = (MMethodDefinition) result2_binding[0];
		MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) result2_binding[1];
		Annotation Annotation = (Annotation) result2_binding[2];
		for (Object[] result2_black : ParameterAnnotationImpl
				.pattern_ParameterAnnotation_2_2_corematch_blackBFFFFBBB(method, astNode, Annotation, match)) {
			TMethodDefinition tAnnotable = (TMethodDefinition) result2_black[1];
			TParameter tParam = (TParameter) result2_black[2];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result2_black[3];
			MDefinitionToTMember mMethodToTDef = (MDefinitionToTMember) result2_black[4];
			// ForEach 
			for (Object[] result3_black : ParameterAnnotationImpl
					.pattern_ParameterAnnotation_2_3_findcontext_blackBFBBBBBB(method, tAnnotable, tParam,
							aSTNodeToTAnnotable, mMethodToTDef, astNode, Annotation)) {
				TMethodSignature tSignature = (TMethodSignature) result3_black[1];
				Object[] result3_green = ParameterAnnotationImpl
						.pattern_ParameterAnnotation_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(method, tSignature,
								tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, astNode, Annotation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge tSignature__tParam____parameters = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mMethodToTDef__method____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMethodToTDef__tAnnotable____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge aSTNodeToTAnnotable__astNode____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge aSTNodeToTAnnotable__tParam____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge method__astNode____parameters = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge astNode__method____methodDeclaration = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tSignature__tAnnotable____definitions = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tAnnotable__tSignature____signature = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = ParameterAnnotationImpl
						.pattern_ParameterAnnotation_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, astNode,
								Annotation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tAnnotable] = " + tAnnotable + ", "
							+ "[tParam] = " + tParam + ", " + "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable + ", "
							+ "[mMethodToTDef] = " + mMethodToTDef + ", " + "[astNode] = " + astNode + ", "
							+ "[Annotation] = " + Annotation + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ParameterAnnotationImpl.pattern_ParameterAnnotation_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ParameterAnnotationImpl
							.pattern_ParameterAnnotation_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ParameterAnnotationImpl.pattern_ParameterAnnotation_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterAnnotationImpl.pattern_ParameterAnnotation_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodDefinition method, MSingleVariableDeclaration astNode,
			Annotation Annotation) {
		match.registerObject("method", method);
		match.registerObject("astNode", astNode);
		match.registerObject("Annotation", Annotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodDefinition method, MSingleVariableDeclaration astNode,
			Annotation Annotation) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MMethodDefinition method,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef,
			MSingleVariableDeclaration astNode, Annotation Annotation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("tParam", tParam);
		isApplicableMatch.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		isApplicableMatch.registerObject("mMethodToTDef", mMethodToTDef);
		isApplicableMatch.registerObject("astNode", astNode);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject method, EObject tSignature,
			EObject tAnnotable, EObject tParam, EObject aSTNodeToTAnnotable, EObject mMethodToTDef, EObject tAnnotation,
			EObject astNode, EObject AnnotationToTAnnotation, EObject Annotation) {
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tAnnotable", tAnnotable);
		ruleresult.registerObject("tParam", tParam);
		ruleresult.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		ruleresult.registerObject("mMethodToTDef", mMethodToTDef);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("astNode", astNode);
		ruleresult.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
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
	public boolean isAppropriate_BWD(Match match, TMethodSignature tSignature, TMethodDefinition tAnnotable,
			TParameter tParam, TAnnotation tAnnotation) {

		Object[] result1_black = ParameterAnnotationImpl.pattern_ParameterAnnotation_10_1_initialbindings_blackBBBBBB(
				this, match, tSignature, tAnnotable, tParam, tAnnotation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tAnnotable] = "
					+ tAnnotable + ", " + "[tParam] = " + tParam + ", " + "[tAnnotation] = " + tAnnotation + ".");
		}

		Object[] result2_bindingAndBlack = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_10_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, tSignature, tAnnotable,
						tParam, tAnnotation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSignature] = " + tSignature + ", " + "[tAnnotable] = "
					+ tAnnotable + ", " + "[tParam] = " + tParam + ", " + "[tAnnotation] = " + tAnnotation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterAnnotationImpl.pattern_ParameterAnnotation_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterAnnotationImpl
					.pattern_ParameterAnnotation_10_4_collectelementstobetranslated_blackBBBBB(match, tSignature,
							tAnnotable, tParam, tAnnotation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tAnnotable] = " + tAnnotable + ", " + "[tParam] = "
						+ tParam + ", " + "[tAnnotation] = " + tAnnotation + ".");
			}
			ParameterAnnotationImpl.pattern_ParameterAnnotation_10_4_collectelementstobetranslated_greenBBBFF(match,
					tAnnotable, tAnnotation);
			//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ParameterAnnotationImpl
					.pattern_ParameterAnnotation_10_5_collectcontextelements_blackBBBBB(match, tSignature, tAnnotable,
							tParam, tAnnotation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tAnnotable] = " + tAnnotable + ", " + "[tParam] = "
						+ tParam + ", " + "[tAnnotation] = " + tAnnotation + ".");
			}
			ParameterAnnotationImpl.pattern_ParameterAnnotation_10_5_collectcontextelements_greenBBBBFFF(match,
					tSignature, tAnnotable, tParam);
			//nothing EMoflonEdge tSignature__tParam____parameters = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tSignature__tAnnotable____definitions = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tAnnotable__tSignature____signature = (EMoflonEdge) result5_green[6];

			// 
			ParameterAnnotationImpl.pattern_ParameterAnnotation_10_6_registerobjectstomatch_expressionBBBBBB(this,
					match, tSignature, tAnnotable, tParam, tAnnotation);
			return ParameterAnnotationImpl.pattern_ParameterAnnotation_10_7_expressionF();
		} else {
			return ParameterAnnotationImpl.pattern_ParameterAnnotation_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MMethodDefinition method = (MMethodDefinition) result1_bindingAndBlack[0];
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[1];
		TMethodDefinition tAnnotable = (TMethodDefinition) result1_bindingAndBlack[2];
		TParameter tParam = (TParameter) result1_bindingAndBlack[3];
		ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result1_bindingAndBlack[4];
		MDefinitionToTMember mMethodToTDef = (MDefinitionToTMember) result1_bindingAndBlack[5];
		TAnnotation tAnnotation = (TAnnotation) result1_bindingAndBlack[6];
		MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_11_1_performtransformation_greenBBFF(tAnnotation, astNode);
		AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result1_green[2];
		Annotation Annotation = (Annotation) result1_green[3];

		Object[] result2_black = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_11_2_collecttranslatedelements_blackBBB(tAnnotation,
						AnnotationToTAnnotation, Annotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[AnnotationToTAnnotation] = " + AnnotationToTAnnotation + ", " + "[Annotation] = "
					+ Annotation + ".");
		}
		Object[] result2_green = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_11_2_collecttranslatedelements_greenFBBB(tAnnotation,
						AnnotationToTAnnotation, Annotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, method, tSignature,
						tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode,
						AnnotationToTAnnotation, Annotation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[method] = " + method + ", " + "[tSignature] = " + tSignature + ", " + "[tAnnotable] = "
					+ tAnnotable + ", " + "[tParam] = " + tParam + ", " + "[aSTNodeToTAnnotable] = "
					+ aSTNodeToTAnnotable + ", " + "[mMethodToTDef] = " + mMethodToTDef + ", " + "[tAnnotation] = "
					+ tAnnotation + ", " + "[astNode] = " + astNode + ", " + "[AnnotationToTAnnotation] = "
					+ AnnotationToTAnnotation + ", " + "[Annotation] = " + Annotation + ".");
		}
		ParameterAnnotationImpl.pattern_ParameterAnnotation_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				tAnnotable, tAnnotation, astNode, AnnotationToTAnnotation, Annotation);
		//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge astNode__Annotation____annotations = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge AnnotationToTAnnotation__tAnnotation____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge AnnotationToTAnnotation__Annotation____source = (EMoflonEdge) result3_green[10];

		// 
		// 
		ParameterAnnotationImpl.pattern_ParameterAnnotation_11_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, tAnnotation,
				astNode, AnnotationToTAnnotation, Annotation);
		return ParameterAnnotationImpl.pattern_ParameterAnnotation_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMethodSignature tSignature = (TMethodSignature) result2_binding[0];
		TMethodDefinition tAnnotable = (TMethodDefinition) result2_binding[1];
		TParameter tParam = (TParameter) result2_binding[2];
		TAnnotation tAnnotation = (TAnnotation) result2_binding[3];
		for (Object[] result2_black : ParameterAnnotationImpl.pattern_ParameterAnnotation_12_2_corematch_blackFBBBFFBFB(
				tSignature, tAnnotable, tParam, tAnnotation, match)) {
			MMethodDefinition method = (MMethodDefinition) result2_black[0];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result2_black[4];
			MDefinitionToTMember mMethodToTDef = (MDefinitionToTMember) result2_black[5];
			MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) result2_black[7];
			// ForEach 
			for (Object[] result3_black : ParameterAnnotationImpl
					.pattern_ParameterAnnotation_12_3_findcontext_blackBBBBBBBB(method, tSignature, tAnnotable, tParam,
							aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode)) {
				Object[] result3_green = ParameterAnnotationImpl
						.pattern_ParameterAnnotation_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFF(method, tSignature,
								tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge tSignature__tParam____parameters = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mMethodToTDef__method____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mMethodToTDef__tAnnotable____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tAnnotation__tAnnotable____tAnnotated = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tAnnotable__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge aSTNodeToTAnnotable__astNode____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge aSTNodeToTAnnotable__tParam____target = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge method__astNode____parameters = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge astNode__method____methodDeclaration = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tSignature__tAnnotable____definitions = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tAnnotable__tSignature____signature = (EMoflonEdge) result3_green[19];

				Object[] result4_bindingAndBlack = ParameterAnnotationImpl
						.pattern_ParameterAnnotation_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, tAnnotation,
								astNode);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tAnnotable] = " + tAnnotable + ", "
							+ "[tParam] = " + tParam + ", " + "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable + ", "
							+ "[mMethodToTDef] = " + mMethodToTDef + ", " + "[tAnnotation] = " + tAnnotation + ", "
							+ "[astNode] = " + astNode + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ParameterAnnotationImpl.pattern_ParameterAnnotation_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ParameterAnnotationImpl
							.pattern_ParameterAnnotation_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ParameterAnnotationImpl.pattern_ParameterAnnotation_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterAnnotationImpl.pattern_ParameterAnnotation_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMethodSignature tSignature, TMethodDefinition tAnnotable,
			TParameter tParam, TAnnotation tAnnotation) {
		match.registerObject("tSignature", tSignature);
		match.registerObject("tAnnotable", tAnnotable);
		match.registerObject("tParam", tParam);
		match.registerObject("tAnnotation", tAnnotation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMethodSignature tSignature, TMethodDefinition tAnnotable,
			TParameter tParam, TAnnotation tAnnotation) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodDefinition method,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef, TAnnotation tAnnotation,
			MSingleVariableDeclaration astNode) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("tParam", tParam);
		isApplicableMatch.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		isApplicableMatch.registerObject("mMethodToTDef", mMethodToTDef);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject method, EObject tSignature,
			EObject tAnnotable, EObject tParam, EObject aSTNodeToTAnnotable, EObject mMethodToTDef, EObject tAnnotation,
			EObject astNode, EObject AnnotationToTAnnotation, EObject Annotation) {
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tAnnotable", tAnnotable);
		ruleresult.registerObject("tParam", tParam);
		ruleresult.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		ruleresult.registerObject("mMethodToTDef", mMethodToTDef);
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("astNode", astNode);
		ruleresult.registerObject("AnnotationToTAnnotation", AnnotationToTAnnotation);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_69(EMoflonEdge _edge_tAnnotated) {

		Object[] result1_bindingAndBlack = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterAnnotationImpl.pattern_ParameterAnnotation_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterAnnotationImpl
				.pattern_ParameterAnnotation_20_2_testcorematchandDECs_blackFFFFB(_edge_tAnnotated)) {
			TMethodSignature tSignature = (TMethodSignature) result2_black[0];
			TMethodDefinition tAnnotable = (TMethodDefinition) result2_black[1];
			TParameter tParam = (TParameter) result2_black[2];
			TAnnotation tAnnotation = (TAnnotation) result2_black[3];
			Object[] result2_green = ParameterAnnotationImpl
					.pattern_ParameterAnnotation_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterAnnotationImpl
					.pattern_ParameterAnnotation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, tSignature, tAnnotable, tParam, tAnnotation)) {
				// 
				if (ParameterAnnotationImpl
						.pattern_ParameterAnnotation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterAnnotationImpl
							.pattern_ParameterAnnotation_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterAnnotationImpl.pattern_ParameterAnnotation_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterAnnotationImpl.pattern_ParameterAnnotation_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_74(EMoflonEdge _edge_annotations) {

		Object[] result1_bindingAndBlack = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterAnnotationImpl.pattern_ParameterAnnotation_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterAnnotationImpl
				.pattern_ParameterAnnotation_21_2_testcorematchandDECs_blackFFFB(_edge_annotations)) {
			MMethodDefinition method = (MMethodDefinition) result2_black[0];
			MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) result2_black[1];
			Annotation Annotation = (Annotation) result2_black[2];
			Object[] result2_green = ParameterAnnotationImpl
					.pattern_ParameterAnnotation_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterAnnotationImpl
					.pattern_ParameterAnnotation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, method, astNode, Annotation)) {
				// 
				if (ParameterAnnotationImpl
						.pattern_ParameterAnnotation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterAnnotationImpl
							.pattern_ParameterAnnotation_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterAnnotationImpl.pattern_ParameterAnnotation_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterAnnotationImpl.pattern_ParameterAnnotation_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParameterAnnotation");
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
		ruleResult.setRule("ParameterAnnotation");
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

		Object[] result1_black = ParameterAnnotationImpl.pattern_ParameterAnnotation_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterAnnotationImpl.pattern_ParameterAnnotation_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MMethodDefinition method = (MMethodDefinition) result2_bindingAndBlack[0];
		TMethodSignature tSignature = (TMethodSignature) result2_bindingAndBlack[1];
		TMethodDefinition tAnnotable = (TMethodDefinition) result2_bindingAndBlack[2];
		TParameter tParam = (TParameter) result2_bindingAndBlack[3];
		TAnnotation tAnnotation = (TAnnotation) result2_bindingAndBlack[4];
		MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) result2_bindingAndBlack[5];
		Annotation Annotation = (Annotation) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, method, tSignature,
						tAnnotable, tParam, tAnnotation, astNode, Annotation, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[method] = " + method + ", " + "[tSignature] = " + tSignature + ", " + "[tAnnotable] = "
					+ tAnnotable + ", " + "[tParam] = " + tParam + ", " + "[tAnnotation] = " + tAnnotation + ", "
					+ "[astNode] = " + astNode + ", " + "[Annotation] = " + Annotation + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ParameterAnnotationImpl.pattern_ParameterAnnotation_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ParameterAnnotationImpl
					.pattern_ParameterAnnotation_24_5_matchcorrcontext_blackBBBFFBBB(method, tAnnotable, tParam,
							astNode, sourceMatch, targetMatch)) {
				ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result5_black[3];
				MDefinitionToTMember mMethodToTDef = (MDefinitionToTMember) result5_black[4];
				Object[] result5_green = ParameterAnnotationImpl
						.pattern_ParameterAnnotation_24_5_matchcorrcontext_greenBBBBF(aSTNodeToTAnnotable,
								mMethodToTDef, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ParameterAnnotationImpl
						.pattern_ParameterAnnotation_24_6_createcorrespondence_blackBBBBBBBB(method, tSignature,
								tAnnotable, tParam, tAnnotation, astNode, Annotation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
							+ ", " + "[tSignature] = " + tSignature + ", " + "[tAnnotable] = " + tAnnotable + ", "
							+ "[tParam] = " + tParam + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[astNode] = "
							+ astNode + ", " + "[Annotation] = " + Annotation + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ParameterAnnotationImpl.pattern_ParameterAnnotation_24_6_createcorrespondence_greenBFBB(tAnnotation,
						Annotation, ccMatch);
				//nothing AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result6_green[1];

				Object[] result7_black = ParameterAnnotationImpl
						.pattern_ParameterAnnotation_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ParameterAnnotationImpl.pattern_ParameterAnnotation_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ParameterAnnotationImpl.pattern_ParameterAnnotation_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MMethodDefinition method, TMethodSignature tSignature,
			TMethodDefinition tAnnotable, TParameter tParam, TAnnotation tAnnotation,
			MSingleVariableDeclaration astNode, Annotation Annotation, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MMethodDefinition method, MSingleVariableDeclaration astNode, Annotation Annotation) {// 
		Object[] result1_black = ParameterAnnotationImpl
				.pattern_ParameterAnnotation_27_1_matchtggpattern_blackBBB(method, astNode, Annotation);
		if (result1_black != null) {
			return ParameterAnnotationImpl.pattern_ParameterAnnotation_27_2_expressionF();
		} else {
			return ParameterAnnotationImpl.pattern_ParameterAnnotation_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			TAnnotation tAnnotation) {// 
		Object[] result1_black = ParameterAnnotationImpl.pattern_ParameterAnnotation_28_1_matchtggpattern_blackBBBB(
				tSignature, tAnnotable, tParam, tAnnotation);
		if (result1_black != null) {
			return ParameterAnnotationImpl.pattern_ParameterAnnotation_28_2_expressionF();
		} else {
			return ParameterAnnotationImpl.pattern_ParameterAnnotation_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNodeToTAnnotatable aSTNodeToTAnnotableParameter) {

		Object[] result1_black = ParameterAnnotationImpl.pattern_ParameterAnnotation_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterAnnotationImpl.pattern_ParameterAnnotation_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ParameterAnnotationImpl
				.pattern_ParameterAnnotation_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList aSTNodeToTAnnotableList = (RuleEntryList) result2_black[0];
			MMethodDefinition method = (MMethodDefinition) result2_black[1];
			MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) result2_black[2];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result2_black[3];
			TParameter tParam = (TParameter) result2_black[4];
			TMethodSignature tSignature = (TMethodSignature) result2_black[5];
			TMethodDefinition tAnnotable = (TMethodDefinition) result2_black[6];
			MDefinitionToTMember mMethodToTDef = (MDefinitionToTMember) result2_black[7];

			Object[] result3_bindingAndBlack = ParameterAnnotationImpl
					.pattern_ParameterAnnotation_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
							method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, astNode,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
						+ "[tSignature] = " + tSignature + ", " + "[tAnnotable] = " + tAnnotable + ", " + "[tParam] = "
						+ tParam + ", " + "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable + ", " + "[mMethodToTDef] = "
						+ mMethodToTDef + ", " + "[astNode] = " + astNode + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ParameterAnnotationImpl.pattern_ParameterAnnotation_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ParameterAnnotationImpl
						.pattern_ParameterAnnotation_29_5_checknacs_blackBBBBBBB(method, tSignature, tAnnotable, tParam,
								aSTNodeToTAnnotable, mMethodToTDef, astNode);
				if (result5_black != null) {

					Object[] result6_black = ParameterAnnotationImpl
							.pattern_ParameterAnnotation_29_6_perform_blackBBBBBBBB(method, tSignature, tAnnotable,
									tParam, aSTNodeToTAnnotable, mMethodToTDef, astNode, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
								+ ", " + "[tSignature] = " + tSignature + ", " + "[tAnnotable] = " + tAnnotable + ", "
								+ "[tParam] = " + tParam + ", " + "[aSTNodeToTAnnotable] = " + aSTNodeToTAnnotable
								+ ", " + "[mMethodToTDef] = " + mMethodToTDef + ", " + "[astNode] = " + astNode + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ParameterAnnotationImpl.pattern_ParameterAnnotation_29_6_perform_greenBFBFFB(tAnnotable, astNode,
							ruleResult);
					//nothing TAnnotation tAnnotation = (TAnnotation) result6_green[1];
					//nothing AnnotationToTAnnotation AnnotationToTAnnotation = (AnnotationToTAnnotation) result6_green[3];
					//nothing Annotation Annotation = (Annotation) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return ParameterAnnotationImpl.pattern_ParameterAnnotation_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MMethodDefinition method,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef,
			MSingleVariableDeclaration astNode, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tAnnotable", tAnnotable);
		isApplicableMatch.registerObject("tParam", tParam);
		isApplicableMatch.registerObject("aSTNodeToTAnnotable", aSTNodeToTAnnotable);
		isApplicableMatch.registerObject("mMethodToTDef", mMethodToTDef);
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
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPROPRIATE_FWD__MATCH_MMETHODDEFINITION_MSINGLEVARIABLEDECLARATION_ANNOTATION:
				return isAppropriate_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
						(MSingleVariableDeclaration) arguments.get(2), (Annotation) arguments.get(3));
			case RulesPackage.PARAMETER_ANNOTATION___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODDEFINITION_MSINGLEVARIABLEDECLARATION_ANNOTATION:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
						(MSingleVariableDeclaration) arguments.get(2), (Annotation) arguments.get(3));
				return null;
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODDEFINITION_MSINGLEVARIABLEDECLARATION_ANNOTATION:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
						(MSingleVariableDeclaration) arguments.get(2), (Annotation) arguments.get(3));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_TMETHODSIGNATURE_TMETHODDEFINITION_TPARAMETER_ASTNODETOTANNOTATABLE_MDEFINITIONTOTMEMBER_MSINGLEVARIABLEDECLARATION_ANNOTATION:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(MMethodDefinition) arguments.get(1), (TMethodSignature) arguments.get(2),
						(TMethodDefinition) arguments.get(3), (TParameter) arguments.get(4),
						(ASTNodeToTAnnotatable) arguments.get(5), (MDefinitionToTMember) arguments.get(6),
						(MSingleVariableDeclaration) arguments.get(7), (Annotation) arguments.get(8));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
				return null;
			case RulesPackage.PARAMETER_ANNOTATION___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPROPRIATE_BWD__MATCH_TMETHODSIGNATURE_TMETHODDEFINITION_TPARAMETER_TANNOTATION:
				return isAppropriate_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
						(TMethodDefinition) arguments.get(2), (TParameter) arguments.get(3),
						(TAnnotation) arguments.get(4));
			case RulesPackage.PARAMETER_ANNOTATION___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMETHODSIGNATURE_TMETHODDEFINITION_TPARAMETER_TANNOTATION:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
						(TMethodDefinition) arguments.get(2), (TParameter) arguments.get(3),
						(TAnnotation) arguments.get(4));
				return null;
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMETHODSIGNATURE_TMETHODDEFINITION_TPARAMETER_TANNOTATION:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMethodSignature) arguments.get(1),
						(TMethodDefinition) arguments.get(2), (TParameter) arguments.get(3),
						(TAnnotation) arguments.get(4));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_TMETHODSIGNATURE_TMETHODDEFINITION_TPARAMETER_ASTNODETOTANNOTATABLE_MDEFINITIONTOTMEMBER_TANNOTATION_MSINGLEVARIABLEDECLARATION:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MMethodDefinition) arguments.get(1), (TMethodSignature) arguments.get(2),
						(TMethodDefinition) arguments.get(3), (TParameter) arguments.get(4),
						(ASTNodeToTAnnotatable) arguments.get(5), (MDefinitionToTMember) arguments.get(6),
						(TAnnotation) arguments.get(7), (MSingleVariableDeclaration) arguments.get(8));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
				return null;
			case RulesPackage.PARAMETER_ANNOTATION___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_69__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_69((EMoflonEdge) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_74__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_74((EMoflonEdge) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPLICABLE_SOLVE_CSP_CC__MMETHODDEFINITION_TMETHODSIGNATURE_TMETHODDEFINITION_TPARAMETER_TANNOTATION_MSINGLEVARIABLEDECLARATION_ANNOTATION_MATCH_MATCH:
				return isApplicable_solveCsp_CC((MMethodDefinition) arguments.get(0),
						(TMethodSignature) arguments.get(1), (TMethodDefinition) arguments.get(2),
						(TParameter) arguments.get(3), (TAnnotation) arguments.get(4),
						(MSingleVariableDeclaration) arguments.get(5), (Annotation) arguments.get(6),
						(Match) arguments.get(7), (Match) arguments.get(8));
			case RulesPackage.PARAMETER_ANNOTATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.PARAMETER_ANNOTATION___CHECK_DEC_FWD__MMETHODDEFINITION_MSINGLEVARIABLEDECLARATION_ANNOTATION:
				return checkDEC_FWD((MMethodDefinition) arguments.get(0), (MSingleVariableDeclaration) arguments.get(1),
						(Annotation) arguments.get(2));
			case RulesPackage.PARAMETER_ANNOTATION___CHECK_DEC_BWD__TMETHODSIGNATURE_TMETHODDEFINITION_TPARAMETER_TANNOTATION:
				return checkDEC_BWD((TMethodSignature) arguments.get(0), (TMethodDefinition) arguments.get(1),
						(TParameter) arguments.get(2), (TAnnotation) arguments.get(3));
			case RulesPackage.PARAMETER_ANNOTATION___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODETOTANNOTATABLE:
				return generateModel((RuleEntryContainer) arguments.get(0), (ASTNodeToTAnnotatable) arguments.get(1));
			case RulesPackage.PARAMETER_ANNOTATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MMETHODDEFINITION_TMETHODSIGNATURE_TMETHODDEFINITION_TPARAMETER_ASTNODETOTANNOTATABLE_MDEFINITIONTOTMEMBER_MSINGLEVARIABLEDECLARATION_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MMethodDefinition) arguments.get(1), (TMethodSignature) arguments.get(2),
						(TMethodDefinition) arguments.get(3), (TParameter) arguments.get(4),
						(ASTNodeToTAnnotatable) arguments.get(5), (MDefinitionToTMember) arguments.get(6),
						(MSingleVariableDeclaration) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
			case RulesPackage.PARAMETER_ANNOTATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterAnnotation_0_1_initialbindings_blackBBBBB(ParameterAnnotation _this,
			Match match, MMethodDefinition method, MSingleVariableDeclaration astNode, Annotation annotation) {
		return new Object[] { _this, match, method, astNode, annotation };
	}

	public static final Object[] pattern_ParameterAnnotation_0_2_SolveCSP_bindingFBBBBB(ParameterAnnotation _this,
			Match match, MMethodDefinition method, MSingleVariableDeclaration astNode, Annotation annotation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, method, astNode, annotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, method, astNode, annotation };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterAnnotation_0_2_SolveCSP_bindingAndBlackFBBBBB(
			ParameterAnnotation _this, Match match, MMethodDefinition method, MSingleVariableDeclaration astNode,
			Annotation annotation) {
		Object[] result_pattern_ParameterAnnotation_0_2_SolveCSP_binding = pattern_ParameterAnnotation_0_2_SolveCSP_bindingFBBBBB(
				_this, match, method, astNode, annotation);
		if (result_pattern_ParameterAnnotation_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterAnnotation_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterAnnotation_0_2_SolveCSP_black = pattern_ParameterAnnotation_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterAnnotation_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, method, astNode, annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterAnnotation_0_3_CheckCSP_expressionFBB(ParameterAnnotation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_0_4_collectelementstobetranslated_blackBBBB(Match match,
			MMethodDefinition method, MSingleVariableDeclaration astNode, Annotation annotation) {
		return new Object[] { match, method, astNode, annotation };
	}

	public static final Object[] pattern_ParameterAnnotation_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MSingleVariableDeclaration astNode, Annotation annotation) {
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(annotation);
		String astNode__Annotation____annotations_name_prime = "annotations";
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		match.getToBeTranslatedEdges().add(astNode__Annotation____annotations);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		return new Object[] { match, astNode, annotation, astNode__Annotation____annotations };
	}

	public static final Object[] pattern_ParameterAnnotation_0_5_collectcontextelements_blackBBBB(Match match,
			MMethodDefinition method, MSingleVariableDeclaration astNode, Annotation annotation) {
		return new Object[] { match, method, astNode, annotation };
	}

	public static final Object[] pattern_ParameterAnnotation_0_5_collectcontextelements_greenBBBFF(Match match,
			MMethodDefinition method, MSingleVariableDeclaration astNode) {
		EMoflonEdge method__astNode____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(method);
		match.getContextNodes().add(astNode);
		String method__astNode____parameters_name_prime = "parameters";
		String astNode__method____methodDeclaration_name_prime = "methodDeclaration";
		method__astNode____parameters.setSrc(method);
		method__astNode____parameters.setTrg(astNode);
		match.getContextEdges().add(method__astNode____parameters);
		astNode__method____methodDeclaration.setSrc(astNode);
		astNode__method____methodDeclaration.setTrg(method);
		match.getContextEdges().add(astNode__method____methodDeclaration);
		method__astNode____parameters.setName(method__astNode____parameters_name_prime);
		astNode__method____methodDeclaration.setName(astNode__method____methodDeclaration_name_prime);
		return new Object[] { match, method, astNode, method__astNode____parameters,
				astNode__method____methodDeclaration };
	}

	public static final void pattern_ParameterAnnotation_0_6_registerobjectstomatch_expressionBBBBB(
			ParameterAnnotation _this, Match match, MMethodDefinition method, MSingleVariableDeclaration astNode,
			Annotation annotation) {
		_this.registerObjectsToMatch_FWD(match, method, astNode, annotation);

	}

	public static final boolean pattern_ParameterAnnotation_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterAnnotation_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAnnotable");
		EObject _localVariable_3 = isApplicableMatch.getObject("tParam");
		EObject _localVariable_4 = isApplicableMatch.getObject("aSTNodeToTAnnotable");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMethodToTDef");
		EObject _localVariable_6 = isApplicableMatch.getObject("astNode");
		EObject _localVariable_7 = isApplicableMatch.getObject("Annotation");
		EObject tmpMethod = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTAnnotable = _localVariable_2;
		EObject tmpTParam = _localVariable_3;
		EObject tmpASTNodeToTAnnotable = _localVariable_4;
		EObject tmpMMethodToTDef = _localVariable_5;
		EObject tmpAstNode = _localVariable_6;
		EObject tmpAnnotation = _localVariable_7;
		if (tmpMethod instanceof MMethodDefinition) {
			MMethodDefinition method = (MMethodDefinition) tmpMethod;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpTAnnotable instanceof TMethodDefinition) {
					TMethodDefinition tAnnotable = (TMethodDefinition) tmpTAnnotable;
					if (tmpTParam instanceof TParameter) {
						TParameter tParam = (TParameter) tmpTParam;
						if (tmpASTNodeToTAnnotable instanceof ASTNodeToTAnnotatable) {
							ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) tmpASTNodeToTAnnotable;
							if (tmpMMethodToTDef instanceof MDefinitionToTMember) {
								MDefinitionToTMember mMethodToTDef = (MDefinitionToTMember) tmpMMethodToTDef;
								if (tmpAstNode instanceof MSingleVariableDeclaration) {
									MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) tmpAstNode;
									if (tmpAnnotation instanceof Annotation) {
										Annotation annotation = (Annotation) tmpAnnotation;
										return new Object[] { method, tSignature, tAnnotable, tParam,
												aSTNodeToTAnnotable, mMethodToTDef, astNode, annotation,
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

	public static final Object[] pattern_ParameterAnnotation_1_1_performtransformation_blackBBBBBBBBFBB(
			MMethodDefinition method, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef,
			MSingleVariableDeclaration astNode, Annotation annotation, ParameterAnnotation _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef,
						astNode, annotation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ParameterAnnotation _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterAnnotation_1_1_performtransformation_binding = pattern_ParameterAnnotation_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParameterAnnotation_1_1_performtransformation_binding != null) {
			MMethodDefinition method = (MMethodDefinition) result_pattern_ParameterAnnotation_1_1_performtransformation_binding[0];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_ParameterAnnotation_1_1_performtransformation_binding[1];
			TMethodDefinition tAnnotable = (TMethodDefinition) result_pattern_ParameterAnnotation_1_1_performtransformation_binding[2];
			TParameter tParam = (TParameter) result_pattern_ParameterAnnotation_1_1_performtransformation_binding[3];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result_pattern_ParameterAnnotation_1_1_performtransformation_binding[4];
			MDefinitionToTMember mMethodToTDef = (MDefinitionToTMember) result_pattern_ParameterAnnotation_1_1_performtransformation_binding[5];
			MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) result_pattern_ParameterAnnotation_1_1_performtransformation_binding[6];
			Annotation annotation = (Annotation) result_pattern_ParameterAnnotation_1_1_performtransformation_binding[7];

			Object[] result_pattern_ParameterAnnotation_1_1_performtransformation_black = pattern_ParameterAnnotation_1_1_performtransformation_blackBBBBBBBBFBB(
					method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, astNode, annotation,
					_this, isApplicableMatch);
			if (result_pattern_ParameterAnnotation_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ParameterAnnotation_1_1_performtransformation_black[8];

				return new Object[] { method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef,
						astNode, annotation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_1_1_performtransformation_greenBFFB(
			TMethodDefinition tAnnotable, Annotation annotation) {
		TAnnotation tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		tAnnotation.setTAnnotated(tAnnotable);
		annotationToTAnnotation.setTarget(tAnnotation);
		annotationToTAnnotation.setSource(annotation);
		return new Object[] { tAnnotable, tAnnotation, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_ParameterAnnotation_1_2_collecttranslatedelements_blackBBB(
			TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation, Annotation annotation) {
		return new Object[] { tAnnotation, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_ParameterAnnotation_1_2_collecttranslatedelements_greenFBBB(
			TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation, Annotation annotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tAnnotation);
		ruleresult.getCreatedLinkElements().add(annotationToTAnnotation);
		ruleresult.getTranslatedElements().add(annotation);
		return new Object[] { ruleresult, tAnnotation, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_ParameterAnnotation_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject method, EObject tSignature, EObject tAnnotable, EObject tParam,
			EObject aSTNodeToTAnnotable, EObject mMethodToTDef, EObject tAnnotation, EObject astNode,
			EObject annotationToTAnnotation, EObject annotation) {
		if (!method.equals(tSignature)) {
			if (!method.equals(tAnnotable)) {
				if (!method.equals(tParam)) {
					if (!method.equals(tAnnotation)) {
						if (!tAnnotable.equals(tSignature)) {
							if (!tAnnotable.equals(tParam)) {
								if (!tAnnotable.equals(tAnnotation)) {
									if (!tParam.equals(tSignature)) {
										if (!aSTNodeToTAnnotable.equals(method)) {
											if (!aSTNodeToTAnnotable.equals(tSignature)) {
												if (!aSTNodeToTAnnotable.equals(tAnnotable)) {
													if (!aSTNodeToTAnnotable.equals(tParam)) {
														if (!aSTNodeToTAnnotable.equals(mMethodToTDef)) {
															if (!aSTNodeToTAnnotable.equals(tAnnotation)) {
																if (!aSTNodeToTAnnotable.equals(astNode)) {
																	if (!mMethodToTDef.equals(method)) {
																		if (!mMethodToTDef.equals(tSignature)) {
																			if (!mMethodToTDef.equals(tAnnotable)) {
																				if (!mMethodToTDef.equals(tParam)) {
																					if (!mMethodToTDef
																							.equals(tAnnotation)) {
																						if (!tAnnotation
																								.equals(tSignature)) {
																							if (!tAnnotation
																									.equals(tParam)) {
																								if (!astNode.equals(
																										method)) {
																									if (!astNode.equals(
																											tSignature)) {
																										if (!astNode
																												.equals(tAnnotable)) {
																											if (!astNode
																													.equals(tParam)) {
																												if (!astNode
																														.equals(mMethodToTDef)) {
																													if (!astNode
																															.equals(tAnnotation)) {
																														if (!annotationToTAnnotation
																																.equals(method)) {
																															if (!annotationToTAnnotation
																																	.equals(tSignature)) {
																																if (!annotationToTAnnotation
																																		.equals(tAnnotable)) {
																																	if (!annotationToTAnnotation
																																			.equals(tParam)) {
																																		if (!annotationToTAnnotation
																																				.equals(aSTNodeToTAnnotable)) {
																																			if (!annotationToTAnnotation
																																					.equals(mMethodToTDef)) {
																																				if (!annotationToTAnnotation
																																						.equals(tAnnotation)) {
																																					if (!annotationToTAnnotation
																																							.equals(astNode)) {
																																						if (!annotation
																																								.equals(method)) {
																																							if (!annotation
																																									.equals(tSignature)) {
																																								if (!annotation
																																										.equals(tAnnotable)) {
																																									if (!annotation
																																											.equals(tParam)) {
																																										if (!annotation
																																												.equals(aSTNodeToTAnnotable)) {
																																											if (!annotation
																																													.equals(mMethodToTDef)) {
																																												if (!annotation
																																														.equals(tAnnotation)) {
																																													if (!annotation
																																															.equals(astNode)) {
																																														if (!annotation
																																																.equals(annotationToTAnnotation)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	method,
																																																	tSignature,
																																																	tAnnotable,
																																																	tParam,
																																																	aSTNodeToTAnnotable,
																																																	mMethodToTDef,
																																																	tAnnotation,
																																																	astNode,
																																																	annotationToTAnnotation,
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
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterAnnotation_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tAnnotable, EObject tAnnotation, EObject astNode,
			EObject annotationToTAnnotation, EObject annotation) {
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterAnnotation";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String astNode__Annotation____annotations_name_prime = "annotations";
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String annotationToTAnnotation__Annotation____source_name_prime = "source";
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		ruleresult.getCreatedEdges().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tAnnotable__tAnnotation____tAnnotation);
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		ruleresult.getTranslatedEdges().add(astNode__Annotation____annotations);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__tAnnotation____target);
		annotationToTAnnotation__Annotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__Annotation____source.setTrg(annotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__Annotation____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		annotationToTAnnotation__Annotation____source.setName(annotationToTAnnotation__Annotation____source_name_prime);
		return new Object[] { ruleresult, tAnnotable, tAnnotation, astNode, annotationToTAnnotation, annotation,
				tAnnotation__tAnnotable____tAnnotated, tAnnotable__tAnnotation____tAnnotation,
				astNode__Annotation____annotations, annotationToTAnnotation__tAnnotation____target,
				annotationToTAnnotation__Annotation____source };
	}

	public static final void pattern_ParameterAnnotation_1_5_registerobjects_expressionBBBBBBBBBBBB(
			ParameterAnnotation _this, PerformRuleResult ruleresult, EObject method, EObject tSignature,
			EObject tAnnotable, EObject tParam, EObject aSTNodeToTAnnotable, EObject mMethodToTDef, EObject tAnnotation,
			EObject astNode, EObject annotationToTAnnotation, EObject annotation) {
		_this.registerObjects_FWD(ruleresult, method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable,
				mMethodToTDef, tAnnotation, astNode, annotationToTAnnotation, annotation);

	}

	public static final PerformRuleResult pattern_ParameterAnnotation_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_2_1_preparereturnvalue_bindingFB(
			ParameterAnnotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ParameterAnnotation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_2_1_preparereturnvalue_bindingAndBlackFFB(
			ParameterAnnotation _this) {
		Object[] result_pattern_ParameterAnnotation_2_1_preparereturnvalue_binding = pattern_ParameterAnnotation_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterAnnotation_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterAnnotation_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterAnnotation_2_1_preparereturnvalue_black = pattern_ParameterAnnotation_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterAnnotation_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterAnnotation_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ParameterAnnotation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterAnnotation_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("method");
		EObject _localVariable_1 = match.getObject("astNode");
		EObject _localVariable_2 = match.getObject("Annotation");
		EObject tmpMethod = _localVariable_0;
		EObject tmpAstNode = _localVariable_1;
		EObject tmpAnnotation = _localVariable_2;
		if (tmpMethod instanceof MMethodDefinition) {
			MMethodDefinition method = (MMethodDefinition) tmpMethod;
			if (tmpAstNode instanceof MSingleVariableDeclaration) {
				MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) tmpAstNode;
				if (tmpAnnotation instanceof Annotation) {
					Annotation annotation = (Annotation) tmpAnnotation;
					return new Object[] { method, astNode, annotation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterAnnotation_2_2_corematch_blackBFFFFBBB(
			MMethodDefinition method, MSingleVariableDeclaration astNode, Annotation annotation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMethodToTDef : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(method, MDefinitionToTMember.class, "source")) {
			TMember tmpTAnnotable = mMethodToTDef.getTarget();
			if (tmpTAnnotable instanceof TMethodDefinition) {
				TMethodDefinition tAnnotable = (TMethodDefinition) tmpTAnnotable;
				for (ASTNodeToTAnnotatable aSTNodeToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(astNode, ASTNodeToTAnnotatable.class, "source")) {
					TAnnotatable tmpTParam = aSTNodeToTAnnotable.getTarget();
					if (tmpTParam instanceof TParameter) {
						TParameter tParam = (TParameter) tmpTParam;
						_result.add(new Object[] { method, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef,
								astNode, annotation, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterAnnotation_2_3_findcontext_blackBFBBBBBB(
			MMethodDefinition method, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef,
			MSingleVariableDeclaration astNode, Annotation annotation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (method.equals(mMethodToTDef.getSource())) {
			if (tAnnotable.equals(mMethodToTDef.getTarget())) {
				if (astNode.getAnnotations().contains(annotation)) {
					if (astNode.equals(aSTNodeToTAnnotable.getSource())) {
						if (tParam.equals(aSTNodeToTAnnotable.getTarget())) {
							if (method.getParameters().contains(astNode)) {
								TSignature tmpTSignature = tAnnotable.getSignature();
								if (tmpTSignature instanceof TMethodSignature) {
									TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
									if (tSignature.getParameters().contains(tParam)) {
										_result.add(new Object[] { method, tSignature, tAnnotable, tParam,
												aSTNodeToTAnnotable, mMethodToTDef, astNode, annotation });
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

	public static final Object[] pattern_ParameterAnnotation_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			MMethodDefinition method, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef,
			MSingleVariableDeclaration astNode, Annotation annotation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tSignature__tParam____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTDef__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTDef__tAnnotable____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge aSTNodeToTAnnotable__astNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge aSTNodeToTAnnotable__tParam____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__astNode____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAnnotable____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSignature__tParam____parameters_name_prime = "parameters";
		String mMethodToTDef__method____source_name_prime = "source";
		String mMethodToTDef__tAnnotable____target_name_prime = "target";
		String astNode__Annotation____annotations_name_prime = "annotations";
		String aSTNodeToTAnnotable__astNode____source_name_prime = "source";
		String aSTNodeToTAnnotable__tParam____target_name_prime = "target";
		String method__astNode____parameters_name_prime = "parameters";
		String astNode__method____methodDeclaration_name_prime = "methodDeclaration";
		String tSignature__tAnnotable____definitions_name_prime = "definitions";
		String tAnnotable__tSignature____signature_name_prime = "signature";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tAnnotable);
		isApplicableMatch.getAllContextElements().add(tParam);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable);
		isApplicableMatch.getAllContextElements().add(mMethodToTDef);
		isApplicableMatch.getAllContextElements().add(astNode);
		isApplicableMatch.getAllContextElements().add(annotation);
		tSignature__tParam____parameters.setSrc(tSignature);
		tSignature__tParam____parameters.setTrg(tParam);
		isApplicableMatch.getAllContextElements().add(tSignature__tParam____parameters);
		mMethodToTDef__method____source.setSrc(mMethodToTDef);
		mMethodToTDef__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(mMethodToTDef__method____source);
		mMethodToTDef__tAnnotable____target.setSrc(mMethodToTDef);
		mMethodToTDef__tAnnotable____target.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(mMethodToTDef__tAnnotable____target);
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		isApplicableMatch.getAllContextElements().add(astNode__Annotation____annotations);
		aSTNodeToTAnnotable__astNode____source.setSrc(aSTNodeToTAnnotable);
		aSTNodeToTAnnotable__astNode____source.setTrg(astNode);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable__astNode____source);
		aSTNodeToTAnnotable__tParam____target.setSrc(aSTNodeToTAnnotable);
		aSTNodeToTAnnotable__tParam____target.setTrg(tParam);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable__tParam____target);
		method__astNode____parameters.setSrc(method);
		method__astNode____parameters.setTrg(astNode);
		isApplicableMatch.getAllContextElements().add(method__astNode____parameters);
		astNode__method____methodDeclaration.setSrc(astNode);
		astNode__method____methodDeclaration.setTrg(method);
		isApplicableMatch.getAllContextElements().add(astNode__method____methodDeclaration);
		tSignature__tAnnotable____definitions.setSrc(tSignature);
		tSignature__tAnnotable____definitions.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(tSignature__tAnnotable____definitions);
		tAnnotable__tSignature____signature.setSrc(tAnnotable);
		tAnnotable__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tAnnotable__tSignature____signature);
		tSignature__tParam____parameters.setName(tSignature__tParam____parameters_name_prime);
		mMethodToTDef__method____source.setName(mMethodToTDef__method____source_name_prime);
		mMethodToTDef__tAnnotable____target.setName(mMethodToTDef__tAnnotable____target_name_prime);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		aSTNodeToTAnnotable__astNode____source.setName(aSTNodeToTAnnotable__astNode____source_name_prime);
		aSTNodeToTAnnotable__tParam____target.setName(aSTNodeToTAnnotable__tParam____target_name_prime);
		method__astNode____parameters.setName(method__astNode____parameters_name_prime);
		astNode__method____methodDeclaration.setName(astNode__method____methodDeclaration_name_prime);
		tSignature__tAnnotable____definitions.setName(tSignature__tAnnotable____definitions_name_prime);
		tAnnotable__tSignature____signature.setName(tAnnotable__tSignature____signature_name_prime);
		return new Object[] { method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, astNode,
				annotation, isApplicableMatch, tSignature__tParam____parameters, mMethodToTDef__method____source,
				mMethodToTDef__tAnnotable____target, astNode__Annotation____annotations,
				aSTNodeToTAnnotable__astNode____source, aSTNodeToTAnnotable__tParam____target,
				method__astNode____parameters, astNode__method____methodDeclaration,
				tSignature__tAnnotable____definitions, tAnnotable__tSignature____signature };
	}

	public static final Object[] pattern_ParameterAnnotation_2_4_solveCSP_bindingFBBBBBBBBBB(ParameterAnnotation _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition method, TMethodSignature tSignature,
			TMethodDefinition tAnnotable, TParameter tParam, ASTNodeToTAnnotatable aSTNodeToTAnnotable,
			MDefinitionToTMember mMethodToTDef, MSingleVariableDeclaration astNode, Annotation annotation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, method, tSignature, tAnnotable,
				tParam, aSTNodeToTAnnotable, mMethodToTDef, astNode, annotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, tSignature, tAnnotable, tParam,
					aSTNodeToTAnnotable, mMethodToTDef, astNode, annotation };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterAnnotation_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ParameterAnnotation _this, IsApplicableMatch isApplicableMatch, MMethodDefinition method,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef,
			MSingleVariableDeclaration astNode, Annotation annotation) {
		Object[] result_pattern_ParameterAnnotation_2_4_solveCSP_binding = pattern_ParameterAnnotation_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef,
				astNode, annotation);
		if (result_pattern_ParameterAnnotation_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterAnnotation_2_4_solveCSP_binding[0];

			Object[] result_pattern_ParameterAnnotation_2_4_solveCSP_black = pattern_ParameterAnnotation_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterAnnotation_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, tSignature, tAnnotable, tParam,
						aSTNodeToTAnnotable, mMethodToTDef, astNode, annotation };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterAnnotation_2_5_checkCSP_expressionFBB(ParameterAnnotation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterAnnotation_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterAnnotation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterAnnotation_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_10_1_initialbindings_blackBBBBBB(ParameterAnnotation _this,
			Match match, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			TAnnotation tAnnotation) {
		return new Object[] { _this, match, tSignature, tAnnotable, tParam, tAnnotation };
	}

	public static final Object[] pattern_ParameterAnnotation_10_2_SolveCSP_bindingFBBBBBB(ParameterAnnotation _this,
			Match match, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			TAnnotation tAnnotation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSignature, tAnnotable, tParam, tAnnotation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSignature, tAnnotable, tParam, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterAnnotation_10_2_SolveCSP_bindingAndBlackFBBBBBB(
			ParameterAnnotation _this, Match match, TMethodSignature tSignature, TMethodDefinition tAnnotable,
			TParameter tParam, TAnnotation tAnnotation) {
		Object[] result_pattern_ParameterAnnotation_10_2_SolveCSP_binding = pattern_ParameterAnnotation_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, tSignature, tAnnotable, tParam, tAnnotation);
		if (result_pattern_ParameterAnnotation_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterAnnotation_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterAnnotation_10_2_SolveCSP_black = pattern_ParameterAnnotation_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterAnnotation_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSignature, tAnnotable, tParam, tAnnotation };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterAnnotation_10_3_CheckCSP_expressionFBB(ParameterAnnotation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam, TAnnotation tAnnotation) {
		return new Object[] { match, tSignature, tAnnotable, tParam, tAnnotation };
	}

	public static final Object[] pattern_ParameterAnnotation_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TMethodDefinition tAnnotable, TAnnotation tAnnotation) {
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

	public static final Object[] pattern_ParameterAnnotation_10_5_collectcontextelements_blackBBBBB(Match match,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam, TAnnotation tAnnotation) {
		return new Object[] { match, tSignature, tAnnotable, tParam, tAnnotation };
	}

	public static final Object[] pattern_ParameterAnnotation_10_5_collectcontextelements_greenBBBBFFF(Match match,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam) {
		EMoflonEdge tSignature__tParam____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAnnotable____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tSignature);
		match.getContextNodes().add(tAnnotable);
		match.getContextNodes().add(tParam);
		String tSignature__tParam____parameters_name_prime = "parameters";
		String tSignature__tAnnotable____definitions_name_prime = "definitions";
		String tAnnotable__tSignature____signature_name_prime = "signature";
		tSignature__tParam____parameters.setSrc(tSignature);
		tSignature__tParam____parameters.setTrg(tParam);
		match.getContextEdges().add(tSignature__tParam____parameters);
		tSignature__tAnnotable____definitions.setSrc(tSignature);
		tSignature__tAnnotable____definitions.setTrg(tAnnotable);
		match.getContextEdges().add(tSignature__tAnnotable____definitions);
		tAnnotable__tSignature____signature.setSrc(tAnnotable);
		tAnnotable__tSignature____signature.setTrg(tSignature);
		match.getContextEdges().add(tAnnotable__tSignature____signature);
		tSignature__tParam____parameters.setName(tSignature__tParam____parameters_name_prime);
		tSignature__tAnnotable____definitions.setName(tSignature__tAnnotable____definitions_name_prime);
		tAnnotable__tSignature____signature.setName(tAnnotable__tSignature____signature_name_prime);
		return new Object[] { match, tSignature, tAnnotable, tParam, tSignature__tParam____parameters,
				tSignature__tAnnotable____definitions, tAnnotable__tSignature____signature };
	}

	public static final void pattern_ParameterAnnotation_10_6_registerobjectstomatch_expressionBBBBBB(
			ParameterAnnotation _this, Match match, TMethodSignature tSignature, TMethodDefinition tAnnotable,
			TParameter tParam, TAnnotation tAnnotation) {
		_this.registerObjectsToMatch_BWD(match, tSignature, tAnnotable, tParam, tAnnotation);

	}

	public static final boolean pattern_ParameterAnnotation_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterAnnotation_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAnnotable");
		EObject _localVariable_3 = isApplicableMatch.getObject("tParam");
		EObject _localVariable_4 = isApplicableMatch.getObject("aSTNodeToTAnnotable");
		EObject _localVariable_5 = isApplicableMatch.getObject("mMethodToTDef");
		EObject _localVariable_6 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_7 = isApplicableMatch.getObject("astNode");
		EObject tmpMethod = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTAnnotable = _localVariable_2;
		EObject tmpTParam = _localVariable_3;
		EObject tmpASTNodeToTAnnotable = _localVariable_4;
		EObject tmpMMethodToTDef = _localVariable_5;
		EObject tmpTAnnotation = _localVariable_6;
		EObject tmpAstNode = _localVariable_7;
		if (tmpMethod instanceof MMethodDefinition) {
			MMethodDefinition method = (MMethodDefinition) tmpMethod;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpTAnnotable instanceof TMethodDefinition) {
					TMethodDefinition tAnnotable = (TMethodDefinition) tmpTAnnotable;
					if (tmpTParam instanceof TParameter) {
						TParameter tParam = (TParameter) tmpTParam;
						if (tmpASTNodeToTAnnotable instanceof ASTNodeToTAnnotatable) {
							ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) tmpASTNodeToTAnnotable;
							if (tmpMMethodToTDef instanceof MDefinitionToTMember) {
								MDefinitionToTMember mMethodToTDef = (MDefinitionToTMember) tmpMMethodToTDef;
								if (tmpTAnnotation instanceof TAnnotation) {
									TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
									if (tmpAstNode instanceof MSingleVariableDeclaration) {
										MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) tmpAstNode;
										return new Object[] { method, tSignature, tAnnotable, tParam,
												aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode,
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

	public static final Object[] pattern_ParameterAnnotation_11_1_performtransformation_blackBBBBBBBBFBB(
			MMethodDefinition method, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef, TAnnotation tAnnotation,
			MSingleVariableDeclaration astNode, ParameterAnnotation _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef,
						tAnnotation, astNode, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ParameterAnnotation _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterAnnotation_11_1_performtransformation_binding = pattern_ParameterAnnotation_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParameterAnnotation_11_1_performtransformation_binding != null) {
			MMethodDefinition method = (MMethodDefinition) result_pattern_ParameterAnnotation_11_1_performtransformation_binding[0];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_ParameterAnnotation_11_1_performtransformation_binding[1];
			TMethodDefinition tAnnotable = (TMethodDefinition) result_pattern_ParameterAnnotation_11_1_performtransformation_binding[2];
			TParameter tParam = (TParameter) result_pattern_ParameterAnnotation_11_1_performtransformation_binding[3];
			ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) result_pattern_ParameterAnnotation_11_1_performtransformation_binding[4];
			MDefinitionToTMember mMethodToTDef = (MDefinitionToTMember) result_pattern_ParameterAnnotation_11_1_performtransformation_binding[5];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_ParameterAnnotation_11_1_performtransformation_binding[6];
			MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) result_pattern_ParameterAnnotation_11_1_performtransformation_binding[7];

			Object[] result_pattern_ParameterAnnotation_11_1_performtransformation_black = pattern_ParameterAnnotation_11_1_performtransformation_blackBBBBBBBBFBB(
					method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode,
					_this, isApplicableMatch);
			if (result_pattern_ParameterAnnotation_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ParameterAnnotation_11_1_performtransformation_black[8];

				return new Object[] { method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef,
						tAnnotation, astNode, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_11_1_performtransformation_greenBBFF(
			TAnnotation tAnnotation, MSingleVariableDeclaration astNode) {
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		Annotation annotation = JavaFactory.eINSTANCE.createAnnotation();
		annotationToTAnnotation.setTarget(tAnnotation);
		astNode.getAnnotations().add(annotation);
		annotationToTAnnotation.setSource(annotation);
		return new Object[] { tAnnotation, astNode, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_ParameterAnnotation_11_2_collecttranslatedelements_blackBBB(
			TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation, Annotation annotation) {
		return new Object[] { tAnnotation, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_ParameterAnnotation_11_2_collecttranslatedelements_greenFBBB(
			TAnnotation tAnnotation, AnnotationToTAnnotation annotationToTAnnotation, Annotation annotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tAnnotation);
		ruleresult.getCreatedLinkElements().add(annotationToTAnnotation);
		ruleresult.getCreatedElements().add(annotation);
		return new Object[] { ruleresult, tAnnotation, annotationToTAnnotation, annotation };
	}

	public static final Object[] pattern_ParameterAnnotation_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject method, EObject tSignature, EObject tAnnotable, EObject tParam,
			EObject aSTNodeToTAnnotable, EObject mMethodToTDef, EObject tAnnotation, EObject astNode,
			EObject annotationToTAnnotation, EObject annotation) {
		if (!method.equals(tSignature)) {
			if (!method.equals(tAnnotable)) {
				if (!method.equals(tParam)) {
					if (!method.equals(tAnnotation)) {
						if (!tAnnotable.equals(tSignature)) {
							if (!tAnnotable.equals(tParam)) {
								if (!tAnnotable.equals(tAnnotation)) {
									if (!tParam.equals(tSignature)) {
										if (!aSTNodeToTAnnotable.equals(method)) {
											if (!aSTNodeToTAnnotable.equals(tSignature)) {
												if (!aSTNodeToTAnnotable.equals(tAnnotable)) {
													if (!aSTNodeToTAnnotable.equals(tParam)) {
														if (!aSTNodeToTAnnotable.equals(mMethodToTDef)) {
															if (!aSTNodeToTAnnotable.equals(tAnnotation)) {
																if (!aSTNodeToTAnnotable.equals(astNode)) {
																	if (!mMethodToTDef.equals(method)) {
																		if (!mMethodToTDef.equals(tSignature)) {
																			if (!mMethodToTDef.equals(tAnnotable)) {
																				if (!mMethodToTDef.equals(tParam)) {
																					if (!mMethodToTDef
																							.equals(tAnnotation)) {
																						if (!tAnnotation
																								.equals(tSignature)) {
																							if (!tAnnotation
																									.equals(tParam)) {
																								if (!astNode.equals(
																										method)) {
																									if (!astNode.equals(
																											tSignature)) {
																										if (!astNode
																												.equals(tAnnotable)) {
																											if (!astNode
																													.equals(tParam)) {
																												if (!astNode
																														.equals(mMethodToTDef)) {
																													if (!astNode
																															.equals(tAnnotation)) {
																														if (!annotationToTAnnotation
																																.equals(method)) {
																															if (!annotationToTAnnotation
																																	.equals(tSignature)) {
																																if (!annotationToTAnnotation
																																		.equals(tAnnotable)) {
																																	if (!annotationToTAnnotation
																																			.equals(tParam)) {
																																		if (!annotationToTAnnotation
																																				.equals(aSTNodeToTAnnotable)) {
																																			if (!annotationToTAnnotation
																																					.equals(mMethodToTDef)) {
																																				if (!annotationToTAnnotation
																																						.equals(tAnnotation)) {
																																					if (!annotationToTAnnotation
																																							.equals(astNode)) {
																																						if (!annotation
																																								.equals(method)) {
																																							if (!annotation
																																									.equals(tSignature)) {
																																								if (!annotation
																																										.equals(tAnnotable)) {
																																									if (!annotation
																																											.equals(tParam)) {
																																										if (!annotation
																																												.equals(aSTNodeToTAnnotable)) {
																																											if (!annotation
																																													.equals(mMethodToTDef)) {
																																												if (!annotation
																																														.equals(tAnnotation)) {
																																													if (!annotation
																																															.equals(astNode)) {
																																														if (!annotation
																																																.equals(annotationToTAnnotation)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	method,
																																																	tSignature,
																																																	tAnnotable,
																																																	tParam,
																																																	aSTNodeToTAnnotable,
																																																	mMethodToTDef,
																																																	tAnnotation,
																																																	astNode,
																																																	annotationToTAnnotation,
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
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterAnnotation_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tAnnotable, EObject tAnnotation, EObject astNode,
			EObject annotationToTAnnotation, EObject annotation) {
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__Annotation____annotations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__tAnnotation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge annotationToTAnnotation__Annotation____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterAnnotation";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String astNode__Annotation____annotations_name_prime = "annotations";
		String annotationToTAnnotation__tAnnotation____target_name_prime = "target";
		String annotationToTAnnotation__Annotation____source_name_prime = "source";
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		ruleresult.getTranslatedEdges().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tAnnotable__tAnnotation____tAnnotation);
		astNode__Annotation____annotations.setSrc(astNode);
		astNode__Annotation____annotations.setTrg(annotation);
		ruleresult.getCreatedEdges().add(astNode__Annotation____annotations);
		annotationToTAnnotation__tAnnotation____target.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__tAnnotation____target.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__tAnnotation____target);
		annotationToTAnnotation__Annotation____source.setSrc(annotationToTAnnotation);
		annotationToTAnnotation__Annotation____source.setTrg(annotation);
		ruleresult.getCreatedEdges().add(annotationToTAnnotation__Annotation____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		astNode__Annotation____annotations.setName(astNode__Annotation____annotations_name_prime);
		annotationToTAnnotation__tAnnotation____target
				.setName(annotationToTAnnotation__tAnnotation____target_name_prime);
		annotationToTAnnotation__Annotation____source.setName(annotationToTAnnotation__Annotation____source_name_prime);
		return new Object[] { ruleresult, tAnnotable, tAnnotation, astNode, annotationToTAnnotation, annotation,
				tAnnotation__tAnnotable____tAnnotated, tAnnotable__tAnnotation____tAnnotation,
				astNode__Annotation____annotations, annotationToTAnnotation__tAnnotation____target,
				annotationToTAnnotation__Annotation____source };
	}

	public static final void pattern_ParameterAnnotation_11_5_registerobjects_expressionBBBBBBBBBBBB(
			ParameterAnnotation _this, PerformRuleResult ruleresult, EObject method, EObject tSignature,
			EObject tAnnotable, EObject tParam, EObject aSTNodeToTAnnotable, EObject mMethodToTDef, EObject tAnnotation,
			EObject astNode, EObject annotationToTAnnotation, EObject annotation) {
		_this.registerObjects_BWD(ruleresult, method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable,
				mMethodToTDef, tAnnotation, astNode, annotationToTAnnotation, annotation);

	}

	public static final PerformRuleResult pattern_ParameterAnnotation_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_12_1_preparereturnvalue_bindingFB(
			ParameterAnnotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_12_1_preparereturnvalue_blackFBB(EClass eClass,
			ParameterAnnotation _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_12_1_preparereturnvalue_bindingAndBlackFFB(
			ParameterAnnotation _this) {
		Object[] result_pattern_ParameterAnnotation_12_1_preparereturnvalue_binding = pattern_ParameterAnnotation_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterAnnotation_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterAnnotation_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterAnnotation_12_1_preparereturnvalue_black = pattern_ParameterAnnotation_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterAnnotation_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterAnnotation_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ParameterAnnotation";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterAnnotation_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSignature");
		EObject _localVariable_1 = match.getObject("tAnnotable");
		EObject _localVariable_2 = match.getObject("tParam");
		EObject _localVariable_3 = match.getObject("tAnnotation");
		EObject tmpTSignature = _localVariable_0;
		EObject tmpTAnnotable = _localVariable_1;
		EObject tmpTParam = _localVariable_2;
		EObject tmpTAnnotation = _localVariable_3;
		if (tmpTSignature instanceof TMethodSignature) {
			TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
			if (tmpTAnnotable instanceof TMethodDefinition) {
				TMethodDefinition tAnnotable = (TMethodDefinition) tmpTAnnotable;
				if (tmpTParam instanceof TParameter) {
					TParameter tParam = (TParameter) tmpTParam;
					if (tmpTAnnotation instanceof TAnnotation) {
						TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
						return new Object[] { tSignature, tAnnotable, tParam, tAnnotation, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterAnnotation_12_2_corematch_blackFBBBFFBFB(
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam, TAnnotation tAnnotation,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMethodToTDef : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnnotable, MDefinitionToTMember.class, "target")) {
			BodyDeclaration tmpMethod = mMethodToTDef.getSource();
			if (tmpMethod instanceof MMethodDefinition) {
				MMethodDefinition method = (MMethodDefinition) tmpMethod;
				for (ASTNodeToTAnnotatable aSTNodeToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tParam, ASTNodeToTAnnotatable.class, "target")) {
					ASTNode tmpAstNode = aSTNodeToTAnnotable.getSource();
					if (tmpAstNode instanceof MSingleVariableDeclaration) {
						MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) tmpAstNode;
						_result.add(new Object[] { method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable,
								mMethodToTDef, tAnnotation, astNode, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterAnnotation_12_3_findcontext_blackBBBBBBBB(
			MMethodDefinition method, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef, TAnnotation tAnnotation,
			MSingleVariableDeclaration astNode) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tSignature.getParameters().contains(tParam)) {
			if (method.equals(mMethodToTDef.getSource())) {
				if (tAnnotable.equals(mMethodToTDef.getTarget())) {
					if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
						if (astNode.equals(aSTNodeToTAnnotable.getSource())) {
							if (tParam.equals(aSTNodeToTAnnotable.getTarget())) {
								if (method.getParameters().contains(astNode)) {
									if (tSignature.getDefinitions().contains(tAnnotable)) {
										_result.add(new Object[] { method, tSignature, tAnnotable, tParam,
												aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode });
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

	public static final Object[] pattern_ParameterAnnotation_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFF(
			MMethodDefinition method, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef, TAnnotation tAnnotation,
			MSingleVariableDeclaration astNode) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tSignature__tParam____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTDef__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMethodToTDef__tAnnotable____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tAnnotable____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge aSTNodeToTAnnotable__astNode____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge aSTNodeToTAnnotable__tParam____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__astNode____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNode__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tAnnotable____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotable__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSignature__tParam____parameters_name_prime = "parameters";
		String mMethodToTDef__method____source_name_prime = "source";
		String mMethodToTDef__tAnnotable____target_name_prime = "target";
		String tAnnotation__tAnnotable____tAnnotated_name_prime = "tAnnotated";
		String tAnnotable__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String aSTNodeToTAnnotable__astNode____source_name_prime = "source";
		String aSTNodeToTAnnotable__tParam____target_name_prime = "target";
		String method__astNode____parameters_name_prime = "parameters";
		String astNode__method____methodDeclaration_name_prime = "methodDeclaration";
		String tSignature__tAnnotable____definitions_name_prime = "definitions";
		String tAnnotable__tSignature____signature_name_prime = "signature";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tAnnotable);
		isApplicableMatch.getAllContextElements().add(tParam);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable);
		isApplicableMatch.getAllContextElements().add(mMethodToTDef);
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(astNode);
		tSignature__tParam____parameters.setSrc(tSignature);
		tSignature__tParam____parameters.setTrg(tParam);
		isApplicableMatch.getAllContextElements().add(tSignature__tParam____parameters);
		mMethodToTDef__method____source.setSrc(mMethodToTDef);
		mMethodToTDef__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(mMethodToTDef__method____source);
		mMethodToTDef__tAnnotable____target.setSrc(mMethodToTDef);
		mMethodToTDef__tAnnotable____target.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(mMethodToTDef__tAnnotable____target);
		tAnnotation__tAnnotable____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tAnnotable____tAnnotated.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tAnnotable____tAnnotated);
		tAnnotable__tAnnotation____tAnnotation.setSrc(tAnnotable);
		tAnnotable__tAnnotation____tAnnotation.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tAnnotable__tAnnotation____tAnnotation);
		aSTNodeToTAnnotable__astNode____source.setSrc(aSTNodeToTAnnotable);
		aSTNodeToTAnnotable__astNode____source.setTrg(astNode);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable__astNode____source);
		aSTNodeToTAnnotable__tParam____target.setSrc(aSTNodeToTAnnotable);
		aSTNodeToTAnnotable__tParam____target.setTrg(tParam);
		isApplicableMatch.getAllContextElements().add(aSTNodeToTAnnotable__tParam____target);
		method__astNode____parameters.setSrc(method);
		method__astNode____parameters.setTrg(astNode);
		isApplicableMatch.getAllContextElements().add(method__astNode____parameters);
		astNode__method____methodDeclaration.setSrc(astNode);
		astNode__method____methodDeclaration.setTrg(method);
		isApplicableMatch.getAllContextElements().add(astNode__method____methodDeclaration);
		tSignature__tAnnotable____definitions.setSrc(tSignature);
		tSignature__tAnnotable____definitions.setTrg(tAnnotable);
		isApplicableMatch.getAllContextElements().add(tSignature__tAnnotable____definitions);
		tAnnotable__tSignature____signature.setSrc(tAnnotable);
		tAnnotable__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tAnnotable__tSignature____signature);
		tSignature__tParam____parameters.setName(tSignature__tParam____parameters_name_prime);
		mMethodToTDef__method____source.setName(mMethodToTDef__method____source_name_prime);
		mMethodToTDef__tAnnotable____target.setName(mMethodToTDef__tAnnotable____target_name_prime);
		tAnnotation__tAnnotable____tAnnotated.setName(tAnnotation__tAnnotable____tAnnotated_name_prime);
		tAnnotable__tAnnotation____tAnnotation.setName(tAnnotable__tAnnotation____tAnnotation_name_prime);
		aSTNodeToTAnnotable__astNode____source.setName(aSTNodeToTAnnotable__astNode____source_name_prime);
		aSTNodeToTAnnotable__tParam____target.setName(aSTNodeToTAnnotable__tParam____target_name_prime);
		method__astNode____parameters.setName(method__astNode____parameters_name_prime);
		astNode__method____methodDeclaration.setName(astNode__method____methodDeclaration_name_prime);
		tSignature__tAnnotable____definitions.setName(tSignature__tAnnotable____definitions_name_prime);
		tAnnotable__tSignature____signature.setName(tAnnotable__tSignature____signature_name_prime);
		return new Object[] { method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, tAnnotation,
				astNode, isApplicableMatch, tSignature__tParam____parameters, mMethodToTDef__method____source,
				mMethodToTDef__tAnnotable____target, tAnnotation__tAnnotable____tAnnotated,
				tAnnotable__tAnnotation____tAnnotation, aSTNodeToTAnnotable__astNode____source,
				aSTNodeToTAnnotable__tParam____target, method__astNode____parameters,
				astNode__method____methodDeclaration, tSignature__tAnnotable____definitions,
				tAnnotable__tSignature____signature };
	}

	public static final Object[] pattern_ParameterAnnotation_12_4_solveCSP_bindingFBBBBBBBBBB(ParameterAnnotation _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition method, TMethodSignature tSignature,
			TMethodDefinition tAnnotable, TParameter tParam, ASTNodeToTAnnotatable aSTNodeToTAnnotable,
			MDefinitionToTMember mMethodToTDef, TAnnotation tAnnotation, MSingleVariableDeclaration astNode) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, method, tSignature, tAnnotable,
				tParam, aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, tSignature, tAnnotable, tParam,
					aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterAnnotation_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ParameterAnnotation _this, IsApplicableMatch isApplicableMatch, MMethodDefinition method,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef, TAnnotation tAnnotation,
			MSingleVariableDeclaration astNode) {
		Object[] result_pattern_ParameterAnnotation_12_4_solveCSP_binding = pattern_ParameterAnnotation_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef,
				tAnnotation, astNode);
		if (result_pattern_ParameterAnnotation_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterAnnotation_12_4_solveCSP_binding[0];

			Object[] result_pattern_ParameterAnnotation_12_4_solveCSP_black = pattern_ParameterAnnotation_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterAnnotation_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, tSignature, tAnnotable, tParam,
						aSTNodeToTAnnotable, mMethodToTDef, tAnnotation, astNode };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterAnnotation_12_5_checkCSP_expressionFBB(ParameterAnnotation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterAnnotation_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterAnnotation";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterAnnotation_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_20_1_preparereturnvalue_bindingFB(
			ParameterAnnotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterAnnotation _this) {
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

	public static final Object[] pattern_ParameterAnnotation_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterAnnotation _this) {
		Object[] result_pattern_ParameterAnnotation_20_1_preparereturnvalue_binding = pattern_ParameterAnnotation_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterAnnotation_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterAnnotation_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterAnnotation_20_1_preparereturnvalue_black = pattern_ParameterAnnotation_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterAnnotation_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterAnnotation_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterAnnotation_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterAnnotation_20_2_testcorematchandDECs_black_nac_0BBBB(
			TAnnotation tAnnotation, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam) {
		TAnnotatable __DEC_tAnnotation_tAnnotation_897021 = tAnnotation.getTAnnotated();
		if (__DEC_tAnnotation_tAnnotation_897021 != null) {
			if (!tSignature.equals(__DEC_tAnnotation_tAnnotation_897021)) {
				if (!tAnnotable.equals(__DEC_tAnnotation_tAnnotation_897021)) {
					if (!tParam.equals(__DEC_tAnnotation_tAnnotation_897021)) {
						return new Object[] { tAnnotation, tSignature, tAnnotable, tParam };
					}
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_20_2_testcorematchandDECs_black_nac_1BB(
			TMethodSignature tSignature, TAnnotation tAnnotation) {
		if (tSignature.getTAnnotation().contains(tAnnotation)) {
			return new Object[] { tSignature, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_20_2_testcorematchandDECs_black_nac_2BB(TParameter tParam,
			TAnnotation tAnnotation) {
		if (tParam.getTAnnotation().contains(tAnnotation)) {
			return new Object[] { tParam, tAnnotation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterAnnotation_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_tAnnotated) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTAnnotation = _edge_tAnnotated.getSrc();
		if (tmpTAnnotation instanceof TAnnotation) {
			TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
			EObject tmpTAnnotable = _edge_tAnnotated.getTrg();
			if (tmpTAnnotable instanceof TMethodDefinition) {
				TMethodDefinition tAnnotable = (TMethodDefinition) tmpTAnnotable;
				if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
					TSignature tmpTSignature = tAnnotable.getSignature();
					if (tmpTSignature instanceof TMethodSignature) {
						TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
						if (pattern_ParameterAnnotation_20_2_testcorematchandDECs_black_nac_1BB(tSignature,
								tAnnotation) == null) {
							for (TParameter tParam : tSignature.getParameters()) {
								if (pattern_ParameterAnnotation_20_2_testcorematchandDECs_black_nac_0BBBB(tAnnotation,
										tSignature, tAnnotable, tParam) == null) {
									if (pattern_ParameterAnnotation_20_2_testcorematchandDECs_black_nac_2BB(tParam,
											tAnnotation) == null) {
										_result.add(new Object[] { tSignature, tAnnotable, tParam, tAnnotation,
												_edge_tAnnotated });
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

	public static final Object[] pattern_ParameterAnnotation_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterAnnotation_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ParameterAnnotation _this, Match match, TMethodSignature tSignature, TMethodDefinition tAnnotable,
			TParameter tParam, TAnnotation tAnnotation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSignature, tAnnotable, tParam, tAnnotation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterAnnotation_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterAnnotation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterAnnotation_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_21_1_preparereturnvalue_bindingFB(
			ParameterAnnotation _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterAnnotation _this) {
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

	public static final Object[] pattern_ParameterAnnotation_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterAnnotation _this) {
		Object[] result_pattern_ParameterAnnotation_21_1_preparereturnvalue_binding = pattern_ParameterAnnotation_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterAnnotation_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterAnnotation_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterAnnotation_21_1_preparereturnvalue_black = pattern_ParameterAnnotation_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterAnnotation_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterAnnotation_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterAnnotation_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterAnnotation_21_2_testcorematchandDECs_black_nac_0BB(
			Annotation annotation, MMethodDefinition method) {
		for (BodyDeclaration __DEC_Annotation_annotations_516918 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, BodyDeclaration.class, "annotations")) {
			if (!method.equals(__DEC_Annotation_annotations_516918)) {
				return new Object[] { annotation, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_21_2_testcorematchandDECs_black_nac_1B(
			Annotation annotation) {
		for (AnnotationMemberValuePair __DEC_Annotation_value_222017 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { annotation };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_21_2_testcorematchandDECs_black_nac_2BB(
			MMethodDefinition method, Annotation annotation) {
		if (method.getAnnotations().contains(annotation)) {
			return new Object[] { method, annotation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterAnnotation_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_annotations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAstNode = _edge_annotations.getSrc();
		if (tmpAstNode instanceof MSingleVariableDeclaration) {
			MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) tmpAstNode;
			EObject tmpAnnotation = _edge_annotations.getTrg();
			if (tmpAnnotation instanceof Annotation) {
				Annotation annotation = (Annotation) tmpAnnotation;
				if (astNode.getAnnotations().contains(annotation)) {
					AbstractMethodDeclaration tmpMethod = astNode.getMethodDeclaration();
					if (tmpMethod instanceof MMethodDefinition) {
						MMethodDefinition method = (MMethodDefinition) tmpMethod;
						if (pattern_ParameterAnnotation_21_2_testcorematchandDECs_black_nac_1B(annotation) == null) {
							if (pattern_ParameterAnnotation_21_2_testcorematchandDECs_black_nac_0BB(annotation,
									method) == null) {
								if (pattern_ParameterAnnotation_21_2_testcorematchandDECs_black_nac_2BB(method,
										annotation) == null) {
									_result.add(new Object[] { method, astNode, annotation, _edge_annotations });
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterAnnotation_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ParameterAnnotation _this, Match match, MMethodDefinition method, MSingleVariableDeclaration astNode,
			Annotation annotation) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, method, astNode, annotation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterAnnotation_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterAnnotation _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterAnnotation_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_24_1_prepare_blackB(ParameterAnnotation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterAnnotation_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ParameterAnnotation_24_2_matchsrctrgcontext_bindingFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("method");
		EObject _localVariable_1 = targetMatch.getObject("tSignature");
		EObject _localVariable_2 = targetMatch.getObject("tAnnotable");
		EObject _localVariable_3 = targetMatch.getObject("tParam");
		EObject _localVariable_4 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_5 = sourceMatch.getObject("astNode");
		EObject _localVariable_6 = sourceMatch.getObject("Annotation");
		EObject tmpMethod = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTAnnotable = _localVariable_2;
		EObject tmpTParam = _localVariable_3;
		EObject tmpTAnnotation = _localVariable_4;
		EObject tmpAstNode = _localVariable_5;
		EObject tmpAnnotation = _localVariable_6;
		if (tmpMethod instanceof MMethodDefinition) {
			MMethodDefinition method = (MMethodDefinition) tmpMethod;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpTAnnotable instanceof TMethodDefinition) {
					TMethodDefinition tAnnotable = (TMethodDefinition) tmpTAnnotable;
					if (tmpTParam instanceof TParameter) {
						TParameter tParam = (TParameter) tmpTParam;
						if (tmpTAnnotation instanceof TAnnotation) {
							TAnnotation tAnnotation = (TAnnotation) tmpTAnnotation;
							if (tmpAstNode instanceof MSingleVariableDeclaration) {
								MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) tmpAstNode;
								if (tmpAnnotation instanceof Annotation) {
									Annotation annotation = (Annotation) tmpAnnotation;
									return new Object[] { method, tSignature, tAnnotable, tParam, tAnnotation, astNode,
											annotation, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			MMethodDefinition method, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			TAnnotation tAnnotation, MSingleVariableDeclaration astNode, Annotation annotation, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { method, tSignature, tAnnotable, tParam, tAnnotation, astNode, annotation, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_binding = pattern_ParameterAnnotation_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_binding != null) {
			MMethodDefinition method = (MMethodDefinition) result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_binding[0];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_binding[1];
			TMethodDefinition tAnnotable = (TMethodDefinition) result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_binding[2];
			TParameter tParam = (TParameter) result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_binding[3];
			TAnnotation tAnnotation = (TAnnotation) result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_binding[4];
			MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_binding[5];
			Annotation annotation = (Annotation) result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_black = pattern_ParameterAnnotation_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					method, tSignature, tAnnotable, tParam, tAnnotation, astNode, annotation, sourceMatch, targetMatch);
			if (result_pattern_ParameterAnnotation_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { method, tSignature, tAnnotable, tParam, tAnnotation, astNode, annotation,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_24_3_solvecsp_bindingFBBBBBBBBBB(ParameterAnnotation _this,
			MMethodDefinition method, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			TAnnotation tAnnotation, MSingleVariableDeclaration astNode, Annotation annotation, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(method, tSignature, tAnnotable, tParam, tAnnotation,
				astNode, annotation, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, method, tSignature, tAnnotable, tParam, tAnnotation, astNode, annotation,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterAnnotation_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			ParameterAnnotation _this, MMethodDefinition method, TMethodSignature tSignature,
			TMethodDefinition tAnnotable, TParameter tParam, TAnnotation tAnnotation,
			MSingleVariableDeclaration astNode, Annotation annotation, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterAnnotation_24_3_solvecsp_binding = pattern_ParameterAnnotation_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, method, tSignature, tAnnotable, tParam, tAnnotation, astNode, annotation, sourceMatch,
				targetMatch);
		if (result_pattern_ParameterAnnotation_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterAnnotation_24_3_solvecsp_binding[0];

			Object[] result_pattern_ParameterAnnotation_24_3_solvecsp_black = pattern_ParameterAnnotation_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ParameterAnnotation_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, method, tSignature, tAnnotable, tParam, tAnnotation, astNode,
						annotation, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterAnnotation_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterAnnotation_24_5_matchcorrcontext_blackBBBFFBBB(
			MMethodDefinition method, TMethodDefinition tAnnotable, TParameter tParam,
			MSingleVariableDeclaration astNode, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember mMethodToTDef : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(method, MDefinitionToTMember.class, "source")) {
				if (tAnnotable.equals(mMethodToTDef.getTarget())) {
					for (ASTNodeToTAnnotatable aSTNodeToTAnnotable : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(astNode, ASTNodeToTAnnotatable.class, "source")) {
						if (tParam.equals(aSTNodeToTAnnotable.getTarget())) {
							_result.add(new Object[] { method, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef,
									astNode, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_24_5_matchcorrcontext_greenBBBBF(
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ParameterAnnotation";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(aSTNodeToTAnnotable);
		ccMatch.getAllContextElements().add(mMethodToTDef);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { aSTNodeToTAnnotable, mMethodToTDef, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ParameterAnnotation_24_6_createcorrespondence_blackBBBBBBBB(
			MMethodDefinition method, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			TAnnotation tAnnotation, MSingleVariableDeclaration astNode, Annotation annotation, CCMatch ccMatch) {
		return new Object[] { method, tSignature, tAnnotable, tParam, tAnnotation, astNode, annotation, ccMatch };
	}

	public static final Object[] pattern_ParameterAnnotation_24_6_createcorrespondence_greenBFBB(
			TAnnotation tAnnotation, Annotation annotation, CCMatch ccMatch) {
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		annotationToTAnnotation.setTarget(tAnnotation);
		annotationToTAnnotation.setSource(annotation);
		ccMatch.getCreateCorr().add(annotationToTAnnotation);
		return new Object[] { tAnnotation, annotationToTAnnotation, annotation, ccMatch };
	}

	public static final Object[] pattern_ParameterAnnotation_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ParameterAnnotation_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ParameterAnnotation";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterAnnotation_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_27_1_matchtggpattern_black_nac_0BB(Annotation annotation,
			MMethodDefinition method) {
		for (BodyDeclaration __DEC_Annotation_annotations_322747 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, BodyDeclaration.class, "annotations")) {
			if (!method.equals(__DEC_Annotation_annotations_322747)) {
				return new Object[] { annotation, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_27_1_matchtggpattern_black_nac_1B(Annotation annotation) {
		for (AnnotationMemberValuePair __DEC_Annotation_value_19564 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(annotation, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { annotation };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_27_1_matchtggpattern_black_nac_2BB(
			MMethodDefinition method, Annotation annotation) {
		if (method.getAnnotations().contains(annotation)) {
			return new Object[] { method, annotation };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_27_1_matchtggpattern_blackBBB(MMethodDefinition method,
			MSingleVariableDeclaration astNode, Annotation annotation) {
		if (astNode.getAnnotations().contains(annotation)) {
			if (method.getParameters().contains(astNode)) {
				if (pattern_ParameterAnnotation_27_1_matchtggpattern_black_nac_0BB(annotation, method) == null) {
					if (pattern_ParameterAnnotation_27_1_matchtggpattern_black_nac_1B(annotation) == null) {
						if (pattern_ParameterAnnotation_27_1_matchtggpattern_black_nac_2BB(method,
								annotation) == null) {
							return new Object[] { method, astNode, annotation };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterAnnotation_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterAnnotation_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_28_1_matchtggpattern_black_nac_0BBBB(
			TAnnotation tAnnotation, TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam) {
		TAnnotatable __DEC_tAnnotation_tAnnotation_521859 = tAnnotation.getTAnnotated();
		if (__DEC_tAnnotation_tAnnotation_521859 != null) {
			if (!tSignature.equals(__DEC_tAnnotation_tAnnotation_521859)) {
				if (!tAnnotable.equals(__DEC_tAnnotation_tAnnotation_521859)) {
					if (!tParam.equals(__DEC_tAnnotation_tAnnotation_521859)) {
						return new Object[] { tAnnotation, tSignature, tAnnotable, tParam };
					}
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_28_1_matchtggpattern_black_nac_1BB(
			TMethodSignature tSignature, TAnnotation tAnnotation) {
		if (tSignature.getTAnnotation().contains(tAnnotation)) {
			return new Object[] { tSignature, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_28_1_matchtggpattern_black_nac_2BB(TParameter tParam,
			TAnnotation tAnnotation) {
		if (tParam.getTAnnotation().contains(tAnnotation)) {
			return new Object[] { tParam, tAnnotation };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_28_1_matchtggpattern_blackBBBB(TMethodSignature tSignature,
			TMethodDefinition tAnnotable, TParameter tParam, TAnnotation tAnnotation) {
		if (tSignature.getParameters().contains(tParam)) {
			if (tAnnotable.equals(tAnnotation.getTAnnotated())) {
				if (tSignature.getDefinitions().contains(tAnnotable)) {
					if (pattern_ParameterAnnotation_28_1_matchtggpattern_black_nac_0BBBB(tAnnotation, tSignature,
							tAnnotable, tParam) == null) {
						if (pattern_ParameterAnnotation_28_1_matchtggpattern_black_nac_1BB(tSignature,
								tAnnotation) == null) {
							if (pattern_ParameterAnnotation_28_1_matchtggpattern_black_nac_2BB(tParam,
									tAnnotation) == null) {
								return new Object[] { tSignature, tAnnotable, tParam, tAnnotation };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterAnnotation_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterAnnotation_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_29_1_createresult_blackB(ParameterAnnotation _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterAnnotation_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MMethodDefinition method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MSingleVariableDeclaration astNode) {
		if (ruleResult.getSourceObjects().contains(astNode)) {
			return new Object[] { ruleResult, astNode };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ASTNodeToTAnnotatable aSTNodeToTAnnotable) {
		if (ruleResult.getCorrObjects().contains(aSTNodeToTAnnotable)) {
			return new Object[] { ruleResult, aSTNodeToTAnnotable };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TParameter tParam) {
		if (ruleResult.getTargetObjects().contains(tParam)) {
			return new Object[] { ruleResult, tParam };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TMethodSignature tSignature) {
		if (ruleResult.getTargetObjects().contains(tSignature)) {
			return new Object[] { ruleResult, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TMethodDefinition tAnnotable) {
		if (ruleResult.getTargetObjects().contains(tAnnotable)) {
			return new Object[] { ruleResult, tAnnotable };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMethodToTDef) {
		if (ruleResult.getCorrObjects().contains(mMethodToTDef)) {
			return new Object[] { ruleResult, mMethodToTDef };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterAnnotation_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList aSTNodeToTAnnotableList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpASTNodeToTAnnotable : aSTNodeToTAnnotableList.getEntryObjects()) {
				if (tmpASTNodeToTAnnotable instanceof ASTNodeToTAnnotatable) {
					ASTNodeToTAnnotatable aSTNodeToTAnnotable = (ASTNodeToTAnnotatable) tmpASTNodeToTAnnotable;
					ASTNode tmpAstNode = aSTNodeToTAnnotable.getSource();
					if (tmpAstNode instanceof MSingleVariableDeclaration) {
						MSingleVariableDeclaration astNode = (MSingleVariableDeclaration) tmpAstNode;
						TAnnotatable tmpTParam = aSTNodeToTAnnotable.getTarget();
						if (tmpTParam instanceof TParameter) {
							TParameter tParam = (TParameter) tmpTParam;
							AbstractMethodDeclaration tmpMethod = astNode.getMethodDeclaration();
							if (tmpMethod instanceof MMethodDefinition) {
								MMethodDefinition method = (MMethodDefinition) tmpMethod;
								if (pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_2BB(ruleResult,
										aSTNodeToTAnnotable) == null) {
									if (pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											astNode) == null) {
										if (pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_3BB(ruleResult,
												tParam) == null) {
											if (pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, method) == null) {
												for (TMethodSignature tSignature : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(tParam, TMethodSignature.class,
																"parameters")) {
													if (pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, tSignature) == null) {
														for (TMember tmpTAnnotable : tSignature.getDefinitions()) {
															if (tmpTAnnotable instanceof TMethodDefinition) {
																TMethodDefinition tAnnotable = (TMethodDefinition) tmpTAnnotable;
																if (pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, tAnnotable) == null) {
																	for (MDefinitionToTMember mMethodToTDef : org.moflon.core.utilities.eMoflonEMFUtil
																			.getOppositeReferenceTyped(method,
																					MDefinitionToTMember.class,
																					"source")) {
																		if (tAnnotable
																				.equals(mMethodToTDef.getTarget())) {
																			if (pattern_ParameterAnnotation_29_2_isapplicablecore_black_nac_6BB(
																					ruleResult,
																					mMethodToTDef) == null) {
																				_result.add(new Object[] {
																						aSTNodeToTAnnotableList, method,
																						astNode, aSTNodeToTAnnotable,
																						tParam, tSignature, tAnnotable,
																						mMethodToTDef,
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

	public static final Object[] pattern_ParameterAnnotation_29_3_solveCSP_bindingFBBBBBBBBBB(ParameterAnnotation _this,
			IsApplicableMatch isApplicableMatch, MMethodDefinition method, TMethodSignature tSignature,
			TMethodDefinition tAnnotable, TParameter tParam, ASTNodeToTAnnotatable aSTNodeToTAnnotable,
			MDefinitionToTMember mMethodToTDef, MSingleVariableDeclaration astNode,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, method, tSignature, tAnnotable,
				tParam, aSTNodeToTAnnotable, mMethodToTDef, astNode, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, tSignature, tAnnotable, tParam,
					aSTNodeToTAnnotable, mMethodToTDef, astNode, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParameterAnnotation_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterAnnotation_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ParameterAnnotation _this, IsApplicableMatch isApplicableMatch, MMethodDefinition method,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef,
			MSingleVariableDeclaration astNode, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParameterAnnotation_29_3_solveCSP_binding = pattern_ParameterAnnotation_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef,
				astNode, ruleResult);
		if (result_pattern_ParameterAnnotation_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterAnnotation_29_3_solveCSP_binding[0];

			Object[] result_pattern_ParameterAnnotation_29_3_solveCSP_black = pattern_ParameterAnnotation_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterAnnotation_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, tSignature, tAnnotable, tParam,
						aSTNodeToTAnnotable, mMethodToTDef, astNode, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterAnnotation_29_4_checkCSP_expressionFBB(ParameterAnnotation _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterAnnotation_29_5_checknacs_blackBBBBBBB(MMethodDefinition method,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef,
			MSingleVariableDeclaration astNode) {
		return new Object[] { method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, astNode };
	}

	public static final Object[] pattern_ParameterAnnotation_29_6_perform_blackBBBBBBBB(MMethodDefinition method,
			TMethodSignature tSignature, TMethodDefinition tAnnotable, TParameter tParam,
			ASTNodeToTAnnotatable aSTNodeToTAnnotable, MDefinitionToTMember mMethodToTDef,
			MSingleVariableDeclaration astNode, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { method, tSignature, tAnnotable, tParam, aSTNodeToTAnnotable, mMethodToTDef, astNode,
				ruleResult };
	}

	public static final Object[] pattern_ParameterAnnotation_29_6_perform_greenBFBFFB(TMethodDefinition tAnnotable,
			MSingleVariableDeclaration astNode, ModelgeneratorRuleResult ruleResult) {
		TAnnotation tAnnotation = AnnotationsFactory.eINSTANCE.createTAnnotation();
		AnnotationToTAnnotation annotationToTAnnotation = PmFactory.eINSTANCE.createAnnotationToTAnnotation();
		Annotation annotation = JavaFactory.eINSTANCE.createAnnotation();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		tAnnotation.setTAnnotated(tAnnotable);
		ruleResult.getTargetObjects().add(tAnnotation);
		annotationToTAnnotation.setTarget(tAnnotation);
		ruleResult.getCorrObjects().add(annotationToTAnnotation);
		astNode.getAnnotations().add(annotation);
		annotationToTAnnotation.setSource(annotation);
		ruleResult.getSourceObjects().add(annotation);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAnnotable, tAnnotation, astNode, annotationToTAnnotation, annotation, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ParameterAnnotation_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterAnnotationImpl
