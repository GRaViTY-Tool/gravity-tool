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
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InInterface;
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
 * An implementation of the model object '<em><b>Inner Class Declaration2 Inner Class In Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InnerClassDeclaration2InnerClass_InInterfaceImpl extends AbstractRuleImpl
		implements InnerClassDeclaration2InnerClass_InInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerClassDeclaration2InnerClass_InInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInnerClassDeclaration2InnerClass_InInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MClass bodyDeclaration, AbstractTypeDeclaration jContainer) {

		Object[] result1_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_0_1_initialbindings_blackBBBB(this, match,
						bodyDeclaration, jContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = "
					+ jContainer + ".");
		}

		Object[] result2_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
						bodyDeclaration, jContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = "
					+ jContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_0_4_collectelementstobetranslated_blackBBB(
							match, bodyDeclaration, jContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = " + jContainer + ".");
			}
			InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_0_4_collectelementstobetranslated_greenBBBFF(
							match, bodyDeclaration, jContainer);
			//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_0_5_collectcontextelements_blackBBB(match,
							bodyDeclaration, jContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jContainer] = " + jContainer + ".");
			}
			InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_0_5_collectcontextelements_greenBB(match,
							jContainer);

			// 
			InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_0_6_registerobjectstomatch_expressionBBBB(
							this, match, bodyDeclaration, jContainer);
			return InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_0_7_expressionF();
		} else {
			return InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_bindingAndBlackFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MClass bodyDeclaration = (MClass) result1_bindingAndBlack[0];
		Interface uContainer = (Interface) result1_bindingAndBlack[1];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result1_bindingAndBlack[2];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_greenFFFBBB(
						bodyDeclaration, uContainer, csp);
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_green[0];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];

		Object[] result2_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_1_2_collecttranslatedelements_blackBBBB(feature,
						bd2ne, b2e, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne
							+ ", " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_1_2_collecttranslatedelements_greenFBBBB(feature,
						bd2ne, b2e, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
						feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer, ne2ne);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", "
					+ "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ".");
		}
		InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
						ruleresult, feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer);
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[13];

		// 
		// 
		InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_1_5_registerobjects_expressionBBBBBBBBB(this,
						ruleresult, feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer, ne2ne);
		return InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MClass bodyDeclaration = (MClass) result2_binding[0];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_2_2_corematch_blackBFBFB(bodyDeclaration,
						jContainer, match)) {
			Interface uContainer = (Interface) result2_black[1];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_2_3_findcontext_blackBBBB(bodyDeclaration,
							uContainer, jContainer, ne2ne)) {
				Object[] result3_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_2_3_findcontext_greenBBBBFFFFF(
								bodyDeclaration, uContainer, jContainer, ne2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, bodyDeclaration, uContainer, jContainer, ne2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", " + "[jContainer] = "
							+ jContainer + ", " + "[ne2ne] = " + ne2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
							.pattern_InnerClassDeclaration2InnerClass_InInterface_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerClassDeclaration2InnerClass_InInterfaceImpl
							.pattern_InnerClassDeclaration2InnerClass_InInterface_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MClass bodyDeclaration, AbstractTypeDeclaration jContainer) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("jContainer", jContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MClass bodyDeclaration, AbstractTypeDeclaration jContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MClass bodyDeclaration,
			Interface uContainer, AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne) {// Create CSP
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
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
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
			EObject bodyDeclaration, EObject uContainer, EObject jContainer, EObject ne2ne) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("ne2ne", ne2ne);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
				.equals("modisco.MClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Class feature, Interface uContainer) {

		Object[] result1_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_10_1_initialbindings_blackBBBB(this, match,
						feature, uContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
		}

		Object[] result2_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match,
						feature, uContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_10_4_collectelementstobetranslated_blackBBB(
							match, feature, uContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
			}
			InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_10_4_collectelementstobetranslated_greenBBBF(
							match, feature, uContainer);
			//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_10_5_collectcontextelements_blackBBB(match,
							feature, uContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
			}
			InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_10_5_collectcontextelements_greenBB(match,
							uContainer);

			// 
			InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_10_6_registerobjectstomatch_expressionBBBB(
							this, match, feature, uContainer);
			return InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_10_7_expressionF();
		} else {
			return InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_bindingAndBlackFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		Interface uContainer = (Interface) result1_bindingAndBlack[1];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result1_bindingAndBlack[2];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_greenBFFFBB(feature,
						jContainer, csp);
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];
		MClass bodyDeclaration = (MClass) result1_green[3];

		Object[] result2_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_11_2_collecttranslatedelements_blackBBBB(feature,
						bd2ne, b2e, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne
							+ ", " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_11_2_collecttranslatedelements_greenFBBBB(feature,
						bd2ne, b2e, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
						feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer, ne2ne);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", "
					+ "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ".");
		}
		InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
						ruleresult, feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer);
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[13];

		// 
		// 
		InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_11_5_registerobjects_expressionBBBBBBBBB(this,
						ruleresult, feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer, ne2ne);
		return InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_binding[0];
		Interface uContainer = (Interface) result2_binding[1];
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_12_2_corematch_blackBBFFB(feature, uContainer,
						match)) {
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[2];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_12_3_findcontext_blackBBBB(feature,
							uContainer, jContainer, ne2ne)) {
				Object[] result3_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_12_3_findcontext_greenBBBBFFFF(feature,
								uContainer, jContainer, ne2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, feature, uContainer, jContainer, ne2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", "
							+ "[ne2ne] = " + ne2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
							.pattern_InnerClassDeclaration2InnerClass_InInterface_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerClassDeclaration2InnerClass_InInterfaceImpl
							.pattern_InnerClassDeclaration2InnerClass_InInterface_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Class feature, Interface uContainer) {
		match.registerObject("feature", feature);
		match.registerObject("uContainer", uContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Class feature, Interface uContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class feature,
			Interface uContainer, AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne) {// Create CSP
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
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
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
			EObject bodyDeclaration, EObject uContainer, EObject jContainer, EObject ne2ne) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("ne2ne", ne2ne);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass()).equals("uml.Class.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(EMoflonEdge _edge_nestedClassifier) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_20_2_testcorematchandDECs_blackFFB(
						_edge_nestedClassifier)) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_black[0];
			Interface uContainer = (Interface) result2_black[1];
			Object[] result2_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, uContainer)) {
				// 
				if (InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
							.pattern_InnerClassDeclaration2InnerClass_InInterface_20_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerClassDeclaration2InnerClass_InInterfaceImpl
							.pattern_InnerClassDeclaration2InnerClass_InInterface_20_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_3(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_blackFFB(
						_edge_bodyDeclarations)) {
			MClass bodyDeclaration = (MClass) result2_black[0];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, bodyDeclaration, jContainer)) {
				// 
				if (InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
							.pattern_InnerClassDeclaration2InnerClass_InInterface_21_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerClassDeclaration2InnerClass_InInterfaceImpl
							.pattern_InnerClassDeclaration2InnerClass_InInterface_21_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InnerClassDeclaration2InnerClass_InInterface");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("InnerClassDeclaration2InnerClass_InInterface");
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
		ruleResult.setRule("InnerClassDeclaration2InnerClass_InInterface");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("InnerClassDeclaration2InnerClass_InInterface");
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

		Object[] result1_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[0];
		MClass bodyDeclaration = (MClass) result2_bindingAndBlack[1];
		Interface uContainer = (Interface) result2_bindingAndBlack[2];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_bindingAndBlackFBBBBBBB(this,
						feature, bodyDeclaration, uContainer, jContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_24_5_matchcorrcontext_blackBBFBB(uContainer,
							jContainer, sourceMatch, targetMatch)) {
				NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result5_black[2];
				Object[] result5_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_24_5_matchcorrcontext_greenBBBF(ne2ne,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_24_6_createcorrespondence_blackBBBBB(
								feature, bodyDeclaration, uContainer, jContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[uContainer] = " + uContainer
							+ ", " + "[jContainer] = " + jContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_24_6_createcorrespondence_greenBFFBB(
								feature, bodyDeclaration, ccMatch);
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[1];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];

				Object[] result7_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_24_7_addtoreturnedresult_blackBB(result,
								ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_24_7_addtoreturnedresult_greenBB(result,
								ccMatch);

			}

		} else {
		}
		return InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration,
			Interface uContainer, AbstractTypeDeclaration jContainer, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MClass bodyDeclaration, AbstractTypeDeclaration jContainer) {// 
		Object[] result1_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_27_1_matchtggpattern_blackBB(bodyDeclaration,
						jContainer);
		if (result1_black != null) {
			return InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_27_2_expressionF();
		} else {
			return InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Class feature, Interface uContainer) {// 
		Object[] result1_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_28_1_matchtggpattern_blackBB(feature, uContainer);
		if (result1_black != null) {
			return InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_28_2_expressionF();
		} else {
			return InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement ne2neParameter) {

		Object[] result1_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_29_2_isapplicablecore_blackFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList ne2neList = (RuleEntryList) result2_black[0];
			Interface uContainer = (Interface) result2_black[1];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[2];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[3];

			Object[] result3_bindingAndBlack = InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, uContainer, jContainer, ne2ne, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uContainer] = " + uContainer + ", "
						+ "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InnerClassDeclaration2InnerClass_InInterfaceImpl
					.pattern_InnerClassDeclaration2InnerClass_InInterface_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
						.pattern_InnerClassDeclaration2InnerClass_InInterface_29_5_checknacs_blackBBB(uContainer,
								jContainer, ne2ne);
				if (result5_black != null) {

					Object[] result6_black = InnerClassDeclaration2InnerClass_InInterfaceImpl
							.pattern_InnerClassDeclaration2InnerClass_InInterface_29_6_perform_blackBBBB(uContainer,
									jContainer, ne2ne, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uContainer] = "
								+ uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					InnerClassDeclaration2InnerClass_InInterfaceImpl
							.pattern_InnerClassDeclaration2InnerClass_InInterface_29_6_perform_greenFFFFBBBB(uContainer,
									jContainer, ruleResult, csp);
					//nothing org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result6_green[0];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[1];
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];
					//nothing MClass bodyDeclaration = (MClass) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return InnerClassDeclaration2InnerClass_InInterfaceImpl
				.pattern_InnerClassDeclaration2InnerClass_InInterface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Interface uContainer,
			AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
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
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPROPRIATE_FWD__MATCH_MCLASS_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCLASS_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCLASS_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MCLASS_INTERFACE_ABSTRACTTYPEDECLARATION_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MClass) arguments.get(1),
					(Interface) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(NamedElement2NamedElement) arguments.get(4));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPROPRIATE_BWD__MATCH_CLASS_INTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Interface) arguments.get(2));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASS_INTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Interface) arguments.get(2));
			return null;
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASS_INTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Interface) arguments.get(2));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_INTERFACE_ABSTRACTTYPEDECLARATION_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (Interface) arguments.get(2),
					(AbstractTypeDeclaration) arguments.get(3), (NamedElement2NamedElement) arguments.get(4));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__CLASS_MCLASS_INTERFACE_ABSTRACTTYPEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Class) arguments.get(0), (MClass) arguments.get(1),
					(Interface) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___CHECK_DEC_FWD__MCLASS_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((MClass) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___CHECK_DEC_BWD__CLASS_INTERFACE:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0), (Interface) arguments.get(1));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (NamedElement2NamedElement) arguments.get(1));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACE_ABSTRACTTYPEDECLARATION_NAMEDELEMENT2NAMEDELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Interface) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (NamedElement2NamedElement) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_0_1_initialbindings_blackBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match, MClass bodyDeclaration,
			AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { _this, match, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_bindingFBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match, MClass bodyDeclaration,
			AbstractTypeDeclaration jContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, jContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_bindingAndBlackFBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match, MClass bodyDeclaration,
			AbstractTypeDeclaration jContainer) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, jContainer);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_black = pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, jContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_0_3_CheckCSP_expressionFBB(
			InnerClassDeclaration2InnerClass_InInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_0_4_collectelementstobetranslated_blackBBB(
			Match match, MClass bodyDeclaration, AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { match, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, MClass bodyDeclaration, AbstractTypeDeclaration jContainer) {
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_0_5_collectcontextelements_blackBBB(
			Match match, MClass bodyDeclaration, AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { match, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_0_5_collectcontextelements_greenBB(
			Match match, AbstractTypeDeclaration jContainer) {
		match.getContextNodes().add(jContainer);
		return new Object[] { match, jContainer };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InInterface_0_6_registerobjectstomatch_expressionBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match, MClass bodyDeclaration,
			AbstractTypeDeclaration jContainer) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, jContainer);

	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_2 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("ne2ne");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		EObject tmpJContainer = _localVariable_2;
		EObject tmpNe2ne = _localVariable_3;
		if (tmpBodyDeclaration instanceof MClass) {
			MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
			if (tmpUContainer instanceof Interface) {
				Interface uContainer = (Interface) tmpUContainer;
				if (tmpJContainer instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
					if (tmpNe2ne instanceof NamedElement2NamedElement) {
						NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
						return new Object[] { bodyDeclaration, uContainer, jContainer, ne2ne, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_blackBBBBFBB(
			MClass bodyDeclaration, Interface uContainer, AbstractTypeDeclaration jContainer,
			NamedElement2NamedElement ne2ne, InnerClassDeclaration2InnerClass_InInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!bodyDeclaration.equals(jContainer)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { bodyDeclaration, uContainer, jContainer, ne2ne, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_bindingAndBlackFFFFFBB(
			InnerClassDeclaration2InnerClass_InInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_binding != null) {
			MClass bodyDeclaration = (MClass) result_pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_binding[0];
			Interface uContainer = (Interface) result_pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_binding[1];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_binding[2];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_binding[3];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_black = pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_blackBBBBFBB(
					bodyDeclaration, uContainer, jContainer, ne2ne, _this, isApplicableMatch);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_black[4];

				return new Object[] { bodyDeclaration, uContainer, jContainer, ne2ne, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_1_1_performtransformation_greenFFFBBB(
			MClass bodyDeclaration, Interface uContainer, CSP csp) {
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("feature", "name");
		uContainer.getNestedClassifiers().add(feature);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration, uContainer, csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_1_2_collecttranslatedelements_blackBBBB(
			org.eclipse.uml2.uml.Class feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MClass bodyDeclaration) {
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_1_2_collecttranslatedelements_greenFBBBB(
			org.eclipse.uml2.uml.Class feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MClass bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject b2e, EObject bodyDeclaration,
			EObject uContainer, EObject jContainer, EObject ne2ne) {
		if (!feature.equals(uContainer)) {
			if (!feature.equals(jContainer)) {
				if (!feature.equals(ne2ne)) {
					if (!bd2ne.equals(feature)) {
						if (!bd2ne.equals(bodyDeclaration)) {
							if (!bd2ne.equals(uContainer)) {
								if (!bd2ne.equals(jContainer)) {
									if (!bd2ne.equals(ne2ne)) {
										if (!b2e.equals(feature)) {
											if (!b2e.equals(bd2ne)) {
												if (!b2e.equals(bodyDeclaration)) {
													if (!b2e.equals(uContainer)) {
														if (!b2e.equals(jContainer)) {
															if (!b2e.equals(ne2ne)) {
																if (!bodyDeclaration.equals(feature)) {
																	if (!bodyDeclaration.equals(uContainer)) {
																		if (!bodyDeclaration.equals(jContainer)) {
																			if (!bodyDeclaration.equals(ne2ne)) {
																				if (!jContainer.equals(uContainer)) {
																					if (!jContainer.equals(ne2ne)) {
																						if (!ne2ne.equals(uContainer)) {
																							return new Object[] {
																									ruleresult, feature,
																									bd2ne, b2e,
																									bodyDeclaration,
																									uContainer,
																									jContainer, ne2ne };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject b2e, EObject bodyDeclaration,
			EObject uContainer, EObject jContainer) {
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerClassDeclaration2InnerClass_InInterface";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String b2e__feature____target_name_prime = "target";
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getCreatedEdges().add(uContainer__feature____nestedClassifier);
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__jContainer____abstractTypeDeclaration);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____abstractTypeDeclaration
				.setName(bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer,
				bd2ne__bodyDeclaration____source, bd2ne__feature____target, b2e__bodyDeclaration____source,
				uContainer__feature____nestedClassifier, jContainer__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jContainer____abstractTypeDeclaration, b2e__feature____target };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InInterface_1_5_registerobjects_expressionBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, PerformRuleResult ruleresult, EObject feature,
			EObject bd2ne, EObject b2e, EObject bodyDeclaration, EObject uContainer, EObject jContainer,
			EObject ne2ne) {
		_this.registerObjects_FWD(ruleresult, feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer, ne2ne);

	}

	public static final PerformRuleResult pattern_InnerClassDeclaration2InnerClass_InInterface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_bindingFB(
			InnerClassDeclaration2InnerClass_InInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerClassDeclaration2InnerClass_InInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_bindingAndBlackFFB(
			InnerClassDeclaration2InnerClass_InInterface _this) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_black = pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerClassDeclaration2InnerClass_InInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_2_corematch_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("jContainer");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpJContainer = _localVariable_1;
		if (tmpBodyDeclaration instanceof MClass) {
			MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
			if (tmpJContainer instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
				return new Object[] { bodyDeclaration, jContainer, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InInterface_2_2_corematch_blackBFBFB(
			MClass bodyDeclaration, AbstractTypeDeclaration jContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!bodyDeclaration.equals(jContainer)) {
			for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jContainer, NamedElement2NamedElement.class, "source")) {
				NamedElement tmpUContainer = ne2ne.getTarget();
				if (tmpUContainer instanceof Interface) {
					Interface uContainer = (Interface) tmpUContainer;
					_result.add(new Object[] { bodyDeclaration, uContainer, jContainer, ne2ne, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InInterface_2_3_findcontext_blackBBBB(
			MClass bodyDeclaration, Interface uContainer, AbstractTypeDeclaration jContainer,
			NamedElement2NamedElement ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!bodyDeclaration.equals(jContainer)) {
			if (jContainer.equals(ne2ne.getSource())) {
				if (jContainer.getBodyDeclarations().contains(bodyDeclaration)) {
					if (uContainer.equals(ne2ne.getTarget())) {
						_result.add(new Object[] { bodyDeclaration, uContainer, jContainer, ne2ne });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_3_findcontext_greenBBBBFFFFF(
			MClass bodyDeclaration, Interface uContainer, AbstractTypeDeclaration jContainer,
			NamedElement2NamedElement ne2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2ne__jContainer____source_name_prime = "source";
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String ne2ne__uContainer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__jContainer____abstractTypeDeclaration);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____abstractTypeDeclaration
				.setName(bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		return new Object[] { bodyDeclaration, uContainer, jContainer, ne2ne, isApplicableMatch,
				ne2ne__jContainer____source, jContainer__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jContainer____abstractTypeDeclaration, ne2ne__uContainer____target };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_bindingFBBBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, IsApplicableMatch isApplicableMatch,
			MClass bodyDeclaration, Interface uContainer, AbstractTypeDeclaration jContainer,
			NamedElement2NamedElement ne2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration, uContainer,
				jContainer, ne2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, uContainer, jContainer, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_bindingAndBlackFBBBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, IsApplicableMatch isApplicableMatch,
			MClass bodyDeclaration, Interface uContainer, AbstractTypeDeclaration jContainer,
			NamedElement2NamedElement ne2ne) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, bodyDeclaration, uContainer, jContainer, ne2ne);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_black = pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, uContainer, jContainer, ne2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_2_5_checkCSP_expressionFBB(
			InnerClassDeclaration2InnerClass_InInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerClassDeclaration2InnerClass_InInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerClassDeclaration2InnerClass_InInterface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_10_1_initialbindings_blackBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match, org.eclipse.uml2.uml.Class feature,
			Interface uContainer) {
		return new Object[] { _this, match, feature, uContainer };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_bindingFBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match, org.eclipse.uml2.uml.Class feature,
			Interface uContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_bindingAndBlackFBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match, org.eclipse.uml2.uml.Class feature,
			Interface uContainer) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, uContainer);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_black = pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_10_3_CheckCSP_expressionFBB(
			InnerClassDeclaration2InnerClass_InInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_10_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.uml2.uml.Class feature, Interface uContainer) {
		return new Object[] { match, feature, uContainer };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Class feature, Interface uContainer) {
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		match.getToBeTranslatedEdges().add(uContainer__feature____nestedClassifier);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		return new Object[] { match, feature, uContainer, uContainer__feature____nestedClassifier };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_10_5_collectcontextelements_blackBBB(
			Match match, org.eclipse.uml2.uml.Class feature, Interface uContainer) {
		return new Object[] { match, feature, uContainer };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_10_5_collectcontextelements_greenBB(
			Match match, Interface uContainer) {
		match.getContextNodes().add(uContainer);
		return new Object[] { match, uContainer };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InInterface_10_6_registerobjectstomatch_expressionBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match, org.eclipse.uml2.uml.Class feature,
			Interface uContainer) {
		_this.registerObjectsToMatch_BWD(match, feature, uContainer);

	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_2 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("ne2ne");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		EObject tmpJContainer = _localVariable_2;
		EObject tmpNe2ne = _localVariable_3;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpUContainer instanceof Interface) {
				Interface uContainer = (Interface) tmpUContainer;
				if (tmpJContainer instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
					if (tmpNe2ne instanceof NamedElement2NamedElement) {
						NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
						return new Object[] { feature, uContainer, jContainer, ne2ne, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_blackBBBBFBB(
			org.eclipse.uml2.uml.Class feature, Interface uContainer, AbstractTypeDeclaration jContainer,
			NamedElement2NamedElement ne2ne, InnerClassDeclaration2InnerClass_InInterface _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, uContainer, jContainer, ne2ne, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_bindingAndBlackFFFFFBB(
			InnerClassDeclaration2InnerClass_InInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_binding[0];
			Interface uContainer = (Interface) result_pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_binding[1];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_binding[2];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_binding[3];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_black = pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_blackBBBBFBB(
					feature, uContainer, jContainer, ne2ne, _this, isApplicableMatch);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_black[4];

				return new Object[] { feature, uContainer, jContainer, ne2ne, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_11_1_performtransformation_greenBFFFBB(
			org.eclipse.uml2.uml.Class feature, AbstractTypeDeclaration jContainer, CSP csp) {
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MClass bodyDeclaration = ModiscoFactory.eINSTANCE.createMClass();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		bd2ne.setTarget(feature);
		b2e.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		jContainer.getBodyDeclarations().add(bodyDeclaration);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration, jContainer, csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_11_2_collecttranslatedelements_blackBBBB(
			org.eclipse.uml2.uml.Class feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MClass bodyDeclaration) {
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_11_2_collecttranslatedelements_greenFBBBB(
			org.eclipse.uml2.uml.Class feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			MClass bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject b2e, EObject bodyDeclaration,
			EObject uContainer, EObject jContainer, EObject ne2ne) {
		if (!feature.equals(uContainer)) {
			if (!feature.equals(jContainer)) {
				if (!feature.equals(ne2ne)) {
					if (!bd2ne.equals(feature)) {
						if (!bd2ne.equals(bodyDeclaration)) {
							if (!bd2ne.equals(uContainer)) {
								if (!bd2ne.equals(jContainer)) {
									if (!bd2ne.equals(ne2ne)) {
										if (!b2e.equals(feature)) {
											if (!b2e.equals(bd2ne)) {
												if (!b2e.equals(bodyDeclaration)) {
													if (!b2e.equals(uContainer)) {
														if (!b2e.equals(jContainer)) {
															if (!b2e.equals(ne2ne)) {
																if (!bodyDeclaration.equals(feature)) {
																	if (!bodyDeclaration.equals(uContainer)) {
																		if (!bodyDeclaration.equals(jContainer)) {
																			if (!bodyDeclaration.equals(ne2ne)) {
																				if (!jContainer.equals(uContainer)) {
																					if (!jContainer.equals(ne2ne)) {
																						if (!ne2ne.equals(uContainer)) {
																							return new Object[] {
																									ruleresult, feature,
																									bd2ne, b2e,
																									bodyDeclaration,
																									uContainer,
																									jContainer, ne2ne };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject b2e, EObject bodyDeclaration,
			EObject uContainer, EObject jContainer) {
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerClassDeclaration2InnerClass_InInterface";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String jContainer__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String b2e__feature____target_name_prime = "target";
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uContainer__feature____nestedClassifier);
		jContainer__bodyDeclaration____bodyDeclarations.setSrc(jContainer);
		jContainer__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jContainer__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		ruleresult.getCreatedEdges().add(bodyDeclaration__jContainer____abstractTypeDeclaration);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		jContainer__bodyDeclaration____bodyDeclarations
				.setName(jContainer__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__jContainer____abstractTypeDeclaration
				.setName(bodyDeclaration__jContainer____abstractTypeDeclaration_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer,
				bd2ne__bodyDeclaration____source, bd2ne__feature____target, b2e__bodyDeclaration____source,
				uContainer__feature____nestedClassifier, jContainer__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__jContainer____abstractTypeDeclaration, b2e__feature____target };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InInterface_11_5_registerobjects_expressionBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, PerformRuleResult ruleresult, EObject feature,
			EObject bd2ne, EObject b2e, EObject bodyDeclaration, EObject uContainer, EObject jContainer,
			EObject ne2ne) {
		_this.registerObjects_BWD(ruleresult, feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer, ne2ne);

	}

	public static final PerformRuleResult pattern_InnerClassDeclaration2InnerClass_InInterface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_bindingFB(
			InnerClassDeclaration2InnerClass_InInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerClassDeclaration2InnerClass_InInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_bindingAndBlackFFB(
			InnerClassDeclaration2InnerClass_InInterface _this) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_black = pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerClassDeclaration2InnerClass_InInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_2_corematch_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uContainer");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpUContainer instanceof Interface) {
				Interface uContainer = (Interface) tmpUContainer;
				return new Object[] { feature, uContainer, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InInterface_12_2_corematch_blackBBFFB(
			org.eclipse.uml2.uml.Class feature, Interface uContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(uContainer, NamedElement2NamedElement.class, "target")) {
			org.eclipse.modisco.java.NamedElement tmpJContainer = ne2ne.getSource();
			if (tmpJContainer instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
				_result.add(new Object[] { feature, uContainer, jContainer, ne2ne, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InInterface_12_3_findcontext_blackBBBB(
			org.eclipse.uml2.uml.Class feature, Interface uContainer, AbstractTypeDeclaration jContainer,
			NamedElement2NamedElement ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jContainer.equals(ne2ne.getSource())) {
			if (uContainer.getNestedClassifiers().contains(feature)) {
				if (uContainer.equals(ne2ne.getTarget())) {
					_result.add(new Object[] { feature, uContainer, jContainer, ne2ne });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_3_findcontext_greenBBBBFFFF(
			org.eclipse.uml2.uml.Class feature, Interface uContainer, AbstractTypeDeclaration jContainer,
			NamedElement2NamedElement ne2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2ne__jContainer____source_name_prime = "source";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String ne2ne__uContainer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uContainer__feature____nestedClassifier);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		return new Object[] { feature, uContainer, jContainer, ne2ne, isApplicableMatch, ne2ne__jContainer____source,
				uContainer__feature____nestedClassifier, ne2ne__uContainer____target };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_bindingFBBBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class feature, Interface uContainer, AbstractTypeDeclaration jContainer,
			NamedElement2NamedElement ne2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, uContainer, jContainer,
				ne2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, uContainer, jContainer, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_bindingAndBlackFBBBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class feature, Interface uContainer, AbstractTypeDeclaration jContainer,
			NamedElement2NamedElement ne2ne) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, feature, uContainer, jContainer, ne2ne);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_black = pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, uContainer, jContainer, ne2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_12_5_checkCSP_expressionFBB(
			InnerClassDeclaration2InnerClass_InInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerClassDeclaration2InnerClass_InInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerClassDeclaration2InnerClass_InInterface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_bindingFB(
			InnerClassDeclaration2InnerClass_InInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerClassDeclaration2InnerClass_InInterface _this) {
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerClassDeclaration2InnerClass_InInterface _this) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_black = pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_20_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.uml2.uml.Class feature) {
		for (org.eclipse.uml2.uml.Package __DEC_feature_packagedElement_361565 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_20_2_testcorematchandDECs_black_nac_1B(
			org.eclipse.uml2.uml.Class feature) {
		for (org.eclipse.uml2.uml.Class __DEC_feature_nestedClassifier_830637 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			if (!feature.equals(__DEC_feature_nestedClassifier_830637)) {
				return new Object[] { feature };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InInterface_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_nestedClassifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUContainer = _edge_nestedClassifier.getSrc();
		if (tmpUContainer instanceof Interface) {
			Interface uContainer = (Interface) tmpUContainer;
			EObject tmpFeature = _edge_nestedClassifier.getTrg();
			if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
				if (uContainer.getNestedClassifiers().contains(feature)) {
					if (pattern_InnerClassDeclaration2InnerClass_InInterface_20_2_testcorematchandDECs_black_nac_0B(
							feature) == null) {
						if (pattern_InnerClassDeclaration2InnerClass_InInterface_20_2_testcorematchandDECs_black_nac_1B(
								feature) == null) {
							_result.add(new Object[] { feature, uContainer, _edge_nestedClassifier });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match, org.eclipse.uml2.uml.Class feature,
			Interface uContainer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerClassDeclaration2InnerClass_InInterface_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_bindingFB(
			InnerClassDeclaration2InnerClass_InInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerClassDeclaration2InnerClass_InInterface _this) {
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerClassDeclaration2InnerClass_InInterface _this) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_black = pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_black_nac_0B(
			MClass bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_893543 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_893543 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_black_nac_1B(
			MClass bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_860660 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_860660 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_black_nac_2B(
			MClass bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_450080 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_450080 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_black_nac_3B(
			MClass bodyDeclaration) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_663876 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJContainer = _edge_bodyDeclarations.getSrc();
		if (tmpJContainer instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
			EObject tmpBodyDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpBodyDeclaration instanceof MClass) {
				MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
				if (!bodyDeclaration.equals(jContainer)) {
					if (jContainer.getBodyDeclarations().contains(bodyDeclaration)) {
						if (pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_black_nac_0B(
								bodyDeclaration) == null) {
							if (pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_black_nac_1B(
									bodyDeclaration) == null) {
								if (pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_black_nac_2B(
										bodyDeclaration) == null) {
									if (pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_black_nac_3B(
											bodyDeclaration) == null) {
										_result.add(
												new Object[] { bodyDeclaration, jContainer, _edge_bodyDeclarations });
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match, MClass bodyDeclaration,
			AbstractTypeDeclaration jContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, jContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerClassDeclaration2InnerClass_InInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerClassDeclaration2InnerClass_InInterface_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_1_prepare_blackB(
			InnerClassDeclaration2InnerClass_InInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = targetMatch.getObject("uContainer");
		EObject _localVariable_3 = sourceMatch.getObject("jContainer");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpUContainer = _localVariable_2;
		EObject tmpJContainer = _localVariable_3;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpBodyDeclaration instanceof MClass) {
				MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
				if (tmpUContainer instanceof Interface) {
					Interface uContainer = (Interface) tmpUContainer;
					if (tmpJContainer instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
						return new Object[] { feature, bodyDeclaration, uContainer, jContainer, targetMatch,
								sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, Interface uContainer,
			AbstractTypeDeclaration jContainer, Match sourceMatch, Match targetMatch) {
		if (!bodyDeclaration.equals(jContainer)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { feature, bodyDeclaration, uContainer, jContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_binding[0];
			MClass bodyDeclaration = (MClass) result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_binding[1];
			Interface uContainer = (Interface) result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_black = pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_blackBBBBBB(
					feature, bodyDeclaration, uContainer, jContainer, sourceMatch, targetMatch);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, bodyDeclaration, uContainer, jContainer, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_bindingFBBBBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, org.eclipse.uml2.uml.Class feature,
			MClass bodyDeclaration, Interface uContainer, AbstractTypeDeclaration jContainer, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(feature, bodyDeclaration, uContainer, jContainer,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, feature, bodyDeclaration, uContainer, jContainer, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, org.eclipse.uml2.uml.Class feature,
			MClass bodyDeclaration, Interface uContainer, AbstractTypeDeclaration jContainer, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_bindingFBBBBBBB(
				_this, feature, bodyDeclaration, uContainer, jContainer, sourceMatch, targetMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_black = pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, bodyDeclaration, uContainer, jContainer, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_24_4_checkCSP_expressionFB(
			CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InInterface_24_5_matchcorrcontext_blackBBFBB(
			Interface uContainer, AbstractTypeDeclaration jContainer, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jContainer, NamedElement2NamedElement.class, "source")) {
				if (uContainer.equals(ne2ne.getTarget())) {
					_result.add(new Object[] { uContainer, jContainer, ne2ne, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_5_matchcorrcontext_greenBBBF(
			NamedElement2NamedElement ne2ne, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InnerClassDeclaration2InnerClass_InInterface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ne2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, Interface uContainer,
			AbstractTypeDeclaration jContainer, CCMatch ccMatch) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { feature, bodyDeclaration, uContainer, jContainer, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_6_createcorrespondence_greenBFFBB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, CCMatch ccMatch) {
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InnerClassDeclaration2InnerClass_InInterface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerClassDeclaration2InnerClass_InInterface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_27_1_matchtggpattern_black_nac_0B(
			MClass bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_682871 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_682871 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_27_1_matchtggpattern_black_nac_1B(
			MClass bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_79727 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_79727 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_27_1_matchtggpattern_black_nac_2B(
			MClass bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_785685 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_785685 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_27_1_matchtggpattern_black_nac_3B(
			MClass bodyDeclaration) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_138229 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_27_1_matchtggpattern_blackBB(
			MClass bodyDeclaration, AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			if (jContainer.getBodyDeclarations().contains(bodyDeclaration)) {
				if (pattern_InnerClassDeclaration2InnerClass_InInterface_27_1_matchtggpattern_black_nac_0B(
						bodyDeclaration) == null) {
					if (pattern_InnerClassDeclaration2InnerClass_InInterface_27_1_matchtggpattern_black_nac_1B(
							bodyDeclaration) == null) {
						if (pattern_InnerClassDeclaration2InnerClass_InInterface_27_1_matchtggpattern_black_nac_2B(
								bodyDeclaration) == null) {
							if (pattern_InnerClassDeclaration2InnerClass_InInterface_27_1_matchtggpattern_black_nac_3B(
									bodyDeclaration) == null) {
								return new Object[] { bodyDeclaration, jContainer };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_28_1_matchtggpattern_black_nac_0B(
			org.eclipse.uml2.uml.Class feature) {
		for (org.eclipse.uml2.uml.Package __DEC_feature_packagedElement_573750 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_28_1_matchtggpattern_black_nac_1B(
			org.eclipse.uml2.uml.Class feature) {
		for (org.eclipse.uml2.uml.Class __DEC_feature_nestedClassifier_580839 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			if (!feature.equals(__DEC_feature_nestedClassifier_580839)) {
				return new Object[] { feature };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Class feature, Interface uContainer) {
		if (uContainer.getNestedClassifiers().contains(feature)) {
			if (pattern_InnerClassDeclaration2InnerClass_InInterface_28_1_matchtggpattern_black_nac_0B(
					feature) == null) {
				if (pattern_InnerClassDeclaration2InnerClass_InInterface_28_1_matchtggpattern_black_nac_1B(
						feature) == null) {
					return new Object[] { feature, uContainer };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_1_createresult_blackB(
			InnerClassDeclaration2InnerClass_InInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Interface uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration jContainer) {
		if (ruleResult.getSourceObjects().contains(jContainer)) {
			return new Object[] { ruleResult, jContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InInterface_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ne2neList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpNe2ne : ne2neList.getEntryObjects()) {
				if (tmpNe2ne instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
					NamedElement tmpUContainer = ne2ne.getTarget();
					if (tmpUContainer instanceof Interface) {
						Interface uContainer = (Interface) tmpUContainer;
						org.eclipse.modisco.java.NamedElement tmpJContainer = ne2ne.getSource();
						if (tmpJContainer instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
							if (pattern_InnerClassDeclaration2InnerClass_InInterface_29_2_isapplicablecore_black_nac_1BB(
									ruleResult, ne2ne) == null) {
								if (pattern_InnerClassDeclaration2InnerClass_InInterface_29_2_isapplicablecore_black_nac_0BB(
										ruleResult, uContainer) == null) {
									if (pattern_InnerClassDeclaration2InnerClass_InInterface_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, jContainer) == null) {
										_result.add(new Object[] { ne2neList, uContainer, ne2ne, jContainer,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_bindingFBBBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, IsApplicableMatch isApplicableMatch,
			Interface uContainer, AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, uContainer, jContainer, ne2ne,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uContainer, jContainer, ne2ne, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_bindingAndBlackFBBBBBB(
			InnerClassDeclaration2InnerClass_InInterface _this, IsApplicableMatch isApplicableMatch,
			Interface uContainer, AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, uContainer, jContainer, ne2ne, ruleResult);
		if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_black = pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InInterface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uContainer, jContainer, ne2ne, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InInterface_29_4_checkCSP_expressionFBB(
			InnerClassDeclaration2InnerClass_InInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_5_checknacs_blackBBB(
			Interface uContainer, AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne) {
		return new Object[] { uContainer, jContainer, ne2ne };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_6_perform_blackBBBB(
			Interface uContainer, AbstractTypeDeclaration jContainer, NamedElement2NamedElement ne2ne,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { uContainer, jContainer, ne2ne, ruleResult };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InInterface_29_6_perform_greenFFFFBBBB(
			Interface uContainer, AbstractTypeDeclaration jContainer, ModelgeneratorRuleResult ruleResult, CSP csp) {
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MClass bodyDeclaration = ModiscoFactory.eINSTANCE.createMClass();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("bodyDeclaration", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		uContainer.getNestedClassifiers().add(feature);
		ruleResult.getTargetObjects().add(feature);
		bd2ne.setTarget(feature);
		ruleResult.getCorrObjects().add(bd2ne);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		jContainer.getBodyDeclarations().add(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		String feature_name_prime = (String) _localVariable_0;
		String bodyDeclaration_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		feature.setName(feature_name_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration, uContainer, jContainer, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_InnerClassDeclaration2InnerClass_InInterface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InnerClassDeclaration2InnerClass_InInterfaceImpl