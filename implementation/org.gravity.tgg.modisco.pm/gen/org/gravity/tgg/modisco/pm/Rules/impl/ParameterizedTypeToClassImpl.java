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
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.ParameterizedTypeToClass;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
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
 * An implementation of the model object '<em><b>Parameterized Type To Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ParameterizedTypeToClassImpl extends AbstractRuleImpl implements ParameterizedTypeToClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedTypeToClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getParameterizedTypeToClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model eModel, Type eType, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess) {

		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_0_1_initialbindings_blackBBBBBB(this, match, eModel, eType,
						eParameterizedType, eTypeAccess);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eModel] = " + eModel + ", " + "[eType] = " + eType + ", "
					+ "[eParameterizedType] = " + eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess + ".");
		}

		Object[] result2_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, eModel, eType,
						eParameterizedType, eTypeAccess);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eModel] = " + eModel + ", " + "[eType] = " + eType + ", "
					+ "[eParameterizedType] = " + eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_blackBBBBB(match, eModel, eType,
							eParameterizedType, eTypeAccess);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eModel] = " + eModel + ", " + "[eType] = " + eType + ", " + "[eParameterizedType] = "
						+ eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess + ".");
			}
			ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, eModel,
							eType, eParameterizedType, eTypeAccess);
			//nothing EMoflonEdge eModel__eParameterizedType____orphanTypes = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[8];

			Object[] result5_black = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_0_5_collectcontextelements_blackBBBBB(match, eModel, eType,
							eParameterizedType, eTypeAccess);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eModel] = " + eModel + ", " + "[eType] = " + eType + ", " + "[eParameterizedType] = "
						+ eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess + ".");
			}
			ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_5_collectcontextelements_greenBBB(match,
					eModel, eType);

			// 
			ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_6_registerobjectstomatch_expressionBBBBBB(
					this, match, eModel, eType, eParameterizedType, eTypeAccess);
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_7_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model eModel = (Model) result1_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[1];
		Type eType = (Type) result1_bindingAndBlack[2];
		ParameterizedType eParameterizedType = (ParameterizedType) result1_bindingAndBlack[3];
		TAbstractType tAbstractType = (TAbstractType) result1_bindingAndBlack[4];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[5];
		ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result1_bindingAndBlack[6];
		TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_1_performtransformation_greenBBF(eParameterizedType, tAbstractType);
		TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result1_green[2];

		Object[] result2_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_blackBBB(eParameterizedType,
						eTypeAccess, eParameterizedTypeToTAbstractType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eParameterizedType] = "
					+ eParameterizedType + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
					+ "[eParameterizedTypeToTAbstractType] = " + eParameterizedTypeToTAbstractType + ".");
		}
		Object[] result2_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_greenFBBB(eParameterizedType,
						eTypeAccess, eParameterizedTypeToTAbstractType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_blackBBBBBBBBBB(ruleresult, eModel, pg, eType,
						eParameterizedType, tAbstractType, eTypeAccess, eModelToPg, eParameterizedTypeToTAbstractType,
						eTypeToTAbstractType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eModel] = " + eModel + ", " + "[pg] = " + pg + ", " + "[eType] = " + eType + ", "
					+ "[eParameterizedType] = " + eParameterizedType + ", " + "[tAbstractType] = " + tAbstractType
					+ ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[eModelToPg] = " + eModelToPg + ", "
					+ "[eParameterizedTypeToTAbstractType] = " + eParameterizedTypeToTAbstractType + ", "
					+ "[eTypeToTAbstractType] = " + eTypeToTAbstractType + ".");
		}
		ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, eModel, eType, eParameterizedType, tAbstractType, eTypeAccess,
				eParameterizedTypeToTAbstractType);
		//nothing EMoflonEdge eModel__eParameterizedType____orphanTypes = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge eParameterizedTypeToTAbstractType__eParameterizedType____source = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge eParameterizedTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[12];

		// 
		// 
		ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_1_5_registerobjects_expressionBBBBBBBBBBB(this,
				ruleresult, eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, eModelToPg,
				eParameterizedTypeToTAbstractType, eTypeToTAbstractType);
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model eModel = (Model) result2_binding[0];
		Type eType = (Type) result2_binding[1];
		ParameterizedType eParameterizedType = (ParameterizedType) result2_binding[2];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[3];
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_2_2_corematch_blackBFBBFBFFB(eModel, eType, eParameterizedType,
						eTypeAccess, match)) {
			TypeGraph pg = (TypeGraph) result2_black[1];
			TAbstractType tAbstractType = (TAbstractType) result2_black[4];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[6];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result2_black[7];
			// ForEach 
			for (Object[] result3_black : ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_2_3_findcontext_blackBBBBBBBB(eModel, pg, eType,
							eParameterizedType, tAbstractType, eTypeAccess, eModelToPg, eTypeToTAbstractType)) {
				Object[] result3_green = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(eModel, pg, eType,
								eParameterizedType, tAbstractType, eTypeAccess, eModelToPg, eTypeToTAbstractType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge eModel__eParameterizedType____orphanTypes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eParameterizedType__eTypeAccess____type = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eModelToPg__eModel____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eModelToPg__pg____target = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge eTypeToTAbstractType__eType____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge eTypeToTAbstractType__tAbstractType____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge pg__tAbstractType____ownedTypes = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge tAbstractType__pg____model = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess,
								eModelToPg, eTypeToTAbstractType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModel] = " + eModel + ", "
							+ "[pg] = " + pg + ", " + "[eType] = " + eType + ", " + "[eParameterizedType] = "
							+ eParameterizedType + ", " + "[tAbstractType] = " + tAbstractType + ", "
							+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eModelToPg] = " + eModelToPg + ", "
							+ "[eTypeToTAbstractType] = " + eTypeToTAbstractType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model eModel, Type eType, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess) {
		match.registerObject("eModel", eModel);
		match.registerObject("eType", eType);
		match.registerObject("eParameterizedType", eParameterizedType);
		match.registerObject("eTypeAccess", eTypeAccess);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model eModel, Type eType, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph pg, Type eType,
			ParameterizedType eParameterizedType, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			ModelToTypeGraph eModelToPg, TypeToTAbstractType eTypeToTAbstractType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eParameterizedType", eParameterizedType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eModel, EObject pg, EObject eType,
			EObject eParameterizedType, EObject tAbstractType, EObject eTypeAccess, EObject eModelToPg,
			EObject eParameterizedTypeToTAbstractType, EObject eTypeToTAbstractType) {
		ruleresult.registerObject("eModel", eModel);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("eType", eType);
		ruleresult.registerObject("eParameterizedType", eParameterizedType);
		ruleresult.registerObject("tAbstractType", tAbstractType);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("eModelToPg", eModelToPg);
		ruleresult.registerObject("eParameterizedTypeToTAbstractType", eParameterizedTypeToTAbstractType);
		ruleresult.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eParameterizedType").eClass())
						.equals("java.ParameterizedType.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eTypeAccess").eClass())
						.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph pg, TAbstractType tAbstractType) {

		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_10_1_initialbindings_blackBBBB(this, match, pg, tAbstractType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pg] = " + pg + ", " + "[tAbstractType] = " + tAbstractType + ".");
		}

		Object[] result2_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, pg, tAbstractType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pg] = " + pg + ", " + "[tAbstractType] = " + tAbstractType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_10_4_collectelementstobetranslated_blackBBB(match, pg,
							tAbstractType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pg] = " + pg + ", " + "[tAbstractType] = " + tAbstractType + ".");
			}

			Object[] result5_black = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_10_5_collectcontextelements_blackBBB(match, pg, tAbstractType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pg] = " + pg + ", " + "[tAbstractType] = " + tAbstractType + ".");
			}
			ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_5_collectcontextelements_greenBBBFF(match,
					pg, tAbstractType);
			//nothing EMoflonEdge pg__tAbstractType____ownedTypes = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tAbstractType__pg____model = (EMoflonEdge) result5_green[4];

			// 
			ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_6_registerobjectstomatch_expressionBBBB(
					this, match, pg, tAbstractType);
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_7_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph pg, TAbstractType tAbstractType) {
		match.registerObject("pg", pg);
		match.registerObject("tAbstractType", tAbstractType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pg, TAbstractType tAbstractType) {// Create CSP
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
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_TypeGraph_1(TypeGraph pg) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_17_2_testcorematchandDECs_blackBF(pg)) {
			TAbstractType tAbstractType = (TAbstractType) result2_black[1];
			Object[] result2_green = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, pg, tAbstractType)) {
				// 
				if (ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_17_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_78(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_blackFFFFB(_edge_orphanTypes)) {
			Model eModel = (Model) result2_black[0];
			Type eType = (Type) result2_black[1];
			ParameterizedType eParameterizedType = (ParameterizedType) result2_black[2];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[3];
			Object[] result2_green = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, eModel, eType, eParameterizedType, eTypeAccess)) {
				// 
				if (ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_18_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ParameterizedTypeToClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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
		ruleResult.setRule("ParameterizedTypeToClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

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

		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model eModel = (Model) result2_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[1];
		Type eType = (Type) result2_bindingAndBlack[2];
		ParameterizedType eParameterizedType = (ParameterizedType) result2_bindingAndBlack[3];
		TAbstractType tAbstractType = (TAbstractType) result2_bindingAndBlack[4];
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, eModel, pg, eType,
						eParameterizedType, tAbstractType, eTypeAccess, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[eModel] = " + eModel + ", " + "[pg] = " + pg + ", " + "[eType] = " + eType + ", "
					+ "[eParameterizedType] = " + eParameterizedType + ", " + "[tAbstractType] = " + tAbstractType
					+ ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_21_5_matchcorrcontext_blackBBBBFFBB(eModel, pg, eType,
							tAbstractType, sourceMatch, targetMatch)) {
				ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result5_black[4];
				TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result5_black[5];
				Object[] result5_green = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_21_5_matchcorrcontext_greenBBBBF(eModelToPg,
								eTypeToTAbstractType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_21_6_createcorrespondence_blackBBBBBBB(eModel, pg, eType,
								eParameterizedType, tAbstractType, eTypeAccess, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eModel] = " + eModel
							+ ", " + "[pg] = " + pg + ", " + "[eType] = " + eType + ", " + "[eParameterizedType] = "
							+ eParameterizedType + ", " + "[tAbstractType] = " + tAbstractType + ", "
							+ "[eTypeAccess] = " + eTypeAccess + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_21_6_createcorrespondence_greenBBFB(
						eParameterizedType, tAbstractType, ccMatch);
				//nothing TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result6_green[2];

				Object[] result7_black = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Model eModel, TypeGraph pg, Type eType, ParameterizedType eParameterizedType,
			TAbstractType tAbstractType, TypeAccess eTypeAccess, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Model eModel, Type eType, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess) {// 
		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_24_1_matchtggpattern_blackBBBB(eModel, eType, eParameterizedType,
						eTypeAccess);
		if (result1_black != null) {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_24_2_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph pg, TAbstractType tAbstractType) {// 
		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_25_1_matchtggpattern_blackBB(pg, tAbstractType);
		if (result1_black != null) {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_25_2_expressionF();
		} else {
			return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph eModelToPgParameter) {

		Object[] result1_black = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ParameterizedTypeToClassImpl
				.pattern_ParameterizedTypeToClass_26_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList eModelToPgList = (RuleEntryList) result2_black[0];
			Model eModel = (Model) result2_black[1];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result2_black[2];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TAbstractType tAbstractType = (TAbstractType) result2_black[4];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result2_black[5];
			Type eType = (Type) result2_black[6];

			Object[] result3_bindingAndBlack = ParameterizedTypeToClassImpl
					.pattern_ParameterizedTypeToClass_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							eModel, pg, eType, tAbstractType, eModelToPg, eTypeToTAbstractType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eModel] = " + eModel + ", "
						+ "[pg] = " + pg + ", " + "[eType] = " + eType + ", " + "[tAbstractType] = " + tAbstractType
						+ ", " + "[eModelToPg] = " + eModelToPg + ", " + "[eTypeToTAbstractType] = "
						+ eTypeToTAbstractType + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ParameterizedTypeToClassImpl
						.pattern_ParameterizedTypeToClass_26_5_checknacs_blackBBBBBB(eModel, pg, eType, tAbstractType,
								eModelToPg, eTypeToTAbstractType);
				if (result5_black != null) {

					Object[] result6_black = ParameterizedTypeToClassImpl
							.pattern_ParameterizedTypeToClass_26_6_perform_blackBBBBBBB(eModel, pg, eType,
									tAbstractType, eModelToPg, eTypeToTAbstractType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[eModel] = " + eModel + ", " + "[pg] = "
										+ pg + ", " + "[eType] = " + eType + ", " + "[tAbstractType] = " + tAbstractType
										+ ", " + "[eModelToPg] = " + eModelToPg + ", " + "[eTypeToTAbstractType] = "
										+ eTypeToTAbstractType + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_26_6_perform_greenBBFBFFB(eModel,
							eType, tAbstractType, ruleResult);
					//nothing ParameterizedType eParameterizedType = (ParameterizedType) result6_green[2];
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[4];
					//nothing TypeToTAbstractType eParameterizedTypeToTAbstractType = (TypeToTAbstractType) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return ParameterizedTypeToClassImpl.pattern_ParameterizedTypeToClass_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph pg, Type eType,
			TAbstractType tAbstractType, ModelToTypeGraph eModelToPg, TypeToTAbstractType eTypeToTAbstractType,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("tAbstractType", tAbstractType);
		isApplicableMatch.registerObject("eModelToPg", eModelToPg);
		isApplicableMatch.registerObject("eTypeToTAbstractType", eTypeToTAbstractType);
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
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_FWD__MATCH_MODEL_TYPE_PARAMETERIZEDTYPE_TYPEACCESS:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1), (Type) arguments.get(2),
					(ParameterizedType) arguments.get(3), (TypeAccess) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_TYPE_PARAMETERIZEDTYPE_TYPEACCESS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1), (Type) arguments.get(2),
					(ParameterizedType) arguments.get(3), (TypeAccess) arguments.get(4));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_TYPE_PARAMETERIZEDTYPE_TYPEACCESS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(Type) arguments.get(2), (ParameterizedType) arguments.get(3), (TypeAccess) arguments.get(4));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_TYPEGRAPH_TYPE_PARAMETERIZEDTYPE_TABSTRACTTYPE_TYPEACCESS_MODELTOTYPEGRAPH_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(TypeGraph) arguments.get(2), (Type) arguments.get(3), (ParameterizedType) arguments.get(4),
					(TAbstractType) arguments.get(5), (TypeAccess) arguments.get(6),
					(ModelToTypeGraph) arguments.get(7), (TypeToTAbstractType) arguments.get(8));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2));
			return null;
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_BWD_TYPE_GRAPH_1__TYPEGRAPH:
			return isAppropriate_BWD_TypeGraph_1((TypeGraph) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_78__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_78((EMoflonEdge) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_TYPEGRAPH_TYPE_PARAMETERIZEDTYPE_TABSTRACTTYPE_TYPEACCESS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (TypeGraph) arguments.get(1),
					(Type) arguments.get(2), (ParameterizedType) arguments.get(3), (TAbstractType) arguments.get(4),
					(TypeAccess) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_DEC_FWD__MODEL_TYPE_PARAMETERIZEDTYPE_TYPEACCESS:
			return checkDEC_FWD((Model) arguments.get(0), (Type) arguments.get(1), (ParameterizedType) arguments.get(2),
					(TypeAccess) arguments.get(3));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___CHECK_DEC_BWD__TYPEGRAPH_TABSTRACTTYPE:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_TYPEGRAPH_TYPE_TABSTRACTTYPE_MODELTOTYPEGRAPH_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(TypeGraph) arguments.get(2), (Type) arguments.get(3), (TAbstractType) arguments.get(4),
					(ModelToTypeGraph) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.PARAMETERIZED_TYPE_TO_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_1_initialbindings_blackBBBBBB(
			ParameterizedTypeToClass _this, Match match, Model eModel, Type eType, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { _this, match, eModel, eType, eParameterizedType, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingFBBBBBB(
			ParameterizedTypeToClass _this, Match match, Model eModel, Type eType, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eModel, eType, eParameterizedType, eTypeAccess);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eModel, eType, eParameterizedType, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			ParameterizedTypeToClass _this, Match match, Model eModel, Type eType, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess) {
		Object[] result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_binding = pattern_ParameterizedTypeToClass_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, eModel, eType, eParameterizedType, eTypeAccess);
		if (result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_black = pattern_ParameterizedTypeToClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eModel, eType, eParameterizedType, eTypeAccess };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_0_3_CheckCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, Model eModel, Type eType, ParameterizedType eParameterizedType, TypeAccess eTypeAccess) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { match, eModel, eType, eParameterizedType, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(
			Match match, Model eModel, Type eType, ParameterizedType eParameterizedType, TypeAccess eTypeAccess) {
		EMoflonEdge eModel__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eParameterizedType);
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String eModel__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		eModel__eParameterizedType____orphanTypes.setSrc(eModel);
		eModel__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		match.getToBeTranslatedEdges().add(eModel__eParameterizedType____orphanTypes);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eParameterizedType__eTypeAccess____type);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		match.getToBeTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eModel__eParameterizedType____orphanTypes.setName(eModel__eParameterizedType____orphanTypes_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, eModel, eType, eParameterizedType, eTypeAccess,
				eModel__eParameterizedType____orphanTypes, eParameterizedType__eTypeAccess____type,
				eTypeAccess__eType____type, eType__eTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_5_collectcontextelements_blackBBBBB(Match match,
			Model eModel, Type eType, ParameterizedType eParameterizedType, TypeAccess eTypeAccess) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { match, eModel, eType, eParameterizedType, eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_0_5_collectcontextelements_greenBBB(Match match,
			Model eModel, Type eType) {
		match.getContextNodes().add(eModel);
		match.getContextNodes().add(eType);
		return new Object[] { match, eModel, eType };
	}

	public static final void pattern_ParameterizedTypeToClass_0_6_registerobjectstomatch_expressionBBBBBB(
			ParameterizedTypeToClass _this, Match match, Model eModel, Type eType, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess) {
		_this.registerObjectsToMatch_FWD(match, eModel, eType, eParameterizedType, eTypeAccess);

	}

	public static final boolean pattern_ParameterizedTypeToClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("pg");
		EObject _localVariable_2 = isApplicableMatch.getObject("eType");
		EObject _localVariable_3 = isApplicableMatch.getObject("eParameterizedType");
		EObject _localVariable_4 = isApplicableMatch.getObject("tAbstractType");
		EObject _localVariable_5 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("eModelToPg");
		EObject _localVariable_7 = isApplicableMatch.getObject("eTypeToTAbstractType");
		EObject tmpEModel = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpEType = _localVariable_2;
		EObject tmpEParameterizedType = _localVariable_3;
		EObject tmpTAbstractType = _localVariable_4;
		EObject tmpETypeAccess = _localVariable_5;
		EObject tmpEModelToPg = _localVariable_6;
		EObject tmpETypeToTAbstractType = _localVariable_7;
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpEType instanceof Type) {
					Type eType = (Type) tmpEType;
					if (tmpEParameterizedType instanceof ParameterizedType) {
						ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
						if (tmpTAbstractType instanceof TAbstractType) {
							TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
							if (tmpETypeAccess instanceof TypeAccess) {
								TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
								if (tmpEModelToPg instanceof ModelToTypeGraph) {
									ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
									if (tmpETypeToTAbstractType instanceof TypeToTAbstractType) {
										TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) tmpETypeToTAbstractType;
										return new Object[] { eModel, pg, eType, eParameterizedType, tAbstractType,
												eTypeAccess, eModelToPg, eTypeToTAbstractType, isApplicableMatch };
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

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_blackBBBBBBBBFBB(
			Model eModel, TypeGraph pg, Type eType, ParameterizedType eParameterizedType, TAbstractType tAbstractType,
			TypeAccess eTypeAccess, ModelToTypeGraph eModelToPg, TypeToTAbstractType eTypeToTAbstractType,
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch) {
		if (!eParameterizedType.equals(eType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, eModelToPg,
							eTypeToTAbstractType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding = pattern_ParameterizedTypeToClass_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding != null) {
			Model eModel = (Model) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[1];
			Type eType = (Type) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[2];
			ParameterizedType eParameterizedType = (ParameterizedType) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[3];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[4];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[5];
			ModelToTypeGraph eModelToPg = (ModelToTypeGraph) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[6];
			TypeToTAbstractType eTypeToTAbstractType = (TypeToTAbstractType) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_binding[7];

			Object[] result_pattern_ParameterizedTypeToClass_1_1_performtransformation_black = pattern_ParameterizedTypeToClass_1_1_performtransformation_blackBBBBBBBBFBB(
					eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, eModelToPg, eTypeToTAbstractType,
					_this, isApplicableMatch);
			if (result_pattern_ParameterizedTypeToClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_1_1_performtransformation_black[8];

				return new Object[] { eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, eModelToPg,
						eTypeToTAbstractType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_1_performtransformation_greenBBF(
			ParameterizedType eParameterizedType, TAbstractType tAbstractType) {
		TypeToTAbstractType eParameterizedTypeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		return new Object[] { eParameterizedType, tAbstractType, eParameterizedTypeToTAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_blackBBB(
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess,
			TypeToTAbstractType eParameterizedTypeToTAbstractType) {
		return new Object[] { eParameterizedType, eTypeAccess, eParameterizedTypeToTAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_2_collecttranslatedelements_greenFBBB(
			ParameterizedType eParameterizedType, TypeAccess eTypeAccess,
			TypeToTAbstractType eParameterizedTypeToTAbstractType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eParameterizedType);
		ruleresult.getTranslatedElements().add(eTypeAccess);
		ruleresult.getCreatedLinkElements().add(eParameterizedTypeToTAbstractType);
		return new Object[] { ruleresult, eParameterizedType, eTypeAccess, eParameterizedTypeToTAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_blackBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eModel, EObject pg, EObject eType, EObject eParameterizedType,
			EObject tAbstractType, EObject eTypeAccess, EObject eModelToPg, EObject eParameterizedTypeToTAbstractType,
			EObject eTypeToTAbstractType) {
		if (!eModel.equals(pg)) {
			if (!eModel.equals(eType)) {
				if (!eModel.equals(eParameterizedType)) {
					if (!eModel.equals(tAbstractType)) {
						if (!eModel.equals(eTypeAccess)) {
							if (!eModel.equals(eModelToPg)) {
								if (!eModel.equals(eParameterizedTypeToTAbstractType)) {
									if (!eModel.equals(eTypeToTAbstractType)) {
										if (!pg.equals(tAbstractType)) {
											if (!eType.equals(pg)) {
												if (!eType.equals(tAbstractType)) {
													if (!eType.equals(eTypeAccess)) {
														if (!eType.equals(eTypeToTAbstractType)) {
															if (!eParameterizedType.equals(pg)) {
																if (!eParameterizedType.equals(eType)) {
																	if (!eParameterizedType.equals(tAbstractType)) {
																		if (!eParameterizedType.equals(eTypeAccess)) {
																			if (!eParameterizedType.equals(
																					eParameterizedTypeToTAbstractType)) {
																				if (!eParameterizedType
																						.equals(eTypeToTAbstractType)) {
																					if (!eTypeAccess.equals(pg)) {
																						if (!eTypeAccess.equals(
																								tAbstractType)) {
																							if (!eTypeAccess.equals(
																									eTypeToTAbstractType)) {
																								if (!eModelToPg
																										.equals(pg)) {
																									if (!eModelToPg
																											.equals(eType)) {
																										if (!eModelToPg
																												.equals(eParameterizedType)) {
																											if (!eModelToPg
																													.equals(tAbstractType)) {
																												if (!eModelToPg
																														.equals(eTypeAccess)) {
																													if (!eModelToPg
																															.equals(eParameterizedTypeToTAbstractType)) {
																														if (!eModelToPg
																																.equals(eTypeToTAbstractType)) {
																															if (!eParameterizedTypeToTAbstractType
																																	.equals(pg)) {
																																if (!eParameterizedTypeToTAbstractType
																																		.equals(eType)) {
																																	if (!eParameterizedTypeToTAbstractType
																																			.equals(tAbstractType)) {
																																		if (!eParameterizedTypeToTAbstractType
																																				.equals(eTypeAccess)) {
																																			if (!eParameterizedTypeToTAbstractType
																																					.equals(eTypeToTAbstractType)) {
																																				if (!eTypeToTAbstractType
																																						.equals(pg)) {
																																					if (!eTypeToTAbstractType
																																							.equals(tAbstractType)) {
																																						return new Object[] {
																																								ruleresult,
																																								eModel,
																																								pg,
																																								eType,
																																								eParameterizedType,
																																								tAbstractType,
																																								eTypeAccess,
																																								eModelToPg,
																																								eParameterizedTypeToTAbstractType,
																																								eTypeToTAbstractType };
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedTypeToClass_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject eModel, EObject eType, EObject eParameterizedType,
			EObject tAbstractType, EObject eTypeAccess, EObject eParameterizedTypeToTAbstractType) {
		EMoflonEdge eModel__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedTypeToTAbstractType__eParameterizedType____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eParameterizedTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ParameterizedTypeToClass";
		String eModel__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eParameterizedTypeToTAbstractType__eParameterizedType____source_name_prime = "source";
		String eParameterizedTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		eModel__eParameterizedType____orphanTypes.setSrc(eModel);
		eModel__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		ruleresult.getTranslatedEdges().add(eModel__eParameterizedType____orphanTypes);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eParameterizedType__eTypeAccess____type);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eParameterizedTypeToTAbstractType__eParameterizedType____source.setSrc(eParameterizedTypeToTAbstractType);
		eParameterizedTypeToTAbstractType__eParameterizedType____source.setTrg(eParameterizedType);
		ruleresult.getCreatedEdges().add(eParameterizedTypeToTAbstractType__eParameterizedType____source);
		eParameterizedTypeToTAbstractType__tAbstractType____target.setSrc(eParameterizedTypeToTAbstractType);
		eParameterizedTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		ruleresult.getCreatedEdges().add(eParameterizedTypeToTAbstractType__tAbstractType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eModel__eParameterizedType____orphanTypes.setName(eModel__eParameterizedType____orphanTypes_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eParameterizedTypeToTAbstractType__eParameterizedType____source
				.setName(eParameterizedTypeToTAbstractType__eParameterizedType____source_name_prime);
		eParameterizedTypeToTAbstractType__tAbstractType____target
				.setName(eParameterizedTypeToTAbstractType__tAbstractType____target_name_prime);
		return new Object[] { ruleresult, eModel, eType, eParameterizedType, tAbstractType, eTypeAccess,
				eParameterizedTypeToTAbstractType, eModel__eParameterizedType____orphanTypes,
				eParameterizedType__eTypeAccess____type, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess,
				eParameterizedTypeToTAbstractType__eParameterizedType____source,
				eParameterizedTypeToTAbstractType__tAbstractType____target };
	}

	public static final void pattern_ParameterizedTypeToClass_1_5_registerobjects_expressionBBBBBBBBBBB(
			ParameterizedTypeToClass _this, PerformRuleResult ruleresult, EObject eModel, EObject pg, EObject eType,
			EObject eParameterizedType, EObject tAbstractType, EObject eTypeAccess, EObject eModelToPg,
			EObject eParameterizedTypeToTAbstractType, EObject eTypeToTAbstractType) {
		_this.registerObjects_FWD(ruleresult, eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess,
				eModelToPg, eParameterizedTypeToTAbstractType, eTypeToTAbstractType);

	}

	public static final PerformRuleResult pattern_ParameterizedTypeToClass_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ParameterizedTypeToClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			ParameterizedTypeToClass _this) {
		Object[] result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_binding = pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_black = pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ParameterizedTypeToClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eModel");
		EObject _localVariable_1 = match.getObject("eType");
		EObject _localVariable_2 = match.getObject("eParameterizedType");
		EObject _localVariable_3 = match.getObject("eTypeAccess");
		EObject tmpEModel = _localVariable_0;
		EObject tmpEType = _localVariable_1;
		EObject tmpEParameterizedType = _localVariable_2;
		EObject tmpETypeAccess = _localVariable_3;
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (tmpEParameterizedType instanceof ParameterizedType) {
					ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
					if (tmpETypeAccess instanceof TypeAccess) {
						TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
						return new Object[] { eModel, eType, eParameterizedType, eTypeAccess, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_2_2_corematch_blackBFBBFBFFB(Model eModel,
			Type eType, ParameterizedType eParameterizedType, TypeAccess eTypeAccess, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eParameterizedType.equals(eType)) {
			for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
				TypeGraph pg = eModelToPg.getTarget();
				if (pg != null) {
					for (TypeToTAbstractType eTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
						TAbstractType tAbstractType = eTypeToTAbstractType.getTarget();
						if (tAbstractType != null) {
							_result.add(new Object[] { eModel, pg, eType, eParameterizedType, tAbstractType,
									eTypeAccess, eModelToPg, eTypeToTAbstractType, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_2_3_findcontext_blackBBBBBBBB(Model eModel,
			TypeGraph pg, Type eType, ParameterizedType eParameterizedType, TAbstractType tAbstractType,
			TypeAccess eTypeAccess, ModelToTypeGraph eModelToPg, TypeToTAbstractType eTypeToTAbstractType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eParameterizedType.equals(eType)) {
			if (eModel.getOrphanTypes().contains(eParameterizedType)) {
				if (eTypeAccess.equals(eParameterizedType.getType())) {
					if (eModel.equals(eModelToPg.getSource())) {
						if (pg.equals(eModelToPg.getTarget())) {
							if (eType.equals(eTypeAccess.getType())) {
								if (eType.equals(eTypeToTAbstractType.getSource())) {
									if (tAbstractType.equals(eTypeToTAbstractType.getTarget())) {
										if (pg.getOwnedTypes().contains(tAbstractType)) {
											_result.add(new Object[] { eModel, pg, eType, eParameterizedType,
													tAbstractType, eTypeAccess, eModelToPg, eTypeToTAbstractType });
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

	public static final Object[] pattern_ParameterizedTypeToClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(Model eModel,
			TypeGraph pg, Type eType, ParameterizedType eParameterizedType, TAbstractType tAbstractType,
			TypeAccess eTypeAccess, ModelToTypeGraph eModelToPg, TypeToTAbstractType eTypeToTAbstractType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModel__eParameterizedType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eParameterizedType__eTypeAccess____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToPg__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTAbstractType__eType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTAbstractType__tAbstractType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tAbstractType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAbstractType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModel__eParameterizedType____orphanTypes_name_prime = "orphanTypes";
		String eParameterizedType__eTypeAccess____type_name_prime = "type";
		String eModelToPg__eModel____source_name_prime = "source";
		String eModelToPg__pg____target_name_prime = "target";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eTypeToTAbstractType__eType____source_name_prime = "source";
		String eTypeToTAbstractType__tAbstractType____target_name_prime = "target";
		String pg__tAbstractType____ownedTypes_name_prime = "ownedTypes";
		String tAbstractType__pg____model_name_prime = "model";
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(eParameterizedType);
		isApplicableMatch.getAllContextElements().add(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eModelToPg);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType);
		eModel__eParameterizedType____orphanTypes.setSrc(eModel);
		eModel__eParameterizedType____orphanTypes.setTrg(eParameterizedType);
		isApplicableMatch.getAllContextElements().add(eModel__eParameterizedType____orphanTypes);
		eParameterizedType__eTypeAccess____type.setSrc(eParameterizedType);
		eParameterizedType__eTypeAccess____type.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eParameterizedType__eTypeAccess____type);
		eModelToPg__eModel____source.setSrc(eModelToPg);
		eModelToPg__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToPg__eModel____source);
		eModelToPg__pg____target.setSrc(eModelToPg);
		eModelToPg__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(eModelToPg__pg____target);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType__eTypeAccess____usagesInTypeAccess);
		eTypeToTAbstractType__eType____source.setSrc(eTypeToTAbstractType);
		eTypeToTAbstractType__eType____source.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType__eType____source);
		eTypeToTAbstractType__tAbstractType____target.setSrc(eTypeToTAbstractType);
		eTypeToTAbstractType__tAbstractType____target.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(eTypeToTAbstractType__tAbstractType____target);
		pg__tAbstractType____ownedTypes.setSrc(pg);
		pg__tAbstractType____ownedTypes.setTrg(tAbstractType);
		isApplicableMatch.getAllContextElements().add(pg__tAbstractType____ownedTypes);
		tAbstractType__pg____model.setSrc(tAbstractType);
		tAbstractType__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tAbstractType__pg____model);
		eModel__eParameterizedType____orphanTypes.setName(eModel__eParameterizedType____orphanTypes_name_prime);
		eParameterizedType__eTypeAccess____type.setName(eParameterizedType__eTypeAccess____type_name_prime);
		eModelToPg__eModel____source.setName(eModelToPg__eModel____source_name_prime);
		eModelToPg__pg____target.setName(eModelToPg__pg____target_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eTypeToTAbstractType__eType____source.setName(eTypeToTAbstractType__eType____source_name_prime);
		eTypeToTAbstractType__tAbstractType____target.setName(eTypeToTAbstractType__tAbstractType____target_name_prime);
		pg__tAbstractType____ownedTypes.setName(pg__tAbstractType____ownedTypes_name_prime);
		tAbstractType__pg____model.setName(tAbstractType__pg____model_name_prime);
		return new Object[] { eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, eModelToPg,
				eTypeToTAbstractType, isApplicableMatch, eModel__eParameterizedType____orphanTypes,
				eParameterizedType__eTypeAccess____type, eModelToPg__eModel____source, eModelToPg__pg____target,
				eTypeAccess__eType____type, eType__eTypeAccess____usagesInTypeAccess,
				eTypeToTAbstractType__eType____source, eTypeToTAbstractType__tAbstractType____target,
				pg__tAbstractType____ownedTypes, tAbstractType__pg____model };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingFBBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph pg, Type eType,
			ParameterizedType eParameterizedType, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			ModelToTypeGraph eModelToPg, TypeToTAbstractType eTypeToTAbstractType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eModel, pg, eType, eParameterizedType,
				tAbstractType, eTypeAccess, eModelToPg, eTypeToTAbstractType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModel, pg, eType, eParameterizedType, tAbstractType,
					eTypeAccess, eModelToPg, eTypeToTAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph pg, Type eType,
			ParameterizedType eParameterizedType, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			ModelToTypeGraph eModelToPg, TypeToTAbstractType eTypeToTAbstractType) {
		Object[] result_pattern_ParameterizedTypeToClass_2_4_solveCSP_binding = pattern_ParameterizedTypeToClass_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, eModelToPg,
				eTypeToTAbstractType);
		if (result_pattern_ParameterizedTypeToClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_2_4_solveCSP_black = pattern_ParameterizedTypeToClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModel, pg, eType, eParameterizedType,
						tAbstractType, eTypeAccess, eModelToPg, eTypeToTAbstractType };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_2_5_checkCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ParameterizedTypeToClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedTypeToClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_1_initialbindings_blackBBBB(
			ParameterizedTypeToClass _this, Match match, TypeGraph pg, TAbstractType tAbstractType) {
		return new Object[] { _this, match, pg, tAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_2_SolveCSP_bindingFBBBB(
			ParameterizedTypeToClass _this, Match match, TypeGraph pg, TAbstractType tAbstractType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pg, tAbstractType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pg, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_2_SolveCSP_bindingAndBlackFBBBB(
			ParameterizedTypeToClass _this, Match match, TypeGraph pg, TAbstractType tAbstractType) {
		Object[] result_pattern_ParameterizedTypeToClass_10_2_SolveCSP_binding = pattern_ParameterizedTypeToClass_10_2_SolveCSP_bindingFBBBB(
				_this, match, pg, tAbstractType);
		if (result_pattern_ParameterizedTypeToClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_10_2_SolveCSP_black = pattern_ParameterizedTypeToClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pg, tAbstractType };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_10_3_CheckCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_4_collectelementstobetranslated_blackBBB(
			Match match, TypeGraph pg, TAbstractType tAbstractType) {
		return new Object[] { match, pg, tAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_5_collectcontextelements_blackBBB(Match match,
			TypeGraph pg, TAbstractType tAbstractType) {
		return new Object[] { match, pg, tAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_10_5_collectcontextelements_greenBBBFF(Match match,
			TypeGraph pg, TAbstractType tAbstractType) {
		EMoflonEdge pg__tAbstractType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tAbstractType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(pg);
		match.getContextNodes().add(tAbstractType);
		String pg__tAbstractType____ownedTypes_name_prime = "ownedTypes";
		String tAbstractType__pg____model_name_prime = "model";
		pg__tAbstractType____ownedTypes.setSrc(pg);
		pg__tAbstractType____ownedTypes.setTrg(tAbstractType);
		match.getContextEdges().add(pg__tAbstractType____ownedTypes);
		tAbstractType__pg____model.setSrc(tAbstractType);
		tAbstractType__pg____model.setTrg(pg);
		match.getContextEdges().add(tAbstractType__pg____model);
		pg__tAbstractType____ownedTypes.setName(pg__tAbstractType____ownedTypes_name_prime);
		tAbstractType__pg____model.setName(tAbstractType__pg____model_name_prime);
		return new Object[] { match, pg, tAbstractType, pg__tAbstractType____ownedTypes, tAbstractType__pg____model };
	}

	public static final void pattern_ParameterizedTypeToClass_10_6_registerobjectstomatch_expressionBBBB(
			ParameterizedTypeToClass _this, Match match, TypeGraph pg, TAbstractType tAbstractType) {
		_this.registerObjectsToMatch_BWD(match, pg, tAbstractType);

	}

	public static final boolean pattern_ParameterizedTypeToClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterizedTypeToClass _this) {
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

	public static final Object[] pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedTypeToClass _this) {
		Object[] result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_binding = pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_black = pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_17_2_testcorematchandDECs_blackBF(
			TypeGraph pg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TAbstractType tAbstractType : pg.getOwnedTypes()) {
			_result.add(new Object[] { pg, tAbstractType });
		}
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedTypeToClass_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ParameterizedTypeToClass _this, Match match, TypeGraph pg, TAbstractType tAbstractType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg, tAbstractType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedTypeToClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedTypeToClass_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_bindingFB(
			ParameterizedTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ParameterizedTypeToClass _this) {
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

	public static final Object[] pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_bindingAndBlackFFBF(
			ParameterizedTypeToClass _this) {
		Object[] result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_binding = pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_black = pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess eTypeAccess, Type eType) {
		for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_279277 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!eType.equals(__DEC_eTypeAccess_superInterfaces_279277)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_264796 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess eTypeAccess, Type eType) {
		for (ArrayType __DEC_eTypeAccess_elementType_651795 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			if (!eType.equals(__DEC_eTypeAccess_elementType_651795)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_651219 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess eTypeAccess, Type eType) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_331444 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eType.equals(__DEC_eTypeAccess_superClass_331444)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_637638 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_729386 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_27795 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEModel = _edge_orphanTypes.getSrc();
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			EObject tmpEParameterizedType = _edge_orphanTypes.getTrg();
			if (tmpEParameterizedType instanceof ParameterizedType) {
				ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
				if (eModel.getOrphanTypes().contains(eParameterizedType)) {
					TypeAccess eTypeAccess = eParameterizedType.getType();
					if (eTypeAccess != null) {
						Type eType = eTypeAccess.getType();
						if (eType != null) {
							if (!eParameterizedType.equals(eType)) {
								if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_1B(
										eTypeAccess) == null) {
									if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_3B(
											eTypeAccess) == null) {
										if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_5B(
												eTypeAccess) == null) {
											if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_6B(
													eTypeAccess) == null) {
												if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_7B(
														eTypeAccess) == null) {
													if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_0BB(
															eTypeAccess, eType) == null) {
														if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_2BB(
																eTypeAccess, eType) == null) {
															if (pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_black_nac_4BB(
																	eTypeAccess, eType) == null) {
																_result.add(new Object[] { eModel, eType,
																		eParameterizedType, eTypeAccess,
																		_edge_orphanTypes });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ParameterizedTypeToClass_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ParameterizedTypeToClass_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ParameterizedTypeToClass _this, Match match, Model eModel, Type eType, ParameterizedType eParameterizedType,
			TypeAccess eTypeAccess) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eModel, eType, eParameterizedType, eTypeAccess);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ParameterizedTypeToClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ParameterizedTypeToClass_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_1_prepare_blackB(ParameterizedTypeToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eModel");
		EObject _localVariable_1 = targetMatch.getObject("pg");
		EObject _localVariable_2 = sourceMatch.getObject("eType");
		EObject _localVariable_3 = sourceMatch.getObject("eParameterizedType");
		EObject _localVariable_4 = targetMatch.getObject("tAbstractType");
		EObject _localVariable_5 = sourceMatch.getObject("eTypeAccess");
		EObject tmpEModel = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpEType = _localVariable_2;
		EObject tmpEParameterizedType = _localVariable_3;
		EObject tmpTAbstractType = _localVariable_4;
		EObject tmpETypeAccess = _localVariable_5;
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpEType instanceof Type) {
					Type eType = (Type) tmpEType;
					if (tmpEParameterizedType instanceof ParameterizedType) {
						ParameterizedType eParameterizedType = (ParameterizedType) tmpEParameterizedType;
						if (tmpTAbstractType instanceof TAbstractType) {
							TAbstractType tAbstractType = (TAbstractType) tmpTAbstractType;
							if (tmpETypeAccess instanceof TypeAccess) {
								TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
								return new Object[] { eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_blackBBBBBBBB(Model eModel,
			TypeGraph pg, Type eType, ParameterizedType eParameterizedType, TAbstractType tAbstractType,
			TypeAccess eTypeAccess, Match sourceMatch, Match targetMatch) {
		if (!eParameterizedType.equals(eType)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding = pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding != null) {
			Model eModel = (Model) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[1];
			Type eType = (Type) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[2];
			ParameterizedType eParameterizedType = (ParameterizedType) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[3];
			TAbstractType tAbstractType = (TAbstractType) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[4];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_black = pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_blackBBBBBBBB(
					eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, sourceMatch, targetMatch);
			if (result_pattern_ParameterizedTypeToClass_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_3_solvecsp_bindingFBBBBBBBBB(
			ParameterizedTypeToClass _this, Model eModel, TypeGraph pg, Type eType,
			ParameterizedType eParameterizedType, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(eModel, pg, eType, eParameterizedType, tAbstractType,
				eTypeAccess, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			ParameterizedTypeToClass _this, Model eModel, TypeGraph pg, Type eType,
			ParameterizedType eParameterizedType, TAbstractType tAbstractType, TypeAccess eTypeAccess,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ParameterizedTypeToClass_21_3_solvecsp_binding = pattern_ParameterizedTypeToClass_21_3_solvecsp_bindingFBBBBBBBBB(
				_this, eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, sourceMatch, targetMatch);
		if (result_pattern_ParameterizedTypeToClass_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_21_3_solvecsp_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_21_3_solvecsp_black = pattern_ParameterizedTypeToClass_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_21_5_matchcorrcontext_blackBBBBFFBB(
			Model eModel, TypeGraph pg, Type eType, TAbstractType tAbstractType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph eModelToPg : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
				if (pg.equals(eModelToPg.getTarget())) {
					for (TypeToTAbstractType eTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
						if (tAbstractType.equals(eTypeToTAbstractType.getTarget())) {
							_result.add(new Object[] { eModel, pg, eType, tAbstractType, eModelToPg,
									eTypeToTAbstractType, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_5_matchcorrcontext_greenBBBBF(
			ModelToTypeGraph eModelToPg, TypeToTAbstractType eTypeToTAbstractType, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ParameterizedTypeToClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eModelToPg);
		ccMatch.getAllContextElements().add(eTypeToTAbstractType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eModelToPg, eTypeToTAbstractType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_6_createcorrespondence_blackBBBBBBB(Model eModel,
			TypeGraph pg, Type eType, ParameterizedType eParameterizedType, TAbstractType tAbstractType,
			TypeAccess eTypeAccess, CCMatch ccMatch) {
		if (!eParameterizedType.equals(eType)) {
			return new Object[] { eModel, pg, eType, eParameterizedType, tAbstractType, eTypeAccess, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_6_createcorrespondence_greenBBFB(
			ParameterizedType eParameterizedType, TAbstractType tAbstractType, CCMatch ccMatch) {
		TypeToTAbstractType eParameterizedTypeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		ccMatch.getCreateCorr().add(eParameterizedTypeToTAbstractType);
		return new Object[] { eParameterizedType, tAbstractType, eParameterizedTypeToTAbstractType, ccMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ParameterizedTypeToClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ParameterizedTypeToClass_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_0BB(
			TypeAccess eTypeAccess, Type eType) {
		for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_268965 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!eType.equals(__DEC_eTypeAccess_superInterfaces_268965)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_423634 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_2BB(
			TypeAccess eTypeAccess, Type eType) {
		for (ArrayType __DEC_eTypeAccess_elementType_950744 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			if (!eType.equals(__DEC_eTypeAccess_elementType_950744)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_276940 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_4BB(
			TypeAccess eTypeAccess, Type eType) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_868711 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eType.equals(__DEC_eTypeAccess_superClass_868711)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_754939 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_572907 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_963722 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_24_1_matchtggpattern_blackBBBB(Model eModel,
			Type eType, ParameterizedType eParameterizedType, TypeAccess eTypeAccess) {
		if (!eParameterizedType.equals(eType)) {
			if (eModel.getOrphanTypes().contains(eParameterizedType)) {
				if (eTypeAccess.equals(eParameterizedType.getType())) {
					if (eType.equals(eTypeAccess.getType())) {
						if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_0BB(eTypeAccess,
								eType) == null) {
							if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_1B(
									eTypeAccess) == null) {
								if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_2BB(eTypeAccess,
										eType) == null) {
									if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_3B(
											eTypeAccess) == null) {
										if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_4BB(
												eTypeAccess, eType) == null) {
											if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_5B(
													eTypeAccess) == null) {
												if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_6B(
														eTypeAccess) == null) {
													if (pattern_ParameterizedTypeToClass_24_1_matchtggpattern_black_nac_7B(
															eTypeAccess) == null) {
														return new Object[] { eModel, eType, eParameterizedType,
																eTypeAccess };
													}
												}
											}
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

	public static final boolean pattern_ParameterizedTypeToClass_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_25_1_matchtggpattern_blackBB(TypeGraph pg,
			TAbstractType tAbstractType) {
		if (pg.getOwnedTypes().contains(tAbstractType)) {
			return new Object[] { pg, tAbstractType };
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ParameterizedTypeToClass_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_1_createresult_blackB(
			ParameterizedTypeToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, Model eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToPg) {
		if (ruleResult.getCorrObjects().contains(eModelToPg)) {
			return new Object[] { ruleResult, eModelToPg };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tAbstractType) {
		if (ruleResult.getTargetObjects().contains(tAbstractType)) {
			return new Object[] { ruleResult, tAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eTypeToTAbstractType) {
		if (ruleResult.getCorrObjects().contains(eTypeToTAbstractType)) {
			return new Object[] { ruleResult, eTypeToTAbstractType };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Type eType) {
		if (ruleResult.getSourceObjects().contains(eType)) {
			return new Object[] { ruleResult, eType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ParameterizedTypeToClass_26_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eModelToPgList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpEModelToPg : eModelToPgList.getEntryObjects()) {
				if (tmpEModelToPg instanceof ModelToTypeGraph) {
					ModelToTypeGraph eModelToPg = (ModelToTypeGraph) tmpEModelToPg;
					Model eModel = eModelToPg.getSource();
					if (eModel != null) {
						TypeGraph pg = eModelToPg.getTarget();
						if (pg != null) {
							if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_1BB(ruleResult,
									eModelToPg) == null) {
								if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_0BB(ruleResult,
										eModel) == null) {
									if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_2BB(ruleResult,
											pg) == null) {
										for (TAbstractType tAbstractType : pg.getOwnedTypes()) {
											if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_3BB(
													ruleResult, tAbstractType) == null) {
												for (TypeToTAbstractType eTypeToTAbstractType : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(tAbstractType,
																TypeToTAbstractType.class, "target")) {
													Type eType = eTypeToTAbstractType.getSource();
													if (eType != null) {
														if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_4BB(
																ruleResult, eTypeToTAbstractType) == null) {
															if (pattern_ParameterizedTypeToClass_26_2_isapplicablecore_black_nac_5BB(
																	ruleResult, eType) == null) {
																_result.add(new Object[] { eModelToPgList, eModel,
																		eModelToPg, pg, tAbstractType,
																		eTypeToTAbstractType, eType, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_3_solveCSP_bindingFBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph pg, Type eType,
			TAbstractType tAbstractType, ModelToTypeGraph eModelToPg, TypeToTAbstractType eTypeToTAbstractType,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eModel, pg, eType, tAbstractType,
				eModelToPg, eTypeToTAbstractType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eModel, pg, eType, tAbstractType, eModelToPg,
					eTypeToTAbstractType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ParameterizedTypeToClass _this, IsApplicableMatch isApplicableMatch, Model eModel, TypeGraph pg, Type eType,
			TAbstractType tAbstractType, ModelToTypeGraph eModelToPg, TypeToTAbstractType eTypeToTAbstractType,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ParameterizedTypeToClass_26_3_solveCSP_binding = pattern_ParameterizedTypeToClass_26_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eModel, pg, eType, tAbstractType, eModelToPg, eTypeToTAbstractType,
				ruleResult);
		if (result_pattern_ParameterizedTypeToClass_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ParameterizedTypeToClass_26_3_solveCSP_binding[0];

			Object[] result_pattern_ParameterizedTypeToClass_26_3_solveCSP_black = pattern_ParameterizedTypeToClass_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_ParameterizedTypeToClass_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eModel, pg, eType, tAbstractType, eModelToPg,
						eTypeToTAbstractType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ParameterizedTypeToClass_26_4_checkCSP_expressionFBB(
			ParameterizedTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_5_checknacs_blackBBBBBB(Model eModel, TypeGraph pg,
			Type eType, TAbstractType tAbstractType, ModelToTypeGraph eModelToPg,
			TypeToTAbstractType eTypeToTAbstractType) {
		return new Object[] { eModel, pg, eType, tAbstractType, eModelToPg, eTypeToTAbstractType };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_6_perform_blackBBBBBBB(Model eModel, TypeGraph pg,
			Type eType, TAbstractType tAbstractType, ModelToTypeGraph eModelToPg,
			TypeToTAbstractType eTypeToTAbstractType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eModel, pg, eType, tAbstractType, eModelToPg, eTypeToTAbstractType, ruleResult };
	}

	public static final Object[] pattern_ParameterizedTypeToClass_26_6_perform_greenBBFBFFB(Model eModel, Type eType,
			TAbstractType tAbstractType, ModelgeneratorRuleResult ruleResult) {
		ParameterizedType eParameterizedType = JavaFactory.eINSTANCE.createParameterizedType();
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		TypeToTAbstractType eParameterizedTypeToTAbstractType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eModel.getOrphanTypes().add(eParameterizedType);
		ruleResult.getSourceObjects().add(eParameterizedType);
		eParameterizedType.setType(eTypeAccess);
		eTypeAccess.setType(eType);
		ruleResult.getSourceObjects().add(eTypeAccess);
		eParameterizedTypeToTAbstractType.setSource(eParameterizedType);
		eParameterizedTypeToTAbstractType.setTarget(tAbstractType);
		ruleResult.getCorrObjects().add(eParameterizedTypeToTAbstractType);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eModel, eType, eParameterizedType, tAbstractType, eTypeAccess,
				eParameterizedTypeToTAbstractType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ParameterizedTypeToClass_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ParameterizedTypeToClassImpl
