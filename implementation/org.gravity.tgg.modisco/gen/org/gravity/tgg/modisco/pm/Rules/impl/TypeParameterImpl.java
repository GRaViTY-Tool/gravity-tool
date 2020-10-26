/**
 */
package org.gravity.tgg.modisco.pm.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.Model;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MGravityModel;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.TypeParameter;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
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
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeParameterImpl extends AbstractRuleImpl implements TypeParameter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypeParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter) {

		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_0_1_initialbindings_blackBBBB(this, match,
				eModel, typeParameter);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[eModel] = " + eModel + ", " + "[typeParameter] = " + typeParameter + ".");
		}

		Object[] result2_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, eModel, typeParameter);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[eModel] = " + eModel + ", " + "[typeParameter] = " + typeParameter + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeParameterImpl.pattern_TypeParameter_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeParameterImpl
					.pattern_TypeParameter_0_4_collectelementstobetranslated_blackBBB(match, eModel, typeParameter);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eModel] = " + eModel + ", " + "[typeParameter] = " + typeParameter + ".");
			}
			TypeParameterImpl.pattern_TypeParameter_0_4_collectelementstobetranslated_greenBBBF(match, eModel,
					typeParameter);
			//nothing EMoflonEdge eModel__typeParameter____typeParameters = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypeParameterImpl.pattern_TypeParameter_0_5_collectcontextelements_blackBBB(match,
					eModel, typeParameter);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eModel] = " + eModel + ", " + "[typeParameter] = " + typeParameter + ".");
			}
			TypeParameterImpl.pattern_TypeParameter_0_5_collectcontextelements_greenBB(match, eModel);

			// 
			TypeParameterImpl.pattern_TypeParameter_0_6_registerobjectstomatch_expressionBBBB(this, match, eModel,
					typeParameter);
			return TypeParameterImpl.pattern_TypeParameter_0_7_expressionF();
		} else {
			return TypeParameterImpl.pattern_TypeParameter_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MGravityModel eModel = (MGravityModel) result1_bindingAndBlack[0];
		org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result1_bindingAndBlack[1];
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypeParameterImpl
				.pattern_TypeParameter_1_1_performtransformation_greenBFFB(typeParameter, pg);
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result1_green[1];
		TClass tClass = (TClass) result1_green[2];

		Object[] result2_black = TypeParameterImpl.pattern_TypeParameter_1_2_collecttranslatedelements_blackBBB(
				typeParameter, eAnonymousClassDeclarationToTClass, tClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeParameter] = "
					+ typeParameter + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[tClass] = " + tClass + ".");
		}
		Object[] result2_green = TypeParameterImpl.pattern_TypeParameter_1_2_collecttranslatedelements_greenFBBB(
				typeParameter, eAnonymousClassDeclarationToTClass, tClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeParameterImpl.pattern_TypeParameter_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, eModel, typeParameter, eAnonymousClassDeclarationToTClass, eModelToPg, tClass, pg);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eModel] = " + eModel + ", " + "[typeParameter] = " + typeParameter + ", "
					+ "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[eModelToPg] = " + eModelToPg + ", " + "[tClass] = " + tClass + ", " + "[pg] = " + pg + ".");
		}
		TypeParameterImpl.pattern_TypeParameter_1_3_bookkeepingforedges_greenBBBBBBFFFFFF(ruleresult, eModel,
				typeParameter, eAnonymousClassDeclarationToTClass, tClass, pg);
		//nothing EMoflonEdge eModel__typeParameter____typeParameters = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__typeParameter____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tClass__pg____pg = (EMoflonEdge) result3_green[11];

		// 
		// 
		TypeParameterImpl.pattern_TypeParameter_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, eModel,
				typeParameter, eAnonymousClassDeclarationToTClass, eModelToPg, tClass, pg);
		return TypeParameterImpl.pattern_TypeParameter_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeParameterImpl
				.pattern_TypeParameter_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeParameterImpl.pattern_TypeParameter_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MGravityModel eModel = (MGravityModel) result2_binding[0];
		org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result2_binding[1];
		for (Object[] result2_black : TypeParameterImpl.pattern_TypeParameter_2_2_corematch_blackBBFFB(eModel,
				typeParameter, match)) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : TypeParameterImpl.pattern_TypeParameter_2_3_findcontext_blackBBBB(eModel,
					typeParameter, eModelToPg, pg)) {
				Object[] result3_green = TypeParameterImpl.pattern_TypeParameter_2_3_findcontext_greenBBBBFFFF(eModel,
						typeParameter, eModelToPg, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge eModel__typeParameter____typeParameters = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = TypeParameterImpl
						.pattern_TypeParameter_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, eModel,
								typeParameter, eModelToPg, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModel] = " + eModel + ", "
							+ "[typeParameter] = " + typeParameter + ", " + "[eModelToPg] = " + eModelToPg + ", "
							+ "[pg] = " + pg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeParameterImpl.pattern_TypeParameter_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeParameterImpl
							.pattern_TypeParameter_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeParameterImpl.pattern_TypeParameter_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TypeParameterImpl.pattern_TypeParameter_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter) {
		match.registerObject("eModel", eModel);
		match.registerObject("typeParameter", typeParameter);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter, ModelToTypeGraph eModelToPg, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("typeParameter", typeParameter);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("pg", pg);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eModel, EObject typeParameter,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg, EObject tClass, EObject pg) {
		ruleresult.registerObject("eModel", eModel);
		ruleresult.registerObject("typeParameter", typeParameter);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("eModelToPg", eModelToPg);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeParameter").eClass())
				.equals("java.TypeParameter.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TClass tClass, TypeGraph pg) {

		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_10_1_initialbindings_blackBBBB(this, match,
				tClass, pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[pg] = " + pg + ".");
		}

		Object[] result2_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tClass, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypeParameterImpl.pattern_TypeParameter_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypeParameterImpl
					.pattern_TypeParameter_10_4_collectelementstobetranslated_blackBBB(match, tClass, pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[pg] = " + pg + ".");
			}
			TypeParameterImpl.pattern_TypeParameter_10_4_collectelementstobetranslated_greenBBBFFF(match, tClass, pg);
			//nothing EMoflonEdge pg__tClass____classes = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tClass__pg____pg = (EMoflonEdge) result4_green[5];

			Object[] result5_black = TypeParameterImpl.pattern_TypeParameter_10_5_collectcontextelements_blackBBB(match,
					tClass, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[pg] = " + pg + ".");
			}
			TypeParameterImpl.pattern_TypeParameter_10_5_collectcontextelements_greenBB(match, pg);

			// 
			TypeParameterImpl.pattern_TypeParameter_10_6_registerobjectstomatch_expressionBBBB(this, match, tClass, pg);
			return TypeParameterImpl.pattern_TypeParameter_10_7_expressionF();
		} else {
			return TypeParameterImpl.pattern_TypeParameter_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MGravityModel eModel = (MGravityModel) result1_bindingAndBlack[0];
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[1];
		TClass tClass = (TClass) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = TypeParameterImpl.pattern_TypeParameter_11_1_performtransformation_greenBFFB(eModel,
				tClass);
		org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result1_green[1];
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result1_green[2];

		Object[] result2_black = TypeParameterImpl.pattern_TypeParameter_11_2_collecttranslatedelements_blackBBB(
				typeParameter, eAnonymousClassDeclarationToTClass, tClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeParameter] = "
					+ typeParameter + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[tClass] = " + tClass + ".");
		}
		Object[] result2_green = TypeParameterImpl.pattern_TypeParameter_11_2_collecttranslatedelements_greenFBBB(
				typeParameter, eAnonymousClassDeclarationToTClass, tClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypeParameterImpl.pattern_TypeParameter_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, eModel, typeParameter, eAnonymousClassDeclarationToTClass, eModelToPg, tClass, pg);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eModel] = " + eModel + ", " + "[typeParameter] = " + typeParameter + ", "
					+ "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[eModelToPg] = " + eModelToPg + ", " + "[tClass] = " + tClass + ", " + "[pg] = " + pg + ".");
		}
		TypeParameterImpl.pattern_TypeParameter_11_3_bookkeepingforedges_greenBBBBBBFFFFFF(ruleresult, eModel,
				typeParameter, eAnonymousClassDeclarationToTClass, tClass, pg);
		//nothing EMoflonEdge eModel__typeParameter____typeParameters = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__typeParameter____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tClass__pg____pg = (EMoflonEdge) result3_green[11];

		// 
		// 
		TypeParameterImpl.pattern_TypeParameter_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, eModel,
				typeParameter, eAnonymousClassDeclarationToTClass, eModelToPg, tClass, pg);
		return TypeParameterImpl.pattern_TypeParameter_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypeParameterImpl
				.pattern_TypeParameter_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypeParameterImpl.pattern_TypeParameter_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TClass tClass = (TClass) result2_binding[0];
		TypeGraph pg = (TypeGraph) result2_binding[1];
		for (Object[] result2_black : TypeParameterImpl.pattern_TypeParameter_12_2_corematch_blackFFBBB(tClass, pg,
				match)) {
			MGravityModel eModel = (MGravityModel) result2_black[0];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[1];
			// ForEach 
			for (Object[] result3_black : TypeParameterImpl.pattern_TypeParameter_12_3_findcontext_blackBBBB(eModel,
					eModelToPg, tClass, pg)) {
				Object[] result3_green = TypeParameterImpl
						.pattern_TypeParameter_12_3_findcontext_greenBBBBFFFFFF(eModel, eModelToPg, tClass, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge pg__tClass____classes = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tClass__pg____pg = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = TypeParameterImpl
						.pattern_TypeParameter_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, eModel,
								eModelToPg, tClass, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModel] = " + eModel + ", "
							+ "[eModelToPg] = " + eModelToPg + ", " + "[tClass] = " + tClass + ", " + "[pg] = " + pg
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypeParameterImpl.pattern_TypeParameter_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypeParameterImpl
							.pattern_TypeParameter_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypeParameterImpl.pattern_TypeParameter_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TypeParameterImpl.pattern_TypeParameter_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TClass tClass, TypeGraph pg) {
		match.registerObject("tClass", tClass);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TClass tClass, TypeGraph pg) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MGravityModel eModel,
			ModelToTypeGraph eModelToPg, TClass tClass, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("pg", pg);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eModel, EObject typeParameter,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg, EObject tClass, EObject pg) {
		ruleresult.registerObject("eModel", eModel);
		ruleresult.registerObject("typeParameter", typeParameter);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("eModelToPg", eModelToPg);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tClass").eClass()).equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_8(EMoflonEdge _edge_classes) {

		Object[] result1_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeParameterImpl.pattern_TypeParameter_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeParameterImpl
				.pattern_TypeParameter_20_2_testcorematchandDECs_blackFFB(_edge_classes)) {
			TClass tClass = (TClass) result2_black[0];
			TypeGraph pg = (TypeGraph) result2_black[1];
			Object[] result2_green = TypeParameterImpl
					.pattern_TypeParameter_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeParameterImpl.pattern_TypeParameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, tClass, pg)) {
				// 
				if (TypeParameterImpl
						.pattern_TypeParameter_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TypeParameterImpl
							.pattern_TypeParameter_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeParameterImpl.pattern_TypeParameter_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeParameterImpl.pattern_TypeParameter_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_8(EMoflonEdge _edge_typeParameters) {

		Object[] result1_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypeParameterImpl.pattern_TypeParameter_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypeParameterImpl
				.pattern_TypeParameter_21_2_testcorematchandDECs_blackFFB(_edge_typeParameters)) {
			MGravityModel eModel = (MGravityModel) result2_black[0];
			org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result2_black[1];
			Object[] result2_green = TypeParameterImpl
					.pattern_TypeParameter_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypeParameterImpl.pattern_TypeParameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, eModel, typeParameter)) {
				// 
				if (TypeParameterImpl
						.pattern_TypeParameter_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TypeParameterImpl
							.pattern_TypeParameter_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypeParameterImpl.pattern_TypeParameter_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypeParameterImpl.pattern_TypeParameter_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeParameter");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tClass", "tLib", false, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tClass", "tName", "T", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
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
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypeParameter");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tClass", "tLib", false, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("tClass", "tName", "T", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
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

		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeParameterImpl.pattern_TypeParameter_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MGravityModel eModel = (MGravityModel) result2_bindingAndBlack[0];
		org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result2_bindingAndBlack[1];
		TClass tClass = (TClass) result2_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = TypeParameterImpl
				.pattern_TypeParameter_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, eModel, typeParameter, tClass, pg,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[eModel] = " + eModel + ", " + "[typeParameter] = " + typeParameter + ", " + "[tClass] = "
					+ tClass + ", " + "[pg] = " + pg + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypeParameterImpl.pattern_TypeParameter_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypeParameterImpl
					.pattern_TypeParameter_24_5_matchcorrcontext_blackBFBBB(eModel, pg, sourceMatch, targetMatch)) {
				ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result5_black[1];
				Object[] result5_green = TypeParameterImpl
						.pattern_TypeParameter_24_5_matchcorrcontext_greenBBBF(eModelToPg, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = TypeParameterImpl.pattern_TypeParameter_24_6_createcorrespondence_blackBBBBB(
						eModel, typeParameter, tClass, pg, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eModel] = " + eModel
							+ ", " + "[typeParameter] = " + typeParameter + ", " + "[tClass] = " + tClass + ", "
							+ "[pg] = " + pg + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeParameterImpl.pattern_TypeParameter_24_6_createcorrespondence_greenBFBB(typeParameter, tClass,
						ccMatch);
				//nothing TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result6_green[1];

				Object[] result7_black = TypeParameterImpl
						.pattern_TypeParameter_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypeParameterImpl.pattern_TypeParameter_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return TypeParameterImpl.pattern_TypeParameter_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter,
			TClass tClass, TypeGraph pg, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter) {// 
		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_27_1_matchtggpattern_blackBB(eModel,
				typeParameter);
		if (result1_black != null) {
			return TypeParameterImpl.pattern_TypeParameter_27_2_expressionF();
		} else {
			return TypeParameterImpl.pattern_TypeParameter_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TClass tClass, TypeGraph pg) {// 
		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_28_1_matchtggpattern_blackBB(tClass, pg);
		if (result1_black != null) {
			TypeParameterImpl.pattern_TypeParameter_28_1_matchtggpattern_greenB(tClass);

			return TypeParameterImpl.pattern_TypeParameter_28_2_expressionF();
		} else {
			return TypeParameterImpl.pattern_TypeParameter_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph eModelToPgParameter) {

		Object[] result1_black = TypeParameterImpl.pattern_TypeParameter_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypeParameterImpl.pattern_TypeParameter_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypeParameterImpl
				.pattern_TypeParameter_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eModelToPgList = (RuleEntryList) result2_black[0];
			MGravityModel eModel = (MGravityModel) result2_black[1];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];

			Object[] result3_bindingAndBlack = TypeParameterImpl
					.pattern_TypeParameter_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, eModel,
							eModelToPg, pg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModel] = " + eModel + ", "
						+ "[eModelToPg] = " + eModelToPg + ", " + "[pg] = " + pg + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypeParameterImpl.pattern_TypeParameter_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypeParameterImpl.pattern_TypeParameter_29_5_checknacs_blackBBB(eModel,
						eModelToPg, pg);
				if (result5_black != null) {

					Object[] result6_black = TypeParameterImpl.pattern_TypeParameter_29_6_perform_blackBBBB(eModel,
							eModelToPg, pg, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eModel] = " + eModel
								+ ", " + "[eModelToPg] = " + eModelToPg + ", " + "[pg] = " + pg + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					TypeParameterImpl.pattern_TypeParameter_29_6_perform_greenBFFFBB(eModel, pg, ruleResult);
					//nothing org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result6_green[1];
					//nothing TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result6_green[2];
					//nothing TClass tClass = (TClass) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return TypeParameterImpl.pattern_TypeParameter_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MGravityModel eModel,
			ModelToTypeGraph eModelToPg, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("pg", pg);
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
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_FWD__MATCH_MGRAVITYMODEL_TYPEPARAMETER:
			return isAppropriate_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(2));
		case RulesPackage.TYPE_PARAMETER___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MGRAVITYMODEL_TYPEPARAMETER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(2));
			return null;
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MGRAVITYMODEL_TYPEPARAMETER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(2));
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_TYPEPARAMETER_MODELTOTYPEGRAPH_TYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(2), (ModelToTypeGraph) arguments.get(3),
					(TypeGraph) arguments.get(4));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TYPE_PARAMETER___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_BWD__MATCH_TCLASS_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TClass) arguments.get(1), (TypeGraph) arguments.get(2));
		case RulesPackage.TYPE_PARAMETER___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TCLASS_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TypeGraph) arguments.get(2));
			return null;
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TCLASS_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TClass) arguments.get(1),
					(TypeGraph) arguments.get(2));
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_MODELTOTYPEGRAPH_TCLASS_TYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (TClass) arguments.get(3), (TypeGraph) arguments.get(4));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TYPE_PARAMETER___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_SOLVE_CSP_CC__MGRAVITYMODEL_TYPEPARAMETER_TCLASS_TYPEGRAPH_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MGravityModel) arguments.get(0),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(1), (TClass) arguments.get(2),
					(TypeGraph) arguments.get(3), (Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.TYPE_PARAMETER___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPE_PARAMETER___CHECK_DEC_FWD__MGRAVITYMODEL_TYPEPARAMETER:
			return checkDEC_FWD((MGravityModel) arguments.get(0),
					(org.eclipse.modisco.java.TypeParameter) arguments.get(1));
		case RulesPackage.TYPE_PARAMETER___CHECK_DEC_BWD__TCLASS_TYPEGRAPH:
			return checkDEC_BWD((TClass) arguments.get(0), (TypeGraph) arguments.get(1));
		case RulesPackage.TYPE_PARAMETER___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.TYPE_PARAMETER___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_MODELTOTYPEGRAPH_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (TypeGraph) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.TYPE_PARAMETER___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypeParameter_0_1_initialbindings_blackBBBB(TypeParameter _this, Match match,
			MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter) {
		return new Object[] { _this, match, eModel, typeParameter };
	}

	public static final Object[] pattern_TypeParameter_0_2_SolveCSP_bindingFBBBB(TypeParameter _this, Match match,
			MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eModel, typeParameter);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eModel, typeParameter };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_0_2_SolveCSP_bindingAndBlackFBBBB(TypeParameter _this,
			Match match, MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter) {
		Object[] result_pattern_TypeParameter_0_2_SolveCSP_binding = pattern_TypeParameter_0_2_SolveCSP_bindingFBBBB(
				_this, match, eModel, typeParameter);
		if (result_pattern_TypeParameter_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeParameter_0_2_SolveCSP_black = pattern_TypeParameter_0_2_SolveCSP_blackB(csp);
			if (result_pattern_TypeParameter_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eModel, typeParameter };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_0_3_CheckCSP_expressionFBB(TypeParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_0_4_collectelementstobetranslated_blackBBB(Match match,
			MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter) {
		return new Object[] { match, eModel, typeParameter };
	}

	public static final Object[] pattern_TypeParameter_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter) {
		EMoflonEdge eModel__typeParameter____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeParameter);
		String eModel__typeParameter____typeParameters_name_prime = "typeParameters";
		eModel__typeParameter____typeParameters.setSrc(eModel);
		eModel__typeParameter____typeParameters.setTrg(typeParameter);
		match.getToBeTranslatedEdges().add(eModel__typeParameter____typeParameters);
		eModel__typeParameter____typeParameters.setName(eModel__typeParameter____typeParameters_name_prime);
		return new Object[] { match, eModel, typeParameter, eModel__typeParameter____typeParameters };
	}

	public static final Object[] pattern_TypeParameter_0_5_collectcontextelements_blackBBB(Match match,
			MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter) {
		return new Object[] { match, eModel, typeParameter };
	}

	public static final Object[] pattern_TypeParameter_0_5_collectcontextelements_greenBB(Match match,
			MGravityModel eModel) {
		match.getContextNodes().add(eModel);
		return new Object[] { match, eModel };
	}

	public static final void pattern_TypeParameter_0_6_registerobjectstomatch_expressionBBBB(TypeParameter _this,
			Match match, MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter) {
		_this.registerObjectsToMatch_FWD(match, eModel, typeParameter);

	}

	public static final boolean pattern_TypeParameter_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeParameter");
		EObject _localVariable_2 = isApplicableMatch.getObject("eModelToPg");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject tmpEModel = _localVariable_0;
		EObject tmpTypeParameter = _localVariable_1;
		EObject tmpEModelToPg = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		if (tmpEModel instanceof MGravityModel) {
			MGravityModel eModel = (MGravityModel) tmpEModel;
			if (tmpTypeParameter instanceof org.eclipse.modisco.java.TypeParameter) {
				org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) tmpTypeParameter;
				if (tmpEModelToPg instanceof ModelToTypeGraph) {
					ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						return new Object[] { eModel, typeParameter, eModelToPg, pg, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_1_1_performtransformation_blackBBBBFBB(MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter, ModelToTypeGraph eModelToPg, TypeGraph pg,
			TypeParameter _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { eModel, typeParameter, eModelToPg, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_1_1_performtransformation_bindingAndBlackFFFFFBB(
			TypeParameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeParameter_1_1_performtransformation_binding = pattern_TypeParameter_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeParameter_1_1_performtransformation_binding != null) {
			MGravityModel eModel = (MGravityModel) result_pattern_TypeParameter_1_1_performtransformation_binding[0];
			org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result_pattern_TypeParameter_1_1_performtransformation_binding[1];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_TypeParameter_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_TypeParameter_1_1_performtransformation_binding[3];

			Object[] result_pattern_TypeParameter_1_1_performtransformation_black = pattern_TypeParameter_1_1_performtransformation_blackBBBBFBB(
					eModel, typeParameter, eModelToPg, pg, _this, isApplicableMatch);
			if (result_pattern_TypeParameter_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeParameter_1_1_performtransformation_black[4];

				return new Object[] { eModel, typeParameter, eModelToPg, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_1_1_performtransformation_greenBFFB(
			org.eclipse.modisco.java.TypeParameter typeParameter, TypeGraph pg) {
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tClass = BasicFactory.eINSTANCE.createTClass();
		boolean tClass_tLib_prime = Boolean.valueOf(false);
		String tClass_tName_prime = "T";
		eAnonymousClassDeclarationToTClass.setSource(typeParameter);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		pg.getClasses().add(tClass);
		pg.getOwnedTypes().add(tClass);
		tClass.setTLib(Boolean.valueOf(tClass_tLib_prime));
		tClass.setTName(tClass_tName_prime);
		return new Object[] { typeParameter, eAnonymousClassDeclarationToTClass, tClass, pg };
	}

	public static final Object[] pattern_TypeParameter_1_2_collecttranslatedelements_blackBBB(
			org.eclipse.modisco.java.TypeParameter typeParameter,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass, TClass tClass) {
		return new Object[] { typeParameter, eAnonymousClassDeclarationToTClass, tClass };
	}

	public static final Object[] pattern_TypeParameter_1_2_collecttranslatedelements_greenFBBB(
			org.eclipse.modisco.java.TypeParameter typeParameter,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass, TClass tClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(typeParameter);
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		ruleresult.getCreatedElements().add(tClass);
		return new Object[] { ruleresult, typeParameter, eAnonymousClassDeclarationToTClass, tClass };
	}

	public static final Object[] pattern_TypeParameter_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject eModel, EObject typeParameter,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg, EObject tClass, EObject pg) {
		if (!eModel.equals(typeParameter)) {
			if (!eModel.equals(eModelToPg)) {
				if (!eModel.equals(tClass)) {
					if (!eModel.equals(pg)) {
						if (!eAnonymousClassDeclarationToTClass.equals(eModel)) {
							if (!eAnonymousClassDeclarationToTClass.equals(typeParameter)) {
								if (!eAnonymousClassDeclarationToTClass.equals(eModelToPg)) {
									if (!eAnonymousClassDeclarationToTClass.equals(tClass)) {
										if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
											if (!eModelToPg.equals(typeParameter)) {
												if (!eModelToPg.equals(tClass)) {
													if (!eModelToPg.equals(pg)) {
														if (!tClass.equals(typeParameter)) {
															if (!pg.equals(typeParameter)) {
																if (!pg.equals(tClass)) {
																	return new Object[] { ruleresult, eModel,
																			typeParameter,
																			eAnonymousClassDeclarationToTClass,
																			eModelToPg, tClass, pg };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeParameter_1_3_bookkeepingforedges_greenBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject eModel, EObject typeParameter,
			EObject eAnonymousClassDeclarationToTClass, EObject tClass, EObject pg) {
		EMoflonEdge eModel__typeParameter____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__typeParameter____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeParameter";
		String eModel__typeParameter____typeParameters_name_prime = "typeParameters";
		String eAnonymousClassDeclarationToTClass__typeParameter____source_name_prime = "source";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String pg__tClass____classes_name_prime = "classes";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____pg_name_prime = "pg";
		eModel__typeParameter____typeParameters.setSrc(eModel);
		eModel__typeParameter____typeParameters.setTrg(typeParameter);
		ruleresult.getTranslatedEdges().add(eModel__typeParameter____typeParameters);
		eAnonymousClassDeclarationToTClass__typeParameter____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__typeParameter____source.setTrg(typeParameter);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__typeParameter____source);
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tClass____target);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		ruleresult.getCreatedEdges().add(pg__tClass____classes);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		ruleresult.getCreatedEdges().add(pg__tClass____ownedTypes);
		tClass__pg____pg.setSrc(tClass);
		tClass__pg____pg.setTrg(pg);
		ruleresult.getCreatedEdges().add(tClass__pg____pg);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eModel__typeParameter____typeParameters.setName(eModel__typeParameter____typeParameters_name_prime);
		eAnonymousClassDeclarationToTClass__typeParameter____source
				.setName(eAnonymousClassDeclarationToTClass__typeParameter____source_name_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____pg.setName(tClass__pg____pg_name_prime);
		return new Object[] { ruleresult, eModel, typeParameter, eAnonymousClassDeclarationToTClass, tClass, pg,
				eModel__typeParameter____typeParameters, eAnonymousClassDeclarationToTClass__typeParameter____source,
				eAnonymousClassDeclarationToTClass__tClass____target, pg__tClass____classes, pg__tClass____ownedTypes,
				tClass__pg____pg };
	}

	public static final void pattern_TypeParameter_1_5_registerobjects_expressionBBBBBBBB(TypeParameter _this,
			PerformRuleResult ruleresult, EObject eModel, EObject typeParameter,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg, EObject tClass, EObject pg) {
		_this.registerObjects_FWD(ruleresult, eModel, typeParameter, eAnonymousClassDeclarationToTClass, eModelToPg,
				tClass, pg);

	}

	public static final PerformRuleResult pattern_TypeParameter_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_2_1_preparereturnvalue_bindingFB(TypeParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeParameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_2_1_preparereturnvalue_bindingAndBlackFFB(TypeParameter _this) {
		Object[] result_pattern_TypeParameter_2_1_preparereturnvalue_binding = pattern_TypeParameter_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeParameter_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter_2_1_preparereturnvalue_black = pattern_TypeParameter_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeParameter_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeParameter_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeParameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeParameter_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eModel");
		EObject _localVariable_1 = match.getObject("typeParameter");
		EObject tmpEModel = _localVariable_0;
		EObject tmpTypeParameter = _localVariable_1;
		if (tmpEModel instanceof MGravityModel) {
			MGravityModel eModel = (MGravityModel) tmpEModel;
			if (tmpTypeParameter instanceof org.eclipse.modisco.java.TypeParameter) {
				org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) tmpTypeParameter;
				return new Object[] { eModel, typeParameter, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_2_2_corematch_blackBBFFB(MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(eModel,
				ModelToTypeGraph.class, "source")) {
			TypeGraph pg = eModelToPg.getTarget();
			if (pg != null) {
				_result.add(new Object[] { eModel, typeParameter, eModelToPg, pg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_2_3_findcontext_blackBBBB(MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter, ModelToTypeGraph eModelToPg, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (eModel.getTypeParameters().contains(typeParameter)) {
			if (pg.equals(eModelToPg.getTarget())) {
				if (eModel.equals(eModelToPg.getSource())) {
					_result.add(new Object[] { eModel, typeParameter, eModelToPg, pg });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeParameter_2_3_findcontext_greenBBBBFFFF(MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter, ModelToTypeGraph eModelToPg, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModel__typeParameter____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModel__typeParameter____typeParameters_name_prime = "typeParameters";
		String eModelToPg__pg____target_name_prime = "target";
		String eModelToPg__eModel____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(typeParameter);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(pg);
		eModel__typeParameter____typeParameters.setSrc(eModel);
		eModel__typeParameter____typeParameters.setTrg(typeParameter);
		isApplicableMatch.getAllContextElements().add(eModel__typeParameter____typeParameters);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		eModelToPg__eModel____source.setSrc(eModelToPg);
		eModelToPg__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg__eModel____source);
		eModel__typeParameter____typeParameters.setName(eModel__typeParameter____typeParameters_name_prime);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		return new Object[] { eModel, typeParameter, eModelToPg, pg, isApplicableMatch,
				eModel__typeParameter____typeParameters, eModelToPg__pg____target, eModelToPg__eModel____source };
	}

	public static final Object[] pattern_TypeParameter_2_4_solveCSP_bindingFBBBBBB(TypeParameter _this,
			IsApplicableMatch isApplicableMatch, MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter, ModelToTypeGraph eModelToPg, TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eModel, typeParameter, eModelToPg,
				pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModel, typeParameter, eModelToPg, pg };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_2_4_solveCSP_bindingAndBlackFBBBBBB(TypeParameter _this,
			IsApplicableMatch isApplicableMatch, MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter, ModelToTypeGraph eModelToPg, TypeGraph pg) {
		Object[] result_pattern_TypeParameter_2_4_solveCSP_binding = pattern_TypeParameter_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModel, typeParameter, eModelToPg, pg);
		if (result_pattern_TypeParameter_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypeParameter_2_4_solveCSP_black = pattern_TypeParameter_2_4_solveCSP_blackB(csp);
			if (result_pattern_TypeParameter_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModel, typeParameter, eModelToPg, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_2_5_checkCSP_expressionFBB(TypeParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeParameter_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeParameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeParameter_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_10_1_initialbindings_blackBBBB(TypeParameter _this, Match match,
			TClass tClass, TypeGraph pg) {
		return new Object[] { _this, match, tClass, pg };
	}

	public static final Object[] pattern_TypeParameter_10_2_SolveCSP_bindingFBBBB(TypeParameter _this, Match match,
			TClass tClass, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, pg };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_10_2_SolveCSP_bindingAndBlackFBBBB(TypeParameter _this,
			Match match, TClass tClass, TypeGraph pg) {
		Object[] result_pattern_TypeParameter_10_2_SolveCSP_binding = pattern_TypeParameter_10_2_SolveCSP_bindingFBBBB(
				_this, match, tClass, pg);
		if (result_pattern_TypeParameter_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypeParameter_10_2_SolveCSP_black = pattern_TypeParameter_10_2_SolveCSP_blackB(csp);
			if (result_pattern_TypeParameter_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_10_3_CheckCSP_expressionFBB(TypeParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_10_4_collectelementstobetranslated_blackBBB(Match match,
			TClass tClass, TypeGraph pg) {
		return new Object[] { match, tClass, pg };
	}

	public static final Object[] pattern_TypeParameter_10_4_collectelementstobetranslated_greenBBBFFF(Match match,
			TClass tClass, TypeGraph pg) {
		EMoflonEdge pg__tClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tClass);
		String pg__tClass____classes_name_prime = "classes";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____pg_name_prime = "pg";
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		match.getToBeTranslatedEdges().add(pg__tClass____classes);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		match.getToBeTranslatedEdges().add(pg__tClass____ownedTypes);
		tClass__pg____pg.setSrc(tClass);
		tClass__pg____pg.setTrg(pg);
		match.getToBeTranslatedEdges().add(tClass__pg____pg);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____pg.setName(tClass__pg____pg_name_prime);
		return new Object[] { match, tClass, pg, pg__tClass____classes, pg__tClass____ownedTypes, tClass__pg____pg };
	}

	public static final Object[] pattern_TypeParameter_10_5_collectcontextelements_blackBBB(Match match, TClass tClass,
			TypeGraph pg) {
		return new Object[] { match, tClass, pg };
	}

	public static final Object[] pattern_TypeParameter_10_5_collectcontextelements_greenBB(Match match, TypeGraph pg) {
		match.getContextNodes().add(pg);
		return new Object[] { match, pg };
	}

	public static final void pattern_TypeParameter_10_6_registerobjectstomatch_expressionBBBB(TypeParameter _this,
			Match match, TClass tClass, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tClass, pg);

	}

	public static final boolean pattern_TypeParameter_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("eModelToPg");
		EObject _localVariable_2 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject tmpEModel = _localVariable_0;
		EObject tmpEModelToPg = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		if (tmpEModel instanceof MGravityModel) {
			MGravityModel eModel = (MGravityModel) tmpEModel;
			if (tmpEModelToPg instanceof ModelToTypeGraph) {
				ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						return new Object[] { eModel, eModelToPg, tClass, pg, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_11_1_performtransformation_blackBBBBFBB(MGravityModel eModel,
			ModelToTypeGraph eModelToPg, TClass tClass, TypeGraph pg, TypeParameter _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { eModel, eModelToPg, tClass, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_11_1_performtransformation_bindingAndBlackFFFFFBB(
			TypeParameter _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypeParameter_11_1_performtransformation_binding = pattern_TypeParameter_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_TypeParameter_11_1_performtransformation_binding != null) {
			MGravityModel eModel = (MGravityModel) result_pattern_TypeParameter_11_1_performtransformation_binding[0];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_TypeParameter_11_1_performtransformation_binding[1];
			TClass tClass = (TClass) result_pattern_TypeParameter_11_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_TypeParameter_11_1_performtransformation_binding[3];

			Object[] result_pattern_TypeParameter_11_1_performtransformation_black = pattern_TypeParameter_11_1_performtransformation_blackBBBBFBB(
					eModel, eModelToPg, tClass, pg, _this, isApplicableMatch);
			if (result_pattern_TypeParameter_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypeParameter_11_1_performtransformation_black[4];

				return new Object[] { eModel, eModelToPg, tClass, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_11_1_performtransformation_greenBFFB(MGravityModel eModel,
			TClass tClass) {
		org.eclipse.modisco.java.TypeParameter typeParameter = JavaFactory.eINSTANCE.createTypeParameter();
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eModel.getTypeParameters().add(typeParameter);
		eAnonymousClassDeclarationToTClass.setSource(typeParameter);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		return new Object[] { eModel, typeParameter, eAnonymousClassDeclarationToTClass, tClass };
	}

	public static final Object[] pattern_TypeParameter_11_2_collecttranslatedelements_blackBBB(
			org.eclipse.modisco.java.TypeParameter typeParameter,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass, TClass tClass) {
		return new Object[] { typeParameter, eAnonymousClassDeclarationToTClass, tClass };
	}

	public static final Object[] pattern_TypeParameter_11_2_collecttranslatedelements_greenFBBB(
			org.eclipse.modisco.java.TypeParameter typeParameter,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass, TClass tClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(typeParameter);
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		ruleresult.getTranslatedElements().add(tClass);
		return new Object[] { ruleresult, typeParameter, eAnonymousClassDeclarationToTClass, tClass };
	}

	public static final Object[] pattern_TypeParameter_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject eModel, EObject typeParameter,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg, EObject tClass, EObject pg) {
		if (!eModel.equals(typeParameter)) {
			if (!eModel.equals(eModelToPg)) {
				if (!eModel.equals(tClass)) {
					if (!eModel.equals(pg)) {
						if (!eAnonymousClassDeclarationToTClass.equals(eModel)) {
							if (!eAnonymousClassDeclarationToTClass.equals(typeParameter)) {
								if (!eAnonymousClassDeclarationToTClass.equals(eModelToPg)) {
									if (!eAnonymousClassDeclarationToTClass.equals(tClass)) {
										if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
											if (!eModelToPg.equals(typeParameter)) {
												if (!eModelToPg.equals(tClass)) {
													if (!eModelToPg.equals(pg)) {
														if (!tClass.equals(typeParameter)) {
															if (!pg.equals(typeParameter)) {
																if (!pg.equals(tClass)) {
																	return new Object[] { ruleresult, eModel,
																			typeParameter,
																			eAnonymousClassDeclarationToTClass,
																			eModelToPg, tClass, pg };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypeParameter_11_3_bookkeepingforedges_greenBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject eModel, EObject typeParameter,
			EObject eAnonymousClassDeclarationToTClass, EObject tClass, EObject pg) {
		EMoflonEdge eModel__typeParameter____typeParameters = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__typeParameter____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypeParameter";
		String eModel__typeParameter____typeParameters_name_prime = "typeParameters";
		String eAnonymousClassDeclarationToTClass__typeParameter____source_name_prime = "source";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String pg__tClass____classes_name_prime = "classes";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____pg_name_prime = "pg";
		eModel__typeParameter____typeParameters.setSrc(eModel);
		eModel__typeParameter____typeParameters.setTrg(typeParameter);
		ruleresult.getCreatedEdges().add(eModel__typeParameter____typeParameters);
		eAnonymousClassDeclarationToTClass__typeParameter____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__typeParameter____source.setTrg(typeParameter);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__typeParameter____source);
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tClass____target);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(pg__tClass____classes);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(pg__tClass____ownedTypes);
		tClass__pg____pg.setSrc(tClass);
		tClass__pg____pg.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tClass__pg____pg);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eModel__typeParameter____typeParameters.setName(eModel__typeParameter____typeParameters_name_prime);
		eAnonymousClassDeclarationToTClass__typeParameter____source
				.setName(eAnonymousClassDeclarationToTClass__typeParameter____source_name_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____pg.setName(tClass__pg____pg_name_prime);
		return new Object[] { ruleresult, eModel, typeParameter, eAnonymousClassDeclarationToTClass, tClass, pg,
				eModel__typeParameter____typeParameters, eAnonymousClassDeclarationToTClass__typeParameter____source,
				eAnonymousClassDeclarationToTClass__tClass____target, pg__tClass____classes, pg__tClass____ownedTypes,
				tClass__pg____pg };
	}

	public static final void pattern_TypeParameter_11_5_registerobjects_expressionBBBBBBBB(TypeParameter _this,
			PerformRuleResult ruleresult, EObject eModel, EObject typeParameter,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg, EObject tClass, EObject pg) {
		_this.registerObjects_BWD(ruleresult, eModel, typeParameter, eAnonymousClassDeclarationToTClass, eModelToPg,
				tClass, pg);

	}

	public static final PerformRuleResult pattern_TypeParameter_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_12_1_preparereturnvalue_bindingFB(TypeParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypeParameter _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_12_1_preparereturnvalue_bindingAndBlackFFB(TypeParameter _this) {
		Object[] result_pattern_TypeParameter_12_1_preparereturnvalue_binding = pattern_TypeParameter_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypeParameter_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter_12_1_preparereturnvalue_black = pattern_TypeParameter_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypeParameter_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypeParameter_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypeParameter";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypeParameter_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("pg");
		EObject tmpTClass = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		if (tmpTClass instanceof TClass) {
			TClass tClass = (TClass) tmpTClass;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				return new Object[] { tClass, pg, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_12_2_corematch_blackFFBBB(TClass tClass, TypeGraph pg,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		boolean tClass_tLib = tClass.isTLib();
		if (Boolean.valueOf(tClass_tLib).equals(Boolean.valueOf(false))) {
			String tClass_tName = tClass.getTName();
			if (tClass_tName.equals("T")) {
				for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(pg, ModelToTypeGraph.class, "target")) {
					Model tmpEModel = eModelToPg.getSource();
					if (tmpEModel instanceof MGravityModel) {
						MGravityModel eModel = (MGravityModel) tmpEModel;
						_result.add(new Object[] { eModel, eModelToPg, tClass, pg, match });
					}

				}
			}

		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_12_3_findcontext_blackBBBB(MGravityModel eModel,
			ModelToTypeGraph eModelToPg, TClass tClass, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.equals(eModelToPg.getTarget())) {
			if (pg.getClasses().contains(tClass)) {
				if (eModel.equals(eModelToPg.getSource())) {
					if (pg.getOwnedTypes().contains(tClass)) {
						boolean tClass_tLib = tClass.isTLib();
						if (Boolean.valueOf(tClass_tLib).equals(Boolean.valueOf(false))) {
							String tClass_tName = tClass.getTName();
							if (tClass_tName.equals("T")) {
								_result.add(new Object[] { eModel, eModelToPg, tClass, pg });
							}

						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeParameter_12_3_findcontext_greenBBBBFFFFFF(MGravityModel eModel,
			ModelToTypeGraph eModelToPg, TClass tClass, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____classes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModelToPg__pg____target_name_prime = "target";
		String pg__tClass____classes_name_prime = "classes";
		String eModelToPg__eModel____source_name_prime = "source";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____pg_name_prime = "pg";
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(pg);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		pg__tClass____classes.setSrc(pg);
		pg__tClass____classes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____classes);
		eModelToPg__eModel____source.setSrc(eModelToPg);
		eModelToPg__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg__eModel____source);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____ownedTypes);
		tClass__pg____pg.setSrc(tClass);
		tClass__pg____pg.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tClass__pg____pg);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		pg__tClass____classes.setName(pg__tClass____classes_name_prime);
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____pg.setName(tClass__pg____pg_name_prime);
		return new Object[] { eModel, eModelToPg, tClass, pg, isApplicableMatch, eModelToPg__pg____target,
				pg__tClass____classes, eModelToPg__eModel____source, pg__tClass____ownedTypes, tClass__pg____pg };
	}

	public static final Object[] pattern_TypeParameter_12_4_solveCSP_bindingFBBBBBB(TypeParameter _this,
			IsApplicableMatch isApplicableMatch, MGravityModel eModel, ModelToTypeGraph eModelToPg, TClass tClass,
			TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eModel, eModelToPg, tClass, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModel, eModelToPg, tClass, pg };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_12_4_solveCSP_bindingAndBlackFBBBBBB(TypeParameter _this,
			IsApplicableMatch isApplicableMatch, MGravityModel eModel, ModelToTypeGraph eModelToPg, TClass tClass,
			TypeGraph pg) {
		Object[] result_pattern_TypeParameter_12_4_solveCSP_binding = pattern_TypeParameter_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModel, eModelToPg, tClass, pg);
		if (result_pattern_TypeParameter_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypeParameter_12_4_solveCSP_black = pattern_TypeParameter_12_4_solveCSP_blackB(csp);
			if (result_pattern_TypeParameter_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModel, eModelToPg, tClass, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_12_5_checkCSP_expressionFBB(TypeParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypeParameter_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypeParameter";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeParameter_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_20_1_preparereturnvalue_bindingFB(TypeParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeParameter _this) {
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

	public static final Object[] pattern_TypeParameter_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeParameter _this) {
		Object[] result_pattern_TypeParameter_20_1_preparereturnvalue_binding = pattern_TypeParameter_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeParameter_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter_20_1_preparereturnvalue_black = pattern_TypeParameter_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeParameter_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeParameter_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeParameter_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeParameter_20_2_testcorematchandDECs_black_nac_0B(TClass tClass) {
		for (TPackage __DEC_tClass_classes_117391 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "classes")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_20_2_testcorematchandDECs_black_nac_1BB(TClass tClass,
			TypeGraph pg) {
		for (TypeGraph __DEC_tClass_classes_437078 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tClass_classes_437078)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_20_2_testcorematchandDECs_black_nac_2B(TClass tClass) {
		TPackage __DEC_tClass_ownedTypes_459302 = tClass.getPackage();
		if (__DEC_tClass_ownedTypes_459302 != null) {
			return new Object[] { tClass };
		}

		return null;
	}

	public static final Object[] pattern_TypeParameter_20_2_testcorematchandDECs_black_nac_3B(TClass tClass) {
		TAbstractType __DEC_tClass_innerTypes_450812 = tClass.getOuterType();
		if (__DEC_tClass_innerTypes_450812 != null) {
			if (!tClass.equals(__DEC_tClass_innerTypes_450812)) {
				return new Object[] { tClass };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_classes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_classes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTClass = _edge_classes.getTrg();
			if (tmpTClass instanceof TClass) {
				TClass tClass = (TClass) tmpTClass;
				if (pg.getClasses().contains(tClass)) {
					if (pg.getOwnedTypes().contains(tClass)) {
						boolean tClass_tLib = tClass.isTLib();
						if (Boolean.valueOf(tClass_tLib).equals(Boolean.valueOf(false))) {
							String tClass_tName = tClass.getTName();
							if (tClass_tName.equals("T")) {
								if (pattern_TypeParameter_20_2_testcorematchandDECs_black_nac_0B(tClass) == null) {
									if (pattern_TypeParameter_20_2_testcorematchandDECs_black_nac_1BB(tClass,
											pg) == null) {
										if (pattern_TypeParameter_20_2_testcorematchandDECs_black_nac_2B(
												tClass) == null) {
											if (pattern_TypeParameter_20_2_testcorematchandDECs_black_nac_3B(
													tClass) == null) {
												_result.add(new Object[] { tClass, pg, _edge_classes });
											}
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

	public static final Object[] pattern_TypeParameter_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeParameter_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypeParameter _this, Match match, TClass tClass, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeParameter_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeParameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeParameter_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_21_1_preparereturnvalue_bindingFB(TypeParameter _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypeParameter _this) {
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

	public static final Object[] pattern_TypeParameter_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypeParameter _this) {
		Object[] result_pattern_TypeParameter_21_1_preparereturnvalue_binding = pattern_TypeParameter_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypeParameter_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypeParameter_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypeParameter_21_1_preparereturnvalue_black = pattern_TypeParameter_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypeParameter_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypeParameter_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypeParameter_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_TypeParameter_21_2_testcorematchandDECs_black_nac_0BB(
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel eModel) {
		for (MGravityModel __DEC_typeParameter_typeParameters_666605 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeParameter, MGravityModel.class, "typeParameters")) {
			if (!eModel.equals(__DEC_typeParameter_typeParameters_666605)) {
				return new Object[] { typeParameter, eModel };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_21_2_testcorematchandDECs_black_nac_1BB(
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel eModel) {
		for (Model __DEC_typeParameter_orphanTypes_287592 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeParameter, Model.class, "orphanTypes")) {
			if (!eModel.equals(__DEC_typeParameter_orphanTypes_287592)) {
				return new Object[] { typeParameter, eModel };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_21_2_testcorematchandDECs_black_nac_2BB(MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter) {
		if (eModel.getOrphanTypes().contains(typeParameter)) {
			return new Object[] { eModel, typeParameter };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_typeParameters) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEModel = _edge_typeParameters.getSrc();
		if (tmpEModel instanceof MGravityModel) {
			MGravityModel eModel = (MGravityModel) tmpEModel;
			EObject tmpTypeParameter = _edge_typeParameters.getTrg();
			if (tmpTypeParameter instanceof org.eclipse.modisco.java.TypeParameter) {
				org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) tmpTypeParameter;
				if (eModel.getTypeParameters().contains(typeParameter)) {
					if (pattern_TypeParameter_21_2_testcorematchandDECs_black_nac_0BB(typeParameter, eModel) == null) {
						if (pattern_TypeParameter_21_2_testcorematchandDECs_black_nac_1BB(typeParameter,
								eModel) == null) {
							if (pattern_TypeParameter_21_2_testcorematchandDECs_black_nac_2BB(eModel,
									typeParameter) == null) {
								_result.add(new Object[] { eModel, typeParameter, _edge_typeParameters });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypeParameter_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypeParameter_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypeParameter _this, Match match, MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eModel, typeParameter);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypeParameter_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypeParameter _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypeParameter_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_24_1_prepare_blackB(TypeParameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeParameter_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypeParameter_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eModel");
		EObject _localVariable_1 = sourceMatch.getObject("typeParameter");
		EObject _localVariable_2 = targetMatch.getObject("tClass");
		EObject _localVariable_3 = targetMatch.getObject("pg");
		EObject tmpEModel = _localVariable_0;
		EObject tmpTypeParameter = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		if (tmpEModel instanceof MGravityModel) {
			MGravityModel eModel = (MGravityModel) tmpEModel;
			if (tmpTypeParameter instanceof org.eclipse.modisco.java.TypeParameter) {
				org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) tmpTypeParameter;
				if (tmpTClass instanceof TClass) {
					TClass tClass = (TClass) tmpTClass;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						return new Object[] { eModel, typeParameter, tClass, pg, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_24_2_matchsrctrgcontext_blackBBBBBB(MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter, TClass tClass, TypeGraph pg, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			boolean tClass_tLib = tClass.isTLib();
			if (Boolean.valueOf(tClass_tLib).equals(Boolean.valueOf(false))) {
				String tClass_tName = tClass.getTName();
				if (tClass_tName.equals("T")) {
					return new Object[] { eModel, typeParameter, tClass, pg, sourceMatch, targetMatch };
				}

			}

		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_TypeParameter_24_2_matchsrctrgcontext_binding = pattern_TypeParameter_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_TypeParameter_24_2_matchsrctrgcontext_binding != null) {
			MGravityModel eModel = (MGravityModel) result_pattern_TypeParameter_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.modisco.java.TypeParameter typeParameter = (org.eclipse.modisco.java.TypeParameter) result_pattern_TypeParameter_24_2_matchsrctrgcontext_binding[1];
			TClass tClass = (TClass) result_pattern_TypeParameter_24_2_matchsrctrgcontext_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_TypeParameter_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_TypeParameter_24_2_matchsrctrgcontext_black = pattern_TypeParameter_24_2_matchsrctrgcontext_blackBBBBBB(
					eModel, typeParameter, tClass, pg, sourceMatch, targetMatch);
			if (result_pattern_TypeParameter_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { eModel, typeParameter, tClass, pg, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_24_3_solvecsp_bindingFBBBBBBB(TypeParameter _this,
			MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter, TClass tClass, TypeGraph pg,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(eModel, typeParameter, tClass, pg, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, eModel, typeParameter, tClass, pg, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_24_3_solvecsp_bindingAndBlackFBBBBBBB(TypeParameter _this,
			MGravityModel eModel, org.eclipse.modisco.java.TypeParameter typeParameter, TClass tClass, TypeGraph pg,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypeParameter_24_3_solvecsp_binding = pattern_TypeParameter_24_3_solvecsp_bindingFBBBBBBB(
				_this, eModel, typeParameter, tClass, pg, sourceMatch, targetMatch);
		if (result_pattern_TypeParameter_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypeParameter_24_3_solvecsp_black = pattern_TypeParameter_24_3_solvecsp_blackB(csp);
			if (result_pattern_TypeParameter_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, eModel, typeParameter, tClass, pg, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_24_5_matchcorrcontext_blackBFBBB(MGravityModel eModel,
			TypeGraph pg, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
					ModelToTypeGraph.class, "target")) {
				if (eModel.equals(eModelToPg.getSource())) {
					_result.add(new Object[] { eModel, eModelToPg, pg, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypeParameter_24_5_matchcorrcontext_greenBBBF(ModelToTypeGraph eModelToPg,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypeParameter";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eModelToPg);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eModelToPg, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypeParameter_24_6_createcorrespondence_blackBBBBB(MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter, TClass tClass, TypeGraph pg, CCMatch ccMatch) {
		return new Object[] { eModel, typeParameter, tClass, pg, ccMatch };
	}

	public static final Object[] pattern_TypeParameter_24_6_createcorrespondence_greenBFBB(
			org.eclipse.modisco.java.TypeParameter typeParameter, TClass tClass, CCMatch ccMatch) {
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eAnonymousClassDeclarationToTClass.setSource(typeParameter);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		ccMatch.getCreateCorr().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { typeParameter, eAnonymousClassDeclarationToTClass, tClass, ccMatch };
	}

	public static final Object[] pattern_TypeParameter_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypeParameter_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypeParameter";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypeParameter_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypeParameter_27_1_matchtggpattern_black_nac_0BB(
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel eModel) {
		for (MGravityModel __DEC_typeParameter_typeParameters_698571 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeParameter, MGravityModel.class, "typeParameters")) {
			if (!eModel.equals(__DEC_typeParameter_typeParameters_698571)) {
				return new Object[] { typeParameter, eModel };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_27_1_matchtggpattern_black_nac_1BB(
			org.eclipse.modisco.java.TypeParameter typeParameter, MGravityModel eModel) {
		for (Model __DEC_typeParameter_orphanTypes_457536 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeParameter, Model.class, "orphanTypes")) {
			if (!eModel.equals(__DEC_typeParameter_orphanTypes_457536)) {
				return new Object[] { typeParameter, eModel };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_27_1_matchtggpattern_black_nac_2BB(MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter) {
		if (eModel.getOrphanTypes().contains(typeParameter)) {
			return new Object[] { eModel, typeParameter };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_27_1_matchtggpattern_blackBB(MGravityModel eModel,
			org.eclipse.modisco.java.TypeParameter typeParameter) {
		if (eModel.getTypeParameters().contains(typeParameter)) {
			if (pattern_TypeParameter_27_1_matchtggpattern_black_nac_0BB(typeParameter, eModel) == null) {
				if (pattern_TypeParameter_27_1_matchtggpattern_black_nac_1BB(typeParameter, eModel) == null) {
					if (pattern_TypeParameter_27_1_matchtggpattern_black_nac_2BB(eModel, typeParameter) == null) {
						return new Object[] { eModel, typeParameter };
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_28_1_matchtggpattern_black_nac_0B(TClass tClass) {
		for (TPackage __DEC_tClass_classes_984096 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "classes")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_28_1_matchtggpattern_black_nac_1BB(TClass tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_classes_201798 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tClass_classes_201798)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_28_1_matchtggpattern_black_nac_2B(TClass tClass) {
		TPackage __DEC_tClass_ownedTypes_575676 = tClass.getPackage();
		if (__DEC_tClass_ownedTypes_575676 != null) {
			return new Object[] { tClass };
		}

		return null;
	}

	public static final Object[] pattern_TypeParameter_28_1_matchtggpattern_black_nac_3B(TClass tClass) {
		TAbstractType __DEC_tClass_innerTypes_604284 = tClass.getOuterType();
		if (__DEC_tClass_innerTypes_604284 != null) {
			if (!tClass.equals(__DEC_tClass_innerTypes_604284)) {
				return new Object[] { tClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_TypeParameter_28_1_matchtggpattern_blackBB(TClass tClass, TypeGraph pg) {
		if (pg.getClasses().contains(tClass)) {
			if (pg.getOwnedTypes().contains(tClass)) {
				if (pattern_TypeParameter_28_1_matchtggpattern_black_nac_0B(tClass) == null) {
					if (pattern_TypeParameter_28_1_matchtggpattern_black_nac_1BB(tClass, pg) == null) {
						if (pattern_TypeParameter_28_1_matchtggpattern_black_nac_2B(tClass) == null) {
							if (pattern_TypeParameter_28_1_matchtggpattern_black_nac_3B(tClass) == null) {
								return new Object[] { tClass, pg };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_28_1_matchtggpattern_greenB(TClass tClass) {
		boolean tClass_tLib_prime = Boolean.valueOf(false);
		String tClass_tName_prime = "T";
		tClass.setTLib(Boolean.valueOf(tClass_tLib_prime));
		tClass.setTName(tClass_tName_prime);
		return new Object[] { tClass };
	}

	public static final boolean pattern_TypeParameter_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypeParameter_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_29_1_createresult_blackB(TypeParameter _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypeParameter_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypeParameter_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MGravityModel eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToPg) {
		if (ruleResult.getCorrObjects().contains(eModelToPg)) {
			return new Object[] { ruleResult, eModelToPg };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypeParameter_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eModelToPgList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEModelToPg : eModelToPgList.getEntryObjects()) {
				if (tmpEModelToPg instanceof ModelToTypeGraph) {
					ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
					Model tmpEModel = eModelToPg.getSource();
					if (tmpEModel instanceof MGravityModel) {
						MGravityModel eModel = (MGravityModel) tmpEModel;
						TypeGraph pg = eModelToPg.getTarget();
						if (pg != null) {
							if (pattern_TypeParameter_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									eModelToPg) == null) {
								if (pattern_TypeParameter_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										eModel) == null) {
									if (pattern_TypeParameter_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											pg) == null) {
										_result.add(new Object[] { eModelToPgList, eModel, eModelToPg, pg,
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

	public static final Object[] pattern_TypeParameter_29_3_solveCSP_bindingFBBBBBB(TypeParameter _this,
			IsApplicableMatch isApplicableMatch, MGravityModel eModel, ModelToTypeGraph eModelToPg, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eModel, eModelToPg, pg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModel, eModelToPg, pg, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypeParameter_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypeParameter_29_3_solveCSP_bindingAndBlackFBBBBBB(TypeParameter _this,
			IsApplicableMatch isApplicableMatch, MGravityModel eModel, ModelToTypeGraph eModelToPg, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypeParameter_29_3_solveCSP_binding = pattern_TypeParameter_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModel, eModelToPg, pg, ruleResult);
		if (result_pattern_TypeParameter_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypeParameter_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypeParameter_29_3_solveCSP_black = pattern_TypeParameter_29_3_solveCSP_blackB(csp);
			if (result_pattern_TypeParameter_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModel, eModelToPg, pg, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypeParameter_29_4_checkCSP_expressionFBB(TypeParameter _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypeParameter_29_5_checknacs_blackBBB(MGravityModel eModel,
			ModelToTypeGraph eModelToPg, TypeGraph pg) {
		return new Object[] { eModel, eModelToPg, pg };
	}

	public static final Object[] pattern_TypeParameter_29_6_perform_blackBBBB(MGravityModel eModel,
			ModelToTypeGraph eModelToPg, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eModel, eModelToPg, pg, ruleResult };
	}

	public static final Object[] pattern_TypeParameter_29_6_perform_greenBFFFBB(MGravityModel eModel, TypeGraph pg,
			ModelgeneratorRuleResult ruleResult) {
		org.eclipse.modisco.java.TypeParameter typeParameter = JavaFactory.eINSTANCE.createTypeParameter();
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TClass tClass = BasicFactory.eINSTANCE.createTClass();
		boolean tClass_tLib_prime = Boolean.valueOf(false);
		String tClass_tName_prime = "T";
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eModel.getTypeParameters().add(typeParameter);
		ruleResult.getSourceObjects().add(typeParameter);
		eAnonymousClassDeclarationToTClass.setSource(typeParameter);
		ruleResult.getCorrObjects().add(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		pg.getClasses().add(tClass);
		pg.getOwnedTypes().add(tClass);
		ruleResult.getTargetObjects().add(tClass);
		tClass.setTLib(Boolean.valueOf(tClass_tLib_prime));
		tClass.setTName(tClass_tName_prime);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eModel, typeParameter, eAnonymousClassDeclarationToTClass, tClass, pg, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypeParameter_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypeParameterImpl
