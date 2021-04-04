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
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Model;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MGravityModel;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.UnresolvedTypeDeclaration;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TUnresolvedType;
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
 * An implementation of the model object '<em><b>Unresolved Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnresolvedTypeDeclarationImpl extends AbstractRuleImpl implements UnresolvedTypeDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedTypeDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUnresolvedTypeDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			MGravityModel eModel) {

		Object[] result1_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_0_1_initialbindings_blackBBBB(this, match, unresolvedType, eModel);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[unresolvedType] = " + unresolvedType + ", " + "[eModel] = " + eModel + ".");
		}

		Object[] result2_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, unresolvedType,
						eModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[unresolvedType] = " + unresolvedType + ", " + "[eModel] = " + eModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_0_4_collectelementstobetranslated_blackBBB(match, unresolvedType,
							eModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[unresolvedType] = " + unresolvedType + ", " + "[eModel] = " + eModel + ".");
			}
			UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_0_4_collectelementstobetranslated_greenBBBF(
					match, unresolvedType, eModel);
			//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result4_green[3];

			Object[] result5_black = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_0_5_collectcontextelements_blackBBB(match, unresolvedType,
							eModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[unresolvedType] = " + unresolvedType + ", " + "[eModel] = " + eModel + ".");
			}
			UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_0_5_collectcontextelements_greenBB(match,
					eModel);

			// 
			UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_0_6_registerobjectstomatch_expressionBBBB(
					this, match, unresolvedType, eModel);
			return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_0_7_expressionF();
		} else {
			return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result1_bindingAndBlack[0];
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[1];
		MGravityModel eModel = (MGravityModel) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_1_1_performtransformation_greenBFBFB(unresolvedType, pg, csp);
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result1_green[1];
		TUnresolvedType tClass = (TUnresolvedType) result1_green[3];

		Object[] result2_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_1_2_collecttranslatedelements_blackBBB(unresolvedType,
						eAnonymousClassDeclarationToTClass, tClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[unresolvedType] = "
					+ unresolvedType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[tClass] = " + tClass + ".");
		}
		Object[] result2_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_1_2_collecttranslatedelements_greenFBBB(unresolvedType,
						eAnonymousClassDeclarationToTClass, tClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, unresolvedType,
						eAnonymousClassDeclarationToTClass, eModelToPg, eModel, pg, tClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[unresolvedType] = " + unresolvedType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[eModel] = "
					+ eModel + ", " + "[pg] = " + pg + ", " + "[tClass] = " + tClass + ".");
		}
		UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, unresolvedType, eAnonymousClassDeclarationToTClass, eModel, pg, tClass);
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, unresolvedType, eAnonymousClassDeclarationToTClass, eModelToPg, eModel, pg, tClass);
		return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result2_binding[0];
		MGravityModel eModel = (MGravityModel) result2_binding[1];
		for (Object[] result2_black : UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_2_2_corematch_blackBFBFB(unresolvedType, eModel, match)) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_2_3_findcontext_blackBBBB(unresolvedType, eModelToPg, eModel,
							pg)) {
				Object[] result3_green = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_2_3_findcontext_greenBBBBFFFF(unresolvedType, eModelToPg,
								eModel, pg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								unresolvedType, eModelToPg, eModel, pg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[unresolvedType] = "
							+ unresolvedType + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[eModel] = " + eModel
							+ ", " + "[pg] = " + pg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = UnresolvedTypeDeclarationImpl
							.pattern_UnresolvedTypeDeclaration_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		match.registerObject("unresolvedType", unresolvedType);
		match.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.name", true, csp);
		var_unresolvedType_name.setValue(unresolvedType.getName());
		var_unresolvedType_name.setType("String");
		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.proxy", true,
				csp);
		var_unresolvedType_proxy.setValue(unresolvedType.isProxy());
		var_unresolvedType_proxy.setType("Boolean");

		// Create unbound variables
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tName", csp);
		var_tClass_tName.setType("String");
		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tLib", csp);
		var_tClass_tLib.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_unresolvedType_name, var_tClass_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_unresolvedType_proxy, var_tClass_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("unresolvedType", unresolvedType);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("eModel", eModel);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject unresolvedType,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg, EObject eModel, EObject pg,
			EObject tClass) {
		ruleresult.registerObject("unresolvedType", unresolvedType);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("eModelToPg", eModelToPg);
		ruleresult.registerObject("eModel", eModel);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tClass", tClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("unresolvedType").eClass())
				.equals("java.UnresolvedTypeDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph pg, TUnresolvedType tClass) {

		Object[] result1_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_10_1_initialbindings_blackBBBB(this, match, pg, tClass);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pg] = " + pg + ", " + "[tClass] = " + tClass + ".");
		}

		Object[] result2_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, pg, tClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pg] = " + pg + ", " + "[tClass] = " + tClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_10_4_collectelementstobetranslated_blackBBB(match, pg, tClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pg] = " + pg + ", " + "[tClass] = " + tClass + ".");
			}
			UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_10_4_collectelementstobetranslated_greenBBBFF(match, pg, tClass);
			//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result4_green[4];

			Object[] result5_black = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_10_5_collectcontextelements_blackBBB(match, pg, tClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pg] = " + pg + ", " + "[tClass] = " + tClass + ".");
			}
			UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_10_5_collectcontextelements_greenBB(match,
					pg);

			// 
			UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_10_6_registerobjectstomatch_expressionBBBB(
					this, match, pg, tClass);
			return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_10_7_expressionF();
		} else {
			return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[0];
		MGravityModel eModel = (MGravityModel) result1_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[2];
		TUnresolvedType tClass = (TUnresolvedType) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_11_1_performtransformation_greenFFBBB(eModel, tClass, csp);
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result1_green[0];
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result1_green[1];

		Object[] result2_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_11_2_collecttranslatedelements_blackBBB(unresolvedType,
						eAnonymousClassDeclarationToTClass, tClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[unresolvedType] = "
					+ unresolvedType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[tClass] = " + tClass + ".");
		}
		Object[] result2_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_11_2_collecttranslatedelements_greenFBBB(unresolvedType,
						eAnonymousClassDeclarationToTClass, tClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, unresolvedType,
						eAnonymousClassDeclarationToTClass, eModelToPg, eModel, pg, tClass);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[unresolvedType] = " + unresolvedType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[eModel] = "
					+ eModel + ", " + "[pg] = " + pg + ", " + "[tClass] = " + tClass + ".");
		}
		UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, unresolvedType, eAnonymousClassDeclarationToTClass, eModel, pg, tClass);
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, unresolvedType, eAnonymousClassDeclarationToTClass, eModelToPg, eModel, pg, tClass);
		return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph pg = (TypeGraph) result2_binding[0];
		TUnresolvedType tClass = (TUnresolvedType) result2_binding[1];
		for (Object[] result2_black : UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_12_2_corematch_blackFFBBB(pg, tClass, match)) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[0];
			MGravityModel eModel = (MGravityModel) result2_black[1];
			// ForEach 
			for (Object[] result3_black : UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_12_3_findcontext_blackBBBB(eModelToPg, eModel, pg, tClass)) {
				Object[] result3_green = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_12_3_findcontext_greenBBBBFFFFF(eModelToPg, eModel, pg,
								tClass);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								eModelToPg, eModel, pg, tClass);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModelToPg] = " + eModelToPg
							+ ", " + "[eModel] = " + eModel + ", " + "[pg] = " + pg + ", " + "[tClass] = " + tClass
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = UnresolvedTypeDeclarationImpl
							.pattern_UnresolvedTypeDeclaration_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph pg, TUnresolvedType tClass) {
		match.registerObject("pg", pg);
		match.registerObject("tClass", tClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pg, TUnresolvedType tClass) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg, TUnresolvedType tClass) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tName", true, csp);
		var_tClass_tName.setValue(tClass.getTName());
		var_tClass_tName.setType("String");
		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tLib", true, csp);
		var_tClass_tLib.setValue(tClass.isTLib());
		var_tClass_tLib.setType("Boolean");

		// Create unbound variables
		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.name", csp);
		var_unresolvedType_name.setType("String");
		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.proxy", csp);
		var_unresolvedType_proxy.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_unresolvedType_name, var_tClass_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_unresolvedType_proxy, var_tClass_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("tClass", tClass);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject unresolvedType,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg, EObject eModel, EObject pg,
			EObject tClass) {
		ruleresult.registerObject("unresolvedType", unresolvedType);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("eModelToPg", eModelToPg);
		ruleresult.registerObject("eModel", eModel);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("tClass", tClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tClass").eClass())
				.equals("basic.TUnresolvedType.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_25(EMoflonEdge _edge_ownedTypes) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_blackFFB(_edge_ownedTypes)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TUnresolvedType tClass = (TUnresolvedType) result2_black[1];
			Object[] result2_green = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, pg, tClass)) {
				// 
				if (UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = UnresolvedTypeDeclarationImpl
							.pattern_UnresolvedTypeDeclaration_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_27(EMoflonEdge _edge_unresolvedItems) {

		Object[] result1_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_blackFFB(_edge_unresolvedItems)) {
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result2_black[0];
			MGravityModel eModel = (MGravityModel) result2_black[1];
			Object[] result2_green = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, unresolvedType, eModel)) {
				// 
				if (UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = UnresolvedTypeDeclarationImpl
							.pattern_UnresolvedTypeDeclaration_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("UnresolvedTypeDeclaration");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_name.setValue(__helper.getValue("unresolvedType", "name"));
		var_unresolvedType_name.setType("String");

		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tName.setValue(__helper.getValue("tClass", "tName"));
		var_tClass_tName.setType("String");

		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tLib.setValue(__helper.getValue("tClass", "tLib"));
		var_tClass_tLib.setType("boolean");

		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_proxy.setValue(__helper.getValue("unresolvedType", "proxy"));
		var_unresolvedType_proxy.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("UnresolvedTypeDeclaration");
		eq0.solve(var_unresolvedType_name, var_tClass_tName);

		eq1.setRuleName("UnresolvedTypeDeclaration");
		eq1.solve(var_unresolvedType_proxy, var_tClass_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tClass_tName.setBound(false);
			var_tClass_tLib.setBound(false);
			eq0.solve(var_unresolvedType_name, var_tClass_tName);
			eq1.solve(var_unresolvedType_proxy, var_tClass_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tClass", "tName", var_tClass_tName.getValue());
				__helper.setValue("tClass", "tLib", var_tClass_tLib.getValue());
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
		ruleResult.setRule("UnresolvedTypeDeclaration");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_name.setValue(__helper.getValue("unresolvedType", "name"));
		var_unresolvedType_name.setType("String");

		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tName.setValue(__helper.getValue("tClass", "tName"));
		var_tClass_tName.setType("String");

		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tLib.setValue(__helper.getValue("tClass", "tLib"));
		var_tClass_tLib.setType("boolean");

		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_proxy.setValue(__helper.getValue("unresolvedType", "proxy"));
		var_unresolvedType_proxy.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("UnresolvedTypeDeclaration");
		eq0.solve(var_unresolvedType_name, var_tClass_tName);

		eq1.setRuleName("UnresolvedTypeDeclaration");
		eq1.solve(var_unresolvedType_proxy, var_tClass_tLib);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_unresolvedType_name.setBound(false);
			var_unresolvedType_proxy.setBound(false);
			eq0.solve(var_unresolvedType_name, var_tClass_tName);
			eq1.solve(var_unresolvedType_proxy, var_tClass_tLib);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("unresolvedType", "name", var_unresolvedType_name.getValue());
				__helper.setValue("unresolvedType", "proxy", var_unresolvedType_proxy.getValue());
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

		Object[] result1_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result2_bindingAndBlack[0];
		MGravityModel eModel = (MGravityModel) result2_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[2];
		TUnresolvedType tClass = (TUnresolvedType) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, unresolvedType, eModel,
						pg, tClass, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[unresolvedType] = " + unresolvedType + ", " + "[eModel] = " + eModel + ", " + "[pg] = " + pg
					+ ", " + "[tClass] = " + tClass + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_24_5_matchcorrcontext_blackFBBBB(eModel, pg, sourceMatch,
							targetMatch)) {
				ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result5_black[0];
				Object[] result5_green = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_24_5_matchcorrcontext_greenBBBF(eModelToPg, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_24_6_createcorrespondence_blackBBBBB(unresolvedType, eModel,
								pg, tClass, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[unresolvedType] = "
							+ unresolvedType + ", " + "[eModel] = " + eModel + ", " + "[pg] = " + pg + ", "
							+ "[tClass] = " + tClass + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_24_6_createcorrespondence_greenBFBB(
						unresolvedType, tClass, ccMatch);
				//nothing TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result6_green[1];

				Object[] result7_black = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			MGravityModel eModel, TypeGraph pg, TUnresolvedType tClass, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.name", true, csp);
		var_unresolvedType_name.setValue(unresolvedType.getName());
		var_unresolvedType_name.setType("String");
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tName", true, csp);
		var_tClass_tName.setValue(tClass.getTName());
		var_tClass_tName.setType("String");
		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.proxy", true,
				csp);
		var_unresolvedType_proxy.setValue(unresolvedType.isProxy());
		var_unresolvedType_proxy.setType("Boolean");
		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tLib", true, csp);
		var_tClass_tLib.setValue(tClass.isTLib());
		var_tClass_tLib.setType("Boolean");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_unresolvedType_name, var_tClass_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_unresolvedType_proxy, var_tClass_tLib);
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			MGravityModel eModel) {// 
		Object[] result1_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_blackBB(unresolvedType, eModel);
		if (result1_black != null) {
			return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_27_2_expressionF();
		} else {
			return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph pg, TUnresolvedType tClass) {// 
		Object[] result1_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_blackBB(pg, tClass);
		if (result1_black != null) {
			return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_28_2_expressionF();
		} else {
			return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph eModelToPgParameter) {

		Object[] result1_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eModelToPgList = (RuleEntryList) result2_black[0];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			MGravityModel eModel = (MGravityModel) result2_black[3];

			Object[] result3_bindingAndBlack = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							eModelToPg, eModel, pg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModelToPg] = " + eModelToPg + ", "
						+ "[eModel] = " + eModel + ", " + "[pg] = " + pg + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_29_5_checknacs_blackBBB(eModelToPg, eModel, pg);
				if (result5_black != null) {

					Object[] result6_black = UnresolvedTypeDeclarationImpl
							.pattern_UnresolvedTypeDeclaration_29_6_perform_blackBBBB(eModelToPg, eModel, pg,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eModelToPg] = "
								+ eModelToPg + ", " + "[eModel] = " + eModel + ", " + "[pg] = " + pg + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_29_6_perform_greenFFBBFBB(eModel,
							pg, ruleResult, csp);
					//nothing org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result6_green[0];
					//nothing TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result6_green[1];
					//nothing TUnresolvedType tClass = (TUnresolvedType) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.name", csp);
		var_unresolvedType_name.setType("String");
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tName", csp);
		var_tClass_tName.setType("String");
		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.proxy", csp);
		var_unresolvedType_proxy.setType("Boolean");
		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tLib", csp);
		var_tClass_tLib.setType("Boolean");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_unresolvedType_name, var_tClass_tName);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_unresolvedType_proxy, var_tClass_tLib);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("eModel", eModel);
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
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_FWD__MATCH_UNRESOLVEDTYPEDECLARATION_MGRAVITYMODEL:
			return isAppropriate_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(1),
					(MGravityModel) arguments.get(2));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_UNRESOLVEDTYPEDECLARATION_MGRAVITYMODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(1),
					(MGravityModel) arguments.get(2));
			return null;
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_UNRESOLVEDTYPEDECLARATION_MGRAVITYMODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(1),
					(MGravityModel) arguments.get(2));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_UNRESOLVEDTYPEDECLARATION_MODELTOTYPEGRAPH_MGRAVITYMODEL_TYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (MGravityModel) arguments.get(3),
					(TypeGraph) arguments.get(4));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TUNRESOLVEDTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TUnresolvedType) arguments.get(2));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TUNRESOLVEDTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TUnresolvedType) arguments.get(2));
			return null;
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TUNRESOLVEDTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TUnresolvedType) arguments.get(2));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_MGRAVITYMODEL_TYPEGRAPH_TUNRESOLVEDTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(MGravityModel) arguments.get(2), (TypeGraph) arguments.get(3), (TUnresolvedType) arguments.get(4));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_25__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_25((EMoflonEdge) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_27__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_27((EMoflonEdge) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_CC__UNRESOLVEDTYPEDECLARATION_MGRAVITYMODEL_TYPEGRAPH_TUNRESOLVEDTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(0),
					(MGravityModel) arguments.get(1), (TypeGraph) arguments.get(2), (TUnresolvedType) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_DEC_FWD__UNRESOLVEDTYPEDECLARATION_MGRAVITYMODEL:
			return checkDEC_FWD((org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(0),
					(MGravityModel) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_DEC_BWD__TYPEGRAPH_TUNRESOLVEDTYPE:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TUnresolvedType) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELTOTYPEGRAPH_MGRAVITYMODEL_TYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (ModelToTypeGraph) arguments.get(1),
					(MGravityModel) arguments.get(2), (TypeGraph) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_1_initialbindings_blackBBBB(
			UnresolvedTypeDeclaration _this, Match match,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		return new Object[] { _this, match, unresolvedType, eModel };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_bindingFBBBB(
			UnresolvedTypeDeclaration _this, Match match,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, unresolvedType, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, unresolvedType, eModel };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_bindingAndBlackFBBBB(
			UnresolvedTypeDeclaration _this, Match match,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		Object[] result_pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_binding = pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_bindingFBBBB(
				_this, match, unresolvedType, eModel);
		if (result_pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_black = pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, unresolvedType, eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_0_3_CheckCSP_expressionFBB(
			UnresolvedTypeDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		return new Object[] { match, unresolvedType, eModel };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(unresolvedType);
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		match.getToBeTranslatedEdges().add(eModel__unresolvedType____unresolvedItems);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		return new Object[] { match, unresolvedType, eModel, eModel__unresolvedType____unresolvedItems };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		return new Object[] { match, unresolvedType, eModel };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_5_collectcontextelements_greenBB(Match match,
			MGravityModel eModel) {
		match.getContextNodes().add(eModel);
		return new Object[] { match, eModel };
	}

	public static final void pattern_UnresolvedTypeDeclaration_0_6_registerobjectstomatch_expressionBBBB(
			UnresolvedTypeDeclaration _this, Match match,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		_this.registerObjectsToMatch_FWD(match, unresolvedType, eModel);

	}

	public static final boolean pattern_UnresolvedTypeDeclaration_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("unresolvedType");
		EObject _localVariable_1 = isApplicableMatch.getObject("eModelToPg");
		EObject _localVariable_2 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject tmpUnresolvedType = _localVariable_0;
		EObject tmpEModelToPg = _localVariable_1;
		EObject tmpEModel = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedTypeDeclaration) {
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) tmpUnresolvedType;
			if (tmpEModelToPg instanceof ModelToTypeGraph) {
				ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
				if (tmpEModel instanceof MGravityModel) {
					MGravityModel eModel = (MGravityModel) tmpEModel;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						return new Object[] { unresolvedType, eModelToPg, eModel, pg, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_1_performtransformation_blackBBBBFBB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg, UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { unresolvedType, eModelToPg, eModel, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_1_performtransformation_bindingAndBlackFFFFFBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding = pattern_UnresolvedTypeDeclaration_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding[0];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding[1];
			MGravityModel eModel = (MGravityModel) result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding[3];

			Object[] result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_black = pattern_UnresolvedTypeDeclaration_1_1_performtransformation_blackBBBBFBB(
					unresolvedType, eModelToPg, eModel, pg, _this, isApplicableMatch);
			if (result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_black[4];

				return new Object[] { unresolvedType, eModelToPg, eModel, pg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_1_performtransformation_greenBFBFB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, TypeGraph pg, CSP csp) {
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TUnresolvedType tClass = BasicFactory.eINSTANCE.createTUnresolvedType();
		Object _localVariable_0 = csp.getValue("tClass", "tName");
		Object _localVariable_1 = csp.getValue("tClass", "tLib");
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		pg.getOwnedTypes().add(tClass);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		String tClass_tName_prime = (String) _localVariable_0;
		boolean tClass_tLib_prime = (boolean) _localVariable_1;
		tClass.setTName(tClass_tName_prime);
		tClass.setTLib(Boolean.valueOf(tClass_tLib_prime));
		return new Object[] { unresolvedType, eAnonymousClassDeclarationToTClass, pg, tClass, csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_2_collecttranslatedelements_blackBBB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass, TUnresolvedType tClass) {
		return new Object[] { unresolvedType, eAnonymousClassDeclarationToTClass, tClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_2_collecttranslatedelements_greenFBBB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass, TUnresolvedType tClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(unresolvedType);
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		ruleresult.getCreatedElements().add(tClass);
		return new Object[] { ruleresult, unresolvedType, eAnonymousClassDeclarationToTClass, tClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject unresolvedType, EObject eAnonymousClassDeclarationToTClass,
			EObject eModelToPg, EObject eModel, EObject pg, EObject tClass) {
		if (!eAnonymousClassDeclarationToTClass.equals(unresolvedType)) {
			if (!eAnonymousClassDeclarationToTClass.equals(eModelToPg)) {
				if (!eAnonymousClassDeclarationToTClass.equals(eModel)) {
					if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
						if (!eAnonymousClassDeclarationToTClass.equals(tClass)) {
							if (!eModelToPg.equals(unresolvedType)) {
								if (!eModelToPg.equals(pg)) {
									if (!eModelToPg.equals(tClass)) {
										if (!eModel.equals(unresolvedType)) {
											if (!eModel.equals(eModelToPg)) {
												if (!eModel.equals(pg)) {
													if (!eModel.equals(tClass)) {
														if (!pg.equals(unresolvedType)) {
															if (!pg.equals(tClass)) {
																if (!tClass.equals(unresolvedType)) {
																	return new Object[] { ruleresult, unresolvedType,
																			eAnonymousClassDeclarationToTClass,
																			eModelToPg, eModel, pg, tClass };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject unresolvedType, EObject eAnonymousClassDeclarationToTClass,
			EObject eModel, EObject pg, EObject tClass) {
		EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UnresolvedTypeDeclaration";
		String eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime = "source";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____model_name_prime = "model";
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setTrg(unresolvedType);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__unresolvedType____source);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		ruleresult.getCreatedEdges().add(pg__tClass____ownedTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tClass__pg____model);
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		ruleresult.getTranslatedEdges().add(eModel__unresolvedType____unresolvedItems);
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tClass____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eAnonymousClassDeclarationToTClass__unresolvedType____source
				.setName(eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		return new Object[] { ruleresult, unresolvedType, eAnonymousClassDeclarationToTClass, eModel, pg, tClass,
				eAnonymousClassDeclarationToTClass__unresolvedType____source, pg__tClass____ownedTypes,
				tClass__pg____model, eModel__unresolvedType____unresolvedItems,
				eAnonymousClassDeclarationToTClass__tClass____target };
	}

	public static final void pattern_UnresolvedTypeDeclaration_1_5_registerobjects_expressionBBBBBBBB(
			UnresolvedTypeDeclaration _this, PerformRuleResult ruleresult, EObject unresolvedType,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg, EObject eModel, EObject pg,
			EObject tClass) {
		_this.registerObjects_FWD(ruleresult, unresolvedType, eAnonymousClassDeclarationToTClass, eModelToPg, eModel,
				pg, tClass);

	}

	public static final PerformRuleResult pattern_UnresolvedTypeDeclaration_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_bindingFB(
			UnresolvedTypeDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_blackFBB(EClass eClass,
			UnresolvedTypeDeclaration _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_bindingAndBlackFFB(
			UnresolvedTypeDeclaration _this) {
		Object[] result_pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_binding = pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_black = pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "UnresolvedTypeDeclaration";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("unresolvedType");
		EObject _localVariable_1 = match.getObject("eModel");
		EObject tmpUnresolvedType = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedTypeDeclaration) {
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) tmpUnresolvedType;
			if (tmpEModel instanceof MGravityModel) {
				MGravityModel eModel = (MGravityModel) tmpEModel;
				return new Object[] { unresolvedType, eModel, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_2_2_corematch_blackBFBFB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(eModel,
				ModelToTypeGraph.class, "source")) {
			TypeGraph pg = eModelToPg.getTarget();
			if (pg != null) {
				_result.add(new Object[] { unresolvedType, eModelToPg, eModel, pg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_2_3_findcontext_blackBBBB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (eModel.getUnresolvedItems().contains(unresolvedType)) {
			if (pg.equals(eModelToPg.getTarget())) {
				if (eModel.equals(eModelToPg.getSource())) {
					_result.add(new Object[] { unresolvedType, eModelToPg, eModel, pg });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_3_findcontext_greenBBBBFFFF(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		String eModelToPg__pg____target_name_prime = "target";
		String eModelToPg__eModel____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(unresolvedType);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(pg);
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		isApplicableMatch.getAllContextElements().add(eModel__unresolvedType____unresolvedItems);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		eModelToPg__eModel____source.setSrc(eModelToPg);
		eModelToPg__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg__eModel____source);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		return new Object[] { unresolvedType, eModelToPg, eModel, pg, isApplicableMatch,
				eModel__unresolvedType____unresolvedItems, eModelToPg__pg____target, eModelToPg__eModel____source };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_4_solveCSP_bindingFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, unresolvedType, eModelToPg, eModel,
				pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, unresolvedType, eModelToPg, eModel, pg };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg) {
		Object[] result_pattern_UnresolvedTypeDeclaration_2_4_solveCSP_binding = pattern_UnresolvedTypeDeclaration_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, unresolvedType, eModelToPg, eModel, pg);
		if (result_pattern_UnresolvedTypeDeclaration_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_2_4_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_2_4_solveCSP_black = pattern_UnresolvedTypeDeclaration_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, unresolvedType, eModelToPg, eModel, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_2_5_checkCSP_expressionFBB(
			UnresolvedTypeDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UnresolvedTypeDeclaration";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedTypeDeclaration_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_10_1_initialbindings_blackBBBB(
			UnresolvedTypeDeclaration _this, Match match, TypeGraph pg, TUnresolvedType tClass) {
		return new Object[] { _this, match, pg, tClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_bindingFBBBB(
			UnresolvedTypeDeclaration _this, Match match, TypeGraph pg, TUnresolvedType tClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pg, tClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pg, tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_bindingAndBlackFBBBB(
			UnresolvedTypeDeclaration _this, Match match, TypeGraph pg, TUnresolvedType tClass) {
		Object[] result_pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_binding = pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_bindingFBBBB(
				_this, match, pg, tClass);
		if (result_pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_black = pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pg, tClass };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_10_3_CheckCSP_expressionFBB(
			UnresolvedTypeDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_10_4_collectelementstobetranslated_blackBBB(
			Match match, TypeGraph pg, TUnresolvedType tClass) {
		return new Object[] { match, pg, tClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TypeGraph pg, TUnresolvedType tClass) {
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tClass);
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____model_name_prime = "model";
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		match.getToBeTranslatedEdges().add(pg__tClass____ownedTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tClass__pg____model);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		return new Object[] { match, pg, tClass, pg__tClass____ownedTypes, tClass__pg____model };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_10_5_collectcontextelements_blackBBB(Match match,
			TypeGraph pg, TUnresolvedType tClass) {
		return new Object[] { match, pg, tClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_10_5_collectcontextelements_greenBB(Match match,
			TypeGraph pg) {
		match.getContextNodes().add(pg);
		return new Object[] { match, pg };
	}

	public static final void pattern_UnresolvedTypeDeclaration_10_6_registerobjectstomatch_expressionBBBB(
			UnresolvedTypeDeclaration _this, Match match, TypeGraph pg, TUnresolvedType tClass) {
		_this.registerObjectsToMatch_BWD(match, pg, tClass);

	}

	public static final boolean pattern_UnresolvedTypeDeclaration_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eModelToPg");
		EObject _localVariable_1 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("pg");
		EObject _localVariable_3 = isApplicableMatch.getObject("tClass");
		EObject tmpEModelToPg = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpTClass = _localVariable_3;
		if (tmpEModelToPg instanceof ModelToTypeGraph) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
			if (tmpEModel instanceof MGravityModel) {
				MGravityModel eModel = (MGravityModel) tmpEModel;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpTClass instanceof TUnresolvedType) {
						TUnresolvedType tClass = (TUnresolvedType) tmpTClass;
						return new Object[] { eModelToPg, eModel, pg, tClass, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_1_performtransformation_blackBBBBFBB(
			ModelToTypeGraph eModelToPg, MGravityModel eModel, TypeGraph pg, TUnresolvedType tClass,
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { eModelToPg, eModel, pg, tClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_1_performtransformation_bindingAndBlackFFFFFBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding = pattern_UnresolvedTypeDeclaration_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding != null) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding[0];
			MGravityModel eModel = (MGravityModel) result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding[2];
			TUnresolvedType tClass = (TUnresolvedType) result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding[3];

			Object[] result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_black = pattern_UnresolvedTypeDeclaration_11_1_performtransformation_blackBBBBFBB(
					eModelToPg, eModel, pg, tClass, _this, isApplicableMatch);
			if (result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_black[4];

				return new Object[] { eModelToPg, eModel, pg, tClass, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_1_performtransformation_greenFFBBB(
			MGravityModel eModel, TUnresolvedType tClass, CSP csp) {
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = JavaFactory.eINSTANCE
				.createUnresolvedTypeDeclaration();
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("unresolvedType", "name");
		Object _localVariable_1 = csp.getValue("unresolvedType", "proxy");
		eModel.getUnresolvedItems().add(unresolvedType);
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		String unresolvedType_name_prime = (String) _localVariable_0;
		boolean unresolvedType_proxy_prime = (boolean) _localVariable_1;
		unresolvedType.setName(unresolvedType_name_prime);
		unresolvedType.setProxy(Boolean.valueOf(unresolvedType_proxy_prime));
		return new Object[] { unresolvedType, eAnonymousClassDeclarationToTClass, eModel, tClass, csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_2_collecttranslatedelements_blackBBB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass, TUnresolvedType tClass) {
		return new Object[] { unresolvedType, eAnonymousClassDeclarationToTClass, tClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_2_collecttranslatedelements_greenFBBB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass, TUnresolvedType tClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(unresolvedType);
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		ruleresult.getTranslatedElements().add(tClass);
		return new Object[] { ruleresult, unresolvedType, eAnonymousClassDeclarationToTClass, tClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject unresolvedType, EObject eAnonymousClassDeclarationToTClass,
			EObject eModelToPg, EObject eModel, EObject pg, EObject tClass) {
		if (!eAnonymousClassDeclarationToTClass.equals(unresolvedType)) {
			if (!eAnonymousClassDeclarationToTClass.equals(eModelToPg)) {
				if (!eAnonymousClassDeclarationToTClass.equals(eModel)) {
					if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
						if (!eAnonymousClassDeclarationToTClass.equals(tClass)) {
							if (!eModelToPg.equals(unresolvedType)) {
								if (!eModelToPg.equals(pg)) {
									if (!eModelToPg.equals(tClass)) {
										if (!eModel.equals(unresolvedType)) {
											if (!eModel.equals(eModelToPg)) {
												if (!eModel.equals(pg)) {
													if (!eModel.equals(tClass)) {
														if (!pg.equals(unresolvedType)) {
															if (!pg.equals(tClass)) {
																if (!tClass.equals(unresolvedType)) {
																	return new Object[] { ruleresult, unresolvedType,
																			eAnonymousClassDeclarationToTClass,
																			eModelToPg, eModel, pg, tClass };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject unresolvedType, EObject eAnonymousClassDeclarationToTClass,
			EObject eModel, EObject pg, EObject tClass) {
		EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UnresolvedTypeDeclaration";
		String eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime = "source";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____model_name_prime = "model";
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setTrg(unresolvedType);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__unresolvedType____source);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(pg__tClass____ownedTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tClass__pg____model);
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		ruleresult.getCreatedEdges().add(eModel__unresolvedType____unresolvedItems);
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tClass____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eAnonymousClassDeclarationToTClass__unresolvedType____source
				.setName(eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		return new Object[] { ruleresult, unresolvedType, eAnonymousClassDeclarationToTClass, eModel, pg, tClass,
				eAnonymousClassDeclarationToTClass__unresolvedType____source, pg__tClass____ownedTypes,
				tClass__pg____model, eModel__unresolvedType____unresolvedItems,
				eAnonymousClassDeclarationToTClass__tClass____target };
	}

	public static final void pattern_UnresolvedTypeDeclaration_11_5_registerobjects_expressionBBBBBBBB(
			UnresolvedTypeDeclaration _this, PerformRuleResult ruleresult, EObject unresolvedType,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg, EObject eModel, EObject pg,
			EObject tClass) {
		_this.registerObjects_BWD(ruleresult, unresolvedType, eAnonymousClassDeclarationToTClass, eModelToPg, eModel,
				pg, tClass);

	}

	public static final PerformRuleResult pattern_UnresolvedTypeDeclaration_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_bindingFB(
			UnresolvedTypeDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_blackFBB(EClass eClass,
			UnresolvedTypeDeclaration _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_bindingAndBlackFFB(
			UnresolvedTypeDeclaration _this) {
		Object[] result_pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_binding = pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_black = pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "UnresolvedTypeDeclaration";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pg");
		EObject _localVariable_1 = match.getObject("tClass");
		EObject tmpPg = _localVariable_0;
		EObject tmpTClass = _localVariable_1;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpTClass instanceof TUnresolvedType) {
				TUnresolvedType tClass = (TUnresolvedType) tmpTClass;
				return new Object[] { pg, tClass, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_12_2_corematch_blackFFBBB(TypeGraph pg,
			TUnresolvedType tClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
				ModelToTypeGraph.class, "target")) {
			Model tmpEModel = eModelToPg.getSource();
			if (tmpEModel instanceof MGravityModel) {
				MGravityModel eModel = (MGravityModel) tmpEModel;
				_result.add(new Object[] { eModelToPg, eModel, pg, tClass, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_12_3_findcontext_blackBBBB(
			ModelToTypeGraph eModelToPg, MGravityModel eModel, TypeGraph pg, TUnresolvedType tClass) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.getOwnedTypes().contains(tClass)) {
			if (pg.equals(eModelToPg.getTarget())) {
				if (eModel.equals(eModelToPg.getSource())) {
					_result.add(new Object[] { eModelToPg, eModel, pg, tClass });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_3_findcontext_greenBBBBFFFFF(
			ModelToTypeGraph eModelToPg, MGravityModel eModel, TypeGraph pg, TUnresolvedType tClass) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____model_name_prime = "model";
		String eModelToPg__pg____target_name_prime = "target";
		String eModelToPg__eModel____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(tClass);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____ownedTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tClass__pg____model);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		eModelToPg__eModel____source.setSrc(eModelToPg);
		eModelToPg__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg__eModel____source);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		return new Object[] { eModelToPg, eModel, pg, tClass, isApplicableMatch, pg__tClass____ownedTypes,
				tClass__pg____model, eModelToPg__pg____target, eModelToPg__eModel____source };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_4_solveCSP_bindingFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg, TUnresolvedType tClass) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eModelToPg, eModel, pg, tClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModelToPg, eModel, pg, tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg, TUnresolvedType tClass) {
		Object[] result_pattern_UnresolvedTypeDeclaration_12_4_solveCSP_binding = pattern_UnresolvedTypeDeclaration_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModelToPg, eModel, pg, tClass);
		if (result_pattern_UnresolvedTypeDeclaration_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_12_4_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_12_4_solveCSP_black = pattern_UnresolvedTypeDeclaration_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModelToPg, eModel, pg, tClass };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_12_5_checkCSP_expressionFBB(
			UnresolvedTypeDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UnresolvedTypeDeclaration";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedTypeDeclaration_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_bindingFB(
			UnresolvedTypeDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			UnresolvedTypeDeclaration _this) {
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

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_bindingAndBlackFFBF(
			UnresolvedTypeDeclaration _this) {
		Object[] result_pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_binding = pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_black = pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_0B(
			TUnresolvedType tClass) {
		TPackage __DEC_tClass_ownedTypes_770496 = tClass.getPackage();
		if (__DEC_tClass_ownedTypes_770496 != null) {
			return new Object[] { tClass };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_1B(
			TUnresolvedType tClass) {
		TAbstractType __DEC_tClass_innerTypes_302392 = tClass.getOuterType();
		if (__DEC_tClass_innerTypes_302392 != null) {
			if (!tClass.equals(__DEC_tClass_innerTypes_302392)) {
				return new Object[] { tClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_2B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_classes_402179 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "classes")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_3BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_classes_636008 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tClass_classes_636008)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_4B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_interfaces_507342 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "interfaces")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_5BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_interfaces_771602 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "interfaces")) {
			if (!pg.equals(__DEC_tClass_interfaces_771602)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_6BB(TypeGraph pg,
			TUnresolvedType tClass) {
		if (pg.getClasses().contains(tClass)) {
			return new Object[] { pg, tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_7BB(TypeGraph pg,
			TUnresolvedType tClass) {
		if (pg.getInterfaces().contains(tClass)) {
			return new Object[] { pg, tClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_ownedTypes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTClass = _edge_ownedTypes.getTrg();
			if (tmpTClass instanceof TUnresolvedType) {
				TUnresolvedType tClass = (TUnresolvedType) tmpTClass;
				if (pg.getOwnedTypes().contains(tClass)) {
					if (pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_0B(tClass) == null) {
						if (pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_1B(tClass) == null) {
							if (pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_2B(
									tClass) == null) {
								if (pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_3BB(tClass,
										pg) == null) {
									if (pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_4B(
											tClass) == null) {
										if (pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_5BB(
												tClass, pg) == null) {
											if (pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_6BB(
													pg, tClass) == null) {
												if (pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_7BB(
														pg, tClass) == null) {
													_result.add(new Object[] { pg, tClass, _edge_ownedTypes });
												}
											}
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

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UnresolvedTypeDeclaration_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			UnresolvedTypeDeclaration _this, Match match, TypeGraph pg, TUnresolvedType tClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg, tClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			UnresolvedTypeDeclaration _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_UnresolvedTypeDeclaration_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_bindingFB(
			UnresolvedTypeDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			UnresolvedTypeDeclaration _this) {
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

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_bindingAndBlackFFBF(
			UnresolvedTypeDeclaration _this) {
		Object[] result_pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_binding = pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_black = pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		AbstractTypeDeclaration __DEC_unresolvedType_abstractTypeDeclaration_350111 = unresolvedType
				.getAbstractTypeDeclaration();
		if (__DEC_unresolvedType_abstractTypeDeclaration_350111 != null) {
			if (!unresolvedType.equals(__DEC_unresolvedType_abstractTypeDeclaration_350111)) {
				return new Object[] { unresolvedType };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_1B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		AnonymousClassDeclaration __DEC_unresolvedType_anonymousClassDeclarationOwner_501802 = unresolvedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_unresolvedType_anonymousClassDeclarationOwner_501802 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_2BB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		for (Model __DEC_unresolvedType_orphanTypes_465293 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(unresolvedType, Model.class, "orphanTypes")) {
			if (!eModel.equals(__DEC_unresolvedType_orphanTypes_465293)) {
				return new Object[] { unresolvedType, eModel };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_3B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		org.eclipse.modisco.java.Package __DEC_unresolvedType_ownedElements_701724 = unresolvedType.getPackage();
		if (__DEC_unresolvedType_ownedElements_701724 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_4B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		for (MAbstractMethodDefinition __DEC_unresolvedType_mInnerTypes_303033 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(unresolvedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { unresolvedType };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_5BB(
			MGravityModel eModel, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		if (eModel.getOrphanTypes().contains(unresolvedType)) {
			return new Object[] { eModel, unresolvedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_unresolvedItems) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEModel = _edge_unresolvedItems.getSrc();
		if (tmpEModel instanceof MGravityModel) {
			MGravityModel eModel = (MGravityModel) tmpEModel;
			EObject tmpUnresolvedType = _edge_unresolvedItems.getTrg();
			if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedTypeDeclaration) {
				org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) tmpUnresolvedType;
				if (eModel.getUnresolvedItems().contains(unresolvedType)) {
					if (pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_0B(
							unresolvedType) == null) {
						if (pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_1B(
								unresolvedType) == null) {
							if (pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_2BB(
									unresolvedType, eModel) == null) {
								if (pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_3B(
										unresolvedType) == null) {
									if (pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_4B(
											unresolvedType) == null) {
										if (pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_5BB(
												eModel, unresolvedType) == null) {
											_result.add(new Object[] { unresolvedType, eModel, _edge_unresolvedItems });
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

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UnresolvedTypeDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			UnresolvedTypeDeclaration _this, Match match,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, unresolvedType, eModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			UnresolvedTypeDeclaration _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_UnresolvedTypeDeclaration_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_1_prepare_blackB(
			UnresolvedTypeDeclaration _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("unresolvedType");
		EObject _localVariable_1 = sourceMatch.getObject("eModel");
		EObject _localVariable_2 = targetMatch.getObject("pg");
		EObject _localVariable_3 = targetMatch.getObject("tClass");
		EObject tmpUnresolvedType = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpTClass = _localVariable_3;
		if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedTypeDeclaration) {
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) tmpUnresolvedType;
			if (tmpEModel instanceof MGravityModel) {
				MGravityModel eModel = (MGravityModel) tmpEModel;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpTClass instanceof TUnresolvedType) {
						TUnresolvedType tClass = (TUnresolvedType) tmpTClass;
						return new Object[] { unresolvedType, eModel, pg, tClass, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel, TypeGraph pg,
			TUnresolvedType tClass, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { unresolvedType, eModel, pg, tClass, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding = pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding[0];
			MGravityModel eModel = (MGravityModel) result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding[2];
			TUnresolvedType tClass = (TUnresolvedType) result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_black = pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_blackBBBBBB(
					unresolvedType, eModel, pg, tClass, sourceMatch, targetMatch);
			if (result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { unresolvedType, eModel, pg, tClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_3_solvecsp_bindingFBBBBBBB(
			UnresolvedTypeDeclaration _this, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			MGravityModel eModel, TypeGraph pg, TUnresolvedType tClass, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(unresolvedType, eModel, pg, tClass, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, unresolvedType, eModel, pg, tClass, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			UnresolvedTypeDeclaration _this, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			MGravityModel eModel, TypeGraph pg, TUnresolvedType tClass, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration_24_3_solvecsp_binding = pattern_UnresolvedTypeDeclaration_24_3_solvecsp_bindingFBBBBBBB(
				_this, unresolvedType, eModel, pg, tClass, sourceMatch, targetMatch);
		if (result_pattern_UnresolvedTypeDeclaration_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_24_3_solvecsp_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_24_3_solvecsp_black = pattern_UnresolvedTypeDeclaration_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, unresolvedType, eModel, pg, tClass, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_24_5_matchcorrcontext_blackFBBBB(
			MGravityModel eModel, TypeGraph pg, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
					ModelToTypeGraph.class, "target")) {
				if (eModel.equals(eModelToPg.getSource())) {
					_result.add(new Object[] { eModelToPg, eModel, pg, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_5_matchcorrcontext_greenBBBF(
			ModelToTypeGraph eModelToPg, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "UnresolvedTypeDeclaration";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eModelToPg);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eModelToPg, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel, TypeGraph pg,
			TUnresolvedType tClass, CCMatch ccMatch) {
		return new Object[] { unresolvedType, eModel, pg, tClass, ccMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_6_createcorrespondence_greenBFBB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, TUnresolvedType tClass,
			CCMatch ccMatch) {
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		ccMatch.getCreateCorr().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { unresolvedType, eAnonymousClassDeclarationToTClass, tClass, ccMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "UnresolvedTypeDeclaration";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedTypeDeclaration_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_0B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		AbstractTypeDeclaration __DEC_unresolvedType_abstractTypeDeclaration_480144 = unresolvedType
				.getAbstractTypeDeclaration();
		if (__DEC_unresolvedType_abstractTypeDeclaration_480144 != null) {
			if (!unresolvedType.equals(__DEC_unresolvedType_abstractTypeDeclaration_480144)) {
				return new Object[] { unresolvedType };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_1B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		AnonymousClassDeclaration __DEC_unresolvedType_anonymousClassDeclarationOwner_295872 = unresolvedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_unresolvedType_anonymousClassDeclarationOwner_295872 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_2BB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		for (Model __DEC_unresolvedType_orphanTypes_144430 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(unresolvedType, Model.class, "orphanTypes")) {
			if (!eModel.equals(__DEC_unresolvedType_orphanTypes_144430)) {
				return new Object[] { unresolvedType, eModel };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_3B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		org.eclipse.modisco.java.Package __DEC_unresolvedType_ownedElements_498381 = unresolvedType.getPackage();
		if (__DEC_unresolvedType_ownedElements_498381 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_4B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		for (MAbstractMethodDefinition __DEC_unresolvedType_mInnerTypes_212387 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(unresolvedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { unresolvedType };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_5BB(
			MGravityModel eModel, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		if (eModel.getOrphanTypes().contains(unresolvedType)) {
			return new Object[] { eModel, unresolvedType };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		if (eModel.getUnresolvedItems().contains(unresolvedType)) {
			if (pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_0B(unresolvedType) == null) {
				if (pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_1B(unresolvedType) == null) {
					if (pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_2BB(unresolvedType,
							eModel) == null) {
						if (pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_3B(
								unresolvedType) == null) {
							if (pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_4B(
									unresolvedType) == null) {
								if (pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_5BB(eModel,
										unresolvedType) == null) {
									return new Object[] { unresolvedType, eModel };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_0B(
			TUnresolvedType tClass) {
		TPackage __DEC_tClass_ownedTypes_840141 = tClass.getPackage();
		if (__DEC_tClass_ownedTypes_840141 != null) {
			return new Object[] { tClass };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_1B(
			TUnresolvedType tClass) {
		TAbstractType __DEC_tClass_innerTypes_264449 = tClass.getOuterType();
		if (__DEC_tClass_innerTypes_264449 != null) {
			if (!tClass.equals(__DEC_tClass_innerTypes_264449)) {
				return new Object[] { tClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_2B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_classes_38321 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "classes")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_3BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_classes_449954 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tClass_classes_449954)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_4B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_interfaces_8958 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "interfaces")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_5BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_interfaces_468275 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "interfaces")) {
			if (!pg.equals(__DEC_tClass_interfaces_468275)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_6BB(TypeGraph pg,
			TUnresolvedType tClass) {
		if (pg.getClasses().contains(tClass)) {
			return new Object[] { pg, tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_7BB(TypeGraph pg,
			TUnresolvedType tClass) {
		if (pg.getInterfaces().contains(tClass)) {
			return new Object[] { pg, tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_blackBB(TypeGraph pg,
			TUnresolvedType tClass) {
		if (pg.getOwnedTypes().contains(tClass)) {
			if (pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_0B(tClass) == null) {
				if (pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_1B(tClass) == null) {
					if (pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_2B(tClass) == null) {
						if (pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_3BB(tClass, pg) == null) {
							if (pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_4B(tClass) == null) {
								if (pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_5BB(tClass,
										pg) == null) {
									if (pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_6BB(pg,
											tClass) == null) {
										if (pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_7BB(pg,
												tClass) == null) {
											return new Object[] { pg, tClass };
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

	public static final boolean pattern_UnresolvedTypeDeclaration_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_1_createresult_blackB(
			UnresolvedTypeDeclaration _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToPg) {
		if (ruleResult.getCorrObjects().contains(eModelToPg)) {
			return new Object[] { ruleResult, eModelToPg };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, MGravityModel eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eModelToPgList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEModelToPg : eModelToPgList.getEntryObjects()) {
				if (tmpEModelToPg instanceof ModelToTypeGraph) {
					ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
					TypeGraph pg = eModelToPg.getTarget();
					if (pg != null) {
						Model tmpEModel = eModelToPg.getSource();
						if (tmpEModel instanceof MGravityModel) {
							MGravityModel eModel = (MGravityModel) tmpEModel;
							if (pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									eModelToPg) == null) {
								if (pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_black_nac_1BB(ruleResult,
										pg) == null) {
									if (pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, eModel) == null) {
										_result.add(new Object[] { eModelToPgList, eModelToPg, pg, eModel,
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

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_3_solveCSP_bindingFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eModelToPg, eModel, pg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModelToPg, eModel, pg, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch, ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UnresolvedTypeDeclaration_29_3_solveCSP_binding = pattern_UnresolvedTypeDeclaration_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, eModelToPg, eModel, pg, ruleResult);
		if (result_pattern_UnresolvedTypeDeclaration_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_29_3_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_29_3_solveCSP_black = pattern_UnresolvedTypeDeclaration_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModelToPg, eModel, pg, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_29_4_checkCSP_expressionFBB(
			UnresolvedTypeDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_5_checknacs_blackBBB(ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg) {
		return new Object[] { eModelToPg, eModel, pg };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_6_perform_blackBBBB(ModelToTypeGraph eModelToPg,
			MGravityModel eModel, TypeGraph pg, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eModelToPg, eModel, pg, ruleResult };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_6_perform_greenFFBBFBB(MGravityModel eModel,
			TypeGraph pg, ModelgeneratorRuleResult ruleResult, CSP csp) {
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = JavaFactory.eINSTANCE
				.createUnresolvedTypeDeclaration();
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		TUnresolvedType tClass = BasicFactory.eINSTANCE.createTUnresolvedType();
		Object _localVariable_0 = csp.getValue("unresolvedType", "name");
		Object _localVariable_1 = csp.getValue("unresolvedType", "proxy");
		Object _localVariable_2 = csp.getValue("tClass", "tName");
		Object _localVariable_3 = csp.getValue("tClass", "tLib");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		eModel.getUnresolvedItems().add(unresolvedType);
		ruleResult.getSourceObjects().add(unresolvedType);
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		ruleResult.getCorrObjects().add(eAnonymousClassDeclarationToTClass);
		pg.getOwnedTypes().add(tClass);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		ruleResult.getTargetObjects().add(tClass);
		String unresolvedType_name_prime = (String) _localVariable_0;
		boolean unresolvedType_proxy_prime = (boolean) _localVariable_1;
		String tClass_tName_prime = (String) _localVariable_2;
		boolean tClass_tLib_prime = (boolean) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		unresolvedType.setName(unresolvedType_name_prime);
		unresolvedType.setProxy(Boolean.valueOf(unresolvedType_proxy_prime));
		tClass.setTName(tClass_tName_prime);
		tClass.setTLib(Boolean.valueOf(tClass_tLib_prime));
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { unresolvedType, eAnonymousClassDeclarationToTClass, eModel, pg, tClass, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UnresolvedTypeDeclaration_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UnresolvedTypeDeclarationImpl
