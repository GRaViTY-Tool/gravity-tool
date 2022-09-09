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
		TypeGraph model = (TypeGraph) result1_bindingAndBlack[0];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result1_bindingAndBlack[1];
		TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result1_bindingAndBlack[2];
		TClass tEnum = (TClass) result1_bindingAndBlack[3];
		EnumDeclaration mEnum = (EnumDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = EnumConstantImpl.pattern_EnumConstant_1_1_performtransformation_greenFBBFBFFFB(model,
				mDefinition, tEnum, csp);
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[0];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[3];
		TFieldDefinition tDefinition = (TFieldDefinition) result1_green[5];
		TFieldSignature tSignature = (TFieldSignature) result1_green[6];
		TField tName = (TField) result1_green[7];

		Object[] result2_black = EnumConstantImpl.pattern_EnumConstant_1_2_collecttranslatedelements_blackBBBBBB(
				mBodyToTAnnotation, mDefinition, mDefinitionToTMember, tDefinition, tSignature, tName);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[mDefinition] = " + mDefinition + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = "
					+ tSignature + ", " + "[tName] = " + tName + ".");
		}
		Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_1_2_collecttranslatedelements_greenFBBBBBB(
				mBodyToTAnnotation, mDefinition, mDefinitionToTMember, tDefinition, tSignature, tName);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumConstantImpl.pattern_EnumConstant_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember, mEnumToTEnum, tEnum, mEnum,
				tDefinition, tSignature, tName);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[model] = " + model + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember
					+ ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = " + tEnum + ", " + "[mEnum] = "
					+ mEnum + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tName] = " + tName + ".");
		}
		EnumConstantImpl.pattern_EnumConstant_1_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult,
				mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember, tEnum, mEnum, tDefinition, tSignature,
				tName);
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[24];

		// 
		// 
		EnumConstantImpl.pattern_EnumConstant_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember, mEnumToTEnum, tEnum, mEnum, tDefinition,
				tSignature, tName);
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
		for (Object[] result2_black : EnumConstantImpl.pattern_EnumConstant_2_2_corematch_blackBFFBB(mDefinition, mEnum,
				match)) {
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result2_black[1];
			TClass tEnum = (TClass) result2_black[2];
			// ForEach 
			for (Object[] result3_black : EnumConstantImpl.pattern_EnumConstant_2_3_findcontext_blackFBBBB(mDefinition,
					mEnumToTEnum, tEnum, mEnum)) {
				TypeGraph model = (TypeGraph) result3_black[0];
				Object[] result3_green = EnumConstantImpl.pattern_EnumConstant_2_3_findcontext_greenBBBBBFFFFFF(model,
						mDefinition, mEnumToTEnum, tEnum, mEnum);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge mEnumToTEnum__mEnum____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mEnumToTEnum__tEnum____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge model__tEnum____ownedTypes = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = EnumConstantImpl
						.pattern_EnumConstant_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, model,
								mDefinition, mEnumToTEnum, tEnum, mEnum);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", "
							+ "[tEnum] = " + tEnum + ", " + "[mEnum] = " + mEnum + ".");
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeGraph model,
			MEnumConstantDeclaration mDefinition, TypeToTAbstractType mEnumToTEnum, TClass tEnum,
			EnumDeclaration mEnum) {// Create CSP
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
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("mEnum", mEnum);
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
			EObject mDefinition, EObject mDefinitionToTMember, EObject mEnumToTEnum, EObject tEnum, EObject mEnum,
			EObject tDefinition, EObject tSignature, EObject tName) {
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mEnumToTEnum", mEnumToTEnum);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("mEnum", mEnum);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tName", tName);

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
	public boolean isAppropriate_BWD(Match match, TypeGraph model, TClass tEnum, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName) {

		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_10_1_initialbindings_blackBBBBBBB(this, match,
				model, tEnum, tDefinition, tSignature, tName);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[model] = " + model + ", " + "[tEnum] = " + tEnum + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ".");
		}

		Object[] result2_bindingAndBlack = EnumConstantImpl.pattern_EnumConstant_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
				this, match, model, tEnum, tDefinition, tSignature, tName);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[model] = " + model + ", " + "[tEnum] = " + tEnum + ", " + "[tDefinition] = "
							+ tDefinition + ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (EnumConstantImpl.pattern_EnumConstant_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = EnumConstantImpl
					.pattern_EnumConstant_10_4_collectelementstobetranslated_blackBBBBBB(match, model, tEnum,
							tDefinition, tSignature, tName);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[tEnum] = " + tEnum + ", " + "[tDefinition] = " + tDefinition
						+ ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(match, model,
					tEnum, tDefinition, tSignature, tName);
			//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result4_green[15];

			Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_10_5_collectcontextelements_blackBBBBBB(
					match, model, tEnum, tDefinition, tSignature, tName);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[model] = " + model + ", " + "[tEnum] = " + tEnum + ", " + "[tDefinition] = " + tDefinition
						+ ", " + "[tSignature] = " + tSignature + ", " + "[tName] = " + tName + ".");
			}
			EnumConstantImpl.pattern_EnumConstant_10_5_collectcontextelements_greenBBBFF(match, model, tEnum);
			//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge model__tEnum____ownedTypes = (EMoflonEdge) result5_green[4];

			// 
			EnumConstantImpl.pattern_EnumConstant_10_6_registerobjectstomatch_expressionBBBBBBB(this, match, model,
					tEnum, tDefinition, tSignature, tName);
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
		TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result1_bindingAndBlack[1];
		TClass tEnum = (TClass) result1_bindingAndBlack[2];
		EnumDeclaration mEnum = (EnumDeclaration) result1_bindingAndBlack[3];
		TFieldDefinition tDefinition = (TFieldDefinition) result1_bindingAndBlack[4];
		TFieldSignature tSignature = (TFieldSignature) result1_bindingAndBlack[5];
		TField tName = (TField) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = EnumConstantImpl.pattern_EnumConstant_11_1_performtransformation_greenFFFBBB(mEnum,
				tDefinition, csp);
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[0];
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result1_green[1];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[2];

		Object[] result2_black = EnumConstantImpl.pattern_EnumConstant_11_2_collecttranslatedelements_blackBBBBBB(
				mBodyToTAnnotation, mDefinition, mDefinitionToTMember, tDefinition, tSignature, tName);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mBodyToTAnnotation] = "
					+ mBodyToTAnnotation + ", " + "[mDefinition] = " + mDefinition + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = "
					+ tSignature + ", " + "[tName] = " + tName + ".");
		}
		Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_11_2_collecttranslatedelements_greenFBBBBBB(
				mBodyToTAnnotation, mDefinition, mDefinitionToTMember, tDefinition, tSignature, tName);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = EnumConstantImpl.pattern_EnumConstant_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
				ruleresult, mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember, mEnumToTEnum, tEnum, mEnum,
				tDefinition, tSignature, tName);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[model] = " + model + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember
					+ ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = " + tEnum + ", " + "[mEnum] = "
					+ mEnum + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tName] = " + tName + ".");
		}
		EnumConstantImpl.pattern_EnumConstant_11_3_bookkeepingforedges_greenBBBBBBBBBBFFFFFFFFFFFFFFF(ruleresult,
				mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember, tEnum, mEnum, tDefinition, tSignature,
				tName);
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge mEnum__mDefinition____enumConstants = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[24];

		// 
		// 
		EnumConstantImpl.pattern_EnumConstant_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
				mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember, mEnumToTEnum, tEnum, mEnum, tDefinition,
				tSignature, tName);
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
		TClass tEnum = (TClass) result2_binding[1];
		TFieldDefinition tDefinition = (TFieldDefinition) result2_binding[2];
		TFieldSignature tSignature = (TFieldSignature) result2_binding[3];
		TField tName = (TField) result2_binding[4];
		for (Object[] result2_black : EnumConstantImpl.pattern_EnumConstant_12_2_corematch_blackBFBFBBBB(model, tEnum,
				tDefinition, tSignature, tName, match)) {
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result2_black[1];
			EnumDeclaration mEnum = (EnumDeclaration) result2_black[3];
			// ForEach 
			for (Object[] result3_black : EnumConstantImpl.pattern_EnumConstant_12_3_findcontext_blackBBBBBBB(model,
					mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature, tName)) {
				Object[] result3_green = EnumConstantImpl
						.pattern_EnumConstant_12_3_findcontext_greenBBBBBBBFFFFFFFFFFFFFFF(model, mEnumToTEnum, tEnum,
								mEnum, tDefinition, tSignature, tName);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tEnum__tSignature____signature = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tEnum__tDefinition____defines = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tDefinition__tEnum____definedBy = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge model__tName____fields = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tName__model____model = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mEnumToTEnum__mEnum____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tSignature__tName____field = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge mEnumToTEnum__tEnum____target = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tSignature__tEnum____type = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tEnum__model____model = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge model__tEnum____ownedTypes = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = EnumConstantImpl
						.pattern_EnumConstant_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, model,
								mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature, tName);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
							+ "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = " + tEnum + ", " + "[mEnum] = "
							+ mEnum + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature
							+ ", " + "[tName] = " + tName + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TypeGraph model, TClass tEnum, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName) {
		match.registerObject("model", model);
		match.registerObject("tEnum", tEnum);
		match.registerObject("tDefinition", tDefinition);
		match.registerObject("tSignature", tSignature);
		match.registerObject("tName", tName);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph model, TClass tEnum, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName) {// Create CSP
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
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumDeclaration mEnum, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName) {// Create CSP
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
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("mEnum", mEnum);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tName", tName);
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
			EObject mDefinition, EObject mDefinitionToTMember, EObject mEnumToTEnum, EObject tEnum, EObject mEnum,
			EObject tDefinition, EObject tSignature, EObject tName) {
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("mEnumToTEnum", mEnumToTEnum);
		ruleresult.registerObject("tEnum", tEnum);
		ruleresult.registerObject("mEnum", mEnum);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tName", tName);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_29(EMoflonEdge _edge_signature) {

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
				.pattern_EnumConstant_20_2_testcorematchandDECs_blackFFFFFB(_edge_signature)) {
			TypeGraph model = (TypeGraph) result2_black[0];
			TClass tEnum = (TClass) result2_black[1];
			TFieldDefinition tDefinition = (TFieldDefinition) result2_black[2];
			TFieldSignature tSignature = (TFieldSignature) result2_black[3];
			TField tName = (TField) result2_black[4];
			Object[] result2_green = EnumConstantImpl.pattern_EnumConstant_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (EnumConstantImpl.pattern_EnumConstant_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
					this, match, model, tEnum, tDefinition, tSignature, tName)) {
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
		MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result2_bindingAndBlack[1];
		TClass tEnum = (TClass) result2_bindingAndBlack[2];
		EnumDeclaration mEnum = (EnumDeclaration) result2_bindingAndBlack[3];
		TFieldDefinition tDefinition = (TFieldDefinition) result2_bindingAndBlack[4];
		TFieldSignature tSignature = (TFieldSignature) result2_bindingAndBlack[5];
		TField tName = (TField) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = EnumConstantImpl
				.pattern_EnumConstant_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, model, mDefinition, tEnum, mEnum,
						tDefinition, tSignature, tName, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[model] = " + model + ", " + "[mDefinition] = " + mDefinition + ", " + "[tEnum] = " + tEnum
					+ ", " + "[mEnum] = " + mEnum + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = "
					+ tSignature + ", " + "[tName] = " + tName + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (EnumConstantImpl.pattern_EnumConstant_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : EnumConstantImpl.pattern_EnumConstant_24_5_matchcorrcontext_blackFBBBB(tEnum,
					mEnum, sourceMatch, targetMatch)) {
				TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result5_black[0];
				Object[] result5_green = EnumConstantImpl
						.pattern_EnumConstant_24_5_matchcorrcontext_greenBBBF(mEnumToTEnum, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = EnumConstantImpl.pattern_EnumConstant_24_6_createcorrespondence_blackBBBBBBBB(
						model, mDefinition, tEnum, mEnum, tDefinition, tSignature, tName, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[tEnum] = " + tEnum + ", " + "[mEnum] = "
							+ mEnum + ", " + "[tDefinition] = " + tDefinition + ", " + "[tSignature] = " + tSignature
							+ ", " + "[tName] = " + tName + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				EnumConstantImpl.pattern_EnumConstant_24_6_createcorrespondence_greenFBFBB(mDefinition, tDefinition,
						ccMatch);
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[0];
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
	public CSP isApplicable_solveCsp_CC(TypeGraph model, MEnumConstantDeclaration mDefinition, TClass tEnum,
			EnumDeclaration mEnum, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName,
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
	public boolean checkDEC_BWD(TypeGraph model, TClass tEnum, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName) {// 
		Object[] result1_black = EnumConstantImpl.pattern_EnumConstant_28_1_matchtggpattern_blackBBBBB(model, tEnum,
				tDefinition, tSignature, tName);
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
					.pattern_EnumConstant_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, model,
							mEnumToTEnum, tEnum, mEnum, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
						+ "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = " + tEnum + ", " + "[mEnum] = " + mEnum
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (EnumConstantImpl.pattern_EnumConstant_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = EnumConstantImpl.pattern_EnumConstant_29_5_checknacs_blackBBBB(model,
						mEnumToTEnum, tEnum, mEnum);
				if (result5_black != null) {

					Object[] result6_black = EnumConstantImpl.pattern_EnumConstant_29_6_perform_blackBBBBB(model,
							mEnumToTEnum, tEnum, mEnum, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model
								+ ", " + "[mEnumToTEnum] = " + mEnumToTEnum + ", " + "[tEnum] = " + tEnum + ", "
								+ "[mEnum] = " + mEnum + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					EnumConstantImpl.pattern_EnumConstant_29_6_perform_greenFBFFBBFFFBB(model, tEnum, mEnum, ruleResult,
							csp);
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[0];
					//nothing MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result6_green[2];
					//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[3];
					//nothing TFieldDefinition tDefinition = (TFieldDefinition) result6_green[6];
					//nothing TFieldSignature tSignature = (TFieldSignature) result6_green[7];
					//nothing TField tName = (TField) result6_green[8];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph model,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumDeclaration mEnum,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("mEnumToTEnum", mEnumToTEnum);
		isApplicableMatch.registerObject("tEnum", tEnum);
		isApplicableMatch.registerObject("mEnum", mEnum);
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
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEGRAPH_MENUMCONSTANTDECLARATION_TYPETOTABSTRACTTYPE_TCLASS_ENUMDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(MEnumConstantDeclaration) arguments.get(2), (TypeToTAbstractType) arguments.get(3),
					(TClass) arguments.get(4), (EnumDeclaration) arguments.get(5));
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
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TCLASS_TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1), (TClass) arguments.get(2),
					(TFieldDefinition) arguments.get(3), (TFieldSignature) arguments.get(4), (TField) arguments.get(5));
		case RulesPackage.ENUM_CONSTANT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TCLASS_TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2), (TFieldDefinition) arguments.get(3), (TFieldSignature) arguments.get(4),
					(TField) arguments.get(5));
			return null;
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TCLASS_TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2), (TFieldDefinition) arguments.get(3), (TFieldSignature) arguments.get(4),
					(TField) arguments.get(5));
		case RulesPackage.ENUM_CONSTANT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TYPETOTABSTRACTTYPE_TCLASS_ENUMDECLARATION_TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TClass) arguments.get(3),
					(EnumDeclaration) arguments.get(4), (TFieldDefinition) arguments.get(5),
					(TFieldSignature) arguments.get(6), (TField) arguments.get(7));
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
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_MENUMCONSTANTDECLARATION_TCLASS_ENUMDECLARATION_TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TypeGraph) arguments.get(0), (MEnumConstantDeclaration) arguments.get(1),
					(TClass) arguments.get(2), (EnumDeclaration) arguments.get(3), (TFieldDefinition) arguments.get(4),
					(TFieldSignature) arguments.get(5), (TField) arguments.get(6), (Match) arguments.get(7),
					(Match) arguments.get(8));
		case RulesPackage.ENUM_CONSTANT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ENUM_CONSTANT___CHECK_DEC_FWD__MENUMCONSTANTDECLARATION_ENUMDECLARATION:
			return checkDEC_FWD((MEnumConstantDeclaration) arguments.get(0), (EnumDeclaration) arguments.get(1));
		case RulesPackage.ENUM_CONSTANT___CHECK_DEC_BWD__TYPEGRAPH_TCLASS_TFIELDDEFINITION_TFIELDSIGNATURE_TFIELD:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TClass) arguments.get(1),
					(TFieldDefinition) arguments.get(2), (TFieldSignature) arguments.get(3), (TField) arguments.get(4));
		case RulesPackage.ENUM_CONSTANT___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.ENUM_CONSTANT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TYPETOTABSTRACTTYPE_TCLASS_ENUMDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (TClass) arguments.get(3),
					(EnumDeclaration) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
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
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject _localVariable_1 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_2 = isApplicableMatch.getObject("mEnumToTEnum");
		EObject _localVariable_3 = isApplicableMatch.getObject("tEnum");
		EObject _localVariable_4 = isApplicableMatch.getObject("mEnum");
		EObject tmpModel = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMEnumToTEnum = _localVariable_2;
		EObject tmpTEnum = _localVariable_3;
		EObject tmpMEnum = _localVariable_4;
		if (tmpModel instanceof TypeGraph) {
			TypeGraph model = (TypeGraph) tmpModel;
			if (tmpMDefinition instanceof MEnumConstantDeclaration) {
				MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
				if (tmpMEnumToTEnum instanceof TypeToTAbstractType) {
					TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) tmpMEnumToTEnum;
					if (tmpTEnum instanceof TClass) {
						TClass tEnum = (TClass) tmpTEnum;
						if (tmpMEnum instanceof EnumDeclaration) {
							EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
							return new Object[] { model, mDefinition, mEnumToTEnum, tEnum, mEnum, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_blackBBBBBFBB(TypeGraph model,
			MEnumConstantDeclaration mDefinition, TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumDeclaration mEnum,
			EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { model, mDefinition, mEnumToTEnum, tEnum, mEnum, csp, _this, isApplicableMatch };
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
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result_pattern_EnumConstant_1_1_performtransformation_binding[1];
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result_pattern_EnumConstant_1_1_performtransformation_binding[2];
			TClass tEnum = (TClass) result_pattern_EnumConstant_1_1_performtransformation_binding[3];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_1_1_performtransformation_binding[4];

			Object[] result_pattern_EnumConstant_1_1_performtransformation_black = pattern_EnumConstant_1_1_performtransformation_blackBBBBBFBB(
					model, mDefinition, mEnumToTEnum, tEnum, mEnum, _this, isApplicableMatch);
			if (result_pattern_EnumConstant_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumConstant_1_1_performtransformation_black[5];

				return new Object[] { model, mDefinition, mEnumToTEnum, tEnum, mEnum, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_1_1_performtransformation_greenFBBFBFFFB(TypeGraph model,
			MEnumConstantDeclaration mDefinition, TClass tEnum, CSP csp) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TFieldDefinition tDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		TField tName = BasicFactory.eINSTANCE.createTField();
		Object _localVariable_0 = csp.getValue("tName", "tName");
		mBodyToTAnnotation.setSource(mDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		tEnum.getDefines().add(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		tEnum.getSignature().add(tSignature);
		tDefinition.setSignature(tSignature);
		tSignature.setType(tEnum);
		model.getFields().add(tName);
		tSignature.setField(tName);
		String tName_tName_prime = (String) _localVariable_0;
		tName.setTName(tName_tName_prime);
		return new Object[] { mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember, tEnum, tDefinition,
				tSignature, tName, csp };
	}

	public static final Object[] pattern_EnumConstant_1_2_collecttranslatedelements_blackBBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation, MEnumConstantDeclaration mDefinition,
			MDefinitionToTMember mDefinitionToTMember, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName) {
		return new Object[] { mBodyToTAnnotation, mDefinition, mDefinitionToTMember, tDefinition, tSignature, tName };
	}

	public static final Object[] pattern_EnumConstant_1_2_collecttranslatedelements_greenFBBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation, MEnumConstantDeclaration mDefinition,
			MDefinitionToTMember mDefinitionToTMember, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getTranslatedElements().add(mDefinition);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedElements().add(tDefinition);
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedElements().add(tName);
		return new Object[] { ruleresult, mBodyToTAnnotation, mDefinition, mDefinitionToTMember, tDefinition,
				tSignature, tName };
	}

	public static final Object[] pattern_EnumConstant_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject mDefinition,
			EObject mDefinitionToTMember, EObject mEnumToTEnum, EObject tEnum, EObject mEnum, EObject tDefinition,
			EObject tSignature, EObject tName) {
		if (!mBodyToTAnnotation.equals(model)) {
			if (!mBodyToTAnnotation.equals(mDefinition)) {
				if (!mBodyToTAnnotation.equals(mDefinitionToTMember)) {
					if (!mBodyToTAnnotation.equals(mEnumToTEnum)) {
						if (!mBodyToTAnnotation.equals(tEnum)) {
							if (!mBodyToTAnnotation.equals(mEnum)) {
								if (!mBodyToTAnnotation.equals(tDefinition)) {
									if (!mBodyToTAnnotation.equals(tSignature)) {
										if (!mBodyToTAnnotation.equals(tName)) {
											if (!model.equals(tEnum)) {
												if (!model.equals(tDefinition)) {
													if (!model.equals(tSignature)) {
														if (!model.equals(tName)) {
															if (!mDefinition.equals(model)) {
																if (!mDefinition.equals(mDefinitionToTMember)) {
																	if (!mDefinition.equals(mEnumToTEnum)) {
																		if (!mDefinition.equals(tEnum)) {
																			if (!mDefinition.equals(mEnum)) {
																				if (!mDefinition.equals(tDefinition)) {
																					if (!mDefinition
																							.equals(tSignature)) {
																						if (!mDefinition
																								.equals(tName)) {
																							if (!mDefinitionToTMember
																									.equals(model)) {
																								if (!mDefinitionToTMember
																										.equals(mEnumToTEnum)) {
																									if (!mDefinitionToTMember
																											.equals(tEnum)) {
																										if (!mDefinitionToTMember
																												.equals(mEnum)) {
																											if (!mDefinitionToTMember
																													.equals(tDefinition)) {
																												if (!mDefinitionToTMember
																														.equals(tSignature)) {
																													if (!mDefinitionToTMember
																															.equals(tName)) {
																														if (!mEnumToTEnum
																																.equals(model)) {
																															if (!mEnumToTEnum
																																	.equals(tEnum)) {
																																if (!mEnumToTEnum
																																		.equals(tDefinition)) {
																																	if (!mEnumToTEnum
																																			.equals(tSignature)) {
																																		if (!mEnumToTEnum
																																				.equals(tName)) {
																																			if (!tEnum
																																					.equals(tSignature)) {
																																				if (!tEnum
																																						.equals(tName)) {
																																					if (!mEnum
																																							.equals(model)) {
																																						if (!mEnum
																																								.equals(mEnumToTEnum)) {
																																							if (!mEnum
																																									.equals(tEnum)) {
																																								if (!mEnum
																																										.equals(tDefinition)) {
																																									if (!mEnum
																																											.equals(tSignature)) {
																																										if (!mEnum
																																												.equals(tName)) {
																																											if (!tDefinition
																																													.equals(tEnum)) {
																																												if (!tDefinition
																																														.equals(tSignature)) {
																																													if (!tDefinition
																																															.equals(tName)) {
																																														if (!tName
																																																.equals(tSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mBodyToTAnnotation,
																																																	model,
																																																	mDefinition,
																																																	mDefinitionToTMember,
																																																	mEnumToTEnum,
																																																	tEnum,
																																																	mEnum,
																																																	tDefinition,
																																																	tSignature,
																																																	tName };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject mDefinition,
			EObject mDefinitionToTMember, EObject tEnum, EObject mEnum, EObject tDefinition, EObject tSignature,
			EObject tName) {
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumConstant";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String tEnum__tSignature____signature_name_prime = "signature";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String tSignature__tEnum____type_name_prime = "type";
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tEnum__tSignature____signature);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		ruleresult.getCreatedEdges().add(tDefinition__tEnum____definedBy);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		ruleresult.getCreatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		ruleresult.getCreatedEdges().add(tName__model____model);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tSignature__tDefinition____definitions);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mEnum__mDefinition____enumConstants);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		ruleresult.getCreatedEdges().add(tSignature__tEnum____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		return new Object[] { ruleresult, mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember, tEnum, mEnum,
				tDefinition, tSignature, tName, mBodyToTAnnotation__mDefinition____source,
				mDefinitionToTMember__mDefinition____source, tEnum__tSignature____signature,
				tEnum__tDefinition____defines, tDefinition__tEnum____definedBy, model__tName____fields,
				tName__model____model, mBodyToTAnnotation__tDefinition____target, tSignature__tName____field,
				tName__tSignature____signatures, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions, mEnum__mDefinition____enumConstants,
				mDefinitionToTMember__tDefinition____target, tSignature__tEnum____type };
	}

	public static final void pattern_EnumConstant_1_5_registerobjects_expressionBBBBBBBBBBBB(EnumConstant _this,
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject mDefinition,
			EObject mDefinitionToTMember, EObject mEnumToTEnum, EObject tEnum, EObject mEnum, EObject tDefinition,
			EObject tSignature, EObject tName) {
		_this.registerObjects_FWD(ruleresult, mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember,
				mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature, tName);

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

	public static final Iterable<Object[]> pattern_EnumConstant_2_2_corematch_blackBFFBB(
			MEnumConstantDeclaration mDefinition, EnumDeclaration mEnum, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mEnum, TypeToTAbstractType.class, "source")) {
			TAbstractType tmpTEnum = mEnumToTEnum.getTarget();
			if (tmpTEnum instanceof TClass) {
				TClass tEnum = (TClass) tmpTEnum;
				_result.add(new Object[] { mDefinition, mEnumToTEnum, tEnum, mEnum, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_2_3_findcontext_blackFBBBB(
			MEnumConstantDeclaration mDefinition, TypeToTAbstractType mEnumToTEnum, TClass tEnum,
			EnumDeclaration mEnum) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mEnum.equals(mEnumToTEnum.getSource())) {
			if (tEnum.equals(mEnumToTEnum.getTarget())) {
				if (mEnum.getEnumConstants().contains(mDefinition)) {
					TypeGraph model = tEnum.getModel();
					if (model != null) {
						_result.add(new Object[] { model, mDefinition, mEnumToTEnum, tEnum, mEnum });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_EnumConstant_2_3_findcontext_greenBBBBBFFFFFF(TypeGraph model,
			MEnumConstantDeclaration mDefinition, TypeToTAbstractType mEnumToTEnum, TClass tEnum,
			EnumDeclaration mEnum) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mEnumToTEnum__mEnum____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__tEnum____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mEnumToTEnum__mEnum____source_name_prime = "source";
		String mEnumToTEnum__tEnum____target_name_prime = "target";
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String tEnum__model____model_name_prime = "model";
		String model__tEnum____ownedTypes_name_prime = "ownedTypes";
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum);
		isApplicableMatch.getAllContextElements().add(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnum);
		mEnumToTEnum__mEnum____source.setSrc(mEnumToTEnum);
		mEnumToTEnum__mEnum____source.setTrg(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__mEnum____source);
		mEnumToTEnum__tEnum____target.setSrc(mEnumToTEnum);
		mEnumToTEnum__tEnum____target.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__tEnum____target);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mEnum__mDefinition____enumConstants);
		tEnum__model____model.setSrc(tEnum);
		tEnum__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tEnum__model____model);
		model__tEnum____ownedTypes.setSrc(model);
		model__tEnum____ownedTypes.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(model__tEnum____ownedTypes);
		mEnumToTEnum__mEnum____source.setName(mEnumToTEnum__mEnum____source_name_prime);
		mEnumToTEnum__tEnum____target.setName(mEnumToTEnum__tEnum____target_name_prime);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		tEnum__model____model.setName(tEnum__model____model_name_prime);
		model__tEnum____ownedTypes.setName(model__tEnum____ownedTypes_name_prime);
		return new Object[] { model, mDefinition, mEnumToTEnum, tEnum, mEnum, isApplicableMatch,
				mEnumToTEnum__mEnum____source, mEnumToTEnum__tEnum____target, mEnum__mDefinition____enumConstants,
				tEnum__model____model, model__tEnum____ownedTypes };
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_bindingFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, MEnumConstantDeclaration mDefinition,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumDeclaration mEnum) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, model, mDefinition, mEnumToTEnum,
				tEnum, mEnum);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, mDefinition, mEnumToTEnum, tEnum, mEnum };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_2_4_solveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, MEnumConstantDeclaration mDefinition,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumDeclaration mEnum) {
		Object[] result_pattern_EnumConstant_2_4_solveCSP_binding = pattern_EnumConstant_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, model, mDefinition, mEnumToTEnum, tEnum, mEnum);
		if (result_pattern_EnumConstant_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_2_4_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_2_4_solveCSP_black = pattern_EnumConstant_2_4_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, mDefinition, mEnumToTEnum, tEnum, mEnum };
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
			TypeGraph model, TClass tEnum, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName) {
		return new Object[] { _this, match, model, tEnum, tDefinition, tSignature, tName };
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_bindingFBBBBBBB(EnumConstant _this, Match match,
			TypeGraph model, TClass tEnum, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, model, tEnum, tDefinition, tSignature, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, model, tEnum, tDefinition, tSignature, tName };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_10_2_SolveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			Match match, TypeGraph model, TClass tEnum, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName) {
		Object[] result_pattern_EnumConstant_10_2_SolveCSP_binding = pattern_EnumConstant_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, model, tEnum, tDefinition, tSignature, tName);
		if (result_pattern_EnumConstant_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_10_2_SolveCSP_binding[0];

			Object[] result_pattern_EnumConstant_10_2_SolveCSP_black = pattern_EnumConstant_10_2_SolveCSP_blackB(csp);
			if (result_pattern_EnumConstant_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, model, tEnum, tDefinition, tSignature, tName };
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
			TypeGraph model, TClass tEnum, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName) {
		return new Object[] { match, model, tEnum, tDefinition, tSignature, tName };
	}

	public static final Object[] pattern_EnumConstant_10_4_collectelementstobetranslated_greenBBBBBBFFFFFFFFFF(
			Match match, TypeGraph model, TClass tEnum, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName) {
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tDefinition);
		match.getToBeTranslatedNodes().add(tSignature);
		match.getToBeTranslatedNodes().add(tName);
		String tEnum__tSignature____signature_name_prime = "signature";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String tSignature__tEnum____type_name_prime = "type";
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tEnum__tSignature____signature);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		match.getToBeTranslatedEdges().add(tDefinition__tEnum____definedBy);
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
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tSignature__tDefinition____definitions);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		match.getToBeTranslatedEdges().add(tSignature__tEnum____type);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		return new Object[] { match, model, tEnum, tDefinition, tSignature, tName, tEnum__tSignature____signature,
				tEnum__tDefinition____defines, tDefinition__tEnum____definedBy, model__tName____fields,
				tName__model____model, tSignature__tName____field, tName__tSignature____signatures,
				tDefinition__tSignature____signature, tSignature__tDefinition____definitions,
				tSignature__tEnum____type };
	}

	public static final Object[] pattern_EnumConstant_10_5_collectcontextelements_blackBBBBBB(Match match,
			TypeGraph model, TClass tEnum, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName) {
		return new Object[] { match, model, tEnum, tDefinition, tSignature, tName };
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
			Match match, TypeGraph model, TClass tEnum, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName) {
		_this.registerObjectsToMatch_BWD(match, model, tEnum, tDefinition, tSignature, tName);

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
		EObject _localVariable_1 = isApplicableMatch.getObject("mEnumToTEnum");
		EObject _localVariable_2 = isApplicableMatch.getObject("tEnum");
		EObject _localVariable_3 = isApplicableMatch.getObject("mEnum");
		EObject _localVariable_4 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_5 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_6 = isApplicableMatch.getObject("tName");
		EObject tmpModel = _localVariable_0;
		EObject tmpMEnumToTEnum = _localVariable_1;
		EObject tmpTEnum = _localVariable_2;
		EObject tmpMEnum = _localVariable_3;
		EObject tmpTDefinition = _localVariable_4;
		EObject tmpTSignature = _localVariable_5;
		EObject tmpTName = _localVariable_6;
		if (tmpModel instanceof TypeGraph) {
			TypeGraph model = (TypeGraph) tmpModel;
			if (tmpMEnumToTEnum instanceof TypeToTAbstractType) {
				TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) tmpMEnumToTEnum;
				if (tmpTEnum instanceof TClass) {
					TClass tEnum = (TClass) tmpTEnum;
					if (tmpMEnum instanceof EnumDeclaration) {
						EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
						if (tmpTDefinition instanceof TFieldDefinition) {
							TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
							if (tmpTSignature instanceof TFieldSignature) {
								TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
								if (tmpTName instanceof TField) {
									TField tName = (TField) tmpTName;
									return new Object[] { model, mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature,
											tName, isApplicableMatch };
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
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumDeclaration mEnum, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName, EnumConstant _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { model, mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature, tName, csp, _this,
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
			TypeToTAbstractType mEnumToTEnum = (TypeToTAbstractType) result_pattern_EnumConstant_11_1_performtransformation_binding[1];
			TClass tEnum = (TClass) result_pattern_EnumConstant_11_1_performtransformation_binding[2];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_11_1_performtransformation_binding[3];
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_EnumConstant_11_1_performtransformation_binding[4];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_EnumConstant_11_1_performtransformation_binding[5];
			TField tName = (TField) result_pattern_EnumConstant_11_1_performtransformation_binding[6];

			Object[] result_pattern_EnumConstant_11_1_performtransformation_black = pattern_EnumConstant_11_1_performtransformation_blackBBBBBBBFBB(
					model, mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature, tName, _this, isApplicableMatch);
			if (result_pattern_EnumConstant_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_EnumConstant_11_1_performtransformation_black[7];

				return new Object[] { model, mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature, tName, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_11_1_performtransformation_greenFFFBBB(EnumDeclaration mEnum,
			TFieldDefinition tDefinition, CSP csp) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MEnumConstantDeclaration mDefinition = ModiscoFactory.eINSTANCE.createMEnumConstantDeclaration();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		Object _localVariable_0 = csp.getValue("mDefinition", "name");
		mBodyToTAnnotation.setTarget(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mEnum.getEnumConstants().add(mDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		String mDefinition_name_prime = (String) _localVariable_0;
		mDefinition.setName(mDefinition_name_prime);
		return new Object[] { mBodyToTAnnotation, mDefinition, mDefinitionToTMember, mEnum, tDefinition, csp };
	}

	public static final Object[] pattern_EnumConstant_11_2_collecttranslatedelements_blackBBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation, MEnumConstantDeclaration mDefinition,
			MDefinitionToTMember mDefinitionToTMember, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName) {
		return new Object[] { mBodyToTAnnotation, mDefinition, mDefinitionToTMember, tDefinition, tSignature, tName };
	}

	public static final Object[] pattern_EnumConstant_11_2_collecttranslatedelements_greenFBBBBBB(
			ASTNodeToTAnnotatable mBodyToTAnnotation, MEnumConstantDeclaration mDefinition,
			MDefinitionToTMember mDefinitionToTMember, TFieldDefinition tDefinition, TFieldSignature tSignature,
			TField tName) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		ruleresult.getCreatedElements().add(mDefinition);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getTranslatedElements().add(tDefinition);
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getTranslatedElements().add(tName);
		return new Object[] { ruleresult, mBodyToTAnnotation, mDefinition, mDefinitionToTMember, tDefinition,
				tSignature, tName };
	}

	public static final Object[] pattern_EnumConstant_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject mDefinition,
			EObject mDefinitionToTMember, EObject mEnumToTEnum, EObject tEnum, EObject mEnum, EObject tDefinition,
			EObject tSignature, EObject tName) {
		if (!mBodyToTAnnotation.equals(model)) {
			if (!mBodyToTAnnotation.equals(mDefinition)) {
				if (!mBodyToTAnnotation.equals(mDefinitionToTMember)) {
					if (!mBodyToTAnnotation.equals(mEnumToTEnum)) {
						if (!mBodyToTAnnotation.equals(tEnum)) {
							if (!mBodyToTAnnotation.equals(mEnum)) {
								if (!mBodyToTAnnotation.equals(tDefinition)) {
									if (!mBodyToTAnnotation.equals(tSignature)) {
										if (!mBodyToTAnnotation.equals(tName)) {
											if (!model.equals(tEnum)) {
												if (!model.equals(tDefinition)) {
													if (!model.equals(tSignature)) {
														if (!model.equals(tName)) {
															if (!mDefinition.equals(model)) {
																if (!mDefinition.equals(mDefinitionToTMember)) {
																	if (!mDefinition.equals(mEnumToTEnum)) {
																		if (!mDefinition.equals(tEnum)) {
																			if (!mDefinition.equals(mEnum)) {
																				if (!mDefinition.equals(tDefinition)) {
																					if (!mDefinition
																							.equals(tSignature)) {
																						if (!mDefinition
																								.equals(tName)) {
																							if (!mDefinitionToTMember
																									.equals(model)) {
																								if (!mDefinitionToTMember
																										.equals(mEnumToTEnum)) {
																									if (!mDefinitionToTMember
																											.equals(tEnum)) {
																										if (!mDefinitionToTMember
																												.equals(mEnum)) {
																											if (!mDefinitionToTMember
																													.equals(tDefinition)) {
																												if (!mDefinitionToTMember
																														.equals(tSignature)) {
																													if (!mDefinitionToTMember
																															.equals(tName)) {
																														if (!mEnumToTEnum
																																.equals(model)) {
																															if (!mEnumToTEnum
																																	.equals(tEnum)) {
																																if (!mEnumToTEnum
																																		.equals(tDefinition)) {
																																	if (!mEnumToTEnum
																																			.equals(tSignature)) {
																																		if (!mEnumToTEnum
																																				.equals(tName)) {
																																			if (!tEnum
																																					.equals(tSignature)) {
																																				if (!tEnum
																																						.equals(tName)) {
																																					if (!mEnum
																																							.equals(model)) {
																																						if (!mEnum
																																								.equals(mEnumToTEnum)) {
																																							if (!mEnum
																																									.equals(tEnum)) {
																																								if (!mEnum
																																										.equals(tDefinition)) {
																																									if (!mEnum
																																											.equals(tSignature)) {
																																										if (!mEnum
																																												.equals(tName)) {
																																											if (!tDefinition
																																													.equals(tEnum)) {
																																												if (!tDefinition
																																														.equals(tSignature)) {
																																													if (!tDefinition
																																															.equals(tName)) {
																																														if (!tName
																																																.equals(tSignature)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	mBodyToTAnnotation,
																																																	model,
																																																	mDefinition,
																																																	mDefinitionToTMember,
																																																	mEnumToTEnum,
																																																	tEnum,
																																																	mEnum,
																																																	tDefinition,
																																																	tSignature,
																																																	tName };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject mDefinition,
			EObject mDefinitionToTMember, EObject tEnum, EObject mEnum, EObject tDefinition, EObject tSignature,
			EObject tName) {
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnum__mDefinition____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "EnumConstant";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String tEnum__tSignature____signature_name_prime = "signature";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String mEnum__mDefinition____enumConstants_name_prime = "enumConstants";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String tSignature__tEnum____type_name_prime = "type";
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tEnum__tSignature____signature);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		ruleresult.getTranslatedEdges().add(tDefinition__tEnum____definedBy);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		ruleresult.getTranslatedEdges().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		ruleresult.getTranslatedEdges().add(tName__model____model);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tSignature__tDefinition____definitions);
		mEnum__mDefinition____enumConstants.setSrc(mEnum);
		mEnum__mDefinition____enumConstants.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mEnum__mDefinition____enumConstants);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		ruleresult.getTranslatedEdges().add(tSignature__tEnum____type);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		mEnum__mDefinition____enumConstants.setName(mEnum__mDefinition____enumConstants_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		return new Object[] { ruleresult, mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember, tEnum, mEnum,
				tDefinition, tSignature, tName, mBodyToTAnnotation__mDefinition____source,
				mDefinitionToTMember__mDefinition____source, tEnum__tSignature____signature,
				tEnum__tDefinition____defines, tDefinition__tEnum____definedBy, model__tName____fields,
				tName__model____model, mBodyToTAnnotation__tDefinition____target, tSignature__tName____field,
				tName__tSignature____signatures, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions, mEnum__mDefinition____enumConstants,
				mDefinitionToTMember__tDefinition____target, tSignature__tEnum____type };
	}

	public static final void pattern_EnumConstant_11_5_registerobjects_expressionBBBBBBBBBBBB(EnumConstant _this,
			PerformRuleResult ruleresult, EObject mBodyToTAnnotation, EObject model, EObject mDefinition,
			EObject mDefinitionToTMember, EObject mEnumToTEnum, EObject tEnum, EObject mEnum, EObject tDefinition,
			EObject tSignature, EObject tName) {
		_this.registerObjects_BWD(ruleresult, mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember,
				mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature, tName);

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
		EObject _localVariable_1 = match.getObject("tEnum");
		EObject _localVariable_2 = match.getObject("tDefinition");
		EObject _localVariable_3 = match.getObject("tSignature");
		EObject _localVariable_4 = match.getObject("tName");
		EObject tmpModel = _localVariable_0;
		EObject tmpTEnum = _localVariable_1;
		EObject tmpTDefinition = _localVariable_2;
		EObject tmpTSignature = _localVariable_3;
		EObject tmpTName = _localVariable_4;
		if (tmpModel instanceof TypeGraph) {
			TypeGraph model = (TypeGraph) tmpModel;
			if (tmpTEnum instanceof TClass) {
				TClass tEnum = (TClass) tmpTEnum;
				if (tmpTDefinition instanceof TFieldDefinition) {
					TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
					if (tmpTSignature instanceof TFieldSignature) {
						TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
						if (tmpTName instanceof TField) {
							TField tName = (TField) tmpTName;
							return new Object[] { model, tEnum, tDefinition, tSignature, tName, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_12_2_corematch_blackBFBFBBBB(TypeGraph model,
			TClass tEnum, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tEnum, TypeToTAbstractType.class, "target")) {
			Type tmpMEnum = mEnumToTEnum.getSource();
			if (tmpMEnum instanceof EnumDeclaration) {
				EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
				_result.add(new Object[] { model, mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature, tName, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_12_3_findcontext_blackBBBBBBB(TypeGraph model,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumDeclaration mEnum, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tEnum.getSignature().contains(tSignature)) {
			if (tEnum.getDefines().contains(tDefinition)) {
				if (model.getFields().contains(tName)) {
					if (mEnum.equals(mEnumToTEnum.getSource())) {
						if (tName.equals(tSignature.getField())) {
							if (tSignature.equals(tDefinition.getSignature())) {
								if (tEnum.equals(mEnumToTEnum.getTarget())) {
									if (tEnum.equals(tSignature.getType())) {
										if (model.equals(tEnum.getModel())) {
											_result.add(new Object[] { model, mEnumToTEnum, tEnum, mEnum, tDefinition,
													tSignature, tName });
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
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumDeclaration mEnum, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tEnum__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tEnum____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tName____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__mEnum____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____field = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mEnumToTEnum__tEnum____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tEnum____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tEnum__model____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__tEnum____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tEnum__tSignature____signature_name_prime = "signature";
		String tEnum__tDefinition____defines_name_prime = "defines";
		String tDefinition__tEnum____definedBy_name_prime = "definedBy";
		String model__tName____fields_name_prime = "fields";
		String tName__model____model_name_prime = "model";
		String mEnumToTEnum__mEnum____source_name_prime = "source";
		String tSignature__tName____field_name_prime = "field";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		String mEnumToTEnum__tEnum____target_name_prime = "target";
		String tSignature__tEnum____type_name_prime = "type";
		String tEnum__model____model_name_prime = "model";
		String model__tEnum____ownedTypes_name_prime = "ownedTypes";
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum);
		isApplicableMatch.getAllContextElements().add(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnum);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tName);
		tEnum__tSignature____signature.setSrc(tEnum);
		tEnum__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tEnum__tSignature____signature);
		tEnum__tDefinition____defines.setSrc(tEnum);
		tEnum__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tEnum__tDefinition____defines);
		tDefinition__tEnum____definedBy.setSrc(tDefinition);
		tDefinition__tEnum____definedBy.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(tDefinition__tEnum____definedBy);
		model__tName____fields.setSrc(model);
		model__tName____fields.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(model__tName____fields);
		tName__model____model.setSrc(tName);
		tName__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tName__model____model);
		mEnumToTEnum__mEnum____source.setSrc(mEnumToTEnum);
		mEnumToTEnum__mEnum____source.setTrg(mEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__mEnum____source);
		tSignature__tName____field.setSrc(tSignature);
		tSignature__tName____field.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____field);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		mEnumToTEnum__tEnum____target.setSrc(mEnumToTEnum);
		mEnumToTEnum__tEnum____target.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(mEnumToTEnum__tEnum____target);
		tSignature__tEnum____type.setSrc(tSignature);
		tSignature__tEnum____type.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(tSignature__tEnum____type);
		tEnum__model____model.setSrc(tEnum);
		tEnum__model____model.setTrg(model);
		isApplicableMatch.getAllContextElements().add(tEnum__model____model);
		model__tEnum____ownedTypes.setSrc(model);
		model__tEnum____ownedTypes.setTrg(tEnum);
		isApplicableMatch.getAllContextElements().add(model__tEnum____ownedTypes);
		tEnum__tSignature____signature.setName(tEnum__tSignature____signature_name_prime);
		tEnum__tDefinition____defines.setName(tEnum__tDefinition____defines_name_prime);
		tDefinition__tEnum____definedBy.setName(tDefinition__tEnum____definedBy_name_prime);
		model__tName____fields.setName(model__tName____fields_name_prime);
		tName__model____model.setName(tName__model____model_name_prime);
		mEnumToTEnum__mEnum____source.setName(mEnumToTEnum__mEnum____source_name_prime);
		tSignature__tName____field.setName(tSignature__tName____field_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		mEnumToTEnum__tEnum____target.setName(mEnumToTEnum__tEnum____target_name_prime);
		tSignature__tEnum____type.setName(tSignature__tEnum____type_name_prime);
		tEnum__model____model.setName(tEnum__model____model_name_prime);
		model__tEnum____ownedTypes.setName(model__tEnum____ownedTypes_name_prime);
		return new Object[] { model, mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature, tName, isApplicableMatch,
				tEnum__tSignature____signature, tEnum__tDefinition____defines, tDefinition__tEnum____definedBy,
				model__tName____fields, tName__model____model, mEnumToTEnum__mEnum____source,
				tSignature__tName____field, tName__tSignature____signatures, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions, mEnumToTEnum__tEnum____target, tSignature__tEnum____type,
				tEnum__model____model, model__tEnum____ownedTypes };
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_bindingFBBBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, TypeToTAbstractType mEnumToTEnum, TClass tEnum,
			EnumDeclaration mEnum, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, model, mEnumToTEnum, tEnum, mEnum,
				tDefinition, tSignature, tName);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, mEnumToTEnum, tEnum, mEnum, tDefinition,
					tSignature, tName };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, TypeToTAbstractType mEnumToTEnum, TClass tEnum,
			EnumDeclaration mEnum, TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName) {
		Object[] result_pattern_EnumConstant_12_4_solveCSP_binding = pattern_EnumConstant_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, model, mEnumToTEnum, tEnum, mEnum, tDefinition, tSignature, tName);
		if (result_pattern_EnumConstant_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_12_4_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_12_4_solveCSP_black = pattern_EnumConstant_12_4_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, mEnumToTEnum, tEnum, mEnum, tDefinition,
						tSignature, tName };
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
			TFieldDefinition tDefinition, TFieldSignature tSignature) {
		TSignature __DEC_tDefinition_definitions_675682 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_675682 != null) {
			if (!tSignature.equals(__DEC_tDefinition_definitions_675682)) {
				return new Object[] { tDefinition, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_1BB(
			TFieldSignature tSignature, TField tName) {
		TField __DEC_tSignature_signatures_101088 = tSignature.getField();
		if (__DEC_tSignature_signatures_101088 != null) {
			if (!tName.equals(__DEC_tSignature_signatures_101088)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_2BB(TField tName,
			TypeGraph model) {
		TypeGraph __DEC_tName_model_845263 = tName.getModel();
		if (__DEC_tName_model_845263 != null) {
			if (!model.equals(__DEC_tName_model_845263)) {
				return new Object[] { tName, model };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_EnumConstant_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_signature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTEnum = _edge_signature.getSrc();
		if (tmpTEnum instanceof TClass) {
			TClass tEnum = (TClass) tmpTEnum;
			EObject tmpTSignature = _edge_signature.getTrg();
			if (tmpTSignature instanceof TFieldSignature) {
				TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
				if (tEnum.getSignature().contains(tSignature)) {
					if (tEnum.equals(tSignature.getType())) {
						TypeGraph model = tEnum.getModel();
						if (model != null) {
							TField tName = tSignature.getField();
							if (tName != null) {
								if (model.getFields().contains(tName)) {
									if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_1BB(tSignature,
											tName) == null) {
										if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_2BB(tName,
												model) == null) {
											for (TMember tmpTDefinition : tEnum.getDefines()) {
												if (tmpTDefinition instanceof TFieldDefinition) {
													TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
													if (tSignature.equals(tDefinition.getSignature())) {
														if (pattern_EnumConstant_20_2_testcorematchandDECs_black_nac_0BB(
																tDefinition, tSignature) == null) {
															_result.add(new Object[] { model, tEnum, tDefinition,
																	tSignature, tName, _edge_signature });
														}
													}
												}
											}
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
			EnumConstant _this, Match match, TypeGraph model, TClass tEnum, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, model, tEnum, tDefinition, tSignature, tName);
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
		MSignature __DEC_mDefinition_mDefinitions_439974 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_439974 != null) {
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
		EObject _localVariable_0 = targetMatch.getObject("model");
		EObject _localVariable_1 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_2 = targetMatch.getObject("tEnum");
		EObject _localVariable_3 = sourceMatch.getObject("mEnum");
		EObject _localVariable_4 = targetMatch.getObject("tDefinition");
		EObject _localVariable_5 = targetMatch.getObject("tSignature");
		EObject _localVariable_6 = targetMatch.getObject("tName");
		EObject tmpModel = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpTEnum = _localVariable_2;
		EObject tmpMEnum = _localVariable_3;
		EObject tmpTDefinition = _localVariable_4;
		EObject tmpTSignature = _localVariable_5;
		EObject tmpTName = _localVariable_6;
		if (tmpModel instanceof TypeGraph) {
			TypeGraph model = (TypeGraph) tmpModel;
			if (tmpMDefinition instanceof MEnumConstantDeclaration) {
				MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) tmpMDefinition;
				if (tmpTEnum instanceof TClass) {
					TClass tEnum = (TClass) tmpTEnum;
					if (tmpMEnum instanceof EnumDeclaration) {
						EnumDeclaration mEnum = (EnumDeclaration) tmpMEnum;
						if (tmpTDefinition instanceof TFieldDefinition) {
							TFieldDefinition tDefinition = (TFieldDefinition) tmpTDefinition;
							if (tmpTSignature instanceof TFieldSignature) {
								TFieldSignature tSignature = (TFieldSignature) tmpTSignature;
								if (tmpTName instanceof TField) {
									TField tName = (TField) tmpTName;
									return new Object[] { model, mDefinition, tEnum, mEnum, tDefinition, tSignature,
											tName, targetMatch, sourceMatch };
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
			MEnumConstantDeclaration mDefinition, TClass tEnum, EnumDeclaration mEnum, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { model, mDefinition, tEnum, mEnum, tDefinition, tSignature, tName, sourceMatch,
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
			MEnumConstantDeclaration mDefinition = (MEnumConstantDeclaration) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[1];
			TClass tEnum = (TClass) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[2];
			EnumDeclaration mEnum = (EnumDeclaration) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[3];
			TFieldDefinition tDefinition = (TFieldDefinition) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[4];
			TFieldSignature tSignature = (TFieldSignature) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[5];
			TField tName = (TField) result_pattern_EnumConstant_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_EnumConstant_24_2_matchsrctrgcontext_black = pattern_EnumConstant_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					model, mDefinition, tEnum, mEnum, tDefinition, tSignature, tName, sourceMatch, targetMatch);
			if (result_pattern_EnumConstant_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { model, mDefinition, tEnum, mEnum, tDefinition, tSignature, tName, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_bindingFBBBBBBBBBB(EnumConstant _this,
			TypeGraph model, MEnumConstantDeclaration mDefinition, TClass tEnum, EnumDeclaration mEnum,
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(model, mDefinition, tEnum, mEnum, tDefinition, tSignature,
				tName, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, model, mDefinition, tEnum, mEnum, tDefinition, tSignature, tName,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(EnumConstant _this,
			TypeGraph model, MEnumConstantDeclaration mDefinition, TClass tEnum, EnumDeclaration mEnum,
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_EnumConstant_24_3_solvecsp_binding = pattern_EnumConstant_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, model, mDefinition, tEnum, mEnum, tDefinition, tSignature, tName, sourceMatch, targetMatch);
		if (result_pattern_EnumConstant_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_24_3_solvecsp_binding[0];

			Object[] result_pattern_EnumConstant_24_3_solvecsp_black = pattern_EnumConstant_24_3_solvecsp_blackB(csp);
			if (result_pattern_EnumConstant_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, model, mDefinition, tEnum, mEnum, tDefinition, tSignature, tName,
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

	public static final Iterable<Object[]> pattern_EnumConstant_24_5_matchcorrcontext_blackFBBBB(TClass tEnum,
			EnumDeclaration mEnum, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mEnumToTEnum : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mEnum, TypeToTAbstractType.class, "source")) {
				if (tEnum.equals(mEnumToTEnum.getTarget())) {
					_result.add(new Object[] { mEnumToTEnum, tEnum, mEnum, sourceMatch, targetMatch });
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
			MEnumConstantDeclaration mDefinition, TClass tEnum, EnumDeclaration mEnum, TFieldDefinition tDefinition,
			TFieldSignature tSignature, TField tName, CCMatch ccMatch) {
		return new Object[] { model, mDefinition, tEnum, mEnum, tDefinition, tSignature, tName, ccMatch };
	}

	public static final Object[] pattern_EnumConstant_24_6_createcorrespondence_greenFBFBB(
			MEnumConstantDeclaration mDefinition, TFieldDefinition tDefinition, CCMatch ccMatch) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		mDefinitionToTMember.setSource(mDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mDefinitionToTMember);
		return new Object[] { mBodyToTAnnotation, mDefinition, mDefinitionToTMember, tDefinition, ccMatch };
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
		MSignature __DEC_mDefinition_mDefinitions_378606 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_378606 != null) {
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

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_0BB(TFieldDefinition tDefinition,
			TFieldSignature tSignature) {
		TSignature __DEC_tDefinition_definitions_660069 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_660069 != null) {
			if (!tSignature.equals(__DEC_tDefinition_definitions_660069)) {
				return new Object[] { tDefinition, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_1BB(TFieldSignature tSignature,
			TField tName) {
		TField __DEC_tSignature_signatures_750916 = tSignature.getField();
		if (__DEC_tSignature_signatures_750916 != null) {
			if (!tName.equals(__DEC_tSignature_signatures_750916)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_black_nac_2BB(TField tName,
			TypeGraph model) {
		TypeGraph __DEC_tName_model_665968 = tName.getModel();
		if (__DEC_tName_model_665968 != null) {
			if (!model.equals(__DEC_tName_model_665968)) {
				return new Object[] { tName, model };
			}
		}

		return null;
	}

	public static final Object[] pattern_EnumConstant_28_1_matchtggpattern_blackBBBBB(TypeGraph model, TClass tEnum,
			TFieldDefinition tDefinition, TFieldSignature tSignature, TField tName) {
		if (tEnum.getSignature().contains(tSignature)) {
			if (tEnum.getDefines().contains(tDefinition)) {
				if (model.getFields().contains(tName)) {
					if (tName.equals(tSignature.getField())) {
						if (tSignature.equals(tDefinition.getSignature())) {
							if (tEnum.equals(tSignature.getType())) {
								if (model.equals(tEnum.getModel())) {
									if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_0BB(tDefinition,
											tSignature) == null) {
										if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_1BB(tSignature,
												tName) == null) {
											if (pattern_EnumConstant_28_1_matchtggpattern_black_nac_2BB(tName,
													model) == null) {
												return new Object[] { model, tEnum, tDefinition, tSignature, tName };
											}
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
			IsApplicableMatch isApplicableMatch, TypeGraph model, TypeToTAbstractType mEnumToTEnum, TClass tEnum,
			EnumDeclaration mEnum, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, model, mEnumToTEnum, tEnum, mEnum,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, mEnumToTEnum, tEnum, mEnum, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_EnumConstant_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_EnumConstant_29_3_solveCSP_bindingAndBlackFBBBBBBB(EnumConstant _this,
			IsApplicableMatch isApplicableMatch, TypeGraph model, TypeToTAbstractType mEnumToTEnum, TClass tEnum,
			EnumDeclaration mEnum, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_EnumConstant_29_3_solveCSP_binding = pattern_EnumConstant_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, model, mEnumToTEnum, tEnum, mEnum, ruleResult);
		if (result_pattern_EnumConstant_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_EnumConstant_29_3_solveCSP_binding[0];

			Object[] result_pattern_EnumConstant_29_3_solveCSP_black = pattern_EnumConstant_29_3_solveCSP_blackB(csp);
			if (result_pattern_EnumConstant_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, mEnumToTEnum, tEnum, mEnum, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_EnumConstant_29_4_checkCSP_expressionFBB(EnumConstant _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_EnumConstant_29_5_checknacs_blackBBBB(TypeGraph model,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumDeclaration mEnum) {
		return new Object[] { model, mEnumToTEnum, tEnum, mEnum };
	}

	public static final Object[] pattern_EnumConstant_29_6_perform_blackBBBBB(TypeGraph model,
			TypeToTAbstractType mEnumToTEnum, TClass tEnum, EnumDeclaration mEnum,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { model, mEnumToTEnum, tEnum, mEnum, ruleResult };
	}

	public static final Object[] pattern_EnumConstant_29_6_perform_greenFBFFBBFFFBB(TypeGraph model, TClass tEnum,
			EnumDeclaration mEnum, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		MEnumConstantDeclaration mDefinition = ModiscoFactory.eINSTANCE.createMEnumConstantDeclaration();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TFieldDefinition tDefinition = BasicFactory.eINSTANCE.createTFieldDefinition();
		TFieldSignature tSignature = BasicFactory.eINSTANCE.createTFieldSignature();
		TField tName = BasicFactory.eINSTANCE.createTField();
		Object _localVariable_0 = csp.getValue("mDefinition", "name");
		Object _localVariable_1 = csp.getValue("tName", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		mBodyToTAnnotation.setSource(mDefinition);
		mEnum.getEnumConstants().add(mDefinition);
		ruleResult.getSourceObjects().add(mDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		tEnum.getDefines().add(tDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		mDefinitionToTMember.setTarget(tDefinition);
		ruleResult.getTargetObjects().add(tDefinition);
		tEnum.getSignature().add(tSignature);
		tDefinition.setSignature(tSignature);
		tSignature.setType(tEnum);
		ruleResult.getTargetObjects().add(tSignature);
		model.getFields().add(tName);
		tSignature.setField(tName);
		ruleResult.getTargetObjects().add(tName);
		String mDefinition_name_prime = (String) _localVariable_0;
		String tName_tName_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		mDefinition.setName(mDefinition_name_prime);
		tName.setTName(tName_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mBodyToTAnnotation, model, mDefinition, mDefinitionToTMember, tEnum, mEnum, tDefinition,
				tSignature, tName, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_EnumConstant_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //EnumConstantImpl
