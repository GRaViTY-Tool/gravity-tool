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
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.EnumConstantDeclaration;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.modisco.MClassInstanceCreation;
import org.gravity.modisco.MDefinition;
import org.gravity.modisco.ModiscoFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.AnonymousClass4Anonymous;
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
 * An implementation of the model object '<em><b>Anonymous Class4 Anonymous</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnonymousClass4AnonymousImpl extends AbstractRuleImpl implements AnonymousClass4Anonymous {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClass4AnonymousImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnonymousClass4Anonymous();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon,
			MDefinition mMember, AnonymousClassDeclaration jContainer) {

		Object[] result1_black = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_0_1_initialbindings_blackBBBBBB(this, match, mConstructor, mAnon,
						mMember, jContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mConstructor] = " + mConstructor + ", " + "[mAnon] = " + mAnon
					+ ", " + "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mConstructor, mAnon,
						mMember, jContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mConstructor] = " + mConstructor + ", " + "[mAnon] = " + mAnon
					+ ", " + "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_0_4_collectelementstobetranslated_blackBBBBB(match, mConstructor,
							mAnon, mMember, jContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mConstructor] = " + mConstructor + ", " + "[mAnon] = " + mAnon + ", " + "[mMember] = "
						+ mMember + ", " + "[jContainer] = " + jContainer + ".");
			}
			AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							mConstructor, mAnon, mMember);
			//nothing EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge mAnon__mConstructor____classInstanceCreation = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge mMember__mConstructor____mMethodInvocations = (EMoflonEdge) result4_green[6];

			Object[] result5_black = AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_0_5_collectcontextelements_blackBBBBB(match, mConstructor, mAnon,
							mMember, jContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mConstructor] = " + mConstructor + ", " + "[mAnon] = " + mAnon + ", " + "[mMember] = "
						+ mMember + ", " + "[jContainer] = " + jContainer + ".");
			}
			AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_0_5_collectcontextelements_greenBBBFF(match,
					mMember, jContainer);
			//nothing EMoflonEdge jContainer__mMember____bodyDeclarations = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge mMember__jContainer____anonymousClassDeclarationOwner = (EMoflonEdge) result5_green[4];

			// 
			AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_0_6_registerobjectstomatch_expressionBBBBBB(
					this, match, mConstructor, mAnon, mMember, jContainer);
			return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_0_7_expressionF();
		} else {
			return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		MClassInstanceCreation mConstructor = (MClassInstanceCreation) result1_bindingAndBlack[0];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result1_bindingAndBlack[1];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[2];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[3];
		AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result1_bindingAndBlack[4];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_1_1_performtransformation_greenFFBB(mAnon, uContainer);
		ASTNode2Element a2a = (ASTNode2Element) result1_green[0];
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_green[1];

		Object[] result2_black = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_1_2_collecttranslatedelements_blackBBBB(a2a, mConstructor, feature,
						mAnon);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a2a] = " + a2a + ", " + "[mConstructor] = "
							+ mConstructor + ", " + "[feature] = " + feature + ", " + "[mAnon] = " + mAnon + ".");
		}
		Object[] result2_green = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_1_2_collecttranslatedelements_greenFBBBB(a2a, mConstructor, feature,
						mAnon);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_1_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, a2a, mConstructor,
						feature, mAnon, uContainer, mMember, jContainer, ne2ne);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[a2a] = "
							+ a2a + ", " + "[mConstructor] = " + mConstructor + ", " + "[feature] = " + feature + ", "
							+ "[mAnon] = " + mAnon + ", " + "[uContainer] = " + uContainer + ", " + "[mMember] = "
							+ mMember + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ".");
		}
		AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, a2a, mConstructor, feature, mAnon, uContainer, mMember);
		//nothing EMoflonEdge a2a__feature____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mAnon__mConstructor____classInstanceCreation = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mMember__mConstructor____mMethodInvocations = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge a2a__mAnon____source = (EMoflonEdge) result3_green[12];

		// 
		// 
		AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_1_5_registerobjects_expressionBBBBBBBBBB(this,
				ruleresult, a2a, mConstructor, feature, mAnon, uContainer, mMember, jContainer, ne2ne);
		return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		MClassInstanceCreation mConstructor = (MClassInstanceCreation) result2_binding[0];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_binding[1];
		MDefinition mMember = (MDefinition) result2_binding[2];
		AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result2_binding[3];
		for (Object[] result2_black : AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_2_2_corematch_blackBBFBBFB(mConstructor, mAnon, mMember, jContainer,
						match)) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[2];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[5];
			// ForEach 
			for (Object[] result3_black : AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_2_3_findcontext_blackBBBBBB(mConstructor, mAnon, uContainer,
							mMember, jContainer, ne2ne)) {
				Object[] result3_green = AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_2_3_findcontext_greenBBBBBBFFFFFFFF(mConstructor, mAnon,
								uContainer, mMember, jContainer, ne2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge mAnon__mConstructor____classInstanceCreation = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge mMember__mConstructor____mMethodInvocations = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge jContainer__mMember____bodyDeclarations = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge mMember__jContainer____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[13];

				Object[] result4_bindingAndBlack = AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this, isApplicableMatch,
								mConstructor, mAnon, uContainer, mMember, jContainer, ne2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mConstructor] = " + mConstructor
							+ ", " + "[mAnon] = " + mAnon + ", " + "[uContainer] = " + uContainer + ", "
							+ "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = "
							+ ne2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = AnonymousClass4AnonymousImpl
							.pattern_AnonymousClass4Anonymous_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, MDefinition mMember, AnonymousClassDeclaration jContainer) {
		match.registerObject("mConstructor", mConstructor);
		match.registerObject("mAnon", mAnon);
		match.registerObject("mMember", mMember);
		match.registerObject("jContainer", jContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, MDefinition mMember, AnonymousClassDeclaration jContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uContainer, MDefinition mMember,
			AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mConstructor", mConstructor);
		isApplicableMatch.registerObject("mAnon", mAnon);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a2a, EObject mConstructor, EObject feature,
			EObject mAnon, EObject uContainer, EObject mMember, EObject jContainer, EObject ne2ne) {
		ruleresult.registerObject("a2a", a2a);
		ruleresult.registerObject("mConstructor", mConstructor);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("mAnon", mAnon);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("ne2ne", ne2ne);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mConstructor").eClass())
						.equals("modisco.MClassInstanceCreation.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAnon").eClass())
						.equals("java.AnonymousClassDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer) {

		Object[] result1_black = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_10_1_initialbindings_blackBBBB(this, match, feature, uContainer);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, feature, uContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_10_4_collectelementstobetranslated_blackBBB(match, feature,
							uContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
			}
			AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_10_4_collectelementstobetranslated_greenBBBF(
					match, feature, uContainer);
			//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_10_5_collectcontextelements_blackBBB(match, feature, uContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[feature] = " + feature + ", " + "[uContainer] = " + uContainer + ".");
			}
			AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_10_5_collectcontextelements_greenBB(match,
					uContainer);

			// 
			AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_10_6_registerobjectstomatch_expressionBBBB(
					this, match, feature, uContainer);
			return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_10_7_expressionF();
		} else {
			return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_11_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[1];
		MDefinition mMember = (MDefinition) result1_bindingAndBlack[2];
		AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result1_bindingAndBlack[3];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_11_1_performtransformation_greenFFBFB(feature, mMember);
		ASTNode2Element a2a = (ASTNode2Element) result1_green[0];
		MClassInstanceCreation mConstructor = (MClassInstanceCreation) result1_green[1];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result1_green[3];

		Object[] result2_black = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_11_2_collecttranslatedelements_blackBBBB(a2a, mConstructor, feature,
						mAnon);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[a2a] = " + a2a + ", " + "[mConstructor] = "
							+ mConstructor + ", " + "[feature] = " + feature + ", " + "[mAnon] = " + mAnon + ".");
		}
		Object[] result2_green = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_11_2_collecttranslatedelements_greenFBBBB(a2a, mConstructor, feature,
						mAnon);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_11_3_bookkeepingforedges_blackBBBBBBBBB(ruleresult, a2a, mConstructor,
						feature, mAnon, uContainer, mMember, jContainer, ne2ne);
		if (result3_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult + ", " + "[a2a] = "
							+ a2a + ", " + "[mConstructor] = " + mConstructor + ", " + "[feature] = " + feature + ", "
							+ "[mAnon] = " + mAnon + ", " + "[uContainer] = " + uContainer + ", " + "[mMember] = "
							+ mMember + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ".");
		}
		AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
				ruleresult, a2a, mConstructor, feature, mAnon, uContainer, mMember);
		//nothing EMoflonEdge a2a__feature____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge mAnon__mConstructor____classInstanceCreation = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge mMember__mConstructor____mMethodInvocations = (EMoflonEdge) result3_green[10];
		//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[11];
		//nothing EMoflonEdge a2a__mAnon____source = (EMoflonEdge) result3_green[12];

		// 
		// 
		AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_11_5_registerobjects_expressionBBBBBBBBBB(this,
				ruleresult, a2a, mConstructor, feature, mAnon, uContainer, mMember, jContainer, ne2ne);
		return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_binding[0];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_binding[1];
		for (Object[] result2_black : AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_12_2_corematch_blackBBFFB(feature, uContainer, match)) {
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result2_black[2];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[3];
			// ForEach 
			for (Object[] result3_black : AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_12_3_findcontext_blackBBFBB(feature, uContainer, jContainer,
							ne2ne)) {
				MDefinition mMember = (MDefinition) result3_black[2];
				Object[] result3_green = AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_12_3_findcontext_greenBBBBBFFFFFF(feature, uContainer,
								mMember, jContainer, ne2ne);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jContainer__mMember____bodyDeclarations = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge mMember__jContainer____anonymousClassDeclarationOwner = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge uContainer__feature____nestedClassifier = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_12_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								feature, uContainer, mMember, jContainer, ne2ne);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[uContainer] = " + uContainer + ", " + "[mMember] = " + mMember + ", "
							+ "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = AnonymousClass4AnonymousImpl
							.pattern_AnonymousClass4Anonymous_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer) {
		match.registerObject("feature", feature);
		match.registerObject("uContainer", uContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer, MDefinition mMember, AnonymousClassDeclaration jContainer,
			ASTNode2Element ne2ne) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a2a, EObject mConstructor, EObject feature,
			EObject mAnon, EObject uContainer, EObject mMember, EObject jContainer, EObject ne2ne) {
		ruleresult.registerObject("a2a", a2a);
		ruleresult.registerObject("mConstructor", mConstructor);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("mAnon", mAnon);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("ne2ne", ne2ne);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_132(EMoflonEdge _edge_nestedClassifier) {

		Object[] result1_bindingAndBlack = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_20_2_testcorematchandDECs_blackFFB(_edge_nestedClassifier)) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_black[0];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[1];
			Object[] result2_green = AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, feature, uContainer)) {
				// 
				if (AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClass4AnonymousImpl
							.pattern_AnonymousClass4Anonymous_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_140(EMoflonEdge _edge_anonymousClassDeclaration) {

		Object[] result1_bindingAndBlack = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_21_2_testcorematchandDECs_blackFFFFB(
						_edge_anonymousClassDeclaration)) {
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) result2_black[0];
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_black[1];
			MDefinition mMember = (MDefinition) result2_black[2];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result2_black[3];
			Object[] result2_green = AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, mConstructor, mAnon, mMember, jContainer)) {
				// 
				if (AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClass4AnonymousImpl
							.pattern_AnonymousClass4Anonymous_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnonymousClass4Anonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("feature", "name", "Anonymous", ComparingOperator.EQUAL)) {
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
		ruleResult.setRule("AnonymousClass4Anonymous");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("feature", "name", "Anonymous", ComparingOperator.EQUAL)) {
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

		Object[] result1_black = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		MClassInstanceCreation mConstructor = (MClassInstanceCreation) result2_bindingAndBlack[0];
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[1];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[3];
		MDefinition mMember = (MDefinition) result2_bindingAndBlack[4];
		AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, mConstructor, feature,
						mAnon, uContainer, mMember, jContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[mConstructor] = " + mConstructor + ", " + "[feature] = " + feature + ", " + "[mAnon] = " + mAnon
					+ ", " + "[uContainer] = " + uContainer + ", " + "[mMember] = " + mMember + ", " + "[jContainer] = "
					+ jContainer + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch
					+ ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_24_5_matchcorrcontext_blackBBFBB(uContainer, jContainer,
							sourceMatch, targetMatch)) {
				ASTNode2Element ne2ne = (ASTNode2Element) result5_black[2];
				Object[] result5_green = AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_24_5_matchcorrcontext_greenBBBF(ne2ne, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_24_6_createcorrespondence_blackBBBBBBB(mConstructor, feature,
								mAnon, uContainer, mMember, jContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[mConstructor] = "
							+ mConstructor + ", " + "[feature] = " + feature + ", " + "[mAnon] = " + mAnon + ", "
							+ "[uContainer] = " + uContainer + ", " + "[mMember] = " + mMember + ", "
							+ "[jContainer] = " + jContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_24_6_createcorrespondence_greenFBBB(feature, mAnon, ccMatch);
				//nothing ASTNode2Element a2a = (ASTNode2Element) result6_green[0];

				Object[] result7_black = AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class feature,
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uContainer, MDefinition mMember,
			AnonymousClassDeclaration jContainer, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon,
			MDefinition mMember, AnonymousClassDeclaration jContainer) {// 
		Object[] result1_black = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_27_1_matchtggpattern_blackBBBB(mConstructor, mAnon, mMember,
						jContainer);
		if (result1_black != null) {
			return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_27_2_expressionF();
		} else {
			return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer) {// 
		Object[] result1_black = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_28_1_matchtggpattern_blackBB(feature, uContainer);
		if (result1_black != null) {
			AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_28_1_matchtggpattern_greenB(feature);

			return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_28_2_expressionF();
		} else {
			return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNode2Element ne2neParameter) {

		Object[] result1_black = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnonymousClass4AnonymousImpl
				.pattern_AnonymousClass4Anonymous_29_2_isapplicablecore_blackFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList ne2neList = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result2_black[1];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[2];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result2_black[3];
			MDefinition mMember = (MDefinition) result2_black[4];

			Object[] result3_bindingAndBlack = AnonymousClass4AnonymousImpl
					.pattern_AnonymousClass4Anonymous_29_3_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
							uContainer, mMember, jContainer, ne2ne, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uContainer] = " + uContainer + ", "
						+ "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnonymousClass4AnonymousImpl
						.pattern_AnonymousClass4Anonymous_29_5_checknacs_blackBBBB(uContainer, mMember, jContainer,
								ne2ne);
				if (result5_black != null) {

					Object[] result6_black = AnonymousClass4AnonymousImpl
							.pattern_AnonymousClass4Anonymous_29_6_perform_blackBBBBB(uContainer, mMember, jContainer,
									ne2ne, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uContainer] = "
								+ uContainer + ", " + "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer
								+ ", " + "[ne2ne] = " + ne2ne + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_29_6_perform_greenFFFFBBB(uContainer,
							mMember, ruleResult);
					//nothing ASTNode2Element a2a = (ASTNode2Element) result6_green[0];
					//nothing MClassInstanceCreation mConstructor = (MClassInstanceCreation) result6_green[1];
					//nothing org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result6_green[2];
					//nothing AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return AnonymousClass4AnonymousImpl.pattern_AnonymousClass4Anonymous_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class uContainer,
			MDefinition mMember, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
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
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPROPRIATE_FWD__MATCH_MCLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_MDEFINITION_ANONYMOUSCLASSDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (MClassInstanceCreation) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (MDefinition) arguments.get(3),
					(AnonymousClassDeclaration) arguments.get(4));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_MCLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_MDEFINITION_ANONYMOUSCLASSDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (MClassInstanceCreation) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (MDefinition) arguments.get(3),
					(AnonymousClassDeclaration) arguments.get(4));
			return null;
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_MCLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_MDEFINITION_ANONYMOUSCLASSDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (MClassInstanceCreation) arguments.get(1),
					(AnonymousClassDeclaration) arguments.get(2), (MDefinition) arguments.get(3),
					(AnonymousClassDeclaration) arguments.get(4));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_MCLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_CLASS_MDEFINITION_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(MClassInstanceCreation) arguments.get(1), (AnonymousClassDeclaration) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (MDefinition) arguments.get(4),
					(AnonymousClassDeclaration) arguments.get(5), (ASTNode2Element) arguments.get(6));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPROPRIATE_BWD__MATCH_CLASS_CLASS:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASS_CLASS:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
			return null;
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASS_CLASS:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_CLASS_MDEFINITION_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (org.eclipse.uml2.uml.Class) arguments.get(2),
					(MDefinition) arguments.get(3), (AnonymousClassDeclaration) arguments.get(4),
					(ASTNode2Element) arguments.get(5));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPROPRIATE_BWD_EMOFLON_EDGE_132__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_132((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_140__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_140((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPLICABLE_SOLVE_CSP_CC__MCLASSINSTANCECREATION_CLASS_ANONYMOUSCLASSDECLARATION_CLASS_MDEFINITION_ANONYMOUSCLASSDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((MClassInstanceCreation) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (AnonymousClassDeclaration) arguments.get(2),
					(org.eclipse.uml2.uml.Class) arguments.get(3), (MDefinition) arguments.get(4),
					(AnonymousClassDeclaration) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___CHECK_DEC_FWD__MCLASSINSTANCECREATION_ANONYMOUSCLASSDECLARATION_MDEFINITION_ANONYMOUSCLASSDECLARATION:
			return checkDEC_FWD((MClassInstanceCreation) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(MDefinition) arguments.get(2), (AnonymousClassDeclaration) arguments.get(3));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___CHECK_DEC_BWD__CLASS_CLASS:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_MDEFINITION_ANONYMOUSCLASSDECLARATION_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (MDefinition) arguments.get(2),
					(AnonymousClassDeclaration) arguments.get(3), (ASTNode2Element) arguments.get(4),
					(ModelgeneratorRuleResult) arguments.get(5));
		case RulesPackage.ANONYMOUS_CLASS4_ANONYMOUS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_0_1_initialbindings_blackBBBBBB(
			AnonymousClass4Anonymous _this, Match match, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, MDefinition mMember, AnonymousClassDeclaration jContainer) {
		if (!jContainer.equals(mAnon)) {
			return new Object[] { _this, match, mConstructor, mAnon, mMember, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_0_2_SolveCSP_bindingFBBBBBB(
			AnonymousClass4Anonymous _this, Match match, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, MDefinition mMember, AnonymousClassDeclaration jContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mConstructor, mAnon, mMember, jContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mConstructor, mAnon, mMember, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnonymousClass4Anonymous _this, Match match, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, MDefinition mMember, AnonymousClassDeclaration jContainer) {
		Object[] result_pattern_AnonymousClass4Anonymous_0_2_SolveCSP_binding = pattern_AnonymousClass4Anonymous_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mConstructor, mAnon, mMember, jContainer);
		if (result_pattern_AnonymousClass4Anonymous_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4Anonymous_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClass4Anonymous_0_2_SolveCSP_black = pattern_AnonymousClass4Anonymous_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass4Anonymous_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mConstructor, mAnon, mMember, jContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_0_3_CheckCSP_expressionFBB(
			AnonymousClass4Anonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember,
			AnonymousClassDeclaration jContainer) {
		if (!jContainer.equals(mAnon)) {
			return new Object[] { match, mConstructor, mAnon, mMember, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember) {
		EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__mConstructor____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mConstructor____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mConstructor);
		match.getToBeTranslatedNodes().add(mAnon);
		String mConstructor__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnon__mConstructor____classInstanceCreation_name_prime = "classInstanceCreation";
		String mMember__mConstructor____mMethodInvocations_name_prime = "mMethodInvocations";
		mConstructor__mAnon____anonymousClassDeclaration.setSrc(mConstructor);
		mConstructor__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		match.getToBeTranslatedEdges().add(mConstructor__mAnon____anonymousClassDeclaration);
		mAnon__mConstructor____classInstanceCreation.setSrc(mAnon);
		mAnon__mConstructor____classInstanceCreation.setTrg(mConstructor);
		match.getToBeTranslatedEdges().add(mAnon__mConstructor____classInstanceCreation);
		mMember__mConstructor____mMethodInvocations.setSrc(mMember);
		mMember__mConstructor____mMethodInvocations.setTrg(mConstructor);
		match.getToBeTranslatedEdges().add(mMember__mConstructor____mMethodInvocations);
		mConstructor__mAnon____anonymousClassDeclaration
				.setName(mConstructor__mAnon____anonymousClassDeclaration_name_prime);
		mAnon__mConstructor____classInstanceCreation.setName(mAnon__mConstructor____classInstanceCreation_name_prime);
		mMember__mConstructor____mMethodInvocations.setName(mMember__mConstructor____mMethodInvocations_name_prime);
		return new Object[] { match, mConstructor, mAnon, mMember, mConstructor__mAnon____anonymousClassDeclaration,
				mAnon__mConstructor____classInstanceCreation, mMember__mConstructor____mMethodInvocations };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_0_5_collectcontextelements_blackBBBBB(Match match,
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember,
			AnonymousClassDeclaration jContainer) {
		if (!jContainer.equals(mAnon)) {
			return new Object[] { match, mConstructor, mAnon, mMember, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_0_5_collectcontextelements_greenBBBFF(Match match,
			MDefinition mMember, AnonymousClassDeclaration jContainer) {
		EMoflonEdge jContainer__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__jContainer____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getContextNodes().add(mMember);
		match.getContextNodes().add(jContainer);
		String jContainer__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__jContainer____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		jContainer__mMember____bodyDeclarations.setSrc(jContainer);
		jContainer__mMember____bodyDeclarations.setTrg(mMember);
		match.getContextEdges().add(jContainer__mMember____bodyDeclarations);
		mMember__jContainer____anonymousClassDeclarationOwner.setSrc(mMember);
		mMember__jContainer____anonymousClassDeclarationOwner.setTrg(jContainer);
		match.getContextEdges().add(mMember__jContainer____anonymousClassDeclarationOwner);
		jContainer__mMember____bodyDeclarations.setName(jContainer__mMember____bodyDeclarations_name_prime);
		mMember__jContainer____anonymousClassDeclarationOwner
				.setName(mMember__jContainer____anonymousClassDeclarationOwner_name_prime);
		return new Object[] { match, mMember, jContainer, jContainer__mMember____bodyDeclarations,
				mMember__jContainer____anonymousClassDeclarationOwner };
	}

	public static final void pattern_AnonymousClass4Anonymous_0_6_registerobjectstomatch_expressionBBBBBB(
			AnonymousClass4Anonymous _this, Match match, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, MDefinition mMember, AnonymousClassDeclaration jContainer) {
		_this.registerObjectsToMatch_FWD(match, mConstructor, mAnon, mMember, jContainer);

	}

	public static final boolean pattern_AnonymousClass4Anonymous_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mConstructor");
		EObject _localVariable_1 = isApplicableMatch.getObject("mAnon");
		EObject _localVariable_2 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_4 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_5 = isApplicableMatch.getObject("ne2ne");
		EObject tmpMConstructor = _localVariable_0;
		EObject tmpMAnon = _localVariable_1;
		EObject tmpUContainer = _localVariable_2;
		EObject tmpMMember = _localVariable_3;
		EObject tmpJContainer = _localVariable_4;
		EObject tmpNe2ne = _localVariable_5;
		if (tmpMConstructor instanceof MClassInstanceCreation) {
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) tmpMConstructor;
			if (tmpMAnon instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
				if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
					if (tmpMMember instanceof MDefinition) {
						MDefinition mMember = (MDefinition) tmpMMember;
						if (tmpJContainer instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
							if (tmpNe2ne instanceof ASTNode2Element) {
								ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
								return new Object[] { mConstructor, mAnon, uContainer, mMember, jContainer, ne2ne,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_1_1_performtransformation_blackBBBBBBFBB(
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uContainer,
			MDefinition mMember, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			AnonymousClass4Anonymous _this, IsApplicableMatch isApplicableMatch) {
		if (!jContainer.equals(mAnon)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { mConstructor, mAnon, uContainer, mMember, jContainer, ne2ne, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			AnonymousClass4Anonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_binding = pattern_AnonymousClass4Anonymous_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_binding != null) {
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_binding[0];
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_binding[1];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_binding[2];
			MDefinition mMember = (MDefinition) result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_binding[3];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_binding[4];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_binding[5];

			Object[] result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_black = pattern_AnonymousClass4Anonymous_1_1_performtransformation_blackBBBBBBFBB(
					mConstructor, mAnon, uContainer, mMember, jContainer, ne2ne, _this, isApplicableMatch);
			if (result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClass4Anonymous_1_1_performtransformation_black[6];

				return new Object[] { mConstructor, mAnon, uContainer, mMember, jContainer, ne2ne, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_1_1_performtransformation_greenFFBB(
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uContainer) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		String feature_name_prime = "Anonymous";
		a2a.setSource(mAnon);
		a2a.setTarget(feature);
		uContainer.getNestedClassifiers().add(feature);
		feature.setName(feature_name_prime);
		return new Object[] { a2a, feature, mAnon, uContainer };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_1_2_collecttranslatedelements_blackBBBB(
			ASTNode2Element a2a, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class feature,
			AnonymousClassDeclaration mAnon) {
		return new Object[] { a2a, mConstructor, feature, mAnon };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_1_2_collecttranslatedelements_greenFBBBB(
			ASTNode2Element a2a, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class feature,
			AnonymousClassDeclaration mAnon) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2a);
		ruleresult.getTranslatedElements().add(mConstructor);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getTranslatedElements().add(mAnon);
		return new Object[] { ruleresult, a2a, mConstructor, feature, mAnon };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2a, EObject mConstructor, EObject feature, EObject mAnon,
			EObject uContainer, EObject mMember, EObject jContainer, EObject ne2ne) {
		if (!a2a.equals(mConstructor)) {
			if (!a2a.equals(feature)) {
				if (!a2a.equals(mAnon)) {
					if (!a2a.equals(uContainer)) {
						if (!a2a.equals(mMember)) {
							if (!a2a.equals(jContainer)) {
								if (!a2a.equals(ne2ne)) {
									if (!mConstructor.equals(uContainer)) {
										if (!mConstructor.equals(mMember)) {
											if (!mConstructor.equals(ne2ne)) {
												if (!feature.equals(mConstructor)) {
													if (!feature.equals(mAnon)) {
														if (!feature.equals(uContainer)) {
															if (!feature.equals(mMember)) {
																if (!feature.equals(jContainer)) {
																	if (!feature.equals(ne2ne)) {
																		if (!mAnon.equals(mConstructor)) {
																			if (!mAnon.equals(uContainer)) {
																				if (!mAnon.equals(mMember)) {
																					if (!mAnon.equals(ne2ne)) {
																						if (!mMember
																								.equals(uContainer)) {
																							if (!mMember
																									.equals(ne2ne)) {
																								if (!jContainer.equals(
																										mConstructor)) {
																									if (!jContainer
																											.equals(mAnon)) {
																										if (!jContainer
																												.equals(uContainer)) {
																											if (!jContainer
																													.equals(mMember)) {
																												if (!jContainer
																														.equals(ne2ne)) {
																													if (!ne2ne
																															.equals(uContainer)) {
																														return new Object[] {
																																ruleresult,
																																a2a,
																																mConstructor,
																																feature,
																																mAnon,
																																uContainer,
																																mMember,
																																jContainer,
																																ne2ne };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnonymousClass4Anonymous_1_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject a2a, EObject mConstructor, EObject feature, EObject mAnon,
			EObject uContainer, EObject mMember) {
		EMoflonEdge a2a__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__mConstructor____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mConstructor____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2a__mAnon____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClass4Anonymous";
		String a2a__feature____target_name_prime = "target";
		String mConstructor__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnon__mConstructor____classInstanceCreation_name_prime = "classInstanceCreation";
		String mMember__mConstructor____mMethodInvocations_name_prime = "mMethodInvocations";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String a2a__mAnon____source_name_prime = "source";
		a2a__feature____target.setSrc(a2a);
		a2a__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(a2a__feature____target);
		mConstructor__mAnon____anonymousClassDeclaration.setSrc(mConstructor);
		mConstructor__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		ruleresult.getTranslatedEdges().add(mConstructor__mAnon____anonymousClassDeclaration);
		mAnon__mConstructor____classInstanceCreation.setSrc(mAnon);
		mAnon__mConstructor____classInstanceCreation.setTrg(mConstructor);
		ruleresult.getTranslatedEdges().add(mAnon__mConstructor____classInstanceCreation);
		mMember__mConstructor____mMethodInvocations.setSrc(mMember);
		mMember__mConstructor____mMethodInvocations.setTrg(mConstructor);
		ruleresult.getTranslatedEdges().add(mMember__mConstructor____mMethodInvocations);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getCreatedEdges().add(uContainer__feature____nestedClassifier);
		a2a__mAnon____source.setSrc(a2a);
		a2a__mAnon____source.setTrg(mAnon);
		ruleresult.getCreatedEdges().add(a2a__mAnon____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2a__feature____target.setName(a2a__feature____target_name_prime);
		mConstructor__mAnon____anonymousClassDeclaration
				.setName(mConstructor__mAnon____anonymousClassDeclaration_name_prime);
		mAnon__mConstructor____classInstanceCreation.setName(mAnon__mConstructor____classInstanceCreation_name_prime);
		mMember__mConstructor____mMethodInvocations.setName(mMember__mConstructor____mMethodInvocations_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		a2a__mAnon____source.setName(a2a__mAnon____source_name_prime);
		return new Object[] { ruleresult, a2a, mConstructor, feature, mAnon, uContainer, mMember,
				a2a__feature____target, mConstructor__mAnon____anonymousClassDeclaration,
				mAnon__mConstructor____classInstanceCreation, mMember__mConstructor____mMethodInvocations,
				uContainer__feature____nestedClassifier, a2a__mAnon____source };
	}

	public static final void pattern_AnonymousClass4Anonymous_1_5_registerobjects_expressionBBBBBBBBBB(
			AnonymousClass4Anonymous _this, PerformRuleResult ruleresult, EObject a2a, EObject mConstructor,
			EObject feature, EObject mAnon, EObject uContainer, EObject mMember, EObject jContainer, EObject ne2ne) {
		_this.registerObjects_FWD(ruleresult, a2a, mConstructor, feature, mAnon, uContainer, mMember, jContainer,
				ne2ne);

	}

	public static final PerformRuleResult pattern_AnonymousClass4Anonymous_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_bindingFB(
			AnonymousClass4Anonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClass4Anonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClass4Anonymous _this) {
		Object[] result_pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_binding = pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_black = pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClass4Anonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mConstructor");
		EObject _localVariable_1 = match.getObject("mAnon");
		EObject _localVariable_2 = match.getObject("mMember");
		EObject _localVariable_3 = match.getObject("jContainer");
		EObject tmpMConstructor = _localVariable_0;
		EObject tmpMAnon = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		EObject tmpJContainer = _localVariable_3;
		if (tmpMConstructor instanceof MClassInstanceCreation) {
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) tmpMConstructor;
			if (tmpMAnon instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
				if (tmpMMember instanceof MDefinition) {
					MDefinition mMember = (MDefinition) tmpMMember;
					if (tmpJContainer instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
						return new Object[] { mConstructor, mAnon, mMember, jContainer, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4Anonymous_2_2_corematch_blackBBFBBFB(
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember,
			AnonymousClassDeclaration jContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jContainer.equals(mAnon)) {
			for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jContainer,
					ASTNode2Element.class, "source")) {
				Element tmpUContainer = ne2ne.getTarget();
				if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
					_result.add(new Object[] { mConstructor, mAnon, uContainer, mMember, jContainer, ne2ne, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4Anonymous_2_3_findcontext_blackBBBBBB(
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uContainer,
			MDefinition mMember, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jContainer.equals(mAnon)) {
			if (jContainer.equals(ne2ne.getSource())) {
				if (mAnon.equals(mConstructor.getAnonymousClassDeclaration())) {
					if (mMember.getMMethodInvocations().contains(mConstructor)) {
						if (jContainer.getBodyDeclarations().contains(mMember)) {
							if (uContainer.equals(ne2ne.getTarget())) {
								_result.add(
										new Object[] { mConstructor, mAnon, uContainer, mMember, jContainer, ne2ne });
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_3_findcontext_greenBBBBBBFFFFFFFF(
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uContainer,
			MDefinition mMember, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__mConstructor____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mConstructor____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__jContainer____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2ne__jContainer____source_name_prime = "source";
		String mConstructor__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnon__mConstructor____classInstanceCreation_name_prime = "classInstanceCreation";
		String mMember__mConstructor____mMethodInvocations_name_prime = "mMethodInvocations";
		String jContainer__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__jContainer____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String ne2ne__uContainer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(mConstructor);
		isApplicableMatch.getAllContextElements().add(mAnon);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		mConstructor__mAnon____anonymousClassDeclaration.setSrc(mConstructor);
		mConstructor__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		isApplicableMatch.getAllContextElements().add(mConstructor__mAnon____anonymousClassDeclaration);
		mAnon__mConstructor____classInstanceCreation.setSrc(mAnon);
		mAnon__mConstructor____classInstanceCreation.setTrg(mConstructor);
		isApplicableMatch.getAllContextElements().add(mAnon__mConstructor____classInstanceCreation);
		mMember__mConstructor____mMethodInvocations.setSrc(mMember);
		mMember__mConstructor____mMethodInvocations.setTrg(mConstructor);
		isApplicableMatch.getAllContextElements().add(mMember__mConstructor____mMethodInvocations);
		jContainer__mMember____bodyDeclarations.setSrc(jContainer);
		jContainer__mMember____bodyDeclarations.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(jContainer__mMember____bodyDeclarations);
		mMember__jContainer____anonymousClassDeclarationOwner.setSrc(mMember);
		mMember__jContainer____anonymousClassDeclarationOwner.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(mMember__jContainer____anonymousClassDeclarationOwner);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		mConstructor__mAnon____anonymousClassDeclaration
				.setName(mConstructor__mAnon____anonymousClassDeclaration_name_prime);
		mAnon__mConstructor____classInstanceCreation.setName(mAnon__mConstructor____classInstanceCreation_name_prime);
		mMember__mConstructor____mMethodInvocations.setName(mMember__mConstructor____mMethodInvocations_name_prime);
		jContainer__mMember____bodyDeclarations.setName(jContainer__mMember____bodyDeclarations_name_prime);
		mMember__jContainer____anonymousClassDeclarationOwner
				.setName(mMember__jContainer____anonymousClassDeclarationOwner_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		return new Object[] { mConstructor, mAnon, uContainer, mMember, jContainer, ne2ne, isApplicableMatch,
				ne2ne__jContainer____source, mConstructor__mAnon____anonymousClassDeclaration,
				mAnon__mConstructor____classInstanceCreation, mMember__mConstructor____mMethodInvocations,
				jContainer__mMember____bodyDeclarations, mMember__jContainer____anonymousClassDeclarationOwner,
				ne2ne__uContainer____target };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_4_solveCSP_bindingFBBBBBBBB(
			AnonymousClass4Anonymous _this, IsApplicableMatch isApplicableMatch, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uContainer, MDefinition mMember,
			AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mConstructor, mAnon, uContainer,
				mMember, jContainer, ne2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mConstructor, mAnon, uContainer, mMember, jContainer,
					ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			AnonymousClass4Anonymous _this, IsApplicableMatch isApplicableMatch, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uContainer, MDefinition mMember,
			AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne) {
		Object[] result_pattern_AnonymousClass4Anonymous_2_4_solveCSP_binding = pattern_AnonymousClass4Anonymous_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, mConstructor, mAnon, uContainer, mMember, jContainer, ne2ne);
		if (result_pattern_AnonymousClass4Anonymous_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4Anonymous_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass4Anonymous_2_4_solveCSP_black = pattern_AnonymousClass4Anonymous_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass4Anonymous_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mConstructor, mAnon, uContainer, mMember,
						jContainer, ne2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_2_5_checkCSP_expressionFBB(
			AnonymousClass4Anonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClass4Anonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass4Anonymous_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_10_1_initialbindings_blackBBBB(
			AnonymousClass4Anonymous _this, Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { _this, match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_10_2_SolveCSP_bindingFBBBB(
			AnonymousClass4Anonymous _this, Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_10_2_SolveCSP_bindingAndBlackFBBBB(
			AnonymousClass4Anonymous _this, Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer) {
		Object[] result_pattern_AnonymousClass4Anonymous_10_2_SolveCSP_binding = pattern_AnonymousClass4Anonymous_10_2_SolveCSP_bindingFBBBB(
				_this, match, feature, uContainer);
		if (result_pattern_AnonymousClass4Anonymous_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4Anonymous_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClass4Anonymous_10_2_SolveCSP_black = pattern_AnonymousClass4Anonymous_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass4Anonymous_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_10_3_CheckCSP_expressionFBB(
			AnonymousClass4Anonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_10_4_collectelementstobetranslated_blackBBB(
			Match match, org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer) {
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		match.getToBeTranslatedEdges().add(uContainer__feature____nestedClassifier);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		return new Object[] { match, feature, uContainer, uContainer__feature____nestedClassifier };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_10_5_collectcontextelements_blackBBB(Match match,
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			return new Object[] { match, feature, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Class uContainer) {
		match.getContextNodes().add(uContainer);
		return new Object[] { match, uContainer };
	}

	public static final void pattern_AnonymousClass4Anonymous_10_6_registerobjectstomatch_expressionBBBB(
			AnonymousClass4Anonymous _this, Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer) {
		_this.registerObjectsToMatch_BWD(match, feature, uContainer);

	}

	public static final boolean pattern_AnonymousClass4Anonymous_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_11_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_2 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_3 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_4 = isApplicableMatch.getObject("ne2ne");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		EObject tmpJContainer = _localVariable_3;
		EObject tmpNe2ne = _localVariable_4;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
				if (tmpMMember instanceof MDefinition) {
					MDefinition mMember = (MDefinition) tmpMMember;
					if (tmpJContainer instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
						if (tmpNe2ne instanceof ASTNode2Element) {
							ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
							return new Object[] { feature, uContainer, mMember, jContainer, ne2ne, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_11_1_performtransformation_blackBBBBBFBB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, MDefinition mMember,
			AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne, AnonymousClass4Anonymous _this,
			IsApplicableMatch isApplicableMatch) {
		if (!feature.equals(uContainer)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { feature, uContainer, mMember, jContainer, ne2ne, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_11_1_performtransformation_bindingAndBlackFFFFFFBB(
			AnonymousClass4Anonymous _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClass4Anonymous_11_1_performtransformation_binding = pattern_AnonymousClass4Anonymous_11_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClass4Anonymous_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass4Anonymous_11_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass4Anonymous_11_1_performtransformation_binding[1];
			MDefinition mMember = (MDefinition) result_pattern_AnonymousClass4Anonymous_11_1_performtransformation_binding[2];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result_pattern_AnonymousClass4Anonymous_11_1_performtransformation_binding[3];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_AnonymousClass4Anonymous_11_1_performtransformation_binding[4];

			Object[] result_pattern_AnonymousClass4Anonymous_11_1_performtransformation_black = pattern_AnonymousClass4Anonymous_11_1_performtransformation_blackBBBBBFBB(
					feature, uContainer, mMember, jContainer, ne2ne, _this, isApplicableMatch);
			if (result_pattern_AnonymousClass4Anonymous_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClass4Anonymous_11_1_performtransformation_black[5];

				return new Object[] { feature, uContainer, mMember, jContainer, ne2ne, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_11_1_performtransformation_greenFFBFB(
			org.eclipse.uml2.uml.Class feature, MDefinition mMember) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		MClassInstanceCreation mConstructor = ModiscoFactory.eINSTANCE.createMClassInstanceCreation();
		AnonymousClassDeclaration mAnon = JavaFactory.eINSTANCE.createAnonymousClassDeclaration();
		a2a.setTarget(feature);
		mMember.getMMethodInvocations().add(mConstructor);
		mConstructor.setAnonymousClassDeclaration(mAnon);
		a2a.setSource(mAnon);
		return new Object[] { a2a, mConstructor, feature, mAnon, mMember };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_11_2_collecttranslatedelements_blackBBBB(
			ASTNode2Element a2a, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class feature,
			AnonymousClassDeclaration mAnon) {
		return new Object[] { a2a, mConstructor, feature, mAnon };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_11_2_collecttranslatedelements_greenFBBBB(
			ASTNode2Element a2a, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class feature,
			AnonymousClassDeclaration mAnon) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2a);
		ruleresult.getCreatedElements().add(mConstructor);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedElements().add(mAnon);
		return new Object[] { ruleresult, a2a, mConstructor, feature, mAnon };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_11_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2a, EObject mConstructor, EObject feature, EObject mAnon,
			EObject uContainer, EObject mMember, EObject jContainer, EObject ne2ne) {
		if (!a2a.equals(mConstructor)) {
			if (!a2a.equals(feature)) {
				if (!a2a.equals(mAnon)) {
					if (!a2a.equals(uContainer)) {
						if (!a2a.equals(mMember)) {
							if (!a2a.equals(jContainer)) {
								if (!a2a.equals(ne2ne)) {
									if (!mConstructor.equals(uContainer)) {
										if (!mConstructor.equals(mMember)) {
											if (!mConstructor.equals(ne2ne)) {
												if (!feature.equals(mConstructor)) {
													if (!feature.equals(mAnon)) {
														if (!feature.equals(uContainer)) {
															if (!feature.equals(mMember)) {
																if (!feature.equals(jContainer)) {
																	if (!feature.equals(ne2ne)) {
																		if (!mAnon.equals(mConstructor)) {
																			if (!mAnon.equals(uContainer)) {
																				if (!mAnon.equals(mMember)) {
																					if (!mAnon.equals(ne2ne)) {
																						if (!mMember
																								.equals(uContainer)) {
																							if (!mMember
																									.equals(ne2ne)) {
																								if (!jContainer.equals(
																										mConstructor)) {
																									if (!jContainer
																											.equals(mAnon)) {
																										if (!jContainer
																												.equals(uContainer)) {
																											if (!jContainer
																													.equals(mMember)) {
																												if (!jContainer
																														.equals(ne2ne)) {
																													if (!ne2ne
																															.equals(uContainer)) {
																														return new Object[] {
																																ruleresult,
																																a2a,
																																mConstructor,
																																feature,
																																mAnon,
																																uContainer,
																																mMember,
																																jContainer,
																																ne2ne };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnonymousClass4Anonymous_11_3_bookkeepingforedges_greenBBBBBBBFFFFFF(
			PerformRuleResult ruleresult, EObject a2a, EObject mConstructor, EObject feature, EObject mAnon,
			EObject uContainer, EObject mMember) {
		EMoflonEdge a2a__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mConstructor__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mAnon__mConstructor____classInstanceCreation = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mConstructor____mMethodInvocations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2a__mAnon____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClass4Anonymous";
		String a2a__feature____target_name_prime = "target";
		String mConstructor__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String mAnon__mConstructor____classInstanceCreation_name_prime = "classInstanceCreation";
		String mMember__mConstructor____mMethodInvocations_name_prime = "mMethodInvocations";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String a2a__mAnon____source_name_prime = "source";
		a2a__feature____target.setSrc(a2a);
		a2a__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(a2a__feature____target);
		mConstructor__mAnon____anonymousClassDeclaration.setSrc(mConstructor);
		mConstructor__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		ruleresult.getCreatedEdges().add(mConstructor__mAnon____anonymousClassDeclaration);
		mAnon__mConstructor____classInstanceCreation.setSrc(mAnon);
		mAnon__mConstructor____classInstanceCreation.setTrg(mConstructor);
		ruleresult.getCreatedEdges().add(mAnon__mConstructor____classInstanceCreation);
		mMember__mConstructor____mMethodInvocations.setSrc(mMember);
		mMember__mConstructor____mMethodInvocations.setTrg(mConstructor);
		ruleresult.getCreatedEdges().add(mMember__mConstructor____mMethodInvocations);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uContainer__feature____nestedClassifier);
		a2a__mAnon____source.setSrc(a2a);
		a2a__mAnon____source.setTrg(mAnon);
		ruleresult.getCreatedEdges().add(a2a__mAnon____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		a2a__feature____target.setName(a2a__feature____target_name_prime);
		mConstructor__mAnon____anonymousClassDeclaration
				.setName(mConstructor__mAnon____anonymousClassDeclaration_name_prime);
		mAnon__mConstructor____classInstanceCreation.setName(mAnon__mConstructor____classInstanceCreation_name_prime);
		mMember__mConstructor____mMethodInvocations.setName(mMember__mConstructor____mMethodInvocations_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		a2a__mAnon____source.setName(a2a__mAnon____source_name_prime);
		return new Object[] { ruleresult, a2a, mConstructor, feature, mAnon, uContainer, mMember,
				a2a__feature____target, mConstructor__mAnon____anonymousClassDeclaration,
				mAnon__mConstructor____classInstanceCreation, mMember__mConstructor____mMethodInvocations,
				uContainer__feature____nestedClassifier, a2a__mAnon____source };
	}

	public static final void pattern_AnonymousClass4Anonymous_11_5_registerobjects_expressionBBBBBBBBBB(
			AnonymousClass4Anonymous _this, PerformRuleResult ruleresult, EObject a2a, EObject mConstructor,
			EObject feature, EObject mAnon, EObject uContainer, EObject mMember, EObject jContainer, EObject ne2ne) {
		_this.registerObjects_BWD(ruleresult, a2a, mConstructor, feature, mAnon, uContainer, mMember, jContainer,
				ne2ne);

	}

	public static final PerformRuleResult pattern_AnonymousClass4Anonymous_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_bindingFB(
			AnonymousClass4Anonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClass4Anonymous _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClass4Anonymous _this) {
		Object[] result_pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_binding = pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_black = pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClass4Anonymous";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uContainer");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUContainer = _localVariable_1;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
				return new Object[] { feature, uContainer, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4Anonymous_12_2_corematch_blackBBFFB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			String feature_name = feature.getName();
			if (feature_name.equals("Anonymous")) {
				for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
						.getOppositeReferenceTyped(uContainer, ASTNode2Element.class, "target")) {
					ASTNode tmpJContainer = ne2ne.getSource();
					if (tmpJContainer instanceof AnonymousClassDeclaration) {
						AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
						_result.add(new Object[] { feature, uContainer, jContainer, ne2ne, match });
					}

				}
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4Anonymous_12_3_findcontext_blackBBFBB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer,
			AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uContainer)) {
			if (jContainer.equals(ne2ne.getSource())) {
				if (uContainer.getNestedClassifiers().contains(feature)) {
					if (uContainer.equals(ne2ne.getTarget())) {
						String feature_name = feature.getName();
						if (feature_name.equals("Anonymous")) {
							for (BodyDeclaration tmpMMember : jContainer.getBodyDeclarations()) {
								if (tmpMMember instanceof MDefinition) {
									MDefinition mMember = (MDefinition) tmpMMember;
									_result.add(new Object[] { feature, uContainer, mMember, jContainer, ne2ne });
								}
							}
						}

					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_3_findcontext_greenBBBBBFFFFFF(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer, MDefinition mMember,
			AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__mMember____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__jContainer____anonymousClassDeclarationOwner = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge uContainer__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ne2ne__jContainer____source_name_prime = "source";
		String jContainer__mMember____bodyDeclarations_name_prime = "bodyDeclarations";
		String mMember__jContainer____anonymousClassDeclarationOwner_name_prime = "anonymousClassDeclarationOwner";
		String uContainer__feature____nestedClassifier_name_prime = "nestedClassifier";
		String ne2ne__uContainer____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		jContainer__mMember____bodyDeclarations.setSrc(jContainer);
		jContainer__mMember____bodyDeclarations.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(jContainer__mMember____bodyDeclarations);
		mMember__jContainer____anonymousClassDeclarationOwner.setSrc(mMember);
		mMember__jContainer____anonymousClassDeclarationOwner.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(mMember__jContainer____anonymousClassDeclarationOwner);
		uContainer__feature____nestedClassifier.setSrc(uContainer);
		uContainer__feature____nestedClassifier.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uContainer__feature____nestedClassifier);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		jContainer__mMember____bodyDeclarations.setName(jContainer__mMember____bodyDeclarations_name_prime);
		mMember__jContainer____anonymousClassDeclarationOwner
				.setName(mMember__jContainer____anonymousClassDeclarationOwner_name_prime);
		uContainer__feature____nestedClassifier.setName(uContainer__feature____nestedClassifier_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		return new Object[] { feature, uContainer, mMember, jContainer, ne2ne, isApplicableMatch,
				ne2ne__jContainer____source, jContainer__mMember____bodyDeclarations,
				mMember__jContainer____anonymousClassDeclarationOwner, uContainer__feature____nestedClassifier,
				ne2ne__uContainer____target };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_4_solveCSP_bindingFBBBBBBB(
			AnonymousClass4Anonymous _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer, MDefinition mMember, AnonymousClassDeclaration jContainer,
			ASTNode2Element ne2ne) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, uContainer, mMember,
				jContainer, ne2ne);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, uContainer, mMember, jContainer, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_4_solveCSP_bindingAndBlackFBBBBBBB(
			AnonymousClass4Anonymous _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer, MDefinition mMember, AnonymousClassDeclaration jContainer,
			ASTNode2Element ne2ne) {
		Object[] result_pattern_AnonymousClass4Anonymous_12_4_solveCSP_binding = pattern_AnonymousClass4Anonymous_12_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, feature, uContainer, mMember, jContainer, ne2ne);
		if (result_pattern_AnonymousClass4Anonymous_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4Anonymous_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass4Anonymous_12_4_solveCSP_black = pattern_AnonymousClass4Anonymous_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass4Anonymous_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, uContainer, mMember, jContainer, ne2ne };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_12_5_checkCSP_expressionFBB(
			AnonymousClass4Anonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClass4Anonymous";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass4Anonymous_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_bindingFB(
			AnonymousClass4Anonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClass4Anonymous _this) {
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

	public static final Object[] pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClass4Anonymous _this) {
		Object[] result_pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_binding = pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_black = pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4Anonymous_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_nestedClassifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUContainer = _edge_nestedClassifier.getSrc();
		if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
			EObject tmpFeature = _edge_nestedClassifier.getTrg();
			if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
				if (!feature.equals(uContainer)) {
					if (uContainer.getNestedClassifiers().contains(feature)) {
						String feature_name = feature.getName();
						if (feature_name.equals("Anonymous")) {
							_result.add(new Object[] { feature, uContainer, _edge_nestedClassifier });
						}

					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClass4Anonymous_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			AnonymousClass4Anonymous _this, Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uContainer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClass4Anonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClass4Anonymous_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_bindingFB(
			AnonymousClass4Anonymous _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			AnonymousClass4Anonymous _this) {
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

	public static final Object[] pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClass4Anonymous _this) {
		Object[] result_pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_binding = pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_black = pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_21_2_testcorematchandDECs_black_nac_0B(
			MClassInstanceCreation mConstructor) {
		for (AnnotationMemberValuePair __DEC_mConstructor_value_573769 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mConstructor, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mConstructor };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_21_2_testcorematchandDECs_black_nac_1BB(
			MClassInstanceCreation mConstructor, MDefinition mMember) {
		for (MDefinition __DEC_mConstructor_mMethodInvocations_720561 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mConstructor, MDefinition.class, "mMethodInvocations")) {
			if (!mMember.equals(__DEC_mConstructor_mMethodInvocations_720561)) {
				return new Object[] { mConstructor, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_21_2_testcorematchandDECs_black_nac_2B(
			AnonymousClassDeclaration mAnon) {
		for (EnumConstantDeclaration __DEC_mAnon_anonymousClassDeclaration_89886 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnon, EnumConstantDeclaration.class, "anonymousClassDeclaration")) {
			return new Object[] { mAnon };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4Anonymous_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_anonymousClassDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMConstructor = _edge_anonymousClassDeclaration.getSrc();
		if (tmpMConstructor instanceof MClassInstanceCreation) {
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) tmpMConstructor;
			EObject tmpMAnon = _edge_anonymousClassDeclaration.getTrg();
			if (tmpMAnon instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
				if (mAnon.equals(mConstructor.getAnonymousClassDeclaration())) {
					if (pattern_AnonymousClass4Anonymous_21_2_testcorematchandDECs_black_nac_0B(mConstructor) == null) {
						if (pattern_AnonymousClass4Anonymous_21_2_testcorematchandDECs_black_nac_2B(mAnon) == null) {
							for (MDefinition mMember : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(mConstructor, MDefinition.class, "mMethodInvocations")) {
								AnonymousClassDeclaration jContainer = mMember.getAnonymousClassDeclarationOwner();
								if (jContainer != null) {
									if (!jContainer.equals(mAnon)) {
										if (pattern_AnonymousClass4Anonymous_21_2_testcorematchandDECs_black_nac_1BB(
												mConstructor, mMember) == null) {
											_result.add(new Object[] { mConstructor, mAnon, mMember, jContainer,
													_edge_anonymousClassDeclaration });
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

	public static final Object[] pattern_AnonymousClass4Anonymous_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClass4Anonymous_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnonymousClass4Anonymous _this, Match match, MClassInstanceCreation mConstructor,
			AnonymousClassDeclaration mAnon, MDefinition mMember, AnonymousClassDeclaration jContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mConstructor, mAnon, mMember, jContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClass4Anonymous _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClass4Anonymous_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_1_prepare_blackB(AnonymousClass4Anonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("mConstructor");
		EObject _localVariable_1 = targetMatch.getObject("feature");
		EObject _localVariable_2 = sourceMatch.getObject("mAnon");
		EObject _localVariable_3 = targetMatch.getObject("uContainer");
		EObject _localVariable_4 = sourceMatch.getObject("mMember");
		EObject _localVariable_5 = sourceMatch.getObject("jContainer");
		EObject tmpMConstructor = _localVariable_0;
		EObject tmpFeature = _localVariable_1;
		EObject tmpMAnon = _localVariable_2;
		EObject tmpUContainer = _localVariable_3;
		EObject tmpMMember = _localVariable_4;
		EObject tmpJContainer = _localVariable_5;
		if (tmpMConstructor instanceof MClassInstanceCreation) {
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) tmpMConstructor;
			if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
				if (tmpMAnon instanceof AnonymousClassDeclaration) {
					AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
					if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
						if (tmpMMember instanceof MDefinition) {
							MDefinition mMember = (MDefinition) tmpMMember;
							if (tmpJContainer instanceof AnonymousClassDeclaration) {
								AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
								return new Object[] { mConstructor, feature, mAnon, uContainer, mMember, jContainer,
										sourceMatch, targetMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_blackBBBBBBBB(
			MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon,
			org.eclipse.uml2.uml.Class uContainer, MDefinition mMember, AnonymousClassDeclaration jContainer,
			Match sourceMatch, Match targetMatch) {
		if (!feature.equals(uContainer)) {
			if (!jContainer.equals(mAnon)) {
				if (!sourceMatch.equals(targetMatch)) {
					String feature_name = feature.getName();
					if (feature_name.equals("Anonymous")) {
						return new Object[] { mConstructor, feature, mAnon, uContainer, mMember, jContainer,
								sourceMatch, targetMatch };
					}

				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_binding = pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_binding != null) {
			MClassInstanceCreation mConstructor = (MClassInstanceCreation) result_pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_binding[0];
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_binding[1];
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result_pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_binding[3];
			MDefinition mMember = (MDefinition) result_pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_binding[4];
			AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) result_pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_black = pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_blackBBBBBBBB(
					mConstructor, feature, mAnon, uContainer, mMember, jContainer, sourceMatch, targetMatch);
			if (result_pattern_AnonymousClass4Anonymous_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { mConstructor, feature, mAnon, uContainer, mMember, jContainer, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_3_solvecsp_bindingFBBBBBBBBB(
			AnonymousClass4Anonymous _this, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class feature,
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uContainer, MDefinition mMember,
			AnonymousClassDeclaration jContainer, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(mConstructor, feature, mAnon, uContainer, mMember,
				jContainer, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, mConstructor, feature, mAnon, uContainer, mMember, jContainer,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			AnonymousClass4Anonymous _this, MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class feature,
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uContainer, MDefinition mMember,
			AnonymousClassDeclaration jContainer, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClass4Anonymous_24_3_solvecsp_binding = pattern_AnonymousClass4Anonymous_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, mConstructor, feature, mAnon, uContainer, mMember, jContainer, sourceMatch, targetMatch);
		if (result_pattern_AnonymousClass4Anonymous_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4Anonymous_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnonymousClass4Anonymous_24_3_solvecsp_black = pattern_AnonymousClass4Anonymous_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnonymousClass4Anonymous_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, mConstructor, feature, mAnon, uContainer, mMember, jContainer,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4Anonymous_24_5_matchcorrcontext_blackBBFBB(
			org.eclipse.uml2.uml.Class uContainer, AnonymousClassDeclaration jContainer, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jContainer,
					ASTNode2Element.class, "source")) {
				if (uContainer.equals(ne2ne.getTarget())) {
					_result.add(new Object[] { uContainer, jContainer, ne2ne, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_5_matchcorrcontext_greenBBBF(ASTNode2Element ne2ne,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnonymousClass4Anonymous";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ne2ne, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_6_createcorrespondence_blackBBBBBBB(
			MClassInstanceCreation mConstructor, org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon,
			org.eclipse.uml2.uml.Class uContainer, MDefinition mMember, AnonymousClassDeclaration jContainer,
			CCMatch ccMatch) {
		if (!feature.equals(uContainer)) {
			if (!jContainer.equals(mAnon)) {
				return new Object[] { mConstructor, feature, mAnon, uContainer, mMember, jContainer, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_6_createcorrespondence_greenFBBB(
			org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon, CCMatch ccMatch) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		a2a.setTarget(feature);
		a2a.setSource(mAnon);
		ccMatch.getCreateCorr().add(a2a);
		return new Object[] { a2a, feature, mAnon, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnonymousClass4Anonymous";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass4Anonymous_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_27_1_matchtggpattern_black_nac_0B(
			MClassInstanceCreation mConstructor) {
		for (AnnotationMemberValuePair __DEC_mConstructor_value_686594 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mConstructor, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { mConstructor };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_27_1_matchtggpattern_black_nac_1BB(
			MClassInstanceCreation mConstructor, MDefinition mMember) {
		for (MDefinition __DEC_mConstructor_mMethodInvocations_595273 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mConstructor, MDefinition.class, "mMethodInvocations")) {
			if (!mMember.equals(__DEC_mConstructor_mMethodInvocations_595273)) {
				return new Object[] { mConstructor, mMember };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_27_1_matchtggpattern_black_nac_2B(
			AnonymousClassDeclaration mAnon) {
		for (EnumConstantDeclaration __DEC_mAnon_anonymousClassDeclaration_51200 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(mAnon, EnumConstantDeclaration.class, "anonymousClassDeclaration")) {
			return new Object[] { mAnon };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_27_1_matchtggpattern_blackBBBB(
			MClassInstanceCreation mConstructor, AnonymousClassDeclaration mAnon, MDefinition mMember,
			AnonymousClassDeclaration jContainer) {
		if (!jContainer.equals(mAnon)) {
			if (mAnon.equals(mConstructor.getAnonymousClassDeclaration())) {
				if (mMember.getMMethodInvocations().contains(mConstructor)) {
					if (jContainer.getBodyDeclarations().contains(mMember)) {
						if (pattern_AnonymousClass4Anonymous_27_1_matchtggpattern_black_nac_0B(mConstructor) == null) {
							if (pattern_AnonymousClass4Anonymous_27_1_matchtggpattern_black_nac_1BB(mConstructor,
									mMember) == null) {
								if (pattern_AnonymousClass4Anonymous_27_1_matchtggpattern_black_nac_2B(mAnon) == null) {
									return new Object[] { mConstructor, mAnon, mMember, jContainer };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_28_1_matchtggpattern_blackBB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uContainer) {
		if (!feature.equals(uContainer)) {
			if (uContainer.getNestedClassifiers().contains(feature)) {
				return new Object[] { feature, uContainer };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_28_1_matchtggpattern_greenB(
			org.eclipse.uml2.uml.Class feature) {
		String feature_name_prime = "Anonymous";
		feature.setName(feature_name_prime);
		return new Object[] { feature };
	}

	public static final boolean pattern_AnonymousClass4Anonymous_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_1_createresult_blackB(
			AnonymousClass4Anonymous _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AnonymousClassDeclaration jContainer) {
		if (ruleResult.getSourceObjects().contains(jContainer)) {
			return new Object[] { ruleResult, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, MDefinition mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4Anonymous_29_2_isapplicablecore_blackFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ne2neList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpNe2ne : ne2neList.getEntryObjects()) {
				if (tmpNe2ne instanceof ASTNode2Element) {
					ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
					Element tmpUContainer = ne2ne.getTarget();
					if (tmpUContainer instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uContainer = (org.eclipse.uml2.uml.Class) tmpUContainer;
						ASTNode tmpJContainer = ne2ne.getSource();
						if (tmpJContainer instanceof AnonymousClassDeclaration) {
							AnonymousClassDeclaration jContainer = (AnonymousClassDeclaration) tmpJContainer;
							if (pattern_AnonymousClass4Anonymous_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									ne2ne) == null) {
								if (pattern_AnonymousClass4Anonymous_29_2_isapplicablecore_black_nac_0BB(ruleResult,
										uContainer) == null) {
									if (pattern_AnonymousClass4Anonymous_29_2_isapplicablecore_black_nac_2BB(ruleResult,
											jContainer) == null) {
										for (BodyDeclaration tmpMMember : jContainer.getBodyDeclarations()) {
											if (tmpMMember instanceof MDefinition) {
												MDefinition mMember = (MDefinition) tmpMMember;
												if (pattern_AnonymousClass4Anonymous_29_2_isapplicablecore_black_nac_3BB(
														ruleResult, mMember) == null) {
													_result.add(new Object[] { ne2neList, uContainer, ne2ne, jContainer,
															mMember, ruleEntryContainer, ruleResult });
												}
											}
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

	public static final Object[] pattern_AnonymousClass4Anonymous_29_3_solveCSP_bindingFBBBBBBB(
			AnonymousClass4Anonymous _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class uContainer,
			MDefinition mMember, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, uContainer, mMember, jContainer,
				ne2ne, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uContainer, mMember, jContainer, ne2ne, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_3_solveCSP_bindingAndBlackFBBBBBBB(
			AnonymousClass4Anonymous _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class uContainer,
			MDefinition mMember, AnonymousClassDeclaration jContainer, ASTNode2Element ne2ne,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnonymousClass4Anonymous_29_3_solveCSP_binding = pattern_AnonymousClass4Anonymous_29_3_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, uContainer, mMember, jContainer, ne2ne, ruleResult);
		if (result_pattern_AnonymousClass4Anonymous_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4Anonymous_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass4Anonymous_29_3_solveCSP_black = pattern_AnonymousClass4Anonymous_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass4Anonymous_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uContainer, mMember, jContainer, ne2ne,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4Anonymous_29_4_checkCSP_expressionFBB(
			AnonymousClass4Anonymous _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_5_checknacs_blackBBBB(
			org.eclipse.uml2.uml.Class uContainer, MDefinition mMember, AnonymousClassDeclaration jContainer,
			ASTNode2Element ne2ne) {
		return new Object[] { uContainer, mMember, jContainer, ne2ne };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_6_perform_blackBBBBB(
			org.eclipse.uml2.uml.Class uContainer, MDefinition mMember, AnonymousClassDeclaration jContainer,
			ASTNode2Element ne2ne, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { uContainer, mMember, jContainer, ne2ne, ruleResult };
	}

	public static final Object[] pattern_AnonymousClass4Anonymous_29_6_perform_greenFFFFBBB(
			org.eclipse.uml2.uml.Class uContainer, MDefinition mMember, ModelgeneratorRuleResult ruleResult) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		MClassInstanceCreation mConstructor = ModiscoFactory.eINSTANCE.createMClassInstanceCreation();
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		AnonymousClassDeclaration mAnon = JavaFactory.eINSTANCE.createAnonymousClassDeclaration();
		String feature_name_prime = "Anonymous";
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2a);
		mMember.getMMethodInvocations().add(mConstructor);
		ruleResult.getSourceObjects().add(mConstructor);
		a2a.setTarget(feature);
		uContainer.getNestedClassifiers().add(feature);
		ruleResult.getTargetObjects().add(feature);
		mConstructor.setAnonymousClassDeclaration(mAnon);
		a2a.setSource(mAnon);
		ruleResult.getSourceObjects().add(mAnon);
		feature.setName(feature_name_prime);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a2a, mConstructor, feature, mAnon, uContainer, mMember, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_AnonymousClass4Anonymous_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnonymousClass4AnonymousImpl
