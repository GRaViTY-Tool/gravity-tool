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
		TClass tEnum = (TClass) result1_bindingAndBlack[0];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result1_bindingAndBlack[1];
		EnumDeclaration mEnum = (EnumDeclaration) result1_bindingAndBlack[2];
		TypeGraph model = (TypeGraph) result1_bindingAndBlack[3];
		TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = EnumConstantImpl.pattern_EnumConstant_1_1_performtransformation_greenFFFFBFBBB(tEnum,
				mDefinition, model, csp);
		TFieldDefinition tDefinition = (TFieldDefinition) result1_green[0];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[1];
		TFieldSignature tSignature = (TFieldSignature) result1_green[2];
		TField tName = (TField) result1_green[3];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[5];

		Object[] result2_black = EnumConstantImpl.pattern_EnumConstant_1_2_collecttranslatedelements_blackBBBBBB(
				tDefinition, mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tDefinition] = " + tDefinition
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[tSignature] = " + tSignature
					+ ", " + "[tName] = " + tName + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
					+ "[mDefinition] = " + mDefinition + ".");
		}
		Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_1_2_collecttranslatedelements_greenFBBBBBB(
				tDefinition, mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumConstantImpl.pattern_EnumConstant_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, tDefinition, mBodyToTAnnotation, tSignature, tName, tEnum, mDefinitionToTMember,
				mDefinition, mEnum, model, mEnumToTEnum);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation
					+ ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", " + "[tEnum] = " + tEnum
					+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mEnum] = " + mEnum + ", " + "[model] = " + model + ", "
					+ "[mEnumToTEnum] = " + mEnumToTEnum + ".");
		}
		EnumConstantImpl.pattern_EnumConstant_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult,
				tDefinition, mBodyToTAnnotation, tSignature, tName, tEnum, mDefinitionToTMember, mDefinition, mEnum,
				model);
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[24];

		// 
		// 
		EnumConstantImpl.pattern_EnumConstant_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult, tDefinition,
				mBodyToTAnnotation, tSignature, tName, tEnum, mDefinitionToTMember, mDefinition, mEnum, model,
				mEnumToTEnum);
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
		for (Object[] result2_black : EnumConstantImpl.pattern_EnumConstant_2_2_corematch_blackFBBFB(mDefinition, mEnum,
				match)) {
			TClass tEnum = (TClass) result2_black[0];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result2_black[3];
			// ForEach 
			for (Object[] result3_black : EnumConstantImpl.pattern_EnumConstant_2_3_findcontext_blackBBBFB(tEnum,
					mDefinition, mEnum, mEnumToTEnum)) {
				TypeGraph model = (TypeGraph) result3_black[3];
				Object[] result3_green = EnumConstantImpl.pattern_EnumConstant_2_3_findcontext_greenBBBBBFFFFFF(tEnum,
						mDefinition, mEnum, model, mEnumToTEnum);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge model__tEnum____allTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mEnumToTEnum__mEnum____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mEnumToTEnum__tEnum____target = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = EnumConstantImpl
						.pattern_EnumConstant_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, tEnum,
								mDefinition, mEnum, model, mEnumToTEnum);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tEnum] = " + tEnum + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mEnum] = " + mEnum + ", " + "[model] = "
							+ model + ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ".");
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TClass tEnum,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, TypeGraph model,
			TypeToTAbstractType mEnumToTEnum) {// Create CSP
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
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mEnum", mEnum);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tDefinition, EObject mBodyToTAnnotation,
			EObject tSignature, EObject tName, EObject tEnum, EObject mDefinitionToTMember, EObject mDefinition,
			EObject mEnum, EObject model, EObject mEnumToTEnum) {
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mEnum", mEnum);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("mEnumToTEnum", mEnumToTEnum);

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
	public boolean isAppropriate_BWD(Match match, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName, TClass tEnum, TypeGraph model) {

		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_10_1_initialbindings_blackBBBBBBB(this, match,
				tDefinition, tSignature, tName, tEnum, model);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", "
							+ "[tName] = " + tName + ", " + "[tEnum] = " + tEnum + ", " + "[model] = " + model + ".");
		}

		Object[] result2_bindingAndBlack = EnumConstantImpl.pattern_EnumConstant_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
				this, match, tDefinition, tSignature, tName, tEnum, model);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", "
							+ "[tName] = " + tName + ", " + "[tEnum] = " + tEnum + ", " + "[model] = " + model + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (EnumConstantImpl.pattern_EnumConstant_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = EnumConstantImpl
					.pattern_EnumConstant_10_4_collectelementstobetranslated_blackBBBBBB(match, tDefinition, tSignature,
							tName, tEnum, model);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = "
						+ tName + ", " + "[tEnum] = " + tEnum + ", " + "[model] = " + model + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(match,
					tDefinition, tSignature, tName, tEnum, model);
			//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result4_green[15];

			Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_10_5_collectcontextelements_blackBBBBBB(
					match, tDefinition, tSignature, tName, tEnum, model);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = "
						+ tName + ", " + "[tEnum] = " + tEnum + ", " + "[model] = " + model + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_10_5_collectcontextelements_greenBBBFF(match, tEnum, model);
			//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge model__tEnum____allTypes = (EMoflonEdge) result5_green[4];

			// 
			EnumConstantImpl.pattern_EnumConstant_10_6_registerobjectstomatch_expressionBBBBBBB(this, match,
					tDefinition, tSignature, tName, tEnum, model);
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
		TFieldDefinition tDefinition = (TFieldDefinition) result1_bindingAndBlack[0];
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[1];
		TField tName = (TField) result1_bindingAndBlack[2];
		TClass tEnum = (TClass) result1_bindingAndBlack[3];
		EnumDeclaration mEnum = (EnumDeclaration) result1_bindingAndBlack[4];
		TypeGraph model = (TypeGraph) result1_bindingAndBlack[5];
		TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = EnumConstantImpl
				.pattern_EnumConstant_11_1_performtransformation_greenBFFFBB(tDefinition, mEnum, csp);
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[1];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[2];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result1_green[3];

		Object[] result2_black = EnumConstantImpl.pattern_EnumConstant_11_2_collecttranslatedelements_blackBBBBBB(
				tDefinition, mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tDefinition] = " + tDefinition
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[tSignature] = " + tSignature
					+ ", " + "[tName] = " + tName + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", "
					+ "[mDefinition] = " + mDefinition + ".");
		}
		Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_11_2_collecttranslatedelements_greenFBBBBBB(
				tDefinition, mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumConstantImpl.pattern_EnumConstant_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, tDefinition, mBodyToTAnnotation, tSignature, tName, tEnum, mDefinitionToTMember,
				mDefinition, mEnum, model, mEnumToTEnum);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tDefinition] = " + tDefinition + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation
					+ ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", " + "[tEnum] = " + tEnum
					+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mEnum] = " + mEnum + ", " + "[model] = " + model + ", "
					+ "[mEnumToTEnum] = " + mEnumToTEnum + ".");
		}
		EnumConstantImpl.pattern_EnumConstant_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult,
				tDefinition, mBodyToTAnnotation, tSignature, tName, tEnum, mDefinitionToTMember, mDefinition, mEnum,
				model);
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[24];

		// 
		// 
		EnumConstantImpl.pattern_EnumConstant_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult, tDefinition,
				mBodyToTAnnotation, tSignature, tName, tEnum, mDefinitionToTMember, mDefinition, mEnum, model,
				mEnumToTEnum);
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
		TFieldDefinition tDefinition = (TFieldDefinition) result2_binding[0];
		TFieldSignature tSignature = (TFieldSignature) result2_binding[1];
		TField tName = (TField) result2_binding[2];
		TClass tEnum = (TClass) result2_binding[3];
		TypeGraph model = (TypeGraph) result2_binding[4];
		for (Object[] result2_black : EnumConstantImpl.pattern_EnumConstant_12_2_corematch_blackBBBBFBFB(tDefinition,
				tSignature, tName, tEnum, model, match)) {
			EnumDeclaration mEnum = (EnumDeclaration) result2_black[4];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : EnumConstantImpl.pattern_EnumConstant_12_3_findcontext_blackBBBBBBB(
					tDefinition, tSignature, tName, tEnum, mEnum, model, mEnumToTEnum)) {
				Object[] result3_green = EnumConstantImpl
						.pattern_EnumConstant_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFF(tDefinition, tSignature,
								tName, tEnum, mEnum, model, mEnumToTEnum);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge model__tEnum____allTypes = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mEnumToTEnum__mEnum____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mEnumToTEnum__tEnum____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = EnumConstantImpl
						.pattern_EnumConstant_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tDefinition, tSignature, tName, tEnum, mEnum, model, mEnumToTEnum);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tDefinition] = " + tDefinition
							+ ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", " + "[tEnum] = "
							+ tEnum + ", " + "[mEnum] = " + mEnum + ", " + "[model] = " + model + ", "
							+ "[mEnumToTEnum] = " + mEnumToTEnum + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName, TClass tEnum, TypeGraph model) {
		match.registerObject("tDefinition", tDefinition);
		match.registerObject("tSignature", tSignature);
		match.registerObject("tName", tName);
		match.registerObject("tEnum", tEnum);
		match.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName, TClass tEnum, TypeGraph model) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName, TClass tEnum, EnumDeclaration mEnum, TypeGraph model,
			TypeToTAbstractType mEnumToTEnum) {// Create CSP
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
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("mEnum", mEnum);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tDefinition, EObject mBodyToTAnnotation,
			EObject tSignature, EObject tName, EObject tEnum, EObject mDefinitionToTMember, EObject mDefinition,
			EObject mEnum, EObject model, EObject mEnumToTEnum) {
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mEnum", mEnum);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("mEnumToTEnum", mEnumToTEnum);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tDefinition").eClass())
						.equals("basic.TFieldDefinition.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSignature").eClass())
						.equals("basic.TFieldSignature.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tName").eClass()).equals("basic.TField.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_170(EMoflonEdge _edge_type) {

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
				.pattern_EnumConstant_20_2_testcorematchandDECs_blackFFFFFB(_edge_type)) {
			TFieldDefinition tDefinition = (TFieldDefinition) result2_black[0];
			TFieldSignature tSignature = (TFieldSignature) result2_black[1];
			TField tName = (TField) result2_black[2];
			TClass tEnum = (TClass) result2_black[3];
			TypeGraph model = (TypeGraph) result2_black[4];
			Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (EnumConstantImpl.pattern_EnumConstant_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
					this, match, tDefinition, tSignature, tName, tEnum, model)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_178(EMoflonEdge _edge_enumConstants) {

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

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Variable var_mDefinition_name = CSPFactoryHelper.eINSTANCE.createVariable("mDefinition", true, csp);
		var_mDefinition_name.setValue(__helper.getValue("mDefinition", "name"));
		var_mDefinition_name.setType("String");

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

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Variable var_mDefinition_name = CSPFactoryHelper.eINSTANCE.createVariable("mDefinition", true, csp);
		var_mDefinition_name.setValue(__helper.getValue("mDefinition", "name"));
		var_mDefinition_name.setType("String");

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
		TFieldDefinition tDefinition = (TFieldDefinition) result2_bindingAndBlack[0];
		TFieldSignature tSignature = (TFieldSignature) result2_bindingAndBlack[1];
		TField tName = (TField) result2_bindingAndBlack[2];
		TClass tEnum = (TClass) result2_bindingAndBlack[3];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result2_bindingAndBlack[4];
		EnumDeclaration mEnum = (EnumDeclaration) result2_bindingAndBlack[5];
		TypeGraph model = (TypeGraph) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, tDefinition, tSignature, tName,
						tEnum, mDefinition, mEnum, model, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = "
					+ tName + ", " + "[tEnum] = " + tEnum + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mEnum] = " + mEnum + ", " + "[model] = " + model + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (EnumConstantImpl.pattern_EnumConstant_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : EnumConstantImpl.pattern_EnumConstant_24_5_matchcorrcontext_blackBBFBB(tEnum,
					mEnum, sourceMatch, targetMatch)) {
				TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result5_black[2];
				Object[] result5_green = EnumConstantImpl
						.pattern_EnumConstant_24_5_matchcorrcontext_greenBBBF(mEnumToTEnum, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = EnumConstantImpl.pattern_EnumConstant_24_6_createcorrespondence_blackBBBBBBBB(
						tDefinition, tSignature, tName, tEnum, mDefinition, mEnum, model, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tDefinition] = "
							+ tDefinition + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", "
							+ "[tEnum] = " + tEnum + ", " + "[mDefinition] = " + mDefinition + ", " + "[mEnum] = "
							+ mEnum + ", " + "[model] = " + model + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				EnumConstantImpl.pattern_EnumConstant_24_6_createcorrespondence_greenBFFBB(tDefinition, mDefinition,
						ccMatch);
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[1];
				//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName,
			TClass tEnum, MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, TypeGraph model,
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
	public boolean checkDEC_BWD(TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum,
			TypeGraph model) {// 
		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_28_1_matchtggpattern_blackBBBBB(tDefinition,
				tSignature, tName, tEnum, model);
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
			TClass tEnum = (TClass) result2_black[1];
			TypeGraph model = (TypeGraph) result2_black[2];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result2_black[3];
			EnumDeclaration mEnum = (EnumDeclaration) result2_black[4];

			Object[] result3_bindingAndBlack = EnumConstantImpl
					.pattern_EnumConstant_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, tEnum, mEnum,
							model, mEnumToTEnum, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tEnum] = " + tEnum + ", "
						+ "[mEnum] = " + mEnum + ", " + "[model] = " + model + ", " + "[mEnumToTEnum] = " + mEnumToTEnum
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (EnumConstantImpl.pattern_EnumConstant_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_29_5_checknacs_blackBBBB(tEnum, mEnum,
						model, mEnumToTEnum);
				if (result5_black != null) {

					Object[] result6_black = EnumConstantImpl.pattern_EnumConstant_29_6_perform_blackBBBBB(tEnum, mEnum,
							model, mEnumToTEnum, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tEnum] = " + tEnum
								+ ", " + "[mEnum] = " + mEnum + ", " + "[model] = " + model + ", " + "[mEnumToTEnum] = "
								+ mEnumToTEnum + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					EnumConstantImpl.pattern_EnumConstant_29_6_perform_greenFFFFBFFBBBB(tEnum, mEnum, model, ruleResult,
							csp);
					//nothing TFieldDefinition tDefinition = (TFieldDefinition) result6_green[0];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[1];
					//nothing TFieldSignature tSignature = (TFieldSignature) result6_green[2];
					//nothing TField tName = (TField) result6_green[3];
					//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[5];
					//nothing MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result6_green[6];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TClass tEnum, EnumDeclaration mEnum,
			TypeGraph model, TypeToTAbstractType mEnumToTEnum, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("mEnum", mEnum);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
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
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TCLASS_MENUMCONSTANTDECLARATION_ENUMDECLARATION_TYPEGRAPH_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(MEnumConstantDeclaration) arguments.get(2), (EnumDeclaration) arguments.get(3),
					(TypeGraph) arguments.get(4), (TypeToTAbstractType) arguments.get(5));
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
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_BWD__MATCH_TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD_TCLASS_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TFieldDefinition) arguments.get(1),
					(TFieldSignature) arguments.get(2), (TField) arguments.get(3), (TClass) arguments.get(4),
					(TypeGraph) arguments.get(5));
		case RulesPackage.ENUM_CONSTANT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD_TCLASS_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TFieldDefinition) arguments.get(1),
					(TFieldSignature) arguments.get(2), (TField) arguments.get(3), (TClass) arguments.get(4),
					(TypeGraph) arguments.get(5));
			return null;
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD_TCLASS_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TFieldDefinition) arguments.get(1),
					(TFieldSignature) arguments.get(2), (TField) arguments.get(3), (TClass) arguments.get(4),
					(TypeGraph) arguments.get(5));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD_TCLASS_ENUMDECLARATION_TYPEGRAPH_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TFieldDefinition) arguments.get(1),
					(TFieldSignature) arguments.get(2), (TField) arguments.get(3), (TClass) arguments.get(4),
					(EnumDeclaration) arguments.get(5), (TypeGraph) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7));
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
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_170__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_170((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_178__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_178((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_CC__TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD_TCLASS_MENUMCONSTANTDECLARATION_ENUMDECLARATION_TYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TFieldDefinition) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TField) arguments.get(2), (TClass) arguments.get(3), (MEnumConstantDeclaration) arguments.get(4),
					(EnumDeclaration) arguments.get(5), (TypeGraph) arguments.get(6), (Match) arguments.get(7),
					(Match) arguments.get(8));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___CHECK_DEC_FWD__MENUMCONSTANTDECLARATION_ENUMDECLARATION:
			return checkDEC_FWD((MEnumConstantDeclaration) arguments.get(0), (EnumDeclaration) arguments.get(1));
		case RulesPackage.ENUM_CONSTANT___CHECK_DEC_BWD__TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD_TCLASS_TYPEGRAPH:
			return checkDEC_BWD((TFieldDefinition) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TField) arguments.get(2), (TClass) arguments.get(3), (TypeGraph) arguments.get(4));
		case RulesPackage.ENUM_CONSTANT___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.ENUM_CONSTANT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TCLASS_ENUMDECLARATION_TYPEGRAPH_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TClass) arguments.get(1),
					(EnumDeclaration) arguments.get(2), (TypeGraph) arguments.get(3),
					(TypeToTAbstractType) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
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
		EObject _localVariable_0 = isApplicableMatch.getObject("tEnum");
		EObject _localVariable_1 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_2 = isApplicableMatch.getObject("mEnum");
		EObject _localVariable_3 = isApplicableMatch.getObject("model");
		EObject _localVariable_4 = isApplicableMatch.getObject("mEnumToTEnum");
		EObject tmpTEnum = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMEnum = _localVariable_2;
		EObject tmpModel = _localVariable_3;
		EObject tmpMEnumToTEnum = _localVariable_4;
		if (tmpTEnum instanceof TClass) {
			TClass tEnum = (TClass) tmpTEnum;
			if (tmpMDefinition instanceof MEnumConstantDeclaration) {
				MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
				if (tmpMEnum instanceof EnumDeclaration) {
					EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
					if (tmpModel instanceof TypeGraph) {
						TypeGraph model = (TypeGraph) tmpModel;
						if (tmpMEnumToTEnum instanceof TypeToTAbstractType) {
							TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) tmpMEnumToTEnum;
							return new Object[] { tEnum, mDefinition, mEnum, model, mEnumToTEnum, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_blackBBBBBFBB(TClass tEnum,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, TypeGraph model,
			TypeToTAbstractType mEnumToTEnum, EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tEnum, mDefinition, mEnum, model, mEnumToTEnum, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnumConstant_1_1_performtransformation_binding = pattern_EnumConstant_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_EnumConstant_1_1_performtransformation_binding != null) {
			TClass tEnum = (TClass) result_pattern_EnumConstant_1_1_performtransformation_binding[0];
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result_pattern_EnumConstant_1_1_performtransformation_binding[1];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_1_1_performtransformation_binding[2];
			TypeGraph model = (TypeGraph) result_pattern_EnumConstant_1_1_performtransformation_binding[3];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result_pattern_EnumConstant_1_1_performtransformation_binding[4];

			Object[] result_pattern_EnumConstant_1_1_performtransformation_black = pattern_EnumConstant_1_1_performtransformation_blackBBBBBFBB(
					tEnum, mDefinition, mEnum, model, mEnumToTEnum, _this, isApplicableMatch);
			if (result_pattern_EnumConstant_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumConstant_1_1_performtransformation_black[5];

				return new Object[] { tEnum, mDefinition, mEnum, model, mEnumToTEnum, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_greenFFFFBFBBB(TClass tEnum,
			MEnumConstantDeclaration mDefinition, TypeGraph model, CSP csp) {
		TFieldDefinition tDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		TField tName = BasicFactory.eINSTANCE.createTField();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		Object _localVariable_0 = csp.getValue("tName", "tName");
		tEnum.getDefines().add(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		tSignature.setType(tEnum);
		tDefinition.setSignature(tSignature);
		tEnum.getSignature().add(tSignature);
		model.getFields().add(tName);
		tSignature.setField(tName);
		mDefinitionToTMember.setSource(mDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		String tName_tName_prime = (String) _localVariable_0;
		tName.setTName(tName_tName_prime);
		return new Object[] { tDefinition, mBodyToTAnnotation, tSignature, tName, tEnum, mDefinitionToTMember,
				mDefinition, model, csp };
	}

	public static final Object[] pattern_EnumConstant_1_2_collecttranslatedelements_blackBBBBBB(
			TFieldDefinition tDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation, TFieldSignature tSignature,
			TField tName, MDefinitionToTMember mDefinitionToTMember, MEnumConstantDeclaration mDefinition) {
		return new Object[] { tDefinition, mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition };
	}

	public static final Object[] pattern_EnumConstant_1_2_collecttranslatedelements_greenFBBBBBB(
			TFieldDefinition tDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation, TFieldSignature tSignature,
			TField tName, MDefinitionToTMember mDefinitionToTMember, MEnumConstantDeclaration mDefinition) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tDefinition);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedElements().add(tName);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getTranslatedElements().add(mDefinition);
		return new Object[] { ruleresult, tDefinition, mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember,
				mDefinition };
	}

	public static final Object[] pattern_EnumConstant_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tDefinition, EObject mBodyToTAnnotation, EObject tSignature,
			EObject tName, EObject tEnum, EObject mDefinitionToTMember, EObject mDefinition, EObject mEnum,
			EObject model, EObject mEnumToTEnum) {
		if (!tDefinition.equals(tSignature)) {
			if (!tDefinition.equals(tName)) {
				if (!tDefinition.equals(tEnum)) {
					if (!mBodyToTAnnotation.equals(tDefinition)) {
						if (!mBodyToTAnnotation.equals(tSignature)) {
							if (!mBodyToTAnnotation.equals(tName)) {
								if (!mBodyToTAnnotation.equals(tEnum)) {
									if (!mBodyToTAnnotation.equals(mDefinitionToTMember)) {
										if (!mBodyToTAnnotation.equals(mDefinition)) {
											if (!mBodyToTAnnotation.equals(mEnum)) {
												if (!mBodyToTAnnotation.equals(model)) {
													if (!mBodyToTAnnotation.equals(mEnumToTEnum)) {
														if (!tName.equals(tSignature)) {
															if (!tEnum.equals(tSignature)) {
																if (!tEnum.equals(tName)) {
																	if (!mDefinitionToTMember.equals(tDefinition)) {
																		if (!mDefinitionToTMember.equals(tSignature)) {
																			if (!mDefinitionToTMember.equals(tName)) {
																				if (!mDefinitionToTMember
																						.equals(tEnum)) {
																					if (!mDefinitionToTMember
																							.equals(mEnum)) {
																						if (!mDefinitionToTMember
																								.equals(model)) {
																							if (!mDefinitionToTMember
																									.equals(mEnumToTEnum)) {
																								if (!mDefinition.equals(
																										tDefinition)) {
																									if (!mDefinition
																											.equals(tSignature)) {
																										if (!mDefinition
																												.equals(tName)) {
																											if (!mDefinition
																													.equals(tEnum)) {
																												if (!mDefinition
																														.equals(mDefinitionToTMember)) {
																													if (!mDefinition
																															.equals(mEnum)) {
																														if (!mDefinition
																																.equals(model)) {
																															if (!mDefinition
																																	.equals(mEnumToTEnum)) {
																																if (!mEnum
																																		.equals(tDefinition)) {
																																	if (!mEnum
																																			.equals(tSignature)) {
																																		if (!mEnum
																																				.equals(tName)) {
																																			if (!mEnum
																																					.equals(tEnum)) {
																																				if (!mEnum
																																						.equals(model)) {
																																					if (!mEnum
																																							.equals(mEnumToTEnum)) {
																																						if (!model
																																								.equals(tDefinition)) {
																																							if (!model
																																									.equals(tSignature)) {
																																								if (!model
																																										.equals(tName)) {
																																									if (!model
																																											.equals(tEnum)) {
																																										if (!mEnumToTEnum
																																												.equals(tDefinition)) {
																																											if (!mEnumToTEnum
																																													.equals(tSignature)) {
																																												if (!mEnumToTEnum
																																														.equals(tName)) {
																																													if (!mEnumToTEnum
																																															.equals(tEnum)) {
																																														if (!mEnumToTEnum
																																																.equals(model)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	tDefinition,
																																																	mBodyToTAnnotation,
																																																	tSignature,
																																																	tName,
																																																	tEnum,
																																																	mDefinitionToTMember,
																																																	mDefinition,
																																																	mEnum,
																																																	model,
																																																	mEnumToTEnum };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject tDefinition, EObject mBodyToTAnnotation, EObject tSignature,
			EObject tName, EObject tEnum, EObject mDefinitionToTMember, EObject mDefinition, EObject mEnum,
			EObject model) {
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumConstant";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String tSignature__tEnum____type_name_prime = "type";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String tEnum__tSignature____signature_name_prime = "signature";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		ruleresult.getCreatedEdges().add(tSignature__tEnum____type);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tSignature__tDefinition____definitions);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mEnum__mDefinition____enumConstants);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		ruleresult.getCreatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		ruleresult.getCreatedEdges().add(tName__model____model);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tEnum__tSignature____signature);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		ruleresult.getCreatedEdges().add(tDefinition__tEnum____definedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		return new Object[] { ruleresult, tDefinition, mBodyToTAnnotation, tSignature, tName, tEnum,
				mDefinitionToTMember, mDefinition, mEnum, model, mBodyToTAnnotation__tDefinition____target,
				tSignature__tEnum____type, tDefinition__tSignature____signature, tSignature__tDefinition____definitions,
				mDefinitionToTMember__mDefinition____source, mBodyToTAnnotation__mDefinition____source,
				mEnum__mDefinition____enumConstants, model__tName____fields, tName__model____model,
				mDefinitionToTMember__tDefinition____target, tEnum__tSignature____signature, tSignature__tName____field,
				tName__tSignature____signatures, tEnum__tDefinition____defines, tDefinition__tEnum____definedBy };
	}

	public static final void pattern_EnumConstant_1_5_registerobjects_expressionBBBBBBBBBBBB(EnumConstant _this,
			PerformRuleResult ruleresult, EObject tDefinition, EObject mBodyToTAnnotation, EObject tSignature,
			EObject tName, EObject tEnum, EObject mDefinitionToTMember, EObject mDefinition, EObject mEnum,
			EObject model, EObject mEnumToTEnum) {
		_this.registerObjects_FWD(ruleresult, tDefinition, mBodyToTAnnotation, tSignature, tName, tEnum,
				mDefinitionToTMember, mDefinition, mEnum, model, mEnumToTEnum);

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

	public static final Iterable<Object[]> pattern_EnumConstant_2_2_corematch_blackFBBFB(
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mEnum, TypeToTAbstractType.class, "source")) {
			TAbstractType tmpTEnum = mEnumToTEnum.getTarget();
			if (tmpTEnum instanceof TClass) {
				TClass tEnum = (TClass) tmpTEnum;
				_result.add(new Object[] { tEnum, mDefinition, mEnum, mEnumToTEnum, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_2_3_findcontext_blackBBBFB(TClass tEnum,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mEnum.getEnumConstants().contains(mDefinition)) {
			if (mEnum.equals(mEnumToTEnum.getSource())) {
				if (tEnum.equals(mEnumToTEnum.getTarget())) {
					TypeGraph model = tEnum.getModel();
					if (model != null) {
						_result.add(new Object[] { tEnum, mDefinition, mEnum, model, mEnumToTEnum });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumConstant_2_3_findcontext_greenBBBBBFFFFFF(TClass tEnum,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, TypeGraph model,
			TypeToTAbstractType mEnumToTEnum) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__mEnum____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__tEnum____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String tEnum__model____model_name_prime = "model";
		String model__tEnum____allTypes_name_prime = "allTypes";
		String mEnumToTEnum__mEnum____source_name_prime = "source";
		String mEnumToTEnum__tEnum____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tEnum);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mEnum);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mEnum__mDefinition____enumConstants);
		tEnum__model____model.setSrc(tEnum);
		tEnum__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tEnum__model____model);
		model__tEnum____allTypes.setSrc(model);
		model__tEnum____allTypes.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(model__tEnum____allTypes);
		mEnumToTEnum__mEnum____source.setSrc(mEnumToTEnum);
		mEnumToTEnum__mEnum____source.setTrg(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__mEnum____source);
		mEnumToTEnum__tEnum____target.setSrc(mEnumToTEnum);
		mEnumToTEnum__tEnum____target.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__tEnum____target);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		tEnum__model____model.setName(tEnum__model____model_name_prime);
		model__tEnum____allTypes.setName(model__tEnum____allTypes_name_prime);
		mEnumToTEnum__mEnum____source.setName(mEnumToTEnum__mEnum____source_name_prime);
		mEnumToTEnum__tEnum____target.setName(mEnumToTEnum__tEnum____target_name_prime);
		return new Object[] { tEnum, mDefinition, mEnum, model, mEnumToTEnum, isApplicableMatch,
				mEnum__mDefinition____enumConstants, tEnum__model____model, model__tEnum____allTypes,
				mEnumToTEnum__mEnum____source, mEnumToTEnum__tEnum____target };
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_bindingFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TClass tEnum, MEnumConstantDeclaration mDefinition,
			EnumDeclaration mEnum, TypeGraph model, TypeToTAbstractType mEnumToTEnum) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tEnum, mDefinition, mEnum, model,
				mEnumToTEnum);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tEnum, mDefinition, mEnum, model, mEnumToTEnum };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TClass tEnum, MEnumConstantDeclaration mDefinition,
			EnumDeclaration mEnum, TypeGraph model, TypeToTAbstractType mEnumToTEnum) {
		Object[] result_pattern_EnumConstant_2_4_solveCSP_binding = pattern_EnumConstant_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tEnum, mDefinition, mEnum, model, mEnumToTEnum);
		if (result_pattern_EnumConstant_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_2_4_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_2_4_solveCSP_black = pattern_EnumConstant_2_4_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tEnum, mDefinition, mEnum, model, mEnumToTEnum };
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
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum, TypeGraph model) {
		return new Object[] { _this, match, tDefinition, tSignature, tName, tEnum, model };
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_bindingFBBBBBBB(EnumConstant _this, Match match,
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum, TypeGraph model) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tDefinition, tSignature, tName, tEnum, model);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tDefinition, tSignature, tName, tEnum, model };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			Match match, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum,
			TypeGraph model) {
		Object[] result_pattern_EnumConstant_10_2_SolveCSP_binding = pattern_EnumConstant_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, tDefinition, tSignature, tName, tEnum, model);
		if (result_pattern_EnumConstant_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_10_2_SolveCSP_binding[0];

			Object[] result_pattern_EnumConstant_10_2_SolveCSP_black = pattern_EnumConstant_10_2_SolveCSP_blackB(csp);
			if (result_pattern_EnumConstant_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tDefinition, tSignature, tName, tEnum, model };
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
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum, TypeGraph model) {
		return new Object[] { match, tDefinition, tSignature, tName, tEnum, model };
	}

	public static final Object[] pattern_EnumConstant_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(
			Match match, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum,
			TypeGraph model) {
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tDefinition);
		match.getToBeTranslatedNodes().add(tSignature);
		match.getToBeTranslatedNodes().add(tName);
		String tSignature__tEnum____type_name_prime = "type";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String tEnum__tSignature____signature_name_prime = "signature";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		match.getToBeTranslatedEdges().add(tSignature__tEnum____type);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tSignature__tDefinition____definitions);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		match.getToBeTranslatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		match.getToBeTranslatedEdges().add(tName__model____model);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tEnum__tSignature____signature);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		match.getToBeTranslatedEdges().add(tDefinition__tEnum____definedBy);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		return new Object[] { match, tDefinition, tSignature, tName, tEnum, model, tSignature__tEnum____type,
				tDefinition__tSignature____signature, tSignature__tDefinition____definitions, model__tName____fields,
				tName__model____model, tEnum__tSignature____signature, tSignature__tName____field,
				tName__tSignature____signatures, tEnum__tDefinition____defines, tDefinition__tEnum____definedBy };
	}

	public static final Object[] pattern_EnumConstant_10_5_collectcontextelements_blackBBBBBB(Match match,
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum, TypeGraph model) {
		return new Object[] { match, tDefinition, tSignature, tName, tEnum, model };
	}

	public static final Object[] pattern_EnumConstant_10_5_collectcontextelements_greenBBBFF(Match match, TClass tEnum,
			TypeGraph model) {
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tEnum);
		match.getContextNodes().add(model);
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
		return new Object[] { match, tEnum, model, tEnum__model____model, model__tEnum____allTypes };
	}

	public static final void pattern_EnumConstant_10_6_registerobjectstomatch_expressionBBBBBBB(EnumConstant _this,
			Match match, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum,
			TypeGraph model) {
		_this.registerObjectsToMatch_BWD(match, tDefinition, tSignature, tName, tEnum, model);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tName");
		EObject _localVariable_3 = isApplicableMatch.getObject("tEnum");
		EObject _localVariable_4 = isApplicableMatch.getObject("mEnum");
		EObject _localVariable_5 = isApplicableMatch.getObject("model");
		EObject _localVariable_6 = isApplicableMatch.getObject("mEnumToTEnum");
		EObject tmpTDefinition = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpTEnum = _localVariable_3;
		EObject tmpMEnum = _localVariable_4;
		EObject tmpModel = _localVariable_5;
		EObject tmpMEnumToTEnum = _localVariable_6;
		if (tmpTDefinition instanceof TFieldDefinition) {
			TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tmpTName instanceof TField) {
					TField tName = (TField) tmpTName;
					if (tmpTEnum instanceof TClass) {
						TClass tEnum = (TClass) tmpTEnum;
						if (tmpMEnum instanceof EnumDeclaration) {
							EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
							if (tmpModel instanceof TypeGraph) {
								TypeGraph model = (TypeGraph) tmpModel;
								if (tmpMEnumToTEnum instanceof TypeToTAbstractType) {
									TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) tmpMEnumToTEnum;
									return new Object[] { tDefinition, tSignature, tName, tEnum, mEnum, model,
											mEnumToTEnum, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_11_1_performtransformation_blackBBBBBBBFBB(
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum, EnumDeclaration mEnum,
			TypeGraph model, TypeToTAbstractType mEnumToTEnum, EnumConstant _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tDefinition, tSignature, tName, tEnum, mEnum, model, mEnumToTEnum, csp, _this,
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
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_EnumConstant_11_1_performtransformation_binding[0];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_EnumConstant_11_1_performtransformation_binding[1];
			TField tName = (TField) result_pattern_EnumConstant_11_1_performtransformation_binding[2];
			TClass tEnum = (TClass) result_pattern_EnumConstant_11_1_performtransformation_binding[3];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_11_1_performtransformation_binding[4];
			TypeGraph model = (TypeGraph) result_pattern_EnumConstant_11_1_performtransformation_binding[5];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result_pattern_EnumConstant_11_1_performtransformation_binding[6];

			Object[] result_pattern_EnumConstant_11_1_performtransformation_black = pattern_EnumConstant_11_1_performtransformation_blackBBBBBBBFBB(
					tDefinition, tSignature, tName, tEnum, mEnum, model, mEnumToTEnum, _this, isApplicableMatch);
			if (result_pattern_EnumConstant_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumConstant_11_1_performtransformation_black[7];

				return new Object[] { tDefinition, tSignature, tName, tEnum, mEnum, model, mEnumToTEnum, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_11_1_performtransformation_greenBFFFBB(
			TFieldDefinition tDefinition, EnumDeclaration mEnum, CSP csp) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MEnumConstantDeclaration mDefinition = ModiscoFactory.eINSTANCE.createMEnumConstantDeclaration();
		Object _localVariable_0 = csp.getValue("mDefinition", "name");
		mBodyToTAnnotation.setTarget(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mEnum.getEnumConstants().add(mDefinition);
		String mDefinition_name_prime = (String) _localVariable_0;
		mDefinition.setName(mDefinition_name_prime);
		return new Object[] { tDefinition, mBodyToTAnnotation, mDefinitionToTMember, mDefinition, mEnum, csp };
	}

	public static final Object[] pattern_EnumConstant_11_2_collecttranslatedelements_blackBBBBBB(
			TFieldDefinition tDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation, TFieldSignature tSignature,
			TField tName, MDefinitionToTMember mDefinitionToTMember, MEnumConstantDeclaration mDefinition) {
		return new Object[] { tDefinition, mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition };
	}

	public static final Object[] pattern_EnumConstant_11_2_collecttranslatedelements_greenFBBBBBB(
			TFieldDefinition tDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation, TFieldSignature tSignature,
			TField tName, MDefinitionToTMember mDefinitionToTMember, MEnumConstantDeclaration mDefinition) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tDefinition);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getTranslatedElements().add(tName);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedElements().add(mDefinition);
		return new Object[] { ruleresult, tDefinition, mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember,
				mDefinition };
	}

	public static final Object[] pattern_EnumConstant_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tDefinition, EObject mBodyToTAnnotation, EObject tSignature,
			EObject tName, EObject tEnum, EObject mDefinitionToTMember, EObject mDefinition, EObject mEnum,
			EObject model, EObject mEnumToTEnum) {
		if (!tDefinition.equals(tSignature)) {
			if (!tDefinition.equals(tName)) {
				if (!tDefinition.equals(tEnum)) {
					if (!mBodyToTAnnotation.equals(tDefinition)) {
						if (!mBodyToTAnnotation.equals(tSignature)) {
							if (!mBodyToTAnnotation.equals(tName)) {
								if (!mBodyToTAnnotation.equals(tEnum)) {
									if (!mBodyToTAnnotation.equals(mDefinitionToTMember)) {
										if (!mBodyToTAnnotation.equals(mDefinition)) {
											if (!mBodyToTAnnotation.equals(mEnum)) {
												if (!mBodyToTAnnotation.equals(model)) {
													if (!mBodyToTAnnotation.equals(mEnumToTEnum)) {
														if (!tName.equals(tSignature)) {
															if (!tEnum.equals(tSignature)) {
																if (!tEnum.equals(tName)) {
																	if (!mDefinitionToTMember.equals(tDefinition)) {
																		if (!mDefinitionToTMember.equals(tSignature)) {
																			if (!mDefinitionToTMember.equals(tName)) {
																				if (!mDefinitionToTMember
																						.equals(tEnum)) {
																					if (!mDefinitionToTMember
																							.equals(mEnum)) {
																						if (!mDefinitionToTMember
																								.equals(model)) {
																							if (!mDefinitionToTMember
																									.equals(mEnumToTEnum)) {
																								if (!mDefinition.equals(
																										tDefinition)) {
																									if (!mDefinition
																											.equals(tSignature)) {
																										if (!mDefinition
																												.equals(tName)) {
																											if (!mDefinition
																													.equals(tEnum)) {
																												if (!mDefinition
																														.equals(mDefinitionToTMember)) {
																													if (!mDefinition
																															.equals(mEnum)) {
																														if (!mDefinition
																																.equals(model)) {
																															if (!mDefinition
																																	.equals(mEnumToTEnum)) {
																																if (!mEnum
																																		.equals(tDefinition)) {
																																	if (!mEnum
																																			.equals(tSignature)) {
																																		if (!mEnum
																																				.equals(tName)) {
																																			if (!mEnum
																																					.equals(tEnum)) {
																																				if (!mEnum
																																						.equals(model)) {
																																					if (!mEnum
																																							.equals(mEnumToTEnum)) {
																																						if (!model
																																								.equals(tDefinition)) {
																																							if (!model
																																									.equals(tSignature)) {
																																								if (!model
																																										.equals(tName)) {
																																									if (!model
																																											.equals(tEnum)) {
																																										if (!mEnumToTEnum
																																												.equals(tDefinition)) {
																																											if (!mEnumToTEnum
																																													.equals(tSignature)) {
																																												if (!mEnumToTEnum
																																														.equals(tName)) {
																																													if (!mEnumToTEnum
																																															.equals(tEnum)) {
																																														if (!mEnumToTEnum
																																																.equals(model)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	tDefinition,
																																																	mBodyToTAnnotation,
																																																	tSignature,
																																																	tName,
																																																	tEnum,
																																																	mDefinitionToTMember,
																																																	mDefinition,
																																																	mEnum,
																																																	model,
																																																	mEnumToTEnum };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject tDefinition, EObject mBodyToTAnnotation, EObject tSignature,
			EObject tName, EObject tEnum, EObject mDefinitionToTMember, EObject mDefinition, EObject mEnum,
			EObject model) {
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumConstant";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String tSignature__tEnum____type_name_prime = "type";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String tEnum__tSignature____signature_name_prime = "signature";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		ruleresult.getTranslatedEdges().add(tSignature__tEnum____type);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tSignature__tDefinition____definitions);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mEnum__mDefinition____enumConstants);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		ruleresult.getTranslatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		ruleresult.getTranslatedEdges().add(tName__model____model);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tEnum__tSignature____signature);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		ruleresult.getTranslatedEdges().add(tDefinition__tEnum____definedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		return new Object[] { ruleresult, tDefinition, mBodyToTAnnotation, tSignature, tName, tEnum,
				mDefinitionToTMember, mDefinition, mEnum, model, mBodyToTAnnotation__tDefinition____target,
				tSignature__tEnum____type, tDefinition__tSignature____signature, tSignature__tDefinition____definitions,
				mDefinitionToTMember__mDefinition____source, mBodyToTAnnotation__mDefinition____source,
				mEnum__mDefinition____enumConstants, model__tName____fields, tName__model____model,
				mDefinitionToTMember__tDefinition____target, tEnum__tSignature____signature, tSignature__tName____field,
				tName__tSignature____signatures, tEnum__tDefinition____defines, tDefinition__tEnum____definedBy };
	}

	public static final void pattern_EnumConstant_11_5_registerobjects_expressionBBBBBBBBBBBB(EnumConstant _this,
			PerformRuleResult ruleresult, EObject tDefinition, EObject mBodyToTAnnotation, EObject tSignature,
			EObject tName, EObject tEnum, EObject mDefinitionToTMember, EObject mDefinition, EObject mEnum,
			EObject model, EObject mEnumToTEnum) {
		_this.registerObjects_BWD(ruleresult, tDefinition, mBodyToTAnnotation, tSignature, tName, tEnum,
				mDefinitionToTMember, mDefinition, mEnum, model, mEnumToTEnum);

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
		EObject _localVariable_0 = match.getObject("tDefinition");
		EObject _localVariable_1 = match.getObject("tSignature");
		EObject _localVariable_2 = match.getObject("tName");
		EObject _localVariable_3 = match.getObject("tEnum");
		EObject _localVariable_4 = match.getObject("model");
		EObject tmpTDefinition = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpTEnum = _localVariable_3;
		EObject tmpModel = _localVariable_4;
		if (tmpTDefinition instanceof TFieldDefinition) {
			TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tmpTName instanceof TField) {
					TField tName = (TField) tmpTName;
					if (tmpTEnum instanceof TClass) {
						TClass tEnum = (TClass) tmpTEnum;
						if (tmpModel instanceof TypeGraph) {
							TypeGraph model = (TypeGraph) tmpModel;
							return new Object[] { tDefinition, tSignature, tName, tEnum, model, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_12_2_corematch_blackBBBBFBFB(
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum, TypeGraph model,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tEnum, TypeToTAbstractType.class, "target")) {
			Type tmpMEnum = mEnumToTEnum.getSource();
			if (tmpMEnum instanceof EnumDeclaration) {
				EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
				_result.add(new Object[] { tDefinition, tSignature, tName, tEnum, mEnum, model, mEnumToTEnum, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_12_3_findcontext_blackBBBBBBB(
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum, EnumDeclaration mEnum,
			TypeGraph model, TypeToTAbstractType mEnumToTEnum) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tEnum.equals(tSignature.getType())) {
			if (tSignature.equals(tDefinition.getSignature())) {
				if (model.getFields().contains(tName)) {
					if (model.equals(tEnum.getModel())) {
						if (mEnum.equals(mEnumToTEnum.getSource())) {
							if (tEnum.equals(mEnumToTEnum.getTarget())) {
								if (tEnum.getSignature().contains(tSignature)) {
									if (tName.equals(tSignature.getField())) {
										if (tEnum.getDefines().contains(tDefinition)) {
											_result.add(new Object[] { tDefinition, tSignature, tName, tEnum, mEnum,
													model, mEnumToTEnum });
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

	public static final Object[] pattern_EnumConstant_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFF(
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum, EnumDeclaration mEnum,
			TypeGraph model, TypeToTAbstractType mEnumToTEnum) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__mEnum____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__tEnum____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tSignature__tEnum____type_name_prime = "type";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String tEnum__model____model_name_prime = "model";
		String model__tEnum____allTypes_name_prime = "allTypes";
		String mEnumToTEnum__mEnum____source_name_prime = "source";
		String mEnumToTEnum__tEnum____target_name_prime = "target";
		String tEnum__tSignature____signature_name_prime = "signature";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnum);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(tSignature__tEnum____type);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tName__model____model);
		tEnum__model____model.setSrc(tEnum);
		tEnum__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tEnum__model____model);
		model__tEnum____allTypes.setSrc(model);
		model__tEnum____allTypes.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(model__tEnum____allTypes);
		mEnumToTEnum__mEnum____source.setSrc(mEnumToTEnum);
		mEnumToTEnum__mEnum____source.setTrg(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__mEnum____source);
		mEnumToTEnum__tEnum____target.setSrc(mEnumToTEnum);
		mEnumToTEnum__tEnum____target.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__tEnum____target);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tEnum__tSignature____signature);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(tDefinition__tEnum____definedBy);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		tEnum__model____model.setName(tEnum__model____model_name_prime);
		model__tEnum____allTypes.setName(model__tEnum____allTypes_name_prime);
		mEnumToTEnum__mEnum____source.setName(mEnumToTEnum__mEnum____source_name_prime);
		mEnumToTEnum__tEnum____target.setName(mEnumToTEnum__tEnum____target_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		return new Object[] { tDefinition, tSignature, tName, tEnum, mEnum, model, mEnumToTEnum, isApplicableMatch,
				tSignature__tEnum____type, tDefinition__tSignature____signature, tSignature__tDefinition____definitions,
				model__tName____fields, tName__model____model, tEnum__model____model, model__tEnum____allTypes,
				mEnumToTEnum__mEnum____source, mEnumToTEnum__tEnum____target, tEnum__tSignature____signature,
				tSignature__tName____field, tName__tSignature____signatures, tEnum__tDefinition____defines,
				tDefinition__tEnum____definedBy };
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_bindingFBBBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName,
			TClass tEnum, EnumDeclaration mEnum, TypeGraph model, TypeToTAbstractType mEnumToTEnum) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tDefinition, tSignature, tName, tEnum,
				mEnum, model, mEnumToTEnum);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tDefinition, tSignature, tName, tEnum, mEnum, model,
					mEnumToTEnum };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName,
			TClass tEnum, EnumDeclaration mEnum, TypeGraph model, TypeToTAbstractType mEnumToTEnum) {
		Object[] result_pattern_EnumConstant_12_4_solveCSP_binding = pattern_EnumConstant_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tDefinition, tSignature, tName, tEnum, mEnum, model, mEnumToTEnum);
		if (result_pattern_EnumConstant_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_12_4_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_12_4_solveCSP_black = pattern_EnumConstant_12_4_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tDefinition, tSignature, tName, tEnum, mEnum,
						model, mEnumToTEnum };
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

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_0B(
			TFieldDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_190579 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_190579 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_1BB(
			TFieldDefinition tDefinition, TFieldSignature tSignature) {
		TSignature __DEC_tDefinition_definitions_17185 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_17185 != null) {
			if (!tSignature.equals(__DEC_tDefinition_definitions_17185)) {
				return new Object[] { tDefinition, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_2BB(
			TFieldSignature tSignature, TField tName) {
		TField __DEC_tSignature_signatures_615180 = tSignature.getField();
		if (__DEC_tSignature_signatures_615180 != null) {
			if (!tName.equals(__DEC_tSignature_signatures_615180)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_3BB(TField tName,
			TypeGraph model) {
		TypeGraph __DEC_tName_model_106001 = tName.getModel();
		if (__DEC_tName_model_106001 != null) {
			if (!model.equals(__DEC_tName_model_106001)) {
				return new Object[] { tName, model };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTSignature = _edge_type.getSrc();
		if (tmpTSignature instanceof TFieldSignature) {
			TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
			EObject tmpTEnum = _edge_type.getTrg();
			if (tmpTEnum instanceof TClass) {
				TClass tEnum = (TClass) tmpTEnum;
				if (tEnum.equals(tSignature.getType())) {
					if (tEnum.getSignature().contains(tSignature)) {
						TField tName = tSignature.getField();
						if (tName != null) {
							TypeGraph model = tEnum.getModel();
							if (model != null) {
								if (model.getFields().contains(tName)) {
									if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_2BB(tSignature,
											tName) == null) {
										if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_3BB(tName,
												model) == null) {
											for (TMember tmpTDefinition : tSignature.getDefinitions()) {
												if (tmpTDefinition instanceof TFieldDefinition) {
													TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
													if (tEnum.getDefines().contains(tDefinition)) {
														if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_0B(
																tDefinition) == null) {
															if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_1BB(
																	tDefinition, tSignature) == null) {
																_result.add(new Object[] { tDefinition, tSignature,
																		tName, tEnum, model, _edge_type });
															}
														}
													}
												}
											}
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
			EnumConstant _this, Match match, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName,
			TClass tEnum, TypeGraph model) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tDefinition, tSignature, tName, tEnum, model);
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
		MSignature __DEC_mDefinition_mDefinitions_226967 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_226967 != null) {
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
		EObject _localVariable_0 = targetMatch.getObject("tDefinition");
		EObject _localVariable_1 = targetMatch.getObject("tSignature");
		EObject _localVariable_2 = targetMatch.getObject("tName");
		EObject _localVariable_3 = targetMatch.getObject("tEnum");
		EObject _localVariable_4 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_5 = sourceMatch.getObject("mEnum");
		EObject _localVariable_6 = targetMatch.getObject("model");
		EObject tmpTDefinition = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpTEnum = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpMEnum = _localVariable_5;
		EObject tmpModel = _localVariable_6;
		if (tmpTDefinition instanceof TFieldDefinition) {
			TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tmpTName instanceof TField) {
					TField tName = (TField) tmpTName;
					if (tmpTEnum instanceof TClass) {
						TClass tEnum = (TClass) tmpTEnum;
						if (tmpMDefinition instanceof MEnumConstantDeclaration) {
							MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
							if (tmpMEnum instanceof EnumDeclaration) {
								EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
								if (tmpModel instanceof TypeGraph) {
									TypeGraph model = (TypeGraph) tmpModel;
									return new Object[] { tDefinition, tSignature, tName, tEnum, mDefinition, mEnum,
											model, targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, TypeGraph model, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tDefinition, tSignature, tName, tEnum, mDefinition, mEnum, model, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding = pattern_EnumConstant_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding != null) {
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[0];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[1];
			TField tName = (TField) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[2];
			TClass tEnum = (TClass) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[3];
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[4];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[5];
			TypeGraph model = (TypeGraph) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_EnumConstant_24_2_matchsrctrgcontext_black = pattern_EnumConstant_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					tDefinition, tSignature, tName, tEnum, mDefinition, mEnum, model, sourceMatch, targetMatch);
			if (result_pattern_EnumConstant_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tDefinition, tSignature, tName, tEnum, mDefinition, mEnum, model, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_bindingFBBBBBBBBBB(EnumConstant _this,
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, TypeGraph model, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(tDefinition, tSignature, tName, tEnum, mDefinition, mEnum,
				model, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, tDefinition, tSignature, tName, tEnum, mDefinition, mEnum, model,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(EnumConstant _this,
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, TypeGraph model, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_EnumConstant_24_3_solvecsp_binding = pattern_EnumConstant_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, tDefinition, tSignature, tName, tEnum, mDefinition, mEnum, model, sourceMatch, targetMatch);
		if (result_pattern_EnumConstant_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_24_3_solvecsp_binding[0];

			Object[] result_pattern_EnumConstant_24_3_solvecsp_black = pattern_EnumConstant_24_3_solvecsp_blackB(csp);
			if (result_pattern_EnumConstant_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tDefinition, tSignature, tName, tEnum, mDefinition, mEnum, model,
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

	public static final Iterable<Object[]> pattern_EnumConstant_24_5_matchcorrcontext_blackBBFBB(TClass tEnum,
			EnumDeclaration mEnum, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mEnum, TypeToTAbstractType.class, "source")) {
				if (tEnum.equals(mEnumToTEnum.getTarget())) {
					_result.add(new Object[] { tEnum, mEnum, mEnumToTEnum, sourceMatch, targetMatch });
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

	public static final Object[] pattern_EnumConstant_24_6_createcorrespondence_blackBBBBBBBB(
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, TClass tEnum,
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, TypeGraph model, CCMatch ccMatch) {
		return new Object[] { tDefinition, tSignature, tName, tEnum, mDefinition, mEnum, model, ccMatch };
	}

	public static final Object[] pattern_EnumConstant_24_6_createcorrespondence_greenBFFBB(TFieldDefinition tDefinition,
			MEnumConstantDeclaration mDefinition, CCMatch ccMatch) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		mBodyToTAnnotation.setTarget(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		mDefinitionToTMember.setSource(mDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mDefinitionToTMember);
		return new Object[] { tDefinition, mBodyToTAnnotation, mDefinitionToTMember, mDefinition, ccMatch };
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
		MSignature __DEC_mDefinition_mDefinitions_74862 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_74862 != null) {
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

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_0B(TFieldDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_213292 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_213292 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_1BB(TFieldDefinition tDefinition,
			TFieldSignature tSignature) {
		TSignature __DEC_tDefinition_definitions_896692 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_896692 != null) {
			if (!tSignature.equals(__DEC_tDefinition_definitions_896692)) {
				return new Object[] { tDefinition, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_2BB(TFieldSignature tSignature,
			TField tName) {
		TField __DEC_tSignature_signatures_977833 = tSignature.getField();
		if (__DEC_tSignature_signatures_977833 != null) {
			if (!tName.equals(__DEC_tSignature_signatures_977833)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_3BB(TField tName,
			TypeGraph model) {
		TypeGraph __DEC_tName_model_275640 = tName.getModel();
		if (__DEC_tName_model_275640 != null) {
			if (!model.equals(__DEC_tName_model_275640)) {
				return new Object[] { tName, model };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_blackBBBBB(TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName, TClass tEnum, TypeGraph model) {
		if (tEnum.equals(tSignature.getType())) {
			if (tSignature.equals(tDefinition.getSignature())) {
				if (model.getFields().contains(tName)) {
					if (model.equals(tEnum.getModel())) {
						if (tEnum.getSignature().contains(tSignature)) {
							if (tName.equals(tSignature.getField())) {
								if (tEnum.getDefines().contains(tDefinition)) {
									if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_0B(tDefinition) == null) {
										if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_1BB(tDefinition,
												tSignature) == null) {
											if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_2BB(tSignature,
													tName) == null) {
												if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_3BB(tName,
														model) == null) {
													return new Object[] { tDefinition, tSignature, tName, tEnum,
															model };
												}
											}
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
			ModelgeneratorRuleResult ruleResult, TClass tEnum) {
		if (ruleResult.getTargetObjects().contains(tEnum)) {
			return new Object[] { ruleResult, tEnum };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph model) {
		if (ruleResult.getTargetObjects().contains(model)) {
			return new Object[] { ruleResult, model };
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
									if (pattern_EnumConstant_29_2_isapplicablecore_black_nac_0BB(ruleResult,
											tEnum) == null) {
										if (pattern_EnumConstant_29_2_isapplicablecore_black_nac_3BB(ruleResult,
												mEnum) == null) {
											if (pattern_EnumConstant_29_2_isapplicablecore_black_nac_1BB(ruleResult,
													model) == null) {
												_result.add(new Object[] { mEnumToTEnumList, tEnum, model, mEnumToTEnum,
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
			IsApplicableMatch isApplicableMatch, TClass tEnum, EnumDeclaration mEnum, TypeGraph model,
			TypeToTAbstractType mEnumToTEnum, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tEnum, mEnum, model, mEnumToTEnum,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tEnum, mEnum, model, mEnumToTEnum, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_29_3_solveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TClass tEnum, EnumDeclaration mEnum, TypeGraph model,
			TypeToTAbstractType mEnumToTEnum, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EnumConstant_29_3_solveCSP_binding = pattern_EnumConstant_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tEnum, mEnum, model, mEnumToTEnum, ruleResult);
		if (result_pattern_EnumConstant_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_29_3_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_29_3_solveCSP_black = pattern_EnumConstant_29_3_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tEnum, mEnum, model, mEnumToTEnum, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumConstant_29_4_checkCSP_expressionFBB(EnumConstant _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_29_5_checknacs_blackBBBB(TClass tEnum, EnumDeclaration mEnum,
			TypeGraph model, TypeToTAbstractType mEnumToTEnum) {
		return new Object[] { tEnum, mEnum, model, mEnumToTEnum };
	}

	public static final Object[] pattern_EnumConstant_29_6_perform_blackBBBBB(TClass tEnum, EnumDeclaration mEnum,
			TypeGraph model, TypeToTAbstractType mEnumToTEnum, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tEnum, mEnum, model, mEnumToTEnum, ruleResult };
	}

	public static final Object[] pattern_EnumConstant_29_6_perform_greenFFFFBFFBBBB(TClass tEnum, EnumDeclaration mEnum,
			TypeGraph model, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TFieldDefinition tDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		TField tName = BasicFactory.eINSTANCE.createTField();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MEnumConstantDeclaration mDefinition = ModiscoFactory.eINSTANCE.createMEnumConstantDeclaration();
		Object _localVariable_0 = csp.getValue("tName", "tName");
		Object _localVariable_1 = csp.getValue("mDefinition", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		tEnum.getDefines().add(tDefinition);
		ruleResult.getTargetObjects().add(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		tSignature.setType(tEnum);
		tDefinition.setSignature(tSignature);
		tEnum.getSignature().add(tSignature);
		ruleResult.getTargetObjects().add(tSignature);
		model.getFields().add(tName);
		tSignature.setField(tName);
		ruleResult.getTargetObjects().add(tName);
		mDefinitionToTMember.setTarget(tDefinition);
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		mDefinitionToTMember.setSource(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mEnum.getEnumConstants().add(mDefinition);
		ruleResult.getSourceObjects().add(mDefinition);
		String tName_tName_prime = (String) _localVariable_0;
		String mDefinition_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tName.setTName(tName_tName_prime);
		mDefinition.setName(mDefinition_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tDefinition, mBodyToTAnnotation, tSignature, tName, tEnum, mDefinitionToTMember,
				mDefinition, mEnum, model, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EnumConstant_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnumConstantImpl
