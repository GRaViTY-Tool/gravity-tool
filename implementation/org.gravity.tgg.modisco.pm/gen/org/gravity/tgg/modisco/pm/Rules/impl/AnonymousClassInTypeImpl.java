/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractMethodInvocation;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.EnumConstantDeclaration;
import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MAnonymousClass;
import org.gravity.modisco.MClassInstanceCreation;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.AnonymousClassDeclarationToTClass;
import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.AnonymousClassInType;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TPackage;
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
 * An implementation of the model object '<em><b>Anonymous Class In Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnonymousClassInTypeImpl extends AbstractRuleImpl implements AnonymousClassInType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClassInTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnonymousClassInType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MClassInstanceCreation mCreation, MDefinition mMember,
			MAnonymousClass mAnonymous, AbstractTypeDeclaration mType) {

		Object[] result1_black = AnonymousClassInTypeImpl.pattern_AnonymousClassInType_0_1_initialbindings_blackBBBBBB(
				this, match, mCreation, mMember, mAnonymous, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mCreation] = " + mCreation + ", " + "[mMember] = " + mMember
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mCreation, mMember,
						mAnonymous, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mCreation] = " + mCreation + ", " + "[mMember] = " + mMember
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClassInTypeImpl.pattern_AnonymousClassInType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_0_4_collectelementstobetranslated_blackBBBBB(match, mCreation,
							mMember, mAnonymous, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mCreation] = " + mCreation + ", " + "[mMember] = " + mMember + ", " + "[mAnonymous] = "
						+ mAnonymous + ", " + "[mType] = " + mType + ".");
			}
			AnonymousClassInTypeImpl.pattern_AnonymousClassInType_0_4_collectelementstobetranslated_greenBBBFF(match,
					mCreation, mAnonymous);
			//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result4_green[4];

			Object[] result5_black = AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_0_5_collectcontextelements_blackBBBBB(match, mCreation, mMember,
							mAnonymous, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mCreation] = " + mCreation + ", " + "[mMember] = " + mMember + ", " + "[mAnonymous] = "
						+ mAnonymous + ", " + "[mType] = " + mType + ".");
			}
			AnonymousClassInTypeImpl.pattern_AnonymousClassInType_0_5_collectcontextelements_greenBBBBFFF(match,
					mCreation, mMember, mType);
			//nothing EMoflonEdge mType__mMember____bodyDeclarations = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge mMember__mType____abstractTypeDeclaration = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge mMember__mCreation____mMethodInvocations = (EMoflonEdge) result5_green[6];

			// 
			AnonymousClassInTypeImpl.pattern_AnonymousClassInType_0_6_registerobjectstomatch_expressionBBBBBB(this,
					match, mCreation, mMember, mAnonymous, mType);
			return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_0_7_expressionF();
		} else {
			return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		MClassInstanceCreation mCreation = (MClassInstanceCreation) result1_bindingAndBlack[1];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[2];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[3];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[4];
		TMember tMember = (TMember) result1_bindingAndBlack[5];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[6];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[7];
		MAnonymousClass mAnonymous = (MAnonymousClass) result1_bindingAndBlack[8];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_1_1_performtransformation_greenFBBBBFB(tType, tPackage, pg, mAnonymous,
						csp);
		TClass tAnonymous = (TClass) result1_green[0];
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_green[5];

		Object[] result2_black = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_1_2_collecttranslatedelements_blackBBB(tAnonymous, mAnonymous,
						eAnonymousClassDeclarationToTClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnonymous] = " + tAnonymous
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ".");
		}
		Object[] result2_green = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_1_2_collecttranslatedelements_greenFBBB(tAnonymous, mAnonymous,
						eAnonymousClassDeclarationToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, mMemberToTMember,
						mCreation, tAnonymous, mTypeToTType, tType, tPackage, tMember, pg, mMember, mAnonymous,
						eAnonymousClassDeclarationToTClass, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mMemberToTMember] = " + mMemberToTMember + ", " + "[mCreation] = " + mCreation + ", "
					+ "[tAnonymous] = " + tAnonymous + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = "
					+ tType + ", " + "[tPackage] = " + tPackage + ", " + "[tMember] = " + tMember + ", " + "[pg] = "
					+ pg + ", " + "[mMember] = " + mMember + ", " + "[mAnonymous] = " + mAnonymous + ", "
					+ "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[mType] = " + mType + ".");
		}
		AnonymousClassInTypeImpl.pattern_AnonymousClassInType_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(
				ruleresult, mCreation, tAnonymous, tType, tPackage, pg, mAnonymous, eAnonymousClassDeclarationToTClass);
		//nothing EMoflonEdge tPackage__tAnonymous____allTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnonymous__tPackage____package = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge pg__tAnonymous____allTypes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tAnonymous__pg____model = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tPackage__tAnonymous____classes = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result3_green[19];

		// 
		// 
		AnonymousClassInTypeImpl.pattern_AnonymousClassInType_1_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType, tPackage, tMember, pg,
				mMember, mAnonymous, eAnonymousClassDeclarationToTClass, mType);
		return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MClassInstanceCreation mCreation = (MClassInstanceCreation) result2_binding[0];
		MDefinition mMember = (MDefinition) result2_binding[1];
		MAnonymousClass mAnonymous = (MAnonymousClass) result2_binding[2];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[3];
		for (Object[] result2_black : AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_2_2_corematch_blackFBFFFBBBB(mCreation, mMember, mAnonymous, mType,
						match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			TAbstractType tType = (TAbstractType) result2_black[3];
			TMember tMember = (TMember) result2_black[4];
			// ForEach 
			for (Object[] result3_black : AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_2_3_findcontext_blackBBBBFBFBBB(mMemberToTMember, mCreation,
							mTypeToTType, tType, tMember, mMember, mAnonymous, mType)) {
				TPackage tPackage = (TPackage) result3_black[4];
				TypeGraph pg = (TypeGraph) result3_black[6];
				Object[] result3_green = AnonymousClassInTypeImpl
						.pattern_AnonymousClassInType_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFF(mMemberToTMember,
								mCreation, mTypeToTType, tType, tPackage, tMember, pg, mMember, mAnonymous, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge mType__mMember____bodyDeclarations = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mMember__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mMember__mCreation____mMethodInvocations = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tType__tMember____defines = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tMember__tType____definedBy = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[24];

				Object[] result4_bindingAndBlack = AnonymousClassInTypeImpl
						.pattern_AnonymousClassInType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
								mMemberToTMember, mCreation, mTypeToTType, tType, tPackage, tMember, pg, mMember,
								mAnonymous, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
							+ mMemberToTMember + ", " + "[mCreation] = " + mCreation + ", " + "[mTypeToTType] = "
							+ mTypeToTType + ", " + "[tType] = " + tType + ", " + "[tPackage] = " + tPackage + ", "
							+ "[tMember] = " + tMember + ", " + "[pg] = " + pg + ", " + "[mMember] = " + mMember + ", "
							+ "[mAnonymous] = " + mAnonymous + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClassInTypeImpl.pattern_AnonymousClassInType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousClassInTypeImpl
							.pattern_AnonymousClassInType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClassInTypeImpl.pattern_AnonymousClassInType_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MClassInstanceCreation mCreation, MDefinition mMember,
			MAnonymousClass mAnonymous, AbstractTypeDeclaration mType) {
		match.registerObject("mCreation", mCreation);
		match.registerObject("mMember", mMember);
		match.registerObject("mAnonymous", mAnonymous);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MClassInstanceCreation mCreation, MDefinition mMember,
			MAnonymousClass mAnonymous, AbstractTypeDeclaration mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_mAnonymous_index = CSPFactoryHelper.eINSTANCE.createVariable("mAnonymous.index", true, csp);
		var_mAnonymous_index.setValue(mAnonymous.getIndex());
		var_mAnonymous_index.setType("int");

		// Create unbound variables
		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tLib", csp);
		var_tAnonymous_tLib.setType("Boolean");
		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tName", csp);
		var_tAnonymous_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tType_tLib, var_tAnonymous_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tType_tName, var_mAnonymous_index, var_tAnonymous_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("mCreation", mCreation);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("mAnonymous", mAnonymous);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mMemberToTMember, EObject mCreation,
			EObject tAnonymous, EObject mTypeToTType, EObject tType, EObject tPackage, EObject tMember, EObject pg,
			EObject mMember, EObject mAnonymous, EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("mCreation", mCreation);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAnonymous").eClass())
				.equals("modisco.MAnonymousClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tAnonymous, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg) {

		Object[] result1_black = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_10_1_initialbindings_blackBBBBBBB(this, match, tAnonymous, tType,
						tPackage, tMember, pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tType] = " + tType + ", "
					+ "[tPackage] = " + tPackage + ", " + "[tMember] = " + tMember + ", " + "[pg] = " + pg + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, tAnonymous, tType,
						tPackage, tMember, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tType] = " + tType + ", "
					+ "[tPackage] = " + tPackage + ", " + "[tMember] = " + tMember + ", " + "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClassInTypeImpl.pattern_AnonymousClassInType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_10_4_collectelementstobetranslated_blackBBBBBB(match, tAnonymous,
							tType, tPackage, tMember, pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnonymous] = " + tAnonymous + ", " + "[tType] = " + tType + ", " + "[tPackage] = "
						+ tPackage + ", " + "[tMember] = " + tMember + ", " + "[pg] = " + pg + ".");
			}
			AnonymousClassInTypeImpl.pattern_AnonymousClassInType_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(
					match, tAnonymous, tType, tPackage, pg);
			//nothing EMoflonEdge tPackage__tAnonymous____allTypes = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tAnonymous__tPackage____package = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge pg__tAnonymous____allTypes = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge tAnonymous__pg____model = (EMoflonEdge) result4_green[9];
			//nothing EMoflonEdge tPackage__tAnonymous____classes = (EMoflonEdge) result4_green[10];
			//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result4_green[11];
			//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result4_green[12];

			Object[] result5_black = AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_10_5_collectcontextelements_blackBBBBBB(match, tAnonymous, tType,
							tPackage, tMember, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tAnonymous] = " + tAnonymous + ", " + "[tType] = " + tType + ", " + "[tPackage] = "
						+ tPackage + ", " + "[tMember] = " + tMember + ", " + "[pg] = " + pg + ".");
			}
			AnonymousClassInTypeImpl.pattern_AnonymousClassInType_10_5_collectcontextelements_greenBBBBBFFFFF(match,
					tType, tPackage, tMember, pg);
			//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge tType__tMember____defines = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge tMember__tType____definedBy = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result5_green[8];
			//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result5_green[9];

			// 
			AnonymousClassInTypeImpl.pattern_AnonymousClassInType_10_6_registerobjectstomatch_expressionBBBBBBB(this,
					match, tAnonymous, tType, tPackage, tMember, pg);
			return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_10_7_expressionF();
		} else {
			return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result1_bindingAndBlack[0];
		MClassInstanceCreation mCreation = (MClassInstanceCreation) result1_bindingAndBlack[1];
		TClass tAnonymous = (TClass) result1_bindingAndBlack[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[3];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[4];
		TPackage tPackage = (TPackage) result1_bindingAndBlack[5];
		TMember tMember = (TMember) result1_bindingAndBlack[6];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[7];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[8];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[9];
		CSP csp = (CSP) result1_bindingAndBlack[10];
		Object[] result1_green = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_11_1_performtransformation_greenBBFFB(mCreation, tAnonymous, csp);
		MAnonymousClass mAnonymous = (MAnonymousClass) result1_green[2];
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result1_green[3];

		Object[] result2_black = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_11_2_collecttranslatedelements_blackBBB(tAnonymous, mAnonymous,
						eAnonymousClassDeclarationToTClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tAnonymous] = " + tAnonymous
					+ ", " + "[mAnonymous] = " + mAnonymous + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ".");
		}
		Object[] result2_green = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_11_2_collecttranslatedelements_greenFBBB(tAnonymous, mAnonymous,
						eAnonymousClassDeclarationToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(ruleresult, mMemberToTMember,
						mCreation, tAnonymous, mTypeToTType, tType, tPackage, tMember, pg, mMember, mAnonymous,
						eAnonymousClassDeclarationToTClass, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mMemberToTMember] = " + mMemberToTMember + ", " + "[mCreation] = " + mCreation + ", "
					+ "[tAnonymous] = " + tAnonymous + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = "
					+ tType + ", " + "[tPackage] = " + tPackage + ", " + "[tMember] = " + tMember + ", " + "[pg] = "
					+ pg + ", " + "[mMember] = " + mMember + ", " + "[mAnonymous] = " + mAnonymous + ", "
					+ "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[mType] = " + mType + ".");
		}
		AnonymousClassInTypeImpl.pattern_AnonymousClassInType_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(
				ruleresult, mCreation, tAnonymous, tType, tPackage, pg, mAnonymous, eAnonymousClassDeclarationToTClass);
		//nothing EMoflonEdge tPackage__tAnonymous____allTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tAnonymous__tPackage____package = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge pg__tAnonymous____allTypes = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tAnonymous__pg____model = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge tPackage__tAnonymous____classes = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mAnonymous__mCreation____classInstanceCreation = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result3_green[19];

		// 
		// 
		AnonymousClassInTypeImpl.pattern_AnonymousClassInType_11_5_registerobjects_expressionBBBBBBBBBBBBBB(this,
				ruleresult, mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType, tPackage, tMember, pg,
				mMember, mAnonymous, eAnonymousClassDeclarationToTClass, mType);
		return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tAnonymous = (TClass) result2_binding[0];
		TAbstractType tType = (TAbstractType) result2_binding[1];
		TPackage tPackage = (TPackage) result2_binding[2];
		TMember tMember = (TMember) result2_binding[3];
		TypeGraph pg = (TypeGraph) result2_binding[4];
		for (Object[] result2_black : AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_12_2_corematch_blackFBFBBBBFFB(tAnonymous, tType, tPackage, tMember, pg,
						match)) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			MDefinition mMember = (MDefinition) result2_black[7];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[8];
			// ForEach 
			for (Object[] result3_black : AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_12_3_findcontext_blackBFBBBBBBBB(mMemberToTMember, tAnonymous,
							mTypeToTType, tType, tPackage, tMember, pg, mMember, mType)) {
				MClassInstanceCreation mCreation = (MClassInstanceCreation) result3_black[1];
				Object[] result3_green = AnonymousClassInTypeImpl
						.pattern_AnonymousClassInType_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
								mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType, tPackage, tMember, pg,
								mMember, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[10];
				//nothing EMoflonEdge tPackage__tAnonymous____allTypes = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tAnonymous__tPackage____package = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mType__mMember____bodyDeclarations = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mMember__mType____abstractTypeDeclaration = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mMemberToTMember__mMember____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mMember__mCreation____mMethodInvocations = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge pg__tAnonymous____classes = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tPackage__pg____model = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge tType__tMember____defines = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge tMember__tType____definedBy = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge pg__tAnonymous____allTypes = (EMoflonEdge) result3_green[21];
				//nothing EMoflonEdge tAnonymous__pg____model = (EMoflonEdge) result3_green[22];
				//nothing EMoflonEdge tPackage__tAnonymous____classes = (EMoflonEdge) result3_green[23];
				//nothing EMoflonEdge tType__tPackage____package = (EMoflonEdge) result3_green[24];
				//nothing EMoflonEdge tPackage__tType____allTypes = (EMoflonEdge) result3_green[25];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[26];
				//nothing EMoflonEdge mMemberToTMember__tMember____target = (EMoflonEdge) result3_green[27];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[28];
				//nothing EMoflonEdge tType__tAnonymous____innerTypes = (EMoflonEdge) result3_green[29];
				//nothing EMoflonEdge tAnonymous__tType____outerType = (EMoflonEdge) result3_green[30];

				Object[] result4_bindingAndBlack = AnonymousClassInTypeImpl
						.pattern_AnonymousClassInType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this,
								isApplicableMatch, mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType,
								tPackage, tMember, pg, mMember, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
							+ mMemberToTMember + ", " + "[mCreation] = " + mCreation + ", " + "[tAnonymous] = "
							+ tAnonymous + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType
							+ ", " + "[tPackage] = " + tPackage + ", " + "[tMember] = " + tMember + ", " + "[pg] = "
							+ pg + ", " + "[mMember] = " + mMember + ", " + "[mType] = " + mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClassInTypeImpl.pattern_AnonymousClassInType_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousClassInTypeImpl
							.pattern_AnonymousClassInType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClassInTypeImpl.pattern_AnonymousClassInType_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tAnonymous, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg) {
		match.registerObject("tAnonymous", tAnonymous);
		match.registerObject("tType", tType);
		match.registerObject("tPackage", tPackage);
		match.registerObject("tMember", tMember);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tAnonymous, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");
		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tLib", true, csp);
		var_tAnonymous_tLib.setValue(tAnonymous.isTLib());
		var_tAnonymous_tLib.setType("Boolean");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tType_tLib, var_tAnonymous_tLib);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MClassInstanceCreation mCreation, TClass tAnonymous, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember, AbstractTypeDeclaration mType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tName", true, csp);
		var_tAnonymous_tName.setValue(tAnonymous.getTName());
		var_tAnonymous_tName.setType("String");

		// Create unbound variables
		Variable var_mAnonymous_index = CSPFactoryHelper.eINSTANCE.createVariable("mAnonymous.index", csp);
		var_mAnonymous_index.setType("int");

		// Create constraints
		Concat concat = new Concat();

		csp.getConstraints().add(concat);

		// Solve CSP
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tType_tName, var_mAnonymous_index, var_tAnonymous_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("mCreation", mCreation);
		isApplicableMatch.registerObject("tAnonymous", tAnonymous);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mMember", mMember);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mMemberToTMember, EObject mCreation,
			EObject tAnonymous, EObject mTypeToTType, EObject tType, EObject tPackage, EObject tMember, EObject pg,
			EObject mMember, EObject mAnonymous, EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		ruleresult.registerObject("mMemberToTMember", mMemberToTMember);
		ruleresult.registerObject("mCreation", mCreation);
		ruleresult.registerObject("tAnonymous", tAnonymous);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("tPackage", tPackage);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("mAnonymous", mAnonymous);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tAnonymous").eClass())
				.equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_80(EMoflonEdge _edge_allTypes) {

		Object[] result1_bindingAndBlack = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClassInTypeImpl.pattern_AnonymousClassInType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_20_2_testcorematchandDECs_blackFFFFFB(_edge_allTypes)) {
			TClass tAnonymous = (TClass) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			TPackage tPackage = (TPackage) result2_black[2];
			TMember tMember = (TMember) result2_black[3];
			TypeGraph pg = (TypeGraph) result2_black[4];
			Object[] result2_green = AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, tAnonymous, tType, tPackage, tMember, pg)) {
				// 
				if (AnonymousClassInTypeImpl
						.pattern_AnonymousClassInType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClassInTypeImpl
							.pattern_AnonymousClassInType_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClassInTypeImpl.pattern_AnonymousClassInType_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_86(EMoflonEdge _edge_anonymousClassDeclaration) {

		Object[] result1_bindingAndBlack = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClassInTypeImpl.pattern_AnonymousClassInType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_21_2_testcorematchandDECs_blackFFFFB(_edge_anonymousClassDeclaration)) {
			MClassInstanceCreation mCreation = (MClassInstanceCreation) result2_black[0];
			MDefinition mMember = (MDefinition) result2_black[1];
			MAnonymousClass mAnonymous = (MAnonymousClass) result2_black[2];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[3];
			Object[] result2_green = AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, mCreation, mMember, mAnonymous, mType)) {
				// 
				if (AnonymousClassInTypeImpl
						.pattern_AnonymousClassInType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClassInTypeImpl
							.pattern_AnonymousClassInType_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClassInTypeImpl.pattern_AnonymousClassInType_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnonymousClassInType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous", true, csp);
		var_tAnonymous_tLib.setValue(__helper.getValue("tAnonymous", "tLib"));
		var_tAnonymous_tLib.setType("boolean");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Variable var_mAnonymous_index = CSPFactoryHelper.eINSTANCE.createVariable("mAnonymous", true, csp);
		var_mAnonymous_index.setValue(__helper.getValue("mAnonymous", "index"));
		var_mAnonymous_index.setType("int");

		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous", true, csp);
		var_tAnonymous_tName.setValue(__helper.getValue("tAnonymous", "tName"));
		var_tAnonymous_tName.setType("String");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Concat concat1 = new Concat();
		csp.getConstraints().add(concat1);

		eq0.setRuleName("AnonymousClassInType");
		eq0.solve(var_tType_tLib, var_tAnonymous_tLib);

		concat1.setRuleName("AnonymousClassInType");
		concat1.solve(var_literal0, var_tType_tName, var_mAnonymous_index, var_tAnonymous_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tAnonymous_tLib.setBound(false);
			var_tAnonymous_tName.setBound(false);
			eq0.solve(var_tType_tLib, var_tAnonymous_tLib);
			concat1.solve(var_literal0, var_tType_tName, var_mAnonymous_index, var_tAnonymous_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tAnonymous", "tLib", var_tAnonymous_tLib.getValue());
				__helper.setValue("tAnonymous", "tName", var_tAnonymous_tName.getValue());
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
		ruleResult.setRule("AnonymousClassInType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous", true, csp);
		var_tAnonymous_tLib.setValue(__helper.getValue("tAnonymous", "tLib"));
		var_tAnonymous_tLib.setType("boolean");

		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tLib.setValue(__helper.getValue("tType", "tLib"));
		var_tType_tLib.setType("boolean");

		Variable var_mAnonymous_index = CSPFactoryHelper.eINSTANCE.createVariable("mAnonymous", true, csp);
		var_mAnonymous_index.setValue(__helper.getValue("mAnonymous", "index"));
		var_mAnonymous_index.setType("int");

		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous", true, csp);
		var_tAnonymous_tName.setValue(__helper.getValue("tAnonymous", "tName"));
		var_tAnonymous_tName.setType("String");

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("$");
		var_literal0.setType("");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Concat concat1 = new Concat();
		csp.getConstraints().add(concat1);

		eq0.setRuleName("AnonymousClassInType");
		eq0.solve(var_tType_tLib, var_tAnonymous_tLib);

		concat1.setRuleName("AnonymousClassInType");
		concat1.solve(var_literal0, var_tType_tName, var_mAnonymous_index, var_tAnonymous_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mAnonymous_index.setBound(false);
			eq0.solve(var_tType_tLib, var_tAnonymous_tLib);
			concat1.solve(var_literal0, var_tType_tName, var_mAnonymous_index, var_tAnonymous_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mAnonymous", "index", var_mAnonymous_index.getValue());
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

		Object[] result1_black = AnonymousClassInTypeImpl.pattern_AnonymousClassInType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClassInTypeImpl.pattern_AnonymousClassInType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MClassInstanceCreation mCreation = (MClassInstanceCreation) result2_bindingAndBlack[0];
		TClass tAnonymous = (TClass) result2_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[2];
		TPackage tPackage = (TPackage) result2_bindingAndBlack[3];
		TMember tMember = (TMember) result2_bindingAndBlack[4];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[5];
		MDefinition mMember = (MDefinition) result2_bindingAndBlack[6];
		MAnonymousClass mAnonymous = (MAnonymousClass) result2_bindingAndBlack[7];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_bindingAndBlack[8];

		Object[] result3_bindingAndBlack = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBB(this, mCreation, tAnonymous,
						tType, tPackage, tMember, pg, mMember, mAnonymous, mType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mCreation] = " + mCreation + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tType] = " + tType
					+ ", " + "[tPackage] = " + tPackage + ", " + "[tMember] = " + tMember + ", " + "[pg] = " + pg + ", "
					+ "[mMember] = " + mMember + ", " + "[mAnonymous] = " + mAnonymous + ", " + "[mType] = " + mType
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnonymousClassInTypeImpl.pattern_AnonymousClassInType_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_24_5_matchcorrcontext_blackFFBBBBBB(tType, tMember, mMember, mType,
							sourceMatch, targetMatch)) {
				MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result5_black[0];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[1];
				Object[] result5_green = AnonymousClassInTypeImpl
						.pattern_AnonymousClassInType_24_5_matchcorrcontext_greenBBBBF(mMemberToTMember, mTypeToTType,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnonymousClassInTypeImpl
						.pattern_AnonymousClassInType_24_6_createcorrespondence_blackBBBBBBBBBB(mCreation, tAnonymous,
								tType, tPackage, tMember, pg, mMember, mAnonymous, mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mCreation] = "
							+ mCreation + ", " + "[tAnonymous] = " + tAnonymous + ", " + "[tType] = " + tType + ", "
							+ "[tPackage] = " + tPackage + ", " + "[tMember] = " + tMember + ", " + "[pg] = " + pg
							+ ", " + "[mMember] = " + mMember + ", " + "[mAnonymous] = " + mAnonymous + ", "
							+ "[mType] = " + mType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClassInTypeImpl.pattern_AnonymousClassInType_24_6_createcorrespondence_greenBBFB(tAnonymous,
						mAnonymous, ccMatch);
				//nothing AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result6_green[2];

				Object[] result7_black = AnonymousClassInTypeImpl
						.pattern_AnonymousClassInType_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClassInTypeImpl.pattern_AnonymousClassInType_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MClassInstanceCreation mCreation, TClass tAnonymous, TAbstractType tType,
			TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");
		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tLib", true, csp);
		var_tAnonymous_tLib.setValue(tAnonymous.isTLib());
		var_tAnonymous_tLib.setType("Boolean");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");
		Variable var_mAnonymous_index = CSPFactoryHelper.eINSTANCE.createVariable("mAnonymous.index", true, csp);
		var_mAnonymous_index.setValue(mAnonymous.getIndex());
		var_mAnonymous_index.setType("int");
		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tName", true, csp);
		var_tAnonymous_tName.setValue(tAnonymous.getTName());
		var_tAnonymous_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tType_tLib, var_tAnonymous_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tType_tName, var_mAnonymous_index, var_tAnonymous_tName);
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
	public boolean checkDEC_FWD(MClassInstanceCreation mCreation, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType) {// 
		Object[] result1_black = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_27_1_matchtggpattern_blackBBBB(mCreation, mMember, mAnonymous, mType);
		if (result1_black != null) {
			return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_27_2_expressionF();
		} else {
			return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tAnonymous, TAbstractType tType, TPackage tPackage, TMember tMember,
			TypeGraph pg) {// 
		Object[] result1_black = AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_28_1_matchtggpattern_blackBBBBB(tAnonymous, tType, tPackage, tMember, pg);
		if (result1_black != null) {
			return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_28_2_expressionF();
		} else {
			return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			MDefinitionToTMember mMemberToTMemberParameter) {

		Object[] result1_black = AnonymousClassInTypeImpl.pattern_AnonymousClassInType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClassInTypeImpl.pattern_AnonymousClassInType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnonymousClassInTypeImpl
				.pattern_AnonymousClassInType_29_2_isapplicablecore_blackFFFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mMemberToTMemberList = (RuleEntryList) result2_black[0];
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result2_black[1];
			MDefinition mMember = (MDefinition) result2_black[2];
			MClassInstanceCreation mCreation = (MClassInstanceCreation) result2_black[3];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[4];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[5];
			TAbstractType tType = (TAbstractType) result2_black[6];
			TMember tMember = (TMember) result2_black[7];
			TPackage tPackage = (TPackage) result2_black[8];
			TypeGraph pg = (TypeGraph) result2_black[9];

			Object[] result3_bindingAndBlack = AnonymousClassInTypeImpl
					.pattern_AnonymousClassInType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(this, isApplicableMatch,
							mMemberToTMember, mCreation, mTypeToTType, tType, tPackage, tMember, pg, mMember, mType,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mMemberToTMember] = "
						+ mMemberToTMember + ", " + "[mCreation] = " + mCreation + ", " + "[mTypeToTType] = "
						+ mTypeToTType + ", " + "[tType] = " + tType + ", " + "[tPackage] = " + tPackage + ", "
						+ "[tMember] = " + tMember + ", " + "[pg] = " + pg + ", " + "[mMember] = " + mMember + ", "
						+ "[mType] = " + mType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnonymousClassInTypeImpl.pattern_AnonymousClassInType_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnonymousClassInTypeImpl
						.pattern_AnonymousClassInType_29_5_checknacs_blackBBBBBBBBB(mMemberToTMember, mCreation,
								mTypeToTType, tType, tPackage, tMember, pg, mMember, mType);
				if (result5_black != null) {

					Object[] result6_black = AnonymousClassInTypeImpl
							.pattern_AnonymousClassInType_29_6_perform_blackBBBBBBBBBB(mMemberToTMember, mCreation,
									mTypeToTType, tType, tPackage, tMember, pg, mMember, mType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mMemberToTMember] = "
								+ mMemberToTMember + ", " + "[mCreation] = " + mCreation + ", " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tType] = " + tType + ", " + "[tPackage] = " + tPackage + ", "
								+ "[tMember] = " + tMember + ", " + "[pg] = " + pg + ", " + "[mMember] = " + mMember
								+ ", " + "[mType] = " + mType + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnonymousClassInTypeImpl.pattern_AnonymousClassInType_29_6_perform_greenBFBBBFFBB(mCreation, tType,
							tPackage, pg, ruleResult, csp);
					//nothing TClass tAnonymous = (TClass) result6_green[1];
					//nothing MAnonymousClass mAnonymous = (MAnonymousClass) result6_green[5];
					//nothing AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = (AnonymousClassDeclarationToTClass) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return AnonymousClassInTypeImpl.pattern_AnonymousClassInType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg, MDefinition mMember, AbstractTypeDeclaration mType,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("$");
		literal0.setType("");

		// Create attribute variables
		Variable var_tType_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tType.tLib", true, csp);
		var_tType_tLib.setValue(tType.isTLib());
		var_tType_tLib.setType("Boolean");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_tAnonymous_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tLib", csp);
		var_tAnonymous_tLib.setType("Boolean");
		Variable var_mAnonymous_index = CSPFactoryHelper.eINSTANCE.createVariable("mAnonymous.index", csp);
		var_mAnonymous_index.setType("int");
		Variable var_tAnonymous_tName = CSPFactoryHelper.eINSTANCE.createVariable("tAnonymous.tName", csp);
		var_tAnonymous_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Concat concat = new Concat();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(concat);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_tType_tLib, var_tAnonymous_tLib);
		concat.setRuleName("NoRuleName");
		concat.solve(literal0, var_tType_tName, var_mAnonymous_index, var_tAnonymous_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mMemberToTMember", mMemberToTMember);
		isApplicableMatch.registerObject("mCreation", mCreation);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("tPackage", tPackage);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mMember", mMember);
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
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPROPRIATE_FWD__MATCH_MCLASSINSTANCECREATION_MDEFINITION_MANONYMOUSCLASS_ABSTRACTTYPEDECLARATION:
				return isAppropriate_FWD((Match) arguments.get(0), (MClassInstanceCreation) arguments.get(1),
						(MDefinition) arguments.get(2), (MAnonymousClass) arguments.get(3),
						(AbstractTypeDeclaration) arguments.get(4));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCLASSINSTANCECREATION_MDEFINITION_MANONYMOUSCLASS_ABSTRACTTYPEDECLARATION:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MClassInstanceCreation) arguments.get(1),
						(MDefinition) arguments.get(2), (MAnonymousClass) arguments.get(3),
						(AbstractTypeDeclaration) arguments.get(4));
				return null;
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCLASSINSTANCECREATION_MDEFINITION_MANONYMOUSCLASS_ABSTRACTTYPEDECLARATION:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MClassInstanceCreation) arguments.get(1),
						(MDefinition) arguments.get(2), (MAnonymousClass) arguments.get(3),
						(AbstractTypeDeclaration) arguments.get(4));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_MCLASSINSTANCECREATION_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TPACKAGE_TMEMBER_TYPEGRAPH_MDEFINITION_MANONYMOUSCLASS_ABSTRACTTYPEDECLARATION:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(MDefinitionToTMember) arguments.get(1), (MClassInstanceCreation) arguments.get(2),
						(TypeToTAbstractType) arguments.get(3), (TAbstractType) arguments.get(4),
						(TPackage) arguments.get(5), (TMember) arguments.get(6), (TypeGraph) arguments.get(7),
						(MDefinition) arguments.get(8), (MAnonymousClass) arguments.get(9),
						(AbstractTypeDeclaration) arguments.get(10));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
						(EObject) arguments.get(11), (EObject) arguments.get(12));
				return null;
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPROPRIATE_BWD__MATCH_TCLASS_TABSTRACTTYPE_TPACKAGE_TMEMBER_TYPEGRAPH:
				return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
						(TAbstractType) arguments.get(2), (TPackage) arguments.get(3), (TMember) arguments.get(4),
						(TypeGraph) arguments.get(5));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TABSTRACTTYPE_TPACKAGE_TMEMBER_TYPEGRAPH:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
						(TAbstractType) arguments.get(2), (TPackage) arguments.get(3), (TMember) arguments.get(4),
						(TypeGraph) arguments.get(5));
				return null;
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TABSTRACTTYPE_TPACKAGE_TMEMBER_TYPEGRAPH:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
						(TAbstractType) arguments.get(2), (TPackage) arguments.get(3), (TMember) arguments.get(4),
						(TypeGraph) arguments.get(5));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_MCLASSINSTANCECREATION_TCLASS_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TPACKAGE_TMEMBER_TYPEGRAPH_MDEFINITION_ABSTRACTTYPEDECLARATION:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MDefinitionToTMember) arguments.get(1), (MClassInstanceCreation) arguments.get(2),
						(TClass) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
						(TAbstractType) arguments.get(5), (TPackage) arguments.get(6), (TMember) arguments.get(7),
						(TypeGraph) arguments.get(8), (MDefinition) arguments.get(9),
						(AbstractTypeDeclaration) arguments.get(10));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
						(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
						(EObject) arguments.get(11), (EObject) arguments.get(12));
				return null;
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_80__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_80((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_86__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_86((EMoflonEdge) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__MCLASSINSTANCECREATION_TCLASS_TABSTRACTTYPE_TPACKAGE_TMEMBER_TYPEGRAPH_MDEFINITION_MANONYMOUSCLASS_ABSTRACTTYPEDECLARATION_MATCH_MATCH:
				return isApplicable_solveCsp_CC((MClassInstanceCreation) arguments.get(0), (TClass) arguments.get(1),
						(TAbstractType) arguments.get(2), (TPackage) arguments.get(3), (TMember) arguments.get(4),
						(TypeGraph) arguments.get(5), (MDefinition) arguments.get(6),
						(MAnonymousClass) arguments.get(7), (AbstractTypeDeclaration) arguments.get(8),
						(Match) arguments.get(9), (Match) arguments.get(10));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___CHECK_DEC_FWD__MCLASSINSTANCECREATION_MDEFINITION_MANONYMOUSCLASS_ABSTRACTTYPEDECLARATION:
				return checkDEC_FWD((MClassInstanceCreation) arguments.get(0), (MDefinition) arguments.get(1),
						(MAnonymousClass) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___CHECK_DEC_BWD__TCLASS_TABSTRACTTYPE_TPACKAGE_TMEMBER_TYPEGRAPH:
				return checkDEC_BWD((TClass) arguments.get(0), (TAbstractType) arguments.get(1),
						(TPackage) arguments.get(2), (TMember) arguments.get(3), (TypeGraph) arguments.get(4));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
				return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MDEFINITIONTOTMEMBER_MCLASSINSTANCECREATION_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_TPACKAGE_TMEMBER_TYPEGRAPH_MDEFINITION_ABSTRACTTYPEDECLARATION_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MDefinitionToTMember) arguments.get(1), (MClassInstanceCreation) arguments.get(2),
						(TypeToTAbstractType) arguments.get(3), (TAbstractType) arguments.get(4),
						(TPackage) arguments.get(5), (TMember) arguments.get(6), (TypeGraph) arguments.get(7),
						(MDefinition) arguments.get(8), (AbstractTypeDeclaration) arguments.get(9),
						(ModelgeneratorRuleResult) arguments.get(10));
			case RulesPackage.ANONYMOUS_CLASS_IN_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnonymousClassInType_0_1_initialbindings_blackBBBBBB(
			AnonymousClassInType _this, Match match, MClassInstanceCreation mCreation, MDefinition mMember,
			MAnonymousClass mAnonymous, AbstractTypeDeclaration mType) {
		return new Object[] { _this, match, mCreation, mMember, mAnonymous, mType };
	}

	public static final Object[] pattern_AnonymousClassInType_0_2_SolveCSP_bindingFBBBBBB(AnonymousClassInType _this,
			Match match, MClassInstanceCreation mCreation, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mCreation, mMember, mAnonymous, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mCreation, mMember, mAnonymous, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassInType_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnonymousClassInType _this, Match match, MClassInstanceCreation mCreation, MDefinition mMember,
			MAnonymousClass mAnonymous, AbstractTypeDeclaration mType) {
		Object[] result_pattern_AnonymousClassInType_0_2_SolveCSP_binding = pattern_AnonymousClassInType_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mCreation, mMember, mAnonymous, mType);
		if (result_pattern_AnonymousClassInType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassInType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClassInType_0_2_SolveCSP_black = pattern_AnonymousClassInType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassInType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mCreation, mMember, mAnonymous, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassInType_0_3_CheckCSP_expressionFBB(AnonymousClassInType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			MClassInstanceCreation mCreation, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType) {
		return new Object[] { match, mCreation, mMember, mAnonymous, mType };
	}

	public static final Object[] pattern_AnonymousClassInType_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MClassInstanceCreation mCreation, MAnonymousClass mAnonymous) {
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mAnonymous);
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		match.getToBeTranslatedEdges().add(mCreation__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		match.getToBeTranslatedEdges().add(mAnonymous__mCreation____classInstanceCreation);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		return new Object[] { match, mCreation, mAnonymous, mCreation__mAnonymous____anonymousClassDeclaration,
				mAnonymous__mCreation____classInstanceCreation };
	}

	public static final Object[] pattern_AnonymousClassInType_0_5_collectcontextelements_blackBBBBB(Match match,
			MClassInstanceCreation mCreation, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType) {
		return new Object[] { match, mCreation, mMember, mAnonymous, mType };
	}

	public static final Object[] pattern_AnonymousClassInType_0_5_collectcontextelements_greenBBBBFFF(Match match,
			MClassInstanceCreation mCreation, MDefinition mMember, AbstractTypeDeclaration mType) {
		EMoflonEdge mType__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mCreation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mCreation);
		match.getContextNodes().add(mMember);
		match.getContextNodes().add(mType);
		String mType__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mMember__mCreation____mMethodInvocations_name_prime = "mMethodInvocations";
		mType__mMember____bodyDeclarations.setSrc(mType);
		mType__mMember____bodyDeclarations.setTrg(mMember);
		match.getContextEdges().add(mType__mMember____bodyDeclarations);
		mMember__mType____abstractTypeDeclaration.setSrc(mMember);
		mMember__mType____abstractTypeDeclaration.setTrg(mType);
		match.getContextEdges().add(mMember__mType____abstractTypeDeclaration);
		mMember__mCreation____mMethodInvocations.setSrc(mMember);
		mMember__mCreation____mMethodInvocations.setTrg(mCreation);
		match.getContextEdges().add(mMember__mCreation____mMethodInvocations);
		mType__mMember____bodyDeclarations.setName(mType__mMember____bodyDeclarations_name_prime);
		mMember__mType____abstractTypeDeclaration.setName(mMember__mType____abstractTypeDeclaration_name_prime);
		mMember__mCreation____mMethodInvocations.setName(mMember__mCreation____mMethodInvocations_name_prime);
		return new Object[] { match, mCreation, mMember, mType, mType__mMember____bodyDeclarations,
				mMember__mType____abstractTypeDeclaration, mMember__mCreation____mMethodInvocations };
	}

	public static final void pattern_AnonymousClassInType_0_6_registerobjectstomatch_expressionBBBBBB(
			AnonymousClassInType _this, Match match, MClassInstanceCreation mCreation, MDefinition mMember,
			MAnonymousClass mAnonymous, AbstractTypeDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mCreation, mMember, mAnonymous, mType);

	}

	public static final boolean pattern_AnonymousClassInType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassInType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_1_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("mCreation");
		EObject _localVariable_2 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_3 = isApplicableMatch.getObject("tType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_5 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("pg");
		EObject _localVariable_7 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_8 = isApplicableMatch.getObject("mAnonymous");
		EObject _localVariable_9 = isApplicableMatch.getObject("mType");
		EObject tmpMMemberToTMember = _localVariable_0;
		EObject tmpMCreation = _localVariable_1;
		EObject tmpMTypeToTType = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		EObject tmpTPackage = _localVariable_4;
		EObject tmpTMember = _localVariable_5;
		EObject tmpPg = _localVariable_6;
		EObject tmpMMember = _localVariable_7;
		EObject tmpMAnonymous = _localVariable_8;
		EObject tmpMType = _localVariable_9;
		if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
			if (tmpMCreation instanceof MClassInstanceCreation) {
				MClassInstanceCreation mCreation = (MClassInstanceCreation) tmpMCreation;
				if (tmpMTypeToTType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
					if (tmpTType instanceof TAbstractType) {
						TAbstractType tType = (TAbstractType) tmpTType;
						if (tmpTPackage instanceof TPackage) {
							TPackage tPackage = (TPackage) tmpTPackage;
							if (tmpTMember instanceof TMember) {
								TMember tMember = (TMember) tmpTMember;
								if (tmpPg instanceof TypeGraph) {
									TypeGraph pg = (TypeGraph) tmpPg;
									if (tmpMMember instanceof MDefinition) {
										MDefinition mMember = (MDefinition) tmpMMember;
										if (tmpMAnonymous instanceof MAnonymousClass) {
											MAnonymousClass mAnonymous = (MAnonymousClass) tmpMAnonymous;
											if (tmpMType instanceof AbstractTypeDeclaration) {
												AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
												return new Object[] { mMemberToTMember, mCreation, mTypeToTType, tType,
														tPackage, tMember, pg, mMember, mAnonymous, mType,
														isApplicableMatch };
											}
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

	public static final Object[] pattern_AnonymousClassInType_1_1_performtransformation_blackBBBBBBBBBBFBB(
			MDefinitionToTMember mMemberToTMember, MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember,
			MAnonymousClass mAnonymous, AbstractTypeDeclaration mType, AnonymousClassInType _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mMemberToTMember, mCreation, mTypeToTType, tType, tPackage, tMember, pg, mMember,
						mAnonymous, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_1_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			AnonymousClassInType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClassInType_1_1_performtransformation_binding = pattern_AnonymousClassInType_1_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClassInType_1_1_performtransformation_binding != null) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_AnonymousClassInType_1_1_performtransformation_binding[0];
			MClassInstanceCreation mCreation = (MClassInstanceCreation) result_pattern_AnonymousClassInType_1_1_performtransformation_binding[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_AnonymousClassInType_1_1_performtransformation_binding[2];
			TAbstractType tType = (TAbstractType) result_pattern_AnonymousClassInType_1_1_performtransformation_binding[3];
			TPackage tPackage = (TPackage) result_pattern_AnonymousClassInType_1_1_performtransformation_binding[4];
			TMember tMember = (TMember) result_pattern_AnonymousClassInType_1_1_performtransformation_binding[5];
			TypeGraph pg = (TypeGraph) result_pattern_AnonymousClassInType_1_1_performtransformation_binding[6];
			MDefinition mMember = (MDefinition) result_pattern_AnonymousClassInType_1_1_performtransformation_binding[7];
			MAnonymousClass mAnonymous = (MAnonymousClass) result_pattern_AnonymousClassInType_1_1_performtransformation_binding[8];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_AnonymousClassInType_1_1_performtransformation_binding[9];

			Object[] result_pattern_AnonymousClassInType_1_1_performtransformation_black = pattern_AnonymousClassInType_1_1_performtransformation_blackBBBBBBBBBBFBB(
					mMemberToTMember, mCreation, mTypeToTType, tType, tPackage, tMember, pg, mMember, mAnonymous, mType,
					_this, isApplicableMatch);
			if (result_pattern_AnonymousClassInType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClassInType_1_1_performtransformation_black[10];

				return new Object[] { mMemberToTMember, mCreation, mTypeToTType, tType, tPackage, tMember, pg, mMember,
						mAnonymous, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_1_1_performtransformation_greenFBBBBFB(
			TAbstractType tType, TPackage tPackage, TypeGraph pg, MAnonymousClass mAnonymous, CSP csp) {
		TClass tAnonymous = BasicFactory.eINSTANCE.createTClass();
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		Object _localVariable_0 = csp.getValue("tAnonymous", "tLib");
		Object _localVariable_1 = csp.getValue("tAnonymous", "tName");
		tPackage.getAllTypes().add(tAnonymous);
		pg.getClasses().add(tAnonymous);
		pg.getAllTypes().add(tAnonymous);
		tPackage.getClasses().add(tAnonymous);
		tType.getInnerTypes().add(tAnonymous);
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		boolean tAnonymous_tLib_prime = (boolean) _localVariable_0;
		String tAnonymous_tName_prime = (String) _localVariable_1;
		tAnonymous.setTLib(Boolean.valueOf(tAnonymous_tLib_prime));
		tAnonymous.setTName(tAnonymous_tName_prime);
		return new Object[] { tAnonymous, tType, tPackage, pg, mAnonymous, eAnonymousClassDeclarationToTClass, csp };
	}

	public static final Object[] pattern_AnonymousClassInType_1_2_collecttranslatedelements_blackBBB(TClass tAnonymous,
			MAnonymousClass mAnonymous, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		return new Object[] { tAnonymous, mAnonymous, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_AnonymousClassInType_1_2_collecttranslatedelements_greenFBBB(TClass tAnonymous,
			MAnonymousClass mAnonymous, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tAnonymous);
		ruleresult.getTranslatedElements().add(mAnonymous);
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { ruleresult, tAnonymous, mAnonymous, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_AnonymousClassInType_1_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mMemberToTMember, EObject mCreation, EObject tAnonymous,
			EObject mTypeToTType, EObject tType, EObject tPackage, EObject tMember, EObject pg, EObject mMember,
			EObject mAnonymous, EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		if (!mMemberToTMember.equals(tAnonymous)) {
			if (!mMemberToTMember.equals(mTypeToTType)) {
				if (!mMemberToTMember.equals(tType)) {
					if (!mMemberToTMember.equals(tPackage)) {
						if (!mMemberToTMember.equals(tMember)) {
							if (!mMemberToTMember.equals(pg)) {
								if (!mMemberToTMember.equals(mType)) {
									if (!mCreation.equals(mMemberToTMember)) {
										if (!mCreation.equals(tAnonymous)) {
											if (!mCreation.equals(mTypeToTType)) {
												if (!mCreation.equals(tType)) {
													if (!mCreation.equals(tPackage)) {
														if (!mCreation.equals(tMember)) {
															if (!mCreation.equals(pg)) {
																if (!mCreation.equals(mMember)) {
																	if (!mCreation.equals(mType)) {
																		if (!tAnonymous.equals(tType)) {
																			if (!tAnonymous.equals(tPackage)) {
																				if (!tAnonymous.equals(tMember)) {
																					if (!mTypeToTType
																							.equals(tAnonymous)) {
																						if (!mTypeToTType
																								.equals(tType)) {
																							if (!mTypeToTType
																									.equals(tPackage)) {
																								if (!mTypeToTType
																										.equals(tMember)) {
																									if (!mTypeToTType
																											.equals(pg)) {
																										if (!tPackage
																												.equals(tType)) {
																											if (!tMember
																													.equals(tType)) {
																												if (!tMember
																														.equals(tPackage)) {
																													if (!pg.equals(
																															tAnonymous)) {
																														if (!pg.equals(
																																tType)) {
																															if (!pg.equals(
																																	tPackage)) {
																																if (!pg.equals(
																																		tMember)) {
																																	if (!mMember
																																			.equals(mMemberToTMember)) {
																																		if (!mMember
																																				.equals(tAnonymous)) {
																																			if (!mMember
																																					.equals(mTypeToTType)) {
																																				if (!mMember
																																						.equals(tType)) {
																																					if (!mMember
																																							.equals(tPackage)) {
																																						if (!mMember
																																								.equals(tMember)) {
																																							if (!mMember
																																									.equals(pg)) {
																																								if (!mMember
																																										.equals(mType)) {
																																									if (!mAnonymous
																																											.equals(mMemberToTMember)) {
																																										if (!mAnonymous
																																												.equals(mCreation)) {
																																											if (!mAnonymous
																																													.equals(tAnonymous)) {
																																												if (!mAnonymous
																																														.equals(mTypeToTType)) {
																																													if (!mAnonymous
																																															.equals(tType)) {
																																														if (!mAnonymous
																																																.equals(tPackage)) {
																																															if (!mAnonymous
																																																	.equals(tMember)) {
																																																if (!mAnonymous
																																																		.equals(pg)) {
																																																	if (!mAnonymous
																																																			.equals(mMember)) {
																																																		if (!mAnonymous
																																																				.equals(mType)) {
																																																			if (!eAnonymousClassDeclarationToTClass
																																																					.equals(mMemberToTMember)) {
																																																				if (!eAnonymousClassDeclarationToTClass
																																																						.equals(mCreation)) {
																																																					if (!eAnonymousClassDeclarationToTClass
																																																							.equals(tAnonymous)) {
																																																						if (!eAnonymousClassDeclarationToTClass
																																																								.equals(mTypeToTType)) {
																																																							if (!eAnonymousClassDeclarationToTClass
																																																									.equals(tType)) {
																																																								if (!eAnonymousClassDeclarationToTClass
																																																										.equals(tPackage)) {
																																																									if (!eAnonymousClassDeclarationToTClass
																																																											.equals(tMember)) {
																																																										if (!eAnonymousClassDeclarationToTClass
																																																												.equals(pg)) {
																																																											if (!eAnonymousClassDeclarationToTClass
																																																													.equals(mMember)) {
																																																												if (!eAnonymousClassDeclarationToTClass
																																																														.equals(mAnonymous)) {
																																																													if (!eAnonymousClassDeclarationToTClass
																																																															.equals(mType)) {
																																																														if (!mType
																																																																.equals(tAnonymous)) {
																																																															if (!mType
																																																																	.equals(mTypeToTType)) {
																																																																if (!mType
																																																																		.equals(tType)) {
																																																																	if (!mType
																																																																			.equals(tPackage)) {
																																																																		if (!mType
																																																																				.equals(tMember)) {
																																																																			if (!mType
																																																																					.equals(pg)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						mMemberToTMember,
																																																																						mCreation,
																																																																						tAnonymous,
																																																																						mTypeToTType,
																																																																						tType,
																																																																						tPackage,
																																																																						tMember,
																																																																						pg,
																																																																						mMember,
																																																																						mAnonymous,
																																																																						eAnonymousClassDeclarationToTClass,
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
												}
											}
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

	public static final Object[] pattern_AnonymousClassInType_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mCreation, EObject tAnonymous, EObject tType, EObject tPackage,
			EObject pg, EObject mAnonymous, EObject eAnonymousClassDeclarationToTClass) {
		EMoflonEdge tPackage__tAnonymous____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClassInType";
		String tPackage__tAnonymous____allTypes_name_prime = "allTypes";
		String tAnonymous__tPackage____package_name_prime = "package";
		String pg__tAnonymous____classes_name_prime = "classes";
		String pg__tAnonymous____allTypes_name_prime = "allTypes";
		String tAnonymous__pg____model_name_prime = "model";
		String eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime = "target";
		String tPackage__tAnonymous____classes_name_prime = "classes";
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		String eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime = "source";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		tPackage__tAnonymous____allTypes.setSrc(tPackage);
		tPackage__tAnonymous____allTypes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(tPackage__tAnonymous____allTypes);
		tAnonymous__tPackage____package.setSrc(tAnonymous);
		tAnonymous__tPackage____package.setTrg(tPackage);
		ruleresult.getCreatedEdges().add(tAnonymous__tPackage____package);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(pg__tAnonymous____classes);
		pg__tAnonymous____allTypes.setSrc(pg);
		pg__tAnonymous____allTypes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(pg__tAnonymous____allTypes);
		tAnonymous__pg____model.setSrc(tAnonymous);
		tAnonymous__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tAnonymous__pg____model);
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tAnonymous____target);
		tPackage__tAnonymous____classes.setSrc(tPackage);
		tPackage__tAnonymous____classes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(tPackage__tAnonymous____classes);
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		ruleresult.getTranslatedEdges().add(mCreation__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		ruleresult.getTranslatedEdges().add(mAnonymous__mCreation____classInstanceCreation);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__mAnonymous____source);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		ruleresult.getCreatedEdges().add(tAnonymous__tType____outerType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tPackage__tAnonymous____allTypes.setName(tPackage__tAnonymous____allTypes_name_prime);
		tAnonymous__tPackage____package.setName(tAnonymous__tPackage____package_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		pg__tAnonymous____allTypes.setName(pg__tAnonymous____allTypes_name_prime);
		tAnonymous__pg____model.setName(tAnonymous__pg____model_name_prime);
		eAnonymousClassDeclarationToTClass__tAnonymous____target
				.setName(eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime);
		tPackage__tAnonymous____classes.setName(tPackage__tAnonymous____classes_name_prime);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		eAnonymousClassDeclarationToTClass__mAnonymous____source
				.setName(eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		return new Object[] { ruleresult, mCreation, tAnonymous, tType, tPackage, pg, mAnonymous,
				eAnonymousClassDeclarationToTClass, tPackage__tAnonymous____allTypes, tAnonymous__tPackage____package,
				pg__tAnonymous____classes, pg__tAnonymous____allTypes, tAnonymous__pg____model,
				eAnonymousClassDeclarationToTClass__tAnonymous____target, tPackage__tAnonymous____classes,
				mCreation__mAnonymous____anonymousClassDeclaration, mAnonymous__mCreation____classInstanceCreation,
				eAnonymousClassDeclarationToTClass__mAnonymous____source, tType__tAnonymous____innerTypes,
				tAnonymous__tType____outerType };
	}

	public static final void pattern_AnonymousClassInType_1_5_registerobjects_expressionBBBBBBBBBBBBBB(
			AnonymousClassInType _this, PerformRuleResult ruleresult, EObject mMemberToTMember, EObject mCreation,
			EObject tAnonymous, EObject mTypeToTType, EObject tType, EObject tPackage, EObject tMember, EObject pg,
			EObject mMember, EObject mAnonymous, EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		_this.registerObjects_FWD(ruleresult, mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType, tPackage,
				tMember, pg, mMember, mAnonymous, eAnonymousClassDeclarationToTClass, mType);

	}

	public static final PerformRuleResult pattern_AnonymousClassInType_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_2_1_preparereturnvalue_bindingFB(
			AnonymousClassInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClassInType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClassInType _this) {
		Object[] result_pattern_AnonymousClassInType_2_1_preparereturnvalue_binding = pattern_AnonymousClassInType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassInType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClassInType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassInType_2_1_preparereturnvalue_black = pattern_AnonymousClassInType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClassInType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClassInType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClassInType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClassInType_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mCreation");
		EObject _localVariable_1 = match.getObject("mMember");
		EObject _localVariable_2 = match.getObject("mAnonymous");
		EObject _localVariable_3 = match.getObject("mType");
		EObject tmpMCreation = _localVariable_0;
		EObject tmpMMember = _localVariable_1;
		EObject tmpMAnonymous = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		if (tmpMCreation instanceof MClassInstanceCreation) {
			MClassInstanceCreation mCreation = (MClassInstanceCreation) tmpMCreation;
			if (tmpMMember instanceof MDefinition) {
				MDefinition mMember = (MDefinition) tmpMMember;
				if (tmpMAnonymous instanceof MAnonymousClass) {
					MAnonymousClass mAnonymous = (MAnonymousClass) tmpMAnonymous;
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						return new Object[] { mCreation, mMember, mAnonymous, mType, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassInType_2_2_corematch_blackFBFFFBBBB(
			MClassInstanceCreation mCreation, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
			TMember tMember = mMemberToTMember.getTarget();
			if (tMember != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tType = mTypeToTType.getTarget();
					if (tType != null) {
						_result.add(new Object[] { mMemberToTMember, mCreation, mTypeToTType, tType, tMember, mMember,
								mAnonymous, mType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassInType_2_3_findcontext_blackBBBBFBFBBB(
			MDefinitionToTMember mMemberToTMember, MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, TMember tMember, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.getBodyDeclarations().contains(mMember)) {
			if (mMember.equals(mMemberToTMember.getSource())) {
				if (mMember.getMMethodInvocations().contains(mCreation)) {
					if (tType.getDefines().contains(tMember)) {
						if (tType.equals(mTypeToTType.getTarget())) {
							if (mAnonymous.equals(mCreation.getAnonymousClassDeclaration())) {
								if (tMember.equals(mMemberToTMember.getTarget())) {
									if (mType.equals(mTypeToTType.getSource())) {
										TPackage tPackage = tType.getPackage();
										if (tPackage != null) {
											TypeGraph pg = tPackage.getModel();
											if (pg != null) {
												_result.add(new Object[] { mMemberToTMember, mCreation, mTypeToTType,
														tType, tPackage, tMember, pg, mMember, mAnonymous, mType });
											}

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

	public static final Object[] pattern_AnonymousClassInType_2_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFF(
			MDefinitionToTMember mMemberToTMember, MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember,
			MAnonymousClass mAnonymous, AbstractTypeDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mType__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mCreation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mType__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMember__mCreation____mMethodInvocations_name_prime = "mMethodInvocations";
		String tPackage__pg____model_name_prime = "model";
		String tType__tMember____defines_name_prime = "defines";
		String tMember__tType____definedBy_name_prime = "definedBy";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____allTypes_name_prime = "allTypes";
		String mTypeToTType__tType____target_name_prime = "target";
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(mCreation);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mType);
		mType__mMember____bodyDeclarations.setSrc(mType);
		mType__mMember____bodyDeclarations.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mType__mMember____bodyDeclarations);
		mMember__mType____abstractTypeDeclaration.setSrc(mMember);
		mMember__mType____abstractTypeDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mMember__mType____abstractTypeDeclaration);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMember__mCreation____mMethodInvocations.setSrc(mMember);
		mMember__mCreation____mMethodInvocations.setTrg(mCreation);
		isApplicableMatch.getAllContextElements().add(mMember__mCreation____mMethodInvocations);
		tPackage__pg____model.setSrc(tPackage);
		tPackage__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____model);
		tType__tMember____defines.setSrc(tType);
		tType__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tType__tMember____defines);
		tMember__tType____definedBy.setSrc(tMember);
		tMember__tType____definedBy.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tMember__tType____definedBy);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tType__tPackage____package);
		tPackage__tType____allTypes.setSrc(tPackage);
		tPackage__tType____allTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____allTypes);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		isApplicableMatch.getAllContextElements().add(mCreation__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		isApplicableMatch.getAllContextElements().add(mAnonymous__mCreation____classInstanceCreation);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mType__mMember____bodyDeclarations.setName(mType__mMember____bodyDeclarations_name_prime);
		mMember__mType____abstractTypeDeclaration.setName(mMember__mType____abstractTypeDeclaration_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMember__mCreation____mMethodInvocations.setName(mMember__mCreation____mMethodInvocations_name_prime);
		tPackage__pg____model.setName(tPackage__pg____model_name_prime);
		tType__tMember____defines.setName(tType__tMember____defines_name_prime);
		tMember__tType____definedBy.setName(tMember__tType____definedBy_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		return new Object[] { mMemberToTMember, mCreation, mTypeToTType, tType, tPackage, tMember, pg, mMember,
				mAnonymous, mType, isApplicableMatch, mType__mMember____bodyDeclarations,
				mMember__mType____abstractTypeDeclaration, mMemberToTMember__mMember____source,
				mMember__mCreation____mMethodInvocations, tPackage__pg____model, tType__tMember____defines,
				tMember__tType____definedBy, tType__tPackage____package, tPackage__tType____allTypes,
				mTypeToTType__tType____target, mCreation__mAnonymous____anonymousClassDeclaration,
				mAnonymous__mCreation____classInstanceCreation, mMemberToTMember__tMember____target,
				mTypeToTType__mType____source };
	}

	public static final Object[] pattern_AnonymousClassInType_2_4_solveCSP_bindingFBBBBBBBBBBBB(
			AnonymousClassInType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mMemberToTMember, mCreation,
				mTypeToTType, tType, tPackage, tMember, pg, mMember, mAnonymous, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, mCreation, mTypeToTType, tType,
					tPackage, tMember, pg, mMember, mAnonymous, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassInType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			AnonymousClassInType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType) {
		Object[] result_pattern_AnonymousClassInType_2_4_solveCSP_binding = pattern_AnonymousClassInType_2_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, mCreation, mTypeToTType, tType, tPackage, tMember, pg,
				mMember, mAnonymous, mType);
		if (result_pattern_AnonymousClassInType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassInType_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClassInType_2_4_solveCSP_black = pattern_AnonymousClassInType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassInType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, mCreation, mTypeToTType, tType,
						tPackage, tMember, pg, mMember, mAnonymous, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassInType_2_5_checkCSP_expressionFBB(AnonymousClassInType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClassInType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClassInType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClassInType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_10_1_initialbindings_blackBBBBBBB(
			AnonymousClassInType _this, Match match, TClass tAnonymous, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg) {
		if (!tAnonymous.equals(tType)) {
			return new Object[] { _this, match, tAnonymous, tType, tPackage, tMember, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_10_2_SolveCSP_bindingFBBBBBBB(AnonymousClassInType _this,
			Match match, TClass tAnonymous, TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tAnonymous, tType, tPackage, tMember, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tAnonymous, tType, tPackage, tMember, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassInType_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			AnonymousClassInType _this, Match match, TClass tAnonymous, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg) {
		Object[] result_pattern_AnonymousClassInType_10_2_SolveCSP_binding = pattern_AnonymousClassInType_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, tAnonymous, tType, tPackage, tMember, pg);
		if (result_pattern_AnonymousClassInType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassInType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClassInType_10_2_SolveCSP_black = pattern_AnonymousClassInType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassInType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tAnonymous, tType, tPackage, tMember, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassInType_10_3_CheckCSP_expressionFBB(AnonymousClassInType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_10_4_collectelementstobetranslated_blackBBBBBB(
			Match match, TClass tAnonymous, TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg) {
		if (!tAnonymous.equals(tType)) {
			return new Object[] { match, tAnonymous, tType, tPackage, tMember, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_10_4_collectelementstobetranslated_greenBBBBBFFFFFFFF(
			Match match, TClass tAnonymous, TAbstractType tType, TPackage tPackage, TypeGraph pg) {
		EMoflonEdge tPackage__tAnonymous____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tAnonymous);
		String tPackage__tAnonymous____allTypes_name_prime = "allTypes";
		String tAnonymous__tPackage____package_name_prime = "package";
		String pg__tAnonymous____classes_name_prime = "classes";
		String pg__tAnonymous____allTypes_name_prime = "allTypes";
		String tAnonymous__pg____model_name_prime = "model";
		String tPackage__tAnonymous____classes_name_prime = "classes";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		tPackage__tAnonymous____allTypes.setSrc(tPackage);
		tPackage__tAnonymous____allTypes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(tPackage__tAnonymous____allTypes);
		tAnonymous__tPackage____package.setSrc(tAnonymous);
		tAnonymous__tPackage____package.setTrg(tPackage);
		match.getToBeTranslatedEdges().add(tAnonymous__tPackage____package);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(pg__tAnonymous____classes);
		pg__tAnonymous____allTypes.setSrc(pg);
		pg__tAnonymous____allTypes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(pg__tAnonymous____allTypes);
		tAnonymous__pg____model.setSrc(tAnonymous);
		tAnonymous__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tAnonymous__pg____model);
		tPackage__tAnonymous____classes.setSrc(tPackage);
		tPackage__tAnonymous____classes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(tPackage__tAnonymous____classes);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		match.getToBeTranslatedEdges().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		match.getToBeTranslatedEdges().add(tAnonymous__tType____outerType);
		tPackage__tAnonymous____allTypes.setName(tPackage__tAnonymous____allTypes_name_prime);
		tAnonymous__tPackage____package.setName(tAnonymous__tPackage____package_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		pg__tAnonymous____allTypes.setName(pg__tAnonymous____allTypes_name_prime);
		tAnonymous__pg____model.setName(tAnonymous__pg____model_name_prime);
		tPackage__tAnonymous____classes.setName(tPackage__tAnonymous____classes_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		return new Object[] { match, tAnonymous, tType, tPackage, pg, tPackage__tAnonymous____allTypes,
				tAnonymous__tPackage____package, pg__tAnonymous____classes, pg__tAnonymous____allTypes,
				tAnonymous__pg____model, tPackage__tAnonymous____classes, tType__tAnonymous____innerTypes,
				tAnonymous__tType____outerType };
	}

	public static final Object[] pattern_AnonymousClassInType_10_5_collectcontextelements_blackBBBBBB(Match match,
			TClass tAnonymous, TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg) {
		if (!tAnonymous.equals(tType)) {
			return new Object[] { match, tAnonymous, tType, tPackage, tMember, pg };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_10_5_collectcontextelements_greenBBBBBFFFFF(Match match,
			TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg) {
		EMoflonEdge tPackage__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tType);
		match.getContextNodes().add(tPackage);
		match.getContextNodes().add(tMember);
		match.getContextNodes().add(pg);
		String tPackage__pg____model_name_prime = "model";
		String tType__tMember____defines_name_prime = "defines";
		String tMember__tType____definedBy_name_prime = "definedBy";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____allTypes_name_prime = "allTypes";
		tPackage__pg____model.setSrc(tPackage);
		tPackage__pg____model.setTrg(pg);
		match.getContextEdges().add(tPackage__pg____model);
		tType__tMember____defines.setSrc(tType);
		tType__tMember____defines.setTrg(tMember);
		match.getContextEdges().add(tType__tMember____defines);
		tMember__tType____definedBy.setSrc(tMember);
		tMember__tType____definedBy.setTrg(tType);
		match.getContextEdges().add(tMember__tType____definedBy);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		match.getContextEdges().add(tType__tPackage____package);
		tPackage__tType____allTypes.setSrc(tPackage);
		tPackage__tType____allTypes.setTrg(tType);
		match.getContextEdges().add(tPackage__tType____allTypes);
		tPackage__pg____model.setName(tPackage__pg____model_name_prime);
		tType__tMember____defines.setName(tType__tMember____defines_name_prime);
		tMember__tType____definedBy.setName(tMember__tType____definedBy_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		return new Object[] { match, tType, tPackage, tMember, pg, tPackage__pg____model, tType__tMember____defines,
				tMember__tType____definedBy, tType__tPackage____package, tPackage__tType____allTypes };
	}

	public static final void pattern_AnonymousClassInType_10_6_registerobjectstomatch_expressionBBBBBBB(
			AnonymousClassInType _this, Match match, TClass tAnonymous, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tAnonymous, tType, tPackage, tMember, pg);

	}

	public static final boolean pattern_AnonymousClassInType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassInType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_11_1_performtransformation_bindingFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mMemberToTMember");
		EObject _localVariable_1 = isApplicableMatch.getObject("mCreation");
		EObject _localVariable_2 = isApplicableMatch.getObject("tAnonymous");
		EObject _localVariable_3 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tPackage");
		EObject _localVariable_6 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_7 = isApplicableMatch.getObject("pg");
		EObject _localVariable_8 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_9 = isApplicableMatch.getObject("mType");
		EObject tmpMMemberToTMember = _localVariable_0;
		EObject tmpMCreation = _localVariable_1;
		EObject tmpTAnonymous = _localVariable_2;
		EObject tmpMTypeToTType = _localVariable_3;
		EObject tmpTType = _localVariable_4;
		EObject tmpTPackage = _localVariable_5;
		EObject tmpTMember = _localVariable_6;
		EObject tmpPg = _localVariable_7;
		EObject tmpMMember = _localVariable_8;
		EObject tmpMType = _localVariable_9;
		if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
			if (tmpMCreation instanceof MClassInstanceCreation) {
				MClassInstanceCreation mCreation = (MClassInstanceCreation) tmpMCreation;
				if (tmpTAnonymous instanceof TClass) {
					TClass tAnonymous = (TClass) tmpTAnonymous;
					if (tmpMTypeToTType instanceof TypeToTAbstractType) {
						TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
						if (tmpTType instanceof TAbstractType) {
							TAbstractType tType = (TAbstractType) tmpTType;
							if (tmpTPackage instanceof TPackage) {
								TPackage tPackage = (TPackage) tmpTPackage;
								if (tmpTMember instanceof TMember) {
									TMember tMember = (TMember) tmpTMember;
									if (tmpPg instanceof TypeGraph) {
										TypeGraph pg = (TypeGraph) tmpPg;
										if (tmpMMember instanceof MDefinition) {
											MDefinition mMember = (MDefinition) tmpMMember;
											if (tmpMType instanceof AbstractTypeDeclaration) {
												AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
												return new Object[] { mMemberToTMember, mCreation, tAnonymous,
														mTypeToTType, tType, tPackage, tMember, pg, mMember, mType,
														isApplicableMatch };
											}
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

	public static final Object[] pattern_AnonymousClassInType_11_1_performtransformation_blackBBBBBBBBBBFBB(
			MDefinitionToTMember mMemberToTMember, MClassInstanceCreation mCreation, TClass tAnonymous,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg,
			MDefinition mMember, AbstractTypeDeclaration mType, AnonymousClassInType _this,
			IsApplicableMatch isApplicableMatch) {
		if (!tAnonymous.equals(tType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType, tPackage,
							tMember, pg, mMember, mType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFBB(
			AnonymousClassInType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClassInType_11_1_performtransformation_binding = pattern_AnonymousClassInType_11_1_performtransformation_bindingFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClassInType_11_1_performtransformation_binding != null) {
			MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) result_pattern_AnonymousClassInType_11_1_performtransformation_binding[0];
			MClassInstanceCreation mCreation = (MClassInstanceCreation) result_pattern_AnonymousClassInType_11_1_performtransformation_binding[1];
			TClass tAnonymous = (TClass) result_pattern_AnonymousClassInType_11_1_performtransformation_binding[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_AnonymousClassInType_11_1_performtransformation_binding[3];
			TAbstractType tType = (TAbstractType) result_pattern_AnonymousClassInType_11_1_performtransformation_binding[4];
			TPackage tPackage = (TPackage) result_pattern_AnonymousClassInType_11_1_performtransformation_binding[5];
			TMember tMember = (TMember) result_pattern_AnonymousClassInType_11_1_performtransformation_binding[6];
			TypeGraph pg = (TypeGraph) result_pattern_AnonymousClassInType_11_1_performtransformation_binding[7];
			MDefinition mMember = (MDefinition) result_pattern_AnonymousClassInType_11_1_performtransformation_binding[8];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_AnonymousClassInType_11_1_performtransformation_binding[9];

			Object[] result_pattern_AnonymousClassInType_11_1_performtransformation_black = pattern_AnonymousClassInType_11_1_performtransformation_blackBBBBBBBBBBFBB(
					mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType, tPackage, tMember, pg, mMember, mType,
					_this, isApplicableMatch);
			if (result_pattern_AnonymousClassInType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClassInType_11_1_performtransformation_black[10];

				return new Object[] { mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType, tPackage, tMember,
						pg, mMember, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_11_1_performtransformation_greenBBFFB(
			MClassInstanceCreation mCreation, TClass tAnonymous, CSP csp) {
		MAnonymousClass mAnonymous = ModiscoFactory.eINSTANCE.createMAnonymousClass();
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		Object _localVariable_0 = csp.getValue("mAnonymous", "index");
		mCreation.setAnonymousClassDeclaration(mAnonymous);
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		int mAnonymous_index_prime = (int) _localVariable_0;
		mAnonymous.setIndex(Integer.valueOf(mAnonymous_index_prime));
		return new Object[] { mCreation, tAnonymous, mAnonymous, eAnonymousClassDeclarationToTClass, csp };
	}

	public static final Object[] pattern_AnonymousClassInType_11_2_collecttranslatedelements_blackBBB(TClass tAnonymous,
			MAnonymousClass mAnonymous, AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		return new Object[] { tAnonymous, mAnonymous, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_AnonymousClassInType_11_2_collecttranslatedelements_greenFBBB(
			TClass tAnonymous, MAnonymousClass mAnonymous,
			AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tAnonymous);
		ruleresult.getCreatedElements().add(mAnonymous);
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { ruleresult, tAnonymous, mAnonymous, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_AnonymousClassInType_11_3_bookkeepingforedges_blackBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mMemberToTMember, EObject mCreation, EObject tAnonymous,
			EObject mTypeToTType, EObject tType, EObject tPackage, EObject tMember, EObject pg, EObject mMember,
			EObject mAnonymous, EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		if (!mMemberToTMember.equals(tAnonymous)) {
			if (!mMemberToTMember.equals(mTypeToTType)) {
				if (!mMemberToTMember.equals(tType)) {
					if (!mMemberToTMember.equals(tPackage)) {
						if (!mMemberToTMember.equals(tMember)) {
							if (!mMemberToTMember.equals(pg)) {
								if (!mMemberToTMember.equals(mType)) {
									if (!mCreation.equals(mMemberToTMember)) {
										if (!mCreation.equals(tAnonymous)) {
											if (!mCreation.equals(mTypeToTType)) {
												if (!mCreation.equals(tType)) {
													if (!mCreation.equals(tPackage)) {
														if (!mCreation.equals(tMember)) {
															if (!mCreation.equals(pg)) {
																if (!mCreation.equals(mMember)) {
																	if (!mCreation.equals(mType)) {
																		if (!tAnonymous.equals(tType)) {
																			if (!tAnonymous.equals(tPackage)) {
																				if (!tAnonymous.equals(tMember)) {
																					if (!mTypeToTType
																							.equals(tAnonymous)) {
																						if (!mTypeToTType
																								.equals(tType)) {
																							if (!mTypeToTType
																									.equals(tPackage)) {
																								if (!mTypeToTType
																										.equals(tMember)) {
																									if (!mTypeToTType
																											.equals(pg)) {
																										if (!tPackage
																												.equals(tType)) {
																											if (!tMember
																													.equals(tType)) {
																												if (!tMember
																														.equals(tPackage)) {
																													if (!pg.equals(
																															tAnonymous)) {
																														if (!pg.equals(
																																tType)) {
																															if (!pg.equals(
																																	tPackage)) {
																																if (!pg.equals(
																																		tMember)) {
																																	if (!mMember
																																			.equals(mMemberToTMember)) {
																																		if (!mMember
																																				.equals(tAnonymous)) {
																																			if (!mMember
																																					.equals(mTypeToTType)) {
																																				if (!mMember
																																						.equals(tType)) {
																																					if (!mMember
																																							.equals(tPackage)) {
																																						if (!mMember
																																								.equals(tMember)) {
																																							if (!mMember
																																									.equals(pg)) {
																																								if (!mMember
																																										.equals(mType)) {
																																									if (!mAnonymous
																																											.equals(mMemberToTMember)) {
																																										if (!mAnonymous
																																												.equals(mCreation)) {
																																											if (!mAnonymous
																																													.equals(tAnonymous)) {
																																												if (!mAnonymous
																																														.equals(mTypeToTType)) {
																																													if (!mAnonymous
																																															.equals(tType)) {
																																														if (!mAnonymous
																																																.equals(tPackage)) {
																																															if (!mAnonymous
																																																	.equals(tMember)) {
																																																if (!mAnonymous
																																																		.equals(pg)) {
																																																	if (!mAnonymous
																																																			.equals(mMember)) {
																																																		if (!mAnonymous
																																																				.equals(mType)) {
																																																			if (!eAnonymousClassDeclarationToTClass
																																																					.equals(mMemberToTMember)) {
																																																				if (!eAnonymousClassDeclarationToTClass
																																																						.equals(mCreation)) {
																																																					if (!eAnonymousClassDeclarationToTClass
																																																							.equals(tAnonymous)) {
																																																						if (!eAnonymousClassDeclarationToTClass
																																																								.equals(mTypeToTType)) {
																																																							if (!eAnonymousClassDeclarationToTClass
																																																									.equals(tType)) {
																																																								if (!eAnonymousClassDeclarationToTClass
																																																										.equals(tPackage)) {
																																																									if (!eAnonymousClassDeclarationToTClass
																																																											.equals(tMember)) {
																																																										if (!eAnonymousClassDeclarationToTClass
																																																												.equals(pg)) {
																																																											if (!eAnonymousClassDeclarationToTClass
																																																													.equals(mMember)) {
																																																												if (!eAnonymousClassDeclarationToTClass
																																																														.equals(mAnonymous)) {
																																																													if (!eAnonymousClassDeclarationToTClass
																																																															.equals(mType)) {
																																																														if (!mType
																																																																.equals(tAnonymous)) {
																																																															if (!mType
																																																																	.equals(mTypeToTType)) {
																																																																if (!mType
																																																																		.equals(tType)) {
																																																																	if (!mType
																																																																			.equals(tPackage)) {
																																																																		if (!mType
																																																																				.equals(tMember)) {
																																																																			if (!mType
																																																																					.equals(pg)) {
																																																																				return new Object[] {
																																																																						ruleresult,
																																																																						mMemberToTMember,
																																																																						mCreation,
																																																																						tAnonymous,
																																																																						mTypeToTType,
																																																																						tType,
																																																																						tPackage,
																																																																						tMember,
																																																																						pg,
																																																																						mMember,
																																																																						mAnonymous,
																																																																						eAnonymousClassDeclarationToTClass,
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
												}
											}
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

	public static final Object[] pattern_AnonymousClassInType_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject mCreation, EObject tAnonymous, EObject tType, EObject tPackage,
			EObject pg, EObject mAnonymous, EObject eAnonymousClassDeclarationToTClass) {
		EMoflonEdge tPackage__tAnonymous____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tAnonymous____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tPackage__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mCreation__mAnonymous____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnonymous__mCreation____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__mAnonymous____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClassInType";
		String tPackage__tAnonymous____allTypes_name_prime = "allTypes";
		String tAnonymous__tPackage____package_name_prime = "package";
		String pg__tAnonymous____classes_name_prime = "classes";
		String pg__tAnonymous____allTypes_name_prime = "allTypes";
		String tAnonymous__pg____model_name_prime = "model";
		String eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime = "target";
		String tPackage__tAnonymous____classes_name_prime = "classes";
		String mCreation__mAnonymous____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnonymous__mCreation____classInstanceCreation_name_prime = "classInstanceCreation";
		String eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime = "source";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		tPackage__tAnonymous____allTypes.setSrc(tPackage);
		tPackage__tAnonymous____allTypes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(tPackage__tAnonymous____allTypes);
		tAnonymous__tPackage____package.setSrc(tAnonymous);
		tAnonymous__tPackage____package.setTrg(tPackage);
		ruleresult.getTranslatedEdges().add(tAnonymous__tPackage____package);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(pg__tAnonymous____classes);
		pg__tAnonymous____allTypes.setSrc(pg);
		pg__tAnonymous____allTypes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(pg__tAnonymous____allTypes);
		tAnonymous__pg____model.setSrc(tAnonymous);
		tAnonymous__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tAnonymous__pg____model);
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tAnonymous____target.setTrg(tAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tAnonymous____target);
		tPackage__tAnonymous____classes.setSrc(tPackage);
		tPackage__tAnonymous____classes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(tPackage__tAnonymous____classes);
		mCreation__mAnonymous____anonymousClassDeclaration.setSrc(mCreation);
		mCreation__mAnonymous____anonymousClassDeclaration.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(mCreation__mAnonymous____anonymousClassDeclaration);
		mAnonymous__mCreation____classInstanceCreation.setSrc(mAnonymous);
		mAnonymous__mCreation____classInstanceCreation.setTrg(mCreation);
		ruleresult.getCreatedEdges().add(mAnonymous__mCreation____classInstanceCreation);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__mAnonymous____source.setTrg(mAnonymous);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__mAnonymous____source);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		ruleresult.getTranslatedEdges().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tAnonymous__tType____outerType);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tPackage__tAnonymous____allTypes.setName(tPackage__tAnonymous____allTypes_name_prime);
		tAnonymous__tPackage____package.setName(tAnonymous__tPackage____package_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		pg__tAnonymous____allTypes.setName(pg__tAnonymous____allTypes_name_prime);
		tAnonymous__pg____model.setName(tAnonymous__pg____model_name_prime);
		eAnonymousClassDeclarationToTClass__tAnonymous____target
				.setName(eAnonymousClassDeclarationToTClass__tAnonymous____target_name_prime);
		tPackage__tAnonymous____classes.setName(tPackage__tAnonymous____classes_name_prime);
		mCreation__mAnonymous____anonymousClassDeclaration
				.setName(mCreation__mAnonymous____anonymousClassDeclaration_name_prime);
		mAnonymous__mCreation____classInstanceCreation
				.setName(mAnonymous__mCreation____classInstanceCreation_name_prime);
		eAnonymousClassDeclarationToTClass__mAnonymous____source
				.setName(eAnonymousClassDeclarationToTClass__mAnonymous____source_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		return new Object[] { ruleresult, mCreation, tAnonymous, tType, tPackage, pg, mAnonymous,
				eAnonymousClassDeclarationToTClass, tPackage__tAnonymous____allTypes, tAnonymous__tPackage____package,
				pg__tAnonymous____classes, pg__tAnonymous____allTypes, tAnonymous__pg____model,
				eAnonymousClassDeclarationToTClass__tAnonymous____target, tPackage__tAnonymous____classes,
				mCreation__mAnonymous____anonymousClassDeclaration, mAnonymous__mCreation____classInstanceCreation,
				eAnonymousClassDeclarationToTClass__mAnonymous____source, tType__tAnonymous____innerTypes,
				tAnonymous__tType____outerType };
	}

	public static final void pattern_AnonymousClassInType_11_5_registerobjects_expressionBBBBBBBBBBBBBB(
			AnonymousClassInType _this, PerformRuleResult ruleresult, EObject mMemberToTMember, EObject mCreation,
			EObject tAnonymous, EObject mTypeToTType, EObject tType, EObject tPackage, EObject tMember, EObject pg,
			EObject mMember, EObject mAnonymous, EObject eAnonymousClassDeclarationToTClass, EObject mType) {
		_this.registerObjects_BWD(ruleresult, mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType, tPackage,
				tMember, pg, mMember, mAnonymous, eAnonymousClassDeclarationToTClass, mType);

	}

	public static final PerformRuleResult pattern_AnonymousClassInType_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_12_1_preparereturnvalue_bindingFB(
			AnonymousClassInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClassInType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClassInType _this) {
		Object[] result_pattern_AnonymousClassInType_12_1_preparereturnvalue_binding = pattern_AnonymousClassInType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassInType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClassInType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassInType_12_1_preparereturnvalue_black = pattern_AnonymousClassInType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClassInType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClassInType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClassInType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClassInType_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tAnonymous");
		EObject _localVariable_1 = match.getObject("tType");
		EObject _localVariable_2 = match.getObject("tPackage");
		EObject _localVariable_3 = match.getObject("tMember");
		EObject _localVariable_4 = match.getObject("pg");
		EObject tmpTAnonymous = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpTPackage = _localVariable_2;
		EObject tmpTMember = _localVariable_3;
		EObject tmpPg = _localVariable_4;
		if (tmpTAnonymous instanceof TClass) {
			TClass tAnonymous = (TClass) tmpTAnonymous;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				if (tmpTPackage instanceof TPackage) {
					TPackage tPackage = (TPackage) tmpTPackage;
					if (tmpTMember instanceof TMember) {
						TMember tMember = (TMember) tmpTMember;
						if (tmpPg instanceof TypeGraph) {
							TypeGraph pg = (TypeGraph) tmpPg;
							return new Object[] { tAnonymous, tType, tPackage, tMember, pg, match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassInType_12_2_corematch_blackFBFBBBBFFB(
			TClass tAnonymous, TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnonymous.equals(tType)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
				Type tmpMType = mTypeToTType.getSource();
				if (tmpMType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
					for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
						BodyDeclaration tmpMMember = mMemberToTMember.getSource();
						if (tmpMMember instanceof MDefinition) {
							MDefinition mMember = (MDefinition) tmpMMember;
							_result.add(new Object[] { mMemberToTMember, tAnonymous, mTypeToTType, tType, tPackage,
									tMember, pg, mMember, mType, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassInType_12_3_findcontext_blackBFBBBBBBBB(
			MDefinitionToTMember mMemberToTMember, TClass tAnonymous, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember,
			AbstractTypeDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tAnonymous.equals(tType)) {
			if (tPackage.getAllTypes().contains(tAnonymous)) {
				if (mType.getBodyDeclarations().contains(mMember)) {
					if (mMember.equals(mMemberToTMember.getSource())) {
						if (pg.getClasses().contains(tAnonymous)) {
							if (pg.equals(tPackage.getModel())) {
								if (tType.getDefines().contains(tMember)) {
									if (pg.getAllTypes().contains(tAnonymous)) {
										if (tPackage.getClasses().contains(tAnonymous)) {
											if (tPackage.equals(tType.getPackage())) {
												if (tType.equals(mTypeToTType.getTarget())) {
													if (tMember.equals(mMemberToTMember.getTarget())) {
														if (mType.equals(mTypeToTType.getSource())) {
															if (tType.getInnerTypes().contains(tAnonymous)) {
																for (AbstractMethodInvocation tmpMCreation : mMember
																		.getMMethodInvocations()) {
																	if (tmpMCreation instanceof MClassInstanceCreation) {
																		MClassInstanceCreation mCreation = (MClassInstanceCreation) tmpMCreation;
																		_result.add(new Object[] { mMemberToTMember,
																				mCreation, tAnonymous, mTypeToTType,
																				tType, tPackage, tMember, pg, mMember,
																				mType });
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnonymousClassInType_12_3_findcontext_greenBBBBBBBBBBFFFFFFFFFFFFFFFFFFFFF(
			MDefinitionToTMember mMemberToTMember, MClassInstanceCreation mCreation, TClass tAnonymous,
			TypeToTAbstractType mTypeToTType, TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg,
			MDefinition mMember, AbstractTypeDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tPackage__tAnonymous____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__mMember____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mCreation____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tType____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAnonymous____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tAnonymous____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tPackage__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMemberToTMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tAnonymous____innerTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAnonymous__tType____outerType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tPackage__tAnonymous____allTypes_name_prime = "allTypes";
		String tAnonymous__tPackage____package_name_prime = "package";
		String mType__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__mType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mMemberToTMember__mMember____source_name_prime = "source";
		String mMember__mCreation____mMethodInvocations_name_prime = "mMethodInvocations";
		String pg__tAnonymous____classes_name_prime = "classes";
		String tPackage__pg____model_name_prime = "model";
		String tType__tMember____defines_name_prime = "defines";
		String tMember__tType____definedBy_name_prime = "definedBy";
		String pg__tAnonymous____allTypes_name_prime = "allTypes";
		String tAnonymous__pg____model_name_prime = "model";
		String tPackage__tAnonymous____classes_name_prime = "classes";
		String tType__tPackage____package_name_prime = "package";
		String tPackage__tType____allTypes_name_prime = "allTypes";
		String mTypeToTType__tType____target_name_prime = "target";
		String mMemberToTMember__tMember____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String tType__tAnonymous____innerTypes_name_prime = "innerTypes";
		String tAnonymous__tType____outerType_name_prime = "outerType";
		isApplicableMatch.getAllContextElements().add(mMemberToTMember);
		isApplicableMatch.getAllContextElements().add(mCreation);
		isApplicableMatch.getAllContextElements().add(tAnonymous);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(tPackage);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(mType);
		tPackage__tAnonymous____allTypes.setSrc(tPackage);
		tPackage__tAnonymous____allTypes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tPackage__tAnonymous____allTypes);
		tAnonymous__tPackage____package.setSrc(tAnonymous);
		tAnonymous__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tPackage____package);
		mType__mMember____bodyDeclarations.setSrc(mType);
		mType__mMember____bodyDeclarations.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mType__mMember____bodyDeclarations);
		mMember__mType____abstractTypeDeclaration.setSrc(mMember);
		mMember__mType____abstractTypeDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mMember__mType____abstractTypeDeclaration);
		mMemberToTMember__mMember____source.setSrc(mMemberToTMember);
		mMemberToTMember__mMember____source.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__mMember____source);
		mMember__mCreation____mMethodInvocations.setSrc(mMember);
		mMember__mCreation____mMethodInvocations.setTrg(mCreation);
		isApplicableMatch.getAllContextElements().add(mMember__mCreation____mMethodInvocations);
		pg__tAnonymous____classes.setSrc(pg);
		pg__tAnonymous____classes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(pg__tAnonymous____classes);
		tPackage__pg____model.setSrc(tPackage);
		tPackage__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tPackage__pg____model);
		tType__tMember____defines.setSrc(tType);
		tType__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tType__tMember____defines);
		tMember__tType____definedBy.setSrc(tMember);
		tMember__tType____definedBy.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tMember__tType____definedBy);
		pg__tAnonymous____allTypes.setSrc(pg);
		pg__tAnonymous____allTypes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(pg__tAnonymous____allTypes);
		tAnonymous__pg____model.setSrc(tAnonymous);
		tAnonymous__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tAnonymous__pg____model);
		tPackage__tAnonymous____classes.setSrc(tPackage);
		tPackage__tAnonymous____classes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tPackage__tAnonymous____classes);
		tType__tPackage____package.setSrc(tType);
		tType__tPackage____package.setTrg(tPackage);
		isApplicableMatch.getAllContextElements().add(tType__tPackage____package);
		tPackage__tType____allTypes.setSrc(tPackage);
		tPackage__tType____allTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tPackage__tType____allTypes);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mMemberToTMember__tMember____target.setSrc(mMemberToTMember);
		mMemberToTMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(mMemberToTMember__tMember____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		tType__tAnonymous____innerTypes.setSrc(tType);
		tType__tAnonymous____innerTypes.setTrg(tAnonymous);
		isApplicableMatch.getAllContextElements().add(tType__tAnonymous____innerTypes);
		tAnonymous__tType____outerType.setSrc(tAnonymous);
		tAnonymous__tType____outerType.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tAnonymous__tType____outerType);
		tPackage__tAnonymous____allTypes.setName(tPackage__tAnonymous____allTypes_name_prime);
		tAnonymous__tPackage____package.setName(tAnonymous__tPackage____package_name_prime);
		mType__mMember____bodyDeclarations.setName(mType__mMember____bodyDeclarations_name_prime);
		mMember__mType____abstractTypeDeclaration.setName(mMember__mType____abstractTypeDeclaration_name_prime);
		mMemberToTMember__mMember____source.setName(mMemberToTMember__mMember____source_name_prime);
		mMember__mCreation____mMethodInvocations.setName(mMember__mCreation____mMethodInvocations_name_prime);
		pg__tAnonymous____classes.setName(pg__tAnonymous____classes_name_prime);
		tPackage__pg____model.setName(tPackage__pg____model_name_prime);
		tType__tMember____defines.setName(tType__tMember____defines_name_prime);
		tMember__tType____definedBy.setName(tMember__tType____definedBy_name_prime);
		pg__tAnonymous____allTypes.setName(pg__tAnonymous____allTypes_name_prime);
		tAnonymous__pg____model.setName(tAnonymous__pg____model_name_prime);
		tPackage__tAnonymous____classes.setName(tPackage__tAnonymous____classes_name_prime);
		tType__tPackage____package.setName(tType__tPackage____package_name_prime);
		tPackage__tType____allTypes.setName(tPackage__tType____allTypes_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mMemberToTMember__tMember____target.setName(mMemberToTMember__tMember____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		tType__tAnonymous____innerTypes.setName(tType__tAnonymous____innerTypes_name_prime);
		tAnonymous__tType____outerType.setName(tAnonymous__tType____outerType_name_prime);
		return new Object[] { mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType, tPackage, tMember, pg,
				mMember, mType, isApplicableMatch, tPackage__tAnonymous____allTypes, tAnonymous__tPackage____package,
				mType__mMember____bodyDeclarations, mMember__mType____abstractTypeDeclaration,
				mMemberToTMember__mMember____source, mMember__mCreation____mMethodInvocations,
				pg__tAnonymous____classes, tPackage__pg____model, tType__tMember____defines,
				tMember__tType____definedBy, pg__tAnonymous____allTypes, tAnonymous__pg____model,
				tPackage__tAnonymous____classes, tType__tPackage____package, tPackage__tType____allTypes,
				mTypeToTType__tType____target, mMemberToTMember__tMember____target, mTypeToTType__mType____source,
				tType__tAnonymous____innerTypes, tAnonymous__tType____outerType };
	}

	public static final Object[] pattern_AnonymousClassInType_12_4_solveCSP_bindingFBBBBBBBBBBBB(
			AnonymousClassInType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MClassInstanceCreation mCreation, TClass tAnonymous, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mMemberToTMember, mCreation,
				tAnonymous, mTypeToTType, tType, tPackage, tMember, pg, mMember, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, mCreation, tAnonymous, mTypeToTType,
					tType, tPackage, tMember, pg, mMember, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassInType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			AnonymousClassInType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MClassInstanceCreation mCreation, TClass tAnonymous, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember, AbstractTypeDeclaration mType) {
		Object[] result_pattern_AnonymousClassInType_12_4_solveCSP_binding = pattern_AnonymousClassInType_12_4_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, mCreation, tAnonymous, mTypeToTType, tType, tPackage,
				tMember, pg, mMember, mType);
		if (result_pattern_AnonymousClassInType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassInType_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClassInType_12_4_solveCSP_black = pattern_AnonymousClassInType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassInType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, mCreation, tAnonymous,
						mTypeToTType, tType, tPackage, tMember, pg, mMember, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassInType_12_5_checkCSP_expressionFBB(AnonymousClassInType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClassInType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClassInType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClassInType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_20_1_preparereturnvalue_bindingFB(
			AnonymousClassInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClassInType _this) {
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

	public static final Object[] pattern_AnonymousClassInType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClassInType _this) {
		Object[] result_pattern_AnonymousClassInType_20_1_preparereturnvalue_binding = pattern_AnonymousClassInType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassInType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClassInType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassInType_20_1_preparereturnvalue_black = pattern_AnonymousClassInType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClassInType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClassInType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClassInType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousClassInType_20_2_testcorematchandDECs_black_nac_0BB(TClass tAnonymous,
			TPackage tPackage) {
		for (TPackage __DEC_tAnonymous_classes_377794 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, TPackage.class, "classes")) {
			if (!tPackage.equals(__DEC_tAnonymous_classes_377794)) {
				return new Object[] { tAnonymous, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_20_2_testcorematchandDECs_black_nac_1BB(TClass tAnonymous,
			TypeGraph pg) {
		for (TypeGraph __DEC_tAnonymous_classes_298783 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tAnonymous_classes_298783)) {
				return new Object[] { tAnonymous, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_20_2_testcorematchandDECs_black_nac_2BB(TClass tAnonymous,
			TAbstractType tType) {
		if (!tAnonymous.equals(tType)) {
			TAbstractType __DEC_tAnonymous_innerTypes_340810 = tAnonymous.getOuterType();
			if (__DEC_tAnonymous_innerTypes_340810 != null) {
				if (!tAnonymous.equals(__DEC_tAnonymous_innerTypes_340810)) {
					if (!tType.equals(__DEC_tAnonymous_innerTypes_340810)) {
						return new Object[] { tAnonymous, tType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_20_2_testcorematchandDECs_black_nac_3BB(TClass tAnonymous,
			TPackage tPackage) {
		TPackage __DEC_tAnonymous_allTypes_298215 = tAnonymous.getPackage();
		if (__DEC_tAnonymous_allTypes_298215 != null) {
			if (!tPackage.equals(__DEC_tAnonymous_allTypes_298215)) {
				return new Object[] { tAnonymous, tPackage };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassInType_20_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_allTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTPackage = _edge_allTypes.getSrc();
		if (tmpTPackage instanceof TPackage) {
			TPackage tPackage = (TPackage) tmpTPackage;
			EObject tmpTAnonymous = _edge_allTypes.getTrg();
			if (tmpTAnonymous instanceof TClass) {
				TClass tAnonymous = (TClass) tmpTAnonymous;
				if (tPackage.getAllTypes().contains(tAnonymous)) {
					if (tPackage.getClasses().contains(tAnonymous)) {
						TypeGraph pg = tPackage.getModel();
						if (pg != null) {
							if (pg.getClasses().contains(tAnonymous)) {
								if (pg.getAllTypes().contains(tAnonymous)) {
									TAbstractType tType = tAnonymous.getOuterType();
									if (tType != null) {
										if (!tAnonymous.equals(tType)) {
											if (tPackage.equals(tType.getPackage())) {
												if (pattern_AnonymousClassInType_20_2_testcorematchandDECs_black_nac_0BB(
														tAnonymous, tPackage) == null) {
													if (pattern_AnonymousClassInType_20_2_testcorematchandDECs_black_nac_3BB(
															tAnonymous, tPackage) == null) {
														if (pattern_AnonymousClassInType_20_2_testcorematchandDECs_black_nac_1BB(
																tAnonymous, pg) == null) {
															if (pattern_AnonymousClassInType_20_2_testcorematchandDECs_black_nac_2BB(
																	tAnonymous, tType) == null) {
																for (TMember tMember : tType.getDefines()) {
																	_result.add(new Object[] { tAnonymous, tType,
																			tPackage, tMember, pg, _edge_allTypes });
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnonymousClassInType_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClassInType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			AnonymousClassInType _this, Match match, TClass tAnonymous, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tAnonymous, tType, tPackage, tMember, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClassInType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClassInType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClassInType_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_21_1_preparereturnvalue_bindingFB(
			AnonymousClassInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClassInType _this) {
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

	public static final Object[] pattern_AnonymousClassInType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClassInType _this) {
		Object[] result_pattern_AnonymousClassInType_21_1_preparereturnvalue_binding = pattern_AnonymousClassInType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClassInType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClassInType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClassInType_21_1_preparereturnvalue_black = pattern_AnonymousClassInType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClassInType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClassInType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClassInType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousClassInType_21_2_testcorematchandDECs_black_nac_0B(
			MAnonymousClass mAnonymous) {
		for (EnumConstantDeclaration __DEC_mAnonymous_anonymousClassDeclaration_195984 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnonymous, EnumConstantDeclaration.class, "anonymousClassDeclaration")) {
			return new Object[] { mAnonymous };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassInType_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_anonymousClassDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMCreation = _edge_anonymousClassDeclaration.getSrc();
		if (tmpMCreation instanceof MClassInstanceCreation) {
			MClassInstanceCreation mCreation = (MClassInstanceCreation) tmpMCreation;
			EObject tmpMAnonymous = _edge_anonymousClassDeclaration.getTrg();
			if (tmpMAnonymous instanceof MAnonymousClass) {
				MAnonymousClass mAnonymous = (MAnonymousClass) tmpMAnonymous;
				if (mAnonymous.equals(mCreation.getAnonymousClassDeclaration())) {
					if (pattern_AnonymousClassInType_21_2_testcorematchandDECs_black_nac_0B(mAnonymous) == null) {
						for (MDefinition mMember : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mCreation, MDefinition.class, "mMethodInvocations")) {
							AbstractTypeDeclaration mType = mMember.getAbstractTypeDeclaration();
							if (mType != null) {
								_result.add(new Object[] { mCreation, mMember, mAnonymous, mType,
										_edge_anonymousClassDeclaration });
							}

						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClassInType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnonymousClassInType _this, Match match, MClassInstanceCreation mCreation, MDefinition mMember,
			MAnonymousClass mAnonymous, AbstractTypeDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mCreation, mMember, mAnonymous, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClassInType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClassInType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClassInType_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_24_1_prepare_blackB(AnonymousClassInType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClassInType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnonymousClassInType_24_2_matchsrctrgcontext_bindingFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mCreation");
		EObject _localVariable_1 = targetMatch.getObject("tAnonymous");
		EObject _localVariable_2 = targetMatch.getObject("tType");
		EObject _localVariable_3 = targetMatch.getObject("tPackage");
		EObject _localVariable_4 = targetMatch.getObject("tMember");
		EObject _localVariable_5 = targetMatch.getObject("pg");
		EObject _localVariable_6 = sourceMatch.getObject("mMember");
		EObject _localVariable_7 = sourceMatch.getObject("mAnonymous");
		EObject _localVariable_8 = sourceMatch.getObject("mType");
		EObject tmpMCreation = _localVariable_0;
		EObject tmpTAnonymous = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpTPackage = _localVariable_3;
		EObject tmpTMember = _localVariable_4;
		EObject tmpPg = _localVariable_5;
		EObject tmpMMember = _localVariable_6;
		EObject tmpMAnonymous = _localVariable_7;
		EObject tmpMType = _localVariable_8;
		if (tmpMCreation instanceof MClassInstanceCreation) {
			MClassInstanceCreation mCreation = (MClassInstanceCreation) tmpMCreation;
			if (tmpTAnonymous instanceof TClass) {
				TClass tAnonymous = (TClass) tmpTAnonymous;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpTPackage instanceof TPackage) {
						TPackage tPackage = (TPackage) tmpTPackage;
						if (tmpTMember instanceof TMember) {
							TMember tMember = (TMember) tmpTMember;
							if (tmpPg instanceof TypeGraph) {
								TypeGraph pg = (TypeGraph) tmpPg;
								if (tmpMMember instanceof MDefinition) {
									MDefinition mMember = (MDefinition) tmpMMember;
									if (tmpMAnonymous instanceof MAnonymousClass) {
										MAnonymousClass mAnonymous = (MAnonymousClass) tmpMAnonymous;
										if (tmpMType instanceof AbstractTypeDeclaration) {
											AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
											return new Object[] { mCreation, tAnonymous, tType, tPackage, tMember, pg,
													mMember, mAnonymous, mType, sourceMatch, targetMatch };
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

	public static final Object[] pattern_AnonymousClassInType_24_2_matchsrctrgcontext_blackBBBBBBBBBBB(
			MClassInstanceCreation mCreation, TClass tAnonymous, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		if (!tAnonymous.equals(tType)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { mCreation, tAnonymous, tType, tPackage, tMember, pg, mMember, mAnonymous, mType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding = pattern_AnonymousClassInType_24_2_matchsrctrgcontext_bindingFFFFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding != null) {
			MClassInstanceCreation mCreation = (MClassInstanceCreation) result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding[0];
			TClass tAnonymous = (TClass) result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding[2];
			TPackage tPackage = (TPackage) result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding[3];
			TMember tMember = (TMember) result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding[4];
			TypeGraph pg = (TypeGraph) result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding[5];
			MDefinition mMember = (MDefinition) result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding[6];
			MAnonymousClass mAnonymous = (MAnonymousClass) result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding[7];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_binding[8];

			Object[] result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_black = pattern_AnonymousClassInType_24_2_matchsrctrgcontext_blackBBBBBBBBBBB(
					mCreation, tAnonymous, tType, tPackage, tMember, pg, mMember, mAnonymous, mType, sourceMatch,
					targetMatch);
			if (result_pattern_AnonymousClassInType_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mCreation, tAnonymous, tType, tPackage, tMember, pg, mMember, mAnonymous, mType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_24_3_solvecsp_bindingFBBBBBBBBBBBB(
			AnonymousClassInType _this, MClassInstanceCreation mCreation, TClass tAnonymous, TAbstractType tType,
			TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_9 = _this.isApplicable_solveCsp_CC(mCreation, tAnonymous, tType, tPackage, tMember, pg,
				mMember, mAnonymous, mType, sourceMatch, targetMatch);
		CSP csp = _localVariable_9;
		if (csp != null) {
			return new Object[] { csp, _this, mCreation, tAnonymous, tType, tPackage, tMember, pg, mMember, mAnonymous,
					mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassInType_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBB(
			AnonymousClassInType _this, MClassInstanceCreation mCreation, TClass tAnonymous, TAbstractType tType,
			TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClassInType_24_3_solvecsp_binding = pattern_AnonymousClassInType_24_3_solvecsp_bindingFBBBBBBBBBBBB(
				_this, mCreation, tAnonymous, tType, tPackage, tMember, pg, mMember, mAnonymous, mType, sourceMatch,
				targetMatch);
		if (result_pattern_AnonymousClassInType_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassInType_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnonymousClassInType_24_3_solvecsp_black = pattern_AnonymousClassInType_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnonymousClassInType_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mCreation, tAnonymous, tType, tPackage, tMember, pg, mMember,
						mAnonymous, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassInType_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassInType_24_5_matchcorrcontext_blackFFBBBBBB(
			TAbstractType tType, TMember tMember, MDefinition mMember, AbstractTypeDeclaration mType, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (MDefinitionToTMember mMemberToTMember : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mMember, MDefinitionToTMember.class, "source")) {
				if (tMember.equals(mMemberToTMember.getTarget())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
						if (mType.equals(mTypeToTType.getSource())) {
							_result.add(new Object[] { mMemberToTMember, mTypeToTType, tType, tMember, mMember, mType,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_24_5_matchcorrcontext_greenBBBBF(
			MDefinitionToTMember mMemberToTMember, TypeToTAbstractType mTypeToTType, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnonymousClassInType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mMemberToTMember);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mMemberToTMember, mTypeToTType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnonymousClassInType_24_6_createcorrespondence_blackBBBBBBBBBB(
			MClassInstanceCreation mCreation, TClass tAnonymous, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType, CCMatch ccMatch) {
		if (!tAnonymous.equals(tType)) {
			return new Object[] { mCreation, tAnonymous, tType, tPackage, tMember, pg, mMember, mAnonymous, mType,
					ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_24_6_createcorrespondence_greenBBFB(TClass tAnonymous,
			MAnonymousClass mAnonymous, CCMatch ccMatch) {
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		ccMatch.getCreateCorr().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { tAnonymous, mAnonymous, eAnonymousClassDeclarationToTClass, ccMatch };
	}

	public static final Object[] pattern_AnonymousClassInType_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnonymousClassInType_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnonymousClassInType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClassInType_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_27_1_matchtggpattern_black_nac_0B(
			MAnonymousClass mAnonymous) {
		for (EnumConstantDeclaration __DEC_mAnonymous_anonymousClassDeclaration_731328 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnonymous, EnumConstantDeclaration.class, "anonymousClassDeclaration")) {
			return new Object[] { mAnonymous };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_27_1_matchtggpattern_blackBBBB(
			MClassInstanceCreation mCreation, MDefinition mMember, MAnonymousClass mAnonymous,
			AbstractTypeDeclaration mType) {
		if (mType.getBodyDeclarations().contains(mMember)) {
			if (mMember.getMMethodInvocations().contains(mCreation)) {
				if (mAnonymous.equals(mCreation.getAnonymousClassDeclaration())) {
					if (pattern_AnonymousClassInType_27_1_matchtggpattern_black_nac_0B(mAnonymous) == null) {
						return new Object[] { mCreation, mMember, mAnonymous, mType };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassInType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassInType_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_28_1_matchtggpattern_black_nac_0BB(TClass tAnonymous,
			TPackage tPackage) {
		for (TPackage __DEC_tAnonymous_classes_990740 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, TPackage.class, "classes")) {
			if (!tPackage.equals(__DEC_tAnonymous_classes_990740)) {
				return new Object[] { tAnonymous, tPackage };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_28_1_matchtggpattern_black_nac_1BB(TClass tAnonymous,
			TypeGraph pg) {
		for (TypeGraph __DEC_tAnonymous_classes_635583 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tAnonymous, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tAnonymous_classes_635583)) {
				return new Object[] { tAnonymous, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_28_1_matchtggpattern_black_nac_2BB(TClass tAnonymous,
			TAbstractType tType) {
		if (!tAnonymous.equals(tType)) {
			TAbstractType __DEC_tAnonymous_innerTypes_515939 = tAnonymous.getOuterType();
			if (__DEC_tAnonymous_innerTypes_515939 != null) {
				if (!tAnonymous.equals(__DEC_tAnonymous_innerTypes_515939)) {
					if (!tType.equals(__DEC_tAnonymous_innerTypes_515939)) {
						return new Object[] { tAnonymous, tType };
					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_28_1_matchtggpattern_black_nac_3BB(TClass tAnonymous,
			TPackage tPackage) {
		TPackage __DEC_tAnonymous_allTypes_32391 = tAnonymous.getPackage();
		if (__DEC_tAnonymous_allTypes_32391 != null) {
			if (!tPackage.equals(__DEC_tAnonymous_allTypes_32391)) {
				return new Object[] { tAnonymous, tPackage };
			}
		}

		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_28_1_matchtggpattern_blackBBBBB(TClass tAnonymous,
			TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg) {
		if (!tAnonymous.equals(tType)) {
			if (tPackage.getAllTypes().contains(tAnonymous)) {
				if (pg.getClasses().contains(tAnonymous)) {
					if (pg.equals(tPackage.getModel())) {
						if (tType.getDefines().contains(tMember)) {
							if (pg.getAllTypes().contains(tAnonymous)) {
								if (tPackage.getClasses().contains(tAnonymous)) {
									if (tPackage.equals(tType.getPackage())) {
										if (tType.getInnerTypes().contains(tAnonymous)) {
											if (pattern_AnonymousClassInType_28_1_matchtggpattern_black_nac_0BB(
													tAnonymous, tPackage) == null) {
												if (pattern_AnonymousClassInType_28_1_matchtggpattern_black_nac_1BB(
														tAnonymous, pg) == null) {
													if (pattern_AnonymousClassInType_28_1_matchtggpattern_black_nac_2BB(
															tAnonymous, tType) == null) {
														if (pattern_AnonymousClassInType_28_1_matchtggpattern_black_nac_3BB(
																tAnonymous, tPackage) == null) {
															return new Object[] { tAnonymous, tType, tPackage, tMember,
																	pg };
														}
													}
												}
											}
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

	public static final boolean pattern_AnonymousClassInType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClassInType_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_29_1_createresult_blackB(AnonymousClassInType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClassInType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember mMemberToTMember) {
		if (ruleResult.getCorrObjects().contains(mMemberToTMember)) {
			return new Object[] { ruleResult, mMemberToTMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MClassInstanceCreation mCreation) {
		if (ruleResult.getSourceObjects().contains(mCreation)) {
			return new Object[] { ruleResult, mCreation };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_7BB(
			ModelgeneratorRuleResult ruleResult, TPackage tPackage) {
		if (ruleResult.getTargetObjects().contains(tPackage)) {
			return new Object[] { ruleResult, tPackage };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_8BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClassInType_29_2_isapplicablecore_blackFFFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mMemberToTMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMMemberToTMember : mMemberToTMemberList.getEntryObjects()) {
				if (tmpMMemberToTMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember mMemberToTMember = (MDefinitionToTMember) tmpMMemberToTMember;
					BodyDeclaration tmpMMember = mMemberToTMember.getSource();
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						TMember tMember = mMemberToTMember.getTarget();
						if (tMember != null) {
							AbstractTypeDeclaration mType = mMember.getAbstractTypeDeclaration();
							if (mType != null) {
								TAbstractType tType = tMember.getDefinedBy();
								if (tType != null) {
									TPackage tPackage = tType.getPackage();
									if (tPackage != null) {
										TypeGraph pg = tPackage.getModel();
										if (pg != null) {
											if (pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, mMemberToTMember) == null) {
												if (pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_1BB(
														ruleResult, mMember) == null) {
													if (pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_6BB(
															ruleResult, tMember) == null) {
														if (pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_3BB(
																ruleResult, mType) == null) {
															if (pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_5BB(
																	ruleResult, tType) == null) {
																if (pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_7BB(
																		ruleResult, tPackage) == null) {
																	if (pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_8BB(
																			ruleResult, pg) == null) {
																		for (AbstractMethodInvocation tmpMCreation : mMember
																				.getMMethodInvocations()) {
																			if (tmpMCreation instanceof MClassInstanceCreation) {
																				MClassInstanceCreation mCreation = (MClassInstanceCreation) tmpMCreation;
																				if (pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_2BB(
																						ruleResult,
																						mCreation) == null) {
																					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
																							.getOppositeReferenceTyped(
																									mType,
																									TypeToTAbstractType.class,
																									"source")) {
																						if (tType.equals(mTypeToTType
																								.getTarget())) {
																							if (pattern_AnonymousClassInType_29_2_isapplicablecore_black_nac_4BB(
																									ruleResult,
																									mTypeToTType) == null) {
																								_result.add(
																										new Object[] {
																												mMemberToTMemberList,
																												mMemberToTMember,
																												mMember,
																												mCreation,
																												mType,
																												mTypeToTType,
																												tType,
																												tMember,
																												tPackage,
																												pg,
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

					}

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_29_3_solveCSP_bindingFBBBBBBBBBBBB(
			AnonymousClassInType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg, MDefinition mMember, AbstractTypeDeclaration mType,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mMemberToTMember, mCreation,
				mTypeToTType, tType, tPackage, tMember, pg, mMember, mType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, mCreation, mTypeToTType, tType,
					tPackage, tMember, pg, mMember, mType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClassInType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClassInType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBBBB(
			AnonymousClassInType _this, IsApplicableMatch isApplicableMatch, MDefinitionToTMember mMemberToTMember,
			MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType, TAbstractType tType, TPackage tPackage,
			TMember tMember, TypeGraph pg, MDefinition mMember, AbstractTypeDeclaration mType,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnonymousClassInType_29_3_solveCSP_binding = pattern_AnonymousClassInType_29_3_solveCSP_bindingFBBBBBBBBBBBB(
				_this, isApplicableMatch, mMemberToTMember, mCreation, mTypeToTType, tType, tPackage, tMember, pg,
				mMember, mType, ruleResult);
		if (result_pattern_AnonymousClassInType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClassInType_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClassInType_29_3_solveCSP_black = pattern_AnonymousClassInType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClassInType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mMemberToTMember, mCreation, mTypeToTType, tType,
						tPackage, tMember, pg, mMember, mType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClassInType_29_4_checkCSP_expressionFBB(AnonymousClassInType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClassInType_29_5_checknacs_blackBBBBBBBBB(
			MDefinitionToTMember mMemberToTMember, MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember,
			AbstractTypeDeclaration mType) {
		return new Object[] { mMemberToTMember, mCreation, mTypeToTType, tType, tPackage, tMember, pg, mMember, mType };
	}

	public static final Object[] pattern_AnonymousClassInType_29_6_perform_blackBBBBBBBBBB(
			MDefinitionToTMember mMemberToTMember, MClassInstanceCreation mCreation, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, TPackage tPackage, TMember tMember, TypeGraph pg, MDefinition mMember,
			AbstractTypeDeclaration mType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mMemberToTMember, mCreation, mTypeToTType, tType, tPackage, tMember, pg, mMember, mType,
				ruleResult };
	}

	public static final Object[] pattern_AnonymousClassInType_29_6_perform_greenBFBBBFFBB(
			MClassInstanceCreation mCreation, TAbstractType tType, TPackage tPackage, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		TClass tAnonymous = BasicFactory.eINSTANCE.createTClass();
		MAnonymousClass mAnonymous = ModiscoFactory.eINSTANCE.createMAnonymousClass();
		AnonymousClassDeclarationToTClass eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE
				.createAnonymousClassDeclarationToTClass();
		Object _localVariable_0 = csp.getValue("tAnonymous", "tLib");
		Object _localVariable_1 = csp.getValue("tAnonymous", "tName");
		Object _localVariable_2 = csp.getValue("mAnonymous", "index");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_3 = ruleResult.getIncrementedPerformCount();
		tPackage.getAllTypes().add(tAnonymous);
		pg.getClasses().add(tAnonymous);
		pg.getAllTypes().add(tAnonymous);
		tPackage.getClasses().add(tAnonymous);
		tType.getInnerTypes().add(tAnonymous);
		ruleResult.getTargetObjects().add(tAnonymous);
		mCreation.setAnonymousClassDeclaration(mAnonymous);
		ruleResult.getSourceObjects().add(mAnonymous);
		eAnonymousClassDeclarationToTClass.setTarget(tAnonymous);
		eAnonymousClassDeclarationToTClass.setSource(mAnonymous);
		ruleResult.getCorrObjects().add(eAnonymousClassDeclarationToTClass);
		boolean tAnonymous_tLib_prime = (boolean) _localVariable_0;
		String tAnonymous_tName_prime = (String) _localVariable_1;
		int mAnonymous_index_prime = (int) _localVariable_2;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_3);
		tAnonymous.setTLib(Boolean.valueOf(tAnonymous_tLib_prime));
		tAnonymous.setTName(tAnonymous_tName_prime);
		mAnonymous.setIndex(Integer.valueOf(mAnonymous_index_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mCreation, tAnonymous, tType, tPackage, pg, mAnonymous,
				eAnonymousClassDeclarationToTClass, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnonymousClassInType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnonymousClassInTypeImpl
