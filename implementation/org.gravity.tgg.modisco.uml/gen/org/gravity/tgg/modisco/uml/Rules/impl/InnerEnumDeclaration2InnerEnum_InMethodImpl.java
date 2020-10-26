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
import org.eclipse.modisco.java.EnumDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.InnerEnumDeclaration2InnerEnum_InMethod;
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
 * An implementation of the model object '<em><b>Inner Enum Declaration2 Inner Enum In Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InnerEnumDeclaration2InnerEnum_InMethodImpl extends AbstractRuleImpl
		implements InnerEnumDeclaration2InnerEnum_InMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerEnumDeclaration2InnerEnum_InMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInnerEnumDeclaration2InnerEnum_InMethod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MAbstractMethodDefinition method, EnumDeclaration bodyDeclaration,
			AbstractTypeDeclaration jContainer) {

		Object[] result1_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_1_initialbindings_blackBBBBB(this, match, method,
						bodyDeclaration, jContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[jContainer] = " + jContainer + ".");
		}

		Object[] result2_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, method,
						bodyDeclaration, jContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[jContainer] = " + jContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_4_collectelementstobetranslated_blackBBBB(match,
							method, bodyDeclaration, jContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[jContainer] = " + jContainer + ".");
			}
			InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_4_collectelementstobetranslated_greenBBBF(match,
							method, bodyDeclaration);
			//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_5_collectcontextelements_blackBBBB(match, method,
							bodyDeclaration, jContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
						+ "[jContainer] = " + jContainer + ".");
			}
			InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_5_collectcontextelements_greenBBBFF(match,
							method, jContainer);
			//nothing EMoflonEdge jContainer__method____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge method__jContainer____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_6_registerobjectstomatch_expressionBBBBB(this,
							match, method, bodyDeclaration, jContainer);
			return InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_7_expressionF();
		} else {
			return InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[0];
		NamedElement2NamedElement me2op = (NamedElement2NamedElement) result1_bindingAndBlack[1];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		Operation operation = (Operation) result1_bindingAndBlack[5];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_greenFFFBBB(bodyDeclaration,
						uContainer, csp);
		Enumeration feature = (Enumeration) result1_green[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[1];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[2];

		Object[] result2_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_2_collecttranslatedelements_blackBBBB(feature, b2e,
						bd2ne, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", " + "[b2e] = " + b2e
							+ ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_2_collecttranslatedelements_greenFBBBB(feature, b2e,
						bd2ne, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult,
						feature, method, b2e, bd2ne, me2op, bodyDeclaration, uContainer, jContainer, operation, ne2ne);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[method] = " + method + ", " + "[b2e] = " + b2e + ", "
					+ "[bd2ne] = " + bd2ne + ", " + "[me2op] = " + me2op + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer
					+ ", " + "[operation] = " + operation + ", " + "[ne2ne] = " + ne2ne + ".");
		}
		InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult,
						feature, method, b2e, bd2ne, bodyDeclaration, uContainer);
		//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[12];

		// 
		// 
		InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_5_registerobjects_expressionBBBBBBBBBBBB(this,
						ruleresult, feature, method, b2e, bd2ne, me2op, bodyDeclaration, uContainer, jContainer,
						operation, ne2ne);
		return InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_binding[0];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result2_binding[1];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_binding[2];
		for (Object[] result2_black : InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_2_corematch_blackBFBFBFFB(method, bodyDeclaration,
						jContainer, match)) {
			NamedElement2NamedElement me2op = (NamedElement2NamedElement) result2_black[1];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[3];
			Operation operation = (Operation) result2_black[5];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[6];
			// ForEach 
			for (Object[] result3_black : InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_3_findcontext_blackBBBBBBB(method, me2op,
							bodyDeclaration, uContainer, jContainer, operation, ne2ne)) {
				Object[] result3_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(method,
								me2op, bodyDeclaration, uContainer, jContainer, operation, ne2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge me2op__operation____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge jContainer__method____bodyDeclarations = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge method__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge me2op__method____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, method, me2op, bodyDeclaration, uContainer, jContainer, operation,
								ne2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[me2op] = " + me2op + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", "
							+ "[operation] = " + operation + ", " + "[ne2ne] = " + ne2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
							.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerEnumDeclaration2InnerEnum_InMethodImpl
							.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MAbstractMethodDefinition method,
			EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer) {
		match.registerObject("method", method);
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("jContainer", jContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MAbstractMethodDefinition method,
			EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer) {// Create CSP
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
			NamedElement2NamedElement me2op, EnumDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne) {// Create CSP
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
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("me2op", me2op);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject feature, EObject method, EObject b2e,
			EObject bd2ne, EObject me2op, EObject bodyDeclaration, EObject uContainer, EObject jContainer,
			EObject operation, EObject ne2ne) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("me2op", me2op);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
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
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
				.equals("java.EnumDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Enumeration feature, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {

		Object[] result1_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_1_initialbindings_blackBBBBB(this, match, feature,
						uContainer, operation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer
					+ ", " + "[operation] = " + operation + ".");
		}

		Object[] result2_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						feature, uContainer, operation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer
					+ ", " + "[operation] = " + operation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_4_collectelementstobetranslated_blackBBBB(match,
							feature, uContainer, operation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ", " + "[operation] = "
						+ operation + ".");
			}
			InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_4_collectelementstobetranslated_greenBBBF(match,
							feature, uContainer);
			//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_5_collectcontextelements_blackBBBB(match,
							feature, uContainer, operation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ", " + "[operation] = "
						+ operation + ".");
			}
			InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_5_collectcontextelements_greenBBBFF(match,
							uContainer, operation);
			//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result5_green[4];

			// 
			InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_6_registerobjectstomatch_expressionBBBBB(this,
							match, feature, uContainer, operation);
			return InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_7_expressionF();
		} else {
			return InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Enumeration feature = (Enumeration) result1_bindingAndBlack[0];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[1];
		NamedElement2NamedElement me2op = (NamedElement2NamedElement) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		Operation operation = (Operation) result1_bindingAndBlack[5];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_greenBBFFFB(feature, method,
						csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[3];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result1_green[4];

		Object[] result2_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_2_collecttranslatedelements_blackBBBB(feature, b2e,
						bd2ne, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", " + "[b2e] = " + b2e
							+ ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_2_collecttranslatedelements_greenFBBBB(feature, b2e,
						bd2ne, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult,
						feature, method, b2e, bd2ne, me2op, bodyDeclaration, uContainer, jContainer, operation, ne2ne);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[method] = " + method + ", " + "[b2e] = " + b2e + ", "
					+ "[bd2ne] = " + bd2ne + ", " + "[me2op] = " + me2op + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer
					+ ", " + "[operation] = " + operation + ", " + "[ne2ne] = " + ne2ne + ".");
		}
		InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult,
						feature, method, b2e, bd2ne, bodyDeclaration, uContainer);
		//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[12];

		// 
		// 
		InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_5_registerobjects_expressionBBBBBBBBBBBB(this,
						ruleresult, feature, method, b2e, bd2ne, me2op, bodyDeclaration, uContainer, jContainer,
						operation, ne2ne);
		return InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Enumeration feature = (Enumeration) result2_binding[0];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_binding[1];
		Operation operation = (Operation) result2_binding[2];
		for (Object[] result2_black : InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_2_corematch_blackBFFBFBFB(feature, uContainer,
						operation, match)) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[1];
			NamedElement2NamedElement me2op = (NamedElement2NamedElement) result2_black[2];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[4];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[6];
			// ForEach 
			for (Object[] result3_black : InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_3_findcontext_blackBBBBBBB(feature, method,
							me2op, uContainer, jContainer, operation, ne2ne)) {
				Object[] result3_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(
								feature, method, me2op, uContainer, jContainer, operation, ne2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge me2op__operation____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge jContainer__method____bodyDeclarations = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge method__jContainer____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge me2op__method____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, feature, method, me2op, uContainer, jContainer, operation, ne2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[method] = " + method + ", " + "[me2op] = " + me2op + ", " + "[uContainer] = "
							+ uContainer + ", " + "[jContainer] = " + jContainer + ", " + "[operation] = " + operation
							+ ", " + "[ne2ne] = " + ne2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
							.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerEnumDeclaration2InnerEnum_InMethodImpl
							.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Enumeration feature, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {
		match.registerObject("feature", feature);
		match.registerObject("uContainer", uContainer);
		match.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Enumeration feature, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Enumeration feature,
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne) {// Create CSP
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject feature, EObject method, EObject b2e,
			EObject bd2ne, EObject me2op, EObject bodyDeclaration, EObject uContainer, EObject jContainer,
			EObject operation, EObject ne2ne) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("me2op", me2op);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
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
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass())
				.equals("uml.Enumeration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_71(EMoflonEdge _edge_nestedClassifier) {

		Object[] result1_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_2_testcorematchandDECs_blackFFFB(
						_edge_nestedClassifier)) {
			Enumeration feature = (Enumeration) result2_black[0];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[1];
			Operation operation = (Operation) result2_black[2];
			Object[] result2_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, feature, uContainer, operation)) {
				// 
				if (InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
							.pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerEnumDeclaration2InnerEnum_InMethodImpl
							.pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_72(EMoflonEdge _edge_mInnerTypes) {

		Object[] result1_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_blackFFFB(
						_edge_mInnerTypes)) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[0];
			EnumDeclaration bodyDeclaration = (EnumDeclaration) result2_black[1];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[2];
			Object[] result2_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, method, bodyDeclaration, jContainer)) {
				// 
				if (InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
							.pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerEnumDeclaration2InnerEnum_InMethodImpl
							.pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InnerEnumDeclaration2InnerEnum_InMethod");
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

		eq0.setRuleName("InnerEnumDeclaration2InnerEnum_InMethod");
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
		ruleResult.setRule("InnerEnumDeclaration2InnerEnum_InMethod");
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

		eq0.setRuleName("InnerEnumDeclaration2InnerEnum_InMethod");
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

		Object[] result1_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Enumeration feature = (Enumeration) result2_bindingAndBlack[0];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_bindingAndBlack[1];
		EnumDeclaration bodyDeclaration = (EnumDeclaration) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[3];
		AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_bindingAndBlack[4];
		Operation operation = (Operation) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, feature,
						method, bodyDeclaration, uContainer, jContainer, operation, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer
					+ ", " + "[operation] = " + operation + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_5_matchcorrcontext_blackBFBBBFBB(method,
							uContainer, jContainer, operation, sourceMatch, targetMatch)) {
				NamedElement2NamedElement me2op = (NamedElement2NamedElement) result5_black[1];
				NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result5_black[5];
				Object[] result5_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_5_matchcorrcontext_greenBBBBF(me2op, ne2ne,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_6_createcorrespondence_blackBBBBBBB(feature,
								method, bodyDeclaration, uContainer, jContainer, operation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uContainer] = " + uContainer + ", " + "[jContainer] = " + jContainer + ", "
							+ "[operation] = " + operation + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_6_createcorrespondence_greenBFFBB(feature,
								bodyDeclaration, ccMatch);
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[1];
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[2];

				Object[] result7_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_7_addtoreturnedresult_blackBB(result,
								ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_7_addtoreturnedresult_greenBB(result,
								ccMatch);

			}

		} else {
		}
		return InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Enumeration feature, MAbstractMethodDefinition method,
			EnumDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MAbstractMethodDefinition method, EnumDeclaration bodyDeclaration,
			AbstractTypeDeclaration jContainer) {// 
		Object[] result1_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_blackBBB(method, bodyDeclaration,
						jContainer);
		if (result1_black != null) {
			return InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_2_expressionF();
		} else {
			return InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Enumeration feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {// 
		Object[] result1_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_28_1_matchtggpattern_blackBBB(feature, uContainer,
						operation);
		if (result1_black != null) {
			return InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_28_2_expressionF();
		} else {
			return InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement me2opParameter) {

		Object[] result1_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_blackFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList me2opList = (RuleEntryList) result2_black[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[1];
			NamedElement2NamedElement me2op = (NamedElement2NamedElement) result2_black[2];
			Operation operation = (Operation) result2_black[3];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[4];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[5];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result2_black[6];

			Object[] result3_bindingAndBlack = InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, method, me2op, uContainer, jContainer, operation, ne2ne, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
						+ "[me2op] = " + me2op + ", " + "[uContainer] = " + uContainer + ", " + "[jContainer] = "
						+ jContainer + ", " + "[operation] = " + operation + ", " + "[ne2ne] = " + ne2ne + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InnerEnumDeclaration2InnerEnum_InMethodImpl
					.pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
						.pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_5_checknacs_blackBBBBBB(method, me2op,
								uContainer, jContainer, operation, ne2ne);
				if (result5_black != null) {

					Object[] result6_black = InnerEnumDeclaration2InnerEnum_InMethodImpl
							.pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_6_perform_blackBBBBBBB(method, me2op,
									uContainer, jContainer, operation, ne2ne, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
								+ ", " + "[me2op] = " + me2op + ", " + "[uContainer] = " + uContainer + ", "
								+ "[jContainer] = " + jContainer + ", " + "[operation] = " + operation + ", "
								+ "[ne2ne] = " + ne2ne + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					InnerEnumDeclaration2InnerEnum_InMethodImpl
							.pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_6_perform_greenFBFFFBBB(method,
									uContainer, ruleResult, csp);
					//nothing Enumeration feature = (Enumeration) result6_green[0];
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[3];
					//nothing EnumDeclaration bodyDeclaration = (EnumDeclaration) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return InnerEnumDeclaration2InnerEnum_InMethodImpl
				.pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_7_expressionFB(ruleResult);
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

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

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
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPROPRIATE_FWD__MATCH_MABSTRACTMETHODDEFINITION_ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(EnumDeclaration) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MABSTRACTMETHODDEFINITION_ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(EnumDeclaration) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
			return null;
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MABSTRACTMETHODDEFINITION_ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(EnumDeclaration) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_NAMEDELEMENT2NAMEDELEMENT_ENUMDECLARATION_CLASS_ABSTRACTTYPEDECLARATION_OPERATION_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (NamedElement2NamedElement) arguments.get(2),
					(EnumDeclaration) arguments.get(3), (org.eclipse.uml2.uml.Class) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5), (Operation) arguments.get(6),
					(NamedElement2NamedElement) arguments.get(7));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPROPRIATE_BWD__MATCH_ENUMERATION_CLASS_OPERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Enumeration) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ENUMERATION_CLASS_OPERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Enumeration) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Operation) arguments.get(3));
			return null;
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ENUMERATION_CLASS_OPERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Enumeration) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ENUMERATION_MABSTRACTMETHODDEFINITION_NAMEDELEMENT2NAMEDELEMENT_CLASS_ABSTRACTTYPEDECLARATION_OPERATION_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Enumeration) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2), (NamedElement2NamedElement) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(Operation) arguments.get(6), (NamedElement2NamedElement) arguments.get(7));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_71__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_71((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_72__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_72((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPLICABLE_SOLVE_CSP_CC__ENUMERATION_MABSTRACTMETHODDEFINITION_ENUMDECLARATION_CLASS_ABSTRACTTYPEDECLARATION_OPERATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Enumeration) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (EnumDeclaration) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(Operation) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___CHECK_DEC_FWD__MABSTRACTMETHODDEFINITION_ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((MAbstractMethodDefinition) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___CHECK_DEC_BWD__ENUMERATION_CLASS_OPERATION:
			return checkDEC_BWD((Enumeration) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___GENERATE_MODEL__RULEENTRYCONTAINER_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (NamedElement2NamedElement) arguments.get(1));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_NAMEDELEMENT2NAMEDELEMENT_CLASS_ABSTRACTTYPEDECLARATION_OPERATION_NAMEDELEMENT2NAMEDELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (NamedElement2NamedElement) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(Operation) arguments.get(5), (NamedElement2NamedElement) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.INNER_ENUM_DECLARATION2_INNER_ENUM_IN_METHOD___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_1_initialbindings_blackBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match, MAbstractMethodDefinition method,
			EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { _this, match, method, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_bindingFBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match, MAbstractMethodDefinition method,
			EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, method, bodyDeclaration, jContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, method, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_bindingAndBlackFBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match, MAbstractMethodDefinition method,
			EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_bindingFBBBBB(
				_this, match, method, bodyDeclaration, jContainer);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, method, bodyDeclaration, jContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_3_CheckCSP_expressionFBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_4_collectelementstobetranslated_blackBBBB(
			Match match, MAbstractMethodDefinition method, EnumDeclaration bodyDeclaration,
			AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { match, method, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MAbstractMethodDefinition method, EnumDeclaration bodyDeclaration) {
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(method__bodyDeclaration____mInnerTypes);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		return new Object[] { match, method, bodyDeclaration, method__bodyDeclaration____mInnerTypes };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_5_collectcontextelements_blackBBBB(
			Match match, MAbstractMethodDefinition method, EnumDeclaration bodyDeclaration,
			AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { match, method, bodyDeclaration, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_5_collectcontextelements_greenBBBFF(
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

	public static final void pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_6_registerobjectstomatch_expressionBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match, MAbstractMethodDefinition method,
			EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer) {
		_this.registerObjectsToMatch_FWD(match, method, bodyDeclaration, jContainer);

	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("me2op");
		EObject _localVariable_2 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_5 = isApplicableMatch.getObject("operation");
		EObject _localVariable_6 = isApplicableMatch.getObject("ne2ne");
		EObject tmpMethod = _localVariable_0;
		EObject tmpMe2op = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpUContainer = _localVariable_3;
		EObject tmpJContainer = _localVariable_4;
		EObject tmpOperation = _localVariable_5;
		EObject tmpNe2ne = _localVariable_6;
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			if (tmpMe2op instanceof NamedElement2NamedElement) {
				NamedElement2NamedElement me2op = (NamedElement2NamedElement) tmpMe2op;
				if (tmpBodyDeclaration instanceof EnumDeclaration) {
					EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
					if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
						if (tmpJContainer instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
							if (tmpOperation instanceof Operation) {
								Operation operation = (Operation) tmpOperation;
								if (tmpNe2ne instanceof NamedElement2NamedElement) {
									NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
									return new Object[] { method, me2op, bodyDeclaration, uContainer, jContainer,
											operation, ne2ne, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_blackBBBBBBBFBB(
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, EnumDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne, InnerEnumDeclaration2InnerEnum_InMethod _this,
			IsApplicableMatch isApplicableMatch) {
		if (!me2op.equals(ne2ne)) {
			if (!bodyDeclaration.equals(jContainer)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { method, me2op, bodyDeclaration, uContainer, jContainer, operation, ne2ne,
								csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_binding != null) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_binding[0];
			NamedElement2NamedElement me2op = (NamedElement2NamedElement) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_binding[1];
			EnumDeclaration bodyDeclaration = (EnumDeclaration) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_binding[4];
			Operation operation = (Operation) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_binding[5];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_binding[6];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_blackBBBBBBBFBB(
					method, me2op, bodyDeclaration, uContainer, jContainer, operation, ne2ne, _this, isApplicableMatch);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_black[7];

				return new Object[] { method, me2op, bodyDeclaration, uContainer, jContainer, operation, ne2ne, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_1_performtransformation_greenFFFBBB(
			EnumDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer, CSP csp) {
		Enumeration feature = UMLFactory.eINSTANCE.createEnumeration();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		Object _localVariable_0 = csp.getValue("feature", "name");
		uContainer.getNestedClassifiers().add(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { feature, b2e, bd2ne, bodyDeclaration, uContainer, csp };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_2_collecttranslatedelements_blackBBBB(
			Enumeration feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			EnumDeclaration bodyDeclaration) {
		return new Object[] { feature, b2e, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_2_collecttranslatedelements_greenFBBBB(
			Enumeration feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			EnumDeclaration bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, feature, b2e, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject method, EObject b2e, EObject bd2ne, EObject me2op,
			EObject bodyDeclaration, EObject uContainer, EObject jContainer, EObject operation, EObject ne2ne) {
		if (!feature.equals(method)) {
			if (!feature.equals(me2op)) {
				if (!feature.equals(uContainer)) {
					if (!feature.equals(jContainer)) {
						if (!feature.equals(operation)) {
							if (!feature.equals(ne2ne)) {
								if (!method.equals(uContainer)) {
									if (!method.equals(operation)) {
										if (!method.equals(ne2ne)) {
											if (!b2e.equals(feature)) {
												if (!b2e.equals(method)) {
													if (!b2e.equals(bd2ne)) {
														if (!b2e.equals(me2op)) {
															if (!b2e.equals(bodyDeclaration)) {
																if (!b2e.equals(uContainer)) {
																	if (!b2e.equals(jContainer)) {
																		if (!b2e.equals(operation)) {
																			if (!b2e.equals(ne2ne)) {
																				if (!bd2ne.equals(feature)) {
																					if (!bd2ne.equals(method)) {
																						if (!bd2ne.equals(me2op)) {
																							if (!bd2ne.equals(
																									bodyDeclaration)) {
																								if (!bd2ne.equals(
																										uContainer)) {
																									if (!bd2ne.equals(
																											jContainer)) {
																										if (!bd2ne
																												.equals(operation)) {
																											if (!bd2ne
																													.equals(ne2ne)) {
																												if (!me2op
																														.equals(method)) {
																													if (!me2op
																															.equals(uContainer)) {
																														if (!me2op
																																.equals(operation)) {
																															if (!me2op
																																	.equals(ne2ne)) {
																																if (!bodyDeclaration
																																		.equals(feature)) {
																																	if (!bodyDeclaration
																																			.equals(method)) {
																																		if (!bodyDeclaration
																																				.equals(me2op)) {
																																			if (!bodyDeclaration
																																					.equals(uContainer)) {
																																				if (!bodyDeclaration
																																						.equals(jContainer)) {
																																					if (!bodyDeclaration
																																							.equals(operation)) {
																																						if (!bodyDeclaration
																																								.equals(ne2ne)) {
																																							if (!jContainer
																																									.equals(method)) {
																																								if (!jContainer
																																										.equals(me2op)) {
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
																																																	feature,
																																																	method,
																																																	b2e,
																																																	bd2ne,
																																																	me2op,
																																																	bodyDeclaration,
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
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject method, EObject b2e, EObject bd2ne,
			EObject bodyDeclaration, EObject uContainer) {
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerEnumDeclaration2InnerEnum_InMethod";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String b2e__feature____target_name_prime = "target";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(method__bodyDeclaration____mInnerTypes);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getCreatedEdges().add(uContainer__feature____nestedClassifier);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, feature, method, b2e, bd2ne, bodyDeclaration, uContainer,
				method__bodyDeclaration____mInnerTypes, bd2ne__bodyDeclaration____source,
				b2e__bodyDeclaration____source, bd2ne__feature____target, uContainer__feature____nestedClassifier,
				b2e__feature____target };
	}

	public static final void pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_5_registerobjects_expressionBBBBBBBBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, PerformRuleResult ruleresult, EObject feature,
			EObject method, EObject b2e, EObject bd2ne, EObject me2op, EObject bodyDeclaration, EObject uContainer,
			EObject jContainer, EObject operation, EObject ne2ne) {
		_this.registerObjects_FWD(ruleresult, feature, method, b2e, bd2ne, me2op, bodyDeclaration, uContainer,
				jContainer, operation, ne2ne);

	}

	public static final PerformRuleResult pattern_InnerEnumDeclaration2InnerEnum_InMethod_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_bindingFB(
			InnerEnumDeclaration2InnerEnum_InMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerEnumDeclaration2InnerEnum_InMethod _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_bindingAndBlackFFB(
			InnerEnumDeclaration2InnerEnum_InMethod _this) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerEnumDeclaration2InnerEnum_InMethod";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_2_corematch_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("method");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject _localVariable_2 = match.getObject("jContainer");
		EObject tmpMethod = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpJContainer = _localVariable_2;
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			if (tmpBodyDeclaration instanceof EnumDeclaration) {
				EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
				if (tmpJContainer instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
					return new Object[] { method, bodyDeclaration, jContainer, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_2_corematch_blackBFBFBFFB(
			MAbstractMethodDefinition method, EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer,
			Match match) {
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
								_result.add(new Object[] { method, me2op, bodyDeclaration, uContainer, jContainer,
										operation, ne2ne, match });
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_3_findcontext_blackBBBBBBB(
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, EnumDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!me2op.equals(ne2ne)) {
			if (!bodyDeclaration.equals(jContainer)) {
				if (operation.equals(me2op.getTarget())) {
					if (method.getMInnerTypes().contains(bodyDeclaration)) {
						if (jContainer.equals(ne2ne.getSource())) {
							if (uContainer.getOwnedOperations().contains(operation)) {
								if (jContainer.getBodyDeclarations().contains(method)) {
									if (method.equals(me2op.getSource())) {
										if (uContainer.equals(ne2ne.getTarget())) {
											_result.add(new Object[] { method, me2op, bodyDeclaration, uContainer,
													jContainer, operation, ne2ne });
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

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, EnumDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge me2op__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__operation____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__uContainer____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge me2op__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String me2op__operation____target_name_prime = "target";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String ne2ne__jContainer____source_name_prime = "source";
		String uContainer__operation____ownedOperation_name_prime = "ownedOperation";
		String operation__uContainer____class_name_prime = "class";
		String jContainer__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String me2op__method____source_name_prime = "source";
		String ne2ne__uContainer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(me2op);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		me2op__operation____target.setSrc(me2op);
		me2op__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(me2op__operation____target);
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(method__bodyDeclaration____mInnerTypes);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
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
		me2op__method____source.setSrc(me2op);
		me2op__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(me2op__method____source);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		me2op__operation____target.setName(me2op__operation____target_name_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		uContainer__operation____ownedOperation.setName(uContainer__operation____ownedOperation_name_prime);
		operation__uContainer____class.setName(operation__uContainer____class_name_prime);
		jContainer__method____bodyDeclarations.setName(jContainer__method____bodyDeclarations_name_prime);
		method__jContainer____abstractTypeDeclaration.setName(method__jContainer____abstractTypeDeclaration_name_prime);
		me2op__method____source.setName(me2op__method____source_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		return new Object[] { method, me2op, bodyDeclaration, uContainer, jContainer, operation, ne2ne,
				isApplicableMatch, me2op__operation____target, method__bodyDeclaration____mInnerTypes,
				ne2ne__jContainer____source, uContainer__operation____ownedOperation, operation__uContainer____class,
				jContainer__method____bodyDeclarations, method__jContainer____abstractTypeDeclaration,
				me2op__method____source, ne2ne__uContainer____target };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_bindingFBBBBBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, EnumDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, method, me2op, bodyDeclaration,
				uContainer, jContainer, operation, ne2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, me2op, bodyDeclaration, uContainer, jContainer,
					operation, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, EnumDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, method, me2op, bodyDeclaration, uContainer, jContainer, operation, ne2ne);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_binding[0];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, me2op, bodyDeclaration, uContainer,
						jContainer, operation, ne2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_5_checkCSP_expressionFBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerEnumDeclaration2InnerEnum_InMethod";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerEnumDeclaration2InnerEnum_InMethod_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_1_initialbindings_blackBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match, Enumeration feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		return new Object[] { _this, match, feature, uContainer, operation };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_bindingFBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match, Enumeration feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uContainer, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uContainer, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_bindingAndBlackFBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match, Enumeration feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_bindingFBBBBB(
				_this, match, feature, uContainer, operation);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uContainer, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_3_CheckCSP_expressionFBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Enumeration feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		return new Object[] { match, feature, uContainer, operation };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Enumeration feature, org.eclipse.uml2.uml.Class uContainer) {
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		match.getToBeTranslatedEdges().add(uContainer__feature____nestedClassifier);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		return new Object[] { match, feature, uContainer, uContainer__feature____nestedClassifier };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_5_collectcontextelements_blackBBBB(
			Match match, Enumeration feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		return new Object[] { match, feature, uContainer, operation };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_5_collectcontextelements_greenBBBFF(
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

	public static final void pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_6_registerobjectstomatch_expressionBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match, Enumeration feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		_this.registerObjectsToMatch_BWD(match, feature, uContainer, operation);

	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_bindingFFFFFFFB(
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
		if (tmpFeature instanceof Enumeration) {
			Enumeration feature = (Enumeration) tmpFeature;
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

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_blackBBBBBBBFBB(
			Enumeration feature, MAbstractMethodDefinition method, NamedElement2NamedElement me2op,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne, InnerEnumDeclaration2InnerEnum_InMethod _this,
			IsApplicableMatch isApplicableMatch) {
		if (!me2op.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { feature, method, me2op, uContainer, jContainer, operation, ne2ne, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_binding != null) {
			Enumeration feature = (Enumeration) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_binding[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_binding[1];
			NamedElement2NamedElement me2op = (NamedElement2NamedElement) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_binding[3];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_binding[4];
			Operation operation = (Operation) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_binding[5];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_binding[6];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_blackBBBBBBBFBB(
					feature, method, me2op, uContainer, jContainer, operation, ne2ne, _this, isApplicableMatch);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_black[7];

				return new Object[] { feature, method, me2op, uContainer, jContainer, operation, ne2ne, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_1_performtransformation_greenBBFFFB(
			Enumeration feature, MAbstractMethodDefinition method, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		EnumDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createEnumDeclaration();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		b2e.setTarget(feature);
		bd2ne.setTarget(feature);
		method.getMInnerTypes().add(bodyDeclaration);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { feature, method, b2e, bd2ne, bodyDeclaration, csp };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_2_collecttranslatedelements_blackBBBB(
			Enumeration feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			EnumDeclaration bodyDeclaration) {
		return new Object[] { feature, b2e, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_2_collecttranslatedelements_greenFBBBB(
			Enumeration feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			EnumDeclaration bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, feature, b2e, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject method, EObject b2e, EObject bd2ne, EObject me2op,
			EObject bodyDeclaration, EObject uContainer, EObject jContainer, EObject operation, EObject ne2ne) {
		if (!feature.equals(method)) {
			if (!feature.equals(me2op)) {
				if (!feature.equals(uContainer)) {
					if (!feature.equals(jContainer)) {
						if (!feature.equals(operation)) {
							if (!feature.equals(ne2ne)) {
								if (!method.equals(uContainer)) {
									if (!method.equals(operation)) {
										if (!method.equals(ne2ne)) {
											if (!b2e.equals(feature)) {
												if (!b2e.equals(method)) {
													if (!b2e.equals(bd2ne)) {
														if (!b2e.equals(me2op)) {
															if (!b2e.equals(bodyDeclaration)) {
																if (!b2e.equals(uContainer)) {
																	if (!b2e.equals(jContainer)) {
																		if (!b2e.equals(operation)) {
																			if (!b2e.equals(ne2ne)) {
																				if (!bd2ne.equals(feature)) {
																					if (!bd2ne.equals(method)) {
																						if (!bd2ne.equals(me2op)) {
																							if (!bd2ne.equals(
																									bodyDeclaration)) {
																								if (!bd2ne.equals(
																										uContainer)) {
																									if (!bd2ne.equals(
																											jContainer)) {
																										if (!bd2ne
																												.equals(operation)) {
																											if (!bd2ne
																													.equals(ne2ne)) {
																												if (!me2op
																														.equals(method)) {
																													if (!me2op
																															.equals(uContainer)) {
																														if (!me2op
																																.equals(operation)) {
																															if (!me2op
																																	.equals(ne2ne)) {
																																if (!bodyDeclaration
																																		.equals(feature)) {
																																	if (!bodyDeclaration
																																			.equals(method)) {
																																		if (!bodyDeclaration
																																				.equals(me2op)) {
																																			if (!bodyDeclaration
																																					.equals(uContainer)) {
																																				if (!bodyDeclaration
																																						.equals(jContainer)) {
																																					if (!bodyDeclaration
																																							.equals(operation)) {
																																						if (!bodyDeclaration
																																								.equals(ne2ne)) {
																																							if (!jContainer
																																									.equals(method)) {
																																								if (!jContainer
																																										.equals(me2op)) {
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
																																																	feature,
																																																	method,
																																																	b2e,
																																																	bd2ne,
																																																	me2op,
																																																	bodyDeclaration,
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
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject method, EObject b2e, EObject bd2ne,
			EObject bodyDeclaration, EObject uContainer) {
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerEnumDeclaration2InnerEnum_InMethod";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String b2e__feature____target_name_prime = "target";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(method__bodyDeclaration____mInnerTypes);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uContainer__feature____nestedClassifier);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, feature, method, b2e, bd2ne, bodyDeclaration, uContainer,
				method__bodyDeclaration____mInnerTypes, bd2ne__bodyDeclaration____source,
				b2e__bodyDeclaration____source, bd2ne__feature____target, uContainer__feature____nestedClassifier,
				b2e__feature____target };
	}

	public static final void pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_5_registerobjects_expressionBBBBBBBBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, PerformRuleResult ruleresult, EObject feature,
			EObject method, EObject b2e, EObject bd2ne, EObject me2op, EObject bodyDeclaration, EObject uContainer,
			EObject jContainer, EObject operation, EObject ne2ne) {
		_this.registerObjects_BWD(ruleresult, feature, method, b2e, bd2ne, me2op, bodyDeclaration, uContainer,
				jContainer, operation, ne2ne);

	}

	public static final PerformRuleResult pattern_InnerEnumDeclaration2InnerEnum_InMethod_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_bindingFB(
			InnerEnumDeclaration2InnerEnum_InMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerEnumDeclaration2InnerEnum_InMethod _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_bindingAndBlackFFB(
			InnerEnumDeclaration2InnerEnum_InMethod _this) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerEnumDeclaration2InnerEnum_InMethod";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_2_corematch_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uContainer");
		EObject _localVariable_2 = match.getObject("operation");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		if (tmpFeature instanceof Enumeration) {
			Enumeration feature = (Enumeration) tmpFeature;
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

	public static final Iterable<Object[]> pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_2_corematch_blackBFFBFBFB(
			Enumeration feature, org.eclipse.uml2.uml.Class uContainer, Operation operation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
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
							_result.add(new Object[] { feature, method, me2op, uContainer, jContainer, operation, ne2ne,
									match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_3_findcontext_blackBBBBBBB(
			Enumeration feature, MAbstractMethodDefinition method, NamedElement2NamedElement me2op,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!me2op.equals(ne2ne)) {
			if (operation.equals(me2op.getTarget())) {
				if (jContainer.equals(ne2ne.getSource())) {
					if (uContainer.getOwnedOperations().contains(operation)) {
						if (jContainer.getBodyDeclarations().contains(method)) {
							if (uContainer.getNestedClassifiers().contains(feature)) {
								if (method.equals(me2op.getSource())) {
									if (uContainer.equals(ne2ne.getTarget())) {
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
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			Enumeration feature, MAbstractMethodDefinition method, NamedElement2NamedElement me2op,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			NamedElement2NamedElement ne2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge me2op__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__operation____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__uContainer____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__jContainer____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge me2op__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String me2op__operation____target_name_prime = "target";
		String ne2ne__jContainer____source_name_prime = "source";
		String uContainer__operation____ownedOperation_name_prime = "ownedOperation";
		String operation__uContainer____class_name_prime = "class";
		String jContainer__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__jContainer____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String me2op__method____source_name_prime = "source";
		String ne2ne__uContainer____target_name_prime = "target";
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
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
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
		me2op__method____source.setSrc(me2op);
		me2op__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(me2op__method____source);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		me2op__operation____target.setName(me2op__operation____target_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		uContainer__operation____ownedOperation.setName(uContainer__operation____ownedOperation_name_prime);
		operation__uContainer____class.setName(operation__uContainer____class_name_prime);
		jContainer__method____bodyDeclarations.setName(jContainer__method____bodyDeclarations_name_prime);
		method__jContainer____abstractTypeDeclaration.setName(method__jContainer____abstractTypeDeclaration_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		me2op__method____source.setName(me2op__method____source_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		return new Object[] { feature, method, me2op, uContainer, jContainer, operation, ne2ne, isApplicableMatch,
				me2op__operation____target, ne2ne__jContainer____source, uContainer__operation____ownedOperation,
				operation__uContainer____class, jContainer__method____bodyDeclarations,
				method__jContainer____abstractTypeDeclaration, uContainer__feature____nestedClassifier,
				me2op__method____source, ne2ne__uContainer____target };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_bindingFBBBBBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, IsApplicableMatch isApplicableMatch, Enumeration feature,
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, method, me2op, uContainer,
				jContainer, operation, ne2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, method, me2op, uContainer, jContainer,
					operation, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, IsApplicableMatch isApplicableMatch, Enumeration feature,
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, feature, method, me2op, uContainer, jContainer, operation, ne2ne);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_binding[0];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, method, me2op, uContainer, jContainer,
						operation, ne2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_5_checkCSP_expressionFBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerEnumDeclaration2InnerEnum_InMethod";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerEnumDeclaration2InnerEnum_InMethod_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_bindingFB(
			InnerEnumDeclaration2InnerEnum_InMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerEnumDeclaration2InnerEnum_InMethod _this) {
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

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerEnumDeclaration2InnerEnum_InMethod _this) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_2_testcorematchandDECs_black_nac_0B(
			Enumeration feature) {
		for (org.eclipse.uml2.uml.Package __DEC_feature_packagedElement_231362 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_2_testcorematchandDECs_black_nac_1B(
			Enumeration feature) {
		for (Interface __DEC_feature_nestedClassifier_23047 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_nestedClassifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUContainer = _edge_nestedClassifier.getSrc();
		if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
			EObject tmpFeature = _edge_nestedClassifier.getTrg();
			if (tmpFeature instanceof Enumeration) {
				Enumeration feature = (Enumeration) tmpFeature;
				if (uContainer.getNestedClassifiers().contains(feature)) {
					if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_2_testcorematchandDECs_black_nac_0B(
							feature) == null) {
						if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_2_testcorematchandDECs_black_nac_1B(
								feature) == null) {
							for (Operation operation : uContainer.getOwnedOperations()) {
								_result.add(new Object[] { feature, uContainer, operation, _edge_nestedClassifier });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match, Enumeration feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uContainer, operation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerEnumDeclaration2InnerEnum_InMethod_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_bindingFB(
			InnerEnumDeclaration2InnerEnum_InMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerEnumDeclaration2InnerEnum_InMethod _this) {
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

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerEnumDeclaration2InnerEnum_InMethod _this) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_black_nac_0B(
			EnumDeclaration bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_405896 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_405896 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_black_nac_1BB(
			EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_511169 = bodyDeclaration
					.getAbstractTypeDeclaration();
			if (__DEC_bodyDeclaration_bodyDeclarations_511169 != null) {
				if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_511169)) {
					if (!jContainer.equals(__DEC_bodyDeclaration_bodyDeclarations_511169)) {
						return new Object[] { bodyDeclaration, jContainer };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_black_nac_2B(
			EnumDeclaration bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_776644 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_776644 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_black_nac_3B(
			EnumDeclaration bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_540177 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_540177 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_black_nac_4BB(
			EnumDeclaration bodyDeclaration, MAbstractMethodDefinition method) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_504279 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!method.equals(__DEC_bodyDeclaration_mInnerTypes_504279)) {
				return new Object[] { bodyDeclaration, method };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_mInnerTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMethod = _edge_mInnerTypes.getSrc();
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			EObject tmpBodyDeclaration = _edge_mInnerTypes.getTrg();
			if (tmpBodyDeclaration instanceof EnumDeclaration) {
				EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
				if (method.getMInnerTypes().contains(bodyDeclaration)) {
					AbstractTypeDeclaration jContainer = method.getAbstractTypeDeclaration();
					if (jContainer != null) {
						if (!bodyDeclaration.equals(jContainer)) {
							if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_black_nac_0B(
									bodyDeclaration) == null) {
								if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_black_nac_2B(
										bodyDeclaration) == null) {
									if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_black_nac_3B(
											bodyDeclaration) == null) {
										if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_black_nac_4BB(
												bodyDeclaration, method) == null) {
											if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_black_nac_1BB(
													bodyDeclaration, jContainer) == null) {
												_result.add(new Object[] { method, bodyDeclaration, jContainer,
														_edge_mInnerTypes });
											}
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

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match, MAbstractMethodDefinition method,
			EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, method, bodyDeclaration, jContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerEnumDeclaration2InnerEnum_InMethod_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_1_prepare_blackB(
			InnerEnumDeclaration2InnerEnum_InMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("method");
		EObject _localVariable_2 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = targetMatch.getObject("uContainer");
		EObject _localVariable_4 = sourceMatch.getObject("jContainer");
		EObject _localVariable_5 = targetMatch.getObject("operation");
		EObject tmpFeature = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpUContainer = _localVariable_3;
		EObject tmpJContainer = _localVariable_4;
		EObject tmpOperation = _localVariable_5;
		if (tmpFeature instanceof Enumeration) {
			Enumeration feature = (Enumeration) tmpFeature;
			if (tmpMethod instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
				if (tmpBodyDeclaration instanceof EnumDeclaration) {
					EnumDeclaration bodyDeclaration = (EnumDeclaration) tmpBodyDeclaration;
					if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
						if (tmpJContainer instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) tmpJContainer;
							if (tmpOperation instanceof Operation) {
								Operation operation = (Operation) tmpOperation;
								return new Object[] { feature, method, bodyDeclaration, uContainer, jContainer,
										operation, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_blackBBBBBBBB(
			Enumeration feature, MAbstractMethodDefinition method, EnumDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			Match sourceMatch, Match targetMatch) {
		if (!bodyDeclaration.equals(jContainer)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { feature, method, bodyDeclaration, uContainer, jContainer, operation, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_binding != null) {
			Enumeration feature = (Enumeration) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_binding[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_binding[1];
			EnumDeclaration bodyDeclaration = (EnumDeclaration) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_binding[3];
			AbstractTypeDeclaration jContainer = (AbstractTypeDeclaration) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_binding[4];
			Operation operation = (Operation) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_blackBBBBBBBB(
					feature, method, bodyDeclaration, uContainer, jContainer, operation, sourceMatch, targetMatch);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, method, bodyDeclaration, uContainer, jContainer, operation, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_bindingFBBBBBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Enumeration feature, MAbstractMethodDefinition method,
			EnumDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(feature, method, bodyDeclaration, uContainer, jContainer,
				operation, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, feature, method, bodyDeclaration, uContainer, jContainer, operation,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, Enumeration feature, MAbstractMethodDefinition method,
			EnumDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, feature, method, bodyDeclaration, uContainer, jContainer, operation, sourceMatch, targetMatch);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_binding[0];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, method, bodyDeclaration, uContainer, jContainer, operation,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_5_matchcorrcontext_blackBFBBBFBB(
			MAbstractMethodDefinition method, org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer,
			Operation operation, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (NamedElement2NamedElement me2op : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(operation, NamedElement2NamedElement.class, "target")) {
				if (method.equals(me2op.getSource())) {
					for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jContainer, NamedElement2NamedElement.class, "source")) {
						if (!me2op.equals(ne2ne)) {
							if (uContainer.equals(ne2ne.getTarget())) {
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

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_5_matchcorrcontext_greenBBBBF(
			NamedElement2NamedElement me2op, NamedElement2NamedElement ne2ne, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InnerEnumDeclaration2InnerEnum_InMethod";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(me2op);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { me2op, ne2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_6_createcorrespondence_blackBBBBBBB(
			Enumeration feature, MAbstractMethodDefinition method, EnumDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, AbstractTypeDeclaration jContainer, Operation operation,
			CCMatch ccMatch) {
		if (!bodyDeclaration.equals(jContainer)) {
			return new Object[] { feature, method, bodyDeclaration, uContainer, jContainer, operation, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_6_createcorrespondence_greenBFFBB(
			Enumeration feature, EnumDeclaration bodyDeclaration, CCMatch ccMatch) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		ccMatch.getCreateCorr().add(bd2ne);
		return new Object[] { feature, b2e, bd2ne, bodyDeclaration, ccMatch };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InnerEnumDeclaration2InnerEnum_InMethod";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerEnumDeclaration2InnerEnum_InMethod_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_black_nac_0B(
			EnumDeclaration bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_103674 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_103674 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_black_nac_1BB(
			EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_977229 = bodyDeclaration
					.getAbstractTypeDeclaration();
			if (__DEC_bodyDeclaration_bodyDeclarations_977229 != null) {
				if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_977229)) {
					if (!jContainer.equals(__DEC_bodyDeclaration_bodyDeclarations_977229)) {
						return new Object[] { bodyDeclaration, jContainer };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_black_nac_2B(
			EnumDeclaration bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_869545 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_869545 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_black_nac_3B(
			EnumDeclaration bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_187222 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_187222 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_black_nac_4BB(
			EnumDeclaration bodyDeclaration, MAbstractMethodDefinition method) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_837415 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!method.equals(__DEC_bodyDeclaration_mInnerTypes_837415)) {
				return new Object[] { bodyDeclaration, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_blackBBB(
			MAbstractMethodDefinition method, EnumDeclaration bodyDeclaration, AbstractTypeDeclaration jContainer) {
		if (!bodyDeclaration.equals(jContainer)) {
			if (method.getMInnerTypes().contains(bodyDeclaration)) {
				if (jContainer.getBodyDeclarations().contains(method)) {
					if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_black_nac_0B(
							bodyDeclaration) == null) {
						if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_black_nac_1BB(
								bodyDeclaration, jContainer) == null) {
							if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_black_nac_2B(
									bodyDeclaration) == null) {
								if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_black_nac_3B(
										bodyDeclaration) == null) {
									if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_1_matchtggpattern_black_nac_4BB(
											bodyDeclaration, method) == null) {
										return new Object[] { method, bodyDeclaration, jContainer };
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

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_28_1_matchtggpattern_black_nac_0B(
			Enumeration feature) {
		for (org.eclipse.uml2.uml.Package __DEC_feature_packagedElement_745475 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_28_1_matchtggpattern_black_nac_1B(
			Enumeration feature) {
		for (Interface __DEC_feature_nestedClassifier_361050 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_28_1_matchtggpattern_blackBBB(
			Enumeration feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		if (uContainer.getOwnedOperations().contains(operation)) {
			if (uContainer.getNestedClassifiers().contains(feature)) {
				if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_28_1_matchtggpattern_black_nac_0B(
						feature) == null) {
					if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_28_1_matchtggpattern_black_nac_1B(
							feature) == null) {
						return new Object[] { feature, uContainer, operation };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_1_createresult_blackB(
			InnerEnumDeclaration2InnerEnum_InMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement me2op) {
		if (ruleResult.getCorrObjects().contains(me2op)) {
			return new Object[] { ruleResult, me2op };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Operation operation) {
		if (ruleResult.getTargetObjects().contains(operation)) {
			return new Object[] { ruleResult, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration jContainer) {
		if (ruleResult.getSourceObjects().contains(jContainer)) {
			return new Object[] { ruleResult, jContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_blackFFFFFFFBB(
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
									if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, me2op) == null) {
										if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, method) == null) {
											if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, operation) == null) {
												if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_5BB(
														ruleResult, jContainer) == null) {
													if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_3BB(
															ruleResult, uContainer) == null) {
														for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(jContainer,
																		NamedElement2NamedElement.class, "source")) {
															if (!me2op.equals(ne2ne)) {
																if (uContainer.equals(ne2ne.getTarget())) {
																	if (pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_2_isapplicablecore_black_nac_4BB(
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

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_bindingFBBBBBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, IsApplicableMatch isApplicableMatch,
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

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_binding = pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, method, me2op, uContainer, jContainer, operation, ne2ne, ruleResult);
		if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_binding[0];

			Object[] result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_black = pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, me2op, uContainer, jContainer, operation,
						ne2ne, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_4_checkCSP_expressionFBB(
			InnerEnumDeclaration2InnerEnum_InMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_5_checknacs_blackBBBBBB(
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne) {
		if (!me2op.equals(ne2ne)) {
			return new Object[] { method, me2op, uContainer, jContainer, operation, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_6_perform_blackBBBBBBB(
			MAbstractMethodDefinition method, NamedElement2NamedElement me2op, org.eclipse.uml2.uml.Class uContainer,
			AbstractTypeDeclaration jContainer, Operation operation, NamedElement2NamedElement ne2ne,
			ModelgeneratorRuleResult ruleResult) {
		if (!me2op.equals(ne2ne)) {
			return new Object[] { method, me2op, uContainer, jContainer, operation, ne2ne, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_6_perform_greenFBFFFBBB(
			MAbstractMethodDefinition method, org.eclipse.uml2.uml.Class uContainer,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Enumeration feature = UMLFactory.eINSTANCE.createEnumeration();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		EnumDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createEnumDeclaration();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("bodyDeclaration", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		uContainer.getNestedClassifiers().add(feature);
		ruleResult.getTargetObjects().add(feature);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		bd2ne.setTarget(feature);
		ruleResult.getCorrObjects().add(bd2ne);
		method.getMInnerTypes().add(bodyDeclaration);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		String feature_name_prime = (String) _localVariable_0;
		String bodyDeclaration_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		feature.setName(feature_name_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { feature, method, b2e, bd2ne, bodyDeclaration, uContainer, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_InnerEnumDeclaration2InnerEnum_InMethod_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InnerEnumDeclaration2InnerEnum_InMethodImpl
