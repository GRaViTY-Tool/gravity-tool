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
import org.eclipse.modisco.java.AbstractMethodDeclaration;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.VariableDec2Parameter4;

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
 * An implementation of the model object '<em><b>Variable Dec2 Parameter4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VariableDec2Parameter4Impl extends AbstractRuleImpl implements VariableDec2Parameter4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDec2Parameter4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getVariableDec2Parameter4();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MSingleVariableDeclaration variableDec, Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method) {

		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_0_1_initialbindings_blackBBBBBB(this, match, variableDec, jType,
						typeAccess, method);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[variableDec] = " + variableDec + ", " + "[jType] = " + jType
					+ ", " + "[typeAccess] = " + typeAccess + ", " + "[method] = " + method + ".");
		}

		Object[] result2_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, variableDec, jType,
						typeAccess, method);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[variableDec] = " + variableDec + ", " + "[jType] = " + jType
					+ ", " + "[typeAccess] = " + typeAccess + ", " + "[method] = " + method + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_0_4_collectelementstobetranslated_blackBBBBB(match, variableDec,
							jType, typeAccess, method);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[variableDec] = " + variableDec + ", " + "[jType] = " + jType + ", " + "[typeAccess] = "
						+ typeAccess + ", " + "[method] = " + method + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
					match, variableDec, jType, typeAccess, method);
			//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[9];

			Object[] result5_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_0_5_collectcontextelements_blackBBBBB(match, variableDec, jType,
							typeAccess, method);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[variableDec] = " + variableDec + ", " + "[jType] = " + jType + ", " + "[typeAccess] = "
						+ typeAccess + ", " + "[method] = " + method + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_5_collectcontextelements_greenBBB(match, jType,
					method);

			// 
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_6_registerobjectstomatch_expressionBBBBBB(this,
					match, variableDec, jType, typeAccess, method);
			return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_7_expressionF();
		} else {
			return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[0];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result1_bindingAndBlack[1];
		Type jType = (Type) result1_bindingAndBlack[2];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[3];
		ASTNode2Element md2o = (ASTNode2Element) result1_bindingAndBlack[4];
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[5];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result1_bindingAndBlack[6];
		Operation operation = (Operation) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_1_performtransformation_greenBBFBFFBB(uType, variableDec, typeAccess,
						operation, csp);
		Parameter param = (Parameter) result1_green[2];
		ASTNode2Element vd2p = (ASTNode2Element) result1_green[4];
		TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result1_green[5];

		Object[] result2_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_blackBBBBB(variableDec, param, typeAccess,
						vd2p, ty2p);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[variableDec] = " + variableDec
					+ ", " + "[param] = " + param + ", " + "[typeAccess] = " + typeAccess + ", " + "[vd2p] = " + vd2p
					+ ", " + "[ty2p] = " + ty2p + ".");
		}
		Object[] result2_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_greenFBBBBB(variableDec, param,
						typeAccess, vd2p, ty2p);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, uType,
						variableDec, param, jType, ne2ne, md2o, typeAccess, method, vd2p, ty2p, operation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[uType] = " + uType + ", " + "[variableDec] = " + variableDec + ", " + "[param] = "
					+ param + ", " + "[jType] = " + jType + ", " + "[ne2ne] = " + ne2ne + ", " + "[md2o] = " + md2o
					+ ", " + "[typeAccess] = " + typeAccess + ", " + "[method] = " + method + ", " + "[vd2p] = " + vd2p
					+ ", " + "[ty2p] = " + ty2p + ", " + "[operation] = " + operation + ".");
		}
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFF(
				ruleresult, uType, variableDec, param, jType, typeAccess, method, vd2p, ty2p, operation);
		//nothing EMoflonEdge vd2p__variableDec____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge ty2p__param____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge vd2p__param____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge ty2p__typeAccess____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[20];

		// 
		// 
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_1_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, uType, variableDec, param, jType, ne2ne, md2o, typeAccess, method, vd2p, ty2p, operation);
		return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_binding[0];
		Type jType = (Type) result2_binding[1];
		TypeAccess typeAccess = (TypeAccess) result2_binding[2];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_binding[3];
		for (Object[] result2_black : VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_2_2_corematch_blackFBBFFBBFB(variableDec, jType, typeAccess, method,
						match)) {
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[0];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[3];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[4];
			Operation operation = (Operation) result2_black[7];
			// ForEach 
			for (Object[] result3_black : VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_2_3_findcontext_blackBBBBBBBB(uType, variableDec, jType, ne2ne,
							md2o, typeAccess, method, operation)) {
				Object[] result3_green = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(uType, variableDec,
								jType, ne2ne, md2o, typeAccess, method, operation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge md2o__method____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge md2o__operation____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								uType, variableDec, jType, ne2ne, md2o, typeAccess, method, operation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uType] = " + uType + ", "
							+ "[variableDec] = " + variableDec + ", " + "[jType] = " + jType + ", " + "[ne2ne] = "
							+ ne2ne + ", " + "[md2o] = " + md2o + ", " + "[typeAccess] = " + typeAccess + ", "
							+ "[method] = " + method + ", " + "[operation] = " + operation + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = VariableDec2Parameter4Impl
							.pattern_VariableDec2Parameter4_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MSingleVariableDeclaration variableDec, Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		match.registerObject("variableDec", variableDec);
		match.registerObject("jType", jType);
		match.registerObject("typeAccess", typeAccess);
		match.registerObject("method", method);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MSingleVariableDeclaration variableDec, Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Type uType,
			MSingleVariableDeclaration variableDec, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o,
			TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_variableDec_name = CSPFactoryHelper.eINSTANCE.createVariable("variableDec.name", true, csp);
		var_variableDec_name.setValue(variableDec.getName());
		var_variableDec_name.setType("String");

		// Create unbound variables
		Variable var_param_name = CSPFactoryHelper.eINSTANCE.createVariable("param.name", csp);
		var_param_name.setType("String");
		Variable var_param_direction = CSPFactoryHelper.eINSTANCE.createVariable("param.direction", csp);
		var_param_direction.setType("uml.ParameterDirectionKind");

		// Create constraints
		Eq eq = new Eq();
		IsInParameter isInParameter = new IsInParameter();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(isInParameter);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_variableDec_name, var_param_name);
		isInParameter.setRuleName("NoRuleName");
		isInParameter.solve(var_param_direction);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("variableDec", variableDec);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("method", method);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject uType, EObject variableDec, EObject param,
			EObject jType, EObject ne2ne, EObject md2o, EObject typeAccess, EObject method, EObject vd2p, EObject ty2p,
			EObject operation) {
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("variableDec", variableDec);
		ruleresult.registerObject("param", param);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("vd2p", vd2p);
		ruleresult.registerObject("ty2p", ty2p);
		ruleresult.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("variableDec").eClass())
						.equals("modisco.MSingleVariableDeclaration.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeAccess").eClass())
						.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Type uType, Parameter param,
			Operation operation) {

		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_10_1_initialbindings_blackBBBBB(this, match, uType, param, operation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uType] = " + uType + ", " + "[param] = " + param + ", "
					+ "[operation] = " + operation + ".");
		}

		Object[] result2_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, uType, param,
						operation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uType] = " + uType + ", " + "[param] = " + param + ", "
					+ "[operation] = " + operation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_10_4_collectelementstobetranslated_blackBBBB(match, uType, param,
							operation);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[uType] = " + uType
								+ ", " + "[param] = " + param + ", " + "[operation] = " + operation + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_4_collectelementstobetranslated_greenBBBBFF(
					match, uType, param, operation);
			//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result4_green[5];

			Object[] result5_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_10_5_collectcontextelements_blackBBBB(match, uType, param,
							operation);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[uType] = " + uType
								+ ", " + "[param] = " + param + ", " + "[operation] = " + operation + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_5_collectcontextelements_greenBBB(match, uType,
					operation);

			// 
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, uType, param, operation);
			return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_7_expressionF();
		} else {
			return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[0];
		Parameter param = (Parameter) result1_bindingAndBlack[1];
		Type jType = (Type) result1_bindingAndBlack[2];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[3];
		ASTNode2Element md2o = (ASTNode2Element) result1_bindingAndBlack[4];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result1_bindingAndBlack[5];
		Operation operation = (Operation) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_1_performtransformation_greenFBBFBFFB(param, jType, method, csp);
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result1_green[0];
		TypeAccess typeAccess = (TypeAccess) result1_green[3];
		ASTNode2Element vd2p = (ASTNode2Element) result1_green[5];
		TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result1_green[6];

		Object[] result2_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_blackBBBBB(variableDec, param,
						typeAccess, vd2p, ty2p);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[variableDec] = " + variableDec
					+ ", " + "[param] = " + param + ", " + "[typeAccess] = " + typeAccess + ", " + "[vd2p] = " + vd2p
					+ ", " + "[ty2p] = " + ty2p + ".");
		}
		Object[] result2_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_greenFBBBBB(variableDec, param,
						typeAccess, vd2p, ty2p);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, uType,
						variableDec, param, jType, ne2ne, md2o, typeAccess, method, vd2p, ty2p, operation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[uType] = " + uType + ", " + "[variableDec] = " + variableDec + ", " + "[param] = "
					+ param + ", " + "[jType] = " + jType + ", " + "[ne2ne] = " + ne2ne + ", " + "[md2o] = " + md2o
					+ ", " + "[typeAccess] = " + typeAccess + ", " + "[method] = " + method + ", " + "[vd2p] = " + vd2p
					+ ", " + "[ty2p] = " + ty2p + ", " + "[operation] = " + operation + ".");
		}
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFF(
				ruleresult, uType, variableDec, param, jType, typeAccess, method, vd2p, ty2p, operation);
		//nothing EMoflonEdge vd2p__variableDec____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge ty2p__param____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge vd2p__param____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge ty2p__typeAccess____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[20];

		// 
		// 
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_11_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, uType, variableDec, param, jType, ne2ne, md2o, typeAccess, method, vd2p, ty2p, operation);
		return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_binding[0];
		Parameter param = (Parameter) result2_binding[1];
		Operation operation = (Operation) result2_binding[2];
		for (Object[] result2_black : VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_12_2_corematch_blackBBFFFFBB(uType, param, operation, match)) {
			Type jType = (Type) result2_black[2];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[3];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[4];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[5];
			// ForEach 
			for (Object[] result3_black : VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_12_3_findcontext_blackBBBBBBB(uType, param, jType, ne2ne, md2o,
							method, operation)) {
				Object[] result3_green = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_12_3_findcontext_greenBBBBBBBFFFFFFF(uType, param, jType, ne2ne,
								md2o, method, operation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge md2o__method____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge md2o__operation____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								uType, param, jType, ne2ne, md2o, method, operation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uType] = " + uType + ", "
							+ "[param] = " + param + ", " + "[jType] = " + jType + ", " + "[ne2ne] = " + ne2ne + ", "
							+ "[md2o] = " + md2o + ", " + "[method] = " + method + ", " + "[operation] = " + operation
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = VariableDec2Parameter4Impl
							.pattern_VariableDec2Parameter4_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Type uType, Parameter param,
			Operation operation) {
		match.registerObject("uType", uType);
		match.registerObject("param", param);
		match.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Type uType, Parameter param,
			Operation operation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_param_direction = CSPFactoryHelper.eINSTANCE.createVariable("param.direction", true, csp);
		var_param_direction.setValue(param.getDirection());
		var_param_direction.setType("uml.ParameterDirectionKind");

		// Create unbound variables

		// Create constraints
		IsInParameter isInParameter = new IsInParameter();

		csp.getConstraints().add(isInParameter);

		// Solve CSP
		isInParameter.setRuleName("NoRuleName");
		isInParameter.solve(var_param_direction);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Type uType,
			Parameter param, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o, AbstractMethodDeclaration method,
			Operation operation) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_param_name = CSPFactoryHelper.eINSTANCE.createVariable("param.name", true, csp);
		var_param_name.setValue(param.getName());
		var_param_name.setType("String");

		// Create unbound variables
		Variable var_variableDec_name = CSPFactoryHelper.eINSTANCE.createVariable("variableDec.name", csp);
		var_variableDec_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_variableDec_name, var_param_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("param", param);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("method", method);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject uType, EObject variableDec, EObject param,
			EObject jType, EObject ne2ne, EObject md2o, EObject typeAccess, EObject method, EObject vd2p, EObject ty2p,
			EObject operation) {
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("variableDec", variableDec);
		ruleresult.registerObject("param", param);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("vd2p", vd2p);
		ruleresult.registerObject("ty2p", ty2p);
		ruleresult.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("param").eClass()).equals("uml.Parameter.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_94(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_20_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[0];
			Parameter param = (Parameter) result2_black[1];
			Operation operation = (Operation) result2_black[2];
			Object[] result2_green = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, uType, param, operation)) {
				// 
				if (VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VariableDec2Parameter4Impl
							.pattern_VariableDec2Parameter4_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_99(EMoflonEdge _edge_parameters) {

		Object[] result1_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_blackFFFFB(_edge_parameters)) {
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_black[0];
			Type jType = (Type) result2_black[1];
			TypeAccess typeAccess = (TypeAccess) result2_black[2];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[3];
			Object[] result2_green = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, variableDec, jType, typeAccess, method)) {
				// 
				if (VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VariableDec2Parameter4Impl
							.pattern_VariableDec2Parameter4_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("VariableDec2Parameter4");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_variableDec_name = CSPFactoryHelper.eINSTANCE.createVariable("variableDec", true, csp);
		var_variableDec_name.setValue(__helper.getValue("variableDec", "name"));
		var_variableDec_name.setType("String");

		Variable var_param_name = CSPFactoryHelper.eINSTANCE.createVariable("param", true, csp);
		var_param_name.setValue(__helper.getValue("param", "name"));
		var_param_name.setType("String");

		Variable var_param_direction = CSPFactoryHelper.eINSTANCE.createVariable("param", true, csp);
		var_param_direction.setValue(__helper.getValue("param", "direction"));
		var_param_direction.setType("uml.ParameterDirectionKind");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		IsInParameter isInParameter1 = new IsInParameter();
		csp.getConstraints().add(isInParameter1);

		eq0.setRuleName("VariableDec2Parameter4");
		eq0.solve(var_variableDec_name, var_param_name);

		isInParameter1.setRuleName("VariableDec2Parameter4");
		isInParameter1.solve(var_param_direction);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_param_name.setBound(false);
			var_param_direction.setBound(false);
			eq0.solve(var_variableDec_name, var_param_name);
			isInParameter1.solve(var_param_direction);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("param", "name", var_param_name.getValue());
				__helper.setValue("param", "direction", var_param_direction.getValue());
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
		ruleResult.setRule("VariableDec2Parameter4");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_variableDec_name = CSPFactoryHelper.eINSTANCE.createVariable("variableDec", true, csp);
		var_variableDec_name.setValue(__helper.getValue("variableDec", "name"));
		var_variableDec_name.setType("String");

		Variable var_param_name = CSPFactoryHelper.eINSTANCE.createVariable("param", true, csp);
		var_param_name.setValue(__helper.getValue("param", "name"));
		var_param_name.setType("String");

		Variable var_param_direction = CSPFactoryHelper.eINSTANCE.createVariable("param", true, csp);
		var_param_direction.setValue(__helper.getValue("param", "direction"));
		var_param_direction.setType("uml.ParameterDirectionKind");

		IsInParameter isInParameter0 = new IsInParameter();
		csp.getConstraints().add(isInParameter0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		isInParameter0.setRuleName("VariableDec2Parameter4");
		isInParameter0.solve(var_param_direction);

		eq1.setRuleName("VariableDec2Parameter4");
		eq1.solve(var_variableDec_name, var_param_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_variableDec_name.setBound(false);
			isInParameter0.solve(var_param_direction);
			eq1.solve(var_variableDec_name, var_param_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("variableDec", "name", var_variableDec_name.getValue());
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

		Object[] result1_black = VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_bindingAndBlack[0];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_bindingAndBlack[1];
		Parameter param = (Parameter) result2_bindingAndBlack[2];
		Type jType = (Type) result2_bindingAndBlack[3];
		TypeAccess typeAccess = (TypeAccess) result2_bindingAndBlack[4];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_bindingAndBlack[5];
		Operation operation = (Operation) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, uType, variableDec,
						param, jType, typeAccess, method, operation, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[uType] = " + uType + ", " + "[variableDec] = " + variableDec + ", " + "[param] = " + param
					+ ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess + ", " + "[method] = "
					+ method + ", " + "[operation] = " + operation + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_24_5_matchcorrcontext_blackBBFFBBBB(uType, jType, method, operation,
							sourceMatch, targetMatch)) {
				ASTNode2Element ne2ne = (ASTNode2Element) result5_black[2];
				ASTNode2Element md2o = (ASTNode2Element) result5_black[3];
				Object[] result5_green = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_24_5_matchcorrcontext_greenBBBBF(ne2ne, md2o, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_24_6_createcorrespondence_blackBBBBBBBB(uType, variableDec,
								param, jType, typeAccess, method, operation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uType] = " + uType + ", "
							+ "[variableDec] = " + variableDec + ", " + "[param] = " + param + ", " + "[jType] = "
							+ jType + ", " + "[typeAccess] = " + typeAccess + ", " + "[method] = " + method + ", "
							+ "[operation] = " + operation + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_24_6_createcorrespondence_greenBBBFFB(
						variableDec, param, typeAccess, ccMatch);
				//nothing ASTNode2Element vd2p = (ASTNode2Element) result6_green[3];
				//nothing TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result6_green[4];

				Object[] result7_black = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Type uType, MSingleVariableDeclaration variableDec,
			Parameter param, Type jType, TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_variableDec_name = CSPFactoryHelper.eINSTANCE.createVariable("variableDec.name", true, csp);
		var_variableDec_name.setValue(variableDec.getName());
		var_variableDec_name.setType("String");
		Variable var_param_name = CSPFactoryHelper.eINSTANCE.createVariable("param.name", true, csp);
		var_param_name.setValue(param.getName());
		var_param_name.setType("String");
		Variable var_param_direction = CSPFactoryHelper.eINSTANCE.createVariable("param.direction", true, csp);
		var_param_direction.setValue(param.getDirection());
		var_param_direction.setType("uml.ParameterDirectionKind");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		IsInParameter isInParameter = new IsInParameter();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(isInParameter);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_variableDec_name, var_param_name);
		isInParameter.setRuleName("NoRuleName");
		isInParameter.solve(var_param_direction);
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
	public boolean checkDEC_FWD(MSingleVariableDeclaration variableDec, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method) {// 
		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_27_1_matchtggpattern_blackBBBB(variableDec, jType, typeAccess, method);
		if (result1_black != null) {
			return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_27_2_expressionF();
		} else {
			return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Type uType, Parameter param, Operation operation) {// 
		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_28_1_matchtggpattern_blackBBB(uType, param, operation);
		if (result1_black != null) {
			return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_28_2_expressionF();
		} else {
			return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element ne2neParameter,
			ASTNode2Element md2oParameter) {

		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList ne2neList = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[1];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[2];
			Type jType = (Type) result2_black[3];
			//nothing RuleEntryList md2oList = (RuleEntryList) result2_black[4];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[5];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[6];
			Operation operation = (Operation) result2_black[7];

			Object[] result3_bindingAndBlack = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							uType, jType, ne2ne, md2o, method, operation, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uType] = " + uType + ", "
						+ "[jType] = " + jType + ", " + "[ne2ne] = " + ne2ne + ", " + "[md2o] = " + md2o + ", "
						+ "[method] = " + method + ", " + "[operation] = " + operation + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_29_5_checknacs_blackBBBBBB(uType, jType, ne2ne, md2o, method,
								operation);
				if (result5_black != null) {

					Object[] result6_black = VariableDec2Parameter4Impl
							.pattern_VariableDec2Parameter4_29_6_perform_blackBBBBBBB(uType, jType, ne2ne, md2o, method,
									operation, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uType] = " + uType
								+ ", " + "[jType] = " + jType + ", " + "[ne2ne] = " + ne2ne + ", " + "[md2o] = " + md2o
								+ ", " + "[method] = " + method + ", " + "[operation] = " + operation + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_29_6_perform_greenBFFBFBFFBBB(uType,
							jType, method, operation, ruleResult, csp);
					//nothing MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result6_green[1];
					//nothing Parameter param = (Parameter) result6_green[2];
					//nothing TypeAccess typeAccess = (TypeAccess) result6_green[4];
					//nothing ASTNode2Element vd2p = (ASTNode2Element) result6_green[6];
					//nothing TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Type uType,
			Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o, AbstractMethodDeclaration method,
			Operation operation, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_variableDec_name = CSPFactoryHelper.eINSTANCE.createVariable("variableDec.name", csp);
		var_variableDec_name.setType("String");
		Variable var_param_name = CSPFactoryHelper.eINSTANCE.createVariable("param.name", csp);
		var_param_name.setType("String");
		Variable var_param_direction = CSPFactoryHelper.eINSTANCE.createVariable("param.direction", csp);
		var_param_direction.setType("uml.ParameterDirectionKind");

		// Create constraints
		IsInParameter isInParameter = new IsInParameter();
		Eq eq = new Eq();

		csp.getConstraints().add(isInParameter);
		csp.getConstraints().add(eq);

		// Solve CSP
		isInParameter.setRuleName("NoRuleName");
		isInParameter.solve(var_param_direction);
		eq.setRuleName("NoRuleName");
		eq.solve(var_variableDec_name, var_param_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("method", method);
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
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_FWD__MATCH_MSINGLEVARIABLEDECLARATION_TYPE_TYPEACCESS_ABSTRACTMETHODDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MSingleVariableDeclaration) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3),
					(AbstractMethodDeclaration) arguments.get(4));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MSINGLEVARIABLEDECLARATION_TYPE_TYPEACCESS_ABSTRACTMETHODDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MSingleVariableDeclaration) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3),
					(AbstractMethodDeclaration) arguments.get(4));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MSINGLEVARIABLEDECLARATION_TYPE_TYPEACCESS_ABSTRACTMETHODDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MSingleVariableDeclaration) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3),
					(AbstractMethodDeclaration) arguments.get(4));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPE_MSINGLEVARIABLEDECLARATION_TYPE_ASTNODE2ELEMENT_ASTNODE2ELEMENT_TYPEACCESS_ABSTRACTMETHODDECLARATION_OPERATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Type) arguments.get(1), (MSingleVariableDeclaration) arguments.get(2),
					(Type) arguments.get(3), (ASTNode2Element) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(TypeAccess) arguments.get(6), (AbstractMethodDeclaration) arguments.get(7),
					(Operation) arguments.get(8));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_BWD__MATCH_TYPE_PARAMETER_OPERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Type) arguments.get(1),
					(Parameter) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPE_PARAMETER_OPERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Type) arguments.get(1),
					(Parameter) arguments.get(2), (Operation) arguments.get(3));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPE_PARAMETER_OPERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Type) arguments.get(1),
					(Parameter) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPE_PARAMETER_TYPE_ASTNODE2ELEMENT_ASTNODE2ELEMENT_ABSTRACTMETHODDECLARATION_OPERATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Type) arguments.get(1), (Parameter) arguments.get(2), (Type) arguments.get(3),
					(ASTNode2Element) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(AbstractMethodDeclaration) arguments.get(6), (Operation) arguments.get(7));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_BWD_EMOFLON_EDGE_94__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_94((EMoflonEdge) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_FWD_EMOFLON_EDGE_99__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_99((EMoflonEdge) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_SOLVE_CSP_CC__TYPE_MSINGLEVARIABLEDECLARATION_PARAMETER_TYPE_TYPEACCESS_ABSTRACTMETHODDECLARATION_OPERATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Type) arguments.get(0),
					(MSingleVariableDeclaration) arguments.get(1), (Parameter) arguments.get(2),
					(Type) arguments.get(3), (TypeAccess) arguments.get(4),
					(AbstractMethodDeclaration) arguments.get(5), (Operation) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_DEC_FWD__MSINGLEVARIABLEDECLARATION_TYPE_TYPEACCESS_ABSTRACTMETHODDECLARATION:
			return checkDEC_FWD((MSingleVariableDeclaration) arguments.get(0), (Type) arguments.get(1),
					(TypeAccess) arguments.get(2), (AbstractMethodDeclaration) arguments.get(3));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_DEC_BWD__TYPE_PARAMETER_OPERATION:
			return checkDEC_BWD((org.eclipse.uml2.uml.Type) arguments.get(0), (Parameter) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPE_TYPE_ASTNODE2ELEMENT_ASTNODE2ELEMENT_ABSTRACTMETHODDECLARATION_OPERATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Type) arguments.get(1), (Type) arguments.get(2),
					(ASTNode2Element) arguments.get(3), (ASTNode2Element) arguments.get(4),
					(AbstractMethodDeclaration) arguments.get(5), (Operation) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_1_initialbindings_blackBBBBBB(
			VariableDec2Parameter4 _this, Match match, MSingleVariableDeclaration variableDec, Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		return new Object[] { _this, match, variableDec, jType, typeAccess, method };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingFBBBBBB(
			VariableDec2Parameter4 _this, Match match, MSingleVariableDeclaration variableDec, Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, variableDec, jType, typeAccess, method);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, variableDec, jType, typeAccess, method };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			VariableDec2Parameter4 _this, Match match, MSingleVariableDeclaration variableDec, Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		Object[] result_pattern_VariableDec2Parameter4_0_2_SolveCSP_binding = pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, variableDec, jType, typeAccess, method);
		if (result_pattern_VariableDec2Parameter4_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_0_2_SolveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_0_2_SolveCSP_black = pattern_VariableDec2Parameter4_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, variableDec, jType, typeAccess, method };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter4_0_3_CheckCSP_expressionFBB(VariableDec2Parameter4 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, MSingleVariableDeclaration variableDec, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method) {
		return new Object[] { match, variableDec, jType, typeAccess, method };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, MSingleVariableDeclaration variableDec, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method) {
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(variableDec);
		match.getToBeTranslatedNodes().add(typeAccess);
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String variableDec__typeAccess____type_name_prime = "type";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		match.getToBeTranslatedEdges().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		match.getToBeTranslatedEdges().add(variableDec__method____methodDeclaration);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(variableDec__typeAccess____type);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		match.getToBeTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, variableDec, jType, typeAccess, method, method__variableDec____parameters,
				variableDec__method____methodDeclaration, variableDec__typeAccess____type, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_5_collectcontextelements_blackBBBBB(Match match,
			MSingleVariableDeclaration variableDec, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method) {
		return new Object[] { match, variableDec, jType, typeAccess, method };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_5_collectcontextelements_greenBBB(Match match,
			Type jType, AbstractMethodDeclaration method) {
		match.getContextNodes().add(jType);
		match.getContextNodes().add(method);
		return new Object[] { match, jType, method };
	}

	public static final void pattern_VariableDec2Parameter4_0_6_registerobjectstomatch_expressionBBBBBB(
			VariableDec2Parameter4 _this, Match match, MSingleVariableDeclaration variableDec, Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		_this.registerObjectsToMatch_FWD(match, variableDec, jType, typeAccess, method);

	}

	public static final boolean pattern_VariableDec2Parameter4_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter4_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("uType");
		EObject _localVariable_1 = isApplicableMatch.getObject("variableDec");
		EObject _localVariable_2 = isApplicableMatch.getObject("jType");
		EObject _localVariable_3 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_4 = isApplicableMatch.getObject("md2o");
		EObject _localVariable_5 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("method");
		EObject _localVariable_7 = isApplicableMatch.getObject("operation");
		EObject tmpUType = _localVariable_0;
		EObject tmpVariableDec = _localVariable_1;
		EObject tmpJType = _localVariable_2;
		EObject tmpNe2ne = _localVariable_3;
		EObject tmpMd2o = _localVariable_4;
		EObject tmpTypeAccess = _localVariable_5;
		EObject tmpMethod = _localVariable_6;
		EObject tmpOperation = _localVariable_7;
		if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
			if (tmpVariableDec instanceof MSingleVariableDeclaration) {
				MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
				if (tmpJType instanceof Type) {
					Type jType = (Type) tmpJType;
					if (tmpNe2ne instanceof ASTNode2Element) {
						ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
						if (tmpMd2o instanceof ASTNode2Element) {
							ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
							if (tmpTypeAccess instanceof TypeAccess) {
								TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
								if (tmpMethod instanceof AbstractMethodDeclaration) {
									AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
									if (tmpOperation instanceof Operation) {
										Operation operation = (Operation) tmpOperation;
										return new Object[] { uType, variableDec, jType, ne2ne, md2o, typeAccess,
												method, operation, isApplicableMatch };
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

	public static final Object[] pattern_VariableDec2Parameter4_1_1_performtransformation_blackBBBBBBBBFBB(
			org.eclipse.uml2.uml.Type uType, MSingleVariableDeclaration variableDec, Type jType, ASTNode2Element ne2ne,
			ASTNode2Element md2o, TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation,
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch) {
		if (!md2o.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { uType, variableDec, jType, ne2ne, md2o, typeAccess, method, operation, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding = pattern_VariableDec2Parameter4_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[0];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[1];
			Type jType = (Type) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[2];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[3];
			ASTNode2Element md2o = (ASTNode2Element) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[4];
			TypeAccess typeAccess = (TypeAccess) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[5];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[6];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[7];

			Object[] result_pattern_VariableDec2Parameter4_1_1_performtransformation_black = pattern_VariableDec2Parameter4_1_1_performtransformation_blackBBBBBBBBFBB(
					uType, variableDec, jType, ne2ne, md2o, typeAccess, method, operation, _this, isApplicableMatch);
			if (result_pattern_VariableDec2Parameter4_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VariableDec2Parameter4_1_1_performtransformation_black[8];

				return new Object[] { uType, variableDec, jType, ne2ne, md2o, typeAccess, method, operation, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_1_performtransformation_greenBBFBFFBB(
			org.eclipse.uml2.uml.Type uType, MSingleVariableDeclaration variableDec, TypeAccess typeAccess,
			Operation operation, CSP csp) {
		Parameter param = UMLFactory.eINSTANCE.createParameter();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Object _localVariable_0 = csp.getValue("param", "name");
		Object _localVariable_1 = csp.getValue("param", "direction");
		param.setType(uType);
		operation.getOwnedParameters().add(param);
		vd2p.setSource(variableDec);
		vd2p.setTarget(param);
		ty2p.setTarget(param);
		ty2p.setSource(typeAccess);
		String param_name_prime = (String) _localVariable_0;
		ParameterDirectionKind param_direction_prime = (ParameterDirectionKind) _localVariable_1;
		param.setName(param_name_prime);
		param.setDirection(param_direction_prime);
		return new Object[] { uType, variableDec, param, typeAccess, vd2p, ty2p, operation, csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_blackBBBBB(
			MSingleVariableDeclaration variableDec, Parameter param, TypeAccess typeAccess, ASTNode2Element vd2p,
			TypeAccess2Parameter ty2p) {
		return new Object[] { variableDec, param, typeAccess, vd2p, ty2p };
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_greenFBBBBB(
			MSingleVariableDeclaration variableDec, Parameter param, TypeAccess typeAccess, ASTNode2Element vd2p,
			TypeAccess2Parameter ty2p) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(variableDec);
		ruleresult.getCreatedElements().add(param);
		ruleresult.getTranslatedElements().add(typeAccess);
		ruleresult.getCreatedLinkElements().add(vd2p);
		ruleresult.getCreatedLinkElements().add(ty2p);
		return new Object[] { ruleresult, variableDec, param, typeAccess, vd2p, ty2p };
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject uType, EObject variableDec, EObject param, EObject jType,
			EObject ne2ne, EObject md2o, EObject typeAccess, EObject method, EObject vd2p, EObject ty2p,
			EObject operation) {
		if (!uType.equals(variableDec)) {
			if (!uType.equals(vd2p)) {
				if (!variableDec.equals(vd2p)) {
					if (!param.equals(uType)) {
						if (!param.equals(variableDec)) {
							if (!param.equals(typeAccess)) {
								if (!param.equals(vd2p)) {
									if (!param.equals(ty2p)) {
										if (!jType.equals(uType)) {
											if (!jType.equals(variableDec)) {
												if (!jType.equals(param)) {
													if (!jType.equals(ne2ne)) {
														if (!jType.equals(md2o)) {
															if (!jType.equals(typeAccess)) {
																if (!jType.equals(method)) {
																	if (!jType.equals(vd2p)) {
																		if (!jType.equals(ty2p)) {
																			if (!jType.equals(operation)) {
																				if (!ne2ne.equals(uType)) {
																					if (!ne2ne.equals(variableDec)) {
																						if (!ne2ne.equals(param)) {
																							if (!ne2ne.equals(
																									typeAccess)) {
																								if (!ne2ne
																										.equals(vd2p)) {
																									if (!ne2ne.equals(
																											ty2p)) {
																										if (!ne2ne
																												.equals(operation)) {
																											if (!md2o
																													.equals(uType)) {
																												if (!md2o
																														.equals(variableDec)) {
																													if (!md2o
																															.equals(param)) {
																														if (!md2o
																																.equals(ne2ne)) {
																															if (!md2o
																																	.equals(typeAccess)) {
																																if (!md2o
																																		.equals(method)) {
																																	if (!md2o
																																			.equals(vd2p)) {
																																		if (!md2o
																																				.equals(ty2p)) {
																																			if (!md2o
																																					.equals(operation)) {
																																				if (!typeAccess
																																						.equals(uType)) {
																																					if (!typeAccess
																																							.equals(variableDec)) {
																																						if (!typeAccess
																																								.equals(vd2p)) {
																																							if (!method
																																									.equals(uType)) {
																																								if (!method
																																										.equals(variableDec)) {
																																									if (!method
																																											.equals(param)) {
																																										if (!method
																																												.equals(ne2ne)) {
																																											if (!method
																																													.equals(typeAccess)) {
																																												if (!method
																																														.equals(vd2p)) {
																																													if (!method
																																															.equals(ty2p)) {
																																														if (!method
																																																.equals(operation)) {
																																															if (!ty2p
																																																	.equals(uType)) {
																																																if (!ty2p
																																																		.equals(variableDec)) {
																																																	if (!ty2p
																																																			.equals(typeAccess)) {
																																																		if (!ty2p
																																																				.equals(vd2p)) {
																																																			if (!operation
																																																					.equals(uType)) {
																																																				if (!operation
																																																						.equals(variableDec)) {
																																																					if (!operation
																																																							.equals(param)) {
																																																						if (!operation
																																																								.equals(typeAccess)) {
																																																							if (!operation
																																																									.equals(vd2p)) {
																																																								if (!operation
																																																										.equals(ty2p)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											uType,
																																																											variableDec,
																																																											param,
																																																											jType,
																																																											ne2ne,
																																																											md2o,
																																																											typeAccess,
																																																											method,
																																																											vd2p,
																																																											ty2p,
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
											}
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

	public static final Object[] pattern_VariableDec2Parameter4_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject uType, EObject variableDec, EObject param, EObject jType,
			EObject typeAccess, EObject method, EObject vd2p, EObject ty2p, EObject operation) {
		EMoflonEdge vd2p__variableDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VariableDec2Parameter4";
		String vd2p__variableDec____source_name_prime = "source";
		String ty2p__param____target_name_prime = "target";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String variableDec__typeAccess____type_name_prime = "type";
		String vd2p__param____target_name_prime = "target";
		String ty2p__typeAccess____source_name_prime = "source";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String param__uType____type_name_prime = "type";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		vd2p__variableDec____source.setSrc(vd2p);
		vd2p__variableDec____source.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(vd2p__variableDec____source);
		ty2p__param____target.setSrc(ty2p);
		ty2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(ty2p__param____target);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		ruleresult.getTranslatedEdges().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		ruleresult.getTranslatedEdges().add(variableDec__method____methodDeclaration);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(variableDec__typeAccess____type);
		vd2p__param____target.setSrc(vd2p);
		vd2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(vd2p__param____target);
		ty2p__typeAccess____source.setSrc(ty2p);
		ty2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ty2p__typeAccess____source);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		ruleresult.getCreatedEdges().add(param__uType____type);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		ruleresult.getCreatedEdges().add(operation__param____ownedParameter);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		vd2p__variableDec____source.setName(vd2p__variableDec____source_name_prime);
		ty2p__param____target.setName(ty2p__param____target_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		vd2p__param____target.setName(vd2p__param____target_name_prime);
		ty2p__typeAccess____source.setName(ty2p__typeAccess____source_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		return new Object[] { ruleresult, uType, variableDec, param, jType, typeAccess, method, vd2p, ty2p, operation,
				vd2p__variableDec____source, ty2p__param____target, method__variableDec____parameters,
				variableDec__method____methodDeclaration, variableDec__typeAccess____type, vd2p__param____target,
				ty2p__typeAccess____source, typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess,
				param__uType____type, operation__param____ownedParameter };
	}

	public static final void pattern_VariableDec2Parameter4_1_5_registerobjects_expressionBBBBBBBBBBBBB(
			VariableDec2Parameter4 _this, PerformRuleResult ruleresult, EObject uType, EObject variableDec,
			EObject param, EObject jType, EObject ne2ne, EObject md2o, EObject typeAccess, EObject method, EObject vd2p,
			EObject ty2p, EObject operation) {
		_this.registerObjects_FWD(ruleresult, uType, variableDec, param, jType, ne2ne, md2o, typeAccess, method, vd2p,
				ty2p, operation);

	}

	public static final PerformRuleResult pattern_VariableDec2Parameter4_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_1_preparereturnvalue_bindingFB(
			VariableDec2Parameter4 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_1_preparereturnvalue_blackFBB(EClass eClass,
			VariableDec2Parameter4 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_1_preparereturnvalue_bindingAndBlackFFB(
			VariableDec2Parameter4 _this) {
		Object[] result_pattern_VariableDec2Parameter4_2_1_preparereturnvalue_binding = pattern_VariableDec2Parameter4_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDec2Parameter4_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_VariableDec2Parameter4_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_2_1_preparereturnvalue_black = pattern_VariableDec2Parameter4_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_VariableDec2Parameter4_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_VariableDec2Parameter4_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "VariableDec2Parameter4";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("variableDec");
		EObject _localVariable_1 = match.getObject("jType");
		EObject _localVariable_2 = match.getObject("typeAccess");
		EObject _localVariable_3 = match.getObject("method");
		EObject tmpVariableDec = _localVariable_0;
		EObject tmpJType = _localVariable_1;
		EObject tmpTypeAccess = _localVariable_2;
		EObject tmpMethod = _localVariable_3;
		if (tmpVariableDec instanceof MSingleVariableDeclaration) {
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
			if (tmpJType instanceof Type) {
				Type jType = (Type) tmpJType;
				if (tmpTypeAccess instanceof TypeAccess) {
					TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
					if (tmpMethod instanceof AbstractMethodDeclaration) {
						AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
						return new Object[] { variableDec, jType, typeAccess, method, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_2_2_corematch_blackFBBFFBBFB(
			MSingleVariableDeclaration variableDec, Type jType, TypeAccess typeAccess, AbstractMethodDeclaration method,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jType,
				ASTNode2Element.class, "source")) {
			Element tmpUType = ne2ne.getTarget();
			if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
				org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
				for (ASTNode2Element md2o : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(method,
						ASTNode2Element.class, "source")) {
					if (!md2o.equals(ne2ne)) {
						Element tmpOperation = md2o.getTarget();
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							_result.add(new Object[] { uType, variableDec, jType, ne2ne, md2o, typeAccess, method,
									operation, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_2_3_findcontext_blackBBBBBBBB(
			org.eclipse.uml2.uml.Type uType, MSingleVariableDeclaration variableDec, Type jType, ASTNode2Element ne2ne,
			ASTNode2Element md2o, TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!md2o.equals(ne2ne)) {
			if (uType.equals(ne2ne.getTarget())) {
				if (jType.equals(ne2ne.getSource())) {
					if (method.equals(md2o.getSource())) {
						if (method.getParameters().contains(variableDec)) {
							if (operation.equals(md2o.getTarget())) {
								if (typeAccess.equals(variableDec.getType())) {
									if (jType.equals(typeAccess.getType())) {
										_result.add(new Object[] { uType, variableDec, jType, ne2ne, md2o, typeAccess,
												method, operation });
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

	public static final Object[] pattern_VariableDec2Parameter4_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(
			org.eclipse.uml2.uml.Type uType, MSingleVariableDeclaration variableDec, Type jType, ASTNode2Element ne2ne,
			ASTNode2Element md2o, TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2ne__uType____target_name_prime = "target";
		String ne2ne__jType____source_name_prime = "source";
		String md2o__method____source_name_prime = "source";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String md2o__operation____target_name_prime = "target";
		String variableDec__typeAccess____type_name_prime = "type";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(variableDec);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(md2o);
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(operation);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		md2o__method____source.setSrc(md2o);
		md2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(md2o__method____source);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		isApplicableMatch.getAllContextElements().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		isApplicableMatch.getAllContextElements().add(variableDec__method____methodDeclaration);
		md2o__operation____target.setSrc(md2o);
		md2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(md2o__operation____target);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(variableDec__typeAccess____type);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(jType__typeAccess____usagesInTypeAccess);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		md2o__method____source.setName(md2o__method____source_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		md2o__operation____target.setName(md2o__operation____target_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { uType, variableDec, jType, ne2ne, md2o, typeAccess, method, operation, isApplicableMatch,
				ne2ne__uType____target, ne2ne__jType____source, md2o__method____source,
				method__variableDec____parameters, variableDec__method____methodDeclaration, md2o__operation____target,
				variableDec__typeAccess____type, typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_4_solveCSP_bindingFBBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Type uType,
			MSingleVariableDeclaration variableDec, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o,
			TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, uType, variableDec, jType, ne2ne,
				md2o, typeAccess, method, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uType, variableDec, jType, ne2ne, md2o, typeAccess,
					method, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Type uType,
			MSingleVariableDeclaration variableDec, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o,
			TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation) {
		Object[] result_pattern_VariableDec2Parameter4_2_4_solveCSP_binding = pattern_VariableDec2Parameter4_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, uType, variableDec, jType, ne2ne, md2o, typeAccess, method, operation);
		if (result_pattern_VariableDec2Parameter4_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_2_4_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_2_4_solveCSP_black = pattern_VariableDec2Parameter4_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uType, variableDec, jType, ne2ne, md2o, typeAccess,
						method, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter4_2_5_checkCSP_expressionFBB(VariableDec2Parameter4 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "VariableDec2Parameter4";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_VariableDec2Parameter4_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_1_initialbindings_blackBBBBB(
			VariableDec2Parameter4 _this, Match match, org.eclipse.uml2.uml.Type uType, Parameter param,
			Operation operation) {
		return new Object[] { _this, match, uType, param, operation };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingFBBBBB(
			VariableDec2Parameter4 _this, Match match, org.eclipse.uml2.uml.Type uType, Parameter param,
			Operation operation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, uType, param, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, uType, param, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingAndBlackFBBBBB(
			VariableDec2Parameter4 _this, Match match, org.eclipse.uml2.uml.Type uType, Parameter param,
			Operation operation) {
		Object[] result_pattern_VariableDec2Parameter4_10_2_SolveCSP_binding = pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingFBBBBB(
				_this, match, uType, param, operation);
		if (result_pattern_VariableDec2Parameter4_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_10_2_SolveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_10_2_SolveCSP_black = pattern_VariableDec2Parameter4_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, uType, param, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter4_10_3_CheckCSP_expressionFBB(VariableDec2Parameter4 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_4_collectelementstobetranslated_blackBBBB(
			Match match, org.eclipse.uml2.uml.Type uType, Parameter param, Operation operation) {
		return new Object[] { match, uType, param, operation };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, org.eclipse.uml2.uml.Type uType, Parameter param, Operation operation) {
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(param);
		String param__uType____type_name_prime = "type";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		match.getToBeTranslatedEdges().add(param__uType____type);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		match.getToBeTranslatedEdges().add(operation__param____ownedParameter);
		param__uType____type.setName(param__uType____type_name_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		return new Object[] { match, uType, param, operation, param__uType____type,
				operation__param____ownedParameter };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_5_collectcontextelements_blackBBBB(Match match,
			org.eclipse.uml2.uml.Type uType, Parameter param, Operation operation) {
		return new Object[] { match, uType, param, operation };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_5_collectcontextelements_greenBBB(Match match,
			org.eclipse.uml2.uml.Type uType, Operation operation) {
		match.getContextNodes().add(uType);
		match.getContextNodes().add(operation);
		return new Object[] { match, uType, operation };
	}

	public static final void pattern_VariableDec2Parameter4_10_6_registerobjectstomatch_expressionBBBBB(
			VariableDec2Parameter4 _this, Match match, org.eclipse.uml2.uml.Type uType, Parameter param,
			Operation operation) {
		_this.registerObjectsToMatch_BWD(match, uType, param, operation);

	}

	public static final boolean pattern_VariableDec2Parameter4_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter4_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("uType");
		EObject _localVariable_1 = isApplicableMatch.getObject("param");
		EObject _localVariable_2 = isApplicableMatch.getObject("jType");
		EObject _localVariable_3 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_4 = isApplicableMatch.getObject("md2o");
		EObject _localVariable_5 = isApplicableMatch.getObject("method");
		EObject _localVariable_6 = isApplicableMatch.getObject("operation");
		EObject tmpUType = _localVariable_0;
		EObject tmpParam = _localVariable_1;
		EObject tmpJType = _localVariable_2;
		EObject tmpNe2ne = _localVariable_3;
		EObject tmpMd2o = _localVariable_4;
		EObject tmpMethod = _localVariable_5;
		EObject tmpOperation = _localVariable_6;
		if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
			if (tmpParam instanceof Parameter) {
				Parameter param = (Parameter) tmpParam;
				if (tmpJType instanceof Type) {
					Type jType = (Type) tmpJType;
					if (tmpNe2ne instanceof ASTNode2Element) {
						ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
						if (tmpMd2o instanceof ASTNode2Element) {
							ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
							if (tmpMethod instanceof AbstractMethodDeclaration) {
								AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
								if (tmpOperation instanceof Operation) {
									Operation operation = (Operation) tmpOperation;
									return new Object[] { uType, param, jType, ne2ne, md2o, method, operation,
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

	public static final Object[] pattern_VariableDec2Parameter4_11_1_performtransformation_blackBBBBBBBFBB(
			org.eclipse.uml2.uml.Type uType, Parameter param, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o,
			AbstractMethodDeclaration method, Operation operation, VariableDec2Parameter4 _this,
			IsApplicableMatch isApplicableMatch) {
		if (!md2o.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { uType, param, jType, ne2ne, md2o, method, operation, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding = pattern_VariableDec2Parameter4_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[0];
			Parameter param = (Parameter) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[1];
			Type jType = (Type) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[2];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[3];
			ASTNode2Element md2o = (ASTNode2Element) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[4];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[5];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[6];

			Object[] result_pattern_VariableDec2Parameter4_11_1_performtransformation_black = pattern_VariableDec2Parameter4_11_1_performtransformation_blackBBBBBBBFBB(
					uType, param, jType, ne2ne, md2o, method, operation, _this, isApplicableMatch);
			if (result_pattern_VariableDec2Parameter4_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VariableDec2Parameter4_11_1_performtransformation_black[7];

				return new Object[] { uType, param, jType, ne2ne, md2o, method, operation, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_1_performtransformation_greenFBBFBFFB(
			Parameter param, Type jType, AbstractMethodDeclaration method, CSP csp) {
		MSingleVariableDeclaration variableDec = ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Object _localVariable_0 = csp.getValue("variableDec", "name");
		method.getParameters().add(variableDec);
		variableDec.setType(typeAccess);
		typeAccess.setType(jType);
		vd2p.setSource(variableDec);
		vd2p.setTarget(param);
		ty2p.setTarget(param);
		ty2p.setSource(typeAccess);
		String variableDec_name_prime = (String) _localVariable_0;
		variableDec.setName(variableDec_name_prime);
		return new Object[] { variableDec, param, jType, typeAccess, method, vd2p, ty2p, csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_blackBBBBB(
			MSingleVariableDeclaration variableDec, Parameter param, TypeAccess typeAccess, ASTNode2Element vd2p,
			TypeAccess2Parameter ty2p) {
		return new Object[] { variableDec, param, typeAccess, vd2p, ty2p };
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_greenFBBBBB(
			MSingleVariableDeclaration variableDec, Parameter param, TypeAccess typeAccess, ASTNode2Element vd2p,
			TypeAccess2Parameter ty2p) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(variableDec);
		ruleresult.getTranslatedElements().add(param);
		ruleresult.getCreatedElements().add(typeAccess);
		ruleresult.getCreatedLinkElements().add(vd2p);
		ruleresult.getCreatedLinkElements().add(ty2p);
		return new Object[] { ruleresult, variableDec, param, typeAccess, vd2p, ty2p };
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject uType, EObject variableDec, EObject param, EObject jType,
			EObject ne2ne, EObject md2o, EObject typeAccess, EObject method, EObject vd2p, EObject ty2p,
			EObject operation) {
		if (!uType.equals(variableDec)) {
			if (!uType.equals(vd2p)) {
				if (!variableDec.equals(vd2p)) {
					if (!param.equals(uType)) {
						if (!param.equals(variableDec)) {
							if (!param.equals(typeAccess)) {
								if (!param.equals(vd2p)) {
									if (!param.equals(ty2p)) {
										if (!jType.equals(uType)) {
											if (!jType.equals(variableDec)) {
												if (!jType.equals(param)) {
													if (!jType.equals(ne2ne)) {
														if (!jType.equals(md2o)) {
															if (!jType.equals(typeAccess)) {
																if (!jType.equals(method)) {
																	if (!jType.equals(vd2p)) {
																		if (!jType.equals(ty2p)) {
																			if (!jType.equals(operation)) {
																				if (!ne2ne.equals(uType)) {
																					if (!ne2ne.equals(variableDec)) {
																						if (!ne2ne.equals(param)) {
																							if (!ne2ne.equals(
																									typeAccess)) {
																								if (!ne2ne
																										.equals(vd2p)) {
																									if (!ne2ne.equals(
																											ty2p)) {
																										if (!ne2ne
																												.equals(operation)) {
																											if (!md2o
																													.equals(uType)) {
																												if (!md2o
																														.equals(variableDec)) {
																													if (!md2o
																															.equals(param)) {
																														if (!md2o
																																.equals(ne2ne)) {
																															if (!md2o
																																	.equals(typeAccess)) {
																																if (!md2o
																																		.equals(method)) {
																																	if (!md2o
																																			.equals(vd2p)) {
																																		if (!md2o
																																				.equals(ty2p)) {
																																			if (!md2o
																																					.equals(operation)) {
																																				if (!typeAccess
																																						.equals(uType)) {
																																					if (!typeAccess
																																							.equals(variableDec)) {
																																						if (!typeAccess
																																								.equals(vd2p)) {
																																							if (!method
																																									.equals(uType)) {
																																								if (!method
																																										.equals(variableDec)) {
																																									if (!method
																																											.equals(param)) {
																																										if (!method
																																												.equals(ne2ne)) {
																																											if (!method
																																													.equals(typeAccess)) {
																																												if (!method
																																														.equals(vd2p)) {
																																													if (!method
																																															.equals(ty2p)) {
																																														if (!method
																																																.equals(operation)) {
																																															if (!ty2p
																																																	.equals(uType)) {
																																																if (!ty2p
																																																		.equals(variableDec)) {
																																																	if (!ty2p
																																																			.equals(typeAccess)) {
																																																		if (!ty2p
																																																				.equals(vd2p)) {
																																																			if (!operation
																																																					.equals(uType)) {
																																																				if (!operation
																																																						.equals(variableDec)) {
																																																					if (!operation
																																																							.equals(param)) {
																																																						if (!operation
																																																								.equals(typeAccess)) {
																																																							if (!operation
																																																									.equals(vd2p)) {
																																																								if (!operation
																																																										.equals(ty2p)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											uType,
																																																											variableDec,
																																																											param,
																																																											jType,
																																																											ne2ne,
																																																											md2o,
																																																											typeAccess,
																																																											method,
																																																											vd2p,
																																																											ty2p,
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
											}
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

	public static final Object[] pattern_VariableDec2Parameter4_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject uType, EObject variableDec, EObject param, EObject jType,
			EObject typeAccess, EObject method, EObject vd2p, EObject ty2p, EObject operation) {
		EMoflonEdge vd2p__variableDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VariableDec2Parameter4";
		String vd2p__variableDec____source_name_prime = "source";
		String ty2p__param____target_name_prime = "target";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String variableDec__typeAccess____type_name_prime = "type";
		String vd2p__param____target_name_prime = "target";
		String ty2p__typeAccess____source_name_prime = "source";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String param__uType____type_name_prime = "type";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		vd2p__variableDec____source.setSrc(vd2p);
		vd2p__variableDec____source.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(vd2p__variableDec____source);
		ty2p__param____target.setSrc(ty2p);
		ty2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(ty2p__param____target);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		ruleresult.getCreatedEdges().add(variableDec__method____methodDeclaration);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(variableDec__typeAccess____type);
		vd2p__param____target.setSrc(vd2p);
		vd2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(vd2p__param____target);
		ty2p__typeAccess____source.setSrc(ty2p);
		ty2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ty2p__typeAccess____source);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getCreatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		ruleresult.getTranslatedEdges().add(param__uType____type);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		ruleresult.getTranslatedEdges().add(operation__param____ownedParameter);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		vd2p__variableDec____source.setName(vd2p__variableDec____source_name_prime);
		ty2p__param____target.setName(ty2p__param____target_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		vd2p__param____target.setName(vd2p__param____target_name_prime);
		ty2p__typeAccess____source.setName(ty2p__typeAccess____source_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		return new Object[] { ruleresult, uType, variableDec, param, jType, typeAccess, method, vd2p, ty2p, operation,
				vd2p__variableDec____source, ty2p__param____target, method__variableDec____parameters,
				variableDec__method____methodDeclaration, variableDec__typeAccess____type, vd2p__param____target,
				ty2p__typeAccess____source, typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess,
				param__uType____type, operation__param____ownedParameter };
	}

	public static final void pattern_VariableDec2Parameter4_11_5_registerobjects_expressionBBBBBBBBBBBBB(
			VariableDec2Parameter4 _this, PerformRuleResult ruleresult, EObject uType, EObject variableDec,
			EObject param, EObject jType, EObject ne2ne, EObject md2o, EObject typeAccess, EObject method, EObject vd2p,
			EObject ty2p, EObject operation) {
		_this.registerObjects_BWD(ruleresult, uType, variableDec, param, jType, ne2ne, md2o, typeAccess, method, vd2p,
				ty2p, operation);

	}

	public static final PerformRuleResult pattern_VariableDec2Parameter4_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_1_preparereturnvalue_bindingFB(
			VariableDec2Parameter4 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_1_preparereturnvalue_blackFBB(EClass eClass,
			VariableDec2Parameter4 _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_1_preparereturnvalue_bindingAndBlackFFB(
			VariableDec2Parameter4 _this) {
		Object[] result_pattern_VariableDec2Parameter4_12_1_preparereturnvalue_binding = pattern_VariableDec2Parameter4_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDec2Parameter4_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_VariableDec2Parameter4_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_12_1_preparereturnvalue_black = pattern_VariableDec2Parameter4_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_VariableDec2Parameter4_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_VariableDec2Parameter4_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "VariableDec2Parameter4";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("uType");
		EObject _localVariable_1 = match.getObject("param");
		EObject _localVariable_2 = match.getObject("operation");
		EObject tmpUType = _localVariable_0;
		EObject tmpParam = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
			if (tmpParam instanceof Parameter) {
				Parameter param = (Parameter) tmpParam;
				if (tmpOperation instanceof Operation) {
					Operation operation = (Operation) tmpOperation;
					return new Object[] { uType, param, operation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_12_2_corematch_blackBBFFFFBB(
			org.eclipse.uml2.uml.Type uType, Parameter param, Operation operation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(uType,
				ASTNode2Element.class, "target")) {
			ASTNode tmpJType = ne2ne.getSource();
			if (tmpJType instanceof Type) {
				Type jType = (Type) tmpJType;
				for (ASTNode2Element md2o : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(operation, ASTNode2Element.class, "target")) {
					if (!md2o.equals(ne2ne)) {
						ASTNode tmpMethod = md2o.getSource();
						if (tmpMethod instanceof AbstractMethodDeclaration) {
							AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
							_result.add(new Object[] { uType, param, jType, ne2ne, md2o, method, operation, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_12_3_findcontext_blackBBBBBBB(
			org.eclipse.uml2.uml.Type uType, Parameter param, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o,
			AbstractMethodDeclaration method, Operation operation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!md2o.equals(ne2ne)) {
			if (uType.equals(ne2ne.getTarget())) {
				if (jType.equals(ne2ne.getSource())) {
					if (method.equals(md2o.getSource())) {
						if (operation.equals(md2o.getTarget())) {
							if (uType.equals(param.getType())) {
								if (operation.getOwnedParameters().contains(param)) {
									_result.add(new Object[] { uType, param, jType, ne2ne, md2o, method, operation });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_3_findcontext_greenBBBBBBBFFFFFFF(
			org.eclipse.uml2.uml.Type uType, Parameter param, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o,
			AbstractMethodDeclaration method, Operation operation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2ne__uType____target_name_prime = "target";
		String ne2ne__jType____source_name_prime = "source";
		String md2o__method____source_name_prime = "source";
		String md2o__operation____target_name_prime = "target";
		String param__uType____type_name_prime = "type";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(param);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(md2o);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(operation);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		md2o__method____source.setSrc(md2o);
		md2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(md2o__method____source);
		md2o__operation____target.setSrc(md2o);
		md2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(md2o__operation____target);
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(param__uType____type);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		isApplicableMatch.getAllContextElements().add(operation__param____ownedParameter);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		md2o__method____source.setName(md2o__method____source_name_prime);
		md2o__operation____target.setName(md2o__operation____target_name_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		return new Object[] { uType, param, jType, ne2ne, md2o, method, operation, isApplicableMatch,
				ne2ne__uType____target, ne2ne__jType____source, md2o__method____source, md2o__operation____target,
				param__uType____type, operation__param____ownedParameter };
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_4_solveCSP_bindingFBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Type uType,
			Parameter param, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o, AbstractMethodDeclaration method,
			Operation operation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, uType, param, jType, ne2ne, md2o,
				method, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uType, param, jType, ne2ne, md2o, method, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Type uType,
			Parameter param, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o, AbstractMethodDeclaration method,
			Operation operation) {
		Object[] result_pattern_VariableDec2Parameter4_12_4_solveCSP_binding = pattern_VariableDec2Parameter4_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, uType, param, jType, ne2ne, md2o, method, operation);
		if (result_pattern_VariableDec2Parameter4_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_12_4_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_12_4_solveCSP_black = pattern_VariableDec2Parameter4_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uType, param, jType, ne2ne, md2o, method,
						operation };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter4_12_5_checkCSP_expressionFBB(VariableDec2Parameter4 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "VariableDec2Parameter4";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_VariableDec2Parameter4_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_20_1_preparereturnvalue_bindingFB(
			VariableDec2Parameter4 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VariableDec2Parameter4 _this) {
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

	public static final Object[] pattern_VariableDec2Parameter4_20_1_preparereturnvalue_bindingAndBlackFFBF(
			VariableDec2Parameter4 _this) {
		Object[] result_pattern_VariableDec2Parameter4_20_1_preparereturnvalue_binding = pattern_VariableDec2Parameter4_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDec2Parameter4_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VariableDec2Parameter4_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_20_1_preparereturnvalue_black = pattern_VariableDec2Parameter4_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VariableDec2Parameter4_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VariableDec2Parameter4_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VariableDec2Parameter4_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpParam = _edge_type.getSrc();
		if (tmpParam instanceof Parameter) {
			Parameter param = (Parameter) tmpParam;
			EObject tmpUType = _edge_type.getTrg();
			if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
				org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
				if (uType.equals(param.getType())) {
					for (BehavioralFeature tmpOperation : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(param, BehavioralFeature.class, "ownedParameter")) {
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							_result.add(new Object[] { uType, param, operation, _edge_type });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VariableDec2Parameter4_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			VariableDec2Parameter4 _this, Match match, org.eclipse.uml2.uml.Type uType, Parameter param,
			Operation operation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, uType, param, operation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter4_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VariableDec2Parameter4 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VariableDec2Parameter4_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_1_preparereturnvalue_bindingFB(
			VariableDec2Parameter4 _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VariableDec2Parameter4 _this) {
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

	public static final Object[] pattern_VariableDec2Parameter4_21_1_preparereturnvalue_bindingAndBlackFFBF(
			VariableDec2Parameter4 _this) {
		Object[] result_pattern_VariableDec2Parameter4_21_1_preparereturnvalue_binding = pattern_VariableDec2Parameter4_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDec2Parameter4_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VariableDec2Parameter4_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_21_1_preparereturnvalue_black = pattern_VariableDec2Parameter4_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VariableDec2Parameter4_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VariableDec2Parameter4_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VariableDec2Parameter4_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess typeAccess, Type jType) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_253520 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_253520)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_288226 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ArrayType __DEC_typeAccess_elementType_570526 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			if (!jType.equals(__DEC_typeAccess_elementType_570526)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_552774 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_552774)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		for (MethodDeclaration __DEC_typeAccess_returnType_448855 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, MethodDeclaration.class, "returnType")) {
			if (!method.equals(__DEC_typeAccess_returnType_448855)) {
				return new Object[] { typeAccess, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_5BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_267963 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_267963)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_722299 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_parameters) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMethod = _edge_parameters.getSrc();
		if (tmpMethod instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
			EObject tmpVariableDec = _edge_parameters.getTrg();
			if (tmpVariableDec instanceof MSingleVariableDeclaration) {
				MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
				if (method.getParameters().contains(variableDec)) {
					TypeAccess typeAccess = variableDec.getType();
					if (typeAccess != null) {
						Type jType = typeAccess.getType();
						if (jType != null) {
							if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_1B(
									typeAccess) == null) {
								if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_4BB(typeAccess,
										method) == null) {
									if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_6B(
											typeAccess) == null) {
										if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_0BB(
												typeAccess, jType) == null) {
											if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_2BB(
													typeAccess, jType) == null) {
												if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_3BB(
														typeAccess, jType) == null) {
													if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_5BB(
															typeAccess, jType) == null) {
														_result.add(new Object[] { variableDec, jType, typeAccess,
																method, _edge_parameters });
													}
												}
											}
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

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VariableDec2Parameter4_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			VariableDec2Parameter4 _this, Match match, MSingleVariableDeclaration variableDec, Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, variableDec, jType, typeAccess, method);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter4_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VariableDec2Parameter4 _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VariableDec2Parameter4_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_1_prepare_blackB(VariableDec2Parameter4 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("uType");
		EObject _localVariable_1 = sourceMatch.getObject("variableDec");
		EObject _localVariable_2 = targetMatch.getObject("param");
		EObject _localVariable_3 = sourceMatch.getObject("jType");
		EObject _localVariable_4 = sourceMatch.getObject("typeAccess");
		EObject _localVariable_5 = sourceMatch.getObject("method");
		EObject _localVariable_6 = targetMatch.getObject("operation");
		EObject tmpUType = _localVariable_0;
		EObject tmpVariableDec = _localVariable_1;
		EObject tmpParam = _localVariable_2;
		EObject tmpJType = _localVariable_3;
		EObject tmpTypeAccess = _localVariable_4;
		EObject tmpMethod = _localVariable_5;
		EObject tmpOperation = _localVariable_6;
		if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
			if (tmpVariableDec instanceof MSingleVariableDeclaration) {
				MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
				if (tmpParam instanceof Parameter) {
					Parameter param = (Parameter) tmpParam;
					if (tmpJType instanceof Type) {
						Type jType = (Type) tmpJType;
						if (tmpTypeAccess instanceof TypeAccess) {
							TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
							if (tmpMethod instanceof AbstractMethodDeclaration) {
								AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
								if (tmpOperation instanceof Operation) {
									Operation operation = (Operation) tmpOperation;
									return new Object[] { uType, variableDec, param, jType, typeAccess, method,
											operation, targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			org.eclipse.uml2.uml.Type uType, MSingleVariableDeclaration variableDec, Parameter param, Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { uType, variableDec, param, jType, typeAccess, method, operation, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding = pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[0];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[1];
			Parameter param = (Parameter) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[2];
			Type jType = (Type) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[3];
			TypeAccess typeAccess = (TypeAccess) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[4];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[5];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_black = pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					uType, variableDec, param, jType, typeAccess, method, operation, sourceMatch, targetMatch);
			if (result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { uType, variableDec, param, jType, typeAccess, method, operation, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_3_solvecsp_bindingFBBBBBBBBBB(
			VariableDec2Parameter4 _this, org.eclipse.uml2.uml.Type uType, MSingleVariableDeclaration variableDec,
			Parameter param, Type jType, TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(uType, variableDec, param, jType, typeAccess, method,
				operation, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, uType, variableDec, param, jType, typeAccess, method, operation,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			VariableDec2Parameter4 _this, org.eclipse.uml2.uml.Type uType, MSingleVariableDeclaration variableDec,
			Parameter param, Type jType, TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VariableDec2Parameter4_24_3_solvecsp_binding = pattern_VariableDec2Parameter4_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, uType, variableDec, param, jType, typeAccess, method, operation, sourceMatch, targetMatch);
		if (result_pattern_VariableDec2Parameter4_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_24_3_solvecsp_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_24_3_solvecsp_black = pattern_VariableDec2Parameter4_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, uType, variableDec, param, jType, typeAccess, method, operation,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter4_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_24_5_matchcorrcontext_blackBBFFBBBB(
			org.eclipse.uml2.uml.Type uType, Type jType, AbstractMethodDeclaration method, Operation operation,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(uType,
					ASTNode2Element.class, "target")) {
				if (jType.equals(ne2ne.getSource())) {
					for (ASTNode2Element md2o : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(method, ASTNode2Element.class, "source")) {
						if (!md2o.equals(ne2ne)) {
							if (operation.equals(md2o.getTarget())) {
								_result.add(new Object[] { uType, jType, ne2ne, md2o, method, operation, sourceMatch,
										targetMatch });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_5_matchcorrcontext_greenBBBBF(ASTNode2Element ne2ne,
			ASTNode2Element md2o, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "VariableDec2Parameter4";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.getAllContextElements().add(md2o);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ne2ne, md2o, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_6_createcorrespondence_blackBBBBBBBB(
			org.eclipse.uml2.uml.Type uType, MSingleVariableDeclaration variableDec, Parameter param, Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method, Operation operation, CCMatch ccMatch) {
		return new Object[] { uType, variableDec, param, jType, typeAccess, method, operation, ccMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_6_createcorrespondence_greenBBBFFB(
			MSingleVariableDeclaration variableDec, Parameter param, TypeAccess typeAccess, CCMatch ccMatch) {
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		vd2p.setSource(variableDec);
		vd2p.setTarget(param);
		ccMatch.getCreateCorr().add(vd2p);
		ty2p.setTarget(param);
		ty2p.setSource(typeAccess);
		ccMatch.getCreateCorr().add(ty2p);
		return new Object[] { variableDec, param, typeAccess, vd2p, ty2p, ccMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "VariableDec2Parameter4";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_VariableDec2Parameter4_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_0BB(
			TypeAccess typeAccess, Type jType) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_555299 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_555299)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_914404 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ArrayType __DEC_typeAccess_elementType_764130 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			if (!jType.equals(__DEC_typeAccess_elementType_764130)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_3BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_694056 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_694056)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_4BB(
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		for (MethodDeclaration __DEC_typeAccess_returnType_143630 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, MethodDeclaration.class, "returnType")) {
			if (!method.equals(__DEC_typeAccess_returnType_143630)) {
				return new Object[] { typeAccess, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_5BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_740838 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_740838)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_587370 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_blackBBBB(
			MSingleVariableDeclaration variableDec, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method) {
		if (method.getParameters().contains(variableDec)) {
			if (typeAccess.equals(variableDec.getType())) {
				if (jType.equals(typeAccess.getType())) {
					if (pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_0BB(typeAccess, jType) == null) {
						if (pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_1B(typeAccess) == null) {
							if (pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_2BB(typeAccess,
									jType) == null) {
								if (pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_3BB(typeAccess,
										jType) == null) {
									if (pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_4BB(typeAccess,
											method) == null) {
										if (pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_5BB(
												typeAccess, jType) == null) {
											if (pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_6B(
													typeAccess) == null) {
												return new Object[] { variableDec, jType, typeAccess, method };
											}
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

	public static final boolean pattern_VariableDec2Parameter4_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter4_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_28_1_matchtggpattern_blackBBB(
			org.eclipse.uml2.uml.Type uType, Parameter param, Operation operation) {
		if (uType.equals(param.getType())) {
			if (operation.getOwnedParameters().contains(param)) {
				return new Object[] { uType, param, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter4_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter4_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_1_createresult_blackB(VariableDec2Parameter4 _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Type uType) {
		if (ruleResult.getTargetObjects().contains(uType)) {
			return new Object[] { ruleResult, uType };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Type jType) {
		if (ruleResult.getSourceObjects().contains(jType)) {
			return new Object[] { ruleResult, jType };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element md2o) {
		if (ruleResult.getCorrObjects().contains(md2o)) {
			return new Object[] { ruleResult, md2o };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodDeclaration method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Operation operation) {
		if (ruleResult.getTargetObjects().contains(operation)) {
			return new Object[] { ruleResult, operation };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ne2neList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList md2oList : ruleEntryContainer.getRuleEntryList()) {
				if (!md2oList.equals(ne2neList)) {
					for (EObject tmpNe2ne : ne2neList.getEntryObjects()) {
						if (tmpNe2ne instanceof ASTNode2Element) {
							ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
							Element tmpUType = ne2ne.getTarget();
							if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
								org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
								ASTNode tmpJType = ne2ne.getSource();
								if (tmpJType instanceof Type) {
									Type jType = (Type) tmpJType;
									if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											ne2ne) == null) {
										if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, uType) == null) {
											if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, jType) == null) {
												for (EObject tmpMd2o : md2oList.getEntryObjects()) {
													if (tmpMd2o instanceof ASTNode2Element) {
														ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
														if (!md2o.equals(ne2ne)) {
															ASTNode tmpMethod = md2o.getSource();
															if (tmpMethod instanceof AbstractMethodDeclaration) {
																AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
																Element tmpOperation = md2o.getTarget();
																if (tmpOperation instanceof Operation) {
																	Operation operation = (Operation) tmpOperation;
																	if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, md2o) == null) {
																		if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_4BB(
																				ruleResult, method) == null) {
																			if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, operation) == null) {
																				_result.add(new Object[] { ne2neList,
																						uType, ne2ne, jType, md2oList,
																						md2o, method, operation,
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

	public static final Object[] pattern_VariableDec2Parameter4_29_3_solveCSP_bindingFBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Type uType,
			Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o, AbstractMethodDeclaration method,
			Operation operation, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, uType, jType, ne2ne, md2o, method,
				operation, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uType, jType, ne2ne, md2o, method, operation,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Type uType,
			Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o, AbstractMethodDeclaration method,
			Operation operation, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_VariableDec2Parameter4_29_3_solveCSP_binding = pattern_VariableDec2Parameter4_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, uType, jType, ne2ne, md2o, method, operation, ruleResult);
		if (result_pattern_VariableDec2Parameter4_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_29_3_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_29_3_solveCSP_black = pattern_VariableDec2Parameter4_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uType, jType, ne2ne, md2o, method, operation,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter4_29_4_checkCSP_expressionFBB(VariableDec2Parameter4 _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_5_checknacs_blackBBBBBB(
			org.eclipse.uml2.uml.Type uType, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o,
			AbstractMethodDeclaration method, Operation operation) {
		if (!md2o.equals(ne2ne)) {
			return new Object[] { uType, jType, ne2ne, md2o, method, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_6_perform_blackBBBBBBB(
			org.eclipse.uml2.uml.Type uType, Type jType, ASTNode2Element ne2ne, ASTNode2Element md2o,
			AbstractMethodDeclaration method, Operation operation, ModelgeneratorRuleResult ruleResult) {
		if (!md2o.equals(ne2ne)) {
			return new Object[] { uType, jType, ne2ne, md2o, method, operation, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_6_perform_greenBFFBFBFFBBB(
			org.eclipse.uml2.uml.Type uType, Type jType, AbstractMethodDeclaration method, Operation operation,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		MSingleVariableDeclaration variableDec = ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
		Parameter param = UMLFactory.eINSTANCE.createParameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Object _localVariable_0 = csp.getValue("variableDec", "name");
		Object _localVariable_1 = csp.getValue("param", "name");
		Object _localVariable_2 = csp.getValue("param", "direction");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		method.getParameters().add(variableDec);
		ruleResult.getSourceObjects().add(variableDec);
		param.setType(uType);
		operation.getOwnedParameters().add(param);
		ruleResult.getTargetObjects().add(param);
		variableDec.setType(typeAccess);
		typeAccess.setType(jType);
		ruleResult.getSourceObjects().add(typeAccess);
		vd2p.setSource(variableDec);
		vd2p.setTarget(param);
		ruleResult.getCorrObjects().add(vd2p);
		ty2p.setTarget(param);
		ty2p.setSource(typeAccess);
		ruleResult.getCorrObjects().add(ty2p);
		String variableDec_name_prime = (String) _localVariable_0;
		String param_name_prime = (String) _localVariable_1;
		ParameterDirectionKind param_direction_prime = (ParameterDirectionKind) _localVariable_2;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		variableDec.setName(variableDec_name_prime);
		param.setName(param_name_prime);
		param.setDirection(param_direction_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { uType, variableDec, param, jType, typeAccess, method, vd2p, ty2p, operation, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_VariableDec2Parameter4_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //VariableDec2Parameter4Impl
