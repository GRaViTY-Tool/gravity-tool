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
	public boolean isAppropriate_FWD(Match match, Modifier mModifier, MDefinition mDefinition,
			InterfaceDeclaration mInterface) {

		Object[] result1_black = InterfaceMemberImpl.pattern_InterfaceMember_0_1_initialbindings_blackBBBBB(this, match,
				mModifier, mDefinition, mInterface);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModifier] = " + mModifier + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mInterface] = " + mInterface + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, mModifier, mDefinition,
						mInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModifier] = " + mModifier + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mInterface] = " + mInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceMemberImpl.pattern_InterfaceMember_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceMemberImpl
					.pattern_InterfaceMember_0_4_collectelementstobetranslated_blackBBBB(match, mModifier, mDefinition,
							mInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModifier] = " + mModifier + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mInterface] = " + mInterface + ".");
			}
			InterfaceMemberImpl.pattern_InterfaceMember_0_4_collectelementstobetranslated_greenBBBFF(match, mModifier,
					mDefinition);
			//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InterfaceMemberImpl.pattern_InterfaceMember_0_5_collectcontextelements_blackBBBB(
					match, mModifier, mDefinition, mInterface);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModifier] = " + mModifier + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mInterface] = " + mInterface + ".");
			}
			InterfaceMemberImpl.pattern_InterfaceMember_0_5_collectcontextelements_greenBBBFF(match, mDefinition,
					mInterface);
			//nothing EMoflonEdge mInterface__mDefinition____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = (EMoflonEdge) result5_green[4];

			// 
			InterfaceMemberImpl.pattern_InterfaceMember_0_6_registerobjectstomatch_expressionBBBBB(this, match,
					mModifier, mDefinition, mInterface);
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
		TInterface tInterface = (TInterface) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		Modifier mModifier = (Modifier) result1_bindingAndBlack[2];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[3];
		InterfaceDeclaration mInterface = (InterfaceDeclaration) result1_bindingAndBlack[4];
		TMember tMember = (TMember) result1_bindingAndBlack[5];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = InterfaceMemberImpl
				.pattern_InterfaceMember_1_1_performtransformation_greenBFBFB(mModifier, tMember, csp);
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[1];
		TModifier tModifier = (TModifier) result1_green[3];

		Object[] result2_black = InterfaceMemberImpl.pattern_InterfaceMember_1_2_collecttranslatedelements_blackBBB(
				mModifier, mModifierToTModifier, tModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModifier] = " + mModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[tModifier] = " + tModifier + ".");
		}
		Object[] result2_green = InterfaceMemberImpl.pattern_InterfaceMember_1_2_collecttranslatedelements_greenFBBB(
				mModifier, mModifierToTModifier, tModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceMemberImpl.pattern_InterfaceMember_1_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, tInterface, mTypeToTType, mModifier, mDefinition, mInterface, mModifierToTModifier, tMember,
				defToMember, tModifier);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tInterface] = " + tInterface + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mModifier] = " + mModifier + ", " + "[mDefinition] = " + mDefinition + ", " + "[mInterface] = "
					+ mInterface + ", " + "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[tMember] = "
					+ tMember + ", " + "[defToMember] = " + defToMember + ", " + "[tModifier] = " + tModifier + ".");
		}
		InterfaceMemberImpl.pattern_InterfaceMember_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, mModifier,
				mDefinition, mModifierToTModifier, tMember, tModifier);
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		InterfaceMemberImpl.pattern_InterfaceMember_1_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				tInterface, mTypeToTType, mModifier, mDefinition, mInterface, mModifierToTModifier, tMember,
				defToMember, tModifier);
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
		Modifier mModifier = (Modifier) result2_binding[0];
		MDefinition mDefinition = (MDefinition) result2_binding[1];
		InterfaceDeclaration mInterface = (InterfaceDeclaration) result2_binding[2];
		for (Object[] result2_black : InterfaceMemberImpl.pattern_InterfaceMember_2_2_corematch_blackFFBBBFFB(mModifier,
				mDefinition, mInterface, match)) {
			TInterface tInterface = (TInterface) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			TMember tMember = (TMember) result2_black[5];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[6];
			// ForEach 
			for (Object[] result3_black : InterfaceMemberImpl.pattern_InterfaceMember_2_3_findcontext_blackBBBBBBB(
					tInterface, mTypeToTType, mModifier, mDefinition, mInterface, tMember, defToMember)) {
				Object[] result3_green = InterfaceMemberImpl
						.pattern_InterfaceMember_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(tInterface, mTypeToTType,
								mModifier, mDefinition, mInterface, tMember, defToMember);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tInterface__tMember____defines = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tMember__tInterface____definedBy = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__tInterface____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mTypeToTType__mInterface____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mInterface__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = InterfaceMemberImpl
						.pattern_InterfaceMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tInterface, mTypeToTType, mModifier, mDefinition, mInterface, tMember, defToMember);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tInterface] = " + tInterface
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mModifier] = " + mModifier + ", "
							+ "[mDefinition] = " + mDefinition + ", " + "[mInterface] = " + mInterface + ", "
							+ "[tMember] = " + tMember + ", " + "[defToMember] = " + defToMember + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Modifier mModifier, MDefinition mDefinition,
			InterfaceDeclaration mInterface) {
		match.registerObject("mModifier", mModifier);
		match.registerObject("mDefinition", mDefinition);
		match.registerObject("mInterface", mInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Modifier mModifier, MDefinition mDefinition,
			InterfaceDeclaration mInterface) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TInterface tInterface,
			TypeToTAbstractType mTypeToTType, Modifier mModifier, MDefinition mDefinition,
			InterfaceDeclaration mInterface, TMember tMember, MDefinitionToTMember defToMember) {// Create CSP
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
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mModifier", mModifier);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mInterface", mInterface);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("defToMember", defToMember);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tInterface, EObject mTypeToTType,
			EObject mModifier, EObject mDefinition, EObject mInterface, EObject mModifierToTModifier, EObject tMember,
			EObject defToMember, EObject tModifier) {
		ruleresult.registerObject("tInterface", tInterface);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mInterface", mInterface);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("tModifier", tModifier);

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
	public boolean isAppropriate_BWD(Match match, TInterface tInterface, TMember tMember, TModifier tModifier) {

		Object[] result1_black = InterfaceMemberImpl.pattern_InterfaceMember_10_1_initialbindings_blackBBBBB(this,
				match, tInterface, tMember, tModifier);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tInterface] = " + tInterface + ", " + "[tMember] = " + tMember
					+ ", " + "[tModifier] = " + tModifier + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tInterface, tMember,
						tModifier);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tInterface] = " + tInterface + ", " + "[tMember] = " + tMember
					+ ", " + "[tModifier] = " + tModifier + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceMemberImpl.pattern_InterfaceMember_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceMemberImpl
					.pattern_InterfaceMember_10_4_collectelementstobetranslated_blackBBBB(match, tInterface, tMember,
							tModifier);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tInterface] = " + tInterface + ", " + "[tMember] = " + tMember + ", " + "[tModifier] = "
						+ tModifier + ".");
			}
			InterfaceMemberImpl.pattern_InterfaceMember_10_4_collectelementstobetranslated_greenBBBF(match, tMember,
					tModifier);
			//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = InterfaceMemberImpl.pattern_InterfaceMember_10_5_collectcontextelements_blackBBBB(
					match, tInterface, tMember, tModifier);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tInterface] = " + tInterface + ", " + "[tMember] = " + tMember + ", " + "[tModifier] = "
						+ tModifier + ".");
			}
			InterfaceMemberImpl.pattern_InterfaceMember_10_5_collectcontextelements_greenBBBFF(match, tInterface,
					tMember);
			//nothing EMoflonEdge tInterface__tMember____defines = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tMember__tInterface____definedBy = (EMoflonEdge) result5_green[4];

			// 
			InterfaceMemberImpl.pattern_InterfaceMember_10_6_registerobjectstomatch_expressionBBBBB(this, match,
					tInterface, tMember, tModifier);
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
		TInterface tInterface = (TInterface) result1_bindingAndBlack[0];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result1_bindingAndBlack[2];
		InterfaceDeclaration mInterface = (InterfaceDeclaration) result1_bindingAndBlack[3];
		TMember tMember = (TMember) result1_bindingAndBlack[4];
		MDefinitionToTMember defToMember = (MDefinitionToTMember) result1_bindingAndBlack[5];
		TModifier tModifier = (TModifier) result1_bindingAndBlack[6];
		CSP csp = (CSP) result1_bindingAndBlack[7];
		Object[] result1_green = InterfaceMemberImpl
				.pattern_InterfaceMember_11_1_performtransformation_greenFBFBB(mDefinition, tModifier, csp);
		Modifier mModifier = (Modifier) result1_green[0];
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[2];

		Object[] result2_black = InterfaceMemberImpl.pattern_InterfaceMember_11_2_collecttranslatedelements_blackBBB(
				mModifier, mModifierToTModifier, tModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mModifier] = " + mModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[tModifier] = " + tModifier + ".");
		}
		Object[] result2_green = InterfaceMemberImpl.pattern_InterfaceMember_11_2_collecttranslatedelements_greenFBBB(
				mModifier, mModifierToTModifier, tModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceMemberImpl.pattern_InterfaceMember_11_3_bookkeepingforedges_blackBBBBBBBBBB(
				ruleresult, tInterface, mTypeToTType, mModifier, mDefinition, mInterface, mModifierToTModifier, tMember,
				defToMember, tModifier);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tInterface] = " + tInterface + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[mModifier] = " + mModifier + ", " + "[mDefinition] = " + mDefinition + ", " + "[mInterface] = "
					+ mInterface + ", " + "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[tMember] = "
					+ tMember + ", " + "[defToMember] = " + defToMember + ", " + "[tModifier] = " + tModifier + ".");
		}
		InterfaceMemberImpl.pattern_InterfaceMember_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, mModifier,
				mDefinition, mModifierToTModifier, tMember, tModifier);
		//nothing EMoflonEdge mDefinition__mModifier____modifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifier__mDefinition____bodyDeclaration = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		InterfaceMemberImpl.pattern_InterfaceMember_11_5_registerobjects_expressionBBBBBBBBBBB(this, ruleresult,
				tInterface, mTypeToTType, mModifier, mDefinition, mInterface, mModifierToTModifier, tMember,
				defToMember, tModifier);
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
		TInterface tInterface = (TInterface) result2_binding[0];
		TMember tMember = (TMember) result2_binding[1];
		TModifier tModifier = (TModifier) result2_binding[2];
		for (Object[] result2_black : InterfaceMemberImpl
				.pattern_InterfaceMember_12_2_corematch_blackBFFFBFBB(tInterface, tMember, tModifier, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			MDefinition mDefinition = (MDefinition) result2_black[2];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result2_black[3];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[5];
			// ForEach 
			for (Object[] result3_black : InterfaceMemberImpl.pattern_InterfaceMember_12_3_findcontext_blackBBBBBBB(
					tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember, tModifier)) {
				Object[] result3_green = InterfaceMemberImpl
						.pattern_InterfaceMember_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(tInterface, mTypeToTType,
								mDefinition, mInterface, tMember, defToMember, tModifier);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge tInterface__tMember____defines = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tMember__tInterface____definedBy = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mTypeToTType__tInterface____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__mInterface____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge defToMember__tMember____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge mInterface__mDefinition____bodyDeclarations = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge defToMember__mDefinition____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge tMember__tModifier____tModifier = (EMoflonEdge) result3_green[16];

				Object[] result4_bindingAndBlack = InterfaceMemberImpl
						.pattern_InterfaceMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
								tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember, tModifier);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tInterface] = " + tInterface
							+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mDefinition] = " + mDefinition + ", "
							+ "[mInterface] = " + mInterface + ", " + "[tMember] = " + tMember + ", "
							+ "[defToMember] = " + defToMember + ", " + "[tModifier] = " + tModifier + ".");
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
	public void registerObjectsToMatch_BWD(Match match, TInterface tInterface, TMember tMember, TModifier tModifier) {
		match.registerObject("tInterface", tInterface);
		match.registerObject("tMember", tMember);
		match.registerObject("tModifier", tModifier);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TInterface tInterface, TMember tMember, TModifier tModifier) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TInterface tInterface,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			MDefinitionToTMember defToMember, TModifier tModifier) {// Create CSP
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
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mInterface", mInterface);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("defToMember", defToMember);
		isApplicableMatch.registerObject("tModifier", tModifier);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tInterface, EObject mTypeToTType,
			EObject mModifier, EObject mDefinition, EObject mInterface, EObject mModifierToTModifier, EObject tMember,
			EObject defToMember, EObject tModifier) {
		ruleresult.registerObject("tInterface", tInterface);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("mDefinition", mDefinition);
		ruleresult.registerObject("mInterface", mInterface);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("tMember", tMember);
		ruleresult.registerObject("defToMember", defToMember);
		ruleresult.registerObject("tModifier", tModifier);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_34(EMoflonEdge _edge_tModifier) {

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
			TInterface tInterface = (TInterface) result2_black[0];
			TMember tMember = (TMember) result2_black[1];
			TModifier tModifier = (TModifier) result2_black[2];
			Object[] result2_green = InterfaceMemberImpl
					.pattern_InterfaceMember_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceMemberImpl
					.pattern_InterfaceMember_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, tInterface, tMember, tModifier)) {
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_36(EMoflonEdge _edge_modifier) {

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
			Modifier mModifier = (Modifier) result2_black[0];
			MDefinition mDefinition = (MDefinition) result2_black[1];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result2_black[2];
			Object[] result2_green = InterfaceMemberImpl
					.pattern_InterfaceMember_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceMemberImpl
					.pattern_InterfaceMember_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(this,
							match, mModifier, mDefinition, mInterface)) {
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
		TInterface tInterface = (TInterface) result2_bindingAndBlack[0];
		Modifier mModifier = (Modifier) result2_bindingAndBlack[1];
		MDefinition mDefinition = (MDefinition) result2_bindingAndBlack[2];
		InterfaceDeclaration mInterface = (InterfaceDeclaration) result2_bindingAndBlack[3];
		TMember tMember = (TMember) result2_bindingAndBlack[4];
		TModifier tModifier = (TModifier) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = InterfaceMemberImpl
				.pattern_InterfaceMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, tInterface, mModifier,
						mDefinition, mInterface, tMember, tModifier, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tInterface] = " + tInterface + ", " + "[mModifier] = " + mModifier + ", " + "[mDefinition] = "
					+ mDefinition + ", " + "[mInterface] = " + mInterface + ", " + "[tMember] = " + tMember + ", "
					+ "[tModifier] = " + tModifier + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InterfaceMemberImpl.pattern_InterfaceMember_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InterfaceMemberImpl
					.pattern_InterfaceMember_24_5_matchcorrcontext_blackBFBBBFBB(tInterface, mDefinition, mInterface,
							tMember, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[1];
				MDefinitionToTMember defToMember = (MDefinitionToTMember) result5_black[5];
				Object[] result5_green = InterfaceMemberImpl.pattern_InterfaceMember_24_5_matchcorrcontext_greenBBBBF(
						mTypeToTType, defToMember, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = InterfaceMemberImpl
						.pattern_InterfaceMember_24_6_createcorrespondence_blackBBBBBBB(tInterface, mModifier,
								mDefinition, mInterface, tMember, tModifier, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tInterface] = "
							+ tInterface + ", " + "[mModifier] = " + mModifier + ", " + "[mDefinition] = " + mDefinition
							+ ", " + "[mInterface] = " + mInterface + ", " + "[tMember] = " + tMember + ", "
							+ "[tModifier] = " + tModifier + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceMemberImpl.pattern_InterfaceMember_24_6_createcorrespondence_greenBFBB(mModifier, tModifier,
						ccMatch);
				//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[1];

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
	public CSP isApplicable_solveCsp_CC(TInterface tInterface, Modifier mModifier, MDefinition mDefinition,
			InterfaceDeclaration mInterface, TMember tMember, TModifier tModifier, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface) {// 
		Object[] result1_black = InterfaceMemberImpl.pattern_InterfaceMember_27_1_matchtggpattern_blackBBB(mModifier,
				mDefinition, mInterface);
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
	public boolean checkDEC_BWD(TInterface tInterface, TMember tMember, TModifier tModifier) {// 
		Object[] result1_black = InterfaceMemberImpl.pattern_InterfaceMember_28_1_matchtggpattern_blackBBB(tInterface,
				tMember, tModifier);
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
			MDefinitionToTMember defToMemberParameter) {

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
			//nothing RuleEntryList defToMemberList = (RuleEntryList) result2_black[0];
			TInterface tInterface = (TInterface) result2_black[1];
			TMember tMember = (TMember) result2_black[2];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result2_black[3];
			MDefinition mDefinition = (MDefinition) result2_black[4];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result2_black[5];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[6];

			Object[] result3_bindingAndBlack = InterfaceMemberImpl
					.pattern_InterfaceMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tInterface] = " + tInterface + ", "
						+ "[mTypeToTType] = " + mTypeToTType + ", " + "[mDefinition] = " + mDefinition + ", "
						+ "[mInterface] = " + mInterface + ", " + "[tMember] = " + tMember + ", " + "[defToMember] = "
						+ defToMember + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InterfaceMemberImpl.pattern_InterfaceMember_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = InterfaceMemberImpl.pattern_InterfaceMember_29_5_checknacs_blackBBBBBB(
						tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember);
				if (result5_black != null) {

					Object[] result6_black = InterfaceMemberImpl.pattern_InterfaceMember_29_6_perform_blackBBBBBBB(
							tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tInterface] = "
								+ tInterface + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[mDefinition] = "
								+ mDefinition + ", " + "[mInterface] = " + mInterface + ", " + "[tMember] = " + tMember
								+ ", " + "[defToMember] = " + defToMember + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					InterfaceMemberImpl.pattern_InterfaceMember_29_6_perform_greenFBFBFBB(mDefinition, tMember,
							ruleResult, csp);
					//nothing Modifier mModifier = (Modifier) result6_green[0];
					//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[2];
					//nothing TModifier tModifier = (TModifier) result6_green[4];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TInterface tInterface,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			MDefinitionToTMember defToMember, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mDefinition", mDefinition);
		isApplicableMatch.registerObject("mInterface", mInterface);
		isApplicableMatch.registerObject("tMember", tMember);
		isApplicableMatch.registerObject("defToMember", defToMember);
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
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_FWD__MATCH_MODIFIER_MDEFINITION_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(MDefinition) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.INTERFACE_MEMBER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODIFIER_MDEFINITION_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(MDefinition) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
			return null;
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODIFIER_MDEFINITION_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(MDefinition) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TINTERFACE_TYPETOTABSTRACTTYPE_MODIFIER_MDEFINITION_INTERFACEDECLARATION_TMEMBER_MDEFINITIONTOTMEMBER:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TInterface) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (Modifier) arguments.get(3), (MDefinition) arguments.get(4),
					(InterfaceDeclaration) arguments.get(5), (TMember) arguments.get(6),
					(MDefinitionToTMember) arguments.get(7));
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
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_BWD__MATCH_TINTERFACE_TMEMBER_TMODIFIER:
			return isAppropriate_BWD((Match) arguments.get(0), (TInterface) arguments.get(1),
					(TMember) arguments.get(2), (TModifier) arguments.get(3));
		case RulesPackage.INTERFACE_MEMBER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TINTERFACE_TMEMBER_TMODIFIER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TInterface) arguments.get(1),
					(TMember) arguments.get(2), (TModifier) arguments.get(3));
			return null;
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TINTERFACE_TMEMBER_TMODIFIER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TInterface) arguments.get(1),
					(TMember) arguments.get(2), (TModifier) arguments.get(3));
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TINTERFACE_TYPETOTABSTRACTTYPE_MDEFINITION_INTERFACEDECLARATION_TMEMBER_MDEFINITIONTOTMEMBER_TMODIFIER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TInterface) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (MDefinition) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (TMember) arguments.get(5),
					(MDefinitionToTMember) arguments.get(6), (TModifier) arguments.get(7));
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
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_34__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_34((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_36__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_36((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_SOLVE_CSP_CC__TINTERFACE_MODIFIER_MDEFINITION_INTERFACEDECLARATION_TMEMBER_TMODIFIER_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TInterface) arguments.get(0), (Modifier) arguments.get(1),
					(MDefinition) arguments.get(2), (InterfaceDeclaration) arguments.get(3), (TMember) arguments.get(4),
					(TModifier) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.INTERFACE_MEMBER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_MEMBER___CHECK_DEC_FWD__MODIFIER_MDEFINITION_INTERFACEDECLARATION:
			return checkDEC_FWD((Modifier) arguments.get(0), (MDefinition) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INTERFACE_MEMBER___CHECK_DEC_BWD__TINTERFACE_TMEMBER_TMODIFIER:
			return checkDEC_BWD((TInterface) arguments.get(0), (TMember) arguments.get(1),
					(TModifier) arguments.get(2));
		case RulesPackage.INTERFACE_MEMBER___GENERATE_MODEL__RULEENTRYCONTAINER_MDEFINITIONTOTMEMBER:
			return generateModel((RuleEntryContainer) arguments.get(0), (MDefinitionToTMember) arguments.get(1));
		case RulesPackage.INTERFACE_MEMBER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TINTERFACE_TYPETOTABSTRACTTYPE_MDEFINITION_INTERFACEDECLARATION_TMEMBER_MDEFINITIONTOTMEMBER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TInterface) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2), (MDefinition) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (TMember) arguments.get(5),
					(MDefinitionToTMember) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.INTERFACE_MEMBER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InterfaceMember_0_1_initialbindings_blackBBBBB(InterfaceMember _this,
			Match match, Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface) {
		return new Object[] { _this, match, mModifier, mDefinition, mInterface };
	}

	public static final Object[] pattern_InterfaceMember_0_2_SolveCSP_bindingFBBBBB(InterfaceMember _this, Match match,
			Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mModifier, mDefinition, mInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mModifier, mDefinition, mInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_0_2_SolveCSP_bindingAndBlackFBBBBB(InterfaceMember _this,
			Match match, Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface) {
		Object[] result_pattern_InterfaceMember_0_2_SolveCSP_binding = pattern_InterfaceMember_0_2_SolveCSP_bindingFBBBBB(
				_this, match, mModifier, mDefinition, mInterface);
		if (result_pattern_InterfaceMember_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceMember_0_2_SolveCSP_black = pattern_InterfaceMember_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceMember_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mModifier, mDefinition, mInterface };
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
			Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface) {
		return new Object[] { match, mModifier, mDefinition, mInterface };
	}

	public static final Object[] pattern_InterfaceMember_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			Modifier mModifier, MDefinition mDefinition) {
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
		return new Object[] { match, mModifier, mDefinition, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration };
	}

	public static final Object[] pattern_InterfaceMember_0_5_collectcontextelements_blackBBBB(Match match,
			Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface) {
		return new Object[] { match, mModifier, mDefinition, mInterface };
	}

	public static final Object[] pattern_InterfaceMember_0_5_collectcontextelements_greenBBBFF(Match match,
			MDefinition mDefinition, InterfaceDeclaration mInterface) {
		EMoflonEdge mInterface__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(mDefinition);
		match.getContextNodes().add(mInterface);
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
		return new Object[] { match, mDefinition, mInterface, mInterface__mDefinition____bodyDeclarations,
				mDefinition__mInterface____abstractTypeDeclaration };
	}

	public static final void pattern_InterfaceMember_0_6_registerobjectstomatch_expressionBBBBB(InterfaceMember _this,
			Match match, Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface) {
		_this.registerObjectsToMatch_FWD(match, mModifier, mDefinition, mInterface);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("tInterface");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mModifier");
		EObject _localVariable_3 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_4 = isApplicableMatch.getObject("mInterface");
		EObject _localVariable_5 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("defToMember");
		EObject tmpTInterface = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpMModifier = _localVariable_2;
		EObject tmpMDefinition = _localVariable_3;
		EObject tmpMInterface = _localVariable_4;
		EObject tmpTMember = _localVariable_5;
		EObject tmpDefToMember = _localVariable_6;
		if (tmpTInterface instanceof TInterface) {
			TInterface tInterface = (TInterface) tmpTInterface;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpMModifier instanceof Modifier) {
					Modifier mModifier = (Modifier) tmpMModifier;
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						if (tmpMInterface instanceof InterfaceDeclaration) {
							InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
							if (tmpTMember instanceof TMember) {
								TMember tMember = (TMember) tmpTMember;
								if (tmpDefToMember instanceof MDefinitionToTMember) {
									MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
									return new Object[] { tInterface, mTypeToTType, mModifier, mDefinition, mInterface,
											tMember, defToMember, isApplicableMatch };
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
			TInterface tInterface, TypeToTAbstractType mTypeToTType, Modifier mModifier, MDefinition mDefinition,
			InterfaceDeclaration mInterface, TMember tMember, MDefinitionToTMember defToMember, InterfaceMember _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tInterface, mTypeToTType, mModifier, mDefinition, mInterface, tMember,
						defToMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InterfaceMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceMember_1_1_performtransformation_binding = pattern_InterfaceMember_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceMember_1_1_performtransformation_binding != null) {
			TInterface tInterface = (TInterface) result_pattern_InterfaceMember_1_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_InterfaceMember_1_1_performtransformation_binding[1];
			Modifier mModifier = (Modifier) result_pattern_InterfaceMember_1_1_performtransformation_binding[2];
			MDefinition mDefinition = (MDefinition) result_pattern_InterfaceMember_1_1_performtransformation_binding[3];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result_pattern_InterfaceMember_1_1_performtransformation_binding[4];
			TMember tMember = (TMember) result_pattern_InterfaceMember_1_1_performtransformation_binding[5];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_InterfaceMember_1_1_performtransformation_binding[6];

			Object[] result_pattern_InterfaceMember_1_1_performtransformation_black = pattern_InterfaceMember_1_1_performtransformation_blackBBBBBBBFBB(
					tInterface, mTypeToTType, mModifier, mDefinition, mInterface, tMember, defToMember, _this,
					isApplicableMatch);
			if (result_pattern_InterfaceMember_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceMember_1_1_performtransformation_black[7];

				return new Object[] { tInterface, mTypeToTType, mModifier, mDefinition, mInterface, tMember,
						defToMember, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_1_1_performtransformation_greenBFBFB(Modifier mModifier,
			TMember tMember, CSP csp) {
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
		return new Object[] { mModifier, mModifierToTModifier, tMember, tModifier, csp };
	}

	public static final Object[] pattern_InterfaceMember_1_2_collecttranslatedelements_blackBBB(Modifier mModifier,
			MModifierToTModifier mModifierToTModifier, TModifier tModifier) {
		return new Object[] { mModifier, mModifierToTModifier, tModifier };
	}

	public static final Object[] pattern_InterfaceMember_1_2_collecttranslatedelements_greenFBBB(Modifier mModifier,
			MModifierToTModifier mModifierToTModifier, TModifier tModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(mModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getCreatedElements().add(tModifier);
		return new Object[] { ruleresult, mModifier, mModifierToTModifier, tModifier };
	}

	public static final Object[] pattern_InterfaceMember_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tInterface, EObject mTypeToTType, EObject mModifier,
			EObject mDefinition, EObject mInterface, EObject mModifierToTModifier, EObject tMember, EObject defToMember,
			EObject tModifier) {
		if (!tInterface.equals(tMember)) {
			if (!tInterface.equals(tModifier)) {
				if (!mTypeToTType.equals(tInterface)) {
					if (!mTypeToTType.equals(tMember)) {
						if (!mTypeToTType.equals(tModifier)) {
							if (!mModifier.equals(tInterface)) {
								if (!mModifier.equals(mTypeToTType)) {
									if (!mModifier.equals(mModifierToTModifier)) {
										if (!mModifier.equals(tMember)) {
											if (!mModifier.equals(tModifier)) {
												if (!mDefinition.equals(tInterface)) {
													if (!mDefinition.equals(mTypeToTType)) {
														if (!mDefinition.equals(mModifier)) {
															if (!mDefinition.equals(mInterface)) {
																if (!mDefinition.equals(mModifierToTModifier)) {
																	if (!mDefinition.equals(tMember)) {
																		if (!mDefinition.equals(tModifier)) {
																			if (!mInterface.equals(tInterface)) {
																				if (!mInterface.equals(mTypeToTType)) {
																					if (!mInterface.equals(mModifier)) {
																						if (!mInterface.equals(
																								mModifierToTModifier)) {
																							if (!mInterface
																									.equals(tMember)) {
																								if (!mInterface.equals(
																										tModifier)) {
																									if (!mModifierToTModifier
																											.equals(tInterface)) {
																										if (!mModifierToTModifier
																												.equals(mTypeToTType)) {
																											if (!mModifierToTModifier
																													.equals(tMember)) {
																												if (!mModifierToTModifier
																														.equals(tModifier)) {
																													if (!tMember
																															.equals(tModifier)) {
																														if (!defToMember
																																.equals(tInterface)) {
																															if (!defToMember
																																	.equals(mTypeToTType)) {
																																if (!defToMember
																																		.equals(mModifier)) {
																																	if (!defToMember
																																			.equals(mDefinition)) {
																																		if (!defToMember
																																				.equals(mInterface)) {
																																			if (!defToMember
																																					.equals(mModifierToTModifier)) {
																																				if (!defToMember
																																						.equals(tMember)) {
																																					if (!defToMember
																																							.equals(tModifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								tInterface,
																																								mTypeToTType,
																																								mModifier,
																																								mDefinition,
																																								mInterface,
																																								mModifierToTModifier,
																																								tMember,
																																								defToMember,
																																								tModifier };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mModifier, EObject mDefinition, EObject mModifierToTModifier,
			EObject tMember, EObject tModifier) {
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceMember";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getTranslatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getTranslatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(tMember__tModifier____tModifier);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		return new Object[] { ruleresult, mModifier, mDefinition, mModifierToTModifier, tMember, tModifier,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				mModifierToTModifier__mModifier____source, tMember__tModifier____tModifier,
				mModifierToTModifier__tModifier____target };
	}

	public static final void pattern_InterfaceMember_1_5_registerobjects_expressionBBBBBBBBBBB(InterfaceMember _this,
			PerformRuleResult ruleresult, EObject tInterface, EObject mTypeToTType, EObject mModifier,
			EObject mDefinition, EObject mInterface, EObject mModifierToTModifier, EObject tMember, EObject defToMember,
			EObject tModifier) {
		_this.registerObjects_FWD(ruleresult, tInterface, mTypeToTType, mModifier, mDefinition, mInterface,
				mModifierToTModifier, tMember, defToMember, tModifier);

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
		EObject _localVariable_0 = match.getObject("mModifier");
		EObject _localVariable_1 = match.getObject("mDefinition");
		EObject _localVariable_2 = match.getObject("mInterface");
		EObject tmpMModifier = _localVariable_0;
		EObject tmpMDefinition = _localVariable_1;
		EObject tmpMInterface = _localVariable_2;
		if (tmpMModifier instanceof Modifier) {
			Modifier mModifier = (Modifier) tmpMModifier;
			if (tmpMDefinition instanceof MDefinition) {
				MDefinition mDefinition = (MDefinition) tmpMDefinition;
				if (tmpMInterface instanceof InterfaceDeclaration) {
					InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
					return new Object[] { mModifier, mDefinition, mInterface, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_2_2_corematch_blackFFBBBFFB(Modifier mModifier,
			MDefinition mDefinition, InterfaceDeclaration mInterface, Match match) {
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
						_result.add(new Object[] { tInterface, mTypeToTType, mModifier, mDefinition, mInterface,
								tMember, defToMember, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_2_3_findcontext_blackBBBBBBB(TInterface tInterface,
			TypeToTAbstractType mTypeToTType, Modifier mModifier, MDefinition mDefinition,
			InterfaceDeclaration mInterface, TMember tMember, MDefinitionToTMember defToMember) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tInterface.getDefines().contains(tMember)) {
			if (tInterface.equals(mTypeToTType.getTarget())) {
				if (mModifier.equals(mDefinition.getModifier())) {
					if (mInterface.equals(mTypeToTType.getSource())) {
						if (tMember.equals(defToMember.getTarget())) {
							if (mInterface.getBodyDeclarations().contains(mDefinition)) {
								if (mDefinition.equals(defToMember.getSource())) {
									_result.add(new Object[] { tInterface, mTypeToTType, mModifier, mDefinition,
											mInterface, tMember, defToMember });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_2_3_findcontext_greenBBBBBBBFFFFFFFFFFF(TInterface tInterface,
			TypeToTAbstractType mTypeToTType, Modifier mModifier, MDefinition mDefinition,
			InterfaceDeclaration mInterface, TMember tMember, MDefinitionToTMember defToMember) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tInterface__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tInterface____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mInterface____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInterface__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tInterface__tMember____defines_name_prime = "defines";
		String tMember__tInterface____definedBy_name_prime = "definedBy";
		String mTypeToTType__tInterface____target_name_prime = "target";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String mTypeToTType__mInterface____source_name_prime = "source";
		String defToMember__tMember____target_name_prime = "target";
		String mInterface__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mInterface____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String defToMember__mDefinition____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(tInterface);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mInterface);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember);
		tInterface__tMember____defines.setSrc(tInterface);
		tInterface__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tInterface__tMember____defines);
		tMember__tInterface____definedBy.setSrc(tMember);
		tMember__tInterface____definedBy.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(tMember__tInterface____definedBy);
		mTypeToTType__tInterface____target.setSrc(mTypeToTType);
		mTypeToTType__tInterface____target.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tInterface____target);
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		isApplicableMatch.getAllContextElements().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mModifier__mDefinition____bodyDeclaration);
		mTypeToTType__mInterface____source.setSrc(mTypeToTType);
		mTypeToTType__mInterface____source.setTrg(mInterface);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mInterface____source);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		mInterface__mDefinition____bodyDeclarations.setSrc(mInterface);
		mInterface__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mInterface__mDefinition____bodyDeclarations);
		mDefinition__mInterface____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mInterface____abstractTypeDeclaration.setTrg(mInterface);
		isApplicableMatch.getAllContextElements().add(mDefinition__mInterface____abstractTypeDeclaration);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		tInterface__tMember____defines.setName(tInterface__tMember____defines_name_prime);
		tMember__tInterface____definedBy.setName(tMember__tInterface____definedBy_name_prime);
		mTypeToTType__tInterface____target.setName(mTypeToTType__tInterface____target_name_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		mTypeToTType__mInterface____source.setName(mTypeToTType__mInterface____source_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		mInterface__mDefinition____bodyDeclarations.setName(mInterface__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mInterface____abstractTypeDeclaration
				.setName(mDefinition__mInterface____abstractTypeDeclaration_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		return new Object[] { tInterface, mTypeToTType, mModifier, mDefinition, mInterface, tMember, defToMember,
				isApplicableMatch, tInterface__tMember____defines, tMember__tInterface____definedBy,
				mTypeToTType__tInterface____target, mDefinition__mModifier____modifier,
				mModifier__mDefinition____bodyDeclaration, mTypeToTType__mInterface____source,
				defToMember__tMember____target, mInterface__mDefinition____bodyDeclarations,
				mDefinition__mInterface____abstractTypeDeclaration, defToMember__mDefinition____source };
	}

	public static final Object[] pattern_InterfaceMember_2_4_solveCSP_bindingFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TInterface tInterface, TypeToTAbstractType mTypeToTType,
			Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			MDefinitionToTMember defToMember) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tInterface, mTypeToTType, mModifier,
				mDefinition, mInterface, tMember, defToMember);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tInterface, mTypeToTType, mModifier, mDefinition,
					mInterface, tMember, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TInterface tInterface, TypeToTAbstractType mTypeToTType,
			Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			MDefinitionToTMember defToMember) {
		Object[] result_pattern_InterfaceMember_2_4_solveCSP_binding = pattern_InterfaceMember_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tInterface, mTypeToTType, mModifier, mDefinition, mInterface, tMember,
				defToMember);
		if (result_pattern_InterfaceMember_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_2_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceMember_2_4_solveCSP_black = pattern_InterfaceMember_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceMember_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tInterface, mTypeToTType, mModifier, mDefinition,
						mInterface, tMember, defToMember };
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
			Match match, TInterface tInterface, TMember tMember, TModifier tModifier) {
		return new Object[] { _this, match, tInterface, tMember, tModifier };
	}

	public static final Object[] pattern_InterfaceMember_10_2_SolveCSP_bindingFBBBBB(InterfaceMember _this, Match match,
			TInterface tInterface, TMember tMember, TModifier tModifier) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tInterface, tMember, tModifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tInterface, tMember, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_10_2_SolveCSP_bindingAndBlackFBBBBB(InterfaceMember _this,
			Match match, TInterface tInterface, TMember tMember, TModifier tModifier) {
		Object[] result_pattern_InterfaceMember_10_2_SolveCSP_binding = pattern_InterfaceMember_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tInterface, tMember, tModifier);
		if (result_pattern_InterfaceMember_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceMember_10_2_SolveCSP_black = pattern_InterfaceMember_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceMember_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tInterface, tMember, tModifier };
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
			TInterface tInterface, TMember tMember, TModifier tModifier) {
		return new Object[] { match, tInterface, tMember, tModifier };
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
			TInterface tInterface, TMember tMember, TModifier tModifier) {
		return new Object[] { match, tInterface, tMember, tModifier };
	}

	public static final Object[] pattern_InterfaceMember_10_5_collectcontextelements_greenBBBFF(Match match,
			TInterface tInterface, TMember tMember) {
		EMoflonEdge tInterface__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tInterface____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tInterface);
		match.getContextNodes().add(tMember);
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
		return new Object[] { match, tInterface, tMember, tInterface__tMember____defines,
				tMember__tInterface____definedBy };
	}

	public static final void pattern_InterfaceMember_10_6_registerobjectstomatch_expressionBBBBB(InterfaceMember _this,
			Match match, TInterface tInterface, TMember tMember, TModifier tModifier) {
		_this.registerObjectsToMatch_BWD(match, tInterface, tMember, tModifier);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("tInterface");
		EObject _localVariable_1 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mDefinition");
		EObject _localVariable_3 = isApplicableMatch.getObject("mInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("tMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("defToMember");
		EObject _localVariable_6 = isApplicableMatch.getObject("tModifier");
		EObject tmpTInterface = _localVariable_0;
		EObject tmpMTypeToTType = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpMInterface = _localVariable_3;
		EObject tmpTMember = _localVariable_4;
		EObject tmpDefToMember = _localVariable_5;
		EObject tmpTModifier = _localVariable_6;
		if (tmpTInterface instanceof TInterface) {
			TInterface tInterface = (TInterface) tmpTInterface;
			if (tmpMTypeToTType instanceof TypeToTAbstractType) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpMInterface instanceof InterfaceDeclaration) {
						InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
						if (tmpTMember instanceof TMember) {
							TMember tMember = (TMember) tmpTMember;
							if (tmpDefToMember instanceof MDefinitionToTMember) {
								MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
								if (tmpTModifier instanceof TModifier) {
									TModifier tModifier = (TModifier) tmpTModifier;
									return new Object[] { tInterface, mTypeToTType, mDefinition, mInterface, tMember,
											defToMember, tModifier, isApplicableMatch };
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
			TInterface tInterface, TypeToTAbstractType mTypeToTType, MDefinition mDefinition,
			InterfaceDeclaration mInterface, TMember tMember, MDefinitionToTMember defToMember, TModifier tModifier,
			InterfaceMember _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember,
						tModifier, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InterfaceMember _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceMember_11_1_performtransformation_binding = pattern_InterfaceMember_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceMember_11_1_performtransformation_binding != null) {
			TInterface tInterface = (TInterface) result_pattern_InterfaceMember_11_1_performtransformation_binding[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_InterfaceMember_11_1_performtransformation_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_InterfaceMember_11_1_performtransformation_binding[2];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result_pattern_InterfaceMember_11_1_performtransformation_binding[3];
			TMember tMember = (TMember) result_pattern_InterfaceMember_11_1_performtransformation_binding[4];
			MDefinitionToTMember defToMember = (MDefinitionToTMember) result_pattern_InterfaceMember_11_1_performtransformation_binding[5];
			TModifier tModifier = (TModifier) result_pattern_InterfaceMember_11_1_performtransformation_binding[6];

			Object[] result_pattern_InterfaceMember_11_1_performtransformation_black = pattern_InterfaceMember_11_1_performtransformation_blackBBBBBBBFBB(
					tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember, tModifier, _this,
					isApplicableMatch);
			if (result_pattern_InterfaceMember_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceMember_11_1_performtransformation_black[7];

				return new Object[] { tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember,
						tModifier, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_11_1_performtransformation_greenFBFBB(MDefinition mDefinition,
			TModifier tModifier, CSP csp) {
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		mDefinition.setModifier(mModifier);
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		boolean mModifier_static_prime = (boolean) _localVariable_0;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_1;
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		return new Object[] { mModifier, mDefinition, mModifierToTModifier, tModifier, csp };
	}

	public static final Object[] pattern_InterfaceMember_11_2_collecttranslatedelements_blackBBB(Modifier mModifier,
			MModifierToTModifier mModifierToTModifier, TModifier tModifier) {
		return new Object[] { mModifier, mModifierToTModifier, tModifier };
	}

	public static final Object[] pattern_InterfaceMember_11_2_collecttranslatedelements_greenFBBB(Modifier mModifier,
			MModifierToTModifier mModifierToTModifier, TModifier tModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(mModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getTranslatedElements().add(tModifier);
		return new Object[] { ruleresult, mModifier, mModifierToTModifier, tModifier };
	}

	public static final Object[] pattern_InterfaceMember_11_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tInterface, EObject mTypeToTType, EObject mModifier,
			EObject mDefinition, EObject mInterface, EObject mModifierToTModifier, EObject tMember, EObject defToMember,
			EObject tModifier) {
		if (!tInterface.equals(tMember)) {
			if (!tInterface.equals(tModifier)) {
				if (!mTypeToTType.equals(tInterface)) {
					if (!mTypeToTType.equals(tMember)) {
						if (!mTypeToTType.equals(tModifier)) {
							if (!mModifier.equals(tInterface)) {
								if (!mModifier.equals(mTypeToTType)) {
									if (!mModifier.equals(mModifierToTModifier)) {
										if (!mModifier.equals(tMember)) {
											if (!mModifier.equals(tModifier)) {
												if (!mDefinition.equals(tInterface)) {
													if (!mDefinition.equals(mTypeToTType)) {
														if (!mDefinition.equals(mModifier)) {
															if (!mDefinition.equals(mInterface)) {
																if (!mDefinition.equals(mModifierToTModifier)) {
																	if (!mDefinition.equals(tMember)) {
																		if (!mDefinition.equals(tModifier)) {
																			if (!mInterface.equals(tInterface)) {
																				if (!mInterface.equals(mTypeToTType)) {
																					if (!mInterface.equals(mModifier)) {
																						if (!mInterface.equals(
																								mModifierToTModifier)) {
																							if (!mInterface
																									.equals(tMember)) {
																								if (!mInterface.equals(
																										tModifier)) {
																									if (!mModifierToTModifier
																											.equals(tInterface)) {
																										if (!mModifierToTModifier
																												.equals(mTypeToTType)) {
																											if (!mModifierToTModifier
																													.equals(tMember)) {
																												if (!mModifierToTModifier
																														.equals(tModifier)) {
																													if (!tMember
																															.equals(tModifier)) {
																														if (!defToMember
																																.equals(tInterface)) {
																															if (!defToMember
																																	.equals(mTypeToTType)) {
																																if (!defToMember
																																		.equals(mModifier)) {
																																	if (!defToMember
																																			.equals(mDefinition)) {
																																		if (!defToMember
																																				.equals(mInterface)) {
																																			if (!defToMember
																																					.equals(mModifierToTModifier)) {
																																				if (!defToMember
																																						.equals(tMember)) {
																																					if (!defToMember
																																							.equals(tModifier)) {
																																						return new Object[] {
																																								ruleresult,
																																								tInterface,
																																								mTypeToTType,
																																								mModifier,
																																								mDefinition,
																																								mInterface,
																																								mModifierToTModifier,
																																								tMember,
																																								defToMember,
																																								tModifier };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject mModifier, EObject mDefinition, EObject mModifierToTModifier,
			EObject tMember, EObject tModifier) {
		EMoflonEdge mDefinition__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mDefinition____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceMember";
		String mDefinition__mModifier____modifier_name_prime = "modifier";
		String mModifier__mDefinition____bodyDeclaration_name_prime = "bodyDeclaration";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		mDefinition__mModifier____modifier.setSrc(mDefinition);
		mDefinition__mModifier____modifier.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mDefinition__mModifier____modifier);
		mModifier__mDefinition____bodyDeclaration.setSrc(mModifier);
		mModifier__mDefinition____bodyDeclaration.setTrg(mDefinition);
		ruleresult.getCreatedEdges().add(mModifier__mDefinition____bodyDeclaration);
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getTranslatedEdges().add(tMember__tModifier____tModifier);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mDefinition__mModifier____modifier.setName(mDefinition__mModifier____modifier_name_prime);
		mModifier__mDefinition____bodyDeclaration.setName(mModifier__mDefinition____bodyDeclaration_name_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		return new Object[] { ruleresult, mModifier, mDefinition, mModifierToTModifier, tMember, tModifier,
				mDefinition__mModifier____modifier, mModifier__mDefinition____bodyDeclaration,
				mModifierToTModifier__mModifier____source, tMember__tModifier____tModifier,
				mModifierToTModifier__tModifier____target };
	}

	public static final void pattern_InterfaceMember_11_5_registerobjects_expressionBBBBBBBBBBB(InterfaceMember _this,
			PerformRuleResult ruleresult, EObject tInterface, EObject mTypeToTType, EObject mModifier,
			EObject mDefinition, EObject mInterface, EObject mModifierToTModifier, EObject tMember, EObject defToMember,
			EObject tModifier) {
		_this.registerObjects_BWD(ruleresult, tInterface, mTypeToTType, mModifier, mDefinition, mInterface,
				mModifierToTModifier, tMember, defToMember, tModifier);

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
		EObject _localVariable_0 = match.getObject("tInterface");
		EObject _localVariable_1 = match.getObject("tMember");
		EObject _localVariable_2 = match.getObject("tModifier");
		EObject tmpTInterface = _localVariable_0;
		EObject tmpTMember = _localVariable_1;
		EObject tmpTModifier = _localVariable_2;
		if (tmpTInterface instanceof TInterface) {
			TInterface tInterface = (TInterface) tmpTInterface;
			if (tmpTMember instanceof TMember) {
				TMember tMember = (TMember) tmpTMember;
				if (tmpTModifier instanceof TModifier) {
					TModifier tModifier = (TModifier) tmpTModifier;
					return new Object[] { tInterface, tMember, tModifier, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_12_2_corematch_blackBFFFBFBB(TInterface tInterface,
			TMember tMember, TModifier tModifier, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tInterface, TypeToTAbstractType.class, "target")) {
			Type tmpMInterface = mTypeToTType.getSource();
			if (tmpMInterface instanceof InterfaceDeclaration) {
				InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
				for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
					BodyDeclaration tmpMDefinition = defToMember.getSource();
					if (tmpMDefinition instanceof MDefinition) {
						MDefinition mDefinition = (MDefinition) tmpMDefinition;
						_result.add(new Object[] { tInterface, mTypeToTType, mDefinition, mInterface, tMember,
								defToMember, tModifier, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_12_3_findcontext_blackBBBBBBB(TInterface tInterface,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			MDefinitionToTMember defToMember, TModifier tModifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tInterface.getDefines().contains(tMember)) {
			if (tInterface.equals(mTypeToTType.getTarget())) {
				if (mInterface.equals(mTypeToTType.getSource())) {
					if (tMember.equals(defToMember.getTarget())) {
						if (mInterface.getBodyDeclarations().contains(mDefinition)) {
							if (mDefinition.equals(defToMember.getSource())) {
								if (tModifier.equals(tMember.getTModifier())) {
									_result.add(new Object[] { tInterface, mTypeToTType, mDefinition, mInterface,
											tMember, defToMember, tModifier });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_12_3_findcontext_greenBBBBBBBFFFFFFFFFF(TInterface tInterface,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			MDefinitionToTMember defToMember, TModifier tModifier) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tInterface__tMember____defines = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tInterface____definedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tInterface____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mInterface____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__tMember____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mInterface__mDefinition____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mDefinition__mInterface____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge defToMember__mDefinition____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tMember__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tInterface__tMember____defines_name_prime = "defines";
		String tMember__tInterface____definedBy_name_prime = "definedBy";
		String mTypeToTType__tInterface____target_name_prime = "target";
		String mTypeToTType__mInterface____source_name_prime = "source";
		String defToMember__tMember____target_name_prime = "target";
		String mInterface__mDefinition____bodyDeclarations_name_prime = "bodyDeclarations";
		String mDefinition__mInterface____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String defToMember__mDefinition____source_name_prime = "source";
		String tMember__tModifier____tModifier_name_prime = "tModifier";
		isApplicableMatch.getAllContextElements().add(tInterface);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mDefinition);
		isApplicableMatch.getAllContextElements().add(mInterface);
		isApplicableMatch.getAllContextElements().add(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember);
		isApplicableMatch.getAllContextElements().add(tModifier);
		tInterface__tMember____defines.setSrc(tInterface);
		tInterface__tMember____defines.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(tInterface__tMember____defines);
		tMember__tInterface____definedBy.setSrc(tMember);
		tMember__tInterface____definedBy.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(tMember__tInterface____definedBy);
		mTypeToTType__tInterface____target.setSrc(mTypeToTType);
		mTypeToTType__tInterface____target.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tInterface____target);
		mTypeToTType__mInterface____source.setSrc(mTypeToTType);
		mTypeToTType__mInterface____source.setTrg(mInterface);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mInterface____source);
		defToMember__tMember____target.setSrc(defToMember);
		defToMember__tMember____target.setTrg(tMember);
		isApplicableMatch.getAllContextElements().add(defToMember__tMember____target);
		mInterface__mDefinition____bodyDeclarations.setSrc(mInterface);
		mInterface__mDefinition____bodyDeclarations.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(mInterface__mDefinition____bodyDeclarations);
		mDefinition__mInterface____abstractTypeDeclaration.setSrc(mDefinition);
		mDefinition__mInterface____abstractTypeDeclaration.setTrg(mInterface);
		isApplicableMatch.getAllContextElements().add(mDefinition__mInterface____abstractTypeDeclaration);
		defToMember__mDefinition____source.setSrc(defToMember);
		defToMember__mDefinition____source.setTrg(mDefinition);
		isApplicableMatch.getAllContextElements().add(defToMember__mDefinition____source);
		tMember__tModifier____tModifier.setSrc(tMember);
		tMember__tModifier____tModifier.setTrg(tModifier);
		isApplicableMatch.getAllContextElements().add(tMember__tModifier____tModifier);
		tInterface__tMember____defines.setName(tInterface__tMember____defines_name_prime);
		tMember__tInterface____definedBy.setName(tMember__tInterface____definedBy_name_prime);
		mTypeToTType__tInterface____target.setName(mTypeToTType__tInterface____target_name_prime);
		mTypeToTType__mInterface____source.setName(mTypeToTType__mInterface____source_name_prime);
		defToMember__tMember____target.setName(defToMember__tMember____target_name_prime);
		mInterface__mDefinition____bodyDeclarations.setName(mInterface__mDefinition____bodyDeclarations_name_prime);
		mDefinition__mInterface____abstractTypeDeclaration
				.setName(mDefinition__mInterface____abstractTypeDeclaration_name_prime);
		defToMember__mDefinition____source.setName(defToMember__mDefinition____source_name_prime);
		tMember__tModifier____tModifier.setName(tMember__tModifier____tModifier_name_prime);
		return new Object[] { tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember, tModifier,
				isApplicableMatch, tInterface__tMember____defines, tMember__tInterface____definedBy,
				mTypeToTType__tInterface____target, mTypeToTType__mInterface____source, defToMember__tMember____target,
				mInterface__mDefinition____bodyDeclarations, mDefinition__mInterface____abstractTypeDeclaration,
				defToMember__mDefinition____source, tMember__tModifier____tModifier };
	}

	public static final Object[] pattern_InterfaceMember_12_4_solveCSP_bindingFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TInterface tInterface, TypeToTAbstractType mTypeToTType,
			MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember, MDefinitionToTMember defToMember,
			TModifier tModifier) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tInterface, mTypeToTType, mDefinition,
				mInterface, tMember, defToMember, tModifier);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tInterface, mTypeToTType, mDefinition, mInterface,
					tMember, defToMember, tModifier };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TInterface tInterface, TypeToTAbstractType mTypeToTType,
			MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember, MDefinitionToTMember defToMember,
			TModifier tModifier) {
		Object[] result_pattern_InterfaceMember_12_4_solveCSP_binding = pattern_InterfaceMember_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember,
				tModifier);
		if (result_pattern_InterfaceMember_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_12_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceMember_12_4_solveCSP_black = pattern_InterfaceMember_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceMember_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tInterface, mTypeToTType, mDefinition, mInterface,
						tMember, defToMember, tModifier };
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
		for (TAbstractType __DEC_tModifier_tModifier_528413 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tInterface.equals(__DEC_tModifier_tModifier_528413)) {
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
								_result.add(new Object[] { tInterface, tMember, tModifier, _edge_tModifier });
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
			InterfaceMember _this, Match match, TInterface tInterface, TMember tMember, TModifier tModifier) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tInterface, tMember, tModifier);
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
						_result.add(new Object[] { mModifier, mDefinition, mInterface, _edge_modifier });
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
			InterfaceMember _this, Match match, Modifier mModifier, MDefinition mDefinition,
			InterfaceDeclaration mInterface) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mModifier, mDefinition, mInterface);
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
		EObject _localVariable_0 = targetMatch.getObject("tInterface");
		EObject _localVariable_1 = sourceMatch.getObject("mModifier");
		EObject _localVariable_2 = sourceMatch.getObject("mDefinition");
		EObject _localVariable_3 = sourceMatch.getObject("mInterface");
		EObject _localVariable_4 = targetMatch.getObject("tMember");
		EObject _localVariable_5 = targetMatch.getObject("tModifier");
		EObject tmpTInterface = _localVariable_0;
		EObject tmpMModifier = _localVariable_1;
		EObject tmpMDefinition = _localVariable_2;
		EObject tmpMInterface = _localVariable_3;
		EObject tmpTMember = _localVariable_4;
		EObject tmpTModifier = _localVariable_5;
		if (tmpTInterface instanceof TInterface) {
			TInterface tInterface = (TInterface) tmpTInterface;
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (tmpMDefinition instanceof MDefinition) {
					MDefinition mDefinition = (MDefinition) tmpMDefinition;
					if (tmpMInterface instanceof InterfaceDeclaration) {
						InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
						if (tmpTMember instanceof TMember) {
							TMember tMember = (TMember) tmpTMember;
							if (tmpTModifier instanceof TModifier) {
								TModifier tModifier = (TModifier) tmpTModifier;
								return new Object[] { tInterface, mModifier, mDefinition, mInterface, tMember,
										tModifier, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_24_2_matchsrctrgcontext_blackBBBBBBBB(TInterface tInterface,
			Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			TModifier tModifier, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tInterface, mModifier, mDefinition, mInterface, tMember, tModifier, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding = pattern_InterfaceMember_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding != null) {
			TInterface tInterface = (TInterface) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[0];
			Modifier mModifier = (Modifier) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[1];
			MDefinition mDefinition = (MDefinition) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[2];
			InterfaceDeclaration mInterface = (InterfaceDeclaration) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[3];
			TMember tMember = (TMember) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[4];
			TModifier tModifier = (TModifier) result_pattern_InterfaceMember_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_InterfaceMember_24_2_matchsrctrgcontext_black = pattern_InterfaceMember_24_2_matchsrctrgcontext_blackBBBBBBBB(
					tInterface, mModifier, mDefinition, mInterface, tMember, tModifier, sourceMatch, targetMatch);
			if (result_pattern_InterfaceMember_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tInterface, mModifier, mDefinition, mInterface, tMember, tModifier, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_24_3_solvecsp_bindingFBBBBBBBBB(InterfaceMember _this,
			TInterface tInterface, Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface,
			TMember tMember, TModifier tModifier, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(tInterface, mModifier, mDefinition, mInterface, tMember,
				tModifier, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, tInterface, mModifier, mDefinition, mInterface, tMember, tModifier,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(InterfaceMember _this,
			TInterface tInterface, Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface,
			TMember tMember, TModifier tModifier, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InterfaceMember_24_3_solvecsp_binding = pattern_InterfaceMember_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, tInterface, mModifier, mDefinition, mInterface, tMember, tModifier, sourceMatch, targetMatch);
		if (result_pattern_InterfaceMember_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_24_3_solvecsp_binding[0];

			Object[] result_pattern_InterfaceMember_24_3_solvecsp_black = pattern_InterfaceMember_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InterfaceMember_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tInterface, mModifier, mDefinition, mInterface, tMember, tModifier,
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

	public static final Iterable<Object[]> pattern_InterfaceMember_24_5_matchcorrcontext_blackBFBBBFBB(
			TInterface tInterface, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tInterface, TypeToTAbstractType.class, "target")) {
				if (mInterface.equals(mTypeToTType.getSource())) {
					for (MDefinitionToTMember defToMember : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tMember, MDefinitionToTMember.class, "target")) {
						if (mDefinition.equals(defToMember.getSource())) {
							_result.add(new Object[] { tInterface, mTypeToTType, mDefinition, mInterface, tMember,
									defToMember, sourceMatch, targetMatch });
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

	public static final Object[] pattern_InterfaceMember_24_6_createcorrespondence_blackBBBBBBB(TInterface tInterface,
			Modifier mModifier, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			TModifier tModifier, CCMatch ccMatch) {
		return new Object[] { tInterface, mModifier, mDefinition, mInterface, tMember, tModifier, ccMatch };
	}

	public static final Object[] pattern_InterfaceMember_24_6_createcorrespondence_greenBFBB(Modifier mModifier,
			TModifier tModifier, CCMatch ccMatch) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		ccMatch.getCreateCorr().add(mModifierToTModifier);
		return new Object[] { mModifier, mModifierToTModifier, tModifier, ccMatch };
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

	public static final Object[] pattern_InterfaceMember_27_1_matchtggpattern_blackBBB(Modifier mModifier,
			MDefinition mDefinition, InterfaceDeclaration mInterface) {
		if (mModifier.equals(mDefinition.getModifier())) {
			if (mInterface.getBodyDeclarations().contains(mDefinition)) {
				return new Object[] { mModifier, mDefinition, mInterface };
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
		for (TAbstractType __DEC_tModifier_tModifier_919224 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TAbstractType.class, "tModifier")) {
			if (!tInterface.equals(__DEC_tModifier_tModifier_919224)) {
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

	public static final Object[] pattern_InterfaceMember_28_1_matchtggpattern_blackBBB(TInterface tInterface,
			TMember tMember, TModifier tModifier) {
		if (tInterface.getDefines().contains(tMember)) {
			if (tModifier.equals(tMember.getTModifier())) {
				if (pattern_InterfaceMember_28_1_matchtggpattern_black_nac_0BB(tModifier, tInterface) == null) {
					if (pattern_InterfaceMember_28_1_matchtggpattern_black_nac_1BB(tInterface, tModifier) == null) {
						return new Object[] { tInterface, tMember, tModifier };
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
			ModelgeneratorRuleResult ruleResult, TInterface tInterface) {
		if (ruleResult.getTargetObjects().contains(tInterface)) {
			return new Object[] { ruleResult, tInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TMember tMember) {
		if (ruleResult.getTargetObjects().contains(tMember)) {
			return new Object[] { ruleResult, tMember };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MDefinitionToTMember defToMember) {
		if (ruleResult.getCorrObjects().contains(defToMember)) {
			return new Object[] { ruleResult, defToMember };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mDefinition) {
		if (ruleResult.getSourceObjects().contains(mDefinition)) {
			return new Object[] { ruleResult, mDefinition };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration mInterface) {
		if (ruleResult.getSourceObjects().contains(mInterface)) {
			return new Object[] { ruleResult, mInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceMember_29_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList defToMemberList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpDefToMember : defToMemberList.getEntryObjects()) {
				if (tmpDefToMember instanceof MDefinitionToTMember) {
					MDefinitionToTMember defToMember = (MDefinitionToTMember) tmpDefToMember;
					TMember tMember = defToMember.getTarget();
					if (tMember != null) {
						BodyDeclaration tmpMDefinition = defToMember.getSource();
						if (tmpMDefinition instanceof MDefinition) {
							MDefinition mDefinition = (MDefinition) tmpMDefinition;
							TAbstractType tmpTInterface = tMember.getDefinedBy();
							if (tmpTInterface instanceof TInterface) {
								TInterface tInterface = (TInterface) tmpTInterface;
								AbstractTypeDeclaration tmpMInterface = mDefinition.getAbstractTypeDeclaration();
								if (tmpMInterface instanceof InterfaceDeclaration) {
									InterfaceDeclaration mInterface = (InterfaceDeclaration) tmpMInterface;
									if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											defToMember) == null) {
										if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_1BB(ruleResult,
												tMember) == null) {
											if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_3BB(ruleResult,
													mDefinition) == null) {
												if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_0BB(
														ruleResult, tInterface) == null) {
													if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_4BB(
															ruleResult, mInterface) == null) {
														for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
																.getOppositeReferenceTyped(tInterface,
																		TypeToTAbstractType.class, "target")) {
															if (mInterface.equals(mTypeToTType.getSource())) {
																if (pattern_InterfaceMember_29_2_isapplicablecore_black_nac_5BB(
																		ruleResult, mTypeToTType) == null) {
																	_result.add(new Object[] { defToMemberList,
																			tInterface, tMember, defToMember,
																			mDefinition, mInterface, mTypeToTType,
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
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_29_3_solveCSP_bindingFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TInterface tInterface, TypeToTAbstractType mTypeToTType,
			MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember, MDefinitionToTMember defToMember,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tInterface, mTypeToTType,
				mDefinition, mInterface, tMember, defToMember, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tInterface, mTypeToTType, mDefinition, mInterface,
					tMember, defToMember, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceMember_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceMember_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(InterfaceMember _this,
			IsApplicableMatch isApplicableMatch, TInterface tInterface, TypeToTAbstractType mTypeToTType,
			MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember, MDefinitionToTMember defToMember,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InterfaceMember_29_3_solveCSP_binding = pattern_InterfaceMember_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember,
				ruleResult);
		if (result_pattern_InterfaceMember_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceMember_29_3_solveCSP_binding[0];

			Object[] result_pattern_InterfaceMember_29_3_solveCSP_black = pattern_InterfaceMember_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceMember_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tInterface, mTypeToTType, mDefinition, mInterface,
						tMember, defToMember, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceMember_29_4_checkCSP_expressionFBB(InterfaceMember _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceMember_29_5_checknacs_blackBBBBBB(TInterface tInterface,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			MDefinitionToTMember defToMember) {
		return new Object[] { tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember };
	}

	public static final Object[] pattern_InterfaceMember_29_6_perform_blackBBBBBBB(TInterface tInterface,
			TypeToTAbstractType mTypeToTType, MDefinition mDefinition, InterfaceDeclaration mInterface, TMember tMember,
			MDefinitionToTMember defToMember, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { tInterface, mTypeToTType, mDefinition, mInterface, tMember, defToMember, ruleResult };
	}

	public static final Object[] pattern_InterfaceMember_29_6_perform_greenFBFBFBB(MDefinition mDefinition,
			TMember tMember, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		Object _localVariable_2 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_3 = csp.getValue("tModifier", "tVisibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		mDefinition.setModifier(mModifier);
		ruleResult.getSourceObjects().add(mModifier);
		mModifierToTModifier.setSource(mModifier);
		ruleResult.getCorrObjects().add(mModifierToTModifier);
		tMember.setTModifier(tModifier);
		mModifierToTModifier.setTarget(tModifier);
		ruleResult.getTargetObjects().add(tModifier);
		boolean mModifier_static_prime = (boolean) _localVariable_0;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_1;
		boolean tModifier_isStatic_prime = (boolean) _localVariable_2;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mModifier, mDefinition, mModifierToTModifier, tMember, tModifier, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_InterfaceMember_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InterfaceMemberImpl