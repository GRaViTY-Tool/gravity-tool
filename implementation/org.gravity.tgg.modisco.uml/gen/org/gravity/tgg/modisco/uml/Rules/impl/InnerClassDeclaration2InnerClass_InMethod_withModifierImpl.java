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

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
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
			Modifier modifier) {

		Object[] result1_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_1_initialbindings_blackBBBBB(this,
						match, method, bodyDeclaration, modifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
		}

		Object[] result2_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_bindingAndBlackFBBBBB(this,
						match, method, bodyDeclaration, modifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[modifier] = " + modifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_4_collectelementstobetranslated_blackBBBB(
							match, method, bodyDeclaration, modifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[modifier] = " + modifier + ".");
			}
			InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_4_collectelementstobetranslated_greenBBBBFFF(
							match, method, bodyDeclaration, modifier);
			//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result4_green[6];

			Object[] result5_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_5_collectcontextelements_blackBBBB(
							match, method, bodyDeclaration, modifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[modifier] = " + modifier + ".");
			}
			InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_5_collectcontextelements_greenBB(
							match, method);

			// 
			InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_6_registerobjectstomatch_expressionBBBBB(
							this, match, method, bodyDeclaration, modifier);
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
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[0];
		ASTNode2Element me2op = (ASTNode2Element) result1_bindingAndBlack[1];
		MClass bodyDeclaration = (MClass) result1_bindingAndBlack[2];
		Modifier modifier = (Modifier) result1_bindingAndBlack[3];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[4];
		Operation operation = (Operation) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
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
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
						ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier, uContainer,
						operation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", "
					+ "[method] = " + method + ", " + "[b2e] = " + b2e + ", " + "[me2op] = " + me2op + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
					+ "[uContainer] = " + uContainer + ", " + "[operation] = " + operation + ".");
		}
		InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
						ruleresult, m2f, feature, bd2ne, method, b2e, bodyDeclaration, modifier, uContainer);
		//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[18];

		// 
		// 
		InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_5_registerobjects_expressionBBBBBBBBBBBB(
						this, ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier,
						uContainer, operation);
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
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_binding[0];
		MClass bodyDeclaration = (MClass) result2_binding[1];
		Modifier modifier = (Modifier) result2_binding[2];
		for (Object[] result2_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_2_corematch_blackBFBBFB(method,
						bodyDeclaration, modifier, match)) {
			ASTNode2Element me2op = (ASTNode2Element) result2_black[1];
			Operation operation = (Operation) result2_black[4];
			// ForEach 
			for (Object[] result3_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_3_findcontext_blackBBBBFB(method,
							me2op, bodyDeclaration, modifier, operation)) {
				org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result3_black[4];
				Object[] result3_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_3_findcontext_greenBBBBBBFFFFFFFF(
								method, me2op, bodyDeclaration, modifier, uContainer, operation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge me2op__operation____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge me2op__method____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
								this, isApplicableMatch, method, me2op, bodyDeclaration, modifier, uContainer,
								operation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[me2op] = " + me2op + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[modifier] = " + modifier + ", " + "[uContainer] = " + uContainer + ", "
							+ "[operation] = " + operation + ".");
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
			Modifier modifier) {
		match.registerObject("method", method);
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("modifier", modifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MAbstractMethodDefinition method, MClass bodyDeclaration,
			Modifier modifier) {// Create CSP
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
			ASTNode2Element me2op, MClass bodyDeclaration, Modifier modifier, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");

		// Create unbound variables
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("me2op", me2op);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("modifier", modifier);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("operation", operation);
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
			EObject operation) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("me2op", me2op);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("operation", operation);

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
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_bindingAndBlackFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[1];
		ASTNode2Element me2op = (ASTNode2Element) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		Operation operation = (Operation) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
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
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
						ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier, uContainer,
						operation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[m2f] = " + m2f + ", " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne + ", "
					+ "[method] = " + method + ", " + "[b2e] = " + b2e + ", " + "[me2op] = " + me2op + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[modifier] = " + modifier + ", "
					+ "[uContainer] = " + uContainer + ", " + "[operation] = " + operation + ".");
		}
		InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
						ruleresult, m2f, feature, bd2ne, method, b2e, bodyDeclaration, modifier, uContainer);
		//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge bodyDeclaration__modifier____modifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge m2f__feature____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge m2f__modifier____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[18];

		// 
		// 
		InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_5_registerobjects_expressionBBBBBBBBBBBB(
						this, ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier,
						uContainer, operation);
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
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_2_corematch_blackBFFBBB(feature,
						uContainer, operation, match)) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[1];
			ASTNode2Element me2op = (ASTNode2Element) result2_black[2];
			// ForEach 
			for (Object[] result3_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_3_findcontext_blackBBBBB(feature,
							method, me2op, uContainer, operation)) {
				Object[] result3_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_3_findcontext_greenBBBBBFFFFFF(
								feature, method, me2op, uContainer, operation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge me2op__operation____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge me2op__method____source = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_bindingAndBlackFBBBBBBB(
								this, isApplicableMatch, feature, method, me2op, uContainer, operation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[method] = " + method + ", " + "[me2op] = " + me2op + ", " + "[uContainer] = "
							+ uContainer + ", " + "[operation] = " + operation + ".");
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
			MAbstractMethodDefinition method, ASTNode2Element me2op, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");

		// Create constraints
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("me2op", me2op);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("operation", operation);
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
			EObject operation) {
		ruleresult.registerObject("m2f", m2f);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("me2op", me2op);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("modifier", modifier);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("operation", operation);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_397(EMoflonEdge _edge_nestedClassifier) {

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_408(EMoflonEdge _edge_mInnerTypes) {

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
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_blackFFFB(
						_edge_mInnerTypes)) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[0];
			MClass bodyDeclaration = (MClass) result2_black[1];
			Modifier modifier = (Modifier) result2_black[2];
			Object[] result2_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, method, bodyDeclaration, modifier)) {
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

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		JVisibility2umlVisibility jVisibility2umlVisibility0 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		jVisibility2umlVisibility0.setRuleName("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		jVisibility2umlVisibility0.solve(var_modifier_visibility, var_feature_visibility);

		eq1.setRuleName("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		eq1.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_visibility.setBound(false);
			var_feature_name.setBound(false);
			jVisibility2umlVisibility0.solve(var_modifier_visibility, var_feature_visibility);
			eq1.solve(var_bodyDeclaration_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "visibility", var_feature_visibility.getValue());
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
		ruleResult.setRule("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_visibility.setValue(__helper.getValue("feature", "visibility"));
		var_feature_visibility.setType("uml.VisibilityKind");

		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier", true, csp);
		var_modifier_visibility.setValue(__helper.getValue("modifier", "visibility"));
		var_modifier_visibility.setType("java.VisibilityKind");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		JVisibility2umlVisibility jVisibility2umlVisibility0 = new JVisibility2umlVisibility();
		csp.getConstraints().add(jVisibility2umlVisibility0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		jVisibility2umlVisibility0.setRuleName("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		jVisibility2umlVisibility0.solve(var_modifier_visibility, var_feature_visibility);

		eq1.setRuleName("InnerClassDeclaration2InnerClass_InMethod_withModifier");
		eq1.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_modifier_visibility.setBound(false);
			var_bodyDeclaration_name.setBound(false);
			jVisibility2umlVisibility0.solve(var_modifier_visibility, var_feature_visibility);
			eq1.solve(var_bodyDeclaration_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("modifier", "visibility", var_modifier_visibility.getValue());
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

		Object[] result1_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
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
		Operation operation = (Operation) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
						this, feature, method, bodyDeclaration, modifier, uContainer, operation, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[modifier] = " + modifier + ", " + "[uContainer] = " + uContainer + ", "
					+ "[operation] = " + operation + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_5_matchcorrcontext_blackBFBBB(
							method, operation, sourceMatch, targetMatch)) {
				ASTNode2Element me2op = (ASTNode2Element) result5_black[1];
				Object[] result5_green = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_5_matchcorrcontext_greenBBBF(
								me2op, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_6_createcorrespondence_blackBBBBBBB(
								feature, method, bodyDeclaration, modifier, uContainer, operation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[modifier] = " + modifier + ", " + "[uContainer] = " + uContainer + ", "
							+ "[operation] = " + operation + ", " + "[ccMatch] = " + ccMatch + ".");
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
			MClass bodyDeclaration, Modifier modifier, org.eclipse.uml2.uml.Class uContainer, Operation operation,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", true, csp);
		var_modifier_visibility.setValue(modifier.getVisibility());
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", true, csp);
		var_feature_visibility.setValue(feature.getVisibility());
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables

		// Create constraints
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
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
	public boolean checkDEC_FWD(MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier) {// 
		Object[] result1_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_blackBBB(method,
						bodyDeclaration, modifier);
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
			ASTNode2Element me2opParameter) {

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
				.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_blackFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList me2opList = (RuleEntryList) result2_black[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[1];
			ASTNode2Element me2op = (ASTNode2Element) result2_black[2];
			Operation operation = (Operation) result2_black[3];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[4];

			Object[] result3_bindingAndBlack = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_bindingAndBlackFBBBBBBB(
							this, isApplicableMatch, method, me2op, uContainer, operation, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
						+ "[me2op] = " + me2op + ", " + "[uContainer] = " + uContainer + ", " + "[operation] = "
						+ operation + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
					.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_4_checkCSP_expressionFBB(this,
							csp)) {
				// 
				Object[] result5_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
						.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_5_checknacs_blackBBBB(method,
								me2op, uContainer, operation);
				if (result5_black != null) {

					Object[] result6_black = InnerClassDeclaration2InnerClass_InMethod_withModifierImpl
							.pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_6_perform_blackBBBBB(
									method, me2op, uContainer, operation, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
								+ ", " + "[me2op] = " + me2op + ", " + "[uContainer] = " + uContainer + ", "
								+ "[operation] = " + operation + ", " + "[ruleResult] = " + ruleResult + ".");
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
			ASTNode2Element me2op, org.eclipse.uml2.uml.Class uContainer, Operation operation,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_modifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("modifier.visibility", csp);
		var_modifier_visibility.setType("java.VisibilityKind");
		Variable var_feature_visibility = CSPFactoryHelper.eINSTANCE.createVariable("feature.visibility", csp);
		var_feature_visibility.setType("uml.VisibilityKind");
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		JVisibility2umlVisibility jVisibility2umlVisibility = new JVisibility2umlVisibility();
		Eq eq = new Eq();

		csp.getConstraints().add(jVisibility2umlVisibility);
		csp.getConstraints().add(eq);

		// Solve CSP
		jVisibility2umlVisibility.setRuleName("NoRuleName");
		jVisibility2umlVisibility.solve(var_modifier_visibility, var_feature_visibility);
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("me2op", me2op);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("operation", operation);
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
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_FWD__MATCH_MABSTRACTMETHODDEFINITION_MCLASS_MODIFIER:
			return isAppropriate_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(MClass) arguments.get(2), (Modifier) arguments.get(3));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MABSTRACTMETHODDEFINITION_MCLASS_MODIFIER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(MClass) arguments.get(2), (Modifier) arguments.get(3));
			return null;
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MABSTRACTMETHODDEFINITION_MCLASS_MODIFIER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(MClass) arguments.get(2), (Modifier) arguments.get(3));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_MCLASS_MODIFIER_CLASS_OPERATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(MClass) arguments.get(3), (Modifier) arguments.get(4),
					(org.eclipse.uml2.uml.Class) arguments.get(5), (Operation) arguments.get(6));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
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
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_CLASS_OPERATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (MAbstractMethodDefinition) arguments.get(2),
					(ASTNode2Element) arguments.get(3), (org.eclipse.uml2.uml.Class) arguments.get(4),
					(Operation) arguments.get(5));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_397__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_397((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_408__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_408((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_SOLVE_CSP_CC__CLASS_MABSTRACTMETHODDEFINITION_MCLASS_MODIFIER_CLASS_OPERATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Class) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (MClass) arguments.get(2),
					(Modifier) arguments.get(3), (org.eclipse.uml2.uml.Class) arguments.get(4),
					(Operation) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_DEC_FWD__MABSTRACTMETHODDEFINITION_MCLASS_MODIFIER:
			return checkDEC_FWD((MAbstractMethodDefinition) arguments.get(0), (MClass) arguments.get(1),
					(Modifier) arguments.get(2));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___CHECK_DEC_BWD__CLASS_CLASS_OPERATION:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (Operation) arguments.get(2));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_CLASS_OPERATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (Operation) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.INNER_CLASS_DECLARATION2_INNER_CLASS_IN_METHOD_WITH_MODIFIER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_1_initialbindings_blackBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier) {
		return new Object[] { _this, match, method, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_bindingFBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, method, bodyDeclaration, modifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, method, bodyDeclaration, modifier };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_bindingAndBlackFBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_bindingFBBBBB(
				_this, match, method, bodyDeclaration, modifier);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, method, bodyDeclaration, modifier };
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_4_collectelementstobetranslated_blackBBBB(
			Match match, MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier) {
		return new Object[] { match, method, bodyDeclaration, modifier };
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_5_collectcontextelements_blackBBBB(
			Match match, MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier) {
		return new Object[] { match, method, bodyDeclaration, modifier };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_5_collectcontextelements_greenBB(
			Match match, MAbstractMethodDefinition method) {
		match.getContextNodes().add(method);
		return new Object[] { match, method };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_6_registerobjectstomatch_expressionBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier) {
		_this.registerObjectsToMatch_FWD(match, method, bodyDeclaration, modifier);

	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("me2op");
		EObject _localVariable_2 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("modifier");
		EObject _localVariable_4 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_5 = isApplicableMatch.getObject("operation");
		EObject tmpMethod = _localVariable_0;
		EObject tmpMe2op = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpModifier = _localVariable_3;
		EObject tmpUContainer = _localVariable_4;
		EObject tmpOperation = _localVariable_5;
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			if (tmpMe2op instanceof ASTNode2Element) {
				ASTNode2Element me2op = (ASTNode2Element) tmpMe2op;
				if (tmpBodyDeclaration instanceof MClass) {
					MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
					if (tmpModifier instanceof Modifier) {
						Modifier modifier = (Modifier) tmpModifier;
						if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
							org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
							if (tmpOperation instanceof Operation) {
								Operation operation = (Operation) tmpOperation;
								return new Object[] { method, me2op, bodyDeclaration, modifier, uContainer, operation,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_blackBBBBBBFBB(
			MAbstractMethodDefinition method, ASTNode2Element me2op, MClass bodyDeclaration, Modifier modifier,
			org.eclipse.uml2.uml.Class uContainer, Operation operation,
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { method, me2op, bodyDeclaration, modifier, uContainer, operation, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding != null) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[0];
			ASTNode2Element me2op = (ASTNode2Element) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[1];
			MClass bodyDeclaration = (MClass) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[2];
			Modifier modifier = (Modifier) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[3];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[4];
			Operation operation = (Operation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_binding[5];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_blackBBBBBBFBB(
					method, me2op, bodyDeclaration, modifier, uContainer, operation, _this, isApplicableMatch);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_1_performtransformation_black[6];

				return new Object[] { method, me2op, bodyDeclaration, modifier, uContainer, operation, csp, _this,
						isApplicableMatch };
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
		Object _localVariable_0 = csp.getValue("feature", "visibility");
		Object _localVariable_1 = csp.getValue("feature", "name");
		m2f.setSource(modifier);
		m2f.setTarget(feature);
		uContainer.getNestedClassifiers().add(feature);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_0;
		String feature_name_prime = (String) _localVariable_1;
		feature.setVisibility(feature_visibility_prime);
		feature.setName(feature_name_prime);
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne, EObject method, EObject b2e,
			EObject me2op, EObject bodyDeclaration, EObject modifier, EObject uContainer, EObject operation) {
		if (!m2f.equals(method)) {
			if (!m2f.equals(me2op)) {
				if (!m2f.equals(modifier)) {
					if (!m2f.equals(uContainer)) {
						if (!m2f.equals(operation)) {
							if (!feature.equals(m2f)) {
								if (!feature.equals(method)) {
									if (!feature.equals(me2op)) {
										if (!feature.equals(modifier)) {
											if (!feature.equals(uContainer)) {
												if (!feature.equals(operation)) {
													if (!bd2ne.equals(m2f)) {
														if (!bd2ne.equals(feature)) {
															if (!bd2ne.equals(method)) {
																if (!bd2ne.equals(me2op)) {
																	if (!bd2ne.equals(bodyDeclaration)) {
																		if (!bd2ne.equals(modifier)) {
																			if (!bd2ne.equals(uContainer)) {
																				if (!bd2ne.equals(operation)) {
																					if (!method.equals(modifier)) {
																						if (!method
																								.equals(uContainer)) {
																							if (!method.equals(
																									operation)) {
																								if (!b2e.equals(m2f)) {
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
																																		operation)) {
																																	if (!me2op
																																			.equals(method)) {
																																		if (!me2op
																																				.equals(modifier)) {
																																			if (!me2op
																																					.equals(uContainer)) {
																																				if (!me2op
																																						.equals(operation)) {
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
																																													.equals(operation)) {
																																												if (!modifier
																																														.equals(uContainer)) {
																																													if (!modifier
																																															.equals(operation)) {
																																														if (!operation
																																																.equals(uContainer)) {
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
																																																	operation };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(method__bodyDeclaration____mInnerTypes);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getCreatedEdges().add(uContainer__feature____nestedClassifier);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, bd2ne, method, b2e, bodyDeclaration, modifier, uContainer,
				method__bodyDeclaration____mInnerTypes, bd2ne__bodyDeclaration____source,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				m2f__feature____target, bd2ne__feature____target, b2e__bodyDeclaration____source,
				uContainer__feature____nestedClassifier, m2f__modifier____source, b2e__feature____target };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_1_5_registerobjects_expressionBBBBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, PerformRuleResult ruleresult, EObject m2f,
			EObject feature, EObject bd2ne, EObject method, EObject b2e, EObject me2op, EObject bodyDeclaration,
			EObject modifier, EObject uContainer, EObject operation) {
		_this.registerObjects_FWD(ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier,
				uContainer, operation);

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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_2_corematch_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("method");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject _localVariable_2 = match.getObject("modifier");
		EObject tmpMethod = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpModifier = _localVariable_2;
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			if (tmpBodyDeclaration instanceof MClass) {
				MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
				if (tmpModifier instanceof Modifier) {
					Modifier modifier = (Modifier) tmpModifier;
					return new Object[] { method, bodyDeclaration, modifier, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_2_corematch_blackBFBBFB(
			MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element me2op : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(method,
				ASTNode2Element.class, "source")) {
			Element tmpOperation = me2op.getTarget();
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				_result.add(new Object[] { method, me2op, bodyDeclaration, modifier, operation, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_3_findcontext_blackBBBBFB(
			MAbstractMethodDefinition method, ASTNode2Element me2op, MClass bodyDeclaration, Modifier modifier,
			Operation operation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (operation.equals(me2op.getTarget())) {
			if (method.getMInnerTypes().contains(bodyDeclaration)) {
				if (modifier.equals(bodyDeclaration.getModifier())) {
					if (method.equals(me2op.getSource())) {
						org.eclipse.uml2.uml.Class uContainer = operation.getClass_();
						if (uContainer != null) {
							_result.add(
									new Object[] { method, me2op, bodyDeclaration, modifier, uContainer, operation });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_3_findcontext_greenBBBBBBFFFFFFFF(
			MAbstractMethodDefinition method, ASTNode2Element me2op, MClass bodyDeclaration, Modifier modifier,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge me2op__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__operation____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__uContainer____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge me2op__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String me2op__operation____target_name_prime = "target";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String uContainer__operation____ownedOperation_name_prime = "ownedOperation";
		String operation__uContainer____class_name_prime = "class";
		String me2op__method____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(me2op);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(operation);
		me2op__operation____target.setSrc(me2op);
		me2op__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(me2op__operation____target);
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(method__bodyDeclaration____mInnerTypes);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(modifier__bodyDeclaration____bodyDeclaration);
		uContainer__operation____ownedOperation.setSrc(uContainer);
		uContainer__operation____ownedOperation.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(uContainer__operation____ownedOperation);
		operation__uContainer____class.setSrc(operation);
		operation__uContainer____class.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(operation__uContainer____class);
		me2op__method____source.setSrc(me2op);
		me2op__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(me2op__method____source);
		me2op__operation____target.setName(me2op__operation____target_name_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		uContainer__operation____ownedOperation.setName(uContainer__operation____ownedOperation_name_prime);
		operation__uContainer____class.setName(operation__uContainer____class_name_prime);
		me2op__method____source.setName(me2op__method____source_name_prime);
		return new Object[] { method, me2op, bodyDeclaration, modifier, uContainer, operation, isApplicableMatch,
				me2op__operation____target, method__bodyDeclaration____mInnerTypes,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				uContainer__operation____ownedOperation, operation__uContainer____class, me2op__method____source };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_bindingFBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, ASTNode2Element me2op, MClass bodyDeclaration, Modifier modifier,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, method, me2op, bodyDeclaration,
				modifier, uContainer, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, me2op, bodyDeclaration, modifier, uContainer,
					operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, ASTNode2Element me2op, MClass bodyDeclaration, Modifier modifier,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, method, me2op, bodyDeclaration, modifier, uContainer, operation);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, me2op, bodyDeclaration, modifier,
						uContainer, operation };
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("method");
		EObject _localVariable_2 = isApplicableMatch.getObject("me2op");
		EObject _localVariable_3 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("operation");
		EObject tmpFeature = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpMe2op = _localVariable_2;
		EObject tmpUContainer = _localVariable_3;
		EObject tmpOperation = _localVariable_4;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpMethod instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
				if (tmpMe2op instanceof ASTNode2Element) {
					ASTNode2Element me2op = (ASTNode2Element) tmpMe2op;
					if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							return new Object[] { feature, method, me2op, uContainer, operation, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_blackBBBBBFBB(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, ASTNode2Element me2op,
			org.eclipse.uml2.uml.Class uContainer, Operation operation,
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch) {
		if (!feature.equals(uContainer)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { feature, method, me2op, uContainer, operation, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[1];
			ASTNode2Element me2op = (ASTNode2Element) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[3];
			Operation operation = (Operation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_binding[4];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_blackBBBBBFBB(
					feature, method, me2op, uContainer, operation, _this, isApplicableMatch);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_1_performtransformation_black[5];

				return new Object[] { feature, method, me2op, uContainer, operation, csp, _this, isApplicableMatch };
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
		method.getMInnerTypes().add(bodyDeclaration);
		bd2ne.setSource(bodyDeclaration);
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject m2f, EObject feature, EObject bd2ne, EObject method, EObject b2e,
			EObject me2op, EObject bodyDeclaration, EObject modifier, EObject uContainer, EObject operation) {
		if (!m2f.equals(method)) {
			if (!m2f.equals(me2op)) {
				if (!m2f.equals(modifier)) {
					if (!m2f.equals(uContainer)) {
						if (!m2f.equals(operation)) {
							if (!feature.equals(m2f)) {
								if (!feature.equals(method)) {
									if (!feature.equals(me2op)) {
										if (!feature.equals(modifier)) {
											if (!feature.equals(uContainer)) {
												if (!feature.equals(operation)) {
													if (!bd2ne.equals(m2f)) {
														if (!bd2ne.equals(feature)) {
															if (!bd2ne.equals(method)) {
																if (!bd2ne.equals(me2op)) {
																	if (!bd2ne.equals(bodyDeclaration)) {
																		if (!bd2ne.equals(modifier)) {
																			if (!bd2ne.equals(uContainer)) {
																				if (!bd2ne.equals(operation)) {
																					if (!method.equals(modifier)) {
																						if (!method
																								.equals(uContainer)) {
																							if (!method.equals(
																									operation)) {
																								if (!b2e.equals(m2f)) {
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
																																		operation)) {
																																	if (!me2op
																																			.equals(method)) {
																																		if (!me2op
																																				.equals(modifier)) {
																																			if (!me2op
																																					.equals(uContainer)) {
																																				if (!me2op
																																						.equals(operation)) {
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
																																													.equals(operation)) {
																																												if (!modifier
																																														.equals(uContainer)) {
																																													if (!modifier
																																															.equals(operation)) {
																																														if (!operation
																																																.equals(uContainer)) {
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
																																																	operation };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__modifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modifier__bodyDeclaration____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2f__modifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bodyDeclaration__modifier____modifier_name_prime = "modifier";
		String modifier__bodyDeclaration____bodyDeclaration_name_prime = "bodyDeclaration";
		String m2f__feature____target_name_prime = "target";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String m2f__modifier____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(method__bodyDeclaration____mInnerTypes);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		bodyDeclaration__modifier____modifier.setSrc(bodyDeclaration);
		bodyDeclaration__modifier____modifier.setTrg(modifier);
		ruleresult.getCreatedEdges().add(bodyDeclaration__modifier____modifier);
		modifier__bodyDeclaration____bodyDeclaration.setSrc(modifier);
		modifier__bodyDeclaration____bodyDeclaration.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(modifier__bodyDeclaration____bodyDeclaration);
		m2f__feature____target.setSrc(m2f);
		m2f__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(m2f__feature____target);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uContainer__feature____nestedClassifier);
		m2f__modifier____source.setSrc(m2f);
		m2f__modifier____source.setTrg(modifier);
		ruleresult.getCreatedEdges().add(m2f__modifier____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bodyDeclaration__modifier____modifier.setName(bodyDeclaration__modifier____modifier_name_prime);
		modifier__bodyDeclaration____bodyDeclaration.setName(modifier__bodyDeclaration____bodyDeclaration_name_prime);
		m2f__feature____target.setName(m2f__feature____target_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		m2f__modifier____source.setName(m2f__modifier____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, m2f, feature, bd2ne, method, b2e, bodyDeclaration, modifier, uContainer,
				method__bodyDeclaration____mInnerTypes, bd2ne__bodyDeclaration____source,
				bodyDeclaration__modifier____modifier, modifier__bodyDeclaration____bodyDeclaration,
				m2f__feature____target, bd2ne__feature____target, b2e__bodyDeclaration____source,
				uContainer__feature____nestedClassifier, m2f__modifier____source, b2e__feature____target };
	}

	public static final void pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_11_5_registerobjects_expressionBBBBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, PerformRuleResult ruleresult, EObject m2f,
			EObject feature, EObject bd2ne, EObject method, EObject b2e, EObject me2op, EObject bodyDeclaration,
			EObject modifier, EObject uContainer, EObject operation) {
		_this.registerObjects_BWD(ruleresult, m2f, feature, bd2ne, method, b2e, me2op, bodyDeclaration, modifier,
				uContainer, operation);

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

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_2_corematch_blackBFFBBB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, Operation operation,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			for (ASTNode2Element me2op : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(operation,
					ASTNode2Element.class, "target")) {
				ASTNode tmpMethod = me2op.getSource();
				if (tmpMethod instanceof MAbstractMethodDefinition) {
					MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
					_result.add(new Object[] { feature, method, me2op, uContainer, operation, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_3_findcontext_blackBBBBB(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, ASTNode2Element me2op,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			if (operation.equals(me2op.getTarget())) {
				if (uContainer.getOwnedOperations().contains(operation)) {
					if (uContainer.getNestedClassifiers().contains(feature)) {
						if (method.equals(me2op.getSource())) {
							_result.add(new Object[] { feature, method, me2op, uContainer, operation });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_3_findcontext_greenBBBBBFFFFFF(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, ASTNode2Element me2op,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge me2op__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__operation____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__uContainer____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge me2op__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String me2op__operation____target_name_prime = "target";
		String uContainer__operation____ownedOperation_name_prime = "ownedOperation";
		String operation__uContainer____class_name_prime = "class";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String me2op__method____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(me2op);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(operation);
		me2op__operation____target.setSrc(me2op);
		me2op__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(me2op__operation____target);
		uContainer__operation____ownedOperation.setSrc(uContainer);
		uContainer__operation____ownedOperation.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(uContainer__operation____ownedOperation);
		operation__uContainer____class.setSrc(operation);
		operation__uContainer____class.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(operation__uContainer____class);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uContainer__feature____nestedClassifier);
		me2op__method____source.setSrc(me2op);
		me2op__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(me2op__method____source);
		me2op__operation____target.setName(me2op__operation____target_name_prime);
		uContainer__operation____ownedOperation.setName(uContainer__operation____ownedOperation_name_prime);
		operation__uContainer____class.setName(operation__uContainer____class_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		me2op__method____source.setName(me2op__method____source_name_prime);
		return new Object[] { feature, method, me2op, uContainer, operation, isApplicableMatch,
				me2op__operation____target, uContainer__operation____ownedOperation, operation__uContainer____class,
				uContainer__feature____nestedClassifier, me2op__method____source };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_bindingFBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, ASTNode2Element me2op,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, method, me2op, uContainer,
				operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, method, me2op, uContainer, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, ASTNode2Element me2op,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, feature, method, me2op, uContainer, operation);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, method, me2op, uContainer, operation };
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
		for (org.eclipse.uml2.uml.Package __DEC_feature_packagedElement_70594 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_20_2_testcorematchandDECs_black_nac_1B(
			org.eclipse.uml2.uml.Class feature) {
		for (Interface __DEC_feature_nestedClassifier_513762 : org.moflon.core.utilities.eMoflonEMFUtil
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_0B(
			MClass bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_308556 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_308556 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_308556)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_1B(
			MClass bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_242707 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_242707 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_2B(
			MClass bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_791776 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_791776 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_3BB(
			MClass bodyDeclaration, MAbstractMethodDefinition method) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_630297 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!method.equals(__DEC_bodyDeclaration_mInnerTypes_630297)) {
				return new Object[] { bodyDeclaration, method };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_mInnerTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMethod = _edge_mInnerTypes.getSrc();
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			EObject tmpBodyDeclaration = _edge_mInnerTypes.getTrg();
			if (tmpBodyDeclaration instanceof MClass) {
				MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
				if (method.getMInnerTypes().contains(bodyDeclaration)) {
					Modifier modifier = bodyDeclaration.getModifier();
					if (modifier != null) {
						if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_0B(
								bodyDeclaration) == null) {
							if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_1B(
									bodyDeclaration) == null) {
								if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_2B(
										bodyDeclaration) == null) {
									if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_2_testcorematchandDECs_black_nac_3BB(
											bodyDeclaration, method) == null) {
										_result.add(
												new Object[] { method, bodyDeclaration, modifier, _edge_mInnerTypes });
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

	public static final boolean pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, Match match, MAbstractMethodDefinition method,
			MClass bodyDeclaration, Modifier modifier) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, method, bodyDeclaration, modifier);
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("method");
		EObject _localVariable_2 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = sourceMatch.getObject("modifier");
		EObject _localVariable_4 = targetMatch.getObject("uContainer");
		EObject _localVariable_5 = targetMatch.getObject("operation");
		EObject tmpFeature = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpModifier = _localVariable_3;
		EObject tmpUContainer = _localVariable_4;
		EObject tmpOperation = _localVariable_5;
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
							if (tmpOperation instanceof Operation) {
								Operation operation = (Operation) tmpOperation;
								return new Object[] { feature, method, bodyDeclaration, modifier, uContainer, operation,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_blackBBBBBBBB(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, MClass bodyDeclaration,
			Modifier modifier, org.eclipse.uml2.uml.Class uContainer, Operation operation, Match sourceMatch,
			Match targetMatch) {
		if (!feature.equals(uContainer)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { feature, method, bodyDeclaration, modifier, uContainer, operation, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[1];
			MClass bodyDeclaration = (MClass) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[2];
			Modifier modifier = (Modifier) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[3];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[4];
			Operation operation = (Operation) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_blackBBBBBBBB(
					feature, method, bodyDeclaration, modifier, uContainer, operation, sourceMatch, targetMatch);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, method, bodyDeclaration, modifier, uContainer, operation, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_bindingFBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, org.eclipse.uml2.uml.Class feature,
			MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier,
			org.eclipse.uml2.uml.Class uContainer, Operation operation, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(feature, method, bodyDeclaration, modifier, uContainer,
				operation, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, feature, method, bodyDeclaration, modifier, uContainer, operation,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, org.eclipse.uml2.uml.Class feature,
			MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier,
			org.eclipse.uml2.uml.Class uContainer, Operation operation, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, feature, method, bodyDeclaration, modifier, uContainer, operation, sourceMatch, targetMatch);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, method, bodyDeclaration, modifier, uContainer, operation,
						sourceMatch, targetMatch };
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

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_5_matchcorrcontext_blackBFBBB(
			MAbstractMethodDefinition method, Operation operation, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element me2op : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(operation,
					ASTNode2Element.class, "target")) {
				if (method.equals(me2op.getSource())) {
					_result.add(new Object[] { method, me2op, operation, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_5_matchcorrcontext_greenBBBF(
			ASTNode2Element me2op, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InnerClassDeclaration2InnerClass_InMethod_withModifier";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(me2op);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { me2op, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_24_6_createcorrespondence_blackBBBBBBB(
			org.eclipse.uml2.uml.Class feature, MAbstractMethodDefinition method, MClass bodyDeclaration,
			Modifier modifier, org.eclipse.uml2.uml.Class uContainer, Operation operation, CCMatch ccMatch) {
		if (!feature.equals(uContainer)) {
			return new Object[] { feature, method, bodyDeclaration, modifier, uContainer, operation, ccMatch };
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_0B(
			MClass bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_983872 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_983872 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_983872)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_1B(
			MClass bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_248795 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_248795 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_2B(
			MClass bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_63325 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_63325 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_3BB(
			MClass bodyDeclaration, MAbstractMethodDefinition method) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_419927 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!method.equals(__DEC_bodyDeclaration_mInnerTypes_419927)) {
				return new Object[] { bodyDeclaration, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_blackBBB(
			MAbstractMethodDefinition method, MClass bodyDeclaration, Modifier modifier) {
		if (method.getMInnerTypes().contains(bodyDeclaration)) {
			if (modifier.equals(bodyDeclaration.getModifier())) {
				if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_0B(
						bodyDeclaration) == null) {
					if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_1B(
							bodyDeclaration) == null) {
						if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_2B(
								bodyDeclaration) == null) {
							if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_27_1_matchtggpattern_black_nac_3BB(
									bodyDeclaration, method) == null) {
								return new Object[] { method, bodyDeclaration, modifier };
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
		for (org.eclipse.uml2.uml.Package __DEC_feature_packagedElement_852960 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_28_1_matchtggpattern_black_nac_1B(
			org.eclipse.uml2.uml.Class feature) {
		for (Interface __DEC_feature_nestedClassifier_217909 : org.moflon.core.utilities.eMoflonEMFUtil
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
			ModelgeneratorRuleResult ruleResult, ASTNode2Element me2op) {
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

	public static final Iterable<Object[]> pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList me2opList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMe2op : me2opList.getEntryObjects()) {
				if (tmpMe2op instanceof ASTNode2Element) {
					ASTNode2Element me2op = (ASTNode2Element) tmpMe2op;
					ASTNode tmpMethod = me2op.getSource();
					if (tmpMethod instanceof MAbstractMethodDefinition) {
						MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
						Element tmpOperation = me2op.getTarget();
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							org.eclipse.uml2.uml.Class uContainer = operation.getClass_();
							if (uContainer != null) {
								if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_1BB(
										ruleResult, me2op) == null) {
									if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, method) == null) {
										if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_2BB(
												ruleResult, operation) == null) {
											if (pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, uContainer) == null) {
												_result.add(new Object[] { me2opList, method, me2op, operation,
														uContainer, ruleEntryContainer, ruleResult });
											}
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_bindingFBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, ASTNode2Element me2op, org.eclipse.uml2.uml.Class uContainer,
			Operation operation, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, method, me2op, uContainer, operation,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, me2op, uContainer, operation, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			InnerClassDeclaration2InnerClass_InMethod_withModifier _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, ASTNode2Element me2op, org.eclipse.uml2.uml.Class uContainer,
			Operation operation, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_binding = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, method, me2op, uContainer, operation, ruleResult);
		if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_binding[0];

			Object[] result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_black = pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, me2op, uContainer, operation, ruleResult };
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

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_5_checknacs_blackBBBB(
			MAbstractMethodDefinition method, ASTNode2Element me2op, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {
		return new Object[] { method, me2op, uContainer, operation };
	}

	public static final Object[] pattern_InnerClassDeclaration2InnerClass_InMethod_withModifier_29_6_perform_blackBBBBB(
			MAbstractMethodDefinition method, ASTNode2Element me2op, org.eclipse.uml2.uml.Class uContainer,
			Operation operation, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { method, me2op, uContainer, operation, ruleResult };
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
		Object _localVariable_0 = csp.getValue("feature", "visibility");
		Object _localVariable_1 = csp.getValue("feature", "name");
		Object _localVariable_2 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_3 = csp.getValue("modifier", "visibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(m2f);
		m2f.setTarget(feature);
		uContainer.getNestedClassifiers().add(feature);
		ruleResult.getTargetObjects().add(feature);
		bd2ne.setTarget(feature);
		ruleResult.getCorrObjects().add(bd2ne);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		method.getMInnerTypes().add(bodyDeclaration);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		bodyDeclaration.setModifier(modifier);
		m2f.setSource(modifier);
		ruleResult.getSourceObjects().add(modifier);
		VisibilityKind feature_visibility_prime = (VisibilityKind) _localVariable_0;
		String feature_name_prime = (String) _localVariable_1;
		String bodyDeclaration_name_prime = (String) _localVariable_2;
		org.eclipse.modisco.java.VisibilityKind modifier_visibility_prime = (org.eclipse.modisco.java.VisibilityKind) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		feature.setVisibility(feature_visibility_prime);
		feature.setName(feature_name_prime);
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
