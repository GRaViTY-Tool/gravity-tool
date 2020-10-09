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

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.Modifier2NamedElement;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.InnerClassDeclaration2InnerClass_InMethod_withModifier;
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
 * An implementation of the model object '<em><b>Inner Class Declaration2 Inner Class In Method with Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InnerClassDeclaration2InnerClass_InMethod_withModifierImpl extends AbstractRuleImpl
		implements InnerClassDeclaration2InnerClass_InMethod_withModifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerClassDeclaration2InnerClass_InMethod_withModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInnerClassDeclaration2InnerClass_InMethod_withModifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MAbstractMethodDefinition method, MClass bodyDeclaration,
			Modifier modifier, AbstractTypeDeclaration jContainer) {

		Object[] result1_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_1_initialbindings_blackBBBBBB(this,
						match, method, bodyDeclaration, modifier, jContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[modifier] = " + modifier + ", " + "[jContainer] = " + jContainer + ".");
		}

		Object[] result2_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_bindingAndBlackFBBBBBB(
						this, match, method, bodyDeclaration, modifier, jContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[modifier] = " + modifier + ", " + "[jContainer] = " + jContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_4_collectelementstobetranslated_blackBBBBB(
							match, method, bodyDeclaration, modifier, jContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[modifier] = " + modifier + ", " + "[jContainer] = " + jContainer + ".");
			}
			InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_4_collectelementstobetranslated_greenBBBBFFF(
							match, method, bodyDeclaration, modifier);
			//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result4_green[6];

			Object[] result5_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_5_collectcontextelements_blackBBBBB(
							match, method, bodyDeclaration, modifier, jContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[modifier] = " + modifier + ", " + "[jContainer] = " + jContainer + ".");
			}
			InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_5_collectcontextelements_greenBBBFF(
							match, method, jContainer);
			//nothing EMoflonEdge jContainer__method____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge method__jContainer____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_6_registerobjectstomatch_expressionBBBBBB(
							this, match, method, bodyDeclaration, modifier, jContainer);
			return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_7_expressionF();
		} else {
			return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[0];
		NamedElement2NamedElement me2op = (NamedElement2NamedElement) result1_bindingAndBlack[1];
		MClass bodyDeclaration = (MClass) result1_bindingAndBlack[2];
		Modifier modifier = (Modifier) result1_bindingAndBlack[3];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[4];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		Operation operation = (Operation) result1_bindingAndBlack[6];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_greenFFFFBBBB(
						bodyDeclaration, modifier, uContainer, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_green[1];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[2];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[3];

		Object[] result2_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_2_collecttranslatedelements_blackBBBBBB(
						m2f, feature, bd2ne, b2e, bodyDeclaration, modifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
		}
		Object[] result2_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_2_collecttranslatedelements_greenFBBBBBB(
						m2f, feature, bd2ne, b2e, bodyDeclaration, modifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
						ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier, uContainer,
						jContainer, operation, ne2ne);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", "
					+ "[method] = " + method + ", " + "[b2e] = " + b2e + ", " + "[me2op] = " + me2op + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
					+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[operation] = "
					+ operation + ", " + "[ne2ne] = " + ne2ne + ".");
		}
		InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
						ruleresult, m2f, feature, bd2ne, method, b2e, bodyDeclaration, modifier, uContainer);
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[18];

		// 
		// 
		InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
						this, ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier,
						uContainer, jContainer, operation, ne2ne);
		return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_bindingAndBlackFFB(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_greenBF(
						performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_binding[0];
		MClass bodyDeclaration = (MClass) result2_binding[1];
		Modifier modifier = (Modifier) result2_binding[2];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_binding[3];
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_2_corematch_blackBFBBFBFFB(method,
						bodyDeclaration, modifier, jContainer, match)) {
			NamedElement2NamedElement me2op = (NamedElement2NamedElement) result2_black[1];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[4];
			Operation operation = (Operation) result2_black[6];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[7];
			// ForEach 
			for (Object[] result3_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_3_findcontext_blackBBBBBBBB(
							method, me2op, bodyDeclaration, modifier, uContainer, jContainer, operation, ne2ne)) {
				Object[] result3_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFFF(
								method, me2op, bodyDeclaration, modifier, uContainer, jContainer, operation, ne2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge me2op__operation____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge jContainer__method____bodyDeclarations = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge method__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge me2op__method____source = (EMoflonEdge) result3_green[19];

				Object[] result4_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
								this, isApplicableMatch, method, me2op, bodyDeclaration, modifier, uContainer,
								jContainer, operation, ne2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[me2op] = " + me2op + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[modifier] = " + modifier + ", " + "[uContainer] = " + uContainer + ", "
							+ "[jContainer] = " + jContainer + ", " + "[operation] = " + operation + ", " + "[ne2ne] = "
							+ ne2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_5_checkCSP_expressionFBB(this,
								csp)) {

					Object[] result6_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MAbstractMethodDefinition method, MClass bodyDeclaration,
			Modifier modifier, AbstractTypeDeclaration jContainer) {
		match.registerObject("method", method);
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("modifier", modifier);
		match.registerObject("jContainer", jContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MAbstractMethodDefinition method, MClass bodyDeclaration,
			Modifier modifier, AbstractTypeDeclaration jContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MAbstractMethodDefinition method,
			NamedElement2NamedElement me2op, MClass bodyDeclaration, Modifier modifier,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");

		// Create unbound variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("me2op", me2op);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("modifier", modifier);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("operation", operation);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne,
			EObject method, EObject b2e, EObject me2op, EObject bodyDeclaration, EObject modifier, EObject uContainer,
			EObject jContainer, EObject operation, EObject ne2ne) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("me2op", me2op);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("ne2ne", ne2ne);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
						.equals("modisco.MClass.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("modifier").eClass()).equals("java.Modifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {

		Object[] result1_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_1_initialbindings_blackBBBBB(this,
						match, feature, uContainer, operation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer
					+ ", " + "[operation] = " + operation + ".");
		}

		Object[] result2_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_bindingAndBlackFBBBBB(
						this, match, feature, uContainer, operation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer
					+ ", " + "[operation] = " + operation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_3_CheckCSP_expressionFBB(this,
						csp)) {

			Object[] result4_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_4_collectelementstobetranslated_blackBBBB(
							match, feature, uContainer, operation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ", " + "[operation] = "
						+ operation + ".");
			}
			InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_4_collectelementstobetranslated_greenBBBF(
							match, feature, uContainer);
			//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_5_collectcontextelements_blackBBBB(
							match, feature, uContainer, operation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ", " + "[operation] = "
						+ operation + ".");
			}
			InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_5_collectcontextelements_greenBBBFF(
							match, uContainer, operation);
			//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result5_green[4];

			// 
			InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_6_registerobjectstomatch_expressionBBBBB(
							this, match, feature, uContainer, operation);
			return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_7_expressionF();
		} else {
			return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[1];
		NamedElement2NamedElement me2op = (NamedElement2NamedElement) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		Operation operation = (Operation) result1_bindingAndBlack[5];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_greenFBFBFFFB(
						feature, method, csp);
		Modifier2NamedElement m2f = (Modifier2NamedElement) result1_green[0];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[2];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[4];
		MClass bodyDeclaration = (MClass) result1_green[5];
		Modifier modifier = (Modifier) result1_green[6];

		Object[] result2_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_2_collecttranslatedelements_blackBBBBBB(
						m2f, feature, bd2ne, b2e, bodyDeclaration, modifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[m2f] = " + m2f + ", "
					+ "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[b2e] = " + b2e + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
		}
		Object[] result2_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_2_collecttranslatedelements_greenFBBBBBB(
						m2f, feature, bd2ne, b2e, bodyDeclaration, modifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
						ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier, uContainer,
						jContainer, operation, ne2ne);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", "
					+ "[method] = " + method + ", " + "[b2e] = " + b2e + ", " + "[me2op] = " + me2op + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
					+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[operation] = "
					+ operation + ", " + "[ne2ne] = " + ne2ne + ".");
		}
		InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
						ruleresult, m2f, feature, bd2ne, method, b2e, bodyDeclaration, modifier, uContainer);
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[18];

		// 
		// 
		InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
						this, ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier,
						uContainer, jContainer, operation, ne2ne);
		return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_bindingAndBlackFFB(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_greenBF(
						performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_binding[0];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_binding[1];
		Operation operation = (Operation) result2_binding[2];
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_2_corematch_blackBFFBFBFB(feature,
						uContainer, operation, match)) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[1];
			NamedElement2NamedElement me2op = (NamedElement2NamedElement) result2_black[2];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[4];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[6];
			// ForEach 
			for (Object[] result3_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_3_findcontext_blackBBBBBBB(
							feature, method, me2op, uContainer, jContainer, operation, ne2ne)) {
				Object[] result3_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(
								feature, method, me2op, uContainer, jContainer, operation, ne2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge me2op__operation____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge jContainer__method____bodyDeclarations = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge method__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge me2op__method____source = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
								this, isApplicableMatch, feature, method, me2op, uContainer, jContainer, operation,
								ne2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[method] = " + method + ", " + "[me2op] = " + me2op + ", " + "[uContainer] = "
							+ uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[operation] = " + operation
							+ ", " + "[ne2ne] = " + ne2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_5_checkCSP_expressionFBB(
								this, csp)) {

					Object[] result6_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		match.registerObject("feature", feature);
		match.registerObject("uContainer", uContainer);
		match.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {// Create CSP
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
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("me2op", me2op);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("operation", operation);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne,
			EObject method, EObject b2e, EObject me2op, EObject bodyDeclaration, EObject modifier, EObject uContainer,
			EObject jContainer, EObject operation, EObject ne2ne) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("me2op", me2op);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("operation", operation);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_309(EMoflonEdge _edge_nestedClassifier) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_2_testcorematchandDECs_blackFFFB(
						_edge_nestedClassifier)) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_black[0];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[1];
			Operation operation = (Operation) result2_black[2];
			Object[] result2_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, feature, uContainer, operation)) {
				// 
				if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_319(EMoflonEdge _edge_mInnerTypes) {

		Object[] result1_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_blackFFFFB(
						_edge_mInnerTypes)) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[0];
			MClass bodyDeclaration = (MClass) result2_black[1];
			Modifier modifier = (Modifier) result2_black[2];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[3];
			Object[] result2_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, method, bodyDeclaration, modifier, jContainer)) {
				// 
				if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		JVisibility2umlVisibility jVisibility2umlVisibility1 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility1);

		eq0.setRuleName("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		jVisibility2umlVisibility1.setRuleName("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		jVisibility2umlVisibility1.solve(var_modifier_visibility, var_feature_visibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			var_feature_visibility.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			jVisibility2umlVisibility1.solve(var_modifier_visibility, var_feature_visibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "name", var_feature_name.getValue());
				__helper.setValue("feature", "visibility", var_feature_visibility.getValue());
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
		ruleResult.setRule("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		JVisibility2umlVisibility jVisibility2umlVisibility1 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility1);

		eq0.setRuleName("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		jVisibility2umlVisibility1.setRuleName("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		jVisibility2umlVisibility1.solve(var_modifier_visibility, var_feature_visibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_bodyDeclaration_name.setBound(false);
			var_modifier_visibility.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			jVisibility2umlVisibility1.solve(var_modifier_visibility, var_feature_visibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("bodyDeclaration", "name", var_bodyDeclaration_name.getValue());
				__helper.setValue("modifier", "visibility", var_modifier_visibility.getValue());
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

		Object[] result1_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[0];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_bindingAndBlack[1];
		MClass bodyDeclaration = (MClass) result2_bindingAndBlack[2];
		Modifier modifier = (Modifier) result2_bindingAndBlack[3];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[4];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_bindingAndBlack[5];
		Operation operation = (Operation) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
						this, feature, method, bodyDeclaration, modifier, uContainer, jContainer, operation,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[modifier] = " + modifier + ", " + "[uContainer] = " + uContainer + ", "
					+ "[jContainer] = " + jContainer + ", " + "[operation] = " + operation + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_5_matchcorrcontext_blackBFBBBFBB(
							method, uContainer, jContainer, operation, sourceMatch, targetMatch)) {
				NamedElement2NamedElement me2op = (NamedElement2NamedElement) result5_black[1];
				NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result5_black[5];
				Object[] result5_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_5_matchcorrcontext_greenBBBBF(
								me2op, ne2ne, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_6_createcorrespondence_blackBBBBBBBB(
								feature, method, bodyDeclaration, modifier, uContainer, jContainer, operation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[modifier] = " + modifier + ", " + "[uContainer] = " + uContainer + ", "
							+ "[jContainer] = " + jContainer + ", " + "[operation] = " + operation + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_6_createcorrespondence_greenFBFFBBB(
								feature, bodyDeclaration, modifier, ccMatch);
				//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[2];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[3];

				Object[] result7_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_7_addtoreturnedresult_blackBB(
								result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_7_addtoreturnedresult_greenBB(
								result, ccMatch);

			}

		} else {
		}
		return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, Match sourceMatch, Match targetMatch) {// Create CSP
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
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
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
	public boolean checkDEC_FWD(MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier,
			AbstractTypeDeclaration jContainer) {// 
		Object[] result1_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_blackBBBB(method,
						bodyDeclaration, modifier, jContainer);
		if (result1_black != null) {
			return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_2_expressionF();
		} else {
			return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {// 
		Object[] result1_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_1_matchtggpattern_blackBBB(feature,
						uContainer, operation);
		if (result1_black != null) {
			return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_2_expressionF();
		} else {
			return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement me2opParameter) {

		Object[] result1_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_blackFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList me2opList = (RuleEntryList) result2_black[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[1];
			NamedElement2NamedElement me2op = (NamedElement2NamedElement) result2_black[2];
			Operation operation = (Operation) result2_black[3];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[4];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[5];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[6];

			Object[] result3_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
							this, isApplicableMatch, method, me2op, uContainer, jContainer, operation, ne2ne,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
						+ "[me2op] = " + me2op + ", " + "[uContainer] = " + uContainer + ", " + "[jContainer] = "
						+ jContainer + ", " + "[operation] = " + operation + ", " + "[ne2ne] = " + ne2ne + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_4_checkCSP_expressionFBB(this,
							csp)) {
				// 
				Object[] result5_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_5_checknacs_blackBBBBBB(
								method, me2op, uContainer, jContainer, operation, ne2ne);
				if (result5_black != null) {

					Object[] result6_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_6_perform_blackBBBBBBB(
									method, me2op, uContainer, jContainer, operation, ne2ne, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
								+ ", " + "[me2op] = " + me2op + ", " + "[uContainer] = " + uContainer + ", "
								+ "[jContainer] = " + jContainer + ", " + "[operation] = " + operation + ", "
								+ "[ne2ne] = " + ne2ne + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_6_perform_greenFFFBFFFBBB(
									method, uContainer, ruleResult, csp);
					//nothing Modifier2NamedElement m2f = (Modifier2NamedElement) result6_green[0];
					//nothing org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result6_green[1];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[2];
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[4];
					//nothing MClass bodyDeclaration = (MClass) result6_green[5];
					//nothing Modifier modifier = (Modifier) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MAbstractMethodDefinition method,
			NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, NamedElement2NamedElement ne2ne, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(jVisibility2umlVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("me2op", me2op);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("operation", operation);
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
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_FWD__MATCH_MABSTRACTMETHODDEFINITION_MCLASS_MODIFIER_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(MClass) arguments.get(2), (Modifier) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MABSTRACTMETHODDEFINITION_MCLASS_MODIFIER_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(MClass) arguments.get(2), (Modifier) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4));
			return null;
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MABSTRACTMETHODDEFINITION_MCLASS_MODIFIER_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(MClass) arguments.get(2), (Modifier) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_NAMEDELEMENT2NAMEDELEMENT_MCLASS_MODIFIER_CLASS_ABSTRACTTYPEDECLARATION_OPERATION_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (NamedElement2NamedElement) arguments.get(2),
					(MClass) arguments.get(3), (Modifier) arguments.get(4),
					(org.eclipse.uml2.uml.Class) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(Operation) arguments.get(7), (NamedElement2NamedElement) arguments.get(8));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_BWD__MATCH_CLASS_CLASS_OPERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASS_CLASS_OPERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Operation) arguments.get(3));
			return null;
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASS_CLASS_OPERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_MABSTRACTMETHODDEFINITION_NAMEDELEMENT2NAMEDELEMENT_CLASS_ABSTRACTTYPEDECLARATION_OPERATION_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (MAbstractMethodDefinition) arguments.get(2),
					(NamedElement2NamedElement) arguments.get(3), (org.eclipse.uml2.uml.Class) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (Operation) arguments.get(6),
					(NamedElement2NamedElement) arguments.get(7));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12));
			return null;
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_309__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_309((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_319__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_319((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_CC__CLASS_MABSTRACTMETHODDEFINITION_MCLASS_MODIFIER_CLASS_ABSTRACTTYPEDECLARATION_OPERATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Class) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (MClass) arguments.get(2),
					(Modifier) arguments.get(3), (org.eclipse.uml2.uml.Class) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (Operation) arguments.get(6), (Match) arguments.get(7),
					(Match) arguments.get(8));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_DEC_FWD__MABSTRACTMETHODDEFINITION_MCLASS_MODIFIER_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((MAbstractMethodDefinition) arguments.get(0), (MClass) arguments.get(1),
					(Modifier) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_DEC_BWD__CLASS_CLASS_OPERATION:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (Operation) arguments.get(2));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___GENERATE_MODEL__RULEENTRYCONTAINER_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (NamedElement2NamedElement) arguments.get(1));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_NAMEDELEMENT2NAMEDELEMENT_CLASS_ABSTRACTTYPEDECLARATION_OPERATION_NAMEDELEMENT2NAMEDELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (NamedElement2NamedElement) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(Operation) arguments.get(5), (NamedElement2NamedElement) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_1_initialbindings_blackBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier, AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { _this, match, method, bodyDeclaration, modifier, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_bindingFBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier, AbstractTypeDeclaration jContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, method, bodyDeclaration, modifier, jContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, method, bodyDeclaration, modifier, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier, AbstractTypeDeclaration jContainer) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, method, bodyDeclaration, modifier, jContainer);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, method, bodyDeclaration, modifier, jContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_3_CheckCSP_expressionFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier,
			AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { match, method, bodyDeclaration, modifier, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier) {
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		match.getToBeTranslatedNodes().add(modifier);
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(method__bodyDeclaration____mInnerTypes);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		match.getToBeTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		return new Object[] { match, method, bodyDeclaration, modifier, method__bodyDeclaration____mInnerTypes,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_5_collectcontextelements_blackBBBBB(
			Match match, MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier,
			AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { match, method, bodyDeclaration, modifier, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_5_collectcontextelements_greenBBBFF(
			Match match, MAbstractMethodDefinition method, AbstractTypeDeclaration jContainer) {
		EMoflonEdge jContainer__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(method);
		match.getContextNodes().add(jContainer);
		String jContainer__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		jContainer__method____bodyDeclarations.setSrc(jContainer);
		jContainer__method____bodyDeclarations.setTrg(method);
		match.getContextEdges().add(jContainer__method____bodyDeclarations);
		method__jContainer____abstractTypeDeclaration.setSrc(method);
		method__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		match.getContextEdges().add(method__jContainer____abstractTypeDeclaration);
		jContainer__method____bodyDeclarations.setName(jContainer__method____bodyDeclarations_name_prime);
		method__jContainer____abstractTypeDeclaration.setName(method__jContainer____abstractTypeDeclaration_name_prime);
		return new Object[] { match, method, jContainer, jContainer__method____bodyDeclarations,
				method__jContainer____abstractTypeDeclaration };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_6_registerobjectstomatch_expressionBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier, AbstractTypeDeclaration jContainer) {
		_this.registerObjectsToMatch_FWD(match, method, bodyDeclaration, modifier, jContainer);

	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("me2op");
		EObject _localVariable_2 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("modifier");
		EObject _localVariable_4 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_5 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_6 = isApplicableMatch.getObject("operation");
		EObject _localVariable_7 = isApplicableMatch.getObject("ne2ne");
		EObject tmpMethod = _localVariable_0;
		EObject tmpMe2op = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpModifier = _localVariable_3;
		EObject tmpUContainer = _localVariable_4;
		EObject tmpJContainer = _localVariable_5;
		EObject tmpOperation = _localVariable_6;
		EObject tmpNe2ne = _localVariable_7;
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			if (tmpMe2op instanceof NamedElement2NamedElement) {
				NamedElement2NamedElement me2op = (NamedElement2NamedElement) tmpMe2op;
				if (tmpBodyDeclaration instanceof MClass) {
					MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
					if (tmpModifier instanceof Modifier) {
						Modifier modifier = (Modifier) tmpModifier;
						if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
							if (tmpJContainer instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
								if (tmpOperation instanceof Operation) {
									Operation operation = (Operation) tmpOperation;
									if (tmpNe2ne instanceof NamedElement2NamedElement) {
										NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
										return new Object[] { method, me2op, bodyDeclaration, modifier, uContainer,
												jContainer, operation, ne2ne, isApplicableMatch };
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_blackBBBBBBBBFBB(
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, MClass bodyDeclaration,
			Modifier modifier, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, NamedElement2NamedElement ne2ne,
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch) {
		if (!me2op.equals(ne2ne)) {
			if (!bodyDeclaration.equals(jContainer)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { method, me2op, bodyDeclaration, modifier, uContainer, jContainer,
								operation, ne2ne, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding != null) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[0];
			NamedElement2NamedElement me2op = (NamedElement2NamedElement) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[1];
			MClass bodyDeclaration = (MClass) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[2];
			Modifier modifier = (Modifier) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[3];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[4];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[5];
			Operation operation = (Operation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[6];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[7];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_blackBBBBBBBBFBB(
					method, me2op, bodyDeclaration, modifier, uContainer, jContainer, operation, ne2ne, _this,
					isApplicableMatch);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_black[8];

				return new Object[] { method, me2op, bodyDeclaration, modifier, uContainer, jContainer, operation,
						ne2ne, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_greenFFFFBBBB(
			MClass bodyDeclaration, Modifier modifier, org.eclipse.uml2.uml.Class uContainer, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("feature", "visibility");
		m2f.setSource(modifier);
		uContainer.getNestedClassifiers().add(feature);
		m2f.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_1;
		feature.setName(feature_name_prime);
		feature.setVisibility(feature_visibility_prime);
		return new Object[] { m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, uContainer, csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_2_collecttranslatedelements_blackBBBBBB(
			Modifier2NamedElement m2f, org.eclipse.uml2.uml.Class feature, NamedElement2NamedElement bd2ne,
			ASTNode2Element b2e, MClass bodyDeclaration, Modifier modifier) {
		return new Object[] { m2f, feature, bd2ne, b2e, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_2_collecttranslatedelements_greenFBBBBBB(
			Modifier2NamedElement m2f, org.eclipse.uml2.uml.Class feature, NamedElement2NamedElement bd2ne,
			ASTNode2Element b2e, MClass bodyDeclaration, Modifier modifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getTranslatedElements().add(modifier);
		return new Object[] { ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne, EObject method, EObject b2e,
			EObject me2op, EObject bodyDeclaration, EObject modifier, EObject uContainer, EObject jContainer,
			EObject operation, EObject ne2ne) {
		if (!m2f.equals(method)) {
			if (!m2f.equals(me2op)) {
				if (!m2f.equals(modifier)) {
					if (!m2f.equals(uContainer)) {
						if (!m2f.equals(operation)) {
							if (!m2f.equals(ne2ne)) {
								if (!feature.equals(m2f)) {
									if (!feature.equals(method)) {
										if (!feature.equals(me2op)) {
											if (!feature.equals(modifier)) {
												if (!feature.equals(uContainer)) {
													if (!feature.equals(jContainer)) {
														if (!feature.equals(operation)) {
															if (!feature.equals(ne2ne)) {
																if (!bd2ne.equals(m2f)) {
																	if (!bd2ne.equals(feature)) {
																		if (!bd2ne.equals(method)) {
																			if (!bd2ne.equals(me2op)) {
																				if (!bd2ne.equals(bodyDeclaration)) {
																					if (!bd2ne.equals(modifier)) {
																						if (!bd2ne.equals(uContainer)) {
																							if (!bd2ne.equals(
																									jContainer)) {
																								if (!bd2ne.equals(
																										operation)) {
																									if (!bd2ne.equals(
																											ne2ne)) {
																										if (!method
																												.equals(modifier)) {
																											if (!method
																													.equals(uContainer)) {
																												if (!method
																														.equals(operation)) {
																													if (!method
																															.equals(ne2ne)) {
																														if (!b2e.equals(
																																m2f)) {
																															if (!b2e.equals(
																																	feature)) {
																																if (!b2e.equals(
																																		bd2ne)) {
																																	if (!b2e.equals(
																																			method)) {
																																		if (!b2e.equals(
																																				me2op)) {
																																			if (!b2e.equals(
																																					bodyDeclaration)) {
																																				if (!b2e.equals(
																																						modifier)) {
																																					if (!b2e.equals(
																																							uContainer)) {
																																						if (!b2e.equals(
																																								jContainer)) {
																																							if (!b2e.equals(
																																									operation)) {
																																								if (!b2e.equals(
																																										ne2ne)) {
																																									if (!me2op
																																											.equals(method)) {
																																										if (!me2op
																																												.equals(modifier)) {
																																											if (!me2op
																																													.equals(uContainer)) {
																																												if (!me2op
																																														.equals(operation)) {
																																													if (!me2op
																																															.equals(ne2ne)) {
																																														if (!bodyDeclaration
																																																.equals(m2f)) {
																																															if (!bodyDeclaration
																																																	.equals(feature)) {
																																																if (!bodyDeclaration
																																																		.equals(method)) {
																																																	if (!bodyDeclaration
																																																			.equals(me2op)) {
																																																		if (!bodyDeclaration
																																																				.equals(modifier)) {
																																																			if (!bodyDeclaration
																																																					.equals(uContainer)) {
																																																				if (!bodyDeclaration
																																																						.equals(jContainer)) {
																																																					if (!bodyDeclaration
																																																							.equals(operation)) {
																																																						if (!bodyDeclaration
																																																								.equals(ne2ne)) {
																																																							if (!modifier
																																																									.equals(uContainer)) {
																																																								if (!modifier
																																																										.equals(operation)) {
																																																									if (!modifier
																																																											.equals(ne2ne)) {
																																																										if (!jContainer
																																																												.equals(m2f)) {
																																																											if (!jContainer
																																																													.equals(method)) {
																																																												if (!jContainer
																																																														.equals(me2op)) {
																																																													if (!jContainer
																																																															.equals(modifier)) {
																																																														if (!jContainer
																																																																.equals(uContainer)) {
																																																															if (!jContainer
																																																																	.equals(operation)) {
																																																																if (!jContainer
																																																																		.equals(ne2ne)) {
																																																																	if (!operation
																																																																			.equals(uContainer)) {
																																																																		if (!ne2ne
																																																																				.equals(uContainer)) {
																																																																			if (!ne2ne
																																																																					.equals(operation)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						m2f,
																																																																						feature,
																																																																						bd2ne,
																																																																						method,
																																																																						b2e,
																																																																						me2op,
																																																																						bodyDeclaration,
																																																																						modifier,
																																																																						uContainer,
																																																																						jContainer,
																																																																						operation,
																																																																						ne2ne };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne, EObject method, EObject b2e,
			EObject bodyDeclaration, EObject modifier, EObject uContainer) {
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String m2f__feature____target_name_prime = "target";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getCreatedEdges().add(uContainer__feature____nestedClassifier);
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(method__bodyDeclaration____mInnerTypes);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, bd2ne, method, b2e, bodyDeclaration, modifier, uContainer,
				bd2ne__bodyDeclaration____source, bd2ne__feature____target, uContainer__feature____nestedClassifier,
				method__bodyDeclaration____mInnerTypes, m2f__feature____target, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration, b2e__bodyDeclaration____source, m2f__modifier____source,
				b2e__feature____target };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, PerformRuleResult ruleresult, EObject m2f,
			EObject feature, EObject bd2ne, EObject method, EObject b2e, EObject me2op, EObject bodyDeclaration,
			EObject modifier, EObject uContainer, EObject jContainer, EObject operation, EObject ne2ne) {
		_this.registerObjects_FWD(ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier,
				uContainer, jContainer, operation, ne2ne);

	}

	public static final PerformRuleResult pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_bindingFB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_bindingAndBlackFFB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_2_corematch_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("method");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject _localVariable_2 = match.getObject("modifier");
		EObject _localVariable_3 = match.getObject("jContainer");
		EObject tmpMethod = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpModifier = _localVariable_2;
		EObject tmpJContainer = _localVariable_3;
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			if (tmpBodyDeclaration instanceof MClass) {
				MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
				if (tmpModifier instanceof Modifier) {
					Modifier modifier = (Modifier) tmpModifier;
					if (tmpJContainer instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
						return new Object[] { method, bodyDeclaration, modifier, jContainer, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_2_corematch_blackBFBBFBFFB(
			MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier,
			AbstractTypeDeclaration jContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!bodyDeclaration.equals(jContainer)) {
			for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(jContainer, NamedElement2NamedElement.class, "source")) {
				NamedElement tmpUContainer = ne2ne.getTarget();
				if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
					for (NamedElement2NamedElement me2op : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(method, NamedElement2NamedElement.class, "source")) {
						if (!me2op.equals(ne2ne)) {
							NamedElement tmpOperation = me2op.getTarget();
							if (tmpOperation instanceof Operation) {
								Operation operation = (Operation) tmpOperation;
								_result.add(new Object[] { method, me2op, bodyDeclaration, modifier, uContainer,
										jContainer, operation, ne2ne, match });
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_3_findcontext_blackBBBBBBBB(
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, MClass bodyDeclaration,
			Modifier modifier, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, NamedElement2NamedElement ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!me2op.equals(ne2ne)) {
			if (!bodyDeclaration.equals(jContainer)) {
				if (operation.equals(me2op.getTarget())) {
					if (uContainer.getOwnedOperations().contains(operation)) {
						if (jContainer.getBodyDeclarations().contains(method)) {
							if (uContainer.equals(ne2ne.getTarget())) {
								if (method.getMInnerTypes().contains(bodyDeclaration)) {
									if (jContainer.equals(ne2ne.getSource())) {
										if (modifier.equals(bodyDeclaration.getModifier())) {
											if (method.equals(me2op.getSource())) {
												_result.add(new Object[] { method, me2op, bodyDeclaration, modifier,
														uContainer, jContainer, operation, ne2ne });
											}
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFFF(
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, MClass bodyDeclaration,
			Modifier modifier, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, NamedElement2NamedElement ne2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge me2op__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__operation____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__uContainer____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge me2op__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String me2op__operation____target_name_prime = "target";
		String uContainer__operation____ownedOperation_name_prime = "ownedOperation";
		String operation__uContainer____class_name_prime = "class";
		String jContainer__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String ne2ne__uContainer____target_name_prime = "target";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String ne2ne__jContainer____source_name_prime = "source";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String me2op__method____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(me2op);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		me2op__operation____target.setSrc(me2op);
		me2op__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(me2op__operation____target);
		uContainer__operation____ownedOperation.setSrc(uContainer);
		uContainer__operation____ownedOperation.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(uContainer__operation____ownedOperation);
		operation__uContainer____class.setSrc(operation);
		operation__uContainer____class.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(operation__uContainer____class);
		jContainer__method____bodyDeclarations.setSrc(jContainer);
		jContainer__method____bodyDeclarations.setTrg(method);
		isApplicableMatch.getAllContextElements().add(jContainer__method____bodyDeclarations);
		method__jContainer____abstractTypeDeclaration.setSrc(method);
		method__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(method__jContainer____abstractTypeDeclaration);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(method__bodyDeclaration____mInnerTypes);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier__bodyDeclaration____bodyDeclaration);
		me2op__method____source.setSrc(me2op);
		me2op__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(me2op__method____source);
		me2op__operation____target.setName(me2op__operation____target_name_prime);
		uContainer__operation____ownedOperation.setName(uContainer__operation____ownedOperation_name_prime);
		operation__uContainer____class.setName(operation__uContainer____class_name_prime);
		jContainer__method____bodyDeclarations.setName(jContainer__method____bodyDeclarations_name_prime);
		method__jContainer____abstractTypeDeclaration.setName(method__jContainer____abstractTypeDeclaration_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		me2op__method____source.setName(me2op__method____source_name_prime);
		return new Object[] { method, me2op, bodyDeclaration, modifier, uContainer, jContainer, operation, ne2ne,
				isApplicableMatch, me2op__operation____target, uContainer__operation____ownedOperation,
				operation__uContainer____class, jContainer__method____bodyDeclarations,
				method__jContainer____abstractTypeDeclaration, ne2ne__uContainer____target,
				method__bodyDeclaration____mInnerTypes, ne2ne__jContainer____source,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				me2op__method____source };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_bindingFBBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, MClass bodyDeclaration,
			Modifier modifier, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, NamedElement2NamedElement ne2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, method, me2op, bodyDeclaration,
				modifier, uContainer, jContainer, operation, ne2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, me2op, bodyDeclaration, modifier, uContainer,
					jContainer, operation, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, MClass bodyDeclaration,
			Modifier modifier, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, NamedElement2NamedElement ne2ne) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, method, me2op, bodyDeclaration, modifier, uContainer, jContainer, operation,
				ne2ne);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, me2op, bodyDeclaration, modifier,
						uContainer, jContainer, operation, ne2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_5_checkCSP_expressionFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_1_initialbindings_blackBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match,
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		if (!feature.equals(uContainer)) {
			return new Object[] { _this, match, feature, uContainer, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_bindingFBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match,
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uContainer, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uContainer, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_bindingAndBlackFBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match,
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_bindingFBBBBB(
				_this, match, feature, uContainer, operation);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uContainer, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_3_CheckCSP_expressionFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_4_collectelementstobetranslated_blackBBBB(
			Match match, org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {
		if (!feature.equals(uContainer)) {
			return new Object[] { match, feature, uContainer, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer) {
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		match.getToBeTranslatedEdges().add(uContainer__feature____nestedClassifier);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		return new Object[] { match, feature, uContainer, uContainer__feature____nestedClassifier };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_5_collectcontextelements_blackBBBB(
			Match match, org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {
		if (!feature.equals(uContainer)) {
			return new Object[] { match, feature, uContainer, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_5_collectcontextelements_greenBBBFF(
			Match match, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		EMoflonEdge uContainer__operation____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__uContainer____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(uContainer);
		match.getContextNodes().add(operation);
		String uContainer__operation____ownedOperation_name_prime = "ownedOperation";
		String operation__uContainer____class_name_prime = "class";
		uContainer__operation____ownedOperation.setSrc(uContainer);
		uContainer__operation____ownedOperation.setTrg(operation);
		match.getContextEdges().add(uContainer__operation____ownedOperation);
		operation__uContainer____class.setSrc(operation);
		operation__uContainer____class.setTrg(uContainer);
		match.getContextEdges().add(operation__uContainer____class);
		uContainer__operation____ownedOperation.setName(uContainer__operation____ownedOperation_name_prime);
		operation__uContainer____class.setName(operation__uContainer____class_name_prime);
		return new Object[] { match, uContainer, operation, uContainer__operation____ownedOperation,
				operation__uContainer____class };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_6_registerobjectstomatch_expressionBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match,
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		_this.registerObjectsToMatch_BWD(match, feature, uContainer, operation);

	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("method");
		EObject _localVariable_2 = isApplicableMatch.getObject("me2op");
		EObject _localVariable_3 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_5 = isApplicableMatch.getObject("operation");
		EObject _localVariable_6 = isApplicableMatch.getObject("ne2ne");
		EObject tmpFeature = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpMe2op = _localVariable_2;
		EObject tmpUContainer = _localVariable_3;
		EObject tmpJContainer = _localVariable_4;
		EObject tmpOperation = _localVariable_5;
		EObject tmpNe2ne = _localVariable_6;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpMethod instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
				if (tmpMe2op instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement me2op = (NamedElement2NamedElement) tmpMe2op;
					if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
						if (tmpJContainer instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
							if (tmpOperation instanceof Operation) {
								Operation operation = (Operation) tmpOperation;
								if (tmpNe2ne instanceof NamedElement2NamedElement) {
									NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
									return new Object[] { feature, method, me2op, uContainer, jContainer, operation,
											ne2ne, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_blackBBBBBBBFBB(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, NamedElement2NamedElement me2op,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne, InnerClassDeclaration2InnerClass_InMethod_withModifier _this,
			IsApplicableMatch isApplicableMatch) {
		if (!feature.equals(uContainer)) {
			if (!me2op.equals(ne2ne)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { feature, method, me2op, uContainer, jContainer, operation, ne2ne, csp,
								_this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[1];
			NamedElement2NamedElement me2op = (NamedElement2NamedElement) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[3];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[4];
			Operation operation = (Operation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[5];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[6];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_blackBBBBBBBFBB(
					feature, method, me2op, uContainer, jContainer, operation, ne2ne, _this, isApplicableMatch);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_black[7];

				return new Object[] { feature, method, me2op, uContainer, jContainer, operation, ne2ne, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_greenFBFBFFFB(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MClass bodyDeclaration = ModiscoFactory.eINSTANCE.createMClass();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_1 = csp.getValue("modifier", "visibility");
		m2f.setTarget(feature);
		bd2ne.setTarget(feature);
		b2e.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		method.getMInnerTypes().add(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_1;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		modifier.setVisibility(modifier_visibility_prime);
		return new Object[] { m2f, feature, bd2ne, method, b2e, bodyDeclaration, modifier, csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_2_collecttranslatedelements_blackBBBBBB(
			Modifier2NamedElement m2f, org.eclipse.uml2.uml.Class feature, NamedElement2NamedElement bd2ne,
			ASTNode2Element b2e, MClass bodyDeclaration, Modifier modifier) {
		return new Object[] { m2f, feature, bd2ne, b2e, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_2_collecttranslatedelements_greenFBBBBBB(
			Modifier2NamedElement m2f, org.eclipse.uml2.uml.Class feature, NamedElement2NamedElement bd2ne,
			ASTNode2Element b2e, MClass bodyDeclaration, Modifier modifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(m2f);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getCreatedElements().add(modifier);
		return new Object[] { ruleresult, m2f, feature, bd2ne, b2e, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne, EObject method, EObject b2e,
			EObject me2op, EObject bodyDeclaration, EObject modifier, EObject uContainer, EObject jContainer,
			EObject operation, EObject ne2ne) {
		if (!m2f.equals(method)) {
			if (!m2f.equals(me2op)) {
				if (!m2f.equals(modifier)) {
					if (!m2f.equals(uContainer)) {
						if (!m2f.equals(operation)) {
							if (!m2f.equals(ne2ne)) {
								if (!feature.equals(m2f)) {
									if (!feature.equals(method)) {
										if (!feature.equals(me2op)) {
											if (!feature.equals(modifier)) {
												if (!feature.equals(uContainer)) {
													if (!feature.equals(jContainer)) {
														if (!feature.equals(operation)) {
															if (!feature.equals(ne2ne)) {
																if (!bd2ne.equals(m2f)) {
																	if (!bd2ne.equals(feature)) {
																		if (!bd2ne.equals(method)) {
																			if (!bd2ne.equals(me2op)) {
																				if (!bd2ne.equals(bodyDeclaration)) {
																					if (!bd2ne.equals(modifier)) {
																						if (!bd2ne.equals(uContainer)) {
																							if (!bd2ne.equals(
																									jContainer)) {
																								if (!bd2ne.equals(
																										operation)) {
																									if (!bd2ne.equals(
																											ne2ne)) {
																										if (!method
																												.equals(modifier)) {
																											if (!method
																													.equals(uContainer)) {
																												if (!method
																														.equals(operation)) {
																													if (!method
																															.equals(ne2ne)) {
																														if (!b2e.equals(
																																m2f)) {
																															if (!b2e.equals(
																																	feature)) {
																																if (!b2e.equals(
																																		bd2ne)) {
																																	if (!b2e.equals(
																																			method)) {
																																		if (!b2e.equals(
																																				me2op)) {
																																			if (!b2e.equals(
																																					bodyDeclaration)) {
																																				if (!b2e.equals(
																																						modifier)) {
																																					if (!b2e.equals(
																																							uContainer)) {
																																						if (!b2e.equals(
																																								jContainer)) {
																																							if (!b2e.equals(
																																									operation)) {
																																								if (!b2e.equals(
																																										ne2ne)) {
																																									if (!me2op
																																											.equals(method)) {
																																										if (!me2op
																																												.equals(modifier)) {
																																											if (!me2op
																																													.equals(uContainer)) {
																																												if (!me2op
																																														.equals(operation)) {
																																													if (!me2op
																																															.equals(ne2ne)) {
																																														if (!bodyDeclaration
																																																.equals(m2f)) {
																																															if (!bodyDeclaration
																																																	.equals(feature)) {
																																																if (!bodyDeclaration
																																																		.equals(method)) {
																																																	if (!bodyDeclaration
																																																			.equals(me2op)) {
																																																		if (!bodyDeclaration
																																																				.equals(modifier)) {
																																																			if (!bodyDeclaration
																																																					.equals(uContainer)) {
																																																				if (!bodyDeclaration
																																																						.equals(jContainer)) {
																																																					if (!bodyDeclaration
																																																							.equals(operation)) {
																																																						if (!bodyDeclaration
																																																								.equals(ne2ne)) {
																																																							if (!modifier
																																																									.equals(uContainer)) {
																																																								if (!modifier
																																																										.equals(operation)) {
																																																									if (!modifier
																																																											.equals(ne2ne)) {
																																																										if (!jContainer
																																																												.equals(m2f)) {
																																																											if (!jContainer
																																																													.equals(method)) {
																																																												if (!jContainer
																																																														.equals(me2op)) {
																																																													if (!jContainer
																																																															.equals(modifier)) {
																																																														if (!jContainer
																																																																.equals(uContainer)) {
																																																															if (!jContainer
																																																																	.equals(operation)) {
																																																																if (!jContainer
																																																																		.equals(ne2ne)) {
																																																																	if (!operation
																																																																			.equals(uContainer)) {
																																																																		if (!ne2ne
																																																																				.equals(uContainer)) {
																																																																			if (!ne2ne
																																																																					.equals(operation)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						m2f,
																																																																						feature,
																																																																						bd2ne,
																																																																						method,
																																																																						b2e,
																																																																						me2op,
																																																																						bodyDeclaration,
																																																																						modifier,
																																																																						uContainer,
																																																																						jContainer,
																																																																						operation,
																																																																						ne2ne };
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne, EObject method, EObject b2e,
			EObject bodyDeclaration, EObject modifier, EObject uContainer) {
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String m2f__feature____target_name_prime = "target";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uContainer__feature____nestedClassifier);
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(method__bodyDeclaration____mInnerTypes);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getCreatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, bd2ne, method, b2e, bodyDeclaration, modifier, uContainer,
				bd2ne__bodyDeclaration____source, bd2ne__feature____target, uContainer__feature____nestedClassifier,
				method__bodyDeclaration____mInnerTypes, m2f__feature____target, bodyDeclaration__modifier____modifier,
				modifier__bodyDeclaration____bodyDeclaration, b2e__bodyDeclaration____source, m2f__modifier____source,
				b2e__feature____target };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, PerformRuleResult ruleresult, EObject m2f,
			EObject feature, EObject bd2ne, EObject method, EObject b2e, EObject me2op, EObject bodyDeclaration,
			EObject modifier, EObject uContainer, EObject jContainer, EObject operation, EObject ne2ne) {
		_this.registerObjects_BWD(ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier,
				uContainer, jContainer, operation, ne2ne);

	}

	public static final PerformRuleResult pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_bindingFB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_bindingAndBlackFFB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_2_corematch_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uContainer");
		EObject _localVariable_2 = match.getObject("operation");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
				if (tmpOperation instanceof Operation) {
					Operation operation = (Operation) tmpOperation;
					return new Object[] { feature, uContainer, operation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_2_corematch_blackBFFBFBFB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, Operation operation,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			for (NamedElement2NamedElement me2op : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(operation, NamedElement2NamedElement.class, "target")) {
				org.eclipse.modisco.java.NamedElement tmpMethod = me2op.getSource();
				if (tmpMethod instanceof MAbstractMethodDefinition) {
					MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
					for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(uContainer, NamedElement2NamedElement.class, "target")) {
						if (!me2op.equals(ne2ne)) {
							org.eclipse.modisco.java.NamedElement tmpJContainer = ne2ne.getSource();
							if (tmpJContainer instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
								_result.add(new Object[] { feature, method, me2op, uContainer, jContainer, operation,
										ne2ne, match });
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_3_findcontext_blackBBBBBBB(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, NamedElement2NamedElement me2op,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			if (!me2op.equals(ne2ne)) {
				if (operation.equals(me2op.getTarget())) {
					if (uContainer.getOwnedOperations().contains(operation)) {
						if (jContainer.getBodyDeclarations().contains(method)) {
							if (uContainer.getNestedClassifiers().contains(feature)) {
								if (uContainer.equals(ne2ne.getTarget())) {
									if (jContainer.equals(ne2ne.getSource())) {
										if (method.equals(me2op.getSource())) {
											_result.add(new Object[] { feature, method, me2op, uContainer, jContainer,
													operation, ne2ne });
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, NamedElement2NamedElement me2op,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge me2op__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__operation____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__uContainer____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge me2op__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String me2op__operation____target_name_prime = "target";
		String uContainer__operation____ownedOperation_name_prime = "ownedOperation";
		String operation__uContainer____class_name_prime = "class";
		String jContainer__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String ne2ne__uContainer____target_name_prime = "target";
		String ne2ne__jContainer____source_name_prime = "source";
		String me2op__method____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(me2op);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		me2op__operation____target.setSrc(me2op);
		me2op__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(me2op__operation____target);
		uContainer__operation____ownedOperation.setSrc(uContainer);
		uContainer__operation____ownedOperation.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(uContainer__operation____ownedOperation);
		operation__uContainer____class.setSrc(operation);
		operation__uContainer____class.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(operation__uContainer____class);
		jContainer__method____bodyDeclarations.setSrc(jContainer);
		jContainer__method____bodyDeclarations.setTrg(method);
		isApplicableMatch.getAllContextElements().add(jContainer__method____bodyDeclarations);
		method__jContainer____abstractTypeDeclaration.setSrc(method);
		method__jContainer____abstractTypeDeclaration.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(method__jContainer____abstractTypeDeclaration);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uContainer__feature____nestedClassifier);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		me2op__method____source.setSrc(me2op);
		me2op__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(me2op__method____source);
		me2op__operation____target.setName(me2op__operation____target_name_prime);
		uContainer__operation____ownedOperation.setName(uContainer__operation____ownedOperation_name_prime);
		operation__uContainer____class.setName(operation__uContainer____class_name_prime);
		jContainer__method____bodyDeclarations.setName(jContainer__method____bodyDeclarations_name_prime);
		method__jContainer____abstractTypeDeclaration.setName(method__jContainer____abstractTypeDeclaration_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		me2op__method____source.setName(me2op__method____source_name_prime);
		return new Object[] { feature, method, me2op, uContainer, jContainer, operation, ne2ne, isApplicableMatch,
				me2op__operation____target, uContainer__operation____ownedOperation, operation__uContainer____class,
				jContainer__method____bodyDeclarations, method__jContainer____abstractTypeDeclaration,
				uContainer__feature____nestedClassifier, ne2ne__uContainer____target, ne2ne__jContainer____source,
				me2op__method____source };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_bindingFBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, NamedElement2NamedElement me2op,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, method, me2op, uContainer,
				jContainer, operation, ne2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, method, me2op, uContainer, jContainer,
					operation, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, NamedElement2NamedElement me2op,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, feature, method, me2op, uContainer, jContainer, operation, ne2ne);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, method, me2op, uContainer, jContainer,
						operation, ne2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_5_checkCSP_expressionFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_bindingFB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.uml2.uml.Class feature) {
		for (org.eclipse.uml2.uml.Package __DEC_feature_packagedElement_135551 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_2_testcorematchandDECs_black_nac_1B(
			org.eclipse.uml2.uml.Class feature) {
		for (Interface __DEC_feature_nestedClassifier_756058 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_nestedClassifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUContainer = _edge_nestedClassifier.getSrc();
		if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
			EObject tmpFeature = _edge_nestedClassifier.getTrg();
			if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
				if (!feature.equals(uContainer)) {
					if (uContainer.getNestedClassifiers().contains(feature)) {
						if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_2_testcorematchandDECs_black_nac_0B(
								feature) == null) {
							if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_2_testcorematchandDECs_black_nac_1B(
									feature) == null) {
								for (Operation operation : uContainer.getOwnedOperations()) {
									_result.add(
											new Object[] { feature, uContainer, operation, _edge_nestedClassifier });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match,
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uContainer, operation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_bindingFB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_0BB(
			MClass bodyDeclaration, AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_89420 = bodyDeclaration
					.getAbstractTypeDeclaration();
			if (__DEC_bodyDeclaration_bodyDeclarations_89420 != null) {
				if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_89420)) {
					if (!jContainer.equals(__DEC_bodyDeclaration_bodyDeclarations_89420)) {
						return new Object[] { bodyDeclaration, jContainer };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_1B(
			MClass bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_815568 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_815568 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_2B(
			MClass bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_828615 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_828615 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_3BB(
			MClass bodyDeclaration, MAbstractMethodDefinition method) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_683863 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!method.equals(__DEC_bodyDeclaration_mInnerTypes_683863)) {
				return new Object[] { bodyDeclaration, method };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_mInnerTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMethod = _edge_mInnerTypes.getSrc();
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			EObject tmpBodyDeclaration = _edge_mInnerTypes.getTrg();
			if (tmpBodyDeclaration instanceof MClass) {
				MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
				if (method.getMInnerTypes().contains(bodyDeclaration)) {
					AbstractTypeDeclaration jContainer = method.getAbstractTypeDeclaration();
					if (jContainer != null) {
						if (!bodyDeclaration.equals(jContainer)) {
							Modifier modifier = bodyDeclaration.getModifier();
							if (modifier != null) {
								if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_1B(
										bodyDeclaration) == null) {
									if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_2B(
											bodyDeclaration) == null) {
										if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_3BB(
												bodyDeclaration, method) == null) {
											if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_0BB(
													bodyDeclaration, jContainer) == null) {
												_result.add(new Object[] { method, bodyDeclaration, modifier,
														jContainer, _edge_mInnerTypes });
											}
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier, AbstractTypeDeclaration jContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, method, bodyDeclaration, modifier, jContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_1_prepare_blackB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("method");
		EObject _localVariable_2 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = sourceMatch.getObject("modifier");
		EObject _localVariable_4 = targetMatch.getObject("uContainer");
		EObject _localVariable_5 = sourceMatch.getObject("jContainer");
		EObject _localVariable_6 = targetMatch.getObject("operation");
		EObject tmpFeature = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpModifier = _localVariable_3;
		EObject tmpUContainer = _localVariable_4;
		EObject tmpJContainer = _localVariable_5;
		EObject tmpOperation = _localVariable_6;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpMethod instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
				if (tmpBodyDeclaration instanceof MClass) {
					MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
					if (tmpModifier instanceof Modifier) {
						Modifier modifier = (Modifier) tmpModifier;
						if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
							if (tmpJContainer instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
								if (tmpOperation instanceof Operation) {
									Operation operation = (Operation) tmpOperation;
									return new Object[] { feature, method, bodyDeclaration, modifier, uContainer,
											jContainer, operation, targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, MClass bodyDeclaration,
			Modifier modifier, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, Match sourceMatch, Match targetMatch) {
		if (!feature.equals(uContainer)) {
			if (!bodyDeclaration.equals(jContainer)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { feature, method, bodyDeclaration, modifier, uContainer, jContainer, operation,
							sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[1];
			MClass bodyDeclaration = (MClass) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[2];
			Modifier modifier = (Modifier) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[3];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[4];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[5];
			Operation operation = (Operation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					feature, method, bodyDeclaration, modifier, uContainer, jContainer, operation, sourceMatch,
					targetMatch);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, method, bodyDeclaration, modifier, uContainer, jContainer, operation,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_bindingFBBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, org.eclipse.uml2.uml.Class feature,
			MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(feature, method, bodyDeclaration, modifier, uContainer,
				jContainer, operation, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, feature, method, bodyDeclaration, modifier, uContainer, jContainer,
					operation, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, org.eclipse.uml2.uml.Class feature,
			MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, feature, method, bodyDeclaration, modifier, uContainer, jContainer, operation, sourceMatch,
				targetMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, method, bodyDeclaration, modifier, uContainer, jContainer,
						operation, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_4_checkCSP_expressionFB(
			CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_5_matchcorrcontext_blackBFBBBFBB(
			MAbstractMethodDefinition method, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (NamedElement2NamedElement me2op : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(operation, NamedElement2NamedElement.class, "target")) {
				if (method.equals(me2op.getSource())) {
					for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(uContainer, NamedElement2NamedElement.class, "target")) {
						if (!me2op.equals(ne2ne)) {
							if (jContainer.equals(ne2ne.getSource())) {
								_result.add(new Object[] { method, me2op, uContainer, jContainer, operation, ne2ne,
										sourceMatch, targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_5_matchcorrcontext_greenBBBBF(
			NamedElement2NamedElement me2op, NamedElement2NamedElement ne2ne, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(me2op);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { me2op, ne2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_6_createcorrespondence_blackBBBBBBBB(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, MClass bodyDeclaration,
			Modifier modifier, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, CCMatch ccMatch) {
		if (!feature.equals(uContainer)) {
			if (!bodyDeclaration.equals(jContainer)) {
				return new Object[] { feature, method, bodyDeclaration, modifier, uContainer, jContainer, operation,
						ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_6_createcorrespondence_greenFBFFBBB(
			org.eclipse.uml2.uml.Class feature, MClass bodyDeclaration, Modifier modifier, CCMatch ccMatch) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		m2f.setTarget(feature);
		m2f.setSource(modifier);
		ccMatch.getCreateCorr().add(m2f);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		ccMatch.getCreateCorr().add(bd2ne);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		return new Object[] { m2f, feature, bd2ne, b2e, bodyDeclaration, modifier, ccMatch };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_0BB(
			MClass bodyDeclaration, AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_915794 = bodyDeclaration
					.getAbstractTypeDeclaration();
			if (__DEC_bodyDeclaration_bodyDeclarations_915794 != null) {
				if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_915794)) {
					if (!jContainer.equals(__DEC_bodyDeclaration_bodyDeclarations_915794)) {
						return new Object[] { bodyDeclaration, jContainer };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_1B(
			MClass bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_972550 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_972550 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_2B(
			MClass bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_739524 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_739524 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_3BB(
			MClass bodyDeclaration, MAbstractMethodDefinition method) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_452769 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!method.equals(__DEC_bodyDeclaration_mInnerTypes_452769)) {
				return new Object[] { bodyDeclaration, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_blackBBBB(
			MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier,
			AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			if (jContainer.getBodyDeclarations().contains(method)) {
				if (method.getMInnerTypes().contains(bodyDeclaration)) {
					if (modifier.equals(bodyDeclaration.getModifier())) {
						if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_0BB(
								bodyDeclaration, jContainer) == null) {
							if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_1B(
									bodyDeclaration) == null) {
								if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_2B(
										bodyDeclaration) == null) {
									if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_3BB(
											bodyDeclaration, method) == null) {
										return new Object[] { method, bodyDeclaration, modifier, jContainer };
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

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_1_matchtggpattern_black_nac_0B(
			org.eclipse.uml2.uml.Class feature) {
		for (org.eclipse.uml2.uml.Package __DEC_feature_packagedElement_258090 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_1_matchtggpattern_black_nac_1B(
			org.eclipse.uml2.uml.Class feature) {
		for (Interface __DEC_feature_nestedClassifier_182105 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_1_matchtggpattern_blackBBB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		if (!feature.equals(uContainer)) {
			if (uContainer.getOwnedOperations().contains(operation)) {
				if (uContainer.getNestedClassifiers().contains(feature)) {
					if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_1_matchtggpattern_black_nac_0B(
							feature) == null) {
						if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_1_matchtggpattern_black_nac_1B(
								feature) == null) {
							return new Object[] { feature, uContainer, operation };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_1_createresult_blackB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement me2op) {
		if (ruleResult.getCorrObjects().contains(me2op)) {
			return new Object[] { ruleResult, me2op };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Operation operation) {
		if (ruleResult.getTargetObjects().contains(operation)) {
			return new Object[] { ruleResult, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration jContainer) {
		if (ruleResult.getSourceObjects().contains(jContainer)) {
			return new Object[] { ruleResult, jContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList me2opList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMe2op : me2opList.getEntryObjects()) {
				if (tmpMe2op instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement me2op = (NamedElement2NamedElement) tmpMe2op;
					org.eclipse.modisco.java.NamedElement tmpMethod = me2op.getSource();
					if (tmpMethod instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
						NamedElement tmpOperation = me2op.getTarget();
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							AbstractTypeDeclaration jContainer = method.getAbstractTypeDeclaration();
							if (jContainer != null) {
								org.eclipse.uml2.uml.Class uContainer = operation.getClass_();
								if (uContainer != null) {
									if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, me2op) == null) {
										if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, method) == null) {
											if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, operation) == null) {
												if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_5BB(
														ruleResult, jContainer) == null) {
													if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_3BB(
															ruleResult, uContainer) == null) {
														for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(jContainer,
																		NamedElement2NamedElement.class, "source")) {
															if (!me2op.equals(ne2ne)) {
																if (uContainer.equals(ne2ne.getTarget())) {
																	if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, ne2ne) == null) {
																		_result.add(new Object[] { me2opList, method,
																				me2op, operation, uContainer, ne2ne,
																				jContainer, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_bindingFBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, method, me2op, uContainer,
				jContainer, operation, ne2ne, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, me2op, uContainer, jContainer, operation,
					ne2ne, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, method, me2op, uContainer, jContainer, operation, ne2ne, ruleResult);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, me2op, uContainer, jContainer, operation,
						ne2ne, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_4_checkCSP_expressionFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_5_checknacs_blackBBBBBB(
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne) {
		if (!me2op.equals(ne2ne)) {
			return new Object[] { method, me2op, uContainer, jContainer, operation, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_6_perform_blackBBBBBBB(
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne,
			ModelgeneratorRuleResult ruleResult) {
		if (!me2op.equals(ne2ne)) {
			return new Object[] { method, me2op, uContainer, jContainer, operation, ne2ne, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_6_perform_greenFFFBFFFBBB(
			MAbstractMethodDefinition method, org.eclipse.uml2.uml.Class uContainer,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Modifier2NamedElement m2f = UmlFactory.eINSTANCE.createModifier2NamedElement();
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MClass bodyDeclaration = ModiscoFactory.eINSTANCE.createMClass();
		Modifier modifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("feature", "visibility");
		Object _localVariable_2 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_3 = csp.getValue("modifier", "visibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(m2f);
		uContainer.getNestedClassifiers().add(feature);
		m2f.setTarget(feature);
		ruleResult.getTargetObjects().add(feature);
		bd2ne.setTarget(feature);
		ruleResult.getCorrObjects().add(bd2ne);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		bd2ne.setSource(bodyDeclaration);
		method.getMInnerTypes().add(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		ruleResult.getSourceObjects().add(modifier);
		String feature_name_prime = (String) _localVariable_0;
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_1;
		String bodyDeclaration_name_prime = (String) _localVariable_2;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		feature.setName(feature_name_prime);
		feature.setVisibility(feature_visibility_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		modifier.setVisibility(modifier_visibility_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { m2f, feature, bd2ne, method, b2e, bodyDeclaration, modifier, uContainer, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
