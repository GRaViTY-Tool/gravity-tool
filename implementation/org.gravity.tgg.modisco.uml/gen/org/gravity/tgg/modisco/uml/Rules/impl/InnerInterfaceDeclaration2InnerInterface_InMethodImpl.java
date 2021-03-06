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
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.InnerInterfaceDeclaration2InnerInterface_InMethod;
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
 * An implementation of the model object '<em><b>Inner Interface Declaration2 Inner Interface In Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InnerInterfaceDeclaration2InnerInterface_InMethodImpl extends AbstractRuleImpl
		implements InnerInterfaceDeclaration2InnerInterface_InMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InnerInterfaceDeclaration2InnerInterface_InMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInnerInterfaceDeclaration2InnerInterface_InMethod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MAbstractMethodDefinition method,
			InterfaceDeclaration bodyDeclaration) {

		Object[] result1_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_1_initialbindings_blackBBBB(this, match,
						method, bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_bindingAndBlackFBBBB(this,
						match, method, bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_4_collectelementstobetranslated_blackBBB(
							match, method, bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_4_collectelementstobetranslated_greenBBBF(
							match, method, bodyDeclaration);
			//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_5_collectcontextelements_blackBBB(
							match, method, bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_5_collectcontextelements_greenBB(match,
							method);

			// 
			InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_6_registerobjectstomatch_expressionBBBB(
							this, match, method, bodyDeclaration);
			return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_7_expressionF();
		} else {
			return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_bindingAndBlackFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[0];
		ASTNode2Element me2op = (ASTNode2Element) result1_bindingAndBlack[1];
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		Operation operation = (Operation) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_greenFFFBBB(
						bodyDeclaration, uContainer, csp);
		Interface feature = (Interface) result1_green[0];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[2];

		Object[] result2_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_2_collecttranslatedelements_blackBBBB(
						feature, bd2ne, b2e, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne
							+ ", " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_2_collecttranslatedelements_greenFBBBB(
						feature, bd2ne, b2e, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_3_bookkeepingforedges_blackBBBBBBBBB(
						ruleresult, feature, bd2ne, method, b2e, me2op, bodyDeclaration, uContainer, operation);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[feature] = "
							+ feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[method] = " + method + ", " + "[b2e] = "
							+ b2e + ", " + "[me2op] = " + me2op + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uContainer] = " + uContainer + ", " + "[operation] = " + operation + ".");
		}
		InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
						ruleresult, feature, bd2ne, method, b2e, bodyDeclaration, uContainer);
		//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[12];

		// 
		// 
		InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_5_registerobjects_expressionBBBBBBBBBB(
						this, ruleresult, feature, bd2ne, method, b2e, me2op, bodyDeclaration, uContainer, operation);
		return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_bindingAndBlackFFB(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_greenBF(
						performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_binding[0];
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result2_binding[1];
		for (Object[] result2_black : InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_2_corematch_blackBFBFB(method,
						bodyDeclaration, match)) {
			ASTNode2Element me2op = (ASTNode2Element) result2_black[1];
			Operation operation = (Operation) result2_black[3];
			// ForEach 
			for (Object[] result3_black : InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_3_findcontext_blackBBBFB(method, me2op,
							bodyDeclaration, operation)) {
				org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result3_black[3];
				Object[] result3_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_3_findcontext_greenBBBBBFFFFFF(
								method, me2op, bodyDeclaration, uContainer, operation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge me2op__operation____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge me2op__method____source = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_bindingAndBlackFBBBBBBB(
								this, isApplicableMatch, method, me2op, bodyDeclaration, uContainer, operation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[me2op] = " + me2op + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uContainer] = " + uContainer + ", " + "[operation] = " + operation + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_5_checkCSP_expressionFBB(this,
								csp)) {

					Object[] result6_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
							.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerInterfaceDeclaration2InnerInterface_InMethodImpl
							.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MAbstractMethodDefinition method,
			InterfaceDeclaration bodyDeclaration) {
		match.registerObject("method", method);
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MAbstractMethodDefinition method,
			InterfaceDeclaration bodyDeclaration) {// Create CSP
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
			ASTNode2Element me2op, InterfaceDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {// Create CSP
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject method,
			EObject b2e, EObject me2op, EObject bodyDeclaration, EObject uContainer, EObject operation) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("me2op", me2op);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
				.equals("java.InterfaceDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Interface feature, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {

		Object[] result1_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_1_initialbindings_blackBBBBB(this, match,
						feature, uContainer, operation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer
					+ ", " + "[operation] = " + operation + ".");
		}

		Object[] result2_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_bindingAndBlackFBBBBB(this,
						match, feature, uContainer, operation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer
					+ ", " + "[operation] = " + operation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_4_collectelementstobetranslated_blackBBBB(
							match, feature, uContainer, operation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ", " + "[operation] = "
						+ operation + ".");
			}
			InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_4_collectelementstobetranslated_greenBBBF(
							match, feature, uContainer);
			//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_5_collectcontextelements_blackBBBB(
							match, feature, uContainer, operation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ", " + "[operation] = "
						+ operation + ".");
			}
			InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_5_collectcontextelements_greenBBBFF(
							match, uContainer, operation);
			//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result5_green[4];

			// 
			InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_6_registerobjectstomatch_expressionBBBBB(
							this, match, feature, uContainer, operation);
			return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_7_expressionF();
		} else {
			return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_bindingAndBlackFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Interface feature = (Interface) result1_bindingAndBlack[0];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result1_bindingAndBlack[1];
		ASTNode2Element me2op = (ASTNode2Element) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		Operation operation = (Operation) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_greenBFBFFB(
						feature, method, csp);
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[1];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[3];
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result1_green[4];

		Object[] result2_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_2_collecttranslatedelements_blackBBBB(
						feature, bd2ne, b2e, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", " + "[bd2ne] = " + bd2ne
							+ ", " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_2_collecttranslatedelements_greenFBBBB(
						feature, bd2ne, b2e, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_3_bookkeepingforedges_blackBBBBBBBBB(
						ruleresult, feature, bd2ne, method, b2e, me2op, bodyDeclaration, uContainer, operation);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[feature] = "
							+ feature + ", " + "[bd2ne] = " + bd2ne + ", " + "[method] = " + method + ", " + "[b2e] = "
							+ b2e + ", " + "[me2op] = " + me2op + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uContainer] = " + uContainer + ", " + "[operation] = " + operation + ".");
		}
		InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
						ruleresult, feature, bd2ne, method, b2e, bodyDeclaration, uContainer);
		//nothing EMoflonEdge method__bodyDeclaration____mInnerTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[12];

		// 
		// 
		InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_5_registerobjects_expressionBBBBBBBBBB(
						this, ruleresult, feature, bd2ne, method, b2e, me2op, bodyDeclaration, uContainer, operation);
		return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_bindingAndBlackFFB(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_greenBF(
						performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Interface feature = (Interface) result2_binding[0];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_binding[1];
		Operation operation = (Operation) result2_binding[2];
		for (Object[] result2_black : InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_2_corematch_blackBFFBBB(feature,
						uContainer, operation, match)) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[1];
			ASTNode2Element me2op = (ASTNode2Element) result2_black[2];
			// ForEach 
			for (Object[] result3_black : InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_3_findcontext_blackBBBBB(feature,
							method, me2op, uContainer, operation)) {
				Object[] result3_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_3_findcontext_greenBBBBBFFFFFF(
								feature, method, me2op, uContainer, operation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge me2op__operation____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge uContainer__operation____ownedOperation = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge operation__uContainer____class = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge me2op__method____source = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_bindingAndBlackFBBBBBBB(
								this, isApplicableMatch, feature, method, me2op, uContainer, operation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[method] = " + method + ", " + "[me2op] = " + me2op + ", " + "[uContainer] = "
							+ uContainer + ", " + "[operation] = " + operation + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_5_checkCSP_expressionFBB(this,
								csp)) {

					Object[] result6_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
							.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InnerInterfaceDeclaration2InnerInterface_InMethodImpl
							.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Interface feature, org.eclipse.uml2.uml.Class uContainer,
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
	public CSP isAppropriate_solveCsp_BWD(Match match, Interface feature, org.eclipse.uml2.uml.Class uContainer,
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Interface feature,
			MAbstractMethodDefinition method, ASTNode2Element me2op, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {// Create CSP
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject method,
			EObject b2e, EObject me2op, EObject bodyDeclaration, EObject uContainer, EObject operation) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("me2op", me2op);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass()).equals("uml.Interface.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_376(EMoflonEdge _edge_nestedClassifier) {

		Object[] result1_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_bindingAndBlackFFBF(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_2_testcorematchandDECs_blackFFFB(
						_edge_nestedClassifier)) {
			Interface feature = (Interface) result2_black[0];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[1];
			Operation operation = (Operation) result2_black[2];
			Object[] result2_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, feature, uContainer, operation)) {
				// 
				if (InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
							.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerInterfaceDeclaration2InnerInterface_InMethodImpl
							.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_387(EMoflonEdge _edge_mInnerTypes) {

		Object[] result1_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_bindingAndBlackFFBF(
						this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_blackFFB(
						_edge_mInnerTypes)) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[0];
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result2_black[1];
			Object[] result2_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_greenFB(
							__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, method, bodyDeclaration)) {
				// 
				if (InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
							.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_5_Addmatchtoruleresult_blackBBBB(
									match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InnerInterfaceDeclaration2InnerInterface_InMethodImpl
							.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_5_Addmatchtoruleresult_greenBBBB(
									match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InnerInterfaceDeclaration2InnerInterface_InMethod");
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

		eq0.setRuleName("InnerInterfaceDeclaration2InnerInterface_InMethod");
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
		ruleResult.setRule("InnerInterfaceDeclaration2InnerInterface_InMethod");
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

		eq0.setRuleName("InnerInterfaceDeclaration2InnerInterface_InMethod");
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

		Object[] result1_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Interface feature = (Interface) result2_bindingAndBlack[0];
		MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_bindingAndBlack[1];
		InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[3];
		Operation operation = (Operation) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this,
						feature, method, bodyDeclaration, uContainer, operation, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[method] = " + method + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ", " + "[uContainer] = " + uContainer + ", " + "[operation] = " + operation
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_5_matchcorrcontext_blackBFBBB(method,
							operation, sourceMatch, targetMatch)) {
				ASTNode2Element me2op = (ASTNode2Element) result5_black[1];
				Object[] result5_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_5_matchcorrcontext_greenBBBF(
								me2op, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_6_createcorrespondence_blackBBBBBB(
								feature, method, bodyDeclaration, uContainer, operation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[method] = " + method + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[uContainer] = " + uContainer + ", " + "[operation] = " + operation + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_6_createcorrespondence_greenBFFBB(
								feature, bodyDeclaration, ccMatch);
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[1];
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[2];

				Object[] result7_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_7_addtoreturnedresult_blackBB(
								result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_7_addtoreturnedresult_greenBB(
								result, ccMatch);

			}

		} else {
		}
		return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Interface feature, MAbstractMethodDefinition method,
			InterfaceDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer, Operation operation,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MAbstractMethodDefinition method, InterfaceDeclaration bodyDeclaration) {// 
		Object[] result1_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_blackBB(method,
						bodyDeclaration);
		if (result1_black != null) {
			return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_2_expressionF();
		} else {
			return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Interface feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {// 
		Object[] result1_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_28_1_matchtggpattern_blackBBB(feature,
						uContainer, operation);
		if (result1_black != null) {
			return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_28_2_expressionF();
		} else {
			return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNode2Element me2opParameter) {

		Object[] result1_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_2_isapplicablecore_blackFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList me2opList = (RuleEntryList) result2_black[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result2_black[1];
			ASTNode2Element me2op = (ASTNode2Element) result2_black[2];
			Operation operation = (Operation) result2_black[3];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[4];

			Object[] result3_bindingAndBlack = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_bindingAndBlackFBBBBBBB(
							this, isApplicableMatch, method, me2op, uContainer, operation, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
						+ "[me2op] = " + me2op + ", " + "[uContainer] = " + uContainer + ", " + "[operation] = "
						+ operation + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InnerInterfaceDeclaration2InnerInterface_InMethodImpl
					.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
						.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_5_checknacs_blackBBBB(method,
								me2op, uContainer, operation);
				if (result5_black != null) {

					Object[] result6_black = InnerInterfaceDeclaration2InnerInterface_InMethodImpl
							.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_6_perform_blackBBBBB(method,
									me2op, uContainer, operation, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
								+ ", " + "[me2op] = " + me2op + ", " + "[uContainer] = " + uContainer + ", "
								+ "[operation] = " + operation + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					InnerInterfaceDeclaration2InnerInterface_InMethodImpl
							.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_6_perform_greenFFBFFBBB(
									method, uContainer, ruleResult, csp);
					//nothing Interface feature = (Interface) result6_green[0];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[1];
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[3];
					//nothing InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return InnerInterfaceDeclaration2InnerInterface_InMethodImpl
				.pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_7_expressionFB(ruleResult);
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
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPROPRIATE_FWD__MATCH_MABSTRACTMETHODDEFINITION_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MABSTRACTMETHODDEFINITION_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
			return null;
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MABSTRACTMETHODDEFINITION_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_INTERFACEDECLARATION_CLASS_OPERATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(InterfaceDeclaration) arguments.get(3), (org.eclipse.uml2.uml.Class) arguments.get(4),
					(Operation) arguments.get(5));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPROPRIATE_BWD__MATCH_INTERFACE_CLASS_OPERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_INTERFACE_CLASS_OPERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Operation) arguments.get(3));
			return null;
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_INTERFACE_CLASS_OPERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Interface) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACE_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_CLASS_OPERATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Interface) arguments.get(1),
					(MAbstractMethodDefinition) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(org.eclipse.uml2.uml.Class) arguments.get(4), (Operation) arguments.get(5));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_376__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_376((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPROPRIATE_FWD_EMOFLON_EDGE_387__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_387((EMoflonEdge) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPLICABLE_SOLVE_CSP_CC__INTERFACE_MABSTRACTMETHODDEFINITION_INTERFACEDECLARATION_CLASS_OPERATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Interface) arguments.get(0), (MAbstractMethodDefinition) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3),
					(Operation) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___CHECK_DEC_FWD__MABSTRACTMETHODDEFINITION_INTERFACEDECLARATION:
			return checkDEC_FWD((MAbstractMethodDefinition) arguments.get(0), (InterfaceDeclaration) arguments.get(1));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___CHECK_DEC_BWD__INTERFACE_CLASS_OPERATION:
			return checkDEC_BWD((Interface) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MABSTRACTMETHODDEFINITION_ASTNODE2ELEMENT_CLASS_OPERATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MAbstractMethodDefinition) arguments.get(1), (ASTNode2Element) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (Operation) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.INNER_INTERFACE_DECLARATION2_INNER_INTERFACE_IN_METHOD___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_1_initialbindings_blackBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match, MAbstractMethodDefinition method,
			InterfaceDeclaration bodyDeclaration) {
		return new Object[] { _this, match, method, bodyDeclaration };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_bindingFBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match, MAbstractMethodDefinition method,
			InterfaceDeclaration bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, method, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, method, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_bindingAndBlackFBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match, MAbstractMethodDefinition method,
			InterfaceDeclaration bodyDeclaration) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_bindingFBBBB(
				_this, match, method, bodyDeclaration);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, method, bodyDeclaration };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_3_CheckCSP_expressionFBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_4_collectelementstobetranslated_blackBBB(
			Match match, MAbstractMethodDefinition method, InterfaceDeclaration bodyDeclaration) {
		return new Object[] { match, method, bodyDeclaration };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MAbstractMethodDefinition method, InterfaceDeclaration bodyDeclaration) {
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(method__bodyDeclaration____mInnerTypes);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		return new Object[] { match, method, bodyDeclaration, method__bodyDeclaration____mInnerTypes };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_5_collectcontextelements_blackBBB(
			Match match, MAbstractMethodDefinition method, InterfaceDeclaration bodyDeclaration) {
		return new Object[] { match, method, bodyDeclaration };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_5_collectcontextelements_greenBB(
			Match match, MAbstractMethodDefinition method) {
		match.getContextNodes().add(method);
		return new Object[] { match, method };
	}

	public static final void pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_6_registerobjectstomatch_expressionBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match, MAbstractMethodDefinition method,
			InterfaceDeclaration bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, method, bodyDeclaration);

	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("me2op");
		EObject _localVariable_2 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("operation");
		EObject tmpMethod = _localVariable_0;
		EObject tmpMe2op = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpUContainer = _localVariable_3;
		EObject tmpOperation = _localVariable_4;
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			if (tmpMe2op instanceof ASTNode2Element) {
				ASTNode2Element me2op = (ASTNode2Element) tmpMe2op;
				if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
					InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
					if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							return new Object[] { method, me2op, bodyDeclaration, uContainer, operation,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_blackBBBBBFBB(
			MAbstractMethodDefinition method, ASTNode2Element me2op, InterfaceDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Operation operation,
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { method, me2op, bodyDeclaration, uContainer, operation, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_binding != null) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_binding[0];
			ASTNode2Element me2op = (ASTNode2Element) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_binding[1];
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_binding[3];
			Operation operation = (Operation) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_binding[4];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_blackBBBBBFBB(
					method, me2op, bodyDeclaration, uContainer, operation, _this, isApplicableMatch);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_black[5];

				return new Object[] { method, me2op, bodyDeclaration, uContainer, operation, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_1_performtransformation_greenFFFBBB(
			InterfaceDeclaration bodyDeclaration, org.eclipse.uml2.uml.Class uContainer, CSP csp) {
		Interface feature = UMLFactory.eINSTANCE.createInterface();
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_2_collecttranslatedelements_blackBBBB(
			Interface feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			InterfaceDeclaration bodyDeclaration) {
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_2_collecttranslatedelements_greenFBBBB(
			Interface feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			InterfaceDeclaration bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject method, EObject b2e, EObject me2op,
			EObject bodyDeclaration, EObject uContainer, EObject operation) {
		if (!feature.equals(method)) {
			if (!feature.equals(me2op)) {
				if (!feature.equals(uContainer)) {
					if (!feature.equals(operation)) {
						if (!bd2ne.equals(feature)) {
							if (!bd2ne.equals(method)) {
								if (!bd2ne.equals(me2op)) {
									if (!bd2ne.equals(bodyDeclaration)) {
										if (!bd2ne.equals(uContainer)) {
											if (!bd2ne.equals(operation)) {
												if (!method.equals(uContainer)) {
													if (!method.equals(operation)) {
														if (!b2e.equals(feature)) {
															if (!b2e.equals(bd2ne)) {
																if (!b2e.equals(method)) {
																	if (!b2e.equals(me2op)) {
																		if (!b2e.equals(bodyDeclaration)) {
																			if (!b2e.equals(uContainer)) {
																				if (!b2e.equals(operation)) {
																					if (!me2op.equals(method)) {
																						if (!me2op.equals(uContainer)) {
																							if (!me2op.equals(
																									operation)) {
																								if (!bodyDeclaration
																										.equals(feature)) {
																									if (!bodyDeclaration
																											.equals(method)) {
																										if (!bodyDeclaration
																												.equals(me2op)) {
																											if (!bodyDeclaration
																													.equals(uContainer)) {
																												if (!bodyDeclaration
																														.equals(operation)) {
																													if (!operation
																															.equals(uContainer)) {
																														return new Object[] {
																																ruleresult,
																																feature,
																																bd2ne,
																																method,
																																b2e,
																																me2op,
																																bodyDeclaration,
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
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject method, EObject b2e,
			EObject bodyDeclaration, EObject uContainer) {
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerInterfaceDeclaration2InnerInterface_InMethod";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String b2e__feature____target_name_prime = "target";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(method__bodyDeclaration____mInnerTypes);
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
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, feature, bd2ne, method, b2e, bodyDeclaration, uContainer,
				method__bodyDeclaration____mInnerTypes, bd2ne__bodyDeclaration____source, bd2ne__feature____target,
				b2e__bodyDeclaration____source, uContainer__feature____nestedClassifier, b2e__feature____target };
	}

	public static final void pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_5_registerobjects_expressionBBBBBBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, PerformRuleResult ruleresult, EObject feature,
			EObject bd2ne, EObject method, EObject b2e, EObject me2op, EObject bodyDeclaration, EObject uContainer,
			EObject operation) {
		_this.registerObjects_FWD(ruleresult, feature, bd2ne, method, b2e, me2op, bodyDeclaration, uContainer,
				operation);

	}

	public static final PerformRuleResult pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_bindingFB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_bindingAndBlackFFB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerInterfaceDeclaration2InnerInterface_InMethod";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_2_corematch_bindingFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("method");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject tmpMethod = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
				InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
				return new Object[] { method, bodyDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_2_corematch_blackBFBFB(
			MAbstractMethodDefinition method, InterfaceDeclaration bodyDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element me2op : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(method,
				ASTNode2Element.class, "source")) {
			Element tmpOperation = me2op.getTarget();
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				_result.add(new Object[] { method, me2op, bodyDeclaration, operation, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_3_findcontext_blackBBBFB(
			MAbstractMethodDefinition method, ASTNode2Element me2op, InterfaceDeclaration bodyDeclaration,
			Operation operation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (operation.equals(me2op.getTarget())) {
			if (method.getMInnerTypes().contains(bodyDeclaration)) {
				if (method.equals(me2op.getSource())) {
					org.eclipse.uml2.uml.Class uContainer = operation.getClass_();
					if (uContainer != null) {
						_result.add(new Object[] { method, me2op, bodyDeclaration, uContainer, operation });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_3_findcontext_greenBBBBBFFFFFF(
			MAbstractMethodDefinition method, ASTNode2Element me2op, InterfaceDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge me2op__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__operation____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__uContainer____class = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge me2op__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String me2op__operation____target_name_prime = "target";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String uContainer__operation____ownedOperation_name_prime = "ownedOperation";
		String operation__uContainer____class_name_prime = "class";
		String me2op__method____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(me2op);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(operation);
		me2op__operation____target.setSrc(me2op);
		me2op__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(me2op__operation____target);
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(method__bodyDeclaration____mInnerTypes);
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
		uContainer__operation____ownedOperation.setName(uContainer__operation____ownedOperation_name_prime);
		operation__uContainer____class.setName(operation__uContainer____class_name_prime);
		me2op__method____source.setName(me2op__method____source_name_prime);
		return new Object[] { method, me2op, bodyDeclaration, uContainer, operation, isApplicableMatch,
				me2op__operation____target, method__bodyDeclaration____mInnerTypes,
				uContainer__operation____ownedOperation, operation__uContainer____class, me2op__method____source };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_bindingFBBBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, ASTNode2Element me2op, InterfaceDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, method, me2op, bodyDeclaration,
				uContainer, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, me2op, bodyDeclaration, uContainer,
					operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, ASTNode2Element me2op, InterfaceDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, method, me2op, bodyDeclaration, uContainer, operation);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_binding[0];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, me2op, bodyDeclaration, uContainer,
						operation };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_5_checkCSP_expressionFBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerInterfaceDeclaration2InnerInterface_InMethod";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_1_initialbindings_blackBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match, Interface feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		return new Object[] { _this, match, feature, uContainer, operation };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_bindingFBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match, Interface feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uContainer, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uContainer, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_bindingAndBlackFBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match, Interface feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_bindingFBBBBB(
				_this, match, feature, uContainer, operation);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uContainer, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_3_CheckCSP_expressionFBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Interface feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		return new Object[] { match, feature, uContainer, operation };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Interface feature, org.eclipse.uml2.uml.Class uContainer) {
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		match.getToBeTranslatedEdges().add(uContainer__feature____nestedClassifier);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		return new Object[] { match, feature, uContainer, uContainer__feature____nestedClassifier };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_5_collectcontextelements_blackBBBB(
			Match match, Interface feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		return new Object[] { match, feature, uContainer, operation };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_5_collectcontextelements_greenBBBFF(
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

	public static final void pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_6_registerobjectstomatch_expressionBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match, Interface feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		_this.registerObjectsToMatch_BWD(match, feature, uContainer, operation);

	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_bindingFFFFFB(
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
		if (tmpFeature instanceof Interface) {
			Interface feature = (Interface) tmpFeature;
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_blackBBBBBFBB(
			Interface feature, MAbstractMethodDefinition method, ASTNode2Element me2op,
			org.eclipse.uml2.uml.Class uContainer, Operation operation,
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, method, me2op, uContainer, operation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_binding != null) {
			Interface feature = (Interface) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_binding[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_binding[1];
			ASTNode2Element me2op = (ASTNode2Element) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_binding[3];
			Operation operation = (Operation) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_binding[4];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_blackBBBBBFBB(
					feature, method, me2op, uContainer, operation, _this, isApplicableMatch);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_black[5];

				return new Object[] { feature, method, me2op, uContainer, operation, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_1_performtransformation_greenBFBFFB(
			Interface feature, MAbstractMethodDefinition method, CSP csp) {
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		InterfaceDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createInterfaceDeclaration();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		bd2ne.setTarget(feature);
		b2e.setTarget(feature);
		method.getMInnerTypes().add(bodyDeclaration);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { feature, bd2ne, method, b2e, bodyDeclaration, csp };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_2_collecttranslatedelements_blackBBBB(
			Interface feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			InterfaceDeclaration bodyDeclaration) {
		return new Object[] { feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_2_collecttranslatedelements_greenFBBBB(
			Interface feature, NamedElement2NamedElement bd2ne, ASTNode2Element b2e,
			InterfaceDeclaration bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, feature, bd2ne, b2e, bodyDeclaration };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject method, EObject b2e, EObject me2op,
			EObject bodyDeclaration, EObject uContainer, EObject operation) {
		if (!feature.equals(method)) {
			if (!feature.equals(me2op)) {
				if (!feature.equals(uContainer)) {
					if (!feature.equals(operation)) {
						if (!bd2ne.equals(feature)) {
							if (!bd2ne.equals(method)) {
								if (!bd2ne.equals(me2op)) {
									if (!bd2ne.equals(bodyDeclaration)) {
										if (!bd2ne.equals(uContainer)) {
											if (!bd2ne.equals(operation)) {
												if (!method.equals(uContainer)) {
													if (!method.equals(operation)) {
														if (!b2e.equals(feature)) {
															if (!b2e.equals(bd2ne)) {
																if (!b2e.equals(method)) {
																	if (!b2e.equals(me2op)) {
																		if (!b2e.equals(bodyDeclaration)) {
																			if (!b2e.equals(uContainer)) {
																				if (!b2e.equals(operation)) {
																					if (!me2op.equals(method)) {
																						if (!me2op.equals(uContainer)) {
																							if (!me2op.equals(
																									operation)) {
																								if (!bodyDeclaration
																										.equals(feature)) {
																									if (!bodyDeclaration
																											.equals(method)) {
																										if (!bodyDeclaration
																												.equals(me2op)) {
																											if (!bodyDeclaration
																													.equals(uContainer)) {
																												if (!bodyDeclaration
																														.equals(operation)) {
																													if (!operation
																															.equals(uContainer)) {
																														return new Object[] {
																																ruleresult,
																																feature,
																																bd2ne,
																																method,
																																b2e,
																																me2op,
																																bodyDeclaration,
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
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject bd2ne, EObject method, EObject b2e,
			EObject bodyDeclaration, EObject uContainer) {
		EMoflonEdge method__bodyDeclaration____mInnerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InnerInterfaceDeclaration2InnerInterface_InMethod";
		String method__bodyDeclaration____mInnerTypes_name_prime = "mInnerTypes";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String b2e__feature____target_name_prime = "target";
		method__bodyDeclaration____mInnerTypes.setSrc(method);
		method__bodyDeclaration____mInnerTypes.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(method__bodyDeclaration____mInnerTypes);
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
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		method__bodyDeclaration____mInnerTypes.setName(method__bodyDeclaration____mInnerTypes_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, feature, bd2ne, method, b2e, bodyDeclaration, uContainer,
				method__bodyDeclaration____mInnerTypes, bd2ne__bodyDeclaration____source, bd2ne__feature____target,
				b2e__bodyDeclaration____source, uContainer__feature____nestedClassifier, b2e__feature____target };
	}

	public static final void pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_5_registerobjects_expressionBBBBBBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, PerformRuleResult ruleresult, EObject feature,
			EObject bd2ne, EObject method, EObject b2e, EObject me2op, EObject bodyDeclaration, EObject uContainer,
			EObject operation) {
		_this.registerObjects_BWD(ruleresult, feature, bd2ne, method, b2e, me2op, bodyDeclaration, uContainer,
				operation);

	}

	public static final PerformRuleResult pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_bindingFB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_blackFBB(
			EClass eClass, InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_bindingAndBlackFFB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InnerInterfaceDeclaration2InnerInterface_InMethod";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_2_corematch_bindingFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uContainer");
		EObject _localVariable_2 = match.getObject("operation");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		if (tmpFeature instanceof Interface) {
			Interface feature = (Interface) tmpFeature;
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

	public static final Iterable<Object[]> pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_2_corematch_blackBFFBBB(
			Interface feature, org.eclipse.uml2.uml.Class uContainer, Operation operation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element me2op : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(operation,
				ASTNode2Element.class, "target")) {
			ASTNode tmpMethod = me2op.getSource();
			if (tmpMethod instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
				_result.add(new Object[] { feature, method, me2op, uContainer, operation, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_3_findcontext_blackBBBBB(
			Interface feature, MAbstractMethodDefinition method, ASTNode2Element me2op,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (operation.equals(me2op.getTarget())) {
			if (uContainer.getOwnedOperations().contains(operation)) {
				if (uContainer.getNestedClassifiers().contains(feature)) {
					if (method.equals(me2op.getSource())) {
						_result.add(new Object[] { feature, method, me2op, uContainer, operation });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_3_findcontext_greenBBBBBFFFFFF(
			Interface feature, MAbstractMethodDefinition method, ASTNode2Element me2op,
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_bindingFBBBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, IsApplicableMatch isApplicableMatch,
			Interface feature, MAbstractMethodDefinition method, ASTNode2Element me2op,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, method, me2op, uContainer,
				operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, method, me2op, uContainer, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, IsApplicableMatch isApplicableMatch,
			Interface feature, MAbstractMethodDefinition method, ASTNode2Element me2op,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, feature, method, me2op, uContainer, operation);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_binding[0];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, method, me2op, uContainer, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_5_checkCSP_expressionFBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InnerInterfaceDeclaration2InnerInterface_InMethod";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_bindingFB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_2_testcorematchandDECs_black_nac_0B(
			Interface feature) {
		for (org.eclipse.uml2.uml.Package __DEC_feature_packagedElement_811934 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_2_testcorematchandDECs_black_nac_1B(
			Interface feature) {
		for (Interface __DEC_feature_nestedClassifier_848014 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			if (!feature.equals(__DEC_feature_nestedClassifier_848014)) {
				return new Object[] { feature };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_nestedClassifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUContainer = _edge_nestedClassifier.getSrc();
		if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
			EObject tmpFeature = _edge_nestedClassifier.getTrg();
			if (tmpFeature instanceof Interface) {
				Interface feature = (Interface) tmpFeature;
				if (uContainer.getNestedClassifiers().contains(feature)) {
					if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_2_testcorematchandDECs_black_nac_0B(
							feature) == null) {
						if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_2_testcorematchandDECs_black_nac_1B(
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match, Interface feature,
			org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uContainer, operation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_bindingFB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_black_nac_0B(
			InterfaceDeclaration bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_843168 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_843168 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_black_nac_1B(
			InterfaceDeclaration bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_944671 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_944671 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_944671)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_black_nac_2B(
			InterfaceDeclaration bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_326437 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_326437 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_black_nac_3B(
			InterfaceDeclaration bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_320015 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_320015 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_black_nac_4BB(
			InterfaceDeclaration bodyDeclaration, MAbstractMethodDefinition method) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_692763 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!method.equals(__DEC_bodyDeclaration_mInnerTypes_692763)) {
				return new Object[] { bodyDeclaration, method };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mInnerTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMethod = _edge_mInnerTypes.getSrc();
		if (tmpMethod instanceof MAbstractMethodDefinition) {
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
			EObject tmpBodyDeclaration = _edge_mInnerTypes.getTrg();
			if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
				InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
				if (method.getMInnerTypes().contains(bodyDeclaration)) {
					if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_black_nac_0B(
							bodyDeclaration) == null) {
						if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_black_nac_1B(
								bodyDeclaration) == null) {
							if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_black_nac_2B(
									bodyDeclaration) == null) {
								if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_black_nac_3B(
										bodyDeclaration) == null) {
									if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_black_nac_4BB(
											bodyDeclaration, method) == null) {
										_result.add(new Object[] { method, bodyDeclaration, _edge_mInnerTypes });
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match, MAbstractMethodDefinition method,
			InterfaceDeclaration bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, method, bodyDeclaration);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_1_prepare_blackB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("method");
		EObject _localVariable_2 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = targetMatch.getObject("uContainer");
		EObject _localVariable_4 = targetMatch.getObject("operation");
		EObject tmpFeature = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpUContainer = _localVariable_3;
		EObject tmpOperation = _localVariable_4;
		if (tmpFeature instanceof Interface) {
			Interface feature = (Interface) tmpFeature;
			if (tmpMethod instanceof MAbstractMethodDefinition) {
				MAbstractMethodDefinition method = (MAbstractMethodDefinition) tmpMethod;
				if (tmpBodyDeclaration instanceof InterfaceDeclaration) {
					InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) tmpBodyDeclaration;
					if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							return new Object[] { feature, method, bodyDeclaration, uContainer, operation, targetMatch,
									sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_blackBBBBBBB(
			Interface feature, MAbstractMethodDefinition method, InterfaceDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Operation operation, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, method, bodyDeclaration, uContainer, operation, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_binding != null) {
			Interface feature = (Interface) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_binding[0];
			MAbstractMethodDefinition method = (MAbstractMethodDefinition) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_binding[1];
			InterfaceDeclaration bodyDeclaration = (InterfaceDeclaration) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_binding[3];
			Operation operation = (Operation) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_blackBBBBBBB(
					feature, method, bodyDeclaration, uContainer, operation, sourceMatch, targetMatch);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, method, bodyDeclaration, uContainer, operation, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_bindingFBBBBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Interface feature,
			MAbstractMethodDefinition method, InterfaceDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Operation operation, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(feature, method, bodyDeclaration, uContainer, operation,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, feature, method, bodyDeclaration, uContainer, operation, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, Interface feature,
			MAbstractMethodDefinition method, InterfaceDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Operation operation, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_bindingFBBBBBBBB(
				_this, feature, method, bodyDeclaration, uContainer, operation, sourceMatch, targetMatch);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_binding[0];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, method, bodyDeclaration, uContainer, operation, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_4_checkCSP_expressionFB(
			CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_5_matchcorrcontext_blackBFBBB(
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_5_matchcorrcontext_greenBBBF(
			ASTNode2Element me2op, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InnerInterfaceDeclaration2InnerInterface_InMethod";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(me2op);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { me2op, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_6_createcorrespondence_blackBBBBBB(
			Interface feature, MAbstractMethodDefinition method, InterfaceDeclaration bodyDeclaration,
			org.eclipse.uml2.uml.Class uContainer, Operation operation, CCMatch ccMatch) {
		return new Object[] { feature, method, bodyDeclaration, uContainer, operation, ccMatch };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_6_createcorrespondence_greenBFFBB(
			Interface feature, InterfaceDeclaration bodyDeclaration, CCMatch ccMatch) {
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InnerInterfaceDeclaration2InnerInterface_InMethod";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_black_nac_0B(
			InterfaceDeclaration bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_394107 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_394107 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_black_nac_1B(
			InterfaceDeclaration bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_262226 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_262226 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_262226)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_black_nac_2B(
			InterfaceDeclaration bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_106106 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_106106 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_black_nac_3B(
			InterfaceDeclaration bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_477981 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_477981 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_black_nac_4BB(
			InterfaceDeclaration bodyDeclaration, MAbstractMethodDefinition method) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_654553 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			if (!method.equals(__DEC_bodyDeclaration_mInnerTypes_654553)) {
				return new Object[] { bodyDeclaration, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_blackBB(
			MAbstractMethodDefinition method, InterfaceDeclaration bodyDeclaration) {
		if (method.getMInnerTypes().contains(bodyDeclaration)) {
			if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_black_nac_0B(
					bodyDeclaration) == null) {
				if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_black_nac_1B(
						bodyDeclaration) == null) {
					if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_black_nac_2B(
							bodyDeclaration) == null) {
						if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_black_nac_3B(
								bodyDeclaration) == null) {
							if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_1_matchtggpattern_black_nac_4BB(
									bodyDeclaration, method) == null) {
								return new Object[] { method, bodyDeclaration };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_28_1_matchtggpattern_black_nac_0B(
			Interface feature) {
		for (org.eclipse.uml2.uml.Package __DEC_feature_packagedElement_260679 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Package.class, "packagedElement")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_28_1_matchtggpattern_black_nac_1B(
			Interface feature) {
		for (Interface __DEC_feature_nestedClassifier_9964 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			if (!feature.equals(__DEC_feature_nestedClassifier_9964)) {
				return new Object[] { feature };
			}
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_28_1_matchtggpattern_blackBBB(
			Interface feature, org.eclipse.uml2.uml.Class uContainer, Operation operation) {
		if (uContainer.getOwnedOperations().contains(operation)) {
			if (uContainer.getNestedClassifiers().contains(feature)) {
				if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_28_1_matchtggpattern_black_nac_0B(
						feature) == null) {
					if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_28_1_matchtggpattern_black_nac_1B(
							feature) == null) {
						return new Object[] { feature, uContainer, operation };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_1_createresult_blackB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MAbstractMethodDefinition method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element me2op) {
		if (ruleResult.getCorrObjects().contains(me2op)) {
			return new Object[] { ruleResult, me2op };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Operation operation) {
		if (ruleResult.getTargetObjects().contains(operation)) {
			return new Object[] { ruleResult, operation };
		}
		return null;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_2_isapplicablecore_blackFFFFFBB(
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
								if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_2_isapplicablecore_black_nac_1BB(
										ruleResult, me2op) == null) {
									if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, method) == null) {
										if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_2_isapplicablecore_black_nac_2BB(
												ruleResult, operation) == null) {
											if (pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_2_isapplicablecore_black_nac_3BB(
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_bindingFBBBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, IsApplicableMatch isApplicableMatch,
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

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_blackB(
			CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, IsApplicableMatch isApplicableMatch,
			MAbstractMethodDefinition method, ASTNode2Element me2op, org.eclipse.uml2.uml.Class uContainer,
			Operation operation, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_binding = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, method, me2op, uContainer, operation, ruleResult);
		if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_binding[0];

			Object[] result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_black = pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, me2op, uContainer, operation, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_4_checkCSP_expressionFBB(
			InnerInterfaceDeclaration2InnerInterface_InMethod _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_5_checknacs_blackBBBB(
			MAbstractMethodDefinition method, ASTNode2Element me2op, org.eclipse.uml2.uml.Class uContainer,
			Operation operation) {
		return new Object[] { method, me2op, uContainer, operation };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_6_perform_blackBBBBB(
			MAbstractMethodDefinition method, ASTNode2Element me2op, org.eclipse.uml2.uml.Class uContainer,
			Operation operation, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { method, me2op, uContainer, operation, ruleResult };
	}

	public static final Object[] pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_6_perform_greenFFBFFBBB(
			MAbstractMethodDefinition method, org.eclipse.uml2.uml.Class uContainer,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Interface feature = UMLFactory.eINSTANCE.createInterface();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		InterfaceDeclaration bodyDeclaration = JavaFactory.eINSTANCE.createInterfaceDeclaration();
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
		return new Object[] { feature, bd2ne, method, b2e, bodyDeclaration, uContainer, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_InnerInterfaceDeclaration2InnerInterface_InMethod_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InnerInterfaceDeclaration2InnerInterface_InMethodImpl
