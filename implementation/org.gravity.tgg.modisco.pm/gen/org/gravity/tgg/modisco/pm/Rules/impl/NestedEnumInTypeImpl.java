/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.EnumDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Type;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.NestedEnumInType;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TEnum;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotatable;
import org.gravity.typegraph.basic.annotations.TAnnotation;

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
import org.gravity.tgg.modisco.pm.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Nested Enum In Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NestedEnumInTypeImpl extends AbstractRuleImpl implements NestedEnumInType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedEnumInTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getNestedEnumInType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {

		Object[] result1_black = NestedEnumInTypeImpl.pattern_NestedEnumInType_0_1_initialbindings_blackBBBB(this,
				match, eNestedType, eOuterType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
		}

		Object[] result2_bindingAndBlack = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, eNestedType, eOuterType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (NestedEnumInTypeImpl.pattern_NestedEnumInType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = NestedEnumInTypeImpl
					.pattern_NestedEnumInType_0_4_collectelementstobetranslated_blackBBB(match, eNestedType,
							eOuterType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
			}
			NestedEnumInTypeImpl.pattern_NestedEnumInType_0_4_collectelementstobetranslated_greenBBBFF(match,
					eNestedType, eOuterType);
			//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result4_green[4];

			Object[] result5_black = NestedEnumInTypeImpl
					.pattern_NestedEnumInType_0_5_collectcontextelements_blackBBB(match, eNestedType, eOuterType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
			}
			NestedEnumInTypeImpl.pattern_NestedEnumInType_0_5_collectcontextelements_greenBB(match, eOuterType);

			// 
			NestedEnumInTypeImpl.pattern_NestedEnumInType_0_6_registerobjectstomatch_expressionBBBB(this, match,
					eNestedType, eOuterType);
			return NestedEnumInTypeImpl.pattern_NestedEnumInType_0_7_expressionF();
		} else {
			return NestedEnumInTypeImpl.pattern_NestedEnumInType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		EnumDeclaration eNestedType = (EnumDeclaration) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		TAbstractType tOuterType = (TAbstractType) result1_bindingAndBlack[2];
		TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result1_bindingAndBlack[3];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result1_bindingAndBlack[4];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = NestedEnumInTypeImpl.pattern_NestedEnumInType_1_1_performtransformation_greenBFFBFFBBB(
				eNestedType, typeGraph, tOuterType, tOuterPackage, csp);
		ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result1_green[1];
		TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[2];
		TEnum tEnum = (TEnum) result1_green[4];
		TClass tNestedType = (TClass) result1_green[5];

		Object[] result2_black = NestedEnumInTypeImpl.pattern_NestedEnumInType_1_2_collecttranslatedelements_blackBBBBB(
				eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tEnum, tNestedType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eNestedType] = " + eNestedType
					+ ", " + "[astNodeToAnnotatable] = " + astNodeToAnnotatable + ", " + "[eNestedTypeToTNestedType] = "
					+ eNestedTypeToTNestedType + ", " + "[tEnum] = " + tEnum + ", " + "[tNestedType] = " + tNestedType
					+ ".");
		}
		Object[] result2_green = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_1_2_collecttranslatedelements_greenFBBBBB(eNestedType, astNodeToAnnotatable,
						eNestedTypeToTNestedType, tEnum, tNestedType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = NestedEnumInTypeImpl.pattern_NestedEnumInType_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tEnum, tNestedType,
				tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eNestedType] = " + eNestedType + ", " + "[astNodeToAnnotatable] = "
					+ astNodeToAnnotatable + ", " + "[eNestedTypeToTNestedType] = " + eNestedTypeToTNestedType + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tEnum] = " + tEnum + ", " + "[tNestedType] = "
					+ tNestedType + ", " + "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
					+ eOuterTypeToTOuterInterface + ", " + "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = "
					+ tOuterPackage + ".");
		}
		NestedEnumInTypeImpl.pattern_NestedEnumInType_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tEnum, tNestedType,
				tOuterType, eOuterType, tOuterPackage);
		//nothing EMoflonEdge astNodeToAnnotatable__eNestedType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tOuterPackage__tNestedType____classes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tNestedType__tEnum____tAnnotation = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tEnum__tNestedType____tAnnotated = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge astNodeToAnnotatable__tNestedType____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tOuterPackage__tNestedType____allTypes = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tNestedType__tOuterPackage____package = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge typeGraph__tNestedType____allTypes = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tNestedType__typeGraph____model = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[25];

		// 
		// 
		NestedEnumInTypeImpl.pattern_NestedEnumInType_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tEnum, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		return NestedEnumInTypeImpl.pattern_NestedEnumInType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = NestedEnumInTypeImpl.pattern_NestedEnumInType_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		EnumDeclaration eNestedType = (EnumDeclaration) result2_binding[0];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : NestedEnumInTypeImpl
				.pattern_NestedEnumInType_2_2_corematch_blackBFFBB(eNestedType, eOuterType, match)) {
			TAbstractType tOuterType = (TAbstractType) result2_black[1];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[2];
			// ForEach 
			for (Object[] result3_black : NestedEnumInTypeImpl.pattern_NestedEnumInType_2_3_findcontext_blackBFBBBF(
					eNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType)) {
				TypeGraph typeGraph = (TypeGraph) result3_black[1];
				TPackage tOuterPackage = (TPackage) result3_black[5];
				Object[] result3_green = NestedEnumInTypeImpl
						.pattern_NestedEnumInType_2_3_findcontext_greenBBBBBBFFFFFFFFFF(eNestedType, typeGraph,
								tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge tOuterPackage__typeGraph____model = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tOuterPackage__tOuterType____allTypes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge typeGraph__tOuterType____allTypes = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tOuterType__typeGraph____model = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = NestedEnumInTypeImpl
						.pattern_NestedEnumInType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
								tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eNestedType] = " + eNestedType
							+ ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterType] = " + tOuterType + ", "
							+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
							+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (NestedEnumInTypeImpl.pattern_NestedEnumInType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = NestedEnumInTypeImpl
							.pattern_NestedEnumInType_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					NestedEnumInTypeImpl.pattern_NestedEnumInType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return NestedEnumInTypeImpl.pattern_NestedEnumInType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, EnumDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {
		match.registerObject("eNestedType", eNestedType);
		match.registerObject("eOuterType", eOuterType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, EnumDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, EnumDeclaration eNestedType,
			TypeGraph typeGraph, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", true, csp);
		var_eNestedType_proxy.setValue(eNestedType.isProxy());
		var_eNestedType_proxy.setType("Boolean");
		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType.tName", true, csp);
		var_tOuterType_tName.setValue(tOuterType.getTName());
		var_tOuterType_tName.setType("String");
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", true, csp);
		var_eNestedType_name.setValue(eNestedType.getName());
		var_eNestedType_name.setType("String");

		// Create unbound variables
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", csp);
		var_tNestedType_tLib.setType("Boolean");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_proxy, var_tNestedType_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eNestedType", eNestedType);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterType", tOuterType);
		isApplicableMatch.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		isApplicableMatch.registerObject("eOuterType", eOuterType);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tEnum, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		ruleresult.registerObject("eNestedType", eNestedType);
		ruleresult.registerObject("astNodeToAnnotatable", astNodeToAnnotatable);
		ruleresult.registerObject("eNestedTypeToTNestedType", eNestedTypeToTNestedType);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("tOuterType", tOuterType);
		ruleresult.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		ruleresult.registerObject("eOuterType", eOuterType);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eNestedType").eClass())
				.equals("java.EnumDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {

		Object[] result1_black = NestedEnumInTypeImpl.pattern_NestedEnumInType_10_1_initialbindings_blackBBBBBBB(this,
				match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", " + "[tEnum] = " + tEnum + ", "
					+ "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
					+ "[tOuterPackage] = " + tOuterPackage + ".");
		}

		Object[] result2_bindingAndBlack = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, typeGraph, tEnum,
						tNestedType, tOuterType, tOuterPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", " + "[tEnum] = " + tEnum + ", "
					+ "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
					+ "[tOuterPackage] = " + tOuterPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (NestedEnumInTypeImpl.pattern_NestedEnumInType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = NestedEnumInTypeImpl
					.pattern_NestedEnumInType_10_4_collectelementstobetranslated_blackBBBBBB(match, typeGraph, tEnum,
							tNestedType, tOuterType, tOuterPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tEnum] = " + tEnum + ", " + "[tNestedType] = "
						+ tNestedType + ", " + "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = "
						+ tOuterPackage + ".");
			}
			NestedEnumInTypeImpl.pattern_NestedEnumInType_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(
					match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage);
			//nothing EMoflonEdge tOuterPackage__tNestedType____classes = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tNestedType__tEnum____tAnnotation = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tEnum__tNestedType____tAnnotated = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tOuterPackage__tNestedType____allTypes = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tNestedType__tOuterPackage____package = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge typeGraph__tNestedType____allTypes = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tNestedType__typeGraph____model = (EMoflonEdge) result4_green[15];

			Object[] result5_black = NestedEnumInTypeImpl
					.pattern_NestedEnumInType_10_5_collectcontextelements_blackBBBBBB(match, typeGraph, tEnum,
							tNestedType, tOuterType, tOuterPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tEnum] = " + tEnum + ", " + "[tNestedType] = "
						+ tNestedType + ", " + "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = "
						+ tOuterPackage + ".");
			}
			NestedEnumInTypeImpl.pattern_NestedEnumInType_10_5_collectcontextelements_greenBBBBFFFFF(match, typeGraph,
					tOuterType, tOuterPackage);
			//nothing EMoflonEdge tOuterPackage__typeGraph____model = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tOuterPackage__tOuterType____allTypes = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge typeGraph__tOuterType____allTypes = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge tOuterType__typeGraph____model = (EMoflonEdge) result5_green[8];

			// 
			NestedEnumInTypeImpl.pattern_NestedEnumInType_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage);
			return NestedEnumInTypeImpl.pattern_NestedEnumInType_10_7_expressionF();
		} else {
			return NestedEnumInTypeImpl.pattern_NestedEnumInType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[0];
		TEnum tEnum = (TEnum) result1_bindingAndBlack[1];
		TClass tNestedType = (TClass) result1_bindingAndBlack[2];
		TAbstractType tOuterType = (TAbstractType) result1_bindingAndBlack[3];
		TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result1_bindingAndBlack[4];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result1_bindingAndBlack[5];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_11_1_performtransformation_greenFFFBBB(tNestedType, eOuterType, csp);
		EnumDeclaration eNestedType = (EnumDeclaration) result1_green[0];
		ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result1_green[1];
		TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[2];

		Object[] result2_black = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_11_2_collecttranslatedelements_blackBBBBB(eNestedType, astNodeToAnnotatable,
						eNestedTypeToTNestedType, tEnum, tNestedType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eNestedType] = " + eNestedType
					+ ", " + "[astNodeToAnnotatable] = " + astNodeToAnnotatable + ", " + "[eNestedTypeToTNestedType] = "
					+ eNestedTypeToTNestedType + ", " + "[tEnum] = " + tEnum + ", " + "[tNestedType] = " + tNestedType
					+ ".");
		}
		Object[] result2_green = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_11_2_collecttranslatedelements_greenFBBBBB(eNestedType, astNodeToAnnotatable,
						eNestedTypeToTNestedType, tEnum, tNestedType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, eNestedType,
						astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tEnum, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eNestedType] = " + eNestedType + ", " + "[astNodeToAnnotatable] = "
					+ astNodeToAnnotatable + ", " + "[eNestedTypeToTNestedType] = " + eNestedTypeToTNestedType + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[tEnum] = " + tEnum + ", " + "[tNestedType] = "
					+ tNestedType + ", " + "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
					+ eOuterTypeToTOuterInterface + ", " + "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = "
					+ tOuterPackage + ".");
		}
		NestedEnumInTypeImpl.pattern_NestedEnumInType_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
				ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tEnum, tNestedType,
				tOuterType, eOuterType, tOuterPackage);
		//nothing EMoflonEdge astNodeToAnnotatable__eNestedType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tOuterPackage__tNestedType____classes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tNestedType__tEnum____tAnnotation = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tEnum__tNestedType____tAnnotated = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge astNodeToAnnotatable__tNestedType____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tOuterPackage__tNestedType____allTypes = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tNestedType__tOuterPackage____package = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge typeGraph__tNestedType____allTypes = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tNestedType__typeGraph____model = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[25];

		// 
		// 
		NestedEnumInTypeImpl.pattern_NestedEnumInType_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tEnum, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		return NestedEnumInTypeImpl.pattern_NestedEnumInType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = NestedEnumInTypeImpl.pattern_NestedEnumInType_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result2_binding[0];
		TEnum tEnum = (TEnum) result2_binding[1];
		TClass tNestedType = (TClass) result2_binding[2];
		TAbstractType tOuterType = (TAbstractType) result2_binding[3];
		TPackage tOuterPackage = (TPackage) result2_binding[4];
		for (Object[] result2_black : NestedEnumInTypeImpl.pattern_NestedEnumInType_12_2_corematch_blackBBBBFFBB(
				typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage, match)) {
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[5];
			// ForEach 
			for (Object[] result3_black : NestedEnumInTypeImpl.pattern_NestedEnumInType_12_3_findcontext_blackBBBBBBB(
					typeGraph, tEnum, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
					tOuterPackage)) {
				Object[] result3_green = NestedEnumInTypeImpl
						.pattern_NestedEnumInType_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFFFFF(typeGraph, tEnum,
								tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tOuterPackage__typeGraph____model = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tOuterPackage__tNestedType____classes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tNestedType__tEnum____tAnnotation = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tEnum__tNestedType____tAnnotated = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tOuterPackage__tOuterType____allTypes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge typeGraph__tOuterType____allTypes = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tOuterType__typeGraph____model = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tOuterPackage__tNestedType____allTypes = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tNestedType__tOuterPackage____package = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge typeGraph__tNestedType____allTypes = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge tNestedType__typeGraph____model = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = (EMoflonEdge) result3_green[24];

				Object[] result4_bindingAndBlack = NestedEnumInTypeImpl
						.pattern_NestedEnumInType_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								typeGraph, tEnum, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
								tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[tEnum] = " + tEnum + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = "
							+ tOuterType + ", " + "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface
							+ ", " + "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (NestedEnumInTypeImpl.pattern_NestedEnumInType_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = NestedEnumInTypeImpl
							.pattern_NestedEnumInType_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					NestedEnumInTypeImpl.pattern_NestedEnumInType_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return NestedEnumInTypeImpl.pattern_NestedEnumInType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tEnum", tEnum);
		match.registerObject("tNestedType", tNestedType);
		match.registerObject("tOuterType", tOuterType);
		match.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph typeGraph, TEnum tEnum,
			TClass tNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", true, csp);
		var_tNestedType_tLib.setValue(tNestedType.isTLib());
		var_tNestedType_tLib.setType("Boolean");
		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType.tName", true, csp);
		var_tOuterType_tName.setValue(tOuterType.getTName());
		var_tOuterType_tName.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");

		// Create unbound variables
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", csp);
		var_eNestedType_proxy.setType("Boolean");
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", csp);
		var_eNestedType_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_proxy, var_tNestedType_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("tNestedType", tNestedType);
		isApplicableMatch.registerObject("tOuterType", tOuterType);
		isApplicableMatch.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		isApplicableMatch.registerObject("eOuterType", eOuterType);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tEnum, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		ruleresult.registerObject("eNestedType", eNestedType);
		ruleresult.registerObject("astNodeToAnnotatable", astNodeToAnnotatable);
		ruleresult.registerObject("eNestedTypeToTNestedType", eNestedTypeToTNestedType);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("tOuterType", tOuterType);
		ruleresult.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		ruleresult.registerObject("eOuterType", eOuterType);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tEnum").eClass()).equals("basic.TEnum.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tNestedType").eClass())
						.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_929(EMoflonEdge _edge_classes) {

		Object[] result1_bindingAndBlack = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = NestedEnumInTypeImpl.pattern_NestedEnumInType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : NestedEnumInTypeImpl
				.pattern_NestedEnumInType_20_2_testcorematchandDECs_blackFFFFFB(_edge_classes)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[0];
			TEnum tEnum = (TEnum) result2_black[1];
			TClass tNestedType = (TClass) result2_black[2];
			TAbstractType tOuterType = (TAbstractType) result2_black[3];
			TPackage tOuterPackage = (TPackage) result2_black[4];
			Object[] result2_green = NestedEnumInTypeImpl
					.pattern_NestedEnumInType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (NestedEnumInTypeImpl
					.pattern_NestedEnumInType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(this,
							match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage)) {
				// 
				if (NestedEnumInTypeImpl
						.pattern_NestedEnumInType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = NestedEnumInTypeImpl
							.pattern_NestedEnumInType_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					NestedEnumInTypeImpl.pattern_NestedEnumInType_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return NestedEnumInTypeImpl.pattern_NestedEnumInType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1021(EMoflonEdge _edge_abstractTypeDeclaration) {

		Object[] result1_bindingAndBlack = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = NestedEnumInTypeImpl.pattern_NestedEnumInType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : NestedEnumInTypeImpl
				.pattern_NestedEnumInType_21_2_testcorematchandDECs_blackFFB(_edge_abstractTypeDeclaration)) {
			EnumDeclaration eNestedType = (EnumDeclaration) result2_black[0];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = NestedEnumInTypeImpl
					.pattern_NestedEnumInType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (NestedEnumInTypeImpl
					.pattern_NestedEnumInType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, eNestedType, eOuterType)) {
				// 
				if (NestedEnumInTypeImpl
						.pattern_NestedEnumInType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = NestedEnumInTypeImpl
							.pattern_NestedEnumInType_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					NestedEnumInTypeImpl.pattern_NestedEnumInType_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return NestedEnumInTypeImpl.pattern_NestedEnumInType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("NestedEnumInType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tLib.setValue(__helper.getValue("tNestedType", "tLib"));
		var_tNestedType_tLib.setType("boolean");

		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_proxy.setValue(__helper.getValue("eNestedType", "proxy"));
		var_eNestedType_proxy.setType("boolean");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_name.setValue(__helper.getValue("eNestedType", "name"));
		var_eNestedType_name.setType("String");

		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType", true, csp);
		var_tOuterType_tName.setValue(__helper.getValue("tOuterType", "tName"));
		var_tOuterType_tName.setType("String");

		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tName.setValue(__helper.getValue("tNestedType", "tName"));
		var_tNestedType_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Concat concat1 = new Concat();
		csp.getConstraints().add(concat1);

		eq0.setRuleName("NestedEnumInType");
		eq0.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		concat1.setRuleName("NestedEnumInType");
		concat1.solve(var_literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tNestedType_tLib.setBound(false);
			var_tNestedType_tName.setBound(false);
			eq0.solve(var_eNestedType_proxy, var_tNestedType_tLib);
			concat1.solve(var_literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tNestedType", "tLib", var_tNestedType_tLib.getValue());
				__helper.setValue("tNestedType", "tName", var_tNestedType_tName.getValue());
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
		ruleResult.setRule("NestedEnumInType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tLib.setValue(__helper.getValue("tNestedType", "tLib"));
		var_tNestedType_tLib.setType("boolean");

		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_proxy.setValue(__helper.getValue("eNestedType", "proxy"));
		var_eNestedType_proxy.setType("boolean");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_name.setValue(__helper.getValue("eNestedType", "name"));
		var_eNestedType_name.setType("String");

		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType", true, csp);
		var_tOuterType_tName.setValue(__helper.getValue("tOuterType", "tName"));
		var_tOuterType_tName.setType("String");

		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tName.setValue(__helper.getValue("tNestedType", "tName"));
		var_tNestedType_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Concat concat1 = new Concat();
		csp.getConstraints().add(concat1);

		eq0.setRuleName("NestedEnumInType");
		eq0.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		concat1.setRuleName("NestedEnumInType");
		concat1.solve(var_literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_eNestedType_proxy.setBound(false);
			var_eNestedType_name.setBound(false);
			eq0.solve(var_eNestedType_proxy, var_tNestedType_tLib);
			concat1.solve(var_literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("eNestedType", "proxy", var_eNestedType_proxy.getValue());
				__helper.setValue("eNestedType", "name", var_eNestedType_name.getValue());
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

		Object[] result1_black = NestedEnumInTypeImpl.pattern_NestedEnumInType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = NestedEnumInTypeImpl.pattern_NestedEnumInType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		EnumDeclaration eNestedType = (EnumDeclaration) result2_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[1];
		TEnum tEnum = (TEnum) result2_bindingAndBlack[2];
		TClass tNestedType = (TClass) result2_bindingAndBlack[3];
		TAbstractType tOuterType = (TAbstractType) result2_bindingAndBlack[4];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_bindingAndBlack[5];
		TPackage tOuterPackage = (TPackage) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = NestedEnumInTypeImpl
				.pattern_NestedEnumInType_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, eNestedType, typeGraph, tEnum,
						tNestedType, tOuterType, eOuterType, tOuterPackage, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[eNestedType] = " + eNestedType + ", " + "[typeGraph] = " + typeGraph + ", " + "[tEnum] = "
					+ tEnum + ", " + "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
					+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (NestedEnumInTypeImpl.pattern_NestedEnumInType_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : NestedEnumInTypeImpl
					.pattern_NestedEnumInType_24_5_matchcorrcontext_blackBFBBB(tOuterType, eOuterType, sourceMatch,
							targetMatch)) {
				TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result5_black[1];
				Object[] result5_green = NestedEnumInTypeImpl.pattern_NestedEnumInType_24_5_matchcorrcontext_greenBBBF(
						eOuterTypeToTOuterInterface, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = NestedEnumInTypeImpl
						.pattern_NestedEnumInType_24_6_createcorrespondence_blackBBBBBBBB(eNestedType, typeGraph, tEnum,
								tNestedType, tOuterType, eOuterType, tOuterPackage, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eNestedType] = "
							+ eNestedType + ", " + "[typeGraph] = " + typeGraph + ", " + "[tEnum] = " + tEnum + ", "
							+ "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
							+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				NestedEnumInTypeImpl.pattern_NestedEnumInType_24_6_createcorrespondence_greenBFFBB(eNestedType,
						tNestedType, ccMatch);
				//nothing ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result6_green[1];
				//nothing TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[2];

				Object[] result7_black = NestedEnumInTypeImpl
						.pattern_NestedEnumInType_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				NestedEnumInTypeImpl.pattern_NestedEnumInType_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return NestedEnumInTypeImpl.pattern_NestedEnumInType_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(EnumDeclaration eNestedType, TypeGraph typeGraph, TEnum tEnum,
			TClass tNestedType, TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", true, csp);
		var_eNestedType_proxy.setValue(eNestedType.isProxy());
		var_eNestedType_proxy.setType("Boolean");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", true, csp);
		var_tNestedType_tLib.setValue(tNestedType.isTLib());
		var_tNestedType_tLib.setType("Boolean");
		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType.tName", true, csp);
		var_tOuterType_tName.setValue(tOuterType.getTName());
		var_tOuterType_tName.setType("String");
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", true, csp);
		var_eNestedType_name.setValue(eNestedType.getName());
		var_eNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_proxy, var_tNestedType_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);
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
	public boolean checkDEC_FWD(EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {// 
		Object[] result1_black = NestedEnumInTypeImpl.pattern_NestedEnumInType_27_1_matchtggpattern_blackBB(eNestedType,
				eOuterType);
		if (result1_black != null) {
			return NestedEnumInTypeImpl.pattern_NestedEnumInType_27_2_expressionF();
		} else {
			return NestedEnumInTypeImpl.pattern_NestedEnumInType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {// 
		Object[] result1_black = NestedEnumInTypeImpl.pattern_NestedEnumInType_28_1_matchtggpattern_blackBBBBB(
				typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage);
		if (result1_black != null) {
			return NestedEnumInTypeImpl.pattern_NestedEnumInType_28_2_expressionF();
		} else {
			return NestedEnumInTypeImpl.pattern_NestedEnumInType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eOuterTypeToTOuterInterfaceParameter) {

		Object[] result1_black = NestedEnumInTypeImpl.pattern_NestedEnumInType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = NestedEnumInTypeImpl.pattern_NestedEnumInType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : NestedEnumInTypeImpl
				.pattern_NestedEnumInType_29_2_isapplicablecore_blackFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eOuterTypeToTOuterInterfaceList = (RuleEntryList) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			TAbstractType tOuterType = (TAbstractType) result2_black[2];
			TPackage tOuterPackage = (TPackage) result2_black[3];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[5];

			Object[] result3_bindingAndBlack = NestedEnumInTypeImpl
					.pattern_NestedEnumInType_29_3_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, typeGraph,
							tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeGraph] = " + typeGraph + ", "
						+ "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
						+ eOuterTypeToTOuterInterface + ", " + "[eOuterType] = " + eOuterType + ", "
						+ "[tOuterPackage] = " + tOuterPackage + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (NestedEnumInTypeImpl.pattern_NestedEnumInType_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = NestedEnumInTypeImpl.pattern_NestedEnumInType_29_5_checknacs_blackBBBBB(
						typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				if (result5_black != null) {

					Object[] result6_black = NestedEnumInTypeImpl.pattern_NestedEnumInType_29_6_perform_blackBBBBBB(
							typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeGraph] = "
								+ typeGraph + ", " + "[tOuterType] = " + tOuterType + ", "
								+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
								+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					NestedEnumInTypeImpl.pattern_NestedEnumInType_29_6_perform_greenFFFBFFBBBBB(typeGraph, tOuterType,
							eOuterType, tOuterPackage, ruleResult, csp);
					//nothing EnumDeclaration eNestedType = (EnumDeclaration) result6_green[0];
					//nothing ASTNodeToTAnnotatable astNodeToAnnotatable = (ASTNodeToTAnnotatable) result6_green[1];
					//nothing TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[2];
					//nothing TEnum tEnum = (TEnum) result6_green[4];
					//nothing TClass tNestedType = (TClass) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return NestedEnumInTypeImpl.pattern_NestedEnumInType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tOuterType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tOuterType.tName", true, csp);
		var_tOuterType_tName.setValue(tOuterType.getTName());
		var_tOuterType_tName.setType("String");

		// Create unbound variables
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", csp);
		var_eNestedType_proxy.setType("Boolean");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", csp);
		var_tNestedType_tLib.setType("Boolean");
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", csp);
		var_eNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_proxy, var_tNestedType_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tOuterType_tName, var_eNestedType_name, var_tNestedType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("tOuterType", tOuterType);
		isApplicableMatch.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		isApplicableMatch.registerObject("eOuterType", eOuterType);
		isApplicableMatch.registerObject("tOuterPackage", tOuterPackage);
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
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPROPRIATE_FWD__MATCH_ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
				return isAppropriate_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
						(AbstractTypeDeclaration) arguments.get(2));
			case RulesPackage.NESTED_ENUM_IN_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
						(AbstractTypeDeclaration) arguments.get(2));
				return null;
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
						(AbstractTypeDeclaration) arguments.get(2));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ENUMDECLARATION_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(EnumDeclaration) arguments.get(1), (TypeGraph) arguments.get(2),
						(TAbstractType) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
						(AbstractTypeDeclaration) arguments.get(5), (TPackage) arguments.get(6));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
				return null;
			case RulesPackage.NESTED_ENUM_IN_TYPE___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TENUM_TCLASS_TABSTRACTTYPE_TPACKAGE:
				return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
						(TEnum) arguments.get(2), (TClass) arguments.get(3), (TAbstractType) arguments.get(4),
						(TPackage) arguments.get(5));
			case RulesPackage.NESTED_ENUM_IN_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TENUM_TCLASS_TABSTRACTTYPE_TPACKAGE:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
						(TEnum) arguments.get(2), (TClass) arguments.get(3), (TAbstractType) arguments.get(4),
						(TPackage) arguments.get(5));
				return null;
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TENUM_TCLASS_TABSTRACTTYPE_TPACKAGE:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
						(TEnum) arguments.get(2), (TClass) arguments.get(3), (TAbstractType) arguments.get(4),
						(TPackage) arguments.get(5));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TENUM_TCLASS_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
						(TEnum) arguments.get(2), (TClass) arguments.get(3), (TAbstractType) arguments.get(4),
						(TypeToTAbstractType) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
						(TPackage) arguments.get(7));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
				return null;
			case RulesPackage.NESTED_ENUM_IN_TYPE___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_929__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_929((EMoflonEdge) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1021__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1021((EMoflonEdge) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__ENUMDECLARATION_TYPEGRAPH_TENUM_TCLASS_TABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE_MATCH_MATCH:
				return isApplicable_solveCsp_CC((EnumDeclaration) arguments.get(0), (TypeGraph) arguments.get(1),
						(TEnum) arguments.get(2), (TClass) arguments.get(3), (TAbstractType) arguments.get(4),
						(AbstractTypeDeclaration) arguments.get(5), (TPackage) arguments.get(6),
						(Match) arguments.get(7), (Match) arguments.get(8));
			case RulesPackage.NESTED_ENUM_IN_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.NESTED_ENUM_IN_TYPE___CHECK_DEC_FWD__ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
				return checkDEC_FWD((EnumDeclaration) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
			case RulesPackage.NESTED_ENUM_IN_TYPE___CHECK_DEC_BWD__TYPEGRAPH_TENUM_TCLASS_TABSTRACTTYPE_TPACKAGE:
				return checkDEC_BWD((TypeGraph) arguments.get(0), (TEnum) arguments.get(1), (TClass) arguments.get(2),
						(TAbstractType) arguments.get(3), (TPackage) arguments.get(4));
			case RulesPackage.NESTED_ENUM_IN_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
				return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
			case RulesPackage.NESTED_ENUM_IN_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
						(TAbstractType) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
						(AbstractTypeDeclaration) arguments.get(4), (TPackage) arguments.get(5),
						(ModelgeneratorRuleResult) arguments.get(6));
			case RulesPackage.NESTED_ENUM_IN_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_NestedEnumInType_0_1_initialbindings_blackBBBB(NestedEnumInType _this,
			Match match, EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { _this, match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_0_2_SolveCSP_bindingFBBBB(NestedEnumInType _this, Match match,
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eNestedType, eOuterType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnumInType_0_2_SolveCSP_bindingAndBlackFBBBB(NestedEnumInType _this,
			Match match, EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		Object[] result_pattern_NestedEnumInType_0_2_SolveCSP_binding = pattern_NestedEnumInType_0_2_SolveCSP_bindingFBBBB(
				_this, match, eNestedType, eOuterType);
		if (result_pattern_NestedEnumInType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnumInType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_NestedEnumInType_0_2_SolveCSP_black = pattern_NestedEnumInType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_NestedEnumInType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eNestedType, eOuterType };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnumInType_0_3_CheckCSP_expressionFBB(NestedEnumInType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_0_4_collectelementstobetranslated_blackBBB(Match match,
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eNestedType);
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		match.getToBeTranslatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		match.getToBeTranslatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		return new Object[] { match, eNestedType, eOuterType, eNestedType__eOuterType____abstractTypeDeclaration,
				eOuterType__eNestedType____bodyDeclarations };
	}

	public static final Object[] pattern_NestedEnumInType_0_5_collectcontextelements_blackBBB(Match match,
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_0_5_collectcontextelements_greenBB(Match match,
			AbstractTypeDeclaration eOuterType) {
		match.getContextNodes().add(eOuterType);
		return new Object[] { match, eOuterType };
	}

	public static final void pattern_NestedEnumInType_0_6_registerobjectstomatch_expressionBBBB(NestedEnumInType _this,
			Match match, EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		_this.registerObjectsToMatch_FWD(match, eNestedType, eOuterType);

	}

	public static final boolean pattern_NestedEnumInType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedEnumInType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eNestedType");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("tOuterType");
		EObject _localVariable_3 = isApplicableMatch.getObject("eOuterTypeToTOuterInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eOuterType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpENestedType = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTOuterType = _localVariable_2;
		EObject tmpEOuterTypeToTOuterInterface = _localVariable_3;
		EObject tmpEOuterType = _localVariable_4;
		EObject tmpTOuterPackage = _localVariable_5;
		if (tmpENestedType instanceof EnumDeclaration) {
			EnumDeclaration eNestedType = (EnumDeclaration) tmpENestedType;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTOuterType instanceof TAbstractType) {
					TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
					if (tmpEOuterTypeToTOuterInterface instanceof TypeToTAbstractType) {
						TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) tmpEOuterTypeToTOuterInterface;
						if (tmpEOuterType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
							if (tmpTOuterPackage instanceof TPackage) {
								TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
								return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface,
										eOuterType, tOuterPackage, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_1_1_performtransformation_blackBBBBBBFBB(
			EnumDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			NestedEnumInType _this, IsApplicableMatch isApplicableMatch) {
		if (!eNestedType.equals(eOuterType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
							tOuterPackage, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			NestedEnumInType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_NestedEnumInType_1_1_performtransformation_binding = pattern_NestedEnumInType_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_NestedEnumInType_1_1_performtransformation_binding != null) {
			EnumDeclaration eNestedType = (EnumDeclaration) result_pattern_NestedEnumInType_1_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_NestedEnumInType_1_1_performtransformation_binding[1];
			TAbstractType tOuterType = (TAbstractType) result_pattern_NestedEnumInType_1_1_performtransformation_binding[2];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result_pattern_NestedEnumInType_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_NestedEnumInType_1_1_performtransformation_binding[4];
			TPackage tOuterPackage = (TPackage) result_pattern_NestedEnumInType_1_1_performtransformation_binding[5];

			Object[] result_pattern_NestedEnumInType_1_1_performtransformation_black = pattern_NestedEnumInType_1_1_performtransformation_blackBBBBBBFBB(
					eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, _this,
					isApplicableMatch);
			if (result_pattern_NestedEnumInType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_NestedEnumInType_1_1_performtransformation_black[6];

				return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
						tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_1_1_performtransformation_greenBFFBFFBBB(
			EnumDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType, TPackage tOuterPackage,
			CSP csp) {
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TEnum tEnum = BasicFactory.eINSTANCE.createTEnum();
		TClass tNestedType = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("tNestedType", "tLib");
		Object _localVariable_1 = csp.getValue("tNestedType", "tName");
		astNodeToAnnotatable.setSource(eNestedType);
		eNestedTypeToTNestedType.setSource(eNestedType);
		tOuterPackage.getClasses().add(tNestedType);
		tNestedType.getTAnnotation().add(tEnum);
		astNodeToAnnotatable.setTarget(tNestedType);
		tOuterType.getInnerTypes().add(tNestedType);
		typeGraph.getClasses().add(tNestedType);
		tOuterPackage.getAllTypes().add(tNestedType);
		typeGraph.getAllTypes().add(tNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		boolean tNestedType_tLib_prime = (boolean) _localVariable_0;
		String tNestedType_tName_prime = (String) _localVariable_1;
		tNestedType.setTLib(Boolean.valueOf(tNestedType_tLib_prime));
		tNestedType.setTName(tNestedType_tName_prime);
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tEnum,
				tNestedType, tOuterType, tOuterPackage, csp };
	}

	public static final Object[] pattern_NestedEnumInType_1_2_collecttranslatedelements_blackBBBBB(
			EnumDeclaration eNestedType, ASTNodeToTAnnotatable astNodeToAnnotatable,
			TypeToTAbstractType eNestedTypeToTNestedType, TEnum tEnum, TClass tNestedType) {
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tEnum, tNestedType };
	}

	public static final Object[] pattern_NestedEnumInType_1_2_collecttranslatedelements_greenFBBBBB(
			EnumDeclaration eNestedType, ASTNodeToTAnnotatable astNodeToAnnotatable,
			TypeToTAbstractType eNestedTypeToTNestedType, TEnum tEnum, TClass tNestedType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eNestedType);
		ruleresult.getCreatedLinkElements().add(astNodeToAnnotatable);
		ruleresult.getCreatedLinkElements().add(eNestedTypeToTNestedType);
		ruleresult.getCreatedElements().add(tEnum);
		ruleresult.getCreatedElements().add(tNestedType);
		return new Object[] { ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tEnum,
				tNestedType };
	}

	public static final Object[] pattern_NestedEnumInType_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tEnum, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		if (!eNestedType.equals(eNestedTypeToTNestedType)) {
			if (!eNestedType.equals(typeGraph)) {
				if (!eNestedType.equals(tEnum)) {
					if (!eNestedType.equals(tNestedType)) {
						if (!eNestedType.equals(tOuterType)) {
							if (!eNestedType.equals(eOuterTypeToTOuterInterface)) {
								if (!eNestedType.equals(eOuterType)) {
									if (!eNestedType.equals(tOuterPackage)) {
										if (!astNodeToAnnotatable.equals(eNestedType)) {
											if (!astNodeToAnnotatable.equals(eNestedTypeToTNestedType)) {
												if (!astNodeToAnnotatable.equals(typeGraph)) {
													if (!astNodeToAnnotatable.equals(tEnum)) {
														if (!astNodeToAnnotatable.equals(tNestedType)) {
															if (!astNodeToAnnotatable.equals(tOuterType)) {
																if (!astNodeToAnnotatable
																		.equals(eOuterTypeToTOuterInterface)) {
																	if (!astNodeToAnnotatable.equals(eOuterType)) {
																		if (!astNodeToAnnotatable
																				.equals(tOuterPackage)) {
																			if (!eNestedTypeToTNestedType
																					.equals(typeGraph)) {
																				if (!eNestedTypeToTNestedType
																						.equals(tEnum)) {
																					if (!eNestedTypeToTNestedType
																							.equals(tNestedType)) {
																						if (!eNestedTypeToTNestedType
																								.equals(tOuterType)) {
																							if (!eNestedTypeToTNestedType
																									.equals(eOuterTypeToTOuterInterface)) {
																								if (!eNestedTypeToTNestedType
																										.equals(eOuterType)) {
																									if (!eNestedTypeToTNestedType
																											.equals(tOuterPackage)) {
																										if (!tEnum
																												.equals(typeGraph)) {
																											if (!tEnum
																													.equals(tNestedType)) {
																												if (!tEnum
																														.equals(tOuterType)) {
																													if (!tEnum
																															.equals(tOuterPackage)) {
																														if (!tNestedType
																																.equals(typeGraph)) {
																															if (!tNestedType
																																	.equals(tOuterType)) {
																																if (!tNestedType
																																		.equals(tOuterPackage)) {
																																	if (!tOuterType
																																			.equals(typeGraph)) {
																																		if (!eOuterTypeToTOuterInterface
																																				.equals(typeGraph)) {
																																			if (!eOuterTypeToTOuterInterface
																																					.equals(tEnum)) {
																																				if (!eOuterTypeToTOuterInterface
																																						.equals(tNestedType)) {
																																					if (!eOuterTypeToTOuterInterface
																																							.equals(tOuterType)) {
																																						if (!eOuterTypeToTOuterInterface
																																								.equals(tOuterPackage)) {
																																							if (!eOuterType
																																									.equals(typeGraph)) {
																																								if (!eOuterType
																																										.equals(tEnum)) {
																																									if (!eOuterType
																																											.equals(tNestedType)) {
																																										if (!eOuterType
																																												.equals(tOuterType)) {
																																											if (!eOuterType
																																													.equals(eOuterTypeToTOuterInterface)) {
																																												if (!eOuterType
																																														.equals(tOuterPackage)) {
																																													if (!tOuterPackage
																																															.equals(typeGraph)) {
																																														if (!tOuterPackage
																																																.equals(tOuterType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	eNestedType,
																																																	astNodeToAnnotatable,
																																																	eNestedTypeToTNestedType,
																																																	typeGraph,
																																																	tEnum,
																																																	tNestedType,
																																																	tOuterType,
																																																	eOuterTypeToTOuterInterface,
																																																	eOuterType,
																																																	tOuterPackage };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_NestedEnumInType_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tEnum, EObject tNestedType, EObject tOuterType,
			EObject eOuterType, EObject tOuterPackage) {
		EMoflonEdge astNodeToAnnotatable__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tEnum____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tNestedType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNodeToAnnotatable__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "NestedEnumInType";
		String astNodeToAnnotatable__eNestedType____source_name_prime = "source";
		String tOuterPackage__tNestedType____classes_name_prime = "classes";
		String tNestedType__tEnum____tAnnotation_name_prime = "tAnnotation";
		String tEnum__tNestedType____tAnnotated_name_prime = "tAnnotated";
		String astNodeToAnnotatable__tNestedType____target_name_prime = "target";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String eNestedTypeToTNestedType__eNestedType____source_name_prime = "source";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		String tOuterPackage__tNestedType____allTypes_name_prime = "allTypes";
		String tNestedType__tOuterPackage____package_name_prime = "package";
		String typeGraph__tNestedType____allTypes_name_prime = "allTypes";
		String tNestedType__typeGraph____model_name_prime = "model";
		String eNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		astNodeToAnnotatable__eNestedType____source.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__eNestedType____source);
		tOuterPackage__tNestedType____classes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tOuterPackage__tNestedType____classes);
		tNestedType__tEnum____tAnnotation.setSrc(tNestedType);
		tNestedType__tEnum____tAnnotation.setTrg(tEnum);
		ruleresult.getCreatedEdges().add(tNestedType__tEnum____tAnnotation);
		tEnum__tNestedType____tAnnotated.setSrc(tEnum);
		tEnum__tNestedType____tAnnotated.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tEnum__tNestedType____tAnnotated);
		astNodeToAnnotatable__tNestedType____target.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__tNestedType____target);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		ruleresult.getCreatedEdges().add(tNestedType__tOuterType____outerType);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		ruleresult.getTranslatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		ruleresult.getTranslatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		eNestedTypeToTNestedType__eNestedType____source.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__eNestedType____source);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(typeGraph__tNestedType____classes);
		tOuterPackage__tNestedType____allTypes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____allTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tOuterPackage__tNestedType____allTypes);
		tNestedType__tOuterPackage____package.setSrc(tNestedType);
		tNestedType__tOuterPackage____package.setTrg(tOuterPackage);
		ruleresult.getCreatedEdges().add(tNestedType__tOuterPackage____package);
		typeGraph__tNestedType____allTypes.setSrc(typeGraph);
		typeGraph__tNestedType____allTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(typeGraph__tNestedType____allTypes);
		tNestedType__typeGraph____model.setSrc(tNestedType);
		tNestedType__typeGraph____model.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tNestedType__typeGraph____model);
		eNestedTypeToTNestedType__tNestedType____target.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__tNestedType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		astNodeToAnnotatable__eNestedType____source.setName(astNodeToAnnotatable__eNestedType____source_name_prime);
		tOuterPackage__tNestedType____classes.setName(tOuterPackage__tNestedType____classes_name_prime);
		tNestedType__tEnum____tAnnotation.setName(tNestedType__tEnum____tAnnotation_name_prime);
		tEnum__tNestedType____tAnnotated.setName(tEnum__tNestedType____tAnnotated_name_prime);
		astNodeToAnnotatable__tNestedType____target.setName(astNodeToAnnotatable__tNestedType____target_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		eNestedTypeToTNestedType__eNestedType____source
				.setName(eNestedTypeToTNestedType__eNestedType____source_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		tOuterPackage__tNestedType____allTypes.setName(tOuterPackage__tNestedType____allTypes_name_prime);
		tNestedType__tOuterPackage____package.setName(tNestedType__tOuterPackage____package_name_prime);
		typeGraph__tNestedType____allTypes.setName(typeGraph__tNestedType____allTypes_name_prime);
		tNestedType__typeGraph____model.setName(tNestedType__typeGraph____model_name_prime);
		eNestedTypeToTNestedType__tNestedType____target
				.setName(eNestedTypeToTNestedType__tNestedType____target_name_prime);
		return new Object[] { ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tEnum,
				tNestedType, tOuterType, eOuterType, tOuterPackage, astNodeToAnnotatable__eNestedType____source,
				tOuterPackage__tNestedType____classes, tNestedType__tEnum____tAnnotation,
				tEnum__tNestedType____tAnnotated, astNodeToAnnotatable__tNestedType____target,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				eNestedType__eOuterType____abstractTypeDeclaration, eOuterType__eNestedType____bodyDeclarations,
				eNestedTypeToTNestedType__eNestedType____source, typeGraph__tNestedType____classes,
				tOuterPackage__tNestedType____allTypes, tNestedType__tOuterPackage____package,
				typeGraph__tNestedType____allTypes, tNestedType__typeGraph____model,
				eNestedTypeToTNestedType__tNestedType____target };
	}

	public static final void pattern_NestedEnumInType_1_5_registerobjects_expressionBBBBBBBBBBBB(NestedEnumInType _this,
			PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tEnum, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		_this.registerObjects_FWD(ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph,
				tEnum, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);

	}

	public static final PerformRuleResult pattern_NestedEnumInType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_2_1_preparereturnvalue_bindingFB(NestedEnumInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			NestedEnumInType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_2_1_preparereturnvalue_bindingAndBlackFFB(
			NestedEnumInType _this) {
		Object[] result_pattern_NestedEnumInType_2_1_preparereturnvalue_binding = pattern_NestedEnumInType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedEnumInType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_NestedEnumInType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedEnumInType_2_1_preparereturnvalue_black = pattern_NestedEnumInType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_NestedEnumInType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_NestedEnumInType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "NestedEnumInType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_NestedEnumInType_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eNestedType");
		EObject _localVariable_1 = match.getObject("eOuterType");
		EObject tmpENestedType = _localVariable_0;
		EObject tmpEOuterType = _localVariable_1;
		if (tmpENestedType instanceof EnumDeclaration) {
			EnumDeclaration eNestedType = (EnumDeclaration) tmpENestedType;
			if (tmpEOuterType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
				return new Object[] { eNestedType, eOuterType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedEnumInType_2_2_corematch_blackBFFBB(
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eNestedType.equals(eOuterType)) {
			for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eOuterType, TypeToTAbstractType.class, "source")) {
				TAbstractType tOuterType = eOuterTypeToTOuterInterface.getTarget();
				if (tOuterType != null) {
					_result.add(
							new Object[] { eNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_NestedEnumInType_2_3_findcontext_blackBFBBBF(
			EnumDeclaration eNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eNestedType.equals(eOuterType)) {
			if (eOuterType.equals(eOuterTypeToTOuterInterface.getSource())) {
				if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
					if (tOuterType.equals(eOuterTypeToTOuterInterface.getTarget())) {
						TPackage tOuterPackage = tOuterType.getPackage();
						if (tOuterPackage != null) {
							TypeGraph typeGraph = tOuterType.getModel();
							if (typeGraph != null) {
								if (typeGraph.equals(tOuterPackage.getModel())) {
									_result.add(new Object[] { eNestedType, typeGraph, tOuterType,
											eOuterTypeToTOuterInterface, eOuterType, tOuterPackage });
								}
							}

						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_2_3_findcontext_greenBBBBBBFFFFFFFFFF(
			EnumDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tOuterPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tOuterPackage__typeGraph____model_name_prime = "model";
		String eOuterTypeToTOuterInterface__eOuterType____source_name_prime = "source";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__tOuterType____allTypes_name_prime = "allTypes";
		String typeGraph__tOuterType____allTypes_name_prime = "allTypes";
		String tOuterType__typeGraph____model_name_prime = "model";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String eOuterTypeToTOuterInterface__tOuterType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		tOuterPackage__typeGraph____model.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__typeGraph____model);
		eOuterTypeToTOuterInterface__eOuterType____source.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__eOuterType____source.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__eOuterType____source);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterType__tOuterPackage____package);
		tOuterPackage__tOuterType____allTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____allTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterType____allTypes);
		typeGraph__tOuterType____allTypes.setSrc(typeGraph);
		typeGraph__tOuterType____allTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterType____allTypes);
		tOuterType__typeGraph____model.setSrc(tOuterType);
		tOuterType__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType__typeGraph____model);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		isApplicableMatch.getAllContextElements().add(eOuterType__eNestedType____bodyDeclarations);
		eOuterTypeToTOuterInterface__tOuterType____target.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__tOuterType____target.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__tOuterType____target);
		tOuterPackage__typeGraph____model.setName(tOuterPackage__typeGraph____model_name_prime);
		eOuterTypeToTOuterInterface__eOuterType____source
				.setName(eOuterTypeToTOuterInterface__eOuterType____source_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterPackage__tOuterType____allTypes.setName(tOuterPackage__tOuterType____allTypes_name_prime);
		typeGraph__tOuterType____allTypes.setName(typeGraph__tOuterType____allTypes_name_prime);
		tOuterType__typeGraph____model.setName(tOuterType__typeGraph____model_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		eOuterTypeToTOuterInterface__tOuterType____target
				.setName(eOuterTypeToTOuterInterface__tOuterType____target_name_prime);
		return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage, isApplicableMatch, tOuterPackage__typeGraph____model,
				eOuterTypeToTOuterInterface__eOuterType____source, tOuterType__tOuterPackage____package,
				tOuterPackage__tOuterType____allTypes, typeGraph__tOuterType____allTypes,
				tOuterType__typeGraph____model, eNestedType__eOuterType____abstractTypeDeclaration,
				eOuterType__eNestedType____bodyDeclarations, eOuterTypeToTOuterInterface__tOuterType____target };
	}

	public static final Object[] pattern_NestedEnumInType_2_4_solveCSP_bindingFBBBBBBBB(NestedEnumInType _this,
			IsApplicableMatch isApplicableMatch, EnumDeclaration eNestedType, TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eNestedType, typeGraph, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eNestedType, typeGraph, tOuterType,
					eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnumInType_2_4_solveCSP_bindingAndBlackFBBBBBBBB(NestedEnumInType _this,
			IsApplicableMatch isApplicableMatch, EnumDeclaration eNestedType, TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_NestedEnumInType_2_4_solveCSP_binding = pattern_NestedEnumInType_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage);
		if (result_pattern_NestedEnumInType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnumInType_2_4_solveCSP_binding[0];

			Object[] result_pattern_NestedEnumInType_2_4_solveCSP_black = pattern_NestedEnumInType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_NestedEnumInType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eNestedType, typeGraph, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnumInType_2_5_checkCSP_expressionFBB(NestedEnumInType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_NestedEnumInType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NestedEnumInType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NestedEnumInType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_10_1_initialbindings_blackBBBBBBB(NestedEnumInType _this,
			Match match, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		if (!tNestedType.equals(tOuterType)) {
			return new Object[] { _this, match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_10_2_SolveCSP_bindingFBBBBBBB(NestedEnumInType _this,
			Match match, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, typeGraph, tEnum, tNestedType, tOuterType,
				tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnumInType_10_2_SolveCSP_bindingAndBlackFBBBBBBB(NestedEnumInType _this,
			Match match, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		Object[] result_pattern_NestedEnumInType_10_2_SolveCSP_binding = pattern_NestedEnumInType_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage);
		if (result_pattern_NestedEnumInType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnumInType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_NestedEnumInType_10_2_SolveCSP_black = pattern_NestedEnumInType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_NestedEnumInType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnumInType_10_3_CheckCSP_expressionFBB(NestedEnumInType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedType.equals(tOuterType)) {
			return new Object[] { match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(
			Match match, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		EMoflonEdge tOuterPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tEnum____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tNestedType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tEnum);
		match.getToBeTranslatedNodes().add(tNestedType);
		String tOuterPackage__tNestedType____classes_name_prime = "classes";
		String tNestedType__tEnum____tAnnotation_name_prime = "tAnnotation";
		String tEnum__tNestedType____tAnnotated_name_prime = "tAnnotated";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		String tOuterPackage__tNestedType____allTypes_name_prime = "allTypes";
		String tNestedType__tOuterPackage____package_name_prime = "package";
		String typeGraph__tNestedType____allTypes_name_prime = "allTypes";
		String tNestedType__typeGraph____model_name_prime = "model";
		tOuterPackage__tNestedType____classes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____classes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tOuterPackage__tNestedType____classes);
		tNestedType__tEnum____tAnnotation.setSrc(tNestedType);
		tNestedType__tEnum____tAnnotation.setTrg(tEnum);
		match.getToBeTranslatedEdges().add(tNestedType__tEnum____tAnnotation);
		tEnum__tNestedType____tAnnotated.setSrc(tEnum);
		tEnum__tNestedType____tAnnotated.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tEnum__tNestedType____tAnnotated);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		match.getToBeTranslatedEdges().add(tNestedType__tOuterType____outerType);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(typeGraph__tNestedType____classes);
		tOuterPackage__tNestedType____allTypes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____allTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tOuterPackage__tNestedType____allTypes);
		tNestedType__tOuterPackage____package.setSrc(tNestedType);
		tNestedType__tOuterPackage____package.setTrg(tOuterPackage);
		match.getToBeTranslatedEdges().add(tNestedType__tOuterPackage____package);
		typeGraph__tNestedType____allTypes.setSrc(typeGraph);
		typeGraph__tNestedType____allTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(typeGraph__tNestedType____allTypes);
		tNestedType__typeGraph____model.setSrc(tNestedType);
		tNestedType__typeGraph____model.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tNestedType__typeGraph____model);
		tOuterPackage__tNestedType____classes.setName(tOuterPackage__tNestedType____classes_name_prime);
		tNestedType__tEnum____tAnnotation.setName(tNestedType__tEnum____tAnnotation_name_prime);
		tEnum__tNestedType____tAnnotated.setName(tEnum__tNestedType____tAnnotated_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		tOuterPackage__tNestedType____allTypes.setName(tOuterPackage__tNestedType____allTypes_name_prime);
		tNestedType__tOuterPackage____package.setName(tNestedType__tOuterPackage____package_name_prime);
		typeGraph__tNestedType____allTypes.setName(typeGraph__tNestedType____allTypes_name_prime);
		tNestedType__typeGraph____model.setName(tNestedType__typeGraph____model_name_prime);
		return new Object[] { match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage,
				tOuterPackage__tNestedType____classes, tNestedType__tEnum____tAnnotation,
				tEnum__tNestedType____tAnnotated, tOuterType__tNestedType____innerTypes,
				tNestedType__tOuterType____outerType, typeGraph__tNestedType____classes,
				tOuterPackage__tNestedType____allTypes, tNestedType__tOuterPackage____package,
				typeGraph__tNestedType____allTypes, tNestedType__typeGraph____model };
	}

	public static final Object[] pattern_NestedEnumInType_10_5_collectcontextelements_blackBBBBBB(Match match,
			TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedType.equals(tOuterType)) {
			return new Object[] { match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_10_5_collectcontextelements_greenBBBBFFFFF(Match match,
			TypeGraph typeGraph, TAbstractType tOuterType, TPackage tOuterPackage) {
		EMoflonEdge tOuterPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tOuterType);
		match.getContextNodes().add(tOuterPackage);
		String tOuterPackage__typeGraph____model_name_prime = "model";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__tOuterType____allTypes_name_prime = "allTypes";
		String typeGraph__tOuterType____allTypes_name_prime = "allTypes";
		String tOuterType__typeGraph____model_name_prime = "model";
		tOuterPackage__typeGraph____model.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____model.setTrg(typeGraph);
		match.getContextEdges().add(tOuterPackage__typeGraph____model);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		match.getContextEdges().add(tOuterType__tOuterPackage____package);
		tOuterPackage__tOuterType____allTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____allTypes.setTrg(tOuterType);
		match.getContextEdges().add(tOuterPackage__tOuterType____allTypes);
		typeGraph__tOuterType____allTypes.setSrc(typeGraph);
		typeGraph__tOuterType____allTypes.setTrg(tOuterType);
		match.getContextEdges().add(typeGraph__tOuterType____allTypes);
		tOuterType__typeGraph____model.setSrc(tOuterType);
		tOuterType__typeGraph____model.setTrg(typeGraph);
		match.getContextEdges().add(tOuterType__typeGraph____model);
		tOuterPackage__typeGraph____model.setName(tOuterPackage__typeGraph____model_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterPackage__tOuterType____allTypes.setName(tOuterPackage__tOuterType____allTypes_name_prime);
		typeGraph__tOuterType____allTypes.setName(typeGraph__tOuterType____allTypes_name_prime);
		tOuterType__typeGraph____model.setName(tOuterType__typeGraph____model_name_prime);
		return new Object[] { match, typeGraph, tOuterType, tOuterPackage, tOuterPackage__typeGraph____model,
				tOuterType__tOuterPackage____package, tOuterPackage__tOuterType____allTypes,
				typeGraph__tOuterType____allTypes, tOuterType__typeGraph____model };
	}

	public static final void pattern_NestedEnumInType_10_6_registerobjectstomatch_expressionBBBBBBB(
			NestedEnumInType _this, Match match, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		_this.registerObjectsToMatch_BWD(match, typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage);

	}

	public static final boolean pattern_NestedEnumInType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedEnumInType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_1 = isApplicableMatch.getObject("tEnum");
		EObject _localVariable_2 = isApplicableMatch.getObject("tNestedType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tOuterType");
		EObject _localVariable_4 = isApplicableMatch.getObject("eOuterTypeToTOuterInterface");
		EObject _localVariable_5 = isApplicableMatch.getObject("eOuterType");
		EObject _localVariable_6 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpTEnum = _localVariable_1;
		EObject tmpTNestedType = _localVariable_2;
		EObject tmpTOuterType = _localVariable_3;
		EObject tmpEOuterTypeToTOuterInterface = _localVariable_4;
		EObject tmpEOuterType = _localVariable_5;
		EObject tmpTOuterPackage = _localVariable_6;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpTEnum instanceof TEnum) {
				TEnum tEnum = (TEnum) tmpTEnum;
				if (tmpTNestedType instanceof TClass) {
					TClass tNestedType = (TClass) tmpTNestedType;
					if (tmpTOuterType instanceof TAbstractType) {
						TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
						if (tmpEOuterTypeToTOuterInterface instanceof TypeToTAbstractType) {
							TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) tmpEOuterTypeToTOuterInterface;
							if (tmpEOuterType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
								if (tmpTOuterPackage instanceof TPackage) {
									TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
									return new Object[] { typeGraph, tEnum, tNestedType, tOuterType,
											eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_11_1_performtransformation_blackBBBBBBBFBB(
			TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			NestedEnumInType _this, IsApplicableMatch isApplicableMatch) {
		if (!tNestedType.equals(tOuterType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { typeGraph, tEnum, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
							eOuterType, tOuterPackage, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			NestedEnumInType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_NestedEnumInType_11_1_performtransformation_binding = pattern_NestedEnumInType_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_NestedEnumInType_11_1_performtransformation_binding != null) {
			TypeGraph typeGraph = (TypeGraph) result_pattern_NestedEnumInType_11_1_performtransformation_binding[0];
			TEnum tEnum = (TEnum) result_pattern_NestedEnumInType_11_1_performtransformation_binding[1];
			TClass tNestedType = (TClass) result_pattern_NestedEnumInType_11_1_performtransformation_binding[2];
			TAbstractType tOuterType = (TAbstractType) result_pattern_NestedEnumInType_11_1_performtransformation_binding[3];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result_pattern_NestedEnumInType_11_1_performtransformation_binding[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_NestedEnumInType_11_1_performtransformation_binding[5];
			TPackage tOuterPackage = (TPackage) result_pattern_NestedEnumInType_11_1_performtransformation_binding[6];

			Object[] result_pattern_NestedEnumInType_11_1_performtransformation_black = pattern_NestedEnumInType_11_1_performtransformation_blackBBBBBBBFBB(
					typeGraph, tEnum, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage,
					_this, isApplicableMatch);
			if (result_pattern_NestedEnumInType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_NestedEnumInType_11_1_performtransformation_black[7];

				return new Object[] { typeGraph, tEnum, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
						eOuterType, tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_11_1_performtransformation_greenFFFBBB(TClass tNestedType,
			AbstractTypeDeclaration eOuterType, CSP csp) {
		EnumDeclaration eNestedType = JavaFactory.eINSTANCE.createEnumDeclaration();
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("eNestedType", "proxy");
		Object _localVariable_1 = csp.getValue("eNestedType", "name");
		eNestedType.setAbstractTypeDeclaration(eOuterType);
		astNodeToAnnotatable.setSource(eNestedType);
		astNodeToAnnotatable.setTarget(tNestedType);
		eNestedTypeToTNestedType.setSource(eNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		boolean eNestedType_proxy_prime = (boolean) _localVariable_0;
		String eNestedType_name_prime = (String) _localVariable_1;
		eNestedType.setProxy(Boolean.valueOf(eNestedType_proxy_prime));
		eNestedType.setName(eNestedType_name_prime);
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType, eOuterType,
				csp };
	}

	public static final Object[] pattern_NestedEnumInType_11_2_collecttranslatedelements_blackBBBBB(
			EnumDeclaration eNestedType, ASTNodeToTAnnotatable astNodeToAnnotatable,
			TypeToTAbstractType eNestedTypeToTNestedType, TEnum tEnum, TClass tNestedType) {
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tEnum, tNestedType };
	}

	public static final Object[] pattern_NestedEnumInType_11_2_collecttranslatedelements_greenFBBBBB(
			EnumDeclaration eNestedType, ASTNodeToTAnnotatable astNodeToAnnotatable,
			TypeToTAbstractType eNestedTypeToTNestedType, TEnum tEnum, TClass tNestedType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eNestedType);
		ruleresult.getCreatedLinkElements().add(astNodeToAnnotatable);
		ruleresult.getCreatedLinkElements().add(eNestedTypeToTNestedType);
		ruleresult.getTranslatedElements().add(tEnum);
		ruleresult.getTranslatedElements().add(tNestedType);
		return new Object[] { ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tEnum,
				tNestedType };
	}

	public static final Object[] pattern_NestedEnumInType_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tEnum, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		if (!eNestedType.equals(eNestedTypeToTNestedType)) {
			if (!eNestedType.equals(typeGraph)) {
				if (!eNestedType.equals(tEnum)) {
					if (!eNestedType.equals(tNestedType)) {
						if (!eNestedType.equals(tOuterType)) {
							if (!eNestedType.equals(eOuterTypeToTOuterInterface)) {
								if (!eNestedType.equals(eOuterType)) {
									if (!eNestedType.equals(tOuterPackage)) {
										if (!astNodeToAnnotatable.equals(eNestedType)) {
											if (!astNodeToAnnotatable.equals(eNestedTypeToTNestedType)) {
												if (!astNodeToAnnotatable.equals(typeGraph)) {
													if (!astNodeToAnnotatable.equals(tEnum)) {
														if (!astNodeToAnnotatable.equals(tNestedType)) {
															if (!astNodeToAnnotatable.equals(tOuterType)) {
																if (!astNodeToAnnotatable
																		.equals(eOuterTypeToTOuterInterface)) {
																	if (!astNodeToAnnotatable.equals(eOuterType)) {
																		if (!astNodeToAnnotatable
																				.equals(tOuterPackage)) {
																			if (!eNestedTypeToTNestedType
																					.equals(typeGraph)) {
																				if (!eNestedTypeToTNestedType
																						.equals(tEnum)) {
																					if (!eNestedTypeToTNestedType
																							.equals(tNestedType)) {
																						if (!eNestedTypeToTNestedType
																								.equals(tOuterType)) {
																							if (!eNestedTypeToTNestedType
																									.equals(eOuterTypeToTOuterInterface)) {
																								if (!eNestedTypeToTNestedType
																										.equals(eOuterType)) {
																									if (!eNestedTypeToTNestedType
																											.equals(tOuterPackage)) {
																										if (!tEnum
																												.equals(typeGraph)) {
																											if (!tEnum
																													.equals(tNestedType)) {
																												if (!tEnum
																														.equals(tOuterType)) {
																													if (!tEnum
																															.equals(tOuterPackage)) {
																														if (!tNestedType
																																.equals(typeGraph)) {
																															if (!tNestedType
																																	.equals(tOuterType)) {
																																if (!tNestedType
																																		.equals(tOuterPackage)) {
																																	if (!tOuterType
																																			.equals(typeGraph)) {
																																		if (!eOuterTypeToTOuterInterface
																																				.equals(typeGraph)) {
																																			if (!eOuterTypeToTOuterInterface
																																					.equals(tEnum)) {
																																				if (!eOuterTypeToTOuterInterface
																																						.equals(tNestedType)) {
																																					if (!eOuterTypeToTOuterInterface
																																							.equals(tOuterType)) {
																																						if (!eOuterTypeToTOuterInterface
																																								.equals(tOuterPackage)) {
																																							if (!eOuterType
																																									.equals(typeGraph)) {
																																								if (!eOuterType
																																										.equals(tEnum)) {
																																									if (!eOuterType
																																											.equals(tNestedType)) {
																																										if (!eOuterType
																																												.equals(tOuterType)) {
																																											if (!eOuterType
																																													.equals(eOuterTypeToTOuterInterface)) {
																																												if (!eOuterType
																																														.equals(tOuterPackage)) {
																																													if (!tOuterPackage
																																															.equals(typeGraph)) {
																																														if (!tOuterPackage
																																																.equals(tOuterType)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	eNestedType,
																																																	astNodeToAnnotatable,
																																																	eNestedTypeToTNestedType,
																																																	typeGraph,
																																																	tEnum,
																																																	tNestedType,
																																																	tOuterType,
																																																	eOuterTypeToTOuterInterface,
																																																	eOuterType,
																																																	tOuterPackage };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_NestedEnumInType_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tEnum, EObject tNestedType, EObject tOuterType,
			EObject eOuterType, EObject tOuterPackage) {
		EMoflonEdge astNodeToAnnotatable__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tEnum____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tNestedType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge astNodeToAnnotatable__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "NestedEnumInType";
		String astNodeToAnnotatable__eNestedType____source_name_prime = "source";
		String tOuterPackage__tNestedType____classes_name_prime = "classes";
		String tNestedType__tEnum____tAnnotation_name_prime = "tAnnotation";
		String tEnum__tNestedType____tAnnotated_name_prime = "tAnnotated";
		String astNodeToAnnotatable__tNestedType____target_name_prime = "target";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String eNestedTypeToTNestedType__eNestedType____source_name_prime = "source";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		String tOuterPackage__tNestedType____allTypes_name_prime = "allTypes";
		String tNestedType__tOuterPackage____package_name_prime = "package";
		String typeGraph__tNestedType____allTypes_name_prime = "allTypes";
		String tNestedType__typeGraph____model_name_prime = "model";
		String eNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		astNodeToAnnotatable__eNestedType____source.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__eNestedType____source);
		tOuterPackage__tNestedType____classes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tOuterPackage__tNestedType____classes);
		tNestedType__tEnum____tAnnotation.setSrc(tNestedType);
		tNestedType__tEnum____tAnnotation.setTrg(tEnum);
		ruleresult.getTranslatedEdges().add(tNestedType__tEnum____tAnnotation);
		tEnum__tNestedType____tAnnotated.setSrc(tEnum);
		tEnum__tNestedType____tAnnotated.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tEnum__tNestedType____tAnnotated);
		astNodeToAnnotatable__tNestedType____target.setSrc(astNodeToAnnotatable);
		astNodeToAnnotatable__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(astNodeToAnnotatable__tNestedType____target);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		ruleresult.getTranslatedEdges().add(tNestedType__tOuterType____outerType);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		ruleresult.getCreatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		eNestedTypeToTNestedType__eNestedType____source.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__eNestedType____source);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(typeGraph__tNestedType____classes);
		tOuterPackage__tNestedType____allTypes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____allTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tOuterPackage__tNestedType____allTypes);
		tNestedType__tOuterPackage____package.setSrc(tNestedType);
		tNestedType__tOuterPackage____package.setTrg(tOuterPackage);
		ruleresult.getTranslatedEdges().add(tNestedType__tOuterPackage____package);
		typeGraph__tNestedType____allTypes.setSrc(typeGraph);
		typeGraph__tNestedType____allTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(typeGraph__tNestedType____allTypes);
		tNestedType__typeGraph____model.setSrc(tNestedType);
		tNestedType__typeGraph____model.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tNestedType__typeGraph____model);
		eNestedTypeToTNestedType__tNestedType____target.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__tNestedType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		astNodeToAnnotatable__eNestedType____source.setName(astNodeToAnnotatable__eNestedType____source_name_prime);
		tOuterPackage__tNestedType____classes.setName(tOuterPackage__tNestedType____classes_name_prime);
		tNestedType__tEnum____tAnnotation.setName(tNestedType__tEnum____tAnnotation_name_prime);
		tEnum__tNestedType____tAnnotated.setName(tEnum__tNestedType____tAnnotated_name_prime);
		astNodeToAnnotatable__tNestedType____target.setName(astNodeToAnnotatable__tNestedType____target_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		eNestedTypeToTNestedType__eNestedType____source
				.setName(eNestedTypeToTNestedType__eNestedType____source_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		tOuterPackage__tNestedType____allTypes.setName(tOuterPackage__tNestedType____allTypes_name_prime);
		tNestedType__tOuterPackage____package.setName(tNestedType__tOuterPackage____package_name_prime);
		typeGraph__tNestedType____allTypes.setName(typeGraph__tNestedType____allTypes_name_prime);
		tNestedType__typeGraph____model.setName(tNestedType__typeGraph____model_name_prime);
		eNestedTypeToTNestedType__tNestedType____target
				.setName(eNestedTypeToTNestedType__tNestedType____target_name_prime);
		return new Object[] { ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tEnum,
				tNestedType, tOuterType, eOuterType, tOuterPackage, astNodeToAnnotatable__eNestedType____source,
				tOuterPackage__tNestedType____classes, tNestedType__tEnum____tAnnotation,
				tEnum__tNestedType____tAnnotated, astNodeToAnnotatable__tNestedType____target,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				eNestedType__eOuterType____abstractTypeDeclaration, eOuterType__eNestedType____bodyDeclarations,
				eNestedTypeToTNestedType__eNestedType____source, typeGraph__tNestedType____classes,
				tOuterPackage__tNestedType____allTypes, tNestedType__tOuterPackage____package,
				typeGraph__tNestedType____allTypes, tNestedType__typeGraph____model,
				eNestedTypeToTNestedType__tNestedType____target };
	}

	public static final void pattern_NestedEnumInType_11_5_registerobjects_expressionBBBBBBBBBBBB(
			NestedEnumInType _this, PerformRuleResult ruleresult, EObject eNestedType, EObject astNodeToAnnotatable,
			EObject eNestedTypeToTNestedType, EObject typeGraph, EObject tEnum, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject eOuterType, EObject tOuterPackage) {
		_this.registerObjects_BWD(ruleresult, eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph,
				tEnum, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);

	}

	public static final PerformRuleResult pattern_NestedEnumInType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_12_1_preparereturnvalue_bindingFB(NestedEnumInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			NestedEnumInType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_12_1_preparereturnvalue_bindingAndBlackFFB(
			NestedEnumInType _this) {
		Object[] result_pattern_NestedEnumInType_12_1_preparereturnvalue_binding = pattern_NestedEnumInType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedEnumInType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_NestedEnumInType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedEnumInType_12_1_preparereturnvalue_black = pattern_NestedEnumInType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_NestedEnumInType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_NestedEnumInType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "NestedEnumInType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_NestedEnumInType_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("typeGraph");
		EObject _localVariable_1 = match.getObject("tEnum");
		EObject _localVariable_2 = match.getObject("tNestedType");
		EObject _localVariable_3 = match.getObject("tOuterType");
		EObject _localVariable_4 = match.getObject("tOuterPackage");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpTEnum = _localVariable_1;
		EObject tmpTNestedType = _localVariable_2;
		EObject tmpTOuterType = _localVariable_3;
		EObject tmpTOuterPackage = _localVariable_4;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpTEnum instanceof TEnum) {
				TEnum tEnum = (TEnum) tmpTEnum;
				if (tmpTNestedType instanceof TClass) {
					TClass tNestedType = (TClass) tmpTNestedType;
					if (tmpTOuterType instanceof TAbstractType) {
						TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
						if (tmpTOuterPackage instanceof TPackage) {
							TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
							return new Object[] { typeGraph, tEnum, tNestedType, tOuterType, tOuterPackage, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedEnumInType_12_2_corematch_blackBBBBFFBB(TypeGraph typeGraph,
			TEnum tEnum, TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNestedType.equals(tOuterType)) {
			for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tOuterType, TypeToTAbstractType.class, "target")) {
				Type tmpEOuterType = eOuterTypeToTOuterInterface.getSource();
				if (tmpEOuterType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
					_result.add(new Object[] { typeGraph, tEnum, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
							eOuterType, tOuterPackage, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_NestedEnumInType_12_3_findcontext_blackBBBBBBB(TypeGraph typeGraph,
			TEnum tEnum, TClass tNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNestedType.equals(tOuterType)) {
			if (typeGraph.equals(tOuterPackage.getModel())) {
				if (eOuterType.equals(eOuterTypeToTOuterInterface.getSource())) {
					if (tOuterPackage.getClasses().contains(tNestedType)) {
						if (tNestedType.getTAnnotation().contains(tEnum)) {
							if (tOuterType.getInnerTypes().contains(tNestedType)) {
								if (tOuterPackage.equals(tOuterType.getPackage())) {
									if (typeGraph.getAllTypes().contains(tOuterType)) {
										if (typeGraph.getClasses().contains(tNestedType)) {
											if (tOuterPackage.getAllTypes().contains(tNestedType)) {
												if (typeGraph.getAllTypes().contains(tNestedType)) {
													if (tOuterType.equals(eOuterTypeToTOuterInterface.getTarget())) {
														_result.add(new Object[] { typeGraph, tEnum, tNestedType,
																tOuterType, eOuterTypeToTOuterInterface, eOuterType,
																tOuterPackage });
													}
												}
											}
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

	public static final Object[] pattern_NestedEnumInType_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFFFFF(
			TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tOuterPackage__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tEnum____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tNestedType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tOuterPackage__typeGraph____model_name_prime = "model";
		String eOuterTypeToTOuterInterface__eOuterType____source_name_prime = "source";
		String tOuterPackage__tNestedType____classes_name_prime = "classes";
		String tNestedType__tEnum____tAnnotation_name_prime = "tAnnotation";
		String tEnum__tNestedType____tAnnotated_name_prime = "tAnnotated";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__tOuterType____allTypes_name_prime = "allTypes";
		String typeGraph__tOuterType____allTypes_name_prime = "allTypes";
		String tOuterType__typeGraph____model_name_prime = "model";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		String tOuterPackage__tNestedType____allTypes_name_prime = "allTypes";
		String tNestedType__tOuterPackage____package_name_prime = "package";
		String typeGraph__tNestedType____allTypes_name_prime = "allTypes";
		String tNestedType__typeGraph____model_name_prime = "model";
		String eOuterTypeToTOuterInterface__tOuterType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tEnum);
		isApplicableMatch.getAllContextElements().add(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		tOuterPackage__typeGraph____model.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__typeGraph____model);
		eOuterTypeToTOuterInterface__eOuterType____source.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__eOuterType____source.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__eOuterType____source);
		tOuterPackage__tNestedType____classes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____classes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tNestedType____classes);
		tNestedType__tEnum____tAnnotation.setSrc(tNestedType);
		tNestedType__tEnum____tAnnotation.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(tNestedType__tEnum____tAnnotation);
		tEnum__tNestedType____tAnnotated.setSrc(tEnum);
		tEnum__tNestedType____tAnnotated.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tEnum__tNestedType____tAnnotated);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tNestedType__tOuterType____outerType);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterType__tOuterPackage____package);
		tOuterPackage__tOuterType____allTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____allTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterType____allTypes);
		typeGraph__tOuterType____allTypes.setSrc(typeGraph);
		typeGraph__tOuterType____allTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterType____allTypes);
		tOuterType__typeGraph____model.setSrc(tOuterType);
		tOuterType__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType__typeGraph____model);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tNestedType____classes);
		tOuterPackage__tNestedType____allTypes.setSrc(tOuterPackage);
		tOuterPackage__tNestedType____allTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tNestedType____allTypes);
		tNestedType__tOuterPackage____package.setSrc(tNestedType);
		tNestedType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tNestedType__tOuterPackage____package);
		typeGraph__tNestedType____allTypes.setSrc(typeGraph);
		typeGraph__tNestedType____allTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tNestedType____allTypes);
		tNestedType__typeGraph____model.setSrc(tNestedType);
		tNestedType__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedType__typeGraph____model);
		eOuterTypeToTOuterInterface__tOuterType____target.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__tOuterType____target.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__tOuterType____target);
		tOuterPackage__typeGraph____model.setName(tOuterPackage__typeGraph____model_name_prime);
		eOuterTypeToTOuterInterface__eOuterType____source
				.setName(eOuterTypeToTOuterInterface__eOuterType____source_name_prime);
		tOuterPackage__tNestedType____classes.setName(tOuterPackage__tNestedType____classes_name_prime);
		tNestedType__tEnum____tAnnotation.setName(tNestedType__tEnum____tAnnotation_name_prime);
		tEnum__tNestedType____tAnnotated.setName(tEnum__tNestedType____tAnnotated_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterPackage__tOuterType____allTypes.setName(tOuterPackage__tOuterType____allTypes_name_prime);
		typeGraph__tOuterType____allTypes.setName(typeGraph__tOuterType____allTypes_name_prime);
		tOuterType__typeGraph____model.setName(tOuterType__typeGraph____model_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		tOuterPackage__tNestedType____allTypes.setName(tOuterPackage__tNestedType____allTypes_name_prime);
		tNestedType__tOuterPackage____package.setName(tNestedType__tOuterPackage____package_name_prime);
		typeGraph__tNestedType____allTypes.setName(typeGraph__tNestedType____allTypes_name_prime);
		tNestedType__typeGraph____model.setName(tNestedType__typeGraph____model_name_prime);
		eOuterTypeToTOuterInterface__tOuterType____target
				.setName(eOuterTypeToTOuterInterface__tOuterType____target_name_prime);
		return new Object[] { typeGraph, tEnum, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage, isApplicableMatch, tOuterPackage__typeGraph____model,
				eOuterTypeToTOuterInterface__eOuterType____source, tOuterPackage__tNestedType____classes,
				tNestedType__tEnum____tAnnotation, tEnum__tNestedType____tAnnotated,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				tOuterType__tOuterPackage____package, tOuterPackage__tOuterType____allTypes,
				typeGraph__tOuterType____allTypes, tOuterType__typeGraph____model, typeGraph__tNestedType____classes,
				tOuterPackage__tNestedType____allTypes, tNestedType__tOuterPackage____package,
				typeGraph__tNestedType____allTypes, tNestedType__typeGraph____model,
				eOuterTypeToTOuterInterface__tOuterType____target };
	}

	public static final Object[] pattern_NestedEnumInType_12_4_solveCSP_bindingFBBBBBBBBB(NestedEnumInType _this,
			IsApplicableMatch isApplicableMatch, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, typeGraph, tEnum, tNestedType,
				tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeGraph, tEnum, tNestedType, tOuterType,
					eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnumInType_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			NestedEnumInType _this, IsApplicableMatch isApplicableMatch, TypeGraph typeGraph, TEnum tEnum,
			TClass tNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_NestedEnumInType_12_4_solveCSP_binding = pattern_NestedEnumInType_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, typeGraph, tEnum, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
				eOuterType, tOuterPackage);
		if (result_pattern_NestedEnumInType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnumInType_12_4_solveCSP_binding[0];

			Object[] result_pattern_NestedEnumInType_12_4_solveCSP_black = pattern_NestedEnumInType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_NestedEnumInType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeGraph, tEnum, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnumInType_12_5_checkCSP_expressionFBB(NestedEnumInType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_NestedEnumInType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NestedEnumInType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NestedEnumInType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_20_1_preparereturnvalue_bindingFB(NestedEnumInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			NestedEnumInType _this) {
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

	public static final Object[] pattern_NestedEnumInType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			NestedEnumInType _this) {
		Object[] result_pattern_NestedEnumInType_20_1_preparereturnvalue_binding = pattern_NestedEnumInType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedEnumInType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_NestedEnumInType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedEnumInType_20_1_preparereturnvalue_black = pattern_NestedEnumInType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_NestedEnumInType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_NestedEnumInType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_NestedEnumInType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_0BBBBB(TEnum tEnum,
			TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedType.equals(tOuterType)) {
			TAnnotatable __DEC_tEnum_tAnnotated_729770 = tEnum.getTAnnotated();
			if (__DEC_tEnum_tAnnotated_729770 != null) {
				if (!typeGraph.equals(__DEC_tEnum_tAnnotated_729770)) {
					if (!tNestedType.equals(__DEC_tEnum_tAnnotated_729770)) {
						if (!tOuterType.equals(__DEC_tEnum_tAnnotated_729770)) {
							if (!tOuterPackage.equals(__DEC_tEnum_tAnnotated_729770)) {
								return new Object[] { tEnum, typeGraph, tNestedType, tOuterType, tOuterPackage };
							}
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_1BB(TClass tNestedType,
			TPackage tOuterPackage) {
		for (TPackage __DEC_tNestedType_classes_363410 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TPackage.class, "classes")) {
			if (!tOuterPackage.equals(__DEC_tNestedType_classes_363410)) {
				return new Object[] { tNestedType, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_2BB(TClass tNestedType,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tNestedType_classes_18958 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tNestedType_classes_18958)) {
				return new Object[] { tNestedType, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_3BB(TClass tNestedType,
			TAbstractType tOuterType) {
		if (!tNestedType.equals(tOuterType)) {
			TAbstractType __DEC_tNestedType_innerTypes_414767 = tNestedType.getOuterType();
			if (__DEC_tNestedType_innerTypes_414767 != null) {
				if (!tNestedType.equals(__DEC_tNestedType_innerTypes_414767)) {
					if (!tOuterType.equals(__DEC_tNestedType_innerTypes_414767)) {
						return new Object[] { tNestedType, tOuterType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_4BB(TClass tNestedType,
			TPackage tOuterPackage) {
		TPackage __DEC_tNestedType_allTypes_449606 = tNestedType.getPackage();
		if (__DEC_tNestedType_allTypes_449606 != null) {
			if (!tOuterPackage.equals(__DEC_tNestedType_allTypes_449606)) {
				return new Object[] { tNestedType, tOuterPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_5BB(TEnum tEnum,
			TypeGraph typeGraph) {
		if (typeGraph.equals(tEnum.getTAnnotated())) {
			return new Object[] { tEnum, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_6BB(TEnum tEnum,
			TAbstractType tOuterType) {
		if (tOuterType.equals(tEnum.getTAnnotated())) {
			return new Object[] { tEnum, tOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_7BB(TEnum tEnum,
			TPackage tOuterPackage) {
		if (tOuterPackage.equals(tEnum.getTAnnotated())) {
			return new Object[] { tEnum, tOuterPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedEnumInType_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTOuterPackage = _edge_classes.getSrc();
		if (tmpTOuterPackage instanceof TPackage) {
			TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
			EObject tmpTNestedType = _edge_classes.getTrg();
			if (tmpTNestedType instanceof TClass) {
				TClass tNestedType = (TClass) tmpTNestedType;
				if (tOuterPackage.getClasses().contains(tNestedType)) {
					if (tOuterPackage.getAllTypes().contains(tNestedType)) {
						TypeGraph typeGraph = tOuterPackage.getModel();
						if (typeGraph != null) {
							if (typeGraph.getClasses().contains(tNestedType)) {
								if (typeGraph.getAllTypes().contains(tNestedType)) {
									TAbstractType tOuterType = tNestedType.getOuterType();
									if (tOuterType != null) {
										if (!tNestedType.equals(tOuterType)) {
											if (tOuterPackage.equals(tOuterType.getPackage())) {
												if (typeGraph.getAllTypes().contains(tOuterType)) {
													if (pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_1BB(
															tNestedType, tOuterPackage) == null) {
														if (pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_4BB(
																tNestedType, tOuterPackage) == null) {
															if (pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_2BB(
																	tNestedType, typeGraph) == null) {
																if (pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_3BB(
																		tNestedType, tOuterType) == null) {
																	for (TAnnotation tmpTEnum : tNestedType
																			.getTAnnotation()) {
																		if (tmpTEnum instanceof TEnum) {
																			TEnum tEnum = (TEnum) tmpTEnum;
																			if (pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_0BBBBB(
																					tEnum, typeGraph, tNestedType,
																					tOuterType,
																					tOuterPackage) == null) {
																				if (pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_5BB(
																						tEnum, typeGraph) == null) {
																					if (pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_6BB(
																							tEnum,
																							tOuterType) == null) {
																						if (pattern_NestedEnumInType_20_2_testcorematchandDECs_black_nac_7BB(
																								tEnum,
																								tOuterPackage) == null) {
																							_result.add(new Object[] {
																									typeGraph, tEnum,
																									tNestedType,
																									tOuterType,
																									tOuterPackage,
																									_edge_classes });
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_NestedEnumInType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_NestedEnumInType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			NestedEnumInType _this, Match match, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, typeGraph, tEnum, tNestedType, tOuterType,
				tOuterPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_NestedEnumInType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			NestedEnumInType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_NestedEnumInType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_21_1_preparereturnvalue_bindingFB(NestedEnumInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			NestedEnumInType _this) {
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

	public static final Object[] pattern_NestedEnumInType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			NestedEnumInType _this) {
		Object[] result_pattern_NestedEnumInType_21_1_preparereturnvalue_binding = pattern_NestedEnumInType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedEnumInType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_NestedEnumInType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedEnumInType_21_1_preparereturnvalue_black = pattern_NestedEnumInType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_NestedEnumInType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_NestedEnumInType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_NestedEnumInType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_NestedEnumInType_21_2_testcorematchandDECs_black_nac_0B(
			EnumDeclaration eNestedType) {
		AnonymousClassDeclaration __DEC_eNestedType_anonymousClassDeclarationOwner_407915 = eNestedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_eNestedType_anonymousClassDeclarationOwner_407915 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_NestedEnumInType_21_2_testcorematchandDECs_black_nac_1B(
			EnumDeclaration eNestedType) {
		for (Model __DEC_eNestedType_orphanTypes_657160 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, Model.class, "orphanTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_21_2_testcorematchandDECs_black_nac_2B(
			EnumDeclaration eNestedType) {
		org.eclipse.modisco.java.Package __DEC_eNestedType_ownedElements_926648 = eNestedType.getPackage();
		if (__DEC_eNestedType_ownedElements_926648 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_NestedEnumInType_21_2_testcorematchandDECs_black_nac_3B(
			EnumDeclaration eNestedType) {
		for (MAbstractMethodDefinition __DEC_eNestedType_mInnerTypes_493534 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedEnumInType_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_abstractTypeDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpENestedType = _edge_abstractTypeDeclaration.getSrc();
		if (tmpENestedType instanceof EnumDeclaration) {
			EnumDeclaration eNestedType = (EnumDeclaration) tmpENestedType;
			EObject tmpEOuterType = _edge_abstractTypeDeclaration.getTrg();
			if (tmpEOuterType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
				if (!eNestedType.equals(eOuterType)) {
					if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
						if (pattern_NestedEnumInType_21_2_testcorematchandDECs_black_nac_0B(eNestedType) == null) {
							if (pattern_NestedEnumInType_21_2_testcorematchandDECs_black_nac_1B(eNestedType) == null) {
								if (pattern_NestedEnumInType_21_2_testcorematchandDECs_black_nac_2B(
										eNestedType) == null) {
									if (pattern_NestedEnumInType_21_2_testcorematchandDECs_black_nac_3B(
											eNestedType) == null) {
										_result.add(new Object[] { eNestedType, eOuterType,
												_edge_abstractTypeDeclaration });
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

	public static final Object[] pattern_NestedEnumInType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_NestedEnumInType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			NestedEnumInType _this, Match match, EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eNestedType, eOuterType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_NestedEnumInType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			NestedEnumInType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_NestedEnumInType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_24_1_prepare_blackB(NestedEnumInType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_NestedEnumInType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_NestedEnumInType_24_2_matchsrctrgcontext_bindingFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eNestedType");
		EObject _localVariable_1 = targetMatch.getObject("typeGraph");
		EObject _localVariable_2 = targetMatch.getObject("tEnum");
		EObject _localVariable_3 = targetMatch.getObject("tNestedType");
		EObject _localVariable_4 = targetMatch.getObject("tOuterType");
		EObject _localVariable_5 = sourceMatch.getObject("eOuterType");
		EObject _localVariable_6 = targetMatch.getObject("tOuterPackage");
		EObject tmpENestedType = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpTEnum = _localVariable_2;
		EObject tmpTNestedType = _localVariable_3;
		EObject tmpTOuterType = _localVariable_4;
		EObject tmpEOuterType = _localVariable_5;
		EObject tmpTOuterPackage = _localVariable_6;
		if (tmpENestedType instanceof EnumDeclaration) {
			EnumDeclaration eNestedType = (EnumDeclaration) tmpENestedType;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpTEnum instanceof TEnum) {
					TEnum tEnum = (TEnum) tmpTEnum;
					if (tmpTNestedType instanceof TClass) {
						TClass tNestedType = (TClass) tmpTNestedType;
						if (tmpTOuterType instanceof TAbstractType) {
							TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
							if (tmpEOuterType instanceof AbstractTypeDeclaration) {
								AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
								if (tmpTOuterPackage instanceof TPackage) {
									TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
									return new Object[] { eNestedType, typeGraph, tEnum, tNestedType, tOuterType,
											eOuterType, tOuterPackage, sourceMatch, targetMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			EnumDeclaration eNestedType, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		if (!eNestedType.equals(eOuterType)) {
			if (!tNestedType.equals(tOuterType)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { eNestedType, typeGraph, tEnum, tNestedType, tOuterType, eOuterType,
							tOuterPackage, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_binding = pattern_NestedEnumInType_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_binding != null) {
			EnumDeclaration eNestedType = (EnumDeclaration) result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_binding[1];
			TEnum tEnum = (TEnum) result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_binding[2];
			TClass tNestedType = (TClass) result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_binding[3];
			TAbstractType tOuterType = (TAbstractType) result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_binding[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_binding[5];
			TPackage tOuterPackage = (TPackage) result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_black = pattern_NestedEnumInType_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					eNestedType, typeGraph, tEnum, tNestedType, tOuterType, eOuterType, tOuterPackage, sourceMatch,
					targetMatch);
			if (result_pattern_NestedEnumInType_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { eNestedType, typeGraph, tEnum, tNestedType, tOuterType, eOuterType, tOuterPackage,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_24_3_solvecsp_bindingFBBBBBBBBBB(NestedEnumInType _this,
			EnumDeclaration eNestedType, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(eNestedType, typeGraph, tEnum, tNestedType, tOuterType,
				eOuterType, tOuterPackage, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, eNestedType, typeGraph, tEnum, tNestedType, tOuterType, eOuterType,
					tOuterPackage, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnumInType_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			NestedEnumInType _this, EnumDeclaration eNestedType, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_NestedEnumInType_24_3_solvecsp_binding = pattern_NestedEnumInType_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, eNestedType, typeGraph, tEnum, tNestedType, tOuterType, eOuterType, tOuterPackage, sourceMatch,
				targetMatch);
		if (result_pattern_NestedEnumInType_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnumInType_24_3_solvecsp_binding[0];

			Object[] result_pattern_NestedEnumInType_24_3_solvecsp_black = pattern_NestedEnumInType_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_NestedEnumInType_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, eNestedType, typeGraph, tEnum, tNestedType, tOuterType, eOuterType,
						tOuterPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnumInType_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_NestedEnumInType_24_5_matchcorrcontext_blackBFBBB(
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eOuterType, TypeToTAbstractType.class, "source")) {
				if (tOuterType.equals(eOuterTypeToTOuterInterface.getTarget())) {
					_result.add(new Object[] { tOuterType, eOuterTypeToTOuterInterface, eOuterType, sourceMatch,
							targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_24_5_matchcorrcontext_greenBBBF(
			TypeToTAbstractType eOuterTypeToTOuterInterface, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "NestedEnumInType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eOuterTypeToTOuterInterface, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_NestedEnumInType_24_6_createcorrespondence_blackBBBBBBBB(
			EnumDeclaration eNestedType, TypeGraph typeGraph, TEnum tEnum, TClass tNestedType, TAbstractType tOuterType,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, CCMatch ccMatch) {
		if (!eNestedType.equals(eOuterType)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { eNestedType, typeGraph, tEnum, tNestedType, tOuterType, eOuterType, tOuterPackage,
						ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_24_6_createcorrespondence_greenBFFBB(
			EnumDeclaration eNestedType, TClass tNestedType, CCMatch ccMatch) {
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		astNodeToAnnotatable.setSource(eNestedType);
		astNodeToAnnotatable.setTarget(tNestedType);
		ccMatch.getCreateCorr().add(astNodeToAnnotatable);
		eNestedTypeToTNestedType.setSource(eNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		ccMatch.getCreateCorr().add(eNestedTypeToTNestedType);
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, tNestedType, ccMatch };
	}

	public static final Object[] pattern_NestedEnumInType_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_NestedEnumInType_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "NestedEnumInType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_NestedEnumInType_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_27_1_matchtggpattern_black_nac_0B(
			EnumDeclaration eNestedType) {
		AnonymousClassDeclaration __DEC_eNestedType_anonymousClassDeclarationOwner_473523 = eNestedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_eNestedType_anonymousClassDeclarationOwner_473523 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_NestedEnumInType_27_1_matchtggpattern_black_nac_1B(
			EnumDeclaration eNestedType) {
		for (Model __DEC_eNestedType_orphanTypes_534596 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, Model.class, "orphanTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_27_1_matchtggpattern_black_nac_2B(
			EnumDeclaration eNestedType) {
		org.eclipse.modisco.java.Package __DEC_eNestedType_ownedElements_720904 = eNestedType.getPackage();
		if (__DEC_eNestedType_ownedElements_720904 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_NestedEnumInType_27_1_matchtggpattern_black_nac_3B(
			EnumDeclaration eNestedType) {
		for (MAbstractMethodDefinition __DEC_eNestedType_mInnerTypes_216332 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_27_1_matchtggpattern_blackBB(EnumDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
				if (pattern_NestedEnumInType_27_1_matchtggpattern_black_nac_0B(eNestedType) == null) {
					if (pattern_NestedEnumInType_27_1_matchtggpattern_black_nac_1B(eNestedType) == null) {
						if (pattern_NestedEnumInType_27_1_matchtggpattern_black_nac_2B(eNestedType) == null) {
							if (pattern_NestedEnumInType_27_1_matchtggpattern_black_nac_3B(eNestedType) == null) {
								return new Object[] { eNestedType, eOuterType };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnumInType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedEnumInType_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_0BBBBB(TEnum tEnum,
			TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedType.equals(tOuterType)) {
			TAnnotatable __DEC_tEnum_tAnnotated_999331 = tEnum.getTAnnotated();
			if (__DEC_tEnum_tAnnotated_999331 != null) {
				if (!typeGraph.equals(__DEC_tEnum_tAnnotated_999331)) {
					if (!tNestedType.equals(__DEC_tEnum_tAnnotated_999331)) {
						if (!tOuterType.equals(__DEC_tEnum_tAnnotated_999331)) {
							if (!tOuterPackage.equals(__DEC_tEnum_tAnnotated_999331)) {
								return new Object[] { tEnum, typeGraph, tNestedType, tOuterType, tOuterPackage };
							}
						}
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_1BB(TClass tNestedType,
			TPackage tOuterPackage) {
		for (TPackage __DEC_tNestedType_classes_209968 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TPackage.class, "classes")) {
			if (!tOuterPackage.equals(__DEC_tNestedType_classes_209968)) {
				return new Object[] { tNestedType, tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_2BB(TClass tNestedType,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tNestedType_classes_52556 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tNestedType_classes_52556)) {
				return new Object[] { tNestedType, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_3BB(TClass tNestedType,
			TAbstractType tOuterType) {
		if (!tNestedType.equals(tOuterType)) {
			TAbstractType __DEC_tNestedType_innerTypes_698155 = tNestedType.getOuterType();
			if (__DEC_tNestedType_innerTypes_698155 != null) {
				if (!tNestedType.equals(__DEC_tNestedType_innerTypes_698155)) {
					if (!tOuterType.equals(__DEC_tNestedType_innerTypes_698155)) {
						return new Object[] { tNestedType, tOuterType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_4BB(TClass tNestedType,
			TPackage tOuterPackage) {
		TPackage __DEC_tNestedType_allTypes_225542 = tNestedType.getPackage();
		if (__DEC_tNestedType_allTypes_225542 != null) {
			if (!tOuterPackage.equals(__DEC_tNestedType_allTypes_225542)) {
				return new Object[] { tNestedType, tOuterPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_5BB(TEnum tEnum,
			TypeGraph typeGraph) {
		if (typeGraph.equals(tEnum.getTAnnotated())) {
			return new Object[] { tEnum, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_6BB(TEnum tEnum,
			TAbstractType tOuterType) {
		if (tOuterType.equals(tEnum.getTAnnotated())) {
			return new Object[] { tEnum, tOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_7BB(TEnum tEnum,
			TPackage tOuterPackage) {
		if (tOuterPackage.equals(tEnum.getTAnnotated())) {
			return new Object[] { tEnum, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_28_1_matchtggpattern_blackBBBBB(TypeGraph typeGraph,
			TEnum tEnum, TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedType.equals(tOuterType)) {
			if (typeGraph.equals(tOuterPackage.getModel())) {
				if (tOuterPackage.getClasses().contains(tNestedType)) {
					if (tNestedType.getTAnnotation().contains(tEnum)) {
						if (tOuterType.getInnerTypes().contains(tNestedType)) {
							if (tOuterPackage.equals(tOuterType.getPackage())) {
								if (typeGraph.getAllTypes().contains(tOuterType)) {
									if (typeGraph.getClasses().contains(tNestedType)) {
										if (tOuterPackage.getAllTypes().contains(tNestedType)) {
											if (typeGraph.getAllTypes().contains(tNestedType)) {
												if (pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_0BBBBB(
														tEnum, typeGraph, tNestedType, tOuterType,
														tOuterPackage) == null) {
													if (pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_1BB(
															tNestedType, tOuterPackage) == null) {
														if (pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_2BB(
																tNestedType, typeGraph) == null) {
															if (pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_3BB(
																	tNestedType, tOuterType) == null) {
																if (pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_4BB(
																		tNestedType, tOuterPackage) == null) {
																	if (pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_5BB(
																			tEnum, typeGraph) == null) {
																		if (pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_6BB(
																				tEnum, tOuterType) == null) {
																			if (pattern_NestedEnumInType_28_1_matchtggpattern_black_nac_7BB(
																					tEnum, tOuterPackage) == null) {
																				return new Object[] { typeGraph, tEnum,
																						tNestedType, tOuterType,
																						tOuterPackage };
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final boolean pattern_NestedEnumInType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedEnumInType_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_29_1_createresult_blackB(NestedEnumInType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_NestedEnumInType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_NestedEnumInType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tOuterType) {
		if (ruleResult.getTargetObjects().contains(tOuterType)) {
			return new Object[] { ruleResult, tOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TPackage tOuterPackage) {
		if (ruleResult.getTargetObjects().contains(tOuterPackage)) {
			return new Object[] { ruleResult, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eOuterTypeToTOuterInterface) {
		if (ruleResult.getCorrObjects().contains(eOuterTypeToTOuterInterface)) {
			return new Object[] { ruleResult, eOuterTypeToTOuterInterface };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration eOuterType) {
		if (ruleResult.getSourceObjects().contains(eOuterType)) {
			return new Object[] { ruleResult, eOuterType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedEnumInType_29_2_isapplicablecore_blackFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eOuterTypeToTOuterInterfaceList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEOuterTypeToTOuterInterface : eOuterTypeToTOuterInterfaceList.getEntryObjects()) {
				if (tmpEOuterTypeToTOuterInterface instanceof TypeToTAbstractType) {
					TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) tmpEOuterTypeToTOuterInterface;
					TAbstractType tOuterType = eOuterTypeToTOuterInterface.getTarget();
					if (tOuterType != null) {
						Type tmpEOuterType = eOuterTypeToTOuterInterface.getSource();
						if (tmpEOuterType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
							TypeGraph typeGraph = tOuterType.getModel();
							if (typeGraph != null) {
								TPackage tOuterPackage = tOuterType.getPackage();
								if (tOuterPackage != null) {
									if (typeGraph.equals(tOuterPackage.getModel())) {
										if (pattern_NestedEnumInType_29_2_isapplicablecore_black_nac_3BB(ruleResult,
												eOuterTypeToTOuterInterface) == null) {
											if (pattern_NestedEnumInType_29_2_isapplicablecore_black_nac_1BB(ruleResult,
													tOuterType) == null) {
												if (pattern_NestedEnumInType_29_2_isapplicablecore_black_nac_4BB(
														ruleResult, eOuterType) == null) {
													if (pattern_NestedEnumInType_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, typeGraph) == null) {
														if (pattern_NestedEnumInType_29_2_isapplicablecore_black_nac_2BB(
																ruleResult, tOuterPackage) == null) {
															_result.add(new Object[] { eOuterTypeToTOuterInterfaceList,
																	typeGraph, tOuterType, tOuterPackage,
																	eOuterTypeToTOuterInterface, eOuterType,
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

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_29_3_solveCSP_bindingFBBBBBBBB(NestedEnumInType _this,
			IsApplicableMatch isApplicableMatch, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, typeGraph, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface,
					eOuterType, tOuterPackage, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnumInType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnumInType_29_3_solveCSP_bindingAndBlackFBBBBBBBB(NestedEnumInType _this,
			IsApplicableMatch isApplicableMatch, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_NestedEnumInType_29_3_solveCSP_binding = pattern_NestedEnumInType_29_3_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage,
				ruleResult);
		if (result_pattern_NestedEnumInType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnumInType_29_3_solveCSP_binding[0];

			Object[] result_pattern_NestedEnumInType_29_3_solveCSP_black = pattern_NestedEnumInType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_NestedEnumInType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface,
						eOuterType, tOuterPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnumInType_29_4_checkCSP_expressionFBB(NestedEnumInType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnumInType_29_5_checknacs_blackBBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		return new Object[] { typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
	}

	public static final Object[] pattern_NestedEnumInType_29_6_perform_blackBBBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage,
				ruleResult };
	}

	public static final Object[] pattern_NestedEnumInType_29_6_perform_greenFFFBFFBBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		EnumDeclaration eNestedType = JavaFactory.eINSTANCE.createEnumDeclaration();
		ASTNodeToTAnnotatable astNodeToAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TEnum tEnum = BasicFactory.eINSTANCE.createTEnum();
		TClass tNestedType = BasicFactory.eINSTANCE.createTClass();
		Object _localVariable_0 = csp.getValue("eNestedType", "proxy");
		Object _localVariable_1 = csp.getValue("eNestedType", "name");
		Object _localVariable_2 = csp.getValue("tNestedType", "tLib");
		Object _localVariable_3 = csp.getValue("tNestedType", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		eNestedType.setAbstractTypeDeclaration(eOuterType);
		ruleResult.getSourceObjects().add(eNestedType);
		astNodeToAnnotatable.setSource(eNestedType);
		ruleResult.getCorrObjects().add(astNodeToAnnotatable);
		eNestedTypeToTNestedType.setSource(eNestedType);
		ruleResult.getCorrObjects().add(eNestedTypeToTNestedType);
		ruleResult.getTargetObjects().add(tEnum);
		tOuterPackage.getClasses().add(tNestedType);
		tNestedType.getTAnnotation().add(tEnum);
		astNodeToAnnotatable.setTarget(tNestedType);
		tOuterType.getInnerTypes().add(tNestedType);
		typeGraph.getClasses().add(tNestedType);
		tOuterPackage.getAllTypes().add(tNestedType);
		typeGraph.getAllTypes().add(tNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		ruleResult.getTargetObjects().add(tNestedType);
		boolean eNestedType_proxy_prime = (boolean) _localVariable_0;
		String eNestedType_name_prime = (String) _localVariable_1;
		boolean tNestedType_tLib_prime = (boolean) _localVariable_2;
		String tNestedType_tName_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		eNestedType.setProxy(Boolean.valueOf(eNestedType_proxy_prime));
		eNestedType.setName(eNestedType_name_prime);
		tNestedType.setTLib(Boolean.valueOf(tNestedType_tLib_prime));
		tNestedType.setTName(tNestedType_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eNestedType, astNodeToAnnotatable, eNestedTypeToTNestedType, typeGraph, tEnum,
				tNestedType, tOuterType, eOuterType, tOuterPackage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_NestedEnumInType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NestedEnumInTypeImpl
