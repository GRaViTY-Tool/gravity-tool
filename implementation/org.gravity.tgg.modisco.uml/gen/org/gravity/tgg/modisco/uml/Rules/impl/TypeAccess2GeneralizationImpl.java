/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

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
	public boolean isAppropriate_FWD(Match match, TypeAccess typeAcc, ClassDeclaration classDec, Type superClassDec) {

		Object[] result1_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_0_1_initialbindings_blackBBBBB(this, match, typeAcc, classDec,
						superClassDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeAcc] = " + typeAcc + ", " + "[classDec] = " + classDec + ", "
					+ "[superClassDec] = " + superClassDec + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, typeAcc, classDec,
						superClassDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeAcc] = " + typeAcc + ", " + "[classDec] = " + classDec + ", "
					+ "[superClassDec] = " + superClassDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_0_4_collectelementstobetranslated_blackBBBB(match, typeAcc,
							classDec, superClassDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeAcc] = " + typeAcc + ", " + "[classDec] = " + classDec + ", " + "[superClassDec] = "
						+ superClassDec + ".");
			}
			TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_0_4_collectelementstobetranslated_greenBBBBFFF(match, typeAcc,
							classDec, superClassDec);
			//nothing EMoflonEdge typeAcc__superClassDec____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge classDec__typeAcc____superClass = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_0_5_collectcontextelements_blackBBBB(match, typeAcc, classDec,
							superClassDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeAcc] = " + typeAcc + ", " + "[classDec] = " + classDec + ", " + "[superClassDec] = "
						+ superClassDec + ".");
			}
			TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_0_5_collectcontextelements_greenBBB(match,
					classDec, superClassDec);

			// 
			TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, typeAcc, classDec, superClassDec);
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
		TypeAccess typeAcc = (TypeAccess) result1_bindingAndBlack[0];
		NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) result1_bindingAndBlack[1];
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result1_bindingAndBlack[4];
		Classifier umlClassifier = (Classifier) result1_bindingAndBlack[5];
		Type superClassDec = (Type) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_1_1_performtransformation_greenFFBBB(typeAcc, superClass,
						umlClassifier);
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2Generalization) result1_green[0];
		Generalization generalization = (Generalization) result1_green[1];

		Object[] result2_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_1_2_collecttranslatedelements_blackBBB(ta2g, generalization,
						typeAcc);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ta2g] = " + ta2g + ", "
					+ "[generalization] = " + generalization + ", " + "[typeAcc] = " + typeAcc + ".");
		}
		Object[] result2_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_1_2_collecttranslatedelements_greenFBBB(ta2g, generalization,
						typeAcc);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, ta2g,
						generalization, typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ta2g] = " + ta2g + ", " + "[generalization] = " + generalization + ", " + "[typeAcc] = "
					+ typeAcc + ", " + "[cd2c2] = " + cd2c2 + ", " + "[classDec] = " + classDec + ", "
					+ "[superClass] = " + superClass + ", " + "[cd2c] = " + cd2c + ", " + "[umlClassifier] = "
					+ umlClassifier + ", " + "[superClassDec] = " + superClassDec + ".");
		}
		TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(
				ruleresult, ta2g, generalization, typeAcc, classDec, superClass, umlClassifier, superClassDec);
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge ta2g__generalization____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge umlClassifier__generalization____generalization = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge generalization__umlClassifier____specific = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge typeAcc__superClassDec____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge classDec__typeAcc____superClass = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge generalization__superClass____general = (EMoflonEdge) result3_green[15];

		// 
		// 
		TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, ta2g, generalization, typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier,
				superClassDec);
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
		ClassDeclaration classDec = (ClassDeclaration) result2_binding[1];
		Type superClassDec = (Type) result2_binding[2];
		for (Object[] result2_black : TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_2_2_corematch_blackBFBFFFBB(typeAcc, classDec, superClassDec,
						match)) {
			NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) result2_black[1];
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result2_black[3];
			NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result2_black[4];
			Classifier umlClassifier = (Classifier) result2_black[5];
			// ForEach 
			for (Object[] result3_black : TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_2_3_findcontext_blackBBBBBBB(typeAcc, cd2c2, classDec,
							superClass, cd2c, umlClassifier, superClassDec)) {
				Object[] result3_green = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_2_3_findcontext_greenBBBBBBBFFFFFFFF(typeAcc, cd2c2,
								classDec, superClass, cd2c, umlClassifier, superClassDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge cd2c2__superClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge typeAcc__superClassDec____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2c__umlClassifier____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd2c2__superClassDec____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge classDec__typeAcc____superClass = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier,
								superClassDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeAcc] = " + typeAcc + ", "
							+ "[cd2c2] = " + cd2c2 + ", " + "[classDec] = " + classDec + ", " + "[superClass] = "
							+ superClass + ", " + "[cd2c] = " + cd2c + ", " + "[umlClassifier] = " + umlClassifier
							+ ", " + "[superClassDec] = " + superClassDec + ".");
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
	public void registerObjectsToMatch_FWD(Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			Type superClassDec) {
		match.registerObject("typeAcc", typeAcc);
		match.registerObject("classDec", classDec);
		match.registerObject("superClassDec", superClassDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			Type superClassDec) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeAccess typeAcc,
			NamedElement2NamedElement cd2c2, ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass,
			NamedElement2NamedElement cd2c, Classifier umlClassifier, Type superClassDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeAcc", typeAcc);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("superClass", superClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("umlClassifier", umlClassifier);
		isApplicableMatch.registerObject("superClassDec", superClassDec);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject ta2g, EObject generalization, EObject typeAcc,
			EObject cd2c2, EObject classDec, EObject superClass, EObject cd2c, EObject umlClassifier,
			EObject superClassDec) {
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("generalization", generalization);
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("cd2c2", cd2c2);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("superClass", superClass);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("umlClassifier", umlClassifier);
		ruleresult.registerObject("superClassDec", superClassDec);

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
	public boolean isAppropriate_BWD(Match match, Generalization generalization, org.eclipse.uml2.uml.Class superClass,
			Classifier umlClassifier) {

		Object[] result1_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_10_1_initialbindings_blackBBBBB(this, match, generalization,
						superClass, umlClassifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[generalization] = " + generalization + ", " + "[superClass] = "
					+ superClass + ", " + "[umlClassifier] = " + umlClassifier + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, generalization,
						superClass, umlClassifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[generalization] = " + generalization + ", " + "[superClass] = "
					+ superClass + ", " + "[umlClassifier] = " + umlClassifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_10_4_collectelementstobetranslated_blackBBBB(match,
							generalization, superClass, umlClassifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[generalization] = " + generalization + ", " + "[superClass] = " + superClass + ", "
						+ "[umlClassifier] = " + umlClassifier + ".");
			}
			TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_10_4_collectelementstobetranslated_greenBBBBFFF(match,
							generalization, superClass, umlClassifier);
			//nothing EMoflonEdge umlClassifier__generalization____generalization = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge generalization__umlClassifier____specific = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge generalization__superClass____general = (EMoflonEdge) result4_green[6];

			Object[] result5_black = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_10_5_collectcontextelements_blackBBBB(match, generalization,
							superClass, umlClassifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[generalization] = " + generalization + ", " + "[superClass] = " + superClass + ", "
						+ "[umlClassifier] = " + umlClassifier + ".");
			}
			TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_10_5_collectcontextelements_greenBBB(match,
					superClass, umlClassifier);

			// 
			TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_10_6_registerobjectstomatch_expressionBBBBB(
					this, match, generalization, superClass, umlClassifier);
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
		Generalization generalization = (Generalization) result1_bindingAndBlack[0];
		NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) result1_bindingAndBlack[1];
		ClassDeclaration classDec = (ClassDeclaration) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result1_bindingAndBlack[4];
		Classifier umlClassifier = (Classifier) result1_bindingAndBlack[5];
		Type superClassDec = (Type) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_11_1_performtransformation_greenFBFBB(generalization, classDec,
						superClassDec);
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2Generalization) result1_green[0];
		TypeAccess typeAcc = (TypeAccess) result1_green[2];

		Object[] result2_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_11_2_collecttranslatedelements_blackBBB(ta2g, generalization,
						typeAcc);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ta2g] = " + ta2g + ", "
					+ "[generalization] = " + generalization + ", " + "[typeAcc] = " + typeAcc + ".");
		}
		Object[] result2_green = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_11_2_collecttranslatedelements_greenFBBB(ta2g, generalization,
						typeAcc);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, ta2g,
						generalization, typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ta2g] = " + ta2g + ", " + "[generalization] = " + generalization + ", " + "[typeAcc] = "
					+ typeAcc + ", " + "[cd2c2] = " + cd2c2 + ", " + "[classDec] = " + classDec + ", "
					+ "[superClass] = " + superClass + ", " + "[cd2c] = " + cd2c + ", " + "[umlClassifier] = "
					+ umlClassifier + ", " + "[superClassDec] = " + superClassDec + ".");
		}
		TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFF(
				ruleresult, ta2g, generalization, typeAcc, classDec, superClass, umlClassifier, superClassDec);
		//nothing EMoflonEdge ta2g__typeAcc____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge ta2g__generalization____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge umlClassifier__generalization____generalization = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge generalization__umlClassifier____specific = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge typeAcc__superClassDec____type = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge classDec__typeAcc____superClass = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge generalization__superClass____general = (EMoflonEdge) result3_green[15];

		// 
		// 
		TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_11_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, ta2g, generalization, typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier,
				superClassDec);
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
		Generalization generalization = (Generalization) result2_binding[0];
		org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result2_binding[1];
		Classifier umlClassifier = (Classifier) result2_binding[2];
		for (Object[] result2_black : TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_12_2_corematch_blackBFFBFBFB(generalization, superClass,
						umlClassifier, match)) {
			NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) result2_black[1];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[2];
			NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result2_black[4];
			Type superClassDec = (Type) result2_black[6];
			// ForEach 
			for (Object[] result3_black : TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_12_3_findcontext_blackBBBBBBB(generalization, cd2c2, classDec,
							superClass, cd2c, umlClassifier, superClassDec)) {
				Object[] result3_green = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_12_3_findcontext_greenBBBBBBBFFFFFFFF(generalization, cd2c2,
								classDec, superClass, cd2c, umlClassifier, superClassDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge cd2c2__superClass____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge umlClassifier__generalization____generalization = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge generalization__umlClassifier____specific = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge cd2c__umlClassifier____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge cd2c2__superClassDec____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge generalization__superClass____general = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, generalization, cd2c2, classDec, superClass, cd2c, umlClassifier,
								superClassDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[generalization] = "
							+ generalization + ", " + "[cd2c2] = " + cd2c2 + ", " + "[classDec] = " + classDec + ", "
							+ "[superClass] = " + superClass + ", " + "[cd2c] = " + cd2c + ", " + "[umlClassifier] = "
							+ umlClassifier + ", " + "[superClassDec] = " + superClassDec + ".");
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
	public void registerObjectsToMatch_BWD(Match match, Generalization generalization,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {
		match.registerObject("generalization", generalization);
		match.registerObject("superClass", superClass);
		match.registerObject("umlClassifier", umlClassifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Generalization generalization,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Generalization generalization,
			NamedElement2NamedElement cd2c2, ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass,
			NamedElement2NamedElement cd2c, Classifier umlClassifier, Type superClassDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("generalization", generalization);
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("superClass", superClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("umlClassifier", umlClassifier);
		isApplicableMatch.registerObject("superClassDec", superClassDec);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject ta2g, EObject generalization, EObject typeAcc,
			EObject cd2c2, EObject classDec, EObject superClass, EObject cd2c, EObject umlClassifier,
			EObject superClassDec) {
		ruleresult.registerObject("ta2g", ta2g);
		ruleresult.registerObject("generalization", generalization);
		ruleresult.registerObject("typeAcc", typeAcc);
		ruleresult.registerObject("cd2c2", cd2c2);
		ruleresult.registerObject("classDec", classDec);
		ruleresult.registerObject("superClass", superClass);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("umlClassifier", umlClassifier);
		ruleresult.registerObject("superClassDec", superClassDec);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_130(EMoflonEdge _edge_generalization) {

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
				.pattern_TypeAccess2Generalization_20_2_testcorematchandDECs_blackFFFB(_edge_generalization)) {
			Generalization generalization = (Generalization) result2_black[0];
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result2_black[1];
			Classifier umlClassifier = (Classifier) result2_black[2];
			Object[] result2_green = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, generalization, superClass, umlClassifier)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_135(EMoflonEdge _edge_type) {

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
			ClassDeclaration classDec = (ClassDeclaration) result2_black[1];
			Type superClassDec = (Type) result2_black[2];
			Object[] result2_green = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, typeAcc, classDec, superClassDec)) {
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
		Generalization generalization = (Generalization) result2_bindingAndBlack[0];
		TypeAccess typeAcc = (TypeAccess) result2_bindingAndBlack[1];
		ClassDeclaration classDec = (ClassDeclaration) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[3];
		Classifier umlClassifier = (Classifier) result2_bindingAndBlack[4];
		Type superClassDec = (Type) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, generalization,
						typeAcc, classDec, superClass, umlClassifier, superClassDec, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[generalization] = " + generalization + ", " + "[typeAcc] = " + typeAcc + ", " + "[classDec] = "
					+ classDec + ", " + "[superClass] = " + superClass + ", " + "[umlClassifier] = " + umlClassifier
					+ ", " + "[superClassDec] = " + superClassDec + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_24_5_matchcorrcontext_blackFBBFBBBB(classDec, superClass,
							umlClassifier, superClassDec, sourceMatch, targetMatch)) {
				NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) result5_black[0];
				NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result5_black[3];
				Object[] result5_green = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_24_5_matchcorrcontext_greenBBBBF(cd2c2, cd2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_24_6_createcorrespondence_blackBBBBBBB(generalization,
								typeAcc, classDec, superClass, umlClassifier, superClassDec, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[generalization] = "
							+ generalization + ", " + "[typeAcc] = " + typeAcc + ", " + "[classDec] = " + classDec
							+ ", " + "[superClass] = " + superClass + ", " + "[umlClassifier] = " + umlClassifier + ", "
							+ "[superClassDec] = " + superClassDec + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_24_6_createcorrespondence_greenFBBB(
						generalization, typeAcc, ccMatch);
				//nothing org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2Generalization) result6_green[0];

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
	public CSP isApplicable_solveCsp_CC(Generalization generalization, TypeAccess typeAcc, ClassDeclaration classDec,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier, Type superClassDec, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(TypeAccess typeAcc, ClassDeclaration classDec, Type superClassDec) {// 
		Object[] result1_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_27_1_matchtggpattern_blackBBB(typeAcc, classDec, superClassDec);
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
	public boolean checkDEC_BWD(Generalization generalization, org.eclipse.uml2.uml.Class superClass,
			Classifier umlClassifier) {// 
		Object[] result1_black = TypeAccess2GeneralizationImpl
				.pattern_TypeAccess2Generalization_28_1_matchtggpattern_blackBBB(generalization, superClass,
						umlClassifier);
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
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement cd2c2Parameter, NamedElement2NamedElement cd2cParameter) {

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
			NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) result2_black[1];
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result2_black[2];
			Type superClassDec = (Type) result2_black[3];
			//nothing RuleEntryList cd2cList = (RuleEntryList) result2_black[4];
			ClassDeclaration classDec = (ClassDeclaration) result2_black[5];
			NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result2_black[6];
			Classifier umlClassifier = (Classifier) result2_black[7];

			Object[] result3_bindingAndBlack = TypeAccess2GeneralizationImpl
					.pattern_TypeAccess2Generalization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[cd2c2] = " + cd2c2 + ", "
						+ "[classDec] = " + classDec + ", " + "[superClass] = " + superClass + ", " + "[cd2c] = " + cd2c
						+ ", " + "[umlClassifier] = " + umlClassifier + ", " + "[superClassDec] = " + superClassDec
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = TypeAccess2GeneralizationImpl
						.pattern_TypeAccess2Generalization_29_5_checknacs_blackBBBBBB(cd2c2, classDec, superClass, cd2c,
								umlClassifier, superClassDec);
				if (result5_black != null) {

					Object[] result6_black = TypeAccess2GeneralizationImpl
							.pattern_TypeAccess2Generalization_29_6_perform_blackBBBBBBB(cd2c2, classDec, superClass,
									cd2c, umlClassifier, superClassDec, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[cd2c2] = " + cd2c2
								+ ", " + "[classDec] = " + classDec + ", " + "[superClass] = " + superClass + ", "
								+ "[cd2c] = " + cd2c + ", " + "[umlClassifier] = " + umlClassifier + ", "
								+ "[superClassDec] = " + superClassDec + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					TypeAccess2GeneralizationImpl.pattern_TypeAccess2Generalization_29_6_perform_greenFFFBBBBB(classDec,
							superClass, umlClassifier, superClassDec, ruleResult);
					//nothing org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = (org.gravity.tgg.modisco.uml.TypeAccess2Generalization) result6_green[0];
					//nothing Generalization generalization = (Generalization) result6_green[1];
					//nothing TypeAccess typeAcc = (TypeAccess) result6_green[2];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, NamedElement2NamedElement cd2c2,
			ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass, NamedElement2NamedElement cd2c,
			Classifier umlClassifier, Type superClassDec, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("cd2c2", cd2c2);
		isApplicableMatch.registerObject("classDec", classDec);
		isApplicableMatch.registerObject("superClass", superClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("umlClassifier", umlClassifier);
		isApplicableMatch.registerObject("superClassDec", superClassDec);
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
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_CLASSDECLARATION_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_CLASSDECLARATION_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (Type) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_CLASSDECLARATION_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEACCESS_NAMEDELEMENT2NAMEDELEMENT_CLASSDECLARATION_CLASS_NAMEDELEMENT2NAMEDELEMENT_CLASSIFIER_TYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeAccess) arguments.get(1),
					(NamedElement2NamedElement) arguments.get(2), (ClassDeclaration) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (NamedElement2NamedElement) arguments.get(5),
					(Classifier) arguments.get(6), (Type) arguments.get(7));
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
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_BWD__MATCH_GENERALIZATION_CLASS_CLASSIFIER:
			return isAppropriate_BWD((Match) arguments.get(0), (Generalization) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Classifier) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_GENERALIZATION_CLASS_CLASSIFIER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Generalization) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Classifier) arguments.get(3));
			return null;
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_GENERALIZATION_CLASS_CLASSIFIER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Generalization) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Classifier) arguments.get(3));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_GENERALIZATION_NAMEDELEMENT2NAMEDELEMENT_CLASSDECLARATION_CLASS_NAMEDELEMENT2NAMEDELEMENT_CLASSIFIER_TYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Generalization) arguments.get(1),
					(NamedElement2NamedElement) arguments.get(2), (ClassDeclaration) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (NamedElement2NamedElement) arguments.get(5),
					(Classifier) arguments.get(6), (Type) arguments.get(7));
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
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_130__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_130((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_135__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_135((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_SOLVE_CSP_CC__GENERALIZATION_TYPEACCESS_CLASSDECLARATION_CLASS_CLASSIFIER_TYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Generalization) arguments.get(0), (TypeAccess) arguments.get(1),
					(ClassDeclaration) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(Classifier) arguments.get(4), (Type) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___CHECK_DEC_FWD__TYPEACCESS_CLASSDECLARATION_TYPE:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (ClassDeclaration) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___CHECK_DEC_BWD__GENERALIZATION_CLASS_CLASSIFIER:
			return checkDEC_BWD((Generalization) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Classifier) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___GENERATE_MODEL__RULEENTRYCONTAINER_NAMEDELEMENT2NAMEDELEMENT_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (NamedElement2NamedElement) arguments.get(1),
					(NamedElement2NamedElement) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_NAMEDELEMENT2NAMEDELEMENT_CLASSDECLARATION_CLASS_NAMEDELEMENT2NAMEDELEMENT_CLASSIFIER_TYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(NamedElement2NamedElement) arguments.get(1), (ClassDeclaration) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (NamedElement2NamedElement) arguments.get(4),
					(Classifier) arguments.get(5), (Type) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.TYPE_ACCESS2_GENERALIZATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_1_initialbindings_blackBBBBB(
			TypeAccess2Generalization _this, Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			Type superClassDec) {
		if (!classDec.equals(superClassDec)) {
			return new Object[] { _this, match, typeAcc, classDec, superClassDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_2_SolveCSP_bindingFBBBBB(
			TypeAccess2Generalization _this, Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			Type superClassDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, typeAcc, classDec, superClassDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeAcc, classDec, superClassDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2Generalization _this, Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			Type superClassDec) {
		Object[] result_pattern_TypeAccess2Generalization_0_2_SolveCSP_binding = pattern_TypeAccess2Generalization_0_2_SolveCSP_bindingFBBBBB(
				_this, match, typeAcc, classDec, superClassDec);
		if (result_pattern_TypeAccess2Generalization_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_0_2_SolveCSP_black = pattern_TypeAccess2Generalization_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeAcc, classDec, superClassDec };
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
			Match match, TypeAccess typeAcc, ClassDeclaration classDec, Type superClassDec) {
		if (!classDec.equals(superClassDec)) {
			return new Object[] { match, typeAcc, classDec, superClassDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TypeAccess typeAcc, ClassDeclaration classDec, Type superClassDec) {
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
		return new Object[] { match, typeAcc, classDec, superClassDec, typeAcc__superClassDec____type,
				superClassDec__typeAcc____usagesInTypeAccess, classDec__typeAcc____superClass };
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_5_collectcontextelements_blackBBBB(Match match,
			TypeAccess typeAcc, ClassDeclaration classDec, Type superClassDec) {
		if (!classDec.equals(superClassDec)) {
			return new Object[] { match, typeAcc, classDec, superClassDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_0_5_collectcontextelements_greenBBB(Match match,
			ClassDeclaration classDec, Type superClassDec) {
		match.getContextNodes().add(classDec);
		match.getContextNodes().add(superClassDec);
		return new Object[] { match, classDec, superClassDec };
	}

	public static final void pattern_TypeAccess2Generalization_0_6_registerobjectstomatch_expressionBBBBB(
			TypeAccess2Generalization _this, Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			Type superClassDec) {
		_this.registerObjectsToMatch_FWD(match, typeAcc, classDec, superClassDec);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("typeAcc");
		EObject _localVariable_1 = isApplicableMatch.getObject("cd2c2");
		EObject _localVariable_2 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_3 = isApplicableMatch.getObject("superClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("umlClassifier");
		EObject _localVariable_6 = isApplicableMatch.getObject("superClassDec");
		EObject tmpTypeAcc = _localVariable_0;
		EObject tmpCd2c2 = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		EObject tmpSuperClass = _localVariable_3;
		EObject tmpCd2c = _localVariable_4;
		EObject tmpUmlClassifier = _localVariable_5;
		EObject tmpSuperClassDec = _localVariable_6;
		if (tmpTypeAcc instanceof TypeAccess) {
			TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
			if (tmpCd2c2 instanceof NamedElement2NamedElement) {
				NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) tmpCd2c2;
				if (tmpClassDec instanceof ClassDeclaration) {
					ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
					if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
						if (tmpCd2c instanceof NamedElement2NamedElement) {
							NamedElement2NamedElement cd2c = (NamedElement2NamedElement) tmpCd2c;
							if (tmpUmlClassifier instanceof Classifier) {
								Classifier umlClassifier = (Classifier) tmpUmlClassifier;
								if (tmpSuperClassDec instanceof Type) {
									Type superClassDec = (Type) tmpSuperClassDec;
									return new Object[] { typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier,
											superClassDec, isApplicableMatch };
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
			TypeAccess typeAcc, NamedElement2NamedElement cd2c2, ClassDeclaration classDec,
			org.eclipse.uml2.uml.Class superClass, NamedElement2NamedElement cd2c, Classifier umlClassifier,
			Type superClassDec, TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch) {
		if (!classDec.equals(superClassDec)) {
			if (!superClass.equals(umlClassifier)) {
				if (!cd2c.equals(cd2c2)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier,
									superClassDec, csp, _this, isApplicableMatch };
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
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[0];
			NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[1];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[3];
			NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[4];
			Classifier umlClassifier = (Classifier) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[5];
			Type superClassDec = (Type) result_pattern_TypeAccess2Generalization_1_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2Generalization_1_1_performtransformation_black = pattern_TypeAccess2Generalization_1_1_performtransformation_blackBBBBBBBFBB(
					typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec, _this, isApplicableMatch);
			if (result_pattern_TypeAccess2Generalization_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2Generalization_1_1_performtransformation_black[7];

				return new Object[] { typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_1_performtransformation_greenFFBBB(
			TypeAccess typeAcc, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2Generalization();
		Generalization generalization = UMLFactory.eINSTANCE.createGeneralization();
		ta2g.setSource(typeAcc);
		ta2g.setTarget(generalization);
		umlClassifier.getGeneralizations().add(generalization);
		generalization.setGeneral(superClass);
		return new Object[] { ta2g, generalization, typeAcc, superClass, umlClassifier };
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_2_collecttranslatedelements_blackBBB(
			org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g, Generalization generalization,
			TypeAccess typeAcc) {
		return new Object[] { ta2g, generalization, typeAcc };
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_2_collecttranslatedelements_greenFBBB(
			org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g, Generalization generalization,
			TypeAccess typeAcc) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(ta2g);
		ruleresult.getCreatedElements().add(generalization);
		ruleresult.getTranslatedElements().add(typeAcc);
		return new Object[] { ruleresult, ta2g, generalization, typeAcc };
	}

	public static final Object[] pattern_TypeAccess2Generalization_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ta2g, EObject generalization, EObject typeAcc, EObject cd2c2,
			EObject classDec, EObject superClass, EObject cd2c, EObject umlClassifier, EObject superClassDec) {
		if (!ta2g.equals(typeAcc)) {
			if (!ta2g.equals(umlClassifier)) {
				if (!generalization.equals(ta2g)) {
					if (!generalization.equals(typeAcc)) {
						if (!generalization.equals(superClass)) {
							if (!generalization.equals(umlClassifier)) {
								if (!generalization.equals(superClassDec)) {
									if (!typeAcc.equals(umlClassifier)) {
										if (!cd2c2.equals(ta2g)) {
											if (!cd2c2.equals(generalization)) {
												if (!cd2c2.equals(typeAcc)) {
													if (!cd2c2.equals(classDec)) {
														if (!cd2c2.equals(superClass)) {
															if (!cd2c2.equals(umlClassifier)) {
																if (!cd2c2.equals(superClassDec)) {
																	if (!classDec.equals(ta2g)) {
																		if (!classDec.equals(generalization)) {
																			if (!classDec.equals(typeAcc)) {
																				if (!classDec.equals(superClass)) {
																					if (!classDec
																							.equals(umlClassifier)) {
																						if (!classDec.equals(
																								superClassDec)) {
																							if (!superClass
																									.equals(ta2g)) {
																								if (!superClass.equals(
																										typeAcc)) {
																									if (!superClass
																											.equals(umlClassifier)) {
																										if (!superClass
																												.equals(superClassDec)) {
																											if (!cd2c
																													.equals(ta2g)) {
																												if (!cd2c
																														.equals(generalization)) {
																													if (!cd2c
																															.equals(typeAcc)) {
																														if (!cd2c
																																.equals(cd2c2)) {
																															if (!cd2c
																																	.equals(classDec)) {
																																if (!cd2c
																																		.equals(superClass)) {
																																	if (!cd2c
																																			.equals(umlClassifier)) {
																																		if (!cd2c
																																				.equals(superClassDec)) {
																																			if (!superClassDec
																																					.equals(ta2g)) {
																																				if (!superClassDec
																																						.equals(typeAcc)) {
																																					if (!superClassDec
																																							.equals(umlClassifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								ta2g,
																																								generalization,
																																								typeAcc,
																																								cd2c2,
																																								classDec,
																																								superClass,
																																								cd2c,
																																								umlClassifier,
																																								superClassDec };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject ta2g, EObject generalization, EObject typeAcc, EObject classDec,
			EObject superClass, EObject umlClassifier, EObject superClassDec) {
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__generalization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClassifier__generalization____generalization = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__umlClassifier____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superClassDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__superClass____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2Generalization";
		String ta2g__typeAcc____source_name_prime = "source";
		String ta2g__generalization____target_name_prime = "target";
		String umlClassifier__generalization____generalization_name_prime = "generalization";
		String generalization__umlClassifier____specific_name_prime = "specific";
		String typeAcc__superClassDec____type_name_prime = "type";
		String superClassDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String classDec__typeAcc____superClass_name_prime = "superClass";
		String generalization__superClass____general_name_prime = "general";
		ta2g__typeAcc____source.setSrc(ta2g);
		ta2g__typeAcc____source.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(ta2g__typeAcc____source);
		ta2g__generalization____target.setSrc(ta2g);
		ta2g__generalization____target.setTrg(generalization);
		ruleresult.getCreatedEdges().add(ta2g__generalization____target);
		umlClassifier__generalization____generalization.setSrc(umlClassifier);
		umlClassifier__generalization____generalization.setTrg(generalization);
		ruleresult.getCreatedEdges().add(umlClassifier__generalization____generalization);
		generalization__umlClassifier____specific.setSrc(generalization);
		generalization__umlClassifier____specific.setTrg(umlClassifier);
		ruleresult.getCreatedEdges().add(generalization__umlClassifier____specific);
		typeAcc__superClassDec____type.setSrc(typeAcc);
		typeAcc__superClassDec____type.setTrg(superClassDec);
		ruleresult.getTranslatedEdges().add(typeAcc__superClassDec____type);
		superClassDec__typeAcc____usagesInTypeAccess.setSrc(superClassDec);
		superClassDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(superClassDec__typeAcc____usagesInTypeAccess);
		classDec__typeAcc____superClass.setSrc(classDec);
		classDec__typeAcc____superClass.setTrg(typeAcc);
		ruleresult.getTranslatedEdges().add(classDec__typeAcc____superClass);
		generalization__superClass____general.setSrc(generalization);
		generalization__superClass____general.setTrg(superClass);
		ruleresult.getCreatedEdges().add(generalization__superClass____general);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		ta2g__generalization____target.setName(ta2g__generalization____target_name_prime);
		umlClassifier__generalization____generalization
				.setName(umlClassifier__generalization____generalization_name_prime);
		generalization__umlClassifier____specific.setName(generalization__umlClassifier____specific_name_prime);
		typeAcc__superClassDec____type.setName(typeAcc__superClassDec____type_name_prime);
		superClassDec__typeAcc____usagesInTypeAccess.setName(superClassDec__typeAcc____usagesInTypeAccess_name_prime);
		classDec__typeAcc____superClass.setName(classDec__typeAcc____superClass_name_prime);
		generalization__superClass____general.setName(generalization__superClass____general_name_prime);
		return new Object[] { ruleresult, ta2g, generalization, typeAcc, classDec, superClass, umlClassifier,
				superClassDec, ta2g__typeAcc____source, ta2g__generalization____target,
				umlClassifier__generalization____generalization, generalization__umlClassifier____specific,
				typeAcc__superClassDec____type, superClassDec__typeAcc____usagesInTypeAccess,
				classDec__typeAcc____superClass, generalization__superClass____general };
	}

	public static final void pattern_TypeAccess2Generalization_1_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2Generalization _this, PerformRuleResult ruleresult, EObject ta2g, EObject generalization,
			EObject typeAcc, EObject cd2c2, EObject classDec, EObject superClass, EObject cd2c, EObject umlClassifier,
			EObject superClassDec) {
		_this.registerObjects_FWD(ruleresult, ta2g, generalization, typeAcc, cd2c2, classDec, superClass, cd2c,
				umlClassifier, superClassDec);

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
		EObject _localVariable_1 = match.getObject("classDec");
		EObject _localVariable_2 = match.getObject("superClassDec");
		EObject tmpTypeAcc = _localVariable_0;
		EObject tmpClassDec = _localVariable_1;
		EObject tmpSuperClassDec = _localVariable_2;
		if (tmpTypeAcc instanceof TypeAccess) {
			TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
			if (tmpClassDec instanceof ClassDeclaration) {
				ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
				if (tmpSuperClassDec instanceof Type) {
					Type superClassDec = (Type) tmpSuperClassDec;
					return new Object[] { typeAcc, classDec, superClassDec, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_2_2_corematch_blackBFBFFFBB(
			TypeAccess typeAcc, ClassDeclaration classDec, Type superClassDec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!classDec.equals(superClassDec)) {
			for (NamedElement2NamedElement cd2c : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(classDec, NamedElement2NamedElement.class, "source")) {
				NamedElement tmpUmlClassifier = cd2c.getTarget();
				if (tmpUmlClassifier instanceof Classifier) {
					Classifier umlClassifier = (Classifier) tmpUmlClassifier;
					for (NamedElement2NamedElement cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(superClassDec, NamedElement2NamedElement.class, "source")) {
						if (!cd2c.equals(cd2c2)) {
							NamedElement tmpSuperClass = cd2c2.getTarget();
							if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
								org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
								if (!superClass.equals(umlClassifier)) {
									_result.add(new Object[] { typeAcc, cd2c2, classDec, superClass, cd2c,
											umlClassifier, superClassDec, match });
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
			TypeAccess typeAcc, NamedElement2NamedElement cd2c2, ClassDeclaration classDec,
			org.eclipse.uml2.uml.Class superClass, NamedElement2NamedElement cd2c, Classifier umlClassifier,
			Type superClassDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!classDec.equals(superClassDec)) {
			if (!superClass.equals(umlClassifier)) {
				if (!cd2c.equals(cd2c2)) {
					if (classDec.equals(cd2c.getSource())) {
						if (superClass.equals(cd2c2.getTarget())) {
							if (superClassDec.equals(typeAcc.getType())) {
								if (umlClassifier.equals(cd2c.getTarget())) {
									if (superClassDec.equals(cd2c2.getSource())) {
										if (typeAcc.equals(classDec.getSuperClass())) {
											_result.add(new Object[] { typeAcc, cd2c2, classDec, superClass, cd2c,
													umlClassifier, superClassDec });
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
			TypeAccess typeAcc, NamedElement2NamedElement cd2c2, ClassDeclaration classDec,
			org.eclipse.uml2.uml.Class superClass, NamedElement2NamedElement cd2c, Classifier umlClassifier,
			Type superClassDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superClassDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClassifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superClassDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cd2c__classDec____source_name_prime = "source";
		String cd2c2__superClass____target_name_prime = "target";
		String typeAcc__superClassDec____type_name_prime = "type";
		String superClassDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String cd2c__umlClassifier____target_name_prime = "target";
		String cd2c2__superClassDec____source_name_prime = "source";
		String classDec__typeAcc____superClass_name_prime = "superClass";
		isApplicableMatch.getAllContextElements().add(typeAcc);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(superClass);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(umlClassifier);
		isApplicableMatch.getAllContextElements().add(superClassDec);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c2__superClass____target.setSrc(cd2c2);
		cd2c2__superClass____target.setTrg(superClass);
		isApplicableMatch.getAllContextElements().add(cd2c2__superClass____target);
		typeAcc__superClassDec____type.setSrc(typeAcc);
		typeAcc__superClassDec____type.setTrg(superClassDec);
		isApplicableMatch.getAllContextElements().add(typeAcc__superClassDec____type);
		superClassDec__typeAcc____usagesInTypeAccess.setSrc(superClassDec);
		superClassDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(superClassDec__typeAcc____usagesInTypeAccess);
		cd2c__umlClassifier____target.setSrc(cd2c);
		cd2c__umlClassifier____target.setTrg(umlClassifier);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClassifier____target);
		cd2c2__superClassDec____source.setSrc(cd2c2);
		cd2c2__superClassDec____source.setTrg(superClassDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superClassDec____source);
		classDec__typeAcc____superClass.setSrc(classDec);
		classDec__typeAcc____superClass.setTrg(typeAcc);
		isApplicableMatch.getAllContextElements().add(classDec__typeAcc____superClass);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		cd2c2__superClass____target.setName(cd2c2__superClass____target_name_prime);
		typeAcc__superClassDec____type.setName(typeAcc__superClassDec____type_name_prime);
		superClassDec__typeAcc____usagesInTypeAccess.setName(superClassDec__typeAcc____usagesInTypeAccess_name_prime);
		cd2c__umlClassifier____target.setName(cd2c__umlClassifier____target_name_prime);
		cd2c2__superClassDec____source.setName(cd2c2__superClassDec____source_name_prime);
		classDec__typeAcc____superClass.setName(classDec__typeAcc____superClass_name_prime);
		return new Object[] { typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec,
				isApplicableMatch, cd2c__classDec____source, cd2c2__superClass____target,
				typeAcc__superClassDec____type, superClassDec__typeAcc____usagesInTypeAccess,
				cd2c__umlClassifier____target, cd2c2__superClassDec____source, classDec__typeAcc____superClass };
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, TypeAccess typeAcc,
			NamedElement2NamedElement cd2c2, ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass,
			NamedElement2NamedElement cd2c, Classifier umlClassifier, Type superClassDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, typeAcc, cd2c2, classDec, superClass,
				cd2c, umlClassifier, superClassDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeAcc, cd2c2, classDec, superClass, cd2c,
					umlClassifier, superClassDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, TypeAccess typeAcc,
			NamedElement2NamedElement cd2c2, ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass,
			NamedElement2NamedElement cd2c, Classifier umlClassifier, Type superClassDec) {
		Object[] result_pattern_TypeAccess2Generalization_2_4_solveCSP_binding = pattern_TypeAccess2Generalization_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, typeAcc, cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec);
		if (result_pattern_TypeAccess2Generalization_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_2_4_solveCSP_black = pattern_TypeAccess2Generalization_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeAcc, cd2c2, classDec, superClass, cd2c,
						umlClassifier, superClassDec };
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
			TypeAccess2Generalization _this, Match match, Generalization generalization,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {
		if (!superClass.equals(umlClassifier)) {
			return new Object[] { _this, match, generalization, superClass, umlClassifier };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_2_SolveCSP_bindingFBBBBB(
			TypeAccess2Generalization _this, Match match, Generalization generalization,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, generalization, superClass, umlClassifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, generalization, superClass, umlClassifier };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_2_SolveCSP_bindingAndBlackFBBBBB(
			TypeAccess2Generalization _this, Match match, Generalization generalization,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {
		Object[] result_pattern_TypeAccess2Generalization_10_2_SolveCSP_binding = pattern_TypeAccess2Generalization_10_2_SolveCSP_bindingFBBBBB(
				_this, match, generalization, superClass, umlClassifier);
		if (result_pattern_TypeAccess2Generalization_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_10_2_SolveCSP_black = pattern_TypeAccess2Generalization_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, generalization, superClass, umlClassifier };
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
			Match match, Generalization generalization, org.eclipse.uml2.uml.Class superClass,
			Classifier umlClassifier) {
		if (!superClass.equals(umlClassifier)) {
			return new Object[] { match, generalization, superClass, umlClassifier };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, Generalization generalization, org.eclipse.uml2.uml.Class superClass,
			Classifier umlClassifier) {
		EMoflonEdge umlClassifier__generalization____generalization = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__umlClassifier____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__superClass____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(generalization);
		String umlClassifier__generalization____generalization_name_prime = "generalization";
		String generalization__umlClassifier____specific_name_prime = "specific";
		String generalization__superClass____general_name_prime = "general";
		umlClassifier__generalization____generalization.setSrc(umlClassifier);
		umlClassifier__generalization____generalization.setTrg(generalization);
		match.getToBeTranslatedEdges().add(umlClassifier__generalization____generalization);
		generalization__umlClassifier____specific.setSrc(generalization);
		generalization__umlClassifier____specific.setTrg(umlClassifier);
		match.getToBeTranslatedEdges().add(generalization__umlClassifier____specific);
		generalization__superClass____general.setSrc(generalization);
		generalization__superClass____general.setTrg(superClass);
		match.getToBeTranslatedEdges().add(generalization__superClass____general);
		umlClassifier__generalization____generalization
				.setName(umlClassifier__generalization____generalization_name_prime);
		generalization__umlClassifier____specific.setName(generalization__umlClassifier____specific_name_prime);
		generalization__superClass____general.setName(generalization__superClass____general_name_prime);
		return new Object[] { match, generalization, superClass, umlClassifier,
				umlClassifier__generalization____generalization, generalization__umlClassifier____specific,
				generalization__superClass____general };
	}

	public static final Object[] pattern_TypeAccess2Generalization_10_5_collectcontextelements_blackBBBB(Match match,
			Generalization generalization, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {
		if (!superClass.equals(umlClassifier)) {
			return new Object[] { match, generalization, superClass, umlClassifier };
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
			TypeAccess2Generalization _this, Match match, Generalization generalization,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {
		_this.registerObjectsToMatch_BWD(match, generalization, superClass, umlClassifier);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("generalization");
		EObject _localVariable_1 = isApplicableMatch.getObject("cd2c2");
		EObject _localVariable_2 = isApplicableMatch.getObject("classDec");
		EObject _localVariable_3 = isApplicableMatch.getObject("superClass");
		EObject _localVariable_4 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_5 = isApplicableMatch.getObject("umlClassifier");
		EObject _localVariable_6 = isApplicableMatch.getObject("superClassDec");
		EObject tmpGeneralization = _localVariable_0;
		EObject tmpCd2c2 = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		EObject tmpSuperClass = _localVariable_3;
		EObject tmpCd2c = _localVariable_4;
		EObject tmpUmlClassifier = _localVariable_5;
		EObject tmpSuperClassDec = _localVariable_6;
		if (tmpGeneralization instanceof Generalization) {
			Generalization generalization = (Generalization) tmpGeneralization;
			if (tmpCd2c2 instanceof NamedElement2NamedElement) {
				NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) tmpCd2c2;
				if (tmpClassDec instanceof ClassDeclaration) {
					ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
					if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
						if (tmpCd2c instanceof NamedElement2NamedElement) {
							NamedElement2NamedElement cd2c = (NamedElement2NamedElement) tmpCd2c;
							if (tmpUmlClassifier instanceof Classifier) {
								Classifier umlClassifier = (Classifier) tmpUmlClassifier;
								if (tmpSuperClassDec instanceof Type) {
									Type superClassDec = (Type) tmpSuperClassDec;
									return new Object[] { generalization, cd2c2, classDec, superClass, cd2c,
											umlClassifier, superClassDec, isApplicableMatch };
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
			Generalization generalization, NamedElement2NamedElement cd2c2, ClassDeclaration classDec,
			org.eclipse.uml2.uml.Class superClass, NamedElement2NamedElement cd2c, Classifier umlClassifier,
			Type superClassDec, TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch) {
		if (!classDec.equals(superClassDec)) {
			if (!superClass.equals(umlClassifier)) {
				if (!cd2c.equals(cd2c2)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { generalization, cd2c2, classDec, superClass, cd2c, umlClassifier,
									superClassDec, csp, _this, isApplicableMatch };
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
			Generalization generalization = (Generalization) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[0];
			NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[1];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[3];
			NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[4];
			Classifier umlClassifier = (Classifier) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[5];
			Type superClassDec = (Type) result_pattern_TypeAccess2Generalization_11_1_performtransformation_binding[6];

			Object[] result_pattern_TypeAccess2Generalization_11_1_performtransformation_black = pattern_TypeAccess2Generalization_11_1_performtransformation_blackBBBBBBBFBB(
					generalization, cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec, _this,
					isApplicableMatch);
			if (result_pattern_TypeAccess2Generalization_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2Generalization_11_1_performtransformation_black[7];

				return new Object[] { generalization, cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec,
						csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_1_performtransformation_greenFBFBB(
			Generalization generalization, ClassDeclaration classDec, Type superClassDec) {
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2Generalization();
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		ta2g.setTarget(generalization);
		ta2g.setSource(typeAcc);
		typeAcc.setType(superClassDec);
		classDec.setSuperClass(typeAcc);
		return new Object[] { ta2g, generalization, typeAcc, classDec, superClassDec };
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_2_collecttranslatedelements_blackBBB(
			org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g, Generalization generalization,
			TypeAccess typeAcc) {
		return new Object[] { ta2g, generalization, typeAcc };
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_2_collecttranslatedelements_greenFBBB(
			org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g, Generalization generalization,
			TypeAccess typeAcc) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(ta2g);
		ruleresult.getTranslatedElements().add(generalization);
		ruleresult.getCreatedElements().add(typeAcc);
		return new Object[] { ruleresult, ta2g, generalization, typeAcc };
	}

	public static final Object[] pattern_TypeAccess2Generalization_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ta2g, EObject generalization, EObject typeAcc, EObject cd2c2,
			EObject classDec, EObject superClass, EObject cd2c, EObject umlClassifier, EObject superClassDec) {
		if (!ta2g.equals(typeAcc)) {
			if (!ta2g.equals(umlClassifier)) {
				if (!generalization.equals(ta2g)) {
					if (!generalization.equals(typeAcc)) {
						if (!generalization.equals(superClass)) {
							if (!generalization.equals(umlClassifier)) {
								if (!generalization.equals(superClassDec)) {
									if (!typeAcc.equals(umlClassifier)) {
										if (!cd2c2.equals(ta2g)) {
											if (!cd2c2.equals(generalization)) {
												if (!cd2c2.equals(typeAcc)) {
													if (!cd2c2.equals(classDec)) {
														if (!cd2c2.equals(superClass)) {
															if (!cd2c2.equals(umlClassifier)) {
																if (!cd2c2.equals(superClassDec)) {
																	if (!classDec.equals(ta2g)) {
																		if (!classDec.equals(generalization)) {
																			if (!classDec.equals(typeAcc)) {
																				if (!classDec.equals(superClass)) {
																					if (!classDec
																							.equals(umlClassifier)) {
																						if (!classDec.equals(
																								superClassDec)) {
																							if (!superClass
																									.equals(ta2g)) {
																								if (!superClass.equals(
																										typeAcc)) {
																									if (!superClass
																											.equals(umlClassifier)) {
																										if (!superClass
																												.equals(superClassDec)) {
																											if (!cd2c
																													.equals(ta2g)) {
																												if (!cd2c
																														.equals(generalization)) {
																													if (!cd2c
																															.equals(typeAcc)) {
																														if (!cd2c
																																.equals(cd2c2)) {
																															if (!cd2c
																																	.equals(classDec)) {
																																if (!cd2c
																																		.equals(superClass)) {
																																	if (!cd2c
																																			.equals(umlClassifier)) {
																																		if (!cd2c
																																				.equals(superClassDec)) {
																																			if (!superClassDec
																																					.equals(ta2g)) {
																																				if (!superClassDec
																																						.equals(typeAcc)) {
																																					if (!superClassDec
																																							.equals(umlClassifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								ta2g,
																																								generalization,
																																								typeAcc,
																																								cd2c2,
																																								classDec,
																																								superClass,
																																								cd2c,
																																								umlClassifier,
																																								superClassDec };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject ta2g, EObject generalization, EObject typeAcc, EObject classDec,
			EObject superClass, EObject umlClassifier, EObject superClassDec) {
		EMoflonEdge ta2g__typeAcc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2g__generalization____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClassifier__generalization____generalization = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__umlClassifier____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAcc__superClassDec____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge superClassDec__typeAcc____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__typeAcc____superClass = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__superClass____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2Generalization";
		String ta2g__typeAcc____source_name_prime = "source";
		String ta2g__generalization____target_name_prime = "target";
		String umlClassifier__generalization____generalization_name_prime = "generalization";
		String generalization__umlClassifier____specific_name_prime = "specific";
		String typeAcc__superClassDec____type_name_prime = "type";
		String superClassDec__typeAcc____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String classDec__typeAcc____superClass_name_prime = "superClass";
		String generalization__superClass____general_name_prime = "general";
		ta2g__typeAcc____source.setSrc(ta2g);
		ta2g__typeAcc____source.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(ta2g__typeAcc____source);
		ta2g__generalization____target.setSrc(ta2g);
		ta2g__generalization____target.setTrg(generalization);
		ruleresult.getCreatedEdges().add(ta2g__generalization____target);
		umlClassifier__generalization____generalization.setSrc(umlClassifier);
		umlClassifier__generalization____generalization.setTrg(generalization);
		ruleresult.getTranslatedEdges().add(umlClassifier__generalization____generalization);
		generalization__umlClassifier____specific.setSrc(generalization);
		generalization__umlClassifier____specific.setTrg(umlClassifier);
		ruleresult.getTranslatedEdges().add(generalization__umlClassifier____specific);
		typeAcc__superClassDec____type.setSrc(typeAcc);
		typeAcc__superClassDec____type.setTrg(superClassDec);
		ruleresult.getCreatedEdges().add(typeAcc__superClassDec____type);
		superClassDec__typeAcc____usagesInTypeAccess.setSrc(superClassDec);
		superClassDec__typeAcc____usagesInTypeAccess.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(superClassDec__typeAcc____usagesInTypeAccess);
		classDec__typeAcc____superClass.setSrc(classDec);
		classDec__typeAcc____superClass.setTrg(typeAcc);
		ruleresult.getCreatedEdges().add(classDec__typeAcc____superClass);
		generalization__superClass____general.setSrc(generalization);
		generalization__superClass____general.setTrg(superClass);
		ruleresult.getTranslatedEdges().add(generalization__superClass____general);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ta2g__typeAcc____source.setName(ta2g__typeAcc____source_name_prime);
		ta2g__generalization____target.setName(ta2g__generalization____target_name_prime);
		umlClassifier__generalization____generalization
				.setName(umlClassifier__generalization____generalization_name_prime);
		generalization__umlClassifier____specific.setName(generalization__umlClassifier____specific_name_prime);
		typeAcc__superClassDec____type.setName(typeAcc__superClassDec____type_name_prime);
		superClassDec__typeAcc____usagesInTypeAccess.setName(superClassDec__typeAcc____usagesInTypeAccess_name_prime);
		classDec__typeAcc____superClass.setName(classDec__typeAcc____superClass_name_prime);
		generalization__superClass____general.setName(generalization__superClass____general_name_prime);
		return new Object[] { ruleresult, ta2g, generalization, typeAcc, classDec, superClass, umlClassifier,
				superClassDec, ta2g__typeAcc____source, ta2g__generalization____target,
				umlClassifier__generalization____generalization, generalization__umlClassifier____specific,
				typeAcc__superClassDec____type, superClassDec__typeAcc____usagesInTypeAccess,
				classDec__typeAcc____superClass, generalization__superClass____general };
	}

	public static final void pattern_TypeAccess2Generalization_11_5_registerobjects_expressionBBBBBBBBBBB(
			TypeAccess2Generalization _this, PerformRuleResult ruleresult, EObject ta2g, EObject generalization,
			EObject typeAcc, EObject cd2c2, EObject classDec, EObject superClass, EObject cd2c, EObject umlClassifier,
			EObject superClassDec) {
		_this.registerObjects_BWD(ruleresult, ta2g, generalization, typeAcc, cd2c2, classDec, superClass, cd2c,
				umlClassifier, superClassDec);

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
		EObject _localVariable_0 = match.getObject("generalization");
		EObject _localVariable_1 = match.getObject("superClass");
		EObject _localVariable_2 = match.getObject("umlClassifier");
		EObject tmpGeneralization = _localVariable_0;
		EObject tmpSuperClass = _localVariable_1;
		EObject tmpUmlClassifier = _localVariable_2;
		if (tmpGeneralization instanceof Generalization) {
			Generalization generalization = (Generalization) tmpGeneralization;
			if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
				if (tmpUmlClassifier instanceof Classifier) {
					Classifier umlClassifier = (Classifier) tmpUmlClassifier;
					return new Object[] { generalization, superClass, umlClassifier, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_12_2_corematch_blackBFFBFBFB(
			Generalization generalization, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!superClass.equals(umlClassifier)) {
			for (NamedElement2NamedElement cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(superClass, NamedElement2NamedElement.class, "target")) {
				org.eclipse.modisco.java.NamedElement tmpSuperClassDec = cd2c2.getSource();
				if (tmpSuperClassDec instanceof Type) {
					Type superClassDec = (Type) tmpSuperClassDec;
					for (NamedElement2NamedElement cd2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(umlClassifier, NamedElement2NamedElement.class, "target")) {
						if (!cd2c.equals(cd2c2)) {
							org.eclipse.modisco.java.NamedElement tmpClassDec = cd2c.getSource();
							if (tmpClassDec instanceof ClassDeclaration) {
								ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
								if (!classDec.equals(superClassDec)) {
									_result.add(new Object[] { generalization, cd2c2, classDec, superClass, cd2c,
											umlClassifier, superClassDec, match });
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
			Generalization generalization, NamedElement2NamedElement cd2c2, ClassDeclaration classDec,
			org.eclipse.uml2.uml.Class superClass, NamedElement2NamedElement cd2c, Classifier umlClassifier,
			Type superClassDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!classDec.equals(superClassDec)) {
			if (!superClass.equals(umlClassifier)) {
				if (!cd2c.equals(cd2c2)) {
					if (classDec.equals(cd2c.getSource())) {
						if (superClass.equals(cd2c2.getTarget())) {
							if (umlClassifier.getGeneralizations().contains(generalization)) {
								if (umlClassifier.equals(cd2c.getTarget())) {
									if (superClassDec.equals(cd2c2.getSource())) {
										if (superClass.equals(generalization.getGeneral())) {
											_result.add(new Object[] { generalization, cd2c2, classDec, superClass,
													cd2c, umlClassifier, superClassDec });
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
			Generalization generalization, NamedElement2NamedElement cd2c2, ClassDeclaration classDec,
			org.eclipse.uml2.uml.Class superClass, NamedElement2NamedElement cd2c, Classifier umlClassifier,
			Type superClassDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlClassifier__generalization____generalization = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__umlClassifier____specific = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClassifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c2__superClassDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge generalization__superClass____general = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cd2c__classDec____source_name_prime = "source";
		String cd2c2__superClass____target_name_prime = "target";
		String umlClassifier__generalization____generalization_name_prime = "generalization";
		String generalization__umlClassifier____specific_name_prime = "specific";
		String cd2c__umlClassifier____target_name_prime = "target";
		String cd2c2__superClassDec____source_name_prime = "source";
		String generalization__superClass____general_name_prime = "general";
		isApplicableMatch.getAllContextElements().add(generalization);
		isApplicableMatch.getAllContextElements().add(cd2c2);
		isApplicableMatch.getAllContextElements().add(classDec);
		isApplicableMatch.getAllContextElements().add(superClass);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(umlClassifier);
		isApplicableMatch.getAllContextElements().add(superClassDec);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c2__superClass____target.setSrc(cd2c2);
		cd2c2__superClass____target.setTrg(superClass);
		isApplicableMatch.getAllContextElements().add(cd2c2__superClass____target);
		umlClassifier__generalization____generalization.setSrc(umlClassifier);
		umlClassifier__generalization____generalization.setTrg(generalization);
		isApplicableMatch.getAllContextElements().add(umlClassifier__generalization____generalization);
		generalization__umlClassifier____specific.setSrc(generalization);
		generalization__umlClassifier____specific.setTrg(umlClassifier);
		isApplicableMatch.getAllContextElements().add(generalization__umlClassifier____specific);
		cd2c__umlClassifier____target.setSrc(cd2c);
		cd2c__umlClassifier____target.setTrg(umlClassifier);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClassifier____target);
		cd2c2__superClassDec____source.setSrc(cd2c2);
		cd2c2__superClassDec____source.setTrg(superClassDec);
		isApplicableMatch.getAllContextElements().add(cd2c2__superClassDec____source);
		generalization__superClass____general.setSrc(generalization);
		generalization__superClass____general.setTrg(superClass);
		isApplicableMatch.getAllContextElements().add(generalization__superClass____general);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		cd2c2__superClass____target.setName(cd2c2__superClass____target_name_prime);
		umlClassifier__generalization____generalization
				.setName(umlClassifier__generalization____generalization_name_prime);
		generalization__umlClassifier____specific.setName(generalization__umlClassifier____specific_name_prime);
		cd2c__umlClassifier____target.setName(cd2c__umlClassifier____target_name_prime);
		cd2c2__superClassDec____source.setName(cd2c2__superClassDec____source_name_prime);
		generalization__superClass____general.setName(generalization__superClass____general_name_prime);
		return new Object[] { generalization, cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec,
				isApplicableMatch, cd2c__classDec____source, cd2c2__superClass____target,
				umlClassifier__generalization____generalization, generalization__umlClassifier____specific,
				cd2c__umlClassifier____target, cd2c2__superClassDec____source, generalization__superClass____general };
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_4_solveCSP_bindingFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, Generalization generalization,
			NamedElement2NamedElement cd2c2, ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass,
			NamedElement2NamedElement cd2c, Classifier umlClassifier, Type superClassDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, generalization, cd2c2, classDec,
				superClass, cd2c, umlClassifier, superClassDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, generalization, cd2c2, classDec, superClass, cd2c,
					umlClassifier, superClassDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, Generalization generalization,
			NamedElement2NamedElement cd2c2, ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass,
			NamedElement2NamedElement cd2c, Classifier umlClassifier, Type superClassDec) {
		Object[] result_pattern_TypeAccess2Generalization_12_4_solveCSP_binding = pattern_TypeAccess2Generalization_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, generalization, cd2c2, classDec, superClass, cd2c, umlClassifier,
				superClassDec);
		if (result_pattern_TypeAccess2Generalization_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_12_4_solveCSP_black = pattern_TypeAccess2Generalization_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, generalization, cd2c2, classDec, superClass, cd2c,
						umlClassifier, superClassDec };
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
			EMoflonEdge _edge_generalization) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlClassifier = _edge_generalization.getSrc();
		if (tmpUmlClassifier instanceof Classifier) {
			Classifier umlClassifier = (Classifier) tmpUmlClassifier;
			EObject tmpGeneralization = _edge_generalization.getTrg();
			if (tmpGeneralization instanceof Generalization) {
				Generalization generalization = (Generalization) tmpGeneralization;
				if (umlClassifier.getGeneralizations().contains(generalization)) {
					Classifier tmpSuperClass = generalization.getGeneral();
					if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
						if (!superClass.equals(umlClassifier)) {
							_result.add(
									new Object[] { generalization, superClass, umlClassifier, _edge_generalization });
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
			TypeAccess2Generalization _this, Match match, Generalization generalization,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, generalization, superClass, umlClassifier);
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
			TypeAccess typeAcc, ClassDeclaration classDec, Type superClassDec) {
		if (!classDec.equals(superClassDec)) {
			for (AbstractTypeDeclaration __DEC_typeAcc_superInterfaces_828798 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(typeAcc, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!classDec.equals(__DEC_typeAcc_superInterfaces_828798)) {
					if (!superClassDec.equals(__DEC_typeAcc_superInterfaces_828798)) {
						return new Object[] { typeAcc, classDec, superClassDec };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAcc) {
		for (Annotation __DEC_typeAcc_type_902046 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAcc, Type superClassDec) {
		for (ArrayType __DEC_typeAcc_elementType_397773 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			if (!superClassDec.equals(__DEC_typeAcc_elementType_397773)) {
				return new Object[] { typeAcc, superClassDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_809195 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess typeAcc, Type superClassDec) {
		for (ParameterizedType __DEC_typeAcc_type_910388 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			if (!superClassDec.equals(__DEC_typeAcc_type_910388)) {
				return new Object[] { typeAcc, superClassDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_922890 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_587458 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess typeAcc) {
		for (ArrayInitializer __DEC_typeAcc_expressions_932269 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayInitializer.class, "expressions")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_8BB(
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
									if (pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_7B(
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
																typeAcc, classDec, superClassDec) == null) {
															if (pattern_TypeAccess2Generalization_21_2_testcorematchandDECs_black_nac_8BB(
																	classDec, typeAcc) == null) {
																_result.add(new Object[] { typeAcc, classDec,
																		superClassDec, _edge_type });
															}
														}
													}
												}
											}
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
			TypeAccess2Generalization _this, Match match, TypeAccess typeAcc, ClassDeclaration classDec,
			Type superClassDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, typeAcc, classDec, superClassDec);
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
		EObject _localVariable_0 = targetMatch.getObject("generalization");
		EObject _localVariable_1 = sourceMatch.getObject("typeAcc");
		EObject _localVariable_2 = sourceMatch.getObject("classDec");
		EObject _localVariable_3 = targetMatch.getObject("superClass");
		EObject _localVariable_4 = targetMatch.getObject("umlClassifier");
		EObject _localVariable_5 = sourceMatch.getObject("superClassDec");
		EObject tmpGeneralization = _localVariable_0;
		EObject tmpTypeAcc = _localVariable_1;
		EObject tmpClassDec = _localVariable_2;
		EObject tmpSuperClass = _localVariable_3;
		EObject tmpUmlClassifier = _localVariable_4;
		EObject tmpSuperClassDec = _localVariable_5;
		if (tmpGeneralization instanceof Generalization) {
			Generalization generalization = (Generalization) tmpGeneralization;
			if (tmpTypeAcc instanceof TypeAccess) {
				TypeAccess typeAcc = (TypeAccess) tmpTypeAcc;
				if (tmpClassDec instanceof ClassDeclaration) {
					ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
					if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
						if (tmpUmlClassifier instanceof Classifier) {
							Classifier umlClassifier = (Classifier) tmpUmlClassifier;
							if (tmpSuperClassDec instanceof Type) {
								Type superClassDec = (Type) tmpSuperClassDec;
								return new Object[] { generalization, typeAcc, classDec, superClass, umlClassifier,
										superClassDec, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_blackBBBBBBBB(
			Generalization generalization, TypeAccess typeAcc, ClassDeclaration classDec,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier, Type superClassDec, Match sourceMatch,
			Match targetMatch) {
		if (!classDec.equals(superClassDec)) {
			if (!superClass.equals(umlClassifier)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { generalization, typeAcc, classDec, superClass, umlClassifier, superClassDec,
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
			Generalization generalization = (Generalization) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[0];
			TypeAccess typeAcc = (TypeAccess) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[1];
			ClassDeclaration classDec = (ClassDeclaration) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[3];
			Classifier umlClassifier = (Classifier) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[4];
			Type superClassDec = (Type) result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_black = pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_blackBBBBBBBB(
					generalization, typeAcc, classDec, superClass, umlClassifier, superClassDec, sourceMatch,
					targetMatch);
			if (result_pattern_TypeAccess2Generalization_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { generalization, typeAcc, classDec, superClass, umlClassifier, superClassDec,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_3_solvecsp_bindingFBBBBBBBBB(
			TypeAccess2Generalization _this, Generalization generalization, TypeAccess typeAcc,
			ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier,
			Type superClassDec, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(generalization, typeAcc, classDec, superClass,
				umlClassifier, superClassDec, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, generalization, typeAcc, classDec, superClass, umlClassifier,
					superClassDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			TypeAccess2Generalization _this, Generalization generalization, TypeAccess typeAcc,
			ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier,
			Type superClassDec, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2Generalization_24_3_solvecsp_binding = pattern_TypeAccess2Generalization_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, generalization, typeAcc, classDec, superClass, umlClassifier, superClassDec, sourceMatch,
				targetMatch);
		if (result_pattern_TypeAccess2Generalization_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_24_3_solvecsp_black = pattern_TypeAccess2Generalization_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, generalization, typeAcc, classDec, superClass, umlClassifier,
						superClassDec, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2Generalization_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2Generalization_24_5_matchcorrcontext_blackFBBFBBBB(
			ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier,
			Type superClassDec, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!classDec.equals(superClassDec)) {
			if (!superClass.equals(umlClassifier)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (NamedElement2NamedElement cd2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(classDec, NamedElement2NamedElement.class, "source")) {
						if (umlClassifier.equals(cd2c.getTarget())) {
							for (NamedElement2NamedElement cd2c2 : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(superClass, NamedElement2NamedElement.class, "target")) {
								if (!cd2c.equals(cd2c2)) {
									if (superClassDec.equals(cd2c2.getSource())) {
										_result.add(new Object[] { cd2c2, classDec, superClass, cd2c, umlClassifier,
												superClassDec, sourceMatch, targetMatch });
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
			NamedElement2NamedElement cd2c2, NamedElement2NamedElement cd2c, Match sourceMatch, Match targetMatch) {
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
			Generalization generalization, TypeAccess typeAcc, ClassDeclaration classDec,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier, Type superClassDec, CCMatch ccMatch) {
		if (!classDec.equals(superClassDec)) {
			if (!superClass.equals(umlClassifier)) {
				return new Object[] { generalization, typeAcc, classDec, superClass, umlClassifier, superClassDec,
						ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_24_6_createcorrespondence_greenFBBB(
			Generalization generalization, TypeAccess typeAcc, CCMatch ccMatch) {
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2Generalization();
		ta2g.setSource(typeAcc);
		ta2g.setTarget(generalization);
		ccMatch.getCreateCorr().add(ta2g);
		return new Object[] { ta2g, generalization, typeAcc, ccMatch };
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
			TypeAccess typeAcc, ClassDeclaration classDec, Type superClassDec) {
		if (!classDec.equals(superClassDec)) {
			for (AbstractTypeDeclaration __DEC_typeAcc_superInterfaces_62150 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(typeAcc, AbstractTypeDeclaration.class, "superInterfaces")) {
				if (!classDec.equals(__DEC_typeAcc_superInterfaces_62150)) {
					if (!superClassDec.equals(__DEC_typeAcc_superInterfaces_62150)) {
						return new Object[] { typeAcc, classDec, superClassDec };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAcc) {
		for (Annotation __DEC_typeAcc_type_549465 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, Annotation.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAcc, Type superClassDec) {
		for (ArrayType __DEC_typeAcc_elementType_823816 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayType.class, "elementType")) {
			if (!superClassDec.equals(__DEC_typeAcc_elementType_823816)) {
				return new Object[] { typeAcc, superClassDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_3B(
			TypeAccess typeAcc) {
		for (MethodDeclaration __DEC_typeAcc_returnType_409383 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_4BB(
			TypeAccess typeAcc, Type superClassDec) {
		for (ParameterizedType __DEC_typeAcc_type_102714 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ParameterizedType.class, "type")) {
			if (!superClassDec.equals(__DEC_typeAcc_type_102714)) {
				return new Object[] { typeAcc, superClassDec };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAcc) {
		for (SingleVariableDeclaration __DEC_typeAcc_type_609598 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAcc) {
		for (AnnotationMemberValuePair __DEC_typeAcc_value_726284 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_7B(
			TypeAccess typeAcc) {
		for (ArrayInitializer __DEC_typeAcc_expressions_586458 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAcc, ArrayInitializer.class, "expressions")) {
			return new Object[] { typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_8BB(
			ClassDeclaration classDec, TypeAccess typeAcc) {
		if (classDec.getSuperInterfaces().contains(typeAcc)) {
			return new Object[] { classDec, typeAcc };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_27_1_matchtggpattern_blackBBB(TypeAccess typeAcc,
			ClassDeclaration classDec, Type superClassDec) {
		if (!classDec.equals(superClassDec)) {
			if (superClassDec.equals(typeAcc.getType())) {
				if (typeAcc.equals(classDec.getSuperClass())) {
					if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_0BBB(typeAcc, classDec,
							superClassDec) == null) {
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
												if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_7B(
														typeAcc) == null) {
													if (pattern_TypeAccess2Generalization_27_1_matchtggpattern_black_nac_8BB(
															classDec, typeAcc) == null) {
														return new Object[] { typeAcc, classDec, superClassDec };
													}
												}
											}
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
			Generalization generalization, org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier) {
		if (!superClass.equals(umlClassifier)) {
			if (umlClassifier.getGeneralizations().contains(generalization)) {
				if (superClass.equals(generalization.getGeneral())) {
					return new Object[] { generalization, superClass, umlClassifier };
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
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement cd2c2) {
		if (ruleResult.getCorrObjects().contains(cd2c2)) {
			return new Object[] { ruleResult, cd2c2 };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class superClass) {
		if (ruleResult.getTargetObjects().contains(superClass)) {
			return new Object[] { ruleResult, superClass };
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
			ModelgeneratorRuleResult ruleResult, ClassDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement cd2c) {
		if (ruleResult.getCorrObjects().contains(cd2c)) {
			return new Object[] { ruleResult, cd2c };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Classifier umlClassifier) {
		if (ruleResult.getTargetObjects().contains(umlClassifier)) {
			return new Object[] { ruleResult, umlClassifier };
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
						if (tmpCd2c2 instanceof NamedElement2NamedElement) {
							NamedElement2NamedElement cd2c2 = (NamedElement2NamedElement) tmpCd2c2;
							NamedElement tmpSuperClass = cd2c2.getTarget();
							if (tmpSuperClass instanceof org.eclipse.uml2.uml.Class) {
								org.eclipse.uml2.uml.Class superClass = (org.eclipse.uml2.uml.Class) tmpSuperClass;
								org.eclipse.modisco.java.NamedElement tmpSuperClassDec = cd2c2.getSource();
								if (tmpSuperClassDec instanceof Type) {
									Type superClassDec = (Type) tmpSuperClassDec;
									if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, cd2c2) == null) {
										if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, superClass) == null) {
											if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, superClassDec) == null) {
												for (EObject tmpCd2c : cd2cList.getEntryObjects()) {
													if (tmpCd2c instanceof NamedElement2NamedElement) {
														NamedElement2NamedElement cd2c = (NamedElement2NamedElement) tmpCd2c;
														if (!cd2c.equals(cd2c2)) {
															org.eclipse.modisco.java.NamedElement tmpClassDec = cd2c
																	.getSource();
															if (tmpClassDec instanceof ClassDeclaration) {
																ClassDeclaration classDec = (ClassDeclaration) tmpClassDec;
																if (!classDec.equals(superClassDec)) {
																	NamedElement tmpUmlClassifier = cd2c.getTarget();
																	if (tmpUmlClassifier instanceof Classifier) {
																		Classifier umlClassifier = (Classifier) tmpUmlClassifier;
																		if (!superClass.equals(umlClassifier)) {
																			if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult, cd2c) == null) {
																				if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult, classDec) == null) {
																					if (pattern_TypeAccess2Generalization_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							umlClassifier) == null) {
																						_result.add(new Object[] {
																								cd2c2List, cd2c2,
																								superClass,
																								superClassDec, cd2cList,
																								classDec, cd2c,
																								umlClassifier,
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
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, NamedElement2NamedElement cd2c2,
			ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass, NamedElement2NamedElement cd2c,
			Classifier umlClassifier, Type superClassDec, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, cd2c2, classDec, superClass, cd2c,
				umlClassifier, superClassDec, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, cd2c2, classDec, superClass, cd2c, umlClassifier,
					superClassDec, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			TypeAccess2Generalization _this, IsApplicableMatch isApplicableMatch, NamedElement2NamedElement cd2c2,
			ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass, NamedElement2NamedElement cd2c,
			Classifier umlClassifier, Type superClassDec, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeAccess2Generalization_29_3_solveCSP_binding = pattern_TypeAccess2Generalization_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec, ruleResult);
		if (result_pattern_TypeAccess2Generalization_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2Generalization_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2Generalization_29_3_solveCSP_black = pattern_TypeAccess2Generalization_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2Generalization_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, cd2c2, classDec, superClass, cd2c, umlClassifier,
						superClassDec, ruleResult };
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
			NamedElement2NamedElement cd2c2, ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass,
			NamedElement2NamedElement cd2c, Classifier umlClassifier, Type superClassDec) {
		if (!classDec.equals(superClassDec)) {
			if (!superClass.equals(umlClassifier)) {
				if (!cd2c.equals(cd2c2)) {
					return new Object[] { cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_6_perform_blackBBBBBBB(
			NamedElement2NamedElement cd2c2, ClassDeclaration classDec, org.eclipse.uml2.uml.Class superClass,
			NamedElement2NamedElement cd2c, Classifier umlClassifier, Type superClassDec,
			ModelgeneratorRuleResult ruleResult) {
		if (!classDec.equals(superClassDec)) {
			if (!superClass.equals(umlClassifier)) {
				if (!cd2c.equals(cd2c2)) {
					return new Object[] { cd2c2, classDec, superClass, cd2c, umlClassifier, superClassDec, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2Generalization_29_6_perform_greenFFFBBBBB(ClassDeclaration classDec,
			org.eclipse.uml2.uml.Class superClass, Classifier umlClassifier, Type superClassDec,
			ModelgeneratorRuleResult ruleResult) {
		org.gravity.tgg.modisco.uml.TypeAccess2Generalization ta2g = UmlFactory.eINSTANCE
				.createTypeAccess2Generalization();
		Generalization generalization = UMLFactory.eINSTANCE.createGeneralization();
		TypeAccess typeAcc = JavaFactory.eINSTANCE.createTypeAccess();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(ta2g);
		ta2g.setTarget(generalization);
		umlClassifier.getGeneralizations().add(generalization);
		generalization.setGeneral(superClass);
		ruleResult.getTargetObjects().add(generalization);
		ta2g.setSource(typeAcc);
		typeAcc.setType(superClassDec);
		classDec.setSuperClass(typeAcc);
		ruleResult.getSourceObjects().add(typeAcc);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { ta2g, generalization, typeAcc, classDec, superClass, umlClassifier, superClassDec,
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
