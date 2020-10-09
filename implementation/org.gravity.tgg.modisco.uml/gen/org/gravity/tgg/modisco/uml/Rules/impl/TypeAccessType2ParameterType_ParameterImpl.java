/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Parameter;

import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.TypeAccessType2ParameterType_Parameter;

import org.gravity.tgg.modisco.uml.TypeAccess2Parameter;

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
 * An implementation of the model object '<em><b>Type Access Type2 Parameter Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeAccessType2ParameterType_ParameterImpl extends AbstractRuleImpl
		implements TypeAccessType2ParameterType_Parameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAccessType2ParameterType_ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeAccessType2ParameterType_Parameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AbstractMethodDeclaration method, Type jType, TypeAccess typeAccess,
			SingleVariableDeclaration variableDec) {

		Object[] result1_black = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_0_1_initialbindings_blackBBBBBB(this, match, method,
						jType, typeAccess, variableDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[jType] = " + jType + ", "
					+ "[typeAccess] = " + typeAccess + ", " + "[variableDec] = " + variableDec + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, method,
						jType, typeAccess, variableDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[jType] = " + jType + ", "
					+ "[typeAccess] = " + typeAccess + ", " + "[variableDec] = " + variableDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_0_4_collectelementstobetranslated_blackBBBBB(match,
							method, jType, typeAccess, variableDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess
						+ ", " + "[variableDec] = " + variableDec + ".");
			}
			TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_0_4_collectelementstobetranslated_greenBBBFF(match,
							jType, typeAccess);
			//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[4];

			Object[] result5_black = TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_0_5_collectcontextelements_blackBBBBB(match, method,
							jType, typeAccess, variableDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess
						+ ", " + "[variableDec] = " + variableDec + ".");
			}
			TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_0_5_collectcontextelements_greenBBBBBFFF(match,
							method, jType, typeAccess, variableDec);
			//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result5_green[7];

			// 
			TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_0_6_registerobjectstomatch_expressionBBBBBB(this,
							match, method, jType, typeAccess, variableDec);
			return TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_0_7_expressionF();
		} else {
			return TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result1_bindingAndBlack[0];
		Parameter param = (Parameter) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[2];
		Type jType = (Type) result1_bindingAndBlack[3];
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[4];
		SingleVariableDeclaration variableDec = (SingleVariableDeclaration) result1_bindingAndBlack[5];
		TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result1_bindingAndBlack[6];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_greenBB(param, uType);

		Object[] result2_green = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
						method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[method] = " + method + ", " + "[param] = " + param + ", " + "[uType] = " + uType + ", "
					+ "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess + ", " + "[variableDec] = "
					+ variableDec + ", " + "[ta2p] = " + ta2p + ", " + "[ne2ne] = " + ne2ne + ".");
		}
		TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult, param,
						uType, jType, typeAccess);
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[7];

		// 
		// 
		TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_1_5_registerobjects_expressionBBBBBBBBBB(this,
						ruleresult, method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);
		return TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_binding[0];
		Type jType = (Type) result2_binding[1];
		TypeAccess typeAccess = (TypeAccess) result2_binding[2];
		SingleVariableDeclaration variableDec = (SingleVariableDeclaration) result2_binding[3];
		for (Object[] result2_black : TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_2_2_corematch_blackBFFBBBFFB(method, jType, typeAccess,
						variableDec, match)) {
			Parameter param = (Parameter) result2_black[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[2];
			TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result2_black[6];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[7];
			// ForEach 
			for (Object[] result3_black : TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_2_3_findcontext_blackBBBBBBBB(method, param, uType,
							jType, typeAccess, variableDec, ta2p, ne2ne)) {
				Object[] result3_green = TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(method,
								param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ta2p__typeAccess____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge ta2p__param____target = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[param] = " + param + ", " + "[uType] = " + uType + ", " + "[jType] = " + jType + ", "
							+ "[typeAccess] = " + typeAccess + ", " + "[variableDec] = " + variableDec + ", "
							+ "[ta2p] = " + ta2p + ", " + "[ne2ne] = " + ne2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeAccessType2ParameterType_ParameterImpl
							.pattern_TypeAccessType2ParameterType_Parameter_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccessType2ParameterType_ParameterImpl
							.pattern_TypeAccessType2ParameterType_Parameter_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AbstractMethodDeclaration method, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec) {
		match.registerObject("method", method);
		match.registerObject("jType", jType);
		match.registerObject("typeAccess", typeAccess);
		match.registerObject("variableDec", variableDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AbstractMethodDeclaration method, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			Parameter param, org.eclipse.uml2.uml.Type uType, Type jType, TypeAccess typeAccess,
			SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p, NamedElement2NamedElement ne2ne) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("param", param);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("variableDec", variableDec);
		isApplicableMatch.registerObject("ta2p", ta2p);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject method, EObject param, EObject uType,
			EObject jType, EObject typeAccess, EObject variableDec, EObject ta2p, EObject ne2ne) {
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("param", param);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("variableDec", variableDec);
		ruleresult.registerObject("ta2p", ta2p);
		ruleresult.registerObject("ne2ne", ne2ne);

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
	public boolean isAppropriate_BWD(Match match, Parameter param, org.eclipse.uml2.uml.Type uType) {

		Object[] result1_black = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_10_1_initialbindings_blackBBBB(this, match, param,
						uType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[param] = " + param + ", " + "[uType] = " + uType + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, param,
						uType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[param] = " + param + ", " + "[uType] = " + uType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_10_4_collectelementstobetranslated_blackBBB(match,
							param, uType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[param] = " + param + ", " + "[uType] = " + uType + ".");
			}
			TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_10_4_collectelementstobetranslated_greenBBBF(match,
							param, uType);
			//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_10_5_collectcontextelements_blackBBB(match, param,
							uType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[param] = " + param + ", " + "[uType] = " + uType + ".");
			}
			TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_10_5_collectcontextelements_greenBBB(match, param,
							uType);

			// 
			TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_10_6_registerobjectstomatch_expressionBBBB(this,
							match, param, uType);
			return TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_10_7_expressionF();
		} else {
			return TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
						this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result1_bindingAndBlack[0];
		Parameter param = (Parameter) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[2];
		Type jType = (Type) result1_bindingAndBlack[3];
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[4];
		SingleVariableDeclaration variableDec = (SingleVariableDeclaration) result1_bindingAndBlack[5];
		TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result1_bindingAndBlack[6];
		NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_greenBB(jType, typeAccess);

		Object[] result2_green = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult,
						method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[method] = " + method + ", " + "[param] = " + param + ", " + "[uType] = " + uType + ", "
					+ "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess + ", " + "[variableDec] = "
					+ variableDec + ", " + "[ta2p] = " + ta2p + ", " + "[ne2ne] = " + ne2ne + ".");
		}
		TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_11_3_bookkeepingforedges_greenBBBBBFFF(ruleresult,
						param, uType, jType, typeAccess);
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[7];

		// 
		// 
		TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_11_5_registerobjects_expressionBBBBBBBBBB(this,
						ruleresult, method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);
		return TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Parameter param = (Parameter) result2_binding[0];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_binding[1];
		for (Object[] result2_black : TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_12_2_corematch_blackBBFFFFB(param, uType, match)) {
			Type jType = (Type) result2_black[2];
			TypeAccess typeAccess = (TypeAccess) result2_black[3];
			TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result2_black[4];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[5];
			// ForEach 
			for (Object[] result3_black : TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_12_3_findcontext_blackFBBBBFBB(param, uType, jType,
							typeAccess, ta2p, ne2ne)) {
				AbstractMethodDeclaration method = (AbstractMethodDeclaration) result3_black[0];
				SingleVariableDeclaration variableDec = (SingleVariableDeclaration) result3_black[5];
				Object[] result3_green = TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_12_3_findcontext_greenBBBBBBBBFFFFFFFFF(method,
								param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ta2p__typeAccess____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge ta2p__param____target = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[param] = " + param + ", " + "[uType] = " + uType + ", " + "[jType] = " + jType + ", "
							+ "[typeAccess] = " + typeAccess + ", " + "[variableDec] = " + variableDec + ", "
							+ "[ta2p] = " + ta2p + ", " + "[ne2ne] = " + ne2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeAccessType2ParameterType_ParameterImpl
							.pattern_TypeAccessType2ParameterType_Parameter_12_6_addmatchtoruleresult_blackBB(
									ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccessType2ParameterType_ParameterImpl
							.pattern_TypeAccessType2ParameterType_Parameter_12_6_addmatchtoruleresult_greenBB(
									ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Parameter param, org.eclipse.uml2.uml.Type uType) {
		match.registerObject("param", param);
		match.registerObject("uType", uType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Parameter param, org.eclipse.uml2.uml.Type uType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			Parameter param, org.eclipse.uml2.uml.Type uType, Type jType, TypeAccess typeAccess,
			SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p, NamedElement2NamedElement ne2ne) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("param", param);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("variableDec", variableDec);
		isApplicableMatch.registerObject("ta2p", ta2p);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject method, EObject param, EObject uType,
			EObject jType, EObject typeAccess, EObject variableDec, EObject ta2p, EObject ne2ne) {
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("param", param);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("variableDec", variableDec);
		ruleresult.registerObject("ta2p", ta2p);
		ruleresult.registerObject("ne2ne", ne2ne);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_260(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_20_2_testcorematchandDECs_blackFFB(_edge_type)) {
			Parameter param = (Parameter) result2_black[0];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[1];
			Object[] result2_green = TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, param, uType)) {
				// 
				if (TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccessType2ParameterType_ParameterImpl
							.pattern_TypeAccessType2ParameterType_Parameter_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccessType2ParameterType_ParameterImpl
							.pattern_TypeAccessType2ParameterType_Parameter_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_270(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_21_2_testcorematchandDECs_blackFFFFB(_edge_type)) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[0];
			Type jType = (Type) result2_black[1];
			TypeAccess typeAccess = (TypeAccess) result2_black[2];
			SingleVariableDeclaration variableDec = (SingleVariableDeclaration) result2_black[3];
			Object[] result2_green = TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, method, jType, typeAccess, variableDec)) {
				// 
				if (TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccessType2ParameterType_ParameterImpl
							.pattern_TypeAccessType2ParameterType_Parameter_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccessType2ParameterType_ParameterImpl
							.pattern_TypeAccessType2ParameterType_Parameter_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeAccessType2ParameterType_Parameter");
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
		ruleResult.setRule("TypeAccessType2ParameterType_Parameter");
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

		Object[] result1_black = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
						sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_bindingAndBlack[0];
		Parameter param = (Parameter) result2_bindingAndBlack[1];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_bindingAndBlack[2];
		Type jType = (Type) result2_bindingAndBlack[3];
		TypeAccess typeAccess = (TypeAccess) result2_bindingAndBlack[4];
		SingleVariableDeclaration variableDec = (SingleVariableDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, method,
						param, uType, jType, typeAccess, variableDec, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[method] = " + method
							+ ", " + "[param] = " + param + ", " + "[uType] = " + uType + ", " + "[jType] = " + jType
							+ ", " + "[typeAccess] = " + typeAccess + ", " + "[variableDec] = " + variableDec + ", "
							+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_24_5_matchcorrcontext_blackBBBBFFBB(param, uType,
							jType, typeAccess, sourceMatch, targetMatch)) {
				TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result5_black[4];
				NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result5_black[5];
				Object[] result5_green = TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_24_5_matchcorrcontext_greenBBBBF(ta2p, ne2ne,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_24_6_createcorrespondence_blackBBBBBBB(method,
								param, uType, jType, typeAccess, variableDec, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
							+ ", " + "[param] = " + param + ", " + "[uType] = " + uType + ", " + "[jType] = " + jType
							+ ", " + "[typeAccess] = " + typeAccess + ", " + "[variableDec] = " + variableDec + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_24_7_addtoreturnedresult_blackBB(result,
								ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_24_7_addtoreturnedresult_greenBB(result,
								ccMatch);

			}

		} else {
		}
		return TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(AbstractMethodDeclaration method, Parameter param,
			org.eclipse.uml2.uml.Type uType, Type jType, TypeAccess typeAccess, SingleVariableDeclaration variableDec,
			Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(AbstractMethodDeclaration method, Type jType, TypeAccess typeAccess,
			SingleVariableDeclaration variableDec) {// 
		Object[] result1_black = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_27_1_matchtggpattern_blackBBBB(method, jType,
						typeAccess, variableDec);
		if (result1_black != null) {
			return TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_27_2_expressionF();
		} else {
			return TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Parameter param, org.eclipse.uml2.uml.Type uType) {// 
		Object[] result1_black = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_28_1_matchtggpattern_blackBB(param, uType);
		if (result1_black != null) {
			return TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_28_2_expressionF();
		} else {
			return TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeAccess2Parameter ta2pParameter, NamedElement2NamedElement ne2neParameter) {

		Object[] result1_black = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_blackFFFFFFFFFFBB(
						ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList ta2pList = (RuleEntryList) result2_black[0];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[1];
			SingleVariableDeclaration variableDec = (SingleVariableDeclaration) result2_black[2];
			TypeAccess typeAccess = (TypeAccess) result2_black[3];
			TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result2_black[4];
			Parameter param = (Parameter) result2_black[5];
			//nothing RuleEntryList ne2neList = (RuleEntryList) result2_black[6];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[7];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result2_black[8];
			Type jType = (Type) result2_black[9];

			Object[] result3_bindingAndBlack = TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(this,
							isApplicableMatch, method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
						+ "[param] = " + param + ", " + "[uType] = " + uType + ", " + "[jType] = " + jType + ", "
						+ "[typeAccess] = " + typeAccess + ", " + "[variableDec] = " + variableDec + ", " + "[ta2p] = "
						+ ta2p + ", " + "[ne2ne] = " + ne2ne + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeAccessType2ParameterType_ParameterImpl
					.pattern_TypeAccessType2ParameterType_Parameter_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeAccessType2ParameterType_ParameterImpl
						.pattern_TypeAccessType2ParameterType_Parameter_29_5_checknacs_blackBBBBBBBB(method, param,
								uType, jType, typeAccess, variableDec, ta2p, ne2ne);
				if (result5_black != null) {

					Object[] result6_black = TypeAccessType2ParameterType_ParameterImpl
							.pattern_TypeAccessType2ParameterType_Parameter_29_6_perform_blackBBBBBBBBB(method, param,
									uType, jType, typeAccess, variableDec, ta2p, ne2ne, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
								+ ", " + "[param] = " + param + ", " + "[uType] = " + uType + ", " + "[jType] = "
								+ jType + ", " + "[typeAccess] = " + typeAccess + ", " + "[variableDec] = "
								+ variableDec + ", " + "[ta2p] = " + ta2p + ", " + "[ne2ne] = " + ne2ne + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					TypeAccessType2ParameterType_ParameterImpl
							.pattern_TypeAccessType2ParameterType_Parameter_29_6_perform_greenBBBBB(param, uType, jType,
									typeAccess, ruleResult);

				} else {
				}

			} else {
			}

		}
		return TypeAccessType2ParameterType_ParameterImpl
				.pattern_TypeAccessType2ParameterType_Parameter_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			Parameter param, org.eclipse.uml2.uml.Type uType, Type jType, TypeAccess typeAccess,
			SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p, NamedElement2NamedElement ne2ne,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("param", param);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("variableDec", variableDec);
		isApplicableMatch.registerObject("ta2p", ta2p);
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
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPROPRIATE_FWD__MATCH_ABSTRACTMETHODDECLARATION_TYPE_TYPEACCESS_SINGLEVARIABLEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (AbstractMethodDeclaration) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3),
					(SingleVariableDeclaration) arguments.get(4));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ABSTRACTMETHODDECLARATION_TYPE_TYPEACCESS_SINGLEVARIABLEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AbstractMethodDeclaration) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3),
					(SingleVariableDeclaration) arguments.get(4));
			return null;
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ABSTRACTMETHODDECLARATION_TYPE_TYPEACCESS_SINGLEVARIABLEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AbstractMethodDeclaration) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3),
					(SingleVariableDeclaration) arguments.get(4));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ABSTRACTMETHODDECLARATION_PARAMETER_TYPE_TYPE_TYPEACCESS_SINGLEVARIABLEDECLARATION_TYPEACCESS2PARAMETER_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(AbstractMethodDeclaration) arguments.get(1), (Parameter) arguments.get(2),
					(org.eclipse.uml2.uml.Type) arguments.get(3), (Type) arguments.get(4),
					(TypeAccess) arguments.get(5), (SingleVariableDeclaration) arguments.get(6),
					(TypeAccess2Parameter) arguments.get(7), (NamedElement2NamedElement) arguments.get(8));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPROPRIATE_BWD__MATCH_PARAMETER_TYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARAMETER_TYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2));
			return null;
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARAMETER_TYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ABSTRACTMETHODDECLARATION_PARAMETER_TYPE_TYPE_TYPEACCESS_SINGLEVARIABLEDECLARATION_TYPEACCESS2PARAMETER_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AbstractMethodDeclaration) arguments.get(1), (Parameter) arguments.get(2),
					(org.eclipse.uml2.uml.Type) arguments.get(3), (Type) arguments.get(4),
					(TypeAccess) arguments.get(5), (SingleVariableDeclaration) arguments.get(6),
					(TypeAccess2Parameter) arguments.get(7), (NamedElement2NamedElement) arguments.get(8));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_260__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_260((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_270__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_270((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPLICABLE_SOLVE_CSP_CC__ABSTRACTMETHODDECLARATION_PARAMETER_TYPE_TYPE_TYPEACCESS_SINGLEVARIABLEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((AbstractMethodDeclaration) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (Type) arguments.get(3),
					(TypeAccess) arguments.get(4), (SingleVariableDeclaration) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___CHECK_DEC_FWD__ABSTRACTMETHODDECLARATION_TYPE_TYPEACCESS_SINGLEVARIABLEDECLARATION:
			return checkDEC_FWD((AbstractMethodDeclaration) arguments.get(0), (Type) arguments.get(1),
					(TypeAccess) arguments.get(2), (SingleVariableDeclaration) arguments.get(3));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___CHECK_DEC_BWD__PARAMETER_TYPE:
			return checkDEC_BWD((Parameter) arguments.get(0), (org.eclipse.uml2.uml.Type) arguments.get(1));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___GENERATE_MODEL__RULEENTRYCONTAINER_TYPEACCESS2PARAMETER_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeAccess2Parameter) arguments.get(1),
					(NamedElement2NamedElement) arguments.get(2));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ABSTRACTMETHODDECLARATION_PARAMETER_TYPE_TYPE_TYPEACCESS_SINGLEVARIABLEDECLARATION_TYPEACCESS2PARAMETER_NAMEDELEMENT2NAMEDELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AbstractMethodDeclaration) arguments.get(1), (Parameter) arguments.get(2),
					(org.eclipse.uml2.uml.Type) arguments.get(3), (Type) arguments.get(4),
					(TypeAccess) arguments.get(5), (SingleVariableDeclaration) arguments.get(6),
					(TypeAccess2Parameter) arguments.get(7), (NamedElement2NamedElement) arguments.get(8),
					(ModelgeneratorRuleResult) arguments.get(9));
		case RulesPackage.TYPE_ACCESS_TYPE2_PARAMETER_TYPE_PARAMETER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_0_1_initialbindings_blackBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, Match match, AbstractMethodDeclaration method, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec) {
		return new Object[] { _this, match, method, jType, typeAccess, variableDec };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_bindingFBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, Match match, AbstractMethodDeclaration method, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, method, jType, typeAccess, variableDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, method, jType, typeAccess, variableDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, Match match, AbstractMethodDeclaration method, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_binding = pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, method, jType, typeAccess, variableDec);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_black = pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, method, jType, typeAccess, variableDec };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_0_3_CheckCSP_expressionFBB(
			TypeAccessType2ParameterType_Parameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, AbstractMethodDeclaration method, Type jType, TypeAccess typeAccess,
			SingleVariableDeclaration variableDec) {
		return new Object[] { match, method, jType, typeAccess, variableDec };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, Type jType, TypeAccess typeAccess) {
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		match.getToBeTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, jType, typeAccess, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_0_5_collectcontextelements_blackBBBBB(
			Match match, AbstractMethodDeclaration method, Type jType, TypeAccess typeAccess,
			SingleVariableDeclaration variableDec) {
		return new Object[] { match, method, jType, typeAccess, variableDec };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_0_5_collectcontextelements_greenBBBBBFFF(
			Match match, AbstractMethodDeclaration method, Type jType, TypeAccess typeAccess,
			SingleVariableDeclaration variableDec) {
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(method);
		match.getContextNodes().add(jType);
		match.getContextNodes().add(typeAccess);
		match.getContextNodes().add(variableDec);
		String variableDec__typeAccess____type_name_prime = "type";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		match.getContextEdges().add(variableDec__typeAccess____type);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		match.getContextEdges().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		match.getContextEdges().add(variableDec__method____methodDeclaration);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		return new Object[] { match, method, jType, typeAccess, variableDec, variableDec__typeAccess____type,
				method__variableDec____parameters, variableDec__method____methodDeclaration };
	}

	public static final void pattern_TypeAccessType2ParameterType_Parameter_0_6_registerobjectstomatch_expressionBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, Match match, AbstractMethodDeclaration method, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec) {
		_this.registerObjectsToMatch_FWD(match, method, jType, typeAccess, variableDec);

	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("param");
		EObject _localVariable_2 = isApplicableMatch.getObject("uType");
		EObject _localVariable_3 = isApplicableMatch.getObject("jType");
		EObject _localVariable_4 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_5 = isApplicableMatch.getObject("variableDec");
		EObject _localVariable_6 = isApplicableMatch.getObject("ta2p");
		EObject _localVariable_7 = isApplicableMatch.getObject("ne2ne");
		EObject tmpMethod = _localVariable_0;
		EObject tmpParam = _localVariable_1;
		EObject tmpUType = _localVariable_2;
		EObject tmpJType = _localVariable_3;
		EObject tmpTypeAccess = _localVariable_4;
		EObject tmpVariableDec = _localVariable_5;
		EObject tmpTa2p = _localVariable_6;
		EObject tmpNe2ne = _localVariable_7;
		if (tmpMethod instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
			if (tmpParam instanceof Parameter) {
				Parameter param = (Parameter) tmpParam;
				if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
					org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
					if (tmpJType instanceof Type) {
						Type jType = (Type) tmpJType;
						if (tmpTypeAccess instanceof TypeAccess) {
							TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
							if (tmpVariableDec instanceof SingleVariableDeclaration) {
								SingleVariableDeclaration variableDec = (SingleVariableDeclaration) tmpVariableDec;
								if (tmpTa2p instanceof TypeAccess2Parameter) {
									TypeAccess2Parameter ta2p = (TypeAccess2Parameter) tmpTa2p;
									if (tmpNe2ne instanceof NamedElement2NamedElement) {
										NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
										return new Object[] { method, param, uType, jType, typeAccess, variableDec,
												ta2p, ne2ne, isApplicableMatch };
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

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_blackBBBBBBBBFBB(
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne, TypeAccessType2ParameterType_Parameter _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			TypeAccessType2ParameterType_Parameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_binding = pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_binding != null) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_binding[0];
			Parameter param = (Parameter) result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_binding[2];
			Type jType = (Type) result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_binding[3];
			TypeAccess typeAccess = (TypeAccess) result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_binding[4];
			SingleVariableDeclaration variableDec = (SingleVariableDeclaration) result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_binding[5];
			TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_binding[6];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_binding[7];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_black = pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_blackBBBBBBBBFBB(
					method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne, _this, isApplicableMatch);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_black[8];

				return new Object[] { method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_1_1_performtransformation_greenBB(
			Parameter param, org.eclipse.uml2.uml.Type uType) {
		param.setType(uType);
		return new Object[] { param, uType };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject method, EObject param, EObject uType, EObject jType,
			EObject typeAccess, EObject variableDec, EObject ta2p, EObject ne2ne) {
		if (!method.equals(param)) {
			if (!method.equals(uType)) {
				if (!method.equals(typeAccess)) {
					if (!method.equals(variableDec)) {
						if (!method.equals(ta2p)) {
							if (!method.equals(ne2ne)) {
								if (!param.equals(uType)) {
									if (!param.equals(typeAccess)) {
										if (!param.equals(variableDec)) {
											if (!param.equals(ta2p)) {
												if (!uType.equals(variableDec)) {
													if (!jType.equals(method)) {
														if (!jType.equals(param)) {
															if (!jType.equals(uType)) {
																if (!jType.equals(typeAccess)) {
																	if (!jType.equals(variableDec)) {
																		if (!jType.equals(ta2p)) {
																			if (!jType.equals(ne2ne)) {
																				if (!typeAccess.equals(uType)) {
																					if (!typeAccess
																							.equals(variableDec)) {
																						if (!ta2p.equals(uType)) {
																							if (!ta2p.equals(
																									typeAccess)) {
																								if (!ta2p.equals(
																										variableDec)) {
																									if (!ne2ne.equals(
																											param)) {
																										if (!ne2ne
																												.equals(uType)) {
																											if (!ne2ne
																													.equals(typeAccess)) {
																												if (!ne2ne
																														.equals(variableDec)) {
																													if (!ne2ne
																															.equals(ta2p)) {
																														return new Object[] {
																																ruleresult,
																																method,
																																param,
																																uType,
																																jType,
																																typeAccess,
																																variableDec,
																																ta2p,
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
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject param, EObject uType, EObject jType, EObject typeAccess) {
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccessType2ParameterType_Parameter";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String param__uType____type_name_prime = "type";
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		ruleresult.getCreatedEdges().add(param__uType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		return new Object[] { ruleresult, param, uType, jType, typeAccess, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, param__uType____type };
	}

	public static final void pattern_TypeAccessType2ParameterType_Parameter_1_5_registerobjects_expressionBBBBBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, PerformRuleResult ruleresult, EObject method, EObject param,
			EObject uType, EObject jType, EObject typeAccess, EObject variableDec, EObject ta2p, EObject ne2ne) {
		_this.registerObjects_FWD(ruleresult, method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);

	}

	public static final PerformRuleResult pattern_TypeAccessType2ParameterType_Parameter_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_bindingFB(
			TypeAccessType2ParameterType_Parameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_blackFBB(
			EClass eClass, TypeAccessType2ParameterType_Parameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccessType2ParameterType_Parameter _this) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_binding = pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_black = pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccessType2ParameterType_Parameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_2_corematch_bindingFFFFB(
			Match match) {
		EObject _localVariable_0 = match.getObject("method");
		EObject _localVariable_1 = match.getObject("jType");
		EObject _localVariable_2 = match.getObject("typeAccess");
		EObject _localVariable_3 = match.getObject("variableDec");
		EObject tmpMethod = _localVariable_0;
		EObject tmpJType = _localVariable_1;
		EObject tmpTypeAccess = _localVariable_2;
		EObject tmpVariableDec = _localVariable_3;
		if (tmpMethod instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
			if (tmpJType instanceof Type) {
				Type jType = (Type) tmpJType;
				if (tmpTypeAccess instanceof TypeAccess) {
					TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
					if (tmpVariableDec instanceof SingleVariableDeclaration) {
						SingleVariableDeclaration variableDec = (SingleVariableDeclaration) tmpVariableDec;
						return new Object[] { method, jType, typeAccess, variableDec, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccessType2ParameterType_Parameter_2_2_corematch_blackBFFBBBFFB(
			AbstractMethodDeclaration method, Type jType, TypeAccess typeAccess, SingleVariableDeclaration variableDec,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeAccess2Parameter ta2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(typeAccess,
				TypeAccess2Parameter.class, "source")) {
			Parameter param = ta2p.getTarget();
			if (param != null) {
				for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jType, NamedElement2NamedElement.class, "source")) {
					NamedElement tmpUType = ne2ne.getTarget();
					if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
						org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
						_result.add(new Object[] { method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne,
								match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccessType2ParameterType_Parameter_2_3_findcontext_blackBBBBBBBB(
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (typeAccess.equals(variableDec.getType())) {
			if (typeAccess.equals(ta2p.getSource())) {
				if (jType.equals(typeAccess.getType())) {
					if (jType.equals(ne2ne.getSource())) {
						if (uType.equals(ne2ne.getTarget())) {
							if (method.getParameters().contains(variableDec)) {
								if (param.equals(ta2p.getTarget())) {
									_result.add(new Object[] { method, param, uType, jType, typeAccess, variableDec,
											ta2p, ne2ne });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String variableDec__typeAccess____type_name_prime = "type";
		String ta2p__typeAccess____source_name_prime = "source";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ne2ne__jType____source_name_prime = "source";
		String ne2ne__uType____target_name_prime = "target";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String ta2p__param____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(param);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(variableDec);
		isApplicableMatch.getAllContextElements().add(ta2p);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(variableDec__typeAccess____type);
		ta2p__typeAccess____source.setSrc(ta2p);
		ta2p__typeAccess____source.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(ta2p__typeAccess____source);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(jType__typeAccess____usagesInTypeAccess);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		isApplicableMatch.getAllContextElements().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		isApplicableMatch.getAllContextElements().add(variableDec__method____methodDeclaration);
		ta2p__param____target.setSrc(ta2p);
		ta2p__param____target.setTrg(param);
		isApplicableMatch.getAllContextElements().add(ta2p__param____target);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		ta2p__typeAccess____source.setName(ta2p__typeAccess____source_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		ta2p__param____target.setName(ta2p__param____target_name_prime);
		return new Object[] { method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne, isApplicableMatch,
				variableDec__typeAccess____type, ta2p__typeAccess____source, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, ne2ne__jType____source, ne2ne__uType____target,
				method__variableDec____parameters, variableDec__method____methodDeclaration, ta2p__param____target };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_bindingFBBBBBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, IsApplicableMatch isApplicableMatch,
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, method, param, uType, jType,
				typeAccess, variableDec, ta2p, ne2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, param, uType, jType, typeAccess, variableDec,
					ta2p, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, IsApplicableMatch isApplicableMatch,
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_binding = pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_black = pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, param, uType, jType, typeAccess,
						variableDec, ta2p, ne2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_2_5_checkCSP_expressionFBB(
			TypeAccessType2ParameterType_Parameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccessType2ParameterType_Parameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccessType2ParameterType_Parameter_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_10_1_initialbindings_blackBBBB(
			TypeAccessType2ParameterType_Parameter _this, Match match, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		return new Object[] { _this, match, param, uType };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_bindingFBBBB(
			TypeAccessType2ParameterType_Parameter _this, Match match, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, param, uType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, param, uType };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_bindingAndBlackFBBBB(
			TypeAccessType2ParameterType_Parameter _this, Match match, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_binding = pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_bindingFBBBB(
				_this, match, param, uType);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_black = pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, param, uType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_10_3_CheckCSP_expressionFBB(
			TypeAccessType2ParameterType_Parameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_10_4_collectelementstobetranslated_blackBBB(
			Match match, Parameter param, org.eclipse.uml2.uml.Type uType) {
		return new Object[] { match, param, uType };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Parameter param, org.eclipse.uml2.uml.Type uType) {
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String param__uType____type_name_prime = "type";
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		match.getToBeTranslatedEdges().add(param__uType____type);
		param__uType____type.setName(param__uType____type_name_prime);
		return new Object[] { match, param, uType, param__uType____type };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_10_5_collectcontextelements_blackBBB(
			Match match, Parameter param, org.eclipse.uml2.uml.Type uType) {
		return new Object[] { match, param, uType };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_10_5_collectcontextelements_greenBBB(
			Match match, Parameter param, org.eclipse.uml2.uml.Type uType) {
		match.getContextNodes().add(param);
		match.getContextNodes().add(uType);
		return new Object[] { match, param, uType };
	}

	public static final void pattern_TypeAccessType2ParameterType_Parameter_10_6_registerobjectstomatch_expressionBBBB(
			TypeAccessType2ParameterType_Parameter _this, Match match, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		_this.registerObjectsToMatch_BWD(match, param, uType);

	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("param");
		EObject _localVariable_2 = isApplicableMatch.getObject("uType");
		EObject _localVariable_3 = isApplicableMatch.getObject("jType");
		EObject _localVariable_4 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_5 = isApplicableMatch.getObject("variableDec");
		EObject _localVariable_6 = isApplicableMatch.getObject("ta2p");
		EObject _localVariable_7 = isApplicableMatch.getObject("ne2ne");
		EObject tmpMethod = _localVariable_0;
		EObject tmpParam = _localVariable_1;
		EObject tmpUType = _localVariable_2;
		EObject tmpJType = _localVariable_3;
		EObject tmpTypeAccess = _localVariable_4;
		EObject tmpVariableDec = _localVariable_5;
		EObject tmpTa2p = _localVariable_6;
		EObject tmpNe2ne = _localVariable_7;
		if (tmpMethod instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
			if (tmpParam instanceof Parameter) {
				Parameter param = (Parameter) tmpParam;
				if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
					org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
					if (tmpJType instanceof Type) {
						Type jType = (Type) tmpJType;
						if (tmpTypeAccess instanceof TypeAccess) {
							TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
							if (tmpVariableDec instanceof SingleVariableDeclaration) {
								SingleVariableDeclaration variableDec = (SingleVariableDeclaration) tmpVariableDec;
								if (tmpTa2p instanceof TypeAccess2Parameter) {
									TypeAccess2Parameter ta2p = (TypeAccess2Parameter) tmpTa2p;
									if (tmpNe2ne instanceof NamedElement2NamedElement) {
										NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
										return new Object[] { method, param, uType, jType, typeAccess, variableDec,
												ta2p, ne2ne, isApplicableMatch };
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

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_blackBBBBBBBBFBB(
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne, TypeAccessType2ParameterType_Parameter _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			TypeAccessType2ParameterType_Parameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_binding = pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_binding != null) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_binding[0];
			Parameter param = (Parameter) result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_binding[2];
			Type jType = (Type) result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_binding[3];
			TypeAccess typeAccess = (TypeAccess) result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_binding[4];
			SingleVariableDeclaration variableDec = (SingleVariableDeclaration) result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_binding[5];
			TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_binding[6];
			NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_binding[7];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_black = pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_blackBBBBBBBBFBB(
					method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne, _this, isApplicableMatch);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_black[8];

				return new Object[] { method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_11_1_performtransformation_greenBB(
			Type jType, TypeAccess typeAccess) {
		typeAccess.setType(jType);
		return new Object[] { jType, typeAccess };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject method, EObject param, EObject uType, EObject jType,
			EObject typeAccess, EObject variableDec, EObject ta2p, EObject ne2ne) {
		if (!method.equals(param)) {
			if (!method.equals(uType)) {
				if (!method.equals(typeAccess)) {
					if (!method.equals(variableDec)) {
						if (!method.equals(ta2p)) {
							if (!method.equals(ne2ne)) {
								if (!param.equals(uType)) {
									if (!param.equals(typeAccess)) {
										if (!param.equals(variableDec)) {
											if (!param.equals(ta2p)) {
												if (!uType.equals(variableDec)) {
													if (!jType.equals(method)) {
														if (!jType.equals(param)) {
															if (!jType.equals(uType)) {
																if (!jType.equals(typeAccess)) {
																	if (!jType.equals(variableDec)) {
																		if (!jType.equals(ta2p)) {
																			if (!jType.equals(ne2ne)) {
																				if (!typeAccess.equals(uType)) {
																					if (!typeAccess
																							.equals(variableDec)) {
																						if (!ta2p.equals(uType)) {
																							if (!ta2p.equals(
																									typeAccess)) {
																								if (!ta2p.equals(
																										variableDec)) {
																									if (!ne2ne.equals(
																											param)) {
																										if (!ne2ne
																												.equals(uType)) {
																											if (!ne2ne
																													.equals(typeAccess)) {
																												if (!ne2ne
																														.equals(variableDec)) {
																													if (!ne2ne
																															.equals(ta2p)) {
																														return new Object[] {
																																ruleresult,
																																method,
																																param,
																																uType,
																																jType,
																																typeAccess,
																																variableDec,
																																ta2p,
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
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_11_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject param, EObject uType, EObject jType, EObject typeAccess) {
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccessType2ParameterType_Parameter";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String param__uType____type_name_prime = "type";
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getCreatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		ruleresult.getTranslatedEdges().add(param__uType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		return new Object[] { ruleresult, param, uType, jType, typeAccess, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, param__uType____type };
	}

	public static final void pattern_TypeAccessType2ParameterType_Parameter_11_5_registerobjects_expressionBBBBBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, PerformRuleResult ruleresult, EObject method, EObject param,
			EObject uType, EObject jType, EObject typeAccess, EObject variableDec, EObject ta2p, EObject ne2ne) {
		_this.registerObjects_BWD(ruleresult, method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);

	}

	public static final PerformRuleResult pattern_TypeAccessType2ParameterType_Parameter_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_bindingFB(
			TypeAccessType2ParameterType_Parameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_blackFBB(
			EClass eClass, TypeAccessType2ParameterType_Parameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccessType2ParameterType_Parameter _this) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_binding = pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_black = pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccessType2ParameterType_Parameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("param");
		EObject _localVariable_1 = match.getObject("uType");
		EObject tmpParam = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		if (tmpParam instanceof Parameter) {
			Parameter param = (Parameter) tmpParam;
			if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
				org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
				return new Object[] { param, uType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccessType2ParameterType_Parameter_12_2_corematch_blackBBFFFFB(
			Parameter param, org.eclipse.uml2.uml.Type uType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(uType,
				NamedElement2NamedElement.class, "target")) {
			org.eclipse.modisco.java.NamedElement tmpJType = ne2ne.getSource();
			if (tmpJType instanceof Type) {
				Type jType = (Type) tmpJType;
				for (TypeAccess2Parameter ta2p : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(param, TypeAccess2Parameter.class, "target")) {
					TypeAccess typeAccess = ta2p.getSource();
					if (typeAccess != null) {
						_result.add(new Object[] { param, uType, jType, typeAccess, ta2p, ne2ne, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccessType2ParameterType_Parameter_12_3_findcontext_blackFBBBBFBB(
			Parameter param, org.eclipse.uml2.uml.Type uType, Type jType, TypeAccess typeAccess,
			TypeAccess2Parameter ta2p, NamedElement2NamedElement ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (typeAccess.equals(ta2p.getSource())) {
			if (jType.equals(ne2ne.getSource())) {
				if (uType.equals(ne2ne.getTarget())) {
					if (uType.equals(param.getType())) {
						if (param.equals(ta2p.getTarget())) {
							for (SingleVariableDeclaration variableDec : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(typeAccess, SingleVariableDeclaration.class, "type")) {
								AbstractMethodDeclaration method = variableDec.getMethodDeclaration();
								if (method != null) {
									_result.add(new Object[] { method, param, uType, jType, typeAccess, variableDec,
											ta2p, ne2ne });
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_3_findcontext_greenBBBBBBBBFFFFFFFFF(
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String variableDec__typeAccess____type_name_prime = "type";
		String ta2p__typeAccess____source_name_prime = "source";
		String ne2ne__jType____source_name_prime = "source";
		String ne2ne__uType____target_name_prime = "target";
		String param__uType____type_name_prime = "type";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String ta2p__param____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(param);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(variableDec);
		isApplicableMatch.getAllContextElements().add(ta2p);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(variableDec__typeAccess____type);
		ta2p__typeAccess____source.setSrc(ta2p);
		ta2p__typeAccess____source.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(ta2p__typeAccess____source);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(param__uType____type);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		isApplicableMatch.getAllContextElements().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		isApplicableMatch.getAllContextElements().add(variableDec__method____methodDeclaration);
		ta2p__param____target.setSrc(ta2p);
		ta2p__param____target.setTrg(param);
		isApplicableMatch.getAllContextElements().add(ta2p__param____target);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		ta2p__typeAccess____source.setName(ta2p__typeAccess____source_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		ta2p__param____target.setName(ta2p__param____target_name_prime);
		return new Object[] { method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne, isApplicableMatch,
				variableDec__typeAccess____type, ta2p__typeAccess____source, ne2ne__jType____source,
				ne2ne__uType____target, param__uType____type, method__variableDec____parameters,
				variableDec__method____methodDeclaration, ta2p__param____target };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_bindingFBBBBBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, IsApplicableMatch isApplicableMatch,
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, method, param, uType, jType,
				typeAccess, variableDec, ta2p, ne2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, param, uType, jType, typeAccess, variableDec,
					ta2p, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, IsApplicableMatch isApplicableMatch,
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_binding = pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_black = pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, param, uType, jType, typeAccess,
						variableDec, ta2p, ne2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_12_5_checkCSP_expressionFBB(
			TypeAccessType2ParameterType_Parameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccessType2ParameterType_Parameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccessType2ParameterType_Parameter_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_bindingFB(
			TypeAccessType2ParameterType_Parameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, TypeAccessType2ParameterType_Parameter _this) {
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

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccessType2ParameterType_Parameter _this) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_binding = pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_black = pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeAccessType2ParameterType_Parameter_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParam = _edge_type.getSrc();
		if (tmpParam instanceof Parameter) {
			Parameter param = (Parameter) tmpParam;
			EObject tmpUType = _edge_type.getTrg();
			if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
				org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
				if (uType.equals(param.getType())) {
					_result.add(new Object[] { param, uType, _edge_type });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypeAccessType2ParameterType_Parameter _this, Match match, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, param, uType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccessType2ParameterType_Parameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccessType2ParameterType_Parameter_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_bindingFB(
			TypeAccessType2ParameterType_Parameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, TypeAccessType2ParameterType_Parameter _this) {
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

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccessType2ParameterType_Parameter _this) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_binding = pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_black = pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeAccessType2ParameterType_Parameter_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeAccess = _edge_type.getSrc();
		if (tmpTypeAccess instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
			EObject tmpJType = _edge_type.getTrg();
			if (tmpJType instanceof Type) {
				Type jType = (Type) tmpJType;
				if (jType.equals(typeAccess.getType())) {
					for (SingleVariableDeclaration variableDec : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(typeAccess, SingleVariableDeclaration.class, "type")) {
						AbstractMethodDeclaration method = variableDec.getMethodDeclaration();
						if (method != null) {
							_result.add(new Object[] { method, jType, typeAccess, variableDec, _edge_type });
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, Match match, AbstractMethodDeclaration method, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, method, jType, typeAccess, variableDec);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccessType2ParameterType_Parameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccessType2ParameterType_Parameter_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_1_prepare_blackB(
			TypeAccessType2ParameterType_Parameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("method");
		EObject _localVariable_1 = targetMatch.getObject("param");
		EObject _localVariable_2 = targetMatch.getObject("uType");
		EObject _localVariable_3 = sourceMatch.getObject("jType");
		EObject _localVariable_4 = sourceMatch.getObject("typeAccess");
		EObject _localVariable_5 = sourceMatch.getObject("variableDec");
		EObject tmpMethod = _localVariable_0;
		EObject tmpParam = _localVariable_1;
		EObject tmpUType = _localVariable_2;
		EObject tmpJType = _localVariable_3;
		EObject tmpTypeAccess = _localVariable_4;
		EObject tmpVariableDec = _localVariable_5;
		if (tmpMethod instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
			if (tmpParam instanceof Parameter) {
				Parameter param = (Parameter) tmpParam;
				if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
					org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
					if (tmpJType instanceof Type) {
						Type jType = (Type) tmpJType;
						if (tmpTypeAccess instanceof TypeAccess) {
							TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
							if (tmpVariableDec instanceof SingleVariableDeclaration) {
								SingleVariableDeclaration variableDec = (SingleVariableDeclaration) tmpVariableDec;
								return new Object[] { method, param, uType, jType, typeAccess, variableDec, sourceMatch,
										targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_blackBBBBBBBB(
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { method, param, uType, jType, typeAccess, variableDec, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_binding = pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_binding != null) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_binding[0];
			Parameter param = (Parameter) result_pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_binding[2];
			Type jType = (Type) result_pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_binding[3];
			TypeAccess typeAccess = (TypeAccess) result_pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_binding[4];
			SingleVariableDeclaration variableDec = (SingleVariableDeclaration) result_pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_black = pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_blackBBBBBBBB(
					method, param, uType, jType, typeAccess, variableDec, sourceMatch, targetMatch);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { method, param, uType, jType, typeAccess, variableDec, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_bindingFBBBBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, AbstractMethodDeclaration method, Parameter param,
			org.eclipse.uml2.uml.Type uType, Type jType, TypeAccess typeAccess, SingleVariableDeclaration variableDec,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(method, param, uType, jType, typeAccess, variableDec,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, method, param, uType, jType, typeAccess, variableDec, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, AbstractMethodDeclaration method, Parameter param,
			org.eclipse.uml2.uml.Type uType, Type jType, TypeAccess typeAccess, SingleVariableDeclaration variableDec,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_binding = pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, method, param, uType, jType, typeAccess, variableDec, sourceMatch, targetMatch);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_black = pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, method, param, uType, jType, typeAccess, variableDec, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccessType2ParameterType_Parameter_24_5_matchcorrcontext_blackBBBBFFBB(
			Parameter param, org.eclipse.uml2.uml.Type uType, Type jType, TypeAccess typeAccess, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeAccess2Parameter ta2p : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(typeAccess, TypeAccess2Parameter.class, "source")) {
				if (param.equals(ta2p.getTarget())) {
					for (NamedElement2NamedElement ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jType, NamedElement2NamedElement.class, "source")) {
						if (uType.equals(ne2ne.getTarget())) {
							_result.add(new Object[] { param, uType, jType, typeAccess, ta2p, ne2ne, sourceMatch,
									targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_5_matchcorrcontext_greenBBBBF(
			TypeAccess2Parameter ta2p, NamedElement2NamedElement ne2ne, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeAccessType2ParameterType_Parameter";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ta2p);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ta2p, ne2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_6_createcorrespondence_blackBBBBBBB(
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, CCMatch ccMatch) {
		return new Object[] { method, param, uType, jType, typeAccess, variableDec, ccMatch };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeAccessType2ParameterType_Parameter";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccessType2ParameterType_Parameter_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_27_1_matchtggpattern_blackBBBB(
			AbstractMethodDeclaration method, Type jType, TypeAccess typeAccess,
			SingleVariableDeclaration variableDec) {
		if (typeAccess.equals(variableDec.getType())) {
			if (jType.equals(typeAccess.getType())) {
				if (method.getParameters().contains(variableDec)) {
					return new Object[] { method, jType, typeAccess, variableDec };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_28_1_matchtggpattern_blackBB(
			Parameter param, org.eclipse.uml2.uml.Type uType) {
		if (uType.equals(param.getType())) {
			return new Object[] { param, uType };
		}
		return null;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_1_createresult_blackB(
			TypeAccessType2ParameterType_Parameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodDeclaration method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, SingleVariableDeclaration variableDec) {
		if (ruleResult.getSourceObjects().contains(variableDec)) {
			return new Object[] { ruleResult, variableDec };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeAccess typeAccess) {
		if (ruleResult.getSourceObjects().contains(typeAccess)) {
			return new Object[] { ruleResult, typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeAccess2Parameter ta2p) {
		if (ruleResult.getCorrObjects().contains(ta2p)) {
			return new Object[] { ruleResult, ta2p };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Parameter param) {
		if (ruleResult.getTargetObjects().contains(param)) {
			return new Object[] { ruleResult, param };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Type uType) {
		if (ruleResult.getTargetObjects().contains(uType)) {
			return new Object[] { ruleResult, uType };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, Type jType) {
		if (ruleResult.getSourceObjects().contains(jType)) {
			return new Object[] { ruleResult, jType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ta2pList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList ne2neList : ruleEntryContainer.getRuleEntryList()) {
				if (!ne2neList.equals(ta2pList)) {
					for (EObject tmpTa2p : ta2pList.getEntryObjects()) {
						if (tmpTa2p instanceof TypeAccess2Parameter) {
							TypeAccess2Parameter ta2p = (TypeAccess2Parameter) tmpTa2p;
							TypeAccess typeAccess = ta2p.getSource();
							if (typeAccess != null) {
								Parameter param = ta2p.getTarget();
								if (param != null) {
									if (pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_3BB(
											ruleResult, ta2p) == null) {
										if (pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_2BB(
												ruleResult, typeAccess) == null) {
											if (pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_4BB(
													ruleResult, param) == null) {
												for (EObject tmpNe2ne : ne2neList.getEntryObjects()) {
													if (tmpNe2ne instanceof NamedElement2NamedElement) {
														NamedElement2NamedElement ne2ne = (NamedElement2NamedElement) tmpNe2ne;
														NamedElement tmpUType = ne2ne.getTarget();
														if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
															org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
															org.eclipse.modisco.java.NamedElement tmpJType = ne2ne
																	.getSource();
															if (tmpJType instanceof Type) {
																Type jType = (Type) tmpJType;
																if (pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_6BB(
																		ruleResult, ne2ne) == null) {
																	if (pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_5BB(
																			ruleResult, uType) == null) {
																		if (pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_7BB(
																				ruleResult, jType) == null) {
																			for (SingleVariableDeclaration variableDec : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							typeAccess,
																							SingleVariableDeclaration.class,
																							"type")) {
																				AbstractMethodDeclaration method = variableDec
																						.getMethodDeclaration();
																				if (method != null) {
																					if (pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_1BB(
																							ruleResult,
																							variableDec) == null) {
																						if (pattern_TypeAccessType2ParameterType_Parameter_29_2_isapplicablecore_black_nac_0BB(
																								ruleResult,
																								method) == null) {
																							_result.add(new Object[] {
																									ta2pList, method,
																									variableDec,
																									typeAccess, ta2p,
																									param, ne2neList,
																									uType, ne2ne, jType,
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
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_bindingFBBBBBBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, IsApplicableMatch isApplicableMatch,
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, method, param, uType, jType,
				typeAccess, variableDec, ta2p, ne2ne, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, param, uType, jType, typeAccess, variableDec,
					ta2p, ne2ne, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBB(
			TypeAccessType2ParameterType_Parameter _this, IsApplicableMatch isApplicableMatch,
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_binding = pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_bindingFBBBBBBBBBBB(
				_this, isApplicableMatch, method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne,
				ruleResult);
		if (result_pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_black = pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccessType2ParameterType_Parameter_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, param, uType, jType, typeAccess,
						variableDec, ta2p, ne2ne, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccessType2ParameterType_Parameter_29_4_checkCSP_expressionFBB(
			TypeAccessType2ParameterType_Parameter _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_5_checknacs_blackBBBBBBBB(
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne) {
		return new Object[] { method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_6_perform_blackBBBBBBBBB(
			AbstractMethodDeclaration method, Parameter param, org.eclipse.uml2.uml.Type uType, Type jType,
			TypeAccess typeAccess, SingleVariableDeclaration variableDec, TypeAccess2Parameter ta2p,
			NamedElement2NamedElement ne2ne, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { method, param, uType, jType, typeAccess, variableDec, ta2p, ne2ne, ruleResult };
	}

	public static final Object[] pattern_TypeAccessType2ParameterType_Parameter_29_6_perform_greenBBBBB(Parameter param,
			org.eclipse.uml2.uml.Type uType, Type jType, TypeAccess typeAccess, ModelgeneratorRuleResult ruleResult) {
		typeAccess.setType(jType);
		param.setType(uType);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { param, uType, jType, typeAccess, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypeAccessType2ParameterType_Parameter_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeAccessType2ParameterType_ParameterImpl
