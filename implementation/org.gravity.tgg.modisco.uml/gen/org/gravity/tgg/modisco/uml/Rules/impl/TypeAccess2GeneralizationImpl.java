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
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.TypeAccess2Generalization;

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
 * An implementation of the model object '<em><b>Type Access2 Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeAccess2GeneralizationImpl extends AbstractRuleImpl implements TypeAccess2Generalization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAccess2GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeAccess2Generalization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess typeAcc, Type superClassDec, ClassDeclaration classDec) {

		Object[] result1_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_0_1_initialbindings_blackBBBBB(this, match, typeAcc, superClassDec,
						classDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeAcc] = " + typeAcc + ", " + "[superClassDec] = "
					+ superClassDec + ", " + "[classDec] = " + classDec + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, typeAcc,
						superClassDec, classDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeAcc] = " + typeAcc + ", " + "[superClassDec] = "
					+ superClassDec + ", " + "[classDec] = " + classDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_0_4_collectelementstobetranslated_blackBBBB(match, typeAcc,
							superClassDec, classDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeAcc] = " + typeAcc + ", " + "[superClassDec] = " + superClassDec + ", "
						+ "[classDec] = " + classDec + ".");
			}
			TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_0_4_collectelementstobetranslated_greenBBBBFFF(match, typeAcc,
							superClassDec, classDec);
			//nothing EMoflonEdge typeAcc__superClassDec____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge classDec__typeAcc____superClass = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_0_5_collectcontextelements_blackBBBB(match, typeAcc,
							superClassDec, classDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeAcc] = " + typeAcc + ", " + "[superClassDec] = " + superClassDec + ", "
						+ "[classDec] = " + classDec + ".");
			}
			TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_0_5_collectcontextelements_greenBBB(match,
					superClassDec, classDec);

			// 
			TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, typeAcc, superClassDec, classDec);
			return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_0_7_expressionF();
		} else {
			return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		TypeAccess typeAcc = (TypeAccess) result1_bindingAndBlack[1];
		ASTNode2Element cd2c2 = (ASTNode2Element) result1_bindingAndBlack[2];
		Classifier umlClassifier = (Classifier) result1_bindingAndBlack[3];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[4];
		Type superClassDec = (Type) result1_bindingAndBlack[5];
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_1_1_performtransformation_greenBBBFF(superClass, typeAcc,
						umlClassifier);
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2Generalization) result1_green[3];
		Generalization generalization = (Generalization) result1_green[4];

		Object[] result2_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_1_2_collecttranslatedelements_blackBBB(typeAcc, ta2g,
						generalization);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeAcc] = " + typeAcc + ", "
					+ "[ta2g] = " + ta2g + ", " + "[generalization] = " + generalization + ".");
		}
		Object[] result2_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_1_2_collecttranslatedelements_greenFBBB(typeAcc, ta2g,
						generalization);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, superClass,
						typeAcc, cd2c2, umlClassifier, cd2c, ta2g, generalization, superClassDec, classDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[superClass] = " + superClass + ", " + "[typeAcc] = " + typeAcc + ", " + "[cd2c2] = "
					+ cd2c2 + ", " + "[umlClassifier] = " + umlClassifier + ", " + "[cd2c] = " + cd2c + ", "
					+ "[ta2g] = " + ta2g + ", " + "[generalization] = " + generalization + ", " + "[superClassDec] = "
					+ superClassDec + ", " + "[classDec] = " + classDec + ".");
		}
		TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(
				ruleresult, superClass, typeAcc, umlClassifier, ta2g, generalization, superClassDec, classDec);
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge ta2g__generalization____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge generalization__superClass____general = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeAcc__superClassDec____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge umlClassifier__generalization____generalization = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge generalization__umlClassifier____specific = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge classDec__typeAcc____superClass = (EMoflonEdge) result3_green[15];

		// 
		// 
		TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, superClass, typeAcc, cd2c2, umlClassifier, cd2c, ta2g, generalization, superClassDec,
				classDec);
		return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess typeAcc = (TypeAccess) result2_binding[0];
		Type superClassDec = (Type) result2_binding[1];
		ClassDeclaration classDec = (ClassDeclaration) result2_binding[2];
		for (Object[] result2_black : TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_2_2_corematch_blackFBFFFBBB(typeAcc, superClassDec, classDec,
						match)) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result2_black[0];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[2];
			Classifier umlClassifier = (Classifier) result2_black[3];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[4];
			// ForEach 
			for (Object[] result3_black : TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_2_3_findcontext_blackBBBBBBB(superClass, typeAcc, cd2c2,
							umlClassifier, cd2c, superClassDec, classDec)) {
				Object[] result3_green = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_2_3_findcontext_greenBBBBBBBFFFFFFFF(superClass, typeAcc,
								cd2c2, umlClassifier, cd2c, superClassDec, classDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge cd2c2__superClass____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge cd2c__umlClassifier____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge cd2c2__superClassDec____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge typeAcc__superClassDec____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge classDec__typeAcc____superClass = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, superClass, typeAcc, cd2c2, umlClassifier, cd2c, superClassDec,
								classDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[superClass] = " + superClass
							+ ", " + "[typeAcc] = " + typeAcc + ", " + "[cd2c2] = " + cd2c2 + ", "
							+ "[umlClassifier] = " + umlClassifier + ", " + "[cd2c] = " + cd2c + ", "
							+ "[superClassDec] = " + superClassDec + ", " + "[classDec] = " + classDec + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = TypeAccess2GeneralizationImpl
							.pattern_TypeAccess2Generalization_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess typeAcc, Type superClassDec,
			ClassDeclaration classDec) {
		match.registerObject("typeAcc", typeAcc);
		match.registerObject("superClassDec", superClassDec);
		match.registerObject("classDec", classDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess typeAcc, Type superClassDec,
			ClassDeclaration classDec) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class superClass,
			TypeAccess typeAcc, ASTNode2Element cd2c2, Classifier umlClassifier, ASTNode2Element cd2c,
			Type superClassDec, ClassDeclaration classDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("superClass", superClass);
		isApplicableMatch.registerObject("typeAcc", typeAcc);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("umlClassifier", umlClassifier);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("superClassDec", superClassDec);
		isApplicableMatch.registerObject("classDec", classDec);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject superClass, EObject typeAcc, EObject cd2c2,
			EObject umlClassifier, EObject cd2c, EObject ta2g, EObject generalization, EObject superClassDec,
			EObject classDec) {
		ruleresult.registerObject("superClass", superClass);
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("cd2c2", cd2c2);
		ruleresult.registerObject("umlClassifier", umlClassifier);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("generalization", generalization);
		ruleresult.registerObject("superClassDec", superClassDec);
		ruleresult.registerObject("classDec", classDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeAcc").eClass())
				.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier,
			Generalization generalization) {

		Object[] result1_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_10_1_initialbindings_blackBBBBB(this, match, superClass,
						umlClassifier, generalization);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[superClass] = " + superClass + ", " + "[umlClassifier] = "
					+ umlClassifier + ", " + "[generalization] = " + generalization + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, superClass,
						umlClassifier, generalization);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[superClass] = " + superClass + ", " + "[umlClassifier] = "
					+ umlClassifier + ", " + "[generalization] = " + generalization + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_10_4_collectelementstobetranslated_blackBBBB(match, superClass,
							umlClassifier, generalization);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[superClass] = " + superClass + ", " + "[umlClassifier] = " + umlClassifier + ", "
						+ "[generalization] = " + generalization + ".");
			}
			TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_10_4_collectelementstobetranslated_greenBBBBFFF(match,
							superClass, umlClassifier, generalization);
			//nothing EMoflonEdge generalization__superClass____general = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge umlClassifier__generalization____generalization = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge generalization__umlClassifier____specific = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_10_5_collectcontextelements_blackBBBB(match, superClass,
							umlClassifier, generalization);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[superClass] = " + superClass + ", " + "[umlClassifier] = " + umlClassifier + ", "
						+ "[generalization] = " + generalization + ".");
			}
			TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_10_5_collectcontextelements_greenBBB(match,
					superClass, umlClassifier);

			// 
			TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, superClass, umlClassifier, generalization);
			return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_10_7_expressionF();
		} else {
			return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		ASTNode2Element cd2c2 = (ASTNode2Element) result1_bindingAndBlack[1];
		Classifier umlClassifier = (Classifier) result1_bindingAndBlack[2];
		ASTNode2Element cd2c = (ASTNode2Element) result1_bindingAndBlack[3];
		Generalization generalization = (Generalization) result1_bindingAndBlack[4];
		Type superClassDec = (Type) result1_bindingAndBlack[5];
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_11_1_performtransformation_greenFFBBB(generalization, superClassDec,
						classDec);
		TypeAccess typeAcc = (TypeAccess) result1_green[0];
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2Generalization) result1_green[1];

		Object[] result2_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_11_2_collecttranslatedelements_blackBBB(typeAcc, ta2g,
						generalization);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeAcc] = " + typeAcc + ", "
					+ "[ta2g] = " + ta2g + ", " + "[generalization] = " + generalization + ".");
		}
		Object[] result2_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_11_2_collecttranslatedelements_greenFBBB(typeAcc, ta2g,
						generalization);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, superClass,
						typeAcc, cd2c2, umlClassifier, cd2c, ta2g, generalization, superClassDec, classDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[superClass] = " + superClass + ", " + "[typeAcc] = " + typeAcc + ", " + "[cd2c2] = "
					+ cd2c2 + ", " + "[umlClassifier] = " + umlClassifier + ", " + "[cd2c] = " + cd2c + ", "
					+ "[ta2g] = " + ta2g + ", " + "[generalization] = " + generalization + ", " + "[superClassDec] = "
					+ superClassDec + ", " + "[classDec] = " + classDec + ".");
		}
		TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(
				ruleresult, superClass, typeAcc, umlClassifier, ta2g, generalization, superClassDec, classDec);
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge ta2g__generalization____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge generalization__superClass____general = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeAcc__superClassDec____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge umlClassifier__generalization____generalization = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge generalization__umlClassifier____specific = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge classDec__typeAcc____superClass = (EMoflonEdge) result3_green[15];

		// 
		// 
		TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, superClass, typeAcc, cd2c2, umlClassifier, cd2c, ta2g, generalization, superClassDec,
				classDec);
		return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result2_binding[0];
		Classifier umlClassifier = (Classifier) result2_binding[1];
		Generalization generalization = (Generalization) result2_binding[2];
		for (Object[] result2_black : TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_12_2_corematch_blackBFBFBFFB(superClass, umlClassifier,
						generalization, match)) {
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[1];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[3];
			Type superClassDec = (Type) result2_black[5];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[6];
			// ForEach 
			for (Object[] result3_black : TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_12_3_findcontext_blackBBBBBBB(superClass, cd2c2, umlClassifier,
							cd2c, generalization, superClassDec, classDec)) {
				Object[] result3_green = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_12_3_findcontext_greenBBBBBBBFFFFFFFF(superClass, cd2c2,
								umlClassifier, cd2c, generalization, superClassDec, classDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge cd2c2__superClass____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge cd2c__umlClassifier____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge generalization__superClass____general = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge cd2c2__superClassDec____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge umlClassifier__generalization____generalization = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge generalization__umlClassifier____specific = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, superClass, cd2c2, umlClassifier, cd2c, generalization,
								superClassDec, classDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[superClass] = " + superClass
							+ ", " + "[cd2c2] = " + cd2c2 + ", " + "[umlClassifier] = " + umlClassifier + ", "
							+ "[cd2c] = " + cd2c + ", " + "[generalization] = " + generalization + ", "
							+ "[superClassDec] = " + superClassDec + ", " + "[classDec] = " + classDec + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = TypeAccess2GeneralizationImpl
							.pattern_TypeAccess2Generalization_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier,
			Generalization generalization) {
		match.registerObject("superClass", superClass);
		match.registerObject("umlClassifier", umlClassifier);
		match.registerObject("generalization", generalization);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier,
			Generalization generalization) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class superClass,
			ASTNode2Element cd2c2, Classifier umlClassifier, ASTNode2Element cd2c, Generalization generalization,
			Type superClassDec, ClassDeclaration classDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("superClass", superClass);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("umlClassifier", umlClassifier);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("generalization", generalization);
		isApplicableMatch.registerObject("superClassDec", superClassDec);
		isApplicableMatch.registerObject("classDec", classDec);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject superClass, EObject typeAcc, EObject cd2c2,
			EObject umlClassifier, EObject cd2c, EObject ta2g, EObject generalization, EObject superClassDec,
			EObject classDec) {
		ruleresult.registerObject("superClass", superClass);
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("cd2c2", cd2c2);
		ruleresult.registerObject("umlClassifier", umlClassifier);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("generalization", generalization);
		ruleresult.registerObject("superClassDec", superClassDec);
		ruleresult.registerObject("classDec", classDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("generalization").eClass())
				.equals("uml.Generalization.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_117(EMoflonEdge _edge_general) {

		Object[] result1_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_20_2_testcorematchandDECs_blackFFFB(_edge_general)) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result2_black[0];
			Classifier umlClassifier = (Classifier) result2_black[1];
			Generalization generalization = (Generalization) result2_black[2];
			Object[] result2_green = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, superClass, umlClassifier, generalization)) {
				// 
				if (TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccess2GeneralizationImpl
							.pattern_TypeAccess2Generalization_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_127(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			TypeAccess typeAcc = (TypeAccess) result2_black[0];
			Type superClassDec = (Type) result2_black[1];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[2];
			Object[] result2_green = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, typeAcc, superClassDec, classDec)) {
				// 
				if (TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccess2GeneralizationImpl
							.pattern_TypeAccess2Generalization_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeAccess2Generalization");
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
		ruleResult.setRule("TypeAccess2Generalization");
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

		Object[] result1_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[0];
		TypeAccess typeAcc = (TypeAccess) result2_bindingAndBlack[1];
		Classifier umlClassifier = (Classifier) result2_bindingAndBlack[2];
		Generalization generalization = (Generalization) result2_bindingAndBlack[3];
		Type superClassDec = (Type) result2_bindingAndBlack[4];
		ClassDeclaration classDec = (ClassDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, superClass, typeAcc,
						umlClassifier, generalization, superClassDec, classDec, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[superClass] = " + superClass + ", " + "[typeAcc] = " + typeAcc + ", " + "[umlClassifier] = "
					+ umlClassifier + ", " + "[generalization] = " + generalization + ", " + "[superClassDec] = "
					+ superClassDec + ", " + "[classDec] = " + classDec + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_24_5_matchcorrcontext_blackBFBFBBBB(superClass, umlClassifier,
							superClassDec, classDec, sourceMatch, targetMatch)) {
				ASTNode2Element cd2c2 = (ASTNode2Element) result5_black[1];
				ASTNode2Element cd2c = (ASTNode2Element) result5_black[3];
				Object[] result5_green = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_24_5_matchcorrcontext_greenBBBBF(cd2c2, cd2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_24_6_createcorrespondence_blackBBBBBBB(superClass, typeAcc,
								umlClassifier, generalization, superClassDec, classDec, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[superClass] = "
							+ superClass + ", " + "[typeAcc] = " + typeAcc + ", " + "[umlClassifier] = " + umlClassifier
							+ ", " + "[generalization] = " + generalization + ", " + "[superClassDec] = "
							+ superClassDec + ", " + "[classDec] = " + classDec + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_24_6_createcorrespondence_greenBFBB(
						typeAcc, generalization, ccMatch);
				//nothing org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2Generalization) result6_green[1];

				Object[] result7_black = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Class superClass, TypeAccess typeAcc,
			Classifier umlClassifier, Generalization generalization, Type superClassDec, ClassDeclaration classDec,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(TypeAccess typeAcc, Type superClassDec, ClassDeclaration classDec) {// 
		Object[] result1_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_27_1_matchtggpattern_blackBBB(typeAcc, superClassDec, classDec);
		if (result1_black != null) {
			return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_27_2_expressionF();
		} else {
			return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier,
			Generalization generalization) {// 
		Object[] result1_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_28_1_matchtggpattern_blackBBB(superClass, umlClassifier,
						generalization);
		if (result1_black != null) {
			return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_28_2_expressionF();
		} else {
			return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element cd2c2Parameter,
			ASTNode2Element cd2cParameter) {

		Object[] result1_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList cd2c2List = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result2_black[1];
			ASTNode2Element cd2c2 = (ASTNode2Element) result2_black[2];
			Type superClassDec = (Type) result2_black[3];
			//nothing RuleEntryList cd2cList = (RuleEntryList) result2_black[4];
			Classifier umlClassifier = (Classifier) result2_black[5];
			ASTNode2Element cd2c = (ASTNode2Element) result2_black[6];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							superClass, cd2c2, umlClassifier, cd2c, superClassDec, classDec, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[superClass] = " + superClass + ", "
						+ "[cd2c2] = " + cd2c2 + ", " + "[umlClassifier] = " + umlClassifier + ", " + "[cd2c] = " + cd2c
						+ ", " + "[superClassDec] = " + superClassDec + ", " + "[classDec] = " + classDec + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_29_5_checknacs_blackBBBBBB(superClass, cd2c2, umlClassifier,
								cd2c, superClassDec, classDec);
				if (result5_black != null) {

					Object[] result6_black = TypeAccess2GeneralizationImpl
							.pattern_TypeAccess2Generalization_29_6_perform_blackBBBBBBB(superClass, cd2c2,
									umlClassifier, cd2c, superClassDec, classDec, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[superClass] = "
								+ superClass + ", " + "[cd2c2] = " + cd2c2 + ", " + "[umlClassifier] = " + umlClassifier
								+ ", " + "[cd2c] = " + cd2c + ", " + "[superClassDec] = " + superClassDec + ", "
								+ "[classDec] = " + classDec + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_29_6_perform_greenBFBFFBBB(
							superClass, umlClassifier, superClassDec, classDec, ruleResult);
					//nothing TypeAccess typeAcc = (TypeAccess) result6_green[1];
					//nothing org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2Generalization) result6_green[3];
					//nothing Generalization generalization = (Generalization) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class superClass,
			ASTNode2Element cd2c2, Classifier umlClassifier, ASTNode2Element cd2c, Type superClassDec,
			ClassDeclaration classDec, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("superClass", superClass);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("umlClassifier", umlClassifier);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("superClassDec", superClassDec);
		isApplicableMatch.registerObject("classDec", classDec);
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
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_TYPE_CLASSDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1), (Type) arguments.get(2),
					(ClassDeclaration) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_TYPE_CLASSDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1), (Type) arguments.get(2),
					(ClassDeclaration) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_TYPE_CLASSDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2), (ClassDeclaration) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASS_TYPEACCESS_ASTNODE2ELEMENT_CLASSIFIER_ASTNODE2ELEMENT_TYPE_CLASSDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (TypeAccess) arguments.get(2),
					(ASTNode2Element) arguments.get(3), (Classifier) arguments.get(4),
					(ASTNode2Element) arguments.get(5), (Type) arguments.get(6), (ClassDeclaration) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_BWD__MATCH_CLASS_CLASSIFIER_GENERALIZATION:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Classifier) arguments.get(2), (Generalization) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASS_CLASSIFIER_GENERALIZATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Classifier) arguments.get(2), (Generalization) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASS_CLASSIFIER_GENERALIZATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Classifier) arguments.get(2), (Generalization) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_ASTNODE2ELEMENT_CLASSIFIER_ASTNODE2ELEMENT_GENERALIZATION_TYPE_CLASSDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(Classifier) arguments.get(3), (ASTNode2Element) arguments.get(4),
					(Generalization) arguments.get(5), (Type) arguments.get(6), (ClassDeclaration) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_117__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_117((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_127__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_127((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_SOLVE_CSP_CC__CLASS_TYPEACCESS_CLASSIFIER_GENERALIZATION_TYPE_CLASSDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Class) arguments.get(0),
					(TypeAccess) arguments.get(1), (Classifier) arguments.get(2), (Generalization) arguments.get(3),
					(Type) arguments.get(4), (ClassDeclaration) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___CHECK_DEC_FWD__TYPEACCESS_TYPE_CLASSDECLARATION:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (Type) arguments.get(1),
					(ClassDeclaration) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___CHECK_DEC_BWD__CLASS_CLASSIFIER_GENERALIZATION:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0), (Classifier) arguments.get(1),
					(Generalization) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_ASTNODE2ELEMENT_CLASSIFIER_ASTNODE2ELEMENT_TYPE_CLASSDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(Classifier) arguments.get(3), (ASTNode2Element) arguments.get(4), (Type) arguments.get(5),
					(ClassDeclaration) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_1_initialbindings_blackBBBBB(
			TypeAccess2Generalization _this, Match match, TypeAccess typeAcc, Type superClassDec,
			ClassDeclaration classDec) {
		if (!classDec.equals(superClassDec)) {
			return new Object[] { _this, match, typeAcc, superClassDec, classDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_2_SolveCSP_bindingFBBBBB(
			TypeAccess2Generalization _this, Match match, TypeAccess typeAcc, Type superClassDec,
			ClassDeclaration classDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, typeAcc, superClassDec, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeAcc, superClassDec, classDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2Generalization _this, Match match, TypeAccess typeAcc, Type superClassDec,
			ClassDeclaration classDec) {
		Object[] result_pattern_TypeAccess2Generalization_0_2_SolveCSP_binding = pattern_TypeAccess2Generalization_0_2_SolveCSP_bindingFBBBBB(
				_this, match, typeAcc, superClassDec, classDec);
		if (result_pattern_TypeAccess2Generalization_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_0_2_SolveCSP_black = pattern_TypeAccess2Generalization_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeAcc, superClassDec, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2Generalization_0_3_CheckCSP_expressionFBB(
			TypeAccess2Generalization _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_4_collectelementstobetranslated_blackBBBB(
			Match match, TypeAccess typeAcc, Type superClassDec, ClassDeclaration classDec) {
		if (!classDec.equals(superClassDec)) {
			return new Object[] { match, typeAcc, superClassDec, classDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TypeAccess typeAcc, Type superClassDec, ClassDeclaration classDec) {
		EMoflonEdge typeAcc__superClassDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeAcc);
		String typeAcc__superClassDec____type_name_prime = "type";
		String superClassDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String classDec__typeAcc____superClass_name_prime = "superClass";
		typeAcc__superClassDec____type.setSrc(typeAcc);
		typeAcc__superClassDec____type.setTrg(superClassDec);
		match.getToBeTranslatedEdges().add(typeAcc__superClassDec____type);
		superClassDec__typeAcc____usagesInTypeAccess.setSrc(superClassDec);
		superClassDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		match.getToBeTranslatedEdges().add(superClassDec__typeAcc____usagesInTypeAccess);
		classDec__typeAcc____superClass.setSrc(classDec);
		classDec__typeAcc____superClass.setTrg(typeAcc);
		match.getToBeTranslatedEdges().add(classDec__typeAcc____superClass);
		typeAcc__superClassDec____type.setName(typeAcc__superClassDec____type_name_prime);
		superClassDec__typeAcc____usagesInTypeAccess.setName(superClassDec__typeAcc____usagesInTypeAccess_name_prime);
		classDec__typeAcc____superClass.setName(classDec__typeAcc____superClass_name_prime);
		return new Object[] { match, typeAcc, superClassDec, classDec, typeAcc__superClassDec____type,
				superClassDec__typeAcc____usagesInTypeAccess, classDec__typeAcc____superClass };
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_5_collectcontextelements_blackBBBB(Match match,
			TypeAccess typeAcc, Type superClassDec, ClassDeclaration classDec) {
		if (!classDec.equals(superClassDec)) {
			return new Object[] { match, typeAcc, superClassDec, classDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_5_collectcontextelements_greenBBB(Match match,
			Type superClassDec, ClassDeclaration classDec) {
		match.getContextNodes().add(superClassDec);
		match.getContextNodes().add(classDec);
		return new Object[] { match, superClassDec, classDec };
	}

	public static final void pattern_TypeAccess2Generalization_0_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2Generalization _this, Match match, TypeAccess typeAcc, Type superClassDec,
			ClassDeclaration classDec) {
		_this.registerObjectsToMatch_FWD(match, typeAcc, superClassDec, classDec);

	}

	public static final boolean pattern_TypeAccess2Generalization_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2Generalization_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("superClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeAcc");
		EObject _localVariable_2 = isApplicableMatch.getObject("cd2c2");
		EObject _localVariable_3 = isApplicableMatch.getObject("umlClassifier");
		EObject _localVariable_4 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("superClassDec");
		EObject _localVariable_6 = isApplicableMatch.getObject("classDec");
		EObject tmpSuperClass = _localVariable_0;
		EObject tmpTypeAcc = _localVariable_1;
		EObject tmpCd2c2 = _localVariable_2;
		EObject tmpUmlClassifier = _localVariable_3;
		EObject tmpCd2c = _localVariable_4;
		EObject tmpSuperClassDec = _localVariable_5;
		EObject tmpClassDec = _localVariable_6;
		if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
			if (tmpTypeAcc instanceof TypeAccess) {
				TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
				if (tmpCd2c2 instanceof ASTNode2Element) {
					ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
					if (tmpUmlClassifier instanceof Classifier) {
						Classifier umlClassifier = (Classifier) tmpUmlClassifier;
						if (tmpCd2c instanceof ASTNode2Element) {
							ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
							if (tmpSuperClassDec instanceof Type) {
								Type superClassDec = (Type) tmpSuperClassDec;
								if (tmpClassDec instanceof ClassDeclaration) {
									ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
									return new Object[] { superClass, typeAcc, cd2c2, umlClassifier, cd2c,
											superClassDec, classDec, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_1_performtransformation_blackBBBBBBBFBB(
			org.eclipse.uml2.uml.Class superClass, TypeAccess typeAcc, ASTNode2Element cd2c2, Classifier umlClassifier,
			ASTNode2Element cd2c, Type superClassDec, ClassDeclaration classDec, TypeAccess2Generalization _this,
			IsApplicableMatch isApplicableMatch) {
		if (!superClass.equals(umlClassifier)) {
			if (!cd2c.equals(cd2c2)) {
				if (!classDec.equals(superClassDec)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { superClass, typeAcc, cd2c2, umlClassifier, cd2c, superClassDec,
									classDec, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding = pattern_TypeAccess2Generalization_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[0];
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[1];
			ASTNode2Element cd2c2 = (ASTNode2Element) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[2];
			Classifier umlClassifier = (Classifier) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[3];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[4];
			Type superClassDec = (Type) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[5];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2Generalization_1_1_performtransformation_black = pattern_TypeAccess2Generalization_1_1_performtransformation_blackBBBBBBBFBB(
					superClass, typeAcc, cd2c2, umlClassifier, cd2c, superClassDec, classDec, _this, isApplicableMatch);
			if (result_pattern_TypeAccess2Generalization_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2Generalization_1_1_performtransformation_black[7];

				return new Object[] { superClass, typeAcc, cd2c2, umlClassifier, cd2c, superClassDec, classDec, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_1_performtransformation_greenBBBFF(
			org.eclipse.uml2.uml.Class superClass, TypeAccess typeAcc, Classifier umlClassifier) {
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2Generalization();
		Generalization generalization = UMLFactory.eINSTANCE.createGeneralization();
		ta2g.setSource(typeAcc);
		ta2g.setTarget(generalization);
		generalization.setGeneral(superClass);
		umlClassifier.getGeneralizations().add(generalization);
		return new Object[] { superClass, typeAcc, umlClassifier, ta2g, generalization };
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_2_collecttranslatedelements_blackBBB(
			TypeAccess typeAcc, org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g,
			Generalization generalization) {
		return new Object[] { typeAcc, ta2g, generalization };
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_2_collecttranslatedelements_greenFBBB(
			TypeAccess typeAcc, org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g,
			Generalization generalization) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(typeAcc);
		ruleresult.getCreatedLinkElements().add(ta2g);
		ruleresult.getCreatedElements().add(generalization);
		return new Object[] { ruleresult, typeAcc, ta2g, generalization };
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject superClass, EObject typeAcc, EObject cd2c2, EObject umlClassifier,
			EObject cd2c, EObject ta2g, EObject generalization, EObject superClassDec, EObject classDec) {
		if (!superClass.equals(typeAcc)) {
			if (!superClass.equals(umlClassifier)) {
				if (!superClass.equals(ta2g)) {
					if (!superClass.equals(superClassDec)) {
						if (!typeAcc.equals(umlClassifier)) {
							if (!cd2c2.equals(superClass)) {
								if (!cd2c2.equals(typeAcc)) {
									if (!cd2c2.equals(umlClassifier)) {
										if (!cd2c2.equals(ta2g)) {
											if (!cd2c2.equals(generalization)) {
												if (!cd2c2.equals(superClassDec)) {
													if (!cd2c2.equals(classDec)) {
														if (!cd2c.equals(superClass)) {
															if (!cd2c.equals(typeAcc)) {
																if (!cd2c.equals(cd2c2)) {
																	if (!cd2c.equals(umlClassifier)) {
																		if (!cd2c.equals(ta2g)) {
																			if (!cd2c.equals(generalization)) {
																				if (!cd2c.equals(superClassDec)) {
																					if (!cd2c.equals(classDec)) {
																						if (!ta2g.equals(typeAcc)) {
																							if (!ta2g.equals(
																									umlClassifier)) {
																								if (!generalization
																										.equals(superClass)) {
																									if (!generalization
																											.equals(typeAcc)) {
																										if (!generalization
																												.equals(umlClassifier)) {
																											if (!generalization
																													.equals(ta2g)) {
																												if (!generalization
																														.equals(superClassDec)) {
																													if (!superClassDec
																															.equals(typeAcc)) {
																														if (!superClassDec
																																.equals(umlClassifier)) {
																															if (!superClassDec
																																	.equals(ta2g)) {
																																if (!classDec
																																		.equals(superClass)) {
																																	if (!classDec
																																			.equals(typeAcc)) {
																																		if (!classDec
																																				.equals(umlClassifier)) {
																																			if (!classDec
																																					.equals(ta2g)) {
																																				if (!classDec
																																						.equals(generalization)) {
																																					if (!classDec
																																							.equals(superClassDec)) {
																																						return new Object[] {
																																								ruleresult,
																																								superClass,
																																								typeAcc,
																																								cd2c2,
																																								umlClassifier,
																																								cd2c,
																																								ta2g,
																																								generalization,
																																								superClassDec,
																																								classDec };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeAccess2Generalization_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject superClass, EObject typeAcc, EObject umlClassifier, EObject ta2g,
			EObject generalization, EObject superClassDec, EObject classDec) {
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__generalization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__superClass____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superClassDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClassifier__generalization____generalization = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__umlClassifier____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2Generalization";
		String ta2g__typeAcc____source_name_prime = "source";
		String ta2g__generalization____target_name_prime = "target";
		String generalization__superClass____general_name_prime = "general";
		String typeAcc__superClassDec____type_name_prime = "type";
		String superClassDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String umlClassifier__generalization____generalization_name_prime = "generalization";
		String generalization__umlClassifier____specific_name_prime = "specific";
		String classDec__typeAcc____superClass_name_prime = "superClass";
		ta2g__typeAcc____source.setSrc(ta2g);
		ta2g__typeAcc____source.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(ta2g__typeAcc____source);
		ta2g__generalization____target.setSrc(ta2g);
		ta2g__generalization____target.setTrg(generalization);
		ruleresult.getCreatedEdges().add(ta2g__generalization____target);
		generalization__superClass____general.setSrc(generalization);
		generalization__superClass____general.setTrg(superClass);
		ruleresult.getCreatedEdges().add(generalization__superClass____general);
		typeAcc__superClassDec____type.setSrc(typeAcc);
		typeAcc__superClassDec____type.setTrg(superClassDec);
		ruleresult.getTranslatedEdges().add(typeAcc__superClassDec____type);
		superClassDec__typeAcc____usagesInTypeAccess.setSrc(superClassDec);
		superClassDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(superClassDec__typeAcc____usagesInTypeAccess);
		umlClassifier__generalization____generalization.setSrc(umlClassifier);
		umlClassifier__generalization____generalization.setTrg(generalization);
		ruleresult.getCreatedEdges().add(umlClassifier__generalization____generalization);
		generalization__umlClassifier____specific.setSrc(generalization);
		generalization__umlClassifier____specific.setTrg(umlClassifier);
		ruleresult.getCreatedEdges().add(generalization__umlClassifier____specific);
		classDec__typeAcc____superClass.setSrc(classDec);
		classDec__typeAcc____superClass.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(classDec__typeAcc____superClass);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		ta2g__generalization____target.setName(ta2g__generalization____target_name_prime);
		generalization__superClass____general.setName(generalization__superClass____general_name_prime);
		typeAcc__superClassDec____type.setName(typeAcc__superClassDec____type_name_prime);
		superClassDec__typeAcc____usagesInTypeAccess.setName(superClassDec__typeAcc____usagesInTypeAccess_name_prime);
		umlClassifier__generalization____generalization
				.setName(umlClassifier__generalization____generalization_name_prime);
		generalization__umlClassifier____specific.setName(generalization__umlClassifier____specific_name_prime);
		classDec__typeAcc____superClass.setName(classDec__typeAcc____superClass_name_prime);
		return new Object[] { ruleresult, superClass, typeAcc, umlClassifier, ta2g, generalization, superClassDec,
				classDec, ta2g__typeAcc____source, ta2g__generalization____target,
				generalization__superClass____general, typeAcc__superClassDec____type,
				superClassDec__typeAcc____usagesInTypeAccess, umlClassifier__generalization____generalization,
				generalization__umlClassifier____specific, classDec__typeAcc____superClass };
	}

	public static final void pattern_TypeAccess2Generalization_1_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2Generalization _this, PerformRuleResult ruleresult, EObject superClass, EObject typeAcc,
			EObject cd2c2, EObject umlClassifier, EObject cd2c, EObject ta2g, EObject generalization,
			EObject superClassDec, EObject classDec) {
		_this.registerObjects_FWD(ruleresult, superClass, typeAcc, cd2c2, umlClassifier, cd2c, ta2g, generalization,
				superClassDec, classDec);

	}

	public static final PerformRuleResult pattern_TypeAccess2Generalization_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_1_preparereturnvalue_bindingFB(
			TypeAccess2Generalization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeAccess2Generalization _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccess2Generalization _this) {
		Object[] result_pattern_TypeAccess2Generalization_2_1_preparereturnvalue_binding = pattern_TypeAccess2Generalization_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2Generalization_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccess2Generalization_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_2_1_preparereturnvalue_black = pattern_TypeAccess2Generalization_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccess2Generalization_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccess2Generalization_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccess2Generalization";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("typeAcc");
		EObject _localVariable_1 = match.getObject("superClassDec");
		EObject _localVariable_2 = match.getObject("classDec");
		EObject tmpTypeAcc = _localVariable_0;
		EObject tmpSuperClassDec = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		if (tmpTypeAcc instanceof TypeAccess) {
			TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
			if (tmpSuperClassDec instanceof Type) {
				Type superClassDec = (Type) tmpSuperClassDec;
				if (tmpClassDec instanceof ClassDeclaration) {
					ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
					return new Object[] { typeAcc, superClassDec, classDec, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_2_2_corematch_blackFBFFFBBB(
			TypeAccess typeAcc, Type superClassDec, ClassDeclaration classDec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!classDec.equals(superClassDec)) {
			for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(superClassDec, ASTNode2Element.class, "source")) {
				Element tmpSuperClass = cd2c2.getTarget();
				if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
					for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(classDec, ASTNode2Element.class, "source")) {
						if (!cd2c.equals(cd2c2)) {
							Element tmpUmlClassifier = cd2c.getTarget();
							if (tmpUmlClassifier instanceof Classifier) {
								Classifier umlClassifier = (Classifier) tmpUmlClassifier;
								if (!superClass.equals(umlClassifier)) {
									_result.add(new Object[] { superClass, typeAcc, cd2c2, umlClassifier, cd2c,
											superClassDec, classDec, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_2_3_findcontext_blackBBBBBBB(
			org.eclipse.uml2.uml.Class superClass, TypeAccess typeAcc, ASTNode2Element cd2c2, Classifier umlClassifier,
			ASTNode2Element cd2c, Type superClassDec, ClassDeclaration classDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!superClass.equals(umlClassifier)) {
			if (!cd2c.equals(cd2c2)) {
				if (!classDec.equals(superClassDec)) {
					if (superClass.equals(cd2c2.getTarget())) {
						if (umlClassifier.equals(cd2c.getTarget())) {
							if (superClassDec.equals(cd2c2.getSource())) {
								if (superClassDec.equals(typeAcc.getType())) {
									if (typeAcc.equals(classDec.getSuperClass())) {
										if (classDec.equals(cd2c.getSource())) {
											_result.add(new Object[] { superClass, typeAcc, cd2c2, umlClassifier, cd2c,
													superClassDec, classDec });
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

	public static final Object[] pattern_TypeAccess2Generalization_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			org.eclipse.uml2.uml.Class superClass, TypeAccess typeAcc, ASTNode2Element cd2c2, Classifier umlClassifier,
			ASTNode2Element cd2c, Type superClassDec, ClassDeclaration classDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cd2c2__superClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClassifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superClassDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superClassDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cd2c2__superClass____target_name_prime = "target";
		String cd2c__umlClassifier____target_name_prime = "target";
		String cd2c2__superClassDec____source_name_prime = "source";
		String typeAcc__superClassDec____type_name_prime = "type";
		String superClassDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String classDec__typeAcc____superClass_name_prime = "superClass";
		String cd2c__classDec____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(superClass);
		isApplicableMatch.getAllContextElements().add(typeAcc);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		isApplicableMatch.getAllContextElements().add(umlClassifier);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(superClassDec);
		isApplicableMatch.getAllContextElements().add(classDec);
		cd2c2__superClass____target.setSrc(cd2c2);
		cd2c2__superClass____target.setTrg(superClass);
		isApplicableMatch.getAllContextElements().add(cd2c2__superClass____target);
		cd2c__umlClassifier____target.setSrc(cd2c);
		cd2c__umlClassifier____target.setTrg(umlClassifier);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClassifier____target);
		cd2c2__superClassDec____source.setSrc(cd2c2);
		cd2c2__superClassDec____source.setTrg(superClassDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superClassDec____source);
		typeAcc__superClassDec____type.setSrc(typeAcc);
		typeAcc__superClassDec____type.setTrg(superClassDec);
		isApplicableMatch.getAllContextElements().add(typeAcc__superClassDec____type);
		superClassDec__typeAcc____usagesInTypeAccess.setSrc(superClassDec);
		superClassDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(superClassDec__typeAcc____usagesInTypeAccess);
		classDec__typeAcc____superClass.setSrc(classDec);
		classDec__typeAcc____superClass.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(classDec__typeAcc____superClass);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c2__superClass____target.setName(cd2c2__superClass____target_name_prime);
		cd2c__umlClassifier____target.setName(cd2c__umlClassifier____target_name_prime);
		cd2c2__superClassDec____source.setName(cd2c2__superClassDec____source_name_prime);
		typeAcc__superClassDec____type.setName(typeAcc__superClassDec____type_name_prime);
		superClassDec__typeAcc____usagesInTypeAccess.setName(superClassDec__typeAcc____usagesInTypeAccess_name_prime);
		classDec__typeAcc____superClass.setName(classDec__typeAcc____superClass_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		return new Object[] { superClass, typeAcc, cd2c2, umlClassifier, cd2c, superClassDec, classDec,
				isApplicableMatch, cd2c2__superClass____target, cd2c__umlClassifier____target,
				cd2c2__superClassDec____source, typeAcc__superClassDec____type,
				superClassDec__typeAcc____usagesInTypeAccess, classDec__typeAcc____superClass,
				cd2c__classDec____source };
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class superClass,
			TypeAccess typeAcc, ASTNode2Element cd2c2, Classifier umlClassifier, ASTNode2Element cd2c,
			Type superClassDec, ClassDeclaration classDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, superClass, typeAcc, cd2c2,
				umlClassifier, cd2c, superClassDec, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, superClass, typeAcc, cd2c2, umlClassifier, cd2c,
					superClassDec, classDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class superClass,
			TypeAccess typeAcc, ASTNode2Element cd2c2, Classifier umlClassifier, ASTNode2Element cd2c,
			Type superClassDec, ClassDeclaration classDec) {
		Object[] result_pattern_TypeAccess2Generalization_2_4_solveCSP_binding = pattern_TypeAccess2Generalization_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, superClass, typeAcc, cd2c2, umlClassifier, cd2c, superClassDec, classDec);
		if (result_pattern_TypeAccess2Generalization_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_2_4_solveCSP_black = pattern_TypeAccess2Generalization_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, superClass, typeAcc, cd2c2, umlClassifier, cd2c,
						superClassDec, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2Generalization_2_5_checkCSP_expressionFBB(
			TypeAccess2Generalization _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccess2Generalization";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2Generalization_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_1_initialbindings_blackBBBBB(
			TypeAccess2Generalization _this, Match match, org.eclipse.uml2.uml.Class superClass,
			Classifier umlClassifier, Generalization generalization) {
		if (!superClass.equals(umlClassifier)) {
			return new Object[] { _this, match, superClass, umlClassifier, generalization };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_2_SolveCSP_bindingFBBBBB(
			TypeAccess2Generalization _this, Match match, org.eclipse.uml2.uml.Class superClass,
			Classifier umlClassifier, Generalization generalization) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, superClass, umlClassifier, generalization);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, superClass, umlClassifier, generalization };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2Generalization _this, Match match, org.eclipse.uml2.uml.Class superClass,
			Classifier umlClassifier, Generalization generalization) {
		Object[] result_pattern_TypeAccess2Generalization_10_2_SolveCSP_binding = pattern_TypeAccess2Generalization_10_2_SolveCSP_bindingFBBBBB(
				_this, match, superClass, umlClassifier, generalization);
		if (result_pattern_TypeAccess2Generalization_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_10_2_SolveCSP_black = pattern_TypeAccess2Generalization_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, superClass, umlClassifier, generalization };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2Generalization_10_3_CheckCSP_expressionFBB(
			TypeAccess2Generalization _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_4_collectelementstobetranslated_blackBBBB(
			Match match, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier,
			Generalization generalization) {
		if (!superClass.equals(umlClassifier)) {
			return new Object[] { match, superClass, umlClassifier, generalization };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier,
			Generalization generalization) {
		EMoflonEdge generalization__superClass____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClassifier__generalization____generalization = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__umlClassifier____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(generalization);
		String generalization__superClass____general_name_prime = "general";
		String umlClassifier__generalization____generalization_name_prime = "generalization";
		String generalization__umlClassifier____specific_name_prime = "specific";
		generalization__superClass____general.setSrc(generalization);
		generalization__superClass____general.setTrg(superClass);
		match.getToBeTranslatedEdges().add(generalization__superClass____general);
		umlClassifier__generalization____generalization.setSrc(umlClassifier);
		umlClassifier__generalization____generalization.setTrg(generalization);
		match.getToBeTranslatedEdges().add(umlClassifier__generalization____generalization);
		generalization__umlClassifier____specific.setSrc(generalization);
		generalization__umlClassifier____specific.setTrg(umlClassifier);
		match.getToBeTranslatedEdges().add(generalization__umlClassifier____specific);
		generalization__superClass____general.setName(generalization__superClass____general_name_prime);
		umlClassifier__generalization____generalization
				.setName(umlClassifier__generalization____generalization_name_prime);
		generalization__umlClassifier____specific.setName(generalization__umlClassifier____specific_name_prime);
		return new Object[] { match, superClass, umlClassifier, generalization, generalization__superClass____general,
				umlClassifier__generalization____generalization, generalization__umlClassifier____specific };
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_5_collectcontextelements_blackBBBB(Match match,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier, Generalization generalization) {
		if (!superClass.equals(umlClassifier)) {
			return new Object[] { match, superClass, umlClassifier, generalization };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_5_collectcontextelements_greenBBB(Match match,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {
		match.getContextNodes().add(superClass);
		match.getContextNodes().add(umlClassifier);
		return new Object[] { match, superClass, umlClassifier };
	}

	public static final void pattern_TypeAccess2Generalization_10_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2Generalization _this, Match match, org.eclipse.uml2.uml.Class superClass,
			Classifier umlClassifier, Generalization generalization) {
		_this.registerObjectsToMatch_BWD(match, superClass, umlClassifier, generalization);

	}

	public static final boolean pattern_TypeAccess2Generalization_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2Generalization_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("superClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("cd2c2");
		EObject _localVariable_2 = isApplicableMatch.getObject("umlClassifier");
		EObject _localVariable_3 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_4 = isApplicableMatch.getObject("generalization");
		EObject _localVariable_5 = isApplicableMatch.getObject("superClassDec");
		EObject _localVariable_6 = isApplicableMatch.getObject("classDec");
		EObject tmpSuperClass = _localVariable_0;
		EObject tmpCd2c2 = _localVariable_1;
		EObject tmpUmlClassifier = _localVariable_2;
		EObject tmpCd2c = _localVariable_3;
		EObject tmpGeneralization = _localVariable_4;
		EObject tmpSuperClassDec = _localVariable_5;
		EObject tmpClassDec = _localVariable_6;
		if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
			if (tmpCd2c2 instanceof ASTNode2Element) {
				ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
				if (tmpUmlClassifier instanceof Classifier) {
					Classifier umlClassifier = (Classifier) tmpUmlClassifier;
					if (tmpCd2c instanceof ASTNode2Element) {
						ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
						if (tmpGeneralization instanceof Generalization) {
							Generalization generalization = (Generalization) tmpGeneralization;
							if (tmpSuperClassDec instanceof Type) {
								Type superClassDec = (Type) tmpSuperClassDec;
								if (tmpClassDec instanceof ClassDeclaration) {
									ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
									return new Object[] { superClass, cd2c2, umlClassifier, cd2c, generalization,
											superClassDec, classDec, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_1_performtransformation_blackBBBBBBBFBB(
			org.eclipse.uml2.uml.Class superClass, ASTNode2Element cd2c2, Classifier umlClassifier,
			ASTNode2Element cd2c, Generalization generalization, Type superClassDec, ClassDeclaration classDec,
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch) {
		if (!superClass.equals(umlClassifier)) {
			if (!cd2c.equals(cd2c2)) {
				if (!classDec.equals(superClassDec)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { superClass, cd2c2, umlClassifier, cd2c, generalization, superClassDec,
									classDec, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding = pattern_TypeAccess2Generalization_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[0];
			ASTNode2Element cd2c2 = (ASTNode2Element) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[1];
			Classifier umlClassifier = (Classifier) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[2];
			ASTNode2Element cd2c = (ASTNode2Element) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[3];
			Generalization generalization = (Generalization) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[4];
			Type superClassDec = (Type) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[5];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2Generalization_11_1_performtransformation_black = pattern_TypeAccess2Generalization_11_1_performtransformation_blackBBBBBBBFBB(
					superClass, cd2c2, umlClassifier, cd2c, generalization, superClassDec, classDec, _this,
					isApplicableMatch);
			if (result_pattern_TypeAccess2Generalization_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2Generalization_11_1_performtransformation_black[7];

				return new Object[] { superClass, cd2c2, umlClassifier, cd2c, generalization, superClassDec, classDec,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_1_performtransformation_greenFFBBB(
			Generalization generalization, Type superClassDec, ClassDeclaration classDec) {
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2Generalization();
		typeAcc.setType(superClassDec);
		classDec.setSuperClass(typeAcc);
		ta2g.setSource(typeAcc);
		ta2g.setTarget(generalization);
		return new Object[] { typeAcc, ta2g, generalization, superClassDec, classDec };
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_2_collecttranslatedelements_blackBBB(
			TypeAccess typeAcc, org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g,
			Generalization generalization) {
		return new Object[] { typeAcc, ta2g, generalization };
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_2_collecttranslatedelements_greenFBBB(
			TypeAccess typeAcc, org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g,
			Generalization generalization) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(typeAcc);
		ruleresult.getCreatedLinkElements().add(ta2g);
		ruleresult.getTranslatedElements().add(generalization);
		return new Object[] { ruleresult, typeAcc, ta2g, generalization };
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject superClass, EObject typeAcc, EObject cd2c2, EObject umlClassifier,
			EObject cd2c, EObject ta2g, EObject generalization, EObject superClassDec, EObject classDec) {
		if (!superClass.equals(typeAcc)) {
			if (!superClass.equals(umlClassifier)) {
				if (!superClass.equals(ta2g)) {
					if (!superClass.equals(superClassDec)) {
						if (!typeAcc.equals(umlClassifier)) {
							if (!cd2c2.equals(superClass)) {
								if (!cd2c2.equals(typeAcc)) {
									if (!cd2c2.equals(umlClassifier)) {
										if (!cd2c2.equals(ta2g)) {
											if (!cd2c2.equals(generalization)) {
												if (!cd2c2.equals(superClassDec)) {
													if (!cd2c2.equals(classDec)) {
														if (!cd2c.equals(superClass)) {
															if (!cd2c.equals(typeAcc)) {
																if (!cd2c.equals(cd2c2)) {
																	if (!cd2c.equals(umlClassifier)) {
																		if (!cd2c.equals(ta2g)) {
																			if (!cd2c.equals(generalization)) {
																				if (!cd2c.equals(superClassDec)) {
																					if (!cd2c.equals(classDec)) {
																						if (!ta2g.equals(typeAcc)) {
																							if (!ta2g.equals(
																									umlClassifier)) {
																								if (!generalization
																										.equals(superClass)) {
																									if (!generalization
																											.equals(typeAcc)) {
																										if (!generalization
																												.equals(umlClassifier)) {
																											if (!generalization
																													.equals(ta2g)) {
																												if (!generalization
																														.equals(superClassDec)) {
																													if (!superClassDec
																															.equals(typeAcc)) {
																														if (!superClassDec
																																.equals(umlClassifier)) {
																															if (!superClassDec
																																	.equals(ta2g)) {
																																if (!classDec
																																		.equals(superClass)) {
																																	if (!classDec
																																			.equals(typeAcc)) {
																																		if (!classDec
																																				.equals(umlClassifier)) {
																																			if (!classDec
																																					.equals(ta2g)) {
																																				if (!classDec
																																						.equals(generalization)) {
																																					if (!classDec
																																							.equals(superClassDec)) {
																																						return new Object[] {
																																								ruleresult,
																																								superClass,
																																								typeAcc,
																																								cd2c2,
																																								umlClassifier,
																																								cd2c,
																																								ta2g,
																																								generalization,
																																								superClassDec,
																																								classDec };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeAccess2Generalization_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject superClass, EObject typeAcc, EObject umlClassifier, EObject ta2g,
			EObject generalization, EObject superClassDec, EObject classDec) {
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__generalization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__superClass____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superClassDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClassifier__generalization____generalization = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__umlClassifier____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2Generalization";
		String ta2g__typeAcc____source_name_prime = "source";
		String ta2g__generalization____target_name_prime = "target";
		String generalization__superClass____general_name_prime = "general";
		String typeAcc__superClassDec____type_name_prime = "type";
		String superClassDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String umlClassifier__generalization____generalization_name_prime = "generalization";
		String generalization__umlClassifier____specific_name_prime = "specific";
		String classDec__typeAcc____superClass_name_prime = "superClass";
		ta2g__typeAcc____source.setSrc(ta2g);
		ta2g__typeAcc____source.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(ta2g__typeAcc____source);
		ta2g__generalization____target.setSrc(ta2g);
		ta2g__generalization____target.setTrg(generalization);
		ruleresult.getCreatedEdges().add(ta2g__generalization____target);
		generalization__superClass____general.setSrc(generalization);
		generalization__superClass____general.setTrg(superClass);
		ruleresult.getTranslatedEdges().add(generalization__superClass____general);
		typeAcc__superClassDec____type.setSrc(typeAcc);
		typeAcc__superClassDec____type.setTrg(superClassDec);
		ruleresult.getCreatedEdges().add(typeAcc__superClassDec____type);
		superClassDec__typeAcc____usagesInTypeAccess.setSrc(superClassDec);
		superClassDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(superClassDec__typeAcc____usagesInTypeAccess);
		umlClassifier__generalization____generalization.setSrc(umlClassifier);
		umlClassifier__generalization____generalization.setTrg(generalization);
		ruleresult.getTranslatedEdges().add(umlClassifier__generalization____generalization);
		generalization__umlClassifier____specific.setSrc(generalization);
		generalization__umlClassifier____specific.setTrg(umlClassifier);
		ruleresult.getTranslatedEdges().add(generalization__umlClassifier____specific);
		classDec__typeAcc____superClass.setSrc(classDec);
		classDec__typeAcc____superClass.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(classDec__typeAcc____superClass);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		ta2g__generalization____target.setName(ta2g__generalization____target_name_prime);
		generalization__superClass____general.setName(generalization__superClass____general_name_prime);
		typeAcc__superClassDec____type.setName(typeAcc__superClassDec____type_name_prime);
		superClassDec__typeAcc____usagesInTypeAccess.setName(superClassDec__typeAcc____usagesInTypeAccess_name_prime);
		umlClassifier__generalization____generalization
				.setName(umlClassifier__generalization____generalization_name_prime);
		generalization__umlClassifier____specific.setName(generalization__umlClassifier____specific_name_prime);
		classDec__typeAcc____superClass.setName(classDec__typeAcc____superClass_name_prime);
		return new Object[] { ruleresult, superClass, typeAcc, umlClassifier, ta2g, generalization, superClassDec,
				classDec, ta2g__typeAcc____source, ta2g__generalization____target,
				generalization__superClass____general, typeAcc__superClassDec____type,
				superClassDec__typeAcc____usagesInTypeAccess, umlClassifier__generalization____generalization,
				generalization__umlClassifier____specific, classDec__typeAcc____superClass };
	}

	public static final void pattern_TypeAccess2Generalization_11_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2Generalization _this, PerformRuleResult ruleresult, EObject superClass, EObject typeAcc,
			EObject cd2c2, EObject umlClassifier, EObject cd2c, EObject ta2g, EObject generalization,
			EObject superClassDec, EObject classDec) {
		_this.registerObjects_BWD(ruleresult, superClass, typeAcc, cd2c2, umlClassifier, cd2c, ta2g, generalization,
				superClassDec, classDec);

	}

	public static final PerformRuleResult pattern_TypeAccess2Generalization_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_1_preparereturnvalue_bindingFB(
			TypeAccess2Generalization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeAccess2Generalization _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccess2Generalization _this) {
		Object[] result_pattern_TypeAccess2Generalization_12_1_preparereturnvalue_binding = pattern_TypeAccess2Generalization_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2Generalization_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccess2Generalization_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_12_1_preparereturnvalue_black = pattern_TypeAccess2Generalization_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccess2Generalization_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccess2Generalization_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccess2Generalization";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("superClass");
		EObject _localVariable_1 = match.getObject("umlClassifier");
		EObject _localVariable_2 = match.getObject("generalization");
		EObject tmpSuperClass = _localVariable_0;
		EObject tmpUmlClassifier = _localVariable_1;
		EObject tmpGeneralization = _localVariable_2;
		if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
			if (tmpUmlClassifier instanceof Classifier) {
				Classifier umlClassifier = (Classifier) tmpUmlClassifier;
				if (tmpGeneralization instanceof Generalization) {
					Generalization generalization = (Generalization) tmpGeneralization;
					return new Object[] { superClass, umlClassifier, generalization, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_12_2_corematch_blackBFBFBFFB(
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier, Generalization generalization,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!superClass.equals(umlClassifier)) {
			for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(superClass,
					ASTNode2Element.class, "target")) {
				ASTNode tmpSuperClassDec = cd2c2.getSource();
				if (tmpSuperClassDec instanceof Type) {
					Type superClassDec = (Type) tmpSuperClassDec;
					for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(umlClassifier, ASTNode2Element.class, "target")) {
						if (!cd2c.equals(cd2c2)) {
							ASTNode tmpClassDec = cd2c.getSource();
							if (tmpClassDec instanceof ClassDeclaration) {
								ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
								if (!classDec.equals(superClassDec)) {
									_result.add(new Object[] { superClass, cd2c2, umlClassifier, cd2c, generalization,
											superClassDec, classDec, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_12_3_findcontext_blackBBBBBBB(
			org.eclipse.uml2.uml.Class superClass, ASTNode2Element cd2c2, Classifier umlClassifier,
			ASTNode2Element cd2c, Generalization generalization, Type superClassDec, ClassDeclaration classDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!superClass.equals(umlClassifier)) {
			if (!cd2c.equals(cd2c2)) {
				if (!classDec.equals(superClassDec)) {
					if (superClass.equals(cd2c2.getTarget())) {
						if (umlClassifier.equals(cd2c.getTarget())) {
							if (superClass.equals(generalization.getGeneral())) {
								if (superClassDec.equals(cd2c2.getSource())) {
									if (umlClassifier.getGeneralizations().contains(generalization)) {
										if (classDec.equals(cd2c.getSource())) {
											_result.add(new Object[] { superClass, cd2c2, umlClassifier, cd2c,
													generalization, superClassDec, classDec });
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

	public static final Object[] pattern_TypeAccess2Generalization_12_3_findcontext_greenBBBBBBBFFFFFFFF(
			org.eclipse.uml2.uml.Class superClass, ASTNode2Element cd2c2, Classifier umlClassifier,
			ASTNode2Element cd2c, Generalization generalization, Type superClassDec, ClassDeclaration classDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cd2c2__superClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClassifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__superClass____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superClassDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClassifier__generalization____generalization = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__umlClassifier____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cd2c2__superClass____target_name_prime = "target";
		String cd2c__umlClassifier____target_name_prime = "target";
		String generalization__superClass____general_name_prime = "general";
		String cd2c2__superClassDec____source_name_prime = "source";
		String umlClassifier__generalization____generalization_name_prime = "generalization";
		String generalization__umlClassifier____specific_name_prime = "specific";
		String cd2c__classDec____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(superClass);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		isApplicableMatch.getAllContextElements().add(umlClassifier);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(generalization);
		isApplicableMatch.getAllContextElements().add(superClassDec);
		isApplicableMatch.getAllContextElements().add(classDec);
		cd2c2__superClass____target.setSrc(cd2c2);
		cd2c2__superClass____target.setTrg(superClass);
		isApplicableMatch.getAllContextElements().add(cd2c2__superClass____target);
		cd2c__umlClassifier____target.setSrc(cd2c);
		cd2c__umlClassifier____target.setTrg(umlClassifier);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClassifier____target);
		generalization__superClass____general.setSrc(generalization);
		generalization__superClass____general.setTrg(superClass);
		isApplicableMatch.getAllContextElements().add(generalization__superClass____general);
		cd2c2__superClassDec____source.setSrc(cd2c2);
		cd2c2__superClassDec____source.setTrg(superClassDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superClassDec____source);
		umlClassifier__generalization____generalization.setSrc(umlClassifier);
		umlClassifier__generalization____generalization.setTrg(generalization);
		isApplicableMatch.getAllContextElements().add(umlClassifier__generalization____generalization);
		generalization__umlClassifier____specific.setSrc(generalization);
		generalization__umlClassifier____specific.setTrg(umlClassifier);
		isApplicableMatch.getAllContextElements().add(generalization__umlClassifier____specific);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c2__superClass____target.setName(cd2c2__superClass____target_name_prime);
		cd2c__umlClassifier____target.setName(cd2c__umlClassifier____target_name_prime);
		generalization__superClass____general.setName(generalization__superClass____general_name_prime);
		cd2c2__superClassDec____source.setName(cd2c2__superClassDec____source_name_prime);
		umlClassifier__generalization____generalization
				.setName(umlClassifier__generalization____generalization_name_prime);
		generalization__umlClassifier____specific.setName(generalization__umlClassifier____specific_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		return new Object[] { superClass, cd2c2, umlClassifier, cd2c, generalization, superClassDec, classDec,
				isApplicableMatch, cd2c2__superClass____target, cd2c__umlClassifier____target,
				generalization__superClass____general, cd2c2__superClassDec____source,
				umlClassifier__generalization____generalization, generalization__umlClassifier____specific,
				cd2c__classDec____source };
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class superClass,
			ASTNode2Element cd2c2, Classifier umlClassifier, ASTNode2Element cd2c, Generalization generalization,
			Type superClassDec, ClassDeclaration classDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, superClass, cd2c2, umlClassifier,
				cd2c, generalization, superClassDec, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, superClass, cd2c2, umlClassifier, cd2c, generalization,
					superClassDec, classDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class superClass,
			ASTNode2Element cd2c2, Classifier umlClassifier, ASTNode2Element cd2c, Generalization generalization,
			Type superClassDec, ClassDeclaration classDec) {
		Object[] result_pattern_TypeAccess2Generalization_12_4_solveCSP_binding = pattern_TypeAccess2Generalization_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, superClass, cd2c2, umlClassifier, cd2c, generalization, superClassDec,
				classDec);
		if (result_pattern_TypeAccess2Generalization_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_12_4_solveCSP_black = pattern_TypeAccess2Generalization_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, superClass, cd2c2, umlClassifier, cd2c,
						generalization, superClassDec, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2Generalization_12_5_checkCSP_expressionFBB(
			TypeAccess2Generalization _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccess2Generalization";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2Generalization_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_20_1_preparereturnvalue_bindingFB(
			TypeAccess2Generalization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeAccess2Generalization _this) {
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

	public static final Object[] pattern_TypeAccess2Generalization_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccess2Generalization _this) {
		Object[] result_pattern_TypeAccess2Generalization_20_1_preparereturnvalue_binding = pattern_TypeAccess2Generalization_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2Generalization_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccess2Generalization_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_20_1_preparereturnvalue_black = pattern_TypeAccess2Generalization_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccess2Generalization_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccess2Generalization_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccess2Generalization_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_general) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpGeneralization = _edge_general.getSrc();
		if (tmpGeneralization instanceof Generalization) {
			Generalization generalization = (Generalization) tmpGeneralization;
			EObject tmpSuperClass = _edge_general.getTrg();
			if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
				if (superClass.equals(generalization.getGeneral())) {
					Classifier umlClassifier = generalization.getSpecific();
					if (umlClassifier != null) {
						if (!superClass.equals(umlClassifier)) {
							_result.add(new Object[] { superClass, umlClassifier, generalization, _edge_general });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2Generalization_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			TypeAccess2Generalization _this, Match match, org.eclipse.uml2.uml.Class superClass,
			Classifier umlClassifier, Generalization generalization) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, superClass, umlClassifier, generalization);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccess2Generalization_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccess2Generalization _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccess2Generalization_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_1_preparereturnvalue_bindingFB(
			TypeAccess2Generalization _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeAccess2Generalization _this) {
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

	public static final Object[] pattern_TypeAccess2Generalization_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccess2Generalization _this) {
		Object[] result_pattern_TypeAccess2Generalization_21_1_preparereturnvalue_binding = pattern_TypeAccess2Generalization_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2Generalization_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccess2Generalization_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_21_1_preparereturnvalue_black = pattern_TypeAccess2Generalization_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccess2Generalization_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccess2Generalization_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccess2Generalization_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_0BBB(
			TypeAccess typeAcc, Type superClassDec, ClassDeclaration classDec) {
		if (!classDec.equals(superClassDec)) {
			for (AbstractTypeDeclaration __DEC_typeAcc_superInterfaces_791931 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(typeAcc, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!superClassDec.equals(__DEC_typeAcc_superInterfaces_791931)) {
					if (!classDec.equals(__DEC_typeAcc_superInterfaces_791931)) {
						return new Object[] { typeAcc, superClassDec, classDec };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAcc) {
		for (Annotation __DEC_typeAcc_type_763532 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAcc, Type superClassDec) {
		for (ArrayType __DEC_typeAcc_elementType_555000 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			if (!superClassDec.equals(__DEC_typeAcc_elementType_555000)) {
				return new Object[] { typeAcc, superClassDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_595618 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess typeAcc, Type superClassDec) {
		for (ParameterizedType __DEC_typeAcc_type_860864 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			if (!superClassDec.equals(__DEC_typeAcc_type_860864)) {
				return new Object[] { typeAcc, superClassDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_272005 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_456641 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_7BB(
			ClassDeclaration classDec, TypeAccess typeAcc) {
		if (classDec.getSuperInterfaces().contains(typeAcc)) {
			return new Object[] { classDec, typeAcc };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeAcc = _edge_type.getSrc();
		if (tmpTypeAcc instanceof TypeAccess) {
			TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
			EObject tmpSuperClassDec = _edge_type.getTrg();
			if (tmpSuperClassDec instanceof Type) {
				Type superClassDec = (Type) tmpSuperClassDec;
				if (superClassDec.equals(typeAcc.getType())) {
					if (pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_1B(typeAcc) == null) {
						if (pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_3B(typeAcc) == null) {
							if (pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_5B(
									typeAcc) == null) {
								if (pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_6B(
										typeAcc) == null) {
									if (pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_2BB(
											typeAcc, superClassDec) == null) {
										if (pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_4BB(
												typeAcc, superClassDec) == null) {
											for (ClassDeclaration classDec : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(typeAcc, ClassDeclaration.class,
															"superClass")) {
												if (!classDec.equals(superClassDec)) {
													if (pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_0BBB(
															typeAcc, superClassDec, classDec) == null) {
														if (pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_7BB(
																classDec, typeAcc) == null) {
															_result.add(new Object[] { typeAcc, superClassDec, classDec,
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

		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2Generalization_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			TypeAccess2Generalization _this, Match match, TypeAccess typeAcc, Type superClassDec,
			ClassDeclaration classDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, typeAcc, superClassDec, classDec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccess2Generalization_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccess2Generalization _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccess2Generalization_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_1_prepare_blackB(
			TypeAccess2Generalization _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("superClass");
		EObject _localVariable_1 = sourceMatch.getObject("typeAcc");
		EObject _localVariable_2 = targetMatch.getObject("umlClassifier");
		EObject _localVariable_3 = targetMatch.getObject("generalization");
		EObject _localVariable_4 = sourceMatch.getObject("superClassDec");
		EObject _localVariable_5 = sourceMatch.getObject("classDec");
		EObject tmpSuperClass = _localVariable_0;
		EObject tmpTypeAcc = _localVariable_1;
		EObject tmpUmlClassifier = _localVariable_2;
		EObject tmpGeneralization = _localVariable_3;
		EObject tmpSuperClassDec = _localVariable_4;
		EObject tmpClassDec = _localVariable_5;
		if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
			if (tmpTypeAcc instanceof TypeAccess) {
				TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
				if (tmpUmlClassifier instanceof Classifier) {
					Classifier umlClassifier = (Classifier) tmpUmlClassifier;
					if (tmpGeneralization instanceof Generalization) {
						Generalization generalization = (Generalization) tmpGeneralization;
						if (tmpSuperClassDec instanceof Type) {
							Type superClassDec = (Type) tmpSuperClassDec;
							if (tmpClassDec instanceof ClassDeclaration) {
								ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
								return new Object[] { superClass, typeAcc, umlClassifier, generalization, superClassDec,
										classDec, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_blackBBBBBBBB(
			org.eclipse.uml2.uml.Class superClass, TypeAccess typeAcc, Classifier umlClassifier,
			Generalization generalization, Type superClassDec, ClassDeclaration classDec, Match sourceMatch,
			Match targetMatch) {
		if (!superClass.equals(umlClassifier)) {
			if (!classDec.equals(superClassDec)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { superClass, typeAcc, umlClassifier, generalization, superClassDec, classDec,
							sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding = pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[0];
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[1];
			Classifier umlClassifier = (Classifier) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[2];
			Generalization generalization = (Generalization) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[3];
			Type superClassDec = (Type) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[4];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_black = pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_blackBBBBBBBB(
					superClass, typeAcc, umlClassifier, generalization, superClassDec, classDec, sourceMatch,
					targetMatch);
			if (result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { superClass, typeAcc, umlClassifier, generalization, superClassDec, classDec,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_3_solvecsp_bindingFBBBBBBBBB(
			TypeAccess2Generalization _this, org.eclipse.uml2.uml.Class superClass, TypeAccess typeAcc,
			Classifier umlClassifier, Generalization generalization, Type superClassDec, ClassDeclaration classDec,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(superClass, typeAcc, umlClassifier, generalization,
				superClassDec, classDec, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, superClass, typeAcc, umlClassifier, generalization, superClassDec,
					classDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			TypeAccess2Generalization _this, org.eclipse.uml2.uml.Class superClass, TypeAccess typeAcc,
			Classifier umlClassifier, Generalization generalization, Type superClassDec, ClassDeclaration classDec,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2Generalization_24_3_solvecsp_binding = pattern_TypeAccess2Generalization_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, superClass, typeAcc, umlClassifier, generalization, superClassDec, classDec, sourceMatch,
				targetMatch);
		if (result_pattern_TypeAccess2Generalization_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_24_3_solvecsp_black = pattern_TypeAccess2Generalization_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, superClass, typeAcc, umlClassifier, generalization, superClassDec,
						classDec, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2Generalization_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_24_5_matchcorrcontext_blackBFBFBBBB(
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier, Type superClassDec,
			ClassDeclaration classDec, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!superClass.equals(umlClassifier)) {
			if (!classDec.equals(superClassDec)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (ASTNode2Element cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(superClass, ASTNode2Element.class, "target")) {
						if (superClassDec.equals(cd2c2.getSource())) {
							for (ASTNode2Element cd2c : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(umlClassifier, ASTNode2Element.class, "target")) {
								if (!cd2c.equals(cd2c2)) {
									if (classDec.equals(cd2c.getSource())) {
										_result.add(new Object[] { superClass, cd2c2, umlClassifier, cd2c,
												superClassDec, classDec, sourceMatch, targetMatch });
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

	public static final Object[] pattern_TypeAccess2Generalization_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element cd2c2, ASTNode2Element cd2c, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeAccess2Generalization";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(cd2c2);
		ccMatch.getAllContextElements().add(cd2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { cd2c2, cd2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_6_createcorrespondence_blackBBBBBBB(
			org.eclipse.uml2.uml.Class superClass, TypeAccess typeAcc, Classifier umlClassifier,
			Generalization generalization, Type superClassDec, ClassDeclaration classDec, CCMatch ccMatch) {
		if (!superClass.equals(umlClassifier)) {
			if (!classDec.equals(superClassDec)) {
				return new Object[] { superClass, typeAcc, umlClassifier, generalization, superClassDec, classDec,
						ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_6_createcorrespondence_greenBFBB(
			TypeAccess typeAcc, Generalization generalization, CCMatch ccMatch) {
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2Generalization();
		ta2g.setSource(typeAcc);
		ta2g.setTarget(generalization);
		ccMatch.getCreateCorr().add(ta2g);
		return new Object[] { typeAcc, ta2g, generalization, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeAccess2Generalization";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2Generalization_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_0BBB(
			TypeAccess typeAcc, Type superClassDec, ClassDeclaration classDec) {
		if (!classDec.equals(superClassDec)) {
			for (AbstractTypeDeclaration __DEC_typeAcc_superInterfaces_465675 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(typeAcc, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!superClassDec.equals(__DEC_typeAcc_superInterfaces_465675)) {
					if (!classDec.equals(__DEC_typeAcc_superInterfaces_465675)) {
						return new Object[] { typeAcc, superClassDec, classDec };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAcc) {
		for (Annotation __DEC_typeAcc_type_390401 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAcc, Type superClassDec) {
		for (ArrayType __DEC_typeAcc_elementType_231213 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			if (!superClassDec.equals(__DEC_typeAcc_elementType_231213)) {
				return new Object[] { typeAcc, superClassDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_87151 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_4BB(
			TypeAccess typeAcc, Type superClassDec) {
		for (ParameterizedType __DEC_typeAcc_type_740657 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			if (!superClassDec.equals(__DEC_typeAcc_type_740657)) {
				return new Object[] { typeAcc, superClassDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_49019 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_457511 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_7BB(
			ClassDeclaration classDec, TypeAccess typeAcc) {
		if (classDec.getSuperInterfaces().contains(typeAcc)) {
			return new Object[] { classDec, typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_blackBBB(TypeAccess typeAcc,
			Type superClassDec, ClassDeclaration classDec) {
		if (!classDec.equals(superClassDec)) {
			if (superClassDec.equals(typeAcc.getType())) {
				if (typeAcc.equals(classDec.getSuperClass())) {
					if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_0BBB(typeAcc, superClassDec,
							classDec) == null) {
						if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_1B(typeAcc) == null) {
							if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_2BB(typeAcc,
									superClassDec) == null) {
								if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_3B(
										typeAcc) == null) {
									if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_4BB(typeAcc,
											superClassDec) == null) {
										if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_5B(
												typeAcc) == null) {
											if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_6B(
													typeAcc) == null) {
												if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_7BB(
														classDec, typeAcc) == null) {
													return new Object[] { typeAcc, superClassDec, classDec };
												}
											}
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

	public static final boolean pattern_TypeAccess2Generalization_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2Generalization_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_28_1_matchtggpattern_blackBBB(
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier, Generalization generalization) {
		if (!superClass.equals(umlClassifier)) {
			if (superClass.equals(generalization.getGeneral())) {
				if (umlClassifier.getGeneralizations().contains(generalization)) {
					return new Object[] { superClass, umlClassifier, generalization };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2Generalization_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2Generalization_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_1_createresult_blackB(
			TypeAccess2Generalization _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class superClass) {
		if (ruleResult.getTargetObjects().contains(superClass)) {
			return new Object[] { ruleResult, superClass };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element cd2c2) {
		if (ruleResult.getCorrObjects().contains(cd2c2)) {
			return new Object[] { ruleResult, cd2c2 };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type superClassDec) {
		if (ruleResult.getSourceObjects().contains(superClassDec)) {
			return new Object[] { ruleResult, superClassDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Classifier umlClassifier) {
		if (ruleResult.getTargetObjects().contains(umlClassifier)) {
			return new Object[] { ruleResult, umlClassifier };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element cd2c) {
		if (ruleResult.getCorrObjects().contains(cd2c)) {
			return new Object[] { ruleResult, cd2c };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ClassDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList cd2c2List : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList cd2cList : ruleEntryContainer.getRuleEntryList()) {
				if (!cd2c2List.equals(cd2cList)) {
					for (EObject tmpCd2c2 : cd2c2List.getEntryObjects()) {
						if (tmpCd2c2 instanceof ASTNode2Element) {
							ASTNode2Element cd2c2 = (ASTNode2Element) tmpCd2c2;
							Element tmpSuperClass = cd2c2.getTarget();
							if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
								org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
								ASTNode tmpSuperClassDec = cd2c2.getSource();
								if (tmpSuperClassDec instanceof Type) {
									Type superClassDec = (Type) tmpSuperClassDec;
									if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, cd2c2) == null) {
										if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, superClass) == null) {
											if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, superClassDec) == null) {
												for (EObject tmpCd2c : cd2cList.getEntryObjects()) {
													if (tmpCd2c instanceof ASTNode2Element) {
														ASTNode2Element cd2c = (ASTNode2Element) tmpCd2c;
														if (!cd2c.equals(cd2c2)) {
															Element tmpUmlClassifier = cd2c.getTarget();
															if (tmpUmlClassifier instanceof Classifier) {
																Classifier umlClassifier = (Classifier) tmpUmlClassifier;
																if (!superClass.equals(umlClassifier)) {
																	ASTNode tmpClassDec = cd2c.getSource();
																	if (tmpClassDec instanceof ClassDeclaration) {
																		ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
																		if (!classDec.equals(superClassDec)) {
																			if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult, cd2c) == null) {
																				if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult,
																						umlClassifier) == null) {
																					if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							classDec) == null) {
																						_result.add(new Object[] {
																								cd2c2List, superClass,
																								cd2c2, superClassDec,
																								cd2cList, umlClassifier,
																								cd2c, classDec,
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

	public static final Object[] pattern_TypeAccess2Generalization_29_3_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class superClass,
			ASTNode2Element cd2c2, Classifier umlClassifier, ASTNode2Element cd2c, Type superClassDec,
			ClassDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, superClass, cd2c2, umlClassifier,
				cd2c, superClassDec, classDec, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, superClass, cd2c2, umlClassifier, cd2c, superClassDec,
					classDec, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class superClass,
			ASTNode2Element cd2c2, Classifier umlClassifier, ASTNode2Element cd2c, Type superClassDec,
			ClassDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeAccess2Generalization_29_3_solveCSP_binding = pattern_TypeAccess2Generalization_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, superClass, cd2c2, umlClassifier, cd2c, superClassDec, classDec, ruleResult);
		if (result_pattern_TypeAccess2Generalization_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_29_3_solveCSP_black = pattern_TypeAccess2Generalization_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, superClass, cd2c2, umlClassifier, cd2c,
						superClassDec, classDec, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2Generalization_29_4_checkCSP_expressionFBB(
			TypeAccess2Generalization _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_5_checknacs_blackBBBBBB(
			org.eclipse.uml2.uml.Class superClass, ASTNode2Element cd2c2, Classifier umlClassifier,
			ASTNode2Element cd2c, Type superClassDec, ClassDeclaration classDec) {
		if (!superClass.equals(umlClassifier)) {
			if (!cd2c.equals(cd2c2)) {
				if (!classDec.equals(superClassDec)) {
					return new Object[] { superClass, cd2c2, umlClassifier, cd2c, superClassDec, classDec };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_6_perform_blackBBBBBBB(
			org.eclipse.uml2.uml.Class superClass, ASTNode2Element cd2c2, Classifier umlClassifier,
			ASTNode2Element cd2c, Type superClassDec, ClassDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		if (!superClass.equals(umlClassifier)) {
			if (!cd2c.equals(cd2c2)) {
				if (!classDec.equals(superClassDec)) {
					return new Object[] { superClass, cd2c2, umlClassifier, cd2c, superClassDec, classDec, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_6_perform_greenBFBFFBBB(
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier, Type superClassDec,
			ClassDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2Generalization();
		Generalization generalization = UMLFactory.eINSTANCE.createGeneralization();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		typeAcc.setType(superClassDec);
		classDec.setSuperClass(typeAcc);
		ruleResult.getSourceObjects().add(typeAcc);
		ta2g.setSource(typeAcc);
		ruleResult.getCorrObjects().add(ta2g);
		ta2g.setTarget(generalization);
		generalization.setGeneral(superClass);
		umlClassifier.getGeneralizations().add(generalization);
		ruleResult.getTargetObjects().add(generalization);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { superClass, typeAcc, umlClassifier, ta2g, generalization, superClassDec, classDec,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypeAccess2Generalization_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeAccess2GeneralizationImpl
