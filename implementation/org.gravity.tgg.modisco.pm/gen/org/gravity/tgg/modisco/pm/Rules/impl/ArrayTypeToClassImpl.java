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
import org.eclipse.modisco.java.MethodDeclaration;
import org.eclipse.modisco.java.Model;
import org.eclipse.modisco.java.ParameterizedType;
import org.eclipse.modisco.java.Type;
import org.eclipse.modisco.java.TypeAccess;
import org.eclipse.modisco.java.TypeLiteral;

import org.eclipse.modisco.java.emf.JavaFactory;

import org.gravity.tgg.modisco.pm.ModelToTypeGraph;

import org.gravity.tgg.modisco.pm.Rules.ArrayTypeToClass;
import org.gravity.tgg.modisco.pm.Rules.RulesPackage;

import org.gravity.tgg.modisco.pm.TypeToTAbstractType;

import org.gravity.typegraph.basic.TAbstractType;
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
 * An implementation of the model object '<em><b>Array Type To Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ArrayTypeToClassImpl extends AbstractRuleImpl implements ArrayTypeToClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeToClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getArrayTypeToClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Type eType, Model eModel, TypeAccess eTypeAccess,
			ArrayType eArrayType) {

		Object[] result1_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_1_initialbindings_blackBBBBBB(this,
				match, eType, eModel, eTypeAccess, eArrayType);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eType] = " + eType + ", " + "[eModel] = " + eModel + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eArrayType] = " + eArrayType + ".");
		}

		Object[] result2_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, eType, eModel, eTypeAccess,
						eArrayType);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[eType] = " + eType + ", " + "[eModel] = " + eModel + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[eArrayType] = " + eArrayType + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_0_4_collectelementstobetranslated_blackBBBBB(match, eType, eModel,
							eTypeAccess, eArrayType);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eType] = " + eType + ", " + "[eModel] = " + eModel + ", " + "[eTypeAccess] = " + eTypeAccess
						+ ", " + "[eArrayType] = " + eArrayType + ".");
			}
			ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(match, eType,
					eModel, eTypeAccess, eArrayType);
			//nothing EMoflonEdge eModel__eArrayType____orphanTypes = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge eArrayType__eTypeAccess____elementType = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result4_green[7];
			//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result4_green[8];

			Object[] result5_black = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_0_5_collectcontextelements_blackBBBBB(match, eType, eModel, eTypeAccess,
							eArrayType);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[eType] = " + eType + ", " + "[eModel] = " + eModel + ", " + "[eTypeAccess] = " + eTypeAccess
						+ ", " + "[eArrayType] = " + eArrayType + ".");
			}
			ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_5_collectcontextelements_greenBBB(match, eType, eModel);

			// 
			ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_6_registerobjectstomatch_expressionBBBBBB(this, match,
					eType, eModel, eTypeAccess, eArrayType);
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_7_expressionF();
		} else {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result1_bindingAndBlack[0];
		ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result1_bindingAndBlack[1];
		TypeGraph typeGraph = (TypeGraph) result1_bindingAndBlack[2];
		Type eType = (Type) result1_bindingAndBlack[3];
		Model eModel = (Model) result1_bindingAndBlack[4];
		TypeAccess eTypeAccess = (TypeAccess) result1_bindingAndBlack[5];
		TAbstractType tArrayClass = (TAbstractType) result1_bindingAndBlack[6];
		ArrayType eArrayType = (ArrayType) result1_bindingAndBlack[7];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[8];

		Object[] result2_black = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_1_2_collecttranslatedelements_blackBB(eTypeAccess, eArrayType);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[eTypeAccess] = " + eTypeAccess
					+ ", " + "[eArrayType] = " + eArrayType + ".");
		}
		Object[] result2_green = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_1_2_collecttranslatedelements_greenFBB(eTypeAccess, eArrayType);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_1_3_bookkeepingforedges_blackBBBBBBBBB(
				ruleresult, eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, eTypeAccess, tArrayClass,
				eArrayType);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[eTypeToTArrayClass] = " + eTypeToTArrayClass + ", " + "[eModelToTypeGraph] = "
					+ eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", " + "[eType] = " + eType + ", "
					+ "[eModel] = " + eModel + ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[tArrayClass] = "
					+ tArrayClass + ", " + "[eArrayType] = " + eArrayType + ".");
		}
		ArrayTypeToClassImpl.pattern_ArrayTypeToClass_1_3_bookkeepingforedges_greenBBBBBFFFF(ruleresult, eType, eModel,
				eTypeAccess, eArrayType);
		//nothing EMoflonEdge eModel__eArrayType____orphanTypes = (EMoflonEdge) result3_green[5];
		//nothing EMoflonEdge eArrayType__eTypeAccess____elementType = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[8];

		// 
		// 
		ArrayTypeToClassImpl.pattern_ArrayTypeToClass_1_5_registerobjects_expressionBBBBBBBBBB(this, ruleresult,
				eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType);
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Type eType = (Type) result2_binding[0];
		Model eModel = (Model) result2_binding[1];
		TypeAccess eTypeAccess = (TypeAccess) result2_binding[2];
		ArrayType eArrayType = (ArrayType) result2_binding[3];
		for (Object[] result2_black : ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_2_corematch_blackFFFBBBFBB(eType,
				eModel, eTypeAccess, eArrayType, match)) {
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result2_black[0];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[1];
			TypeGraph typeGraph = (TypeGraph) result2_black[2];
			TAbstractType tArrayClass = (TAbstractType) result2_black[6];
			// ForEach 
			for (Object[] result3_black : ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_3_findcontext_blackBBBBBBBB(
					eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, eTypeAccess, tArrayClass,
					eArrayType)) {
				Object[] result3_green = ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(eTypeToTArrayClass,
								eModelToTypeGraph, typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[8];
				//nothing EMoflonEdge eModelToTypeGraph__typeGraph____target = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge eTypeToTArrayClass__eType____source = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge eModel__eArrayType____orphanTypes = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge eArrayType__eTypeAccess____elementType = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge eModelToTypeGraph__eModel____source = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge typeGraph__tArrayClass____ownedTypes = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge tArrayClass__typeGraph____pg = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge eTypeAccess__eType____type = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge eTypeToTArrayClass__tArrayClass____target = (EMoflonEdge) result3_green[18];

				Object[] result4_bindingAndBlack = ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(this, isApplicableMatch,
								eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, eTypeAccess,
								tArrayClass, eArrayType);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eTypeToTArrayClass] = "
							+ eTypeToTArrayClass + ", " + "[eModelToTypeGraph] = " + eModelToTypeGraph + ", "
							+ "[typeGraph] = " + typeGraph + ", " + "[eType] = " + eType + ", " + "[eModel] = " + eModel
							+ ", " + "[eTypeAccess] = " + eTypeAccess + ", " + "[tArrayClass] = " + tArrayClass + ", "
							+ "[eArrayType] = " + eArrayType + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = ArrayTypeToClassImpl
							.pattern_ArrayTypeToClass_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Type eType, Model eModel, TypeAccess eTypeAccess,
			ArrayType eArrayType) {
		match.registerObject("eType", eType);
		match.registerObject("eModel", eModel);
		match.registerObject("eTypeAccess", eTypeAccess);
		match.registerObject("eArrayType", eArrayType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Type eType, Model eModel, TypeAccess eTypeAccess,
			ArrayType eArrayType) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType eTypeToTArrayClass,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType, Model eModel, TypeAccess eTypeAccess,
			TAbstractType tArrayClass, ArrayType eArrayType) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eTypeToTArrayClass", eTypeToTArrayClass);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("eTypeAccess", eTypeAccess);
		isApplicableMatch.registerObject("tArrayClass", tArrayClass);
		isApplicableMatch.registerObject("eArrayType", eArrayType);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject eTypeToTArrayClass, EObject eModelToTypeGraph,
			EObject typeGraph, EObject eType, EObject eModel, EObject eTypeAccess, EObject tArrayClass,
			EObject eArrayType) {
		ruleresult.registerObject("eTypeToTArrayClass", eTypeToTArrayClass);
		ruleresult.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		ruleresult.registerObject("typeGraph", typeGraph);
		ruleresult.registerObject("eType", eType);
		ruleresult.registerObject("eModel", eModel);
		ruleresult.registerObject("eTypeAccess", eTypeAccess);
		ruleresult.registerObject("tArrayClass", tArrayClass);
		ruleresult.registerObject("eArrayType", eArrayType);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eTypeAccess").eClass())
						.equals("java.TypeAccess.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("eArrayType").eClass())
						.equals("java.ArrayType.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, TypeGraph typeGraph, TAbstractType tArrayClass) {

		Object[] result1_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_10_1_initialbindings_blackBBBB(this,
				match, typeGraph, tArrayClass);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[typeGraph] = " + typeGraph + ", " + "[tArrayClass] = " + tArrayClass + ".");
		}

		Object[] result2_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, typeGraph, tArrayClass);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[typeGraph] = " + typeGraph + ", " + "[tArrayClass] = " + tArrayClass + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (ArrayTypeToClassImpl.pattern_ArrayTypeToClass_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_10_4_collectelementstobetranslated_blackBBB(match, typeGraph,
							tArrayClass);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tArrayClass] = " + tArrayClass + ".");
			}

			Object[] result5_black = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_10_5_collectcontextelements_blackBBB(match, typeGraph, tArrayClass);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[tArrayClass] = " + tArrayClass + ".");
			}
			ArrayTypeToClassImpl.pattern_ArrayTypeToClass_10_5_collectcontextelements_greenBBBFF(match, typeGraph,
					tArrayClass);
			//nothing EMoflonEdge typeGraph__tArrayClass____ownedTypes = (EMoflonEdge) result5_green[3];
			//nothing EMoflonEdge tArrayClass__typeGraph____pg = (EMoflonEdge) result5_green[4];

			// 
			ArrayTypeToClassImpl.pattern_ArrayTypeToClass_10_6_registerobjectstomatch_expressionBBBB(this, match,
					typeGraph, tArrayClass);
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_10_7_expressionF();
		} else {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_10_8_expressionF();
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
	public void registerObjectsToMatch_BWD(Match match, TypeGraph typeGraph, TAbstractType tArrayClass) {
		match.registerObject("typeGraph", typeGraph);
		match.registerObject("tArrayClass", tArrayClass);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, TypeGraph typeGraph, TAbstractType tArrayClass) {// Create CSP
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
	public EObjectContainer isAppropriate_BWD_TypeGraph_0(TypeGraph typeGraph) {

		Object[] result1_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_17_2_testcorematchandDECs_blackBF(typeGraph)) {
			TAbstractType tArrayClass = (TAbstractType) result2_black[1];
			Object[] result2_green = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, typeGraph, tArrayClass)) {
				// 
				if (ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = ArrayTypeToClassImpl
							.pattern_ArrayTypeToClass_17_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ArrayTypeToClassImpl.pattern_ArrayTypeToClass_17_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_90(EMoflonEdge _edge_orphanTypes) {

		Object[] result1_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_18_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_18_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_18_2_testcorematchandDECs_blackFFFFB(_edge_orphanTypes)) {
			Type eType = (Type) result2_black[0];
			Model eModel = (Model) result2_black[1];
			TypeAccess eTypeAccess = (TypeAccess) result2_black[2];
			ArrayType eArrayType = (ArrayType) result2_black[3];
			Object[] result2_green = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_18_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(this,
							match, eType, eModel, eTypeAccess, eArrayType)) {
				// 
				if (ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = ArrayTypeToClassImpl
							.pattern_ArrayTypeToClass_18_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					ArrayTypeToClassImpl.pattern_ArrayTypeToClass_18_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_18_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("ArrayTypeToClass");
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
		ruleResult.setRule("ArrayTypeToClass");
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

		Object[] result1_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_21_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_21_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		TypeGraph typeGraph = (TypeGraph) result2_bindingAndBlack[0];
		Type eType = (Type) result2_bindingAndBlack[1];
		Model eModel = (Model) result2_bindingAndBlack[2];
		TypeAccess eTypeAccess = (TypeAccess) result2_bindingAndBlack[3];
		TAbstractType tArrayClass = (TAbstractType) result2_bindingAndBlack[4];
		ArrayType eArrayType = (ArrayType) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, typeGraph, eType, eModel,
						eTypeAccess, tArrayClass, eArrayType, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[typeGraph] = " + typeGraph + ", " + "[eType] = " + eType + ", " + "[eModel] = " + eModel + ", "
					+ "[eTypeAccess] = " + eTypeAccess + ", " + "[tArrayClass] = " + tArrayClass + ", "
					+ "[eArrayType] = " + eArrayType + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (ArrayTypeToClassImpl.pattern_ArrayTypeToClass_21_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_21_5_matchcorrcontext_blackFFBBBBBB(typeGraph, eType, eModel, tArrayClass,
							sourceMatch, targetMatch)) {
				TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result5_black[0];
				ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result5_black[1];
				Object[] result5_green = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_21_5_matchcorrcontext_greenBBBBF(
						eTypeToTArrayClass, eModelToTypeGraph, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[4];

				Object[] result6_black = ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_21_6_createcorrespondence_blackBBBBBBB(typeGraph, eType, eModel,
								eTypeAccess, tArrayClass, eArrayType, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[typeGraph] = "
							+ typeGraph + ", " + "[eType] = " + eType + ", " + "[eModel] = " + eModel + ", "
							+ "[eTypeAccess] = " + eTypeAccess + ", " + "[tArrayClass] = " + tArrayClass + ", "
							+ "[eArrayType] = " + eArrayType + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = ArrayTypeToClassImpl
						.pattern_ArrayTypeToClass_21_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				ArrayTypeToClassImpl.pattern_ArrayTypeToClass_21_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_21_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(TypeGraph typeGraph, Type eType, Model eModel, TypeAccess eTypeAccess,
			TAbstractType tArrayClass, ArrayType eArrayType, Match sourceMatch, Match targetMatch) {// Create CSP
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
	public boolean checkDEC_FWD(Type eType, Model eModel, TypeAccess eTypeAccess, ArrayType eArrayType) {// 
		Object[] result1_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_24_1_matchtggpattern_blackBBBB(eType,
				eModel, eTypeAccess, eArrayType);
		if (result1_black != null) {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_24_2_expressionF();
		} else {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(TypeGraph typeGraph, TAbstractType tArrayClass) {// 
		Object[] result1_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_25_1_matchtggpattern_blackBB(typeGraph,
				tArrayClass);
		if (result1_black != null) {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_25_2_expressionF();
		} else {
			return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_25_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			TypeToTAbstractType eTypeToTArrayClassParameter) {

		Object[] result1_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_26_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_26_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : ArrayTypeToClassImpl
				.pattern_ArrayTypeToClass_26_2_isapplicablecore_blackFFFFFFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList eTypeToTArrayClassList = (RuleEntryList) result2_black[0];
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result2_black[1];
			Type eType = (Type) result2_black[2];
			TAbstractType tArrayClass = (TAbstractType) result2_black[3];
			TypeGraph typeGraph = (TypeGraph) result2_black[4];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result2_black[5];
			Model eModel = (Model) result2_black[6];

			Object[] result3_bindingAndBlack = ArrayTypeToClassImpl
					.pattern_ArrayTypeToClass_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(this, isApplicableMatch,
							eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, tArrayClass, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[eTypeToTArrayClass] = "
						+ eTypeToTArrayClass + ", " + "[eModelToTypeGraph] = " + eModelToTypeGraph + ", "
						+ "[typeGraph] = " + typeGraph + ", " + "[eType] = " + eType + ", " + "[eModel] = " + eModel
						+ ", " + "[tArrayClass] = " + tArrayClass + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (ArrayTypeToClassImpl.pattern_ArrayTypeToClass_26_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_26_5_checknacs_blackBBBBBB(
						eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, tArrayClass);
				if (result5_black != null) {

					Object[] result6_black = ArrayTypeToClassImpl.pattern_ArrayTypeToClass_26_6_perform_blackBBBBBBB(
							eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, tArrayClass, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: "
								+ "[eTypeToTArrayClass] = " + eTypeToTArrayClass + ", " + "[eModelToTypeGraph] = "
								+ eModelToTypeGraph + ", " + "[typeGraph] = " + typeGraph + ", " + "[eType] = " + eType
								+ ", " + "[eModel] = " + eModel + ", " + "[tArrayClass] = " + tArrayClass + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					ArrayTypeToClassImpl.pattern_ArrayTypeToClass_26_6_perform_greenBBFFB(eType, eModel, ruleResult);
					//nothing TypeAccess eTypeAccess = (TypeAccess) result6_green[2];
					//nothing ArrayType eArrayType = (ArrayType) result6_green[3];

				} else {
				}

			} else {
			}

		}
		return ArrayTypeToClassImpl.pattern_ArrayTypeToClass_26_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, TypeToTAbstractType eTypeToTArrayClass,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType, Model eModel,
			TAbstractType tArrayClass, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("eTypeToTArrayClass", eTypeToTArrayClass);
		isApplicableMatch.registerObject("eModelToTypeGraph", eModelToTypeGraph);
		isApplicableMatch.registerObject("typeGraph", typeGraph);
		isApplicableMatch.registerObject("eType", eType);
		isApplicableMatch.registerObject("eModel", eModel);
		isApplicableMatch.registerObject("tArrayClass", tArrayClass);
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
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_FWD__MATCH_TYPE_MODEL_TYPEACCESS_ARRAYTYPE:
			return isAppropriate_FWD((Match) arguments.get(0), (Type) arguments.get(1), (Model) arguments.get(2),
					(TypeAccess) arguments.get(3), (ArrayType) arguments.get(4));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_TYPE_MODEL_TYPEACCESS_ARRAYTYPE:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Type) arguments.get(1), (Model) arguments.get(2),
					(TypeAccess) arguments.get(3), (ArrayType) arguments.get(4));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_TYPE_MODEL_TYPEACCESS_ARRAYTYPE:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Type) arguments.get(1),
					(Model) arguments.get(2), (TypeAccess) arguments.get(3), (ArrayType) arguments.get(4));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MODELTOTYPEGRAPH_TYPEGRAPH_TYPE_MODEL_TYPEACCESS_TABSTRACTTYPE_ARRAYTYPE:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (ModelToTypeGraph) arguments.get(2),
					(TypeGraph) arguments.get(3), (Type) arguments.get(4), (Model) arguments.get(5),
					(TypeAccess) arguments.get(6), (TAbstractType) arguments.get(7), (ArrayType) arguments.get(8));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_BWD__MATCH_TYPEGRAPH_TABSTRACTTYPE:
			return isAppropriate_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TYPEGRAPH_TABSTRACTTYPE:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2));
			return null;
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TYPEGRAPH_TABSTRACTTYPE:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (TypeGraph) arguments.get(1),
					(TAbstractType) arguments.get(2));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_BWD_TYPE_GRAPH_0__TYPEGRAPH:
			return isAppropriate_BWD_TypeGraph_0((TypeGraph) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPROPRIATE_FWD_EMOFLON_EDGE_90__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_90((EMoflonEdge) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_SOLVE_CSP_CC__TYPEGRAPH_TYPE_MODEL_TYPEACCESS_TABSTRACTTYPE_ARRAYTYPE_MATCH_MATCH:
			return isApplicable_solveCsp_CC((TypeGraph) arguments.get(0), (Type) arguments.get(1),
					(Model) arguments.get(2), (TypeAccess) arguments.get(3), (TAbstractType) arguments.get(4),
					(ArrayType) arguments.get(5), (Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_DEC_FWD__TYPE_MODEL_TYPEACCESS_ARRAYTYPE:
			return checkDEC_FWD((Type) arguments.get(0), (Model) arguments.get(1), (TypeAccess) arguments.get(2),
					(ArrayType) arguments.get(3));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___CHECK_DEC_BWD__TYPEGRAPH_TABSTRACTTYPE:
			return checkDEC_BWD((TypeGraph) arguments.get(0), (TAbstractType) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___GENERATE_MODEL__RULEENTRYCONTAINER_TYPETOTABSTRACTTYPE:
			return generateModel((RuleEntryContainer) arguments.get(0), (TypeToTAbstractType) arguments.get(1));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_TYPETOTABSTRACTTYPE_MODELTOTYPEGRAPH_TYPEGRAPH_TYPE_MODEL_TABSTRACTTYPE_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(TypeToTAbstractType) arguments.get(1), (ModelToTypeGraph) arguments.get(2),
					(TypeGraph) arguments.get(3), (Type) arguments.get(4), (Model) arguments.get(5),
					(TAbstractType) arguments.get(6), (ModelgeneratorRuleResult) arguments.get(7));
		case RulesPackage.ARRAY_TYPE_TO_CLASS___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_ArrayTypeToClass_0_1_initialbindings_blackBBBBBB(ArrayTypeToClass _this,
			Match match, Type eType, Model eModel, TypeAccess eTypeAccess, ArrayType eArrayType) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { _this, match, eType, eModel, eTypeAccess, eArrayType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_0_2_SolveCSP_bindingFBBBBBB(ArrayTypeToClass _this,
			Match match, Type eType, Model eModel, TypeAccess eTypeAccess, ArrayType eArrayType) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, eType, eModel, eTypeAccess, eArrayType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, eType, eModel, eTypeAccess, eArrayType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToClass_0_2_SolveCSP_bindingAndBlackFBBBBBB(ArrayTypeToClass _this,
			Match match, Type eType, Model eModel, TypeAccess eTypeAccess, ArrayType eArrayType) {
		Object[] result_pattern_ArrayTypeToClass_0_2_SolveCSP_binding = pattern_ArrayTypeToClass_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, eType, eModel, eTypeAccess, eArrayType);
		if (result_pattern_ArrayTypeToClass_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToClass_0_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToClass_0_2_SolveCSP_black = pattern_ArrayTypeToClass_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToClass_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, eType, eModel, eTypeAccess, eArrayType };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_0_3_CheckCSP_expressionFBB(ArrayTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_0_4_collectelementstobetranslated_blackBBBBB(Match match,
			Type eType, Model eModel, TypeAccess eTypeAccess, ArrayType eArrayType) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { match, eType, eModel, eTypeAccess, eArrayType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_0_4_collectelementstobetranslated_greenBBBBBFFFF(Match match,
			Type eType, Model eModel, TypeAccess eTypeAccess, ArrayType eArrayType) {
		EMoflonEdge eModel__eArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eArrayType__eTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(eTypeAccess);
		match.getToBeTranslatedNodes().add(eArrayType);
		String eModel__eArrayType____orphanTypes_name_prime = "orphanTypes";
		String eArrayType__eTypeAccess____elementType_name_prime = "elementType";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		eModel__eArrayType____orphanTypes.setSrc(eModel);
		eModel__eArrayType____orphanTypes.setTrg(eArrayType);
		match.getToBeTranslatedEdges().add(eModel__eArrayType____orphanTypes);
		eArrayType__eTypeAccess____elementType.setSrc(eArrayType);
		eArrayType__eTypeAccess____elementType.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eArrayType__eTypeAccess____elementType);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		match.getToBeTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		match.getToBeTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		eModel__eArrayType____orphanTypes.setName(eModel__eArrayType____orphanTypes_name_prime);
		eArrayType__eTypeAccess____elementType.setName(eArrayType__eTypeAccess____elementType_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { match, eType, eModel, eTypeAccess, eArrayType, eModel__eArrayType____orphanTypes,
				eArrayType__eTypeAccess____elementType, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess };
	}

	public static final Object[] pattern_ArrayTypeToClass_0_5_collectcontextelements_blackBBBBB(Match match, Type eType,
			Model eModel, TypeAccess eTypeAccess, ArrayType eArrayType) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { match, eType, eModel, eTypeAccess, eArrayType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_0_5_collectcontextelements_greenBBB(Match match, Type eType,
			Model eModel) {
		match.getContextNodes().add(eType);
		match.getContextNodes().add(eModel);
		return new Object[] { match, eType, eModel };
	}

	public static final void pattern_ArrayTypeToClass_0_6_registerobjectstomatch_expressionBBBBBB(
			ArrayTypeToClass _this, Match match, Type eType, Model eModel, TypeAccess eTypeAccess,
			ArrayType eArrayType) {
		_this.registerObjectsToMatch_FWD(match, eType, eModel, eTypeAccess, eArrayType);

	}

	public static final boolean pattern_ArrayTypeToClass_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToClass_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_1_1_performtransformation_bindingFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("eTypeToTArrayClass");
		EObject _localVariable_1 = isApplicableMatch.getObject("eModelToTypeGraph");
		EObject _localVariable_2 = isApplicableMatch.getObject("typeGraph");
		EObject _localVariable_3 = isApplicableMatch.getObject("eType");
		EObject _localVariable_4 = isApplicableMatch.getObject("eModel");
		EObject _localVariable_5 = isApplicableMatch.getObject("eTypeAccess");
		EObject _localVariable_6 = isApplicableMatch.getObject("tArrayClass");
		EObject _localVariable_7 = isApplicableMatch.getObject("eArrayType");
		EObject tmpETypeToTArrayClass = _localVariable_0;
		EObject tmpEModelToTypeGraph = _localVariable_1;
		EObject tmpTypeGraph = _localVariable_2;
		EObject tmpEType = _localVariable_3;
		EObject tmpEModel = _localVariable_4;
		EObject tmpETypeAccess = _localVariable_5;
		EObject tmpTArrayClass = _localVariable_6;
		EObject tmpEArrayType = _localVariable_7;
		if (tmpETypeToTArrayClass instanceof TypeToTAbstractType) {
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) tmpETypeToTArrayClass;
			if (tmpEModelToTypeGraph instanceof ModelToTypeGraph) {
				ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) tmpEModelToTypeGraph;
				if (tmpTypeGraph instanceof TypeGraph) {
					TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
					if (tmpEType instanceof Type) {
						Type eType = (Type) tmpEType;
						if (tmpEModel instanceof Model) {
							Model eModel = (Model) tmpEModel;
							if (tmpETypeAccess instanceof TypeAccess) {
								TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
								if (tmpTArrayClass instanceof TAbstractType) {
									TAbstractType tArrayClass = (TAbstractType) tmpTArrayClass;
									if (tmpEArrayType instanceof ArrayType) {
										ArrayType eArrayType = (ArrayType) tmpEArrayType;
										return new Object[] { eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType,
												eModel, eTypeAccess, tArrayClass, eArrayType, isApplicableMatch };
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

	public static final Object[] pattern_ArrayTypeToClass_1_1_performtransformation_blackBBBBBBBBFBB(
			TypeToTAbstractType eTypeToTArrayClass, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType,
			Model eModel, TypeAccess eTypeAccess, TAbstractType tArrayClass, ArrayType eArrayType,
			ArrayTypeToClass _this, IsApplicableMatch isApplicableMatch) {
		if (!eArrayType.equals(eType)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, eTypeAccess,
							tArrayClass, eArrayType, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_1_1_performtransformation_bindingAndBlackFFFFFFFFFBB(
			ArrayTypeToClass _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_ArrayTypeToClass_1_1_performtransformation_binding = pattern_ArrayTypeToClass_1_1_performtransformation_bindingFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_ArrayTypeToClass_1_1_performtransformation_binding != null) {
			TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[0];
			ModelToTypeGraph eModelToTypeGraph = (ModelToTypeGraph) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[1];
			TypeGraph typeGraph = (TypeGraph) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[2];
			Type eType = (Type) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[3];
			Model eModel = (Model) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[4];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[5];
			TAbstractType tArrayClass = (TAbstractType) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[6];
			ArrayType eArrayType = (ArrayType) result_pattern_ArrayTypeToClass_1_1_performtransformation_binding[7];

			Object[] result_pattern_ArrayTypeToClass_1_1_performtransformation_black = pattern_ArrayTypeToClass_1_1_performtransformation_blackBBBBBBBBFBB(
					eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, eTypeAccess, tArrayClass,
					eArrayType, _this, isApplicableMatch);
			if (result_pattern_ArrayTypeToClass_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_ArrayTypeToClass_1_1_performtransformation_black[8];

				return new Object[] { eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, eTypeAccess,
						tArrayClass, eArrayType, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_1_2_collecttranslatedelements_blackBB(TypeAccess eTypeAccess,
			ArrayType eArrayType) {
		return new Object[] { eTypeAccess, eArrayType };
	}

	public static final Object[] pattern_ArrayTypeToClass_1_2_collecttranslatedelements_greenFBB(TypeAccess eTypeAccess,
			ArrayType eArrayType) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(eTypeAccess);
		ruleresult.getTranslatedElements().add(eArrayType);
		return new Object[] { ruleresult, eTypeAccess, eArrayType };
	}

	public static final Object[] pattern_ArrayTypeToClass_1_3_bookkeepingforedges_blackBBBBBBBBB(
			PerformRuleResult ruleresult, EObject eTypeToTArrayClass, EObject eModelToTypeGraph, EObject typeGraph,
			EObject eType, EObject eModel, EObject eTypeAccess, EObject tArrayClass, EObject eArrayType) {
		if (!eTypeToTArrayClass.equals(typeGraph)) {
			if (!eTypeToTArrayClass.equals(tArrayClass)) {
				if (!eModelToTypeGraph.equals(eTypeToTArrayClass)) {
					if (!eModelToTypeGraph.equals(typeGraph)) {
						if (!eModelToTypeGraph.equals(eType)) {
							if (!eModelToTypeGraph.equals(eTypeAccess)) {
								if (!eModelToTypeGraph.equals(tArrayClass)) {
									if (!eType.equals(eTypeToTArrayClass)) {
										if (!eType.equals(typeGraph)) {
											if (!eType.equals(eTypeAccess)) {
												if (!eType.equals(tArrayClass)) {
													if (!eModel.equals(eTypeToTArrayClass)) {
														if (!eModel.equals(eModelToTypeGraph)) {
															if (!eModel.equals(typeGraph)) {
																if (!eModel.equals(eType)) {
																	if (!eModel.equals(eTypeAccess)) {
																		if (!eModel.equals(tArrayClass)) {
																			if (!eTypeAccess
																					.equals(eTypeToTArrayClass)) {
																				if (!eTypeAccess.equals(typeGraph)) {
																					if (!eTypeAccess
																							.equals(tArrayClass)) {
																						if (!tArrayClass
																								.equals(typeGraph)) {
																							if (!eArrayType.equals(
																									eTypeToTArrayClass)) {
																								if (!eArrayType.equals(
																										eModelToTypeGraph)) {
																									if (!eArrayType
																											.equals(typeGraph)) {
																										if (!eArrayType
																												.equals(eType)) {
																											if (!eArrayType
																													.equals(eModel)) {
																												if (!eArrayType
																														.equals(eTypeAccess)) {
																													if (!eArrayType
																															.equals(tArrayClass)) {
																														return new Object[] {
																																ruleresult,
																																eTypeToTArrayClass,
																																eModelToTypeGraph,
																																typeGraph,
																																eType,
																																eModel,
																																eTypeAccess,
																																tArrayClass,
																																eArrayType };
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ArrayTypeToClass_1_3_bookkeepingforedges_greenBBBBBFFFF(
			PerformRuleResult ruleresult, EObject eType, EObject eModel, EObject eTypeAccess, EObject eArrayType) {
		EMoflonEdge eModel__eArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eArrayType__eTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "ArrayTypeToClass";
		String eModel__eArrayType____orphanTypes_name_prime = "orphanTypes";
		String eArrayType__eTypeAccess____elementType_name_prime = "elementType";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		eModel__eArrayType____orphanTypes.setSrc(eModel);
		eModel__eArrayType____orphanTypes.setTrg(eArrayType);
		ruleresult.getTranslatedEdges().add(eModel__eArrayType____orphanTypes);
		eArrayType__eTypeAccess____elementType.setSrc(eArrayType);
		eArrayType__eTypeAccess____elementType.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eArrayType__eTypeAccess____elementType);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		ruleresult.getTranslatedEdges().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		ruleresult.getTranslatedEdges().add(eType__eTypeAccess____usagesInTypeAccess);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		eModel__eArrayType____orphanTypes.setName(eModel__eArrayType____orphanTypes_name_prime);
		eArrayType__eTypeAccess____elementType.setName(eArrayType__eTypeAccess____elementType_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		return new Object[] { ruleresult, eType, eModel, eTypeAccess, eArrayType, eModel__eArrayType____orphanTypes,
				eArrayType__eTypeAccess____elementType, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess };
	}

	public static final void pattern_ArrayTypeToClass_1_5_registerobjects_expressionBBBBBBBBBB(ArrayTypeToClass _this,
			PerformRuleResult ruleresult, EObject eTypeToTArrayClass, EObject eModelToTypeGraph, EObject typeGraph,
			EObject eType, EObject eModel, EObject eTypeAccess, EObject tArrayClass, EObject eArrayType) {
		_this.registerObjects_FWD(ruleresult, eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel,
				eTypeAccess, tArrayClass, eArrayType);

	}

	public static final PerformRuleResult pattern_ArrayTypeToClass_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_1_preparereturnvalue_bindingFB(ArrayTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_1_preparereturnvalue_blackFBB(EClass eClass,
			ArrayTypeToClass _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_1_preparereturnvalue_bindingAndBlackFFB(
			ArrayTypeToClass _this) {
		Object[] result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_binding = pattern_ArrayTypeToClass_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_black = pattern_ArrayTypeToClass_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_ArrayTypeToClass_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "ArrayTypeToClass";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_ArrayTypeToClass_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("eType");
		EObject _localVariable_1 = match.getObject("eModel");
		EObject _localVariable_2 = match.getObject("eTypeAccess");
		EObject _localVariable_3 = match.getObject("eArrayType");
		EObject tmpEType = _localVariable_0;
		EObject tmpEModel = _localVariable_1;
		EObject tmpETypeAccess = _localVariable_2;
		EObject tmpEArrayType = _localVariable_3;
		if (tmpEType instanceof Type) {
			Type eType = (Type) tmpEType;
			if (tmpEModel instanceof Model) {
				Model eModel = (Model) tmpEModel;
				if (tmpETypeAccess instanceof TypeAccess) {
					TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
					if (tmpEArrayType instanceof ArrayType) {
						ArrayType eArrayType = (ArrayType) tmpEArrayType;
						return new Object[] { eType, eModel, eTypeAccess, eArrayType, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_2_2_corematch_blackFFFBBBFBB(Type eType,
			Model eModel, TypeAccess eTypeAccess, ArrayType eArrayType, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eArrayType.equals(eType)) {
			for (TypeToTAbstractType eTypeToTArrayClass : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
				TAbstractType tArrayClass = eTypeToTArrayClass.getTarget();
				if (tArrayClass != null) {
					for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eModel, ModelToTypeGraph.class, "source")) {
						TypeGraph typeGraph = eModelToTypeGraph.getTarget();
						if (typeGraph != null) {
							_result.add(new Object[] { eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel,
									eTypeAccess, tArrayClass, eArrayType, match });
						}

					}
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_2_3_findcontext_blackBBBBBBBB(
			TypeToTAbstractType eTypeToTArrayClass, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType,
			Model eModel, TypeAccess eTypeAccess, TAbstractType tArrayClass, ArrayType eArrayType) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!eArrayType.equals(eType)) {
			if (typeGraph.equals(eModelToTypeGraph.getTarget())) {
				if (eType.equals(eTypeToTArrayClass.getSource())) {
					if (eModel.getOrphanTypes().contains(eArrayType)) {
						if (eTypeAccess.equals(eArrayType.getElementType())) {
							if (eModel.equals(eModelToTypeGraph.getSource())) {
								if (typeGraph.getOwnedTypes().contains(tArrayClass)) {
									if (eType.equals(eTypeAccess.getType())) {
										if (tArrayClass.equals(eTypeToTArrayClass.getTarget())) {
											_result.add(new Object[] { eTypeToTArrayClass, eModelToTypeGraph, typeGraph,
													eType, eModel, eTypeAccess, tArrayClass, eArrayType });
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

	public static final Object[] pattern_ArrayTypeToClass_2_3_findcontext_greenBBBBBBBBFFFFFFFFFFF(
			TypeToTAbstractType eTypeToTArrayClass, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType,
			Model eModel, TypeAccess eTypeAccess, TAbstractType tArrayClass, ArrayType eArrayType) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge eModelToTypeGraph__typeGraph____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTArrayClass__eType____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModel__eArrayType____orphanTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eArrayType__eTypeAccess____elementType = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eModelToTypeGraph__eModel____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge typeGraph__tArrayClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tArrayClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeAccess__eType____type = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eType__eTypeAccess____usagesInTypeAccess = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge eTypeToTArrayClass__tArrayClass____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String eModelToTypeGraph__typeGraph____target_name_prime = "target";
		String eTypeToTArrayClass__eType____source_name_prime = "source";
		String eModel__eArrayType____orphanTypes_name_prime = "orphanTypes";
		String eArrayType__eTypeAccess____elementType_name_prime = "elementType";
		String eModelToTypeGraph__eModel____source_name_prime = "source";
		String typeGraph__tArrayClass____ownedTypes_name_prime = "ownedTypes";
		String tArrayClass__typeGraph____pg_name_prime = "pg";
		String eTypeAccess__eType____type_name_prime = "type";
		String eType__eTypeAccess____usagesInTypeAccess_name_prime = "usagesInTypeAccess";
		String eTypeToTArrayClass__tArrayClass____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(eTypeToTArrayClass);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph);
		isApplicableMatch.getAllContextElements().add(typeGraph);
		isApplicableMatch.getAllContextElements().add(eType);
		isApplicableMatch.getAllContextElements().add(eModel);
		isApplicableMatch.getAllContextElements().add(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(tArrayClass);
		isApplicableMatch.getAllContextElements().add(eArrayType);
		eModelToTypeGraph__typeGraph____target.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__typeGraph____target.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__typeGraph____target);
		eTypeToTArrayClass__eType____source.setSrc(eTypeToTArrayClass);
		eTypeToTArrayClass__eType____source.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeToTArrayClass__eType____source);
		eModel__eArrayType____orphanTypes.setSrc(eModel);
		eModel__eArrayType____orphanTypes.setTrg(eArrayType);
		isApplicableMatch.getAllContextElements().add(eModel__eArrayType____orphanTypes);
		eArrayType__eTypeAccess____elementType.setSrc(eArrayType);
		eArrayType__eTypeAccess____elementType.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eArrayType__eTypeAccess____elementType);
		eModelToTypeGraph__eModel____source.setSrc(eModelToTypeGraph);
		eModelToTypeGraph__eModel____source.setTrg(eModel);
		isApplicableMatch.getAllContextElements().add(eModelToTypeGraph__eModel____source);
		typeGraph__tArrayClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tArrayClass____ownedTypes.setTrg(tArrayClass);
		isApplicableMatch.getAllContextElements().add(typeGraph__tArrayClass____ownedTypes);
		tArrayClass__typeGraph____pg.setSrc(tArrayClass);
		tArrayClass__typeGraph____pg.setTrg(typeGraph);
		isApplicableMatch.getAllContextElements().add(tArrayClass__typeGraph____pg);
		eTypeAccess__eType____type.setSrc(eTypeAccess);
		eTypeAccess__eType____type.setTrg(eType);
		isApplicableMatch.getAllContextElements().add(eTypeAccess__eType____type);
		eType__eTypeAccess____usagesInTypeAccess.setSrc(eType);
		eType__eTypeAccess____usagesInTypeAccess.setTrg(eTypeAccess);
		isApplicableMatch.getAllContextElements().add(eType__eTypeAccess____usagesInTypeAccess);
		eTypeToTArrayClass__tArrayClass____target.setSrc(eTypeToTArrayClass);
		eTypeToTArrayClass__tArrayClass____target.setTrg(tArrayClass);
		isApplicableMatch.getAllContextElements().add(eTypeToTArrayClass__tArrayClass____target);
		eModelToTypeGraph__typeGraph____target.setName(eModelToTypeGraph__typeGraph____target_name_prime);
		eTypeToTArrayClass__eType____source.setName(eTypeToTArrayClass__eType____source_name_prime);
		eModel__eArrayType____orphanTypes.setName(eModel__eArrayType____orphanTypes_name_prime);
		eArrayType__eTypeAccess____elementType.setName(eArrayType__eTypeAccess____elementType_name_prime);
		eModelToTypeGraph__eModel____source.setName(eModelToTypeGraph__eModel____source_name_prime);
		typeGraph__tArrayClass____ownedTypes.setName(typeGraph__tArrayClass____ownedTypes_name_prime);
		tArrayClass__typeGraph____pg.setName(tArrayClass__typeGraph____pg_name_prime);
		eTypeAccess__eType____type.setName(eTypeAccess__eType____type_name_prime);
		eType__eTypeAccess____usagesInTypeAccess.setName(eType__eTypeAccess____usagesInTypeAccess_name_prime);
		eTypeToTArrayClass__tArrayClass____target.setName(eTypeToTArrayClass__tArrayClass____target_name_prime);
		return new Object[] { eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, eTypeAccess, tArrayClass,
				eArrayType, isApplicableMatch, eModelToTypeGraph__typeGraph____target,
				eTypeToTArrayClass__eType____source, eModel__eArrayType____orphanTypes,
				eArrayType__eTypeAccess____elementType, eModelToTypeGraph__eModel____source,
				typeGraph__tArrayClass____ownedTypes, tArrayClass__typeGraph____pg, eTypeAccess__eType____type,
				eType__eTypeAccess____usagesInTypeAccess, eTypeToTArrayClass__tArrayClass____target };
	}

	public static final Object[] pattern_ArrayTypeToClass_2_4_solveCSP_bindingFBBBBBBBBBB(ArrayTypeToClass _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType eTypeToTArrayClass,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType, Model eModel, TypeAccess eTypeAccess,
			TAbstractType tArrayClass, ArrayType eArrayType) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, eTypeToTArrayClass, eModelToTypeGraph,
				typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eTypeToTArrayClass, eModelToTypeGraph, typeGraph,
					eType, eModel, eTypeAccess, tArrayClass, eArrayType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToClass_2_4_solveCSP_bindingAndBlackFBBBBBBBBBB(
			ArrayTypeToClass _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType eTypeToTArrayClass,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType, Model eModel, TypeAccess eTypeAccess,
			TAbstractType tArrayClass, ArrayType eArrayType) {
		Object[] result_pattern_ArrayTypeToClass_2_4_solveCSP_binding = pattern_ArrayTypeToClass_2_4_solveCSP_bindingFBBBBBBBBBB(
				_this, isApplicableMatch, eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, eTypeAccess,
				tArrayClass, eArrayType);
		if (result_pattern_ArrayTypeToClass_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToClass_2_4_solveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToClass_2_4_solveCSP_black = pattern_ArrayTypeToClass_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToClass_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eTypeToTArrayClass, eModelToTypeGraph, typeGraph,
						eType, eModel, eTypeAccess, tArrayClass, eArrayType };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_2_5_checkCSP_expressionFBB(ArrayTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_ArrayTypeToClass_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "ArrayTypeToClass";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayTypeToClass_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_10_1_initialbindings_blackBBBB(ArrayTypeToClass _this,
			Match match, TypeGraph typeGraph, TAbstractType tArrayClass) {
		return new Object[] { _this, match, typeGraph, tArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToClass_10_2_SolveCSP_bindingFBBBB(ArrayTypeToClass _this,
			Match match, TypeGraph typeGraph, TAbstractType tArrayClass) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, typeGraph, tArrayClass);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, typeGraph, tArrayClass };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToClass_10_2_SolveCSP_bindingAndBlackFBBBB(ArrayTypeToClass _this,
			Match match, TypeGraph typeGraph, TAbstractType tArrayClass) {
		Object[] result_pattern_ArrayTypeToClass_10_2_SolveCSP_binding = pattern_ArrayTypeToClass_10_2_SolveCSP_bindingFBBBB(
				_this, match, typeGraph, tArrayClass);
		if (result_pattern_ArrayTypeToClass_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToClass_10_2_SolveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToClass_10_2_SolveCSP_black = pattern_ArrayTypeToClass_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToClass_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, typeGraph, tArrayClass };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_10_3_CheckCSP_expressionFBB(ArrayTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_10_4_collectelementstobetranslated_blackBBB(Match match,
			TypeGraph typeGraph, TAbstractType tArrayClass) {
		return new Object[] { match, typeGraph, tArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToClass_10_5_collectcontextelements_blackBBB(Match match,
			TypeGraph typeGraph, TAbstractType tArrayClass) {
		return new Object[] { match, typeGraph, tArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToClass_10_5_collectcontextelements_greenBBBFF(Match match,
			TypeGraph typeGraph, TAbstractType tArrayClass) {
		EMoflonEdge typeGraph__tArrayClass____ownedTypes = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tArrayClass__typeGraph____pg = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(typeGraph);
		match.getContextNodes().add(tArrayClass);
		String typeGraph__tArrayClass____ownedTypes_name_prime = "ownedTypes";
		String tArrayClass__typeGraph____pg_name_prime = "pg";
		typeGraph__tArrayClass____ownedTypes.setSrc(typeGraph);
		typeGraph__tArrayClass____ownedTypes.setTrg(tArrayClass);
		match.getContextEdges().add(typeGraph__tArrayClass____ownedTypes);
		tArrayClass__typeGraph____pg.setSrc(tArrayClass);
		tArrayClass__typeGraph____pg.setTrg(typeGraph);
		match.getContextEdges().add(tArrayClass__typeGraph____pg);
		typeGraph__tArrayClass____ownedTypes.setName(typeGraph__tArrayClass____ownedTypes_name_prime);
		tArrayClass__typeGraph____pg.setName(tArrayClass__typeGraph____pg_name_prime);
		return new Object[] { match, typeGraph, tArrayClass, typeGraph__tArrayClass____ownedTypes,
				tArrayClass__typeGraph____pg };
	}

	public static final void pattern_ArrayTypeToClass_10_6_registerobjectstomatch_expressionBBBB(ArrayTypeToClass _this,
			Match match, TypeGraph typeGraph, TAbstractType tArrayClass) {
		_this.registerObjectsToMatch_BWD(match, typeGraph, tArrayClass);

	}

	public static final boolean pattern_ArrayTypeToClass_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToClass_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_17_1_preparereturnvalue_bindingFB(ArrayTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ArrayTypeToClass _this) {
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

	public static final Object[] pattern_ArrayTypeToClass_17_1_preparereturnvalue_bindingAndBlackFFBF(
			ArrayTypeToClass _this) {
		Object[] result_pattern_ArrayTypeToClass_17_1_preparereturnvalue_binding = pattern_ArrayTypeToClass_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToClass_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ArrayTypeToClass_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToClass_17_1_preparereturnvalue_black = pattern_ArrayTypeToClass_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ArrayTypeToClass_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ArrayTypeToClass_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ArrayTypeToClass_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_17_2_testcorematchandDECs_blackBF(
			TypeGraph typeGraph) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (TAbstractType tArrayClass : typeGraph.getOwnedTypes()) {
			_result.add(new Object[] { typeGraph, tArrayClass });
		}
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ArrayTypeToClass_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			ArrayTypeToClass _this, Match match, TypeGraph typeGraph, TAbstractType tArrayClass) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, typeGraph, tArrayClass);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToClass_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ArrayTypeToClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ArrayTypeToClass_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_1_preparereturnvalue_bindingFB(ArrayTypeToClass _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_1_preparereturnvalue_blackFBBF(EClass __eClass,
			ArrayTypeToClass _this) {
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

	public static final Object[] pattern_ArrayTypeToClass_18_1_preparereturnvalue_bindingAndBlackFFBF(
			ArrayTypeToClass _this) {
		Object[] result_pattern_ArrayTypeToClass_18_1_preparereturnvalue_binding = pattern_ArrayTypeToClass_18_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_ArrayTypeToClass_18_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_ArrayTypeToClass_18_1_preparereturnvalue_binding[0];

			Object[] result_pattern_ArrayTypeToClass_18_1_preparereturnvalue_black = pattern_ArrayTypeToClass_18_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_ArrayTypeToClass_18_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_ArrayTypeToClass_18_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_ArrayTypeToClass_18_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_0BB(
			TypeAccess eTypeAccess, Type eType) {
		for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_697942 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!eType.equals(__DEC_eTypeAccess_superInterfaces_697942)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_1B(
			TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_283672 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_2B(
			TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_935961 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_3BB(
			TypeAccess eTypeAccess, Type eType) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_875996 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eType.equals(__DEC_eTypeAccess_superClass_875996)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_4B(
			TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_529114 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_5BB(
			TypeAccess eTypeAccess, Type eType) {
		for (ParameterizedType __DEC_eTypeAccess_type_590553 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			if (!eType.equals(__DEC_eTypeAccess_type_590553)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_6B(
			TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_549521 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_7B(
			TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_404792 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_18_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_orphanTypes) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpEModel = _edge_orphanTypes.getSrc();
		if (tmpEModel instanceof Model) {
			Model eModel = (Model) tmpEModel;
			EObject tmpEArrayType = _edge_orphanTypes.getTrg();
			if (tmpEArrayType instanceof ArrayType) {
				ArrayType eArrayType = (ArrayType) tmpEArrayType;
				if (eModel.getOrphanTypes().contains(eArrayType)) {
					TypeAccess eTypeAccess = eArrayType.getElementType();
					if (eTypeAccess != null) {
						Type eType = eTypeAccess.getType();
						if (eType != null) {
							if (!eArrayType.equals(eType)) {
								if (pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_1B(
										eTypeAccess) == null) {
									if (pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_2B(
											eTypeAccess) == null) {
										if (pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_4B(
												eTypeAccess) == null) {
											if (pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_6B(
													eTypeAccess) == null) {
												if (pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_7B(
														eTypeAccess) == null) {
													if (pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_0BB(
															eTypeAccess, eType) == null) {
														if (pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_3BB(
																eTypeAccess, eType) == null) {
															if (pattern_ArrayTypeToClass_18_2_testcorematchandDECs_black_nac_5BB(
																	eTypeAccess, eType) == null) {
																_result.add(new Object[] { eType, eModel, eTypeAccess,
																		eArrayType, _edge_orphanTypes });
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_ArrayTypeToClass_18_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_ArrayTypeToClass_18_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			ArrayTypeToClass _this, Match match, Type eType, Model eModel, TypeAccess eTypeAccess,
			ArrayType eArrayType) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, eType, eModel, eTypeAccess, eArrayType);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToClass_18_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			ArrayTypeToClass _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_18_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_ArrayTypeToClass_18_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_21_1_prepare_blackB(ArrayTypeToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayTypeToClass_21_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_bindingFFFFFFBB(Match targetMatch,
			Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("typeGraph");
		EObject _localVariable_1 = sourceMatch.getObject("eType");
		EObject _localVariable_2 = sourceMatch.getObject("eModel");
		EObject _localVariable_3 = sourceMatch.getObject("eTypeAccess");
		EObject _localVariable_4 = targetMatch.getObject("tArrayClass");
		EObject _localVariable_5 = sourceMatch.getObject("eArrayType");
		EObject tmpTypeGraph = _localVariable_0;
		EObject tmpEType = _localVariable_1;
		EObject tmpEModel = _localVariable_2;
		EObject tmpETypeAccess = _localVariable_3;
		EObject tmpTArrayClass = _localVariable_4;
		EObject tmpEArrayType = _localVariable_5;
		if (tmpTypeGraph instanceof TypeGraph) {
			TypeGraph typeGraph = (TypeGraph) tmpTypeGraph;
			if (tmpEType instanceof Type) {
				Type eType = (Type) tmpEType;
				if (tmpEModel instanceof Model) {
					Model eModel = (Model) tmpEModel;
					if (tmpETypeAccess instanceof TypeAccess) {
						TypeAccess eTypeAccess = (TypeAccess) tmpETypeAccess;
						if (tmpTArrayClass instanceof TAbstractType) {
							TAbstractType tArrayClass = (TAbstractType) tmpTArrayClass;
							if (tmpEArrayType instanceof ArrayType) {
								ArrayType eArrayType = (ArrayType) tmpEArrayType;
								return new Object[] { typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_blackBBBBBBBB(TypeGraph typeGraph,
			Type eType, Model eModel, TypeAccess eTypeAccess, TAbstractType tArrayClass, ArrayType eArrayType,
			Match sourceMatch, Match targetMatch) {
		if (!eArrayType.equals(eType)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_binding = pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_binding != null) {
			TypeGraph typeGraph = (TypeGraph) result_pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_binding[0];
			Type eType = (Type) result_pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_binding[1];
			Model eModel = (Model) result_pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_binding[2];
			TypeAccess eTypeAccess = (TypeAccess) result_pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_binding[3];
			TAbstractType tArrayClass = (TAbstractType) result_pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_binding[4];
			ArrayType eArrayType = (ArrayType) result_pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_black = pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_blackBBBBBBBB(
					typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType, sourceMatch, targetMatch);
			if (result_pattern_ArrayTypeToClass_21_2_matchsrctrgcontext_black != null) {

				return new Object[] { typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_21_3_solvecsp_bindingFBBBBBBBBB(ArrayTypeToClass _this,
			TypeGraph typeGraph, Type eType, Model eModel, TypeAccess eTypeAccess, TAbstractType tArrayClass,
			ArrayType eArrayType, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(typeGraph, eType, eModel, eTypeAccess, tArrayClass,
				eArrayType, sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType,
					sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_21_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToClass_21_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			ArrayTypeToClass _this, TypeGraph typeGraph, Type eType, Model eModel, TypeAccess eTypeAccess,
			TAbstractType tArrayClass, ArrayType eArrayType, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_ArrayTypeToClass_21_3_solvecsp_binding = pattern_ArrayTypeToClass_21_3_solvecsp_bindingFBBBBBBBBB(
				_this, typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType, sourceMatch, targetMatch);
		if (result_pattern_ArrayTypeToClass_21_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToClass_21_3_solvecsp_binding[0];

			Object[] result_pattern_ArrayTypeToClass_21_3_solvecsp_black = pattern_ArrayTypeToClass_21_3_solvecsp_blackB(
					csp);
			if (result_pattern_ArrayTypeToClass_21_3_solvecsp_black != null) {

				return new Object[] { csp, _this, typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType,
						sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_21_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_21_5_matchcorrcontext_blackFFBBBBBB(
			TypeGraph typeGraph, Type eType, Model eModel, TAbstractType tArrayClass, Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(typeGraph, ModelToTypeGraph.class, "target")) {
				if (eModel.equals(eModelToTypeGraph.getSource())) {
					for (TypeToTAbstractType eTypeToTArrayClass : org.moflon.core.utilities.eMoflonEMFUtil
							.getOppositeReferenceTyped(eType, TypeToTAbstractType.class, "source")) {
						if (tArrayClass.equals(eTypeToTArrayClass.getTarget())) {
							_result.add(new Object[] { eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel,
									tArrayClass, sourceMatch, targetMatch });
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_21_5_matchcorrcontext_greenBBBBF(
			TypeToTAbstractType eTypeToTArrayClass, ModelToTypeGraph eModelToTypeGraph, Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "ArrayTypeToClass";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(eTypeToTArrayClass);
		ccMatch.getAllContextElements().add(eModelToTypeGraph);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { eTypeToTArrayClass, eModelToTypeGraph, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_ArrayTypeToClass_21_6_createcorrespondence_blackBBBBBBB(TypeGraph typeGraph,
			Type eType, Model eModel, TypeAccess eTypeAccess, TAbstractType tArrayClass, ArrayType eArrayType,
			CCMatch ccMatch) {
		if (!eArrayType.equals(eType)) {
			return new Object[] { typeGraph, eType, eModel, eTypeAccess, tArrayClass, eArrayType, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_21_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_ArrayTypeToClass_21_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "ArrayTypeToClass";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_ArrayTypeToClass_21_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_0BB(TypeAccess eTypeAccess,
			Type eType) {
		for (AbstractTypeDeclaration __DEC_eTypeAccess_superInterfaces_669913 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AbstractTypeDeclaration.class, "superInterfaces")) {
			if (!eType.equals(__DEC_eTypeAccess_superInterfaces_669913)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_1B(TypeAccess eTypeAccess) {
		for (Annotation __DEC_eTypeAccess_type_892036 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, Annotation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_2B(TypeAccess eTypeAccess) {
		for (ClassInstanceCreation __DEC_eTypeAccess_type_513157 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassInstanceCreation.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_3BB(TypeAccess eTypeAccess,
			Type eType) {
		for (ClassDeclaration __DEC_eTypeAccess_superClass_113904 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ClassDeclaration.class, "superClass")) {
			if (!eType.equals(__DEC_eTypeAccess_superClass_113904)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_4B(TypeAccess eTypeAccess) {
		for (MethodDeclaration __DEC_eTypeAccess_returnType_304045 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, MethodDeclaration.class, "returnType")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_5BB(TypeAccess eTypeAccess,
			Type eType) {
		for (ParameterizedType __DEC_eTypeAccess_type_339284 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, ParameterizedType.class, "type")) {
			if (!eType.equals(__DEC_eTypeAccess_type_339284)) {
				return new Object[] { eTypeAccess, eType };
			}
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_6B(TypeAccess eTypeAccess) {
		for (TypeLiteral __DEC_eTypeAccess_type_27366 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, TypeLiteral.class, "type")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_7B(TypeAccess eTypeAccess) {
		for (AnnotationMemberValuePair __DEC_eTypeAccess_value_739009 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(eTypeAccess, AnnotationMemberValuePair.class, "value")) {
			return new Object[] { eTypeAccess };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_24_1_matchtggpattern_blackBBBB(Type eType, Model eModel,
			TypeAccess eTypeAccess, ArrayType eArrayType) {
		if (!eArrayType.equals(eType)) {
			if (eModel.getOrphanTypes().contains(eArrayType)) {
				if (eTypeAccess.equals(eArrayType.getElementType())) {
					if (eType.equals(eTypeAccess.getType())) {
						if (pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_0BB(eTypeAccess, eType) == null) {
							if (pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_1B(eTypeAccess) == null) {
								if (pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_2B(eTypeAccess) == null) {
									if (pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_3BB(eTypeAccess,
											eType) == null) {
										if (pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_4B(
												eTypeAccess) == null) {
											if (pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_5BB(eTypeAccess,
													eType) == null) {
												if (pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_6B(
														eTypeAccess) == null) {
													if (pattern_ArrayTypeToClass_24_1_matchtggpattern_black_nac_7B(
															eTypeAccess) == null) {
														return new Object[] { eType, eModel, eTypeAccess, eArrayType };
													}
												}
											}
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

	public static final boolean pattern_ArrayTypeToClass_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToClass_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_25_1_matchtggpattern_blackBB(TypeGraph typeGraph,
			TAbstractType tArrayClass) {
		if (typeGraph.getOwnedTypes().contains(tArrayClass)) {
			return new Object[] { typeGraph, tArrayClass };
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_25_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_ArrayTypeToClass_25_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_26_1_createresult_blackB(ArrayTypeToClass _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_ArrayTypeToClass_26_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, TypeToTAbstractType eTypeToTArrayClass) {
		if (ruleResult.getCorrObjects().contains(eTypeToTArrayClass)) {
			return new Object[] { ruleResult, eTypeToTArrayClass };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, Type eType) {
		if (ruleResult.getSourceObjects().contains(eType)) {
			return new Object[] { ruleResult, eType };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, TAbstractType tArrayClass) {
		if (ruleResult.getTargetObjects().contains(tArrayClass)) {
			return new Object[] { ruleResult, tArrayClass };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_3BB(
			ModelgeneratorRuleResult ruleResult, TypeGraph typeGraph) {
		if (ruleResult.getTargetObjects().contains(typeGraph)) {
			return new Object[] { ruleResult, typeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_4BB(
			ModelgeneratorRuleResult ruleResult, ModelToTypeGraph eModelToTypeGraph) {
		if (ruleResult.getCorrObjects().contains(eModelToTypeGraph)) {
			return new Object[] { ruleResult, eModelToTypeGraph };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_5BB(
			ModelgeneratorRuleResult ruleResult, Model eModel) {
		if (ruleResult.getSourceObjects().contains(eModel)) {
			return new Object[] { ruleResult, eModel };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_ArrayTypeToClass_26_2_isapplicablecore_blackFFFFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList eTypeToTArrayClassList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpETypeToTArrayClass : eTypeToTArrayClassList.getEntryObjects()) {
				if (tmpETypeToTArrayClass instanceof TypeToTAbstractType) {
					TypeToTAbstractType eTypeToTArrayClass = (TypeToTAbstractType) tmpETypeToTArrayClass;
					Type eType = eTypeToTArrayClass.getSource();
					if (eType != null) {
						TAbstractType tArrayClass = eTypeToTArrayClass.getTarget();
						if (tArrayClass != null) {
							TypeGraph typeGraph = tArrayClass.getPg();
							if (typeGraph != null) {
								if (pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_0BB(ruleResult,
										eTypeToTArrayClass) == null) {
									if (pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_1BB(ruleResult,
											eType) == null) {
										if (pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_2BB(ruleResult,
												tArrayClass) == null) {
											if (pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_3BB(ruleResult,
													typeGraph) == null) {
												for (ModelToTypeGraph eModelToTypeGraph : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(typeGraph, ModelToTypeGraph.class,
																"target")) {
													Model eModel = eModelToTypeGraph.getSource();
													if (eModel != null) {
														if (pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_4BB(
																ruleResult, eModelToTypeGraph) == null) {
															if (pattern_ArrayTypeToClass_26_2_isapplicablecore_black_nac_5BB(
																	ruleResult, eModel) == null) {
																_result.add(new Object[] { eTypeToTArrayClassList,
																		eTypeToTArrayClass, eType, tArrayClass,
																		typeGraph, eModelToTypeGraph, eModel,
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
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_26_3_solveCSP_bindingFBBBBBBBBB(ArrayTypeToClass _this,
			IsApplicableMatch isApplicableMatch, TypeToTAbstractType eTypeToTArrayClass,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType, Model eModel,
			TAbstractType tArrayClass, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, eTypeToTArrayClass,
				eModelToTypeGraph, typeGraph, eType, eModel, tArrayClass, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, eTypeToTArrayClass, eModelToTypeGraph, typeGraph,
					eType, eModel, tArrayClass, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_ArrayTypeToClass_26_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_ArrayTypeToClass_26_3_solveCSP_bindingAndBlackFBBBBBBBBB(
			ArrayTypeToClass _this, IsApplicableMatch isApplicableMatch, TypeToTAbstractType eTypeToTArrayClass,
			ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType, Model eModel,
			TAbstractType tArrayClass, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_ArrayTypeToClass_26_3_solveCSP_binding = pattern_ArrayTypeToClass_26_3_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, tArrayClass,
				ruleResult);
		if (result_pattern_ArrayTypeToClass_26_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_ArrayTypeToClass_26_3_solveCSP_binding[0];

			Object[] result_pattern_ArrayTypeToClass_26_3_solveCSP_black = pattern_ArrayTypeToClass_26_3_solveCSP_blackB(
					csp);
			if (result_pattern_ArrayTypeToClass_26_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, eTypeToTArrayClass, eModelToTypeGraph, typeGraph,
						eType, eModel, tArrayClass, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_ArrayTypeToClass_26_4_checkCSP_expressionFBB(ArrayTypeToClass _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_ArrayTypeToClass_26_5_checknacs_blackBBBBBB(
			TypeToTAbstractType eTypeToTArrayClass, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType,
			Model eModel, TAbstractType tArrayClass) {
		return new Object[] { eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, tArrayClass };
	}

	public static final Object[] pattern_ArrayTypeToClass_26_6_perform_blackBBBBBBB(
			TypeToTAbstractType eTypeToTArrayClass, ModelToTypeGraph eModelToTypeGraph, TypeGraph typeGraph, Type eType,
			Model eModel, TAbstractType tArrayClass, ModelgeneratorRuleResult ruleResult) {
		return new Object[] { eTypeToTArrayClass, eModelToTypeGraph, typeGraph, eType, eModel, tArrayClass,
				ruleResult };
	}

	public static final Object[] pattern_ArrayTypeToClass_26_6_perform_greenBBFFB(Type eType, Model eModel,
			ModelgeneratorRuleResult ruleResult) {
		TypeAccess eTypeAccess = JavaFactory.eINSTANCE.createTypeAccess();
		ArrayType eArrayType = JavaFactory.eINSTANCE.createArrayType();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		eTypeAccess.setType(eType);
		ruleResult.getSourceObjects().add(eTypeAccess);
		eModel.getOrphanTypes().add(eArrayType);
		eArrayType.setElementType(eTypeAccess);
		ruleResult.getSourceObjects().add(eArrayType);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { eType, eModel, eTypeAccess, eArrayType, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_ArrayTypeToClass_26_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ArrayTypeToClassImpl
