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
import org.eclipse.modisco.java.EnumDeclaration;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Type;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;

import org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InEnum;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Inner Declaration2 Inner Classifier In Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InnerDeclaration2InnerClassifier_InEnumImpl extends AbstractRuleImpl
		implements InnerDeclaration2InnerClassifier_InEnum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerDeclaration2InnerClassifier_InEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInnerDeclaration2InnerClassifier_InEnum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package jPackage,
			AbstractTypeDeclaration bodyDeclaration, EnumDeclaration jContainer) {

		Object[] result1_black = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_0_1_initialbindings_blackBBBBB(this, match, jPackage,
						bodyDeclaration, jContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[jContainer] = " + jContainer + ".");
		}

		Object[] result2_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						jPackage, bodyDeclaration, jContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[jContainer] = " + jContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_0_4_collectelementstobetranslated_blackBBBB(match,
							jPackage, bodyDeclaration, jContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[jContainer] = " + jContainer + ".");
			}
			InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_0_4_collectelementstobetranslated_greenBBBFF(match,
							bodyDeclaration, jContainer);
			//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_0_5_collectcontextelements_blackBBBB(match,
							jPackage, bodyDeclaration, jContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[jContainer] = " + jContainer + ".");
			}
			InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_0_5_collectcontextelements_greenBBBBFF(match,
							jPackage, bodyDeclaration, jContainer);
			//nothing EMoflonEdge jPackage__jContainer____ownedElements = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge jContainer__jPackage____package = (EMoflonEdge) result5_green[5];

			// 
			InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_0_6_registerobjectstomatch_expressionBBBBB(this,
							match, jPackage, bodyDeclaration, jContainer);
			return InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_0_7_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Classifier feature = (Classifier) result1_bindingAndBlack[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_bindingAndBlack[1];
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[3];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		Enumeration uContainer = (Enumeration) result1_bindingAndBlack[5];
		EnumDeclaration jContainer = (EnumDeclaration) result1_bindingAndBlack[6];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[7];
		JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_greenBB(feature, uPackage);

		Object[] result2_green = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", " + "[jPackage] = " + jPackage
					+ ", " + "[uPackage] = " + uPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = "
					+ ne2ne + ", " + "[p2p] = " + p2p + ".");
		}
		InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
						feature, uPackage, bodyDeclaration, jContainer);
		//nothing EMoflonEdge feature__uPackage____package = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge uPackage__feature____ownedType = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];

		// 
		// 
		InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_1_5_registerobjects_expressionBBBBBBBBBBB(this,
						ruleresult, feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne,
						p2p);
		return InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_binding[1];
		EnumDeclaration jContainer = (EnumDeclaration) result2_binding[2];
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_2_2_corematch_blackFFBFBFBFFB(jPackage,
						bodyDeclaration, jContainer, match)) {
			Classifier feature = (Classifier) result2_black[0];
			ASTNode2Element b2e = (ASTNode2Element) result2_black[1];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_black[3];
			Enumeration uContainer = (Enumeration) result2_black[5];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[7];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[8];
			// ForEach 
			for (Object[] result3_black : InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_2_3_findcontext_blackBBBBBBBBB(feature, b2e,
							jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p)) {
				Object[] result3_green = InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFF(
								feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge p2p__jPackage____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge p2p__uPackage____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge uContainer__uPackage____package = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge uPackage__uContainer____ownedType = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge jPackage__jContainer____ownedElements = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge jContainer__jPackage____package = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer,
								jContainer, ne2ne, p2p);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[b2e] = " + b2e + ", " + "[jPackage] = " + jPackage + ", " + "[uPackage] = " + uPackage
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uContainer] = " + uContainer
							+ ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ", " + "[p2p] = "
							+ p2p + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InnerDeclaration2InnerClassifier_InEnumImpl
							.pattern_InnerDeclaration2InnerClassifier_InEnum_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerDeclaration2InnerClassifier_InEnumImpl
							.pattern_InnerDeclaration2InnerClassifier_InEnum_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package jPackage,
			AbstractTypeDeclaration bodyDeclaration, EnumDeclaration jContainer) {
		match.registerObject("jPackage", jPackage);
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("jContainer", jContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package jPackage,
			AbstractTypeDeclaration bodyDeclaration, EnumDeclaration jContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Classifier feature, ASTNode2Element b2e,
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("b2e", b2e);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("uPackage", uPackage);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("p2p", p2p);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject feature, EObject b2e, EObject jPackage,
			EObject uPackage, EObject bodyDeclaration, EObject uContainer, EObject jContainer, EObject ne2ne,
			EObject p2p) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("uPackage", uPackage);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("p2p", p2p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Classifier feature, org.eclipse.uml2.uml.Package uPackage,
			Enumeration uContainer) {

		Object[] result1_black = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_10_1_initialbindings_blackBBBBB(this, match, feature,
						uPackage, uContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uPackage] = " + uPackage + ", "
					+ "[uContainer] = " + uContainer + ".");
		}

		Object[] result2_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						feature, uPackage, uContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uPackage] = " + uPackage + ", "
					+ "[uContainer] = " + uContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_10_4_collectelementstobetranslated_blackBBBB(match,
							feature, uPackage, uContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uPackage] = " + uPackage + ", " + "[uContainer] = "
						+ uContainer + ".");
			}
			InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_10_4_collectelementstobetranslated_greenBBBFF(
							match, feature, uPackage);
			//nothing EMoflonEdge feature__uPackage____package = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge uPackage__feature____ownedType = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_10_5_collectcontextelements_blackBBBB(match,
							feature, uPackage, uContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uPackage] = " + uPackage + ", " + "[uContainer] = "
						+ uContainer + ".");
			}
			InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_10_5_collectcontextelements_greenBBBBFF(match,
							feature, uPackage, uContainer);
			//nothing EMoflonEdge uContainer__uPackage____package = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge uPackage__uContainer____ownedType = (EMoflonEdge) result5_green[5];

			// 
			InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_10_6_registerobjectstomatch_expressionBBBBB(this,
							match, feature, uPackage, uContainer);
			return InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_10_7_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Classifier feature = (Classifier) result1_bindingAndBlack[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_bindingAndBlack[1];
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[3];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		Enumeration uContainer = (Enumeration) result1_bindingAndBlack[5];
		EnumDeclaration jContainer = (EnumDeclaration) result1_bindingAndBlack[6];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[7];
		JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result1_bindingAndBlack[8];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[9];
		InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_greenBB(bodyDeclaration,
						jContainer);

		Object[] result2_green = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult,
						feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", " + "[jPackage] = " + jPackage
					+ ", " + "[uPackage] = " + uPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = "
					+ ne2ne + ", " + "[p2p] = " + p2p + ".");
		}
		InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_11_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult,
						feature, uPackage, bodyDeclaration, jContainer);
		//nothing EMoflonEdge feature__uPackage____package = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge uPackage__feature____ownedType = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];

		// 
		// 
		InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_11_5_registerobjects_expressionBBBBBBBBBBB(this,
						ruleresult, feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne,
						p2p);
		return InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Classifier feature = (Classifier) result2_binding[0];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_binding[1];
		Enumeration uContainer = (Enumeration) result2_binding[2];
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_12_2_corematch_blackBFFBFBFFFB(feature, uPackage,
						uContainer, match)) {
			ASTNode2Element b2e = (ASTNode2Element) result2_black[1];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[2];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[4];
			EnumDeclaration jContainer = (EnumDeclaration) result2_black[6];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[7];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[8];
			// ForEach 
			for (Object[] result3_black : InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_12_3_findcontext_blackBBBBBBBBB(feature, b2e,
							jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p)) {
				Object[] result3_green = InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFF(
								feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[9];
				//nothing EMoflonEdge p2p__jPackage____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge p2p__uPackage____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge feature__uPackage____package = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge uPackage__feature____ownedType = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge uContainer__uPackage____package = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge uPackage__uContainer____ownedType = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge jPackage__jContainer____ownedElements = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge jContainer__jPackage____package = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
								isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer,
								jContainer, ne2ne, p2p);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[b2e] = " + b2e + ", " + "[jPackage] = " + jPackage + ", " + "[uPackage] = " + uPackage
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uContainer] = " + uContainer
							+ ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ", " + "[p2p] = "
							+ p2p + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InnerDeclaration2InnerClassifier_InEnumImpl
							.pattern_InnerDeclaration2InnerClassifier_InEnum_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerDeclaration2InnerClassifier_InEnumImpl
							.pattern_InnerDeclaration2InnerClassifier_InEnum_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Classifier feature, org.eclipse.uml2.uml.Package uPackage,
			Enumeration uContainer) {
		match.registerObject("feature", feature);
		match.registerObject("uPackage", uPackage);
		match.registerObject("uContainer", uContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Classifier feature, org.eclipse.uml2.uml.Package uPackage,
			Enumeration uContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Classifier feature, ASTNode2Element b2e,
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("b2e", b2e);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("uPackage", uPackage);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("p2p", p2p);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject feature, EObject b2e, EObject jPackage,
			EObject uPackage, EObject bodyDeclaration, EObject uContainer, EObject jContainer, EObject ne2ne,
			EObject p2p) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("uPackage", uPackage);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("p2p", p2p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_100(EMoflonEdge _edge_package) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_20_2_testcorematchandDECs_blackFFFB(_edge_package)) {
			Classifier feature = (Classifier) result2_black[0];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_black[1];
			Enumeration uContainer = (Enumeration) result2_black[2];
			Object[] result2_green = InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, feature, uPackage, uContainer)) {
				// 
				if (InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerDeclaration2InnerClassifier_InEnumImpl
							.pattern_InnerDeclaration2InnerClassifier_InEnum_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerDeclaration2InnerClassifier_InEnumImpl
							.pattern_InnerDeclaration2InnerClassifier_InEnum_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_105(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_21_2_testcorematchandDECs_blackFFFB(
						_edge_bodyDeclarations)) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[1];
			EnumDeclaration jContainer = (EnumDeclaration) result2_black[2];
			Object[] result2_green = InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, jPackage, bodyDeclaration, jContainer)) {
				// 
				if (InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerDeclaration2InnerClassifier_InEnumImpl
							.pattern_InnerDeclaration2InnerClassifier_InEnum_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerDeclaration2InnerClassifier_InEnumImpl
							.pattern_InnerDeclaration2InnerClassifier_InEnum_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InnerDeclaration2InnerClassifier_InEnum");
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
		ruleResult.setRule("InnerDeclaration2InnerClassifier_InEnum");
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

		Object[] result1_black = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Classifier feature = (Classifier) result2_bindingAndBlack[0];
		org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[1];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[2];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_bindingAndBlack[3];
		Enumeration uContainer = (Enumeration) result2_bindingAndBlack[4];
		EnumDeclaration jContainer = (EnumDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, feature,
						jPackage, uPackage, bodyDeclaration, uContainer, jContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[jPackage] = " + jPackage + ", " + "[uPackage] = " + uPackage
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", "
					+ "[jContainer] = " + jContainer + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_24_5_matchcorrcontext_blackBFBBBBBFFBB(feature,
							jPackage, uPackage, bodyDeclaration, uContainer, jContainer, sourceMatch, targetMatch)) {
				ASTNode2Element b2e = (ASTNode2Element) result5_black[1];
				ASTNode2Element ne2ne = (ASTNode2Element) result5_black[7];
				JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result5_black[8];
				Object[] result5_green = InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_24_5_matchcorrcontext_greenBBBBBF(b2e, ne2ne,
								p2p, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[5];

				Object[] result6_black = InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_24_6_createcorrespondence_blackBBBBBBB(feature,
								jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[jPackage] = " + jPackage + ", " + "[uPackage] = " + uPackage + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", "
							+ "[jContainer] = " + jContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_24_7_addtoreturnedresult_blackBB(result,
								ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_24_7_addtoreturnedresult_greenBB(result,
								ccMatch);

			}

		} else {
		}
		return InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Classifier feature, org.eclipse.modisco.java.Package jPackage,
			org.eclipse.uml2.uml.Package uPackage, AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer,
			EnumDeclaration jContainer, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package jPackage, AbstractTypeDeclaration bodyDeclaration,
			EnumDeclaration jContainer) {// 
		Object[] result1_black = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_27_1_matchtggpattern_blackBBB(jPackage,
						bodyDeclaration, jContainer);
		if (result1_black != null) {
			return InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_27_2_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Classifier feature, org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer) {// 
		Object[] result1_black = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_28_1_matchtggpattern_blackBBB(feature, uPackage,
						uContainer);
		if (result1_black != null) {
			return InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_28_2_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element b2eParameter,
			ASTNode2Element ne2neParameter) {

		Object[] result1_black = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_blackFFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList b2eList = (RuleEntryList) result2_black[0];
			Classifier feature = (Classifier) result2_black[1];
			ASTNode2Element b2e = (ASTNode2Element) result2_black[2];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[3];
			//nothing RuleEntryList ne2neList = (RuleEntryList) result2_black[4];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result2_black[5];
			EnumDeclaration jContainer = (EnumDeclaration) result2_black[6];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[7];
			Enumeration uContainer = (Enumeration) result2_black[8];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_black[9];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[10];

			Object[] result3_bindingAndBlack = InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
							isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer,
							jContainer, ne2ne, p2p, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
						+ "[b2e] = " + b2e + ", " + "[jPackage] = " + jPackage + ", " + "[uPackage] = " + uPackage
						+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", "
						+ "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ", " + "[p2p] = " + p2p + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InnerDeclaration2InnerClassifier_InEnumImpl
					.pattern_InnerDeclaration2InnerClassifier_InEnum_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InnerDeclaration2InnerClassifier_InEnumImpl
						.pattern_InnerDeclaration2InnerClassifier_InEnum_29_5_checknacs_blackBBBBBBBBB(feature, b2e,
								jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p);
				if (result5_black != null) {

					Object[] result6_black = InnerDeclaration2InnerClassifier_InEnumImpl
							.pattern_InnerDeclaration2InnerClassifier_InEnum_29_6_perform_blackBBBBBBBBBB(feature, b2e,
									jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = "
								+ feature + ", " + "[b2e] = " + b2e + ", " + "[jPackage] = " + jPackage + ", "
								+ "[uPackage] = " + uPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
								+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", "
								+ "[ne2ne] = " + ne2ne + ", " + "[p2p] = " + p2p + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					InnerDeclaration2InnerClassifier_InEnumImpl
							.pattern_InnerDeclaration2InnerClassifier_InEnum_29_6_perform_greenBBBBB(feature, uPackage,
									bodyDeclaration, jContainer, ruleResult);

				} else {
				}

			} else {
			}

		}
		return InnerDeclaration2InnerClassifier_InEnumImpl
				.pattern_InnerDeclaration2InnerClassifier_InEnum_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Classifier feature, ASTNode2Element b2e,
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("b2e", b2e);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("uPackage", uPackage);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("p2p", p2p);
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
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPROPRIATE_FWD__MATCH_PACKAGE_ABSTRACTTYPEDECLARATION_ENUMDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (EnumDeclaration) arguments.get(3));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_ABSTRACTTYPEDECLARATION_ENUMDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (EnumDeclaration) arguments.get(3));
			return null;
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_ABSTRACTTYPEDECLARATION_ENUMDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (AbstractTypeDeclaration) arguments.get(2),
					(EnumDeclaration) arguments.get(3));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_CLASSIFIER_ASTNODE2ELEMENT_PACKAGE_PACKAGE_ABSTRACTTYPEDECLARATION_ENUMERATION_ENUMDECLARATION_ASTNODE2ELEMENT_JAVAPACKAGE2UMLPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Classifier) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(org.eclipse.uml2.uml.Package) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(Enumeration) arguments.get(6), (EnumDeclaration) arguments.get(7),
					(ASTNode2Element) arguments.get(8), (JavaPackage2UmlPackage) arguments.get(9));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPROPRIATE_BWD__MATCH_CLASSIFIER_PACKAGE_ENUMERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2), (Enumeration) arguments.get(3));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASSIFIER_PACKAGE_ENUMERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2), (Enumeration) arguments.get(3));
			return null;
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASSIFIER_PACKAGE_ENUMERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2), (Enumeration) arguments.get(3));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSIFIER_ASTNODE2ELEMENT_PACKAGE_PACKAGE_ABSTRACTTYPEDECLARATION_ENUMERATION_ENUMDECLARATION_ASTNODE2ELEMENT_JAVAPACKAGE2UMLPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Classifier) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(org.eclipse.uml2.uml.Package) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(Enumeration) arguments.get(6), (EnumDeclaration) arguments.get(7),
					(ASTNode2Element) arguments.get(8), (JavaPackage2UmlPackage) arguments.get(9));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPROPRIATE_BWD_EMOFLON_EDGE_100__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_100((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPROPRIATE_FWD_EMOFLON_EDGE_105__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_105((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPLICABLE_SOLVE_CSP_CC__CLASSIFIER_PACKAGE_PACKAGE_ABSTRACTTYPEDECLARATION_ENUMERATION_ENUMDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Classifier) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(Enumeration) arguments.get(4), (EnumDeclaration) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___CHECK_DEC_FWD__PACKAGE_ABSTRACTTYPEDECLARATION_ENUMDECLARATION:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0),
					(AbstractTypeDeclaration) arguments.get(1), (EnumDeclaration) arguments.get(2));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___CHECK_DEC_BWD__CLASSIFIER_PACKAGE_ENUMERATION:
			return checkDEC_BWD((Classifier) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1),
					(Enumeration) arguments.get(2));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASSIFIER_ASTNODE2ELEMENT_PACKAGE_PACKAGE_ABSTRACTTYPEDECLARATION_ENUMERATION_ENUMDECLARATION_ASTNODE2ELEMENT_JAVAPACKAGE2UMLPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Classifier) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (org.eclipse.modisco.java.Package) arguments.get(3),
					(org.eclipse.uml2.uml.Package) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(Enumeration) arguments.get(6), (EnumDeclaration) arguments.get(7),
					(ASTNode2Element) arguments.get(8), (JavaPackage2UmlPackage) arguments.get(9),
					(ModelgeneratorRuleResult) arguments.get(10));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ENUM___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_0_1_initialbindings_blackBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match, org.eclipse.modisco.java.Package jPackage,
			AbstractTypeDeclaration bodyDeclaration, EnumDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { _this, match, jPackage, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_bindingFBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match, org.eclipse.modisco.java.Package jPackage,
			AbstractTypeDeclaration bodyDeclaration, EnumDeclaration jContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jPackage, bodyDeclaration, jContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jPackage, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_bindingAndBlackFBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match, org.eclipse.modisco.java.Package jPackage,
			AbstractTypeDeclaration bodyDeclaration, EnumDeclaration jContainer) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_bindingFBBBBB(
				_this, match, jPackage, bodyDeclaration, jContainer);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_black = pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jPackage, bodyDeclaration, jContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_0_3_CheckCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_0_4_collectelementstobetranslated_blackBBBB(
			Match match, org.eclipse.modisco.java.Package jPackage, AbstractTypeDeclaration bodyDeclaration,
			EnumDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { match, jPackage, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, AbstractTypeDeclaration bodyDeclaration, EnumDeclaration jContainer) {
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		match.getToBeTranslatedEdges().add(bodyDeclaration__jContainer____abstractTypeDeclaration);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____abstractTypeDeclaration
				.setName(bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime);
		return new Object[] { match, bodyDeclaration, jContainer, jContainer__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jContainer____abstractTypeDeclaration };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_0_5_collectcontextelements_blackBBBB(
			Match match, org.eclipse.modisco.java.Package jPackage, AbstractTypeDeclaration bodyDeclaration,
			EnumDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { match, jPackage, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_0_5_collectcontextelements_greenBBBBFF(
			Match match, org.eclipse.modisco.java.Package jPackage, AbstractTypeDeclaration bodyDeclaration,
			EnumDeclaration jContainer) {
		EMoflonEdge jPackage__jContainer____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(jPackage);
		match.getContextNodes().add(bodyDeclaration);
		match.getContextNodes().add(jContainer);
		String jPackage__jContainer____ownedElements_name_prime = "ownedElements";
		String jContainer__jPackage____package_name_prime = "package";
		jPackage__jContainer____ownedElements.setSrc(jPackage);
		jPackage__jContainer____ownedElements.setTrg(jContainer);
		match.getContextEdges().add(jPackage__jContainer____ownedElements);
		jContainer__jPackage____package.setSrc(jContainer);
		jContainer__jPackage____package.setTrg(jPackage);
		match.getContextEdges().add(jContainer__jPackage____package);
		jPackage__jContainer____ownedElements.setName(jPackage__jContainer____ownedElements_name_prime);
		jContainer__jPackage____package.setName(jContainer__jPackage____package_name_prime);
		return new Object[] { match, jPackage, bodyDeclaration, jContainer, jPackage__jContainer____ownedElements,
				jContainer__jPackage____package };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InEnum_0_6_registerobjectstomatch_expressionBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match, org.eclipse.modisco.java.Package jPackage,
			AbstractTypeDeclaration bodyDeclaration, EnumDeclaration jContainer) {
		_this.registerObjectsToMatch_FWD(match, jPackage, bodyDeclaration, jContainer);

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("b2e");
		EObject _localVariable_2 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("uPackage");
		EObject _localVariable_4 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_5 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_6 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_7 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_8 = isApplicableMatch.getObject("p2p");
		EObject tmpFeature = _localVariable_0;
		EObject tmpB2e = _localVariable_1;
		EObject tmpJPackage = _localVariable_2;
		EObject tmpUPackage = _localVariable_3;
		EObject tmpBodyDeclaration = _localVariable_4;
		EObject tmpUContainer = _localVariable_5;
		EObject tmpJContainer = _localVariable_6;
		EObject tmpNe2ne = _localVariable_7;
		EObject tmpP2p = _localVariable_8;
		if (tmpFeature instanceof Classifier) {
			Classifier feature = (Classifier) tmpFeature;
			if (tmpB2e instanceof ASTNode2Element) {
				ASTNode2Element b2e = (ASTNode2Element) tmpB2e;
				if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
					if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
						if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
							if (tmpUContainer instanceof Enumeration) {
								Enumeration uContainer = (Enumeration) tmpUContainer;
								if (tmpJContainer instanceof EnumDeclaration) {
									EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
									if (tmpNe2ne instanceof ASTNode2Element) {
										ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
										if (tmpP2p instanceof JavaPackage2UmlPackage) {
											JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) tmpP2p;
											return new Object[] { feature, b2e, jPackage, uPackage, bodyDeclaration,
													uContainer, jContainer, ne2ne, p2p, isApplicableMatch };
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_blackBBBBBBBBBFBB(
			Classifier feature, ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage,
			org.eclipse.uml2.uml.Package uPackage, AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p,
			InnerDeclaration2InnerClassifier_InEnum _this, IsApplicableMatch isApplicableMatch) {
		if (!feature.equals(uContainer)) {
			if (!b2e.equals(ne2ne)) {
				if (!bodyDeclaration.equals(jContainer)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer,
									jContainer, ne2ne, p2p, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			InnerDeclaration2InnerClassifier_InEnum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding != null) {
			Classifier feature = (Classifier) result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding[0];
			ASTNode2Element b2e = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding[1];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding[4];
			Enumeration uContainer = (Enumeration) result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding[5];
			EnumDeclaration jContainer = (EnumDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding[6];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding[7];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_binding[8];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_black = pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_blackBBBBBBBBBFBB(
					feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p, _this,
					isApplicableMatch);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_black[9];

				return new Object[] { feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne,
						p2p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_1_1_performtransformation_greenBB(
			Classifier feature, org.eclipse.uml2.uml.Package uPackage) {
		feature.setPackage(uPackage);
		return new Object[] { feature, uPackage };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject b2e, EObject jPackage, EObject uPackage,
			EObject bodyDeclaration, EObject uContainer, EObject jContainer, EObject ne2ne, EObject p2p) {
		if (!feature.equals(jPackage)) {
			if (!feature.equals(uPackage)) {
				if (!feature.equals(uContainer)) {
					if (!feature.equals(jContainer)) {
						if (!feature.equals(ne2ne)) {
							if (!feature.equals(p2p)) {
								if (!b2e.equals(feature)) {
									if (!b2e.equals(jPackage)) {
										if (!b2e.equals(uPackage)) {
											if (!b2e.equals(bodyDeclaration)) {
												if (!b2e.equals(uContainer)) {
													if (!b2e.equals(jContainer)) {
														if (!b2e.equals(ne2ne)) {
															if (!b2e.equals(p2p)) {
																if (!jPackage.equals(uPackage)) {
																	if (!jPackage.equals(uContainer)) {
																		if (!jPackage.equals(ne2ne)) {
																			if (!jPackage.equals(p2p)) {
																				if (!bodyDeclaration.equals(feature)) {
																					if (!bodyDeclaration
																							.equals(jPackage)) {
																						if (!bodyDeclaration
																								.equals(uPackage)) {
																							if (!bodyDeclaration.equals(
																									uContainer)) {
																								if (!bodyDeclaration
																										.equals(jContainer)) {
																									if (!bodyDeclaration
																											.equals(ne2ne)) {
																										if (!bodyDeclaration
																												.equals(p2p)) {
																											if (!uContainer
																													.equals(uPackage)) {
																												if (!jContainer
																														.equals(jPackage)) {
																													if (!jContainer
																															.equals(uPackage)) {
																														if (!jContainer
																																.equals(uContainer)) {
																															if (!jContainer
																																	.equals(ne2ne)) {
																																if (!jContainer
																																		.equals(p2p)) {
																																	if (!ne2ne
																																			.equals(uPackage)) {
																																		if (!ne2ne
																																				.equals(uContainer)) {
																																			if (!ne2ne
																																					.equals(p2p)) {
																																				if (!p2p.equals(
																																						uPackage)) {
																																					if (!p2p.equals(
																																							uContainer)) {
																																						return new Object[] {
																																								ruleresult,
																																								feature,
																																								b2e,
																																								jPackage,
																																								uPackage,
																																								bodyDeclaration,
																																								uContainer,
																																								jContainer,
																																								ne2ne,
																																								p2p };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject uPackage, EObject bodyDeclaration,
			EObject jContainer) {
		EMoflonEdge feature__uPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__feature____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerDeclaration2InnerClassifier_InEnum";
		String feature__uPackage____package_name_prime = "package";
		String uPackage__feature____ownedType_name_prime = "ownedType";
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		feature__uPackage____package.setSrc(feature);
		feature__uPackage____package.setTrg(uPackage);
		ruleresult.getCreatedEdges().add(feature__uPackage____package);
		uPackage__feature____ownedType.setSrc(uPackage);
		uPackage__feature____ownedType.setTrg(feature);
		ruleresult.getCreatedEdges().add(uPackage__feature____ownedType);
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__jContainer____abstractTypeDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		feature__uPackage____package.setName(feature__uPackage____package_name_prime);
		uPackage__feature____ownedType.setName(uPackage__feature____ownedType_name_prime);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____abstractTypeDeclaration
				.setName(bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime);
		return new Object[] { ruleresult, feature, uPackage, bodyDeclaration, jContainer, feature__uPackage____package,
				uPackage__feature____ownedType, jContainer__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jContainer____abstractTypeDeclaration };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InEnum_1_5_registerobjects_expressionBBBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, PerformRuleResult ruleresult, EObject feature, EObject b2e,
			EObject jPackage, EObject uPackage, EObject bodyDeclaration, EObject uContainer, EObject jContainer,
			EObject ne2ne, EObject p2p) {
		_this.registerObjects_FWD(ruleresult, feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer,
				ne2ne, p2p);

	}

	public static final PerformRuleResult pattern_InnerDeclaration2InnerClassifier_InEnum_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerDeclaration2InnerClassifier_InEnum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_bindingAndBlackFFB(
			InnerDeclaration2InnerClassifier_InEnum _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerDeclaration2InnerClassifier_InEnum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_2_corematch_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("jPackage");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject _localVariable_2 = match.getObject("jContainer");
		EObject tmpJPackage = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpJContainer = _localVariable_2;
		if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
			if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
				if (tmpJContainer instanceof EnumDeclaration) {
					EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
					return new Object[] { jPackage, bodyDeclaration, jContainer, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InEnum_2_2_corematch_blackFFBFBFBFFB(
			org.eclipse.modisco.java.Package jPackage, AbstractTypeDeclaration bodyDeclaration,
			EnumDeclaration jContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!bodyDeclaration.equals(jContainer)) {
			for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jPackage, JavaPackage2UmlPackage.class, "source")) {
				org.eclipse.uml2.uml.Package uPackage = p2p.getTarget();
				if (uPackage != null) {
					for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jContainer, ASTNode2Element.class, "source")) {
						Element tmpUContainer = ne2ne.getTarget();
						if (tmpUContainer instanceof Enumeration) {
							Enumeration uContainer = (Enumeration) tmpUContainer;
							for (ASTNode2Element b2e : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(bodyDeclaration, ASTNode2Element.class, "source")) {
								if (!b2e.equals(ne2ne)) {
									Element tmpFeature = b2e.getTarget();
									if (tmpFeature instanceof Classifier) {
										Classifier feature = (Classifier) tmpFeature;
										if (!feature.equals(uContainer)) {
											_result.add(new Object[] { feature, b2e, jPackage, uPackage,
													bodyDeclaration, uContainer, jContainer, ne2ne, p2p, match });
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

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InEnum_2_3_findcontext_blackBBBBBBBBB(
			Classifier feature, ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage,
			org.eclipse.uml2.uml.Package uPackage, AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			if (!b2e.equals(ne2ne)) {
				if (!bodyDeclaration.equals(jContainer)) {
					if (jPackage.equals(p2p.getSource())) {
						if (jContainer.equals(ne2ne.getSource())) {
							if (uPackage.equals(p2p.getTarget())) {
								if (uPackage.equals(uContainer.getPackage())) {
									if (jPackage.getOwnedElements().contains(jContainer)) {
										if (bodyDeclaration.equals(b2e.getSource())) {
											if (jContainer.getBodyDeclarations().contains(bodyDeclaration)) {
												if (uContainer.equals(ne2ne.getTarget())) {
													if (feature.equals(b2e.getTarget())) {
														_result.add(new Object[] { feature, b2e, jPackage, uPackage,
																bodyDeclaration, uContainer, jContainer, ne2ne, p2p });
													}
												}
											}
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFF(
			Classifier feature, ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage,
			org.eclipse.uml2.uml.Package uPackage, AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2p__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__uPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__uPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__uContainer____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__jContainer____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2p__jPackage____source_name_prime = "source";
		String ne2ne__jContainer____source_name_prime = "source";
		String p2p__uPackage____target_name_prime = "target";
		String uContainer__uPackage____package_name_prime = "package";
		String uPackage__uContainer____ownedType_name_prime = "ownedType";
		String jPackage__jContainer____ownedElements_name_prime = "ownedElements";
		String jContainer__jPackage____package_name_prime = "package";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String ne2ne__uContainer____target_name_prime = "target";
		String b2e__feature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(b2e);
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(uPackage);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(p2p);
		p2p__jPackage____source.setSrc(p2p);
		p2p__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(p2p__jPackage____source);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		p2p__uPackage____target.setSrc(p2p);
		p2p__uPackage____target.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(p2p__uPackage____target);
		uContainer__uPackage____package.setSrc(uContainer);
		uContainer__uPackage____package.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(uContainer__uPackage____package);
		uPackage__uContainer____ownedType.setSrc(uPackage);
		uPackage__uContainer____ownedType.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(uPackage__uContainer____ownedType);
		jPackage__jContainer____ownedElements.setSrc(jPackage);
		jPackage__jContainer____ownedElements.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(jPackage__jContainer____ownedElements);
		jContainer__jPackage____package.setSrc(jContainer);
		jContainer__jPackage____package.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jContainer__jPackage____package);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(b2e__bodyDeclaration____source);
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__jContainer____abstractTypeDeclaration);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(b2e__feature____target);
		p2p__jPackage____source.setName(p2p__jPackage____source_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		p2p__uPackage____target.setName(p2p__uPackage____target_name_prime);
		uContainer__uPackage____package.setName(uContainer__uPackage____package_name_prime);
		uPackage__uContainer____ownedType.setName(uPackage__uContainer____ownedType_name_prime);
		jPackage__jContainer____ownedElements.setName(jPackage__jContainer____ownedElements_name_prime);
		jContainer__jPackage____package.setName(jContainer__jPackage____package_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____abstractTypeDeclaration
				.setName(bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p,
				isApplicableMatch, p2p__jPackage____source, ne2ne__jContainer____source, p2p__uPackage____target,
				uContainer__uPackage____package, uPackage__uContainer____ownedType,
				jPackage__jContainer____ownedElements, jContainer__jPackage____package, b2e__bodyDeclaration____source,
				jContainer__bodyDeclaration____bodyDeclarations, bodyDeclaration__jContainer____abstractTypeDeclaration,
				ne2ne__uContainer____target, b2e__feature____target };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_bindingFBBBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, IsApplicableMatch isApplicableMatch, Classifier feature,
			ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, feature, b2e, jPackage, uPackage,
				bodyDeclaration, uContainer, jContainer, ne2ne, p2p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration,
					uContainer, jContainer, ne2ne, p2p };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, IsApplicableMatch isApplicableMatch, Classifier feature,
			ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer,
				ne2ne, p2p);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_black = pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration,
						uContainer, jContainer, ne2ne, p2p };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_2_5_checkCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InEnum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerDeclaration2InnerClassifier_InEnum_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_10_1_initialbindings_blackBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { _this, match, feature, uPackage, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_bindingFBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uPackage, uContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uPackage, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_bindingAndBlackFBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_bindingFBBBBB(
				_this, match, feature, uPackage, uContainer);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_black = pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uPackage, uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_10_3_CheckCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Classifier feature, org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { match, feature, uPackage, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Classifier feature, org.eclipse.uml2.uml.Package uPackage) {
		EMoflonEdge feature__uPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__feature____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String feature__uPackage____package_name_prime = "package";
		String uPackage__feature____ownedType_name_prime = "ownedType";
		feature__uPackage____package.setSrc(feature);
		feature__uPackage____package.setTrg(uPackage);
		match.getToBeTranslatedEdges().add(feature__uPackage____package);
		uPackage__feature____ownedType.setSrc(uPackage);
		uPackage__feature____ownedType.setTrg(feature);
		match.getToBeTranslatedEdges().add(uPackage__feature____ownedType);
		feature__uPackage____package.setName(feature__uPackage____package_name_prime);
		uPackage__feature____ownedType.setName(uPackage__feature____ownedType_name_prime);
		return new Object[] { match, feature, uPackage, feature__uPackage____package, uPackage__feature____ownedType };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_10_5_collectcontextelements_blackBBBB(
			Match match, Classifier feature, org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { match, feature, uPackage, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_10_5_collectcontextelements_greenBBBBFF(
			Match match, Classifier feature, org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer) {
		EMoflonEdge uContainer__uPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__uContainer____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(feature);
		match.getContextNodes().add(uPackage);
		match.getContextNodes().add(uContainer);
		String uContainer__uPackage____package_name_prime = "package";
		String uPackage__uContainer____ownedType_name_prime = "ownedType";
		uContainer__uPackage____package.setSrc(uContainer);
		uContainer__uPackage____package.setTrg(uPackage);
		match.getContextEdges().add(uContainer__uPackage____package);
		uPackage__uContainer____ownedType.setSrc(uPackage);
		uPackage__uContainer____ownedType.setTrg(uContainer);
		match.getContextEdges().add(uPackage__uContainer____ownedType);
		uContainer__uPackage____package.setName(uContainer__uPackage____package_name_prime);
		uPackage__uContainer____ownedType.setName(uPackage__uContainer____ownedType_name_prime);
		return new Object[] { match, feature, uPackage, uContainer, uContainer__uPackage____package,
				uPackage__uContainer____ownedType };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InEnum_10_6_registerobjectstomatch_expressionBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer) {
		_this.registerObjectsToMatch_BWD(match, feature, uPackage, uContainer);

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_bindingFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("b2e");
		EObject _localVariable_2 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("uPackage");
		EObject _localVariable_4 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_5 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_6 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_7 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_8 = isApplicableMatch.getObject("p2p");
		EObject tmpFeature = _localVariable_0;
		EObject tmpB2e = _localVariable_1;
		EObject tmpJPackage = _localVariable_2;
		EObject tmpUPackage = _localVariable_3;
		EObject tmpBodyDeclaration = _localVariable_4;
		EObject tmpUContainer = _localVariable_5;
		EObject tmpJContainer = _localVariable_6;
		EObject tmpNe2ne = _localVariable_7;
		EObject tmpP2p = _localVariable_8;
		if (tmpFeature instanceof Classifier) {
			Classifier feature = (Classifier) tmpFeature;
			if (tmpB2e instanceof ASTNode2Element) {
				ASTNode2Element b2e = (ASTNode2Element) tmpB2e;
				if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
					org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
					if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
						if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
							if (tmpUContainer instanceof Enumeration) {
								Enumeration uContainer = (Enumeration) tmpUContainer;
								if (tmpJContainer instanceof EnumDeclaration) {
									EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
									if (tmpNe2ne instanceof ASTNode2Element) {
										ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
										if (tmpP2p instanceof JavaPackage2UmlPackage) {
											JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) tmpP2p;
											return new Object[] { feature, b2e, jPackage, uPackage, bodyDeclaration,
													uContainer, jContainer, ne2ne, p2p, isApplicableMatch };
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_blackBBBBBBBBBFBB(
			Classifier feature, ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage,
			org.eclipse.uml2.uml.Package uPackage, AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p,
			InnerDeclaration2InnerClassifier_InEnum _this, IsApplicableMatch isApplicableMatch) {
		if (!feature.equals(uContainer)) {
			if (!b2e.equals(ne2ne)) {
				if (!bodyDeclaration.equals(jContainer)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer,
									jContainer, ne2ne, p2p, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_bindingAndBlackFFFFFFFFFFBB(
			InnerDeclaration2InnerClassifier_InEnum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_bindingFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding != null) {
			Classifier feature = (Classifier) result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding[0];
			ASTNode2Element b2e = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding[1];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding[3];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding[4];
			Enumeration uContainer = (Enumeration) result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding[5];
			EnumDeclaration jContainer = (EnumDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding[6];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding[7];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_binding[8];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_black = pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_blackBBBBBBBBBFBB(
					feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p, _this,
					isApplicableMatch);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_black[9];

				return new Object[] { feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne,
						p2p, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_11_1_performtransformation_greenBB(
			AbstractTypeDeclaration bodyDeclaration, EnumDeclaration jContainer) {
		jContainer.getBodyDeclarations().add(bodyDeclaration);
		return new Object[] { bodyDeclaration, jContainer };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject b2e, EObject jPackage, EObject uPackage,
			EObject bodyDeclaration, EObject uContainer, EObject jContainer, EObject ne2ne, EObject p2p) {
		if (!feature.equals(jPackage)) {
			if (!feature.equals(uPackage)) {
				if (!feature.equals(uContainer)) {
					if (!feature.equals(jContainer)) {
						if (!feature.equals(ne2ne)) {
							if (!feature.equals(p2p)) {
								if (!b2e.equals(feature)) {
									if (!b2e.equals(jPackage)) {
										if (!b2e.equals(uPackage)) {
											if (!b2e.equals(bodyDeclaration)) {
												if (!b2e.equals(uContainer)) {
													if (!b2e.equals(jContainer)) {
														if (!b2e.equals(ne2ne)) {
															if (!b2e.equals(p2p)) {
																if (!jPackage.equals(uPackage)) {
																	if (!jPackage.equals(uContainer)) {
																		if (!jPackage.equals(ne2ne)) {
																			if (!jPackage.equals(p2p)) {
																				if (!bodyDeclaration.equals(feature)) {
																					if (!bodyDeclaration
																							.equals(jPackage)) {
																						if (!bodyDeclaration
																								.equals(uPackage)) {
																							if (!bodyDeclaration.equals(
																									uContainer)) {
																								if (!bodyDeclaration
																										.equals(jContainer)) {
																									if (!bodyDeclaration
																											.equals(ne2ne)) {
																										if (!bodyDeclaration
																												.equals(p2p)) {
																											if (!uContainer
																													.equals(uPackage)) {
																												if (!jContainer
																														.equals(jPackage)) {
																													if (!jContainer
																															.equals(uPackage)) {
																														if (!jContainer
																																.equals(uContainer)) {
																															if (!jContainer
																																	.equals(ne2ne)) {
																																if (!jContainer
																																		.equals(p2p)) {
																																	if (!ne2ne
																																			.equals(uPackage)) {
																																		if (!ne2ne
																																				.equals(uContainer)) {
																																			if (!ne2ne
																																					.equals(p2p)) {
																																				if (!p2p.equals(
																																						uPackage)) {
																																					if (!p2p.equals(
																																							uContainer)) {
																																						return new Object[] {
																																								ruleresult,
																																								feature,
																																								b2e,
																																								jPackage,
																																								uPackage,
																																								bodyDeclaration,
																																								uContainer,
																																								jContainer,
																																								ne2ne,
																																								p2p };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_11_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject uPackage, EObject bodyDeclaration,
			EObject jContainer) {
		EMoflonEdge feature__uPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__feature____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerDeclaration2InnerClassifier_InEnum";
		String feature__uPackage____package_name_prime = "package";
		String uPackage__feature____ownedType_name_prime = "ownedType";
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		feature__uPackage____package.setSrc(feature);
		feature__uPackage____package.setTrg(uPackage);
		ruleresult.getTranslatedEdges().add(feature__uPackage____package);
		uPackage__feature____ownedType.setSrc(uPackage);
		uPackage__feature____ownedType.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uPackage__feature____ownedType);
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		ruleresult.getCreatedEdges().add(bodyDeclaration__jContainer____abstractTypeDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		feature__uPackage____package.setName(feature__uPackage____package_name_prime);
		uPackage__feature____ownedType.setName(uPackage__feature____ownedType_name_prime);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____abstractTypeDeclaration
				.setName(bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime);
		return new Object[] { ruleresult, feature, uPackage, bodyDeclaration, jContainer, feature__uPackage____package,
				uPackage__feature____ownedType, jContainer__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jContainer____abstractTypeDeclaration };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InEnum_11_5_registerobjects_expressionBBBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, PerformRuleResult ruleresult, EObject feature, EObject b2e,
			EObject jPackage, EObject uPackage, EObject bodyDeclaration, EObject uContainer, EObject jContainer,
			EObject ne2ne, EObject p2p) {
		_this.registerObjects_BWD(ruleresult, feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer,
				ne2ne, p2p);

	}

	public static final PerformRuleResult pattern_InnerDeclaration2InnerClassifier_InEnum_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerDeclaration2InnerClassifier_InEnum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_bindingAndBlackFFB(
			InnerDeclaration2InnerClassifier_InEnum _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerDeclaration2InnerClassifier_InEnum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_2_corematch_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uPackage");
		EObject _localVariable_2 = match.getObject("uContainer");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUPackage = _localVariable_1;
		EObject tmpUContainer = _localVariable_2;
		if (tmpFeature instanceof Classifier) {
			Classifier feature = (Classifier) tmpFeature;
			if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
				if (tmpUContainer instanceof Enumeration) {
					Enumeration uContainer = (Enumeration) tmpUContainer;
					return new Object[] { feature, uPackage, uContainer, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InEnum_12_2_corematch_blackBFFBFBFFFB(
			Classifier feature, org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(uPackage, JavaPackage2UmlPackage.class, "target")) {
				org.eclipse.modisco.java.Package jPackage = p2p.getSource();
				if (jPackage != null) {
					for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(uContainer, ASTNode2Element.class, "target")) {
						ASTNode tmpJContainer = ne2ne.getSource();
						if (tmpJContainer instanceof EnumDeclaration) {
							EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
							for (ASTNode2Element b2e : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(feature, ASTNode2Element.class, "target")) {
								if (!b2e.equals(ne2ne)) {
									ASTNode tmpBodyDeclaration = b2e.getSource();
									if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
										AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
										if (!bodyDeclaration.equals(jContainer)) {
											_result.add(new Object[] { feature, b2e, jPackage, uPackage,
													bodyDeclaration, uContainer, jContainer, ne2ne, p2p, match });
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

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InEnum_12_3_findcontext_blackBBBBBBBBB(
			Classifier feature, ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage,
			org.eclipse.uml2.uml.Package uPackage, AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			if (!b2e.equals(ne2ne)) {
				if (!bodyDeclaration.equals(jContainer)) {
					if (jPackage.equals(p2p.getSource())) {
						if (jContainer.equals(ne2ne.getSource())) {
							if (uPackage.equals(p2p.getTarget())) {
								if (uPackage.equals(feature.getPackage())) {
									if (uPackage.equals(uContainer.getPackage())) {
										if (jPackage.getOwnedElements().contains(jContainer)) {
											if (bodyDeclaration.equals(b2e.getSource())) {
												if (uContainer.equals(ne2ne.getTarget())) {
													if (feature.equals(b2e.getTarget())) {
														_result.add(new Object[] { feature, b2e, jPackage, uPackage,
																bodyDeclaration, uContainer, jContainer, ne2ne, p2p });
													}
												}
											}
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_3_findcontext_greenBBBBBBBBBFFFFFFFFFFFFF(
			Classifier feature, ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage,
			org.eclipse.uml2.uml.Package uPackage, AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge p2p__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__uPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__feature____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__uPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__uContainer____ownedType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__jContainer____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__jPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String p2p__jPackage____source_name_prime = "source";
		String ne2ne__jContainer____source_name_prime = "source";
		String p2p__uPackage____target_name_prime = "target";
		String feature__uPackage____package_name_prime = "package";
		String uPackage__feature____ownedType_name_prime = "ownedType";
		String uContainer__uPackage____package_name_prime = "package";
		String uPackage__uContainer____ownedType_name_prime = "ownedType";
		String jPackage__jContainer____ownedElements_name_prime = "ownedElements";
		String jContainer__jPackage____package_name_prime = "package";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String ne2ne__uContainer____target_name_prime = "target";
		String b2e__feature____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(b2e);
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(uPackage);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(p2p);
		p2p__jPackage____source.setSrc(p2p);
		p2p__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(p2p__jPackage____source);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		p2p__uPackage____target.setSrc(p2p);
		p2p__uPackage____target.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(p2p__uPackage____target);
		feature__uPackage____package.setSrc(feature);
		feature__uPackage____package.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(feature__uPackage____package);
		uPackage__feature____ownedType.setSrc(uPackage);
		uPackage__feature____ownedType.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uPackage__feature____ownedType);
		uContainer__uPackage____package.setSrc(uContainer);
		uContainer__uPackage____package.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(uContainer__uPackage____package);
		uPackage__uContainer____ownedType.setSrc(uPackage);
		uPackage__uContainer____ownedType.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(uPackage__uContainer____ownedType);
		jPackage__jContainer____ownedElements.setSrc(jPackage);
		jPackage__jContainer____ownedElements.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(jPackage__jContainer____ownedElements);
		jContainer__jPackage____package.setSrc(jContainer);
		jContainer__jPackage____package.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jContainer__jPackage____package);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(b2e__bodyDeclaration____source);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(b2e__feature____target);
		p2p__jPackage____source.setName(p2p__jPackage____source_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		p2p__uPackage____target.setName(p2p__uPackage____target_name_prime);
		feature__uPackage____package.setName(feature__uPackage____package_name_prime);
		uPackage__feature____ownedType.setName(uPackage__feature____ownedType_name_prime);
		uContainer__uPackage____package.setName(uContainer__uPackage____package_name_prime);
		uPackage__uContainer____ownedType.setName(uPackage__uContainer____ownedType_name_prime);
		jPackage__jContainer____ownedElements.setName(jPackage__jContainer____ownedElements_name_prime);
		jContainer__jPackage____package.setName(jContainer__jPackage____package_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ne2ne, p2p,
				isApplicableMatch, p2p__jPackage____source, ne2ne__jContainer____source, p2p__uPackage____target,
				feature__uPackage____package, uPackage__feature____ownedType, uContainer__uPackage____package,
				uPackage__uContainer____ownedType, jPackage__jContainer____ownedElements,
				jContainer__jPackage____package, b2e__bodyDeclaration____source, ne2ne__uContainer____target,
				b2e__feature____target };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_bindingFBBBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, IsApplicableMatch isApplicableMatch, Classifier feature,
			ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, b2e, jPackage, uPackage,
				bodyDeclaration, uContainer, jContainer, ne2ne, p2p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration,
					uContainer, jContainer, ne2ne, p2p };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, IsApplicableMatch isApplicableMatch, Classifier feature,
			ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer,
				ne2ne, p2p);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_black = pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration,
						uContainer, jContainer, ne2ne, p2p };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_12_5_checkCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InEnum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerDeclaration2InnerClassifier_InEnum_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerDeclaration2InnerClassifier_InEnum _this) {
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerDeclaration2InnerClassifier_InEnum _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InEnum_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_package) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpFeature = _edge_package.getSrc();
		if (tmpFeature instanceof Classifier) {
			Classifier feature = (Classifier) tmpFeature;
			EObject tmpUPackage = _edge_package.getTrg();
			if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
				if (uPackage.equals(feature.getPackage())) {
					for (Type tmpUContainer : uPackage.getOwnedTypes()) {
						if (tmpUContainer instanceof Enumeration) {
							Enumeration uContainer = (Enumeration) tmpUContainer;
							if (!feature.equals(uContainer)) {
								_result.add(new Object[] { feature, uPackage, uContainer, _edge_package });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uPackage, uContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerDeclaration2InnerClassifier_InEnum_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerDeclaration2InnerClassifier_InEnum _this) {
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerDeclaration2InnerClassifier_InEnum _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InEnum_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJContainer = _edge_bodyDeclarations.getSrc();
		if (tmpJContainer instanceof EnumDeclaration) {
			EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
			EObject tmpBodyDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
				if (!bodyDeclaration.equals(jContainer)) {
					if (jContainer.getBodyDeclarations().contains(bodyDeclaration)) {
						org.eclipse.modisco.java.Package jPackage = jContainer.getPackage();
						if (jPackage != null) {
							_result.add(new Object[] { jPackage, bodyDeclaration, jContainer, _edge_bodyDeclarations });
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match, org.eclipse.modisco.java.Package jPackage,
			AbstractTypeDeclaration bodyDeclaration, EnumDeclaration jContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jPackage, bodyDeclaration, jContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerDeclaration2InnerClassifier_InEnum_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_1_prepare_blackB(
			InnerDeclaration2InnerClassifier_InEnum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("jPackage");
		EObject _localVariable_2 = targetMatch.getObject("uPackage");
		EObject _localVariable_3 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_4 = targetMatch.getObject("uContainer");
		EObject _localVariable_5 = sourceMatch.getObject("jContainer");
		EObject tmpFeature = _localVariable_0;
		EObject tmpJPackage = _localVariable_1;
		EObject tmpUPackage = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		EObject tmpUContainer = _localVariable_4;
		EObject tmpJContainer = _localVariable_5;
		if (tmpFeature instanceof Classifier) {
			Classifier feature = (Classifier) tmpFeature;
			if (tmpJPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) tmpJPackage;
				if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
					org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
					if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
						if (tmpUContainer instanceof Enumeration) {
							Enumeration uContainer = (Enumeration) tmpUContainer;
							if (tmpJContainer instanceof EnumDeclaration) {
								EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
								return new Object[] { feature, jPackage, uPackage, bodyDeclaration, uContainer,
										jContainer, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_blackBBBBBBBB(
			Classifier feature, org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			Match sourceMatch, Match targetMatch) {
		if (!feature.equals(uContainer)) {
			if (!bodyDeclaration.equals(jContainer)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { feature, jPackage, uPackage, bodyDeclaration, uContainer, jContainer,
							sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_binding != null) {
			Classifier feature = (Classifier) result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.modisco.java.Package jPackage = (org.eclipse.modisco.java.Package) result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_binding[3];
			Enumeration uContainer = (Enumeration) result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_binding[4];
			EnumDeclaration jContainer = (EnumDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_black = pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_blackBBBBBBBB(
					feature, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, sourceMatch, targetMatch);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_bindingFBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Classifier feature,
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(feature, jPackage, uPackage, bodyDeclaration, uContainer,
				jContainer, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, feature, jPackage, uPackage, bodyDeclaration, uContainer, jContainer,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, Classifier feature,
			org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, feature, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, sourceMatch, targetMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_black = pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, jPackage, uPackage, bodyDeclaration, uContainer, jContainer,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InEnum_24_5_matchcorrcontext_blackBFBBBBBFFBB(
			Classifier feature, org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			if (!bodyDeclaration.equals(jContainer)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jPackage, JavaPackage2UmlPackage.class, "source")) {
						if (uPackage.equals(p2p.getTarget())) {
							for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(jContainer, ASTNode2Element.class, "source")) {
								if (uContainer.equals(ne2ne.getTarget())) {
									for (ASTNode2Element b2e : org.moflon.core.utilities.eMoflonEMFUtil
											.getOppositeReferenceTyped(bodyDeclaration, ASTNode2Element.class,
													"source")) {
										if (!b2e.equals(ne2ne)) {
											if (feature.equals(b2e.getTarget())) {
												_result.add(new Object[] { feature, b2e, jPackage, uPackage,
														bodyDeclaration, uContainer, jContainer, ne2ne, p2p,
														sourceMatch, targetMatch });
											}
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_5_matchcorrcontext_greenBBBBBF(
			ASTNode2Element b2e, ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InEnum";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(b2e);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.getAllContextElements().add(p2p);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { b2e, ne2ne, p2p, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_6_createcorrespondence_blackBBBBBBB(
			Classifier feature, org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			CCMatch ccMatch) {
		if (!feature.equals(uContainer)) {
			if (!bodyDeclaration.equals(jContainer)) {
				return new Object[] { feature, jPackage, uPackage, bodyDeclaration, uContainer, jContainer, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InEnum";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerDeclaration2InnerClassifier_InEnum_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_27_1_matchtggpattern_blackBBB(
			org.eclipse.modisco.java.Package jPackage, AbstractTypeDeclaration bodyDeclaration,
			EnumDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			if (jPackage.getOwnedElements().contains(jContainer)) {
				if (jContainer.getBodyDeclarations().contains(bodyDeclaration)) {
					return new Object[] { jPackage, bodyDeclaration, jContainer };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_28_1_matchtggpattern_blackBBB(
			Classifier feature, org.eclipse.uml2.uml.Package uPackage, Enumeration uContainer) {
		if (!feature.equals(uContainer)) {
			if (uPackage.equals(feature.getPackage())) {
				if (uPackage.equals(uContainer.getPackage())) {
					return new Object[] { feature, uPackage, uContainer };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_1_createresult_blackB(
			InnerDeclaration2InnerClassifier_InEnum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Classifier feature) {
		if (ruleResult.getTargetObjects().contains(feature)) {
			return new Object[] { ruleResult, feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element b2e) {
		if (ruleResult.getCorrObjects().contains(b2e)) {
			return new Object[] { ruleResult, b2e };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration bodyDeclaration) {
		if (ruleResult.getSourceObjects().contains(bodyDeclaration)) {
			return new Object[] { ruleResult, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package jPackage) {
		if (ruleResult.getSourceObjects().contains(jPackage)) {
			return new Object[] { ruleResult, jPackage };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, EnumDeclaration jContainer) {
		if (ruleResult.getSourceObjects().contains(jContainer)) {
			return new Object[] { ruleResult, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Enumeration uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Package uPackage) {
		if (ruleResult.getTargetObjects().contains(uPackage)) {
			return new Object[] { ruleResult, uPackage };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, JavaPackage2UmlPackage p2p) {
		if (ruleResult.getCorrObjects().contains(p2p)) {
			return new Object[] { ruleResult, p2p };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_blackFFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList b2eList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList ne2neList : ruleEntryContainer.getRuleEntryList()) {
				if (!b2eList.equals(ne2neList)) {
					for (EObject tmpB2e : b2eList.getEntryObjects()) {
						if (tmpB2e instanceof ASTNode2Element) {
							ASTNode2Element b2e = (ASTNode2Element) tmpB2e;
							Element tmpFeature = b2e.getTarget();
							if (tmpFeature instanceof Classifier) {
								Classifier feature = (Classifier) tmpFeature;
								ASTNode tmpBodyDeclaration = b2e.getSource();
								if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
									AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
									if (pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, b2e) == null) {
										if (pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, feature) == null) {
											if (pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, bodyDeclaration) == null) {
												for (EObject tmpNe2ne : ne2neList.getEntryObjects()) {
													if (tmpNe2ne instanceof ASTNode2Element) {
														ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
														if (!b2e.equals(ne2ne)) {
															ASTNode tmpJContainer = ne2ne.getSource();
															if (tmpJContainer instanceof EnumDeclaration) {
																EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
																if (!bodyDeclaration.equals(jContainer)) {
																	Element tmpUContainer = ne2ne.getTarget();
																	if (tmpUContainer instanceof Enumeration) {
																		Enumeration uContainer = (Enumeration) tmpUContainer;
																		if (!feature.equals(uContainer)) {
																			org.eclipse.modisco.java.Package jPackage = jContainer
																					.getPackage();
																			if (jPackage != null) {
																				org.eclipse.uml2.uml.Package uPackage = uContainer
																						.getPackage();
																				if (uPackage != null) {
																					if (pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							ne2ne) == null) {
																						if (pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_4BB(
																								ruleResult,
																								jContainer) == null) {
																							if (pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_6BB(
																									ruleResult,
																									uContainer) == null) {
																								if (pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_3BB(
																										ruleResult,
																										jPackage) == null) {
																									if (pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_7BB(
																											ruleResult,
																											uPackage) == null) {
																										for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
																												.getOppositeReferenceTyped(
																														jPackage,
																														JavaPackage2UmlPackage.class,
																														"source")) {
																											if (uPackage
																													.equals(p2p
																															.getTarget())) {
																												if (pattern_InnerDeclaration2InnerClassifier_InEnum_29_2_isapplicablecore_black_nac_8BB(
																														ruleResult,
																														p2p) == null) {
																													_result.add(
																															new Object[] {
																																	b2eList,
																																	feature,
																																	b2e,
																																	bodyDeclaration,
																																	ne2neList,
																																	jPackage,
																																	jContainer,
																																	ne2ne,
																																	uContainer,
																																	uPackage,
																																	p2p,
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
								}

							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, IsApplicableMatch isApplicableMatch, Classifier feature,
			ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, feature, b2e, jPackage, uPackage,
				bodyDeclaration, uContainer, jContainer, ne2ne, p2p, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration,
					uContainer, jContainer, ne2ne, p2p, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InEnum _this, IsApplicableMatch isApplicableMatch, Classifier feature,
			ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage, org.eclipse.uml2.uml.Package uPackage,
			AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer,
				ne2ne, p2p, ruleResult);
		if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_black = pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InEnum_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, b2e, jPackage, uPackage, bodyDeclaration,
						uContainer, jContainer, ne2ne, p2p, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InEnum_29_4_checkCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_5_checknacs_blackBBBBBBBBB(
			Classifier feature, ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage,
			org.eclipse.uml2.uml.Package uPackage, AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p) {
		if (!feature.equals(uContainer)) {
			if (!b2e.equals(ne2ne)) {
				if (!bodyDeclaration.equals(jContainer)) {
					return new Object[] { feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer,
							ne2ne, p2p };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_6_perform_blackBBBBBBBBBB(
			Classifier feature, ASTNode2Element b2e, org.eclipse.modisco.java.Package jPackage,
			org.eclipse.uml2.uml.Package uPackage, AbstractTypeDeclaration bodyDeclaration, Enumeration uContainer,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, JavaPackage2UmlPackage p2p,
			ModelgeneratorRuleResult ruleResult) {
		if (!feature.equals(uContainer)) {
			if (!b2e.equals(ne2ne)) {
				if (!bodyDeclaration.equals(jContainer)) {
					return new Object[] { feature, b2e, jPackage, uPackage, bodyDeclaration, uContainer, jContainer,
							ne2ne, p2p, ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InEnum_29_6_perform_greenBBBBB(
			Classifier feature, org.eclipse.uml2.uml.Package uPackage, AbstractTypeDeclaration bodyDeclaration,
			EnumDeclaration jContainer, ModelgeneratorRuleResult ruleResult) {
		feature.setPackage(uPackage);
		jContainer.getBodyDeclarations().add(bodyDeclaration);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { feature, uPackage, bodyDeclaration, jContainer, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_InnerDeclaration2InnerClassifier_InEnum_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InnerDeclaration2InnerClassifier_InEnumImpl
