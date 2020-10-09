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

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MConstructorDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.ConstructorDec2Operation4Interface;
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
 * An implementation of the model object '<em><b>Constructor Dec2 Operation4 Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstructorDec2Operation4InterfaceImpl extends AbstractRuleImpl
		implements ConstructorDec2Operation4Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructorDec2Operation4InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getConstructorDec2Operation4Interface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MConstructorDefinition bodyDeclaration,
			AbstractTypeDeclaration classDec) {

		Object[] result1_black = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_0_1_initialbindings_blackBBBB(this, match, bodyDeclaration,
						classDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = "
					+ classDec + ".");
		}

		Object[] result2_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_bindingAndBlackFBBBB(this, match,
						bodyDeclaration, classDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = "
					+ classDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_0_4_collectelementstobetranslated_blackBBB(match,
							bodyDeclaration, classDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec + ".");
			}
			ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_0_4_collectelementstobetranslated_greenBBBFF(match,
							bodyDeclaration, classDec);
			//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_0_5_collectcontextelements_blackBBB(match,
							bodyDeclaration, classDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[classDec] = " + classDec + ".");
			}
			ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_0_5_collectcontextelements_greenBB(match, classDec);

			// 
			ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_0_6_registerobjectstomatch_expressionBBBB(this, match,
							bodyDeclaration, classDec);
			return ConstructorDec2Operation4InterfaceImpl.pattern_ConstructorDec2Operation4Interface_0_7_expressionF();
		} else {
			return ConstructorDec2Operation4InterfaceImpl.pattern_ConstructorDec2Operation4Interface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result1_bindingAndBlack[0];
		Interface umlClass = (Interface) result1_bindingAndBlack[1];
		NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result1_bindingAndBlack[2];
		AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_greenFFFBBB(bodyDeclaration,
						umlClass, csp);
		Operation feature = (Operation) result1_green[0];
		ASTNode2Element b2e = (ASTNode2Element) result1_green[1];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[2];

		Object[] result2_black = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_1_2_collecttranslatedelements_blackBBBB(feature, b2e, bd2ne,
						bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", " + "[b2e] = " + b2e
							+ ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_1_2_collecttranslatedelements_greenFBBBB(feature, b2e,
						bd2ne, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, feature,
						b2e, bd2ne, bodyDeclaration, umlClass, cd2c, classDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", " + "[bd2ne] = " + bd2ne + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", " + "[cd2c] = "
					+ cd2c + ", " + "[classDec] = " + classDec + ".");
		}
		ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(ruleresult,
						feature, b2e, bd2ne, bodyDeclaration, umlClass, classDec);
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[14];

		// 
		// 
		ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
						feature, b2e, bd2ne, bodyDeclaration, umlClass, cd2c, classDec);
		return ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result2_binding[0];
		AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_2_2_corematch_blackBFFBB(bodyDeclaration, classDec,
						match)) {
			Interface umlClass = (Interface) result2_black[1];
			NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result2_black[2];
			// ForEach 
			for (Object[] result3_black : ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_2_3_findcontext_blackBBBB(bodyDeclaration, umlClass,
							cd2c, classDec)) {
				Object[] result3_green = ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_2_3_findcontext_greenBBBBFFFFF(bodyDeclaration,
								umlClass, cd2c, classDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge cd2c__umlClass____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, bodyDeclaration, umlClass, cd2c, classDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", " + "[cd2c] = " + cd2c + ", "
							+ "[classDec] = " + classDec + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ConstructorDec2Operation4InterfaceImpl
							.pattern_ConstructorDec2Operation4Interface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ConstructorDec2Operation4InterfaceImpl
							.pattern_ConstructorDec2Operation4Interface_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MConstructorDefinition bodyDeclaration,
			AbstractTypeDeclaration classDec) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("classDec", classDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MConstructorDefinition bodyDeclaration,
			AbstractTypeDeclaration classDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_classDec_name = CSPFactoryHelper.eINSTANCE.createVariable("classDec.name", true, csp);
		var_classDec_name.setValue(classDec.getName());
		var_classDec_name.setType("String");
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_classDec_name, var_bodyDeclaration_name);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MConstructorDefinition bodyDeclaration,
			Interface umlClass, NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec) {// Create CSP
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
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("classDec", classDec);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject feature, EObject b2e, EObject bd2ne,
			EObject bodyDeclaration, EObject umlClass, EObject cd2c, EObject classDec) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("classDec", classDec);

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
	public boolean isAppropriate_BWD(Match match, Operation feature, Interface umlClass) {

		Object[] result1_black = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_10_1_initialbindings_blackBBBB(this, match, feature,
						umlClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
		}

		Object[] result2_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature,
						umlClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_10_4_collectelementstobetranslated_blackBBB(match,
							feature, umlClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
			}
			ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_10_4_collectelementstobetranslated_greenBBBFF(match,
							feature, umlClass);
			//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result4_green[4];

			Object[] result5_black = ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_10_5_collectcontextelements_blackBBB(match, feature,
							umlClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[umlClass] = " + umlClass + ".");
			}
			ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_10_5_collectcontextelements_greenBB(match, umlClass);

			// 
			ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_10_6_registerobjectstomatch_expressionBBBB(this, match,
							feature, umlClass);
			return ConstructorDec2Operation4InterfaceImpl.pattern_ConstructorDec2Operation4Interface_10_7_expressionF();
		} else {
			return ConstructorDec2Operation4InterfaceImpl.pattern_ConstructorDec2Operation4Interface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Operation feature = (Operation) result1_bindingAndBlack[0];
		Interface umlClass = (Interface) result1_bindingAndBlack[1];
		NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result1_bindingAndBlack[2];
		AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_greenBFFFBB(feature, classDec,
						csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[1];
		NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result1_green[2];
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result1_green[3];

		Object[] result2_black = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_11_2_collecttranslatedelements_blackBBBB(feature, b2e,
						bd2ne, bodyDeclaration);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[feature] = " + feature + ", " + "[b2e] = " + b2e
							+ ", " + "[bd2ne] = " + bd2ne + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
		}
		Object[] result2_green = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_11_2_collecttranslatedelements_greenFBBBB(feature, b2e,
						bd2ne, bodyDeclaration);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, feature,
						b2e, bd2ne, bodyDeclaration, umlClass, cd2c, classDec);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[feature] = " + feature + ", " + "[b2e] = " + b2e + ", " + "[bd2ne] = " + bd2ne + ", "
					+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", " + "[cd2c] = "
					+ cd2c + ", " + "[classDec] = " + classDec + ".");
		}
		ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(ruleresult,
						feature, b2e, bd2ne, bodyDeclaration, umlClass, classDec);
		//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge bd2ne__bodyDeclaration____source = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge bd2ne__feature____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[14];

		// 
		// 
		ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
						feature, b2e, bd2ne, bodyDeclaration, umlClass, cd2c, classDec);
		return ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Operation feature = (Operation) result2_binding[0];
		Interface umlClass = (Interface) result2_binding[1];
		for (Object[] result2_black : ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_12_2_corematch_blackBBFFB(feature, umlClass, match)) {
			NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result2_black[2];
			AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) result2_black[3];
			// ForEach 
			for (Object[] result3_black : ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_12_3_findcontext_blackBBBB(feature, umlClass, cd2c,
							classDec)) {
				Object[] result3_green = ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_12_3_findcontext_greenBBBBFFFFF(feature, umlClass,
								cd2c, classDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge umlClass__feature____ownedOperation = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge feature__umlClass____interface = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge cd2c__classDec____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge cd2c__umlClass____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, feature, umlClass, cd2c, classDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[umlClass] = " + umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[classDec] = " + classDec
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ConstructorDec2Operation4InterfaceImpl
							.pattern_ConstructorDec2Operation4Interface_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ConstructorDec2Operation4InterfaceImpl
							.pattern_ConstructorDec2Operation4Interface_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Operation feature, Interface umlClass) {
		match.registerObject("feature", feature);
		match.registerObject("umlClass", umlClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Operation feature, Interface umlClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Operation feature, Interface umlClass,
			NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");
		Variable var_classDec_name = CSPFactoryHelper.eINSTANCE.createVariable("classDec.name", true, csp);
		var_classDec_name.setValue(classDec.getName());
		var_classDec_name.setType("String");

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_classDec_name, var_bodyDeclaration_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("classDec", classDec);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject feature, EObject b2e, EObject bd2ne,
			EObject bodyDeclaration, EObject umlClass, EObject cd2c, EObject classDec) {
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("bd2ne", bd2ne);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("umlClass", umlClass);
		ruleresult.registerObject("cd2c", cd2c);
		ruleresult.registerObject("classDec", classDec);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_276(EMoflonEdge _edge_ownedOperation) {

		Object[] result1_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_20_2_testcorematchandDECs_blackFFB(_edge_ownedOperation)) {
			Operation feature = (Operation) result2_black[0];
			Interface umlClass = (Interface) result2_black[1];
			Object[] result2_green = ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, umlClass)) {
				// 
				if (ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ConstructorDec2Operation4InterfaceImpl
							.pattern_ConstructorDec2Operation4Interface_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ConstructorDec2Operation4InterfaceImpl
							.pattern_ConstructorDec2Operation4Interface_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_285(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_21_2_testcorematchandDECs_blackFFB(
						_edge_bodyDeclarations)) {
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result2_black[0];
			AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, bodyDeclaration, classDec)) {
				// 
				if (ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ConstructorDec2Operation4InterfaceImpl
							.pattern_ConstructorDec2Operation4Interface_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ConstructorDec2Operation4InterfaceImpl
							.pattern_ConstructorDec2Operation4Interface_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ConstructorDec2Operation4Interface");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_classDec_name = CSPFactoryHelper.eINSTANCE.createVariable("classDec", true, csp);
		var_classDec_name.setValue(__helper.getValue("classDec", "name"));
		var_classDec_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("ConstructorDec2Operation4Interface");
		eq0.solve(var_classDec_name, var_bodyDeclaration_name);

		eq1.setRuleName("ConstructorDec2Operation4Interface");
		eq1.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			eq0.solve(var_classDec_name, var_bodyDeclaration_name);
			eq1.solve(var_bodyDeclaration_name, var_feature_name);
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
		ruleResult.setRule("ConstructorDec2Operation4Interface");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Variable var_classDec_name = CSPFactoryHelper.eINSTANCE.createVariable("classDec", true, csp);
		var_classDec_name.setValue(__helper.getValue("classDec", "name"));
		var_classDec_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("ConstructorDec2Operation4Interface");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		eq1.setRuleName("ConstructorDec2Operation4Interface");
		eq1.solve(var_classDec_name, var_bodyDeclaration_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_bodyDeclaration_name.setBound(false);
			var_bodyDeclaration_name.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			eq1.solve(var_classDec_name, var_bodyDeclaration_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("bodyDeclaration", "name", var_bodyDeclaration_name.getValue());
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

		Object[] result1_black = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Operation feature = (Operation) result2_bindingAndBlack[0];
		MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result2_bindingAndBlack[1];
		Interface umlClass = (Interface) result2_bindingAndBlack[2];
		AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, feature,
						bodyDeclaration, umlClass, classDec, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[umlClass] = " + umlClass + ", " + "[classDec] = " + classDec + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_24_5_matchcorrcontext_blackBFBBB(umlClass, classDec,
							sourceMatch, targetMatch)) {
				NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result5_black[1];
				Object[] result5_green = ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_24_5_matchcorrcontext_greenBBBF(cd2c, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_24_6_createcorrespondence_blackBBBBB(feature,
								bodyDeclaration, umlClass, classDec, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[umlClass] = " + umlClass + ", "
							+ "[classDec] = " + classDec + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_24_6_createcorrespondence_greenBFFBB(feature,
								bodyDeclaration, ccMatch);
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[1];
				//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[2];

				Object[] result7_black = ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Operation feature, MConstructorDefinition bodyDeclaration, Interface umlClass,
			AbstractTypeDeclaration classDec, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MConstructorDefinition bodyDeclaration, AbstractTypeDeclaration classDec) {// 
		Object[] result1_black = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_27_1_matchtggpattern_blackBB(bodyDeclaration, classDec);
		if (result1_black != null) {
			return ConstructorDec2Operation4InterfaceImpl.pattern_ConstructorDec2Operation4Interface_27_2_expressionF();
		} else {
			return ConstructorDec2Operation4InterfaceImpl.pattern_ConstructorDec2Operation4Interface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Operation feature, Interface umlClass) {// 
		Object[] result1_black = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_28_1_matchtggpattern_blackBB(feature, umlClass);
		if (result1_black != null) {
			return ConstructorDec2Operation4InterfaceImpl.pattern_ConstructorDec2Operation4Interface_28_2_expressionF();
		} else {
			return ConstructorDec2Operation4InterfaceImpl.pattern_ConstructorDec2Operation4Interface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement cd2cParameter) {

		Object[] result1_black = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList cd2cList = (RuleEntryList) result2_black[0];
			Interface umlClass = (Interface) result2_black[1];
			NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result2_black[2];
			AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) result2_black[3];

			Object[] result3_bindingAndBlack = ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, umlClass, cd2c, classDec, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlClass] = " + umlClass + ", "
						+ "[cd2c] = " + cd2c + ", " + "[classDec] = " + classDec + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ConstructorDec2Operation4InterfaceImpl
					.pattern_ConstructorDec2Operation4Interface_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ConstructorDec2Operation4InterfaceImpl
						.pattern_ConstructorDec2Operation4Interface_29_5_checknacs_blackBBB(umlClass, cd2c, classDec);
				if (result5_black != null) {

					Object[] result6_black = ConstructorDec2Operation4InterfaceImpl
							.pattern_ConstructorDec2Operation4Interface_29_6_perform_blackBBBB(umlClass, cd2c, classDec,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlClass] = "
								+ umlClass + ", " + "[cd2c] = " + cd2c + ", " + "[classDec] = " + classDec + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ConstructorDec2Operation4InterfaceImpl
							.pattern_ConstructorDec2Operation4Interface_29_6_perform_greenFFFFBBBB(umlClass, classDec,
									ruleResult, csp);
					//nothing Operation feature = (Operation) result6_green[0];
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[1];
					//nothing NamedElement2NamedElement bd2ne = (NamedElement2NamedElement) result6_green[2];
					//nothing MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return ConstructorDec2Operation4InterfaceImpl
				.pattern_ConstructorDec2Operation4Interface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Interface umlClass,
			NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_classDec_name = CSPFactoryHelper.eINSTANCE.createVariable("classDec.name", true, csp);
		var_classDec_name.setValue(classDec.getName());
		var_classDec_name.setType("String");

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_classDec_name, var_bodyDeclaration_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlClass", umlClass);
		isApplicableMatch.registerObject("cd2c", cd2c);
		isApplicableMatch.registerObject("classDec", classDec);
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
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPROPRIATE_FWD__MATCH_MCONSTRUCTORDEFINITION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCONSTRUCTORDEFINITION_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCONSTRUCTORDEFINITION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MCONSTRUCTORDEFINITION_INTERFACE_NAMEDELEMENT2NAMEDELEMENT_ABSTRACTTYPEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MConstructorDefinition) arguments.get(1), (Interface) arguments.get(2),
					(NamedElement2NamedElement) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPROPRIATE_BWD__MATCH_OPERATION_INTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Interface) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_OPERATION_INTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Interface) arguments.get(2));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_OPERATION_INTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Interface) arguments.get(2));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_OPERATION_INTERFACE_NAMEDELEMENT2NAMEDELEMENT_ABSTRACTTYPEDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Operation) arguments.get(1),
					(Interface) arguments.get(2), (NamedElement2NamedElement) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_276__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_276((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_285__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_285((EMoflonEdge) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__OPERATION_MCONSTRUCTORDEFINITION_INTERFACE_ABSTRACTTYPEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Operation) arguments.get(0), (MConstructorDefinition) arguments.get(1),
					(Interface) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___CHECK_DEC_FWD__MCONSTRUCTORDEFINITION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((MConstructorDefinition) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___CHECK_DEC_BWD__OPERATION_INTERFACE:
			return checkDEC_BWD((Operation) arguments.get(0), (Interface) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (NamedElement2NamedElement) arguments.get(1));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACE_NAMEDELEMENT2NAMEDELEMENT_ABSTRACTTYPEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Interface) arguments.get(1),
					(NamedElement2NamedElement) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.CONSTRUCTOR_DEC2_OPERATION4_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_0_1_initialbindings_blackBBBB(
			ConstructorDec2Operation4Interface _this, Match match, MConstructorDefinition bodyDeclaration,
			AbstractTypeDeclaration classDec) {
		return new Object[] { _this, match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_bindingFBBBB(
			ConstructorDec2Operation4Interface _this, Match match, MConstructorDefinition bodyDeclaration,
			AbstractTypeDeclaration classDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, classDec };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_bindingAndBlackFBBBB(
			ConstructorDec2Operation4Interface _this, Match match, MConstructorDefinition bodyDeclaration,
			AbstractTypeDeclaration classDec) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_binding = pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, classDec);
		if (result_pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_black = pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2Operation4Interface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_0_3_CheckCSP_expressionFBB(
			ConstructorDec2Operation4Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_0_4_collectelementstobetranslated_blackBBB(
			Match match, MConstructorDefinition bodyDeclaration, AbstractTypeDeclaration classDec) {
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, MConstructorDefinition bodyDeclaration, AbstractTypeDeclaration classDec) {
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		match.getToBeTranslatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		return new Object[] { match, bodyDeclaration, classDec, classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____abstractTypeDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_0_5_collectcontextelements_blackBBB(
			Match match, MConstructorDefinition bodyDeclaration, AbstractTypeDeclaration classDec) {
		return new Object[] { match, bodyDeclaration, classDec };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_0_5_collectcontextelements_greenBB(
			Match match, AbstractTypeDeclaration classDec) {
		match.getContextNodes().add(classDec);
		return new Object[] { match, classDec };
	}

	public static final void pattern_ConstructorDec2Operation4Interface_0_6_registerobjectstomatch_expressionBBBB(
			ConstructorDec2Operation4Interface _this, Match match, MConstructorDefinition bodyDeclaration,
			AbstractTypeDeclaration classDec) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, classDec);

	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("classDec");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		EObject tmpCd2c = _localVariable_2;
		EObject tmpClassDec = _localVariable_3;
		if (tmpBodyDeclaration instanceof MConstructorDefinition) {
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
			if (tmpUmlClass instanceof Interface) {
				Interface umlClass = (Interface) tmpUmlClass;
				if (tmpCd2c instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement cd2c = (NamedElement2NamedElement) tmpCd2c;
					if (tmpClassDec instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) tmpClassDec;
						return new Object[] { bodyDeclaration, umlClass, cd2c, classDec, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_blackBBBBFBB(
			MConstructorDefinition bodyDeclaration, Interface umlClass, NamedElement2NamedElement cd2c,
			AbstractTypeDeclaration classDec, ConstructorDec2Operation4Interface _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { bodyDeclaration, umlClass, cd2c, classDec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_bindingAndBlackFFFFFBB(
			ConstructorDec2Operation4Interface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_binding = pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_binding != null) {
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result_pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_binding[0];
			Interface umlClass = (Interface) result_pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_binding[1];
			NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result_pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_binding[2];
			AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) result_pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_binding[3];

			Object[] result_pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_black = pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_blackBBBBFBB(
					bodyDeclaration, umlClass, cd2c, classDec, _this, isApplicableMatch);
			if (result_pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_black[4];

				return new Object[] { bodyDeclaration, umlClass, cd2c, classDec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_1_1_performtransformation_greenFFFBBB(
			MConstructorDefinition bodyDeclaration, Interface umlClass, CSP csp) {
		Operation feature = UMLFactory.eINSTANCE.createOperation();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		Object _localVariable_0 = csp.getValue("feature", "name");
		umlClass.getOwnedOperations().add(feature);
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		bd2ne.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { feature, b2e, bd2ne, bodyDeclaration, umlClass, csp };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_1_2_collecttranslatedelements_blackBBBB(
			Operation feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			MConstructorDefinition bodyDeclaration) {
		return new Object[] { feature, b2e, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_1_2_collecttranslatedelements_greenFBBBB(
			Operation feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			MConstructorDefinition bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, feature, b2e, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject b2e, EObject bd2ne, EObject bodyDeclaration,
			EObject umlClass, EObject cd2c, EObject classDec) {
		if (!feature.equals(umlClass)) {
			if (!b2e.equals(feature)) {
				if (!b2e.equals(bd2ne)) {
					if (!b2e.equals(bodyDeclaration)) {
						if (!b2e.equals(umlClass)) {
							if (!b2e.equals(cd2c)) {
								if (!b2e.equals(classDec)) {
									if (!bd2ne.equals(feature)) {
										if (!bd2ne.equals(bodyDeclaration)) {
											if (!bd2ne.equals(umlClass)) {
												if (!bd2ne.equals(cd2c)) {
													if (!bd2ne.equals(classDec)) {
														if (!bodyDeclaration.equals(feature)) {
															if (!bodyDeclaration.equals(umlClass)) {
																if (!bodyDeclaration.equals(cd2c)) {
																	if (!bodyDeclaration.equals(classDec)) {
																		if (!cd2c.equals(feature)) {
																			if (!cd2c.equals(umlClass)) {
																				if (!cd2c.equals(classDec)) {
																					if (!classDec.equals(feature)) {
																						if (!classDec
																								.equals(umlClass)) {
																							return new Object[] {
																									ruleresult, feature,
																									b2e, bd2ne,
																									bodyDeclaration,
																									umlClass, cd2c,
																									classDec };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ConstructorDec2Operation4Interface_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject b2e, EObject bd2ne, EObject bodyDeclaration,
			EObject umlClass, EObject classDec) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConstructorDec2Operation4Interface";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String b2e__feature____target_name_prime = "target";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		ruleresult.getCreatedEdges().add(feature__umlClass____interface);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		ruleresult.getTranslatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, feature, b2e, bd2ne, bodyDeclaration, umlClass, classDec,
				umlClass__feature____ownedOperation, feature__umlClass____interface, bd2ne__bodyDeclaration____source,
				b2e__bodyDeclaration____source, bd2ne__feature____target, classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____abstractTypeDeclaration, b2e__feature____target };
	}

	public static final void pattern_ConstructorDec2Operation4Interface_1_5_registerobjects_expressionBBBBBBBBB(
			ConstructorDec2Operation4Interface _this, PerformRuleResult ruleresult, EObject feature, EObject b2e,
			EObject bd2ne, EObject bodyDeclaration, EObject umlClass, EObject cd2c, EObject classDec) {
		_this.registerObjects_FWD(ruleresult, feature, b2e, bd2ne, bodyDeclaration, umlClass, cd2c, classDec);

	}

	public static final PerformRuleResult pattern_ConstructorDec2Operation4Interface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_bindingFB(
			ConstructorDec2Operation4Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_blackFBB(
			EClass eClass, ConstructorDec2Operation4Interface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_bindingAndBlackFFB(
			ConstructorDec2Operation4Interface _this) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_binding = pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_black = pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ConstructorDec2Operation4Interface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("classDec");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpClassDec = _localVariable_1;
		if (tmpBodyDeclaration instanceof MConstructorDefinition) {
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
			if (tmpClassDec instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) tmpClassDec;
				return new Object[] { bodyDeclaration, classDec, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2Operation4Interface_2_2_corematch_blackBFFBB(
			MConstructorDefinition bodyDeclaration, AbstractTypeDeclaration classDec, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement cd2c : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(classDec, NamedElement2NamedElement.class, "source")) {
			NamedElement tmpUmlClass = cd2c.getTarget();
			if (tmpUmlClass instanceof Interface) {
				Interface umlClass = (Interface) tmpUmlClass;
				_result.add(new Object[] { bodyDeclaration, umlClass, cd2c, classDec, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2Operation4Interface_2_3_findcontext_blackBBBB(
			MConstructorDefinition bodyDeclaration, Interface umlClass, NamedElement2NamedElement cd2c,
			AbstractTypeDeclaration classDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (classDec.equals(cd2c.getSource())) {
			if (umlClass.equals(cd2c.getTarget())) {
				if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
					_result.add(new Object[] { bodyDeclaration, umlClass, cd2c, classDec });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_3_findcontext_greenBBBBFFFFF(
			MConstructorDefinition bodyDeclaration, Interface umlClass, NamedElement2NamedElement cd2c,
			AbstractTypeDeclaration classDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cd2c__classDec____source_name_prime = "source";
		String cd2c__umlClass____target_name_prime = "target";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(classDec);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c__umlClass____target.setSrc(cd2c);
		cd2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClass____target);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		cd2c__umlClass____target.setName(cd2c__umlClass____target_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		return new Object[] { bodyDeclaration, umlClass, cd2c, classDec, isApplicableMatch, cd2c__classDec____source,
				cd2c__umlClass____target, classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____abstractTypeDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_bindingFBBBBBB(
			ConstructorDec2Operation4Interface _this, IsApplicableMatch isApplicableMatch,
			MConstructorDefinition bodyDeclaration, Interface umlClass, NamedElement2NamedElement cd2c,
			AbstractTypeDeclaration classDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, bodyDeclaration, umlClass, cd2c,
				classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, umlClass, cd2c, classDec };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorDec2Operation4Interface _this, IsApplicableMatch isApplicableMatch,
			MConstructorDefinition bodyDeclaration, Interface umlClass, NamedElement2NamedElement cd2c,
			AbstractTypeDeclaration classDec) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_binding = pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, bodyDeclaration, umlClass, cd2c, classDec);
		if (result_pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_black = pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2Operation4Interface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, bodyDeclaration, umlClass, cd2c, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_2_5_checkCSP_expressionFBB(
			ConstructorDec2Operation4Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorDec2Operation4Interface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDec2Operation4Interface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_10_1_initialbindings_blackBBBB(
			ConstructorDec2Operation4Interface _this, Match match, Operation feature, Interface umlClass) {
		return new Object[] { _this, match, feature, umlClass };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_bindingFBBBB(
			ConstructorDec2Operation4Interface _this, Match match, Operation feature, Interface umlClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, umlClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_bindingAndBlackFBBBB(
			ConstructorDec2Operation4Interface _this, Match match, Operation feature, Interface umlClass) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_binding = pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, umlClass);
		if (result_pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_black = pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2Operation4Interface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, umlClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_10_3_CheckCSP_expressionFBB(
			ConstructorDec2Operation4Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_10_4_collectelementstobetranslated_blackBBB(
			Match match, Operation feature, Interface umlClass) {
		return new Object[] { match, feature, umlClass };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, Operation feature, Interface umlClass) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		match.getToBeTranslatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		match.getToBeTranslatedEdges().add(feature__umlClass____interface);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		return new Object[] { match, feature, umlClass, umlClass__feature____ownedOperation,
				feature__umlClass____interface };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_10_5_collectcontextelements_blackBBB(
			Match match, Operation feature, Interface umlClass) {
		return new Object[] { match, feature, umlClass };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_10_5_collectcontextelements_greenBB(
			Match match, Interface umlClass) {
		match.getContextNodes().add(umlClass);
		return new Object[] { match, umlClass };
	}

	public static final void pattern_ConstructorDec2Operation4Interface_10_6_registerobjectstomatch_expressionBBBB(
			ConstructorDec2Operation4Interface _this, Match match, Operation feature, Interface umlClass) {
		_this.registerObjectsToMatch_BWD(match, feature, umlClass);

	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("umlClass");
		EObject _localVariable_2 = isApplicableMatch.getObject("cd2c");
		EObject _localVariable_3 = isApplicableMatch.getObject("classDec");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		EObject tmpCd2c = _localVariable_2;
		EObject tmpClassDec = _localVariable_3;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpUmlClass instanceof Interface) {
				Interface umlClass = (Interface) tmpUmlClass;
				if (tmpCd2c instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement cd2c = (NamedElement2NamedElement) tmpCd2c;
					if (tmpClassDec instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) tmpClassDec;
						return new Object[] { feature, umlClass, cd2c, classDec, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_blackBBBBFBB(
			Operation feature, Interface umlClass, NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec,
			ConstructorDec2Operation4Interface _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { feature, umlClass, cd2c, classDec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_bindingAndBlackFFFFFBB(
			ConstructorDec2Operation4Interface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_binding = pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_binding != null) {
			Operation feature = (Operation) result_pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_binding[0];
			Interface umlClass = (Interface) result_pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_binding[1];
			NamedElement2NamedElement cd2c = (NamedElement2NamedElement) result_pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_binding[2];
			AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) result_pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_binding[3];

			Object[] result_pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_black = pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_blackBBBBFBB(
					feature, umlClass, cd2c, classDec, _this, isApplicableMatch);
			if (result_pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_black[4];

				return new Object[] { feature, umlClass, cd2c, classDec, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_11_1_performtransformation_greenBFFFBB(
			Operation feature, AbstractTypeDeclaration classDec, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		MConstructorDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		b2e.setTarget(feature);
		bd2ne.setTarget(feature);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		classDec.getBodyDeclarations().add(bodyDeclaration);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { feature, b2e, bd2ne, bodyDeclaration, classDec, csp };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_11_2_collecttranslatedelements_blackBBBB(
			Operation feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			MConstructorDefinition bodyDeclaration) {
		return new Object[] { feature, b2e, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_11_2_collecttranslatedelements_greenFBBBB(
			Operation feature, ASTNode2Element b2e, NamedElement2NamedElement bd2ne,
			MConstructorDefinition bodyDeclaration) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedLinkElements().add(bd2ne);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		return new Object[] { ruleresult, feature, b2e, bd2ne, bodyDeclaration };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject feature, EObject b2e, EObject bd2ne, EObject bodyDeclaration,
			EObject umlClass, EObject cd2c, EObject classDec) {
		if (!feature.equals(umlClass)) {
			if (!b2e.equals(feature)) {
				if (!b2e.equals(bd2ne)) {
					if (!b2e.equals(bodyDeclaration)) {
						if (!b2e.equals(umlClass)) {
							if (!b2e.equals(cd2c)) {
								if (!b2e.equals(classDec)) {
									if (!bd2ne.equals(feature)) {
										if (!bd2ne.equals(bodyDeclaration)) {
											if (!bd2ne.equals(umlClass)) {
												if (!bd2ne.equals(cd2c)) {
													if (!bd2ne.equals(classDec)) {
														if (!bodyDeclaration.equals(feature)) {
															if (!bodyDeclaration.equals(umlClass)) {
																if (!bodyDeclaration.equals(cd2c)) {
																	if (!bodyDeclaration.equals(classDec)) {
																		if (!cd2c.equals(feature)) {
																			if (!cd2c.equals(umlClass)) {
																				if (!cd2c.equals(classDec)) {
																					if (!classDec.equals(feature)) {
																						if (!classDec
																								.equals(umlClass)) {
																							return new Object[] {
																									ruleresult, feature,
																									b2e, bd2ne,
																									bodyDeclaration,
																									umlClass, cd2c,
																									classDec };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ConstructorDec2Operation4Interface_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFFF(
			PerformRuleResult ruleresult, EObject feature, EObject b2e, EObject bd2ne, EObject bodyDeclaration,
			EObject umlClass, EObject classDec) {
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bd2ne__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge classDec__bodyDeclaration____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge bodyDeclaration__classDec____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ConstructorDec2Operation4Interface";
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		String bd2ne__bodyDeclaration____source_name_prime = "source";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String bd2ne__feature____target_name_prime = "target";
		String classDec__bodyDeclaration____bodyDeclarations_name_prime = "bodyDeclarations";
		String bodyDeclaration__classDec____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String b2e__feature____target_name_prime = "target";
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		ruleresult.getTranslatedEdges().add(feature__umlClass____interface);
		bd2ne__bodyDeclaration____source.setSrc(bd2ne);
		bd2ne__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(bd2ne__bodyDeclaration____source);
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		bd2ne__feature____target.setSrc(bd2ne);
		bd2ne__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(bd2ne__feature____target);
		classDec__bodyDeclaration____bodyDeclarations.setSrc(classDec);
		classDec__bodyDeclaration____bodyDeclarations.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(classDec__bodyDeclaration____bodyDeclarations);
		bodyDeclaration__classDec____abstractTypeDeclaration.setSrc(bodyDeclaration);
		bodyDeclaration__classDec____abstractTypeDeclaration.setTrg(classDec);
		ruleresult.getCreatedEdges().add(bodyDeclaration__classDec____abstractTypeDeclaration);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		bd2ne__bodyDeclaration____source.setName(bd2ne__bodyDeclaration____source_name_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		bd2ne__feature____target.setName(bd2ne__feature____target_name_prime);
		classDec__bodyDeclaration____bodyDeclarations.setName(classDec__bodyDeclaration____bodyDeclarations_name_prime);
		bodyDeclaration__classDec____abstractTypeDeclaration
				.setName(bodyDeclaration__classDec____abstractTypeDeclaration_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		return new Object[] { ruleresult, feature, b2e, bd2ne, bodyDeclaration, umlClass, classDec,
				umlClass__feature____ownedOperation, feature__umlClass____interface, bd2ne__bodyDeclaration____source,
				b2e__bodyDeclaration____source, bd2ne__feature____target, classDec__bodyDeclaration____bodyDeclarations,
				bodyDeclaration__classDec____abstractTypeDeclaration, b2e__feature____target };
	}

	public static final void pattern_ConstructorDec2Operation4Interface_11_5_registerobjects_expressionBBBBBBBBB(
			ConstructorDec2Operation4Interface _this, PerformRuleResult ruleresult, EObject feature, EObject b2e,
			EObject bd2ne, EObject bodyDeclaration, EObject umlClass, EObject cd2c, EObject classDec) {
		_this.registerObjects_BWD(ruleresult, feature, b2e, bd2ne, bodyDeclaration, umlClass, cd2c, classDec);

	}

	public static final PerformRuleResult pattern_ConstructorDec2Operation4Interface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_bindingFB(
			ConstructorDec2Operation4Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_blackFBB(
			EClass eClass, ConstructorDec2Operation4Interface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_bindingAndBlackFFB(
			ConstructorDec2Operation4Interface _this) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_binding = pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_black = pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ConstructorDec2Operation4Interface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("umlClass");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUmlClass = _localVariable_1;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpUmlClass instanceof Interface) {
				Interface umlClass = (Interface) tmpUmlClass;
				return new Object[] { feature, umlClass, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2Operation4Interface_12_2_corematch_blackBBFFB(
			Operation feature, Interface umlClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement cd2c : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(umlClass, NamedElement2NamedElement.class, "target")) {
			org.eclipse.modisco.java.NamedElement tmpClassDec = cd2c.getSource();
			if (tmpClassDec instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) tmpClassDec;
				_result.add(new Object[] { feature, umlClass, cd2c, classDec, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2Operation4Interface_12_3_findcontext_blackBBBB(
			Operation feature, Interface umlClass, NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (umlClass.getOwnedOperations().contains(feature)) {
			if (classDec.equals(cd2c.getSource())) {
				if (umlClass.equals(cd2c.getTarget())) {
					_result.add(new Object[] { feature, umlClass, cd2c, classDec });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_3_findcontext_greenBBBBFFFFF(
			Operation feature, Interface umlClass, NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge umlClass__feature____ownedOperation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge feature__umlClass____interface = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__classDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cd2c__umlClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String umlClass__feature____ownedOperation_name_prime = "ownedOperation";
		String feature__umlClass____interface_name_prime = "interface";
		String cd2c__classDec____source_name_prime = "source";
		String cd2c__umlClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c);
		isApplicableMatch.getAllContextElements().add(classDec);
		umlClass__feature____ownedOperation.setSrc(umlClass);
		umlClass__feature____ownedOperation.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(umlClass__feature____ownedOperation);
		feature__umlClass____interface.setSrc(feature);
		feature__umlClass____interface.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(feature__umlClass____interface);
		cd2c__classDec____source.setSrc(cd2c);
		cd2c__classDec____source.setTrg(classDec);
		isApplicableMatch.getAllContextElements().add(cd2c__classDec____source);
		cd2c__umlClass____target.setSrc(cd2c);
		cd2c__umlClass____target.setTrg(umlClass);
		isApplicableMatch.getAllContextElements().add(cd2c__umlClass____target);
		umlClass__feature____ownedOperation.setName(umlClass__feature____ownedOperation_name_prime);
		feature__umlClass____interface.setName(feature__umlClass____interface_name_prime);
		cd2c__classDec____source.setName(cd2c__classDec____source_name_prime);
		cd2c__umlClass____target.setName(cd2c__umlClass____target_name_prime);
		return new Object[] { feature, umlClass, cd2c, classDec, isApplicableMatch, umlClass__feature____ownedOperation,
				feature__umlClass____interface, cd2c__classDec____source, cd2c__umlClass____target };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_bindingFBBBBBB(
			ConstructorDec2Operation4Interface _this, IsApplicableMatch isApplicableMatch, Operation feature,
			Interface umlClass, NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, umlClass, cd2c, classDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, umlClass, cd2c, classDec };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorDec2Operation4Interface _this, IsApplicableMatch isApplicableMatch, Operation feature,
			Interface umlClass, NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_binding = pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, feature, umlClass, cd2c, classDec);
		if (result_pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_black = pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2Operation4Interface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, umlClass, cd2c, classDec };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_12_5_checkCSP_expressionFBB(
			ConstructorDec2Operation4Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ConstructorDec2Operation4Interface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDec2Operation4Interface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_bindingFB(
			ConstructorDec2Operation4Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ConstructorDec2Operation4Interface _this) {
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

	public static final Object[] pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			ConstructorDec2Operation4Interface _this) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_binding = pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_black = pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_20_2_testcorematchandDECs_black_nac_0B(
			Operation feature) {
		org.eclipse.uml2.uml.Class __DEC_feature_ownedOperation_582381 = feature.getClass_();
		if (__DEC_feature_ownedOperation_582381 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_20_2_testcorematchandDECs_black_nac_1B(
			Operation feature) {
		DataType __DEC_feature_ownedOperation_759734 = feature.getDatatype();
		if (__DEC_feature_ownedOperation_759734 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2Operation4Interface_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedOperation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlClass = _edge_ownedOperation.getSrc();
		if (tmpUmlClass instanceof Interface) {
			Interface umlClass = (Interface) tmpUmlClass;
			EObject tmpFeature = _edge_ownedOperation.getTrg();
			if (tmpFeature instanceof Operation) {
				Operation feature = (Operation) tmpFeature;
				if (umlClass.getOwnedOperations().contains(feature)) {
					if (pattern_ConstructorDec2Operation4Interface_20_2_testcorematchandDECs_black_nac_0B(
							feature) == null) {
						if (pattern_ConstructorDec2Operation4Interface_20_2_testcorematchandDECs_black_nac_1B(
								feature) == null) {
							_result.add(new Object[] { feature, umlClass, _edge_ownedOperation });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ConstructorDec2Operation4Interface _this, Match match, Operation feature, Interface umlClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, umlClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConstructorDec2Operation4Interface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConstructorDec2Operation4Interface_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_bindingFB(
			ConstructorDec2Operation4Interface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, ConstructorDec2Operation4Interface _this) {
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

	public static final Object[] pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			ConstructorDec2Operation4Interface _this) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_binding = pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_black = pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_21_2_testcorematchandDECs_black_nac_0B(
			MConstructorDefinition bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_110170 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_110170 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_21_2_testcorematchandDECs_black_nac_1B(
			MConstructorDefinition bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_565299 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_565299 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2Operation4Interface_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpClassDec = _edge_bodyDeclarations.getSrc();
		if (tmpClassDec instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) tmpClassDec;
			EObject tmpBodyDeclaration = _edge_bodyDeclarations.getTrg();
			if (tmpBodyDeclaration instanceof MConstructorDefinition) {
				MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
				if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
					if (pattern_ConstructorDec2Operation4Interface_21_2_testcorematchandDECs_black_nac_0B(
							bodyDeclaration) == null) {
						if (pattern_ConstructorDec2Operation4Interface_21_2_testcorematchandDECs_black_nac_1B(
								bodyDeclaration) == null) {
							_result.add(new Object[] { bodyDeclaration, classDec, _edge_bodyDeclarations });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ConstructorDec2Operation4Interface _this, Match match, MConstructorDefinition bodyDeclaration,
			AbstractTypeDeclaration classDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, classDec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ConstructorDec2Operation4Interface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ConstructorDec2Operation4Interface_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_1_prepare_blackB(
			ConstructorDec2Operation4Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = targetMatch.getObject("umlClass");
		EObject _localVariable_3 = sourceMatch.getObject("classDec");
		EObject tmpFeature = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpUmlClass = _localVariable_2;
		EObject tmpClassDec = _localVariable_3;
		if (tmpFeature instanceof Operation) {
			Operation feature = (Operation) tmpFeature;
			if (tmpBodyDeclaration instanceof MConstructorDefinition) {
				MConstructorDefinition bodyDeclaration = (MConstructorDefinition) tmpBodyDeclaration;
				if (tmpUmlClass instanceof Interface) {
					Interface umlClass = (Interface) tmpUmlClass;
					if (tmpClassDec instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) tmpClassDec;
						return new Object[] { feature, bodyDeclaration, umlClass, classDec, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_blackBBBBBB(
			Operation feature, MConstructorDefinition bodyDeclaration, Interface umlClass,
			AbstractTypeDeclaration classDec, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { feature, bodyDeclaration, umlClass, classDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_binding = pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_binding != null) {
			Operation feature = (Operation) result_pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_binding[0];
			MConstructorDefinition bodyDeclaration = (MConstructorDefinition) result_pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_binding[1];
			Interface umlClass = (Interface) result_pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) result_pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_black = pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_blackBBBBBB(
					feature, bodyDeclaration, umlClass, classDec, sourceMatch, targetMatch);
			if (result_pattern_ConstructorDec2Operation4Interface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, bodyDeclaration, umlClass, classDec, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_bindingFBBBBBBB(
			ConstructorDec2Operation4Interface _this, Operation feature, MConstructorDefinition bodyDeclaration,
			Interface umlClass, AbstractTypeDeclaration classDec, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(feature, bodyDeclaration, umlClass, classDec, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, feature, bodyDeclaration, umlClass, classDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			ConstructorDec2Operation4Interface _this, Operation feature, MConstructorDefinition bodyDeclaration,
			Interface umlClass, AbstractTypeDeclaration classDec, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_binding = pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_bindingFBBBBBBB(
				_this, feature, bodyDeclaration, umlClass, classDec, sourceMatch, targetMatch);
		if (result_pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_binding[0];

			Object[] result_pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_black = pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_ConstructorDec2Operation4Interface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, bodyDeclaration, umlClass, classDec, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2Operation4Interface_24_5_matchcorrcontext_blackBFBBB(
			Interface umlClass, AbstractTypeDeclaration classDec, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (NamedElement2NamedElement cd2c : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(classDec, NamedElement2NamedElement.class, "source")) {
				if (umlClass.equals(cd2c.getTarget())) {
					_result.add(new Object[] { umlClass, cd2c, classDec, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_5_matchcorrcontext_greenBBBF(
			NamedElement2NamedElement cd2c, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ConstructorDec2Operation4Interface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(cd2c);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { cd2c, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_6_createcorrespondence_blackBBBBB(
			Operation feature, MConstructorDefinition bodyDeclaration, Interface umlClass,
			AbstractTypeDeclaration classDec, CCMatch ccMatch) {
		return new Object[] { feature, bodyDeclaration, umlClass, classDec, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_6_createcorrespondence_greenBFFBB(
			Operation feature, MConstructorDefinition bodyDeclaration, CCMatch ccMatch) {
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

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ConstructorDec2Operation4Interface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ConstructorDec2Operation4Interface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_27_1_matchtggpattern_black_nac_0B(
			MConstructorDefinition bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_423524 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_423524 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_27_1_matchtggpattern_black_nac_1B(
			MConstructorDefinition bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_94943 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_94943 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_27_1_matchtggpattern_blackBB(
			MConstructorDefinition bodyDeclaration, AbstractTypeDeclaration classDec) {
		if (classDec.getBodyDeclarations().contains(bodyDeclaration)) {
			if (pattern_ConstructorDec2Operation4Interface_27_1_matchtggpattern_black_nac_0B(bodyDeclaration) == null) {
				if (pattern_ConstructorDec2Operation4Interface_27_1_matchtggpattern_black_nac_1B(
						bodyDeclaration) == null) {
					return new Object[] { bodyDeclaration, classDec };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_28_1_matchtggpattern_black_nac_0B(
			Operation feature) {
		org.eclipse.uml2.uml.Class __DEC_feature_ownedOperation_310734 = feature.getClass_();
		if (__DEC_feature_ownedOperation_310734 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_28_1_matchtggpattern_black_nac_1B(
			Operation feature) {
		DataType __DEC_feature_ownedOperation_306785 = feature.getDatatype();
		if (__DEC_feature_ownedOperation_306785 != null) {
			return new Object[] { feature };
		}

		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_28_1_matchtggpattern_blackBB(
			Operation feature, Interface umlClass) {
		if (umlClass.getOwnedOperations().contains(feature)) {
			if (pattern_ConstructorDec2Operation4Interface_28_1_matchtggpattern_black_nac_0B(feature) == null) {
				if (pattern_ConstructorDec2Operation4Interface_28_1_matchtggpattern_black_nac_1B(feature) == null) {
					return new Object[] { feature, umlClass };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_1_createresult_blackB(
			ConstructorDec2Operation4Interface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Interface umlClass) {
		if (ruleResult.getTargetObjects().contains(umlClass)) {
			return new Object[] { ruleResult, umlClass };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement cd2c) {
		if (ruleResult.getCorrObjects().contains(cd2c)) {
			return new Object[] { ruleResult, cd2c };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration classDec) {
		if (ruleResult.getSourceObjects().contains(classDec)) {
			return new Object[] { ruleResult, classDec };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ConstructorDec2Operation4Interface_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList cd2cList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpCd2c : cd2cList.getEntryObjects()) {
				if (tmpCd2c instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement cd2c = (NamedElement2NamedElement) tmpCd2c;
					NamedElement tmpUmlClass = cd2c.getTarget();
					if (tmpUmlClass instanceof Interface) {
						Interface umlClass = (Interface) tmpUmlClass;
						org.eclipse.modisco.java.NamedElement tmpClassDec = cd2c.getSource();
						if (tmpClassDec instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration classDec = (AbstractTypeDeclaration) tmpClassDec;
							if (pattern_ConstructorDec2Operation4Interface_29_2_isapplicablecore_black_nac_1BB(
									ruleResult, cd2c) == null) {
								if (pattern_ConstructorDec2Operation4Interface_29_2_isapplicablecore_black_nac_0BB(
										ruleResult, umlClass) == null) {
									if (pattern_ConstructorDec2Operation4Interface_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, classDec) == null) {
										_result.add(new Object[] { cd2cList, umlClass, cd2c, classDec,
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

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_bindingFBBBBBB(
			ConstructorDec2Operation4Interface _this, IsApplicableMatch isApplicableMatch, Interface umlClass,
			NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, umlClass, cd2c, classDec,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlClass, cd2c, classDec, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_bindingAndBlackFBBBBBB(
			ConstructorDec2Operation4Interface _this, IsApplicableMatch isApplicableMatch, Interface umlClass,
			NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_binding = pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, umlClass, cd2c, classDec, ruleResult);
		if (result_pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_binding[0];

			Object[] result_pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_black = pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_ConstructorDec2Operation4Interface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlClass, cd2c, classDec, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ConstructorDec2Operation4Interface_29_4_checkCSP_expressionFBB(
			ConstructorDec2Operation4Interface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_5_checknacs_blackBBB(Interface umlClass,
			NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec) {
		return new Object[] { umlClass, cd2c, classDec };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_6_perform_blackBBBB(Interface umlClass,
			NamedElement2NamedElement cd2c, AbstractTypeDeclaration classDec, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { umlClass, cd2c, classDec, ruleResult };
	}

	public static final Object[] pattern_ConstructorDec2Operation4Interface_29_6_perform_greenFFFFBBBB(
			Interface umlClass, AbstractTypeDeclaration classDec, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Operation feature = UMLFactory.eINSTANCE.createOperation();
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement bd2ne = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		MConstructorDefinition bodyDeclaration = ModiscoFactory.eINSTANCE.createMConstructorDefinition();
		Object _localVariable_0 = csp.getValue("feature", "name");
		Object _localVariable_1 = csp.getValue("bodyDeclaration", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		umlClass.getOwnedOperations().add(feature);
		ruleResult.getTargetObjects().add(feature);
		b2e.setTarget(feature);
		ruleResult.getCorrObjects().add(b2e);
		bd2ne.setTarget(feature);
		ruleResult.getCorrObjects().add(bd2ne);
		bd2ne.setSource(bodyDeclaration);
		b2e.setSource(bodyDeclaration);
		classDec.getBodyDeclarations().add(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		String feature_name_prime = (String) _localVariable_0;
		String bodyDeclaration_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		feature.setName(feature_name_prime);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { feature, b2e, bd2ne, bodyDeclaration, umlClass, classDec, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_ConstructorDec2Operation4Interface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ConstructorDec2Operation4InterfaceImpl
