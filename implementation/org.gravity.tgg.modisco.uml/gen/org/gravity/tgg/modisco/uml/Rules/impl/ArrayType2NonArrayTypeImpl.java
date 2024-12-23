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
import org.eclipse.modisco.java.Annotation;
import org.eclipse.modisco.java.AnnotationMemberValuePair;
import org.eclipse.modisco.java.ArrayType;
import org.eclipse.modisco.java.ClassDeclaration;
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.SingleVariableDeclaration;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.eclipse.uml2.uml.Element;

import org.gravity.tgg.modisco.uml.ASTNode2Element;

import org.gravity.tgg.modisco.uml.Rules.ArrayType2NonArrayType;
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
 * An implementation of the model object '<em><b>Array Type2 Non Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ArrayType2NonArrayTypeImpl extends AbstractRuleImpl implements ArrayType2NonArrayType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayType2NonArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getArrayType2NonArrayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, TypeAccess typeAccess, ArrayType arrayType, Type jType) {

		Object[] result1_black = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_0_1_initialbindings_blackBBBBB(this, match, typeAccess, arrayType,
						jType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeAccess] = " + typeAccess + ", " + "[arrayType] = " + arrayType
					+ ", " + "[jType] = " + jType + ".");
		}

		Object[] result2_bindingAndBlack = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_0_2_SolveCSP_bindingAndBlackFBBBBB(this, match, typeAccess, arrayType,
						jType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[typeAccess] = " + typeAccess + ", " + "[arrayType] = " + arrayType
					+ ", " + "[jType] = " + jType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_0_4_collectelementstobetranslated_blackBBBB(match, typeAccess,
							arrayType, jType);
			if (result4_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[typeAccess] = "
								+ typeAccess + ", " + "[arrayType] = " + arrayType + ", " + "[jType] = " + jType + ".");
			}
			ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_0_4_collectelementstobetranslated_greenBBBBFFF(
					match, typeAccess, arrayType, jType);
			//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge arrayType__typeAccess____elementType = (EMoflonEdge) result4_green[6];

			Object[] result5_black = ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_0_5_collectcontextelements_blackBBBB(match, typeAccess, arrayType,
							jType);
			if (result5_black == null) {
				throw new RuntimeException(
						"Pattern matching failed." + " Variables: " + "[match] = " + match + ", " + "[typeAccess] = "
								+ typeAccess + ", " + "[arrayType] = " + arrayType + ", " + "[jType] = " + jType + ".");
			}
			ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_0_5_collectcontextelements_greenBB(match, jType);

			// 
			ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_0_6_registerobjectstomatch_expressionBBBBB(this,
					match, typeAccess, arrayType, jType);
			return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_0_7_expressionF();
		} else {
			return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_1_1_performtransformation_bindingAndBlackFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeAccess typeAccess = (TypeAccess) result1_bindingAndBlack[0];
		ASTNode2Element ne2ne1 = (ASTNode2Element) result1_bindingAndBlack[1];
		ArrayType arrayType = (ArrayType) result1_bindingAndBlack[2];
		Type jType = (Type) result1_bindingAndBlack[3];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result1_bindingAndBlack[4];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[5];
		Object[] result1_green = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_1_1_performtransformation_greenFBB(arrayType, uType);
		ASTNode2Element ne2ne2 = (ASTNode2Element) result1_green[0];

		Object[] result2_black = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_1_2_collecttranslatedelements_blackBBB(typeAccess, ne2ne2, arrayType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeAccess] = " + typeAccess
					+ ", " + "[ne2ne2] = " + ne2ne2 + ", " + "[arrayType] = " + arrayType + ".");
		}
		Object[] result2_green = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_1_2_collecttranslatedelements_greenFBBB(typeAccess, ne2ne2, arrayType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, typeAccess, ne2ne2,
						ne2ne1, arrayType, jType, uType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[typeAccess] = " + typeAccess + ", " + "[ne2ne2] = " + ne2ne2 + ", " + "[ne2ne1] = "
					+ ne2ne1 + ", " + "[arrayType] = " + arrayType + ", " + "[jType] = " + jType + ", " + "[uType] = "
					+ uType + ".");
		}
		ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_1_3_bookkeepingforedges_greenBBBBBBFFFFF(ruleresult,
				typeAccess, ne2ne2, arrayType, jType, uType);
		//nothing EMoflonEdge ne2ne2__arrayType____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge arrayType__typeAccess____elementType = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge ne2ne2__uType____target = (EMoflonEdge) result3_green[10];

		// 
		// 
		ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_1_5_registerobjects_expressionBBBBBBBB(this,
				ruleresult, typeAccess, ne2ne2, ne2ne1, arrayType, jType, uType);
		return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_2_2_corematch_bindingFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		TypeAccess typeAccess = (TypeAccess) result2_binding[0];
		ArrayType arrayType = (ArrayType) result2_binding[1];
		Type jType = (Type) result2_binding[2];
		for (Object[] result2_black : ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_2_2_corematch_blackBFBBFB(typeAccess, arrayType, jType, match)) {
			ASTNode2Element ne2ne1 = (ASTNode2Element) result2_black[1];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[4];
			// ForEach 
			for (Object[] result3_black : ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_2_3_findcontext_blackBBBBB(typeAccess, ne2ne1, arrayType, jType,
							uType)) {
				Object[] result3_green = ArrayType2NonArrayTypeImpl
						.pattern_ArrayType2NonArrayType_2_3_findcontext_greenBBBBBFFFFFF(typeAccess, ne2ne1, arrayType,
								jType, uType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[5];
				//nothing EMoflonEdge typeAccess__jType____type = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge jType__typeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge ne2ne1__jType____source = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge arrayType__typeAccess____elementType = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge ne2ne1__uType____target = (EMoflonEdge) result3_green[10];

				Object[] result4_bindingAndBlack = ArrayType2NonArrayTypeImpl
						.pattern_ArrayType2NonArrayType_2_4_solveCSP_bindingAndBlackFBBBBBBB(this, isApplicableMatch,
								typeAccess, ne2ne1, arrayType, jType, uType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[typeAccess] = " + typeAccess
							+ ", " + "[ne2ne1] = " + ne2ne1 + ", " + "[arrayType] = " + arrayType + ", " + "[jType] = "
							+ jType + ", " + "[uType] = " + uType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ArrayType2NonArrayTypeImpl
							.pattern_ArrayType2NonArrayType_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, TypeAccess typeAccess, ArrayType arrayType, Type jType) {
		match.registerObject("typeAccess", typeAccess);
		match.registerObject("arrayType", arrayType);
		match.registerObject("jType", jType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, TypeAccess typeAccess, ArrayType arrayType, Type jType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeAccess typeAccess,
			ASTNode2Element ne2ne1, ArrayType arrayType, Type jType, org.eclipse.uml2.uml.Type uType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("typeAccess", typeAccess);
		isApplicableMatch.registerObject("ne2ne1", ne2ne1);
		isApplicableMatch.registerObject("arrayType", arrayType);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("uType", uType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject typeAccess, EObject ne2ne2, EObject ne2ne1,
			EObject arrayType, EObject jType, EObject uType) {
		ruleresult.registerObject("typeAccess", typeAccess);
		ruleresult.registerObject("ne2ne2", ne2ne2);
		ruleresult.registerObject("ne2ne1", ne2ne1);
		ruleresult.registerObject("arrayType", arrayType);
		ruleresult.registerObject("jType", jType);
		ruleresult.registerObject("uType", uType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("typeAccess").eClass())
						.equals("java.TypeAccess.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("arrayType").eClass())
						.equals("java.ArrayType.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, org.eclipse.uml2.uml.Type uType) {

		Object[] result1_black = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_10_1_initialbindings_blackBBB(this, match, uType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uType] = " + uType + ".");
		}

		Object[] result2_bindingAndBlack = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_10_2_SolveCSP_bindingAndBlackFBBB(this, match, uType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[uType] = " + uType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_10_4_collectelementstobetranslated_blackBB(match, uType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uType] = " + uType + ".");
			}

			Object[] result5_black = ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_10_5_collectcontextelements_blackBB(match, uType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[uType] = " + uType + ".");
			}
			ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_10_5_collectcontextelements_greenBB(match, uType);

			// 
			ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_10_6_registerobjectstomatch_expressionBBB(this,
					match, uType);
			return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_10_7_expressionF();
		} else {
			return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, org.eclipse.uml2.uml.Type uType) {
		match.registerObject("uType", uType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, org.eclipse.uml2.uml.Type uType) {// Create CSP
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
	public boolean checkTypes_BWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Type_6(org.eclipse.uml2.uml.Type uType) {

		Object[] result1_bindingAndBlack = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_17_2_testcorematchandDECs_blackB(uType)) {
			Object[] result2_green = ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, uType)) {
				// 
				if (ArrayType2NonArrayTypeImpl
						.pattern_ArrayType2NonArrayType_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ArrayType2NonArrayTypeImpl
							.pattern_ArrayType2NonArrayType_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_17_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_1166(EMoflonEdge _edge_type) {

		Object[] result1_bindingAndBlack = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_blackFFFB(_edge_type)) {
			TypeAccess typeAccess = (TypeAccess) result2_black[0];
			ArrayType arrayType = (ArrayType) result2_black[1];
			Type jType = (Type) result2_black[2];
			Object[] result2_green = ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
							this, match, typeAccess, arrayType, jType)) {
				// 
				if (ArrayType2NonArrayTypeImpl
						.pattern_ArrayType2NonArrayType_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = ArrayType2NonArrayTypeImpl
							.pattern_ArrayType2NonArrayType_18_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_18_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ArrayType2NonArrayType");
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
		ruleResult.setRule("ArrayType2NonArrayType");
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

		Object[] result1_black = ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TypeAccess typeAccess = (TypeAccess) result2_bindingAndBlack[0];
		ArrayType arrayType = (ArrayType) result2_bindingAndBlack[1];
		Type jType = (Type) result2_bindingAndBlack[2];
		org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_21_3_solvecsp_bindingAndBlackFBBBBBBB(this, typeAccess, arrayType,
						jType, uType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[typeAccess] = " + typeAccess + ", " + "[arrayType] = " + arrayType + ", " + "[jType] = " + jType
					+ ", " + "[uType] = " + uType + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_21_5_matchcorrcontext_blackFBBBB(jType, uType, sourceMatch,
							targetMatch)) {
				ASTNode2Element ne2ne1 = (ASTNode2Element) result5_black[0];
				Object[] result5_green = ArrayType2NonArrayTypeImpl
						.pattern_ArrayType2NonArrayType_21_5_matchcorrcontext_greenBBBF(ne2ne1, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = ArrayType2NonArrayTypeImpl
						.pattern_ArrayType2NonArrayType_21_6_createcorrespondence_blackBBBBB(typeAccess, arrayType,
								jType, uType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeAccess] = "
							+ typeAccess + ", " + "[arrayType] = " + arrayType + ", " + "[jType] = " + jType + ", "
							+ "[uType] = " + uType + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_21_6_createcorrespondence_greenFBBB(arrayType,
						uType, ccMatch);
				//nothing ASTNode2Element ne2ne2 = (ASTNode2Element) result6_green[0];

				Object[] result7_black = ArrayType2NonArrayTypeImpl
						.pattern_ArrayType2NonArrayType_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_21_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TypeAccess typeAccess, ArrayType arrayType, Type jType,
			org.eclipse.uml2.uml.Type uType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(TypeAccess typeAccess, ArrayType arrayType, Type jType) {// 
		Object[] result1_black = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_24_1_matchtggpattern_blackBBB(typeAccess, arrayType, jType);
		if (result1_black != null) {
			return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_24_2_expressionF();
		} else {
			return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(org.eclipse.uml2.uml.Type uType) {// 
		Object[] result1_black = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_25_1_matchtggpattern_blackB(uType);
		if (result1_black != null) {
			return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_25_2_expressionF();
		} else {
			return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			ASTNode2Element ne2ne1Parameter) {

		Object[] result1_black = ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ArrayType2NonArrayTypeImpl
				.pattern_ArrayType2NonArrayType_26_2_isapplicablecore_blackFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList ne2ne1List = (RuleEntryList) result2_black[0];
			ASTNode2Element ne2ne1 = (ASTNode2Element) result2_black[1];
			Type jType = (Type) result2_black[2];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result2_black[3];

			Object[] result3_bindingAndBlack = ArrayType2NonArrayTypeImpl
					.pattern_ArrayType2NonArrayType_26_3_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
							ne2ne1, jType, uType, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ne2ne1] = " + ne2ne1 + ", "
						+ "[jType] = " + jType + ", " + "[uType] = " + uType + ", " + "[ruleResult] = " + ruleResult
						+ ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ArrayType2NonArrayTypeImpl
						.pattern_ArrayType2NonArrayType_26_5_checknacs_blackBBB(ne2ne1, jType, uType);
				if (result5_black != null) {

					Object[] result6_black = ArrayType2NonArrayTypeImpl
							.pattern_ArrayType2NonArrayType_26_6_perform_blackBBBB(ne2ne1, jType, uType, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ne2ne1] = " + ne2ne1
								+ ", " + "[jType] = " + jType + ", " + "[uType] = " + uType + ", " + "[ruleResult] = "
								+ ruleResult + ".");
					}
					ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_26_6_perform_greenFFFBBB(jType, uType,
							ruleResult);
					//nothing TypeAccess typeAccess = (TypeAccess) result6_green[0];
					//nothing ASTNode2Element ne2ne2 = (ASTNode2Element) result6_green[1];
					//nothing ArrayType arrayType = (ArrayType) result6_green[2];

				} else {
				}

			} else {
			}

		}
		return ArrayType2NonArrayTypeImpl.pattern_ArrayType2NonArrayType_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne1, Type jType,
			org.eclipse.uml2.uml.Type uType, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("ne2ne1", ne2ne1);
		isApplicableMatch.registerObject("jType", jType);
		isApplicableMatch.registerObject("uType", uType);
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
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPROPRIATE_FWD__MATCH_TYPEACCESS_ARRAYTYPE_TYPE:
				return isAppropriate_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
						(ArrayType) arguments.get(2), (Type) arguments.get(3));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___PERFORM_FWD__ISAPPLICABLEMATCH:
				return perform_FWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPLICABLE_FWD__MATCH:
				return isApplicable_FWD((Match) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPEACCESS_ARRAYTYPE_TYPE:
				registerObjectsToMatch_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
						(ArrayType) arguments.get(2), (Type) arguments.get(3));
				return null;
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPEACCESS_ARRAYTYPE_TYPE:
				return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (TypeAccess) arguments.get(1),
						(ArrayType) arguments.get(2), (Type) arguments.get(3));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
				return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPEACCESS_ASTNODE2ELEMENT_ARRAYTYPE_TYPE_TYPE:
				return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (TypeAccess) arguments.get(1),
						(ASTNode2Element) arguments.get(2), (ArrayType) arguments.get(3), (Type) arguments.get(4),
						(org.eclipse.uml2.uml.Type) arguments.get(5));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
				return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
				registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
						(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
						(EObject) arguments.get(5), (EObject) arguments.get(6));
				return null;
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___CHECK_TYPES_FWD__MATCH:
				return checkTypes_FWD((Match) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPROPRIATE_BWD__MATCH_TYPE:
				return isAppropriate_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Type) arguments.get(1));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___PERFORM_BWD__ISAPPLICABLEMATCH:
				return perform_BWD((IsApplicableMatch) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPLICABLE_BWD__MATCH:
				return isApplicable_BWD((Match) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPE:
				registerObjectsToMatch_BWD((Match) arguments.get(0), (org.eclipse.uml2.uml.Type) arguments.get(1));
				return null;
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPE:
				return isAppropriate_solveCsp_BWD((Match) arguments.get(0),
						(org.eclipse.uml2.uml.Type) arguments.get(1));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
				return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___CHECK_TYPES_BWD__MATCH:
				return checkTypes_BWD((Match) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPROPRIATE_BWD_TYPE_6__TYPE:
				return isAppropriate_BWD_Type_6((org.eclipse.uml2.uml.Type) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1166__EMOFLONEDGE:
				return isAppropriate_FWD_EMoflonEdge_1166((EMoflonEdge) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
				return checkAttributes_FWD((TripleMatch) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
				return checkAttributes_BWD((TripleMatch) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPLICABLE_CC__MATCH_MATCH:
				return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPLICABLE_SOLVE_CSP_CC__TYPEACCESS_ARRAYTYPE_TYPE_TYPE_MATCH_MATCH:
				return isApplicable_solveCsp_CC((TypeAccess) arguments.get(0), (ArrayType) arguments.get(1),
						(Type) arguments.get(2), (org.eclipse.uml2.uml.Type) arguments.get(3), (Match) arguments.get(4),
						(Match) arguments.get(5));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
				return isApplicable_checkCsp_CC((CSP) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___CHECK_DEC_FWD__TYPEACCESS_ARRAYTYPE_TYPE:
				return checkDEC_FWD((TypeAccess) arguments.get(0), (ArrayType) arguments.get(1),
						(Type) arguments.get(2));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___CHECK_DEC_BWD__TYPE:
				return checkDEC_BWD((org.eclipse.uml2.uml.Type) arguments.get(0));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___GENERATE_MODEL__RULEENTRYCONTAINER_ASTNODE2ELEMENT:
				return generateModel((RuleEntryContainer) arguments.get(0), (ASTNode2Element) arguments.get(1));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_ASTNODE2ELEMENT_TYPE_TYPE_MODELGENERATORRULERESULT:
				return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
						(ASTNode2Element) arguments.get(1), (Type) arguments.get(2),
						(org.eclipse.uml2.uml.Type) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
			case RulesPackage.ARRAY_TYPE2_NON_ARRAY_TYPE___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
				return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ArrayType2NonArrayType_0_1_initialbindings_blackBBBBB(
			ArrayType2NonArrayType _this, Match match, TypeAccess typeAccess, ArrayType arrayType, Type jType) {
		if (!arrayType.equals(jType)) {
			return new Object[] { _this, match, typeAccess, arrayType, jType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_0_2_SolveCSP_bindingFBBBBB(ArrayType2NonArrayType _this,
			Match match, TypeAccess typeAccess, ArrayType arrayType, Type jType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, typeAccess, arrayType, jType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeAccess, arrayType, jType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_0_2_SolveCSP_bindingAndBlackFBBBBB(
			ArrayType2NonArrayType _this, Match match, TypeAccess typeAccess, ArrayType arrayType, Type jType) {
		Object[] result_pattern_ArrayType2NonArrayType_0_2_SolveCSP_binding = pattern_ArrayType2NonArrayType_0_2_SolveCSP_bindingFBBBBB(
				_this, match, typeAccess, arrayType, jType);
		if (result_pattern_ArrayType2NonArrayType_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayType2NonArrayType_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayType2NonArrayType_0_2_SolveCSP_black = pattern_ArrayType2NonArrayType_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayType2NonArrayType_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeAccess, arrayType, jType };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayType2NonArrayType_0_3_CheckCSP_expressionFBB(ArrayType2NonArrayType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_0_4_collectelementstobetranslated_blackBBBB(Match match,
			TypeAccess typeAccess, ArrayType arrayType, Type jType) {
		if (!arrayType.equals(jType)) {
			return new Object[] { match, typeAccess, arrayType, jType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_0_4_collectelementstobetranslated_greenBBBBFFF(
			Match match, TypeAccess typeAccess, ArrayType arrayType, Type jType) {
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge arrayType__typeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(typeAccess);
		match.getToBeTranslatedNodes().add(arrayType);
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String arrayType__typeAccess____elementType_name_prime = "elementType";
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		match.getToBeTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		arrayType__typeAccess____elementType.setSrc(arrayType);
		arrayType__typeAccess____elementType.setTrg(typeAccess);
		match.getToBeTranslatedEdges().add(arrayType__typeAccess____elementType);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		arrayType__typeAccess____elementType.setName(arrayType__typeAccess____elementType_name_prime);
		return new Object[] { match, typeAccess, arrayType, jType, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, arrayType__typeAccess____elementType };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_0_5_collectcontextelements_blackBBBB(Match match,
			TypeAccess typeAccess, ArrayType arrayType, Type jType) {
		if (!arrayType.equals(jType)) {
			return new Object[] { match, typeAccess, arrayType, jType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_0_5_collectcontextelements_greenBB(Match match,
			Type jType) {
		match.getContextNodes().add(jType);
		return new Object[] { match, jType };
	}

	public static final void pattern_ArrayType2NonArrayType_0_6_registerobjectstomatch_expressionBBBBB(
			ArrayType2NonArrayType _this, Match match, TypeAccess typeAccess, ArrayType arrayType, Type jType) {
		_this.registerObjectsToMatch_FWD(match, typeAccess, arrayType, jType);

	}

	public static final boolean pattern_ArrayType2NonArrayType_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayType2NonArrayType_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_1_1_performtransformation_bindingFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("typeAccess");
		EObject _localVariable_1 = isApplicableMatch.getObject("ne2ne1");
		EObject _localVariable_2 = isApplicableMatch.getObject("arrayType");
		EObject _localVariable_3 = isApplicableMatch.getObject("jType");
		EObject _localVariable_4 = isApplicableMatch.getObject("uType");
		EObject tmpTypeAccess = _localVariable_0;
		EObject tmpNe2ne1 = _localVariable_1;
		EObject tmpArrayType = _localVariable_2;
		EObject tmpJType = _localVariable_3;
		EObject tmpUType = _localVariable_4;
		if (tmpTypeAccess instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
			if (tmpNe2ne1 instanceof ASTNode2Element) {
				ASTNode2Element ne2ne1 = (ASTNode2Element) tmpNe2ne1;
				if (tmpArrayType instanceof ArrayType) {
					ArrayType arrayType = (ArrayType) tmpArrayType;
					if (tmpJType instanceof Type) {
						Type jType = (Type) tmpJType;
						if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
							org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
							return new Object[] { typeAccess, ne2ne1, arrayType, jType, uType, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_1_1_performtransformation_blackBBBBBFBB(
			TypeAccess typeAccess, ASTNode2Element ne2ne1, ArrayType arrayType, Type jType,
			org.eclipse.uml2.uml.Type uType, ArrayType2NonArrayType _this, IsApplicableMatch isApplicableMatch) {
		if (!arrayType.equals(jType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { typeAccess, ne2ne1, arrayType, jType, uType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_1_1_performtransformation_bindingAndBlackFFFFFFBB(
			ArrayType2NonArrayType _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ArrayType2NonArrayType_1_1_performtransformation_binding = pattern_ArrayType2NonArrayType_1_1_performtransformation_bindingFFFFFB(
				isApplicableMatch);
		if (result_pattern_ArrayType2NonArrayType_1_1_performtransformation_binding != null) {
			TypeAccess typeAccess = (TypeAccess) result_pattern_ArrayType2NonArrayType_1_1_performtransformation_binding[0];
			ASTNode2Element ne2ne1 = (ASTNode2Element) result_pattern_ArrayType2NonArrayType_1_1_performtransformation_binding[1];
			ArrayType arrayType = (ArrayType) result_pattern_ArrayType2NonArrayType_1_1_performtransformation_binding[2];
			Type jType = (Type) result_pattern_ArrayType2NonArrayType_1_1_performtransformation_binding[3];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_ArrayType2NonArrayType_1_1_performtransformation_binding[4];

			Object[] result_pattern_ArrayType2NonArrayType_1_1_performtransformation_black = pattern_ArrayType2NonArrayType_1_1_performtransformation_blackBBBBBFBB(
					typeAccess, ne2ne1, arrayType, jType, uType, _this, isApplicableMatch);
			if (result_pattern_ArrayType2NonArrayType_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ArrayType2NonArrayType_1_1_performtransformation_black[5];

				return new Object[] { typeAccess, ne2ne1, arrayType, jType, uType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_1_1_performtransformation_greenFBB(ArrayType arrayType,
			org.eclipse.uml2.uml.Type uType) {
		ASTNode2Element ne2ne2 = UmlFactory.eINSTANCE.createASTNode2Element();
		ne2ne2.setSource(arrayType);
		ne2ne2.setTarget(uType);
		return new Object[] { ne2ne2, arrayType, uType };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_1_2_collecttranslatedelements_blackBBB(
			TypeAccess typeAccess, ASTNode2Element ne2ne2, ArrayType arrayType) {
		return new Object[] { typeAccess, ne2ne2, arrayType };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_1_2_collecttranslatedelements_greenFBBB(
			TypeAccess typeAccess, ASTNode2Element ne2ne2, ArrayType arrayType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(typeAccess);
		ruleresult.getCreatedLinkElements().add(ne2ne2);
		ruleresult.getTranslatedElements().add(arrayType);
		return new Object[] { ruleresult, typeAccess, ne2ne2, arrayType };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject typeAccess, EObject ne2ne2, EObject ne2ne1, EObject arrayType,
			EObject jType, EObject uType) {
		if (!typeAccess.equals(uType)) {
			if (!ne2ne2.equals(typeAccess)) {
				if (!ne2ne2.equals(uType)) {
					if (!ne2ne1.equals(typeAccess)) {
						if (!ne2ne1.equals(ne2ne2)) {
							if (!ne2ne1.equals(uType)) {
								if (!arrayType.equals(typeAccess)) {
									if (!arrayType.equals(ne2ne2)) {
										if (!arrayType.equals(ne2ne1)) {
											if (!arrayType.equals(jType)) {
												if (!arrayType.equals(uType)) {
													if (!jType.equals(typeAccess)) {
														if (!jType.equals(ne2ne2)) {
															if (!jType.equals(ne2ne1)) {
																if (!jType.equals(uType)) {
																	return new Object[] { ruleresult, typeAccess,
																			ne2ne2, ne2ne1, arrayType, jType, uType };
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ArrayType2NonArrayType_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject typeAccess, EObject ne2ne2, EObject arrayType, EObject jType,
			EObject uType) {
		EMoflonEdge ne2ne2__arrayType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge arrayType__typeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne2__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ArrayType2NonArrayType";
		String ne2ne2__arrayType____source_name_prime = "source";
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String arrayType__typeAccess____elementType_name_prime = "elementType";
		String ne2ne2__uType____target_name_prime = "target";
		ne2ne2__arrayType____source.setSrc(ne2ne2);
		ne2ne2__arrayType____source.setTrg(arrayType);
		ruleresult.getCreatedEdges().add(ne2ne2__arrayType____source);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		ruleresult.getTranslatedEdges().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(jType__typeAccess____usagesInTypeAccess);
		arrayType__typeAccess____elementType.setSrc(arrayType);
		arrayType__typeAccess____elementType.setTrg(typeAccess);
		ruleresult.getTranslatedEdges().add(arrayType__typeAccess____elementType);
		ne2ne2__uType____target.setSrc(ne2ne2);
		ne2ne2__uType____target.setTrg(uType);
		ruleresult.getCreatedEdges().add(ne2ne2__uType____target);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		ne2ne2__arrayType____source.setName(ne2ne2__arrayType____source_name_prime);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		arrayType__typeAccess____elementType.setName(arrayType__typeAccess____elementType_name_prime);
		ne2ne2__uType____target.setName(ne2ne2__uType____target_name_prime);
		return new Object[] { ruleresult, typeAccess, ne2ne2, arrayType, jType, uType, ne2ne2__arrayType____source,
				typeAccess__jType____type, jType__typeAccess____usagesInTypeAccess,
				arrayType__typeAccess____elementType, ne2ne2__uType____target };
	}

	public static final void pattern_ArrayType2NonArrayType_1_5_registerobjects_expressionBBBBBBBB(
			ArrayType2NonArrayType _this, PerformRuleResult ruleresult, EObject typeAccess, EObject ne2ne2,
			EObject ne2ne1, EObject arrayType, EObject jType, EObject uType) {
		_this.registerObjects_FWD(ruleresult, typeAccess, ne2ne2, ne2ne1, arrayType, jType, uType);

	}

	public static final PerformRuleResult pattern_ArrayType2NonArrayType_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_bindingFB(
			ArrayType2NonArrayType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ArrayType2NonArrayType _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_bindingAndBlackFFB(
			ArrayType2NonArrayType _this) {
		Object[] result_pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_binding = pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_black = pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ArrayType2NonArrayType";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_2_corematch_bindingFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("typeAccess");
		EObject _localVariable_1 = match.getObject("arrayType");
		EObject _localVariable_2 = match.getObject("jType");
		EObject tmpTypeAccess = _localVariable_0;
		EObject tmpArrayType = _localVariable_1;
		EObject tmpJType = _localVariable_2;
		if (tmpTypeAccess instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
			if (tmpArrayType instanceof ArrayType) {
				ArrayType arrayType = (ArrayType) tmpArrayType;
				if (tmpJType instanceof Type) {
					Type jType = (Type) tmpJType;
					return new Object[] { typeAccess, arrayType, jType, match };
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayType2NonArrayType_2_2_corematch_blackBFBBFB(
			TypeAccess typeAccess, ArrayType arrayType, Type jType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!arrayType.equals(jType)) {
			for (ASTNode2Element ne2ne1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jType,
					ASTNode2Element.class, "source")) {
				Element tmpUType = ne2ne1.getTarget();
				if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
					org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
					_result.add(new Object[] { typeAccess, ne2ne1, arrayType, jType, uType, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayType2NonArrayType_2_3_findcontext_blackBBBBB(
			TypeAccess typeAccess, ASTNode2Element ne2ne1, ArrayType arrayType, Type jType,
			org.eclipse.uml2.uml.Type uType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!arrayType.equals(jType)) {
			if (jType.equals(typeAccess.getType())) {
				if (jType.equals(ne2ne1.getSource())) {
					if (typeAccess.equals(arrayType.getElementType())) {
						if (uType.equals(ne2ne1.getTarget())) {
							_result.add(new Object[] { typeAccess, ne2ne1, arrayType, jType, uType });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_3_findcontext_greenBBBBBFFFFFF(TypeAccess typeAccess,
			ASTNode2Element ne2ne1, ArrayType arrayType, Type jType, org.eclipse.uml2.uml.Type uType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge typeAccess__jType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jType__typeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne1__jType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge arrayType__typeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ne2ne1__uType____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String typeAccess__jType____type_name_prime = "type";
		String jType__typeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String ne2ne1__jType____source_name_prime = "source";
		String arrayType__typeAccess____elementType_name_prime = "elementType";
		String ne2ne1__uType____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(typeAccess);
		isApplicableMatch.getAllContextElements().add(ne2ne1);
		isApplicableMatch.getAllContextElements().add(arrayType);
		isApplicableMatch.getAllContextElements().add(jType);
		isApplicableMatch.getAllContextElements().add(uType);
		typeAccess__jType____type.setSrc(typeAccess);
		typeAccess__jType____type.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(typeAccess__jType____type);
		jType__typeAccess____usagesInTypeAccess.setSrc(jType);
		jType__typeAccess____usagesInTypeAccess.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(jType__typeAccess____usagesInTypeAccess);
		ne2ne1__jType____source.setSrc(ne2ne1);
		ne2ne1__jType____source.setTrg(jType);
		isApplicableMatch.getAllContextElements().add(ne2ne1__jType____source);
		arrayType__typeAccess____elementType.setSrc(arrayType);
		arrayType__typeAccess____elementType.setTrg(typeAccess);
		isApplicableMatch.getAllContextElements().add(arrayType__typeAccess____elementType);
		ne2ne1__uType____target.setSrc(ne2ne1);
		ne2ne1__uType____target.setTrg(uType);
		isApplicableMatch.getAllContextElements().add(ne2ne1__uType____target);
		typeAccess__jType____type.setName(typeAccess__jType____type_name_prime);
		jType__typeAccess____usagesInTypeAccess.setName(jType__typeAccess____usagesInTypeAccess_name_prime);
		ne2ne1__jType____source.setName(ne2ne1__jType____source_name_prime);
		arrayType__typeAccess____elementType.setName(arrayType__typeAccess____elementType_name_prime);
		ne2ne1__uType____target.setName(ne2ne1__uType____target_name_prime);
		return new Object[] { typeAccess, ne2ne1, arrayType, jType, uType, isApplicableMatch, typeAccess__jType____type,
				jType__typeAccess____usagesInTypeAccess, ne2ne1__jType____source, arrayType__typeAccess____elementType,
				ne2ne1__uType____target };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_4_solveCSP_bindingFBBBBBBB(
			ArrayType2NonArrayType _this, IsApplicableMatch isApplicableMatch, TypeAccess typeAccess,
			ASTNode2Element ne2ne1, ArrayType arrayType, Type jType, org.eclipse.uml2.uml.Type uType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, typeAccess, ne2ne1, arrayType, jType,
				uType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, typeAccess, ne2ne1, arrayType, jType, uType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_4_solveCSP_bindingAndBlackFBBBBBBB(
			ArrayType2NonArrayType _this, IsApplicableMatch isApplicableMatch, TypeAccess typeAccess,
			ASTNode2Element ne2ne1, ArrayType arrayType, Type jType, org.eclipse.uml2.uml.Type uType) {
		Object[] result_pattern_ArrayType2NonArrayType_2_4_solveCSP_binding = pattern_ArrayType2NonArrayType_2_4_solveCSP_bindingFBBBBBBB(
				_this, isApplicableMatch, typeAccess, ne2ne1, arrayType, jType, uType);
		if (result_pattern_ArrayType2NonArrayType_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayType2NonArrayType_2_4_solveCSP_binding[0];

			Object[] result_pattern_ArrayType2NonArrayType_2_4_solveCSP_black = pattern_ArrayType2NonArrayType_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayType2NonArrayType_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, typeAccess, ne2ne1, arrayType, jType, uType };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayType2NonArrayType_2_5_checkCSP_expressionFBB(ArrayType2NonArrayType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ArrayType2NonArrayType";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayType2NonArrayType_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_10_1_initialbindings_blackBBB(
			ArrayType2NonArrayType _this, Match match, org.eclipse.uml2.uml.Type uType) {
		return new Object[] { _this, match, uType };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_10_2_SolveCSP_bindingFBBB(ArrayType2NonArrayType _this,
			Match match, org.eclipse.uml2.uml.Type uType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, uType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, uType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_10_2_SolveCSP_bindingAndBlackFBBB(
			ArrayType2NonArrayType _this, Match match, org.eclipse.uml2.uml.Type uType) {
		Object[] result_pattern_ArrayType2NonArrayType_10_2_SolveCSP_binding = pattern_ArrayType2NonArrayType_10_2_SolveCSP_bindingFBBB(
				_this, match, uType);
		if (result_pattern_ArrayType2NonArrayType_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayType2NonArrayType_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayType2NonArrayType_10_2_SolveCSP_black = pattern_ArrayType2NonArrayType_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayType2NonArrayType_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, uType };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayType2NonArrayType_10_3_CheckCSP_expressionFBB(ArrayType2NonArrayType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_10_4_collectelementstobetranslated_blackBB(Match match,
			org.eclipse.uml2.uml.Type uType) {
		return new Object[] { match, uType };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_10_5_collectcontextelements_blackBB(Match match,
			org.eclipse.uml2.uml.Type uType) {
		return new Object[] { match, uType };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_10_5_collectcontextelements_greenBB(Match match,
			org.eclipse.uml2.uml.Type uType) {
		match.getContextNodes().add(uType);
		return new Object[] { match, uType };
	}

	public static final void pattern_ArrayType2NonArrayType_10_6_registerobjectstomatch_expressionBBB(
			ArrayType2NonArrayType _this, Match match, org.eclipse.uml2.uml.Type uType) {
		_this.registerObjectsToMatch_BWD(match, uType);

	}

	public static final boolean pattern_ArrayType2NonArrayType_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayType2NonArrayType_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_bindingFB(
			ArrayType2NonArrayType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ArrayType2NonArrayType _this) {
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

	public static final Object[] pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ArrayType2NonArrayType _this) {
		Object[] result_pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_binding = pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_black = pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ArrayType2NonArrayType_17_2_testcorematchandDECs_blackB(
			org.eclipse.uml2.uml.Type uType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { uType });
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ArrayType2NonArrayType_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			ArrayType2NonArrayType _this, Match match, org.eclipse.uml2.uml.Type uType) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, uType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ArrayType2NonArrayType_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ArrayType2NonArrayType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ArrayType2NonArrayType_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_bindingFB(
			ArrayType2NonArrayType _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ArrayType2NonArrayType _this) {
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

	public static final Object[] pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_bindingAndBlackFFBF(
			ArrayType2NonArrayType _this) {
		Object[] result_pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_binding = pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_black = pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess typeAccess, Type jType) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_67574 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_67574)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_389948 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_781603 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_781603)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_3B(
			TypeAccess typeAccess) {
		for (MethodDeclaration __DEC_typeAccess_returnType_607580 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_4BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_266745 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_266745)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_5B(
			TypeAccess typeAccess) {
		for (SingleVariableDeclaration __DEC_typeAccess_type_141158 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_430751 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_blackFFFB(
			EMoflonEdge _edge_type) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTypeAccess = _edge_type.getSrc();
		if (tmpTypeAccess instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
			EObject tmpJType = _edge_type.getTrg();
			if (tmpJType instanceof Type) {
				Type jType = (Type) tmpJType;
				if (jType.equals(typeAccess.getType())) {
					if (pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_1B(typeAccess) == null) {
						if (pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_3B(typeAccess) == null) {
							if (pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_5B(
									typeAccess) == null) {
								if (pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_6B(
										typeAccess) == null) {
									if (pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_0BB(
											typeAccess, jType) == null) {
										if (pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_2BB(
												typeAccess, jType) == null) {
											if (pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_black_nac_4BB(
													typeAccess, jType) == null) {
												for (ArrayType arrayType : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(typeAccess, ArrayType.class,
																"elementType")) {
													if (!arrayType.equals(jType)) {
														_result.add(new Object[] { typeAccess, arrayType, jType,
																_edge_type });
													}
												}
											}
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

	public static final Object[] pattern_ArrayType2NonArrayType_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ArrayType2NonArrayType_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBB(
			ArrayType2NonArrayType _this, Match match, TypeAccess typeAccess, ArrayType arrayType, Type jType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, typeAccess, arrayType, jType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ArrayType2NonArrayType_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ArrayType2NonArrayType _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ArrayType2NonArrayType_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_1_prepare_blackB(ArrayType2NonArrayType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("typeAccess");
		EObject _localVariable_1 = sourceMatch.getObject("arrayType");
		EObject _localVariable_2 = sourceMatch.getObject("jType");
		EObject _localVariable_3 = targetMatch.getObject("uType");
		EObject tmpTypeAccess = _localVariable_0;
		EObject tmpArrayType = _localVariable_1;
		EObject tmpJType = _localVariable_2;
		EObject tmpUType = _localVariable_3;
		if (tmpTypeAccess instanceof TypeAccess) {
			TypeAccess typeAccess = (TypeAccess) tmpTypeAccess;
			if (tmpArrayType instanceof ArrayType) {
				ArrayType arrayType = (ArrayType) tmpArrayType;
				if (tmpJType instanceof Type) {
					Type jType = (Type) tmpJType;
					if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
						org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
						return new Object[] { typeAccess, arrayType, jType, uType, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_blackBBBBBB(
			TypeAccess typeAccess, ArrayType arrayType, Type jType, org.eclipse.uml2.uml.Type uType, Match sourceMatch,
			Match targetMatch) {
		if (!arrayType.equals(jType)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { typeAccess, arrayType, jType, uType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_binding = pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_binding != null) {
			TypeAccess typeAccess = (TypeAccess) result_pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_binding[0];
			ArrayType arrayType = (ArrayType) result_pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_binding[1];
			Type jType = (Type) result_pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_binding[2];
			org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) result_pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_black = pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_blackBBBBBB(
					typeAccess, arrayType, jType, uType, sourceMatch, targetMatch);
			if (result_pattern_ArrayType2NonArrayType_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { typeAccess, arrayType, jType, uType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_3_solvecsp_bindingFBBBBBBB(
			ArrayType2NonArrayType _this, TypeAccess typeAccess, ArrayType arrayType, Type jType,
			org.eclipse.uml2.uml.Type uType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(typeAccess, arrayType, jType, uType, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, typeAccess, arrayType, jType, uType, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_3_solvecsp_bindingAndBlackFBBBBBBB(
			ArrayType2NonArrayType _this, TypeAccess typeAccess, ArrayType arrayType, Type jType,
			org.eclipse.uml2.uml.Type uType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ArrayType2NonArrayType_21_3_solvecsp_binding = pattern_ArrayType2NonArrayType_21_3_solvecsp_bindingFBBBBBBB(
				_this, typeAccess, arrayType, jType, uType, sourceMatch, targetMatch);
		if (result_pattern_ArrayType2NonArrayType_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayType2NonArrayType_21_3_solvecsp_binding[0];

			Object[] result_pattern_ArrayType2NonArrayType_21_3_solvecsp_black = pattern_ArrayType2NonArrayType_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_ArrayType2NonArrayType_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, typeAccess, arrayType, jType, uType, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayType2NonArrayType_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayType2NonArrayType_21_5_matchcorrcontext_blackFBBBB(Type jType,
			org.eclipse.uml2.uml.Type uType, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ASTNode2Element ne2ne1 : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(jType,
					ASTNode2Element.class, "source")) {
				if (uType.equals(ne2ne1.getTarget())) {
					_result.add(new Object[] { ne2ne1, jType, uType, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_5_matchcorrcontext_greenBBBF(ASTNode2Element ne2ne1,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ArrayType2NonArrayType";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ne2ne1);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ne2ne1, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_6_createcorrespondence_blackBBBBB(
			TypeAccess typeAccess, ArrayType arrayType, Type jType, org.eclipse.uml2.uml.Type uType, CCMatch ccMatch) {
		if (!arrayType.equals(jType)) {
			return new Object[] { typeAccess, arrayType, jType, uType, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_6_createcorrespondence_greenFBBB(ArrayType arrayType,
			org.eclipse.uml2.uml.Type uType, CCMatch ccMatch) {
		ASTNode2Element ne2ne2 = UmlFactory.eINSTANCE.createASTNode2Element();
		ne2ne2.setSource(arrayType);
		ne2ne2.setTarget(uType);
		ccMatch.getCreateCorr().add(ne2ne2);
		return new Object[] { ne2ne2, arrayType, uType, ccMatch };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ArrayType2NonArrayType";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayType2NonArrayType_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_0BB(
			TypeAccess typeAccess, Type jType) {
		for (AbstractTypeDeclaration __DEC_typeAccess_superInterfaces_682343 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!jType.equals(__DEC_typeAccess_superInterfaces_682343)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_1B(
			TypeAccess typeAccess) {
		for (Annotation __DEC_typeAccess_type_795872 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, Annotation.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_2BB(
			TypeAccess typeAccess, Type jType) {
		for (ClassDeclaration __DEC_typeAccess_superClass_448230 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ClassDeclaration.class, "superClass")) {
			if (!jType.equals(__DEC_typeAccess_superClass_448230)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_3B(
			TypeAccess typeAccess) {
		for (MethodDeclaration __DEC_typeAccess_returnType_154588 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_4BB(
			TypeAccess typeAccess, Type jType) {
		for (ParameterizedType __DEC_typeAccess_type_964310 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, ParameterizedType.class, "type")) {
			if (!jType.equals(__DEC_typeAccess_type_964310)) {
				return new Object[] { typeAccess, jType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_5B(
			TypeAccess typeAccess) {
		for (SingleVariableDeclaration __DEC_typeAccess_type_678192 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, SingleVariableDeclaration.class, "type")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_6B(
			TypeAccess typeAccess) {
		for (AnnotationMemberValuePair __DEC_typeAccess_value_589448 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(typeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { typeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_24_1_matchtggpattern_blackBBB(TypeAccess typeAccess,
			ArrayType arrayType, Type jType) {
		if (!arrayType.equals(jType)) {
			if (jType.equals(typeAccess.getType())) {
				if (typeAccess.equals(arrayType.getElementType())) {
					if (pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_0BB(typeAccess, jType) == null) {
						if (pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_1B(typeAccess) == null) {
							if (pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_2BB(typeAccess,
									jType) == null) {
								if (pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_3B(
										typeAccess) == null) {
									if (pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_4BB(typeAccess,
											jType) == null) {
										if (pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_5B(
												typeAccess) == null) {
											if (pattern_ArrayType2NonArrayType_24_1_matchtggpattern_black_nac_6B(
													typeAccess) == null) {
												return new Object[] { typeAccess, arrayType, jType };
											}
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

	public static final boolean pattern_ArrayType2NonArrayType_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayType2NonArrayType_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_25_1_matchtggpattern_blackB(
			org.eclipse.uml2.uml.Type uType) {
		return new Object[] { uType };
	}

	public static final boolean pattern_ArrayType2NonArrayType_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayType2NonArrayType_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_26_1_createresult_blackB(ArrayType2NonArrayType _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, ASTNode2Element ne2ne1) {
		if (ruleResult.getCorrObjects().contains(ne2ne1)) {
			return new Object[] { ruleResult, ne2ne1 };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Type jType) {
		if (ruleResult.getSourceObjects().contains(jType)) {
			return new Object[] { ruleResult, jType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, org.eclipse.uml2.uml.Type uType) {
		if (ruleResult.getTargetObjects().contains(uType)) {
			return new Object[] { ruleResult, uType };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayType2NonArrayType_26_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList ne2ne1List : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpNe2ne1 : ne2ne1List.getEntryObjects()) {
				if (tmpNe2ne1 instanceof ASTNode2Element) {
					ASTNode2Element ne2ne1 = (ASTNode2Element) tmpNe2ne1;
					ASTNode tmpJType = ne2ne1.getSource();
					if (tmpJType instanceof Type) {
						Type jType = (Type) tmpJType;
						Element tmpUType = ne2ne1.getTarget();
						if (tmpUType instanceof org.eclipse.uml2.uml.Type) {
							org.eclipse.uml2.uml.Type uType = (org.eclipse.uml2.uml.Type) tmpUType;
							if (pattern_ArrayType2NonArrayType_26_2_isapplicablecore_black_nac_0BB(ruleResult,
									ne2ne1) == null) {
								if (pattern_ArrayType2NonArrayType_26_2_isapplicablecore_black_nac_1BB(ruleResult,
										jType) == null) {
									if (pattern_ArrayType2NonArrayType_26_2_isapplicablecore_black_nac_2BB(ruleResult,
											uType) == null) {
										_result.add(new Object[] { ne2ne1List, ne2ne1, jType, uType, ruleEntryContainer,
												ruleResult });
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

	public static final Object[] pattern_ArrayType2NonArrayType_26_3_solveCSP_bindingFBBBBBB(
			ArrayType2NonArrayType _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne1, Type jType,
			org.eclipse.uml2.uml.Type uType, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ne2ne1, jType, uType, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ne2ne1, jType, uType, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_26_3_solveCSP_bindingAndBlackFBBBBBB(
			ArrayType2NonArrayType _this, IsApplicableMatch isApplicableMatch, ASTNode2Element ne2ne1, Type jType,
			org.eclipse.uml2.uml.Type uType, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ArrayType2NonArrayType_26_3_solveCSP_binding = pattern_ArrayType2NonArrayType_26_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, ne2ne1, jType, uType, ruleResult);
		if (result_pattern_ArrayType2NonArrayType_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayType2NonArrayType_26_3_solveCSP_binding[0];

			Object[] result_pattern_ArrayType2NonArrayType_26_3_solveCSP_black = pattern_ArrayType2NonArrayType_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayType2NonArrayType_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ne2ne1, jType, uType, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayType2NonArrayType_26_4_checkCSP_expressionFBB(ArrayType2NonArrayType _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayType2NonArrayType_26_5_checknacs_blackBBB(ASTNode2Element ne2ne1,
			Type jType, org.eclipse.uml2.uml.Type uType) {
		return new Object[] { ne2ne1, jType, uType };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_26_6_perform_blackBBBB(ASTNode2Element ne2ne1,
			Type jType, org.eclipse.uml2.uml.Type uType, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ne2ne1, jType, uType, ruleResult };
	}

	public static final Object[] pattern_ArrayType2NonArrayType_26_6_perform_greenFFFBBB(Type jType,
			org.eclipse.uml2.uml.Type uType, ModelgeneratorRuleResult ruleResult) {
		TypeAccess typeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ASTNode2Element ne2ne2 = UmlFactory.eINSTANCE.createASTNode2Element();
		ArrayType arrayType = JavaFactory.eINSTANCE.createArrayType();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		typeAccess.setType(jType);
		ruleResult.getSourceObjects().add(typeAccess);
		ne2ne2.setTarget(uType);
		ruleResult.getCorrObjects().add(ne2ne2);
		ne2ne2.setSource(arrayType);
		arrayType.setElementType(typeAccess);
		ruleResult.getSourceObjects().add(arrayType);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { typeAccess, ne2ne2, arrayType, jType, uType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ArrayType2NonArrayType_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ArrayType2NonArrayTypeImpl
