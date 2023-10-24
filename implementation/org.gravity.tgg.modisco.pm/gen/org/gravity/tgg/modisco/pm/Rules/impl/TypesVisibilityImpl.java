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
import org.eclipse.modisco.java.Modifier;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.VisibilityKind;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.MModifierToTModifier;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.TypesVisibility;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
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
 * An implementation of the model object '<em><b>Types Visibility</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypesVisibilityImpl extends AbstractRuleImpl implements TypesVisibility {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesVisibilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypesVisibility();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Modifier mModifier, AbstractTypeDeclaration mType) {

		Object[] result1_black = TypesVisibilityImpl.pattern_TypesVisibility_0_1_initialbindings_blackBBBB(this, match,
				mModifier, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModifier] = " + mModifier + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = TypesVisibilityImpl
				.pattern_TypesVisibility_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mModifier, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModifier] = " + mModifier + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypesVisibilityImpl.pattern_TypesVisibility_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypesVisibilityImpl
					.pattern_TypesVisibility_0_4_collectelementstobetranslated_blackBBB(match, mModifier, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModifier] = " + mModifier + ", " + "[mType] = " + mType + ".");
			}
			TypesVisibilityImpl.pattern_TypesVisibility_0_4_collectelementstobetranslated_greenBBBFF(match, mModifier,
					mType);
			//nothing EMoflonEdge mType__mModifier____modifier = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mModifier__mType____bodyDeclaration = (EMoflonEdge) result4_green[4];

			Object[] result5_black = TypesVisibilityImpl
					.pattern_TypesVisibility_0_5_collectcontextelements_blackBBB(match, mModifier, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModifier] = " + mModifier + ", " + "[mType] = " + mType + ".");
			}
			TypesVisibilityImpl.pattern_TypesVisibility_0_5_collectcontextelements_greenBB(match, mType);

			// 
			TypesVisibilityImpl.pattern_TypesVisibility_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mModifier, mType);
			return TypesVisibilityImpl.pattern_TypesVisibility_0_7_expressionF();
		} else {
			return TypesVisibilityImpl.pattern_TypesVisibility_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypesVisibilityImpl
				.pattern_TypesVisibility_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		Modifier mModifier = (Modifier) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypesVisibilityImpl
				.pattern_TypesVisibility_1_1_performtransformation_greenFFBBB(mModifier, tType, csp);
		TModifier tModifier = (TModifier) result1_green[0];
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[1];

		Object[] result2_black = TypesVisibilityImpl.pattern_TypesVisibility_1_2_collecttranslatedelements_blackBBB(
				tModifier, mModifierToTModifier, mModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tModifier] = " + tModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[mModifier] = " + mModifier + ".");
		}
		Object[] result2_green = TypesVisibilityImpl.pattern_TypesVisibility_1_2_collecttranslatedelements_greenFBBB(
				tModifier, mModifierToTModifier, mModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypesVisibilityImpl.pattern_TypesVisibility_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mTypeToTType, tModifier, mModifierToTModifier, mModifier, tType, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tModifier] = " + tModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[mModifier] = " + mModifier + ", "
					+ "[tType] = " + tType + ", " + "[mType] = " + mType + ".");
		}
		TypesVisibilityImpl.pattern_TypesVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, tModifier,
				mModifierToTModifier, mModifier, tType, mType);
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mType__mModifier____modifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifier__mType____bodyDeclaration = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tType__tModifier____tModifier = (EMoflonEdge) result3_green[10];

		// 
		// 
		TypesVisibilityImpl.pattern_TypesVisibility_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mTypeToTType, tModifier, mModifierToTModifier, mModifier, tType, mType);
		return TypesVisibilityImpl.pattern_TypesVisibility_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypesVisibilityImpl
				.pattern_TypesVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypesVisibilityImpl
				.pattern_TypesVisibility_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypesVisibilityImpl.pattern_TypesVisibility_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Modifier mModifier = (Modifier) result2_binding[0];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : TypesVisibilityImpl.pattern_TypesVisibility_2_2_corematch_blackFBFBB(mModifier,
				mType, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[2];
			// ForEach 
			for (Object[] result3_black : TypesVisibilityImpl
					.pattern_TypesVisibility_2_3_findcontext_blackBBBB(mTypeToTType, mModifier, tType, mType)) {
				Object[] result3_green = TypesVisibilityImpl
						.pattern_TypesVisibility_2_3_findcontext_greenBBBBFFFFF(mTypeToTType, mModifier, tType, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge mType__mModifier____modifier = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mModifier__mType____bodyDeclaration = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = TypesVisibilityImpl
						.pattern_TypesVisibility_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mTypeToTType, mModifier, tType, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[mModifier] = " + mModifier + ", " + "[tType] = " + tType + ", " + "[mType] = "
							+ mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypesVisibilityImpl.pattern_TypesVisibility_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypesVisibilityImpl
							.pattern_TypesVisibility_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypesVisibilityImpl.pattern_TypesVisibility_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TypesVisibilityImpl.pattern_TypesVisibility_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Modifier mModifier, AbstractTypeDeclaration mType) {
		match.registerObject("mModifier", mModifier);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Modifier mModifier, AbstractTypeDeclaration mType) {// Create CSP
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
			Modifier mModifier, TAbstractType tType, AbstractTypeDeclaration mType) {// Create CSP
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
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("mModifier", mModifier);
		isApplicableMatch.registerObject("tType", tType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mTypeToTType, EObject tModifier,
			EObject mModifierToTModifier, EObject mModifier, EObject tType, EObject mType) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mType", mType);

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
	public boolean isAppropriate_BWD(Match match, TModifier tModifier, TAbstractType tType) {

		Object[] result1_black = TypesVisibilityImpl.pattern_TypesVisibility_10_1_initialbindings_blackBBBB(this, match,
				tModifier, tType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tModifier] = " + tModifier + ", " + "[tType] = " + tType + ".");
		}

		Object[] result2_bindingAndBlack = TypesVisibilityImpl
				.pattern_TypesVisibility_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tModifier, tType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tModifier] = " + tModifier + ", " + "[tType] = " + tType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypesVisibilityImpl.pattern_TypesVisibility_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypesVisibilityImpl
					.pattern_TypesVisibility_10_4_collectelementstobetranslated_blackBBB(match, tModifier, tType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tModifier] = " + tModifier + ", " + "[tType] = " + tType + ".");
			}
			TypesVisibilityImpl.pattern_TypesVisibility_10_4_collectelementstobetranslated_greenBBBF(match, tModifier,
					tType);
			//nothing EMoflonEdge tType__tModifier____tModifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypesVisibilityImpl
					.pattern_TypesVisibility_10_5_collectcontextelements_blackBBB(match, tModifier, tType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tModifier] = " + tModifier + ", " + "[tType] = " + tType + ".");
			}
			TypesVisibilityImpl.pattern_TypesVisibility_10_5_collectcontextelements_greenBB(match, tType);

			// 
			TypesVisibilityImpl.pattern_TypesVisibility_10_6_registerobjectstomatch_expressionBBBB(this, match,
					tModifier, tType);
			return TypesVisibilityImpl.pattern_TypesVisibility_10_7_expressionF();
		} else {
			return TypesVisibilityImpl.pattern_TypesVisibility_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypesVisibilityImpl
				.pattern_TypesVisibility_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[0];
		TModifier tModifier = (TModifier) result1_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result1_bindingAndBlack[2];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypesVisibilityImpl
				.pattern_TypesVisibility_11_1_performtransformation_greenBFFBB(tModifier, mType, csp);
		MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result1_green[1];
		Modifier mModifier = (Modifier) result1_green[2];

		Object[] result2_black = TypesVisibilityImpl.pattern_TypesVisibility_11_2_collecttranslatedelements_blackBBB(
				tModifier, mModifierToTModifier, mModifier);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tModifier] = " + tModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[mModifier] = " + mModifier + ".");
		}
		Object[] result2_green = TypesVisibilityImpl.pattern_TypesVisibility_11_2_collecttranslatedelements_greenFBBB(
				tModifier, mModifierToTModifier, mModifier);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypesVisibilityImpl.pattern_TypesVisibility_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mTypeToTType, tModifier, mModifierToTModifier, mModifier, tType, mType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tModifier] = " + tModifier + ", "
					+ "[mModifierToTModifier] = " + mModifierToTModifier + ", " + "[mModifier] = " + mModifier + ", "
					+ "[tType] = " + tType + ", " + "[mType] = " + mType + ".");
		}
		TypesVisibilityImpl.pattern_TypesVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, tModifier,
				mModifierToTModifier, mModifier, tType, mType);
		//nothing EMoflonEdge mModifierToTModifier__mModifier____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModifierToTModifier__tModifier____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mType__mModifier____modifier = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mModifier__mType____bodyDeclaration = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tType__tModifier____tModifier = (EMoflonEdge) result3_green[10];

		// 
		// 
		TypesVisibilityImpl.pattern_TypesVisibility_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mTypeToTType, tModifier, mModifierToTModifier, mModifier, tType, mType);
		return TypesVisibilityImpl.pattern_TypesVisibility_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypesVisibilityImpl
				.pattern_TypesVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypesVisibilityImpl
				.pattern_TypesVisibility_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypesVisibilityImpl.pattern_TypesVisibility_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TModifier tModifier = (TModifier) result2_binding[0];
		TAbstractType tType = (TAbstractType) result2_binding[1];
		for (Object[] result2_black : TypesVisibilityImpl.pattern_TypesVisibility_12_2_corematch_blackFBBFB(tModifier,
				tType, match)) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[3];
			// ForEach 
			for (Object[] result3_black : TypesVisibilityImpl
					.pattern_TypesVisibility_12_3_findcontext_blackBBBB(mTypeToTType, tModifier, tType, mType)) {
				Object[] result3_green = TypesVisibilityImpl
						.pattern_TypesVisibility_12_3_findcontext_greenBBBBFFFF(mTypeToTType, tModifier, tType, mType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge tType__tModifier____tModifier = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = TypesVisibilityImpl
						.pattern_TypesVisibility_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								mTypeToTType, tModifier, tType, mType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
							+ ", " + "[tModifier] = " + tModifier + ", " + "[tType] = " + tType + ", " + "[mType] = "
							+ mType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypesVisibilityImpl.pattern_TypesVisibility_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypesVisibilityImpl
							.pattern_TypesVisibility_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypesVisibilityImpl.pattern_TypesVisibility_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TypesVisibilityImpl.pattern_TypesVisibility_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TModifier tModifier, TAbstractType tType) {
		match.registerObject("tModifier", tModifier);
		match.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TModifier tModifier, TAbstractType tType) {// Create CSP
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
			TModifier tModifier, TAbstractType tType, AbstractTypeDeclaration mType) {// Create CSP
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
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tModifier", tModifier);
		isApplicableMatch.registerObject("tType", tType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mTypeToTType, EObject tModifier,
			EObject mModifierToTModifier, EObject mModifier, EObject tType, EObject mType) {
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tModifier", tModifier);
		ruleresult.registerObject("mModifierToTModifier", mModifierToTModifier);
		ruleresult.registerObject("mModifier", mModifier);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mType", mType);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_26(EMoflonEdge _edge_tModifier) {

		Object[] result1_bindingAndBlack = TypesVisibilityImpl
				.pattern_TypesVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypesVisibilityImpl.pattern_TypesVisibility_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypesVisibilityImpl
				.pattern_TypesVisibility_20_2_testcorematchandDECs_blackFFB(_edge_tModifier)) {
			TModifier tModifier = (TModifier) result2_black[0];
			TAbstractType tType = (TAbstractType) result2_black[1];
			Object[] result2_green = TypesVisibilityImpl
					.pattern_TypesVisibility_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypesVisibilityImpl
					.pattern_TypesVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							tModifier, tType)) {
				// 
				if (TypesVisibilityImpl
						.pattern_TypesVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TypesVisibilityImpl
							.pattern_TypesVisibility_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypesVisibilityImpl.pattern_TypesVisibility_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypesVisibilityImpl.pattern_TypesVisibility_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_28(EMoflonEdge _edge_modifier) {

		Object[] result1_bindingAndBlack = TypesVisibilityImpl
				.pattern_TypesVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypesVisibilityImpl.pattern_TypesVisibility_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypesVisibilityImpl
				.pattern_TypesVisibility_21_2_testcorematchandDECs_blackFFB(_edge_modifier)) {
			Modifier mModifier = (Modifier) result2_black[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = TypesVisibilityImpl
					.pattern_TypesVisibility_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypesVisibilityImpl
					.pattern_TypesVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this, match,
							mModifier, mType)) {
				// 
				if (TypesVisibilityImpl
						.pattern_TypesVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TypesVisibilityImpl
							.pattern_TypesVisibility_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypesVisibilityImpl.pattern_TypesVisibility_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypesVisibilityImpl.pattern_TypesVisibility_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypesVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		DefaultVisibility defaultVisibility1 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility1);

		eq0.setRuleName("TypesVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("TypesVisibility");
		defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tModifier_isStatic.setBound(false);
			var_tModifier_tVisibility.setBound(false);
			eq0.solve(var_mModifier_static, var_tModifier_isStatic);
			defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);
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
		ruleResult.setRule("TypesVisibility");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_tModifier_isStatic = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_isStatic.setValue(__helper.getValue("tModifier", "isStatic"));
		var_tModifier_isStatic.setType("boolean");

		Variable var_mModifier_static = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_static.setValue(__helper.getValue("mModifier", "static"));
		var_mModifier_static.setType("boolean");

		Variable var_mModifier_visibility = CSPFactoryHelper.eINSTANCE.createVariable("mModifier", true, csp);
		var_mModifier_visibility.setValue(__helper.getValue("mModifier", "visibility"));
		var_mModifier_visibility.setType("java.VisibilityKind");

		Variable var_tModifier_tVisibility = CSPFactoryHelper.eINSTANCE.createVariable("tModifier", true, csp);
		var_tModifier_tVisibility.setValue(__helper.getValue("tModifier", "tVisibility"));
		var_tModifier_tVisibility.setType("basic.TVisibility");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		DefaultVisibility defaultVisibility1 = new DefaultVisibility();
		csp.getConstraints().add(defaultVisibility1);

		eq0.setRuleName("TypesVisibility");
		eq0.solve(var_mModifier_static, var_tModifier_isStatic);

		defaultVisibility1.setRuleName("TypesVisibility");
		defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mModifier_static.setBound(false);
			var_mModifier_visibility.setBound(false);
			eq0.solve(var_mModifier_static, var_tModifier_isStatic);
			defaultVisibility1.solve(var_mModifier_visibility, var_tModifier_tVisibility);
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

		Object[] result1_black = TypesVisibilityImpl.pattern_TypesVisibility_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypesVisibilityImpl.pattern_TypesVisibility_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypesVisibilityImpl
				.pattern_TypesVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TModifier tModifier = (TModifier) result2_bindingAndBlack[0];
		Modifier mModifier = (Modifier) result2_bindingAndBlack[1];
		TAbstractType tType = (TAbstractType) result2_bindingAndBlack[2];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = TypesVisibilityImpl
				.pattern_TypesVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, tModifier, mModifier, tType, mType,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tModifier] = " + tModifier + ", " + "[mModifier] = " + mModifier + ", " + "[tType] = " + tType
					+ ", " + "[mType] = " + mType + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypesVisibilityImpl.pattern_TypesVisibility_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypesVisibilityImpl
					.pattern_TypesVisibility_24_5_matchcorrcontext_blackFBBBB(tType, mType, sourceMatch, targetMatch)) {
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[0];
				Object[] result5_green = TypesVisibilityImpl.pattern_TypesVisibility_24_5_matchcorrcontext_greenBBBF(
						mTypeToTType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = TypesVisibilityImpl
						.pattern_TypesVisibility_24_6_createcorrespondence_blackBBBBB(tModifier, mModifier, tType,
								mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tModifier] = "
							+ tModifier + ", " + "[mModifier] = " + mModifier + ", " + "[tType] = " + tType + ", "
							+ "[mType] = " + mType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypesVisibilityImpl.pattern_TypesVisibility_24_6_createcorrespondence_greenBFBB(tModifier, mModifier,
						ccMatch);
				//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[1];

				Object[] result7_black = TypesVisibilityImpl
						.pattern_TypesVisibility_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypesVisibilityImpl.pattern_TypesVisibility_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return TypesVisibilityImpl.pattern_TypesVisibility_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TModifier tModifier, Modifier mModifier, TAbstractType tType,
			AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {// Create CSP
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
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);
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
	public boolean checkDEC_FWD(Modifier mModifier, AbstractTypeDeclaration mType) {// 
		Object[] result1_black = TypesVisibilityImpl.pattern_TypesVisibility_27_1_matchtggpattern_blackBB(mModifier,
				mType);
		if (result1_black != null) {
			return TypesVisibilityImpl.pattern_TypesVisibility_27_2_expressionF();
		} else {
			return TypesVisibilityImpl.pattern_TypesVisibility_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TModifier tModifier, TAbstractType tType) {// 
		Object[] result1_black = TypesVisibilityImpl.pattern_TypesVisibility_28_1_matchtggpattern_blackBB(tModifier,
				tType);
		if (result1_black != null) {
			return TypesVisibilityImpl.pattern_TypesVisibility_28_2_expressionF();
		} else {
			return TypesVisibilityImpl.pattern_TypesVisibility_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter) {

		Object[] result1_black = TypesVisibilityImpl.pattern_TypesVisibility_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypesVisibilityImpl.pattern_TypesVisibility_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypesVisibilityImpl
				.pattern_TypesVisibility_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[1];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[2];
			TAbstractType tType = (TAbstractType) result2_black[3];

			Object[] result3_bindingAndBlack = TypesVisibilityImpl
					.pattern_TypesVisibility_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, mTypeToTType,
							tType, mType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mTypeToTType] = " + mTypeToTType
						+ ", " + "[tType] = " + tType + ", " + "[mType] = " + mType + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypesVisibilityImpl.pattern_TypesVisibility_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypesVisibilityImpl
						.pattern_TypesVisibility_29_5_checknacs_blackBBB(mTypeToTType, tType, mType);
				if (result5_black != null) {

					Object[] result6_black = TypesVisibilityImpl
							.pattern_TypesVisibility_29_6_perform_blackBBBB(mTypeToTType, tType, mType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mTypeToTType] = "
								+ mTypeToTType + ", " + "[tType] = " + tType + ", " + "[mType] = " + mType + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					TypesVisibilityImpl.pattern_TypesVisibility_29_6_perform_greenFFFBBBB(tType, mType, ruleResult,
							csp);
					//nothing TModifier tModifier = (TModifier) result6_green[0];
					//nothing MModifierToTModifier mModifierToTModifier = (MModifierToTModifier) result6_green[1];
					//nothing Modifier mModifier = (Modifier) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return TypesVisibilityImpl.pattern_TypesVisibility_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType,
			TAbstractType tType, AbstractTypeDeclaration mType, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		DefaultVisibility defaultVisibility = new DefaultVisibility();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(defaultVisibility);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mModifier_static, var_tModifier_isStatic);
		defaultVisibility.setRuleName("NoRuleName");
		defaultVisibility.solve(var_mModifier_visibility, var_tModifier_tVisibility);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
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
		case RulesPackage.TYPES_VISIBILITY___IS_APPROPRIATE_FWD__MATCH_MODIFIER_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.TYPES_VISIBILITY___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODIFIER_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.TYPES_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODIFIER_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Modifier) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.TYPES_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MODIFIER_TABSTRACTTYPE_ABSTRACTTYPEDECLARATION:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (Modifier) arguments.get(2),
					(TAbstractType) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4));
		case RulesPackage.TYPES_VISIBILITY___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TYPES_VISIBILITY___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___IS_APPROPRIATE_BWD__MATCH_TMODIFIER_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TModifier) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.TYPES_VISIBILITY___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMODIFIER_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TModifier) arguments.get(1),
					(TAbstractType) arguments.get(2));
			return null;
		case RulesPackage.TYPES_VISIBILITY___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMODIFIER_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TModifier) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.TYPES_VISIBILITY___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TMODIFIER_TABSTRACTTYPE_ABSTRACTTYPEDECLARATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TModifier) arguments.get(2),
					(TAbstractType) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4));
		case RulesPackage.TYPES_VISIBILITY___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TYPES_VISIBILITY___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___IS_APPROPRIATE_BWD_EMOFLON_EDGE_26__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_26((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___IS_APPROPRIATE_FWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_28((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPES_VISIBILITY___IS_APPLICABLE_SOLVE_CSP_CC__TMODIFIER_MODIFIER_TABSTRACTTYPE_ABSTRACTTYPEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TModifier) arguments.get(0), (Modifier) arguments.get(1),
					(TAbstractType) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.TYPES_VISIBILITY___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPES_VISIBILITY___CHECK_DEC_FWD__MODIFIER_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((Modifier) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.TYPES_VISIBILITY___CHECK_DEC_BWD__TMODIFIER_TABSTRACTTYPE:
			return checkDEC_BWD((TModifier) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.TYPES_VISIBILITY___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.TYPES_VISIBILITY___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_TABSTRACTTYPE_ABSTRACTTYPEDECLARATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (TAbstractType) arguments.get(2),
					(AbstractTypeDeclaration) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.TYPES_VISIBILITY___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypesVisibility_0_1_initialbindings_blackBBBB(TypesVisibility _this,
			Match match, Modifier mModifier, AbstractTypeDeclaration mType) {
		return new Object[] { _this, match, mModifier, mType };
	}

	public static final Object[] pattern_TypesVisibility_0_2_SolveCSP_bindingFBBBB(TypesVisibility _this, Match match,
			Modifier mModifier, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mModifier, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mModifier, mType };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesVisibility_0_2_SolveCSP_bindingAndBlackFBBBB(TypesVisibility _this,
			Match match, Modifier mModifier, AbstractTypeDeclaration mType) {
		Object[] result_pattern_TypesVisibility_0_2_SolveCSP_binding = pattern_TypesVisibility_0_2_SolveCSP_bindingFBBBB(
				_this, match, mModifier, mType);
		if (result_pattern_TypesVisibility_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesVisibility_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypesVisibility_0_2_SolveCSP_black = pattern_TypesVisibility_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypesVisibility_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mModifier, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesVisibility_0_3_CheckCSP_expressionFBB(TypesVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_0_4_collectelementstobetranslated_blackBBB(Match match,
			Modifier mModifier, AbstractTypeDeclaration mType) {
		return new Object[] { match, mModifier, mType };
	}

	public static final Object[] pattern_TypesVisibility_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			Modifier mModifier, AbstractTypeDeclaration mType) {
		EMoflonEdge mType__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mType____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mModifier);
		String mType__mModifier____modifier_name_prime = "modifier";
		String mModifier__mType____bodyDeclaration_name_prime = "bodyDeclaration";
		mType__mModifier____modifier.setSrc(mType);
		mType__mModifier____modifier.setTrg(mModifier);
		match.getToBeTranslatedEdges().add(mType__mModifier____modifier);
		mModifier__mType____bodyDeclaration.setSrc(mModifier);
		mModifier__mType____bodyDeclaration.setTrg(mType);
		match.getToBeTranslatedEdges().add(mModifier__mType____bodyDeclaration);
		mType__mModifier____modifier.setName(mType__mModifier____modifier_name_prime);
		mModifier__mType____bodyDeclaration.setName(mModifier__mType____bodyDeclaration_name_prime);
		return new Object[] { match, mModifier, mType, mType__mModifier____modifier,
				mModifier__mType____bodyDeclaration };
	}

	public static final Object[] pattern_TypesVisibility_0_5_collectcontextelements_blackBBB(Match match,
			Modifier mModifier, AbstractTypeDeclaration mType) {
		return new Object[] { match, mModifier, mType };
	}

	public static final Object[] pattern_TypesVisibility_0_5_collectcontextelements_greenBB(Match match,
			AbstractTypeDeclaration mType) {
		match.getContextNodes().add(mType);
		return new Object[] { match, mType };
	}

	public static final void pattern_TypesVisibility_0_6_registerobjectstomatch_expressionBBBB(TypesVisibility _this,
			Match match, Modifier mModifier, AbstractTypeDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mModifier, mType);

	}

	public static final boolean pattern_TypesVisibility_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesVisibility_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mModifier");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mType");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpMModifier = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						return new Object[] { mTypeToTType, mModifier, tType, mType, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_1_1_performtransformation_blackBBBBFBB(
			TypeToTAbstractType mTypeToTType, Modifier mModifier, TAbstractType tType, AbstractTypeDeclaration mType,
			TypesVisibility _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, mModifier, tType, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_1_1_performtransformation_bindingAndBlackFFFFFBB(
			TypesVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypesVisibility_1_1_performtransformation_binding = pattern_TypesVisibility_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypesVisibility_1_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_TypesVisibility_1_1_performtransformation_binding[0];
			Modifier mModifier = (Modifier) result_pattern_TypesVisibility_1_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_TypesVisibility_1_1_performtransformation_binding[2];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_TypesVisibility_1_1_performtransformation_binding[3];

			Object[] result_pattern_TypesVisibility_1_1_performtransformation_black = pattern_TypesVisibility_1_1_performtransformation_blackBBBBFBB(
					mTypeToTType, mModifier, tType, mType, _this, isApplicableMatch);
			if (result_pattern_TypesVisibility_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypesVisibility_1_1_performtransformation_black[4];

				return new Object[] { mTypeToTType, mModifier, tType, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_1_1_performtransformation_greenFFBBB(Modifier mModifier,
			TAbstractType tType, CSP csp) {
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Object _localVariable_0 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_1 = csp.getValue("tModifier", "tVisibility");
		tType.setTModifier(tModifier);
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		boolean tModifier_isStatic_prime = (boolean) _localVariable_0;
		TVisibility tModifier_tVisibility_prime = (TVisibility) _localVariable_1;
		tModifier.setIsStatic(Boolean.valueOf(tModifier_isStatic_prime));
		tModifier.setTVisibility(tModifier_tVisibility_prime);
		return new Object[] { tModifier, mModifierToTModifier, mModifier, tType, csp };
	}

	public static final Object[] pattern_TypesVisibility_1_2_collecttranslatedelements_blackBBB(TModifier tModifier,
			MModifierToTModifier mModifierToTModifier, Modifier mModifier) {
		return new Object[] { tModifier, mModifierToTModifier, mModifier };
	}

	public static final Object[] pattern_TypesVisibility_1_2_collecttranslatedelements_greenFBBB(TModifier tModifier,
			MModifierToTModifier mModifierToTModifier, Modifier mModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getTranslatedElements().add(mModifier);
		return new Object[] { ruleresult, tModifier, mModifierToTModifier, mModifier };
	}

	public static final Object[] pattern_TypesVisibility_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject tModifier, EObject mModifierToTModifier,
			EObject mModifier, EObject tType, EObject mType) {
		if (!mTypeToTType.equals(tModifier)) {
			if (!mTypeToTType.equals(tType)) {
				if (!tModifier.equals(tType)) {
					if (!mModifierToTModifier.equals(mTypeToTType)) {
						if (!mModifierToTModifier.equals(tModifier)) {
							if (!mModifierToTModifier.equals(tType)) {
								if (!mModifierToTModifier.equals(mType)) {
									if (!mModifier.equals(mTypeToTType)) {
										if (!mModifier.equals(tModifier)) {
											if (!mModifier.equals(mModifierToTModifier)) {
												if (!mModifier.equals(tType)) {
													if (!mModifier.equals(mType)) {
														if (!mType.equals(mTypeToTType)) {
															if (!mType.equals(tModifier)) {
																if (!mType.equals(tType)) {
																	return new Object[] { ruleresult, mTypeToTType,
																			tModifier, mModifierToTModifier, mModifier,
																			tType, mType };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypesVisibility_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tModifier, EObject mModifierToTModifier, EObject mModifier,
			EObject tType, EObject mType) {
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mType____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypesVisibility";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String mType__mModifier____modifier_name_prime = "modifier";
		String mModifier__mType____bodyDeclaration_name_prime = "bodyDeclaration";
		String tType__tModifier____tModifier_name_prime = "tModifier";
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		mType__mModifier____modifier.setSrc(mType);
		mType__mModifier____modifier.setTrg(mModifier);
		ruleresult.getTranslatedEdges().add(mType__mModifier____modifier);
		mModifier__mType____bodyDeclaration.setSrc(mModifier);
		mModifier__mType____bodyDeclaration.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mModifier__mType____bodyDeclaration);
		tType__tModifier____tModifier.setSrc(tType);
		tType__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(tType__tModifier____tModifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		mType__mModifier____modifier.setName(mType__mModifier____modifier_name_prime);
		mModifier__mType____bodyDeclaration.setName(mModifier__mType____bodyDeclaration_name_prime);
		tType__tModifier____tModifier.setName(tType__tModifier____tModifier_name_prime);
		return new Object[] { ruleresult, tModifier, mModifierToTModifier, mModifier, tType, mType,
				mModifierToTModifier__mModifier____source, mModifierToTModifier__tModifier____target,
				mType__mModifier____modifier, mModifier__mType____bodyDeclaration, tType__tModifier____tModifier };
	}

	public static final void pattern_TypesVisibility_1_5_registerobjects_expressionBBBBBBBB(TypesVisibility _this,
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject tModifier, EObject mModifierToTModifier,
			EObject mModifier, EObject tType, EObject mType) {
		_this.registerObjects_FWD(ruleresult, mTypeToTType, tModifier, mModifierToTModifier, mModifier, tType, mType);

	}

	public static final PerformRuleResult pattern_TypesVisibility_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_2_1_preparereturnvalue_bindingFB(TypesVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypesVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_2_1_preparereturnvalue_bindingAndBlackFFB(
			TypesVisibility _this) {
		Object[] result_pattern_TypesVisibility_2_1_preparereturnvalue_binding = pattern_TypesVisibility_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesVisibility_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypesVisibility_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesVisibility_2_1_preparereturnvalue_black = pattern_TypesVisibility_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypesVisibility_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypesVisibility_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypesVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypesVisibility_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mModifier");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMModifier = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMModifier instanceof Modifier) {
			Modifier mModifier = (Modifier) tmpMModifier;
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				return new Object[] { mModifier, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesVisibility_2_2_corematch_blackFBFBB(Modifier mModifier,
			AbstractTypeDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
			TAbstractType tType = mTypeToTType.getTarget();
			if (tType != null) {
				_result.add(new Object[] { mTypeToTType, mModifier, tType, mType, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesVisibility_2_3_findcontext_blackBBBB(
			TypeToTAbstractType mTypeToTType, Modifier mModifier, TAbstractType tType, AbstractTypeDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModifier.equals(mType.getModifier())) {
			if (mType.equals(mTypeToTType.getSource())) {
				if (tType.equals(mTypeToTType.getTarget())) {
					_result.add(new Object[] { mTypeToTType, mModifier, tType, mType });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_2_3_findcontext_greenBBBBFFFFF(
			TypeToTAbstractType mTypeToTType, Modifier mModifier, TAbstractType tType, AbstractTypeDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mType__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mType____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mType__mModifier____modifier_name_prime = "modifier";
		String mModifier__mType____bodyDeclaration_name_prime = "bodyDeclaration";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(mModifier);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mType);
		mType__mModifier____modifier.setSrc(mType);
		mType__mModifier____modifier.setTrg(mModifier);
		isApplicableMatch.getAllContextElements().add(mType__mModifier____modifier);
		mModifier__mType____bodyDeclaration.setSrc(mModifier);
		mModifier__mType____bodyDeclaration.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mModifier__mType____bodyDeclaration);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mType__mModifier____modifier.setName(mType__mModifier____modifier_name_prime);
		mModifier__mType____bodyDeclaration.setName(mModifier__mType____bodyDeclaration_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { mTypeToTType, mModifier, tType, mType, isApplicableMatch, mType__mModifier____modifier,
				mModifier__mType____bodyDeclaration, mTypeToTType__mType____source, mTypeToTType__tType____target };
	}

	public static final Object[] pattern_TypesVisibility_2_4_solveCSP_bindingFBBBBBB(TypesVisibility _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, Modifier mModifier,
			TAbstractType tType, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mTypeToTType, mModifier, tType,
				mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mModifier, tType, mType };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesVisibility_2_4_solveCSP_bindingAndBlackFBBBBBB(TypesVisibility _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, Modifier mModifier,
			TAbstractType tType, AbstractTypeDeclaration mType) {
		Object[] result_pattern_TypesVisibility_2_4_solveCSP_binding = pattern_TypesVisibility_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mTypeToTType, mModifier, tType, mType);
		if (result_pattern_TypesVisibility_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesVisibility_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypesVisibility_2_4_solveCSP_black = pattern_TypesVisibility_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypesVisibility_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, mModifier, tType, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesVisibility_2_5_checkCSP_expressionFBB(TypesVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypesVisibility_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypesVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypesVisibility_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_10_1_initialbindings_blackBBBB(TypesVisibility _this,
			Match match, TModifier tModifier, TAbstractType tType) {
		return new Object[] { _this, match, tModifier, tType };
	}

	public static final Object[] pattern_TypesVisibility_10_2_SolveCSP_bindingFBBBB(TypesVisibility _this, Match match,
			TModifier tModifier, TAbstractType tType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tModifier, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tModifier, tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesVisibility_10_2_SolveCSP_bindingAndBlackFBBBB(TypesVisibility _this,
			Match match, TModifier tModifier, TAbstractType tType) {
		Object[] result_pattern_TypesVisibility_10_2_SolveCSP_binding = pattern_TypesVisibility_10_2_SolveCSP_bindingFBBBB(
				_this, match, tModifier, tType);
		if (result_pattern_TypesVisibility_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesVisibility_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypesVisibility_10_2_SolveCSP_black = pattern_TypesVisibility_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_TypesVisibility_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tModifier, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesVisibility_10_3_CheckCSP_expressionFBB(TypesVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_10_4_collectelementstobetranslated_blackBBB(Match match,
			TModifier tModifier, TAbstractType tType) {
		return new Object[] { match, tModifier, tType };
	}

	public static final Object[] pattern_TypesVisibility_10_4_collectelementstobetranslated_greenBBBF(Match match,
			TModifier tModifier, TAbstractType tType) {
		EMoflonEdge tType__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tModifier);
		String tType__tModifier____tModifier_name_prime = "tModifier";
		tType__tModifier____tModifier.setSrc(tType);
		tType__tModifier____tModifier.setTrg(tModifier);
		match.getToBeTranslatedEdges().add(tType__tModifier____tModifier);
		tType__tModifier____tModifier.setName(tType__tModifier____tModifier_name_prime);
		return new Object[] { match, tModifier, tType, tType__tModifier____tModifier };
	}

	public static final Object[] pattern_TypesVisibility_10_5_collectcontextelements_blackBBB(Match match,
			TModifier tModifier, TAbstractType tType) {
		return new Object[] { match, tModifier, tType };
	}

	public static final Object[] pattern_TypesVisibility_10_5_collectcontextelements_greenBB(Match match,
			TAbstractType tType) {
		match.getContextNodes().add(tType);
		return new Object[] { match, tType };
	}

	public static final void pattern_TypesVisibility_10_6_registerobjectstomatch_expressionBBBB(TypesVisibility _this,
			Match match, TModifier tModifier, TAbstractType tType) {
		_this.registerObjectsToMatch_BWD(match, tModifier, tType);

	}

	public static final boolean pattern_TypesVisibility_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesVisibility_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tModifier");
		EObject _localVariable_2 = isApplicableMatch.getObject("tType");
		EObject _localVariable_3 = isApplicableMatch.getObject("mType");
		EObject tmpMTypeToTType = _localVariable_0;
		EObject tmpTModifier = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		if (tmpMTypeToTType instanceof TypeToTAbstractType) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						return new Object[] { mTypeToTType, tModifier, tType, mType, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_11_1_performtransformation_blackBBBBFBB(
			TypeToTAbstractType mTypeToTType, TModifier tModifier, TAbstractType tType, AbstractTypeDeclaration mType,
			TypesVisibility _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mTypeToTType, tModifier, tType, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_11_1_performtransformation_bindingAndBlackFFFFFBB(
			TypesVisibility _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypesVisibility_11_1_performtransformation_binding = pattern_TypesVisibility_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypesVisibility_11_1_performtransformation_binding != null) {
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_TypesVisibility_11_1_performtransformation_binding[0];
			TModifier tModifier = (TModifier) result_pattern_TypesVisibility_11_1_performtransformation_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_TypesVisibility_11_1_performtransformation_binding[2];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_TypesVisibility_11_1_performtransformation_binding[3];

			Object[] result_pattern_TypesVisibility_11_1_performtransformation_black = pattern_TypesVisibility_11_1_performtransformation_blackBBBBFBB(
					mTypeToTType, tModifier, tType, mType, _this, isApplicableMatch);
			if (result_pattern_TypesVisibility_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypesVisibility_11_1_performtransformation_black[4];

				return new Object[] { mTypeToTType, tModifier, tType, mType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_11_1_performtransformation_greenBFFBB(TModifier tModifier,
			AbstractTypeDeclaration mType, CSP csp) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("mModifier", "static");
		Object _localVariable_1 = csp.getValue("mModifier", "visibility");
		mModifierToTModifier.setTarget(tModifier);
		mModifierToTModifier.setSource(mModifier);
		mType.setModifier(mModifier);
		boolean mModifier_static_prime = (boolean) _localVariable_0;
		VisibilityKind mModifier_visibility_prime = (VisibilityKind) _localVariable_1;
		mModifier.setStatic(Boolean.valueOf(mModifier_static_prime));
		mModifier.setVisibility(mModifier_visibility_prime);
		return new Object[] { tModifier, mModifierToTModifier, mModifier, mType, csp };
	}

	public static final Object[] pattern_TypesVisibility_11_2_collecttranslatedelements_blackBBB(TModifier tModifier,
			MModifierToTModifier mModifierToTModifier, Modifier mModifier) {
		return new Object[] { tModifier, mModifierToTModifier, mModifier };
	}

	public static final Object[] pattern_TypesVisibility_11_2_collecttranslatedelements_greenFBBB(TModifier tModifier,
			MModifierToTModifier mModifierToTModifier, Modifier mModifier) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tModifier);
		ruleresult.getCreatedLinkElements().add(mModifierToTModifier);
		ruleresult.getCreatedElements().add(mModifier);
		return new Object[] { ruleresult, tModifier, mModifierToTModifier, mModifier };
	}

	public static final Object[] pattern_TypesVisibility_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject tModifier, EObject mModifierToTModifier,
			EObject mModifier, EObject tType, EObject mType) {
		if (!mTypeToTType.equals(tModifier)) {
			if (!mTypeToTType.equals(tType)) {
				if (!tModifier.equals(tType)) {
					if (!mModifierToTModifier.equals(mTypeToTType)) {
						if (!mModifierToTModifier.equals(tModifier)) {
							if (!mModifierToTModifier.equals(tType)) {
								if (!mModifierToTModifier.equals(mType)) {
									if (!mModifier.equals(mTypeToTType)) {
										if (!mModifier.equals(tModifier)) {
											if (!mModifier.equals(mModifierToTModifier)) {
												if (!mModifier.equals(tType)) {
													if (!mModifier.equals(mType)) {
														if (!mType.equals(mTypeToTType)) {
															if (!mType.equals(tModifier)) {
																if (!mType.equals(tType)) {
																	return new Object[] { ruleresult, mTypeToTType,
																			tModifier, mModifierToTModifier, mModifier,
																			tType, mType };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypesVisibility_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject tModifier, EObject mModifierToTModifier, EObject mModifier,
			EObject tType, EObject mType) {
		EMoflonEdge mModifierToTModifier__mModifier____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifierToTModifier__tModifier____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mType__mModifier____modifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModifier__mType____bodyDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypesVisibility";
		String mModifierToTModifier__mModifier____source_name_prime = "source";
		String mModifierToTModifier__tModifier____target_name_prime = "target";
		String mType__mModifier____modifier_name_prime = "modifier";
		String mModifier__mType____bodyDeclaration_name_prime = "bodyDeclaration";
		String tType__tModifier____tModifier_name_prime = "tModifier";
		mModifierToTModifier__mModifier____source.setSrc(mModifierToTModifier);
		mModifierToTModifier__mModifier____source.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__mModifier____source);
		mModifierToTModifier__tModifier____target.setSrc(mModifierToTModifier);
		mModifierToTModifier__tModifier____target.setTrg(tModifier);
		ruleresult.getCreatedEdges().add(mModifierToTModifier__tModifier____target);
		mType__mModifier____modifier.setSrc(mType);
		mType__mModifier____modifier.setTrg(mModifier);
		ruleresult.getCreatedEdges().add(mType__mModifier____modifier);
		mModifier__mType____bodyDeclaration.setSrc(mModifier);
		mModifier__mType____bodyDeclaration.setTrg(mType);
		ruleresult.getCreatedEdges().add(mModifier__mType____bodyDeclaration);
		tType__tModifier____tModifier.setSrc(tType);
		tType__tModifier____tModifier.setTrg(tModifier);
		ruleresult.getTranslatedEdges().add(tType__tModifier____tModifier);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mModifierToTModifier__mModifier____source.setName(mModifierToTModifier__mModifier____source_name_prime);
		mModifierToTModifier__tModifier____target.setName(mModifierToTModifier__tModifier____target_name_prime);
		mType__mModifier____modifier.setName(mType__mModifier____modifier_name_prime);
		mModifier__mType____bodyDeclaration.setName(mModifier__mType____bodyDeclaration_name_prime);
		tType__tModifier____tModifier.setName(tType__tModifier____tModifier_name_prime);
		return new Object[] { ruleresult, tModifier, mModifierToTModifier, mModifier, tType, mType,
				mModifierToTModifier__mModifier____source, mModifierToTModifier__tModifier____target,
				mType__mModifier____modifier, mModifier__mType____bodyDeclaration, tType__tModifier____tModifier };
	}

	public static final void pattern_TypesVisibility_11_5_registerobjects_expressionBBBBBBBB(TypesVisibility _this,
			PerformRuleResult ruleresult, EObject mTypeToTType, EObject tModifier, EObject mModifierToTModifier,
			EObject mModifier, EObject tType, EObject mType) {
		_this.registerObjects_BWD(ruleresult, mTypeToTType, tModifier, mModifierToTModifier, mModifier, tType, mType);

	}

	public static final PerformRuleResult pattern_TypesVisibility_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_12_1_preparereturnvalue_bindingFB(TypesVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypesVisibility _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_12_1_preparereturnvalue_bindingAndBlackFFB(
			TypesVisibility _this) {
		Object[] result_pattern_TypesVisibility_12_1_preparereturnvalue_binding = pattern_TypesVisibility_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesVisibility_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypesVisibility_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesVisibility_12_1_preparereturnvalue_black = pattern_TypesVisibility_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypesVisibility_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypesVisibility_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypesVisibility";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypesVisibility_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tModifier");
		EObject _localVariable_1 = match.getObject("tType");
		EObject tmpTModifier = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		if (tmpTModifier instanceof TModifier) {
			TModifier tModifier = (TModifier) tmpTModifier;
			if (tmpTType instanceof TAbstractType) {
				TAbstractType tType = (TAbstractType) tmpTType;
				return new Object[] { tModifier, tType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesVisibility_12_2_corematch_blackFBBFB(TModifier tModifier,
			TAbstractType tType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
			Type tmpMType = mTypeToTType.getSource();
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				_result.add(new Object[] { mTypeToTType, tModifier, tType, mType, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesVisibility_12_3_findcontext_blackBBBB(
			TypeToTAbstractType mTypeToTType, TModifier tModifier, TAbstractType tType, AbstractTypeDeclaration mType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (tModifier.equals(tType.getTModifier())) {
			if (mType.equals(mTypeToTType.getSource())) {
				if (tType.equals(mTypeToTType.getTarget())) {
					_result.add(new Object[] { mTypeToTType, tModifier, tType, mType });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_12_3_findcontext_greenBBBBFFFF(
			TypeToTAbstractType mTypeToTType, TModifier tModifier, TAbstractType tType, AbstractTypeDeclaration mType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge tType__tModifier____tModifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tType__tModifier____tModifier_name_prime = "tModifier";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tModifier);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(mType);
		tType__tModifier____tModifier.setSrc(tType);
		tType__tModifier____tModifier.setTrg(tModifier);
		isApplicableMatch.getAllContextElements().add(tType__tModifier____tModifier);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		tType__tModifier____tModifier.setName(tType__tModifier____tModifier_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { mTypeToTType, tModifier, tType, mType, isApplicableMatch, tType__tModifier____tModifier,
				mTypeToTType__mType____source, mTypeToTType__tType____target };
	}

	public static final Object[] pattern_TypesVisibility_12_4_solveCSP_bindingFBBBBBB(TypesVisibility _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TModifier tModifier,
			TAbstractType tType, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mTypeToTType, tModifier, tType,
				mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tModifier, tType, mType };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesVisibility_12_4_solveCSP_bindingAndBlackFBBBBBB(TypesVisibility _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TModifier tModifier,
			TAbstractType tType, AbstractTypeDeclaration mType) {
		Object[] result_pattern_TypesVisibility_12_4_solveCSP_binding = pattern_TypesVisibility_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tModifier, tType, mType);
		if (result_pattern_TypesVisibility_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesVisibility_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypesVisibility_12_4_solveCSP_black = pattern_TypesVisibility_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_TypesVisibility_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tModifier, tType, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesVisibility_12_5_checkCSP_expressionFBB(TypesVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypesVisibility_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypesVisibility";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypesVisibility_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_20_1_preparereturnvalue_bindingFB(TypesVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypesVisibility _this) {
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

	public static final Object[] pattern_TypesVisibility_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypesVisibility _this) {
		Object[] result_pattern_TypesVisibility_20_1_preparereturnvalue_binding = pattern_TypesVisibility_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesVisibility_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypesVisibility_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesVisibility_20_1_preparereturnvalue_black = pattern_TypesVisibility_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypesVisibility_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypesVisibility_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypesVisibility_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypesVisibility_20_2_testcorematchandDECs_black_nac_0B(TModifier tModifier) {
		for (TMember __DEC_tModifier_tModifier_874671 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TMember.class, "tModifier")) {
			return new Object[] { tModifier };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesVisibility_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_tModifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTType = _edge_tModifier.getSrc();
		if (tmpTType instanceof TAbstractType) {
			TAbstractType tType = (TAbstractType) tmpTType;
			EObject tmpTModifier = _edge_tModifier.getTrg();
			if (tmpTModifier instanceof TModifier) {
				TModifier tModifier = (TModifier) tmpTModifier;
				if (tModifier.equals(tType.getTModifier())) {
					if (pattern_TypesVisibility_20_2_testcorematchandDECs_black_nac_0B(tModifier) == null) {
						_result.add(new Object[] { tModifier, tType, _edge_tModifier });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypesVisibility_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypesVisibility_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypesVisibility _this, Match match, TModifier tModifier, TAbstractType tType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tModifier, tType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypesVisibility_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypesVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypesVisibility_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_21_1_preparereturnvalue_bindingFB(TypesVisibility _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypesVisibility _this) {
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

	public static final Object[] pattern_TypesVisibility_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypesVisibility _this) {
		Object[] result_pattern_TypesVisibility_21_1_preparereturnvalue_binding = pattern_TypesVisibility_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesVisibility_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypesVisibility_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesVisibility_21_1_preparereturnvalue_black = pattern_TypesVisibility_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypesVisibility_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypesVisibility_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypesVisibility_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypesVisibility_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_modifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMType = _edge_modifier.getSrc();
		if (tmpMType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
			EObject tmpMModifier = _edge_modifier.getTrg();
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (mModifier.equals(mType.getModifier())) {
					_result.add(new Object[] { mModifier, mType, _edge_modifier });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypesVisibility_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypesVisibility_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypesVisibility _this, Match match, Modifier mModifier, AbstractTypeDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mModifier, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypesVisibility_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypesVisibility _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypesVisibility_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_24_1_prepare_blackB(TypesVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypesVisibility_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypesVisibility_24_2_matchsrctrgcontext_bindingFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tModifier");
		EObject _localVariable_1 = sourceMatch.getObject("mModifier");
		EObject _localVariable_2 = targetMatch.getObject("tType");
		EObject _localVariable_3 = sourceMatch.getObject("mType");
		EObject tmpTModifier = _localVariable_0;
		EObject tmpMModifier = _localVariable_1;
		EObject tmpTType = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		if (tmpTModifier instanceof TModifier) {
			TModifier tModifier = (TModifier) tmpTModifier;
			if (tmpMModifier instanceof Modifier) {
				Modifier mModifier = (Modifier) tmpMModifier;
				if (tmpTType instanceof TAbstractType) {
					TAbstractType tType = (TAbstractType) tmpTType;
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						return new Object[] { tModifier, mModifier, tType, mType, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_24_2_matchsrctrgcontext_blackBBBBBB(TModifier tModifier,
			Modifier mModifier, TAbstractType tType, AbstractTypeDeclaration mType, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { tModifier, mModifier, tType, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypesVisibility_24_2_matchsrctrgcontext_binding = pattern_TypesVisibility_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_TypesVisibility_24_2_matchsrctrgcontext_binding != null) {
			TModifier tModifier = (TModifier) result_pattern_TypesVisibility_24_2_matchsrctrgcontext_binding[0];
			Modifier mModifier = (Modifier) result_pattern_TypesVisibility_24_2_matchsrctrgcontext_binding[1];
			TAbstractType tType = (TAbstractType) result_pattern_TypesVisibility_24_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_TypesVisibility_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_TypesVisibility_24_2_matchsrctrgcontext_black = pattern_TypesVisibility_24_2_matchsrctrgcontext_blackBBBBBB(
					tModifier, mModifier, tType, mType, sourceMatch, targetMatch);
			if (result_pattern_TypesVisibility_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tModifier, mModifier, tType, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_24_3_solvecsp_bindingFBBBBBBB(TypesVisibility _this,
			TModifier tModifier, Modifier mModifier, TAbstractType tType, AbstractTypeDeclaration mType,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(tModifier, mModifier, tType, mType, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, tModifier, mModifier, tType, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesVisibility_24_3_solvecsp_bindingAndBlackFBBBBBBB(TypesVisibility _this,
			TModifier tModifier, Modifier mModifier, TAbstractType tType, AbstractTypeDeclaration mType,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypesVisibility_24_3_solvecsp_binding = pattern_TypesVisibility_24_3_solvecsp_bindingFBBBBBBB(
				_this, tModifier, mModifier, tType, mType, sourceMatch, targetMatch);
		if (result_pattern_TypesVisibility_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypesVisibility_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypesVisibility_24_3_solvecsp_black = pattern_TypesVisibility_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_TypesVisibility_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tModifier, mModifier, tType, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesVisibility_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesVisibility_24_5_matchcorrcontext_blackFBBBB(TAbstractType tType,
			AbstractTypeDeclaration mType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
				if (tType.equals(mTypeToTType.getTarget())) {
					_result.add(new Object[] { mTypeToTType, tType, mType, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_24_5_matchcorrcontext_greenBBBF(
			TypeToTAbstractType mTypeToTType, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypesVisibility";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mTypeToTType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypesVisibility_24_6_createcorrespondence_blackBBBBB(TModifier tModifier,
			Modifier mModifier, TAbstractType tType, AbstractTypeDeclaration mType, CCMatch ccMatch) {
		return new Object[] { tModifier, mModifier, tType, mType, ccMatch };
	}

	public static final Object[] pattern_TypesVisibility_24_6_createcorrespondence_greenBFBB(TModifier tModifier,
			Modifier mModifier, CCMatch ccMatch) {
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		mModifierToTModifier.setSource(mModifier);
		mModifierToTModifier.setTarget(tModifier);
		ccMatch.getCreateCorr().add(mModifierToTModifier);
		return new Object[] { tModifier, mModifierToTModifier, mModifier, ccMatch };
	}

	public static final Object[] pattern_TypesVisibility_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypesVisibility_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypesVisibility";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypesVisibility_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_27_1_matchtggpattern_blackBB(Modifier mModifier,
			AbstractTypeDeclaration mType) {
		if (mModifier.equals(mType.getModifier())) {
			return new Object[] { mModifier, mType };
		}
		return null;
	}

	public static final boolean pattern_TypesVisibility_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesVisibility_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_28_1_matchtggpattern_black_nac_0B(TModifier tModifier) {
		for (TMember __DEC_tModifier_tModifier_631921 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tModifier, TMember.class, "tModifier")) {
			return new Object[] { tModifier };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_28_1_matchtggpattern_blackBB(TModifier tModifier,
			TAbstractType tType) {
		if (tModifier.equals(tType.getTModifier())) {
			if (pattern_TypesVisibility_28_1_matchtggpattern_black_nac_0B(tModifier) == null) {
				return new Object[] { tModifier, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesVisibility_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesVisibility_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_29_1_createresult_blackB(TypesVisibility _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypesVisibility_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypesVisibility_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesVisibility_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
				if (tmpMTypeToTType instanceof TypeToTAbstractType) {
					TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
					Type tmpMType = mTypeToTType.getSource();
					if (tmpMType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
						TAbstractType tType = mTypeToTType.getTarget();
						if (tType != null) {
							if (pattern_TypesVisibility_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									mTypeToTType) == null) {
								if (pattern_TypesVisibility_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										mType) == null) {
									if (pattern_TypesVisibility_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											tType) == null) {
										_result.add(new Object[] { mTypeToTTypeList, mTypeToTType, mType, tType,
												ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_TypesVisibility_29_3_solveCSP_bindingFBBBBBB(TypesVisibility _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			AbstractTypeDeclaration mType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mTypeToTType, tType, mType,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypesVisibility_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesVisibility_29_3_solveCSP_bindingAndBlackFBBBBBB(TypesVisibility _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType mTypeToTType, TAbstractType tType,
			AbstractTypeDeclaration mType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypesVisibility_29_3_solveCSP_binding = pattern_TypesVisibility_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, mTypeToTType, tType, mType, ruleResult);
		if (result_pattern_TypesVisibility_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesVisibility_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypesVisibility_29_3_solveCSP_black = pattern_TypesVisibility_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_TypesVisibility_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mTypeToTType, tType, mType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesVisibility_29_4_checkCSP_expressionFBB(TypesVisibility _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesVisibility_29_5_checknacs_blackBBB(TypeToTAbstractType mTypeToTType,
			TAbstractType tType, AbstractTypeDeclaration mType) {
		return new Object[] { mTypeToTType, tType, mType };
	}

	public static final Object[] pattern_TypesVisibility_29_6_perform_blackBBBB(TypeToTAbstractType mTypeToTType,
			TAbstractType tType, AbstractTypeDeclaration mType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mTypeToTType, tType, mType, ruleResult };
	}

	public static final Object[] pattern_TypesVisibility_29_6_perform_greenFFFBBBB(TAbstractType tType,
			AbstractTypeDeclaration mType, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TModifier tModifier = BasicFactory.eINSTANCE.createTModifier();
		MModifierToTModifier mModifierToTModifier = PmFactory.eINSTANCE.createMModifierToTModifier();
		Modifier mModifier = JavaFactory.eINSTANCE.createModifier();
		Object _localVariable_0 = csp.getValue("tModifier", "isStatic");
		Object _localVariable_1 = csp.getValue("tModifier", "tVisibility");
		Object _localVariable_2 = csp.getValue("mModifier", "static");
		Object _localVariable_3 = csp.getValue("mModifier", "visibility");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		tType.setTModifier(tModifier);
		ruleResult.getTargetObjects().add(tModifier);
		mModifierToTModifier.setTarget(tModifier);
		ruleResult.getCorrObjects().add(mModifierToTModifier);
		mModifierToTModifier.setSource(mModifier);
		mType.setModifier(mModifier);
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
		return new Object[] { tModifier, mModifierToTModifier, mModifier, tType, mType, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_TypesVisibility_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypesVisibilityImpl
