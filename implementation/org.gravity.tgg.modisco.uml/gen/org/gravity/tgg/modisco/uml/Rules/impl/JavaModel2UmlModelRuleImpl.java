/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MGravityModel;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.JavaModel2UMLPackage;

import org.gravity.tgg.modisco.uml.Rules.JavaModel2UmlModelRule;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

import org.gravity.tgg.modisco.uml.UmlFactory;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

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
import org.gravity.tgg.modisco.uml.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Java Model2 Uml Model Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class JavaModel2UmlModelRuleImpl extends AbstractRuleImpl implements JavaModel2UmlModelRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaModel2UmlModelRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getJavaModel2UmlModelRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MGravityModel javaModel) {

		Object[] result1_black = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_0_1_initialbindings_blackBBB(this, match, javaModel);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[javaModel] = " + javaModel + ".");
		}

		Object[] result2_bindingAndBlack = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_0_2_SolveCSP_bindingAndBlackFBBB(this, match, javaModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[javaModel] = " + javaModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_0_4_collectelementstobetranslated_blackBB(match, javaModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[javaModel] = " + javaModel + ".");
			}
			JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_0_4_collectelementstobetranslated_greenBB(match,
					javaModel);

			Object[] result5_black = JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_0_5_collectcontextelements_blackBB(match, javaModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[javaModel] = " + javaModel + ".");
			}
			// 
			JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_0_6_registerobjectstomatch_expressionBBB(this,
					match, javaModel);
			return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_0_7_expressionF();
		} else {
			return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MGravityModel javaModel = (MGravityModel) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_1_1_performtransformation_greenFFFFFFFFBFB(javaModel, csp);
		Model rootModel = (Model) result1_green[0];
		Model umlModel = (Model) result1_green[1];
		JavaModel2UMLPackage jm2commonTypes = (JavaModel2UMLPackage) result1_green[2];
		Model sourceRefModel = (Model) result1_green[3];
		JavaModel2UMLPackage jm2um3 = (JavaModel2UMLPackage) result1_green[4];
		org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) result1_green[5];
		JavaModel2UMLPackage jm2um2 = (JavaModel2UMLPackage) result1_green[6];
		Model externalModel = (Model) result1_green[7];
		JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result1_green[9];

		Object[] result2_black = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_1_2_collecttranslatedelements_blackBBBBBBBBBB(rootModel, umlModel,
						jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2, externalModel, javaModel, jm2um);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[rootModel] = " + rootModel + ", "
					+ "[umlModel] = " + umlModel + ", " + "[jm2commonTypes] = " + jm2commonTypes + ", "
					+ "[sourceRefModel] = " + sourceRefModel + ", " + "[jm2um3] = " + jm2um3 + ", " + "[commonTypes] = "
					+ commonTypes + ", " + "[jm2um2] = " + jm2um2 + ", " + "[externalModel] = " + externalModel + ", "
					+ "[javaModel] = " + javaModel + ", " + "[jm2um] = " + jm2um + ".");
		}
		Object[] result2_green = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_1_2_collecttranslatedelements_greenFBBBBBBBBBB(rootModel, umlModel,
						jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2, externalModel, javaModel, jm2um);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, rootModel,
						umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2, externalModel, javaModel,
						jm2um);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[rootModel] = " + rootModel + ", " + "[umlModel] = " + umlModel + ", "
					+ "[jm2commonTypes] = " + jm2commonTypes + ", " + "[sourceRefModel] = " + sourceRefModel + ", "
					+ "[jm2um3] = " + jm2um3 + ", " + "[commonTypes] = " + commonTypes + ", " + "[jm2um2] = " + jm2um2
					+ ", " + "[externalModel] = " + externalModel + ", " + "[javaModel] = " + javaModel + ", "
					+ "[jm2um] = " + jm2um + ".");
		}
		JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFF(
				ruleresult, rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2,
				externalModel, javaModel, jm2um);
		//nothing EMoflonEdge rootModel__umlModel____packagedElement = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge umlModel__commonTypes____packagedElement = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge jm2um3__sourceRefModel____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge jm2commonTypes__commonTypes____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge jm2um3__javaModel____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge jm2um2__javaModel____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge jm2commonTypes__javaModel____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge rootModel__externalModel____packagedElement = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge jm2um__umlModel____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge rootModel__sourceRefModel____packagedElement = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge jm2um2__externalModel____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge jm2um__javaModel____source = (EMoflonEdge) result3_green[22];

		// 
		// 
		JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_1_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2,
				externalModel, javaModel, jm2um);
		return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MGravityModel javaModel = (MGravityModel) result2_binding[0];
		for (Object[] result2_black : JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_2_2_corematch_blackBB(javaModel, match)) {
			// ForEach 
			for (Object[] result3_black : JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_2_3_findcontext_blackB(javaModel)) {
				Object[] result3_green = JavaModel2UmlModelRuleImpl
						.pattern_JavaModel2UmlModelRule_2_3_findcontext_greenBF(javaModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = JavaModel2UmlModelRuleImpl
						.pattern_JavaModel2UmlModelRule_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
								javaModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[javaModel] = " + javaModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = JavaModel2UmlModelRuleImpl
							.pattern_JavaModel2UmlModelRule_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MGravityModel javaModel) {
		match.registerObject("javaModel", javaModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MGravityModel javaModel) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MGravityModel javaModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_javaModel_name = CSPFactoryHelper.eINSTANCE.createVariable("javaModel.name", true, csp);
		var_javaModel_name.setValue(javaModel.getName());
		var_javaModel_name.setType("String");

		// Create unbound variables
		Variable var_umlModel_name = CSPFactoryHelper.eINSTANCE.createVariable("umlModel.name", csp);
		var_umlModel_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_javaModel_name, var_umlModel_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("javaModel", javaModel);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject rootModel, EObject umlModel,
			EObject jm2commonTypes, EObject sourceRefModel, EObject jm2um3, EObject commonTypes, EObject jm2um2,
			EObject externalModel, EObject javaModel, EObject jm2um) {
		ruleresult.registerObject("rootModel", rootModel);
		ruleresult.registerObject("umlModel", umlModel);
		ruleresult.registerObject("jm2commonTypes", jm2commonTypes);
		ruleresult.registerObject("sourceRefModel", sourceRefModel);
		ruleresult.registerObject("jm2um3", jm2um3);
		ruleresult.registerObject("commonTypes", commonTypes);
		ruleresult.registerObject("jm2um2", jm2um2);
		ruleresult.registerObject("externalModel", externalModel);
		ruleresult.registerObject("javaModel", javaModel);
		ruleresult.registerObject("jm2um", jm2um);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("javaModel").eClass())
				.equals("modisco.MGravityModel.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {

		Object[] result1_black = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_10_1_initialbindings_blackBBBBBBB(this, match, rootModel, umlModel,
						sourceRefModel, commonTypes, externalModel);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[rootModel] = " + rootModel + ", " + "[umlModel] = " + umlModel
					+ ", " + "[sourceRefModel] = " + sourceRefModel + ", " + "[commonTypes] = " + commonTypes + ", "
					+ "[externalModel] = " + externalModel + ".");
		}

		Object[] result2_bindingAndBlack = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_10_2_SolveCSP_bindingAndBlackFBBBBBBB(this, match, rootModel, umlModel,
						sourceRefModel, commonTypes, externalModel);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[rootModel] = " + rootModel + ", " + "[umlModel] = " + umlModel
					+ ", " + "[sourceRefModel] = " + sourceRefModel + ", " + "[commonTypes] = " + commonTypes + ", "
					+ "[externalModel] = " + externalModel + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_10_4_collectelementstobetranslated_blackBBBBBB(match, rootModel,
							umlModel, sourceRefModel, commonTypes, externalModel);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[rootModel] = " + rootModel + ", " + "[umlModel] = " + umlModel + ", "
						+ "[sourceRefModel] = " + sourceRefModel + ", " + "[commonTypes] = " + commonTypes + ", "
						+ "[externalModel] = " + externalModel + ".");
			}
			JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_10_4_collectelementstobetranslated_greenBBBBBBFFFF(match, rootModel,
							umlModel, sourceRefModel, commonTypes, externalModel);
			//nothing EMoflonEdge rootModel__umlModel____packagedElement = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge umlModel__commonTypes____packagedElement = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge rootModel__externalModel____packagedElement = (EMoflonEdge) result4_green[8];
			//nothing EMoflonEdge rootModel__sourceRefModel____packagedElement = (EMoflonEdge) result4_green[9];

			Object[] result5_black = JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_10_5_collectcontextelements_blackBBBBBB(match, rootModel, umlModel,
							sourceRefModel, commonTypes, externalModel);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[rootModel] = " + rootModel + ", " + "[umlModel] = " + umlModel + ", "
						+ "[sourceRefModel] = " + sourceRefModel + ", " + "[commonTypes] = " + commonTypes + ", "
						+ "[externalModel] = " + externalModel + ".");
			}
			// 
			JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_10_6_registerobjectstomatch_expressionBBBBBBB(
					this, match, rootModel, umlModel, sourceRefModel, commonTypes, externalModel);
			return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_10_7_expressionF();
		} else {
			return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Model rootModel = (Model) result1_bindingAndBlack[0];
		Model umlModel = (Model) result1_bindingAndBlack[1];
		Model sourceRefModel = (Model) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[3];
		Model externalModel = (Model) result1_bindingAndBlack[4];
		CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_11_1_performtransformation_greenBFBFBFBFFB(umlModel, sourceRefModel,
						commonTypes, externalModel, csp);
		JavaModel2UMLPackage jm2commonTypes = (JavaModel2UMLPackage) result1_green[1];
		JavaModel2UMLPackage jm2um3 = (JavaModel2UMLPackage) result1_green[3];
		JavaModel2UMLPackage jm2um2 = (JavaModel2UMLPackage) result1_green[5];
		MGravityModel javaModel = (MGravityModel) result1_green[7];
		JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result1_green[8];

		Object[] result2_black = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_11_2_collecttranslatedelements_blackBBBBBBBBBB(rootModel, umlModel,
						jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2, externalModel, javaModel, jm2um);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[rootModel] = " + rootModel + ", "
					+ "[umlModel] = " + umlModel + ", " + "[jm2commonTypes] = " + jm2commonTypes + ", "
					+ "[sourceRefModel] = " + sourceRefModel + ", " + "[jm2um3] = " + jm2um3 + ", " + "[commonTypes] = "
					+ commonTypes + ", " + "[jm2um2] = " + jm2um2 + ", " + "[externalModel] = " + externalModel + ", "
					+ "[javaModel] = " + javaModel + ", " + "[jm2um] = " + jm2um + ".");
		}
		Object[] result2_green = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_11_2_collecttranslatedelements_greenFBBBBBBBBBB(rootModel, umlModel,
						jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2, externalModel, javaModel, jm2um);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, rootModel,
						umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2, externalModel, javaModel,
						jm2um);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[rootModel] = " + rootModel + ", " + "[umlModel] = " + umlModel + ", "
					+ "[jm2commonTypes] = " + jm2commonTypes + ", " + "[sourceRefModel] = " + sourceRefModel + ", "
					+ "[jm2um3] = " + jm2um3 + ", " + "[commonTypes] = " + commonTypes + ", " + "[jm2um2] = " + jm2um2
					+ ", " + "[externalModel] = " + externalModel + ", " + "[javaModel] = " + javaModel + ", "
					+ "[jm2um] = " + jm2um + ".");
		}
		JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFF(
				ruleresult, rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2,
				externalModel, javaModel, jm2um);
		//nothing EMoflonEdge rootModel__umlModel____packagedElement = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge umlModel__commonTypes____packagedElement = (EMoflonEdge) result3_green[12];
		//nothing EMoflonEdge jm2um3__sourceRefModel____target = (EMoflonEdge) result3_green[13];
		//nothing EMoflonEdge jm2commonTypes__commonTypes____target = (EMoflonEdge) result3_green[14];
		//nothing EMoflonEdge jm2um3__javaModel____source = (EMoflonEdge) result3_green[15];
		//nothing EMoflonEdge jm2um2__javaModel____source = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge jm2commonTypes__javaModel____source = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge rootModel__externalModel____packagedElement = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge jm2um__umlModel____target = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge rootModel__sourceRefModel____packagedElement = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge jm2um2__externalModel____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge jm2um__javaModel____source = (EMoflonEdge) result3_green[22];

		// 
		// 
		JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_11_5_registerobjects_expressionBBBBBBBBBBBB(this,
				ruleresult, rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2,
				externalModel, javaModel, jm2um);
		return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_12_2_corematch_bindingFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Model rootModel = (Model) result2_binding[0];
		Model umlModel = (Model) result2_binding[1];
		Model sourceRefModel = (Model) result2_binding[2];
		org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) result2_binding[3];
		Model externalModel = (Model) result2_binding[4];
		for (Object[] result2_black : JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_12_2_corematch_blackBBBBBB(rootModel, umlModel, sourceRefModel,
						commonTypes, externalModel, match)) {
			// ForEach 
			for (Object[] result3_black : JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_12_3_findcontext_blackBBBBB(rootModel, umlModel, sourceRefModel,
							commonTypes, externalModel)) {
				Object[] result3_green = JavaModel2UmlModelRuleImpl
						.pattern_JavaModel2UmlModelRule_12_3_findcontext_greenBBBBBFFFFF(rootModel, umlModel,
								sourceRefModel, commonTypes, externalModel);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge rootModel__umlModel____packagedElement = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge umlModel__commonTypes____packagedElement = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge rootModel__externalModel____packagedElement = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge rootModel__sourceRefModel____packagedElement = (EMoflonEdge) result3_green[9];

				Object[] result4_bindingAndBlack = JavaModel2UmlModelRuleImpl
						.pattern_JavaModel2UmlModelRule_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								rootModel, umlModel, sourceRefModel, commonTypes, externalModel);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[rootModel] = " + rootModel + ", "
							+ "[umlModel] = " + umlModel + ", " + "[sourceRefModel] = " + sourceRefModel + ", "
							+ "[commonTypes] = " + commonTypes + ", " + "[externalModel] = " + externalModel + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = JavaModel2UmlModelRuleImpl
							.pattern_JavaModel2UmlModelRule_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		match.registerObject("rootModel", rootModel);
		match.registerObject("umlModel", umlModel);
		match.registerObject("sourceRefModel", sourceRefModel);
		match.registerObject("commonTypes", commonTypes);
		match.registerObject("externalModel", externalModel);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Model rootModel, Model umlModel,
			Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_umlModel_name = CSPFactoryHelper.eINSTANCE.createVariable("umlModel.name", true, csp);
		var_umlModel_name.setValue(umlModel.getName());
		var_umlModel_name.setType("String");

		// Create unbound variables
		Variable var_javaModel_name = CSPFactoryHelper.eINSTANCE.createVariable("javaModel.name", csp);
		var_javaModel_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_javaModel_name, var_umlModel_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("rootModel", rootModel);
		isApplicableMatch.registerObject("umlModel", umlModel);
		isApplicableMatch.registerObject("sourceRefModel", sourceRefModel);
		isApplicableMatch.registerObject("commonTypes", commonTypes);
		isApplicableMatch.registerObject("externalModel", externalModel);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject rootModel, EObject umlModel,
			EObject jm2commonTypes, EObject sourceRefModel, EObject jm2um3, EObject commonTypes, EObject jm2um2,
			EObject externalModel, EObject javaModel, EObject jm2um) {
		ruleresult.registerObject("rootModel", rootModel);
		ruleresult.registerObject("umlModel", umlModel);
		ruleresult.registerObject("jm2commonTypes", jm2commonTypes);
		ruleresult.registerObject("sourceRefModel", sourceRefModel);
		ruleresult.registerObject("jm2um3", jm2um3);
		ruleresult.registerObject("commonTypes", commonTypes);
		ruleresult.registerObject("jm2um2", jm2um2);
		ruleresult.registerObject("externalModel", externalModel);
		ruleresult.registerObject("javaModel", javaModel);
		ruleresult.registerObject("jm2um", jm2um);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("rootModel").eClass()).equals("uml.Model.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("umlModel").eClass()).equals("uml.Model.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("sourceRefModel").eClass())
						.equals("uml.Model.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("commonTypes").eClass()).equals("uml.Package.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("externalModel").eClass())
						.equals("uml.Model.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_MGravityModel_1(MGravityModel javaModel) {

		Object[] result1_bindingAndBlack = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_20_2_testcorematchandDECs_blackB(javaModel)) {
			Object[] result2_green = JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, javaModel)) {
				// 
				if (JavaModel2UmlModelRuleImpl
						.pattern_JavaModel2UmlModelRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaModel2UmlModelRuleImpl
							.pattern_JavaModel2UmlModelRule_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_139(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_21_2_testcorematchandDECs_blackFFFFFB(_edge_packagedElement)) {
			Model rootModel = (Model) result2_black[0];
			Model umlModel = (Model) result2_black[1];
			Model sourceRefModel = (Model) result2_black[2];
			org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) result2_black[3];
			Model externalModel = (Model) result2_black[4];
			Object[] result2_green = JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
							this, match, rootModel, umlModel, sourceRefModel, commonTypes, externalModel)) {
				// 
				if (JavaModel2UmlModelRuleImpl
						.pattern_JavaModel2UmlModelRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = JavaModel2UmlModelRuleImpl
							.pattern_JavaModel2UmlModelRule_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("JavaModel2UmlModelRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("rootModel", "name", "root model", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("sourceRefModel", "name", "source references", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("commonTypes", "name", "Common Java datatypes", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("externalModel", "name", "externals", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_javaModel_name = CSPFactoryHelper.eINSTANCE.createVariable("javaModel", true, csp);
		var_javaModel_name.setValue(__helper.getValue("javaModel", "name"));
		var_javaModel_name.setType("String");

		Variable var_umlModel_name = CSPFactoryHelper.eINSTANCE.createVariable("umlModel", true, csp);
		var_umlModel_name.setValue(__helper.getValue("umlModel", "name"));
		var_umlModel_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("JavaModel2UmlModelRule");
		eq0.solve(var_javaModel_name, var_umlModel_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_umlModel_name.setBound(false);
			eq0.solve(var_javaModel_name, var_umlModel_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("umlModel", "name", var_umlModel_name.getValue());
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
		ruleResult.setRule("JavaModel2UmlModelRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("rootModel", "name", "root model", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("sourceRefModel", "name", "source references", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("commonTypes", "name", "Common Java datatypes", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("externalModel", "name", "externals", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_javaModel_name = CSPFactoryHelper.eINSTANCE.createVariable("javaModel", true, csp);
		var_javaModel_name.setValue(__helper.getValue("javaModel", "name"));
		var_javaModel_name.setType("String");

		Variable var_umlModel_name = CSPFactoryHelper.eINSTANCE.createVariable("umlModel", true, csp);
		var_umlModel_name.setValue(__helper.getValue("umlModel", "name"));
		var_umlModel_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("JavaModel2UmlModelRule");
		eq0.solve(var_javaModel_name, var_umlModel_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_javaModel_name.setBound(false);
			eq0.solve(var_javaModel_name, var_umlModel_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("javaModel", "name", var_javaModel_name.getValue());
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

		Object[] result1_black = JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Model rootModel = (Model) result2_bindingAndBlack[0];
		Model umlModel = (Model) result2_bindingAndBlack[1];
		Model sourceRefModel = (Model) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[3];
		Model externalModel = (Model) result2_bindingAndBlack[4];
		MGravityModel javaModel = (MGravityModel) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, rootModel, umlModel,
						sourceRefModel, commonTypes, externalModel, javaModel, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[rootModel] = " + rootModel + ", " + "[umlModel] = " + umlModel + ", " + "[sourceRefModel] = "
					+ sourceRefModel + ", " + "[commonTypes] = " + commonTypes + ", " + "[externalModel] = "
					+ externalModel + ", " + "[javaModel] = " + javaModel + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = JavaModel2UmlModelRuleImpl
						.pattern_JavaModel2UmlModelRule_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = JavaModel2UmlModelRuleImpl
						.pattern_JavaModel2UmlModelRule_24_6_createcorrespondence_blackBBBBBBB(rootModel, umlModel,
								sourceRefModel, commonTypes, externalModel, javaModel, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[rootModel] = " + rootModel + ", "
									+ "[umlModel] = " + umlModel + ", " + "[sourceRefModel] = " + sourceRefModel + ", "
									+ "[commonTypes] = " + commonTypes + ", " + "[externalModel] = " + externalModel
									+ ", " + "[javaModel] = " + javaModel + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_24_6_createcorrespondence_greenBFBFBFBBFB(
						umlModel, sourceRefModel, commonTypes, externalModel, javaModel, ccMatch);
				//nothing JavaModel2UMLPackage jm2commonTypes = (JavaModel2UMLPackage) result6_green[1];
				//nothing JavaModel2UMLPackage jm2um3 = (JavaModel2UMLPackage) result6_green[3];
				//nothing JavaModel2UMLPackage jm2um2 = (JavaModel2UMLPackage) result6_green[5];
				//nothing JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result6_green[8];

				Object[] result7_black = JavaModel2UmlModelRuleImpl
						.pattern_JavaModel2UmlModelRule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel, MGravityModel javaModel, Match sourceMatch,
			Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_javaModel_name = CSPFactoryHelper.eINSTANCE.createVariable("javaModel.name", true, csp);
		var_javaModel_name.setValue(javaModel.getName());
		var_javaModel_name.setType("String");
		Variable var_umlModel_name = CSPFactoryHelper.eINSTANCE.createVariable("umlModel.name", true, csp);
		var_umlModel_name.setValue(umlModel.getName());
		var_umlModel_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_javaModel_name, var_umlModel_name);
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
	public boolean checkDEC_FWD(MGravityModel javaModel) {// 
		Object[] result1_black = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_27_1_matchtggpattern_blackB(javaModel);
		if (result1_black != null) {
			return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_27_2_expressionF();
		} else {
			return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {// 
		Object[] result1_black = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_28_1_matchtggpattern_blackBBBBB(rootModel, umlModel, sourceRefModel,
						commonTypes, externalModel);
		if (result1_black != null) {
			JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_28_1_matchtggpattern_greenBBBB(rootModel,
					sourceRefModel, commonTypes, externalModel);

			return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_28_2_expressionF();
		} else {
			return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = JavaModel2UmlModelRuleImpl
				.pattern_JavaModel2UmlModelRule_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = JavaModel2UmlModelRuleImpl
					.pattern_JavaModel2UmlModelRule_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = JavaModel2UmlModelRuleImpl
						.pattern_JavaModel2UmlModelRule_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_29_6_perform_greenFFFFFFFFFFBB(ruleResult,
						csp);
				//nothing Model rootModel = (Model) result6_green[0];
				//nothing Model umlModel = (Model) result6_green[1];
				//nothing JavaModel2UMLPackage jm2commonTypes = (JavaModel2UMLPackage) result6_green[2];
				//nothing Model sourceRefModel = (Model) result6_green[3];
				//nothing JavaModel2UMLPackage jm2um3 = (JavaModel2UMLPackage) result6_green[4];
				//nothing org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) result6_green[5];
				//nothing JavaModel2UMLPackage jm2um2 = (JavaModel2UMLPackage) result6_green[6];
				//nothing Model externalModel = (Model) result6_green[7];
				//nothing MGravityModel javaModel = (MGravityModel) result6_green[8];
				//nothing JavaModel2UMLPackage jm2um = (JavaModel2UMLPackage) result6_green[9];

			} else {
			}

		} else {
		}
		return JavaModel2UmlModelRuleImpl.pattern_JavaModel2UmlModelRule_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_javaModel_name = CSPFactoryHelper.eINSTANCE.createVariable("javaModel.name", csp);
		var_javaModel_name.setType("String");
		Variable var_umlModel_name = CSPFactoryHelper.eINSTANCE.createVariable("umlModel.name", csp);
		var_umlModel_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_javaModel_name, var_umlModel_name);

		// Snapshot pattern match on which CSP is solved
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
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPROPRIATE_FWD__MATCH_MGRAVITYMODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MGRAVITYMODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1));
			return null;
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MGRAVITYMODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MGravityModel) arguments.get(1));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MGRAVITYMODEL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (MGravityModel) arguments.get(1));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPROPRIATE_BWD__MATCH_MODEL_MODEL_MODEL_PACKAGE_MODEL:
			return isAppropriate_BWD((Match) arguments.get(0), (Model) arguments.get(1), (Model) arguments.get(2),
					(Model) arguments.get(3), (org.eclipse.uml2.uml.Package) arguments.get(4),
					(Model) arguments.get(5));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL_MODEL_MODEL_PACKAGE_MODEL:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Model) arguments.get(1), (Model) arguments.get(2),
					(Model) arguments.get(3), (org.eclipse.uml2.uml.Package) arguments.get(4),
					(Model) arguments.get(5));
			return null;
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL_MODEL_MODEL_PACKAGE_MODEL:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Model) arguments.get(1),
					(Model) arguments.get(2), (Model) arguments.get(3), (org.eclipse.uml2.uml.Package) arguments.get(4),
					(Model) arguments.get(5));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_MODEL_MODEL_PACKAGE_MODEL:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Model) arguments.get(1),
					(Model) arguments.get(2), (Model) arguments.get(3), (org.eclipse.uml2.uml.Package) arguments.get(4),
					(Model) arguments.get(5));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPROPRIATE_FWD_MGRAVITY_MODEL_1__MGRAVITYMODEL:
			return isAppropriate_FWD_MGravityModel_1((MGravityModel) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_139__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_139((EMoflonEdge) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_MODEL_MODEL_PACKAGE_MODEL_MGRAVITYMODEL_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Model) arguments.get(0), (Model) arguments.get(1),
					(Model) arguments.get(2), (org.eclipse.uml2.uml.Package) arguments.get(3), (Model) arguments.get(4),
					(MGravityModel) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___CHECK_DEC_FWD__MGRAVITYMODEL:
			return checkDEC_FWD((MGravityModel) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___CHECK_DEC_BWD__MODEL_MODEL_MODEL_PACKAGE_MODEL:
			return checkDEC_BWD((Model) arguments.get(0), (Model) arguments.get(1), (Model) arguments.get(2),
					(org.eclipse.uml2.uml.Package) arguments.get(3), (Model) arguments.get(4));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.JAVA_MODEL2_UML_MODEL_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_0_1_initialbindings_blackBBB(
			JavaModel2UmlModelRule _this, Match match, MGravityModel javaModel) {
		return new Object[] { _this, match, javaModel };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_0_2_SolveCSP_bindingFBBB(JavaModel2UmlModelRule _this,
			Match match, MGravityModel javaModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, javaModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, javaModel };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_0_2_SolveCSP_bindingAndBlackFBBB(
			JavaModel2UmlModelRule _this, Match match, MGravityModel javaModel) {
		Object[] result_pattern_JavaModel2UmlModelRule_0_2_SolveCSP_binding = pattern_JavaModel2UmlModelRule_0_2_SolveCSP_bindingFBBB(
				_this, match, javaModel);
		if (result_pattern_JavaModel2UmlModelRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaModel2UmlModelRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_0_2_SolveCSP_black = pattern_JavaModel2UmlModelRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaModel2UmlModelRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, javaModel };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_0_3_CheckCSP_expressionFBB(JavaModel2UmlModelRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_0_4_collectelementstobetranslated_blackBB(Match match,
			MGravityModel javaModel) {
		return new Object[] { match, javaModel };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_0_4_collectelementstobetranslated_greenBB(Match match,
			MGravityModel javaModel) {
		match.getToBeTranslatedNodes().add(javaModel);
		return new Object[] { match, javaModel };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_0_5_collectcontextelements_blackBB(Match match,
			MGravityModel javaModel) {
		return new Object[] { match, javaModel };
	}

	public static final void pattern_JavaModel2UmlModelRule_0_6_registerobjectstomatch_expressionBBB(
			JavaModel2UmlModelRule _this, Match match, MGravityModel javaModel) {
		_this.registerObjectsToMatch_FWD(match, javaModel);

	}

	public static final boolean pattern_JavaModel2UmlModelRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("javaModel");
		EObject tmpJavaModel = _localVariable_0;
		if (tmpJavaModel instanceof MGravityModel) {
			MGravityModel javaModel = (MGravityModel) tmpJavaModel;
			return new Object[] { javaModel, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_1_1_performtransformation_blackBFBB(
			MGravityModel javaModel, JavaModel2UmlModelRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { javaModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_1_1_performtransformation_bindingAndBlackFFBB(
			JavaModel2UmlModelRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaModel2UmlModelRule_1_1_performtransformation_binding = pattern_JavaModel2UmlModelRule_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_JavaModel2UmlModelRule_1_1_performtransformation_binding != null) {
			MGravityModel javaModel = (MGravityModel) result_pattern_JavaModel2UmlModelRule_1_1_performtransformation_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_1_1_performtransformation_black = pattern_JavaModel2UmlModelRule_1_1_performtransformation_blackBFBB(
					javaModel, _this, isApplicableMatch);
			if (result_pattern_JavaModel2UmlModelRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaModel2UmlModelRule_1_1_performtransformation_black[1];

				return new Object[] { javaModel, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_1_1_performtransformation_greenFFFFFFFFBFB(
			MGravityModel javaModel, CSP csp) {
		Model rootModel = UMLFactory.eINSTANCE.createModel();
		Model umlModel = UMLFactory.eINSTANCE.createModel();
		JavaModel2UMLPackage jm2commonTypes = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		Model sourceRefModel = UMLFactory.eINSTANCE.createModel();
		JavaModel2UMLPackage jm2um3 = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		org.eclipse.uml2.uml.Package commonTypes = UMLFactory.eINSTANCE.createPackage();
		JavaModel2UMLPackage jm2um2 = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		Model externalModel = UMLFactory.eINSTANCE.createModel();
		JavaModel2UMLPackage jm2um = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		String rootModel_name_prime = "root model";
		Object _localVariable_0 = csp.getValue("umlModel", "name");
		String sourceRefModel_name_prime = "source references";
		String commonTypes_name_prime = "Common Java datatypes";
		String externalModel_name_prime = "externals";
		rootModel.getPackagedElements().add(umlModel);
		jm2commonTypes.setSource(javaModel);
		rootModel.getPackagedElements().add(sourceRefModel);
		jm2um3.setTarget(sourceRefModel);
		jm2um3.setSource(javaModel);
		umlModel.getPackagedElements().add(commonTypes);
		jm2commonTypes.setTarget(commonTypes);
		jm2um2.setSource(javaModel);
		rootModel.getPackagedElements().add(externalModel);
		jm2um2.setTarget(externalModel);
		jm2um.setTarget(umlModel);
		jm2um.setSource(javaModel);
		rootModel.setName(rootModel_name_prime);
		String umlModel_name_prime = (String) _localVariable_0;
		sourceRefModel.setName(sourceRefModel_name_prime);
		commonTypes.setName(commonTypes_name_prime);
		externalModel.setName(externalModel_name_prime);
		umlModel.setName(umlModel_name_prime);
		return new Object[] { rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2,
				externalModel, javaModel, jm2um, csp };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_1_2_collecttranslatedelements_blackBBBBBBBBBB(
			Model rootModel, Model umlModel, JavaModel2UMLPackage jm2commonTypes, Model sourceRefModel,
			JavaModel2UMLPackage jm2um3, org.eclipse.uml2.uml.Package commonTypes, JavaModel2UMLPackage jm2um2,
			Model externalModel, MGravityModel javaModel, JavaModel2UMLPackage jm2um) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!jm2commonTypes.equals(jm2um3)) {
					if (!jm2commonTypes.equals(jm2um2)) {
						if (!jm2commonTypes.equals(jm2um)) {
							if (!sourceRefModel.equals(umlModel)) {
								if (!commonTypes.equals(rootModel)) {
									if (!commonTypes.equals(umlModel)) {
										if (!commonTypes.equals(sourceRefModel)) {
											if (!commonTypes.equals(externalModel)) {
												if (!jm2um2.equals(jm2um3)) {
													if (!externalModel.equals(rootModel)) {
														if (!externalModel.equals(umlModel)) {
															if (!externalModel.equals(sourceRefModel)) {
																if (!jm2um.equals(jm2um3)) {
																	if (!jm2um.equals(jm2um2)) {
																		return new Object[] { rootModel, umlModel,
																				jm2commonTypes, sourceRefModel, jm2um3,
																				commonTypes, jm2um2, externalModel,
																				javaModel, jm2um };
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_1_2_collecttranslatedelements_greenFBBBBBBBBBB(
			Model rootModel, Model umlModel, JavaModel2UMLPackage jm2commonTypes, Model sourceRefModel,
			JavaModel2UMLPackage jm2um3, org.eclipse.uml2.uml.Package commonTypes, JavaModel2UMLPackage jm2um2,
			Model externalModel, MGravityModel javaModel, JavaModel2UMLPackage jm2um) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(rootModel);
		ruleresult.getCreatedElements().add(umlModel);
		ruleresult.getCreatedLinkElements().add(jm2commonTypes);
		ruleresult.getCreatedElements().add(sourceRefModel);
		ruleresult.getCreatedLinkElements().add(jm2um3);
		ruleresult.getCreatedElements().add(commonTypes);
		ruleresult.getCreatedLinkElements().add(jm2um2);
		ruleresult.getCreatedElements().add(externalModel);
		ruleresult.getTranslatedElements().add(javaModel);
		ruleresult.getCreatedLinkElements().add(jm2um);
		return new Object[] { ruleresult, rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes,
				jm2um2, externalModel, javaModel, jm2um };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject rootModel, EObject umlModel, EObject jm2commonTypes,
			EObject sourceRefModel, EObject jm2um3, EObject commonTypes, EObject jm2um2, EObject externalModel,
			EObject javaModel, EObject jm2um) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!jm2commonTypes.equals(rootModel)) {
					if (!jm2commonTypes.equals(umlModel)) {
						if (!jm2commonTypes.equals(sourceRefModel)) {
							if (!jm2commonTypes.equals(jm2um3)) {
								if (!jm2commonTypes.equals(jm2um2)) {
									if (!jm2commonTypes.equals(jm2um)) {
										if (!sourceRefModel.equals(umlModel)) {
											if (!jm2um3.equals(rootModel)) {
												if (!jm2um3.equals(umlModel)) {
													if (!jm2um3.equals(sourceRefModel)) {
														if (!commonTypes.equals(rootModel)) {
															if (!commonTypes.equals(umlModel)) {
																if (!commonTypes.equals(jm2commonTypes)) {
																	if (!commonTypes.equals(sourceRefModel)) {
																		if (!commonTypes.equals(jm2um3)) {
																			if (!commonTypes.equals(jm2um2)) {
																				if (!commonTypes
																						.equals(externalModel)) {
																					if (!commonTypes
																							.equals(javaModel)) {
																						if (!commonTypes
																								.equals(jm2um)) {
																							if (!jm2um2.equals(
																									rootModel)) {
																								if (!jm2um2.equals(
																										umlModel)) {
																									if (!jm2um2.equals(
																											sourceRefModel)) {
																										if (!jm2um2
																												.equals(jm2um3)) {
																											if (!externalModel
																													.equals(rootModel)) {
																												if (!externalModel
																														.equals(umlModel)) {
																													if (!externalModel
																															.equals(jm2commonTypes)) {
																														if (!externalModel
																																.equals(sourceRefModel)) {
																															if (!externalModel
																																	.equals(jm2um3)) {
																																if (!externalModel
																																		.equals(jm2um2)) {
																																	if (!externalModel
																																			.equals(javaModel)) {
																																		if (!externalModel
																																				.equals(jm2um)) {
																																			if (!javaModel
																																					.equals(rootModel)) {
																																				if (!javaModel
																																						.equals(umlModel)) {
																																					if (!javaModel
																																							.equals(jm2commonTypes)) {
																																						if (!javaModel
																																								.equals(sourceRefModel)) {
																																							if (!javaModel
																																									.equals(jm2um3)) {
																																								if (!javaModel
																																										.equals(jm2um2)) {
																																									if (!javaModel
																																											.equals(jm2um)) {
																																										if (!jm2um
																																												.equals(rootModel)) {
																																											if (!jm2um
																																													.equals(umlModel)) {
																																												if (!jm2um
																																														.equals(sourceRefModel)) {
																																													if (!jm2um
																																															.equals(jm2um3)) {
																																														if (!jm2um
																																																.equals(jm2um2)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	rootModel,
																																																	umlModel,
																																																	jm2commonTypes,
																																																	sourceRefModel,
																																																	jm2um3,
																																																	commonTypes,
																																																	jm2um2,
																																																	externalModel,
																																																	javaModel,
																																																	jm2um };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_1_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject rootModel, EObject umlModel, EObject jm2commonTypes,
			EObject sourceRefModel, EObject jm2um3, EObject commonTypes, EObject jm2um2, EObject externalModel,
			EObject javaModel, EObject jm2um) {
		EMoflonEdge rootModel__umlModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlModel__commonTypes____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um3__sourceRefModel____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2commonTypes__commonTypes____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um3__javaModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um2__javaModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2commonTypes__javaModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge rootModel__externalModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__umlModel____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge rootModel__sourceRefModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um2__externalModel____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__javaModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaModel2UmlModelRule";
		String rootModel__umlModel____packagedElement_name_prime = "packagedElement";
		String umlModel__commonTypes____packagedElement_name_prime = "packagedElement";
		String jm2um3__sourceRefModel____target_name_prime = "target";
		String jm2commonTypes__commonTypes____target_name_prime = "target";
		String jm2um3__javaModel____source_name_prime = "source";
		String jm2um2__javaModel____source_name_prime = "source";
		String jm2commonTypes__javaModel____source_name_prime = "source";
		String rootModel__externalModel____packagedElement_name_prime = "packagedElement";
		String jm2um__umlModel____target_name_prime = "target";
		String rootModel__sourceRefModel____packagedElement_name_prime = "packagedElement";
		String jm2um2__externalModel____target_name_prime = "target";
		String jm2um__javaModel____source_name_prime = "source";
		rootModel__umlModel____packagedElement.setSrc(rootModel);
		rootModel__umlModel____packagedElement.setTrg(umlModel);
		ruleresult.getCreatedEdges().add(rootModel__umlModel____packagedElement);
		umlModel__commonTypes____packagedElement.setSrc(umlModel);
		umlModel__commonTypes____packagedElement.setTrg(commonTypes);
		ruleresult.getCreatedEdges().add(umlModel__commonTypes____packagedElement);
		jm2um3__sourceRefModel____target.setSrc(jm2um3);
		jm2um3__sourceRefModel____target.setTrg(sourceRefModel);
		ruleresult.getCreatedEdges().add(jm2um3__sourceRefModel____target);
		jm2commonTypes__commonTypes____target.setSrc(jm2commonTypes);
		jm2commonTypes__commonTypes____target.setTrg(commonTypes);
		ruleresult.getCreatedEdges().add(jm2commonTypes__commonTypes____target);
		jm2um3__javaModel____source.setSrc(jm2um3);
		jm2um3__javaModel____source.setTrg(javaModel);
		ruleresult.getCreatedEdges().add(jm2um3__javaModel____source);
		jm2um2__javaModel____source.setSrc(jm2um2);
		jm2um2__javaModel____source.setTrg(javaModel);
		ruleresult.getCreatedEdges().add(jm2um2__javaModel____source);
		jm2commonTypes__javaModel____source.setSrc(jm2commonTypes);
		jm2commonTypes__javaModel____source.setTrg(javaModel);
		ruleresult.getCreatedEdges().add(jm2commonTypes__javaModel____source);
		rootModel__externalModel____packagedElement.setSrc(rootModel);
		rootModel__externalModel____packagedElement.setTrg(externalModel);
		ruleresult.getCreatedEdges().add(rootModel__externalModel____packagedElement);
		jm2um__umlModel____target.setSrc(jm2um);
		jm2um__umlModel____target.setTrg(umlModel);
		ruleresult.getCreatedEdges().add(jm2um__umlModel____target);
		rootModel__sourceRefModel____packagedElement.setSrc(rootModel);
		rootModel__sourceRefModel____packagedElement.setTrg(sourceRefModel);
		ruleresult.getCreatedEdges().add(rootModel__sourceRefModel____packagedElement);
		jm2um2__externalModel____target.setSrc(jm2um2);
		jm2um2__externalModel____target.setTrg(externalModel);
		ruleresult.getCreatedEdges().add(jm2um2__externalModel____target);
		jm2um__javaModel____source.setSrc(jm2um);
		jm2um__javaModel____source.setTrg(javaModel);
		ruleresult.getCreatedEdges().add(jm2um__javaModel____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		rootModel__umlModel____packagedElement.setName(rootModel__umlModel____packagedElement_name_prime);
		umlModel__commonTypes____packagedElement.setName(umlModel__commonTypes____packagedElement_name_prime);
		jm2um3__sourceRefModel____target.setName(jm2um3__sourceRefModel____target_name_prime);
		jm2commonTypes__commonTypes____target.setName(jm2commonTypes__commonTypes____target_name_prime);
		jm2um3__javaModel____source.setName(jm2um3__javaModel____source_name_prime);
		jm2um2__javaModel____source.setName(jm2um2__javaModel____source_name_prime);
		jm2commonTypes__javaModel____source.setName(jm2commonTypes__javaModel____source_name_prime);
		rootModel__externalModel____packagedElement.setName(rootModel__externalModel____packagedElement_name_prime);
		jm2um__umlModel____target.setName(jm2um__umlModel____target_name_prime);
		rootModel__sourceRefModel____packagedElement.setName(rootModel__sourceRefModel____packagedElement_name_prime);
		jm2um2__externalModel____target.setName(jm2um2__externalModel____target_name_prime);
		jm2um__javaModel____source.setName(jm2um__javaModel____source_name_prime);
		return new Object[] { ruleresult, rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes,
				jm2um2, externalModel, javaModel, jm2um, rootModel__umlModel____packagedElement,
				umlModel__commonTypes____packagedElement, jm2um3__sourceRefModel____target,
				jm2commonTypes__commonTypes____target, jm2um3__javaModel____source, jm2um2__javaModel____source,
				jm2commonTypes__javaModel____source, rootModel__externalModel____packagedElement,
				jm2um__umlModel____target, rootModel__sourceRefModel____packagedElement,
				jm2um2__externalModel____target, jm2um__javaModel____source };
	}

	public static final void pattern_JavaModel2UmlModelRule_1_5_registerobjects_expressionBBBBBBBBBBBB(
			JavaModel2UmlModelRule _this, PerformRuleResult ruleresult, EObject rootModel, EObject umlModel,
			EObject jm2commonTypes, EObject sourceRefModel, EObject jm2um3, EObject commonTypes, EObject jm2um2,
			EObject externalModel, EObject javaModel, EObject jm2um) {
		_this.registerObjects_FWD(ruleresult, rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes,
				jm2um2, externalModel, javaModel, jm2um);

	}

	public static final PerformRuleResult pattern_JavaModel2UmlModelRule_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_bindingFB(
			JavaModel2UmlModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			JavaModel2UmlModelRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			JavaModel2UmlModelRule _this) {
		Object[] result_pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_binding = pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_black = pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaModel2UmlModelRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("javaModel");
		EObject tmpJavaModel = _localVariable_0;
		if (tmpJavaModel instanceof MGravityModel) {
			MGravityModel javaModel = (MGravityModel) tmpJavaModel;
			return new Object[] { javaModel, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaModel2UmlModelRule_2_2_corematch_blackBB(MGravityModel javaModel,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { javaModel, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaModel2UmlModelRule_2_3_findcontext_blackB(
			MGravityModel javaModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { javaModel });
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_3_findcontext_greenBF(MGravityModel javaModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(javaModel);
		return new Object[] { javaModel, isApplicableMatch };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_4_solveCSP_bindingFBBB(JavaModel2UmlModelRule _this,
			IsApplicableMatch isApplicableMatch, MGravityModel javaModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, javaModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, javaModel };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_4_solveCSP_bindingAndBlackFBBB(
			JavaModel2UmlModelRule _this, IsApplicableMatch isApplicableMatch, MGravityModel javaModel) {
		Object[] result_pattern_JavaModel2UmlModelRule_2_4_solveCSP_binding = pattern_JavaModel2UmlModelRule_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, javaModel);
		if (result_pattern_JavaModel2UmlModelRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaModel2UmlModelRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_2_4_solveCSP_black = pattern_JavaModel2UmlModelRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaModel2UmlModelRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, javaModel };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_2_5_checkCSP_expressionFBB(JavaModel2UmlModelRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaModel2UmlModelRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaModel2UmlModelRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_10_1_initialbindings_blackBBBBBBB(
			JavaModel2UmlModelRule _this, Match match, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!sourceRefModel.equals(umlModel)) {
					if (!commonTypes.equals(rootModel)) {
						if (!commonTypes.equals(umlModel)) {
							if (!commonTypes.equals(sourceRefModel)) {
								if (!commonTypes.equals(externalModel)) {
									if (!externalModel.equals(rootModel)) {
										if (!externalModel.equals(umlModel)) {
											if (!externalModel.equals(sourceRefModel)) {
												return new Object[] { _this, match, rootModel, umlModel, sourceRefModel,
														commonTypes, externalModel };
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_10_2_SolveCSP_bindingFBBBBBBB(
			JavaModel2UmlModelRule _this, Match match, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, rootModel, umlModel, sourceRefModel, commonTypes,
				externalModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, rootModel, umlModel, sourceRefModel, commonTypes, externalModel };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_10_2_SolveCSP_bindingAndBlackFBBBBBBB(
			JavaModel2UmlModelRule _this, Match match, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		Object[] result_pattern_JavaModel2UmlModelRule_10_2_SolveCSP_binding = pattern_JavaModel2UmlModelRule_10_2_SolveCSP_bindingFBBBBBBB(
				_this, match, rootModel, umlModel, sourceRefModel, commonTypes, externalModel);
		if (result_pattern_JavaModel2UmlModelRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaModel2UmlModelRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_10_2_SolveCSP_black = pattern_JavaModel2UmlModelRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_JavaModel2UmlModelRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, rootModel, umlModel, sourceRefModel, commonTypes,
						externalModel };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_10_3_CheckCSP_expressionFBB(JavaModel2UmlModelRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_10_4_collectelementstobetranslated_blackBBBBBB(
			Match match, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!sourceRefModel.equals(umlModel)) {
					if (!commonTypes.equals(rootModel)) {
						if (!commonTypes.equals(umlModel)) {
							if (!commonTypes.equals(sourceRefModel)) {
								if (!commonTypes.equals(externalModel)) {
									if (!externalModel.equals(rootModel)) {
										if (!externalModel.equals(umlModel)) {
											if (!externalModel.equals(sourceRefModel)) {
												return new Object[] { match, rootModel, umlModel, sourceRefModel,
														commonTypes, externalModel };
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_10_4_collectelementstobetranslated_greenBBBBBBFFFF(
			Match match, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		EMoflonEdge rootModel__umlModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlModel__commonTypes____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge rootModel__externalModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge rootModel__sourceRefModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(rootModel);
		match.getToBeTranslatedNodes().add(umlModel);
		match.getToBeTranslatedNodes().add(sourceRefModel);
		match.getToBeTranslatedNodes().add(commonTypes);
		match.getToBeTranslatedNodes().add(externalModel);
		String rootModel__umlModel____packagedElement_name_prime = "packagedElement";
		String umlModel__commonTypes____packagedElement_name_prime = "packagedElement";
		String rootModel__externalModel____packagedElement_name_prime = "packagedElement";
		String rootModel__sourceRefModel____packagedElement_name_prime = "packagedElement";
		rootModel__umlModel____packagedElement.setSrc(rootModel);
		rootModel__umlModel____packagedElement.setTrg(umlModel);
		match.getToBeTranslatedEdges().add(rootModel__umlModel____packagedElement);
		umlModel__commonTypes____packagedElement.setSrc(umlModel);
		umlModel__commonTypes____packagedElement.setTrg(commonTypes);
		match.getToBeTranslatedEdges().add(umlModel__commonTypes____packagedElement);
		rootModel__externalModel____packagedElement.setSrc(rootModel);
		rootModel__externalModel____packagedElement.setTrg(externalModel);
		match.getToBeTranslatedEdges().add(rootModel__externalModel____packagedElement);
		rootModel__sourceRefModel____packagedElement.setSrc(rootModel);
		rootModel__sourceRefModel____packagedElement.setTrg(sourceRefModel);
		match.getToBeTranslatedEdges().add(rootModel__sourceRefModel____packagedElement);
		rootModel__umlModel____packagedElement.setName(rootModel__umlModel____packagedElement_name_prime);
		umlModel__commonTypes____packagedElement.setName(umlModel__commonTypes____packagedElement_name_prime);
		rootModel__externalModel____packagedElement.setName(rootModel__externalModel____packagedElement_name_prime);
		rootModel__sourceRefModel____packagedElement.setName(rootModel__sourceRefModel____packagedElement_name_prime);
		return new Object[] { match, rootModel, umlModel, sourceRefModel, commonTypes, externalModel,
				rootModel__umlModel____packagedElement, umlModel__commonTypes____packagedElement,
				rootModel__externalModel____packagedElement, rootModel__sourceRefModel____packagedElement };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_10_5_collectcontextelements_blackBBBBBB(Match match,
			Model rootModel, Model umlModel, Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes,
			Model externalModel) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!sourceRefModel.equals(umlModel)) {
					if (!commonTypes.equals(rootModel)) {
						if (!commonTypes.equals(umlModel)) {
							if (!commonTypes.equals(sourceRefModel)) {
								if (!commonTypes.equals(externalModel)) {
									if (!externalModel.equals(rootModel)) {
										if (!externalModel.equals(umlModel)) {
											if (!externalModel.equals(sourceRefModel)) {
												return new Object[] { match, rootModel, umlModel, sourceRefModel,
														commonTypes, externalModel };
											}
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

	public static final void pattern_JavaModel2UmlModelRule_10_6_registerobjectstomatch_expressionBBBBBBB(
			JavaModel2UmlModelRule _this, Match match, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		_this.registerObjectsToMatch_BWD(match, rootModel, umlModel, sourceRefModel, commonTypes, externalModel);

	}

	public static final boolean pattern_JavaModel2UmlModelRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("rootModel");
		EObject _localVariable_1 = isApplicableMatch.getObject("umlModel");
		EObject _localVariable_2 = isApplicableMatch.getObject("sourceRefModel");
		EObject _localVariable_3 = isApplicableMatch.getObject("commonTypes");
		EObject _localVariable_4 = isApplicableMatch.getObject("externalModel");
		EObject tmpRootModel = _localVariable_0;
		EObject tmpUmlModel = _localVariable_1;
		EObject tmpSourceRefModel = _localVariable_2;
		EObject tmpCommonTypes = _localVariable_3;
		EObject tmpExternalModel = _localVariable_4;
		if (tmpRootModel instanceof Model) {
			Model rootModel = (Model) tmpRootModel;
			if (tmpUmlModel instanceof Model) {
				Model umlModel = (Model) tmpUmlModel;
				if (tmpSourceRefModel instanceof Model) {
					Model sourceRefModel = (Model) tmpSourceRefModel;
					if (tmpCommonTypes instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) tmpCommonTypes;
						if (tmpExternalModel instanceof Model) {
							Model externalModel = (Model) tmpExternalModel;
							return new Object[] { rootModel, umlModel, sourceRefModel, commonTypes, externalModel,
									isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_11_1_performtransformation_blackBBBBBFBB(
			Model rootModel, Model umlModel, Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes,
			Model externalModel, JavaModel2UmlModelRule _this, IsApplicableMatch isApplicableMatch) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!sourceRefModel.equals(umlModel)) {
					if (!commonTypes.equals(rootModel)) {
						if (!commonTypes.equals(umlModel)) {
							if (!commonTypes.equals(sourceRefModel)) {
								if (!commonTypes.equals(externalModel)) {
									if (!externalModel.equals(rootModel)) {
										if (!externalModel.equals(umlModel)) {
											if (!externalModel.equals(sourceRefModel)) {
												for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
													if (tmpCsp instanceof CSP) {
														CSP csp = (CSP) tmpCsp;
														return new Object[] { rootModel, umlModel, sourceRefModel,
																commonTypes, externalModel, csp, _this,
																isApplicableMatch };
													}
												}
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			JavaModel2UmlModelRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_JavaModel2UmlModelRule_11_1_performtransformation_binding = pattern_JavaModel2UmlModelRule_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_JavaModel2UmlModelRule_11_1_performtransformation_binding != null) {
			Model rootModel = (Model) result_pattern_JavaModel2UmlModelRule_11_1_performtransformation_binding[0];
			Model umlModel = (Model) result_pattern_JavaModel2UmlModelRule_11_1_performtransformation_binding[1];
			Model sourceRefModel = (Model) result_pattern_JavaModel2UmlModelRule_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) result_pattern_JavaModel2UmlModelRule_11_1_performtransformation_binding[3];
			Model externalModel = (Model) result_pattern_JavaModel2UmlModelRule_11_1_performtransformation_binding[4];

			Object[] result_pattern_JavaModel2UmlModelRule_11_1_performtransformation_black = pattern_JavaModel2UmlModelRule_11_1_performtransformation_blackBBBBBFBB(
					rootModel, umlModel, sourceRefModel, commonTypes, externalModel, _this, isApplicableMatch);
			if (result_pattern_JavaModel2UmlModelRule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_JavaModel2UmlModelRule_11_1_performtransformation_black[5];

				return new Object[] { rootModel, umlModel, sourceRefModel, commonTypes, externalModel, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_11_1_performtransformation_greenBFBFBFBFFB(
			Model umlModel, Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel,
			CSP csp) {
		JavaModel2UMLPackage jm2commonTypes = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		JavaModel2UMLPackage jm2um3 = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		JavaModel2UMLPackage jm2um2 = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		MGravityModel javaModel = ModiscoFactory.eINSTANCE.createMGravityModel();
		JavaModel2UMLPackage jm2um = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		Object _localVariable_0 = csp.getValue("javaModel", "name");
		jm2commonTypes.setTarget(commonTypes);
		jm2um3.setTarget(sourceRefModel);
		jm2um2.setTarget(externalModel);
		jm2um3.setSource(javaModel);
		jm2um2.setSource(javaModel);
		jm2commonTypes.setSource(javaModel);
		jm2um.setTarget(umlModel);
		jm2um.setSource(javaModel);
		String javaModel_name_prime = (String) _localVariable_0;
		javaModel.setName(javaModel_name_prime);
		return new Object[] { umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2, externalModel,
				javaModel, jm2um, csp };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_11_2_collecttranslatedelements_blackBBBBBBBBBB(
			Model rootModel, Model umlModel, JavaModel2UMLPackage jm2commonTypes, Model sourceRefModel,
			JavaModel2UMLPackage jm2um3, org.eclipse.uml2.uml.Package commonTypes, JavaModel2UMLPackage jm2um2,
			Model externalModel, MGravityModel javaModel, JavaModel2UMLPackage jm2um) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!jm2commonTypes.equals(jm2um3)) {
					if (!jm2commonTypes.equals(jm2um2)) {
						if (!jm2commonTypes.equals(jm2um)) {
							if (!sourceRefModel.equals(umlModel)) {
								if (!commonTypes.equals(rootModel)) {
									if (!commonTypes.equals(umlModel)) {
										if (!commonTypes.equals(sourceRefModel)) {
											if (!commonTypes.equals(externalModel)) {
												if (!jm2um2.equals(jm2um3)) {
													if (!externalModel.equals(rootModel)) {
														if (!externalModel.equals(umlModel)) {
															if (!externalModel.equals(sourceRefModel)) {
																if (!jm2um.equals(jm2um3)) {
																	if (!jm2um.equals(jm2um2)) {
																		return new Object[] { rootModel, umlModel,
																				jm2commonTypes, sourceRefModel, jm2um3,
																				commonTypes, jm2um2, externalModel,
																				javaModel, jm2um };
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_11_2_collecttranslatedelements_greenFBBBBBBBBBB(
			Model rootModel, Model umlModel, JavaModel2UMLPackage jm2commonTypes, Model sourceRefModel,
			JavaModel2UMLPackage jm2um3, org.eclipse.uml2.uml.Package commonTypes, JavaModel2UMLPackage jm2um2,
			Model externalModel, MGravityModel javaModel, JavaModel2UMLPackage jm2um) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(rootModel);
		ruleresult.getTranslatedElements().add(umlModel);
		ruleresult.getCreatedLinkElements().add(jm2commonTypes);
		ruleresult.getTranslatedElements().add(sourceRefModel);
		ruleresult.getCreatedLinkElements().add(jm2um3);
		ruleresult.getTranslatedElements().add(commonTypes);
		ruleresult.getCreatedLinkElements().add(jm2um2);
		ruleresult.getTranslatedElements().add(externalModel);
		ruleresult.getCreatedElements().add(javaModel);
		ruleresult.getCreatedLinkElements().add(jm2um);
		return new Object[] { ruleresult, rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes,
				jm2um2, externalModel, javaModel, jm2um };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject rootModel, EObject umlModel, EObject jm2commonTypes,
			EObject sourceRefModel, EObject jm2um3, EObject commonTypes, EObject jm2um2, EObject externalModel,
			EObject javaModel, EObject jm2um) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!jm2commonTypes.equals(rootModel)) {
					if (!jm2commonTypes.equals(umlModel)) {
						if (!jm2commonTypes.equals(sourceRefModel)) {
							if (!jm2commonTypes.equals(jm2um3)) {
								if (!jm2commonTypes.equals(jm2um2)) {
									if (!jm2commonTypes.equals(jm2um)) {
										if (!sourceRefModel.equals(umlModel)) {
											if (!jm2um3.equals(rootModel)) {
												if (!jm2um3.equals(umlModel)) {
													if (!jm2um3.equals(sourceRefModel)) {
														if (!commonTypes.equals(rootModel)) {
															if (!commonTypes.equals(umlModel)) {
																if (!commonTypes.equals(jm2commonTypes)) {
																	if (!commonTypes.equals(sourceRefModel)) {
																		if (!commonTypes.equals(jm2um3)) {
																			if (!commonTypes.equals(jm2um2)) {
																				if (!commonTypes
																						.equals(externalModel)) {
																					if (!commonTypes
																							.equals(javaModel)) {
																						if (!commonTypes
																								.equals(jm2um)) {
																							if (!jm2um2.equals(
																									rootModel)) {
																								if (!jm2um2.equals(
																										umlModel)) {
																									if (!jm2um2.equals(
																											sourceRefModel)) {
																										if (!jm2um2
																												.equals(jm2um3)) {
																											if (!externalModel
																													.equals(rootModel)) {
																												if (!externalModel
																														.equals(umlModel)) {
																													if (!externalModel
																															.equals(jm2commonTypes)) {
																														if (!externalModel
																																.equals(sourceRefModel)) {
																															if (!externalModel
																																	.equals(jm2um3)) {
																																if (!externalModel
																																		.equals(jm2um2)) {
																																	if (!externalModel
																																			.equals(javaModel)) {
																																		if (!externalModel
																																				.equals(jm2um)) {
																																			if (!javaModel
																																					.equals(rootModel)) {
																																				if (!javaModel
																																						.equals(umlModel)) {
																																					if (!javaModel
																																							.equals(jm2commonTypes)) {
																																						if (!javaModel
																																								.equals(sourceRefModel)) {
																																							if (!javaModel
																																									.equals(jm2um3)) {
																																								if (!javaModel
																																										.equals(jm2um2)) {
																																									if (!javaModel
																																											.equals(jm2um)) {
																																										if (!jm2um
																																												.equals(rootModel)) {
																																											if (!jm2um
																																													.equals(umlModel)) {
																																												if (!jm2um
																																														.equals(sourceRefModel)) {
																																													if (!jm2um
																																															.equals(jm2um3)) {
																																														if (!jm2um
																																																.equals(jm2um2)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	rootModel,
																																																	umlModel,
																																																	jm2commonTypes,
																																																	sourceRefModel,
																																																	jm2um3,
																																																	commonTypes,
																																																	jm2um2,
																																																	externalModel,
																																																	javaModel,
																																																	jm2um };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_11_3_bookkeepingforedges_greenBBBBBBBBBBBFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject rootModel, EObject umlModel, EObject jm2commonTypes,
			EObject sourceRefModel, EObject jm2um3, EObject commonTypes, EObject jm2um2, EObject externalModel,
			EObject javaModel, EObject jm2um) {
		EMoflonEdge rootModel__umlModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlModel__commonTypes____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um3__sourceRefModel____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2commonTypes__commonTypes____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um3__javaModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um2__javaModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2commonTypes__javaModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge rootModel__externalModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__umlModel____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge rootModel__sourceRefModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um2__externalModel____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jm2um__javaModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "JavaModel2UmlModelRule";
		String rootModel__umlModel____packagedElement_name_prime = "packagedElement";
		String umlModel__commonTypes____packagedElement_name_prime = "packagedElement";
		String jm2um3__sourceRefModel____target_name_prime = "target";
		String jm2commonTypes__commonTypes____target_name_prime = "target";
		String jm2um3__javaModel____source_name_prime = "source";
		String jm2um2__javaModel____source_name_prime = "source";
		String jm2commonTypes__javaModel____source_name_prime = "source";
		String rootModel__externalModel____packagedElement_name_prime = "packagedElement";
		String jm2um__umlModel____target_name_prime = "target";
		String rootModel__sourceRefModel____packagedElement_name_prime = "packagedElement";
		String jm2um2__externalModel____target_name_prime = "target";
		String jm2um__javaModel____source_name_prime = "source";
		rootModel__umlModel____packagedElement.setSrc(rootModel);
		rootModel__umlModel____packagedElement.setTrg(umlModel);
		ruleresult.getTranslatedEdges().add(rootModel__umlModel____packagedElement);
		umlModel__commonTypes____packagedElement.setSrc(umlModel);
		umlModel__commonTypes____packagedElement.setTrg(commonTypes);
		ruleresult.getTranslatedEdges().add(umlModel__commonTypes____packagedElement);
		jm2um3__sourceRefModel____target.setSrc(jm2um3);
		jm2um3__sourceRefModel____target.setTrg(sourceRefModel);
		ruleresult.getCreatedEdges().add(jm2um3__sourceRefModel____target);
		jm2commonTypes__commonTypes____target.setSrc(jm2commonTypes);
		jm2commonTypes__commonTypes____target.setTrg(commonTypes);
		ruleresult.getCreatedEdges().add(jm2commonTypes__commonTypes____target);
		jm2um3__javaModel____source.setSrc(jm2um3);
		jm2um3__javaModel____source.setTrg(javaModel);
		ruleresult.getCreatedEdges().add(jm2um3__javaModel____source);
		jm2um2__javaModel____source.setSrc(jm2um2);
		jm2um2__javaModel____source.setTrg(javaModel);
		ruleresult.getCreatedEdges().add(jm2um2__javaModel____source);
		jm2commonTypes__javaModel____source.setSrc(jm2commonTypes);
		jm2commonTypes__javaModel____source.setTrg(javaModel);
		ruleresult.getCreatedEdges().add(jm2commonTypes__javaModel____source);
		rootModel__externalModel____packagedElement.setSrc(rootModel);
		rootModel__externalModel____packagedElement.setTrg(externalModel);
		ruleresult.getTranslatedEdges().add(rootModel__externalModel____packagedElement);
		jm2um__umlModel____target.setSrc(jm2um);
		jm2um__umlModel____target.setTrg(umlModel);
		ruleresult.getCreatedEdges().add(jm2um__umlModel____target);
		rootModel__sourceRefModel____packagedElement.setSrc(rootModel);
		rootModel__sourceRefModel____packagedElement.setTrg(sourceRefModel);
		ruleresult.getTranslatedEdges().add(rootModel__sourceRefModel____packagedElement);
		jm2um2__externalModel____target.setSrc(jm2um2);
		jm2um2__externalModel____target.setTrg(externalModel);
		ruleresult.getCreatedEdges().add(jm2um2__externalModel____target);
		jm2um__javaModel____source.setSrc(jm2um);
		jm2um__javaModel____source.setTrg(javaModel);
		ruleresult.getCreatedEdges().add(jm2um__javaModel____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		rootModel__umlModel____packagedElement.setName(rootModel__umlModel____packagedElement_name_prime);
		umlModel__commonTypes____packagedElement.setName(umlModel__commonTypes____packagedElement_name_prime);
		jm2um3__sourceRefModel____target.setName(jm2um3__sourceRefModel____target_name_prime);
		jm2commonTypes__commonTypes____target.setName(jm2commonTypes__commonTypes____target_name_prime);
		jm2um3__javaModel____source.setName(jm2um3__javaModel____source_name_prime);
		jm2um2__javaModel____source.setName(jm2um2__javaModel____source_name_prime);
		jm2commonTypes__javaModel____source.setName(jm2commonTypes__javaModel____source_name_prime);
		rootModel__externalModel____packagedElement.setName(rootModel__externalModel____packagedElement_name_prime);
		jm2um__umlModel____target.setName(jm2um__umlModel____target_name_prime);
		rootModel__sourceRefModel____packagedElement.setName(rootModel__sourceRefModel____packagedElement_name_prime);
		jm2um2__externalModel____target.setName(jm2um2__externalModel____target_name_prime);
		jm2um__javaModel____source.setName(jm2um__javaModel____source_name_prime);
		return new Object[] { ruleresult, rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes,
				jm2um2, externalModel, javaModel, jm2um, rootModel__umlModel____packagedElement,
				umlModel__commonTypes____packagedElement, jm2um3__sourceRefModel____target,
				jm2commonTypes__commonTypes____target, jm2um3__javaModel____source, jm2um2__javaModel____source,
				jm2commonTypes__javaModel____source, rootModel__externalModel____packagedElement,
				jm2um__umlModel____target, rootModel__sourceRefModel____packagedElement,
				jm2um2__externalModel____target, jm2um__javaModel____source };
	}

	public static final void pattern_JavaModel2UmlModelRule_11_5_registerobjects_expressionBBBBBBBBBBBB(
			JavaModel2UmlModelRule _this, PerformRuleResult ruleresult, EObject rootModel, EObject umlModel,
			EObject jm2commonTypes, EObject sourceRefModel, EObject jm2um3, EObject commonTypes, EObject jm2um2,
			EObject externalModel, EObject javaModel, EObject jm2um) {
		_this.registerObjects_BWD(ruleresult, rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes,
				jm2um2, externalModel, javaModel, jm2um);

	}

	public static final PerformRuleResult pattern_JavaModel2UmlModelRule_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_bindingFB(
			JavaModel2UmlModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_blackFBB(EClass eClass,
			JavaModel2UmlModelRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_bindingAndBlackFFB(
			JavaModel2UmlModelRule _this) {
		Object[] result_pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_binding = pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_black = pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "JavaModel2UmlModelRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_12_2_corematch_bindingFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("rootModel");
		EObject _localVariable_1 = match.getObject("umlModel");
		EObject _localVariable_2 = match.getObject("sourceRefModel");
		EObject _localVariable_3 = match.getObject("commonTypes");
		EObject _localVariable_4 = match.getObject("externalModel");
		EObject tmpRootModel = _localVariable_0;
		EObject tmpUmlModel = _localVariable_1;
		EObject tmpSourceRefModel = _localVariable_2;
		EObject tmpCommonTypes = _localVariable_3;
		EObject tmpExternalModel = _localVariable_4;
		if (tmpRootModel instanceof Model) {
			Model rootModel = (Model) tmpRootModel;
			if (tmpUmlModel instanceof Model) {
				Model umlModel = (Model) tmpUmlModel;
				if (tmpSourceRefModel instanceof Model) {
					Model sourceRefModel = (Model) tmpSourceRefModel;
					if (tmpCommonTypes instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) tmpCommonTypes;
						if (tmpExternalModel instanceof Model) {
							Model externalModel = (Model) tmpExternalModel;
							return new Object[] { rootModel, umlModel, sourceRefModel, commonTypes, externalModel,
									match };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_JavaModel2UmlModelRule_12_2_corematch_blackBBBBBB(Model rootModel,
			Model umlModel, Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!sourceRefModel.equals(umlModel)) {
					if (!commonTypes.equals(rootModel)) {
						if (!commonTypes.equals(umlModel)) {
							if (!commonTypes.equals(sourceRefModel)) {
								if (!commonTypes.equals(externalModel)) {
									if (!externalModel.equals(rootModel)) {
										if (!externalModel.equals(umlModel)) {
											if (!externalModel.equals(sourceRefModel)) {
												String rootModel_name = rootModel.getName();
												if (rootModel_name.equals("root model")) {
													String sourceRefModel_name = sourceRefModel.getName();
													if (sourceRefModel_name.equals("source references")) {
														String commonTypes_name = commonTypes.getName();
														if (commonTypes_name.equals("Common Java datatypes")) {
															String externalModel_name = externalModel.getName();
															if (externalModel_name.equals("externals")) {
																_result.add(new Object[] { rootModel, umlModel,
																		sourceRefModel, commonTypes, externalModel,
																		match });
															}

														}

													}

												}

											}
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

	public static final Iterable<Object[]> pattern_JavaModel2UmlModelRule_12_3_findcontext_blackBBBBB(Model rootModel,
			Model umlModel, Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!sourceRefModel.equals(umlModel)) {
					if (!commonTypes.equals(rootModel)) {
						if (!commonTypes.equals(umlModel)) {
							if (!commonTypes.equals(sourceRefModel)) {
								if (!commonTypes.equals(externalModel)) {
									if (!externalModel.equals(rootModel)) {
										if (!externalModel.equals(umlModel)) {
											if (!externalModel.equals(sourceRefModel)) {
												if (rootModel.getPackagedElements().contains(umlModel)) {
													if (umlModel.getPackagedElements().contains(commonTypes)) {
														if (rootModel.getPackagedElements().contains(externalModel)) {
															if (rootModel.getPackagedElements()
																	.contains(sourceRefModel)) {
																String rootModel_name = rootModel.getName();
																if (rootModel_name.equals("root model")) {
																	String sourceRefModel_name = sourceRefModel
																			.getName();
																	if (sourceRefModel_name
																			.equals("source references")) {
																		String commonTypes_name = commonTypes.getName();
																		if (commonTypes_name
																				.equals("Common Java datatypes")) {
																			String externalModel_name = externalModel
																					.getName();
																			if (externalModel_name
																					.equals("externals")) {
																				_result.add(new Object[] { rootModel,
																						umlModel, sourceRefModel,
																						commonTypes, externalModel });
																			}

																		}

																	}

																}

															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_12_3_findcontext_greenBBBBBFFFFF(Model rootModel,
			Model umlModel, Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge rootModel__umlModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlModel__commonTypes____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge rootModel__externalModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge rootModel__sourceRefModel____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String rootModel__umlModel____packagedElement_name_prime = "packagedElement";
		String umlModel__commonTypes____packagedElement_name_prime = "packagedElement";
		String rootModel__externalModel____packagedElement_name_prime = "packagedElement";
		String rootModel__sourceRefModel____packagedElement_name_prime = "packagedElement";
		isApplicableMatch.getAllContextElements().add(rootModel);
		isApplicableMatch.getAllContextElements().add(umlModel);
		isApplicableMatch.getAllContextElements().add(sourceRefModel);
		isApplicableMatch.getAllContextElements().add(commonTypes);
		isApplicableMatch.getAllContextElements().add(externalModel);
		rootModel__umlModel____packagedElement.setSrc(rootModel);
		rootModel__umlModel____packagedElement.setTrg(umlModel);
		isApplicableMatch.getAllContextElements().add(rootModel__umlModel____packagedElement);
		umlModel__commonTypes____packagedElement.setSrc(umlModel);
		umlModel__commonTypes____packagedElement.setTrg(commonTypes);
		isApplicableMatch.getAllContextElements().add(umlModel__commonTypes____packagedElement);
		rootModel__externalModel____packagedElement.setSrc(rootModel);
		rootModel__externalModel____packagedElement.setTrg(externalModel);
		isApplicableMatch.getAllContextElements().add(rootModel__externalModel____packagedElement);
		rootModel__sourceRefModel____packagedElement.setSrc(rootModel);
		rootModel__sourceRefModel____packagedElement.setTrg(sourceRefModel);
		isApplicableMatch.getAllContextElements().add(rootModel__sourceRefModel____packagedElement);
		rootModel__umlModel____packagedElement.setName(rootModel__umlModel____packagedElement_name_prime);
		umlModel__commonTypes____packagedElement.setName(umlModel__commonTypes____packagedElement_name_prime);
		rootModel__externalModel____packagedElement.setName(rootModel__externalModel____packagedElement_name_prime);
		rootModel__sourceRefModel____packagedElement.setName(rootModel__sourceRefModel____packagedElement_name_prime);
		return new Object[] { rootModel, umlModel, sourceRefModel, commonTypes, externalModel, isApplicableMatch,
				rootModel__umlModel____packagedElement, umlModel__commonTypes____packagedElement,
				rootModel__externalModel____packagedElement, rootModel__sourceRefModel____packagedElement };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_12_4_solveCSP_bindingFBBBBBBB(
			JavaModel2UmlModelRule _this, IsApplicableMatch isApplicableMatch, Model rootModel, Model umlModel,
			Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, rootModel, umlModel, sourceRefModel,
				commonTypes, externalModel);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, rootModel, umlModel, sourceRefModel, commonTypes,
					externalModel };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			JavaModel2UmlModelRule _this, IsApplicableMatch isApplicableMatch, Model rootModel, Model umlModel,
			Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		Object[] result_pattern_JavaModel2UmlModelRule_12_4_solveCSP_binding = pattern_JavaModel2UmlModelRule_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, rootModel, umlModel, sourceRefModel, commonTypes, externalModel);
		if (result_pattern_JavaModel2UmlModelRule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaModel2UmlModelRule_12_4_solveCSP_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_12_4_solveCSP_black = pattern_JavaModel2UmlModelRule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_JavaModel2UmlModelRule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, rootModel, umlModel, sourceRefModel, commonTypes,
						externalModel };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_12_5_checkCSP_expressionFBB(JavaModel2UmlModelRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "JavaModel2UmlModelRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaModel2UmlModelRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_bindingFB(
			JavaModel2UmlModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			JavaModel2UmlModelRule _this) {
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

	public static final Object[] pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaModel2UmlModelRule _this) {
		Object[] result_pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_binding = pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_black = pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_JavaModel2UmlModelRule_20_2_testcorematchandDECs_blackB(
			MGravityModel javaModel) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { javaModel });
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaModel2UmlModelRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			JavaModel2UmlModelRule _this, Match match, MGravityModel javaModel) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, javaModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaModel2UmlModelRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaModel2UmlModelRule_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_bindingFB(
			JavaModel2UmlModelRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			JavaModel2UmlModelRule _this) {
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

	public static final Object[] pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			JavaModel2UmlModelRule _this) {
		Object[] result_pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_binding = pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_black = pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_JavaModel2UmlModelRule_21_2_testcorematchandDECs_blackFFFFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpRootModel = _edge_packagedElement.getSrc();
		if (tmpRootModel instanceof Model) {
			Model rootModel = (Model) tmpRootModel;
			EObject tmpUmlModel = _edge_packagedElement.getTrg();
			if (tmpUmlModel instanceof Model) {
				Model umlModel = (Model) tmpUmlModel;
				if (!rootModel.equals(umlModel)) {
					if (rootModel.getPackagedElements().contains(umlModel)) {
						String rootModel_name = rootModel.getName();
						if (rootModel_name.equals("root model")) {
							for (PackageableElement tmpExternalModel : rootModel.getPackagedElements()) {
								if (tmpExternalModel instanceof Model) {
									Model externalModel = (Model) tmpExternalModel;
									if (!externalModel.equals(rootModel)) {
										if (!externalModel.equals(umlModel)) {
											String externalModel_name = externalModel.getName();
											if (externalModel_name.equals("externals")) {
												for (PackageableElement tmpSourceRefModel : rootModel
														.getPackagedElements()) {
													if (tmpSourceRefModel instanceof Model) {
														Model sourceRefModel = (Model) tmpSourceRefModel;
														if (!rootModel.equals(sourceRefModel)) {
															if (!sourceRefModel.equals(umlModel)) {
																if (!externalModel.equals(sourceRefModel)) {
																	String sourceRefModel_name = sourceRefModel
																			.getName();
																	if (sourceRefModel_name
																			.equals("source references")) {
																		for (PackageableElement tmpCommonTypes : umlModel
																				.getPackagedElements()) {
																			if (tmpCommonTypes instanceof org.eclipse.uml2.uml.Package) {
																				org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) tmpCommonTypes;
																				if (!commonTypes.equals(rootModel)) {
																					if (!commonTypes.equals(umlModel)) {
																						if (!commonTypes.equals(
																								sourceRefModel)) {
																							if (!commonTypes.equals(
																									externalModel)) {
																								String commonTypes_name = commonTypes
																										.getName();
																								if (commonTypes_name
																										.equals("Common Java datatypes")) {
																									_result.add(
																											new Object[] {
																													rootModel,
																													umlModel,
																													sourceRefModel,
																													commonTypes,
																													externalModel,
																													_edge_packagedElement });
																								}

																							}
																						}
																					}
																				}
																			}
																		}
																	}

																}
															}
														}
													}
												}
											}

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

	public static final Object[] pattern_JavaModel2UmlModelRule_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_JavaModel2UmlModelRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBB(
			JavaModel2UmlModelRule _this, Match match, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, rootModel, umlModel, sourceRefModel, commonTypes,
				externalModel);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			JavaModel2UmlModelRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_JavaModel2UmlModelRule_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_1_prepare_blackB(JavaModel2UmlModelRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("rootModel");
		EObject _localVariable_1 = targetMatch.getObject("umlModel");
		EObject _localVariable_2 = targetMatch.getObject("sourceRefModel");
		EObject _localVariable_3 = targetMatch.getObject("commonTypes");
		EObject _localVariable_4 = targetMatch.getObject("externalModel");
		EObject _localVariable_5 = sourceMatch.getObject("javaModel");
		EObject tmpRootModel = _localVariable_0;
		EObject tmpUmlModel = _localVariable_1;
		EObject tmpSourceRefModel = _localVariable_2;
		EObject tmpCommonTypes = _localVariable_3;
		EObject tmpExternalModel = _localVariable_4;
		EObject tmpJavaModel = _localVariable_5;
		if (tmpRootModel instanceof Model) {
			Model rootModel = (Model) tmpRootModel;
			if (tmpUmlModel instanceof Model) {
				Model umlModel = (Model) tmpUmlModel;
				if (tmpSourceRefModel instanceof Model) {
					Model sourceRefModel = (Model) tmpSourceRefModel;
					if (tmpCommonTypes instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) tmpCommonTypes;
						if (tmpExternalModel instanceof Model) {
							Model externalModel = (Model) tmpExternalModel;
							if (tmpJavaModel instanceof MGravityModel) {
								MGravityModel javaModel = (MGravityModel) tmpJavaModel;
								return new Object[] { rootModel, umlModel, sourceRefModel, commonTypes, externalModel,
										javaModel, targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_blackBBBBBBBB(Model rootModel,
			Model umlModel, Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel,
			MGravityModel javaModel, Match sourceMatch, Match targetMatch) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!sourceRefModel.equals(umlModel)) {
					if (!commonTypes.equals(rootModel)) {
						if (!commonTypes.equals(umlModel)) {
							if (!commonTypes.equals(sourceRefModel)) {
								if (!commonTypes.equals(externalModel)) {
									if (!externalModel.equals(rootModel)) {
										if (!externalModel.equals(umlModel)) {
											if (!externalModel.equals(sourceRefModel)) {
												if (!sourceMatch.equals(targetMatch)) {
													String rootModel_name = rootModel.getName();
													if (rootModel_name.equals("root model")) {
														String sourceRefModel_name = sourceRefModel.getName();
														if (sourceRefModel_name.equals("source references")) {
															String commonTypes_name = commonTypes.getName();
															if (commonTypes_name.equals("Common Java datatypes")) {
																String externalModel_name = externalModel.getName();
																if (externalModel_name.equals("externals")) {
																	return new Object[] { rootModel, umlModel,
																			sourceRefModel, commonTypes, externalModel,
																			javaModel, sourceMatch, targetMatch };
																}

															}

														}

													}

												}
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_binding = pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_binding != null) {
			Model rootModel = (Model) result_pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_binding[0];
			Model umlModel = (Model) result_pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_binding[1];
			Model sourceRefModel = (Model) result_pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Package commonTypes = (org.eclipse.uml2.uml.Package) result_pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_binding[3];
			Model externalModel = (Model) result_pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_binding[4];
			MGravityModel javaModel = (MGravityModel) result_pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_black = pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_blackBBBBBBBB(
					rootModel, umlModel, sourceRefModel, commonTypes, externalModel, javaModel, sourceMatch,
					targetMatch);
			if (result_pattern_JavaModel2UmlModelRule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { rootModel, umlModel, sourceRefModel, commonTypes, externalModel, javaModel,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_3_solvecsp_bindingFBBBBBBBBB(
			JavaModel2UmlModelRule _this, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel, MGravityModel javaModel, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(rootModel, umlModel, sourceRefModel, commonTypes,
				externalModel, javaModel, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, rootModel, umlModel, sourceRefModel, commonTypes, externalModel,
					javaModel, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			JavaModel2UmlModelRule _this, Model rootModel, Model umlModel, Model sourceRefModel,
			org.eclipse.uml2.uml.Package commonTypes, Model externalModel, MGravityModel javaModel, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_JavaModel2UmlModelRule_24_3_solvecsp_binding = pattern_JavaModel2UmlModelRule_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, rootModel, umlModel, sourceRefModel, commonTypes, externalModel, javaModel, sourceMatch,
				targetMatch);
		if (result_pattern_JavaModel2UmlModelRule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_JavaModel2UmlModelRule_24_3_solvecsp_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_24_3_solvecsp_black = pattern_JavaModel2UmlModelRule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_JavaModel2UmlModelRule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, rootModel, umlModel, sourceRefModel, commonTypes, externalModel,
						javaModel, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_JavaModel2UmlModelRule_24_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "JavaModel2UmlModelRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_6_createcorrespondence_blackBBBBBBB(Model rootModel,
			Model umlModel, Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel,
			MGravityModel javaModel, CCMatch ccMatch) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!sourceRefModel.equals(umlModel)) {
					if (!commonTypes.equals(rootModel)) {
						if (!commonTypes.equals(umlModel)) {
							if (!commonTypes.equals(sourceRefModel)) {
								if (!commonTypes.equals(externalModel)) {
									if (!externalModel.equals(rootModel)) {
										if (!externalModel.equals(umlModel)) {
											if (!externalModel.equals(sourceRefModel)) {
												return new Object[] { rootModel, umlModel, sourceRefModel, commonTypes,
														externalModel, javaModel, ccMatch };
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_24_6_createcorrespondence_greenBFBFBFBBFB(
			Model umlModel, Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel,
			MGravityModel javaModel, CCMatch ccMatch) {
		JavaModel2UMLPackage jm2commonTypes = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		JavaModel2UMLPackage jm2um3 = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		JavaModel2UMLPackage jm2um2 = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		JavaModel2UMLPackage jm2um = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		jm2commonTypes.setTarget(commonTypes);
		jm2commonTypes.setSource(javaModel);
		ccMatch.getCreateCorr().add(jm2commonTypes);
		jm2um3.setTarget(sourceRefModel);
		jm2um3.setSource(javaModel);
		ccMatch.getCreateCorr().add(jm2um3);
		jm2um2.setSource(javaModel);
		jm2um2.setTarget(externalModel);
		ccMatch.getCreateCorr().add(jm2um2);
		jm2um.setTarget(umlModel);
		jm2um.setSource(javaModel);
		ccMatch.getCreateCorr().add(jm2um);
		return new Object[] { umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2, externalModel,
				javaModel, jm2um, ccMatch };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "JavaModel2UmlModelRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_JavaModel2UmlModelRule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_27_1_matchtggpattern_blackB(MGravityModel javaModel) {
		return new Object[] { javaModel };
	}

	public static final boolean pattern_JavaModel2UmlModelRule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_28_1_matchtggpattern_blackBBBBB(Model rootModel,
			Model umlModel, Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		if (!rootModel.equals(umlModel)) {
			if (!rootModel.equals(sourceRefModel)) {
				if (!sourceRefModel.equals(umlModel)) {
					if (!commonTypes.equals(rootModel)) {
						if (!commonTypes.equals(umlModel)) {
							if (!commonTypes.equals(sourceRefModel)) {
								if (!commonTypes.equals(externalModel)) {
									if (!externalModel.equals(rootModel)) {
										if (!externalModel.equals(umlModel)) {
											if (!externalModel.equals(sourceRefModel)) {
												if (rootModel.getPackagedElements().contains(umlModel)) {
													if (umlModel.getPackagedElements().contains(commonTypes)) {
														if (rootModel.getPackagedElements().contains(externalModel)) {
															if (rootModel.getPackagedElements()
																	.contains(sourceRefModel)) {
																return new Object[] { rootModel, umlModel,
																		sourceRefModel, commonTypes, externalModel };
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_JavaModel2UmlModelRule_28_1_matchtggpattern_greenBBBB(Model rootModel,
			Model sourceRefModel, org.eclipse.uml2.uml.Package commonTypes, Model externalModel) {
		String rootModel_name_prime = "root model";
		String sourceRefModel_name_prime = "source references";
		String commonTypes_name_prime = "Common Java datatypes";
		String externalModel_name_prime = "externals";
		rootModel.setName(rootModel_name_prime);
		sourceRefModel.setName(sourceRefModel_name_prime);
		commonTypes.setName(commonTypes_name_prime);
		externalModel.setName(externalModel_name_prime);
		return new Object[] { rootModel, sourceRefModel, commonTypes, externalModel };
	}

	public static final boolean pattern_JavaModel2UmlModelRule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_29_1_createresult_blackB(JavaModel2UmlModelRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_29_2_isapplicablecore_blackB(
			JavaModel2UmlModelRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_29_3_solveCSP_bindingFBBB(JavaModel2UmlModelRule _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_29_3_solveCSP_bindingAndBlackFBBB(
			JavaModel2UmlModelRule _this, IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_JavaModel2UmlModelRule_29_3_solveCSP_binding = pattern_JavaModel2UmlModelRule_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_JavaModel2UmlModelRule_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_JavaModel2UmlModelRule_29_3_solveCSP_binding[0];

			Object[] result_pattern_JavaModel2UmlModelRule_29_3_solveCSP_black = pattern_JavaModel2UmlModelRule_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_JavaModel2UmlModelRule_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_JavaModel2UmlModelRule_29_4_checkCSP_expressionFBB(JavaModel2UmlModelRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_29_6_perform_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_JavaModel2UmlModelRule_29_6_perform_greenFFFFFFFFFFBB(
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		Model rootModel = UMLFactory.eINSTANCE.createModel();
		Model umlModel = UMLFactory.eINSTANCE.createModel();
		JavaModel2UMLPackage jm2commonTypes = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		Model sourceRefModel = UMLFactory.eINSTANCE.createModel();
		JavaModel2UMLPackage jm2um3 = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		org.eclipse.uml2.uml.Package commonTypes = UMLFactory.eINSTANCE.createPackage();
		JavaModel2UMLPackage jm2um2 = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		Model externalModel = UMLFactory.eINSTANCE.createModel();
		MGravityModel javaModel = ModiscoFactory.eINSTANCE.createMGravityModel();
		JavaModel2UMLPackage jm2um = UmlFactory.eINSTANCE.createJavaModel2UMLPackage();
		String rootModel_name_prime = "root model";
		Object _localVariable_0 = csp.getValue("umlModel", "name");
		String sourceRefModel_name_prime = "source references";
		String commonTypes_name_prime = "Common Java datatypes";
		String externalModel_name_prime = "externals";
		Object _localVariable_1 = csp.getValue("javaModel", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(rootModel);
		rootModel.getPackagedElements().add(umlModel);
		ruleResult.getTargetObjects().add(umlModel);
		ruleResult.getCorrObjects().add(jm2commonTypes);
		rootModel.getPackagedElements().add(sourceRefModel);
		ruleResult.getTargetObjects().add(sourceRefModel);
		jm2um3.setTarget(sourceRefModel);
		ruleResult.getCorrObjects().add(jm2um3);
		umlModel.getPackagedElements().add(commonTypes);
		jm2commonTypes.setTarget(commonTypes);
		ruleResult.getTargetObjects().add(commonTypes);
		ruleResult.getCorrObjects().add(jm2um2);
		rootModel.getPackagedElements().add(externalModel);
		jm2um2.setTarget(externalModel);
		ruleResult.getTargetObjects().add(externalModel);
		jm2um3.setSource(javaModel);
		jm2um2.setSource(javaModel);
		jm2commonTypes.setSource(javaModel);
		ruleResult.getSourceObjects().add(javaModel);
		jm2um.setTarget(umlModel);
		jm2um.setSource(javaModel);
		ruleResult.getCorrObjects().add(jm2um);
		rootModel.setName(rootModel_name_prime);
		String umlModel_name_prime = (String) _localVariable_0;
		sourceRefModel.setName(sourceRefModel_name_prime);
		commonTypes.setName(commonTypes_name_prime);
		externalModel.setName(externalModel_name_prime);
		String javaModel_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		umlModel.setName(umlModel_name_prime);
		javaModel.setName(javaModel_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { rootModel, umlModel, jm2commonTypes, sourceRefModel, jm2um3, commonTypes, jm2um2,
				externalModel, javaModel, jm2um, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_JavaModel2UmlModelRule_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //JavaModel2UmlModelRuleImpl
