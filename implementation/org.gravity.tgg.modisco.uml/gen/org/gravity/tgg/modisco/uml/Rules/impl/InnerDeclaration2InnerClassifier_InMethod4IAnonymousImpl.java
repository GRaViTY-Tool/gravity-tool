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
import org.eclipse.modisco.java.BodyDeclaration;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.InnerDeclaration2InnerClassifier_InMethod4IAnonymous;
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
 * An implementation of the model object '<em><b>Inner Declaration2 Inner Classifier In Method4 IAnonymous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl extends AbstractRuleImpl
		implements InnerDeclaration2InnerClassifier_InMethod4IAnonymous {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInnerDeclaration2InnerClassifier_InMethod4IAnonymous();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AnonymousClassDeclaration owner, MAbstractMethodDefinition method,
			AbstractTypeDeclaration bodyDeclaration) {

		Object[] result1_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_1_initialbindings_blackBBBBB(this,
						match, owner, method, bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[owner] = " + owner + ", " + "[method] = " + method + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_bindingAndBlackFBBBBB(this,
						match, owner, method, bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[owner] = " + owner + ", " + "[method] = " + method + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_4_collectelementstobetranslated_blackBBBB(
							match, owner, method, bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[owner] = " + owner + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
						+ bodyDeclaration + ".");
			}
			InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_4_collectelementstobetranslated_greenBBBF(
							match, method, bodyDeclaration);
			//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_5_collectcontextelements_blackBBBB(
							match, owner, method, bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[owner] = " + owner + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
						+ bodyDeclaration + ".");
			}
			InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_5_collectcontextelements_greenBBBBFF(
							match, owner, method, bodyDeclaration);
			//nothing EMoflonEdge owner__method____bodyDeclarations = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge method__owner____anonymousClassDeclarationOwner = (EMoflonEdge) result5_green[5];

			// 
			InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_6_registerobjectstomatch_expressionBBBBB(
							this, match, owner, method, bodyDeclaration);
			return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_7_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnonymousClassDeclaration owner = (AnonymousClassDeclaration) result1_bindingAndBlack[0];
		ASTNode2Element o2c = (ASTNode2Element) result1_bindingAndBlack[1];
		Classifier feature = (Classifier) result1_bindingAndBlack[2];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[3];
		ASTNode2Element bd2ne = (ASTNode2Element) result1_bindingAndBlack[4];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_greenBB(feature,
						uContainer);

		Object[] result2_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_3_bookkeepingforedges_blackBBBBBBBB(
						ruleresult, owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[owner] = " + owner + ", " + "[o2c] = " + o2c + ", " + "[feature] = " + feature + ", "
					+ "[method] = " + method + ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[uContainer] = " + uContainer + ".");
		}
		InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_3_bookkeepingforedges_greenBBBBBFF(
						ruleresult, feature, method, bodyDeclaration, uContainer);
		//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[6];

		// 
		// 
		InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_5_registerobjects_expressionBBBBBBBBB(
						this, ruleresult, owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer);
		return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_greenBF(
						performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AnonymousClassDeclaration owner = (AnonymousClassDeclaration) result2_binding[0];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_binding[1];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_binding[2];
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_2_corematch_blackBFFBFBFB(owner, method,
						bodyDeclaration, match)) {
			ASTNode2Element o2c = (ASTNode2Element) result2_black[1];
			Classifier feature = (Classifier) result2_black[2];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[4];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[6];
			// ForEach 
			for (Object[] result3_black : InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_3_findcontext_blackBBBBBBB(owner,
							o2c, feature, method, bd2ne, bodyDeclaration, uContainer)) {
				Object[] result3_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_3_findcontext_greenBBBBBBBFFFFFFFF(
								owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge o2c__owner____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge owner__method____bodyDeclarations = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge method__owner____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge o2c__uContainer____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, owner, o2c, feature, method, bd2ne, bodyDeclaration,
								uContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[owner] = " + owner + ", "
							+ "[o2c] = " + o2c + ", " + "[feature] = " + feature + ", " + "[method] = " + method + ", "
							+ "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uContainer] = " + uContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_5_checkCSP_expressionFBB(this,
								csp)) {

					Object[] result6_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AnonymousClassDeclaration owner,
			MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration) {
		match.registerObject("owner", owner);
		match.registerObject("method", method);
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnonymousClassDeclaration owner,
			MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration owner,
			ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method, ASTNode2Element bd2ne,
			AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("owner", owner);
		isApplicableMatch.registerObject("o2c", o2c);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject owner, EObject o2c, EObject feature,
			EObject method, EObject bd2ne, EObject bodyDeclaration, EObject uContainer) {
		ruleresult.registerObject("owner", owner);
		ruleresult.registerObject("o2c", o2c);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
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

		Object[] result1_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_1_initialbindings_blackBBBB(this,
						match, feature, uContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
		}

		Object[] result2_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_bindingAndBlackFBBBB(this,
						match, feature, uContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_4_collectelementstobetranslated_blackBBB(
							match, feature, uContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
			}
			InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_4_collectelementstobetranslated_greenBBBF(
							match, feature, uContainer);
			//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_5_collectcontextelements_blackBBB(
							match, feature, uContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
			}
			InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_5_collectcontextelements_greenBBB(
							match, feature, uContainer);

			// 
			InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_6_registerobjectstomatch_expressionBBBB(
							this, match, feature, uContainer);
			return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_7_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnonymousClassDeclaration owner = (AnonymousClassDeclaration) result1_bindingAndBlack[0];
		ASTNode2Element o2c = (ASTNode2Element) result1_bindingAndBlack[1];
		Classifier feature = (Classifier) result1_bindingAndBlack[2];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[3];
		ASTNode2Element bd2ne = (ASTNode2Element) result1_bindingAndBlack[4];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_greenBB(method,
						bodyDeclaration);

		Object[] result2_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_3_bookkeepingforedges_blackBBBBBBBB(
						ruleresult, owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[owner] = " + owner + ", " + "[o2c] = " + o2c + ", " + "[feature] = " + feature + ", "
					+ "[method] = " + method + ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[uContainer] = " + uContainer + ".");
		}
		InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_3_bookkeepingforedges_greenBBBBBFF(
						ruleresult, feature, method, bodyDeclaration, uContainer);
		//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[6];

		// 
		// 
		InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_5_registerobjects_expressionBBBBBBBBB(
						this, ruleresult, owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer);
		return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_greenBF(
						performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Classifier feature = (Classifier) result2_binding[0];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_binding[1];
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_2_corematch_blackFFBFFBB(feature,
						uContainer, match)) {
			AnonymousClassDeclaration owner = (AnonymousClassDeclaration) result2_black[0];
			ASTNode2Element o2c = (ASTNode2Element) result2_black[1];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[3];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[4];
			// ForEach 
			for (Object[] result3_black : InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_3_findcontext_blackBBBFBBB(owner,
							o2c, feature, bd2ne, bodyDeclaration, uContainer)) {
				MAbstractMethodDefinition method = (MAbstractMethodDefinition) result3_black[3];
				Object[] result3_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_3_findcontext_greenBBBBBBBFFFFFFFF(
								owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge o2c__owner____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge owner__method____bodyDeclarations = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge method__owner____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge o2c__uContainer____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, owner, o2c, feature, method, bd2ne, bodyDeclaration,
								uContainer);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[owner] = " + owner + ", "
							+ "[o2c] = " + o2c + ", " + "[feature] = " + feature + ", " + "[method] = " + method + ", "
							+ "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uContainer] = " + uContainer + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_5_checkCSP_expressionFBB(this,
								csp)) {

					Object[] result6_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_7_expressionFB(ruleresult);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration owner,
			ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method, ASTNode2Element bd2ne,
			AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("owner", owner);
		isApplicableMatch.registerObject("o2c", o2c);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject owner, EObject o2c, EObject feature,
			EObject method, EObject bd2ne, EObject bodyDeclaration, EObject uContainer) {
		ruleresult.registerObject("owner", owner);
		ruleresult.registerObject("o2c", o2c);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_140(EMoflonEdge _edge_nestedClassifier) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_2_testcorematchandDECs_blackFFB(
						_edge_nestedClassifier)) {
			Classifier feature = (Classifier) result2_black[0];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[1];
			Object[] result2_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, uContainer)) {
				// 
				if (InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_151(EMoflonEdge _edge_mInnerTypes) {

		Object[] result1_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_2_testcorematchandDECs_blackFFFB(
						_edge_mInnerTypes)) {
			AnonymousClassDeclaration owner = (AnonymousClassDeclaration) result2_black[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[1];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[2];
			Object[] result2_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, owner, method, bodyDeclaration)) {
				// 
				if (InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InnerDeclaration2InnerClassifier_InMethod4IAnonymous");
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
		ruleResult.setRule("InnerDeclaration2InnerClassifier_InMethod4IAnonymous");
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

		Object[] result1_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		AnonymousClassDeclaration owner = (AnonymousClassDeclaration) result2_bindingAndBlack[0];
		Classifier feature = (Classifier) result2_bindingAndBlack[1];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_bindingAndBlack[2];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_bindingAndBlack[3];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
						this, owner, feature, method, bodyDeclaration, uContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[owner] = " + owner + ", " + "[feature] = " + feature + ", " + "[method] = " + method + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_5_matchcorrcontext_blackBFBFBBBB(
							owner, feature, bodyDeclaration, uContainer, sourceMatch, targetMatch)) {
				ASTNode2Element o2c = (ASTNode2Element) result5_black[1];
				ASTNode2Element bd2ne = (ASTNode2Element) result5_black[3];
				Object[] result5_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_5_matchcorrcontext_greenBBBBF(
								o2c, bd2ne, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_6_createcorrespondence_blackBBBBBB(
								owner, feature, method, bodyDeclaration, uContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[owner] = " + owner + ", "
							+ "[feature] = " + feature + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}

				Object[] result7_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_7_addtoreturnedresult_blackBB(
								result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_7_addtoreturnedresult_greenBB(
								result, ccMatch);

			}

		} else {
		}
		return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(AnonymousClassDeclaration owner, Classifier feature,
			MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(AnonymousClassDeclaration owner, MAbstractMethodDefinition method,
			AbstractTypeDeclaration bodyDeclaration) {// 
		Object[] result1_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_27_1_matchtggpattern_blackBBB(owner,
						method, bodyDeclaration);
		if (result1_black != null) {
			return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_27_2_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Classifier feature, org.eclipse.uml2.uml.Class uContainer) {// 
		Object[] result1_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_28_1_matchtggpattern_blackBB(feature,
						uContainer);
		if (result1_black != null) {
			return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_28_2_expressionF();
		} else {
			return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element o2cParameter,
			ASTNode2Element bd2neParameter) {

		Object[] result1_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_blackFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList o2cList = (RuleEntryList) result2_black[0];
			AnonymousClassDeclaration owner = (AnonymousClassDeclaration) result2_black[1];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[2];
			ASTNode2Element o2c = (ASTNode2Element) result2_black[3];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[4];
			//nothing RuleEntryList bd2neList = (RuleEntryList) result2_black[5];
			Classifier feature = (Classifier) result2_black[6];
			ASTNode2Element bd2ne = (ASTNode2Element) result2_black[7];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[8];

			Object[] result3_bindingAndBlack = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
							this, isApplicableMatch, owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[owner] = " + owner + ", " + "[o2c] = "
						+ o2c + ", " + "[feature] = " + feature + ", " + "[method] = " + method + ", " + "[bd2ne] = "
						+ bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uContainer] = "
						+ uContainer + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
					.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_4_checkCSP_expressionFBB(this,
							csp)) {
				// 
				Object[] result5_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
						.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_5_checknacs_blackBBBBBBB(owner,
								o2c, feature, method, bd2ne, bodyDeclaration, uContainer);
				if (result5_black != null) {

					Object[] result6_black = InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_6_perform_blackBBBBBBBB(
									owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[owner] = " + owner
								+ ", " + "[o2c] = " + o2c + ", " + "[feature] = " + feature + ", " + "[method] = "
								+ method + ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration
								+ ", " + "[uContainer] = " + uContainer + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
							.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_6_perform_greenBBBBB(
									feature, method, bodyDeclaration, uContainer, ruleResult);

				} else {
				}

			} else {
			}

		}
		return InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
				.pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration owner,
			ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method, ASTNode2Element bd2ne,
			AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("owner", owner);
		isApplicableMatch.registerObject("o2c", o2c);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("bd2ne", bd2ne);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
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
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPROPRIATE_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MABSTRACTMETHODDEFINITION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MABSTRACTMETHODDEFINITION_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
			return null;
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MABSTRACTMETHODDEFINITION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT_CLASSIFIER_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_ABSTRACTTYPEDECLARATION_CLASS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(Classifier) arguments.get(3), (MAbstractMethodDefinition) arguments.get(4),
					(ASTNode2Element) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(org.eclipse.uml2.uml.Class) arguments.get(7));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPROPRIATE_BWD__MATCH_CLASSIFIER_CLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASSIFIER_CLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
			return null;
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASSIFIER_CLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT_CLASSIFIER_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_ABSTRACTTYPEDECLARATION_CLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(Classifier) arguments.get(3), (MAbstractMethodDefinition) arguments.get(4),
					(ASTNode2Element) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(org.eclipse.uml2.uml.Class) arguments.get(7));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_140__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_140((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_151__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_151((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPLICABLE_SOLVE_CSP_CC__ANONYMOUSCLASSDECLARATION_CLASSIFIER_MABSTRACTMETHODDEFINITION_ABSTRACTTYPEDECLARATION_CLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((AnonymousClassDeclaration) arguments.get(0), (Classifier) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___CHECK_DEC_FWD__ANONYMOUSCLASSDECLARATION_MABSTRACTMETHODDEFINITION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((AnonymousClassDeclaration) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___CHECK_DEC_BWD__CLASSIFIER_CLASS:
			return checkDEC_BWD((Classifier) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT_CLASSIFIER_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_ABSTRACTTYPEDECLARATION_CLASS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(Classifier) arguments.get(3), (MAbstractMethodDefinition) arguments.get(4),
					(ASTNode2Element) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(org.eclipse.uml2.uml.Class) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.INNER_DECLARATION2_INNER_CLASSIFIER_IN_METHOD4_IANONYMOUS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_1_initialbindings_blackBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match, AnonymousClassDeclaration owner,
			MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration) {
		return new Object[] { _this, match, owner, method, bodyDeclaration };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_bindingFBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match, AnonymousClassDeclaration owner,
			MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, owner, method, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, owner, method, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_bindingAndBlackFBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match, AnonymousClassDeclaration owner,
			MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_bindingFBBBBB(
				_this, match, owner, method, bodyDeclaration);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, owner, method, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_3_CheckCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_4_collectelementstobetranslated_blackBBBB(
			Match match, AnonymousClassDeclaration owner, MAbstractMethodDefinition method,
			AbstractTypeDeclaration bodyDeclaration) {
		return new Object[] { match, owner, method, bodyDeclaration };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration) {
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(method__bodyDeclaration____mInnerTypes);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		return new Object[] { match, method, bodyDeclaration, method__bodyDeclaration____mInnerTypes };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_5_collectcontextelements_blackBBBB(
			Match match, AnonymousClassDeclaration owner, MAbstractMethodDefinition method,
			AbstractTypeDeclaration bodyDeclaration) {
		return new Object[] { match, owner, method, bodyDeclaration };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_5_collectcontextelements_greenBBBBFF(
			Match match, AnonymousClassDeclaration owner, MAbstractMethodDefinition method,
			AbstractTypeDeclaration bodyDeclaration) {
		EMoflonEdge owner__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__owner____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(owner);
		match.getContextNodes().add(method);
		match.getContextNodes().add(bodyDeclaration);
		String owner__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__owner____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		owner__method____bodyDeclarations.setSrc(owner);
		owner__method____bodyDeclarations.setTrg(method);
		match.getContextEdges().add(owner__method____bodyDeclarations);
		method__owner____anonymousClassDeclarationOwner.setSrc(method);
		method__owner____anonymousClassDeclarationOwner.setTrg(owner);
		match.getContextEdges().add(method__owner____anonymousClassDeclarationOwner);
		owner__method____bodyDeclarations.setName(owner__method____bodyDeclarations_name_prime);
		method__owner____anonymousClassDeclarationOwner
				.setName(method__owner____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { match, owner, method, bodyDeclaration, owner__method____bodyDeclarations,
				method__owner____anonymousClassDeclarationOwner };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_6_registerobjectstomatch_expressionBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match, AnonymousClassDeclaration owner,
			MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, owner, method, bodyDeclaration);

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("owner");
		EObject _localVariable_1 = isApplicableMatch.getObject("o2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("feature");
		EObject _localVariable_3 = isApplicableMatch.getObject("method");
		EObject _localVariable_4 = isApplicableMatch.getObject("bd2ne");
		EObject _localVariable_5 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_6 = isApplicableMatch.getObject("uContainer");
		EObject tmpOwner = _localVariable_0;
		EObject tmpO2c = _localVariable_1;
		EObject tmpFeature = _localVariable_2;
		EObject tmpMethod = _localVariable_3;
		EObject tmpBd2ne = _localVariable_4;
		EObject tmpBodyDeclaration = _localVariable_5;
		EObject tmpUContainer = _localVariable_6;
		if (tmpOwner instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration owner = (AnonymousClassDeclaration) tmpOwner;
			if (tmpO2c instanceof ASTNode2Element) {
				ASTNode2Element o2c = (ASTNode2Element) tmpO2c;
				if (tmpFeature instanceof Classifier) {
					Classifier feature = (Classifier) tmpFeature;
					if (tmpMethod instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
						if (tmpBd2ne instanceof ASTNode2Element) {
							ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
							if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
								if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
									org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
									return new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration,
											uContainer, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_blackBBBBBBBFBB(
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer,
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, IsApplicableMatch isApplicableMatch) {
		if (!feature.equals(uContainer)) {
			if (!bd2ne.equals(o2c)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, csp,
								_this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_binding != null) {
			AnonymousClassDeclaration owner = (AnonymousClassDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_binding[0];
			ASTNode2Element o2c = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_binding[1];
			Classifier feature = (Classifier) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_binding[2];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_binding[3];
			ASTNode2Element bd2ne = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_binding[4];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_binding[5];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_binding[6];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_blackBBBBBBBFBB(
					owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, _this, isApplicableMatch);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_black[7];

				return new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_1_performtransformation_greenBB(
			Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		uContainer.getNestedClassifiers().add(feature);
		return new Object[] { feature, uContainer };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject owner, EObject o2c, EObject feature, EObject method, EObject bd2ne,
			EObject bodyDeclaration, EObject uContainer) {
		if (!owner.equals(uContainer)) {
			if (!o2c.equals(owner)) {
				if (!o2c.equals(uContainer)) {
					if (!feature.equals(owner)) {
						if (!feature.equals(o2c)) {
							if (!feature.equals(method)) {
								if (!feature.equals(uContainer)) {
									if (!method.equals(owner)) {
										if (!method.equals(o2c)) {
											if (!method.equals(uContainer)) {
												if (!bd2ne.equals(owner)) {
													if (!bd2ne.equals(o2c)) {
														if (!bd2ne.equals(feature)) {
															if (!bd2ne.equals(method)) {
																if (!bd2ne.equals(bodyDeclaration)) {
																	if (!bd2ne.equals(uContainer)) {
																		if (!bodyDeclaration.equals(owner)) {
																			if (!bodyDeclaration.equals(o2c)) {
																				if (!bodyDeclaration.equals(feature)) {
																					if (!bodyDeclaration
																							.equals(method)) {
																						if (!bodyDeclaration
																								.equals(uContainer)) {
																							return new Object[] {
																									ruleresult, owner,
																									o2c, feature,
																									method, bd2ne,
																									bodyDeclaration,
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
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject feature, EObject method, EObject bodyDeclaration,
			EObject uContainer) {
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerDeclaration2InnerClassifier_InMethod4IAnonymous";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(method__bodyDeclaration____mInnerTypes);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getCreatedEdges().add(uContainer__feature____nestedClassifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		return new Object[] { ruleresult, feature, method, bodyDeclaration, uContainer,
				method__bodyDeclaration____mInnerTypes, uContainer__feature____nestedClassifier };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_5_registerobjects_expressionBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, PerformRuleResult ruleresult, EObject owner,
			EObject o2c, EObject feature, EObject method, EObject bd2ne, EObject bodyDeclaration, EObject uContainer) {
		_this.registerObjects_FWD(ruleresult, owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer);

	}

	public static final PerformRuleResult pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerDeclaration2InnerClassifier_InMethod4IAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_2_corematch_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("owner");
		EObject _localVariable_1 = match.getObject("method");
		EObject _localVariable_2 = match.getObject("bodyDeclaration");
		EObject tmpOwner = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		if (tmpOwner instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration owner = (AnonymousClassDeclaration) tmpOwner;
			if (tmpMethod instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
				if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
					return new Object[] { owner, method, bodyDeclaration, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_2_corematch_blackBFFBFBFB(
			AnonymousClassDeclaration owner, MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(bodyDeclaration,
				ASTNode2Element.class, "source")) {
			Element tmpFeature = bd2ne.getTarget();
			if (tmpFeature instanceof Classifier) {
				Classifier feature = (Classifier) tmpFeature;
				for (ASTNode2Element o2c : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(owner,
						ASTNode2Element.class, "source")) {
					if (!bd2ne.equals(o2c)) {
						Element tmpUContainer = o2c.getTarget();
						if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
							if (!feature.equals(uContainer)) {
								_result.add(new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration,
										uContainer, match });
							}
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_3_findcontext_blackBBBBBBB(
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			if (!bd2ne.equals(o2c)) {
				if (method.getMInnerTypes().contains(bodyDeclaration)) {
					if (bodyDeclaration.equals(bd2ne.getSource())) {
						if (owner.equals(o2c.getSource())) {
							if (feature.equals(bd2ne.getTarget())) {
								if (owner.getBodyDeclarations().contains(method)) {
									if (uContainer.equals(o2c.getTarget())) {
										_result.add(new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration,
												uContainer });
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge o2c__owner____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge owner__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__owner____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge o2c__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String o2c__owner____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String owner__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__owner____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String o2c__uContainer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(owner);
		isApplicableMatch.getAllContextElements().add(o2c);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(bd2ne);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(uContainer);
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(method__bodyDeclaration____mInnerTypes);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(bd2ne__bodyDeclaration____source);
		o2c__owner____source.setSrc(o2c);
		o2c__owner____source.setTrg(owner);
		isApplicableMatch.getAllContextElements().add(o2c__owner____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(bd2ne__feature____target);
		owner__method____bodyDeclarations.setSrc(owner);
		owner__method____bodyDeclarations.setTrg(method);
		isApplicableMatch.getAllContextElements().add(owner__method____bodyDeclarations);
		method__owner____anonymousClassDeclarationOwner.setSrc(method);
		method__owner____anonymousClassDeclarationOwner.setTrg(owner);
		isApplicableMatch.getAllContextElements().add(method__owner____anonymousClassDeclarationOwner);
		o2c__uContainer____target.setSrc(o2c);
		o2c__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(o2c__uContainer____target);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		o2c__owner____source.setName(o2c__owner____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		owner__method____bodyDeclarations.setName(owner__method____bodyDeclarations_name_prime);
		method__owner____anonymousClassDeclarationOwner
				.setName(method__owner____anonymousClassDeclarationOwner_name_prime);
		o2c__uContainer____target.setName(o2c__uContainer____target_name_prime);
		return new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, isApplicableMatch,
				method__bodyDeclaration____mInnerTypes, bd2ne__bodyDeclaration____source, o2c__owner____source,
				bd2ne__feature____target, owner__method____bodyDeclarations,
				method__owner____anonymousClassDeclarationOwner, o2c__uContainer____target };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_bindingFBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, owner, o2c, feature, method, bd2ne,
				bodyDeclaration, uContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, owner, o2c, feature, method, bd2ne, bodyDeclaration,
					uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, owner, o2c, feature, method, bd2ne,
						bodyDeclaration, uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_5_checkCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InMethod4IAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_1_initialbindings_blackBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { _this, match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_bindingFBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_bindingAndBlackFBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, uContainer);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_3_CheckCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_4_collectelementstobetranslated_blackBBB(
			Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		match.getToBeTranslatedEdges().add(uContainer__feature____nestedClassifier);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		return new Object[] { match, feature, uContainer, uContainer__feature____nestedClassifier };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_5_collectcontextelements_blackBBB(
			Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_5_collectcontextelements_greenBBB(
			Match match, Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		match.getContextNodes().add(feature);
		match.getContextNodes().add(uContainer);
		return new Object[] { match, feature, uContainer };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_6_registerobjectstomatch_expressionBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {
		_this.registerObjectsToMatch_BWD(match, feature, uContainer);

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("owner");
		EObject _localVariable_1 = isApplicableMatch.getObject("o2c");
		EObject _localVariable_2 = isApplicableMatch.getObject("feature");
		EObject _localVariable_3 = isApplicableMatch.getObject("method");
		EObject _localVariable_4 = isApplicableMatch.getObject("bd2ne");
		EObject _localVariable_5 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_6 = isApplicableMatch.getObject("uContainer");
		EObject tmpOwner = _localVariable_0;
		EObject tmpO2c = _localVariable_1;
		EObject tmpFeature = _localVariable_2;
		EObject tmpMethod = _localVariable_3;
		EObject tmpBd2ne = _localVariable_4;
		EObject tmpBodyDeclaration = _localVariable_5;
		EObject tmpUContainer = _localVariable_6;
		if (tmpOwner instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration owner = (AnonymousClassDeclaration) tmpOwner;
			if (tmpO2c instanceof ASTNode2Element) {
				ASTNode2Element o2c = (ASTNode2Element) tmpO2c;
				if (tmpFeature instanceof Classifier) {
					Classifier feature = (Classifier) tmpFeature;
					if (tmpMethod instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
						if (tmpBd2ne instanceof ASTNode2Element) {
							ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
							if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
								if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
									org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
									return new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration,
											uContainer, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_blackBBBBBBBFBB(
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer,
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, IsApplicableMatch isApplicableMatch) {
		if (!feature.equals(uContainer)) {
			if (!bd2ne.equals(o2c)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, csp,
								_this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_binding != null) {
			AnonymousClassDeclaration owner = (AnonymousClassDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_binding[0];
			ASTNode2Element o2c = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_binding[1];
			Classifier feature = (Classifier) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_binding[2];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_binding[3];
			ASTNode2Element bd2ne = (ASTNode2Element) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_binding[4];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_binding[5];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_binding[6];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_blackBBBBBBBFBB(
					owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, _this, isApplicableMatch);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_black[7];

				return new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_1_performtransformation_greenBB(
			MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration) {
		method.getMInnerTypes().add(bodyDeclaration);
		return new Object[] { method, bodyDeclaration };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject owner, EObject o2c, EObject feature, EObject method, EObject bd2ne,
			EObject bodyDeclaration, EObject uContainer) {
		if (!owner.equals(uContainer)) {
			if (!o2c.equals(owner)) {
				if (!o2c.equals(uContainer)) {
					if (!feature.equals(owner)) {
						if (!feature.equals(o2c)) {
							if (!feature.equals(method)) {
								if (!feature.equals(uContainer)) {
									if (!method.equals(owner)) {
										if (!method.equals(o2c)) {
											if (!method.equals(uContainer)) {
												if (!bd2ne.equals(owner)) {
													if (!bd2ne.equals(o2c)) {
														if (!bd2ne.equals(feature)) {
															if (!bd2ne.equals(method)) {
																if (!bd2ne.equals(bodyDeclaration)) {
																	if (!bd2ne.equals(uContainer)) {
																		if (!bodyDeclaration.equals(owner)) {
																			if (!bodyDeclaration.equals(o2c)) {
																				if (!bodyDeclaration.equals(feature)) {
																					if (!bodyDeclaration
																							.equals(method)) {
																						if (!bodyDeclaration
																								.equals(uContainer)) {
																							return new Object[] {
																									ruleresult, owner,
																									o2c, feature,
																									method, bd2ne,
																									bodyDeclaration,
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
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject feature, EObject method, EObject bodyDeclaration,
			EObject uContainer) {
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerDeclaration2InnerClassifier_InMethod4IAnonymous";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(method__bodyDeclaration____mInnerTypes);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uContainer__feature____nestedClassifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		return new Object[] { ruleresult, feature, method, bodyDeclaration, uContainer,
				method__bodyDeclaration____mInnerTypes, uContainer__feature____nestedClassifier };
	}

	public static final void pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_5_registerobjects_expressionBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, PerformRuleResult ruleresult, EObject owner,
			EObject o2c, EObject feature, EObject method, EObject bd2ne, EObject bodyDeclaration, EObject uContainer) {
		_this.registerObjects_BWD(ruleresult, owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer);

	}

	public static final PerformRuleResult pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerDeclaration2InnerClassifier_InMethod4IAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_2_corematch_bindingFFB(
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

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_2_corematch_blackFFBFFBB(
			Classifier feature, org.eclipse.uml2.uml.Class uContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(feature,
					ASTNode2Element.class, "target")) {
				ASTNode tmpBodyDeclaration = bd2ne.getSource();
				if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
					for (ASTNode2Element o2c : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(uContainer, ASTNode2Element.class, "target")) {
						if (!bd2ne.equals(o2c)) {
							ASTNode tmpOwner = o2c.getSource();
							if (tmpOwner instanceof AnonymousClassDeclaration) {
								AnonymousClassDeclaration owner = (AnonymousClassDeclaration) tmpOwner;
								_result.add(new Object[] { owner, o2c, feature, bd2ne, bodyDeclaration, uContainer,
										match });
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_3_findcontext_blackBBBFBBB(
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, ASTNode2Element bd2ne,
			AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			if (!bd2ne.equals(o2c)) {
				if (bodyDeclaration.equals(bd2ne.getSource())) {
					if (owner.equals(o2c.getSource())) {
						if (feature.equals(bd2ne.getTarget())) {
							if (uContainer.getNestedClassifiers().contains(feature)) {
								if (uContainer.equals(o2c.getTarget())) {
									for (BodyDeclaration tmpMethod : owner.getBodyDeclarations()) {
										if (tmpMethod instanceof MAbstractMethodDefinition) {
											MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
											_result.add(new Object[] { owner, o2c, feature, method, bd2ne,
													bodyDeclaration, uContainer });
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_3_findcontext_greenBBBBBBBFFFFFFFF(
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge o2c__owner____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge owner__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__owner____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge o2c__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String o2c__owner____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String owner__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__owner____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String o2c__uContainer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(owner);
		isApplicableMatch.getAllContextElements().add(o2c);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(bd2ne);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(uContainer);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(bd2ne__bodyDeclaration____source);
		o2c__owner____source.setSrc(o2c);
		o2c__owner____source.setTrg(owner);
		isApplicableMatch.getAllContextElements().add(o2c__owner____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(bd2ne__feature____target);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uContainer__feature____nestedClassifier);
		owner__method____bodyDeclarations.setSrc(owner);
		owner__method____bodyDeclarations.setTrg(method);
		isApplicableMatch.getAllContextElements().add(owner__method____bodyDeclarations);
		method__owner____anonymousClassDeclarationOwner.setSrc(method);
		method__owner____anonymousClassDeclarationOwner.setTrg(owner);
		isApplicableMatch.getAllContextElements().add(method__owner____anonymousClassDeclarationOwner);
		o2c__uContainer____target.setSrc(o2c);
		o2c__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(o2c__uContainer____target);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		o2c__owner____source.setName(o2c__owner____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		owner__method____bodyDeclarations.setName(owner__method____bodyDeclarations_name_prime);
		method__owner____anonymousClassDeclarationOwner
				.setName(method__owner____anonymousClassDeclarationOwner_name_prime);
		o2c__uContainer____target.setName(o2c__uContainer____target_name_prime);
		return new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, isApplicableMatch,
				bd2ne__bodyDeclaration____source, o2c__owner____source, bd2ne__feature____target,
				uContainer__feature____nestedClassifier, owner__method____bodyDeclarations,
				method__owner____anonymousClassDeclarationOwner, o2c__uContainer____target };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_bindingFBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, owner, o2c, feature, method, bd2ne,
				bodyDeclaration, uContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, owner, o2c, feature, method, bd2ne, bodyDeclaration,
					uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, owner, o2c, feature, method, bd2ne,
						bodyDeclaration, uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_5_checkCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InMethod4IAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_2_testcorematchandDECs_blackFFB(
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match, Classifier feature,
			org.eclipse.uml2.uml.Class uContainer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_bindingFB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
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

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_mInnerTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMethod = _edge_mInnerTypes.getSrc();
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			EObject tmpBodyDeclaration = _edge_mInnerTypes.getTrg();
			if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
				if (method.getMInnerTypes().contains(bodyDeclaration)) {
					AnonymousClassDeclaration owner = method.getAnonymousClassDeclarationOwner();
					if (owner != null) {
						_result.add(new Object[] { owner, method, bodyDeclaration, _edge_mInnerTypes });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match, AnonymousClassDeclaration owner,
			MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, owner, method, bodyDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_1_prepare_blackB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("owner");
		EObject _localVariable_1 = targetMatch.getObject("feature");
		EObject _localVariable_2 = sourceMatch.getObject("method");
		EObject _localVariable_3 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_4 = targetMatch.getObject("uContainer");
		EObject tmpOwner = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpMethod = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		EObject tmpUContainer = _localVariable_4;
		if (tmpOwner instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration owner = (AnonymousClassDeclaration) tmpOwner;
			if (tmpFeature instanceof Classifier) {
				Classifier feature = (Classifier) tmpFeature;
				if (tmpMethod instanceof MAbstractMethodDefinition) {
					MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
					if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
						if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
							return new Object[] { owner, feature, method, bodyDeclaration, uContainer, sourceMatch,
									targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_blackBBBBBBB(
			AnonymousClassDeclaration owner, Classifier feature, MAbstractMethodDefinition method,
			AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer, Match sourceMatch,
			Match targetMatch) {
		if (!feature.equals(uContainer)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { owner, feature, method, bodyDeclaration, uContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_bindingFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_binding != null) {
			AnonymousClassDeclaration owner = (AnonymousClassDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_binding[0];
			Classifier feature = (Classifier) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_binding[1];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_binding[3];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_blackBBBBBBB(
					owner, feature, method, bodyDeclaration, uContainer, sourceMatch, targetMatch);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { owner, feature, method, bodyDeclaration, uContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_bindingFBBBBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, AnonymousClassDeclaration owner,
			Classifier feature, MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(owner, feature, method, bodyDeclaration, uContainer,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, owner, feature, method, bodyDeclaration, uContainer, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, AnonymousClassDeclaration owner,
			Classifier feature, MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_bindingFBBBBBBBB(
				_this, owner, feature, method, bodyDeclaration, uContainer, sourceMatch, targetMatch);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, owner, feature, method, bodyDeclaration, uContainer, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_4_checkCSP_expressionFB(
			CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_5_matchcorrcontext_blackBFBFBBBB(
			AnonymousClassDeclaration owner, Classifier feature, AbstractTypeDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (ASTNode2Element bd2ne : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(bodyDeclaration, ASTNode2Element.class, "source")) {
					if (feature.equals(bd2ne.getTarget())) {
						for (ASTNode2Element o2c : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(owner, ASTNode2Element.class, "source")) {
							if (!bd2ne.equals(o2c)) {
								if (uContainer.equals(o2c.getTarget())) {
									_result.add(new Object[] { owner, o2c, feature, bd2ne, bodyDeclaration, uContainer,
											sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element o2c, ASTNode2Element bd2ne, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InMethod4IAnonymous";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(o2c);
		ccMatch.getAllContextElements().add(bd2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { o2c, bd2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_6_createcorrespondence_blackBBBBBB(
			AnonymousClassDeclaration owner, Classifier feature, MAbstractMethodDefinition method,
			AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer, CCMatch ccMatch) {
		if (!feature.equals(uContainer)) {
			return new Object[] { owner, feature, method, bodyDeclaration, uContainer, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InnerDeclaration2InnerClassifier_InMethod4IAnonymous";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_27_1_matchtggpattern_blackBBB(
			AnonymousClassDeclaration owner, MAbstractMethodDefinition method,
			AbstractTypeDeclaration bodyDeclaration) {
		if (method.getMInnerTypes().contains(bodyDeclaration)) {
			if (owner.getBodyDeclarations().contains(method)) {
				return new Object[] { owner, method, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_28_1_matchtggpattern_blackBB(
			Classifier feature, org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			if (uContainer.getNestedClassifiers().contains(feature)) {
				return new Object[] { feature, uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_1_createresult_blackB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration owner) {
		if (ruleResult.getSourceObjects().contains(owner)) {
			return new Object[] { ruleResult, owner };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element o2c) {
		if (ruleResult.getCorrObjects().contains(o2c)) {
			return new Object[] { ruleResult, o2c };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Classifier feature) {
		if (ruleResult.getTargetObjects().contains(feature)) {
			return new Object[] { ruleResult, feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element bd2ne) {
		if (ruleResult.getCorrObjects().contains(bd2ne)) {
			return new Object[] { ruleResult, bd2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration bodyDeclaration) {
		if (ruleResult.getSourceObjects().contains(bodyDeclaration)) {
			return new Object[] { ruleResult, bodyDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_blackFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList o2cList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList bd2neList : ruleEntryContainer.getRuleEntryList()) {
				if (!bd2neList.equals(o2cList)) {
					for (EObject tmpO2c : o2cList.getEntryObjects()) {
						if (tmpO2c instanceof ASTNode2Element) {
							ASTNode2Element o2c = (ASTNode2Element) tmpO2c;
							ASTNode tmpOwner = o2c.getSource();
							if (tmpOwner instanceof AnonymousClassDeclaration) {
								AnonymousClassDeclaration owner = (AnonymousClassDeclaration) tmpOwner;
								Element tmpUContainer = o2c.getTarget();
								if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
									org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
									if (pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, o2c) == null) {
										if (pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, owner) == null) {
											if (pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, uContainer) == null) {
												for (EObject tmpBd2ne : bd2neList.getEntryObjects()) {
													if (tmpBd2ne instanceof ASTNode2Element) {
														ASTNode2Element bd2ne = (ASTNode2Element) tmpBd2ne;
														if (!bd2ne.equals(o2c)) {
															Element tmpFeature = bd2ne.getTarget();
															if (tmpFeature instanceof Classifier) {
																Classifier feature = (Classifier) tmpFeature;
																if (!feature.equals(uContainer)) {
																	ASTNode tmpBodyDeclaration = bd2ne.getSource();
																	if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
																		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
																		if (pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, bd2ne) == null) {
																			if (pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult, feature) == null) {
																				if (pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_6BB(
																						ruleResult,
																						bodyDeclaration) == null) {
																					for (BodyDeclaration tmpMethod : owner
																							.getBodyDeclarations()) {
																						if (tmpMethod instanceof MAbstractMethodDefinition) {
																							MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
																							if (pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_2_isapplicablecore_black_nac_1BB(
																									ruleResult,
																									method) == null) {
																								_result.add(
																										new Object[] {
																												o2cList,
																												owner,
																												method,
																												o2c,
																												uContainer,
																												bd2neList,
																												feature,
																												bd2ne,
																												bodyDeclaration,
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
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_bindingFBBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, owner, o2c, feature, method, bd2ne,
				bodyDeclaration, uContainer, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, owner, o2c, feature, method, bd2ne, bodyDeclaration,
					uContainer, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_binding = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, ruleResult);
		if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_binding[0];

			Object[] result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_black = pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, owner, o2c, feature, method, bd2ne,
						bodyDeclaration, uContainer, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_4_checkCSP_expressionFBB(
			InnerDeclaration2InnerClassifier_InMethod4IAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_5_checknacs_blackBBBBBBB(
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			if (!bd2ne.equals(o2c)) {
				return new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_6_perform_blackBBBBBBBB(
			AnonymousClassDeclaration owner, ASTNode2Element o2c, Classifier feature, MAbstractMethodDefinition method,
			ASTNode2Element bd2ne, AbstractTypeDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer,
			ModelgeneratorRuleResult ruleResult) {
		if (!feature.equals(uContainer)) {
			if (!bd2ne.equals(o2c)) {
				return new Object[] { owner, o2c, feature, method, bd2ne, bodyDeclaration, uContainer, ruleResult };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_6_perform_greenBBBBB(
			Classifier feature, MAbstractMethodDefinition method, AbstractTypeDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, ModelgeneratorRuleResult ruleResult) {
		method.getMInnerTypes().add(bodyDeclaration);
		uContainer.getNestedClassifiers().add(feature);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { feature, method, bodyDeclaration, uContainer, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_InnerDeclaration2InnerClassifier_InMethod4IAnonymous_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InnerDeclaration2InnerClassifier_InMethod4IAnonymousImpl
