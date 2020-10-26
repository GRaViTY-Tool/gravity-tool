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

import org.gravity.tgg.modisco.pm.Rules.NestedEnum;
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
 * An implementation of the model object '<em><b>Nested Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NestedEnumImpl extends AbstractRuleImpl implements NestedEnum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getNestedEnum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {

		Object[] result1_black = NestedEnumImpl.pattern_NestedEnum_0_1_initialbindings_blackBBBB(this, match,
				eNestedType, eOuterType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
		}

		Object[] result2_bindingAndBlack = NestedEnumImpl.pattern_NestedEnum_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, eNestedType, eOuterType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (NestedEnumImpl.pattern_NestedEnum_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = NestedEnumImpl.pattern_NestedEnum_0_4_collectelementstobetranslated_blackBBB(match,
					eNestedType, eOuterType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
			}
			NestedEnumImpl.pattern_NestedEnum_0_4_collectelementstobetranslated_greenBBBFF(match, eNestedType,
					eOuterType);
			//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result4_green[4];

			Object[] result5_black = NestedEnumImpl.pattern_NestedEnum_0_5_collectcontextelements_blackBBB(match,
					eNestedType, eOuterType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eNestedType] = " + eNestedType + ", " + "[eOuterType] = " + eOuterType + ".");
			}
			NestedEnumImpl.pattern_NestedEnum_0_5_collectcontextelements_greenBB(match, eOuterType);

			// 
			NestedEnumImpl.pattern_NestedEnum_0_6_registerobjectstomatch_expressionBBBB(this, match, eNestedType,
					eOuterType);
			return NestedEnumImpl.pattern_NestedEnum_0_7_expressionF();
		} else {
			return NestedEnumImpl.pattern_NestedEnum_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = NestedEnumImpl
				.pattern_NestedEnum_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
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
		Object[] result1_green = NestedEnumImpl.pattern_NestedEnum_1_1_performtransformation_greenFBFFBFBFBB(
				eNestedType, typeGraph, tOuterType, tOuterPackage, csp);
		TEnum tAnnotation = (TEnum) result1_green[0];
		TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[2];
		TPackage tNestedPackage = (TPackage) result1_green[3];
		TClass tNestedType = (TClass) result1_green[5];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[7];

		Object[] result2_black = NestedEnumImpl.pattern_NestedEnum_1_2_collecttranslatedelements_blackBBBBBB(
				tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, tNestedType, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[eNestedType] = " + eNestedType + ", " + "[eNestedTypeToTNestedType] = "
					+ eNestedTypeToTNestedType + ", " + "[tNestedPackage] = " + tNestedPackage + ", "
					+ "[tNestedType] = " + tNestedType + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		Object[] result2_green = NestedEnumImpl.pattern_NestedEnum_1_2_collecttranslatedelements_greenFBBBBBB(
				tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, tNestedType, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = NestedEnumImpl.pattern_NestedEnum_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult,
				tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[eNestedType] = " + eNestedType + ", "
					+ "[eNestedTypeToTNestedType] = " + eNestedTypeToTNestedType + ", " + "[tNestedPackage] = "
					+ tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType
					+ ", " + "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
					+ eOuterTypeToTOuterInterface + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}
		NestedEnumImpl.pattern_NestedEnum_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(ruleresult,
				tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				mBodyToTAnnotation, eOuterType, tOuterPackage);
		//nothing EMoflonEdge tNestedPackage__tNestedType____classes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mBodyToTAnnotation__eNestedType____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tNestedType__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tAnnotation__tNestedType____tAnnotated = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge mBodyToTAnnotation__tNestedType____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[29];

		// 
		// 
		NestedEnumImpl.pattern_NestedEnum_1_5_registerobjects_expressionBBBBBBBBBBBBB(this, ruleresult, tAnnotation,
				eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
		return NestedEnumImpl.pattern_NestedEnum_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = NestedEnumImpl
				.pattern_NestedEnum_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NestedEnumImpl.pattern_NestedEnum_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = NestedEnumImpl.pattern_NestedEnum_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		EnumDeclaration eNestedType = (EnumDeclaration) result2_binding[0];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : NestedEnumImpl.pattern_NestedEnum_2_2_corematch_blackBFFBB(eNestedType,
				eOuterType, match)) {
			TAbstractType tOuterType = (TAbstractType) result2_black[1];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[2];
			// ForEach 
			for (Object[] result3_black : NestedEnumImpl.pattern_NestedEnum_2_3_findcontext_blackBFBBBF(eNestedType,
					tOuterType, eOuterTypeToTOuterInterface, eOuterType)) {
				TypeGraph typeGraph = (TypeGraph) result3_black[1];
				TPackage tOuterPackage = (TPackage) result3_black[5];
				Object[] result3_green = NestedEnumImpl.pattern_NestedEnum_2_3_findcontext_greenBBBBBBFFFFFFFFFF(
						eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tOuterType__typeGraph____pg = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tOuterPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = NestedEnumImpl
						.pattern_NestedEnum_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, eNestedType,
								typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eNestedType] = " + eNestedType
							+ ", " + "[typeGraph] = " + typeGraph + ", " + "[tOuterType] = " + tOuterType + ", "
							+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
							+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (NestedEnumImpl.pattern_NestedEnum_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = NestedEnumImpl
							.pattern_NestedEnum_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					NestedEnumImpl.pattern_NestedEnum_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return NestedEnumImpl.pattern_NestedEnum_2_7_expressionFB(ruleresult);
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
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", true, csp);
		var_eNestedType_name.setValue(eNestedType.getName());
		var_eNestedType_name.setType("String");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", true, csp);
		var_eNestedType_proxy.setValue(eNestedType.isProxy());
		var_eNestedType_proxy.setType("Boolean");
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");

		// Create unbound variables
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", csp);
		var_tNestedType_tLib.setType("Boolean");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", csp);
		var_tNestedPackage_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);

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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tAnnotation, EObject eNestedType,
			EObject eNestedTypeToTNestedType, EObject tNestedPackage, EObject typeGraph, EObject tNestedType,
			EObject tOuterType, EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("eNestedType", eNestedType);
		ruleresult.registerObject("eNestedTypeToTNestedType", eNestedTypeToTNestedType);
		ruleresult.registerObject("tNestedPackage", tNestedPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("tOuterType", tOuterType);
		ruleresult.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
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
	public boolean isAppropriate_BWD(Match match, TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {

		Object[] result1_black = NestedEnumImpl.pattern_NestedEnum_10_1_initialbindings_blackBBBBBBBB(this, match,
				tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tNestedPackage] = "
					+ tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType
					+ ", " + "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}

		Object[] result2_bindingAndBlack = NestedEnumImpl.pattern_NestedEnum_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(
				this, match, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnnotation] = " + tAnnotation + ", " + "[tNestedPackage] = "
					+ tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType
					+ ", " + "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (NestedEnumImpl.pattern_NestedEnum_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = NestedEnumImpl.pattern_NestedEnum_10_4_collectelementstobetranslated_blackBBBBBBB(
					match, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[tNestedPackage] = " + tNestedPackage + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", "
						+ "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
			}
			NestedEnumImpl.pattern_NestedEnum_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFFFFF(match,
					tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
			//nothing EMoflonEdge tNestedPackage__tNestedType____classes = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge tNestedType__tAnnotation____tAnnotation = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tAnnotation__tNestedType____tAnnotated = (EMoflonEdge) result4_green[15];
			//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result4_green[16];
			//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result4_green[17];
			//nothing EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result4_green[18];
			//nothing EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result4_green[19];

			Object[] result5_black = NestedEnumImpl.pattern_NestedEnum_10_5_collectcontextelements_blackBBBBBBB(match,
					tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnnotation] = " + tAnnotation + ", " + "[tNestedPackage] = " + tNestedPackage + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType + ", "
						+ "[tOuterType] = " + tOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
			}
			NestedEnumImpl.pattern_NestedEnum_10_5_collectcontextelements_greenBBBBFFFFF(match, typeGraph, tOuterType,
					tOuterPackage);
			//nothing EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge tOuterType__typeGraph____pg = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge tOuterPackage__typeGraph____typeGraph = (EMoflonEdge) result5_green[8];

			// 
			NestedEnumImpl.pattern_NestedEnum_10_6_registerobjectstomatch_expressionBBBBBBBB(this, match, tAnnotation,
					tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
			return NestedEnumImpl.pattern_NestedEnum_10_7_expressionF();
		} else {
			return NestedEnumImpl.pattern_NestedEnum_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = NestedEnumImpl
				.pattern_NestedEnum_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TEnum tAnnotation = (TEnum) result1_bindingAndBlack[0];
		TPackage tNestedPackage = (TPackage) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		TClass tNestedType = (TClass) result1_bindingAndBlack[3];
		TAbstractType tOuterType = (TAbstractType) result1_bindingAndBlack[4];
		TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result1_bindingAndBlack[5];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result1_bindingAndBlack[6];
		TPackage tOuterPackage = (TPackage) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = NestedEnumImpl.pattern_NestedEnum_11_1_performtransformation_greenFFBFBB(tNestedType,
				eOuterType, csp);
		EnumDeclaration eNestedType = (EnumDeclaration) result1_green[0];
		TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result1_green[1];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[3];

		Object[] result2_black = NestedEnumImpl.pattern_NestedEnum_11_2_collecttranslatedelements_blackBBBBBB(
				tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, tNestedType, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = " + tAnnotation
					+ ", " + "[eNestedType] = " + eNestedType + ", " + "[eNestedTypeToTNestedType] = "
					+ eNestedTypeToTNestedType + ", " + "[tNestedPackage] = " + tNestedPackage + ", "
					+ "[tNestedType] = " + tNestedType + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		Object[] result2_green = NestedEnumImpl.pattern_NestedEnum_11_2_collecttranslatedelements_greenFBBBBBB(
				tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, tNestedType, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = NestedEnumImpl.pattern_NestedEnum_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(
				ruleresult, tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType,
				tOuterType, eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tAnnotation] = " + tAnnotation + ", " + "[eNestedType] = " + eNestedType + ", "
					+ "[eNestedTypeToTNestedType] = " + eNestedTypeToTNestedType + ", " + "[tNestedPackage] = "
					+ tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = " + tNestedType
					+ ", " + "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
					+ eOuterTypeToTOuterInterface + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", "
					+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
		}
		NestedEnumImpl.pattern_NestedEnum_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(ruleresult,
				tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				mBodyToTAnnotation, eOuterType, tOuterPackage);
		//nothing EMoflonEdge tNestedPackage__tNestedType____classes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mBodyToTAnnotation__eNestedType____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tNestedType__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tAnnotation__tNestedType____tAnnotated = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge mBodyToTAnnotation__tNestedType____target = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge eOuterType__eNestedType____bodyDeclarations = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = (EMoflonEdge) result3_green[29];

		// 
		// 
		NestedEnumImpl.pattern_NestedEnum_11_5_registerobjects_expressionBBBBBBBBBBBBB(this, ruleresult, tAnnotation,
				eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType, tOuterPackage);
		return NestedEnumImpl.pattern_NestedEnum_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = NestedEnumImpl
				.pattern_NestedEnum_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = NestedEnumImpl.pattern_NestedEnum_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = NestedEnumImpl.pattern_NestedEnum_12_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TEnum tAnnotation = (TEnum) result2_binding[0];
		TPackage tNestedPackage = (TPackage) result2_binding[1];
		TypeGraph typeGraph = (TypeGraph) result2_binding[2];
		TClass tNestedType = (TClass) result2_binding[3];
		TAbstractType tOuterType = (TAbstractType) result2_binding[4];
		TPackage tOuterPackage = (TPackage) result2_binding[5];
		for (Object[] result2_black : NestedEnumImpl.pattern_NestedEnum_12_2_corematch_blackBBBBBFFBB(tAnnotation,
				tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage, match)) {
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[5];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[6];
			// ForEach 
			for (Object[] result3_black : NestedEnumImpl.pattern_NestedEnum_12_3_findcontext_blackBBBBBBBB(tAnnotation,
					tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
					tOuterPackage)) {
				Object[] result3_green = NestedEnumImpl
						.pattern_NestedEnum_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(tAnnotation,
								tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
								eOuterType, tOuterPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge tNestedPackage__tNestedType____classes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tNestedPackage__tNestedType____ownedTypes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tNestedType__tNestedPackage____package = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tOuterPackage__tNestedPackage____subpackage = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tNestedPackage__tOuterPackage____parent = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge typeGraph__tNestedType____ownedTypes = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tNestedType__typeGraph____pg = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge typeGraph__tOuterType____ownedTypes = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tOuterType__typeGraph____pg = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tNestedType__tAnnotation____tAnnotation = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tAnnotation__tNestedType____tAnnotated = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tOuterPackage__tOuterType____ownedTypes = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tOuterType__tOuterPackage____package = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge tOuterType__tNestedType____innerTypes = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge tNestedType__tOuterType____outerType = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge tNestedPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge typeGraph__tNestedType____classes = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge tOuterPackage__typeGraph____typeGraph = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = (EMoflonEdge) result3_green[28];

				Object[] result4_bindingAndBlack = NestedEnumImpl
						.pattern_NestedEnum_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
								eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tAnnotation] = " + tAnnotation
							+ ", " + "[tNestedPackage] = " + tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
							+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
							+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (NestedEnumImpl.pattern_NestedEnum_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = NestedEnumImpl
							.pattern_NestedEnum_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					NestedEnumImpl.pattern_NestedEnum_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return NestedEnumImpl.pattern_NestedEnum_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		match.registerObject("tAnnotation", tAnnotation);
		match.registerObject("tNestedPackage", tNestedPackage);
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tNestedType", tNestedType);
		match.registerObject("tOuterType", tOuterType);
		match.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TEnum tAnnotation,
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", true, csp);
		var_tNestedType_tLib.setValue(tNestedType.isTLib());
		var_tNestedType_tLib.setType("Boolean");
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", true,
				csp);
		var_tNestedPackage_tName.setValue(tNestedPackage.getTName());
		var_tNestedPackage_tName.setType("String");

		// Create unbound variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", csp);
		var_eNestedType_name.setType("String");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", csp);
		var_eNestedType_proxy.setType("Boolean");

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(addSuffix);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tAnnotation", tAnnotation);
		isApplicableMatch.registerObject("tNestedPackage", tNestedPackage);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tAnnotation, EObject eNestedType,
			EObject eNestedTypeToTNestedType, EObject tNestedPackage, EObject typeGraph, EObject tNestedType,
			EObject tOuterType, EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		ruleresult.registerObject("tAnnotation", tAnnotation);
		ruleresult.registerObject("eNestedType", eNestedType);
		ruleresult.registerObject("eNestedTypeToTNestedType", eNestedTypeToTNestedType);
		ruleresult.registerObject("tNestedPackage", tNestedPackage);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("tNestedType", tNestedType);
		ruleresult.registerObject("tOuterType", tOuterType);
		ruleresult.registerObject("eOuterTypeToTOuterInterface", eOuterTypeToTOuterInterface);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("eOuterType", eOuterType);
		ruleresult.registerObject("tOuterPackage", tOuterPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAnnotation").eClass()).equals("basic.TEnum.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tNestedPackage").eClass())
						.equals("basic.TPackage.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tNestedType").eClass())
						.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_71(EMoflonEdge _edge_classes) {

		Object[] result1_bindingAndBlack = NestedEnumImpl
				.pattern_NestedEnum_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = NestedEnumImpl.pattern_NestedEnum_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : NestedEnumImpl
				.pattern_NestedEnum_20_2_testcorematchandDECs_blackFFFFFFB(_edge_classes)) {
			TEnum tAnnotation = (TEnum) result2_black[0];
			TPackage tNestedPackage = (TPackage) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			TClass tNestedType = (TClass) result2_black[3];
			TAbstractType tOuterType = (TAbstractType) result2_black[4];
			TPackage tOuterPackage = (TPackage) result2_black[5];
			Object[] result2_green = NestedEnumImpl.pattern_NestedEnum_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (NestedEnumImpl.pattern_NestedEnum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
					this, match, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage)) {
				// 
				if (NestedEnumImpl.pattern_NestedEnum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = NestedEnumImpl.pattern_NestedEnum_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					NestedEnumImpl.pattern_NestedEnum_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return NestedEnumImpl.pattern_NestedEnum_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_75(EMoflonEdge _edge_abstractTypeDeclaration) {

		Object[] result1_bindingAndBlack = NestedEnumImpl
				.pattern_NestedEnum_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = NestedEnumImpl.pattern_NestedEnum_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : NestedEnumImpl
				.pattern_NestedEnum_21_2_testcorematchandDECs_blackFFB(_edge_abstractTypeDeclaration)) {
			EnumDeclaration eNestedType = (EnumDeclaration) result2_black[0];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = NestedEnumImpl.pattern_NestedEnum_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (NestedEnumImpl.pattern_NestedEnum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, eNestedType, eOuterType)) {
				// 
				if (NestedEnumImpl.pattern_NestedEnum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = NestedEnumImpl.pattern_NestedEnum_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					NestedEnumImpl.pattern_NestedEnum_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return NestedEnumImpl.pattern_NestedEnum_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("NestedEnum");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tName.setValue(__helper.getValue("tNestedType", "tName"));
		var_tNestedType_tName.setType("String");

		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_name.setValue(__helper.getValue("eNestedType", "name"));
		var_eNestedType_name.setType("String");

		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_proxy.setValue(__helper.getValue("eNestedType", "proxy"));
		var_eNestedType_proxy.setType("boolean");

		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tLib.setValue(__helper.getValue("tNestedType", "tLib"));
		var_tNestedType_tLib.setType("boolean");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType", true, csp);
		var_eOuterType_name.setValue(__helper.getValue("eOuterType", "name"));
		var_eOuterType_name.setType("String");

		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage", true, csp);
		var_tNestedPackage_tName.setValue(__helper.getValue("tNestedPackage", "tName"));
		var_tNestedPackage_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		AddSuffix addSuffix2 = new AddSuffix();
		csp.getConstraints().add(addSuffix2);

		eq0.setRuleName("NestedEnum");
		eq0.solve(var_eNestedType_name, var_tNestedType_tName);

		eq1.setRuleName("NestedEnum");
		eq1.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		addSuffix2.setRuleName("NestedEnum");
		addSuffix2.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tNestedType_tName.setBound(false);
			var_tNestedType_tLib.setBound(false);
			var_tNestedPackage_tName.setBound(false);
			eq0.solve(var_eNestedType_name, var_tNestedType_tName);
			eq1.solve(var_eNestedType_proxy, var_tNestedType_tLib);
			addSuffix2.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tNestedType", "tName", var_tNestedType_tName.getValue());
				__helper.setValue("tNestedType", "tLib", var_tNestedType_tLib.getValue());
				__helper.setValue("tNestedPackage", "tName", var_tNestedPackage_tName.getValue());
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
		ruleResult.setRule("NestedEnum");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tName.setValue(__helper.getValue("tNestedType", "tName"));
		var_tNestedType_tName.setType("String");

		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_name.setValue(__helper.getValue("eNestedType", "name"));
		var_eNestedType_name.setType("String");

		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType", true, csp);
		var_eNestedType_proxy.setValue(__helper.getValue("eNestedType", "proxy"));
		var_eNestedType_proxy.setType("boolean");

		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType", true, csp);
		var_tNestedType_tLib.setValue(__helper.getValue("tNestedType", "tLib"));
		var_tNestedType_tLib.setType("boolean");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType", true, csp);
		var_eOuterType_name.setValue(__helper.getValue("eOuterType", "name"));
		var_eOuterType_name.setType("String");

		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage", true, csp);
		var_tNestedPackage_tName.setValue(__helper.getValue("tNestedPackage", "tName"));
		var_tNestedPackage_tName.setType("String");

		AddSuffix addSuffix0 = new AddSuffix();
		csp.getConstraints().add(addSuffix0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		addSuffix0.setRuleName("NestedEnum");
		addSuffix0.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);

		eq1.setRuleName("NestedEnum");
		eq1.solve(var_eNestedType_name, var_tNestedType_tName);

		eq2.setRuleName("NestedEnum");
		eq2.solve(var_eNestedType_proxy, var_tNestedType_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_eNestedType_name.setBound(false);
			var_eNestedType_proxy.setBound(false);
			addSuffix0.solve(var_eOuterType_name, var_literal0, var_tNestedPackage_tName);
			eq1.solve(var_eNestedType_name, var_tNestedType_tName);
			eq2.solve(var_eNestedType_proxy, var_tNestedType_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("eNestedType", "name", var_eNestedType_name.getValue());
				__helper.setValue("eNestedType", "proxy", var_eNestedType_proxy.getValue());
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

		Object[] result1_black = NestedEnumImpl.pattern_NestedEnum_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = NestedEnumImpl.pattern_NestedEnum_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = NestedEnumImpl
				.pattern_NestedEnum_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TEnum tAnnotation = (TEnum) result2_bindingAndBlack[0];
		EnumDeclaration eNestedType = (EnumDeclaration) result2_bindingAndBlack[1];
		TPackage tNestedPackage = (TPackage) result2_bindingAndBlack[2];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[3];
		TClass tNestedType = (TClass) result2_bindingAndBlack[4];
		TAbstractType tOuterType = (TAbstractType) result2_bindingAndBlack[5];
		AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_bindingAndBlack[6];
		TPackage tOuterPackage = (TPackage) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = NestedEnumImpl.pattern_NestedEnum_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
				this, tAnnotation, eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType,
				tOuterPackage, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tAnnotation] = " + tAnnotation + ", " + "[eNestedType] = " + eNestedType + ", "
					+ "[tNestedPackage] = " + tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[tNestedType] = " + tNestedType + ", " + "[tOuterType] = " + tOuterType + ", "
					+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (NestedEnumImpl.pattern_NestedEnum_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : NestedEnumImpl.pattern_NestedEnum_24_5_matchcorrcontext_blackBFBBB(tOuterType,
					eOuterType, sourceMatch, targetMatch)) {
				TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result5_black[1];
				Object[] result5_green = NestedEnumImpl.pattern_NestedEnum_24_5_matchcorrcontext_greenBBBF(
						eOuterTypeToTOuterInterface, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = NestedEnumImpl.pattern_NestedEnum_24_6_createcorrespondence_blackBBBBBBBBB(
						tAnnotation, eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType,
						tOuterPackage, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnnotation] = "
							+ tAnnotation + ", " + "[eNestedType] = " + eNestedType + ", " + "[tNestedPackage] = "
							+ tNestedPackage + ", " + "[typeGraph] = " + typeGraph + ", " + "[tNestedType] = "
							+ tNestedType + ", " + "[tOuterType] = " + tOuterType + ", " + "[eOuterType] = "
							+ eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ", " + "[ccMatch] = " + ccMatch
							+ ".");
				}
				NestedEnumImpl.pattern_NestedEnum_24_6_createcorrespondence_greenBFBFB(eNestedType, tNestedType,
						ccMatch);
				//nothing TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[1];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[3];

				Object[] result7_black = NestedEnumImpl.pattern_NestedEnum_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				NestedEnumImpl.pattern_NestedEnum_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return NestedEnumImpl.pattern_NestedEnum_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TEnum tAnnotation, EnumDeclaration eNestedType, TPackage tNestedPackage,
			TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", true, csp);
		var_eNestedType_name.setValue(eNestedType.getName());
		var_eNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", true, csp);
		var_tNestedType_tName.setValue(tNestedType.getTName());
		var_tNestedType_tName.setType("String");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", true, csp);
		var_eNestedType_proxy.setValue(eNestedType.isProxy());
		var_eNestedType_proxy.setType("Boolean");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", true, csp);
		var_tNestedType_tLib.setValue(tNestedType.isTLib());
		var_tNestedType_tLib.setType("Boolean");
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", true,
				csp);
		var_tNestedPackage_tName.setValue(tNestedPackage.getTName());
		var_tNestedPackage_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(addSuffix);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);
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
		Object[] result1_black = NestedEnumImpl.pattern_NestedEnum_27_1_matchtggpattern_blackBB(eNestedType,
				eOuterType);
		if (result1_black != null) {
			return NestedEnumImpl.pattern_NestedEnum_27_2_expressionF();
		} else {
			return NestedEnumImpl.pattern_NestedEnum_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {// 
		Object[] result1_black = NestedEnumImpl.pattern_NestedEnum_28_1_matchtggpattern_blackBBBBBB(tAnnotation,
				tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result1_black != null) {
			return NestedEnumImpl.pattern_NestedEnum_28_2_expressionF();
		} else {
			return NestedEnumImpl.pattern_NestedEnum_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eOuterTypeToTOuterInterfaceParameter) {

		Object[] result1_black = NestedEnumImpl.pattern_NestedEnum_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = NestedEnumImpl.pattern_NestedEnum_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : NestedEnumImpl
				.pattern_NestedEnum_29_2_isapplicablecore_blackFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eOuterTypeToTOuterInterfaceList = (RuleEntryList) result2_black[0];
			TypeGraph typeGraph = (TypeGraph) result2_black[1];
			TAbstractType tOuterType = (TAbstractType) result2_black[2];
			TPackage tOuterPackage = (TPackage) result2_black[3];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result2_black[4];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result2_black[5];

			Object[] result3_bindingAndBlack = NestedEnumImpl.pattern_NestedEnum_29_3_solveCSP_bindingAndBlackFBBBBBBBB(
					this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
					tOuterPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeGraph] = " + typeGraph + ", "
						+ "[tOuterType] = " + tOuterType + ", " + "[eOuterTypeToTOuterInterface] = "
						+ eOuterTypeToTOuterInterface + ", " + "[eOuterType] = " + eOuterType + ", "
						+ "[tOuterPackage] = " + tOuterPackage + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (NestedEnumImpl.pattern_NestedEnum_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = NestedEnumImpl.pattern_NestedEnum_29_5_checknacs_blackBBBBB(typeGraph,
						tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
				if (result5_black != null) {

					Object[] result6_black = NestedEnumImpl.pattern_NestedEnum_29_6_perform_blackBBBBBB(typeGraph,
							tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeGraph] = "
								+ typeGraph + ", " + "[tOuterType] = " + tOuterType + ", "
								+ "[eOuterTypeToTOuterInterface] = " + eOuterTypeToTOuterInterface + ", "
								+ "[eOuterType] = " + eOuterType + ", " + "[tOuterPackage] = " + tOuterPackage + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					NestedEnumImpl.pattern_NestedEnum_29_6_perform_greenFFFFBFBFBBBB(typeGraph, tOuterType, eOuterType,
							tOuterPackage, ruleResult, csp);
					//nothing TEnum tAnnotation = (TEnum) result6_green[0];
					//nothing EnumDeclaration eNestedType = (EnumDeclaration) result6_green[1];
					//nothing TypeToTAbstractType eNestedTypeToTNestedType = (TypeToTAbstractType) result6_green[2];
					//nothing TPackage tNestedPackage = (TPackage) result6_green[3];
					//nothing TClass tNestedType = (TClass) result6_green[5];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return NestedEnumImpl.pattern_NestedEnum_29_7_expressionFB(ruleResult);
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
		Variable var_eOuterType_name = CSPFactoryHelper.eINSTANCE.createVariable("eOuterType.name", true, csp);
		var_eOuterType_name.setValue(eOuterType.getName());
		var_eOuterType_name.setType("String");

		// Create unbound variables
		Variable var_eNestedType_name = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.name", csp);
		var_eNestedType_name.setType("String");
		Variable var_tNestedType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tName", csp);
		var_tNestedType_tName.setType("String");
		Variable var_eNestedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("eNestedType.proxy", csp);
		var_eNestedType_proxy.setType("Boolean");
		Variable var_tNestedType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tNestedType.tLib", csp);
		var_tNestedType_tLib.setType("Boolean");
		Variable var_tNestedPackage_tName = CSPFactoryHelper.eINSTANCE.createVariable("tNestedPackage.tName", csp);
		var_tNestedPackage_tName.setType("String");

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(addSuffix);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_eOuterType_name, literal0, var_tNestedPackage_tName);
		eq.setRuleName("NoRuleName");
		eq.solve(var_eNestedType_name, var_tNestedType_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_eNestedType_proxy, var_tNestedType_tLib);

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
		case RulesPackage.NESTED_ENUM___IS_APPROPRIATE_FWD__MATCH_ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.NESTED_ENUM___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NESTED_ENUM___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.NESTED_ENUM___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.NESTED_ENUM___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.NESTED_ENUM___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NESTED_ENUM___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ENUMDECLARATION_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(TypeGraph) arguments.get(2), (TAbstractType) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (AbstractTypeDeclaration) arguments.get(5),
					(TPackage) arguments.get(6));
		case RulesPackage.NESTED_ENUM___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.NESTED_ENUM___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.NESTED_ENUM___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.NESTED_ENUM___IS_APPROPRIATE_BWD__MATCH_TENUM_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TPACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (TEnum) arguments.get(1), (TPackage) arguments.get(2),
					(TypeGraph) arguments.get(3), (TClass) arguments.get(4), (TAbstractType) arguments.get(5),
					(TPackage) arguments.get(6));
		case RulesPackage.NESTED_ENUM___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.NESTED_ENUM___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.NESTED_ENUM___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TENUM_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TPACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TEnum) arguments.get(1), (TPackage) arguments.get(2),
					(TypeGraph) arguments.get(3), (TClass) arguments.get(4), (TAbstractType) arguments.get(5),
					(TPackage) arguments.get(6));
			return null;
		case RulesPackage.NESTED_ENUM___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TENUM_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TPACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TEnum) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3), (TClass) arguments.get(4),
					(TAbstractType) arguments.get(5), (TPackage) arguments.get(6));
		case RulesPackage.NESTED_ENUM___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NESTED_ENUM___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TENUM_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TEnum) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3), (TClass) arguments.get(4),
					(TAbstractType) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(AbstractTypeDeclaration) arguments.get(7), (TPackage) arguments.get(8));
		case RulesPackage.NESTED_ENUM___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.NESTED_ENUM___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.NESTED_ENUM___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.NESTED_ENUM___IS_APPROPRIATE_BWD_EMOFLON_EDGE_71__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_71((EMoflonEdge) arguments.get(0));
		case RulesPackage.NESTED_ENUM___IS_APPROPRIATE_FWD_EMOFLON_EDGE_75__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_75((EMoflonEdge) arguments.get(0));
		case RulesPackage.NESTED_ENUM___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.NESTED_ENUM___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.NESTED_ENUM___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.NESTED_ENUM___IS_APPLICABLE_SOLVE_CSP_CC__TENUM_ENUMDECLARATION_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TEnum) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(TPackage) arguments.get(2), (TypeGraph) arguments.get(3), (TClass) arguments.get(4),
					(TAbstractType) arguments.get(5), (AbstractTypeDeclaration) arguments.get(6),
					(TPackage) arguments.get(7), (Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.NESTED_ENUM___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.NESTED_ENUM___CHECK_DEC_FWD__ENUMDECLARATION_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((EnumDeclaration) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.NESTED_ENUM___CHECK_DEC_BWD__TENUM_TPACKAGE_TYPEGRAPH_TCLASS_TABSTRACTTYPE_TPACKAGE:
			return checkDEC_BWD((TEnum) arguments.get(0), (TPackage) arguments.get(1), (TypeGraph) arguments.get(2),
					(TClass) arguments.get(3), (TAbstractType) arguments.get(4), (TPackage) arguments.get(5));
		case RulesPackage.NESTED_ENUM___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.NESTED_ENUM___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TABSTRACTTYPE_TYPETOTABSTRACTTYPE_ABSTRACTTYPEDECLARATION_TPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(AbstractTypeDeclaration) arguments.get(4), (TPackage) arguments.get(5),
					(ModelgeneratorRuleResult) arguments.get(6));
		case RulesPackage.NESTED_ENUM___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_NestedEnum_0_1_initialbindings_blackBBBB(NestedEnum _this, Match match,
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { _this, match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_0_2_SolveCSP_bindingFBBBB(NestedEnum _this, Match match,
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eNestedType, eOuterType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnum_0_2_SolveCSP_bindingAndBlackFBBBB(NestedEnum _this, Match match,
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		Object[] result_pattern_NestedEnum_0_2_SolveCSP_binding = pattern_NestedEnum_0_2_SolveCSP_bindingFBBBB(_this,
				match, eNestedType, eOuterType);
		if (result_pattern_NestedEnum_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnum_0_2_SolveCSP_binding[0];

			Object[] result_pattern_NestedEnum_0_2_SolveCSP_black = pattern_NestedEnum_0_2_SolveCSP_blackB(csp);
			if (result_pattern_NestedEnum_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eNestedType, eOuterType };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnum_0_3_CheckCSP_expressionFBB(NestedEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_0_4_collectelementstobetranslated_blackBBB(Match match,
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_0_4_collectelementstobetranslated_greenBBBFF(Match match,
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

	public static final Object[] pattern_NestedEnum_0_5_collectcontextelements_blackBBB(Match match,
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			return new Object[] { match, eNestedType, eOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_0_5_collectcontextelements_greenBB(Match match,
			AbstractTypeDeclaration eOuterType) {
		match.getContextNodes().add(eOuterType);
		return new Object[] { match, eOuterType };
	}

	public static final void pattern_NestedEnum_0_6_registerobjectstomatch_expressionBBBB(NestedEnum _this, Match match,
			EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		_this.registerObjectsToMatch_FWD(match, eNestedType, eOuterType);

	}

	public static final boolean pattern_NestedEnum_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedEnum_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_1_1_performtransformation_bindingFFFFFFB(
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

	public static final Object[] pattern_NestedEnum_1_1_performtransformation_blackBBBBBBFBB(
			EnumDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			NestedEnum _this, IsApplicableMatch isApplicableMatch) {
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

	public static final Object[] pattern_NestedEnum_1_1_performtransformation_bindingAndBlackFFFFFFFBB(NestedEnum _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_NestedEnum_1_1_performtransformation_binding = pattern_NestedEnum_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_NestedEnum_1_1_performtransformation_binding != null) {
			EnumDeclaration eNestedType = (EnumDeclaration) result_pattern_NestedEnum_1_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_NestedEnum_1_1_performtransformation_binding[1];
			TAbstractType tOuterType = (TAbstractType) result_pattern_NestedEnum_1_1_performtransformation_binding[2];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result_pattern_NestedEnum_1_1_performtransformation_binding[3];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_NestedEnum_1_1_performtransformation_binding[4];
			TPackage tOuterPackage = (TPackage) result_pattern_NestedEnum_1_1_performtransformation_binding[5];

			Object[] result_pattern_NestedEnum_1_1_performtransformation_black = pattern_NestedEnum_1_1_performtransformation_blackBBBBBBFBB(
					eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, _this,
					isApplicableMatch);
			if (result_pattern_NestedEnum_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_NestedEnum_1_1_performtransformation_black[6];

				return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
						tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_1_1_performtransformation_greenFBFFBFBFBB(
			EnumDeclaration eNestedType, TypeGraph typeGraph, TAbstractType tOuterType, TPackage tOuterPackage,
			CSP csp) {
		TEnum tAnnotation = BasicFactory.eINSTANCE.createTEnum();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TPackage tNestedPackage = BasicFactory.eINSTANCE.createTPackage();
		TClass tNestedType = BasicFactory.eINSTANCE.createTClass();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		Object _localVariable_0 = csp.getValue("tNestedPackage", "tName");
		Object _localVariable_1 = csp.getValue("tNestedType", "tName");
		Object _localVariable_2 = csp.getValue("tNestedType", "tLib");
		eNestedTypeToTNestedType.setSource(eNestedType);
		tOuterPackage.getSubpackage().add(tNestedPackage);
		tNestedPackage.setTypeGraph(typeGraph);
		tNestedPackage.getClasses().add(tNestedType);
		tNestedPackage.getOwnedTypes().add(tNestedType);
		typeGraph.getOwnedTypes().add(tNestedType);
		tNestedType.getTAnnotation().add(tAnnotation);
		tOuterType.getInnerTypes().add(tNestedType);
		typeGraph.getClasses().add(tNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		String tNestedPackage_tName_prime = (String) _localVariable_0;
		String tNestedType_tName_prime = (String) _localVariable_1;
		boolean tNestedType_tLib_prime = (boolean) _localVariable_2;
		tNestedPackage.setTName(tNestedPackage_tName_prime);
		tNestedType.setTName(tNestedType_tName_prime);
		tNestedType.setTLib(Boolean.valueOf(tNestedType_tLib_prime));
		return new Object[] { tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph,
				tNestedType, tOuterType, mBodyToTAnnotation, tOuterPackage, csp };
	}

	public static final Object[] pattern_NestedEnum_1_2_collecttranslatedelements_blackBBBBBB(TEnum tAnnotation,
			EnumDeclaration eNestedType, TypeToTAbstractType eNestedTypeToTNestedType, TPackage tNestedPackage,
			TClass tNestedType, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, tNestedType,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_NestedEnum_1_2_collecttranslatedelements_greenFBBBBBB(TEnum tAnnotation,
			EnumDeclaration eNestedType, TypeToTAbstractType eNestedTypeToTNestedType, TPackage tNestedPackage,
			TClass tNestedType, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tAnnotation);
		ruleresult.getTranslatedElements().add(eNestedType);
		ruleresult.getCreatedLinkElements().add(eNestedTypeToTNestedType);
		ruleresult.getCreatedElements().add(tNestedPackage);
		ruleresult.getCreatedElements().add(tNestedType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage,
				tNestedType, mBodyToTAnnotation };
	}

	public static final Object[] pattern_NestedEnum_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject eNestedType, EObject eNestedTypeToTNestedType,
			EObject tNestedPackage, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		if (!tAnnotation.equals(tNestedPackage)) {
			if (!tAnnotation.equals(typeGraph)) {
				if (!tAnnotation.equals(tNestedType)) {
					if (!tAnnotation.equals(tOuterType)) {
						if (!tAnnotation.equals(tOuterPackage)) {
							if (!eNestedType.equals(tAnnotation)) {
								if (!eNestedType.equals(eNestedTypeToTNestedType)) {
									if (!eNestedType.equals(tNestedPackage)) {
										if (!eNestedType.equals(typeGraph)) {
											if (!eNestedType.equals(tNestedType)) {
												if (!eNestedType.equals(tOuterType)) {
													if (!eNestedType.equals(eOuterTypeToTOuterInterface)) {
														if (!eNestedType.equals(mBodyToTAnnotation)) {
															if (!eNestedType.equals(eOuterType)) {
																if (!eNestedType.equals(tOuterPackage)) {
																	if (!eNestedTypeToTNestedType.equals(tAnnotation)) {
																		if (!eNestedTypeToTNestedType
																				.equals(tNestedPackage)) {
																			if (!eNestedTypeToTNestedType
																					.equals(typeGraph)) {
																				if (!eNestedTypeToTNestedType
																						.equals(tNestedType)) {
																					if (!eNestedTypeToTNestedType
																							.equals(tOuterType)) {
																						if (!eNestedTypeToTNestedType
																								.equals(eOuterTypeToTOuterInterface)) {
																							if (!eNestedTypeToTNestedType
																									.equals(mBodyToTAnnotation)) {
																								if (!eNestedTypeToTNestedType
																										.equals(eOuterType)) {
																									if (!eNestedTypeToTNestedType
																											.equals(tOuterPackage)) {
																										if (!tNestedPackage
																												.equals(typeGraph)) {
																											if (!tNestedPackage
																													.equals(tNestedType)) {
																												if (!tNestedPackage
																														.equals(tOuterType)) {
																													if (!tNestedPackage
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
																																				.equals(tAnnotation)) {
																																			if (!eOuterTypeToTOuterInterface
																																					.equals(tNestedPackage)) {
																																				if (!eOuterTypeToTOuterInterface
																																						.equals(typeGraph)) {
																																					if (!eOuterTypeToTOuterInterface
																																							.equals(tNestedType)) {
																																						if (!eOuterTypeToTOuterInterface
																																								.equals(tOuterType)) {
																																							if (!eOuterTypeToTOuterInterface
																																									.equals(mBodyToTAnnotation)) {
																																								if (!eOuterTypeToTOuterInterface
																																										.equals(tOuterPackage)) {
																																									if (!mBodyToTAnnotation
																																											.equals(tAnnotation)) {
																																										if (!mBodyToTAnnotation
																																												.equals(tNestedPackage)) {
																																											if (!mBodyToTAnnotation
																																													.equals(typeGraph)) {
																																												if (!mBodyToTAnnotation
																																														.equals(tNestedType)) {
																																													if (!mBodyToTAnnotation
																																															.equals(tOuterType)) {
																																														if (!mBodyToTAnnotation
																																																.equals(tOuterPackage)) {
																																															if (!eOuterType
																																																	.equals(tAnnotation)) {
																																																if (!eOuterType
																																																		.equals(tNestedPackage)) {
																																																	if (!eOuterType
																																																			.equals(typeGraph)) {
																																																		if (!eOuterType
																																																				.equals(tNestedType)) {
																																																			if (!eOuterType
																																																					.equals(tOuterType)) {
																																																				if (!eOuterType
																																																						.equals(eOuterTypeToTOuterInterface)) {
																																																					if (!eOuterType
																																																							.equals(mBodyToTAnnotation)) {
																																																						if (!eOuterType
																																																								.equals(tOuterPackage)) {
																																																							if (!tOuterPackage
																																																									.equals(typeGraph)) {
																																																								if (!tOuterPackage
																																																										.equals(tOuterType)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											tAnnotation,
																																																											eNestedType,
																																																											eNestedTypeToTNestedType,
																																																											tNestedPackage,
																																																											typeGraph,
																																																											tNestedType,
																																																											tOuterType,
																																																											eOuterTypeToTOuterInterface,
																																																											mBodyToTAnnotation,
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
											}
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

	public static final Object[] pattern_NestedEnum_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject eNestedType, EObject eNestedTypeToTNestedType,
			EObject tNestedPackage, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject mBodyToTAnnotation, EObject eOuterType, EObject tOuterPackage) {
		EMoflonEdge tNestedPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tNestedType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "NestedEnum";
		String tNestedPackage__tNestedType____classes_name_prime = "classes";
		String mBodyToTAnnotation__eNestedType____source_name_prime = "source";
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tNestedType__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tNestedType____tAnnotated_name_prime = "tAnnotated";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String mBodyToTAnnotation__tNestedType____target_name_prime = "target";
		String eNestedTypeToTNestedType__eNestedType____source_name_prime = "source";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		String eNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		tNestedPackage__tNestedType____classes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tNestedPackage__tNestedType____classes);
		mBodyToTAnnotation__eNestedType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eNestedType____source);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		ruleresult.getCreatedEdges().add(tNestedType__tNestedPackage____package);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		ruleresult.getCreatedEdges().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getCreatedEdges().add(tNestedPackage__tOuterPackage____parent);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tNestedType__typeGraph____pg);
		tNestedType__tAnnotation____tAnnotation.setSrc(tNestedType);
		tNestedType__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getCreatedEdges().add(tNestedType__tAnnotation____tAnnotation);
		tAnnotation__tNestedType____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tNestedType____tAnnotated.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tAnnotation__tNestedType____tAnnotated);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		ruleresult.getCreatedEdges().add(tNestedType__tOuterType____outerType);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tNestedPackage__typeGraph____typeGraph);
		mBodyToTAnnotation__tNestedType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tNestedType____target);
		eNestedTypeToTNestedType__eNestedType____source.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__eNestedType____source);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		ruleresult.getTranslatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		ruleresult.getTranslatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(typeGraph__tNestedType____classes);
		eNestedTypeToTNestedType__tNestedType____target.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__tNestedType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tNestedPackage__tNestedType____classes.setName(tNestedPackage__tNestedType____classes_name_prime);
		mBodyToTAnnotation__eNestedType____source.setName(mBodyToTAnnotation__eNestedType____source_name_prime);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tNestedType__tAnnotation____tAnnotation.setName(tNestedType__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tNestedType____tAnnotated.setName(tAnnotation__tNestedType____tAnnotated_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		mBodyToTAnnotation__tNestedType____target.setName(mBodyToTAnnotation__tNestedType____target_name_prime);
		eNestedTypeToTNestedType__eNestedType____source
				.setName(eNestedTypeToTNestedType__eNestedType____source_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		eNestedTypeToTNestedType__tNestedType____target
				.setName(eNestedTypeToTNestedType__tNestedType____target_name_prime);
		return new Object[] { ruleresult, tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph,
				tNestedType, tOuterType, mBodyToTAnnotation, eOuterType, tOuterPackage,
				tNestedPackage__tNestedType____classes, mBodyToTAnnotation__eNestedType____source,
				tNestedPackage__tNestedType____ownedTypes, tNestedType__tNestedPackage____package,
				tOuterPackage__tNestedPackage____subpackage, tNestedPackage__tOuterPackage____parent,
				typeGraph__tNestedType____ownedTypes, tNestedType__typeGraph____pg,
				tNestedType__tAnnotation____tAnnotation, tAnnotation__tNestedType____tAnnotated,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				tNestedPackage__typeGraph____typeGraph, mBodyToTAnnotation__tNestedType____target,
				eNestedTypeToTNestedType__eNestedType____source, eNestedType__eOuterType____abstractTypeDeclaration,
				eOuterType__eNestedType____bodyDeclarations, typeGraph__tNestedType____classes,
				eNestedTypeToTNestedType__tNestedType____target };
	}

	public static final void pattern_NestedEnum_1_5_registerobjects_expressionBBBBBBBBBBBBB(NestedEnum _this,
			PerformRuleResult ruleresult, EObject tAnnotation, EObject eNestedType, EObject eNestedTypeToTNestedType,
			EObject tNestedPackage, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		_this.registerObjects_FWD(ruleresult, tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage,
				typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType,
				tOuterPackage);

	}

	public static final PerformRuleResult pattern_NestedEnum_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedEnum_2_1_preparereturnvalue_bindingFB(NestedEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_2_1_preparereturnvalue_blackFBB(EClass eClass, NestedEnum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_2_1_preparereturnvalue_bindingAndBlackFFB(NestedEnum _this) {
		Object[] result_pattern_NestedEnum_2_1_preparereturnvalue_binding = pattern_NestedEnum_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedEnum_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_NestedEnum_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedEnum_2_1_preparereturnvalue_black = pattern_NestedEnum_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_NestedEnum_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_NestedEnum_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "NestedEnum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_NestedEnum_2_2_corematch_bindingFFB(Match match) {
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

	public static final Iterable<Object[]> pattern_NestedEnum_2_2_corematch_blackBFFBB(EnumDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType, Match match) {
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

	public static final Iterable<Object[]> pattern_NestedEnum_2_3_findcontext_blackBFBBBF(EnumDeclaration eNestedType,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eNestedType.equals(eOuterType)) {
			if (eOuterType.equals(eOuterTypeToTOuterInterface.getSource())) {
				if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
					if (tOuterType.equals(eOuterTypeToTOuterInterface.getTarget())) {
						TypeGraph typeGraph = tOuterType.getPg();
						if (typeGraph != null) {
							TPackage tOuterPackage = tOuterType.getPackage();
							if (tOuterPackage != null) {
								if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
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

	public static final Object[] pattern_NestedEnum_2_3_findcontext_greenBBBBBBFFFFFFFFFF(EnumDeclaration eNestedType,
			TypeGraph typeGraph, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eOuterTypeToTOuterInterface__eOuterType____source_name_prime = "source";
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String tOuterPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String eOuterTypeToTOuterInterface__tOuterType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		eOuterTypeToTOuterInterface__eOuterType____source.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__eOuterType____source.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__eOuterType____source);
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____pg.setSrc(tOuterType);
		tOuterType__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType__typeGraph____pg);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterType____ownedTypes);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterType__tOuterPackage____package);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		isApplicableMatch.getAllContextElements().add(eOuterType__eNestedType____bodyDeclarations);
		tOuterPackage__typeGraph____typeGraph.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__typeGraph____typeGraph);
		eOuterTypeToTOuterInterface__tOuterType____target.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__tOuterType____target.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__tOuterType____target);
		eOuterTypeToTOuterInterface__eOuterType____source
				.setName(eOuterTypeToTOuterInterface__eOuterType____source_name_prime);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____pg.setName(tOuterType__typeGraph____pg_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		tOuterPackage__typeGraph____typeGraph.setName(tOuterPackage__typeGraph____typeGraph_name_prime);
		eOuterTypeToTOuterInterface__tOuterType____target
				.setName(eOuterTypeToTOuterInterface__tOuterType____target_name_prime);
		return new Object[] { eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage, isApplicableMatch, eOuterTypeToTOuterInterface__eOuterType____source,
				typeGraph__tOuterType____ownedTypes, tOuterType__typeGraph____pg,
				tOuterPackage__tOuterType____ownedTypes, tOuterType__tOuterPackage____package,
				eNestedType__eOuterType____abstractTypeDeclaration, eOuterType__eNestedType____bodyDeclarations,
				tOuterPackage__typeGraph____typeGraph, eOuterTypeToTOuterInterface__tOuterType____target };
	}

	public static final Object[] pattern_NestedEnum_2_4_solveCSP_bindingFBBBBBBBB(NestedEnum _this,
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

	public static final Object[] pattern_NestedEnum_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnum_2_4_solveCSP_bindingAndBlackFBBBBBBBB(NestedEnum _this,
			IsApplicableMatch isApplicableMatch, EnumDeclaration eNestedType, TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_NestedEnum_2_4_solveCSP_binding = pattern_NestedEnum_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, eNestedType, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType,
				tOuterPackage);
		if (result_pattern_NestedEnum_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnum_2_4_solveCSP_binding[0];

			Object[] result_pattern_NestedEnum_2_4_solveCSP_black = pattern_NestedEnum_2_4_solveCSP_blackB(csp);
			if (result_pattern_NestedEnum_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eNestedType, typeGraph, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnum_2_5_checkCSP_expressionFBB(NestedEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_NestedEnum_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NestedEnum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NestedEnum_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedEnum_10_1_initialbindings_blackBBBBBBBB(NestedEnum _this, Match match,
			TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { _this, match, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
						tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_10_2_SolveCSP_bindingFBBBBBBBB(NestedEnum _this, Match match,
			TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnnotation, tNestedPackage, typeGraph,
				tNestedType, tOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
					tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnum_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(NestedEnum _this,
			Match match, TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_NestedEnum_10_2_SolveCSP_binding = pattern_NestedEnum_10_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage);
		if (result_pattern_NestedEnum_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnum_10_2_SolveCSP_binding[0];

			Object[] result_pattern_NestedEnum_10_2_SolveCSP_black = pattern_NestedEnum_10_2_SolveCSP_blackB(csp);
			if (result_pattern_NestedEnum_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnnotation, tNestedPackage, typeGraph, tNestedType,
						tOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnum_10_3_CheckCSP_expressionFBB(NestedEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_10_4_collectelementstobetranslated_blackBBBBBBB(Match match,
			TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { match, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
						tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFFFFF(
			Match match, TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		EMoflonEdge tNestedPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tNestedType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAnnotation);
		match.getToBeTranslatedNodes().add(tNestedPackage);
		match.getToBeTranslatedNodes().add(tNestedType);
		String tNestedPackage__tNestedType____classes_name_prime = "classes";
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tNestedType__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tNestedType____tAnnotated_name_prime = "tAnnotated";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		tNestedPackage__tNestedType____classes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____classes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tNestedPackage__tNestedType____classes);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		match.getToBeTranslatedEdges().add(tNestedType__tNestedPackage____package);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		match.getToBeTranslatedEdges().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		match.getToBeTranslatedEdges().add(tNestedPackage__tOuterPackage____parent);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tNestedType__typeGraph____pg);
		tNestedType__tAnnotation____tAnnotation.setSrc(tNestedType);
		tNestedType__tAnnotation____tAnnotation.setTrg(tAnnotation);
		match.getToBeTranslatedEdges().add(tNestedType__tAnnotation____tAnnotation);
		tAnnotation__tNestedType____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tNestedType____tAnnotated.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tAnnotation__tNestedType____tAnnotated);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		match.getToBeTranslatedEdges().add(tNestedType__tOuterType____outerType);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tNestedPackage__typeGraph____typeGraph);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		match.getToBeTranslatedEdges().add(typeGraph__tNestedType____classes);
		tNestedPackage__tNestedType____classes.setName(tNestedPackage__tNestedType____classes_name_prime);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tNestedType__tAnnotation____tAnnotation.setName(tNestedType__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tNestedType____tAnnotated.setName(tAnnotation__tNestedType____tAnnotated_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		return new Object[] { match, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType, tOuterPackage,
				tNestedPackage__tNestedType____classes, tNestedPackage__tNestedType____ownedTypes,
				tNestedType__tNestedPackage____package, tOuterPackage__tNestedPackage____subpackage,
				tNestedPackage__tOuterPackage____parent, typeGraph__tNestedType____ownedTypes,
				tNestedType__typeGraph____pg, tNestedType__tAnnotation____tAnnotation,
				tAnnotation__tNestedType____tAnnotated, tOuterType__tNestedType____innerTypes,
				tNestedType__tOuterType____outerType, tNestedPackage__typeGraph____typeGraph,
				typeGraph__tNestedType____classes };
	}

	public static final Object[] pattern_NestedEnum_10_5_collectcontextelements_blackBBBBBBB(Match match,
			TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				return new Object[] { match, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
						tOuterPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_10_5_collectcontextelements_greenBBBBFFFFF(Match match,
			TypeGraph typeGraph, TAbstractType tOuterType, TPackage tOuterPackage) {
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tOuterType);
		match.getContextNodes().add(tOuterPackage);
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____pg_name_prime = "pg";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		match.getContextEdges().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____pg.setSrc(tOuterType);
		tOuterType__typeGraph____pg.setTrg(typeGraph);
		match.getContextEdges().add(tOuterType__typeGraph____pg);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		match.getContextEdges().add(tOuterPackage__tOuterType____ownedTypes);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		match.getContextEdges().add(tOuterType__tOuterPackage____package);
		tOuterPackage__typeGraph____typeGraph.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____typeGraph.setTrg(typeGraph);
		match.getContextEdges().add(tOuterPackage__typeGraph____typeGraph);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____pg.setName(tOuterType__typeGraph____pg_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterPackage__typeGraph____typeGraph.setName(tOuterPackage__typeGraph____typeGraph_name_prime);
		return new Object[] { match, typeGraph, tOuterType, tOuterPackage, typeGraph__tOuterType____ownedTypes,
				tOuterType__typeGraph____pg, tOuterPackage__tOuterType____ownedTypes,
				tOuterType__tOuterPackage____package, tOuterPackage__typeGraph____typeGraph };
	}

	public static final void pattern_NestedEnum_10_6_registerobjectstomatch_expressionBBBBBBBB(NestedEnum _this,
			Match match, TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TPackage tOuterPackage) {
		_this.registerObjectsToMatch_BWD(match, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
				tOuterPackage);

	}

	public static final boolean pattern_NestedEnum_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedEnum_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tAnnotation");
		EObject _localVariable_1 = isApplicableMatch.getObject("tNestedPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("tNestedType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tOuterType");
		EObject _localVariable_5 = isApplicableMatch.getObject("eOuterTypeToTOuterInterface");
		EObject _localVariable_6 = isApplicableMatch.getObject("eOuterType");
		EObject _localVariable_7 = isApplicableMatch.getObject("tOuterPackage");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpTNestedPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpTNestedType = _localVariable_3;
		EObject tmpTOuterType = _localVariable_4;
		EObject tmpEOuterTypeToTOuterInterface = _localVariable_5;
		EObject tmpEOuterType = _localVariable_6;
		EObject tmpTOuterPackage = _localVariable_7;
		if (tmpTAnnotation instanceof TEnum) {
			TEnum tAnnotation = (TEnum) tmpTAnnotation;
			if (tmpTNestedPackage instanceof TPackage) {
				TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
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
										return new Object[] { tAnnotation, tNestedPackage, typeGraph, tNestedType,
												tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage,
												isApplicableMatch };
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

	public static final Object[] pattern_NestedEnum_11_1_performtransformation_blackBBBBBBBBFBB(TEnum tAnnotation,
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			NestedEnum _this, IsApplicableMatch isApplicableMatch) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
								eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			NestedEnum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_NestedEnum_11_1_performtransformation_binding = pattern_NestedEnum_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_NestedEnum_11_1_performtransformation_binding != null) {
			TEnum tAnnotation = (TEnum) result_pattern_NestedEnum_11_1_performtransformation_binding[0];
			TPackage tNestedPackage = (TPackage) result_pattern_NestedEnum_11_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_NestedEnum_11_1_performtransformation_binding[2];
			TClass tNestedType = (TClass) result_pattern_NestedEnum_11_1_performtransformation_binding[3];
			TAbstractType tOuterType = (TAbstractType) result_pattern_NestedEnum_11_1_performtransformation_binding[4];
			TypeToTAbstractType eOuterTypeToTOuterInterface = (TypeToTAbstractType) result_pattern_NestedEnum_11_1_performtransformation_binding[5];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_NestedEnum_11_1_performtransformation_binding[6];
			TPackage tOuterPackage = (TPackage) result_pattern_NestedEnum_11_1_performtransformation_binding[7];

			Object[] result_pattern_NestedEnum_11_1_performtransformation_black = pattern_NestedEnum_11_1_performtransformation_blackBBBBBBBBFBB(
					tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface,
					eOuterType, tOuterPackage, _this, isApplicableMatch);
			if (result_pattern_NestedEnum_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_NestedEnum_11_1_performtransformation_black[8];

				return new Object[] { tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
						eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_11_1_performtransformation_greenFFBFBB(TClass tNestedType,
			AbstractTypeDeclaration eOuterType, CSP csp) {
		EnumDeclaration eNestedType = JavaFactory.eINSTANCE.createEnumDeclaration();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		Object _localVariable_0 = csp.getValue("eNestedType", "name");
		Object _localVariable_1 = csp.getValue("eNestedType", "proxy");
		eNestedType.setAbstractTypeDeclaration(eOuterType);
		eNestedTypeToTNestedType.setSource(eNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		String eNestedType_name_prime = (String) _localVariable_0;
		boolean eNestedType_proxy_prime = (boolean) _localVariable_1;
		eNestedType.setName(eNestedType_name_prime);
		eNestedType.setProxy(Boolean.valueOf(eNestedType_proxy_prime));
		return new Object[] { eNestedType, eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation, eOuterType, csp };
	}

	public static final Object[] pattern_NestedEnum_11_2_collecttranslatedelements_blackBBBBBB(TEnum tAnnotation,
			EnumDeclaration eNestedType, TypeToTAbstractType eNestedTypeToTNestedType, TPackage tNestedPackage,
			TClass tNestedType, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, tNestedType,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_NestedEnum_11_2_collecttranslatedelements_greenFBBBBBB(TEnum tAnnotation,
			EnumDeclaration eNestedType, TypeToTAbstractType eNestedTypeToTNestedType, TPackage tNestedPackage,
			TClass tNestedType, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tAnnotation);
		ruleresult.getCreatedElements().add(eNestedType);
		ruleresult.getCreatedLinkElements().add(eNestedTypeToTNestedType);
		ruleresult.getTranslatedElements().add(tNestedPackage);
		ruleresult.getTranslatedElements().add(tNestedType);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage,
				tNestedType, mBodyToTAnnotation };
	}

	public static final Object[] pattern_NestedEnum_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject eNestedType, EObject eNestedTypeToTNestedType,
			EObject tNestedPackage, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		if (!tAnnotation.equals(tNestedPackage)) {
			if (!tAnnotation.equals(typeGraph)) {
				if (!tAnnotation.equals(tNestedType)) {
					if (!tAnnotation.equals(tOuterType)) {
						if (!tAnnotation.equals(tOuterPackage)) {
							if (!eNestedType.equals(tAnnotation)) {
								if (!eNestedType.equals(eNestedTypeToTNestedType)) {
									if (!eNestedType.equals(tNestedPackage)) {
										if (!eNestedType.equals(typeGraph)) {
											if (!eNestedType.equals(tNestedType)) {
												if (!eNestedType.equals(tOuterType)) {
													if (!eNestedType.equals(eOuterTypeToTOuterInterface)) {
														if (!eNestedType.equals(mBodyToTAnnotation)) {
															if (!eNestedType.equals(eOuterType)) {
																if (!eNestedType.equals(tOuterPackage)) {
																	if (!eNestedTypeToTNestedType.equals(tAnnotation)) {
																		if (!eNestedTypeToTNestedType
																				.equals(tNestedPackage)) {
																			if (!eNestedTypeToTNestedType
																					.equals(typeGraph)) {
																				if (!eNestedTypeToTNestedType
																						.equals(tNestedType)) {
																					if (!eNestedTypeToTNestedType
																							.equals(tOuterType)) {
																						if (!eNestedTypeToTNestedType
																								.equals(eOuterTypeToTOuterInterface)) {
																							if (!eNestedTypeToTNestedType
																									.equals(mBodyToTAnnotation)) {
																								if (!eNestedTypeToTNestedType
																										.equals(eOuterType)) {
																									if (!eNestedTypeToTNestedType
																											.equals(tOuterPackage)) {
																										if (!tNestedPackage
																												.equals(typeGraph)) {
																											if (!tNestedPackage
																													.equals(tNestedType)) {
																												if (!tNestedPackage
																														.equals(tOuterType)) {
																													if (!tNestedPackage
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
																																				.equals(tAnnotation)) {
																																			if (!eOuterTypeToTOuterInterface
																																					.equals(tNestedPackage)) {
																																				if (!eOuterTypeToTOuterInterface
																																						.equals(typeGraph)) {
																																					if (!eOuterTypeToTOuterInterface
																																							.equals(tNestedType)) {
																																						if (!eOuterTypeToTOuterInterface
																																								.equals(tOuterType)) {
																																							if (!eOuterTypeToTOuterInterface
																																									.equals(mBodyToTAnnotation)) {
																																								if (!eOuterTypeToTOuterInterface
																																										.equals(tOuterPackage)) {
																																									if (!mBodyToTAnnotation
																																											.equals(tAnnotation)) {
																																										if (!mBodyToTAnnotation
																																												.equals(tNestedPackage)) {
																																											if (!mBodyToTAnnotation
																																													.equals(typeGraph)) {
																																												if (!mBodyToTAnnotation
																																														.equals(tNestedType)) {
																																													if (!mBodyToTAnnotation
																																															.equals(tOuterType)) {
																																														if (!mBodyToTAnnotation
																																																.equals(tOuterPackage)) {
																																															if (!eOuterType
																																																	.equals(tAnnotation)) {
																																																if (!eOuterType
																																																		.equals(tNestedPackage)) {
																																																	if (!eOuterType
																																																			.equals(typeGraph)) {
																																																		if (!eOuterType
																																																				.equals(tNestedType)) {
																																																			if (!eOuterType
																																																					.equals(tOuterType)) {
																																																				if (!eOuterType
																																																						.equals(eOuterTypeToTOuterInterface)) {
																																																					if (!eOuterType
																																																							.equals(mBodyToTAnnotation)) {
																																																						if (!eOuterType
																																																								.equals(tOuterPackage)) {
																																																							if (!tOuterPackage
																																																									.equals(typeGraph)) {
																																																								if (!tOuterPackage
																																																										.equals(tOuterType)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											tAnnotation,
																																																											eNestedType,
																																																											eNestedTypeToTNestedType,
																																																											tNestedPackage,
																																																											typeGraph,
																																																											tNestedType,
																																																											tOuterType,
																																																											eOuterTypeToTOuterInterface,
																																																											mBodyToTAnnotation,
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
											}
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

	public static final Object[] pattern_NestedEnum_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tAnnotation, EObject eNestedType, EObject eNestedTypeToTNestedType,
			EObject tNestedPackage, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject mBodyToTAnnotation, EObject eOuterType, EObject tOuterPackage) {
		EMoflonEdge tNestedPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tNestedType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__eNestedType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedType__eOuterType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterType__eNestedType____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eNestedTypeToTNestedType__tNestedType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "NestedEnum";
		String tNestedPackage__tNestedType____classes_name_prime = "classes";
		String mBodyToTAnnotation__eNestedType____source_name_prime = "source";
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String tNestedType__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tNestedType____tAnnotated_name_prime = "tAnnotated";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String mBodyToTAnnotation__tNestedType____target_name_prime = "target";
		String eNestedTypeToTNestedType__eNestedType____source_name_prime = "source";
		String eNestedType__eOuterType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String eOuterType__eNestedType____bodyDeclarations_name_prime = "bodyDeclarations";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		String eNestedTypeToTNestedType__tNestedType____target_name_prime = "target";
		tNestedPackage__tNestedType____classes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tNestedPackage__tNestedType____classes);
		mBodyToTAnnotation__eNestedType____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__eNestedType____source);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		ruleresult.getTranslatedEdges().add(tNestedType__tNestedPackage____package);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		ruleresult.getTranslatedEdges().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		ruleresult.getTranslatedEdges().add(tNestedPackage__tOuterPackage____parent);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tNestedType__typeGraph____pg);
		tNestedType__tAnnotation____tAnnotation.setSrc(tNestedType);
		tNestedType__tAnnotation____tAnnotation.setTrg(tAnnotation);
		ruleresult.getTranslatedEdges().add(tNestedType__tAnnotation____tAnnotation);
		tAnnotation__tNestedType____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tNestedType____tAnnotated.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tAnnotation__tNestedType____tAnnotated);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		ruleresult.getTranslatedEdges().add(tNestedType__tOuterType____outerType);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tNestedPackage__typeGraph____typeGraph);
		mBodyToTAnnotation__tNestedType____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tNestedType____target);
		eNestedTypeToTNestedType__eNestedType____source.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__eNestedType____source.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__eNestedType____source);
		eNestedType__eOuterType____abstractTypeDeclaration.setSrc(eNestedType);
		eNestedType__eOuterType____abstractTypeDeclaration.setTrg(eOuterType);
		ruleresult.getCreatedEdges().add(eNestedType__eOuterType____abstractTypeDeclaration);
		eOuterType__eNestedType____bodyDeclarations.setSrc(eOuterType);
		eOuterType__eNestedType____bodyDeclarations.setTrg(eNestedType);
		ruleresult.getCreatedEdges().add(eOuterType__eNestedType____bodyDeclarations);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		ruleresult.getTranslatedEdges().add(typeGraph__tNestedType____classes);
		eNestedTypeToTNestedType__tNestedType____target.setSrc(eNestedTypeToTNestedType);
		eNestedTypeToTNestedType__tNestedType____target.setTrg(tNestedType);
		ruleresult.getCreatedEdges().add(eNestedTypeToTNestedType__tNestedType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tNestedPackage__tNestedType____classes.setName(tNestedPackage__tNestedType____classes_name_prime);
		mBodyToTAnnotation__eNestedType____source.setName(mBodyToTAnnotation__eNestedType____source_name_prime);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		tNestedType__tAnnotation____tAnnotation.setName(tNestedType__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tNestedType____tAnnotated.setName(tAnnotation__tNestedType____tAnnotated_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		mBodyToTAnnotation__tNestedType____target.setName(mBodyToTAnnotation__tNestedType____target_name_prime);
		eNestedTypeToTNestedType__eNestedType____source
				.setName(eNestedTypeToTNestedType__eNestedType____source_name_prime);
		eNestedType__eOuterType____abstractTypeDeclaration
				.setName(eNestedType__eOuterType____abstractTypeDeclaration_name_prime);
		eOuterType__eNestedType____bodyDeclarations.setName(eOuterType__eNestedType____bodyDeclarations_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		eNestedTypeToTNestedType__tNestedType____target
				.setName(eNestedTypeToTNestedType__tNestedType____target_name_prime);
		return new Object[] { ruleresult, tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph,
				tNestedType, tOuterType, mBodyToTAnnotation, eOuterType, tOuterPackage,
				tNestedPackage__tNestedType____classes, mBodyToTAnnotation__eNestedType____source,
				tNestedPackage__tNestedType____ownedTypes, tNestedType__tNestedPackage____package,
				tOuterPackage__tNestedPackage____subpackage, tNestedPackage__tOuterPackage____parent,
				typeGraph__tNestedType____ownedTypes, tNestedType__typeGraph____pg,
				tNestedType__tAnnotation____tAnnotation, tAnnotation__tNestedType____tAnnotated,
				tOuterType__tNestedType____innerTypes, tNestedType__tOuterType____outerType,
				tNestedPackage__typeGraph____typeGraph, mBodyToTAnnotation__tNestedType____target,
				eNestedTypeToTNestedType__eNestedType____source, eNestedType__eOuterType____abstractTypeDeclaration,
				eOuterType__eNestedType____bodyDeclarations, typeGraph__tNestedType____classes,
				eNestedTypeToTNestedType__tNestedType____target };
	}

	public static final void pattern_NestedEnum_11_5_registerobjects_expressionBBBBBBBBBBBBB(NestedEnum _this,
			PerformRuleResult ruleresult, EObject tAnnotation, EObject eNestedType, EObject eNestedTypeToTNestedType,
			EObject tNestedPackage, EObject typeGraph, EObject tNestedType, EObject tOuterType,
			EObject eOuterTypeToTOuterInterface, EObject mBodyToTAnnotation, EObject eOuterType,
			EObject tOuterPackage) {
		_this.registerObjects_BWD(ruleresult, tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage,
				typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, mBodyToTAnnotation, eOuterType,
				tOuterPackage);

	}

	public static final PerformRuleResult pattern_NestedEnum_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedEnum_12_1_preparereturnvalue_bindingFB(NestedEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_12_1_preparereturnvalue_blackFBB(EClass eClass, NestedEnum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_12_1_preparereturnvalue_bindingAndBlackFFB(NestedEnum _this) {
		Object[] result_pattern_NestedEnum_12_1_preparereturnvalue_binding = pattern_NestedEnum_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedEnum_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_NestedEnum_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedEnum_12_1_preparereturnvalue_black = pattern_NestedEnum_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_NestedEnum_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_NestedEnum_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "NestedEnum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_NestedEnum_12_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAnnotation");
		EObject _localVariable_1 = match.getObject("tNestedPackage");
		EObject _localVariable_2 = match.getObject("typeGraph");
		EObject _localVariable_3 = match.getObject("tNestedType");
		EObject _localVariable_4 = match.getObject("tOuterType");
		EObject _localVariable_5 = match.getObject("tOuterPackage");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpTNestedPackage = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpTNestedType = _localVariable_3;
		EObject tmpTOuterType = _localVariable_4;
		EObject tmpTOuterPackage = _localVariable_5;
		if (tmpTAnnotation instanceof TEnum) {
			TEnum tAnnotation = (TEnum) tmpTAnnotation;
			if (tmpTNestedPackage instanceof TPackage) {
				TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpTNestedType instanceof TClass) {
						TClass tNestedType = (TClass) tmpTNestedType;
						if (tmpTOuterType instanceof TAbstractType) {
							TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
							if (tmpTOuterPackage instanceof TPackage) {
								TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
								return new Object[] { tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
										tOuterPackage, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedEnum_12_2_corematch_blackBBBBBFFBB(TEnum tAnnotation,
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				for (TypeToTAbstractType eOuterTypeToTOuterInterface : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tOuterType, TypeToTAbstractType.class, "target")) {
					Type tmpEOuterType = eOuterTypeToTOuterInterface.getSource();
					if (tmpEOuterType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
						_result.add(new Object[] { tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
								eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, match });
					}

				}
			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_NestedEnum_12_3_findcontext_blackBBBBBBBB(TEnum tAnnotation,
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType,
			TPackage tOuterPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				if (tNestedPackage.getClasses().contains(tNestedType)) {
					if (tNestedPackage.getOwnedTypes().contains(tNestedType)) {
						if (tOuterPackage.getSubpackage().contains(tNestedPackage)) {
							if (eOuterType.equals(eOuterTypeToTOuterInterface.getSource())) {
								if (typeGraph.getOwnedTypes().contains(tNestedType)) {
									if (typeGraph.getOwnedTypes().contains(tOuterType)) {
										if (tNestedType.getTAnnotation().contains(tAnnotation)) {
											if (tOuterPackage.getOwnedTypes().contains(tOuterType)) {
												if (tOuterType.getInnerTypes().contains(tNestedType)) {
													if (typeGraph.equals(tNestedPackage.getTypeGraph())) {
														if (typeGraph.getClasses().contains(tNestedType)) {
															if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
																if (tOuterType.equals(
																		eOuterTypeToTOuterInterface.getTarget())) {
																	_result.add(new Object[] { tAnnotation,
																			tNestedPackage, typeGraph, tNestedType,
																			tOuterType, eOuterTypeToTOuterInterface,
																			eOuterType, tOuterPackage });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_NestedEnum_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
			TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tNestedPackage__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tNestedPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tNestedPackage____subpackage = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__tOuterPackage____parent = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__eOuterType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tAnnotation____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnnotation__tNestedType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__tOuterType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tOuterPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterType__tNestedType____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedType__tOuterType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tNestedPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tNestedType____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tOuterPackage__typeGraph____typeGraph = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eOuterTypeToTOuterInterface__tOuterType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tNestedPackage__tNestedType____classes_name_prime = "classes";
		String tNestedPackage__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__tNestedPackage____package_name_prime = "package";
		String tOuterPackage__tNestedPackage____subpackage_name_prime = "subpackage";
		String tNestedPackage__tOuterPackage____parent_name_prime = "parent";
		String eOuterTypeToTOuterInterface__eOuterType____source_name_prime = "source";
		String typeGraph__tNestedType____ownedTypes_name_prime = "ownedTypes";
		String tNestedType__typeGraph____pg_name_prime = "pg";
		String typeGraph__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__typeGraph____pg_name_prime = "pg";
		String tNestedType__tAnnotation____tAnnotation_name_prime = "tAnnotation";
		String tAnnotation__tNestedType____tAnnotated_name_prime = "tAnnotated";
		String tOuterPackage__tOuterType____ownedTypes_name_prime = "ownedTypes";
		String tOuterType__tOuterPackage____package_name_prime = "package";
		String tOuterType__tNestedType____innerTypes_name_prime = "innerTypes";
		String tNestedType__tOuterType____outerType_name_prime = "outerType";
		String tNestedPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String typeGraph__tNestedType____classes_name_prime = "classes";
		String tOuterPackage__typeGraph____typeGraph_name_prime = "typeGraph";
		String eOuterTypeToTOuterInterface__tOuterType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tNestedPackage);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		isApplicableMatch.getAllContextElements().add(eOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage);
		tNestedPackage__tNestedType____classes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____classes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__tNestedType____classes);
		tNestedPackage__tNestedType____ownedTypes.setSrc(tNestedPackage);
		tNestedPackage__tNestedType____ownedTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__tNestedType____ownedTypes);
		tNestedType__tNestedPackage____package.setSrc(tNestedType);
		tNestedType__tNestedPackage____package.setTrg(tNestedPackage);
		isApplicableMatch.getAllContextElements().add(tNestedType__tNestedPackage____package);
		tOuterPackage__tNestedPackage____subpackage.setSrc(tOuterPackage);
		tOuterPackage__tNestedPackage____subpackage.setTrg(tNestedPackage);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tNestedPackage____subpackage);
		tNestedPackage__tOuterPackage____parent.setSrc(tNestedPackage);
		tNestedPackage__tOuterPackage____parent.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__tOuterPackage____parent);
		eOuterTypeToTOuterInterface__eOuterType____source.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__eOuterType____source.setTrg(eOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__eOuterType____source);
		typeGraph__tNestedType____ownedTypes.setSrc(typeGraph);
		typeGraph__tNestedType____ownedTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tNestedType____ownedTypes);
		tNestedType__typeGraph____pg.setSrc(tNestedType);
		tNestedType__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedType__typeGraph____pg);
		typeGraph__tOuterType____ownedTypes.setSrc(typeGraph);
		typeGraph__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tOuterType____ownedTypes);
		tOuterType__typeGraph____pg.setSrc(tOuterType);
		tOuterType__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterType__typeGraph____pg);
		tNestedType__tAnnotation____tAnnotation.setSrc(tNestedType);
		tNestedType__tAnnotation____tAnnotation.setTrg(tAnnotation);
		isApplicableMatch.getAllContextElements().add(tNestedType__tAnnotation____tAnnotation);
		tAnnotation__tNestedType____tAnnotated.setSrc(tAnnotation);
		tAnnotation__tNestedType____tAnnotated.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tAnnotation__tNestedType____tAnnotated);
		tOuterPackage__tOuterType____ownedTypes.setSrc(tOuterPackage);
		tOuterPackage__tOuterType____ownedTypes.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__tOuterType____ownedTypes);
		tOuterType__tOuterPackage____package.setSrc(tOuterType);
		tOuterType__tOuterPackage____package.setTrg(tOuterPackage);
		isApplicableMatch.getAllContextElements().add(tOuterType__tOuterPackage____package);
		tOuterType__tNestedType____innerTypes.setSrc(tOuterType);
		tOuterType__tNestedType____innerTypes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(tOuterType__tNestedType____innerTypes);
		tNestedType__tOuterType____outerType.setSrc(tNestedType);
		tNestedType__tOuterType____outerType.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(tNestedType__tOuterType____outerType);
		tNestedPackage__typeGraph____typeGraph.setSrc(tNestedPackage);
		tNestedPackage__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tNestedPackage__typeGraph____typeGraph);
		typeGraph__tNestedType____classes.setSrc(typeGraph);
		typeGraph__tNestedType____classes.setTrg(tNestedType);
		isApplicableMatch.getAllContextElements().add(typeGraph__tNestedType____classes);
		tOuterPackage__typeGraph____typeGraph.setSrc(tOuterPackage);
		tOuterPackage__typeGraph____typeGraph.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tOuterPackage__typeGraph____typeGraph);
		eOuterTypeToTOuterInterface__tOuterType____target.setSrc(eOuterTypeToTOuterInterface);
		eOuterTypeToTOuterInterface__tOuterType____target.setTrg(tOuterType);
		isApplicableMatch.getAllContextElements().add(eOuterTypeToTOuterInterface__tOuterType____target);
		tNestedPackage__tNestedType____classes.setName(tNestedPackage__tNestedType____classes_name_prime);
		tNestedPackage__tNestedType____ownedTypes.setName(tNestedPackage__tNestedType____ownedTypes_name_prime);
		tNestedType__tNestedPackage____package.setName(tNestedType__tNestedPackage____package_name_prime);
		tOuterPackage__tNestedPackage____subpackage.setName(tOuterPackage__tNestedPackage____subpackage_name_prime);
		tNestedPackage__tOuterPackage____parent.setName(tNestedPackage__tOuterPackage____parent_name_prime);
		eOuterTypeToTOuterInterface__eOuterType____source
				.setName(eOuterTypeToTOuterInterface__eOuterType____source_name_prime);
		typeGraph__tNestedType____ownedTypes.setName(typeGraph__tNestedType____ownedTypes_name_prime);
		tNestedType__typeGraph____pg.setName(tNestedType__typeGraph____pg_name_prime);
		typeGraph__tOuterType____ownedTypes.setName(typeGraph__tOuterType____ownedTypes_name_prime);
		tOuterType__typeGraph____pg.setName(tOuterType__typeGraph____pg_name_prime);
		tNestedType__tAnnotation____tAnnotation.setName(tNestedType__tAnnotation____tAnnotation_name_prime);
		tAnnotation__tNestedType____tAnnotated.setName(tAnnotation__tNestedType____tAnnotated_name_prime);
		tOuterPackage__tOuterType____ownedTypes.setName(tOuterPackage__tOuterType____ownedTypes_name_prime);
		tOuterType__tOuterPackage____package.setName(tOuterType__tOuterPackage____package_name_prime);
		tOuterType__tNestedType____innerTypes.setName(tOuterType__tNestedType____innerTypes_name_prime);
		tNestedType__tOuterType____outerType.setName(tNestedType__tOuterType____outerType_name_prime);
		tNestedPackage__typeGraph____typeGraph.setName(tNestedPackage__typeGraph____typeGraph_name_prime);
		typeGraph__tNestedType____classes.setName(typeGraph__tNestedType____classes_name_prime);
		tOuterPackage__typeGraph____typeGraph.setName(tOuterPackage__typeGraph____typeGraph_name_prime);
		eOuterTypeToTOuterInterface__tOuterType____target
				.setName(eOuterTypeToTOuterInterface__tOuterType____target_name_prime);
		return new Object[] { tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage, isApplicableMatch,
				tNestedPackage__tNestedType____classes, tNestedPackage__tNestedType____ownedTypes,
				tNestedType__tNestedPackage____package, tOuterPackage__tNestedPackage____subpackage,
				tNestedPackage__tOuterPackage____parent, eOuterTypeToTOuterInterface__eOuterType____source,
				typeGraph__tNestedType____ownedTypes, tNestedType__typeGraph____pg, typeGraph__tOuterType____ownedTypes,
				tOuterType__typeGraph____pg, tNestedType__tAnnotation____tAnnotation,
				tAnnotation__tNestedType____tAnnotated, tOuterPackage__tOuterType____ownedTypes,
				tOuterType__tOuterPackage____package, tOuterType__tNestedType____innerTypes,
				tNestedType__tOuterType____outerType, tNestedPackage__typeGraph____typeGraph,
				typeGraph__tNestedType____classes, tOuterPackage__typeGraph____typeGraph,
				eOuterTypeToTOuterInterface__tOuterType____target };
	}

	public static final Object[] pattern_NestedEnum_12_4_solveCSP_bindingFBBBBBBBBBB(NestedEnum _this,
			IsApplicableMatch isApplicableMatch, TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tAnnotation, tNestedPackage,
				typeGraph, tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tAnnotation, tNestedPackage, typeGraph, tNestedType,
					tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnum_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(NestedEnum _this,
			IsApplicableMatch isApplicableMatch, TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		Object[] result_pattern_NestedEnum_12_4_solveCSP_binding = pattern_NestedEnum_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tAnnotation, tNestedPackage, typeGraph, tNestedType, tOuterType,
				eOuterTypeToTOuterInterface, eOuterType, tOuterPackage);
		if (result_pattern_NestedEnum_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnum_12_4_solveCSP_binding[0];

			Object[] result_pattern_NestedEnum_12_4_solveCSP_black = pattern_NestedEnum_12_4_solveCSP_blackB(csp);
			if (result_pattern_NestedEnum_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tAnnotation, tNestedPackage, typeGraph,
						tNestedType, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnum_12_5_checkCSP_expressionFBB(NestedEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_NestedEnum_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "NestedEnum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_NestedEnum_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_NestedEnum_20_1_preparereturnvalue_bindingFB(NestedEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			NestedEnum _this) {
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

	public static final Object[] pattern_NestedEnum_20_1_preparereturnvalue_bindingAndBlackFFBF(NestedEnum _this) {
		Object[] result_pattern_NestedEnum_20_1_preparereturnvalue_binding = pattern_NestedEnum_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedEnum_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_NestedEnum_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedEnum_20_1_preparereturnvalue_black = pattern_NestedEnum_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_NestedEnum_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_NestedEnum_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_NestedEnum_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_0BBBBBB(TEnum tAnnotation,
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				TAnnotatable __DEC_tAnnotation_tAnnotated_549209 = tAnnotation.getTAnnotated();
				if (__DEC_tAnnotation_tAnnotated_549209 != null) {
					if (!tNestedPackage.equals(__DEC_tAnnotation_tAnnotated_549209)) {
						if (!typeGraph.equals(__DEC_tAnnotation_tAnnotated_549209)) {
							if (!tNestedType.equals(__DEC_tAnnotation_tAnnotated_549209)) {
								if (!tOuterType.equals(__DEC_tAnnotation_tAnnotated_549209)) {
									if (!tOuterPackage.equals(__DEC_tAnnotation_tAnnotated_549209)) {
										return new Object[] { tAnnotation, tNestedPackage, typeGraph, tNestedType,
												tOuterType, tOuterPackage };
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

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_1BB(TPackage tNestedPackage,
			TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedPackage_parent_779144 = tNestedPackage.getParent();
			if (__DEC_tNestedPackage_parent_779144 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedPackage_parent_779144)) {
					if (!tOuterPackage.equals(__DEC_tNestedPackage_parent_779144)) {
						return new Object[] { tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_2BB(TPackage tNestedPackage,
			TypeGraph typeGraph) {
		TypeGraph __DEC_tNestedPackage_packages_513956 = tNestedPackage.getPg();
		if (__DEC_tNestedPackage_packages_513956 != null) {
			if (!typeGraph.equals(__DEC_tNestedPackage_packages_513956)) {
				return new Object[] { tNestedPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_3BBB(TClass tNestedType,
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			for (TPackage __DEC_tNestedType_classes_42968 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tNestedType, TPackage.class, "classes")) {
				if (!tNestedPackage.equals(__DEC_tNestedType_classes_42968)) {
					if (!tOuterPackage.equals(__DEC_tNestedType_classes_42968)) {
						return new Object[] { tNestedType, tNestedPackage, tOuterPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_4BB(TClass tNestedType,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tNestedType_classes_301193 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tNestedType_classes_301193)) {
				return new Object[] { tNestedType, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_5BBB(TClass tNestedType,
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedType_ownedTypes_897644 = tNestedType.getPackage();
			if (__DEC_tNestedType_ownedTypes_897644 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedType_ownedTypes_897644)) {
					if (!tOuterPackage.equals(__DEC_tNestedType_ownedTypes_897644)) {
						return new Object[] { tNestedType, tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_6BB(TClass tNestedType,
			TAbstractType tOuterType) {
		if (!tNestedType.equals(tOuterType)) {
			TAbstractType __DEC_tNestedType_innerTypes_591516 = tNestedType.getOuterType();
			if (__DEC_tNestedType_innerTypes_591516 != null) {
				if (!tNestedType.equals(__DEC_tNestedType_innerTypes_591516)) {
					if (!tOuterType.equals(__DEC_tNestedType_innerTypes_591516)) {
						return new Object[] { tNestedType, tOuterType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_7BB(TEnum tAnnotation,
			TPackage tNestedPackage) {
		if (tNestedPackage.equals(tAnnotation.getTAnnotated())) {
			return new Object[] { tAnnotation, tNestedPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_8BB(TEnum tAnnotation,
			TypeGraph typeGraph) {
		if (typeGraph.equals(tAnnotation.getTAnnotated())) {
			return new Object[] { tAnnotation, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_9BB(TEnum tAnnotation,
			TAbstractType tOuterType) {
		if (tOuterType.equals(tAnnotation.getTAnnotated())) {
			return new Object[] { tAnnotation, tOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_10BB(TEnum tAnnotation,
			TPackage tOuterPackage) {
		if (tOuterPackage.equals(tAnnotation.getTAnnotated())) {
			return new Object[] { tAnnotation, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_11BB(TypeGraph typeGraph,
			TPackage tNestedPackage) {
		if (typeGraph.getPackages().contains(tNestedPackage)) {
			return new Object[] { typeGraph, tNestedPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_12BB(TPackage tOuterPackage,
			TClass tNestedType) {
		if (tOuterPackage.getClasses().contains(tNestedType)) {
			return new Object[] { tOuterPackage, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_13BB(TPackage tOuterPackage,
			TClass tNestedType) {
		if (tOuterPackage.getOwnedTypes().contains(tNestedType)) {
			return new Object[] { tOuterPackage, tNestedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedEnum_20_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTNestedPackage = _edge_classes.getSrc();
		if (tmpTNestedPackage instanceof TPackage) {
			TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
			EObject tmpTNestedType = _edge_classes.getTrg();
			if (tmpTNestedType instanceof TClass) {
				TClass tNestedType = (TClass) tmpTNestedType;
				if (tNestedPackage.getClasses().contains(tNestedType)) {
					if (tNestedPackage.getOwnedTypes().contains(tNestedType)) {
						TPackage tOuterPackage = tNestedPackage.getParent();
						if (tOuterPackage != null) {
							if (!tNestedPackage.equals(tOuterPackage)) {
								TypeGraph typeGraph = tNestedPackage.getTypeGraph();
								if (typeGraph != null) {
									if (typeGraph.getOwnedTypes().contains(tNestedType)) {
										if (typeGraph.getClasses().contains(tNestedType)) {
											if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
												TAbstractType tOuterType = tNestedType.getOuterType();
												if (tOuterType != null) {
													if (!tNestedType.equals(tOuterType)) {
														if (typeGraph.getOwnedTypes().contains(tOuterType)) {
															if (tOuterPackage.getOwnedTypes().contains(tOuterType)) {
																if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_1BB(
																		tNestedPackage, tOuterPackage) == null) {
																	if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_3BBB(
																			tNestedType, tNestedPackage,
																			tOuterPackage) == null) {
																		if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_5BBB(
																				tNestedType, tNestedPackage,
																				tOuterPackage) == null) {
																			if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_12BB(
																					tOuterPackage,
																					tNestedType) == null) {
																				if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_13BB(
																						tOuterPackage,
																						tNestedType) == null) {
																					if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_2BB(
																							tNestedPackage,
																							typeGraph) == null) {
																						if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_4BB(
																								tNestedType,
																								typeGraph) == null) {
																							if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_11BB(
																									typeGraph,
																									tNestedPackage) == null) {
																								if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_6BB(
																										tNestedType,
																										tOuterType) == null) {
																									for (TAnnotation tmpTAnnotation : tNestedType
																											.getTAnnotation()) {
																										if (tmpTAnnotation instanceof TEnum) {
																											TEnum tAnnotation = (TEnum) tmpTAnnotation;
																											if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_0BBBBBB(
																													tAnnotation,
																													tNestedPackage,
																													typeGraph,
																													tNestedType,
																													tOuterType,
																													tOuterPackage) == null) {
																												if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_7BB(
																														tAnnotation,
																														tNestedPackage) == null) {
																													if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_8BB(
																															tAnnotation,
																															typeGraph) == null) {
																														if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_9BB(
																																tAnnotation,
																																tOuterType) == null) {
																															if (pattern_NestedEnum_20_2_testcorematchandDECs_black_nac_10BB(
																																	tAnnotation,
																																	tOuterPackage) == null) {
																																_result.add(
																																		new Object[] {
																																				tAnnotation,
																																				tNestedPackage,
																																				typeGraph,
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

	public static final Object[] pattern_NestedEnum_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_NestedEnum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			NestedEnum _this, Match match, TEnum tAnnotation, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, TPackage tOuterPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnnotation, tNestedPackage, typeGraph, tNestedType,
				tOuterType, tOuterPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_NestedEnum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			NestedEnum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_NestedEnum_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_NestedEnum_21_1_preparereturnvalue_bindingFB(NestedEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			NestedEnum _this) {
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

	public static final Object[] pattern_NestedEnum_21_1_preparereturnvalue_bindingAndBlackFFBF(NestedEnum _this) {
		Object[] result_pattern_NestedEnum_21_1_preparereturnvalue_binding = pattern_NestedEnum_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_NestedEnum_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_NestedEnum_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_NestedEnum_21_1_preparereturnvalue_black = pattern_NestedEnum_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_NestedEnum_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_NestedEnum_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_NestedEnum_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_NestedEnum_21_2_testcorematchandDECs_black_nac_0B(
			EnumDeclaration eNestedType) {
		AnonymousClassDeclaration __DEC_eNestedType_anonymousClassDeclarationOwner_127632 = eNestedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_eNestedType_anonymousClassDeclarationOwner_127632 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_NestedEnum_21_2_testcorematchandDECs_black_nac_1B(
			EnumDeclaration eNestedType) {
		for (Model __DEC_eNestedType_orphanTypes_60462 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, Model.class, "orphanTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_21_2_testcorematchandDECs_black_nac_2B(
			EnumDeclaration eNestedType) {
		org.eclipse.modisco.java.Package __DEC_eNestedType_ownedElements_31362 = eNestedType.getPackage();
		if (__DEC_eNestedType_ownedElements_31362 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_NestedEnum_21_2_testcorematchandDECs_black_nac_3B(
			EnumDeclaration eNestedType) {
		for (MAbstractMethodDefinition __DEC_eNestedType_mInnerTypes_924237 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedEnum_21_2_testcorematchandDECs_blackFFB(
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
						if (pattern_NestedEnum_21_2_testcorematchandDECs_black_nac_0B(eNestedType) == null) {
							if (pattern_NestedEnum_21_2_testcorematchandDECs_black_nac_1B(eNestedType) == null) {
								if (pattern_NestedEnum_21_2_testcorematchandDECs_black_nac_2B(eNestedType) == null) {
									if (pattern_NestedEnum_21_2_testcorematchandDECs_black_nac_3B(
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

	public static final Object[] pattern_NestedEnum_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_NestedEnum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			NestedEnum _this, Match match, EnumDeclaration eNestedType, AbstractTypeDeclaration eOuterType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eNestedType, eOuterType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_NestedEnum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			NestedEnum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_NestedEnum_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_NestedEnum_24_1_prepare_blackB(NestedEnum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_NestedEnum_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_NestedEnum_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tAnnotation");
		EObject _localVariable_1 = sourceMatch.getObject("eNestedType");
		EObject _localVariable_2 = targetMatch.getObject("tNestedPackage");
		EObject _localVariable_3 = targetMatch.getObject("typeGraph");
		EObject _localVariable_4 = targetMatch.getObject("tNestedType");
		EObject _localVariable_5 = targetMatch.getObject("tOuterType");
		EObject _localVariable_6 = sourceMatch.getObject("eOuterType");
		EObject _localVariable_7 = targetMatch.getObject("tOuterPackage");
		EObject tmpTAnnotation = _localVariable_0;
		EObject tmpENestedType = _localVariable_1;
		EObject tmpTNestedPackage = _localVariable_2;
		EObject tmpTypeGraph = _localVariable_3;
		EObject tmpTNestedType = _localVariable_4;
		EObject tmpTOuterType = _localVariable_5;
		EObject tmpEOuterType = _localVariable_6;
		EObject tmpTOuterPackage = _localVariable_7;
		if (tmpTAnnotation instanceof TEnum) {
			TEnum tAnnotation = (TEnum) tmpTAnnotation;
			if (tmpENestedType instanceof EnumDeclaration) {
				EnumDeclaration eNestedType = (EnumDeclaration) tmpENestedType;
				if (tmpTNestedPackage instanceof TPackage) {
					TPackage tNestedPackage = (TPackage) tmpTNestedPackage;
					if (tmpTypeGraph instanceof TypeGraph) {
						TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
						if (tmpTNestedType instanceof TClass) {
							TClass tNestedType = (TClass) tmpTNestedType;
							if (tmpTOuterType instanceof TAbstractType) {
								TAbstractType tOuterType = (TAbstractType) tmpTOuterType;
								if (tmpEOuterType instanceof AbstractTypeDeclaration) {
									AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) tmpEOuterType;
									if (tmpTOuterPackage instanceof TPackage) {
										TPackage tOuterPackage = (TPackage) tmpTOuterPackage;
										return new Object[] { tAnnotation, eNestedType, tNestedPackage, typeGraph,
												tNestedType, tOuterType, eOuterType, tOuterPackage, targetMatch,
												sourceMatch };
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

	public static final Object[] pattern_NestedEnum_24_2_matchsrctrgcontext_blackBBBBBBBBBB(TEnum tAnnotation,
			EnumDeclaration eNestedType, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, Match sourceMatch,
			Match targetMatch) {
		if (!eNestedType.equals(eOuterType)) {
			if (!tNestedPackage.equals(tOuterPackage)) {
				if (!tNestedType.equals(tOuterType)) {
					if (!sourceMatch.equals(targetMatch)) {
						return new Object[] { tAnnotation, eNestedType, tNestedPackage, typeGraph, tNestedType,
								tOuterType, eOuterType, tOuterPackage, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_NestedEnum_24_2_matchsrctrgcontext_binding = pattern_NestedEnum_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_NestedEnum_24_2_matchsrctrgcontext_binding != null) {
			TEnum tAnnotation = (TEnum) result_pattern_NestedEnum_24_2_matchsrctrgcontext_binding[0];
			EnumDeclaration eNestedType = (EnumDeclaration) result_pattern_NestedEnum_24_2_matchsrctrgcontext_binding[1];
			TPackage tNestedPackage = (TPackage) result_pattern_NestedEnum_24_2_matchsrctrgcontext_binding[2];
			TypeGraph typeGraph = (TypeGraph) result_pattern_NestedEnum_24_2_matchsrctrgcontext_binding[3];
			TClass tNestedType = (TClass) result_pattern_NestedEnum_24_2_matchsrctrgcontext_binding[4];
			TAbstractType tOuterType = (TAbstractType) result_pattern_NestedEnum_24_2_matchsrctrgcontext_binding[5];
			AbstractTypeDeclaration eOuterType = (AbstractTypeDeclaration) result_pattern_NestedEnum_24_2_matchsrctrgcontext_binding[6];
			TPackage tOuterPackage = (TPackage) result_pattern_NestedEnum_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_NestedEnum_24_2_matchsrctrgcontext_black = pattern_NestedEnum_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					tAnnotation, eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType,
					tOuterPackage, sourceMatch, targetMatch);
			if (result_pattern_NestedEnum_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tAnnotation, eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
						eOuterType, tOuterPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_24_3_solvecsp_bindingFBBBBBBBBBBB(NestedEnum _this,
			TEnum tAnnotation, EnumDeclaration eNestedType, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(tAnnotation, eNestedType, tNestedPackage, typeGraph,
				tNestedType, tOuterType, eOuterType, tOuterPackage, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, tAnnotation, eNestedType, tNestedPackage, typeGraph, tNestedType,
					tOuterType, eOuterType, tOuterPackage, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnum_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(NestedEnum _this,
			TEnum tAnnotation, EnumDeclaration eNestedType, TPackage tNestedPackage, TypeGraph typeGraph,
			TClass tNestedType, TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_NestedEnum_24_3_solvecsp_binding = pattern_NestedEnum_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, tAnnotation, eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType, eOuterType,
				tOuterPackage, sourceMatch, targetMatch);
		if (result_pattern_NestedEnum_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnum_24_3_solvecsp_binding[0];

			Object[] result_pattern_NestedEnum_24_3_solvecsp_black = pattern_NestedEnum_24_3_solvecsp_blackB(csp);
			if (result_pattern_NestedEnum_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tAnnotation, eNestedType, tNestedPackage, typeGraph, tNestedType,
						tOuterType, eOuterType, tOuterPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnum_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_NestedEnum_24_5_matchcorrcontext_blackBFBBB(TAbstractType tOuterType,
			AbstractTypeDeclaration eOuterType, Match sourceMatch, Match targetMatch) {
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

	public static final Object[] pattern_NestedEnum_24_5_matchcorrcontext_greenBBBF(
			TypeToTAbstractType eOuterTypeToTOuterInterface, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "NestedEnum";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eOuterTypeToTOuterInterface);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eOuterTypeToTOuterInterface, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_NestedEnum_24_6_createcorrespondence_blackBBBBBBBBB(TEnum tAnnotation,
			EnumDeclaration eNestedType, TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, CCMatch ccMatch) {
		if (!eNestedType.equals(eOuterType)) {
			if (!tNestedPackage.equals(tOuterPackage)) {
				if (!tNestedType.equals(tOuterType)) {
					return new Object[] { tAnnotation, eNestedType, tNestedPackage, typeGraph, tNestedType, tOuterType,
							eOuterType, tOuterPackage, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_24_6_createcorrespondence_greenBFBFB(EnumDeclaration eNestedType,
			TClass tNestedType, CCMatch ccMatch) {
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		eNestedTypeToTNestedType.setSource(eNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		ccMatch.getCreateCorr().add(eNestedTypeToTNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { eNestedType, eNestedTypeToTNestedType, tNestedType, mBodyToTAnnotation, ccMatch };
	}

	public static final Object[] pattern_NestedEnum_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_NestedEnum_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "NestedEnum";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_NestedEnum_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_NestedEnum_27_1_matchtggpattern_black_nac_0B(EnumDeclaration eNestedType) {
		AnonymousClassDeclaration __DEC_eNestedType_anonymousClassDeclarationOwner_380249 = eNestedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_eNestedType_anonymousClassDeclarationOwner_380249 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_NestedEnum_27_1_matchtggpattern_black_nac_1B(EnumDeclaration eNestedType) {
		for (Model __DEC_eNestedType_orphanTypes_329550 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, Model.class, "orphanTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_27_1_matchtggpattern_black_nac_2B(EnumDeclaration eNestedType) {
		org.eclipse.modisco.java.Package __DEC_eNestedType_ownedElements_252994 = eNestedType.getPackage();
		if (__DEC_eNestedType_ownedElements_252994 != null) {
			return new Object[] { eNestedType };
		}

		return null;
	}

	public static final Object[] pattern_NestedEnum_27_1_matchtggpattern_black_nac_3B(EnumDeclaration eNestedType) {
		for (MAbstractMethodDefinition __DEC_eNestedType_mInnerTypes_279439 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eNestedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { eNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_27_1_matchtggpattern_blackBB(EnumDeclaration eNestedType,
			AbstractTypeDeclaration eOuterType) {
		if (!eNestedType.equals(eOuterType)) {
			if (eOuterType.equals(eNestedType.getAbstractTypeDeclaration())) {
				if (pattern_NestedEnum_27_1_matchtggpattern_black_nac_0B(eNestedType) == null) {
					if (pattern_NestedEnum_27_1_matchtggpattern_black_nac_1B(eNestedType) == null) {
						if (pattern_NestedEnum_27_1_matchtggpattern_black_nac_2B(eNestedType) == null) {
							if (pattern_NestedEnum_27_1_matchtggpattern_black_nac_3B(eNestedType) == null) {
								return new Object[] { eNestedType, eOuterType };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnum_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedEnum_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_0BBBBBB(TEnum tAnnotation,
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				TAnnotatable __DEC_tAnnotation_tAnnotated_982124 = tAnnotation.getTAnnotated();
				if (__DEC_tAnnotation_tAnnotated_982124 != null) {
					if (!tNestedPackage.equals(__DEC_tAnnotation_tAnnotated_982124)) {
						if (!typeGraph.equals(__DEC_tAnnotation_tAnnotated_982124)) {
							if (!tNestedType.equals(__DEC_tAnnotation_tAnnotated_982124)) {
								if (!tOuterType.equals(__DEC_tAnnotation_tAnnotated_982124)) {
									if (!tOuterPackage.equals(__DEC_tAnnotation_tAnnotated_982124)) {
										return new Object[] { tAnnotation, tNestedPackage, typeGraph, tNestedType,
												tOuterType, tOuterPackage };
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

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_1BB(TPackage tNestedPackage,
			TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedPackage_parent_317511 = tNestedPackage.getParent();
			if (__DEC_tNestedPackage_parent_317511 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedPackage_parent_317511)) {
					if (!tOuterPackage.equals(__DEC_tNestedPackage_parent_317511)) {
						return new Object[] { tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_2BB(TPackage tNestedPackage,
			TypeGraph typeGraph) {
		TypeGraph __DEC_tNestedPackage_packages_26251 = tNestedPackage.getPg();
		if (__DEC_tNestedPackage_packages_26251 != null) {
			if (!typeGraph.equals(__DEC_tNestedPackage_packages_26251)) {
				return new Object[] { tNestedPackage, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_3BBB(TClass tNestedType,
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			for (TPackage __DEC_tNestedType_classes_830210 : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tNestedType, TPackage.class, "classes")) {
				if (!tNestedPackage.equals(__DEC_tNestedType_classes_830210)) {
					if (!tOuterPackage.equals(__DEC_tNestedType_classes_830210)) {
						return new Object[] { tNestedType, tNestedPackage, tOuterPackage };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_4BB(TClass tNestedType,
			TypeGraph typeGraph) {
		for (TypeGraph __DEC_tNestedType_classes_449023 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tNestedType, TypeGraph.class, "classes")) {
			if (!typeGraph.equals(__DEC_tNestedType_classes_449023)) {
				return new Object[] { tNestedType, typeGraph };
			}
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_5BBB(TClass tNestedType,
			TPackage tNestedPackage, TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			TPackage __DEC_tNestedType_ownedTypes_461332 = tNestedType.getPackage();
			if (__DEC_tNestedType_ownedTypes_461332 != null) {
				if (!tNestedPackage.equals(__DEC_tNestedType_ownedTypes_461332)) {
					if (!tOuterPackage.equals(__DEC_tNestedType_ownedTypes_461332)) {
						return new Object[] { tNestedType, tNestedPackage, tOuterPackage };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_6BB(TClass tNestedType,
			TAbstractType tOuterType) {
		if (!tNestedType.equals(tOuterType)) {
			TAbstractType __DEC_tNestedType_innerTypes_503594 = tNestedType.getOuterType();
			if (__DEC_tNestedType_innerTypes_503594 != null) {
				if (!tNestedType.equals(__DEC_tNestedType_innerTypes_503594)) {
					if (!tOuterType.equals(__DEC_tNestedType_innerTypes_503594)) {
						return new Object[] { tNestedType, tOuterType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_7BB(TEnum tAnnotation,
			TPackage tNestedPackage) {
		if (tNestedPackage.equals(tAnnotation.getTAnnotated())) {
			return new Object[] { tAnnotation, tNestedPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_8BB(TEnum tAnnotation,
			TypeGraph typeGraph) {
		if (typeGraph.equals(tAnnotation.getTAnnotated())) {
			return new Object[] { tAnnotation, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_9BB(TEnum tAnnotation,
			TAbstractType tOuterType) {
		if (tOuterType.equals(tAnnotation.getTAnnotated())) {
			return new Object[] { tAnnotation, tOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_10BB(TEnum tAnnotation,
			TPackage tOuterPackage) {
		if (tOuterPackage.equals(tAnnotation.getTAnnotated())) {
			return new Object[] { tAnnotation, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_11BB(TypeGraph typeGraph,
			TPackage tNestedPackage) {
		if (typeGraph.getPackages().contains(tNestedPackage)) {
			return new Object[] { typeGraph, tNestedPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_12BB(TPackage tOuterPackage,
			TClass tNestedType) {
		if (tOuterPackage.getClasses().contains(tNestedType)) {
			return new Object[] { tOuterPackage, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_black_nac_13BB(TPackage tOuterPackage,
			TClass tNestedType) {
		if (tOuterPackage.getOwnedTypes().contains(tNestedType)) {
			return new Object[] { tOuterPackage, tNestedType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_28_1_matchtggpattern_blackBBBBBB(TEnum tAnnotation,
			TPackage tNestedPackage, TypeGraph typeGraph, TClass tNestedType, TAbstractType tOuterType,
			TPackage tOuterPackage) {
		if (!tNestedPackage.equals(tOuterPackage)) {
			if (!tNestedType.equals(tOuterType)) {
				if (tNestedPackage.getClasses().contains(tNestedType)) {
					if (tNestedPackage.getOwnedTypes().contains(tNestedType)) {
						if (tOuterPackage.getSubpackage().contains(tNestedPackage)) {
							if (typeGraph.getOwnedTypes().contains(tNestedType)) {
								if (typeGraph.getOwnedTypes().contains(tOuterType)) {
									if (tNestedType.getTAnnotation().contains(tAnnotation)) {
										if (tOuterPackage.getOwnedTypes().contains(tOuterType)) {
											if (tOuterType.getInnerTypes().contains(tNestedType)) {
												if (typeGraph.equals(tNestedPackage.getTypeGraph())) {
													if (typeGraph.getClasses().contains(tNestedType)) {
														if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
															if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_0BBBBBB(
																	tAnnotation, tNestedPackage, typeGraph, tNestedType,
																	tOuterType, tOuterPackage) == null) {
																if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_1BB(
																		tNestedPackage, tOuterPackage) == null) {
																	if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_2BB(
																			tNestedPackage, typeGraph) == null) {
																		if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_3BBB(
																				tNestedType, tNestedPackage,
																				tOuterPackage) == null) {
																			if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_4BB(
																					tNestedType, typeGraph) == null) {
																				if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_5BBB(
																						tNestedType, tNestedPackage,
																						tOuterPackage) == null) {
																					if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_6BB(
																							tNestedType,
																							tOuterType) == null) {
																						if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_7BB(
																								tAnnotation,
																								tNestedPackage) == null) {
																							if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_8BB(
																									tAnnotation,
																									typeGraph) == null) {
																								if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_9BB(
																										tAnnotation,
																										tOuterType) == null) {
																									if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_10BB(
																											tAnnotation,
																											tOuterPackage) == null) {
																										if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_11BB(
																												typeGraph,
																												tNestedPackage) == null) {
																											if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_12BB(
																													tOuterPackage,
																													tNestedType) == null) {
																												if (pattern_NestedEnum_28_1_matchtggpattern_black_nac_13BB(
																														tOuterPackage,
																														tNestedType) == null) {
																													return new Object[] {
																															tAnnotation,
																															tNestedPackage,
																															typeGraph,
																															tNestedType,
																															tOuterType,
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
		return null;
	}

	public static final boolean pattern_NestedEnum_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_NestedEnum_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_29_1_createresult_blackB(NestedEnum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_NestedEnum_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_NestedEnum_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tOuterType) {
		if (ruleResult.getTargetObjects().contains(tOuterType)) {
			return new Object[] { ruleResult, tOuterType };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TPackage tOuterPackage) {
		if (ruleResult.getTargetObjects().contains(tOuterPackage)) {
			return new Object[] { ruleResult, tOuterPackage };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eOuterTypeToTOuterInterface) {
		if (ruleResult.getCorrObjects().contains(eOuterTypeToTOuterInterface)) {
			return new Object[] { ruleResult, eOuterTypeToTOuterInterface };
		}
		return null;
	}

	public static final Object[] pattern_NestedEnum_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration eOuterType) {
		if (ruleResult.getSourceObjects().contains(eOuterType)) {
			return new Object[] { ruleResult, eOuterType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_NestedEnum_29_2_isapplicablecore_blackFFFFFFBB(
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
							TypeGraph typeGraph = tOuterType.getPg();
							if (typeGraph != null) {
								TPackage tOuterPackage = tOuterType.getPackage();
								if (tOuterPackage != null) {
									if (typeGraph.equals(tOuterPackage.getTypeGraph())) {
										if (pattern_NestedEnum_29_2_isapplicablecore_black_nac_3BB(ruleResult,
												eOuterTypeToTOuterInterface) == null) {
											if (pattern_NestedEnum_29_2_isapplicablecore_black_nac_1BB(ruleResult,
													tOuterType) == null) {
												if (pattern_NestedEnum_29_2_isapplicablecore_black_nac_4BB(ruleResult,
														eOuterType) == null) {
													if (pattern_NestedEnum_29_2_isapplicablecore_black_nac_0BB(
															ruleResult, typeGraph) == null) {
														if (pattern_NestedEnum_29_2_isapplicablecore_black_nac_2BB(
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

	public static final Object[] pattern_NestedEnum_29_3_solveCSP_bindingFBBBBBBBB(NestedEnum _this,
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

	public static final Object[] pattern_NestedEnum_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_NestedEnum_29_3_solveCSP_bindingAndBlackFBBBBBBBB(NestedEnum _this,
			IsApplicableMatch isApplicableMatch, TypeGraph typeGraph, TAbstractType tOuterType,
			TypeToTAbstractType eOuterTypeToTOuterInterface, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_NestedEnum_29_3_solveCSP_binding = pattern_NestedEnum_29_3_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage,
				ruleResult);
		if (result_pattern_NestedEnum_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_NestedEnum_29_3_solveCSP_binding[0];

			Object[] result_pattern_NestedEnum_29_3_solveCSP_black = pattern_NestedEnum_29_3_solveCSP_blackB(csp);
			if (result_pattern_NestedEnum_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeGraph, tOuterType, eOuterTypeToTOuterInterface,
						eOuterType, tOuterPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_NestedEnum_29_4_checkCSP_expressionFBB(NestedEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_NestedEnum_29_5_checknacs_blackBBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage) {
		return new Object[] { typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage };
	}

	public static final Object[] pattern_NestedEnum_29_6_perform_blackBBBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, TypeToTAbstractType eOuterTypeToTOuterInterface,
			AbstractTypeDeclaration eOuterType, TPackage tOuterPackage, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { typeGraph, tOuterType, eOuterTypeToTOuterInterface, eOuterType, tOuterPackage,
				ruleResult };
	}

	public static final Object[] pattern_NestedEnum_29_6_perform_greenFFFFBFBFBBBB(TypeGraph typeGraph,
			TAbstractType tOuterType, AbstractTypeDeclaration eOuterType, TPackage tOuterPackage,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TEnum tAnnotation = BasicFactory.eINSTANCE.createTEnum();
		EnumDeclaration eNestedType = JavaFactory.eINSTANCE.createEnumDeclaration();
		TypeToTAbstractType eNestedTypeToTNestedType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TPackage tNestedPackage = BasicFactory.eINSTANCE.createTPackage();
		TClass tNestedType = BasicFactory.eINSTANCE.createTClass();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		Object _localVariable_0 = csp.getValue("eNestedType", "name");
		Object _localVariable_1 = csp.getValue("eNestedType", "proxy");
		Object _localVariable_2 = csp.getValue("tNestedPackage", "tName");
		Object _localVariable_3 = csp.getValue("tNestedType", "tName");
		Object _localVariable_4 = csp.getValue("tNestedType", "tLib");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_5 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(tAnnotation);
		eNestedType.setAbstractTypeDeclaration(eOuterType);
		ruleResult.getSourceObjects().add(eNestedType);
		eNestedTypeToTNestedType.setSource(eNestedType);
		ruleResult.getCorrObjects().add(eNestedTypeToTNestedType);
		tOuterPackage.getSubpackage().add(tNestedPackage);
		tNestedPackage.setTypeGraph(typeGraph);
		ruleResult.getTargetObjects().add(tNestedPackage);
		tNestedPackage.getClasses().add(tNestedType);
		tNestedPackage.getOwnedTypes().add(tNestedType);
		typeGraph.getOwnedTypes().add(tNestedType);
		tNestedType.getTAnnotation().add(tAnnotation);
		tOuterType.getInnerTypes().add(tNestedType);
		typeGraph.getClasses().add(tNestedType);
		eNestedTypeToTNestedType.setTarget(tNestedType);
		ruleResult.getTargetObjects().add(tNestedType);
		mBodyToTAnnotation.setSource(eNestedType);
		mBodyToTAnnotation.setTarget(tNestedType);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		String eNestedType_name_prime = (String) _localVariable_0;
		boolean eNestedType_proxy_prime = (boolean) _localVariable_1;
		String tNestedPackage_tName_prime = (String) _localVariable_2;
		String tNestedType_tName_prime = (String) _localVariable_3;
		boolean tNestedType_tLib_prime = (boolean) _localVariable_4;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_5);
		eNestedType.setName(eNestedType_name_prime);
		eNestedType.setProxy(Boolean.valueOf(eNestedType_proxy_prime));
		tNestedPackage.setTName(tNestedPackage_tName_prime);
		tNestedType.setTName(tNestedType_tName_prime);
		tNestedType.setTLib(Boolean.valueOf(tNestedType_tLib_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tAnnotation, eNestedType, eNestedTypeToTNestedType, tNestedPackage, typeGraph,
				tNestedType, tOuterType, mBodyToTAnnotation, eOuterType, tOuterPackage, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_NestedEnum_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //NestedEnumImpl
