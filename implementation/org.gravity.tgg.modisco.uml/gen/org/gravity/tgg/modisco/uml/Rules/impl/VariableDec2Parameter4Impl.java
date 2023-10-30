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
	public boolean isAppropriate_FWD(Match match, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {

		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_0_1_initialbindings_blackBBBBBB(this, match, typeAccess, method,
						variableDec, jType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeAccess] = " + typeAccess + ", " + "[method] = " + method
					+ ", " + "[variableDec] = " + variableDec + ", " + "[jType] = " + jType + ".");
		}

		Object[] result2_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, typeAccess, method,
						variableDec, jType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeAccess] = " + typeAccess + ", " + "[method] = " + method
					+ ", " + "[variableDec] = " + variableDec + ", " + "[jType] = " + jType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_0_4_collectelementstobetranslated_blackBBBBB(match, typeAccess,
							method, variableDec, jType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeAccess] = " + typeAccess + ", " + "[method] = " + method + ", " + "[variableDec] = "
						+ variableDec + ", " + "[jType] = " + jType + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
					match, typeAccess, method, variableDec, jType);
			//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result4_green[9];

			Object[] result5_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_0_5_collectcontextelements_blackBBBBB(match, typeAccess, method,
							variableDec, jType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeAccess] = " + typeAccess + ", " + "[method] = " + method + ", " + "[variableDec] = "
						+ variableDec + ", " + "[jType] = " + jType + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_5_collectcontextelements_greenBBB(match, method,
					jType);

			// 
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_0_6_registerobjectstomatch_expressionBBBBBB(this,
					match, typeAccess, method, variableDec, jType);
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
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[0];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[2];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result1_bindingAndBlack[3];
		ASTNode2Element md2o = (ASTNode2Element) result1_bindingAndBlack[4];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result1_bindingAndBlack[5];
		Type jType = (Type) result1_bindingAndBlack[6];
		Operation operation = (Operation) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_1_performtransformation_greenFFBBFBBB(typeAccess, uType, variableDec,
						operation, csp);
		TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result1_green[0];
		Parameter param = (Parameter) result1_green[1];
		ASTNode2Element vd2p = (ASTNode2Element) result1_green[4];

		Object[] result2_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_blackBBBBB(ty2p, param, typeAccess, vd2p,
						variableDec);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ty2p] = " + ty2p + ", "
					+ "[param] = " + param + ", " + "[typeAccess] = " + typeAccess + ", " + "[vd2p] = " + vd2p + ", "
					+ "[variableDec] = " + variableDec + ".");
		}
		Object[] result2_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_greenFBBBBB(ty2p, param, typeAccess, vd2p,
						variableDec);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, ty2p, param,
						typeAccess, ne2ne, uType, method, md2o, vd2p, variableDec, jType, operation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ty2p] = " + ty2p + ", " + "[param] = " + param + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[ne2ne] = " + ne2ne + ", " + "[uType] = " + uType + ", " + "[method] = " + method + ", "
					+ "[md2o] = " + md2o + ", " + "[vd2p] = " + vd2p + ", " + "[variableDec] = " + variableDec + ", "
					+ "[jType] = " + jType + ", " + "[operation] = " + operation + ".");
		}
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFF(
				ruleresult, ty2p, param, typeAccess, uType, method, vd2p, variableDec, jType, operation);
		//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge ty2p__typeAccess____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge vd2p__param____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge ty2p__param____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge vd2p__variableDec____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[20];

		// 
		// 
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_1_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, ty2p, param, typeAccess, ne2ne, uType, method, md2o, vd2p, variableDec, jType, operation);
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
		TypeAccess typeAccess = (TypeAccess) result2_binding[0];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_binding[1];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_binding[2];
		Type jType = (Type) result2_binding[3];
		for (Object[] result2_black : VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_2_2_corematch_blackBFFBFBBFB(typeAccess, method, variableDec, jType,
						match)) {
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[2];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[4];
			Operation operation = (Operation) result2_black[7];
			// ForEach 
			for (Object[] result3_black : VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_2_3_findcontext_blackBBBBBBBB(typeAccess, ne2ne, uType, method,
							md2o, variableDec, jType, operation)) {
				Object[] result3_green = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_2_3_findcontext_greenBBBBBBBBFFFFFFFFFF(typeAccess, ne2ne,
								uType, method, md2o, variableDec, jType, operation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge md2o__method____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge md2o__operation____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								typeAccess, ne2ne, uType, method, md2o, variableDec, jType, operation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeAccess] = " + typeAccess
							+ ", " + "[ne2ne] = " + ne2ne + ", " + "[uType] = " + uType + ", " + "[method] = " + method
							+ ", " + "[md2o] = " + md2o + ", " + "[variableDec] = " + variableDec + ", " + "[jType] = "
							+ jType + ", " + "[operation] = " + operation + ".");
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
	public void registerObjectsToMatch_FWD(Match match, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {
		match.registerObject("typeAccess", typeAccess);
		match.registerObject("method", method);
		match.registerObject("variableDec", variableDec);
		match.registerObject("jType", jType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeAccess typeAccess,
			ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o, MSingleVariableDeclaration variableDec, Type jType, Operation operation) {// Create CSP
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
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("variableDec", variableDec);
		isApplicableMatch.registerObject("jType", jType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject ty2p, EObject param, EObject typeAccess,
			EObject ne2ne, EObject uType, EObject method, EObject md2o, EObject vd2p, EObject variableDec,
			EObject jType, EObject operation) {
		ruleresult.registerObject("ty2p", ty2p);
		ruleresult.registerObject("param", param);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("vd2p", vd2p);
		ruleresult.registerObject("variableDec", variableDec);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("operation", operation);

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
	public boolean isAppropriate_BWD(Match match, Parameter param, org.eclipse.uml2.uml.Type uType,
			Operation operation) {

		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_10_1_initialbindings_blackBBBBB(this, match, param, uType, operation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[param] = " + param + ", " + "[uType] = " + uType + ", "
					+ "[operation] = " + operation + ".");
		}

		Object[] result2_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, param, uType,
						operation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[param] = " + param + ", " + "[uType] = " + uType + ", "
					+ "[operation] = " + operation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_10_4_collectelementstobetranslated_blackBBBB(match, param, uType,
							operation);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[param] = " + param
								+ ", " + "[uType] = " + uType + ", " + "[operation] = " + operation + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_4_collectelementstobetranslated_greenBBBBFF(
					match, param, uType, operation);
			//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result4_green[5];

			Object[] result5_black = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_10_5_collectcontextelements_blackBBBB(match, param, uType,
							operation);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[param] = " + param
								+ ", " + "[uType] = " + uType + ", " + "[operation] = " + operation + ".");
			}
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_5_collectcontextelements_greenBBB(match, uType,
					operation);

			// 
			VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_10_6_registerobjectstomatch_expressionBBBBB(this,
					match, param, uType, operation);
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
		Parameter param = (Parameter) result1_bindingAndBlack[0];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[2];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result1_bindingAndBlack[3];
		ASTNode2Element md2o = (ASTNode2Element) result1_bindingAndBlack[4];
		Type jType = (Type) result1_bindingAndBlack[5];
		Operation operation = (Operation) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_1_performtransformation_greenFBFBFFBB(param, method, jType, csp);
		TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result1_green[0];
		TypeAccess typeAccess = (TypeAccess) result1_green[2];
		ASTNode2Element vd2p = (ASTNode2Element) result1_green[4];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result1_green[5];

		Object[] result2_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_blackBBBBB(ty2p, param, typeAccess, vd2p,
						variableDec);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ty2p] = " + ty2p + ", "
					+ "[param] = " + param + ", " + "[typeAccess] = " + typeAccess + ", " + "[vd2p] = " + vd2p + ", "
					+ "[variableDec] = " + variableDec + ".");
		}
		Object[] result2_green = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_greenFBBBBB(ty2p, param, typeAccess,
						vd2p, variableDec);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, ty2p, param,
						typeAccess, ne2ne, uType, method, md2o, vd2p, variableDec, jType, operation);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[ty2p] = " + ty2p + ", " + "[param] = " + param + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[ne2ne] = " + ne2ne + ", " + "[uType] = " + uType + ", " + "[method] = " + method + ", "
					+ "[md2o] = " + md2o + ", " + "[vd2p] = " + vd2p + ", " + "[variableDec] = " + variableDec + ", "
					+ "[jType] = " + jType + ", " + "[operation] = " + operation + ".");
		}
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFF(
				ruleresult, ty2p, param, typeAccess, uType, method, vd2p, variableDec, jType, operation);
		//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge ty2p__typeAccess____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge vd2p__param____target = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge ty2p__param____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge vd2p__variableDec____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[20];

		// 
		// 
		VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_11_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, ty2p, param, typeAccess, ne2ne, uType, method, md2o, vd2p, variableDec, jType, operation);
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
		Parameter param = (Parameter) result2_binding[0];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_binding[1];
		Operation operation = (Operation) result2_binding[2];
		for (Object[] result2_black : VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_12_2_corematch_blackBFBFFFBB(param, uType, operation, match)) {
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[1];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[3];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[4];
			Type jType = (Type) result2_black[5];
			// ForEach 
			for (Object[] result3_black : VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_12_3_findcontext_blackBBBBBBB(param, ne2ne, uType, method, md2o,
							jType, operation)) {
				Object[] result3_green = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_12_3_findcontext_greenBBBBBBBFFFFFFF(param, ne2ne, uType,
								method, md2o, jType, operation);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge param__uType____type = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge ne2ne__uType____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge md2o__method____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge ne2ne__jType____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge md2o__operation____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								param, ne2ne, uType, method, md2o, jType, operation);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[param] = " + param + ", "
							+ "[ne2ne] = " + ne2ne + ", " + "[uType] = " + uType + ", " + "[method] = " + method + ", "
							+ "[md2o] = " + md2o + ", " + "[jType] = " + jType + ", " + "[operation] = " + operation
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
	public void registerObjectsToMatch_BWD(Match match, Parameter param, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		match.registerObject("param", param);
		match.registerObject("uType", uType);
		match.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Parameter param, org.eclipse.uml2.uml.Type uType,
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Parameter param, ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o, Type jType,
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
		isApplicableMatch.registerObject("param", param);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("jType", jType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject ty2p, EObject param, EObject typeAccess,
			EObject ne2ne, EObject uType, EObject method, EObject md2o, EObject vd2p, EObject variableDec,
			EObject jType, EObject operation) {
		ruleresult.registerObject("ty2p", ty2p);
		ruleresult.registerObject("param", param);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("vd2p", vd2p);
		ruleresult.registerObject("variableDec", variableDec);
		ruleresult.registerObject("jType", jType);
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_127(EMoflonEdge _edge_type) {

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
			Parameter param = (Parameter) result2_black[0];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[1];
			Operation operation = (Operation) result2_black[2];
			Object[] result2_green = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, param, uType, operation)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_136(EMoflonEdge _edge_type) {

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
			TypeAccess typeAccess = (TypeAccess) result2_black[0];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[1];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_black[2];
			Type jType = (Type) result2_black[3];
			Object[] result2_green = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, typeAccess, method, variableDec, jType)) {
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
		Parameter param = (Parameter) result2_bindingAndBlack[0];
		TypeAccess typeAccess = (TypeAccess) result2_bindingAndBlack[1];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_bindingAndBlack[2];
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_bindingAndBlack[3];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_bindingAndBlack[4];
		Type jType = (Type) result2_bindingAndBlack[5];
		Operation operation = (Operation) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, param, typeAccess, uType,
						method, variableDec, jType, operation, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[param] = " + param + ", " + "[typeAccess] = " + typeAccess + ", " + "[uType] = " + uType + ", "
					+ "[method] = " + method + ", " + "[variableDec] = " + variableDec + ", " + "[jType] = " + jType
					+ ", " + "[operation] = " + operation + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_24_5_matchcorrcontext_blackFBBFBBBB(uType, method, jType, operation,
							sourceMatch, targetMatch)) {
				ASTNode2Element ne2ne = (ASTNode2Element) result5_black[0];
				ASTNode2Element md2o = (ASTNode2Element) result5_black[3];
				Object[] result5_green = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_24_5_matchcorrcontext_greenBBBBF(ne2ne, md2o, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_24_6_createcorrespondence_blackBBBBBBBB(param, typeAccess,
								uType, method, variableDec, jType, operation, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[param] = " + param + ", "
							+ "[typeAccess] = " + typeAccess + ", " + "[uType] = " + uType + ", " + "[method] = "
							+ method + ", " + "[variableDec] = " + variableDec + ", " + "[jType] = " + jType + ", "
							+ "[operation] = " + operation + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_24_6_createcorrespondence_greenFBBFBB(param,
						typeAccess, variableDec, ccMatch);
				//nothing TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result6_green[0];
				//nothing ASTNode2Element vd2p = (ASTNode2Element) result6_green[3];

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
	public CSP isApplicable_solveCsp_CC(Parameter param, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec, Type jType, Operation operation,
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
	public boolean checkDEC_FWD(TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {// 
		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_27_1_matchtggpattern_blackBBBB(typeAccess, method, variableDec, jType);
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
	public boolean checkDEC_BWD(Parameter param, org.eclipse.uml2.uml.Type uType, Operation operation) {// 
		Object[] result1_black = VariableDec2Parameter4Impl
				.pattern_VariableDec2Parameter4_28_1_matchtggpattern_blackBBB(param, uType, operation);
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
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[2];
			Type jType = (Type) result2_black[3];
			//nothing RuleEntryList md2oList = (RuleEntryList) result2_black[4];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[5];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[6];
			Operation operation = (Operation) result2_black[7];

			Object[] result3_bindingAndBlack = VariableDec2Parameter4Impl
					.pattern_VariableDec2Parameter4_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							ne2ne, uType, method, md2o, jType, operation, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ne2ne] = " + ne2ne + ", "
						+ "[uType] = " + uType + ", " + "[method] = " + method + ", " + "[md2o] = " + md2o + ", "
						+ "[jType] = " + jType + ", " + "[operation] = " + operation + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = VariableDec2Parameter4Impl
						.pattern_VariableDec2Parameter4_29_5_checknacs_blackBBBBBB(ne2ne, uType, method, md2o, jType,
								operation);
				if (result5_black != null) {

					Object[] result6_black = VariableDec2Parameter4Impl
							.pattern_VariableDec2Parameter4_29_6_perform_blackBBBBBBB(ne2ne, uType, method, md2o, jType,
									operation, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ne2ne] = " + ne2ne
								+ ", " + "[uType] = " + uType + ", " + "[method] = " + method + ", " + "[md2o] = "
								+ md2o + ", " + "[jType] = " + jType + ", " + "[operation] = " + operation + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					VariableDec2Parameter4Impl.pattern_VariableDec2Parameter4_29_6_perform_greenFFFBBFFBBBB(uType,
							method, jType, operation, ruleResult, csp);
					//nothing TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result6_green[0];
					//nothing Parameter param = (Parameter) result6_green[1];
					//nothing TypeAccess typeAccess = (TypeAccess) result6_green[2];
					//nothing ASTNode2Element vd2p = (ASTNode2Element) result6_green[5];
					//nothing MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result6_green[6];

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
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o, Type jType,
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
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("jType", jType);
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
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_ABSTRACTMETHODDECLARATION_MSINGLEVARIABLEDECLARATION_TYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AbstractMethodDeclaration) arguments.get(2), (MSingleVariableDeclaration) arguments.get(3),
					(Type) arguments.get(4));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_ABSTRACTMETHODDECLARATION_MSINGLEVARIABLEDECLARATION_TYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AbstractMethodDeclaration) arguments.get(2), (MSingleVariableDeclaration) arguments.get(3),
					(Type) arguments.get(4));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_ABSTRACTMETHODDECLARATION_MSINGLEVARIABLEDECLARATION_TYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
					(AbstractMethodDeclaration) arguments.get(2), (MSingleVariableDeclaration) arguments.get(3),
					(Type) arguments.get(4));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEACCESS_ASTNODE2ELEMENT_TYPE_ABSTRACTMETHODDECLARATION_ASTNODE2ELEMENT_MSINGLEVARIABLEDECLARATION_TYPE_OPERATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeAccess) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (org.eclipse.uml2.uml.Type) arguments.get(3),
					(AbstractMethodDeclaration) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(MSingleVariableDeclaration) arguments.get(6), (Type) arguments.get(7),
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
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_BWD__MATCH_PARAMETER_TYPE_OPERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARAMETER_TYPE_OPERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (Operation) arguments.get(3));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARAMETER_TYPE_OPERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (Operation) arguments.get(3));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PARAMETER_ASTNODE2ELEMENT_TYPE_ABSTRACTMETHODDECLARATION_ASTNODE2ELEMENT_TYPE_OPERATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Parameter) arguments.get(1),
					(ASTNode2Element) arguments.get(2), (org.eclipse.uml2.uml.Type) arguments.get(3),
					(AbstractMethodDeclaration) arguments.get(4), (ASTNode2Element) arguments.get(5),
					(Type) arguments.get(6), (Operation) arguments.get(7));
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
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_BWD_EMOFLON_EDGE_127__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_127((EMoflonEdge) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPROPRIATE_FWD_EMOFLON_EDGE_136__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_136((EMoflonEdge) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_SOLVE_CSP_CC__PARAMETER_TYPEACCESS_TYPE_ABSTRACTMETHODDECLARATION_MSINGLEVARIABLEDECLARATION_TYPE_OPERATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Parameter) arguments.get(0), (TypeAccess) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (AbstractMethodDeclaration) arguments.get(3),
					(MSingleVariableDeclaration) arguments.get(4), (Type) arguments.get(5),
					(Operation) arguments.get(6), (Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_DEC_FWD__TYPEACCESS_ABSTRACTMETHODDECLARATION_MSINGLEVARIABLEDECLARATION_TYPE:
			return checkDEC_FWD((TypeAccess) arguments.get(0), (AbstractMethodDeclaration) arguments.get(1),
					(MSingleVariableDeclaration) arguments.get(2), (Type) arguments.get(3));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___CHECK_DEC_BWD__PARAMETER_TYPE_OPERATION:
			return checkDEC_BWD((Parameter) arguments.get(0), (org.eclipse.uml2.uml.Type) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_TYPE_ABSTRACTMETHODDECLARATION_ASTNODE2ELEMENT_TYPE_OPERATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ASTNode2Element) arguments.get(1),
					(org.eclipse.uml2.uml.Type) arguments.get(2), (AbstractMethodDeclaration) arguments.get(3),
					(ASTNode2Element) arguments.get(4), (Type) arguments.get(5), (Operation) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.VARIABLE_DEC2_PARAMETER4___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_1_initialbindings_blackBBBBBB(
			VariableDec2Parameter4 _this, Match match, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {
		return new Object[] { _this, match, typeAccess, method, variableDec, jType };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingFBBBBBB(
			VariableDec2Parameter4 _this, Match match, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, typeAccess, method, variableDec, jType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeAccess, method, variableDec, jType };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			VariableDec2Parameter4 _this, Match match, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {
		Object[] result_pattern_VariableDec2Parameter4_0_2_SolveCSP_binding = pattern_VariableDec2Parameter4_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, typeAccess, method, variableDec, jType);
		if (result_pattern_VariableDec2Parameter4_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_0_2_SolveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_0_2_SolveCSP_black = pattern_VariableDec2Parameter4_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeAccess, method, variableDec, jType };
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
			Match match, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {
		return new Object[] { match, typeAccess, method, variableDec, jType };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_4_collectelementstobetranslated_greenBBBBBFFFFF(
			Match match, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {
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
		return new Object[] { match, typeAccess, method, variableDec, jType, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, method__variableDec____parameters,
				variableDec__method____methodDeclaration, variableDec__typeAccess____type };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_5_collectcontextelements_blackBBBBB(Match match,
			TypeAccess typeAccess, AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec,
			Type jType) {
		return new Object[] { match, typeAccess, method, variableDec, jType };
	}

	public static final Object[] pattern_VariableDec2Parameter4_0_5_collectcontextelements_greenBBB(Match match,
			AbstractMethodDeclaration method, Type jType) {
		match.getContextNodes().add(method);
		match.getContextNodes().add(jType);
		return new Object[] { match, method, jType };
	}

	public static final void pattern_VariableDec2Parameter4_0_6_registerobjectstomatch_expressionBBBBBB(
			VariableDec2Parameter4 _this, Match match, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {
		_this.registerObjectsToMatch_FWD(match, typeAccess, method, variableDec, jType);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_2 = isApplicableMatch.getObject("uType");
		EObject _localVariable_3 = isApplicableMatch.getObject("method");
		EObject _localVariable_4 = isApplicableMatch.getObject("md2o");
		EObject _localVariable_5 = isApplicableMatch.getObject("variableDec");
		EObject _localVariable_6 = isApplicableMatch.getObject("jType");
		EObject _localVariable_7 = isApplicableMatch.getObject("operation");
		EObject tmpTypeAccess = _localVariable_0;
		EObject tmpNe2ne = _localVariable_1;
		EObject tmpUType = _localVariable_2;
		EObject tmpMethod = _localVariable_3;
		EObject tmpMd2o = _localVariable_4;
		EObject tmpVariableDec = _localVariable_5;
		EObject tmpJType = _localVariable_6;
		EObject tmpOperation = _localVariable_7;
		if (tmpTypeAccess instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
			if (tmpNe2ne instanceof ASTNode2Element) {
				ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
				if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
					org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
					if (tmpMethod instanceof AbstractMethodDeclaration) {
						AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
						if (tmpMd2o instanceof ASTNode2Element) {
							ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
							if (tmpVariableDec instanceof MSingleVariableDeclaration) {
								MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
								if (tmpJType instanceof Type) {
									Type jType = (Type) tmpJType;
									if (tmpOperation instanceof Operation) {
										Operation operation = (Operation) tmpOperation;
										return new Object[] { typeAccess, ne2ne, uType, method, md2o, variableDec,
												jType, operation, isApplicableMatch };
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
			TypeAccess typeAccess, ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o, MSingleVariableDeclaration variableDec, Type jType,
			Operation operation, VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch) {
		if (!md2o.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { typeAccess, ne2ne, uType, method, md2o, variableDec, jType, operation, csp,
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
			TypeAccess typeAccess = (TypeAccess) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[0];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[2];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[3];
			ASTNode2Element md2o = (ASTNode2Element) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[4];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[5];
			Type jType = (Type) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[6];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter4_1_1_performtransformation_binding[7];

			Object[] result_pattern_VariableDec2Parameter4_1_1_performtransformation_black = pattern_VariableDec2Parameter4_1_1_performtransformation_blackBBBBBBBBFBB(
					typeAccess, ne2ne, uType, method, md2o, variableDec, jType, operation, _this, isApplicableMatch);
			if (result_pattern_VariableDec2Parameter4_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VariableDec2Parameter4_1_1_performtransformation_black[8];

				return new Object[] { typeAccess, ne2ne, uType, method, md2o, variableDec, jType, operation, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_1_performtransformation_greenFFBBFBBB(
			TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType, MSingleVariableDeclaration variableDec,
			Operation operation, CSP csp) {
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Parameter param = UMLFactory.eINSTANCE.createParameter();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		Object _localVariable_0 = csp.getValue("param", "name");
		Object _localVariable_1 = csp.getValue("param", "direction");
		ty2p.setSource(typeAccess);
		param.setType(uType);
		ty2p.setTarget(param);
		operation.getOwnedParameters().add(param);
		vd2p.setTarget(param);
		vd2p.setSource(variableDec);
		String param_name_prime = (String) _localVariable_0;
		ParameterDirectionKind param_direction_prime = (ParameterDirectionKind) _localVariable_1;
		param.setName(param_name_prime);
		param.setDirection(param_direction_prime);
		return new Object[] { ty2p, param, typeAccess, uType, vd2p, variableDec, operation, csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_blackBBBBB(
			TypeAccess2Parameter ty2p, Parameter param, TypeAccess typeAccess, ASTNode2Element vd2p,
			MSingleVariableDeclaration variableDec) {
		return new Object[] { ty2p, param, typeAccess, vd2p, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_2_collecttranslatedelements_greenFBBBBB(
			TypeAccess2Parameter ty2p, Parameter param, TypeAccess typeAccess, ASTNode2Element vd2p,
			MSingleVariableDeclaration variableDec) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(ty2p);
		ruleresult.getCreatedElements().add(param);
		ruleresult.getTranslatedElements().add(typeAccess);
		ruleresult.getCreatedLinkElements().add(vd2p);
		ruleresult.getTranslatedElements().add(variableDec);
		return new Object[] { ruleresult, ty2p, param, typeAccess, vd2p, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter4_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ty2p, EObject param, EObject typeAccess, EObject ne2ne, EObject uType,
			EObject method, EObject md2o, EObject vd2p, EObject variableDec, EObject jType, EObject operation) {
		if (!ty2p.equals(typeAccess)) {
			if (!ty2p.equals(uType)) {
				if (!ty2p.equals(vd2p)) {
					if (!ty2p.equals(variableDec)) {
						if (!param.equals(ty2p)) {
							if (!param.equals(typeAccess)) {
								if (!param.equals(uType)) {
									if (!param.equals(vd2p)) {
										if (!param.equals(variableDec)) {
											if (!typeAccess.equals(uType)) {
												if (!typeAccess.equals(vd2p)) {
													if (!typeAccess.equals(variableDec)) {
														if (!ne2ne.equals(ty2p)) {
															if (!ne2ne.equals(param)) {
																if (!ne2ne.equals(typeAccess)) {
																	if (!ne2ne.equals(uType)) {
																		if (!ne2ne.equals(vd2p)) {
																			if (!ne2ne.equals(variableDec)) {
																				if (!ne2ne.equals(operation)) {
																					if (!uType.equals(vd2p)) {
																						if (!uType
																								.equals(variableDec)) {
																							if (!method.equals(ty2p)) {
																								if (!method.equals(
																										param)) {
																									if (!method.equals(
																											typeAccess)) {
																										if (!method
																												.equals(ne2ne)) {
																											if (!method
																													.equals(uType)) {
																												if (!method
																														.equals(vd2p)) {
																													if (!method
																															.equals(variableDec)) {
																														if (!method
																																.equals(operation)) {
																															if (!md2o
																																	.equals(ty2p)) {
																																if (!md2o
																																		.equals(param)) {
																																	if (!md2o
																																			.equals(typeAccess)) {
																																		if (!md2o
																																				.equals(ne2ne)) {
																																			if (!md2o
																																					.equals(uType)) {
																																				if (!md2o
																																						.equals(method)) {
																																					if (!md2o
																																							.equals(vd2p)) {
																																						if (!md2o
																																								.equals(variableDec)) {
																																							if (!md2o
																																									.equals(operation)) {
																																								if (!variableDec
																																										.equals(vd2p)) {
																																									if (!jType
																																											.equals(ty2p)) {
																																										if (!jType
																																												.equals(param)) {
																																											if (!jType
																																													.equals(typeAccess)) {
																																												if (!jType
																																														.equals(ne2ne)) {
																																													if (!jType
																																															.equals(uType)) {
																																														if (!jType
																																																.equals(method)) {
																																															if (!jType
																																																	.equals(md2o)) {
																																																if (!jType
																																																		.equals(vd2p)) {
																																																	if (!jType
																																																			.equals(variableDec)) {
																																																		if (!jType
																																																				.equals(operation)) {
																																																			if (!operation
																																																					.equals(ty2p)) {
																																																				if (!operation
																																																						.equals(param)) {
																																																					if (!operation
																																																							.equals(typeAccess)) {
																																																						if (!operation
																																																								.equals(uType)) {
																																																							if (!operation
																																																									.equals(vd2p)) {
																																																								if (!operation
																																																										.equals(variableDec)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											ty2p,
																																																											param,
																																																											typeAccess,
																																																											ne2ne,
																																																											uType,
																																																											method,
																																																											md2o,
																																																											vd2p,
																																																											variableDec,
																																																											jType,
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
			PerformRuleResult ruleresult, EObject ty2p, EObject param, EObject typeAccess, EObject uType,
			EObject method, EObject vd2p, EObject variableDec, EObject jType, EObject operation) {
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__variableDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VariableDec2Parameter4";
		String param__uType____type_name_prime = "type";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ty2p__typeAccess____source_name_prime = "source";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String vd2p__param____target_name_prime = "target";
		String ty2p__param____target_name_prime = "target";
		String vd2p__variableDec____source_name_prime = "source";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		String variableDec__typeAccess____type_name_prime = "type";
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		ruleresult.getCreatedEdges().add(param__uType____type);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		ty2p__typeAccess____source.setSrc(ty2p);
		ty2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ty2p__typeAccess____source);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		ruleresult.getTranslatedEdges().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		ruleresult.getTranslatedEdges().add(variableDec__method____methodDeclaration);
		vd2p__param____target.setSrc(vd2p);
		vd2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(vd2p__param____target);
		ty2p__param____target.setSrc(ty2p);
		ty2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(ty2p__param____target);
		vd2p__variableDec____source.setSrc(vd2p);
		vd2p__variableDec____source.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(vd2p__variableDec____source);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		ruleresult.getCreatedEdges().add(operation__param____ownedParameter);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(variableDec__typeAccess____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		ty2p__typeAccess____source.setName(ty2p__typeAccess____source_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		vd2p__param____target.setName(vd2p__param____target_name_prime);
		ty2p__param____target.setName(ty2p__param____target_name_prime);
		vd2p__variableDec____source.setName(vd2p__variableDec____source_name_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		return new Object[] { ruleresult, ty2p, param, typeAccess, uType, method, vd2p, variableDec, jType, operation,
				param__uType____type, typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess,
				ty2p__typeAccess____source, method__variableDec____parameters, variableDec__method____methodDeclaration,
				vd2p__param____target, ty2p__param____target, vd2p__variableDec____source,
				operation__param____ownedParameter, variableDec__typeAccess____type };
	}

	public static final void pattern_VariableDec2Parameter4_1_5_registerobjects_expressionBBBBBBBBBBBBB(
			VariableDec2Parameter4 _this, PerformRuleResult ruleresult, EObject ty2p, EObject param, EObject typeAccess,
			EObject ne2ne, EObject uType, EObject method, EObject md2o, EObject vd2p, EObject variableDec,
			EObject jType, EObject operation) {
		_this.registerObjects_FWD(ruleresult, ty2p, param, typeAccess, ne2ne, uType, method, md2o, vd2p, variableDec,
				jType, operation);

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
		EObject _localVariable_0 = match.getObject("typeAccess");
		EObject _localVariable_1 = match.getObject("method");
		EObject _localVariable_2 = match.getObject("variableDec");
		EObject _localVariable_3 = match.getObject("jType");
		EObject tmpTypeAccess = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		EObject tmpVariableDec = _localVariable_2;
		EObject tmpJType = _localVariable_3;
		if (tmpTypeAccess instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
			if (tmpMethod instanceof AbstractMethodDeclaration) {
				AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
				if (tmpVariableDec instanceof MSingleVariableDeclaration) {
					MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
					if (tmpJType instanceof Type) {
						Type jType = (Type) tmpJType;
						return new Object[] { typeAccess, method, variableDec, jType, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_2_2_corematch_blackBFFBFBBFB(
			TypeAccess typeAccess, AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec, Type jType,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element md2o : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(method,
				ASTNode2Element.class, "source")) {
			Element tmpOperation = md2o.getTarget();
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jType,
						ASTNode2Element.class, "source")) {
					if (!md2o.equals(ne2ne)) {
						Element tmpUType = ne2ne.getTarget();
						if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
							org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
							_result.add(new Object[] { typeAccess, ne2ne, uType, method, md2o, variableDec, jType,
									operation, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_2_3_findcontext_blackBBBBBBBB(
			TypeAccess typeAccess, ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o, MSingleVariableDeclaration variableDec, Type jType,
			Operation operation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!md2o.equals(ne2ne)) {
			if (jType.equals(typeAccess.getType())) {
				if (uType.equals(ne2ne.getTarget())) {
					if (method.getParameters().contains(variableDec)) {
						if (method.equals(md2o.getSource())) {
							if (jType.equals(ne2ne.getSource())) {
								if (operation.equals(md2o.getTarget())) {
									if (typeAccess.equals(variableDec.getType())) {
										_result.add(new Object[] { typeAccess, ne2ne, uType, method, md2o, variableDec,
												jType, operation });
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
			TypeAccess typeAccess, ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, ASTNode2Element md2o, MSingleVariableDeclaration variableDec, Type jType,
			Operation operation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ne2ne__uType____target_name_prime = "target";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String md2o__method____source_name_prime = "source";
		String ne2ne__jType____source_name_prime = "source";
		String md2o__operation____target_name_prime = "target";
		String variableDec__typeAccess____type_name_prime = "type";
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(md2o);
		isApplicableMatch.getAllContextElements().add(variableDec);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(operation);
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
		md2o__method____source.setSrc(md2o);
		md2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(md2o__method____source);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		md2o__operation____target.setSrc(md2o);
		md2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(md2o__operation____target);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(variableDec__typeAccess____type);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		md2o__method____source.setName(md2o__method____source_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		md2o__operation____target.setName(md2o__operation____target_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		return new Object[] { typeAccess, ne2ne, uType, method, md2o, variableDec, jType, operation, isApplicableMatch,
				typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess, ne2ne__uType____target,
				method__variableDec____parameters, variableDec__method____methodDeclaration, md2o__method____source,
				ne2ne__jType____source, md2o__operation____target, variableDec__typeAccess____type };
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_4_solveCSP_bindingFBBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, TypeAccess typeAccess,
			ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o, MSingleVariableDeclaration variableDec, Type jType, Operation operation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, typeAccess, ne2ne, uType, method,
				md2o, variableDec, jType, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeAccess, ne2ne, uType, method, md2o, variableDec,
					jType, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, TypeAccess typeAccess,
			ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o, MSingleVariableDeclaration variableDec, Type jType, Operation operation) {
		Object[] result_pattern_VariableDec2Parameter4_2_4_solveCSP_binding = pattern_VariableDec2Parameter4_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, typeAccess, ne2ne, uType, method, md2o, variableDec, jType, operation);
		if (result_pattern_VariableDec2Parameter4_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_2_4_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_2_4_solveCSP_black = pattern_VariableDec2Parameter4_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeAccess, ne2ne, uType, method, md2o,
						variableDec, jType, operation };
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
			VariableDec2Parameter4 _this, Match match, Parameter param, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		return new Object[] { _this, match, param, uType, operation };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingFBBBBB(
			VariableDec2Parameter4 _this, Match match, Parameter param, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, param, uType, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, param, uType, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingAndBlackFBBBBB(
			VariableDec2Parameter4 _this, Match match, Parameter param, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		Object[] result_pattern_VariableDec2Parameter4_10_2_SolveCSP_binding = pattern_VariableDec2Parameter4_10_2_SolveCSP_bindingFBBBBB(
				_this, match, param, uType, operation);
		if (result_pattern_VariableDec2Parameter4_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_10_2_SolveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_10_2_SolveCSP_black = pattern_VariableDec2Parameter4_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, param, uType, operation };
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
			Match match, Parameter param, org.eclipse.uml2.uml.Type uType, Operation operation) {
		return new Object[] { match, param, uType, operation };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_4_collectelementstobetranslated_greenBBBBFF(
			Match match, Parameter param, org.eclipse.uml2.uml.Type uType, Operation operation) {
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
		return new Object[] { match, param, uType, operation, param__uType____type,
				operation__param____ownedParameter };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_5_collectcontextelements_blackBBBB(Match match,
			Parameter param, org.eclipse.uml2.uml.Type uType, Operation operation) {
		return new Object[] { match, param, uType, operation };
	}

	public static final Object[] pattern_VariableDec2Parameter4_10_5_collectcontextelements_greenBBB(Match match,
			org.eclipse.uml2.uml.Type uType, Operation operation) {
		match.getContextNodes().add(uType);
		match.getContextNodes().add(operation);
		return new Object[] { match, uType, operation };
	}

	public static final void pattern_VariableDec2Parameter4_10_6_registerobjectstomatch_expressionBBBBB(
			VariableDec2Parameter4 _this, Match match, Parameter param, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		_this.registerObjectsToMatch_BWD(match, param, uType, operation);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("param");
		EObject _localVariable_1 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_2 = isApplicableMatch.getObject("uType");
		EObject _localVariable_3 = isApplicableMatch.getObject("method");
		EObject _localVariable_4 = isApplicableMatch.getObject("md2o");
		EObject _localVariable_5 = isApplicableMatch.getObject("jType");
		EObject _localVariable_6 = isApplicableMatch.getObject("operation");
		EObject tmpParam = _localVariable_0;
		EObject tmpNe2ne = _localVariable_1;
		EObject tmpUType = _localVariable_2;
		EObject tmpMethod = _localVariable_3;
		EObject tmpMd2o = _localVariable_4;
		EObject tmpJType = _localVariable_5;
		EObject tmpOperation = _localVariable_6;
		if (tmpParam instanceof Parameter) {
			Parameter param = (Parameter) tmpParam;
			if (tmpNe2ne instanceof ASTNode2Element) {
				ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
				if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
					org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
					if (tmpMethod instanceof AbstractMethodDeclaration) {
						AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
						if (tmpMd2o instanceof ASTNode2Element) {
							ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
							if (tmpJType instanceof Type) {
								Type jType = (Type) tmpJType;
								if (tmpOperation instanceof Operation) {
									Operation operation = (Operation) tmpOperation;
									return new Object[] { param, ne2ne, uType, method, md2o, jType, operation,
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
			Parameter param, ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o, Type jType, Operation operation, VariableDec2Parameter4 _this,
			IsApplicableMatch isApplicableMatch) {
		if (!md2o.equals(ne2ne)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { param, ne2ne, uType, method, md2o, jType, operation, csp, _this,
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
			Parameter param = (Parameter) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[0];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[2];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[3];
			ASTNode2Element md2o = (ASTNode2Element) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[4];
			Type jType = (Type) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[5];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter4_11_1_performtransformation_binding[6];

			Object[] result_pattern_VariableDec2Parameter4_11_1_performtransformation_black = pattern_VariableDec2Parameter4_11_1_performtransformation_blackBBBBBBBFBB(
					param, ne2ne, uType, method, md2o, jType, operation, _this, isApplicableMatch);
			if (result_pattern_VariableDec2Parameter4_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VariableDec2Parameter4_11_1_performtransformation_black[7];

				return new Object[] { param, ne2ne, uType, method, md2o, jType, operation, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_1_performtransformation_greenFBFBFFBB(
			Parameter param, AbstractMethodDeclaration method, Type jType, CSP csp) {
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		MSingleVariableDeclaration variableDec = ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
		Object _localVariable_0 = csp.getValue("variableDec", "name");
		ty2p.setTarget(param);
		typeAccess.setType(jType);
		ty2p.setSource(typeAccess);
		vd2p.setTarget(param);
		method.getParameters().add(variableDec);
		vd2p.setSource(variableDec);
		variableDec.setType(typeAccess);
		String variableDec_name_prime = (String) _localVariable_0;
		variableDec.setName(variableDec_name_prime);
		return new Object[] { ty2p, param, typeAccess, method, vd2p, variableDec, jType, csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_blackBBBBB(
			TypeAccess2Parameter ty2p, Parameter param, TypeAccess typeAccess, ASTNode2Element vd2p,
			MSingleVariableDeclaration variableDec) {
		return new Object[] { ty2p, param, typeAccess, vd2p, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_2_collecttranslatedelements_greenFBBBBB(
			TypeAccess2Parameter ty2p, Parameter param, TypeAccess typeAccess, ASTNode2Element vd2p,
			MSingleVariableDeclaration variableDec) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(ty2p);
		ruleresult.getTranslatedElements().add(param);
		ruleresult.getCreatedElements().add(typeAccess);
		ruleresult.getCreatedLinkElements().add(vd2p);
		ruleresult.getCreatedElements().add(variableDec);
		return new Object[] { ruleresult, ty2p, param, typeAccess, vd2p, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter4_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject ty2p, EObject param, EObject typeAccess, EObject ne2ne, EObject uType,
			EObject method, EObject md2o, EObject vd2p, EObject variableDec, EObject jType, EObject operation) {
		if (!ty2p.equals(typeAccess)) {
			if (!ty2p.equals(uType)) {
				if (!ty2p.equals(vd2p)) {
					if (!ty2p.equals(variableDec)) {
						if (!param.equals(ty2p)) {
							if (!param.equals(typeAccess)) {
								if (!param.equals(uType)) {
									if (!param.equals(vd2p)) {
										if (!param.equals(variableDec)) {
											if (!typeAccess.equals(uType)) {
												if (!typeAccess.equals(vd2p)) {
													if (!typeAccess.equals(variableDec)) {
														if (!ne2ne.equals(ty2p)) {
															if (!ne2ne.equals(param)) {
																if (!ne2ne.equals(typeAccess)) {
																	if (!ne2ne.equals(uType)) {
																		if (!ne2ne.equals(vd2p)) {
																			if (!ne2ne.equals(variableDec)) {
																				if (!ne2ne.equals(operation)) {
																					if (!uType.equals(vd2p)) {
																						if (!uType
																								.equals(variableDec)) {
																							if (!method.equals(ty2p)) {
																								if (!method.equals(
																										param)) {
																									if (!method.equals(
																											typeAccess)) {
																										if (!method
																												.equals(ne2ne)) {
																											if (!method
																													.equals(uType)) {
																												if (!method
																														.equals(vd2p)) {
																													if (!method
																															.equals(variableDec)) {
																														if (!method
																																.equals(operation)) {
																															if (!md2o
																																	.equals(ty2p)) {
																																if (!md2o
																																		.equals(param)) {
																																	if (!md2o
																																			.equals(typeAccess)) {
																																		if (!md2o
																																				.equals(ne2ne)) {
																																			if (!md2o
																																					.equals(uType)) {
																																				if (!md2o
																																						.equals(method)) {
																																					if (!md2o
																																							.equals(vd2p)) {
																																						if (!md2o
																																								.equals(variableDec)) {
																																							if (!md2o
																																									.equals(operation)) {
																																								if (!variableDec
																																										.equals(vd2p)) {
																																									if (!jType
																																											.equals(ty2p)) {
																																										if (!jType
																																												.equals(param)) {
																																											if (!jType
																																													.equals(typeAccess)) {
																																												if (!jType
																																														.equals(ne2ne)) {
																																													if (!jType
																																															.equals(uType)) {
																																														if (!jType
																																																.equals(method)) {
																																															if (!jType
																																																	.equals(md2o)) {
																																																if (!jType
																																																		.equals(vd2p)) {
																																																	if (!jType
																																																			.equals(variableDec)) {
																																																		if (!jType
																																																				.equals(operation)) {
																																																			if (!operation
																																																					.equals(ty2p)) {
																																																				if (!operation
																																																						.equals(param)) {
																																																					if (!operation
																																																							.equals(typeAccess)) {
																																																						if (!operation
																																																								.equals(uType)) {
																																																							if (!operation
																																																									.equals(vd2p)) {
																																																								if (!operation
																																																										.equals(variableDec)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											ty2p,
																																																											param,
																																																											typeAccess,
																																																											ne2ne,
																																																											uType,
																																																											method,
																																																											md2o,
																																																											vd2p,
																																																											variableDec,
																																																											jType,
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
			PerformRuleResult ruleresult, EObject ty2p, EObject param, EObject typeAccess, EObject uType,
			EObject method, EObject vd2p, EObject variableDec, EObject jType, EObject operation) {
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__variableDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VariableDec2Parameter4";
		String param__uType____type_name_prime = "type";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ty2p__typeAccess____source_name_prime = "source";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		String vd2p__param____target_name_prime = "target";
		String ty2p__param____target_name_prime = "target";
		String vd2p__variableDec____source_name_prime = "source";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		String variableDec__typeAccess____type_name_prime = "type";
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		ruleresult.getTranslatedEdges().add(param__uType____type);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getCreatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		ty2p__typeAccess____source.setSrc(ty2p);
		ty2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ty2p__typeAccess____source);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		ruleresult.getCreatedEdges().add(variableDec__method____methodDeclaration);
		vd2p__param____target.setSrc(vd2p);
		vd2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(vd2p__param____target);
		ty2p__param____target.setSrc(ty2p);
		ty2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(ty2p__param____target);
		vd2p__variableDec____source.setSrc(vd2p);
		vd2p__variableDec____source.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(vd2p__variableDec____source);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		ruleresult.getTranslatedEdges().add(operation__param____ownedParameter);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(variableDec__typeAccess____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		param__uType____type.setName(param__uType____type_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		ty2p__typeAccess____source.setName(ty2p__typeAccess____source_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		vd2p__param____target.setName(vd2p__param____target_name_prime);
		ty2p__param____target.setName(ty2p__param____target_name_prime);
		vd2p__variableDec____source.setName(vd2p__variableDec____source_name_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		return new Object[] { ruleresult, ty2p, param, typeAccess, uType, method, vd2p, variableDec, jType, operation,
				param__uType____type, typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess,
				ty2p__typeAccess____source, method__variableDec____parameters, variableDec__method____methodDeclaration,
				vd2p__param____target, ty2p__param____target, vd2p__variableDec____source,
				operation__param____ownedParameter, variableDec__typeAccess____type };
	}

	public static final void pattern_VariableDec2Parameter4_11_5_registerobjects_expressionBBBBBBBBBBBBB(
			VariableDec2Parameter4 _this, PerformRuleResult ruleresult, EObject ty2p, EObject param, EObject typeAccess,
			EObject ne2ne, EObject uType, EObject method, EObject md2o, EObject vd2p, EObject variableDec,
			EObject jType, EObject operation) {
		_this.registerObjects_BWD(ruleresult, ty2p, param, typeAccess, ne2ne, uType, method, md2o, vd2p, variableDec,
				jType, operation);

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
		EObject _localVariable_0 = match.getObject("param");
		EObject _localVariable_1 = match.getObject("uType");
		EObject _localVariable_2 = match.getObject("operation");
		EObject tmpParam = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		if (tmpParam instanceof Parameter) {
			Parameter param = (Parameter) tmpParam;
			if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
				org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
				if (tmpOperation instanceof Operation) {
					Operation operation = (Operation) tmpOperation;
					return new Object[] { param, uType, operation, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_12_2_corematch_blackBFBFFFBB(Parameter param,
			org.eclipse.uml2.uml.Type uType, Operation operation, Match match) {
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
							_result.add(new Object[] { param, ne2ne, uType, method, md2o, jType, operation, match });
						}

					}
				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_12_3_findcontext_blackBBBBBBB(Parameter param,
			ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o, Type jType, Operation operation) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!md2o.equals(ne2ne)) {
			if (uType.equals(param.getType())) {
				if (uType.equals(ne2ne.getTarget())) {
					if (method.equals(md2o.getSource())) {
						if (jType.equals(ne2ne.getSource())) {
							if (operation.equals(md2o.getTarget())) {
								if (operation.getOwnedParameters().contains(param)) {
									_result.add(new Object[] { param, ne2ne, uType, method, md2o, jType, operation });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_3_findcontext_greenBBBBBBBFFFFFFF(Parameter param,
			ASTNode2Element ne2ne, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			ASTNode2Element md2o, Type jType, Operation operation) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge param__uType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String param__uType____type_name_prime = "type";
		String ne2ne__uType____target_name_prime = "target";
		String md2o__method____source_name_prime = "source";
		String ne2ne__jType____source_name_prime = "source";
		String md2o__operation____target_name_prime = "target";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		isApplicableMatch.getAllContextElements().add(param);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(md2o);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(operation);
		param__uType____type.setSrc(param);
		param__uType____type.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(param__uType____type);
		ne2ne__uType____target.setSrc(ne2ne);
		ne2ne__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne__uType____target);
		md2o__method____source.setSrc(md2o);
		md2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(md2o__method____source);
		ne2ne__jType____source.setSrc(ne2ne);
		ne2ne__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne__jType____source);
		md2o__operation____target.setSrc(md2o);
		md2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(md2o__operation____target);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		isApplicableMatch.getAllContextElements().add(operation__param____ownedParameter);
		param__uType____type.setName(param__uType____type_name_prime);
		ne2ne__uType____target.setName(ne2ne__uType____target_name_prime);
		md2o__method____source.setName(md2o__method____source_name_prime);
		ne2ne__jType____source.setName(ne2ne__jType____source_name_prime);
		md2o__operation____target.setName(md2o__operation____target_name_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		return new Object[] { param, ne2ne, uType, method, md2o, jType, operation, isApplicableMatch,
				param__uType____type, ne2ne__uType____target, md2o__method____source, ne2ne__jType____source,
				md2o__operation____target, operation__param____ownedParameter };
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_4_solveCSP_bindingFBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, Parameter param, ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o, Type jType,
			Operation operation) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, param, ne2ne, uType, method, md2o,
				jType, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, param, ne2ne, uType, method, md2o, jType, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, Parameter param, ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o, Type jType,
			Operation operation) {
		Object[] result_pattern_VariableDec2Parameter4_12_4_solveCSP_binding = pattern_VariableDec2Parameter4_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, param, ne2ne, uType, method, md2o, jType, operation);
		if (result_pattern_VariableDec2Parameter4_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_12_4_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_12_4_solveCSP_black = pattern_VariableDec2Parameter4_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, param, ne2ne, uType, method, md2o, jType,
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
							_result.add(new Object[] { param, uType, operation, _edge_type });
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
			VariableDec2Parameter4 _this, Match match, Parameter param, org.eclipse.uml2.uml.Type uType,
			Operation operation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, param, uType, operation);
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
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_532379 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_532379)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_737315 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ArrayType __DEC_typeAccess_elementType_795598 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			if (!jType.equals(__DEC_typeAccess_elementType_795598)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_822729 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_822729)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		for (MethodDeclaration __DEC_typeAccess_returnType_914270 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, MethodDeclaration.class, "returnType")) {
			if (!method.equals(__DEC_typeAccess_returnType_914270)) {
				return new Object[] { typeAccess, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_5BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_636684 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_636684)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_669236 : org.moflon.core.utilities.eMoflonEMFUtil
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
															_result.add(new Object[] { typeAccess, method, variableDec,
																	jType, _edge_type });
														}
													}

												}
											}
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
			VariableDec2Parameter4 _this, Match match, TypeAccess typeAccess, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, typeAccess, method, variableDec, jType);
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
		EObject _localVariable_0 = targetMatch.getObject("param");
		EObject _localVariable_1 = sourceMatch.getObject("typeAccess");
		EObject _localVariable_2 = targetMatch.getObject("uType");
		EObject _localVariable_3 = sourceMatch.getObject("method");
		EObject _localVariable_4 = sourceMatch.getObject("variableDec");
		EObject _localVariable_5 = sourceMatch.getObject("jType");
		EObject _localVariable_6 = targetMatch.getObject("operation");
		EObject tmpParam = _localVariable_0;
		EObject tmpTypeAccess = _localVariable_1;
		EObject tmpUType = _localVariable_2;
		EObject tmpMethod = _localVariable_3;
		EObject tmpVariableDec = _localVariable_4;
		EObject tmpJType = _localVariable_5;
		EObject tmpOperation = _localVariable_6;
		if (tmpParam instanceof Parameter) {
			Parameter param = (Parameter) tmpParam;
			if (tmpTypeAccess instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
				if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
					org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
					if (tmpMethod instanceof AbstractMethodDeclaration) {
						AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
						if (tmpVariableDec instanceof MSingleVariableDeclaration) {
							MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
							if (tmpJType instanceof Type) {
								Type jType = (Type) tmpJType;
								if (tmpOperation instanceof Operation) {
									Operation operation = (Operation) tmpOperation;
									return new Object[] { param, typeAccess, uType, method, variableDec, jType,
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

	public static final Object[] pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_blackBBBBBBBBB(Parameter param,
			TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType, Operation operation, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { param, typeAccess, uType, method, variableDec, jType, operation, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding = pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding != null) {
			Parameter param = (Parameter) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[0];
			TypeAccess typeAccess = (TypeAccess) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[2];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[3];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[4];
			Type jType = (Type) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[5];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_black = pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					param, typeAccess, uType, method, variableDec, jType, operation, sourceMatch, targetMatch);
			if (result_pattern_VariableDec2Parameter4_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { param, typeAccess, uType, method, variableDec, jType, operation, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_3_solvecsp_bindingFBBBBBBBBBB(
			VariableDec2Parameter4 _this, Parameter param, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec, Type jType, Operation operation,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(param, typeAccess, uType, method, variableDec, jType,
				operation, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, param, typeAccess, uType, method, variableDec, jType, operation,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			VariableDec2Parameter4 _this, Parameter param, TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec, Type jType, Operation operation,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VariableDec2Parameter4_24_3_solvecsp_binding = pattern_VariableDec2Parameter4_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, param, typeAccess, uType, method, variableDec, jType, operation, sourceMatch, targetMatch);
		if (result_pattern_VariableDec2Parameter4_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_24_3_solvecsp_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_24_3_solvecsp_black = pattern_VariableDec2Parameter4_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, param, typeAccess, uType, method, variableDec, jType, operation,
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

	public static final Iterable<Object[]> pattern_VariableDec2Parameter4_24_5_matchcorrcontext_blackFBBFBBBB(
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, Type jType, Operation operation,
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
								_result.add(new Object[] { ne2ne, uType, method, md2o, jType, operation, sourceMatch,
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

	public static final Object[] pattern_VariableDec2Parameter4_24_6_createcorrespondence_blackBBBBBBBB(Parameter param,
			TypeAccess typeAccess, org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method,
			MSingleVariableDeclaration variableDec, Type jType, Operation operation, CCMatch ccMatch) {
		return new Object[] { param, typeAccess, uType, method, variableDec, jType, operation, ccMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter4_24_6_createcorrespondence_greenFBBFBB(Parameter param,
			TypeAccess typeAccess, MSingleVariableDeclaration variableDec, CCMatch ccMatch) {
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		ty2p.setSource(typeAccess);
		ty2p.setTarget(param);
		ccMatch.getCreateCorr().add(ty2p);
		vd2p.setTarget(param);
		vd2p.setSource(variableDec);
		ccMatch.getCreateCorr().add(vd2p);
		return new Object[] { ty2p, param, typeAccess, vd2p, variableDec, ccMatch };
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
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_652074 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_652074)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_597860 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ArrayType __DEC_typeAccess_elementType_219013 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			if (!jType.equals(__DEC_typeAccess_elementType_219013)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_3BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_666661 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_666661)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_4BB(
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		for (MethodDeclaration __DEC_typeAccess_returnType_188693 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, MethodDeclaration.class, "returnType")) {
			if (!method.equals(__DEC_typeAccess_returnType_188693)) {
				return new Object[] { typeAccess, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_5BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_937626 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_937626)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_473865 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_27_1_matchtggpattern_blackBBBB(TypeAccess typeAccess,
			AbstractMethodDeclaration method, MSingleVariableDeclaration variableDec, Type jType) {
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
												return new Object[] { typeAccess, method, variableDec, jType };
											}
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

	public static final Object[] pattern_VariableDec2Parameter4_28_1_matchtggpattern_blackBBB(Parameter param,
			org.eclipse.uml2.uml.Type uType, Operation operation) {
		if (uType.equals(param.getType())) {
			if (operation.getOwnedParameters().contains(param)) {
				return new Object[] { param, uType, operation };
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
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Type uType) {
		if (ruleResult.getTargetObjects().contains(uType)) {
			return new Object[] { ruleResult, uType };
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
			ModelgeneratorRuleResult ruleResult, AbstractMethodDeclaration method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
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
									if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											ne2ne) == null) {
										if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_1BB(
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
																	if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, md2o) == null) {
																		if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, method) == null) {
																			if (pattern_VariableDec2Parameter4_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult, operation) == null) {
																				_result.add(new Object[] { ne2neList,
																						ne2ne, uType, jType, md2oList,
																						method, md2o, operation,
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
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o, Type jType,
			Operation operation, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ne2ne, uType, method, md2o, jType,
				operation, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ne2ne, uType, method, md2o, jType, operation,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			VariableDec2Parameter4 _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o, Type jType,
			Operation operation, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_VariableDec2Parameter4_29_3_solveCSP_binding = pattern_VariableDec2Parameter4_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, ne2ne, uType, method, md2o, jType, operation, ruleResult);
		if (result_pattern_VariableDec2Parameter4_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter4_29_3_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter4_29_3_solveCSP_black = pattern_VariableDec2Parameter4_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter4_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ne2ne, uType, method, md2o, jType, operation,
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
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o, Type jType,
			Operation operation) {
		if (!md2o.equals(ne2ne)) {
			return new Object[] { ne2ne, uType, method, md2o, jType, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_6_perform_blackBBBBBBB(ASTNode2Element ne2ne,
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, ASTNode2Element md2o, Type jType,
			Operation operation, ModelgeneratorRuleResult ruleResult) {
		if (!md2o.equals(ne2ne)) {
			return new Object[] { ne2ne, uType, method, md2o, jType, operation, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter4_29_6_perform_greenFFFBBFFBBBB(
			org.eclipse.uml2.uml.Type uType, AbstractMethodDeclaration method, Type jType, Operation operation,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Parameter param = UMLFactory.eINSTANCE.createParameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ASTNode2Element vd2p = UmlFactory.eINSTANCE.createASTNode2Element();
		MSingleVariableDeclaration variableDec = ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
		Object _localVariable_0 = csp.getValue("param", "name");
		Object _localVariable_1 = csp.getValue("param", "direction");
		Object _localVariable_2 = csp.getValue("variableDec", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(ty2p);
		param.setType(uType);
		ty2p.setTarget(param);
		operation.getOwnedParameters().add(param);
		ruleResult.getTargetObjects().add(param);
		typeAccess.setType(jType);
		ty2p.setSource(typeAccess);
		ruleResult.getSourceObjects().add(typeAccess);
		vd2p.setTarget(param);
		ruleResult.getCorrObjects().add(vd2p);
		method.getParameters().add(variableDec);
		vd2p.setSource(variableDec);
		variableDec.setType(typeAccess);
		ruleResult.getSourceObjects().add(variableDec);
		String param_name_prime = (String) _localVariable_0;
		ParameterDirectionKind param_direction_prime = (ParameterDirectionKind) _localVariable_1;
		String variableDec_name_prime = (String) _localVariable_2;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		param.setName(param_name_prime);
		param.setDirection(param_direction_prime);
		variableDec.setName(variableDec_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { ty2p, param, typeAccess, uType, method, vd2p, variableDec, jType, operation, ruleResult,
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
