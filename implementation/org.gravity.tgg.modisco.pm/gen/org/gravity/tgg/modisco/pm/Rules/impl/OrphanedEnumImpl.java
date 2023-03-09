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

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MAbstractMethodDefinition;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.OrphanedEnum;
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
 * An implementation of the model object '<em><b>Orphaned Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OrphanedEnumImpl extends AbstractRuleImpl implements OrphanedEnum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrphanedEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getOrphanedEnum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model mModel, EnumDeclaration mType) {

		Object[] result1_black = OrphanedEnumImpl.pattern_OrphanedEnum_0_1_initialbindings_blackBBBB(this, match,
				mModel, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = OrphanedEnumImpl.pattern_OrphanedEnum_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, mModel, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OrphanedEnumImpl.pattern_OrphanedEnum_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OrphanedEnumImpl
					.pattern_OrphanedEnum_0_4_collectelementstobetranslated_blackBBB(match, mModel, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
			}
			OrphanedEnumImpl.pattern_OrphanedEnum_0_4_collectelementstobetranslated_greenBBBF(match, mModel, mType);
			//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = OrphanedEnumImpl.pattern_OrphanedEnum_0_5_collectcontextelements_blackBBB(match,
					mModel, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
			}
			OrphanedEnumImpl.pattern_OrphanedEnum_0_5_collectcontextelements_greenBB(match, mModel);

			// 
			OrphanedEnumImpl.pattern_OrphanedEnum_0_6_registerobjectstomatch_expressionBBBB(this, match, mModel, mType);
			return OrphanedEnumImpl.pattern_OrphanedEnum_0_7_expressionF();
		} else {
			return OrphanedEnumImpl.pattern_OrphanedEnum_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OrphanedEnumImpl
				.pattern_OrphanedEnum_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[0];
		Model mModel = (Model) result1_bindingAndBlack[1];
		TPackage tProxyPackage = (TPackage) result1_bindingAndBlack[2];
		EnumDeclaration mType = (EnumDeclaration) result1_bindingAndBlack[3];
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = OrphanedEnumImpl.pattern_OrphanedEnum_1_1_performtransformation_greenFFFFBBBB(pg,
				tProxyPackage, mType, csp);
		TClass tType = (TClass) result1_green[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[1];
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = (ASTNodeToTAnnotatable) result1_green[2];
		TEnum tEnum = (TEnum) result1_green[3];

		Object[] result2_black = OrphanedEnumImpl.pattern_OrphanedEnum_1_2_collecttranslatedelements_blackBBBBB(tType,
				mTypeToTType, mAnnotatableToTAnnotatable, tEnum, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
					+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mAnnotatableToTAnnotatable] = "
					+ mAnnotatableToTAnnotatable + ", " + "[tEnum] = " + tEnum + ", " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = OrphanedEnumImpl.pattern_OrphanedEnum_1_2_collecttranslatedelements_greenFBBBBB(tType,
				mTypeToTType, mAnnotatableToTAnnotatable, tEnum, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OrphanedEnumImpl.pattern_OrphanedEnum_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel, tProxyPackage, mType,
				mModelToTypeGraph);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mAnnotatableToTAnnotatable] = " + mAnnotatableToTAnnotatable + ", " + "[tEnum] = " + tEnum
					+ ", " + "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", " + "[tProxyPackage] = "
					+ tProxyPackage + ", " + "[mType] = " + mType + ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph
					+ ".");
		}
		OrphanedEnumImpl.pattern_OrphanedEnum_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(ruleresult, tType,
				mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel, tProxyPackage, mType);
		//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mAnnotatableToTAnnotatable__tType____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mAnnotatableToTAnnotatable__mType____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tEnum__tType____tAnnotated = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tType__tEnum____tAnnotation = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tProxyPackage__tType____ownedTypes = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tType__tProxyPackage____package = (EMoflonEdge) result3_green[19];

		// 
		// 
		OrphanedEnumImpl.pattern_OrphanedEnum_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, tType,
				mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel, tProxyPackage, mType, mModelToTypeGraph);
		return OrphanedEnumImpl.pattern_OrphanedEnum_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = OrphanedEnumImpl
				.pattern_OrphanedEnum_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OrphanedEnumImpl.pattern_OrphanedEnum_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OrphanedEnumImpl.pattern_OrphanedEnum_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model mModel = (Model) result2_binding[0];
		EnumDeclaration mType = (EnumDeclaration) result2_binding[1];
		for (Object[] result2_black : OrphanedEnumImpl.pattern_OrphanedEnum_2_2_corematch_blackFBBFB(mModel, mType,
				match)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : OrphanedEnumImpl.pattern_OrphanedEnum_2_3_findcontext_blackBBFBB(pg, mModel,
					mType, mModelToTypeGraph)) {
				TPackage tProxyPackage = (TPackage) result3_black[2];
				Object[] result3_green = OrphanedEnumImpl.pattern_OrphanedEnum_2_3_findcontext_greenBBBBBFFFFF(pg,
						mModel, tProxyPackage, mType, mModelToTypeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge pg__tProxyPackage____packages = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mModelToTypeGraph__pg____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = OrphanedEnumImpl
						.pattern_OrphanedEnum_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, pg, mModel,
								tProxyPackage, mType, mModelToTypeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pg] = " + pg + ", "
							+ "[mModel] = " + mModel + ", " + "[tProxyPackage] = " + tProxyPackage + ", " + "[mType] = "
							+ mType + ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OrphanedEnumImpl.pattern_OrphanedEnum_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OrphanedEnumImpl
							.pattern_OrphanedEnum_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OrphanedEnumImpl.pattern_OrphanedEnum_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return OrphanedEnumImpl.pattern_OrphanedEnum_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model mModel, EnumDeclaration mType) {
		match.registerObject("mModel", mModel);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model mModel, EnumDeclaration mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel,
			TPackage tProxyPackage, EnumDeclaration mType, ModelToTypeGraph mModelToTypeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");

		// Create unbound variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", csp);
		var_tType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("tProxyPackage", tProxyPackage);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType,
			EObject mAnnotatableToTAnnotatable, EObject tEnum, EObject pg, EObject mModel, EObject tProxyPackage,
			EObject mType, EObject mModelToTypeGraph) {
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mAnnotatableToTAnnotatable", mAnnotatableToTAnnotatable);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("tProxyPackage", tProxyPackage);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mType").eClass())
				.equals("java.EnumDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tType, TEnum tEnum, TypeGraph pg, TPackage tProxyPackage) {

		Object[] result1_black = OrphanedEnumImpl.pattern_OrphanedEnum_10_1_initialbindings_blackBBBBBB(this, match,
				tType, tEnum, pg, tProxyPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tEnum] = " + tEnum + ", "
					+ "[pg] = " + pg + ", " + "[tProxyPackage] = " + tProxyPackage + ".");
		}

		Object[] result2_bindingAndBlack = OrphanedEnumImpl.pattern_OrphanedEnum_10_2_SolveCSP_bindingAndBlackFBBBBBB(
				this, match, tType, tEnum, pg, tProxyPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tType] = " + tType + ", " + "[tEnum] = " + tEnum + ", "
					+ "[pg] = " + pg + ", " + "[tProxyPackage] = " + tProxyPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OrphanedEnumImpl.pattern_OrphanedEnum_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OrphanedEnumImpl
					.pattern_OrphanedEnum_10_4_collectelementstobetranslated_blackBBBBB(match, tType, tEnum, pg,
							tProxyPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tEnum] = " + tEnum + ", " + "[pg] = " + pg + ", "
						+ "[tProxyPackage] = " + tProxyPackage + ".");
			}
			OrphanedEnumImpl.pattern_OrphanedEnum_10_4_collectelementstobetranslated_greenBBBBBFFFFFF(match, tType,
					tEnum, pg, tProxyPackage);
			//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tEnum__tType____tAnnotated = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tType__tEnum____tAnnotation = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tProxyPackage__tType____ownedTypes = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tType__tProxyPackage____package = (EMoflonEdge) result4_green[10];

			Object[] result5_black = OrphanedEnumImpl.pattern_OrphanedEnum_10_5_collectcontextelements_blackBBBBB(match,
					tType, tEnum, pg, tProxyPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tType] = " + tType + ", " + "[tEnum] = " + tEnum + ", " + "[pg] = " + pg + ", "
						+ "[tProxyPackage] = " + tProxyPackage + ".");
			}
			OrphanedEnumImpl.pattern_OrphanedEnum_10_5_collectcontextelements_greenBBBF(match, pg, tProxyPackage);
			//nothing EMoflonEdge pg__tProxyPackage____packages = (EMoflonEdge) result5_green[3];

			// 
			OrphanedEnumImpl.pattern_OrphanedEnum_10_6_registerobjectstomatch_expressionBBBBBB(this, match, tType,
					tEnum, pg, tProxyPackage);
			return OrphanedEnumImpl.pattern_OrphanedEnum_10_7_expressionF();
		} else {
			return OrphanedEnumImpl.pattern_OrphanedEnum_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OrphanedEnumImpl
				.pattern_OrphanedEnum_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TClass tType = (TClass) result1_bindingAndBlack[0];
		TEnum tEnum = (TEnum) result1_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[2];
		Model mModel = (Model) result1_bindingAndBlack[3];
		TPackage tProxyPackage = (TPackage) result1_bindingAndBlack[4];
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = OrphanedEnumImpl.pattern_OrphanedEnum_11_1_performtransformation_greenBFFBFB(tType,
				mModel, csp);
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[1];
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = (ASTNodeToTAnnotatable) result1_green[2];
		EnumDeclaration mType = (EnumDeclaration) result1_green[4];

		Object[] result2_black = OrphanedEnumImpl.pattern_OrphanedEnum_11_2_collecttranslatedelements_blackBBBBB(tType,
				mTypeToTType, mAnnotatableToTAnnotatable, tEnum, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
					+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mAnnotatableToTAnnotatable] = "
					+ mAnnotatableToTAnnotatable + ", " + "[tEnum] = " + tEnum + ", " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = OrphanedEnumImpl.pattern_OrphanedEnum_11_2_collecttranslatedelements_greenFBBBBB(tType,
				mTypeToTType, mAnnotatableToTAnnotatable, tEnum, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OrphanedEnumImpl.pattern_OrphanedEnum_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel, tProxyPackage, mType,
				mModelToTypeGraph);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tType] = " + tType + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mAnnotatableToTAnnotatable] = " + mAnnotatableToTAnnotatable + ", " + "[tEnum] = " + tEnum
					+ ", " + "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", " + "[tProxyPackage] = "
					+ tProxyPackage + ", " + "[mType] = " + mType + ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph
					+ ".");
		}
		OrphanedEnumImpl.pattern_OrphanedEnum_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(ruleresult, tType,
				mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel, tProxyPackage, mType);
		//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mAnnotatableToTAnnotatable__tType____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mAnnotatableToTAnnotatable__mType____source = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tEnum__tType____tAnnotated = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tType__tEnum____tAnnotation = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tProxyPackage__tType____ownedTypes = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tType__tProxyPackage____package = (EMoflonEdge) result3_green[19];

		// 
		// 
		OrphanedEnumImpl.pattern_OrphanedEnum_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult, tType,
				mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel, tProxyPackage, mType, mModelToTypeGraph);
		return OrphanedEnumImpl.pattern_OrphanedEnum_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = OrphanedEnumImpl
				.pattern_OrphanedEnum_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OrphanedEnumImpl
				.pattern_OrphanedEnum_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OrphanedEnumImpl.pattern_OrphanedEnum_12_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tType = (TClass) result2_binding[0];
		TEnum tEnum = (TEnum) result2_binding[1];
		TypeGraph pg = (TypeGraph) result2_binding[2];
		TPackage tProxyPackage = (TPackage) result2_binding[3];
		for (Object[] result2_black : OrphanedEnumImpl.pattern_OrphanedEnum_12_2_corematch_blackBBBFBFB(tType, tEnum,
				pg, tProxyPackage, match)) {
			Model mModel = (Model) result2_black[3];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[5];
			// ForEach 
			for (Object[] result3_black : OrphanedEnumImpl.pattern_OrphanedEnum_12_3_findcontext_blackBBBBBB(tType,
					tEnum, pg, mModel, tProxyPackage, mModelToTypeGraph)) {
				Object[] result3_green = OrphanedEnumImpl.pattern_OrphanedEnum_12_3_findcontext_greenBBBBBBFFFFFFFFFF(
						tType, tEnum, pg, mModel, tProxyPackage, mModelToTypeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge pg__tProxyPackage____packages = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mModelToTypeGraph__pg____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tEnum__tType____tAnnotated = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tType__tEnum____tAnnotation = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tProxyPackage__tType____ownedTypes = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tType__tProxyPackage____package = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = OrphanedEnumImpl
						.pattern_OrphanedEnum_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, tType,
								tEnum, pg, mModel, tProxyPackage, mModelToTypeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tType] = " + tType + ", "
							+ "[tEnum] = " + tEnum + ", " + "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", "
							+ "[tProxyPackage] = " + tProxyPackage + ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OrphanedEnumImpl.pattern_OrphanedEnum_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OrphanedEnumImpl
							.pattern_OrphanedEnum_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OrphanedEnumImpl.pattern_OrphanedEnum_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return OrphanedEnumImpl.pattern_OrphanedEnum_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tType, TEnum tEnum, TypeGraph pg,
			TPackage tProxyPackage) {
		match.registerObject("tType", tType);
		match.registerObject("tEnum", tEnum);
		match.registerObject("pg", pg);
		match.registerObject("tProxyPackage", tProxyPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tType, TEnum tEnum, TypeGraph pg,
			TPackage tProxyPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tType, TEnum tEnum, TypeGraph pg,
			Model mModel, TPackage tProxyPackage, ModelToTypeGraph mModelToTypeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("tProxyPackage", tProxyPackage);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType,
			EObject mAnnotatableToTAnnotatable, EObject tEnum, EObject pg, EObject mModel, EObject tProxyPackage,
			EObject mType, EObject mModelToTypeGraph) {
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mAnnotatableToTAnnotatable", mAnnotatableToTAnnotatable);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("tProxyPackage", tProxyPackage);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tType").eClass()).equals("basic.TClass.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tEnum").eClass()).equals("basic.TEnum.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_90(EMoflonEdge _edge_ownedTypes) {

		Object[] result1_bindingAndBlack = OrphanedEnumImpl
				.pattern_OrphanedEnum_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OrphanedEnumImpl.pattern_OrphanedEnum_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OrphanedEnumImpl
				.pattern_OrphanedEnum_20_2_testcorematchandDECs_blackFFFFB(_edge_ownedTypes)) {
			TClass tType = (TClass) result2_black[0];
			TEnum tEnum = (TEnum) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			TPackage tProxyPackage = (TPackage) result2_black[3];
			Object[] result2_green = OrphanedEnumImpl.pattern_OrphanedEnum_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OrphanedEnumImpl.pattern_OrphanedEnum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
					this, match, tType, tEnum, pg, tProxyPackage)) {
				// 
				if (OrphanedEnumImpl
						.pattern_OrphanedEnum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = OrphanedEnumImpl.pattern_OrphanedEnum_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OrphanedEnumImpl.pattern_OrphanedEnum_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OrphanedEnumImpl.pattern_OrphanedEnum_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_93(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = OrphanedEnumImpl
				.pattern_OrphanedEnum_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OrphanedEnumImpl.pattern_OrphanedEnum_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OrphanedEnumImpl
				.pattern_OrphanedEnum_21_2_testcorematchandDECs_blackFFB(_edge_orphanTypes)) {
			Model mModel = (Model) result2_black[0];
			EnumDeclaration mType = (EnumDeclaration) result2_black[1];
			Object[] result2_green = OrphanedEnumImpl.pattern_OrphanedEnum_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OrphanedEnumImpl.pattern_OrphanedEnum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, mModel, mType)) {
				// 
				if (OrphanedEnumImpl
						.pattern_OrphanedEnum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = OrphanedEnumImpl.pattern_OrphanedEnum_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OrphanedEnumImpl.pattern_OrphanedEnum_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OrphanedEnumImpl.pattern_OrphanedEnum_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("OrphanedEnum");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tProxyPackage", "tName", "(proxies)", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("OrphanedEnum");
		eq0.solve(var_mType_name, var_tType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tType_tName.setBound(false);
			eq0.solve(var_mType_name, var_tType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tType", "tName", var_tType_tName.getValue());
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
		ruleResult.setRule("OrphanedEnum");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tProxyPackage", "tName", "(proxies)", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("OrphanedEnum");
		eq0.solve(var_mType_name, var_tType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mType_name.setBound(false);
			eq0.solve(var_mType_name, var_tType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mType", "name", var_mType_name.getValue());
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

		Object[] result1_black = OrphanedEnumImpl.pattern_OrphanedEnum_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OrphanedEnumImpl.pattern_OrphanedEnum_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = OrphanedEnumImpl
				.pattern_OrphanedEnum_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TClass tType = (TClass) result2_bindingAndBlack[0];
		TEnum tEnum = (TEnum) result2_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[2];
		Model mModel = (Model) result2_bindingAndBlack[3];
		TPackage tProxyPackage = (TPackage) result2_bindingAndBlack[4];
		EnumDeclaration mType = (EnumDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = OrphanedEnumImpl
				.pattern_OrphanedEnum_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tType, tEnum, pg, mModel,
						tProxyPackage, mType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tType] = " + tType + ", " + "[tEnum] = " + tEnum + ", " + "[pg] = " + pg + ", " + "[mModel] = "
					+ mModel + ", " + "[tProxyPackage] = " + tProxyPackage + ", " + "[mType] = " + mType + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (OrphanedEnumImpl.pattern_OrphanedEnum_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : OrphanedEnumImpl.pattern_OrphanedEnum_24_5_matchcorrcontext_blackBBFBB(pg,
					mModel, sourceMatch, targetMatch)) {
				ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result5_black[2];
				Object[] result5_green = OrphanedEnumImpl.pattern_OrphanedEnum_24_5_matchcorrcontext_greenBBBF(
						mModelToTypeGraph, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = OrphanedEnumImpl.pattern_OrphanedEnum_24_6_createcorrespondence_blackBBBBBBB(
						tType, tEnum, pg, mModel, tProxyPackage, mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
							+ "[tEnum] = " + tEnum + ", " + "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", "
							+ "[tProxyPackage] = " + tProxyPackage + ", " + "[mType] = " + mType + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				OrphanedEnumImpl.pattern_OrphanedEnum_24_6_createcorrespondence_greenBFFBB(tType, mType, ccMatch);
				//nothing TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[1];
				//nothing ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = (ASTNodeToTAnnotatable) result6_green[2];

				Object[] result7_black = OrphanedEnumImpl.pattern_OrphanedEnum_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				OrphanedEnumImpl.pattern_OrphanedEnum_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return OrphanedEnumImpl.pattern_OrphanedEnum_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TClass tType, TEnum tEnum, TypeGraph pg, Model mModel, TPackage tProxyPackage,
			EnumDeclaration mType, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);
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
	public boolean checkDEC_FWD(Model mModel, EnumDeclaration mType) {// 
		Object[] result1_black = OrphanedEnumImpl.pattern_OrphanedEnum_27_1_matchtggpattern_blackBB(mModel, mType);
		if (result1_black != null) {
			return OrphanedEnumImpl.pattern_OrphanedEnum_27_2_expressionF();
		} else {
			return OrphanedEnumImpl.pattern_OrphanedEnum_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tType, TEnum tEnum, TypeGraph pg, TPackage tProxyPackage) {// 
		Object[] result1_black = OrphanedEnumImpl.pattern_OrphanedEnum_28_1_matchtggpattern_blackBBBB(tType, tEnum, pg,
				tProxyPackage);
		if (result1_black != null) {
			return OrphanedEnumImpl.pattern_OrphanedEnum_28_2_expressionF();
		} else {
			return OrphanedEnumImpl.pattern_OrphanedEnum_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph mModelToTypeGraphParameter) {

		Object[] result1_black = OrphanedEnumImpl.pattern_OrphanedEnum_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OrphanedEnumImpl.pattern_OrphanedEnum_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : OrphanedEnumImpl
				.pattern_OrphanedEnum_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mModelToTypeGraphList = (RuleEntryList) result2_black[0];
			TypeGraph pg = (TypeGraph) result2_black[1];
			TPackage tProxyPackage = (TPackage) result2_black[2];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			Model mModel = (Model) result2_black[4];

			Object[] result3_bindingAndBlack = OrphanedEnumImpl
					.pattern_OrphanedEnum_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, pg, mModel,
							tProxyPackage, mModelToTypeGraph, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pg] = " + pg + ", " + "[mModel] = "
						+ mModel + ", " + "[tProxyPackage] = " + tProxyPackage + ", " + "[mModelToTypeGraph] = "
						+ mModelToTypeGraph + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (OrphanedEnumImpl.pattern_OrphanedEnum_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = OrphanedEnumImpl.pattern_OrphanedEnum_29_5_checknacs_blackBBBB(pg, mModel,
						tProxyPackage, mModelToTypeGraph);
				if (result5_black != null) {

					Object[] result6_black = OrphanedEnumImpl.pattern_OrphanedEnum_29_6_perform_blackBBBBB(pg, mModel,
							tProxyPackage, mModelToTypeGraph, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pg] = " + pg + ", "
								+ "[mModel] = " + mModel + ", " + "[tProxyPackage] = " + tProxyPackage + ", "
								+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					OrphanedEnumImpl.pattern_OrphanedEnum_29_6_perform_greenFFFFBBBFBB(pg, mModel, tProxyPackage,
							ruleResult, csp);
					//nothing TClass tType = (TClass) result6_green[0];
					//nothing TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[1];
					//nothing ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = (ASTNodeToTAnnotatable) result6_green[2];
					//nothing TEnum tEnum = (TEnum) result6_green[3];
					//nothing EnumDeclaration mType = (EnumDeclaration) result6_green[7];

				} else {
				}

			} else {
			}

		}
		return OrphanedEnumImpl.pattern_OrphanedEnum_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel,
			TPackage tProxyPackage, ModelToTypeGraph mModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", csp);
		var_tType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("tProxyPackage", tProxyPackage);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
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
		case RulesPackage.ORPHANED_ENUM___IS_APPROPRIATE_FWD__MATCH_MODEL_ENUMDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(EnumDeclaration) arguments.get(2));
		case RulesPackage.ORPHANED_ENUM___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_ENUMDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(EnumDeclaration) arguments.get(2));
			return null;
		case RulesPackage.ORPHANED_ENUM___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_ENUMDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(EnumDeclaration) arguments.get(2));
		case RulesPackage.ORPHANED_ENUM___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEGRAPH_MODEL_TPACKAGE_ENUMDECLARATION_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(Model) arguments.get(2), (TPackage) arguments.get(3), (EnumDeclaration) arguments.get(4),
					(ModelToTypeGraph) arguments.get(5));
		case RulesPackage.ORPHANED_ENUM___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ORPHANED_ENUM___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___IS_APPROPRIATE_BWD__MATCH_TCLASS_TENUM_TYPEGRAPH_TPACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TEnum) arguments.get(2),
					(TypeGraph) arguments.get(3), (TPackage) arguments.get(4));
		case RulesPackage.ORPHANED_ENUM___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TENUM_TYPEGRAPH_TPACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TEnum) arguments.get(2),
					(TypeGraph) arguments.get(3), (TPackage) arguments.get(4));
			return null;
		case RulesPackage.ORPHANED_ENUM___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TENUM_TYPEGRAPH_TPACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TEnum) arguments.get(2), (TypeGraph) arguments.get(3), (TPackage) arguments.get(4));
		case RulesPackage.ORPHANED_ENUM___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_TENUM_TYPEGRAPH_MODEL_TPACKAGE_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(TEnum) arguments.get(2), (TypeGraph) arguments.get(3), (Model) arguments.get(4),
					(TPackage) arguments.get(5), (ModelToTypeGraph) arguments.get(6));
		case RulesPackage.ORPHANED_ENUM___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.ORPHANED_ENUM___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___IS_APPROPRIATE_BWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_90((EMoflonEdge) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___IS_APPROPRIATE_FWD_EMOFLON_EDGE_93__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_93((EMoflonEdge) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ORPHANED_ENUM___IS_APPLICABLE_SOLVE_CSP_CC__TCLASS_TENUM_TYPEGRAPH_MODEL_TPACKAGE_ENUMDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TClass) arguments.get(0), (TEnum) arguments.get(1),
					(TypeGraph) arguments.get(2), (Model) arguments.get(3), (TPackage) arguments.get(4),
					(EnumDeclaration) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.ORPHANED_ENUM___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_ENUM___CHECK_DEC_FWD__MODEL_ENUMDECLARATION:
			return checkDEC_FWD((Model) arguments.get(0), (EnumDeclaration) arguments.get(1));
		case RulesPackage.ORPHANED_ENUM___CHECK_DEC_BWD__TCLASS_TENUM_TYPEGRAPH_TPACKAGE:
			return checkDEC_BWD((TClass) arguments.get(0), (TEnum) arguments.get(1), (TypeGraph) arguments.get(2),
					(TPackage) arguments.get(3));
		case RulesPackage.ORPHANED_ENUM___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.ORPHANED_ENUM___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_MODEL_TPACKAGE_MODELTOTYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(Model) arguments.get(2), (TPackage) arguments.get(3), (ModelToTypeGraph) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.ORPHANED_ENUM___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_OrphanedEnum_0_1_initialbindings_blackBBBB(OrphanedEnum _this, Match match,
			Model mModel, EnumDeclaration mType) {
		return new Object[] { _this, match, mModel, mType };
	}

	public static final Object[] pattern_OrphanedEnum_0_2_SolveCSP_bindingFBBBB(OrphanedEnum _this, Match match,
			Model mModel, EnumDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mModel, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mModel, mType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedEnum_0_2_SolveCSP_bindingAndBlackFBBBB(OrphanedEnum _this, Match match,
			Model mModel, EnumDeclaration mType) {
		Object[] result_pattern_OrphanedEnum_0_2_SolveCSP_binding = pattern_OrphanedEnum_0_2_SolveCSP_bindingFBBBB(
				_this, match, mModel, mType);
		if (result_pattern_OrphanedEnum_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedEnum_0_2_SolveCSP_binding[0];

			Object[] result_pattern_OrphanedEnum_0_2_SolveCSP_black = pattern_OrphanedEnum_0_2_SolveCSP_blackB(csp);
			if (result_pattern_OrphanedEnum_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mModel, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedEnum_0_3_CheckCSP_expressionFBB(OrphanedEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_0_4_collectelementstobetranslated_blackBBB(Match match,
			Model mModel, EnumDeclaration mType) {
		return new Object[] { match, mModel, mType };
	}

	public static final Object[] pattern_OrphanedEnum_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Model mModel, EnumDeclaration mType) {
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mType);
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		match.getToBeTranslatedEdges().add(mModel__mType____orphanTypes);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		return new Object[] { match, mModel, mType, mModel__mType____orphanTypes };
	}

	public static final Object[] pattern_OrphanedEnum_0_5_collectcontextelements_blackBBB(Match match, Model mModel,
			EnumDeclaration mType) {
		return new Object[] { match, mModel, mType };
	}

	public static final Object[] pattern_OrphanedEnum_0_5_collectcontextelements_greenBB(Match match, Model mModel) {
		match.getContextNodes().add(mModel);
		return new Object[] { match, mModel };
	}

	public static final void pattern_OrphanedEnum_0_6_registerobjectstomatch_expressionBBBB(OrphanedEnum _this,
			Match match, Model mModel, EnumDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mModel, mType);

	}

	public static final boolean pattern_OrphanedEnum_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedEnum_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("pg");
		EObject _localVariable_1 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("tProxyPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("mType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject tmpPg = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		EObject tmpTProxyPackage = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpMModelToTypeGraph = _localVariable_4;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				if (tmpTProxyPackage instanceof TPackage) {
					TPackage tProxyPackage = (TPackage) tmpTProxyPackage;
					if (tmpMType instanceof EnumDeclaration) {
						EnumDeclaration mType = (EnumDeclaration) tmpMType;
						if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
							ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
							return new Object[] { pg, mModel, tProxyPackage, mType, mModelToTypeGraph,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_1_1_performtransformation_blackBBBBBFBB(TypeGraph pg,
			Model mModel, TPackage tProxyPackage, EnumDeclaration mType, ModelToTypeGraph mModelToTypeGraph,
			OrphanedEnum _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pg, mModel, tProxyPackage, mType, mModelToTypeGraph, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			OrphanedEnum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OrphanedEnum_1_1_performtransformation_binding = pattern_OrphanedEnum_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_OrphanedEnum_1_1_performtransformation_binding != null) {
			TypeGraph pg = (TypeGraph) result_pattern_OrphanedEnum_1_1_performtransformation_binding[0];
			Model mModel = (Model) result_pattern_OrphanedEnum_1_1_performtransformation_binding[1];
			TPackage tProxyPackage = (TPackage) result_pattern_OrphanedEnum_1_1_performtransformation_binding[2];
			EnumDeclaration mType = (EnumDeclaration) result_pattern_OrphanedEnum_1_1_performtransformation_binding[3];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_OrphanedEnum_1_1_performtransformation_binding[4];

			Object[] result_pattern_OrphanedEnum_1_1_performtransformation_black = pattern_OrphanedEnum_1_1_performtransformation_blackBBBBBFBB(
					pg, mModel, tProxyPackage, mType, mModelToTypeGraph, _this, isApplicableMatch);
			if (result_pattern_OrphanedEnum_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OrphanedEnum_1_1_performtransformation_black[5];

				return new Object[] { pg, mModel, tProxyPackage, mType, mModelToTypeGraph, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_1_1_performtransformation_greenFFFFBBBB(TypeGraph pg,
			TPackage tProxyPackage, EnumDeclaration mType, CSP csp) {
		TClass tType = BasicFactory.eINSTANCE.createTClass();
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TEnum tEnum = BasicFactory.eINSTANCE.createTEnum();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		pg.getOwnedTypes().add(tType);
		tProxyPackage.getOwnedTypes().add(tType);
		mTypeToTType.setTarget(tType);
		mTypeToTType.setSource(mType);
		mAnnotatableToTAnnotatable.setTarget(tType);
		mAnnotatableToTAnnotatable.setSource(mType);
		tEnum.setTAnnotated(tType);
		String tType_tName_prime = (String) _localVariable_0;
		tType.setTName(tType_tName_prime);
		return new Object[] { tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, tProxyPackage, mType, csp };
	}

	public static final Object[] pattern_OrphanedEnum_1_2_collecttranslatedelements_blackBBBBB(TClass tType,
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mAnnotatableToTAnnotatable, TEnum tEnum,
			EnumDeclaration mType) {
		return new Object[] { tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, mType };
	}

	public static final Object[] pattern_OrphanedEnum_1_2_collecttranslatedelements_greenFBBBBB(TClass tType,
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mAnnotatableToTAnnotatable, TEnum tEnum,
			EnumDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedLinkElements().add(mAnnotatableToTAnnotatable);
		ruleresult.getCreatedElements().add(tEnum);
		ruleresult.getTranslatedElements().add(mType);
		return new Object[] { ruleresult, tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, mType };
	}

	public static final Object[] pattern_OrphanedEnum_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mAnnotatableToTAnnotatable,
			EObject tEnum, EObject pg, EObject mModel, EObject tProxyPackage, EObject mType,
			EObject mModelToTypeGraph) {
		if (!mTypeToTType.equals(tType)) {
			if (!mTypeToTType.equals(tEnum)) {
				if (!mTypeToTType.equals(pg)) {
					if (!mTypeToTType.equals(tProxyPackage)) {
						if (!mAnnotatableToTAnnotatable.equals(tType)) {
							if (!mAnnotatableToTAnnotatable.equals(mTypeToTType)) {
								if (!mAnnotatableToTAnnotatable.equals(tEnum)) {
									if (!mAnnotatableToTAnnotatable.equals(pg)) {
										if (!mAnnotatableToTAnnotatable.equals(mModel)) {
											if (!mAnnotatableToTAnnotatable.equals(tProxyPackage)) {
												if (!mAnnotatableToTAnnotatable.equals(mType)) {
													if (!mAnnotatableToTAnnotatable.equals(mModelToTypeGraph)) {
														if (!tEnum.equals(tType)) {
															if (!tEnum.equals(tProxyPackage)) {
																if (!pg.equals(tType)) {
																	if (!pg.equals(tEnum)) {
																		if (!pg.equals(tProxyPackage)) {
																			if (!mModel.equals(tType)) {
																				if (!mModel.equals(mTypeToTType)) {
																					if (!mModel.equals(tEnum)) {
																						if (!mModel.equals(pg)) {
																							if (!mModel.equals(
																									tProxyPackage)) {
																								if (!mModel.equals(
																										mType)) {
																									if (!mModel.equals(
																											mModelToTypeGraph)) {
																										if (!tProxyPackage
																												.equals(tType)) {
																											if (!mType
																													.equals(tType)) {
																												if (!mType
																														.equals(mTypeToTType)) {
																													if (!mType
																															.equals(tEnum)) {
																														if (!mType
																																.equals(pg)) {
																															if (!mType
																																	.equals(tProxyPackage)) {
																																if (!mModelToTypeGraph
																																		.equals(tType)) {
																																	if (!mModelToTypeGraph
																																			.equals(mTypeToTType)) {
																																		if (!mModelToTypeGraph
																																				.equals(tEnum)) {
																																			if (!mModelToTypeGraph
																																					.equals(pg)) {
																																				if (!mModelToTypeGraph
																																						.equals(tProxyPackage)) {
																																					if (!mModelToTypeGraph
																																							.equals(mType)) {
																																						return new Object[] {
																																								ruleresult,
																																								tType,
																																								mTypeToTType,
																																								mAnnotatableToTAnnotatable,
																																								tEnum,
																																								pg,
																																								mModel,
																																								tProxyPackage,
																																								mType,
																																								mModelToTypeGraph };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_OrphanedEnum_1_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mAnnotatableToTAnnotatable,
			EObject tEnum, EObject pg, EObject mModel, EObject tProxyPackage, EObject mType) {
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotatableToTAnnotatable__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotatableToTAnnotatable__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tEnum____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tProxyPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tProxyPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OrphanedEnum";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mTypeToTType__tType____target_name_prime = "target";
		String mAnnotatableToTAnnotatable__tType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String mAnnotatableToTAnnotatable__mType____source_name_prime = "source";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		String tEnum__tType____tAnnotated_name_prime = "tAnnotated";
		String tType__tEnum____tAnnotation_name_prime = "tAnnotation";
		String tProxyPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tProxyPackage____package_name_prime = "package";
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mModel__mType____orphanTypes);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		mAnnotatableToTAnnotatable__tType____target.setSrc(mAnnotatableToTAnnotatable);
		mAnnotatableToTAnnotatable__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mAnnotatableToTAnnotatable__tType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		mAnnotatableToTAnnotatable__mType____source.setSrc(mAnnotatableToTAnnotatable);
		mAnnotatableToTAnnotatable__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mAnnotatableToTAnnotatable__mType____source);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tType__pg____model);
		tEnum__tType____tAnnotated.setSrc(tEnum);
		tEnum__tType____tAnnotated.setTrg(tType);
		ruleresult.getCreatedEdges().add(tEnum__tType____tAnnotated);
		tType__tEnum____tAnnotation.setSrc(tType);
		tType__tEnum____tAnnotation.setTrg(tEnum);
		ruleresult.getCreatedEdges().add(tType__tEnum____tAnnotation);
		tProxyPackage__tType____ownedTypes.setSrc(tProxyPackage);
		tProxyPackage__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(tProxyPackage__tType____ownedTypes);
		tType__tProxyPackage____package.setSrc(tType);
		tType__tProxyPackage____package.setTrg(tProxyPackage);
		ruleresult.getCreatedEdges().add(tType__tProxyPackage____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mAnnotatableToTAnnotatable__tType____target.setName(mAnnotatableToTAnnotatable__tType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mAnnotatableToTAnnotatable__mType____source.setName(mAnnotatableToTAnnotatable__mType____source_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		tEnum__tType____tAnnotated.setName(tEnum__tType____tAnnotated_name_prime);
		tType__tEnum____tAnnotation.setName(tType__tEnum____tAnnotation_name_prime);
		tProxyPackage__tType____ownedTypes.setName(tProxyPackage__tType____ownedTypes_name_prime);
		tType__tProxyPackage____package.setName(tType__tProxyPackage____package_name_prime);
		return new Object[] { ruleresult, tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel,
				tProxyPackage, mType, mModel__mType____orphanTypes, mTypeToTType__tType____target,
				mAnnotatableToTAnnotatable__tType____target, mTypeToTType__mType____source,
				mAnnotatableToTAnnotatable__mType____source, pg__tType____ownedTypes, tType__pg____model,
				tEnum__tType____tAnnotated, tType__tEnum____tAnnotation, tProxyPackage__tType____ownedTypes,
				tType__tProxyPackage____package };
	}

	public static final void pattern_OrphanedEnum_1_5_registerobjects_expressionBBBBBBBBBBB(OrphanedEnum _this,
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mAnnotatableToTAnnotatable,
			EObject tEnum, EObject pg, EObject mModel, EObject tProxyPackage, EObject mType,
			EObject mModelToTypeGraph) {
		_this.registerObjects_FWD(ruleresult, tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel,
				tProxyPackage, mType, mModelToTypeGraph);

	}

	public static final PerformRuleResult pattern_OrphanedEnum_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_2_1_preparereturnvalue_bindingFB(OrphanedEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_2_1_preparereturnvalue_blackFBB(EClass eClass,
			OrphanedEnum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_2_1_preparereturnvalue_bindingAndBlackFFB(OrphanedEnum _this) {
		Object[] result_pattern_OrphanedEnum_2_1_preparereturnvalue_binding = pattern_OrphanedEnum_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedEnum_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OrphanedEnum_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedEnum_2_1_preparereturnvalue_black = pattern_OrphanedEnum_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OrphanedEnum_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OrphanedEnum_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OrphanedEnum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OrphanedEnum_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mModel");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMModel = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			if (tmpMType instanceof EnumDeclaration) {
				EnumDeclaration mType = (EnumDeclaration) tmpMType;
				return new Object[] { mModel, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedEnum_2_2_corematch_blackFBBFB(Model mModel,
			EnumDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
			TypeGraph pg = mModelToTypeGraph.getTarget();
			if (pg != null) {
				_result.add(new Object[] { pg, mModel, mType, mModelToTypeGraph, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedEnum_2_3_findcontext_blackBBFBB(TypeGraph pg, Model mModel,
			EnumDeclaration mType, ModelToTypeGraph mModelToTypeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModel.getOrphanTypes().contains(mType)) {
			if (mModel.equals(mModelToTypeGraph.getSource())) {
				if (pg.equals(mModelToTypeGraph.getTarget())) {
					for (TPackage tProxyPackage : pg.getPackages()) {
						String tProxyPackage_tName = tProxyPackage.getTName();
						if (tProxyPackage_tName.equals("(proxies)")) {
							_result.add(new Object[] { pg, mModel, tProxyPackage, mType, mModelToTypeGraph });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_2_3_findcontext_greenBBBBBFFFFF(TypeGraph pg, Model mModel,
			TPackage tProxyPackage, EnumDeclaration mType, ModelToTypeGraph mModelToTypeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tProxyPackage____packages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		String pg__tProxyPackage____packages_name_prime = "packages";
		String mModelToTypeGraph__pg____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(tProxyPackage);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mModel__mType____orphanTypes);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		pg__tProxyPackage____packages.setSrc(pg);
		pg__tProxyPackage____packages.setTrg(tProxyPackage);
		isApplicableMatch.getAllContextElements().add(pg__tProxyPackage____packages);
		mModelToTypeGraph__pg____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__pg____target);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		pg__tProxyPackage____packages.setName(pg__tProxyPackage____packages_name_prime);
		mModelToTypeGraph__pg____target.setName(mModelToTypeGraph__pg____target_name_prime);
		return new Object[] { pg, mModel, tProxyPackage, mType, mModelToTypeGraph, isApplicableMatch,
				mModel__mType____orphanTypes, mModelToTypeGraph__mModel____source, pg__tProxyPackage____packages,
				mModelToTypeGraph__pg____target };
	}

	public static final Object[] pattern_OrphanedEnum_2_4_solveCSP_bindingFBBBBBBB(OrphanedEnum _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel, TPackage tProxyPackage,
			EnumDeclaration mType, ModelToTypeGraph mModelToTypeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pg, mModel, tProxyPackage, mType,
				mModelToTypeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pg, mModel, tProxyPackage, mType, mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedEnum_2_4_solveCSP_bindingAndBlackFBBBBBBB(OrphanedEnum _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel, TPackage tProxyPackage,
			EnumDeclaration mType, ModelToTypeGraph mModelToTypeGraph) {
		Object[] result_pattern_OrphanedEnum_2_4_solveCSP_binding = pattern_OrphanedEnum_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, pg, mModel, tProxyPackage, mType, mModelToTypeGraph);
		if (result_pattern_OrphanedEnum_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedEnum_2_4_solveCSP_binding[0];

			Object[] result_pattern_OrphanedEnum_2_4_solveCSP_black = pattern_OrphanedEnum_2_4_solveCSP_blackB(csp);
			if (result_pattern_OrphanedEnum_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pg, mModel, tProxyPackage, mType,
						mModelToTypeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedEnum_2_5_checkCSP_expressionFBB(OrphanedEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OrphanedEnum_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OrphanedEnum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OrphanedEnum_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_10_1_initialbindings_blackBBBBBB(OrphanedEnum _this, Match match,
			TClass tType, TEnum tEnum, TypeGraph pg, TPackage tProxyPackage) {
		return new Object[] { _this, match, tType, tEnum, pg, tProxyPackage };
	}

	public static final Object[] pattern_OrphanedEnum_10_2_SolveCSP_bindingFBBBBBB(OrphanedEnum _this, Match match,
			TClass tType, TEnum tEnum, TypeGraph pg, TPackage tProxyPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tType, tEnum, pg, tProxyPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tType, tEnum, pg, tProxyPackage };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedEnum_10_2_SolveCSP_bindingAndBlackFBBBBBB(OrphanedEnum _this,
			Match match, TClass tType, TEnum tEnum, TypeGraph pg, TPackage tProxyPackage) {
		Object[] result_pattern_OrphanedEnum_10_2_SolveCSP_binding = pattern_OrphanedEnum_10_2_SolveCSP_bindingFBBBBBB(
				_this, match, tType, tEnum, pg, tProxyPackage);
		if (result_pattern_OrphanedEnum_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedEnum_10_2_SolveCSP_binding[0];

			Object[] result_pattern_OrphanedEnum_10_2_SolveCSP_black = pattern_OrphanedEnum_10_2_SolveCSP_blackB(csp);
			if (result_pattern_OrphanedEnum_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tType, tEnum, pg, tProxyPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedEnum_10_3_CheckCSP_expressionFBB(OrphanedEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_10_4_collectelementstobetranslated_blackBBBBB(Match match,
			TClass tType, TEnum tEnum, TypeGraph pg, TPackage tProxyPackage) {
		return new Object[] { match, tType, tEnum, pg, tProxyPackage };
	}

	public static final Object[] pattern_OrphanedEnum_10_4_collectelementstobetranslated_greenBBBBBFFFFFF(Match match,
			TClass tType, TEnum tEnum, TypeGraph pg, TPackage tProxyPackage) {
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tEnum____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tProxyPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tProxyPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		match.getToBeTranslatedNodes().add(tEnum);
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		String tEnum__tType____tAnnotated_name_prime = "tAnnotated";
		String tType__tEnum____tAnnotation_name_prime = "tAnnotation";
		String tProxyPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tProxyPackage____package_name_prime = "package";
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____model);
		tEnum__tType____tAnnotated.setSrc(tEnum);
		tEnum__tType____tAnnotated.setTrg(tType);
		match.getToBeTranslatedEdges().add(tEnum__tType____tAnnotated);
		tType__tEnum____tAnnotation.setSrc(tType);
		tType__tEnum____tAnnotation.setTrg(tEnum);
		match.getToBeTranslatedEdges().add(tType__tEnum____tAnnotation);
		tProxyPackage__tType____ownedTypes.setSrc(tProxyPackage);
		tProxyPackage__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(tProxyPackage__tType____ownedTypes);
		tType__tProxyPackage____package.setSrc(tType);
		tType__tProxyPackage____package.setTrg(tProxyPackage);
		match.getToBeTranslatedEdges().add(tType__tProxyPackage____package);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		tEnum__tType____tAnnotated.setName(tEnum__tType____tAnnotated_name_prime);
		tType__tEnum____tAnnotation.setName(tType__tEnum____tAnnotation_name_prime);
		tProxyPackage__tType____ownedTypes.setName(tProxyPackage__tType____ownedTypes_name_prime);
		tType__tProxyPackage____package.setName(tType__tProxyPackage____package_name_prime);
		return new Object[] { match, tType, tEnum, pg, tProxyPackage, pg__tType____ownedTypes, tType__pg____model,
				tEnum__tType____tAnnotated, tType__tEnum____tAnnotation, tProxyPackage__tType____ownedTypes,
				tType__tProxyPackage____package };
	}

	public static final Object[] pattern_OrphanedEnum_10_5_collectcontextelements_blackBBBBB(Match match, TClass tType,
			TEnum tEnum, TypeGraph pg, TPackage tProxyPackage) {
		return new Object[] { match, tType, tEnum, pg, tProxyPackage };
	}

	public static final Object[] pattern_OrphanedEnum_10_5_collectcontextelements_greenBBBF(Match match, TypeGraph pg,
			TPackage tProxyPackage) {
		EMoflonEdge pg__tProxyPackage____packages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pg);
		match.getContextNodes().add(tProxyPackage);
		String pg__tProxyPackage____packages_name_prime = "packages";
		pg__tProxyPackage____packages.setSrc(pg);
		pg__tProxyPackage____packages.setTrg(tProxyPackage);
		match.getContextEdges().add(pg__tProxyPackage____packages);
		pg__tProxyPackage____packages.setName(pg__tProxyPackage____packages_name_prime);
		return new Object[] { match, pg, tProxyPackage, pg__tProxyPackage____packages };
	}

	public static final void pattern_OrphanedEnum_10_6_registerobjectstomatch_expressionBBBBBB(OrphanedEnum _this,
			Match match, TClass tType, TEnum tEnum, TypeGraph pg, TPackage tProxyPackage) {
		_this.registerObjectsToMatch_BWD(match, tType, tEnum, pg, tProxyPackage);

	}

	public static final boolean pattern_OrphanedEnum_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedEnum_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tEnum");
		EObject _localVariable_2 = isApplicableMatch.getObject("pg");
		EObject _localVariable_3 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_4 = isApplicableMatch.getObject("tProxyPackage");
		EObject _localVariable_5 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject tmpTType = _localVariable_0;
		EObject tmpTEnum = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpMModel = _localVariable_3;
		EObject tmpTProxyPackage = _localVariable_4;
		EObject tmpMModelToTypeGraph = _localVariable_5;
		if (tmpTType instanceof TClass) {
			TClass tType = (TClass) tmpTType;
			if (tmpTEnum instanceof TEnum) {
				TEnum tEnum = (TEnum) tmpTEnum;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpMModel instanceof Model) {
						Model mModel = (Model) tmpMModel;
						if (tmpTProxyPackage instanceof TPackage) {
							TPackage tProxyPackage = (TPackage) tmpTProxyPackage;
							if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
								ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
								return new Object[] { tType, tEnum, pg, mModel, tProxyPackage, mModelToTypeGraph,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_11_1_performtransformation_blackBBBBBBFBB(TClass tType,
			TEnum tEnum, TypeGraph pg, Model mModel, TPackage tProxyPackage, ModelToTypeGraph mModelToTypeGraph,
			OrphanedEnum _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tType, tEnum, pg, mModel, tProxyPackage, mModelToTypeGraph, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OrphanedEnum _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OrphanedEnum_11_1_performtransformation_binding = pattern_OrphanedEnum_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OrphanedEnum_11_1_performtransformation_binding != null) {
			TClass tType = (TClass) result_pattern_OrphanedEnum_11_1_performtransformation_binding[0];
			TEnum tEnum = (TEnum) result_pattern_OrphanedEnum_11_1_performtransformation_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_OrphanedEnum_11_1_performtransformation_binding[2];
			Model mModel = (Model) result_pattern_OrphanedEnum_11_1_performtransformation_binding[3];
			TPackage tProxyPackage = (TPackage) result_pattern_OrphanedEnum_11_1_performtransformation_binding[4];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_OrphanedEnum_11_1_performtransformation_binding[5];

			Object[] result_pattern_OrphanedEnum_11_1_performtransformation_black = pattern_OrphanedEnum_11_1_performtransformation_blackBBBBBBFBB(
					tType, tEnum, pg, mModel, tProxyPackage, mModelToTypeGraph, _this, isApplicableMatch);
			if (result_pattern_OrphanedEnum_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OrphanedEnum_11_1_performtransformation_black[6];

				return new Object[] { tType, tEnum, pg, mModel, tProxyPackage, mModelToTypeGraph, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_11_1_performtransformation_greenBFFBFB(TClass tType, Model mModel,
			CSP csp) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		EnumDeclaration mType = JavaFactory.eINSTANCE.createEnumDeclaration();
		Object _localVariable_0 = csp.getValue("mType", "name");
		mTypeToTType.setTarget(tType);
		mAnnotatableToTAnnotatable.setTarget(tType);
		mModel.getOrphanTypes().add(mType);
		mTypeToTType.setSource(mType);
		mAnnotatableToTAnnotatable.setSource(mType);
		String mType_name_prime = (String) _localVariable_0;
		mType.setName(mType_name_prime);
		return new Object[] { tType, mTypeToTType, mAnnotatableToTAnnotatable, mModel, mType, csp };
	}

	public static final Object[] pattern_OrphanedEnum_11_2_collecttranslatedelements_blackBBBBB(TClass tType,
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mAnnotatableToTAnnotatable, TEnum tEnum,
			EnumDeclaration mType) {
		return new Object[] { tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, mType };
	}

	public static final Object[] pattern_OrphanedEnum_11_2_collecttranslatedelements_greenFBBBBB(TClass tType,
			TypeToTAbstractType mTypeToTType, ASTNodeToTAnnotatable mAnnotatableToTAnnotatable, TEnum tEnum,
			EnumDeclaration mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedLinkElements().add(mAnnotatableToTAnnotatable);
		ruleresult.getTranslatedElements().add(tEnum);
		ruleresult.getCreatedElements().add(mType);
		return new Object[] { ruleresult, tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, mType };
	}

	public static final Object[] pattern_OrphanedEnum_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mAnnotatableToTAnnotatable,
			EObject tEnum, EObject pg, EObject mModel, EObject tProxyPackage, EObject mType,
			EObject mModelToTypeGraph) {
		if (!mTypeToTType.equals(tType)) {
			if (!mTypeToTType.equals(tEnum)) {
				if (!mTypeToTType.equals(pg)) {
					if (!mTypeToTType.equals(tProxyPackage)) {
						if (!mAnnotatableToTAnnotatable.equals(tType)) {
							if (!mAnnotatableToTAnnotatable.equals(mTypeToTType)) {
								if (!mAnnotatableToTAnnotatable.equals(tEnum)) {
									if (!mAnnotatableToTAnnotatable.equals(pg)) {
										if (!mAnnotatableToTAnnotatable.equals(mModel)) {
											if (!mAnnotatableToTAnnotatable.equals(tProxyPackage)) {
												if (!mAnnotatableToTAnnotatable.equals(mType)) {
													if (!mAnnotatableToTAnnotatable.equals(mModelToTypeGraph)) {
														if (!tEnum.equals(tType)) {
															if (!tEnum.equals(tProxyPackage)) {
																if (!pg.equals(tType)) {
																	if (!pg.equals(tEnum)) {
																		if (!pg.equals(tProxyPackage)) {
																			if (!mModel.equals(tType)) {
																				if (!mModel.equals(mTypeToTType)) {
																					if (!mModel.equals(tEnum)) {
																						if (!mModel.equals(pg)) {
																							if (!mModel.equals(
																									tProxyPackage)) {
																								if (!mModel.equals(
																										mType)) {
																									if (!mModel.equals(
																											mModelToTypeGraph)) {
																										if (!tProxyPackage
																												.equals(tType)) {
																											if (!mType
																													.equals(tType)) {
																												if (!mType
																														.equals(mTypeToTType)) {
																													if (!mType
																															.equals(tEnum)) {
																														if (!mType
																																.equals(pg)) {
																															if (!mType
																																	.equals(tProxyPackage)) {
																																if (!mModelToTypeGraph
																																		.equals(tType)) {
																																	if (!mModelToTypeGraph
																																			.equals(mTypeToTType)) {
																																		if (!mModelToTypeGraph
																																				.equals(tEnum)) {
																																			if (!mModelToTypeGraph
																																					.equals(pg)) {
																																				if (!mModelToTypeGraph
																																						.equals(tProxyPackage)) {
																																					if (!mModelToTypeGraph
																																							.equals(mType)) {
																																						return new Object[] {
																																								ruleresult,
																																								tType,
																																								mTypeToTType,
																																								mAnnotatableToTAnnotatable,
																																								tEnum,
																																								pg,
																																								mModel,
																																								tProxyPackage,
																																								mType,
																																								mModelToTypeGraph };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_OrphanedEnum_11_3_bookkeepingforedges_greenBBBBBBBBBFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mAnnotatableToTAnnotatable,
			EObject tEnum, EObject pg, EObject mModel, EObject tProxyPackage, EObject mType) {
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotatableToTAnnotatable__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotatableToTAnnotatable__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tEnum____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tProxyPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tProxyPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OrphanedEnum";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mTypeToTType__tType____target_name_prime = "target";
		String mAnnotatableToTAnnotatable__tType____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String mAnnotatableToTAnnotatable__mType____source_name_prime = "source";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		String tEnum__tType____tAnnotated_name_prime = "tAnnotated";
		String tType__tEnum____tAnnotation_name_prime = "tAnnotation";
		String tProxyPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tProxyPackage____package_name_prime = "package";
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		ruleresult.getCreatedEdges().add(mModel__mType____orphanTypes);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		mAnnotatableToTAnnotatable__tType____target.setSrc(mAnnotatableToTAnnotatable);
		mAnnotatableToTAnnotatable__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mAnnotatableToTAnnotatable__tType____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		mAnnotatableToTAnnotatable__mType____source.setSrc(mAnnotatableToTAnnotatable);
		mAnnotatableToTAnnotatable__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mAnnotatableToTAnnotatable__mType____source);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tType__pg____model);
		tEnum__tType____tAnnotated.setSrc(tEnum);
		tEnum__tType____tAnnotated.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tEnum__tType____tAnnotated);
		tType__tEnum____tAnnotation.setSrc(tType);
		tType__tEnum____tAnnotation.setTrg(tEnum);
		ruleresult.getTranslatedEdges().add(tType__tEnum____tAnnotation);
		tProxyPackage__tType____ownedTypes.setSrc(tProxyPackage);
		tProxyPackage__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tProxyPackage__tType____ownedTypes);
		tType__tProxyPackage____package.setSrc(tType);
		tType__tProxyPackage____package.setTrg(tProxyPackage);
		ruleresult.getTranslatedEdges().add(tType__tProxyPackage____package);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mAnnotatableToTAnnotatable__tType____target.setName(mAnnotatableToTAnnotatable__tType____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mAnnotatableToTAnnotatable__mType____source.setName(mAnnotatableToTAnnotatable__mType____source_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		tEnum__tType____tAnnotated.setName(tEnum__tType____tAnnotated_name_prime);
		tType__tEnum____tAnnotation.setName(tType__tEnum____tAnnotation_name_prime);
		tProxyPackage__tType____ownedTypes.setName(tProxyPackage__tType____ownedTypes_name_prime);
		tType__tProxyPackage____package.setName(tType__tProxyPackage____package_name_prime);
		return new Object[] { ruleresult, tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel,
				tProxyPackage, mType, mModel__mType____orphanTypes, mTypeToTType__tType____target,
				mAnnotatableToTAnnotatable__tType____target, mTypeToTType__mType____source,
				mAnnotatableToTAnnotatable__mType____source, pg__tType____ownedTypes, tType__pg____model,
				tEnum__tType____tAnnotated, tType__tEnum____tAnnotation, tProxyPackage__tType____ownedTypes,
				tType__tProxyPackage____package };
	}

	public static final void pattern_OrphanedEnum_11_5_registerobjects_expressionBBBBBBBBBBB(OrphanedEnum _this,
			PerformRuleResult ruleresult, EObject tType, EObject mTypeToTType, EObject mAnnotatableToTAnnotatable,
			EObject tEnum, EObject pg, EObject mModel, EObject tProxyPackage, EObject mType,
			EObject mModelToTypeGraph) {
		_this.registerObjects_BWD(ruleresult, tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel,
				tProxyPackage, mType, mModelToTypeGraph);

	}

	public static final PerformRuleResult pattern_OrphanedEnum_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_12_1_preparereturnvalue_bindingFB(OrphanedEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_12_1_preparereturnvalue_blackFBB(EClass eClass,
			OrphanedEnum _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_12_1_preparereturnvalue_bindingAndBlackFFB(OrphanedEnum _this) {
		Object[] result_pattern_OrphanedEnum_12_1_preparereturnvalue_binding = pattern_OrphanedEnum_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedEnum_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OrphanedEnum_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedEnum_12_1_preparereturnvalue_black = pattern_OrphanedEnum_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OrphanedEnum_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OrphanedEnum_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OrphanedEnum";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OrphanedEnum_12_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tType");
		EObject _localVariable_1 = match.getObject("tEnum");
		EObject _localVariable_2 = match.getObject("pg");
		EObject _localVariable_3 = match.getObject("tProxyPackage");
		EObject tmpTType = _localVariable_0;
		EObject tmpTEnum = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpTProxyPackage = _localVariable_3;
		if (tmpTType instanceof TClass) {
			TClass tType = (TClass) tmpTType;
			if (tmpTEnum instanceof TEnum) {
				TEnum tEnum = (TEnum) tmpTEnum;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpTProxyPackage instanceof TPackage) {
						TPackage tProxyPackage = (TPackage) tmpTProxyPackage;
						return new Object[] { tType, tEnum, pg, tProxyPackage, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedEnum_12_2_corematch_blackBBBFBFB(TClass tType, TEnum tEnum,
			TypeGraph pg, TPackage tProxyPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String tProxyPackage_tName = tProxyPackage.getTName();
		if (tProxyPackage_tName.equals("(proxies)")) {
			for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pg, ModelToTypeGraph.class, "target")) {
				Model mModel = mModelToTypeGraph.getSource();
				if (mModel != null) {
					_result.add(new Object[] { tType, tEnum, pg, mModel, tProxyPackage, mModelToTypeGraph, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedEnum_12_3_findcontext_blackBBBBBB(TClass tType, TEnum tEnum,
			TypeGraph pg, Model mModel, TPackage tProxyPackage, ModelToTypeGraph mModelToTypeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModel.equals(mModelToTypeGraph.getSource())) {
			if (pg.getPackages().contains(tProxyPackage)) {
				if (pg.equals(mModelToTypeGraph.getTarget())) {
					if (pg.getOwnedTypes().contains(tType)) {
						if (tType.equals(tEnum.getTAnnotated())) {
							if (tProxyPackage.getOwnedTypes().contains(tType)) {
								String tProxyPackage_tName = tProxyPackage.getTName();
								if (tProxyPackage_tName.equals("(proxies)")) {
									_result.add(new Object[] { tType, tEnum, pg, mModel, tProxyPackage,
											mModelToTypeGraph });
								}

							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_12_3_findcontext_greenBBBBBBFFFFFFFFFF(TClass tType, TEnum tEnum,
			TypeGraph pg, Model mModel, TPackage tProxyPackage, ModelToTypeGraph mModelToTypeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tProxyPackage____packages = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tType____tAnnotated = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tEnum____tAnnotation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tProxyPackage__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tProxyPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		String pg__tProxyPackage____packages_name_prime = "packages";
		String mModelToTypeGraph__pg____target_name_prime = "target";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		String tEnum__tType____tAnnotated_name_prime = "tAnnotated";
		String tType__tEnum____tAnnotation_name_prime = "tAnnotation";
		String tProxyPackage__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__tProxyPackage____package_name_prime = "package";
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tEnum);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(tProxyPackage);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		pg__tProxyPackage____packages.setSrc(pg);
		pg__tProxyPackage____packages.setTrg(tProxyPackage);
		isApplicableMatch.getAllContextElements().add(pg__tProxyPackage____packages);
		mModelToTypeGraph__pg____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__pg____target);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____model);
		tEnum__tType____tAnnotated.setSrc(tEnum);
		tEnum__tType____tAnnotated.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tEnum__tType____tAnnotated);
		tType__tEnum____tAnnotation.setSrc(tType);
		tType__tEnum____tAnnotation.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(tType__tEnum____tAnnotation);
		tProxyPackage__tType____ownedTypes.setSrc(tProxyPackage);
		tProxyPackage__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tProxyPackage__tType____ownedTypes);
		tType__tProxyPackage____package.setSrc(tType);
		tType__tProxyPackage____package.setTrg(tProxyPackage);
		isApplicableMatch.getAllContextElements().add(tType__tProxyPackage____package);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		pg__tProxyPackage____packages.setName(pg__tProxyPackage____packages_name_prime);
		mModelToTypeGraph__pg____target.setName(mModelToTypeGraph__pg____target_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		tEnum__tType____tAnnotated.setName(tEnum__tType____tAnnotated_name_prime);
		tType__tEnum____tAnnotation.setName(tType__tEnum____tAnnotation_name_prime);
		tProxyPackage__tType____ownedTypes.setName(tProxyPackage__tType____ownedTypes_name_prime);
		tType__tProxyPackage____package.setName(tType__tProxyPackage____package_name_prime);
		return new Object[] { tType, tEnum, pg, mModel, tProxyPackage, mModelToTypeGraph, isApplicableMatch,
				mModelToTypeGraph__mModel____source, pg__tProxyPackage____packages, mModelToTypeGraph__pg____target,
				pg__tType____ownedTypes, tType__pg____model, tEnum__tType____tAnnotated, tType__tEnum____tAnnotation,
				tProxyPackage__tType____ownedTypes, tType__tProxyPackage____package };
	}

	public static final Object[] pattern_OrphanedEnum_12_4_solveCSP_bindingFBBBBBBBB(OrphanedEnum _this,
			IsApplicableMatch isApplicableMatch, TClass tType, TEnum tEnum, TypeGraph pg, Model mModel,
			TPackage tProxyPackage, ModelToTypeGraph mModelToTypeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tType, tEnum, pg, mModel,
				tProxyPackage, mModelToTypeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tType, tEnum, pg, mModel, tProxyPackage,
					mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedEnum_12_4_solveCSP_bindingAndBlackFBBBBBBBB(OrphanedEnum _this,
			IsApplicableMatch isApplicableMatch, TClass tType, TEnum tEnum, TypeGraph pg, Model mModel,
			TPackage tProxyPackage, ModelToTypeGraph mModelToTypeGraph) {
		Object[] result_pattern_OrphanedEnum_12_4_solveCSP_binding = pattern_OrphanedEnum_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, tType, tEnum, pg, mModel, tProxyPackage, mModelToTypeGraph);
		if (result_pattern_OrphanedEnum_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedEnum_12_4_solveCSP_binding[0];

			Object[] result_pattern_OrphanedEnum_12_4_solveCSP_black = pattern_OrphanedEnum_12_4_solveCSP_blackB(csp);
			if (result_pattern_OrphanedEnum_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tType, tEnum, pg, mModel, tProxyPackage,
						mModelToTypeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedEnum_12_5_checkCSP_expressionFBB(OrphanedEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OrphanedEnum_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OrphanedEnum";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OrphanedEnum_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_20_1_preparereturnvalue_bindingFB(OrphanedEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OrphanedEnum _this) {
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

	public static final Object[] pattern_OrphanedEnum_20_1_preparereturnvalue_bindingAndBlackFFBF(OrphanedEnum _this) {
		Object[] result_pattern_OrphanedEnum_20_1_preparereturnvalue_binding = pattern_OrphanedEnum_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedEnum_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OrphanedEnum_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedEnum_20_1_preparereturnvalue_black = pattern_OrphanedEnum_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OrphanedEnum_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OrphanedEnum_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OrphanedEnum_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_0BB(TClass tType,
			TPackage tProxyPackage) {
		for (TPackage __DEC_tType_classes_156225 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "classes")) {
			if (!tProxyPackage.equals(__DEC_tType_classes_156225)) {
				return new Object[] { tType, tProxyPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_1BB(TClass tType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_419653 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_419653)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_2BB(TClass tType,
			TPackage tProxyPackage) {
		TPackage __DEC_tType_ownedTypes_915548 = tType.getPackage();
		if (__DEC_tType_ownedTypes_915548 != null) {
			if (!tProxyPackage.equals(__DEC_tType_ownedTypes_915548)) {
				return new Object[] { tType, tProxyPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_3B(TClass tType) {
		TAbstractType __DEC_tType_innerTypes_365649 = tType.getOuterType();
		if (__DEC_tType_innerTypes_365649 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_365649)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_4BBBB(TEnum tEnum,
			TClass tType, TypeGraph pg, TPackage tProxyPackage) {
		TAnnotatable __DEC_tEnum_tAnnotation_16988 = tEnum.getTAnnotated();
		if (__DEC_tEnum_tAnnotation_16988 != null) {
			if (!tType.equals(__DEC_tEnum_tAnnotation_16988)) {
				if (!pg.equals(__DEC_tEnum_tAnnotation_16988)) {
					if (!tProxyPackage.equals(__DEC_tEnum_tAnnotation_16988)) {
						return new Object[] { tEnum, tType, pg, tProxyPackage };
					}
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_5BB(TPackage tProxyPackage,
			TClass tType) {
		if (tProxyPackage.getClasses().contains(tType)) {
			return new Object[] { tProxyPackage, tType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_6BB(TypeGraph pg,
			TClass tType) {
		if (pg.getClasses().contains(tType)) {
			return new Object[] { pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_7BB(TypeGraph pg,
			TEnum tEnum) {
		if (pg.getTAnnotation().contains(tEnum)) {
			return new Object[] { pg, tEnum };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_8BB(TPackage tProxyPackage,
			TEnum tEnum) {
		if (tProxyPackage.getTAnnotation().contains(tEnum)) {
			return new Object[] { tProxyPackage, tEnum };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedEnum_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_ownedTypes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTType = _edge_ownedTypes.getTrg();
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (pg.getOwnedTypes().contains(tType)) {
					TPackage tProxyPackage = tType.getPackage();
					if (tProxyPackage != null) {
						if (pg.getPackages().contains(tProxyPackage)) {
							String tProxyPackage_tName = tProxyPackage.getTName();
							if (tProxyPackage_tName.equals("(proxies)")) {
								if (pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_1BB(tType, pg) == null) {
									if (pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_3B(tType) == null) {
										if (pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_6BB(pg,
												tType) == null) {
											if (pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_0BB(tType,
													tProxyPackage) == null) {
												if (pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_2BB(tType,
														tProxyPackage) == null) {
													if (pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_5BB(
															tProxyPackage, tType) == null) {
														for (TAnnotation tmpTEnum : tType.getTAnnotation()) {
															if (tmpTEnum instanceof TEnum) {
																TEnum tEnum = (TEnum) tmpTEnum;
																if (pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_4BBBB(
																		tEnum, tType, pg, tProxyPackage) == null) {
																	if (pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_7BB(
																			pg, tEnum) == null) {
																		if (pattern_OrphanedEnum_20_2_testcorematchandDECs_black_nac_8BB(
																				tProxyPackage, tEnum) == null) {
																			_result.add(new Object[] { tType, tEnum, pg,
																					tProxyPackage, _edge_ownedTypes });
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_OrphanedEnum_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OrphanedEnum_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			OrphanedEnum _this, Match match, TClass tType, TEnum tEnum, TypeGraph pg, TPackage tProxyPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tType, tEnum, pg, tProxyPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OrphanedEnum_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OrphanedEnum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OrphanedEnum_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_21_1_preparereturnvalue_bindingFB(OrphanedEnum _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OrphanedEnum _this) {
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

	public static final Object[] pattern_OrphanedEnum_21_1_preparereturnvalue_bindingAndBlackFFBF(OrphanedEnum _this) {
		Object[] result_pattern_OrphanedEnum_21_1_preparereturnvalue_binding = pattern_OrphanedEnum_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedEnum_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OrphanedEnum_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedEnum_21_1_preparereturnvalue_black = pattern_OrphanedEnum_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OrphanedEnum_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OrphanedEnum_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OrphanedEnum_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_OrphanedEnum_21_2_testcorematchandDECs_black_nac_0B(EnumDeclaration mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_687516 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_687516 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_687516)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_21_2_testcorematchandDECs_black_nac_1B(EnumDeclaration mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_266978 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_266978 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_21_2_testcorematchandDECs_black_nac_2B(EnumDeclaration mType) {
		org.eclipse.modisco.java.Package __DEC_mType_ownedElements_610352 = mType.getPackage();
		if (__DEC_mType_ownedElements_610352 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_21_2_testcorematchandDECs_black_nac_3B(EnumDeclaration mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_332122 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedEnum_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMModel = _edge_orphanTypes.getSrc();
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			EObject tmpMType = _edge_orphanTypes.getTrg();
			if (tmpMType instanceof EnumDeclaration) {
				EnumDeclaration mType = (EnumDeclaration) tmpMType;
				if (mModel.getOrphanTypes().contains(mType)) {
					if (pattern_OrphanedEnum_21_2_testcorematchandDECs_black_nac_0B(mType) == null) {
						if (pattern_OrphanedEnum_21_2_testcorematchandDECs_black_nac_1B(mType) == null) {
							if (pattern_OrphanedEnum_21_2_testcorematchandDECs_black_nac_2B(mType) == null) {
								if (pattern_OrphanedEnum_21_2_testcorematchandDECs_black_nac_3B(mType) == null) {
									_result.add(new Object[] { mModel, mType, _edge_orphanTypes });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OrphanedEnum_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OrphanedEnum _this, Match match, Model mModel, EnumDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mModel, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OrphanedEnum_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OrphanedEnum _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OrphanedEnum_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_24_1_prepare_blackB(OrphanedEnum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OrphanedEnum_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_OrphanedEnum_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tType");
		EObject _localVariable_1 = targetMatch.getObject("tEnum");
		EObject _localVariable_2 = targetMatch.getObject("pg");
		EObject _localVariable_3 = sourceMatch.getObject("mModel");
		EObject _localVariable_4 = targetMatch.getObject("tProxyPackage");
		EObject _localVariable_5 = sourceMatch.getObject("mType");
		EObject tmpTType = _localVariable_0;
		EObject tmpTEnum = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpMModel = _localVariable_3;
		EObject tmpTProxyPackage = _localVariable_4;
		EObject tmpMType = _localVariable_5;
		if (tmpTType instanceof TClass) {
			TClass tType = (TClass) tmpTType;
			if (tmpTEnum instanceof TEnum) {
				TEnum tEnum = (TEnum) tmpTEnum;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpMModel instanceof Model) {
						Model mModel = (Model) tmpMModel;
						if (tmpTProxyPackage instanceof TPackage) {
							TPackage tProxyPackage = (TPackage) tmpTProxyPackage;
							if (tmpMType instanceof EnumDeclaration) {
								EnumDeclaration mType = (EnumDeclaration) tmpMType;
								return new Object[] { tType, tEnum, pg, mModel, tProxyPackage, mType, targetMatch,
										sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_24_2_matchsrctrgcontext_blackBBBBBBBB(TClass tType, TEnum tEnum,
			TypeGraph pg, Model mModel, TPackage tProxyPackage, EnumDeclaration mType, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			String tProxyPackage_tName = tProxyPackage.getTName();
			if (tProxyPackage_tName.equals("(proxies)")) {
				return new Object[] { tType, tEnum, pg, mModel, tProxyPackage, mType, sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_OrphanedEnum_24_2_matchsrctrgcontext_binding = pattern_OrphanedEnum_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_OrphanedEnum_24_2_matchsrctrgcontext_binding != null) {
			TClass tType = (TClass) result_pattern_OrphanedEnum_24_2_matchsrctrgcontext_binding[0];
			TEnum tEnum = (TEnum) result_pattern_OrphanedEnum_24_2_matchsrctrgcontext_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_OrphanedEnum_24_2_matchsrctrgcontext_binding[2];
			Model mModel = (Model) result_pattern_OrphanedEnum_24_2_matchsrctrgcontext_binding[3];
			TPackage tProxyPackage = (TPackage) result_pattern_OrphanedEnum_24_2_matchsrctrgcontext_binding[4];
			EnumDeclaration mType = (EnumDeclaration) result_pattern_OrphanedEnum_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_OrphanedEnum_24_2_matchsrctrgcontext_black = pattern_OrphanedEnum_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tType, tEnum, pg, mModel, tProxyPackage, mType, sourceMatch, targetMatch);
			if (result_pattern_OrphanedEnum_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tType, tEnum, pg, mModel, tProxyPackage, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_24_3_solvecsp_bindingFBBBBBBBBB(OrphanedEnum _this, TClass tType,
			TEnum tEnum, TypeGraph pg, Model mModel, TPackage tProxyPackage, EnumDeclaration mType, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tType, tEnum, pg, mModel, tProxyPackage, mType,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tType, tEnum, pg, mModel, tProxyPackage, mType, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedEnum_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(OrphanedEnum _this,
			TClass tType, TEnum tEnum, TypeGraph pg, Model mModel, TPackage tProxyPackage, EnumDeclaration mType,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OrphanedEnum_24_3_solvecsp_binding = pattern_OrphanedEnum_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tType, tEnum, pg, mModel, tProxyPackage, mType, sourceMatch, targetMatch);
		if (result_pattern_OrphanedEnum_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedEnum_24_3_solvecsp_binding[0];

			Object[] result_pattern_OrphanedEnum_24_3_solvecsp_black = pattern_OrphanedEnum_24_3_solvecsp_blackB(csp);
			if (result_pattern_OrphanedEnum_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tType, tEnum, pg, mModel, tProxyPackage, mType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedEnum_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedEnum_24_5_matchcorrcontext_blackBBFBB(TypeGraph pg,
			Model mModel, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
				if (pg.equals(mModelToTypeGraph.getTarget())) {
					_result.add(new Object[] { pg, mModel, mModelToTypeGraph, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_24_5_matchcorrcontext_greenBBBF(
			ModelToTypeGraph mModelToTypeGraph, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "OrphanedEnum";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mModelToTypeGraph);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mModelToTypeGraph, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_OrphanedEnum_24_6_createcorrespondence_blackBBBBBBB(TClass tType, TEnum tEnum,
			TypeGraph pg, Model mModel, TPackage tProxyPackage, EnumDeclaration mType, CCMatch ccMatch) {
		return new Object[] { tType, tEnum, pg, mModel, tProxyPackage, mType, ccMatch };
	}

	public static final Object[] pattern_OrphanedEnum_24_6_createcorrespondence_greenBFFBB(TClass tType,
			EnumDeclaration mType, CCMatch ccMatch) {
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		mTypeToTType.setTarget(tType);
		mTypeToTType.setSource(mType);
		ccMatch.getCreateCorr().add(mTypeToTType);
		mAnnotatableToTAnnotatable.setTarget(tType);
		mAnnotatableToTAnnotatable.setSource(mType);
		ccMatch.getCreateCorr().add(mAnnotatableToTAnnotatable);
		return new Object[] { tType, mTypeToTType, mAnnotatableToTAnnotatable, mType, ccMatch };
	}

	public static final Object[] pattern_OrphanedEnum_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_OrphanedEnum_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "OrphanedEnum";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_OrphanedEnum_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_27_1_matchtggpattern_black_nac_0B(EnumDeclaration mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_866935 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_866935 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_866935)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_27_1_matchtggpattern_black_nac_1B(EnumDeclaration mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_737558 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_737558 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_27_1_matchtggpattern_black_nac_2B(EnumDeclaration mType) {
		org.eclipse.modisco.java.Package __DEC_mType_ownedElements_928359 = mType.getPackage();
		if (__DEC_mType_ownedElements_928359 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_27_1_matchtggpattern_black_nac_3B(EnumDeclaration mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_227024 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_27_1_matchtggpattern_blackBB(Model mModel,
			EnumDeclaration mType) {
		if (mModel.getOrphanTypes().contains(mType)) {
			if (pattern_OrphanedEnum_27_1_matchtggpattern_black_nac_0B(mType) == null) {
				if (pattern_OrphanedEnum_27_1_matchtggpattern_black_nac_1B(mType) == null) {
					if (pattern_OrphanedEnum_27_1_matchtggpattern_black_nac_2B(mType) == null) {
						if (pattern_OrphanedEnum_27_1_matchtggpattern_black_nac_3B(mType) == null) {
							return new Object[] { mModel, mType };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedEnum_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedEnum_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_0BB(TClass tType,
			TPackage tProxyPackage) {
		for (TPackage __DEC_tType_classes_569178 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "classes")) {
			if (!tProxyPackage.equals(__DEC_tType_classes_569178)) {
				return new Object[] { tType, tProxyPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_1BB(TClass tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_227958 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_227958)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_2BB(TClass tType,
			TPackage tProxyPackage) {
		TPackage __DEC_tType_ownedTypes_320649 = tType.getPackage();
		if (__DEC_tType_ownedTypes_320649 != null) {
			if (!tProxyPackage.equals(__DEC_tType_ownedTypes_320649)) {
				return new Object[] { tType, tProxyPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_3B(TClass tType) {
		TAbstractType __DEC_tType_innerTypes_418290 = tType.getOuterType();
		if (__DEC_tType_innerTypes_418290 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_418290)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_4BBBB(TEnum tEnum, TClass tType,
			TypeGraph pg, TPackage tProxyPackage) {
		TAnnotatable __DEC_tEnum_tAnnotation_982621 = tEnum.getTAnnotated();
		if (__DEC_tEnum_tAnnotation_982621 != null) {
			if (!tType.equals(__DEC_tEnum_tAnnotation_982621)) {
				if (!pg.equals(__DEC_tEnum_tAnnotation_982621)) {
					if (!tProxyPackage.equals(__DEC_tEnum_tAnnotation_982621)) {
						return new Object[] { tEnum, tType, pg, tProxyPackage };
					}
				}
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_5BB(TPackage tProxyPackage,
			TClass tType) {
		if (tProxyPackage.getClasses().contains(tType)) {
			return new Object[] { tProxyPackage, tType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_6BB(TypeGraph pg, TClass tType) {
		if (pg.getClasses().contains(tType)) {
			return new Object[] { pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_7BB(TypeGraph pg, TEnum tEnum) {
		if (pg.getTAnnotation().contains(tEnum)) {
			return new Object[] { pg, tEnum };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_8BB(TPackage tProxyPackage,
			TEnum tEnum) {
		if (tProxyPackage.getTAnnotation().contains(tEnum)) {
			return new Object[] { tProxyPackage, tEnum };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_28_1_matchtggpattern_blackBBBB(TClass tType, TEnum tEnum,
			TypeGraph pg, TPackage tProxyPackage) {
		if (pg.getPackages().contains(tProxyPackage)) {
			if (pg.getOwnedTypes().contains(tType)) {
				if (tType.equals(tEnum.getTAnnotated())) {
					if (tProxyPackage.getOwnedTypes().contains(tType)) {
						String tProxyPackage_tName = tProxyPackage.getTName();
						if (tProxyPackage_tName.equals("(proxies)")) {
							if (pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_0BB(tType, tProxyPackage) == null) {
								if (pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_1BB(tType, pg) == null) {
									if (pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_2BB(tType,
											tProxyPackage) == null) {
										if (pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_3B(tType) == null) {
											if (pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_4BBBB(tEnum, tType,
													pg, tProxyPackage) == null) {
												if (pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_5BB(
														tProxyPackage, tType) == null) {
													if (pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_6BB(pg,
															tType) == null) {
														if (pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_7BB(pg,
																tEnum) == null) {
															if (pattern_OrphanedEnum_28_1_matchtggpattern_black_nac_8BB(
																	tProxyPackage, tEnum) == null) {
																return new Object[] { tType, tEnum, pg, tProxyPackage };
															}
														}
													}
												}
											}
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

	public static final boolean pattern_OrphanedEnum_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedEnum_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_29_1_createresult_blackB(OrphanedEnum _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OrphanedEnum_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_OrphanedEnum_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TPackage tProxyPackage) {
		if (ruleResult.getTargetObjects().contains(tProxyPackage)) {
			return new Object[] { ruleResult, tProxyPackage };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph mModelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(mModelToTypeGraph)) {
			return new Object[] { ruleResult, mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Model mModel) {
		if (ruleResult.getSourceObjects().contains(mModel)) {
			return new Object[] { ruleResult, mModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedEnum_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mModelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMModelToTypeGraph : mModelToTypeGraphList.getEntryObjects()) {
				if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
					TypeGraph pg = mModelToTypeGraph.getTarget();
					if (pg != null) {
						Model mModel = mModelToTypeGraph.getSource();
						if (mModel != null) {
							if (pattern_OrphanedEnum_29_2_isapplicablecore_black_nac_2BB(ruleResult,
									mModelToTypeGraph) == null) {
								if (pattern_OrphanedEnum_29_2_isapplicablecore_black_nac_0BB(ruleResult, pg) == null) {
									if (pattern_OrphanedEnum_29_2_isapplicablecore_black_nac_3BB(ruleResult,
											mModel) == null) {
										for (TPackage tProxyPackage : pg.getPackages()) {
											String tProxyPackage_tName = tProxyPackage.getTName();
											if (tProxyPackage_tName.equals("(proxies)")) {
												if (pattern_OrphanedEnum_29_2_isapplicablecore_black_nac_1BB(ruleResult,
														tProxyPackage) == null) {
													_result.add(new Object[] { mModelToTypeGraphList, pg, tProxyPackage,
															mModelToTypeGraph, mModel, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_29_3_solveCSP_bindingFBBBBBBB(OrphanedEnum _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel, TPackage tProxyPackage,
			ModelToTypeGraph mModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, pg, mModel, tProxyPackage,
				mModelToTypeGraph, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pg, mModel, tProxyPackage, mModelToTypeGraph,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedEnum_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedEnum_29_3_solveCSP_bindingAndBlackFBBBBBBB(OrphanedEnum _this,
			IsApplicableMatch isApplicableMatch, TypeGraph pg, Model mModel, TPackage tProxyPackage,
			ModelToTypeGraph mModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_OrphanedEnum_29_3_solveCSP_binding = pattern_OrphanedEnum_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, pg, mModel, tProxyPackage, mModelToTypeGraph, ruleResult);
		if (result_pattern_OrphanedEnum_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedEnum_29_3_solveCSP_binding[0];

			Object[] result_pattern_OrphanedEnum_29_3_solveCSP_black = pattern_OrphanedEnum_29_3_solveCSP_blackB(csp);
			if (result_pattern_OrphanedEnum_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pg, mModel, tProxyPackage, mModelToTypeGraph,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedEnum_29_4_checkCSP_expressionFBB(OrphanedEnum _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedEnum_29_5_checknacs_blackBBBB(TypeGraph pg, Model mModel,
			TPackage tProxyPackage, ModelToTypeGraph mModelToTypeGraph) {
		String tProxyPackage_tName = tProxyPackage.getTName();
		if (tProxyPackage_tName.equals("(proxies)")) {
			return new Object[] { pg, mModel, tProxyPackage, mModelToTypeGraph };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_29_6_perform_blackBBBBB(TypeGraph pg, Model mModel,
			TPackage tProxyPackage, ModelToTypeGraph mModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		String tProxyPackage_tName = tProxyPackage.getTName();
		if (tProxyPackage_tName.equals("(proxies)")) {
			return new Object[] { pg, mModel, tProxyPackage, mModelToTypeGraph, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedEnum_29_6_perform_greenFFFFBBBFBB(TypeGraph pg, Model mModel,
			TPackage tProxyPackage, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TClass tType = BasicFactory.eINSTANCE.createTClass();
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TEnum tEnum = BasicFactory.eINSTANCE.createTEnum();
		EnumDeclaration mType = JavaFactory.eINSTANCE.createEnumDeclaration();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("mType", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		pg.getOwnedTypes().add(tType);
		tProxyPackage.getOwnedTypes().add(tType);
		ruleResult.getTargetObjects().add(tType);
		mTypeToTType.setTarget(tType);
		ruleResult.getCorrObjects().add(mTypeToTType);
		mAnnotatableToTAnnotatable.setTarget(tType);
		ruleResult.getCorrObjects().add(mAnnotatableToTAnnotatable);
		tEnum.setTAnnotated(tType);
		ruleResult.getTargetObjects().add(tEnum);
		mModel.getOrphanTypes().add(mType);
		mTypeToTType.setSource(mType);
		mAnnotatableToTAnnotatable.setSource(mType);
		ruleResult.getSourceObjects().add(mType);
		String tType_tName_prime = (String) _localVariable_0;
		String mType_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tType.setTName(tType_tName_prime);
		mType.setName(mType_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tType, mTypeToTType, mAnnotatableToTAnnotatable, tEnum, pg, mModel, tProxyPackage, mType,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_OrphanedEnum_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //OrphanedEnumImpl
