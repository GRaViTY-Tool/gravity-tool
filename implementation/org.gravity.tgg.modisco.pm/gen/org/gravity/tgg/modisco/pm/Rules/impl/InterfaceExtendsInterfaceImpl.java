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
import org.eclipse.modisco.java.InterfaceDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.Rules.InterfaceExtendsInterface;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TInterface;

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
 * An implementation of the model object '<em><b>Interface Extends Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InterfaceExtendsInterfaceImpl extends AbstractRuleImpl implements InterfaceExtendsInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceExtendsInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getInterfaceExtendsInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {

		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_0_1_initialbindings_blackBBBBB(this, match, eInterfaceDeclaration,
						eTypeAccess, eSuperInterface);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eSuperInterface] = " + eSuperInterface + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match,
						eInterfaceDeclaration, eTypeAccess, eSuperInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eSuperInterface] = " + eSuperInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_0_4_collectelementstobetranslated_blackBBBB(match,
							eInterfaceDeclaration, eTypeAccess, eSuperInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess
						+ ", " + "[eSuperInterface] = " + eSuperInterface + ".");
			}
			InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_0_4_collectelementstobetranslated_greenBBBBFFF(match,
							eInterfaceDeclaration, eTypeAccess, eSuperInterface);
			//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result4_green[6];

			Object[] result5_black = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_0_5_collectcontextelements_blackBBBB(match,
							eInterfaceDeclaration, eTypeAccess, eSuperInterface);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess
						+ ", " + "[eSuperInterface] = " + eSuperInterface + ".");
			}
			InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_0_5_collectcontextelements_greenBBB(match,
					eInterfaceDeclaration, eSuperInterface);

			// 
			InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_0_6_registerobjectstomatch_expressionBBBBB(
					this, match, eInterfaceDeclaration, eTypeAccess, eSuperInterface);
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_0_7_expressionF();
		} else {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result1_bindingAndBlack[0];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[1];
		TInterface tSuperInterface = (TInterface) result1_bindingAndBlack[2];
		TInterface tInterface = (TInterface) result1_bindingAndBlack[3];
		TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result1_bindingAndBlack[4];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result1_bindingAndBlack[5];
		TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_1_1_performtransformation_greenBB(tSuperInterface, tInterface);

		Object[] result2_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_1_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_1_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
						eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
						eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eTypeAccess] = "
					+ eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[tInterface] = "
					+ tInterface + ", " + "[eInterfaceDeclarationToTInterface] = " + eInterfaceDeclarationToTInterface
					+ ", " + "[eSuperInterface] = " + eSuperInterface + ", " + "[eSuperInterfaceToTSuperInterface] = "
					+ eSuperInterfaceToTSuperInterface + ".");
		}
		InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface, eSuperInterface);
		//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tInterface__tSuperInterface____parentInterfaces = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSuperInterface__tInterface____childInterfaces = (EMoflonEdge) result3_green[10];

		// 
		// 
		InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
				eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface);
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result2_binding[0];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[1];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_binding[2];
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_2_2_corematch_blackBBFFFBFB(eInterfaceDeclaration, eTypeAccess,
						eSuperInterface, match)) {
			TInterface tSuperInterface = (TInterface) result2_black[2];
			TInterface tInterface = (TInterface) result2_black[3];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result2_black[4];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_2_3_findcontext_blackBBBBBBB(eInterfaceDeclaration, eTypeAccess,
							tSuperInterface, tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
							eSuperInterfaceToTSuperInterface)) {
				Object[] result3_green = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_2_3_findcontext_greenBBBBBBBFFFFFFFF(eInterfaceDeclaration,
								eTypeAccess, tSuperInterface, tInterface, eInterfaceDeclarationToTInterface,
								eSuperInterface, eSuperInterfaceToTSuperInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge eInterfaceDeclarationToTInterface__tInterface____target = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = (EMoflonEdge) result3_green[14];

				Object[] result4_bindingAndBlack = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
								eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eInterfaceDeclaration] = "
							+ eInterfaceDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess + ", "
							+ "[tSuperInterface] = " + tSuperInterface + ", " + "[tInterface] = " + tInterface + ", "
							+ "[eInterfaceDeclarationToTInterface] = " + eInterfaceDeclarationToTInterface + ", "
							+ "[eSuperInterface] = " + eSuperInterface + ", " + "[eSuperInterfaceToTSuperInterface] = "
							+ eSuperInterfaceToTSuperInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = InterfaceExtendsInterfaceImpl
							.pattern_InterfaceExtendsInterface_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, InterfaceDeclaration eInterfaceDeclaration,
			TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {
		match.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eSuperInterface", eSuperInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, InterfaceDeclaration eInterfaceDeclaration,
			TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			TInterface tInterface, TypeToTAbstractType eInterfaceDeclarationToTInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eInterfaceDeclaration, EObject eTypeAccess,
			EObject tSuperInterface, EObject tInterface, EObject eInterfaceDeclarationToTInterface,
			EObject eSuperInterface, EObject eSuperInterfaceToTSuperInterface) {
		ruleresult.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("tSuperInterface", tSuperInterface);
		ruleresult.registerObject("tInterface", tInterface);
		ruleresult.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);
		ruleresult.registerObject("eSuperInterface", eSuperInterface);
		ruleresult.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eTypeAccess").eClass())
				.equals("java.TypeAccess.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TInterface tSuperInterface, TInterface tInterface) {

		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_10_1_initialbindings_blackBBBB(this, match, tSuperInterface,
						tInterface);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[tInterface] = "
					+ tInterface + ".");
		}

		Object[] result2_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, tSuperInterface,
						tInterface);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[tInterface] = "
					+ tInterface + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_10_4_collectelementstobetranslated_blackBBB(match,
							tSuperInterface, tInterface);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSuperInterface] = " + tSuperInterface + ", " + "[tInterface] = " + tInterface + ".");
			}
			InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_10_4_collectelementstobetranslated_greenBBBFF(match,
							tSuperInterface, tInterface);
			//nothing EMoflonEdge tInterface__tSuperInterface____parentInterfaces = (EMoflonEdge) result4_green[3];
			//nothing EMoflonEdge tSuperInterface__tInterface____childInterfaces = (EMoflonEdge) result4_green[4];

			Object[] result5_black = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_10_5_collectcontextelements_blackBBB(match, tSuperInterface,
							tInterface);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[tSuperInterface] = " + tSuperInterface + ", " + "[tInterface] = " + tInterface + ".");
			}
			InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_10_5_collectcontextelements_greenBBB(match,
					tSuperInterface, tInterface);

			// 
			InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_10_6_registerobjectstomatch_expressionBBBB(
					this, match, tSuperInterface, tInterface);
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_10_7_expressionF();
		} else {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result1_bindingAndBlack[0];
		TInterface tSuperInterface = (TInterface) result1_bindingAndBlack[1];
		TInterface tInterface = (TInterface) result1_bindingAndBlack[2];
		TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result1_bindingAndBlack[3];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result1_bindingAndBlack[4];
		TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result1_bindingAndBlack[5];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_11_1_performtransformation_greenBFB(eInterfaceDeclaration,
						eSuperInterface);
		TypeAccess eTypeAccess = (TypeAccess) result1_green[1];

		Object[] result2_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_11_2_collecttranslatedelements_blackB(eTypeAccess);
		if (result2_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess + ".");
		}
		Object[] result2_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_11_2_collecttranslatedelements_greenFB(eTypeAccess);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult,
						eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
						eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eTypeAccess] = "
					+ eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[tInterface] = "
					+ tInterface + ", " + "[eInterfaceDeclarationToTInterface] = " + eInterfaceDeclarationToTInterface
					+ ", " + "[eSuperInterface] = " + eSuperInterface + ", " + "[eSuperInterfaceToTSuperInterface] = "
					+ eSuperInterfaceToTSuperInterface + ".");
		}
		InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface, eSuperInterface);
		//nothing EMoflonEdge eTypeAccess__eSuperInterface____type = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge tInterface__tSuperInterface____parentInterfaces = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge tSuperInterface__tInterface____childInterfaces = (EMoflonEdge) result3_green[10];

		// 
		// 
		InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
				eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface);
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TInterface tSuperInterface = (TInterface) result2_binding[0];
		TInterface tInterface = (TInterface) result2_binding[1];
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_12_2_corematch_blackFBBFFFB(tSuperInterface, tInterface, match)) {
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result2_black[0];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result2_black[3];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[4];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[5];
			// ForEach 
			for (Object[] result3_black : InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_12_3_findcontext_blackBBBBBB(eInterfaceDeclaration,
							tSuperInterface, tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
							eSuperInterfaceToTSuperInterface)) {
				Object[] result3_green = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_12_3_findcontext_greenBBBBBBFFFFFFF(eInterfaceDeclaration,
								tSuperInterface, tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
								eSuperInterfaceToTSuperInterface);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge eInterfaceDeclarationToTInterface__tInterface____target = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge tInterface__tSuperInterface____parentInterfaces = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge tSuperInterface__tInterface____childInterfaces = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = (EMoflonEdge) result3_green[12];

				Object[] result4_bindingAndBlack = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, eInterfaceDeclaration, tSuperInterface, tInterface,
								eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eInterfaceDeclaration] = "
							+ eInterfaceDeclaration + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
							+ "[tInterface] = " + tInterface + ", " + "[eInterfaceDeclarationToTInterface] = "
							+ eInterfaceDeclarationToTInterface + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
							+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = InterfaceExtendsInterfaceImpl
							.pattern_InterfaceExtendsInterface_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, TInterface tSuperInterface, TInterface tInterface) {
		match.registerObject("tSuperInterface", tSuperInterface);
		match.registerObject("tInterface", tInterface);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TInterface tSuperInterface, TInterface tInterface) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject eInterfaceDeclaration, EObject eTypeAccess,
			EObject tSuperInterface, EObject tInterface, EObject eInterfaceDeclarationToTInterface,
			EObject eSuperInterface, EObject eSuperInterfaceToTSuperInterface) {
		ruleresult.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("tSuperInterface", tSuperInterface);
		ruleresult.registerObject("tInterface", tInterface);
		ruleresult.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);
		ruleresult.registerObject("eSuperInterface", eSuperInterface);
		ruleresult.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);

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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_16(EMoflonEdge _edge_parentInterfaces) {

		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_20_2_testcorematchandDECs_blackFFB(_edge_parentInterfaces)) {
			TInterface tSuperInterface = (TInterface) result2_black[0];
			TInterface tInterface = (TInterface) result2_black[1];
			Object[] result2_green = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, tSuperInterface, tInterface)) {
				// 
				if (InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InterfaceExtendsInterfaceImpl
							.pattern_InterfaceExtendsInterface_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_16(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result2_black[0];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[1];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[2];
			Object[] result2_green = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, eInterfaceDeclaration, eTypeAccess, eSuperInterface)) {
				// 
				if (InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = InterfaceExtendsInterfaceImpl
							.pattern_InterfaceExtendsInterface_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("InterfaceExtendsInterface");
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
		ruleResult.setRule("InterfaceExtendsInterface");
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

		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result2_bindingAndBlack[0];
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[1];
		TInterface tSuperInterface = (TInterface) result2_bindingAndBlack[2];
		TInterface tInterface = (TInterface) result2_bindingAndBlack[3];
		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_bindingAndBlack[4];

		Object[] result3_bindingAndBlack = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBB(this, eInterfaceDeclaration,
						eTypeAccess, tSuperInterface, tInterface, eSuperInterface, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eTypeAccess] = " + eTypeAccess
					+ ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[tInterface] = " + tInterface + ", "
					+ "[eSuperInterface] = " + eSuperInterface + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_24_5_matchcorrcontext_blackBBBFBFBB(eInterfaceDeclaration,
							tSuperInterface, tInterface, eSuperInterface, sourceMatch, targetMatch)) {
				TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result5_black[3];
				TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result5_black[5];
				Object[] result5_green = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_24_5_matchcorrcontext_greenBBBBF(
								eInterfaceDeclarationToTInterface, eSuperInterfaceToTSuperInterface, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_24_6_createcorrespondence_blackBBBBBB(eInterfaceDeclaration,
								eTypeAccess, tSuperInterface, tInterface, eSuperInterface, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: "
							+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[eTypeAccess] = "
							+ eTypeAccess + ", " + "[tSuperInterface] = " + tSuperInterface + ", " + "[tInterface] = "
							+ tInterface + ", " + "[eSuperInterface] = " + eSuperInterface + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}

				Object[] result7_black = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess,
			TInterface tSuperInterface, TInterface tInterface, InterfaceDeclaration eSuperInterface, Match sourceMatch,
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
	public boolean checkDEC_FWD(InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {// 
		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_27_1_matchtggpattern_blackBBB(eInterfaceDeclaration, eTypeAccess,
						eSuperInterface);
		if (result1_black != null) {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_27_2_expressionF();
		} else {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TInterface tSuperInterface, TInterface tInterface) {// 
		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_28_1_matchtggpattern_blackBB(tSuperInterface, tInterface);
		if (result1_black != null) {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_28_2_expressionF();
		} else {
			return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eInterfaceDeclarationToTInterfaceParameter,
			TypeToTAbstractType eSuperInterfaceToTSuperInterfaceParameter) {

		Object[] result1_black = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : InterfaceExtendsInterfaceImpl
				.pattern_InterfaceExtendsInterface_29_2_isapplicablecore_blackFFFFFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList eInterfaceDeclarationToTInterfaceList = (RuleEntryList) result2_black[0];
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result2_black[1];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result2_black[2];
			TInterface tInterface = (TInterface) result2_black[3];
			//nothing RuleEntryList eSuperInterfaceToTSuperInterfaceList = (RuleEntryList) result2_black[4];
			TInterface tSuperInterface = (TInterface) result2_black[5];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result2_black[6];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result2_black[7];

			Object[] result3_bindingAndBlack = InterfaceExtendsInterfaceImpl
					.pattern_InterfaceExtendsInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							eInterfaceDeclaration, tSuperInterface, tInterface, eInterfaceDeclarationToTInterface,
							eSuperInterface, eSuperInterfaceToTSuperInterface, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eInterfaceDeclaration] = "
						+ eInterfaceDeclaration + ", " + "[tSuperInterface] = " + tSuperInterface + ", "
						+ "[tInterface] = " + tInterface + ", " + "[eInterfaceDeclarationToTInterface] = "
						+ eInterfaceDeclarationToTInterface + ", " + "[eSuperInterface] = " + eSuperInterface + ", "
						+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_29_4_checkCSP_expressionFBB(this,
					csp)) {
				// 
				Object[] result5_black = InterfaceExtendsInterfaceImpl
						.pattern_InterfaceExtendsInterface_29_5_checknacs_blackBBBBBB(eInterfaceDeclaration,
								tSuperInterface, tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
								eSuperInterfaceToTSuperInterface);
				if (result5_black != null) {

					Object[] result6_black = InterfaceExtendsInterfaceImpl
							.pattern_InterfaceExtendsInterface_29_6_perform_blackBBBBBBB(eInterfaceDeclaration,
									tSuperInterface, tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
									eSuperInterfaceToTSuperInterface, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[eInterfaceDeclaration] = " + eInterfaceDeclaration + ", " + "[tSuperInterface] = "
								+ tSuperInterface + ", " + "[tInterface] = " + tInterface + ", "
								+ "[eInterfaceDeclarationToTInterface] = " + eInterfaceDeclarationToTInterface + ", "
								+ "[eSuperInterface] = " + eSuperInterface + ", "
								+ "[eSuperInterfaceToTSuperInterface] = " + eSuperInterfaceToTSuperInterface + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_29_6_perform_greenBFBBBB(
							eInterfaceDeclaration, tSuperInterface, tInterface, eSuperInterface, ruleResult);
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[1];

				} else {
				}

			} else {
			}

		}
		return InterfaceExtendsInterfaceImpl.pattern_InterfaceExtendsInterface_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eInterfaceDeclaration", eInterfaceDeclaration);
		isApplicableMatch.registerObject("tSuperInterface", tSuperInterface);
		isApplicableMatch.registerObject("tInterface", tInterface);
		isApplicableMatch.registerObject("eInterfaceDeclarationToTInterface", eInterfaceDeclarationToTInterface);
		isApplicableMatch.registerObject("eSuperInterface", eSuperInterface);
		isApplicableMatch.registerObject("eSuperInterfaceToTSuperInterface", eSuperInterfaceToTSuperInterface);
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
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_FWD__MATCH_INTERFACEDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return isAppropriate_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_INTERFACEDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
			return null;
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_INTERFACEDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (InterfaceDeclaration) arguments.get(1),
					(TypeAccess) arguments.get(2), (InterfaceDeclaration) arguments.get(3));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_TYPEACCESS_TINTERFACE_TINTERFACE_TYPETOTABSTRACTTYPE_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (TypeAccess) arguments.get(2),
					(TInterface) arguments.get(3), (TInterface) arguments.get(4),
					(TypeToTAbstractType) arguments.get(5), (InterfaceDeclaration) arguments.get(6),
					(TypeToTAbstractType) arguments.get(7));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_BWD__MATCH_TINTERFACE_TINTERFACE:
			return isAppropriate_BWD((Match) arguments.get(0), (TInterface) arguments.get(1),
					(TInterface) arguments.get(2));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TINTERFACE_TINTERFACE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TInterface) arguments.get(1),
					(TInterface) arguments.get(2));
			return null;
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TINTERFACE_TINTERFACE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TInterface) arguments.get(1),
					(TInterface) arguments.get(2));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_TINTERFACE_TINTERFACE_TYPETOTABSTRACTTYPE_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (TInterface) arguments.get(2),
					(TInterface) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(InterfaceDeclaration) arguments.get(5), (TypeToTAbstractType) arguments.get(6));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_16__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_16((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_16__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_16((EMoflonEdge) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_SOLVE_CSP_CC__INTERFACEDECLARATION_TYPEACCESS_TINTERFACE_TINTERFACE_INTERFACEDECLARATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((InterfaceDeclaration) arguments.get(0), (TypeAccess) arguments.get(1),
					(TInterface) arguments.get(2), (TInterface) arguments.get(3),
					(InterfaceDeclaration) arguments.get(4), (Match) arguments.get(5), (Match) arguments.get(6));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_DEC_FWD__INTERFACEDECLARATION_TYPEACCESS_INTERFACEDECLARATION:
			return checkDEC_FWD((InterfaceDeclaration) arguments.get(0), (TypeAccess) arguments.get(1),
					(InterfaceDeclaration) arguments.get(2));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___CHECK_DEC_BWD__TINTERFACE_TINTERFACE:
			return checkDEC_BWD((TInterface) arguments.get(0), (TInterface) arguments.get(1));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1),
					(TypeToTAbstractType) arguments.get(2));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_INTERFACEDECLARATION_TINTERFACE_TINTERFACE_TYPETOTABSTRACTTYPE_INTERFACEDECLARATION_TYPETOTABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(InterfaceDeclaration) arguments.get(1), (TInterface) arguments.get(2),
					(TInterface) arguments.get(3), (TypeToTAbstractType) arguments.get(4),
					(InterfaceDeclaration) arguments.get(5), (TypeToTAbstractType) arguments.get(6),
					(ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.INTERFACE_EXTENDS_INTERFACE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_1_initialbindings_blackBBBBB(
			InterfaceExtendsInterface _this, Match match, InterfaceDeclaration eInterfaceDeclaration,
			TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			return new Object[] { _this, match, eInterfaceDeclaration, eTypeAccess, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_2_SolveCSP_bindingFBBBBB(
			InterfaceExtendsInterface _this, Match match, InterfaceDeclaration eInterfaceDeclaration,
			TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eInterfaceDeclaration, eTypeAccess,
				eSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eInterfaceDeclaration, eTypeAccess, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_2_SolveCSP_bindingAndBlackFBBBBB(
			InterfaceExtendsInterface _this, Match match, InterfaceDeclaration eInterfaceDeclaration,
			TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {
		Object[] result_pattern_InterfaceExtendsInterface_0_2_SolveCSP_binding = pattern_InterfaceExtendsInterface_0_2_SolveCSP_bindingFBBBBB(
				_this, match, eInterfaceDeclaration, eTypeAccess, eSuperInterface);
		if (result_pattern_InterfaceExtendsInterface_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_0_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_0_2_SolveCSP_black = pattern_InterfaceExtendsInterface_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eInterfaceDeclaration, eTypeAccess, eSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_0_3_CheckCSP_expressionFBB(
			InterfaceExtendsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_4_collectelementstobetranslated_blackBBBB(
			Match match, InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			return new Object[] { match, eInterfaceDeclaration, eTypeAccess, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess,
			InterfaceDeclaration eSuperInterface) {
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		match.getToBeTranslatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setSrc(eInterfaceDeclaration);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eInterfaceDeclaration__eTypeAccess____superInterfaces);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eInterfaceDeclaration__eTypeAccess____superInterfaces
				.setName(eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime);
		return new Object[] { match, eInterfaceDeclaration, eTypeAccess, eSuperInterface,
				eTypeAccess__eSuperInterface____type, eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eInterfaceDeclaration__eTypeAccess____superInterfaces };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_5_collectcontextelements_blackBBBB(Match match,
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			return new Object[] { match, eInterfaceDeclaration, eTypeAccess, eSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_0_5_collectcontextelements_greenBBB(Match match,
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		match.getContextNodes().add(eInterfaceDeclaration);
		match.getContextNodes().add(eSuperInterface);
		return new Object[] { match, eInterfaceDeclaration, eSuperInterface };
	}

	public static final void pattern_InterfaceExtendsInterface_0_6_registerobjectstomatch_expressionBBBBB(
			InterfaceExtendsInterface _this, Match match, InterfaceDeclaration eInterfaceDeclaration,
			TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {
		_this.registerObjectsToMatch_FWD(match, eInterfaceDeclaration, eTypeAccess, eSuperInterface);

	}

	public static final boolean pattern_InterfaceExtendsInterface_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eInterfaceDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_2 = isApplicableMatch.getObject("tSuperInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("tInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eInterfaceDeclarationToTInterface");
		EObject _localVariable_5 = isApplicableMatch.getObject("eSuperInterface");
		EObject _localVariable_6 = isApplicableMatch.getObject("eSuperInterfaceToTSuperInterface");
		EObject tmpEInterfaceDeclaration = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpTSuperInterface = _localVariable_2;
		EObject tmpTInterface = _localVariable_3;
		EObject tmpEInterfaceDeclarationToTInterface = _localVariable_4;
		EObject tmpESuperInterface = _localVariable_5;
		EObject tmpESuperInterfaceToTSuperInterface = _localVariable_6;
		if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpTSuperInterface instanceof TInterface) {
					TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
					if (tmpTInterface instanceof TInterface) {
						TInterface tInterface = (TInterface) tmpTInterface;
						if (tmpEInterfaceDeclarationToTInterface instanceof TypeToTAbstractType) {
							TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) tmpEInterfaceDeclarationToTInterface;
							if (tmpESuperInterface instanceof InterfaceDeclaration) {
								InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
								if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
									TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
									return new Object[] { eInterfaceDeclaration, eTypeAccess, tSuperInterface,
											tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
											eSuperInterfaceToTSuperInterface, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_1_performtransformation_blackBBBBBBBFBB(
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			TInterface tInterface, TypeToTAbstractType eInterfaceDeclarationToTInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (!tInterface.equals(tSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
									eInterfaceDeclarationToTInterface, eSuperInterface,
									eSuperInterfaceToTSuperInterface, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding = pattern_InterfaceExtendsInterface_1_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding != null) {
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[0];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[1];
			TInterface tSuperInterface = (TInterface) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[2];
			TInterface tInterface = (TInterface) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[3];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[4];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[5];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_binding[6];

			Object[] result_pattern_InterfaceExtendsInterface_1_1_performtransformation_black = pattern_InterfaceExtendsInterface_1_1_performtransformation_blackBBBBBBBFBB(
					eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface, eInterfaceDeclarationToTInterface,
					eSuperInterface, eSuperInterfaceToTSuperInterface, _this, isApplicableMatch);
			if (result_pattern_InterfaceExtendsInterface_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_1_1_performtransformation_black[7];

				return new Object[] { eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
						eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_1_performtransformation_greenBB(
			TInterface tSuperInterface, TInterface tInterface) {
		tInterface.getParentInterfaces().add(tSuperInterface);
		return new Object[] { tSuperInterface, tInterface };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject eInterfaceDeclaration, EObject eTypeAccess, EObject tSuperInterface,
			EObject tInterface, EObject eInterfaceDeclarationToTInterface, EObject eSuperInterface,
			EObject eSuperInterfaceToTSuperInterface) {
		if (!eInterfaceDeclaration.equals(eTypeAccess)) {
			if (!eInterfaceDeclaration.equals(tSuperInterface)) {
				if (!eInterfaceDeclaration.equals(tInterface)) {
					if (!eInterfaceDeclaration.equals(eInterfaceDeclarationToTInterface)) {
						if (!eInterfaceDeclaration.equals(eSuperInterface)) {
							if (!eInterfaceDeclaration.equals(eSuperInterfaceToTSuperInterface)) {
								if (!eTypeAccess.equals(tSuperInterface)) {
									if (!eTypeAccess.equals(tInterface)) {
										if (!tInterface.equals(tSuperInterface)) {
											if (!eInterfaceDeclarationToTInterface.equals(eTypeAccess)) {
												if (!eInterfaceDeclarationToTInterface.equals(tSuperInterface)) {
													if (!eInterfaceDeclarationToTInterface.equals(tInterface)) {
														if (!eInterfaceDeclarationToTInterface
																.equals(eSuperInterface)) {
															if (!eInterfaceDeclarationToTInterface
																	.equals(eSuperInterfaceToTSuperInterface)) {
																if (!eSuperInterface.equals(eTypeAccess)) {
																	if (!eSuperInterface.equals(tSuperInterface)) {
																		if (!eSuperInterface.equals(tInterface)) {
																			if (!eSuperInterface.equals(
																					eSuperInterfaceToTSuperInterface)) {
																				if (!eSuperInterfaceToTSuperInterface
																						.equals(eTypeAccess)) {
																					if (!eSuperInterfaceToTSuperInterface
																							.equals(tSuperInterface)) {
																						if (!eSuperInterfaceToTSuperInterface
																								.equals(tInterface)) {
																							return new Object[] {
																									ruleresult,
																									eInterfaceDeclaration,
																									eTypeAccess,
																									tSuperInterface,
																									tInterface,
																									eInterfaceDeclarationToTInterface,
																									eSuperInterface,
																									eSuperInterfaceToTSuperInterface };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InterfaceExtendsInterface_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject eInterfaceDeclaration, EObject eTypeAccess, EObject tSuperInterface,
			EObject tInterface, EObject eSuperInterface) {
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tInterface__tSuperInterface____parentInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tInterface____childInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceExtendsInterface";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String tInterface__tSuperInterface____parentInterfaces_name_prime = "parentInterfaces";
		String tSuperInterface__tInterface____childInterfaces_name_prime = "childInterfaces";
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setSrc(eInterfaceDeclaration);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eInterfaceDeclaration__eTypeAccess____superInterfaces);
		tInterface__tSuperInterface____parentInterfaces.setSrc(tInterface);
		tInterface__tSuperInterface____parentInterfaces.setTrg(tSuperInterface);
		ruleresult.getCreatedEdges().add(tInterface__tSuperInterface____parentInterfaces);
		tSuperInterface__tInterface____childInterfaces.setSrc(tSuperInterface);
		tSuperInterface__tInterface____childInterfaces.setTrg(tInterface);
		ruleresult.getCreatedEdges().add(tSuperInterface__tInterface____childInterfaces);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eInterfaceDeclaration__eTypeAccess____superInterfaces
				.setName(eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime);
		tInterface__tSuperInterface____parentInterfaces
				.setName(tInterface__tSuperInterface____parentInterfaces_name_prime);
		tSuperInterface__tInterface____childInterfaces
				.setName(tSuperInterface__tInterface____childInterfaces_name_prime);
		return new Object[] { ruleresult, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
				eSuperInterface, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eInterfaceDeclaration__eTypeAccess____superInterfaces, tInterface__tSuperInterface____parentInterfaces,
				tSuperInterface__tInterface____childInterfaces };
	}

	public static final void pattern_InterfaceExtendsInterface_1_5_registerobjects_expressionBBBBBBBBB(
			InterfaceExtendsInterface _this, PerformRuleResult ruleresult, EObject eInterfaceDeclaration,
			EObject eTypeAccess, EObject tSuperInterface, EObject tInterface, EObject eInterfaceDeclarationToTInterface,
			EObject eSuperInterface, EObject eSuperInterfaceToTSuperInterface) {
		_this.registerObjects_FWD(ruleresult, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
				eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface);

	}

	public static final PerformRuleResult pattern_InterfaceExtendsInterface_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_bindingFB(
			InterfaceExtendsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_blackFBB(EClass eClass,
			InterfaceExtendsInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_bindingAndBlackFFB(
			InterfaceExtendsInterface _this) {
		Object[] result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_binding = pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_black = pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InterfaceExtendsInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eInterfaceDeclaration");
		EObject _localVariable_1 = match.getObject("eTypeAccess");
		EObject _localVariable_2 = match.getObject("eSuperInterface");
		EObject tmpEInterfaceDeclaration = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpESuperInterface = _localVariable_2;
		if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpESuperInterface instanceof InterfaceDeclaration) {
					InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
					return new Object[] { eInterfaceDeclaration, eTypeAccess, eSuperInterface, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_2_2_corematch_blackBBFFFBFB(
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			for (TypeToTAbstractType eInterfaceDeclarationToTInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eInterfaceDeclaration, TypeToTAbstractType.class, "source")) {
				TAbstractType tmpTInterface = eInterfaceDeclarationToTInterface.getTarget();
				if (tmpTInterface instanceof TInterface) {
					TInterface tInterface = (TInterface) tmpTInterface;
					for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eSuperInterface, TypeToTAbstractType.class, "source")) {
						if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
							TAbstractType tmpTSuperInterface = eSuperInterfaceToTSuperInterface.getTarget();
							if (tmpTSuperInterface instanceof TInterface) {
								TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
								if (!tInterface.equals(tSuperInterface)) {
									_result.add(new Object[] { eInterfaceDeclaration, eTypeAccess, tSuperInterface,
											tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
											eSuperInterfaceToTSuperInterface, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_2_3_findcontext_blackBBBBBBB(
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			TInterface tInterface, TypeToTAbstractType eInterfaceDeclarationToTInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (!tInterface.equals(tSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					if (tInterface.equals(eInterfaceDeclarationToTInterface.getTarget())) {
						if (eSuperInterface.equals(eTypeAccess.getType())) {
							if (eInterfaceDeclaration.equals(eInterfaceDeclarationToTInterface.getSource())) {
								if (eInterfaceDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
									if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
										if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
											_result.add(new Object[] { eInterfaceDeclaration, eTypeAccess,
													tSuperInterface, tInterface, eInterfaceDeclarationToTInterface,
													eSuperInterface, eSuperInterfaceToTSuperInterface });
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

	public static final Object[] pattern_InterfaceExtendsInterface_2_3_findcontext_greenBBBBBBBFFFFFFFF(
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			TInterface tInterface, TypeToTAbstractType eInterfaceDeclarationToTInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eInterfaceDeclarationToTInterface__tInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eInterfaceDeclarationToTInterface__tInterface____target_name_prime = "target";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source_name_prime = "source";
		String eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime = "source";
		String eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclaration);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(tInterface);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclarationToTInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		eInterfaceDeclarationToTInterface__tInterface____target.setSrc(eInterfaceDeclarationToTInterface);
		eInterfaceDeclarationToTInterface__tInterface____target.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclarationToTInterface__tInterface____target);
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source.setSrc(eInterfaceDeclarationToTInterface);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source.setTrg(eInterfaceDeclaration);
		isApplicableMatch.getAllContextElements()
				.add(eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setSrc(eInterfaceDeclaration);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclaration__eTypeAccess____superInterfaces);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__eSuperInterface____source);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__tSuperInterface____target);
		eInterfaceDeclarationToTInterface__tInterface____target
				.setName(eInterfaceDeclarationToTInterface__tInterface____target_name_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source
				.setName(eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source_name_prime);
		eInterfaceDeclaration__eTypeAccess____superInterfaces
				.setName(eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source
				.setName(eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target
				.setName(eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime);
		return new Object[] { eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
				eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface, isApplicableMatch,
				eInterfaceDeclarationToTInterface__tInterface____target, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source,
				eInterfaceDeclaration__eTypeAccess____superInterfaces,
				eSuperInterfaceToTSuperInterface__eSuperInterface____source,
				eSuperInterfaceToTSuperInterface__tSuperInterface____target };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_4_solveCSP_bindingFBBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			TInterface tInterface, TypeToTAbstractType eInterfaceDeclarationToTInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eInterfaceDeclaration, eTypeAccess,
				tSuperInterface, tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
				eSuperInterfaceToTSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eInterfaceDeclaration, eTypeAccess, tSuperInterface,
					tInterface, eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			TInterface tInterface, TypeToTAbstractType eInterfaceDeclarationToTInterface,
			InterfaceDeclaration eSuperInterface, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		Object[] result_pattern_InterfaceExtendsInterface_2_4_solveCSP_binding = pattern_InterfaceExtendsInterface_2_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
				eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface);
		if (result_pattern_InterfaceExtendsInterface_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_2_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_2_4_solveCSP_black = pattern_InterfaceExtendsInterface_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eInterfaceDeclaration, eTypeAccess,
						tSuperInterface, tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
						eSuperInterfaceToTSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_2_5_checkCSP_expressionFBB(
			InterfaceExtendsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceExtendsInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceExtendsInterface_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_1_initialbindings_blackBBBB(
			InterfaceExtendsInterface _this, Match match, TInterface tSuperInterface, TInterface tInterface) {
		if (!tInterface.equals(tSuperInterface)) {
			return new Object[] { _this, match, tSuperInterface, tInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_2_SolveCSP_bindingFBBBB(
			InterfaceExtendsInterface _this, Match match, TInterface tSuperInterface, TInterface tInterface) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, tSuperInterface, tInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, tSuperInterface, tInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_2_SolveCSP_bindingAndBlackFBBBB(
			InterfaceExtendsInterface _this, Match match, TInterface tSuperInterface, TInterface tInterface) {
		Object[] result_pattern_InterfaceExtendsInterface_10_2_SolveCSP_binding = pattern_InterfaceExtendsInterface_10_2_SolveCSP_bindingFBBBB(
				_this, match, tSuperInterface, tInterface);
		if (result_pattern_InterfaceExtendsInterface_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_10_2_SolveCSP_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_10_2_SolveCSP_black = pattern_InterfaceExtendsInterface_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, tSuperInterface, tInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_10_3_CheckCSP_expressionFBB(
			InterfaceExtendsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_4_collectelementstobetranslated_blackBBB(
			Match match, TInterface tSuperInterface, TInterface tInterface) {
		if (!tInterface.equals(tSuperInterface)) {
			return new Object[] { match, tSuperInterface, tInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_4_collectelementstobetranslated_greenBBBFF(
			Match match, TInterface tSuperInterface, TInterface tInterface) {
		EMoflonEdge tInterface__tSuperInterface____parentInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tInterface____childInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String tInterface__tSuperInterface____parentInterfaces_name_prime = "parentInterfaces";
		String tSuperInterface__tInterface____childInterfaces_name_prime = "childInterfaces";
		tInterface__tSuperInterface____parentInterfaces.setSrc(tInterface);
		tInterface__tSuperInterface____parentInterfaces.setTrg(tSuperInterface);
		match.getToBeTranslatedEdges().add(tInterface__tSuperInterface____parentInterfaces);
		tSuperInterface__tInterface____childInterfaces.setSrc(tSuperInterface);
		tSuperInterface__tInterface____childInterfaces.setTrg(tInterface);
		match.getToBeTranslatedEdges().add(tSuperInterface__tInterface____childInterfaces);
		tInterface__tSuperInterface____parentInterfaces
				.setName(tInterface__tSuperInterface____parentInterfaces_name_prime);
		tSuperInterface__tInterface____childInterfaces
				.setName(tSuperInterface__tInterface____childInterfaces_name_prime);
		return new Object[] { match, tSuperInterface, tInterface, tInterface__tSuperInterface____parentInterfaces,
				tSuperInterface__tInterface____childInterfaces };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_5_collectcontextelements_blackBBB(Match match,
			TInterface tSuperInterface, TInterface tInterface) {
		if (!tInterface.equals(tSuperInterface)) {
			return new Object[] { match, tSuperInterface, tInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_10_5_collectcontextelements_greenBBB(Match match,
			TInterface tSuperInterface, TInterface tInterface) {
		match.getContextNodes().add(tSuperInterface);
		match.getContextNodes().add(tInterface);
		return new Object[] { match, tSuperInterface, tInterface };
	}

	public static final void pattern_InterfaceExtendsInterface_10_6_registerobjectstomatch_expressionBBBB(
			InterfaceExtendsInterface _this, Match match, TInterface tSuperInterface, TInterface tInterface) {
		_this.registerObjectsToMatch_BWD(match, tSuperInterface, tInterface);

	}

	public static final boolean pattern_InterfaceExtendsInterface_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eInterfaceDeclaration");
		EObject _localVariable_1 = isApplicableMatch.getObject("tSuperInterface");
		EObject _localVariable_2 = isApplicableMatch.getObject("tInterface");
		EObject _localVariable_3 = isApplicableMatch.getObject("eInterfaceDeclarationToTInterface");
		EObject _localVariable_4 = isApplicableMatch.getObject("eSuperInterface");
		EObject _localVariable_5 = isApplicableMatch.getObject("eSuperInterfaceToTSuperInterface");
		EObject tmpEInterfaceDeclaration = _localVariable_0;
		EObject tmpTSuperInterface = _localVariable_1;
		EObject tmpTInterface = _localVariable_2;
		EObject tmpEInterfaceDeclarationToTInterface = _localVariable_3;
		EObject tmpESuperInterface = _localVariable_4;
		EObject tmpESuperInterfaceToTSuperInterface = _localVariable_5;
		if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
			if (tmpTSuperInterface instanceof TInterface) {
				TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
				if (tmpTInterface instanceof TInterface) {
					TInterface tInterface = (TInterface) tmpTInterface;
					if (tmpEInterfaceDeclarationToTInterface instanceof TypeToTAbstractType) {
						TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) tmpEInterfaceDeclarationToTInterface;
						if (tmpESuperInterface instanceof InterfaceDeclaration) {
							InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
							if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
								TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
								return new Object[] { eInterfaceDeclaration, tSuperInterface, tInterface,
										eInterfaceDeclarationToTInterface, eSuperInterface,
										eSuperInterfaceToTSuperInterface, isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_1_performtransformation_blackBBBBBBFBB(
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, InterfaceExtendsInterface _this,
			IsApplicableMatch isApplicableMatch) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (!tInterface.equals(tSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { eInterfaceDeclaration, tSuperInterface, tInterface,
									eInterfaceDeclarationToTInterface, eSuperInterface,
									eSuperInterfaceToTSuperInterface, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_1_performtransformation_bindingAndBlackFFFFFFFBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding = pattern_InterfaceExtendsInterface_11_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding != null) {
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[0];
			TInterface tSuperInterface = (TInterface) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[1];
			TInterface tInterface = (TInterface) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[2];
			TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[3];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[4];
			TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_binding[5];

			Object[] result_pattern_InterfaceExtendsInterface_11_1_performtransformation_black = pattern_InterfaceExtendsInterface_11_1_performtransformation_blackBBBBBBFBB(
					eInterfaceDeclaration, tSuperInterface, tInterface, eInterfaceDeclarationToTInterface,
					eSuperInterface, eSuperInterfaceToTSuperInterface, _this, isApplicableMatch);
			if (result_pattern_InterfaceExtendsInterface_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_11_1_performtransformation_black[6];

				return new Object[] { eInterfaceDeclaration, tSuperInterface, tInterface,
						eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface, csp,
						_this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_1_performtransformation_greenBFB(
			InterfaceDeclaration eInterfaceDeclaration, InterfaceDeclaration eSuperInterface) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		eTypeAccess.setType(eSuperInterface);
		eInterfaceDeclaration.getSuperInterfaces().add(eTypeAccess);
		return new Object[] { eInterfaceDeclaration, eTypeAccess, eSuperInterface };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_2_collecttranslatedelements_blackB(
			TypeAccess eTypeAccess) {
		return new Object[] { eTypeAccess };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_2_collecttranslatedelements_greenFB(
			TypeAccess eTypeAccess) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(eTypeAccess);
		return new Object[] { ruleresult, eTypeAccess };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject eInterfaceDeclaration, EObject eTypeAccess, EObject tSuperInterface,
			EObject tInterface, EObject eInterfaceDeclarationToTInterface, EObject eSuperInterface,
			EObject eSuperInterfaceToTSuperInterface) {
		if (!eInterfaceDeclaration.equals(eTypeAccess)) {
			if (!eInterfaceDeclaration.equals(tSuperInterface)) {
				if (!eInterfaceDeclaration.equals(tInterface)) {
					if (!eInterfaceDeclaration.equals(eInterfaceDeclarationToTInterface)) {
						if (!eInterfaceDeclaration.equals(eSuperInterface)) {
							if (!eInterfaceDeclaration.equals(eSuperInterfaceToTSuperInterface)) {
								if (!eTypeAccess.equals(tSuperInterface)) {
									if (!eTypeAccess.equals(tInterface)) {
										if (!tInterface.equals(tSuperInterface)) {
											if (!eInterfaceDeclarationToTInterface.equals(eTypeAccess)) {
												if (!eInterfaceDeclarationToTInterface.equals(tSuperInterface)) {
													if (!eInterfaceDeclarationToTInterface.equals(tInterface)) {
														if (!eInterfaceDeclarationToTInterface
																.equals(eSuperInterface)) {
															if (!eInterfaceDeclarationToTInterface
																	.equals(eSuperInterfaceToTSuperInterface)) {
																if (!eSuperInterface.equals(eTypeAccess)) {
																	if (!eSuperInterface.equals(tSuperInterface)) {
																		if (!eSuperInterface.equals(tInterface)) {
																			if (!eSuperInterface.equals(
																					eSuperInterfaceToTSuperInterface)) {
																				if (!eSuperInterfaceToTSuperInterface
																						.equals(eTypeAccess)) {
																					if (!eSuperInterfaceToTSuperInterface
																							.equals(tSuperInterface)) {
																						if (!eSuperInterfaceToTSuperInterface
																								.equals(tInterface)) {
																							return new Object[] {
																									ruleresult,
																									eInterfaceDeclaration,
																									eTypeAccess,
																									tSuperInterface,
																									tInterface,
																									eInterfaceDeclarationToTInterface,
																									eSuperInterface,
																									eSuperInterfaceToTSuperInterface };
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InterfaceExtendsInterface_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject eInterfaceDeclaration, EObject eTypeAccess, EObject tSuperInterface,
			EObject tInterface, EObject eSuperInterface) {
		EMoflonEdge eTypeAccess__eSuperInterface____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterface__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclaration__eTypeAccess____superInterfaces = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tInterface__tSuperInterface____parentInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tInterface____childInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "InterfaceExtendsInterface";
		String eTypeAccess__eSuperInterface____type_name_prime = "type";
		String eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime = "superInterfaces";
		String tInterface__tSuperInterface____parentInterfaces_name_prime = "parentInterfaces";
		String tSuperInterface__tInterface____childInterfaces_name_prime = "childInterfaces";
		eTypeAccess__eSuperInterface____type.setSrc(eTypeAccess);
		eTypeAccess__eSuperInterface____type.setTrg(eSuperInterface);
		ruleresult.getCreatedEdges().add(eTypeAccess__eSuperInterface____type);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setSrc(eSuperInterface);
		eSuperInterface__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eSuperInterface__eTypeAccess____usagesInTypeAccess);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setSrc(eInterfaceDeclaration);
		eInterfaceDeclaration__eTypeAccess____superInterfaces.setTrg(eTypeAccess);
		ruleresult.getCreatedEdges().add(eInterfaceDeclaration__eTypeAccess____superInterfaces);
		tInterface__tSuperInterface____parentInterfaces.setSrc(tInterface);
		tInterface__tSuperInterface____parentInterfaces.setTrg(tSuperInterface);
		ruleresult.getTranslatedEdges().add(tInterface__tSuperInterface____parentInterfaces);
		tSuperInterface__tInterface____childInterfaces.setSrc(tSuperInterface);
		tSuperInterface__tInterface____childInterfaces.setTrg(tInterface);
		ruleresult.getTranslatedEdges().add(tSuperInterface__tInterface____childInterfaces);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eTypeAccess__eSuperInterface____type.setName(eTypeAccess__eSuperInterface____type_name_prime);
		eSuperInterface__eTypeAccess____usagesInTypeAccess
				.setName(eSuperInterface__eTypeAccess____usagesInTypeAccess_name_prime);
		eInterfaceDeclaration__eTypeAccess____superInterfaces
				.setName(eInterfaceDeclaration__eTypeAccess____superInterfaces_name_prime);
		tInterface__tSuperInterface____parentInterfaces
				.setName(tInterface__tSuperInterface____parentInterfaces_name_prime);
		tSuperInterface__tInterface____childInterfaces
				.setName(tSuperInterface__tInterface____childInterfaces_name_prime);
		return new Object[] { ruleresult, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
				eSuperInterface, eTypeAccess__eSuperInterface____type,
				eSuperInterface__eTypeAccess____usagesInTypeAccess,
				eInterfaceDeclaration__eTypeAccess____superInterfaces, tInterface__tSuperInterface____parentInterfaces,
				tSuperInterface__tInterface____childInterfaces };
	}

	public static final void pattern_InterfaceExtendsInterface_11_5_registerobjects_expressionBBBBBBBBB(
			InterfaceExtendsInterface _this, PerformRuleResult ruleresult, EObject eInterfaceDeclaration,
			EObject eTypeAccess, EObject tSuperInterface, EObject tInterface, EObject eInterfaceDeclarationToTInterface,
			EObject eSuperInterface, EObject eSuperInterfaceToTSuperInterface) {
		_this.registerObjects_BWD(ruleresult, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
				eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface);

	}

	public static final PerformRuleResult pattern_InterfaceExtendsInterface_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_bindingFB(
			InterfaceExtendsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_blackFBB(EClass eClass,
			InterfaceExtendsInterface _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_bindingAndBlackFFB(
			InterfaceExtendsInterface _this) {
		Object[] result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_binding = pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_black = pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "InterfaceExtendsInterface";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("tSuperInterface");
		EObject _localVariable_1 = match.getObject("tInterface");
		EObject tmpTSuperInterface = _localVariable_0;
		EObject tmpTInterface = _localVariable_1;
		if (tmpTSuperInterface instanceof TInterface) {
			TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
			if (tmpTInterface instanceof TInterface) {
				TInterface tInterface = (TInterface) tmpTInterface;
				return new Object[] { tSuperInterface, tInterface, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_12_2_corematch_blackFBBFFFB(
			TInterface tSuperInterface, TInterface tInterface, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!tInterface.equals(tSuperInterface)) {
			for (TypeToTAbstractType eInterfaceDeclarationToTInterface : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(tInterface, TypeToTAbstractType.class, "target")) {
				Type tmpEInterfaceDeclaration = eInterfaceDeclarationToTInterface.getSource();
				if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
					InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
					for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tSuperInterface, TypeToTAbstractType.class, "target")) {
						if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
							Type tmpESuperInterface = eSuperInterfaceToTSuperInterface.getSource();
							if (tmpESuperInterface instanceof InterfaceDeclaration) {
								InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
								if (!eInterfaceDeclaration.equals(eSuperInterface)) {
									_result.add(new Object[] { eInterfaceDeclaration, tSuperInterface, tInterface,
											eInterfaceDeclarationToTInterface, eSuperInterface,
											eSuperInterfaceToTSuperInterface, match });
								}
							}

						}
					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_12_3_findcontext_blackBBBBBB(
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (!tInterface.equals(tSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					if (tInterface.equals(eInterfaceDeclarationToTInterface.getTarget())) {
						if (eInterfaceDeclaration.equals(eInterfaceDeclarationToTInterface.getSource())) {
							if (eSuperInterface.equals(eSuperInterfaceToTSuperInterface.getSource())) {
								if (tInterface.getParentInterfaces().contains(tSuperInterface)) {
									if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
										_result.add(new Object[] { eInterfaceDeclaration, tSuperInterface, tInterface,
												eInterfaceDeclarationToTInterface, eSuperInterface,
												eSuperInterfaceToTSuperInterface });
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

	public static final Object[] pattern_InterfaceExtendsInterface_12_3_findcontext_greenBBBBBBFFFFFFF(
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eInterfaceDeclarationToTInterface__tInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__eSuperInterface____source = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge tInterface__tSuperInterface____parentInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tSuperInterface__tInterface____childInterfaces = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eSuperInterfaceToTSuperInterface__tSuperInterface____target = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String eInterfaceDeclarationToTInterface__tInterface____target_name_prime = "target";
		String eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source_name_prime = "source";
		String eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime = "source";
		String tInterface__tSuperInterface____parentInterfaces_name_prime = "parentInterfaces";
		String tSuperInterface__tInterface____childInterfaces_name_prime = "childInterfaces";
		String eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclaration);
		isApplicableMatch.getAllContextElements().add(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(tInterface);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclarationToTInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		eInterfaceDeclarationToTInterface__tInterface____target.setSrc(eInterfaceDeclarationToTInterface);
		eInterfaceDeclarationToTInterface__tInterface____target.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(eInterfaceDeclarationToTInterface__tInterface____target);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source.setSrc(eInterfaceDeclarationToTInterface);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source.setTrg(eInterfaceDeclaration);
		isApplicableMatch.getAllContextElements()
				.add(eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source.setTrg(eSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__eSuperInterface____source);
		tInterface__tSuperInterface____parentInterfaces.setSrc(tInterface);
		tInterface__tSuperInterface____parentInterfaces.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(tInterface__tSuperInterface____parentInterfaces);
		tSuperInterface__tInterface____childInterfaces.setSrc(tSuperInterface);
		tSuperInterface__tInterface____childInterfaces.setTrg(tInterface);
		isApplicableMatch.getAllContextElements().add(tSuperInterface__tInterface____childInterfaces);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setSrc(eSuperInterfaceToTSuperInterface);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target.setTrg(tSuperInterface);
		isApplicableMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface__tSuperInterface____target);
		eInterfaceDeclarationToTInterface__tInterface____target
				.setName(eInterfaceDeclarationToTInterface__tInterface____target_name_prime);
		eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source
				.setName(eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source_name_prime);
		eSuperInterfaceToTSuperInterface__eSuperInterface____source
				.setName(eSuperInterfaceToTSuperInterface__eSuperInterface____source_name_prime);
		tInterface__tSuperInterface____parentInterfaces
				.setName(tInterface__tSuperInterface____parentInterfaces_name_prime);
		tSuperInterface__tInterface____childInterfaces
				.setName(tSuperInterface__tInterface____childInterfaces_name_prime);
		eSuperInterfaceToTSuperInterface__tSuperInterface____target
				.setName(eSuperInterfaceToTSuperInterface__tSuperInterface____target_name_prime);
		return new Object[] { eInterfaceDeclaration, tSuperInterface, tInterface, eInterfaceDeclarationToTInterface,
				eSuperInterface, eSuperInterfaceToTSuperInterface, isApplicableMatch,
				eInterfaceDeclarationToTInterface__tInterface____target,
				eInterfaceDeclarationToTInterface__eInterfaceDeclaration____source,
				eSuperInterfaceToTSuperInterface__eSuperInterface____source,
				tInterface__tSuperInterface____parentInterfaces, tSuperInterface__tInterface____childInterfaces,
				eSuperInterfaceToTSuperInterface__tSuperInterface____target };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_4_solveCSP_bindingFBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, eInterfaceDeclaration,
				tSuperInterface, tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
				eSuperInterfaceToTSuperInterface);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eInterfaceDeclaration, tSuperInterface, tInterface,
					eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_4_solveCSP_bindingAndBlackFBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		Object[] result_pattern_InterfaceExtendsInterface_12_4_solveCSP_binding = pattern_InterfaceExtendsInterface_12_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, eInterfaceDeclaration, tSuperInterface, tInterface,
				eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface);
		if (result_pattern_InterfaceExtendsInterface_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_12_4_solveCSP_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_12_4_solveCSP_black = pattern_InterfaceExtendsInterface_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eInterfaceDeclaration, tSuperInterface, tInterface,
						eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_12_5_checkCSP_expressionFBB(
			InterfaceExtendsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "InterfaceExtendsInterface";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceExtendsInterface_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_bindingFB(
			InterfaceExtendsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InterfaceExtendsInterface _this) {
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

	public static final Object[] pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_bindingAndBlackFFBF(
			InterfaceExtendsInterface _this) {
		Object[] result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_binding = pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_black = pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_parentInterfaces) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTInterface = _edge_parentInterfaces.getSrc();
		if (tmpTInterface instanceof TInterface) {
			TInterface tInterface = (TInterface) tmpTInterface;
			EObject tmpTSuperInterface = _edge_parentInterfaces.getTrg();
			if (tmpTSuperInterface instanceof TInterface) {
				TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
				if (!tInterface.equals(tSuperInterface)) {
					if (tInterface.getParentInterfaces().contains(tSuperInterface)) {
						_result.add(new Object[] { tSuperInterface, tInterface, _edge_parentInterfaces });
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceExtendsInterface_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			InterfaceExtendsInterface _this, Match match, TInterface tSuperInterface, TInterface tInterface) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, tSuperInterface, tInterface);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InterfaceExtendsInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InterfaceExtendsInterface_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_bindingFB(
			InterfaceExtendsInterface _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			InterfaceExtendsInterface _this) {
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

	public static final Object[] pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_bindingAndBlackFFBF(
			InterfaceExtendsInterface _this) {
		Object[] result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_binding = pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_black = pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_0B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_776710 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_538757 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_440240 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_832284 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_4B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_238482 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (ParameterizedType __DEC_eTypeAccess_type_486508 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_91611 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_532751 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpETypeAccess = _edge_type.getSrc();
		if (tmpETypeAccess instanceof TypeAccess) {
			TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
			EObject tmpESuperInterface = _edge_type.getTrg();
			if (tmpESuperInterface instanceof InterfaceDeclaration) {
				InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
				if (eSuperInterface.equals(eTypeAccess.getType())) {
					if (pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_0B(eTypeAccess) == null) {
						if (pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_1B(
								eTypeAccess) == null) {
							if (pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_2B(
									eTypeAccess) == null) {
								if (pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_3B(
										eTypeAccess) == null) {
									if (pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_4B(
											eTypeAccess) == null) {
										if (pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_5B(
												eTypeAccess) == null) {
											if (pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_6B(
													eTypeAccess) == null) {
												if (pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_black_nac_7B(
														eTypeAccess) == null) {
													for (AbstractTypeDeclaration tmpEInterfaceDeclaration : org.moflon.core.utilities.eMoflonEMFUtil
															.getOppositeReferenceTyped(eTypeAccess,
																	AbstractTypeDeclaration.class, "superInterfaces")) {
														if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
															InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
															if (!eInterfaceDeclaration.equals(eSuperInterface)) {
																_result.add(new Object[] { eInterfaceDeclaration,
																		eTypeAccess, eSuperInterface, _edge_type });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_InterfaceExtendsInterface_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_InterfaceExtendsInterface_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			InterfaceExtendsInterface _this, Match match, InterfaceDeclaration eInterfaceDeclaration,
			TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eInterfaceDeclaration, eTypeAccess, eSuperInterface);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			InterfaceExtendsInterface _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_InterfaceExtendsInterface_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_1_prepare_blackB(
			InterfaceExtendsInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_bindingFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("eInterfaceDeclaration");
		EObject _localVariable_1 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_2 = targetMatch.getObject("tSuperInterface");
		EObject _localVariable_3 = targetMatch.getObject("tInterface");
		EObject _localVariable_4 = sourceMatch.getObject("eSuperInterface");
		EObject tmpEInterfaceDeclaration = _localVariable_0;
		EObject tmpETypeAccess = _localVariable_1;
		EObject tmpTSuperInterface = _localVariable_2;
		EObject tmpTInterface = _localVariable_3;
		EObject tmpESuperInterface = _localVariable_4;
		if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
			if (tmpETypeAccess instanceof TypeAccess) {
				TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
				if (tmpTSuperInterface instanceof TInterface) {
					TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
					if (tmpTInterface instanceof TInterface) {
						TInterface tInterface = (TInterface) tmpTInterface;
						if (tmpESuperInterface instanceof InterfaceDeclaration) {
							InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
							return new Object[] { eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
									eSuperInterface, sourceMatch, targetMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_blackBBBBBBB(
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			TInterface tInterface, InterfaceDeclaration eSuperInterface, Match sourceMatch, Match targetMatch) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (!tInterface.equals(tSuperInterface)) {
				if (!sourceMatch.equals(targetMatch)) {
					return new Object[] { eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
							eSuperInterface, sourceMatch, targetMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_bindingAndBlackFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_binding = pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_bindingFFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_binding != null) {
			InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) result_pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_binding[0];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_binding[1];
			TInterface tSuperInterface = (TInterface) result_pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_binding[2];
			TInterface tInterface = (TInterface) result_pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_binding[3];
			InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) result_pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_binding[4];

			Object[] result_pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_black = pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_blackBBBBBBB(
					eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface, eSuperInterface, sourceMatch,
					targetMatch);
			if (result_pattern_InterfaceExtendsInterface_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface, eSuperInterface,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_3_solvecsp_bindingFBBBBBBBB(
			InterfaceExtendsInterface _this, InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess,
			TInterface tSuperInterface, TInterface tInterface, InterfaceDeclaration eSuperInterface, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_5 = _this.isApplicable_solveCsp_CC(eInterfaceDeclaration, eTypeAccess, tSuperInterface,
				tInterface, eSuperInterface, sourceMatch, targetMatch);
		CSP csp = _localVariable_5;
		if (csp != null) {
			return new Object[] { csp, _this, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
					eSuperInterface, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_3_solvecsp_bindingAndBlackFBBBBBBBB(
			InterfaceExtendsInterface _this, InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess,
			TInterface tSuperInterface, TInterface tInterface, InterfaceDeclaration eSuperInterface, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_InterfaceExtendsInterface_24_3_solvecsp_binding = pattern_InterfaceExtendsInterface_24_3_solvecsp_bindingFBBBBBBBB(
				_this, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface, eSuperInterface, sourceMatch,
				targetMatch);
		if (result_pattern_InterfaceExtendsInterface_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_24_3_solvecsp_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_24_3_solvecsp_black = pattern_InterfaceExtendsInterface_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface,
						eSuperInterface, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_24_5_matchcorrcontext_blackBBBFBFBB(
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			InterfaceDeclaration eSuperInterface, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (!tInterface.equals(tSuperInterface)) {
				if (!sourceMatch.equals(targetMatch)) {
					for (TypeToTAbstractType eInterfaceDeclarationToTInterface : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(tInterface, TypeToTAbstractType.class, "target")) {
						if (eInterfaceDeclaration.equals(eInterfaceDeclarationToTInterface.getSource())) {
							for (TypeToTAbstractType eSuperInterfaceToTSuperInterface : org.moflon.core.utilities.eMoflonEMFUtil
									.getOppositeReferenceTyped(eSuperInterface, TypeToTAbstractType.class, "source")) {
								if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
									if (tSuperInterface.equals(eSuperInterfaceToTSuperInterface.getTarget())) {
										_result.add(new Object[] { eInterfaceDeclaration, tSuperInterface, tInterface,
												eInterfaceDeclarationToTInterface, eSuperInterface,
												eSuperInterfaceToTSuperInterface, sourceMatch, targetMatch });
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

	public static final Object[] pattern_InterfaceExtendsInterface_24_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType eInterfaceDeclarationToTInterface, TypeToTAbstractType eSuperInterfaceToTSuperInterface,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "InterfaceExtendsInterface";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eInterfaceDeclarationToTInterface);
		ccMatch.getAllContextElements().add(eSuperInterfaceToTSuperInterface);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eInterfaceDeclarationToTInterface, eSuperInterfaceToTSuperInterface, sourceMatch,
				targetMatch, ccMatch };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_6_createcorrespondence_blackBBBBBB(
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, TInterface tSuperInterface,
			TInterface tInterface, InterfaceDeclaration eSuperInterface, CCMatch ccMatch) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (!tInterface.equals(tSuperInterface)) {
				return new Object[] { eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface, eSuperInterface,
						ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "InterfaceExtendsInterface";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_InterfaceExtendsInterface_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_0B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_146738 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (ArrayType __DEC_eTypeAccess_elementType_727329 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ArrayType.class, "elementType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_479008 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_3B(
			TypeAccess eTypeAccess) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_265982 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_4B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_150167 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_5B(
			TypeAccess eTypeAccess) {
		for (ParameterizedType __DEC_eTypeAccess_type_630079 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_711846 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_148932 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_27_1_matchtggpattern_blackBBB(
			InterfaceDeclaration eInterfaceDeclaration, TypeAccess eTypeAccess, InterfaceDeclaration eSuperInterface) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (eSuperInterface.equals(eTypeAccess.getType())) {
				if (eInterfaceDeclaration.getSuperInterfaces().contains(eTypeAccess)) {
					if (pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_0B(eTypeAccess) == null) {
						if (pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_1B(eTypeAccess) == null) {
							if (pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_2B(
									eTypeAccess) == null) {
								if (pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_3B(
										eTypeAccess) == null) {
									if (pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_4B(
											eTypeAccess) == null) {
										if (pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_5B(
												eTypeAccess) == null) {
											if (pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_6B(
													eTypeAccess) == null) {
												if (pattern_InterfaceExtendsInterface_27_1_matchtggpattern_black_nac_7B(
														eTypeAccess) == null) {
													return new Object[] { eInterfaceDeclaration, eTypeAccess,
															eSuperInterface };
												}
											}
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

	public static final boolean pattern_InterfaceExtendsInterface_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_28_1_matchtggpattern_blackBB(
			TInterface tSuperInterface, TInterface tInterface) {
		if (!tInterface.equals(tSuperInterface)) {
			if (tInterface.getParentInterfaces().contains(tSuperInterface)) {
				return new Object[] { tSuperInterface, tInterface };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_InterfaceExtendsInterface_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_1_createresult_blackB(
			InterfaceExtendsInterface _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration eInterfaceDeclaration) {
		if (ruleResult.getSourceObjects().contains(eInterfaceDeclaration)) {
			return new Object[] { ruleResult, eInterfaceDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eInterfaceDeclarationToTInterface) {
		if (ruleResult.getCorrObjects().contains(eInterfaceDeclarationToTInterface)) {
			return new Object[] { ruleResult, eInterfaceDeclarationToTInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TInterface tInterface) {
		if (ruleResult.getTargetObjects().contains(tInterface)) {
			return new Object[] { ruleResult, tInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TInterface tSuperInterface) {
		if (ruleResult.getTargetObjects().contains(tSuperInterface)) {
			return new Object[] { ruleResult, tSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		if (ruleResult.getCorrObjects().contains(eSuperInterfaceToTSuperInterface)) {
			return new Object[] { ruleResult, eSuperInterfaceToTSuperInterface };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, InterfaceDeclaration eSuperInterface) {
		if (ruleResult.getSourceObjects().contains(eSuperInterface)) {
			return new Object[] { ruleResult, eSuperInterface };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_InterfaceExtendsInterface_29_2_isapplicablecore_blackFFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eInterfaceDeclarationToTInterfaceList : ruleEntryContainer.getRuleEntryList()) {
			for (RuleEntryList eSuperInterfaceToTSuperInterfaceList : ruleEntryContainer.getRuleEntryList()) {
				if (!eInterfaceDeclarationToTInterfaceList.equals(eSuperInterfaceToTSuperInterfaceList)) {
					for (EObject tmpEInterfaceDeclarationToTInterface : eInterfaceDeclarationToTInterfaceList
							.getEntryObjects()) {
						if (tmpEInterfaceDeclarationToTInterface instanceof TypeToTAbstractType) {
							TypeToTAbstractType eInterfaceDeclarationToTInterface = (TypeToTAbstractType) tmpEInterfaceDeclarationToTInterface;
							Type tmpEInterfaceDeclaration = eInterfaceDeclarationToTInterface.getSource();
							if (tmpEInterfaceDeclaration instanceof InterfaceDeclaration) {
								InterfaceDeclaration eInterfaceDeclaration = (InterfaceDeclaration) tmpEInterfaceDeclaration;
								TAbstractType tmpTInterface = eInterfaceDeclarationToTInterface.getTarget();
								if (tmpTInterface instanceof TInterface) {
									TInterface tInterface = (TInterface) tmpTInterface;
									if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_1BB(
											ruleResult, eInterfaceDeclarationToTInterface) == null) {
										if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_0BB(
												ruleResult, eInterfaceDeclaration) == null) {
											if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_2BB(
													ruleResult, tInterface) == null) {
												for (EObject tmpESuperInterfaceToTSuperInterface : eSuperInterfaceToTSuperInterfaceList
														.getEntryObjects()) {
													if (tmpESuperInterfaceToTSuperInterface instanceof TypeToTAbstractType) {
														TypeToTAbstractType eSuperInterfaceToTSuperInterface = (TypeToTAbstractType) tmpESuperInterfaceToTSuperInterface;
														if (!eInterfaceDeclarationToTInterface
																.equals(eSuperInterfaceToTSuperInterface)) {
															TAbstractType tmpTSuperInterface = eSuperInterfaceToTSuperInterface
																	.getTarget();
															if (tmpTSuperInterface instanceof TInterface) {
																TInterface tSuperInterface = (TInterface) tmpTSuperInterface;
																if (!tInterface.equals(tSuperInterface)) {
																	Type tmpESuperInterface = eSuperInterfaceToTSuperInterface
																			.getSource();
																	if (tmpESuperInterface instanceof InterfaceDeclaration) {
																		InterfaceDeclaration eSuperInterface = (InterfaceDeclaration) tmpESuperInterface;
																		if (!eInterfaceDeclaration
																				.equals(eSuperInterface)) {
																			if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_4BB(
																					ruleResult,
																					eSuperInterfaceToTSuperInterface) == null) {
																				if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_3BB(
																						ruleResult,
																						tSuperInterface) == null) {
																					if (pattern_InterfaceExtendsInterface_29_2_isapplicablecore_black_nac_5BB(
																							ruleResult,
																							eSuperInterface) == null) {
																						_result.add(new Object[] {
																								eInterfaceDeclarationToTInterfaceList,
																								eInterfaceDeclaration,
																								eInterfaceDeclarationToTInterface,
																								tInterface,
																								eSuperInterfaceToTSuperInterfaceList,
																								tSuperInterface,
																								eSuperInterfaceToTSuperInterface,
																								eSuperInterface,
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
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_3_solveCSP_bindingFBBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eInterfaceDeclaration,
				tSuperInterface, tInterface, eInterfaceDeclarationToTInterface, eSuperInterface,
				eSuperInterfaceToTSuperInterface, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eInterfaceDeclaration, tSuperInterface, tInterface,
					eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			InterfaceExtendsInterface _this, IsApplicableMatch isApplicableMatch,
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_InterfaceExtendsInterface_29_3_solveCSP_binding = pattern_InterfaceExtendsInterface_29_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eInterfaceDeclaration, tSuperInterface, tInterface,
				eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface, ruleResult);
		if (result_pattern_InterfaceExtendsInterface_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_InterfaceExtendsInterface_29_3_solveCSP_binding[0];

			Object[] result_pattern_InterfaceExtendsInterface_29_3_solveCSP_black = pattern_InterfaceExtendsInterface_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_InterfaceExtendsInterface_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eInterfaceDeclaration, tSuperInterface, tInterface,
						eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface,
						ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_InterfaceExtendsInterface_29_4_checkCSP_expressionFBB(
			InterfaceExtendsInterface _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_5_checknacs_blackBBBBBB(
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (!tInterface.equals(tSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					return new Object[] { eInterfaceDeclaration, tSuperInterface, tInterface,
							eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_6_perform_blackBBBBBBB(
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			TypeToTAbstractType eInterfaceDeclarationToTInterface, InterfaceDeclaration eSuperInterface,
			TypeToTAbstractType eSuperInterfaceToTSuperInterface, ModelgeneratorRuleResult ruleResult) {
		if (!eInterfaceDeclaration.equals(eSuperInterface)) {
			if (!tInterface.equals(tSuperInterface)) {
				if (!eInterfaceDeclarationToTInterface.equals(eSuperInterfaceToTSuperInterface)) {
					return new Object[] { eInterfaceDeclaration, tSuperInterface, tInterface,
							eInterfaceDeclarationToTInterface, eSuperInterface, eSuperInterfaceToTSuperInterface,
							ruleResult };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_InterfaceExtendsInterface_29_6_perform_greenBFBBBB(
			InterfaceDeclaration eInterfaceDeclaration, TInterface tSuperInterface, TInterface tInterface,
			InterfaceDeclaration eSuperInterface, ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		tInterface.getParentInterfaces().add(tSuperInterface);
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eTypeAccess.setType(eSuperInterface);
		eInterfaceDeclaration.getSuperInterfaces().add(eTypeAccess);
		ruleResult.getSourceObjects().add(eTypeAccess);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eInterfaceDeclaration, eTypeAccess, tSuperInterface, tInterface, eSuperInterface,
				ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_InterfaceExtendsInterface_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //InterfaceExtendsInterfaceImpl
