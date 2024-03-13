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
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.VisibilityKind;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MDefinition;

import org.gravity.tgg.modisco.pm.MDefinitionToTMember;
import org.gravity.tgg.modisco.pm.MModifierToTModifier;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.InterfaceMember;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TInterface;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TModifier;
import org.gravity.typegraph.basic.TVisibility;

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
 * An implementation of the model object '<em><b>Interface Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InterfaceMemberImpl extends AbstractRuleImpl implements InterfaceMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInterfaceMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, InterfaceDeclaration mInterface, MDefinition mDefinition,
			Modifier mModifier) {

		Object[] result1_black = InterfaceMemberImpl.pattern_InterfaceMember_0_1_initialbindings_blackBBBBB(this, match,
				mInterface, mDefinition, mModifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mInterface] = " + mInterface + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mModifier] = " + mModifier + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mInterface, mDefinition,
						mModifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mInterface] = " + mInterface + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mModifier] = " + mModifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceMemberImpl.pattern_InterfaceMember_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceMemberImpl
					.pattern_InterfaceMember_0_4_collectelementstobetranslated_blackBBBB(match, mInterface, mDefinition,
							mModifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mInterface] = " + mInterface + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mModifier] = " + mModifier + ".");
			}
			InterfaceMemberImpl.pattern_InterfaceMember_0_4_collectelementstobetranslated_greenBBBFF(match, mDefinition,
					mModifier);
			//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InterfaceMemberImpl.pattern_InterfaceMember_0_5_collectcontextelements_blackBBBB(
					match, mInterface, mDefinition, mModifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mInterface] = " + mInterface + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mModifier] = " + mModifier + ".");
			}
			InterfaceMemberImpl.pattern_InterfaceMember_0_5_collectcontextelements_greenBBBFF(match, mInterface,
					mDefinition);
			//nothing EMoflonEdge mInterface__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			InterfaceMemberImpl.pattern_InterfaceMember_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					mInterface, mDefinition, mModifier);
			return InterfaceMemberImpl.pattern_InterfaceMember_0_7_expressionF();
		} else {
			return InterfaceMemberImpl.pattern_InterfaceMember_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TMember tMember = (TMember) result1_bindingAndBlack[1];
		TInterface tInterface = (TInterface) result1_bindingAndBlack[2];
		InterfaceDeclaration mInterface = (InterfaceDeclaration) result1_bindingAndBlack[3];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[4];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[5];
		Modifier mModifier = (Modifier) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = InterfaceMemberImpl
				.pattern_InterfaceMember_1_1_performtransformation_greenFBFBB(tMember, mModifier, csp);
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[0];
		TModifier tModifier = (TModifier) result1_green[2];

		Object[] result2_black = InterfaceMemberImpl.pattern_InterfaceMember_1_2_collecttranslatedelements_blackBBB(
				mModifierToTModifier, tModifier, mModifier);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[mModifierToTModifier] = " + mModifierToTModifier
							+ ", " + "[tModifier] = " + tModifier + ", " + "[mModifier] = " + mModifier + ".");
		}
		Object[] result2_green = InterfaceMemberImpl.pattern_InterfaceMember_1_2_collecttranslatedelements_greenFBBB(
				mModifierToTModifier, tModifier, mModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceMemberImpl.pattern_InterfaceMember_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, mTypeToTType, mModifierToTModifier, tMember, tInterface, mInterface, defToMember, tModifier,
				mDefinition, mModifier);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mModifierToTModifier] = "
					+ mModifierToTModifier + ", " + "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface
					+ ", " + "[mInterface] = " + mInterface + ", " + "[defToMember] = " + defToMember + ", "
					+ "[tModifier] = " + tModifier + ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = "
					+ mModifier + ".");
		}
		InterfaceMemberImpl.pattern_InterfaceMember_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				mModifierToTModifier, tMember, tModifier, mDefinition, mModifier);
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[10];

		// 
		// 
		InterfaceMemberImpl.pattern_InterfaceMember_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				mTypeToTType, mModifierToTModifier, tMember, tInterface, mInterface, defToMember, tModifier,
				mDefinition, mModifier);
		return InterfaceMemberImpl.pattern_InterfaceMember_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceMemberImpl
				.pattern_InterfaceMember_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InterfaceMemberImpl.pattern_InterfaceMember_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		InterfaceDeclaration mInterface = (InterfaceDeclaration) result2_binding[0];
		MDefinition mDefinition = (MDefinition) result2_binding[1];
		Modifier mModifier = (Modifier) result2_binding[2];
		for (Object[] result2_black : InterfaceMemberImpl
				.pattern_InterfaceMember_2_2_corematch_blackFFFBFBBB(mInterface, mDefinition, mModifier, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			TMember tMember = (TMember) result2_black[1];
			TInterface tInterface = (TInterface) result2_black[2];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[4];
			// ForEach 
			for (Object[] result3_black : InterfaceMemberImpl.pattern_InterfaceMember_2_3_findcontext_blackBBBBBBB(
					mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition, mModifier)) {
				Object[] result3_green = InterfaceMemberImpl
						.pattern_InterfaceMember_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(mTypeToTType, tMember,
								tInterface, mInterface, defToMember, mDefinition, mModifier);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mInterface__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__mInterface____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__tInterface____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tInterface__tMember____defines = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge tMember__tInterface____definedBy = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = InterfaceMemberImpl
						.pattern_InterfaceMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition, mModifier);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface + ", "
							+ "[mInterface] = " + mInterface + ", " + "[defToMember] = " + defToMember + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mModifier] = " + mModifier + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InterfaceMemberImpl.pattern_InterfaceMember_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InterfaceMemberImpl
							.pattern_InterfaceMember_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InterfaceMemberImpl.pattern_InterfaceMember_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceMemberImpl.pattern_InterfaceMember_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, InterfaceDeclaration mInterface, MDefinition mDefinition,
			Modifier mModifier) {
		match.registerObject("mInterface", mInterface);
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mModifier", mModifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, InterfaceDeclaration mInterface, MDefinition mDefinition,
			Modifier mModifier) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			MDefinition mDefinition, Modifier mModifier) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", true, csp);
		var_mModifier_static.setValue(mModifier.isStatic());
		var_mModifier_static.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", true,
				csp);
		var_mModifier_visibility.setValue(mModifier.getVisibility());
		var_mModifier_visibility.setType("java.VisibilityKind");

		// Create unbound variables
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", csp);
		var_tModifier_isStatic.setType("Boolean");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", csp);
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create constraints
		Eq eq = new Eq();
		InterfaceVisibility interfaceVisibility = new InterfaceVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(interfaceVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		interfaceVisibility.setRuleName("NoRuleName");
		interfaceVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("mInterface", mInterface);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mModifier", mModifier);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mTypeToTType, EObject mModifierToTModifier,
			EObject tMember, EObject tInterface, EObject mInterface, EObject defToMember, EObject tModifier,
			EObject mDefinition, EObject mModifier) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tInterface", tInterface);
		ruleresult.registerObject("mInterface", mInterface);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mModifier", mModifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mModifier").eClass())
				.equals("java.Modifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TMember tMember, TInterface tInterface, TModifier tModifier) {

		Object[] result1_black = InterfaceMemberImpl.pattern_InterfaceMember_10_1_initialbindings_blackBBBBB(this,
				match, tMember, tInterface, tModifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface
					+ ", " + "[tModifier] = " + tModifier + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tMember, tInterface,
						tModifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface
					+ ", " + "[tModifier] = " + tModifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceMemberImpl.pattern_InterfaceMember_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceMemberImpl
					.pattern_InterfaceMember_10_4_collectelementstobetranslated_blackBBBB(match, tMember, tInterface,
							tModifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface + ", " + "[tModifier] = "
						+ tModifier + ".");
			}
			InterfaceMemberImpl.pattern_InterfaceMember_10_4_collectelementstobetranslated_greenBBBF(match, tMember,
					tModifier);
			//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InterfaceMemberImpl.pattern_InterfaceMember_10_5_collectcontextelements_blackBBBB(
					match, tMember, tInterface, tModifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface + ", " + "[tModifier] = "
						+ tModifier + ".");
			}
			InterfaceMemberImpl.pattern_InterfaceMember_10_5_collectcontextelements_greenBBBFF(match, tMember,
					tInterface);
			//nothing EMoflonEdge tInterface__tMember____defines = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tMember__tInterface____definedBy = (EMoflonEdge) result5_green[4];

			// 
			InterfaceMemberImpl.pattern_InterfaceMember_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tMember, tInterface, tModifier);
			return InterfaceMemberImpl.pattern_InterfaceMember_10_7_expressionF();
		} else {
			return InterfaceMemberImpl.pattern_InterfaceMember_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TMember tMember = (TMember) result1_bindingAndBlack[1];
		TInterface tInterface = (TInterface) result1_bindingAndBlack[2];
		InterfaceDeclaration mInterface = (InterfaceDeclaration) result1_bindingAndBlack[3];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[4];
		TModifier tModifier = (TModifier) result1_bindingAndBlack[5];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = InterfaceMemberImpl
				.pattern_InterfaceMember_11_1_performtransformation_greenFBBFB(tModifier, mDefinition, csp);
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[0];
		Modifier mModifier = (Modifier) result1_green[3];

		Object[] result2_black = InterfaceMemberImpl.pattern_InterfaceMember_11_2_collecttranslatedelements_blackBBB(
				mModifierToTModifier, tModifier, mModifier);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[mModifierToTModifier] = " + mModifierToTModifier
							+ ", " + "[tModifier] = " + tModifier + ", " + "[mModifier] = " + mModifier + ".");
		}
		Object[] result2_green = InterfaceMemberImpl.pattern_InterfaceMember_11_2_collecttranslatedelements_greenFBBB(
				mModifierToTModifier, tModifier, mModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceMemberImpl.pattern_InterfaceMember_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, mTypeToTType, mModifierToTModifier, tMember, tInterface, mInterface, defToMember, tModifier,
				mDefinition, mModifier);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mModifierToTModifier] = "
					+ mModifierToTModifier + ", " + "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface
					+ ", " + "[mInterface] = " + mInterface + ", " + "[defToMember] = " + defToMember + ", "
					+ "[tModifier] = " + tModifier + ", " + "[mDefinition] = " + mDefinition + ", " + "[mModifier] = "
					+ mModifier + ".");
		}
		InterfaceMemberImpl.pattern_InterfaceMember_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				mModifierToTModifier, tMember, tModifier, mDefinition, mModifier);
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[10];

		// 
		// 
		InterfaceMemberImpl.pattern_InterfaceMember_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				mTypeToTType, mModifierToTModifier, tMember, tInterface, mInterface, defToMember, tModifier,
				mDefinition, mModifier);
		return InterfaceMemberImpl.pattern_InterfaceMember_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceMemberImpl
				.pattern_InterfaceMember_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InterfaceMemberImpl.pattern_InterfaceMember_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TMember tMember = (TMember) result2_binding[0];
		TInterface tInterface = (TInterface) result2_binding[1];
		TModifier tModifier = (TModifier) result2_binding[2];
		for (Object[] result2_black : InterfaceMemberImpl.pattern_InterfaceMember_12_2_corematch_blackFBBFFBFB(tMember,
				tInterface, tModifier, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result2_black[3];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[4];
			MDefinition mDefinition = (MDefinition) result2_black[6];
			// ForEach 
			for (Object[] result3_black : InterfaceMemberImpl.pattern_InterfaceMember_12_3_findcontext_blackBBBBBBB(
					mTypeToTType, tMember, tInterface, mInterface, defToMember, tModifier, mDefinition)) {
				Object[] result3_green = InterfaceMemberImpl
						.pattern_InterfaceMember_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(mTypeToTType, tMember,
								tInterface, mInterface, defToMember, tModifier, mDefinition);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge mInterface__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__mInterface____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__tInterface____target = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tInterface__tMember____defines = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tMember__tInterface____definedBy = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = InterfaceMemberImpl
						.pattern_InterfaceMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								mTypeToTType, tMember, tInterface, mInterface, defToMember, tModifier, mDefinition);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface + ", "
							+ "[mInterface] = " + mInterface + ", " + "[defToMember] = " + defToMember + ", "
							+ "[tModifier] = " + tModifier + ", " + "[mDefinition] = " + mDefinition + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InterfaceMemberImpl.pattern_InterfaceMember_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = InterfaceMemberImpl
							.pattern_InterfaceMember_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InterfaceMemberImpl.pattern_InterfaceMember_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceMemberImpl.pattern_InterfaceMember_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TMember tMember, TInterface tInterface, TModifier tModifier) {
		match.registerObject("tMember", tMember);
		match.registerObject("tInterface", tInterface);
		match.registerObject("tModifier", tModifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TMember tMember, TInterface tInterface, TModifier tModifier) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			TModifier tModifier, MDefinition mDefinition) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", true, csp);
		var_tModifier_isStatic.setValue(tModifier.isIsStatic());
		var_tModifier_isStatic.setType("Boolean");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", true,
				csp);
		var_tModifier_tVisibility.setValue(tModifier.getTVisibility());
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create unbound variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", csp);
		var_mModifier_static.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", csp);
		var_mModifier_visibility.setType("java.VisibilityKind");

		// Create constraints
		Eq eq = new Eq();
		InterfaceVisibility interfaceVisibility = new InterfaceVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(interfaceVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		interfaceVisibility.setRuleName("NoRuleName");
		interfaceVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("mInterface", mInterface);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tModifier", tModifier);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mTypeToTType, EObject mModifierToTModifier,
			EObject tMember, EObject tInterface, EObject mInterface, EObject defToMember, EObject tModifier,
			EObject mDefinition, EObject mModifier) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("tInterface", tInterface);
		ruleresult.registerObject("mInterface", mInterface);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mModifier", mModifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tModifier").eClass())
				.equals("basic.TModifier.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_30(EMoflonEdge _edge_tModifier) {

		Object[] result1_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceMemberImpl.pattern_InterfaceMember_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InterfaceMemberImpl
				.pattern_InterfaceMember_20_2_testcorematchandDECs_blackFFFB(_edge_tModifier)) {
			TMember tMember = (TMember) result2_black[0];
			TInterface tInterface = (TInterface) result2_black[1];
			TModifier tModifier = (TModifier) result2_black[2];
			Object[] result2_green = InterfaceMemberImpl
					.pattern_InterfaceMember_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceMemberImpl
					.pattern_InterfaceMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tMember, tInterface, tModifier)) {
				// 
				if (InterfaceMemberImpl
						.pattern_InterfaceMember_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = InterfaceMemberImpl
							.pattern_InterfaceMember_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InterfaceMemberImpl.pattern_InterfaceMember_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceMemberImpl.pattern_InterfaceMember_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_32(EMoflonEdge _edge_modifier) {

		Object[] result1_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceMemberImpl.pattern_InterfaceMember_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InterfaceMemberImpl
				.pattern_InterfaceMember_21_2_testcorematchandDECs_blackFFFB(_edge_modifier)) {
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			Modifier mModifier = (Modifier) result2_black[2];
			Object[] result2_green = InterfaceMemberImpl
					.pattern_InterfaceMember_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceMemberImpl
					.pattern_InterfaceMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mInterface, mDefinition, mModifier)) {
				// 
				if (InterfaceMemberImpl
						.pattern_InterfaceMember_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = InterfaceMemberImpl
							.pattern_InterfaceMember_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InterfaceMemberImpl.pattern_InterfaceMember_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceMemberImpl.pattern_InterfaceMember_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InterfaceMember");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		InterfaceVisibility interfaceVisibility1 = new InterfaceVisibility();
		csp.getConstraints().add(interfaceVisibility1);

		eq0.setRuleName("InterfaceMember");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		interfaceVisibility1.setRuleName("InterfaceMember");
		interfaceVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tModifier_isStatic.setBound(false);
			var_tModifier_tVisibility.setBound(false);
			eq0.solve(var_mModifier_static, var_tModifier_isStatic);
			interfaceVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tModifier", "isStatic", var_tModifier_isStatic.getValue());
				__helper.setValue("tModifier", "tVisibility", var_tModifier_tVisibility.getValue());
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
		ruleResult.setRule("InterfaceMember");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		InterfaceVisibility interfaceVisibility1 = new InterfaceVisibility();
		csp.getConstraints().add(interfaceVisibility1);

		eq0.setRuleName("InterfaceMember");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		interfaceVisibility1.setRuleName("InterfaceMember");
		interfaceVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mModifier_static.setBound(false);
			var_mModifier_visibility.setBound(false);
			eq0.solve(var_mModifier_static, var_tModifier_isStatic);
			interfaceVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mModifier", "static", var_mModifier_static.getValue());
				__helper.setValue("mModifier", "visibility", var_mModifier_visibility.getValue());
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

		Object[] result1_black = InterfaceMemberImpl.pattern_InterfaceMember_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceMemberImpl.pattern_InterfaceMember_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TMember tMember = (TMember) result2_bindingAndBlack[0];
		TInterface tInterface = (TInterface) result2_bindingAndBlack[1];
		InterfaceDeclaration mInterface = (InterfaceDeclaration) result2_bindingAndBlack[2];
		TModifier tModifier = (TModifier) result2_bindingAndBlack[3];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[4];
		Modifier mModifier = (Modifier) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tMember, tInterface, mInterface,
						tModifier, mDefinition, mModifier, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface + ", " + "[mInterface] = "
					+ mInterface + ", " + "[tModifier] = " + tModifier + ", " + "[mDefinition] = " + mDefinition + ", "
					+ "[mModifier] = " + mModifier + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InterfaceMemberImpl.pattern_InterfaceMember_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InterfaceMemberImpl
					.pattern_InterfaceMember_24_5_matchcorrcontext_blackFBBBFBBB(tMember, tInterface, mInterface,
							mDefinition, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[0];
				MDefinitionToTMember defToMember = (MDefinitionToTMember) result5_black[4];
				Object[] result5_green = InterfaceMemberImpl.pattern_InterfaceMember_24_5_matchcorrcontext_greenBBBBF(
						mTypeToTType, defToMember, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = InterfaceMemberImpl
						.pattern_InterfaceMember_24_6_createcorrespondence_blackBBBBBBB(tMember, tInterface, mInterface,
								tModifier, mDefinition, mModifier, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tMember] = " + tMember
							+ ", " + "[tInterface] = " + tInterface + ", " + "[mInterface] = " + mInterface + ", "
							+ "[tModifier] = " + tModifier + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mModifier] = " + mModifier + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceMemberImpl.pattern_InterfaceMember_24_6_createcorrespondence_greenFBBB(tModifier, mModifier,
						ccMatch);
				//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[0];

				Object[] result7_black = InterfaceMemberImpl
						.pattern_InterfaceMember_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceMemberImpl.pattern_InterfaceMember_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return InterfaceMemberImpl.pattern_InterfaceMember_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface,
			TModifier tModifier, MDefinition mDefinition, Modifier mModifier, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", true, csp);
		var_mModifier_static.setValue(mModifier.isStatic());
		var_mModifier_static.setType("Boolean");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", true, csp);
		var_tModifier_isStatic.setValue(tModifier.isIsStatic());
		var_tModifier_isStatic.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", true,
				csp);
		var_mModifier_visibility.setValue(mModifier.getVisibility());
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", true,
				csp);
		var_tModifier_tVisibility.setValue(tModifier.getTVisibility());
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		InterfaceVisibility interfaceVisibility = new InterfaceVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(interfaceVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		interfaceVisibility.setRuleName("NoRuleName");
		interfaceVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);
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
	public boolean checkDEC_FWD(InterfaceDeclaration mInterface, MDefinition mDefinition, Modifier mModifier) {// 
		Object[] result1_black = InterfaceMemberImpl.pattern_InterfaceMember_27_1_matchtggpattern_blackBBB(mInterface,
				mDefinition, mModifier);
		if (result1_black != null) {
			return InterfaceMemberImpl.pattern_InterfaceMember_27_2_expressionF();
		} else {
			return InterfaceMemberImpl.pattern_InterfaceMember_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TMember tMember, TInterface tInterface, TModifier tModifier) {// 
		Object[] result1_black = InterfaceMemberImpl.pattern_InterfaceMember_28_1_matchtggpattern_blackBBB(tMember,
				tInterface, tModifier);
		if (result1_black != null) {
			return InterfaceMemberImpl.pattern_InterfaceMember_28_2_expressionF();
		} else {
			return InterfaceMemberImpl.pattern_InterfaceMember_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter) {

		Object[] result1_black = InterfaceMemberImpl.pattern_InterfaceMember_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceMemberImpl.pattern_InterfaceMember_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InterfaceMemberImpl
				.pattern_InterfaceMember_29_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result2_black[2];
			MDefinition mDefinition = (MDefinition) result2_black[3];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[4];
			TMember tMember = (TMember) result2_black[5];
			TInterface tInterface = (TInterface) result2_black[6];

			Object[] result3_bindingAndBlack = InterfaceMemberImpl
					.pattern_InterfaceMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
						+ ", " + "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface + ", "
						+ "[mInterface] = " + mInterface + ", " + "[defToMember] = " + defToMember + ", "
						+ "[mDefinition] = " + mDefinition + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InterfaceMemberImpl.pattern_InterfaceMember_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InterfaceMemberImpl.pattern_InterfaceMember_29_5_checknacs_blackBBBBBB(
						mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition);
				if (result5_black != null) {

					Object[] result6_black = InterfaceMemberImpl.pattern_InterfaceMember_29_6_perform_blackBBBBBBB(
							mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tMember] = " + tMember + ", " + "[tInterface] = " + tInterface
								+ ", " + "[mInterface] = " + mInterface + ", " + "[defToMember] = " + defToMember + ", "
								+ "[mDefinition] = " + mDefinition + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					InterfaceMemberImpl.pattern_InterfaceMember_29_6_perform_greenFBFBFBB(tMember, mDefinition,
							ruleResult, csp);
					//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[0];
					//nothing TModifier tModifier = (TModifier) result6_green[2];
					//nothing Modifier mModifier = (Modifier) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return InterfaceMemberImpl.pattern_InterfaceMember_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.static", csp);
		var_mModifier_static.setType("Boolean");
		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.isStatic", csp);
		var_tModifier_isStatic.setType("Boolean");
		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier.visibility", csp);
		var_mModifier_visibility.setType("java.VisibilityKind");
		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier.tVisibility", csp);
		var_tModifier_tVisibility.setType("basic.TVisibility");

		// Create constraints
		Eq eq = new Eq();
		InterfaceVisibility interfaceVisibility = new InterfaceVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(interfaceVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		interfaceVisibility.setRuleName("NoRuleName");
		interfaceVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("mInterface", mInterface);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
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
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_FWD__MATCH_INTERFACEDECLARATION_MDEFINITION_MODIFIER:
			return isAppropriate_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (Modifier) arguments.get(3));
		case RulesPackage.INTERFACE_MEMBER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERFACEDECLARATION_MDEFINITION_MODIFIER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (Modifier) arguments.get(3));
			return null;
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERFACEDECLARATION_MDEFINITION_MODIFIER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (Modifier) arguments.get(3));
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TMEMBER_TINTERFACE_INTERFACEDECLARATION_MDEFINITIONTOTMEMBER_MDEFINITION_MODIFIER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TMember) arguments.get(2), (TInterface) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (MDefinitionToTMember) arguments.get(5),
					(MDefinition) arguments.get(6), (Modifier) arguments.get(7));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.INTERFACE_MEMBER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_BWD__MATCH_TMEMBER_TINTERFACE_TMODIFIER:
			return isAppropriate_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TInterface) arguments.get(2), (TModifier) arguments.get(3));
		case RulesPackage.INTERFACE_MEMBER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMEMBER_TINTERFACE_TMODIFIER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TInterface) arguments.get(2), (TModifier) arguments.get(3));
			return null;
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMEMBER_TINTERFACE_TMODIFIER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TMember) arguments.get(1),
					(TInterface) arguments.get(2), (TModifier) arguments.get(3));
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TMEMBER_TINTERFACE_INTERFACEDECLARATION_MDEFINITIONTOTMEMBER_TMODIFIER_MDEFINITION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TMember) arguments.get(2), (TInterface) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (MDefinitionToTMember) arguments.get(5),
					(TModifier) arguments.get(6), (MDefinition) arguments.get(7));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.INTERFACE_MEMBER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_30((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_32__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_32((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_SOLVE_CSP_CC__TMEMBER_TINTERFACE_INTERFACEDECLARATION_TMODIFIER_MDEFINITION_MODIFIER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TMember) arguments.get(0), (TInterface) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2), (TModifier) arguments.get(3),
					(MDefinition) arguments.get(4), (Modifier) arguments.get(5), (Match) arguments.get(6),
					(Match) arguments.get(7));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___CHECK_DEC_FWD__INTERFACEDECLARATION_MDEFINITION_MODIFIER:
			return checkDEC_FWD((InterfaceDeclaration) arguments.get(0), (MDefinition) arguments.get(1),
					(Modifier) arguments.get(2));
		case RulesPackage.INTERFACE_MEMBER___CHECK_DEC_BWD__TMEMBER_TINTERFACE_TMODIFIER:
			return checkDEC_BWD((TMember) arguments.get(0), (TInterface) arguments.get(1),
					(TModifier) arguments.get(2));
		case RulesPackage.INTERFACE_MEMBER___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.INTERFACE_MEMBER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TMEMBER_TINTERFACE_INTERFACEDECLARATION_MDEFINITIONTOTMEMBER_MDEFINITION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TMember) arguments.get(2), (TInterface) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (MDefinitionToTMember) arguments.get(5),
					(MDefinition) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.INTERFACE_MEMBER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InterfaceMember_0_1_initialbindings_blackBBBBB(InterfaceMember _this,
			Match match, InterfaceDeclaration mInterface, MDefinition mDefinition, Modifier mModifier) {
		return new Object[] { _this, match, mInterface, mDefinition, mModifier };
	}

	public static final Object[] pattern_InterfaceMember_0_2_SolveCSP_bindingFBBBBB(InterfaceMember _this, Match match,
			InterfaceDeclaration mInterface, MDefinition mDefinition, Modifier mModifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mInterface, mDefinition, mModifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mInterface, mDefinition, mModifier };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_0_2_SolveCSP_bindingAndBlackFBBBBB(InterfaceMember _this,
			Match match, InterfaceDeclaration mInterface, MDefinition mDefinition, Modifier mModifier) {
		Object[] result_pattern_InterfaceMember_0_2_SolveCSP_binding = pattern_InterfaceMember_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mInterface, mDefinition, mModifier);
		if (result_pattern_InterfaceMember_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceMember_0_2_SolveCSP_black = pattern_InterfaceMember_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceMember_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mInterface, mDefinition, mModifier };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceMember_0_3_CheckCSP_expressionFBB(InterfaceMember _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_0_4_collectelementstobetranslated_blackBBBB(Match match,
			InterfaceDeclaration mInterface, MDefinition mDefinition, Modifier mModifier) {
		return new Object[] { match, mInterface, mDefinition, mModifier };
	}

	public static final Object[] pattern_InterfaceMember_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			MDefinition mDefinition, Modifier mModifier) {
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mModifier);
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		match.getToBeTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		match.getToBeTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		return new Object[] { match, mDefinition, mModifier, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceMember_0_5_collectcontextelements_blackBBBB(Match match,
			InterfaceDeclaration mInterface, MDefinition mDefinition, Modifier mModifier) {
		return new Object[] { match, mInterface, mDefinition, mModifier };
	}

	public static final Object[] pattern_InterfaceMember_0_5_collectcontextelements_greenBBBFF(Match match,
			InterfaceDeclaration mInterface, MDefinition mDefinition) {
		EMoflonEdge mInterface__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mInterface);
		match.getContextNodes().add(mDefinition);
		String mInterface__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mInterface____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		mInterface__mDefinition____bodyDeclarations.setSrc(mInterface);
		mInterface__mDefinition____bodyDeclarations.setTrg(mDefinition);
		match.getContextEdges().add(mInterface__mDefinition____bodyDeclarations);
		mDefinition__mInterface____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mInterface____abstractTypeDeclaration.setTrg(mInterface);
		match.getContextEdges().add(mDefinition__mInterface____abstractTypeDeclaration);
		mInterface__mDefinition____bodyDeclarations.setName(mInterface__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mInterface____abstractTypeDeclaration
				.setName(mDefinition__mInterface____abstractTypeDeclaration_name_prime);
		return new Object[] { match, mInterface, mDefinition, mInterface__mDefinition____bodyDeclarations,
				mDefinition__mInterface____abstractTypeDeclaration };
	}

	public static final void pattern_InterfaceMember_0_6_registerobjectstomatch_expressionBBBBB(InterfaceMember _this,
			Match match, InterfaceDeclaration mInterface, MDefinition mDefinition, Modifier mModifier) {
		_this.registerObjectsToMatch_FWD(match, mInterface, mDefinition, mModifier);

	}

	public static final boolean pattern_InterfaceMember_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceMember_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("mInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_6 = isApplicableMatch.getObject("mModifier");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpTInterface = _localVariable_2;
		EObject tmpMInterface = _localVariable_3;
		EObject tmpDefToMember = _localVariable_4;
		EObject tmpMDefinition = _localVariable_5;
		EObject tmpMModifier = _localVariable_6;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpTInterface instanceof TInterface) {
					TInterface tInterface = (TInterface) tmpTInterface;
					if (tmpMInterface instanceof InterfaceDeclaration) {
						InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
						if (tmpDefToMember instanceof MDefinitionToTMember) {
							MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
							if (tmpMDefinition instanceof MDefinition) {
								MDefinition mDefinition = (MDefinition) tmpMDefinition;
								if (tmpMModifier instanceof Modifier) {
									Modifier mModifier = (Modifier) tmpMModifier;
									return new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember,
											mDefinition, mModifier, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_1_1_performtransformation_blackBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface,
			MDefinitionToTMember defToMember, MDefinition mDefinition, Modifier mModifier, InterfaceMember _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition,
						mModifier, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InterfaceMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceMember_1_1_performtransformation_binding = pattern_InterfaceMember_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceMember_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_InterfaceMember_1_1_performtransformation_binding[0];
			TMember tMember = (TMember) result_pattern_InterfaceMember_1_1_performtransformation_binding[1];
			TInterface tInterface = (TInterface) result_pattern_InterfaceMember_1_1_performtransformation_binding[2];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result_pattern_InterfaceMember_1_1_performtransformation_binding[3];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_InterfaceMember_1_1_performtransformation_binding[4];
			MDefinition mDefinition = (MDefinition) result_pattern_InterfaceMember_1_1_performtransformation_binding[5];
			Modifier mModifier = (Modifier) result_pattern_InterfaceMember_1_1_performtransformation_binding[6];

			Object[] result_pattern_InterfaceMember_1_1_performtransformation_black = pattern_InterfaceMember_1_1_performtransformation_blackBBBBBBBFBB(
					mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition, mModifier, _this,
					isApplicableMatch);
			if (result_pattern_InterfaceMember_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceMember_1_1_performtransformation_black[7];

				return new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition,
						mModifier, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_1_1_performtransformation_greenFBFBB(TMember tMember,
			Modifier mModifier, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		Object _localVariable_0 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_1 = csp.getValue("tModifier", "tVisibility");
		mModifierToTModifier.setSource(mModifier);
		tMember.setTModifier(tModifier);
		mModifierToTModifier.setTarget(tModifier);
		boolean tModifier_isStatic_prime = (boolean) _localVariable_0;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_1;
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		return new Object[] { mModifierToTModifier, tMember, tModifier, mModifier, csp };
	}

	public static final Object[] pattern_InterfaceMember_1_2_collecttranslatedelements_blackBBB(
			MModifierToTModifier mModifierToTModifier, TModifier tModifier, Modifier mModifier) {
		return new Object[] { mModifierToTModifier, tModifier, mModifier };
	}

	public static final Object[] pattern_InterfaceMember_1_2_collecttranslatedelements_greenFBBB(
			MModifierToTModifier mModifierToTModifier, TModifier tModifier, Modifier mModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getCreatedElements().add(tModifier);
		ruleresult.getTranslatedElements().add(mModifier);
		return new Object[] { ruleresult, mModifierToTModifier, tModifier, mModifier };
	}

	public static final Object[] pattern_InterfaceMember_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mModifierToTModifier, EObject tMember,
			EObject tInterface, EObject mInterface, EObject defToMember, EObject tModifier, EObject mDefinition,
			EObject mModifier) {
		if (!mTypeToTType.equals(tMember)) {
			if (!mTypeToTType.equals(tInterface)) {
				if (!mTypeToTType.equals(tModifier)) {
					if (!mModifierToTModifier.equals(mTypeToTType)) {
						if (!mModifierToTModifier.equals(tMember)) {
							if (!mModifierToTModifier.equals(tInterface)) {
								if (!mModifierToTModifier.equals(tModifier)) {
									if (!tMember.equals(tModifier)) {
										if (!tInterface.equals(tMember)) {
											if (!tInterface.equals(tModifier)) {
												if (!mInterface.equals(mTypeToTType)) {
													if (!mInterface.equals(mModifierToTModifier)) {
														if (!mInterface.equals(tMember)) {
															if (!mInterface.equals(tInterface)) {
																if (!mInterface.equals(tModifier)) {
																	if (!mInterface.equals(mModifier)) {
																		if (!defToMember.equals(mTypeToTType)) {
																			if (!defToMember
																					.equals(mModifierToTModifier)) {
																				if (!defToMember.equals(tMember)) {
																					if (!defToMember
																							.equals(tInterface)) {
																						if (!defToMember
																								.equals(mInterface)) {
																							if (!defToMember.equals(
																									tModifier)) {
																								if (!defToMember.equals(
																										mDefinition)) {
																									if (!defToMember
																											.equals(mModifier)) {
																										if (!mDefinition
																												.equals(mTypeToTType)) {
																											if (!mDefinition
																													.equals(mModifierToTModifier)) {
																												if (!mDefinition
																														.equals(tMember)) {
																													if (!mDefinition
																															.equals(tInterface)) {
																														if (!mDefinition
																																.equals(mInterface)) {
																															if (!mDefinition
																																	.equals(tModifier)) {
																																if (!mDefinition
																																		.equals(mModifier)) {
																																	if (!mModifier
																																			.equals(mTypeToTType)) {
																																		if (!mModifier
																																				.equals(mModifierToTModifier)) {
																																			if (!mModifier
																																					.equals(tMember)) {
																																				if (!mModifier
																																						.equals(tInterface)) {
																																					if (!mModifier
																																							.equals(tModifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								mTypeToTType,
																																								mModifierToTModifier,
																																								tMember,
																																								tInterface,
																																								mInterface,
																																								defToMember,
																																								tModifier,
																																								mDefinition,
																																								mModifier };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InterfaceMember_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mModifierToTModifier, EObject tMember, EObject tModifier,
			EObject mDefinition, EObject mModifier) {
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceMember";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(tMember__tModifier____tModifier);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		return new Object[] { ruleresult, mModifierToTModifier, tMember, tModifier, mDefinition, mModifier,
				tMember__tModifier____tModifier, mModifierToTModifier__tModifier____target,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				mModifierToTModifier__mModifier____source };
	}

	public static final void pattern_InterfaceMember_1_5_registerobjects_expressionBBBBBBBBBBB(InterfaceMember _this,
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mModifierToTModifier, EObject tMember,
			EObject tInterface, EObject mInterface, EObject defToMember, EObject tModifier, EObject mDefinition,
			EObject mModifier) {
		_this.registerObjects_FWD(ruleresult, mTypeToTType, mModifierToTModifier, tMember, tInterface, mInterface,
				defToMember, tModifier, mDefinition, mModifier);

	}

	public static final PerformRuleResult pattern_InterfaceMember_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_2_1_preparereturnvalue_bindingFB(InterfaceMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_2_1_preparereturnvalue_blackFBB(EClass eClass,
			InterfaceMember _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_2_1_preparereturnvalue_bindingAndBlackFFB(
			InterfaceMember _this) {
		Object[] result_pattern_InterfaceMember_2_1_preparereturnvalue_binding = pattern_InterfaceMember_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceMember_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InterfaceMember_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceMember_2_1_preparereturnvalue_black = pattern_InterfaceMember_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InterfaceMember_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InterfaceMember_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InterfaceMember";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InterfaceMember_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mInterface");
		EObject _localVariable_1 = match.getObject("mDefinition");
		EObject _localVariable_2 = match.getObject("mModifier");
		EObject tmpMInterface = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMModifier = _localVariable_2;
		if (tmpMInterface instanceof InterfaceDeclaration) {
			InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (tmpMModifier instanceof Modifier) {
					Modifier mModifier = (Modifier) tmpMModifier;
					return new Object[] { mInterface, mDefinition, mModifier, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_2_2_corematch_blackFFFBFBBB(
			InterfaceDeclaration mInterface, MDefinition mDefinition, Modifier mModifier, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mInterface, TypeToTAbstractType.class, "source")) {
			TAbstractType tmpTInterface = mTypeToTType.getTarget();
			if (tmpTInterface instanceof TInterface) {
				TInterface tInterface = (TInterface) tmpTInterface;
				for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mDefinition, MDefinitionToTMember.class, "source")) {
					TMember tMember = defToMember.getTarget();
					if (tMember != null) {
						_result.add(new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember,
								mDefinition, mModifier, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_2_3_findcontext_blackBBBBBBB(
			TypeToTAbstractType mTypeToTType, TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface,
			MDefinitionToTMember defToMember, MDefinition mDefinition, Modifier mModifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mInterface.getBodyDeclarations().contains(mDefinition)) {
			if (mInterface.equals(mTypeToTType.getSource())) {
				if (tMember.equals(defToMember.getTarget())) {
					if (tInterface.equals(mTypeToTType.getTarget())) {
						if (mModifier.equals(mDefinition.getModifier())) {
							if (mDefinition.equals(defToMember.getSource())) {
								if (tInterface.getDefines().contains(tMember)) {
									_result.add(new Object[] { mTypeToTType, tMember, tInterface, mInterface,
											defToMember, mDefinition, mModifier });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(
			TypeToTAbstractType mTypeToTType, TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface,
			MDefinitionToTMember defToMember, MDefinition mDefinition, Modifier mModifier) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mInterface__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mInterface____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInterface__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tInterface____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mInterface__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mInterface____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mTypeToTType__mInterface____source_name_prime = "source";
		String defToMember__tMember____target_name_prime = "target";
		String mTypeToTType__tInterface____target_name_prime = "target";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String defToMember__mDefinition____source_name_prime = "source";
		String tInterface__tMember____defines_name_prime = "defines";
		String tMember__tInterface____definedBy_name_prime = "definedBy";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tInterface);
		isApplicableMatch.getAllContextElements().add(mInterface);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier);
		mInterface__mDefinition____bodyDeclarations.setSrc(mInterface);
		mInterface__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mInterface__mDefinition____bodyDeclarations);
		mDefinition__mInterface____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mInterface____abstractTypeDeclaration.setTrg(mInterface);
		isApplicableMatch.getAllContextElements().add(mDefinition__mInterface____abstractTypeDeclaration);
		mTypeToTType__mInterface____source.setSrc(mTypeToTType);
		mTypeToTType__mInterface____source.setTrg(mInterface);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mInterface____source);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		mTypeToTType__tInterface____target.setSrc(mTypeToTType);
		mTypeToTType__tInterface____target.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tInterface____target);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier__mDefinition____bodyDeclaration);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		tInterface__tMember____defines.setSrc(tInterface);
		tInterface__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tInterface__tMember____defines);
		tMember__tInterface____definedBy.setSrc(tMember);
		tMember__tInterface____definedBy.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(tMember__tInterface____definedBy);
		mInterface__mDefinition____bodyDeclarations.setName(mInterface__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mInterface____abstractTypeDeclaration
				.setName(mDefinition__mInterface____abstractTypeDeclaration_name_prime);
		mTypeToTType__mInterface____source.setName(mTypeToTType__mInterface____source_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		mTypeToTType__tInterface____target.setName(mTypeToTType__tInterface____target_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		tInterface__tMember____defines.setName(tInterface__tMember____defines_name_prime);
		tMember__tInterface____definedBy.setName(tMember__tInterface____definedBy_name_prime);
		return new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition, mModifier,
				isApplicableMatch, mInterface__mDefinition____bodyDeclarations,
				mDefinition__mInterface____abstractTypeDeclaration, mTypeToTType__mInterface____source,
				defToMember__tMember____target, mTypeToTType__tInterface____target, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration, defToMember__mDefinition____source,
				tInterface__tMember____defines, tMember__tInterface____definedBy };
	}

	public static final Object[] pattern_InterfaceMember_2_4_solveCSP_bindingFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TMember tMember,
			TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			MDefinition mDefinition, Modifier mModifier) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTypeToTType, tMember, tInterface,
				mInterface, defToMember, mDefinition, mModifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tMember, tInterface, mInterface,
					defToMember, mDefinition, mModifier };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TMember tMember,
			TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			MDefinition mDefinition, Modifier mModifier) {
		Object[] result_pattern_InterfaceMember_2_4_solveCSP_binding = pattern_InterfaceMember_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition,
				mModifier);
		if (result_pattern_InterfaceMember_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_2_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceMember_2_4_solveCSP_black = pattern_InterfaceMember_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceMember_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tMember, tInterface, mInterface,
						defToMember, mDefinition, mModifier };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceMember_2_5_checkCSP_expressionFBB(InterfaceMember _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceMember_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceMember";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceMember_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_10_1_initialbindings_blackBBBBB(InterfaceMember _this,
			Match match, TMember tMember, TInterface tInterface, TModifier tModifier) {
		return new Object[] { _this, match, tMember, tInterface, tModifier };
	}

	public static final Object[] pattern_InterfaceMember_10_2_SolveCSP_bindingFBBBBB(InterfaceMember _this, Match match,
			TMember tMember, TInterface tInterface, TModifier tModifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tMember, tInterface, tModifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tMember, tInterface, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_10_2_SolveCSP_bindingAndBlackFBBBBB(InterfaceMember _this,
			Match match, TMember tMember, TInterface tInterface, TModifier tModifier) {
		Object[] result_pattern_InterfaceMember_10_2_SolveCSP_binding = pattern_InterfaceMember_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tMember, tInterface, tModifier);
		if (result_pattern_InterfaceMember_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceMember_10_2_SolveCSP_black = pattern_InterfaceMember_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceMember_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tMember, tInterface, tModifier };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceMember_10_3_CheckCSP_expressionFBB(InterfaceMember _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TMember tMember, TInterface tInterface, TModifier tModifier) {
		return new Object[] { match, tMember, tInterface, tModifier };
	}

	public static final Object[] pattern_InterfaceMember_10_4_collectelementstobetranslated_greenBBBF(Match match,
			TMember tMember, TModifier tModifier) {
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tModifier);
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		match.getToBeTranslatedEdges().add(tMember__tModifier____tModifier);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { match, tMember, tModifier, tMember__tModifier____tModifier };
	}

	public static final Object[] pattern_InterfaceMember_10_5_collectcontextelements_blackBBBB(Match match,
			TMember tMember, TInterface tInterface, TModifier tModifier) {
		return new Object[] { match, tMember, tInterface, tModifier };
	}

	public static final Object[] pattern_InterfaceMember_10_5_collectcontextelements_greenBBBFF(Match match,
			TMember tMember, TInterface tInterface) {
		EMoflonEdge tInterface__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tInterface____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tMember);
		match.getContextNodes().add(tInterface);
		String tInterface__tMember____defines_name_prime = "defines";
		String tMember__tInterface____definedBy_name_prime = "definedBy";
		tInterface__tMember____defines.setSrc(tInterface);
		tInterface__tMember____defines.setTrg(tMember);
		match.getContextEdges().add(tInterface__tMember____defines);
		tMember__tInterface____definedBy.setSrc(tMember);
		tMember__tInterface____definedBy.setTrg(tInterface);
		match.getContextEdges().add(tMember__tInterface____definedBy);
		tInterface__tMember____defines.setName(tInterface__tMember____defines_name_prime);
		tMember__tInterface____definedBy.setName(tMember__tInterface____definedBy_name_prime);
		return new Object[] { match, tMember, tInterface, tInterface__tMember____defines,
				tMember__tInterface____definedBy };
	}

	public static final void pattern_InterfaceMember_10_6_registerobjectstomatch_expressionBBBBB(InterfaceMember _this,
			Match match, TMember tMember, TInterface tInterface, TModifier tModifier) {
		_this.registerObjectsToMatch_BWD(match, tMember, tInterface, tModifier);

	}

	public static final boolean pattern_InterfaceMember_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceMember_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_2 = isApplicableMatch.getObject("tInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("mInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("tModifier");
		EObject _localVariable_6 = isApplicableMatch.getObject("mDefinition");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpTInterface = _localVariable_2;
		EObject tmpMInterface = _localVariable_3;
		EObject tmpDefToMember = _localVariable_4;
		EObject tmpTModifier = _localVariable_5;
		EObject tmpMDefinition = _localVariable_6;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpTInterface instanceof TInterface) {
					TInterface tInterface = (TInterface) tmpTInterface;
					if (tmpMInterface instanceof InterfaceDeclaration) {
						InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
						if (tmpDefToMember instanceof MDefinitionToTMember) {
							MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
							if (tmpTModifier instanceof TModifier) {
								TModifier tModifier = (TModifier) tmpTModifier;
								if (tmpMDefinition instanceof MDefinition) {
									MDefinition mDefinition = (MDefinition) tmpMDefinition;
									return new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember,
											tModifier, mDefinition, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_11_1_performtransformation_blackBBBBBBBFBB(
			TypeToTAbstractType mTypeToTType, TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface,
			MDefinitionToTMember defToMember, TModifier tModifier, MDefinition mDefinition, InterfaceMember _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember, tModifier,
						mDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InterfaceMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceMember_11_1_performtransformation_binding = pattern_InterfaceMember_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceMember_11_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_InterfaceMember_11_1_performtransformation_binding[0];
			TMember tMember = (TMember) result_pattern_InterfaceMember_11_1_performtransformation_binding[1];
			TInterface tInterface = (TInterface) result_pattern_InterfaceMember_11_1_performtransformation_binding[2];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result_pattern_InterfaceMember_11_1_performtransformation_binding[3];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_InterfaceMember_11_1_performtransformation_binding[4];
			TModifier tModifier = (TModifier) result_pattern_InterfaceMember_11_1_performtransformation_binding[5];
			MDefinition mDefinition = (MDefinition) result_pattern_InterfaceMember_11_1_performtransformation_binding[6];

			Object[] result_pattern_InterfaceMember_11_1_performtransformation_black = pattern_InterfaceMember_11_1_performtransformation_blackBBBBBBBFBB(
					mTypeToTType, tMember, tInterface, mInterface, defToMember, tModifier, mDefinition, _this,
					isApplicableMatch);
			if (result_pattern_InterfaceMember_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceMember_11_1_performtransformation_black[7];

				return new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember, tModifier,
						mDefinition, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_11_1_performtransformation_greenFBBFB(TModifier tModifier,
			MDefinition mDefinition, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		mModifierToTModifier.setTarget(tModifier);
		mDefinition.setModifier(mModifier);
		mModifierToTModifier.setSource(mModifier);
		boolean mModifier_static_prime = (boolean) _localVariable_0;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_1;
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		return new Object[] { mModifierToTModifier, tModifier, mDefinition, mModifier, csp };
	}

	public static final Object[] pattern_InterfaceMember_11_2_collecttranslatedelements_blackBBB(
			MModifierToTModifier mModifierToTModifier, TModifier tModifier, Modifier mModifier) {
		return new Object[] { mModifierToTModifier, tModifier, mModifier };
	}

	public static final Object[] pattern_InterfaceMember_11_2_collecttranslatedelements_greenFBBB(
			MModifierToTModifier mModifierToTModifier, TModifier tModifier, Modifier mModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getTranslatedElements().add(tModifier);
		ruleresult.getCreatedElements().add(mModifier);
		return new Object[] { ruleresult, mModifierToTModifier, tModifier, mModifier };
	}

	public static final Object[] pattern_InterfaceMember_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mModifierToTModifier, EObject tMember,
			EObject tInterface, EObject mInterface, EObject defToMember, EObject tModifier, EObject mDefinition,
			EObject mModifier) {
		if (!mTypeToTType.equals(tMember)) {
			if (!mTypeToTType.equals(tInterface)) {
				if (!mTypeToTType.equals(tModifier)) {
					if (!mModifierToTModifier.equals(mTypeToTType)) {
						if (!mModifierToTModifier.equals(tMember)) {
							if (!mModifierToTModifier.equals(tInterface)) {
								if (!mModifierToTModifier.equals(tModifier)) {
									if (!tMember.equals(tModifier)) {
										if (!tInterface.equals(tMember)) {
											if (!tInterface.equals(tModifier)) {
												if (!mInterface.equals(mTypeToTType)) {
													if (!mInterface.equals(mModifierToTModifier)) {
														if (!mInterface.equals(tMember)) {
															if (!mInterface.equals(tInterface)) {
																if (!mInterface.equals(tModifier)) {
																	if (!mInterface.equals(mModifier)) {
																		if (!defToMember.equals(mTypeToTType)) {
																			if (!defToMember
																					.equals(mModifierToTModifier)) {
																				if (!defToMember.equals(tMember)) {
																					if (!defToMember
																							.equals(tInterface)) {
																						if (!defToMember
																								.equals(mInterface)) {
																							if (!defToMember.equals(
																									tModifier)) {
																								if (!defToMember.equals(
																										mDefinition)) {
																									if (!defToMember
																											.equals(mModifier)) {
																										if (!mDefinition
																												.equals(mTypeToTType)) {
																											if (!mDefinition
																													.equals(mModifierToTModifier)) {
																												if (!mDefinition
																														.equals(tMember)) {
																													if (!mDefinition
																															.equals(tInterface)) {
																														if (!mDefinition
																																.equals(mInterface)) {
																															if (!mDefinition
																																	.equals(tModifier)) {
																																if (!mDefinition
																																		.equals(mModifier)) {
																																	if (!mModifier
																																			.equals(mTypeToTType)) {
																																		if (!mModifier
																																				.equals(mModifierToTModifier)) {
																																			if (!mModifier
																																					.equals(tMember)) {
																																				if (!mModifier
																																						.equals(tInterface)) {
																																					if (!mModifier
																																							.equals(tModifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								mTypeToTType,
																																								mModifierToTModifier,
																																								tMember,
																																								tInterface,
																																								mInterface,
																																								defToMember,
																																								tModifier,
																																								mDefinition,
																																								mModifier };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InterfaceMember_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject mModifierToTModifier, EObject tMember, EObject tModifier,
			EObject mDefinition, EObject mModifier) {
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceMember";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getTranslatedEdges().add(tMember__tModifier____tModifier);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		return new Object[] { ruleresult, mModifierToTModifier, tMember, tModifier, mDefinition, mModifier,
				tMember__tModifier____tModifier, mModifierToTModifier__tModifier____target,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				mModifierToTModifier__mModifier____source };
	}

	public static final void pattern_InterfaceMember_11_5_registerobjects_expressionBBBBBBBBBBB(InterfaceMember _this,
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject mModifierToTModifier, EObject tMember,
			EObject tInterface, EObject mInterface, EObject defToMember, EObject tModifier, EObject mDefinition,
			EObject mModifier) {
		_this.registerObjects_BWD(ruleresult, mTypeToTType, mModifierToTModifier, tMember, tInterface, mInterface,
				defToMember, tModifier, mDefinition, mModifier);

	}

	public static final PerformRuleResult pattern_InterfaceMember_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_12_1_preparereturnvalue_bindingFB(InterfaceMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_12_1_preparereturnvalue_blackFBB(EClass eClass,
			InterfaceMember _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_12_1_preparereturnvalue_bindingAndBlackFFB(
			InterfaceMember _this) {
		Object[] result_pattern_InterfaceMember_12_1_preparereturnvalue_binding = pattern_InterfaceMember_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceMember_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InterfaceMember_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceMember_12_1_preparereturnvalue_black = pattern_InterfaceMember_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InterfaceMember_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InterfaceMember_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InterfaceMember";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InterfaceMember_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tMember");
		EObject _localVariable_1 = match.getObject("tInterface");
		EObject _localVariable_2 = match.getObject("tModifier");
		EObject tmpTMember = _localVariable_0;
		EObject tmpTInterface = _localVariable_1;
		EObject tmpTModifier = _localVariable_2;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpTInterface instanceof TInterface) {
				TInterface tInterface = (TInterface) tmpTInterface;
				if (tmpTModifier instanceof TModifier) {
					TModifier tModifier = (TModifier) tmpTModifier;
					return new Object[] { tMember, tInterface, tModifier, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_12_2_corematch_blackFBBFFBFB(TMember tMember,
			TInterface tInterface, TModifier tModifier, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
			BodyDeclaration tmpMDefinition = defToMember.getSource();
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tInterface, TypeToTAbstractType.class, "target")) {
					Type tmpMInterface = mTypeToTType.getSource();
					if (tmpMInterface instanceof InterfaceDeclaration) {
						InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
						_result.add(new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember,
								tModifier, mDefinition, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_12_3_findcontext_blackBBBBBBB(
			TypeToTAbstractType mTypeToTType, TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface,
			MDefinitionToTMember defToMember, TModifier tModifier, MDefinition mDefinition) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mInterface.getBodyDeclarations().contains(mDefinition)) {
			if (mInterface.equals(mTypeToTType.getSource())) {
				if (tModifier.equals(tMember.getTModifier())) {
					if (tMember.equals(defToMember.getTarget())) {
						if (tInterface.equals(mTypeToTType.getTarget())) {
							if (mDefinition.equals(defToMember.getSource())) {
								if (tInterface.getDefines().contains(tMember)) {
									_result.add(new Object[] { mTypeToTType, tMember, tInterface, mInterface,
											defToMember, tModifier, mDefinition });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(
			TypeToTAbstractType mTypeToTType, TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface,
			MDefinitionToTMember defToMember, TModifier tModifier, MDefinition mDefinition) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mInterface__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mInterface____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tInterface__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tInterface____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mInterface__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mInterface____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String mTypeToTType__mInterface____source_name_prime = "source";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String defToMember__tMember____target_name_prime = "target";
		String mTypeToTType__tInterface____target_name_prime = "target";
		String defToMember__mDefinition____source_name_prime = "source";
		String tInterface__tMember____defines_name_prime = "defines";
		String tMember__tInterface____definedBy_name_prime = "definedBy";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(tInterface);
		isApplicableMatch.getAllContextElements().add(mInterface);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(tModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		mInterface__mDefinition____bodyDeclarations.setSrc(mInterface);
		mInterface__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mInterface__mDefinition____bodyDeclarations);
		mDefinition__mInterface____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mInterface____abstractTypeDeclaration.setTrg(mInterface);
		isApplicableMatch.getAllContextElements().add(mDefinition__mInterface____abstractTypeDeclaration);
		mTypeToTType__mInterface____source.setSrc(mTypeToTType);
		mTypeToTType__mInterface____source.setTrg(mInterface);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mInterface____source);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		isApplicableMatch.getAllContextElements().add(tMember__tModifier____tModifier);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		mTypeToTType__tInterface____target.setSrc(mTypeToTType);
		mTypeToTType__tInterface____target.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tInterface____target);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		tInterface__tMember____defines.setSrc(tInterface);
		tInterface__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tInterface__tMember____defines);
		tMember__tInterface____definedBy.setSrc(tMember);
		tMember__tInterface____definedBy.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(tMember__tInterface____definedBy);
		mInterface__mDefinition____bodyDeclarations.setName(mInterface__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mInterface____abstractTypeDeclaration
				.setName(mDefinition__mInterface____abstractTypeDeclaration_name_prime);
		mTypeToTType__mInterface____source.setName(mTypeToTType__mInterface____source_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		mTypeToTType__tInterface____target.setName(mTypeToTType__tInterface____target_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		tInterface__tMember____defines.setName(tInterface__tMember____defines_name_prime);
		tMember__tInterface____definedBy.setName(tMember__tInterface____definedBy_name_prime);
		return new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember, tModifier, mDefinition,
				isApplicableMatch, mInterface__mDefinition____bodyDeclarations,
				mDefinition__mInterface____abstractTypeDeclaration, mTypeToTType__mInterface____source,
				tMember__tModifier____tModifier, defToMember__tMember____target, mTypeToTType__tInterface____target,
				defToMember__mDefinition____source, tInterface__tMember____defines, tMember__tInterface____definedBy };
	}

	public static final Object[] pattern_InterfaceMember_12_4_solveCSP_bindingFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TMember tMember,
			TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			TModifier tModifier, MDefinition mDefinition) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mTypeToTType, tMember, tInterface,
				mInterface, defToMember, tModifier, mDefinition);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tMember, tInterface, mInterface,
					defToMember, tModifier, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TMember tMember,
			TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			TModifier tModifier, MDefinition mDefinition) {
		Object[] result_pattern_InterfaceMember_12_4_solveCSP_binding = pattern_InterfaceMember_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tMember, tInterface, mInterface, defToMember, tModifier,
				mDefinition);
		if (result_pattern_InterfaceMember_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_12_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceMember_12_4_solveCSP_black = pattern_InterfaceMember_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceMember_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tMember, tInterface, mInterface,
						defToMember, tModifier, mDefinition };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceMember_12_5_checkCSP_expressionFBB(InterfaceMember _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceMember_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceMember";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceMember_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_20_1_preparereturnvalue_bindingFB(InterfaceMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InterfaceMember _this) {
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

	public static final Object[] pattern_InterfaceMember_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InterfaceMember _this) {
		Object[] result_pattern_InterfaceMember_20_1_preparereturnvalue_binding = pattern_InterfaceMember_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceMember_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InterfaceMember_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceMember_20_1_preparereturnvalue_black = pattern_InterfaceMember_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InterfaceMember_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InterfaceMember_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InterfaceMember_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InterfaceMember_20_2_testcorematchandDECs_black_nac_0BB(TModifier tModifier,
			TInterface tInterface) {
		for (TAbstractType __DEC_tModifier_tModifier_942499 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tInterface.equals(__DEC_tModifier_tModifier_942499)) {
				return new Object[] { tModifier, tInterface };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_20_2_testcorematchandDECs_black_nac_1BB(TInterface tInterface,
			TModifier tModifier) {
		if (tModifier.equals(tInterface.getTModifier())) {
			return new Object[] { tInterface, tModifier };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_tModifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTMember = _edge_tModifier.getSrc();
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			EObject tmpTModifier = _edge_tModifier.getTrg();
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tModifier.equals(tMember.getTModifier())) {
					TAbstractType tmpTInterface = tMember.getDefinedBy();
					if (tmpTInterface instanceof TInterface) {
						TInterface tInterface = (TInterface) tmpTInterface;
						if (pattern_InterfaceMember_20_2_testcorematchandDECs_black_nac_0BB(tModifier,
								tInterface) == null) {
							if (pattern_InterfaceMember_20_2_testcorematchandDECs_black_nac_1BB(tInterface,
									tModifier) == null) {
								_result.add(new Object[] { tMember, tInterface, tModifier, _edge_tModifier });
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InterfaceMember_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InterfaceMember _this, Match match, TMember tMember, TInterface tInterface, TModifier tModifier) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tMember, tInterface, tModifier);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InterfaceMember_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InterfaceMember _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InterfaceMember_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_21_1_preparereturnvalue_bindingFB(InterfaceMember _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InterfaceMember _this) {
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

	public static final Object[] pattern_InterfaceMember_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InterfaceMember _this) {
		Object[] result_pattern_InterfaceMember_21_1_preparereturnvalue_binding = pattern_InterfaceMember_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceMember_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InterfaceMember_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceMember_21_1_preparereturnvalue_black = pattern_InterfaceMember_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InterfaceMember_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InterfaceMember_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InterfaceMember_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMDefinition = _edge_modifier.getSrc();
		if (tmpMDefinition instanceof MDefinition) {
			MDefinition mDefinition = (MDefinition) tmpMDefinition;
			EObject tmpMModifier = _edge_modifier.getTrg();
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (mModifier.equals(mDefinition.getModifier())) {
					AbstractTypeDeclaration tmpMInterface = mDefinition.getAbstractTypeDeclaration();
					if (tmpMInterface instanceof InterfaceDeclaration) {
						InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
						_result.add(new Object[] { mInterface, mDefinition, mModifier, _edge_modifier });
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InterfaceMember_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InterfaceMember _this, Match match, InterfaceDeclaration mInterface, MDefinition mDefinition,
			Modifier mModifier) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mInterface, mDefinition, mModifier);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InterfaceMember_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InterfaceMember _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InterfaceMember_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_24_1_prepare_blackB(InterfaceMember _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceMember_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InterfaceMember_24_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tMember");
		EObject _localVariable_1 = targetMatch.getObject("tInterface");
		EObject _localVariable_2 = sourceMatch.getObject("mInterface");
		EObject _localVariable_3 = targetMatch.getObject("tModifier");
		EObject _localVariable_4 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_5 = sourceMatch.getObject("mModifier");
		EObject tmpTMember = _localVariable_0;
		EObject tmpTInterface = _localVariable_1;
		EObject tmpMInterface = _localVariable_2;
		EObject tmpTModifier = _localVariable_3;
		EObject tmpMDefinition = _localVariable_4;
		EObject tmpMModifier = _localVariable_5;
		if (tmpTMember instanceof TMember) {
			TMember tMember = (TMember) tmpTMember;
			if (tmpTInterface instanceof TInterface) {
				TInterface tInterface = (TInterface) tmpTInterface;
				if (tmpMInterface instanceof InterfaceDeclaration) {
					InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
					if (tmpTModifier instanceof TModifier) {
						TModifier tModifier = (TModifier) tmpTModifier;
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							if (tmpMModifier instanceof Modifier) {
								Modifier mModifier = (Modifier) tmpMModifier;
								return new Object[] { tMember, tInterface, mInterface, tModifier, mDefinition,
										mModifier, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_24_2_matchsrctrgcontext_blackBBBBBBBB(TMember tMember,
			TInterface tInterface, InterfaceDeclaration mInterface, TModifier tModifier, MDefinition mDefinition,
			Modifier mModifier, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tMember, tInterface, mInterface, tModifier, mDefinition, mModifier, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding = pattern_InterfaceMember_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding != null) {
			TMember tMember = (TMember) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[0];
			TInterface tInterface = (TInterface) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[1];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[2];
			TModifier tModifier = (TModifier) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[3];
			MDefinition mDefinition = (MDefinition) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[4];
			Modifier mModifier = (Modifier) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_InterfaceMember_24_2_matchsrctrgcontext_black = pattern_InterfaceMember_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tMember, tInterface, mInterface, tModifier, mDefinition, mModifier, sourceMatch, targetMatch);
			if (result_pattern_InterfaceMember_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tMember, tInterface, mInterface, tModifier, mDefinition, mModifier, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_24_3_solvecsp_bindingFBBBBBBBBB(InterfaceMember _this,
			TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface, TModifier tModifier,
			MDefinition mDefinition, Modifier mModifier, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tMember, tInterface, mInterface, tModifier, mDefinition,
				mModifier, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tMember, tInterface, mInterface, tModifier, mDefinition, mModifier,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(InterfaceMember _this,
			TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface, TModifier tModifier,
			MDefinition mDefinition, Modifier mModifier, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InterfaceMember_24_3_solvecsp_binding = pattern_InterfaceMember_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tMember, tInterface, mInterface, tModifier, mDefinition, mModifier, sourceMatch, targetMatch);
		if (result_pattern_InterfaceMember_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_24_3_solvecsp_binding[0];

			Object[] result_pattern_InterfaceMember_24_3_solvecsp_black = pattern_InterfaceMember_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InterfaceMember_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tMember, tInterface, mInterface, tModifier, mDefinition, mModifier,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceMember_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_24_5_matchcorrcontext_blackFBBBFBBB(TMember tMember,
			TInterface tInterface, InterfaceDeclaration mInterface, MDefinition mDefinition, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mInterface, TypeToTAbstractType.class, "source")) {
				if (tInterface.equals(mTypeToTType.getTarget())) {
					for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
						if (mDefinition.equals(defToMember.getSource())) {
							_result.add(new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember,
									mDefinition, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType mTypeToTType, MDefinitionToTMember defToMember, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InterfaceMember";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.getAllContextElements().add(defToMember);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, defToMember, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_InterfaceMember_24_6_createcorrespondence_blackBBBBBBB(TMember tMember,
			TInterface tInterface, InterfaceDeclaration mInterface, TModifier tModifier, MDefinition mDefinition,
			Modifier mModifier, CCMatch ccMatch) {
		return new Object[] { tMember, tInterface, mInterface, tModifier, mDefinition, mModifier, ccMatch };
	}

	public static final Object[] pattern_InterfaceMember_24_6_createcorrespondence_greenFBBB(TModifier tModifier,
			Modifier mModifier, CCMatch ccMatch) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		mModifierToTModifier.setTarget(tModifier);
		mModifierToTModifier.setSource(mModifier);
		ccMatch.getCreateCorr().add(mModifierToTModifier);
		return new Object[] { mModifierToTModifier, tModifier, mModifier, ccMatch };
	}

	public static final Object[] pattern_InterfaceMember_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InterfaceMember_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InterfaceMember";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceMember_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_27_1_matchtggpattern_blackBBB(InterfaceDeclaration mInterface,
			MDefinition mDefinition, Modifier mModifier) {
		if (mInterface.getBodyDeclarations().contains(mDefinition)) {
			if (mModifier.equals(mDefinition.getModifier())) {
				return new Object[] { mInterface, mDefinition, mModifier };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceMember_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceMember_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_28_1_matchtggpattern_black_nac_0BB(TModifier tModifier,
			TInterface tInterface) {
		for (TAbstractType __DEC_tModifier_tModifier_552195 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tInterface.equals(__DEC_tModifier_tModifier_552195)) {
				return new Object[] { tModifier, tInterface };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_28_1_matchtggpattern_black_nac_1BB(TInterface tInterface,
			TModifier tModifier) {
		if (tModifier.equals(tInterface.getTModifier())) {
			return new Object[] { tInterface, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_28_1_matchtggpattern_blackBBB(TMember tMember,
			TInterface tInterface, TModifier tModifier) {
		if (tModifier.equals(tMember.getTModifier())) {
			if (tInterface.getDefines().contains(tMember)) {
				if (pattern_InterfaceMember_28_1_matchtggpattern_black_nac_0BB(tModifier, tInterface) == null) {
					if (pattern_InterfaceMember_28_1_matchtggpattern_black_nac_1BB(tInterface, tModifier) == null) {
						return new Object[] { tMember, tInterface, tModifier };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceMember_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceMember_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_29_1_createresult_blackB(InterfaceMember _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceMember_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration mInterface) {
		if (ruleResult.getSourceObjects().contains(mInterface)) {
			return new Object[] { ruleResult, mInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember defToMember) {
		if (ruleResult.getCorrObjects().contains(defToMember)) {
			return new Object[] { ruleResult, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TInterface tInterface) {
		if (ruleResult.getTargetObjects().contains(tInterface)) {
			return new Object[] { ruleResult, tInterface };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
				if (tmpMTypeToTType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
					Type tmpMInterface = mTypeToTType.getSource();
					if (tmpMInterface instanceof InterfaceDeclaration) {
						InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
						TAbstractType tmpTInterface = mTypeToTType.getTarget();
						if (tmpTInterface instanceof TInterface) {
							TInterface tInterface = (TInterface) tmpTInterface;
							if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									mTypeToTType) == null) {
								if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mInterface) == null) {
									if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_5BB(ruleResult,
											tInterface) == null) {
										for (BodyDeclaration tmpMDefinition : mInterface.getBodyDeclarations()) {
											if (tmpMDefinition instanceof MDefinition) {
												MDefinition mDefinition = (MDefinition) tmpMDefinition;
												if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_2BB(
														ruleResult, mDefinition) == null) {
													for (TMember tMember : tInterface.getDefines()) {
														if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_4BB(
																ruleResult, tMember) == null) {
															for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
																	.getOppositeReferenceTyped(mDefinition,
																			MDefinitionToTMember.class, "source")) {
																if (tMember.equals(defToMember.getTarget())) {
																	if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, defToMember) == null) {
																		_result.add(new Object[] { mTypeToTTypeList,
																				mTypeToTType, mInterface, mDefinition,
																				defToMember, tMember, tInterface,
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

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_29_3_solveCSP_bindingFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TMember tMember,
			TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToTType, tMember, tInterface,
				mInterface, defToMember, mDefinition, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tMember, tInterface, mInterface,
					defToMember, mDefinition, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TMember tMember,
			TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InterfaceMember_29_3_solveCSP_binding = pattern_InterfaceMember_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition,
				ruleResult);
		if (result_pattern_InterfaceMember_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_29_3_solveCSP_binding[0];

			Object[] result_pattern_InterfaceMember_29_3_solveCSP_black = pattern_InterfaceMember_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceMember_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tMember, tInterface, mInterface,
						defToMember, mDefinition, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceMember_29_4_checkCSP_expressionFBB(InterfaceMember _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_29_5_checknacs_blackBBBBBB(TypeToTAbstractType mTypeToTType,
			TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			MDefinition mDefinition) {
		return new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition };
	}

	public static final Object[] pattern_InterfaceMember_29_6_perform_blackBBBBBBB(TypeToTAbstractType mTypeToTType,
			TMember tMember, TInterface tInterface, InterfaceDeclaration mInterface, MDefinitionToTMember defToMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mTypeToTType, tMember, tInterface, mInterface, defToMember, mDefinition, ruleResult };
	}

	public static final Object[] pattern_InterfaceMember_29_6_perform_greenFBFBFBB(TMember tMember,
			MDefinition mDefinition, ModelgeneratorRuleResult ruleResult, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_1 = csp.getValue("tModifier", "tVisibility");
		Object _localVariable_2 = csp.getValue("mModifier", "static");
		Object _localVariable_3 = csp.getValue("mModifier", "visibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(mModifierToTModifier);
		tMember.setTModifier(tModifier);
		mModifierToTModifier.setTarget(tModifier);
		ruleResult.getTargetObjects().add(tModifier);
		mDefinition.setModifier(mModifier);
		mModifierToTModifier.setSource(mModifier);
		ruleResult.getSourceObjects().add(mModifier);
		boolean tModifier_isStatic_prime = (boolean) _localVariable_0;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_1;
		boolean mModifier_static_prime = (boolean) _localVariable_2;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mModifierToTModifier, tMember, tModifier, mDefinition, mModifier, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_InterfaceMember_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InterfaceMemberImpl
