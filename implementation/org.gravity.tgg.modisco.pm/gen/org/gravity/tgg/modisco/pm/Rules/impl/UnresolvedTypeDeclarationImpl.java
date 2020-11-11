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
	public boolean isAppropriate_FWD(Match match, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {

		Object[] result1_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_0_1_initialbindings_blackBBBB(this, match, eModel, unresolvedType);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[eModel] = " + eModel + ", " + "[unresolvedType] = " + unresolvedType + ".");
		}

		Object[] result2_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, eModel,
						unresolvedType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[eModel] = " + eModel + ", " + "[unresolvedType] = " + unresolvedType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_0_4_collectelementstobetranslated_blackBBB(match, eModel,
							unresolvedType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eModel] = " + eModel + ", " + "[unresolvedType] = " + unresolvedType + ".");
			}
			UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_0_4_collectelementstobetranslated_greenBBBF(
					match, eModel, unresolvedType);
			//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result4_green[3];

			Object[] result5_black = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_0_5_collectcontextelements_blackBBB(match, eModel,
							unresolvedType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eModel] = " + eModel + ", " + "[unresolvedType] = " + unresolvedType + ".");
			}
			UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_0_5_collectcontextelements_greenBB(match,
					eModel);

			// 
			UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_0_6_registerobjectstomatch_expressionBBBB(
					this, match, eModel, unresolvedType);
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
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[0];
		MGravityModel eModel = (MGravityModel) result1_bindingAndBlack[1];
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result1_bindingAndBlack[2];
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_1_1_performtransformation_greenBFBFB(pg, unresolvedType, csp);
		TUnresolvedType tClass = (TUnresolvedType) result1_green[1];
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result1_green[3];

		Object[] result2_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_1_2_collecttranslatedelements_blackBBB(tClass, unresolvedType,
						eAnonymousClassDeclarationToTClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[unresolvedType] = " + unresolvedType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ".");
		}
		Object[] result2_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_1_2_collecttranslatedelements_greenFBBB(tClass, unresolvedType,
						eAnonymousClassDeclarationToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, pg, eModel, tClass,
						unresolvedType, eAnonymousClassDeclarationToTClass, eModelToPg);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[pg] = " + pg + ", " + "[eModel] = " + eModel + ", " + "[tClass] = " + tClass + ", "
					+ "[unresolvedType] = " + unresolvedType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[eModelToPg] = " + eModelToPg + ".");
		}
		UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, pg, eModel, tClass, unresolvedType, eAnonymousClassDeclarationToTClass);
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tClass__pg____pg = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result3_green[10];

		// 
		// 
		UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, pg, eModel, tClass, unresolvedType, eAnonymousClassDeclarationToTClass, eModelToPg);
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
		MGravityModel eModel = (MGravityModel) result2_binding[0];
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_2_2_corematch_blackFBBFB(eModel, unresolvedType, match)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_2_3_findcontext_blackBBBB(pg, eModel, unresolvedType,
							eModelToPg)) {
				Object[] result3_green = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_2_3_findcontext_greenBBBBFFFF(pg, eModel, unresolvedType,
								eModelToPg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								pg, eModel, unresolvedType, eModelToPg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pg] = " + pg + ", "
							+ "[eModel] = " + eModel + ", " + "[unresolvedType] = " + unresolvedType + ", "
							+ "[eModelToPg] = " + eModelToPg + ".");
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
	public void registerObjectsToMatch_FWD(Match match, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		match.registerObject("eModel", eModel);
		match.registerObject("unresolvedType", unresolvedType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeGraph pg, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, ModelToTypeGraph eModelToPg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.proxy", true,
				csp);
		var_unresolvedType_proxy.setValue(unresolvedType.isProxy());
		var_unresolvedType_proxy.setType("Boolean");
		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.name", true, csp);
		var_unresolvedType_name.setValue(unresolvedType.getName());
		var_unresolvedType_name.setType("String");

		// Create unbound variables
		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tLib", csp);
		var_tClass_tLib.setType("Boolean");
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tName", csp);
		var_tClass_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_unresolvedType_proxy, var_tClass_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_unresolvedType_name, var_tClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("unresolvedType", unresolvedType);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject pg, EObject eModel, EObject tClass,
			EObject unresolvedType, EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg) {
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("eModel", eModel);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("unresolvedType", unresolvedType);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("eModelToPg", eModelToPg);

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
			//nothing EMoflonEdge tClass__pg____pg = (EMoflonEdge) result4_green[4];

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
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[0];
		MGravityModel eModel = (MGravityModel) result1_bindingAndBlack[1];
		TUnresolvedType tClass = (TUnresolvedType) result1_bindingAndBlack[2];
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_11_1_performtransformation_greenBBFFB(eModel, tClass, csp);
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result1_green[2];
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result1_green[3];

		Object[] result2_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_11_2_collecttranslatedelements_blackBBB(tClass, unresolvedType,
						eAnonymousClassDeclarationToTClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[unresolvedType] = " + unresolvedType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ".");
		}
		Object[] result2_green = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_11_2_collecttranslatedelements_greenFBBB(tClass, unresolvedType,
						eAnonymousClassDeclarationToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, pg, eModel, tClass,
						unresolvedType, eAnonymousClassDeclarationToTClass, eModelToPg);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[pg] = " + pg + ", " + "[eModel] = " + eModel + ", " + "[tClass] = " + tClass + ", "
					+ "[unresolvedType] = " + unresolvedType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ", " + "[eModelToPg] = " + eModelToPg + ".");
		}
		UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, pg, eModel, tClass, unresolvedType, eAnonymousClassDeclarationToTClass);
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tClass__pg____pg = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result3_green[10];

		// 
		// 
		UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_11_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, pg, eModel, tClass, unresolvedType, eAnonymousClassDeclarationToTClass, eModelToPg);
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
				.pattern_UnresolvedTypeDeclaration_12_2_corematch_blackBFBFB(pg, tClass, match)) {
			MGravityModel eModel = (MGravityModel) result2_black[1];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_12_3_findcontext_blackBBBB(pg, eModel, tClass, eModelToPg)) {
				Object[] result3_green = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_12_3_findcontext_greenBBBBFFFFF(pg, eModel, tClass,
								eModelToPg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge pg__tClass____ownedTypes = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tClass__pg____pg = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								pg, eModel, tClass, eModelToPg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pg] = " + pg + ", "
							+ "[eModel] = " + eModel + ", " + "[tClass] = " + tClass + ", " + "[eModelToPg] = "
							+ eModelToPg + ".");
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph pg, MGravityModel eModel,
			TUnresolvedType tClass, ModelToTypeGraph eModelToPg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tLib", true, csp);
		var_tClass_tLib.setValue(tClass.isTLib());
		var_tClass_tLib.setType("Boolean");
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tName", true, csp);
		var_tClass_tName.setValue(tClass.getTName());
		var_tClass_tName.setType("String");

		// Create unbound variables
		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.proxy", csp);
		var_unresolvedType_proxy.setType("Boolean");
		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.name", csp);
		var_unresolvedType_name.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_unresolvedType_proxy, var_tClass_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_unresolvedType_name, var_tClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject pg, EObject eModel, EObject tClass,
			EObject unresolvedType, EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg) {
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("eModel", eModel);
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("unresolvedType", unresolvedType);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("eModelToPg", eModelToPg);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_725(EMoflonEdge _edge_ownedTypes) {

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_745(EMoflonEdge _edge_unresolvedItems) {

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
			MGravityModel eModel = (MGravityModel) result2_black[0];
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result2_black[1];
			Object[] result2_green = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, eModel, unresolvedType)) {
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

		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_proxy.setValue(__helper.getValue("unresolvedType", "proxy"));
		var_unresolvedType_proxy.setType("boolean");

		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tName.setValue(__helper.getValue("tClass", "tName"));
		var_tClass_tName.setType("String");

		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_name.setValue(__helper.getValue("unresolvedType", "name"));
		var_unresolvedType_name.setType("String");

		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tLib.setValue(__helper.getValue("tClass", "tLib"));
		var_tClass_tLib.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("UnresolvedTypeDeclaration");
		eq0.solve(var_unresolvedType_proxy, var_tClass_tLib);

		eq1.setRuleName("UnresolvedTypeDeclaration");
		eq1.solve(var_unresolvedType_name, var_tClass_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tClass_tLib.setBound(false);
			var_tClass_tName.setBound(false);
			eq0.solve(var_unresolvedType_proxy, var_tClass_tLib);
			eq1.solve(var_unresolvedType_name, var_tClass_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tClass", "tLib", var_tClass_tLib.getValue());
				__helper.setValue("tClass", "tName", var_tClass_tName.getValue());
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

		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_proxy.setValue(__helper.getValue("unresolvedType", "proxy"));
		var_unresolvedType_proxy.setType("boolean");

		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tName.setValue(__helper.getValue("tClass", "tName"));
		var_tClass_tName.setType("String");

		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_name.setValue(__helper.getValue("unresolvedType", "name"));
		var_unresolvedType_name.setType("String");

		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tLib.setValue(__helper.getValue("tClass", "tLib"));
		var_tClass_tLib.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("UnresolvedTypeDeclaration");
		eq0.solve(var_unresolvedType_proxy, var_tClass_tLib);

		eq1.setRuleName("UnresolvedTypeDeclaration");
		eq1.solve(var_unresolvedType_name, var_tClass_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_unresolvedType_proxy.setBound(false);
			var_unresolvedType_name.setBound(false);
			eq0.solve(var_unresolvedType_proxy, var_tClass_tLib);
			eq1.solve(var_unresolvedType_name, var_tClass_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("unresolvedType", "proxy", var_unresolvedType_proxy.getValue());
				__helper.setValue("unresolvedType", "name", var_unresolvedType_name.getValue());
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
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[0];
		MGravityModel eModel = (MGravityModel) result2_bindingAndBlack[1];
		TUnresolvedType tClass = (TUnresolvedType) result2_bindingAndBlack[2];
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, pg, eModel, tClass,
						unresolvedType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[pg] = " + pg + ", " + "[eModel] = " + eModel + ", " + "[tClass] = " + tClass + ", "
					+ "[unresolvedType] = " + unresolvedType + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_24_5_matchcorrcontext_blackBBFBB(pg, eModel, sourceMatch,
							targetMatch)) {
				ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result5_black[2];
				Object[] result5_green = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_24_5_matchcorrcontext_greenBBBF(eModelToPg, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_24_6_createcorrespondence_blackBBBBB(pg, eModel, tClass,
								unresolvedType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pg] = " + pg + ", "
							+ "[eModel] = " + eModel + ", " + "[tClass] = " + tClass + ", " + "[unresolvedType] = "
							+ unresolvedType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_24_6_createcorrespondence_greenBBFB(
						tClass, unresolvedType, ccMatch);
				//nothing TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result6_green[2];

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
	public CSP isApplicable_solveCsp_CC(TypeGraph pg, MGravityModel eModel, TUnresolvedType tClass,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.proxy", true,
				csp);
		var_unresolvedType_proxy.setValue(unresolvedType.isProxy());
		var_unresolvedType_proxy.setType("Boolean");
		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tLib", true, csp);
		var_tClass_tLib.setValue(tClass.isTLib());
		var_tClass_tLib.setType("Boolean");
		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.name", true, csp);
		var_unresolvedType_name.setValue(unresolvedType.getName());
		var_unresolvedType_name.setType("String");
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tName", true, csp);
		var_tClass_tName.setValue(tClass.getTName());
		var_tClass_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_unresolvedType_proxy, var_tClass_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_unresolvedType_name, var_tClass_tName);
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
	public boolean checkDEC_FWD(MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {// 
		Object[] result1_black = UnresolvedTypeDeclarationImpl
				.pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_blackBB(eModel, unresolvedType);
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
			TypeGraph pg = (TypeGraph) result2_black[1];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[2];
			MGravityModel eModel = (MGravityModel) result2_black[3];

			Object[] result3_bindingAndBlack = UnresolvedTypeDeclarationImpl
					.pattern_UnresolvedTypeDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, pg,
							eModel, eModelToPg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[pg] = " + pg + ", " + "[eModel] = "
						+ eModel + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = UnresolvedTypeDeclarationImpl
						.pattern_UnresolvedTypeDeclaration_29_5_checknacs_blackBBB(pg, eModel, eModelToPg);
				if (result5_black != null) {

					Object[] result6_black = UnresolvedTypeDeclarationImpl
							.pattern_UnresolvedTypeDeclaration_29_6_perform_blackBBBB(pg, eModel, eModelToPg,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[pg] = " + pg + ", "
								+ "[eModel] = " + eModel + ", " + "[eModelToPg] = " + eModelToPg + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					UnresolvedTypeDeclarationImpl.pattern_UnresolvedTypeDeclaration_29_6_perform_greenBBFFFBB(pg,
							eModel, ruleResult, csp);
					//nothing TUnresolvedType tClass = (TUnresolvedType) result6_green[2];
					//nothing org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result6_green[3];
					//nothing TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result6_green[4];

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeGraph pg, MGravityModel eModel,
			ModelToTypeGraph eModelToPg, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.proxy", csp);
		var_unresolvedType_proxy.setType("Boolean");
		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tLib", csp);
		var_tClass_tLib.setType("Boolean");
		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType.name", csp);
		var_unresolvedType_name.setType("String");
		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass.tName", csp);
		var_tClass_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_unresolvedType_proxy, var_tClass_tLib);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_unresolvedType_name, var_tClass_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
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
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_FWD__MATCH_MGRAVITYMODEL_UNRESOLVEDTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(2));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MGRAVITYMODEL_UNRESOLVEDTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MGRAVITYMODEL_UNRESOLVEDTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1),
					(org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(2));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEGRAPH_MGRAVITYMODEL_UNRESOLVEDTYPEDECLARATION_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(MGravityModel) arguments.get(2),
					(org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(3),
					(ModelToTypeGraph) arguments.get(4));
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
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_MGRAVITYMODEL_TUNRESOLVEDTYPE_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(MGravityModel) arguments.get(2), (TUnresolvedType) arguments.get(3),
					(ModelToTypeGraph) arguments.get(4));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_725__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_725((EMoflonEdge) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_745__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_745((EMoflonEdge) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_MGRAVITYMODEL_TUNRESOLVEDTYPE_UNRESOLVEDTYPEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TypeGraph) arguments.get(0), (MGravityModel) arguments.get(1),
					(TUnresolvedType) arguments.get(2),
					(org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_DEC_FWD__MGRAVITYMODEL_UNRESOLVEDTYPEDECLARATION:
			return checkDEC_FWD((MGravityModel) arguments.get(0),
					(org.eclipse.modisco.java.UnresolvedTypeDeclaration) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___CHECK_DEC_BWD__TYPEGRAPH_TUNRESOLVEDTYPE:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TUnresolvedType) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPEGRAPH_MGRAVITYMODEL_MODELTOTYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TypeGraph) arguments.get(1),
					(MGravityModel) arguments.get(2), (ModelToTypeGraph) arguments.get(3),
					(ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.UNRESOLVED_TYPE_DECLARATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_1_initialbindings_blackBBBB(
			UnresolvedTypeDeclaration _this, Match match, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		return new Object[] { _this, match, eModel, unresolvedType };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_bindingFBBBB(
			UnresolvedTypeDeclaration _this, Match match, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eModel, unresolvedType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eModel, unresolvedType };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_bindingAndBlackFBBBB(
			UnresolvedTypeDeclaration _this, Match match, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		Object[] result_pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_binding = pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_bindingFBBBB(
				_this, match, eModel, unresolvedType);
		if (result_pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_black = pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eModel, unresolvedType };
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
			Match match, MGravityModel eModel, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		return new Object[] { match, eModel, unresolvedType };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MGravityModel eModel, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(unresolvedType);
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		match.getToBeTranslatedEdges().add(eModel__unresolvedType____unresolvedItems);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		return new Object[] { match, eModel, unresolvedType, eModel__unresolvedType____unresolvedItems };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_5_collectcontextelements_blackBBB(Match match,
			MGravityModel eModel, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		return new Object[] { match, eModel, unresolvedType };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_0_5_collectcontextelements_greenBB(Match match,
			MGravityModel eModel) {
		match.getContextNodes().add(eModel);
		return new Object[] { match, eModel };
	}

	public static final void pattern_UnresolvedTypeDeclaration_0_6_registerobjectstomatch_expressionBBBB(
			UnresolvedTypeDeclaration _this, Match match, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		_this.registerObjectsToMatch_FWD(match, eModel, unresolvedType);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("pg");
		EObject _localVariable_1 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("unresolvedType");
		EObject _localVariable_3 = isApplicableMatch.getObject("eModelToPg");
		EObject tmpPg = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		EObject tmpUnresolvedType = _localVariable_2;
		EObject tmpEModelToPg = _localVariable_3;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpEModel instanceof MGravityModel) {
				MGravityModel eModel = (MGravityModel) tmpEModel;
				if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedTypeDeclaration) {
					org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) tmpUnresolvedType;
					if (tmpEModelToPg instanceof ModelToTypeGraph) {
						ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
						return new Object[] { pg, eModel, unresolvedType, eModelToPg, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_1_performtransformation_blackBBBBFBB(TypeGraph pg,
			MGravityModel eModel, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			ModelToTypeGraph eModelToPg, UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pg, eModel, unresolvedType, eModelToPg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_1_performtransformation_bindingAndBlackFFFFFBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding = pattern_UnresolvedTypeDeclaration_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding != null) {
			TypeGraph pg = (TypeGraph) result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding[0];
			MGravityModel eModel = (MGravityModel) result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding[1];
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding[2];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_binding[3];

			Object[] result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_black = pattern_UnresolvedTypeDeclaration_1_1_performtransformation_blackBBBBFBB(
					pg, eModel, unresolvedType, eModelToPg, _this, isApplicableMatch);
			if (result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_1_1_performtransformation_black[4];

				return new Object[] { pg, eModel, unresolvedType, eModelToPg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_1_performtransformation_greenBFBFB(TypeGraph pg,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, CSP csp) {
		TUnresolvedType tClass = BasicFactory.eINSTANCE.createTUnresolvedType();
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("tClass", "tLib");
		Object _localVariable_1 = csp.getValue("tClass", "tName");
		pg.getOwnedTypes().add(tClass);
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		boolean tClass_tLib_prime = (boolean) _localVariable_0;
		String tClass_tName_prime = (String) _localVariable_1;
		tClass.setTLib(Boolean.valueOf(tClass_tLib_prime));
		tClass.setTName(tClass_tName_prime);
		return new Object[] { pg, tClass, unresolvedType, eAnonymousClassDeclarationToTClass, csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_2_collecttranslatedelements_blackBBB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass) {
		return new Object[] { tClass, unresolvedType, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_2_collecttranslatedelements_greenFBBB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tClass);
		ruleresult.getTranslatedElements().add(unresolvedType);
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { ruleresult, tClass, unresolvedType, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject pg, EObject eModel, EObject tClass, EObject unresolvedType,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg) {
		if (!pg.equals(tClass)) {
			if (!pg.equals(unresolvedType)) {
				if (!eModel.equals(pg)) {
					if (!eModel.equals(tClass)) {
						if (!eModel.equals(unresolvedType)) {
							if (!eModel.equals(eModelToPg)) {
								if (!tClass.equals(unresolvedType)) {
									if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
										if (!eAnonymousClassDeclarationToTClass.equals(eModel)) {
											if (!eAnonymousClassDeclarationToTClass.equals(tClass)) {
												if (!eAnonymousClassDeclarationToTClass.equals(unresolvedType)) {
													if (!eAnonymousClassDeclarationToTClass.equals(eModelToPg)) {
														if (!eModelToPg.equals(pg)) {
															if (!eModelToPg.equals(tClass)) {
																if (!eModelToPg.equals(unresolvedType)) {
																	return new Object[] { ruleresult, pg, eModel,
																			tClass, unresolvedType,
																			eAnonymousClassDeclarationToTClass,
																			eModelToPg };
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject pg, EObject eModel, EObject tClass, EObject unresolvedType,
			EObject eAnonymousClassDeclarationToTClass) {
		EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UnresolvedTypeDeclaration";
		String eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime = "source";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____pg_name_prime = "pg";
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setTrg(unresolvedType);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__unresolvedType____source);
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tClass____target);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		ruleresult.getCreatedEdges().add(pg__tClass____ownedTypes);
		tClass__pg____pg.setSrc(tClass);
		tClass__pg____pg.setTrg(pg);
		ruleresult.getCreatedEdges().add(tClass__pg____pg);
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		ruleresult.getTranslatedEdges().add(eModel__unresolvedType____unresolvedItems);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eAnonymousClassDeclarationToTClass__unresolvedType____source
				.setName(eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____pg.setName(tClass__pg____pg_name_prime);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		return new Object[] { ruleresult, pg, eModel, tClass, unresolvedType, eAnonymousClassDeclarationToTClass,
				eAnonymousClassDeclarationToTClass__unresolvedType____source,
				eAnonymousClassDeclarationToTClass__tClass____target, pg__tClass____ownedTypes, tClass__pg____pg,
				eModel__unresolvedType____unresolvedItems };
	}

	public static final void pattern_UnresolvedTypeDeclaration_1_5_registerobjects_expressionBBBBBBBB(
			UnresolvedTypeDeclaration _this, PerformRuleResult ruleresult, EObject pg, EObject eModel, EObject tClass,
			EObject unresolvedType, EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg) {
		_this.registerObjects_FWD(ruleresult, pg, eModel, tClass, unresolvedType, eAnonymousClassDeclarationToTClass,
				eModelToPg);

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
		EObject _localVariable_0 = match.getObject("eModel");
		EObject _localVariable_1 = match.getObject("unresolvedType");
		EObject tmpEModel = _localVariable_0;
		EObject tmpUnresolvedType = _localVariable_1;
		if (tmpEModel instanceof MGravityModel) {
			MGravityModel eModel = (MGravityModel) tmpEModel;
			if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedTypeDeclaration) {
				org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) tmpUnresolvedType;
				return new Object[] { eModel, unresolvedType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_2_2_corematch_blackFBBFB(
			MGravityModel eModel, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(eModel,
				ModelToTypeGraph.class, "source")) {
			TypeGraph pg = eModelToPg.getTarget();
			if (pg != null) {
				_result.add(new Object[] { pg, eModel, unresolvedType, eModelToPg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_2_3_findcontext_blackBBBB(TypeGraph pg,
			MGravityModel eModel, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			ModelToTypeGraph eModelToPg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.equals(eModelToPg.getTarget())) {
			if (eModel.equals(eModelToPg.getSource())) {
				if (eModel.getUnresolvedItems().contains(unresolvedType)) {
					_result.add(new Object[] { pg, eModel, unresolvedType, eModelToPg });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_3_findcontext_greenBBBBFFFF(TypeGraph pg,
			MGravityModel eModel, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			ModelToTypeGraph eModelToPg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModelToPg__pg____target_name_prime = "target";
		String eModelToPg__eModel____source_name_prime = "source";
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(unresolvedType);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		eModelToPg__eModel____source.setSrc(eModelToPg);
		eModelToPg__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg__eModel____source);
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		isApplicableMatch.getAllContextElements().add(eModel__unresolvedType____unresolvedItems);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		return new Object[] { pg, eModel, unresolvedType, eModelToPg, isApplicableMatch, eModelToPg__pg____target,
				eModelToPg__eModel____source, eModel__unresolvedType____unresolvedItems };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_4_solveCSP_bindingFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch, TypeGraph pg, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, ModelToTypeGraph eModelToPg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, pg, eModel, unresolvedType,
				eModelToPg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pg, eModel, unresolvedType, eModelToPg };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch, TypeGraph pg, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, ModelToTypeGraph eModelToPg) {
		Object[] result_pattern_UnresolvedTypeDeclaration_2_4_solveCSP_binding = pattern_UnresolvedTypeDeclaration_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, pg, eModel, unresolvedType, eModelToPg);
		if (result_pattern_UnresolvedTypeDeclaration_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_2_4_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_2_4_solveCSP_black = pattern_UnresolvedTypeDeclaration_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pg, eModel, unresolvedType, eModelToPg };
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
		EMoflonEdge tClass__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tClass);
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____pg_name_prime = "pg";
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		match.getToBeTranslatedEdges().add(pg__tClass____ownedTypes);
		tClass__pg____pg.setSrc(tClass);
		tClass__pg____pg.setTrg(pg);
		match.getToBeTranslatedEdges().add(tClass__pg____pg);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____pg.setName(tClass__pg____pg_name_prime);
		return new Object[] { match, pg, tClass, pg__tClass____ownedTypes, tClass__pg____pg };
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
		EObject _localVariable_0 = isApplicableMatch.getObject("pg");
		EObject _localVariable_1 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_3 = isApplicableMatch.getObject("eModelToPg");
		EObject tmpPg = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		EObject tmpEModelToPg = _localVariable_3;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpEModel instanceof MGravityModel) {
				MGravityModel eModel = (MGravityModel) tmpEModel;
				if (tmpTClass instanceof TUnresolvedType) {
					TUnresolvedType tClass = (TUnresolvedType) tmpTClass;
					if (tmpEModelToPg instanceof ModelToTypeGraph) {
						ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
						return new Object[] { pg, eModel, tClass, eModelToPg, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_1_performtransformation_blackBBBBFBB(TypeGraph pg,
			MGravityModel eModel, TUnresolvedType tClass, ModelToTypeGraph eModelToPg, UnresolvedTypeDeclaration _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { pg, eModel, tClass, eModelToPg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_1_performtransformation_bindingAndBlackFFFFFBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding = pattern_UnresolvedTypeDeclaration_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding != null) {
			TypeGraph pg = (TypeGraph) result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding[0];
			MGravityModel eModel = (MGravityModel) result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding[1];
			TUnresolvedType tClass = (TUnresolvedType) result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding[2];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_binding[3];

			Object[] result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_black = pattern_UnresolvedTypeDeclaration_11_1_performtransformation_blackBBBBFBB(
					pg, eModel, tClass, eModelToPg, _this, isApplicableMatch);
			if (result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_11_1_performtransformation_black[4];

				return new Object[] { pg, eModel, tClass, eModelToPg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_1_performtransformation_greenBBFFB(
			MGravityModel eModel, TUnresolvedType tClass, CSP csp) {
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = JavaFactory.eINSTANCE
				.createUnresolvedTypeDeclaration();
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("unresolvedType", "proxy");
		Object _localVariable_1 = csp.getValue("unresolvedType", "name");
		eModel.getUnresolvedItems().add(unresolvedType);
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		boolean unresolvedType_proxy_prime = (boolean) _localVariable_0;
		String unresolvedType_name_prime = (String) _localVariable_1;
		unresolvedType.setProxy(Boolean.valueOf(unresolvedType_proxy_prime));
		unresolvedType.setName(unresolvedType_name_prime);
		return new Object[] { eModel, tClass, unresolvedType, eAnonymousClassDeclarationToTClass, csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_2_collecttranslatedelements_blackBBB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass) {
		return new Object[] { tClass, unresolvedType, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_2_collecttranslatedelements_greenFBBB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tClass);
		ruleresult.getCreatedElements().add(unresolvedType);
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { ruleresult, tClass, unresolvedType, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject pg, EObject eModel, EObject tClass, EObject unresolvedType,
			EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg) {
		if (!pg.equals(tClass)) {
			if (!pg.equals(unresolvedType)) {
				if (!eModel.equals(pg)) {
					if (!eModel.equals(tClass)) {
						if (!eModel.equals(unresolvedType)) {
							if (!eModel.equals(eModelToPg)) {
								if (!tClass.equals(unresolvedType)) {
									if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
										if (!eAnonymousClassDeclarationToTClass.equals(eModel)) {
											if (!eAnonymousClassDeclarationToTClass.equals(tClass)) {
												if (!eAnonymousClassDeclarationToTClass.equals(unresolvedType)) {
													if (!eAnonymousClassDeclarationToTClass.equals(eModelToPg)) {
														if (!eModelToPg.equals(pg)) {
															if (!eModelToPg.equals(tClass)) {
																if (!eModelToPg.equals(unresolvedType)) {
																	return new Object[] { ruleresult, pg, eModel,
																			tClass, unresolvedType,
																			eAnonymousClassDeclarationToTClass,
																			eModelToPg };
																}
															}
														}
													}
												}
											}
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
			PerformRuleResult ruleresult, EObject pg, EObject eModel, EObject tClass, EObject unresolvedType,
			EObject eAnonymousClassDeclarationToTClass) {
		EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UnresolvedTypeDeclaration";
		String eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime = "source";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____pg_name_prime = "pg";
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setTrg(unresolvedType);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__unresolvedType____source);
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tClass____target);
		pg__tClass____ownedTypes.setSrc(pg);
		pg__tClass____ownedTypes.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(pg__tClass____ownedTypes);
		tClass__pg____pg.setSrc(tClass);
		tClass__pg____pg.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tClass__pg____pg);
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		ruleresult.getCreatedEdges().add(eModel__unresolvedType____unresolvedItems);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eAnonymousClassDeclarationToTClass__unresolvedType____source
				.setName(eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____pg.setName(tClass__pg____pg_name_prime);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		return new Object[] { ruleresult, pg, eModel, tClass, unresolvedType, eAnonymousClassDeclarationToTClass,
				eAnonymousClassDeclarationToTClass__unresolvedType____source,
				eAnonymousClassDeclarationToTClass__tClass____target, pg__tClass____ownedTypes, tClass__pg____pg,
				eModel__unresolvedType____unresolvedItems };
	}

	public static final void pattern_UnresolvedTypeDeclaration_11_5_registerobjects_expressionBBBBBBBB(
			UnresolvedTypeDeclaration _this, PerformRuleResult ruleresult, EObject pg, EObject eModel, EObject tClass,
			EObject unresolvedType, EObject eAnonymousClassDeclarationToTClass, EObject eModelToPg) {
		_this.registerObjects_BWD(ruleresult, pg, eModel, tClass, unresolvedType, eAnonymousClassDeclarationToTClass,
				eModelToPg);

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

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_12_2_corematch_blackBFBFB(TypeGraph pg,
			TUnresolvedType tClass, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
				ModelToTypeGraph.class, "target")) {
			Model tmpEModel = eModelToPg.getSource();
			if (tmpEModel instanceof MGravityModel) {
				MGravityModel eModel = (MGravityModel) tmpEModel;
				_result.add(new Object[] { pg, eModel, tClass, eModelToPg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_12_3_findcontext_blackBBBB(TypeGraph pg,
			MGravityModel eModel, TUnresolvedType tClass, ModelToTypeGraph eModelToPg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.equals(eModelToPg.getTarget())) {
			if (eModel.equals(eModelToPg.getSource())) {
				if (pg.getOwnedTypes().contains(tClass)) {
					_result.add(new Object[] { pg, eModel, tClass, eModelToPg });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_3_findcontext_greenBBBBFFFFF(TypeGraph pg,
			MGravityModel eModel, TUnresolvedType tClass, ModelToTypeGraph eModelToPg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModelToPg__pg____target_name_prime = "target";
		String eModelToPg__eModel____source_name_prime = "source";
		String pg__tClass____ownedTypes_name_prime = "ownedTypes";
		String tClass__pg____pg_name_prime = "pg";
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
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
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		pg__tClass____ownedTypes.setName(pg__tClass____ownedTypes_name_prime);
		tClass__pg____pg.setName(tClass__pg____pg_name_prime);
		return new Object[] { pg, eModel, tClass, eModelToPg, isApplicableMatch, eModelToPg__pg____target,
				eModelToPg__eModel____source, pg__tClass____ownedTypes, tClass__pg____pg };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_4_solveCSP_bindingFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch, TypeGraph pg, MGravityModel eModel,
			TUnresolvedType tClass, ModelToTypeGraph eModelToPg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, pg, eModel, tClass, eModelToPg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pg, eModel, tClass, eModelToPg };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch, TypeGraph pg, MGravityModel eModel,
			TUnresolvedType tClass, ModelToTypeGraph eModelToPg) {
		Object[] result_pattern_UnresolvedTypeDeclaration_12_4_solveCSP_binding = pattern_UnresolvedTypeDeclaration_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, pg, eModel, tClass, eModelToPg);
		if (result_pattern_UnresolvedTypeDeclaration_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_12_4_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_12_4_solveCSP_black = pattern_UnresolvedTypeDeclaration_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pg, eModel, tClass, eModelToPg };
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
		TPackage __DEC_tClass_ownedTypes_295909 = tClass.getPackage();
		if (__DEC_tClass_ownedTypes_295909 != null) {
			return new Object[] { tClass };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_1B(
			TUnresolvedType tClass) {
		TAbstractType __DEC_tClass_innerTypes_215784 = tClass.getOuterType();
		if (__DEC_tClass_innerTypes_215784 != null) {
			if (!tClass.equals(__DEC_tClass_innerTypes_215784)) {
				return new Object[] { tClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_2B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_classes_854994 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "classes")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_3BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_classes_970480 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tClass_classes_970480)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_4B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_interfaces_70351 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "interfaces")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_20_2_testcorematchandDECs_black_nac_5BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_interfaces_119227 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "interfaces")) {
			if (!pg.equals(__DEC_tClass_interfaces_119227)) {
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
		AbstractTypeDeclaration __DEC_unresolvedType_abstractTypeDeclaration_592844 = unresolvedType
				.getAbstractTypeDeclaration();
		if (__DEC_unresolvedType_abstractTypeDeclaration_592844 != null) {
			if (!unresolvedType.equals(__DEC_unresolvedType_abstractTypeDeclaration_592844)) {
				return new Object[] { unresolvedType };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_1B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		AnonymousClassDeclaration __DEC_unresolvedType_anonymousClassDeclarationOwner_954535 = unresolvedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_unresolvedType_anonymousClassDeclarationOwner_954535 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_2BB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		for (Model __DEC_unresolvedType_orphanTypes_457475 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(unresolvedType, Model.class, "orphanTypes")) {
			if (!eModel.equals(__DEC_unresolvedType_orphanTypes_457475)) {
				return new Object[] { unresolvedType, eModel };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_3B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		org.eclipse.modisco.java.Package __DEC_unresolvedType_ownedElements_126925 = unresolvedType.getPackage();
		if (__DEC_unresolvedType_ownedElements_126925 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_21_2_testcorematchandDECs_black_nac_4B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		for (MAbstractMethodDefinition __DEC_unresolvedType_mInnerTypes_847965 : org.moflon.core.utilities.eMoflonEMFUtil
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
											_result.add(new Object[] { eModel, unresolvedType, _edge_unresolvedItems });
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
			UnresolvedTypeDeclaration _this, Match match, MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eModel, unresolvedType);
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
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("pg");
		EObject _localVariable_1 = sourceMatch.getObject("eModel");
		EObject _localVariable_2 = targetMatch.getObject("tClass");
		EObject _localVariable_3 = sourceMatch.getObject("unresolvedType");
		EObject tmpPg = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		EObject tmpTClass = _localVariable_2;
		EObject tmpUnresolvedType = _localVariable_3;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpEModel instanceof MGravityModel) {
				MGravityModel eModel = (MGravityModel) tmpEModel;
				if (tmpTClass instanceof TUnresolvedType) {
					TUnresolvedType tClass = (TUnresolvedType) tmpTClass;
					if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedTypeDeclaration) {
						org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) tmpUnresolvedType;
						return new Object[] { pg, eModel, tClass, unresolvedType, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_blackBBBBBB(TypeGraph pg,
			MGravityModel eModel, TUnresolvedType tClass,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { pg, eModel, tClass, unresolvedType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding = pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding != null) {
			TypeGraph pg = (TypeGraph) result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding[0];
			MGravityModel eModel = (MGravityModel) result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding[1];
			TUnresolvedType tClass = (TUnresolvedType) result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedTypeDeclaration) result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_black = pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_blackBBBBBB(
					pg, eModel, tClass, unresolvedType, sourceMatch, targetMatch);
			if (result_pattern_UnresolvedTypeDeclaration_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { pg, eModel, tClass, unresolvedType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_3_solvecsp_bindingFBBBBBBB(
			UnresolvedTypeDeclaration _this, TypeGraph pg, MGravityModel eModel, TUnresolvedType tClass,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(pg, eModel, tClass, unresolvedType, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, pg, eModel, tClass, unresolvedType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			UnresolvedTypeDeclaration _this, TypeGraph pg, MGravityModel eModel, TUnresolvedType tClass,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_UnresolvedTypeDeclaration_24_3_solvecsp_binding = pattern_UnresolvedTypeDeclaration_24_3_solvecsp_bindingFBBBBBBB(
				_this, pg, eModel, tClass, unresolvedType, sourceMatch, targetMatch);
		if (result_pattern_UnresolvedTypeDeclaration_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_24_3_solvecsp_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_24_3_solvecsp_black = pattern_UnresolvedTypeDeclaration_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, pg, eModel, tClass, unresolvedType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedTypeDeclaration_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedTypeDeclaration_24_5_matchcorrcontext_blackBBFBB(
			TypeGraph pg, MGravityModel eModel, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
					ModelToTypeGraph.class, "target")) {
				if (eModel.equals(eModelToPg.getSource())) {
					_result.add(new Object[] { pg, eModel, eModelToPg, sourceMatch, targetMatch });
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

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_6_createcorrespondence_blackBBBBB(TypeGraph pg,
			MGravityModel eModel, TUnresolvedType tClass,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, CCMatch ccMatch) {
		return new Object[] { pg, eModel, tClass, unresolvedType, ccMatch };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_24_6_createcorrespondence_greenBBFB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType,
			CCMatch ccMatch) {
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		ccMatch.getCreateCorr().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { tClass, unresolvedType, eAnonymousClassDeclarationToTClass, ccMatch };
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
		AbstractTypeDeclaration __DEC_unresolvedType_abstractTypeDeclaration_709263 = unresolvedType
				.getAbstractTypeDeclaration();
		if (__DEC_unresolvedType_abstractTypeDeclaration_709263 != null) {
			if (!unresolvedType.equals(__DEC_unresolvedType_abstractTypeDeclaration_709263)) {
				return new Object[] { unresolvedType };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_1B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		AnonymousClassDeclaration __DEC_unresolvedType_anonymousClassDeclarationOwner_92707 = unresolvedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_unresolvedType_anonymousClassDeclarationOwner_92707 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_2BB(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType, MGravityModel eModel) {
		for (Model __DEC_unresolvedType_orphanTypes_95043 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(unresolvedType, Model.class, "orphanTypes")) {
			if (!eModel.equals(__DEC_unresolvedType_orphanTypes_95043)) {
				return new Object[] { unresolvedType, eModel };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_3B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		org.eclipse.modisco.java.Package __DEC_unresolvedType_ownedElements_202554 = unresolvedType.getPackage();
		if (__DEC_unresolvedType_ownedElements_202554 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_black_nac_4B(
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
		for (MAbstractMethodDefinition __DEC_unresolvedType_mInnerTypes_277599 : org.moflon.core.utilities.eMoflonEMFUtil
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

	public static final Object[] pattern_UnresolvedTypeDeclaration_27_1_matchtggpattern_blackBB(MGravityModel eModel,
			org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType) {
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
									return new Object[] { eModel, unresolvedType };
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
		TPackage __DEC_tClass_ownedTypes_325358 = tClass.getPackage();
		if (__DEC_tClass_ownedTypes_325358 != null) {
			return new Object[] { tClass };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_1B(
			TUnresolvedType tClass) {
		TAbstractType __DEC_tClass_innerTypes_461771 = tClass.getOuterType();
		if (__DEC_tClass_innerTypes_461771 != null) {
			if (!tClass.equals(__DEC_tClass_innerTypes_461771)) {
				return new Object[] { tClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_2B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_classes_155880 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "classes")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_3BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_classes_98857 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tClass_classes_98857)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_4B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_interfaces_366435 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "interfaces")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_28_1_matchtggpattern_black_nac_5BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_interfaces_865669 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "interfaces")) {
			if (!pg.equals(__DEC_tClass_interfaces_865669)) {
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
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToPg) {
		if (ruleResult.getCorrObjects().contains(eModelToPg)) {
			return new Object[] { ruleResult, eModelToPg };
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
							if (pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									eModelToPg) == null) {
								if (pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										pg) == null) {
									if (pattern_UnresolvedTypeDeclaration_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, eModel) == null) {
										_result.add(new Object[] { eModelToPgList, pg, eModelToPg, eModel,
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
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch, TypeGraph pg, MGravityModel eModel,
			ModelToTypeGraph eModelToPg, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, pg, eModel, eModelToPg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, pg, eModel, eModelToPg, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBB(
			UnresolvedTypeDeclaration _this, IsApplicableMatch isApplicableMatch, TypeGraph pg, MGravityModel eModel,
			ModelToTypeGraph eModelToPg, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UnresolvedTypeDeclaration_29_3_solveCSP_binding = pattern_UnresolvedTypeDeclaration_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, pg, eModel, eModelToPg, ruleResult);
		if (result_pattern_UnresolvedTypeDeclaration_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedTypeDeclaration_29_3_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedTypeDeclaration_29_3_solveCSP_black = pattern_UnresolvedTypeDeclaration_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedTypeDeclaration_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, pg, eModel, eModelToPg, ruleResult };
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

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_5_checknacs_blackBBB(TypeGraph pg,
			MGravityModel eModel, ModelToTypeGraph eModelToPg) {
		return new Object[] { pg, eModel, eModelToPg };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_6_perform_blackBBBB(TypeGraph pg,
			MGravityModel eModel, ModelToTypeGraph eModelToPg, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { pg, eModel, eModelToPg, ruleResult };
	}

	public static final Object[] pattern_UnresolvedTypeDeclaration_29_6_perform_greenBBFFFBB(TypeGraph pg,
			MGravityModel eModel, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TUnresolvedType tClass = BasicFactory.eINSTANCE.createTUnresolvedType();
		org.eclipse.modisco.java.UnresolvedTypeDeclaration unresolvedType = JavaFactory.eINSTANCE
				.createUnresolvedTypeDeclaration();
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("tClass", "tLib");
		Object _localVariable_1 = csp.getValue("tClass", "tName");
		Object _localVariable_2 = csp.getValue("unresolvedType", "proxy");
		Object _localVariable_3 = csp.getValue("unresolvedType", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		pg.getOwnedTypes().add(tClass);
		ruleResult.getTargetObjects().add(tClass);
		eModel.getUnresolvedItems().add(unresolvedType);
		ruleResult.getSourceObjects().add(unresolvedType);
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		ruleResult.getCorrObjects().add(eAnonymousClassDeclarationToTClass);
		boolean tClass_tLib_prime = (boolean) _localVariable_0;
		String tClass_tName_prime = (String) _localVariable_1;
		boolean unresolvedType_proxy_prime = (boolean) _localVariable_2;
		String unresolvedType_name_prime = (String) _localVariable_3;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_4);
		tClass.setTLib(Boolean.valueOf(tClass_tLib_prime));
		tClass.setTName(tClass_tName_prime);
		unresolvedType.setProxy(Boolean.valueOf(unresolvedType_proxy_prime));
		unresolvedType.setName(unresolvedType_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { pg, eModel, tClass, unresolvedType, eAnonymousClassDeclarationToTClass, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UnresolvedTypeDeclaration_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UnresolvedTypeDeclarationImpl
