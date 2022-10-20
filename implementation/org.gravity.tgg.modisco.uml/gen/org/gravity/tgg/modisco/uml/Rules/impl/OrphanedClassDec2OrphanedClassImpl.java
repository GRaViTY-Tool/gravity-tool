/**
 */
package org.gravity.tgg.modisco.uml.Rules.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.modisco.java.ASTNode;
import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Model;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaModel2UMLPackage;

import org.gravity.tgg.modisco.uml.Rules.OrphanedClassDec2OrphanedClass;
import org.gravity.tgg.modisco.uml.Rules.RulesPackage;

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
	public boolean isAppropriate_FWD(Match match, Model jPackage, AbstractTypeDeclaration bodyDeclaration) {

		Object[] result1_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_0_1_initialbindings_blackBBBB(this, match, jPackage,
						bodyDeclaration);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ".");
		}

		Object[] result2_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, jPackage,
						bodyDeclaration);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = "
					+ bodyDeclaration + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_0_4_collectelementstobetranslated_blackBBB(match, jPackage,
							bodyDeclaration);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_0_4_collectelementstobetranslated_greenBBBF(match, jPackage,
							bodyDeclaration);
			//nothing EMoflonEdge jPackage__bodyDeclaration____orphanTypes = (EMoflonEdge) result4_green[3];

			Object[] result5_black = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_0_5_collectcontextelements_blackBBB(match, jPackage,
							bodyDeclaration);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ".");
			}
			OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_0_5_collectcontextelements_greenBBB(match, jPackage,
							bodyDeclaration);

			// 
			OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_0_6_registerobjectstomatch_expressionBBBB(this, match,
							jPackage, bodyDeclaration);
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
				.pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[0];
		Classifier feature = (Classifier) result1_bindingAndBlack[1];
		Model jPackage = (Model) result1_bindingAndBlack[2];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		ASTNode2Element md2o = (ASTNode2Element) result1_bindingAndBlack[4];
		JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_greenBB(umlPackage, feature);

		Object[] result2_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, umlPackage,
						feature, jPackage, bodyDeclaration, md2o, jp2up);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ", " + "[jPackage] = "
					+ jPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[md2o] = " + md2o + ", "
					+ "[jp2up] = " + jp2up + ".");
		}
		OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_1_3_bookkeepingforedges_greenBBBBBFF(
				ruleresult, umlPackage, feature, jPackage, bodyDeclaration);
		//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge jPackage__bodyDeclaration____orphanTypes = (EMoflonEdge) result3_green[6];

		// 
		// 
		OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up);
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
		Model jPackage = (Model) result2_binding[0];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_2_2_corematch_blackFFBBFFB(jPackage, bodyDeclaration, match)) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result2_black[0];
			Classifier feature = (Classifier) result2_black[1];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[4];
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result2_black[5];
			// ForEach 
			for (Object[] result3_black : OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_2_3_findcontext_blackBBBBBB(umlPackage, feature, jPackage,
							bodyDeclaration, md2o, jp2up)) {
				Object[] result3_green = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_2_3_findcontext_greenBBBBBBFFFFFF(umlPackage, feature,
								jPackage, bodyDeclaration, md2o, jp2up);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge md2o__feature____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge md2o__bodyDeclaration____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge jPackage__bodyDeclaration____orphanTypes = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge jp2up__jPackage____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage
							+ ", " + "[feature] = " + feature + ", " + "[jPackage] = " + jPackage + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[md2o] = " + md2o + ", " + "[jp2up] = "
							+ jp2up + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Model jPackage, AbstractTypeDeclaration bodyDeclaration) {
		match.registerObject("jPackage", jPackage);
		match.registerObject("bodyDeclaration", bodyDeclaration);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Model jPackage, AbstractTypeDeclaration bodyDeclaration) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model umlPackage,
			Classifier feature, Model jPackage, AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o,
			JavaModel2UMLPackage jp2up) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("jp2up", jp2up);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject umlPackage, EObject feature, EObject jPackage,
			EObject bodyDeclaration, EObject md2o, EObject jp2up) {
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("jp2up", jp2up);

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
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Model umlPackage, Classifier feature) {

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
					.pattern_OrphanedClassDec2OrphanedClass_10_5_collectcontextelements_greenBBB(match, umlPackage,
							feature);

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
				.pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result1_bindingAndBlack[0];
		Classifier feature = (Classifier) result1_bindingAndBlack[1];
		Model jPackage = (Model) result1_bindingAndBlack[2];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		ASTNode2Element md2o = (ASTNode2Element) result1_bindingAndBlack[4];
		JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_greenBB(jPackage, bodyDeclaration);

		Object[] result2_green = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, umlPackage,
						feature, jPackage, bodyDeclaration, md2o, jp2up);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ", " + "[jPackage] = "
					+ jPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[md2o] = " + md2o + ", "
					+ "[jp2up] = " + jp2up + ".");
		}
		OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_11_3_bookkeepingforedges_greenBBBBBFF(
				ruleresult, umlPackage, feature, jPackage, bodyDeclaration);
		//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge jPackage__bodyDeclaration____orphanTypes = (EMoflonEdge) result3_green[6];

		// 
		// 
		OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up);
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
		Classifier feature = (Classifier) result2_binding[1];
		for (Object[] result2_black : OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_12_2_corematch_blackBBFFFFB(umlPackage, feature, match)) {
			Model jPackage = (Model) result2_black[2];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[3];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[4];
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result2_black[5];
			// ForEach 
			for (Object[] result3_black : OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_12_3_findcontext_blackBBBBBB(umlPackage, feature, jPackage,
							bodyDeclaration, md2o, jp2up)) {
				Object[] result3_green = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_12_3_findcontext_greenBBBBBBFFFFFF(umlPackage, feature,
								jPackage, bodyDeclaration, md2o, jp2up);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge md2o__feature____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge md2o__bodyDeclaration____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge umlPackage__feature____packagedElement = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge jp2up__umlPackage____target = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge jp2up__jPackage____source = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage
							+ ", " + "[feature] = " + feature + ", " + "[jPackage] = " + jPackage + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[md2o] = " + md2o + ", " + "[jp2up] = "
							+ jp2up + ".");
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
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Model umlPackage, Classifier feature) {
		match.registerObject("umlPackage", umlPackage);
		match.registerObject("feature", feature);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Model umlPackage, Classifier feature) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model umlPackage,
			Classifier feature, Model jPackage, AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o,
			JavaModel2UMLPackage jp2up) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("jp2up", jp2up);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject umlPackage, EObject feature, EObject jPackage,
			EObject bodyDeclaration, EObject md2o, EObject jp2up) {
		ruleresult.registerObject("umlPackage", umlPackage);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("jPackage", jPackage);
		ruleresult.registerObject("bodyDeclaration", bodyDeclaration);
		ruleresult.registerObject("md2o", md2o);
		ruleresult.registerObject("jp2up", jp2up);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_135(EMoflonEdge _edge_packagedElement) {

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
			Classifier feature = (Classifier) result2_black[1];
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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_145(EMoflonEdge _edge_orphanTypes) {

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
			Model jPackage = (Model) result2_black[0];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, jPackage, bodyDeclaration)) {
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

		if (!__helper.hasExpectedValue("umlPackage", "name", "externals", ComparingOperator.EQUAL)) {
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
		ruleResult.setRule("OrphanedClassDec2OrphanedClass");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("umlPackage", "name", "externals", ComparingOperator.EQUAL)) {
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
		Classifier feature = (Classifier) result2_bindingAndBlack[1];
		Model jPackage = (Model) result2_bindingAndBlack[2];
		AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, umlPackage, feature,
						jPackage, bodyDeclaration, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[umlPackage] = " + umlPackage + ", " + "[feature] = " + feature + ", " + "[jPackage] = "
					+ jPackage + ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[sourceMatch] = "
					+ sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_24_5_matchcorrcontext_blackBBBBFFBB(umlPackage, feature,
							jPackage, bodyDeclaration, sourceMatch, targetMatch)) {
				ASTNode2Element md2o = (ASTNode2Element) result5_black[4];
				JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result5_black[5];
				Object[] result5_green = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_24_5_matchcorrcontext_greenBBBBF(md2o, jp2up,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_24_6_createcorrespondence_blackBBBBB(umlPackage,
								feature, jPackage, bodyDeclaration, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlPackage] = "
							+ umlPackage + ", " + "[feature] = " + feature + ", " + "[jPackage] = " + jPackage + ", "
							+ "[bodyDeclaration] = " + bodyDeclaration + ", " + "[ccMatch] = " + ccMatch + ".");
				}

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
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Model jPackage, AbstractTypeDeclaration bodyDeclaration) {// 
		Object[] result1_black = OrphanedClassDec2OrphanedClassImpl
				.pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_blackBB(jPackage, bodyDeclaration);
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
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Model umlPackage, Classifier feature) {// 
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
			JavaModel2UMLPackage jp2upParameter, ASTNode2Element md2oParameter) {

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
				.pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList jp2upList = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result2_black[1];
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result2_black[2];
			Model jPackage = (Model) result2_black[3];
			//nothing RuleEntryList md2oList = (RuleEntryList) result2_black[4];
			Classifier feature = (Classifier) result2_black[5];
			ASTNode2Element md2o = (ASTNode2Element) result2_black[6];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this,
							isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[umlPackage] = " + umlPackage + ", "
						+ "[feature] = " + feature + ", " + "[jPackage] = " + jPackage + ", " + "[bodyDeclaration] = "
						+ bodyDeclaration + ", " + "[md2o] = " + md2o + ", " + "[jp2up] = " + jp2up + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (OrphanedClassDec2OrphanedClassImpl
					.pattern_OrphanedClassDec2OrphanedClass_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = OrphanedClassDec2OrphanedClassImpl
						.pattern_OrphanedClassDec2OrphanedClass_29_5_checknacs_blackBBBBBB(umlPackage, feature,
								jPackage, bodyDeclaration, md2o, jp2up);
				if (result5_black != null) {

					Object[] result6_black = OrphanedClassDec2OrphanedClassImpl
							.pattern_OrphanedClassDec2OrphanedClass_29_6_perform_blackBBBBBBB(umlPackage, feature,
									jPackage, bodyDeclaration, md2o, jp2up, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[umlPackage] = "
								+ umlPackage + ", " + "[feature] = " + feature + ", " + "[jPackage] = " + jPackage
								+ ", " + "[bodyDeclaration] = " + bodyDeclaration + ", " + "[md2o] = " + md2o + ", "
								+ "[jp2up] = " + jp2up + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					OrphanedClassDec2OrphanedClassImpl.pattern_OrphanedClassDec2OrphanedClass_29_6_perform_greenBBBBB(
							umlPackage, feature, jPackage, bodyDeclaration, ruleResult);

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
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Model umlPackage,
			Classifier feature, Model jPackage, AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o,
			JavaModel2UMLPackage jp2up, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("umlPackage", umlPackage);
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("jPackage", jPackage);
		isApplicableMatch.registerObject("bodyDeclaration", bodyDeclaration);
		isApplicableMatch.registerObject("md2o", md2o);
		isApplicableMatch.registerObject("jp2up", jp2up);
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
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_FWD__MATCH_MODEL_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MODEL_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MODEL_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Model) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MODEL_CLASSIFIER_MODEL_ABSTRACTTYPEDECLARATION_ASTNODE2ELEMENT_JAVAMODEL2UMLPACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Model) arguments.get(1), (Classifier) arguments.get(2),
					(Model) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(ASTNode2Element) arguments.get(5), (JavaModel2UMLPackage) arguments.get(6));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_BWD__MATCH_MODEL_CLASSIFIER:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(Classifier) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_MODEL_CLASSIFIER:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(Classifier) arguments.get(2));
			return null;
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_MODEL_CLASSIFIER:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Model) arguments.get(1),
					(Classifier) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_CLASSIFIER_MODEL_ABSTRACTTYPEDECLARATION_ASTNODE2ELEMENT_JAVAMODEL2UMLPACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Model) arguments.get(1), (Classifier) arguments.get(2),
					(Model) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(ASTNode2Element) arguments.get(5), (JavaModel2UMLPackage) arguments.get(6));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_135__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_135((EMoflonEdge) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_145__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_145((EMoflonEdge) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__MODEL_CLASSIFIER_MODEL_ABSTRACTTYPEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Model) arguments.get(0),
					(Classifier) arguments.get(1), (Model) arguments.get(2), (AbstractTypeDeclaration) arguments.get(3),
					(Match) arguments.get(4), (Match) arguments.get(5));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_DEC_FWD__MODEL_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((Model) arguments.get(0), (AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___CHECK_DEC_BWD__MODEL_CLASSIFIER:
			return checkDEC_BWD((org.eclipse.uml2.uml.Model) arguments.get(0), (Classifier) arguments.get(1));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAMODEL2UMLPACKAGE_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaModel2UMLPackage) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODEL_CLASSIFIER_MODEL_ABSTRACTTYPEDECLARATION_ASTNODE2ELEMENT_JAVAMODEL2UMLPACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Model) arguments.get(1), (Classifier) arguments.get(2),
					(Model) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(ASTNode2Element) arguments.get(5), (JavaModel2UMLPackage) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.ORPHANED_CLASS_DEC2_ORPHANED_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_1_initialbindings_blackBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration) {
		return new Object[] { _this, match, jPackage, bodyDeclaration };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_bindingFBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, jPackage, bodyDeclaration);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jPackage, bodyDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_bindingAndBlackFBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_binding = pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_bindingFBBBB(
				_this, match, jPackage, bodyDeclaration);
		if (result_pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_black = pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jPackage, bodyDeclaration };
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
			Match match, Model jPackage, AbstractTypeDeclaration bodyDeclaration) {
		return new Object[] { match, jPackage, bodyDeclaration };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_4_collectelementstobetranslated_greenBBBF(
			Match match, Model jPackage, AbstractTypeDeclaration bodyDeclaration) {
		EMoflonEdge jPackage__bodyDeclaration____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jPackage__bodyDeclaration____orphanTypes_name_prime = "orphanTypes";
		jPackage__bodyDeclaration____orphanTypes.setSrc(jPackage);
		jPackage__bodyDeclaration____orphanTypes.setTrg(bodyDeclaration);
		match.getToBeTranslatedEdges().add(jPackage__bodyDeclaration____orphanTypes);
		jPackage__bodyDeclaration____orphanTypes.setName(jPackage__bodyDeclaration____orphanTypes_name_prime);
		return new Object[] { match, jPackage, bodyDeclaration, jPackage__bodyDeclaration____orphanTypes };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_5_collectcontextelements_blackBBB(Match match,
			Model jPackage, AbstractTypeDeclaration bodyDeclaration) {
		return new Object[] { match, jPackage, bodyDeclaration };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_0_5_collectcontextelements_greenBBB(Match match,
			Model jPackage, AbstractTypeDeclaration bodyDeclaration) {
		match.getContextNodes().add(jPackage);
		match.getContextNodes().add(bodyDeclaration);
		return new Object[] { match, jPackage, bodyDeclaration };
	}

	public static final void pattern_OrphanedClassDec2OrphanedClass_0_6_registerobjectstomatch_expressionBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration) {
		_this.registerObjectsToMatch_FWD(match, jPackage, bodyDeclaration);

	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_OrphanedClassDec2OrphanedClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("feature");
		EObject _localVariable_2 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_4 = isApplicableMatch.getObject("md2o");
		EObject _localVariable_5 = isApplicableMatch.getObject("jp2up");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpJPackage = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		EObject tmpMd2o = _localVariable_4;
		EObject tmpJp2up = _localVariable_5;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
			if (tmpFeature instanceof Classifier) {
				Classifier feature = (Classifier) tmpFeature;
				if (tmpJPackage instanceof Model) {
					Model jPackage = (Model) tmpJPackage;
					if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
						if (tmpMd2o instanceof ASTNode2Element) {
							ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
							if (tmpJp2up instanceof JavaModel2UMLPackage) {
								JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) tmpJp2up;
								return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_blackBBBBBBFBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up,
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding = pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding[0];
			Classifier feature = (Classifier) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding[1];
			Model jPackage = (Model) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding[2];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding[3];
			ASTNode2Element md2o = (ASTNode2Element) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding[4];
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_binding[5];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_black = pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_blackBBBBBBFBB(
					umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, _this, isApplicableMatch);
			if (result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_black[6];

				return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_1_performtransformation_greenBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature) {
		umlPackage.getPackagedElements().add(feature);
		return new Object[] { umlPackage, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject umlPackage, EObject feature, EObject jPackage,
			EObject bodyDeclaration, EObject md2o, EObject jp2up) {
		if (!feature.equals(umlPackage)) {
			if (!feature.equals(jPackage)) {
				if (!feature.equals(md2o)) {
					if (!feature.equals(jp2up)) {
						if (!jPackage.equals(umlPackage)) {
							if (!jPackage.equals(md2o)) {
								if (!jPackage.equals(jp2up)) {
									if (!bodyDeclaration.equals(umlPackage)) {
										if (!bodyDeclaration.equals(feature)) {
											if (!bodyDeclaration.equals(jPackage)) {
												if (!bodyDeclaration.equals(md2o)) {
													if (!bodyDeclaration.equals(jp2up)) {
														if (!md2o.equals(umlPackage)) {
															if (!jp2up.equals(umlPackage)) {
																if (!jp2up.equals(md2o)) {
																	return new Object[] { ruleresult, umlPackage,
																			feature, jPackage, bodyDeclaration, md2o,
																			jp2up };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_1_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject umlPackage, EObject feature, EObject jPackage,
			EObject bodyDeclaration) {
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OrphanedClassDec2OrphanedClass";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String jPackage__bodyDeclaration____orphanTypes_name_prime = "orphanTypes";
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		ruleresult.getCreatedEdges().add(umlPackage__feature____packagedElement);
		jPackage__bodyDeclaration____orphanTypes.setSrc(jPackage);
		jPackage__bodyDeclaration____orphanTypes.setTrg(bodyDeclaration);
		ruleresult.getTranslatedEdges().add(jPackage__bodyDeclaration____orphanTypes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		jPackage__bodyDeclaration____orphanTypes.setName(jPackage__bodyDeclaration____orphanTypes_name_prime);
		return new Object[] { ruleresult, umlPackage, feature, jPackage, bodyDeclaration,
				umlPackage__feature____packagedElement, jPackage__bodyDeclaration____orphanTypes };
	}

	public static final void pattern_OrphanedClassDec2OrphanedClass_1_5_registerobjects_expressionBBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, PerformRuleResult ruleresult, EObject umlPackage, EObject feature,
			EObject jPackage, EObject bodyDeclaration, EObject md2o, EObject jp2up) {
		_this.registerObjects_FWD(ruleresult, umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up);

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
		EObject _localVariable_0 = match.getObject("jPackage");
		EObject _localVariable_1 = match.getObject("bodyDeclaration");
		EObject tmpJPackage = _localVariable_0;
		EObject tmpBodyDeclaration = _localVariable_1;
		if (tmpJPackage instanceof Model) {
			Model jPackage = (Model) tmpJPackage;
			if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
				return new Object[] { jPackage, bodyDeclaration, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_2_2_corematch_blackFFBBFFB(
			Model jPackage, AbstractTypeDeclaration bodyDeclaration, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element md2o : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(bodyDeclaration,
				ASTNode2Element.class, "source")) {
			Element tmpFeature = md2o.getTarget();
			if (tmpFeature instanceof Classifier) {
				Classifier feature = (Classifier) tmpFeature;
				for (JavaModel2UMLPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(jPackage, JavaModel2UMLPackage.class, "source")) {
					org.eclipse.uml2.uml.Package tmpUmlPackage = jp2up.getTarget();
					if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
						org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
						String umlPackage_name = umlPackage.getName();
						if (umlPackage_name.equals("externals")) {
							_result.add(new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up,
									match });
						}

					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_2_3_findcontext_blackBBBBBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (feature.equals(md2o.getTarget())) {
			if (bodyDeclaration.equals(md2o.getSource())) {
				if (jPackage.getOrphanTypes().contains(bodyDeclaration)) {
					if (umlPackage.equals(jp2up.getTarget())) {
						if (jPackage.equals(jp2up.getSource())) {
							String umlPackage_name = umlPackage.getName();
							if (umlPackage_name.equals("externals")) {
								_result.add(
										new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_3_findcontext_greenBBBBBBFFFFFF(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge md2o__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String md2o__feature____target_name_prime = "target";
		String md2o__bodyDeclaration____source_name_prime = "source";
		String jPackage__bodyDeclaration____orphanTypes_name_prime = "orphanTypes";
		String jp2up__umlPackage____target_name_prime = "target";
		String jp2up__jPackage____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(md2o);
		isApplicableMatch.getAllContextElements().add(jp2up);
		md2o__feature____target.setSrc(md2o);
		md2o__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(md2o__feature____target);
		md2o__bodyDeclaration____source.setSrc(md2o);
		md2o__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(md2o__bodyDeclaration____source);
		jPackage__bodyDeclaration____orphanTypes.setSrc(jPackage);
		jPackage__bodyDeclaration____orphanTypes.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(jPackage__bodyDeclaration____orphanTypes);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		jp2up__jPackage____source.setSrc(jp2up);
		jp2up__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__jPackage____source);
		md2o__feature____target.setName(md2o__feature____target_name_prime);
		md2o__bodyDeclaration____source.setName(md2o__bodyDeclaration____source_name_prime);
		jPackage__bodyDeclaration____orphanTypes.setName(jPackage__bodyDeclaration____orphanTypes_name_prime);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		jp2up__jPackage____source.setName(jp2up__jPackage____source_name_prime);
		return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, isApplicableMatch,
				md2o__feature____target, md2o__bodyDeclaration____source, jPackage__bodyDeclaration____orphanTypes,
				jp2up__umlPackage____target, jp2up__jPackage____source };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_bindingFBBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, umlPackage, feature, jPackage,
				bodyDeclaration, md2o, jp2up);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration, md2o,
					jp2up };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_binding = pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up);
		if (result_pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_black = pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration,
						md2o, jp2up };
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
			Classifier feature) {
		return new Object[] { _this, match, umlPackage, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_2_SolveCSP_bindingFBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, org.eclipse.uml2.uml.Model umlPackage,
			Classifier feature) {
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
			Classifier feature) {
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
			Match match, org.eclipse.uml2.uml.Model umlPackage, Classifier feature) {
		return new Object[] { match, umlPackage, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Model umlPackage, Classifier feature) {
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		match.getToBeTranslatedEdges().add(umlPackage__feature____packagedElement);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		return new Object[] { match, umlPackage, feature, umlPackage__feature____packagedElement };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_5_collectcontextelements_blackBBB(
			Match match, org.eclipse.uml2.uml.Model umlPackage, Classifier feature) {
		return new Object[] { match, umlPackage, feature };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_10_5_collectcontextelements_greenBBB(
			Match match, org.eclipse.uml2.uml.Model umlPackage, Classifier feature) {
		match.getContextNodes().add(umlPackage);
		match.getContextNodes().add(feature);
		return new Object[] { match, umlPackage, feature };
	}

	public static final void pattern_OrphanedClassDec2OrphanedClass_10_6_registerobjectstomatch_expressionBBBB(
			OrphanedClassDec2OrphanedClass _this, Match match, org.eclipse.uml2.uml.Model umlPackage,
			Classifier feature) {
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("umlPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("feature");
		EObject _localVariable_2 = isApplicableMatch.getObject("jPackage");
		EObject _localVariable_3 = isApplicableMatch.getObject("bodyDeclaration");
		EObject _localVariable_4 = isApplicableMatch.getObject("md2o");
		EObject _localVariable_5 = isApplicableMatch.getObject("jp2up");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpJPackage = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		EObject tmpMd2o = _localVariable_4;
		EObject tmpJp2up = _localVariable_5;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
			if (tmpFeature instanceof Classifier) {
				Classifier feature = (Classifier) tmpFeature;
				if (tmpJPackage instanceof Model) {
					Model jPackage = (Model) tmpJPackage;
					if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
						if (tmpMd2o instanceof ASTNode2Element) {
							ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
							if (tmpJp2up instanceof JavaModel2UMLPackage) {
								JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) tmpJp2up;
								return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_blackBBBBBBFBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up,
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding = pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding[0];
			Classifier feature = (Classifier) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding[1];
			Model jPackage = (Model) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding[2];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding[3];
			ASTNode2Element md2o = (ASTNode2Element) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding[4];
			JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_binding[5];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_black = pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_blackBBBBBBFBB(
					umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, _this, isApplicableMatch);
			if (result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_black[6];

				return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_1_performtransformation_greenBB(
			Model jPackage, AbstractTypeDeclaration bodyDeclaration) {
		jPackage.getOrphanTypes().add(bodyDeclaration);
		return new Object[] { jPackage, bodyDeclaration };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject umlPackage, EObject feature, EObject jPackage,
			EObject bodyDeclaration, EObject md2o, EObject jp2up) {
		if (!feature.equals(umlPackage)) {
			if (!feature.equals(jPackage)) {
				if (!feature.equals(md2o)) {
					if (!feature.equals(jp2up)) {
						if (!jPackage.equals(umlPackage)) {
							if (!jPackage.equals(md2o)) {
								if (!jPackage.equals(jp2up)) {
									if (!bodyDeclaration.equals(umlPackage)) {
										if (!bodyDeclaration.equals(feature)) {
											if (!bodyDeclaration.equals(jPackage)) {
												if (!bodyDeclaration.equals(md2o)) {
													if (!bodyDeclaration.equals(jp2up)) {
														if (!md2o.equals(umlPackage)) {
															if (!jp2up.equals(umlPackage)) {
																if (!jp2up.equals(md2o)) {
																	return new Object[] { ruleresult, umlPackage,
																			feature, jPackage, bodyDeclaration, md2o,
																			jp2up };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_11_3_bookkeepingforedges_greenBBBBBFF(
			PerformRuleResult ruleresult, EObject umlPackage, EObject feature, EObject jPackage,
			EObject bodyDeclaration) {
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jPackage__bodyDeclaration____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "OrphanedClassDec2OrphanedClass";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String jPackage__bodyDeclaration____orphanTypes_name_prime = "orphanTypes";
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		ruleresult.getTranslatedEdges().add(umlPackage__feature____packagedElement);
		jPackage__bodyDeclaration____orphanTypes.setSrc(jPackage);
		jPackage__bodyDeclaration____orphanTypes.setTrg(bodyDeclaration);
		ruleresult.getCreatedEdges().add(jPackage__bodyDeclaration____orphanTypes);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		jPackage__bodyDeclaration____orphanTypes.setName(jPackage__bodyDeclaration____orphanTypes_name_prime);
		return new Object[] { ruleresult, umlPackage, feature, jPackage, bodyDeclaration,
				umlPackage__feature____packagedElement, jPackage__bodyDeclaration____orphanTypes };
	}

	public static final void pattern_OrphanedClassDec2OrphanedClass_11_5_registerobjects_expressionBBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, PerformRuleResult ruleresult, EObject umlPackage, EObject feature,
			EObject jPackage, EObject bodyDeclaration, EObject md2o, EObject jp2up) {
		_this.registerObjects_BWD(ruleresult, umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up);

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
			if (tmpFeature instanceof Classifier) {
				Classifier feature = (Classifier) tmpFeature;
				return new Object[] { umlPackage, feature, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_12_2_corematch_blackBBFFFFB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String umlPackage_name = umlPackage.getName();
		if (umlPackage_name.equals("externals")) {
			for (ASTNode2Element md2o : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(feature,
					ASTNode2Element.class, "target")) {
				ASTNode tmpBodyDeclaration = md2o.getSource();
				if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
					for (JavaModel2UMLPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(umlPackage, JavaModel2UMLPackage.class, "target")) {
						Model jPackage = jp2up.getSource();
						if (jPackage != null) {
							_result.add(new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up,
									match });
						}

					}
				}

			}
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_12_3_findcontext_blackBBBBBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (feature.equals(md2o.getTarget())) {
			if (bodyDeclaration.equals(md2o.getSource())) {
				if (umlPackage.getPackagedElements().contains(feature)) {
					if (umlPackage.equals(jp2up.getTarget())) {
						if (jPackage.equals(jp2up.getSource())) {
							String umlPackage_name = umlPackage.getName();
							if (umlPackage_name.equals("externals")) {
								_result.add(
										new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up });
							}

						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_3_findcontext_greenBBBBBBFFFFFF(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge md2o__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge md2o__bodyDeclaration____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge umlPackage__feature____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__umlPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jp2up__jPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String md2o__feature____target_name_prime = "target";
		String md2o__bodyDeclaration____source_name_prime = "source";
		String umlPackage__feature____packagedElement_name_prime = "packagedElement";
		String jp2up__umlPackage____target_name_prime = "target";
		String jp2up__jPackage____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(umlPackage);
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(jPackage);
		isApplicableMatch.getAllContextElements().add(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(md2o);
		isApplicableMatch.getAllContextElements().add(jp2up);
		md2o__feature____target.setSrc(md2o);
		md2o__feature____target.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(md2o__feature____target);
		md2o__bodyDeclaration____source.setSrc(md2o);
		md2o__bodyDeclaration____source.setTrg(bodyDeclaration);
		isApplicableMatch.getAllContextElements().add(md2o__bodyDeclaration____source);
		umlPackage__feature____packagedElement.setSrc(umlPackage);
		umlPackage__feature____packagedElement.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(umlPackage__feature____packagedElement);
		jp2up__umlPackage____target.setSrc(jp2up);
		jp2up__umlPackage____target.setTrg(umlPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__umlPackage____target);
		jp2up__jPackage____source.setSrc(jp2up);
		jp2up__jPackage____source.setTrg(jPackage);
		isApplicableMatch.getAllContextElements().add(jp2up__jPackage____source);
		md2o__feature____target.setName(md2o__feature____target_name_prime);
		md2o__bodyDeclaration____source.setName(md2o__bodyDeclaration____source_name_prime);
		umlPackage__feature____packagedElement.setName(umlPackage__feature____packagedElement_name_prime);
		jp2up__umlPackage____target.setName(jp2up__umlPackage____target_name_prime);
		jp2up__jPackage____source.setName(jp2up__jPackage____source_name_prime);
		return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, isApplicableMatch,
				md2o__feature____target, md2o__bodyDeclaration____source, umlPackage__feature____packagedElement,
				jp2up__umlPackage____target, jp2up__jPackage____source };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_bindingFBBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, umlPackage, feature, jPackage,
				bodyDeclaration, md2o, jp2up);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration, md2o,
					jp2up };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_binding = pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up);
		if (result_pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_black = pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration,
						md2o, jp2up };
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

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUmlPackage = _edge_packagedElement.getSrc();
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
			EObject tmpFeature = _edge_packagedElement.getTrg();
			if (tmpFeature instanceof Classifier) {
				Classifier feature = (Classifier) tmpFeature;
				if (umlPackage.getPackagedElements().contains(feature)) {
					String umlPackage_name = umlPackage.getName();
					if (umlPackage_name.equals("externals")) {
						_result.add(new Object[] { umlPackage, feature, _edge_packagedElement });
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
			Classifier feature) {
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

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJPackage = _edge_orphanTypes.getSrc();
		if (tmpJPackage instanceof Model) {
			Model jPackage = (Model) tmpJPackage;
			EObject tmpBodyDeclaration = _edge_orphanTypes.getTrg();
			if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
				if (jPackage.getOrphanTypes().contains(bodyDeclaration)) {
					_result.add(new Object[] { jPackage, bodyDeclaration, _edge_orphanTypes });
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
			OrphanedClassDec2OrphanedClass _this, Match match, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, jPackage, bodyDeclaration);
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
		EObject _localVariable_1 = targetMatch.getObject("feature");
		EObject _localVariable_2 = sourceMatch.getObject("jPackage");
		EObject _localVariable_3 = sourceMatch.getObject("bodyDeclaration");
		EObject tmpUmlPackage = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpJPackage = _localVariable_2;
		EObject tmpBodyDeclaration = _localVariable_3;
		if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
			if (tmpFeature instanceof Classifier) {
				Classifier feature = (Classifier) tmpFeature;
				if (tmpJPackage instanceof Model) {
					Model jPackage = (Model) tmpJPackage;
					if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
						return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, targetMatch,
								sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			String umlPackage_name = umlPackage.getName();
			if (umlPackage_name.equals("externals")) {
				return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, sourceMatch, targetMatch };
			}

		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding = pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding[0];
			Classifier feature = (Classifier) result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding[1];
			Model jPackage = (Model) result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding[2];
			AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_black = pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_blackBBBBBB(
					umlPackage, feature, jPackage, bodyDeclaration, sourceMatch, targetMatch);
			if (result_pattern_OrphanedClassDec2OrphanedClass_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_bindingFBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, org.eclipse.uml2.uml.Model umlPackage, Classifier feature,
			Model jPackage, AbstractTypeDeclaration bodyDeclaration, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(umlPackage, feature, jPackage, bodyDeclaration,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, umlPackage, feature, jPackage, bodyDeclaration, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, org.eclipse.uml2.uml.Model umlPackage, Classifier feature,
			Model jPackage, AbstractTypeDeclaration bodyDeclaration, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_binding = pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_bindingFBBBBBBB(
				_this, umlPackage, feature, jPackage, bodyDeclaration, sourceMatch, targetMatch);
		if (result_pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_black = pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, umlPackage, feature, jPackage, bodyDeclaration, sourceMatch,
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

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_24_5_matchcorrcontext_blackBBBBFFBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			String umlPackage_name = umlPackage.getName();
			if (umlPackage_name.equals("externals")) {
				for (ASTNode2Element md2o : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(feature,
						ASTNode2Element.class, "target")) {
					if (bodyDeclaration.equals(md2o.getSource())) {
						for (JavaModel2UMLPackage jp2up : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(umlPackage, JavaModel2UMLPackage.class, "target")) {
							if (jPackage.equals(jp2up.getSource())) {
								_result.add(new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up,
										sourceMatch, targetMatch });
							}
						}
					}
				}
			}

		}
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element md2o, JavaModel2UMLPackage jp2up, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "OrphanedClassDec2OrphanedClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(md2o);
		ccMatch.getAllContextElements().add(jp2up);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { md2o, jp2up, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, CCMatch ccMatch) {
		return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, ccMatch };
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_27_1_matchtggpattern_blackBB(Model jPackage,
			AbstractTypeDeclaration bodyDeclaration) {
		if (jPackage.getOrphanTypes().contains(bodyDeclaration)) {
			return new Object[] { jPackage, bodyDeclaration };
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature) {
		if (umlPackage.getPackagedElements().contains(feature)) {
			String umlPackage_name = umlPackage.getName();
			if (umlPackage_name.equals("externals")) {
				return new Object[] { umlPackage, feature };
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
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Model umlPackage) {
		if (ruleResult.getTargetObjects().contains(umlPackage)) {
			return new Object[] { ruleResult, umlPackage };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, JavaModel2UMLPackage jp2up) {
		if (ruleResult.getCorrObjects().contains(jp2up)) {
			return new Object[] { ruleResult, jp2up };
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Classifier feature) {
		if (ruleResult.getTargetObjects().contains(feature)) {
			return new Object[] { ruleResult, feature };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element md2o) {
		if (ruleResult.getCorrObjects().contains(md2o)) {
			return new Object[] { ruleResult, md2o };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration bodyDeclaration) {
		if (ruleResult.getSourceObjects().contains(bodyDeclaration)) {
			return new Object[] { ruleResult, bodyDeclaration };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jp2upList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList md2oList : ruleEntryContainer.getRuleEntryList()) {
				if (!jp2upList.equals(md2oList)) {
					for (EObject tmpJp2up : jp2upList.getEntryObjects()) {
						if (tmpJp2up instanceof JavaModel2UMLPackage) {
							JavaModel2UMLPackage jp2up = (JavaModel2UMLPackage) tmpJp2up;
							org.eclipse.uml2.uml.Package tmpUmlPackage = jp2up.getTarget();
							if (tmpUmlPackage instanceof org.eclipse.uml2.uml.Model) {
								org.eclipse.uml2.uml.Model umlPackage = (org.eclipse.uml2.uml.Model) tmpUmlPackage;
								Model jPackage = jp2up.getSource();
								if (jPackage != null) {
									String umlPackage_name = umlPackage.getName();
									if (umlPackage_name.equals("externals")) {
										if (pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_1BB(
												ruleResult, jp2up) == null) {
											if (pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_0BB(
													ruleResult, umlPackage) == null) {
												if (pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_2BB(
														ruleResult, jPackage) == null) {
													for (EObject tmpMd2o : md2oList.getEntryObjects()) {
														if (tmpMd2o instanceof ASTNode2Element) {
															ASTNode2Element md2o = (ASTNode2Element) tmpMd2o;
															Element tmpFeature = md2o.getTarget();
															if (tmpFeature instanceof Classifier) {
																Classifier feature = (Classifier) tmpFeature;
																ASTNode tmpBodyDeclaration = md2o.getSource();
																if (tmpBodyDeclaration instanceof AbstractTypeDeclaration) {
																	AbstractTypeDeclaration bodyDeclaration = (AbstractTypeDeclaration) tmpBodyDeclaration;
																	if (pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_4BB(
																			ruleResult, md2o) == null) {
																		if (pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_3BB(
																				ruleResult, feature) == null) {
																			if (pattern_OrphanedClassDec2OrphanedClass_29_2_isapplicablecore_black_nac_5BB(
																					ruleResult,
																					bodyDeclaration) == null) {
																				_result.add(new Object[] { jp2upList,
																						umlPackage, jp2up, jPackage,
																						md2oList, feature, md2o,
																						bodyDeclaration,
																						ruleEntryContainer,
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
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_bindingFBBBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, umlPackage, feature, jPackage,
				bodyDeclaration, md2o, jp2up, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration, md2o,
					jp2up, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			OrphanedClassDec2OrphanedClass _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_binding = pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, ruleResult);
		if (result_pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_binding[0];

			Object[] result_pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_black = pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_OrphanedClassDec2OrphanedClass_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, umlPackage, feature, jPackage, bodyDeclaration,
						md2o, jp2up, ruleResult };
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

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_5_checknacs_blackBBBBBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up) {
		String umlPackage_name = umlPackage.getName();
		if (umlPackage_name.equals("externals")) {
			return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_6_perform_blackBBBBBBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ASTNode2Element md2o, JavaModel2UMLPackage jp2up,
			ModelgeneratorRuleResult ruleResult) {
		String umlPackage_name = umlPackage.getName();
		if (umlPackage_name.equals("externals")) {
			return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, md2o, jp2up, ruleResult };
		}

		return null;
	}

	public static final Object[] pattern_OrphanedClassDec2OrphanedClass_29_6_perform_greenBBBBB(
			org.eclipse.uml2.uml.Model umlPackage, Classifier feature, Model jPackage,
			AbstractTypeDeclaration bodyDeclaration, ModelgeneratorRuleResult ruleResult) {
		umlPackage.getPackagedElements().add(feature);
		jPackage.getOrphanTypes().add(bodyDeclaration);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { umlPackage, feature, jPackage, bodyDeclaration, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_OrphanedClassDec2OrphanedClass_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //OrphanedClassDec2OrphanedClassImpl
