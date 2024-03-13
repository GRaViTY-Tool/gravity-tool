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
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

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
	public boolean isAppropriate_FWD(Match match, Type jType, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec) {

		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_0_1_initialbindings_blackBBBBBB(this, match, jType, typeAccess, method,
						variableDec);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess + ", "
					+ "[method] = " + method + ", " + "[variableDec] = " + variableDec + ".");
		}

		Object[] result2_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, jType, typeAccess,
						method, variableDec);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess + ", "
					+ "[method] = " + method + ", " + "[variableDec] = " + variableDec + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_0_4_collectelementstobetranslated_blackBBBBB(match, jType,
							typeAccess, method, variableDec);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess + ", " + "[method] = " + method
						+ ", " + "[variableDec] = " + variableDec + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
					match, jType, typeAccess, method, variableDec);
			//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result4_green[9];

			Object[] result5_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_0_5_collectcontextelements_blackBBBBB(match, jType, typeAccess,
							method, variableDec);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess + ", " + "[method] = " + method
						+ ", " + "[variableDec] = " + variableDec + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_5_collectcontextelements_greenBBB(match, jType,
					method);

			// 
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_6_registerobjectstomatch_expressionBBBBBB(this,
					match, jType, typeAccess, method, variableDec);
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
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[0];
		Operation operation = (Operation) result1_bindingAndBlack[1];
		Type jType = (Type) result1_bindingAndBlack[2];
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[3];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[4];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result1_bindingAndBlack[5];
		ASTNode2Element md2o = (ASTNode2Element) result1_bindingAndBlack[6];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_1_performtransformation_greenBFFBBBFB(operation, typeAccess, uType,
						variableDec, csp);
		TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result1_green[1];
		Parameter param = (Parameter) result1_green[2];
		ASTNode2Element vd2p = (ASTNode2Element) result1_green[6];

		Object[] result2_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_blackBBBBB(ty2p, param, typeAccess,
						variableDec, vd2p);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ty2p] = " + ty2p + ", "
					+ "[param] = " + param + ", " + "[typeAccess] = " + typeAccess + ", " + "[variableDec] = "
					+ variableDec + ", " + "[vd2p] = " + vd2p + ".");
		}
		Object[] result2_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_greenFBBBBB(ty2p, param, typeAccess,
						variableDec, vd2p);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, ne2ne, operation,
						ty2p, param, jType, typeAccess, uType, method, md2o, variableDec, vd2p);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ne2ne] = " + ne2ne + ", " + "[operation] = " + operation + ", " + "[ty2p] = " + ty2p
					+ ", " + "[param] = " + param + ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[uType] = " + uType + ", " + "[method] = " + method + ", " + "[md2o] = " + md2o + ", "
					+ "[variableDec] = " + variableDec + ", " + "[vd2p] = " + vd2p + ".");
		}
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFF(
				ruleresult, operation, ty2p, param, jType, typeAccess, uType, method, variableDec, vd2p);
		//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge ty2p__param____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge ty2p__typeAccess____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge vd2p__param____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge vd2p__variableDec____source = (EMoflonEdge) result3_green[20];

		// 
		// 
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_1_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, ne2ne, operation, ty2p, param, jType, typeAccess, uType, method, md2o, variableDec, vd2p);
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
		Type jType = (Type) result2_binding[0];
		TypeAccess typeAccess = (TypeAccess) result2_binding[1];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_binding[2];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_binding[3];
		for (Object[] result2_black : VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_2_2_corematch_blackFFBBFBFBB(jType, typeAccess, method, variableDec,
						match)) {
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[0];
			Operation operation = (Operation) result2_black[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[4];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[6];
			// ForEach 
			for (Object[] result3_black : VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_2_3_findcontext_blackBBBBBBBB(ne2ne, operation, jType, typeAccess,
							uType, method, md2o, variableDec)) {
				Object[] result3_green = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(ne2ne, operation, jType,
								typeAccess, uType, method, md2o, variableDec);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge md2o__operation____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge md2o__method____source = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								ne2ne, operation, jType, typeAccess, uType, method, md2o, variableDec);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ne2ne] = " + ne2ne + ", "
							+ "[operation] = " + operation + ", " + "[jType] = " + jType + ", " + "[typeAccess] = "
							+ typeAccess + ", " + "[uType] = " + uType + ", " + "[method] = " + method + ", "
							+ "[md2o] = " + md2o + ", " + "[variableDec] = " + variableDec + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec) {
		match.registerObject("jType", jType);
		match.registerObject("typeAccess", typeAccess);
		match.registerObject("method", method);
		match.registerObject("variableDec", variableDec);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec) {// Create CSP
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
			Operation operation, Type jType, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o, MSingleVariableDeclaration variableDec) {// Create CSP
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
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("variableDec", variableDec);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject ne2ne, EObject operation, EObject ty2p,
			EObject param, EObject jType, EObject typeAccess, EObject uType, EObject method, EObject md2o,
			EObject variableDec, EObject vd2p) {
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("ty2p", ty2p);
		ruleresult.registerObject("param", param);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("variableDec", variableDec);
		ruleresult.registerObject("vd2p", vd2p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeAccess").eClass())
						.equals("java.TypeAccess.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("variableDec").eClass())
						.equals("modisco.MSingleVariableDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Operation operation, Parameter param,
			org.eclipse.uml2.uml.Type uType) {

		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_10_1_initialbindings_blackBBBBB(this, match, operation, param, uType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[operation] = " + operation + ", " + "[param] = " + param + ", "
					+ "[uType] = " + uType + ".");
		}

		Object[] result2_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, operation, param,
						uType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[operation] = " + operation + ", " + "[param] = " + param + ", "
					+ "[uType] = " + uType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_10_4_collectelementstobetranslated_blackBBBB(match, operation,
							param, uType);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[operation] = "
								+ operation + ", " + "[param] = " + param + ", " + "[uType] = " + uType + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_4_collectelementstobetranslated_greenBBBBFF(
					match, operation, param, uType);
			//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result4_green[5];

			Object[] result5_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_10_5_collectcontextelements_blackBBBB(match, operation, param,
							uType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[operation] = "
								+ operation + ", " + "[param] = " + param + ", " + "[uType] = " + uType + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_5_collectcontextelements_greenBBB(match,
					operation, uType);

			// 
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, operation, param, uType);
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
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[0];
		Operation operation = (Operation) result1_bindingAndBlack[1];
		Parameter param = (Parameter) result1_bindingAndBlack[2];
		Type jType = (Type) result1_bindingAndBlack[3];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[4];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result1_bindingAndBlack[5];
		ASTNode2Element md2o = (ASTNode2Element) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_1_performtransformation_greenFBBFBFFB(param, jType, method, csp);
		TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result1_green[0];
		TypeAccess typeAccess = (TypeAccess) result1_green[3];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result1_green[5];
		ASTNode2Element vd2p = (ASTNode2Element) result1_green[6];

		Object[] result2_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_blackBBBBB(ty2p, param, typeAccess,
						variableDec, vd2p);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ty2p] = " + ty2p + ", "
					+ "[param] = " + param + ", " + "[typeAccess] = " + typeAccess + ", " + "[variableDec] = "
					+ variableDec + ", " + "[vd2p] = " + vd2p + ".");
		}
		Object[] result2_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_greenFBBBBB(ty2p, param, typeAccess,
						variableDec, vd2p);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, ne2ne, operation,
						ty2p, param, jType, typeAccess, uType, method, md2o, variableDec, vd2p);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ne2ne] = " + ne2ne + ", " + "[operation] = " + operation + ", " + "[ty2p] = " + ty2p
					+ ", " + "[param] = " + param + ", " + "[jType] = " + jType + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[uType] = " + uType + ", " + "[method] = " + method + ", " + "[md2o] = " + md2o + ", "
					+ "[variableDec] = " + variableDec + ", " + "[vd2p] = " + vd2p + ".");
		}
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFF(
				ruleresult, operation, ty2p, param, jType, typeAccess, uType, method, variableDec, vd2p);
		//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge ty2p__param____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge ty2p__typeAccess____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge vd2p__param____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge vd2p__variableDec____source = (EMoflonEdge) result3_green[20];

		// 
		// 
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_11_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, ne2ne, operation, ty2p, param, jType, typeAccess, uType, method, md2o, variableDec, vd2p);
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
		Operation operation = (Operation) result2_binding[0];
		Parameter param = (Parameter) result2_binding[1];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_binding[2];
		for (Object[] result2_black : VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_12_2_corematch_blackFBBFBFFB(operation, param, uType, match)) {
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[0];
			Type jType = (Type) result2_black[3];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[5];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[6];
			// ForEach 
			for (Object[] result3_black : VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_12_3_findcontext_blackBBBBBBB(ne2ne, operation, param, jType, uType,
							method, md2o)) {
				Object[] result3_green = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_12_3_findcontext_greenBBBBBBBFFFFFFF(ne2ne, operation, param,
								jType, uType, method, md2o);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge md2o__operation____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge md2o__method____source = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								ne2ne, operation, param, jType, uType, method, md2o);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ne2ne] = " + ne2ne + ", "
							+ "[operation] = " + operation + ", " + "[param] = " + param + ", " + "[jType] = " + jType
							+ ", " + "[uType] = " + uType + ", " + "[method] = " + method + ", " + "[md2o] = " + md2o
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
	public void registerObjectsToMatch_BWD(Match match, Operation operation, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		match.registerObject("operation", operation);
		match.registerObject("param", param);
		match.registerObject("uType", uType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Operation operation, Parameter param,
			org.eclipse.uml2.uml.Type uType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Operation operation, Parameter param, Type jType, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o) {// Create CSP
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
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("param", param);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("md2o", md2o);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject ne2ne, EObject operation, EObject ty2p,
			EObject param, EObject jType, EObject typeAccess, EObject uType, EObject method, EObject md2o,
			EObject variableDec, EObject vd2p) {
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("ty2p", ty2p);
		ruleresult.registerObject("param", param);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("variableDec", variableDec);
		ruleresult.registerObject("vd2p", vd2p);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_134(EMoflonEdge _edge_ownedParameter) {

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
				.pattern_VariableDec2Parameter4_20_2_testcorematchandDECs_blackFFFB(_edge_ownedParameter)) {
			Operation operation = (Operation) result2_black[0];
			Parameter param = (Parameter) result2_black[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[2];
			Object[] result2_green = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, operation, param, uType)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_142(EMoflonEdge _edge_type) {

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
				.pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_blackFFFFB(_edge_type)) {
			Type jType = (Type) result2_black[0];
			TypeAccess typeAccess = (TypeAccess) result2_black[1];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[2];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_black[3];
			Object[] result2_green = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, jType, typeAccess, method, variableDec)) {
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

		Variable var_param_name = CSPFactoryHelper.eINSTANCE.createVariable("param", true, csp);
		var_param_name.setValue(__helper.getValue("param", "name"));
		var_param_name.setType("String");

		Variable var_variableDec_name = CSPFactoryHelper.eINSTANCE.createVariable("variableDec", true, csp);
		var_variableDec_name.setValue(__helper.getValue("variableDec", "name"));
		var_variableDec_name.setType("String");

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

		Variable var_param_name = CSPFactoryHelper.eINSTANCE.createVariable("param", true, csp);
		var_param_name.setValue(__helper.getValue("param", "name"));
		var_param_name.setType("String");

		Variable var_variableDec_name = CSPFactoryHelper.eINSTANCE.createVariable("variableDec", true, csp);
		var_variableDec_name.setValue(__helper.getValue("variableDec", "name"));
		var_variableDec_name.setType("String");

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
		Operation operation = (Operation) result2_bindingAndBlack[0];
		Parameter param = (Parameter) result2_bindingAndBlack[1];
		Type jType = (Type) result2_bindingAndBlack[2];
		TypeAccess typeAccess = (TypeAccess) result2_bindingAndBlack[3];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_bindingAndBlack[4];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_bindingAndBlack[5];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, operation, param, jType,
						typeAccess, uType, method, variableDec, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[operation] = " + operation + ", " + "[param] = " + param + ", " + "[jType] = " + jType + ", "
					+ "[typeAccess] = " + typeAccess + ", " + "[uType] = " + uType + ", " + "[method] = " + method
					+ ", " + "[variableDec] = " + variableDec + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_24_5_matchcorrcontext_blackFBBBBFBB(operation, jType, uType, method,
							sourceMatch, targetMatch)) {
				ASTNode2Element ne2ne = (ASTNode2Element) result5_black[0];
				ASTNode2Element md2o = (ASTNode2Element) result5_black[5];
				Object[] result5_green = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_24_5_matchcorrcontext_greenBBBBF(ne2ne, md2o, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_24_6_createcorrespondence_blackBBBBBBBB(operation, param, jType,
								typeAccess, uType, method, variableDec, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[operation] = "
							+ operation + ", " + "[param] = " + param + ", " + "[jType] = " + jType + ", "
							+ "[typeAccess] = " + typeAccess + ", " + "[uType] = " + uType + ", " + "[method] = "
							+ method + ", " + "[variableDec] = " + variableDec + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_24_6_createcorrespondence_greenFBBBFB(param,
						typeAccess, variableDec, ccMatch);
				//nothing TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result6_green[0];
				//nothing ASTNode2Element vd2p = (ASTNode2Element) result6_green[4];

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
	public CSP isApplicable_solveCsp_CC(Operation operation, Parameter param, Type jType, TypeAccess typeAccess,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec,
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
	public boolean checkDEC_FWD(Type jType, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec) {// 
		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_27_1_matchtggpattern_blackBBBB(jType, typeAccess, method, variableDec);
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
	public boolean checkDEC_BWD(Operation operation, Parameter param, org.eclipse.uml2.uml.Type uType) {// 
		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_28_1_matchtggpattern_blackBBB(operation, param, uType);
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
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[1];
			Type jType = (Type) result2_black[2];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[3];
			//nothing RuleEntryList md2oList = (RuleEntryList) result2_black[4];
			Operation operation = (Operation) result2_black[5];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[6];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							ne2ne, operation, jType, uType, method, md2o, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ne2ne] = " + ne2ne + ", "
						+ "[operation] = " + operation + ", " + "[jType] = " + jType + ", " + "[uType] = " + uType
						+ ", " + "[method] = " + method + ", " + "[md2o] = " + md2o + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_29_5_checknacs_blackBBBBBB(ne2ne, operation, jType, uType,
								method, md2o);
				if (result5_black != null) {

					Object[] result6_black = VariableDec2Parameter4Impl
							.pattern_VariableDec2Parameter4_29_6_perform_blackBBBBBBB(ne2ne, operation, jType, uType,
									method, md2o, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ne2ne] = " + ne2ne
								+ ", " + "[operation] = " + operation + ", " + "[jType] = " + jType + ", "
								+ "[uType] = " + uType + ", " + "[method] = " + method + ", " + "[md2o] = " + md2o
								+ ", " + "[ruleResult] = " + ruleResult + ".");
					}
					VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_29_6_perform_greenBFFBFBBFFBB(operation,
							jType, uType, method, ruleResult, csp);
					//nothing TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result6_green[1];
					//nothing Parameter param = (Parameter) result6_green[2];
					//nothing TypeAccess typeAccess = (TypeAccess) result6_green[4];
					//nothing MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result6_green[7];
					//nothing ASTNode2Element vd2p = (ASTNode2Element) result6_green[8];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Operation operation, Type jType, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("md2o", md2o);
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
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_FWD__MATCH_TYPE_TYPEACCESS_ABSTRACTMETHODDECLARATION_MSINGLEVARIABLEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (Type) arguments.get(1), (TypeAccess) arguments.get(2),
					(AbstractMethodDeclaration) arguments.get(3), (MSingleVariableDeclaration) arguments.get(4));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPE_TYPEACCESS_ABSTRACTMETHODDECLARATION_MSINGLEVARIABLEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Type) arguments.get(1), (TypeAccess) arguments.get(2),
					(AbstractMethodDeclaration) arguments.get(3), (MSingleVariableDeclaration) arguments.get(4));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPE_TYPEACCESS_ABSTRACTMETHODDECLARATION_MSINGLEVARIABLEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(TypeAccess) arguments.get(2), (AbstractMethodDeclaration) arguments.get(3),
					(MSingleVariableDeclaration) arguments.get(4));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_OPERATION_TYPE_TYPEACCESS_TYPE_ABSTRACTMETHODDECLARATION_ASTNODE2ELEMENT_MSINGLEVARIABLEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(Operation) arguments.get(2), (Type) arguments.get(3), (TypeAccess) arguments.get(4),
					(org.eclipse.uml2.uml.Type) arguments.get(5), (AbstractMethodDeclaration) arguments.get(6),
					(ASTNode2Element) arguments.get(7), (MSingleVariableDeclaration) arguments.get(8));
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
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_BWD__MATCH_OPERATION_PARAMETER_TYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Parameter) arguments.get(2), (org.eclipse.uml2.uml.Type) arguments.get(3));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_OPERATION_PARAMETER_TYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Parameter) arguments.get(2), (org.eclipse.uml2.uml.Type) arguments.get(3));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_OPERATION_PARAMETER_TYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Operation) arguments.get(1),
					(Parameter) arguments.get(2), (org.eclipse.uml2.uml.Type) arguments.get(3));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_OPERATION_PARAMETER_TYPE_TYPE_ABSTRACTMETHODDECLARATION_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(Operation) arguments.get(2), (Parameter) arguments.get(3), (Type) arguments.get(4),
					(org.eclipse.uml2.uml.Type) arguments.get(5), (AbstractMethodDeclaration) arguments.get(6),
					(ASTNode2Element) arguments.get(7));
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
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_BWD_EMOFLON_EDGE_134__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_134((EMoflonEdge) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_FWD_EMOFLON_EDGE_142__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_142((EMoflonEdge) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_SOLVE_CSP_CC__OPERATION_PARAMETER_TYPE_TYPEACCESS_TYPE_ABSTRACTMETHODDECLARATION_MSINGLEVARIABLEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Operation) arguments.get(0), (Parameter) arguments.get(1),
					(Type) arguments.get(2), (TypeAccess) arguments.get(3),
					(org.eclipse.uml2.uml.Type) arguments.get(4), (AbstractMethodDeclaration) arguments.get(5),
					(MSingleVariableDeclaration) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_DEC_FWD__TYPE_TYPEACCESS_ABSTRACTMETHODDECLARATION_MSINGLEVARIABLEDECLARATION:
			return checkDEC_FWD((Type) arguments.get(0), (TypeAccess) arguments.get(1),
					(AbstractMethodDeclaration) arguments.get(2), (MSingleVariableDeclaration) arguments.get(3));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_DEC_BWD__OPERATION_PARAMETER_TYPE:
			return checkDEC_BWD((Operation) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_OPERATION_TYPE_TYPE_ABSTRACTMETHODDECLARATION_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(Operation) arguments.get(2), (Type) arguments.get(3), (org.eclipse.uml2.uml.Type) arguments.get(4),
					(AbstractMethodDeclaration) arguments.get(5), (ASTNode2Element) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_1_initialbindings_blackBBBBBB(
			VariableDec2Parameter4 _this, Match match, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec) {
		return new Object[] { _this, match, jType, typeAccess, method, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingFBBBBBB(
			VariableDec2Parameter4 _this, Match match, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jType, typeAccess, method, variableDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jType, typeAccess, method, variableDec };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			VariableDec2Parameter4 _this, Match match, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec) {
		Object[] result_pattern_VariableDec2Parameter4_0_2_SolveCSP_binding = pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, jType, typeAccess, method, variableDec);
		if (result_pattern_VariableDec2Parameter4_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_0_2_SolveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_0_2_SolveCSP_black = pattern_VariableDec2Parameter4_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jType, typeAccess, method, variableDec };
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
			Match match, Type jType, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec) {
		return new Object[] { match, jType, typeAccess, method, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, Type jType, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec) {
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeAccess);
		match.getToBeTranslatedNodes().add(variableDec);
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String variableDec__typeAccess____type_name_prime = "type";
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		match.getToBeTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		match.getToBeTranslatedEdges().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		match.getToBeTranslatedEdges().add(variableDec__method____methodDeclaration);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(variableDec__typeAccess____type);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		return new Object[] { match, jType, typeAccess, method, variableDec, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, method__variableDec____parameters,
				variableDec__method____methodDeclaration, variableDec__typeAccess____type };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_5_collectcontextelements_blackBBBBB(Match match,
			Type jType, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec) {
		return new Object[] { match, jType, typeAccess, method, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_5_collectcontextelements_greenBBB(Match match,
			Type jType, AbstractMethodDeclaration method) {
		match.getContextNodes().add(jType);
		match.getContextNodes().add(method);
		return new Object[] { match, jType, method };
	}

	public static final void pattern_VariableDec2Parameter4_0_6_registerobjectstomatch_expressionBBBBBB(
			VariableDec2Parameter4 _this, Match match, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec) {
		_this.registerObjectsToMatch_FWD(match, jType, typeAccess, method, variableDec);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_1 = isApplicableMatch.getObject("operation");
		EObject _localVariable_2 = isApplicableMatch.getObject("jType");
		EObject _localVariable_3 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_4 = isApplicableMatch.getObject("uType");
		EObject _localVariable_5 = isApplicableMatch.getObject("method");
		EObject _localVariable_6 = isApplicableMatch.getObject("md2o");
		EObject _localVariable_7 = isApplicableMatch.getObject("variableDec");
		EObject tmpNe2ne = _localVariable_0;
		EObject tmpOperation = _localVariable_1;
		EObject tmpJType = _localVariable_2;
		EObject tmpTypeAccess = _localVariable_3;
		EObject tmpUType = _localVariable_4;
		EObject tmpMethod = _localVariable_5;
		EObject tmpMd2o = _localVariable_6;
		EObject tmpVariableDec = _localVariable_7;
		if (tmpNe2ne instanceof ASTNode2Element) {
			ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				if (tmpJType instanceof Type) {
					Type jType = (Type) tmpJType;
					if (tmpTypeAccess instanceof TypeAccess) {
						TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
						if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
							org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
							if (tmpMethod instanceof AbstractMethodDeclaration) {
								AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
								if (tmpMd2o instanceof ASTNode2Element) {
									ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
									if (tmpVariableDec instanceof MSingleVariableDeclaration) {
										MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
										return new Object[] { ne2ne, operation, jType, typeAccess, uType, method, md2o,
												variableDec, isApplicableMatch };
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
			ASTNode2Element ne2ne, Operation operation, Type jType, TypeAccess typeAccess,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o,
			MSingleVariableDeclaration variableDec, VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch) {
		if (!md2o.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { ne2ne, operation, jType, typeAccess, uType, method, md2o, variableDec, csp,
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
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[0];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[1];
			Type jType = (Type) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[2];
			TypeAccess typeAccess = (TypeAccess) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[3];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[4];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[5];
			ASTNode2Element md2o = (ASTNode2Element) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[6];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[7];

			Object[] result_pattern_VariableDec2Parameter4_1_1_performtransformation_black = pattern_VariableDec2Parameter4_1_1_performtransformation_blackBBBBBBBBFBB(
					ne2ne, operation, jType, typeAccess, uType, method, md2o, variableDec, _this, isApplicableMatch);
			if (result_pattern_VariableDec2Parameter4_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VariableDec2Parameter4_1_1_performtransformation_black[8];

				return new Object[] { ne2ne, operation, jType, typeAccess, uType, method, md2o, variableDec, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_1_performtransformation_greenBFFBBBFB(
			Operation operation, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType,
			MSingleVariableDeclaration variableDec, CSP csp) {
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Parameter param = UMLFactory.eINSTANCE.createParameter();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("param", "name");
		Object _localVariable_1 = csp.getValue("param", "direction");
		ty2p.setSource(typeAccess);
		operation.getOwnedParameters().add(param);
		ty2p.setTarget(param);
		param.setType(uType);
		vd2p.setTarget(param);
		vd2p.setSource(variableDec);
		String param_name_prime = (String) _localVariable_0;
		ParameterDirectionKind param_direction_prime = (ParameterDirectionKind) _localVariable_1;
		param.setName(param_name_prime);
		param.setDirection(param_direction_prime);
		return new Object[] { operation, ty2p, param, typeAccess, uType, variableDec, vd2p, csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_blackBBBBB(
			TypeAccess2Parameter ty2p, Parameter param, TypeAccess typeAccess, MSingleVariableDeclaration variableDec,
			ASTNode2Element vd2p) {
		return new Object[] { ty2p, param, typeAccess, variableDec, vd2p };
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_greenFBBBBB(
			TypeAccess2Parameter ty2p, Parameter param, TypeAccess typeAccess, MSingleVariableDeclaration variableDec,
			ASTNode2Element vd2p) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(ty2p);
		ruleresult.getCreatedElements().add(param);
		ruleresult.getTranslatedElements().add(typeAccess);
		ruleresult.getTranslatedElements().add(variableDec);
		ruleresult.getCreatedLinkElements().add(vd2p);
		return new Object[] { ruleresult, ty2p, param, typeAccess, variableDec, vd2p };
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ne2ne, EObject operation, EObject ty2p, EObject param, EObject jType,
			EObject typeAccess, EObject uType, EObject method, EObject md2o, EObject variableDec, EObject vd2p) {
		if (!ne2ne.equals(operation)) {
			if (!ne2ne.equals(ty2p)) {
				if (!ne2ne.equals(param)) {
					if (!ne2ne.equals(typeAccess)) {
						if (!ne2ne.equals(uType)) {
							if (!ne2ne.equals(variableDec)) {
								if (!ne2ne.equals(vd2p)) {
									if (!operation.equals(ty2p)) {
										if (!operation.equals(param)) {
											if (!operation.equals(typeAccess)) {
												if (!operation.equals(uType)) {
													if (!operation.equals(variableDec)) {
														if (!operation.equals(vd2p)) {
															if (!ty2p.equals(typeAccess)) {
																if (!ty2p.equals(uType)) {
																	if (!ty2p.equals(variableDec)) {
																		if (!ty2p.equals(vd2p)) {
																			if (!param.equals(ty2p)) {
																				if (!param.equals(typeAccess)) {
																					if (!param.equals(uType)) {
																						if (!param
																								.equals(variableDec)) {
																							if (!param.equals(vd2p)) {
																								if (!jType.equals(
																										ne2ne)) {
																									if (!jType.equals(
																											operation)) {
																										if (!jType
																												.equals(ty2p)) {
																											if (!jType
																													.equals(param)) {
																												if (!jType
																														.equals(typeAccess)) {
																													if (!jType
																															.equals(uType)) {
																														if (!jType
																																.equals(method)) {
																															if (!jType
																																	.equals(md2o)) {
																																if (!jType
																																		.equals(variableDec)) {
																																	if (!jType
																																			.equals(vd2p)) {
																																		if (!typeAccess
																																				.equals(uType)) {
																																			if (!typeAccess
																																					.equals(variableDec)) {
																																				if (!typeAccess
																																						.equals(vd2p)) {
																																					if (!uType
																																							.equals(variableDec)) {
																																						if (!uType
																																								.equals(vd2p)) {
																																							if (!method
																																									.equals(ne2ne)) {
																																								if (!method
																																										.equals(operation)) {
																																									if (!method
																																											.equals(ty2p)) {
																																										if (!method
																																												.equals(param)) {
																																											if (!method
																																													.equals(typeAccess)) {
																																												if (!method
																																														.equals(uType)) {
																																													if (!method
																																															.equals(variableDec)) {
																																														if (!method
																																																.equals(vd2p)) {
																																															if (!md2o
																																																	.equals(ne2ne)) {
																																																if (!md2o
																																																		.equals(operation)) {
																																																	if (!md2o
																																																			.equals(ty2p)) {
																																																		if (!md2o
																																																				.equals(param)) {
																																																			if (!md2o
																																																					.equals(typeAccess)) {
																																																				if (!md2o
																																																						.equals(uType)) {
																																																					if (!md2o
																																																							.equals(method)) {
																																																						if (!md2o
																																																								.equals(variableDec)) {
																																																							if (!md2o
																																																									.equals(vd2p)) {
																																																								if (!variableDec
																																																										.equals(vd2p)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											ne2ne,
																																																											operation,
																																																											ty2p,
																																																											param,
																																																											jType,
																																																											typeAccess,
																																																											uType,
																																																											method,
																																																											md2o,
																																																											variableDec,
																																																											vd2p };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject operation, EObject ty2p, EObject param, EObject jType,
			EObject typeAccess, EObject uType, EObject method, EObject variableDec, EObject vd2p) {
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__variableDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VariableDec2Parameter4";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		String ty2p__param____target_name_prime = "target";
		String ty2p__typeAccess____source_name_prime = "source";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String param__uType____type_name_prime = "type";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String variableDec__typeAccess____type_name_prime = "type";
		String vd2p__param____target_name_prime = "target";
		String vd2p__variableDec____source_name_prime = "source";
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		ruleresult.getCreatedEdges().add(operation__param____ownedParameter);
		ty2p__param____target.setSrc(ty2p);
		ty2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(ty2p__param____target);
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
		vd2p__variableDec____source.setSrc(vd2p);
		vd2p__variableDec____source.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(vd2p__variableDec____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		ty2p__param____target.setName(ty2p__param____target_name_prime);
		ty2p__typeAccess____source.setName(ty2p__typeAccess____source_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		vd2p__param____target.setName(vd2p__param____target_name_prime);
		vd2p__variableDec____source.setName(vd2p__variableDec____source_name_prime);
		return new Object[] { ruleresult, operation, ty2p, param, jType, typeAccess, uType, method, variableDec, vd2p,
				operation__param____ownedParameter, ty2p__param____target, ty2p__typeAccess____source,
				typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess, param__uType____type,
				method__variableDec____parameters, variableDec__method____methodDeclaration,
				variableDec__typeAccess____type, vd2p__param____target, vd2p__variableDec____source };
	}

	public static final void pattern_VariableDec2Parameter4_1_5_registerobjects_expressionBBBBBBBBBBBBB(
			VariableDec2Parameter4 _this, PerformRuleResult ruleresult, EObject ne2ne, EObject operation, EObject ty2p,
			EObject param, EObject jType, EObject typeAccess, EObject uType, EObject method, EObject md2o,
			EObject variableDec, EObject vd2p) {
		_this.registerObjects_FWD(ruleresult, ne2ne, operation, ty2p, param, jType, typeAccess, uType, method, md2o,
				variableDec, vd2p);

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
		EObject _localVariable_0 = match.getObject("jType");
		EObject _localVariable_1 = match.getObject("typeAccess");
		EObject _localVariable_2 = match.getObject("method");
		EObject _localVariable_3 = match.getObject("variableDec");
		EObject tmpJType = _localVariable_0;
		EObject tmpTypeAccess = _localVariable_1;
		EObject tmpMethod = _localVariable_2;
		EObject tmpVariableDec = _localVariable_3;
		if (tmpJType instanceof Type) {
			Type jType = (Type) tmpJType;
			if (tmpTypeAccess instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
				if (tmpMethod instanceof AbstractMethodDeclaration) {
					AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
					if (tmpVariableDec instanceof MSingleVariableDeclaration) {
						MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
						return new Object[] { jType, typeAccess, method, variableDec, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_2_2_corematch_blackFFBBFBFBB(Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec,
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
							_result.add(new Object[] { ne2ne, operation, jType, typeAccess, uType, method, md2o,
									variableDec, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_2_3_findcontext_blackBBBBBBBB(
			ASTNode2Element ne2ne, Operation operation, Type jType, TypeAccess typeAccess,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o,
			MSingleVariableDeclaration variableDec) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!md2o.equals(ne2ne)) {
			if (jType.equals(ne2ne.getSource())) {
				if (jType.equals(typeAccess.getType())) {
					if (uType.equals(ne2ne.getTarget())) {
						if (method.getParameters().contains(variableDec)) {
							if (typeAccess.equals(variableDec.getType())) {
								if (operation.equals(md2o.getTarget())) {
									if (method.equals(md2o.getSource())) {
										_result.add(new Object[] { ne2ne, operation, jType, typeAccess, uType, method,
												md2o, variableDec });
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
			ASTNode2Element ne2ne, Operation operation, Type jType, TypeAccess typeAccess,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o,
			MSingleVariableDeclaration variableDec) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2ne__jType____source_name_prime = "source";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ne2ne__uType____target_name_prime = "target";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String variableDec__typeAccess____type_name_prime = "type";
		String md2o__operation____target_name_prime = "target";
		String md2o__method____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(md2o);
		isApplicableMatch.getAllContextElements().add(variableDec);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(jType__typeAccess____usagesInTypeAccess);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		isApplicableMatch.getAllContextElements().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		isApplicableMatch.getAllContextElements().add(variableDec__method____methodDeclaration);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(variableDec__typeAccess____type);
		md2o__operation____target.setSrc(md2o);
		md2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(md2o__operation____target);
		md2o__method____source.setSrc(md2o);
		md2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(md2o__method____source);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		md2o__operation____target.setName(md2o__operation____target_name_prime);
		md2o__method____source.setName(md2o__method____source_name_prime);
		return new Object[] { ne2ne, operation, jType, typeAccess, uType, method, md2o, variableDec, isApplicableMatch,
				ne2ne__jType____source, typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess,
				ne2ne__uType____target, method__variableDec____parameters, variableDec__method____methodDeclaration,
				variableDec__typeAccess____type, md2o__operation____target, md2o__method____source };
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_4_solveCSP_bindingFBBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Operation operation, Type jType, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o, MSingleVariableDeclaration variableDec) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, ne2ne, operation, jType, typeAccess,
				uType, method, md2o, variableDec);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ne2ne, operation, jType, typeAccess, uType, method,
					md2o, variableDec };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Operation operation, Type jType, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o, MSingleVariableDeclaration variableDec) {
		Object[] result_pattern_VariableDec2Parameter4_2_4_solveCSP_binding = pattern_VariableDec2Parameter4_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, ne2ne, operation, jType, typeAccess, uType, method, md2o, variableDec);
		if (result_pattern_VariableDec2Parameter4_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_2_4_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_2_4_solveCSP_black = pattern_VariableDec2Parameter4_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ne2ne, operation, jType, typeAccess, uType, method,
						md2o, variableDec };
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
			VariableDec2Parameter4 _this, Match match, Operation operation, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		return new Object[] { _this, match, operation, param, uType };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingFBBBBB(
			VariableDec2Parameter4 _this, Match match, Operation operation, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, operation, param, uType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, operation, param, uType };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingAndBlackFBBBBB(
			VariableDec2Parameter4 _this, Match match, Operation operation, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		Object[] result_pattern_VariableDec2Parameter4_10_2_SolveCSP_binding = pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingFBBBBB(
				_this, match, operation, param, uType);
		if (result_pattern_VariableDec2Parameter4_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_10_2_SolveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_10_2_SolveCSP_black = pattern_VariableDec2Parameter4_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, operation, param, uType };
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
			Match match, Operation operation, Parameter param, org.eclipse.uml2.uml.Type uType) {
		return new Object[] { match, operation, param, uType };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Operation operation, Parameter param, org.eclipse.uml2.uml.Type uType) {
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(param);
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		String param__uType____type_name_prime = "type";
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		match.getToBeTranslatedEdges().add(operation__param____ownedParameter);
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		match.getToBeTranslatedEdges().add(param__uType____type);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		return new Object[] { match, operation, param, uType, operation__param____ownedParameter,
				param__uType____type };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_5_collectcontextelements_blackBBBB(Match match,
			Operation operation, Parameter param, org.eclipse.uml2.uml.Type uType) {
		return new Object[] { match, operation, param, uType };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_5_collectcontextelements_greenBBB(Match match,
			Operation operation, org.eclipse.uml2.uml.Type uType) {
		match.getContextNodes().add(operation);
		match.getContextNodes().add(uType);
		return new Object[] { match, operation, uType };
	}

	public static final void pattern_VariableDec2Parameter4_10_6_registerobjectstomatch_expressionBBBBB(
			VariableDec2Parameter4 _this, Match match, Operation operation, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		_this.registerObjectsToMatch_BWD(match, operation, param, uType);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_1 = isApplicableMatch.getObject("operation");
		EObject _localVariable_2 = isApplicableMatch.getObject("param");
		EObject _localVariable_3 = isApplicableMatch.getObject("jType");
		EObject _localVariable_4 = isApplicableMatch.getObject("uType");
		EObject _localVariable_5 = isApplicableMatch.getObject("method");
		EObject _localVariable_6 = isApplicableMatch.getObject("md2o");
		EObject tmpNe2ne = _localVariable_0;
		EObject tmpOperation = _localVariable_1;
		EObject tmpParam = _localVariable_2;
		EObject tmpJType = _localVariable_3;
		EObject tmpUType = _localVariable_4;
		EObject tmpMethod = _localVariable_5;
		EObject tmpMd2o = _localVariable_6;
		if (tmpNe2ne instanceof ASTNode2Element) {
			ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				if (tmpParam instanceof Parameter) {
					Parameter param = (Parameter) tmpParam;
					if (tmpJType instanceof Type) {
						Type jType = (Type) tmpJType;
						if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
							org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
							if (tmpMethod instanceof AbstractMethodDeclaration) {
								AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
								if (tmpMd2o instanceof ASTNode2Element) {
									ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
									return new Object[] { ne2ne, operation, param, jType, uType, method, md2o,
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
			ASTNode2Element ne2ne, Operation operation, Parameter param, Type jType, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o, VariableDec2Parameter4 _this,
			IsApplicableMatch isApplicableMatch) {
		if (!md2o.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { ne2ne, operation, param, jType, uType, method, md2o, csp, _this,
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
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[0];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[1];
			Parameter param = (Parameter) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[2];
			Type jType = (Type) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[3];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[4];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[5];
			ASTNode2Element md2o = (ASTNode2Element) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[6];

			Object[] result_pattern_VariableDec2Parameter4_11_1_performtransformation_black = pattern_VariableDec2Parameter4_11_1_performtransformation_blackBBBBBBBFBB(
					ne2ne, operation, param, jType, uType, method, md2o, _this, isApplicableMatch);
			if (result_pattern_VariableDec2Parameter4_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VariableDec2Parameter4_11_1_performtransformation_black[7];

				return new Object[] { ne2ne, operation, param, jType, uType, method, md2o, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_1_performtransformation_greenFBBFBFFB(
			Parameter param, Type jType, AbstractMethodDeclaration method, CSP csp) {
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		MSingleVariableDeclaration variableDec = ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("variableDec", "name");
		ty2p.setTarget(param);
		ty2p.setSource(typeAccess);
		typeAccess.setType(jType);
		method.getParameters().add(variableDec);
		variableDec.setType(typeAccess);
		vd2p.setTarget(param);
		vd2p.setSource(variableDec);
		String variableDec_name_prime = (String) _localVariable_0;
		variableDec.setName(variableDec_name_prime);
		return new Object[] { ty2p, param, jType, typeAccess, method, variableDec, vd2p, csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_blackBBBBB(
			TypeAccess2Parameter ty2p, Parameter param, TypeAccess typeAccess, MSingleVariableDeclaration variableDec,
			ASTNode2Element vd2p) {
		return new Object[] { ty2p, param, typeAccess, variableDec, vd2p };
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_greenFBBBBB(
			TypeAccess2Parameter ty2p, Parameter param, TypeAccess typeAccess, MSingleVariableDeclaration variableDec,
			ASTNode2Element vd2p) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(ty2p);
		ruleresult.getTranslatedElements().add(param);
		ruleresult.getCreatedElements().add(typeAccess);
		ruleresult.getCreatedElements().add(variableDec);
		ruleresult.getCreatedLinkElements().add(vd2p);
		return new Object[] { ruleresult, ty2p, param, typeAccess, variableDec, vd2p };
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ne2ne, EObject operation, EObject ty2p, EObject param, EObject jType,
			EObject typeAccess, EObject uType, EObject method, EObject md2o, EObject variableDec, EObject vd2p) {
		if (!ne2ne.equals(operation)) {
			if (!ne2ne.equals(ty2p)) {
				if (!ne2ne.equals(param)) {
					if (!ne2ne.equals(typeAccess)) {
						if (!ne2ne.equals(uType)) {
							if (!ne2ne.equals(variableDec)) {
								if (!ne2ne.equals(vd2p)) {
									if (!operation.equals(ty2p)) {
										if (!operation.equals(param)) {
											if (!operation.equals(typeAccess)) {
												if (!operation.equals(uType)) {
													if (!operation.equals(variableDec)) {
														if (!operation.equals(vd2p)) {
															if (!ty2p.equals(typeAccess)) {
																if (!ty2p.equals(uType)) {
																	if (!ty2p.equals(variableDec)) {
																		if (!ty2p.equals(vd2p)) {
																			if (!param.equals(ty2p)) {
																				if (!param.equals(typeAccess)) {
																					if (!param.equals(uType)) {
																						if (!param
																								.equals(variableDec)) {
																							if (!param.equals(vd2p)) {
																								if (!jType.equals(
																										ne2ne)) {
																									if (!jType.equals(
																											operation)) {
																										if (!jType
																												.equals(ty2p)) {
																											if (!jType
																													.equals(param)) {
																												if (!jType
																														.equals(typeAccess)) {
																													if (!jType
																															.equals(uType)) {
																														if (!jType
																																.equals(method)) {
																															if (!jType
																																	.equals(md2o)) {
																																if (!jType
																																		.equals(variableDec)) {
																																	if (!jType
																																			.equals(vd2p)) {
																																		if (!typeAccess
																																				.equals(uType)) {
																																			if (!typeAccess
																																					.equals(variableDec)) {
																																				if (!typeAccess
																																						.equals(vd2p)) {
																																					if (!uType
																																							.equals(variableDec)) {
																																						if (!uType
																																								.equals(vd2p)) {
																																							if (!method
																																									.equals(ne2ne)) {
																																								if (!method
																																										.equals(operation)) {
																																									if (!method
																																											.equals(ty2p)) {
																																										if (!method
																																												.equals(param)) {
																																											if (!method
																																													.equals(typeAccess)) {
																																												if (!method
																																														.equals(uType)) {
																																													if (!method
																																															.equals(variableDec)) {
																																														if (!method
																																																.equals(vd2p)) {
																																															if (!md2o
																																																	.equals(ne2ne)) {
																																																if (!md2o
																																																		.equals(operation)) {
																																																	if (!md2o
																																																			.equals(ty2p)) {
																																																		if (!md2o
																																																				.equals(param)) {
																																																			if (!md2o
																																																					.equals(typeAccess)) {
																																																				if (!md2o
																																																						.equals(uType)) {
																																																					if (!md2o
																																																							.equals(method)) {
																																																						if (!md2o
																																																								.equals(variableDec)) {
																																																							if (!md2o
																																																									.equals(vd2p)) {
																																																								if (!variableDec
																																																										.equals(vd2p)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											ne2ne,
																																																											operation,
																																																											ty2p,
																																																											param,
																																																											jType,
																																																											typeAccess,
																																																											uType,
																																																											method,
																																																											md2o,
																																																											variableDec,
																																																											vd2p };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject operation, EObject ty2p, EObject param, EObject jType,
			EObject typeAccess, EObject uType, EObject method, EObject variableDec, EObject vd2p) {
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__variableDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VariableDec2Parameter4";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		String ty2p__param____target_name_prime = "target";
		String ty2p__typeAccess____source_name_prime = "source";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String param__uType____type_name_prime = "type";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String variableDec__typeAccess____type_name_prime = "type";
		String vd2p__param____target_name_prime = "target";
		String vd2p__variableDec____source_name_prime = "source";
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		ruleresult.getTranslatedEdges().add(operation__param____ownedParameter);
		ty2p__param____target.setSrc(ty2p);
		ty2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(ty2p__param____target);
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
		vd2p__variableDec____source.setSrc(vd2p);
		vd2p__variableDec____source.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(vd2p__variableDec____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		ty2p__param____target.setName(ty2p__param____target_name_prime);
		ty2p__typeAccess____source.setName(ty2p__typeAccess____source_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		vd2p__param____target.setName(vd2p__param____target_name_prime);
		vd2p__variableDec____source.setName(vd2p__variableDec____source_name_prime);
		return new Object[] { ruleresult, operation, ty2p, param, jType, typeAccess, uType, method, variableDec, vd2p,
				operation__param____ownedParameter, ty2p__param____target, ty2p__typeAccess____source,
				typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess, param__uType____type,
				method__variableDec____parameters, variableDec__method____methodDeclaration,
				variableDec__typeAccess____type, vd2p__param____target, vd2p__variableDec____source };
	}

	public static final void pattern_VariableDec2Parameter4_11_5_registerobjects_expressionBBBBBBBBBBBBB(
			VariableDec2Parameter4 _this, PerformRuleResult ruleresult, EObject ne2ne, EObject operation, EObject ty2p,
			EObject param, EObject jType, EObject typeAccess, EObject uType, EObject method, EObject md2o,
			EObject variableDec, EObject vd2p) {
		_this.registerObjects_BWD(ruleresult, ne2ne, operation, ty2p, param, jType, typeAccess, uType, method, md2o,
				variableDec, vd2p);

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
		EObject _localVariable_0 = match.getObject("operation");
		EObject _localVariable_1 = match.getObject("param");
		EObject _localVariable_2 = match.getObject("uType");
		EObject tmpOperation = _localVariable_0;
		EObject tmpParam = _localVariable_1;
		EObject tmpUType = _localVariable_2;
		if (tmpOperation instanceof Operation) {
			Operation operation = (Operation) tmpOperation;
			if (tmpParam instanceof Parameter) {
				Parameter param = (Parameter) tmpParam;
				if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
					org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
					return new Object[] { operation, param, uType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_12_2_corematch_blackFBBFBFFB(
			Operation operation, Parameter param, org.eclipse.uml2.uml.Type uType, Match match) {
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
							_result.add(new Object[] { ne2ne, operation, param, jType, uType, method, md2o, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_12_3_findcontext_blackBBBBBBB(
			ASTNode2Element ne2ne, Operation operation, Parameter param, Type jType, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!md2o.equals(ne2ne)) {
			if (operation.getOwnedParameters().contains(param)) {
				if (jType.equals(ne2ne.getSource())) {
					if (uType.equals(ne2ne.getTarget())) {
						if (uType.equals(param.getType())) {
							if (operation.equals(md2o.getTarget())) {
								if (method.equals(md2o.getSource())) {
									_result.add(new Object[] { ne2ne, operation, param, jType, uType, method, md2o });
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
			ASTNode2Element ne2ne, Operation operation, Parameter param, Type jType, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		String ne2ne__jType____source_name_prime = "source";
		String ne2ne__uType____target_name_prime = "target";
		String param__uType____type_name_prime = "type";
		String md2o__operation____target_name_prime = "target";
		String md2o__method____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(param);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(md2o);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		isApplicableMatch.getAllContextElements().add(operation__param____ownedParameter);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(param__uType____type);
		md2o__operation____target.setSrc(md2o);
		md2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(md2o__operation____target);
		md2o__method____source.setSrc(md2o);
		md2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(md2o__method____source);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		md2o__operation____target.setName(md2o__operation____target_name_prime);
		md2o__method____source.setName(md2o__method____source_name_prime);
		return new Object[] { ne2ne, operation, param, jType, uType, method, md2o, isApplicableMatch,
				operation__param____ownedParameter, ne2ne__jType____source, ne2ne__uType____target,
				param__uType____type, md2o__operation____target, md2o__method____source };
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_4_solveCSP_bindingFBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Operation operation, Parameter param, Type jType, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, ne2ne, operation, param, jType, uType,
				method, md2o);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ne2ne, operation, param, jType, uType, method, md2o };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Operation operation, Parameter param, Type jType, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o) {
		Object[] result_pattern_VariableDec2Parameter4_12_4_solveCSP_binding = pattern_VariableDec2Parameter4_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, ne2ne, operation, param, jType, uType, method, md2o);
		if (result_pattern_VariableDec2Parameter4_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_12_4_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_12_4_solveCSP_black = pattern_VariableDec2Parameter4_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ne2ne, operation, param, jType, uType, method,
						md2o };
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
			EMoflonEdge _edge_ownedParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperation = _edge_ownedParameter.getSrc();
		if (tmpOperation instanceof Operation) {
			Operation operation = (Operation) tmpOperation;
			EObject tmpParam = _edge_ownedParameter.getTrg();
			if (tmpParam instanceof Parameter) {
				Parameter param = (Parameter) tmpParam;
				if (operation.getOwnedParameters().contains(param)) {
					org.eclipse.uml2.uml.Type uType = param.getType();
					if (uType != null) {
						_result.add(new Object[] { operation, param, uType, _edge_ownedParameter });
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
			VariableDec2Parameter4 _this, Match match, Operation operation, Parameter param,
			org.eclipse.uml2.uml.Type uType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, operation, param, uType);
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
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_184448 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_184448)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_244043 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ArrayType __DEC_typeAccess_elementType_40302 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			if (!jType.equals(__DEC_typeAccess_elementType_40302)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_903319 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_903319)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		for (MethodDeclaration __DEC_typeAccess_returnType_10565 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, MethodDeclaration.class, "returnType")) {
			if (!method.equals(__DEC_typeAccess_returnType_10565)) {
				return new Object[] { typeAccess, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_5BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_371923 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_371923)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_263856 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeAccess = _edge_type.getSrc();
		if (tmpTypeAccess instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
			EObject tmpJType = _edge_type.getTrg();
			if (tmpJType instanceof Type) {
				Type jType = (Type) tmpJType;
				if (jType.equals(typeAccess.getType())) {
					if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_1B(typeAccess) == null) {
						if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_6B(typeAccess) == null) {
							if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_0BB(typeAccess,
									jType) == null) {
								if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_2BB(typeAccess,
										jType) == null) {
									if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_3BB(
											typeAccess, jType) == null) {
										if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_5BB(
												typeAccess, jType) == null) {
											for (SingleVariableDeclaration tmpVariableDec : org.moflon.core.utilities.eMoflonEMFUtil
													.getOppositeReferenceTyped(typeAccess,
															SingleVariableDeclaration.class, "type")) {
												if (tmpVariableDec instanceof MSingleVariableDeclaration) {
													MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
													AbstractMethodDeclaration method = variableDec
															.getMethodDeclaration();
													if (method != null) {
														if (pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_4BB(
																typeAccess, method) == null) {
															_result.add(new Object[] { jType, typeAccess, method,
																	variableDec, _edge_type });
														}
													}

												}
											}
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
			VariableDec2Parameter4 _this, Match match, Type jType, TypeAccess typeAccess,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jType, typeAccess, method, variableDec);
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
		EObject _localVariable_0 = targetMatch.getObject("operation");
		EObject _localVariable_1 = targetMatch.getObject("param");
		EObject _localVariable_2 = sourceMatch.getObject("jType");
		EObject _localVariable_3 = sourceMatch.getObject("typeAccess");
		EObject _localVariable_4 = targetMatch.getObject("uType");
		EObject _localVariable_5 = sourceMatch.getObject("method");
		EObject _localVariable_6 = sourceMatch.getObject("variableDec");
		EObject tmpOperation = _localVariable_0;
		EObject tmpParam = _localVariable_1;
		EObject tmpJType = _localVariable_2;
		EObject tmpTypeAccess = _localVariable_3;
		EObject tmpUType = _localVariable_4;
		EObject tmpMethod = _localVariable_5;
		EObject tmpVariableDec = _localVariable_6;
		if (tmpOperation instanceof Operation) {
			Operation operation = (Operation) tmpOperation;
			if (tmpParam instanceof Parameter) {
				Parameter param = (Parameter) tmpParam;
				if (tmpJType instanceof Type) {
					Type jType = (Type) tmpJType;
					if (tmpTypeAccess instanceof TypeAccess) {
						TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
						if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
							org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
							if (tmpMethod instanceof AbstractMethodDeclaration) {
								AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
								if (tmpVariableDec instanceof MSingleVariableDeclaration) {
									MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
									return new Object[] { operation, param, jType, typeAccess, uType, method,
											variableDec, targetMatch, sourceMatch };
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
			Operation operation, Parameter param, Type jType, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { operation, param, jType, typeAccess, uType, method, variableDec, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding = pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding != null) {
			Operation operation = (Operation) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[0];
			Parameter param = (Parameter) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[1];
			Type jType = (Type) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[2];
			TypeAccess typeAccess = (TypeAccess) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[3];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[4];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[5];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_black = pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					operation, param, jType, typeAccess, uType, method, variableDec, sourceMatch, targetMatch);
			if (result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { operation, param, jType, typeAccess, uType, method, variableDec, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_3_solvecsp_bindingFBBBBBBBBBB(
			VariableDec2Parameter4 _this, Operation operation, Parameter param, Type jType, TypeAccess typeAccess,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(operation, param, jType, typeAccess, uType, method,
				variableDec, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, operation, param, jType, typeAccess, uType, method, variableDec,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			VariableDec2Parameter4 _this, Operation operation, Parameter param, Type jType, TypeAccess typeAccess,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VariableDec2Parameter4_24_3_solvecsp_binding = pattern_VariableDec2Parameter4_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, operation, param, jType, typeAccess, uType, method, variableDec, sourceMatch, targetMatch);
		if (result_pattern_VariableDec2Parameter4_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_24_3_solvecsp_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_24_3_solvecsp_black = pattern_VariableDec2Parameter4_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, operation, param, jType, typeAccess, uType, method, variableDec,
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

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_24_5_matchcorrcontext_blackFBBBBFBB(
			Operation operation, Type jType, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jType,
					ASTNode2Element.class, "source")) {
				if (uType.equals(ne2ne.getTarget())) {
					for (ASTNode2Element md2o : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(operation, ASTNode2Element.class, "target")) {
						if (!md2o.equals(ne2ne)) {
							if (method.equals(md2o.getSource())) {
								_result.add(new Object[] { ne2ne, operation, jType, uType, method, md2o, sourceMatch,
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
			Operation operation, Parameter param, Type jType, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec, CCMatch ccMatch) {
		return new Object[] { operation, param, jType, typeAccess, uType, method, variableDec, ccMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_6_createcorrespondence_greenFBBBFB(Parameter param,
			TypeAccess typeAccess, MSingleVariableDeclaration variableDec, CCMatch ccMatch) {
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		ty2p.setTarget(param);
		ty2p.setSource(typeAccess);
		ccMatch.getCreateCorr().add(ty2p);
		vd2p.setTarget(param);
		vd2p.setSource(variableDec);
		ccMatch.getCreateCorr().add(vd2p);
		return new Object[] { ty2p, param, typeAccess, variableDec, vd2p, ccMatch };
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
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_52502 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_52502)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_152383 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ArrayType __DEC_typeAccess_elementType_747491 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			if (!jType.equals(__DEC_typeAccess_elementType_747491)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_3BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_282357 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_282357)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_4BB(
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		for (MethodDeclaration __DEC_typeAccess_returnType_993505 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, MethodDeclaration.class, "returnType")) {
			if (!method.equals(__DEC_typeAccess_returnType_993505)) {
				return new Object[] { typeAccess, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_5BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_781302 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_781302)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_748120 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_blackBBBB(Type jType,
			TypeAccess typeAccess, AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec) {
		if (jType.equals(typeAccess.getType())) {
			if (method.getParameters().contains(variableDec)) {
				if (typeAccess.equals(variableDec.getType())) {
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
												return new Object[] { jType, typeAccess, method, variableDec };
											}
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

	public static final Object[] pattern_VariableDec2Parameter4_28_1_matchtggpattern_blackBBB(Operation operation,
			Parameter param, org.eclipse.uml2.uml.Type uType) {
		if (operation.getOwnedParameters().contains(param)) {
			if (uType.equals(param.getType())) {
				return new Object[] { operation, param, uType };
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
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Type jType) {
		if (ruleResult.getSourceObjects().contains(jType)) {
			return new Object[] { ruleResult, jType };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Type uType) {
		if (ruleResult.getTargetObjects().contains(uType)) {
			return new Object[] { ruleResult, uType };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Operation operation) {
		if (ruleResult.getTargetObjects().contains(operation)) {
			return new Object[] { ruleResult, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element md2o) {
		if (ruleResult.getCorrObjects().contains(md2o)) {
			return new Object[] { ruleResult, md2o };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodDeclaration method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
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
							ASTNode tmpJType = ne2ne.getSource();
							if (tmpJType instanceof Type) {
								Type jType = (Type) tmpJType;
								Element tmpUType = ne2ne.getTarget();
								if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
									org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
									if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											ne2ne) == null) {
										if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, jType) == null) {
											if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, uType) == null) {
												for (EObject tmpMd2o : md2oList.getEntryObjects()) {
													if (tmpMd2o instanceof ASTNode2Element) {
														ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
														if (!md2o.equals(ne2ne)) {
															Element tmpOperation = md2o.getTarget();
															if (tmpOperation instanceof Operation) {
																Operation operation = (Operation) tmpOperation;
																ASTNode tmpMethod = md2o.getSource();
																if (tmpMethod instanceof AbstractMethodDeclaration) {
																	AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
																	if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, md2o) == null) {
																		if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, operation) == null) {
																			if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, method) == null) {
																				_result.add(new Object[] { ne2neList,
																						ne2ne, jType, uType, md2oList,
																						operation, md2o, method,
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
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Operation operation, Type jType, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ne2ne, operation, jType, uType,
				method, md2o, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ne2ne, operation, jType, uType, method, md2o,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			Operation operation, Type jType, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_VariableDec2Parameter4_29_3_solveCSP_binding = pattern_VariableDec2Parameter4_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, ne2ne, operation, jType, uType, method, md2o, ruleResult);
		if (result_pattern_VariableDec2Parameter4_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_29_3_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_29_3_solveCSP_black = pattern_VariableDec2Parameter4_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ne2ne, operation, jType, uType, method, md2o,
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

	public static final Object[] pattern_VariableDec2Parameter4_29_5_checknacs_blackBBBBBB(ASTNode2Element ne2ne,
			Operation operation, Type jType, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o) {
		if (!md2o.equals(ne2ne)) {
			return new Object[] { ne2ne, operation, jType, uType, method, md2o };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_6_perform_blackBBBBBBB(ASTNode2Element ne2ne,
			Operation operation, Type jType, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o, ModelgeneratorRuleResult ruleResult) {
		if (!md2o.equals(ne2ne)) {
			return new Object[] { ne2ne, operation, jType, uType, method, md2o, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_6_perform_greenBFFBFBBFFBB(Operation operation,
			Type jType, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Parameter param = UMLFactory.eINSTANCE.createParameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		MSingleVariableDeclaration variableDec = ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("param", "name");
		Object _localVariable_1 = csp.getValue("param", "direction");
		Object _localVariable_2 = csp.getValue("variableDec", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(ty2p);
		operation.getOwnedParameters().add(param);
		ty2p.setTarget(param);
		param.setType(uType);
		ruleResult.getTargetObjects().add(param);
		ty2p.setSource(typeAccess);
		typeAccess.setType(jType);
		ruleResult.getSourceObjects().add(typeAccess);
		method.getParameters().add(variableDec);
		variableDec.setType(typeAccess);
		ruleResult.getSourceObjects().add(variableDec);
		vd2p.setTarget(param);
		vd2p.setSource(variableDec);
		ruleResult.getCorrObjects().add(vd2p);
		String param_name_prime = (String) _localVariable_0;
		ParameterDirectionKind param_direction_prime = (ParameterDirectionKind) _localVariable_1;
		String variableDec_name_prime = (String) _localVariable_2;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		param.setName(param_name_prime);
		param.setDirection(param_direction_prime);
		variableDec.setName(variableDec_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { operation, ty2p, param, jType, typeAccess, uType, method, variableDec, vd2p, ruleResult,
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
