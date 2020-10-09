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
import org.eclipse.modisco.java.Modifier;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.ConstructorDec2OperationAnonymous;
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
 * An implementation of the model object '<em><b>Constructor Dec2 Operation Anonymous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstructorDec2OperationAnonymousImpl extends AbstractRuleImpl
		implements ConstructorDec2OperationAnonymous {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorDec2OperationAnonymousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getConstructorDec2OperationAnonymous();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration) {

		Object[] result1_black = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_0_1_initialbindings_blackBBBB(this, match, mAnon,
						bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mAnon] = " + mAnon + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mAnon,
						bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mAnon] = " + mAnon + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_0_4_collectelementstobetranslated_blackBBB(match, mAnon,
							bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnon] = " + mAnon + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_0_4_collectelementstobetranslated_greenBBBFF(match,
							mAnon, bodyDeclaration);
			//nothing EMoflonEdge mAnon__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__mAnon____anonymousClassDeclarationOwner = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_0_5_collectcontextelements_blackBBB(match, mAnon,
							bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnon] = " + mAnon + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_0_5_collectcontextelements_greenBB(match, mAnon);

			// 
			ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_0_6_registerobjectstomatch_expressionBBBB(this, match,
							mAnon, bodyDeclaration);
			return ConstructorDec2OperationAnonymousImpl.pattern_ConstructorDec2OperationAnonymous_0_7_expressionF();
		} else {
			return ConstructorDec2OperationAnonymousImpl.pattern_ConstructorDec2OperationAnonymous_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result1_bindingAndBlack[0];
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result1_bindingAndBlack[1];
		ASTNode2Element ba2na = (ASTNode2Element) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_greenFFFBBB(bodyDeclaration, uAnon,
						csp);
		Operation feature = (Operation) result1_green[0];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];

		Object[] result2_black = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_1_2_collecttranslatedelements_blackBBBB(feature, bd2ne, b2e,
						bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne
							+ ", " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_1_2_collecttranslatedelements_greenFBBBB(feature, bd2ne, b2e,
						bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, feature,
						bd2ne, b2e, mAnon, bodyDeclaration, ba2na, uAnon);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", "
					+ "[mAnon] = " + mAnon + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[ba2na] = "
					+ ba2na + ", " + "[uAnon] = " + uAnon + ".");
		}
		ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(ruleresult,
						feature, bd2ne, b2e, mAnon, bodyDeclaration, uAnon);
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge uAnon__feature____ownedOperation = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge feature__uAnon____class = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mAnon__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge bodyDeclaration__mAnon____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[14];

		// 
		// 
		ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
						feature, bd2ne, b2e, mAnon, bodyDeclaration, ba2na, uAnon);
		return ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_binding[0];
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result2_binding[1];
		for (Object[] result2_black : ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_2_2_corematch_blackBBFFB(mAnon, bodyDeclaration, match)) {
			ASTNode2Element ba2na = (ASTNode2Element) result2_black[2];
			org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result2_black[3];
			// ForEach 
			for (Object[] result3_black : ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_2_3_findcontext_blackBBBB(mAnon, bodyDeclaration, ba2na,
							uAnon)) {
				Object[] result3_green = ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_2_3_findcontext_greenBBBBFFFFF(mAnon,
								bodyDeclaration, ba2na, uAnon);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge ba2na__mAnon____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mAnon__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge bodyDeclaration__mAnon____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge ba2na__uAnon____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, mAnon, bodyDeclaration, ba2na, uAnon);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mAnon] = " + mAnon + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[ba2na] = " + ba2na + ", "
							+ "[uAnon] = " + uAnon + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ConstructorDec2OperationAnonymousImpl
							.pattern_ConstructorDec2OperationAnonymous_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ConstructorDec2OperationAnonymousImpl
							.pattern_ConstructorDec2OperationAnonymous_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration) {
		match.registerObject("mAnon", mAnon);
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration, ASTNode2Element ba2na, org.eclipse.uml2.uml.Class uAnon) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");

		// Create unbound variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAnon", mAnon);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("ba2na", ba2na);
		isApplicableMatch.registerObject("uAnon", uAnon);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject b2e,
			EObject mAnon, EObject bodyDeclaration, EObject ba2na, EObject uAnon) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("mAnon", mAnon);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("ba2na", ba2na);
		ruleresult.registerObject("uAnon", uAnon);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
				.equals("modisco.MConstructorDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {

		Object[] result1_black = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_10_1_initialbindings_blackBBBB(this, match, feature, uAnon);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uAnon] = " + uAnon + ".");
		}

		Object[] result2_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature,
						uAnon);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uAnon] = " + uAnon + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_10_4_collectelementstobetranslated_blackBBB(match,
							feature, uAnon);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uAnon] = " + uAnon + ".");
			}
			ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_10_4_collectelementstobetranslated_greenBBBFF(match,
							feature, uAnon);
			//nothing EMoflonEdge uAnon__feature____ownedOperation = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge feature__uAnon____class = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_10_5_collectcontextelements_blackBBB(match, feature,
							uAnon);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uAnon] = " + uAnon + ".");
			}
			ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_10_5_collectcontextelements_greenBB(match, uAnon);

			// 
			ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_10_6_registerobjectstomatch_expressionBBBB(this, match,
							feature, uAnon);
			return ConstructorDec2OperationAnonymousImpl.pattern_ConstructorDec2OperationAnonymous_10_7_expressionF();
		} else {
			return ConstructorDec2OperationAnonymousImpl.pattern_ConstructorDec2OperationAnonymous_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Operation feature = (Operation) result1_bindingAndBlack[0];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result1_bindingAndBlack[1];
		ASTNode2Element ba2na = (ASTNode2Element) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_greenBFFBFB(feature, mAnon, csp);
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result1_green[4];

		Object[] result2_black = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_11_2_collecttranslatedelements_blackBBBB(feature, bd2ne, b2e,
						bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne
							+ ", " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_11_2_collecttranslatedelements_greenFBBBB(feature, bd2ne,
						b2e, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, feature,
						bd2ne, b2e, mAnon, bodyDeclaration, ba2na, uAnon);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", "
					+ "[mAnon] = " + mAnon + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[ba2na] = "
					+ ba2na + ", " + "[uAnon] = " + uAnon + ".");
		}
		ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(ruleresult,
						feature, bd2ne, b2e, mAnon, bodyDeclaration, uAnon);
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge uAnon__feature____ownedOperation = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge feature__uAnon____class = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mAnon__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge bodyDeclaration__mAnon____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[14];

		// 
		// 
		ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
						feature, bd2ne, b2e, mAnon, bodyDeclaration, ba2na, uAnon);
		return ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Operation feature = (Operation) result2_binding[0];
		org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result2_binding[1];
		for (Object[] result2_black : ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_12_2_corematch_blackBFFBB(feature, uAnon, match)) {
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_black[1];
			ASTNode2Element ba2na = (ASTNode2Element) result2_black[2];
			// ForEach 
			for (Object[] result3_black : ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_12_3_findcontext_blackBBBB(feature, mAnon, ba2na,
							uAnon)) {
				Object[] result3_green = ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_12_3_findcontext_greenBBBBFFFFF(feature, mAnon,
								ba2na, uAnon);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge ba2na__mAnon____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge uAnon__feature____ownedOperation = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge feature__uAnon____class = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge ba2na__uAnon____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, feature, mAnon, ba2na, uAnon);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[mAnon] = " + mAnon + ", " + "[ba2na] = " + ba2na + ", " + "[uAnon] = " + uAnon + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ConstructorDec2OperationAnonymousImpl
							.pattern_ConstructorDec2OperationAnonymous_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ConstructorDec2OperationAnonymousImpl
							.pattern_ConstructorDec2OperationAnonymous_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {
		match.registerObject("feature", feature);
		match.registerObject("uAnon", uAnon);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Operation feature,
			AnonymousClassDeclaration mAnon, ASTNode2Element ba2na, org.eclipse.uml2.uml.Class uAnon) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("mAnon", mAnon);
		isApplicableMatch.registerObject("ba2na", ba2na);
		isApplicableMatch.registerObject("uAnon", uAnon);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject b2e,
			EObject mAnon, EObject bodyDeclaration, EObject ba2na, EObject uAnon) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("mAnon", mAnon);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("ba2na", ba2na);
		ruleresult.registerObject("uAnon", uAnon);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass()).equals("uml.Operation.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_300(EMoflonEdge _edge_ownedOperation) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_20_2_testcorematchandDECs_blackFFB(_edge_ownedOperation)) {
			Operation feature = (Operation) result2_black[0];
			org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result2_black[1];
			Object[] result2_green = ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, uAnon)) {
				// 
				if (ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ConstructorDec2OperationAnonymousImpl
							.pattern_ConstructorDec2OperationAnonymous_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ConstructorDec2OperationAnonymousImpl
							.pattern_ConstructorDec2OperationAnonymous_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_309(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_21_2_testcorematchandDECs_blackFFB(_edge_bodyDeclarations)) {
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_black[0];
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result2_black[1];
			Object[] result2_green = ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, mAnon, bodyDeclaration)) {
				// 
				if (ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ConstructorDec2OperationAnonymousImpl
							.pattern_ConstructorDec2OperationAnonymous_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ConstructorDec2OperationAnonymousImpl
							.pattern_ConstructorDec2OperationAnonymous_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ConstructorDec2OperationAnonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ConstructorDec2OperationAnonymous");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "name", var_feature_name.getValue());
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
		ruleResult.setRule("ConstructorDec2OperationAnonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("ConstructorDec2OperationAnonymous");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_bodyDeclaration_name.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("bodyDeclaration", "name", var_bodyDeclaration_name.getValue());
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

		Object[] result1_black = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Operation feature = (Operation) result2_bindingAndBlack[0];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_bindingAndBlack[1];
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, feature, mAnon,
						bodyDeclaration, uAnon, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[mAnon] = " + mAnon + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[uAnon] = " + uAnon + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_24_5_matchcorrcontext_blackBFBBB(mAnon, uAnon,
							sourceMatch, targetMatch)) {
				ASTNode2Element ba2na = (ASTNode2Element) result5_black[1];
				Object[] result5_green = ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_24_5_matchcorrcontext_greenBBBF(ba2na, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_24_6_createcorrespondence_blackBBBBB(feature, mAnon,
								bodyDeclaration, uAnon, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[mAnon] = " + mAnon + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uAnon] = " + uAnon + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_24_6_createcorrespondence_greenBFFBB(feature,
								bodyDeclaration, ccMatch);
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[1];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];

				Object[] result7_black = ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Operation feature, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uAnon, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
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
	public boolean checkDEC_FWD(AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration) {// 
		Object[] result1_black = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_27_1_matchtggpattern_blackBB(mAnon, bodyDeclaration);
		if (result1_black != null) {
			return ConstructorDec2OperationAnonymousImpl.pattern_ConstructorDec2OperationAnonymous_27_2_expressionF();
		} else {
			return ConstructorDec2OperationAnonymousImpl.pattern_ConstructorDec2OperationAnonymous_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Operation feature, org.eclipse.uml2.uml.Class uAnon) {// 
		Object[] result1_black = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_28_1_matchtggpattern_blackBB(feature, uAnon);
		if (result1_black != null) {
			return ConstructorDec2OperationAnonymousImpl.pattern_ConstructorDec2OperationAnonymous_28_2_expressionF();
		} else {
			return ConstructorDec2OperationAnonymousImpl.pattern_ConstructorDec2OperationAnonymous_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNode2Element ba2naParameter) {

		Object[] result1_black = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList ba2naList = (RuleEntryList) result2_black[0];
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_black[1];
			ASTNode2Element ba2na = (ASTNode2Element) result2_black[2];
			org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result2_black[3];

			Object[] result3_bindingAndBlack = ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, mAnon, ba2na, uAnon, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mAnon] = " + mAnon + ", "
						+ "[ba2na] = " + ba2na + ", " + "[uAnon] = " + uAnon + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ConstructorDec2OperationAnonymousImpl
					.pattern_ConstructorDec2OperationAnonymous_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ConstructorDec2OperationAnonymousImpl
						.pattern_ConstructorDec2OperationAnonymous_29_5_checknacs_blackBBB(mAnon, ba2na, uAnon);
				if (result5_black != null) {

					Object[] result6_black = ConstructorDec2OperationAnonymousImpl
							.pattern_ConstructorDec2OperationAnonymous_29_6_perform_blackBBBB(mAnon, ba2na, uAnon,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mAnon] = " + mAnon
								+ ", " + "[ba2na] = " + ba2na + ", " + "[uAnon] = " + uAnon + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					ConstructorDec2OperationAnonymousImpl
							.pattern_ConstructorDec2OperationAnonymous_29_6_perform_greenFFFBFBBB(mAnon, uAnon,
									ruleResult, csp);
					//nothing Operation feature = (Operation) result6_green[0];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[1];
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];
					//nothing MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return ConstructorDec2OperationAnonymousImpl
				.pattern_ConstructorDec2OperationAnonymous_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnon,
			ASTNode2Element ba2na, org.eclipse.uml2.uml.Class uAnon, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAnon", mAnon);
		isApplicableMatch.registerObject("ba2na", ba2na);
		isApplicableMatch.registerObject("uAnon", uAnon);
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
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPROPRIATE_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MCONSTRUCTORDEFINITION:
			return isAppropriate_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MConstructorDefinition) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MCONSTRUCTORDEFINITION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MConstructorDefinition) arguments.get(2));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANONYMOUSCLASSDECLARATION_MCONSTRUCTORDEFINITION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MConstructorDefinition) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATION_MCONSTRUCTORDEFINITION_ASTNODE2ELEMENT_CLASS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1), (MConstructorDefinition) arguments.get(2),
					(ASTNode2Element) arguments.get(3), (org.eclipse.uml2.uml.Class) arguments.get(4));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPROPRIATE_BWD__MATCH_OPERATION_CLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_OPERATION_CLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_OPERATION_CLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_OPERATION_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT_CLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Operation) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_300__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_300((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_309__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_309((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_CC__OPERATION_ANONYMOUSCLASSDECLARATION_MCONSTRUCTORDEFINITION_CLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Operation) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MConstructorDefinition) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___CHECK_DEC_FWD__ANONYMOUSCLASSDECLARATION_MCONSTRUCTORDEFINITION:
			return checkDEC_FWD((AnonymousClassDeclaration) arguments.get(0),
					(MConstructorDefinition) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___CHECK_DEC_BWD__OPERATION_CLASS:
			return checkDEC_BWD((Operation) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT_CLASS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION_ANONYMOUS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_0_1_initialbindings_blackBBBB(
			ConstructorDec2OperationAnonymous _this, Match match, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration) {
		return new Object[] { _this, match, mAnon, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_bindingFBBBB(
			ConstructorDec2OperationAnonymous _this, Match match, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mAnon, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mAnon, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_bindingAndBlackFBBBB(
			ConstructorDec2OperationAnonymous _this, Match match, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_binding = pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_bindingFBBBB(
				_this, match, mAnon, bodyDeclaration);
		if (result_pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_black = pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationAnonymous_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mAnon, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_0_3_CheckCSP_expressionFBB(
			ConstructorDec2OperationAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_0_4_collectelementstobetranslated_blackBBB(
			Match match, AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration) {
		return new Object[] { match, mAnon, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration) {
		EMoflonEdge mAnon__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__mAnon____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		String mAnon__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__mAnon____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		mAnon__bodyDeclaration____bodyDeclarations.setSrc(mAnon);
		mAnon__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(mAnon__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner.setTrg(mAnon);
		match.getToBeTranslatedEdges().add(bodyDeclaration__mAnon____anonymousClassDeclarationOwner);
		mAnon__bodyDeclaration____bodyDeclarations.setName(mAnon__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__mAnon____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { match, mAnon, bodyDeclaration, mAnon__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__mAnon____anonymousClassDeclarationOwner };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_0_5_collectcontextelements_blackBBB(
			Match match, AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration) {
		return new Object[] { match, mAnon, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_0_5_collectcontextelements_greenBB(
			Match match, AnonymousClassDeclaration mAnon) {
		match.getContextNodes().add(mAnon);
		return new Object[] { match, mAnon };
	}

	public static final void pattern_ConstructorDec2OperationAnonymous_0_6_registerobjectstomatch_expressionBBBB(
			ConstructorDec2OperationAnonymous _this, Match match, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, mAnon, bodyDeclaration);

	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mAnon");
		EObject _localVariable_1 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = isApplicableMatch.getObject("ba2na");
		EObject _localVariable_3 = isApplicableMatch.getObject("uAnon");
		EObject tmpMAnon = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpBa2na = _localVariable_2;
		EObject tmpUAnon = _localVariable_3;
		if (tmpMAnon instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
			if (tmpBodyDeclaration instanceof MConstructorDefinition) {
				MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
				if (tmpBa2na instanceof ASTNode2Element) {
					ASTNode2Element ba2na = (ASTNode2Element) tmpBa2na;
					if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
						return new Object[] { mAnon, bodyDeclaration, ba2na, uAnon, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_blackBBBBFBB(
			AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration, ASTNode2Element ba2na,
			org.eclipse.uml2.uml.Class uAnon, ConstructorDec2OperationAnonymous _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mAnon, bodyDeclaration, ba2na, uAnon, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_bindingAndBlackFFFFFBB(
			ConstructorDec2OperationAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_binding = pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_binding != null) {
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result_pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_binding[0];
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result_pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_binding[1];
			ASTNode2Element ba2na = (ASTNode2Element) result_pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result_pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_binding[3];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_black = pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_blackBBBBFBB(
					mAnon, bodyDeclaration, ba2na, uAnon, _this, isApplicableMatch);
			if (result_pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_black[4];

				return new Object[] { mAnon, bodyDeclaration, ba2na, uAnon, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_1_1_performtransformation_greenFFFBBB(
			MConstructorDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uAnon, CSP csp) {
		Operation feature = UMLFactory.eINSTANCE.createOperation();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("feature", "name");
		uAnon.getOwnedOperations().add(feature);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration, uAnon, csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_1_2_collecttranslatedelements_blackBBBB(
			Operation feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MConstructorDefinition bodyDeclaration) {
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_1_2_collecttranslatedelements_greenFBBBB(
			Operation feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MConstructorDefinition bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject b2e, EObject mAnon,
			EObject bodyDeclaration, EObject ba2na, EObject uAnon) {
		if (!feature.equals(mAnon)) {
			if (!feature.equals(uAnon)) {
				if (!bd2ne.equals(feature)) {
					if (!bd2ne.equals(mAnon)) {
						if (!bd2ne.equals(bodyDeclaration)) {
							if (!bd2ne.equals(uAnon)) {
								if (!b2e.equals(feature)) {
									if (!b2e.equals(bd2ne)) {
										if (!b2e.equals(mAnon)) {
											if (!b2e.equals(bodyDeclaration)) {
												if (!b2e.equals(ba2na)) {
													if (!b2e.equals(uAnon)) {
														if (!mAnon.equals(uAnon)) {
															if (!bodyDeclaration.equals(feature)) {
																if (!bodyDeclaration.equals(mAnon)) {
																	if (!bodyDeclaration.equals(uAnon)) {
																		if (!ba2na.equals(feature)) {
																			if (!ba2na.equals(bd2ne)) {
																				if (!ba2na.equals(mAnon)) {
																					if (!ba2na
																							.equals(bodyDeclaration)) {
																						if (!ba2na.equals(uAnon)) {
																							return new Object[] {
																									ruleresult, feature,
																									bd2ne, b2e, mAnon,
																									bodyDeclaration,
																									ba2na, uAnon };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject b2e, EObject mAnon,
			EObject bodyDeclaration, EObject uAnon) {
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uAnon__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uAnon____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__mAnon____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConstructorDec2OperationAnonymous";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String uAnon__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__uAnon____class_name_prime = "class";
		String mAnon__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__mAnon____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		uAnon__feature____ownedOperation.setSrc(uAnon);
		uAnon__feature____ownedOperation.setTrg(feature);
		ruleresult.getCreatedEdges().add(uAnon__feature____ownedOperation);
		feature__uAnon____class.setSrc(feature);
		feature__uAnon____class.setTrg(uAnon);
		ruleresult.getCreatedEdges().add(feature__uAnon____class);
		mAnon__bodyDeclaration____bodyDeclarations.setSrc(mAnon);
		mAnon__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(mAnon__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner.setTrg(mAnon);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__mAnon____anonymousClassDeclarationOwner);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		uAnon__feature____ownedOperation.setName(uAnon__feature____ownedOperation_name_prime);
		feature__uAnon____class.setName(feature__uAnon____class_name_prime);
		mAnon__bodyDeclaration____bodyDeclarations.setName(mAnon__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__mAnon____anonymousClassDeclarationOwner_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, feature, bd2ne, b2e, mAnon, bodyDeclaration, uAnon,
				bd2ne__bodyDeclaration____source, uAnon__feature____ownedOperation, feature__uAnon____class,
				mAnon__bodyDeclaration____bodyDeclarations, bodyDeclaration__mAnon____anonymousClassDeclarationOwner,
				bd2ne__feature____target, b2e__bodyDeclaration____source, b2e__feature____target };
	}

	public static final void pattern_ConstructorDec2OperationAnonymous_1_5_registerobjects_expressionBBBBBBBBB(
			ConstructorDec2OperationAnonymous _this, PerformRuleResult ruleresult, EObject feature, EObject bd2ne,
			EObject b2e, EObject mAnon, EObject bodyDeclaration, EObject ba2na, EObject uAnon) {
		_this.registerObjects_FWD(ruleresult, feature, bd2ne, b2e, mAnon, bodyDeclaration, ba2na, uAnon);

	}

	public static final PerformRuleResult pattern_ConstructorDec2OperationAnonymous_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_bindingFB(
			ConstructorDec2OperationAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_blackFBB(
			EClass eClass, ConstructorDec2OperationAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(
			ConstructorDec2OperationAnonymous _this) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_binding = pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_black = pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ConstructorDec2OperationAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mAnon");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject tmpMAnon = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		if (tmpMAnon instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
			if (tmpBodyDeclaration instanceof MConstructorDefinition) {
				MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
				return new Object[] { mAnon, bodyDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationAnonymous_2_2_corematch_blackBBFFB(
			AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element ba2na : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(mAnon,
				ASTNode2Element.class, "source")) {
			Element tmpUAnon = ba2na.getTarget();
			if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
				_result.add(new Object[] { mAnon, bodyDeclaration, ba2na, uAnon, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationAnonymous_2_3_findcontext_blackBBBB(
			AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration, ASTNode2Element ba2na,
			org.eclipse.uml2.uml.Class uAnon) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnon.equals(ba2na.getSource())) {
			if (mAnon.getBodyDeclarations().contains(bodyDeclaration)) {
				if (uAnon.equals(ba2na.getTarget())) {
					_result.add(new Object[] { mAnon, bodyDeclaration, ba2na, uAnon });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_3_findcontext_greenBBBBFFFFF(
			AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration, ASTNode2Element ba2na,
			org.eclipse.uml2.uml.Class uAnon) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ba2na__mAnon____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__mAnon____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ba2na__uAnon____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ba2na__mAnon____source_name_prime = "source";
		String mAnon__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__mAnon____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String ba2na__uAnon____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mAnon);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(ba2na);
		isApplicableMatch.getAllContextElements().add(uAnon);
		ba2na__mAnon____source.setSrc(ba2na);
		ba2na__mAnon____source.setTrg(mAnon);
		isApplicableMatch.getAllContextElements().add(ba2na__mAnon____source);
		mAnon__bodyDeclaration____bodyDeclarations.setSrc(mAnon);
		mAnon__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(mAnon__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner.setTrg(mAnon);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__mAnon____anonymousClassDeclarationOwner);
		ba2na__uAnon____target.setSrc(ba2na);
		ba2na__uAnon____target.setTrg(uAnon);
		isApplicableMatch.getAllContextElements().add(ba2na__uAnon____target);
		ba2na__mAnon____source.setName(ba2na__mAnon____source_name_prime);
		mAnon__bodyDeclaration____bodyDeclarations.setName(mAnon__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__mAnon____anonymousClassDeclarationOwner_name_prime);
		ba2na__uAnon____target.setName(ba2na__uAnon____target_name_prime);
		return new Object[] { mAnon, bodyDeclaration, ba2na, uAnon, isApplicableMatch, ba2na__mAnon____source,
				mAnon__bodyDeclaration____bodyDeclarations, bodyDeclaration__mAnon____anonymousClassDeclarationOwner,
				ba2na__uAnon____target };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_bindingFBBBBBB(
			ConstructorDec2OperationAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration, ASTNode2Element ba2na,
			org.eclipse.uml2.uml.Class uAnon) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mAnon, bodyDeclaration, ba2na, uAnon);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAnon, bodyDeclaration, ba2na, uAnon };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorDec2OperationAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration, ASTNode2Element ba2na,
			org.eclipse.uml2.uml.Class uAnon) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_binding = pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mAnon, bodyDeclaration, ba2na, uAnon);
		if (result_pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_black = pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationAnonymous_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAnon, bodyDeclaration, ba2na, uAnon };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_2_5_checkCSP_expressionFBB(
			ConstructorDec2OperationAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorDec2OperationAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDec2OperationAnonymous_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_10_1_initialbindings_blackBBBB(
			ConstructorDec2OperationAnonymous _this, Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {
		return new Object[] { _this, match, feature, uAnon };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_bindingFBBBB(
			ConstructorDec2OperationAnonymous _this, Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uAnon);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uAnon };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_bindingAndBlackFBBBB(
			ConstructorDec2OperationAnonymous _this, Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_binding = pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, uAnon);
		if (result_pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_black = pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationAnonymous_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uAnon };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_10_3_CheckCSP_expressionFBB(
			ConstructorDec2OperationAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_10_4_collectelementstobetranslated_blackBBB(
			Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {
		return new Object[] { match, feature, uAnon };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {
		EMoflonEdge uAnon__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uAnon____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String uAnon__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__uAnon____class_name_prime = "class";
		uAnon__feature____ownedOperation.setSrc(uAnon);
		uAnon__feature____ownedOperation.setTrg(feature);
		match.getToBeTranslatedEdges().add(uAnon__feature____ownedOperation);
		feature__uAnon____class.setSrc(feature);
		feature__uAnon____class.setTrg(uAnon);
		match.getToBeTranslatedEdges().add(feature__uAnon____class);
		uAnon__feature____ownedOperation.setName(uAnon__feature____ownedOperation_name_prime);
		feature__uAnon____class.setName(feature__uAnon____class_name_prime);
		return new Object[] { match, feature, uAnon, uAnon__feature____ownedOperation, feature__uAnon____class };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_10_5_collectcontextelements_blackBBB(
			Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {
		return new Object[] { match, feature, uAnon };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_10_5_collectcontextelements_greenBB(
			Match match, org.eclipse.uml2.uml.Class uAnon) {
		match.getContextNodes().add(uAnon);
		return new Object[] { match, uAnon };
	}

	public static final void pattern_ConstructorDec2OperationAnonymous_10_6_registerobjectstomatch_expressionBBBB(
			ConstructorDec2OperationAnonymous _this, Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {
		_this.registerObjectsToMatch_BWD(match, feature, uAnon);

	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnon");
		EObject _localVariable_2 = isApplicableMatch.getObject("ba2na");
		EObject _localVariable_3 = isApplicableMatch.getObject("uAnon");
		EObject tmpFeature = _localVariable_0;
		EObject tmpMAnon = _localVariable_1;
		EObject tmpBa2na = _localVariable_2;
		EObject tmpUAnon = _localVariable_3;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpMAnon instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
				if (tmpBa2na instanceof ASTNode2Element) {
					ASTNode2Element ba2na = (ASTNode2Element) tmpBa2na;
					if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
						return new Object[] { feature, mAnon, ba2na, uAnon, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_blackBBBBFBB(
			Operation feature, AnonymousClassDeclaration mAnon, ASTNode2Element ba2na, org.eclipse.uml2.uml.Class uAnon,
			ConstructorDec2OperationAnonymous _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, mAnon, ba2na, uAnon, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_bindingAndBlackFFFFFBB(
			ConstructorDec2OperationAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_binding = pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_binding != null) {
			Operation feature = (Operation) result_pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_binding[0];
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result_pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_binding[1];
			ASTNode2Element ba2na = (ASTNode2Element) result_pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result_pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_binding[3];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_black = pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_blackBBBBFBB(
					feature, mAnon, ba2na, uAnon, _this, isApplicableMatch);
			if (result_pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_black[4];

				return new Object[] { feature, mAnon, ba2na, uAnon, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_11_1_performtransformation_greenBFFBFB(
			Operation feature, AnonymousClassDeclaration mAnon, CSP csp) {
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MConstructorDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		bd2ne.setTarget(feature);
		b2e.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		mAnon.getBodyDeclarations().add(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { feature, bd2ne, b2e, mAnon, bodyDeclaration, csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_11_2_collecttranslatedelements_blackBBBB(
			Operation feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MConstructorDefinition bodyDeclaration) {
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_11_2_collecttranslatedelements_greenFBBBB(
			Operation feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MConstructorDefinition bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject b2e, EObject mAnon,
			EObject bodyDeclaration, EObject ba2na, EObject uAnon) {
		if (!feature.equals(mAnon)) {
			if (!feature.equals(uAnon)) {
				if (!bd2ne.equals(feature)) {
					if (!bd2ne.equals(mAnon)) {
						if (!bd2ne.equals(bodyDeclaration)) {
							if (!bd2ne.equals(uAnon)) {
								if (!b2e.equals(feature)) {
									if (!b2e.equals(bd2ne)) {
										if (!b2e.equals(mAnon)) {
											if (!b2e.equals(bodyDeclaration)) {
												if (!b2e.equals(ba2na)) {
													if (!b2e.equals(uAnon)) {
														if (!mAnon.equals(uAnon)) {
															if (!bodyDeclaration.equals(feature)) {
																if (!bodyDeclaration.equals(mAnon)) {
																	if (!bodyDeclaration.equals(uAnon)) {
																		if (!ba2na.equals(feature)) {
																			if (!ba2na.equals(bd2ne)) {
																				if (!ba2na.equals(mAnon)) {
																					if (!ba2na
																							.equals(bodyDeclaration)) {
																						if (!ba2na.equals(uAnon)) {
																							return new Object[] {
																									ruleresult, feature,
																									bd2ne, b2e, mAnon,
																									bodyDeclaration,
																									ba2na, uAnon };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject b2e, EObject mAnon,
			EObject bodyDeclaration, EObject uAnon) {
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uAnon__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uAnon____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__mAnon____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConstructorDec2OperationAnonymous";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String uAnon__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__uAnon____class_name_prime = "class";
		String mAnon__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__mAnon____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		uAnon__feature____ownedOperation.setSrc(uAnon);
		uAnon__feature____ownedOperation.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uAnon__feature____ownedOperation);
		feature__uAnon____class.setSrc(feature);
		feature__uAnon____class.setTrg(uAnon);
		ruleresult.getTranslatedEdges().add(feature__uAnon____class);
		mAnon__bodyDeclaration____bodyDeclarations.setSrc(mAnon);
		mAnon__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(mAnon__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner.setSrc(bodyDeclaration);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner.setTrg(mAnon);
		ruleresult.getCreatedEdges().add(bodyDeclaration__mAnon____anonymousClassDeclarationOwner);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		uAnon__feature____ownedOperation.setName(uAnon__feature____ownedOperation_name_prime);
		feature__uAnon____class.setName(feature__uAnon____class_name_prime);
		mAnon__bodyDeclaration____bodyDeclarations.setName(mAnon__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__mAnon____anonymousClassDeclarationOwner
				.setName(bodyDeclaration__mAnon____anonymousClassDeclarationOwner_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, feature, bd2ne, b2e, mAnon, bodyDeclaration, uAnon,
				bd2ne__bodyDeclaration____source, uAnon__feature____ownedOperation, feature__uAnon____class,
				mAnon__bodyDeclaration____bodyDeclarations, bodyDeclaration__mAnon____anonymousClassDeclarationOwner,
				bd2ne__feature____target, b2e__bodyDeclaration____source, b2e__feature____target };
	}

	public static final void pattern_ConstructorDec2OperationAnonymous_11_5_registerobjects_expressionBBBBBBBBB(
			ConstructorDec2OperationAnonymous _this, PerformRuleResult ruleresult, EObject feature, EObject bd2ne,
			EObject b2e, EObject mAnon, EObject bodyDeclaration, EObject ba2na, EObject uAnon) {
		_this.registerObjects_BWD(ruleresult, feature, bd2ne, b2e, mAnon, bodyDeclaration, ba2na, uAnon);

	}

	public static final PerformRuleResult pattern_ConstructorDec2OperationAnonymous_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_bindingFB(
			ConstructorDec2OperationAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_blackFBB(
			EClass eClass, ConstructorDec2OperationAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(
			ConstructorDec2OperationAnonymous _this) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_binding = pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_black = pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ConstructorDec2OperationAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uAnon");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUAnon = _localVariable_1;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
				return new Object[] { feature, uAnon, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationAnonymous_12_2_corematch_blackBFFBB(
			Operation feature, org.eclipse.uml2.uml.Class uAnon, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element ba2na : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(uAnon,
				ASTNode2Element.class, "target")) {
			ASTNode tmpMAnon = ba2na.getSource();
			if (tmpMAnon instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
				_result.add(new Object[] { feature, mAnon, ba2na, uAnon, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationAnonymous_12_3_findcontext_blackBBBB(
			Operation feature, AnonymousClassDeclaration mAnon, ASTNode2Element ba2na,
			org.eclipse.uml2.uml.Class uAnon) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mAnon.equals(ba2na.getSource())) {
			if (uAnon.getOwnedOperations().contains(feature)) {
				if (uAnon.equals(ba2na.getTarget())) {
					_result.add(new Object[] { feature, mAnon, ba2na, uAnon });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_3_findcontext_greenBBBBFFFFF(
			Operation feature, AnonymousClassDeclaration mAnon, ASTNode2Element ba2na,
			org.eclipse.uml2.uml.Class uAnon) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ba2na__mAnon____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uAnon__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__uAnon____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ba2na__uAnon____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ba2na__mAnon____source_name_prime = "source";
		String uAnon__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__uAnon____class_name_prime = "class";
		String ba2na__uAnon____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(mAnon);
		isApplicableMatch.getAllContextElements().add(ba2na);
		isApplicableMatch.getAllContextElements().add(uAnon);
		ba2na__mAnon____source.setSrc(ba2na);
		ba2na__mAnon____source.setTrg(mAnon);
		isApplicableMatch.getAllContextElements().add(ba2na__mAnon____source);
		uAnon__feature____ownedOperation.setSrc(uAnon);
		uAnon__feature____ownedOperation.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uAnon__feature____ownedOperation);
		feature__uAnon____class.setSrc(feature);
		feature__uAnon____class.setTrg(uAnon);
		isApplicableMatch.getAllContextElements().add(feature__uAnon____class);
		ba2na__uAnon____target.setSrc(ba2na);
		ba2na__uAnon____target.setTrg(uAnon);
		isApplicableMatch.getAllContextElements().add(ba2na__uAnon____target);
		ba2na__mAnon____source.setName(ba2na__mAnon____source_name_prime);
		uAnon__feature____ownedOperation.setName(uAnon__feature____ownedOperation_name_prime);
		feature__uAnon____class.setName(feature__uAnon____class_name_prime);
		ba2na__uAnon____target.setName(ba2na__uAnon____target_name_prime);
		return new Object[] { feature, mAnon, ba2na, uAnon, isApplicableMatch, ba2na__mAnon____source,
				uAnon__feature____ownedOperation, feature__uAnon____class, ba2na__uAnon____target };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_bindingFBBBBBB(
			ConstructorDec2OperationAnonymous _this, IsApplicableMatch isApplicableMatch, Operation feature,
			AnonymousClassDeclaration mAnon, ASTNode2Element ba2na, org.eclipse.uml2.uml.Class uAnon) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, mAnon, ba2na, uAnon);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, mAnon, ba2na, uAnon };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorDec2OperationAnonymous _this, IsApplicableMatch isApplicableMatch, Operation feature,
			AnonymousClassDeclaration mAnon, ASTNode2Element ba2na, org.eclipse.uml2.uml.Class uAnon) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_binding = pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, feature, mAnon, ba2na, uAnon);
		if (result_pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_black = pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationAnonymous_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, mAnon, ba2na, uAnon };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_12_5_checkCSP_expressionFBB(
			ConstructorDec2OperationAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorDec2OperationAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDec2OperationAnonymous_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_bindingFB(
			ConstructorDec2OperationAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ConstructorDec2OperationAnonymous _this) {
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

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ConstructorDec2OperationAnonymous _this) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_binding = pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_black = pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_20_2_testcorematchandDECs_black_nac_0B(
			Operation feature) {
		DataType __DEC_feature_ownedOperation_378672 = feature.getDatatype();
		if (__DEC_feature_ownedOperation_378672 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_20_2_testcorematchandDECs_black_nac_1B(
			Operation feature) {
		Interface __DEC_feature_ownedOperation_510243 = feature.getInterface();
		if (__DEC_feature_ownedOperation_510243 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationAnonymous_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedOperation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUAnon = _edge_ownedOperation.getSrc();
		if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
			EObject tmpFeature = _edge_ownedOperation.getTrg();
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				if (uAnon.getOwnedOperations().contains(feature)) {
					if (pattern_ConstructorDec2OperationAnonymous_20_2_testcorematchandDECs_black_nac_0B(
							feature) == null) {
						if (pattern_ConstructorDec2OperationAnonymous_20_2_testcorematchandDECs_black_nac_1B(
								feature) == null) {
							_result.add(new Object[] { feature, uAnon, _edge_ownedOperation });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ConstructorDec2OperationAnonymous _this, Match match, Operation feature, org.eclipse.uml2.uml.Class uAnon) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uAnon);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConstructorDec2OperationAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConstructorDec2OperationAnonymous_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_bindingFB(
			ConstructorDec2OperationAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ConstructorDec2OperationAnonymous _this) {
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

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ConstructorDec2OperationAnonymous _this) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_binding = pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_black = pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_21_2_testcorematchandDECs_black_nac_0B(
			MConstructorDefinition bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_725498 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_725498 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_21_2_testcorematchandDECs_black_nac_1B(
			MConstructorDefinition bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_530107 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_530107 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationAnonymous_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMAnon = _edge_bodyDeclarations.getSrc();
		if (tmpMAnon instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
			EObject tmpBodyDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpBodyDeclaration instanceof MConstructorDefinition) {
				MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
				if (mAnon.getBodyDeclarations().contains(bodyDeclaration)) {
					if (pattern_ConstructorDec2OperationAnonymous_21_2_testcorematchandDECs_black_nac_0B(
							bodyDeclaration) == null) {
						if (pattern_ConstructorDec2OperationAnonymous_21_2_testcorematchandDECs_black_nac_1B(
								bodyDeclaration) == null) {
							_result.add(new Object[] { mAnon, bodyDeclaration, _edge_bodyDeclarations });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ConstructorDec2OperationAnonymous _this, Match match, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mAnon, bodyDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConstructorDec2OperationAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConstructorDec2OperationAnonymous_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_1_prepare_blackB(
			ConstructorDec2OperationAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("mAnon");
		EObject _localVariable_2 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = targetMatch.getObject("uAnon");
		EObject tmpFeature = _localVariable_0;
		EObject tmpMAnon = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpUAnon = _localVariable_3;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpMAnon instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
				if (tmpBodyDeclaration instanceof MConstructorDefinition) {
					MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
					if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
						return new Object[] { feature, mAnon, bodyDeclaration, uAnon, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_blackBBBBBB(
			Operation feature, AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration,
			org.eclipse.uml2.uml.Class uAnon, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, mAnon, bodyDeclaration, uAnon, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_binding = pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_binding != null) {
			Operation feature = (Operation) result_pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_binding[0];
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result_pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_binding[1];
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result_pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) result_pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_black = pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_blackBBBBBB(
					feature, mAnon, bodyDeclaration, uAnon, sourceMatch, targetMatch);
			if (result_pattern_ConstructorDec2OperationAnonymous_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, mAnon, bodyDeclaration, uAnon, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_bindingFBBBBBBB(
			ConstructorDec2OperationAnonymous _this, Operation feature, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uAnon, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(feature, mAnon, bodyDeclaration, uAnon, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, feature, mAnon, bodyDeclaration, uAnon, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			ConstructorDec2OperationAnonymous _this, Operation feature, AnonymousClassDeclaration mAnon,
			MConstructorDefinition bodyDeclaration, org.eclipse.uml2.uml.Class uAnon, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_binding = pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_bindingFBBBBBBB(
				_this, feature, mAnon, bodyDeclaration, uAnon, sourceMatch, targetMatch);
		if (result_pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_binding[0];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_black = pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationAnonymous_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, mAnon, bodyDeclaration, uAnon, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationAnonymous_24_5_matchcorrcontext_blackBFBBB(
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uAnon, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element ba2na : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(mAnon,
					ASTNode2Element.class, "source")) {
				if (uAnon.equals(ba2na.getTarget())) {
					_result.add(new Object[] { mAnon, ba2na, uAnon, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_5_matchcorrcontext_greenBBBF(
			ASTNode2Element ba2na, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ConstructorDec2OperationAnonymous";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ba2na);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ba2na, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_6_createcorrespondence_blackBBBBB(
			Operation feature, AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration,
			org.eclipse.uml2.uml.Class uAnon, CCMatch ccMatch) {
		return new Object[] { feature, mAnon, bodyDeclaration, uAnon, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_6_createcorrespondence_greenBFFBB(
			Operation feature, MConstructorDefinition bodyDeclaration, CCMatch ccMatch) {
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		ccMatch.getCreateCorr().add(bd2ne);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ConstructorDec2OperationAnonymous";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDec2OperationAnonymous_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_27_1_matchtggpattern_black_nac_0B(
			MConstructorDefinition bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_244937 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_244937 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_27_1_matchtggpattern_black_nac_1B(
			MConstructorDefinition bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_66915 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_66915 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_27_1_matchtggpattern_blackBB(
			AnonymousClassDeclaration mAnon, MConstructorDefinition bodyDeclaration) {
		if (mAnon.getBodyDeclarations().contains(bodyDeclaration)) {
			if (pattern_ConstructorDec2OperationAnonymous_27_1_matchtggpattern_black_nac_0B(bodyDeclaration) == null) {
				if (pattern_ConstructorDec2OperationAnonymous_27_1_matchtggpattern_black_nac_1B(
						bodyDeclaration) == null) {
					return new Object[] { mAnon, bodyDeclaration };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_28_1_matchtggpattern_black_nac_0B(
			Operation feature) {
		DataType __DEC_feature_ownedOperation_471740 = feature.getDatatype();
		if (__DEC_feature_ownedOperation_471740 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_28_1_matchtggpattern_black_nac_1B(
			Operation feature) {
		Interface __DEC_feature_ownedOperation_84938 = feature.getInterface();
		if (__DEC_feature_ownedOperation_84938 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_28_1_matchtggpattern_blackBB(
			Operation feature, org.eclipse.uml2.uml.Class uAnon) {
		if (uAnon.getOwnedOperations().contains(feature)) {
			if (pattern_ConstructorDec2OperationAnonymous_28_1_matchtggpattern_black_nac_0B(feature) == null) {
				if (pattern_ConstructorDec2OperationAnonymous_28_1_matchtggpattern_black_nac_1B(feature) == null) {
					return new Object[] { feature, uAnon };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_1_createresult_blackB(
			ConstructorDec2OperationAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration mAnon) {
		if (ruleResult.getSourceObjects().contains(mAnon)) {
			return new Object[] { ruleResult, mAnon };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ba2na) {
		if (ruleResult.getCorrObjects().contains(ba2na)) {
			return new Object[] { ruleResult, ba2na };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uAnon) {
		if (ruleResult.getTargetObjects().contains(uAnon)) {
			return new Object[] { ruleResult, uAnon };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2OperationAnonymous_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ba2naList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpBa2na : ba2naList.getEntryObjects()) {
				if (tmpBa2na instanceof ASTNode2Element) {
					ASTNode2Element ba2na = (ASTNode2Element) tmpBa2na;
					ASTNode tmpMAnon = ba2na.getSource();
					if (tmpMAnon instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
						Element tmpUAnon = ba2na.getTarget();
						if (tmpUAnon instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uAnon = (org.eclipse.uml2.uml.Class) tmpUAnon;
							if (pattern_ConstructorDec2OperationAnonymous_29_2_isapplicablecore_black_nac_1BB(
									ruleResult, ba2na) == null) {
								if (pattern_ConstructorDec2OperationAnonymous_29_2_isapplicablecore_black_nac_0BB(
										ruleResult, mAnon) == null) {
									if (pattern_ConstructorDec2OperationAnonymous_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, uAnon) == null) {
										_result.add(new Object[] { ba2naList, mAnon, ba2na, uAnon, ruleEntryContainer,
												ruleResult });
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

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_bindingFBBBBBB(
			ConstructorDec2OperationAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclaration mAnon, ASTNode2Element ba2na, org.eclipse.uml2.uml.Class uAnon,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mAnon, ba2na, uAnon, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAnon, ba2na, uAnon, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorDec2OperationAnonymous _this, IsApplicableMatch isApplicableMatch,
			AnonymousClassDeclaration mAnon, ASTNode2Element ba2na, org.eclipse.uml2.uml.Class uAnon,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_binding = pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mAnon, ba2na, uAnon, ruleResult);
		if (result_pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_black = pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2OperationAnonymous_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAnon, ba2na, uAnon, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2OperationAnonymous_29_4_checkCSP_expressionFBB(
			ConstructorDec2OperationAnonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_5_checknacs_blackBBB(
			AnonymousClassDeclaration mAnon, ASTNode2Element ba2na, org.eclipse.uml2.uml.Class uAnon) {
		return new Object[] { mAnon, ba2na, uAnon };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_6_perform_blackBBBB(
			AnonymousClassDeclaration mAnon, ASTNode2Element ba2na, org.eclipse.uml2.uml.Class uAnon,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mAnon, ba2na, uAnon, ruleResult };
	}

	public static final Object[] pattern_ConstructorDec2OperationAnonymous_29_6_perform_greenFFFBFBBB(
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uAnon, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		Operation feature = UMLFactory.eINSTANCE.createOperation();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MConstructorDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("bodyDeclaration", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		uAnon.getOwnedOperations().add(feature);
		ruleResult.getTargetObjects().add(feature);
		bd2ne.setTarget(feature);
		ruleResult.getCorrObjects().add(bd2ne);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		bd2ne.setSource(bodyDeclaration);
		mAnon.getBodyDeclarations().add(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		String feature_name_prime = (String) _localVariable_0;
		String bodyDeclaration_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		feature.setName(feature_name_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { feature, bd2ne, b2e, mAnon, bodyDeclaration, uAnon, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ConstructorDec2OperationAnonymous_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConstructorDec2OperationAnonymousImpl
