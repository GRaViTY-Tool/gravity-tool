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
import org.gravity.tgg.modisco.pm.Rules.UnresolvedInterfaceDeclaration;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TModule;
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
 * An implementation of the model object '<em><b>Unresolved Interface Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnresolvedInterfaceDeclarationImpl extends AbstractRuleImpl implements UnresolvedInterfaceDeclaration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnresolvedInterfaceDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getUnresolvedInterfaceDeclaration();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {

		Object[] result1_black = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_0_1_initialbindings_blackBBBB(this, match, unresolvedType,
						eModel);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[unresolvedType] = " + unresolvedType + ", " + "[eModel] = " + eModel + ".");
		}

		Object[] result2_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, unresolvedType,
						eModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[unresolvedType] = " + unresolvedType + ", " + "[eModel] = " + eModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_0_4_collectelementstobetranslated_blackBBB(match,
							unresolvedType, eModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[unresolvedType] = " + unresolvedType + ", " + "[eModel] = " + eModel + ".");
			}
			UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_0_4_collectelementstobetranslated_greenBBBF(match,
							unresolvedType, eModel);
			//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result4_green[3];

			Object[] result5_black = UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_0_5_collectcontextelements_blackBBB(match, unresolvedType,
							eModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[unresolvedType] = " + unresolvedType + ", " + "[eModel] = " + eModel + ".");
			}
			UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_0_5_collectcontextelements_greenBB(match, eModel);

			// 
			UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_0_6_registerobjectstomatch_expressionBBBB(this, match,
							unresolvedType, eModel);
			return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_0_7_expressionF();
		} else {
			return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) result1_bindingAndBlack[0];
		TModule tModule = (TModule) result1_bindingAndBlack[1];
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		MGravityModel eModel = (MGravityModel) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_greenFBBBFB(unresolvedType, tModule,
						pg, csp);
		TUnresolvedType tClass = (TUnresolvedType) result1_green[0];
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result1_green[4];

		Object[] result2_black = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_1_2_collecttranslatedelements_blackBBB(tClass, unresolvedType,
						eAnonymousClassDeclarationToTClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[unresolvedType] = " + unresolvedType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ".");
		}
		Object[] result2_green = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_1_2_collecttranslatedelements_greenFBBB(tClass, unresolvedType,
						eAnonymousClassDeclarationToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, tClass,
						unresolvedType, tModule, eModelToPg, pg, eAnonymousClassDeclarationToTClass, eModel);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[unresolvedType] = " + unresolvedType + ", "
					+ "[tModule] = " + tModule + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[pg] = " + pg + ", "
					+ "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[eModel] = " + eModel + ".");
		}
		UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult, tClass,
						unresolvedType, tModule, pg, eAnonymousClassDeclarationToTClass, eModel);
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge pg__tClass____allTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tModule__tClass____contains = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tClass__tModule____module = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result3_green[13];

		// 
		// 
		UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
						tClass, unresolvedType, tModule, eModelToPg, pg, eAnonymousClassDeclarationToTClass, eModel);
		return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) result2_binding[0];
		MGravityModel eModel = (MGravityModel) result2_binding[1];
		for (Object[] result2_black : UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_2_2_corematch_blackBFFBB(unresolvedType, eModel, match)) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			// ForEach 
			for (Object[] result3_black : UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_2_3_findcontext_blackBFBBB(unresolvedType, eModelToPg, pg,
							eModel)) {
				TModule tModule = (TModule) result3_black[1];
				Object[] result3_green = UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_2_3_findcontext_greenBBBBBFFFFF(unresolvedType, tModule,
								eModelToPg, pg, eModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge pg__tModule____modules = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, unresolvedType, tModule, eModelToPg, pg, eModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[unresolvedType] = "
							+ unresolvedType + ", " + "[tModule] = " + tModule + ", " + "[eModelToPg] = " + eModelToPg
							+ ", " + "[pg] = " + pg + ", " + "[eModel] = " + eModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = UnresolvedInterfaceDeclarationImpl
							.pattern_UnresolvedInterfaceDeclaration_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					UnresolvedInterfaceDeclarationImpl
							.pattern_UnresolvedInterfaceDeclaration_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		match.registerObject("unresolvedType", unresolvedType);
		match.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {// Create CSP
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
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel) {// Create CSP
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
		isApplicableMatch.registerObject("unresolvedType", unresolvedType);
		isApplicableMatch.registerObject("tModule", tModule);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eModel", eModel);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tClass, EObject unresolvedType,
			EObject tModule, EObject eModelToPg, EObject pg, EObject eAnonymousClassDeclarationToTClass,
			EObject eModel) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("unresolvedType", unresolvedType);
		ruleresult.registerObject("tModule", tModule);
		ruleresult.registerObject("eModelToPg", eModelToPg);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("eModel", eModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("unresolvedType").eClass())
				.equals("java.UnresolvedInterfaceDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {

		Object[] result1_black = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_10_1_initialbindings_blackBBBBB(this, match, tClass, tModule,
						pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[tModule] = " + tModule + ", "
					+ "[pg] = " + pg + ".");
		}

		Object[] result2_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tClass,
						tModule, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tClass] = " + tClass + ", " + "[tModule] = " + tModule + ", "
					+ "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_10_4_collectelementstobetranslated_blackBBBB(match, tClass,
							tModule, pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tModule] = " + tModule + ", " + "[pg] = " + pg + ".");
			}
			UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_10_4_collectelementstobetranslated_greenBBBBFFFF(match,
							tClass, tModule, pg);
			//nothing EMoflonEdge pg__tClass____allTypes = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tModule__tClass____contains = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tClass__tModule____module = (EMoflonEdge) result4_green[7];

			Object[] result5_black = UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_10_5_collectcontextelements_blackBBBB(match, tClass,
							tModule, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tClass] = " + tClass + ", " + "[tModule] = " + tModule + ", " + "[pg] = " + pg + ".");
			}
			UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_10_5_collectcontextelements_greenBBBF(match, tModule, pg);
			//nothing EMoflonEdge pg__tModule____modules = (EMoflonEdge) result5_green[3];

			// 
			UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							tClass, tModule, pg);
			return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_10_7_expressionF();
		} else {
			return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TUnresolvedType tClass = (TUnresolvedType) result1_bindingAndBlack[0];
		TModule tModule = (TModule) result1_bindingAndBlack[1];
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		MGravityModel eModel = (MGravityModel) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_greenBFFBB(tClass, eModel, csp);
		org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) result1_green[1];
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result1_green[2];

		Object[] result2_black = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_11_2_collecttranslatedelements_blackBBB(tClass, unresolvedType,
						eAnonymousClassDeclarationToTClass);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass + ", "
					+ "[unresolvedType] = " + unresolvedType + ", " + "[eAnonymousClassDeclarationToTClass] = "
					+ eAnonymousClassDeclarationToTClass + ".");
		}
		Object[] result2_green = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_11_2_collecttranslatedelements_greenFBBB(tClass, unresolvedType,
						eAnonymousClassDeclarationToTClass);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, tClass,
						unresolvedType, tModule, eModelToPg, pg, eAnonymousClassDeclarationToTClass, eModel);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tClass] = " + tClass + ", " + "[unresolvedType] = " + unresolvedType + ", "
					+ "[tModule] = " + tModule + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[pg] = " + pg + ", "
					+ "[eAnonymousClassDeclarationToTClass] = " + eAnonymousClassDeclarationToTClass + ", "
					+ "[eModel] = " + eModel + ".");
		}
		UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(ruleresult, tClass,
						unresolvedType, tModule, pg, eAnonymousClassDeclarationToTClass, eModel);
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge pg__tClass____allTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tModule__tClass____contains = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tClass__tModule____module = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge eModel__unresolvedType____unresolvedItems = (EMoflonEdge) result3_green[13];

		// 
		// 
		UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult,
						tClass, unresolvedType, tModule, eModelToPg, pg, eAnonymousClassDeclarationToTClass, eModel);
		return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TUnresolvedType tClass = (TUnresolvedType) result2_binding[0];
		TModule tModule = (TModule) result2_binding[1];
		TypeGraph pg = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_12_2_corematch_blackBBFBFB(tClass, tModule, pg, match)) {
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[2];
			MGravityModel eModel = (MGravityModel) result2_black[4];
			// ForEach 
			for (Object[] result3_black : UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_12_3_findcontext_blackBBBBB(tClass, tModule, eModelToPg, pg,
							eModel)) {
				Object[] result3_green = UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_12_3_findcontext_greenBBBBBFFFFFFFF(tClass, tModule,
								eModelToPg, pg, eModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge pg__tModule____modules = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge pg__tClass____allTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tClass__pg____model = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tModule__tClass____contains = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge tClass__tModule____module = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBBB(this,
								isApplicableMatch, tClass, tModule, eModelToPg, pg, eModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tClass] = " + tClass + ", "
							+ "[tModule] = " + tModule + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[pg] = " + pg
							+ ", " + "[eModel] = " + eModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = UnresolvedInterfaceDeclarationImpl
							.pattern_UnresolvedInterfaceDeclaration_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					UnresolvedInterfaceDeclarationImpl
							.pattern_UnresolvedInterfaceDeclaration_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {
		match.registerObject("tClass", tClass);
		match.registerObject("tModule", tModule);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TUnresolvedType tClass, TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel) {// Create CSP
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
		isApplicableMatch.registerObject("tClass", tClass);
		isApplicableMatch.registerObject("tModule", tModule);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eModel", eModel);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tClass, EObject unresolvedType,
			EObject tModule, EObject eModelToPg, EObject pg, EObject eAnonymousClassDeclarationToTClass,
			EObject eModel) {
		ruleresult.registerObject("tClass", tClass);
		ruleresult.registerObject("unresolvedType", unresolvedType);
		ruleresult.registerObject("tModule", tModule);
		ruleresult.registerObject("eModelToPg", eModelToPg);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("eAnonymousClassDeclarationToTClass", eAnonymousClassDeclarationToTClass);
		ruleresult.registerObject("eModel", eModel);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_8(EMoflonEdge _edge_allTypes) {

		Object[] result1_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_blackFFFB(_edge_allTypes)) {
			TUnresolvedType tClass = (TUnresolvedType) result2_black[0];
			TModule tModule = (TModule) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			Object[] result2_green = UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, tClass, tModule, pg)) {
				// 
				if (UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = UnresolvedInterfaceDeclarationImpl
							.pattern_UnresolvedInterfaceDeclaration_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					UnresolvedInterfaceDeclarationImpl
							.pattern_UnresolvedInterfaceDeclaration_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_9(EMoflonEdge _edge_unresolvedItems) {

		Object[] result1_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_blackFFB(_edge_unresolvedItems)) {
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) result2_black[0];
			MGravityModel eModel = (MGravityModel) result2_black[1];
			Object[] result2_green = UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, unresolvedType, eModel)) {
				// 
				if (UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = UnresolvedInterfaceDeclarationImpl
							.pattern_UnresolvedInterfaceDeclaration_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					UnresolvedInterfaceDeclarationImpl
							.pattern_UnresolvedInterfaceDeclaration_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("UnresolvedInterfaceDeclaration");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tModule", "location", "${PROXIES}", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tName.setValue(__helper.getValue("tClass", "tName"));
		var_tClass_tName.setType("String");

		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_name.setValue(__helper.getValue("unresolvedType", "name"));
		var_unresolvedType_name.setType("String");

		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_proxy.setValue(__helper.getValue("unresolvedType", "proxy"));
		var_unresolvedType_proxy.setType("boolean");

		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tLib.setValue(__helper.getValue("tClass", "tLib"));
		var_tClass_tLib.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("UnresolvedInterfaceDeclaration");
		eq0.solve(var_unresolvedType_proxy, var_tClass_tLib);

		eq1.setRuleName("UnresolvedInterfaceDeclaration");
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
		ruleResult.setRule("UnresolvedInterfaceDeclaration");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tModule", "location", "${PROXIES}", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tClass_tName = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tName.setValue(__helper.getValue("tClass", "tName"));
		var_tClass_tName.setType("String");

		Variable var_unresolvedType_name = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_name.setValue(__helper.getValue("unresolvedType", "name"));
		var_unresolvedType_name.setType("String");

		Variable var_unresolvedType_proxy = CSPFactoryHelper.eINSTANCE.createVariable("unresolvedType", true, csp);
		var_unresolvedType_proxy.setValue(__helper.getValue("unresolvedType", "proxy"));
		var_unresolvedType_proxy.setType("boolean");

		Variable var_tClass_tLib = CSPFactoryHelper.eINSTANCE.createVariable("tClass", true, csp);
		var_tClass_tLib.setValue(__helper.getValue("tClass", "tLib"));
		var_tClass_tLib.setType("boolean");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		eq0.setRuleName("UnresolvedInterfaceDeclaration");
		eq0.solve(var_unresolvedType_proxy, var_tClass_tLib);

		eq1.setRuleName("UnresolvedInterfaceDeclaration");
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

		Object[] result1_black = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TUnresolvedType tClass = (TUnresolvedType) result2_bindingAndBlack[0];
		org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) result2_bindingAndBlack[1];
		TModule tModule = (TModule) result2_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[3];
		MGravityModel eModel = (MGravityModel) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, tClass,
						unresolvedType, tModule, pg, eModel, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tClass] = " + tClass + ", " + "[unresolvedType] = " + unresolvedType + ", " + "[tModule] = "
					+ tModule + ", " + "[pg] = " + pg + ", " + "[eModel] = " + eModel + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_24_5_matchcorrcontext_blackFBBBB(pg, eModel, sourceMatch,
							targetMatch)) {
				ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result5_black[0];
				Object[] result5_green = UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_24_5_matchcorrcontext_greenBBBF(eModelToPg, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_24_6_createcorrespondence_blackBBBBBB(tClass,
								unresolvedType, tModule, pg, eModel, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tClass] = " + tClass
							+ ", " + "[unresolvedType] = " + unresolvedType + ", " + "[tModule] = " + tModule + ", "
							+ "[pg] = " + pg + ", " + "[eModel] = " + eModel + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_24_6_createcorrespondence_greenBBFB(tClass,
								unresolvedType, ccMatch);
				//nothing TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result6_green[2];

				Object[] result7_black = UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TUnresolvedType tClass,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, TModule tModule, TypeGraph pg,
			MGravityModel eModel, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType,
			MGravityModel eModel) {// 
		Object[] result1_black = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_blackBB(unresolvedType, eModel);
		if (result1_black != null) {
			return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_27_2_expressionF();
		} else {
			return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TUnresolvedType tClass, TModule tModule, TypeGraph pg) {// 
		Object[] result1_black = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_blackBBB(tClass, tModule, pg);
		if (result1_black != null) {
			return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_28_2_expressionF();
		} else {
			return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph eModelToPgParameter) {

		Object[] result1_black = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : UnresolvedInterfaceDeclarationImpl
				.pattern_UnresolvedInterfaceDeclaration_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList eModelToPgList = (RuleEntryList) result2_black[0];
			TModule tModule = (TModule) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[3];
			MGravityModel eModel = (MGravityModel) result2_black[4];

			Object[] result3_bindingAndBlack = UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBBB(this,
							isApplicableMatch, tModule, eModelToPg, pg, eModel, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tModule] = " + tModule + ", "
						+ "[eModelToPg] = " + eModelToPg + ", " + "[pg] = " + pg + ", " + "[eModel] = " + eModel + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (UnresolvedInterfaceDeclarationImpl
					.pattern_UnresolvedInterfaceDeclaration_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = UnresolvedInterfaceDeclarationImpl
						.pattern_UnresolvedInterfaceDeclaration_29_5_checknacs_blackBBBB(tModule, eModelToPg, pg,
								eModel);
				if (result5_black != null) {

					Object[] result6_black = UnresolvedInterfaceDeclarationImpl
							.pattern_UnresolvedInterfaceDeclaration_29_6_perform_blackBBBBB(tModule, eModelToPg, pg,
									eModel, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tModule] = "
								+ tModule + ", " + "[eModelToPg] = " + eModelToPg + ", " + "[pg] = " + pg + ", "
								+ "[eModel] = " + eModel + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					UnresolvedInterfaceDeclarationImpl
							.pattern_UnresolvedInterfaceDeclaration_29_6_perform_greenFFBBFBBB(tModule, pg, eModel,
									ruleResult, csp);
					//nothing TUnresolvedType tClass = (TUnresolvedType) result6_green[0];
					//nothing org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) result6_green[1];
					//nothing TypeToTAbstractType eAnonymousClassDeclarationToTClass = (TypeToTAbstractType) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return UnresolvedInterfaceDeclarationImpl.pattern_UnresolvedInterfaceDeclaration_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("tModule", tModule);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eModel", eModel);
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
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPROPRIATE_FWD__MATCH_UNRESOLVEDINTERFACEDECLARATION_MGRAVITYMODEL:
				return isAppropriate_FWD((Match) arguments.get(0),
						(org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) arguments.get(1),
						(MGravityModel) arguments.get(2));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_UNRESOLVEDINTERFACEDECLARATION_MGRAVITYMODEL:
				registerObjectsToMatch_FWD((Match) arguments.get(0),
						(org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) arguments.get(1),
						(MGravityModel) arguments.get(2));
				return null;
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_UNRESOLVEDINTERFACEDECLARATION_MGRAVITYMODEL:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
						(org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) arguments.get(1),
						(MGravityModel) arguments.get(2));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_UNRESOLVEDINTERFACEDECLARATION_TMODULE_MODELTOTYPEGRAPH_TYPEGRAPH_MGRAVITYMODEL:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
						(org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) arguments.get(1),
						(TModule) arguments.get(2), (ModelToTypeGraph) arguments.get(3), (TypeGraph) arguments.get(4),
						(MGravityModel) arguments.get(5));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
				return null;
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPROPRIATE_BWD__MATCH_TUNRESOLVEDTYPE_TMODULE_TYPEGRAPH:
				return isAppropriate_BWD((Match) arguments.get(0), (TUnresolvedType) arguments.get(1),
						(TModule) arguments.get(2), (TypeGraph) arguments.get(3));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TUNRESOLVEDTYPE_TMODULE_TYPEGRAPH:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TUnresolvedType) arguments.get(1),
						(TModule) arguments.get(2), (TypeGraph) arguments.get(3));
				return null;
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TUNRESOLVEDTYPE_TMODULE_TYPEGRAPH:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TUnresolvedType) arguments.get(1),
						(TModule) arguments.get(2), (TypeGraph) arguments.get(3));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TUNRESOLVEDTYPE_TMODULE_MODELTOTYPEGRAPH_TYPEGRAPH_MGRAVITYMODEL:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(TUnresolvedType) arguments.get(1), (TModule) arguments.get(2),
						(ModelToTypeGraph) arguments.get(3), (TypeGraph) arguments.get(4),
						(MGravityModel) arguments.get(5));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
				return null;
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPLICABLE_SOLVE_CSP_CC__TUNRESOLVEDTYPE_UNRESOLVEDINTERFACEDECLARATION_TMODULE_TYPEGRAPH_MGRAVITYMODEL_MATCH_MATCH:
				return isApplicable_solveCsp_CC((TUnresolvedType) arguments.get(0),
						(org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) arguments.get(1),
						(TModule) arguments.get(2), (TypeGraph) arguments.get(3), (MGravityModel) arguments.get(4),
						(Match) arguments.get(5), (Match) arguments.get(6));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___CHECK_DEC_FWD__UNRESOLVEDINTERFACEDECLARATION_MGRAVITYMODEL:
				return checkDEC_FWD((org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) arguments.get(0),
						(MGravityModel) arguments.get(1));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___CHECK_DEC_BWD__TUNRESOLVEDTYPE_TMODULE_TYPEGRAPH:
				return checkDEC_BWD((TUnresolvedType) arguments.get(0), (TModule) arguments.get(1),
						(TypeGraph) arguments.get(2));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
				return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMODULE_MODELTOTYPEGRAPH_TYPEGRAPH_MGRAVITYMODEL_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TModule) arguments.get(1),
						(ModelToTypeGraph) arguments.get(2), (TypeGraph) arguments.get(3),
						(MGravityModel) arguments.get(4), (ModelgeneratorRuleResult) arguments.get(5));
			case RulesPackage.UNRESOLVED_INTERFACE_DECLARATION___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_0_1_initialbindings_blackBBBB(
			UnresolvedInterfaceDeclaration _this, Match match,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		return new Object[] { _this, match, unresolvedType, eModel };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_bindingFBBBB(
			UnresolvedInterfaceDeclaration _this, Match match,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, unresolvedType, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, unresolvedType, eModel };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_bindingAndBlackFBBBB(
			UnresolvedInterfaceDeclaration _this, Match match,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_binding = pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_bindingFBBBB(
				_this, match, unresolvedType, eModel);
		if (result_pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_binding[0];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_black = pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedInterfaceDeclaration_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, unresolvedType, eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_0_3_CheckCSP_expressionFBB(
			UnresolvedInterfaceDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_0_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		return new Object[] { match, unresolvedType, eModel };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_0_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(unresolvedType);
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		match.getToBeTranslatedEdges().add(eModel__unresolvedType____unresolvedItems);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		return new Object[] { match, unresolvedType, eModel, eModel__unresolvedType____unresolvedItems };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		return new Object[] { match, unresolvedType, eModel };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_0_5_collectcontextelements_greenBB(Match match,
			MGravityModel eModel) {
		match.getContextNodes().add(eModel);
		return new Object[] { match, eModel };
	}

	public static final void pattern_UnresolvedInterfaceDeclaration_0_6_registerobjectstomatch_expressionBBBB(
			UnresolvedInterfaceDeclaration _this, Match match,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		_this.registerObjectsToMatch_FWD(match, unresolvedType, eModel);

	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("unresolvedType");
		EObject _localVariable_1 = isApplicableMatch.getObject("tModule");
		EObject _localVariable_2 = isApplicableMatch.getObject("eModelToPg");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject _localVariable_4 = isApplicableMatch.getObject("eModel");
		EObject tmpUnresolvedType = _localVariable_0;
		EObject tmpTModule = _localVariable_1;
		EObject tmpEModelToPg = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpEModel = _localVariable_4;
		if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) {
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) tmpUnresolvedType;
			if (tmpTModule instanceof TModule) {
				TModule tModule = (TModule) tmpTModule;
				if (tmpEModelToPg instanceof ModelToTypeGraph) {
					ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpEModel instanceof MGravityModel) {
							MGravityModel eModel = (MGravityModel) tmpEModel;
							return new Object[] { unresolvedType, tModule, eModelToPg, pg, eModel, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_blackBBBBBFBB(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel, UnresolvedInterfaceDeclaration _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { unresolvedType, tModule, eModelToPg, pg, eModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			UnresolvedInterfaceDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_binding = pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) result_pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_binding[0];
			TModule tModule = (TModule) result_pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_binding[1];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_binding[3];
			MGravityModel eModel = (MGravityModel) result_pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_binding[4];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_black = pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_blackBBBBBFBB(
					unresolvedType, tModule, eModelToPg, pg, eModel, _this, isApplicableMatch);
			if (result_pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_black[5];

				return new Object[] { unresolvedType, tModule, eModelToPg, pg, eModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_1_1_performtransformation_greenFBBBFB(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, TModule tModule, TypeGraph pg,
			CSP csp) {
		TUnresolvedType tClass = BasicFactory.eINSTANCE.createTUnresolvedType();
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("tClass", "tLib");
		Object _localVariable_1 = csp.getValue("tClass", "tName");
		pg.getAllTypes().add(tClass);
		tModule.getContains().add(tClass);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		boolean tClass_tLib_prime = (boolean) _localVariable_0;
		String tClass_tName_prime = (String) _localVariable_1;
		tClass.setTLib(Boolean.valueOf(tClass_tLib_prime));
		tClass.setTName(tClass_tName_prime);
		return new Object[] { tClass, unresolvedType, tModule, pg, eAnonymousClassDeclarationToTClass, csp };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_1_2_collecttranslatedelements_blackBBB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass) {
		return new Object[] { tClass, unresolvedType, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_1_2_collecttranslatedelements_greenFBBB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tClass);
		ruleresult.getTranslatedElements().add(unresolvedType);
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { ruleresult, tClass, unresolvedType, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject unresolvedType, EObject tModule, EObject eModelToPg,
			EObject pg, EObject eAnonymousClassDeclarationToTClass, EObject eModel) {
		if (!tClass.equals(unresolvedType)) {
			if (!tClass.equals(tModule)) {
				if (!tModule.equals(unresolvedType)) {
					if (!eModelToPg.equals(tClass)) {
						if (!eModelToPg.equals(unresolvedType)) {
							if (!eModelToPg.equals(tModule)) {
								if (!eModelToPg.equals(pg)) {
									if (!pg.equals(tClass)) {
										if (!pg.equals(unresolvedType)) {
											if (!pg.equals(tModule)) {
												if (!eAnonymousClassDeclarationToTClass.equals(tClass)) {
													if (!eAnonymousClassDeclarationToTClass.equals(unresolvedType)) {
														if (!eAnonymousClassDeclarationToTClass.equals(tModule)) {
															if (!eAnonymousClassDeclarationToTClass
																	.equals(eModelToPg)) {
																if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
																	if (!eAnonymousClassDeclarationToTClass
																			.equals(eModel)) {
																		if (!eModel.equals(tClass)) {
																			if (!eModel.equals(unresolvedType)) {
																				if (!eModel.equals(tModule)) {
																					if (!eModel.equals(eModelToPg)) {
																						if (!eModel.equals(pg)) {
																							return new Object[] {
																									ruleresult, tClass,
																									unresolvedType,
																									tModule, eModelToPg,
																									pg,
																									eAnonymousClassDeclarationToTClass,
																									eModel };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_1_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject unresolvedType, EObject tModule, EObject pg,
			EObject eAnonymousClassDeclarationToTClass, EObject eModel) {
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tModule__tClass____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tModule____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UnresolvedInterfaceDeclaration";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String pg__tClass____allTypes_name_prime = "allTypes";
		String tClass__pg____model_name_prime = "model";
		String eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime = "source";
		String tModule__tClass____contains_name_prime = "contains";
		String tClass__tModule____module_name_prime = "module";
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tClass____target);
		pg__tClass____allTypes.setSrc(pg);
		pg__tClass____allTypes.setTrg(tClass);
		ruleresult.getCreatedEdges().add(pg__tClass____allTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tClass__pg____model);
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setTrg(unresolvedType);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__unresolvedType____source);
		tModule__tClass____contains.setSrc(tModule);
		tModule__tClass____contains.setTrg(tClass);
		ruleresult.getCreatedEdges().add(tModule__tClass____contains);
		tClass__tModule____module.setSrc(tClass);
		tClass__tModule____module.setTrg(tModule);
		ruleresult.getCreatedEdges().add(tClass__tModule____module);
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		ruleresult.getTranslatedEdges().add(eModel__unresolvedType____unresolvedItems);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		pg__tClass____allTypes.setName(pg__tClass____allTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		eAnonymousClassDeclarationToTClass__unresolvedType____source
				.setName(eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime);
		tModule__tClass____contains.setName(tModule__tClass____contains_name_prime);
		tClass__tModule____module.setName(tClass__tModule____module_name_prime);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		return new Object[] { ruleresult, tClass, unresolvedType, tModule, pg, eAnonymousClassDeclarationToTClass,
				eModel, eAnonymousClassDeclarationToTClass__tClass____target, pg__tClass____allTypes,
				tClass__pg____model, eAnonymousClassDeclarationToTClass__unresolvedType____source,
				tModule__tClass____contains, tClass__tModule____module, eModel__unresolvedType____unresolvedItems };
	}

	public static final void pattern_UnresolvedInterfaceDeclaration_1_5_registerobjects_expressionBBBBBBBBB(
			UnresolvedInterfaceDeclaration _this, PerformRuleResult ruleresult, EObject tClass, EObject unresolvedType,
			EObject tModule, EObject eModelToPg, EObject pg, EObject eAnonymousClassDeclarationToTClass,
			EObject eModel) {
		_this.registerObjects_FWD(ruleresult, tClass, unresolvedType, tModule, eModelToPg, pg,
				eAnonymousClassDeclarationToTClass, eModel);

	}

	public static final PerformRuleResult pattern_UnresolvedInterfaceDeclaration_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_bindingFB(
			UnresolvedInterfaceDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_blackFBB(EClass eClass,
			UnresolvedInterfaceDeclaration _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_bindingAndBlackFFB(
			UnresolvedInterfaceDeclaration _this) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_binding = pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_black = pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "UnresolvedInterfaceDeclaration";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("unresolvedType");
		EObject _localVariable_1 = match.getObject("eModel");
		EObject tmpUnresolvedType = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) {
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) tmpUnresolvedType;
			if (tmpEModel instanceof MGravityModel) {
				MGravityModel eModel = (MGravityModel) tmpEModel;
				return new Object[] { unresolvedType, eModel, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedInterfaceDeclaration_2_2_corematch_blackBFFBB(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(eModel,
				ModelToTypeGraph.class, "source")) {
			TypeGraph pg = eModelToPg.getTarget();
			if (pg != null) {
				_result.add(new Object[] { unresolvedType, eModelToPg, pg, eModel, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedInterfaceDeclaration_2_3_findcontext_blackBFBBB(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, ModelToTypeGraph eModelToPg,
			TypeGraph pg, MGravityModel eModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.equals(eModelToPg.getTarget())) {
			if (eModel.equals(eModelToPg.getSource())) {
				if (eModel.getUnresolvedItems().contains(unresolvedType)) {
					for (TModule tModule : pg.getModules()) {
						String tModule_location = tModule.getLocation();
						if (tModule_location.equals("${PROXIES}")) {
							_result.add(new Object[] { unresolvedType, tModule, eModelToPg, pg, eModel });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_3_findcontext_greenBBBBBFFFFF(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tModule____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModelToPg__pg____target_name_prime = "target";
		String pg__tModule____modules_name_prime = "modules";
		String eModelToPg__eModel____source_name_prime = "source";
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		isApplicableMatch.getAllContextElements().add(unresolvedType);
		isApplicableMatch.getAllContextElements().add(tModule);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(eModel);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		pg__tModule____modules.setSrc(pg);
		pg__tModule____modules.setTrg(tModule);
		isApplicableMatch.getAllContextElements().add(pg__tModule____modules);
		eModelToPg__eModel____source.setSrc(eModelToPg);
		eModelToPg__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg__eModel____source);
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		isApplicableMatch.getAllContextElements().add(eModel__unresolvedType____unresolvedItems);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		pg__tModule____modules.setName(pg__tModule____modules_name_prime);
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		return new Object[] { unresolvedType, tModule, eModelToPg, pg, eModel, isApplicableMatch,
				eModelToPg__pg____target, pg__tModule____modules, eModelToPg__eModel____source,
				eModel__unresolvedType____unresolvedItems };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_bindingFBBBBBBB(
			UnresolvedInterfaceDeclaration _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, unresolvedType, tModule, eModelToPg,
				pg, eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, unresolvedType, tModule, eModelToPg, pg, eModel };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			UnresolvedInterfaceDeclaration _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_binding = pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, unresolvedType, tModule, eModelToPg, pg, eModel);
		if (result_pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_black = pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedInterfaceDeclaration_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, unresolvedType, tModule, eModelToPg, pg, eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_2_5_checkCSP_expressionFBB(
			UnresolvedInterfaceDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UnresolvedInterfaceDeclaration";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedInterfaceDeclaration_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_10_1_initialbindings_blackBBBBB(
			UnresolvedInterfaceDeclaration _this, Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {
		return new Object[] { _this, match, tClass, tModule, pg };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_bindingFBBBBB(
			UnresolvedInterfaceDeclaration _this, Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tClass, tModule, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tClass, tModule, pg };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_bindingAndBlackFBBBBB(
			UnresolvedInterfaceDeclaration _this, Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_binding = pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tClass, tModule, pg);
		if (result_pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_binding[0];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_black = pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedInterfaceDeclaration_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tClass, tModule, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_10_3_CheckCSP_expressionFBB(
			UnresolvedInterfaceDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_10_4_collectelementstobetranslated_blackBBBB(
			Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {
		return new Object[] { match, tClass, tModule, pg };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_10_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {
		EMoflonEdge pg__tClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModule__tClass____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tModule____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tClass);
		String pg__tClass____allTypes_name_prime = "allTypes";
		String tClass__pg____model_name_prime = "model";
		String tModule__tClass____contains_name_prime = "contains";
		String tClass__tModule____module_name_prime = "module";
		pg__tClass____allTypes.setSrc(pg);
		pg__tClass____allTypes.setTrg(tClass);
		match.getToBeTranslatedEdges().add(pg__tClass____allTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tClass__pg____model);
		tModule__tClass____contains.setSrc(tModule);
		tModule__tClass____contains.setTrg(tClass);
		match.getToBeTranslatedEdges().add(tModule__tClass____contains);
		tClass__tModule____module.setSrc(tClass);
		tClass__tModule____module.setTrg(tModule);
		match.getToBeTranslatedEdges().add(tClass__tModule____module);
		pg__tClass____allTypes.setName(pg__tClass____allTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		tModule__tClass____contains.setName(tModule__tClass____contains_name_prime);
		tClass__tModule____module.setName(tClass__tModule____module_name_prime);
		return new Object[] { match, tClass, tModule, pg, pg__tClass____allTypes, tClass__pg____model,
				tModule__tClass____contains, tClass__tModule____module };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_10_5_collectcontextelements_blackBBBB(
			Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {
		return new Object[] { match, tClass, tModule, pg };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_10_5_collectcontextelements_greenBBBF(
			Match match, TModule tModule, TypeGraph pg) {
		EMoflonEdge pg__tModule____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(tModule);
		match.getContextNodes().add(pg);
		String pg__tModule____modules_name_prime = "modules";
		pg__tModule____modules.setSrc(pg);
		pg__tModule____modules.setTrg(tModule);
		match.getContextEdges().add(pg__tModule____modules);
		pg__tModule____modules.setName(pg__tModule____modules_name_prime);
		return new Object[] { match, tModule, pg, pg__tModule____modules };
	}

	public static final void pattern_UnresolvedInterfaceDeclaration_10_6_registerobjectstomatch_expressionBBBBB(
			UnresolvedInterfaceDeclaration _this, Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tClass, tModule, pg);

	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("tModule");
		EObject _localVariable_2 = isApplicableMatch.getObject("eModelToPg");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject _localVariable_4 = isApplicableMatch.getObject("eModel");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTModule = _localVariable_1;
		EObject tmpEModelToPg = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpEModel = _localVariable_4;
		if (tmpTClass instanceof TUnresolvedType) {
			TUnresolvedType tClass = (TUnresolvedType) tmpTClass;
			if (tmpTModule instanceof TModule) {
				TModule tModule = (TModule) tmpTModule;
				if (tmpEModelToPg instanceof ModelToTypeGraph) {
					ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpEModel instanceof MGravityModel) {
							MGravityModel eModel = (MGravityModel) tmpEModel;
							return new Object[] { tClass, tModule, eModelToPg, pg, eModel, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_blackBBBBBFBB(
			TUnresolvedType tClass, TModule tModule, ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel,
			UnresolvedInterfaceDeclaration _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tClass, tModule, eModelToPg, pg, eModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			UnresolvedInterfaceDeclaration _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_binding = pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_binding != null) {
			TUnresolvedType tClass = (TUnresolvedType) result_pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_binding[0];
			TModule tModule = (TModule) result_pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_binding[1];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_binding[3];
			MGravityModel eModel = (MGravityModel) result_pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_binding[4];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_black = pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_blackBBBBBFBB(
					tClass, tModule, eModelToPg, pg, eModel, _this, isApplicableMatch);
			if (result_pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_black[5];

				return new Object[] { tClass, tModule, eModelToPg, pg, eModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_11_1_performtransformation_greenBFFBB(
			TUnresolvedType tClass, MGravityModel eModel, CSP csp) {
		org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = JavaFactory.eINSTANCE
				.createUnresolvedInterfaceDeclaration();
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("unresolvedType", "proxy");
		Object _localVariable_1 = csp.getValue("unresolvedType", "name");
		eModel.getUnresolvedItems().add(unresolvedType);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		boolean unresolvedType_proxy_prime = (boolean) _localVariable_0;
		String unresolvedType_name_prime = (String) _localVariable_1;
		unresolvedType.setProxy(Boolean.valueOf(unresolvedType_proxy_prime));
		unresolvedType.setName(unresolvedType_name_prime);
		return new Object[] { tClass, unresolvedType, eAnonymousClassDeclarationToTClass, eModel, csp };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_11_2_collecttranslatedelements_blackBBB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass) {
		return new Object[] { tClass, unresolvedType, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_11_2_collecttranslatedelements_greenFBBB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType,
			TypeToTAbstractType eAnonymousClassDeclarationToTClass) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tClass);
		ruleresult.getCreatedElements().add(unresolvedType);
		ruleresult.getCreatedLinkElements().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { ruleresult, tClass, unresolvedType, eAnonymousClassDeclarationToTClass };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject tClass, EObject unresolvedType, EObject tModule, EObject eModelToPg,
			EObject pg, EObject eAnonymousClassDeclarationToTClass, EObject eModel) {
		if (!tClass.equals(unresolvedType)) {
			if (!tClass.equals(tModule)) {
				if (!tModule.equals(unresolvedType)) {
					if (!eModelToPg.equals(tClass)) {
						if (!eModelToPg.equals(unresolvedType)) {
							if (!eModelToPg.equals(tModule)) {
								if (!eModelToPg.equals(pg)) {
									if (!pg.equals(tClass)) {
										if (!pg.equals(unresolvedType)) {
											if (!pg.equals(tModule)) {
												if (!eAnonymousClassDeclarationToTClass.equals(tClass)) {
													if (!eAnonymousClassDeclarationToTClass.equals(unresolvedType)) {
														if (!eAnonymousClassDeclarationToTClass.equals(tModule)) {
															if (!eAnonymousClassDeclarationToTClass
																	.equals(eModelToPg)) {
																if (!eAnonymousClassDeclarationToTClass.equals(pg)) {
																	if (!eAnonymousClassDeclarationToTClass
																			.equals(eModel)) {
																		if (!eModel.equals(tClass)) {
																			if (!eModel.equals(unresolvedType)) {
																				if (!eModel.equals(tModule)) {
																					if (!eModel.equals(eModelToPg)) {
																						if (!eModel.equals(pg)) {
																							return new Object[] {
																									ruleresult, tClass,
																									unresolvedType,
																									tModule, eModelToPg,
																									pg,
																									eAnonymousClassDeclarationToTClass,
																									eModel };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_11_3_bookkeepingforedges_greenBBBBBBBFFFFFFF(
			PerformRuleResult ruleresult, EObject tClass, EObject unresolvedType, EObject tModule, EObject pg,
			EObject eAnonymousClassDeclarationToTClass, EObject eModel) {
		EMoflonEdge eAnonymousClassDeclarationToTClass__tClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eAnonymousClassDeclarationToTClass__unresolvedType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tModule__tClass____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tModule____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__unresolvedType____unresolvedItems = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "UnresolvedInterfaceDeclaration";
		String eAnonymousClassDeclarationToTClass__tClass____target_name_prime = "target";
		String pg__tClass____allTypes_name_prime = "allTypes";
		String tClass__pg____model_name_prime = "model";
		String eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime = "source";
		String tModule__tClass____contains_name_prime = "contains";
		String tClass__tModule____module_name_prime = "module";
		String eModel__unresolvedType____unresolvedItems_name_prime = "unresolvedItems";
		eAnonymousClassDeclarationToTClass__tClass____target.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__tClass____target.setTrg(tClass);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__tClass____target);
		pg__tClass____allTypes.setSrc(pg);
		pg__tClass____allTypes.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(pg__tClass____allTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tClass__pg____model);
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setSrc(eAnonymousClassDeclarationToTClass);
		eAnonymousClassDeclarationToTClass__unresolvedType____source.setTrg(unresolvedType);
		ruleresult.getCreatedEdges().add(eAnonymousClassDeclarationToTClass__unresolvedType____source);
		tModule__tClass____contains.setSrc(tModule);
		tModule__tClass____contains.setTrg(tClass);
		ruleresult.getTranslatedEdges().add(tModule__tClass____contains);
		tClass__tModule____module.setSrc(tClass);
		tClass__tModule____module.setTrg(tModule);
		ruleresult.getTranslatedEdges().add(tClass__tModule____module);
		eModel__unresolvedType____unresolvedItems.setSrc(eModel);
		eModel__unresolvedType____unresolvedItems.setTrg(unresolvedType);
		ruleresult.getCreatedEdges().add(eModel__unresolvedType____unresolvedItems);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eAnonymousClassDeclarationToTClass__tClass____target
				.setName(eAnonymousClassDeclarationToTClass__tClass____target_name_prime);
		pg__tClass____allTypes.setName(pg__tClass____allTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		eAnonymousClassDeclarationToTClass__unresolvedType____source
				.setName(eAnonymousClassDeclarationToTClass__unresolvedType____source_name_prime);
		tModule__tClass____contains.setName(tModule__tClass____contains_name_prime);
		tClass__tModule____module.setName(tClass__tModule____module_name_prime);
		eModel__unresolvedType____unresolvedItems.setName(eModel__unresolvedType____unresolvedItems_name_prime);
		return new Object[] { ruleresult, tClass, unresolvedType, tModule, pg, eAnonymousClassDeclarationToTClass,
				eModel, eAnonymousClassDeclarationToTClass__tClass____target, pg__tClass____allTypes,
				tClass__pg____model, eAnonymousClassDeclarationToTClass__unresolvedType____source,
				tModule__tClass____contains, tClass__tModule____module, eModel__unresolvedType____unresolvedItems };
	}

	public static final void pattern_UnresolvedInterfaceDeclaration_11_5_registerobjects_expressionBBBBBBBBB(
			UnresolvedInterfaceDeclaration _this, PerformRuleResult ruleresult, EObject tClass, EObject unresolvedType,
			EObject tModule, EObject eModelToPg, EObject pg, EObject eAnonymousClassDeclarationToTClass,
			EObject eModel) {
		_this.registerObjects_BWD(ruleresult, tClass, unresolvedType, tModule, eModelToPg, pg,
				eAnonymousClassDeclarationToTClass, eModel);

	}

	public static final PerformRuleResult pattern_UnresolvedInterfaceDeclaration_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_bindingFB(
			UnresolvedInterfaceDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_blackFBB(EClass eClass,
			UnresolvedInterfaceDeclaration _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_bindingAndBlackFFB(
			UnresolvedInterfaceDeclaration _this) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_binding = pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_black = pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "UnresolvedInterfaceDeclaration";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tClass");
		EObject _localVariable_1 = match.getObject("tModule");
		EObject _localVariable_2 = match.getObject("pg");
		EObject tmpTClass = _localVariable_0;
		EObject tmpTModule = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		if (tmpTClass instanceof TUnresolvedType) {
			TUnresolvedType tClass = (TUnresolvedType) tmpTClass;
			if (tmpTModule instanceof TModule) {
				TModule tModule = (TModule) tmpTModule;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					return new Object[] { tClass, tModule, pg, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedInterfaceDeclaration_12_2_corematch_blackBBFBFB(
			TUnresolvedType tClass, TModule tModule, TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String tModule_location = tModule.getLocation();
		if (tModule_location.equals("${PROXIES}")) {
			for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
					ModelToTypeGraph.class, "target")) {
				Model tmpEModel = eModelToPg.getSource();
				if (tmpEModel instanceof MGravityModel) {
					MGravityModel eModel = (MGravityModel) tmpEModel;
					_result.add(new Object[] { tClass, tModule, eModelToPg, pg, eModel, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedInterfaceDeclaration_12_3_findcontext_blackBBBBB(
			TUnresolvedType tClass, TModule tModule, ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.equals(eModelToPg.getTarget())) {
			if (pg.getModules().contains(tModule)) {
				if (pg.getAllTypes().contains(tClass)) {
					if (eModel.equals(eModelToPg.getSource())) {
						if (tModule.getContains().contains(tClass)) {
							String tModule_location = tModule.getLocation();
							if (tModule_location.equals("${PROXIES}")) {
								_result.add(new Object[] { tClass, tModule, eModelToPg, pg, eModel });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_3_findcontext_greenBBBBBFFFFFFFF(
			TUnresolvedType tClass, TModule tModule, ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tModule____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tClass____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModule__tClass____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tClass__tModule____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModelToPg__pg____target_name_prime = "target";
		String pg__tModule____modules_name_prime = "modules";
		String pg__tClass____allTypes_name_prime = "allTypes";
		String tClass__pg____model_name_prime = "model";
		String eModelToPg__eModel____source_name_prime = "source";
		String tModule__tClass____contains_name_prime = "contains";
		String tClass__tModule____module_name_prime = "module";
		isApplicableMatch.getAllContextElements().add(tClass);
		isApplicableMatch.getAllContextElements().add(tModule);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(eModel);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		pg__tModule____modules.setSrc(pg);
		pg__tModule____modules.setTrg(tModule);
		isApplicableMatch.getAllContextElements().add(pg__tModule____modules);
		pg__tClass____allTypes.setSrc(pg);
		pg__tClass____allTypes.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(pg__tClass____allTypes);
		tClass__pg____model.setSrc(tClass);
		tClass__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tClass__pg____model);
		eModelToPg__eModel____source.setSrc(eModelToPg);
		eModelToPg__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg__eModel____source);
		tModule__tClass____contains.setSrc(tModule);
		tModule__tClass____contains.setTrg(tClass);
		isApplicableMatch.getAllContextElements().add(tModule__tClass____contains);
		tClass__tModule____module.setSrc(tClass);
		tClass__tModule____module.setTrg(tModule);
		isApplicableMatch.getAllContextElements().add(tClass__tModule____module);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		pg__tModule____modules.setName(pg__tModule____modules_name_prime);
		pg__tClass____allTypes.setName(pg__tClass____allTypes_name_prime);
		tClass__pg____model.setName(tClass__pg____model_name_prime);
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		tModule__tClass____contains.setName(tModule__tClass____contains_name_prime);
		tClass__tModule____module.setName(tClass__tModule____module_name_prime);
		return new Object[] { tClass, tModule, eModelToPg, pg, eModel, isApplicableMatch, eModelToPg__pg____target,
				pg__tModule____modules, pg__tClass____allTypes, tClass__pg____model, eModelToPg__eModel____source,
				tModule__tClass____contains, tClass__tModule____module };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_bindingFBBBBBBB(
			UnresolvedInterfaceDeclaration _this, IsApplicableMatch isApplicableMatch, TUnresolvedType tClass,
			TModule tModule, ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tClass, tModule, eModelToPg, pg,
				eModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tClass, tModule, eModelToPg, pg, eModel };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			UnresolvedInterfaceDeclaration _this, IsApplicableMatch isApplicableMatch, TUnresolvedType tClass,
			TModule tModule, ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_binding = pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tClass, tModule, eModelToPg, pg, eModel);
		if (result_pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_black = pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedInterfaceDeclaration_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tClass, tModule, eModelToPg, pg, eModel };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_12_5_checkCSP_expressionFBB(
			UnresolvedInterfaceDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "UnresolvedInterfaceDeclaration";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedInterfaceDeclaration_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_bindingFB(
			UnresolvedInterfaceDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, UnresolvedInterfaceDeclaration _this) {
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

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_bindingAndBlackFFBF(
			UnresolvedInterfaceDeclaration _this) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_binding = pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_black = pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_0B(
			TUnresolvedType tClass) {
		TAbstractType __DEC_tClass_innerTypes_578675 = tClass.getOuterType();
		if (__DEC_tClass_innerTypes_578675 != null) {
			if (!tClass.equals(__DEC_tClass_innerTypes_578675)) {
				return new Object[] { tClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_1B(
			TUnresolvedType tClass) {
		TPackage __DEC_tClass_allTypes_761546 = tClass.getPackage();
		if (__DEC_tClass_allTypes_761546 != null) {
			return new Object[] { tClass };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_2B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_classes_800913 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "classes")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_3BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_classes_952388 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tClass_classes_952388)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_4B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_interfaces_619908 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "interfaces")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_5BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_interfaces_758910 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "interfaces")) {
			if (!pg.equals(__DEC_tClass_interfaces_758910)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_6BB(
			TypeGraph pg, TUnresolvedType tClass) {
		if (pg.getClasses().contains(tClass)) {
			return new Object[] { pg, tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_7BB(
			TypeGraph pg, TUnresolvedType tClass) {
		if (pg.getInterfaces().contains(tClass)) {
			return new Object[] { pg, tClass };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_allTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_allTypes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTClass = _edge_allTypes.getTrg();
			if (tmpTClass instanceof TUnresolvedType) {
				TUnresolvedType tClass = (TUnresolvedType) tmpTClass;
				if (pg.getAllTypes().contains(tClass)) {
					TModule tModule = tClass.getModule();
					if (tModule != null) {
						if (pg.getModules().contains(tModule)) {
							String tModule_location = tModule.getLocation();
							if (tModule_location.equals("${PROXIES}")) {
								if (pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_0B(
										tClass) == null) {
									if (pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_1B(
											tClass) == null) {
										if (pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_2B(
												tClass) == null) {
											if (pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_3BB(
													tClass, pg) == null) {
												if (pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_4B(
														tClass) == null) {
													if (pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_5BB(
															tClass, pg) == null) {
														if (pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_6BB(
																pg, tClass) == null) {
															if (pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_black_nac_7BB(
																	pg, tClass) == null) {
																_result.add(new Object[] { tClass, tModule, pg,
																		_edge_allTypes });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			UnresolvedInterfaceDeclaration _this, Match match, TUnresolvedType tClass, TModule tModule, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tClass, tModule, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			UnresolvedInterfaceDeclaration _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_UnresolvedInterfaceDeclaration_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_bindingFB(
			UnresolvedInterfaceDeclaration _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, UnresolvedInterfaceDeclaration _this) {
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

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_bindingAndBlackFFBF(
			UnresolvedInterfaceDeclaration _this) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_binding = pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_black = pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType) {
		AbstractTypeDeclaration __DEC_unresolvedType_abstractTypeDeclaration_101466 = unresolvedType
				.getAbstractTypeDeclaration();
		if (__DEC_unresolvedType_abstractTypeDeclaration_101466 != null) {
			if (!unresolvedType.equals(__DEC_unresolvedType_abstractTypeDeclaration_101466)) {
				return new Object[] { unresolvedType };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_1B(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType) {
		AnonymousClassDeclaration __DEC_unresolvedType_anonymousClassDeclarationOwner_593342 = unresolvedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_unresolvedType_anonymousClassDeclarationOwner_593342 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_2BB(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		for (Model __DEC_unresolvedType_orphanTypes_788331 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(unresolvedType, Model.class, "orphanTypes")) {
			if (!eModel.equals(__DEC_unresolvedType_orphanTypes_788331)) {
				return new Object[] { unresolvedType, eModel };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_3B(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType) {
		org.eclipse.modisco.java.Package __DEC_unresolvedType_ownedElements_229609 = unresolvedType.getPackage();
		if (__DEC_unresolvedType_ownedElements_229609 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_4B(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType) {
		for (MAbstractMethodDefinition __DEC_unresolvedType_mInnerTypes_455997 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(unresolvedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { unresolvedType };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_5BB(
			MGravityModel eModel, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType) {
		if (eModel.getOrphanTypes().contains(unresolvedType)) {
			return new Object[] { eModel, unresolvedType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_unresolvedItems) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEModel = _edge_unresolvedItems.getSrc();
		if (tmpEModel instanceof MGravityModel) {
			MGravityModel eModel = (MGravityModel) tmpEModel;
			EObject tmpUnresolvedType = _edge_unresolvedItems.getTrg();
			if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) {
				org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) tmpUnresolvedType;
				if (eModel.getUnresolvedItems().contains(unresolvedType)) {
					if (pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_0B(
							unresolvedType) == null) {
						if (pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_1B(
								unresolvedType) == null) {
							if (pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_2BB(
									unresolvedType, eModel) == null) {
								if (pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_3B(
										unresolvedType) == null) {
									if (pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_4B(
											unresolvedType) == null) {
										if (pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_black_nac_5BB(
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

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			UnresolvedInterfaceDeclaration _this, Match match,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, unresolvedType, eModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			UnresolvedInterfaceDeclaration _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_UnresolvedInterfaceDeclaration_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_1_prepare_blackB(
			UnresolvedInterfaceDeclaration _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tClass");
		EObject _localVariable_1 = sourceMatch.getObject("unresolvedType");
		EObject _localVariable_2 = targetMatch.getObject("tModule");
		EObject _localVariable_3 = targetMatch.getObject("pg");
		EObject _localVariable_4 = sourceMatch.getObject("eModel");
		EObject tmpTClass = _localVariable_0;
		EObject tmpUnresolvedType = _localVariable_1;
		EObject tmpTModule = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpEModel = _localVariable_4;
		if (tmpTClass instanceof TUnresolvedType) {
			TUnresolvedType tClass = (TUnresolvedType) tmpTClass;
			if (tmpUnresolvedType instanceof org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) {
				org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) tmpUnresolvedType;
				if (tmpTModule instanceof TModule) {
					TModule tModule = (TModule) tmpTModule;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpEModel instanceof MGravityModel) {
							MGravityModel eModel = (MGravityModel) tmpEModel;
							return new Object[] { tClass, unresolvedType, tModule, pg, eModel, targetMatch,
									sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_blackBBBBBBB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType,
			TModule tModule, TypeGraph pg, MGravityModel eModel, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			String tModule_location = tModule.getLocation();
			if (tModule_location.equals("${PROXIES}")) {
				return new Object[] { tClass, unresolvedType, tModule, pg, eModel, sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_binding = pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_binding != null) {
			TUnresolvedType tClass = (TUnresolvedType) result_pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = (org.eclipse.modisco.java.UnresolvedInterfaceDeclaration) result_pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_binding[1];
			TModule tModule = (TModule) result_pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_binding[3];
			MGravityModel eModel = (MGravityModel) result_pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_black = pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_blackBBBBBBB(
					tClass, unresolvedType, tModule, pg, eModel, sourceMatch, targetMatch);
			if (result_pattern_UnresolvedInterfaceDeclaration_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tClass, unresolvedType, tModule, pg, eModel, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_bindingFBBBBBBBB(
			UnresolvedInterfaceDeclaration _this, TUnresolvedType tClass,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, TModule tModule, TypeGraph pg,
			MGravityModel eModel, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(tClass, unresolvedType, tModule, pg, eModel, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, tClass, unresolvedType, tModule, pg, eModel, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			UnresolvedInterfaceDeclaration _this, TUnresolvedType tClass,
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, TModule tModule, TypeGraph pg,
			MGravityModel eModel, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_binding = pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_bindingFBBBBBBBB(
				_this, tClass, unresolvedType, tModule, pg, eModel, sourceMatch, targetMatch);
		if (result_pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_binding[0];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_black = pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_UnresolvedInterfaceDeclaration_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tClass, unresolvedType, tModule, pg, eModel, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_UnresolvedInterfaceDeclaration_24_5_matchcorrcontext_blackFBBBB(
			TypeGraph pg, MGravityModel eModel, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
					ModelToTypeGraph.class, "target")) {
				if (eModel.equals(eModelToPg.getSource())) {
					_result.add(new Object[] { eModelToPg, pg, eModel, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_5_matchcorrcontext_greenBBBF(
			ModelToTypeGraph eModelToPg, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "UnresolvedInterfaceDeclaration";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eModelToPg);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eModelToPg, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_6_createcorrespondence_blackBBBBBB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType,
			TModule tModule, TypeGraph pg, MGravityModel eModel, CCMatch ccMatch) {
		return new Object[] { tClass, unresolvedType, tModule, pg, eModel, ccMatch };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_6_createcorrespondence_greenBBFB(
			TUnresolvedType tClass, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType,
			CCMatch ccMatch) {
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
		ccMatch.getCreateCorr().add(eAnonymousClassDeclarationToTClass);
		return new Object[] { tClass, unresolvedType, eAnonymousClassDeclarationToTClass, ccMatch };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "UnresolvedInterfaceDeclaration";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_UnresolvedInterfaceDeclaration_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_0B(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType) {
		AbstractTypeDeclaration __DEC_unresolvedType_abstractTypeDeclaration_995524 = unresolvedType
				.getAbstractTypeDeclaration();
		if (__DEC_unresolvedType_abstractTypeDeclaration_995524 != null) {
			if (!unresolvedType.equals(__DEC_unresolvedType_abstractTypeDeclaration_995524)) {
				return new Object[] { unresolvedType };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_1B(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType) {
		AnonymousClassDeclaration __DEC_unresolvedType_anonymousClassDeclarationOwner_549840 = unresolvedType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_unresolvedType_anonymousClassDeclarationOwner_549840 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_2BB(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		for (Model __DEC_unresolvedType_orphanTypes_930889 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(unresolvedType, Model.class, "orphanTypes")) {
			if (!eModel.equals(__DEC_unresolvedType_orphanTypes_930889)) {
				return new Object[] { unresolvedType, eModel };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_3B(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType) {
		org.eclipse.modisco.java.Package __DEC_unresolvedType_ownedElements_117155 = unresolvedType.getPackage();
		if (__DEC_unresolvedType_ownedElements_117155 != null) {
			return new Object[] { unresolvedType };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_4B(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType) {
		for (MAbstractMethodDefinition __DEC_unresolvedType_mInnerTypes_331452 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(unresolvedType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { unresolvedType };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_5BB(
			MGravityModel eModel, org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType) {
		if (eModel.getOrphanTypes().contains(unresolvedType)) {
			return new Object[] { eModel, unresolvedType };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType, MGravityModel eModel) {
		if (eModel.getUnresolvedItems().contains(unresolvedType)) {
			if (pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_0B(unresolvedType) == null) {
				if (pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_1B(unresolvedType) == null) {
					if (pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_2BB(unresolvedType,
							eModel) == null) {
						if (pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_3B(
								unresolvedType) == null) {
							if (pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_4B(
									unresolvedType) == null) {
								if (pattern_UnresolvedInterfaceDeclaration_27_1_matchtggpattern_black_nac_5BB(eModel,
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

	public static final boolean pattern_UnresolvedInterfaceDeclaration_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_0B(
			TUnresolvedType tClass) {
		TAbstractType __DEC_tClass_innerTypes_83737 = tClass.getOuterType();
		if (__DEC_tClass_innerTypes_83737 != null) {
			if (!tClass.equals(__DEC_tClass_innerTypes_83737)) {
				return new Object[] { tClass };
			}
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_1B(
			TUnresolvedType tClass) {
		TPackage __DEC_tClass_allTypes_657007 = tClass.getPackage();
		if (__DEC_tClass_allTypes_657007 != null) {
			return new Object[] { tClass };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_2B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_classes_480741 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "classes")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_3BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_classes_951633 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tClass_classes_951633)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_4B(
			TUnresolvedType tClass) {
		for (TPackage __DEC_tClass_interfaces_925216 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TPackage.class, "interfaces")) {
			return new Object[] { tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_5BB(
			TUnresolvedType tClass, TypeGraph pg) {
		for (TypeGraph __DEC_tClass_interfaces_523000 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tClass, TypeGraph.class, "interfaces")) {
			if (!pg.equals(__DEC_tClass_interfaces_523000)) {
				return new Object[] { tClass, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_6BB(TypeGraph pg,
			TUnresolvedType tClass) {
		if (pg.getClasses().contains(tClass)) {
			return new Object[] { pg, tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_7BB(TypeGraph pg,
			TUnresolvedType tClass) {
		if (pg.getInterfaces().contains(tClass)) {
			return new Object[] { pg, tClass };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_blackBBB(
			TUnresolvedType tClass, TModule tModule, TypeGraph pg) {
		if (pg.getModules().contains(tModule)) {
			if (pg.getAllTypes().contains(tClass)) {
				if (tModule.getContains().contains(tClass)) {
					String tModule_location = tModule.getLocation();
					if (tModule_location.equals("${PROXIES}")) {
						if (pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_0B(tClass) == null) {
							if (pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_1B(
									tClass) == null) {
								if (pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_2B(
										tClass) == null) {
									if (pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_3BB(
											tClass, pg) == null) {
										if (pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_4B(
												tClass) == null) {
											if (pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_5BB(
													tClass, pg) == null) {
												if (pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_6BB(
														pg, tClass) == null) {
													if (pattern_UnresolvedInterfaceDeclaration_28_1_matchtggpattern_black_nac_7BB(
															pg, tClass) == null) {
														return new Object[] { tClass, tModule, pg };
													}
												}
											}
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

	public static final boolean pattern_UnresolvedInterfaceDeclaration_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_1_createresult_blackB(
			UnresolvedInterfaceDeclaration _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TModule tModule) {
		if (ruleResult.getTargetObjects().contains(tModule)) {
			return new Object[] { ruleResult, tModule };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToPg) {
		if (ruleResult.getCorrObjects().contains(eModelToPg)) {
			return new Object[] { ruleResult, eModelToPg };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MGravityModel eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_UnresolvedInterfaceDeclaration_29_2_isapplicablecore_blackFFFFFBB(
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
							if (pattern_UnresolvedInterfaceDeclaration_29_2_isapplicablecore_black_nac_2BB(ruleResult,
									eModelToPg) == null) {
								if (pattern_UnresolvedInterfaceDeclaration_29_2_isapplicablecore_black_nac_1BB(
										ruleResult, pg) == null) {
									if (pattern_UnresolvedInterfaceDeclaration_29_2_isapplicablecore_black_nac_3BB(
											ruleResult, eModel) == null) {
										for (TModule tModule : pg.getModules()) {
											String tModule_location = tModule.getLocation();
											if (tModule_location.equals("${PROXIES}")) {
												if (pattern_UnresolvedInterfaceDeclaration_29_2_isapplicablecore_black_nac_0BB(
														ruleResult, tModule) == null) {
													_result.add(new Object[] { eModelToPgList, tModule, pg, eModelToPg,
															eModel, ruleEntryContainer, ruleResult });
												}
											}

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

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_bindingFBBBBBBB(
			UnresolvedInterfaceDeclaration _this, IsApplicableMatch isApplicableMatch, TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tModule, eModelToPg, pg, eModel,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tModule, eModelToPg, pg, eModel, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			UnresolvedInterfaceDeclaration _this, IsApplicableMatch isApplicableMatch, TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_binding = pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tModule, eModelToPg, pg, eModel, ruleResult);
		if (result_pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_binding[0];

			Object[] result_pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_black = pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_UnresolvedInterfaceDeclaration_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tModule, eModelToPg, pg, eModel, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_UnresolvedInterfaceDeclaration_29_4_checkCSP_expressionFBB(
			UnresolvedInterfaceDeclaration _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_5_checknacs_blackBBBB(TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel) {
		String tModule_location = tModule.getLocation();
		if (tModule_location.equals("${PROXIES}")) {
			return new Object[] { tModule, eModelToPg, pg, eModel };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_6_perform_blackBBBBB(TModule tModule,
			ModelToTypeGraph eModelToPg, TypeGraph pg, MGravityModel eModel, ModelgeneratorRuleResult ruleResult) {
		String tModule_location = tModule.getLocation();
		if (tModule_location.equals("${PROXIES}")) {
			return new Object[] { tModule, eModelToPg, pg, eModel, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_UnresolvedInterfaceDeclaration_29_6_perform_greenFFBBFBBB(TModule tModule,
			TypeGraph pg, MGravityModel eModel, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TUnresolvedType tClass = BasicFactory.eINSTANCE.createTUnresolvedType();
		org.eclipse.modisco.java.UnresolvedInterfaceDeclaration unresolvedType = JavaFactory.eINSTANCE
				.createUnresolvedInterfaceDeclaration();
		TypeToTAbstractType eAnonymousClassDeclarationToTClass = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("tClass", "tLib");
		Object _localVariable_1 = csp.getValue("tClass", "tName");
		Object _localVariable_2 = csp.getValue("unresolvedType", "proxy");
		Object _localVariable_3 = csp.getValue("unresolvedType", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_4 = ruleResult.getIncrementedPerformCount();
		pg.getAllTypes().add(tClass);
		tModule.getContains().add(tClass);
		ruleResult.getTargetObjects().add(tClass);
		eModel.getUnresolvedItems().add(unresolvedType);
		ruleResult.getSourceObjects().add(unresolvedType);
		eAnonymousClassDeclarationToTClass.setTarget(tClass);
		eAnonymousClassDeclarationToTClass.setSource(unresolvedType);
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
		return new Object[] { tClass, unresolvedType, tModule, pg, eAnonymousClassDeclarationToTClass, eModel,
				ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_UnresolvedInterfaceDeclaration_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //UnresolvedInterfaceDeclarationImpl
