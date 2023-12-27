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
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MMethodDefinition;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.AbstractTypeAccess2ReturnParam;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Abstract Type Access2 Return Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AbstractTypeAccess2ReturnParamImpl extends AbstractRuleImpl implements AbstractTypeAccess2ReturnParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTypeAccess2ReturnParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAbstractTypeAccess2ReturnParam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MMethodDefinition method, TypeAccess typeAccess, Type jType) {

		Object[] result1_black = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_0_1_initialbindings_blackBBBBB(this, match, method, typeAccess,
						jType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[jType] = " + jType + ".");
		}

		Object[] result2_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, method,
						typeAccess, jType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[jType] = " + jType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_0_4_collectelementstobetranslated_blackBBBB(match, method,
							typeAccess, jType);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[method] = "
								+ method + ", " + "[typeAccess] = " + typeAccess + ", " + "[jType] = " + jType + ".");
			}
			AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							method, typeAccess, jType);
			//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];

			Object[] result5_black = AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_0_5_collectcontextelements_blackBBBB(match, method,
							typeAccess, jType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[method] = "
								+ method + ", " + "[typeAccess] = " + typeAccess + ", " + "[jType] = " + jType + ".");
			}
			AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_0_5_collectcontextelements_greenBBB(match, method, jType);

			// 
			AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_0_6_registerobjectstomatch_expressionBBBBB(this, match,
							method, typeAccess, jType);
			return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_0_7_expressionF();
		} else {
			return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[1];
		ASTNode2Element m2o = (ASTNode2Element) result1_bindingAndBlack[2];
		Operation operation = (Operation) result1_bindingAndBlack[3];
		MMethodDefinition method = (MMethodDefinition) result1_bindingAndBlack[4];
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[5];
		Type jType = (Type) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_greenFBFBBB(uType, operation,
						typeAccess, csp);
		Parameter returnParam = (Parameter) result1_green[0];
		TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result1_green[2];

		Object[] result2_black = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_1_2_collecttranslatedelements_blackBBB(returnParam, ta2p,
						typeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[returnParam] = " + returnParam
					+ ", " + "[ta2p] = " + ta2p + ", " + "[typeAccess] = " + typeAccess + ".");
		}
		Object[] result2_green = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_1_2_collecttranslatedelements_greenFBBB(returnParam, ta2p,
						typeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, ne2ne,
						returnParam, uType, ta2p, m2o, operation, method, typeAccess, jType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ne2ne] = " + ne2ne + ", " + "[returnParam] = " + returnParam + ", " + "[uType] = "
					+ uType + ", " + "[ta2p] = " + ta2p + ", " + "[m2o] = " + m2o + ", " + "[operation] = " + operation
					+ ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ", " + "[jType] = "
					+ jType + ".");
		}
		AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFF(ruleresult,
						returnParam, uType, ta2p, operation, method, typeAccess, jType);
		//nothing EMoflonEdge ta2p__returnParam____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge ta2p__typeAccess____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge returnParam__uType____type = (EMoflonEdge) result3_green[14];

		// 
		// 
		AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						ne2ne, returnParam, uType, ta2p, m2o, operation, method, typeAccess, jType);
		return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MMethodDefinition method = (MMethodDefinition) result2_binding[0];
		TypeAccess typeAccess = (TypeAccess) result2_binding[1];
		Type jType = (Type) result2_binding[2];
		for (Object[] result2_black : AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_2_2_corematch_blackFFFFBBBB(method, typeAccess, jType, match)) {
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[0];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[1];
			ASTNode2Element m2o = (ASTNode2Element) result2_black[2];
			Operation operation = (Operation) result2_black[3];
			// ForEach 
			for (Object[] result3_black : AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_2_3_findcontext_blackBBBBBBB(ne2ne, uType, m2o, operation,
							method, typeAccess, jType)) {
				Object[] result3_green = AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_2_3_findcontext_greenBBBBBBBFFFFFFFF(ne2ne, uType, m2o,
								operation, method, typeAccess, jType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge m2o__operation____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge m2o__method____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, ne2ne, uType, m2o, operation, method, typeAccess, jType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ne2ne] = " + ne2ne + ", "
							+ "[uType] = " + uType + ", " + "[m2o] = " + m2o + ", " + "[operation] = " + operation
							+ ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ", "
							+ "[jType] = " + jType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AbstractTypeAccess2ReturnParamImpl
							.pattern_AbstractTypeAccess2ReturnParam_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AbstractTypeAccess2ReturnParamImpl
							.pattern_AbstractTypeAccess2ReturnParam_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MMethodDefinition method, TypeAccess typeAccess, Type jType) {
		match.registerObject("method", method);
		match.registerObject("typeAccess", typeAccess);
		match.registerObject("jType", jType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MMethodDefinition method, TypeAccess typeAccess, Type jType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation, MMethodDefinition method,
			TypeAccess typeAccess, Type jType) {// Create CSP
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
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("m2o", m2o);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("jType", jType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject ne2ne, EObject returnParam, EObject uType,
			EObject ta2p, EObject m2o, EObject operation, EObject method, EObject typeAccess, EObject jType) {
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("returnParam", returnParam);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("ta2p", ta2p);
		ruleresult.registerObject("m2o", m2o);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("jType", jType);

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
	public boolean isAppropriate_BWD(Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType,
			Operation operation) {

		Object[] result1_black = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_10_1_initialbindings_blackBBBBB(this, match, returnParam, uType,
						operation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[returnParam] = " + returnParam + ", " + "[uType] = " + uType
					+ ", " + "[operation] = " + operation + ".");
		}

		Object[] result2_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, returnParam,
						uType, operation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[returnParam] = " + returnParam + ", " + "[uType] = " + uType
					+ ", " + "[operation] = " + operation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_10_4_collectelementstobetranslated_blackBBBB(match,
							returnParam, uType, operation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[returnParam] = " + returnParam + ", " + "[uType] = " + uType + ", " + "[operation] = "
						+ operation + ".");
			}
			AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_10_4_collectelementstobetranslated_greenBBBBFF(match,
							returnParam, uType, operation);
			//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge returnParam__uType____type = (EMoflonEdge) result4_green[5];

			Object[] result5_black = AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_10_5_collectcontextelements_blackBBBB(match, returnParam,
							uType, operation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[returnParam] = " + returnParam + ", " + "[uType] = " + uType + ", " + "[operation] = "
						+ operation + ".");
			}
			AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_10_5_collectcontextelements_greenBBB(match, uType,
							operation);

			// 
			AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							returnParam, uType, operation);
			return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_10_7_expressionF();
		} else {
			return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[0];
		Parameter returnParam = (Parameter) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[2];
		ASTNode2Element m2o = (ASTNode2Element) result1_bindingAndBlack[3];
		Operation operation = (Operation) result1_bindingAndBlack[4];
		MMethodDefinition method = (MMethodDefinition) result1_bindingAndBlack[5];
		Type jType = (Type) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_greenBFBFB(returnParam, method,
						jType);
		TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result1_green[1];
		TypeAccess typeAccess = (TypeAccess) result1_green[3];

		Object[] result2_black = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_11_2_collecttranslatedelements_blackBBB(returnParam, ta2p,
						typeAccess);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[returnParam] = " + returnParam
					+ ", " + "[ta2p] = " + ta2p + ", " + "[typeAccess] = " + typeAccess + ".");
		}
		Object[] result2_green = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_11_2_collecttranslatedelements_greenFBBB(returnParam, ta2p,
						typeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_11_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, ne2ne,
						returnParam, uType, ta2p, m2o, operation, method, typeAccess, jType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ne2ne] = " + ne2ne + ", " + "[returnParam] = " + returnParam + ", " + "[uType] = "
					+ uType + ", " + "[ta2p] = " + ta2p + ", " + "[m2o] = " + m2o + ", " + "[operation] = " + operation
					+ ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ", " + "[jType] = "
					+ jType + ".");
		}
		AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFF(ruleresult,
						returnParam, uType, ta2p, operation, method, typeAccess, jType);
		//nothing EMoflonEdge ta2p__returnParam____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge method__typeAccess____returnType = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge ta2p__typeAccess____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge returnParam__uType____type = (EMoflonEdge) result3_green[14];

		// 
		// 
		AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
						ne2ne, returnParam, uType, ta2p, m2o, operation, method, typeAccess, jType);
		return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Parameter returnParam = (Parameter) result2_binding[0];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_binding[1];
		Operation operation = (Operation) result2_binding[2];
		for (Object[] result2_black : AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_12_2_corematch_blackFBBFBFFB(returnParam, uType, operation,
						match)) {
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[0];
			ASTNode2Element m2o = (ASTNode2Element) result2_black[3];
			MMethodDefinition method = (MMethodDefinition) result2_black[5];
			Type jType = (Type) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_12_3_findcontext_blackBBBBBBB(ne2ne, returnParam, uType,
							m2o, operation, method, jType)) {
				Object[] result3_green = AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_12_3_findcontext_greenBBBBBBBFFFFFFF(ne2ne, returnParam,
								uType, m2o, operation, method, jType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge m2o__operation____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge operation__returnParam____ownedParameter = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge m2o__method____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge returnParam__uType____type = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, ne2ne, returnParam, uType, m2o, operation, method, jType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ne2ne] = " + ne2ne + ", "
							+ "[returnParam] = " + returnParam + ", " + "[uType] = " + uType + ", " + "[m2o] = " + m2o
							+ ", " + "[operation] = " + operation + ", " + "[method] = " + method + ", " + "[jType] = "
							+ jType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AbstractTypeAccess2ReturnParamImpl
							.pattern_AbstractTypeAccess2ReturnParam_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AbstractTypeAccess2ReturnParamImpl
							.pattern_AbstractTypeAccess2ReturnParam_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		match.registerObject("returnParam", returnParam);
		match.registerObject("uType", uType);
		match.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType,
			Operation operation) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Parameter returnParam, org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation,
			MMethodDefinition method, Type jType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("returnParam", returnParam);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("m2o", m2o);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("jType", jType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject ne2ne, EObject returnParam, EObject uType,
			EObject ta2p, EObject m2o, EObject operation, EObject method, EObject typeAccess, EObject jType) {
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("returnParam", returnParam);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("ta2p", ta2p);
		ruleresult.registerObject("m2o", m2o);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("jType", jType);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_23(EMoflonEdge _edge_ownedParameter) {

		Object[] result1_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_20_2_testcorematchandDECs_blackFFFB(_edge_ownedParameter)) {
			Parameter returnParam = (Parameter) result2_black[0];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[1];
			Operation operation = (Operation) result2_black[2];
			Object[] result2_green = AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, returnParam, uType, operation)) {
				// 
				if (AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AbstractTypeAccess2ReturnParamImpl
							.pattern_AbstractTypeAccess2ReturnParam_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AbstractTypeAccess2ReturnParamImpl
							.pattern_AbstractTypeAccess2ReturnParam_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_27(EMoflonEdge _edge_returnType) {

		Object[] result1_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_blackFFFB(_edge_returnType)) {
			MMethodDefinition method = (MMethodDefinition) result2_black[0];
			TypeAccess typeAccess = (TypeAccess) result2_black[1];
			Type jType = (Type) result2_black[2];
			Object[] result2_green = AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, method, typeAccess, jType)) {
				// 
				if (AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AbstractTypeAccess2ReturnParamImpl
							.pattern_AbstractTypeAccess2ReturnParam_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AbstractTypeAccess2ReturnParamImpl
							.pattern_AbstractTypeAccess2ReturnParam_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AbstractTypeAccess2ReturnParam");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam", true, csp);
		var_returnParam_direction.setValue(__helper.getValue("returnParam", "direction"));
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		IsReturn isReturn0 = new IsReturn();
		csp.getConstraints().add(isReturn0);

		isReturn0.setRuleName("AbstractTypeAccess2ReturnParam");
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
		ruleResult.setRule("AbstractTypeAccess2ReturnParam");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_returnParam_direction = CSPFactoryHelper.eINSTANCE.createVariable("returnParam", true, csp);
		var_returnParam_direction.setValue(__helper.getValue("returnParam", "direction"));
		var_returnParam_direction.setType("uml.ParameterDirectionKind");

		IsReturn isReturn0 = new IsReturn();
		csp.getConstraints().add(isReturn0);

		isReturn0.setRuleName("AbstractTypeAccess2ReturnParam");
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

		Object[] result1_black = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Parameter returnParam = (Parameter) result2_bindingAndBlack[0];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_bindingAndBlack[1];
		Operation operation = (Operation) result2_bindingAndBlack[2];
		MMethodDefinition method = (MMethodDefinition) result2_bindingAndBlack[3];
		TypeAccess typeAccess = (TypeAccess) result2_bindingAndBlack[4];
		Type jType = (Type) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, returnParam,
						uType, operation, method, typeAccess, jType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[returnParam] = " + returnParam + ", " + "[uType] = " + uType + ", " + "[operation] = "
					+ operation + ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ", "
					+ "[jType] = " + jType + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_24_5_matchcorrcontext_blackFBFBBBBB(uType, operation,
							method, jType, sourceMatch, targetMatch)) {
				ASTNode2Element ne2ne = (ASTNode2Element) result5_black[0];
				ASTNode2Element m2o = (ASTNode2Element) result5_black[2];
				Object[] result5_green = AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_24_5_matchcorrcontext_greenBBBBF(ne2ne, m2o,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_24_6_createcorrespondence_blackBBBBBBB(returnParam,
								uType, operation, method, typeAccess, jType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[returnParam] = "
							+ returnParam + ", " + "[uType] = " + uType + ", " + "[operation] = " + operation + ", "
							+ "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ", " + "[jType] = "
							+ jType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_24_6_createcorrespondence_greenBFBB(returnParam,
								typeAccess, ccMatch);
				//nothing TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result6_green[1];

				Object[] result7_black = AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Parameter returnParam, org.eclipse.uml2.uml.Type uType, Operation operation,
			MMethodDefinition method, TypeAccess typeAccess, Type jType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MMethodDefinition method, TypeAccess typeAccess, Type jType) {// 
		Object[] result1_black = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_blackBBB(method, typeAccess, jType);
		if (result1_black != null) {
			return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_27_2_expressionF();
		} else {
			return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Parameter returnParam, org.eclipse.uml2.uml.Type uType, Operation operation) {// 
		Object[] result1_black = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_28_1_matchtggpattern_blackBBB(returnParam, uType, operation);
		if (result1_black != null) {
			return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_28_2_expressionF();
		} else {
			return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element ne2neParameter,
			ASTNode2Element m2oParameter) {

		Object[] result1_black = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AbstractTypeAccess2ReturnParamImpl
				.pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList ne2neList = (RuleEntryList) result2_black[0];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[2];
			Type jType = (Type) result2_black[3];
			//nothing RuleEntryList m2oList = (RuleEntryList) result2_black[4];
			ASTNode2Element m2o = (ASTNode2Element) result2_black[5];
			Operation operation = (Operation) result2_black[6];
			MMethodDefinition method = (MMethodDefinition) result2_black[7];

			Object[] result3_bindingAndBlack = AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, ne2ne, uType, m2o, operation, method, jType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ne2ne] = " + ne2ne + ", "
						+ "[uType] = " + uType + ", " + "[m2o] = " + m2o + ", " + "[operation] = " + operation + ", "
						+ "[method] = " + method + ", " + "[jType] = " + jType + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AbstractTypeAccess2ReturnParamImpl
					.pattern_AbstractTypeAccess2ReturnParam_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AbstractTypeAccess2ReturnParamImpl
						.pattern_AbstractTypeAccess2ReturnParam_29_5_checknacs_blackBBBBBB(ne2ne, uType, m2o, operation,
								method, jType);
				if (result5_black != null) {

					Object[] result6_black = AbstractTypeAccess2ReturnParamImpl
							.pattern_AbstractTypeAccess2ReturnParam_29_6_perform_blackBBBBBBB(ne2ne, uType, m2o,
									operation, method, jType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ne2ne] = " + ne2ne
								+ ", " + "[uType] = " + uType + ", " + "[m2o] = " + m2o + ", " + "[operation] = "
								+ operation + ", " + "[method] = " + method + ", " + "[jType] = " + jType + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					AbstractTypeAccess2ReturnParamImpl
							.pattern_AbstractTypeAccess2ReturnParam_29_6_perform_greenFBFBBFBBB(uType, operation,
									method, jType, ruleResult, csp);
					//nothing Parameter returnParam = (Parameter) result6_green[0];
					//nothing TypeAccess2Parameter ta2p = (TypeAccess2Parameter) result6_green[2];
					//nothing TypeAccess typeAccess = (TypeAccess) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return AbstractTypeAccess2ReturnParamImpl.pattern_AbstractTypeAccess2ReturnParam_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation, MMethodDefinition method,
			Type jType, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("m2o", m2o);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("jType", jType);
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
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3));
			return null;
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MMETHODDEFINITION_TYPEACCESS_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MMethodDefinition) arguments.get(1),
					(TypeAccess) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_TYPE_ASTNODE2ELEMENT_OPERATION_MMETHODDEFINITION_TYPEACCESS_TYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(Operation) arguments.get(4), (MMethodDefinition) arguments.get(5), (TypeAccess) arguments.get(6),
					(Type) arguments.get(7));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_BWD__MATCH_PARAMETER_TYPE_OPERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARAMETER_TYPE_OPERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (Operation) arguments.get(3));
			return null;
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARAMETER_TYPE_OPERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_PARAMETER_TYPE_ASTNODE2ELEMENT_OPERATION_MMETHODDEFINITION_TYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(Parameter) arguments.get(2), (org.eclipse.uml2.uml.Type) arguments.get(3),
					(ASTNode2Element) arguments.get(4), (Operation) arguments.get(5),
					(MMethodDefinition) arguments.get(6), (Type) arguments.get(7));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_BWD_EMOFLON_EDGE_23__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_23((EMoflonEdge) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPROPRIATE_FWD_EMOFLON_EDGE_27__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_27((EMoflonEdge) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_SOLVE_CSP_CC__PARAMETER_TYPE_OPERATION_MMETHODDEFINITION_TYPEACCESS_TYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Parameter) arguments.get(0), (org.eclipse.uml2.uml.Type) arguments.get(1),
					(Operation) arguments.get(2), (MMethodDefinition) arguments.get(3), (TypeAccess) arguments.get(4),
					(Type) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___CHECK_DEC_FWD__MMETHODDEFINITION_TYPEACCESS_TYPE:
			return checkDEC_FWD((MMethodDefinition) arguments.get(0), (TypeAccess) arguments.get(1),
					(Type) arguments.get(2));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___CHECK_DEC_BWD__PARAMETER_TYPE_OPERATION:
			return checkDEC_BWD((Parameter) arguments.get(0), (org.eclipse.uml2.uml.Type) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_TYPE_ASTNODE2ELEMENT_OPERATION_MMETHODDEFINITION_TYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (ASTNode2Element) arguments.get(3),
					(Operation) arguments.get(4), (MMethodDefinition) arguments.get(5), (Type) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.ABSTRACT_TYPE_ACCESS2_RETURN_PARAM___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_0_1_initialbindings_blackBBBBB(
			AbstractTypeAccess2ReturnParam _this, Match match, MMethodDefinition method, TypeAccess typeAccess,
			Type jType) {
		return new Object[] { _this, match, method, typeAccess, jType };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_bindingFBBBBB(
			AbstractTypeAccess2ReturnParam _this, Match match, MMethodDefinition method, TypeAccess typeAccess,
			Type jType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, method, typeAccess, jType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, method, typeAccess, jType };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_bindingAndBlackFBBBBB(
			AbstractTypeAccess2ReturnParam _this, Match match, MMethodDefinition method, TypeAccess typeAccess,
			Type jType) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_binding = pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_bindingFBBBBB(
				_this, match, method, typeAccess, jType);
		if (result_pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_black = pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AbstractTypeAccess2ReturnParam_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, method, typeAccess, jType };
			}
		}
		return null;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_0_3_CheckCSP_expressionFBB(
			AbstractTypeAccess2ReturnParam _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_0_4_collectelementstobetranslated_blackBBBB(
			Match match, MMethodDefinition method, TypeAccess typeAccess, Type jType) {
		return new Object[] { match, method, typeAccess, jType };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, MMethodDefinition method, TypeAccess typeAccess, Type jType) {
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeAccess);
		String method__typeAccess____returnType_name_prime = "returnType";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(method__typeAccess____returnType);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		match.getToBeTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, method, typeAccess, jType, method__typeAccess____returnType,
				typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_0_5_collectcontextelements_blackBBBB(
			Match match, MMethodDefinition method, TypeAccess typeAccess, Type jType) {
		return new Object[] { match, method, typeAccess, jType };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_0_5_collectcontextelements_greenBBB(Match match,
			MMethodDefinition method, Type jType) {
		match.getContextNodes().add(method);
		match.getContextNodes().add(jType);
		return new Object[] { match, method, jType };
	}

	public static final void pattern_AbstractTypeAccess2ReturnParam_0_6_registerobjectstomatch_expressionBBBBB(
			AbstractTypeAccess2ReturnParam _this, Match match, MMethodDefinition method, TypeAccess typeAccess,
			Type jType) {
		_this.registerObjectsToMatch_FWD(match, method, typeAccess, jType);

	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_1 = isApplicableMatch.getObject("uType");
		EObject _localVariable_2 = isApplicableMatch.getObject("m2o");
		EObject _localVariable_3 = isApplicableMatch.getObject("operation");
		EObject _localVariable_4 = isApplicableMatch.getObject("method");
		EObject _localVariable_5 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("jType");
		EObject tmpNe2ne = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpM2o = _localVariable_2;
		EObject tmpOperation = _localVariable_3;
		EObject tmpMethod = _localVariable_4;
		EObject tmpTypeAccess = _localVariable_5;
		EObject tmpJType = _localVariable_6;
		if (tmpNe2ne instanceof ASTNode2Element) {
			ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
			if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
				org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
				if (tmpM2o instanceof ASTNode2Element) {
					ASTNode2Element m2o = (ASTNode2Element) tmpM2o;
					if (tmpOperation instanceof Operation) {
						Operation operation = (Operation) tmpOperation;
						if (tmpMethod instanceof MMethodDefinition) {
							MMethodDefinition method = (MMethodDefinition) tmpMethod;
							if (tmpTypeAccess instanceof TypeAccess) {
								TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
								if (tmpJType instanceof Type) {
									Type jType = (Type) tmpJType;
									return new Object[] { ne2ne, uType, m2o, operation, method, typeAccess, jType,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_blackBBBBBBBFBB(
			ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation,
			MMethodDefinition method, TypeAccess typeAccess, Type jType, AbstractTypeAccess2ReturnParam _this,
			IsApplicableMatch isApplicableMatch) {
		if (!m2o.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { ne2ne, uType, m2o, operation, method, typeAccess, jType, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AbstractTypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_binding = pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_binding != null) {
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_binding[1];
			ASTNode2Element m2o = (ASTNode2Element) result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_binding[2];
			Operation operation = (Operation) result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_binding[3];
			MMethodDefinition method = (MMethodDefinition) result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_binding[4];
			TypeAccess typeAccess = (TypeAccess) result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_binding[5];
			Type jType = (Type) result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_binding[6];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_black = pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_blackBBBBBBBFBB(
					ne2ne, uType, m2o, operation, method, typeAccess, jType, _this, isApplicableMatch);
			if (result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_black[7];

				return new Object[] { ne2ne, uType, m2o, operation, method, typeAccess, jType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_1_1_performtransformation_greenFBFBBB(
			org.eclipse.uml2.uml.Type uType, Operation operation, TypeAccess typeAccess, CSP csp) {
		Parameter returnParam = UMLFactory.eINSTANCE.createParameter();
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Object _localVariable_0 = csp.getValue("returnParam", "direction");
		operation.getOwnedParameters().add(returnParam);
		returnParam.setType(uType);
		ta2p.setTarget(returnParam);
		ta2p.setSource(typeAccess);
		ParameterDirectionKind returnParam_direction_prime = (ParameterDirectionKind) _localVariable_0;
		returnParam.setDirection(returnParam_direction_prime);
		return new Object[] { returnParam, uType, ta2p, operation, typeAccess, csp };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_1_2_collecttranslatedelements_blackBBB(
			Parameter returnParam, TypeAccess2Parameter ta2p, TypeAccess typeAccess) {
		return new Object[] { returnParam, ta2p, typeAccess };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_1_2_collecttranslatedelements_greenFBBB(
			Parameter returnParam, TypeAccess2Parameter ta2p, TypeAccess typeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(returnParam);
		ruleresult.getCreatedLinkElements().add(ta2p);
		ruleresult.getTranslatedElements().add(typeAccess);
		return new Object[] { ruleresult, returnParam, ta2p, typeAccess };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ne2ne, EObject returnParam, EObject uType, EObject ta2p, EObject m2o,
			EObject operation, EObject method, EObject typeAccess, EObject jType) {
		if (!ne2ne.equals(returnParam)) {
			if (!ne2ne.equals(uType)) {
				if (!ne2ne.equals(ta2p)) {
					if (!ne2ne.equals(operation)) {
						if (!ne2ne.equals(typeAccess)) {
							if (!returnParam.equals(uType)) {
								if (!returnParam.equals(ta2p)) {
									if (!returnParam.equals(typeAccess)) {
										if (!ta2p.equals(uType)) {
											if (!ta2p.equals(typeAccess)) {
												if (!m2o.equals(ne2ne)) {
													if (!m2o.equals(returnParam)) {
														if (!m2o.equals(uType)) {
															if (!m2o.equals(ta2p)) {
																if (!m2o.equals(operation)) {
																	if (!m2o.equals(method)) {
																		if (!m2o.equals(typeAccess)) {
																			if (!operation.equals(returnParam)) {
																				if (!operation.equals(uType)) {
																					if (!operation.equals(ta2p)) {
																						if (!operation
																								.equals(typeAccess)) {
																							if (!method.equals(ne2ne)) {
																								if (!method.equals(
																										returnParam)) {
																									if (!method.equals(
																											uType)) {
																										if (!method
																												.equals(ta2p)) {
																											if (!method
																													.equals(operation)) {
																												if (!method
																														.equals(typeAccess)) {
																													if (!typeAccess
																															.equals(uType)) {
																														if (!jType
																																.equals(ne2ne)) {
																															if (!jType
																																	.equals(returnParam)) {
																																if (!jType
																																		.equals(uType)) {
																																	if (!jType
																																			.equals(ta2p)) {
																																		if (!jType
																																				.equals(m2o)) {
																																			if (!jType
																																					.equals(operation)) {
																																				if (!jType
																																						.equals(method)) {
																																					if (!jType
																																							.equals(typeAccess)) {
																																						return new Object[] {
																																								ruleresult,
																																								ne2ne,
																																								returnParam,
																																								uType,
																																								ta2p,
																																								m2o,
																																								operation,
																																								method,
																																								typeAccess,
																																								jType };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject returnParam, EObject uType, EObject ta2p, EObject operation,
			EObject method, EObject typeAccess, EObject jType) {
		EMoflonEdge ta2p__returnParam____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge returnParam__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AbstractTypeAccess2ReturnParam";
		String ta2p__returnParam____target_name_prime = "target";
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String method__typeAccess____returnType_name_prime = "returnType";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ta2p__typeAccess____source_name_prime = "source";
		String returnParam__uType____type_name_prime = "type";
		ta2p__returnParam____target.setSrc(ta2p);
		ta2p__returnParam____target.setTrg(returnParam);
		ruleresult.getCreatedEdges().add(ta2p__returnParam____target);
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		ruleresult.getCreatedEdges().add(operation__returnParam____ownedParameter);
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(method__typeAccess____returnType);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		ta2p__typeAccess____source.setSrc(ta2p);
		ta2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ta2p__typeAccess____source);
		returnParam__uType____type.setSrc(returnParam);
		returnParam__uType____type.setTrg(uType);
		ruleresult.getCreatedEdges().add(returnParam__uType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ta2p__returnParam____target.setName(ta2p__returnParam____target_name_prime);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		ta2p__typeAccess____source.setName(ta2p__typeAccess____source_name_prime);
		returnParam__uType____type.setName(returnParam__uType____type_name_prime);
		return new Object[] { ruleresult, returnParam, uType, ta2p, operation, method, typeAccess, jType,
				ta2p__returnParam____target, operation__returnParam____ownedParameter, method__typeAccess____returnType,
				typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess, ta2p__typeAccess____source,
				returnParam__uType____type };
	}

	public static final void pattern_AbstractTypeAccess2ReturnParam_1_5_registerobjects_expressionBBBBBBBBBBB(
			AbstractTypeAccess2ReturnParam _this, PerformRuleResult ruleresult, EObject ne2ne, EObject returnParam,
			EObject uType, EObject ta2p, EObject m2o, EObject operation, EObject method, EObject typeAccess,
			EObject jType) {
		_this.registerObjects_FWD(ruleresult, ne2ne, returnParam, uType, ta2p, m2o, operation, method, typeAccess,
				jType);

	}

	public static final PerformRuleResult pattern_AbstractTypeAccess2ReturnParam_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_bindingFB(
			AbstractTypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AbstractTypeAccess2ReturnParam _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_bindingAndBlackFFB(
			AbstractTypeAccess2ReturnParam _this) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_binding = pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_black = pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AbstractTypeAccess2ReturnParam";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("method");
		EObject _localVariable_1 = match.getObject("typeAccess");
		EObject _localVariable_2 = match.getObject("jType");
		EObject tmpMethod = _localVariable_0;
		EObject tmpTypeAccess = _localVariable_1;
		EObject tmpJType = _localVariable_2;
		if (tmpMethod instanceof MMethodDefinition) {
			MMethodDefinition method = (MMethodDefinition) tmpMethod;
			if (tmpTypeAccess instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
				if (tmpJType instanceof Type) {
					Type jType = (Type) tmpJType;
					return new Object[] { method, typeAccess, jType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AbstractTypeAccess2ReturnParam_2_2_corematch_blackFFFFBBBB(
			MMethodDefinition method, TypeAccess typeAccess, Type jType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element m2o : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(method,
				ASTNode2Element.class, "source")) {
			Element tmpOperation = m2o.getTarget();
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jType,
						ASTNode2Element.class, "source")) {
					if (!m2o.equals(ne2ne)) {
						Element tmpUType = ne2ne.getTarget();
						if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
							org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
							_result.add(
									new Object[] { ne2ne, uType, m2o, operation, method, typeAccess, jType, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AbstractTypeAccess2ReturnParam_2_3_findcontext_blackBBBBBBB(
			ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation,
			MMethodDefinition method, TypeAccess typeAccess, Type jType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!m2o.equals(ne2ne)) {
			if (uType.equals(ne2ne.getTarget())) {
				if (operation.equals(m2o.getTarget())) {
					if (typeAccess.equals(method.getReturnType())) {
						if (jType.equals(typeAccess.getType())) {
							if (method.equals(m2o.getSource())) {
								if (jType.equals(ne2ne.getSource())) {
									_result.add(
											new Object[] { ne2ne, uType, m2o, operation, method, typeAccess, jType });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation,
			MMethodDefinition method, TypeAccess typeAccess, Type jType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2ne__uType____target_name_prime = "target";
		String m2o__operation____target_name_prime = "target";
		String method__typeAccess____returnType_name_prime = "returnType";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String m2o__method____source_name_prime = "source";
		String ne2ne__jType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(m2o);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(jType);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		m2o__operation____target.setSrc(m2o);
		m2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(m2o__operation____target);
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(method__typeAccess____returnType);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(jType__typeAccess____usagesInTypeAccess);
		m2o__method____source.setSrc(m2o);
		m2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(m2o__method____source);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		m2o__operation____target.setName(m2o__operation____target_name_prime);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		m2o__method____source.setName(m2o__method____source_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		return new Object[] { ne2ne, uType, m2o, operation, method, typeAccess, jType, isApplicableMatch,
				ne2ne__uType____target, m2o__operation____target, method__typeAccess____returnType,
				typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess, m2o__method____source,
				ne2ne__jType____source };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_bindingFBBBBBBBBB(
			AbstractTypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation, MMethodDefinition method,
			TypeAccess typeAccess, Type jType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, ne2ne, uType, m2o, operation, method,
				typeAccess, jType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ne2ne, uType, m2o, operation, method, typeAccess,
					jType };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AbstractTypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation, MMethodDefinition method,
			TypeAccess typeAccess, Type jType) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_binding = pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, ne2ne, uType, m2o, operation, method, typeAccess, jType);
		if (result_pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_binding[0];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_black = pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AbstractTypeAccess2ReturnParam_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ne2ne, uType, m2o, operation, method, typeAccess,
						jType };
			}
		}
		return null;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_2_5_checkCSP_expressionFBB(
			AbstractTypeAccess2ReturnParam _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AbstractTypeAccess2ReturnParam";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AbstractTypeAccess2ReturnParam_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_10_1_initialbindings_blackBBBBB(
			AbstractTypeAccess2ReturnParam _this, Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		return new Object[] { _this, match, returnParam, uType, operation };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_bindingFBBBBB(
			AbstractTypeAccess2ReturnParam _this, Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, returnParam, uType, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, returnParam, uType, operation };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_bindingAndBlackFBBBBB(
			AbstractTypeAccess2ReturnParam _this, Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_binding = pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_bindingFBBBBB(
				_this, match, returnParam, uType, operation);
		if (result_pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_black = pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AbstractTypeAccess2ReturnParam_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, returnParam, uType, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_10_3_CheckCSP_expressionFBB(
			AbstractTypeAccess2ReturnParam _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_10_4_collectelementstobetranslated_blackBBBB(
			Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType, Operation operation) {
		return new Object[] { match, returnParam, uType, operation };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType, Operation operation) {
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge returnParam__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(returnParam);
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String returnParam__uType____type_name_prime = "type";
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		match.getToBeTranslatedEdges().add(operation__returnParam____ownedParameter);
		returnParam__uType____type.setSrc(returnParam);
		returnParam__uType____type.setTrg(uType);
		match.getToBeTranslatedEdges().add(returnParam__uType____type);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		returnParam__uType____type.setName(returnParam__uType____type_name_prime);
		return new Object[] { match, returnParam, uType, operation, operation__returnParam____ownedParameter,
				returnParam__uType____type };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_10_5_collectcontextelements_blackBBBB(
			Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType, Operation operation) {
		return new Object[] { match, returnParam, uType, operation };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_10_5_collectcontextelements_greenBBB(
			Match match, org.eclipse.uml2.uml.Type uType, Operation operation) {
		match.getContextNodes().add(uType);
		match.getContextNodes().add(operation);
		return new Object[] { match, uType, operation };
	}

	public static final void pattern_AbstractTypeAccess2ReturnParam_10_6_registerobjectstomatch_expressionBBBBB(
			AbstractTypeAccess2ReturnParam _this, Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		_this.registerObjectsToMatch_BWD(match, returnParam, uType, operation);

	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_1 = isApplicableMatch.getObject("returnParam");
		EObject _localVariable_2 = isApplicableMatch.getObject("uType");
		EObject _localVariable_3 = isApplicableMatch.getObject("m2o");
		EObject _localVariable_4 = isApplicableMatch.getObject("operation");
		EObject _localVariable_5 = isApplicableMatch.getObject("method");
		EObject _localVariable_6 = isApplicableMatch.getObject("jType");
		EObject tmpNe2ne = _localVariable_0;
		EObject tmpReturnParam = _localVariable_1;
		EObject tmpUType = _localVariable_2;
		EObject tmpM2o = _localVariable_3;
		EObject tmpOperation = _localVariable_4;
		EObject tmpMethod = _localVariable_5;
		EObject tmpJType = _localVariable_6;
		if (tmpNe2ne instanceof ASTNode2Element) {
			ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
			if (tmpReturnParam instanceof Parameter) {
				Parameter returnParam = (Parameter) tmpReturnParam;
				if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
					org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
					if (tmpM2o instanceof ASTNode2Element) {
						ASTNode2Element m2o = (ASTNode2Element) tmpM2o;
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							if (tmpMethod instanceof MMethodDefinition) {
								MMethodDefinition method = (MMethodDefinition) tmpMethod;
								if (tmpJType instanceof Type) {
									Type jType = (Type) tmpJType;
									return new Object[] { ne2ne, returnParam, uType, m2o, operation, method, jType,
											isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_blackBBBBBBBFBB(
			ASTNode2Element ne2ne, Parameter returnParam, org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o,
			Operation operation, MMethodDefinition method, Type jType, AbstractTypeAccess2ReturnParam _this,
			IsApplicableMatch isApplicableMatch) {
		if (!m2o.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { ne2ne, returnParam, uType, m2o, operation, method, jType, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			AbstractTypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_binding = pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_binding != null) {
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_binding[0];
			Parameter returnParam = (Parameter) result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_binding[2];
			ASTNode2Element m2o = (ASTNode2Element) result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_binding[3];
			Operation operation = (Operation) result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_binding[4];
			MMethodDefinition method = (MMethodDefinition) result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_binding[5];
			Type jType = (Type) result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_binding[6];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_black = pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_blackBBBBBBBFBB(
					ne2ne, returnParam, uType, m2o, operation, method, jType, _this, isApplicableMatch);
			if (result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_black[7];

				return new Object[] { ne2ne, returnParam, uType, m2o, operation, method, jType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_11_1_performtransformation_greenBFBFB(
			Parameter returnParam, MMethodDefinition method, Type jType) {
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ta2p.setTarget(returnParam);
		method.setReturnType(typeAccess);
		typeAccess.setType(jType);
		ta2p.setSource(typeAccess);
		return new Object[] { returnParam, ta2p, method, typeAccess, jType };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_11_2_collecttranslatedelements_blackBBB(
			Parameter returnParam, TypeAccess2Parameter ta2p, TypeAccess typeAccess) {
		return new Object[] { returnParam, ta2p, typeAccess };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_11_2_collecttranslatedelements_greenFBBB(
			Parameter returnParam, TypeAccess2Parameter ta2p, TypeAccess typeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(returnParam);
		ruleresult.getCreatedLinkElements().add(ta2p);
		ruleresult.getCreatedElements().add(typeAccess);
		return new Object[] { ruleresult, returnParam, ta2p, typeAccess };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ne2ne, EObject returnParam, EObject uType, EObject ta2p, EObject m2o,
			EObject operation, EObject method, EObject typeAccess, EObject jType) {
		if (!ne2ne.equals(returnParam)) {
			if (!ne2ne.equals(uType)) {
				if (!ne2ne.equals(ta2p)) {
					if (!ne2ne.equals(operation)) {
						if (!ne2ne.equals(typeAccess)) {
							if (!returnParam.equals(uType)) {
								if (!returnParam.equals(ta2p)) {
									if (!returnParam.equals(typeAccess)) {
										if (!ta2p.equals(uType)) {
											if (!ta2p.equals(typeAccess)) {
												if (!m2o.equals(ne2ne)) {
													if (!m2o.equals(returnParam)) {
														if (!m2o.equals(uType)) {
															if (!m2o.equals(ta2p)) {
																if (!m2o.equals(operation)) {
																	if (!m2o.equals(method)) {
																		if (!m2o.equals(typeAccess)) {
																			if (!operation.equals(returnParam)) {
																				if (!operation.equals(uType)) {
																					if (!operation.equals(ta2p)) {
																						if (!operation
																								.equals(typeAccess)) {
																							if (!method.equals(ne2ne)) {
																								if (!method.equals(
																										returnParam)) {
																									if (!method.equals(
																											uType)) {
																										if (!method
																												.equals(ta2p)) {
																											if (!method
																													.equals(operation)) {
																												if (!method
																														.equals(typeAccess)) {
																													if (!typeAccess
																															.equals(uType)) {
																														if (!jType
																																.equals(ne2ne)) {
																															if (!jType
																																	.equals(returnParam)) {
																																if (!jType
																																		.equals(uType)) {
																																	if (!jType
																																			.equals(ta2p)) {
																																		if (!jType
																																				.equals(m2o)) {
																																			if (!jType
																																					.equals(operation)) {
																																				if (!jType
																																						.equals(method)) {
																																					if (!jType
																																							.equals(typeAccess)) {
																																						return new Object[] {
																																								ruleresult,
																																								ne2ne,
																																								returnParam,
																																								uType,
																																								ta2p,
																																								m2o,
																																								operation,
																																								method,
																																								typeAccess,
																																								jType };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject returnParam, EObject uType, EObject ta2p, EObject operation,
			EObject method, EObject typeAccess, EObject jType) {
		EMoflonEdge ta2p__returnParam____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__typeAccess____returnType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ta2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge returnParam__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AbstractTypeAccess2ReturnParam";
		String ta2p__returnParam____target_name_prime = "target";
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String method__typeAccess____returnType_name_prime = "returnType";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ta2p__typeAccess____source_name_prime = "source";
		String returnParam__uType____type_name_prime = "type";
		ta2p__returnParam____target.setSrc(ta2p);
		ta2p__returnParam____target.setTrg(returnParam);
		ruleresult.getCreatedEdges().add(ta2p__returnParam____target);
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		ruleresult.getTranslatedEdges().add(operation__returnParam____ownedParameter);
		method__typeAccess____returnType.setSrc(method);
		method__typeAccess____returnType.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(method__typeAccess____returnType);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getCreatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		ta2p__typeAccess____source.setSrc(ta2p);
		ta2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ta2p__typeAccess____source);
		returnParam__uType____type.setSrc(returnParam);
		returnParam__uType____type.setTrg(uType);
		ruleresult.getTranslatedEdges().add(returnParam__uType____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ta2p__returnParam____target.setName(ta2p__returnParam____target_name_prime);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		method__typeAccess____returnType.setName(method__typeAccess____returnType_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		ta2p__typeAccess____source.setName(ta2p__typeAccess____source_name_prime);
		returnParam__uType____type.setName(returnParam__uType____type_name_prime);
		return new Object[] { ruleresult, returnParam, uType, ta2p, operation, method, typeAccess, jType,
				ta2p__returnParam____target, operation__returnParam____ownedParameter, method__typeAccess____returnType,
				typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess, ta2p__typeAccess____source,
				returnParam__uType____type };
	}

	public static final void pattern_AbstractTypeAccess2ReturnParam_11_5_registerobjects_expressionBBBBBBBBBBB(
			AbstractTypeAccess2ReturnParam _this, PerformRuleResult ruleresult, EObject ne2ne, EObject returnParam,
			EObject uType, EObject ta2p, EObject m2o, EObject operation, EObject method, EObject typeAccess,
			EObject jType) {
		_this.registerObjects_BWD(ruleresult, ne2ne, returnParam, uType, ta2p, m2o, operation, method, typeAccess,
				jType);

	}

	public static final PerformRuleResult pattern_AbstractTypeAccess2ReturnParam_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_bindingFB(
			AbstractTypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AbstractTypeAccess2ReturnParam _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_bindingAndBlackFFB(
			AbstractTypeAccess2ReturnParam _this) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_binding = pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_black = pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AbstractTypeAccess2ReturnParam";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("returnParam");
		EObject _localVariable_1 = match.getObject("uType");
		EObject _localVariable_2 = match.getObject("operation");
		EObject tmpReturnParam = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		if (tmpReturnParam instanceof Parameter) {
			Parameter returnParam = (Parameter) tmpReturnParam;
			if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
				org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
				if (tmpOperation instanceof Operation) {
					Operation operation = (Operation) tmpOperation;
					return new Object[] { returnParam, uType, operation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AbstractTypeAccess2ReturnParam_12_2_corematch_blackFBBFBFFB(
			Parameter returnParam, org.eclipse.uml2.uml.Type uType, Operation operation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(uType,
				ASTNode2Element.class, "target")) {
			ASTNode tmpJType = ne2ne.getSource();
			if (tmpJType instanceof Type) {
				Type jType = (Type) tmpJType;
				for (ASTNode2Element m2o : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(operation,
						ASTNode2Element.class, "target")) {
					if (!m2o.equals(ne2ne)) {
						ASTNode tmpMethod = m2o.getSource();
						if (tmpMethod instanceof MMethodDefinition) {
							MMethodDefinition method = (MMethodDefinition) tmpMethod;
							_result.add(
									new Object[] { ne2ne, returnParam, uType, m2o, operation, method, jType, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AbstractTypeAccess2ReturnParam_12_3_findcontext_blackBBBBBBB(
			ASTNode2Element ne2ne, Parameter returnParam, org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o,
			Operation operation, MMethodDefinition method, Type jType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!m2o.equals(ne2ne)) {
			if (uType.equals(ne2ne.getTarget())) {
				if (operation.equals(m2o.getTarget())) {
					if (operation.getOwnedParameters().contains(returnParam)) {
						if (method.equals(m2o.getSource())) {
							if (jType.equals(ne2ne.getSource())) {
								if (uType.equals(returnParam.getType())) {
									_result.add(
											new Object[] { ne2ne, returnParam, uType, m2o, operation, method, jType });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_3_findcontext_greenBBBBBBBFFFFFFF(
			ASTNode2Element ne2ne, Parameter returnParam, org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o,
			Operation operation, MMethodDefinition method, Type jType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__returnParam____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge m2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge returnParam__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2ne__uType____target_name_prime = "target";
		String m2o__operation____target_name_prime = "target";
		String operation__returnParam____ownedParameter_name_prime = "ownedParameter";
		String m2o__method____source_name_prime = "source";
		String ne2ne__jType____source_name_prime = "source";
		String returnParam__uType____type_name_prime = "type";
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(returnParam);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(m2o);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(jType);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		m2o__operation____target.setSrc(m2o);
		m2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(m2o__operation____target);
		operation__returnParam____ownedParameter.setSrc(operation);
		operation__returnParam____ownedParameter.setTrg(returnParam);
		isApplicableMatch.getAllContextElements().add(operation__returnParam____ownedParameter);
		m2o__method____source.setSrc(m2o);
		m2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(m2o__method____source);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		returnParam__uType____type.setSrc(returnParam);
		returnParam__uType____type.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(returnParam__uType____type);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		m2o__operation____target.setName(m2o__operation____target_name_prime);
		operation__returnParam____ownedParameter.setName(operation__returnParam____ownedParameter_name_prime);
		m2o__method____source.setName(m2o__method____source_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		returnParam__uType____type.setName(returnParam__uType____type_name_prime);
		return new Object[] { ne2ne, returnParam, uType, m2o, operation, method, jType, isApplicableMatch,
				ne2ne__uType____target, m2o__operation____target, operation__returnParam____ownedParameter,
				m2o__method____source, ne2ne__jType____source, returnParam__uType____type };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_bindingFBBBBBBBBB(
			AbstractTypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Parameter returnParam, org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation,
			MMethodDefinition method, Type jType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, ne2ne, returnParam, uType, m2o,
				operation, method, jType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ne2ne, returnParam, uType, m2o, operation, method,
					jType };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			AbstractTypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Parameter returnParam, org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation,
			MMethodDefinition method, Type jType) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_binding = pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, ne2ne, returnParam, uType, m2o, operation, method, jType);
		if (result_pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_binding[0];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_black = pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AbstractTypeAccess2ReturnParam_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ne2ne, returnParam, uType, m2o, operation, method,
						jType };
			}
		}
		return null;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_12_5_checkCSP_expressionFBB(
			AbstractTypeAccess2ReturnParam _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AbstractTypeAccess2ReturnParam";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AbstractTypeAccess2ReturnParam_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_bindingFB(
			AbstractTypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AbstractTypeAccess2ReturnParam _this) {
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

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AbstractTypeAccess2ReturnParam _this) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_binding = pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_black = pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AbstractTypeAccess2ReturnParam_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_ownedParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperation = _edge_ownedParameter.getSrc();
		if (tmpOperation instanceof Operation) {
			Operation operation = (Operation) tmpOperation;
			EObject tmpReturnParam = _edge_ownedParameter.getTrg();
			if (tmpReturnParam instanceof Parameter) {
				Parameter returnParam = (Parameter) tmpReturnParam;
				if (operation.getOwnedParameters().contains(returnParam)) {
					org.eclipse.uml2.uml.Type uType = returnParam.getType();
					if (uType != null) {
						_result.add(new Object[] { returnParam, uType, operation, _edge_ownedParameter });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			AbstractTypeAccess2ReturnParam _this, Match match, Parameter returnParam, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, returnParam, uType, operation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AbstractTypeAccess2ReturnParam _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AbstractTypeAccess2ReturnParam_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_bindingFB(
			AbstractTypeAccess2ReturnParam _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AbstractTypeAccess2ReturnParam _this) {
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

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AbstractTypeAccess2ReturnParam _this) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_binding = pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_black = pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess typeAccess, Type jType) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_129713 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_129713)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_931865 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ArrayType __DEC_typeAccess_elementType_602838 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			if (!jType.equals(__DEC_typeAccess_elementType_602838)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_517108 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_517108)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_565617 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_565617)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAccess) {
		for (SingleVariableDeclaration __DEC_typeAccess_type_944562 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_889111 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_returnType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMethod = _edge_returnType.getSrc();
		if (tmpMethod instanceof MMethodDefinition) {
			MMethodDefinition method = (MMethodDefinition) tmpMethod;
			EObject tmpTypeAccess = _edge_returnType.getTrg();
			if (tmpTypeAccess instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
				if (typeAccess.equals(method.getReturnType())) {
					Type jType = typeAccess.getType();
					if (jType != null) {
						if (pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_1B(
								typeAccess) == null) {
							if (pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_5B(
									typeAccess) == null) {
								if (pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_6B(
										typeAccess) == null) {
									if (pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_0BB(
											typeAccess, jType) == null) {
										if (pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_2BB(
												typeAccess, jType) == null) {
											if (pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_3BB(
													typeAccess, jType) == null) {
												if (pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_black_nac_4BB(
														typeAccess, jType) == null) {
													_result.add(new Object[] { method, typeAccess, jType,
															_edge_returnType });
												}
											}
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

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			AbstractTypeAccess2ReturnParam _this, Match match, MMethodDefinition method, TypeAccess typeAccess,
			Type jType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, method, typeAccess, jType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AbstractTypeAccess2ReturnParam _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AbstractTypeAccess2ReturnParam_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_1_prepare_blackB(
			AbstractTypeAccess2ReturnParam _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("returnParam");
		EObject _localVariable_1 = targetMatch.getObject("uType");
		EObject _localVariable_2 = targetMatch.getObject("operation");
		EObject _localVariable_3 = sourceMatch.getObject("method");
		EObject _localVariable_4 = sourceMatch.getObject("typeAccess");
		EObject _localVariable_5 = sourceMatch.getObject("jType");
		EObject tmpReturnParam = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		EObject tmpMethod = _localVariable_3;
		EObject tmpTypeAccess = _localVariable_4;
		EObject tmpJType = _localVariable_5;
		if (tmpReturnParam instanceof Parameter) {
			Parameter returnParam = (Parameter) tmpReturnParam;
			if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
				org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
				if (tmpOperation instanceof Operation) {
					Operation operation = (Operation) tmpOperation;
					if (tmpMethod instanceof MMethodDefinition) {
						MMethodDefinition method = (MMethodDefinition) tmpMethod;
						if (tmpTypeAccess instanceof TypeAccess) {
							TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
							if (tmpJType instanceof Type) {
								Type jType = (Type) tmpJType;
								return new Object[] { returnParam, uType, operation, method, typeAccess, jType,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_blackBBBBBBBB(
			Parameter returnParam, org.eclipse.uml2.uml.Type uType, Operation operation, MMethodDefinition method,
			TypeAccess typeAccess, Type jType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { returnParam, uType, operation, method, typeAccess, jType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding = pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding != null) {
			Parameter returnParam = (Parameter) result_pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[1];
			Operation operation = (Operation) result_pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[2];
			MMethodDefinition method = (MMethodDefinition) result_pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[3];
			TypeAccess typeAccess = (TypeAccess) result_pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[4];
			Type jType = (Type) result_pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_black = pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_blackBBBBBBBB(
					returnParam, uType, operation, method, typeAccess, jType, sourceMatch, targetMatch);
			if (result_pattern_AbstractTypeAccess2ReturnParam_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { returnParam, uType, operation, method, typeAccess, jType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_bindingFBBBBBBBBB(
			AbstractTypeAccess2ReturnParam _this, Parameter returnParam, org.eclipse.uml2.uml.Type uType,
			Operation operation, MMethodDefinition method, TypeAccess typeAccess, Type jType, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(returnParam, uType, operation, method, typeAccess, jType,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, returnParam, uType, operation, method, typeAccess, jType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			AbstractTypeAccess2ReturnParam _this, Parameter returnParam, org.eclipse.uml2.uml.Type uType,
			Operation operation, MMethodDefinition method, TypeAccess typeAccess, Type jType, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_binding = pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, returnParam, uType, operation, method, typeAccess, jType, sourceMatch, targetMatch);
		if (result_pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_binding[0];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_black = pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AbstractTypeAccess2ReturnParam_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, returnParam, uType, operation, method, typeAccess, jType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AbstractTypeAccess2ReturnParam_24_5_matchcorrcontext_blackFBFBBBBB(
			org.eclipse.uml2.uml.Type uType, Operation operation, MMethodDefinition method, Type jType,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(uType,
					ASTNode2Element.class, "target")) {
				if (jType.equals(ne2ne.getSource())) {
					for (ASTNode2Element m2o : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(operation, ASTNode2Element.class, "target")) {
						if (!m2o.equals(ne2ne)) {
							if (method.equals(m2o.getSource())) {
								_result.add(new Object[] { ne2ne, uType, m2o, operation, method, jType, sourceMatch,
										targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element ne2ne, ASTNode2Element m2o, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AbstractTypeAccess2ReturnParam";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.getAllContextElements().add(m2o);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ne2ne, m2o, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_6_createcorrespondence_blackBBBBBBB(
			Parameter returnParam, org.eclipse.uml2.uml.Type uType, Operation operation, MMethodDefinition method,
			TypeAccess typeAccess, Type jType, CCMatch ccMatch) {
		return new Object[] { returnParam, uType, operation, method, typeAccess, jType, ccMatch };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_6_createcorrespondence_greenBFBB(
			Parameter returnParam, TypeAccess typeAccess, CCMatch ccMatch) {
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		ta2p.setTarget(returnParam);
		ta2p.setSource(typeAccess);
		ccMatch.getCreateCorr().add(ta2p);
		return new Object[] { returnParam, ta2p, typeAccess, ccMatch };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AbstractTypeAccess2ReturnParam";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AbstractTypeAccess2ReturnParam_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_0BB(
			TypeAccess typeAccess, Type jType) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_406355 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_406355)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_543486 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ArrayType __DEC_typeAccess_elementType_294386 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			if (!jType.equals(__DEC_typeAccess_elementType_294386)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_3BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_84113 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_84113)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_4BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_726224 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_726224)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAccess) {
		for (SingleVariableDeclaration __DEC_typeAccess_type_811399 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_927401 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_blackBBB(
			MMethodDefinition method, TypeAccess typeAccess, Type jType) {
		if (typeAccess.equals(method.getReturnType())) {
			if (jType.equals(typeAccess.getType())) {
				if (pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_0BB(typeAccess,
						jType) == null) {
					if (pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_1B(typeAccess) == null) {
						if (pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_2BB(typeAccess,
								jType) == null) {
							if (pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_3BB(typeAccess,
									jType) == null) {
								if (pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_4BB(
										typeAccess, jType) == null) {
									if (pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_5B(
											typeAccess) == null) {
										if (pattern_AbstractTypeAccess2ReturnParam_27_1_matchtggpattern_black_nac_6B(
												typeAccess) == null) {
											return new Object[] { method, typeAccess, jType };
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

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_28_1_matchtggpattern_blackBBB(
			Parameter returnParam, org.eclipse.uml2.uml.Type uType, Operation operation) {
		if (operation.getOwnedParameters().contains(returnParam)) {
			if (uType.equals(returnParam.getType())) {
				return new Object[] { returnParam, uType, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_1_createresult_blackB(
			AbstractTypeAccess2ReturnParam _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Type uType) {
		if (ruleResult.getTargetObjects().contains(uType)) {
			return new Object[] { ruleResult, uType };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type jType) {
		if (ruleResult.getSourceObjects().contains(jType)) {
			return new Object[] { ruleResult, jType };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element m2o) {
		if (ruleResult.getCorrObjects().contains(m2o)) {
			return new Object[] { ruleResult, m2o };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Operation operation) {
		if (ruleResult.getTargetObjects().contains(operation)) {
			return new Object[] { ruleResult, operation };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, MMethodDefinition method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ne2neList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList m2oList : ruleEntryContainer.getRuleEntryList()) {
				if (!m2oList.equals(ne2neList)) {
					for (EObject tmpNe2ne : ne2neList.getEntryObjects()) {
						if (tmpNe2ne instanceof ASTNode2Element) {
							ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
							Element tmpUType = ne2ne.getTarget();
							if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
								org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
								ASTNode tmpJType = ne2ne.getSource();
								if (tmpJType instanceof Type) {
									Type jType = (Type) tmpJType;
									if (pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_0BB(
											ruleResult, ne2ne) == null) {
										if (pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, uType) == null) {
											if (pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, jType) == null) {
												for (EObject tmpM2o : m2oList.getEntryObjects()) {
													if (tmpM2o instanceof ASTNode2Element) {
														ASTNode2Element m2o = (ASTNode2Element) tmpM2o;
														if (!m2o.equals(ne2ne)) {
															Element tmpOperation = m2o.getTarget();
															if (tmpOperation instanceof Operation) {
																Operation operation = (Operation) tmpOperation;
																ASTNode tmpMethod = m2o.getSource();
																if (tmpMethod instanceof MMethodDefinition) {
																	MMethodDefinition method = (MMethodDefinition) tmpMethod;
																	if (pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, m2o) == null) {
																		if (pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_4BB(
																				ruleResult, operation) == null) {
																			if (pattern_AbstractTypeAccess2ReturnParam_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, method) == null) {
																				_result.add(new Object[] { ne2neList,
																						ne2ne, uType, jType, m2oList,
																						m2o, operation, method,
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
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_bindingFBBBBBBBBB(
			AbstractTypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation, MMethodDefinition method,
			Type jType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ne2ne, uType, m2o, operation, method,
				jType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ne2ne, uType, m2o, operation, method, jType,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			AbstractTypeAccess2ReturnParam _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation, MMethodDefinition method,
			Type jType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_binding = pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, ne2ne, uType, m2o, operation, method, jType, ruleResult);
		if (result_pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_binding[0];

			Object[] result_pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_black = pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AbstractTypeAccess2ReturnParam_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ne2ne, uType, m2o, operation, method, jType,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AbstractTypeAccess2ReturnParam_29_4_checkCSP_expressionFBB(
			AbstractTypeAccess2ReturnParam _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_5_checknacs_blackBBBBBB(
			ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation,
			MMethodDefinition method, Type jType) {
		if (!m2o.equals(ne2ne)) {
			return new Object[] { ne2ne, uType, m2o, operation, method, jType };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_6_perform_blackBBBBBBB(ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, ASTNode2Element m2o, Operation operation, MMethodDefinition method,
			Type jType, ModelgeneratorRuleResult ruleResult) {
		if (!m2o.equals(ne2ne)) {
			return new Object[] { ne2ne, uType, m2o, operation, method, jType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AbstractTypeAccess2ReturnParam_29_6_perform_greenFBFBBFBBB(
			org.eclipse.uml2.uml.Type uType, Operation operation, MMethodDefinition method, Type jType,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Parameter returnParam = UMLFactory.eINSTANCE.createParameter();
		TypeAccess2Parameter ta2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		Object _localVariable_0 = csp.getValue("returnParam", "direction");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		operation.getOwnedParameters().add(returnParam);
		returnParam.setType(uType);
		ruleResult.getTargetObjects().add(returnParam);
		ta2p.setTarget(returnParam);
		ruleResult.getCorrObjects().add(ta2p);
		method.setReturnType(typeAccess);
		typeAccess.setType(jType);
		ta2p.setSource(typeAccess);
		ruleResult.getSourceObjects().add(typeAccess);
		ParameterDirectionKind returnParam_direction_prime = (ParameterDirectionKind) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		returnParam.setDirection(returnParam_direction_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { returnParam, uType, ta2p, operation, method, typeAccess, jType, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AbstractTypeAccess2ReturnParam_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AbstractTypeAccess2ReturnParamImpl
