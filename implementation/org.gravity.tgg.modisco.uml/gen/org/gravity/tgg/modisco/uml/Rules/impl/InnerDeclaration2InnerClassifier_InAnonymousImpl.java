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
import org.eclipse.modisco.java.AnonymousClassDeclaration;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InAnonymous;
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
 * An implementation of the model object '<em><b>Inner Declaration2 Inner Classifier In Anonymous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InnerDeclaration2InnerClassifier_InAnonymousImpl extends AbstractRuleImpl
		implements InnerDeclaration2InnerClassifier_InAnonymous {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerDeclaration2InnerClassifier_InAnonymousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInnerDeclaration2InnerClassifier_InAnonymous();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer) {

		Object[] result1_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_1_initialbindings_blackBBBB(this, match,
						bodyDeclaration, jContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = "
					+ jContainer + ".");
		}

		Object[] result2_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
						bodyDeclaration, jContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = "
					+ jContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_4_collectelementstobetranslated_blackBBB(
							match, bodyDeclaration, jContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = " + jContainer + ".");
			}
			InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_4_collectelementstobetranslated_greenBBBFF(
							match, bodyDeclaration, jContainer);
			//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__jContainer____anonymousClassDeclarationOwner = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_5_collectcontextelements_blackBBB(match,
							bodyDeclaration, jContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = " + jContainer + ".");
			}
			InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_5_collectcontextelements_greenBBB(match,
							bodyDeclaration, jContainer);

			// 
			InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_6_registerobjectstomatch_expressionBBBB(
							this, match, bodyDeclaration, jContainer);
			return InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_7_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result1_bindingAndBlack[0];
		AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result1_bindingAndBlack[1];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[2];
		ASTNode2Element b2e = (ASTNode2Element) result1_bindingAndBlack[3];
		Classifier feature = (Classifier) result1_bindingAndBlack[4];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_greenBB(feature,
						uContainer);

		Object[] result2_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
						bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = " + jContainer + ", "
					+ "[ne2ne] = " + ne2ne + ", " + "[b2e] = " + b2e + ", " + "[feature] = " + feature + ", "
					+ "[uContainer] = " + uContainer + ".");
		}
		InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
						bodyDeclaration, jContainer, feature, uContainer);
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge bodyDeclaration__jContainer____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[7];

		// 
		// 
		InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_5_registerobjects_expressionBBBBBBBB(this,
						ruleresult, bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
		return InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_binding[0];
		AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result2_binding[1];
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_2_corematch_blackBBFFFFB(bodyDeclaration,
						jContainer, match)) {
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[2];
			ASTNode2Element b2e = (ASTNode2Element) result2_black[3];
			Classifier feature = (Classifier) result2_black[4];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[5];
			// ForEach 
			for (Object[] result3_black : InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_3_findcontext_blackBBBBBB(bodyDeclaration,
							jContainer, ne2ne, b2e, feature, uContainer)) {
				Object[] result3_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_3_findcontext_greenBBBBBBFFFFFFF(
								bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge bodyDeclaration__jContainer____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne
							+ ", " + "[b2e] = " + b2e + ", " + "[feature] = " + feature + ", " + "[uContainer] = "
							+ uContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerDeclaration2InnerClassifier_InAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("jContainer", jContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element b2e, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("b2e", b2e);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("uContainer", uContainer);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject bodyDeclaration, EObject jContainer,
			EObject ne2ne, EObject b2e, EObject feature, EObject uContainer) {
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("uContainer", uContainer);

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
	public boolean isAppropriate_BWD(Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {

		Object[] result1_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_1_initialbindings_blackBBBB(this, match,
						feature, uContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
		}

		Object[] result2_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_bindingAndBlackFBBBB(this, match,
						feature, uContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_4_collectelementstobetranslated_blackBBB(
							match, feature, uContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
			}
			InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_4_collectelementstobetranslated_greenBBBF(
							match, feature, uContainer);
			//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_5_collectcontextelements_blackBBB(match,
							feature, uContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
			}
			InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_5_collectcontextelements_greenBBB(match,
							feature, uContainer);

			// 
			InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_6_registerobjectstomatch_expressionBBBB(
							this, match, feature, uContainer);
			return InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_7_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result1_bindingAndBlack[0];
		AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result1_bindingAndBlack[1];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[2];
		ASTNode2Element b2e = (ASTNode2Element) result1_bindingAndBlack[3];
		Classifier feature = (Classifier) result1_bindingAndBlack[4];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_greenBB(
						bodyDeclaration, jContainer);

		Object[] result2_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
						bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = " + jContainer + ", "
					+ "[ne2ne] = " + ne2ne + ", " + "[b2e] = " + b2e + ", " + "[feature] = " + feature + ", "
					+ "[uContainer] = " + uContainer + ".");
		}
		InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
						bodyDeclaration, jContainer, feature, uContainer);
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge bodyDeclaration__jContainer____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[7];

		// 
		// 
		InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_5_registerobjects_expressionBBBBBBBB(this,
						ruleresult, bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
		return InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Classifier feature = (Classifier) result2_binding[0];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_binding[1];
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_2_corematch_blackFFFFBBB(feature, uContainer,
						match)) {
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[0];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result2_black[1];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[2];
			ASTNode2Element b2e = (ASTNode2Element) result2_black[3];
			// ForEach 
			for (Object[] result3_black : InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_3_findcontext_blackBBBBBB(bodyDeclaration,
							jContainer, ne2ne, b2e, feature, uContainer)) {
				Object[] result3_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_3_findcontext_greenBBBBBBFFFFFF(
								bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne
							+ ", " + "[b2e] = " + b2e + ", " + "[feature] = " + feature + ", " + "[uContainer] = "
							+ uContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerDeclaration2InnerClassifier_InAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		match.registerObject("feature", feature);
		match.registerObject("uContainer", uContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element b2e, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("b2e", b2e);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("uContainer", uContainer);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject bodyDeclaration, EObject jContainer,
			EObject ne2ne, EObject b2e, EObject feature, EObject uContainer) {
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("uContainer", uContainer);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1042(EMoflonEdge _edge_nestedClassifier) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_2_testcorematchandDECs_blackFFB(
						_edge_nestedClassifier)) {
			Classifier feature = (Classifier) result2_black[0];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[1];
			Object[] result2_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, uContainer)) {
				// 
				if (InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerDeclaration2InnerClassifier_InAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1141(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_2_testcorematchandDECs_blackFFB(
						_edge_bodyDeclarations)) {
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[0];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result2_black[1];
			Object[] result2_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, bodyDeclaration, jContainer)) {
				// 
				if (InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerDeclaration2InnerClassifier_InAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InnerDeclaration2InnerClassifier_InAnonymous");
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
		ruleResult.setRule("InnerDeclaration2InnerClassifier_InAnonymous");
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

		Object[] result1_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_bindingAndBlack[0];
		AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result2_bindingAndBlack[1];
		Classifier feature = (Classifier) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBB(this,
						bodyDeclaration, jContainer, feature, uContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = " + jContainer + ", "
					+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_5_matchcorrcontext_blackBBFFBBBB(
							bodyDeclaration, jContainer, feature, uContainer, sourceMatch, targetMatch)) {
				ASTNode2Element ne2ne = (ASTNode2Element) result5_black[2];
				ASTNode2Element b2e = (ASTNode2Element) result5_black[3];
				Object[] result5_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_5_matchcorrcontext_greenBBBBF(ne2ne,
								b2e, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_6_createcorrespondence_blackBBBBB(
								bodyDeclaration, jContainer, feature, uContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[jContainer] = " + jContainer + ", " + "[feature] = " + feature
							+ ", " + "[uContainer] = " + uContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_7_addtoreturnedresult_blackBB(result,
								ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_7_addtoreturnedresult_greenBB(result,
								ccMatch);

			}

		} else {
		}
		return InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer,
			Classifier feature, org.eclipse.uml2.uml.Class uContainer, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer) {// 
		Object[] result1_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_27_1_matchtggpattern_blackBB(bodyDeclaration,
						jContainer);
		if (result1_black != null) {
			return InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_27_2_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Classifier feature, org.eclipse.uml2.uml.Class uContainer) {// 
		Object[] result1_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_28_1_matchtggpattern_blackBB(feature, uContainer);
		if (result1_black != null) {
			return InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_28_2_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element b2eParameter,
			ASTNode2Element ne2neParameter) {

		Object[] result1_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_blackFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList b2eList = (RuleEntryList) result2_black[0];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[1];
			ASTNode2Element b2e = (ASTNode2Element) result2_black[2];
			Classifier feature = (Classifier) result2_black[3];
			//nothing RuleEntryList ne2neList = (RuleEntryList) result2_black[4];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result2_black[5];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[6];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[7];

			Object[] result3_bindingAndBlack = InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = " + bodyDeclaration
						+ ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ", " + "[b2e] = " + b2e
						+ ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InnerDeclaration2InnerClassifier_InAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_5_checknacs_blackBBBBBB(
								bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
				if (result5_black != null) {

					Object[] result6_black = InnerDeclaration2InnerClassifier_InAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_6_perform_blackBBBBBBB(
									bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[bodyDeclaration] = "
								+ bodyDeclaration + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne
								+ ", " + "[b2e] = " + b2e + ", " + "[feature] = " + feature + ", " + "[uContainer] = "
								+ uContainer + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					InnerDeclaration2InnerClassifier_InAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_6_perform_greenBBBBB(
									bodyDeclaration, jContainer, feature, uContainer, ruleResult);

				} else {
				}

			} else {
			}

		}
		return InnerDeclaration2InnerClassifier_InAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element b2e, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("b2e", b2e);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("uContainer", uContainer);
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
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPROPRIATE_FWD__MATCH_ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION:
				return isAppropriate_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
						(AnonymousClassDeclaration) arguments.get(2));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
						(AnonymousClassDeclaration) arguments.get(2));
				return null;
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1),
						(AnonymousClassDeclaration) arguments.get(2));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT_ASTNODE2ELEMENT_CLASSIFIER_CLASS:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(AbstractTypeDeclaration) arguments.get(1), (AnonymousClassDeclaration) arguments.get(2),
						(ASTNode2Element) arguments.get(3), (ASTNode2Element) arguments.get(4),
						(Classifier) arguments.get(5), (org.eclipse.uml2.uml.Class) arguments.get(6));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPROPRIATE_BWD__MATCH_CLASSIFIER_CLASS:
				return isAppropriate_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
						(org.eclipse.uml2.uml.Class) arguments.get(2));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASSIFIER_CLASS:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
						(org.eclipse.uml2.uml.Class) arguments.get(2));
				return null;
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASSIFIER_CLASS:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
						(org.eclipse.uml2.uml.Class) arguments.get(2));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT_ASTNODE2ELEMENT_CLASSIFIER_CLASS:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(AbstractTypeDeclaration) arguments.get(1), (AnonymousClassDeclaration) arguments.get(2),
						(ASTNode2Element) arguments.get(3), (ASTNode2Element) arguments.get(4),
						(Classifier) arguments.get(5), (org.eclipse.uml2.uml.Class) arguments.get(6));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1042__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_1042((EMoflonEdge) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1141__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1141((EMoflonEdge) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_CC__ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION_CLASSIFIER_CLASS_MATCH_MATCH:
				return isApplicable_solveCsp_CC((AbstractTypeDeclaration) arguments.get(0),
						(AnonymousClassDeclaration) arguments.get(1), (Classifier) arguments.get(2),
						(org.eclipse.uml2.uml.Class) arguments.get(3), (Match) arguments.get(4),
						(Match) arguments.get(5));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___CHECK_DEC_FWD__ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION:
				return checkDEC_FWD((AbstractTypeDeclaration) arguments.get(0),
						(AnonymousClassDeclaration) arguments.get(1));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___CHECK_DEC_BWD__CLASSIFIER_CLASS:
				return checkDEC_BWD((Classifier) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
				return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
						(ASTNode2Element) arguments.get(2));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ABSTRACTTYPEDECLARATION_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT_ASTNODE2ELEMENT_CLASSIFIER_CLASS_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(AbstractTypeDeclaration) arguments.get(1), (AnonymousClassDeclaration) arguments.get(2),
						(ASTNode2Element) arguments.get(3), (ASTNode2Element) arguments.get(4),
						(Classifier) arguments.get(5), (org.eclipse.uml2.uml.Class) arguments.get(6),
						(ModelgeneratorRuleResult) arguments.get(7));
			case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_ANONYMOUS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_1_initialbindings_blackBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer) {
		return new Object[] { _this, match, bodyDeclaration, jContainer };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_bindingFBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, jContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_bindingAndBlackFBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, jContainer);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, jContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_3_CheckCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_4_collectelementstobetranslated_blackBBB(
			Match match, AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer) {
		return new Object[] { match, bodyDeclaration, jContainer };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer) {
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner.setTrg(jContainer);
		match.getToBeTranslatedEdges().add(bodyDeclaration__jContainer____anonymousClassDeclarationOwner);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__jContainer____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { match, bodyDeclaration, jContainer, jContainer__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jContainer____anonymousClassDeclarationOwner };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_5_collectcontextelements_blackBBB(
			Match match, AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer) {
		return new Object[] { match, bodyDeclaration, jContainer };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_5_collectcontextelements_greenBBB(
			Match match, AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer) {
		match.getContextNodes().add(bodyDeclaration);
		match.getContextNodes().add(jContainer);
		return new Object[] { match, bodyDeclaration, jContainer };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_6_registerobjectstomatch_expressionBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, jContainer);

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_2 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_3 = isApplicableMatch.getObject("b2e");
		EObject _localVariable_4 = isApplicableMatch.getObject("feature");
		EObject _localVariable_5 = isApplicableMatch.getObject("uContainer");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpJContainer = _localVariable_1;
		EObject tmpNe2ne = _localVariable_2;
		EObject tmpB2e = _localVariable_3;
		EObject tmpFeature = _localVariable_4;
		EObject tmpUContainer = _localVariable_5;
		if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
			if (tmpJContainer instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
				if (tmpNe2ne instanceof ASTNode2Element) {
					ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
					if (tmpB2e instanceof ASTNode2Element) {
						ASTNode2Element b2e = (ASTNode2Element) tmpB2e;
						if (tmpFeature instanceof Classifier) {
							Classifier feature = (Classifier) tmpFeature;
							if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
								org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
								return new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_blackBBBBBBFBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer,
			InnerDeclaration2InnerClassifier_InAnonymous _this, IsApplicableMatch isApplicableMatch) {
		if (!b2e.equals(ne2ne)) {
			if (!feature.equals(uContainer)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, csp, _this,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_binding != null) {
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_binding[0];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_binding[1];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_binding[2];
			ASTNode2Element b2e = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_binding[3];
			Classifier feature = (Classifier) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_binding[4];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_binding[5];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_blackBBBBBBFBB(
					bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, _this, isApplicableMatch);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_black[6];

				return new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_1_performtransformation_greenBB(
			Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		uContainer.getNestedClassifiers().add(feature);
		return new Object[] { feature, uContainer };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject jContainer, EObject ne2ne, EObject b2e,
			EObject feature, EObject uContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			if (!bodyDeclaration.equals(ne2ne)) {
				if (!bodyDeclaration.equals(feature)) {
					if (!bodyDeclaration.equals(uContainer)) {
						if (!jContainer.equals(ne2ne)) {
							if (!jContainer.equals(uContainer)) {
								if (!ne2ne.equals(uContainer)) {
									if (!b2e.equals(bodyDeclaration)) {
										if (!b2e.equals(jContainer)) {
											if (!b2e.equals(ne2ne)) {
												if (!b2e.equals(feature)) {
													if (!b2e.equals(uContainer)) {
														if (!feature.equals(jContainer)) {
															if (!feature.equals(ne2ne)) {
																if (!feature.equals(uContainer)) {
																	return new Object[] { ruleresult, bodyDeclaration,
																			jContainer, ne2ne, b2e, feature,
																			uContainer };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject jContainer, EObject feature,
			EObject uContainer) {
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerDeclaration2InnerClassifier_InAnonymous";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getCreatedEdges().add(uContainer__feature____nestedClassifier);
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner.setTrg(jContainer);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__jContainer____anonymousClassDeclarationOwner);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__jContainer____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { ruleresult, bodyDeclaration, jContainer, feature, uContainer,
				uContainer__feature____nestedClassifier, jContainer__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jContainer____anonymousClassDeclarationOwner };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_5_registerobjects_expressionBBBBBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, PerformRuleResult ruleresult, EObject bodyDeclaration,
			EObject jContainer, EObject ne2ne, EObject b2e, EObject feature, EObject uContainer) {
		_this.registerObjects_FWD(ruleresult, bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);

	}

	public static final PerformRuleResult pattern_InnerDeclaration2InnerClassifier_InAnonymous_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerDeclaration2InnerClassifier_InAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(
			InnerDeclaration2InnerClassifier_InAnonymous _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerDeclaration2InnerClassifier_InAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_2_corematch_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("jContainer");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpJContainer = _localVariable_1;
		if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
			if (tmpJContainer instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
				return new Object[] { bodyDeclaration, jContainer, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_2_corematch_blackBBFFFFB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element b2e : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(bodyDeclaration,
				ASTNode2Element.class, "source")) {
			Element tmpFeature = b2e.getTarget();
			if (tmpFeature instanceof Classifier) {
				Classifier feature = (Classifier) tmpFeature;
				for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jContainer, ASTNode2Element.class, "source")) {
					if (!b2e.equals(ne2ne)) {
						Element tmpUContainer = ne2ne.getTarget();
						if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
							if (!feature.equals(uContainer)) {
								_result.add(new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer,
										match });
							}
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_3_findcontext_blackBBBBBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b2e.equals(ne2ne)) {
			if (!feature.equals(uContainer)) {
				if (feature.equals(b2e.getTarget())) {
					if (uContainer.equals(ne2ne.getTarget())) {
						if (bodyDeclaration.equals(b2e.getSource())) {
							if (jContainer.equals(ne2ne.getSource())) {
								if (jContainer.getBodyDeclarations().contains(bodyDeclaration)) {
									_result.add(new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature,
											uContainer });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_3_findcontext_greenBBBBBBFFFFFFF(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String b2e__feature____target_name_prime = "target";
		String ne2ne__uContainer____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String ne2ne__jContainer____source_name_prime = "source";
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(b2e);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(uContainer);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(b2e__feature____target);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(b2e__bodyDeclaration____source);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__jContainer____anonymousClassDeclarationOwner);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__jContainer____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, isApplicableMatch,
				b2e__feature____target, ne2ne__uContainer____target, b2e__bodyDeclaration____source,
				ne2ne__jContainer____source, jContainer__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jContainer____anonymousClassDeclarationOwner };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_bindingFBBBBBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration, jContainer, ne2ne,
				b2e, feature, uContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature,
					uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature,
						uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_5_checkCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerDeclaration2InnerClassifier_InAnonymous_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_1_initialbindings_blackBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { _this, match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_bindingFBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_bindingAndBlackFBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, uContainer);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_3_CheckCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_4_collectelementstobetranslated_blackBBB(
			Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		match.getToBeTranslatedEdges().add(uContainer__feature____nestedClassifier);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		return new Object[] { match, feature, uContainer, uContainer__feature____nestedClassifier };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_5_collectcontextelements_blackBBB(
			Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_5_collectcontextelements_greenBBB(
			Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		match.getContextNodes().add(feature);
		match.getContextNodes().add(uContainer);
		return new Object[] { match, feature, uContainer };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_6_registerobjectstomatch_expressionBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {
		_this.registerObjectsToMatch_BWD(match, feature, uContainer);

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_2 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_3 = isApplicableMatch.getObject("b2e");
		EObject _localVariable_4 = isApplicableMatch.getObject("feature");
		EObject _localVariable_5 = isApplicableMatch.getObject("uContainer");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpJContainer = _localVariable_1;
		EObject tmpNe2ne = _localVariable_2;
		EObject tmpB2e = _localVariable_3;
		EObject tmpFeature = _localVariable_4;
		EObject tmpUContainer = _localVariable_5;
		if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
			if (tmpJContainer instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
				if (tmpNe2ne instanceof ASTNode2Element) {
					ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
					if (tmpB2e instanceof ASTNode2Element) {
						ASTNode2Element b2e = (ASTNode2Element) tmpB2e;
						if (tmpFeature instanceof Classifier) {
							Classifier feature = (Classifier) tmpFeature;
							if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
								org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
								return new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_blackBBBBBBFBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer,
			InnerDeclaration2InnerClassifier_InAnonymous _this, IsApplicableMatch isApplicableMatch) {
		if (!b2e.equals(ne2ne)) {
			if (!feature.equals(uContainer)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, csp, _this,
								isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_binding != null) {
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_binding[0];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_binding[1];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_binding[2];
			ASTNode2Element b2e = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_binding[3];
			Classifier feature = (Classifier) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_binding[4];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_binding[5];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_blackBBBBBBFBB(
					bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, _this, isApplicableMatch);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_black[6];

				return new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_1_performtransformation_greenBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer) {
		jContainer.getBodyDeclarations().add(bodyDeclaration);
		return new Object[] { bodyDeclaration, jContainer };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject jContainer, EObject ne2ne, EObject b2e,
			EObject feature, EObject uContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			if (!bodyDeclaration.equals(ne2ne)) {
				if (!bodyDeclaration.equals(feature)) {
					if (!bodyDeclaration.equals(uContainer)) {
						if (!jContainer.equals(ne2ne)) {
							if (!jContainer.equals(uContainer)) {
								if (!ne2ne.equals(uContainer)) {
									if (!b2e.equals(bodyDeclaration)) {
										if (!b2e.equals(jContainer)) {
											if (!b2e.equals(ne2ne)) {
												if (!b2e.equals(feature)) {
													if (!b2e.equals(uContainer)) {
														if (!feature.equals(jContainer)) {
															if (!feature.equals(ne2ne)) {
																if (!feature.equals(uContainer)) {
																	return new Object[] { ruleresult, bodyDeclaration,
																			jContainer, ne2ne, b2e, feature,
																			uContainer };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject bodyDeclaration, EObject jContainer, EObject feature,
			EObject uContainer) {
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerDeclaration2InnerClassifier_InAnonymous";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uContainer__feature____nestedClassifier);
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner.setTrg(jContainer);
		ruleresult.getCreatedEdges().add(bodyDeclaration__jContainer____anonymousClassDeclarationOwner);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__jContainer____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { ruleresult, bodyDeclaration, jContainer, feature, uContainer,
				uContainer__feature____nestedClassifier, jContainer__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jContainer____anonymousClassDeclarationOwner };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_5_registerobjects_expressionBBBBBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, PerformRuleResult ruleresult, EObject bodyDeclaration,
			EObject jContainer, EObject ne2ne, EObject b2e, EObject feature, EObject uContainer) {
		_this.registerObjects_BWD(ruleresult, bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);

	}

	public static final PerformRuleResult pattern_InnerDeclaration2InnerClassifier_InAnonymous_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerDeclaration2InnerClassifier_InAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(
			InnerDeclaration2InnerClassifier_InAnonymous _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerDeclaration2InnerClassifier_InAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_2_corematch_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uContainer");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		if (tmpFeature instanceof Classifier) {
			Classifier feature = (Classifier) tmpFeature;
			if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
				return new Object[] { feature, uContainer, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_2_corematch_blackFFFFBBB(
			Classifier feature, org.eclipse.uml2.uml.Class uContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			for (ASTNode2Element b2e : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(feature,
					ASTNode2Element.class, "target")) {
				ASTNode tmpBodyDeclaration = b2e.getSource();
				if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
					for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(uContainer, ASTNode2Element.class, "target")) {
						if (!b2e.equals(ne2ne)) {
							ASTNode tmpJContainer = ne2ne.getSource();
							if (tmpJContainer instanceof AnonymousClassDeclaration) {
								AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
								_result.add(new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer,
										match });
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_3_findcontext_blackBBBBBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!b2e.equals(ne2ne)) {
			if (!feature.equals(uContainer)) {
				if (feature.equals(b2e.getTarget())) {
					if (uContainer.getNestedClassifiers().contains(feature)) {
						if (uContainer.equals(ne2ne.getTarget())) {
							if (bodyDeclaration.equals(b2e.getSource())) {
								if (jContainer.equals(ne2ne.getSource())) {
									_result.add(new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature,
											uContainer });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_3_findcontext_greenBBBBBBFFFFFF(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String b2e__feature____target_name_prime = "target";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String ne2ne__uContainer____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String ne2ne__jContainer____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(b2e);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(uContainer);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(b2e__feature____target);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uContainer__feature____nestedClassifier);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(b2e__bodyDeclaration____source);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		return new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, isApplicableMatch,
				b2e__feature____target, uContainer__feature____nestedClassifier, ne2ne__uContainer____target,
				b2e__bodyDeclaration____source, ne2ne__jContainer____source };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_bindingFBBBBBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, bodyDeclaration, jContainer, ne2ne,
				b2e, feature, uContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature,
					uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature,
						uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_5_checkCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerDeclaration2InnerClassifier_InAnonymous_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerDeclaration2InnerClassifier_InAnonymous _this) {
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerDeclaration2InnerClassifier_InAnonymous _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_nestedClassifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUContainer = _edge_nestedClassifier.getSrc();
		if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
			EObject tmpFeature = _edge_nestedClassifier.getTrg();
			if (tmpFeature instanceof Classifier) {
				Classifier feature = (Classifier) tmpFeature;
				if (!feature.equals(uContainer)) {
					if (uContainer.getNestedClassifiers().contains(feature)) {
						_result.add(new Object[] { feature, uContainer, _edge_nestedClassifier });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerDeclaration2InnerClassifier_InAnonymous_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerDeclaration2InnerClassifier_InAnonymous _this) {
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerDeclaration2InnerClassifier_InAnonymous _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJContainer = _edge_bodyDeclarations.getSrc();
		if (tmpJContainer instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
			EObject tmpBodyDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
				if (jContainer.getBodyDeclarations().contains(bodyDeclaration)) {
					_result.add(new Object[] { bodyDeclaration, jContainer, _edge_bodyDeclarations });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, jContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerDeclaration2InnerClassifier_InAnonymous_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_1_prepare_blackB(
			InnerDeclaration2InnerClassifier_InAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = sourceMatch.getObject("jContainer");
		EObject _localVariable_2 = targetMatch.getObject("feature");
		EObject _localVariable_3 = targetMatch.getObject("uContainer");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpJContainer = _localVariable_1;
		EObject tmpFeature = _localVariable_2;
		EObject tmpUContainer = _localVariable_3;
		if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
			if (tmpJContainer instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
				if (tmpFeature instanceof Classifier) {
					Classifier feature = (Classifier) tmpFeature;
					if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
						return new Object[] { bodyDeclaration, jContainer, feature, uContainer, sourceMatch,
								targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_blackBBBBBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer, Match sourceMatch, Match targetMatch) {
		if (!feature.equals(uContainer)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { bodyDeclaration, jContainer, feature, uContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_binding != null) {
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_binding[0];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_binding[1];
			Classifier feature = (Classifier) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_blackBBBBBB(
					bodyDeclaration, jContainer, feature, uContainer, sourceMatch, targetMatch);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { bodyDeclaration, jContainer, feature, uContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_bindingFBBBBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer, Classifier feature, org.eclipse.uml2.uml.Class uContainer,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(bodyDeclaration, jContainer, feature, uContainer,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, bodyDeclaration, jContainer, feature, uContainer, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, AbstractTypeDeclaration bodyDeclaration,
			AnonymousClassDeclaration jContainer, Classifier feature, org.eclipse.uml2.uml.Class uContainer,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_bindingFBBBBBBB(
				_this, bodyDeclaration, jContainer, feature, uContainer, sourceMatch, targetMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, bodyDeclaration, jContainer, feature, uContainer, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_4_checkCSP_expressionFB(
			CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_5_matchcorrcontext_blackBBFFBBBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (ASTNode2Element b2e : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(feature,
						ASTNode2Element.class, "target")) {
					if (bodyDeclaration.equals(b2e.getSource())) {
						for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(uContainer, ASTNode2Element.class, "target")) {
							if (!b2e.equals(ne2ne)) {
								if (jContainer.equals(ne2ne.getSource())) {
									_result.add(new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature,
											uContainer, sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element ne2ne, ASTNode2Element b2e, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InAnonymous";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.getAllContextElements().add(b2e);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ne2ne, b2e, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_6_createcorrespondence_blackBBBBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer, CCMatch ccMatch) {
		if (!feature.equals(uContainer)) {
			return new Object[] { bodyDeclaration, jContainer, feature, uContainer, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InAnonymous";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerDeclaration2InnerClassifier_InAnonymous_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_27_1_matchtggpattern_blackBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer) {
		if (jContainer.getBodyDeclarations().contains(bodyDeclaration)) {
			return new Object[] { bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_28_1_matchtggpattern_blackBB(
			Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			if (uContainer.getNestedClassifiers().contains(feature)) {
				return new Object[] { feature, uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_1_createresult_blackB(
			InnerDeclaration2InnerClassifier_InAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration bodyDeclaration) {
		if (ruleResult.getSourceObjects().contains(bodyDeclaration)) {
			return new Object[] { ruleResult, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element b2e) {
		if (ruleResult.getCorrObjects().contains(b2e)) {
			return new Object[] { ruleResult, b2e };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Classifier feature) {
		if (ruleResult.getTargetObjects().contains(feature)) {
			return new Object[] { ruleResult, feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration jContainer) {
		if (ruleResult.getSourceObjects().contains(jContainer)) {
			return new Object[] { ruleResult, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList b2eList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList ne2neList : ruleEntryContainer.getRuleEntryList()) {
				if (!b2eList.equals(ne2neList)) {
					for (EObject tmpB2e : b2eList.getEntryObjects()) {
						if (tmpB2e instanceof ASTNode2Element) {
							ASTNode2Element b2e = (ASTNode2Element) tmpB2e;
							ASTNode tmpBodyDeclaration = b2e.getSource();
							if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
								Element tmpFeature = b2e.getTarget();
								if (tmpFeature instanceof Classifier) {
									Classifier feature = (Classifier) tmpFeature;
									if (pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, b2e) == null) {
										if (pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, bodyDeclaration) == null) {
											if (pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, feature) == null) {
												for (EObject tmpNe2ne : ne2neList.getEntryObjects()) {
													if (tmpNe2ne instanceof ASTNode2Element) {
														ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
														if (!b2e.equals(ne2ne)) {
															ASTNode tmpJContainer = ne2ne.getSource();
															if (tmpJContainer instanceof AnonymousClassDeclaration) {
																AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
																Element tmpUContainer = ne2ne.getTarget();
																if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
																	org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
																	if (!feature.equals(uContainer)) {
																		if (pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_4BB(
																				ruleResult, ne2ne) == null) {
																			if (pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_3BB(
																					ruleResult, jContainer) == null) {
																				if (pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_2_isapplicablecore_black_nac_5BB(
																						ruleResult,
																						uContainer) == null) {
																					_result.add(new Object[] { b2eList,
																							bodyDeclaration, b2e,
																							feature, ne2neList,
																							jContainer, ne2ne,
																							uContainer,
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
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_bindingFBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, bodyDeclaration, jContainer, ne2ne,
				b2e, feature, uContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature,
					uContainer, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, IsApplicableMatch isApplicableMatch,
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, ruleResult);
		if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_black = pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, jContainer, ne2ne, b2e, feature,
						uContainer, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_4_checkCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_5_checknacs_blackBBBBBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		if (!b2e.equals(ne2ne)) {
			if (!feature.equals(uContainer)) {
				return new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_6_perform_blackBBBBBBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ASTNode2Element b2e, Classifier feature, org.eclipse.uml2.uml.Class uContainer,
			ModelgeneratorRuleResult ruleResult) {
		if (!b2e.equals(ne2ne)) {
			if (!feature.equals(uContainer)) {
				return new Object[] { bodyDeclaration, jContainer, ne2ne, b2e, feature, uContainer, ruleResult };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_6_perform_greenBBBBB(
			AbstractTypeDeclaration bodyDeclaration, AnonymousClassDeclaration jContainer, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer, ModelgeneratorRuleResult ruleResult) {
		uContainer.getNestedClassifiers().add(feature);
		jContainer.getBodyDeclarations().add(bodyDeclaration);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { bodyDeclaration, jContainer, feature, uContainer, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_InnerDeclaration2InnerClassifier_InAnonymous_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InnerDeclaration2InnerClassifier_InAnonymousImpl
