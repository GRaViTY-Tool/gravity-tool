/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.EnumDeclaration;
import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MEnumConstantDeclaration;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.EnumConstant;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TField;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TFieldSignature;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModule;
import org.gravity.typegraph.basic.TSignature;
import org.gravity.typegraph.basic.TypeGraph;

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
 * An implementation of the model object '<em><b>Enum Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EnumConstantImpl extends AbstractRuleImpl implements EnumConstant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getEnumConstant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {

		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_0_1_initialbindings_blackBBBB(this, match,
				mDefinition, mEnum);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mEnum] = " + mEnum + ".");
		}

		Object[] result2_bindingAndBlack = EnumConstantImpl.pattern_EnumConstant_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, mDefinition, mEnum);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mEnum] = " + mEnum + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (EnumConstantImpl.pattern_EnumConstant_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = EnumConstantImpl
					.pattern_EnumConstant_0_4_collectelementstobetranslated_blackBBB(match, mDefinition, mEnum);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mEnum] = " + mEnum + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_0_4_collectelementstobetranslated_greenBBBF(match, mDefinition,
					mEnum);
			//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result4_green[3];

			Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_0_5_collectcontextelements_blackBBB(match,
					mDefinition, mEnum);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mEnum] = " + mEnum + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_0_5_collectcontextelements_greenBB(match, mEnum);

			// 
			EnumConstantImpl.pattern_EnumConstant_0_6_registerobjectstomatch_expressionBBBB(this, match, mDefinition,
					mEnum);
			return EnumConstantImpl.pattern_EnumConstant_0_7_expressionF();
		} else {
			return EnumConstantImpl.pattern_EnumConstant_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result1_bindingAndBlack[0];
		TypeGraph model = (TypeGraph) result1_bindingAndBlack[1];
		EnumDeclaration mEnum = (EnumDeclaration) result1_bindingAndBlack[2];
		TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result1_bindingAndBlack[3];
		TClass tEnum = (TClass) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = EnumConstantImpl
				.pattern_EnumConstant_1_1_performtransformation_greenFFFBBFBFB(mDefinition, model, tEnum, csp);
		TField tName = (TField) result1_green[0];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[1];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[2];
		TFieldDefinition tDefinition = (TFieldDefinition) result1_green[5];
		TFieldSignature tSignature = (TFieldSignature) result1_green[7];

		Object[] result2_black = EnumConstantImpl.pattern_EnumConstant_1_2_collecttranslatedelements_blackBBBBBB(tName,
				mDefinitionToTMember, mBodyToTAnnotation, mDefinition, tDefinition, tSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tName] = " + tName + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[tSignature] = " + tSignature + ".");
		}
		Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_1_2_collecttranslatedelements_greenFBBBBBB(tName,
				mDefinitionToTMember, mBodyToTAnnotation, mDefinition, tDefinition, tSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumConstantImpl.pattern_EnumConstant_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model, tDefinition, mEnum,
				mEnumToTEnum, tEnum, tSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tName] = " + tName + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[model] = " + model + ", " + "[tDefinition] = " + tDefinition + ", " + "[mEnum] = " + mEnum
					+ ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = " + tEnum + ", " + "[tSignature] = "
					+ tSignature + ".");
		}
		EnumConstantImpl.pattern_EnumConstant_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, tName,
				mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model, tDefinition, mEnum, tEnum, tSignature);
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[24];

		// 
		// 
		EnumConstantImpl.pattern_EnumConstant_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult, tName,
				mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model, tDefinition, mEnum, mEnumToTEnum, tEnum,
				tSignature);
		return EnumConstantImpl.pattern_EnumConstant_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnumConstantImpl.pattern_EnumConstant_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = EnumConstantImpl.pattern_EnumConstant_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result2_binding[0];
		EnumDeclaration mEnum = (EnumDeclaration) result2_binding[1];
		for (Object[] result2_black : EnumConstantImpl.pattern_EnumConstant_2_2_corematch_blackBBFFB(mDefinition, mEnum,
				match)) {
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result2_black[2];
			TClass tEnum = (TClass) result2_black[3];
			// ForEach 
			for (Object[] result3_black : EnumConstantImpl.pattern_EnumConstant_2_3_findcontext_blackBFBBB(mDefinition,
					mEnum, mEnumToTEnum, tEnum)) {
				TypeGraph model = (TypeGraph) result3_black[1];
				Object[] result3_green = EnumConstantImpl.pattern_EnumConstant_2_3_findcontext_greenBBBBBFFFFFF(
						mDefinition, model, mEnum, mEnumToTEnum, tEnum);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mEnumToTEnum__mEnum____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mEnumToTEnum__tEnum____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge model__tEnum____allTypes = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = EnumConstantImpl
						.pattern_EnumConstant_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, mDefinition,
								model, mEnum, mEnumToTEnum, tEnum);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mDefinition] = " + mDefinition
							+ ", " + "[model] = " + model + ", " + "[mEnum] = " + mEnum + ", " + "[mEnumToTEnum] = "
							+ mEnumToTEnum + ", " + "[tEnum] = " + tEnum + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (EnumConstantImpl.pattern_EnumConstant_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = EnumConstantImpl
							.pattern_EnumConstant_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					EnumConstantImpl.pattern_EnumConstant_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EnumConstantImpl.pattern_EnumConstant_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mEnum", mEnum);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MEnumConstantDeclaration mDefinition,
			TypeGraph model, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum, TClass tEnum) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mDefinition_name = CSPFactoryHelper.eINSTANCE.createVariable("mDefinition.name", true, csp);
		var_mDefinition_name.setValue(mDefinition.getName());
		var_mDefinition_name.setType("String");

		// Create unbound variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mDefinition_name, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("mEnum", mEnum);
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
		isApplicableMatch.registerObject("tEnum", tEnum);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tName, EObject mDefinitionToTMember,
			EObject mBodyToTAnnotation, EObject mDefinition, EObject model, EObject tDefinition, EObject mEnum,
			EObject mEnumToTEnum, EObject tEnum, EObject tSignature) {
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mEnum", mEnum);
		ruleresult.registerObject("mEnumToTEnum", mEnumToTEnum);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mDefinition").eClass())
				.equals("modisco.MEnumConstantDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TField tName, TypeGraph model, TFieldDefinition tDefinition,
			TClass tEnum, TFieldSignature tSignature) {

		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_10_1_initialbindings_blackBBBBBBB(this, match,
				tName, model, tDefinition, tEnum, tSignature);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tName] = " + tName + ", " + "[model] = " + model + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[tEnum] = " + tEnum + ", " + "[tSignature] = " + tSignature + ".");
		}

		Object[] result2_bindingAndBlack = EnumConstantImpl.pattern_EnumConstant_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
				this, match, tName, model, tDefinition, tEnum, tSignature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tName] = " + tName + ", " + "[model] = " + model + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[tEnum] = " + tEnum + ", " + "[tSignature] = " + tSignature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (EnumConstantImpl.pattern_EnumConstant_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = EnumConstantImpl
					.pattern_EnumConstant_10_4_collectelementstobetranslated_blackBBBBBB(match, tName, model,
							tDefinition, tEnum, tSignature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tName] = " + tName + ", " + "[model] = " + model + ", " + "[tDefinition] = " + tDefinition
						+ ", " + "[tEnum] = " + tEnum + ", " + "[tSignature] = " + tSignature + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(match, tName,
					model, tDefinition, tEnum, tSignature);
			//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result4_green[15];

			Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_10_5_collectcontextelements_blackBBBBBB(
					match, tName, model, tDefinition, tEnum, tSignature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tName] = " + tName + ", " + "[model] = " + model + ", " + "[tDefinition] = " + tDefinition
						+ ", " + "[tEnum] = " + tEnum + ", " + "[tSignature] = " + tSignature + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_10_5_collectcontextelements_greenBBBFF(match, model, tEnum);
			//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge model__tEnum____allTypes = (EMoflonEdge) result5_green[4];

			// 
			EnumConstantImpl.pattern_EnumConstant_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, tName,
					model, tDefinition, tEnum, tSignature);
			return EnumConstantImpl.pattern_EnumConstant_10_7_expressionF();
		} else {
			return EnumConstantImpl.pattern_EnumConstant_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TField tName = (TField) result1_bindingAndBlack[0];
		TypeGraph model = (TypeGraph) result1_bindingAndBlack[1];
		TFieldDefinition tDefinition = (TFieldDefinition) result1_bindingAndBlack[2];
		EnumDeclaration mEnum = (EnumDeclaration) result1_bindingAndBlack[3];
		TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result1_bindingAndBlack[4];
		TClass tEnum = (TClass) result1_bindingAndBlack[5];
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = EnumConstantImpl
				.pattern_EnumConstant_11_1_performtransformation_greenFFFBBB(tDefinition, mEnum, csp);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[0];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[1];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result1_green[2];

		Object[] result2_black = EnumConstantImpl.pattern_EnumConstant_11_2_collecttranslatedelements_blackBBBBBB(tName,
				mDefinitionToTMember, mBodyToTAnnotation, mDefinition, tDefinition, tSignature);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tName] = " + tName + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[tSignature] = " + tSignature + ".");
		}
		Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_11_2_collecttranslatedelements_greenFBBBBBB(
				tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, tDefinition, tSignature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumConstantImpl.pattern_EnumConstant_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model, tDefinition, mEnum,
				mEnumToTEnum, tEnum, tSignature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tName] = " + tName + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[model] = " + model + ", " + "[tDefinition] = " + tDefinition + ", " + "[mEnum] = " + mEnum
					+ ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = " + tEnum + ", " + "[tSignature] = "
					+ tSignature + ".");
		}
		EnumConstantImpl.pattern_EnumConstant_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult, tName,
				mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model, tDefinition, mEnum, tEnum, tSignature);
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[24];

		// 
		// 
		EnumConstantImpl.pattern_EnumConstant_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult, tName,
				mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model, tDefinition, mEnum, mEnumToTEnum, tEnum,
				tSignature);
		return EnumConstantImpl.pattern_EnumConstant_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = EnumConstantImpl
				.pattern_EnumConstant_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = EnumConstantImpl.pattern_EnumConstant_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TField tName = (TField) result2_binding[0];
		TypeGraph model = (TypeGraph) result2_binding[1];
		TFieldDefinition tDefinition = (TFieldDefinition) result2_binding[2];
		TClass tEnum = (TClass) result2_binding[3];
		TFieldSignature tSignature = (TFieldSignature) result2_binding[4];
		for (Object[] result2_black : EnumConstantImpl.pattern_EnumConstant_12_2_corematch_blackBBBFFBBB(tName, model,
				tDefinition, tEnum, tSignature, match)) {
			EnumDeclaration mEnum = (EnumDeclaration) result2_black[3];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result2_black[4];
			// ForEach 
			for (Object[] result3_black : EnumConstantImpl.pattern_EnumConstant_12_3_findcontext_blackBBBBBBB(tName,
					model, tDefinition, mEnum, mEnumToTEnum, tEnum, tSignature)) {
				Object[] result3_green = EnumConstantImpl
						.pattern_EnumConstant_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFF(tName, model, tDefinition,
								mEnum, mEnumToTEnum, tEnum, tSignature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mEnumToTEnum__mEnum____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mEnumToTEnum__tEnum____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge model__tEnum____allTypes = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = EnumConstantImpl
						.pattern_EnumConstant_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, tName,
								model, tDefinition, mEnum, mEnumToTEnum, tEnum, tSignature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tName] = " + tName + ", "
							+ "[model] = " + model + ", " + "[tDefinition] = " + tDefinition + ", " + "[mEnum] = "
							+ mEnum + ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = " + tEnum + ", "
							+ "[tSignature] = " + tSignature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (EnumConstantImpl.pattern_EnumConstant_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = EnumConstantImpl
							.pattern_EnumConstant_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					EnumConstantImpl.pattern_EnumConstant_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return EnumConstantImpl.pattern_EnumConstant_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TField tName, TypeGraph model, TFieldDefinition tDefinition,
			TClass tEnum, TFieldSignature tSignature) {
		match.registerObject("tName", tName);
		match.registerObject("model", model);
		match.registerObject("tDefinition", tDefinition);
		match.registerObject("tEnum", tEnum);
		match.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TField tName, TypeGraph model, TFieldDefinition tDefinition,
			TClass tEnum, TFieldSignature tSignature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TField tName, TypeGraph model,
			TFieldDefinition tDefinition, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum, TClass tEnum,
			TFieldSignature tSignature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");

		// Create unbound variables
		Variable var_mDefinition_name = CSPFactoryHelper.eINSTANCE.createVariable("mDefinition.name", csp);
		var_mDefinition_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mDefinition_name, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mEnum", mEnum);
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("tSignature", tSignature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tName, EObject mDefinitionToTMember,
			EObject mBodyToTAnnotation, EObject mDefinition, EObject model, EObject tDefinition, EObject mEnum,
			EObject mEnumToTEnum, EObject tEnum, EObject tSignature) {
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mEnum", mEnum);
		ruleresult.registerObject("mEnumToTEnum", mEnumToTEnum);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("tSignature", tSignature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tName").eClass()).equals("basic.TField.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tDefinition").eClass())
						.equals("basic.TFieldDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSignature").eClass())
						.equals("basic.TFieldSignature.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_29(EMoflonEdge _edge_fields) {

		Object[] result1_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnumConstantImpl.pattern_EnumConstant_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : EnumConstantImpl
				.pattern_EnumConstant_20_2_testcorematchandDECs_blackFFFFFB(_edge_fields)) {
			TField tName = (TField) result2_black[0];
			TypeGraph model = (TypeGraph) result2_black[1];
			TFieldDefinition tDefinition = (TFieldDefinition) result2_black[2];
			TClass tEnum = (TClass) result2_black[3];
			TFieldSignature tSignature = (TFieldSignature) result2_black[4];
			Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (EnumConstantImpl.pattern_EnumConstant_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
					this, match, tName, model, tDefinition, tEnum, tSignature)) {
				// 
				if (EnumConstantImpl
						.pattern_EnumConstant_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_20_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					EnumConstantImpl.pattern_EnumConstant_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnumConstantImpl.pattern_EnumConstant_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_30(EMoflonEdge _edge_enumConstants) {

		Object[] result1_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = EnumConstantImpl.pattern_EnumConstant_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : EnumConstantImpl
				.pattern_EnumConstant_21_2_testcorematchandDECs_blackFFB(_edge_enumConstants)) {
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result2_black[0];
			EnumDeclaration mEnum = (EnumDeclaration) result2_black[1];
			Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (EnumConstantImpl.pattern_EnumConstant_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, mDefinition, mEnum)) {
				// 
				if (EnumConstantImpl
						.pattern_EnumConstant_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_21_5_Addmatchtoruleresult_blackBBBB(
							match, __performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					EnumConstantImpl.pattern_EnumConstant_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return EnumConstantImpl.pattern_EnumConstant_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("EnumConstant");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mDefinition_name = CSPFactoryHelper.eINSTANCE.createVariable("mDefinition", true, csp);
		var_mDefinition_name.setValue(__helper.getValue("mDefinition", "name"));
		var_mDefinition_name.setType("String");

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("EnumConstant");
		eq0.solve(var_mDefinition_name, var_tName_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tName_tName.setBound(false);
			eq0.solve(var_mDefinition_name, var_tName_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tName", "tName", var_tName_tName.getValue());
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
		ruleResult.setRule("EnumConstant");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mDefinition_name = CSPFactoryHelper.eINSTANCE.createVariable("mDefinition", true, csp);
		var_mDefinition_name.setValue(__helper.getValue("mDefinition", "name"));
		var_mDefinition_name.setType("String");

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("EnumConstant");
		eq0.solve(var_mDefinition_name, var_tName_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mDefinition_name.setBound(false);
			eq0.solve(var_mDefinition_name, var_tName_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mDefinition", "name", var_mDefinition_name.getValue());
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

		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EnumConstantImpl.pattern_EnumConstant_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TField tName = (TField) result2_bindingAndBlack[0];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result2_bindingAndBlack[1];
		TypeGraph model = (TypeGraph) result2_bindingAndBlack[2];
		TFieldDefinition tDefinition = (TFieldDefinition) result2_bindingAndBlack[3];
		EnumDeclaration mEnum = (EnumDeclaration) result2_bindingAndBlack[4];
		TClass tEnum = (TClass) result2_bindingAndBlack[5];
		TFieldSignature tSignature = (TFieldSignature) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, tName, mDefinition, model,
						tDefinition, mEnum, tEnum, tSignature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tName] = " + tName + ", " + "[mDefinition] = " + mDefinition + ", " + "[model] = " + model
					+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mEnum] = " + mEnum + ", " + "[tEnum] = "
					+ tEnum + ", " + "[tSignature] = " + tSignature + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (EnumConstantImpl.pattern_EnumConstant_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : EnumConstantImpl.pattern_EnumConstant_24_5_matchcorrcontext_blackBFBBB(mEnum,
					tEnum, sourceMatch, targetMatch)) {
				TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result5_black[1];
				Object[] result5_green = EnumConstantImpl
						.pattern_EnumConstant_24_5_matchcorrcontext_greenBBBF(mEnumToTEnum, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = EnumConstantImpl.pattern_EnumConstant_24_6_createcorrespondence_blackBBBBBBBB(
						tName, mDefinition, model, tDefinition, mEnum, tEnum, tSignature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tName] = " + tName + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[model] = " + model + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[mEnum] = " + mEnum + ", " + "[tEnum] = " + tEnum + ", "
							+ "[tSignature] = " + tSignature + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				EnumConstantImpl.pattern_EnumConstant_24_6_createcorrespondence_greenFFBBB(mDefinition, tDefinition,
						ccMatch);
				//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[0];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[1];

				Object[] result7_black = EnumConstantImpl.pattern_EnumConstant_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				EnumConstantImpl.pattern_EnumConstant_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return EnumConstantImpl.pattern_EnumConstant_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TField tName, MEnumConstantDeclaration mDefinition, TypeGraph model,
			TFieldDefinition tDefinition, EnumDeclaration mEnum, TClass tEnum, TFieldSignature tSignature,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mDefinition_name = CSPFactoryHelper.eINSTANCE.createVariable("mDefinition.name", true, csp);
		var_mDefinition_name.setValue(mDefinition.getName());
		var_mDefinition_name.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mDefinition_name, var_tName_tName);
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
	public boolean checkDEC_FWD(MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {// 
		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_27_1_matchtggpattern_blackBB(mDefinition, mEnum);
		if (result1_black != null) {
			return EnumConstantImpl.pattern_EnumConstant_27_2_expressionF();
		} else {
			return EnumConstantImpl.pattern_EnumConstant_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TField tName, TypeGraph model, TFieldDefinition tDefinition, TClass tEnum,
			TFieldSignature tSignature) {// 
		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_28_1_matchtggpattern_blackBBBBB(tName, model,
				tDefinition, tEnum, tSignature);
		if (result1_black != null) {
			return EnumConstantImpl.pattern_EnumConstant_28_2_expressionF();
		} else {
			return EnumConstantImpl.pattern_EnumConstant_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mEnumToTEnumParameter) {

		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = EnumConstantImpl.pattern_EnumConstant_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : EnumConstantImpl
				.pattern_EnumConstant_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mEnumToTEnumList = (RuleEntryList) result2_black[0];
			TypeGraph model = (TypeGraph) result2_black[1];
			TClass tEnum = (TClass) result2_black[2];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result2_black[3];
			EnumDeclaration mEnum = (EnumDeclaration) result2_black[4];

			Object[] result3_bindingAndBlack = EnumConstantImpl
					.pattern_EnumConstant_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, model, mEnum,
							mEnumToTEnum, tEnum, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
						+ "[mEnum] = " + mEnum + ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = " + tEnum
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (EnumConstantImpl.pattern_EnumConstant_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_29_5_checknacs_blackBBBB(model, mEnum,
						mEnumToTEnum, tEnum);
				if (result5_black != null) {

					Object[] result6_black = EnumConstantImpl.pattern_EnumConstant_29_6_perform_blackBBBBB(model, mEnum,
							mEnumToTEnum, tEnum, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model
								+ ", " + "[mEnum] = " + mEnum + ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", "
								+ "[tEnum] = " + tEnum + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					EnumConstantImpl.pattern_EnumConstant_29_6_perform_greenFFFFBFBBFBB(model, mEnum, tEnum, ruleResult,
							csp);
					//nothing TField tName = (TField) result6_green[0];
					//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[1];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[2];
					//nothing MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result6_green[3];
					//nothing TFieldDefinition tDefinition = (TFieldDefinition) result6_green[5];
					//nothing TFieldSignature tSignature = (TFieldSignature) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return EnumConstantImpl.pattern_EnumConstant_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph model, EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mDefinition_name = CSPFactoryHelper.eINSTANCE.createVariable("mDefinition.name", csp);
		var_mDefinition_name.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mDefinition_name, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("mEnum", mEnum);
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
		isApplicableMatch.registerObject("tEnum", tEnum);
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
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_FWD__MATCH_MENUMCONSTANTDECLARATION_ENUMDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MEnumConstantDeclaration) arguments.get(1),
					(EnumDeclaration) arguments.get(2));
		case RulesPackage.ENUM_CONSTANT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MENUMCONSTANTDECLARATION_ENUMDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MEnumConstantDeclaration) arguments.get(1),
					(EnumDeclaration) arguments.get(2));
			return null;
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MENUMCONSTANTDECLARATION_ENUMDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MEnumConstantDeclaration) arguments.get(1),
					(EnumDeclaration) arguments.get(2));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MENUMCONSTANTDECLARATION_TYPEGRAPH_ENUMDECLARATION_TYPETOTABSTRACTTYPE_TCLASS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MEnumConstantDeclaration) arguments.get(1), (TypeGraph) arguments.get(2),
					(EnumDeclaration) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(TClass) arguments.get(5));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.ENUM_CONSTANT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_BWD__MATCH_TFIELD_TYPEGRAPH_TFIELDDEFINITION_TCLASS_TFIELDSIGNATURE:
			return isAppropriate_BWD((Match) arguments.get(0), (TField) arguments.get(1), (TypeGraph) arguments.get(2),
					(TFieldDefinition) arguments.get(3), (TClass) arguments.get(4), (TFieldSignature) arguments.get(5));
		case RulesPackage.ENUM_CONSTANT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELD_TYPEGRAPH_TFIELDDEFINITION_TCLASS_TFIELDSIGNATURE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TField) arguments.get(1),
					(TypeGraph) arguments.get(2), (TFieldDefinition) arguments.get(3), (TClass) arguments.get(4),
					(TFieldSignature) arguments.get(5));
			return null;
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELD_TYPEGRAPH_TFIELDDEFINITION_TCLASS_TFIELDSIGNATURE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TField) arguments.get(1),
					(TypeGraph) arguments.get(2), (TFieldDefinition) arguments.get(3), (TClass) arguments.get(4),
					(TFieldSignature) arguments.get(5));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TFIELD_TYPEGRAPH_TFIELDDEFINITION_ENUMDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_TFIELDSIGNATURE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TField) arguments.get(1),
					(TypeGraph) arguments.get(2), (TFieldDefinition) arguments.get(3),
					(EnumDeclaration) arguments.get(4), (TypeToTAbstractType) arguments.get(5),
					(TClass) arguments.get(6), (TFieldSignature) arguments.get(7));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.ENUM_CONSTANT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_29((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_30((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_CC__TFIELD_MENUMCONSTANTDECLARATION_TYPEGRAPH_TFIELDDEFINITION_ENUMDECLARATION_TCLASS_TFIELDSIGNATURE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TField) arguments.get(0), (MEnumConstantDeclaration) arguments.get(1),
					(TypeGraph) arguments.get(2), (TFieldDefinition) arguments.get(3),
					(EnumDeclaration) arguments.get(4), (TClass) arguments.get(5), (TFieldSignature) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___CHECK_DEC_FWD__MENUMCONSTANTDECLARATION_ENUMDECLARATION:
			return checkDEC_FWD((MEnumConstantDeclaration) arguments.get(0), (EnumDeclaration) arguments.get(1));
		case RulesPackage.ENUM_CONSTANT___CHECK_DEC_BWD__TFIELD_TYPEGRAPH_TFIELDDEFINITION_TCLASS_TFIELDSIGNATURE:
			return checkDEC_BWD((TField) arguments.get(0), (TypeGraph) arguments.get(1),
					(TFieldDefinition) arguments.get(2), (TClass) arguments.get(3), (TFieldSignature) arguments.get(4));
		case RulesPackage.ENUM_CONSTANT___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.ENUM_CONSTANT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_ENUMDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(EnumDeclaration) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(TClass) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.ENUM_CONSTANT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_EnumConstant_0_1_initialbindings_blackBBBB(EnumConstant _this, Match match,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {
		return new Object[] { _this, match, mDefinition, mEnum };
	}

	public static final Object[] pattern_EnumConstant_0_2_SolveCSP_bindingFBBBB(EnumConstant _this, Match match,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, mEnum);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, mEnum };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_0_2_SolveCSP_bindingAndBlackFBBBB(EnumConstant _this, Match match,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {
		Object[] result_pattern_EnumConstant_0_2_SolveCSP_binding = pattern_EnumConstant_0_2_SolveCSP_bindingFBBBB(
				_this, match, mDefinition, mEnum);
		if (result_pattern_EnumConstant_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_0_2_SolveCSP_binding[0];

			Object[] result_pattern_EnumConstant_0_2_SolveCSP_black = pattern_EnumConstant_0_2_SolveCSP_blackB(csp);
			if (result_pattern_EnumConstant_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, mEnum };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumConstant_0_3_CheckCSP_expressionFBB(EnumConstant _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_0_4_collectelementstobetranslated_blackBBB(Match match,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {
		return new Object[] { match, mDefinition, mEnum };
	}

	public static final Object[] pattern_EnumConstant_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mDefinition);
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mEnum__mDefinition____enumConstants);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		return new Object[] { match, mDefinition, mEnum, mEnum__mDefinition____enumConstants };
	}

	public static final Object[] pattern_EnumConstant_0_5_collectcontextelements_blackBBB(Match match,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {
		return new Object[] { match, mDefinition, mEnum };
	}

	public static final Object[] pattern_EnumConstant_0_5_collectcontextelements_greenBB(Match match,
			EnumDeclaration mEnum) {
		match.getContextNodes().add(mEnum);
		return new Object[] { match, mEnum };
	}

	public static final void pattern_EnumConstant_0_6_registerobjectstomatch_expressionBBBB(EnumConstant _this,
			Match match, MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, mEnum);

	}

	public static final boolean pattern_EnumConstant_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumConstant_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("model");
		EObject _localVariable_2 = isApplicableMatch.getObject("mEnum");
		EObject _localVariable_3 = isApplicableMatch.getObject("mEnumToTEnum");
		EObject _localVariable_4 = isApplicableMatch.getObject("tEnum");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		EObject tmpMEnum = _localVariable_2;
		EObject tmpMEnumToTEnum = _localVariable_3;
		EObject tmpTEnum = _localVariable_4;
		if (tmpMDefinition instanceof MEnumConstantDeclaration) {
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
			if (tmpModel instanceof TypeGraph) {
				TypeGraph model = (TypeGraph) tmpModel;
				if (tmpMEnum instanceof EnumDeclaration) {
					EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
					if (tmpMEnumToTEnum instanceof TypeToTAbstractType) {
						TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) tmpMEnumToTEnum;
						if (tmpTEnum instanceof TClass) {
							TClass tEnum = (TClass) tmpTEnum;
							return new Object[] { mDefinition, model, mEnum, mEnumToTEnum, tEnum, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_blackBBBBBFBB(
			MEnumConstantDeclaration mDefinition, TypeGraph model, EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mDefinition, model, mEnum, mEnumToTEnum, tEnum, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnumConstant_1_1_performtransformation_binding = pattern_EnumConstant_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_EnumConstant_1_1_performtransformation_binding != null) {
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result_pattern_EnumConstant_1_1_performtransformation_binding[0];
			TypeGraph model = (TypeGraph) result_pattern_EnumConstant_1_1_performtransformation_binding[1];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_1_1_performtransformation_binding[2];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result_pattern_EnumConstant_1_1_performtransformation_binding[3];
			TClass tEnum = (TClass) result_pattern_EnumConstant_1_1_performtransformation_binding[4];

			Object[] result_pattern_EnumConstant_1_1_performtransformation_black = pattern_EnumConstant_1_1_performtransformation_blackBBBBBFBB(
					mDefinition, model, mEnum, mEnumToTEnum, tEnum, _this, isApplicableMatch);
			if (result_pattern_EnumConstant_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumConstant_1_1_performtransformation_black[5];

				return new Object[] { mDefinition, model, mEnum, mEnumToTEnum, tEnum, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_greenFFFBBFBFB(
			MEnumConstantDeclaration mDefinition, TypeGraph model, TClass tEnum, CSP csp) {
		TField tName = BasicFactory.eINSTANCE.createTField();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TFieldDefinition tDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		Object _localVariable_0 = csp.getValue("tName", "tName");
		model.getFields().add(tName);
		mDefinitionToTMember.setSource(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		tEnum.getDefines().add(tDefinition);
		tDefinition.setSignature(tSignature);
		tSignature.setType(tEnum);
		tSignature.setField(tName);
		tEnum.getSignature().add(tSignature);
		String tName_tName_prime = (String) _localVariable_0;
		tName.setTName(tName_tName_prime);
		return new Object[] { tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model, tDefinition, tEnum,
				tSignature, csp };
	}

	public static final Object[] pattern_EnumConstant_1_2_collecttranslatedelements_blackBBBBBB(TField tName,
			MDefinitionToTMember mDefinitionToTMember, ASTNodeToTAnnotatable mBodyToTAnnotation,
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, TFieldSignature tSignature) {
		return new Object[] { tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, tDefinition, tSignature };
	}

	public static final Object[] pattern_EnumConstant_1_2_collecttranslatedelements_greenFBBBBBB(TField tName,
			MDefinitionToTMember mDefinitionToTMember, ASTNodeToTAnnotatable mBodyToTAnnotation,
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, TFieldSignature tSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tName);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(mDefinition);
		ruleresult.getCreatedElements().add(tDefinition);
		ruleresult.getCreatedElements().add(tSignature);
		return new Object[] { ruleresult, tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, tDefinition,
				tSignature };
	}

	public static final Object[] pattern_EnumConstant_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tName, EObject mDefinitionToTMember, EObject mBodyToTAnnotation,
			EObject mDefinition, EObject model, EObject tDefinition, EObject mEnum, EObject mEnumToTEnum, EObject tEnum,
			EObject tSignature) {
		if (!tName.equals(tSignature)) {
			if (!mDefinitionToTMember.equals(tName)) {
				if (!mDefinitionToTMember.equals(model)) {
					if (!mDefinitionToTMember.equals(tDefinition)) {
						if (!mDefinitionToTMember.equals(mEnum)) {
							if (!mDefinitionToTMember.equals(mEnumToTEnum)) {
								if (!mDefinitionToTMember.equals(tEnum)) {
									if (!mDefinitionToTMember.equals(tSignature)) {
										if (!mBodyToTAnnotation.equals(tName)) {
											if (!mBodyToTAnnotation.equals(mDefinitionToTMember)) {
												if (!mBodyToTAnnotation.equals(mDefinition)) {
													if (!mBodyToTAnnotation.equals(model)) {
														if (!mBodyToTAnnotation.equals(tDefinition)) {
															if (!mBodyToTAnnotation.equals(mEnum)) {
																if (!mBodyToTAnnotation.equals(mEnumToTEnum)) {
																	if (!mBodyToTAnnotation.equals(tEnum)) {
																		if (!mBodyToTAnnotation.equals(tSignature)) {
																			if (!mDefinition.equals(tName)) {
																				if (!mDefinition
																						.equals(mDefinitionToTMember)) {
																					if (!mDefinition.equals(model)) {
																						if (!mDefinition
																								.equals(tDefinition)) {
																							if (!mDefinition
																									.equals(mEnum)) {
																								if (!mDefinition.equals(
																										mEnumToTEnum)) {
																									if (!mDefinition
																											.equals(tEnum)) {
																										if (!mDefinition
																												.equals(tSignature)) {
																											if (!model
																													.equals(tName)) {
																												if (!model
																														.equals(tDefinition)) {
																													if (!model
																															.equals(tEnum)) {
																														if (!model
																																.equals(tSignature)) {
																															if (!tDefinition
																																	.equals(tName)) {
																																if (!tDefinition
																																		.equals(tEnum)) {
																																	if (!tDefinition
																																			.equals(tSignature)) {
																																		if (!mEnum
																																				.equals(tName)) {
																																			if (!mEnum
																																					.equals(model)) {
																																				if (!mEnum
																																						.equals(tDefinition)) {
																																					if (!mEnum
																																							.equals(mEnumToTEnum)) {
																																						if (!mEnum
																																								.equals(tEnum)) {
																																							if (!mEnum
																																									.equals(tSignature)) {
																																								if (!mEnumToTEnum
																																										.equals(tName)) {
																																									if (!mEnumToTEnum
																																											.equals(model)) {
																																										if (!mEnumToTEnum
																																												.equals(tDefinition)) {
																																											if (!mEnumToTEnum
																																													.equals(tEnum)) {
																																												if (!mEnumToTEnum
																																														.equals(tSignature)) {
																																													if (!tEnum
																																															.equals(tName)) {
																																														if (!tEnum
																																																.equals(tSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	tName,
																																																	mDefinitionToTMember,
																																																	mBodyToTAnnotation,
																																																	mDefinition,
																																																	model,
																																																	tDefinition,
																																																	mEnum,
																																																	mEnumToTEnum,
																																																	tEnum,
																																																	tSignature };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EnumConstant_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tName, EObject mDefinitionToTMember, EObject mBodyToTAnnotation,
			EObject mDefinition, EObject model, EObject tDefinition, EObject mEnum, EObject tEnum, EObject tSignature) {
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumConstant";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String tSignature__tEnum____type_name_prime = "type";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tEnum__tSignature____signature_name_prime = "signature";
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		ruleresult.getCreatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		ruleresult.getCreatedEdges().add(tName__model____model);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mEnum__mDefinition____enumConstants);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tSignature__tDefinition____definitions);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		ruleresult.getCreatedEdges().add(tDefinition__tEnum____definedBy);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		ruleresult.getCreatedEdges().add(tSignature__tEnum____type);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tEnum__tSignature____signature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		return new Object[] { ruleresult, tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model,
				tDefinition, mEnum, tEnum, tSignature, mDefinitionToTMember__mDefinition____source,
				mBodyToTAnnotation__mDefinition____source, model__tName____fields, tName__model____model,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__tDefinition____target,
				mEnum__mDefinition____enumConstants, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions, tEnum__tDefinition____defines, tDefinition__tEnum____definedBy,
				tSignature__tEnum____type, tSignature__tName____field, tName__tSignature____signatures,
				tEnum__tSignature____signature };
	}

	public static final void pattern_EnumConstant_1_5_registerobjects_expressionBBBBBBBBBBBB(EnumConstant _this,
			PerformRuleResult ruleresult, EObject tName, EObject mDefinitionToTMember, EObject mBodyToTAnnotation,
			EObject mDefinition, EObject model, EObject tDefinition, EObject mEnum, EObject mEnumToTEnum, EObject tEnum,
			EObject tSignature) {
		_this.registerObjects_FWD(ruleresult, tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model,
				tDefinition, mEnum, mEnumToTEnum, tEnum, tSignature);

	}

	public static final PerformRuleResult pattern_EnumConstant_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumConstant_2_1_preparereturnvalue_bindingFB(EnumConstant _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_2_1_preparereturnvalue_blackFBB(EClass eClass,
			EnumConstant _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_2_1_preparereturnvalue_bindingAndBlackFFB(EnumConstant _this) {
		Object[] result_pattern_EnumConstant_2_1_preparereturnvalue_binding = pattern_EnumConstant_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumConstant_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_EnumConstant_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumConstant_2_1_preparereturnvalue_black = pattern_EnumConstant_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_EnumConstant_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EnumConstant_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "EnumConstant";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EnumConstant_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mDefinition");
		EObject _localVariable_1 = match.getObject("mEnum");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMEnum = _localVariable_1;
		if (tmpMDefinition instanceof MEnumConstantDeclaration) {
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
			if (tmpMEnum instanceof EnumDeclaration) {
				EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
				return new Object[] { mDefinition, mEnum, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_2_2_corematch_blackBBFFB(
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mEnum, TypeToTAbstractType.class, "source")) {
			TAbstractType tmpTEnum = mEnumToTEnum.getTarget();
			if (tmpTEnum instanceof TClass) {
				TClass tEnum = (TClass) tmpTEnum;
				_result.add(new Object[] { mDefinition, mEnum, mEnumToTEnum, tEnum, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_2_3_findcontext_blackBFBBB(
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum,
			TClass tEnum) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mEnum.getEnumConstants().contains(mDefinition)) {
			if (mEnum.equals(mEnumToTEnum.getSource())) {
				if (tEnum.equals(mEnumToTEnum.getTarget())) {
					TypeGraph model = tEnum.getModel();
					if (model != null) {
						_result.add(new Object[] { mDefinition, model, mEnum, mEnumToTEnum, tEnum });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumConstant_2_3_findcontext_greenBBBBBFFFFFF(
			MEnumConstantDeclaration mDefinition, TypeGraph model, EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__mEnum____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__tEnum____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String mEnumToTEnum__mEnum____source_name_prime = "source";
		String mEnumToTEnum__tEnum____target_name_prime = "target";
		String tEnum__model____model_name_prime = "model";
		String model__tEnum____allTypes_name_prime = "allTypes";
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum);
		isApplicableMatch.getAllContextElements().add(tEnum);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mEnum__mDefinition____enumConstants);
		mEnumToTEnum__mEnum____source.setSrc(mEnumToTEnum);
		mEnumToTEnum__mEnum____source.setTrg(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__mEnum____source);
		mEnumToTEnum__tEnum____target.setSrc(mEnumToTEnum);
		mEnumToTEnum__tEnum____target.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__tEnum____target);
		tEnum__model____model.setSrc(tEnum);
		tEnum__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tEnum__model____model);
		model__tEnum____allTypes.setSrc(model);
		model__tEnum____allTypes.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(model__tEnum____allTypes);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		mEnumToTEnum__mEnum____source.setName(mEnumToTEnum__mEnum____source_name_prime);
		mEnumToTEnum__tEnum____target.setName(mEnumToTEnum__tEnum____target_name_prime);
		tEnum__model____model.setName(tEnum__model____model_name_prime);
		model__tEnum____allTypes.setName(model__tEnum____allTypes_name_prime);
		return new Object[] { mDefinition, model, mEnum, mEnumToTEnum, tEnum, isApplicableMatch,
				mEnum__mDefinition____enumConstants, mEnumToTEnum__mEnum____source, mEnumToTEnum__tEnum____target,
				tEnum__model____model, model__tEnum____allTypes };
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_bindingFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, MEnumConstantDeclaration mDefinition, TypeGraph model,
			EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum, TClass tEnum) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mDefinition, model, mEnum,
				mEnumToTEnum, tEnum);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mDefinition, model, mEnum, mEnumToTEnum, tEnum };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, MEnumConstantDeclaration mDefinition, TypeGraph model,
			EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum, TClass tEnum) {
		Object[] result_pattern_EnumConstant_2_4_solveCSP_binding = pattern_EnumConstant_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, mDefinition, model, mEnum, mEnumToTEnum, tEnum);
		if (result_pattern_EnumConstant_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_2_4_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_2_4_solveCSP_black = pattern_EnumConstant_2_4_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mDefinition, model, mEnum, mEnumToTEnum, tEnum };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumConstant_2_5_checkCSP_expressionFBB(EnumConstant _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EnumConstant_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EnumConstant";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EnumConstant_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumConstant_10_1_initialbindings_blackBBBBBBB(EnumConstant _this, Match match,
			TField tName, TypeGraph model, TFieldDefinition tDefinition, TClass tEnum, TFieldSignature tSignature) {
		return new Object[] { _this, match, tName, model, tDefinition, tEnum, tSignature };
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_bindingFBBBBBBB(EnumConstant _this, Match match,
			TField tName, TypeGraph model, TFieldDefinition tDefinition, TClass tEnum, TFieldSignature tSignature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tName, model, tDefinition, tEnum, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tName, model, tDefinition, tEnum, tSignature };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			Match match, TField tName, TypeGraph model, TFieldDefinition tDefinition, TClass tEnum,
			TFieldSignature tSignature) {
		Object[] result_pattern_EnumConstant_10_2_SolveCSP_binding = pattern_EnumConstant_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, tName, model, tDefinition, tEnum, tSignature);
		if (result_pattern_EnumConstant_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_10_2_SolveCSP_binding[0];

			Object[] result_pattern_EnumConstant_10_2_SolveCSP_black = pattern_EnumConstant_10_2_SolveCSP_blackB(csp);
			if (result_pattern_EnumConstant_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tName, model, tDefinition, tEnum, tSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumConstant_10_3_CheckCSP_expressionFBB(EnumConstant _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_10_4_collectelementstobetranslated_blackBBBBBB(Match match,
			TField tName, TypeGraph model, TFieldDefinition tDefinition, TClass tEnum, TFieldSignature tSignature) {
		return new Object[] { match, tName, model, tDefinition, tEnum, tSignature };
	}

	public static final Object[] pattern_EnumConstant_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(
			Match match, TField tName, TypeGraph model, TFieldDefinition tDefinition, TClass tEnum,
			TFieldSignature tSignature) {
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tName);
		match.getToBeTranslatedNodes().add(tDefinition);
		match.getToBeTranslatedNodes().add(tSignature);
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String tSignature__tEnum____type_name_prime = "type";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tEnum__tSignature____signature_name_prime = "signature";
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		match.getToBeTranslatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		match.getToBeTranslatedEdges().add(tName__model____model);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tSignature__tDefinition____definitions);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		match.getToBeTranslatedEdges().add(tDefinition__tEnum____definedBy);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		match.getToBeTranslatedEdges().add(tSignature__tEnum____type);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tEnum__tSignature____signature);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		return new Object[] { match, tName, model, tDefinition, tEnum, tSignature, model__tName____fields,
				tName__model____model, tDefinition__tSignature____signature, tSignature__tDefinition____definitions,
				tEnum__tDefinition____defines, tDefinition__tEnum____definedBy, tSignature__tEnum____type,
				tSignature__tName____field, tName__tSignature____signatures, tEnum__tSignature____signature };
	}

	public static final Object[] pattern_EnumConstant_10_5_collectcontextelements_blackBBBBBB(Match match, TField tName,
			TypeGraph model, TFieldDefinition tDefinition, TClass tEnum, TFieldSignature tSignature) {
		return new Object[] { match, tName, model, tDefinition, tEnum, tSignature };
	}

	public static final Object[] pattern_EnumConstant_10_5_collectcontextelements_greenBBBFF(Match match,
			TypeGraph model, TClass tEnum) {
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(model);
		match.getContextNodes().add(tEnum);
		String tEnum__model____model_name_prime = "model";
		String model__tEnum____allTypes_name_prime = "allTypes";
		tEnum__model____model.setSrc(tEnum);
		tEnum__model____model.setTrg(model);
		match.getContextEdges().add(tEnum__model____model);
		model__tEnum____allTypes.setSrc(model);
		model__tEnum____allTypes.setTrg(tEnum);
		match.getContextEdges().add(model__tEnum____allTypes);
		tEnum__model____model.setName(tEnum__model____model_name_prime);
		model__tEnum____allTypes.setName(model__tEnum____allTypes_name_prime);
		return new Object[] { match, model, tEnum, tEnum__model____model, model__tEnum____allTypes };
	}

	public static final void pattern_EnumConstant_10_6_registerobjectstomatch_expressionBBBBBBB(EnumConstant _this,
			Match match, TField tName, TypeGraph model, TFieldDefinition tDefinition, TClass tEnum,
			TFieldSignature tSignature) {
		_this.registerObjectsToMatch_BWD(match, tName, model, tDefinition, tEnum, tSignature);

	}

	public static final boolean pattern_EnumConstant_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumConstant_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tName");
		EObject _localVariable_1 = isApplicableMatch.getObject("model");
		EObject _localVariable_2 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("mEnum");
		EObject _localVariable_4 = isApplicableMatch.getObject("mEnumToTEnum");
		EObject _localVariable_5 = isApplicableMatch.getObject("tEnum");
		EObject _localVariable_6 = isApplicableMatch.getObject("tSignature");
		EObject tmpTName = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		EObject tmpMEnum = _localVariable_3;
		EObject tmpMEnumToTEnum = _localVariable_4;
		EObject tmpTEnum = _localVariable_5;
		EObject tmpTSignature = _localVariable_6;
		if (tmpTName instanceof TField) {
			TField tName = (TField) tmpTName;
			if (tmpModel instanceof TypeGraph) {
				TypeGraph model = (TypeGraph) tmpModel;
				if (tmpTDefinition instanceof TFieldDefinition) {
					TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
					if (tmpMEnum instanceof EnumDeclaration) {
						EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
						if (tmpMEnumToTEnum instanceof TypeToTAbstractType) {
							TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) tmpMEnumToTEnum;
							if (tmpTEnum instanceof TClass) {
								TClass tEnum = (TClass) tmpTEnum;
								if (tmpTSignature instanceof TFieldSignature) {
									TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
									return new Object[] { tName, model, tDefinition, mEnum, mEnumToTEnum, tEnum,
											tSignature, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_11_1_performtransformation_blackBBBBBBBFBB(TField tName,
			TypeGraph model, TFieldDefinition tDefinition, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum,
			TClass tEnum, TFieldSignature tSignature, EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tName, model, tDefinition, mEnum, mEnumToTEnum, tEnum, tSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnumConstant_11_1_performtransformation_binding = pattern_EnumConstant_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_EnumConstant_11_1_performtransformation_binding != null) {
			TField tName = (TField) result_pattern_EnumConstant_11_1_performtransformation_binding[0];
			TypeGraph model = (TypeGraph) result_pattern_EnumConstant_11_1_performtransformation_binding[1];
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_EnumConstant_11_1_performtransformation_binding[2];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_11_1_performtransformation_binding[3];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result_pattern_EnumConstant_11_1_performtransformation_binding[4];
			TClass tEnum = (TClass) result_pattern_EnumConstant_11_1_performtransformation_binding[5];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_EnumConstant_11_1_performtransformation_binding[6];

			Object[] result_pattern_EnumConstant_11_1_performtransformation_black = pattern_EnumConstant_11_1_performtransformation_blackBBBBBBBFBB(
					tName, model, tDefinition, mEnum, mEnumToTEnum, tEnum, tSignature, _this, isApplicableMatch);
			if (result_pattern_EnumConstant_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumConstant_11_1_performtransformation_black[7];

				return new Object[] { tName, model, tDefinition, mEnum, mEnumToTEnum, tEnum, tSignature, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_11_1_performtransformation_greenFFFBBB(
			TFieldDefinition tDefinition, EnumDeclaration mEnum, CSP csp) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MEnumConstantDeclaration mDefinition = ModiscoFactory.eINSTANCE.createMEnumConstantDeclaration();
		Object _localVariable_0 = csp.getValue("mDefinition", "name");
		mDefinitionToTMember.setTarget(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mEnum.getEnumConstants().add(mDefinition);
		String mDefinition_name_prime = (String) _localVariable_0;
		mDefinition.setName(mDefinition_name_prime);
		return new Object[] { mDefinitionToTMember, mBodyToTAnnotation, mDefinition, tDefinition, mEnum, csp };
	}

	public static final Object[] pattern_EnumConstant_11_2_collecttranslatedelements_blackBBBBBB(TField tName,
			MDefinitionToTMember mDefinitionToTMember, ASTNodeToTAnnotatable mBodyToTAnnotation,
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, TFieldSignature tSignature) {
		return new Object[] { tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, tDefinition, tSignature };
	}

	public static final Object[] pattern_EnumConstant_11_2_collecttranslatedelements_greenFBBBBBB(TField tName,
			MDefinitionToTMember mDefinitionToTMember, ASTNodeToTAnnotatable mBodyToTAnnotation,
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, TFieldSignature tSignature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tName);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(mDefinition);
		ruleresult.getTranslatedElements().add(tDefinition);
		ruleresult.getTranslatedElements().add(tSignature);
		return new Object[] { ruleresult, tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, tDefinition,
				tSignature };
	}

	public static final Object[] pattern_EnumConstant_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tName, EObject mDefinitionToTMember, EObject mBodyToTAnnotation,
			EObject mDefinition, EObject model, EObject tDefinition, EObject mEnum, EObject mEnumToTEnum, EObject tEnum,
			EObject tSignature) {
		if (!tName.equals(tSignature)) {
			if (!mDefinitionToTMember.equals(tName)) {
				if (!mDefinitionToTMember.equals(model)) {
					if (!mDefinitionToTMember.equals(tDefinition)) {
						if (!mDefinitionToTMember.equals(mEnum)) {
							if (!mDefinitionToTMember.equals(mEnumToTEnum)) {
								if (!mDefinitionToTMember.equals(tEnum)) {
									if (!mDefinitionToTMember.equals(tSignature)) {
										if (!mBodyToTAnnotation.equals(tName)) {
											if (!mBodyToTAnnotation.equals(mDefinitionToTMember)) {
												if (!mBodyToTAnnotation.equals(mDefinition)) {
													if (!mBodyToTAnnotation.equals(model)) {
														if (!mBodyToTAnnotation.equals(tDefinition)) {
															if (!mBodyToTAnnotation.equals(mEnum)) {
																if (!mBodyToTAnnotation.equals(mEnumToTEnum)) {
																	if (!mBodyToTAnnotation.equals(tEnum)) {
																		if (!mBodyToTAnnotation.equals(tSignature)) {
																			if (!mDefinition.equals(tName)) {
																				if (!mDefinition
																						.equals(mDefinitionToTMember)) {
																					if (!mDefinition.equals(model)) {
																						if (!mDefinition
																								.equals(tDefinition)) {
																							if (!mDefinition
																									.equals(mEnum)) {
																								if (!mDefinition.equals(
																										mEnumToTEnum)) {
																									if (!mDefinition
																											.equals(tEnum)) {
																										if (!mDefinition
																												.equals(tSignature)) {
																											if (!model
																													.equals(tName)) {
																												if (!model
																														.equals(tDefinition)) {
																													if (!model
																															.equals(tEnum)) {
																														if (!model
																																.equals(tSignature)) {
																															if (!tDefinition
																																	.equals(tName)) {
																																if (!tDefinition
																																		.equals(tEnum)) {
																																	if (!tDefinition
																																			.equals(tSignature)) {
																																		if (!mEnum
																																				.equals(tName)) {
																																			if (!mEnum
																																					.equals(model)) {
																																				if (!mEnum
																																						.equals(tDefinition)) {
																																					if (!mEnum
																																							.equals(mEnumToTEnum)) {
																																						if (!mEnum
																																								.equals(tEnum)) {
																																							if (!mEnum
																																									.equals(tSignature)) {
																																								if (!mEnumToTEnum
																																										.equals(tName)) {
																																									if (!mEnumToTEnum
																																											.equals(model)) {
																																										if (!mEnumToTEnum
																																												.equals(tDefinition)) {
																																											if (!mEnumToTEnum
																																													.equals(tEnum)) {
																																												if (!mEnumToTEnum
																																														.equals(tSignature)) {
																																													if (!tEnum
																																															.equals(tName)) {
																																														if (!tEnum
																																																.equals(tSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	tName,
																																																	mDefinitionToTMember,
																																																	mBodyToTAnnotation,
																																																	mDefinition,
																																																	model,
																																																	tDefinition,
																																																	mEnum,
																																																	mEnumToTEnum,
																																																	tEnum,
																																																	tSignature };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EnumConstant_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tName, EObject mDefinitionToTMember, EObject mBodyToTAnnotation,
			EObject mDefinition, EObject model, EObject tDefinition, EObject mEnum, EObject tEnum, EObject tSignature) {
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumConstant";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String tSignature__tEnum____type_name_prime = "type";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tEnum__tSignature____signature_name_prime = "signature";
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		ruleresult.getTranslatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		ruleresult.getTranslatedEdges().add(tName__model____model);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mEnum__mDefinition____enumConstants);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tSignature__tDefinition____definitions);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		ruleresult.getTranslatedEdges().add(tDefinition__tEnum____definedBy);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		ruleresult.getTranslatedEdges().add(tSignature__tEnum____type);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tEnum__tSignature____signature);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		return new Object[] { ruleresult, tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model,
				tDefinition, mEnum, tEnum, tSignature, mDefinitionToTMember__mDefinition____source,
				mBodyToTAnnotation__mDefinition____source, model__tName____fields, tName__model____model,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__tDefinition____target,
				mEnum__mDefinition____enumConstants, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions, tEnum__tDefinition____defines, tDefinition__tEnum____definedBy,
				tSignature__tEnum____type, tSignature__tName____field, tName__tSignature____signatures,
				tEnum__tSignature____signature };
	}

	public static final void pattern_EnumConstant_11_5_registerobjects_expressionBBBBBBBBBBBB(EnumConstant _this,
			PerformRuleResult ruleresult, EObject tName, EObject mDefinitionToTMember, EObject mBodyToTAnnotation,
			EObject mDefinition, EObject model, EObject tDefinition, EObject mEnum, EObject mEnumToTEnum, EObject tEnum,
			EObject tSignature) {
		_this.registerObjects_BWD(ruleresult, tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model,
				tDefinition, mEnum, mEnumToTEnum, tEnum, tSignature);

	}

	public static final PerformRuleResult pattern_EnumConstant_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumConstant_12_1_preparereturnvalue_bindingFB(EnumConstant _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_12_1_preparereturnvalue_blackFBB(EClass eClass,
			EnumConstant _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_12_1_preparereturnvalue_bindingAndBlackFFB(EnumConstant _this) {
		Object[] result_pattern_EnumConstant_12_1_preparereturnvalue_binding = pattern_EnumConstant_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumConstant_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_EnumConstant_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumConstant_12_1_preparereturnvalue_black = pattern_EnumConstant_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_EnumConstant_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_EnumConstant_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "EnumConstant";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_EnumConstant_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tName");
		EObject _localVariable_1 = match.getObject("model");
		EObject _localVariable_2 = match.getObject("tDefinition");
		EObject _localVariable_3 = match.getObject("tEnum");
		EObject _localVariable_4 = match.getObject("tSignature");
		EObject tmpTName = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		EObject tmpTEnum = _localVariable_3;
		EObject tmpTSignature = _localVariable_4;
		if (tmpTName instanceof TField) {
			TField tName = (TField) tmpTName;
			if (tmpModel instanceof TypeGraph) {
				TypeGraph model = (TypeGraph) tmpModel;
				if (tmpTDefinition instanceof TFieldDefinition) {
					TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
					if (tmpTEnum instanceof TClass) {
						TClass tEnum = (TClass) tmpTEnum;
						if (tmpTSignature instanceof TFieldSignature) {
							TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
							return new Object[] { tName, model, tDefinition, tEnum, tSignature, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_12_2_corematch_blackBBBFFBBB(TField tName,
			TypeGraph model, TFieldDefinition tDefinition, TClass tEnum, TFieldSignature tSignature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tEnum, TypeToTAbstractType.class, "target")) {
			Type tmpMEnum = mEnumToTEnum.getSource();
			if (tmpMEnum instanceof EnumDeclaration) {
				EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
				_result.add(new Object[] { tName, model, tDefinition, mEnum, mEnumToTEnum, tEnum, tSignature, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_12_3_findcontext_blackBBBBBBB(TField tName,
			TypeGraph model, TFieldDefinition tDefinition, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum,
			TClass tEnum, TFieldSignature tSignature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (model.getFields().contains(tName)) {
			if (tSignature.equals(tDefinition.getSignature())) {
				if (mEnum.equals(mEnumToTEnum.getSource())) {
					if (tEnum.equals(mEnumToTEnum.getTarget())) {
						if (tEnum.getDefines().contains(tDefinition)) {
							if (tEnum.equals(tSignature.getType())) {
								if (tName.equals(tSignature.getField())) {
									if (tEnum.getSignature().contains(tSignature)) {
										if (model.equals(tEnum.getModel())) {
											_result.add(new Object[] { tName, model, tDefinition, mEnum, mEnumToTEnum,
													tEnum, tSignature });
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

	public static final Object[] pattern_EnumConstant_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFF(TField tName,
			TypeGraph model, TFieldDefinition tDefinition, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum,
			TClass tEnum, TFieldSignature tSignature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__mEnum____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__tEnum____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String mEnumToTEnum__mEnum____source_name_prime = "source";
		String mEnumToTEnum__tEnum____target_name_prime = "target";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String tSignature__tEnum____type_name_prime = "type";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tEnum__tSignature____signature_name_prime = "signature";
		String tEnum__model____model_name_prime = "model";
		String model__tEnum____allTypes_name_prime = "allTypes";
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum);
		isApplicableMatch.getAllContextElements().add(tEnum);
		isApplicableMatch.getAllContextElements().add(tSignature);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tName__model____model);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		mEnumToTEnum__mEnum____source.setSrc(mEnumToTEnum);
		mEnumToTEnum__mEnum____source.setTrg(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__mEnum____source);
		mEnumToTEnum__tEnum____target.setSrc(mEnumToTEnum);
		mEnumToTEnum__tEnum____target.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__tEnum____target);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(tDefinition__tEnum____definedBy);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(tSignature__tEnum____type);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tEnum__tSignature____signature);
		tEnum__model____model.setSrc(tEnum);
		tEnum__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tEnum__model____model);
		model__tEnum____allTypes.setSrc(model);
		model__tEnum____allTypes.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(model__tEnum____allTypes);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		mEnumToTEnum__mEnum____source.setName(mEnumToTEnum__mEnum____source_name_prime);
		mEnumToTEnum__tEnum____target.setName(mEnumToTEnum__tEnum____target_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tEnum__model____model.setName(tEnum__model____model_name_prime);
		model__tEnum____allTypes.setName(model__tEnum____allTypes_name_prime);
		return new Object[] { tName, model, tDefinition, mEnum, mEnumToTEnum, tEnum, tSignature, isApplicableMatch,
				model__tName____fields, tName__model____model, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions, mEnumToTEnum__mEnum____source, mEnumToTEnum__tEnum____target,
				tEnum__tDefinition____defines, tDefinition__tEnum____definedBy, tSignature__tEnum____type,
				tSignature__tName____field, tName__tSignature____signatures, tEnum__tSignature____signature,
				tEnum__model____model, model__tEnum____allTypes };
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_bindingFBBBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TField tName, TypeGraph model, TFieldDefinition tDefinition,
			EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum, TClass tEnum, TFieldSignature tSignature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tName, model, tDefinition, mEnum,
				mEnumToTEnum, tEnum, tSignature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tName, model, tDefinition, mEnum, mEnumToTEnum, tEnum,
					tSignature };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TField tName, TypeGraph model, TFieldDefinition tDefinition,
			EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum, TClass tEnum, TFieldSignature tSignature) {
		Object[] result_pattern_EnumConstant_12_4_solveCSP_binding = pattern_EnumConstant_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tName, model, tDefinition, mEnum, mEnumToTEnum, tEnum, tSignature);
		if (result_pattern_EnumConstant_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_12_4_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_12_4_solveCSP_black = pattern_EnumConstant_12_4_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tName, model, tDefinition, mEnum, mEnumToTEnum,
						tEnum, tSignature };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumConstant_12_5_checkCSP_expressionFBB(EnumConstant _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_EnumConstant_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "EnumConstant";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_EnumConstant_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_EnumConstant_20_1_preparereturnvalue_bindingFB(EnumConstant _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			EnumConstant _this) {
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

	public static final Object[] pattern_EnumConstant_20_1_preparereturnvalue_bindingAndBlackFFBF(EnumConstant _this) {
		Object[] result_pattern_EnumConstant_20_1_preparereturnvalue_binding = pattern_EnumConstant_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumConstant_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_EnumConstant_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumConstant_20_1_preparereturnvalue_black = pattern_EnumConstant_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_EnumConstant_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EnumConstant_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_EnumConstant_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_0BB(TField tName,
			TypeGraph model) {
		TypeGraph __DEC_tName_model_16054 = tName.getModel();
		if (__DEC_tName_model_16054 != null) {
			if (!model.equals(__DEC_tName_model_16054)) {
				return new Object[] { tName, model };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_1B(
			TFieldDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_661822 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_661822 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_2BB(
			TFieldDefinition tDefinition, TFieldSignature tSignature) {
		TSignature __DEC_tDefinition_definitions_42078 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_42078 != null) {
			if (!tSignature.equals(__DEC_tDefinition_definitions_42078)) {
				return new Object[] { tDefinition, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_3BB(
			TFieldSignature tSignature, TField tName) {
		TField __DEC_tSignature_signatures_212281 = tSignature.getField();
		if (__DEC_tSignature_signatures_212281 != null) {
			if (!tName.equals(__DEC_tSignature_signatures_212281)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_fields) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpModel = _edge_fields.getSrc();
		if (tmpModel instanceof TypeGraph) {
			TypeGraph model = (TypeGraph) tmpModel;
			EObject tmpTName = _edge_fields.getTrg();
			if (tmpTName instanceof TField) {
				TField tName = (TField) tmpTName;
				if (model.getFields().contains(tName)) {
					if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_0BB(tName, model) == null) {
						for (TAbstractType tmpTEnum : model.getAllTypes()) {
							if (tmpTEnum instanceof TClass) {
								TClass tEnum = (TClass) tmpTEnum;
								for (TFieldSignature tSignature : tName.getSignatures()) {
									if (tEnum.equals(tSignature.getType())) {
										if (tEnum.getSignature().contains(tSignature)) {
											if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_3BB(tSignature,
													tName) == null) {
												for (TMember tmpTDefinition : tEnum.getDefines()) {
													if (tmpTDefinition instanceof TFieldDefinition) {
														TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
														if (tSignature.equals(tDefinition.getSignature())) {
															if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_1B(
																	tDefinition) == null) {
																if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_2BB(
																		tDefinition, tSignature) == null) {
																	_result.add(
																			new Object[] { tName, model, tDefinition,
																					tEnum, tSignature, _edge_fields });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EnumConstant_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			EnumConstant _this, Match match, TField tName, TypeGraph model, TFieldDefinition tDefinition, TClass tEnum,
			TFieldSignature tSignature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tName, model, tDefinition, tEnum, tSignature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EnumConstant_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			EnumConstant _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_EnumConstant_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EnumConstant_21_1_preparereturnvalue_bindingFB(EnumConstant _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			EnumConstant _this) {
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

	public static final Object[] pattern_EnumConstant_21_1_preparereturnvalue_bindingAndBlackFFBF(EnumConstant _this) {
		Object[] result_pattern_EnumConstant_21_1_preparereturnvalue_binding = pattern_EnumConstant_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_EnumConstant_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_EnumConstant_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_EnumConstant_21_1_preparereturnvalue_black = pattern_EnumConstant_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_EnumConstant_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_EnumConstant_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_EnumConstant_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_EnumConstant_21_2_testcorematchandDECs_black_nac_0B(
			MEnumConstantDeclaration mDefinition) {
		MSignature __DEC_mDefinition_mDefinitions_611555 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_611555 != null) {
			return new Object[] { mDefinition };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_enumConstants) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMEnum = _edge_enumConstants.getSrc();
		if (tmpMEnum instanceof EnumDeclaration) {
			EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
			EObject tmpMDefinition = _edge_enumConstants.getTrg();
			if (tmpMDefinition instanceof MEnumConstantDeclaration) {
				MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
				if (mEnum.getEnumConstants().contains(mDefinition)) {
					if (pattern_EnumConstant_21_2_testcorematchandDECs_black_nac_0B(mDefinition) == null) {
						_result.add(new Object[] { mDefinition, mEnum, _edge_enumConstants });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_EnumConstant_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_EnumConstant_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			EnumConstant _this, Match match, MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, mEnum);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_EnumConstant_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			EnumConstant _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_EnumConstant_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_EnumConstant_24_1_prepare_blackB(EnumConstant _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EnumConstant_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_EnumConstant_24_2_matchsrctrgcontext_bindingFFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tName");
		EObject _localVariable_1 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_2 = targetMatch.getObject("model");
		EObject _localVariable_3 = targetMatch.getObject("tDefinition");
		EObject _localVariable_4 = sourceMatch.getObject("mEnum");
		EObject _localVariable_5 = targetMatch.getObject("tEnum");
		EObject _localVariable_6 = targetMatch.getObject("tSignature");
		EObject tmpTName = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpModel = _localVariable_2;
		EObject tmpTDefinition = _localVariable_3;
		EObject tmpMEnum = _localVariable_4;
		EObject tmpTEnum = _localVariable_5;
		EObject tmpTSignature = _localVariable_6;
		if (tmpTName instanceof TField) {
			TField tName = (TField) tmpTName;
			if (tmpMDefinition instanceof MEnumConstantDeclaration) {
				MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
				if (tmpModel instanceof TypeGraph) {
					TypeGraph model = (TypeGraph) tmpModel;
					if (tmpTDefinition instanceof TFieldDefinition) {
						TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
						if (tmpMEnum instanceof EnumDeclaration) {
							EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
							if (tmpTEnum instanceof TClass) {
								TClass tEnum = (TClass) tmpTEnum;
								if (tmpTSignature instanceof TFieldSignature) {
									TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
									return new Object[] { tName, mDefinition, model, tDefinition, mEnum, tEnum,
											tSignature, targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_2_matchsrctrgcontext_blackBBBBBBBBB(TField tName,
			MEnumConstantDeclaration mDefinition, TypeGraph model, TFieldDefinition tDefinition, EnumDeclaration mEnum,
			TClass tEnum, TFieldSignature tSignature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tName, mDefinition, model, tDefinition, mEnum, tEnum, tSignature, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding = pattern_EnumConstant_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding != null) {
			TField tName = (TField) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[0];
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[1];
			TypeGraph model = (TypeGraph) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[2];
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[3];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[4];
			TClass tEnum = (TClass) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[5];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_EnumConstant_24_2_matchsrctrgcontext_black = pattern_EnumConstant_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					tName, mDefinition, model, tDefinition, mEnum, tEnum, tSignature, sourceMatch, targetMatch);
			if (result_pattern_EnumConstant_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tName, mDefinition, model, tDefinition, mEnum, tEnum, tSignature, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_bindingFBBBBBBBBBB(EnumConstant _this, TField tName,
			MEnumConstantDeclaration mDefinition, TypeGraph model, TFieldDefinition tDefinition, EnumDeclaration mEnum,
			TClass tEnum, TFieldSignature tSignature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(tName, mDefinition, model, tDefinition, mEnum, tEnum,
				tSignature, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, tName, mDefinition, model, tDefinition, mEnum, tEnum, tSignature,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(EnumConstant _this,
			TField tName, MEnumConstantDeclaration mDefinition, TypeGraph model, TFieldDefinition tDefinition,
			EnumDeclaration mEnum, TClass tEnum, TFieldSignature tSignature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EnumConstant_24_3_solvecsp_binding = pattern_EnumConstant_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, tName, mDefinition, model, tDefinition, mEnum, tEnum, tSignature, sourceMatch, targetMatch);
		if (result_pattern_EnumConstant_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_24_3_solvecsp_binding[0];

			Object[] result_pattern_EnumConstant_24_3_solvecsp_black = pattern_EnumConstant_24_3_solvecsp_blackB(csp);
			if (result_pattern_EnumConstant_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tName, mDefinition, model, tDefinition, mEnum, tEnum, tSignature,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumConstant_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_24_5_matchcorrcontext_blackBFBBB(EnumDeclaration mEnum,
			TClass tEnum, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mEnum, TypeToTAbstractType.class, "source")) {
				if (tEnum.equals(mEnumToTEnum.getTarget())) {
					_result.add(new Object[] { mEnum, mEnumToTEnum, tEnum, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumConstant_24_5_matchcorrcontext_greenBBBF(TypeToTAbstractType mEnumToTEnum,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "EnumConstant";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mEnumToTEnum);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mEnumToTEnum, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_EnumConstant_24_6_createcorrespondence_blackBBBBBBBB(TField tName,
			MEnumConstantDeclaration mDefinition, TypeGraph model, TFieldDefinition tDefinition, EnumDeclaration mEnum,
			TClass tEnum, TFieldSignature tSignature, CCMatch ccMatch) {
		return new Object[] { tName, mDefinition, model, tDefinition, mEnum, tEnum, tSignature, ccMatch };
	}

	public static final Object[] pattern_EnumConstant_24_6_createcorrespondence_greenFFBBB(
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, CCMatch ccMatch) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		mDefinitionToTMember.setSource(mDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mDefinitionToTMember);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { mDefinitionToTMember, mBodyToTAnnotation, mDefinition, tDefinition, ccMatch };
	}

	public static final Object[] pattern_EnumConstant_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_EnumConstant_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "EnumConstant";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_EnumConstant_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_EnumConstant_27_1_matchtggpattern_black_nac_0B(
			MEnumConstantDeclaration mDefinition) {
		MSignature __DEC_mDefinition_mDefinitions_704610 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_704610 != null) {
			return new Object[] { mDefinition };
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_27_1_matchtggpattern_blackBB(MEnumConstantDeclaration mDefinition,
			EnumDeclaration mEnum) {
		if (mEnum.getEnumConstants().contains(mDefinition)) {
			if (pattern_EnumConstant_27_1_matchtggpattern_black_nac_0B(mDefinition) == null) {
				return new Object[] { mDefinition, mEnum };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumConstant_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumConstant_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_0BB(TField tName,
			TypeGraph model) {
		TypeGraph __DEC_tName_model_641308 = tName.getModel();
		if (__DEC_tName_model_641308 != null) {
			if (!model.equals(__DEC_tName_model_641308)) {
				return new Object[] { tName, model };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_1B(TFieldDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_335064 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_335064 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_2BB(TFieldDefinition tDefinition,
			TFieldSignature tSignature) {
		TSignature __DEC_tDefinition_definitions_107762 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_107762 != null) {
			if (!tSignature.equals(__DEC_tDefinition_definitions_107762)) {
				return new Object[] { tDefinition, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_3BB(TFieldSignature tSignature,
			TField tName) {
		TField __DEC_tSignature_signatures_820226 = tSignature.getField();
		if (__DEC_tSignature_signatures_820226 != null) {
			if (!tName.equals(__DEC_tSignature_signatures_820226)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_blackBBBBB(TField tName, TypeGraph model,
			TFieldDefinition tDefinition, TClass tEnum, TFieldSignature tSignature) {
		if (model.getFields().contains(tName)) {
			if (tSignature.equals(tDefinition.getSignature())) {
				if (tEnum.getDefines().contains(tDefinition)) {
					if (tEnum.equals(tSignature.getType())) {
						if (tName.equals(tSignature.getField())) {
							if (tEnum.getSignature().contains(tSignature)) {
								if (model.equals(tEnum.getModel())) {
									if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_0BB(tName, model) == null) {
										if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_1B(
												tDefinition) == null) {
											if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_2BB(tDefinition,
													tSignature) == null) {
												if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_3BB(tSignature,
														tName) == null) {
													return new Object[] { tName, model, tDefinition, tEnum,
															tSignature };
												}
											}
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

	public static final boolean pattern_EnumConstant_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_EnumConstant_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_29_1_createresult_blackB(EnumConstant _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_EnumConstant_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_EnumConstant_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph model) {
		if (ruleResult.getTargetObjects().contains(model)) {
			return new Object[] { ruleResult, model };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TClass tEnum) {
		if (ruleResult.getTargetObjects().contains(tEnum)) {
			return new Object[] { ruleResult, tEnum };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mEnumToTEnum) {
		if (ruleResult.getCorrObjects().contains(mEnumToTEnum)) {
			return new Object[] { ruleResult, mEnumToTEnum };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, EnumDeclaration mEnum) {
		if (ruleResult.getSourceObjects().contains(mEnum)) {
			return new Object[] { ruleResult, mEnum };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mEnumToTEnumList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMEnumToTEnum : mEnumToTEnumList.getEntryObjects()) {
				if (tmpMEnumToTEnum instanceof TypeToTAbstractType) {
					TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) tmpMEnumToTEnum;
					TAbstractType tmpTEnum = mEnumToTEnum.getTarget();
					if (tmpTEnum instanceof TClass) {
						TClass tEnum = (TClass) tmpTEnum;
						Type tmpMEnum = mEnumToTEnum.getSource();
						if (tmpMEnum instanceof EnumDeclaration) {
							EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
							TypeGraph model = tEnum.getModel();
							if (model != null) {
								if (pattern_EnumConstant_29_2_isapplicablecore_black_nac_2BB(ruleResult,
										mEnumToTEnum) == null) {
									if (pattern_EnumConstant_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											tEnum) == null) {
										if (pattern_EnumConstant_29_2_isapplicablecore_black_nac_3BB(ruleResult,
												mEnum) == null) {
											if (pattern_EnumConstant_29_2_isapplicablecore_black_nac_0BB(ruleResult,
													model) == null) {
												_result.add(new Object[] { mEnumToTEnumList, model, tEnum, mEnumToTEnum,
														mEnum, ruleEntryContainer, ruleResult });
											}
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

	public static final Object[] pattern_EnumConstant_29_3_solveCSP_bindingFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, model, mEnum, mEnumToTEnum, tEnum,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, mEnum, mEnumToTEnum, tEnum, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_29_3_solveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EnumConstant_29_3_solveCSP_binding = pattern_EnumConstant_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, model, mEnum, mEnumToTEnum, tEnum, ruleResult);
		if (result_pattern_EnumConstant_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_29_3_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_29_3_solveCSP_black = pattern_EnumConstant_29_3_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, mEnum, mEnumToTEnum, tEnum, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumConstant_29_4_checkCSP_expressionFBB(EnumConstant _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_29_5_checknacs_blackBBBB(TypeGraph model, EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum) {
		return new Object[] { model, mEnum, mEnumToTEnum, tEnum };
	}

	public static final Object[] pattern_EnumConstant_29_6_perform_blackBBBBB(TypeGraph model, EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { model, mEnum, mEnumToTEnum, tEnum, ruleResult };
	}

	public static final Object[] pattern_EnumConstant_29_6_perform_greenFFFFBFBBFBB(TypeGraph model,
			EnumDeclaration mEnum, TClass tEnum, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TField tName = BasicFactory.eINSTANCE.createTField();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MEnumConstantDeclaration mDefinition = ModiscoFactory.eINSTANCE.createMEnumConstantDeclaration();
		TFieldDefinition tDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		Object _localVariable_0 = csp.getValue("tName", "tName");
		Object _localVariable_1 = csp.getValue("mDefinition", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		model.getFields().add(tName);
		ruleResult.getTargetObjects().add(tName);
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		mDefinitionToTMember.setSource(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mEnum.getEnumConstants().add(mDefinition);
		ruleResult.getSourceObjects().add(mDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		tEnum.getDefines().add(tDefinition);
		ruleResult.getTargetObjects().add(tDefinition);
		tDefinition.setSignature(tSignature);
		tSignature.setType(tEnum);
		tSignature.setField(tName);
		tEnum.getSignature().add(tSignature);
		ruleResult.getTargetObjects().add(tSignature);
		String tName_tName_prime = (String) _localVariable_0;
		String mDefinition_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tName.setTName(tName_tName_prime);
		mDefinition.setName(mDefinition_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tName, mDefinitionToTMember, mBodyToTAnnotation, mDefinition, model, tDefinition, mEnum,
				tEnum, tSignature, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EnumConstant_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnumConstantImpl
