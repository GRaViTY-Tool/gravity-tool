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
import org.eclipse.modisco.java.Type;

import org.gravity.modisco.MClass;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;

import org.gravity.tgg.modisco.pm.Rules.RulesPackage;
import org.gravity.tgg.modisco.pm.Rules.TypesOrphaned;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
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
 * An implementation of the model object '<em><b>Types Orphaned</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypesOrphanedImpl extends AbstractRuleImpl implements TypesOrphaned {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypesOrphanedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getTypesOrphaned();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MClass mType, Model mModel) {

		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_0_1_initialbindings_blackBBBB(this, match,
				mType, mModel);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mModel] = " + mModel + ".");
		}

		Object[] result2_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mType, mModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mType] = " + mType + ", " + "[mModel] = " + mModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypesOrphanedImpl.pattern_TypesOrphaned_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypesOrphanedImpl
					.pattern_TypesOrphaned_0_4_collectelementstobetranslated_blackBBB(match, mType, mModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mType] = " + mType + ", " + "[mModel] = " + mModel + ".");
			}
			TypesOrphanedImpl.pattern_TypesOrphaned_0_4_collectelementstobetranslated_greenBBBF(match, mType, mModel);
			//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = TypesOrphanedImpl.pattern_TypesOrphaned_0_5_collectcontextelements_blackBBB(match,
					mType, mModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mType] = " + mType + ", " + "[mModel] = " + mModel + ".");
			}
			TypesOrphanedImpl.pattern_TypesOrphaned_0_5_collectcontextelements_greenBBB(match, mType, mModel);

			// 
			TypesOrphanedImpl.pattern_TypesOrphaned_0_6_registerobjectstomatch_expressionBBBB(this, match, mType,
					mModel);
			return TypesOrphanedImpl.pattern_TypesOrphaned_0_7_expressionF();
		} else {
			return TypesOrphanedImpl.pattern_TypesOrphaned_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MClass mType = (MClass) result1_bindingAndBlack[0];
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[1];
		Model mModel = (Model) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[4];
		TClass tType = (TClass) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		TypesOrphanedImpl.pattern_TypesOrphaned_1_1_performtransformation_greenBB(pg, tType);

		Object[] result2_green = TypesOrphanedImpl.pattern_TypesOrphaned_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypesOrphanedImpl.pattern_TypesOrphaned_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mType] = " + mType + ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ", "
					+ "[mModel] = " + mModel + ", " + "[pg] = " + pg + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tType] = " + tType + ".");
		}
		TypesOrphanedImpl.pattern_TypesOrphaned_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult, mType, mModel, pg,
				tType);
		//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[7];

		// 
		// 
		TypesOrphanedImpl.pattern_TypesOrphaned_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mType,
				mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
		return TypesOrphanedImpl.pattern_TypesOrphaned_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypesOrphanedImpl
				.pattern_TypesOrphaned_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypesOrphanedImpl.pattern_TypesOrphaned_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MClass mType = (MClass) result2_binding[0];
		Model mModel = (Model) result2_binding[1];
		for (Object[] result2_black : TypesOrphanedImpl.pattern_TypesOrphaned_2_2_corematch_blackBFBFFFB(mType, mModel,
				match)) {
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[4];
			TClass tType = (TClass) result2_black[5];
			// ForEach 
			for (Object[] result3_black : TypesOrphanedImpl.pattern_TypesOrphaned_2_3_findcontext_blackBBBBBB(mType,
					mModelToTypeGraph, mModel, pg, mTypeToTType, tType)) {
				Object[] result3_green = TypesOrphanedImpl.pattern_TypesOrphaned_2_3_findcontext_greenBBBBBBFFFFFF(
						mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mModelToTypeGraph__pg____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = TypesOrphanedImpl
						.pattern_TypesOrphaned_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, mType,
								mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mType] = " + mType + ", "
							+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[mModel] = " + mModel + ", "
							+ "[pg] = " + pg + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypesOrphanedImpl.pattern_TypesOrphaned_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypesOrphanedImpl
							.pattern_TypesOrphaned_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MClass mType, Model mModel) {
		match.registerObject("mType", mType);
		match.registerObject("mModel", mModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MClass mType, Model mModel) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mType, EObject mModelToTypeGraph,
			EObject mModel, EObject pg, EObject mTypeToTType, EObject tType) {
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph pg, TClass tType) {

		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_10_1_initialbindings_blackBBBB(this, match, pg,
				tType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
		}

		Object[] result2_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, pg, tType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (TypesOrphanedImpl.pattern_TypesOrphaned_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = TypesOrphanedImpl
					.pattern_TypesOrphaned_10_4_collectelementstobetranslated_blackBBB(match, pg, tType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
			}
			TypesOrphanedImpl.pattern_TypesOrphaned_10_4_collectelementstobetranslated_greenBBBFF(match, pg, tType);
			//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result4_green[4];

			Object[] result5_black = TypesOrphanedImpl.pattern_TypesOrphaned_10_5_collectcontextelements_blackBBB(match,
					pg, tType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[pg] = " + pg + ", " + "[tType] = " + tType + ".");
			}
			TypesOrphanedImpl.pattern_TypesOrphaned_10_5_collectcontextelements_greenBBB(match, pg, tType);

			// 
			TypesOrphanedImpl.pattern_TypesOrphaned_10_6_registerobjectstomatch_expressionBBBB(this, match, pg, tType);
			return TypesOrphanedImpl.pattern_TypesOrphaned_10_7_expressionF();
		} else {
			return TypesOrphanedImpl.pattern_TypesOrphaned_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MClass mType = (MClass) result1_bindingAndBlack[0];
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[1];
		Model mModel = (Model) result1_bindingAndBlack[2];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[3];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_bindingAndBlack[4];
		TClass tType = (TClass) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		TypesOrphanedImpl.pattern_TypesOrphaned_11_1_performtransformation_greenBB(mType, mModel);

		Object[] result2_green = TypesOrphanedImpl.pattern_TypesOrphaned_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = TypesOrphanedImpl.pattern_TypesOrphaned_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mType] = " + mType + ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ", "
					+ "[mModel] = " + mModel + ", " + "[pg] = " + pg + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
					+ "[tType] = " + tType + ".");
		}
		TypesOrphanedImpl.pattern_TypesOrphaned_11_3_bookkeepingforedges_greenBBBBBFFF(ruleresult, mType, mModel, pg,
				tType);
		//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[7];

		// 
		// 
		TypesOrphanedImpl.pattern_TypesOrphaned_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, mType,
				mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
		return TypesOrphanedImpl.pattern_TypesOrphaned_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = TypesOrphanedImpl
				.pattern_TypesOrphaned_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = TypesOrphanedImpl.pattern_TypesOrphaned_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph pg = (TypeGraph) result2_binding[0];
		TClass tType = (TClass) result2_binding[1];
		for (Object[] result2_black : TypesOrphanedImpl.pattern_TypesOrphaned_12_2_corematch_blackFFFBFBB(pg, tType,
				match)) {
			MClass mType = (MClass) result2_black[0];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			Model mModel = (Model) result2_black[2];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[4];
			// ForEach 
			for (Object[] result3_black : TypesOrphanedImpl.pattern_TypesOrphaned_12_3_findcontext_blackBBBBBB(mType,
					mModelToTypeGraph, mModel, pg, mTypeToTType, tType)) {
				Object[] result3_green = TypesOrphanedImpl.pattern_TypesOrphaned_12_3_findcontext_greenBBBBBBFFFFFFF(
						mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge pg__tType____ownedTypes = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mModelToTypeGraph__pg____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = TypesOrphanedImpl
						.pattern_TypesOrphaned_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch, mType,
								mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mType] = " + mType + ", "
							+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[mModel] = " + mModel + ", "
							+ "[pg] = " + pg + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType
							+ ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (TypesOrphanedImpl.pattern_TypesOrphaned_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = TypesOrphanedImpl
							.pattern_TypesOrphaned_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph pg, TClass tType) {
		match.registerObject("pg", pg);
		match.registerObject("tType", tType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph pg, TClass tType) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mType, EObject mModelToTypeGraph,
			EObject mModel, EObject pg, EObject mTypeToTType, EObject tType) {
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("tType", tType);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_28(EMoflonEdge _edge_ownedTypes) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypesOrphanedImpl
				.pattern_TypesOrphaned_20_2_testcorematchandDECs_blackFFB(_edge_ownedTypes)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			TClass tType = (TClass) result2_black[1];
			Object[] result2_green = TypesOrphanedImpl
					.pattern_TypesOrphaned_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypesOrphanedImpl.pattern_TypesOrphaned_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, pg, tType)) {
				// 
				if (TypesOrphanedImpl
						.pattern_TypesOrphaned_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TypesOrphanedImpl
							.pattern_TypesOrphaned_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_29(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : TypesOrphanedImpl
				.pattern_TypesOrphaned_21_2_testcorematchandDECs_blackFFB(_edge_orphanTypes)) {
			MClass mType = (MClass) result2_black[0];
			Model mModel = (Model) result2_black[1];
			Object[] result2_green = TypesOrphanedImpl
					.pattern_TypesOrphaned_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (TypesOrphanedImpl.pattern_TypesOrphaned_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, mType, mModel)) {
				// 
				if (TypesOrphanedImpl
						.pattern_TypesOrphaned_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = TypesOrphanedImpl
							.pattern_TypesOrphaned_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("TypesOrphaned");
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
		ruleResult.setRule("TypesOrphaned");
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

		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MClass mType = (MClass) result2_bindingAndBlack[0];
		Model mModel = (Model) result2_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[2];
		TClass tType = (TClass) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = TypesOrphanedImpl
				.pattern_TypesOrphaned_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, mType, mModel, pg, tType,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mType] = " + mType + ", " + "[mModel] = " + mModel + ", " + "[pg] = " + pg + ", " + "[tType] = "
					+ tType + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (TypesOrphanedImpl.pattern_TypesOrphaned_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : TypesOrphanedImpl.pattern_TypesOrphaned_24_5_matchcorrcontext_blackBFBBFBBB(
					mType, mModel, pg, tType, sourceMatch, targetMatch)) {
				ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result5_black[1];
				TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result5_black[4];
				Object[] result5_green = TypesOrphanedImpl.pattern_TypesOrphaned_24_5_matchcorrcontext_greenBBBBF(
						mModelToTypeGraph, mTypeToTType, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = TypesOrphanedImpl
						.pattern_TypesOrphaned_24_6_createcorrespondence_blackBBBBB(mType, mModel, pg, tType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mType] = " + mType + ", "
							+ "[mModel] = " + mModel + ", " + "[pg] = " + pg + ", " + "[tType] = " + tType + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = TypesOrphanedImpl
						.pattern_TypesOrphaned_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				TypesOrphanedImpl.pattern_TypesOrphaned_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MClass mType, Model mModel, TypeGraph pg, TClass tType, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MClass mType, Model mModel) {// 
		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_27_1_matchtggpattern_blackBB(mType, mModel);
		if (result1_black != null) {
			return TypesOrphanedImpl.pattern_TypesOrphaned_27_2_expressionF();
		} else {
			return TypesOrphanedImpl.pattern_TypesOrphaned_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph pg, TClass tType) {// 
		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_28_1_matchtggpattern_blackBB(pg, tType);
		if (result1_black != null) {
			return TypesOrphanedImpl.pattern_TypesOrphaned_28_2_expressionF();
		} else {
			return TypesOrphanedImpl.pattern_TypesOrphaned_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType mTypeToTTypeParameter, ModelToTypeGraph mModelToTypeGraphParameter) {

		Object[] result1_black = TypesOrphanedImpl.pattern_TypesOrphaned_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = TypesOrphanedImpl.pattern_TypesOrphaned_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : TypesOrphanedImpl
				.pattern_TypesOrphaned_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mTypeToTTypeList = (RuleEntryList) result2_black[0];
			MClass mType = (MClass) result2_black[1];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result2_black[2];
			TClass tType = (TClass) result2_black[3];
			//nothing RuleEntryList mModelToTypeGraphList = (RuleEntryList) result2_black[4];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[5];
			Model mModel = (Model) result2_black[6];
			TypeGraph pg = (TypeGraph) result2_black[7];

			Object[] result3_bindingAndBlack = TypesOrphanedImpl
					.pattern_TypesOrphaned_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch, mType,
							mModelToTypeGraph, mModel, pg, mTypeToTType, tType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mType] = " + mType + ", "
						+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[mModel] = " + mModel + ", "
						+ "[pg] = " + pg + ", " + "[mTypeToTType] = " + mTypeToTType + ", " + "[tType] = " + tType
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (TypesOrphanedImpl.pattern_TypesOrphaned_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = TypesOrphanedImpl.pattern_TypesOrphaned_29_5_checknacs_blackBBBBBB(mType,
						mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
				if (result5_black != null) {

					Object[] result6_black = TypesOrphanedImpl.pattern_TypesOrphaned_29_6_perform_blackBBBBBBB(mType,
							mModelToTypeGraph, mModel, pg, mTypeToTType, tType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mType] = " + mType
								+ ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[mModel] = " + mModel
								+ ", " + "[pg] = " + pg + ", " + "[mTypeToTType] = " + mTypeToTType + ", "
								+ "[tType] = " + tType + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					TypesOrphanedImpl.pattern_TypesOrphaned_29_6_perform_greenBBBBB(mType, mModel, pg, tType,
							ruleResult);

				} else {
				}

			} else {
			}

		}
		return TypesOrphanedImpl.pattern_TypesOrphaned_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mTypeToTType", mTypeToTType);
		isApplicableMatch.registerObject("tType", tType);
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
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_FWD__MATCH_MCLASS_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (MClass) arguments.get(1), (Model) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCLASS_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MClass) arguments.get(1), (Model) arguments.get(2));
			return null;
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCLASS_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MCLASS_MODELTOTYPEGRAPH_MODEL_TYPEGRAPH_TYPETOTABSTRACTTYPE_TCLASS:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MClass) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (Model) arguments.get(3), (TypeGraph) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (TClass) arguments.get(6));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TYPES_ORPHANED___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TCLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1), (TClass) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TCLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2));
			return null;
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TCLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TClass) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MCLASS_MODELTOTYPEGRAPH_MODEL_TYPEGRAPH_TYPETOTABSTRACTTYPE_TCLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MClass) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (Model) arguments.get(3), (TypeGraph) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (TClass) arguments.get(6));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.TYPES_ORPHANED___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_BWD_EMOFLON_EDGE_28__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_28((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPROPRIATE_FWD_EMOFLON_EDGE_29__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_29((EMoflonEdge) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_SOLVE_CSP_CC__MCLASS_MODEL_TYPEGRAPH_TCLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MClass) arguments.get(0), (Model) arguments.get(1),
					(TypeGraph) arguments.get(2), (TClass) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.TYPES_ORPHANED___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.TYPES_ORPHANED___CHECK_DEC_FWD__MCLASS_MODEL:
			return checkDEC_FWD((MClass) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___CHECK_DEC_BWD__TYPEGRAPH_TCLASS:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TClass) arguments.get(1));
		case RulesPackage.TYPES_ORPHANED___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2));
		case RulesPackage.TYPES_ORPHANED___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MCLASS_MODELTOTYPEGRAPH_MODEL_TYPEGRAPH_TYPETOTABSTRACTTYPE_TCLASS_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MClass) arguments.get(1),
					(ModelToTypeGraph) arguments.get(2), (Model) arguments.get(3), (TypeGraph) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (TClass) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.TYPES_ORPHANED___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_TypesOrphaned_0_1_initialbindings_blackBBBB(TypesOrphaned _this, Match match,
			MClass mType, Model mModel) {
		return new Object[] { _this, match, mType, mModel };
	}

	public static final Object[] pattern_TypesOrphaned_0_2_SolveCSP_bindingFBBBB(TypesOrphaned _this, Match match,
			MClass mType, Model mModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mType, mModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mType, mModel };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_0_2_SolveCSP_bindingAndBlackFBBBB(TypesOrphaned _this,
			Match match, MClass mType, Model mModel) {
		Object[] result_pattern_TypesOrphaned_0_2_SolveCSP_binding = pattern_TypesOrphaned_0_2_SolveCSP_bindingFBBBB(
				_this, match, mType, mModel);
		if (result_pattern_TypesOrphaned_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_0_2_SolveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_0_2_SolveCSP_black = pattern_TypesOrphaned_0_2_SolveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mType, mModel };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_0_3_CheckCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_0_4_collectelementstobetranslated_blackBBB(Match match,
			MClass mType, Model mModel) {
		return new Object[] { match, mType, mModel };
	}

	public static final Object[] pattern_TypesOrphaned_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MClass mType, Model mModel) {
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		match.getToBeTranslatedEdges().add(mModel__mType____orphanTypes);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		return new Object[] { match, mType, mModel, mModel__mType____orphanTypes };
	}

	public static final Object[] pattern_TypesOrphaned_0_5_collectcontextelements_blackBBB(Match match, MClass mType,
			Model mModel) {
		return new Object[] { match, mType, mModel };
	}

	public static final Object[] pattern_TypesOrphaned_0_5_collectcontextelements_greenBBB(Match match, MClass mType,
			Model mModel) {
		match.getContextNodes().add(mType);
		match.getContextNodes().add(mModel);
		return new Object[] { match, mType, mModel };
	}

	public static final void pattern_TypesOrphaned_0_6_registerobjectstomatch_expressionBBBB(TypesOrphaned _this,
			Match match, MClass mType, Model mModel) {
		_this.registerObjectsToMatch_FWD(match, mType, mModel);

	}

	public static final boolean pattern_TypesOrphaned_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject _localVariable_4 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tType");
		EObject tmpMType = _localVariable_0;
		EObject tmpMModelToTypeGraph = _localVariable_1;
		EObject tmpMModel = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpMTypeToTType = _localVariable_4;
		EObject tmpTType = _localVariable_5;
		if (tmpMType instanceof MClass) {
			MClass mType = (MClass) tmpMType;
			if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
				ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
				if (tmpMModel instanceof Model) {
					Model mModel = (Model) tmpMModel;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							if (tmpTType instanceof TClass) {
								TClass tType = (TClass) tmpTType;
								return new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_blackBBBBBBFBB(MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType, TypesOrphaned _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			TypesOrphaned _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypesOrphaned_1_1_performtransformation_binding = pattern_TypesOrphaned_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypesOrphaned_1_1_performtransformation_binding != null) {
			MClass mType = (MClass) result_pattern_TypesOrphaned_1_1_performtransformation_binding[0];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_TypesOrphaned_1_1_performtransformation_binding[1];
			Model mModel = (Model) result_pattern_TypesOrphaned_1_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_TypesOrphaned_1_1_performtransformation_binding[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_TypesOrphaned_1_1_performtransformation_binding[4];
			TClass tType = (TClass) result_pattern_TypesOrphaned_1_1_performtransformation_binding[5];

			Object[] result_pattern_TypesOrphaned_1_1_performtransformation_black = pattern_TypesOrphaned_1_1_performtransformation_blackBBBBBBFBB(
					mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, _this, isApplicableMatch);
			if (result_pattern_TypesOrphaned_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypesOrphaned_1_1_performtransformation_black[6];

				return new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_1_1_performtransformation_greenBB(TypeGraph pg, TClass tType) {
		pg.getOwnedTypes().add(tType);
		return new Object[] { pg, tType };
	}

	public static final Object[] pattern_TypesOrphaned_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_TypesOrphaned_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mType, EObject mModelToTypeGraph, EObject mModel, EObject pg,
			EObject mTypeToTType, EObject tType) {
		if (!mType.equals(pg)) {
			if (!mType.equals(mTypeToTType)) {
				if (!mType.equals(tType)) {
					if (!mModelToTypeGraph.equals(mType)) {
						if (!mModelToTypeGraph.equals(pg)) {
							if (!mModelToTypeGraph.equals(mTypeToTType)) {
								if (!mModelToTypeGraph.equals(tType)) {
									if (!mModel.equals(mType)) {
										if (!mModel.equals(mModelToTypeGraph)) {
											if (!mModel.equals(pg)) {
												if (!mModel.equals(mTypeToTType)) {
													if (!mModel.equals(tType)) {
														if (!pg.equals(tType)) {
															if (!mTypeToTType.equals(pg)) {
																if (!mTypeToTType.equals(tType)) {
																	return new Object[] { ruleresult, mType,
																			mModelToTypeGraph, mModel, pg, mTypeToTType,
																			tType };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypesOrphaned_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject mType, EObject mModel, EObject pg, EObject tType) {
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypesOrphaned";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tType__pg____model);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mModel__mType____orphanTypes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		return new Object[] { ruleresult, mType, mModel, pg, tType, pg__tType____ownedTypes, tType__pg____model,
				mModel__mType____orphanTypes };
	}

	public static final void pattern_TypesOrphaned_1_5_registerobjects_expressionBBBBBBBB(TypesOrphaned _this,
			PerformRuleResult ruleresult, EObject mType, EObject mModelToTypeGraph, EObject mModel, EObject pg,
			EObject mTypeToTType, EObject tType) {
		_this.registerObjects_FWD(ruleresult, mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType);

	}

	public static final PerformRuleResult pattern_TypesOrphaned_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_2_1_preparereturnvalue_bindingFB(TypesOrphaned _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_2_1_preparereturnvalue_blackFBB(EClass eClass,
			TypesOrphaned _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_2_1_preparereturnvalue_bindingAndBlackFFB(TypesOrphaned _this) {
		Object[] result_pattern_TypesOrphaned_2_1_preparereturnvalue_binding = pattern_TypesOrphaned_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesOrphaned_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypesOrphaned_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesOrphaned_2_1_preparereturnvalue_black = pattern_TypesOrphaned_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypesOrphaned_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypesOrphaned_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypesOrphaned";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypesOrphaned_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mType");
		EObject _localVariable_1 = match.getObject("mModel");
		EObject tmpMType = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		if (tmpMType instanceof MClass) {
			MClass mType = (MClass) tmpMType;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				return new Object[] { mType, mModel, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_2_2_corematch_blackBFBFFFB(MClass mType, Model mModel,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
			TypeGraph pg = mModelToTypeGraph.getTarget();
			if (pg != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
					TAbstractType tmpTType = mTypeToTType.getTarget();
					if (tmpTType instanceof TClass) {
						TClass tType = (TClass) tmpTType;
						_result.add(new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_2_3_findcontext_blackBBBBBB(MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModel.equals(mModelToTypeGraph.getSource())) {
			if (pg.equals(mModelToTypeGraph.getTarget())) {
				if (mType.equals(mTypeToTType.getSource())) {
					if (mModel.getOrphanTypes().contains(mType)) {
						if (tType.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_2_3_findcontext_greenBBBBBBFFFFFF(MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		String mModelToTypeGraph__pg____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		mModelToTypeGraph__pg____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__pg____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mModel__mType____orphanTypes);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		mModelToTypeGraph__pg____target.setName(mModelToTypeGraph__pg____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, isApplicableMatch,
				mModelToTypeGraph__mModel____source, mModelToTypeGraph__pg____target, mTypeToTType__mType____source,
				mModel__mType____orphanTypes, mTypeToTType__tType____target };
	}

	public static final Object[] pattern_TypesOrphaned_2_4_solveCSP_bindingFBBBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, MClass mType, ModelToTypeGraph mModelToTypeGraph, Model mModel,
			TypeGraph pg, TypeToTAbstractType mTypeToTType, TClass tType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mType, mModelToTypeGraph, mModel, pg,
				mTypeToTType, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mType, mModelToTypeGraph, mModel, pg, mTypeToTType,
					tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_2_4_solveCSP_bindingAndBlackFBBBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, MClass mType, ModelToTypeGraph mModelToTypeGraph, Model mModel,
			TypeGraph pg, TypeToTAbstractType mTypeToTType, TClass tType) {
		Object[] result_pattern_TypesOrphaned_2_4_solveCSP_binding = pattern_TypesOrphaned_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
		if (result_pattern_TypesOrphaned_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_2_4_solveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_2_4_solveCSP_black = pattern_TypesOrphaned_2_4_solveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mType, mModelToTypeGraph, mModel, pg, mTypeToTType,
						tType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_2_5_checkCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypesOrphaned_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypesOrphaned";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypesOrphaned_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_10_1_initialbindings_blackBBBB(TypesOrphaned _this, Match match,
			TypeGraph pg, TClass tType) {
		return new Object[] { _this, match, pg, tType };
	}

	public static final Object[] pattern_TypesOrphaned_10_2_SolveCSP_bindingFBBBB(TypesOrphaned _this, Match match,
			TypeGraph pg, TClass tType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, pg, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_10_2_SolveCSP_bindingAndBlackFBBBB(TypesOrphaned _this,
			Match match, TypeGraph pg, TClass tType) {
		Object[] result_pattern_TypesOrphaned_10_2_SolveCSP_binding = pattern_TypesOrphaned_10_2_SolveCSP_bindingFBBBB(
				_this, match, pg, tType);
		if (result_pattern_TypesOrphaned_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_10_2_SolveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_10_2_SolveCSP_black = pattern_TypesOrphaned_10_2_SolveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, pg, tType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_10_3_CheckCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_10_4_collectelementstobetranslated_blackBBB(Match match,
			TypeGraph pg, TClass tType) {
		return new Object[] { match, pg, tType };
	}

	public static final Object[] pattern_TypesOrphaned_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TypeGraph pg, TClass tType) {
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____model);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		return new Object[] { match, pg, tType, pg__tType____ownedTypes, tType__pg____model };
	}

	public static final Object[] pattern_TypesOrphaned_10_5_collectcontextelements_blackBBB(Match match, TypeGraph pg,
			TClass tType) {
		return new Object[] { match, pg, tType };
	}

	public static final Object[] pattern_TypesOrphaned_10_5_collectcontextelements_greenBBB(Match match, TypeGraph pg,
			TClass tType) {
		match.getContextNodes().add(pg);
		match.getContextNodes().add(tType);
		return new Object[] { match, pg, tType };
	}

	public static final void pattern_TypesOrphaned_10_6_registerobjectstomatch_expressionBBBB(TypesOrphaned _this,
			Match match, TypeGraph pg, TClass tType) {
		_this.registerObjectsToMatch_BWD(match, pg, tType);

	}

	public static final boolean pattern_TypesOrphaned_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mType");
		EObject _localVariable_1 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_3 = isApplicableMatch.getObject("pg");
		EObject _localVariable_4 = isApplicableMatch.getObject("mTypeToTType");
		EObject _localVariable_5 = isApplicableMatch.getObject("tType");
		EObject tmpMType = _localVariable_0;
		EObject tmpMModelToTypeGraph = _localVariable_1;
		EObject tmpMModel = _localVariable_2;
		EObject tmpPg = _localVariable_3;
		EObject tmpMTypeToTType = _localVariable_4;
		EObject tmpTType = _localVariable_5;
		if (tmpMType instanceof MClass) {
			MClass mType = (MClass) tmpMType;
			if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
				ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
				if (tmpMModel instanceof Model) {
					Model mModel = (Model) tmpMModel;
					if (tmpPg instanceof TypeGraph) {
						TypeGraph pg = (TypeGraph) tmpPg;
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							if (tmpTType instanceof TClass) {
								TClass tType = (TClass) tmpTType;
								return new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_blackBBBBBBFBB(MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType, TypesOrphaned _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			TypesOrphaned _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_TypesOrphaned_11_1_performtransformation_binding = pattern_TypesOrphaned_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_TypesOrphaned_11_1_performtransformation_binding != null) {
			MClass mType = (MClass) result_pattern_TypesOrphaned_11_1_performtransformation_binding[0];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_TypesOrphaned_11_1_performtransformation_binding[1];
			Model mModel = (Model) result_pattern_TypesOrphaned_11_1_performtransformation_binding[2];
			TypeGraph pg = (TypeGraph) result_pattern_TypesOrphaned_11_1_performtransformation_binding[3];
			TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result_pattern_TypesOrphaned_11_1_performtransformation_binding[4];
			TClass tType = (TClass) result_pattern_TypesOrphaned_11_1_performtransformation_binding[5];

			Object[] result_pattern_TypesOrphaned_11_1_performtransformation_black = pattern_TypesOrphaned_11_1_performtransformation_blackBBBBBBFBB(
					mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, _this, isApplicableMatch);
			if (result_pattern_TypesOrphaned_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_TypesOrphaned_11_1_performtransformation_black[6];

				return new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_11_1_performtransformation_greenBB(MClass mType, Model mModel) {
		mModel.getOrphanTypes().add(mType);
		return new Object[] { mType, mModel };
	}

	public static final Object[] pattern_TypesOrphaned_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_TypesOrphaned_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mType, EObject mModelToTypeGraph, EObject mModel, EObject pg,
			EObject mTypeToTType, EObject tType) {
		if (!mType.equals(pg)) {
			if (!mType.equals(mTypeToTType)) {
				if (!mType.equals(tType)) {
					if (!mModelToTypeGraph.equals(mType)) {
						if (!mModelToTypeGraph.equals(pg)) {
							if (!mModelToTypeGraph.equals(mTypeToTType)) {
								if (!mModelToTypeGraph.equals(tType)) {
									if (!mModel.equals(mType)) {
										if (!mModel.equals(mModelToTypeGraph)) {
											if (!mModel.equals(pg)) {
												if (!mModel.equals(mTypeToTType)) {
													if (!mModel.equals(tType)) {
														if (!pg.equals(tType)) {
															if (!mTypeToTType.equals(pg)) {
																if (!mTypeToTType.equals(tType)) {
																	return new Object[] { ruleresult, mType,
																			mModelToTypeGraph, mModel, pg, mTypeToTType,
																			tType };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_TypesOrphaned_11_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject mType, EObject mModel, EObject pg, EObject tType) {
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "TypesOrphaned";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tType__pg____model);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		ruleresult.getCreatedEdges().add(mModel__mType____orphanTypes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		return new Object[] { ruleresult, mType, mModel, pg, tType, pg__tType____ownedTypes, tType__pg____model,
				mModel__mType____orphanTypes };
	}

	public static final void pattern_TypesOrphaned_11_5_registerobjects_expressionBBBBBBBB(TypesOrphaned _this,
			PerformRuleResult ruleresult, EObject mType, EObject mModelToTypeGraph, EObject mModel, EObject pg,
			EObject mTypeToTType, EObject tType) {
		_this.registerObjects_BWD(ruleresult, mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType);

	}

	public static final PerformRuleResult pattern_TypesOrphaned_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_12_1_preparereturnvalue_bindingFB(TypesOrphaned _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_12_1_preparereturnvalue_blackFBB(EClass eClass,
			TypesOrphaned _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_12_1_preparereturnvalue_bindingAndBlackFFB(TypesOrphaned _this) {
		Object[] result_pattern_TypesOrphaned_12_1_preparereturnvalue_binding = pattern_TypesOrphaned_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesOrphaned_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_TypesOrphaned_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesOrphaned_12_1_preparereturnvalue_black = pattern_TypesOrphaned_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_TypesOrphaned_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_TypesOrphaned_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "TypesOrphaned";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_TypesOrphaned_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("pg");
		EObject _localVariable_1 = match.getObject("tType");
		EObject tmpPg = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				return new Object[] { pg, tType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_12_2_corematch_blackFFFBFBB(TypeGraph pg, TClass tType,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(pg,
				ModelToTypeGraph.class, "target")) {
			Model mModel = mModelToTypeGraph.getSource();
			if (mModel != null) {
				for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(tType, TypeToTAbstractType.class, "target")) {
					Type tmpMType = mTypeToTType.getSource();
					if (tmpMType instanceof MClass) {
						MClass mType = (MClass) tmpMType;
						_result.add(new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_12_3_findcontext_blackBBBBBB(MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModel.equals(mModelToTypeGraph.getSource())) {
			if (pg.getOwnedTypes().contains(tType)) {
				if (pg.equals(mModelToTypeGraph.getTarget())) {
					if (mType.equals(mTypeToTType.getSource())) {
						if (tType.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_12_3_findcontext_greenBBBBBBFFFFFFF(MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tType____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		String pg__tType____ownedTypes_name_prime = "ownedTypes";
		String tType__pg____model_name_prime = "model";
		String mModelToTypeGraph__pg____target_name_prime = "target";
		String mTypeToTType__mType____source_name_prime = "source";
		String mTypeToTType__tType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mTypeToTType);
		isApplicableMatch.getAllContextElements().add(tType);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		pg__tType____ownedTypes.setSrc(pg);
		pg__tType____ownedTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____ownedTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____model);
		mModelToTypeGraph__pg____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__pg____target);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__mType____source);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(mTypeToTType__tType____target);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		pg__tType____ownedTypes.setName(pg__tType____ownedTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		mModelToTypeGraph__pg____target.setName(mModelToTypeGraph__pg____target_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		return new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, isApplicableMatch,
				mModelToTypeGraph__mModel____source, pg__tType____ownedTypes, tType__pg____model,
				mModelToTypeGraph__pg____target, mTypeToTType__mType____source, mTypeToTType__tType____target };
	}

	public static final Object[] pattern_TypesOrphaned_12_4_solveCSP_bindingFBBBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, MClass mType, ModelToTypeGraph mModelToTypeGraph, Model mModel,
			TypeGraph pg, TypeToTAbstractType mTypeToTType, TClass tType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mType, mModelToTypeGraph, mModel, pg,
				mTypeToTType, tType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mType, mModelToTypeGraph, mModel, pg, mTypeToTType,
					tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_12_4_solveCSP_bindingAndBlackFBBBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, MClass mType, ModelToTypeGraph mModelToTypeGraph, Model mModel,
			TypeGraph pg, TypeToTAbstractType mTypeToTType, TClass tType) {
		Object[] result_pattern_TypesOrphaned_12_4_solveCSP_binding = pattern_TypesOrphaned_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType);
		if (result_pattern_TypesOrphaned_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_12_4_solveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_12_4_solveCSP_black = pattern_TypesOrphaned_12_4_solveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mType, mModelToTypeGraph, mModel, pg, mTypeToTType,
						tType };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_12_5_checkCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_TypesOrphaned_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "TypesOrphaned";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_TypesOrphaned_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_20_1_preparereturnvalue_bindingFB(TypesOrphaned _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypesOrphaned _this) {
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

	public static final Object[] pattern_TypesOrphaned_20_1_preparereturnvalue_bindingAndBlackFFBF(
			TypesOrphaned _this) {
		Object[] result_pattern_TypesOrphaned_20_1_preparereturnvalue_binding = pattern_TypesOrphaned_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesOrphaned_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypesOrphaned_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesOrphaned_20_1_preparereturnvalue_black = pattern_TypesOrphaned_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypesOrphaned_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypesOrphaned_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypesOrphaned_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_ownedTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_ownedTypes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTType = _edge_ownedTypes.getTrg();
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (pg.getOwnedTypes().contains(tType)) {
					_result.add(new Object[] { pg, tType, _edge_ownedTypes });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypesOrphaned_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypesOrphaned _this, Match match, TypeGraph pg, TClass tType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, pg, tType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypesOrphaned _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypesOrphaned_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_21_1_preparereturnvalue_bindingFB(TypesOrphaned _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			TypesOrphaned _this) {
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

	public static final Object[] pattern_TypesOrphaned_21_1_preparereturnvalue_bindingAndBlackFFBF(
			TypesOrphaned _this) {
		Object[] result_pattern_TypesOrphaned_21_1_preparereturnvalue_binding = pattern_TypesOrphaned_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_TypesOrphaned_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_TypesOrphaned_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_TypesOrphaned_21_1_preparereturnvalue_black = pattern_TypesOrphaned_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_TypesOrphaned_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_TypesOrphaned_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_TypesOrphaned_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMModel = _edge_orphanTypes.getSrc();
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			EObject tmpMType = _edge_orphanTypes.getTrg();
			if (tmpMType instanceof MClass) {
				MClass mType = (MClass) tmpMType;
				if (mModel.getOrphanTypes().contains(mType)) {
					_result.add(new Object[] { mType, mModel, _edge_orphanTypes });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_TypesOrphaned_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			TypesOrphaned _this, Match match, MClass mType, Model mModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mType, mModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			TypesOrphaned _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_TypesOrphaned_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_24_1_prepare_blackB(TypesOrphaned _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypesOrphaned_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mType");
		EObject _localVariable_1 = sourceMatch.getObject("mModel");
		EObject _localVariable_2 = targetMatch.getObject("pg");
		EObject _localVariable_3 = targetMatch.getObject("tType");
		EObject tmpMType = _localVariable_0;
		EObject tmpMModel = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpTType = _localVariable_3;
		if (tmpMType instanceof MClass) {
			MClass mType = (MClass) tmpMType;
			if (tmpMModel instanceof Model) {
				Model mModel = (Model) tmpMModel;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpTType instanceof TClass) {
						TClass tType = (TClass) tmpTType;
						return new Object[] { mType, mModel, pg, tType, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_2_matchsrctrgcontext_blackBBBBBB(MClass mType, Model mModel,
			TypeGraph pg, TClass tType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mType, mModel, pg, tType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding = pattern_TypesOrphaned_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding != null) {
			MClass mType = (MClass) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[0];
			Model mModel = (Model) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[2];
			TClass tType = (TClass) result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_black = pattern_TypesOrphaned_24_2_matchsrctrgcontext_blackBBBBBB(
					mType, mModel, pg, tType, sourceMatch, targetMatch);
			if (result_pattern_TypesOrphaned_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mType, mModel, pg, tType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_3_solvecsp_bindingFBBBBBBB(TypesOrphaned _this, MClass mType,
			Model mModel, TypeGraph pg, TClass tType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mType, mModel, pg, tType, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mType, mModel, pg, tType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_24_3_solvecsp_bindingAndBlackFBBBBBBB(TypesOrphaned _this,
			MClass mType, Model mModel, TypeGraph pg, TClass tType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_TypesOrphaned_24_3_solvecsp_binding = pattern_TypesOrphaned_24_3_solvecsp_bindingFBBBBBBB(
				_this, mType, mModel, pg, tType, sourceMatch, targetMatch);
		if (result_pattern_TypesOrphaned_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_24_3_solvecsp_binding[0];

			Object[] result_pattern_TypesOrphaned_24_3_solvecsp_black = pattern_TypesOrphaned_24_3_solvecsp_blackB(csp);
			if (result_pattern_TypesOrphaned_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mType, mModel, pg, tType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_24_5_matchcorrcontext_blackBFBBFBBB(MClass mType,
			Model mModel, TypeGraph pg, TClass tType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
				if (pg.equals(mModelToTypeGraph.getTarget())) {
					for (TypeToTAbstractType mTypeToTType : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mType, TypeToTAbstractType.class, "source")) {
						if (tType.equals(mTypeToTType.getTarget())) {
							_result.add(new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType,
									sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_24_5_matchcorrcontext_greenBBBBF(
			ModelToTypeGraph mModelToTypeGraph, TypeToTAbstractType mTypeToTType, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "TypesOrphaned";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mModelToTypeGraph);
		ccMatch.getAllContextElements().add(mTypeToTType);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mModelToTypeGraph, mTypeToTType, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_TypesOrphaned_24_6_createcorrespondence_blackBBBBB(MClass mType, Model mModel,
			TypeGraph pg, TClass tType, CCMatch ccMatch) {
		return new Object[] { mType, mModel, pg, tType, ccMatch };
	}

	public static final Object[] pattern_TypesOrphaned_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_TypesOrphaned_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "TypesOrphaned";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_TypesOrphaned_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_27_1_matchtggpattern_blackBB(MClass mType, Model mModel) {
		if (mModel.getOrphanTypes().contains(mType)) {
			return new Object[] { mType, mModel };
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_28_1_matchtggpattern_blackBB(TypeGraph pg, TClass tType) {
		if (pg.getOwnedTypes().contains(tType)) {
			return new Object[] { pg, tType };
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_TypesOrphaned_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_29_1_createresult_blackB(TypesOrphaned _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_TypesOrphaned_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MClass mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType mTypeToTType) {
		if (ruleResult.getCorrObjects().contains(mTypeToTType)) {
			return new Object[] { ruleResult, mTypeToTType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TClass tType) {
		if (ruleResult.getTargetObjects().contains(tType)) {
			return new Object[] { ruleResult, tType };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph mModelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(mModelToTypeGraph)) {
			return new Object[] { ruleResult, mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, Model mModel) {
		if (ruleResult.getSourceObjects().contains(mModel)) {
			return new Object[] { ruleResult, mModel };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_TypesOrphaned_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mTypeToTTypeList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList mModelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
				if (!mModelToTypeGraphList.equals(mTypeToTTypeList)) {
					for (EObject tmpMTypeToTType : mTypeToTTypeList.getEntryObjects()) {
						if (tmpMTypeToTType instanceof TypeToTAbstractType) {
							TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) tmpMTypeToTType;
							Type tmpMType = mTypeToTType.getSource();
							if (tmpMType instanceof MClass) {
								MClass mType = (MClass) tmpMType;
								TAbstractType tmpTType = mTypeToTType.getTarget();
								if (tmpTType instanceof TClass) {
									TClass tType = (TClass) tmpTType;
									if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											mTypeToTType) == null) {
										if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mType) == null) {
											if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_2BB(ruleResult,
													tType) == null) {
												for (EObject tmpMModelToTypeGraph : mModelToTypeGraphList
														.getEntryObjects()) {
													if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
														ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
														Model mModel = mModelToTypeGraph.getSource();
														if (mModel != null) {
															TypeGraph pg = mModelToTypeGraph.getTarget();
															if (pg != null) {
																if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult, mModelToTypeGraph) == null) {
																	if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, mModel) == null) {
																		if (pattern_TypesOrphaned_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, pg) == null) {
																			_result.add(new Object[] { mTypeToTTypeList,
																					mType, mTypeToTType, tType,
																					mModelToTypeGraphList,
																					mModelToTypeGraph, mModel, pg,
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
		}
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_29_3_solveCSP_bindingFBBBBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, MClass mType, ModelToTypeGraph mModelToTypeGraph, Model mModel,
			TypeGraph pg, TypeToTAbstractType mTypeToTType, TClass tType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mType, mModelToTypeGraph, mModel, pg,
				mTypeToTType, tType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mType, mModelToTypeGraph, mModel, pg, mTypeToTType,
					tType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_TypesOrphaned_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_TypesOrphaned_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(TypesOrphaned _this,
			IsApplicableMatch isApplicableMatch, MClass mType, ModelToTypeGraph mModelToTypeGraph, Model mModel,
			TypeGraph pg, TypeToTAbstractType mTypeToTType, TClass tType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_TypesOrphaned_29_3_solveCSP_binding = pattern_TypesOrphaned_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, ruleResult);
		if (result_pattern_TypesOrphaned_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_TypesOrphaned_29_3_solveCSP_binding[0];

			Object[] result_pattern_TypesOrphaned_29_3_solveCSP_black = pattern_TypesOrphaned_29_3_solveCSP_blackB(csp);
			if (result_pattern_TypesOrphaned_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mType, mModelToTypeGraph, mModel, pg, mTypeToTType,
						tType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_TypesOrphaned_29_4_checkCSP_expressionFBB(TypesOrphaned _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_TypesOrphaned_29_5_checknacs_blackBBBBBB(MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType) {
		return new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType };
	}

	public static final Object[] pattern_TypesOrphaned_29_6_perform_blackBBBBBBB(MClass mType,
			ModelToTypeGraph mModelToTypeGraph, Model mModel, TypeGraph pg, TypeToTAbstractType mTypeToTType,
			TClass tType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mType, mModelToTypeGraph, mModel, pg, mTypeToTType, tType, ruleResult };
	}

	public static final Object[] pattern_TypesOrphaned_29_6_perform_greenBBBBB(MClass mType, Model mModel, TypeGraph pg,
			TClass tType, ModelgeneratorRuleResult ruleResult) {
		pg.getOwnedTypes().add(tType);
		mModel.getOrphanTypes().add(mType);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mType, mModel, pg, tType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_TypesOrphaned_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //TypesOrphanedImpl
