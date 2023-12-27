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

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.ASTNodeToTAnnotatable;
import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.OrphanedClass;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TModule;
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
 * An implementation of the model object '<em><b>Orphaned Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OrphanedClassImpl extends AbstractRuleImpl implements OrphanedClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrphanedClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getOrphanedClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Model mModel, MClass mType) {

		Object[] result1_black = OrphanedClassImpl.pattern_OrphanedClass_0_1_initialbindings_blackBBBB(this, match,
				mModel, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = OrphanedClassImpl
				.pattern_OrphanedClass_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mModel, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OrphanedClassImpl.pattern_OrphanedClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OrphanedClassImpl
					.pattern_OrphanedClass_0_4_collectelementstobetranslated_blackBBB(match, mModel, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
			}
			OrphanedClassImpl.pattern_OrphanedClass_0_4_collectelementstobetranslated_greenBBBF(match, mModel, mType);
			//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = OrphanedClassImpl.pattern_OrphanedClass_0_5_collectcontextelements_blackBBB(match,
					mModel, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mModel] = " + mModel + ", " + "[mType] = " + mType + ".");
			}
			OrphanedClassImpl.pattern_OrphanedClass_0_5_collectcontextelements_greenBB(match, mModel);

			// 
			OrphanedClassImpl.pattern_OrphanedClass_0_6_registerobjectstomatch_expressionBBBB(this, match, mModel,
					mType);
			return OrphanedClassImpl.pattern_OrphanedClass_0_7_expressionF();
		} else {
			return OrphanedClassImpl.pattern_OrphanedClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OrphanedClassImpl
				.pattern_OrphanedClass_1_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TModule tModule = (TModule) result1_bindingAndBlack[0];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[1];
		Model mModel = (Model) result1_bindingAndBlack[2];
		MClass mType = (MClass) result1_bindingAndBlack[3];
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = OrphanedClassImpl.pattern_OrphanedClass_1_1_performtransformation_greenBFFFBBB(tModule,
				pg, mType, csp);
		TClass tType = (TClass) result1_green[1];
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = (ASTNodeToTAnnotatable) result1_green[2];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[3];

		Object[] result2_black = OrphanedClassImpl.pattern_OrphanedClass_1_2_collecttranslatedelements_blackBBBB(tType,
				mAnnotatableToTAnnotatable, mTypeToTType, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
					+ "[mAnnotatableToTAnnotatable] = " + mAnnotatableToTAnnotatable + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ", " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = OrphanedClassImpl.pattern_OrphanedClass_1_2_collecttranslatedelements_greenFBBBB(tType,
				mAnnotatableToTAnnotatable, mTypeToTType, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OrphanedClassImpl.pattern_OrphanedClass_1_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, tModule, tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel, mType,
				mModelToTypeGraph);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tModule] = " + tModule + ", " + "[tType] = " + tType + ", "
					+ "[mAnnotatableToTAnnotatable] = " + mAnnotatableToTAnnotatable + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ", " + "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", " + "[mType] = " + mType
					+ ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ".");
		}
		OrphanedClassImpl.pattern_OrphanedClass_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(ruleresult, tModule,
				tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel, mType);
		//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tModule__tType____contains = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tType__tModule____module = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mAnnotatableToTAnnotatable__tType____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mAnnotatableToTAnnotatable__mType____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		OrphanedClassImpl.pattern_OrphanedClass_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult, tModule,
				tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel, mType, mModelToTypeGraph);
		return OrphanedClassImpl.pattern_OrphanedClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = OrphanedClassImpl
				.pattern_OrphanedClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OrphanedClassImpl
				.pattern_OrphanedClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OrphanedClassImpl.pattern_OrphanedClass_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model mModel = (Model) result2_binding[0];
		MClass mType = (MClass) result2_binding[1];
		for (Object[] result2_black : OrphanedClassImpl.pattern_OrphanedClass_2_2_corematch_blackFBBFB(mModel, mType,
				match)) {
			TypeGraph pg = (TypeGraph) result2_black[0];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : OrphanedClassImpl.pattern_OrphanedClass_2_3_findcontext_blackFBBBB(pg, mModel,
					mType, mModelToTypeGraph)) {
				TModule tModule = (TModule) result3_black[0];
				Object[] result3_green = OrphanedClassImpl.pattern_OrphanedClass_2_3_findcontext_greenBBBBBFFFFF(
						tModule, pg, mModel, mType, mModelToTypeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge pg__tModule____modules = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mModelToTypeGraph__pg____target = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = OrphanedClassImpl
						.pattern_OrphanedClass_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, tModule,
								pg, mModel, mType, mModelToTypeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tModule] = " + tModule + ", "
							+ "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", " + "[mType] = " + mType + ", "
							+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OrphanedClassImpl.pattern_OrphanedClass_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OrphanedClassImpl
							.pattern_OrphanedClass_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OrphanedClassImpl.pattern_OrphanedClass_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return OrphanedClassImpl.pattern_OrphanedClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Model mModel, MClass mType) {
		match.registerObject("mModel", mModel);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model mModel, MClass mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TModule tModule, TypeGraph pg,
			Model mModel, MClass mType, ModelToTypeGraph mModelToTypeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");

		// Create unbound variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", csp);
		var_tType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tModule", tModule);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject tModule, EObject tType,
			EObject mAnnotatableToTAnnotatable, EObject mTypeToTType, EObject pg, EObject mModel, EObject mType,
			EObject mModelToTypeGraph) {
		ruleresult.registerObject("tModule", tModule);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mAnnotatableToTAnnotatable", mAnnotatableToTAnnotatable);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mType").eClass()).equals("modisco.MClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TModule tModule, TClass tType, TypeGraph pg) {

		Object[] result1_black = OrphanedClassImpl.pattern_OrphanedClass_10_1_initialbindings_blackBBBBB(this, match,
				tModule, tType, pg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tModule] = " + tModule + ", " + "[tType] = " + tType + ", "
					+ "[pg] = " + pg + ".");
		}

		Object[] result2_bindingAndBlack = OrphanedClassImpl
				.pattern_OrphanedClass_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, tModule, tType, pg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tModule] = " + tModule + ", " + "[tType] = " + tType + ", "
					+ "[pg] = " + pg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OrphanedClassImpl.pattern_OrphanedClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = OrphanedClassImpl
					.pattern_OrphanedClass_10_4_collectelementstobetranslated_blackBBBB(match, tModule, tType, pg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tModule] = " + tModule + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg + ".");
			}
			OrphanedClassImpl.pattern_OrphanedClass_10_4_collectelementstobetranslated_greenBBBBFFFF(match, tModule,
					tType, pg);
			//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge tModule__tType____contains = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge tType__tModule____module = (EMoflonEdge) result4_green[7];

			Object[] result5_black = OrphanedClassImpl
					.pattern_OrphanedClass_10_5_collectcontextelements_blackBBBB(match, tModule, tType, pg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tModule] = " + tModule + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg + ".");
			}
			OrphanedClassImpl.pattern_OrphanedClass_10_5_collectcontextelements_greenBBBF(match, tModule, pg);
			//nothing EMoflonEdge pg__tModule____modules = (EMoflonEdge) result5_green[3];

			// 
			OrphanedClassImpl.pattern_OrphanedClass_10_6_registerobjectstomatch_expressionBBBBB(this, match, tModule,
					tType, pg);
			return OrphanedClassImpl.pattern_OrphanedClass_10_7_expressionF();
		} else {
			return OrphanedClassImpl.pattern_OrphanedClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OrphanedClassImpl
				.pattern_OrphanedClass_11_1_performtransformation_bindingAndBlackFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TModule tModule = (TModule) result1_bindingAndBlack[0];
		TClass tType = (TClass) result1_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result1_bindingAndBlack[2];
		Model mModel = (Model) result1_bindingAndBlack[3];
		ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = OrphanedClassImpl.pattern_OrphanedClass_11_1_performtransformation_greenBFFBFB(tType,
				mModel, csp);
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = (ASTNodeToTAnnotatable) result1_green[1];
		TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result1_green[2];
		MClass mType = (MClass) result1_green[4];

		Object[] result2_black = OrphanedClassImpl.pattern_OrphanedClass_11_2_collecttranslatedelements_blackBBBB(tType,
				mAnnotatableToTAnnotatable, mTypeToTType, mType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tType] = " + tType + ", "
					+ "[mAnnotatableToTAnnotatable] = " + mAnnotatableToTAnnotatable + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ", " + "[mType] = " + mType + ".");
		}
		Object[] result2_green = OrphanedClassImpl.pattern_OrphanedClass_11_2_collecttranslatedelements_greenFBBBB(
				tType, mAnnotatableToTAnnotatable, mTypeToTType, mType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OrphanedClassImpl.pattern_OrphanedClass_11_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, tModule, tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel, mType,
				mModelToTypeGraph);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[tModule] = " + tModule + ", " + "[tType] = " + tType + ", "
					+ "[mAnnotatableToTAnnotatable] = " + mAnnotatableToTAnnotatable + ", " + "[mTypeToTType] = "
					+ mTypeToTType + ", " + "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", " + "[mType] = " + mType
					+ ", " + "[mModelToTypeGraph] = " + mModelToTypeGraph + ".");
		}
		OrphanedClassImpl.pattern_OrphanedClass_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(ruleresult, tModule,
				tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel, mType);
		//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mModel__mType____orphanTypes = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge tModule__tType____contains = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge tType__tModule____module = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge mAnnotatableToTAnnotatable__tType____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge mTypeToTType__tType____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge mAnnotatableToTAnnotatable__mType____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge mTypeToTType__mType____source = (EMoflonEdge) result3_green[16];

		// 
		// 
		OrphanedClassImpl.pattern_OrphanedClass_11_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult, tModule,
				tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel, mType, mModelToTypeGraph);
		return OrphanedClassImpl.pattern_OrphanedClass_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = OrphanedClassImpl
				.pattern_OrphanedClass_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OrphanedClassImpl
				.pattern_OrphanedClass_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OrphanedClassImpl.pattern_OrphanedClass_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TModule tModule = (TModule) result2_binding[0];
		TClass tType = (TClass) result2_binding[1];
		TypeGraph pg = (TypeGraph) result2_binding[2];
		for (Object[] result2_black : OrphanedClassImpl.pattern_OrphanedClass_12_2_corematch_blackBBBFFB(tModule, tType,
				pg, match)) {
			Model mModel = (Model) result2_black[3];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[4];
			// ForEach 
			for (Object[] result3_black : OrphanedClassImpl.pattern_OrphanedClass_12_3_findcontext_blackBBBBB(tModule,
					tType, pg, mModel, mModelToTypeGraph)) {
				Object[] result3_green = OrphanedClassImpl.pattern_OrphanedClass_12_3_findcontext_greenBBBBBFFFFFFFF(
						tModule, tType, pg, mModel, mModelToTypeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge pg__tType____allTypes = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge tType__pg____model = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mModelToTypeGraph__mModel____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge tModule__tType____contains = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tType__tModule____module = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge pg__tModule____modules = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mModelToTypeGraph__pg____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = OrphanedClassImpl
						.pattern_OrphanedClass_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, tModule,
								tType, pg, mModel, mModelToTypeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tModule] = " + tModule + ", "
							+ "[tType] = " + tType + ", " + "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", "
							+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OrphanedClassImpl.pattern_OrphanedClass_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OrphanedClassImpl
							.pattern_OrphanedClass_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OrphanedClassImpl.pattern_OrphanedClass_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return OrphanedClassImpl.pattern_OrphanedClass_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TModule tModule, TClass tType, TypeGraph pg) {
		match.registerObject("tModule", tModule);
		match.registerObject("tType", tType);
		match.registerObject("pg", pg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TModule tModule, TClass tType, TypeGraph pg) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TModule tModule, TClass tType,
			TypeGraph pg, Model mModel, ModelToTypeGraph mModelToTypeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tModule", tModule);
		isApplicableMatch.registerObject("tType", tType);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject tModule, EObject tType,
			EObject mAnnotatableToTAnnotatable, EObject mTypeToTType, EObject pg, EObject mModel, EObject mType,
			EObject mModelToTypeGraph) {
		ruleresult.registerObject("tModule", tModule);
		ruleresult.registerObject("tType", tType);
		ruleresult.registerObject("mAnnotatableToTAnnotatable", mAnnotatableToTAnnotatable);
		ruleresult.registerObject("mTypeToTType", mTypeToTType);
		ruleresult.registerObject("pg", pg);
		ruleresult.registerObject("mModel", mModel);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("mModelToTypeGraph", mModelToTypeGraph);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tType").eClass()).equals("basic.TClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_30(EMoflonEdge _edge_allTypes) {

		Object[] result1_bindingAndBlack = OrphanedClassImpl
				.pattern_OrphanedClass_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OrphanedClassImpl.pattern_OrphanedClass_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OrphanedClassImpl
				.pattern_OrphanedClass_20_2_testcorematchandDECs_blackFFFB(_edge_allTypes)) {
			TModule tModule = (TModule) result2_black[0];
			TClass tType = (TClass) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			Object[] result2_green = OrphanedClassImpl
					.pattern_OrphanedClass_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OrphanedClassImpl.pattern_OrphanedClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
					this, match, tModule, tType, pg)) {
				// 
				if (OrphanedClassImpl
						.pattern_OrphanedClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = OrphanedClassImpl
							.pattern_OrphanedClass_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OrphanedClassImpl.pattern_OrphanedClass_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OrphanedClassImpl.pattern_OrphanedClass_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_33(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = OrphanedClassImpl
				.pattern_OrphanedClass_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OrphanedClassImpl.pattern_OrphanedClass_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OrphanedClassImpl
				.pattern_OrphanedClass_21_2_testcorematchandDECs_blackFFB(_edge_orphanTypes)) {
			Model mModel = (Model) result2_black[0];
			MClass mType = (MClass) result2_black[1];
			Object[] result2_green = OrphanedClassImpl
					.pattern_OrphanedClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OrphanedClassImpl.pattern_OrphanedClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, mModel, mType)) {
				// 
				if (OrphanedClassImpl
						.pattern_OrphanedClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = OrphanedClassImpl
							.pattern_OrphanedClass_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OrphanedClassImpl.pattern_OrphanedClass_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OrphanedClassImpl.pattern_OrphanedClass_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("OrphanedClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tModule", "location", "${PROXIES}", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("OrphanedClass");
		eq0.solve(var_mType_name, var_tType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tType_tName.setBound(false);
			eq0.solve(var_mType_name, var_tType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tType", "tName", var_tType_tName.getValue());
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
		ruleResult.setRule("OrphanedClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("tModule", "location", "${PROXIES}", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType", true, csp);
		var_tType_tName.setValue(__helper.getValue("tType", "tName"));
		var_tType_tName.setType("String");

		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType", true, csp);
		var_mType_name.setValue(__helper.getValue("mType", "name"));
		var_mType_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("OrphanedClass");
		eq0.solve(var_mType_name, var_tType_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mType_name.setBound(false);
			eq0.solve(var_mType_name, var_tType_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mType", "name", var_mType_name.getValue());
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

		Object[] result1_black = OrphanedClassImpl.pattern_OrphanedClass_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OrphanedClassImpl.pattern_OrphanedClass_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = OrphanedClassImpl
				.pattern_OrphanedClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TModule tModule = (TModule) result2_bindingAndBlack[0];
		TClass tType = (TClass) result2_bindingAndBlack[1];
		TypeGraph pg = (TypeGraph) result2_bindingAndBlack[2];
		Model mModel = (Model) result2_bindingAndBlack[3];
		MClass mType = (MClass) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = OrphanedClassImpl
				.pattern_OrphanedClass_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, tModule, tType, pg, mModel, mType,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[tModule] = " + tModule + ", " + "[tType] = " + tType + ", " + "[pg] = " + pg + ", "
					+ "[mModel] = " + mModel + ", " + "[mType] = " + mType + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (OrphanedClassImpl.pattern_OrphanedClass_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : OrphanedClassImpl.pattern_OrphanedClass_24_5_matchcorrcontext_blackBBFBB(pg,
					mModel, sourceMatch, targetMatch)) {
				ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result5_black[2];
				Object[] result5_green = OrphanedClassImpl.pattern_OrphanedClass_24_5_matchcorrcontext_greenBBBF(
						mModelToTypeGraph, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = OrphanedClassImpl.pattern_OrphanedClass_24_6_createcorrespondence_blackBBBBBB(
						tModule, tType, pg, mModel, mType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tModule] = " + tModule
							+ ", " + "[tType] = " + tType + ", " + "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", "
							+ "[mType] = " + mType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				OrphanedClassImpl.pattern_OrphanedClass_24_6_createcorrespondence_greenBFFBB(tType, mType, ccMatch);
				//nothing ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = (ASTNodeToTAnnotatable) result6_green[1];
				//nothing TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[2];

				Object[] result7_black = OrphanedClassImpl
						.pattern_OrphanedClass_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				OrphanedClassImpl.pattern_OrphanedClass_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return OrphanedClassImpl.pattern_OrphanedClass_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TModule tModule, TClass tType, TypeGraph pg, Model mModel, MClass mType,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", true, csp);
		var_mType_name.setValue(mType.getName());
		var_mType_name.setType("String");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", true, csp);
		var_tType_tName.setValue(tType.getTName());
		var_tType_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);
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
	public boolean checkDEC_FWD(Model mModel, MClass mType) {// 
		Object[] result1_black = OrphanedClassImpl.pattern_OrphanedClass_27_1_matchtggpattern_blackBB(mModel, mType);
		if (result1_black != null) {
			return OrphanedClassImpl.pattern_OrphanedClass_27_2_expressionF();
		} else {
			return OrphanedClassImpl.pattern_OrphanedClass_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TModule tModule, TClass tType, TypeGraph pg) {// 
		Object[] result1_black = OrphanedClassImpl.pattern_OrphanedClass_28_1_matchtggpattern_blackBBB(tModule, tType,
				pg);
		if (result1_black != null) {
			return OrphanedClassImpl.pattern_OrphanedClass_28_2_expressionF();
		} else {
			return OrphanedClassImpl.pattern_OrphanedClass_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph mModelToTypeGraphParameter) {

		Object[] result1_black = OrphanedClassImpl.pattern_OrphanedClass_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OrphanedClassImpl.pattern_OrphanedClass_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : OrphanedClassImpl
				.pattern_OrphanedClass_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList mModelToTypeGraphList = (RuleEntryList) result2_black[0];
			TModule tModule = (TModule) result2_black[1];
			TypeGraph pg = (TypeGraph) result2_black[2];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			Model mModel = (Model) result2_black[4];

			Object[] result3_bindingAndBlack = OrphanedClassImpl
					.pattern_OrphanedClass_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch, tModule, pg,
							mModel, mModelToTypeGraph, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[tModule] = " + tModule + ", "
						+ "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", " + "[mModelToTypeGraph] = "
						+ mModelToTypeGraph + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (OrphanedClassImpl.pattern_OrphanedClass_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = OrphanedClassImpl.pattern_OrphanedClass_29_5_checknacs_blackBBBB(tModule, pg,
						mModel, mModelToTypeGraph);
				if (result5_black != null) {

					Object[] result6_black = OrphanedClassImpl.pattern_OrphanedClass_29_6_perform_blackBBBBB(tModule,
							pg, mModel, mModelToTypeGraph, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[tModule] = "
								+ tModule + ", " + "[pg] = " + pg + ", " + "[mModel] = " + mModel + ", "
								+ "[mModelToTypeGraph] = " + mModelToTypeGraph + ", " + "[ruleResult] = " + ruleResult
								+ ".");
					}
					OrphanedClassImpl.pattern_OrphanedClass_29_6_perform_greenBFFFBBFBB(tModule, pg, mModel, ruleResult,
							csp);
					//nothing TClass tType = (TClass) result6_green[1];
					//nothing ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = (ASTNodeToTAnnotatable) result6_green[2];
					//nothing TypeToTAbstractType mTypeToTType = (TypeToTAbstractType) result6_green[3];
					//nothing MClass mType = (MClass) result6_green[6];

				} else {
				}

			} else {
			}

		}
		return OrphanedClassImpl.pattern_OrphanedClass_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TModule tModule, TypeGraph pg,
			Model mModel, ModelToTypeGraph mModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mType_name = CSPFactoryHelper.eINSTANCE.createVariable("mType.name", csp);
		var_mType_name.setType("String");
		Variable var_tType_tName = CSPFactoryHelper.eINSTANCE.createVariable("tType.tName", csp);
		var_tType_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mType_name, var_tType_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("tModule", tModule);
		isApplicableMatch.registerObject("pg", pg);
		isApplicableMatch.registerObject("mModel", mModel);
		isApplicableMatch.registerObject("mModelToTypeGraph", mModelToTypeGraph);
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
		case RulesPackage.ORPHANED_CLASS___IS_APPROPRIATE_FWD__MATCH_MODEL_MCLASS:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1), (MClass) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_MCLASS:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1), (MClass) arguments.get(2));
			return null;
		case RulesPackage.ORPHANED_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_MCLASS:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(MClass) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TMODULE_TYPEGRAPH_MODEL_MCLASS_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TModule) arguments.get(1),
					(TypeGraph) arguments.get(2), (Model) arguments.get(3), (MClass) arguments.get(4),
					(ModelToTypeGraph) arguments.get(5));
		case RulesPackage.ORPHANED_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ORPHANED_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___IS_APPROPRIATE_BWD__MATCH_TMODULE_TCLASS_TYPEGRAPH:
			return isAppropriate_BWD((Match) arguments.get(0), (TModule) arguments.get(1), (TClass) arguments.get(2),
					(TypeGraph) arguments.get(3));
		case RulesPackage.ORPHANED_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TMODULE_TCLASS_TYPEGRAPH:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TModule) arguments.get(1), (TClass) arguments.get(2),
					(TypeGraph) arguments.get(3));
			return null;
		case RulesPackage.ORPHANED_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TMODULE_TCLASS_TYPEGRAPH:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TModule) arguments.get(1),
					(TClass) arguments.get(2), (TypeGraph) arguments.get(3));
		case RulesPackage.ORPHANED_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMODULE_TCLASS_TYPEGRAPH_MODEL_MODELTOTYPEGRAPH:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TModule) arguments.get(1),
					(TClass) arguments.get(2), (TypeGraph) arguments.get(3), (Model) arguments.get(4),
					(ModelToTypeGraph) arguments.get(5));
		case RulesPackage.ORPHANED_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ORPHANED_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_30__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_30((EMoflonEdge) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_33__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_33((EMoflonEdge) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ORPHANED_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__TMODULE_TCLASS_TYPEGRAPH_MODEL_MCLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TModule) arguments.get(0), (TClass) arguments.get(1),
					(TypeGraph) arguments.get(2), (Model) arguments.get(3), (MClass) arguments.get(4),
					(Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.ORPHANED_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS___CHECK_DEC_FWD__MODEL_MCLASS:
			return checkDEC_FWD((Model) arguments.get(0), (MClass) arguments.get(1));
		case RulesPackage.ORPHANED_CLASS___CHECK_DEC_BWD__TMODULE_TCLASS_TYPEGRAPH:
			return checkDEC_BWD((TModule) arguments.get(0), (TClass) arguments.get(1), (TypeGraph) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
			return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
		case RulesPackage.ORPHANED_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TMODULE_TYPEGRAPH_MODEL_MODELTOTYPEGRAPH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (TModule) arguments.get(1),
					(TypeGraph) arguments.get(2), (Model) arguments.get(3), (ModelToTypeGraph) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.ORPHANED_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_OrphanedClass_0_1_initialbindings_blackBBBB(OrphanedClass _this, Match match,
			Model mModel, MClass mType) {
		return new Object[] { _this, match, mModel, mType };
	}

	public static final Object[] pattern_OrphanedClass_0_2_SolveCSP_bindingFBBBB(OrphanedClass _this, Match match,
			Model mModel, MClass mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mModel, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mModel, mType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClass_0_2_SolveCSP_bindingAndBlackFBBBB(OrphanedClass _this,
			Match match, Model mModel, MClass mType) {
		Object[] result_pattern_OrphanedClass_0_2_SolveCSP_binding = pattern_OrphanedClass_0_2_SolveCSP_bindingFBBBB(
				_this, match, mModel, mType);
		if (result_pattern_OrphanedClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_OrphanedClass_0_2_SolveCSP_black = pattern_OrphanedClass_0_2_SolveCSP_blackB(csp);
			if (result_pattern_OrphanedClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mModel, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClass_0_3_CheckCSP_expressionFBB(OrphanedClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_0_4_collectelementstobetranslated_blackBBB(Match match,
			Model mModel, MClass mType) {
		return new Object[] { match, mModel, mType };
	}

	public static final Object[] pattern_OrphanedClass_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Model mModel, MClass mType) {
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mType);
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		match.getToBeTranslatedEdges().add(mModel__mType____orphanTypes);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		return new Object[] { match, mModel, mType, mModel__mType____orphanTypes };
	}

	public static final Object[] pattern_OrphanedClass_0_5_collectcontextelements_blackBBB(Match match, Model mModel,
			MClass mType) {
		return new Object[] { match, mModel, mType };
	}

	public static final Object[] pattern_OrphanedClass_0_5_collectcontextelements_greenBB(Match match, Model mModel) {
		match.getContextNodes().add(mModel);
		return new Object[] { match, mModel };
	}

	public static final void pattern_OrphanedClass_0_6_registerobjectstomatch_expressionBBBB(OrphanedClass _this,
			Match match, Model mModel, MClass mType) {
		_this.registerObjectsToMatch_FWD(match, mModel, mType);

	}

	public static final boolean pattern_OrphanedClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tModule");
		EObject _localVariable_1 = isApplicableMatch.getObject("pg");
		EObject _localVariable_2 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_3 = isApplicableMatch.getObject("mType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject tmpTModule = _localVariable_0;
		EObject tmpPg = _localVariable_1;
		EObject tmpMModel = _localVariable_2;
		EObject tmpMType = _localVariable_3;
		EObject tmpMModelToTypeGraph = _localVariable_4;
		if (tmpTModule instanceof TModule) {
			TModule tModule = (TModule) tmpTModule;
			if (tmpPg instanceof TypeGraph) {
				TypeGraph pg = (TypeGraph) tmpPg;
				if (tmpMModel instanceof Model) {
					Model mModel = (Model) tmpMModel;
					if (tmpMType instanceof MClass) {
						MClass mType = (MClass) tmpMType;
						if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
							ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
							return new Object[] { tModule, pg, mModel, mType, mModelToTypeGraph, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_1_1_performtransformation_blackBBBBBFBB(TModule tModule,
			TypeGraph pg, Model mModel, MClass mType, ModelToTypeGraph mModelToTypeGraph, OrphanedClass _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tModule, pg, mModel, mType, mModelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			OrphanedClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OrphanedClass_1_1_performtransformation_binding = pattern_OrphanedClass_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_OrphanedClass_1_1_performtransformation_binding != null) {
			TModule tModule = (TModule) result_pattern_OrphanedClass_1_1_performtransformation_binding[0];
			TypeGraph pg = (TypeGraph) result_pattern_OrphanedClass_1_1_performtransformation_binding[1];
			Model mModel = (Model) result_pattern_OrphanedClass_1_1_performtransformation_binding[2];
			MClass mType = (MClass) result_pattern_OrphanedClass_1_1_performtransformation_binding[3];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_OrphanedClass_1_1_performtransformation_binding[4];

			Object[] result_pattern_OrphanedClass_1_1_performtransformation_black = pattern_OrphanedClass_1_1_performtransformation_blackBBBBBFBB(
					tModule, pg, mModel, mType, mModelToTypeGraph, _this, isApplicableMatch);
			if (result_pattern_OrphanedClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OrphanedClass_1_1_performtransformation_black[5];

				return new Object[] { tModule, pg, mModel, mType, mModelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_1_1_performtransformation_greenBFFFBBB(TModule tModule,
			TypeGraph pg, MClass mType, CSP csp) {
		TClass tType = BasicFactory.eINSTANCE.createTClass();
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		pg.getAllTypes().add(tType);
		tModule.getContains().add(tType);
		mAnnotatableToTAnnotatable.setTarget(tType);
		mAnnotatableToTAnnotatable.setSource(mType);
		mTypeToTType.setTarget(tType);
		mTypeToTType.setSource(mType);
		String tType_tName_prime = (String) _localVariable_0;
		tType.setTName(tType_tName_prime);
		return new Object[] { tModule, tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mType, csp };
	}

	public static final Object[] pattern_OrphanedClass_1_2_collecttranslatedelements_blackBBBB(TClass tType,
			ASTNodeToTAnnotatable mAnnotatableToTAnnotatable, TypeToTAbstractType mTypeToTType, MClass mType) {
		return new Object[] { tType, mAnnotatableToTAnnotatable, mTypeToTType, mType };
	}

	public static final Object[] pattern_OrphanedClass_1_2_collecttranslatedelements_greenFBBBB(TClass tType,
			ASTNodeToTAnnotatable mAnnotatableToTAnnotatable, TypeToTAbstractType mTypeToTType, MClass mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mAnnotatableToTAnnotatable);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getTranslatedElements().add(mType);
		return new Object[] { ruleresult, tType, mAnnotatableToTAnnotatable, mTypeToTType, mType };
	}

	public static final Object[] pattern_OrphanedClass_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tModule, EObject tType, EObject mAnnotatableToTAnnotatable,
			EObject mTypeToTType, EObject pg, EObject mModel, EObject mType, EObject mModelToTypeGraph) {
		if (!tModule.equals(tType)) {
			if (!mAnnotatableToTAnnotatable.equals(tModule)) {
				if (!mAnnotatableToTAnnotatable.equals(tType)) {
					if (!mAnnotatableToTAnnotatable.equals(mTypeToTType)) {
						if (!mAnnotatableToTAnnotatable.equals(pg)) {
							if (!mAnnotatableToTAnnotatable.equals(mModel)) {
								if (!mAnnotatableToTAnnotatable.equals(mType)) {
									if (!mAnnotatableToTAnnotatable.equals(mModelToTypeGraph)) {
										if (!mTypeToTType.equals(tModule)) {
											if (!mTypeToTType.equals(tType)) {
												if (!mTypeToTType.equals(pg)) {
													if (!pg.equals(tModule)) {
														if (!pg.equals(tType)) {
															if (!mModel.equals(tModule)) {
																if (!mModel.equals(tType)) {
																	if (!mModel.equals(mTypeToTType)) {
																		if (!mModel.equals(pg)) {
																			if (!mModel.equals(mType)) {
																				if (!mModel.equals(mModelToTypeGraph)) {
																					if (!mType.equals(tModule)) {
																						if (!mType.equals(tType)) {
																							if (!mType.equals(
																									mTypeToTType)) {
																								if (!mType.equals(pg)) {
																									if (!mModelToTypeGraph
																											.equals(tModule)) {
																										if (!mModelToTypeGraph
																												.equals(tType)) {
																											if (!mModelToTypeGraph
																													.equals(mTypeToTType)) {
																												if (!mModelToTypeGraph
																														.equals(pg)) {
																													if (!mModelToTypeGraph
																															.equals(mType)) {
																														return new Object[] {
																																ruleresult,
																																tModule,
																																tType,
																																mAnnotatableToTAnnotatable,
																																mTypeToTType,
																																pg,
																																mModel,
																																mType,
																																mModelToTypeGraph };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_OrphanedClass_1_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tModule, EObject tType, EObject mAnnotatableToTAnnotatable,
			EObject mTypeToTType, EObject pg, EObject mModel, EObject mType) {
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModule__tType____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tModule____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotatableToTAnnotatable__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotatableToTAnnotatable__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OrphanedClass";
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String tModule__tType____contains_name_prime = "contains";
		String tType__tModule____module_name_prime = "module";
		String mAnnotatableToTAnnotatable__tType____target_name_prime = "target";
		String mTypeToTType__tType____target_name_prime = "target";
		String mAnnotatableToTAnnotatable__mType____source_name_prime = "source";
		String mTypeToTType__mType____source_name_prime = "source";
		pg__tType____allTypes.setSrc(pg);
		pg__tType____allTypes.setTrg(tType);
		ruleresult.getCreatedEdges().add(pg__tType____allTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		ruleresult.getCreatedEdges().add(tType__pg____model);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mModel__mType____orphanTypes);
		tModule__tType____contains.setSrc(tModule);
		tModule__tType____contains.setTrg(tType);
		ruleresult.getCreatedEdges().add(tModule__tType____contains);
		tType__tModule____module.setSrc(tType);
		tType__tModule____module.setTrg(tModule);
		ruleresult.getCreatedEdges().add(tType__tModule____module);
		mAnnotatableToTAnnotatable__tType____target.setSrc(mAnnotatableToTAnnotatable);
		mAnnotatableToTAnnotatable__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mAnnotatableToTAnnotatable__tType____target);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		mAnnotatableToTAnnotatable__mType____source.setSrc(mAnnotatableToTAnnotatable);
		mAnnotatableToTAnnotatable__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mAnnotatableToTAnnotatable__mType____source);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		pg__tType____allTypes.setName(pg__tType____allTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		tModule__tType____contains.setName(tModule__tType____contains_name_prime);
		tType__tModule____module.setName(tType__tModule____module_name_prime);
		mAnnotatableToTAnnotatable__tType____target.setName(mAnnotatableToTAnnotatable__tType____target_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mAnnotatableToTAnnotatable__mType____source.setName(mAnnotatableToTAnnotatable__mType____source_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		return new Object[] { ruleresult, tModule, tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel, mType,
				pg__tType____allTypes, tType__pg____model, mModel__mType____orphanTypes, tModule__tType____contains,
				tType__tModule____module, mAnnotatableToTAnnotatable__tType____target, mTypeToTType__tType____target,
				mAnnotatableToTAnnotatable__mType____source, mTypeToTType__mType____source };
	}

	public static final void pattern_OrphanedClass_1_5_registerobjects_expressionBBBBBBBBBB(OrphanedClass _this,
			PerformRuleResult ruleresult, EObject tModule, EObject tType, EObject mAnnotatableToTAnnotatable,
			EObject mTypeToTType, EObject pg, EObject mModel, EObject mType, EObject mModelToTypeGraph) {
		_this.registerObjects_FWD(ruleresult, tModule, tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel,
				mType, mModelToTypeGraph);

	}

	public static final PerformRuleResult pattern_OrphanedClass_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_2_1_preparereturnvalue_bindingFB(OrphanedClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			OrphanedClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_2_1_preparereturnvalue_bindingAndBlackFFB(OrphanedClass _this) {
		Object[] result_pattern_OrphanedClass_2_1_preparereturnvalue_binding = pattern_OrphanedClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OrphanedClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedClass_2_1_preparereturnvalue_black = pattern_OrphanedClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OrphanedClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OrphanedClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OrphanedClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OrphanedClass_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mModel");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMModel = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			if (tmpMType instanceof MClass) {
				MClass mType = (MClass) tmpMType;
				return new Object[] { mModel, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClass_2_2_corematch_blackFBBFB(Model mModel, MClass mType,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
			TypeGraph pg = mModelToTypeGraph.getTarget();
			if (pg != null) {
				_result.add(new Object[] { pg, mModel, mType, mModelToTypeGraph, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedClass_2_3_findcontext_blackFBBBB(TypeGraph pg, Model mModel,
			MClass mType, ModelToTypeGraph mModelToTypeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mModel.getOrphanTypes().contains(mType)) {
			if (mModel.equals(mModelToTypeGraph.getSource())) {
				if (pg.equals(mModelToTypeGraph.getTarget())) {
					for (TModule tModule : pg.getModules()) {
						String tModule_location = tModule.getLocation();
						if (tModule_location.equals("${PROXIES}")) {
							_result.add(new Object[] { tModule, pg, mModel, mType, mModelToTypeGraph });
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_2_3_findcontext_greenBBBBBFFFFF(TModule tModule, TypeGraph pg,
			Model mModel, MClass mType, ModelToTypeGraph mModelToTypeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tModule____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		String pg__tModule____modules_name_prime = "modules";
		String mModelToTypeGraph__pg____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tModule);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mModel__mType____orphanTypes);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		pg__tModule____modules.setSrc(pg);
		pg__tModule____modules.setTrg(tModule);
		isApplicableMatch.getAllContextElements().add(pg__tModule____modules);
		mModelToTypeGraph__pg____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__pg____target);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		pg__tModule____modules.setName(pg__tModule____modules_name_prime);
		mModelToTypeGraph__pg____target.setName(mModelToTypeGraph__pg____target_name_prime);
		return new Object[] { tModule, pg, mModel, mType, mModelToTypeGraph, isApplicableMatch,
				mModel__mType____orphanTypes, mModelToTypeGraph__mModel____source, pg__tModule____modules,
				mModelToTypeGraph__pg____target };
	}

	public static final Object[] pattern_OrphanedClass_2_4_solveCSP_bindingFBBBBBBB(OrphanedClass _this,
			IsApplicableMatch isApplicableMatch, TModule tModule, TypeGraph pg, Model mModel, MClass mType,
			ModelToTypeGraph mModelToTypeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, tModule, pg, mModel, mType,
				mModelToTypeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tModule, pg, mModel, mType, mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClass_2_4_solveCSP_bindingAndBlackFBBBBBBB(OrphanedClass _this,
			IsApplicableMatch isApplicableMatch, TModule tModule, TypeGraph pg, Model mModel, MClass mType,
			ModelToTypeGraph mModelToTypeGraph) {
		Object[] result_pattern_OrphanedClass_2_4_solveCSP_binding = pattern_OrphanedClass_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tModule, pg, mModel, mType, mModelToTypeGraph);
		if (result_pattern_OrphanedClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_OrphanedClass_2_4_solveCSP_black = pattern_OrphanedClass_2_4_solveCSP_blackB(csp);
			if (result_pattern_OrphanedClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tModule, pg, mModel, mType, mModelToTypeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClass_2_5_checkCSP_expressionFBB(OrphanedClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OrphanedClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OrphanedClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OrphanedClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_10_1_initialbindings_blackBBBBB(OrphanedClass _this, Match match,
			TModule tModule, TClass tType, TypeGraph pg) {
		return new Object[] { _this, match, tModule, tType, pg };
	}

	public static final Object[] pattern_OrphanedClass_10_2_SolveCSP_bindingFBBBBB(OrphanedClass _this, Match match,
			TModule tModule, TClass tType, TypeGraph pg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tModule, tType, pg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tModule, tType, pg };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClass_10_2_SolveCSP_bindingAndBlackFBBBBB(OrphanedClass _this,
			Match match, TModule tModule, TClass tType, TypeGraph pg) {
		Object[] result_pattern_OrphanedClass_10_2_SolveCSP_binding = pattern_OrphanedClass_10_2_SolveCSP_bindingFBBBBB(
				_this, match, tModule, tType, pg);
		if (result_pattern_OrphanedClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_OrphanedClass_10_2_SolveCSP_black = pattern_OrphanedClass_10_2_SolveCSP_blackB(csp);
			if (result_pattern_OrphanedClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tModule, tType, pg };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClass_10_3_CheckCSP_expressionFBB(OrphanedClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_10_4_collectelementstobetranslated_blackBBBB(Match match,
			TModule tModule, TClass tType, TypeGraph pg) {
		return new Object[] { match, tModule, tType, pg };
	}

	public static final Object[] pattern_OrphanedClass_10_4_collectelementstobetranslated_greenBBBBFFFF(Match match,
			TModule tModule, TClass tType, TypeGraph pg) {
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModule__tType____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tModule____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tType);
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String tModule__tType____contains_name_prime = "contains";
		String tType__tModule____module_name_prime = "module";
		pg__tType____allTypes.setSrc(pg);
		pg__tType____allTypes.setTrg(tType);
		match.getToBeTranslatedEdges().add(pg__tType____allTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		match.getToBeTranslatedEdges().add(tType__pg____model);
		tModule__tType____contains.setSrc(tModule);
		tModule__tType____contains.setTrg(tType);
		match.getToBeTranslatedEdges().add(tModule__tType____contains);
		tType__tModule____module.setSrc(tType);
		tType__tModule____module.setTrg(tModule);
		match.getToBeTranslatedEdges().add(tType__tModule____module);
		pg__tType____allTypes.setName(pg__tType____allTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		tModule__tType____contains.setName(tModule__tType____contains_name_prime);
		tType__tModule____module.setName(tType__tModule____module_name_prime);
		return new Object[] { match, tModule, tType, pg, pg__tType____allTypes, tType__pg____model,
				tModule__tType____contains, tType__tModule____module };
	}

	public static final Object[] pattern_OrphanedClass_10_5_collectcontextelements_blackBBBB(Match match,
			TModule tModule, TClass tType, TypeGraph pg) {
		return new Object[] { match, tModule, tType, pg };
	}

	public static final Object[] pattern_OrphanedClass_10_5_collectcontextelements_greenBBBF(Match match,
			TModule tModule, TypeGraph pg) {
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

	public static final void pattern_OrphanedClass_10_6_registerobjectstomatch_expressionBBBBB(OrphanedClass _this,
			Match match, TModule tModule, TClass tType, TypeGraph pg) {
		_this.registerObjectsToMatch_BWD(match, tModule, tType, pg);

	}

	public static final boolean pattern_OrphanedClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("tModule");
		EObject _localVariable_1 = isApplicableMatch.getObject("tType");
		EObject _localVariable_2 = isApplicableMatch.getObject("pg");
		EObject _localVariable_3 = isApplicableMatch.getObject("mModel");
		EObject _localVariable_4 = isApplicableMatch.getObject("mModelToTypeGraph");
		EObject tmpTModule = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpMModel = _localVariable_3;
		EObject tmpMModelToTypeGraph = _localVariable_4;
		if (tmpTModule instanceof TModule) {
			TModule tModule = (TModule) tmpTModule;
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpMModel instanceof Model) {
						Model mModel = (Model) tmpMModel;
						if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
							ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
							return new Object[] { tModule, tType, pg, mModel, mModelToTypeGraph, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_11_1_performtransformation_blackBBBBBFBB(TModule tModule,
			TClass tType, TypeGraph pg, Model mModel, ModelToTypeGraph mModelToTypeGraph, OrphanedClass _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { tModule, tType, pg, mModel, mModelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			OrphanedClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OrphanedClass_11_1_performtransformation_binding = pattern_OrphanedClass_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_OrphanedClass_11_1_performtransformation_binding != null) {
			TModule tModule = (TModule) result_pattern_OrphanedClass_11_1_performtransformation_binding[0];
			TClass tType = (TClass) result_pattern_OrphanedClass_11_1_performtransformation_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_OrphanedClass_11_1_performtransformation_binding[2];
			Model mModel = (Model) result_pattern_OrphanedClass_11_1_performtransformation_binding[3];
			ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) result_pattern_OrphanedClass_11_1_performtransformation_binding[4];

			Object[] result_pattern_OrphanedClass_11_1_performtransformation_black = pattern_OrphanedClass_11_1_performtransformation_blackBBBBBFBB(
					tModule, tType, pg, mModel, mModelToTypeGraph, _this, isApplicableMatch);
			if (result_pattern_OrphanedClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OrphanedClass_11_1_performtransformation_black[5];

				return new Object[] { tModule, tType, pg, mModel, mModelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_11_1_performtransformation_greenBFFBFB(TClass tType,
			Model mModel, CSP csp) {
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		MClass mType = ModiscoFactory.eINSTANCE.createMClass();
		Object _localVariable_0 = csp.getValue("mType", "name");
		mAnnotatableToTAnnotatable.setTarget(tType);
		mTypeToTType.setTarget(tType);
		mModel.getOrphanTypes().add(mType);
		mAnnotatableToTAnnotatable.setSource(mType);
		mTypeToTType.setSource(mType);
		String mType_name_prime = (String) _localVariable_0;
		mType.setName(mType_name_prime);
		return new Object[] { tType, mAnnotatableToTAnnotatable, mTypeToTType, mModel, mType, csp };
	}

	public static final Object[] pattern_OrphanedClass_11_2_collecttranslatedelements_blackBBBB(TClass tType,
			ASTNodeToTAnnotatable mAnnotatableToTAnnotatable, TypeToTAbstractType mTypeToTType, MClass mType) {
		return new Object[] { tType, mAnnotatableToTAnnotatable, mTypeToTType, mType };
	}

	public static final Object[] pattern_OrphanedClass_11_2_collecttranslatedelements_greenFBBBB(TClass tType,
			ASTNodeToTAnnotatable mAnnotatableToTAnnotatable, TypeToTAbstractType mTypeToTType, MClass mType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(tType);
		ruleresult.getCreatedLinkElements().add(mAnnotatableToTAnnotatable);
		ruleresult.getCreatedLinkElements().add(mTypeToTType);
		ruleresult.getCreatedElements().add(mType);
		return new Object[] { ruleresult, tType, mAnnotatableToTAnnotatable, mTypeToTType, mType };
	}

	public static final Object[] pattern_OrphanedClass_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject tModule, EObject tType, EObject mAnnotatableToTAnnotatable,
			EObject mTypeToTType, EObject pg, EObject mModel, EObject mType, EObject mModelToTypeGraph) {
		if (!tModule.equals(tType)) {
			if (!mAnnotatableToTAnnotatable.equals(tModule)) {
				if (!mAnnotatableToTAnnotatable.equals(tType)) {
					if (!mAnnotatableToTAnnotatable.equals(mTypeToTType)) {
						if (!mAnnotatableToTAnnotatable.equals(pg)) {
							if (!mAnnotatableToTAnnotatable.equals(mModel)) {
								if (!mAnnotatableToTAnnotatable.equals(mType)) {
									if (!mAnnotatableToTAnnotatable.equals(mModelToTypeGraph)) {
										if (!mTypeToTType.equals(tModule)) {
											if (!mTypeToTType.equals(tType)) {
												if (!mTypeToTType.equals(pg)) {
													if (!pg.equals(tModule)) {
														if (!pg.equals(tType)) {
															if (!mModel.equals(tModule)) {
																if (!mModel.equals(tType)) {
																	if (!mModel.equals(mTypeToTType)) {
																		if (!mModel.equals(pg)) {
																			if (!mModel.equals(mType)) {
																				if (!mModel.equals(mModelToTypeGraph)) {
																					if (!mType.equals(tModule)) {
																						if (!mType.equals(tType)) {
																							if (!mType.equals(
																									mTypeToTType)) {
																								if (!mType.equals(pg)) {
																									if (!mModelToTypeGraph
																											.equals(tModule)) {
																										if (!mModelToTypeGraph
																												.equals(tType)) {
																											if (!mModelToTypeGraph
																													.equals(mTypeToTType)) {
																												if (!mModelToTypeGraph
																														.equals(pg)) {
																													if (!mModelToTypeGraph
																															.equals(mType)) {
																														return new Object[] {
																																ruleresult,
																																tModule,
																																tType,
																																mAnnotatableToTAnnotatable,
																																mTypeToTType,
																																pg,
																																mModel,
																																mType,
																																mModelToTypeGraph };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_OrphanedClass_11_3_bookkeepingforedges_greenBBBBBBBBFFFFFFFFF(
			PerformRuleResult ruleresult, EObject tModule, EObject tType, EObject mAnnotatableToTAnnotatable,
			EObject mTypeToTType, EObject pg, EObject mModel, EObject mType) {
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModel__mType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModule__tType____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tModule____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotatableToTAnnotatable__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__tType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnnotatableToTAnnotatable__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mTypeToTType__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OrphanedClass";
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String mModel__mType____orphanTypes_name_prime = "orphanTypes";
		String tModule__tType____contains_name_prime = "contains";
		String tType__tModule____module_name_prime = "module";
		String mAnnotatableToTAnnotatable__tType____target_name_prime = "target";
		String mTypeToTType__tType____target_name_prime = "target";
		String mAnnotatableToTAnnotatable__mType____source_name_prime = "source";
		String mTypeToTType__mType____source_name_prime = "source";
		pg__tType____allTypes.setSrc(pg);
		pg__tType____allTypes.setTrg(tType);
		ruleresult.getTranslatedEdges().add(pg__tType____allTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		ruleresult.getTranslatedEdges().add(tType__pg____model);
		mModel__mType____orphanTypes.setSrc(mModel);
		mModel__mType____orphanTypes.setTrg(mType);
		ruleresult.getCreatedEdges().add(mModel__mType____orphanTypes);
		tModule__tType____contains.setSrc(tModule);
		tModule__tType____contains.setTrg(tType);
		ruleresult.getTranslatedEdges().add(tModule__tType____contains);
		tType__tModule____module.setSrc(tType);
		tType__tModule____module.setTrg(tModule);
		ruleresult.getTranslatedEdges().add(tType__tModule____module);
		mAnnotatableToTAnnotatable__tType____target.setSrc(mAnnotatableToTAnnotatable);
		mAnnotatableToTAnnotatable__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mAnnotatableToTAnnotatable__tType____target);
		mTypeToTType__tType____target.setSrc(mTypeToTType);
		mTypeToTType__tType____target.setTrg(tType);
		ruleresult.getCreatedEdges().add(mTypeToTType__tType____target);
		mAnnotatableToTAnnotatable__mType____source.setSrc(mAnnotatableToTAnnotatable);
		mAnnotatableToTAnnotatable__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mAnnotatableToTAnnotatable__mType____source);
		mTypeToTType__mType____source.setSrc(mTypeToTType);
		mTypeToTType__mType____source.setTrg(mType);
		ruleresult.getCreatedEdges().add(mTypeToTType__mType____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		pg__tType____allTypes.setName(pg__tType____allTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		mModel__mType____orphanTypes.setName(mModel__mType____orphanTypes_name_prime);
		tModule__tType____contains.setName(tModule__tType____contains_name_prime);
		tType__tModule____module.setName(tType__tModule____module_name_prime);
		mAnnotatableToTAnnotatable__tType____target.setName(mAnnotatableToTAnnotatable__tType____target_name_prime);
		mTypeToTType__tType____target.setName(mTypeToTType__tType____target_name_prime);
		mAnnotatableToTAnnotatable__mType____source.setName(mAnnotatableToTAnnotatable__mType____source_name_prime);
		mTypeToTType__mType____source.setName(mTypeToTType__mType____source_name_prime);
		return new Object[] { ruleresult, tModule, tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel, mType,
				pg__tType____allTypes, tType__pg____model, mModel__mType____orphanTypes, tModule__tType____contains,
				tType__tModule____module, mAnnotatableToTAnnotatable__tType____target, mTypeToTType__tType____target,
				mAnnotatableToTAnnotatable__mType____source, mTypeToTType__mType____source };
	}

	public static final void pattern_OrphanedClass_11_5_registerobjects_expressionBBBBBBBBBB(OrphanedClass _this,
			PerformRuleResult ruleresult, EObject tModule, EObject tType, EObject mAnnotatableToTAnnotatable,
			EObject mTypeToTType, EObject pg, EObject mModel, EObject mType, EObject mModelToTypeGraph) {
		_this.registerObjects_BWD(ruleresult, tModule, tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel,
				mType, mModelToTypeGraph);

	}

	public static final PerformRuleResult pattern_OrphanedClass_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_12_1_preparereturnvalue_bindingFB(OrphanedClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_12_1_preparereturnvalue_blackFBB(EClass eClass,
			OrphanedClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_12_1_preparereturnvalue_bindingAndBlackFFB(OrphanedClass _this) {
		Object[] result_pattern_OrphanedClass_12_1_preparereturnvalue_binding = pattern_OrphanedClass_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedClass_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OrphanedClass_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedClass_12_1_preparereturnvalue_black = pattern_OrphanedClass_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OrphanedClass_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OrphanedClass_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OrphanedClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OrphanedClass_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tModule");
		EObject _localVariable_1 = match.getObject("tType");
		EObject _localVariable_2 = match.getObject("pg");
		EObject tmpTModule = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		if (tmpTModule instanceof TModule) {
			TModule tModule = (TModule) tmpTModule;
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					return new Object[] { tModule, tType, pg, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClass_12_2_corematch_blackBBBFFB(TModule tModule,
			TClass tType, TypeGraph pg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String tModule_location = tModule.getLocation();
		if (tModule_location.equals("${PROXIES}")) {
			for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(pg, ModelToTypeGraph.class, "target")) {
				Model mModel = mModelToTypeGraph.getSource();
				if (mModel != null) {
					_result.add(new Object[] { tModule, tType, pg, mModel, mModelToTypeGraph, match });
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedClass_12_3_findcontext_blackBBBBB(TModule tModule,
			TClass tType, TypeGraph pg, Model mModel, ModelToTypeGraph mModelToTypeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (pg.getAllTypes().contains(tType)) {
			if (mModel.equals(mModelToTypeGraph.getSource())) {
				if (tModule.getContains().contains(tType)) {
					if (pg.getModules().contains(tModule)) {
						if (pg.equals(mModelToTypeGraph.getTarget())) {
							String tModule_location = tModule.getLocation();
							if (tModule_location.equals("${PROXIES}")) {
								_result.add(new Object[] { tModule, tType, pg, mModel, mModelToTypeGraph });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_12_3_findcontext_greenBBBBBFFFFFFFF(TModule tModule,
			TClass tType, TypeGraph pg, Model mModel, ModelToTypeGraph mModelToTypeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge pg__tType____allTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__pg____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__mModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tModule__tType____contains = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tType__tModule____module = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge pg__tModule____modules = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mModelToTypeGraph__pg____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String pg__tType____allTypes_name_prime = "allTypes";
		String tType__pg____model_name_prime = "model";
		String mModelToTypeGraph__mModel____source_name_prime = "source";
		String tModule__tType____contains_name_prime = "contains";
		String tType__tModule____module_name_prime = "module";
		String pg__tModule____modules_name_prime = "modules";
		String mModelToTypeGraph__pg____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(tModule);
		isApplicableMatch.getAllContextElements().add(tType);
		isApplicableMatch.getAllContextElements().add(pg);
		isApplicableMatch.getAllContextElements().add(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph);
		pg__tType____allTypes.setSrc(pg);
		pg__tType____allTypes.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(pg__tType____allTypes);
		tType__pg____model.setSrc(tType);
		tType__pg____model.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(tType__pg____model);
		mModelToTypeGraph__mModel____source.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__mModel____source.setTrg(mModel);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__mModel____source);
		tModule__tType____contains.setSrc(tModule);
		tModule__tType____contains.setTrg(tType);
		isApplicableMatch.getAllContextElements().add(tModule__tType____contains);
		tType__tModule____module.setSrc(tType);
		tType__tModule____module.setTrg(tModule);
		isApplicableMatch.getAllContextElements().add(tType__tModule____module);
		pg__tModule____modules.setSrc(pg);
		pg__tModule____modules.setTrg(tModule);
		isApplicableMatch.getAllContextElements().add(pg__tModule____modules);
		mModelToTypeGraph__pg____target.setSrc(mModelToTypeGraph);
		mModelToTypeGraph__pg____target.setTrg(pg);
		isApplicableMatch.getAllContextElements().add(mModelToTypeGraph__pg____target);
		pg__tType____allTypes.setName(pg__tType____allTypes_name_prime);
		tType__pg____model.setName(tType__pg____model_name_prime);
		mModelToTypeGraph__mModel____source.setName(mModelToTypeGraph__mModel____source_name_prime);
		tModule__tType____contains.setName(tModule__tType____contains_name_prime);
		tType__tModule____module.setName(tType__tModule____module_name_prime);
		pg__tModule____modules.setName(pg__tModule____modules_name_prime);
		mModelToTypeGraph__pg____target.setName(mModelToTypeGraph__pg____target_name_prime);
		return new Object[] { tModule, tType, pg, mModel, mModelToTypeGraph, isApplicableMatch, pg__tType____allTypes,
				tType__pg____model, mModelToTypeGraph__mModel____source, tModule__tType____contains,
				tType__tModule____module, pg__tModule____modules, mModelToTypeGraph__pg____target };
	}

	public static final Object[] pattern_OrphanedClass_12_4_solveCSP_bindingFBBBBBBB(OrphanedClass _this,
			IsApplicableMatch isApplicableMatch, TModule tModule, TClass tType, TypeGraph pg, Model mModel,
			ModelToTypeGraph mModelToTypeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, tModule, tType, pg, mModel,
				mModelToTypeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tModule, tType, pg, mModel, mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClass_12_4_solveCSP_bindingAndBlackFBBBBBBB(OrphanedClass _this,
			IsApplicableMatch isApplicableMatch, TModule tModule, TClass tType, TypeGraph pg, Model mModel,
			ModelToTypeGraph mModelToTypeGraph) {
		Object[] result_pattern_OrphanedClass_12_4_solveCSP_binding = pattern_OrphanedClass_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tModule, tType, pg, mModel, mModelToTypeGraph);
		if (result_pattern_OrphanedClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_OrphanedClass_12_4_solveCSP_black = pattern_OrphanedClass_12_4_solveCSP_blackB(csp);
			if (result_pattern_OrphanedClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tModule, tType, pg, mModel, mModelToTypeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClass_12_5_checkCSP_expressionFBB(OrphanedClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OrphanedClass_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OrphanedClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OrphanedClass_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_20_1_preparereturnvalue_bindingFB(OrphanedClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OrphanedClass _this) {
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

	public static final Object[] pattern_OrphanedClass_20_1_preparereturnvalue_bindingAndBlackFFBF(
			OrphanedClass _this) {
		Object[] result_pattern_OrphanedClass_20_1_preparereturnvalue_binding = pattern_OrphanedClass_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedClass_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OrphanedClass_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedClass_20_1_preparereturnvalue_black = pattern_OrphanedClass_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OrphanedClass_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OrphanedClass_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OrphanedClass_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_OrphanedClass_20_2_testcorematchandDECs_black_nac_0B(TClass tType) {
		for (TPackage __DEC_tType_classes_144242 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "classes")) {
			return new Object[] { tType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_20_2_testcorematchandDECs_black_nac_1BB(TClass tType,
			TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_544406 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_544406)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_20_2_testcorematchandDECs_black_nac_2B(TClass tType) {
		TPackage __DEC_tType_allTypes_862798 = tType.getPackage();
		if (__DEC_tType_allTypes_862798 != null) {
			return new Object[] { tType };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_20_2_testcorematchandDECs_black_nac_3B(TClass tType) {
		TAbstractType __DEC_tType_innerTypes_700088 = tType.getOuterType();
		if (__DEC_tType_innerTypes_700088 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_700088)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_20_2_testcorematchandDECs_black_nac_4BB(TypeGraph pg,
			TClass tType) {
		if (pg.getClasses().contains(tType)) {
			return new Object[] { pg, tType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClass_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_allTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpPg = _edge_allTypes.getSrc();
		if (tmpPg instanceof TypeGraph) {
			TypeGraph pg = (TypeGraph) tmpPg;
			EObject tmpTType = _edge_allTypes.getTrg();
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (pg.getAllTypes().contains(tType)) {
					TModule tModule = tType.getModule();
					if (tModule != null) {
						if (pg.getModules().contains(tModule)) {
							String tModule_location = tModule.getLocation();
							if (tModule_location.equals("${PROXIES}")) {
								if (pattern_OrphanedClass_20_2_testcorematchandDECs_black_nac_0B(tType) == null) {
									if (pattern_OrphanedClass_20_2_testcorematchandDECs_black_nac_1BB(tType,
											pg) == null) {
										if (pattern_OrphanedClass_20_2_testcorematchandDECs_black_nac_2B(
												tType) == null) {
											if (pattern_OrphanedClass_20_2_testcorematchandDECs_black_nac_3B(
													tType) == null) {
												if (pattern_OrphanedClass_20_2_testcorematchandDECs_black_nac_4BB(pg,
														tType) == null) {
													_result.add(new Object[] { tModule, tType, pg, _edge_allTypes });
												}
											}
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

	public static final Object[] pattern_OrphanedClass_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OrphanedClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			OrphanedClass _this, Match match, TModule tModule, TClass tType, TypeGraph pg) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tModule, tType, pg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OrphanedClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OrphanedClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OrphanedClass_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_21_1_preparereturnvalue_bindingFB(OrphanedClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			OrphanedClass _this) {
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

	public static final Object[] pattern_OrphanedClass_21_1_preparereturnvalue_bindingAndBlackFFBF(
			OrphanedClass _this) {
		Object[] result_pattern_OrphanedClass_21_1_preparereturnvalue_binding = pattern_OrphanedClass_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedClass_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OrphanedClass_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedClass_21_1_preparereturnvalue_black = pattern_OrphanedClass_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OrphanedClass_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OrphanedClass_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OrphanedClass_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_OrphanedClass_21_2_testcorematchandDECs_black_nac_0B(MClass mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_283074 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_283074 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_283074)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_21_2_testcorematchandDECs_black_nac_1B(MClass mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_238718 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_238718 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_21_2_testcorematchandDECs_black_nac_2B(MClass mType) {
		org.eclipse.modisco.java.Package __DEC_mType_ownedElements_722755 = mType.getPackage();
		if (__DEC_mType_ownedElements_722755 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_21_2_testcorematchandDECs_black_nac_3B(MClass mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_870564 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClass_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMModel = _edge_orphanTypes.getSrc();
		if (tmpMModel instanceof Model) {
			Model mModel = (Model) tmpMModel;
			EObject tmpMType = _edge_orphanTypes.getTrg();
			if (tmpMType instanceof MClass) {
				MClass mType = (MClass) tmpMType;
				if (mModel.getOrphanTypes().contains(mType)) {
					if (pattern_OrphanedClass_21_2_testcorematchandDECs_black_nac_0B(mType) == null) {
						if (pattern_OrphanedClass_21_2_testcorematchandDECs_black_nac_1B(mType) == null) {
							if (pattern_OrphanedClass_21_2_testcorematchandDECs_black_nac_2B(mType) == null) {
								if (pattern_OrphanedClass_21_2_testcorematchandDECs_black_nac_3B(mType) == null) {
									_result.add(new Object[] { mModel, mType, _edge_orphanTypes });
								}
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_OrphanedClass_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OrphanedClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OrphanedClass _this, Match match, Model mModel, MClass mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mModel, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OrphanedClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OrphanedClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OrphanedClass_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_24_1_prepare_blackB(OrphanedClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OrphanedClass_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_OrphanedClass_24_2_matchsrctrgcontext_bindingFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("tModule");
		EObject _localVariable_1 = targetMatch.getObject("tType");
		EObject _localVariable_2 = targetMatch.getObject("pg");
		EObject _localVariable_3 = sourceMatch.getObject("mModel");
		EObject _localVariable_4 = sourceMatch.getObject("mType");
		EObject tmpTModule = _localVariable_0;
		EObject tmpTType = _localVariable_1;
		EObject tmpPg = _localVariable_2;
		EObject tmpMModel = _localVariable_3;
		EObject tmpMType = _localVariable_4;
		if (tmpTModule instanceof TModule) {
			TModule tModule = (TModule) tmpTModule;
			if (tmpTType instanceof TClass) {
				TClass tType = (TClass) tmpTType;
				if (tmpPg instanceof TypeGraph) {
					TypeGraph pg = (TypeGraph) tmpPg;
					if (tmpMModel instanceof Model) {
						Model mModel = (Model) tmpMModel;
						if (tmpMType instanceof MClass) {
							MClass mType = (MClass) tmpMType;
							return new Object[] { tModule, tType, pg, mModel, mType, targetMatch, sourceMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_24_2_matchsrctrgcontext_blackBBBBBBB(TModule tModule,
			TClass tType, TypeGraph pg, Model mModel, MClass mType, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			String tModule_location = tModule.getLocation();
			if (tModule_location.equals("${PROXIES}")) {
				return new Object[] { tModule, tType, pg, mModel, mType, sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_OrphanedClass_24_2_matchsrctrgcontext_binding = pattern_OrphanedClass_24_2_matchsrctrgcontext_bindingFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_OrphanedClass_24_2_matchsrctrgcontext_binding != null) {
			TModule tModule = (TModule) result_pattern_OrphanedClass_24_2_matchsrctrgcontext_binding[0];
			TClass tType = (TClass) result_pattern_OrphanedClass_24_2_matchsrctrgcontext_binding[1];
			TypeGraph pg = (TypeGraph) result_pattern_OrphanedClass_24_2_matchsrctrgcontext_binding[2];
			Model mModel = (Model) result_pattern_OrphanedClass_24_2_matchsrctrgcontext_binding[3];
			MClass mType = (MClass) result_pattern_OrphanedClass_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_OrphanedClass_24_2_matchsrctrgcontext_black = pattern_OrphanedClass_24_2_matchsrctrgcontext_blackBBBBBBB(
					tModule, tType, pg, mModel, mType, sourceMatch, targetMatch);
			if (result_pattern_OrphanedClass_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { tModule, tType, pg, mModel, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_24_3_solvecsp_bindingFBBBBBBBB(OrphanedClass _this,
			TModule tModule, TClass tType, TypeGraph pg, Model mModel, MClass mType, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(tModule, tType, pg, mModel, mType, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, tModule, tType, pg, mModel, mType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClass_24_3_solvecsp_bindingAndBlackFBBBBBBBB(OrphanedClass _this,
			TModule tModule, TClass tType, TypeGraph pg, Model mModel, MClass mType, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_OrphanedClass_24_3_solvecsp_binding = pattern_OrphanedClass_24_3_solvecsp_bindingFBBBBBBBB(
				_this, tModule, tType, pg, mModel, mType, sourceMatch, targetMatch);
		if (result_pattern_OrphanedClass_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClass_24_3_solvecsp_binding[0];

			Object[] result_pattern_OrphanedClass_24_3_solvecsp_black = pattern_OrphanedClass_24_3_solvecsp_blackB(csp);
			if (result_pattern_OrphanedClass_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, tModule, tType, pg, mModel, mType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClass_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedClass_24_5_matchcorrcontext_blackBBFBB(TypeGraph pg,
			Model mModel, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph mModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(mModel, ModelToTypeGraph.class, "source")) {
				if (pg.equals(mModelToTypeGraph.getTarget())) {
					_result.add(new Object[] { pg, mModel, mModelToTypeGraph, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_24_5_matchcorrcontext_greenBBBF(
			ModelToTypeGraph mModelToTypeGraph, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "OrphanedClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(mModelToTypeGraph);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { mModelToTypeGraph, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_OrphanedClass_24_6_createcorrespondence_blackBBBBBB(TModule tModule,
			TClass tType, TypeGraph pg, Model mModel, MClass mType, CCMatch ccMatch) {
		return new Object[] { tModule, tType, pg, mModel, mType, ccMatch };
	}

	public static final Object[] pattern_OrphanedClass_24_6_createcorrespondence_greenBFFBB(TClass tType, MClass mType,
			CCMatch ccMatch) {
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		mAnnotatableToTAnnotatable.setTarget(tType);
		mAnnotatableToTAnnotatable.setSource(mType);
		ccMatch.getCreateCorr().add(mAnnotatableToTAnnotatable);
		mTypeToTType.setTarget(tType);
		mTypeToTType.setSource(mType);
		ccMatch.getCreateCorr().add(mTypeToTType);
		return new Object[] { tType, mAnnotatableToTAnnotatable, mTypeToTType, mType, ccMatch };
	}

	public static final Object[] pattern_OrphanedClass_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_OrphanedClass_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "OrphanedClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_OrphanedClass_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_27_1_matchtggpattern_black_nac_0B(MClass mType) {
		AbstractTypeDeclaration __DEC_mType_abstractTypeDeclaration_330614 = mType.getAbstractTypeDeclaration();
		if (__DEC_mType_abstractTypeDeclaration_330614 != null) {
			if (!mType.equals(__DEC_mType_abstractTypeDeclaration_330614)) {
				return new Object[] { mType };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_27_1_matchtggpattern_black_nac_1B(MClass mType) {
		AnonymousClassDeclaration __DEC_mType_anonymousClassDeclarationOwner_489853 = mType
				.getAnonymousClassDeclarationOwner();
		if (__DEC_mType_anonymousClassDeclarationOwner_489853 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_27_1_matchtggpattern_black_nac_2B(MClass mType) {
		org.eclipse.modisco.java.Package __DEC_mType_ownedElements_712131 = mType.getPackage();
		if (__DEC_mType_ownedElements_712131 != null) {
			return new Object[] { mType };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_27_1_matchtggpattern_black_nac_3B(MClass mType) {
		for (MAbstractMethodDefinition __DEC_mType_mInnerTypes_9658 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mType, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { mType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_27_1_matchtggpattern_blackBB(Model mModel, MClass mType) {
		if (mModel.getOrphanTypes().contains(mType)) {
			if (pattern_OrphanedClass_27_1_matchtggpattern_black_nac_0B(mType) == null) {
				if (pattern_OrphanedClass_27_1_matchtggpattern_black_nac_1B(mType) == null) {
					if (pattern_OrphanedClass_27_1_matchtggpattern_black_nac_2B(mType) == null) {
						if (pattern_OrphanedClass_27_1_matchtggpattern_black_nac_3B(mType) == null) {
							return new Object[] { mModel, mType };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClass_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedClass_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_28_1_matchtggpattern_black_nac_0B(TClass tType) {
		for (TPackage __DEC_tType_classes_858937 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TPackage.class, "classes")) {
			return new Object[] { tType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_28_1_matchtggpattern_black_nac_1BB(TClass tType, TypeGraph pg) {
		for (TypeGraph __DEC_tType_classes_860821 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(tType, TypeGraph.class, "classes")) {
			if (!pg.equals(__DEC_tType_classes_860821)) {
				return new Object[] { tType, pg };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_28_1_matchtggpattern_black_nac_2B(TClass tType) {
		TPackage __DEC_tType_allTypes_826920 = tType.getPackage();
		if (__DEC_tType_allTypes_826920 != null) {
			return new Object[] { tType };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_28_1_matchtggpattern_black_nac_3B(TClass tType) {
		TAbstractType __DEC_tType_innerTypes_854934 = tType.getOuterType();
		if (__DEC_tType_innerTypes_854934 != null) {
			if (!tType.equals(__DEC_tType_innerTypes_854934)) {
				return new Object[] { tType };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_28_1_matchtggpattern_black_nac_4BB(TypeGraph pg, TClass tType) {
		if (pg.getClasses().contains(tType)) {
			return new Object[] { pg, tType };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_28_1_matchtggpattern_blackBBB(TModule tModule, TClass tType,
			TypeGraph pg) {
		if (pg.getAllTypes().contains(tType)) {
			if (tModule.getContains().contains(tType)) {
				if (pg.getModules().contains(tModule)) {
					String tModule_location = tModule.getLocation();
					if (tModule_location.equals("${PROXIES}")) {
						if (pattern_OrphanedClass_28_1_matchtggpattern_black_nac_0B(tType) == null) {
							if (pattern_OrphanedClass_28_1_matchtggpattern_black_nac_1BB(tType, pg) == null) {
								if (pattern_OrphanedClass_28_1_matchtggpattern_black_nac_2B(tType) == null) {
									if (pattern_OrphanedClass_28_1_matchtggpattern_black_nac_3B(tType) == null) {
										if (pattern_OrphanedClass_28_1_matchtggpattern_black_nac_4BB(pg,
												tType) == null) {
											return new Object[] { tModule, tType, pg };
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

	public static final boolean pattern_OrphanedClass_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedClass_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_29_1_createresult_blackB(OrphanedClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OrphanedClass_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_OrphanedClass_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TModule tModule) {
		if (ruleResult.getTargetObjects().contains(tModule)) {
			return new Object[] { ruleResult, tModule };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph pg) {
		if (ruleResult.getTargetObjects().contains(pg)) {
			return new Object[] { ruleResult, pg };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph mModelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(mModelToTypeGraph)) {
			return new Object[] { ruleResult, mModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Model mModel) {
		if (ruleResult.getSourceObjects().contains(mModel)) {
			return new Object[] { ruleResult, mModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClass_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList mModelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpMModelToTypeGraph : mModelToTypeGraphList.getEntryObjects()) {
				if (tmpMModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph mModelToTypeGraph = (ModelToTypeGraph) tmpMModelToTypeGraph;
					TypeGraph pg = mModelToTypeGraph.getTarget();
					if (pg != null) {
						Model mModel = mModelToTypeGraph.getSource();
						if (mModel != null) {
							if (pattern_OrphanedClass_29_2_isapplicablecore_black_nac_2BB(ruleResult,
									mModelToTypeGraph) == null) {
								if (pattern_OrphanedClass_29_2_isapplicablecore_black_nac_1BB(ruleResult, pg) == null) {
									if (pattern_OrphanedClass_29_2_isapplicablecore_black_nac_3BB(ruleResult,
											mModel) == null) {
										for (TModule tModule : pg.getModules()) {
											String tModule_location = tModule.getLocation();
											if (tModule_location.equals("${PROXIES}")) {
												if (pattern_OrphanedClass_29_2_isapplicablecore_black_nac_0BB(
														ruleResult, tModule) == null) {
													_result.add(new Object[] { mModelToTypeGraphList, tModule, pg,
															mModelToTypeGraph, mModel, ruleEntryContainer,
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
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_29_3_solveCSP_bindingFBBBBBBB(OrphanedClass _this,
			IsApplicableMatch isApplicableMatch, TModule tModule, TypeGraph pg, Model mModel,
			ModelToTypeGraph mModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, tModule, pg, mModel,
				mModelToTypeGraph, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, tModule, pg, mModel, mModelToTypeGraph, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClass_29_3_solveCSP_bindingAndBlackFBBBBBBB(OrphanedClass _this,
			IsApplicableMatch isApplicableMatch, TModule tModule, TypeGraph pg, Model mModel,
			ModelToTypeGraph mModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_OrphanedClass_29_3_solveCSP_binding = pattern_OrphanedClass_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, tModule, pg, mModel, mModelToTypeGraph, ruleResult);
		if (result_pattern_OrphanedClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_OrphanedClass_29_3_solveCSP_black = pattern_OrphanedClass_29_3_solveCSP_blackB(csp);
			if (result_pattern_OrphanedClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, tModule, pg, mModel, mModelToTypeGraph,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClass_29_4_checkCSP_expressionFBB(OrphanedClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClass_29_5_checknacs_blackBBBB(TModule tModule, TypeGraph pg,
			Model mModel, ModelToTypeGraph mModelToTypeGraph) {
		String tModule_location = tModule.getLocation();
		if (tModule_location.equals("${PROXIES}")) {
			return new Object[] { tModule, pg, mModel, mModelToTypeGraph };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_29_6_perform_blackBBBBB(TModule tModule, TypeGraph pg,
			Model mModel, ModelToTypeGraph mModelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		String tModule_location = tModule.getLocation();
		if (tModule_location.equals("${PROXIES}")) {
			return new Object[] { tModule, pg, mModel, mModelToTypeGraph, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClass_29_6_perform_greenBFFFBBFBB(TModule tModule, TypeGraph pg,
			Model mModel, ModelgeneratorRuleResult ruleResult, CSP csp) {
		TClass tType = BasicFactory.eINSTANCE.createTClass();
		ASTNodeToTAnnotatable mAnnotatableToTAnnotatable = PmFactory.eINSTANCE.createASTNodeToTAnnotatable();
		TypeToTAbstractType mTypeToTType = PmFactory.eINSTANCE.createTypeToTAbstractType();
		MClass mType = ModiscoFactory.eINSTANCE.createMClass();
		Object _localVariable_0 = csp.getValue("tType", "tName");
		Object _localVariable_1 = csp.getValue("mType", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		pg.getAllTypes().add(tType);
		tModule.getContains().add(tType);
		ruleResult.getTargetObjects().add(tType);
		mAnnotatableToTAnnotatable.setTarget(tType);
		ruleResult.getCorrObjects().add(mAnnotatableToTAnnotatable);
		mTypeToTType.setTarget(tType);
		ruleResult.getCorrObjects().add(mTypeToTType);
		mModel.getOrphanTypes().add(mType);
		mAnnotatableToTAnnotatable.setSource(mType);
		mTypeToTType.setSource(mType);
		ruleResult.getSourceObjects().add(mType);
		String tType_tName_prime = (String) _localVariable_0;
		String mType_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		tType.setTName(tType_tName_prime);
		mType.setName(mType_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { tModule, tType, mAnnotatableToTAnnotatable, mTypeToTType, pg, mModel, mType, ruleResult,
				csp };
	}

	public static final ModelgeneratorRuleResult pattern_OrphanedClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //OrphanedClassImpl
