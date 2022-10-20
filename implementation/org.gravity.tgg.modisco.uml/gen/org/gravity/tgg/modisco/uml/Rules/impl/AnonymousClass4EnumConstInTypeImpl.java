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
import org.eclipse.modisco.java.AnonymousClassDeclaration;
import org.eclipse.modisco.java.BodyDeclaration;
import org.eclipse.modisco.java.ClassInstanceCreation;
import org.eclipse.modisco.java.EnumConstantDeclaration;
import org.eclipse.modisco.java.EnumDeclaration;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.UMLFactory;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.AnonymousClass4EnumConstInType;
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
 * An implementation of the model object '<em><b>Anonymous Class4 Enum Const In Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AnonymousClass4EnumConstInTypeImpl extends AbstractRuleImpl implements AnonymousClass4EnumConstInType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousClass4EnumConstInTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getAnonymousClass4EnumConstInType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, AnonymousClassDeclaration mAnon, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer) {

		Object[] result1_black = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_0_1_initialbindings_blackBBBBBB(this, match, mAnon, jType,
						mMember, jContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAnon] = " + mAnon + ", " + "[jType] = " + jType + ", "
					+ "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, mAnon, jType,
						mMember, jContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[mAnon] = " + mAnon + ", " + "[jType] = " + jType + ", "
					+ "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_0_4_collectelementstobetranslated_blackBBBBB(match, mAnon,
							jType, mMember, jContainer);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnon] = " + mAnon + ", " + "[jType] = " + jType + ", " + "[mMember] = " + mMember + ", "
						+ "[jContainer] = " + jContainer + ".");
			}
			AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_0_4_collectelementstobetranslated_greenBBBF(match, mAnon,
							mMember);
			//nothing EMoflonEdge mMember__mAnon____anonymousClassDeclaration = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_0_5_collectcontextelements_blackBBBBB(match, mAnon, jType,
							mMember, jContainer);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[mAnon] = " + mAnon + ", " + "[jType] = " + jType + ", " + "[mMember] = " + mMember + ", "
						+ "[jContainer] = " + jContainer + ".");
			}
			AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_0_5_collectcontextelements_greenBBBBFFF(match, jType,
							mMember, jContainer);
			//nothing EMoflonEdge jType__jContainer____bodyDeclarations = (EMoflonEdge) result5_green[4];
			//nothing EMoflonEdge jContainer__jType____abstractTypeDeclaration = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge jContainer__mMember____enumConstants = (EMoflonEdge) result5_green[6];

			// 
			AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
							mAnon, jType, mMember, jContainer);
			return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_0_7_expressionF();
		} else {
			return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[1];
		Enumeration uContainer = (Enumeration) result1_bindingAndBlack[2];
		AbstractTypeDeclaration jType = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		EnumConstantDeclaration mMember = (EnumConstantDeclaration) result1_bindingAndBlack[4];
		EnumDeclaration jContainer = (EnumDeclaration) result1_bindingAndBlack[5];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[6];
		ASTNode2Element p2p = (ASTNode2Element) result1_bindingAndBlack[7];
		CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_greenFFBBB(mAnon, uType, csp);
		ASTNode2Element a2a = (ASTNode2Element) result1_green[0];
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_green[1];

		Object[] result2_black = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_1_2_collecttranslatedelements_blackBBB(a2a, feature, mAnon);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2a] = " + a2a + ", "
					+ "[feature] = " + feature + ", " + "[mAnon] = " + mAnon + ".");
		}
		Object[] result2_green = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_1_2_collecttranslatedelements_greenFBBB(a2a, feature, mAnon);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_1_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, a2a,
						feature, mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2a] = " + a2a + ", " + "[feature] = " + feature + ", " + "[mAnon] = " + mAnon + ", "
					+ "[uType] = " + uType + ", " + "[uContainer] = " + uContainer + ", " + "[jType] = " + jType + ", "
					+ "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne
					+ ", " + "[p2p] = " + p2p + ".");
		}
		AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, a2a,
						feature, mAnon, uType, mMember);
		//nothing EMoflonEdge uType__feature____nestedClassifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge a2a__feature____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mMember__mAnon____anonymousClassDeclaration = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge a2a__mAnon____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_1_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
						a2a, feature, mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p);
		return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_binding[0];
		AbstractTypeDeclaration jType = (AbstractTypeDeclaration) result2_binding[1];
		EnumConstantDeclaration mMember = (EnumConstantDeclaration) result2_binding[2];
		EnumDeclaration jContainer = (EnumDeclaration) result2_binding[3];
		for (Object[] result2_black : AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_2_2_corematch_blackBFFBBBFFB(mAnon, jType, mMember, jContainer,
						match)) {
			org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) result2_black[1];
			Enumeration uContainer = (Enumeration) result2_black[2];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[6];
			ASTNode2Element p2p = (ASTNode2Element) result2_black[7];
			// ForEach 
			for (Object[] result3_black : AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_2_3_findcontext_blackBBBBBBBB(mAnon, uType, uContainer,
							jType, mMember, jContainer, ne2ne, p2p)) {
				Object[] result3_green = AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(mAnon, uType,
								uContainer, jType, mMember, jContainer, ne2ne, p2p);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge uContainer__uType____owner = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge uType__uContainer____ownedElement = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge p2p__jType____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge jType__jContainer____bodyDeclarations = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge jContainer__jType____abstractTypeDeclaration = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge mMember__mAnon____anonymousClassDeclaration = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge p2p__uType____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge jContainer__mMember____enumConstants = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[mAnon] = " + mAnon + ", "
							+ "[uType] = " + uType + ", " + "[uContainer] = " + uContainer + ", " + "[jType] = " + jType
							+ ", " + "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ", "
							+ "[ne2ne] = " + ne2ne + ", " + "[p2p] = " + p2p + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousClass4EnumConstInTypeImpl
							.pattern_AnonymousClass4EnumConstInType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClass4EnumConstInTypeImpl
							.pattern_AnonymousClass4EnumConstInType_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, AnonymousClassDeclaration mAnon, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer) {
		match.registerObject("mAnon", mAnon);
		match.registerObject("jType", jType);
		match.registerObject("mMember", mMember);
		match.registerObject("jContainer", jContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, AnonymousClassDeclaration mAnon, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnon,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element p2p) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("Anonymous");
		literal0.setType("");

		// Create attribute variables
		Variable var_uContainer_name = CSPFactoryHelper.eINSTANCE.createVariable("uContainer.name", true, csp);
		var_uContainer_name.setValue(uContainer.getName());
		var_uContainer_name.setType("String");

		// Create unbound variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();

		csp.getConstraints().add(addPrefix);

		// Solve CSP
		addPrefix.setRuleName("NoRuleName");
		addPrefix.solve(var_uContainer_name, literal0, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("mAnon", mAnon);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("p2p", p2p);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject a2a, EObject feature, EObject mAnon,
			EObject uType, EObject uContainer, EObject jType, EObject mMember, EObject jContainer, EObject ne2ne,
			EObject p2p) {
		ruleresult.registerObject("a2a", a2a);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("mAnon", mAnon);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("p2p", p2p);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("mAnon").eClass())
				.equals("java.AnonymousClassDeclaration.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType,
			Enumeration uContainer) {

		Object[] result1_black = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_10_1_initialbindings_blackBBBBB(this, match, feature, uType,
						uContainer);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uType] = " + uType + ", "
					+ "[uContainer] = " + uContainer + ".");
		}

		Object[] result2_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_bindingAndBlackFBBBBB(this, match, feature, uType,
						uContainer);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[feature] = " + feature + ", " + "[uType] = " + uType + ", "
					+ "[uContainer] = " + uContainer + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_10_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_10_4_collectelementstobetranslated_blackBBBB(match, feature,
							uType, uContainer);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[feature] = "
								+ feature + ", " + "[uType] = " + uType + ", " + "[uContainer] = " + uContainer + ".");
			}
			AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_10_4_collectelementstobetranslated_greenBBBF(match, feature,
							uType);
			//nothing EMoflonEdge uType__feature____nestedClassifier = (EMoflonEdge) result4_green[3];

			Object[] result5_black = AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_10_5_collectcontextelements_blackBBBB(match, feature, uType,
							uContainer);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[feature] = "
								+ feature + ", " + "[uType] = " + uType + ", " + "[uContainer] = " + uContainer + ".");
			}
			AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_10_5_collectcontextelements_greenBBBFF(match, uType,
							uContainer);
			//nothing EMoflonEdge uContainer__uType____owner = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge uType__uContainer____ownedElement = (EMoflonEdge) result5_green[4];

			// 
			AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_10_6_registerobjectstomatch_expressionBBBBB(this, match,
							feature, uType, uContainer);
			return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_10_7_expressionF();
		} else {
			return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[0];
		org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) result1_bindingAndBlack[1];
		Enumeration uContainer = (Enumeration) result1_bindingAndBlack[2];
		AbstractTypeDeclaration jType = (AbstractTypeDeclaration) result1_bindingAndBlack[3];
		EnumConstantDeclaration mMember = (EnumConstantDeclaration) result1_bindingAndBlack[4];
		EnumDeclaration jContainer = (EnumDeclaration) result1_bindingAndBlack[5];
		ASTNode2Element ne2ne = (ASTNode2Element) result1_bindingAndBlack[6];
		ASTNode2Element p2p = (ASTNode2Element) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];
		Object[] result1_green = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_greenFBFB(feature, mMember);
		ASTNode2Element a2a = (ASTNode2Element) result1_green[0];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result1_green[2];

		Object[] result2_black = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_11_2_collecttranslatedelements_blackBBB(a2a, feature, mAnon);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[a2a] = " + a2a + ", "
					+ "[feature] = " + feature + ", " + "[mAnon] = " + mAnon + ".");
		}
		Object[] result2_green = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_11_2_collecttranslatedelements_greenFBBB(a2a, feature, mAnon);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_11_3_bookkeepingforedges_blackBBBBBBBBBBB(ruleresult, a2a,
						feature, mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[a2a] = " + a2a + ", " + "[feature] = " + feature + ", " + "[mAnon] = " + mAnon + ", "
					+ "[uType] = " + uType + ", " + "[uContainer] = " + uContainer + ", " + "[jType] = " + jType + ", "
					+ "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne
					+ ", " + "[p2p] = " + p2p + ".");
		}
		AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, a2a,
						feature, mAnon, uType, mMember);
		//nothing EMoflonEdge uType__feature____nestedClassifier = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge a2a__feature____target = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge mMember__mAnon____anonymousClassDeclaration = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge a2a__mAnon____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_11_5_registerobjects_expressionBBBBBBBBBBBB(this, ruleresult,
						a2a, feature, mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p);
		return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_12_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_binding[0];
		org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) result2_binding[1];
		Enumeration uContainer = (Enumeration) result2_binding[2];
		for (Object[] result2_black : AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_12_2_corematch_blackBBBFFFFB(feature, uType, uContainer,
						match)) {
			AbstractTypeDeclaration jType = (AbstractTypeDeclaration) result2_black[3];
			EnumDeclaration jContainer = (EnumDeclaration) result2_black[4];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[5];
			ASTNode2Element p2p = (ASTNode2Element) result2_black[6];
			// ForEach 
			for (Object[] result3_black : AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_12_3_findcontext_blackBBBBFBBB(feature, uType, uContainer,
							jType, jContainer, ne2ne, p2p)) {
				EnumConstantDeclaration mMember = (EnumConstantDeclaration) result3_black[4];
				Object[] result3_green = AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(feature,
								uType, uContainer, jType, mMember, jContainer, ne2ne, p2p);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge uType__feature____nestedClassifier = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge uContainer__uType____owner = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge uType__uContainer____ownedElement = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge p2p__jType____source = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge jType__jContainer____bodyDeclarations = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge jContainer__jType____abstractTypeDeclaration = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge ne2ne__jContainer____source = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge p2p__uType____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge ne2ne__uContainer____target = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge jContainer__mMember____enumConstants = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
								isApplicableMatch, feature, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[feature] = " + feature + ", "
							+ "[uType] = " + uType + ", " + "[uContainer] = " + uContainer + ", " + "[jType] = " + jType
							+ ", " + "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ", "
							+ "[ne2ne] = " + ne2ne + ", " + "[p2p] = " + p2p + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = AnonymousClass4EnumConstInTypeImpl
							.pattern_AnonymousClass4EnumConstInType_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					AnonymousClass4EnumConstInTypeImpl
							.pattern_AnonymousClass4EnumConstInType_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {
		match.registerObject("feature", feature);
		match.registerObject("uType", uType);
		match.registerObject("uContainer", uContainer);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("Anonymous");
		literal0.setType("");

		// Create attribute variables
		Variable var_uContainer_name = CSPFactoryHelper.eINSTANCE.createVariable("uContainer.name", true, csp);
		var_uContainer_name.setValue(uContainer.getName());
		var_uContainer_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();

		csp.getConstraints().add(addPrefix);

		// Solve CSP
		addPrefix.setRuleName("NoRuleName");
		addPrefix.solve(var_uContainer_name, literal0, var_feature_name);
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
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element p2p) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("feature", feature);
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("p2p", p2p);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject a2a, EObject feature, EObject mAnon,
			EObject uType, EObject uContainer, EObject jType, EObject mMember, EObject jContainer, EObject ne2ne,
			EObject p2p) {
		ruleresult.registerObject("a2a", a2a);
		ruleresult.registerObject("feature", feature);
		ruleresult.registerObject("mAnon", mAnon);
		ruleresult.registerObject("uType", uType);
		ruleresult.registerObject("uContainer", uContainer);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("mMember", mMember);
		ruleresult.registerObject("jContainer", jContainer);
		ruleresult.registerObject("ne2ne", ne2ne);
		ruleresult.registerObject("p2p", p2p);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_120(EMoflonEdge _edge_nestedClassifier) {

		Object[] result1_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_20_2_testcorematchandDECs_blackFFFB(_edge_nestedClassifier)) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_black[0];
			org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) result2_black[1];
			Enumeration uContainer = (Enumeration) result2_black[2];
			Object[] result2_green = AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, feature, uType, uContainer)) {
				// 
				if (AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClass4EnumConstInTypeImpl
							.pattern_AnonymousClass4EnumConstInType_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClass4EnumConstInTypeImpl
							.pattern_AnonymousClass4EnumConstInType_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_124(EMoflonEdge _edge_anonymousClassDeclaration) {

		Object[] result1_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_21_2_testcorematchandDECs_blackFFFFB(
						_edge_anonymousClassDeclaration)) {
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_black[0];
			AbstractTypeDeclaration jType = (AbstractTypeDeclaration) result2_black[1];
			EnumConstantDeclaration mMember = (EnumConstantDeclaration) result2_black[2];
			EnumDeclaration jContainer = (EnumDeclaration) result2_black[3];
			Object[] result2_green = AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, mAnon, jType, mMember, jContainer)) {
				// 
				if (AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = AnonymousClass4EnumConstInTypeImpl
							.pattern_AnonymousClass4EnumConstInType_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					AnonymousClass4EnumConstInTypeImpl
							.pattern_AnonymousClass4EnumConstInType_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("AnonymousClass4EnumConstInType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("Anonymous");
		var_literal0.setType("");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_uContainer_name = CSPFactoryHelper.eINSTANCE.createVariable("uContainer", true, csp);
		var_uContainer_name.setValue(__helper.getValue("uContainer", "name"));
		var_uContainer_name.setType("String");

		AddPrefix addPrefix0 = new AddPrefix();
		csp.getConstraints().add(addPrefix0);

		addPrefix0.setRuleName("AnonymousClass4EnumConstInType");
		addPrefix0.solve(var_uContainer_name, var_literal0, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_feature_name.setBound(false);
			addPrefix0.solve(var_uContainer_name, var_literal0, var_feature_name);
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
		ruleResult.setRule("AnonymousClass4EnumConstInType");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("Anonymous");
		var_literal0.setType("");

		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature", true, csp);
		var_feature_name.setValue(__helper.getValue("feature", "name"));
		var_feature_name.setType("String");

		Variable var_uContainer_name = CSPFactoryHelper.eINSTANCE.createVariable("uContainer", true, csp);
		var_uContainer_name.setValue(__helper.getValue("uContainer", "name"));
		var_uContainer_name.setType("String");

		AddPrefix addPrefix0 = new AddPrefix();
		csp.getConstraints().add(addPrefix0);

		addPrefix0.setRuleName("AnonymousClass4EnumConstInType");
		addPrefix0.solve(var_uContainer_name, var_literal0, var_feature_name);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			addPrefix0.solve(var_uContainer_name, var_literal0, var_feature_name);
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

		Object[] result1_black = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[0];
		AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result2_bindingAndBlack[1];
		org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) result2_bindingAndBlack[2];
		Enumeration uContainer = (Enumeration) result2_bindingAndBlack[3];
		AbstractTypeDeclaration jType = (AbstractTypeDeclaration) result2_bindingAndBlack[4];
		EnumConstantDeclaration mMember = (EnumConstantDeclaration) result2_bindingAndBlack[5];
		EnumDeclaration jContainer = (EnumDeclaration) result2_bindingAndBlack[6];

		Object[] result3_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(this, feature, mAnon,
						uType, uContainer, jType, mMember, jContainer, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[feature] = " + feature + ", " + "[mAnon] = " + mAnon + ", " + "[uType] = " + uType + ", "
					+ "[uContainer] = " + uContainer + ", " + "[jType] = " + jType + ", " + "[mMember] = " + mMember
					+ ", " + "[jContainer] = " + jContainer + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_24_5_matchcorrcontext_blackBBBBFFBB(uType, uContainer,
							jType, jContainer, sourceMatch, targetMatch)) {
				ASTNode2Element ne2ne = (ASTNode2Element) result5_black[4];
				ASTNode2Element p2p = (ASTNode2Element) result5_black[5];
				Object[] result5_green = AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_24_5_matchcorrcontext_greenBBBBF(ne2ne, p2p,
								sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_24_6_createcorrespondence_blackBBBBBBBB(feature, mAnon,
								uType, uContainer, jType, mMember, jContainer, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[feature] = " + feature
							+ ", " + "[mAnon] = " + mAnon + ", " + "[uType] = " + uType + ", " + "[uContainer] = "
							+ uContainer + ", " + "[jType] = " + jType + ", " + "[mMember] = " + mMember + ", "
							+ "[jContainer] = " + jContainer + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_24_6_createcorrespondence_greenFBBB(feature, mAnon,
								ccMatch);
				//nothing ASTNode2Element a2a = (ASTNode2Element) result6_green[0];

				Object[] result7_black = AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("Anonymous");
		literal0.setType("");

		// Create attribute variables
		Variable var_uContainer_name = CSPFactoryHelper.eINSTANCE.createVariable("uContainer.name", true, csp);
		var_uContainer_name.setValue(uContainer.getName());
		var_uContainer_name.setType("String");
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", true, csp);
		var_feature_name.setValue(feature.getName());
		var_feature_name.setType("String");

		// Create unbound variables

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();

		csp.getConstraints().add(addPrefix);

		// Solve CSP
		addPrefix.setRuleName("NoRuleName");
		addPrefix.solve(var_uContainer_name, literal0, var_feature_name);
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
	public boolean checkDEC_FWD(AnonymousClassDeclaration mAnon, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer) {// 
		Object[] result1_black = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_27_1_matchtggpattern_blackBBBB(mAnon, jType, mMember,
						jContainer);
		if (result1_black != null) {
			return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_27_2_expressionF();
		} else {
			return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType,
			Enumeration uContainer) {// 
		Object[] result1_black = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_28_1_matchtggpattern_blackBBB(feature, uType, uContainer);
		if (result1_black != null) {
			return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_28_2_expressionF();
		} else {
			return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer, ASTNode2Element p2pParameter) {

		Object[] result1_black = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : AnonymousClass4EnumConstInTypeImpl
				.pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList p2pList = (RuleEntryList) result2_black[0];
			org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) result2_black[1];
			ASTNode2Element p2p = (ASTNode2Element) result2_black[2];
			AbstractTypeDeclaration jType = (AbstractTypeDeclaration) result2_black[3];
			EnumDeclaration jContainer = (EnumDeclaration) result2_black[4];
			EnumConstantDeclaration mMember = (EnumConstantDeclaration) result2_black[5];
			ASTNode2Element ne2ne = (ASTNode2Element) result2_black[6];
			Enumeration uContainer = (Enumeration) result2_black[7];

			Object[] result3_bindingAndBlack = AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(this,
							isApplicableMatch, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[uType] = " + uType + ", "
						+ "[uContainer] = " + uContainer + ", " + "[jType] = " + jType + ", " + "[mMember] = " + mMember
						+ ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = " + ne2ne + ", " + "[p2p] = " + p2p
						+ ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (AnonymousClass4EnumConstInTypeImpl
					.pattern_AnonymousClass4EnumConstInType_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = AnonymousClass4EnumConstInTypeImpl
						.pattern_AnonymousClass4EnumConstInType_29_5_checknacs_blackBBBBBBB(uType, uContainer, jType,
								mMember, jContainer, ne2ne, p2p);
				if (result5_black != null) {

					Object[] result6_black = AnonymousClass4EnumConstInTypeImpl
							.pattern_AnonymousClass4EnumConstInType_29_6_perform_blackBBBBBBBB(uType, uContainer, jType,
									mMember, jContainer, ne2ne, p2p, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[uType] = " + uType
								+ ", " + "[uContainer] = " + uContainer + ", " + "[jType] = " + jType + ", "
								+ "[mMember] = " + mMember + ", " + "[jContainer] = " + jContainer + ", " + "[ne2ne] = "
								+ ne2ne + ", " + "[p2p] = " + p2p + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_29_6_perform_greenFFFBBBB(
							uType, mMember, ruleResult, csp);
					//nothing ASTNode2Element a2a = (ASTNode2Element) result6_green[0];
					//nothing org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result6_green[1];
					//nothing AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return AnonymousClass4EnumConstInTypeImpl.pattern_AnonymousClass4EnumConstInType_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class uType,
			Enumeration uContainer, AbstractTypeDeclaration jType, EnumConstantDeclaration mMember,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element p2p,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("Anonymous");
		literal0.setType("");

		// Create attribute variables
		Variable var_uContainer_name = CSPFactoryHelper.eINSTANCE.createVariable("uContainer.name", true, csp);
		var_uContainer_name.setValue(uContainer.getName());
		var_uContainer_name.setType("String");

		// Create unbound variables
		Variable var_feature_name = CSPFactoryHelper.eINSTANCE.createVariable("feature.name", csp);
		var_feature_name.setType("String");

		// Create constraints
		AddPrefix addPrefix = new AddPrefix();

		csp.getConstraints().add(addPrefix);

		// Solve CSP
		addPrefix.setRuleName("NoRuleName");
		addPrefix.solve(var_uContainer_name, literal0, var_feature_name);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("uType", uType);
		isApplicableMatch.registerObject("uContainer", uContainer);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("mMember", mMember);
		isApplicableMatch.registerObject("jContainer", jContainer);
		isApplicableMatch.registerObject("ne2ne", ne2ne);
		isApplicableMatch.registerObject("p2p", p2p);
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
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPROPRIATE_FWD__MATCH_ANONYMOUSCLASSDECLARATION_ABSTRACTTYPEDECLARATION_ENUMCONSTANTDECLARATION_ENUMDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (EnumConstantDeclaration) arguments.get(3),
					(EnumDeclaration) arguments.get(4));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_ANONYMOUSCLASSDECLARATION_ABSTRACTTYPEDECLARATION_ENUMCONSTANTDECLARATION_ENUMDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (EnumConstantDeclaration) arguments.get(3),
					(EnumDeclaration) arguments.get(4));
			return null;
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_ANONYMOUSCLASSDECLARATION_ABSTRACTTYPEDECLARATION_ENUMCONSTANTDECLARATION_ENUMDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (AnonymousClassDeclaration) arguments.get(1),
					(AbstractTypeDeclaration) arguments.get(2), (EnumConstantDeclaration) arguments.get(3),
					(EnumDeclaration) arguments.get(4));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_ANONYMOUSCLASSDECLARATION_CLASS_ENUMERATION_ABSTRACTTYPEDECLARATION_ENUMCONSTANTDECLARATION_ENUMDECLARATION_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1), (org.eclipse.uml2.uml.Class) arguments.get(2),
					(Enumeration) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(EnumConstantDeclaration) arguments.get(5), (EnumDeclaration) arguments.get(6),
					(ASTNode2Element) arguments.get(7), (ASTNode2Element) arguments.get(8));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPROPRIATE_BWD__MATCH_CLASS_CLASS_ENUMERATION:
			return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Enumeration) arguments.get(3));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_CLASS_CLASS_ENUMERATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Enumeration) arguments.get(3));
			return null;
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_CLASS_CLASS_ENUMERATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Class) arguments.get(1),
					(org.eclipse.uml2.uml.Class) arguments.get(2), (Enumeration) arguments.get(3));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_CLASS_ENUMERATION_ABSTRACTTYPEDECLARATION_ENUMCONSTANTDECLARATION_ENUMDECLARATION_ASTNODE2ELEMENT_ASTNODE2ELEMENT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (org.eclipse.uml2.uml.Class) arguments.get(2),
					(Enumeration) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(EnumConstantDeclaration) arguments.get(5), (EnumDeclaration) arguments.get(6),
					(ASTNode2Element) arguments.get(7), (ASTNode2Element) arguments.get(8));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10));
			return null;
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_120__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_120((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_124__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_124((EMoflonEdge) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__CLASS_ANONYMOUSCLASSDECLARATION_CLASS_ENUMERATION_ABSTRACTTYPEDECLARATION_ENUMCONSTANTDECLARATION_ENUMDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((org.eclipse.uml2.uml.Class) arguments.get(0),
					(AnonymousClassDeclaration) arguments.get(1), (org.eclipse.uml2.uml.Class) arguments.get(2),
					(Enumeration) arguments.get(3), (AbstractTypeDeclaration) arguments.get(4),
					(EnumConstantDeclaration) arguments.get(5), (EnumDeclaration) arguments.get(6),
					(Match) arguments.get(7), (Match) arguments.get(8));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___CHECK_DEC_FWD__ANONYMOUSCLASSDECLARATION_ABSTRACTTYPEDECLARATION_ENUMCONSTANTDECLARATION_ENUMDECLARATION:
			return checkDEC_FWD((AnonymousClassDeclaration) arguments.get(0),
					(AbstractTypeDeclaration) arguments.get(1), (EnumConstantDeclaration) arguments.get(2),
					(EnumDeclaration) arguments.get(3));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___CHECK_DEC_BWD__CLASS_CLASS_ENUMERATION:
			return checkDEC_BWD((org.eclipse.uml2.uml.Class) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (Enumeration) arguments.get(2));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
			return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_CLASS_ENUMERATION_ABSTRACTTYPEDECLARATION_ENUMCONSTANTDECLARATION_ENUMDECLARATION_ASTNODE2ELEMENT_ASTNODE2ELEMENT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(org.eclipse.uml2.uml.Class) arguments.get(1), (Enumeration) arguments.get(2),
					(AbstractTypeDeclaration) arguments.get(3), (EnumConstantDeclaration) arguments.get(4),
					(EnumDeclaration) arguments.get(5), (ASTNode2Element) arguments.get(6),
					(ASTNode2Element) arguments.get(7), (ModelgeneratorRuleResult) arguments.get(8));
		case RulesPackage.ANONYMOUS_CLASS4_ENUM_CONST_IN_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_0_1_initialbindings_blackBBBBBB(
			AnonymousClass4EnumConstInType _this, Match match, AnonymousClassDeclaration mAnon,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer) {
		if (!jContainer.equals(jType)) {
			return new Object[] { _this, match, mAnon, jType, mMember, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_bindingFBBBBBB(
			AnonymousClass4EnumConstInType _this, Match match, AnonymousClassDeclaration mAnon,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, mAnon, jType, mMember, jContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, mAnon, jType, mMember, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			AnonymousClass4EnumConstInType _this, Match match, AnonymousClassDeclaration mAnon,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_binding = pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, mAnon, jType, mMember, jContainer);
		if (result_pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_black = pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass4EnumConstInType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, mAnon, jType, mMember, jContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_0_3_CheckCSP_expressionFBB(
			AnonymousClass4EnumConstInType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, AnonymousClassDeclaration mAnon, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer) {
		if (!jContainer.equals(jType)) {
			return new Object[] { match, mAnon, jType, mMember, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_0_4_collectelementstobetranslated_greenBBBF(
			Match match, AnonymousClassDeclaration mAnon, EnumConstantDeclaration mMember) {
		EMoflonEdge mMember__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(mAnon);
		String mMember__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		mMember__mAnon____anonymousClassDeclaration.setSrc(mMember);
		mMember__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		match.getToBeTranslatedEdges().add(mMember__mAnon____anonymousClassDeclaration);
		mMember__mAnon____anonymousClassDeclaration.setName(mMember__mAnon____anonymousClassDeclaration_name_prime);
		return new Object[] { match, mAnon, mMember, mMember__mAnon____anonymousClassDeclaration };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_0_5_collectcontextelements_blackBBBBB(
			Match match, AnonymousClassDeclaration mAnon, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer) {
		if (!jContainer.equals(jType)) {
			return new Object[] { match, mAnon, jType, mMember, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_0_5_collectcontextelements_greenBBBBFFF(
			Match match, AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer) {
		EMoflonEdge jType__jContainer____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__jType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__mMember____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(jType);
		match.getContextNodes().add(mMember);
		match.getContextNodes().add(jContainer);
		String jType__jContainer____bodyDeclarations_name_prime = "bodyDeclarations";
		String jContainer__jType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String jContainer__mMember____enumConstants_name_prime = "enumConstants";
		jType__jContainer____bodyDeclarations.setSrc(jType);
		jType__jContainer____bodyDeclarations.setTrg(jContainer);
		match.getContextEdges().add(jType__jContainer____bodyDeclarations);
		jContainer__jType____abstractTypeDeclaration.setSrc(jContainer);
		jContainer__jType____abstractTypeDeclaration.setTrg(jType);
		match.getContextEdges().add(jContainer__jType____abstractTypeDeclaration);
		jContainer__mMember____enumConstants.setSrc(jContainer);
		jContainer__mMember____enumConstants.setTrg(mMember);
		match.getContextEdges().add(jContainer__mMember____enumConstants);
		jType__jContainer____bodyDeclarations.setName(jType__jContainer____bodyDeclarations_name_prime);
		jContainer__jType____abstractTypeDeclaration.setName(jContainer__jType____abstractTypeDeclaration_name_prime);
		jContainer__mMember____enumConstants.setName(jContainer__mMember____enumConstants_name_prime);
		return new Object[] { match, jType, mMember, jContainer, jType__jContainer____bodyDeclarations,
				jContainer__jType____abstractTypeDeclaration, jContainer__mMember____enumConstants };
	}

	public static final void pattern_AnonymousClass4EnumConstInType_0_6_registerobjectstomatch_expressionBBBBBB(
			AnonymousClass4EnumConstInType _this, Match match, AnonymousClassDeclaration mAnon,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer) {
		_this.registerObjectsToMatch_FWD(match, mAnon, jType, mMember, jContainer);

	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("mAnon");
		EObject _localVariable_1 = isApplicableMatch.getObject("uType");
		EObject _localVariable_2 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("jType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_6 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_7 = isApplicableMatch.getObject("p2p");
		EObject tmpMAnon = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpUContainer = _localVariable_2;
		EObject tmpJType = _localVariable_3;
		EObject tmpMMember = _localVariable_4;
		EObject tmpJContainer = _localVariable_5;
		EObject tmpNe2ne = _localVariable_6;
		EObject tmpP2p = _localVariable_7;
		if (tmpMAnon instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
			if (tmpUType instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) tmpUType;
				if (tmpUContainer instanceof Enumeration) {
					Enumeration uContainer = (Enumeration) tmpUContainer;
					if (tmpJType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration jType = (AbstractTypeDeclaration) tmpJType;
						if (tmpMMember instanceof EnumConstantDeclaration) {
							EnumConstantDeclaration mMember = (EnumConstantDeclaration) tmpMMember;
							if (tmpJContainer instanceof EnumDeclaration) {
								EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
								if (tmpNe2ne instanceof ASTNode2Element) {
									ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
									if (tmpP2p instanceof ASTNode2Element) {
										ASTNode2Element p2p = (ASTNode2Element) tmpP2p;
										return new Object[] { mAnon, uType, uContainer, jType, mMember, jContainer,
												ne2ne, p2p, isApplicableMatch };
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

	public static final Object[] pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_blackBBBBBBBBFBB(
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uType, Enumeration uContainer,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, ASTNode2Element p2p, AnonymousClass4EnumConstInType _this,
			IsApplicableMatch isApplicableMatch) {
		if (!jContainer.equals(jType)) {
			if (!ne2ne.equals(p2p)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p, csp,
								_this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			AnonymousClass4EnumConstInType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_binding = pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_binding != null) {
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_binding[1];
			Enumeration uContainer = (Enumeration) result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_binding[2];
			AbstractTypeDeclaration jType = (AbstractTypeDeclaration) result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_binding[3];
			EnumConstantDeclaration mMember = (EnumConstantDeclaration) result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_binding[4];
			EnumDeclaration jContainer = (EnumDeclaration) result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_binding[5];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_binding[6];
			ASTNode2Element p2p = (ASTNode2Element) result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_binding[7];

			Object[] result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_black = pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_blackBBBBBBBBFBB(
					mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p, _this, isApplicableMatch);
			if (result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_black[8];

				return new Object[] { mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_1_1_performtransformation_greenFFBBB(
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uType, CSP csp) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		Object _localVariable_0 = csp.getValue("feature", "name");
		a2a.setSource(mAnon);
		uType.getNestedClassifiers().add(feature);
		a2a.setTarget(feature);
		String feature_name_prime = (String) _localVariable_0;
		feature.setName(feature_name_prime);
		return new Object[] { a2a, feature, mAnon, uType, csp };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_1_2_collecttranslatedelements_blackBBB(
			ASTNode2Element a2a, org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon) {
		return new Object[] { a2a, feature, mAnon };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_1_2_collecttranslatedelements_greenFBBB(
			ASTNode2Element a2a, org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2a);
		ruleresult.getCreatedElements().add(feature);
		ruleresult.getTranslatedElements().add(mAnon);
		return new Object[] { ruleresult, a2a, feature, mAnon };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_1_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2a, EObject feature, EObject mAnon, EObject uType,
			EObject uContainer, EObject jType, EObject mMember, EObject jContainer, EObject ne2ne, EObject p2p) {
		if (!a2a.equals(feature)) {
			if (!a2a.equals(mAnon)) {
				if (!a2a.equals(uType)) {
					if (!a2a.equals(uContainer)) {
						if (!a2a.equals(jType)) {
							if (!a2a.equals(mMember)) {
								if (!a2a.equals(jContainer)) {
									if (!a2a.equals(ne2ne)) {
										if (!a2a.equals(p2p)) {
											if (!feature.equals(mAnon)) {
												if (!feature.equals(uType)) {
													if (!feature.equals(uContainer)) {
														if (!feature.equals(jType)) {
															if (!feature.equals(mMember)) {
																if (!feature.equals(jContainer)) {
																	if (!feature.equals(ne2ne)) {
																		if (!feature.equals(p2p)) {
																			if (!mAnon.equals(uType)) {
																				if (!mAnon.equals(uContainer)) {
																					if (!mAnon.equals(mMember)) {
																						if (!mAnon.equals(ne2ne)) {
																							if (!mAnon.equals(p2p)) {
																								if (!uContainer.equals(
																										uType)) {
																									if (!jType.equals(
																											mAnon)) {
																										if (!jType
																												.equals(uType)) {
																											if (!jType
																													.equals(uContainer)) {
																												if (!jType
																														.equals(mMember)) {
																													if (!jType
																															.equals(ne2ne)) {
																														if (!jType
																																.equals(p2p)) {
																															if (!mMember
																																	.equals(uType)) {
																																if (!mMember
																																		.equals(uContainer)) {
																																	if (!mMember
																																			.equals(ne2ne)) {
																																		if (!mMember
																																				.equals(p2p)) {
																																			if (!jContainer
																																					.equals(mAnon)) {
																																				if (!jContainer
																																						.equals(uType)) {
																																					if (!jContainer
																																							.equals(uContainer)) {
																																						if (!jContainer
																																								.equals(jType)) {
																																							if (!jContainer
																																									.equals(mMember)) {
																																								if (!jContainer
																																										.equals(ne2ne)) {
																																									if (!jContainer
																																											.equals(p2p)) {
																																										if (!ne2ne
																																												.equals(uType)) {
																																											if (!ne2ne
																																													.equals(uContainer)) {
																																												if (!ne2ne
																																														.equals(p2p)) {
																																													if (!p2p.equals(
																																															uType)) {
																																														if (!p2p.equals(
																																																uContainer)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	a2a,
																																																	feature,
																																																	mAnon,
																																																	uType,
																																																	uContainer,
																																																	jType,
																																																	mMember,
																																																	jContainer,
																																																	ne2ne,
																																																	p2p };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnonymousClass4EnumConstInType_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject a2a, EObject feature, EObject mAnon, EObject uType, EObject mMember) {
		EMoflonEdge uType__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2a__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2a__mAnon____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClass4EnumConstInType";
		String uType__feature____nestedClassifier_name_prime = "nestedClassifier";
		String a2a__feature____target_name_prime = "target";
		String mMember__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String a2a__mAnon____source_name_prime = "source";
		uType__feature____nestedClassifier.setSrc(uType);
		uType__feature____nestedClassifier.setTrg(feature);
		ruleresult.getCreatedEdges().add(uType__feature____nestedClassifier);
		a2a__feature____target.setSrc(a2a);
		a2a__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(a2a__feature____target);
		mMember__mAnon____anonymousClassDeclaration.setSrc(mMember);
		mMember__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		ruleresult.getTranslatedEdges().add(mMember__mAnon____anonymousClassDeclaration);
		a2a__mAnon____source.setSrc(a2a);
		a2a__mAnon____source.setTrg(mAnon);
		ruleresult.getCreatedEdges().add(a2a__mAnon____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uType__feature____nestedClassifier.setName(uType__feature____nestedClassifier_name_prime);
		a2a__feature____target.setName(a2a__feature____target_name_prime);
		mMember__mAnon____anonymousClassDeclaration.setName(mMember__mAnon____anonymousClassDeclaration_name_prime);
		a2a__mAnon____source.setName(a2a__mAnon____source_name_prime);
		return new Object[] { ruleresult, a2a, feature, mAnon, uType, mMember, uType__feature____nestedClassifier,
				a2a__feature____target, mMember__mAnon____anonymousClassDeclaration, a2a__mAnon____source };
	}

	public static final void pattern_AnonymousClass4EnumConstInType_1_5_registerobjects_expressionBBBBBBBBBBBB(
			AnonymousClass4EnumConstInType _this, PerformRuleResult ruleresult, EObject a2a, EObject feature,
			EObject mAnon, EObject uType, EObject uContainer, EObject jType, EObject mMember, EObject jContainer,
			EObject ne2ne, EObject p2p) {
		_this.registerObjects_FWD(ruleresult, a2a, feature, mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne,
				p2p);

	}

	public static final PerformRuleResult pattern_AnonymousClass4EnumConstInType_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_bindingFB(
			AnonymousClass4EnumConstInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClass4EnumConstInType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClass4EnumConstInType _this) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_binding = pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_black = pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClass4EnumConstInType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("mAnon");
		EObject _localVariable_1 = match.getObject("jType");
		EObject _localVariable_2 = match.getObject("mMember");
		EObject _localVariable_3 = match.getObject("jContainer");
		EObject tmpMAnon = _localVariable_0;
		EObject tmpJType = _localVariable_1;
		EObject tmpMMember = _localVariable_2;
		EObject tmpJContainer = _localVariable_3;
		if (tmpMAnon instanceof AnonymousClassDeclaration) {
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
			if (tmpJType instanceof AbstractTypeDeclaration) {
				AbstractTypeDeclaration jType = (AbstractTypeDeclaration) tmpJType;
				if (tmpMMember instanceof EnumConstantDeclaration) {
					EnumConstantDeclaration mMember = (EnumConstantDeclaration) tmpMMember;
					if (tmpJContainer instanceof EnumDeclaration) {
						EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
						return new Object[] { mAnon, jType, mMember, jContainer, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4EnumConstInType_2_2_corematch_blackBFFBBBFFB(
			AnonymousClassDeclaration mAnon, AbstractTypeDeclaration jType, EnumConstantDeclaration mMember,
			EnumDeclaration jContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jContainer.equals(jType)) {
			for (ASTNode2Element p2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jType,
					ASTNode2Element.class, "source")) {
				Element tmpUType = p2p.getTarget();
				if (tmpUType instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) tmpUType;
					for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(jContainer, ASTNode2Element.class, "source")) {
						if (!ne2ne.equals(p2p)) {
							Element tmpUContainer = ne2ne.getTarget();
							if (tmpUContainer instanceof Enumeration) {
								Enumeration uContainer = (Enumeration) tmpUContainer;
								_result.add(new Object[] { mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne,
										p2p, match });
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4EnumConstInType_2_3_findcontext_blackBBBBBBBB(
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uType, Enumeration uContainer,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, ASTNode2Element p2p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jContainer.equals(jType)) {
			if (!ne2ne.equals(p2p)) {
				if (uType.equals(uContainer.getOwner())) {
					if (jType.equals(p2p.getSource())) {
						if (jType.getBodyDeclarations().contains(jContainer)) {
							if (jContainer.equals(ne2ne.getSource())) {
								if (mAnon.equals(mMember.getAnonymousClassDeclaration())) {
									if (uType.equals(p2p.getTarget())) {
										if (uContainer.equals(ne2ne.getTarget())) {
											if (jContainer.getEnumConstants().contains(mMember)) {
												_result.add(new Object[] { mAnon, uType, uContainer, jType, mMember,
														jContainer, ne2ne, p2p });
											}
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

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uType, Enumeration uContainer,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, ASTNode2Element p2p) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge uContainer__uType____owner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uType__uContainer____ownedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__jContainer____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__jType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__mMember____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uContainer__uType____owner_name_prime = "owner";
		String uType__uContainer____ownedElement_name_prime = "ownedElement";
		String p2p__jType____source_name_prime = "source";
		String jType__jContainer____bodyDeclarations_name_prime = "bodyDeclarations";
		String jContainer__jType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String ne2ne__jContainer____source_name_prime = "source";
		String mMember__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String p2p__uType____target_name_prime = "target";
		String ne2ne__uContainer____target_name_prime = "target";
		String jContainer__mMember____enumConstants_name_prime = "enumConstants";
		isApplicableMatch.getAllContextElements().add(mAnon);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(p2p);
		uContainer__uType____owner.setSrc(uContainer);
		uContainer__uType____owner.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(uContainer__uType____owner);
		uType__uContainer____ownedElement.setSrc(uType);
		uType__uContainer____ownedElement.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(uType__uContainer____ownedElement);
		p2p__jType____source.setSrc(p2p);
		p2p__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(p2p__jType____source);
		jType__jContainer____bodyDeclarations.setSrc(jType);
		jType__jContainer____bodyDeclarations.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(jType__jContainer____bodyDeclarations);
		jContainer__jType____abstractTypeDeclaration.setSrc(jContainer);
		jContainer__jType____abstractTypeDeclaration.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(jContainer__jType____abstractTypeDeclaration);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		mMember__mAnon____anonymousClassDeclaration.setSrc(mMember);
		mMember__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		isApplicableMatch.getAllContextElements().add(mMember__mAnon____anonymousClassDeclaration);
		p2p__uType____target.setSrc(p2p);
		p2p__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(p2p__uType____target);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		jContainer__mMember____enumConstants.setSrc(jContainer);
		jContainer__mMember____enumConstants.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(jContainer__mMember____enumConstants);
		uContainer__uType____owner.setName(uContainer__uType____owner_name_prime);
		uType__uContainer____ownedElement.setName(uType__uContainer____ownedElement_name_prime);
		p2p__jType____source.setName(p2p__jType____source_name_prime);
		jType__jContainer____bodyDeclarations.setName(jType__jContainer____bodyDeclarations_name_prime);
		jContainer__jType____abstractTypeDeclaration.setName(jContainer__jType____abstractTypeDeclaration_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		mMember__mAnon____anonymousClassDeclaration.setName(mMember__mAnon____anonymousClassDeclaration_name_prime);
		p2p__uType____target.setName(p2p__uType____target_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		jContainer__mMember____enumConstants.setName(jContainer__mMember____enumConstants_name_prime);
		return new Object[] { mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p, isApplicableMatch,
				uContainer__uType____owner, uType__uContainer____ownedElement, p2p__jType____source,
				jType__jContainer____bodyDeclarations, jContainer__jType____abstractTypeDeclaration,
				ne2ne__jContainer____source, mMember__mAnon____anonymousClassDeclaration, p2p__uType____target,
				ne2ne__uContainer____target, jContainer__mMember____enumConstants };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_bindingFBBBBBBBBBB(
			AnonymousClass4EnumConstInType _this, IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnon,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element p2p) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, mAnon, uType, uContainer, jType,
				mMember, jContainer, ne2ne, p2p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, mAnon, uType, uContainer, jType, mMember, jContainer,
					ne2ne, p2p };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnonymousClass4EnumConstInType _this, IsApplicableMatch isApplicableMatch, AnonymousClassDeclaration mAnon,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element p2p) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_binding = pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p);
		if (result_pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_black = pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass4EnumConstInType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, mAnon, uType, uContainer, jType, mMember,
						jContainer, ne2ne, p2p };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_2_5_checkCSP_expressionFBB(
			AnonymousClass4EnumConstInType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClass4EnumConstInType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass4EnumConstInType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_10_1_initialbindings_blackBBBBB(
			AnonymousClass4EnumConstInType _this, Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {
		if (!feature.equals(uType)) {
			return new Object[] { _this, match, feature, uType, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_bindingFBBBBB(
			AnonymousClass4EnumConstInType _this, Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, feature, uType, uContainer);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, feature, uType, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_bindingAndBlackFBBBBB(
			AnonymousClass4EnumConstInType _this, Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_binding = pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_bindingFBBBBB(
				_this, match, feature, uType, uContainer);
		if (result_pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_black = pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass4EnumConstInType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, feature, uType, uContainer };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_10_3_CheckCSP_expressionFBB(
			AnonymousClass4EnumConstInType _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_10_4_collectelementstobetranslated_blackBBBB(
			Match match, org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {
		if (!feature.equals(uType)) {
			return new Object[] { match, feature, uType, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_10_4_collectelementstobetranslated_greenBBBF(
			Match match, org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType) {
		EMoflonEdge uType__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(feature);
		String uType__feature____nestedClassifier_name_prime = "nestedClassifier";
		uType__feature____nestedClassifier.setSrc(uType);
		uType__feature____nestedClassifier.setTrg(feature);
		match.getToBeTranslatedEdges().add(uType__feature____nestedClassifier);
		uType__feature____nestedClassifier.setName(uType__feature____nestedClassifier_name_prime);
		return new Object[] { match, feature, uType, uType__feature____nestedClassifier };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_10_5_collectcontextelements_blackBBBB(
			Match match, org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {
		if (!feature.equals(uType)) {
			return new Object[] { match, feature, uType, uContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_10_5_collectcontextelements_greenBBBFF(
			Match match, org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {
		EMoflonEdge uContainer__uType____owner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uType__uContainer____ownedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(uType);
		match.getContextNodes().add(uContainer);
		String uContainer__uType____owner_name_prime = "owner";
		String uType__uContainer____ownedElement_name_prime = "ownedElement";
		uContainer__uType____owner.setSrc(uContainer);
		uContainer__uType____owner.setTrg(uType);
		match.getContextEdges().add(uContainer__uType____owner);
		uType__uContainer____ownedElement.setSrc(uType);
		uType__uContainer____ownedElement.setTrg(uContainer);
		match.getContextEdges().add(uType__uContainer____ownedElement);
		uContainer__uType____owner.setName(uContainer__uType____owner_name_prime);
		uType__uContainer____ownedElement.setName(uType__uContainer____ownedElement_name_prime);
		return new Object[] { match, uType, uContainer, uContainer__uType____owner, uType__uContainer____ownedElement };
	}

	public static final void pattern_AnonymousClass4EnumConstInType_10_6_registerobjectstomatch_expressionBBBBB(
			AnonymousClass4EnumConstInType _this, Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {
		_this.registerObjectsToMatch_BWD(match, feature, uType, uContainer);

	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("feature");
		EObject _localVariable_1 = isApplicableMatch.getObject("uType");
		EObject _localVariable_2 = isApplicableMatch.getObject("uContainer");
		EObject _localVariable_3 = isApplicableMatch.getObject("jType");
		EObject _localVariable_4 = isApplicableMatch.getObject("mMember");
		EObject _localVariable_5 = isApplicableMatch.getObject("jContainer");
		EObject _localVariable_6 = isApplicableMatch.getObject("ne2ne");
		EObject _localVariable_7 = isApplicableMatch.getObject("p2p");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpUContainer = _localVariable_2;
		EObject tmpJType = _localVariable_3;
		EObject tmpMMember = _localVariable_4;
		EObject tmpJContainer = _localVariable_5;
		EObject tmpNe2ne = _localVariable_6;
		EObject tmpP2p = _localVariable_7;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpUType instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) tmpUType;
				if (tmpUContainer instanceof Enumeration) {
					Enumeration uContainer = (Enumeration) tmpUContainer;
					if (tmpJType instanceof AbstractTypeDeclaration) {
						AbstractTypeDeclaration jType = (AbstractTypeDeclaration) tmpJType;
						if (tmpMMember instanceof EnumConstantDeclaration) {
							EnumConstantDeclaration mMember = (EnumConstantDeclaration) tmpMMember;
							if (tmpJContainer instanceof EnumDeclaration) {
								EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
								if (tmpNe2ne instanceof ASTNode2Element) {
									ASTNode2Element ne2ne = (ASTNode2Element) tmpNe2ne;
									if (tmpP2p instanceof ASTNode2Element) {
										ASTNode2Element p2p = (ASTNode2Element) tmpP2p;
										return new Object[] { feature, uType, uContainer, jType, mMember, jContainer,
												ne2ne, p2p, isApplicableMatch };
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

	public static final Object[] pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_blackBBBBBBBBFBB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType, Enumeration uContainer,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, ASTNode2Element p2p, AnonymousClass4EnumConstInType _this,
			IsApplicableMatch isApplicableMatch) {
		if (!feature.equals(uType)) {
			if (!jContainer.equals(jType)) {
				if (!ne2ne.equals(p2p)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { feature, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p,
									csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			AnonymousClass4EnumConstInType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_binding = pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_binding[0];
			org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_binding[1];
			Enumeration uContainer = (Enumeration) result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_binding[2];
			AbstractTypeDeclaration jType = (AbstractTypeDeclaration) result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_binding[3];
			EnumConstantDeclaration mMember = (EnumConstantDeclaration) result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_binding[4];
			EnumDeclaration jContainer = (EnumDeclaration) result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_binding[5];
			ASTNode2Element ne2ne = (ASTNode2Element) result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_binding[6];
			ASTNode2Element p2p = (ASTNode2Element) result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_binding[7];

			Object[] result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_black = pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_blackBBBBBBBBFBB(
					feature, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p, _this, isApplicableMatch);
			if (result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_black[8];

				return new Object[] { feature, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_11_1_performtransformation_greenFBFB(
			org.eclipse.uml2.uml.Class feature, EnumConstantDeclaration mMember) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		AnonymousClassDeclaration mAnon = JavaFactory.eINSTANCE.createAnonymousClassDeclaration();
		a2a.setTarget(feature);
		mMember.setAnonymousClassDeclaration(mAnon);
		a2a.setSource(mAnon);
		return new Object[] { a2a, feature, mAnon, mMember };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_11_2_collecttranslatedelements_blackBBB(
			ASTNode2Element a2a, org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon) {
		return new Object[] { a2a, feature, mAnon };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_11_2_collecttranslatedelements_greenFBBB(
			ASTNode2Element a2a, org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(a2a);
		ruleresult.getTranslatedElements().add(feature);
		ruleresult.getCreatedElements().add(mAnon);
		return new Object[] { ruleresult, a2a, feature, mAnon };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_11_3_bookkeepingforedges_blackBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject a2a, EObject feature, EObject mAnon, EObject uType,
			EObject uContainer, EObject jType, EObject mMember, EObject jContainer, EObject ne2ne, EObject p2p) {
		if (!a2a.equals(feature)) {
			if (!a2a.equals(mAnon)) {
				if (!a2a.equals(uType)) {
					if (!a2a.equals(uContainer)) {
						if (!a2a.equals(jType)) {
							if (!a2a.equals(mMember)) {
								if (!a2a.equals(jContainer)) {
									if (!a2a.equals(ne2ne)) {
										if (!a2a.equals(p2p)) {
											if (!feature.equals(mAnon)) {
												if (!feature.equals(uType)) {
													if (!feature.equals(uContainer)) {
														if (!feature.equals(jType)) {
															if (!feature.equals(mMember)) {
																if (!feature.equals(jContainer)) {
																	if (!feature.equals(ne2ne)) {
																		if (!feature.equals(p2p)) {
																			if (!mAnon.equals(uType)) {
																				if (!mAnon.equals(uContainer)) {
																					if (!mAnon.equals(mMember)) {
																						if (!mAnon.equals(ne2ne)) {
																							if (!mAnon.equals(p2p)) {
																								if (!uContainer.equals(
																										uType)) {
																									if (!jType.equals(
																											mAnon)) {
																										if (!jType
																												.equals(uType)) {
																											if (!jType
																													.equals(uContainer)) {
																												if (!jType
																														.equals(mMember)) {
																													if (!jType
																															.equals(ne2ne)) {
																														if (!jType
																																.equals(p2p)) {
																															if (!mMember
																																	.equals(uType)) {
																																if (!mMember
																																		.equals(uContainer)) {
																																	if (!mMember
																																			.equals(ne2ne)) {
																																		if (!mMember
																																				.equals(p2p)) {
																																			if (!jContainer
																																					.equals(mAnon)) {
																																				if (!jContainer
																																						.equals(uType)) {
																																					if (!jContainer
																																							.equals(uContainer)) {
																																						if (!jContainer
																																								.equals(jType)) {
																																							if (!jContainer
																																									.equals(mMember)) {
																																								if (!jContainer
																																										.equals(ne2ne)) {
																																									if (!jContainer
																																											.equals(p2p)) {
																																										if (!ne2ne
																																												.equals(uType)) {
																																											if (!ne2ne
																																													.equals(uContainer)) {
																																												if (!ne2ne
																																														.equals(p2p)) {
																																													if (!p2p.equals(
																																															uType)) {
																																														if (!p2p.equals(
																																																uContainer)) {
																																															return new Object[] {
																																																	ruleresult,
																																																	a2a,
																																																	feature,
																																																	mAnon,
																																																	uType,
																																																	uContainer,
																																																	jType,
																																																	mMember,
																																																	jContainer,
																																																	ne2ne,
																																																	p2p };
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_AnonymousClass4EnumConstInType_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject a2a, EObject feature, EObject mAnon, EObject uType, EObject mMember) {
		EMoflonEdge uType__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2a__feature____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge mMember__mAnon____anonymousClassDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge a2a__mAnon____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "AnonymousClass4EnumConstInType";
		String uType__feature____nestedClassifier_name_prime = "nestedClassifier";
		String a2a__feature____target_name_prime = "target";
		String mMember__mAnon____anonymousClassDeclaration_name_prime = "anonymousClassDeclaration";
		String a2a__mAnon____source_name_prime = "source";
		uType__feature____nestedClassifier.setSrc(uType);
		uType__feature____nestedClassifier.setTrg(feature);
		ruleresult.getTranslatedEdges().add(uType__feature____nestedClassifier);
		a2a__feature____target.setSrc(a2a);
		a2a__feature____target.setTrg(feature);
		ruleresult.getCreatedEdges().add(a2a__feature____target);
		mMember__mAnon____anonymousClassDeclaration.setSrc(mMember);
		mMember__mAnon____anonymousClassDeclaration.setTrg(mAnon);
		ruleresult.getCreatedEdges().add(mMember__mAnon____anonymousClassDeclaration);
		a2a__mAnon____source.setSrc(a2a);
		a2a__mAnon____source.setTrg(mAnon);
		ruleresult.getCreatedEdges().add(a2a__mAnon____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		uType__feature____nestedClassifier.setName(uType__feature____nestedClassifier_name_prime);
		a2a__feature____target.setName(a2a__feature____target_name_prime);
		mMember__mAnon____anonymousClassDeclaration.setName(mMember__mAnon____anonymousClassDeclaration_name_prime);
		a2a__mAnon____source.setName(a2a__mAnon____source_name_prime);
		return new Object[] { ruleresult, a2a, feature, mAnon, uType, mMember, uType__feature____nestedClassifier,
				a2a__feature____target, mMember__mAnon____anonymousClassDeclaration, a2a__mAnon____source };
	}

	public static final void pattern_AnonymousClass4EnumConstInType_11_5_registerobjects_expressionBBBBBBBBBBBB(
			AnonymousClass4EnumConstInType _this, PerformRuleResult ruleresult, EObject a2a, EObject feature,
			EObject mAnon, EObject uType, EObject uContainer, EObject jType, EObject mMember, EObject jContainer,
			EObject ne2ne, EObject p2p) {
		_this.registerObjects_BWD(ruleresult, a2a, feature, mAnon, uType, uContainer, jType, mMember, jContainer, ne2ne,
				p2p);

	}

	public static final PerformRuleResult pattern_AnonymousClass4EnumConstInType_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_bindingFB(
			AnonymousClass4EnumConstInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_blackFBB(EClass eClass,
			AnonymousClass4EnumConstInType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_bindingAndBlackFFB(
			AnonymousClass4EnumConstInType _this) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_binding = pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_black = pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "AnonymousClass4EnumConstInType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("feature");
		EObject _localVariable_1 = match.getObject("uType");
		EObject _localVariable_2 = match.getObject("uContainer");
		EObject tmpFeature = _localVariable_0;
		EObject tmpUType = _localVariable_1;
		EObject tmpUContainer = _localVariable_2;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpUType instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) tmpUType;
				if (tmpUContainer instanceof Enumeration) {
					Enumeration uContainer = (Enumeration) tmpUContainer;
					return new Object[] { feature, uType, uContainer, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4EnumConstInType_12_2_corematch_blackBBBFFFFB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType, Enumeration uContainer, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uType)) {
			for (ASTNode2Element p2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(uType,
					ASTNode2Element.class, "target")) {
				ASTNode tmpJType = p2p.getSource();
				if (tmpJType instanceof AbstractTypeDeclaration) {
					AbstractTypeDeclaration jType = (AbstractTypeDeclaration) tmpJType;
					for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(uContainer, ASTNode2Element.class, "target")) {
						if (!ne2ne.equals(p2p)) {
							ASTNode tmpJContainer = ne2ne.getSource();
							if (tmpJContainer instanceof EnumDeclaration) {
								EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
								if (!jContainer.equals(jType)) {
									_result.add(new Object[] { feature, uType, uContainer, jType, jContainer, ne2ne,
											p2p, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4EnumConstInType_12_3_findcontext_blackBBBBFBBB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType, Enumeration uContainer,
			AbstractTypeDeclaration jType, EnumDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element p2p) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!feature.equals(uType)) {
			if (!jContainer.equals(jType)) {
				if (!ne2ne.equals(p2p)) {
					if (uType.getNestedClassifiers().contains(feature)) {
						if (uType.equals(uContainer.getOwner())) {
							if (jType.equals(p2p.getSource())) {
								if (jType.getBodyDeclarations().contains(jContainer)) {
									if (jContainer.equals(ne2ne.getSource())) {
										if (uType.equals(p2p.getTarget())) {
											if (uContainer.equals(ne2ne.getTarget())) {
												for (EnumConstantDeclaration mMember : jContainer.getEnumConstants()) {
													_result.add(new Object[] { feature, uType, uContainer, jType,
															mMember, jContainer, ne2ne, p2p });
												}
											}
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

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType, Enumeration uContainer,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, ASTNode2Element p2p) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge uType__feature____nestedClassifier = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uContainer__uType____owner = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge uType__uContainer____ownedElement = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__jContainer____bodyDeclarations = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__jType____abstractTypeDeclaration = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__jContainer____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge p2p__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne__uContainer____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jContainer__mMember____enumConstants = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String uType__feature____nestedClassifier_name_prime = "nestedClassifier";
		String uContainer__uType____owner_name_prime = "owner";
		String uType__uContainer____ownedElement_name_prime = "ownedElement";
		String p2p__jType____source_name_prime = "source";
		String jType__jContainer____bodyDeclarations_name_prime = "bodyDeclarations";
		String jContainer__jType____abstractTypeDeclaration_name_prime = "abstractTypeDeclaration";
		String ne2ne__jContainer____source_name_prime = "source";
		String p2p__uType____target_name_prime = "target";
		String ne2ne__uContainer____target_name_prime = "target";
		String jContainer__mMember____enumConstants_name_prime = "enumConstants";
		isApplicableMatch.getAllContextElements().add(feature);
		isApplicableMatch.getAllContextElements().add(uType);
		isApplicableMatch.getAllContextElements().add(uContainer);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(mMember);
		isApplicableMatch.getAllContextElements().add(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne);
		isApplicableMatch.getAllContextElements().add(p2p);
		uType__feature____nestedClassifier.setSrc(uType);
		uType__feature____nestedClassifier.setTrg(feature);
		isApplicableMatch.getAllContextElements().add(uType__feature____nestedClassifier);
		uContainer__uType____owner.setSrc(uContainer);
		uContainer__uType____owner.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(uContainer__uType____owner);
		uType__uContainer____ownedElement.setSrc(uType);
		uType__uContainer____ownedElement.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(uType__uContainer____ownedElement);
		p2p__jType____source.setSrc(p2p);
		p2p__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(p2p__jType____source);
		jType__jContainer____bodyDeclarations.setSrc(jType);
		jType__jContainer____bodyDeclarations.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(jType__jContainer____bodyDeclarations);
		jContainer__jType____abstractTypeDeclaration.setSrc(jContainer);
		jContainer__jType____abstractTypeDeclaration.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(jContainer__jType____abstractTypeDeclaration);
		ne2ne__jContainer____source.setSrc(ne2ne);
		ne2ne__jContainer____source.setTrg(jContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__jContainer____source);
		p2p__uType____target.setSrc(p2p);
		p2p__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(p2p__uType____target);
		ne2ne__uContainer____target.setSrc(ne2ne);
		ne2ne__uContainer____target.setTrg(uContainer);
		isApplicableMatch.getAllContextElements().add(ne2ne__uContainer____target);
		jContainer__mMember____enumConstants.setSrc(jContainer);
		jContainer__mMember____enumConstants.setTrg(mMember);
		isApplicableMatch.getAllContextElements().add(jContainer__mMember____enumConstants);
		uType__feature____nestedClassifier.setName(uType__feature____nestedClassifier_name_prime);
		uContainer__uType____owner.setName(uContainer__uType____owner_name_prime);
		uType__uContainer____ownedElement.setName(uType__uContainer____ownedElement_name_prime);
		p2p__jType____source.setName(p2p__jType____source_name_prime);
		jType__jContainer____bodyDeclarations.setName(jType__jContainer____bodyDeclarations_name_prime);
		jContainer__jType____abstractTypeDeclaration.setName(jContainer__jType____abstractTypeDeclaration_name_prime);
		ne2ne__jContainer____source.setName(ne2ne__jContainer____source_name_prime);
		p2p__uType____target.setName(p2p__uType____target_name_prime);
		ne2ne__uContainer____target.setName(ne2ne__uContainer____target_name_prime);
		jContainer__mMember____enumConstants.setName(jContainer__mMember____enumConstants_name_prime);
		return new Object[] { feature, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p, isApplicableMatch,
				uType__feature____nestedClassifier, uContainer__uType____owner, uType__uContainer____ownedElement,
				p2p__jType____source, jType__jContainer____bodyDeclarations,
				jContainer__jType____abstractTypeDeclaration, ne2ne__jContainer____source, p2p__uType____target,
				ne2ne__uContainer____target, jContainer__mMember____enumConstants };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_bindingFBBBBBBBBBB(
			AnonymousClass4EnumConstInType _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType, Enumeration uContainer,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, ASTNode2Element p2p) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, feature, uType, uContainer, jType,
				mMember, jContainer, ne2ne, p2p);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, feature, uType, uContainer, jType, mMember, jContainer,
					ne2ne, p2p };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnonymousClass4EnumConstInType _this, IsApplicableMatch isApplicableMatch,
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType, Enumeration uContainer,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer,
			ASTNode2Element ne2ne, ASTNode2Element p2p) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_binding = pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, feature, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p);
		if (result_pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_black = pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass4EnumConstInType_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, feature, uType, uContainer, jType, mMember,
						jContainer, ne2ne, p2p };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_12_5_checkCSP_expressionFBB(
			AnonymousClass4EnumConstInType _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "AnonymousClass4EnumConstInType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass4EnumConstInType_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_bindingFB(
			AnonymousClass4EnumConstInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnonymousClass4EnumConstInType _this) {
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

	public static final Object[] pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClass4EnumConstInType _this) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_binding = pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_black = pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4EnumConstInType_20_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_nestedClassifier) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpUType = _edge_nestedClassifier.getSrc();
		if (tmpUType instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) tmpUType;
			EObject tmpFeature = _edge_nestedClassifier.getTrg();
			if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
				org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
				if (!feature.equals(uType)) {
					if (uType.getNestedClassifiers().contains(feature)) {
						for (Element tmpUContainer : uType.getOwnedElements()) {
							if (tmpUContainer instanceof Enumeration) {
								Enumeration uContainer = (Enumeration) tmpUContainer;
								_result.add(new Object[] { feature, uType, uContainer, _edge_nestedClassifier });
							}
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			AnonymousClass4EnumConstInType _this, Match match, org.eclipse.uml2.uml.Class feature,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, feature, uType, uContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClass4EnumConstInType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClass4EnumConstInType_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_bindingFB(
			AnonymousClass4EnumConstInType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, AnonymousClass4EnumConstInType _this) {
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

	public static final Object[] pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_bindingAndBlackFFBF(
			AnonymousClass4EnumConstInType _this) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_binding = pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_black = pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_21_2_testcorematchandDECs_black_nac_0B(
			AnonymousClassDeclaration mAnon) {
		ClassInstanceCreation __DEC_mAnon_anonymousClassDeclaration_548095 = mAnon.getClassInstanceCreation();
		if (__DEC_mAnon_anonymousClassDeclaration_548095 != null) {
			return new Object[] { mAnon };
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4EnumConstInType_21_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_anonymousClassDeclaration) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpMMember = _edge_anonymousClassDeclaration.getSrc();
		if (tmpMMember instanceof EnumConstantDeclaration) {
			EnumConstantDeclaration mMember = (EnumConstantDeclaration) tmpMMember;
			EObject tmpMAnon = _edge_anonymousClassDeclaration.getTrg();
			if (tmpMAnon instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
				if (mAnon.equals(mMember.getAnonymousClassDeclaration())) {
					if (pattern_AnonymousClass4EnumConstInType_21_2_testcorematchandDECs_black_nac_0B(mAnon) == null) {
						for (EnumDeclaration jContainer : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(mMember, EnumDeclaration.class, "enumConstants")) {
							AbstractTypeDeclaration jType = jContainer.getAbstractTypeDeclaration();
							if (jType != null) {
								if (!jContainer.equals(jType)) {
									_result.add(new Object[] { mAnon, jType, mMember, jContainer,
											_edge_anonymousClassDeclaration });
								}
							}

						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			AnonymousClass4EnumConstInType _this, Match match, AnonymousClassDeclaration mAnon,
			AbstractTypeDeclaration jType, EnumConstantDeclaration mMember, EnumDeclaration jContainer) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, mAnon, jType, mMember, jContainer);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			AnonymousClass4EnumConstInType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_AnonymousClass4EnumConstInType_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_1_prepare_blackB(
			AnonymousClass4EnumConstInType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("feature");
		EObject _localVariable_1 = sourceMatch.getObject("mAnon");
		EObject _localVariable_2 = targetMatch.getObject("uType");
		EObject _localVariable_3 = targetMatch.getObject("uContainer");
		EObject _localVariable_4 = sourceMatch.getObject("jType");
		EObject _localVariable_5 = sourceMatch.getObject("mMember");
		EObject _localVariable_6 = sourceMatch.getObject("jContainer");
		EObject tmpFeature = _localVariable_0;
		EObject tmpMAnon = _localVariable_1;
		EObject tmpUType = _localVariable_2;
		EObject tmpUContainer = _localVariable_3;
		EObject tmpJType = _localVariable_4;
		EObject tmpMMember = _localVariable_5;
		EObject tmpJContainer = _localVariable_6;
		if (tmpFeature instanceof org.eclipse.uml2.uml.Class) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) tmpFeature;
			if (tmpMAnon instanceof AnonymousClassDeclaration) {
				AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) tmpMAnon;
				if (tmpUType instanceof org.eclipse.uml2.uml.Class) {
					org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) tmpUType;
					if (tmpUContainer instanceof Enumeration) {
						Enumeration uContainer = (Enumeration) tmpUContainer;
						if (tmpJType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration jType = (AbstractTypeDeclaration) tmpJType;
							if (tmpMMember instanceof EnumConstantDeclaration) {
								EnumConstantDeclaration mMember = (EnumConstantDeclaration) tmpMMember;
								if (tmpJContainer instanceof EnumDeclaration) {
									EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
									return new Object[] { feature, mAnon, uType, uContainer, jType, mMember, jContainer,
											targetMatch, sourceMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_blackBBBBBBBBB(
			org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uType,
			Enumeration uContainer, AbstractTypeDeclaration jType, EnumConstantDeclaration mMember,
			EnumDeclaration jContainer, Match sourceMatch, Match targetMatch) {
		if (!feature.equals(uType)) {
			if (!jContainer.equals(jType)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { feature, mAnon, uType, uContainer, jType, mMember, jContainer, sourceMatch,
							targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_binding = pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_bindingFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_binding != null) {
			org.eclipse.uml2.uml.Class feature = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_binding[0];
			AnonymousClassDeclaration mAnon = (AnonymousClassDeclaration) result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_binding[1];
			org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_binding[2];
			Enumeration uContainer = (Enumeration) result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_binding[3];
			AbstractTypeDeclaration jType = (AbstractTypeDeclaration) result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_binding[4];
			EnumConstantDeclaration mMember = (EnumConstantDeclaration) result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_binding[5];
			EnumDeclaration jContainer = (EnumDeclaration) result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_binding[6];

			Object[] result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_black = pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_blackBBBBBBBBB(
					feature, mAnon, uType, uContainer, jType, mMember, jContainer, sourceMatch, targetMatch);
			if (result_pattern_AnonymousClass4EnumConstInType_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { feature, mAnon, uType, uContainer, jType, mMember, jContainer, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_bindingFBBBBBBBBBB(
			AnonymousClass4EnumConstInType _this, org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_7 = _this.isApplicable_solveCsp_CC(feature, mAnon, uType, uContainer, jType, mMember,
				jContainer, sourceMatch, targetMatch);
		CSP csp = _localVariable_7;
		if (csp != null) {
			return new Object[] { csp, _this, feature, mAnon, uType, uContainer, jType, mMember, jContainer,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_bindingAndBlackFBBBBBBBBBB(
			AnonymousClass4EnumConstInType _this, org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon,
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_binding = pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_bindingFBBBBBBBBBB(
				_this, feature, mAnon, uType, uContainer, jType, mMember, jContainer, sourceMatch, targetMatch);
		if (result_pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_binding[0];

			Object[] result_pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_black = pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_AnonymousClass4EnumConstInType_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, feature, mAnon, uType, uContainer, jType, mMember, jContainer,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4EnumConstInType_24_5_matchcorrcontext_blackBBBBFFBB(
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer, AbstractTypeDeclaration jType,
			EnumDeclaration jContainer, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!jContainer.equals(jType)) {
			if (!sourceMatch.equals(targetMatch)) {
				for (ASTNode2Element p2p : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jType,
						ASTNode2Element.class, "source")) {
					if (uType.equals(p2p.getTarget())) {
						for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
								.getOppositeReferenceTyped(jContainer, ASTNode2Element.class, "source")) {
							if (!ne2ne.equals(p2p)) {
								if (uContainer.equals(ne2ne.getTarget())) {
									_result.add(new Object[] { uType, uContainer, jType, jContainer, ne2ne, p2p,
											sourceMatch, targetMatch });
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_5_matchcorrcontext_greenBBBBF(
			ASTNode2Element ne2ne, ASTNode2Element p2p, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "AnonymousClass4EnumConstInType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ne2ne);
		ccMatch.getAllContextElements().add(p2p);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ne2ne, p2p, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_6_createcorrespondence_blackBBBBBBBB(
			org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon, org.eclipse.uml2.uml.Class uType,
			Enumeration uContainer, AbstractTypeDeclaration jType, EnumConstantDeclaration mMember,
			EnumDeclaration jContainer, CCMatch ccMatch) {
		if (!feature.equals(uType)) {
			if (!jContainer.equals(jType)) {
				return new Object[] { feature, mAnon, uType, uContainer, jType, mMember, jContainer, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_6_createcorrespondence_greenFBBB(
			org.eclipse.uml2.uml.Class feature, AnonymousClassDeclaration mAnon, CCMatch ccMatch) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		a2a.setTarget(feature);
		a2a.setSource(mAnon);
		ccMatch.getCreateCorr().add(a2a);
		return new Object[] { a2a, feature, mAnon, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "AnonymousClass4EnumConstInType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_AnonymousClass4EnumConstInType_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_27_1_matchtggpattern_black_nac_0B(
			AnonymousClassDeclaration mAnon) {
		ClassInstanceCreation __DEC_mAnon_anonymousClassDeclaration_216467 = mAnon.getClassInstanceCreation();
		if (__DEC_mAnon_anonymousClassDeclaration_216467 != null) {
			return new Object[] { mAnon };
		}

		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_27_1_matchtggpattern_blackBBBB(
			AnonymousClassDeclaration mAnon, AbstractTypeDeclaration jType, EnumConstantDeclaration mMember,
			EnumDeclaration jContainer) {
		if (!jContainer.equals(jType)) {
			if (jType.getBodyDeclarations().contains(jContainer)) {
				if (mAnon.equals(mMember.getAnonymousClassDeclaration())) {
					if (jContainer.getEnumConstants().contains(mMember)) {
						if (pattern_AnonymousClass4EnumConstInType_27_1_matchtggpattern_black_nac_0B(mAnon) == null) {
							return new Object[] { mAnon, jType, mMember, jContainer };
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_28_1_matchtggpattern_blackBBB(
			org.eclipse.uml2.uml.Class feature, org.eclipse.uml2.uml.Class uType, Enumeration uContainer) {
		if (!feature.equals(uType)) {
			if (uType.getNestedClassifiers().contains(feature)) {
				if (uType.equals(uContainer.getOwner())) {
					return new Object[] { feature, uType, uContainer };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_1_createresult_blackB(
			AnonymousClass4EnumConstInType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Class uType) {
		if (ruleResult.getTargetObjects().contains(uType)) {
			return new Object[] { ruleResult, uType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element p2p) {
		if (ruleResult.getCorrObjects().contains(p2p)) {
			return new Object[] { ruleResult, p2p };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, AbstractTypeDeclaration jType) {
		if (ruleResult.getSourceObjects().contains(jType)) {
			return new Object[] { ruleResult, jType };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, EnumDeclaration jContainer) {
		if (ruleResult.getSourceObjects().contains(jContainer)) {
			return new Object[] { ruleResult, jContainer };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, EnumConstantDeclaration mMember) {
		if (ruleResult.getSourceObjects().contains(mMember)) {
			return new Object[] { ruleResult, mMember };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ne2ne) {
		if (ruleResult.getCorrObjects().contains(ne2ne)) {
			return new Object[] { ruleResult, ne2ne };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_6BB(
			ModelgeneratorRuleResult ruleResult, Enumeration uContainer) {
		if (ruleResult.getTargetObjects().contains(uContainer)) {
			return new Object[] { ruleResult, uContainer };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList p2pList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpP2p : p2pList.getEntryObjects()) {
				if (tmpP2p instanceof ASTNode2Element) {
					ASTNode2Element p2p = (ASTNode2Element) tmpP2p;
					Element tmpUType = p2p.getTarget();
					if (tmpUType instanceof org.eclipse.uml2.uml.Class) {
						org.eclipse.uml2.uml.Class uType = (org.eclipse.uml2.uml.Class) tmpUType;
						ASTNode tmpJType = p2p.getSource();
						if (tmpJType instanceof AbstractTypeDeclaration) {
							AbstractTypeDeclaration jType = (AbstractTypeDeclaration) tmpJType;
							if (pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_1BB(ruleResult,
									p2p) == null) {
								if (pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_0BB(
										ruleResult, uType) == null) {
									if (pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, jType) == null) {
										for (Element tmpUContainer : uType.getOwnedElements()) {
											if (tmpUContainer instanceof Enumeration) {
												Enumeration uContainer = (Enumeration) tmpUContainer;
												if (pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_6BB(
														ruleResult, uContainer) == null) {
													for (BodyDeclaration tmpJContainer : jType.getBodyDeclarations()) {
														if (tmpJContainer instanceof EnumDeclaration) {
															EnumDeclaration jContainer = (EnumDeclaration) tmpJContainer;
															if (!jContainer.equals(jType)) {
																if (pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_3BB(
																		ruleResult, jContainer) == null) {
																	for (EnumConstantDeclaration mMember : jContainer
																			.getEnumConstants()) {
																		if (pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_4BB(
																				ruleResult, mMember) == null) {
																			for (ASTNode2Element ne2ne : org.moflon.core.utilities.eMoflonEMFUtil
																					.getOppositeReferenceTyped(
																							uContainer,
																							ASTNode2Element.class,
																							"target")) {
																				if (!ne2ne.equals(p2p)) {
																					if (jContainer.equals(
																							ne2ne.getSource())) {
																						if (pattern_AnonymousClass4EnumConstInType_29_2_isapplicablecore_black_nac_5BB(
																								ruleResult,
																								ne2ne) == null) {
																							_result.add(new Object[] {
																									p2pList, uType, p2p,
																									jType, jContainer,
																									mMember, ne2ne,
																									uContainer,
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

				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_bindingFBBBBBBBBBB(
			AnonymousClass4EnumConstInType _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class uType,
			Enumeration uContainer, AbstractTypeDeclaration jType, EnumConstantDeclaration mMember,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element p2p,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, uType, uContainer, jType, mMember,
				jContainer, ne2ne, p2p, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, uType, uContainer, jType, mMember, jContainer, ne2ne,
					p2p, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_bindingAndBlackFBBBBBBBBBB(
			AnonymousClass4EnumConstInType _this, IsApplicableMatch isApplicableMatch, org.eclipse.uml2.uml.Class uType,
			Enumeration uContainer, AbstractTypeDeclaration jType, EnumConstantDeclaration mMember,
			EnumDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element p2p,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_binding = pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, uType, uContainer, jType, mMember, jContainer, ne2ne, p2p, ruleResult);
		if (result_pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_binding[0];

			Object[] result_pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_black = pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_AnonymousClass4EnumConstInType_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, uType, uContainer, jType, mMember, jContainer,
						ne2ne, p2p, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_AnonymousClass4EnumConstInType_29_4_checkCSP_expressionFBB(
			AnonymousClass4EnumConstInType _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_5_checknacs_blackBBBBBBB(
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element p2p) {
		if (!jContainer.equals(jType)) {
			if (!ne2ne.equals(p2p)) {
				return new Object[] { uType, uContainer, jType, mMember, jContainer, ne2ne, p2p };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_6_perform_blackBBBBBBBB(
			org.eclipse.uml2.uml.Class uType, Enumeration uContainer, AbstractTypeDeclaration jType,
			EnumConstantDeclaration mMember, EnumDeclaration jContainer, ASTNode2Element ne2ne, ASTNode2Element p2p,
			ModelgeneratorRuleResult ruleResult) {
		if (!jContainer.equals(jType)) {
			if (!ne2ne.equals(p2p)) {
				return new Object[] { uType, uContainer, jType, mMember, jContainer, ne2ne, p2p, ruleResult };
			}
		}
		return null;
	}

	public static final Object[] pattern_AnonymousClass4EnumConstInType_29_6_perform_greenFFFBBBB(
			org.eclipse.uml2.uml.Class uType, EnumConstantDeclaration mMember, ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		ASTNode2Element a2a = UmlFactory.eINSTANCE.createASTNode2Element();
		org.eclipse.uml2.uml.Class feature = UMLFactory.eINSTANCE.createClass();
		AnonymousClassDeclaration mAnon = JavaFactory.eINSTANCE.createAnonymousClassDeclaration();
		Object _localVariable_0 = csp.getValue("feature", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		ruleResult.getCorrObjects().add(a2a);
		uType.getNestedClassifiers().add(feature);
		a2a.setTarget(feature);
		ruleResult.getTargetObjects().add(feature);
		mMember.setAnonymousClassDeclaration(mAnon);
		a2a.setSource(mAnon);
		ruleResult.getSourceObjects().add(mAnon);
		String feature_name_prime = (String) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		feature.setName(feature_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { a2a, feature, mAnon, uType, mMember, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_AnonymousClass4EnumConstInType_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AnonymousClass4EnumConstInTypeImpl
