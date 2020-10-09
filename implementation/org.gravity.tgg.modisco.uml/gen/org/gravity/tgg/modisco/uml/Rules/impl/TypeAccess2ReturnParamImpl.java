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
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.TypeAccess2ReturnParam;

import org.gravity.tgg.modisco.uml.TypeAccess2Parameter;
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
 * An implementation of the model object '<em><b>Type Access2 Return Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeAccess2ReturnParamImpl extends AbstractRuleImpl implements TypeAccess2ReturnParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAccess2ReturnParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeAccess2ReturnParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MethodDeclaration method, TypeAccess typeAccess) {

		Object[] result1_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_0_1_initialbindings_blackBBBB(this, match, method, typeAccess);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, method, typeAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_0_4_collectelementstobetranslated_blackBBB(match, method,
							typeAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ".");
			}
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_4_collectelementstobetranslated_greenBBBF(match,
					method, typeAccess);
			//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_0_5_collectcontextelements_blackBBB(match, method, typeAccess);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ".");
			}
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_5_collectcontextelements_greenBB(match, method);

			// 
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_6_registerobjectstomatch_expressionBBBB(this,
					match, method, typeAccess);
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_7_expressionF();
		} else {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MethodDeclaration method = (MethodDeclaration) result1_bindingAndBlack[0];
		Operation operation = (Operation) result1_bindingAndBlack[1];
		NamedElement2NamedElement m2o = (NamedElement2NamedElement) result1_bindingAndBlack[2];
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_1_1_performtransformation_greenFFBBB(operation, typeAccess, csp);
		Parameter returnParam = (Parameter) result1_green[0];
		TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result1_green[1];

		Object[] result2_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_1_2_collecttranslatedelements_blackBBB(returnParam, ta2p, typeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[returnParam] = " + returnParam
					+ ", " + "[ta2p] = " + ta2p + ", " + "[typeAccess] = " + typeAccess + ".");
		}
		Object[] result2_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_1_2_collecttranslatedelements_greenFBBB(returnParam, ta2p, typeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, returnParam, ta2p,
						method, operation, m2o, typeAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[returnParam] = " + returnParam + ", " + "[ta2p] = " + ta2p + ", " + "[method] = "
					+ method + ", " + "[operation] = " + operation + ", " + "[m2o] = " + m2o + ", " + "[typeAccess] = "
					+ typeAccess + ".");
		}
		TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
				returnParam, ta2p, method, operation, typeAccess);
		//nothing EMoflonEdge ta2p__returnParam____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge ta2p__typeAccess____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, returnParam, ta2p, method, operation, m2o, typeAccess);
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MethodDeclaration method = (MethodDeclaration) result2_binding[0];
		TypeAccess typeAccess = (TypeAccess) result2_binding[1];
		for (Object[] result2_black : TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_2_2_corematch_blackBFFBB(method, typeAccess, match)) {
			Operation operation = (Operation) result2_black[1];
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) result2_black[2];
			// ForEach 
			for (Object[] result3_black : TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_2_3_findcontext_blackBBBB(method, operation, m2o, typeAccess)) {
				Object[] result3_green = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_2_3_findcontext_greenBBBBFFFF(method, operation, m2o,
								typeAccess);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge m2o__method____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge m2o__operation____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								method, operation, m2o, typeAccess);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[operation] = " + operation + ", " + "[m2o] = " + m2o + ", " + "[typeAccess] = "
							+ typeAccess + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeAccess2ReturnParamImpl
							.pattern_TypeAccess2ReturnParam_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MethodDeclaration method, TypeAccess typeAccess) {
		match.registerObject("method", method);
		match.registerObject("typeAccess", typeAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MethodDeclaration method, TypeAccess typeAccess) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MethodDeclaration method,
			Operation operation, NamedElement2NamedElement m2o, TypeAccess typeAccess) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam.direction", csp);
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		// Create constraints
		IsReturn isReturn = new IsReturn();

		csp.getConstraints().add(isReturn);

		// Solve CSP
		isReturn.setRuleName("NoRuleName");
		isReturn.solve(var_returnParam_direction);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("m2o", m2o);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject returnParam, EObject ta2p, EObject method,
			EObject operation, EObject m2o, EObject typeAccess) {
		ruleresult.registerObject("returnParam", returnParam);
		ruleresult.registerObject("ta2p", ta2p);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("m2o", m2o);
		ruleresult.registerObject("typeAccess", typeAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeAccess").eClass())
				.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Parameter returnParam, Operation operation) {

		Object[] result1_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_10_1_initialbindings_blackBBBB(this, match, returnParam, operation);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[returnParam] = " + returnParam + ", " + "[operation] = " + operation + ".");
		}

		Object[] result2_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, returnParam, operation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[returnParam] = " + returnParam + ", " + "[operation] = " + operation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_10_4_collectelementstobetranslated_blackBBB(match, returnParam,
							operation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[returnParam] = " + returnParam + ", " + "[operation] = " + operation + ".");
			}
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_4_collectelementstobetranslated_greenBBBF(
					match, returnParam, operation);
			//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_10_5_collectcontextelements_blackBBB(match, returnParam, operation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[returnParam] = " + returnParam + ", " + "[operation] = " + operation + ".");
			}
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_5_collectcontextelements_greenBB(match,
					operation);

			// 
			TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_6_registerobjectstomatch_expressionBBBB(this,
					match, returnParam, operation);
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_7_expressionF();
		} else {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Parameter returnParam = (Parameter) result1_bindingAndBlack[0];
		MethodDeclaration method = (MethodDeclaration) result1_bindingAndBlack[1];
		Operation operation = (Operation) result1_bindingAndBlack[2];
		NamedElement2NamedElement m2o = (NamedElement2NamedElement) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_11_1_performtransformation_greenBFBF(returnParam, method);
		TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result1_green[1];
		TypeAccess typeAccess = (TypeAccess) result1_green[3];

		Object[] result2_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_11_2_collecttranslatedelements_blackBBB(returnParam, ta2p, typeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[returnParam] = " + returnParam
					+ ", " + "[ta2p] = " + ta2p + ", " + "[typeAccess] = " + typeAccess + ".");
		}
		Object[] result2_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_11_2_collecttranslatedelements_greenFBBB(returnParam, ta2p, typeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, returnParam, ta2p,
						method, operation, m2o, typeAccess);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[returnParam] = " + returnParam + ", " + "[ta2p] = " + ta2p + ", " + "[method] = "
					+ method + ", " + "[operation] = " + operation + ", " + "[m2o] = " + m2o + ", " + "[typeAccess] = "
					+ typeAccess + ".");
		}
		TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult,
				returnParam, ta2p, method, operation, typeAccess);
		//nothing EMoflonEdge ta2p__returnParam____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge ta2p__typeAccess____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, returnParam, ta2p, method, operation, m2o, typeAccess);
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Parameter returnParam = (Parameter) result2_binding[0];
		Operation operation = (Operation) result2_binding[1];
		for (Object[] result2_black : TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_12_2_corematch_blackBFBFB(returnParam, operation, match)) {
			MethodDeclaration method = (MethodDeclaration) result2_black[1];
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_12_3_findcontext_blackBBBB(returnParam, method, operation, m2o)) {
				Object[] result3_green = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_12_3_findcontext_greenBBBBFFFF(returnParam, method, operation,
								m2o);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge m2o__method____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge m2o__operation____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								returnParam, method, operation, m2o);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[returnParam] = " + returnParam
							+ ", " + "[method] = " + method + ", " + "[operation] = " + operation + ", " + "[m2o] = "
							+ m2o + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeAccess2ReturnParamImpl
							.pattern_TypeAccess2ReturnParam_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Parameter returnParam, Operation operation) {
		match.registerObject("returnParam", returnParam);
		match.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Parameter returnParam, Operation operation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam.direction", true,
				csp);
		var_returnParam_direction.setValue(returnParam.getDirection());
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		// Create unbound variables

		// Create constraints
		IsReturn isReturn = new IsReturn();

		csp.getConstraints().add(isReturn);

		// Solve CSP
		isReturn.setRuleName("NoRuleName");
		isReturn.solve(var_returnParam_direction);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Parameter returnParam,
			MethodDeclaration method, Operation operation, NamedElement2NamedElement m2o) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("returnParam", returnParam);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("m2o", m2o);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject returnParam, EObject ta2p, EObject method,
			EObject operation, EObject m2o, EObject typeAccess) {
		ruleresult.registerObject("returnParam", returnParam);
		ruleresult.registerObject("ta2p", ta2p);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("m2o", m2o);
		ruleresult.registerObject("typeAccess", typeAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("returnParam").eClass())
				.equals("uml.Parameter.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_313(EMoflonEdge _edge_ownedParameter) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_20_2_testcorematchandDECs_blackFFB(_edge_ownedParameter)) {
			Parameter returnParam = (Parameter) result2_black[0];
			Operation operation = (Operation) result2_black[1];
			Object[] result2_green = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, returnParam, operation)) {
				// 
				if (TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccess2ReturnParamImpl
							.pattern_TypeAccess2ReturnParam_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_323(EMoflonEdge _edge_returnType) {

		Object[] result1_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_blackFFB(_edge_returnType)) {
			MethodDeclaration method = (MethodDeclaration) result2_black[0];
			TypeAccess typeAccess = (TypeAccess) result2_black[1];
			Object[] result2_green = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, method, typeAccess)) {
				// 
				if (TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = TypeAccess2ReturnParamImpl
							.pattern_TypeAccess2ReturnParam_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeAccess2ReturnParam");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam", true, csp);
		var_returnParam_direction.setValue(__helper.getValue("returnParam", "direction"));
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		IsReturn isReturn0 = new IsReturn();
		csp.getConstraints().add(isReturn0);

		isReturn0.setRuleName("TypeAccess2ReturnParam");
		isReturn0.solve(var_returnParam_direction);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_returnParam_direction.setBound(false);
			isReturn0.solve(var_returnParam_direction);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("returnParam", "direction", var_returnParam_direction.getValue());
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
		ruleResult.setRule("TypeAccess2ReturnParam");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam", true, csp);
		var_returnParam_direction.setValue(__helper.getValue("returnParam", "direction"));
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		IsReturn isReturn0 = new IsReturn();
		csp.getConstraints().add(isReturn0);

		isReturn0.setRuleName("TypeAccess2ReturnParam");
		isReturn0.solve(var_returnParam_direction);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			isReturn0.solve(var_returnParam_direction);
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

		Object[] result1_black = TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Parameter returnParam = (Parameter) result2_bindingAndBlack[0];
		MethodDeclaration method = (MethodDeclaration) result2_bindingAndBlack[1];
		Operation operation = (Operation) result2_bindingAndBlack[2];
		TypeAccess typeAccess = (TypeAccess) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, returnParam, method,
						operation, typeAccess, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[returnParam] = " + returnParam + ", " + "[method] = " + method + ", " + "[operation] = "
					+ operation + ", " + "[typeAccess] = " + typeAccess + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_24_5_matchcorrcontext_blackBBFBB(method, operation, sourceMatch,
							targetMatch)) {
				NamedElement2NamedElement m2o = (NamedElement2NamedElement) result5_black[2];
				Object[] result5_green = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_24_5_matchcorrcontext_greenBBBF(m2o, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_24_6_createcorrespondence_blackBBBBB(returnParam, method,
								operation, typeAccess, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[returnParam] = "
							+ returnParam + ", " + "[method] = " + method + ", " + "[operation] = " + operation + ", "
							+ "[typeAccess] = " + typeAccess + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_6_createcorrespondence_greenBFBB(
						returnParam, typeAccess, ccMatch);
				//nothing TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result6_green[1];

				Object[] result7_black = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Parameter returnParam, MethodDeclaration method, Operation operation,
			TypeAccess typeAccess, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam.direction", true,
				csp);
		var_returnParam_direction.setValue(returnParam.getDirection());
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		// Create unbound variables

		// Create constraints
		IsReturn isReturn = new IsReturn();

		csp.getConstraints().add(isReturn);

		// Solve CSP
		isReturn.setRuleName("NoRuleName");
		isReturn.solve(var_returnParam_direction);
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
	public boolean checkDEC_FWD(MethodDeclaration method, TypeAccess typeAccess) {// 
		Object[] result1_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_blackBB(method, typeAccess);
		if (result1_black != null) {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_27_2_expressionF();
		} else {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Parameter returnParam, Operation operation) {// 
		Object[] result1_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_28_1_matchtggpattern_blackBB(returnParam, operation);
		if (result1_black != null) {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_28_2_expressionF();
		} else {
			return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement m2oParameter) {

		Object[] result1_black = TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeAccess2ReturnParamImpl
				.pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList m2oList = (RuleEntryList) result2_black[0];
			MethodDeclaration method = (MethodDeclaration) result2_black[1];
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) result2_black[2];
			Operation operation = (Operation) result2_black[3];

			Object[] result3_bindingAndBlack = TypeAccess2ReturnParamImpl
					.pattern_TypeAccess2ReturnParam_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							method, operation, m2o, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
						+ "[operation] = " + operation + ", " + "[m2o] = " + m2o + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeAccess2ReturnParamImpl
						.pattern_TypeAccess2ReturnParam_29_5_checknacs_blackBBB(method, operation, m2o);
				if (result5_black != null) {

					Object[] result6_black = TypeAccess2ReturnParamImpl
							.pattern_TypeAccess2ReturnParam_29_6_perform_blackBBBB(method, operation, m2o, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
								+ ", " + "[operation] = " + operation + ", " + "[m2o] = " + m2o + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_29_6_perform_greenFFBBFBB(method,
							operation, ruleResult, csp);
					//nothing Parameter returnParam = (Parameter) result6_green[0];
					//nothing TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result6_green[1];
					//nothing TypeAccess typeAccess = (TypeAccess) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return TypeAccess2ReturnParamImpl.pattern_TypeAccess2ReturnParam_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MethodDeclaration method,
			Operation operation, NamedElement2NamedElement m2o, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam.direction", csp);
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		// Create constraints
		IsReturn isReturn = new IsReturn();

		csp.getConstraints().add(isReturn);

		// Solve CSP
		isReturn.setRuleName("NoRuleName");
		isReturn.solve(var_returnParam_direction);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("m2o", m2o);
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
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_FWD__MATCH_METHODDECLARATION_TYPEACCESS:
			return isAppropriate_FWD((Match) arguments.get(0), (MethodDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_METHODDECLARATION_TYPEACCESS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MethodDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2));
			return null;
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_METHODDECLARATION_TYPEACCESS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MethodDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_METHODDECLARATION_OPERATION_NAMEDELEMENT2NAMEDELEMENT_TYPEACCESS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MethodDeclaration) arguments.get(1),
					(Operation) arguments.get(2), (NamedElement2NamedElement) arguments.get(3),
					(TypeAccess) arguments.get(4));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_BWD__MATCH_PARAMETER_OPERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARAMETER_OPERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(Operation) arguments.get(2));
			return null;
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARAMETER_OPERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARAMETER_METHODDECLARATION_OPERATION_NAMEDELEMENT2NAMEDELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Parameter) arguments.get(1),
					(MethodDeclaration) arguments.get(2), (Operation) arguments.get(3),
					(NamedElement2NamedElement) arguments.get(4));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_BWD_EMOFLON_EDGE_313__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_313((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_FWD_EMOFLON_EDGE_323__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_323((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_SOLVE_CSP_CC__PARAMETER_METHODDECLARATION_OPERATION_TYPEACCESS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Parameter) arguments.get(0), (MethodDeclaration) arguments.get(1),
					(Operation) arguments.get(2), (TypeAccess) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_DEC_FWD__METHODDECLARATION_TYPEACCESS:
			return checkDEC_FWD((MethodDeclaration) arguments.get(0), (TypeAccess) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___CHECK_DEC_BWD__PARAMETER_OPERATION:
			return checkDEC_BWD((Parameter) arguments.get(0), (Operation) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___GENERATE_MODEL__RULEENTRYCONTAINER_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (NamedElement2NamedElement) arguments.get(1));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_METHODDECLARATION_OPERATION_NAMEDELEMENT2NAMEDELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(MethodDeclaration) arguments.get(1), (Operation) arguments.get(2),
					(NamedElement2NamedElement) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.TYPE_ACCESS2_RETURN_PARAM___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_1_initialbindings_blackBBBB(
			TypeAccess2ReturnParam _this, Match match, MethodDeclaration method, TypeAccess typeAccess) {
		return new Object[] { _this, match, method, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_2_SolveCSP_bindingFBBBB(TypeAccess2ReturnParam _this,
			Match match, MethodDeclaration method, TypeAccess typeAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, method, typeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, method, typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_2_SolveCSP_bindingAndBlackFBBBB(
			TypeAccess2ReturnParam _this, Match match, MethodDeclaration method, TypeAccess typeAccess) {
		Object[] result_pattern_TypeAccess2ReturnParam_0_2_SolveCSP_binding = pattern_TypeAccess2ReturnParam_0_2_SolveCSP_bindingFBBBB(
				_this, match, method, typeAccess);
		if (result_pattern_TypeAccess2ReturnParam_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_0_2_SolveCSP_black = pattern_TypeAccess2ReturnParam_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, method, typeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_0_3_CheckCSP_expressionFBB(TypeAccess2ReturnParam _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_4_collectelementstobetranslated_blackBBB(Match match,
			MethodDeclaration method, TypeAccess typeAccess) {
		return new Object[] { match, method, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MethodDeclaration method, TypeAccess typeAccess) {
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeAccess);
		String method__typeAccess____returnType_name_prime = "returnType";
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(method__typeAccess____returnType);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		return new Object[] { match, method, typeAccess, method__typeAccess____returnType };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_5_collectcontextelements_blackBBB(Match match,
			MethodDeclaration method, TypeAccess typeAccess) {
		return new Object[] { match, method, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_0_5_collectcontextelements_greenBB(Match match,
			MethodDeclaration method) {
		match.getContextNodes().add(method);
		return new Object[] { match, method };
	}

	public static final void pattern_TypeAccess2ReturnParam_0_6_registerobjectstomatch_expressionBBBB(
			TypeAccess2ReturnParam _this, Match match, MethodDeclaration method, TypeAccess typeAccess) {
		_this.registerObjectsToMatch_FWD(match, method, typeAccess);

	}

	public static final boolean pattern_TypeAccess2ReturnParam_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("operation");
		EObject _localVariable_2 = isApplicableMatch.getObject("m2o");
		EObject _localVariable_3 = isApplicableMatch.getObject("typeAccess");
		EObject tmpMethod = _localVariable_0;
		EObject tmpOperation = _localVariable_1;
		EObject tmpM2o = _localVariable_2;
		EObject tmpTypeAccess = _localVariable_3;
		if (tmpMethod instanceof MethodDeclaration) {
			MethodDeclaration method = (MethodDeclaration) tmpMethod;
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				if (tmpM2o instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement m2o = (NamedElement2NamedElement) tmpM2o;
					if (tmpTypeAccess instanceof TypeAccess) {
						TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
						return new Object[] { method, operation, m2o, typeAccess, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_1_performtransformation_blackBBBBFBB(
			MethodDeclaration method, Operation operation, NamedElement2NamedElement m2o, TypeAccess typeAccess,
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { method, operation, m2o, typeAccess, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_1_performtransformation_bindingAndBlackFFFFFBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding = pattern_TypeAccess2ReturnParam_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding != null) {
			MethodDeclaration method = (MethodDeclaration) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[0];
			Operation operation = (Operation) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[1];
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[2];
			TypeAccess typeAccess = (TypeAccess) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_binding[3];

			Object[] result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_black = pattern_TypeAccess2ReturnParam_1_1_performtransformation_blackBBBBFBB(
					method, operation, m2o, typeAccess, _this, isApplicableMatch);
			if (result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_1_1_performtransformation_black[4];

				return new Object[] { method, operation, m2o, typeAccess, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_1_performtransformation_greenFFBBB(
			Operation operation, TypeAccess typeAccess, CSP csp) {
		Parameter returnParam = UMLFactory.eINSTANCE.createParameter();
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Object _localVariable_0 = csp.getValue("returnParam", "direction");
		operation.getOwnedParameters().add(returnParam);
		ta2p.setTarget(returnParam);
		ta2p.setSource(typeAccess);
		ParameterDirectionKind returnParam_direction_prime = (ParameterDirectionKind) _localVariable_0;
		returnParam.setDirection(returnParam_direction_prime);
		return new Object[] { returnParam, ta2p, operation, typeAccess, csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_2_collecttranslatedelements_blackBBB(
			Parameter returnParam, TypeAccess2Parameter ta2p, TypeAccess typeAccess) {
		return new Object[] { returnParam, ta2p, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_2_collecttranslatedelements_greenFBBB(
			Parameter returnParam, TypeAccess2Parameter ta2p, TypeAccess typeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(returnParam);
		ruleresult.getCreatedLinkElements().add(ta2p);
		ruleresult.getTranslatedElements().add(typeAccess);
		return new Object[] { ruleresult, returnParam, ta2p, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject returnParam, EObject ta2p, EObject method, EObject operation,
			EObject m2o, EObject typeAccess) {
		if (!returnParam.equals(ta2p)) {
			if (!returnParam.equals(typeAccess)) {
				if (!ta2p.equals(typeAccess)) {
					if (!method.equals(returnParam)) {
						if (!method.equals(ta2p)) {
							if (!method.equals(operation)) {
								if (!method.equals(typeAccess)) {
									if (!operation.equals(returnParam)) {
										if (!operation.equals(ta2p)) {
											if (!operation.equals(typeAccess)) {
												if (!m2o.equals(returnParam)) {
													if (!m2o.equals(ta2p)) {
														if (!m2o.equals(method)) {
															if (!m2o.equals(operation)) {
																if (!m2o.equals(typeAccess)) {
																	return new Object[] { ruleresult, returnParam, ta2p,
																			method, operation, m2o, typeAccess };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeAccess2ReturnParam_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject returnParam, EObject ta2p, EObject method, EObject operation,
			EObject typeAccess) {
		EMoflonEdge ta2p__returnParam____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2ReturnParam";
		String ta2p__returnParam____target_name_prime = "target";
		String method__typeAccess____returnType_name_prime = "returnType";
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String ta2p__typeAccess____source_name_prime = "source";
		ta2p__returnParam____target.setSrc(ta2p);
		ta2p__returnParam____target.setTrg(returnParam);
		ruleresult.getCreatedEdges().add(ta2p__returnParam____target);
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(method__typeAccess____returnType);
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		ruleresult.getCreatedEdges().add(operation__returnParam____ownedParameter);
		ta2p__typeAccess____source.setSrc(ta2p);
		ta2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ta2p__typeAccess____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ta2p__returnParam____target.setName(ta2p__returnParam____target_name_prime);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		ta2p__typeAccess____source.setName(ta2p__typeAccess____source_name_prime);
		return new Object[] { ruleresult, returnParam, ta2p, method, operation, typeAccess, ta2p__returnParam____target,
				method__typeAccess____returnType, operation__returnParam____ownedParameter,
				ta2p__typeAccess____source };
	}

	public static final void pattern_TypeAccess2ReturnParam_1_5_registerobjects_expressionBBBBBBBB(
			TypeAccess2ReturnParam _this, PerformRuleResult ruleresult, EObject returnParam, EObject ta2p,
			EObject method, EObject operation, EObject m2o, EObject typeAccess) {
		_this.registerObjects_FWD(ruleresult, returnParam, ta2p, method, operation, m2o, typeAccess);

	}

	public static final PerformRuleResult pattern_TypeAccess2ReturnParam_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_bindingFB(
			TypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeAccess2ReturnParam _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccess2ReturnParam _this) {
		Object[] result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_binding = pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_black = pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccess2ReturnParam";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("method");
		EObject _localVariable_1 = match.getObject("typeAccess");
		EObject tmpMethod = _localVariable_0;
		EObject tmpTypeAccess = _localVariable_1;
		if (tmpMethod instanceof MethodDeclaration) {
			MethodDeclaration method = (MethodDeclaration) tmpMethod;
			if (tmpTypeAccess instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
				return new Object[] { method, typeAccess, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_2_2_corematch_blackBFFBB(
			MethodDeclaration method, TypeAccess typeAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement m2o : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(method,
				NamedElement2NamedElement.class, "source")) {
			NamedElement tmpOperation = m2o.getTarget();
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				_result.add(new Object[] { method, operation, m2o, typeAccess, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_2_3_findcontext_blackBBBB(
			MethodDeclaration method, Operation operation, NamedElement2NamedElement m2o, TypeAccess typeAccess) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (typeAccess.equals(method.getReturnType())) {
			if (method.equals(m2o.getSource())) {
				if (operation.equals(m2o.getTarget())) {
					_result.add(new Object[] { method, operation, m2o, typeAccess });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_3_findcontext_greenBBBBFFFF(MethodDeclaration method,
			Operation operation, NamedElement2NamedElement m2o, TypeAccess typeAccess) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String method__typeAccess____returnType_name_prime = "returnType";
		String m2o__method____source_name_prime = "source";
		String m2o__operation____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(m2o);
		isApplicableMatch.getAllContextElements().add(typeAccess);
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(method__typeAccess____returnType);
		m2o__method____source.setSrc(m2o);
		m2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(m2o__method____source);
		m2o__operation____target.setSrc(m2o);
		m2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(m2o__operation____target);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		m2o__method____source.setName(m2o__method____source_name_prime);
		m2o__operation____target.setName(m2o__operation____target_name_prime);
		return new Object[] { method, operation, m2o, typeAccess, isApplicableMatch, method__typeAccess____returnType,
				m2o__method____source, m2o__operation____target };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_4_solveCSP_bindingFBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, MethodDeclaration method,
			Operation operation, NamedElement2NamedElement m2o, TypeAccess typeAccess) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, method, operation, m2o, typeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, operation, m2o, typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_4_solveCSP_bindingAndBlackFBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, MethodDeclaration method,
			Operation operation, NamedElement2NamedElement m2o, TypeAccess typeAccess) {
		Object[] result_pattern_TypeAccess2ReturnParam_2_4_solveCSP_binding = pattern_TypeAccess2ReturnParam_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, method, operation, m2o, typeAccess);
		if (result_pattern_TypeAccess2ReturnParam_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_2_4_solveCSP_black = pattern_TypeAccess2ReturnParam_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, operation, m2o, typeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_2_5_checkCSP_expressionFBB(TypeAccess2ReturnParam _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccess2ReturnParam";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2ReturnParam_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_1_initialbindings_blackBBBB(
			TypeAccess2ReturnParam _this, Match match, Parameter returnParam, Operation operation) {
		return new Object[] { _this, match, returnParam, operation };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_2_SolveCSP_bindingFBBBB(TypeAccess2ReturnParam _this,
			Match match, Parameter returnParam, Operation operation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, returnParam, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, returnParam, operation };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_2_SolveCSP_bindingAndBlackFBBBB(
			TypeAccess2ReturnParam _this, Match match, Parameter returnParam, Operation operation) {
		Object[] result_pattern_TypeAccess2ReturnParam_10_2_SolveCSP_binding = pattern_TypeAccess2ReturnParam_10_2_SolveCSP_bindingFBBBB(
				_this, match, returnParam, operation);
		if (result_pattern_TypeAccess2ReturnParam_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_10_2_SolveCSP_black = pattern_TypeAccess2ReturnParam_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, returnParam, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_10_3_CheckCSP_expressionFBB(TypeAccess2ReturnParam _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_4_collectelementstobetranslated_blackBBB(Match match,
			Parameter returnParam, Operation operation) {
		return new Object[] { match, returnParam, operation };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Parameter returnParam, Operation operation) {
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(returnParam);
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		match.getToBeTranslatedEdges().add(operation__returnParam____ownedParameter);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		return new Object[] { match, returnParam, operation, operation__returnParam____ownedParameter };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_5_collectcontextelements_blackBBB(Match match,
			Parameter returnParam, Operation operation) {
		return new Object[] { match, returnParam, operation };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_10_5_collectcontextelements_greenBB(Match match,
			Operation operation) {
		match.getContextNodes().add(operation);
		return new Object[] { match, operation };
	}

	public static final void pattern_TypeAccess2ReturnParam_10_6_registerobjectstomatch_expressionBBBB(
			TypeAccess2ReturnParam _this, Match match, Parameter returnParam, Operation operation) {
		_this.registerObjectsToMatch_BWD(match, returnParam, operation);

	}

	public static final boolean pattern_TypeAccess2ReturnParam_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("returnParam");
		EObject _localVariable_1 = isApplicableMatch.getObject("method");
		EObject _localVariable_2 = isApplicableMatch.getObject("operation");
		EObject _localVariable_3 = isApplicableMatch.getObject("m2o");
		EObject tmpReturnParam = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		EObject tmpM2o = _localVariable_3;
		if (tmpReturnParam instanceof Parameter) {
			Parameter returnParam = (Parameter) tmpReturnParam;
			if (tmpMethod instanceof MethodDeclaration) {
				MethodDeclaration method = (MethodDeclaration) tmpMethod;
				if (tmpOperation instanceof Operation) {
					Operation operation = (Operation) tmpOperation;
					if (tmpM2o instanceof NamedElement2NamedElement) {
						NamedElement2NamedElement m2o = (NamedElement2NamedElement) tmpM2o;
						return new Object[] { returnParam, method, operation, m2o, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_1_performtransformation_blackBBBBFBB(
			Parameter returnParam, MethodDeclaration method, Operation operation, NamedElement2NamedElement m2o,
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { returnParam, method, operation, m2o, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_1_performtransformation_bindingAndBlackFFFFFBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding = pattern_TypeAccess2ReturnParam_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding != null) {
			Parameter returnParam = (Parameter) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[0];
			MethodDeclaration method = (MethodDeclaration) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[1];
			Operation operation = (Operation) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[2];
			NamedElement2NamedElement m2o = (NamedElement2NamedElement) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_binding[3];

			Object[] result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_black = pattern_TypeAccess2ReturnParam_11_1_performtransformation_blackBBBBFBB(
					returnParam, method, operation, m2o, _this, isApplicableMatch);
			if (result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_11_1_performtransformation_black[4];

				return new Object[] { returnParam, method, operation, m2o, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_1_performtransformation_greenBFBF(
			Parameter returnParam, MethodDeclaration method) {
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ta2p.setTarget(returnParam);
		method.setReturnType(typeAccess);
		ta2p.setSource(typeAccess);
		return new Object[] { returnParam, ta2p, method, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_2_collecttranslatedelements_blackBBB(
			Parameter returnParam, TypeAccess2Parameter ta2p, TypeAccess typeAccess) {
		return new Object[] { returnParam, ta2p, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_2_collecttranslatedelements_greenFBBB(
			Parameter returnParam, TypeAccess2Parameter ta2p, TypeAccess typeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(returnParam);
		ruleresult.getCreatedLinkElements().add(ta2p);
		ruleresult.getCreatedElements().add(typeAccess);
		return new Object[] { ruleresult, returnParam, ta2p, typeAccess };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject returnParam, EObject ta2p, EObject method, EObject operation,
			EObject m2o, EObject typeAccess) {
		if (!returnParam.equals(ta2p)) {
			if (!returnParam.equals(typeAccess)) {
				if (!ta2p.equals(typeAccess)) {
					if (!method.equals(returnParam)) {
						if (!method.equals(ta2p)) {
							if (!method.equals(operation)) {
								if (!method.equals(typeAccess)) {
									if (!operation.equals(returnParam)) {
										if (!operation.equals(ta2p)) {
											if (!operation.equals(typeAccess)) {
												if (!m2o.equals(returnParam)) {
													if (!m2o.equals(ta2p)) {
														if (!m2o.equals(method)) {
															if (!m2o.equals(operation)) {
																if (!m2o.equals(typeAccess)) {
																	return new Object[] { ruleresult, returnParam, ta2p,
																			method, operation, m2o, typeAccess };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeAccess2ReturnParam_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject returnParam, EObject ta2p, EObject method, EObject operation,
			EObject typeAccess) {
		EMoflonEdge ta2p__returnParam____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeAccess2ReturnParam";
		String ta2p__returnParam____target_name_prime = "target";
		String method__typeAccess____returnType_name_prime = "returnType";
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String ta2p__typeAccess____source_name_prime = "source";
		ta2p__returnParam____target.setSrc(ta2p);
		ta2p__returnParam____target.setTrg(returnParam);
		ruleresult.getCreatedEdges().add(ta2p__returnParam____target);
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(method__typeAccess____returnType);
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		ruleresult.getTranslatedEdges().add(operation__returnParam____ownedParameter);
		ta2p__typeAccess____source.setSrc(ta2p);
		ta2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ta2p__typeAccess____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ta2p__returnParam____target.setName(ta2p__returnParam____target_name_prime);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		ta2p__typeAccess____source.setName(ta2p__typeAccess____source_name_prime);
		return new Object[] { ruleresult, returnParam, ta2p, method, operation, typeAccess, ta2p__returnParam____target,
				method__typeAccess____returnType, operation__returnParam____ownedParameter,
				ta2p__typeAccess____source };
	}

	public static final void pattern_TypeAccess2ReturnParam_11_5_registerobjects_expressionBBBBBBBB(
			TypeAccess2ReturnParam _this, PerformRuleResult ruleresult, EObject returnParam, EObject ta2p,
			EObject method, EObject operation, EObject m2o, EObject typeAccess) {
		_this.registerObjects_BWD(ruleresult, returnParam, ta2p, method, operation, m2o, typeAccess);

	}

	public static final PerformRuleResult pattern_TypeAccess2ReturnParam_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_bindingFB(
			TypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeAccess2ReturnParam _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_bindingAndBlackFFB(
			TypeAccess2ReturnParam _this) {
		Object[] result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_binding = pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_black = pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeAccess2ReturnParam";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("returnParam");
		EObject _localVariable_1 = match.getObject("operation");
		EObject tmpReturnParam = _localVariable_0;
		EObject tmpOperation = _localVariable_1;
		if (tmpReturnParam instanceof Parameter) {
			Parameter returnParam = (Parameter) tmpReturnParam;
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				return new Object[] { returnParam, operation, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_12_2_corematch_blackBFBFB(
			Parameter returnParam, Operation operation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement m2o : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(operation, NamedElement2NamedElement.class, "target")) {
			org.eclipse.modisco.java.NamedElement tmpMethod = m2o.getSource();
			if (tmpMethod instanceof MethodDeclaration) {
				MethodDeclaration method = (MethodDeclaration) tmpMethod;
				_result.add(new Object[] { returnParam, method, operation, m2o, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_12_3_findcontext_blackBBBB(
			Parameter returnParam, MethodDeclaration method, Operation operation, NamedElement2NamedElement m2o) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (operation.getOwnedParameters().contains(returnParam)) {
			if (method.equals(m2o.getSource())) {
				if (operation.equals(m2o.getTarget())) {
					_result.add(new Object[] { returnParam, method, operation, m2o });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_3_findcontext_greenBBBBFFFF(Parameter returnParam,
			MethodDeclaration method, Operation operation, NamedElement2NamedElement m2o) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String m2o__method____source_name_prime = "source";
		String m2o__operation____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(returnParam);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(m2o);
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		isApplicableMatch.getAllContextElements().add(operation__returnParam____ownedParameter);
		m2o__method____source.setSrc(m2o);
		m2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(m2o__method____source);
		m2o__operation____target.setSrc(m2o);
		m2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(m2o__operation____target);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		m2o__method____source.setName(m2o__method____source_name_prime);
		m2o__operation____target.setName(m2o__operation____target_name_prime);
		return new Object[] { returnParam, method, operation, m2o, isApplicableMatch,
				operation__returnParam____ownedParameter, m2o__method____source, m2o__operation____target };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_4_solveCSP_bindingFBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, Parameter returnParam,
			MethodDeclaration method, Operation operation, NamedElement2NamedElement m2o) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, returnParam, method, operation, m2o);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, returnParam, method, operation, m2o };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_4_solveCSP_bindingAndBlackFBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, Parameter returnParam,
			MethodDeclaration method, Operation operation, NamedElement2NamedElement m2o) {
		Object[] result_pattern_TypeAccess2ReturnParam_12_4_solveCSP_binding = pattern_TypeAccess2ReturnParam_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, returnParam, method, operation, m2o);
		if (result_pattern_TypeAccess2ReturnParam_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_12_4_solveCSP_black = pattern_TypeAccess2ReturnParam_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, returnParam, method, operation, m2o };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_12_5_checkCSP_expressionFBB(TypeAccess2ReturnParam _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeAccess2ReturnParam";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2ReturnParam_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_bindingFB(
			TypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeAccess2ReturnParam _this) {
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

	public static final Object[] pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccess2ReturnParam _this) {
		Object[] result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_binding = pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_black = pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperation = _edge_ownedParameter.getSrc();
		if (tmpOperation instanceof Operation) {
			Operation operation = (Operation) tmpOperation;
			EObject tmpReturnParam = _edge_ownedParameter.getTrg();
			if (tmpReturnParam instanceof Parameter) {
				Parameter returnParam = (Parameter) tmpReturnParam;
				if (operation.getOwnedParameters().contains(returnParam)) {
					_result.add(new Object[] { returnParam, operation, _edge_ownedParameter });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2ReturnParam_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypeAccess2ReturnParam _this, Match match, Parameter returnParam, Operation operation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, returnParam, operation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccess2ReturnParam _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccess2ReturnParam_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_bindingFB(
			TypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeAccess2ReturnParam _this) {
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

	public static final Object[] pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeAccess2ReturnParam _this) {
		Object[] result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_binding = pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_black = pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_0B(
			TypeAccess typeAccess) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_498534 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_774695 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess typeAccess) {
		for (ArrayType __DEC_typeAccess_elementType_8125 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess typeAccess) {
		for (ClassDeclaration __DEC_typeAccess_superClass_829583 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess typeAccess) {
		for (ParameterizedType __DEC_typeAccess_type_875712 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAccess) {
		for (SingleVariableDeclaration __DEC_typeAccess_type_876210 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_499709 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess typeAccess) {
		for (ArrayInitializer __DEC_typeAccess_expressions_886780 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayInitializer.class, "expressions")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMethod = _edge_returnType.getSrc();
		if (tmpMethod instanceof MethodDeclaration) {
			MethodDeclaration method = (MethodDeclaration) tmpMethod;
			EObject tmpTypeAccess = _edge_returnType.getTrg();
			if (tmpTypeAccess instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
				if (typeAccess.equals(method.getReturnType())) {
					if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_0B(typeAccess) == null) {
						if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_1B(typeAccess) == null) {
							if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_2B(
									typeAccess) == null) {
								if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_3B(
										typeAccess) == null) {
									if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_4B(
											typeAccess) == null) {
										if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_5B(
												typeAccess) == null) {
											if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_6B(
													typeAccess) == null) {
												if (pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_7B(
														typeAccess) == null) {
													_result.add(new Object[] { method, typeAccess, _edge_returnType });
												}
											}
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

	public static final Object[] pattern_TypeAccess2ReturnParam_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeAccess2ReturnParam_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypeAccess2ReturnParam _this, Match match, MethodDeclaration method, TypeAccess typeAccess) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, method, typeAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeAccess2ReturnParam _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeAccess2ReturnParam_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_1_prepare_blackB(TypeAccess2ReturnParam _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("returnParam");
		EObject _localVariable_1 = sourceMatch.getObject("method");
		EObject _localVariable_2 = targetMatch.getObject("operation");
		EObject _localVariable_3 = sourceMatch.getObject("typeAccess");
		EObject tmpReturnParam = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		EObject tmpTypeAccess = _localVariable_3;
		if (tmpReturnParam instanceof Parameter) {
			Parameter returnParam = (Parameter) tmpReturnParam;
			if (tmpMethod instanceof MethodDeclaration) {
				MethodDeclaration method = (MethodDeclaration) tmpMethod;
				if (tmpOperation instanceof Operation) {
					Operation operation = (Operation) tmpOperation;
					if (tmpTypeAccess instanceof TypeAccess) {
						TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
						return new Object[] { returnParam, method, operation, typeAccess, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_blackBBBBBB(
			Parameter returnParam, MethodDeclaration method, Operation operation, TypeAccess typeAccess,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { returnParam, method, operation, typeAccess, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding = pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding != null) {
			Parameter returnParam = (Parameter) result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[0];
			MethodDeclaration method = (MethodDeclaration) result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[1];
			Operation operation = (Operation) result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[2];
			TypeAccess typeAccess = (TypeAccess) result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_black = pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_blackBBBBBB(
					returnParam, method, operation, typeAccess, sourceMatch, targetMatch);
			if (result_pattern_TypeAccess2ReturnParam_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { returnParam, method, operation, typeAccess, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_3_solvecsp_bindingFBBBBBBB(
			TypeAccess2ReturnParam _this, Parameter returnParam, MethodDeclaration method, Operation operation,
			TypeAccess typeAccess, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(returnParam, method, operation, typeAccess, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, returnParam, method, operation, typeAccess, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			TypeAccess2ReturnParam _this, Parameter returnParam, MethodDeclaration method, Operation operation,
			TypeAccess typeAccess, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeAccess2ReturnParam_24_3_solvecsp_binding = pattern_TypeAccess2ReturnParam_24_3_solvecsp_bindingFBBBBBBB(
				_this, returnParam, method, operation, typeAccess, sourceMatch, targetMatch);
		if (result_pattern_TypeAccess2ReturnParam_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_24_3_solvecsp_black = pattern_TypeAccess2ReturnParam_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, returnParam, method, operation, typeAccess, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_24_5_matchcorrcontext_blackBBFBB(
			MethodDeclaration method, Operation operation, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (NamedElement2NamedElement m2o : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(method, NamedElement2NamedElement.class, "source")) {
				if (operation.equals(m2o.getTarget())) {
					_result.add(new Object[] { method, operation, m2o, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_5_matchcorrcontext_greenBBBF(
			NamedElement2NamedElement m2o, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeAccess2ReturnParam";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(m2o);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { m2o, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_6_createcorrespondence_blackBBBBB(
			Parameter returnParam, MethodDeclaration method, Operation operation, TypeAccess typeAccess,
			CCMatch ccMatch) {
		return new Object[] { returnParam, method, operation, typeAccess, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_6_createcorrespondence_greenBFBB(
			Parameter returnParam, TypeAccess typeAccess, CCMatch ccMatch) {
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		ta2p.setTarget(returnParam);
		ta2p.setSource(typeAccess);
		ccMatch.getCreateCorr().add(ta2p);
		return new Object[] { returnParam, ta2p, typeAccess, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeAccess2ReturnParam";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeAccess2ReturnParam_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_0B(
			TypeAccess typeAccess) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_306091 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_628628 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_2B(
			TypeAccess typeAccess) {
		for (ArrayType __DEC_typeAccess_elementType_607470 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_3B(
			TypeAccess typeAccess) {
		for (ClassDeclaration __DEC_typeAccess_superClass_708027 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_4B(
			TypeAccess typeAccess) {
		for (ParameterizedType __DEC_typeAccess_type_66808 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAccess) {
		for (SingleVariableDeclaration __DEC_typeAccess_type_245056 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_785759 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_7B(
			TypeAccess typeAccess) {
		for (ArrayInitializer __DEC_typeAccess_expressions_501816 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayInitializer.class, "expressions")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_blackBB(MethodDeclaration method,
			TypeAccess typeAccess) {
		if (typeAccess.equals(method.getReturnType())) {
			if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_0B(typeAccess) == null) {
				if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_1B(typeAccess) == null) {
					if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_2B(typeAccess) == null) {
						if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_3B(typeAccess) == null) {
							if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_4B(typeAccess) == null) {
								if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_5B(
										typeAccess) == null) {
									if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_6B(
											typeAccess) == null) {
										if (pattern_TypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_7B(
												typeAccess) == null) {
											return new Object[] { method, typeAccess };
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

	public static final boolean pattern_TypeAccess2ReturnParam_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_28_1_matchtggpattern_blackBB(Parameter returnParam,
			Operation operation) {
		if (operation.getOwnedParameters().contains(returnParam)) {
			return new Object[] { returnParam, operation };
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_1_createresult_blackB(TypeAccess2ReturnParam _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MethodDeclaration method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement m2o) {
		if (ruleResult.getCorrObjects().contains(m2o)) {
			return new Object[] { ruleResult, m2o };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Operation operation) {
		if (ruleResult.getTargetObjects().contains(operation)) {
			return new Object[] { ruleResult, operation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList m2oList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpM2o : m2oList.getEntryObjects()) {
				if (tmpM2o instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement m2o = (NamedElement2NamedElement) tmpM2o;
					org.eclipse.modisco.java.NamedElement tmpMethod = m2o.getSource();
					if (tmpMethod instanceof MethodDeclaration) {
						MethodDeclaration method = (MethodDeclaration) tmpMethod;
						NamedElement tmpOperation = m2o.getTarget();
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							if (pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									m2o) == null) {
								if (pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										method) == null) {
									if (pattern_TypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											operation) == null) {
										_result.add(new Object[] { m2oList, method, m2o, operation, ruleEntryContainer,
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

	public static final Object[] pattern_TypeAccess2ReturnParam_29_3_solveCSP_bindingFBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, MethodDeclaration method,
			Operation operation, NamedElement2NamedElement m2o, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, method, operation, m2o, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, operation, m2o, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_3_solveCSP_bindingAndBlackFBBBBBB(
			TypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, MethodDeclaration method,
			Operation operation, NamedElement2NamedElement m2o, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeAccess2ReturnParam_29_3_solveCSP_binding = pattern_TypeAccess2ReturnParam_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, method, operation, m2o, ruleResult);
		if (result_pattern_TypeAccess2ReturnParam_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeAccess2ReturnParam_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeAccess2ReturnParam_29_3_solveCSP_black = pattern_TypeAccess2ReturnParam_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypeAccess2ReturnParam_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, operation, m2o, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeAccess2ReturnParam_29_4_checkCSP_expressionFBB(TypeAccess2ReturnParam _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_5_checknacs_blackBBB(MethodDeclaration method,
			Operation operation, NamedElement2NamedElement m2o) {
		return new Object[] { method, operation, m2o };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_6_perform_blackBBBB(MethodDeclaration method,
			Operation operation, NamedElement2NamedElement m2o, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { method, operation, m2o, ruleResult };
	}

	public static final Object[] pattern_TypeAccess2ReturnParam_29_6_perform_greenFFBBFBB(MethodDeclaration method,
			Operation operation, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Parameter returnParam = UMLFactory.eINSTANCE.createParameter();
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		Object _localVariable_0 = csp.getValue("returnParam", "direction");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		operation.getOwnedParameters().add(returnParam);
		ruleResult.getTargetObjects().add(returnParam);
		ta2p.setTarget(returnParam);
		ruleResult.getCorrObjects().add(ta2p);
		method.setReturnType(typeAccess);
		ta2p.setSource(typeAccess);
		ruleResult.getSourceObjects().add(typeAccess);
		ParameterDirectionKind returnParam_direction_prime = (ParameterDirectionKind) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		returnParam.setDirection(returnParam_direction_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { returnParam, ta2p, method, operation, typeAccess, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_TypeAccess2ReturnParam_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeAccess2ReturnParamImpl
