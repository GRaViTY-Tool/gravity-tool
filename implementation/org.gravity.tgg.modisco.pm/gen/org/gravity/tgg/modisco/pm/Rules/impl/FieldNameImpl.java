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

import org.gravity.modisco.MFieldName;
import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.pm.MFieldNameToTField;
import org.gravity.tgg.modisco.pm.ModelToTypeGraph;
import org.gravity.tgg.modisco.pm.PmFactory;

import org.gravity.tgg.modisco.pm.Rules.FieldName;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.typegraph.basic.BasicFactory;
import org.gravity.typegraph.basic.TField;
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
 * An implementation of the model object '<em><b>Field Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FieldNameImpl extends AbstractRuleImpl implements FieldName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getFieldName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MFieldName mFieldName, MGravityModel model) {

		Object[] result1_black = FieldNameImpl.pattern_FieldName_0_1_initialbindings_blackBBBB(this, match, mFieldName,
				model);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", " + "[model] = " + model + ".");
		}

		Object[] result2_bindingAndBlack = FieldNameImpl.pattern_FieldName_0_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, mFieldName, model);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mFieldName] = " + mFieldName + ", " + "[model] = " + model + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldNameImpl.pattern_FieldName_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldNameImpl.pattern_FieldName_0_4_collectelementstobetranslated_blackBBB(match,
					mFieldName, model);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mFieldName] = " + mFieldName + ", " + "[model] = " + model + ".");
			}
			FieldNameImpl.pattern_FieldName_0_4_collectelementstobetranslated_greenBBBF(match, mFieldName, model);
			//nothing EMoflonEdge model__mFieldName____mFieldNames = (EMoflonEdge) result4_green[3];

			Object[] result5_black = FieldNameImpl.pattern_FieldName_0_5_collectcontextelements_blackBBB(match,
					mFieldName, model);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mFieldName] = " + mFieldName + ", " + "[model] = " + model + ".");
			}
			FieldNameImpl.pattern_FieldName_0_5_collectcontextelements_greenBB(match, model);

			// 
			FieldNameImpl.pattern_FieldName_0_6_registerobjectstomatch_expressionBBBB(this, match, mFieldName, model);
			return FieldNameImpl.pattern_FieldName_0_7_expressionF();
		} else {
			return FieldNameImpl.pattern_FieldName_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MFieldName mFieldName = (MFieldName) result1_bindingAndBlack[0];
		MGravityModel model = (MGravityModel) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_1_1_performtransformation_greenFBBFB(mFieldName,
				typeGraph, csp);
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_green[0];
		TField tField = (TField) result1_green[3];

		Object[] result2_black = FieldNameImpl.pattern_FieldName_1_2_collecttranslatedelements_blackBBB(
				eFieldDeclarationToTField, mFieldName, tField);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eFieldDeclarationToTField] = "
					+ eFieldDeclarationToTField + ", " + "[mFieldName] = " + mFieldName + ", " + "[tField] = " + tField
					+ ".");
		}
		Object[] result2_green = FieldNameImpl.pattern_FieldName_1_2_collecttranslatedelements_greenFBBB(
				eFieldDeclarationToTField, mFieldName, tField);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldNameImpl.pattern_FieldName_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				eFieldDeclarationToTField, mFieldName, model, typeGraph, modelToTypeGraph, tField);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[mFieldName] = "
					+ mFieldName + ", " + "[model] = " + model + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[modelToTypeGraph] = " + modelToTypeGraph + ", " + "[tField] = " + tField + ".");
		}
		FieldNameImpl.pattern_FieldName_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, eFieldDeclarationToTField,
				mFieldName, model, typeGraph, tField);
		//nothing EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge model__mFieldName____mFieldNames = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge typeGraph__tField____fields = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tField__typeGraph____model = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		FieldNameImpl.pattern_FieldName_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				eFieldDeclarationToTField, mFieldName, model, typeGraph, modelToTypeGraph, tField);
		return FieldNameImpl.pattern_FieldName_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldNameImpl.pattern_FieldName_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MFieldName mFieldName = (MFieldName) result2_binding[0];
		MGravityModel model = (MGravityModel) result2_binding[1];
		for (Object[] result2_black : FieldNameImpl.pattern_FieldName_2_2_corematch_blackBBFFB(mFieldName, model,
				match)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result2_black[3];
			// ForEach 
			for (Object[] result3_black : FieldNameImpl.pattern_FieldName_2_3_findcontext_blackBBBB(mFieldName, model,
					typeGraph, modelToTypeGraph)) {
				Object[] result3_green = FieldNameImpl.pattern_FieldName_2_3_findcontext_greenBBBBFFFF(mFieldName,
						model, typeGraph, modelToTypeGraph);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge model__mFieldName____mFieldNames = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge modelToTypeGraph__model____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge modelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = FieldNameImpl.pattern_FieldName_2_4_solveCSP_bindingAndBlackFBBBBBB(
						this, isApplicableMatch, mFieldName, model, typeGraph, modelToTypeGraph);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mFieldName] = " + mFieldName
							+ ", " + "[model] = " + model + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[modelToTypeGraph] = " + modelToTypeGraph + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldNameImpl.pattern_FieldName_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldNameImpl
							.pattern_FieldName_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldNameImpl.pattern_FieldName_2_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldNameImpl.pattern_FieldName_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MFieldName mFieldName, MGravityModel model) {
		match.registerObject("mFieldName", mFieldName);
		match.registerObject("model", model);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MFieldName mFieldName, MGravityModel model) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName.mName", true, csp);
		var_mFieldName_mName.setValue(mFieldName.getMName());
		var_mFieldName_mName.setType("String");

		// Create unbound variables
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField.tName", csp);
		var_tField_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mFieldName_mName, var_tField_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mFieldName", mFieldName);
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("modelToTypeGraph", modelToTypeGraph);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eFieldDeclarationToTField, EObject mFieldName,
			EObject model, EObject typeGraph, EObject modelToTypeGraph, EObject tField) {
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("modelToTypeGraph", modelToTypeGraph);
		ruleresult.registerObject("tField", tField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mFieldName").eClass())
				.equals("modisco.MFieldName.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph typeGraph, TField tField) {

		Object[] result1_black = FieldNameImpl.pattern_FieldName_10_1_initialbindings_blackBBBB(this, match, typeGraph,
				tField);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", " + "[tField] = " + tField + ".");
		}

		Object[] result2_bindingAndBlack = FieldNameImpl.pattern_FieldName_10_2_SolveCSP_bindingAndBlackFBBBB(this,
				match, typeGraph, tField);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeGraph] = " + typeGraph + ", " + "[tField] = " + tField + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (FieldNameImpl.pattern_FieldName_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = FieldNameImpl.pattern_FieldName_10_4_collectelementstobetranslated_blackBBB(match,
					typeGraph, tField);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tField] = " + tField + ".");
			}
			FieldNameImpl.pattern_FieldName_10_4_collectelementstobetranslated_greenBBBFF(match, typeGraph, tField);
			//nothing EMoflonEdge typeGraph__tField____fields = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tField__typeGraph____model = (EMoflonEdge) result4_green[4];

			Object[] result5_black = FieldNameImpl.pattern_FieldName_10_5_collectcontextelements_blackBBB(match,
					typeGraph, tField);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tField] = " + tField + ".");
			}
			FieldNameImpl.pattern_FieldName_10_5_collectcontextelements_greenBB(match, typeGraph);

			// 
			FieldNameImpl.pattern_FieldName_10_6_registerobjectstomatch_expressionBBBB(this, match, typeGraph, tField);
			return FieldNameImpl.pattern_FieldName_10_7_expressionF();
		} else {
			return FieldNameImpl.pattern_FieldName_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MGravityModel model = (MGravityModel) result1_bindingAndBlack[0];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[1];
		ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[2];
		TField tField = (TField) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_11_1_performtransformation_greenFFBBB(model, tField,
				csp);
		MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result1_green[0];
		MFieldName mFieldName = (MFieldName) result1_green[1];

		Object[] result2_black = FieldNameImpl.pattern_FieldName_11_2_collecttranslatedelements_blackBBB(
				eFieldDeclarationToTField, mFieldName, tField);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eFieldDeclarationToTField] = "
					+ eFieldDeclarationToTField + ", " + "[mFieldName] = " + mFieldName + ", " + "[tField] = " + tField
					+ ".");
		}
		Object[] result2_green = FieldNameImpl.pattern_FieldName_11_2_collecttranslatedelements_greenFBBB(
				eFieldDeclarationToTField, mFieldName, tField);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = FieldNameImpl.pattern_FieldName_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult,
				eFieldDeclarationToTField, mFieldName, model, typeGraph, modelToTypeGraph, tField);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eFieldDeclarationToTField] = " + eFieldDeclarationToTField + ", " + "[mFieldName] = "
					+ mFieldName + ", " + "[model] = " + model + ", " + "[typeGraph] = " + typeGraph + ", "
					+ "[modelToTypeGraph] = " + modelToTypeGraph + ", " + "[tField] = " + tField + ".");
		}
		FieldNameImpl.pattern_FieldName_11_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult, eFieldDeclarationToTField,
				mFieldName, model, typeGraph, tField);
		//nothing EMoflonEdge eFieldDeclarationToTField__mFieldName____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge model__mFieldName____mFieldNames = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge typeGraph__tField____fields = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tField__typeGraph____model = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge eFieldDeclarationToTField__tField____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		FieldNameImpl.pattern_FieldName_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				eFieldDeclarationToTField, mFieldName, model, typeGraph, modelToTypeGraph, tField);
		return FieldNameImpl.pattern_FieldName_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = FieldNameImpl.pattern_FieldName_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result2_binding[0];
		TField tField = (TField) result2_binding[1];
		for (Object[] result2_black : FieldNameImpl.pattern_FieldName_12_2_corematch_blackFBFBB(typeGraph, tField,
				match)) {
			MGravityModel model = (MGravityModel) result2_black[0];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result2_black[2];
			// ForEach 
			for (Object[] result3_black : FieldNameImpl.pattern_FieldName_12_3_findcontext_blackBBBB(model, typeGraph,
					modelToTypeGraph, tField)) {
				Object[] result3_green = FieldNameImpl.pattern_FieldName_12_3_findcontext_greenBBBBFFFFF(model,
						typeGraph, modelToTypeGraph, tField);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge modelToTypeGraph__model____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge modelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge typeGraph__tField____fields = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge tField__typeGraph____model = (EMoflonEdge) result3_green[8];

				Object[] result4_bindingAndBlack = FieldNameImpl.pattern_FieldName_12_4_solveCSP_bindingAndBlackFBBBBBB(
						this, isApplicableMatch, model, typeGraph, modelToTypeGraph, tField);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
							+ "[typeGraph] = " + typeGraph + ", " + "[modelToTypeGraph] = " + modelToTypeGraph + ", "
							+ "[tField] = " + tField + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (FieldNameImpl.pattern_FieldName_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = FieldNameImpl
							.pattern_FieldName_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					FieldNameImpl.pattern_FieldName_12_6_addmatchtoruleresult_greenBB(ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return FieldNameImpl.pattern_FieldName_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TypeGraph typeGraph, TField tField) {
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tField", tField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph typeGraph, TField tField) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, TField tField) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField.tName", true, csp);
		var_tField_tName.setValue(tField.getTName());
		var_tField_tName.setType("String");

		// Create unbound variables
		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName.mName", csp);
		var_mFieldName_mName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mFieldName_mName, var_tField_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("modelToTypeGraph", modelToTypeGraph);
		isApplicableMatch.registerObject("tField", tField);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eFieldDeclarationToTField, EObject mFieldName,
			EObject model, EObject typeGraph, EObject modelToTypeGraph, EObject tField) {
		ruleresult.registerObject("eFieldDeclarationToTField", eFieldDeclarationToTField);
		ruleresult.registerObject("mFieldName", mFieldName);
		ruleresult.registerObject("model", model);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("modelToTypeGraph", modelToTypeGraph);
		ruleresult.registerObject("tField", tField);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("tField").eClass()).equals("basic.TField.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_1(EMoflonEdge _edge_fields) {

		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldNameImpl
				.pattern_FieldName_20_2_testcorematchandDECs_blackFFB(_edge_fields)) {
			TypeGraph typeGraph = (TypeGraph) result2_black[0];
			TField tField = (TField) result2_black[1];
			Object[] result2_green = FieldNameImpl.pattern_FieldName_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldNameImpl.pattern_FieldName_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, typeGraph, tField)) {
				// 
				if (FieldNameImpl.pattern_FieldName_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = FieldNameImpl.pattern_FieldName_20_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldNameImpl.pattern_FieldName_20_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldNameImpl.pattern_FieldName_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(EMoflonEdge _edge_mFieldNames) {

		Object[] result1_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = FieldNameImpl.pattern_FieldName_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : FieldNameImpl
				.pattern_FieldName_21_2_testcorematchandDECs_blackFFB(_edge_mFieldNames)) {
			MFieldName mFieldName = (MFieldName) result2_black[0];
			MGravityModel model = (MGravityModel) result2_black[1];
			Object[] result2_green = FieldNameImpl.pattern_FieldName_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (FieldNameImpl.pattern_FieldName_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
					match, mFieldName, model)) {
				// 
				if (FieldNameImpl.pattern_FieldName_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
						this, match)) {

					Object[] result5_black = FieldNameImpl.pattern_FieldName_21_5_Addmatchtoruleresult_blackBBBB(match,
							__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					FieldNameImpl.pattern_FieldName_21_5_Addmatchtoruleresult_greenBBBB(match, __performOperation,
							__result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return FieldNameImpl.pattern_FieldName_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("FieldName");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName", true, csp);
		var_mFieldName_mName.setValue(__helper.getValue("mFieldName", "mName"));
		var_mFieldName_mName.setType("String");

		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField", true, csp);
		var_tField_tName.setValue(__helper.getValue("tField", "tName"));
		var_tField_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("FieldName");
		eq0.solve(var_mFieldName_mName, var_tField_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_tField_tName.setBound(false);
			eq0.solve(var_mFieldName_mName, var_tField_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("tField", "tName", var_tField_tName.getValue());
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
		ruleResult.setRule("FieldName");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName", true, csp);
		var_mFieldName_mName.setValue(__helper.getValue("mFieldName", "mName"));
		var_mFieldName_mName.setType("String");

		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField", true, csp);
		var_tField_tName.setValue(__helper.getValue("tField", "tName"));
		var_tField_tName.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("FieldName");
		eq0.solve(var_mFieldName_mName, var_tField_tName);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_mFieldName_mName.setBound(false);
			eq0.solve(var_mFieldName_mName, var_tField_tName);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("mFieldName", "mName", var_mFieldName_mName.getValue());
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

		Object[] result1_black = FieldNameImpl.pattern_FieldName_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldNameImpl.pattern_FieldName_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = FieldNameImpl
				.pattern_FieldName_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MFieldName mFieldName = (MFieldName) result2_bindingAndBlack[0];
		MGravityModel model = (MGravityModel) result2_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[2];
		TField tField = (TField) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = FieldNameImpl.pattern_FieldName_24_3_solvecsp_bindingAndBlackFBBBBBBB(this,
				mFieldName, model, typeGraph, tField, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mFieldName] = " + mFieldName + ", " + "[model] = " + model + ", " + "[typeGraph] = " + typeGraph
					+ ", " + "[tField] = " + tField + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (FieldNameImpl.pattern_FieldName_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : FieldNameImpl.pattern_FieldName_24_5_matchcorrcontext_blackBBFBB(model,
					typeGraph, sourceMatch, targetMatch)) {
				ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result5_black[2];
				Object[] result5_green = FieldNameImpl
						.pattern_FieldName_24_5_matchcorrcontext_greenBBBF(modelToTypeGraph, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = FieldNameImpl.pattern_FieldName_24_6_createcorrespondence_blackBBBBB(
						mFieldName, model, typeGraph, tField, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mFieldName] = "
							+ mFieldName + ", " + "[model] = " + model + ", " + "[typeGraph] = " + typeGraph + ", "
							+ "[tField] = " + tField + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldNameImpl.pattern_FieldName_24_6_createcorrespondence_greenFBBB(mFieldName, tField, ccMatch);
				//nothing MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result6_green[0];

				Object[] result7_black = FieldNameImpl.pattern_FieldName_24_7_addtoreturnedresult_blackBB(result,
						ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				FieldNameImpl.pattern_FieldName_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return FieldNameImpl.pattern_FieldName_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MFieldName mFieldName, MGravityModel model, TypeGraph typeGraph, TField tField,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName.mName", true, csp);
		var_mFieldName_mName.setValue(mFieldName.getMName());
		var_mFieldName_mName.setType("String");
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField.tName", true, csp);
		var_tField_tName.setValue(tField.getTName());
		var_tField_tName.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mFieldName_mName, var_tField_tName);
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
	public boolean checkDEC_FWD(MFieldName mFieldName, MGravityModel model) {// 
		Object[] result1_black = FieldNameImpl.pattern_FieldName_27_1_matchtggpattern_blackBB(mFieldName, model);
		if (result1_black != null) {
			return FieldNameImpl.pattern_FieldName_27_2_expressionF();
		} else {
			return FieldNameImpl.pattern_FieldName_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph typeGraph, TField tField) {// 
		Object[] result1_black = FieldNameImpl.pattern_FieldName_28_1_matchtggpattern_blackBB(typeGraph, tField);
		if (result1_black != null) {
			return FieldNameImpl.pattern_FieldName_28_2_expressionF();
		} else {
			return FieldNameImpl.pattern_FieldName_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ModelToTypeGraph modelToTypeGraphParameter) {

		Object[] result1_black = FieldNameImpl.pattern_FieldName_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = FieldNameImpl.pattern_FieldName_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : FieldNameImpl
				.pattern_FieldName_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList modelToTypeGraphList = (RuleEntryList) result2_black[0];
			MGravityModel model = (MGravityModel) result2_black[1];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result2_black[2];
			TypeGraph typeGraph = (TypeGraph) result2_black[3];

			Object[] result3_bindingAndBlack = FieldNameImpl.pattern_FieldName_29_3_solveCSP_bindingAndBlackFBBBBBB(
					this, isApplicableMatch, model, typeGraph, modelToTypeGraph, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[model] = " + model + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[modelToTypeGraph] = " + modelToTypeGraph + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (FieldNameImpl.pattern_FieldName_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = FieldNameImpl.pattern_FieldName_29_5_checknacs_blackBBB(model, typeGraph,
						modelToTypeGraph);
				if (result5_black != null) {

					Object[] result6_black = FieldNameImpl.pattern_FieldName_29_6_perform_blackBBBB(model, typeGraph,
							modelToTypeGraph, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[model] = " + model
								+ ", " + "[typeGraph] = " + typeGraph + ", " + "[modelToTypeGraph] = "
								+ modelToTypeGraph + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					FieldNameImpl.pattern_FieldName_29_6_perform_greenFFBBFBB(model, typeGraph, ruleResult, csp);
					//nothing MFieldNameToTField eFieldDeclarationToTField = (MFieldNameToTField) result6_green[0];
					//nothing MFieldName mFieldName = (MFieldName) result6_green[1];
					//nothing TField tField = (TField) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return FieldNameImpl.pattern_FieldName_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_mFieldName_mName = CSPFactoryHelper.eINSTANCE.createVariable("mFieldName.mName", csp);
		var_mFieldName_mName.setType("String");
		Variable var_tField_tName = CSPFactoryHelper.eINSTANCE.createVariable("tField.tName", csp);
		var_tField_tName.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_mFieldName_mName, var_tField_tName);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("model", model);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("modelToTypeGraph", modelToTypeGraph);
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
			case RulesPackage.FIELD_NAME___IS_APPROPRIATE_FWD__MATCH_MFIELDNAME_MGRAVITYMODEL:
				return isAppropriate_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
						(MGravityModel) arguments.get(2));
			case RulesPackage.FIELD_NAME___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.FIELD_NAME___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.FIELD_NAME___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MFIELDNAME_MGRAVITYMODEL:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
						(MGravityModel) arguments.get(2));
				return null;
			case RulesPackage.FIELD_NAME___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MFIELDNAME_MGRAVITYMODEL:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MFieldName) arguments.get(1),
						(MGravityModel) arguments.get(2));
			case RulesPackage.FIELD_NAME___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.FIELD_NAME___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MFIELDNAME_MGRAVITYMODEL_TYPEGRAPH_MODELTOTYPEGRAPH:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MFieldName) arguments.get(1),
						(MGravityModel) arguments.get(2), (TypeGraph) arguments.get(3),
						(ModelToTypeGraph) arguments.get(4));
			case RulesPackage.FIELD_NAME___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.FIELD_NAME___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.FIELD_NAME___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.FIELD_NAME___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TFIELD:
				return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
						(TField) arguments.get(2));
			case RulesPackage.FIELD_NAME___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.FIELD_NAME___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.FIELD_NAME___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TFIELD:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
						(TField) arguments.get(2));
				return null;
			case RulesPackage.FIELD_NAME___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TFIELD:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
						(TField) arguments.get(2));
			case RulesPackage.FIELD_NAME___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.FIELD_NAME___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_TYPEGRAPH_MODELTOTYPEGRAPH_TFIELD:
				return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1),
						(TypeGraph) arguments.get(2), (ModelToTypeGraph) arguments.get(3), (TField) arguments.get(4));
			case RulesPackage.FIELD_NAME___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
				return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.FIELD_NAME___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.FIELD_NAME___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.FIELD_NAME___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE:
				return isAppropriate_BWD_EMoflonEdge_1((EMoflonEdge) arguments.get(0));
			case RulesPackage.FIELD_NAME___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
			case RulesPackage.FIELD_NAME___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.FIELD_NAME___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.FIELD_NAME___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.FIELD_NAME___IS_APPLICABLE_SOLVE_CSP_CC__MFIELDNAME_MGRAVITYMODEL_TYPEGRAPH_TFIELD_MATCH_MATCH:
				return isApplicable_solveCsp_CC((MFieldName) arguments.get(0), (MGravityModel) arguments.get(1),
						(TypeGraph) arguments.get(2), (TField) arguments.get(3), (Match) arguments.get(4),
						(Match) arguments.get(5));
			case RulesPackage.FIELD_NAME___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.FIELD_NAME___CHECK_DEC_FWD__MFIELDNAME_MGRAVITYMODEL:
				return checkDEC_FWD((MFieldName) arguments.get(0), (MGravityModel) arguments.get(1));
			case RulesPackage.FIELD_NAME___CHECK_DEC_BWD__TYPEGRAPH_TFIELD:
				return checkDEC_BWD((TypeGraph) arguments.get(0), (TField) arguments.get(1));
			case RulesPackage.FIELD_NAME___GENERATE_MODEL__RULEENTRYCONTAINER_MODELTOTYPEGRAPH:
				return generateModel((RuleEntryContainer) arguments.get(0), (ModelToTypeGraph) arguments.get(1));
			case RulesPackage.FIELD_NAME___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MGRAVITYMODEL_TYPEGRAPH_MODELTOTYPEGRAPH_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(MGravityModel) arguments.get(1), (TypeGraph) arguments.get(2),
						(ModelToTypeGraph) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
			case RulesPackage.FIELD_NAME___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_FieldName_0_1_initialbindings_blackBBBB(FieldName _this, Match match,
			MFieldName mFieldName, MGravityModel model) {
		return new Object[] { _this, match, mFieldName, model };
	}

	public static final Object[] pattern_FieldName_0_2_SolveCSP_bindingFBBBB(FieldName _this, Match match,
			MFieldName mFieldName, MGravityModel model) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mFieldName, model);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mFieldName, model };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_0_2_SolveCSP_bindingAndBlackFBBBB(FieldName _this, Match match,
			MFieldName mFieldName, MGravityModel model) {
		Object[] result_pattern_FieldName_0_2_SolveCSP_binding = pattern_FieldName_0_2_SolveCSP_bindingFBBBB(_this,
				match, mFieldName, model);
		if (result_pattern_FieldName_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_0_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldName_0_2_SolveCSP_black = pattern_FieldName_0_2_SolveCSP_blackB(csp);
			if (result_pattern_FieldName_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mFieldName, model };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_0_3_CheckCSP_expressionFBB(FieldName _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_0_4_collectelementstobetranslated_blackBBB(Match match,
			MFieldName mFieldName, MGravityModel model) {
		return new Object[] { match, mFieldName, model };
	}

	public static final Object[] pattern_FieldName_0_4_collectelementstobetranslated_greenBBBF(Match match,
			MFieldName mFieldName, MGravityModel model) {
		EMoflonEdge model__mFieldName____mFieldNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mFieldName);
		String model__mFieldName____mFieldNames_name_prime = "mFieldNames";
		model__mFieldName____mFieldNames.setSrc(model);
		model__mFieldName____mFieldNames.setTrg(mFieldName);
		match.getToBeTranslatedEdges().add(model__mFieldName____mFieldNames);
		model__mFieldName____mFieldNames.setName(model__mFieldName____mFieldNames_name_prime);
		return new Object[] { match, mFieldName, model, model__mFieldName____mFieldNames };
	}

	public static final Object[] pattern_FieldName_0_5_collectcontextelements_blackBBB(Match match,
			MFieldName mFieldName, MGravityModel model) {
		return new Object[] { match, mFieldName, model };
	}

	public static final Object[] pattern_FieldName_0_5_collectcontextelements_greenBB(Match match,
			MGravityModel model) {
		match.getContextNodes().add(model);
		return new Object[] { match, model };
	}

	public static final void pattern_FieldName_0_6_registerobjectstomatch_expressionBBBB(FieldName _this, Match match,
			MFieldName mFieldName, MGravityModel model) {
		_this.registerObjectsToMatch_FWD(match, mFieldName, model);

	}

	public static final boolean pattern_FieldName_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldName_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldName_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mFieldName");
		EObject _localVariable_1 = isApplicableMatch.getObject("model");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("modelToTypeGraph");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpModelToTypeGraph = _localVariable_3;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpModel instanceof MGravityModel) {
				MGravityModel model = (MGravityModel) tmpModel;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpModelToTypeGraph instanceof ModelToTypeGraph) {
						ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) tmpModelToTypeGraph;
						return new Object[] { mFieldName, model, typeGraph, modelToTypeGraph, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_1_1_performtransformation_blackBBBBFBB(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph, FieldName _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mFieldName, model, typeGraph, modelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_1_1_performtransformation_bindingAndBlackFFFFFBB(FieldName _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldName_1_1_performtransformation_binding = pattern_FieldName_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldName_1_1_performtransformation_binding != null) {
			MFieldName mFieldName = (MFieldName) result_pattern_FieldName_1_1_performtransformation_binding[0];
			MGravityModel model = (MGravityModel) result_pattern_FieldName_1_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_FieldName_1_1_performtransformation_binding[2];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result_pattern_FieldName_1_1_performtransformation_binding[3];

			Object[] result_pattern_FieldName_1_1_performtransformation_black = pattern_FieldName_1_1_performtransformation_blackBBBBFBB(
					mFieldName, model, typeGraph, modelToTypeGraph, _this, isApplicableMatch);
			if (result_pattern_FieldName_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldName_1_1_performtransformation_black[4];

				return new Object[] { mFieldName, model, typeGraph, modelToTypeGraph, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_1_1_performtransformation_greenFBBFB(MFieldName mFieldName,
			TypeGraph typeGraph, CSP csp) {
		MFieldNameToTField eFieldDeclarationToTField = PmFactory.eINSTANCE.createMFieldNameToTField();
		TField tField = BasicFactory.eINSTANCE.createTField();
		Object _localVariable_0 = csp.getValue("tField", "tName");
		eFieldDeclarationToTField.setSource(mFieldName);
		typeGraph.getFields().add(tField);
		eFieldDeclarationToTField.setTarget(tField);
		String tField_tName_prime = (String) _localVariable_0;
		tField.setTName(tField_tName_prime);
		return new Object[] { eFieldDeclarationToTField, mFieldName, typeGraph, tField, csp };
	}

	public static final Object[] pattern_FieldName_1_2_collecttranslatedelements_blackBBB(
			MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName, TField tField) {
		return new Object[] { eFieldDeclarationToTField, mFieldName, tField };
	}

	public static final Object[] pattern_FieldName_1_2_collecttranslatedelements_greenFBBB(
			MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName, TField tField) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eFieldDeclarationToTField);
		ruleresult.getTranslatedElements().add(mFieldName);
		ruleresult.getCreatedElements().add(tField);
		return new Object[] { ruleresult, eFieldDeclarationToTField, mFieldName, tField };
	}

	public static final Object[] pattern_FieldName_1_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject eFieldDeclarationToTField, EObject mFieldName, EObject model, EObject typeGraph,
			EObject modelToTypeGraph, EObject tField) {
		if (!eFieldDeclarationToTField.equals(mFieldName)) {
			if (!eFieldDeclarationToTField.equals(model)) {
				if (!eFieldDeclarationToTField.equals(typeGraph)) {
					if (!eFieldDeclarationToTField.equals(modelToTypeGraph)) {
						if (!eFieldDeclarationToTField.equals(tField)) {
							if (!mFieldName.equals(model)) {
								if (!mFieldName.equals(typeGraph)) {
									if (!mFieldName.equals(modelToTypeGraph)) {
										if (!mFieldName.equals(tField)) {
											if (!model.equals(typeGraph)) {
												if (!model.equals(modelToTypeGraph)) {
													if (!model.equals(tField)) {
														if (!modelToTypeGraph.equals(typeGraph)) {
															if (!modelToTypeGraph.equals(tField)) {
																if (!tField.equals(typeGraph)) {
																	return new Object[] { ruleresult,
																			eFieldDeclarationToTField, mFieldName,
																			model, typeGraph, modelToTypeGraph,
																			tField };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FieldName_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject eFieldDeclarationToTField, EObject mFieldName, EObject model,
			EObject typeGraph, EObject tField) {
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__mFieldName____mFieldNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tField____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldName";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String model__mFieldName____mFieldNames_name_prime = "mFieldNames";
		String typeGraph__tField____fields_name_prime = "fields";
		String tField__typeGraph____model_name_prime = "model";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__mFieldName____source);
		model__mFieldName____mFieldNames.setSrc(model);
		model__mFieldName____mFieldNames.setTrg(mFieldName);
		ruleresult.getTranslatedEdges().add(model__mFieldName____mFieldNames);
		typeGraph__tField____fields.setSrc(typeGraph);
		typeGraph__tField____fields.setTrg(tField);
		ruleresult.getCreatedEdges().add(typeGraph__tField____fields);
		tField__typeGraph____model.setSrc(tField);
		tField__typeGraph____model.setTrg(typeGraph);
		ruleresult.getCreatedEdges().add(tField__typeGraph____model);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__tField____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		model__mFieldName____mFieldNames.setName(model__mFieldName____mFieldNames_name_prime);
		typeGraph__tField____fields.setName(typeGraph__tField____fields_name_prime);
		tField__typeGraph____model.setName(tField__typeGraph____model_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		return new Object[] { ruleresult, eFieldDeclarationToTField, mFieldName, model, typeGraph, tField,
				eFieldDeclarationToTField__mFieldName____source, model__mFieldName____mFieldNames,
				typeGraph__tField____fields, tField__typeGraph____model, eFieldDeclarationToTField__tField____target };
	}

	public static final void pattern_FieldName_1_5_registerobjects_expressionBBBBBBBB(FieldName _this,
			PerformRuleResult ruleresult, EObject eFieldDeclarationToTField, EObject mFieldName, EObject model,
			EObject typeGraph, EObject modelToTypeGraph, EObject tField) {
		_this.registerObjects_FWD(ruleresult, eFieldDeclarationToTField, mFieldName, model, typeGraph, modelToTypeGraph,
				tField);

	}

	public static final PerformRuleResult pattern_FieldName_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldName_2_1_preparereturnvalue_bindingFB(FieldName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_2_1_preparereturnvalue_blackFBB(EClass eClass, FieldName _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldName_2_1_preparereturnvalue_bindingAndBlackFFB(FieldName _this) {
		Object[] result_pattern_FieldName_2_1_preparereturnvalue_binding = pattern_FieldName_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldName_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldName_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldName_2_1_preparereturnvalue_black = pattern_FieldName_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldName_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldName_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldName";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldName_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mFieldName");
		EObject _localVariable_1 = match.getObject("model");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpModel instanceof MGravityModel) {
				MGravityModel model = (MGravityModel) tmpModel;
				return new Object[] { mFieldName, model, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldName_2_2_corematch_blackBBFFB(MFieldName mFieldName,
			MGravityModel model, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph modelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(model, ModelToTypeGraph.class, "source")) {
			TypeGraph typeGraph = modelToTypeGraph.getTarget();
			if (typeGraph != null) {
				_result.add(new Object[] { mFieldName, model, typeGraph, modelToTypeGraph, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldName_2_3_findcontext_blackBBBB(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (model.getMFieldNames().contains(mFieldName)) {
			if (model.equals(modelToTypeGraph.getSource())) {
				if (typeGraph.equals(modelToTypeGraph.getTarget())) {
					_result.add(new Object[] { mFieldName, model, typeGraph, modelToTypeGraph });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldName_2_3_findcontext_greenBBBBFFFF(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge model__mFieldName____mFieldNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToTypeGraph__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String model__mFieldName____mFieldNames_name_prime = "mFieldNames";
		String modelToTypeGraph__model____source_name_prime = "source";
		String modelToTypeGraph__typeGraph____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mFieldName);
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph);
		model__mFieldName____mFieldNames.setSrc(model);
		model__mFieldName____mFieldNames.setTrg(mFieldName);
		isApplicableMatch.getAllContextElements().add(model__mFieldName____mFieldNames);
		modelToTypeGraph__model____source.setSrc(modelToTypeGraph);
		modelToTypeGraph__model____source.setTrg(model);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph__model____source);
		modelToTypeGraph__typeGraph____target.setSrc(modelToTypeGraph);
		modelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph__typeGraph____target);
		model__mFieldName____mFieldNames.setName(model__mFieldName____mFieldNames_name_prime);
		modelToTypeGraph__model____source.setName(modelToTypeGraph__model____source_name_prime);
		modelToTypeGraph__typeGraph____target.setName(modelToTypeGraph__typeGraph____target_name_prime);
		return new Object[] { mFieldName, model, typeGraph, modelToTypeGraph, isApplicableMatch,
				model__mFieldName____mFieldNames, modelToTypeGraph__model____source,
				modelToTypeGraph__typeGraph____target };
	}

	public static final Object[] pattern_FieldName_2_4_solveCSP_bindingFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mFieldName, model, typeGraph,
				modelToTypeGraph);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mFieldName, model, typeGraph, modelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_2_4_solveCSP_bindingAndBlackFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MFieldName mFieldName, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph) {
		Object[] result_pattern_FieldName_2_4_solveCSP_binding = pattern_FieldName_2_4_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, mFieldName, model, typeGraph, modelToTypeGraph);
		if (result_pattern_FieldName_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_2_4_solveCSP_binding[0];

			Object[] result_pattern_FieldName_2_4_solveCSP_black = pattern_FieldName_2_4_solveCSP_blackB(csp);
			if (result_pattern_FieldName_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mFieldName, model, typeGraph, modelToTypeGraph };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_2_5_checkCSP_expressionFBB(FieldName _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_2_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldName_2_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldName";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldName_2_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldName_10_1_initialbindings_blackBBBB(FieldName _this, Match match,
			TypeGraph typeGraph, TField tField) {
		return new Object[] { _this, match, typeGraph, tField };
	}

	public static final Object[] pattern_FieldName_10_2_SolveCSP_bindingFBBBB(FieldName _this, Match match,
			TypeGraph typeGraph, TField tField) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, typeGraph, tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeGraph, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_10_2_SolveCSP_bindingAndBlackFBBBB(FieldName _this, Match match,
			TypeGraph typeGraph, TField tField) {
		Object[] result_pattern_FieldName_10_2_SolveCSP_binding = pattern_FieldName_10_2_SolveCSP_bindingFBBBB(_this,
				match, typeGraph, tField);
		if (result_pattern_FieldName_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_10_2_SolveCSP_binding[0];

			Object[] result_pattern_FieldName_10_2_SolveCSP_black = pattern_FieldName_10_2_SolveCSP_blackB(csp);
			if (result_pattern_FieldName_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeGraph, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_10_3_CheckCSP_expressionFBB(FieldName _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_10_4_collectelementstobetranslated_blackBBB(Match match,
			TypeGraph typeGraph, TField tField) {
		return new Object[] { match, typeGraph, tField };
	}

	public static final Object[] pattern_FieldName_10_4_collectelementstobetranslated_greenBBBFF(Match match,
			TypeGraph typeGraph, TField tField) {
		EMoflonEdge typeGraph__tField____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(tField);
		String typeGraph__tField____fields_name_prime = "fields";
		String tField__typeGraph____model_name_prime = "model";
		typeGraph__tField____fields.setSrc(typeGraph);
		typeGraph__tField____fields.setTrg(tField);
		match.getToBeTranslatedEdges().add(typeGraph__tField____fields);
		tField__typeGraph____model.setSrc(tField);
		tField__typeGraph____model.setTrg(typeGraph);
		match.getToBeTranslatedEdges().add(tField__typeGraph____model);
		typeGraph__tField____fields.setName(typeGraph__tField____fields_name_prime);
		tField__typeGraph____model.setName(tField__typeGraph____model_name_prime);
		return new Object[] { match, typeGraph, tField, typeGraph__tField____fields, tField__typeGraph____model };
	}

	public static final Object[] pattern_FieldName_10_5_collectcontextelements_blackBBB(Match match,
			TypeGraph typeGraph, TField tField) {
		return new Object[] { match, typeGraph, tField };
	}

	public static final Object[] pattern_FieldName_10_5_collectcontextelements_greenBB(Match match,
			TypeGraph typeGraph) {
		match.getContextNodes().add(typeGraph);
		return new Object[] { match, typeGraph };
	}

	public static final void pattern_FieldName_10_6_registerobjectstomatch_expressionBBBB(FieldName _this, Match match,
			TypeGraph typeGraph, TField tField) {
		_this.registerObjectsToMatch_BWD(match, typeGraph, tField);

	}

	public static final boolean pattern_FieldName_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldName_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldName_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("model");
		EObject _localVariable_1 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("modelToTypeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("tField");
		EObject tmpModel = _localVariable_0;
		EObject tmpTypeGraph = _localVariable_1;
		EObject tmpModelToTypeGraph = _localVariable_2;
		EObject tmpTField = _localVariable_3;
		if (tmpModel instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) tmpModel;
			if (tmpTypeGraph instanceof TypeGraph) {
				TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
				if (tmpModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) tmpModelToTypeGraph;
					if (tmpTField instanceof TField) {
						TField tField = (TField) tmpTField;
						return new Object[] { model, typeGraph, modelToTypeGraph, tField, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_11_1_performtransformation_blackBBBBFBB(MGravityModel model,
			TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph, TField tField, FieldName _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { model, typeGraph, modelToTypeGraph, tField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_11_1_performtransformation_bindingAndBlackFFFFFBB(FieldName _this,
			IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_FieldName_11_1_performtransformation_binding = pattern_FieldName_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_FieldName_11_1_performtransformation_binding != null) {
			MGravityModel model = (MGravityModel) result_pattern_FieldName_11_1_performtransformation_binding[0];
			TypeGraph typeGraph = (TypeGraph) result_pattern_FieldName_11_1_performtransformation_binding[1];
			ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) result_pattern_FieldName_11_1_performtransformation_binding[2];
			TField tField = (TField) result_pattern_FieldName_11_1_performtransformation_binding[3];

			Object[] result_pattern_FieldName_11_1_performtransformation_black = pattern_FieldName_11_1_performtransformation_blackBBBBFBB(
					model, typeGraph, modelToTypeGraph, tField, _this, isApplicableMatch);
			if (result_pattern_FieldName_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_FieldName_11_1_performtransformation_black[4];

				return new Object[] { model, typeGraph, modelToTypeGraph, tField, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_11_1_performtransformation_greenFFBBB(MGravityModel model,
			TField tField, CSP csp) {
		MFieldNameToTField eFieldDeclarationToTField = PmFactory.eINSTANCE.createMFieldNameToTField();
		MFieldName mFieldName = ModiscoFactory.eINSTANCE.createMFieldName();
		Object _localVariable_0 = csp.getValue("mFieldName", "mName");
		eFieldDeclarationToTField.setTarget(tField);
		eFieldDeclarationToTField.setSource(mFieldName);
		model.getMFieldNames().add(mFieldName);
		String mFieldName_mName_prime = (String) _localVariable_0;
		mFieldName.setMName(mFieldName_mName_prime);
		return new Object[] { eFieldDeclarationToTField, mFieldName, model, tField, csp };
	}

	public static final Object[] pattern_FieldName_11_2_collecttranslatedelements_blackBBB(
			MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName, TField tField) {
		return new Object[] { eFieldDeclarationToTField, mFieldName, tField };
	}

	public static final Object[] pattern_FieldName_11_2_collecttranslatedelements_greenFBBB(
			MFieldNameToTField eFieldDeclarationToTField, MFieldName mFieldName, TField tField) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(eFieldDeclarationToTField);
		ruleresult.getCreatedElements().add(mFieldName);
		ruleresult.getTranslatedElements().add(tField);
		return new Object[] { ruleresult, eFieldDeclarationToTField, mFieldName, tField };
	}

	public static final Object[] pattern_FieldName_11_3_bookkeepingforedges_blackBBBBBBB(PerformRuleResult ruleresult,
			EObject eFieldDeclarationToTField, EObject mFieldName, EObject model, EObject typeGraph,
			EObject modelToTypeGraph, EObject tField) {
		if (!eFieldDeclarationToTField.equals(mFieldName)) {
			if (!eFieldDeclarationToTField.equals(model)) {
				if (!eFieldDeclarationToTField.equals(typeGraph)) {
					if (!eFieldDeclarationToTField.equals(modelToTypeGraph)) {
						if (!eFieldDeclarationToTField.equals(tField)) {
							if (!mFieldName.equals(model)) {
								if (!mFieldName.equals(typeGraph)) {
									if (!mFieldName.equals(modelToTypeGraph)) {
										if (!mFieldName.equals(tField)) {
											if (!model.equals(typeGraph)) {
												if (!model.equals(modelToTypeGraph)) {
													if (!model.equals(tField)) {
														if (!modelToTypeGraph.equals(typeGraph)) {
															if (!modelToTypeGraph.equals(tField)) {
																if (!tField.equals(typeGraph)) {
																	return new Object[] { ruleresult,
																			eFieldDeclarationToTField, mFieldName,
																			model, typeGraph, modelToTypeGraph,
																			tField };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_FieldName_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject eFieldDeclarationToTField, EObject mFieldName, EObject model,
			EObject typeGraph, EObject tField) {
		EMoflonEdge eFieldDeclarationToTField__mFieldName____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge model__mFieldName____mFieldNames = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tField____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eFieldDeclarationToTField__tField____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "FieldName";
		String eFieldDeclarationToTField__mFieldName____source_name_prime = "source";
		String model__mFieldName____mFieldNames_name_prime = "mFieldNames";
		String typeGraph__tField____fields_name_prime = "fields";
		String tField__typeGraph____model_name_prime = "model";
		String eFieldDeclarationToTField__tField____target_name_prime = "target";
		eFieldDeclarationToTField__mFieldName____source.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__mFieldName____source.setTrg(mFieldName);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__mFieldName____source);
		model__mFieldName____mFieldNames.setSrc(model);
		model__mFieldName____mFieldNames.setTrg(mFieldName);
		ruleresult.getCreatedEdges().add(model__mFieldName____mFieldNames);
		typeGraph__tField____fields.setSrc(typeGraph);
		typeGraph__tField____fields.setTrg(tField);
		ruleresult.getTranslatedEdges().add(typeGraph__tField____fields);
		tField__typeGraph____model.setSrc(tField);
		tField__typeGraph____model.setTrg(typeGraph);
		ruleresult.getTranslatedEdges().add(tField__typeGraph____model);
		eFieldDeclarationToTField__tField____target.setSrc(eFieldDeclarationToTField);
		eFieldDeclarationToTField__tField____target.setTrg(tField);
		ruleresult.getCreatedEdges().add(eFieldDeclarationToTField__tField____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eFieldDeclarationToTField__mFieldName____source
				.setName(eFieldDeclarationToTField__mFieldName____source_name_prime);
		model__mFieldName____mFieldNames.setName(model__mFieldName____mFieldNames_name_prime);
		typeGraph__tField____fields.setName(typeGraph__tField____fields_name_prime);
		tField__typeGraph____model.setName(tField__typeGraph____model_name_prime);
		eFieldDeclarationToTField__tField____target.setName(eFieldDeclarationToTField__tField____target_name_prime);
		return new Object[] { ruleresult, eFieldDeclarationToTField, mFieldName, model, typeGraph, tField,
				eFieldDeclarationToTField__mFieldName____source, model__mFieldName____mFieldNames,
				typeGraph__tField____fields, tField__typeGraph____model, eFieldDeclarationToTField__tField____target };
	}

	public static final void pattern_FieldName_11_5_registerobjects_expressionBBBBBBBB(FieldName _this,
			PerformRuleResult ruleresult, EObject eFieldDeclarationToTField, EObject mFieldName, EObject model,
			EObject typeGraph, EObject modelToTypeGraph, EObject tField) {
		_this.registerObjects_BWD(ruleresult, eFieldDeclarationToTField, mFieldName, model, typeGraph, modelToTypeGraph,
				tField);

	}

	public static final PerformRuleResult pattern_FieldName_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldName_12_1_preparereturnvalue_bindingFB(FieldName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_12_1_preparereturnvalue_blackFBB(EClass eClass, FieldName _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_FieldName_12_1_preparereturnvalue_bindingAndBlackFFB(FieldName _this) {
		Object[] result_pattern_FieldName_12_1_preparereturnvalue_binding = pattern_FieldName_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldName_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_FieldName_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldName_12_1_preparereturnvalue_black = pattern_FieldName_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_FieldName_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_FieldName_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "FieldName";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_FieldName_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("typeGraph");
		EObject _localVariable_1 = match.getObject("tField");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpTField = _localVariable_1;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				return new Object[] { typeGraph, tField, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldName_12_2_corematch_blackFBFBB(TypeGraph typeGraph,
			TField tField, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ModelToTypeGraph modelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeGraph, ModelToTypeGraph.class, "target")) {
			Model tmpModel = modelToTypeGraph.getSource();
			if (tmpModel instanceof MGravityModel) {
				MGravityModel model = (MGravityModel) tmpModel;
				_result.add(new Object[] { model, typeGraph, modelToTypeGraph, tField, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldName_12_3_findcontext_blackBBBB(MGravityModel model,
			TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph, TField tField) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (model.equals(modelToTypeGraph.getSource())) {
			if (typeGraph.equals(modelToTypeGraph.getTarget())) {
				if (typeGraph.getFields().contains(tField)) {
					_result.add(new Object[] { model, typeGraph, modelToTypeGraph, tField });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldName_12_3_findcontext_greenBBBBFFFFF(MGravityModel model,
			TypeGraph typeGraph, ModelToTypeGraph modelToTypeGraph, TField tField) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge modelToTypeGraph__model____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge modelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tField____fields = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tField__typeGraph____model = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String modelToTypeGraph__model____source_name_prime = "source";
		String modelToTypeGraph__typeGraph____target_name_prime = "target";
		String typeGraph__tField____fields_name_prime = "fields";
		String tField__typeGraph____model_name_prime = "model";
		isApplicableMatch.getAllContextElements().add(model);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(tField);
		modelToTypeGraph__model____source.setSrc(modelToTypeGraph);
		modelToTypeGraph__model____source.setTrg(model);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph__model____source);
		modelToTypeGraph__typeGraph____target.setSrc(modelToTypeGraph);
		modelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(modelToTypeGraph__typeGraph____target);
		typeGraph__tField____fields.setSrc(typeGraph);
		typeGraph__tField____fields.setTrg(tField);
		isApplicableMatch.getAllContextElements().add(typeGraph__tField____fields);
		tField__typeGraph____model.setSrc(tField);
		tField__typeGraph____model.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tField__typeGraph____model);
		modelToTypeGraph__model____source.setName(modelToTypeGraph__model____source_name_prime);
		modelToTypeGraph__typeGraph____target.setName(modelToTypeGraph__typeGraph____target_name_prime);
		typeGraph__tField____fields.setName(typeGraph__tField____fields_name_prime);
		tField__typeGraph____model.setName(tField__typeGraph____model_name_prime);
		return new Object[] { model, typeGraph, modelToTypeGraph, tField, isApplicableMatch,
				modelToTypeGraph__model____source, modelToTypeGraph__typeGraph____target, typeGraph__tField____fields,
				tField__typeGraph____model };
	}

	public static final Object[] pattern_FieldName_12_4_solveCSP_bindingFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, TField tField) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, model, typeGraph, modelToTypeGraph,
				tField);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, typeGraph, modelToTypeGraph, tField };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_12_4_solveCSP_bindingAndBlackFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, TField tField) {
		Object[] result_pattern_FieldName_12_4_solveCSP_binding = pattern_FieldName_12_4_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, model, typeGraph, modelToTypeGraph, tField);
		if (result_pattern_FieldName_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_12_4_solveCSP_binding[0];

			Object[] result_pattern_FieldName_12_4_solveCSP_black = pattern_FieldName_12_4_solveCSP_blackB(csp);
			if (result_pattern_FieldName_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, typeGraph, modelToTypeGraph, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_12_5_checkCSP_expressionFBB(FieldName _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_12_6_addmatchtoruleresult_blackBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_FieldName_12_6_addmatchtoruleresult_greenBB(IsApplicableRuleResult ruleresult,
			IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "FieldName";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldName_12_7_expressionFB(IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_FieldName_20_1_preparereturnvalue_bindingFB(FieldName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_20_1_preparereturnvalue_blackFBBF(EClass __eClass, FieldName _this) {
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

	public static final Object[] pattern_FieldName_20_1_preparereturnvalue_bindingAndBlackFFBF(FieldName _this) {
		Object[] result_pattern_FieldName_20_1_preparereturnvalue_binding = pattern_FieldName_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldName_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldName_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldName_20_1_preparereturnvalue_black = pattern_FieldName_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldName_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldName_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldName_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_FieldName_20_2_testcorematchandDECs_black_nac_0BB(TField tField,
			TypeGraph typeGraph) {
		TypeGraph __DEC_tField_model_217184 = tField.getModel();
		if (__DEC_tField_model_217184 != null) {
			if (!typeGraph.equals(__DEC_tField_model_217184)) {
				return new Object[] { tField, typeGraph };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_FieldName_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_fields) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeGraph = _edge_fields.getSrc();
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			EObject tmpTField = _edge_fields.getTrg();
			if (tmpTField instanceof TField) {
				TField tField = (TField) tmpTField;
				if (typeGraph.getFields().contains(tField)) {
					if (pattern_FieldName_20_2_testcorematchandDECs_black_nac_0BB(tField, typeGraph) == null) {
						_result.add(new Object[] { typeGraph, tField, _edge_fields });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldName_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldName_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldName _this, Match match, TypeGraph typeGraph, TField tField) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, typeGraph, tField);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldName_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldName _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldName_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldName_21_1_preparereturnvalue_bindingFB(FieldName _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_21_1_preparereturnvalue_blackFBBF(EClass __eClass, FieldName _this) {
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

	public static final Object[] pattern_FieldName_21_1_preparereturnvalue_bindingAndBlackFFBF(FieldName _this) {
		Object[] result_pattern_FieldName_21_1_preparereturnvalue_binding = pattern_FieldName_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_FieldName_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_FieldName_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_FieldName_21_1_preparereturnvalue_black = pattern_FieldName_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_FieldName_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_FieldName_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_FieldName_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_FieldName_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_mFieldNames) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpModel = _edge_mFieldNames.getSrc();
		if (tmpModel instanceof MGravityModel) {
			MGravityModel model = (MGravityModel) tmpModel;
			EObject tmpMFieldName = _edge_mFieldNames.getTrg();
			if (tmpMFieldName instanceof MFieldName) {
				MFieldName mFieldName = (MFieldName) tmpMFieldName;
				if (model.getMFieldNames().contains(mFieldName)) {
					_result.add(new Object[] { mFieldName, model, _edge_mFieldNames });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_FieldName_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_FieldName_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			FieldName _this, Match match, MFieldName mFieldName, MGravityModel model) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mFieldName, model);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_FieldName_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			FieldName _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_FieldName_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_FieldName_24_1_prepare_blackB(FieldName _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldName_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_FieldName_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mFieldName");
		EObject _localVariable_1 = sourceMatch.getObject("model");
		EObject _localVariable_2 = targetMatch.getObject("typeGraph");
		EObject _localVariable_3 = targetMatch.getObject("tField");
		EObject tmpMFieldName = _localVariable_0;
		EObject tmpModel = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpTField = _localVariable_3;
		if (tmpMFieldName instanceof MFieldName) {
			MFieldName mFieldName = (MFieldName) tmpMFieldName;
			if (tmpModel instanceof MGravityModel) {
				MGravityModel model = (MGravityModel) tmpModel;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpTField instanceof TField) {
						TField tField = (TField) tmpTField;
						return new Object[] { mFieldName, model, typeGraph, tField, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_24_2_matchsrctrgcontext_blackBBBBBB(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, TField tField, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mFieldName, model, typeGraph, tField, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_FieldName_24_2_matchsrctrgcontext_binding = pattern_FieldName_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_FieldName_24_2_matchsrctrgcontext_binding != null) {
			MFieldName mFieldName = (MFieldName) result_pattern_FieldName_24_2_matchsrctrgcontext_binding[0];
			MGravityModel model = (MGravityModel) result_pattern_FieldName_24_2_matchsrctrgcontext_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_FieldName_24_2_matchsrctrgcontext_binding[2];
			TField tField = (TField) result_pattern_FieldName_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_FieldName_24_2_matchsrctrgcontext_black = pattern_FieldName_24_2_matchsrctrgcontext_blackBBBBBB(
					mFieldName, model, typeGraph, tField, sourceMatch, targetMatch);
			if (result_pattern_FieldName_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mFieldName, model, typeGraph, tField, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_FieldName_24_3_solvecsp_bindingFBBBBBBB(FieldName _this, MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, TField tField, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mFieldName, model, typeGraph, tField, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mFieldName, model, typeGraph, tField, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_24_3_solvecsp_bindingAndBlackFBBBBBBB(FieldName _this,
			MFieldName mFieldName, MGravityModel model, TypeGraph typeGraph, TField tField, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_FieldName_24_3_solvecsp_binding = pattern_FieldName_24_3_solvecsp_bindingFBBBBBBB(_this,
				mFieldName, model, typeGraph, tField, sourceMatch, targetMatch);
		if (result_pattern_FieldName_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_24_3_solvecsp_binding[0];

			Object[] result_pattern_FieldName_24_3_solvecsp_black = pattern_FieldName_24_3_solvecsp_blackB(csp);
			if (result_pattern_FieldName_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mFieldName, model, typeGraph, tField, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_FieldName_24_5_matchcorrcontext_blackBBFBB(MGravityModel model,
			TypeGraph typeGraph, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph modelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(model, ModelToTypeGraph.class, "source")) {
				if (typeGraph.equals(modelToTypeGraph.getTarget())) {
					_result.add(new Object[] { model, typeGraph, modelToTypeGraph, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_FieldName_24_5_matchcorrcontext_greenBBBF(ModelToTypeGraph modelToTypeGraph,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "FieldName";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(modelToTypeGraph);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { modelToTypeGraph, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_FieldName_24_6_createcorrespondence_blackBBBBB(MFieldName mFieldName,
			MGravityModel model, TypeGraph typeGraph, TField tField, CCMatch ccMatch) {
		return new Object[] { mFieldName, model, typeGraph, tField, ccMatch };
	}

	public static final Object[] pattern_FieldName_24_6_createcorrespondence_greenFBBB(MFieldName mFieldName,
			TField tField, CCMatch ccMatch) {
		MFieldNameToTField eFieldDeclarationToTField = PmFactory.eINSTANCE.createMFieldNameToTField();
		eFieldDeclarationToTField.setSource(mFieldName);
		eFieldDeclarationToTField.setTarget(tField);
		ccMatch.getCreateCorr().add(eFieldDeclarationToTField);
		return new Object[] { eFieldDeclarationToTField, mFieldName, tField, ccMatch };
	}

	public static final Object[] pattern_FieldName_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_FieldName_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "FieldName";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_FieldName_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_FieldName_27_1_matchtggpattern_blackBB(MFieldName mFieldName,
			MGravityModel model) {
		if (model.getMFieldNames().contains(mFieldName)) {
			return new Object[] { mFieldName, model };
		}
		return null;
	}

	public static final boolean pattern_FieldName_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldName_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldName_28_1_matchtggpattern_black_nac_0BB(TField tField,
			TypeGraph typeGraph) {
		TypeGraph __DEC_tField_model_275696 = tField.getModel();
		if (__DEC_tField_model_275696 != null) {
			if (!typeGraph.equals(__DEC_tField_model_275696)) {
				return new Object[] { tField, typeGraph };
			}
		}

		return null;
	}

	public static final Object[] pattern_FieldName_28_1_matchtggpattern_blackBB(TypeGraph typeGraph, TField tField) {
		if (typeGraph.getFields().contains(tField)) {
			if (pattern_FieldName_28_1_matchtggpattern_black_nac_0BB(tField, typeGraph) == null) {
				return new Object[] { typeGraph, tField };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_FieldName_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_FieldName_29_1_createresult_blackB(FieldName _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_FieldName_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_FieldName_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, MGravityModel model) {
		if (ruleResult.getSourceObjects().contains(model)) {
			return new Object[] { ruleResult, model };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph modelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(modelToTypeGraph)) {
			return new Object[] { ruleResult, modelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_FieldName_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList modelToTypeGraphList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpModelToTypeGraph : modelToTypeGraphList.getEntryObjects()) {
				if (tmpModelToTypeGraph instanceof ModelToTypeGraph) {
					ModelToTypeGraph modelToTypeGraph = (ModelToTypeGraph) tmpModelToTypeGraph;
					Model tmpModel = modelToTypeGraph.getSource();
					if (tmpModel instanceof MGravityModel) {
						MGravityModel model = (MGravityModel) tmpModel;
						TypeGraph typeGraph = modelToTypeGraph.getTarget();
						if (typeGraph != null) {
							if (pattern_FieldName_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									modelToTypeGraph) == null) {
								if (pattern_FieldName_29_2_isapplicablecore_black_nac_0BB(ruleResult, model) == null) {
									if (pattern_FieldName_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											typeGraph) == null) {
										_result.add(new Object[] { modelToTypeGraphList, model, modelToTypeGraph,
												typeGraph, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_FieldName_29_3_solveCSP_bindingFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, model, typeGraph, modelToTypeGraph,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, model, typeGraph, modelToTypeGraph, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_FieldName_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_FieldName_29_3_solveCSP_bindingAndBlackFBBBBBB(FieldName _this,
			IsApplicableMatch isApplicableMatch, MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_FieldName_29_3_solveCSP_binding = pattern_FieldName_29_3_solveCSP_bindingFBBBBBB(_this,
				isApplicableMatch, model, typeGraph, modelToTypeGraph, ruleResult);
		if (result_pattern_FieldName_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_FieldName_29_3_solveCSP_binding[0];

			Object[] result_pattern_FieldName_29_3_solveCSP_black = pattern_FieldName_29_3_solveCSP_blackB(csp);
			if (result_pattern_FieldName_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, model, typeGraph, modelToTypeGraph, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_FieldName_29_4_checkCSP_expressionFBB(FieldName _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_FieldName_29_5_checknacs_blackBBB(MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph) {
		return new Object[] { model, typeGraph, modelToTypeGraph };
	}

	public static final Object[] pattern_FieldName_29_6_perform_blackBBBB(MGravityModel model, TypeGraph typeGraph,
			ModelToTypeGraph modelToTypeGraph, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { model, typeGraph, modelToTypeGraph, ruleResult };
	}

	public static final Object[] pattern_FieldName_29_6_perform_greenFFBBFBB(MGravityModel model, TypeGraph typeGraph,
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		MFieldNameToTField eFieldDeclarationToTField = PmFactory.eINSTANCE.createMFieldNameToTField();
		MFieldName mFieldName = ModiscoFactory.eINSTANCE.createMFieldName();
		TField tField = BasicFactory.eINSTANCE.createTField();
		Object _localVariable_0 = csp.getValue("mFieldName", "mName");
		Object _localVariable_1 = csp.getValue("tField", "tName");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(eFieldDeclarationToTField);
		eFieldDeclarationToTField.setSource(mFieldName);
		model.getMFieldNames().add(mFieldName);
		ruleResult.getSourceObjects().add(mFieldName);
		typeGraph.getFields().add(tField);
		eFieldDeclarationToTField.setTarget(tField);
		ruleResult.getTargetObjects().add(tField);
		String mFieldName_mName_prime = (String) _localVariable_0;
		String tField_tName_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		mFieldName.setMName(mFieldName_mName_prime);
		tField.setTName(tField_tName_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eFieldDeclarationToTField, mFieldName, model, typeGraph, tField, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_FieldName_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //FieldNameImpl
