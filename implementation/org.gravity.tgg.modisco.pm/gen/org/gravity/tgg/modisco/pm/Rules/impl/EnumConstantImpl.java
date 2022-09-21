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
	public boolean isAppropriate_FWD(Match match, EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {

		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_0_1_initialbindings_blackBBBB(this, match, mEnum,
				mDefinition);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mEnum] = " + mEnum + ", " + "[mDefinition] = " + mDefinition + ".");
		}

		Object[] result2_bindingAndBlack = EnumConstantImpl.pattern_EnumConstant_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, mEnum, mDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mEnum] = " + mEnum + ", " + "[mDefinition] = " + mDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (EnumConstantImpl.pattern_EnumConstant_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = EnumConstantImpl
					.pattern_EnumConstant_0_4_collectelementstobetranslated_blackBBB(match, mEnum, mDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mEnum] = " + mEnum + ", " + "[mDefinition] = " + mDefinition + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_0_4_collectelementstobetranslated_greenBBBF(match, mEnum,
					mDefinition);
			//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result4_green[3];

			Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_0_5_collectcontextelements_blackBBB(match,
					mEnum, mDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mEnum] = " + mEnum + ", " + "[mDefinition] = " + mDefinition + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_0_5_collectcontextelements_greenBB(match, mEnum);

			// 
			EnumConstantImpl.pattern_EnumConstant_0_6_registerobjectstomatch_expressionBBBB(this, match, mEnum,
					mDefinition);
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
		TypeGraph model = (TypeGraph) result1_bindingAndBlack[0];
		EnumDeclaration mEnum = (EnumDeclaration) result1_bindingAndBlack[1];
		TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result1_bindingAndBlack[2];
		TClass tEnum = (TClass) result1_bindingAndBlack[3];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = EnumConstantImpl.pattern_EnumConstant_1_1_performtransformation_greenFBFFFBBFB(model,
				tEnum, mDefinition, csp);
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[0];
		TFieldSignature tSignature = (TFieldSignature) result1_green[2];
		TField tName = (TField) result1_green[3];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[4];
		TFieldDefinition tDefinition = (TFieldDefinition) result1_green[7];

		Object[] result2_black = EnumConstantImpl.pattern_EnumConstant_1_2_collecttranslatedelements_blackBBBBBB(
				mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition, tDefinition);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[tDefinition] = " + tDefinition + ".");
		}
		Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_1_2_collecttranslatedelements_greenFBBBBBB(
				mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition, tDefinition);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumConstantImpl.pattern_EnumConstant_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum, mEnumToTEnum,
				tEnum, mDefinition, tDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[model] = " + model + ", "
					+ "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[mEnum] = " + mEnum + ", " + "[mEnumToTEnum] = " + mEnumToTEnum
					+ ", " + "[tEnum] = " + tEnum + ", " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = "
					+ tDefinition + ".");
		}
		EnumConstantImpl.pattern_EnumConstant_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult,
				mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum, tEnum, mDefinition,
				tDefinition);
		//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[24];

		// 
		// 
		EnumConstantImpl.pattern_EnumConstant_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum, mEnumToTEnum, tEnum,
				mDefinition, tDefinition);
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
		EnumDeclaration mEnum = (EnumDeclaration) result2_binding[0];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result2_binding[1];
		for (Object[] result2_black : EnumConstantImpl.pattern_EnumConstant_2_2_corematch_blackBFFBB(mEnum, mDefinition,
				match)) {
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result2_black[1];
			TClass tEnum = (TClass) result2_black[2];
			// ForEach 
			for (Object[] result3_black : EnumConstantImpl.pattern_EnumConstant_2_3_findcontext_blackFBBBB(mEnum,
					mEnumToTEnum, tEnum, mDefinition)) {
				TypeGraph model = (TypeGraph) result3_black[0];
				Object[] result3_green = EnumConstantImpl.pattern_EnumConstant_2_3_findcontext_greenBBBBBFFFFFF(model,
						mEnum, mEnumToTEnum, tEnum, mDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mEnumToTEnum__tEnum____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge model__tEnum____ownedTypes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mEnumToTEnum__mEnum____source = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = EnumConstantImpl
						.pattern_EnumConstant_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, model,
								mEnum, mEnumToTEnum, tEnum, mDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
							+ "[mEnum] = " + mEnum + ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = "
							+ tEnum + ", " + "[mDefinition] = " + mDefinition + ".");
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
	public void registerObjectsToMatch_FWD(Match match, EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {
		match.registerObject("mEnum", mEnum);
		match.registerObject("mDefinition", mDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeGraph model, EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, MEnumConstantDeclaration mDefinition) {// Create CSP
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
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("mEnum", mEnum);
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model,
			EObject tSignature, EObject tName, EObject mDefinitionToTMember, EObject mEnum, EObject mEnumToTEnum,
			EObject tEnum, EObject mDefinition, EObject tDefinition) {
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mEnum", mEnum);
		ruleresult.registerObject("mEnumToTEnum", mEnumToTEnum);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tDefinition", tDefinition);

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
	public boolean isAppropriate_BWD(Match match, TypeGraph model, TFieldSignature tSignature, TField tName,
			TClass tEnum, TFieldDefinition tDefinition) {

		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_10_1_initialbindings_blackBBBBBBB(this, match,
				model, tSignature, tName, tEnum, tDefinition);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[model] = " + model + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = "
							+ tName + ", " + "[tEnum] = " + tEnum + ", " + "[tDefinition] = " + tDefinition + ".");
		}

		Object[] result2_bindingAndBlack = EnumConstantImpl.pattern_EnumConstant_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
				this, match, model, tSignature, tName, tEnum, tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[model] = " + model + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = "
							+ tName + ", " + "[tEnum] = " + tEnum + ", " + "[tDefinition] = " + tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (EnumConstantImpl.pattern_EnumConstant_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = EnumConstantImpl
					.pattern_EnumConstant_10_4_collectelementstobetranslated_blackBBBBBB(match, model, tSignature,
							tName, tEnum, tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName
						+ ", " + "[tEnum] = " + tEnum + ", " + "[tDefinition] = " + tDefinition + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(match, model,
					tSignature, tName, tEnum, tDefinition);
			//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result4_green[15];

			Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_10_5_collectcontextelements_blackBBBBBB(
					match, model, tSignature, tName, tEnum, tDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName
						+ ", " + "[tEnum] = " + tEnum + ", " + "[tDefinition] = " + tDefinition + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_10_5_collectcontextelements_greenBBBFF(match, model, tEnum);
			//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge model__tEnum____ownedTypes = (EMoflonEdge) result5_green[4];

			// 
			EnumConstantImpl.pattern_EnumConstant_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, model,
					tSignature, tName, tEnum, tDefinition);
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
		TypeGraph model = (TypeGraph) result1_bindingAndBlack[0];
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[1];
		TField tName = (TField) result1_bindingAndBlack[2];
		EnumDeclaration mEnum = (EnumDeclaration) result1_bindingAndBlack[3];
		TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result1_bindingAndBlack[4];
		TClass tEnum = (TClass) result1_bindingAndBlack[5];
		TFieldDefinition tDefinition = (TFieldDefinition) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = EnumConstantImpl.pattern_EnumConstant_11_1_performtransformation_greenFFBFBB(mEnum,
				tDefinition, csp);
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[0];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[1];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result1_green[3];

		Object[] result2_black = EnumConstantImpl.pattern_EnumConstant_11_2_collecttranslatedelements_blackBBBBBB(
				mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition, tDefinition);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", "
					+ "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[tDefinition] = " + tDefinition + ".");
		}
		Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_11_2_collecttranslatedelements_greenFBBBBBB(
				mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition, tDefinition);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumConstantImpl.pattern_EnumConstant_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum, mEnumToTEnum,
				tEnum, mDefinition, tDefinition);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[model] = " + model + ", "
					+ "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[mEnum] = " + mEnum + ", " + "[mEnumToTEnum] = " + mEnumToTEnum
					+ ", " + "[tEnum] = " + tEnum + ", " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = "
					+ tDefinition + ".");
		}
		EnumConstantImpl.pattern_EnumConstant_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult,
				mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum, tEnum, mDefinition,
				tDefinition);
		//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[24];

		// 
		// 
		EnumConstantImpl.pattern_EnumConstant_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum, mEnumToTEnum, tEnum,
				mDefinition, tDefinition);
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
		TypeGraph model = (TypeGraph) result2_binding[0];
		TFieldSignature tSignature = (TFieldSignature) result2_binding[1];
		TField tName = (TField) result2_binding[2];
		TClass tEnum = (TClass) result2_binding[3];
		TFieldDefinition tDefinition = (TFieldDefinition) result2_binding[4];
		for (Object[] result2_black : EnumConstantImpl.pattern_EnumConstant_12_2_corematch_blackBBBFFBBB(model,
				tSignature, tName, tEnum, tDefinition, match)) {
			EnumDeclaration mEnum = (EnumDeclaration) result2_black[3];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result2_black[4];
			// ForEach 
			for (Object[] result3_black : EnumConstantImpl.pattern_EnumConstant_12_3_findcontext_blackBBBBBBB(model,
					tSignature, tName, mEnum, mEnumToTEnum, tEnum, tDefinition)) {
				Object[] result3_green = EnumConstantImpl
						.pattern_EnumConstant_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFF(model, tSignature, tName,
								mEnum, mEnumToTEnum, tEnum, tDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mEnumToTEnum__tEnum____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge model__tEnum____ownedTypes = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mEnumToTEnum__mEnum____source = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = EnumConstantImpl
						.pattern_EnumConstant_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, model,
								tSignature, tName, mEnum, mEnumToTEnum, tEnum, tDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", " + "[mEnum] = " + mEnum
							+ ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = " + tEnum + ", "
							+ "[tDefinition] = " + tDefinition + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TypeGraph model, TFieldSignature tSignature, TField tName,
			TClass tEnum, TFieldDefinition tDefinition) {
		match.registerObject("model", model);
		match.registerObject("tSignature", tSignature);
		match.registerObject("tName", tName);
		match.registerObject("tEnum", tEnum);
		match.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph model, TFieldSignature tSignature, TField tName,
			TClass tEnum, TFieldDefinition tDefinition) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph model,
			TFieldSignature tSignature, TField tName, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum,
			TClass tEnum, TFieldDefinition tDefinition) {// Create CSP
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
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("mEnum", mEnum);
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model,
			EObject tSignature, EObject tName, EObject mDefinitionToTMember, EObject mEnum, EObject mEnumToTEnum,
			EObject tEnum, EObject mDefinition, EObject tDefinition) {
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mEnum", mEnum);
		ruleresult.registerObject("mEnumToTEnum", mEnumToTEnum);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSignature").eClass())
						.equals("basic.TFieldSignature.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tName").eClass()).equals("basic.TField.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tDefinition").eClass())
						.equals("basic.TFieldDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_62(EMoflonEdge _edge_fields) {

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
			TypeGraph model = (TypeGraph) result2_black[0];
			TFieldSignature tSignature = (TFieldSignature) result2_black[1];
			TField tName = (TField) result2_black[2];
			TClass tEnum = (TClass) result2_black[3];
			TFieldDefinition tDefinition = (TFieldDefinition) result2_black[4];
			Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (EnumConstantImpl.pattern_EnumConstant_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
					this, match, model, tSignature, tName, tEnum, tDefinition)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_64(EMoflonEdge _edge_enumConstants) {

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
			EnumDeclaration mEnum = (EnumDeclaration) result2_black[0];
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result2_black[1];
			Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (EnumConstantImpl.pattern_EnumConstant_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, mEnum, mDefinition)) {
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
		TypeGraph model = (TypeGraph) result2_bindingAndBlack[0];
		TFieldSignature tSignature = (TFieldSignature) result2_bindingAndBlack[1];
		TField tName = (TField) result2_bindingAndBlack[2];
		EnumDeclaration mEnum = (EnumDeclaration) result2_bindingAndBlack[3];
		TClass tEnum = (TClass) result2_bindingAndBlack[4];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result2_bindingAndBlack[5];
		TFieldDefinition tDefinition = (TFieldDefinition) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, model, tSignature, tName, mEnum,
						tEnum, mDefinition, tDefinition, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[model] = " + model + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", "
					+ "[mEnum] = " + mEnum + ", " + "[tEnum] = " + tEnum + ", " + "[mDefinition] = " + mDefinition
					+ ", " + "[tDefinition] = " + tDefinition + ", " + "[sourceMatch] = " + sourceMatch + ", "
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
						model, tSignature, tName, mEnum, tEnum, mDefinition, tDefinition, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ", " + "[mEnum] = " + mEnum
							+ ", " + "[tEnum] = " + tEnum + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				EnumConstantImpl.pattern_EnumConstant_24_6_createcorrespondence_greenFFBBB(mDefinition, tDefinition,
						ccMatch);
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[0];
				//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[1];

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
	public CSP isApplicable_solveCsp_CC(TypeGraph model, TFieldSignature tSignature, TField tName,
			EnumDeclaration mEnum, TClass tEnum, MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition,
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
	public boolean checkDEC_FWD(EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {// 
		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_27_1_matchtggpattern_blackBB(mEnum, mDefinition);
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
	public boolean checkDEC_BWD(TypeGraph model, TFieldSignature tSignature, TField tName, TClass tEnum,
			TFieldDefinition tDefinition) {// 
		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_28_1_matchtggpattern_blackBBBBB(model,
				tSignature, tName, tEnum, tDefinition);
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
					EnumConstantImpl.pattern_EnumConstant_29_6_perform_greenFBFFFBBFFBB(model, mEnum, tEnum, ruleResult,
							csp);
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[0];
					//nothing TFieldSignature tSignature = (TFieldSignature) result6_green[2];
					//nothing TField tName = (TField) result6_green[3];
					//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[4];
					//nothing MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result6_green[7];
					//nothing TFieldDefinition tDefinition = (TFieldDefinition) result6_green[8];

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
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_FWD__MATCH_ENUMDECLARATION_MENUMCONSTANTDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(MEnumConstantDeclaration) arguments.get(2));
		case RulesPackage.ENUM_CONSTANT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ENUMDECLARATION_MENUMCONSTANTDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(MEnumConstantDeclaration) arguments.get(2));
			return null;
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ENUMDECLARATION_MENUMCONSTANTDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (EnumDeclaration) arguments.get(1),
					(MEnumConstantDeclaration) arguments.get(2));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEGRAPH_ENUMDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_MENUMCONSTANTDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(EnumDeclaration) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(TClass) arguments.get(4), (MEnumConstantDeclaration) arguments.get(5));
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
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TFIELDSIGNATURE_TFIELD_TCLASS_TFIELDDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TFieldSignature) arguments.get(2), (TField) arguments.get(3), (TClass) arguments.get(4),
					(TFieldDefinition) arguments.get(5));
		case RulesPackage.ENUM_CONSTANT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TFIELDSIGNATURE_TFIELD_TCLASS_TFIELDDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TFieldSignature) arguments.get(2), (TField) arguments.get(3), (TClass) arguments.get(4),
					(TFieldDefinition) arguments.get(5));
			return null;
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TFIELDSIGNATURE_TFIELD_TCLASS_TFIELDDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TFieldSignature) arguments.get(2), (TField) arguments.get(3), (TClass) arguments.get(4),
					(TFieldDefinition) arguments.get(5));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TFIELDSIGNATURE_TFIELD_ENUMDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_TFIELDDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TFieldSignature) arguments.get(2), (TField) arguments.get(3), (EnumDeclaration) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (TClass) arguments.get(6),
					(TFieldDefinition) arguments.get(7));
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
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_62__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_62((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_64__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_64((EMoflonEdge) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_TFIELDSIGNATURE_TFIELD_ENUMDECLARATION_TCLASS_MENUMCONSTANTDECLARATION_TFIELDDEFINITION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TypeGraph) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TField) arguments.get(2), (EnumDeclaration) arguments.get(3), (TClass) arguments.get(4),
					(MEnumConstantDeclaration) arguments.get(5), (TFieldDefinition) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___CHECK_DEC_FWD__ENUMDECLARATION_MENUMCONSTANTDECLARATION:
			return checkDEC_FWD((EnumDeclaration) arguments.get(0), (MEnumConstantDeclaration) arguments.get(1));
		case RulesPackage.ENUM_CONSTANT___CHECK_DEC_BWD__TYPEGRAPH_TFIELDSIGNATURE_TFIELD_TCLASS_TFIELDDEFINITION:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TFieldSignature) arguments.get(1),
					(TField) arguments.get(2), (TClass) arguments.get(3), (TFieldDefinition) arguments.get(4));
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
			EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {
		return new Object[] { _this, match, mEnum, mDefinition };
	}

	public static final Object[] pattern_EnumConstant_0_2_SolveCSP_bindingFBBBB(EnumConstant _this, Match match,
			EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mEnum, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mEnum, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_0_2_SolveCSP_bindingAndBlackFBBBB(EnumConstant _this, Match match,
			EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {
		Object[] result_pattern_EnumConstant_0_2_SolveCSP_binding = pattern_EnumConstant_0_2_SolveCSP_bindingFBBBB(
				_this, match, mEnum, mDefinition);
		if (result_pattern_EnumConstant_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_0_2_SolveCSP_binding[0];

			Object[] result_pattern_EnumConstant_0_2_SolveCSP_black = pattern_EnumConstant_0_2_SolveCSP_blackB(csp);
			if (result_pattern_EnumConstant_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mEnum, mDefinition };
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
			EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {
		return new Object[] { match, mEnum, mDefinition };
	}

	public static final Object[] pattern_EnumConstant_0_4_collectelementstobetranslated_greenBBBF(Match match,
			EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mDefinition);
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mEnum__mDefinition____enumConstants);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		return new Object[] { match, mEnum, mDefinition, mEnum__mDefinition____enumConstants };
	}

	public static final Object[] pattern_EnumConstant_0_5_collectcontextelements_blackBBB(Match match,
			EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {
		return new Object[] { match, mEnum, mDefinition };
	}

	public static final Object[] pattern_EnumConstant_0_5_collectcontextelements_greenBB(Match match,
			EnumDeclaration mEnum) {
		match.getContextNodes().add(mEnum);
		return new Object[] { match, mEnum };
	}

	public static final void pattern_EnumConstant_0_6_registerobjectstomatch_expressionBBBB(EnumConstant _this,
			Match match, EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {
		_this.registerObjectsToMatch_FWD(match, mEnum, mDefinition);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject _localVariable_1 = isApplicableMatch.getObject("mEnum");
		EObject _localVariable_2 = isApplicableMatch.getObject("mEnumToTEnum");
		EObject _localVariable_3 = isApplicableMatch.getObject("tEnum");
		EObject _localVariable_4 = isApplicableMatch.getObject("mDefinition");
		EObject tmpModel = _localVariable_0;
		EObject tmpMEnum = _localVariable_1;
		EObject tmpMEnumToTEnum = _localVariable_2;
		EObject tmpTEnum = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		if (tmpModel instanceof TypeGraph) {
			TypeGraph model = (TypeGraph) tmpModel;
			if (tmpMEnum instanceof EnumDeclaration) {
				EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
				if (tmpMEnumToTEnum instanceof TypeToTAbstractType) {
					TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) tmpMEnumToTEnum;
					if (tmpTEnum instanceof TClass) {
						TClass tEnum = (TClass) tmpTEnum;
						if (tmpMDefinition instanceof MEnumConstantDeclaration) {
							MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
							return new Object[] { model, mEnum, mEnumToTEnum, tEnum, mDefinition, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_blackBBBBBFBB(TypeGraph model,
			EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum, TClass tEnum, MEnumConstantDeclaration mDefinition,
			EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { model, mEnum, mEnumToTEnum, tEnum, mDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_EnumConstant_1_1_performtransformation_binding = pattern_EnumConstant_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_EnumConstant_1_1_performtransformation_binding != null) {
			TypeGraph model = (TypeGraph) result_pattern_EnumConstant_1_1_performtransformation_binding[0];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_1_1_performtransformation_binding[1];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result_pattern_EnumConstant_1_1_performtransformation_binding[2];
			TClass tEnum = (TClass) result_pattern_EnumConstant_1_1_performtransformation_binding[3];
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result_pattern_EnumConstant_1_1_performtransformation_binding[4];

			Object[] result_pattern_EnumConstant_1_1_performtransformation_black = pattern_EnumConstant_1_1_performtransformation_blackBBBBBFBB(
					model, mEnum, mEnumToTEnum, tEnum, mDefinition, _this, isApplicableMatch);
			if (result_pattern_EnumConstant_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumConstant_1_1_performtransformation_black[5];

				return new Object[] { model, mEnum, mEnumToTEnum, tEnum, mDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_greenFBFFFBBFB(TypeGraph model,
			TClass tEnum, MEnumConstantDeclaration mDefinition, CSP csp) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		TField tName = BasicFactory.eINSTANCE.createTField();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TFieldDefinition tDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		Object _localVariable_0 = csp.getValue("tName", "tName");
		mBodyToTAnnotation.setSource(mDefinition);
		tSignature.setType(tEnum);
		tEnum.getSignature().add(tSignature);
		model.getFields().add(tName);
		tSignature.setField(tName);
		mDefinitionToTMember.setSource(mDefinition);
		tEnum.getDefines().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		tDefinition.setSignature(tSignature);
		String tName_tName_prime = (String) _localVariable_0;
		tName.setTName(tName_tName_prime);
		return new Object[] { mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, tEnum, mDefinition,
				tDefinition, csp };
	}

	public static final Object[] pattern_EnumConstant_1_2_collecttranslatedelements_blackBBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation, TFieldSignature tSignature, TField tName,
			MDefinitionToTMember mDefinitionToTMember, MEnumConstantDeclaration mDefinition,
			TFieldDefinition tDefinition) {
		return new Object[] { mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition, tDefinition };
	}

	public static final Object[] pattern_EnumConstant_1_2_collecttranslatedelements_greenFBBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation, TFieldSignature tSignature, TField tName,
			MDefinitionToTMember mDefinitionToTMember, MEnumConstantDeclaration mDefinition,
			TFieldDefinition tDefinition) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedElements().add(tName);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getTranslatedElements().add(mDefinition);
		ruleresult.getCreatedElements().add(tDefinition);
		return new Object[] { ruleresult, mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition,
				tDefinition };
	}

	public static final Object[] pattern_EnumConstant_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject tSignature, EObject tName,
			EObject mDefinitionToTMember, EObject mEnum, EObject mEnumToTEnum, EObject tEnum, EObject mDefinition,
			EObject tDefinition) {
		if (!mBodyToTAnnotation.equals(model)) {
			if (!mBodyToTAnnotation.equals(tSignature)) {
				if (!mBodyToTAnnotation.equals(tName)) {
					if (!mBodyToTAnnotation.equals(mDefinitionToTMember)) {
						if (!mBodyToTAnnotation.equals(mEnum)) {
							if (!mBodyToTAnnotation.equals(mEnumToTEnum)) {
								if (!mBodyToTAnnotation.equals(tEnum)) {
									if (!mBodyToTAnnotation.equals(mDefinition)) {
										if (!mBodyToTAnnotation.equals(tDefinition)) {
											if (!model.equals(tSignature)) {
												if (!model.equals(tName)) {
													if (!model.equals(tEnum)) {
														if (!model.equals(tDefinition)) {
															if (!tName.equals(tSignature)) {
																if (!mDefinitionToTMember.equals(model)) {
																	if (!mDefinitionToTMember.equals(tSignature)) {
																		if (!mDefinitionToTMember.equals(tName)) {
																			if (!mDefinitionToTMember.equals(mEnum)) {
																				if (!mDefinitionToTMember
																						.equals(mEnumToTEnum)) {
																					if (!mDefinitionToTMember
																							.equals(tEnum)) {
																						if (!mDefinitionToTMember
																								.equals(tDefinition)) {
																							if (!mEnum.equals(model)) {
																								if (!mEnum.equals(
																										tSignature)) {
																									if (!mEnum.equals(
																											tName)) {
																										if (!mEnum
																												.equals(mEnumToTEnum)) {
																											if (!mEnum
																													.equals(tEnum)) {
																												if (!mEnum
																														.equals(tDefinition)) {
																													if (!mEnumToTEnum
																															.equals(model)) {
																														if (!mEnumToTEnum
																																.equals(tSignature)) {
																															if (!mEnumToTEnum
																																	.equals(tName)) {
																																if (!mEnumToTEnum
																																		.equals(tEnum)) {
																																	if (!mEnumToTEnum
																																			.equals(tDefinition)) {
																																		if (!tEnum
																																				.equals(tSignature)) {
																																			if (!tEnum
																																					.equals(tName)) {
																																				if (!mDefinition
																																						.equals(model)) {
																																					if (!mDefinition
																																							.equals(tSignature)) {
																																						if (!mDefinition
																																								.equals(tName)) {
																																							if (!mDefinition
																																									.equals(mDefinitionToTMember)) {
																																								if (!mDefinition
																																										.equals(mEnum)) {
																																									if (!mDefinition
																																											.equals(mEnumToTEnum)) {
																																										if (!mDefinition
																																												.equals(tEnum)) {
																																											if (!mDefinition
																																													.equals(tDefinition)) {
																																												if (!tDefinition
																																														.equals(tSignature)) {
																																													if (!tDefinition
																																															.equals(tName)) {
																																														if (!tDefinition
																																																.equals(tEnum)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mBodyToTAnnotation,
																																																	model,
																																																	tSignature,
																																																	tName,
																																																	mDefinitionToTMember,
																																																	mEnum,
																																																	mEnumToTEnum,
																																																	tEnum,
																																																	mDefinition,
																																																	tDefinition };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject tSignature, EObject tName,
			EObject mDefinitionToTMember, EObject mEnum, EObject tEnum, EObject mDefinition, EObject tDefinition) {
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumConstant";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tEnum____type_name_prime = "type";
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String tEnum__tSignature____signature_name_prime = "signature";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		ruleresult.getCreatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		ruleresult.getCreatedEdges().add(tName__model____model);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		ruleresult.getCreatedEdges().add(tSignature__tEnum____type);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mEnum__mDefinition____enumConstants);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		ruleresult.getCreatedEdges().add(tDefinition__tEnum____definedBy);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tEnum__tSignature____signature);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tSignature__tDefinition____definitions);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		return new Object[] { ruleresult, mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum,
				tEnum, mDefinition, tDefinition, model__tName____fields, tName__model____model,
				tSignature__tName____field, tName__tSignature____signatures, tSignature__tEnum____type,
				mEnum__mDefinition____enumConstants, tEnum__tDefinition____defines, tDefinition__tEnum____definedBy,
				mBodyToTAnnotation__mDefinition____source, mDefinitionToTMember__mDefinition____source,
				tEnum__tSignature____signature, mDefinitionToTMember__tDefinition____target,
				mBodyToTAnnotation__tDefinition____target, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions };
	}

	public static final void pattern_EnumConstant_1_5_registerobjects_expressionBBBBBBBBBBBB(EnumConstant _this,
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject tSignature, EObject tName,
			EObject mDefinitionToTMember, EObject mEnum, EObject mEnumToTEnum, EObject tEnum, EObject mDefinition,
			EObject tDefinition) {
		_this.registerObjects_FWD(ruleresult, mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum,
				mEnumToTEnum, tEnum, mDefinition, tDefinition);

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
		EObject _localVariable_0 = match.getObject("mEnum");
		EObject _localVariable_1 = match.getObject("mDefinition");
		EObject tmpMEnum = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		if (tmpMEnum instanceof EnumDeclaration) {
			EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
			if (tmpMDefinition instanceof MEnumConstantDeclaration) {
				MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
				return new Object[] { mEnum, mDefinition, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_2_2_corematch_blackBFFBB(EnumDeclaration mEnum,
			MEnumConstantDeclaration mDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mEnum, TypeToTAbstractType.class, "source")) {
			TAbstractType tmpTEnum = mEnumToTEnum.getTarget();
			if (tmpTEnum instanceof TClass) {
				TClass tEnum = (TClass) tmpTEnum;
				_result.add(new Object[] { mEnum, mEnumToTEnum, tEnum, mDefinition, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_2_3_findcontext_blackFBBBB(EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, MEnumConstantDeclaration mDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mEnum.getEnumConstants().contains(mDefinition)) {
			if (tEnum.equals(mEnumToTEnum.getTarget())) {
				if (mEnum.equals(mEnumToTEnum.getSource())) {
					TypeGraph model = tEnum.getModel();
					if (model != null) {
						_result.add(new Object[] { model, mEnum, mEnumToTEnum, tEnum, mDefinition });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumConstant_2_3_findcontext_greenBBBBBFFFFFF(TypeGraph model,
			EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum, TClass tEnum,
			MEnumConstantDeclaration mDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__tEnum____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__mEnum____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String mEnumToTEnum__tEnum____target_name_prime = "target";
		String tEnum__model____model_name_prime = "model";
		String model__tEnum____ownedTypes_name_prime = "ownedTypes";
		String mEnumToTEnum__mEnum____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum);
		isApplicableMatch.getAllContextElements().add(tEnum);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mEnum__mDefinition____enumConstants);
		mEnumToTEnum__tEnum____target.setSrc(mEnumToTEnum);
		mEnumToTEnum__tEnum____target.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__tEnum____target);
		tEnum__model____model.setSrc(tEnum);
		tEnum__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tEnum__model____model);
		model__tEnum____ownedTypes.setSrc(model);
		model__tEnum____ownedTypes.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(model__tEnum____ownedTypes);
		mEnumToTEnum__mEnum____source.setSrc(mEnumToTEnum);
		mEnumToTEnum__mEnum____source.setTrg(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__mEnum____source);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		mEnumToTEnum__tEnum____target.setName(mEnumToTEnum__tEnum____target_name_prime);
		tEnum__model____model.setName(tEnum__model____model_name_prime);
		model__tEnum____ownedTypes.setName(model__tEnum____ownedTypes_name_prime);
		mEnumToTEnum__mEnum____source.setName(mEnumToTEnum__mEnum____source_name_prime);
		return new Object[] { model, mEnum, mEnumToTEnum, tEnum, mDefinition, isApplicableMatch,
				mEnum__mDefinition____enumConstants, mEnumToTEnum__tEnum____target, tEnum__model____model,
				model__tEnum____ownedTypes, mEnumToTEnum__mEnum____source };
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_bindingFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, MEnumConstantDeclaration mDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, model, mEnum, mEnumToTEnum, tEnum,
				mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, mEnum, mEnumToTEnum, tEnum, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, EnumDeclaration mEnum,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, MEnumConstantDeclaration mDefinition) {
		Object[] result_pattern_EnumConstant_2_4_solveCSP_binding = pattern_EnumConstant_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, model, mEnum, mEnumToTEnum, tEnum, mDefinition);
		if (result_pattern_EnumConstant_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_2_4_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_2_4_solveCSP_black = pattern_EnumConstant_2_4_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, mEnum, mEnumToTEnum, tEnum, mDefinition };
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
			TypeGraph model, TFieldSignature tSignature, TField tName, TClass tEnum, TFieldDefinition tDefinition) {
		return new Object[] { _this, match, model, tSignature, tName, tEnum, tDefinition };
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_bindingFBBBBBBB(EnumConstant _this, Match match,
			TypeGraph model, TFieldSignature tSignature, TField tName, TClass tEnum, TFieldDefinition tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, model, tSignature, tName, tEnum, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model, tSignature, tName, tEnum, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			Match match, TypeGraph model, TFieldSignature tSignature, TField tName, TClass tEnum,
			TFieldDefinition tDefinition) {
		Object[] result_pattern_EnumConstant_10_2_SolveCSP_binding = pattern_EnumConstant_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, model, tSignature, tName, tEnum, tDefinition);
		if (result_pattern_EnumConstant_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_10_2_SolveCSP_binding[0];

			Object[] result_pattern_EnumConstant_10_2_SolveCSP_black = pattern_EnumConstant_10_2_SolveCSP_blackB(csp);
			if (result_pattern_EnumConstant_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, model, tSignature, tName, tEnum, tDefinition };
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
			TypeGraph model, TFieldSignature tSignature, TField tName, TClass tEnum, TFieldDefinition tDefinition) {
		return new Object[] { match, model, tSignature, tName, tEnum, tDefinition };
	}

	public static final Object[] pattern_EnumConstant_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(
			Match match, TypeGraph model, TFieldSignature tSignature, TField tName, TClass tEnum,
			TFieldDefinition tDefinition) {
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		match.getToBeTranslatedNodes().add(tName);
		match.getToBeTranslatedNodes().add(tDefinition);
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tEnum____type_name_prime = "type";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String tEnum__tSignature____signature_name_prime = "signature";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		match.getToBeTranslatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		match.getToBeTranslatedEdges().add(tName__model____model);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		match.getToBeTranslatedEdges().add(tSignature__tEnum____type);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		match.getToBeTranslatedEdges().add(tDefinition__tEnum____definedBy);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tEnum__tSignature____signature);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tSignature__tDefinition____definitions);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		return new Object[] { match, model, tSignature, tName, tEnum, tDefinition, model__tName____fields,
				tName__model____model, tSignature__tName____field, tName__tSignature____signatures,
				tSignature__tEnum____type, tEnum__tDefinition____defines, tDefinition__tEnum____definedBy,
				tEnum__tSignature____signature, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions };
	}

	public static final Object[] pattern_EnumConstant_10_5_collectcontextelements_blackBBBBBB(Match match,
			TypeGraph model, TFieldSignature tSignature, TField tName, TClass tEnum, TFieldDefinition tDefinition) {
		return new Object[] { match, model, tSignature, tName, tEnum, tDefinition };
	}

	public static final Object[] pattern_EnumConstant_10_5_collectcontextelements_greenBBBFF(Match match,
			TypeGraph model, TClass tEnum) {
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(model);
		match.getContextNodes().add(tEnum);
		String tEnum__model____model_name_prime = "model";
		String model__tEnum____ownedTypes_name_prime = "ownedTypes";
		tEnum__model____model.setSrc(tEnum);
		tEnum__model____model.setTrg(model);
		match.getContextEdges().add(tEnum__model____model);
		model__tEnum____ownedTypes.setSrc(model);
		model__tEnum____ownedTypes.setTrg(tEnum);
		match.getContextEdges().add(model__tEnum____ownedTypes);
		tEnum__model____model.setName(tEnum__model____model_name_prime);
		model__tEnum____ownedTypes.setName(model__tEnum____ownedTypes_name_prime);
		return new Object[] { match, model, tEnum, tEnum__model____model, model__tEnum____ownedTypes };
	}

	public static final void pattern_EnumConstant_10_6_registerobjectstomatch_expressionBBBBBBB(EnumConstant _this,
			Match match, TypeGraph model, TFieldSignature tSignature, TField tName, TClass tEnum,
			TFieldDefinition tDefinition) {
		_this.registerObjectsToMatch_BWD(match, model, tSignature, tName, tEnum, tDefinition);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tName");
		EObject _localVariable_3 = isApplicableMatch.getObject("mEnum");
		EObject _localVariable_4 = isApplicableMatch.getObject("mEnumToTEnum");
		EObject _localVariable_5 = isApplicableMatch.getObject("tEnum");
		EObject _localVariable_6 = isApplicableMatch.getObject("tDefinition");
		EObject tmpModel = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpMEnum = _localVariable_3;
		EObject tmpMEnumToTEnum = _localVariable_4;
		EObject tmpTEnum = _localVariable_5;
		EObject tmpTDefinition = _localVariable_6;
		if (tmpModel instanceof TypeGraph) {
			TypeGraph model = (TypeGraph) tmpModel;
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tmpTName instanceof TField) {
					TField tName = (TField) tmpTName;
					if (tmpMEnum instanceof EnumDeclaration) {
						EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
						if (tmpMEnumToTEnum instanceof TypeToTAbstractType) {
							TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) tmpMEnumToTEnum;
							if (tmpTEnum instanceof TClass) {
								TClass tEnum = (TClass) tmpTEnum;
								if (tmpTDefinition instanceof TFieldDefinition) {
									TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
									return new Object[] { model, tSignature, tName, mEnum, mEnumToTEnum, tEnum,
											tDefinition, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_11_1_performtransformation_blackBBBBBBBFBB(TypeGraph model,
			TFieldSignature tSignature, TField tName, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum,
			TClass tEnum, TFieldDefinition tDefinition, EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { model, tSignature, tName, mEnum, mEnumToTEnum, tEnum, tDefinition, csp, _this,
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
			TypeGraph model = (TypeGraph) result_pattern_EnumConstant_11_1_performtransformation_binding[0];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_EnumConstant_11_1_performtransformation_binding[1];
			TField tName = (TField) result_pattern_EnumConstant_11_1_performtransformation_binding[2];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_11_1_performtransformation_binding[3];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result_pattern_EnumConstant_11_1_performtransformation_binding[4];
			TClass tEnum = (TClass) result_pattern_EnumConstant_11_1_performtransformation_binding[5];
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_EnumConstant_11_1_performtransformation_binding[6];

			Object[] result_pattern_EnumConstant_11_1_performtransformation_black = pattern_EnumConstant_11_1_performtransformation_blackBBBBBBBFBB(
					model, tSignature, tName, mEnum, mEnumToTEnum, tEnum, tDefinition, _this, isApplicableMatch);
			if (result_pattern_EnumConstant_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumConstant_11_1_performtransformation_black[7];

				return new Object[] { model, tSignature, tName, mEnum, mEnumToTEnum, tEnum, tDefinition, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_11_1_performtransformation_greenFFBFBB(EnumDeclaration mEnum,
			TFieldDefinition tDefinition, CSP csp) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MEnumConstantDeclaration mDefinition = ModiscoFactory.eINSTANCE.createMEnumConstantDeclaration();
		Object _localVariable_0 = csp.getValue("mDefinition", "name");
		mBodyToTAnnotation.setTarget(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mEnum.getEnumConstants().add(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		String mDefinition_name_prime = (String) _localVariable_0;
		mDefinition.setName(mDefinition_name_prime);
		return new Object[] { mBodyToTAnnotation, mDefinitionToTMember, mEnum, mDefinition, tDefinition, csp };
	}

	public static final Object[] pattern_EnumConstant_11_2_collecttranslatedelements_blackBBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation, TFieldSignature tSignature, TField tName,
			MDefinitionToTMember mDefinitionToTMember, MEnumConstantDeclaration mDefinition,
			TFieldDefinition tDefinition) {
		return new Object[] { mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition, tDefinition };
	}

	public static final Object[] pattern_EnumConstant_11_2_collecttranslatedelements_greenFBBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation, TFieldSignature tSignature, TField tName,
			MDefinitionToTMember mDefinitionToTMember, MEnumConstantDeclaration mDefinition,
			TFieldDefinition tDefinition) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getTranslatedElements().add(tName);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedElements().add(mDefinition);
		ruleresult.getTranslatedElements().add(tDefinition);
		return new Object[] { ruleresult, mBodyToTAnnotation, tSignature, tName, mDefinitionToTMember, mDefinition,
				tDefinition };
	}

	public static final Object[] pattern_EnumConstant_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject tSignature, EObject tName,
			EObject mDefinitionToTMember, EObject mEnum, EObject mEnumToTEnum, EObject tEnum, EObject mDefinition,
			EObject tDefinition) {
		if (!mBodyToTAnnotation.equals(model)) {
			if (!mBodyToTAnnotation.equals(tSignature)) {
				if (!mBodyToTAnnotation.equals(tName)) {
					if (!mBodyToTAnnotation.equals(mDefinitionToTMember)) {
						if (!mBodyToTAnnotation.equals(mEnum)) {
							if (!mBodyToTAnnotation.equals(mEnumToTEnum)) {
								if (!mBodyToTAnnotation.equals(tEnum)) {
									if (!mBodyToTAnnotation.equals(mDefinition)) {
										if (!mBodyToTAnnotation.equals(tDefinition)) {
											if (!model.equals(tSignature)) {
												if (!model.equals(tName)) {
													if (!model.equals(tEnum)) {
														if (!model.equals(tDefinition)) {
															if (!tName.equals(tSignature)) {
																if (!mDefinitionToTMember.equals(model)) {
																	if (!mDefinitionToTMember.equals(tSignature)) {
																		if (!mDefinitionToTMember.equals(tName)) {
																			if (!mDefinitionToTMember.equals(mEnum)) {
																				if (!mDefinitionToTMember
																						.equals(mEnumToTEnum)) {
																					if (!mDefinitionToTMember
																							.equals(tEnum)) {
																						if (!mDefinitionToTMember
																								.equals(tDefinition)) {
																							if (!mEnum.equals(model)) {
																								if (!mEnum.equals(
																										tSignature)) {
																									if (!mEnum.equals(
																											tName)) {
																										if (!mEnum
																												.equals(mEnumToTEnum)) {
																											if (!mEnum
																													.equals(tEnum)) {
																												if (!mEnum
																														.equals(tDefinition)) {
																													if (!mEnumToTEnum
																															.equals(model)) {
																														if (!mEnumToTEnum
																																.equals(tSignature)) {
																															if (!mEnumToTEnum
																																	.equals(tName)) {
																																if (!mEnumToTEnum
																																		.equals(tEnum)) {
																																	if (!mEnumToTEnum
																																			.equals(tDefinition)) {
																																		if (!tEnum
																																				.equals(tSignature)) {
																																			if (!tEnum
																																					.equals(tName)) {
																																				if (!mDefinition
																																						.equals(model)) {
																																					if (!mDefinition
																																							.equals(tSignature)) {
																																						if (!mDefinition
																																								.equals(tName)) {
																																							if (!mDefinition
																																									.equals(mDefinitionToTMember)) {
																																								if (!mDefinition
																																										.equals(mEnum)) {
																																									if (!mDefinition
																																											.equals(mEnumToTEnum)) {
																																										if (!mDefinition
																																												.equals(tEnum)) {
																																											if (!mDefinition
																																													.equals(tDefinition)) {
																																												if (!tDefinition
																																														.equals(tSignature)) {
																																													if (!tDefinition
																																															.equals(tName)) {
																																														if (!tDefinition
																																																.equals(tEnum)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mBodyToTAnnotation,
																																																	model,
																																																	tSignature,
																																																	tName,
																																																	mDefinitionToTMember,
																																																	mEnum,
																																																	mEnumToTEnum,
																																																	tEnum,
																																																	mDefinition,
																																																	tDefinition };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject tSignature, EObject tName,
			EObject mDefinitionToTMember, EObject mEnum, EObject tEnum, EObject mDefinition, EObject tDefinition) {
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumConstant";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tEnum____type_name_prime = "type";
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String tEnum__tSignature____signature_name_prime = "signature";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		ruleresult.getTranslatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		ruleresult.getTranslatedEdges().add(tName__model____model);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		ruleresult.getTranslatedEdges().add(tSignature__tEnum____type);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mEnum__mDefinition____enumConstants);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		ruleresult.getTranslatedEdges().add(tDefinition__tEnum____definedBy);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tEnum__tSignature____signature);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tSignature__tDefinition____definitions);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		return new Object[] { ruleresult, mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum,
				tEnum, mDefinition, tDefinition, model__tName____fields, tName__model____model,
				tSignature__tName____field, tName__tSignature____signatures, tSignature__tEnum____type,
				mEnum__mDefinition____enumConstants, tEnum__tDefinition____defines, tDefinition__tEnum____definedBy,
				mBodyToTAnnotation__mDefinition____source, mDefinitionToTMember__mDefinition____source,
				tEnum__tSignature____signature, mDefinitionToTMember__tDefinition____target,
				mBodyToTAnnotation__tDefinition____target, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions };
	}

	public static final void pattern_EnumConstant_11_5_registerobjects_expressionBBBBBBBBBBBB(EnumConstant _this,
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject tSignature, EObject tName,
			EObject mDefinitionToTMember, EObject mEnum, EObject mEnumToTEnum, EObject tEnum, EObject mDefinition,
			EObject tDefinition) {
		_this.registerObjects_BWD(ruleresult, mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum,
				mEnumToTEnum, tEnum, mDefinition, tDefinition);

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
		EObject _localVariable_0 = match.getObject("model");
		EObject _localVariable_1 = match.getObject("tSignature");
		EObject _localVariable_2 = match.getObject("tName");
		EObject _localVariable_3 = match.getObject("tEnum");
		EObject _localVariable_4 = match.getObject("tDefinition");
		EObject tmpModel = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpTEnum = _localVariable_3;
		EObject tmpTDefinition = _localVariable_4;
		if (tmpModel instanceof TypeGraph) {
			TypeGraph model = (TypeGraph) tmpModel;
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tmpTName instanceof TField) {
					TField tName = (TField) tmpTName;
					if (tmpTEnum instanceof TClass) {
						TClass tEnum = (TClass) tmpTEnum;
						if (tmpTDefinition instanceof TFieldDefinition) {
							TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
							return new Object[] { model, tSignature, tName, tEnum, tDefinition, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_12_2_corematch_blackBBBFFBBB(TypeGraph model,
			TFieldSignature tSignature, TField tName, TClass tEnum, TFieldDefinition tDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tEnum, TypeToTAbstractType.class, "target")) {
			Type tmpMEnum = mEnumToTEnum.getSource();
			if (tmpMEnum instanceof EnumDeclaration) {
				EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
				_result.add(new Object[] { model, tSignature, tName, mEnum, mEnumToTEnum, tEnum, tDefinition, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_12_3_findcontext_blackBBBBBBB(TypeGraph model,
			TFieldSignature tSignature, TField tName, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum,
			TClass tEnum, TFieldDefinition tDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (model.getFields().contains(tName)) {
			if (tName.equals(tSignature.getField())) {
				if (tEnum.equals(tSignature.getType())) {
					if (tEnum.equals(mEnumToTEnum.getTarget())) {
						if (model.equals(tEnum.getModel())) {
							if (tEnum.getDefines().contains(tDefinition)) {
								if (mEnum.equals(mEnumToTEnum.getSource())) {
									if (tEnum.getSignature().contains(tSignature)) {
										if (tSignature.equals(tDefinition.getSignature())) {
											_result.add(new Object[] { model, tSignature, tName, mEnum, mEnumToTEnum,
													tEnum, tDefinition });
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

	public static final Object[] pattern_EnumConstant_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFF(TypeGraph model,
			TFieldSignature tSignature, TField tName, EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum,
			TClass tEnum, TFieldDefinition tDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__tEnum____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__mEnum____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tSignature__tEnum____type_name_prime = "type";
		String mEnumToTEnum__tEnum____target_name_prime = "target";
		String tEnum__model____model_name_prime = "model";
		String model__tEnum____ownedTypes_name_prime = "ownedTypes";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String mEnumToTEnum__mEnum____source_name_prime = "source";
		String tEnum__tSignature____signature_name_prime = "signature";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum);
		isApplicableMatch.getAllContextElements().add(tEnum);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tName__model____model);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(tSignature__tEnum____type);
		mEnumToTEnum__tEnum____target.setSrc(mEnumToTEnum);
		mEnumToTEnum__tEnum____target.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__tEnum____target);
		tEnum__model____model.setSrc(tEnum);
		tEnum__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tEnum__model____model);
		model__tEnum____ownedTypes.setSrc(model);
		model__tEnum____ownedTypes.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(model__tEnum____ownedTypes);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(tDefinition__tEnum____definedBy);
		mEnumToTEnum__mEnum____source.setSrc(mEnumToTEnum);
		mEnumToTEnum__mEnum____source.setTrg(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__mEnum____source);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tEnum__tSignature____signature);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		mEnumToTEnum__tEnum____target.setName(mEnumToTEnum__tEnum____target_name_prime);
		tEnum__model____model.setName(tEnum__model____model_name_prime);
		model__tEnum____ownedTypes.setName(model__tEnum____ownedTypes_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		mEnumToTEnum__mEnum____source.setName(mEnumToTEnum__mEnum____source_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		return new Object[] { model, tSignature, tName, mEnum, mEnumToTEnum, tEnum, tDefinition, isApplicableMatch,
				model__tName____fields, tName__model____model, tSignature__tName____field,
				tName__tSignature____signatures, tSignature__tEnum____type, mEnumToTEnum__tEnum____target,
				tEnum__model____model, model__tEnum____ownedTypes, tEnum__tDefinition____defines,
				tDefinition__tEnum____definedBy, mEnumToTEnum__mEnum____source, tEnum__tSignature____signature,
				tDefinition__tSignature____signature, tSignature__tDefinition____definitions };
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_bindingFBBBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, TFieldSignature tSignature, TField tName,
			EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum, TClass tEnum, TFieldDefinition tDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, model, tSignature, tName, mEnum,
				mEnumToTEnum, tEnum, tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, tSignature, tName, mEnum, mEnumToTEnum, tEnum,
					tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, TFieldSignature tSignature, TField tName,
			EnumDeclaration mEnum, TypeToTAbstractType mEnumToTEnum, TClass tEnum, TFieldDefinition tDefinition) {
		Object[] result_pattern_EnumConstant_12_4_solveCSP_binding = pattern_EnumConstant_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, model, tSignature, tName, mEnum, mEnumToTEnum, tEnum, tDefinition);
		if (result_pattern_EnumConstant_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_12_4_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_12_4_solveCSP_black = pattern_EnumConstant_12_4_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, tSignature, tName, mEnum, mEnumToTEnum,
						tEnum, tDefinition };
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

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_0BB(
			TFieldSignature tSignature, TField tName) {
		TField __DEC_tSignature_signatures_597709 = tSignature.getField();
		if (__DEC_tSignature_signatures_597709 != null) {
			if (!tName.equals(__DEC_tSignature_signatures_597709)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_1BB(TField tName,
			TypeGraph model) {
		TypeGraph __DEC_tName_model_217583 = tName.getModel();
		if (__DEC_tName_model_217583 != null) {
			if (!model.equals(__DEC_tName_model_217583)) {
				return new Object[] { tName, model };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_2BB(
			TFieldDefinition tDefinition, TFieldSignature tSignature) {
		TSignature __DEC_tDefinition_definitions_604331 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_604331 != null) {
			if (!tSignature.equals(__DEC_tDefinition_definitions_604331)) {
				return new Object[] { tDefinition, tSignature };
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
					if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_1BB(tName, model) == null) {
						for (TAbstractType tmpTEnum : model.getOwnedTypes()) {
							if (tmpTEnum instanceof TClass) {
								TClass tEnum = (TClass) tmpTEnum;
								for (TFieldSignature tSignature : tName.getSignatures()) {
									if (tEnum.equals(tSignature.getType())) {
										if (tEnum.getSignature().contains(tSignature)) {
											if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_0BB(tSignature,
													tName) == null) {
												for (TMember tmpTDefinition : tEnum.getDefines()) {
													if (tmpTDefinition instanceof TFieldDefinition) {
														TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
														if (tSignature.equals(tDefinition.getSignature())) {
															if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_2BB(
																	tDefinition, tSignature) == null) {
																_result.add(new Object[] { model, tSignature, tName,
																		tEnum, tDefinition, _edge_fields });
															}
														}
													}
												}
											}
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
			EnumConstant _this, Match match, TypeGraph model, TFieldSignature tSignature, TField tName, TClass tEnum,
			TFieldDefinition tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, model, tSignature, tName, tEnum, tDefinition);
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
		MSignature __DEC_mDefinition_mDefinitions_202606 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_202606 != null) {
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
						_result.add(new Object[] { mEnum, mDefinition, _edge_enumConstants });
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
			EnumConstant _this, Match match, EnumDeclaration mEnum, MEnumConstantDeclaration mDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mEnum, mDefinition);
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
		EObject _localVariable_0 = targetMatch.getObject("model");
		EObject _localVariable_1 = targetMatch.getObject("tSignature");
		EObject _localVariable_2 = targetMatch.getObject("tName");
		EObject _localVariable_3 = sourceMatch.getObject("mEnum");
		EObject _localVariable_4 = targetMatch.getObject("tEnum");
		EObject _localVariable_5 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_6 = targetMatch.getObject("tDefinition");
		EObject tmpModel = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTName = _localVariable_2;
		EObject tmpMEnum = _localVariable_3;
		EObject tmpTEnum = _localVariable_4;
		EObject tmpMDefinition = _localVariable_5;
		EObject tmpTDefinition = _localVariable_6;
		if (tmpModel instanceof TypeGraph) {
			TypeGraph model = (TypeGraph) tmpModel;
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tmpTName instanceof TField) {
					TField tName = (TField) tmpTName;
					if (tmpMEnum instanceof EnumDeclaration) {
						EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
						if (tmpTEnum instanceof TClass) {
							TClass tEnum = (TClass) tmpTEnum;
							if (tmpMDefinition instanceof MEnumConstantDeclaration) {
								MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
								if (tmpTDefinition instanceof TFieldDefinition) {
									TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
									return new Object[] { model, tSignature, tName, mEnum, tEnum, mDefinition,
											tDefinition, targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_2_matchsrctrgcontext_blackBBBBBBBBB(TypeGraph model,
			TFieldSignature tSignature, TField tName, EnumDeclaration mEnum, TClass tEnum,
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { model, tSignature, tName, mEnum, tEnum, mDefinition, tDefinition, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding = pattern_EnumConstant_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding != null) {
			TypeGraph model = (TypeGraph) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[0];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[1];
			TField tName = (TField) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[2];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[3];
			TClass tEnum = (TClass) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[4];
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[5];
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_EnumConstant_24_2_matchsrctrgcontext_black = pattern_EnumConstant_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					model, tSignature, tName, mEnum, tEnum, mDefinition, tDefinition, sourceMatch, targetMatch);
			if (result_pattern_EnumConstant_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { model, tSignature, tName, mEnum, tEnum, mDefinition, tDefinition, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_bindingFBBBBBBBBBB(EnumConstant _this,
			TypeGraph model, TFieldSignature tSignature, TField tName, EnumDeclaration mEnum, TClass tEnum,
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(model, tSignature, tName, mEnum, tEnum, mDefinition,
				tDefinition, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, model, tSignature, tName, mEnum, tEnum, mDefinition, tDefinition,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(EnumConstant _this,
			TypeGraph model, TFieldSignature tSignature, TField tName, EnumDeclaration mEnum, TClass tEnum,
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_EnumConstant_24_3_solvecsp_binding = pattern_EnumConstant_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, model, tSignature, tName, mEnum, tEnum, mDefinition, tDefinition, sourceMatch, targetMatch);
		if (result_pattern_EnumConstant_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_24_3_solvecsp_binding[0];

			Object[] result_pattern_EnumConstant_24_3_solvecsp_black = pattern_EnumConstant_24_3_solvecsp_blackB(csp);
			if (result_pattern_EnumConstant_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, model, tSignature, tName, mEnum, tEnum, mDefinition, tDefinition,
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
					.getOppositeReferenceTyped(tEnum, TypeToTAbstractType.class, "target")) {
				if (mEnum.equals(mEnumToTEnum.getSource())) {
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

	public static final Object[] pattern_EnumConstant_24_6_createcorrespondence_blackBBBBBBBB(TypeGraph model,
			TFieldSignature tSignature, TField tName, EnumDeclaration mEnum, TClass tEnum,
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, CCMatch ccMatch) {
		return new Object[] { model, tSignature, tName, mEnum, tEnum, mDefinition, tDefinition, ccMatch };
	}

	public static final Object[] pattern_EnumConstant_24_6_createcorrespondence_greenFFBBB(
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, CCMatch ccMatch) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		mDefinitionToTMember.setSource(mDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mDefinitionToTMember);
		return new Object[] { mBodyToTAnnotation, mDefinitionToTMember, mDefinition, tDefinition, ccMatch };
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
		MSignature __DEC_mDefinition_mDefinitions_884972 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_884972 != null) {
			return new Object[] { mDefinition };
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_27_1_matchtggpattern_blackBB(EnumDeclaration mEnum,
			MEnumConstantDeclaration mDefinition) {
		if (mEnum.getEnumConstants().contains(mDefinition)) {
			if (pattern_EnumConstant_27_1_matchtggpattern_black_nac_0B(mDefinition) == null) {
				return new Object[] { mEnum, mDefinition };
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

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_0BB(TFieldSignature tSignature,
			TField tName) {
		TField __DEC_tSignature_signatures_222583 = tSignature.getField();
		if (__DEC_tSignature_signatures_222583 != null) {
			if (!tName.equals(__DEC_tSignature_signatures_222583)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_1BB(TField tName,
			TypeGraph model) {
		TypeGraph __DEC_tName_model_189503 = tName.getModel();
		if (__DEC_tName_model_189503 != null) {
			if (!model.equals(__DEC_tName_model_189503)) {
				return new Object[] { tName, model };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_2BB(TFieldDefinition tDefinition,
			TFieldSignature tSignature) {
		TSignature __DEC_tDefinition_definitions_317893 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_317893 != null) {
			if (!tSignature.equals(__DEC_tDefinition_definitions_317893)) {
				return new Object[] { tDefinition, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_blackBBBBB(TypeGraph model,
			TFieldSignature tSignature, TField tName, TClass tEnum, TFieldDefinition tDefinition) {
		if (model.getFields().contains(tName)) {
			if (tName.equals(tSignature.getField())) {
				if (tEnum.equals(tSignature.getType())) {
					if (model.equals(tEnum.getModel())) {
						if (tEnum.getDefines().contains(tDefinition)) {
							if (tEnum.getSignature().contains(tSignature)) {
								if (tSignature.equals(tDefinition.getSignature())) {
									if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_0BB(tSignature,
											tName) == null) {
										if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_1BB(tName,
												model) == null) {
											if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_2BB(tDefinition,
													tSignature) == null) {
												return new Object[] { model, tSignature, tName, tEnum, tDefinition };
											}
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

	public static final Object[] pattern_EnumConstant_29_6_perform_greenFBFFFBBFFBB(TypeGraph model,
			EnumDeclaration mEnum, TClass tEnum, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		TField tName = BasicFactory.eINSTANCE.createTField();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MEnumConstantDeclaration mDefinition = ModiscoFactory.eINSTANCE.createMEnumConstantDeclaration();
		TFieldDefinition tDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		Object _localVariable_0 = csp.getValue("tName", "tName");
		Object _localVariable_1 = csp.getValue("mDefinition", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		tSignature.setType(tEnum);
		tEnum.getSignature().add(tSignature);
		ruleResult.getTargetObjects().add(tSignature);
		model.getFields().add(tName);
		tSignature.setField(tName);
		ruleResult.getTargetObjects().add(tName);
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		mEnum.getEnumConstants().add(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		ruleResult.getSourceObjects().add(mDefinition);
		tEnum.getDefines().add(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		tDefinition.setSignature(tSignature);
		ruleResult.getTargetObjects().add(tDefinition);
		String tName_tName_prime = (String) _localVariable_0;
		String mDefinition_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tName.setTName(tName_tName_prime);
		mDefinition.setName(mDefinition_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mBodyToTAnnotation, model, tSignature, tName, mDefinitionToTMember, mEnum, tEnum,
				mDefinition, tDefinition, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EnumConstant_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnumConstantImpl
