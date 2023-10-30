/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AnonymousClassDeclaration;

import org.gravity.modisco.MInitializer;
import org.gravity.modisco.MSignature;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.InitializerInAnonymous;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TMethod;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TModifier;
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
 * An implementation of the model object '<em><b>Initializer In Anonymous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InitializerInAnonymousImpl extends AbstractRuleImpl implements InitializerInAnonymous {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitializerInAnonymousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInitializerInAnonymous();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MInitializer mDefinition, AnonymousClassDeclaration mType) {

		Object[] result1_black = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_0_1_initialbindings_blackBBBB(this, match, mDefinition, mType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mDefinition, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InitializerInAnonymousImpl.pattern_InitializerInAnonymous_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_0_4_collectelementstobetranslated_blackBBB(match, mDefinition,
							mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ".");
			}
			InitializerInAnonymousImpl.pattern_InitializerInAnonymous_0_4_collectelementstobetranslated_greenBBBFF(
					match, mDefinition, mType);
			//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mDefinition__mType____anonymousClassDeclarationOwner = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_0_5_collectcontextelements_blackBBB(match, mDefinition, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ".");
			}
			InitializerInAnonymousImpl.pattern_InitializerInAnonymous_0_5_collectcontextelements_greenBB(match, mType);

			// 
			InitializerInAnonymousImpl.pattern_InitializerInAnonymous_0_6_registerobjectstomatch_expressionBBBB(this,
					match, mDefinition, mType);
			return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_0_7_expressionF();
		} else {
			return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeGraph tPM = (TypeGraph) result1_bindingAndBlack[0];
		TClass tType = (TClass) result1_bindingAndBlack[1];
		AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[2];
		MInitializer mDefinition = (MInitializer) result1_bindingAndBlack[3];
		AnonymousClassDeclaration mType = (AnonymousClassDeclaration) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_1_1_performtransformation_greenBFBFFFBFFB(tPM, tType, mDefinition, csp);
		TMethodSignature tSignature = (TMethodSignature) result1_green[1];
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[3];
		TModifier tModifier = (TModifier) result1_green[4];
		TMethod tName = (TMethod) result1_green[5];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_green[7];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[8];

		Object[] result2_black = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_1_2_collecttranslatedelements_blackBBBBBBB(tSignature,
						mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tModifier] = " + tModifier
					+ ", " + "[tName] = " + tName + ", " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		Object[] result2_green = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_1_2_collecttranslatedelements_greenFBBBBBBB(tSignature,
						mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, tPM, tSignature,
						tType, mTypeToTTYpe, mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition,
						mBodyToTAnnotation, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tPM] = " + tPM + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType
					+ ", " + "[mTypeToTTYpe] = " + mTypeToTTYpe + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[tModifier] = " + tModifier + ", " + "[tName] = " + tName + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ".");
		}
		InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult,
						tPM, tSignature, tType, mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition,
						mBodyToTAnnotation, mType);
		//nothing EMoflonEdge tName__tPM____model = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tPM__tName____methods = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tDefinition__tModifier____tModifier = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge mDefinition__mType____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[26];

		// 
		// 
		InitializerInAnonymousImpl.pattern_InitializerInAnonymous_1_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, tPM, tSignature, tType, mTypeToTTYpe, mDefinitionToTMember, tModifier, tName, mDefinition,
				tDefinition, mBodyToTAnnotation, mType);
		return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MInitializer mDefinition = (MInitializer) result2_binding[0];
		AnonymousClassDeclaration mType = (AnonymousClassDeclaration) result2_binding[1];
		for (Object[] result2_black : InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_2_2_corematch_blackFFBBB(mDefinition, mType, match)) {
			TClass tType = (TClass) result2_black[0];
			AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) result2_black[1];
			// ForEach 
			for (Object[] result3_black : InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_2_3_findcontext_blackFBBBB(tType, mTypeToTTYpe, mDefinition,
							mType)) {
				TypeGraph tPM = (TypeGraph) result3_black[0];
				Object[] result3_green = InitializerInAnonymousImpl
						.pattern_InitializerInAnonymous_2_3_findcontext_greenBBBBBFFFFFFF(tPM, tType, mTypeToTTYpe,
								mDefinition, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge mTypeToTTYpe__tType____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mTypeToTTYpe__mType____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tType__tPM____model = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tPM__tType____allTypes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mDefinition__mType____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = InitializerInAnonymousImpl
						.pattern_InitializerInAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								tPM, tType, mTypeToTTYpe, mDefinition, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tPM] = " + tPM + ", "
							+ "[tType] = " + tType + ", " + "[mTypeToTTYpe] = " + mTypeToTTYpe + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InitializerInAnonymousImpl.pattern_InitializerInAnonymous_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InitializerInAnonymousImpl
							.pattern_InitializerInAnonymous_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InitializerInAnonymousImpl.pattern_InitializerInAnonymous_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MInitializer mDefinition, AnonymousClassDeclaration mType) {
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MInitializer mDefinition, AnonymousClassDeclaration mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeGraph tPM, TClass tType,
			AnonymousClassDeclarationToTClass mTypeToTTYpe, MInitializer mDefinition, AnonymousClassDeclaration mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(".initializer");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(addSuffix);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tPM", tPM);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTTYpe", mTypeToTTYpe);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mType", mType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tPM, EObject tSignature, EObject tType,
			EObject mTypeToTTYpe, EObject mDefinitionToTMember, EObject tModifier, EObject tName, EObject mDefinition,
			EObject tDefinition, EObject mBodyToTAnnotation, EObject mType) {
		ruleresult.registerObject("tPM", tPM);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTTYpe", mTypeToTTYpe);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mDefinition").eClass())
				.equals("modisco.MInitializer.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph tPM, TMethodSignature tSignature, TClass tType,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition) {

		Object[] result1_black = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_10_1_initialbindings_blackBBBBBBBB(this, match, tPM, tSignature, tType,
						tModifier, tName, tDefinition);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPM] = " + tPM + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tType] = " + tType + ", " + "[tModifier] = " + tModifier + ", " + "[tName] = " + tName + ", "
					+ "[tDefinition] = " + tDefinition + ".");
		}

		Object[] result2_bindingAndBlack = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(this, match, tPM, tSignature,
						tType, tModifier, tName, tDefinition);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tPM] = " + tPM + ", " + "[tSignature] = " + tSignature + ", "
					+ "[tType] = " + tType + ", " + "[tModifier] = " + tModifier + ", " + "[tName] = " + tName + ", "
					+ "[tDefinition] = " + tDefinition + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InitializerInAnonymousImpl.pattern_InitializerInAnonymous_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_10_4_collectelementstobetranslated_blackBBBBBBB(match, tPM,
							tSignature, tType, tModifier, tName, tDefinition);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPM] = " + tPM + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
						+ "[tModifier] = " + tModifier + ", " + "[tName] = " + tName + ", " + "[tDefinition] = "
						+ tDefinition + ".");
			}
			InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFF(match,
							tPM, tSignature, tType, tModifier, tName, tDefinition);
			//nothing EMoflonEdge tName__tPM____model = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge tPM__tName____methods = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tDefinition__tModifier____tModifier = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result4_green[15];
			//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result4_green[16];

			Object[] result5_black = InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_10_5_collectcontextelements_blackBBBBBBB(match, tPM, tSignature,
							tType, tModifier, tName, tDefinition);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tPM] = " + tPM + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
						+ "[tModifier] = " + tModifier + ", " + "[tName] = " + tName + ", " + "[tDefinition] = "
						+ tDefinition + ".");
			}
			InitializerInAnonymousImpl.pattern_InitializerInAnonymous_10_5_collectcontextelements_greenBBBFF(match, tPM,
					tType);
			//nothing EMoflonEdge tType__tPM____model = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tPM__tType____allTypes = (EMoflonEdge) result5_green[4];

			// 
			InitializerInAnonymousImpl.pattern_InitializerInAnonymous_10_6_registerobjectstomatch_expressionBBBBBBBB(
					this, match, tPM, tSignature, tType, tModifier, tName, tDefinition);
			return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_10_7_expressionF();
		} else {
			return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeGraph tPM = (TypeGraph) result1_bindingAndBlack[0];
		TMethodSignature tSignature = (TMethodSignature) result1_bindingAndBlack[1];
		TClass tType = (TClass) result1_bindingAndBlack[2];
		AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) result1_bindingAndBlack[3];
		TModifier tModifier = (TModifier) result1_bindingAndBlack[4];
		TMethod tName = (TMethod) result1_bindingAndBlack[5];
		TMethodDefinition tDefinition = (TMethodDefinition) result1_bindingAndBlack[6];
		AnonymousClassDeclaration mType = (AnonymousClassDeclaration) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_11_1_performtransformation_greenFFBFB(tDefinition, mType);
		MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result1_green[0];
		MInitializer mDefinition = (MInitializer) result1_green[1];
		ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result1_green[3];

		Object[] result2_black = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_11_2_collecttranslatedelements_blackBBBBBBB(tSignature,
						mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition, mBodyToTAnnotation);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tSignature] = " + tSignature
					+ ", " + "[mDefinitionToTMember] = " + mDefinitionToTMember + ", " + "[tModifier] = " + tModifier
					+ ", " + "[tName] = " + tName + ", " + "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = "
					+ tDefinition + ", " + "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ".");
		}
		Object[] result2_green = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_11_2_collecttranslatedelements_greenFBBBBBBB(tSignature,
						mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition, mBodyToTAnnotation);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(ruleresult, tPM, tSignature,
						tType, mTypeToTTYpe, mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition,
						mBodyToTAnnotation, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tPM] = " + tPM + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType
					+ ", " + "[mTypeToTTYpe] = " + mTypeToTTYpe + ", " + "[mDefinitionToTMember] = "
					+ mDefinitionToTMember + ", " + "[tModifier] = " + tModifier + ", " + "[tName] = " + tName + ", "
					+ "[mDefinition] = " + mDefinition + ", " + "[tDefinition] = " + tDefinition + ", "
					+ "[mBodyToTAnnotation] = " + mBodyToTAnnotation + ", " + "[mType] = " + mType + ".");
		}
		InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(ruleresult,
						tPM, tSignature, tType, mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition,
						mBodyToTAnnotation, mType);
		//nothing EMoflonEdge tName__tPM____model = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tPM__tName____methods = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tDefinition__tModifier____tModifier = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mDefinitionToTMember__tDefinition____target = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mBodyToTAnnotation__mDefinition____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge mDefinitionToTMember__mDefinition____source = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge mBodyToTAnnotation__tDefinition____target = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge mType__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge mDefinition__mType____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[26];

		// 
		// 
		InitializerInAnonymousImpl.pattern_InitializerInAnonymous_11_5_registerobjects_expressionBBBBBBBBBBBBB(this,
				ruleresult, tPM, tSignature, tType, mTypeToTTYpe, mDefinitionToTMember, tModifier, tName, mDefinition,
				tDefinition, mBodyToTAnnotation, mType);
		return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_12_2_corematch_bindingFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph tPM = (TypeGraph) result2_binding[0];
		TMethodSignature tSignature = (TMethodSignature) result2_binding[1];
		TClass tType = (TClass) result2_binding[2];
		TModifier tModifier = (TModifier) result2_binding[3];
		TMethod tName = (TMethod) result2_binding[4];
		TMethodDefinition tDefinition = (TMethodDefinition) result2_binding[5];
		for (Object[] result2_black : InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_12_2_corematch_blackBBBFBBBFB(tPM, tSignature, tType, tModifier, tName,
						tDefinition, match)) {
			AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) result2_black[3];
			AnonymousClassDeclaration mType = (AnonymousClassDeclaration) result2_black[7];
			// ForEach 
			for (Object[] result3_black : InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_12_3_findcontext_blackBBBBBBBB(tPM, tSignature, tType, mTypeToTTYpe,
							tModifier, tName, tDefinition, mType)) {
				Object[] result3_green = InitializerInAnonymousImpl
						.pattern_InitializerInAnonymous_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFFFF(tPM, tSignature,
								tType, mTypeToTTYpe, tModifier, tName, tDefinition, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge mTypeToTTYpe__tType____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tName__tPM____model = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tPM__tName____methods = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTTYpe__mType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge tType__tSignature____signature = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge tDefinition__tModifier____tModifier = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tType__tPM____model = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tPM__tType____allTypes = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tType__tDefinition____defines = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tDefinition__tType____definedBy = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tSignature__tName____method = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tName__tSignature____signatures = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge tDefinition__tSignature____signature = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tSignature__tDefinition____definitions = (EMoflonEdge) result3_green[22];

				Object[] result4_bindingAndBlack = InitializerInAnonymousImpl
						.pattern_InitializerInAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, tPM, tSignature, tType, mTypeToTTYpe, tModifier, tName, tDefinition,
								mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tPM] = " + tPM + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", " + "[mTypeToTTYpe] = "
							+ mTypeToTTYpe + ", " + "[tModifier] = " + tModifier + ", " + "[tName] = " + tName + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InitializerInAnonymousImpl.pattern_InitializerInAnonymous_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InitializerInAnonymousImpl
							.pattern_InitializerInAnonymous_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InitializerInAnonymousImpl.pattern_InitializerInAnonymous_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph tPM, TMethodSignature tSignature, TClass tType,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition) {
		match.registerObject("tPM", tPM);
		match.registerObject("tSignature", tSignature);
		match.registerObject("tType", tType);
		match.registerObject("tModifier", tModifier);
		match.registerObject("tName", tName);
		match.registerObject("tDefinition", tDefinition);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph tPM, TMethodSignature tSignature, TClass tType,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(".initializer");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");

		// Create unbound variables

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(addSuffix);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tName_tName);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph tPM,
			TMethodSignature tSignature, TClass tType, AnonymousClassDeclarationToTClass mTypeToTTYpe,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition, AnonymousClassDeclaration mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tPM", tPM);
		isApplicableMatch.registerObject("tSignature", tSignature);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTTYpe", mTypeToTTYpe);
		isApplicableMatch.registerObject("tModifier", tModifier);
		isApplicableMatch.registerObject("tName", tName);
		isApplicableMatch.registerObject("tDefinition", tDefinition);
		isApplicableMatch.registerObject("mType", mType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tPM, EObject tSignature, EObject tType,
			EObject mTypeToTTYpe, EObject mDefinitionToTMember, EObject tModifier, EObject tName, EObject mDefinition,
			EObject tDefinition, EObject mBodyToTAnnotation, EObject mType) {
		ruleresult.registerObject("tPM", tPM);
		ruleresult.registerObject("tSignature", tSignature);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mTypeToTTYpe", mTypeToTTYpe);
		ruleresult.registerObject("mDefinitionToTMember", mDefinitionToTMember);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("tName", tName);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("tDefinition", tDefinition);
		ruleresult.registerObject("mBodyToTAnnotation", mBodyToTAnnotation);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tSignature").eClass())
						.equals("basic.TMethodSignature.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tModifier").eClass())
						.equals("basic.TModifier.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tName").eClass()).equals("basic.TMethod.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tDefinition").eClass())
						.equals("basic.TMethodDefinition.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_69(EMoflonEdge _edge_model) {

		Object[] result1_bindingAndBlack = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_20_2_testcorematchandDECs_blackFFFFFFB(_edge_model)) {
			TypeGraph tPM = (TypeGraph) result2_black[0];
			TMethodSignature tSignature = (TMethodSignature) result2_black[1];
			TClass tType = (TClass) result2_black[2];
			TModifier tModifier = (TModifier) result2_black[3];
			TMethod tName = (TMethod) result2_black[4];
			TMethodDefinition tDefinition = (TMethodDefinition) result2_black[5];
			Object[] result2_green = InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
							this, match, tPM, tSignature, tType, tModifier, tName, tDefinition)) {
				// 
				if (InitializerInAnonymousImpl
						.pattern_InitializerInAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InitializerInAnonymousImpl
							.pattern_InitializerInAnonymous_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InitializerInAnonymousImpl.pattern_InitializerInAnonymous_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_72(EMoflonEdge _edge_bodyDeclarations) {

		Object[] result1_bindingAndBlack = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_21_2_testcorematchandDECs_blackFFB(_edge_bodyDeclarations)) {
			MInitializer mDefinition = (MInitializer) result2_black[0];
			AnonymousClassDeclaration mType = (AnonymousClassDeclaration) result2_black[1];
			Object[] result2_green = InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mDefinition, mType)) {
				// 
				if (InitializerInAnonymousImpl
						.pattern_InitializerInAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InitializerInAnonymousImpl
							.pattern_InitializerInAnonymous_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InitializerInAnonymousImpl.pattern_InitializerInAnonymous_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InitializerInAnonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tModifier", "isStatic", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue(".initializer");
		var_literal0.setType("");

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		AddSuffix addSuffix0 = new AddSuffix();
		csp.getConstraints().add(addSuffix0);

		addSuffix0.setRuleName("InitializerInAnonymous");
		addSuffix0.solve(var_tType_tName, var_literal0, var_tName_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tName_tName.setBound(false);
			addSuffix0.solve(var_tType_tName, var_literal0, var_tName_tName);
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
		ruleResult.setRule("InitializerInAnonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tModifier", "isStatic", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue(".initializer");
		var_literal0.setType("");

		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName", true, csp);
		var_tName_tName.setValue(__helper.getValue("tName", "tName"));
		var_tName_tName.setType("String");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		AddSuffix addSuffix0 = new AddSuffix();
		csp.getConstraints().add(addSuffix0);

		addSuffix0.setRuleName("InitializerInAnonymous");
		addSuffix0.solve(var_tType_tName, var_literal0, var_tName_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			addSuffix0.solve(var_tType_tName, var_literal0, var_tName_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
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

		Object[] result1_black = InitializerInAnonymousImpl.pattern_InitializerInAnonymous_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InitializerInAnonymousImpl.pattern_InitializerInAnonymous_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TypeGraph tPM = (TypeGraph) result2_bindingAndBlack[0];
		TMethodSignature tSignature = (TMethodSignature) result2_bindingAndBlack[1];
		TClass tType = (TClass) result2_bindingAndBlack[2];
		TModifier tModifier = (TModifier) result2_bindingAndBlack[3];
		TMethod tName = (TMethod) result2_bindingAndBlack[4];
		MInitializer mDefinition = (MInitializer) result2_bindingAndBlack[5];
		TMethodDefinition tDefinition = (TMethodDefinition) result2_bindingAndBlack[6];
		AnonymousClassDeclaration mType = (AnonymousClassDeclaration) result2_bindingAndBlack[7];

		Object[] result3_bindingAndBlack = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(this, tPM, tSignature, tType,
						tModifier, tName, mDefinition, tDefinition, mType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tPM] = " + tPM + ", " + "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", "
					+ "[tModifier] = " + tModifier + ", " + "[tName] = " + tName + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[tDefinition] = " + tDefinition + ", " + "[mType] = " + mType + ", "
					+ "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InitializerInAnonymousImpl.pattern_InitializerInAnonymous_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_24_5_matchcorrcontext_blackBFBBB(tType, mType, sourceMatch,
							targetMatch)) {
				AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) result5_black[1];
				Object[] result5_green = InitializerInAnonymousImpl
						.pattern_InitializerInAnonymous_24_5_matchcorrcontext_greenBBBF(mTypeToTTYpe, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = InitializerInAnonymousImpl
						.pattern_InitializerInAnonymous_24_6_createcorrespondence_blackBBBBBBBBB(tPM, tSignature, tType,
								tModifier, tName, mDefinition, tDefinition, mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPM] = " + tPM + ", "
							+ "[tSignature] = " + tSignature + ", " + "[tType] = " + tType + ", " + "[tModifier] = "
							+ tModifier + ", " + "[tName] = " + tName + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[tDefinition] = " + tDefinition + ", " + "[mType] = " + mType + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				InitializerInAnonymousImpl.pattern_InitializerInAnonymous_24_6_createcorrespondence_greenFBBFB(
						mDefinition, tDefinition, ccMatch);
				//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[0];
				//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[3];

				Object[] result7_black = InitializerInAnonymousImpl
						.pattern_InitializerInAnonymous_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InitializerInAnonymousImpl.pattern_InitializerInAnonymous_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TypeGraph tPM, TMethodSignature tSignature, TClass tType, TModifier tModifier,
			TMethod tName, MInitializer mDefinition, TMethodDefinition tDefinition, AnonymousClassDeclaration mType,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(".initializer");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", true, csp);
		var_tName_tName.setValue(tName.getTName());
		var_tName_tName.setType("String");

		// Create unbound variables

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(addSuffix);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tName_tName);
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
	public boolean checkDEC_FWD(MInitializer mDefinition, AnonymousClassDeclaration mType) {// 
		Object[] result1_black = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_27_1_matchtggpattern_blackBB(mDefinition, mType);
		if (result1_black != null) {
			return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_27_2_expressionF();
		} else {
			return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph tPM, TMethodSignature tSignature, TClass tType, TModifier tModifier,
			TMethod tName, TMethodDefinition tDefinition) {// 
		Object[] result1_black = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_28_1_matchtggpattern_blackBBBBBB(tPM, tSignature, tType, tModifier,
						tName, tDefinition);
		if (result1_black != null) {
			InitializerInAnonymousImpl.pattern_InitializerInAnonymous_28_1_matchtggpattern_greenB(tModifier);

			return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_28_2_expressionF();
		} else {
			return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			AnonymousClassDeclarationToTClass mTypeToTTYpeParameter) {

		Object[] result1_black = InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InitializerInAnonymousImpl.pattern_InitializerInAnonymous_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InitializerInAnonymousImpl
				.pattern_InitializerInAnonymous_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mTypeToTTYpeList = (RuleEntryList) result2_black[0];
			TypeGraph tPM = (TypeGraph) result2_black[1];
			TClass tType = (TClass) result2_black[2];
			AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) result2_black[3];
			AnonymousClassDeclaration mType = (AnonymousClassDeclaration) result2_black[4];

			Object[] result3_bindingAndBlack = InitializerInAnonymousImpl
					.pattern_InitializerInAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, tPM,
							tType, mTypeToTTYpe, mType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tPM] = " + tPM + ", " + "[tType] = "
						+ tType + ", " + "[mTypeToTTYpe] = " + mTypeToTTYpe + ", " + "[mType] = " + mType + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InitializerInAnonymousImpl.pattern_InitializerInAnonymous_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InitializerInAnonymousImpl
						.pattern_InitializerInAnonymous_29_5_checknacs_blackBBBB(tPM, tType, mTypeToTTYpe, mType);
				if (result5_black != null) {

					Object[] result6_black = InitializerInAnonymousImpl
							.pattern_InitializerInAnonymous_29_6_perform_blackBBBBB(tPM, tType, mTypeToTTYpe, mType,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tPM] = " + tPM + ", "
								+ "[tType] = " + tType + ", " + "[mTypeToTTYpe] = " + mTypeToTTYpe + ", " + "[mType] = "
								+ mType + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					InitializerInAnonymousImpl.pattern_InitializerInAnonymous_29_6_perform_greenBFBFFFFFFBBB(tPM, tType,
							mType, ruleResult, csp);
					//nothing TMethodSignature tSignature = (TMethodSignature) result6_green[1];
					//nothing MDefinitionToTMember mDefinitionToTMember = (MDefinitionToTMember) result6_green[3];
					//nothing TModifier tModifier = (TModifier) result6_green[4];
					//nothing TMethod tName = (TMethod) result6_green[5];
					//nothing MInitializer mDefinition = (MInitializer) result6_green[6];
					//nothing TMethodDefinition tDefinition = (TMethodDefinition) result6_green[7];
					//nothing ASTNodeToTAnnotatable mBodyToTAnnotation = (ASTNodeToTAnnotatable) result6_green[8];

				} else {
				}

			} else {
			}

		}
		return InitializerInAnonymousImpl.pattern_InitializerInAnonymous_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph tPM, TClass tType,
			AnonymousClassDeclarationToTClass mTypeToTTYpe, AnonymousClassDeclaration mType,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(".initializer");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_tName_tName = CSPFactoryHelper.eINSTANCE.createVariable("tName.tName", csp);
		var_tName_tName.setType("String");

		// Create constraints
		AddSuffix addSuffix = new AddSuffix();

		csp.getConstraints().add(addSuffix);

		// Solve CSP
		addSuffix.setRuleName("NoRuleName");
		addSuffix.solve(var_tType_tName, literal0, var_tName_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tPM", tPM);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("mTypeToTTYpe", mTypeToTTYpe);
		isApplicableMatch.registerObject("mType", mType);
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
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPROPRIATE_FWD__MATCH_MINITIALIZER_ANONYMOUSCLASSDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MInitializer) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MINITIALIZER_ANONYMOUSCLASSDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MInitializer) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2));
			return null;
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MINITIALIZER_ANONYMOUSCLASSDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MInitializer) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEGRAPH_TCLASS_ANONYMOUSCLASSDECLARATIONTOTCLASS_MINITIALIZER_ANONYMOUSCLASSDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2), (AnonymousClassDeclarationToTClass) arguments.get(3),
					(MInitializer) arguments.get(4), (AnonymousClassDeclaration) arguments.get(5));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TMETHODSIGNATURE_TCLASS_TMODIFIER_TMETHOD_TMETHODDEFINITION:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TClass) arguments.get(3), (TModifier) arguments.get(4),
					(TMethod) arguments.get(5), (TMethodDefinition) arguments.get(6));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TMETHODSIGNATURE_TCLASS_TMODIFIER_TMETHOD_TMETHODDEFINITION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TClass) arguments.get(3), (TModifier) arguments.get(4),
					(TMethod) arguments.get(5), (TMethodDefinition) arguments.get(6));
			return null;
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TMETHODSIGNATURE_TCLASS_TMODIFIER_TMETHOD_TMETHODDEFINITION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TClass) arguments.get(3), (TModifier) arguments.get(4),
					(TMethod) arguments.get(5), (TMethodDefinition) arguments.get(6));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TMETHODSIGNATURE_TCLASS_ANONYMOUSCLASSDECLARATIONTOTCLASS_TMODIFIER_TMETHOD_TMETHODDEFINITION_ANONYMOUSCLASSDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TMethodSignature) arguments.get(2), (TClass) arguments.get(3),
					(AnonymousClassDeclarationToTClass) arguments.get(4), (TModifier) arguments.get(5),
					(TMethod) arguments.get(6), (TMethodDefinition) arguments.get(7),
					(AnonymousClassDeclaration) arguments.get(8));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11));
			return null;
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_69__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_69((EMoflonEdge) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_72__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_72((EMoflonEdge) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_TMETHODSIGNATURE_TCLASS_TMODIFIER_TMETHOD_MINITIALIZER_TMETHODDEFINITION_ANONYMOUSCLASSDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TypeGraph) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TClass) arguments.get(2), (TModifier) arguments.get(3), (TMethod) arguments.get(4),
					(MInitializer) arguments.get(5), (TMethodDefinition) arguments.get(6),
					(AnonymousClassDeclaration) arguments.get(7), (Match) arguments.get(8), (Match) arguments.get(9));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___CHECK_DEC_FWD__MINITIALIZER_ANONYMOUSCLASSDECLARATION:
			return checkDEC_FWD((MInitializer) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___CHECK_DEC_BWD__TYPEGRAPH_TMETHODSIGNATURE_TCLASS_TMODIFIER_TMETHOD_TMETHODDEFINITION:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TMethodSignature) arguments.get(1),
					(TClass) arguments.get(2), (TModifier) arguments.get(3), (TMethod) arguments.get(4),
					(TMethodDefinition) arguments.get(5));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___GENERATE_MODEL__RULEENTRYCONTAINER_ANONYMOUSCLASSDECLARATIONTOTCLASS:
			return generateModel((RuleEntryContainer) arguments.get(0),
					(AnonymousClassDeclarationToTClass) arguments.get(1));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_TCLASS_ANONYMOUSCLASSDECLARATIONTOTCLASS_ANONYMOUSCLASSDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2), (AnonymousClassDeclarationToTClass) arguments.get(3),
					(AnonymousClassDeclaration) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.INITIALIZER_IN_ANONYMOUS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InitializerInAnonymous_0_1_initialbindings_blackBBBB(
			InitializerInAnonymous _this, Match match, MInitializer mDefinition, AnonymousClassDeclaration mType) {
		return new Object[] { _this, match, mDefinition, mType };
	}

	public static final Object[] pattern_InitializerInAnonymous_0_2_SolveCSP_bindingFBBBB(InitializerInAnonymous _this,
			Match match, MInitializer mDefinition, AnonymousClassDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mDefinition, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mDefinition, mType };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InitializerInAnonymous_0_2_SolveCSP_bindingAndBlackFBBBB(
			InitializerInAnonymous _this, Match match, MInitializer mDefinition, AnonymousClassDeclaration mType) {
		Object[] result_pattern_InitializerInAnonymous_0_2_SolveCSP_binding = pattern_InitializerInAnonymous_0_2_SolveCSP_bindingFBBBB(
				_this, match, mDefinition, mType);
		if (result_pattern_InitializerInAnonymous_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InitializerInAnonymous_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InitializerInAnonymous_0_2_SolveCSP_black = pattern_InitializerInAnonymous_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InitializerInAnonymous_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mDefinition, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_InitializerInAnonymous_0_3_CheckCSP_expressionFBB(InitializerInAnonymous _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_0_4_collectelementstobetranslated_blackBBB(Match match,
			MInitializer mDefinition, AnonymousClassDeclaration mType) {
		return new Object[] { match, mDefinition, mType };
	}

	public static final Object[] pattern_InitializerInAnonymous_0_4_collectelementstobetranslated_greenBBBFF(
			Match match, MInitializer mDefinition, AnonymousClassDeclaration mType) {
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mDefinition);
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mType____anonymousClassDeclarationOwner.setTrg(mType);
		match.getToBeTranslatedEdges().add(mDefinition__mType____anonymousClassDeclarationOwner);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____anonymousClassDeclarationOwner
				.setName(mDefinition__mType____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { match, mDefinition, mType, mType__mDefinition____bodyDeclarations,
				mDefinition__mType____anonymousClassDeclarationOwner };
	}

	public static final Object[] pattern_InitializerInAnonymous_0_5_collectcontextelements_blackBBB(Match match,
			MInitializer mDefinition, AnonymousClassDeclaration mType) {
		return new Object[] { match, mDefinition, mType };
	}

	public static final Object[] pattern_InitializerInAnonymous_0_5_collectcontextelements_greenBB(Match match,
			AnonymousClassDeclaration mType) {
		match.getContextNodes().add(mType);
		return new Object[] { match, mType };
	}

	public static final void pattern_InitializerInAnonymous_0_6_registerobjectstomatch_expressionBBBB(
			InitializerInAnonymous _this, Match match, MInitializer mDefinition, AnonymousClassDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mDefinition, mType);

	}

	public static final boolean pattern_InitializerInAnonymous_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InitializerInAnonymous_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tPM");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeToTTYpe");
		EObject _localVariable_3 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("mType");
		EObject tmpTPM = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpMTypeToTTYpe = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpTPM instanceof TypeGraph) {
			TypeGraph tPM = (TypeGraph) tmpTPM;
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (tmpMTypeToTTYpe instanceof AnonymousClassDeclarationToTClass) {
					AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) tmpMTypeToTTYpe;
					if (tmpMDefinition instanceof MInitializer) {
						MInitializer mDefinition = (MInitializer) tmpMDefinition;
						if (tmpMType instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration mType = (AnonymousClassDeclaration) tmpMType;
							return new Object[] { tPM, tType, mTypeToTTYpe, mDefinition, mType, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_1_1_performtransformation_blackBBBBBFBB(TypeGraph tPM,
			TClass tType, AnonymousClassDeclarationToTClass mTypeToTTYpe, MInitializer mDefinition,
			AnonymousClassDeclaration mType, InitializerInAnonymous _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tPM, tType, mTypeToTTYpe, mDefinition, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			InitializerInAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InitializerInAnonymous_1_1_performtransformation_binding = pattern_InitializerInAnonymous_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_InitializerInAnonymous_1_1_performtransformation_binding != null) {
			TypeGraph tPM = (TypeGraph) result_pattern_InitializerInAnonymous_1_1_performtransformation_binding[0];
			TClass tType = (TClass) result_pattern_InitializerInAnonymous_1_1_performtransformation_binding[1];
			AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) result_pattern_InitializerInAnonymous_1_1_performtransformation_binding[2];
			MInitializer mDefinition = (MInitializer) result_pattern_InitializerInAnonymous_1_1_performtransformation_binding[3];
			AnonymousClassDeclaration mType = (AnonymousClassDeclaration) result_pattern_InitializerInAnonymous_1_1_performtransformation_binding[4];

			Object[] result_pattern_InitializerInAnonymous_1_1_performtransformation_black = pattern_InitializerInAnonymous_1_1_performtransformation_blackBBBBBFBB(
					tPM, tType, mTypeToTTYpe, mDefinition, mType, _this, isApplicableMatch);
			if (result_pattern_InitializerInAnonymous_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InitializerInAnonymous_1_1_performtransformation_black[5];

				return new Object[] { tPM, tType, mTypeToTTYpe, mDefinition, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_1_1_performtransformation_greenBFBFFFBFFB(TypeGraph tPM,
			TClass tType, MInitializer mDefinition, CSP csp) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		TMethod tName = BasicFactory.eINSTANCE.createTMethod();
		TMethodDefinition tDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		boolean tModifier_isStatic_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("tName", "tName");
		tType.getSignature().add(tSignature);
		mDefinitionToTMember.setSource(mDefinition);
		tName.setModel(tPM);
		tSignature.setMethod(tName);
		tDefinition.setTModifier(tModifier);
		mDefinitionToTMember.setTarget(tDefinition);
		tType.getDefines().add(tDefinition);
		tDefinition.setSignature(tSignature);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		String tName_tName_prime = (String) _localVariable_0;
		tName.setTName(tName_tName_prime);
		return new Object[] { tPM, tSignature, tType, mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition,
				mBodyToTAnnotation, csp };
	}

	public static final Object[] pattern_InitializerInAnonymous_1_2_collecttranslatedelements_blackBBBBBBB(
			TMethodSignature tSignature, MDefinitionToTMember mDefinitionToTMember, TModifier tModifier, TMethod tName,
			MInitializer mDefinition, TMethodDefinition tDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { tSignature, mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_InitializerInAnonymous_1_2_collecttranslatedelements_greenFBBBBBBB(
			TMethodSignature tSignature, MDefinitionToTMember mDefinitionToTMember, TModifier tModifier, TMethod tName,
			MInitializer mDefinition, TMethodDefinition tDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getCreatedElements().add(tModifier);
		ruleresult.getCreatedElements().add(tName);
		ruleresult.getTranslatedElements().add(mDefinition);
		ruleresult.getCreatedElements().add(tDefinition);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, tSignature, mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_InitializerInAnonymous_1_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tPM, EObject tSignature, EObject tType, EObject mTypeToTTYpe,
			EObject mDefinitionToTMember, EObject tModifier, EObject tName, EObject mDefinition, EObject tDefinition,
			EObject mBodyToTAnnotation, EObject mType) {
		if (!tPM.equals(tSignature)) {
			if (!tPM.equals(tType)) {
				if (!tSignature.equals(tType)) {
					if (!mTypeToTTYpe.equals(tPM)) {
						if (!mTypeToTTYpe.equals(tSignature)) {
							if (!mTypeToTTYpe.equals(tType)) {
								if (!mTypeToTTYpe.equals(tModifier)) {
									if (!mTypeToTTYpe.equals(tName)) {
										if (!mTypeToTTYpe.equals(tDefinition)) {
											if (!mDefinitionToTMember.equals(tPM)) {
												if (!mDefinitionToTMember.equals(tSignature)) {
													if (!mDefinitionToTMember.equals(tType)) {
														if (!mDefinitionToTMember.equals(mTypeToTTYpe)) {
															if (!mDefinitionToTMember.equals(tModifier)) {
																if (!mDefinitionToTMember.equals(tName)) {
																	if (!mDefinitionToTMember.equals(tDefinition)) {
																		if (!mDefinitionToTMember.equals(mType)) {
																			if (!tModifier.equals(tPM)) {
																				if (!tModifier.equals(tSignature)) {
																					if (!tModifier.equals(tType)) {
																						if (!tModifier.equals(tName)) {
																							if (!tName.equals(tPM)) {
																								if (!tName.equals(
																										tSignature)) {
																									if (!tName.equals(
																											tType)) {
																										if (!mDefinition
																												.equals(tPM)) {
																											if (!mDefinition
																													.equals(tSignature)) {
																												if (!mDefinition
																														.equals(tType)) {
																													if (!mDefinition
																															.equals(mTypeToTTYpe)) {
																														if (!mDefinition
																																.equals(mDefinitionToTMember)) {
																															if (!mDefinition
																																	.equals(tModifier)) {
																																if (!mDefinition
																																		.equals(tName)) {
																																	if (!mDefinition
																																			.equals(tDefinition)) {
																																		if (!mDefinition
																																				.equals(mType)) {
																																			if (!tDefinition
																																					.equals(tPM)) {
																																				if (!tDefinition
																																						.equals(tSignature)) {
																																					if (!tDefinition
																																							.equals(tType)) {
																																						if (!tDefinition
																																								.equals(tModifier)) {
																																							if (!tDefinition
																																									.equals(tName)) {
																																								if (!mBodyToTAnnotation
																																										.equals(tPM)) {
																																									if (!mBodyToTAnnotation
																																											.equals(tSignature)) {
																																										if (!mBodyToTAnnotation
																																												.equals(tType)) {
																																											if (!mBodyToTAnnotation
																																													.equals(mTypeToTTYpe)) {
																																												if (!mBodyToTAnnotation
																																														.equals(mDefinitionToTMember)) {
																																													if (!mBodyToTAnnotation
																																															.equals(tModifier)) {
																																														if (!mBodyToTAnnotation
																																																.equals(tName)) {
																																															if (!mBodyToTAnnotation
																																																	.equals(mDefinition)) {
																																																if (!mBodyToTAnnotation
																																																		.equals(tDefinition)) {
																																																	if (!mBodyToTAnnotation
																																																			.equals(mType)) {
																																																		if (!mType
																																																				.equals(tPM)) {
																																																			if (!mType
																																																					.equals(tSignature)) {
																																																				if (!mType
																																																						.equals(tType)) {
																																																					if (!mType
																																																							.equals(mTypeToTTYpe)) {
																																																						if (!mType
																																																								.equals(tModifier)) {
																																																							if (!mType
																																																									.equals(tName)) {
																																																								if (!mType
																																																										.equals(tDefinition)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											tPM,
																																																											tSignature,
																																																											tType,
																																																											mTypeToTTYpe,
																																																											mDefinitionToTMember,
																																																											tModifier,
																																																											tName,
																																																											mDefinition,
																																																											tDefinition,
																																																											mBodyToTAnnotation,
																																																											mType };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InitializerInAnonymous_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tPM, EObject tSignature, EObject tType, EObject mDefinitionToTMember,
			EObject tModifier, EObject tName, EObject mDefinition, EObject tDefinition, EObject mBodyToTAnnotation,
			EObject mType) {
		EMoflonEdge tName__tPM____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPM__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InitializerInAnonymous";
		String tName__tPM____model_name_prime = "model";
		String tPM__tName____methods_name_prime = "methods";
		String tType__tSignature____signature_name_prime = "signature";
		String tDefinition__tModifier____tModifier_name_prime = "tModifier";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String tSignature__tName____method_name_prime = "method";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		tName__tPM____model.setSrc(tName);
		tName__tPM____model.setTrg(tPM);
		ruleresult.getCreatedEdges().add(tName__tPM____model);
		tPM__tName____methods.setSrc(tPM);
		tPM__tName____methods.setTrg(tName);
		ruleresult.getCreatedEdges().add(tPM__tName____methods);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tType__tSignature____signature);
		tDefinition__tModifier____tModifier.setSrc(tDefinition);
		tDefinition__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(tDefinition__tModifier____tModifier);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		ruleresult.getCreatedEdges().add(tDefinition__tType____definedBy);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mType____anonymousClassDeclarationOwner.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mDefinition__mType____anonymousClassDeclarationOwner);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getCreatedEdges().add(tSignature__tName____method);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tName__tSignature____signatures);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		ruleresult.getCreatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(tSignature__tDefinition____definitions);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tName__tPM____model.setName(tName__tPM____model_name_prime);
		tPM__tName____methods.setName(tPM__tName____methods_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		tDefinition__tModifier____tModifier.setName(tDefinition__tModifier____tModifier_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____anonymousClassDeclarationOwner
				.setName(mDefinition__mType____anonymousClassDeclarationOwner_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		return new Object[] { ruleresult, tPM, tSignature, tType, mDefinitionToTMember, tModifier, tName, mDefinition,
				tDefinition, mBodyToTAnnotation, mType, tName__tPM____model, tPM__tName____methods,
				tType__tSignature____signature, tDefinition__tModifier____tModifier,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__mDefinition____source,
				tType__tDefinition____defines, tDefinition__tType____definedBy,
				mDefinitionToTMember__mDefinition____source, mBodyToTAnnotation__tDefinition____target,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____anonymousClassDeclarationOwner,
				tSignature__tName____method, tName__tSignature____signatures, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions };
	}

	public static final void pattern_InitializerInAnonymous_1_5_registerobjects_expressionBBBBBBBBBBBBB(
			InitializerInAnonymous _this, PerformRuleResult ruleresult, EObject tPM, EObject tSignature, EObject tType,
			EObject mTypeToTTYpe, EObject mDefinitionToTMember, EObject tModifier, EObject tName, EObject mDefinition,
			EObject tDefinition, EObject mBodyToTAnnotation, EObject mType) {
		_this.registerObjects_FWD(ruleresult, tPM, tSignature, tType, mTypeToTTYpe, mDefinitionToTMember, tModifier,
				tName, mDefinition, tDefinition, mBodyToTAnnotation, mType);

	}

	public static final PerformRuleResult pattern_InitializerInAnonymous_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_2_1_preparereturnvalue_bindingFB(
			InitializerInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_2_1_preparereturnvalue_blackFBB(EClass eClass,
			InitializerInAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_2_1_preparereturnvalue_bindingAndBlackFFB(
			InitializerInAnonymous _this) {
		Object[] result_pattern_InitializerInAnonymous_2_1_preparereturnvalue_binding = pattern_InitializerInAnonymous_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InitializerInAnonymous_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InitializerInAnonymous_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InitializerInAnonymous_2_1_preparereturnvalue_black = pattern_InitializerInAnonymous_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InitializerInAnonymous_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InitializerInAnonymous_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InitializerInAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InitializerInAnonymous_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mDefinition");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMDefinition = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMDefinition instanceof MInitializer) {
			MInitializer mDefinition = (MInitializer) tmpMDefinition;
			if (tmpMType instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mType = (AnonymousClassDeclaration) tmpMType;
				return new Object[] { mDefinition, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InitializerInAnonymous_2_2_corematch_blackFFBBB(
			MInitializer mDefinition, AnonymousClassDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (AnonymousClassDeclarationToTClass mTypeToTTYpe : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, AnonymousClassDeclarationToTClass.class, "source")) {
			TClass tType = mTypeToTTYpe.getTarget();
			if (tType != null) {
				_result.add(new Object[] { tType, mTypeToTTYpe, mDefinition, mType, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InitializerInAnonymous_2_3_findcontext_blackFBBBB(TClass tType,
			AnonymousClassDeclarationToTClass mTypeToTTYpe, MInitializer mDefinition, AnonymousClassDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tType.equals(mTypeToTTYpe.getTarget())) {
			if (mType.equals(mTypeToTTYpe.getSource())) {
				if (mType.getBodyDeclarations().contains(mDefinition)) {
					TypeGraph tPM = tType.getModel();
					if (tPM != null) {
						_result.add(new Object[] { tPM, tType, mTypeToTTYpe, mDefinition, mType });
					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_2_3_findcontext_greenBBBBBFFFFFFF(TypeGraph tPM,
			TClass tType, AnonymousClassDeclarationToTClass mTypeToTTYpe, MInitializer mDefinition,
			AnonymousClassDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTTYpe__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTTYpe__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPM____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPM__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTTYpe__tType____target_name_prime = "target";
		String mTypeToTTYpe__mType____source_name_prime = "source";
		String tType__tPM____model_name_prime = "model";
		String tPM__tType____allTypes_name_prime = "allTypes";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		isApplicableMatch.getAllContextElements().add(tPM);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTTYpe);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType);
		mTypeToTTYpe__tType____target.setSrc(mTypeToTTYpe);
		mTypeToTTYpe__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTTYpe__tType____target);
		mTypeToTTYpe__mType____source.setSrc(mTypeToTTYpe);
		mTypeToTTYpe__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTTYpe__mType____source);
		tType__tPM____model.setSrc(tType);
		tType__tPM____model.setTrg(tPM);
		isApplicableMatch.getAllContextElements().add(tType__tPM____model);
		tPM__tType____allTypes.setSrc(tPM);
		tPM__tType____allTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPM__tType____allTypes);
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mType____anonymousClassDeclarationOwner.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mDefinition__mType____anonymousClassDeclarationOwner);
		mTypeToTTYpe__tType____target.setName(mTypeToTTYpe__tType____target_name_prime);
		mTypeToTTYpe__mType____source.setName(mTypeToTTYpe__mType____source_name_prime);
		tType__tPM____model.setName(tType__tPM____model_name_prime);
		tPM__tType____allTypes.setName(tPM__tType____allTypes_name_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____anonymousClassDeclarationOwner
				.setName(mDefinition__mType____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { tPM, tType, mTypeToTTYpe, mDefinition, mType, isApplicableMatch,
				mTypeToTTYpe__tType____target, mTypeToTTYpe__mType____source, tType__tPM____model,
				tPM__tType____allTypes, mType__mDefinition____bodyDeclarations,
				mDefinition__mType____anonymousClassDeclarationOwner };
	}

	public static final Object[] pattern_InitializerInAnonymous_2_4_solveCSP_bindingFBBBBBBB(
			InitializerInAnonymous _this, IsApplicableMatch isApplicableMatch, TypeGraph tPM, TClass tType,
			AnonymousClassDeclarationToTClass mTypeToTTYpe, MInitializer mDefinition, AnonymousClassDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tPM, tType, mTypeToTTYpe, mDefinition,
				mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tPM, tType, mTypeToTTYpe, mDefinition, mType };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InitializerInAnonymous_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			InitializerInAnonymous _this, IsApplicableMatch isApplicableMatch, TypeGraph tPM, TClass tType,
			AnonymousClassDeclarationToTClass mTypeToTTYpe, MInitializer mDefinition, AnonymousClassDeclaration mType) {
		Object[] result_pattern_InitializerInAnonymous_2_4_solveCSP_binding = pattern_InitializerInAnonymous_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tPM, tType, mTypeToTTYpe, mDefinition, mType);
		if (result_pattern_InitializerInAnonymous_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InitializerInAnonymous_2_4_solveCSP_binding[0];

			Object[] result_pattern_InitializerInAnonymous_2_4_solveCSP_black = pattern_InitializerInAnonymous_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InitializerInAnonymous_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tPM, tType, mTypeToTTYpe, mDefinition, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_InitializerInAnonymous_2_5_checkCSP_expressionFBB(InitializerInAnonymous _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InitializerInAnonymous_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InitializerInAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InitializerInAnonymous_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_10_1_initialbindings_blackBBBBBBBB(
			InitializerInAnonymous _this, Match match, TypeGraph tPM, TMethodSignature tSignature, TClass tType,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition) {
		return new Object[] { _this, match, tPM, tSignature, tType, tModifier, tName, tDefinition };
	}

	public static final Object[] pattern_InitializerInAnonymous_10_2_SolveCSP_bindingFBBBBBBBB(
			InitializerInAnonymous _this, Match match, TypeGraph tPM, TMethodSignature tSignature, TClass tType,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tPM, tSignature, tType, tModifier, tName,
				tDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tPM, tSignature, tType, tModifier, tName, tDefinition };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InitializerInAnonymous_10_2_SolveCSP_bindingAndBlackFBBBBBBBB(
			InitializerInAnonymous _this, Match match, TypeGraph tPM, TMethodSignature tSignature, TClass tType,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition) {
		Object[] result_pattern_InitializerInAnonymous_10_2_SolveCSP_binding = pattern_InitializerInAnonymous_10_2_SolveCSP_bindingFBBBBBBBB(
				_this, match, tPM, tSignature, tType, tModifier, tName, tDefinition);
		if (result_pattern_InitializerInAnonymous_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InitializerInAnonymous_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InitializerInAnonymous_10_2_SolveCSP_black = pattern_InitializerInAnonymous_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InitializerInAnonymous_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tPM, tSignature, tType, tModifier, tName, tDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_InitializerInAnonymous_10_3_CheckCSP_expressionFBB(InitializerInAnonymous _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_10_4_collectelementstobetranslated_blackBBBBBBB(
			Match match, TypeGraph tPM, TMethodSignature tSignature, TClass tType, TModifier tModifier, TMethod tName,
			TMethodDefinition tDefinition) {
		return new Object[] { match, tPM, tSignature, tType, tModifier, tName, tDefinition };
	}

	public static final Object[] pattern_InitializerInAnonymous_10_4_collectelementstobetranslated_greenBBBBBBBFFFFFFFFFF(
			Match match, TypeGraph tPM, TMethodSignature tSignature, TClass tType, TModifier tModifier, TMethod tName,
			TMethodDefinition tDefinition) {
		EMoflonEdge tName__tPM____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPM__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tSignature);
		match.getToBeTranslatedNodes().add(tModifier);
		match.getToBeTranslatedNodes().add(tName);
		match.getToBeTranslatedNodes().add(tDefinition);
		String tName__tPM____model_name_prime = "model";
		String tPM__tName____methods_name_prime = "methods";
		String tType__tSignature____signature_name_prime = "signature";
		String tDefinition__tModifier____tModifier_name_prime = "tModifier";
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tSignature__tName____method_name_prime = "method";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		tName__tPM____model.setSrc(tName);
		tName__tPM____model.setTrg(tPM);
		match.getToBeTranslatedEdges().add(tName__tPM____model);
		tPM__tName____methods.setSrc(tPM);
		tPM__tName____methods.setTrg(tName);
		match.getToBeTranslatedEdges().add(tPM__tName____methods);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tType__tSignature____signature);
		tDefinition__tModifier____tModifier.setSrc(tDefinition);
		tDefinition__tModifier____tModifier.setTrg(tModifier);
		match.getToBeTranslatedEdges().add(tDefinition__tModifier____tModifier);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		match.getToBeTranslatedEdges().add(tDefinition__tType____definedBy);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		match.getToBeTranslatedEdges().add(tSignature__tName____method);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tName__tSignature____signatures);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		match.getToBeTranslatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		match.getToBeTranslatedEdges().add(tSignature__tDefinition____definitions);
		tName__tPM____model.setName(tName__tPM____model_name_prime);
		tPM__tName____methods.setName(tPM__tName____methods_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		tDefinition__tModifier____tModifier.setName(tDefinition__tModifier____tModifier_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		return new Object[] { match, tPM, tSignature, tType, tModifier, tName, tDefinition, tName__tPM____model,
				tPM__tName____methods, tType__tSignature____signature, tDefinition__tModifier____tModifier,
				tType__tDefinition____defines, tDefinition__tType____definedBy, tSignature__tName____method,
				tName__tSignature____signatures, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions };
	}

	public static final Object[] pattern_InitializerInAnonymous_10_5_collectcontextelements_blackBBBBBBB(Match match,
			TypeGraph tPM, TMethodSignature tSignature, TClass tType, TModifier tModifier, TMethod tName,
			TMethodDefinition tDefinition) {
		return new Object[] { match, tPM, tSignature, tType, tModifier, tName, tDefinition };
	}

	public static final Object[] pattern_InitializerInAnonymous_10_5_collectcontextelements_greenBBBFF(Match match,
			TypeGraph tPM, TClass tType) {
		EMoflonEdge tType__tPM____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPM__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tPM);
		match.getContextNodes().add(tType);
		String tType__tPM____model_name_prime = "model";
		String tPM__tType____allTypes_name_prime = "allTypes";
		tType__tPM____model.setSrc(tType);
		tType__tPM____model.setTrg(tPM);
		match.getContextEdges().add(tType__tPM____model);
		tPM__tType____allTypes.setSrc(tPM);
		tPM__tType____allTypes.setTrg(tType);
		match.getContextEdges().add(tPM__tType____allTypes);
		tType__tPM____model.setName(tType__tPM____model_name_prime);
		tPM__tType____allTypes.setName(tPM__tType____allTypes_name_prime);
		return new Object[] { match, tPM, tType, tType__tPM____model, tPM__tType____allTypes };
	}

	public static final void pattern_InitializerInAnonymous_10_6_registerobjectstomatch_expressionBBBBBBBB(
			InitializerInAnonymous _this, Match match, TypeGraph tPM, TMethodSignature tSignature, TClass tType,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition) {
		_this.registerObjectsToMatch_BWD(match, tPM, tSignature, tType, tModifier, tName, tDefinition);

	}

	public static final boolean pattern_InitializerInAnonymous_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InitializerInAnonymous_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tPM");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSignature");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTTYpe");
		EObject _localVariable_4 = isApplicableMatch.getObject("tModifier");
		EObject _localVariable_5 = isApplicableMatch.getObject("tName");
		EObject _localVariable_6 = isApplicableMatch.getObject("tDefinition");
		EObject _localVariable_7 = isApplicableMatch.getObject("mType");
		EObject tmpTPM = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMTypeToTTYpe = _localVariable_3;
		EObject tmpTModifier = _localVariable_4;
		EObject tmpTName = _localVariable_5;
		EObject tmpTDefinition = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		if (tmpTPM instanceof TypeGraph) {
			TypeGraph tPM = (TypeGraph) tmpTPM;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpTType instanceof TClass) {
					TClass tType = (TClass) tmpTType;
					if (tmpMTypeToTTYpe instanceof AnonymousClassDeclarationToTClass) {
						AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) tmpMTypeToTTYpe;
						if (tmpTModifier instanceof TModifier) {
							TModifier tModifier = (TModifier) tmpTModifier;
							if (tmpTName instanceof TMethod) {
								TMethod tName = (TMethod) tmpTName;
								if (tmpTDefinition instanceof TMethodDefinition) {
									TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
									if (tmpMType instanceof AnonymousClassDeclaration) {
										AnonymousClassDeclaration mType = (AnonymousClassDeclaration) tmpMType;
										return new Object[] { tPM, tSignature, tType, mTypeToTTYpe, tModifier, tName,
												tDefinition, mType, isApplicableMatch };
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

	public static final Object[] pattern_InitializerInAnonymous_11_1_performtransformation_blackBBBBBBBBFBB(
			TypeGraph tPM, TMethodSignature tSignature, TClass tType, AnonymousClassDeclarationToTClass mTypeToTTYpe,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition, AnonymousClassDeclaration mType,
			InitializerInAnonymous _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tPM, tSignature, tType, mTypeToTTYpe, tModifier, tName, tDefinition, mType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			InitializerInAnonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InitializerInAnonymous_11_1_performtransformation_binding = pattern_InitializerInAnonymous_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InitializerInAnonymous_11_1_performtransformation_binding != null) {
			TypeGraph tPM = (TypeGraph) result_pattern_InitializerInAnonymous_11_1_performtransformation_binding[0];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_InitializerInAnonymous_11_1_performtransformation_binding[1];
			TClass tType = (TClass) result_pattern_InitializerInAnonymous_11_1_performtransformation_binding[2];
			AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) result_pattern_InitializerInAnonymous_11_1_performtransformation_binding[3];
			TModifier tModifier = (TModifier) result_pattern_InitializerInAnonymous_11_1_performtransformation_binding[4];
			TMethod tName = (TMethod) result_pattern_InitializerInAnonymous_11_1_performtransformation_binding[5];
			TMethodDefinition tDefinition = (TMethodDefinition) result_pattern_InitializerInAnonymous_11_1_performtransformation_binding[6];
			AnonymousClassDeclaration mType = (AnonymousClassDeclaration) result_pattern_InitializerInAnonymous_11_1_performtransformation_binding[7];

			Object[] result_pattern_InitializerInAnonymous_11_1_performtransformation_black = pattern_InitializerInAnonymous_11_1_performtransformation_blackBBBBBBBBFBB(
					tPM, tSignature, tType, mTypeToTTYpe, tModifier, tName, tDefinition, mType, _this,
					isApplicableMatch);
			if (result_pattern_InitializerInAnonymous_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InitializerInAnonymous_11_1_performtransformation_black[8];

				return new Object[] { tPM, tSignature, tType, mTypeToTTYpe, tModifier, tName, tDefinition, mType, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_11_1_performtransformation_greenFFBFB(
			TMethodDefinition tDefinition, AnonymousClassDeclaration mType) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		MInitializer mDefinition = ModiscoFactory.eINSTANCE.createMInitializer();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		mDefinitionToTMember.setTarget(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		mType.getBodyDeclarations().add(mDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		return new Object[] { mDefinitionToTMember, mDefinition, tDefinition, mBodyToTAnnotation, mType };
	}

	public static final Object[] pattern_InitializerInAnonymous_11_2_collecttranslatedelements_blackBBBBBBB(
			TMethodSignature tSignature, MDefinitionToTMember mDefinitionToTMember, TModifier tModifier, TMethod tName,
			MInitializer mDefinition, TMethodDefinition tDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		return new Object[] { tSignature, mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_InitializerInAnonymous_11_2_collecttranslatedelements_greenFBBBBBBB(
			TMethodSignature tSignature, MDefinitionToTMember mDefinitionToTMember, TModifier tModifier, TMethod tName,
			MInitializer mDefinition, TMethodDefinition tDefinition, ASTNodeToTAnnotatable mBodyToTAnnotation) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tSignature);
		ruleresult.getCreatedLinkElements().add(mDefinitionToTMember);
		ruleresult.getTranslatedElements().add(tModifier);
		ruleresult.getTranslatedElements().add(tName);
		ruleresult.getCreatedElements().add(mDefinition);
		ruleresult.getTranslatedElements().add(tDefinition);
		ruleresult.getCreatedLinkElements().add(mBodyToTAnnotation);
		return new Object[] { ruleresult, tSignature, mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition,
				mBodyToTAnnotation };
	}

	public static final Object[] pattern_InitializerInAnonymous_11_3_bookkeepingforedges_blackBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tPM, EObject tSignature, EObject tType, EObject mTypeToTTYpe,
			EObject mDefinitionToTMember, EObject tModifier, EObject tName, EObject mDefinition, EObject tDefinition,
			EObject mBodyToTAnnotation, EObject mType) {
		if (!tPM.equals(tSignature)) {
			if (!tPM.equals(tType)) {
				if (!tSignature.equals(tType)) {
					if (!mTypeToTTYpe.equals(tPM)) {
						if (!mTypeToTTYpe.equals(tSignature)) {
							if (!mTypeToTTYpe.equals(tType)) {
								if (!mTypeToTTYpe.equals(tModifier)) {
									if (!mTypeToTTYpe.equals(tName)) {
										if (!mTypeToTTYpe.equals(tDefinition)) {
											if (!mDefinitionToTMember.equals(tPM)) {
												if (!mDefinitionToTMember.equals(tSignature)) {
													if (!mDefinitionToTMember.equals(tType)) {
														if (!mDefinitionToTMember.equals(mTypeToTTYpe)) {
															if (!mDefinitionToTMember.equals(tModifier)) {
																if (!mDefinitionToTMember.equals(tName)) {
																	if (!mDefinitionToTMember.equals(tDefinition)) {
																		if (!mDefinitionToTMember.equals(mType)) {
																			if (!tModifier.equals(tPM)) {
																				if (!tModifier.equals(tSignature)) {
																					if (!tModifier.equals(tType)) {
																						if (!tModifier.equals(tName)) {
																							if (!tName.equals(tPM)) {
																								if (!tName.equals(
																										tSignature)) {
																									if (!tName.equals(
																											tType)) {
																										if (!mDefinition
																												.equals(tPM)) {
																											if (!mDefinition
																													.equals(tSignature)) {
																												if (!mDefinition
																														.equals(tType)) {
																													if (!mDefinition
																															.equals(mTypeToTTYpe)) {
																														if (!mDefinition
																																.equals(mDefinitionToTMember)) {
																															if (!mDefinition
																																	.equals(tModifier)) {
																																if (!mDefinition
																																		.equals(tName)) {
																																	if (!mDefinition
																																			.equals(tDefinition)) {
																																		if (!mDefinition
																																				.equals(mType)) {
																																			if (!tDefinition
																																					.equals(tPM)) {
																																				if (!tDefinition
																																						.equals(tSignature)) {
																																					if (!tDefinition
																																							.equals(tType)) {
																																						if (!tDefinition
																																								.equals(tModifier)) {
																																							if (!tDefinition
																																									.equals(tName)) {
																																								if (!mBodyToTAnnotation
																																										.equals(tPM)) {
																																									if (!mBodyToTAnnotation
																																											.equals(tSignature)) {
																																										if (!mBodyToTAnnotation
																																												.equals(tType)) {
																																											if (!mBodyToTAnnotation
																																													.equals(mTypeToTTYpe)) {
																																												if (!mBodyToTAnnotation
																																														.equals(mDefinitionToTMember)) {
																																													if (!mBodyToTAnnotation
																																															.equals(tModifier)) {
																																														if (!mBodyToTAnnotation
																																																.equals(tName)) {
																																															if (!mBodyToTAnnotation
																																																	.equals(mDefinition)) {
																																																if (!mBodyToTAnnotation
																																																		.equals(tDefinition)) {
																																																	if (!mBodyToTAnnotation
																																																			.equals(mType)) {
																																																		if (!mType
																																																				.equals(tPM)) {
																																																			if (!mType
																																																					.equals(tSignature)) {
																																																				if (!mType
																																																						.equals(tType)) {
																																																					if (!mType
																																																							.equals(mTypeToTTYpe)) {
																																																						if (!mType
																																																								.equals(tModifier)) {
																																																							if (!mType
																																																									.equals(tName)) {
																																																								if (!mType
																																																										.equals(tDefinition)) {
																																																									return new Object[] {
																																																											ruleresult,
																																																											tPM,
																																																											tSignature,
																																																											tType,
																																																											mTypeToTTYpe,
																																																											mDefinitionToTMember,
																																																											tModifier,
																																																											tName,
																																																											mDefinition,
																																																											tDefinition,
																																																											mBodyToTAnnotation,
																																																											mType };
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InitializerInAnonymous_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tPM, EObject tSignature, EObject tType, EObject mDefinitionToTMember,
			EObject tModifier, EObject tName, EObject mDefinition, EObject tDefinition, EObject mBodyToTAnnotation,
			EObject mType) {
		EMoflonEdge tName__tPM____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPM__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinitionToTMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mBodyToTAnnotation__tDefinition____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mType____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InitializerInAnonymous";
		String tName__tPM____model_name_prime = "model";
		String tPM__tName____methods_name_prime = "methods";
		String tType__tSignature____signature_name_prime = "signature";
		String tDefinition__tModifier____tModifier_name_prime = "tModifier";
		String mDefinitionToTMember__tDefinition____target_name_prime = "target";
		String mBodyToTAnnotation__mDefinition____source_name_prime = "source";
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String mDefinitionToTMember__mDefinition____source_name_prime = "source";
		String mBodyToTAnnotation__tDefinition____target_name_prime = "target";
		String mType__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mType____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String tSignature__tName____method_name_prime = "method";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		tName__tPM____model.setSrc(tName);
		tName__tPM____model.setTrg(tPM);
		ruleresult.getTranslatedEdges().add(tName__tPM____model);
		tPM__tName____methods.setSrc(tPM);
		tPM__tName____methods.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tPM__tName____methods);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tType__tSignature____signature);
		tDefinition__tModifier____tModifier.setSrc(tDefinition);
		tDefinition__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getTranslatedEdges().add(tDefinition__tModifier____tModifier);
		mDefinitionToTMember__tDefinition____target.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__tDefinition____target);
		mBodyToTAnnotation__mDefinition____source.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__mDefinition____source);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tDefinition__tType____definedBy);
		mDefinitionToTMember__mDefinition____source.setSrc(mDefinitionToTMember);
		mDefinitionToTMember__mDefinition____source.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mDefinitionToTMember__mDefinition____source);
		mBodyToTAnnotation__tDefinition____target.setSrc(mBodyToTAnnotation);
		mBodyToTAnnotation__tDefinition____target.setTrg(tDefinition);
		ruleresult.getCreatedEdges().add(mBodyToTAnnotation__tDefinition____target);
		mType__mDefinition____bodyDeclarations.setSrc(mType);
		mType__mDefinition____bodyDeclarations.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mType__mDefinition____bodyDeclarations);
		mDefinition__mType____anonymousClassDeclarationOwner.setSrc(mDefinition);
		mDefinition__mType____anonymousClassDeclarationOwner.setTrg(mType);
		ruleresult.getCreatedEdges().add(mDefinition__mType____anonymousClassDeclarationOwner);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		ruleresult.getTranslatedEdges().add(tSignature__tName____method);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tName__tSignature____signatures);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		ruleresult.getTranslatedEdges().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		ruleresult.getTranslatedEdges().add(tSignature__tDefinition____definitions);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tName__tPM____model.setName(tName__tPM____model_name_prime);
		tPM__tName____methods.setName(tPM__tName____methods_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		tDefinition__tModifier____tModifier.setName(tDefinition__tModifier____tModifier_name_prime);
		mDefinitionToTMember__tDefinition____target.setName(mDefinitionToTMember__tDefinition____target_name_prime);
		mBodyToTAnnotation__mDefinition____source.setName(mBodyToTAnnotation__mDefinition____source_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		mDefinitionToTMember__mDefinition____source.setName(mDefinitionToTMember__mDefinition____source_name_prime);
		mBodyToTAnnotation__tDefinition____target.setName(mBodyToTAnnotation__tDefinition____target_name_prime);
		mType__mDefinition____bodyDeclarations.setName(mType__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mType____anonymousClassDeclarationOwner
				.setName(mDefinition__mType____anonymousClassDeclarationOwner_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		return new Object[] { ruleresult, tPM, tSignature, tType, mDefinitionToTMember, tModifier, tName, mDefinition,
				tDefinition, mBodyToTAnnotation, mType, tName__tPM____model, tPM__tName____methods,
				tType__tSignature____signature, tDefinition__tModifier____tModifier,
				mDefinitionToTMember__tDefinition____target, mBodyToTAnnotation__mDefinition____source,
				tType__tDefinition____defines, tDefinition__tType____definedBy,
				mDefinitionToTMember__mDefinition____source, mBodyToTAnnotation__tDefinition____target,
				mType__mDefinition____bodyDeclarations, mDefinition__mType____anonymousClassDeclarationOwner,
				tSignature__tName____method, tName__tSignature____signatures, tDefinition__tSignature____signature,
				tSignature__tDefinition____definitions };
	}

	public static final void pattern_InitializerInAnonymous_11_5_registerobjects_expressionBBBBBBBBBBBBB(
			InitializerInAnonymous _this, PerformRuleResult ruleresult, EObject tPM, EObject tSignature, EObject tType,
			EObject mTypeToTTYpe, EObject mDefinitionToTMember, EObject tModifier, EObject tName, EObject mDefinition,
			EObject tDefinition, EObject mBodyToTAnnotation, EObject mType) {
		_this.registerObjects_BWD(ruleresult, tPM, tSignature, tType, mTypeToTTYpe, mDefinitionToTMember, tModifier,
				tName, mDefinition, tDefinition, mBodyToTAnnotation, mType);

	}

	public static final PerformRuleResult pattern_InitializerInAnonymous_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_12_1_preparereturnvalue_bindingFB(
			InitializerInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_12_1_preparereturnvalue_blackFBB(EClass eClass,
			InitializerInAnonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_12_1_preparereturnvalue_bindingAndBlackFFB(
			InitializerInAnonymous _this) {
		Object[] result_pattern_InitializerInAnonymous_12_1_preparereturnvalue_binding = pattern_InitializerInAnonymous_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InitializerInAnonymous_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InitializerInAnonymous_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InitializerInAnonymous_12_1_preparereturnvalue_black = pattern_InitializerInAnonymous_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InitializerInAnonymous_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InitializerInAnonymous_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InitializerInAnonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InitializerInAnonymous_12_2_corematch_bindingFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tPM");
		EObject _localVariable_1 = match.getObject("tSignature");
		EObject _localVariable_2 = match.getObject("tType");
		EObject _localVariable_3 = match.getObject("tModifier");
		EObject _localVariable_4 = match.getObject("tName");
		EObject _localVariable_5 = match.getObject("tDefinition");
		EObject tmpTPM = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpTModifier = _localVariable_3;
		EObject tmpTName = _localVariable_4;
		EObject tmpTDefinition = _localVariable_5;
		if (tmpTPM instanceof TypeGraph) {
			TypeGraph tPM = (TypeGraph) tmpTPM;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpTType instanceof TClass) {
					TClass tType = (TClass) tmpTType;
					if (tmpTModifier instanceof TModifier) {
						TModifier tModifier = (TModifier) tmpTModifier;
						if (tmpTName instanceof TMethod) {
							TMethod tName = (TMethod) tmpTName;
							if (tmpTDefinition instanceof TMethodDefinition) {
								TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
								return new Object[] { tPM, tSignature, tType, tModifier, tName, tDefinition, match };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InitializerInAnonymous_12_2_corematch_blackBBBFBBBFB(TypeGraph tPM,
			TMethodSignature tSignature, TClass tType, TModifier tModifier, TMethod tName,
			TMethodDefinition tDefinition, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean tModifier_isStatic = tModifier.isIsStatic();
		if (Boolean.valueOf(tModifier_isStatic).equals(Boolean.valueOf(true))) {
			for (AnonymousClassDeclarationToTClass mTypeToTTYpe : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tType, AnonymousClassDeclarationToTClass.class, "target")) {
				AnonymousClassDeclaration mType = mTypeToTTYpe.getSource();
				if (mType != null) {
					_result.add(new Object[] { tPM, tSignature, tType, mTypeToTTYpe, tModifier, tName, tDefinition,
							mType, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_InitializerInAnonymous_12_3_findcontext_blackBBBBBBBB(TypeGraph tPM,
			TMethodSignature tSignature, TClass tType, AnonymousClassDeclarationToTClass mTypeToTTYpe,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition, AnonymousClassDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tType.equals(mTypeToTTYpe.getTarget())) {
			if (tPM.equals(tName.getModel())) {
				if (mType.equals(mTypeToTTYpe.getSource())) {
					if (tType.getSignature().contains(tSignature)) {
						if (tModifier.equals(tDefinition.getTModifier())) {
							if (tPM.equals(tType.getModel())) {
								if (tType.getDefines().contains(tDefinition)) {
									if (tName.equals(tSignature.getMethod())) {
										if (tSignature.equals(tDefinition.getSignature())) {
											boolean tModifier_isStatic = tModifier.isIsStatic();
											if (Boolean.valueOf(tModifier_isStatic).equals(Boolean.valueOf(true))) {
												_result.add(new Object[] { tPM, tSignature, tType, mTypeToTTYpe,
														tModifier, tName, tDefinition, mType });
											}

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

	public static final Object[] pattern_InitializerInAnonymous_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFFFFFF(
			TypeGraph tPM, TMethodSignature tSignature, TClass tType, AnonymousClassDeclarationToTClass mTypeToTTYpe,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition, AnonymousClassDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mTypeToTTYpe__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tPM____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPM__tName____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTTYpe__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPM____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPM__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tDefinition____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tName____method = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tName__tSignature____signatures = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tDefinition__tSignature____signature = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSignature__tDefinition____definitions = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mTypeToTTYpe__tType____target_name_prime = "target";
		String tName__tPM____model_name_prime = "model";
		String tPM__tName____methods_name_prime = "methods";
		String mTypeToTTYpe__mType____source_name_prime = "source";
		String tType__tSignature____signature_name_prime = "signature";
		String tDefinition__tModifier____tModifier_name_prime = "tModifier";
		String tType__tPM____model_name_prime = "model";
		String tPM__tType____allTypes_name_prime = "allTypes";
		String tType__tDefinition____defines_name_prime = "defines";
		String tDefinition__tType____definedBy_name_prime = "definedBy";
		String tSignature__tName____method_name_prime = "method";
		String tName__tSignature____signatures_name_prime = "signatures";
		String tDefinition__tSignature____signature_name_prime = "signature";
		String tSignature__tDefinition____definitions_name_prime = "definitions";
		isApplicableMatch.getAllContextElements().add(tPM);
		isApplicableMatch.getAllContextElements().add(tSignature);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTTYpe);
		isApplicableMatch.getAllContextElements().add(tModifier);
		isApplicableMatch.getAllContextElements().add(tName);
		isApplicableMatch.getAllContextElements().add(tDefinition);
		isApplicableMatch.getAllContextElements().add(mType);
		mTypeToTTYpe__tType____target.setSrc(mTypeToTTYpe);
		mTypeToTTYpe__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTTYpe__tType____target);
		tName__tPM____model.setSrc(tName);
		tName__tPM____model.setTrg(tPM);
		isApplicableMatch.getAllContextElements().add(tName__tPM____model);
		tPM__tName____methods.setSrc(tPM);
		tPM__tName____methods.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tPM__tName____methods);
		mTypeToTTYpe__mType____source.setSrc(mTypeToTTYpe);
		mTypeToTTYpe__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTTYpe__mType____source);
		tType__tSignature____signature.setSrc(tType);
		tType__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tType__tSignature____signature);
		tDefinition__tModifier____tModifier.setSrc(tDefinition);
		tDefinition__tModifier____tModifier.setTrg(tModifier);
		isApplicableMatch.getAllContextElements().add(tDefinition__tModifier____tModifier);
		tType__tPM____model.setSrc(tType);
		tType__tPM____model.setTrg(tPM);
		isApplicableMatch.getAllContextElements().add(tType__tPM____model);
		tPM__tType____allTypes.setSrc(tPM);
		tPM__tType____allTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPM__tType____allTypes);
		tType__tDefinition____defines.setSrc(tType);
		tType__tDefinition____defines.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tType__tDefinition____defines);
		tDefinition__tType____definedBy.setSrc(tDefinition);
		tDefinition__tType____definedBy.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tDefinition__tType____definedBy);
		tSignature__tName____method.setSrc(tSignature);
		tSignature__tName____method.setTrg(tName);
		isApplicableMatch.getAllContextElements().add(tSignature__tName____method);
		tName__tSignature____signatures.setSrc(tName);
		tName__tSignature____signatures.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tName__tSignature____signatures);
		tDefinition__tSignature____signature.setSrc(tDefinition);
		tDefinition__tSignature____signature.setTrg(tSignature);
		isApplicableMatch.getAllContextElements().add(tDefinition__tSignature____signature);
		tSignature__tDefinition____definitions.setSrc(tSignature);
		tSignature__tDefinition____definitions.setTrg(tDefinition);
		isApplicableMatch.getAllContextElements().add(tSignature__tDefinition____definitions);
		mTypeToTTYpe__tType____target.setName(mTypeToTTYpe__tType____target_name_prime);
		tName__tPM____model.setName(tName__tPM____model_name_prime);
		tPM__tName____methods.setName(tPM__tName____methods_name_prime);
		mTypeToTTYpe__mType____source.setName(mTypeToTTYpe__mType____source_name_prime);
		tType__tSignature____signature.setName(tType__tSignature____signature_name_prime);
		tDefinition__tModifier____tModifier.setName(tDefinition__tModifier____tModifier_name_prime);
		tType__tPM____model.setName(tType__tPM____model_name_prime);
		tPM__tType____allTypes.setName(tPM__tType____allTypes_name_prime);
		tType__tDefinition____defines.setName(tType__tDefinition____defines_name_prime);
		tDefinition__tType____definedBy.setName(tDefinition__tType____definedBy_name_prime);
		tSignature__tName____method.setName(tSignature__tName____method_name_prime);
		tName__tSignature____signatures.setName(tName__tSignature____signatures_name_prime);
		tDefinition__tSignature____signature.setName(tDefinition__tSignature____signature_name_prime);
		tSignature__tDefinition____definitions.setName(tSignature__tDefinition____definitions_name_prime);
		return new Object[] { tPM, tSignature, tType, mTypeToTTYpe, tModifier, tName, tDefinition, mType,
				isApplicableMatch, mTypeToTTYpe__tType____target, tName__tPM____model, tPM__tName____methods,
				mTypeToTTYpe__mType____source, tType__tSignature____signature, tDefinition__tModifier____tModifier,
				tType__tPM____model, tPM__tType____allTypes, tType__tDefinition____defines,
				tDefinition__tType____definedBy, tSignature__tName____method, tName__tSignature____signatures,
				tDefinition__tSignature____signature, tSignature__tDefinition____definitions };
	}

	public static final Object[] pattern_InitializerInAnonymous_12_4_solveCSP_bindingFBBBBBBBBBB(
			InitializerInAnonymous _this, IsApplicableMatch isApplicableMatch, TypeGraph tPM,
			TMethodSignature tSignature, TClass tType, AnonymousClassDeclarationToTClass mTypeToTTYpe,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition, AnonymousClassDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tPM, tSignature, tType, mTypeToTTYpe,
				tModifier, tName, tDefinition, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tPM, tSignature, tType, mTypeToTTYpe, tModifier, tName,
					tDefinition, mType };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InitializerInAnonymous_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			InitializerInAnonymous _this, IsApplicableMatch isApplicableMatch, TypeGraph tPM,
			TMethodSignature tSignature, TClass tType, AnonymousClassDeclarationToTClass mTypeToTTYpe,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition, AnonymousClassDeclaration mType) {
		Object[] result_pattern_InitializerInAnonymous_12_4_solveCSP_binding = pattern_InitializerInAnonymous_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, tPM, tSignature, tType, mTypeToTTYpe, tModifier, tName, tDefinition, mType);
		if (result_pattern_InitializerInAnonymous_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InitializerInAnonymous_12_4_solveCSP_binding[0];

			Object[] result_pattern_InitializerInAnonymous_12_4_solveCSP_black = pattern_InitializerInAnonymous_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InitializerInAnonymous_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tPM, tSignature, tType, mTypeToTTYpe, tModifier,
						tName, tDefinition, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_InitializerInAnonymous_12_5_checkCSP_expressionFBB(InitializerInAnonymous _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InitializerInAnonymous_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InitializerInAnonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InitializerInAnonymous_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_1_preparereturnvalue_bindingFB(
			InitializerInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InitializerInAnonymous _this) {
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

	public static final Object[] pattern_InitializerInAnonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InitializerInAnonymous _this) {
		Object[] result_pattern_InitializerInAnonymous_20_1_preparereturnvalue_binding = pattern_InitializerInAnonymous_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InitializerInAnonymous_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InitializerInAnonymous_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InitializerInAnonymous_20_1_preparereturnvalue_black = pattern_InitializerInAnonymous_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InitializerInAnonymous_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InitializerInAnonymous_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InitializerInAnonymous_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_0BB(
			TMethodSignature tSignature, TClass tType) {
		TAbstractType __DEC_tSignature_returnType_76243 = tSignature.getReturnType();
		if (__DEC_tSignature_returnType_76243 != null) {
			if (!tType.equals(__DEC_tSignature_returnType_76243)) {
				return new Object[] { tSignature, tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_1BB(
			TMethodSignature tSignature, TMethod tName) {
		TMethod __DEC_tSignature_signatures_301465 = tSignature.getMethod();
		if (__DEC_tSignature_signatures_301465 != null) {
			if (!tName.equals(__DEC_tSignature_signatures_301465)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_2BB(
			TModifier tModifier, TClass tType) {
		for (TAbstractType __DEC_tModifier_tModifier_398128 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tType.equals(__DEC_tModifier_tModifier_398128)) {
				return new Object[] { tModifier, tType };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_3BB(TMethod tName,
			TypeGraph tPM) {
		TypeGraph __DEC_tName_methods_690293 = tName.getModel();
		if (__DEC_tName_methods_690293 != null) {
			if (!tPM.equals(__DEC_tName_methods_690293)) {
				return new Object[] { tName, tPM };
			}
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_4BB(
			TMethodDefinition tDefinition, TClass tType) {
		TAbstractType __DEC_tDefinition_returnType_730576 = tDefinition.getReturnType();
		if (__DEC_tDefinition_returnType_730576 != null) {
			if (!tType.equals(__DEC_tDefinition_returnType_730576)) {
				return new Object[] { tDefinition, tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_5B(
			TMethodDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_162613 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_162613 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_6BB(
			TMethodDefinition tDefinition, TMethodSignature tSignature) {
		TSignature __DEC_tDefinition_definitions_384342 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_384342 != null) {
			if (!tSignature.equals(__DEC_tDefinition_definitions_384342)) {
				return new Object[] { tDefinition, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_7BB(
			TMethodSignature tSignature, TClass tType) {
		if (tType.equals(tSignature.getReturnType())) {
			return new Object[] { tSignature, tType };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_8BB(TClass tType,
			TModifier tModifier) {
		if (tModifier.equals(tType.getTModifier())) {
			return new Object[] { tType, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_9BB(
			TMethodDefinition tDefinition, TClass tType) {
		if (tType.equals(tDefinition.getReturnType())) {
			return new Object[] { tDefinition, tType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InitializerInAnonymous_20_2_testcorematchandDECs_blackFFFFFFB(
			EMoflonEdge _edge_model) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTName = _edge_model.getSrc();
		if (tmpTName instanceof TMethod) {
			TMethod tName = (TMethod) tmpTName;
			EObject tmpTPM = _edge_model.getTrg();
			if (tmpTPM instanceof TypeGraph) {
				TypeGraph tPM = (TypeGraph) tmpTPM;
				if (tPM.equals(tName.getModel())) {
					if (pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_3BB(tName, tPM) == null) {
						for (TMethodSignature tSignature : tName.getSignatures()) {
							if (pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_1BB(tSignature,
									tName) == null) {
								for (TAbstractType tmpTType : tPM.getAllTypes()) {
									if (tmpTType instanceof TClass) {
										TClass tType = (TClass) tmpTType;
										if (tType.getSignature().contains(tSignature)) {
											if (pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_0BB(
													tSignature, tType) == null) {
												if (pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_7BB(
														tSignature, tType) == null) {
													for (TMember tmpTDefinition : tSignature.getDefinitions()) {
														if (tmpTDefinition instanceof TMethodDefinition) {
															TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
															if (tType.getDefines().contains(tDefinition)) {
																TModifier tModifier = tDefinition.getTModifier();
																if (tModifier != null) {
																	boolean tModifier_isStatic = tModifier.isIsStatic();
																	if (Boolean.valueOf(tModifier_isStatic)
																			.equals(Boolean.valueOf(true))) {
																		if (pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_4BB(
																				tDefinition, tType) == null) {
																			if (pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_5B(
																					tDefinition) == null) {
																				if (pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_6BB(
																						tDefinition,
																						tSignature) == null) {
																					if (pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_9BB(
																							tDefinition,
																							tType) == null) {
																						if (pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_2BB(
																								tModifier,
																								tType) == null) {
																							if (pattern_InitializerInAnonymous_20_2_testcorematchandDECs_black_nac_8BB(
																									tType,
																									tModifier) == null) {
																								_result.add(
																										new Object[] {
																												tPM,
																												tSignature,
																												tType,
																												tModifier,
																												tName,
																												tDefinition,
																												_edge_model });
																							}
																						}
																					}
																				}
																			}
																		}
																	}

																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InitializerInAnonymous_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InitializerInAnonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBB(
			InitializerInAnonymous _this, Match match, TypeGraph tPM, TMethodSignature tSignature, TClass tType,
			TModifier tModifier, TMethod tName, TMethodDefinition tDefinition) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tPM, tSignature, tType, tModifier, tName,
				tDefinition);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InitializerInAnonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InitializerInAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InitializerInAnonymous_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_21_1_preparereturnvalue_bindingFB(
			InitializerInAnonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InitializerInAnonymous _this) {
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

	public static final Object[] pattern_InitializerInAnonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InitializerInAnonymous _this) {
		Object[] result_pattern_InitializerInAnonymous_21_1_preparereturnvalue_binding = pattern_InitializerInAnonymous_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InitializerInAnonymous_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InitializerInAnonymous_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InitializerInAnonymous_21_1_preparereturnvalue_black = pattern_InitializerInAnonymous_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InitializerInAnonymous_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InitializerInAnonymous_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InitializerInAnonymous_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InitializerInAnonymous_21_2_testcorematchandDECs_black_nac_0B(
			MInitializer mDefinition) {
		MSignature __DEC_mDefinition_mDefinitions_879315 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_879315 != null) {
			return new Object[] { mDefinition };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_InitializerInAnonymous_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_bodyDeclarations) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMType = _edge_bodyDeclarations.getSrc();
		if (tmpMType instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mType = (AnonymousClassDeclaration) tmpMType;
			EObject tmpMDefinition = _edge_bodyDeclarations.getTrg();
			if (tmpMDefinition instanceof MInitializer) {
				MInitializer mDefinition = (MInitializer) tmpMDefinition;
				if (mType.getBodyDeclarations().contains(mDefinition)) {
					if (pattern_InitializerInAnonymous_21_2_testcorematchandDECs_black_nac_0B(mDefinition) == null) {
						_result.add(new Object[] { mDefinition, mType, _edge_bodyDeclarations });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InitializerInAnonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InitializerInAnonymous _this, Match match, MInitializer mDefinition, AnonymousClassDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mDefinition, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InitializerInAnonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InitializerInAnonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InitializerInAnonymous_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_24_1_prepare_blackB(InitializerInAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InitializerInAnonymous_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tPM");
		EObject _localVariable_1 = targetMatch.getObject("tSignature");
		EObject _localVariable_2 = targetMatch.getObject("tType");
		EObject _localVariable_3 = targetMatch.getObject("tModifier");
		EObject _localVariable_4 = targetMatch.getObject("tName");
		EObject _localVariable_5 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_6 = targetMatch.getObject("tDefinition");
		EObject _localVariable_7 = sourceMatch.getObject("mType");
		EObject tmpTPM = _localVariable_0;
		EObject tmpTSignature = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpTModifier = _localVariable_3;
		EObject tmpTName = _localVariable_4;
		EObject tmpMDefinition = _localVariable_5;
		EObject tmpTDefinition = _localVariable_6;
		EObject tmpMType = _localVariable_7;
		if (tmpTPM instanceof TypeGraph) {
			TypeGraph tPM = (TypeGraph) tmpTPM;
			if (tmpTSignature instanceof TMethodSignature) {
				TMethodSignature tSignature = (TMethodSignature) tmpTSignature;
				if (tmpTType instanceof TClass) {
					TClass tType = (TClass) tmpTType;
					if (tmpTModifier instanceof TModifier) {
						TModifier tModifier = (TModifier) tmpTModifier;
						if (tmpTName instanceof TMethod) {
							TMethod tName = (TMethod) tmpTName;
							if (tmpMDefinition instanceof MInitializer) {
								MInitializer mDefinition = (MInitializer) tmpMDefinition;
								if (tmpTDefinition instanceof TMethodDefinition) {
									TMethodDefinition tDefinition = (TMethodDefinition) tmpTDefinition;
									if (tmpMType instanceof AnonymousClassDeclaration) {
										AnonymousClassDeclaration mType = (AnonymousClassDeclaration) tmpMType;
										return new Object[] { tPM, tSignature, tType, tModifier, tName, mDefinition,
												tDefinition, mType, targetMatch, sourceMatch };
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

	public static final Object[] pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_blackBBBBBBBBBB(TypeGraph tPM,
			TMethodSignature tSignature, TClass tType, TModifier tModifier, TMethod tName, MInitializer mDefinition,
			TMethodDefinition tDefinition, AnonymousClassDeclaration mType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			boolean tModifier_isStatic = tModifier.isIsStatic();
			if (Boolean.valueOf(tModifier_isStatic).equals(Boolean.valueOf(true))) {
				return new Object[] { tPM, tSignature, tType, tModifier, tName, mDefinition, tDefinition, mType,
						sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_binding = pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_bindingFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_binding != null) {
			TypeGraph tPM = (TypeGraph) result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_binding[0];
			TMethodSignature tSignature = (TMethodSignature) result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_binding[1];
			TClass tType = (TClass) result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_binding[2];
			TModifier tModifier = (TModifier) result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_binding[3];
			TMethod tName = (TMethod) result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_binding[4];
			MInitializer mDefinition = (MInitializer) result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_binding[5];
			TMethodDefinition tDefinition = (TMethodDefinition) result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_binding[6];
			AnonymousClassDeclaration mType = (AnonymousClassDeclaration) result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_binding[7];

			Object[] result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_black = pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_blackBBBBBBBBBB(
					tPM, tSignature, tType, tModifier, tName, mDefinition, tDefinition, mType, sourceMatch,
					targetMatch);
			if (result_pattern_InitializerInAnonymous_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tPM, tSignature, tType, tModifier, tName, mDefinition, tDefinition, mType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_24_3_solvecsp_bindingFBBBBBBBBBBB(
			InitializerInAnonymous _this, TypeGraph tPM, TMethodSignature tSignature, TClass tType, TModifier tModifier,
			TMethod tName, MInitializer mDefinition, TMethodDefinition tDefinition, AnonymousClassDeclaration mType,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_8 = _this.isApplicable_solveCsp_CC(tPM, tSignature, tType, tModifier, tName, mDefinition,
				tDefinition, mType, sourceMatch, targetMatch);
		CSP csp = _localVariable_8;
		if (csp != null) {
			return new Object[] { csp, _this, tPM, tSignature, tType, tModifier, tName, mDefinition, tDefinition, mType,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InitializerInAnonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBB(
			InitializerInAnonymous _this, TypeGraph tPM, TMethodSignature tSignature, TClass tType, TModifier tModifier,
			TMethod tName, MInitializer mDefinition, TMethodDefinition tDefinition, AnonymousClassDeclaration mType,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InitializerInAnonymous_24_3_solvecsp_binding = pattern_InitializerInAnonymous_24_3_solvecsp_bindingFBBBBBBBBBBB(
				_this, tPM, tSignature, tType, tModifier, tName, mDefinition, tDefinition, mType, sourceMatch,
				targetMatch);
		if (result_pattern_InitializerInAnonymous_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InitializerInAnonymous_24_3_solvecsp_binding[0];

			Object[] result_pattern_InitializerInAnonymous_24_3_solvecsp_black = pattern_InitializerInAnonymous_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InitializerInAnonymous_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tPM, tSignature, tType, tModifier, tName, mDefinition, tDefinition,
						mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InitializerInAnonymous_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InitializerInAnonymous_24_5_matchcorrcontext_blackBFBBB(TClass tType,
			AnonymousClassDeclaration mType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (AnonymousClassDeclarationToTClass mTypeToTTYpe : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tType, AnonymousClassDeclarationToTClass.class, "target")) {
				if (mType.equals(mTypeToTTYpe.getSource())) {
					_result.add(new Object[] { tType, mTypeToTTYpe, mType, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_24_5_matchcorrcontext_greenBBBF(
			AnonymousClassDeclarationToTClass mTypeToTTYpe, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InitializerInAnonymous";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTTYpe);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTTYpe, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InitializerInAnonymous_24_6_createcorrespondence_blackBBBBBBBBB(TypeGraph tPM,
			TMethodSignature tSignature, TClass tType, TModifier tModifier, TMethod tName, MInitializer mDefinition,
			TMethodDefinition tDefinition, AnonymousClassDeclaration mType, CCMatch ccMatch) {
		return new Object[] { tPM, tSignature, tType, tModifier, tName, mDefinition, tDefinition, mType, ccMatch };
	}

	public static final Object[] pattern_InitializerInAnonymous_24_6_createcorrespondence_greenFBBFB(
			MInitializer mDefinition, TMethodDefinition tDefinition, CCMatch ccMatch) {
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		mDefinitionToTMember.setTarget(tDefinition);
		mDefinitionToTMember.setSource(mDefinition);
		ccMatch.getCreateCorr().add(mDefinitionToTMember);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ccMatch.getCreateCorr().add(mBodyToTAnnotation);
		return new Object[] { mDefinitionToTMember, mDefinition, tDefinition, mBodyToTAnnotation, ccMatch };
	}

	public static final Object[] pattern_InitializerInAnonymous_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InitializerInAnonymous_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InitializerInAnonymous";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InitializerInAnonymous_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_27_1_matchtggpattern_black_nac_0B(
			MInitializer mDefinition) {
		MSignature __DEC_mDefinition_mDefinitions_313912 = mDefinition.getMSignature();
		if (__DEC_mDefinition_mDefinitions_313912 != null) {
			return new Object[] { mDefinition };
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_27_1_matchtggpattern_blackBB(MInitializer mDefinition,
			AnonymousClassDeclaration mType) {
		if (mType.getBodyDeclarations().contains(mDefinition)) {
			if (pattern_InitializerInAnonymous_27_1_matchtggpattern_black_nac_0B(mDefinition) == null) {
				return new Object[] { mDefinition, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_InitializerInAnonymous_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InitializerInAnonymous_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_0BB(
			TMethodSignature tSignature, TClass tType) {
		TAbstractType __DEC_tSignature_returnType_299452 = tSignature.getReturnType();
		if (__DEC_tSignature_returnType_299452 != null) {
			if (!tType.equals(__DEC_tSignature_returnType_299452)) {
				return new Object[] { tSignature, tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_1BB(
			TMethodSignature tSignature, TMethod tName) {
		TMethod __DEC_tSignature_signatures_184839 = tSignature.getMethod();
		if (__DEC_tSignature_signatures_184839 != null) {
			if (!tName.equals(__DEC_tSignature_signatures_184839)) {
				return new Object[] { tSignature, tName };
			}
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_2BB(TModifier tModifier,
			TClass tType) {
		for (TAbstractType __DEC_tModifier_tModifier_533241 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tType.equals(__DEC_tModifier_tModifier_533241)) {
				return new Object[] { tModifier, tType };
			}
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_3BB(TMethod tName,
			TypeGraph tPM) {
		TypeGraph __DEC_tName_methods_889863 = tName.getModel();
		if (__DEC_tName_methods_889863 != null) {
			if (!tPM.equals(__DEC_tName_methods_889863)) {
				return new Object[] { tName, tPM };
			}
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_4BB(
			TMethodDefinition tDefinition, TClass tType) {
		TAbstractType __DEC_tDefinition_returnType_813271 = tDefinition.getReturnType();
		if (__DEC_tDefinition_returnType_813271 != null) {
			if (!tType.equals(__DEC_tDefinition_returnType_813271)) {
				return new Object[] { tDefinition, tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_5B(
			TMethodDefinition tDefinition) {
		TModule __DEC_tDefinition_contains_252570 = tDefinition.getModule();
		if (__DEC_tDefinition_contains_252570 != null) {
			return new Object[] { tDefinition };
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_6BB(
			TMethodDefinition tDefinition, TMethodSignature tSignature) {
		TSignature __DEC_tDefinition_definitions_818346 = tDefinition.getSignature();
		if (__DEC_tDefinition_definitions_818346 != null) {
			if (!tSignature.equals(__DEC_tDefinition_definitions_818346)) {
				return new Object[] { tDefinition, tSignature };
			}
		}

		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_7BB(
			TMethodSignature tSignature, TClass tType) {
		if (tType.equals(tSignature.getReturnType())) {
			return new Object[] { tSignature, tType };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_8BB(TClass tType,
			TModifier tModifier) {
		if (tModifier.equals(tType.getTModifier())) {
			return new Object[] { tType, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_9BB(
			TMethodDefinition tDefinition, TClass tType) {
		if (tType.equals(tDefinition.getReturnType())) {
			return new Object[] { tDefinition, tType };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_blackBBBBBB(TypeGraph tPM,
			TMethodSignature tSignature, TClass tType, TModifier tModifier, TMethod tName,
			TMethodDefinition tDefinition) {
		if (tPM.equals(tName.getModel())) {
			if (tType.getSignature().contains(tSignature)) {
				if (tModifier.equals(tDefinition.getTModifier())) {
					if (tPM.equals(tType.getModel())) {
						if (tType.getDefines().contains(tDefinition)) {
							if (tName.equals(tSignature.getMethod())) {
								if (tSignature.equals(tDefinition.getSignature())) {
									if (pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_0BB(tSignature,
											tType) == null) {
										if (pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_1BB(
												tSignature, tName) == null) {
											if (pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_2BB(
													tModifier, tType) == null) {
												if (pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_3BB(
														tName, tPM) == null) {
													if (pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_4BB(
															tDefinition, tType) == null) {
														if (pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_5B(
																tDefinition) == null) {
															if (pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_6BB(
																	tDefinition, tSignature) == null) {
																if (pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_7BB(
																		tSignature, tType) == null) {
																	if (pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_8BB(
																			tType, tModifier) == null) {
																		if (pattern_InitializerInAnonymous_28_1_matchtggpattern_black_nac_9BB(
																				tDefinition, tType) == null) {
																			return new Object[] { tPM, tSignature,
																					tType, tModifier, tName,
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
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_28_1_matchtggpattern_greenB(TModifier tModifier) {
		boolean tModifier_isStatic_prime = Boolean.valueOf(true);
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		return new Object[] { tModifier };
	}

	public static final boolean pattern_InitializerInAnonymous_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InitializerInAnonymous_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_29_1_createresult_blackB(InitializerInAnonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InitializerInAnonymous_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InitializerInAnonymous_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph tPM) {
		if (ruleResult.getTargetObjects().contains(tPM)) {
			return new Object[] { ruleResult, tPM };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TClass tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclarationToTClass mTypeToTTYpe) {
		if (ruleResult.getCorrObjects().contains(mTypeToTTYpe)) {
			return new Object[] { ruleResult, mTypeToTTYpe };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InitializerInAnonymous_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTYpeList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMTypeToTTYpe : mTypeToTTYpeList.getEntryObjects()) {
				if (tmpMTypeToTTYpe instanceof AnonymousClassDeclarationToTClass) {
					AnonymousClassDeclarationToTClass mTypeToTTYpe = (AnonymousClassDeclarationToTClass) tmpMTypeToTTYpe;
					TClass tType = mTypeToTTYpe.getTarget();
					if (tType != null) {
						AnonymousClassDeclaration mType = mTypeToTTYpe.getSource();
						if (mType != null) {
							TypeGraph tPM = tType.getModel();
							if (tPM != null) {
								if (pattern_InitializerInAnonymous_29_2_isapplicablecore_black_nac_2BB(ruleResult,
										mTypeToTTYpe) == null) {
									if (pattern_InitializerInAnonymous_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											tType) == null) {
										if (pattern_InitializerInAnonymous_29_2_isapplicablecore_black_nac_3BB(
												ruleResult, mType) == null) {
											if (pattern_InitializerInAnonymous_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, tPM) == null) {
												_result.add(new Object[] { mTypeToTTYpeList, tPM, tType, mTypeToTTYpe,
														mType, ruleEntryContainer, ruleResult });
											}
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

	public static final Object[] pattern_InitializerInAnonymous_29_3_solveCSP_bindingFBBBBBBB(
			InitializerInAnonymous _this, IsApplicableMatch isApplicableMatch, TypeGraph tPM, TClass tType,
			AnonymousClassDeclarationToTClass mTypeToTTYpe, AnonymousClassDeclaration mType,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tPM, tType, mTypeToTTYpe, mType,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tPM, tType, mTypeToTTYpe, mType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InitializerInAnonymous_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InitializerInAnonymous_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			InitializerInAnonymous _this, IsApplicableMatch isApplicableMatch, TypeGraph tPM, TClass tType,
			AnonymousClassDeclarationToTClass mTypeToTTYpe, AnonymousClassDeclaration mType,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InitializerInAnonymous_29_3_solveCSP_binding = pattern_InitializerInAnonymous_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tPM, tType, mTypeToTTYpe, mType, ruleResult);
		if (result_pattern_InitializerInAnonymous_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InitializerInAnonymous_29_3_solveCSP_binding[0];

			Object[] result_pattern_InitializerInAnonymous_29_3_solveCSP_black = pattern_InitializerInAnonymous_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InitializerInAnonymous_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tPM, tType, mTypeToTTYpe, mType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InitializerInAnonymous_29_4_checkCSP_expressionFBB(InitializerInAnonymous _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InitializerInAnonymous_29_5_checknacs_blackBBBB(TypeGraph tPM, TClass tType,
			AnonymousClassDeclarationToTClass mTypeToTTYpe, AnonymousClassDeclaration mType) {
		return new Object[] { tPM, tType, mTypeToTTYpe, mType };
	}

	public static final Object[] pattern_InitializerInAnonymous_29_6_perform_blackBBBBB(TypeGraph tPM, TClass tType,
			AnonymousClassDeclarationToTClass mTypeToTTYpe, AnonymousClassDeclaration mType,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tPM, tType, mTypeToTTYpe, mType, ruleResult };
	}

	public static final Object[] pattern_InitializerInAnonymous_29_6_perform_greenBFBFFFFFFBBB(TypeGraph tPM,
			TClass tType, AnonymousClassDeclaration mType, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TMethodSignature tSignature = BasicFactory.eINSTANCE.createTMethodSignature();
		MDefinitionToTMember mDefinitionToTMember = PmFactory.eINSTANCE.createMDefinitionToTMember();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		TMethod tName = BasicFactory.eINSTANCE.createTMethod();
		MInitializer mDefinition = ModiscoFactory.eINSTANCE.createMInitializer();
		TMethodDefinition tDefinition = BasicFactory.eINSTANCE.createTMethodDefinition();
		ASTNodeToTAnnotatable mBodyToTAnnotation = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		boolean tModifier_isStatic_prime = Boolean.valueOf(true);
		Object _localVariable_0 = csp.getValue("tName", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		tType.getSignature().add(tSignature);
		ruleResult.getTargetObjects().add(tSignature);
		ruleResult.getCorrObjects().add(mDefinitionToTMember);
		ruleResult.getTargetObjects().add(tModifier);
		tName.setModel(tPM);
		tSignature.setMethod(tName);
		ruleResult.getTargetObjects().add(tName);
		mDefinitionToTMember.setSource(mDefinition);
		mType.getBodyDeclarations().add(mDefinition);
		ruleResult.getSourceObjects().add(mDefinition);
		tDefinition.setTModifier(tModifier);
		mDefinitionToTMember.setTarget(tDefinition);
		tType.getDefines().add(tDefinition);
		tDefinition.setSignature(tSignature);
		ruleResult.getTargetObjects().add(tDefinition);
		mBodyToTAnnotation.setSource(mDefinition);
		mBodyToTAnnotation.setTarget(tDefinition);
		ruleResult.getCorrObjects().add(mBodyToTAnnotation);
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		String tName_tName_prime = (String) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		tName.setTName(tName_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tPM, tSignature, tType, mDefinitionToTMember, tModifier, tName, mDefinition, tDefinition,
				mBodyToTAnnotation, mType, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_InitializerInAnonymous_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InitializerInAnonymousImpl
