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
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayInitializer;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MSingleVariableDeclaration;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.RulesPackage;
import org.gravity.tgg.modisco.uml.Rules.VariableDec2Parameter;

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
 * An implementation of the model object '<em><b>Variable Dec2 Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VariableDec2ParameterImpl extends AbstractRuleImpl implements VariableDec2Parameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDec2ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getVariableDec2Parameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AbstractMethodDeclaration method, TypeAccess typeAccess,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner) {

		Object[] result1_black = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_0_1_initialbindings_blackBBBBBB(this, match, method, typeAccess,
						variableDec, owner);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[variableDec] = " + variableDec + ", " + "[owner] = " + owner + ".");
		}

		Object[] result2_bindingAndBlack = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, method, typeAccess,
						variableDec, owner);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[variableDec] = " + variableDec + ", " + "[owner] = " + owner + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VariableDec2ParameterImpl.pattern_VariableDec2Parameter_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_0_4_collectelementstobetranslated_blackBBBBB(match, method,
							typeAccess, variableDec, owner);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ", " + "[variableDec] = "
						+ variableDec + ", " + "[owner] = " + owner + ".");
			}
			VariableDec2ParameterImpl.pattern_VariableDec2Parameter_0_4_collectelementstobetranslated_greenBBBBFFF(
					match, method, typeAccess, variableDec);
			//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result4_green[6];

			Object[] result5_black = VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_0_5_collectcontextelements_blackBBBBB(match, method, typeAccess,
							variableDec, owner);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ", " + "[variableDec] = "
						+ variableDec + ", " + "[owner] = " + owner + ".");
			}
			VariableDec2ParameterImpl.pattern_VariableDec2Parameter_0_5_collectcontextelements_greenBBBFF(match, method,
					owner);
			//nothing EMoflonEdge owner__method____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge method__owner____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			VariableDec2ParameterImpl.pattern_VariableDec2Parameter_0_6_registerobjectstomatch_expressionBBBBBB(this,
					match, method, typeAccess, variableDec, owner);
			return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_0_7_expressionF();
		} else {
			return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result1_bindingAndBlack[0];
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[1];
		Operation operation = (Operation) result1_bindingAndBlack[2];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result1_bindingAndBlack[3];
		NamedElement2NamedElement md2o = (NamedElement2NamedElement) result1_bindingAndBlack[4];
		AbstractTypeDeclaration owner = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_1_1_performtransformation_greenFBFFFBBB(typeAccess, operation,
						variableDec, csp);
		org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p = (org.gravity.tgg.modisco.uml.VariableDec2Parameter) result1_green[0];
		NamedElement2NamedElement n2n = (NamedElement2NamedElement) result1_green[2];
		Parameter param = (Parameter) result1_green[3];
		TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result1_green[4];

		Object[] result2_black = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_1_2_collecttranslatedelements_blackBBBBBB(vd2p, typeAccess, n2n, param,
						ty2p, variableDec);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[vd2p] = " + vd2p + ", "
					+ "[typeAccess] = " + typeAccess + ", " + "[n2n] = " + n2n + ", " + "[param] = " + param + ", "
					+ "[ty2p] = " + ty2p + ", " + "[variableDec] = " + variableDec + ".");
		}
		Object[] result2_green = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_1_2_collecttranslatedelements_greenFBBBBBB(vd2p, typeAccess, n2n, param,
						ty2p, variableDec);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, vd2p, method,
						typeAccess, n2n, param, ty2p, operation, variableDec, md2o, owner);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[vd2p] = " + vd2p + ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[n2n] = " + n2n + ", " + "[param] = " + param + ", " + "[ty2p] = " + ty2p + ", "
					+ "[operation] = " + operation + ", " + "[variableDec] = " + variableDec + ", " + "[md2o] = " + md2o
					+ ", " + "[owner] = " + owner + ".");
		}
		VariableDec2ParameterImpl.pattern_VariableDec2Parameter_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
				ruleresult, vd2p, method, typeAccess, n2n, param, ty2p, operation, variableDec);
		//nothing EMoflonEdge n2n__param____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ty2p__typeAccess____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge ty2p__param____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge vd2p__param____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge n2n__variableDec____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge vd2p__variableDec____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[18];

		// 
		// 
		VariableDec2ParameterImpl.pattern_VariableDec2Parameter_1_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, vd2p, method, typeAccess, n2n, param, ty2p, operation, variableDec, md2o, owner);
		return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_binding[0];
		TypeAccess typeAccess = (TypeAccess) result2_binding[1];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_binding[2];
		AbstractTypeDeclaration owner = (AbstractTypeDeclaration) result2_binding[3];
		for (Object[] result2_black : VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_2_2_corematch_blackBBFBFBB(method, typeAccess, variableDec, owner,
						match)) {
			Operation operation = (Operation) result2_black[2];
			NamedElement2NamedElement md2o = (NamedElement2NamedElement) result2_black[4];
			// ForEach 
			for (Object[] result3_black : VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_2_3_findcontext_blackBBBBBB(method, typeAccess, operation,
							variableDec, md2o, owner)) {
				Object[] result3_green = VariableDec2ParameterImpl
						.pattern_VariableDec2Parameter_2_3_findcontext_greenBBBBBBFFFFFFFF(method, typeAccess,
								operation, variableDec, md2o, owner);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge md2o__method____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge md2o__operation____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge owner__method____bodyDeclarations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge method__owner____abstractTypeDeclaration = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = VariableDec2ParameterImpl
						.pattern_VariableDec2Parameter_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								method, typeAccess, operation, variableDec, md2o, owner);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[typeAccess] = " + typeAccess + ", " + "[operation] = " + operation + ", "
							+ "[variableDec] = " + variableDec + ", " + "[md2o] = " + md2o + ", " + "[owner] = " + owner
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (VariableDec2ParameterImpl.pattern_VariableDec2Parameter_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = VariableDec2ParameterImpl
							.pattern_VariableDec2Parameter_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					VariableDec2ParameterImpl.pattern_VariableDec2Parameter_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AbstractMethodDeclaration method, TypeAccess typeAccess,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner) {
		match.registerObject("method", method);
		match.registerObject("typeAccess", typeAccess);
		match.registerObject("variableDec", variableDec);
		match.registerObject("owner", owner);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AbstractMethodDeclaration method, TypeAccess typeAccess,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner) {// Create CSP
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
			TypeAccess typeAccess, Operation operation, MSingleVariableDeclaration variableDec,
			NamedElement2NamedElement md2o, AbstractTypeDeclaration owner) {// Create CSP
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
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("variableDec", variableDec);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("owner", owner);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject vd2p, EObject method, EObject typeAccess,
			EObject n2n, EObject param, EObject ty2p, EObject operation, EObject variableDec, EObject md2o,
			EObject owner) {
		ruleresult.registerObject("vd2p", vd2p);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("n2n", n2n);
		ruleresult.registerObject("param", param);
		ruleresult.registerObject("ty2p", ty2p);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("variableDec", variableDec);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("owner", owner);

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
	public boolean isAppropriate_BWD(Match match, Parameter param, Operation operation) {

		Object[] result1_black = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_10_1_initialbindings_blackBBBB(this, match, param, operation);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[param] = " + param + ", " + "[operation] = " + operation + ".");
		}

		Object[] result2_bindingAndBlack = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, param, operation);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[param] = " + param + ", " + "[operation] = " + operation + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (VariableDec2ParameterImpl.pattern_VariableDec2Parameter_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_10_4_collectelementstobetranslated_blackBBB(match, param, operation);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[param] = " + param + ", " + "[operation] = " + operation + ".");
			}
			VariableDec2ParameterImpl.pattern_VariableDec2Parameter_10_4_collectelementstobetranslated_greenBBBF(match,
					param, operation);
			//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result4_green[3];

			Object[] result5_black = VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_10_5_collectcontextelements_blackBBB(match, param, operation);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[param] = " + param + ", " + "[operation] = " + operation + ".");
			}
			VariableDec2ParameterImpl.pattern_VariableDec2Parameter_10_5_collectcontextelements_greenBB(match,
					operation);

			// 
			VariableDec2ParameterImpl.pattern_VariableDec2Parameter_10_6_registerobjectstomatch_expressionBBBB(this,
					match, param, operation);
			return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_10_7_expressionF();
		} else {
			return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result1_bindingAndBlack[0];
		Parameter param = (Parameter) result1_bindingAndBlack[1];
		Operation operation = (Operation) result1_bindingAndBlack[2];
		NamedElement2NamedElement md2o = (NamedElement2NamedElement) result1_bindingAndBlack[3];
		AbstractTypeDeclaration owner = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_11_1_performtransformation_greenFBFFBFFB(method, param, csp);
		org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p = (org.gravity.tgg.modisco.uml.VariableDec2Parameter) result1_green[0];
		TypeAccess typeAccess = (TypeAccess) result1_green[2];
		NamedElement2NamedElement n2n = (NamedElement2NamedElement) result1_green[3];
		TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result1_green[5];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result1_green[6];

		Object[] result2_black = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_11_2_collecttranslatedelements_blackBBBBBB(vd2p, typeAccess, n2n, param,
						ty2p, variableDec);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[vd2p] = " + vd2p + ", "
					+ "[typeAccess] = " + typeAccess + ", " + "[n2n] = " + n2n + ", " + "[param] = " + param + ", "
					+ "[ty2p] = " + ty2p + ", " + "[variableDec] = " + variableDec + ".");
		}
		Object[] result2_green = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_11_2_collecttranslatedelements_greenFBBBBBB(vd2p, typeAccess, n2n, param,
						ty2p, variableDec);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, vd2p, method,
						typeAccess, n2n, param, ty2p, operation, variableDec, md2o, owner);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[vd2p] = " + vd2p + ", " + "[method] = " + method + ", " + "[typeAccess] = " + typeAccess
					+ ", " + "[n2n] = " + n2n + ", " + "[param] = " + param + ", " + "[ty2p] = " + ty2p + ", "
					+ "[operation] = " + operation + ", " + "[variableDec] = " + variableDec + ", " + "[md2o] = " + md2o
					+ ", " + "[owner] = " + owner + ".");
		}
		VariableDec2ParameterImpl.pattern_VariableDec2Parameter_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
				ruleresult, vd2p, method, typeAccess, n2n, param, ty2p, operation, variableDec);
		//nothing EMoflonEdge n2n__param____target = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ty2p__typeAccess____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge ty2p__param____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge vd2p__param____target = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge variableDec__typeAccess____type = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge n2n__variableDec____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge vd2p__variableDec____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge method__variableDec____parameters = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge variableDec__method____methodDeclaration = (EMoflonEdge) result3_green[18];

		// 
		// 
		VariableDec2ParameterImpl.pattern_VariableDec2Parameter_11_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, vd2p, method, typeAccess, n2n, param, ty2p, operation, variableDec, md2o, owner);
		return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Parameter param = (Parameter) result2_binding[0];
		Operation operation = (Operation) result2_binding[1];
		for (Object[] result2_black : VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_12_2_corematch_blackFBBFB(param, operation, match)) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[0];
			NamedElement2NamedElement md2o = (NamedElement2NamedElement) result2_black[3];
			// ForEach 
			for (Object[] result3_black : VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_12_3_findcontext_blackBBBBF(method, param, operation, md2o)) {
				AbstractTypeDeclaration owner = (AbstractTypeDeclaration) result3_black[4];
				Object[] result3_green = VariableDec2ParameterImpl
						.pattern_VariableDec2Parameter_12_3_findcontext_greenBBBBBFFFFFF(method, param, operation, md2o,
								owner);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge operation__param____ownedParameter = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge md2o__method____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge md2o__operation____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge owner__method____bodyDeclarations = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge method__owner____abstractTypeDeclaration = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = VariableDec2ParameterImpl
						.pattern_VariableDec2Parameter_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								method, param, operation, md2o, owner);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
							+ "[param] = " + param + ", " + "[operation] = " + operation + ", " + "[md2o] = " + md2o
							+ ", " + "[owner] = " + owner + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (VariableDec2ParameterImpl.pattern_VariableDec2Parameter_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = VariableDec2ParameterImpl
							.pattern_VariableDec2Parameter_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					VariableDec2ParameterImpl.pattern_VariableDec2Parameter_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Parameter param, Operation operation) {
		match.registerObject("param", param);
		match.registerObject("operation", operation);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Parameter param, Operation operation) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			Parameter param, Operation operation, NamedElement2NamedElement md2o, AbstractTypeDeclaration owner) {// Create CSP
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
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("param", param);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("owner", owner);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject vd2p, EObject method, EObject typeAccess,
			EObject n2n, EObject param, EObject ty2p, EObject operation, EObject variableDec, EObject md2o,
			EObject owner) {
		ruleresult.registerObject("vd2p", vd2p);
		ruleresult.registerObject("method", method);
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("n2n", n2n);
		ruleresult.registerObject("param", param);
		ruleresult.registerObject("ty2p", ty2p);
		ruleresult.registerObject("operation", operation);
		ruleresult.registerObject("variableDec", variableDec);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("owner", owner);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_157(EMoflonEdge _edge_ownedParameter) {

		Object[] result1_bindingAndBlack = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_20_2_testcorematchandDECs_blackFFB(_edge_ownedParameter)) {
			Parameter param = (Parameter) result2_black[0];
			Operation operation = (Operation) result2_black[1];
			Object[] result2_green = VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, param, operation)) {
				// 
				if (VariableDec2ParameterImpl
						.pattern_VariableDec2Parameter_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VariableDec2ParameterImpl
							.pattern_VariableDec2Parameter_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VariableDec2ParameterImpl.pattern_VariableDec2Parameter_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_162(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_21_2_testcorematchandDECs_blackFFFFB(_edge_type)) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[0];
			TypeAccess typeAccess = (TypeAccess) result2_black[1];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_black[2];
			AbstractTypeDeclaration owner = (AbstractTypeDeclaration) result2_black[3];
			Object[] result2_green = VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, method, typeAccess, variableDec, owner)) {
				// 
				if (VariableDec2ParameterImpl
						.pattern_VariableDec2Parameter_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = VariableDec2ParameterImpl
							.pattern_VariableDec2Parameter_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					VariableDec2ParameterImpl.pattern_VariableDec2Parameter_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("VariableDec2Parameter");
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

		eq0.setRuleName("VariableDec2Parameter");
		eq0.solve(var_variableDec_name, var_param_name);

		isInParameter1.setRuleName("VariableDec2Parameter");
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
		ruleResult.setRule("VariableDec2Parameter");
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

		isInParameter0.setRuleName("VariableDec2Parameter");
		isInParameter0.solve(var_param_direction);

		eq1.setRuleName("VariableDec2Parameter");
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

		Object[] result1_black = VariableDec2ParameterImpl.pattern_VariableDec2Parameter_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VariableDec2ParameterImpl.pattern_VariableDec2Parameter_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_bindingAndBlack[0];
		TypeAccess typeAccess = (TypeAccess) result2_bindingAndBlack[1];
		Parameter param = (Parameter) result2_bindingAndBlack[2];
		Operation operation = (Operation) result2_bindingAndBlack[3];
		MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result2_bindingAndBlack[4];
		AbstractTypeDeclaration owner = (AbstractTypeDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, method, typeAccess, param,
						operation, variableDec, owner, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[method] = " + method + ", " + "[typeAccess] = " + typeAccess + ", " + "[param] = " + param
					+ ", " + "[operation] = " + operation + ", " + "[variableDec] = " + variableDec + ", "
					+ "[owner] = " + owner + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (VariableDec2ParameterImpl.pattern_VariableDec2Parameter_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_24_5_matchcorrcontext_blackBBFBB(method, operation, sourceMatch,
							targetMatch)) {
				NamedElement2NamedElement md2o = (NamedElement2NamedElement) result5_black[2];
				Object[] result5_green = VariableDec2ParameterImpl
						.pattern_VariableDec2Parameter_24_5_matchcorrcontext_greenBBBF(md2o, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = VariableDec2ParameterImpl
						.pattern_VariableDec2Parameter_24_6_createcorrespondence_blackBBBBBBB(method, typeAccess, param,
								operation, variableDec, owner, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
							+ ", " + "[typeAccess] = " + typeAccess + ", " + "[param] = " + param + ", "
							+ "[operation] = " + operation + ", " + "[variableDec] = " + variableDec + ", "
							+ "[owner] = " + owner + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VariableDec2ParameterImpl.pattern_VariableDec2Parameter_24_6_createcorrespondence_greenFBFBFBB(
						typeAccess, param, variableDec, ccMatch);
				//nothing org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p = (org.gravity.tgg.modisco.uml.VariableDec2Parameter) result6_green[0];
				//nothing NamedElement2NamedElement n2n = (NamedElement2NamedElement) result6_green[2];
				//nothing TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result6_green[4];

				Object[] result7_black = VariableDec2ParameterImpl
						.pattern_VariableDec2Parameter_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				VariableDec2ParameterImpl.pattern_VariableDec2Parameter_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(AbstractMethodDeclaration method, TypeAccess typeAccess, Parameter param,
			Operation operation, MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner,
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
	public boolean checkDEC_FWD(AbstractMethodDeclaration method, TypeAccess typeAccess,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner) {// 
		Object[] result1_black = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_27_1_matchtggpattern_blackBBBB(method, typeAccess, variableDec, owner);
		if (result1_black != null) {
			return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_27_2_expressionF();
		} else {
			return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Parameter param, Operation operation) {// 
		Object[] result1_black = VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_28_1_matchtggpattern_blackBB(param, operation);
		if (result1_black != null) {
			return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_28_2_expressionF();
		} else {
			return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			NamedElement2NamedElement md2oParameter) {

		Object[] result1_black = VariableDec2ParameterImpl.pattern_VariableDec2Parameter_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = VariableDec2ParameterImpl.pattern_VariableDec2Parameter_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : VariableDec2ParameterImpl
				.pattern_VariableDec2Parameter_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList md2oList = (RuleEntryList) result2_black[0];
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result2_black[1];
			NamedElement2NamedElement md2o = (NamedElement2NamedElement) result2_black[2];
			Operation operation = (Operation) result2_black[3];
			AbstractTypeDeclaration owner = (AbstractTypeDeclaration) result2_black[4];

			Object[] result3_bindingAndBlack = VariableDec2ParameterImpl
					.pattern_VariableDec2Parameter_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							method, operation, md2o, owner, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[method] = " + method + ", "
						+ "[operation] = " + operation + ", " + "[md2o] = " + md2o + ", " + "[owner] = " + owner + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (VariableDec2ParameterImpl.pattern_VariableDec2Parameter_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = VariableDec2ParameterImpl
						.pattern_VariableDec2Parameter_29_5_checknacs_blackBBBB(method, operation, md2o, owner);
				if (result5_black != null) {

					Object[] result6_black = VariableDec2ParameterImpl
							.pattern_VariableDec2Parameter_29_6_perform_blackBBBBB(method, operation, md2o, owner,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method
								+ ", " + "[operation] = " + operation + ", " + "[md2o] = " + md2o + ", " + "[owner] = "
								+ owner + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					VariableDec2ParameterImpl.pattern_VariableDec2Parameter_29_6_perform_greenFBFFFFBFBB(method,
							operation, ruleResult, csp);
					//nothing org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p = (org.gravity.tgg.modisco.uml.VariableDec2Parameter) result6_green[0];
					//nothing TypeAccess typeAccess = (TypeAccess) result6_green[2];
					//nothing NamedElement2NamedElement n2n = (NamedElement2NamedElement) result6_green[3];
					//nothing Parameter param = (Parameter) result6_green[4];
					//nothing TypeAccess2Parameter ty2p = (TypeAccess2Parameter) result6_green[5];
					//nothing MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return VariableDec2ParameterImpl.pattern_VariableDec2Parameter_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			Operation operation, NamedElement2NamedElement md2o, AbstractTypeDeclaration owner,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("method", method);
		isApplicableMatch.registerObject("operation", operation);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("owner", owner);
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
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPROPRIATE_FWD__MATCH_ABSTRACTMETHODDECLARATION_TYPEACCESS_MSINGLEVARIABLEDECLARATION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (AbstractMethodDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (MSingleVariableDeclaration) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ABSTRACTMETHODDECLARATION_TYPEACCESS_MSINGLEVARIABLEDECLARATION_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AbstractMethodDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (MSingleVariableDeclaration) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ABSTRACTMETHODDECLARATION_TYPEACCESS_MSINGLEVARIABLEDECLARATION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AbstractMethodDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (MSingleVariableDeclaration) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ABSTRACTMETHODDECLARATION_TYPEACCESS_OPERATION_MSINGLEVARIABLEDECLARATION_NAMEDELEMENT2NAMEDELEMENT_ABSTRACTTYPEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(AbstractMethodDeclaration) arguments.get(1), (TypeAccess) arguments.get(2),
					(Operation) arguments.get(3), (MSingleVariableDeclaration) arguments.get(4),
					(NamedElement2NamedElement) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPROPRIATE_BWD__MATCH_PARAMETER_OPERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_PARAMETER_OPERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(Operation) arguments.get(2));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_PARAMETER_OPERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Parameter) arguments.get(1),
					(Operation) arguments.get(2));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ABSTRACTMETHODDECLARATION_PARAMETER_OPERATION_NAMEDELEMENT2NAMEDELEMENT_ABSTRACTTYPEDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AbstractMethodDeclaration) arguments.get(1), (Parameter) arguments.get(2),
					(Operation) arguments.get(3), (NamedElement2NamedElement) arguments.get(4),
					(AbstractTypeDeclaration) arguments.get(5));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.VARIABLE_DEC2_PARAMETER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_157__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_157((EMoflonEdge) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_162__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_162((EMoflonEdge) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPLICABLE_SOLVE_CSP_CC__ABSTRACTMETHODDECLARATION_TYPEACCESS_PARAMETER_OPERATION_MSINGLEVARIABLEDECLARATION_ABSTRACTTYPEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((AbstractMethodDeclaration) arguments.get(0), (TypeAccess) arguments.get(1),
					(Parameter) arguments.get(2), (Operation) arguments.get(3),
					(MSingleVariableDeclaration) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___CHECK_DEC_FWD__ABSTRACTMETHODDECLARATION_TYPEACCESS_MSINGLEVARIABLEDECLARATION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((AbstractMethodDeclaration) arguments.get(0), (TypeAccess) arguments.get(1),
					(MSingleVariableDeclaration) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___CHECK_DEC_BWD__PARAMETER_OPERATION:
			return checkDEC_BWD((Parameter) arguments.get(0), (Operation) arguments.get(1));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___GENERATE_MODEL__RULEENTRYCONTAINER_NAMEDELEMENT2NAMEDELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (NamedElement2NamedElement) arguments.get(1));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ABSTRACTMETHODDECLARATION_OPERATION_NAMEDELEMENT2NAMEDELEMENT_ABSTRACTTYPEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(AbstractMethodDeclaration) arguments.get(1), (Operation) arguments.get(2),
					(NamedElement2NamedElement) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.VARIABLE_DEC2_PARAMETER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_VariableDec2Parameter_0_1_initialbindings_blackBBBBBB(
			VariableDec2Parameter _this, Match match, AbstractMethodDeclaration method, TypeAccess typeAccess,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner) {
		return new Object[] { _this, match, method, typeAccess, variableDec, owner };
	}

	public static final Object[] pattern_VariableDec2Parameter_0_2_SolveCSP_bindingFBBBBBB(VariableDec2Parameter _this,
			Match match, AbstractMethodDeclaration method, TypeAccess typeAccess,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, method, typeAccess, variableDec, owner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, method, typeAccess, variableDec, owner };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			VariableDec2Parameter _this, Match match, AbstractMethodDeclaration method, TypeAccess typeAccess,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner) {
		Object[] result_pattern_VariableDec2Parameter_0_2_SolveCSP_binding = pattern_VariableDec2Parameter_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, method, typeAccess, variableDec, owner);
		if (result_pattern_VariableDec2Parameter_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter_0_2_SolveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter_0_2_SolveCSP_black = pattern_VariableDec2Parameter_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, method, typeAccess, variableDec, owner };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter_0_3_CheckCSP_expressionFBB(VariableDec2Parameter _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			AbstractMethodDeclaration method, TypeAccess typeAccess, MSingleVariableDeclaration variableDec,
			AbstractTypeDeclaration owner) {
		return new Object[] { match, method, typeAccess, variableDec, owner };
	}

	public static final Object[] pattern_VariableDec2Parameter_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, AbstractMethodDeclaration method, TypeAccess typeAccess,
			MSingleVariableDeclaration variableDec) {
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeAccess);
		match.getToBeTranslatedNodes().add(variableDec);
		String variableDec__typeAccess____type_name_prime = "type";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(variableDec__typeAccess____type);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		match.getToBeTranslatedEdges().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		match.getToBeTranslatedEdges().add(variableDec__method____methodDeclaration);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		return new Object[] { match, method, typeAccess, variableDec, variableDec__typeAccess____type,
				method__variableDec____parameters, variableDec__method____methodDeclaration };
	}

	public static final Object[] pattern_VariableDec2Parameter_0_5_collectcontextelements_blackBBBBB(Match match,
			AbstractMethodDeclaration method, TypeAccess typeAccess, MSingleVariableDeclaration variableDec,
			AbstractTypeDeclaration owner) {
		return new Object[] { match, method, typeAccess, variableDec, owner };
	}

	public static final Object[] pattern_VariableDec2Parameter_0_5_collectcontextelements_greenBBBFF(Match match,
			AbstractMethodDeclaration method, AbstractTypeDeclaration owner) {
		EMoflonEdge owner__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__owner____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(method);
		match.getContextNodes().add(owner);
		String owner__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__owner____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		owner__method____bodyDeclarations.setSrc(owner);
		owner__method____bodyDeclarations.setTrg(method);
		match.getContextEdges().add(owner__method____bodyDeclarations);
		method__owner____abstractTypeDeclaration.setSrc(method);
		method__owner____abstractTypeDeclaration.setTrg(owner);
		match.getContextEdges().add(method__owner____abstractTypeDeclaration);
		owner__method____bodyDeclarations.setName(owner__method____bodyDeclarations_name_prime);
		method__owner____abstractTypeDeclaration.setName(method__owner____abstractTypeDeclaration_name_prime);
		return new Object[] { match, method, owner, owner__method____bodyDeclarations,
				method__owner____abstractTypeDeclaration };
	}

	public static final void pattern_VariableDec2Parameter_0_6_registerobjectstomatch_expressionBBBBBB(
			VariableDec2Parameter _this, Match match, AbstractMethodDeclaration method, TypeAccess typeAccess,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner) {
		_this.registerObjectsToMatch_FWD(match, method, typeAccess, variableDec, owner);

	}

	public static final boolean pattern_VariableDec2Parameter_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_2 = isApplicableMatch.getObject("operation");
		EObject _localVariable_3 = isApplicableMatch.getObject("variableDec");
		EObject _localVariable_4 = isApplicableMatch.getObject("md2o");
		EObject _localVariable_5 = isApplicableMatch.getObject("owner");
		EObject tmpMethod = _localVariable_0;
		EObject tmpTypeAccess = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		EObject tmpVariableDec = _localVariable_3;
		EObject tmpMd2o = _localVariable_4;
		EObject tmpOwner = _localVariable_5;
		if (tmpMethod instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
			if (tmpTypeAccess instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
				if (tmpOperation instanceof Operation) {
					Operation operation = (Operation) tmpOperation;
					if (tmpVariableDec instanceof MSingleVariableDeclaration) {
						MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
						if (tmpMd2o instanceof NamedElement2NamedElement) {
							NamedElement2NamedElement md2o = (NamedElement2NamedElement) tmpMd2o;
							if (tmpOwner instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration owner = (AbstractTypeDeclaration) tmpOwner;
								return new Object[] { method, typeAccess, operation, variableDec, md2o, owner,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_1_1_performtransformation_blackBBBBBBFBB(
			AbstractMethodDeclaration method, TypeAccess typeAccess, Operation operation,
			MSingleVariableDeclaration variableDec, NamedElement2NamedElement md2o, AbstractTypeDeclaration owner,
			VariableDec2Parameter _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { method, typeAccess, operation, variableDec, md2o, owner, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			VariableDec2Parameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_VariableDec2Parameter_1_1_performtransformation_binding = pattern_VariableDec2Parameter_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_VariableDec2Parameter_1_1_performtransformation_binding != null) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter_1_1_performtransformation_binding[0];
			TypeAccess typeAccess = (TypeAccess) result_pattern_VariableDec2Parameter_1_1_performtransformation_binding[1];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter_1_1_performtransformation_binding[2];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result_pattern_VariableDec2Parameter_1_1_performtransformation_binding[3];
			NamedElement2NamedElement md2o = (NamedElement2NamedElement) result_pattern_VariableDec2Parameter_1_1_performtransformation_binding[4];
			AbstractTypeDeclaration owner = (AbstractTypeDeclaration) result_pattern_VariableDec2Parameter_1_1_performtransformation_binding[5];

			Object[] result_pattern_VariableDec2Parameter_1_1_performtransformation_black = pattern_VariableDec2Parameter_1_1_performtransformation_blackBBBBBBFBB(
					method, typeAccess, operation, variableDec, md2o, owner, _this, isApplicableMatch);
			if (result_pattern_VariableDec2Parameter_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VariableDec2Parameter_1_1_performtransformation_black[6];

				return new Object[] { method, typeAccess, operation, variableDec, md2o, owner, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_1_1_performtransformation_greenFBFFFBBB(
			TypeAccess typeAccess, Operation operation, MSingleVariableDeclaration variableDec, CSP csp) {
		org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p = UmlFactory.eINSTANCE.createVariableDec2Parameter();
		NamedElement2NamedElement n2n = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		Parameter param = UMLFactory.eINSTANCE.createParameter();
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		Object _localVariable_0 = csp.getValue("param", "name");
		Object _localVariable_1 = csp.getValue("param", "direction");
		vd2p.setSource(variableDec);
		n2n.setSource(variableDec);
		n2n.setTarget(param);
		vd2p.setTarget(param);
		operation.getOwnedParameters().add(param);
		ty2p.setSource(typeAccess);
		ty2p.setTarget(param);
		String param_name_prime = (String) _localVariable_0;
		ParameterDirectionKind param_direction_prime = (ParameterDirectionKind) _localVariable_1;
		param.setName(param_name_prime);
		param.setDirection(param_direction_prime);
		return new Object[] { vd2p, typeAccess, n2n, param, ty2p, operation, variableDec, csp };
	}

	public static final Object[] pattern_VariableDec2Parameter_1_2_collecttranslatedelements_blackBBBBBB(
			org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p, TypeAccess typeAccess,
			NamedElement2NamedElement n2n, Parameter param, TypeAccess2Parameter ty2p,
			MSingleVariableDeclaration variableDec) {
		return new Object[] { vd2p, typeAccess, n2n, param, ty2p, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter_1_2_collecttranslatedelements_greenFBBBBBB(
			org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p, TypeAccess typeAccess,
			NamedElement2NamedElement n2n, Parameter param, TypeAccess2Parameter ty2p,
			MSingleVariableDeclaration variableDec) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(vd2p);
		ruleresult.getTranslatedElements().add(typeAccess);
		ruleresult.getCreatedLinkElements().add(n2n);
		ruleresult.getCreatedElements().add(param);
		ruleresult.getCreatedLinkElements().add(ty2p);
		ruleresult.getTranslatedElements().add(variableDec);
		return new Object[] { ruleresult, vd2p, typeAccess, n2n, param, ty2p, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject vd2p, EObject method, EObject typeAccess, EObject n2n, EObject param,
			EObject ty2p, EObject operation, EObject variableDec, EObject md2o, EObject owner) {
		if (!method.equals(vd2p)) {
			if (!method.equals(typeAccess)) {
				if (!method.equals(n2n)) {
					if (!method.equals(param)) {
						if (!method.equals(ty2p)) {
							if (!method.equals(operation)) {
								if (!method.equals(variableDec)) {
									if (!method.equals(owner)) {
										if (!typeAccess.equals(vd2p)) {
											if (!typeAccess.equals(variableDec)) {
												if (!n2n.equals(vd2p)) {
													if (!n2n.equals(typeAccess)) {
														if (!n2n.equals(param)) {
															if (!n2n.equals(ty2p)) {
																if (!n2n.equals(operation)) {
																	if (!n2n.equals(variableDec)) {
																		if (!n2n.equals(owner)) {
																			if (!param.equals(vd2p)) {
																				if (!param.equals(typeAccess)) {
																					if (!param.equals(ty2p)) {
																						if (!param
																								.equals(variableDec)) {
																							if (!ty2p.equals(vd2p)) {
																								if (!ty2p.equals(
																										typeAccess)) {
																									if (!ty2p.equals(
																											variableDec)) {
																										if (!operation
																												.equals(vd2p)) {
																											if (!operation
																													.equals(typeAccess)) {
																												if (!operation
																														.equals(param)) {
																													if (!operation
																															.equals(ty2p)) {
																														if (!operation
																																.equals(variableDec)) {
																															if (!operation
																																	.equals(owner)) {
																																if (!variableDec
																																		.equals(vd2p)) {
																																	if (!md2o
																																			.equals(vd2p)) {
																																		if (!md2o
																																				.equals(method)) {
																																			if (!md2o
																																					.equals(typeAccess)) {
																																				if (!md2o
																																						.equals(n2n)) {
																																					if (!md2o
																																							.equals(param)) {
																																						if (!md2o
																																								.equals(ty2p)) {
																																							if (!md2o
																																									.equals(operation)) {
																																								if (!md2o
																																										.equals(variableDec)) {
																																									if (!md2o
																																											.equals(owner)) {
																																										if (!owner
																																												.equals(vd2p)) {
																																											if (!owner
																																													.equals(typeAccess)) {
																																												if (!owner
																																														.equals(param)) {
																																													if (!owner
																																															.equals(ty2p)) {
																																														if (!owner
																																																.equals(variableDec)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	vd2p,
																																																	method,
																																																	typeAccess,
																																																	n2n,
																																																	param,
																																																	ty2p,
																																																	operation,
																																																	variableDec,
																																																	md2o,
																																																	owner };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_VariableDec2Parameter_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject vd2p, EObject method, EObject typeAccess, EObject n2n, EObject param,
			EObject ty2p, EObject operation, EObject variableDec) {
		EMoflonEdge n2n__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2n__variableDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__variableDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VariableDec2Parameter";
		String n2n__param____target_name_prime = "target";
		String ty2p__typeAccess____source_name_prime = "source";
		String ty2p__param____target_name_prime = "target";
		String vd2p__param____target_name_prime = "target";
		String variableDec__typeAccess____type_name_prime = "type";
		String n2n__variableDec____source_name_prime = "source";
		String vd2p__variableDec____source_name_prime = "source";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		n2n__param____target.setSrc(n2n);
		n2n__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(n2n__param____target);
		ty2p__typeAccess____source.setSrc(ty2p);
		ty2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ty2p__typeAccess____source);
		ty2p__param____target.setSrc(ty2p);
		ty2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(ty2p__param____target);
		vd2p__param____target.setSrc(vd2p);
		vd2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(vd2p__param____target);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(variableDec__typeAccess____type);
		n2n__variableDec____source.setSrc(n2n);
		n2n__variableDec____source.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(n2n__variableDec____source);
		vd2p__variableDec____source.setSrc(vd2p);
		vd2p__variableDec____source.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(vd2p__variableDec____source);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		ruleresult.getCreatedEdges().add(operation__param____ownedParameter);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		ruleresult.getTranslatedEdges().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		ruleresult.getTranslatedEdges().add(variableDec__method____methodDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		n2n__param____target.setName(n2n__param____target_name_prime);
		ty2p__typeAccess____source.setName(ty2p__typeAccess____source_name_prime);
		ty2p__param____target.setName(ty2p__param____target_name_prime);
		vd2p__param____target.setName(vd2p__param____target_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		n2n__variableDec____source.setName(n2n__variableDec____source_name_prime);
		vd2p__variableDec____source.setName(vd2p__variableDec____source_name_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		return new Object[] { ruleresult, vd2p, method, typeAccess, n2n, param, ty2p, operation, variableDec,
				n2n__param____target, ty2p__typeAccess____source, ty2p__param____target, vd2p__param____target,
				variableDec__typeAccess____type, n2n__variableDec____source, vd2p__variableDec____source,
				operation__param____ownedParameter, method__variableDec____parameters,
				variableDec__method____methodDeclaration };
	}

	public static final void pattern_VariableDec2Parameter_1_5_registerobjects_expressionBBBBBBBBBBBB(
			VariableDec2Parameter _this, PerformRuleResult ruleresult, EObject vd2p, EObject method, EObject typeAccess,
			EObject n2n, EObject param, EObject ty2p, EObject operation, EObject variableDec, EObject md2o,
			EObject owner) {
		_this.registerObjects_FWD(ruleresult, vd2p, method, typeAccess, n2n, param, ty2p, operation, variableDec, md2o,
				owner);

	}

	public static final PerformRuleResult pattern_VariableDec2Parameter_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_2_1_preparereturnvalue_bindingFB(
			VariableDec2Parameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_2_1_preparereturnvalue_blackFBB(EClass eClass,
			VariableDec2Parameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_2_1_preparereturnvalue_bindingAndBlackFFB(
			VariableDec2Parameter _this) {
		Object[] result_pattern_VariableDec2Parameter_2_1_preparereturnvalue_binding = pattern_VariableDec2Parameter_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDec2Parameter_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_VariableDec2Parameter_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDec2Parameter_2_1_preparereturnvalue_black = pattern_VariableDec2Parameter_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_VariableDec2Parameter_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_VariableDec2Parameter_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "VariableDec2Parameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_VariableDec2Parameter_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("method");
		EObject _localVariable_1 = match.getObject("typeAccess");
		EObject _localVariable_2 = match.getObject("variableDec");
		EObject _localVariable_3 = match.getObject("owner");
		EObject tmpMethod = _localVariable_0;
		EObject tmpTypeAccess = _localVariable_1;
		EObject tmpVariableDec = _localVariable_2;
		EObject tmpOwner = _localVariable_3;
		if (tmpMethod instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
			if (tmpTypeAccess instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
				if (tmpVariableDec instanceof MSingleVariableDeclaration) {
					MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
					if (tmpOwner instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration owner = (AbstractTypeDeclaration) tmpOwner;
						return new Object[] { method, typeAccess, variableDec, owner, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter_2_2_corematch_blackBBFBFBB(
			AbstractMethodDeclaration method, TypeAccess typeAccess, MSingleVariableDeclaration variableDec,
			AbstractTypeDeclaration owner, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement md2o : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(method,
				NamedElement2NamedElement.class, "source")) {
			NamedElement tmpOperation = md2o.getTarget();
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				_result.add(new Object[] { method, typeAccess, operation, variableDec, md2o, owner, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter_2_3_findcontext_blackBBBBBB(
			AbstractMethodDeclaration method, TypeAccess typeAccess, Operation operation,
			MSingleVariableDeclaration variableDec, NamedElement2NamedElement md2o, AbstractTypeDeclaration owner) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (typeAccess.equals(variableDec.getType())) {
			if (method.equals(md2o.getSource())) {
				if (operation.equals(md2o.getTarget())) {
					if (owner.getBodyDeclarations().contains(method)) {
						if (method.getParameters().contains(variableDec)) {
							_result.add(new Object[] { method, typeAccess, operation, variableDec, md2o, owner });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_2_3_findcontext_greenBBBBBBFFFFFFFF(
			AbstractMethodDeclaration method, TypeAccess typeAccess, Operation operation,
			MSingleVariableDeclaration variableDec, NamedElement2NamedElement md2o, AbstractTypeDeclaration owner) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge owner__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__owner____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String variableDec__typeAccess____type_name_prime = "type";
		String md2o__method____source_name_prime = "source";
		String md2o__operation____target_name_prime = "target";
		String owner__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__owner____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(variableDec);
		isApplicableMatch.getAllContextElements().add(md2o);
		isApplicableMatch.getAllContextElements().add(owner);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(variableDec__typeAccess____type);
		md2o__method____source.setSrc(md2o);
		md2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(md2o__method____source);
		md2o__operation____target.setSrc(md2o);
		md2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(md2o__operation____target);
		owner__method____bodyDeclarations.setSrc(owner);
		owner__method____bodyDeclarations.setTrg(method);
		isApplicableMatch.getAllContextElements().add(owner__method____bodyDeclarations);
		method__owner____abstractTypeDeclaration.setSrc(method);
		method__owner____abstractTypeDeclaration.setTrg(owner);
		isApplicableMatch.getAllContextElements().add(method__owner____abstractTypeDeclaration);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		isApplicableMatch.getAllContextElements().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		isApplicableMatch.getAllContextElements().add(variableDec__method____methodDeclaration);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		md2o__method____source.setName(md2o__method____source_name_prime);
		md2o__operation____target.setName(md2o__operation____target_name_prime);
		owner__method____bodyDeclarations.setName(owner__method____bodyDeclarations_name_prime);
		method__owner____abstractTypeDeclaration.setName(method__owner____abstractTypeDeclaration_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		return new Object[] { method, typeAccess, operation, variableDec, md2o, owner, isApplicableMatch,
				variableDec__typeAccess____type, md2o__method____source, md2o__operation____target,
				owner__method____bodyDeclarations, method__owner____abstractTypeDeclaration,
				method__variableDec____parameters, variableDec__method____methodDeclaration };
	}

	public static final Object[] pattern_VariableDec2Parameter_2_4_solveCSP_bindingFBBBBBBBB(
			VariableDec2Parameter _this, IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			TypeAccess typeAccess, Operation operation, MSingleVariableDeclaration variableDec,
			NamedElement2NamedElement md2o, AbstractTypeDeclaration owner) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, method, typeAccess, operation,
				variableDec, md2o, owner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, typeAccess, operation, variableDec, md2o,
					owner };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			VariableDec2Parameter _this, IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			TypeAccess typeAccess, Operation operation, MSingleVariableDeclaration variableDec,
			NamedElement2NamedElement md2o, AbstractTypeDeclaration owner) {
		Object[] result_pattern_VariableDec2Parameter_2_4_solveCSP_binding = pattern_VariableDec2Parameter_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, method, typeAccess, operation, variableDec, md2o, owner);
		if (result_pattern_VariableDec2Parameter_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter_2_4_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter_2_4_solveCSP_black = pattern_VariableDec2Parameter_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, typeAccess, operation, variableDec, md2o,
						owner };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter_2_5_checkCSP_expressionFBB(VariableDec2Parameter _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "VariableDec2Parameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_VariableDec2Parameter_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_10_1_initialbindings_blackBBBB(
			VariableDec2Parameter _this, Match match, Parameter param, Operation operation) {
		return new Object[] { _this, match, param, operation };
	}

	public static final Object[] pattern_VariableDec2Parameter_10_2_SolveCSP_bindingFBBBB(VariableDec2Parameter _this,
			Match match, Parameter param, Operation operation) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, param, operation);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, param, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter_10_2_SolveCSP_bindingAndBlackFBBBB(
			VariableDec2Parameter _this, Match match, Parameter param, Operation operation) {
		Object[] result_pattern_VariableDec2Parameter_10_2_SolveCSP_binding = pattern_VariableDec2Parameter_10_2_SolveCSP_bindingFBBBB(
				_this, match, param, operation);
		if (result_pattern_VariableDec2Parameter_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter_10_2_SolveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter_10_2_SolveCSP_black = pattern_VariableDec2Parameter_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, param, operation };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter_10_3_CheckCSP_expressionFBB(VariableDec2Parameter _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_10_4_collectelementstobetranslated_blackBBB(Match match,
			Parameter param, Operation operation) {
		return new Object[] { match, param, operation };
	}

	public static final Object[] pattern_VariableDec2Parameter_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Parameter param, Operation operation) {
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(param);
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		match.getToBeTranslatedEdges().add(operation__param____ownedParameter);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		return new Object[] { match, param, operation, operation__param____ownedParameter };
	}

	public static final Object[] pattern_VariableDec2Parameter_10_5_collectcontextelements_blackBBB(Match match,
			Parameter param, Operation operation) {
		return new Object[] { match, param, operation };
	}

	public static final Object[] pattern_VariableDec2Parameter_10_5_collectcontextelements_greenBB(Match match,
			Operation operation) {
		match.getContextNodes().add(operation);
		return new Object[] { match, operation };
	}

	public static final void pattern_VariableDec2Parameter_10_6_registerobjectstomatch_expressionBBBB(
			VariableDec2Parameter _this, Match match, Parameter param, Operation operation) {
		_this.registerObjectsToMatch_BWD(match, param, operation);

	}

	public static final boolean pattern_VariableDec2Parameter_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("method");
		EObject _localVariable_1 = isApplicableMatch.getObject("param");
		EObject _localVariable_2 = isApplicableMatch.getObject("operation");
		EObject _localVariable_3 = isApplicableMatch.getObject("md2o");
		EObject _localVariable_4 = isApplicableMatch.getObject("owner");
		EObject tmpMethod = _localVariable_0;
		EObject tmpParam = _localVariable_1;
		EObject tmpOperation = _localVariable_2;
		EObject tmpMd2o = _localVariable_3;
		EObject tmpOwner = _localVariable_4;
		if (tmpMethod instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
			if (tmpParam instanceof Parameter) {
				Parameter param = (Parameter) tmpParam;
				if (tmpOperation instanceof Operation) {
					Operation operation = (Operation) tmpOperation;
					if (tmpMd2o instanceof NamedElement2NamedElement) {
						NamedElement2NamedElement md2o = (NamedElement2NamedElement) tmpMd2o;
						if (tmpOwner instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration owner = (AbstractTypeDeclaration) tmpOwner;
							return new Object[] { method, param, operation, md2o, owner, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_11_1_performtransformation_blackBBBBBFBB(
			AbstractMethodDeclaration method, Parameter param, Operation operation, NamedElement2NamedElement md2o,
			AbstractTypeDeclaration owner, VariableDec2Parameter _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { method, param, operation, md2o, owner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			VariableDec2Parameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_VariableDec2Parameter_11_1_performtransformation_binding = pattern_VariableDec2Parameter_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_VariableDec2Parameter_11_1_performtransformation_binding != null) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter_11_1_performtransformation_binding[0];
			Parameter param = (Parameter) result_pattern_VariableDec2Parameter_11_1_performtransformation_binding[1];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter_11_1_performtransformation_binding[2];
			NamedElement2NamedElement md2o = (NamedElement2NamedElement) result_pattern_VariableDec2Parameter_11_1_performtransformation_binding[3];
			AbstractTypeDeclaration owner = (AbstractTypeDeclaration) result_pattern_VariableDec2Parameter_11_1_performtransformation_binding[4];

			Object[] result_pattern_VariableDec2Parameter_11_1_performtransformation_black = pattern_VariableDec2Parameter_11_1_performtransformation_blackBBBBBFBB(
					method, param, operation, md2o, owner, _this, isApplicableMatch);
			if (result_pattern_VariableDec2Parameter_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_VariableDec2Parameter_11_1_performtransformation_black[5];

				return new Object[] { method, param, operation, md2o, owner, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_11_1_performtransformation_greenFBFFBFFB(
			AbstractMethodDeclaration method, Parameter param, CSP csp) {
		org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p = UmlFactory.eINSTANCE.createVariableDec2Parameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		NamedElement2NamedElement n2n = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		MSingleVariableDeclaration variableDec = ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
		Object _localVariable_0 = csp.getValue("variableDec", "name");
		vd2p.setTarget(param);
		n2n.setTarget(param);
		ty2p.setSource(typeAccess);
		ty2p.setTarget(param);
		variableDec.setType(typeAccess);
		n2n.setSource(variableDec);
		vd2p.setSource(variableDec);
		method.getParameters().add(variableDec);
		String variableDec_name_prime = (String) _localVariable_0;
		variableDec.setName(variableDec_name_prime);
		return new Object[] { vd2p, method, typeAccess, n2n, param, ty2p, variableDec, csp };
	}

	public static final Object[] pattern_VariableDec2Parameter_11_2_collecttranslatedelements_blackBBBBBB(
			org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p, TypeAccess typeAccess,
			NamedElement2NamedElement n2n, Parameter param, TypeAccess2Parameter ty2p,
			MSingleVariableDeclaration variableDec) {
		return new Object[] { vd2p, typeAccess, n2n, param, ty2p, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter_11_2_collecttranslatedelements_greenFBBBBBB(
			org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p, TypeAccess typeAccess,
			NamedElement2NamedElement n2n, Parameter param, TypeAccess2Parameter ty2p,
			MSingleVariableDeclaration variableDec) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(vd2p);
		ruleresult.getCreatedElements().add(typeAccess);
		ruleresult.getCreatedLinkElements().add(n2n);
		ruleresult.getTranslatedElements().add(param);
		ruleresult.getCreatedLinkElements().add(ty2p);
		ruleresult.getCreatedElements().add(variableDec);
		return new Object[] { ruleresult, vd2p, typeAccess, n2n, param, ty2p, variableDec };
	}

	public static final Object[] pattern_VariableDec2Parameter_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject vd2p, EObject method, EObject typeAccess, EObject n2n, EObject param,
			EObject ty2p, EObject operation, EObject variableDec, EObject md2o, EObject owner) {
		if (!method.equals(vd2p)) {
			if (!method.equals(typeAccess)) {
				if (!method.equals(n2n)) {
					if (!method.equals(param)) {
						if (!method.equals(ty2p)) {
							if (!method.equals(operation)) {
								if (!method.equals(variableDec)) {
									if (!method.equals(owner)) {
										if (!typeAccess.equals(vd2p)) {
											if (!typeAccess.equals(variableDec)) {
												if (!n2n.equals(vd2p)) {
													if (!n2n.equals(typeAccess)) {
														if (!n2n.equals(param)) {
															if (!n2n.equals(ty2p)) {
																if (!n2n.equals(operation)) {
																	if (!n2n.equals(variableDec)) {
																		if (!n2n.equals(owner)) {
																			if (!param.equals(vd2p)) {
																				if (!param.equals(typeAccess)) {
																					if (!param.equals(ty2p)) {
																						if (!param
																								.equals(variableDec)) {
																							if (!ty2p.equals(vd2p)) {
																								if (!ty2p.equals(
																										typeAccess)) {
																									if (!ty2p.equals(
																											variableDec)) {
																										if (!operation
																												.equals(vd2p)) {
																											if (!operation
																													.equals(typeAccess)) {
																												if (!operation
																														.equals(param)) {
																													if (!operation
																															.equals(ty2p)) {
																														if (!operation
																																.equals(variableDec)) {
																															if (!operation
																																	.equals(owner)) {
																																if (!variableDec
																																		.equals(vd2p)) {
																																	if (!md2o
																																			.equals(vd2p)) {
																																		if (!md2o
																																				.equals(method)) {
																																			if (!md2o
																																					.equals(typeAccess)) {
																																				if (!md2o
																																						.equals(n2n)) {
																																					if (!md2o
																																							.equals(param)) {
																																						if (!md2o
																																								.equals(ty2p)) {
																																							if (!md2o
																																									.equals(operation)) {
																																								if (!md2o
																																										.equals(variableDec)) {
																																									if (!md2o
																																											.equals(owner)) {
																																										if (!owner
																																												.equals(vd2p)) {
																																											if (!owner
																																													.equals(typeAccess)) {
																																												if (!owner
																																														.equals(param)) {
																																													if (!owner
																																															.equals(ty2p)) {
																																														if (!owner
																																																.equals(variableDec)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	vd2p,
																																																	method,
																																																	typeAccess,
																																																	n2n,
																																																	param,
																																																	ty2p,
																																																	operation,
																																																	variableDec,
																																																	md2o,
																																																	owner };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_VariableDec2Parameter_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject vd2p, EObject method, EObject typeAccess, EObject n2n, EObject param,
			EObject ty2p, EObject operation, EObject variableDec) {
		EMoflonEdge n2n__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__typeAccess____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ty2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__param____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__typeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge n2n__variableDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge vd2p__variableDec____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__variableDec____parameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge variableDec__method____methodDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "VariableDec2Parameter";
		String n2n__param____target_name_prime = "target";
		String ty2p__typeAccess____source_name_prime = "source";
		String ty2p__param____target_name_prime = "target";
		String vd2p__param____target_name_prime = "target";
		String variableDec__typeAccess____type_name_prime = "type";
		String n2n__variableDec____source_name_prime = "source";
		String vd2p__variableDec____source_name_prime = "source";
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		String method__variableDec____parameters_name_prime = "parameters";
		String variableDec__method____methodDeclaration_name_prime = "methodDeclaration";
		n2n__param____target.setSrc(n2n);
		n2n__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(n2n__param____target);
		ty2p__typeAccess____source.setSrc(ty2p);
		ty2p__typeAccess____source.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(ty2p__typeAccess____source);
		ty2p__param____target.setSrc(ty2p);
		ty2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(ty2p__param____target);
		vd2p__param____target.setSrc(vd2p);
		vd2p__param____target.setTrg(param);
		ruleresult.getCreatedEdges().add(vd2p__param____target);
		variableDec__typeAccess____type.setSrc(variableDec);
		variableDec__typeAccess____type.setTrg(typeAccess);
		ruleresult.getCreatedEdges().add(variableDec__typeAccess____type);
		n2n__variableDec____source.setSrc(n2n);
		n2n__variableDec____source.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(n2n__variableDec____source);
		vd2p__variableDec____source.setSrc(vd2p);
		vd2p__variableDec____source.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(vd2p__variableDec____source);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		ruleresult.getTranslatedEdges().add(operation__param____ownedParameter);
		method__variableDec____parameters.setSrc(method);
		method__variableDec____parameters.setTrg(variableDec);
		ruleresult.getCreatedEdges().add(method__variableDec____parameters);
		variableDec__method____methodDeclaration.setSrc(variableDec);
		variableDec__method____methodDeclaration.setTrg(method);
		ruleresult.getCreatedEdges().add(variableDec__method____methodDeclaration);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		n2n__param____target.setName(n2n__param____target_name_prime);
		ty2p__typeAccess____source.setName(ty2p__typeAccess____source_name_prime);
		ty2p__param____target.setName(ty2p__param____target_name_prime);
		vd2p__param____target.setName(vd2p__param____target_name_prime);
		variableDec__typeAccess____type.setName(variableDec__typeAccess____type_name_prime);
		n2n__variableDec____source.setName(n2n__variableDec____source_name_prime);
		vd2p__variableDec____source.setName(vd2p__variableDec____source_name_prime);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		method__variableDec____parameters.setName(method__variableDec____parameters_name_prime);
		variableDec__method____methodDeclaration.setName(variableDec__method____methodDeclaration_name_prime);
		return new Object[] { ruleresult, vd2p, method, typeAccess, n2n, param, ty2p, operation, variableDec,
				n2n__param____target, ty2p__typeAccess____source, ty2p__param____target, vd2p__param____target,
				variableDec__typeAccess____type, n2n__variableDec____source, vd2p__variableDec____source,
				operation__param____ownedParameter, method__variableDec____parameters,
				variableDec__method____methodDeclaration };
	}

	public static final void pattern_VariableDec2Parameter_11_5_registerobjects_expressionBBBBBBBBBBBB(
			VariableDec2Parameter _this, PerformRuleResult ruleresult, EObject vd2p, EObject method, EObject typeAccess,
			EObject n2n, EObject param, EObject ty2p, EObject operation, EObject variableDec, EObject md2o,
			EObject owner) {
		_this.registerObjects_BWD(ruleresult, vd2p, method, typeAccess, n2n, param, ty2p, operation, variableDec, md2o,
				owner);

	}

	public static final PerformRuleResult pattern_VariableDec2Parameter_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_12_1_preparereturnvalue_bindingFB(
			VariableDec2Parameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_12_1_preparereturnvalue_blackFBB(EClass eClass,
			VariableDec2Parameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_12_1_preparereturnvalue_bindingAndBlackFFB(
			VariableDec2Parameter _this) {
		Object[] result_pattern_VariableDec2Parameter_12_1_preparereturnvalue_binding = pattern_VariableDec2Parameter_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDec2Parameter_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_VariableDec2Parameter_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDec2Parameter_12_1_preparereturnvalue_black = pattern_VariableDec2Parameter_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_VariableDec2Parameter_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_VariableDec2Parameter_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "VariableDec2Parameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_VariableDec2Parameter_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("param");
		EObject _localVariable_1 = match.getObject("operation");
		EObject tmpParam = _localVariable_0;
		EObject tmpOperation = _localVariable_1;
		if (tmpParam instanceof Parameter) {
			Parameter param = (Parameter) tmpParam;
			if (tmpOperation instanceof Operation) {
				Operation operation = (Operation) tmpOperation;
				return new Object[] { param, operation, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter_12_2_corematch_blackFBBFB(Parameter param,
			Operation operation, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (NamedElement2NamedElement md2o : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(operation, NamedElement2NamedElement.class, "target")) {
			org.eclipse.modisco.java.NamedElement tmpMethod = md2o.getSource();
			if (tmpMethod instanceof AbstractMethodDeclaration) {
				AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
				_result.add(new Object[] { method, param, operation, md2o, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter_12_3_findcontext_blackBBBBF(
			AbstractMethodDeclaration method, Parameter param, Operation operation, NamedElement2NamedElement md2o) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (operation.getOwnedParameters().contains(param)) {
			if (method.equals(md2o.getSource())) {
				if (operation.equals(md2o.getTarget())) {
					AbstractTypeDeclaration owner = method.getAbstractTypeDeclaration();
					if (owner != null) {
						_result.add(new Object[] { method, param, operation, md2o, owner });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_12_3_findcontext_greenBBBBBFFFFFF(
			AbstractMethodDeclaration method, Parameter param, Operation operation, NamedElement2NamedElement md2o,
			AbstractTypeDeclaration owner) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge operation__param____ownedParameter = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__method____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__operation____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge owner__method____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge method__owner____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String operation__param____ownedParameter_name_prime = "ownedParameter";
		String md2o__method____source_name_prime = "source";
		String md2o__operation____target_name_prime = "target";
		String owner__method____bodyDeclarations_name_prime = "bodyDeclarations";
		String method__owner____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		isApplicableMatch.getAllContextElements().add(method);
		isApplicableMatch.getAllContextElements().add(param);
		isApplicableMatch.getAllContextElements().add(operation);
		isApplicableMatch.getAllContextElements().add(md2o);
		isApplicableMatch.getAllContextElements().add(owner);
		operation__param____ownedParameter.setSrc(operation);
		operation__param____ownedParameter.setTrg(param);
		isApplicableMatch.getAllContextElements().add(operation__param____ownedParameter);
		md2o__method____source.setSrc(md2o);
		md2o__method____source.setTrg(method);
		isApplicableMatch.getAllContextElements().add(md2o__method____source);
		md2o__operation____target.setSrc(md2o);
		md2o__operation____target.setTrg(operation);
		isApplicableMatch.getAllContextElements().add(md2o__operation____target);
		owner__method____bodyDeclarations.setSrc(owner);
		owner__method____bodyDeclarations.setTrg(method);
		isApplicableMatch.getAllContextElements().add(owner__method____bodyDeclarations);
		method__owner____abstractTypeDeclaration.setSrc(method);
		method__owner____abstractTypeDeclaration.setTrg(owner);
		isApplicableMatch.getAllContextElements().add(method__owner____abstractTypeDeclaration);
		operation__param____ownedParameter.setName(operation__param____ownedParameter_name_prime);
		md2o__method____source.setName(md2o__method____source_name_prime);
		md2o__operation____target.setName(md2o__operation____target_name_prime);
		owner__method____bodyDeclarations.setName(owner__method____bodyDeclarations_name_prime);
		method__owner____abstractTypeDeclaration.setName(method__owner____abstractTypeDeclaration_name_prime);
		return new Object[] { method, param, operation, md2o, owner, isApplicableMatch,
				operation__param____ownedParameter, md2o__method____source, md2o__operation____target,
				owner__method____bodyDeclarations, method__owner____abstractTypeDeclaration };
	}

	public static final Object[] pattern_VariableDec2Parameter_12_4_solveCSP_bindingFBBBBBBB(
			VariableDec2Parameter _this, IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			Parameter param, Operation operation, NamedElement2NamedElement md2o, AbstractTypeDeclaration owner) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, method, param, operation, md2o,
				owner);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, param, operation, md2o, owner };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			VariableDec2Parameter _this, IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			Parameter param, Operation operation, NamedElement2NamedElement md2o, AbstractTypeDeclaration owner) {
		Object[] result_pattern_VariableDec2Parameter_12_4_solveCSP_binding = pattern_VariableDec2Parameter_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, method, param, operation, md2o, owner);
		if (result_pattern_VariableDec2Parameter_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter_12_4_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter_12_4_solveCSP_black = pattern_VariableDec2Parameter_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, param, operation, md2o, owner };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter_12_5_checkCSP_expressionFBB(VariableDec2Parameter _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "VariableDec2Parameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_VariableDec2Parameter_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_20_1_preparereturnvalue_bindingFB(
			VariableDec2Parameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VariableDec2Parameter _this) {
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

	public static final Object[] pattern_VariableDec2Parameter_20_1_preparereturnvalue_bindingAndBlackFFBF(
			VariableDec2Parameter _this) {
		Object[] result_pattern_VariableDec2Parameter_20_1_preparereturnvalue_binding = pattern_VariableDec2Parameter_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDec2Parameter_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VariableDec2Parameter_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDec2Parameter_20_1_preparereturnvalue_black = pattern_VariableDec2Parameter_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VariableDec2Parameter_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VariableDec2Parameter_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VariableDec2Parameter_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedParameter) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpOperation = _edge_ownedParameter.getSrc();
		if (tmpOperation instanceof Operation) {
			Operation operation = (Operation) tmpOperation;
			EObject tmpParam = _edge_ownedParameter.getTrg();
			if (tmpParam instanceof Parameter) {
				Parameter param = (Parameter) tmpParam;
				if (operation.getOwnedParameters().contains(param)) {
					_result.add(new Object[] { param, operation, _edge_ownedParameter });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VariableDec2Parameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			VariableDec2Parameter _this, Match match, Parameter param, Operation operation) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, param, operation);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VariableDec2Parameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VariableDec2Parameter_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_1_preparereturnvalue_bindingFB(
			VariableDec2Parameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			VariableDec2Parameter _this) {
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

	public static final Object[] pattern_VariableDec2Parameter_21_1_preparereturnvalue_bindingAndBlackFFBF(
			VariableDec2Parameter _this) {
		Object[] result_pattern_VariableDec2Parameter_21_1_preparereturnvalue_binding = pattern_VariableDec2Parameter_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_VariableDec2Parameter_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_VariableDec2Parameter_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_VariableDec2Parameter_21_1_preparereturnvalue_black = pattern_VariableDec2Parameter_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_VariableDec2Parameter_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_VariableDec2Parameter_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_VariableDec2Parameter_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess typeAccess, AbstractTypeDeclaration owner) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_905003 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!owner.equals(__DEC_typeAccess_superInterfaces_905003)) {
				return new Object[] { typeAccess, owner };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_45700 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess typeAccess) {
		for (ArrayType __DEC_typeAccess_elementType_64617 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess typeAccess, AbstractTypeDeclaration owner) {
		for (ClassDeclaration __DEC_typeAccess_superClass_184594 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!owner.equals(__DEC_typeAccess_superClass_184594)) {
				return new Object[] { typeAccess, owner };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess typeAccess, AbstractMethodDeclaration method) {
		for (MethodDeclaration __DEC_typeAccess_returnType_713751 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, MethodDeclaration.class, "returnType")) {
			if (!method.equals(__DEC_typeAccess_returnType_713751)) {
				return new Object[] { typeAccess, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAccess) {
		for (ParameterizedType __DEC_typeAccess_type_643206 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_999901 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess typeAccess) {
		for (ArrayInitializer __DEC_typeAccess_expressions_886274 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayInitializer.class, "expressions")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_8BB(
			AbstractTypeDeclaration owner, TypeAccess typeAccess) {
		if (owner.getSuperInterfaces().contains(typeAccess)) {
			return new Object[] { owner, typeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpVariableDec = _edge_type.getSrc();
		if (tmpVariableDec instanceof MSingleVariableDeclaration) {
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
			EObject tmpTypeAccess = _edge_type.getTrg();
			if (tmpTypeAccess instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
				if (typeAccess.equals(variableDec.getType())) {
					AbstractMethodDeclaration method = variableDec.getMethodDeclaration();
					if (method != null) {
						AbstractTypeDeclaration owner = method.getAbstractTypeDeclaration();
						if (owner != null) {
							if (pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_1B(
									typeAccess) == null) {
								if (pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_2B(
										typeAccess) == null) {
									if (pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_5B(
											typeAccess) == null) {
										if (pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_6B(
												typeAccess) == null) {
											if (pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_7B(
													typeAccess) == null) {
												if (pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_4BB(
														typeAccess, method) == null) {
													if (pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_0BB(
															typeAccess, owner) == null) {
														if (pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_3BB(
																typeAccess, owner) == null) {
															if (pattern_VariableDec2Parameter_21_2_testcorematchandDECs_black_nac_8BB(
																	owner, typeAccess) == null) {
																_result.add(new Object[] { method, typeAccess,
																		variableDec, owner, _edge_type });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_VariableDec2Parameter_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_VariableDec2Parameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			VariableDec2Parameter _this, Match match, AbstractMethodDeclaration method, TypeAccess typeAccess,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, method, typeAccess, variableDec, owner);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			VariableDec2Parameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_VariableDec2Parameter_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_24_1_prepare_blackB(VariableDec2Parameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VariableDec2Parameter_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("method");
		EObject _localVariable_1 = sourceMatch.getObject("typeAccess");
		EObject _localVariable_2 = targetMatch.getObject("param");
		EObject _localVariable_3 = targetMatch.getObject("operation");
		EObject _localVariable_4 = sourceMatch.getObject("variableDec");
		EObject _localVariable_5 = sourceMatch.getObject("owner");
		EObject tmpMethod = _localVariable_0;
		EObject tmpTypeAccess = _localVariable_1;
		EObject tmpParam = _localVariable_2;
		EObject tmpOperation = _localVariable_3;
		EObject tmpVariableDec = _localVariable_4;
		EObject tmpOwner = _localVariable_5;
		if (tmpMethod instanceof AbstractMethodDeclaration) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
			if (tmpTypeAccess instanceof TypeAccess) {
				TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
				if (tmpParam instanceof Parameter) {
					Parameter param = (Parameter) tmpParam;
					if (tmpOperation instanceof Operation) {
						Operation operation = (Operation) tmpOperation;
						if (tmpVariableDec instanceof MSingleVariableDeclaration) {
							MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) tmpVariableDec;
							if (tmpOwner instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration owner = (AbstractTypeDeclaration) tmpOwner;
								return new Object[] { method, typeAccess, param, operation, variableDec, owner,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_blackBBBBBBBB(
			AbstractMethodDeclaration method, TypeAccess typeAccess, Parameter param, Operation operation,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { method, typeAccess, param, operation, variableDec, owner, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_binding = pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_binding != null) {
			AbstractMethodDeclaration method = (AbstractMethodDeclaration) result_pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_binding[0];
			TypeAccess typeAccess = (TypeAccess) result_pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_binding[1];
			Parameter param = (Parameter) result_pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_binding[2];
			Operation operation = (Operation) result_pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_binding[3];
			MSingleVariableDeclaration variableDec = (MSingleVariableDeclaration) result_pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_binding[4];
			AbstractTypeDeclaration owner = (AbstractTypeDeclaration) result_pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_black = pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_blackBBBBBBBB(
					method, typeAccess, param, operation, variableDec, owner, sourceMatch, targetMatch);
			if (result_pattern_VariableDec2Parameter_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { method, typeAccess, param, operation, variableDec, owner, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_24_3_solvecsp_bindingFBBBBBBBBB(
			VariableDec2Parameter _this, AbstractMethodDeclaration method, TypeAccess typeAccess, Parameter param,
			Operation operation, MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(method, typeAccess, param, operation, variableDec, owner,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, method, typeAccess, param, operation, variableDec, owner, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			VariableDec2Parameter _this, AbstractMethodDeclaration method, TypeAccess typeAccess, Parameter param,
			Operation operation, MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_VariableDec2Parameter_24_3_solvecsp_binding = pattern_VariableDec2Parameter_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, method, typeAccess, param, operation, variableDec, owner, sourceMatch, targetMatch);
		if (result_pattern_VariableDec2Parameter_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter_24_3_solvecsp_binding[0];

			Object[] result_pattern_VariableDec2Parameter_24_3_solvecsp_black = pattern_VariableDec2Parameter_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, method, typeAccess, param, operation, variableDec, owner, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter_24_5_matchcorrcontext_blackBBFBB(
			AbstractMethodDeclaration method, Operation operation, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (NamedElement2NamedElement md2o : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(method, NamedElement2NamedElement.class, "source")) {
				if (operation.equals(md2o.getTarget())) {
					_result.add(new Object[] { method, operation, md2o, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_24_5_matchcorrcontext_greenBBBF(
			NamedElement2NamedElement md2o, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "VariableDec2Parameter";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(md2o);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { md2o, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter_24_6_createcorrespondence_blackBBBBBBB(
			AbstractMethodDeclaration method, TypeAccess typeAccess, Parameter param, Operation operation,
			MSingleVariableDeclaration variableDec, AbstractTypeDeclaration owner, CCMatch ccMatch) {
		return new Object[] { method, typeAccess, param, operation, variableDec, owner, ccMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter_24_6_createcorrespondence_greenFBFBFBB(
			TypeAccess typeAccess, Parameter param, MSingleVariableDeclaration variableDec, CCMatch ccMatch) {
		org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p = UmlFactory.eINSTANCE.createVariableDec2Parameter();
		NamedElement2NamedElement n2n = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		vd2p.setTarget(param);
		vd2p.setSource(variableDec);
		ccMatch.getCreateCorr().add(vd2p);
		n2n.setTarget(param);
		n2n.setSource(variableDec);
		ccMatch.getCreateCorr().add(n2n);
		ty2p.setSource(typeAccess);
		ty2p.setTarget(param);
		ccMatch.getCreateCorr().add(ty2p);
		return new Object[] { vd2p, typeAccess, n2n, param, ty2p, variableDec, ccMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_VariableDec2Parameter_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "VariableDec2Parameter";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_VariableDec2Parameter_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_0BB(TypeAccess typeAccess,
			AbstractTypeDeclaration owner) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_355202 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!owner.equals(__DEC_typeAccess_superInterfaces_355202)) {
				return new Object[] { typeAccess, owner };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_932427 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_2B(
			TypeAccess typeAccess) {
		for (ArrayType __DEC_typeAccess_elementType_929815 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayType.class, "elementType")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_3BB(TypeAccess typeAccess,
			AbstractTypeDeclaration owner) {
		for (ClassDeclaration __DEC_typeAccess_superClass_494189 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!owner.equals(__DEC_typeAccess_superClass_494189)) {
				return new Object[] { typeAccess, owner };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_4BB(TypeAccess typeAccess,
			AbstractMethodDeclaration method) {
		for (MethodDeclaration __DEC_typeAccess_returnType_221795 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, MethodDeclaration.class, "returnType")) {
			if (!method.equals(__DEC_typeAccess_returnType_221795)) {
				return new Object[] { typeAccess, method };
			}
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAccess) {
		for (ParameterizedType __DEC_typeAccess_type_520155 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_197245 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_7B(
			TypeAccess typeAccess) {
		for (ArrayInitializer __DEC_typeAccess_expressions_144460 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ArrayInitializer.class, "expressions")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_8BB(
			AbstractTypeDeclaration owner, TypeAccess typeAccess) {
		if (owner.getSuperInterfaces().contains(typeAccess)) {
			return new Object[] { owner, typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_27_1_matchtggpattern_blackBBBB(
			AbstractMethodDeclaration method, TypeAccess typeAccess, MSingleVariableDeclaration variableDec,
			AbstractTypeDeclaration owner) {
		if (typeAccess.equals(variableDec.getType())) {
			if (owner.getBodyDeclarations().contains(method)) {
				if (method.getParameters().contains(variableDec)) {
					if (pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_0BB(typeAccess, owner) == null) {
						if (pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_1B(typeAccess) == null) {
							if (pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_2B(typeAccess) == null) {
								if (pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_3BB(typeAccess,
										owner) == null) {
									if (pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_4BB(typeAccess,
											method) == null) {
										if (pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_5B(
												typeAccess) == null) {
											if (pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_6B(
													typeAccess) == null) {
												if (pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_7B(
														typeAccess) == null) {
													if (pattern_VariableDec2Parameter_27_1_matchtggpattern_black_nac_8BB(
															owner, typeAccess) == null) {
														return new Object[] { method, typeAccess, variableDec, owner };
													}
												}
											}
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

	public static final boolean pattern_VariableDec2Parameter_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_28_1_matchtggpattern_blackBB(Parameter param,
			Operation operation) {
		if (operation.getOwnedParameters().contains(param)) {
			return new Object[] { param, operation };
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_VariableDec2Parameter_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_29_1_createresult_blackB(VariableDec2Parameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_VariableDec2Parameter_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_VariableDec2Parameter_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, AbstractMethodDeclaration method) {
		if (ruleResult.getSourceObjects().contains(method)) {
			return new Object[] { ruleResult, method };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, NamedElement2NamedElement md2o) {
		if (ruleResult.getCorrObjects().contains(md2o)) {
			return new Object[] { ruleResult, md2o };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Operation operation) {
		if (ruleResult.getTargetObjects().contains(operation)) {
			return new Object[] { ruleResult, operation };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration owner) {
		if (ruleResult.getSourceObjects().contains(owner)) {
			return new Object[] { ruleResult, owner };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_VariableDec2Parameter_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList md2oList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMd2o : md2oList.getEntryObjects()) {
				if (tmpMd2o instanceof NamedElement2NamedElement) {
					NamedElement2NamedElement md2o = (NamedElement2NamedElement) tmpMd2o;
					org.eclipse.modisco.java.NamedElement tmpMethod = md2o.getSource();
					if (tmpMethod instanceof AbstractMethodDeclaration) {
						AbstractMethodDeclaration method = (AbstractMethodDeclaration) tmpMethod;
						NamedElement tmpOperation = md2o.getTarget();
						if (tmpOperation instanceof Operation) {
							Operation operation = (Operation) tmpOperation;
							AbstractTypeDeclaration owner = method.getAbstractTypeDeclaration();
							if (owner != null) {
								if (pattern_VariableDec2Parameter_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										md2o) == null) {
									if (pattern_VariableDec2Parameter_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											method) == null) {
										if (pattern_VariableDec2Parameter_29_2_isapplicablecore_black_nac_2BB(
												ruleResult, operation) == null) {
											if (pattern_VariableDec2Parameter_29_2_isapplicablecore_black_nac_3BB(
													ruleResult, owner) == null) {
												_result.add(new Object[] { md2oList, method, md2o, operation, owner,
														ruleEntryContainer, ruleResult });
											}
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

	public static final Object[] pattern_VariableDec2Parameter_29_3_solveCSP_bindingFBBBBBBB(
			VariableDec2Parameter _this, IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			Operation operation, NamedElement2NamedElement md2o, AbstractTypeDeclaration owner,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, method, operation, md2o, owner,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, method, operation, md2o, owner, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_VariableDec2Parameter_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_VariableDec2Parameter_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			VariableDec2Parameter _this, IsApplicableMatch isApplicableMatch, AbstractMethodDeclaration method,
			Operation operation, NamedElement2NamedElement md2o, AbstractTypeDeclaration owner,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_VariableDec2Parameter_29_3_solveCSP_binding = pattern_VariableDec2Parameter_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, method, operation, md2o, owner, ruleResult);
		if (result_pattern_VariableDec2Parameter_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_VariableDec2Parameter_29_3_solveCSP_binding[0];

			Object[] result_pattern_VariableDec2Parameter_29_3_solveCSP_black = pattern_VariableDec2Parameter_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_VariableDec2Parameter_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, method, operation, md2o, owner, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_VariableDec2Parameter_29_4_checkCSP_expressionFBB(VariableDec2Parameter _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_VariableDec2Parameter_29_5_checknacs_blackBBBB(
			AbstractMethodDeclaration method, Operation operation, NamedElement2NamedElement md2o,
			AbstractTypeDeclaration owner) {
		return new Object[] { method, operation, md2o, owner };
	}

	public static final Object[] pattern_VariableDec2Parameter_29_6_perform_blackBBBBB(AbstractMethodDeclaration method,
			Operation operation, NamedElement2NamedElement md2o, AbstractTypeDeclaration owner,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { method, operation, md2o, owner, ruleResult };
	}

	public static final Object[] pattern_VariableDec2Parameter_29_6_perform_greenFBFFFFBFBB(
			AbstractMethodDeclaration method, Operation operation, ModelgeneratorRuleResult ruleResult, CSP csp) {
		org.gravity.tgg.modisco.uml.VariableDec2Parameter vd2p = UmlFactory.eINSTANCE.createVariableDec2Parameter();
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		NamedElement2NamedElement n2n = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		Parameter param = UMLFactory.eINSTANCE.createParameter();
		TypeAccess2Parameter ty2p = UmlFactory.eINSTANCE.createTypeAccess2Parameter();
		MSingleVariableDeclaration variableDec = ModiscoFactory.eINSTANCE.createMSingleVariableDeclaration();
		Object _localVariable_0 = csp.getValue("param", "name");
		Object _localVariable_1 = csp.getValue("param", "direction");
		Object _localVariable_2 = csp.getValue("variableDec", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(vd2p);
		ruleResult.getSourceObjects().add(typeAccess);
		ruleResult.getCorrObjects().add(n2n);
		n2n.setTarget(param);
		vd2p.setTarget(param);
		operation.getOwnedParameters().add(param);
		ruleResult.getTargetObjects().add(param);
		ty2p.setSource(typeAccess);
		ty2p.setTarget(param);
		ruleResult.getCorrObjects().add(ty2p);
		variableDec.setType(typeAccess);
		n2n.setSource(variableDec);
		vd2p.setSource(variableDec);
		method.getParameters().add(variableDec);
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
		return new Object[] { vd2p, method, typeAccess, n2n, param, ty2p, operation, variableDec, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_VariableDec2Parameter_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //VariableDec2ParameterImpl
