/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.Modifier;

import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaModel2UMLPackage;
import org.gravity.tgg.modisco.uml.NamedElement2NamedElement;

import org.gravity.tgg.modisco.uml.Rules.OrphanedClassDec2OrphanedClass;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

import org.gravity.tgg.modisco.uml.UmlFactory;

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
 * An implementation of the model object '<em><b>Orphaned Class Dec2 Orphaned Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OrphanedClassDec2OrphanedClassImpl extends AbstractRuleImpl implements OrphanedClassDec2OrphanedClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrphanedClassDec2OrphanedClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getOrphanedClassDec2OrphanedClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MClass bodyDeclaration, Model jPackage) {

		Object[] result1_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_0_1_initialbindings_blackBBBB(this, match, bodyDeclaration,
						jPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = "
					+ jPackage + ".");
		}

		Object[] result2_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, bodyDeclaration,
						jPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = "
					+ jPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_0_4_collectelementstobetranslated_blackBBB(match,
							bodyDeclaration, jPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = " + jPackage + ".");
			}
			OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_0_4_collectelementstobetranslated_greenBBBF(match,
							bodyDeclaration, jPackage);
			//nothing EMoflonEdge jPackage__bodyDeclaration____orphanTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_0_5_collectcontextelements_blackBBB(match, bodyDeclaration,
							jPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = " + jPackage + ".");
			}
			OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_0_5_collectcontextelements_greenBB(match, jPackage);

			// 
			OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_0_6_registerobjectstomatch_expressionBBBB(this, match,
							bodyDeclaration, jPackage);
			return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_0_7_expressionF();
		} else {
			return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[1];
		MClass bodyDeclaration = (MClass) result1_bindingAndBlack[2];
		Model jPackage = (Model) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_greenFBBFFB(umlPackage,
						bodyDeclaration, csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[0];
		NamedElement2NamedElement md2o = (NamedElement2NamedElement) result1_green[3];
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_green[4];

		Object[] result2_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_2_collecttranslatedelements_blackBBBB(b2e, bodyDeclaration,
						md2o, feature);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[md2o] = " + md2o + ", " + "[feature] = " + feature + ".");
		}
		Object[] result2_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_2_collecttranslatedelements_greenFBBBB(b2e, bodyDeclaration,
						md2o, feature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, b2e, jp2up,
						umlPackage, bodyDeclaration, jPackage, md2o, feature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2e] = " + b2e + ", " + "[jp2up] = " + jp2up + ", " + "[umlPackage] = " + umlPackage
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = " + jPackage + ", "
					+ "[md2o] = " + md2o + ", " + "[feature] = " + feature + ".");
		}
		OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult, b2e,
						umlPackage, bodyDeclaration, jPackage, md2o, feature);
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge jPackage__bodyDeclaration____orphanTypes = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge md2o__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge md2o__feature____target = (EMoflonEdge) result3_green[12];

		// 
		// 
		OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, b2e,
						jp2up, umlPackage, bodyDeclaration, jPackage, md2o, feature);
		return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MClass bodyDeclaration = (MClass) result2_binding[0];
		Model jPackage = (Model) result2_binding[1];
		for (Object[] result2_black : OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_2_2_corematch_blackFFBBB(bodyDeclaration, jPackage, match)) {
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result2_black[0];
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result2_black[1];
			// ForEach 
			for (Object[] result3_black : OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_2_3_findcontext_blackBBBB(jp2up, umlPackage,
							bodyDeclaration, jPackage)) {
				Object[] result3_green = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_2_3_findcontext_greenBBBBFFFF(jp2up, umlPackage,
								bodyDeclaration, jPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge jPackage__bodyDeclaration____orphanTypes = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jp2up__jPackage____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, jp2up, umlPackage, bodyDeclaration, jPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jp2up] = " + jp2up + ", "
							+ "[umlPackage] = " + umlPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
							+ "[jPackage] = " + jPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MClass bodyDeclaration, Model jPackage) {
		match.registerObject("bodyDeclaration", bodyDeclaration);
		match.registerObject("jPackage", jPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MClass bodyDeclaration, Model jPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jp2up,
			org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration, Model jPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");

		// Create unbound variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jp2up", jp2up);
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("jPackage", jPackage);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject b2e, EObject jp2up, EObject umlPackage,
			EObject bodyDeclaration, EObject jPackage, EObject md2o, EObject feature) {
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("bodyDeclaration").eClass())
				.equals("modisco.MClass.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Model umlPackage,
			org.eclipse.uml2.uml.Class feature) {

		Object[] result1_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_10_1_initialbindings_blackBBBB(this, match, umlPackage,
						feature);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ".");
		}

		Object[] result2_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, umlPackage,
						feature);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_10_4_collectelementstobetranslated_blackBBB(match,
							umlPackage, feature);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ".");
			}
			OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_10_4_collectelementstobetranslated_greenBBBF(match,
							umlPackage, feature);
			//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_10_5_collectcontextelements_blackBBB(match, umlPackage,
							feature);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ".");
			}
			OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_10_5_collectcontextelements_greenBB(match, umlPackage);

			// 
			OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_10_6_registerobjectstomatch_expressionBBBB(this, match,
							umlPackage, feature);
			return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_10_7_expressionF();
		} else {
			return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[1];
		Model jPackage = (Model) result1_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_greenFFBFBB(jPackage, feature, csp);
		ASTNode2Element b2e = (ASTNode2Element) result1_green[0];
		MClass bodyDeclaration = (MClass) result1_green[1];
		NamedElement2NamedElement md2o = (NamedElement2NamedElement) result1_green[3];

		Object[] result2_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_2_collecttranslatedelements_blackBBBB(b2e, bodyDeclaration,
						md2o, feature);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[b2e] = " + b2e + ", " + "[bodyDeclaration] = "
							+ bodyDeclaration + ", " + "[md2o] = " + md2o + ", " + "[feature] = " + feature + ".");
		}
		Object[] result2_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_2_collecttranslatedelements_greenFBBBB(b2e, bodyDeclaration,
						md2o, feature);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, b2e, jp2up,
						umlPackage, bodyDeclaration, jPackage, md2o, feature);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[b2e] = " + b2e + ", " + "[jp2up] = " + jp2up + ", " + "[umlPackage] = " + umlPackage
					+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = " + jPackage + ", "
					+ "[md2o] = " + md2o + ", " + "[feature] = " + feature + ".");
		}
		OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(ruleresult, b2e,
						umlPackage, bodyDeclaration, jPackage, md2o, feature);
		//nothing EMoflonEdge b2e__bodyDeclaration____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge jPackage__bodyDeclaration____orphanTypes = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge md2o__bodyDeclaration____source = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge b2e__feature____target = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge md2o__feature____target = (EMoflonEdge) result3_green[12];

		// 
		// 
		OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_5_registerobjects_expressionBBBBBBBBB(this, ruleresult, b2e,
						jp2up, umlPackage, bodyDeclaration, jPackage, md2o, feature);
		return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result2_binding[0];
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_binding[1];
		for (Object[] result2_black : OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_12_2_corematch_blackFBFBB(umlPackage, feature, match)) {
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result2_black[0];
			Model jPackage = (Model) result2_black[2];
			// ForEach 
			for (Object[] result3_black : OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_12_3_findcontext_blackBBBB(jp2up, umlPackage, jPackage,
							feature)) {
				Object[] result3_green = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_12_3_findcontext_greenBBBBFFFF(jp2up, umlPackage,
								jPackage, feature);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jp2up__jPackage____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, jp2up, umlPackage, jPackage, feature);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jp2up] = " + jp2up + ", "
							+ "[umlPackage] = " + umlPackage + ", " + "[jPackage] = " + jPackage + ", " + "[feature] = "
							+ feature + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Model umlPackage,
			org.eclipse.uml2.uml.Class feature) {
		match.registerObject("umlPackage", umlPackage);
		match.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Model umlPackage,
			org.eclipse.uml2.uml.Class feature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jp2up,
			org.eclipse.uml2.uml.Model umlPackage, Model jPackage, org.eclipse.uml2.uml.Class feature) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jp2up", jp2up);
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("feature", feature);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject b2e, EObject jp2up, EObject umlPackage,
			EObject bodyDeclaration, EObject jPackage, EObject md2o, EObject feature) {
		ruleresult.registerObject("b2e", b2e);
		ruleresult.registerObject("jp2up", jp2up);
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("feature").eClass()).equals("uml.Class.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_301(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_20_2_testcorematchandDECs_blackFFB(_edge_packagedElement)) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result2_black[0];
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_black[1];
			Object[] result2_green = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, umlPackage, feature)) {
				// 
				if (OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_310(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_blackFFB(_edge_orphanTypes)) {
			MClass bodyDeclaration = (MClass) result2_black[0];
			Model jPackage = (Model) result2_black[1];
			Object[] result2_green = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, bodyDeclaration, jPackage)) {
				// 
				if (OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("OrphanedClassDec2OrphanedClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("OrphanedClassDec2OrphanedClass");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("feature", "name", var_feature_name.getValue());
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
		ruleResult.setRule("OrphanedClassDec2OrphanedClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration", true, csp);
		var_bodyDeclaration_name.setValue(__helper.getValue("bodyDeclaration", "name"));
		var_bodyDeclaration_name.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("OrphanedClassDec2OrphanedClass");
		eq0.solve(var_bodyDeclaration_name, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_bodyDeclaration_name.setBound(false);
			eq0.solve(var_bodyDeclaration_name, var_feature_name);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("bodyDeclaration", "name", var_bodyDeclaration_name.getValue());
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

		Object[] result1_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result2_bindingAndBlack[0];
		MClass bodyDeclaration = (MClass) result2_bindingAndBlack[1];
		Model jPackage = (Model) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, umlPackage,
						bodyDeclaration, jPackage, feature, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[umlPackage] = " + umlPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", "
					+ "[jPackage] = " + jPackage + ", " + "[feature] = " + feature + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_24_5_matchcorrcontext_blackFBBBB(umlPackage, jPackage,
							sourceMatch, targetMatch)) {
				JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result5_black[0];
				Object[] result5_green = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_24_5_matchcorrcontext_greenBBBF(jp2up, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_24_6_createcorrespondence_blackBBBBB(umlPackage,
								bodyDeclaration, jPackage, feature, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlPackage] = "
							+ umlPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[jPackage] = "
							+ jPackage + ", " + "[feature] = " + feature + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_24_6_createcorrespondence_greenFBFBB(bodyDeclaration,
								feature, ccMatch);
				//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[0];
				//nothing NamedElement2NamedElement md2o = (NamedElement2NamedElement) result6_green[2];

				Object[] result7_black = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration, Model jPackage,
			org.eclipse.uml2.uml.Class feature, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", true,
				csp);
		var_bodyDeclaration_name.setValue(bodyDeclaration.getName());
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);
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
	public boolean checkDEC_FWD(MClass bodyDeclaration, Model jPackage) {// 
		Object[] result1_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_blackBB(bodyDeclaration, jPackage);
		if (result1_black != null) {
			return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_27_2_expressionF();
		} else {
			return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Model umlPackage, org.eclipse.uml2.uml.Class feature) {// 
		Object[] result1_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_28_1_matchtggpattern_blackBB(umlPackage, feature);
		if (result1_black != null) {
			return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_28_2_expressionF();
		} else {
			return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaModel2UMLPackage jp2upParameter) {

		Object[] result1_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList jp2upList = (RuleEntryList) result2_black[0];
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result2_black[1];
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result2_black[2];
			Model jPackage = (Model) result2_black[3];

			Object[] result3_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, jp2up, umlPackage, jPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jp2up] = " + jp2up + ", "
						+ "[umlPackage] = " + umlPackage + ", " + "[jPackage] = " + jPackage + ", " + "[ruleResult] = "
						+ ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_29_5_checknacs_blackBBB(jp2up, umlPackage, jPackage);
				if (result5_black != null) {

					Object[] result6_black = OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_29_6_perform_blackBBBB(jp2up, umlPackage, jPackage,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jp2up] = " + jp2up
								+ ", " + "[umlPackage] = " + umlPackage + ", " + "[jPackage] = " + jPackage + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_29_6_perform_greenFBFBFFBB(umlPackage, jPackage,
									ruleResult, csp);
					//nothing ASTNode2Element b2e = (ASTNode2Element) result6_green[0];
					//nothing MClass bodyDeclaration = (MClass) result6_green[2];
					//nothing NamedElement2NamedElement md2o = (NamedElement2NamedElement) result6_green[4];
					//nothing org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result6_green[5];

				} else {
				}

			} else {
			}

		}
		return OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jp2up,
			org.eclipse.uml2.uml.Model umlPackage, Model jPackage, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_bodyDeclaration_name = CSPFactoryHelper.eINSTANCE.createVariable("bodyDeclaration.name", csp);
		var_bodyDeclaration_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_bodyDeclaration_name, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jp2up", jp2up);
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("jPackage", jPackage);
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
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_FWD__MATCH_MCLASS_MODEL:
			return isAppropriate_FWD((Match) arguments.get(0), (MClass) arguments.get(1), (Model) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCLASS_MODEL:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MClass) arguments.get(1), (Model) arguments.get(2));
			return null;
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCLASS_MODEL:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MClass) arguments.get(1),
					(Model) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_JAVAMODEL2UMLPACKAGE_MODEL_MCLASS_MODEL:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(JavaModel2UMLPackage) arguments.get(1), (org.eclipse.uml2.uml.Model) arguments.get(2),
					(MClass) arguments.get(3), (Model) arguments.get(4));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_BWD__MATCH_MODEL_CLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL_CLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
			return null;
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL_CLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAMODEL2UMLPACKAGE_MODEL_MODEL_CLASS:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(JavaModel2UMLPackage) arguments.get(1), (org.eclipse.uml2.uml.Model) arguments.get(2),
					(Model) arguments.get(3), (org.eclipse.uml2.uml.Class) arguments.get(4));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_301__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_301((EMoflonEdge) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_310__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_310((EMoflonEdge) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_MCLASS_MODEL_CLASS_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Model) arguments.get(0), (MClass) arguments.get(1),
					(Model) arguments.get(2), (org.eclipse.uml2.uml.Class) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_DEC_FWD__MCLASS_MODEL:
			return checkDEC_FWD((MClass) arguments.get(0), (Model) arguments.get(1));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_DEC_BWD__MODEL_CLASS:
			return checkDEC_BWD((org.eclipse.uml2.uml.Model) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAMODEL2UMLPACKAGE:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaModel2UMLPackage) arguments.get(1));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAMODEL2UMLPACKAGE_MODEL_MODEL_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(JavaModel2UMLPackage) arguments.get(1), (org.eclipse.uml2.uml.Model) arguments.get(2),
					(Model) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_1_initialbindings_blackBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, MClass bodyDeclaration, Model jPackage) {
		return new Object[] { _this, match, bodyDeclaration, jPackage };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_bindingFBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, MClass bodyDeclaration, Model jPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, bodyDeclaration, jPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, bodyDeclaration, jPackage };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_bindingAndBlackFBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, MClass bodyDeclaration, Model jPackage) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_binding = pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_bindingFBBBB(
				_this, match, bodyDeclaration, jPackage);
		if (result_pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_black = pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, bodyDeclaration, jPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_0_3_CheckCSP_expressionFBB(
			OrphanedClassDec2OrphanedClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_4_collectelementstobetranslated_blackBBB(
			Match match, MClass bodyDeclaration, Model jPackage) {
		return new Object[] { match, bodyDeclaration, jPackage };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_4_collectelementstobetranslated_greenBBBF(
			Match match, MClass bodyDeclaration, Model jPackage) {
		EMoflonEdge jPackage__bodyDeclaration____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(bodyDeclaration);
		String jPackage__bodyDeclaration____orphanTypes_name_prime = "orphanTypes";
		jPackage__bodyDeclaration____orphanTypes.setSrc(jPackage);
		jPackage__bodyDeclaration____orphanTypes.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(jPackage__bodyDeclaration____orphanTypes);
		jPackage__bodyDeclaration____orphanTypes.setName(jPackage__bodyDeclaration____orphanTypes_name_prime);
		return new Object[] { match, bodyDeclaration, jPackage, jPackage__bodyDeclaration____orphanTypes };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_5_collectcontextelements_blackBBB(Match match,
			MClass bodyDeclaration, Model jPackage) {
		return new Object[] { match, bodyDeclaration, jPackage };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_5_collectcontextelements_greenBB(Match match,
			Model jPackage) {
		match.getContextNodes().add(jPackage);
		return new Object[] { match, jPackage };
	}

	public static final void pattern_OrphanedClassDec2OrphanedClass_0_6_registerobjectstomatch_expressionBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, MClass bodyDeclaration, Model jPackage) {
		_this.registerObjectsToMatch_FWD(match, bodyDeclaration, jPackage);

	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jp2up");
		EObject _localVariable_1 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_3 = isApplicableMatch.getObject("jPackage");
		EObject tmpJp2up = _localVariable_0;
		EObject tmpUmlPackage = _localVariable_1;
		EObject tmpBodyDeclaration = _localVariable_2;
		EObject tmpJPackage = _localVariable_3;
		if (tmpJp2up instanceof JavaModel2UMLPackage) {
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) tmpJp2up;
			if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
				if (tmpBodyDeclaration instanceof MClass) {
					MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
					if (tmpJPackage instanceof Model) {
						Model jPackage = (Model) tmpJPackage;
						return new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_blackBBBBFBB(
			JavaModel2UMLPackage jp2up, org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration, Model jPackage,
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_bindingAndBlackFFFFFBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding = pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding != null) {
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding[1];
			MClass bodyDeclaration = (MClass) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding[2];
			Model jPackage = (Model) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding[3];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_black = pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_blackBBBBFBB(
					jp2up, umlPackage, bodyDeclaration, jPackage, _this, isApplicableMatch);
			if (result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_black[4];

				return new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_greenFBBFFB(
			org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement md2o = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		Object _localVariable_0 = csp.getValue("feature", "name");
		b2e.setSource(bodyDeclaration);
		md2o.setSource(bodyDeclaration);
		umlPackage.getPackagedElements().add(feature);
		b2e.setTarget(feature);
		md2o.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { b2e, umlPackage, bodyDeclaration, md2o, feature, csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_2_collecttranslatedelements_blackBBBB(
			ASTNode2Element b2e, MClass bodyDeclaration, NamedElement2NamedElement md2o,
			org.eclipse.uml2.uml.Class feature) {
		return new Object[] { b2e, bodyDeclaration, md2o, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_2_collecttranslatedelements_greenFBBBB(
			ASTNode2Element b2e, MClass bodyDeclaration, NamedElement2NamedElement md2o,
			org.eclipse.uml2.uml.Class feature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getTranslatedElements().add(bodyDeclaration);
		ruleresult.getCreatedLinkElements().add(md2o);
		ruleresult.getCreatedElements().add(feature);
		return new Object[] { ruleresult, b2e, bodyDeclaration, md2o, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2e, EObject jp2up, EObject umlPackage, EObject bodyDeclaration,
			EObject jPackage, EObject md2o, EObject feature) {
		if (!b2e.equals(jp2up)) {
			if (!b2e.equals(umlPackage)) {
				if (!b2e.equals(bodyDeclaration)) {
					if (!b2e.equals(jPackage)) {
						if (!b2e.equals(md2o)) {
							if (!b2e.equals(feature)) {
								if (!jp2up.equals(umlPackage)) {
									if (!jp2up.equals(md2o)) {
										if (!bodyDeclaration.equals(jp2up)) {
											if (!bodyDeclaration.equals(umlPackage)) {
												if (!bodyDeclaration.equals(jPackage)) {
													if (!bodyDeclaration.equals(md2o)) {
														if (!bodyDeclaration.equals(feature)) {
															if (!jPackage.equals(jp2up)) {
																if (!jPackage.equals(umlPackage)) {
																	if (!jPackage.equals(md2o)) {
																		if (!md2o.equals(umlPackage)) {
																			if (!feature.equals(jp2up)) {
																				if (!feature.equals(umlPackage)) {
																					if (!feature.equals(jPackage)) {
																						if (!feature.equals(md2o)) {
																							return new Object[] {
																									ruleresult, b2e,
																									jp2up, umlPackage,
																									bodyDeclaration,
																									jPackage, md2o,
																									feature };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject b2e, EObject umlPackage, EObject bodyDeclaration, EObject jPackage,
			EObject md2o, EObject feature) {
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OrphanedClassDec2OrphanedClass";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String jPackage__bodyDeclaration____orphanTypes_name_prime = "orphanTypes";
		String md2o__bodyDeclaration____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		String md2o__feature____target_name_prime = "target";
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlPackage__feature____packagedElement);
		jPackage__bodyDeclaration____orphanTypes.setSrc(jPackage);
		jPackage__bodyDeclaration____orphanTypes.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jPackage__bodyDeclaration____orphanTypes);
		md2o__bodyDeclaration____source.setSrc(md2o);
		md2o__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(md2o__bodyDeclaration____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		md2o__feature____target.setSrc(md2o);
		md2o__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(md2o__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		jPackage__bodyDeclaration____orphanTypes.setName(jPackage__bodyDeclaration____orphanTypes_name_prime);
		md2o__bodyDeclaration____source.setName(md2o__bodyDeclaration____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		md2o__feature____target.setName(md2o__feature____target_name_prime);
		return new Object[] { ruleresult, b2e, umlPackage, bodyDeclaration, jPackage, md2o, feature,
				b2e__bodyDeclaration____source, umlPackage__feature____packagedElement,
				jPackage__bodyDeclaration____orphanTypes, md2o__bodyDeclaration____source, b2e__feature____target,
				md2o__feature____target };
	}

	public static final void pattern_OrphanedClassDec2OrphanedClass_1_5_registerobjects_expressionBBBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, PerformRuleResult ruleresult, EObject b2e, EObject jp2up,
			EObject umlPackage, EObject bodyDeclaration, EObject jPackage, EObject md2o, EObject feature) {
		_this.registerObjects_FWD(ruleresult, b2e, jp2up, umlPackage, bodyDeclaration, jPackage, md2o, feature);

	}

	public static final PerformRuleResult pattern_OrphanedClassDec2OrphanedClass_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_bindingFB(
			OrphanedClassDec2OrphanedClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			OrphanedClassDec2OrphanedClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			OrphanedClassDec2OrphanedClass _this) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_binding = pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_black = pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OrphanedClassDec2OrphanedClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("bodyDeclaration");
		EObject _localVariable_1 = match.getObject("jPackage");
		EObject tmpBodyDeclaration = _localVariable_0;
		EObject tmpJPackage = _localVariable_1;
		if (tmpBodyDeclaration instanceof MClass) {
			MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
			if (tmpJPackage instanceof Model) {
				Model jPackage = (Model) tmpJPackage;
				return new Object[] { bodyDeclaration, jPackage, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_2_2_corematch_blackFFBBB(
			MClass bodyDeclaration, Model jPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaModel2UMLPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jPackage,
				JavaModel2UMLPackage.class, "source")) {
			org.eclipse.uml2.uml.Package tmpUmlPackage = jp2up.getTarget();
			if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
				_result.add(new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_2_3_findcontext_blackBBBB(
			JavaModel2UMLPackage jp2up, org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration, Model jPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (umlPackage.equals(jp2up.getTarget())) {
			if (jPackage.getOrphanTypes().contains(bodyDeclaration)) {
				if (jPackage.equals(jp2up.getSource())) {
					_result.add(new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_3_findcontext_greenBBBBFFFF(
			JavaModel2UMLPackage jp2up, org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration, Model jPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jp2up__umlPackage____target_name_prime = "target";
		String jPackage__bodyDeclaration____orphanTypes_name_prime = "orphanTypes";
		String jp2up__jPackage____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jp2up);
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jPackage);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		jPackage__bodyDeclaration____orphanTypes.setSrc(jPackage);
		jPackage__bodyDeclaration____orphanTypes.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jPackage__bodyDeclaration____orphanTypes);
		jp2up__jPackage____source.setSrc(jp2up);
		jp2up__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__jPackage____source);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		jPackage__bodyDeclaration____orphanTypes.setName(jPackage__bodyDeclaration____orphanTypes_name_prime);
		jp2up__jPackage____source.setName(jp2up__jPackage____source_name_prime);
		return new Object[] { jp2up, umlPackage, bodyDeclaration, jPackage, isApplicableMatch,
				jp2up__umlPackage____target, jPackage__bodyDeclaration____orphanTypes, jp2up__jPackage____source };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_bindingFBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jp2up,
			org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration, Model jPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, jp2up, umlPackage, bodyDeclaration,
				jPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jp2up, umlPackage, bodyDeclaration, jPackage };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_bindingAndBlackFBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jp2up,
			org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration, Model jPackage) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_binding = pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jp2up, umlPackage, bodyDeclaration, jPackage);
		if (result_pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_black = pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jp2up, umlPackage, bodyDeclaration, jPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_2_5_checkCSP_expressionFBB(
			OrphanedClassDec2OrphanedClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OrphanedClassDec2OrphanedClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OrphanedClassDec2OrphanedClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_1_initialbindings_blackBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, org.eclipse.uml2.uml.Model umlPackage,
			org.eclipse.uml2.uml.Class feature) {
		return new Object[] { _this, match, umlPackage, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_bindingFBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, org.eclipse.uml2.uml.Model umlPackage,
			org.eclipse.uml2.uml.Class feature) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, umlPackage, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, umlPackage, feature };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_bindingAndBlackFBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, org.eclipse.uml2.uml.Model umlPackage,
			org.eclipse.uml2.uml.Class feature) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_binding = pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_bindingFBBBB(
				_this, match, umlPackage, feature);
		if (result_pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_black = pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, umlPackage, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_10_3_CheckCSP_expressionFBB(
			OrphanedClassDec2OrphanedClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.uml2.uml.Model umlPackage, org.eclipse.uml2.uml.Class feature) {
		return new Object[] { match, umlPackage, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Model umlPackage, org.eclipse.uml2.uml.Class feature) {
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		match.getToBeTranslatedEdges().add(umlPackage__feature____packagedElement);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		return new Object[] { match, umlPackage, feature, umlPackage__feature____packagedElement };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_5_collectcontextelements_blackBBB(
			Match match, org.eclipse.uml2.uml.Model umlPackage, org.eclipse.uml2.uml.Class feature) {
		return new Object[] { match, umlPackage, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Model umlPackage) {
		match.getContextNodes().add(umlPackage);
		return new Object[] { match, umlPackage };
	}

	public static final void pattern_OrphanedClassDec2OrphanedClass_10_6_registerobjectstomatch_expressionBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, org.eclipse.uml2.uml.Model umlPackage,
			org.eclipse.uml2.uml.Class feature) {
		_this.registerObjectsToMatch_BWD(match, umlPackage, feature);

	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jp2up");
		EObject _localVariable_1 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("feature");
		EObject tmpJp2up = _localVariable_0;
		EObject tmpUmlPackage = _localVariable_1;
		EObject tmpJPackage = _localVariable_2;
		EObject tmpFeature = _localVariable_3;
		if (tmpJp2up instanceof JavaModel2UMLPackage) {
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) tmpJp2up;
			if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
				org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
				if (tmpJPackage instanceof Model) {
					Model jPackage = (Model) tmpJPackage;
					if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
						return new Object[] { jp2up, umlPackage, jPackage, feature, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_blackBBBBFBB(
			JavaModel2UMLPackage jp2up, org.eclipse.uml2.uml.Model umlPackage, Model jPackage,
			org.eclipse.uml2.uml.Class feature, OrphanedClassDec2OrphanedClass _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jp2up, umlPackage, jPackage, feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_bindingAndBlackFFFFFBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding = pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding != null) {
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding[1];
			Model jPackage = (Model) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding[2];
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding[3];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_black = pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_blackBBBBFBB(
					jp2up, umlPackage, jPackage, feature, _this, isApplicableMatch);
			if (result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_black[4];

				return new Object[] { jp2up, umlPackage, jPackage, feature, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_greenFFBFBB(
			Model jPackage, org.eclipse.uml2.uml.Class feature, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MClass bodyDeclaration = ModiscoFactory.eINSTANCE.createMClass();
		NamedElement2NamedElement md2o = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		b2e.setTarget(feature);
		b2e.setSource(bodyDeclaration);
		jPackage.getOrphanTypes().add(bodyDeclaration);
		md2o.setSource(bodyDeclaration);
		md2o.setTarget(feature);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		return new Object[] { b2e, bodyDeclaration, jPackage, md2o, feature, csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_2_collecttranslatedelements_blackBBBB(
			ASTNode2Element b2e, MClass bodyDeclaration, NamedElement2NamedElement md2o,
			org.eclipse.uml2.uml.Class feature) {
		return new Object[] { b2e, bodyDeclaration, md2o, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_2_collecttranslatedelements_greenFBBBB(
			ASTNode2Element b2e, MClass bodyDeclaration, NamedElement2NamedElement md2o,
			org.eclipse.uml2.uml.Class feature) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(b2e);
		ruleresult.getCreatedElements().add(bodyDeclaration);
		ruleresult.getCreatedLinkElements().add(md2o);
		ruleresult.getTranslatedElements().add(feature);
		return new Object[] { ruleresult, b2e, bodyDeclaration, md2o, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject b2e, EObject jp2up, EObject umlPackage, EObject bodyDeclaration,
			EObject jPackage, EObject md2o, EObject feature) {
		if (!b2e.equals(jp2up)) {
			if (!b2e.equals(umlPackage)) {
				if (!b2e.equals(bodyDeclaration)) {
					if (!b2e.equals(jPackage)) {
						if (!b2e.equals(md2o)) {
							if (!b2e.equals(feature)) {
								if (!jp2up.equals(umlPackage)) {
									if (!jp2up.equals(md2o)) {
										if (!bodyDeclaration.equals(jp2up)) {
											if (!bodyDeclaration.equals(umlPackage)) {
												if (!bodyDeclaration.equals(jPackage)) {
													if (!bodyDeclaration.equals(md2o)) {
														if (!bodyDeclaration.equals(feature)) {
															if (!jPackage.equals(jp2up)) {
																if (!jPackage.equals(umlPackage)) {
																	if (!jPackage.equals(md2o)) {
																		if (!md2o.equals(umlPackage)) {
																			if (!feature.equals(jp2up)) {
																				if (!feature.equals(umlPackage)) {
																					if (!feature.equals(jPackage)) {
																						if (!feature.equals(md2o)) {
																							return new Object[] {
																									ruleresult, b2e,
																									jp2up, umlPackage,
																									bodyDeclaration,
																									jPackage, md2o,
																									feature };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject b2e, EObject umlPackage, EObject bodyDeclaration, EObject jPackage,
			EObject md2o, EObject feature) {
		EMoflonEdge b2e__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge b2e__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OrphanedClassDec2OrphanedClass";
		String b2e__bodyDeclaration____source_name_prime = "source";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String jPackage__bodyDeclaration____orphanTypes_name_prime = "orphanTypes";
		String md2o__bodyDeclaration____source_name_prime = "source";
		String b2e__feature____target_name_prime = "target";
		String md2o__feature____target_name_prime = "target";
		b2e__bodyDeclaration____source.setSrc(b2e);
		b2e__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(b2e__bodyDeclaration____source);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlPackage__feature____packagedElement);
		jPackage__bodyDeclaration____orphanTypes.setSrc(jPackage);
		jPackage__bodyDeclaration____orphanTypes.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jPackage__bodyDeclaration____orphanTypes);
		md2o__bodyDeclaration____source.setSrc(md2o);
		md2o__bodyDeclaration____source.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(md2o__bodyDeclaration____source);
		b2e__feature____target.setSrc(b2e);
		b2e__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(b2e__feature____target);
		md2o__feature____target.setSrc(md2o);
		md2o__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(md2o__feature____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		b2e__bodyDeclaration____source.setName(b2e__bodyDeclaration____source_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		jPackage__bodyDeclaration____orphanTypes.setName(jPackage__bodyDeclaration____orphanTypes_name_prime);
		md2o__bodyDeclaration____source.setName(md2o__bodyDeclaration____source_name_prime);
		b2e__feature____target.setName(b2e__feature____target_name_prime);
		md2o__feature____target.setName(md2o__feature____target_name_prime);
		return new Object[] { ruleresult, b2e, umlPackage, bodyDeclaration, jPackage, md2o, feature,
				b2e__bodyDeclaration____source, umlPackage__feature____packagedElement,
				jPackage__bodyDeclaration____orphanTypes, md2o__bodyDeclaration____source, b2e__feature____target,
				md2o__feature____target };
	}

	public static final void pattern_OrphanedClassDec2OrphanedClass_11_5_registerobjects_expressionBBBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, PerformRuleResult ruleresult, EObject b2e, EObject jp2up,
			EObject umlPackage, EObject bodyDeclaration, EObject jPackage, EObject md2o, EObject feature) {
		_this.registerObjects_BWD(ruleresult, b2e, jp2up, umlPackage, bodyDeclaration, jPackage, md2o, feature);

	}

	public static final PerformRuleResult pattern_OrphanedClassDec2OrphanedClass_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_bindingFB(
			OrphanedClassDec2OrphanedClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_blackFBB(EClass eClass,
			OrphanedClassDec2OrphanedClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_bindingAndBlackFFB(
			OrphanedClassDec2OrphanedClass _this) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_binding = pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_black = pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "OrphanedClassDec2OrphanedClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("umlPackage");
		EObject _localVariable_1 = match.getObject("feature");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
			if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
				return new Object[] { umlPackage, feature, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_12_2_corematch_blackFBFBB(
			org.eclipse.uml2.uml.Model umlPackage, org.eclipse.uml2.uml.Class feature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (JavaModel2UMLPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(umlPackage,
				JavaModel2UMLPackage.class, "target")) {
			Model jPackage = jp2up.getSource();
			if (jPackage != null) {
				_result.add(new Object[] { jp2up, umlPackage, jPackage, feature, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_12_3_findcontext_blackBBBB(
			JavaModel2UMLPackage jp2up, org.eclipse.uml2.uml.Model umlPackage, Model jPackage,
			org.eclipse.uml2.uml.Class feature) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (umlPackage.equals(jp2up.getTarget())) {
			if (umlPackage.getPackagedElements().contains(feature)) {
				if (jPackage.equals(jp2up.getSource())) {
					_result.add(new Object[] { jp2up, umlPackage, jPackage, feature });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_3_findcontext_greenBBBBFFFF(
			JavaModel2UMLPackage jp2up, org.eclipse.uml2.uml.Model umlPackage, Model jPackage,
			org.eclipse.uml2.uml.Class feature) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jp2up__umlPackage____target_name_prime = "target";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String jp2up__jPackage____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jp2up);
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(feature);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(umlPackage__feature____packagedElement);
		jp2up__jPackage____source.setSrc(jp2up);
		jp2up__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__jPackage____source);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		jp2up__jPackage____source.setName(jp2up__jPackage____source_name_prime);
		return new Object[] { jp2up, umlPackage, jPackage, feature, isApplicableMatch, jp2up__umlPackage____target,
				umlPackage__feature____packagedElement, jp2up__jPackage____source };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_bindingFBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jp2up,
			org.eclipse.uml2.uml.Model umlPackage, Model jPackage, org.eclipse.uml2.uml.Class feature) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, jp2up, umlPackage, jPackage, feature);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jp2up, umlPackage, jPackage, feature };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_bindingAndBlackFBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jp2up,
			org.eclipse.uml2.uml.Model umlPackage, Model jPackage, org.eclipse.uml2.uml.Class feature) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_binding = pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jp2up, umlPackage, jPackage, feature);
		if (result_pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_black = pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jp2up, umlPackage, jPackage, feature };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_12_5_checkCSP_expressionFBB(
			OrphanedClassDec2OrphanedClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "OrphanedClassDec2OrphanedClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_OrphanedClassDec2OrphanedClass_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_bindingFB(
			OrphanedClassDec2OrphanedClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, OrphanedClassDec2OrphanedClass _this) {
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_bindingAndBlackFFBF(
			OrphanedClassDec2OrphanedClass _this) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_binding = pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_black = pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_20_2_testcorematchandDECs_black_nac_0B(
			org.eclipse.uml2.uml.Class feature) {
		for (org.eclipse.uml2.uml.Class __DEC_feature_nestedClassifier_198778 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			if (!feature.equals(__DEC_feature_nestedClassifier_198778)) {
				return new Object[] { feature };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_20_2_testcorematchandDECs_black_nac_1B(
			org.eclipse.uml2.uml.Class feature) {
		for (Interface __DEC_feature_nestedClassifier_553238 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlPackage = _edge_packagedElement.getSrc();
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
			EObject tmpFeature = _edge_packagedElement.getTrg();
			if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
				if (umlPackage.getPackagedElements().contains(feature)) {
					if (pattern_OrphanedClassDec2OrphanedClass_20_2_testcorematchandDECs_black_nac_0B(
							feature) == null) {
						if (pattern_OrphanedClassDec2OrphanedClass_20_2_testcorematchandDECs_black_nac_1B(
								feature) == null) {
							_result.add(new Object[] { umlPackage, feature, _edge_packagedElement });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, org.eclipse.uml2.uml.Model umlPackage,
			org.eclipse.uml2.uml.Class feature) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, umlPackage, feature);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OrphanedClassDec2OrphanedClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OrphanedClassDec2OrphanedClass_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_bindingFB(
			OrphanedClassDec2OrphanedClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, OrphanedClassDec2OrphanedClass _this) {
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_bindingAndBlackFFBF(
			OrphanedClassDec2OrphanedClass _this) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_binding = pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_black = pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_black_nac_0B(
			MClass bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_433131 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_433131 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_black_nac_1B(
			MClass bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_204350 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_204350 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_204350)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_black_nac_2B(
			MClass bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_717502 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_717502 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_black_nac_3B(
			MClass bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_683953 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_683953 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_black_nac_4B(
			MClass bodyDeclaration) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_41158 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJPackage = _edge_orphanTypes.getSrc();
		if (tmpJPackage instanceof Model) {
			Model jPackage = (Model) tmpJPackage;
			EObject tmpBodyDeclaration = _edge_orphanTypes.getTrg();
			if (tmpBodyDeclaration instanceof MClass) {
				MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
				if (jPackage.getOrphanTypes().contains(bodyDeclaration)) {
					if (pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_black_nac_0B(
							bodyDeclaration) == null) {
						if (pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_black_nac_1B(
								bodyDeclaration) == null) {
							if (pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_black_nac_2B(
									bodyDeclaration) == null) {
								if (pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_black_nac_3B(
										bodyDeclaration) == null) {
									if (pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_black_nac_4B(
											bodyDeclaration) == null) {
										_result.add(new Object[] { bodyDeclaration, jPackage, _edge_orphanTypes });
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, MClass bodyDeclaration, Model jPackage) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, bodyDeclaration, jPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			OrphanedClassDec2OrphanedClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_OrphanedClassDec2OrphanedClass_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_1_prepare_blackB(
			OrphanedClassDec2OrphanedClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("umlPackage");
		EObject _localVariable_1 = sourceMatch.getObject("bodyDeclaration");
		EObject _localVariable_2 = sourceMatch.getObject("jPackage");
		EObject _localVariable_3 = targetMatch.getObject("feature");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		EObject tmpJPackage = _localVariable_2;
		EObject tmpFeature = _localVariable_3;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
			if (tmpBodyDeclaration instanceof MClass) {
				MClass bodyDeclaration = (MClass) tmpBodyDeclaration;
				if (tmpJPackage instanceof Model) {
					Model jPackage = (Model) tmpJPackage;
					if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
						return new Object[] { umlPackage, bodyDeclaration, jPackage, feature, targetMatch,
								sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration, Model jPackage,
			org.eclipse.uml2.uml.Class feature, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { umlPackage, bodyDeclaration, jPackage, feature, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding = pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding[0];
			MClass bodyDeclaration = (MClass) result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding[1];
			Model jPackage = (Model) result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_black = pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_blackBBBBBB(
					umlPackage, bodyDeclaration, jPackage, feature, sourceMatch, targetMatch);
			if (result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { umlPackage, bodyDeclaration, jPackage, feature, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_bindingFBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration,
			Model jPackage, org.eclipse.uml2.uml.Class feature, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(umlPackage, bodyDeclaration, jPackage, feature,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, umlPackage, bodyDeclaration, jPackage, feature, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration,
			Model jPackage, org.eclipse.uml2.uml.Class feature, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_binding = pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_bindingFBBBBBBB(
				_this, umlPackage, bodyDeclaration, jPackage, feature, sourceMatch, targetMatch);
		if (result_pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_black = pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, umlPackage, bodyDeclaration, jPackage, feature, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_24_5_matchcorrcontext_blackFBBBB(
			org.eclipse.uml2.uml.Model umlPackage, Model jPackage, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (JavaModel2UMLPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(umlPackage, JavaModel2UMLPackage.class, "target")) {
				if (jPackage.equals(jp2up.getSource())) {
					_result.add(new Object[] { jp2up, umlPackage, jPackage, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_5_matchcorrcontext_greenBBBF(
			JavaModel2UMLPackage jp2up, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "OrphanedClassDec2OrphanedClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(jp2up);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { jp2up, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.uml2.uml.Model umlPackage, MClass bodyDeclaration, Model jPackage,
			org.eclipse.uml2.uml.Class feature, CCMatch ccMatch) {
		return new Object[] { umlPackage, bodyDeclaration, jPackage, feature, ccMatch };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_6_createcorrespondence_greenFBFBB(
			MClass bodyDeclaration, org.eclipse.uml2.uml.Class feature, CCMatch ccMatch) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		NamedElement2NamedElement md2o = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		b2e.setSource(bodyDeclaration);
		b2e.setTarget(feature);
		ccMatch.getCreateCorr().add(b2e);
		md2o.setSource(bodyDeclaration);
		md2o.setTarget(feature);
		ccMatch.getCreateCorr().add(md2o);
		return new Object[] { b2e, bodyDeclaration, md2o, feature, ccMatch };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "OrphanedClassDec2OrphanedClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_OrphanedClassDec2OrphanedClass_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_black_nac_0B(
			MClass bodyDeclaration) {
		Modifier __DEC_bodyDeclaration_modifier_574557 = bodyDeclaration.getModifier();
		if (__DEC_bodyDeclaration_modifier_574557 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_black_nac_1B(
			MClass bodyDeclaration) {
		AbstractTypeDeclaration __DEC_bodyDeclaration_bodyDeclarations_495586 = bodyDeclaration
				.getAbstractTypeDeclaration();
		if (__DEC_bodyDeclaration_bodyDeclarations_495586 != null) {
			if (!bodyDeclaration.equals(__DEC_bodyDeclaration_bodyDeclarations_495586)) {
				return new Object[] { bodyDeclaration };
			}
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_black_nac_2B(
			MClass bodyDeclaration) {
		AnonymousClassDeclaration __DEC_bodyDeclaration_bodyDeclarations_488218 = bodyDeclaration
				.getAnonymousClassDeclarationOwner();
		if (__DEC_bodyDeclaration_bodyDeclarations_488218 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_black_nac_3B(
			MClass bodyDeclaration) {
		org.eclipse.modisco.java.Package __DEC_bodyDeclaration_ownedElements_656435 = bodyDeclaration.getPackage();
		if (__DEC_bodyDeclaration_ownedElements_656435 != null) {
			return new Object[] { bodyDeclaration };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_black_nac_4B(
			MClass bodyDeclaration) {
		for (MAbstractMethodDefinition __DEC_bodyDeclaration_mInnerTypes_830300 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(bodyDeclaration, MAbstractMethodDefinition.class, "mInnerTypes")) {
			return new Object[] { bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_blackBB(
			MClass bodyDeclaration, Model jPackage) {
		if (jPackage.getOrphanTypes().contains(bodyDeclaration)) {
			if (pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_black_nac_0B(bodyDeclaration) == null) {
				if (pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_black_nac_1B(bodyDeclaration) == null) {
					if (pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_black_nac_2B(
							bodyDeclaration) == null) {
						if (pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_black_nac_3B(
								bodyDeclaration) == null) {
							if (pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_black_nac_4B(
									bodyDeclaration) == null) {
								return new Object[] { bodyDeclaration, jPackage };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_28_1_matchtggpattern_black_nac_0B(
			org.eclipse.uml2.uml.Class feature) {
		for (org.eclipse.uml2.uml.Class __DEC_feature_nestedClassifier_300684 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, org.eclipse.uml2.uml.Class.class, "nestedClassifier")) {
			if (!feature.equals(__DEC_feature_nestedClassifier_300684)) {
				return new Object[] { feature };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_28_1_matchtggpattern_black_nac_1B(
			org.eclipse.uml2.uml.Class feature) {
		for (Interface __DEC_feature_nestedClassifier_57452 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(feature, Interface.class, "nestedClassifier")) {
			return new Object[] { feature };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Model umlPackage, org.eclipse.uml2.uml.Class feature) {
		if (umlPackage.getPackagedElements().contains(feature)) {
			if (pattern_OrphanedClassDec2OrphanedClass_28_1_matchtggpattern_black_nac_0B(feature) == null) {
				if (pattern_OrphanedClassDec2OrphanedClass_28_1_matchtggpattern_black_nac_1B(feature) == null) {
					return new Object[] { umlPackage, feature };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_1_createresult_blackB(
			OrphanedClassDec2OrphanedClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, JavaModel2UMLPackage jp2up) {
		if (ruleResult.getCorrObjects().contains(jp2up)) {
			return new Object[] { ruleResult, jp2up };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Model umlPackage) {
		if (ruleResult.getTargetObjects().contains(umlPackage)) {
			return new Object[] { ruleResult, umlPackage };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, Model jPackage) {
		if (ruleResult.getSourceObjects().contains(jPackage)) {
			return new Object[] { ruleResult, jPackage };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jp2upList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpJp2up : jp2upList.getEntryObjects()) {
				if (tmpJp2up instanceof JavaModel2UMLPackage) {
					JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) tmpJp2up;
					org.eclipse.uml2.uml.Package tmpUmlPackage = jp2up.getTarget();
					if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
						org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
						Model jPackage = jp2up.getSource();
						if (jPackage != null) {
							if (pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_0BB(ruleResult,
									jp2up) == null) {
								if (pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_1BB(
										ruleResult, umlPackage) == null) {
									if (pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, jPackage) == null) {
										_result.add(new Object[] { jp2upList, jp2up, umlPackage, jPackage,
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_bindingFBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jp2up,
			org.eclipse.uml2.uml.Model umlPackage, Model jPackage, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, jp2up, umlPackage, jPackage,
				ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jp2up, umlPackage, jPackage, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_bindingAndBlackFBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch, JavaModel2UMLPackage jp2up,
			org.eclipse.uml2.uml.Model umlPackage, Model jPackage, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_binding = pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jp2up, umlPackage, jPackage, ruleResult);
		if (result_pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_black = pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jp2up, umlPackage, jPackage, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_29_4_checkCSP_expressionFBB(
			OrphanedClassDec2OrphanedClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_5_checknacs_blackBBB(
			JavaModel2UMLPackage jp2up, org.eclipse.uml2.uml.Model umlPackage, Model jPackage) {
		return new Object[] { jp2up, umlPackage, jPackage };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_6_perform_blackBBBB(
			JavaModel2UMLPackage jp2up, org.eclipse.uml2.uml.Model umlPackage, Model jPackage,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { jp2up, umlPackage, jPackage, ruleResult };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_6_perform_greenFBFBFFBB(
			org.eclipse.uml2.uml.Model umlPackage, Model jPackage, ModelgeneratorRuleResult ruleResult, CSP csp) {
		ASTNode2Element b2e = UmlFactory.eINSTANCE.createASTNode2Element();
		MClass bodyDeclaration = ModiscoFactory.eINSTANCE.createMClass();
		NamedElement2NamedElement md2o = UmlFactory.eINSTANCE.createNamedElement2NamedElement();
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		Object _localVariable_0 = csp.getValue("bodyDeclaration", "name");
		Object _localVariable_1 = csp.getValue("feature", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(b2e);
		b2e.setSource(bodyDeclaration);
		jPackage.getOrphanTypes().add(bodyDeclaration);
		ruleResult.getSourceObjects().add(bodyDeclaration);
		md2o.setSource(bodyDeclaration);
		ruleResult.getCorrObjects().add(md2o);
		umlPackage.getPackagedElements().add(feature);
		b2e.setTarget(feature);
		md2o.setTarget(feature);
		ruleResult.getTargetObjects().add(feature);
		String bodyDeclaration_name_prime = (String) _localVariable_0;
		String feature_name_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		bodyDeclaration.setName(bodyDeclaration_name_prime);
		feature.setName(feature_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { b2e, umlPackage, bodyDeclaration, jPackage, md2o, feature, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_OrphanedClassDec2OrphanedClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //OrphanedClassDec2OrphanedClassImpl
