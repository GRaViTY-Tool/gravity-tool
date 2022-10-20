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

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;

import org.gravity.tgg.modisco.uml.ASTNode2Element;
import org.gravity.tgg.modisco.uml.JavaPackage2UmlPackage;

import org.gravity.tgg.modisco.uml.Rules.LinkTypeToPackage;
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
 * An implementation of the model object '<em><b>Link Type To Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LinkTypeToPackageImpl extends AbstractRuleImpl implements LinkTypeToPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTypeToPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getLinkTypeToPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, org.eclipse.modisco.java.Package mPackage,
			AbstractTypeDeclaration mType) {

		Object[] result1_black = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_0_1_initialbindings_blackBBBB(this,
				match, mPackage, mType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
		}

		Object[] result2_bindingAndBlack = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, mPackage, mType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkTypeToPackageImpl.pattern_LinkTypeToPackage_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkTypeToPackageImpl
					.pattern_LinkTypeToPackage_0_4_collectelementstobetranslated_blackBBB(match, mPackage, mType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
			}
			LinkTypeToPackageImpl.pattern_LinkTypeToPackage_0_4_collectelementstobetranslated_greenBBBFF(match,
					mPackage, mType);
			//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result4_green[4];

			Object[] result5_black = LinkTypeToPackageImpl
					.pattern_LinkTypeToPackage_0_5_collectcontextelements_blackBBB(match, mPackage, mType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mPackage] = " + mPackage + ", " + "[mType] = " + mType + ".");
			}
			LinkTypeToPackageImpl.pattern_LinkTypeToPackage_0_5_collectcontextelements_greenBBB(match, mPackage, mType);

			// 
			LinkTypeToPackageImpl.pattern_LinkTypeToPackage_0_6_registerobjectstomatch_expressionBBBB(this, match,
					mPackage, mType);
			return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_0_7_expressionF();
		} else {
			return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[0];
		Classifier uType = (Classifier) result1_bindingAndBlack[1];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[2];
		ASTNode2Element t2t = (ASTNode2Element) result1_bindingAndBlack[3];
		JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result1_bindingAndBlack[4];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		LinkTypeToPackageImpl.pattern_LinkTypeToPackage_1_1_performtransformation_greenBB(uType, uPackage);

		Object[] result2_green = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_1_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mPackage, uType, mType, t2t, p2p, uPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mPackage] = " + mPackage + ", " + "[uType] = " + uType + ", " + "[mType] = " + mType
					+ ", " + "[t2t] = " + t2t + ", " + "[p2p] = " + p2p + ", " + "[uPackage] = " + uPackage + ".");
		}
		LinkTypeToPackageImpl.pattern_LinkTypeToPackage_1_3_bookkeepingforedges_greenBBBBBFFF(ruleresult, mPackage,
				uType, mType, uPackage);
		//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge uPackage__uType____packagedElement = (EMoflonEdge) result3_green[7];

		// 
		// 
		LinkTypeToPackageImpl.pattern_LinkTypeToPackage_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mPackage, uType, mType, t2t, p2p, uPackage);
		return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_binding[0];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_binding[1];
		for (Object[] result2_black : LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_2_2_corematch_blackBFBFFFB(mPackage, mType, match)) {
			Classifier uType = (Classifier) result2_black[1];
			ASTNode2Element t2t = (ASTNode2Element) result2_black[3];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[4];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_black[5];
			// ForEach 
			for (Object[] result3_black : LinkTypeToPackageImpl.pattern_LinkTypeToPackage_2_3_findcontext_blackBBBBBB(
					mPackage, uType, mType, t2t, p2p, uPackage)) {
				Object[] result3_green = LinkTypeToPackageImpl
						.pattern_LinkTypeToPackage_2_3_findcontext_greenBBBBBBFFFFFFF(mPackage, uType, mType, t2t, p2p,
								uPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge t2t__mType____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge p2p__mPackage____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge t2t__uType____target = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge p2p__uPackage____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = LinkTypeToPackageImpl
						.pattern_LinkTypeToPackage_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mPackage, uType, mType, t2t, p2p, uPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackage] = " + mPackage + ", "
							+ "[uType] = " + uType + ", " + "[mType] = " + mType + ", " + "[t2t] = " + t2t + ", "
							+ "[p2p] = " + p2p + ", " + "[uPackage] = " + uPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (LinkTypeToPackageImpl.pattern_LinkTypeToPackage_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = LinkTypeToPackageImpl
							.pattern_LinkTypeToPackage_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					LinkTypeToPackageImpl.pattern_LinkTypeToPackage_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, org.eclipse.modisco.java.Package mPackage,
			AbstractTypeDeclaration mType) {
		match.registerObject("mPackage", mPackage);
		match.registerObject("mType", mType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, org.eclipse.modisco.java.Package mPackage,
			AbstractTypeDeclaration mType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage,
			Classifier uType, AbstractTypeDeclaration mType, ASTNode2Element t2t, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("t2t", t2t);
		isApplicableMatch.registerObject("p2p", p2p);
		isApplicableMatch.registerObject("uPackage", uPackage);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject mPackage, EObject uType, EObject mType,
			EObject t2t, EObject p2p, EObject uPackage) {
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("t2t", t2t);
		ruleresult.registerObject("p2p", p2p);
		ruleresult.registerObject("uPackage", uPackage);

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
	public boolean isAppropriate_BWD(Match match, Classifier uType, org.eclipse.uml2.uml.Package uPackage) {

		Object[] result1_black = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_10_1_initialbindings_blackBBBB(this,
				match, uType, uPackage);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uType] = " + uType + ", " + "[uPackage] = " + uPackage + ".");
		}

		Object[] result2_bindingAndBlack = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, uType, uPackage);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uType] = " + uType + ", " + "[uPackage] = " + uPackage + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (LinkTypeToPackageImpl.pattern_LinkTypeToPackage_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = LinkTypeToPackageImpl
					.pattern_LinkTypeToPackage_10_4_collectelementstobetranslated_blackBBB(match, uType, uPackage);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uType] = " + uType + ", " + "[uPackage] = " + uPackage + ".");
			}
			LinkTypeToPackageImpl.pattern_LinkTypeToPackage_10_4_collectelementstobetranslated_greenBBBF(match, uType,
					uPackage);
			//nothing EMoflonEdge uPackage__uType____packagedElement = (EMoflonEdge) result4_green[3];

			Object[] result5_black = LinkTypeToPackageImpl
					.pattern_LinkTypeToPackage_10_5_collectcontextelements_blackBBB(match, uType, uPackage);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uType] = " + uType + ", " + "[uPackage] = " + uPackage + ".");
			}
			LinkTypeToPackageImpl.pattern_LinkTypeToPackage_10_5_collectcontextelements_greenBBB(match, uType,
					uPackage);

			// 
			LinkTypeToPackageImpl.pattern_LinkTypeToPackage_10_6_registerobjectstomatch_expressionBBBB(this, match,
					uType, uPackage);
			return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_10_7_expressionF();
		} else {
			return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result1_bindingAndBlack[0];
		Classifier uType = (Classifier) result1_bindingAndBlack[1];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result1_bindingAndBlack[2];
		ASTNode2Element t2t = (ASTNode2Element) result1_bindingAndBlack[3];
		JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result1_bindingAndBlack[4];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		LinkTypeToPackageImpl.pattern_LinkTypeToPackage_11_1_performtransformation_greenBB(mPackage, mType);

		Object[] result2_green = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_11_2_collecttranslatedelements_greenF();
		if (result2_green == null) {
			throw new RuntimeException("Pattern matching failed.");
		}
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, mPackage, uType, mType, t2t, p2p, uPackage);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[mPackage] = " + mPackage + ", " + "[uType] = " + uType + ", " + "[mType] = " + mType
					+ ", " + "[t2t] = " + t2t + ", " + "[p2p] = " + p2p + ", " + "[uPackage] = " + uPackage + ".");
		}
		LinkTypeToPackageImpl.pattern_LinkTypeToPackage_11_3_bookkeepingforedges_greenBBBBBFFF(ruleresult, mPackage,
				uType, mType, uPackage);
		//nothing EMoflonEdge mType__mPackage____package = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge mPackage__mType____ownedElements = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge uPackage__uType____packagedElement = (EMoflonEdge) result3_green[7];

		// 
		// 
		LinkTypeToPackageImpl.pattern_LinkTypeToPackage_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
				mPackage, uType, mType, t2t, p2p, uPackage);
		return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Classifier uType = (Classifier) result2_binding[0];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_binding[1];
		for (Object[] result2_black : LinkTypeToPackageImpl.pattern_LinkTypeToPackage_12_2_corematch_blackFBFFFBB(uType,
				uPackage, match)) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[2];
			ASTNode2Element t2t = (ASTNode2Element) result2_black[3];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[4];
			// ForEach 
			for (Object[] result3_black : LinkTypeToPackageImpl.pattern_LinkTypeToPackage_12_3_findcontext_blackBBBBBB(
					mPackage, uType, mType, t2t, p2p, uPackage)) {
				Object[] result3_green = LinkTypeToPackageImpl
						.pattern_LinkTypeToPackage_12_3_findcontext_greenBBBBBBFFFFFF(mPackage, uType, mType, t2t, p2p,
								uPackage);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge t2t__mType____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge p2p__mPackage____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge t2t__uType____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge uPackage__uType____packagedElement = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge p2p__uPackage____target = (EMoflonEdge) result3_green[11];

				Object[] result4_bindingAndBlack = LinkTypeToPackageImpl
						.pattern_LinkTypeToPackage_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mPackage, uType, mType, t2t, p2p, uPackage);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackage] = " + mPackage + ", "
							+ "[uType] = " + uType + ", " + "[mType] = " + mType + ", " + "[t2t] = " + t2t + ", "
							+ "[p2p] = " + p2p + ", " + "[uPackage] = " + uPackage + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (LinkTypeToPackageImpl.pattern_LinkTypeToPackage_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = LinkTypeToPackageImpl
							.pattern_LinkTypeToPackage_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					LinkTypeToPackageImpl.pattern_LinkTypeToPackage_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Classifier uType, org.eclipse.uml2.uml.Package uPackage) {
		match.registerObject("uType", uType);
		match.registerObject("uPackage", uPackage);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Classifier uType, org.eclipse.uml2.uml.Package uPackage) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage,
			Classifier uType, AbstractTypeDeclaration mType, ASTNode2Element t2t, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uPackage) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("t2t", t2t);
		isApplicableMatch.registerObject("p2p", p2p);
		isApplicableMatch.registerObject("uPackage", uPackage);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject mPackage, EObject uType, EObject mType,
			EObject t2t, EObject p2p, EObject uPackage) {
		ruleresult.registerObject("mPackage", mPackage);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("mType", mType);
		ruleresult.registerObject("t2t", t2t);
		ruleresult.registerObject("p2p", p2p);
		ruleresult.registerObject("uPackage", uPackage);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_138(EMoflonEdge _edge_packagedElement) {

		Object[] result1_bindingAndBlack = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_20_2_testcorematchandDECs_blackFFB(_edge_packagedElement)) {
			Classifier uType = (Classifier) result2_black[0];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_black[1];
			Object[] result2_green = LinkTypeToPackageImpl
					.pattern_LinkTypeToPackage_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkTypeToPackageImpl
					.pattern_LinkTypeToPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, uType, uPackage)) {
				// 
				if (LinkTypeToPackageImpl
						.pattern_LinkTypeToPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = LinkTypeToPackageImpl
							.pattern_LinkTypeToPackage_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					LinkTypeToPackageImpl.pattern_LinkTypeToPackage_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_149(EMoflonEdge _edge_package) {

		Object[] result1_bindingAndBlack = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_21_2_testcorematchandDECs_blackFFB(_edge_package)) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[0];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[1];
			Object[] result2_green = LinkTypeToPackageImpl
					.pattern_LinkTypeToPackage_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (LinkTypeToPackageImpl
					.pattern_LinkTypeToPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, mPackage, mType)) {
				// 
				if (LinkTypeToPackageImpl
						.pattern_LinkTypeToPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = LinkTypeToPackageImpl
							.pattern_LinkTypeToPackage_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					LinkTypeToPackageImpl.pattern_LinkTypeToPackage_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("LinkTypeToPackage");
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
		ruleResult.setRule("LinkTypeToPackage");
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

		Object[] result1_black = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_bindingAndBlack[0];
		Classifier uType = (Classifier) result2_bindingAndBlack[1];
		AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, mPackage, uType, mType, uPackage,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mPackage] = " + mPackage + ", " + "[uType] = " + uType + ", " + "[mType] = " + mType + ", "
					+ "[uPackage] = " + uPackage + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (LinkTypeToPackageImpl.pattern_LinkTypeToPackage_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : LinkTypeToPackageImpl
					.pattern_LinkTypeToPackage_24_5_matchcorrcontext_blackBBBFFBBB(mPackage, uType, mType, uPackage,
							sourceMatch, targetMatch)) {
				ASTNode2Element t2t = (ASTNode2Element) result5_black[3];
				JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result5_black[4];
				Object[] result5_green = LinkTypeToPackageImpl
						.pattern_LinkTypeToPackage_24_5_matchcorrcontext_greenBBBBF(t2t, p2p, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = LinkTypeToPackageImpl
						.pattern_LinkTypeToPackage_24_6_createcorrespondence_blackBBBBB(mPackage, uType, mType,
								uPackage, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mPackage] = " + mPackage
							+ ", " + "[uType] = " + uType + ", " + "[mType] = " + mType + ", " + "[uPackage] = "
							+ uPackage + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = LinkTypeToPackageImpl
						.pattern_LinkTypeToPackage_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				LinkTypeToPackageImpl.pattern_LinkTypeToPackage_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.modisco.java.Package mPackage, Classifier uType,
			AbstractTypeDeclaration mType, org.eclipse.uml2.uml.Package uPackage, Match sourceMatch,
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
	public boolean checkDEC_FWD(org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType) {// 
		Object[] result1_black = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_27_1_matchtggpattern_blackBB(mPackage,
				mType);
		if (result1_black != null) {
			return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_27_2_expressionF();
		} else {
			return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Classifier uType, org.eclipse.uml2.uml.Package uPackage) {// 
		Object[] result1_black = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_28_1_matchtggpattern_blackBB(uType,
				uPackage);
		if (result1_black != null) {
			return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_28_2_expressionF();
		} else {
			return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaPackage2UmlPackage p2pParameter, ASTNode2Element t2tParameter) {

		Object[] result1_black = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : LinkTypeToPackageImpl
				.pattern_LinkTypeToPackage_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList p2pList = (RuleEntryList) result2_black[0];
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result2_black[1];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result2_black[2];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result2_black[3];
			//nothing RuleEntryList t2tList = (RuleEntryList) result2_black[4];
			Classifier uType = (Classifier) result2_black[5];
			ASTNode2Element t2t = (ASTNode2Element) result2_black[6];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = LinkTypeToPackageImpl
					.pattern_LinkTypeToPackage_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							mPackage, uType, mType, t2t, p2p, uPackage, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mPackage] = " + mPackage + ", "
						+ "[uType] = " + uType + ", " + "[mType] = " + mType + ", " + "[t2t] = " + t2t + ", "
						+ "[p2p] = " + p2p + ", " + "[uPackage] = " + uPackage + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (LinkTypeToPackageImpl.pattern_LinkTypeToPackage_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_29_5_checknacs_blackBBBBBB(
						mPackage, uType, mType, t2t, p2p, uPackage);
				if (result5_black != null) {

					Object[] result6_black = LinkTypeToPackageImpl.pattern_LinkTypeToPackage_29_6_perform_blackBBBBBBB(
							mPackage, uType, mType, t2t, p2p, uPackage, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mPackage] = "
								+ mPackage + ", " + "[uType] = " + uType + ", " + "[mType] = " + mType + ", "
								+ "[t2t] = " + t2t + ", " + "[p2p] = " + p2p + ", " + "[uPackage] = " + uPackage + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					LinkTypeToPackageImpl.pattern_LinkTypeToPackage_29_6_perform_greenBBBBB(mPackage, uType, mType,
							uPackage, ruleResult);

				} else {
				}

			} else {
			}

		}
		return LinkTypeToPackageImpl.pattern_LinkTypeToPackage_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			ASTNode2Element t2t, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uPackage,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mPackage", mPackage);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("mType", mType);
		isApplicableMatch.registerObject("t2t", t2t);
		isApplicableMatch.registerObject("p2p", p2p);
		isApplicableMatch.registerObject("uPackage", uPackage);
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
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPROPRIATE_FWD__MATCH_PACKAGE_ABSTRACTTYPEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_PACKAGE_ABSTRACTTYPEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (org.eclipse.modisco.java.Package) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2));
			return null;
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_PACKAGE_ABSTRACTTYPEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (AbstractTypeDeclaration) arguments.get(2));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_PACKAGE_CLASSIFIER_ABSTRACTTYPEDECLARATION_ASTNODE2ELEMENT_JAVAPACKAGE2UMLPACKAGE_PACKAGE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (Classifier) arguments.get(2),
					(AbstractTypeDeclaration) arguments.get(3), (ASTNode2Element) arguments.get(4),
					(JavaPackage2UmlPackage) arguments.get(5), (org.eclipse.uml2.uml.Package) arguments.get(6));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.LINK_TYPE_TO_PACKAGE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPROPRIATE_BWD__MATCH_CLASSIFIER_PACKAGE:
			return isAppropriate_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASSIFIER_PACKAGE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
			return null;
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASSIFIER_PACKAGE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Classifier) arguments.get(1),
					(org.eclipse.uml2.uml.Package) arguments.get(2));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_CLASSIFIER_ABSTRACTTYPEDECLARATION_ASTNODE2ELEMENT_JAVAPACKAGE2UMLPACKAGE_PACKAGE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (Classifier) arguments.get(2),
					(AbstractTypeDeclaration) arguments.get(3), (ASTNode2Element) arguments.get(4),
					(JavaPackage2UmlPackage) arguments.get(5), (org.eclipse.uml2.uml.Package) arguments.get(6));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.LINK_TYPE_TO_PACKAGE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_138__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_138((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_149__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_149((EMoflonEdge) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPLICABLE_SOLVE_CSP_CC__PACKAGE_CLASSIFIER_ABSTRACTTYPEDECLARATION_PACKAGE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.modisco.java.Package) arguments.get(0),
					(Classifier) arguments.get(1), (AbstractTypeDeclaration) arguments.get(2),
					(org.eclipse.uml2.uml.Package) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___CHECK_DEC_FWD__PACKAGE_ABSTRACTTYPEDECLARATION:
			return checkDEC_FWD((org.eclipse.modisco.java.Package) arguments.get(0),
					(AbstractTypeDeclaration) arguments.get(1));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___CHECK_DEC_BWD__CLASSIFIER_PACKAGE:
			return checkDEC_BWD((Classifier) arguments.get(0), (org.eclipse.uml2.uml.Package) arguments.get(1));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAPACKAGE2UMLPACKAGE_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaPackage2UmlPackage) arguments.get(1),
					(ASTNode2Element) arguments.get(2));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_PACKAGE_CLASSIFIER_ABSTRACTTYPEDECLARATION_ASTNODE2ELEMENT_JAVAPACKAGE2UMLPACKAGE_PACKAGE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.modisco.java.Package) arguments.get(1), (Classifier) arguments.get(2),
					(AbstractTypeDeclaration) arguments.get(3), (ASTNode2Element) arguments.get(4),
					(JavaPackage2UmlPackage) arguments.get(5), (org.eclipse.uml2.uml.Package) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.LINK_TYPE_TO_PACKAGE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_LinkTypeToPackage_0_1_initialbindings_blackBBBB(LinkTypeToPackage _this,
			Match match, org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType) {
		return new Object[] { _this, match, mPackage, mType };
	}

	public static final Object[] pattern_LinkTypeToPackage_0_2_SolveCSP_bindingFBBBB(LinkTypeToPackage _this,
			Match match, org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mPackage, mType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mPackage, mType };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkTypeToPackage_0_2_SolveCSP_bindingAndBlackFBBBB(LinkTypeToPackage _this,
			Match match, org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType) {
		Object[] result_pattern_LinkTypeToPackage_0_2_SolveCSP_binding = pattern_LinkTypeToPackage_0_2_SolveCSP_bindingFBBBB(
				_this, match, mPackage, mType);
		if (result_pattern_LinkTypeToPackage_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkTypeToPackage_0_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkTypeToPackage_0_2_SolveCSP_black = pattern_LinkTypeToPackage_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkTypeToPackage_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mPackage, mType };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkTypeToPackage_0_3_CheckCSP_expressionFBB(LinkTypeToPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_0_4_collectelementstobetranslated_blackBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_LinkTypeToPackage_0_4_collectelementstobetranslated_greenBBBFF(Match match,
			org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType) {
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mType__mPackage____package_name_prime = "package";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		match.getToBeTranslatedEdges().add(mType__mPackage____package);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		match.getToBeTranslatedEdges().add(mPackage__mType____ownedElements);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		return new Object[] { match, mPackage, mType, mType__mPackage____package, mPackage__mType____ownedElements };
	}

	public static final Object[] pattern_LinkTypeToPackage_0_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType) {
		return new Object[] { match, mPackage, mType };
	}

	public static final Object[] pattern_LinkTypeToPackage_0_5_collectcontextelements_greenBBB(Match match,
			org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType) {
		match.getContextNodes().add(mPackage);
		match.getContextNodes().add(mType);
		return new Object[] { match, mPackage, mType };
	}

	public static final void pattern_LinkTypeToPackage_0_6_registerobjectstomatch_expressionBBBB(
			LinkTypeToPackage _this, Match match, org.eclipse.modisco.java.Package mPackage,
			AbstractTypeDeclaration mType) {
		_this.registerObjectsToMatch_FWD(match, mPackage, mType);

	}

	public static final boolean pattern_LinkTypeToPackage_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkTypeToPackage_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("uType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mType");
		EObject _localVariable_3 = isApplicableMatch.getObject("t2t");
		EObject _localVariable_4 = isApplicableMatch.getObject("p2p");
		EObject _localVariable_5 = isApplicableMatch.getObject("uPackage");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		EObject tmpT2t = _localVariable_3;
		EObject tmpP2p = _localVariable_4;
		EObject tmpUPackage = _localVariable_5;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpUType instanceof Classifier) {
				Classifier uType = (Classifier) tmpUType;
				if (tmpMType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
					if (tmpT2t instanceof ASTNode2Element) {
						ASTNode2Element t2t = (ASTNode2Element) tmpT2t;
						if (tmpP2p instanceof JavaPackage2UmlPackage) {
							JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) tmpP2p;
							if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
								org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
								return new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_1_1_performtransformation_blackBBBBBBFBB(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			ASTNode2Element t2t, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uPackage,
			LinkTypeToPackage _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			LinkTypeToPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkTypeToPackage_1_1_performtransformation_binding = pattern_LinkTypeToPackage_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkTypeToPackage_1_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_LinkTypeToPackage_1_1_performtransformation_binding[0];
			Classifier uType = (Classifier) result_pattern_LinkTypeToPackage_1_1_performtransformation_binding[1];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkTypeToPackage_1_1_performtransformation_binding[2];
			ASTNode2Element t2t = (ASTNode2Element) result_pattern_LinkTypeToPackage_1_1_performtransformation_binding[3];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result_pattern_LinkTypeToPackage_1_1_performtransformation_binding[4];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result_pattern_LinkTypeToPackage_1_1_performtransformation_binding[5];

			Object[] result_pattern_LinkTypeToPackage_1_1_performtransformation_black = pattern_LinkTypeToPackage_1_1_performtransformation_blackBBBBBBFBB(
					mPackage, uType, mType, t2t, p2p, uPackage, _this, isApplicableMatch);
			if (result_pattern_LinkTypeToPackage_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkTypeToPackage_1_1_performtransformation_black[6];

				return new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_1_1_performtransformation_greenBB(Classifier uType,
			org.eclipse.uml2.uml.Package uPackage) {
		uPackage.getPackagedElements().add(uType);
		return new Object[] { uType, uPackage };
	}

	public static final Object[] pattern_LinkTypeToPackage_1_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkTypeToPackage_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackage, EObject uType, EObject mType, EObject t2t, EObject p2p,
			EObject uPackage) {
		if (!mPackage.equals(uType)) {
			if (!mPackage.equals(mType)) {
				if (!mPackage.equals(t2t)) {
					if (!mPackage.equals(p2p)) {
						if (!mPackage.equals(uPackage)) {
							if (!mType.equals(uType)) {
								if (!mType.equals(t2t)) {
									if (!mType.equals(p2p)) {
										if (!mType.equals(uPackage)) {
											if (!t2t.equals(uType)) {
												if (!t2t.equals(uPackage)) {
													if (!p2p.equals(uType)) {
														if (!p2p.equals(t2t)) {
															if (!p2p.equals(uPackage)) {
																if (!uPackage.equals(uType)) {
																	return new Object[] { ruleresult, mPackage, uType,
																			mType, t2t, p2p, uPackage };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LinkTypeToPackage_1_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject mPackage, EObject uType, EObject mType, EObject uPackage) {
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__uType____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkTypeToPackage";
		String mType__mPackage____package_name_prime = "package";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String uPackage__uType____packagedElement_name_prime = "packagedElement";
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		ruleresult.getTranslatedEdges().add(mType__mPackage____package);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		ruleresult.getTranslatedEdges().add(mPackage__mType____ownedElements);
		uPackage__uType____packagedElement.setSrc(uPackage);
		uPackage__uType____packagedElement.setTrg(uType);
		ruleresult.getCreatedEdges().add(uPackage__uType____packagedElement);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		uPackage__uType____packagedElement.setName(uPackage__uType____packagedElement_name_prime);
		return new Object[] { ruleresult, mPackage, uType, mType, uPackage, mType__mPackage____package,
				mPackage__mType____ownedElements, uPackage__uType____packagedElement };
	}

	public static final void pattern_LinkTypeToPackage_1_5_registerobjects_expressionBBBBBBBB(LinkTypeToPackage _this,
			PerformRuleResult ruleresult, EObject mPackage, EObject uType, EObject mType, EObject t2t, EObject p2p,
			EObject uPackage) {
		_this.registerObjects_FWD(ruleresult, mPackage, uType, mType, t2t, p2p, uPackage);

	}

	public static final PerformRuleResult pattern_LinkTypeToPackage_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_2_1_preparereturnvalue_bindingFB(LinkTypeToPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_2_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkTypeToPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_2_1_preparereturnvalue_bindingAndBlackFFB(
			LinkTypeToPackage _this) {
		Object[] result_pattern_LinkTypeToPackage_2_1_preparereturnvalue_binding = pattern_LinkTypeToPackage_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkTypeToPackage_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkTypeToPackage_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkTypeToPackage_2_1_preparereturnvalue_black = pattern_LinkTypeToPackage_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkTypeToPackage_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkTypeToPackage_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LinkTypeToPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkTypeToPackage_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mPackage");
		EObject _localVariable_1 = match.getObject("mType");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpMType = _localVariable_1;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				return new Object[] { mPackage, mType, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkTypeToPackage_2_2_corematch_blackBFBFFFB(
			org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element t2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(mType,
				ASTNode2Element.class, "source")) {
			Element tmpUType = t2t.getTarget();
			if (tmpUType instanceof Classifier) {
				Classifier uType = (Classifier) tmpUType;
				for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(mPackage, JavaPackage2UmlPackage.class, "source")) {
					org.eclipse.uml2.uml.Package uPackage = p2p.getTarget();
					if (uPackage != null) {
						_result.add(new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkTypeToPackage_2_3_findcontext_blackBBBBBB(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			ASTNode2Element t2t, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mPackage.equals(mType.getPackage())) {
			if (mType.equals(t2t.getSource())) {
				if (mPackage.equals(p2p.getSource())) {
					if (uType.equals(t2t.getTarget())) {
						if (uPackage.equals(p2p.getTarget())) {
							_result.add(new Object[] { mPackage, uType, mType, t2t, p2p, uPackage });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_2_3_findcontext_greenBBBBBBFFFFFFF(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			ASTNode2Element t2t, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2t__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2t__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__uPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String mType__mPackage____package_name_prime = "package";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String t2t__mType____source_name_prime = "source";
		String p2p__mPackage____source_name_prime = "source";
		String t2t__uType____target_name_prime = "target";
		String p2p__uPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(t2t);
		isApplicableMatch.getAllContextElements().add(p2p);
		isApplicableMatch.getAllContextElements().add(uPackage);
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(mType__mPackage____package);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(mPackage__mType____ownedElements);
		t2t__mType____source.setSrc(t2t);
		t2t__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(t2t__mType____source);
		p2p__mPackage____source.setSrc(p2p);
		p2p__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(p2p__mPackage____source);
		t2t__uType____target.setSrc(t2t);
		t2t__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(t2t__uType____target);
		p2p__uPackage____target.setSrc(p2p);
		p2p__uPackage____target.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(p2p__uPackage____target);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		t2t__mType____source.setName(t2t__mType____source_name_prime);
		p2p__mPackage____source.setName(p2p__mPackage____source_name_prime);
		t2t__uType____target.setName(t2t__uType____target_name_prime);
		p2p__uPackage____target.setName(p2p__uPackage____target_name_prime);
		return new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, isApplicableMatch, mType__mPackage____package,
				mPackage__mType____ownedElements, t2t__mType____source, p2p__mPackage____source, t2t__uType____target,
				p2p__uPackage____target };
	}

	public static final Object[] pattern_LinkTypeToPackage_2_4_solveCSP_bindingFBBBBBBBB(LinkTypeToPackage _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage, Classifier uType,
			AbstractTypeDeclaration mType, ASTNode2Element t2t, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mPackage, uType, mType, t2t, p2p,
				uPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackage, uType, mType, t2t, p2p, uPackage };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkTypeToPackage_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			LinkTypeToPackage _this, IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage,
			Classifier uType, AbstractTypeDeclaration mType, ASTNode2Element t2t, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uPackage) {
		Object[] result_pattern_LinkTypeToPackage_2_4_solveCSP_binding = pattern_LinkTypeToPackage_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mPackage, uType, mType, t2t, p2p, uPackage);
		if (result_pattern_LinkTypeToPackage_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkTypeToPackage_2_4_solveCSP_binding[0];

			Object[] result_pattern_LinkTypeToPackage_2_4_solveCSP_black = pattern_LinkTypeToPackage_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkTypeToPackage_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackage, uType, mType, t2t, p2p, uPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkTypeToPackage_2_5_checkCSP_expressionFBB(LinkTypeToPackage _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkTypeToPackage_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkTypeToPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkTypeToPackage_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_10_1_initialbindings_blackBBBB(LinkTypeToPackage _this,
			Match match, Classifier uType, org.eclipse.uml2.uml.Package uPackage) {
		return new Object[] { _this, match, uType, uPackage };
	}

	public static final Object[] pattern_LinkTypeToPackage_10_2_SolveCSP_bindingFBBBB(LinkTypeToPackage _this,
			Match match, Classifier uType, org.eclipse.uml2.uml.Package uPackage) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, uType, uPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, uType, uPackage };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkTypeToPackage_10_2_SolveCSP_bindingAndBlackFBBBB(LinkTypeToPackage _this,
			Match match, Classifier uType, org.eclipse.uml2.uml.Package uPackage) {
		Object[] result_pattern_LinkTypeToPackage_10_2_SolveCSP_binding = pattern_LinkTypeToPackage_10_2_SolveCSP_bindingFBBBB(
				_this, match, uType, uPackage);
		if (result_pattern_LinkTypeToPackage_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkTypeToPackage_10_2_SolveCSP_binding[0];

			Object[] result_pattern_LinkTypeToPackage_10_2_SolveCSP_black = pattern_LinkTypeToPackage_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_LinkTypeToPackage_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, uType, uPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkTypeToPackage_10_3_CheckCSP_expressionFBB(LinkTypeToPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_10_4_collectelementstobetranslated_blackBBB(Match match,
			Classifier uType, org.eclipse.uml2.uml.Package uPackage) {
		return new Object[] { match, uType, uPackage };
	}

	public static final Object[] pattern_LinkTypeToPackage_10_4_collectelementstobetranslated_greenBBBF(Match match,
			Classifier uType, org.eclipse.uml2.uml.Package uPackage) {
		EMoflonEdge uPackage__uType____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uPackage__uType____packagedElement_name_prime = "packagedElement";
		uPackage__uType____packagedElement.setSrc(uPackage);
		uPackage__uType____packagedElement.setTrg(uType);
		match.getToBeTranslatedEdges().add(uPackage__uType____packagedElement);
		uPackage__uType____packagedElement.setName(uPackage__uType____packagedElement_name_prime);
		return new Object[] { match, uType, uPackage, uPackage__uType____packagedElement };
	}

	public static final Object[] pattern_LinkTypeToPackage_10_5_collectcontextelements_blackBBB(Match match,
			Classifier uType, org.eclipse.uml2.uml.Package uPackage) {
		return new Object[] { match, uType, uPackage };
	}

	public static final Object[] pattern_LinkTypeToPackage_10_5_collectcontextelements_greenBBB(Match match,
			Classifier uType, org.eclipse.uml2.uml.Package uPackage) {
		match.getContextNodes().add(uType);
		match.getContextNodes().add(uPackage);
		return new Object[] { match, uType, uPackage };
	}

	public static final void pattern_LinkTypeToPackage_10_6_registerobjectstomatch_expressionBBBB(
			LinkTypeToPackage _this, Match match, Classifier uType, org.eclipse.uml2.uml.Package uPackage) {
		_this.registerObjectsToMatch_BWD(match, uType, uPackage);

	}

	public static final boolean pattern_LinkTypeToPackage_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkTypeToPackage_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("uType");
		EObject _localVariable_2 = isApplicableMatch.getObject("mType");
		EObject _localVariable_3 = isApplicableMatch.getObject("t2t");
		EObject _localVariable_4 = isApplicableMatch.getObject("p2p");
		EObject _localVariable_5 = isApplicableMatch.getObject("uPackage");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		EObject tmpT2t = _localVariable_3;
		EObject tmpP2p = _localVariable_4;
		EObject tmpUPackage = _localVariable_5;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpUType instanceof Classifier) {
				Classifier uType = (Classifier) tmpUType;
				if (tmpMType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
					if (tmpT2t instanceof ASTNode2Element) {
						ASTNode2Element t2t = (ASTNode2Element) tmpT2t;
						if (tmpP2p instanceof JavaPackage2UmlPackage) {
							JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) tmpP2p;
							if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
								org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
								return new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_11_1_performtransformation_blackBBBBBBFBB(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			ASTNode2Element t2t, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uPackage,
			LinkTypeToPackage _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			LinkTypeToPackage _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_LinkTypeToPackage_11_1_performtransformation_binding = pattern_LinkTypeToPackage_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_LinkTypeToPackage_11_1_performtransformation_binding != null) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_LinkTypeToPackage_11_1_performtransformation_binding[0];
			Classifier uType = (Classifier) result_pattern_LinkTypeToPackage_11_1_performtransformation_binding[1];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkTypeToPackage_11_1_performtransformation_binding[2];
			ASTNode2Element t2t = (ASTNode2Element) result_pattern_LinkTypeToPackage_11_1_performtransformation_binding[3];
			JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) result_pattern_LinkTypeToPackage_11_1_performtransformation_binding[4];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result_pattern_LinkTypeToPackage_11_1_performtransformation_binding[5];

			Object[] result_pattern_LinkTypeToPackage_11_1_performtransformation_black = pattern_LinkTypeToPackage_11_1_performtransformation_blackBBBBBBFBB(
					mPackage, uType, mType, t2t, p2p, uPackage, _this, isApplicableMatch);
			if (result_pattern_LinkTypeToPackage_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_LinkTypeToPackage_11_1_performtransformation_black[6];

				return new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_11_1_performtransformation_greenBB(
			org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType) {
		mType.setPackage(mPackage);
		return new Object[] { mPackage, mType };
	}

	public static final Object[] pattern_LinkTypeToPackage_11_2_collecttranslatedelements_greenF() {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		return new Object[] { ruleresult };
	}

	public static final Object[] pattern_LinkTypeToPackage_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject mPackage, EObject uType, EObject mType, EObject t2t, EObject p2p,
			EObject uPackage) {
		if (!mPackage.equals(uType)) {
			if (!mPackage.equals(mType)) {
				if (!mPackage.equals(t2t)) {
					if (!mPackage.equals(p2p)) {
						if (!mPackage.equals(uPackage)) {
							if (!mType.equals(uType)) {
								if (!mType.equals(t2t)) {
									if (!mType.equals(p2p)) {
										if (!mType.equals(uPackage)) {
											if (!t2t.equals(uType)) {
												if (!t2t.equals(uPackage)) {
													if (!p2p.equals(uType)) {
														if (!p2p.equals(t2t)) {
															if (!p2p.equals(uPackage)) {
																if (!uPackage.equals(uType)) {
																	return new Object[] { ruleresult, mPackage, uType,
																			mType, t2t, p2p, uPackage };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_LinkTypeToPackage_11_3_bookkeepingforedges_greenBBBBBFFF(
			PerformRuleResult ruleresult, EObject mPackage, EObject uType, EObject mType, EObject uPackage) {
		EMoflonEdge mType__mPackage____package = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mPackage__mType____ownedElements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__uType____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "LinkTypeToPackage";
		String mType__mPackage____package_name_prime = "package";
		String mPackage__mType____ownedElements_name_prime = "ownedElements";
		String uPackage__uType____packagedElement_name_prime = "packagedElement";
		mType__mPackage____package.setSrc(mType);
		mType__mPackage____package.setTrg(mPackage);
		ruleresult.getCreatedEdges().add(mType__mPackage____package);
		mPackage__mType____ownedElements.setSrc(mPackage);
		mPackage__mType____ownedElements.setTrg(mType);
		ruleresult.getCreatedEdges().add(mPackage__mType____ownedElements);
		uPackage__uType____packagedElement.setSrc(uPackage);
		uPackage__uType____packagedElement.setTrg(uType);
		ruleresult.getTranslatedEdges().add(uPackage__uType____packagedElement);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		mType__mPackage____package.setName(mType__mPackage____package_name_prime);
		mPackage__mType____ownedElements.setName(mPackage__mType____ownedElements_name_prime);
		uPackage__uType____packagedElement.setName(uPackage__uType____packagedElement_name_prime);
		return new Object[] { ruleresult, mPackage, uType, mType, uPackage, mType__mPackage____package,
				mPackage__mType____ownedElements, uPackage__uType____packagedElement };
	}

	public static final void pattern_LinkTypeToPackage_11_5_registerobjects_expressionBBBBBBBB(LinkTypeToPackage _this,
			PerformRuleResult ruleresult, EObject mPackage, EObject uType, EObject mType, EObject t2t, EObject p2p,
			EObject uPackage) {
		_this.registerObjects_BWD(ruleresult, mPackage, uType, mType, t2t, p2p, uPackage);

	}

	public static final PerformRuleResult pattern_LinkTypeToPackage_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_12_1_preparereturnvalue_bindingFB(LinkTypeToPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_12_1_preparereturnvalue_blackFBB(EClass eClass,
			LinkTypeToPackage _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_12_1_preparereturnvalue_bindingAndBlackFFB(
			LinkTypeToPackage _this) {
		Object[] result_pattern_LinkTypeToPackage_12_1_preparereturnvalue_binding = pattern_LinkTypeToPackage_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkTypeToPackage_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_LinkTypeToPackage_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkTypeToPackage_12_1_preparereturnvalue_black = pattern_LinkTypeToPackage_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_LinkTypeToPackage_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_LinkTypeToPackage_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "LinkTypeToPackage";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_LinkTypeToPackage_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("uType");
		EObject _localVariable_1 = match.getObject("uPackage");
		EObject tmpUType = _localVariable_0;
		EObject tmpUPackage = _localVariable_1;
		if (tmpUType instanceof Classifier) {
			Classifier uType = (Classifier) tmpUType;
			if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
				org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
				return new Object[] { uType, uPackage, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkTypeToPackage_12_2_corematch_blackFBFFFBB(Classifier uType,
			org.eclipse.uml2.uml.Package uPackage, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (ASTNode2Element t2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(uType,
				ASTNode2Element.class, "target")) {
			ASTNode tmpMType = t2t.getSource();
			if (tmpMType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
				for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(uPackage, JavaPackage2UmlPackage.class, "target")) {
					org.eclipse.modisco.java.Package mPackage = p2p.getSource();
					if (mPackage != null) {
						_result.add(new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkTypeToPackage_12_3_findcontext_blackBBBBBB(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			ASTNode2Element t2t, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uPackage) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (mType.equals(t2t.getSource())) {
			if (mPackage.equals(p2p.getSource())) {
				if (uType.equals(t2t.getTarget())) {
					if (uPackage.getPackagedElements().contains(uType)) {
						if (uPackage.equals(p2p.getTarget())) {
							_result.add(new Object[] { mPackage, uType, mType, t2t, p2p, uPackage });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_12_3_findcontext_greenBBBBBBFFFFFF(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			ASTNode2Element t2t, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uPackage) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge t2t__mType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__mPackage____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2t__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uPackage__uType____packagedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__uPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String t2t__mType____source_name_prime = "source";
		String p2p__mPackage____source_name_prime = "source";
		String t2t__uType____target_name_prime = "target";
		String uPackage__uType____packagedElement_name_prime = "packagedElement";
		String p2p__uPackage____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mPackage);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(mType);
		isApplicableMatch.getAllContextElements().add(t2t);
		isApplicableMatch.getAllContextElements().add(p2p);
		isApplicableMatch.getAllContextElements().add(uPackage);
		t2t__mType____source.setSrc(t2t);
		t2t__mType____source.setTrg(mType);
		isApplicableMatch.getAllContextElements().add(t2t__mType____source);
		p2p__mPackage____source.setSrc(p2p);
		p2p__mPackage____source.setTrg(mPackage);
		isApplicableMatch.getAllContextElements().add(p2p__mPackage____source);
		t2t__uType____target.setSrc(t2t);
		t2t__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(t2t__uType____target);
		uPackage__uType____packagedElement.setSrc(uPackage);
		uPackage__uType____packagedElement.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(uPackage__uType____packagedElement);
		p2p__uPackage____target.setSrc(p2p);
		p2p__uPackage____target.setTrg(uPackage);
		isApplicableMatch.getAllContextElements().add(p2p__uPackage____target);
		t2t__mType____source.setName(t2t__mType____source_name_prime);
		p2p__mPackage____source.setName(p2p__mPackage____source_name_prime);
		t2t__uType____target.setName(t2t__uType____target_name_prime);
		uPackage__uType____packagedElement.setName(uPackage__uType____packagedElement_name_prime);
		p2p__uPackage____target.setName(p2p__uPackage____target_name_prime);
		return new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, isApplicableMatch, t2t__mType____source,
				p2p__mPackage____source, t2t__uType____target, uPackage__uType____packagedElement,
				p2p__uPackage____target };
	}

	public static final Object[] pattern_LinkTypeToPackage_12_4_solveCSP_bindingFBBBBBBBB(LinkTypeToPackage _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage, Classifier uType,
			AbstractTypeDeclaration mType, ASTNode2Element t2t, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uPackage) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, mPackage, uType, mType, t2t, p2p,
				uPackage);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackage, uType, mType, t2t, p2p, uPackage };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkTypeToPackage_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			LinkTypeToPackage _this, IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage,
			Classifier uType, AbstractTypeDeclaration mType, ASTNode2Element t2t, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uPackage) {
		Object[] result_pattern_LinkTypeToPackage_12_4_solveCSP_binding = pattern_LinkTypeToPackage_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mPackage, uType, mType, t2t, p2p, uPackage);
		if (result_pattern_LinkTypeToPackage_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkTypeToPackage_12_4_solveCSP_binding[0];

			Object[] result_pattern_LinkTypeToPackage_12_4_solveCSP_black = pattern_LinkTypeToPackage_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_LinkTypeToPackage_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackage, uType, mType, t2t, p2p, uPackage };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkTypeToPackage_12_5_checkCSP_expressionFBB(LinkTypeToPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_LinkTypeToPackage_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "LinkTypeToPackage";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkTypeToPackage_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_20_1_preparereturnvalue_bindingFB(LinkTypeToPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkTypeToPackage _this) {
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

	public static final Object[] pattern_LinkTypeToPackage_20_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkTypeToPackage _this) {
		Object[] result_pattern_LinkTypeToPackage_20_1_preparereturnvalue_binding = pattern_LinkTypeToPackage_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkTypeToPackage_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkTypeToPackage_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkTypeToPackage_20_1_preparereturnvalue_black = pattern_LinkTypeToPackage_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkTypeToPackage_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkTypeToPackage_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkTypeToPackage_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkTypeToPackage_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_packagedElement) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUPackage = _edge_packagedElement.getSrc();
		if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
			EObject tmpUType = _edge_packagedElement.getTrg();
			if (tmpUType instanceof Classifier) {
				Classifier uType = (Classifier) tmpUType;
				if (uPackage.getPackagedElements().contains(uType)) {
					_result.add(new Object[] { uType, uPackage, _edge_packagedElement });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkTypeToPackage_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			LinkTypeToPackage _this, Match match, Classifier uType, org.eclipse.uml2.uml.Package uPackage) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, uType, uPackage);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkTypeToPackage_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkTypeToPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkTypeToPackage_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_21_1_preparereturnvalue_bindingFB(LinkTypeToPackage _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			LinkTypeToPackage _this) {
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

	public static final Object[] pattern_LinkTypeToPackage_21_1_preparereturnvalue_bindingAndBlackFFBF(
			LinkTypeToPackage _this) {
		Object[] result_pattern_LinkTypeToPackage_21_1_preparereturnvalue_binding = pattern_LinkTypeToPackage_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_LinkTypeToPackage_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_LinkTypeToPackage_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_LinkTypeToPackage_21_1_preparereturnvalue_black = pattern_LinkTypeToPackage_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_LinkTypeToPackage_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_LinkTypeToPackage_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_LinkTypeToPackage_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_LinkTypeToPackage_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_package) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMType = _edge_package.getSrc();
		if (tmpMType instanceof AbstractTypeDeclaration) {
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
			EObject tmpMPackage = _edge_package.getTrg();
			if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
				org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
				if (mPackage.equals(mType.getPackage())) {
					_result.add(new Object[] { mPackage, mType, _edge_package });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_LinkTypeToPackage_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			LinkTypeToPackage _this, Match match, org.eclipse.modisco.java.Package mPackage,
			AbstractTypeDeclaration mType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mPackage, mType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_LinkTypeToPackage_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			LinkTypeToPackage _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_LinkTypeToPackage_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_24_1_prepare_blackB(LinkTypeToPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkTypeToPackage_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mPackage");
		EObject _localVariable_1 = targetMatch.getObject("uType");
		EObject _localVariable_2 = sourceMatch.getObject("mType");
		EObject _localVariable_3 = targetMatch.getObject("uPackage");
		EObject tmpMPackage = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpMType = _localVariable_2;
		EObject tmpUPackage = _localVariable_3;
		if (tmpMPackage instanceof org.eclipse.modisco.java.Package) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) tmpMPackage;
			if (tmpUType instanceof Classifier) {
				Classifier uType = (Classifier) tmpUType;
				if (tmpMType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
					if (tmpUPackage instanceof org.eclipse.uml2.uml.Package) {
						org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) tmpUPackage;
						return new Object[] { mPackage, uType, mType, uPackage, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_blackBBBBBB(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			org.eclipse.uml2.uml.Package uPackage, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { mPackage, uType, mType, uPackage, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_binding = pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.modisco.java.Package mPackage = (org.eclipse.modisco.java.Package) result_pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_binding[0];
			Classifier uType = (Classifier) result_pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_binding[1];
			AbstractTypeDeclaration mType = (AbstractTypeDeclaration) result_pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Package uPackage = (org.eclipse.uml2.uml.Package) result_pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_black = pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_blackBBBBBB(
					mPackage, uType, mType, uPackage, sourceMatch, targetMatch);
			if (result_pattern_LinkTypeToPackage_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mPackage, uType, mType, uPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_24_3_solvecsp_bindingFBBBBBBB(LinkTypeToPackage _this,
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			org.eclipse.uml2.uml.Package uPackage, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(mPackage, uType, mType, uPackage, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, mPackage, uType, mType, uPackage, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkTypeToPackage_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			LinkTypeToPackage _this, org.eclipse.modisco.java.Package mPackage, Classifier uType,
			AbstractTypeDeclaration mType, org.eclipse.uml2.uml.Package uPackage, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_LinkTypeToPackage_24_3_solvecsp_binding = pattern_LinkTypeToPackage_24_3_solvecsp_bindingFBBBBBBB(
				_this, mPackage, uType, mType, uPackage, sourceMatch, targetMatch);
		if (result_pattern_LinkTypeToPackage_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_LinkTypeToPackage_24_3_solvecsp_binding[0];

			Object[] result_pattern_LinkTypeToPackage_24_3_solvecsp_black = pattern_LinkTypeToPackage_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_LinkTypeToPackage_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mPackage, uType, mType, uPackage, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkTypeToPackage_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_LinkTypeToPackage_24_5_matchcorrcontext_blackBBBFFBBB(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			org.eclipse.uml2.uml.Package uPackage, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element t2t : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(mType,
					ASTNode2Element.class, "source")) {
				if (uType.equals(t2t.getTarget())) {
					for (JavaPackage2UmlPackage p2p : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(mPackage, JavaPackage2UmlPackage.class, "source")) {
						if (uPackage.equals(p2p.getTarget())) {
							_result.add(new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, sourceMatch,
									targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_24_5_matchcorrcontext_greenBBBBF(ASTNode2Element t2t,
			JavaPackage2UmlPackage p2p, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "LinkTypeToPackage";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(t2t);
		ccMatch.getAllContextElements().add(p2p);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { t2t, p2p, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_LinkTypeToPackage_24_6_createcorrespondence_blackBBBBB(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			org.eclipse.uml2.uml.Package uPackage, CCMatch ccMatch) {
		return new Object[] { mPackage, uType, mType, uPackage, ccMatch };
	}

	public static final Object[] pattern_LinkTypeToPackage_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_LinkTypeToPackage_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "LinkTypeToPackage";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_LinkTypeToPackage_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_27_1_matchtggpattern_blackBB(
			org.eclipse.modisco.java.Package mPackage, AbstractTypeDeclaration mType) {
		if (mPackage.equals(mType.getPackage())) {
			return new Object[] { mPackage, mType };
		}
		return null;
	}

	public static final boolean pattern_LinkTypeToPackage_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkTypeToPackage_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_28_1_matchtggpattern_blackBB(Classifier uType,
			org.eclipse.uml2.uml.Package uPackage) {
		if (uPackage.getPackagedElements().contains(uType)) {
			return new Object[] { uType, uPackage };
		}
		return null;
	}

	public static final boolean pattern_LinkTypeToPackage_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_LinkTypeToPackage_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_29_1_createresult_blackB(LinkTypeToPackage _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_LinkTypeToPackage_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.modisco.java.Package mPackage) {
		if (ruleResult.getSourceObjects().contains(mPackage)) {
			return new Object[] { ruleResult, mPackage };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, JavaPackage2UmlPackage p2p) {
		if (ruleResult.getCorrObjects().contains(p2p)) {
			return new Object[] { ruleResult, p2p };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Package uPackage) {
		if (ruleResult.getTargetObjects().contains(uPackage)) {
			return new Object[] { ruleResult, uPackage };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, Classifier uType) {
		if (ruleResult.getTargetObjects().contains(uType)) {
			return new Object[] { ruleResult, uType };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element t2t) {
		if (ruleResult.getCorrObjects().contains(t2t)) {
			return new Object[] { ruleResult, t2t };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration mType) {
		if (ruleResult.getSourceObjects().contains(mType)) {
			return new Object[] { ruleResult, mType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_LinkTypeToPackage_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList p2pList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList t2tList : ruleEntryContainer.getRuleEntryList()) {
				if (!p2pList.equals(t2tList)) {
					for (EObject tmpP2p : p2pList.getEntryObjects()) {
						if (tmpP2p instanceof JavaPackage2UmlPackage) {
							JavaPackage2UmlPackage p2p = (JavaPackage2UmlPackage) tmpP2p;
							org.eclipse.modisco.java.Package mPackage = p2p.getSource();
							if (mPackage != null) {
								org.eclipse.uml2.uml.Package uPackage = p2p.getTarget();
								if (uPackage != null) {
									if (pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_1BB(ruleResult,
											p2p) == null) {
										if (pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_0BB(ruleResult,
												mPackage) == null) {
											if (pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, uPackage) == null) {
												for (EObject tmpT2t : t2tList.getEntryObjects()) {
													if (tmpT2t instanceof ASTNode2Element) {
														ASTNode2Element t2t = (ASTNode2Element) tmpT2t;
														Element tmpUType = t2t.getTarget();
														if (tmpUType instanceof Classifier) {
															Classifier uType = (Classifier) tmpUType;
															ASTNode tmpMType = t2t.getSource();
															if (tmpMType instanceof AbstractTypeDeclaration) {
																AbstractTypeDeclaration mType = (AbstractTypeDeclaration) tmpMType;
																if (pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_4BB(
																		ruleResult, t2t) == null) {
																	if (pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_3BB(
																			ruleResult, uType) == null) {
																		if (pattern_LinkTypeToPackage_29_2_isapplicablecore_black_nac_5BB(
																				ruleResult, mType) == null) {
																			_result.add(new Object[] { p2pList,
																					mPackage, p2p, uPackage, t2tList,
																					uType, t2t, mType,
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

	public static final Object[] pattern_LinkTypeToPackage_29_3_solveCSP_bindingFBBBBBBBBB(LinkTypeToPackage _this,
			IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage, Classifier uType,
			AbstractTypeDeclaration mType, ASTNode2Element t2t, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uPackage, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, mPackage, uType, mType, t2t, p2p,
				uPackage, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mPackage, uType, mType, t2t, p2p, uPackage,
					ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_LinkTypeToPackage_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_LinkTypeToPackage_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			LinkTypeToPackage _this, IsApplicableMatch isApplicableMatch, org.eclipse.modisco.java.Package mPackage,
			Classifier uType, AbstractTypeDeclaration mType, ASTNode2Element t2t, JavaPackage2UmlPackage p2p,
			org.eclipse.uml2.uml.Package uPackage, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_LinkTypeToPackage_29_3_solveCSP_binding = pattern_LinkTypeToPackage_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, mPackage, uType, mType, t2t, p2p, uPackage, ruleResult);
		if (result_pattern_LinkTypeToPackage_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_LinkTypeToPackage_29_3_solveCSP_binding[0];

			Object[] result_pattern_LinkTypeToPackage_29_3_solveCSP_black = pattern_LinkTypeToPackage_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_LinkTypeToPackage_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mPackage, uType, mType, t2t, p2p, uPackage,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_LinkTypeToPackage_29_4_checkCSP_expressionFBB(LinkTypeToPackage _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_LinkTypeToPackage_29_5_checknacs_blackBBBBBB(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			ASTNode2Element t2t, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uPackage) {
		return new Object[] { mPackage, uType, mType, t2t, p2p, uPackage };
	}

	public static final Object[] pattern_LinkTypeToPackage_29_6_perform_blackBBBBBBB(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			ASTNode2Element t2t, JavaPackage2UmlPackage p2p, org.eclipse.uml2.uml.Package uPackage,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { mPackage, uType, mType, t2t, p2p, uPackage, ruleResult };
	}

	public static final Object[] pattern_LinkTypeToPackage_29_6_perform_greenBBBBB(
			org.eclipse.modisco.java.Package mPackage, Classifier uType, AbstractTypeDeclaration mType,
			org.eclipse.uml2.uml.Package uPackage, ModelgeneratorRuleResult ruleResult) {
		mType.setPackage(mPackage);
		uPackage.getPackagedElements().add(uType);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { mPackage, uType, mType, uPackage, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_LinkTypeToPackage_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //LinkTypeToPackageImpl
